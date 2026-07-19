/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo {
    private String field_d;
    private boolean field_b;
    private boolean field_c;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        String[] var2 = (String[]) null;
        String discarded$0 = fo.a(70, (String) null, (String[]) null);
    }

    final String b(boolean param0) {
        if (!param0) {
            field_a = (String) null;
            return this.field_d;
        }
        return this.field_d;
    }

    final boolean a(int param0) {
        if (param0 <= 8) {
            fo.a(true);
            return this.field_c;
        }
        return this.field_c;
    }

    final static String a(int param0, String param1, String[] param2) {
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_24_0 = 0;
        boolean stackOut_28_0 = false;
        String stackOut_39_0 = null;
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
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
                  L4: {
                    L5: {
                      if (stackIn_3_0 <= -1) {
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
                    var5 = 2 + var6_int;
                    break L4;
                  }
                  L6: while (true) {
                    L7: {
                      if (var5 >= var3_int) {
                        break L7;
                      } else {
                        stackOut_9_0 = mu.a(28799, param1.charAt(var5));
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
                      var7_ref_String = param1.substring(2 + var6_int, var5);
                      if (vv.a(param0 ^ -4846, (CharSequence) ((Object) var7_ref_String))) {
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
                        if (param1.charAt(var5) == 62) {
                          var5++;
                          var8 = dq.a(param0 ^ 4761, (CharSequence) ((Object) var7_ref_String));
                          var4 = var4 + (param2[var8].length() - (var5 + -var6_int));
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
                L10: {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  if (param0 == 4800) {
                    break L10;
                  } else {
                    field_a = (String) null;
                    break L10;
                  }
                }
                var7 = 0;
                L11: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  stackOut_24_0 = -1;
                  stackIn_25_0 = stackOut_24_0;
                  L12: while (true) {
                    L13: {
                      if (stackIn_25_0 < (var8 ^ -1)) {
                        discarded$3 = var6.append(param1.substring(var7));
                        break L13;
                      } else {
                        var5 = 2 + var8;
                        L14: while (true) {
                          L15: {
                            if (var5 >= var3_int) {
                              break L15;
                            } else {
                              stackOut_28_0 = mu.a(param0 ^ 25279, param1.charAt(var5));
                              stackIn_25_0 = stackOut_28_0 ? 1 : 0;
                              stackIn_29_0 = stackOut_28_0;
                              if (var11 != 0) {
                                continue L12;
                              } else {
                                if (!stackIn_29_0) {
                                  break L15;
                                } else {
                                  var5++;
                                  continue L14;
                                }
                              }
                            }
                          }
                          var9 = param1.substring(var8 - -2, var5);
                          if (!vv.a(-110, (CharSequence) ((Object) var9))) {
                            continue L11;
                          } else {
                            if (var11 != 0) {
                              break L13;
                            } else {
                              L16: {
                                if (var3_int <= var5) {
                                  break L16;
                                } else {
                                  if (param1.charAt(var5) != 62) {
                                    break L16;
                                  } else {
                                    var5++;
                                    var10 = dq.a(90, (CharSequence) ((Object) var9));
                                    discarded$4 = var6.append(param1.substring(var7, var8));
                                    discarded$5 = var6.append(param2[var10]);
                                    var7 = var5;
                                    break L16;
                                  }
                                }
                              }
                              continue L11;
                            }
                          }
                        }
                      }
                    }
                    stackOut_39_0 = var6.toString();
                    stackIn_40_0 = stackOut_39_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var3);
            stackOut_41_1 = new StringBuilder().append("fo.C(").append(param0).append(',');
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
              break L17;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L17;
            }
          }
          L18: {
            stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L18;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L18;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
        return stackIn_40_0;
    }

    final void a(boolean param0, boolean param1) {
        this.field_b = param1 ? true : false;
        this.field_c = param0 ? true : false;
    }

    final boolean a(byte param0) {
        int var2 = 91 / ((param0 - 67) / 48);
        return this.field_b;
    }

    fo(String param0) {
        this.field_c = false;
        this.field_b = false;
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Can't reach";
    }
}
