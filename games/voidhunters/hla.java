/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hla {
    static int[] field_a;
    static String field_b;

    final static tv[] a(Class[] param0, tv[] param1, dja[] param2, int param3, tv[] param4, int param5, dja param6) {
        tv dupTemp$0 = null;
        Object stackIn_3_0 = null;
        tv[] stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        tv var9 = null;
        Class var10 = null;
        tv var11 = null;
        int var12 = 0;
        tv var13 = null;
        tv var14 = null;
        int var15 = 0;
        tv var16 = null;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                L2: {
                  if (param4 == null) {
                    break L2;
                  } else {
                    if (param4.length == param1.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param4 = param6.a(11995, param1.length);
                break L1;
              }
              var7_int = 97 / ((param3 - -68) / 42);
              var8 = 0;
              L3: while (true) {
                if (param1.length <= var8) {
                  stackIn_25_0 = (tv[]) (param4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var9 = param1[var8];
                    if (var9 == null) {
                      param4[var8] = null;
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          var10 = param1[var8].getClass();
                          var16 = param4[var8];
                          var11 = var16;
                          if (var16 == null) {
                            break L6;
                          } else {
                            if (var16.getClass() != var10) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        dupTemp$0 = udb.a(param0, param2, var10, -82);
                        param4[var8] = dupTemp$0;
                        var11 = dupTemp$0;
                        break L5;
                      }
                      var12 = param5;
                      var13 = var9;
                      var14 = var11;
                      if (-2 == (var12 ^ -1)) {
                        var13.b((byte) 114, var14);
                        break L4;
                      } else {
                        if (2 != var12) {
                          if (-4 != (var12 ^ -1)) {
                            break L4;
                          } else {
                            ((sjb) ((Object) var13)).a(var14, (byte) 39);
                            break L4;
                          }
                        } else {
                          ((tva) ((Object) var13)).a(var14, 29106);
                          break L4;
                        }
                      }
                    }
                  }
                  var8++;
                  continue L3;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var7);

            stackIn_28_1 = new StringBuilder().append("hla.A(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L11;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tv[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_25_0;
        }
    }

    public static void a(byte param0) {
        if (param0 != 39) {
            field_a = (int[]) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "Repair";
    }
}
