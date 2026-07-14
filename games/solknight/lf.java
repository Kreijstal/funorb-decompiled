/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lf {
    static String field_e;
    static volatile int field_c;
    static aa field_a;
    static ad field_d;
    static char[] field_f;
    static String field_b;

    abstract void a(java.awt.Component param0, int param1);

    final static boolean a(int[] param0, int param1) {
        long var2 = 0L;
        sa var4_ref_sa = null;
        int var4 = 0;
        int var5_int = 0;
        sa var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        if (jj.field_Y != ef.field_e) {
          return false;
        } else {
          if (param1 == 122) {
            L0: {
              var2 = je.a(1);
              if (0 == rh.field_i) {
                break L0;
              } else {
                if ((qg.field_a ^ -1) > -1) {
                  var4_ref_sa = (sa) (Object) jl.field_h.a((byte) 51);
                  if (var4_ref_sa == null) {
                    break L0;
                  } else {
                    if ((var2 ^ -1L) >= (var4_ref_sa.field_h ^ -1L)) {
                      break L0;
                    } else {
                      var4_ref_sa.c(10);
                      te.field_O = var4_ref_sa.field_k.length;
                      te.field_N.field_m = 0;
                      var5_int = 0;
                      L1: while (true) {
                        if (var5_int >= te.field_O) {
                          nf.field_U = kl.field_b;
                          kl.field_b = jg.field_e;
                          jg.field_e = ob.field_h;
                          ob.field_h = var4_ref_sa.field_j;
                          return true;
                        } else {
                          te.field_N.field_l[var5_int] = var4_ref_sa.field_k[var5_int];
                          var5_int++;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if ((qg.field_a ^ -1) <= -1) {
                  break L3;
                } else {
                  te.field_N.field_m = 0;
                  if (bf.c(114, 1)) {
                    qg.field_a = te.field_N.l(27310);
                    te.field_N.field_m = 0;
                    te.field_O = param0[qg.field_a];
                    break L3;
                  } else {
                    return false;
                  }
                }
              }
              if (!qd.b((byte) 127)) {
                return false;
              } else {
                if (rh.field_i == 0) {
                  nf.field_U = kl.field_b;
                  kl.field_b = jg.field_e;
                  jg.field_e = ob.field_h;
                  ob.field_h = qg.field_a;
                  qg.field_a = -1;
                  return true;
                } else {
                  L4: {
                    var4 = rh.field_i;
                    if (hb.field_n == 0.0) {
                      break L4;
                    } else {
                      var4 = (int)((double)var4 + ib.field_i.nextGaussian() * hb.field_n);
                      if (0 <= var4) {
                        break L4;
                      } else {
                        var4 = 0;
                        break L4;
                      }
                    }
                  }
                  var5 = new sa(var2 - -(long)var4, qg.field_a, new byte[te.field_O]);
                  var6 = 0;
                  L5: while (true) {
                    if (var6 >= te.field_O) {
                      jl.field_h.a((gg) (Object) var5, -7044);
                      qg.field_a = -1;
                      continue L2;
                    } else {
                      var5.field_k[var6] = te.field_N.field_l[var6];
                      var6++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 18609) {
            Object var2 = null;
            fg discarded$0 = lf.a((byte) -36, (java.applet.Applet) null);
        }
        field_a = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_d = null;
    }

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, boolean param1);

    final static fg a(byte param0, java.applet.Applet param1) {
        int var5 = 0;
        fg var6 = null;
        int var7 = SolKnight.field_L ? 1 : 0;
        int var2 = -56 % ((param0 - 51) / 35);
        String var3 = na.a("jagex-last-login-method", param1, -32574);
        if (!(var3 != null)) {
            return SolKnight.field_D;
        }
        fg[] var4 = cl.d((byte) -30);
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6.a(-126, var3)) {
                return var6;
            }
        }
        return SolKnight.field_D;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = null;
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_b = "Not yet achieved";
    }
}
