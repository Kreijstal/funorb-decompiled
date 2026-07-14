/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr {
    private ed field_d;
    private java.math.BigInteger field_i;
    private uk[] field_b;
    private t field_a;
    static jj field_g;
    private ia field_e;
    private tk field_f;
    static byte[] field_c;
    private java.math.BigInteger field_h;

    public static void c(int param0) {
        field_c = null;
        if (param0 != 5) {
            Object var2 = null;
            kr.a((String) null, (byte) 54);
        }
        field_g = null;
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (((kr) this).field_b == null) {
          return;
        } else {
          if (param0 > 33) {
            var2 = 0;
            L0: while (true) {
              if (((kr) this).field_b.length <= var2) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (var4 >= ((kr) this).field_b.length) {
                    return;
                  } else {
                    if (null != ((kr) this).field_b[var4]) {
                      ((kr) this).field_b[var4].b(104);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (((kr) this).field_b[var2] != null) {
                  ((kr) this).field_b[var2].c((byte) -94);
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final uk a(int param0, qh param1, boolean param2, int param3, qh param4) {
        int var6 = 0;
        int var7 = 0;
        uk var9 = null;
        byte[] var11 = null;
        if (null == ((kr) this).field_d) {
          throw new RuntimeException();
        } else {
          L0: {
            if ((param3 ^ -1) > -1) {
              break L0;
            } else {
              if (param3 < ((kr) this).field_b.length) {
                if (null != ((kr) this).field_b[param3]) {
                  return ((kr) this).field_b[param3];
                } else {
                  L1: {
                    ((kr) this).field_d.field_u = param3 * 72 - -6;
                    var6 = ((kr) this).field_d.b(true);
                    var7 = ((kr) this).field_d.b(true);
                    var11 = new byte[64];
                    ((kr) this).field_d.a(0, var11, 64, 67);
                    var9 = new uk(param3, param4, param1, ((kr) this).field_f, ((kr) this).field_a, var6, var11, var7, param2);
                    if (param0 == 18162) {
                      break L1;
                    } else {
                      u[] discarded$2 = kr.a((byte) -3);
                      break L1;
                    }
                  }
                  ((kr) this).field_b[param3] = var9;
                  return var9;
                }
              } else {
                break L0;
              }
            }
          }
          throw new RuntimeException();
        }
    }

    final static void a(String param0, byte param1) {
        an.a(1, param0);
        if (param1 > -3) {
            return;
        }
        fi.a(31820, false, gn.field_a);
    }

    final static u[] a(byte param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        u[] var1 = new u[eo.field_m];
        for (var2 = 0; eo.field_m > var2; var2++) {
            var1[var2] = new u(ql.field_M, vj.field_c, ca.field_a[var2], pc.field_a[var2], mh.field_c[var2], vi.field_w[var2], se.field_y[var2], in.field_c);
        }
        la.a((byte) 17);
        if (param0 >= -19) {
            u[] discarded$0 = kr.a((byte) 26);
        }
        return var1;
    }

    final static void a(int param0) {
        kd.field_x = va.field_s.a(1, sl.field_q[20]);
        int var1 = va.field_s.a(1, sl.field_q[21]);
        if (!(kd.field_x >= var1)) {
            kd.field_x = var1;
        }
        if (param0 != -3645) {
            kr.a(85);
        }
    }

    kr(tk param0, t param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private kr(tk param0, t param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((kr) this).field_f = param0;
        ((kr) this).field_i = param2;
        ((kr) this).field_a = param1;
        ((kr) this).field_h = param3;
        if (!((kr) this).field_f.a(20)) {
            ((kr) this).field_e = ((kr) this).field_f.a(255, 255, true, (byte) 0, false);
        }
    }

    final boolean b(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        java.math.BigInteger var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        ed var11 = null;
        byte[] var12 = null;
        java.math.BigInteger var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (((kr) this).field_d == null) {
          L0: {
            if (null != ((kr) this).field_e) {
              break L0;
            } else {
              if (((kr) this).field_f.a(20)) {
                return false;
              } else {
                ((kr) this).field_e = ((kr) this).field_f.a(255, 255, true, (byte) 0, false);
                break L0;
              }
            }
          }
          if (!((kr) this).field_e.field_z) {
            L1: {
              L2: {
                var11 = new ed(((kr) this).field_e.a((byte) -106));
                var11.field_u = 5;
                var3 = var11.h(-11);
                var11.field_u = var11.field_u + var3 * 72;
                var5 = 13 % ((-4 - param0) / 48);
                var17 = new byte[var11.field_p.length + -var11.field_u];
                var15 = var17;
                var14 = var15;
                var12 = var14;
                var4 = var12;
                var11.a(0, var4, var17.length, 61);
                if (null == ((kr) this).field_i) {
                  break L2;
                } else {
                  if (null == ((kr) this).field_h) {
                    break L2;
                  } else {
                    var13 = new java.math.BigInteger(var17);
                    var8_ref = var13.modPow(((kr) this).field_i, ((kr) this).field_h);
                    var6 = var8_ref.toByteArray();
                    break L1;
                  }
                }
              }
              var6 = var4;
              break L1;
            }
            if (var6.length == 65) {
              var18 = de.a(5, (byte) -110, var11.field_u - var17.length + -5, var11.field_p);
              var8 = 0;
              L3: while (true) {
                if (var8 >= 64) {
                  ((kr) this).field_d = var11;
                  ((kr) this).field_b = new uk[var3];
                  return true;
                } else {
                  if (var6[var8 + 1] == var18[var8]) {
                    var8++;
                    continue L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    static {
    }
}
