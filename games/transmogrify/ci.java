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
        return this.field_b.field_i[param0];
    }

    private final synchronized void a(int param0, int param1) {
        int var3;
        L0: {
          L1: {
            if (!this.field_a) {
              break L1;
            } else {
              this.field_h[param0] = this.field_c.a(param0, 119);
              if (!Transmogrify.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_h[param0] = lf.a((byte) -43, false, this.field_c.a(param0, 57));
          break L0;
        }
        var3 = 62 / ((-6 - param1) / 62);
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (!this.a((byte) -123)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (this.field_h.length <= var4) {
                  break L2;
                } else {
                  stackIn_11_0 = -1;

                  stackIn_11_1 = this.field_b.field_s[var4] ^ -1;

                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_11_0 > stackIn_11_1) {
                        var3 = var3 + this.a(true, var4);
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
              stackIn_11_0 = param0;
              stackIn_11_1 = -22884;
              break L1;
            }
            L4: {
              if (stackIn_11_0 == stackIn_11_1) {
                break L4;
              } else {
                this.a(((byte[]) (((Object[]) (this.field_h[1]))[1]))[1], (String) null);
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
            this.a(5, (String) (this.field_h[3]));
        }
        if (null != this.field_b) {
            return true;
        }
        this.field_b = this.field_c.a(-110);
        if (this.field_b == null) {
            return false;
        }
        this.field_d = new Object[this.field_b.field_l][];
        this.field_h = new Object[this.field_b.field_l];
        return true;
    }

    final synchronized byte[] b(byte param0, int param1) {
        if (!this.a((byte) -118)) {
            return null;
        }
        if (!(1 != this.field_b.field_i.length)) {
            return this.a((byte) -93, param1, 0);
        }
        if (!this.b(14555, param1)) {
            return null;
        }
        if (!(this.field_b.field_i[param1] != 1)) {
            return this.a((byte) -93, 0, param1);
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -128)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_b.field_h.a(gb.a(-14741, var6), false);
              if (this.b(14555, var4_int)) {
                L1: {
                  if (param1 > 66) {
                    break L1;
                  } else {
                    field_f = (da) (this.field_h[3]);
                    break L1;
                  }
                }
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_b.field_t[var4_int].a(gb.a(-14741, var7), false);
                stackIn_9_0 = this.a((byte) -93, var5, var4_int);
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
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("ci.Q(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_12_0 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (this.a((byte) -117)) {
          var2 = 1;
          if (param0 == 32031) {
            var3 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if ((this.field_b.field_c.length ^ -1) >= (var3 ^ -1)) {
                    break L2;
                  } else {
                    stackIn_12_0 = this.field_b.field_c[var3];

                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        var4 = stackIn_12_0;
                        if (this.field_h[var4] != null) {
                          break L3;
                        } else {
                          this.a(var4, param0 + -31917);
                          if (null != this.field_h[var4]) {
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
                stackIn_12_0 = var2;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(param0 + 14556, param2)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4_int = this.field_b.field_t[param2].a(gb.a(-14741, var5), false);
              if (param0 == -1) {
                if (!this.a(var4_int, (byte) 87, param2)) {
                  stackIn_9_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var4_int;
                }
              } else {
                stackIn_5_0 = -93;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("ci.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized int a(boolean param0, int param1) {
        if (!param0) {
            this.a(((boolean[]) (this.field_h[0]))[12]);
        }
        if (!this.b(14555, param1)) {
            return 0;
        }
        if (!(this.field_h[param1] == null)) {
            return 100;
        }
        return this.field_c.b(-42, param1);
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
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        char stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_19_0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
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
                            stackIn_18_0 = param0 ^ -1;

                            stackIn_18_1 = var4 ^ -1;

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
                                        stackIn_18_0 = var3;
                                        stackIn_18_1 = var2.length;
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
                              if (stackIn_18_0 == stackIn_18_1) {
                                stackIn_14_0 = 1;
                                decompiledRegionSelector0 = 2;
                                break L0;
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
                          stackIn_18_0 = var3;
                          stackIn_18_1 = var2.length;
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
                      stackIn_22_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                    stackIn_25_0 = 0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "ci.J(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.a((byte) -123)) {
            return false;
        }
        if (0 > param1 || this.field_b.field_i.length <= param1 || -1 == (this.field_b.field_i[param1] ^ -1)) {
            if (!uk.field_gb) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        if (param0 != 14555) {
            this.field_a = false;
            return true;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14_int = 0;
        int[] var14 = null;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        oa var26 = null;
        byte[] var27 = null;
        oa var29 = null;
        oa var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.b(14555, param2)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (null == this.field_h[param2]) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var5_int = this.field_b.field_s[param2];
                        var34 = this.field_b.field_f[param2];
                        var24 = var34;
                        var6 = var24;
                        if (this.field_d[param2] != null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        array$0 = new Object[this.field_b.field_i[param2]];
                        this.field_d[param2] = array$0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = this.field_d[param2];
                        var8 = 1;
                        var9_int = param3;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var9_int ^ -1) <= (var5_int ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_26_0 = null;
                        stackIn_14_0 = stackIn_26_0;
                        stackIn_26_1 = (int[]) (var6);
                        stackIn_14_1 = stackIn_26_1;
                        if (var22 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 != stackIn_14_1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10 = var9_int;
                        if (var22 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10 = var34[var9_int];
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7[var10] == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = 0;
                        if (var22 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9_int++;
                        if (var22 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var8 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    try {
                        stackIn_26_0 = null;
                        stackIn_26_1 = (int[]) (param1);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 == stackIn_26_1) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((param1[0] ^ -1) != -1) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param1[1] != 0) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param1[2] != 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((param1[3] ^ -1) == -1) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var35 = cf.a(this.field_h[param2], true, (byte) 16);
                        var25 = var35;
                        var9 = var25;
                        var26 = new oa(var35);
                        var26.a(param1, false, 5, var26.field_g.length);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = cf.a(this.field_h[param2], false, (byte) 16);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var36 = lk.a(70, var9);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var11_ref_RuntimeException = (RuntimeException) ((Object) caughtException);
                        stackIn_38_0 = (RuntimeException) (var11_ref_RuntimeException);
                        stackIn_37_0 = stackIn_38_0;
                        stackIn_38_1 = new StringBuilder();
                        stackIn_37_1 = stackIn_38_1;
                        if (param1 == null) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_39_0 = (RuntimeException) ((Object) stackIn_37_0);
                        stackIn_39_1 = (StringBuilder) ((Object) stackIn_37_1);
                        stackIn_39_2 = 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                        stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                        stackIn_39_2 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw ch.a((Throwable) ((Object) stackIn_39_0), (stackIn_39_2 != 0) + " " + param2 + " " + param1.length + " " + v.a(var9, param1.length, (byte) 40) + " " + v.a(var9, param1.length + -2, (byte) 40) + " " + this.field_b.field_j[param2] + " " + this.field_b.field_r);
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (this.field_a) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_h[param2] = null;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var5_int > 1) {
                            statePc = 52;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var6 != null) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11 = 0;
                        if (var22 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = var34[0];
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-1 == (this.field_e ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7[var11] = var36;
                        if (var22 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var7[var11] = lf.a((byte) -43, false, var36);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var22 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (2 != this.field_e) {
                            statePc = 87;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var11 = var36.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - 4 * var12 * var5_int;
                        var29 = new oa(var43);
                        var14_int = 0;
                        var15_int = 0;
                        var29.field_h = var11;
                        var16 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var12 <= var16) {
                            statePc = 68;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var17 = 0;
                        stackIn_69_0 = 0;
                        stackIn_56_0 = stackIn_69_0;
                        if (var22 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var18 = stackIn_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((var18 ^ -1) <= (var5_int ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var17 = var17 + var29.c((byte) -107);
                        if (var22 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var6 != null) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var19 = var18;
                        if (var22 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var19 = var34[var18];
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var19 ^ -1) == (param0 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var15_int = var19;
                        var14_int = var14_int + var17;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var18++;
                        if (var22 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var16++;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var22 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = var14_int;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (stackIn_69_0 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_71_0 = 1;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 71: {
                    return stackIn_71_0 != 0;
                }
                case 72: {
                    try {
                        var44 = new byte[var14_int];
                        var14_int = 0;
                        var29.field_h = var11;
                        var17 = 0;
                        var18 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((var12 ^ -1) >= (var18 ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var19 = 0;
                        stackIn_126_0 = 0;
                        stackIn_75_0 = stackIn_126_0;
                        if (var22 != 0) {
                            statePc = 126;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var20 = stackIn_75_0;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var5_int <= var20) {
                            statePc = 84;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var19 = var19 + var29.c((byte) -110);
                        if (var22 != 0) {
                            statePc = 85;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var6 != null) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var21 = var20;
                        if (var22 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var21 = var34[var20];
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (param0 != var21) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ji.a(var43, var17, var44, var14_int, var19);
                        var14_int = var14_int + var19;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var17 = var17 + var19;
                        var20++;
                        if (var22 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var18++;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var22 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var7[var15_int] = var44;
                        if (var22 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var11 = var36.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - 4 * (var12 * var5_int);
                        var31 = new oa(var43);
                        var31.field_h = var11;
                        var39 = new int[var5_int];
                        var32 = var39;
                        var14 = var32;
                        var15_int = 0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var15_int >= var12) {
                            statePc = 97;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var16 = 0;
                        stackIn_98_0 = 0;
                        stackIn_90_0 = stackIn_98_0;
                        if (var22 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var17 = stackIn_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if ((var5_int ^ -1) >= (var17 ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var16 = var16 + var31.c((byte) -106);
                        var14[var17] = var14[var17] + var16;
                        var17++;
                        if (var22 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var22 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var15_int++;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (var22 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackIn_98_0 = var5_int;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var40 = new byte[stackIn_98_0][];
                        var33 = var40;
                        var15 = var33;
                        var16 = 0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var16 >= var5_int) {
                            statePc = 103;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        array$1 = new byte[var39[var16]];
                        var15[var16] = array$1;
                        var39[var16] = 0;
                        var16++;
                        if (var22 != 0) {
                            statePc = 104;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (var22 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var31.field_h = var11;
                        var16 = 0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var17 = 0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if ((var17 ^ -1) <= (var12 ^ -1)) {
                            statePc = 114;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var18 = 0;
                        stackIn_115_0 = 0;
                        stackIn_107_0 = stackIn_115_0;
                        if (var22 != 0) {
                            statePc = 115;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var19 = stackIn_107_0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if ((var19 ^ -1) <= (var5_int ^ -1)) {
                            statePc = 112;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var18 = var18 + var31.c((byte) -119);
                        ji.a(var36, var16, var40[var19], var39[var19], var18);
                        var16 = var16 + var18;
                        var14[var19] = var14[var19] + var18;
                        var19++;
                        if (var22 != 0) {
                            statePc = 113;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (var22 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var17++;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var22 == 0) {
                            statePc = 105;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackIn_115_0 = 0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var17 = stackIn_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var17 >= var5_int) {
                            statePc = 125;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var6 != null) {
                            statePc = 119;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var18 = var17;
                        if (var22 == 0) {
                            statePc = 120;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var18 = var34[var17];
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (0 != this.field_e) {
                            statePc = 123;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var7[var18] = lf.a((byte) -43, false, var40[var17]);
                        if (var22 == 0) {
                            statePc = 124;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var7[var18] = var40[var17];
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var17++;
                        if (var22 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackIn_126_0 = 1;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 126: {
                    return stackIn_126_0 != 0;
                }
                case 127: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_129_0 = (RuntimeException) (var5);
                    stackIn_128_0 = stackIn_129_0;
                    stackIn_129_1 = new StringBuilder().append("ci.K(").append(param0).append(',');
                    stackIn_128_1 = stackIn_129_1;
                    if (param1 == null) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_130_0 = (RuntimeException) ((Object) stackIn_128_0);
                    stackIn_130_1 = (StringBuilder) ((Object) stackIn_128_1);
                    stackIn_130_2 = "{...}";
                    statePc = 130;
                    continue stateLoop;
                }
                case 129: {
                    stackIn_130_0 = (RuntimeException) ((Object) stackIn_129_0);
                    stackIn_130_1 = (StringBuilder) ((Object) stackIn_129_1);
                    stackIn_130_2 = "null";
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    throw ch.a((Throwable) ((Object) stackIn_130_0), stackIn_130_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        if (!(this.a((byte) -118))) {
            return false;
        }
        if (param1 <= 72) {
            this.a((byte) -97, (String) (this.field_h[2]), (String) null);
        }
        if (param2 < 0 || 0 > param0 || this.field_b.field_i.length <= param2 || (this.field_b.field_i[param2] ^ -1) >= (param0 ^ -1)) {
            if (uk.field_gb) {
                throw new IllegalArgumentException(param2 + " " + param0);
            }
            return false;
        }
        return true;
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != -93) {
            return (byte[]) null;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 88 / ((62 - param0) / 48);
            if (!this.a((byte) -117)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4 = this.field_b.field_h.a(gb.a(-14741, var5), false);
              stackIn_5_0 = this.a((byte) 107, var4);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ci.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0;
        }
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        byte[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            if (param3 <= -46) {
              if (this.a(param0, (byte) 88, param1)) {
                L1: {
                  L2: {
                    var5 = null;
                    if (null == this.field_d[param1]) {
                      break L2;
                    } else {
                      if (this.field_d[param1][param0] == null) {
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
                      stackIn_12_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                if (this.field_d[param1] != null) {
                  L3: {
                    if (this.field_d[param1][param0] == null) {
                      break L3;
                    } else {
                      var7 = cf.a(this.field_d[param1][param0], false, (byte) 16);
                      var5 = var7;
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
                        if (-2 != (this.field_e ^ -1)) {
                          break L5;
                        } else {
                          this.field_d[param1][param0] = null;
                          if ((this.field_b.field_i[param1] ^ -1) != -2) {
                            break L4;
                          } else {
                            this.field_d[param1] = null;
                            if (!Transmogrify.field_A) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (this.field_e == 2) {
                        this.field_d[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  stackIn_28_0 = var5;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (byte[]) (this.field_h[2]);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = var5;

            stackIn_31_1 = new StringBuilder().append("ci.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = stackIn_31_0;
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L6;
            } else {
              stackIn_32_0 = stackIn_31_0;
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (byte[]) ((Object) stackIn_12_0);
            } else {
              return (byte[]) ((Object) stackIn_28_0);
            }
          }
        }
    }

    final int[] a(boolean param0) {
        if (!this.a((byte) -114)) {
            return null;
        }
        if (param0) {
            return (int[]) null;
        }
        return this.field_b.field_c;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) -119)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_b.field_h.a(gb.a(-14741, var4), false);
                if (param0 == 0) {
                  break L1;
                } else {
                  this.a(((int[]) (this.field_h[1]))[1], (String) (this.field_h[4]), -26);
                  break L1;
                }
              }
              stackIn_7_0 = this.a(true, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ci.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final int a(int param0) {
        int var2 = 53 % ((52 - param0) / 32);
        if (!(this.a((byte) -123))) {
            return -1;
        }
        return this.field_b.field_i.length;
    }

    final synchronized boolean a(byte param0, int param1) {
        if (!this.b(14555, param1)) {
            return false;
        }
        int var3 = 114 % ((param0 - 40) / 56);
        if (!(this.field_h[param1] == null)) {
            return true;
        }
        this.a(param1, -124);
        if (null != this.field_h[param1]) {
            return true;
        }
        return false;
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 > -74) {
            ci.d(-75);
        }
        field_f = null;
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -115)) {
              param1 = param1.toLowerCase();
              if (param0 == -120) {
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_b.field_h.a(gb.a(-14741, var4), false);
                if ((var3_int ^ -1) > -1) {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return true;
                }
              } else {
                stackIn_5_0 = ((boolean[]) (((Object[]) (this.field_h[10]))[0]))[4];
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ci.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 17) {
              if (!this.a((byte) -116)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                var6 = (CharSequence) ((Object) param2);
                var4_int = this.field_b.field_h.a(gb.a(-14741, var6), false);
                if (this.b(14555, var4_int)) {
                  var7 = (CharSequence) ((Object) param1);
                  var5 = this.field_b.field_t[var4_int].a(gb.a(-14741, var7), false);
                  stackIn_11_0 = this.a(var5, 0, var4_int);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = ((boolean[]) (this.field_h[0]))[3];
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ci.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param0, (byte) 77, param2)) {
            return false;
        }
        if (null != this.field_d[param2]) {
            if (!(null == this.field_d[param2][param0])) {
                return true;
            }
        }
        if (param1 != 0) {
            ((int[]) (((Object[]) (this.field_h[5]))[22]))[8] = ((int[]) (this.field_h[2]))[5];
        }
        if (!(null == this.field_h[param2])) {
            return true;
        }
        this.a(param2, -102);
        if (null != this.field_h[param2]) {
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -113)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_b.field_h.a(gb.a(-14741, var4), false);
              if (this.b(14555, var3_int)) {
                if (param0 >= 39) {
                  stackIn_10_0 = var3_int;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = 17;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ci.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    ci(ih param0, boolean param1, int param2) {
        this.field_b = null;
        try {
            if (param2 < 0 || (param2 ^ -1) < -3) {
                throw new IllegalArgumentException("");
            }
            this.field_a = param1 ? true : false;
            this.field_c = param0;
            this.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = new boolean[8];
        field_g[4] = true;
        field_g[3] = true;
        field_g[2] = true;
        field_g[5] = true;
        field_g[6] = true;
    }
}
