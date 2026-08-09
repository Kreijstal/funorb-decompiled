/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends sg implements hh {
    private boolean field_rb;
    static String field_wb;
    private fk field_sb;
    static String[] field_qb;
    private boolean field_ub;
    static vn field_vb;
    static vn field_tb;

    final static int a(boolean param0, String param1, String param2, int param3, byte param4, int param5, String param6) {
        ji var7 = null;
        RuntimeException var7_ref = null;
        ji var8 = null;
        int var9 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = 49 / ((param4 - 61) / 57);
            var7 = new ji(param6);
            var8 = new ji(param1);
            stackIn_1_0 = bg.a(105, param3, var7, param2, var8, param5, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7_ref);

            stackIn_4_1 = new StringBuilder().append("md.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void n(int param0) {
        field_qb = null;
        if (param0 != 54) {
            return;
        }
        field_tb = null;
        field_wb = null;
        field_vb = null;
    }

    private final void a(boolean param0, eo param1, boolean param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        e var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                md.n(-43);
                break L1;
              }
            }
            L2: {
              this.field_rb = true;
              if (param1.field_b) {
                var4 = lg.field_j;
                break L2;
              } else {
                if (param1.field_g == null) {
                  var4 = param1.field_e;
                  if (248 != param1.field_a) {
                    break L2;
                  } else {
                    if (param2) {
                      var4 = fm.field_E;
                      this.field_ub = true;
                      break L2;
                    } else {
                      eo.a(true);
                      var4 = fm.field_E;
                      this.field_ub = true;
                      break L2;
                    }
                  }
                } else {
                  var4 = ma.field_i;
                  if (null == this.field_sb) {
                    break L2;
                  } else {
                    this.field_sb.a(-41);
                    break L2;
                  }
                }
              }
            }
            L3: {
              var5 = new e((sg) (this), rk.field_b, var4);
              if (param1.field_b) {
                if (!param1.field_d) {
                  var5.a(jb.field_c, 125, (sk) (this));
                  break L3;
                } else {
                  this.b(20, new fe((md) (this)));
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L4: {
                  if (!this.field_ub) {
                    if ((param1.field_a ^ -1) != -6) {
                      var5.a((byte) 123, jk.field_g, -1);
                      break L4;
                    } else {
                      var5.a((byte) 106, te.field_R, 11);
                      var5.a((byte) 110, qd.field_d, 17);
                      break L4;
                    }
                  } else {
                    var5.a(jb.field_c, 125, (sk) (this));
                    break L4;
                  }
                }
                if (-4 == (param1.field_a ^ -1)) {
                  var5.a((byte) 95, rf.field_b, 7);
                  break L3;
                } else {
                  if (-7 == (param1.field_a ^ -1)) {
                    var5.a((byte) 122, di.field_I, 9);
                    break L3;
                  } else {
                    this.b(20, var5);
                    return;
                  }
                }
              }
            }
            this.b(20, var5);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var4_ref);

            stackIn_32_1 = new StringBuilder().append("md.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L5;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = 255;
              var3_int = var3_int | (var4 & param1[param0 * 4]) << -1013987752;
              var3_int = var3_int | (var4 & param1[1 + param0 * 4]) << 1364809232;
              var3_int = var3_int | (param1[2 + param0 * 4] & var4) << 1346297928;
              if (param2 >= 48) {
                break L1;
              } else {
                field_qb = (String[]) null;
                break L1;
              }
            }
            var3_int = var3_int | param1[3 + param0 * 4] & var4;
            stackIn_3_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("md.HA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            if (this.field_ub) {
              pn.a(true, (byte) -59, false);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                ed.a(419);
                if (param1 != -6) {
                  field_vb = (vn) null;
                  this.h((byte) -126);
                  break L1;
                } else {
                  this.h((byte) -126);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("md.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean j(int param0) {
        eo var2;
        byte[] var3;
        if (param0 == 2634) {
          if (this.field_H) {
            if (!this.field_rb) {
              var2 = ij.h(-107);
              if (var2 == null) {
                return super.j(param0 + 0);
              } else {
                this.a(false, var2, false);
                return super.j(param0 + 0);
              }
            } else {
              return super.j(param0 + 0);
            }
          } else {
            return super.j(param0 + 0);
          }
        } else {
          var3 = (byte[]) null;
          md.a(-115, (byte[]) null, 111);
          if (this.field_H) {
            if (this.field_rb) {
              return super.j(param0 + 0);
            } else {
              L0: {
                var2 = ij.h(-107);
                if (var2 != null) {
                  this.a(false, var2, false);
                  break L0;
                } else {
                  break L0;
                }
              }
              return super.j(param0 + 0);
            }
          } else {
            return super.j(param0 + 0);
          }
        }
    }

    md(dn param0, fk param1) {
        super(param0, rk.field_b, bb.field_d, false, false);
        try {
            this.field_sb = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "md.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(boolean param0) {
        this.a(param0, te.a(fm.field_E, -13466, 248), true);
    }

    static {
        field_qb = new String[]{"Tutorial Tips: On", "Tutorial Tips: Off"};
        field_wb = "Logging in...";
        field_vb = new vn(54, 54);
    }
}
