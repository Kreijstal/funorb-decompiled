/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    boolean field_a;
    int field_c;
    static int field_e;
    int field_d;
    static im field_b;
    static int field_f;
    int field_g;

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param0 <= -66) {
                break L1;
              } else {
                field_f = -86;
                break L1;
              }
            }
            L2: {
              L3: {
                param1 = je.a(80, "", param1, '_');
                var3 = wa.a((byte) -117, param1);
                if (0 != (param2.indexOf(param1) ^ -1)) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("oh.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0) {
        if ((this.a(true) ^ -1) < -1) {
            this.field_c = this.a(true);
        }
        if (-1 == (this.a(true) ^ -1)) {
            this.field_c = 1000;
        }
        if (param0 != 0) {
            this.field_d = -80;
        }
    }

    final oh a(rk param0, rk param1, int param2) {
        Object stackIn_10_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_46_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rk var6 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param2 == 8) {
                break L1;
              } else {
                var6 = (rk) null;
                this.a((rk) null, (rk) null, -102);
                break L1;
              }
            }
            L2: {
              if (!this.field_a) {
                break L2;
              } else {
                L3: {
                  var4_int = 8;
                  if (this.field_g != var4_int) {
                    break L3;
                  } else {
                    L4: {
                      if (param0.field_a[var4_int] <= 0) {
                        break L4;
                      } else {
                        param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (param1.field_a[var4_int] > 0) {
                      param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
                      break L3;
                    } else {
                      stackIn_10_0 = null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                L5: {
                  var4_int = 9;
                  if (var4_int == this.field_g) {
                    if (0 < param0.field_a[var4_int]) {
                      param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                      break L5;
                    } else {
                      if (-1 > (param1.field_a[var4_int] ^ -1)) {
                        param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
                        if (var5 == 0) {
                          break L5;
                        } else {
                          stackIn_19_0 = null;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4_int = 12;
                  if (this.field_g != var4_int) {
                    break L6;
                  } else {
                    L7: {
                      if ((param0.field_a[var4_int] ^ -1) >= -1) {
                        break L7;
                      } else {
                        param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if ((param1.field_a[var4_int] ^ -1) < -1) {
                      param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
                      break L6;
                    } else {
                      stackIn_27_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                L8: {
                  var4_int = 13;
                  if (this.field_g != var4_int) {
                    break L8;
                  } else {
                    if (-1 > (param0.field_a[var4_int] ^ -1)) {
                      param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                      break L8;
                    } else {
                      if (param1.field_a[var4_int] > 0) {
                        param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
                        if (var5 == 0) {
                          break L8;
                        } else {
                          stackIn_35_0 = null;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        return null;
                      }
                    }
                  }
                }
                var4_int = 14;
                if (this.field_g != var4_int) {
                  break L2;
                } else {
                  L9: {
                    if (0 >= param0.field_a[var4_int]) {
                      break L9;
                    } else {
                      param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if ((param1.field_a[var4_int] ^ -1) < -1) {
                    param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
                    break L2;
                  } else {
                    stackIn_43_0 = null;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
            this.field_a = false;
            stackIn_46_0 = this;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var4);

            stackIn_49_1 = new StringBuilder().append("oh.B(");

            if (param0 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L10;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');

            if (param1 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L11;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L11;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_50_0), stackIn_53_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (oh) ((Object) stackIn_10_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (oh) ((Object) stackIn_19_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (oh) ((Object) stackIn_27_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (oh) ((Object) stackIn_35_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (oh) ((Object) stackIn_43_0);
                } else {
                  return (oh) (this);
                }
              }
            }
          }
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return -114;
        }
        return od.field_c[this.field_g].field_o;
    }

    public static void b(int param0) {
        if (param0 != 6) {
            return;
        }
        field_b = null;
    }

    final static ci[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        ci[] var10 = null;
        ci[] var11_ref_ci__ = null;
        int var11 = 0;
        int var12 = 0;
        ci var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Terraphoenix.field_V;
                    var9 = param1 + (param6 - -param5);
                    if (param2 == 1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return (ci[]) null;
                }
                case 2: {
                    var10 = new ci[]{new ci(var9, var9), new ci(param3, var9), new ci(var9, var9), new ci(var9, param3), new ci(64, 64), new ci(var9, param3), new ci(var9, var9), new ci(param3, var9), new ci(var9, var9)};
                    var11_ref_ci__ = var10;
                    var12 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var12 >= var11_ref_ci__.length) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var13 = var11_ref_ci__[var12];
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
                    if (var13.field_z.length <= var14) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var13.field_z[var14] = param7;
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
                    if (param6 <= var11) {
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
                    if (var9 <= var12) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10[6].field_z[(var9 + -var11 + -1) * var9 - -var12] = param4;
                    var10[8].field_z[var12 + (-var11 + (var9 - 1)) * var9] = param4;
                    var10[2].field_z[var12 * var9 + -1 + (var9 + -var11)] = param4;
                    var10[8].field_z[var12 * var9 - (var11 + (1 + -var9))] = param4;
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
                    stackIn_26_0 = param6;
                    stackIn_26_1 = var11;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 <= stackIn_26_1) {
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
                    if (var12 >= var9) {
                        statePc = 34;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10[0].field_z[var12 - -(var11 * var9)] = param0;
                    var10[0].field_z[var12 * var9 + var11] = param0;
                    stackIn_26_0 = var12;
                    stackIn_31_0 = stackIn_26_0;
                    stackIn_26_1 = -var11 + var9;
                    stackIn_31_1 = stackIn_26_1;
                    if (var15 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (stackIn_31_0 >= stackIn_31_1) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var10[2].field_z[var9 * var11 + var12] = param0;
                    var10[6].field_z[var9 * var12 - -var11] = param0;
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
                    if (param3 <= var11) {
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
                    if (var12 >= param6) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var10[7].field_z[var11 + param3 * (var9 + (-var12 - 1))] = param4;
                    var10[5].field_z[var9 * var11 - var12 - -var9 - 1] = param4;
                    var10[1].field_z[param3 * var12 + var11] = param0;
                    var10[3].field_z[var12 + var11 * var9] = param0;
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
                    if (var11 >= param3 >> -444692095) {
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
                    if (param5 <= var12) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var10[1].field_z[param3 * (-1 + (-var12 + var9)) - -var11] = param8;
                    var10[3].field_z[-var12 + (-1 + (var9 + var11 * var9))] = param8;
                    var10[7].field_z[var12 * param3 + var11] = param8;
                    var10[5].field_z[var12 + var11 * var9] = param8;
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

    oh(int param0) {
        this.field_d = 8;
        this.field_g = param0;
        this.field_c = od.field_c[param0].field_o;
        if (0 == (this.field_c ^ -1)) {
            this.field_c = 1;
        }
        this.field_a = false;
        if (0 == this.field_c) {
            this.field_c = 1000;
        }
    }

    static {
        field_e = 500;
        field_b = new im();
        field_f = 0;
    }
}
