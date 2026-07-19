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
        int var2 = 0;
        int var3 = 0;
        cg stackIn_6_0 = null;
        Object stackIn_13_0 = null;
        cg stackIn_14_0 = null;
        Object stackIn_20_0 = null;
        cg stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        cg stackOut_5_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_30_0 = null;
        cg stackOut_28_0 = null;
        Object stackOut_12_0 = null;
        cg stackOut_13_0 = null;
        Object stackOut_19_0 = null;
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
                      stackOut_5_0 = this.field_g[var2];
                      stackIn_26_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
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
                              stackOut_29_0 = this;
                              stackIn_20_0 = stackOut_29_0;
                              stackIn_30_0 = stackOut_29_0;
                              if (var3 != 0) {
                                break L2;
                              } else {
                                stackOut_30_0 = this;
                                stackIn_28_0 = stackOut_30_0;
                                stackOut_28_0 = ((uf) (this)).field_g[var2];
                                stackIn_26_0 = stackOut_28_0;
                                continue L5;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        L7: {
                          if (stackIn_6_0 != null) {
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
                      stackOut_12_0 = this;
                      stackIn_20_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        stackOut_13_0 = ((uf) (this)).field_g[var2];
                        stackIn_14_0 = stackOut_13_0;
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
                  stackOut_19_0 = this;
                  stackIn_20_0 = stackOut_19_0;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_2_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param1.length();
            param1.setLength(param0);
            if (param3 < -117) {
              var5 = var4_int;
              L1: while (true) {
                L2: {
                  if (var5 >= param0) {
                    stackOut_9_0 = (StringBuilder) (param1);
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_6_0 = (StringBuilder) (param1);
                    stackIn_10_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      ((StringBuilder) (Object) stackIn_7_0).setCharAt(var5, param2);
                      var5++;
                      continue L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (StringBuilder) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("uf.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        ni var10 = null;
        byte[] var11 = null;
        byte[] var13 = null;
        java.math.BigInteger var14 = null;
        java.math.BigInteger var15 = null;
        java.math.BigInteger var17 = null;
        java.math.BigInteger var18 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_20_0 = 0;
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
                    stackOut_36_0 = var5[var7 + 1] ^ -1;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_37_0 = stackOut_36_0;
                    if (var8 == 0) {
                      if (stackIn_38_0 != (var21[var7] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        continue L3;
                      }
                    } else {
                      return stackIn_37_0 != 0;
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
                    stackOut_20_0 = var5[var7 + 1] ^ -1;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (var8 == 0) {
                      if (stackIn_22_0 != (var20[var7] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        continue L6;
                      }
                    } else {
                      return stackIn_21_0 != 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cg stackOut_8_0 = null;
        cg stackOut_13_0 = null;
        cg stackOut_11_0 = null;
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
                      stackOut_8_0 = this.field_g[param4];
                      stackIn_9_0 = stackOut_8_0;
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
                        stackOut_13_0 = (cg) (var9);
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackOut_11_0 = (cg) null;
                        stackIn_12_0 = stackOut_11_0;
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
            stackOut_15_0 = (RuntimeException) (var6);
            stackOut_15_1 = new StringBuilder().append("uf.B(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param4 + ')');
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("uf.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_e = new int[150];
        field_b = new int[10];
        field_l = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
