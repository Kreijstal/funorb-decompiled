/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static int[] field_f;
    static String[][] field_g;
    static String field_a;
    static String field_b;
    static String field_d;
    static String field_e;
    static ot[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_f = null;
        if (param0 == -72) {
          return;
        } else {
          ca.a((byte) -95);
          return;
        }
    }

    final static void a(int param0, int param1) {
        ml var2 = null;
        if (param0 != 3) {
          boolean discarded$2 = ca.a(false, 'F');
          var2 = or.field_d;
          var2.b(param1, (byte) 119);
          var2.a(124, 2);
          var2.a(param0 ^ 106, 4);
          var2.a(124, cq.a(1315216324));
          return;
        } else {
          var2 = or.field_d;
          var2.b(param1, (byte) 119);
          var2.a(124, 2);
          var2.a(param0 ^ 106, 4);
          var2.a(124, cq.a(1315216324));
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        var16 = Kickabout.field_G;
        if (param5 == 545806977) {
          L0: while (true) {
            param6--;
            if (0 <= param6) {
              var18 = param9;
              var17 = var18;
              var10 = var17;
              var11 = param2;
              var12 = param4;
              var13 = param8;
              var14 = param3;
              var15 = 8355711 & var18[var11] >> -321140191;
              var10[var11] = qj.b(var13 >> -1463486999, 65280) - -qj.b(var12 >> 545806977, 16711680) + qj.b(255, var14 >> -899486383) + var15;
              param8 = param8 + param1;
              param3 = param3 + param7;
              param2++;
              param4 = param4 + param0;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(vc param0, int param1) {
        Object var3 = null;
        np.field_Jb.a((gn) (Object) new hk(param0, 37), param1 ^ 252);
        if (param1 == 255) {
          return;
        } else {
          var3 = null;
          ca.a((vc) null, 5);
          return;
        }
    }

    final static boolean a(boolean param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (!param0) {
          if (param1 != 160) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{3, 4, 3, 4, 5, 3, 4, 3, 3, 4, 3, 3, 4, 3, 3, 4, 5, 4, 4, 3, 1};
        field_b = "Macroing or use of bots";
        field_e = "You have not yet unlocked this option for use.";
        field_d = "Auction Info";
        field_a = "park";
    }
}
