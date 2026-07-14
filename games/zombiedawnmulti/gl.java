/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends se implements in {
    private gn[] field_I;
    static String field_K;
    static hh field_H;
    private String[] field_G;
    static cd field_L;
    private jn field_J;

    final static void b(boolean param0, int param1) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        hp var4 = (hp) (Object) mh.field_l.c(108);
        while (var4 != null) {
            tk.a(var4, 58, param1);
            var4 = (hp) (Object) mh.field_l.b(6);
        }
        if (!param0) {
            gl.c(false);
        }
        u var5 = (u) (Object) cp.field_T.c(59);
        while (var5 != null) {
            o.a(var5, param1, -85);
            var5 = (u) (Object) cp.field_T.b(6);
        }
    }

    gl(jn param0) {
        super(0, 0, 0, 0, (nl) null);
        ((gl) this).field_J = param0;
    }

    final void a(byte param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        he var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -112) {
            break L0;
          } else {
            ((gl) this).field_G = null;
            break L0;
          }
        }
        L1: {
          ((gl) this).field_B.e(-30986);
          if (param1 == null) {
            break L1;
          } else {
            if (-1 != (param1.length ^ -1)) {
              var3 = param1.length;
              ((gl) this).field_G = new String[var3];
              var4_int = 0;
              L2: while (true) {
                if (var3 <= var4_int) {
                  var4 = new he(ke.field_h, 0, 1);
                  ((gl) this).field_I = new gn[var3 - -1];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var3) {
                      ((gl) this).field_I[var3] = new gn(al.field_ab, (bj) this);
                      ((gl) this).field_I[var3].field_h = (nl) (Object) var4;
                      ((gl) this).field_I[var3].b(0, 16 * var3 + 16 + 20, 28972, 100, 15);
                      ((gl) this).b((byte) 55, (cf) (Object) ((gl) this).field_I[var3]);
                      return;
                    } else {
                      ((gl) this).field_I[var5] = new gn(((gl) this).field_G[var5], (bj) this);
                      ((gl) this).field_I[var5].field_h = (nl) (Object) var4;
                      ((gl) this).field_I[var5].field_x = wd.field_I;
                      ((gl) this).field_I[var5].b(0, 20 - -(var5 * 16), 28972, 80, 15);
                      ((gl) this).b((byte) 94, (cf) (Object) ((gl) this).field_I[var5]);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((gl) this).field_G[var4_int] = ld.a((byte) 0, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
        }
        ((gl) this).field_G = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0 ^ 0, param1, param2, param3);
        if (0 != param2) {
            return;
        }
        if (param0 != -2) {
            return;
        }
        fm var5 = ke.field_h;
        if (null != ((gl) this).field_G) {
            int discarded$0 = var5.a(pi.field_g, param3 - -((gl) this).field_y, param1 + ((gl) this).field_i, ((gl) this).field_n, 20, 16777215, -1, 0, 0, var5.field_r + var5.field_C);
        }
    }

    final static ja a(int param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var1 = oq.field_w[0] * vj.field_p[0];
        byte[] var2 = qp.field_t[0];
        int[] var3 = new int[var1];
        int var4_int = 0;
        if (param0 != 15) {
            field_K = null;
        }
        while (var1 > var4_int) {
            var3[var4_int] = tp.field_t[tq.b(255, (int) var2[var4_int])];
            var4_int++;
        }
        ja var4 = new ja(ie.field_nb, hj.field_a, k.field_i[0], qj.field_o[0], oq.field_w[0], vj.field_p[0], var3);
        fd.h((byte) 126);
        return var4;
    }

    public static void c(boolean param0) {
        if (!param0) {
            gl.b(true, -119);
        }
        field_H = null;
        field_L = null;
        field_K = null;
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!(-99 != (param0 ^ -1))) {
            return ((gl) this).a((byte) -1, param2);
        }
        if (param0 == 99) {
            return ((gl) this).a(99, param2);
        }
        return false;
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param3 <= -83) {
            break L0;
          } else {
            var8 = null;
            boolean discarded$2 = ((gl) this).a(-106, '￘', (cf) null, 49);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (((gl) this).field_G.length <= var6) {
            L2: {
              if (((gl) this).field_I[((gl) this).field_G.length] == param2) {
                ((gl) this).field_J.a(496);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            if (param2 == ((gl) this).field_I[var6]) {
              ((gl) this).field_J.a(((gl) this).field_G[var6], 1);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "All players have left <%0>'s game.";
    }
}
