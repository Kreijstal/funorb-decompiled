/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_e;
    static bi field_c;
    static boolean[] field_b;
    static String field_d;
    private oq field_a;
    static bc field_f;
    private rl field_g;

    final void a(String param0, int param1, String param2) {
        oq var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = this.field_a;
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 == 27275) {
                    break L2;
                  } else {
                    rl.a(45, true, 103, -126, true);
                    break L2;
                  }
                }
                this.field_a = new oq(param2, param0, this.field_a);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param2.equals(var4.field_d)) {
                  var4 = var4.field_f;
                  continue L1;
                } else {
                  var4.field_h = param0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("rl.C(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String a(int param0, String param1) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        StringBuilder var10 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new StringBuilder(param1.length());
              var4 = 0;
              if (param0 == 5607) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            var5 = param1.length();
            L2: while (true) {
              L3: {
                if (var4 >= var5) {
                  break L3;
                } else {
                  var6 = param1.indexOf("<%", var4);
                  if ((var6 ^ -1) > -1) {
                    discarded$4 = var10.append(param1.substring(var4, var5));
                    break L3;
                  } else {
                    discarded$5 = var10.append(param1.substring(var4, var6));
                    var4 = var6;
                    var6 = param1.indexOf(">", var4 - -2);
                    if (-1 < (var6 ^ -1)) {
                      discarded$6 = var10.append(param1.substring(var4, var5));
                      break L3;
                    } else {
                      L4: {
                        var7 = param1.substring(var4 + 2, var6);
                        var8 = this.b(88, var7);
                        if (var8 == null) {
                          break L4;
                        } else {
                          discarded$7 = var10.append(var8);
                          break L4;
                        }
                      }
                      var4 = 1 + var6;
                      continue L2;
                    }
                  }
                }
              }
              stackIn_15_0 = var10.toString();
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("rl.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 0) {
          field_d = (String) null;
          field_f = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static bc a(int param0, boolean param1, int param2, int param3, boolean param4) {
        if (param0 != -1) {
            return (bc) null;
        }
        return cc.a(param2, false, param3, param0 + 12001, param1, param4);
    }

    private final String b(int param0, String param1) {
        oq var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = this.field_a;
            var4 = 27 % ((param0 - -76) / 35);
            L1: while (true) {
              if (var3 == null) {
                if (null != this.field_g) {
                  stackIn_11_0 = this.field_g.b(-112, param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return null;
                }
              } else {
                if (param1.equals(var3.field_d)) {
                  stackIn_6_0 = var3.field_h;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3 = var3.field_f;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("rl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
        }
    }

    public rl() {
    }

    rl(rl param0) {
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Quit";
        field_e = "you lost <%0> fleets in the attack";
    }
}
