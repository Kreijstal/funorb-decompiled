/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends ka {
    static int field_w;
    static String field_v;
    static int field_t;
    static String field_x;
    private int field_s;
    private na field_u;

    public static void i(int param0) {
        field_x = null;
        int var1 = 85 % ((param0 - 44) / 60);
        field_v = null;
    }

    final int h(byte param0) {
        if (param0 != -9) {
          field_x = null;
          int fieldTemp$4 = ((ha) this).field_k;
          ((ha) this).field_k = ((ha) this).field_k + 1;
          return 255 & ((ha) this).field_r[fieldTemp$4] + -((ha) this).field_u.a(-609392408);
        } else {
          int fieldTemp$5 = ((ha) this).field_k;
          ((ha) this).field_k = ((ha) this).field_k + 1;
          return 255 & ((ha) this).field_r[fieldTemp$5] + -((ha) this).field_u.a(-609392408);
        }
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = stellarshard.field_B;
        if (!param1) {
          ((ha) this).field_u = null;
          var5 = 0;
          L0: while (true) {
            if (param3 <= var5) {
              return;
            } else {
              int fieldTemp$2 = ((ha) this).field_k;
              ((ha) this).field_k = ((ha) this).field_k + 1;
              param0[param2 + var5] = (byte)(((ha) this).field_r[fieldTemp$2] + -((ha) this).field_u.a(-609392408));
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = 0;
          L1: while (true) {
            if (param3 <= var5) {
              return;
            } else {
              int fieldTemp$3 = ((ha) this).field_k;
              ((ha) this).field_k = ((ha) this).field_k + 1;
              param0[param2 + var5] = (byte)(((ha) this).field_r[fieldTemp$3] + -((ha) this).field_u.a(-609392408));
              var5++;
              continue L1;
            }
          }
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = ((ha) this).field_k;
        ((ha) this).field_k = ((ha) this).field_k + 1;
        ((ha) this).field_r[fieldTemp$0] = (byte)(((ha) this).field_u.a(param1 + -609393358) + param0);
        if (param1 != 950) {
            ((ha) this).f(-75, 25);
        }
    }

    final void a(int[] param0, int param1) {
        if (param1 != -1001) {
          field_w = -27;
          ((ha) this).field_u = new na(param0);
          return;
        } else {
          ((ha) this).field_u = new na(param0);
          return;
        }
    }

    final static void a(java.math.BigInteger param0, ka param1, ka param2, int param3, java.math.BigInteger param4) {
        if (param3 >= -94) {
          int discarded$2 = ha.k(109);
          rl.a(-13791, param1, param0, param4, param2.field_r, param2.field_k, 0);
          return;
        } else {
          rl.a(-13791, param1, param0, param4, param2.field_r, param2.field_k, 0);
          return;
        }
    }

    final static int k(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = stellarshard.field_B;
        if (param0 == -1001) {
          var1 = 0;
          L0: while (true) {
            if (-1001 > var1) {
              if (null == hf.field_e[var1]) {
                return var1;
              } else {
                var1++;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          int discarded$5 = ha.k(28);
          var1 = 0;
          L1: while (true) {
            if (-1001 < var1) {
              if (null == hf.field_e[var1]) {
                return var1;
              } else {
                var1++;
                continue L1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    final int e(int param0, int param1) {
        int var6 = stellarshard.field_B;
        int var3 = ((ha) this).field_s >> 49071555;
        int var4 = -(((ha) this).field_s & 7) + param1;
        ((ha) this).field_s = ((ha) this).field_s + param0;
        int var5 = 0;
        while (param0 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((hd.field_d[var4] & ((ha) this).field_r[incrementValue$0]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 == var4) {
            var5 = var5 + (hd.field_d[var4] & ((ha) this).field_r[var3]);
        } else {
            var5 = var5 + (((ha) this).field_r[var3] >> var4 - param0 & hd.field_d[param0]);
        }
        return var5;
    }

    ha(byte[] param0) {
        super(param0);
    }

    final void g(byte param0) {
        int var2 = 47 % ((-50 - param0) / 57);
        ((ha) this).field_k = (((ha) this).field_s - -7) / 8;
    }

    ha(int param0) {
        super(param0);
    }

    final void j(int param0) {
        ((ha) this).field_s = param0 * ((ha) this).field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Phase shield";
        field_v = "Try again";
    }
}
