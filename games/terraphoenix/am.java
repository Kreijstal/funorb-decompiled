/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends gb implements n {
    private eb[] field_L;
    private rg field_G;
    static String field_H;
    static jj field_F;
    static int field_J;
    static nb field_K;
    private String[] field_I;

    am(rg param0) {
        super(0, 0, 0, 0, (cj) null);
        ((am) this).field_G = param0;
    }

    public static void f(byte param0) {
        field_F = null;
        int var1 = 77 / ((param0 - 7) / 33);
        field_H = null;
        field_K = null;
    }

    final static void a(fa param0, boolean param1, fa param2, fa param3, byte param4) {
        vc.field_a = gl.b("", 20);
        vc.field_a.a(false, param4 + 87);
        if (param4 != -22) {
            Object var6 = null;
            am.a((byte) 119, (java.awt.Canvas) null);
        }
        gi.a(param3, param2, param0, param4 + -2018);
        nd.c((byte) -11);
        qe.field_f = og.field_a;
        pe.field_a = og.field_a;
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((am) this).field_I.length) {
            L1: {
              if (((am) this).field_L[((am) this).field_I.length] != param0) {
                break L1;
              } else {
                ((am) this).field_G.a(50);
                break L1;
              }
            }
            var6 = 35 % ((-5 - param4) / 57);
            return;
          } else {
            if (((am) this).field_L[var6] == param0) {
              ((am) this).field_G.a(((am) this).field_I[var6], 72);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final static void g(byte param0) {
        int var4 = Terraphoenix.field_V;
        if (param0 != -3) {
            field_K = null;
        }
        int[] var5 = fc.field_e;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        hk.a((java.awt.Component) (Object) param1, (byte) 93);
        ei.a((java.awt.Component) (Object) param1, -24289);
        int var2 = -55 / ((param0 - -23) / 48);
        if (!(null == lk.field_d)) {
            lk.field_d.a(0, (java.awt.Component) (Object) param1);
        }
    }

    final void a(int param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        qh var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          ((am) this).field_C.c(21480);
          if (param1 == null) {
            break L0;
          } else {
            if (0 != param1.length) {
              var3 = param1.length;
              ((am) this).field_I = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= var3) {
                  L2: {
                    if (param0 == -11678) {
                      break L2;
                    } else {
                      field_F = null;
                      break L2;
                    }
                  }
                  var4 = new qh(qk.field_e, 0, 1);
                  ((am) this).field_L = new eb[var3 + 1];
                  var5 = 0;
                  L3: while (true) {
                    if (var3 <= var5) {
                      ((am) this).field_L[var3] = new eb(re.field_d, (sc) this);
                      ((am) this).field_L[var3].field_l = (cj) (Object) var4;
                      ((am) this).field_L[var3].a(var3 * 16 - -16 + 20, (byte) 127, 100, 0, 15);
                      ((am) this).b((byte) 95, (gl) (Object) ((am) this).field_L[var3]);
                      return;
                    } else {
                      ((am) this).field_L[var5] = new eb(((am) this).field_I[var5], (sc) this);
                      ((am) this).field_L[var5].field_l = (cj) (Object) var4;
                      ((am) this).field_L[var5].field_x = g.field_ab;
                      ((am) this).field_L[var5].a(16 * var5 + 20, (byte) 117, 80, 0, 15);
                      ((am) this).b((byte) 95, (gl) (Object) ((am) this).field_L[var5]);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((am) this).field_I[var4_int] = tj.a((CharSequence) (Object) param1[var4_int], sl.a(param0, -11664)).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((am) this).field_I = null;
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        if (!(!super.a(param0, param1, param2 ^ 0, param3))) {
            return true;
        }
        if (!(param3 != 98)) {
            return ((am) this).a(48, param1);
        }
        if (!(-100 != (param3 ^ -1))) {
            return ((am) this).a(param1, (byte) 86);
        }
        if (param2 != 30) {
            field_K = null;
            return false;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 > -106) {
            field_J = -26;
        }
        super.a(param0, -116, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        pk var5 = qk.field_e;
        if (null != ((am) this).field_I) {
            int discarded$0 = var5.a(tb.field_l, ((am) this).field_w + param0, ((am) this).field_u + param3, ((am) this).field_p, 20, 16777215, -1, 0, 0, var5.field_p + var5.field_s);
        }
    }

    final static boolean a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = Terraphoenix.field_V;
          if (param1) {
            break L0;
          } else {
            var5 = null;
            am.a((fa) null, false, (fa) null, (fa) null, (byte) 59);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (param0.length() <= var2) {
            return false;
          } else {
            var3 = param0.charAt(var2);
            if (!nd.a((char) var3, 127)) {
              if (!gb.a((byte) 41, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "    Blocking Terrain";
        field_K = null;
    }
}
