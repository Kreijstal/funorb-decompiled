/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ws {
    static int[][][] field_c;
    static String[] field_a;
    static int[][] field_b;
    static int[][] field_d;
    static boolean field_f;
    static int field_e;

    final static void a(byte param0) {
        L0: {
          if (param0 <= -10) {
            break L0;
          } else {
            field_b = (int[][]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((vj.field_c ^ -1) == -11) {
              break L2;
            } else {
              if (!vr.d(1)) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          uc.g((byte) -54);
          vj.field_c = 11;
          break L1;
        }
        m.field_h = true;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_14_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (vt.a(param0, true)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var6 = ij.field_p;
                  var2 = var6;
                  if (param1 == 121) {
                    break L1;
                  } else {
                    ws.a(54);
                    break L1;
                  }
                }
                var3 = 0;
                L2: while (true) {
                  if (var6.length <= var3) {
                    var2 = tq.field_B;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2.length) {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 == param0) {
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L2;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "ws.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                return stackIn_25_0 != 0;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -25514) {
            field_d = (int[][]) null;
        }
        field_d = (int[][]) null;
        field_b = (int[][]) null;
        field_c = (int[][][]) null;
        field_a = null;
    }

    static {
        field_a = new String[]{"All scores", "My scores", "Best each"};
        field_f = true;
        field_d = new int[8][4];
        field_b = new int[8][4];
        field_c = new int[8][4][4];
        op.a(0, (byte) 126, "220,1014,676,1014,220,330,676,330");
        op.a(1, (byte) 126, "448,1044,448,672,230,300,666,300");
        op.a(2, (byte) 126, "448,994,448,450,190,350,706,350");
        op.a(3, (byte) 126, "160,944,736,944,448,400,448,994");
        op.a(4, (byte) 126, "240,1044,656,1044,448,300,448,672");
        op.a(5, (byte) 127, "250,894,646,1044,250,300,646,450");
        op.a(6, (byte) 127, "250,1044,646,824,250,520,646,300");
        op.a(7, (byte) 126, "448,1044,716,672,180,672,448,300");
        field_c[5] = new int[][]{new int[]{152, 768, 328, 440}, new int[]{416, 952, 288, 328}, new int[]{188, 128, 296, 360}, new int[]{480, 232, 268, 376}};
        field_c[1] = new int[][]{new int[]{352, 900, 184, 336}, new int[]{160, 540, 560, 344}, new int[]{168, 116, 328, 408}, new int[]{416, 44, 300, 488}};
        field_c[6] = new int[][]{new int[]{188, 996, 284, 320}, new int[]{400, 756, 356, 368}, new int[]{124, 420, 312, 344}, new int[]{444, 76, 252, 352}};
        field_c[3] = new int[][]{new int[]{112, 908, 280, 372}, new int[]{500, 868, 224, 412}, new int[]{276, 140, 312, 368}, new int[]{292, 956, 248, 374}};
        field_c[7] = new int[][]{new int[]{356, 944, 296, 320}, new int[]{488, 424, 328, 440}, new int[]{120, 496, 280, 360}, new int[]{344, 104, 288, 344}};
        field_c[2] = new int[][]{new int[]{256, 932, 384, 312}, new int[]{224, 76, 424, 656}, new int[]{108, 52, 340, 352}, new int[]{448, 68, 324, 416}};
        field_c[0] = new int[][]{new int[]{136, 876, 384, 344}, new int[]{400, 852, 316, 488}, new int[]{116, 76, 304, 432}, new int[]{368, 172, 396, 408}};
        field_c[4] = new int[][]{new int[]{208, 896, 296, 380}, new int[]{384, 944, 336, 368}, new int[]{296, 176, 252, 288}, new int[]{320, 416, 260, 400}};
        field_e = -1;
    }
}
