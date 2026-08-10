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
        try {
            this.field_E = this.field_E + 1;
            super.a((byte) 42, param1, param2, param3);
            if (param0 < 13) {
                this.field_B = (sp) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "kb.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(int param0) {
        if (param0 != -1903710079) {
            return (String) null;
        }
        return rs.field_x;
    }

    kb(sp param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, pe.a((byte) -63));
        try {
            this.field_B = param0;
            this.field_A = param1;
            this.a(param5, param2, param3, param4, (byte) 123);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "kb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(ea param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -42) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_E = -90;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("kb.U(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        String var5;
        pt var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        String var17;
        Object var18;
        ll var19;
        ll var20;
        ll var21;
        Object var22;
        ll var23;
        ll var24;
        ll var25;
        Object var26;
        ll var27;
        ll var28;
        ll var29;
        et var30;
        et var31;
        et var32;
        var18 = null;
        var22 = null;
        var26 = null;
        var13 = AceOfSkies.field_G ? 1 : 0;
        var6 = this.field_B.b(true);
        if (jc.field_Pc != var6) {
          L0: {
            if (ce.field_t != var6) {
              var5 = this.field_B.a(true);
              if (var5 == null) {
                var5 = this.field_A;
                break L0;
              } else {
                break L0;
              }
            } else {
              var5 = uu.field_g;
              break L0;
            }
          }
          if (!var5.equals(this.field_f)) {
            this.field_f = var5;
            this.a((byte) -67);
            super.a((byte) 107, param1, param2, param3);
            var6 = this.field_B.b(true);
            var32 = (et) ((Object) this.field_e);
            var9 = param3 - -this.field_p;
            var10 = var32.a(param2, false, (ea) (this)) - -(var32.a((byte) 86, (ea) (this)).a(0) >> -1903710079);
            if (param0 > 64) {
              L1: {
                if (jc.field_Pc == var6) {
                  break L1;
                } else {
                  if (var6 != ce.field_t) {
                    if (var6 != bt.field_a) {
                      if (fd.field_a == var6) {
                        var29 = gu.field_c[1];
                        var29.d(var9, -(var29.field_n >> -693756063) + var10, 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var28 = gu.field_c[2];
                      var28.d(var9, -(var28.field_n >> -50907455) + var10, 256);
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var27 = gu.field_c[0];
              var11 = var27.field_v << 1663260801;
              var12 = var27.field_q << 265582081;
              if (this.field_F != null) {
                if (this.field_F.field_r >= var11) {
                  if (this.field_F.field_n >= var12) {
                    cm.a(this.field_F, -14492);
                    vp.a();
                    var27.a(112, 144, var27.field_v << 739716644, var27.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                    sl.c(2765);
                    this.field_F.d(var9 - (var27.field_v >> 1770705729), -var27.field_q + var10, 256);
                    return;
                  } else {
                    this.field_F = new ll(var11, var12);
                    cm.a(this.field_F, -14492);
                    var27.a(112, 144, var27.field_v << 739716644, var27.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                    sl.c(2765);
                    this.field_F.d(var9 - (var27.field_v >> 1770705729), -var27.field_q + var10, 256);
                    return;
                  }
                } else {
                  this.field_F = new ll(var11, var12);
                  cm.a(this.field_F, -14492);
                  var27.a(112, 144, var27.field_v << 739716644, var27.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                  sl.c(2765);
                  this.field_F.d(var9 - (var27.field_v >> 1770705729), -var27.field_q + var10, 256);
                  return;
                }
              } else {
                this.field_F = new ll(var11, var12);
                cm.a(this.field_F, -14492);
                var27.a(112, 144, var27.field_v << 739716644, var27.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                sl.c(2765);
                this.field_F.d(var9 - (var27.field_v >> 1770705729), -var27.field_q + var10, 256);
                return;
              }
            } else {
              return;
            }
          } else {
            super.a((byte) 107, param1, param2, param3);
            var6 = this.field_B.b(true);
            var31 = (et) ((Object) this.field_e);
            var9 = param3 - -this.field_p;
            var10 = var31.a(param2, false, (ea) (this)) - -(var31.a((byte) 86, (ea) (this)).a(0) >> -1903710079);
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
                        var25.d(var9, -(var25.field_n >> -693756063) + var10, 256);
                        return;
                      }
                    } else {
                      var24 = gu.field_c[2];
                      var24.d(var9, -(var24.field_n >> -50907455) + var10, 256);
                      return;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var23 = gu.field_c[0];
              var11 = var23.field_v << 1663260801;
              var12 = var23.field_q << 265582081;
              if (this.field_F != null) {
                if (this.field_F.field_r >= var11) {
                  if (this.field_F.field_n < var12) {
                    this.field_F = new ll(var11, var12);
                    cm.a(this.field_F, -14492);
                    var23.a(112, 144, var23.field_v << 739716644, var23.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                    sl.c(2765);
                    this.field_F.d(var9 - (var23.field_v >> 1770705729), -var23.field_q + var10, 256);
                    return;
                  } else {
                    cm.a(this.field_F, -14492);
                    vp.a();
                    var23.a(112, 144, var23.field_v << 739716644, var23.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                    sl.c(2765);
                    this.field_F.d(var9 - (var23.field_v >> 1770705729), -var23.field_q + var10, 256);
                    return;
                  }
                } else {
                  this.field_F = new ll(var11, var12);
                  cm.a(this.field_F, -14492);
                  var23.a(112, 144, var23.field_v << 739716644, var23.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                  sl.c(2765);
                  this.field_F.d(var9 - (var23.field_v >> 1770705729), -var23.field_q + var10, 256);
                  return;
                }
              } else {
                this.field_F = new ll(var11, var12);
                cm.a(this.field_F, -14492);
                var23.a(112, 144, var23.field_v << 739716644, var23.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                sl.c(2765);
                this.field_F.d(var9 - (var23.field_v >> 1770705729), -var23.field_q + var10, 256);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L3: {
            var17 = uu.field_g;
            if (var17.equals(this.field_f)) {
              break L3;
            } else {
              this.field_f = var17;
              this.a((byte) -67);
              break L3;
            }
          }
          super.a((byte) 107, param1, param2, param3);
          var6 = this.field_B.b(true);
          var30 = (et) ((Object) this.field_e);
          var9 = param3 - -this.field_p;
          var10 = var30.a(param2, false, (ea) (this)) - -(var30.a((byte) 86, (ea) (this)).a(0) >> -1903710079);
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
                      var21.d(var9, -(var21.field_n >> -693756063) + var10, 256);
                      return;
                    }
                  } else {
                    var20 = gu.field_c[2];
                    var20.d(var9, -(var20.field_n >> -50907455) + var10, 256);
                    return;
                  }
                } else {
                  break L4;
                }
              }
            }
            var19 = gu.field_c[0];
            var11 = var19.field_v << 1663260801;
            var12 = var19.field_q << 265582081;
            if (this.field_F != null) {
              if (this.field_F.field_r >= var11) {
                if (this.field_F.field_n < var12) {
                  this.field_F = new ll(var11, var12);
                  cm.a(this.field_F, -14492);
                  var19.a(112, 144, var19.field_v << 739716644, var19.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                  sl.c(2765);
                  this.field_F.d(var9 - (var19.field_v >> 1770705729), -var19.field_q + var10, 256);
                  return;
                } else {
                  cm.a(this.field_F, -14492);
                  vp.a();
                  var19.a(112, 144, var19.field_v << 739716644, var19.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                  sl.c(2765);
                  this.field_F.d(var9 - (var19.field_v >> 1770705729), -var19.field_q + var10, 256);
                  return;
                }
              } else {
                this.field_F = new ll(var11, var12);
                cm.a(this.field_F, -14492);
                var19.a(112, 144, var19.field_v << 739716644, var19.field_q << 1927884356, -this.field_E << -1003243254, 4096);
                sl.c(2765);
                this.field_F.d(var9 - (var19.field_v >> 1770705729), -var19.field_q + var10, 256);
                return;
              }
            } else {
              this.field_F = new ll(var11, var12);
              cm.a(this.field_F, -14492);
              var19.a(112, 144, var19.field_v << 739716644, var19.field_q << 1927884356, -this.field_E << -1003243254, 4096);
              sl.c(2765);
              this.field_F.d(var9 - (var19.field_v >> 1770705729), -var19.field_q + var10, 256);
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
        kb.a(106);
        return null;
    }

    static {
        field_C = new ej(9, 0, 4, 1);
    }
}
