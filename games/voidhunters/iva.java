/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iva extends rqa {
    static int field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_p = -95;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(135, 116));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("iva.A(");

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(byte param0, int param1, sg param2) {
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var3_int = param2.q((byte) 87);
              if (param0 <= -3) {
                break L1;
              } else {
                field_o = 21;
                break L1;
              }
            }
            L2: {
              var4 = VoidHunters.b(var3_int, -1);
              var5 = param1;
              if (-1 != (var5 ^ -1)) {
                if (-5 == (var5 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (1 == var5) {
                      break L3;
                    } else {
                      if (-6 == (var5 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (var5 == 2) {
                            break L4;
                          } else {
                            if (var5 == 6) {
                              break L4;
                            } else {
                              if ((var5 ^ -1) == -4) {
                                stackIn_18_0 = cma.a(var4, dob.field_o, cib.field_a, (byte) -126);
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                stackIn_20_0 = cma.a(var4, dob.field_o, gu.field_o, (byte) -74);
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        stackIn_16_0 = cma.a(var4, dob.field_o, kg.field_t, (byte) -91);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  stackIn_14_0 = cma.a(var4, dob.field_o, iua.field_o, (byte) -96);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                break L2;
              }
            }
            stackIn_12_0 = cma.a(var4, dob.field_o, cib.field_a, (byte) -64);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("iva.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -6940) {
                break L1;
              } else {
                var3 = (String) null;
                iva.a(-26, (String) null);
                break L1;
              }
            }
            if (!nia.field_o) {
              break L0;
            } else {
              System.out.println(param1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("iva.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    iva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = 115;
    }
}
