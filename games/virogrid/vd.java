/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends wa implements fg {
    private le field_U;
    static mg[] field_Y;
    static String field_X;
    static en field_Z;
    private int field_W;
    static String field_V;

    vd(String param0, cd param1, int param2) {
        super(param0, param1, param2);
    }

    final String d(int param0) {
        if (this.field_p) {
          if (this.field_h != null) {
            km.a(this.field_g + (-this.field_W + nl.field_u), hk.field_Jb, -83);
            if (param0 <= 35) {
              return (String) null;
            } else {
              return this.field_h;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void l(int param0) {
        field_X = null;
        field_Z = null;
        if (param0 != -1) {
          field_Y = (mg[]) null;
          field_V = null;
          field_Y = null;
          return;
        } else {
          field_V = null;
          field_Y = null;
          return;
        }
    }

    final static hh a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        hh var5 = null;
        hh stackIn_4_0 = null;
        hh stackIn_8_0 = null;
        hh stackIn_11_0 = null;
        hh stackIn_14_0 = null;
        hh stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() == 0) {
                  break L1;
                } else {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackIn_8_0 = a.field_H;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int + 1);
                    if (param1 > 6) {
                      var5 = j.a(var3, 0);
                      if (var5 == null) {
                        stackIn_16_0 = qc.a(28320, var4);
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        stackIn_14_0 = (hh) (var5);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackIn_11_0 = (hh) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_4_0 = pi.field_b;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("vd.DA(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                return stackIn_16_0;
              }
            }
          }
        }
    }

    final void e(int param0) {
        super.e(param0);
        if (null != this.field_U) {
            this.field_U.b(false);
        }
    }

    final void a(le param0, byte param1) {
        try {
            this.field_U = param0;
            if (param1 <= 124) {
                field_X = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "vd.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final le a(int param0) {
        if (param0 != -1) {
            return (le) null;
        }
        return this.field_U;
    }

    final void a(int param0, int param1, fi param2, int param3) {
        super.a(param0, 114, param2, param3);
        if (param1 < 113) {
            return;
        }
        try {
            this.field_W = nl.field_u - (this.field_l + param0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "vd.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_V = "This password contains repeated characters, and would be easy to guess";
        field_X = null;
    }
}
