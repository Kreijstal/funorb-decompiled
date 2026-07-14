/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends mi {
    static String field_G;
    static String[] field_I;
    static o[] field_H;

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 < -86) {
          var3 = ag.a(param0, 1);
          if (-1 != param2.indexOf(param0)) {
            return true;
          } else {
            if (0 == (param2.indexOf(var3) ^ -1)) {
              L0: {
                L1: {
                  if (param2.startsWith(param0)) {
                    break L1;
                  } else {
                    if (param2.startsWith(var3)) {
                      break L1;
                    } else {
                      if (param2.endsWith(param0)) {
                        break L1;
                      } else {
                        if (!param2.endsWith(var3)) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L0;
              }
              return stackIn_13_0 != 0;
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = wizardrun.field_H;
          if ((hl.field_a ^ -1) >= -1) {
            if (e.a(-89)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          } else {
            L1: {
              if (null == oa.field_c) {
                ki.field_E = hb.a(0, 640, 0, 480, 0, ld.field_g);
                break L1;
              } else {
                ki.field_E = oa.field_c.c(0);
                rc.a(0, 2);
                break L1;
              }
            }
            if (ki.field_E != null) {
              var2 = 2;
              jf.a(false, (java.awt.Canvas) (Object) ki.field_E);
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          }
        }
        L2: {
          if (null != oa.field_c) {
            break L2;
          } else {
            if (!dg.field_b) {
              break L2;
            } else {
              le.a(param0, var2, 15991);
              break L2;
            }
          }
        }
        L3: {
          if (!param1) {
            break L3;
          } else {
            pd.f(-89);
            break L3;
          }
        }
    }

    final static void d(boolean param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        mg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        pg var11 = null;
        mg var12 = null;
        int[] var13 = null;
        te var14 = null;
        te var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var8 = wizardrun.field_H;
          if (!param0) {
            break L0;
          } else {
            field_I = null;
            break L0;
          }
        }
        L1: {
          var12 = nk.field_N;
          var2 = var12.f(255);
          if (-1 != (var2 ^ -1)) {
            if (var2 == 1) {
              var11 = (pg) (Object) sf.field_j.b((byte) 123);
              if (var11 == null) {
                ql.a(-58);
                return;
              } else {
                var11.a(false);
                break L1;
              }
            } else {
              if (var2 == 2) {
                var15 = (te) (Object) bk.field_d.b((byte) 48);
                if (var15 != null) {
                  var15.field_l = mh.m(-26421);
                  var15.field_i = true;
                  var15.field_j = var15.field_l[0];
                  var15.a(false);
                  break L1;
                } else {
                  ql.a(-34);
                  return;
                }
              } else {
                rg.a((Throwable) null, "A1: " + ni.c(6), -562);
                ql.a(-109);
                break L1;
              }
            }
          } else {
            var10 = mh.m(-26421);
            var18 = var10;
            var17 = var18;
            var16 = var17;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((va) (Object) var5).f(255);
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                var14 = (te) (Object) bk.field_d.b((byte) 97);
                if (var14 == null) {
                  ql.a(-113);
                  return;
                } else {
                  var14.field_l = var3;
                  var14.field_j = var18[0];
                  var14.field_i = true;
                  var14.a(false);
                  break L1;
                }
              } else {
                var9[var7] = ((va) (Object) var5).i(255);
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5 + param5);
        pj var7 = tg.field_h;
        if (var7 != null) {
            if (((pd) this).b(param1, param3, 0, param0, param2)) {
                if (((pd) this).field_s instanceof qg) {
                    ((qg) (Object) ((pd) this).field_s).a(var7, -95, (pd) this);
                    tg.field_h = null;
                } else {
                    if (var7.field_s instanceof qg) {
                        ((qg) (Object) var7.field_s).a(var7, -106, (pd) this);
                        tg.field_h = null;
                    }
                }
            }
        }
    }

    private pd(int param0, int param1, int param2, int param3, bf param4, ce param5, ub param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((pd) this).field_F = param6;
    }

    public static void f(int param0) {
        field_I = null;
        field_G = null;
        if (param0 != -27864) {
            return;
        }
        field_H = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "You and your friends have not";
    }
}
