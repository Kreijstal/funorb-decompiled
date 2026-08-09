/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends kb {
    static th field_M;
    static cj field_O;
    static boolean field_L;
    static String field_N;

    ro(String[] param0, fc param1) {
        super(param0, param1);
    }

    public static void b(byte param0) {
        field_N = null;
        field_M = null;
        if (param0 <= 37) {
            field_L = false;
            field_O = null;
            return;
        }
        field_O = null;
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 <= -118) {
              var3_int = 0;
              var4 = param2.length();
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 <= var5) {
                      break L3;
                    } else {
                      stackIn_11_0 = param1 ^ -1;

                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_11_0 != (param2.charAt(var5) ^ -1)) {
                            break L4;
                          } else {
                            var3_int++;
                            break L4;
                          }
                        }
                        var5++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_11_0 = var3_int;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 101;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ro.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    final void a(k param0, byte param1) {
        k stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        k stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        k stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        ek stackIn_12_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        ek stackOut_11_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        ek var3 = null;
        ce var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4_int = 0;
        bf var4 = null;
        int var5 = 0;
        int var6 = 0;
        pa var7 = null;
        og var8 = null;
        ge var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param0.a(-110, this.field_r);
                        param0.a(this.field_H, (byte) -96);
                        stackIn_3_0 = (k) (param0);
                        stackIn_2_0 = stackIn_3_0;
                        stackIn_3_1 = 109;
                        stackIn_2_1 = stackIn_3_1;
                        if (this.field_i) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = (k) ((Object) stackIn_2_0);
                        stackIn_4_1 = stackIn_2_1;
                        stackIn_4_2 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = (k) ((Object) stackIn_3_0);
                        stackIn_4_1 = stackIn_3_1;
                        stackIn_4_2 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((k) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2);
                        param0.a(this.field_C, (byte) -121);
                        param0.a(this.field_I, (byte) -55);
                        param0.a(this.field_g, (byte) -54);
                        param0.a(-73, this.field_l);
                        var3_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_t <= var3_int) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param0.a(110, this.field_y[var3_int]);
                        param0.d(this.field_D[var3_int][0], -8593);
                        param0.d(this.field_D[var3_int][1], -8593);
                        param0.a(this.field_d[var3_int], (byte) -84);
                        param0.d((int)(this.field_e[var3_int] >>> -399687704), -8593);
                        param0.a(this.field_a[var3_int], (byte) -85);
                        param0.a(this.field_z[var3_int], (byte) -78);
                        var3_int++;
                        if (var6 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3 = (ek) ((Object) this.field_K.c(40));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3 == null) {
                            statePc = 28;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (ek) (var3);
                        stackIn_29_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var6 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 instanceof pa) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = (pa) ((Object) var3);
                        if ((var7.field_Q ^ -1) == -22) {
                            statePc = 27;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!var7.field_Z) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var6 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param0.a(108, this.a(var3, (byte) -105));
                        param0.a(110, var3.field_x);
                        param0.a(var3.e((byte) -112), (byte) -67);
                        param0.a(var3.g(1829947600), (byte) -95);
                        var4_int = var3.field_D;
                        if (var3 instanceof ge) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var3 instanceof og) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var8 = (og) ((Object) var3);
                        if (var8.field_Q) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4_int = var4_int | 536870912;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var6 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9 = (ge) ((Object) var3);
                        var4_int = var4_int | var9.field_gb << 654099486;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4_int = var4_int & 255 | (-16777216 & var4_int) >> 473582544;
                        param0.a(var4_int, (byte) -104);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var3 = (ek) ((Object) this.field_K.b(6));
                        if (var6 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = this.field_s.c(102);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var3_ref = (ce) ((Object) stackIn_29_0);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var3_ref == null) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param0.a(-64, 5);
                        param0.a(112, var3_ref.field_q);
                        param0.a((var3_ref.field_m + ip.field_f) * 24, (byte) -69);
                        param0.a((ip.field_f + var3_ref.field_t) * 24, (byte) -54);
                        param0.a(var3_ref.field_s, (byte) -103);
                        var3_ref = (ce) ((Object) this.field_s.b(6));
                        if (var6 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3_int = 11 + 16 * this.field_t - -((this.field_K.a(0) - -this.field_s.a(0) + this.field_A.a(0)) * 8);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((57 + var3_int ^ -1) < -2001) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param0.a(117, 0);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return;
                }
                case 37: {
                    try {
                        var4 = (bf) ((Object) this.field_A.c(59));
                        if (param1 < -107) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return;
                }
                case 39: {
                    try {
                        if (var4 != null) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        param0.a(-106, 0);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        param0.a(-94, 4);
                        param0.a(-36, 0);
                        param0.a(var4.field_i, (byte) -104);
                        param0.a(var4.field_l, (byte) -107);
                        var5 = 0;
                        var5 = var5 | var4.field_o << 97582558;
                        param0.a(var5, (byte) -105);
                        var4 = (bf) ((Object) this.field_A.b(6));
                        if (var6 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var6 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        param0.a(-106, 0);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var3_ref2 = (RuntimeException) ((Object) caughtException);
                    stackIn_48_0 = (RuntimeException) (var3_ref2);
                    stackIn_47_0 = stackIn_48_0;
                    stackIn_48_1 = new StringBuilder().append("ro.E(");
                    stackIn_47_1 = stackIn_48_1;
                    if (param0 == null) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_49_2 = "{...}";
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_49_2 = "null";
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    throw fa.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param1 + ')');
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(ek param0, byte param1) {
        RuntimeException var3 = null;
        k var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -80) {
                break L1;
              } else {
                var4 = (k) null;
                this.a((k) null, (byte) 11);
                break L1;
              }
            }
            if (param0 instanceof ge) {
              stackIn_12_0 = 1;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if (!(param0 instanceof lm)) {
                if (!(param0 instanceof og)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = 3;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_5_0 = 2;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ro.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static int c(byte param0) {
        if (param0 < 116) {
            return 69;
        }
        return (li.field_C << 437096900) + ((qe.field_g << -1670987742) - -ba.field_q);
    }

    static {
        field_N = "? ? ?";
    }
}
