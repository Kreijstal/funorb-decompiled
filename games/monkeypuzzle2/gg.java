/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_b;
    private le[] field_a;

    final static String a(String[] args, String param1, boolean param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
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
        byte[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_18_0 = 0;
        boolean stackIn_22_0 = false;
        String stackIn_37_0 = null;
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
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_17_0 = 0;
        boolean stackOut_21_0 = false;
        String stackOut_36_0 = null;
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
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              stackOut_2_0 = var6_int ^ -1;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  if (stackIn_3_0 > -1) {
                    break L3;
                  } else {
                    var5 = 2 + var6_int;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          stackOut_6_0 = re.a(-49, param1.charAt(var5));
                          stackIn_3_0 = stackOut_6_0 ? 1 : 0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var11 != 0) {
                            continue L2;
                          } else {
                            if (!stackIn_7_0) {
                              break L5;
                            } else {
                              var5++;
                              if (var11 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var7_ref_String = param1.substring(var6_int - -2, var5);
                      if (!ra.a((CharSequence) ((Object) var7_ref_String), (byte) 84)) {
                        continue L1;
                      } else {
                        L6: {
                          if (var3_int <= var5) {
                            break L6;
                          } else {
                            if (62 == param1.charAt(var5)) {
                              var5++;
                              var8 = vi.a(61, (CharSequence) ((Object) var7_ref_String));
                              var4 = var4 + (args[var8].length() - -var6_int - var5);
                              break L6;
                            } else {
                              break L6;
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
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L7: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        L11: {
                          if (stackIn_18_0 > var8) {
                            break L11;
                          } else {
                            var5 = 2 + var8;
                            L12: while (true) {
                              L13: {
                                if (var3_int <= var5) {
                                  break L13;
                                } else {
                                  stackOut_21_0 = re.a(-49, param1.charAt(var5));
                                  stackIn_18_0 = stackOut_21_0 ? 1 : 0;
                                  stackIn_22_0 = stackOut_21_0;
                                  if (var11 != 0) {
                                    continue L8;
                                  } else {
                                    if (!stackIn_22_0) {
                                      break L13;
                                    } else {
                                      var5++;
                                      if (var11 == 0) {
                                        continue L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              var9 = param1.substring(var8 - -2, var5);
                              if (!ra.a((CharSequence) ((Object) var9), (byte) -128)) {
                                continue L7;
                              } else {
                                var14 = var3_int ^ -1;
                                var13 = var5 ^ -1;
                                if (var11 != 0) {
                                  if (var13 == var14) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  L14: {
                                    if (var13 <= var14) {
                                      break L14;
                                    } else {
                                      if (param1.charAt(var5) != 62) {
                                        break L14;
                                      } else {
                                        var5++;
                                        var10 = vi.a(43, (CharSequence) ((Object) var9));
                                        discarded$3 = var6.append(param1.substring(var7, var8));
                                        discarded$4 = var6.append(args[var10]);
                                        var7 = var5;
                                        break L14;
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    continue L7;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                        }
                        discarded$5 = var6.append(param1.substring(var7));
                        if (param2) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                      var12 = (byte[]) null;
                      gg.a((int[]) null, 25, (byte[]) null, 86, -42);
                      break L9;
                    }
                    stackOut_36_0 = var6.toString();
                    stackIn_37_0 = stackOut_36_0;
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
            stackOut_38_0 = (RuntimeException) (var3);
            stackOut_38_1 = new StringBuilder().append("gg.F(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (args == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L15;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L15;
            }
          }
          L16: {
            stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param2 + ')');
        }
        return stackIn_37_0;
    }

    final static void a(int[] param0, int param1, byte[] param2, int param3, int param4) {
        String discarded$29 = null;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 > 71) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$29 = gg.a((String[]) null, (String) null, false);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= hb.field_l.length) {
                break L0;
              } else {
                param3 = hb.field_l[var5_int];
                if (var7 == 0) {
                  var6 = var5_int << 1288141156;
                  L3: while (true) {
                    L4: {
                      incrementValue$30 = param3;
                      param3--;
                      if (-1 == (incrementValue$30 ^ -1)) {
                        var5_int++;
                        break L4;
                      } else {
                        incrementValue$31 = var6;
                        var6++;
                        param1 = dj.field_c[incrementValue$31];
                        param0[param2[param1]] = param0[param2[param1]] + 1;
                        dj.field_c[param0[param2[param1]]] = param1;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    continue L2;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("gg.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 5) {
            field_b = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        lb.a(param1, param0, (byte) -123, this.field_a, param3, param4);
        if (param2) {
            this.field_a = (le[]) null;
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
            field_b = (String) null;
            return (int)(1000000000L / ed.field_d);
        }
        return (int)(1000000000L / ed.field_d);
    }

    final static dk b(int param0) {
        if (param0 == -11451) {
          if (null == ok.field_f) {
            ok.field_f = new dk();
            ok.field_f.a(t.field_z, false);
            ok.field_f.field_m = pf.field_c;
            ok.field_f.field_p = 6;
            ok.field_f.field_f = 4;
            ok.field_f.field_b = 14;
            ok.field_f.field_r = 7697781;
            ok.field_f.field_k = 0;
            ok.field_f.field_n = 5;
            ok.field_f.field_s = 2763306;
            return ok.field_f;
          } else {
            return ok.field_f;
          }
        } else {
          return (dk) null;
        }
    }

    gg(le[] param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Log in / Create account";
    }
}
