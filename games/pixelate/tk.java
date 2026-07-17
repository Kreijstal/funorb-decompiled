/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends fa {
    private int field_k;
    private int field_l;
    private int field_r;
    static String field_q;
    private double field_m;
    private int field_n;
    private int field_o;
    private double field_s;
    private double field_p;

    final void e(int param0) {
        if (((tk) this).field_o > 0) {
            ((tk) this).field_o = ((tk) this).field_o - 1;
            return;
        }
        ((tk) this).field_p = ((tk) this).field_p + ((tk) this).field_m;
        ((tk) this).field_m = ((tk) this).field_m + ((tk) this).field_s;
        ((tk) this).field_n = (int)(((tk) this).field_m * 10.0);
        if (!(((tk) this).field_n <= 31)) {
            ((tk) this).field_n = 31;
        }
        if (!(((tk) this).field_m > 0.0)) {
            ((tk) this).c(2779);
        }
        if (param0 != -123) {
            ((tk) this).field_p = 0.4636507435645844;
        }
    }

    final void a(byte param0) {
        if (param0 >= -102) {
            ((tk) this).e(55);
        }
        if (0 < ((tk) this).field_o) {
            return;
        }
        int var2 = (int)((tk) this).field_p;
        fi.a(-var2 + ((tk) this).field_r, -var2 + ((tk) this).field_k, ((tk) this).field_r + var2, ((tk) this).field_k - var2, 7, ((tk) this).field_n, rg.field_e.field_g[((tk) this).field_l]);
        fi.a(((tk) this).field_r - var2, var2 + ((tk) this).field_k, var2 + ((tk) this).field_r, ((tk) this).field_k + var2, 7, ((tk) this).field_n, rg.field_e.field_g[((tk) this).field_l]);
        fi.a(-var2 + ((tk) this).field_r, ((tk) this).field_k - var2, -var2 + ((tk) this).field_r, ((tk) this).field_k - -var2, 7, ((tk) this).field_n, rg.field_e.field_g[((tk) this).field_l]);
        fi.a(((tk) this).field_r + var2, -var2 + ((tk) this).field_k, ((tk) this).field_r + var2, var2 + ((tk) this).field_k, 7, ((tk) this).field_n, rg.field_e.field_g[((tk) this).field_l]);
    }

    final static tf[] a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (!param2) {
            field_q = null;
        }
        tf[] var7 = new tf[9];
        tf[] var4 = var7;
        var7[0] = cl.a(param0, param1, (byte) -87);
        for (var5 = 1; var5 < 9; var5++) {
            var7[var5] = var7[0];
        }
        var4[4] = cl.a(64, param3, (byte) -53);
        return var4;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != -104) {
            tf[] discarded$0 = tk.a(103, 85, false, -53);
        }
        return 0 <= param1 ? true : false;
    }

    public static void a(int param0) {
        field_q = null;
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param0 == -66) {
          L0: {
            L1: {
              L2: {
                if (param1 < 65) {
                  break L2;
                } else {
                  if (90 >= param1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 97) {
                  break L3;
                } else {
                  if (param1 > 122) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L0;
          }
          return stackIn_10_0 != 0;
        } else {
          return true;
        }
    }

    tk(int param0, int param1, int param2, int param3) {
        ((tk) this).field_o = param3;
        ((tk) this).field_k = param1;
        ((tk) this).field_p = 16.0;
        ((tk) this).field_m = 3.0;
        ((tk) this).field_r = param0;
        ((tk) this).field_n = 31;
        ((tk) this).field_s = -0.15;
        ((tk) this).field_l = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Try changing the '<%0>' setting.";
    }
}
