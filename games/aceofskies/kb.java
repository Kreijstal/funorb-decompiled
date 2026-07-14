/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends vq {
    private ll field_F;
    static ej field_C;
    private String field_A;
    private int field_E;
    private sp field_B;
    static vd[] field_D;

    public static void h(int param0) {
        field_C = null;
        if (param0 != 1927884356) {
            field_C = (ej) null;
            field_D = null;
            return;
        }
        field_D = null;
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        ((kb) this).field_E = ((kb) this).field_E + 1;
        this.a((byte) 42, param1, param2, param3);
        if (param0 < 13) {
            ((kb) this).field_B = (sp) null;
        }
    }

    final static String a(int param0) {
        if (param0 != -1903710079) {
            return (String) null;
        }
        return rs.field_x;
    }

    kb(sp param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ir) (Object) pe.a((byte) -63));
        ((kb) this).field_B = param0;
        ((kb) this).field_A = param1;
        ((kb) this).a(param5, param2, param3, param4, (byte) 123);
    }

    final boolean a(ea param0, byte param1) {
        if (param1 != -42) {
            ((kb) this).field_E = -90;
            return false;
        }
        return false;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        String var5 = null;
        pt var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var17 = null;
        Object var18 = null;
        ll var19 = null;
        ll var20 = null;
        ll var21 = null;
        Object var22 = null;
        ll var23 = null;
        ll var24 = null;
        ll var25 = null;
        Object var26 = null;
        ll var27 = null;
        ll var28 = null;
        ll var29 = null;
        et var30 = null;
        et var31 = null;
        et var32 = null;
        var18 = null;
        var22 = null;
        var26 = null;
        var13 = AceOfSkies.field_G ? 1 : 0;
        var6 = ((kb) this).field_B.b(true);
        if (jc.field_Pc != var6) {
          L0: {
            if (ce.field_t != var6) {
              var5 = ((kb) this).field_B.a(true);
              if (var5 == null) {
                var5 = ((kb) this).field_A;
                break L0;
              } else {
                break L0;
              }
            } else {
              var5 = uu.field_g;
              break L0;
            }
          }
          if (!var5.equals((Object) (Object) ((kb) this).field_f)) {
            ((kb) this).field_f = var5;
            ((kb) this).a((byte) -67);
            this.a((byte) 107, param1, param2, param3);
            var6 = ((kb) this).field_B.b(true);
            var32 = (et) ((kb) this).field_e;
            var9 = param3 - -((kb) this).field_p;
            var10 = ((et) var32).a(param2, false, (ea) this) - -(((et) var32).a((byte) 86, (ea) this).a(0) >> -1903710079);
            if (param0 > 64) {
              L1: {
                if (jc.field_Pc == var6) {
                  break L1;
                } else {
                  if (var6 != ce.field_t) {
                    if (var6 != bt.field_a) {
                      if (fd.field_a == var6) {
                        var29 = gu.field_c[1];
                        var29.d(var9, -(((ll) var29).field_n >> -693756063) + var10, 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var28 = gu.field_c[2];
                      var28.d(var9, -(((ll) var28).field_n >> -50907455) + var10, 256);
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var27 = gu.field_c[0];
              var11 = ((ll) var27).field_v << 1663260801;
              var12 = ((ll) var27).field_q << 265582081;
              if (((kb) this).field_F != null) {
                if (((kb) this).field_F.field_r >= var11) {
                  if (((kb) this).field_F.field_n >= var12) {
                    cm.a(((kb) this).field_F, -14492);
                    vp.a();
                    var27.a(112, 144, ((ll) var27).field_v << 739716644, ((ll) var27).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                    sl.c(2765);
                    ((kb) this).field_F.d(var9 - (((ll) var27).field_v >> 1770705729), -((ll) var27).field_q + var10, 256);
                    return;
                  } else {
                    ((kb) this).field_F = new ll(var11, var12);
                    cm.a(((kb) this).field_F, -14492);
                    var27.a(112, 144, ((ll) var27).field_v << 739716644, ((ll) var27).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                    sl.c(2765);
                    ((kb) this).field_F.d(var9 - (((ll) var27).field_v >> 1770705729), -((ll) var27).field_q + var10, 256);
                    return;
                  }
                } else {
                  ((kb) this).field_F = new ll(var11, var12);
                  cm.a(((kb) this).field_F, -14492);
                  var27.a(112, 144, ((ll) var27).field_v << 739716644, ((ll) var27).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                  sl.c(2765);
                  ((kb) this).field_F.d(var9 - (((ll) var27).field_v >> 1770705729), -((ll) var27).field_q + var10, 256);
                  return;
                }
              } else {
                ((kb) this).field_F = new ll(var11, var12);
                cm.a(((kb) this).field_F, -14492);
                var27.a(112, 144, ((ll) var27).field_v << 739716644, ((ll) var27).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                sl.c(2765);
                ((kb) this).field_F.d(var9 - (((ll) var27).field_v >> 1770705729), -((ll) var27).field_q + var10, 256);
                return;
              }
            } else {
              return;
            }
          } else {
            this.a((byte) 107, param1, param2, param3);
            var6 = ((kb) this).field_B.b(true);
            var31 = (et) ((kb) this).field_e;
            var9 = param3 - -((kb) this).field_p;
            var10 = ((et) var31).a(param2, false, (ea) this) - -(((et) var31).a((byte) 86, (ea) this).a(0) >> -1903710079);
            if (param0 > 64) {
              L2: {
                if (jc.field_Pc == var6) {
                  break L2;
                } else {
                  if (var6 != ce.field_t) {
                    if (var6 != bt.field_a) {
                      if (fd.field_a != var6) {
                        return;
                      } else {
                        var25 = gu.field_c[1];
                        var25.d(var9, -(((ll) var25).field_n >> -693756063) + var10, 256);
                        return;
                      }
                    } else {
                      var24 = gu.field_c[2];
                      var24.d(var9, -(((ll) var24).field_n >> -50907455) + var10, 256);
                      return;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var23 = gu.field_c[0];
              var11 = ((ll) var23).field_v << 1663260801;
              var12 = ((ll) var23).field_q << 265582081;
              if (((kb) this).field_F != null) {
                if (((kb) this).field_F.field_r >= var11) {
                  if (((kb) this).field_F.field_n < var12) {
                    ((kb) this).field_F = new ll(var11, var12);
                    cm.a(((kb) this).field_F, -14492);
                    var23.a(112, 144, ((ll) var23).field_v << 739716644, ((ll) var23).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                    sl.c(2765);
                    ((kb) this).field_F.d(var9 - (((ll) var23).field_v >> 1770705729), -((ll) var23).field_q + var10, 256);
                    return;
                  } else {
                    cm.a(((kb) this).field_F, -14492);
                    vp.a();
                    var23.a(112, 144, ((ll) var23).field_v << 739716644, ((ll) var23).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                    sl.c(2765);
                    ((kb) this).field_F.d(var9 - (((ll) var23).field_v >> 1770705729), -((ll) var23).field_q + var10, 256);
                    return;
                  }
                } else {
                  ((kb) this).field_F = new ll(var11, var12);
                  cm.a(((kb) this).field_F, -14492);
                  var23.a(112, 144, ((ll) var23).field_v << 739716644, ((ll) var23).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                  sl.c(2765);
                  ((kb) this).field_F.d(var9 - (((ll) var23).field_v >> 1770705729), -((ll) var23).field_q + var10, 256);
                  return;
                }
              } else {
                ((kb) this).field_F = new ll(var11, var12);
                cm.a(((kb) this).field_F, -14492);
                var23.a(112, 144, ((ll) var23).field_v << 739716644, ((ll) var23).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                sl.c(2765);
                ((kb) this).field_F.d(var9 - (((ll) var23).field_v >> 1770705729), -((ll) var23).field_q + var10, 256);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L3: {
            var17 = uu.field_g;
            if (var17.equals((Object) (Object) ((kb) this).field_f)) {
              break L3;
            } else {
              ((kb) this).field_f = var17;
              ((kb) this).a((byte) -67);
              break L3;
            }
          }
          this.a((byte) 107, param1, param2, param3);
          var6 = ((kb) this).field_B.b(true);
          var30 = (et) ((kb) this).field_e;
          var9 = param3 - -((kb) this).field_p;
          var10 = ((et) var30).a(param2, false, (ea) this) - -(((et) var30).a((byte) 86, (ea) this).a(0) >> -1903710079);
          if (param0 > 64) {
            L4: {
              if (jc.field_Pc == var6) {
                break L4;
              } else {
                if (var6 != ce.field_t) {
                  if (var6 != bt.field_a) {
                    if (fd.field_a != var6) {
                      return;
                    } else {
                      var21 = gu.field_c[1];
                      var21.d(var9, -(((ll) var21).field_n >> -693756063) + var10, 256);
                      return;
                    }
                  } else {
                    var20 = gu.field_c[2];
                    var20.d(var9, -(((ll) var20).field_n >> -50907455) + var10, 256);
                    return;
                  }
                } else {
                  break L4;
                }
              }
            }
            var19 = gu.field_c[0];
            var11 = ((ll) var19).field_v << 1663260801;
            var12 = ((ll) var19).field_q << 265582081;
            if (((kb) this).field_F != null) {
              if (((kb) this).field_F.field_r >= var11) {
                if (((kb) this).field_F.field_n < var12) {
                  ((kb) this).field_F = new ll(var11, var12);
                  cm.a(((kb) this).field_F, -14492);
                  var19.a(112, 144, ((ll) var19).field_v << 739716644, ((ll) var19).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                  sl.c(2765);
                  ((kb) this).field_F.d(var9 - (((ll) var19).field_v >> 1770705729), -((ll) var19).field_q + var10, 256);
                  return;
                } else {
                  cm.a(((kb) this).field_F, -14492);
                  vp.a();
                  var19.a(112, 144, ((ll) var19).field_v << 739716644, ((ll) var19).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                  sl.c(2765);
                  ((kb) this).field_F.d(var9 - (((ll) var19).field_v >> 1770705729), -((ll) var19).field_q + var10, 256);
                  return;
                }
              } else {
                ((kb) this).field_F = new ll(var11, var12);
                cm.a(((kb) this).field_F, -14492);
                var19.a(112, 144, ((ll) var19).field_v << 739716644, ((ll) var19).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
                sl.c(2765);
                ((kb) this).field_F.d(var9 - (((ll) var19).field_v >> 1770705729), -((ll) var19).field_q + var10, 256);
                return;
              }
            } else {
              ((kb) this).field_F = new ll(var11, var12);
              cm.a(((kb) this).field_F, -14492);
              var19.a(112, 144, ((ll) var19).field_v << 739716644, ((ll) var19).field_q << 1927884356, -((kb) this).field_E << -1003243254, 4096);
              sl.c(2765);
              ((kb) this).field_F.d(var9 - (((ll) var19).field_v >> 1770705729), -((ll) var19).field_q + var10, 256);
              return;
            }
          } else {
            return;
          }
        }
    }

    final String c(byte param0) {
        if (param0 <= -41) {
            return null;
        }
        String discarded$0 = kb.a(106);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new ej(9, 0, 4, 1);
    }
}
