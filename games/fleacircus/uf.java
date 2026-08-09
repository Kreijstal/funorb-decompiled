/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    private cg[] field_g;
    private af field_a;
    private java.math.BigInteger field_i;
    static dd field_f;
    static int[] field_b;
    static int[] field_e;
    private java.math.BigInteger field_d;
    private w field_m;
    static String field_l;
    private ni field_c;
    static int field_k;
    static int field_h;
    private fk field_j;

    final void a(int param0) {
        int var2;
        int var3;
        cg stackIn_14_0 = null;
        Object stackIn_20_0 = null;
        cg stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        var3 = fleas.field_A ? 1 : 0;
        if (this.field_g == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (var2 >= this.field_g.length) {
                      break L4;
                    } else {
                      stackIn_26_0 = this.field_g[var2];

                      if (var3 != 0) {
                        L5: while (true) {
                          L6: {
                            if (stackIn_26_0 != null) {
                              this.field_g[var2].b((byte) 123);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var2++;
                          if (var3 == 0) {
                            if (this.field_g.length <= var2) {
                              break L3;
                            } else {
                              stackIn_20_0 = this;

                              if (var3 != 0) {
                                break L2;
                              } else {
                                stackIn_28_0 = this;
                                stackIn_26_0 = ((uf) (this)).field_g[var2];
                                continue L5;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        L7: {
                          if (stackIn_26_0 != null) {
                            this.field_g[var2].a(false);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var2++;
                        if (var3 == 0) {
                          continue L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var2 = 0;
                  L8: while (true) {
                    if (this.field_g.length <= var2) {
                      break L3;
                    } else {
                      stackIn_20_0 = this;

                      if (var3 != 0) {
                        break L2;
                      } else {
                        stackIn_14_0 = ((uf) (this)).field_g[var2];
                        L9: {
                          if (stackIn_14_0 != null) {
                            this.field_g[var2].b((byte) 123);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var2++;
                        if (var3 == 0) {
                          continue L8;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (param0 == -23608) {
                  break L1;
                } else {
                  stackIn_20_0 = this;
                  break L2;
                }
              }
              ((uf) (this)).field_c = (ni) null;
              break L1;
            }
            return;
          }
        }
    }

    final static StringBuilder a(int param0, StringBuilder param1, char param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param1.length();
                        param1.setLength(param0);
                        if (param3 < -117) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (StringBuilder) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var5 = var4_int;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 >= param0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_10_0 = (StringBuilder) (param1);
                        stackIn_7_0 = stackIn_10_0;
                        if (var6 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((StringBuilder) (Object) stackIn_7_0).setCharAt(var5, param2);
                        var5++;
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = (StringBuilder) (param1);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (var4);
                    stackIn_12_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("uf.C(").append(param0).append(',');
                    stackIn_12_1 = stackIn_13_1;
                    if (param1 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(byte param0) {
        int stackIn_22_0 = 0;
        int stackIn_38_0 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        int var7;
        int var8;
        ni var10;
        byte[] var11;
        byte[] var13;
        java.math.BigInteger var14;
        java.math.BigInteger var15;
        java.math.BigInteger var17;
        java.math.BigInteger var18;
        byte[] var20;
        byte[] var21;
        var8 = fleas.field_A ? 1 : 0;
        if (this.field_c != null) {
          return true;
        } else {
          L0: {
            if (null != this.field_j) {
              break L0;
            } else {
              if (!this.field_m.a(-110)) {
                this.field_j = this.field_m.a(127, true, 255, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (this.field_j.field_q) {
            return false;
          } else {
            var10 = new ni(this.field_j.g(100));
            var10.field_i = 5;
            if (param0 < -127) {
              L1: {
                L2: {
                  var3 = var10.e(false);
                  var10.field_i = var10.field_i + 72 * var3;
                  var13 = new byte[var10.field_k.length + -var10.field_i];
                  var11 = var13;
                  var4 = var11;
                  var10.b(var4, 0, -65, var13.length);
                  if (null == this.field_d) {
                    break L2;
                  } else {
                    if (null == this.field_i) {
                      break L2;
                    } else {
                      var17 = new java.math.BigInteger(var13);
                      var18 = var17.modPow(this.field_d, this.field_i);
                      var5 = var18.toByteArray();
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if ((var5.length ^ -1) == -66) {
                var21 = kb.a(var10.field_k, -5 + var10.field_i + -var13.length, (byte) 122, 5);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    stackIn_38_0 = var5[var7 + 1] ^ -1;

                    if (var8 == 0) {
                      if (stackIn_38_0 != (var21[var7] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        if (var8 == 0) {
                          continue L3;
                        } else {
                          this.field_c = var10;
                          this.field_g = new cg[var3];
                          return true;
                        }
                      }
                    } else {
                      return stackIn_38_0 != 0;
                    }
                  } else {
                    this.field_c = var10;
                    this.field_g = new cg[var3];
                    return true;
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              L4: {
                L5: {
                  field_k = 85;
                  var3 = var10.e(false);
                  var10.field_i = var10.field_i + 72 * var3;
                  var13 = new byte[var10.field_k.length + -var10.field_i];
                  var11 = var13;
                  var4 = var11;
                  var10.b(var4, 0, -65, var13.length);
                  if (null == this.field_d) {
                    break L5;
                  } else {
                    if (null == this.field_i) {
                      break L5;
                    } else {
                      var14 = new java.math.BigInteger(var13);
                      var15 = var14.modPow(this.field_d, this.field_i);
                      var5 = var15.toByteArray();
                      if (var8 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var5 = var4;
                break L4;
              }
              if ((var5.length ^ -1) == -66) {
                var20 = kb.a(var10.field_k, -5 + var10.field_i + -var13.length, (byte) 122, 5);
                var7 = 0;
                L6: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    stackIn_22_0 = var5[var7 + 1] ^ -1;

                    if (var8 == 0) {
                      if (stackIn_22_0 != (var20[var7] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        if (var8 == 0) {
                          continue L6;
                        } else {
                          this.field_c = var10;
                          this.field_g = new cg[var3];
                          return true;
                        }
                      }
                    } else {
                      return stackIn_22_0 != 0;
                    }
                  } else {
                    this.field_c = var10;
                    this.field_g = new cg[var3];
                    return true;
                  }
                }
              } else {
                throw new RuntimeException();
              }
            }
          }
        }
    }

    final cg a(int param0, boolean param1, ah param2, ah param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        cg var9 = null;
        byte[] var13 = null;
        cg stackIn_9_0 = null;
        cg stackIn_12_0 = null;
        cg stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_c != null) {
              L1: {
                if (param4 < 0) {
                  break L1;
                } else {
                  if (this.field_g.length <= param4) {
                    break L1;
                  } else {
                    if (null != this.field_g[param4]) {
                      stackIn_9_0 = this.field_g[param4];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      this.field_c.field_i = 72 * param4 - -6;
                      var6_int = this.field_c.c((byte) 127);
                      var7 = this.field_c.c((byte) -28);
                      var13 = new byte[64];
                      if (param0 == 28742) {
                        this.field_c.b(var13, 0, -64, 64);
                        var9 = new cg(param4, param2, param3, this.field_m, this.field_a, var6_int, var13, var7, param1);
                        this.field_g[param4] = var9;
                        stackIn_14_0 = (cg) (var9);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackIn_12_0 = (cg) null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("uf.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    uf(w param0, af param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void a(boolean param0) {
        field_l = null;
        if (!param0) {
          field_k = -71;
          field_e = null;
          field_b = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_f = null;
          return;
        }
    }

    private uf(w param0, af param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_i = param3;
              this.field_a = param1;
              this.field_d = param2;
              this.field_m = param0;
              if (this.field_m.a(86)) {
                break L1;
              } else {
                this.field_j = this.field_m.a(127, true, 255, 255, (byte) 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("uf.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_e = new int[150];
        field_b = new int[10];
        field_l = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
