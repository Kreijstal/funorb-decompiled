/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static int field_d;
    static int field_b;
    static hl field_c;
    static String field_a;

    private final static void a(boolean param0, int param1, boolean param2, int param3) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        int var4_int = 0;
        hl var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        fj var9 = null;
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                lc.a((byte) 85);
                oj.field_a.a(0, param0);
                if (null == bk.field_e) {
                  break L3;
                } else {
                  if (cd.field_a) {
                    discarded$1 = bk.field_e.a(oj.field_a.field_eb, param0, oj.field_a.field_z, false);
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
                      mm.field_y = new om(nc.field_e.field_eb, nc.field_e.field_z, nc.field_e.field_Hb, nc.field_e.field_R, param1, sa.field_h, hl.field_gb, sn.field_c, bk.field_i, vd.field_c, ek.field_n, (String) null, 0L);
                      break L5;
                    }
                  }
                  L6: {
                    var9 = r.a(fn.field_Q, param3, qe.field_d, 0);
                    if (var9 != null) {
                      n.a((byte) 111, var9);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (!param2) {
                    L7: {
                      var8 = fh.b((byte) -62);
                      if (var8 != null) {
                        re.field_P = var8;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var5 = nj.field_f[var4_int];
                  if (var5 != null) {
                    L8: {
                      if (0 != var5.field_F) {
                        rm.a(var4_int, var5, 0);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var6 = fh.a((byte) 79, var4_int);
                    fh.field_f[var4_int].field_vb = ec.field_n[var6];
                    og.field_o[var4_int].field_jb = gk.field_a[var6];
                    var4_int++;
                    continue L4;
                  } else {
                    var4_int++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var4), "bj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 > -6) {
            bj.a(false, -43, true, -96);
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = TetraLink.field_J;
          if (0 < qd.field_ab) {
            qd.field_ab = qd.field_ab - 1;
            break L0;
          } else {
            if (-1 <= (ng.field_t ^ -1)) {
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
          var1 = -21 % ((param0 - -63) / 50);
          if (-1 > (am.field_f ^ -1)) {
            nb.a(am.field_f, (byte) 1);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6, boolean param7, int param8, int param9, int param10, int param11, boolean param12, boolean param13) {
        re.field_P = null;
        oc.b((byte) 90);
        param1 = qh.a(param2, param6, (byte) -30, param9, param8, param1, param10);
        li.a(-70, param5, param0, param4, param3, param7, param13, param12, param6, param1);
        wk.a(param4, param12, (byte) -61);
        if (param11 != -869) {
            field_b = -52;
        }
        bj.a(param1, param10, false, param4);
    }

    final static void a(int param0, fh param1) {
        if (param0 != 5) {
            return;
        }
        try {
            ck.field_Z = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "bj.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static db a(int param0, int param1) {
        db[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        db[] var5 = null;
        var4 = TetraLink.field_J;
        var5 = cc.b(104);
        var2 = var5;
        var3 = param0;
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
        field_a = "Inviting <%0>";
    }
}
