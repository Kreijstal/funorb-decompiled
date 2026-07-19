/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends oa {
    private ug field_p;
    private int field_n;
    static String field_o;

    final static void a(java.awt.Component param0, int param1) {
        try {
            if (param1 != -2) {
                hj.m(75);
            }
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener(el.field_n);
            param0.addFocusListener(el.field_n);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "hj.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              L2: {
                if (var5_int >= param1) {
                  if (param3 == 18570) {
                    break L2;
                  } else {
                    field_o = (String) null;
                    return;
                  }
                } else {
                  fieldTemp$5 = this.field_h;
                  this.field_h = this.field_h + 1;
                  param0[param2 + var5_int] = (byte)(this.field_g[fieldTemp$5] + -this.field_p.a(-88));
                  var5_int++;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("hj.QA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    hj(byte[] param0) {
        super(param0);
    }

    hj(int param0) {
        super(param0);
    }

    final int l(int param0) {
        int fieldTemp$2 = 0;
        if (param0 != -12135) {
          return 41;
        } else {
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          return 255 & this.field_g[fieldTemp$2] + -this.field_p.a(-108);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        StringBuilder discarded$2 = null;
        ii[] discarded$3 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ci var10 = null;
        boolean stackIn_7_0 = false;
        int stackIn_11_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_17_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        byte stackOut_31_0 = 0;
        boolean stackOut_24_0 = false;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 != null) {
            var2_int = 0;
            var3 = param1.length();
            L0: while (true) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if (var3 <= var2_int) {
                        break L4;
                      } else {
                        stackOut_6_0 = uf.a(param1.charAt(var2_int), (byte) -108);
                        stackIn_11_0 = stackOut_6_0 ? 1 : 0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var9 != 0) {
                          L5: while (true) {
                            if (stackIn_11_0 <= (var3 ^ -1)) {
                              break L2;
                            } else {
                              stackOut_12_0 = uf.a(param1.charAt(var3 - 1), (byte) -56);
                              stackIn_17_0 = stackOut_12_0 ? 1 : 0;
                              stackIn_13_0 = stackOut_12_0;
                              if (var9 != 0) {
                                break L1;
                              } else {
                                if (!stackIn_13_0) {
                                  break L2;
                                } else {
                                  var3--;
                                  if (var9 == 0) {
                                    stackOut_10_0 = var2_int ^ -1;
                                    stackIn_11_0 = stackOut_10_0;
                                    continue L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (!stackIn_7_0) {
                            break L4;
                          } else {
                            var2_int++;
                            continue L0;
                          }
                        }
                      }
                    }
                    L6: while (true) {
                      stackOut_10_0 = var2_int ^ -1;
                      stackIn_11_0 = stackOut_10_0;
                      if (stackIn_11_0 <= (var3 ^ -1)) {
                        break L2;
                      } else {
                        stackOut_12_0 = uf.a(param1.charAt(var3 - 1), (byte) -56);
                        stackIn_17_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          if (!stackIn_13_0) {
                            break L2;
                          } else {
                            var3--;
                            if (var9 == 0) {
                              continue L6;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  break L2;
                }
                stackOut_16_0 = var3 - var2_int;
                stackIn_17_0 = stackOut_16_0;
                break L1;
              }
              var4 = stackIn_17_0;
              if ((var4 ^ -1) <= -2) {
                if ((var4 ^ -1) >= -13) {
                  var5 = new StringBuilder(var4);
                  var6 = var2_int;
                  L7: while (true) {
                    L8: {
                      if (var3 <= var6) {
                        stackOut_31_0 = param0;
                        stackIn_32_0 = stackOut_31_0;
                        break L8;
                      } else {
                        var7 = param1.charAt(var6);
                        stackOut_24_0 = ci.a((char) var7, 0);
                        stackIn_32_0 = stackOut_24_0 ? 1 : 0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var9 != 0) {
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              if (stackIn_25_0) {
                                break L10;
                              } else {
                                if (var9 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var8 = jk.a((char) var7, false);
                            if (0 == var8) {
                              break L9;
                            } else {
                              discarded$2 = var5.append((char) var8);
                              break L9;
                            }
                          }
                          var6++;
                          continue L7;
                        }
                      }
                    }
                    L11: {
                      if (stackIn_32_0 <= -124) {
                        break L11;
                      } else {
                        var10 = (ci) null;
                        discarded$3 = hj.a((ci) null, (byte) 75, -121, -92);
                        break L11;
                      }
                    }
                    if (var5.length() != 0) {
                      return var5.toString();
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var2);
            stackOut_38_1 = new StringBuilder().append("hj.WA(").append(param0).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L12;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
    }

    final static ii[] a(ci param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        ii[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ii[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -62) {
                break L1;
              } else {
                hj.m(-31);
                break L1;
              }
            }
            if (rl.a(param2, 0, param3, param0)) {
              stackOut_5_0 = pd.a((byte) 113);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("hj.SA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ii[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(byte param0, int[] param1) {
        try {
            int var3_int = 113 % ((-12 - param0) / 36);
            this.field_p = new ug(param1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "hj.TA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(this.field_p.a(-50) + param1);
        if (!param0) {
          return;
        } else {
          field_o = (String) null;
          return;
        }
    }

    final void n(int param0) {
        if (param0 != 0) {
            return;
        }
        this.field_h = (7 + this.field_n) / 8;
    }

    final int k(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var3 = this.field_n >> 1522829539;
        var4 = -(this.field_n & 7) + 8;
        this.field_n = this.field_n + param0;
        var5 = 0;
        L0: while (true) {
          if (param0 <= var4) {
            L1: {
              L2: {
                if (param0 == var4) {
                  break L2;
                } else {
                  var5 = var5 + (this.field_g[var3] >> -param0 + var4 & kb.field_m[param0]);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = var5 + (kb.field_m[var4] & this.field_g[var3]);
              break L1;
            }
            if (param1 != 1522829539) {
              this.h((byte) -80);
              return var5;
            } else {
              return var5;
            }
          } else {
            incrementValue$1 = var3;
            var3++;
            var5 = var5 + ((this.field_g[incrementValue$1] & kb.field_m[var4]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
            if (var6 == 0) {
              continue L0;
            } else {
              var5 = var5 + (kb.field_m[var4] & this.field_g[var3]);
              if (param1 != 1522829539) {
                this.h((byte) -80);
                return var5;
              } else {
                return var5;
              }
            }
          }
        }
    }

    public static void m(int param0) {
        field_o = null;
        if (param0 == 255) {
            return;
        }
        field_o = (String) null;
    }

    final void h(byte param0) {
        this.field_n = 8 * this.field_h;
        if (param0 >= 53) {
            return;
        }
        this.field_n = 54;
    }

    static {
        field_o = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
