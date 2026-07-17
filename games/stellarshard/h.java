/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static wb field_a;
    static int field_d;
    static int field_c;
    static int field_b;

    final static String a(String param0, int param1, String[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_26_0 = false;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_21_0 = 0;
        boolean stackOut_25_0 = false;
        String stackOut_37_0 = null;
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
        var11 = stellarshard.field_B;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= ~var6_int) {
                      break L4;
                    } else {
                      if (var11 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_5_0 = var6_int - -2;
                  stackIn_7_0 = stackOut_5_0;
                  L5: while (true) {
                    var5 = stackIn_7_0;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          stackOut_9_0 = bh.a(param1 + -1, param0.charAt(var5));
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
                      var7_ref_String = param0.substring(2 + var6_int, var5);
                      if (!rg.a((byte) 19, (CharSequence) (Object) var7_ref_String)) {
                        continue L1;
                      } else {
                        stackOut_14_0 = var5;
                        stackOut_14_1 = var3_int;
                        stackIn_6_0 = stackOut_14_0;
                        stackIn_6_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var11 != 0) {
                          stackOut_6_0 = stackIn_6_0 - stackIn_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          continue L5;
                        } else {
                          L8: {
                            if (stackIn_15_0 >= stackIn_15_1) {
                              break L8;
                            } else {
                              if (param0.charAt(var5) == 62) {
                                var5++;
                                var8 = pf.a((CharSequence) (Object) var7_ref_String, (byte) 125);
                                var4 = var4 + (param2[var8].length() - (var5 - var6_int));
                                break L8;
                              } else {
                                break L8;
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
                    }
                  }
                }
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = param1;
                L9: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  stackOut_21_0 = -1;
                  stackIn_22_0 = stackOut_21_0;
                  L10: while (true) {
                    L11: {
                      if (stackIn_22_0 < ~var8) {
                        StringBuilder discarded$3 = var6.append(param0.substring(var7));
                        break L11;
                      } else {
                        var5 = 2 + var8;
                        L12: while (true) {
                          L13: {
                            if (var5 >= var3_int) {
                              break L13;
                            } else {
                              stackOut_25_0 = bh.a(-1, param0.charAt(var5));
                              stackIn_22_0 = stackOut_25_0 ? 1 : 0;
                              stackIn_26_0 = stackOut_25_0;
                              if (var11 != 0) {
                                continue L10;
                              } else {
                                if (!stackIn_26_0) {
                                  break L13;
                                } else {
                                  var5++;
                                  continue L12;
                                }
                              }
                            }
                          }
                          var9 = param0.substring(2 + var8, var5);
                          if (!rg.a((byte) 19, (CharSequence) (Object) var9)) {
                            continue L9;
                          } else {
                            if (var11 != 0) {
                              break L11;
                            } else {
                              L14: {
                                if (var5 >= var3_int) {
                                  break L14;
                                } else {
                                  if (param0.charAt(var5) == 62) {
                                    var5++;
                                    var10 = pf.a((CharSequence) (Object) var9, (byte) 125);
                                    StringBuilder discarded$4 = var6.append(param0.substring(var7, var8));
                                    var7 = var5;
                                    StringBuilder discarded$5 = var6.append(param2[var10]);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                    stackOut_37_0 = var6.toString();
                    stackIn_38_0 = stackOut_37_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var3;
            stackOut_39_1 = new StringBuilder().append("h.A(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L15;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L15;
            }
          }
          L16: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(44).append(param1).append(44);
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L16;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L16;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 41);
        }
        return stackIn_38_0;
    }

    final static boolean a(ka param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param0.f(-31156);
              if (var2_int == 1) {
                stackOut_2_0 = 1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            field_d = 3;
            stackOut_3_0 = var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("h.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 24 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static sk a(String param0, byte param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        sk stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        sk stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              if (param1 <= -95) {
                break L1;
              } else {
                boolean discarded$2 = h.a((ka) null, 24);
                break L1;
              }
            }
            L2: {
              L3: {
                var6 = null;
                if (param3.indexOf('@') != -1) {
                  break L3;
                } else {
                  var7 = (CharSequence) (Object) param3;
                  var4_long = nd.a(var7, (byte) -35);
                  if (stellarshard.field_B == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = (Object) (Object) param3;
              break L2;
            }
            stackOut_5_0 = wf.a(var4_long, (String) var6, -79, param0, param2);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("h.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= 20) {
            return;
        }
        field_c = -122;
    }

    final static void a(int param0, int param1) {
        Object var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = stellarshard.field_B;
        try {
          L0: {
            var2 = (Object) (Object) (le) (Object) fg.field_G.b(-126);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    nh.a((le) var2, (byte) -30, param1);
                    var2 = (Object) (Object) (le) (Object) fg.field_G.b((byte) -32);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2 = (Object) (Object) gg.field_b.b(-109);
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2 == null) {
                      break L6;
                    } else {
                      ff.a(1, param1);
                      var2 = (Object) (Object) gg.field_b.b((byte) 103);
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param0 <= -25) {
                    break L5;
                  } else {
                    sk discarded$2 = h.a((String) null, (byte) 67, false, (String) null);
                    return;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw ma.a((Throwable) var2, "h.C(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new wb();
        field_c = -1;
        field_b = 4;
    }
}
