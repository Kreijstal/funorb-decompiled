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
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
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
        String stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_37_0 = null;
        String stackOut_36_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        try {
          L0: {
            var4 = param1.toLowerCase();
            var5 = null;
            var6 = 0;
            L1: while (true) {
              if (var6 >= lb.field_P.length) {
                L2: {
                  if (param2 == 4) {
                    break L2;
                  } else {
                    field_c = (vh) null;
                    break L2;
                  }
                }
                L3: {
                  if (var5 == null) {
                    stackOut_37_0 = (String) (param1);
                    stackIn_38_0 = stackOut_37_0;
                    break L3;
                  } else {
                    stackOut_36_0 = ((StringBuilder) (var5)).toString();
                    stackIn_38_0 = stackOut_36_0;
                    break L3;
                  }
                }
                break L0;
              } else {
                var7 = lb.field_P[var6];
                var8 = 0;
                L4: while (true) {
                  if (var8 >= var7.length) {
                    var6++;
                    continue L1;
                  } else {
                    L5: {
                      var9 = var7[var8];
                      if (var9 != null) {
                        var10 = var9.length();
                        if (var10 != 0) {
                          var13 = new StringBuilder(param1.length());
                          var5 = var13;
                          var11 = 0;
                          L6: while (true) {
                            var12 = var4.indexOf(var9, var11);
                            if (var12 != -1) {
                              L7: {
                                if (var12 <= 0) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (vq.a(var4.charAt(var12 + -1), param2 ^ 22991)) {
                                      break L8;
                                    } else {
                                      if (var4.charAt(var12 - 1) == 35) {
                                        break L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (-36 != (var4.charAt(var12 - 1) ^ -1)) {
                                      discarded$9 = ((StringBuilder) (var5)).append(param1.substring(var11, 1 + var12));
                                      break L9;
                                    } else {
                                      discarded$10 = ((StringBuilder) (var5)).append(param1.substring(var11, -1 + var12));
                                      discarded$11 = ((StringBuilder) (var5)).append(param1.charAt(var12));
                                      break L9;
                                    }
                                  }
                                  var11 = 1 + var12;
                                  continue L6;
                                }
                              }
                              L10: {
                                if (var4.length() <= var12 + var10) {
                                  break L10;
                                } else {
                                  if (vq.a(var4.charAt(var12 - -var10), 22987)) {
                                    discarded$12 = ((StringBuilder) (var5)).append(param1.substring(var11, var12 - -1));
                                    var11 = 1 + var12;
                                    continue L6;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                discarded$13 = ((StringBuilder) (var5)).append(param1.substring(var11, var12));
                                if (param3 != null) {
                                  discarded$14 = var13.append(param3);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              discarded$15 = ((StringBuilder) (var5)).append(param1.substring(var12, var12 + var10));
                              var11 = var10 + var12;
                              if (param0 == null) {
                                continue L6;
                              } else {
                                discarded$16 = var13.append(param0);
                                continue L6;
                              }
                            } else {
                              L12: {
                                if (var11 != 0) {
                                  discarded$17 = ((StringBuilder) (var5)).append(param1.substring(var11, param1.length()));
                                  break L12;
                                } else {
                                  var5 = new StringBuilder(param1);
                                  break L12;
                                }
                              }
                              param1 = ((StringBuilder) (var5)).toString();
                              var4 = param1.toLowerCase();
                              break L5;
                            }
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var8++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4_ref = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var4_ref);
            stackOut_39_1 = new StringBuilder().append("ef.D(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L13;
            }
          }
          L14: {
            stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L14;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L14;
            }
          }
          L15: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param3 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L15;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L15;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
        }
        return stackIn_38_0;
    }

    final static void a(int param0) {
        cm.field_L = new String[cd.field_a];
        cm.field_L[11] = wc.field_d;
        cm.field_L[18] = vq.field_bc;
        cm.field_L[15] = jd.field_e;
        cm.field_L[9] = ab.field_e;
        cm.field_L[20] = p.field_b;
        cm.field_L[4] = kf.field_l;
        if (param0 >= -12) {
            String var2 = (String) null;
            ef.a(20, (dd) null, (String) null);
        }
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
            if (param0 != -2107) {
                ef.a(3, 47, -112);
            }
            wa.field_gb = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ef.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        oq var3 = ej.field_j;
        var3.b(false, param2);
        var3.a(param1, false);
        var3.a(10, false);
        var3.a((byte) -81, param0);
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 1) {
            field_e = (String) null;
        }
        field_e = null;
    }

    static {
        field_e = "Remove <%0> from friend list";
    }
}
