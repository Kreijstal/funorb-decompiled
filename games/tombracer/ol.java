/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            Object var2 = null;
            boolean discarded$0 = ol.a((mu) null, false, (mu) null);
        }
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        var6 = tk.a(-22636);
        if (var6 == 0) {
          return 0;
        } else {
          L0: {
            var7 = param0 - param3 >> 1329198704;
            var8 = param4 + -param5 >> -101229168;
            var9 = (double)ua.a(var7, param2 + -29);
            var11 = (double)ua.a(var8, -102);
            var13 = Math.sqrt(var11 * var11 + var9 * var9);
            var15 = (int)((double)var6 - (double)var6 * (-64.0 + var13) / 704.0);
            if (768.0 <= var13) {
              var15 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var13 > 64.0) {
              break L1;
            } else {
              var15 = 255;
              break L1;
            }
          }
          var15 = za.a(0, (byte) 48, var6, var15);
          if (param2 != -91) {
            return 56;
          } else {
            var15 = var15 * to.field_n[param1] / var6;
            return var15;
          }
        }
    }

    final static boolean a(mu param0, boolean param1, mu param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = -param0.field_Db + param2.field_Db;
        if (param1) {
          L0: {
            if (param2.field_Cb != field_b) {
              if (null == param2.field_Cb) {
                // wide iinc 3 200
                break L0;
              } else {
                break L0;
              }
            } else {
              // wide iinc 3 -200
              break L0;
            }
          }
          if (param0.field_Cb != field_b) {
            if (param0.field_Cb != null) {
              L1: {
                if ((var3 ^ -1) >= -1) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L1;
                } else {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L1;
                }
              }
              return stackIn_20_0 != 0;
            } else {
              L2: {
                // wide iinc 3 -200
                if ((var3 ^ -1) >= -1) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L2;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            L3: {
              // wide iinc 3 200
              if ((var3 ^ -1) >= -1) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            return stackIn_11_0 != 0;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Online Race";
    }
}
