/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends br {
    int field_g;
    static ja field_k;
    int field_i;
    static String[] field_j;
    static int field_h;
    static ri field_f;

    final static String a(String param0, String[] param1, int param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        String stackIn_23_0 = null;
        int stackIn_25_0 = 0;
        boolean stackIn_29_0 = false;
        String stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_24_0 = 0;
        boolean stackOut_28_0 = false;
        String stackOut_39_0 = null;
        String stackOut_22_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              stackOut_2_0 = var6_int;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (stackIn_3_0 >= 0) {
                        break L5;
                      } else {
                        if (var11 != 0) {
                          break L4;
                        } else {
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var5 = var6_int + 2;
                    break L4;
                  }
                  L6: while (true) {
                    L7: {
                      if (var5 >= var3_int) {
                        break L7;
                      } else {
                        stackOut_9_0 = vh.a(param0.charAt(var5), (byte) 85);
                        stackIn_3_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          continue L2;
                        } else {
                          if (!stackIn_10_0) {
                            break L7;
                          } else {
                            var5++;
                            if (var11 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var7_ref_String = param0.substring(2 + var6_int, var5);
                      if (ti.a((byte) 87, (CharSequence) ((Object) var7_ref_String))) {
                        break L8;
                      } else {
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var5 >= var3_int) {
                        break L9;
                      } else {
                        if (param0.charAt(var5) == 62) {
                          var5++;
                          var8 = md.a((CharSequence) ((Object) var7_ref_String), -9159);
                          var4 = var4 + (var6_int - (var5 - param1[var8].length()));
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                if (param2 == 2) {
                  L10: while (true) {
                    var8 = param0.indexOf("<%", var5);
                    stackOut_24_0 = var8;
                    stackIn_25_0 = stackOut_24_0;
                    L11: while (true) {
                      L12: {
                        if (stackIn_25_0 < 0) {
                          discarded$3 = var6.append(param0.substring(var7));
                          break L12;
                        } else {
                          var5 = var8 + 2;
                          L13: while (true) {
                            L14: {
                              if (var3_int <= var5) {
                                break L14;
                              } else {
                                stackOut_28_0 = vh.a(param0.charAt(var5), (byte) 85);
                                stackIn_25_0 = stackOut_28_0 ? 1 : 0;
                                stackIn_29_0 = stackOut_28_0;
                                if (var11 != 0) {
                                  continue L11;
                                } else {
                                  if (!stackIn_29_0) {
                                    break L14;
                                  } else {
                                    var5++;
                                    continue L13;
                                  }
                                }
                              }
                            }
                            var9 = param0.substring(var8 + 2, var5);
                            if (!ti.a((byte) 74, (CharSequence) ((Object) var9))) {
                              continue L10;
                            } else {
                              if (var11 != 0) {
                                break L12;
                              } else {
                                L15: {
                                  if (var5 >= var3_int) {
                                    break L15;
                                  } else {
                                    if (param0.charAt(var5) != 62) {
                                      break L15;
                                    } else {
                                      var5++;
                                      var10 = md.a((CharSequence) ((Object) var9), param2 ^ -9157);
                                      discarded$4 = var6.append(param0.substring(var7, var8));
                                      var7 = var5;
                                      discarded$5 = var6.append(param1[var10]);
                                      break L15;
                                    }
                                  }
                                }
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                      stackOut_39_0 = var6.toString();
                      stackIn_40_0 = stackOut_39_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  stackOut_22_0 = (String) null;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var3);
            stackOut_41_1 = new StringBuilder().append("vl.B(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L16;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L16;
            }
          }
          L17: {
            stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L17;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L17;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0;
        } else {
          return stackIn_40_0;
        }
    }

    final static void a(pd param0, pd param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        pd var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              wk.field_G = param4;
              no.field_Gb = param3;
              al.field_bb = param5;
              mc.field_a = param0;
              en.field_d = param1;
              if (param2 > 43) {
                break L1;
              } else {
                var7 = (pd) null;
                vl.a((pd) null, (pd) null, -67, -110, -57, -56);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("vl.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_f = (ri) null;
          field_j = null;
          field_k = null;
          field_f = null;
          return;
        } else {
          field_j = null;
          field_k = null;
          field_f = null;
          return;
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param1 != -103) {
          field_h = -19;
          var2 = param0 >>> 821628865;
          var2 = var2 | var2 >>> 1488112865;
          var2 = var2 | var2 >>> -631341566;
          var2 = var2 | var2 >>> 1232304548;
          var2 = var2 | var2 >>> -1195661720;
          var2 = var2 | var2 >>> 2078424912;
          return param0 & (var2 ^ -1);
        } else {
          var2 = param0 >>> 821628865;
          var2 = var2 | var2 >>> 1488112865;
          var2 = var2 | var2 >>> -631341566;
          var2 = var2 | var2 >>> 1232304548;
          var2 = var2 | var2 >>> -1195661720;
          var2 = var2 | var2 >>> 2078424912;
          return param0 & (var2 ^ -1);
        }
    }

    private vl() throws Throwable {
        throw new Error();
    }

    static {
        field_j = new String[]{"By rating", "By win percentage"};
    }
}
