/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends sh {
    static String field_v;
    static int field_t;
    private Object field_u;

    final Object e(byte param0) {
        if (param0 != 97) {
            vk.g(24);
        }
        return this.field_u;
    }

    public static void g(int param0) {
        int var1 = 93 % ((param0 - -35) / 38);
        field_v = null;
    }

    final static char a(byte param0, int param1, ih param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var4_int = 119;
              var5 = param2.a((char) var4_int);
              var6 = param1;
              if (param0 <= -47) {
                break L1;
              } else {
                vk.g(-66);
                break L1;
              }
            }
            L2: while (true) {
              if (param3 < var6) {
                stackIn_11_0 = var4_int;
                break L0;
              } else {
                L3: {
                  if (ml.a((char)var6, 21654)) {
                    var7 = param2.a((char)var6);
                    if (var5 < var7) {
                      var4_int = (char)var6;
                      var5 = var7;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("vk.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return (char) stackIn_11_0;
    }

    vk(Object param0, int param1) {
        super(param1);
        try {
            this.field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static tk a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tk stackIn_4_0 = null;
        tk stackIn_7_0 = null;
        tk stackIn_10_0 = null;
        tk stackIn_19_0 = null;
        tk stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackIn_4_0 = mf.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) >= -64) {
                if (param1 < -8) {
                  var3 = 0;
                  L1: while (true) {
                    if (var3 < var2_int) {
                      L2: {
                        var4 = param0.charAt(var3);
                        if (45 != var4) {
                          if (0 != (jd.field_b.indexOf(var4) ^ -1)) {
                            break L2;
                          } else {
                            stackIn_22_0 = wh.field_p;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        } else {
                          L3: {
                            if (0 == var3) {
                              break L3;
                            } else {
                              if (var3 == -1 + var2_int) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackIn_19_0 = wh.field_p;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                      var3++;
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackIn_10_0 = (tk) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = d.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("vk.G(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return stackIn_22_0;
              }
            }
          }
        }
    }

    final boolean d(byte param0) {
        if (param0 != 120) {
            field_v = (String) null;
            return false;
        }
        return false;
    }

    static {
    }
}
