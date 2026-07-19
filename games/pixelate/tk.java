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
        if (-1 > (this.field_o ^ -1)) {
            this.field_o = this.field_o - 1;
            return;
        }
        this.field_p = this.field_p + this.field_m;
        this.field_m = this.field_m + this.field_s;
        this.field_n = (int)(this.field_m * 10.0);
        if (!(this.field_n <= 31)) {
            this.field_n = 31;
        }
        if (!(this.field_m > 0.0)) {
            this.c(2779);
        }
        if (param0 != -123) {
            this.field_p = 0.4636507435645844;
        }
    }

    final void a(byte param0) {
        if (param0 >= -102) {
            this.e(55);
        }
        if (0 < this.field_o) {
            return;
        }
        int var2 = (int)this.field_p;
        fi.a(-var2 + this.field_r, -var2 + this.field_k, this.field_r + var2, this.field_k - var2, 7, this.field_n, rg.field_e.field_g[this.field_l]);
        fi.a(this.field_r - var2, var2 + this.field_k, var2 + this.field_r, this.field_k + var2, 7, this.field_n, rg.field_e.field_g[this.field_l]);
        fi.a(-var2 + this.field_r, this.field_k - var2, -var2 + this.field_r, this.field_k - -var2, 7, this.field_n, rg.field_e.field_g[this.field_l]);
        fi.a(this.field_r + var2, -var2 + this.field_k, this.field_r + var2, var2 + this.field_k, 7, this.field_n, rg.field_e.field_g[this.field_l]);
    }

    final static tf[] a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (!param2) {
            field_q = (String) null;
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
        tf[] discarded$0 = null;
        if (param0 != -104) {
            discarded$0 = tk.a(103, 85, false, -53);
        }
        return 0 <= param1 ? true : false;
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        if (param0 != 7) {
            discarded$0 = tk.a((byte) -48, 5);
        }
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
        this.field_o = param3;
        this.field_k = param1;
        this.field_p = 16.0;
        this.field_m = 3.0;
        this.field_r = param0;
        this.field_n = 31;
        this.field_s = -0.15;
        this.field_l = param2;
    }

    static {
        field_q = "Try changing the '<%0>' setting.";
    }
}
