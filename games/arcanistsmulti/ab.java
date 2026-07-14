/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends wk {
    static boolean field_n;
    static String field_q;
    private int field_t;
    static kc field_p;
    static String field_r;
    private ug field_o;
    static String field_s;

    final static ho a(int param0, int param1, String param2) {
        ho var3 = null;
        var3 = new ho(false);
        var3.field_e = param2;
        var3.field_a = param1;
        if (param0 != 0) {
          ab.q(55);
          return var3;
        } else {
          return var3;
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 108) {
          ((ab) this).r(-49);
          var5 = 0;
          L0: while (true) {
            if (param3 <= var5) {
              return;
            } else {
              ((ab) this).field_g = ((ab) this).field_g + 1;
              param0[param2 + var5] = (byte)(((ab) this).field_j[((ab) this).field_g] + -((ab) this).field_o.a(false));
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
              ((ab) this).field_g = ((ab) this).field_g + 1;
              param0[param2 + var5] = (byte)(((ab) this).field_j[((ab) this).field_g] + -((ab) this).field_o.a(false));
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void q(int param0) {
        field_r = null;
        field_p = null;
        field_s = null;
        if (param0 != 21657) {
            field_s = null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    final void b(int param0, int[] param1) {
        int var3 = -46 / ((param0 - -16) / 57);
        ((ab) this).field_o = new ug(param1);
    }

    final void r(int param0) {
        if (param0 != 0) {
            return;
        }
        ((ab) this).field_g = (((ab) this).field_t - -7) / 8;
    }

    ab(int param0) {
        super(param0);
    }

    final void b(byte param0, int param1) {
        ((ab) this).field_g = ((ab) this).field_g + 1;
        ((ab) this).field_j[((ab) this).field_g] = (byte)(param1 + ((ab) this).field_o.a(false));
        if (param0 > -11) {
            ((ab) this).field_t = -103;
        }
    }

    final int g(byte param0) {
        int var2 = 124 / ((param0 - -69) / 45);
        ((ab) this).field_g = ((ab) this).field_g + 1;
        return 255 & ((ab) this).field_j[((ab) this).field_g] + -((ab) this).field_o.a(false);
    }

    final int d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = ((ab) this).field_t >> 2083359267;
        var4 = -(7 & ((ab) this).field_t) + 8;
        ((ab) this).field_t = ((ab) this).field_t + param1;
        var5 = 0;
        L0: while (true) {
          if (var4 >= param1) {
            L1: {
              if (var4 != param1) {
                var5 = var5 + (((ab) this).field_j[var3] >> -param1 + var4 & rg.field_d[param1]);
                break L1;
              } else {
                var5 = var5 + (rg.field_d[var4] & ((ab) this).field_j[var3]);
                break L1;
              }
            }
            if (param0 != 28089) {
              var7 = null;
              ho discarded$2 = ab.a(6, -10, (String) null);
              return var5;
            } else {
              return var5;
            }
          } else {
            var3++;
            var5 = var5 + ((((ab) this).field_j[var3] & rg.field_d[var4]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
            continue L0;
          }
        }
    }

    final void p(int param0) {
        ((ab) this).field_t = 8 * ((ab) this).field_g;
        if (param0 < 26) {
            int discarded$0 = ((ab) this).d(5, 58);
        }
    }

    ab(byte[] param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Previous";
        field_r = "Tips";
        field_s = "Firstly, you must learn how to look around the battlefield. Practise using the 'Arrow keys' to scroll around.";
    }
}
