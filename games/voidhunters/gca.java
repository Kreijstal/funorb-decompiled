/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gca extends rqa {
    static char[] field_q;
    static String field_o;
    static String field_p;
    static lkb field_r;

    gca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              stackIn_4_0 = new nc(frb.a(202, 84));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("gca.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static sg a(pe param0, byte param1, int param2, sg param3) {
        Object stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        sg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sg[] var13 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var13 = param0.d(1000);
              var5 = 2147483647;
              if (-1 >= (param3.q((byte) 113) ^ -1)) {
                break L1;
              } else {
                var5 = cab.field_p;
                break L1;
              }
            }
            var6 = null;
            var7 = 0;
            L2: while (true) {
              if (var13.length <= var7) {
                L3: {
                  if (param1 == 63) {
                    break L3;
                  } else {
                    field_o = (String) null;
                    break L3;
                  }
                }
                stackIn_24_0 = var6;
                break L0;
              } else {
                L4: {
                  var8 = var13[var7];
                  if (var8 == null) {
                    break L4;
                  } else {
                    if (param3 == var8) {
                      break L4;
                    } else {
                      L5: {
                        if (var8.q((byte) 71) != param3.q((byte) 84)) {
                          break L5;
                        } else {
                          if (var8.q((byte) 86) != sja.field_c) {
                            break L4;
                          } else {
                            if (var8.o((byte) -117) == param2) {
                              break L4;
                            } else {
                              if (null == var8.k((byte) -108)) {
                                break L5;
                              } else {
                                if (var8.k((byte) -108).a((byte) 66) != param2) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      L6: {
                        if (!param3.g(false)) {
                          break L6;
                        } else {
                          if (!param0.a((anb) (var8), 119)) {
                            break L6;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var9 = var8.field_d + -param3.field_d;
                      var10 = var8.field_e - param3.field_e;
                      var11 = ar.a(var9, (byte) 107, var10);
                      if (var5 > var11) {
                        var5 = var11;
                        var6 = var8;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("gca.C(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ')');
        }
        return (sg) ((Object) stackIn_24_0);
    }

    public static void a(int param0) {
        sg var2;
        field_o = null;
        if (param0 > -110) {
          var2 = (sg) null;
          gca.a((pe) null, (byte) -124, 125, (sg) null);
          field_p = null;
          field_q = null;
          field_r = null;
          return;
        } else {
          field_p = null;
          field_q = null;
          field_r = null;
          return;
        }
    }

    final static int[] a(byte param0, int[] param1) {
        int[] stackIn_12_0 = null;
        int[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = 0;
            var3_int = 0;
            L1: while (true) {
              if (param1.length <= var3_int) {
                var10 = new int[-(var2_int * 2) + (param1.length + param1.length)];
                var9 = var10;
                var3 = var9;
                var4 = 0;
                L2: while (true) {
                  if (param1.length <= var4) {
                    var4 = param1.length;
                    if (param0 >= 63) {
                      var5 = -2 + param1.length;
                      L3: while (true) {
                        if (-1 < (var5 ^ -1)) {
                          stackIn_21_0 = (int[]) (var3);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L4: {
                            var6 = param1[var5];
                            var7 = param1[1 + var5];
                            if (var7 != 0) {
                              var10[var4] = var6;
                              var3[var4 - -1] = -var7;
                              var4 += 2;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var5 -= 2;
                          continue L3;
                        }
                      }
                    } else {
                      stackIn_12_0 = (int[]) null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var3[var4] = param1[var4];
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L5: {
                  var4 = param1[var3_int - -1];
                  if (-1 != (var4 ^ -1)) {
                    break L5;
                  } else {
                    var2_int++;
                    break L5;
                  }
                }
                var3_int += 2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("gca.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_21_0;
        }
    }

    static {
        field_q = new char[128];
        field_o = "Power plant";
        field_p = "Honour";
        field_r = new lkb();
    }
}
