/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    private String field_b;
    static int field_a;
    static bd field_e;
    static int field_c;
    static bd[] field_d;

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var4 = (String) null;
                this.a(87, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = this.field_b.equals(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("fa.A(").append(param0).append(',');

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
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(String[] args, int param1, int param2, vm param3, String param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 48) {
                break L1;
              } else {
                field_e = (bd) null;
                break L1;
              }
            }
            L2: {
              var5_int = param3.a(param4);
              if (param1 < var5_int) {
                break L2;
              } else {
                if (-1 != param4.indexOf("<br>")) {
                  break L2;
                } else {
                  args[0] = param4;
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (-1 + (var5_int + param1)) / param1;
            param1 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param4.length();
            var9 = 0;
            L3: while (true) {
              if (var9 >= var8) {
                L4: {
                  if (var8 > var7) {
                    incrementValue$0 = var6;
                    var6++;
                    args[incrementValue$0] = param4.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackIn_26_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param4.charAt(var9);
                    if (var10 == 32) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param4.substring(var7, var9 + 1).trim();
                  var12 = param3.a(var11);
                  if (var12 >= param1) {
                    var7 = var9 + 1;
                    incrementValue$1 = var6;
                    var6++;
                    args[incrementValue$1] = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (62 == var10) {
                  if (param4.regionMatches(-3 + var9, "<br>", 0, 4)) {
                    incrementValue$2 = var6;
                    var6++;
                    args[incrementValue$2] = param4.substring(var7, var9 + -3).trim();
                    var7 = 1 + var9;
                    var9++;
                    continue L3;
                  } else {
                    var9++;
                    continue L3;
                  }
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("fa.D(");

            if (args == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_30_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_26_0;
        }
    }

    final void a(byte param0, java.applet.Applet param1) {
        try {
            if (param0 > -94) {
                field_e = (bd) null;
            }
            pc.a(this.field_b, "jagex-last-login-method", true, 31536000L, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "fa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    fa(String param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_c = 65;
        }
        field_d = null;
        field_e = null;
    }

    final static void a(int param0) {
        String var2 = (String) null;
        ak.a(false, (String) null, "");
        if (param0 != 5109) {
            field_e = (bd) null;
        }
    }

    static {
    }
}
