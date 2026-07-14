/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    private nb field_a;
    private nb field_b;

    final nb a(byte param0) {
        nb var2 = null;
        var2 = ((ra) this).field_b;
        if (var2 != ((ra) this).field_a) {
          if (param0 < 99) {
            nb discarded$2 = ((ra) this).a((byte) 86);
            ((ra) this).field_b = var2.field_i;
            return var2;
          } else {
            ((ra) this).field_b = var2.field_i;
            return var2;
          }
        } else {
          ((ra) this).field_b = null;
          return null;
        }
    }

    final nb a(int param0) {
        nb var2 = null;
        int var3 = 0;
        var2 = ((ra) this).field_a.field_i;
        if (var2 == ((ra) this).field_a) {
          return null;
        } else {
          var2.c((byte) -50);
          var3 = 111 / ((38 - param0) / 57);
          return var2;
        }
    }

    final void a(nb param0, byte param1) {
        L0: {
          if (null != param0.field_h) {
            param0.c((byte) -58);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_h = ((ra) this).field_a.field_h;
        param0.field_i = ((ra) this).field_a;
        param0.field_h.field_i = param0;
        if (param1 > -89) {
          ((ra) this).field_a = null;
          param0.field_i.field_h = param0;
          return;
        } else {
          param0.field_i.field_h = param0;
          return;
        }
    }

    final static int a(CharSequence param0, int param1) {
        int var2 = 43 % ((param1 - 48) / 58);
        return tf.a(true, 5, param0, 10);
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        df var4_ref_df = null;
        int var4 = 0;
        ep var5 = null;
        int var5_int = 0;
        Object var6 = null;
        int var7 = 0;
        am var9 = null;
        byte[] var13 = null;
        var7 = ZombieDawn.field_J;
        var2 = 42 / ((-82 - param0) / 32);
        var9 = fj.field_g;
        var3 = var9.d((byte) -118);
        if (0 != var3) {
          if (1 == var3) {
            var4 = var9.c(-105);
            var5 = (ep) (Object) uk.field_a.b((byte) 26);
            L0: while (true) {
              if (var5 == null) {
                if (var5 == null) {
                  p.a(1);
                  return;
                } else {
                  var5.b(-27598);
                  return;
                }
              } else {
                if (var4 != var5.field_k) {
                  var5 = (ep) (Object) uk.field_a.a(false);
                  continue L0;
                } else {
                  if (var5 == null) {
                    p.a(1);
                    return;
                  } else {
                    var5.b(-27598);
                    return;
                  }
                }
              }
            }
          } else {
            ae.a((Throwable) null, 10331, "A1: " + cb.f(3));
            p.a(1);
            return;
          }
        } else {
          var4_ref_df = (df) (Object) jj.field_D.b((byte) 26);
          if (var4_ref_df != null) {
            L1: {
              var5_int = var9.d((byte) -122);
              if (-1 != (var5_int ^ -1)) {
                var13 = new byte[var5_int];
                var9.a(var5_int, 0, var13, 11240);
                break L1;
              } else {
                var6 = null;
                break L1;
              }
            }
            var9.field_j = var9.field_j + 4;
            if (!var9.g((byte) -98)) {
              p.a(1);
              return;
            } else {
              var4_ref_df.field_k = true;
              var4_ref_df.b(-27598);
              return;
            }
          } else {
            p.a(1);
            return;
          }
        }
    }

    final int a(boolean param0) {
        int var2 = 0;
        nb var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        var2 = 0;
        var3 = ((ra) this).field_a.field_i;
        if (!param0) {
          L0: while (true) {
            if (((ra) this).field_a == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_i;
              continue L0;
            }
          }
        } else {
          String discarded$1 = ra.e((byte) 21);
          L1: while (true) {
            if (((ra) this).field_a == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_i;
              continue L1;
            }
          }
        }
    }

    final static void d(byte param0) {
        int var1 = 118 / ((-2 - param0) / 33);
        mg.a(false);
    }

    final static lp a(dj param0, String param1, String param2, int param3, dj param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param4.a(param1, (byte) 8);
        if (param3 != 0) {
          return null;
        } else {
          var6 = param4.a(var5, param2, true);
          return oj.a(var6, param0, var5, param4, param3 + 0);
        }
    }

    public ra() {
        ((ra) this).field_a = new nb();
        ((ra) this).field_a.field_i = ((ra) this).field_a;
        ((ra) this).field_a.field_h = ((ra) this).field_a;
    }

    final void b(int param0) {
        int var3 = 0;
        nb var4 = null;
        nb var5 = null;
        var3 = ZombieDawn.field_J;
        if (param0 >= 37) {
          L0: while (true) {
            var4 = ((ra) this).field_a.field_i;
            if (((ra) this).field_a == var4) {
              ((ra) this).field_b = null;
              return;
            } else {
              var4.c((byte) -122);
              continue L0;
            }
          }
        } else {
          ((ra) this).field_b = null;
          L1: while (true) {
            var5 = ((ra) this).field_a.field_i;
            if (((ra) this).field_a == var5) {
              ((ra) this).field_b = null;
              return;
            } else {
              var5.c((byte) -122);
              continue L1;
            }
          }
        }
    }

    final nb c(byte param0) {
        nb var2 = ((ra) this).field_a.field_i;
        if (param0 != 34) {
            ((ra) this).field_a = null;
            if (!(((ra) this).field_a != var2)) {
                ((ra) this).field_b = null;
                return null;
            }
            ((ra) this).field_b = var2.field_i;
            return var2;
        }
        if (!(((ra) this).field_a != var2)) {
            ((ra) this).field_b = null;
            return null;
        }
        ((ra) this).field_b = var2.field_i;
        return var2;
    }

    final static String e(byte param0) {
        if (fk.field_F != vh.field_c) {
          if (!gl.field_E.a(112)) {
            return gl.field_E.c(0);
          } else {
            if (tk.field_a == vh.field_c) {
              return gl.field_E.c(0);
            } else {
              if (param0 >= -12) {
                String discarded$2 = ra.e((byte) 66);
                return m.field_B;
              } else {
                return m.field_B;
              }
            }
          }
        } else {
          return to.field_d;
        }
    }

    static {
    }
}
