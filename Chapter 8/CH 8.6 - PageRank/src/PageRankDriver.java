﻿package CH8;

import CH8.GraphBuilder;
import CH8.PageRankIter;
import CH8.PageRankViewer;

public class PageRankDriver {
  private static int times = 10; // 设置迭代次数

  public static void main(String[] args) throws Exception {
    String[] forGB = { "", args[1] + "/Data0" };
    forGB[0] = args[0];
    GraphBuilder.main(forGB);

    String[] forItr = { "", "" };
    for (int i = 0; i < times; i++) {
      forItr[0] = args[1] + "/Data" + i;
      forItr[1] = args[1] + "/Data" + String.valueOf(i + 1);
      PageRankIter.main(forItr);
    }

    String[] forRV = { args[1] + "/Data" + times, args[1] + "/FinalRank" };
    PageRankViewer.main(forRV);
  }
}

