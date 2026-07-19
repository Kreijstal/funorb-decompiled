/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_d;
    static bi field_c;
    static int[] field_a;
    static String[] field_b;

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                q.a(false);
                break L1;
              }
            }
            stackOut_2_0 = e.a(param0, false, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("q.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static rh a(int param0, int param1) {
        if (param0 != 8192) {
            return (rh) null;
        }
        return ag.a(false, param1, false, 1, true, param0 + -8191);
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oa var4_ref_oa = null;
        Object var5 = null;
        int var6 = 0;
        kf var9 = null;
        ih var10 = null;
        byte[] var14 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = ae.field_a;
              if (param0) {
                break L1;
              } else {
                field_c = (bi) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = var10.e(false);
                if (-1 == (var2 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (1 != var2) {
                      break L4;
                    } else {
                      var3 = var10.c((byte) 122);
                      var4_ref_oa = (oa) ((Object) cf.field_d.c((byte) 47));
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var4_ref_oa == null) {
                              break L7;
                            } else {
                              stackOut_7_0 = var3;
                              stackIn_15_0 = stackOut_7_0;
                              stackIn_8_0 = stackOut_7_0;
                              if (var6 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  if (stackIn_8_0 != var4_ref_oa.field_i) {
                                    break L8;
                                  } else {
                                    if (var6 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var4_ref_oa = (oa) ((Object) cf.field_d.b((byte) -105));
                                if (var6 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var4_ref_oa == null) {
                            stackOut_14_0 = -28354;
                            stackIn_15_0 = stackOut_14_0;
                            break L6;
                          } else {
                            var4_ref_oa.c(-1);
                            if (var6 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        k.c(stackIn_15_0);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  ud.a("A1: " + ak.a(true), (Throwable) null, 0);
                  k.c(-28354);
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var9 = (kf) ((Object) hd.field_a.c((byte) 47));
              if (var9 != null) {
                L9: {
                  L10: {
                    var4 = var10.e(false);
                    if (var4 != 0) {
                      break L10;
                    } else {
                      var5 = null;
                      if (var6 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var14 = new byte[var4];
                  var10.b(var14, 0, -88, var4);
                  break L9;
                }
                var10.field_i = var10.field_i + 4;
                if (var10.g(-124)) {
                  var9.c(-1);
                  break L2;
                } else {
                  k.c(-28354);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                k.c(-28354);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "q.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        rh discarded$0 = null;
        field_b = null;
        field_a = null;
        if (param0 != -127) {
            discarded$0 = q.a(30, 25);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_a = new int[8192];
        field_b = new String[]{"All scores", "My scores", "Best each"};
    }
}
