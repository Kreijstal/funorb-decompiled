/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    private uj field_c;
    private ca[] field_g;
    private java.math.BigInteger field_d;
    private gk field_f;
    static c field_h;
    private wl field_e;
    static String field_j;
    private java.math.BigInteger field_i;
    static int field_b;
    private ob field_a;

    final boolean a(byte param0) {
        int stackIn_22_0 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        gk var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null == this.field_f) {
          L0: {
            if (null != this.field_a) {
              break L0;
            } else {
              if (!this.field_e.d(20)) {
                this.field_a = this.field_e.a(255, 255, 122, true, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!this.field_a.field_j) {
            var10 = new gk(this.field_a.e(100));
            var10.field_h = 5;
            var3 = var10.a((byte) 114);
            var10.field_h = var10.field_h + var3 * 72;
            if (param0 <= -49) {
              L1: {
                L2: {
                  var13 = new byte[-var10.field_h + var10.field_g.length];
                  var11 = var13;
                  var4 = var11;
                  var10.a(var4, var13.length, -111, 0);
                  if (null == this.field_d) {
                    break L2;
                  } else {
                    if (null == this.field_i) {
                      break L2;
                    } else {
                      var12 = new java.math.BigInteger(var13);
                      var7_ref_java_math_BigInteger = var12.modPow(this.field_d, this.field_i);
                      var5 = var7_ref_java_math_BigInteger.toByteArray();
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
              if (var5.length != 65) {
                throw new RuntimeException();
              } else {
                var15 = ie.a(-51, var10.field_g, -5 + var10.field_h + -var13.length, 5);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    stackIn_22_0 = var15[var7] ^ -1;

                    if (var8 == 0) {
                      if (stackIn_22_0 != (var5[var7 + 1] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        if (var8 == 0) {
                          continue L3;
                        } else {
                          this.field_f = var10;
                          this.field_g = new ca[var3];
                          return true;
                        }
                      }
                    } else {
                      return stackIn_22_0 != 0;
                    }
                  } else {
                    this.field_f = var10;
                    this.field_g = new ca[var3];
                    return true;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void b(boolean param0) {
        int var2;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_g != null) {
          var2 = 0;
          if (!param0) {
            return;
          } else {
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 >= this.field_g.length) {
                    break L2;
                  } else {
                    if (var3 != 0) {
                      break L1;
                    } else {
                      L3: {
                        if (null == this.field_g[var2]) {
                          break L3;
                        } else {
                          this.field_g[var2].b(-1);
                          break L3;
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var2 = 0;
                break L1;
              }
              L4: while (true) {
                L5: {
                  if (var2 >= this.field_g.length) {
                    break L5;
                  } else {
                    if (var3 != 0) {
                      break L5;
                    } else {
                      L6: {
                        if (this.field_g[var2] == null) {
                          break L6;
                        } else {
                          this.field_g[var2].c(16311);
                          break L6;
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static le[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int statePc = 0;
        int var9 = 0;
        le[] var10 = null;
        le[] var11_ref_le__ = null;
        int var11 = 0;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var9 = param3 + (param7 + param6);
                    var10 = new le[]{new le(var9, var9), new le(param1, var9), new le(var9, var9), new le(var9, param1), new le(64, 64), new le(var9, param1), new le(var9, var9), new le(param1, var9), new le(var9, var9)};
                    var11_ref_le__ = var10;
                    if (param8) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    c.a(-50, -14, 118, -7, 1, -75, 1, 23, false);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var12 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var11_ref_le__.length <= var12) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var13 = var11_ref_le__[var12];
                    stackIn_13_0 = 0;
                    stackIn_5_0 = stackIn_13_0;
                    if (var15 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var14 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var14 >= var13.field_s.length) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var13.field_s[var14] = param5;
                    var14++;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var15 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var12++;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var15 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var11 = stackIn_13_0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (param7 <= var11) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_24_0 = 0;
                    stackIn_16_0 = stackIn_24_0;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var12 = stackIn_16_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var12 >= var9) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10[6].field_s[var12 + var9 * (-var11 + var9 + -1)] = param2;
                    var10[8].field_s[var12 + (-var11 + var9 - 1) * var9] = param2;
                    var10[2].field_s[var12 * var9 + -var11 + (var9 - 1)] = param2;
                    var10[8].field_s[var9 * var12 - (var11 + (1 + -var9))] = param2;
                    var12++;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var15 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var11++;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var15 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var11 = stackIn_24_0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = var11;
                    stackIn_26_1 = param7;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 >= stackIn_26_1) {
                        statePc = 35;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_36_0 = 0;
                    stackIn_28_0 = stackIn_36_0;
                    if (var15 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var12 = stackIn_28_0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var9 <= var12) {
                        statePc = 34;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10[0].field_s[var9 * var11 + var12] = param4;
                    var10[0].field_s[var9 * var12 + var11] = param4;
                    stackIn_26_0 = var12 ^ -1;
                    stackIn_31_0 = stackIn_26_0;
                    stackIn_26_1 = -var11 + var9 ^ -1;
                    stackIn_31_1 = stackIn_26_1;
                    if (var15 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (stackIn_31_0 <= stackIn_31_1) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var10[2].field_s[var9 * var11 + var12] = param4;
                    var10[6].field_s[var11 + var9 * var12] = param4;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var11 = stackIn_36_0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (param1 <= var11) {
                        statePc = 46;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_47_0 = 0;
                    stackIn_39_0 = stackIn_47_0;
                    if (var15 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var12 = stackIn_39_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var12 >= param7) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var10[7].field_s[param1 * (-1 + var9 + -var12) + var11] = param2;
                    var10[5].field_s[var9 * var11 + (var9 + -1 + -var12)] = param2;
                    var10[1].field_s[param1 * var12 - -var11] = param4;
                    var10[3].field_s[var11 * var9 + var12] = param4;
                    var12++;
                    if (var15 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var15 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var11++;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var15 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var11 = stackIn_47_0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (var11 >= param1 >> 1903996897) {
                        statePc = 56;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var12 = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (param6 <= var12) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var10[1].field_s[param1 * (var9 + -var12 - 1) + var11] = param0;
                    var10[3].field_s[var9 * var11 - var12 - (1 + -var9)] = param0;
                    var10[7].field_s[var11 + var12 * param1] = param0;
                    var10[5].field_s[var9 * var11 - -var12] = param0;
                    var12++;
                    if (var15 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var15 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var11++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var15 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    c(wl param0, uj param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void a(boolean param0) {
        field_j = null;
        if (!param0) {
            c.a(true);
        }
        field_h = null;
    }

    final ca a(int param0, gf param1, int param2, gf param3, boolean param4) {
        ca stackIn_9_0 = null;
        ca stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ca var9 = null;
        gf var10 = null;
        byte[] var14 = null;
        try {
          L0: {
            if (null != this.field_f) {
              L1: {
                if (0 > param2) {
                  break L1;
                } else {
                  if (this.field_g.length <= param2) {
                    break L1;
                  } else {
                    if (this.field_g[param2] != null) {
                      stackIn_9_0 = this.field_g[param2];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        this.field_f.field_h = param2 * 72 + 6;
                        var6_int = this.field_f.e(126);
                        var7 = this.field_f.e(-61);
                        if (param0 == -24559) {
                          break L2;
                        } else {
                          var10 = (gf) null;
                          this.a(-126, (gf) null, 30, (gf) null, false);
                          break L2;
                        }
                      }
                      var14 = new byte[64];
                      this.field_f.a(var14, 64, -86, 0);
                      var9 = new ca(param2, param3, param1, this.field_e, this.field_c, var6_int, var14, var7, param4);
                      this.field_g[param2] = var9;
                      stackIn_13_0 = (ca) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
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
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("c.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    private c(wl param0, uj param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_e = param0;
              this.field_i = param3;
              this.field_d = param2;
              this.field_c = param1;
              if (this.field_e.d(20)) {
                break L1;
              } else {
                this.field_a = this.field_e.a(255, 255, 105, true, (byte) 0);
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

            stackIn_6_1 = new StringBuilder().append("c.<init>(");

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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_j = "Creating your account";
    }
}
