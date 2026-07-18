/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qlb implements dja {
    static int field_a;

    public final tv a(byte param0) {
        int var2 = -87 / ((param0 - -64) / 50);
        return null;
    }

    final static Object[] a(Object[] param0, Object param1, dja param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        tv[] var6_array = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        tv[] var12 = null;
        int var13 = 0;
        iu var14 = null;
        iu var15 = null;
        tv[] stackIn_5_0 = null;
        Object[] stackIn_16_0 = null;
        tv[] stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object[] stackOut_15_0 = null;
        tv[] stackOut_33_0 = null;
        tv[] stackOut_4_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length != 0) {
                  L2: {
                    L3: {
                      L4: {
                        if (param3) {
                          var6_int = 0;
                          L5: while (true) {
                            if (var6_int >= param0.length) {
                              var12 = param2.a(11995, param0.length - -1);
                              var6_array = var12;
                              if (!param4) {
                                break L3;
                              } else {
                                var7 = 0;
                                var15 = (iu) param1;
                                var9 = 0;
                                L6: while (true) {
                                  if (param0.length <= var9) {
                                    break L4;
                                  } else {
                                    if (var15.a(param0[var9], true) <= 0) {
                                      break L4;
                                    } else {
                                      var7++;
                                      var9++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (param1 != param0[var6_int]) {
                                var6_int++;
                                continue L5;
                              } else {
                                stackOut_15_0 = (Object[]) param0;
                                stackIn_16_0 = stackOut_15_0;
                                return stackIn_16_0;
                              }
                            }
                          }
                        } else {
                          var12 = param2.a(11995, param0.length - -1);
                          var6_array = var12;
                          if (!param4) {
                            break L3;
                          } else {
                            var7 = 0;
                            var14 = (iu) param1;
                            var9 = 0;
                            L7: while (true) {
                              if (param0.length <= var9) {
                                break L4;
                              } else {
                                if (var14.a(param0[var9], true) <= 0) {
                                  break L4;
                                } else {
                                  var7++;
                                  var9++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        }
                      }
                      var9 = 0;
                      L8: while (true) {
                        if (var9 >= var7) {
                          var6_array[var7] = (tv) (Object) param0;
                          var9 = var7;
                          L9: while (true) {
                            if (var9 >= param0.length) {
                              break L2;
                            } else {
                              var6_array[1 + var9] = (tv) param0[var9];
                              var9++;
                              continue L9;
                            }
                          }
                        } else {
                          var6_array[var9] = (tv) param0[var9];
                          var9++;
                          continue L8;
                        }
                      }
                    }
                    var13 = 0;
                    var7 = var13;
                    L10: while (true) {
                      if (param0.length <= var13) {
                        var6_array[param0.length] = (tv) (Object) param0;
                        break L2;
                      } else {
                        var12[var13] = (tv) param0[var13];
                        var13++;
                        continue L10;
                      }
                    }
                  }
                  stackOut_33_0 = (tv[]) var6_array;
                  stackIn_34_0 = stackOut_33_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6_array = param2.a(11995, 1);
            var6_array = var6_array;
            var6_array[0] = (tv) (Object) param0;
            stackOut_4_0 = (tv[]) var6_array;
            stackIn_5_0 = stackOut_4_0;
            return (Object[]) (Object) stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var6;
            stackOut_35_1 = new StringBuilder().append("qlb.C(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L11;
            }
          }
          L12: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L12;
            }
          }
          L13: {
            stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param3 + ',' + param4 + ',' + 1 + ')');
        }
        return (Object[]) (Object) stackIn_34_0;
    }

    final static void b(byte param0) {
        if (param0 != -75) {
            qlb.b((byte) 0);
        }
        int discarded$0 = 0;
        kl.a(vpa.b((byte) -119));
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = -48;
        }
        return (tv[]) (Object) new dmb[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
