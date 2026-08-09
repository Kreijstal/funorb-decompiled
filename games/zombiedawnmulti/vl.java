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
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        String stackIn_23_0 = null;
        int stackIn_25_0 = 0;
        boolean stackIn_29_0 = false;
        String stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        boolean stackOut_28_0;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              stackIn_3_0 = var6_int;
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
                    stackIn_25_0 = var8;
                    L11: while (true) {
                      L12: {
                        L13: {
                          if (stackIn_25_0 < 0) {
                            break L13;
                          } else {
                            var5 = var8 + 2;
                            L14: while (true) {
                              L15: {
                                if (var3_int <= var5) {
                                  break L15;
                                } else {
                                  stackOut_28_0 = vh.a(param0.charAt(var5), (byte) 85);
                                  stackIn_25_0 = stackOut_28_0 ? 1 : 0;
                                  stackIn_29_0 = stackOut_28_0;
                                  if (var11 != 0) {
                                    continue L11;
                                  } else {
                                    if (!stackIn_29_0) {
                                      break L15;
                                    } else {
                                      var5++;
                                      if (var11 == 0) {
                                        continue L14;
                                      } else {
                                        break L15;
                                      }
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
                                  L16: {
                                    if (var5 >= var3_int) {
                                      break L16;
                                    } else {
                                      if (param0.charAt(var5) != 62) {
                                        break L16;
                                      } else {
                                        var5++;
                                        var10 = md.a((CharSequence) ((Object) var9), param2 ^ -9157);
                                        discarded$0 = var6.append(param0.substring(var7, var8));
                                        var7 = var5;
                                        discarded$1 = var6.append(param1[var10]);
                                        break L16;
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    continue L10;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                        }
                        discarded$2 = var6.append(param0.substring(var7));
                        break L12;
                      }
                      stackIn_40_0 = var6.toString();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  stackIn_23_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var3);

            stackIn_43_1 = new StringBuilder().append("vl.B(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L17;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_46_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');

            if (param1 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L18;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L18;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_44_0), stackIn_47_2 + ',' + param2 + ')');
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("vl.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
        int var2;
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
