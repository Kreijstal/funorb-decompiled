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
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (vj.field_c == 10) {
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
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (vt.a(param0, true)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var6 = ij.field_p;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = tq.field_B;
                    var3 = 0;
                    L2: while (true) {
                      if (var3 >= var2.length) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 == param0) {
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0 != 0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "ws.C(" + param0 + ',' + 121 + ')');
        }
        return stackIn_23_0 != 0;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
        field_c[5] = new int[4][];
        field_c[1] = new int[4][];
        field_c[6] = new int[4][];
        field_c[3] = new int[4][];
        field_c[7] = new int[4][];
        field_c[2] = new int[4][];
        field_c[0] = new int[4][];
        field_c[4] = new int[4][];
        field_e = -1;
    }
}
