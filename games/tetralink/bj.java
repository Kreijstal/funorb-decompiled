/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static int field_d;
    static int field_b;
    static hl field_c;
    static String field_a;

    private final static void a(boolean param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        hl var5 = null;
        int var7 = 0;
        String var8 = null;
        fj var9 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (th.field_g < ma.field_f) {
                th.field_g = th.field_g + 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (te.field_P == pk.field_O.field_j) {
                break L2;
              } else {
                ja.field_f = ja.field_f + (-te.field_P + pk.field_O.field_j);
                te.field_P = pk.field_O.field_j;
                break L2;
              }
            }
            if (0 >= th.field_g) {
              return;
            } else {
              L3: {
                lc.a((byte) 85);
                oj.field_a.a(0, param0);
                if (null == bk.field_e) {
                  break L3;
                } else {
                  if (cd.field_a) {
                    boolean discarded$3 = bk.field_e.a(oj.field_a.field_eb, param0, oj.field_a.field_z, false);
                    break L3;
                  } else {
                    bk.field_e = null;
                    break L3;
                  }
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (var4_int >= 5) {
                  L5: {
                    if (nc.field_e.field_F == 0) {
                      break L5;
                    } else {
                      mm.field_y = new om(nc.field_e.field_eb, nc.field_e.field_z, nc.field_e.field_Hb, nc.field_e.field_R, 0, sa.field_h, hl.field_gb, sn.field_c, bk.field_i, vd.field_c, ek.field_n, (String) null, 0L);
                      break L5;
                    }
                  }
                  L6: {
                    int discarded$4 = 0;
                    var9 = r.a(fn.field_Q, param3, qe.field_d);
                    if (var9 != null) {
                      n.a((byte) 111, var9);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    int discarded$5 = -62;
                    var8 = fh.b();
                    if (var8 != null) {
                      re.field_P = var8;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  break L0;
                } else {
                  L8: {
                    var5 = nj.field_f[var4_int];
                    if (var5 == null) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var4_int++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "bj.B(" + param0 + ',' + 0 + ',' + false + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
    }

    final static void a() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = TetraLink.field_J;
          if (0 < qd.field_ab) {
            qd.field_ab = qd.field_ab - 1;
            break L0;
          } else {
            if (ng.field_t <= 0) {
              if (am.field_f <= 0) {
                break L0;
              } else {
                am.field_f = am.field_f - 1;
                break L0;
              }
            } else {
              ng.field_t = ng.field_t - 1;
              break L0;
            }
          }
        }
        L1: {
          if (0 < qd.field_ab) {
            lj.a((byte) -112);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (0 >= ng.field_t) {
            break L2;
          } else {
            nb.a(ng.field_t, (byte) 80);
            break L2;
          }
        }
        L3: {
          var1 = 0;
          if (am.field_f > 0) {
            nb.a(am.field_f, (byte) 1);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6, boolean param7, int param8, int param9, int param10, int param11, boolean param12, boolean param13) {
        re.field_P = null;
        int discarded$0 = 90;
        oc.b();
        int discarded$1 = 0;
        param1 = qh.a(15, 11, (byte) -30, 14, 13, param1);
        li.a(-70, 16777215, 16777215, param4, false, param7, param13, param12, 11, param1);
        int discarded$2 = -61;
        wk.a(param4, param12);
        bj.a(param1, 0, false, param4);
    }

    final static void a(int param0, fh param1) {
        try {
            ck.field_Z = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "bj.F(" + 5 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static db a(int param0, int param1) {
        db[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        db[] var5 = null;
        var4 = TetraLink.field_J;
        int discarded$2 = 104;
        var5 = cc.b();
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (var5[var3].field_d != param1) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Inviting <%0>";
    }
}
