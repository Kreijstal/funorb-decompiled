/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static Object field_b;
    static ts field_a;
    private fk field_d;
    static int[] field_c;

    final static void a(int param0) {
        if (param0 != 4) {
          ic.a(7);
          jk.field_b.field_d = 0;
          jk.field_b.field_j = 0;
          return;
        } else {
          jk.field_b.field_d = 0;
          jk.field_b.field_j = 0;
          return;
        }
    }

    final void a(fr param0, boolean param1) {
        jq discarded$0 = null;
        jq discarded$1 = null;
        jq discarded$2 = null;
        try {
            if (param1) {
                field_b = (Object) null;
            }
            this.field_d = param0.a(24, true, (byte) -23, 196584, (byte[]) null);
            discarded$0 = new jq(this.field_d, 5126, 2, 0);
            discarded$1 = new jq(this.field_d, 5126, 3, 8);
            discarded$2 = new jq(this.field_d, 5121, 4, 20);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ic.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        int var1 = -37 % ((param0 - 64) / 32);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static int b(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param0 = param0 & 8191;
        if (param1 == -431) {
          if (param0 < 4096) {
            L0: {
              if (param0 >= 2048) {
                stackOut_18_0 = ce.field_p[-param0 + 4096];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = ce.field_p[param0];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param0 ^ -1) <= -6145) {
                stackOut_14_0 = -ce.field_p[8192 - param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -ce.field_p[-4096 + param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_b = (Object) null;
          if (param0 < 4096) {
            L2: {
              if (param0 >= 2048) {
                stackOut_8_0 = ce.field_p[-param0 + 4096];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = ce.field_p[param0];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param0 ^ -1) <= -6145) {
                stackOut_4_0 = -ce.field_p[8192 - param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -ce.field_p[-4096 + param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
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
        String stackIn_3_0 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_24_0 = 0;
        boolean stackIn_29_0 = false;
        String stackIn_41_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_23_0 = 0;
        boolean stackOut_28_0 = false;
        String stackOut_40_0 = null;
        String stackOut_2_0 = null;
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
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            if (param2 < -127) {
              L1: while (true) {
                var6_int = param0.indexOf("<%", var5);
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  L3: {
                    L4: {
                      L5: {
                        if (stackIn_5_0 <= var6_int) {
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
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          stackOut_11_0 = ea.a((byte) -54, param0.charAt(var5));
                          stackIn_5_0 = stackOut_11_0 ? 1 : 0;
                          stackIn_12_0 = stackOut_11_0;
                          if (var11 != 0) {
                            continue L2;
                          } else {
                            if (!stackIn_12_0) {
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
                        var7_ref_String = param0.substring(var6_int + 2, var5);
                        if (jf.a(-13181, (CharSequence) ((Object) var7_ref_String))) {
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
                        if (var3_int <= var5) {
                          break L9;
                        } else {
                          if (param0.charAt(var5) != 62) {
                            break L9;
                          } else {
                            var5++;
                            var8 = no.a((byte) -127, (CharSequence) ((Object) var7_ref_String));
                            var4 = var4 + (-var5 + var6_int + param1[var8].length());
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
                  var5 = 0;
                  var7 = 0;
                  L10: while (true) {
                    var8 = param0.indexOf("<%", var5);
                    stackOut_23_0 = var8;
                    stackIn_24_0 = stackOut_23_0;
                    L11: while (true) {
                      L12: {
                        if (stackIn_24_0 < 0) {
                          discarded$3 = var6.append(param0.substring(var7));
                          break L12;
                        } else {
                          if (var11 != 0) {
                            break L12;
                          } else {
                            var5 = var8 - -2;
                            L13: while (true) {
                              L14: {
                                if (var3_int <= var5) {
                                  break L14;
                                } else {
                                  stackOut_28_0 = ea.a((byte) -54, param0.charAt(var5));
                                  stackIn_24_0 = stackOut_28_0 ? 1 : 0;
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
                              var9 = param0.substring(2 + var8, var5);
                              if (jf.a(-13181, (CharSequence) ((Object) var9))) {
                                L15: {
                                  if (var3_int <= var5) {
                                    break L15;
                                  } else {
                                    if (param0.charAt(var5) != 62) {
                                      break L15;
                                    } else {
                                      var5++;
                                      var10 = no.a((byte) -128, (CharSequence) ((Object) var9));
                                      discarded$4 = var6.append(param0.substring(var7, var8));
                                      var7 = var5;
                                      discarded$5 = var6.append(param1[var10]);
                                      break L15;
                                    }
                                  }
                                }
                                continue L10;
                              } else {
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                      stackOut_40_0 = var6.toString();
                      stackIn_41_0 = stackOut_40_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var3);
            stackOut_42_1 = new StringBuilder().append("ic.A(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L16;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L16;
            }
          }
          L17: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L17;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L17;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_41_0;
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException var2_ref = null;
            Exception var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                    param1.getAppletContext().showDocument(td.a((byte) 126, param1, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (!param0) {
                  break L0;
                } else {
                  ic.a(111);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("ic.E(").append(param0).append(',');
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
              throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ic() {
        cw discarded$0 = new cw(786336);
        int discarded$1 = mr.a(1600, (byte) -115);
    }

    static {
        field_a = new ts(14, 0, 4, 1);
    }
}
