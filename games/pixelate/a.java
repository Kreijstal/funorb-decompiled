/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends ch implements vo {
    static pf field_I;
    private pn field_K;
    static java.awt.Font field_L;
    static int[] field_N;
    private String[] field_Q;
    static String field_J;
    static pi field_O;
    private qm[] field_P;
    static String field_M;

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((a) this).field_Q.length) {
            L1: {
              if (((a) this).field_P[((a) this).field_Q.length] != param0) {
                break L1;
              } else {
                ((a) this).field_K.a((byte) 41);
                break L1;
              }
            }
            L2: {
              if (param2 == 11) {
                break L2;
              } else {
                ((a) this).field_Q = null;
                break L2;
              }
            }
            return;
          } else {
            if (((a) this).field_P[var6] == param0) {
              ((a) this).field_K.a(((a) this).field_Q[var6], (byte) -104);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 16) {
            a.a(true, -63);
        }
        field_M = null;
        field_N = null;
        field_L = null;
        field_I = null;
        field_J = null;
        field_O = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -79);
        if (param1 != 0) {
            return;
        }
        int var5 = 118 / ((param3 - 70) / 49);
        jl var6 = he.field_d;
        if (null != ((a) this).field_Q) {
            int discarded$0 = var6.a(ok.field_c, param2 + ((a) this).field_z, param0 - -((a) this).field_p, ((a) this).field_E, 20, 16777215, -1, 0, 0, var6.field_w + var6.field_z);
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (98 == param0) {
            return ((a) this).a(0, param2);
        }
        if (-100 != (param0 ^ -1)) {
            return false;
        }
        return ((a) this).b(10, param2);
    }

    final static void a(boolean param0, int param1) {
        if (!(null == ri.field_f)) {
            if (ri.field_f.b(-85, param0)) {
                ri.field_f = null;
            }
        }
        if (param1 <= 56) {
            field_O = null;
        }
    }

    final static void a(byte param0, int param1) {
        int discarded$3 = jg.l(84);
        if (param0 >= -103) {
            field_M = null;
        }
    }

    final void a(byte param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        ia var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          ((a) this).field_F.e(81);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length != 0) {
              if (param0 < -83) {
                var3 = param1.length;
                ((a) this).field_Q = new String[var3];
                var4_int = 0;
                L1: while (true) {
                  if (var3 <= var4_int) {
                    var4 = new ia(he.field_d, 0, 1);
                    ((a) this).field_P = new qm[1 + var3];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var3) {
                        ((a) this).field_P[var3] = new qm(d.field_d, (fn) this);
                        ((a) this).field_P[var3].field_y = (eb) (Object) var4;
                        ((a) this).field_P[var3].a(100, (byte) 102, 16 + (16 * var3 + 20), 0, 15);
                        ((a) this).b((ng) (Object) ((a) this).field_P[var3], 80);
                        return;
                      } else {
                        ((a) this).field_P[var5] = new qm(((a) this).field_Q[var5], (fn) this);
                        ((a) this).field_P[var5].field_y = (eb) (Object) var4;
                        ((a) this).field_P[var5].field_l = io.field_a;
                        ((a) this).field_P[var5].a(80, (byte) 63, 20 + 16 * var5, 0, 15);
                        ((a) this).b((ng) (Object) ((a) this).field_P[var5], 80);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    ((a) this).field_Q[var4_int] = ng.a((CharSequence) (Object) param1[var4_int], -1).replace(' ', ' ');
                    var4_int++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        ((a) this).field_Q = null;
    }

    final static void l(int param0) {
        Object var2 = null;
        al.a(nk.field_b, -116, (String) null);
        if (param0 != 20700) {
            a.a((byte) -98, -12);
        }
    }

    a(pn param0) {
        super(0, 0, 0, 0, (eb) null);
        ((a) this).field_K = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new int[4];
        field_J = "Friends";
        field_M = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
