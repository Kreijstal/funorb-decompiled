/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qlb implements dja {
    static int field_a;

    public final tv a(byte param0) {
        int var2 = -87 / ((param0 - -64) / 50);
        return null;
    }

    final static Object[] a(Object[] param0, Object param1, dja param2, boolean param3, boolean param4, int param5) {
        tv[] stackIn_7_0 = null;
        Object[] stackIn_18_0 = null;
        tv[] stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        tv[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        tv[] var12 = null;
        int var13 = 0;
        iu var14 = null;
        iu var15 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param5 == 1) {
                break L1;
              } else {
                ((boolean[]) (param0[0]))[0] = ((boolean[]) (param0[0]))[1];
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (-1 != (param0.length ^ -1)) {
                  L3: {
                    L4: {
                      L5: {
                        if (param3) {
                          var6_int = 0;
                          L6: while (true) {
                            if (var6_int >= param0.length) {
                              var12 = param2.a(11995, param0.length - -1);
                              var6 = var12;
                              if (!param4) {
                                break L4;
                              } else {
                                var7 = 0;
                                var15 = (iu) (param1);
                                var9 = 0;
                                L7: while (true) {
                                  if (param0.length <= var9) {
                                    break L5;
                                  } else {
                                    if (var15.a(param0[var9], true) <= 0) {
                                      break L5;
                                    } else {
                                      var7++;
                                      var9++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (param1 != param0[var6_int]) {
                                var6_int++;
                                continue L6;
                              } else {
                                stackIn_18_0 = (Object[]) (param0);
                                decompiledRegionSelector0 = 1;
                                break L0;
                              }
                            }
                          }
                        } else {
                          var12 = param2.a(11995, param0.length - -1);
                          var6 = var12;
                          if (!param4) {
                            break L4;
                          } else {
                            var7 = 0;
                            var14 = (iu) (param1);
                            var9 = 0;
                            L8: while (true) {
                              if (param0.length <= var9) {
                                break L5;
                              } else {
                                if (var14.a(param0[var9], true) <= 0) {
                                  break L5;
                                } else {
                                  var7++;
                                  var9++;
                                  continue L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      var9 = 0;
                      L9: while (true) {
                        if (var9 >= var7) {
                          var6[var7] = (tv) (param1);
                          var9 = var7;
                          L10: while (true) {
                            if (var9 >= param0.length) {
                              break L3;
                            } else {
                              var6[1 + var9] = (tv) (param0[var9]);
                              var9++;
                              continue L10;
                            }
                          }
                        } else {
                          var6[var9] = (tv) (param0[var9]);
                          var9++;
                          continue L9;
                        }
                      }
                    }
                    var13 = 0;
                    var7 = var13;
                    L11: while (true) {
                      if (param0.length <= var13) {
                        var6[param0.length] = (tv) (param1);
                        break L3;
                      } else {
                        var12[var13] = (tv) (param0[var13]);
                        var13++;
                        continue L11;
                      }
                    }
                  }
                  stackIn_36_0 = (tv[]) (var6);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            var6 = param2.a(11995, 1);
            var6 = var6;
            var6[0] = (tv) (param1);
            stackIn_7_0 = (tv[]) (var6);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6_ref = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var6_ref);

            stackIn_39_1 = new StringBuilder().append("qlb.C(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L12;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

            if (param1 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L13;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L14;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L14;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_40_0), stackIn_46_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_36_0;
          }
        }
    }

    final static void b(byte param0) {
        if (param0 != -75) {
            qlb.b((byte) 0);
        }
        kl.a(vpa.b((byte) -119), 0);
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = -48;
        }
        return (tv[]) ((Object) new dmb[param1]);
    }

    static {
        field_a = 0;
    }
}
