/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends q {
    private dj field_i;
    static vd[] field_k;
    static tf field_l;
    static int field_j;

    n(dj param0, dj param1) {
        super(param0);
        try {
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 0) {
            n.c((byte) 89);
        }
    }

    final static dm[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int statePc = 0;
        int var9 = 0;
        dm[] var10 = null;
        dm[] var11_ref_dm__ = null;
        int var11 = 0;
        int var12 = 0;
        dm var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Geoblox.field_C;
                    var9 = param1 + param7 + param8;
                    var10 = new dm[]{new dm(var9, var9), new dm(param3, var9), new dm(var9, var9), new dm(var9, param3), new dm(64, 64), new dm(var9, param3), new dm(var9, var9), new dm(param3, var9), new dm(var9, var9)};
                    var11_ref_dm__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var12 >= var11_ref_dm__.length) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = var11_ref_dm__[var12];
                    stackIn_11_0 = 0;
                    stackIn_3_0 = stackIn_11_0;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var14 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var13.field_v.length <= var14) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13.field_v[var14] = param5;
                    var14++;
                    if (var15 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var15 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var15 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var11 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var11 >= param8) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_22_0 = 0;
                    stackIn_14_0 = stackIn_22_0;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var12 = stackIn_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var9 <= var12) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10[6].field_v[var12 + (var9 - var11 + -1) * var9] = param6;
                    var10[8].field_v[var12 + (-1 + -var11 + var9) * var9] = param6;
                    var10[2].field_v[var12 * var9 + -var11 + var9 + -1] = param6;
                    var10[8].field_v[-var11 - 1 - (-var9 - var9 * var12)] = param6;
                    var12++;
                    if (var15 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var15 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var11 = stackIn_22_0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = var11;
                    stackIn_24_1 = param8;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 >= stackIn_24_1) {
                        statePc = 33;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_34_0 = 0;
                    stackIn_26_0 = stackIn_34_0;
                    if (var15 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = stackIn_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var9 <= var12) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10[0].field_v[var12 - -(var11 * var9)] = param2;
                    var10[0].field_v[var11 + var12 * var9] = param2;
                    stackIn_24_0 = -var11 + var9 ^ -1;
                    stackIn_29_0 = stackIn_24_0;
                    stackIn_24_1 = var12 ^ -1;
                    stackIn_29_1 = stackIn_24_1;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 >= stackIn_29_1) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10[2].field_v[var9 * var11 + var12] = param2;
                    var10[6].field_v[var11 + var12 * var9] = param2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var11 = stackIn_34_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var11 >= param3) {
                        statePc = 44;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_45_0 = 0;
                    stackIn_37_0 = stackIn_45_0;
                    if (var15 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var12 = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (param8 <= var12) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var10[7].field_v[param3 * (var9 - var12 - 1) + var11] = param6;
                    var10[5].field_v[-1 + (var9 - var12 + var11 * var9)] = param6;
                    var10[1].field_v[param3 * var12 - -var11] = param2;
                    var10[3].field_v[var12 + var9 * var11] = param2;
                    var12++;
                    if (var15 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var15 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var11++;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var15 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var11 = stackIn_45_0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var11 >= param3 >> 362369793) {
                        statePc = 55;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_56_0 = 0;
                    stackIn_48_0 = stackIn_56_0;
                    if (var15 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var12 = stackIn_48_0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (param1 <= var12) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var10[1].field_v[param3 * (-1 + (-var12 + var9)) - -var11] = param0;
                    var10[3].field_v[-1 - -var9 + (-var12 + var9 * var11)] = param0;
                    var10[7].field_v[var11 + param3 * var12] = param0;
                    var10[5].field_v[var9 * var11 - -var12] = param0;
                    var12++;
                    if (var15 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var15 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var11++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var15 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = param4;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 == 1) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    n.g(5);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(byte param0) {
        if (!(Geoblox.field_y == null)) {
            Geoblox.field_y.h((byte) -104);
        }
        vk.field_d = new hi();
        int var1 = 32 / ((param0 - 43) / 47);
        hk.field_C.b(vk.field_d, -106);
    }

    final lh a(int param0, String param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        lh stackIn_2_0 = null;
        lh stackIn_9_0 = null;
        lh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -257) {
              L1: {
                if (this.field_i instanceof nl) {
                  var3 = ((nl) ((Object) this.field_i)).a((byte) -106);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (var3.a((byte) -105) != kk.field_w) {
                      stackIn_9_0 = si.field_m;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!param1.equals(this.field_i.field_s)) {
                  stackIn_13_0 = si.field_m;
                  break L2;
                } else {
                  stackIn_13_0 = kk.field_w;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = (lh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("n.D(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final String b(int param0, String param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 422) {
                break L1;
              } else {
                field_l = (tf) null;
                break L1;
              }
            }
            L2: {
              if (!(this.field_i instanceof nl)) {
                break L2;
              } else {
                var3 = ((nl) ((Object) this.field_i)).a((byte) -118);
                if (var3 == null) {
                  break L2;
                } else {
                  L3: {
                    if (var3.a((byte) -105) != kk.field_w) {
                      break L3;
                    } else {
                      if (!param1.equals(this.field_i.field_s)) {
                        stackIn_8_0 = sj.field_b;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_10_0 = var3.c(-21666);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            if (!param1.equals(this.field_i.field_s)) {
              stackIn_14_0 = sj.field_b;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("n.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static sl d(byte param0) {
        int var1;
        if (uf.field_l == kd.field_b) {
          throw new IllegalStateException();
        } else {
          var1 = 28 % ((-79 - param0) / 44);
          if (va.field_e != kd.field_b) {
            return null;
          } else {
            kd.field_b = uf.field_l;
            return dl.field_a;
          }
        }
    }

    static {
        field_l = new tf();
    }
}
