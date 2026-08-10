/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj implements j {
    static ga field_d;
    private int field_a;
    private int field_c;
    private int field_b;
    private int field_g;
    private mg field_e;
    private int field_f;
    private int field_h;

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        rc stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hh var12 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 instanceof hh) {
                stackIn_4_0 = (rc) (param4);
                break L1;
              } else {
                stackIn_4_0 = null;
                break L1;
              }
            }
            L2: {
              var12 = (hh) ((Object) stackIn_4_0);
              if (var12 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              mi.b(param3 - -param4.field_m, param4.field_j + param1, param4.field_t, param4.field_x, this.field_c);
              var7 = -(var12.field_I * 2) + param4.field_t;
              if (param0 >= 113) {
                break L3;
              } else {
                this.field_e = (mg) null;
                break L3;
              }
            }
            var8 = param3 - -param4.field_m - -var12.field_I;
            var9 = param1 + param4.field_j - -var12.field_L;
            mi.e(var8, var9, var8 - -var7, var9, this.field_g);
            var10 = var12.i(-85) - 1;
            L4: while (true) {
              if (var10 < 0) {
                if (this.field_e != null) {
                  this.field_e.a(var12.field_i, var7 / 2 + var8, var9 + this.field_e.field_x + var12.field_L, this.field_h, this.field_a);
                  break L0;
                } else {
                  return;
                }
              } else {
                mi.e(var8 + var12.b(var10, -96) * var7 / var12.a(-3), var9, this.field_b, this.field_f);
                var10--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("sj.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_d = (ga) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeMouseListener(ee.field_j);
            param0.removeMouseMotionListener(ee.field_j);
            param0.removeFocusListener(ee.field_j);
            if (param1 > -24) {
                field_d = (ga) null;
            }
            u.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "sj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, bl param1, int param2) {
        if (param2 != -7471) {
            return;
        }
        try {
            m.field_h.a(param1, -7044);
            la.a(0, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "sj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_d = (ga) null;
                break L1;
              }
            }
            stackIn_3_0 = tg.a(false, -126, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("sj.C(");

            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (dl.field_t.startsWith("win")) {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param1.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_7_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var3 = 33 % ((35 - param0) / 35);
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var4 = 0;
                  L3: while (true) {
                    if (param1.length() <= var4) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (0 == (var2.indexOf((int) param1.charAt(var4)) ^ -1)) {
                        stackIn_13_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        var4++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_18_0 = 0;
              return stackIn_18_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref2);

            stackIn_21_1 = new StringBuilder().append("sj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_13_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    sj(mg param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_a = param2;
            this.field_f = param6;
            this.field_h = param1;
            this.field_b = param5;
            this.field_e = param0;
            this.field_c = param4;
            this.field_g = param3;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
