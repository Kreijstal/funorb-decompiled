/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ms extends tc {
    static String field_m;
    ms field_l;
    static int field_t;
    static boolean field_o;
    long field_q;
    static je field_k;
    ms field_s;
    static int field_r;
    static String field_n;
    static String field_p;

    final boolean a(byte param0) {
        if (!(((ms) this).field_l != null)) {
            return false;
        }
        int var2 = 106 / ((10 - param0) / 60);
        return true;
    }

    final void c(byte param0) {
        if (((ms) this).field_l == null) {
          return;
        } else {
          ((ms) this).field_l.field_s = ((ms) this).field_s;
          ((ms) this).field_s.field_l = ((ms) this).field_l;
          if (param0 != -76) {
            ((ms) this).a(true, -70L);
            ((ms) this).field_s = null;
            ((ms) this).field_l = null;
            return;
          } else {
            ((ms) this).field_s = null;
            ((ms) this).field_l = null;
            return;
          }
        }
    }

    final static int a(int param0, og[] param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (-1 + param1.length <= var3) {
            if (param2 >= -81) {
              return -74;
            } else {
              return -1 + param1.length;
            }
          } else {
            if (param0 + -1 >= param1[1 + var3].field_s) {
              var3++;
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    public static void f(int param0) {
        if (param0 != -1) {
            return;
        }
        field_n = null;
        field_p = null;
        field_k = null;
        field_m = null;
    }

    final long a(int param0) {
        if (param0 < 101) {
            field_o = true;
            return ((ms) this).field_q;
        }
        return ((ms) this).field_q;
    }

    final void a(boolean param0, long param1) {
        if (((ms) this).field_l == null) {
          if (!param0) {
            ((ms) this).field_l = null;
            ((ms) this).field_q = param1;
            return;
          } else {
            ((ms) this).field_q = param1;
            return;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= 111) {
          ac.field_n = false;
          aw.field_h = null;
          if (!fh.field_i) {
            var1 = vt.field_n;
            if (var1 > 0) {
              if (1 != var1) {
                aw.field_h = fo.a(4800, lw.field_nb, new String[1]);
                aw.field_h = pj.a(593277313, new CharSequence[3]);
                qc.field_a.b(true);
                qf.a(56);
                return;
              } else {
                aw.field_h = hh.field_a;
                aw.field_h = pj.a(593277313, new CharSequence[3]);
                qc.field_a.b(true);
                qf.a(56);
                return;
              }
            } else {
              qc.field_a.b(true);
              qf.a(56);
              return;
            }
          } else {
            qc.field_a.o(4259);
            return;
          }
        } else {
          ms.e(75);
          ac.field_n = false;
          aw.field_h = null;
          if (!fh.field_i) {
            var1 = vt.field_n;
            if (var1 > 0) {
              if (1 != var1) {
                aw.field_h = fo.a(4800, lw.field_nb, new String[1]);
                aw.field_h = pj.a(593277313, new CharSequence[3]);
                qc.field_a.b(true);
                qf.a(56);
                return;
              } else {
                aw.field_h = hh.field_a;
                aw.field_h = pj.a(593277313, new CharSequence[3]);
                qc.field_a.b(true);
                qf.a(56);
                return;
              }
            } else {
              qc.field_a.b(true);
              qf.a(56);
              return;
            }
          } else {
            qc.field_a.o(4259);
            return;
          }
        }
    }

    protected ms() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Aerial";
        field_p = "Camouflage";
        field_m = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
