/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en extends vi {
    static bd field_q;
    private gi field_r;
    static String field_v;
    private int field_x;
    static bd field_y;
    static bd field_t;
    static ji field_u;
    static int field_s;
    static String field_z;
    static bd field_w;

    final static bd[] h(int param0, int param1) {
        bd[] var2 = null;
        bd[] var3 = null;
        var3 = new bd[9];
        var2 = var3;
        var3[4] = el.a(-106, 64, param1);
        if (param0 >= -7) {
          en.r(117);
          return var2;
        } else {
          return var2;
        }
    }

    en(byte[] param0) {
        super(param0);
    }

    en(int param0) {
        super(param0);
    }

    final void a(int[] param0, int param1) {
        if (param1 != 8) {
          ((en) this).c(true);
          ((en) this).field_r = new gi(param0);
          return;
        } else {
          ((en) this).field_r = new gi(param0);
          return;
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var3 = ((en) this).field_x >> -1480227389;
        if (param1) {
          var4 = -(7 & ((en) this).field_x) + 8;
          ((en) this).field_x = ((en) this).field_x + param0;
          var5 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              L1: {
                if (param0 != var4) {
                  var5 = var5 + (((en) this).field_n[var3] >> -param0 + var4 & pf.field_j[param0]);
                  break L1;
                } else {
                  var5 = var5 + (pf.field_j[var4] & ((en) this).field_n[var3]);
                  break L1;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((((en) this).field_n[var3] & pf.field_j[var4]) << -var4 + param0);
              param0 = param0 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          field_z = null;
          var4 = -(7 & ((en) this).field_x) + 8;
          ((en) this).field_x = ((en) this).field_x + param0;
          var5 = 0;
          L2: while (true) {
            if (var4 >= param0) {
              L3: {
                if (param0 != var4) {
                  var5 = var5 + (((en) this).field_n[var3] >> -param0 + var4 & pf.field_j[param0]);
                  break L3;
                } else {
                  var5 = var5 + (pf.field_j[var4] & ((en) this).field_n[var3]);
                  break L3;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((((en) this).field_n[var3] & pf.field_j[var4]) << -var4 + param0);
              param0 = param0 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void c(boolean param0) {
        Object var3 = null;
        if (param0) {
          var3 = null;
          ((en) this).a(0, 102, (byte[]) null, (byte) 55);
          ((en) this).field_x = 8 * ((en) this).field_i;
          return;
        } else {
          ((en) this).field_x = 8 * ((en) this).field_i;
          return;
        }
    }

    public static void r(int param0) {
        if (param0 != -10723) {
          return;
        } else {
          field_z = null;
          field_w = null;
          field_u = null;
          field_v = null;
          field_y = null;
          field_q = null;
          field_t = null;
          return;
        }
    }

    final void q(int param0) {
        int var2 = -24 % ((55 - param0) / 40);
        ((en) this).field_i = (((en) this).field_x - -7) / 8;
    }

    final int p(int param0) {
        if (param0 != 64) {
          return 42;
        } else {
          ((en) this).field_i = ((en) this).field_i + 1;
          return ((en) this).field_n[((en) this).field_i] + -((en) this).field_r.a(true) & 255;
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var5 = 0;
        if (param3 <= 66) {
          ((en) this).field_r = null;
          L0: while (true) {
            if (param1 > var5) {
              ((en) this).field_i = ((en) this).field_i + 1;
              param2[var5 + param0] = (byte)(((en) this).field_n[((en) this).field_i] + -((en) this).field_r.a(true));
              var5++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (param1 > var5) {
              ((en) this).field_i = ((en) this).field_i + 1;
              param2[var5 + param0] = (byte)(((en) this).field_n[((en) this).field_i] + -((en) this).field_r.a(true));
              var5++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void i(int param0, int param1) {
        ((en) this).field_i = ((en) this).field_i + 1;
        ((en) this).field_n[((en) this).field_i] = (byte)(((en) this).field_r.a(true) + param1);
        if (param0 == 19319) {
          return;
        } else {
          ((en) this).field_x = -13;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Destroy the spawn queen.";
        field_y = new bd(8, 13);
        kf.a(field_y.field_D, 0, 64, 8421376);
        field_q = new bd(8, 13);
        kf.a(field_q.field_D, 0, 64, 16776960);
        field_t = new bd(8, 13);
        kf.a(field_t.field_D, 0, 64, 65793);
        field_z = "Please check if address is correct";
    }
}
