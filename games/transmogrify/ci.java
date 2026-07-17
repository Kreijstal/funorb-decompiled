/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private ih field_c;
    static boolean[] field_g;
    private Object[][] field_d;
    static da field_f;
    private int field_e;
    private boolean field_a;
    private el field_b;
    private Object[] field_h;

    final int a(int param0, byte param1) {
        if (!this.b(14555, param0)) {
            return 0;
        }
        if (param1 < 71) {
            return 34;
        }
        return ((ci) this).field_b.field_i[param0];
    }

    private final synchronized void a(int param0, int param1) {
        int var3 = 0;
        L0: {
          L1: {
            if (!((ci) this).field_a) {
              break L1;
            } else {
              ((ci) this).field_h[param0] = (Object) (Object) ((ci) this).field_c.a(param0, 119);
              if (!Transmogrify.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((ci) this).field_h[param0] = lf.a((byte) -43, false, ((ci) this).field_c.a(param0, 57));
          break L0;
        }
        var3 = 62 / ((-6 - param1) / 62);
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (!((ci) this).a((byte) -123)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (((ci) this).field_h.length <= var4) {
                  break L2;
                } else {
                  stackOut_5_0 = -1;
                  stackOut_5_1 = ~((ci) this).field_b.field_s[var4];
                  stackIn_11_0 = stackOut_5_0;
                  stackIn_11_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_6_0 > stackIn_6_1) {
                        var3 = var3 + ((ci) this).a(true, var4);
                        var2 += 100;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_10_0 = param0;
              stackOut_10_1 = -22884;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            }
            L4: {
              if (stackIn_11_0 == stackIn_11_1) {
                break L4;
              } else {
                boolean discarded$2 = ((ci) this).a(((byte[]) ((Object[]) ((ci) this).field_h[1])[1])[1], (String) null);
                break L4;
              }
            }
            if (var2 == 0) {
              return 100;
            } else {
              var4 = var3 * 100 / var2;
              return var4;
            }
          }
        }
    }

    final synchronized boolean a(byte param0) {
        if (param0 > -112) {
            int discarded$0 = ((ci) this).a(5, (String) ((ci) this).field_h[3]);
        }
        if (null != ((ci) this).field_b) {
            return true;
        }
        ((ci) this).field_b = ((ci) this).field_c.a(-110);
        if (((ci) this).field_b == null) {
            return false;
        }
        ((ci) this).field_d = new Object[((ci) this).field_b.field_l][];
        ((ci) this).field_h = new Object[((ci) this).field_b.field_l];
        return true;
    }

    final synchronized byte[] b(byte param0, int param1) {
        if (!((ci) this).a((byte) -118)) {
            return null;
        }
        if (!(1 != ((ci) this).field_b.field_i.length)) {
            return ((ci) this).a((byte) -93, param1, 0);
        }
        if (!this.b(14555, param1)) {
            return null;
        }
        if (!(((ci) this).field_b.field_i[param1] != 1)) {
            return ((ci) this).a((byte) -93, 0, param1);
        }
        int var3 = 42 % ((param0 - -22) / 63);
        throw new RuntimeException();
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((ci) this).a((byte) -128)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((ci) this).field_b.field_h.a(gb.a(-14741, var6), false);
              if (this.b(14555, var4_int)) {
                L1: {
                  if (param1 > 66) {
                    break L1;
                  } else {
                    field_f = (da) ((ci) this).field_h[3];
                    break L1;
                  }
                }
                var7 = (CharSequence) (Object) param0;
                var5 = ((ci) this).field_b.field_t[var4_int].a(gb.a(-14741, var7), false);
                stackOut_8_0 = ((ci) this).a((byte) -93, var5, var4_int);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ci.Q(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (((ci) this).a((byte) -117)) {
          var2 = 1;
          if (param0 == 32031) {
            var3 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (~((ci) this).field_b.field_c.length >= ~var3) {
                    break L2;
                  } else {
                    stackOut_6_0 = ((ci) this).field_b.field_c[var3];
                    stackIn_12_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        var4 = stackIn_7_0;
                        if (((ci) this).field_h[var4] != null) {
                          break L3;
                        } else {
                          this.a(var4, param0 + -31917);
                          if (null != ((ci) this).field_h[var4]) {
                            break L3;
                          } else {
                            var2 = 0;
                            break L3;
                          }
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_11_0 = var2;
                stackIn_12_0 = stackOut_11_0;
                break L1;
              }
              return stackIn_12_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.b(param0 + 14556, param2)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var4_int = ((ci) this).field_b.field_t[param2].a(gb.a(-14741, var5), false);
              if (param0 == -1) {
                if (!this.a(var4_int, (byte) 87, param2)) {
                  stackOut_8_0 = -1;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return var4_int;
                }
              } else {
                stackOut_4_0 = -93;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ci.M(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
        return stackIn_9_0;
    }

    final synchronized int a(boolean param0, int param1) {
        if (!param0) {
            int[] discarded$0 = ((ci) this).a(((boolean[]) ((ci) this).field_h[0])[12]);
        }
        if (!this.b(14555, param1)) {
            return 0;
        }
        if (!(((ci) this).field_h[param1] == null)) {
            return 100;
        }
        return ((ci) this).field_c.b(-42, param1);
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        char stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        char stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_6_0 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (!qk.a(param0, (byte) -110)) {
                var6 = h.field_l;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 >= var6.length) {
                            break L5;
                          } else {
                            var4 = var6[var3];
                            stackOut_10_0 = ~param0;
                            stackOut_10_1 = ~var4;
                            stackIn_18_0 = stackOut_10_0;
                            stackIn_18_1 = stackOut_10_1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            if (var5 != 0) {
                              L6: while (true) {
                                if (stackIn_18_0 >= stackIn_18_1) {
                                  break L3;
                                } else {
                                  var4 = var2[var3];
                                  stackOut_19_0 = param0;
                                  stackIn_25_0 = stackOut_19_0;
                                  stackIn_20_0 = stackOut_19_0;
                                  if (var5 != 0) {
                                    break L2;
                                  } else {
                                    if (stackIn_20_0 != var4) {
                                      var3++;
                                      if (var5 == 0) {
                                        stackOut_17_0 = var3;
                                        stackOut_17_1 = var2.length;
                                        stackIn_18_0 = stackOut_17_0;
                                        stackIn_18_1 = stackOut_17_1;
                                        continue L6;
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (stackIn_11_0 == stackIn_11_1) {
                                stackOut_13_0 = 1;
                                stackIn_14_0 = stackOut_13_0;
                                return stackIn_14_0 != 0;
                              } else {
                                var3++;
                                if (var5 == 0) {
                                  continue L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var2 = hf.field_k;
                        var3 = param1;
                        L7: while (true) {
                          stackOut_17_0 = var3;
                          stackOut_17_1 = var2.length;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          if (stackIn_18_0 >= stackIn_18_1) {
                            break L3;
                          } else {
                            var4 = var2[var3];
                            stackOut_19_0 = param0;
                            stackIn_25_0 = stackOut_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var5 != 0) {
                              break L2;
                            } else {
                              if (stackIn_20_0 != var4) {
                                var3++;
                                if (var5 == 0) {
                                  continue L7;
                                } else {
                                  break L3;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_21_0 = 1;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0 != 0;
                    }
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2_ref, "ci.J(" + param0 + 44 + param1 + 41);
        }
        return stackIn_25_0 != 0;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (((ci) this).a((byte) -123)) {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (((ci) this).field_b.field_i.length <= param1) {
                break L0;
              } else {
                if (((ci) this).field_b.field_i[param1] != 0) {
                  if (param0 == 14555) {
                    return true;
                  } else {
                    ((ci) this).field_a = false;
                    return true;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          if (uk.field_gb) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        oa var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        oa var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        Object stackIn_14_0 = null;
        int[] stackIn_14_1 = null;
        int stackIn_24_0 = 0;
        Object stackIn_26_0 = null;
        int[] stackIn_26_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_56_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_126_0 = 0;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_13_0 = null;
        int[] stackOut_13_1 = null;
        Object stackOut_25_0 = null;
        int[] stackOut_25_1 = null;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_55_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_125_0 = 0;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        var22 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.b(14555, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null == ((ci) this).field_h[param2]) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                L1: {
                  var5_int = ((ci) this).field_b.field_s[param2];
                  var6 = ((ci) this).field_b.field_f[param2];
                  if (((ci) this).field_d[param2] != null) {
                    break L1;
                  } else {
                    ((ci) this).field_d[param2] = new Object[((ci) this).field_b.field_i[param2]];
                    break L1;
                  }
                }
                var7 = ((ci) this).field_d[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var9_int <= ~var5_int) {
                        break L4;
                      } else {
                        stackOut_13_0 = null;
                        stackOut_13_1 = (int[]) var6;
                        stackIn_26_0 = stackOut_13_0;
                        stackIn_26_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_14_0 != (Object) (Object) stackIn_14_1) {
                                break L6;
                              } else {
                                var10_int = var9_int;
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10_int = var6[var9_int];
                            break L5;
                          }
                          L7: {
                            if (var7[var10_int] == null) {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var9_int++;
                          if (var22 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var8 == 0) {
                      stackOut_25_0 = null;
                      stackOut_25_1 = (int[]) param1;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L3;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0 != 0;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_26_0 == (Object) (Object) stackIn_26_1) {
                        break L9;
                      } else {
                        L10: {
                          if (param1[0] != 0) {
                            break L10;
                          } else {
                            if (param1[1] != 0) {
                              break L10;
                            } else {
                              if (param1[2] != 0) {
                                break L10;
                              } else {
                                if (param1[3] == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        var9_array = cf.a(((ci) this).field_h[param2], true, (byte) 16);
                        var10_ref = new oa(var9_array);
                        var10_ref.a(param1, false, 5, var10_ref.field_g.length);
                        break L8;
                      }
                    }
                    var9_array = cf.a(((ci) this).field_h[param2], false, (byte) 16);
                    break L8;
                  }
                  try {
                    L11: {
                      var23 = lk.a(70, var9_array);
                      var10 = var23;
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_36_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_36_1 = new StringBuilder();
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      if (param1 == null) {
                        stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                        stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                        stackOut_38_2 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        break L12;
                      } else {
                        stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                        stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                        stackOut_37_2 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        break L12;
                      }
                    }
                    throw ch.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + " " + param2 + " " + param1.length + " " + v.a(var9_array, param1.length, (byte) 40) + " " + v.a(var9_array, param1.length + -2, (byte) 40) + " " + ((ci) this).field_b.field_j[param2] + " " + ((ci) this).field_b.field_r);
                  }
                  L13: {
                    if (((ci) this).field_a) {
                      ((ci) this).field_h[param2] = null;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (var5_int > 1) {
                          break L16;
                        } else {
                          L17: {
                            L18: {
                              if (var6 != null) {
                                break L18;
                              } else {
                                var11 = 0;
                                if (var22 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var11 = var6[0];
                            break L17;
                          }
                          L19: {
                            L20: {
                              if (((ci) this).field_e == 0) {
                                break L20;
                              } else {
                                var7[var11] = (Object) (Object) var23;
                                if (var22 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var7[var11] = lf.a((byte) -43, false, var23);
                            break L19;
                          }
                          if (var22 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L21: {
                        if (2 != ((ci) this).field_e) {
                          break L21;
                        } else {
                          var11 = var23.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var12 * var5_int;
                          var13 = new oa(var10);
                          var14_int = 0;
                          var15_int = 0;
                          var13.field_h = var11;
                          var16 = 0;
                          L22: while (true) {
                            L23: {
                              L24: {
                                if (var12 <= var16) {
                                  break L24;
                                } else {
                                  var17 = 0;
                                  stackOut_55_0 = 0;
                                  stackIn_69_0 = stackOut_55_0;
                                  stackIn_56_0 = stackOut_55_0;
                                  if (var22 != 0) {
                                    break L23;
                                  } else {
                                    var18 = stackIn_56_0;
                                    L25: while (true) {
                                      L26: {
                                        L27: {
                                          if (~var18 <= ~var5_int) {
                                            break L27;
                                          } else {
                                            var17 = var17 + var13.c((byte) -107);
                                            if (var22 != 0) {
                                              break L26;
                                            } else {
                                              L28: {
                                                L29: {
                                                  if (var6 != null) {
                                                    break L29;
                                                  } else {
                                                    var19 = var18;
                                                    if (var22 == 0) {
                                                      break L28;
                                                    } else {
                                                      break L29;
                                                    }
                                                  }
                                                }
                                                var19 = var6[var18];
                                                break L28;
                                              }
                                              L30: {
                                                if (~var19 == ~param0) {
                                                  var15_int = var19;
                                                  var14_int = var14_int + var17;
                                                  break L30;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                              var18++;
                                              if (var22 == 0) {
                                                continue L25;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                        }
                                        var16++;
                                        break L26;
                                      }
                                      if (var22 == 0) {
                                        continue L22;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_68_0 = var14_int;
                              stackIn_69_0 = stackOut_68_0;
                              break L23;
                            }
                            if (stackIn_69_0 != 0) {
                              var16_ref_byte__ = new byte[var14_int];
                              var14_int = 0;
                              var13.field_h = var11;
                              var17 = 0;
                              var18 = 0;
                              L31: while (true) {
                                L32: {
                                  if (~var12 >= ~var18) {
                                    break L32;
                                  } else {
                                    var19 = 0;
                                    stackOut_74_0 = 0;
                                    stackIn_126_0 = stackOut_74_0;
                                    stackIn_75_0 = stackOut_74_0;
                                    if (var22 != 0) {
                                      break L14;
                                    } else {
                                      var20 = stackIn_75_0;
                                      L33: while (true) {
                                        L34: {
                                          L35: {
                                            if (var5_int <= var20) {
                                              break L35;
                                            } else {
                                              var19 = var19 + var13.c((byte) -110);
                                              if (var22 != 0) {
                                                break L34;
                                              } else {
                                                L36: {
                                                  L37: {
                                                    if (var6 != null) {
                                                      break L37;
                                                    } else {
                                                      var21 = var20;
                                                      if (var22 == 0) {
                                                        break L36;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                  var21 = var6[var20];
                                                  break L36;
                                                }
                                                L38: {
                                                  if (param0 != var21) {
                                                    break L38;
                                                  } else {
                                                    ji.a(var10, var17, var16_ref_byte__, var14_int, var19);
                                                    var14_int = var14_int + var19;
                                                    break L38;
                                                  }
                                                }
                                                var17 = var17 + var19;
                                                var20++;
                                                if (var22 == 0) {
                                                  continue L33;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                          }
                                          var18++;
                                          break L34;
                                        }
                                        if (var22 == 0) {
                                          continue L31;
                                        } else {
                                          break L32;
                                        }
                                      }
                                    }
                                  }
                                }
                                var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                if (var22 == 0) {
                                  break L15;
                                } else {
                                  break L21;
                                }
                              }
                            } else {
                              stackOut_70_0 = 1;
                              stackIn_71_0 = stackOut_70_0;
                              return stackIn_71_0 != 0;
                            }
                          }
                        }
                      }
                      var11 = var23.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * (var12 * var5_int);
                      var13 = new oa(var10);
                      var13.field_h = var11;
                      var14 = new int[var5_int];
                      var15_int = 0;
                      L39: while (true) {
                        L40: {
                          L41: {
                            if (var15_int >= var12) {
                              break L41;
                            } else {
                              var16 = 0;
                              stackOut_89_0 = 0;
                              stackIn_98_0 = stackOut_89_0;
                              stackIn_90_0 = stackOut_89_0;
                              if (var22 != 0) {
                                break L40;
                              } else {
                                var17 = stackIn_90_0;
                                L42: while (true) {
                                  L43: {
                                    L44: {
                                      if (~var5_int >= ~var17) {
                                        break L44;
                                      } else {
                                        var16 = var16 + var13.c((byte) -106);
                                        var14[var17] = var14[var17] + var16;
                                        var17++;
                                        if (var22 != 0) {
                                          break L43;
                                        } else {
                                          if (var22 == 0) {
                                            continue L42;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                    var15_int++;
                                    break L43;
                                  }
                                  if (var22 == 0) {
                                    continue L39;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_97_0 = var5_int;
                          stackIn_98_0 = stackOut_97_0;
                          break L40;
                        }
                        var15 = new byte[stackIn_98_0][];
                        var16 = 0;
                        L45: while (true) {
                          L46: {
                            L47: {
                              if (var16 >= var5_int) {
                                break L47;
                              } else {
                                var15[var16] = new byte[var14[var16]];
                                var14[var16] = 0;
                                var16++;
                                if (var22 != 0) {
                                  break L46;
                                } else {
                                  if (var22 == 0) {
                                    continue L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                            }
                            var13.field_h = var11;
                            var16 = 0;
                            break L46;
                          }
                          var17 = 0;
                          L48: while (true) {
                            L49: {
                              L50: {
                                if (~var17 <= ~var12) {
                                  break L50;
                                } else {
                                  var18 = 0;
                                  stackOut_106_0 = 0;
                                  stackIn_115_0 = stackOut_106_0;
                                  stackIn_107_0 = stackOut_106_0;
                                  if (var22 != 0) {
                                    break L49;
                                  } else {
                                    var19 = stackIn_107_0;
                                    L51: while (true) {
                                      L52: {
                                        L53: {
                                          if (~var19 <= ~var5_int) {
                                            break L53;
                                          } else {
                                            var18 = var18 + var13.c((byte) -119);
                                            ji.a(var23, var16, var15[var19], var14[var19], var18);
                                            var16 = var16 + var18;
                                            var14[var19] = var14[var19] + var18;
                                            var19++;
                                            if (var22 != 0) {
                                              break L52;
                                            } else {
                                              if (var22 == 0) {
                                                continue L51;
                                              } else {
                                                break L53;
                                              }
                                            }
                                          }
                                        }
                                        var17++;
                                        break L52;
                                      }
                                      if (var22 == 0) {
                                        continue L48;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_114_0 = 0;
                              stackIn_115_0 = stackOut_114_0;
                              break L49;
                            }
                            var17 = stackIn_115_0;
                            L54: while (true) {
                              if (var17 >= var5_int) {
                                break L15;
                              } else {
                                L55: {
                                  L56: {
                                    if (var6 != null) {
                                      break L56;
                                    } else {
                                      var18 = var17;
                                      if (var22 == 0) {
                                        break L55;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                  var18 = var6[var17];
                                  break L55;
                                }
                                L57: {
                                  L58: {
                                    if (0 != ((ci) this).field_e) {
                                      break L58;
                                    } else {
                                      var7[var18] = lf.a((byte) -43, false, var15[var17]);
                                      if (var22 == 0) {
                                        break L57;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                  var7[var18] = (Object) (Object) var15[var17];
                                  break L57;
                                }
                                var17++;
                                if (var22 == 0) {
                                  continue L54;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_125_0 = 1;
                    stackIn_126_0 = stackOut_125_0;
                    break L14;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L59: {
            var5 = decompiledCaughtException;
            stackOut_127_0 = (RuntimeException) var5;
            stackOut_127_1 = new StringBuilder().append("ci.K(").append(param0).append(44);
            stackIn_129_0 = stackOut_127_0;
            stackIn_129_1 = stackOut_127_1;
            stackIn_128_0 = stackOut_127_0;
            stackIn_128_1 = stackOut_127_1;
            if (param1 == null) {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "null";
              stackIn_130_0 = stackOut_129_0;
              stackIn_130_1 = stackOut_129_1;
              stackIn_130_2 = stackOut_129_2;
              break L59;
            } else {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "{...}";
              stackIn_130_0 = stackOut_128_0;
              stackIn_130_1 = stackOut_128_1;
              stackIn_130_2 = stackOut_128_2;
              break L59;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_130_0, stackIn_130_2 + 44 + param2 + 44 + 0 + 41);
        }
        return stackIn_126_0 != 0;
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        if (!((ci) this).a((byte) -118)) {
          return false;
        } else {
          L0: {
            if (param1 > 72) {
              break L0;
            } else {
              boolean discarded$2 = ((ci) this).a((byte) -97, (String) ((ci) this).field_h[2], (String) null);
              break L0;
            }
          }
          L1: {
            if (param2 < 0) {
              break L1;
            } else {
              if (0 > param0) {
                break L1;
              } else {
                if (((ci) this).field_b.field_i.length <= param2) {
                  break L1;
                } else {
                  if (~((ci) this).field_b.field_i[param2] < ~param0) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (!uk.field_gb) {
            return false;
          } else {
            throw new IllegalArgumentException(param2 + " " + param0);
          }
        }
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != -93) {
            return null;
        }
        return this.a(param1, param2, (int[]) null, param0 ^ 20);
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_4_0 = false;
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
            var3_int = 88 / ((62 - param0) / 48);
            if (!((ci) this).a((byte) -117)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var4 = ((ci) this).field_b.field_h.a(gb.a(-14741, var5), false);
              stackOut_4_0 = ((ci) this).a((byte) 107, var4);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ci.L(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        byte[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_4_0 = null;
        byte[] stackOut_1_0 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (param3 <= -46) {
              if (this.a(param0, (byte) 88, param1)) {
                L1: {
                  L2: {
                    var5 = null;
                    if (null == ((ci) this).field_d[param1]) {
                      break L2;
                    } else {
                      if (((ci) this).field_d[param1][param0] == null) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (this.a(param0, param2, param1, 0)) {
                    break L1;
                  } else {
                    this.a(param1, -69);
                    if (this.a(param0, param2, param1, 0)) {
                      break L1;
                    } else {
                      stackOut_11_0 = null;
                      stackIn_12_0 = stackOut_11_0;
                      return (byte[]) (Object) stackIn_12_0;
                    }
                  }
                }
                if (((ci) this).field_d[param1] != null) {
                  L3: {
                    if (((ci) this).field_d[param1][param0] == null) {
                      break L3;
                    } else {
                      var7 = cf.a(((ci) this).field_d[param1][param0], false, (byte) 16);
                      var5 = (Object) (Object) var7;
                      if (var7 != null) {
                        break L3;
                      } else {
                        throw new RuntimeException("");
                      }
                    }
                  }
                  L4: {
                    if (var5 != null) {
                      L5: {
                        if (((ci) this).field_e != 1) {
                          break L5;
                        } else {
                          ((ci) this).field_d[param1][param0] = null;
                          if (((ci) this).field_b.field_i[param1] != 1) {
                            break L4;
                          } else {
                            ((ci) this).field_d[param1] = null;
                            if (!Transmogrify.field_A) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (((ci) this).field_e == 2) {
                        ((ci) this).field_d[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  stackOut_27_0 = var5;
                  stackIn_28_0 = stackOut_27_0;
                  break L0;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = (byte[]) ((ci) this).field_h[2];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_29_0 = var5;
            stackOut_29_1 = new StringBuilder().append("ci.A(").append(param0).append(44).append(param1).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_28_0;
    }

    final int[] a(boolean param0) {
        if (!((ci) this).a((byte) -114)) {
            return null;
        }
        if (param0) {
            return null;
        }
        return ((ci) this).field_b.field_c;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((ci) this).a((byte) -119)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((ci) this).field_b.field_h.a(gb.a(-14741, var4), false);
                if (param0 == 0) {
                  break L1;
                } else {
                  int discarded$2 = ((ci) this).a(((int[]) ((ci) this).field_h[1])[1], (String) ((ci) this).field_h[4], -26);
                  break L1;
                }
              }
              stackOut_6_0 = ((ci) this).a(true, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ci.R(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final int a(int param0) {
        int var2 = 53 % ((52 - param0) / 32);
        if (!(((ci) this).a((byte) -123))) {
            return -1;
        }
        return ((ci) this).field_b.field_i.length;
    }

    final synchronized boolean a(byte param0, int param1) {
        if (!this.b(14555, param1)) {
            return false;
        }
        int var3 = 114 % ((param0 - 40) / 56);
        if (!(((ci) this).field_h[param1] == null)) {
            return true;
        }
        this.a(param1, -124);
        if (null != ((ci) this).field_h[param1]) {
            return true;
        }
        return false;
    }

    public static void d(int param0) {
        field_g = null;
        field_f = null;
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
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
            if (((ci) this).a((byte) -115)) {
              param1 = param1.toLowerCase();
              if (param0 == -120) {
                var4 = (CharSequence) (Object) param1;
                var3_int = ((ci) this).field_b.field_h.a(gb.a(-14741, var4), false);
                if (var3_int < 0) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return true;
                }
              } else {
                stackOut_4_0 = ((boolean[]) ((Object[]) ((ci) this).field_h[10])[0])[4];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ci.O(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_2_0 = false;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_8_0 = 0;
        boolean stackOut_1_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param0 >= 17) {
              if (!((ci) this).a((byte) -116)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                var6 = (CharSequence) (Object) param2;
                var4_int = ((ci) this).field_b.field_h.a(gb.a(-14741, var6), false);
                if (this.b(14555, var4_int)) {
                  var7 = (CharSequence) (Object) param1;
                  var5 = ((ci) this).field_b.field_t[var4_int].a(gb.a(-14741, var7), false);
                  stackOut_10_0 = ((ci) this).a(var5, 0, var4_int);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = ((boolean[]) ((ci) this).field_h[0])[3];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ci.S(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param0, (byte) 77, param2)) {
            return false;
        }
        if (null != ((ci) this).field_d[param2]) {
            if (!(null == ((ci) this).field_d[param2][param0])) {
                return true;
            }
        }
        if (param1 != 0) {
            ((int[]) ((Object[]) ((ci) this).field_h[5])[22])[8] = ((int[]) ((ci) this).field_h[2])[5];
        }
        if (!(null == ((ci) this).field_h[param2])) {
            return true;
        }
        this.a(param2, -102);
        if (null != ((ci) this).field_h[param2]) {
            return true;
        }
        return false;
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((ci) this).a((byte) -113)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((ci) this).field_b.field_h.a(gb.a(-14741, var4), false);
              if (this.b(14555, var3_int)) {
                if (param0 >= 39) {
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 17;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ci.AA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    ci(ih param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((ci) this).field_b = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((ci) this).field_a = stackIn_7_1 != 0;
                  ((ci) this).field_c = param0;
                  ((ci) this).field_e = param2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("ci.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new boolean[8];
        field_g[4] = true;
        field_g[3] = true;
        field_g[2] = true;
        field_g[5] = true;
        field_g[6] = true;
    }
}
