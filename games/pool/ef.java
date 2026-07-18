/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static String field_e;
    int field_d;
    int field_a;
    int field_b;
    static vh field_c;

    final static String a(String param0, String param1, byte param2, String param3) {
        String var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        StringBuilder var13 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_35_0 = null;
        String stackOut_34_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            var4 = param1.toLowerCase();
            var5 = null;
            var6 = 0;
            L1: while (true) {
              if (var6 >= lb.field_P.length) {
                L2: {
                  if (var5 == null) {
                    stackOut_35_0 = (String) param1;
                    stackIn_36_0 = stackOut_35_0;
                    break L2;
                  } else {
                    stackOut_34_0 = ((StringBuilder) var5).toString();
                    stackIn_36_0 = stackOut_34_0;
                    break L2;
                  }
                }
                break L0;
              } else {
                var7 = lb.field_P[var6];
                var8 = 0;
                L3: while (true) {
                  if (var8 >= var7.length) {
                    var6++;
                    continue L1;
                  } else {
                    L4: {
                      var9 = var7[var8];
                      if (var9 != null) {
                        var10 = var9.length();
                        if (var10 != 0) {
                          var13 = new StringBuilder(param1.length());
                          var11 = 0;
                          L5: while (true) {
                            var12 = var4.indexOf(var9, var11);
                            if (var12 != -1) {
                              L6: {
                                if (var12 <= 0) {
                                  break L6;
                                } else {
                                  L7: {
                                    int discarded$11 = 22987;
                                    if (vq.a(var4.charAt(var12 + -1))) {
                                      break L7;
                                    } else {
                                      if (var4.charAt(var12 - 1) == 35) {
                                        break L7;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  L8: {
                                    if (var4.charAt(var12 - 1) != 35) {
                                      StringBuilder discarded$12 = ((StringBuilder) var5).append(param1.substring(var11, 1 + var12));
                                      break L8;
                                    } else {
                                      StringBuilder discarded$13 = ((StringBuilder) var5).append(param1.substring(var11, -1 + var12));
                                      StringBuilder discarded$14 = ((StringBuilder) var5).append(param1.charAt(var12));
                                      break L8;
                                    }
                                  }
                                  var11 = 1 + var12;
                                  continue L5;
                                }
                              }
                              L9: {
                                if (var4.length() <= var12 + var10) {
                                  break L9;
                                } else {
                                  int discarded$15 = 22987;
                                  if (vq.a(var4.charAt(var12 - -var10))) {
                                    StringBuilder discarded$16 = ((StringBuilder) var5).append(param1.substring(var11, var12 - -1));
                                    var11 = 1 + var12;
                                    continue L5;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                StringBuilder discarded$17 = ((StringBuilder) var5).append(param1.substring(var11, var12));
                                if (param3 != null) {
                                  StringBuilder discarded$18 = var13.append(param3);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              StringBuilder discarded$19 = ((StringBuilder) var5).append(param1.substring(var12, var12 + var10));
                              var11 = var10 + var12;
                              if (param0 == null) {
                                continue L5;
                              } else {
                                StringBuilder discarded$20 = var13.append(param0);
                                continue L5;
                              }
                            } else {
                              L11: {
                                if (var11 != 0) {
                                  StringBuilder discarded$21 = ((StringBuilder) var5).append(param1.substring(var11, param1.length()));
                                  break L11;
                                } else {
                                  var5 = (Object) (Object) new StringBuilder(param1);
                                  break L11;
                                }
                              }
                              param1 = ((StringBuilder) var5).toString();
                              var4 = param1.toLowerCase();
                              break L4;
                            }
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4_ref = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var4_ref;
            stackOut_37_1 = new StringBuilder().append("ef.D(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L12;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L12;
            }
          }
          L13: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L13;
            }
          }
          L14: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(4).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param3 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L14;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L14;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ')');
        }
        return stackIn_36_0;
    }

    final static void a() {
        cm.field_L = new String[cd.field_a];
        cm.field_L[11] = wc.field_d;
        cm.field_L[18] = vq.field_bc;
        cm.field_L[15] = jd.field_e;
        cm.field_L[9] = ab.field_e;
        cm.field_L[20] = p.field_b;
        cm.field_L[4] = kf.field_l;
        cm.field_L[6] = eq.field_P;
        cm.field_L[21] = il.field_d;
        cm.field_L[7] = ri.field_O;
        cm.field_L[13] = nm.field_g;
        cm.field_L[16] = ql.field_c;
        cm.field_L[19] = sd.field_N;
        cm.field_L[5] = o.field_z;
        cm.field_L[17] = hk.field_u;
    }

    final static void a(int param0, dd param1, String param2) {
        try {
            nr.field_N = param2;
            wa.field_gb = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ef.B(" + -2107 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        oq var3 = ej.field_j;
        var3.b(false, param2);
        var3.a(3, false);
        var3.a(10, false);
        var3.a((byte) -81, param0);
    }

    public static void b() {
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Remove <%0> from friend list";
    }
}
