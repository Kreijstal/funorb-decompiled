/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    int field_k;
    static ja[] field_r;
    static String field_b;
    private int field_a;
    static cj field_l;
    int field_i;
    private int field_v;
    int[] field_t;
    private byte[] field_o;
    private int field_u;
    private int field_h;
    long field_f;
    long field_n;
    static int field_q;
    int[] field_p;
    int[] field_c;
    static int field_d;
    static int field_j;
    int[] field_s;
    int[] field_m;
    int[] field_g;
    static String field_e;

    public static void a(int param0) {
        if (param0 != 5) {
            return;
        }
        try {
            field_b = null;
            field_l = null;
            field_e = null;
            field_r = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rp.I(" + param0 + ')');
        }
    }

    private final int b(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fieldTemp$3 = this.field_u;
              this.field_u = this.field_u + 1;
              var2_int = 255 & this.field_o[fieldTemp$3];
              if (param0 == -1458) {
                break L1;
              } else {
                this.field_a = 15;
                break L1;
              }
            }
            fieldTemp$4 = this.field_u;
            this.field_u = this.field_u + 1;
            var3 = 255 & this.field_o[fieldTemp$4];
            fieldTemp$5 = this.field_u;
            this.field_u = this.field_u + 1;
            var4 = this.field_o[fieldTemp$5] & 255;
            stackIn_4_0 = var4 | (var2_int << 323106608 | var3 << 999010088);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.J(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void e(int param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if ((param1 ^ -1) > (this.field_t.length ^ -1)) {
                  L2: {
                    if (param0 == -6821) {
                      break L2;
                    } else {
                      field_l = (cj) null;
                      break L2;
                    }
                  }
                  this.field_f = this.field_f | 1L << param1;
                  this.field_t[param1] = cr.a(param1, -107);
                  this.c((byte) -103);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.S(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) > -1) {
                break L1;
              } else {
                if ((param2 ^ -1) <= (this.field_t.length ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    this.field_t[param2] = this.field_t[param2] + param1;
                    var4_int = -102 / ((param0 - -43) / 40);
                    if ((this.field_t[param2] ^ -1) > (cr.a(param2, -94) ^ -1)) {
                      break L2;
                    } else {
                      this.e(-6821, param2);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "rp.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        boolean stackOut_24_0;
        int statePc = 0;
        Throwable caughtException = null;
        boolean[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new boolean[63];
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = var3 ^ -1;
                        stackIn_3_1 = -64;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= stackIn_3_1) {
                            statePc = 21;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = em.field_ab[var3];
                        stackIn_22_0 = 0;
                        stackIn_5_0 = stackIn_22_0;
                        if (var7 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4.length <= var5) {
                            statePc = 20;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = var4[var5];
                        stackIn_3_0 = -256;
                        stackIn_8_0 = stackIn_3_0;
                        stackIn_3_1 = var6 ^ -1;
                        stackIn_8_1 = stackIn_3_1;
                        if (var7 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != stackIn_8_1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (this.c(127, var3)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_f = this.field_f | 1L << var6;
                        this.field_t[var6] = cr.a(var6, -117);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((this.field_t[var3] ^ -1) <= (cr.a(var3, -81) ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_f = this.field_f | 1L << var3;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2[var6] = true;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3++;
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3 = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-64 >= (var3 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = var2[var3];
                        stackIn_39_0 = stackOut_24_0 ? 1 : 0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var7 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_31_0 = 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == 0 & this.c(127, var3)) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((this.field_t[var3] ^ -1) > (cr.a(var3, -112) ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        this.field_f = this.field_f | 1L << var3;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var3++;
                        if (var7 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = param0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 >= 22) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        field_j = -28;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2_ref), "rp.H(" + param0 + ')');
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte[] param1) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        Object stackIn_32_0 = null;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        Object stackIn_43_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_o = param1;
                        this.field_u = param0;
                        this.field_a = this.d((byte) 45);
                        if (this.field_a < 4) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_i = this.d((byte) 97);
                        this.field_k = (12 & this.field_i) >> 23545570;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_c[0] = this.b(-1458);
                        this.field_p[0] = this.b(param0 + -1458);
                        this.field_c[1] = this.b(-1458);
                        this.field_p[1] = this.b(-1458);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-6 >= (var3_int ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_m[var3_int] = this.d((byte) 69);
                        stackIn_21_0 = this.field_a ^ -1;
                        stackIn_10_0 = stackIn_21_0;
                        stackIn_21_1 = -4;
                        stackIn_10_1 = stackIn_21_1;
                        if (var6 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 > stackIn_10_1) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_g[var3_int] = this.d((byte) 83);
                        if (var6 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_g[var3_int] = 255;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var3_int++;
                        if (var6 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3_int = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = var3_int ^ -1;
                        stackIn_21_1 = -4;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 <= stackIn_21_1) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_s[var3_int] = this.d((byte) 97);
                        var3_int++;
                        if (var6 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var6 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (1 > this.field_a) {
                            statePc = 59;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_v = this.d(-16777216);
                        this.field_h = this.d((byte) 84);
                        this.field_n = this.c(param0 ^ 16741);
                        this.a((byte) 62);
                        var3_int = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var3_int >= 63) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_43_0 = this;
                        stackIn_32_0 = stackIn_43_0;
                        if (var6 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_37_0 = ((rp) (this)).field_t;
                        stackIn_33_0 = stackIn_37_0;
                        stackIn_37_1 = var3_int;
                        stackIn_33_1 = stackIn_37_1;
                        if (this.d(var3_int, 53)) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_35_0 = (int[]) ((Object) stackIn_33_0);
                        stackIn_35_1 = stackIn_33_1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_38_0 = (int[]) ((Object) stackIn_35_0);
                        stackIn_38_1 = stackIn_35_1;
                        stackIn_38_2 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = (int[]) ((Object) stackIn_37_0);
                        stackIn_38_1 = stackIn_37_1;
                        stackIn_38_2 = cr.a(var3_int, -95);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_38_0[stackIn_38_1] = stackIn_38_2;
                        var3_int++;
                        if (var6 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-5 >= (this.field_a ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = this;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3_int = this.d((byte) 79);
                        var4 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var4 >= var3_int) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var5 = this.d((byte) 85);
                        this.field_t[var5] = this.f((byte) -53);
                        var4++;
                        if (var6 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var6 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.a((byte) 106);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (this.field_a < 5) {
                            statePc = 59;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.field_f = this.c(16741);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_57_0 = (RuntimeException) (var3);
                    stackIn_55_0 = stackIn_57_0;
                    stackIn_57_1 = new StringBuilder().append("rp.R(").append(param0).append(',');
                    stackIn_55_1 = stackIn_57_1;
                    if (param1 == null) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_55_0);
                    stackIn_58_1 = (StringBuilder) ((Object) stackIn_55_1);
                    stackIn_58_2 = "{...}";
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
                    stackIn_58_2 = "null";
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    throw fa.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
                }
                case 59: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean g(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                this.d(-106, -13);
                break L1;
              }
            }
            stackIn_4_0 = this.a(param0, (byte) 6, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.W(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void c(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_23_0 = 0;
        boolean stackOut_4_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 63;
                        stackIn_3_1 = var2_int;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= stackIn_3_1) {
                            statePc = 22;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this.c(127, var2_int);
                        stackIn_23_0 = stackOut_4_0 ? 1 : 0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var7 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0) {
                            statePc = 21;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = 1;
                        var4 = em.field_ab[var2_int];
                        var5 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var4.length ^ -1) >= (var5 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = var4[var5];
                        stackIn_3_0 = var6;
                        stackIn_11_0 = stackIn_3_0;
                        stackIn_3_1 = 255;
                        stackIn_11_1 = stackIn_3_1;
                        if (var7 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 == stackIn_11_1) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.d(var6, 53)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var3 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_n = this.field_n | 1L << var2_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var2_int++;
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = param0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 <= -90) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_a = 70;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "rp.T(" + param0 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_20_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 3;
                        var3 = 0;
                        var4 = -88 % ((param0 - 68) / 53);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 >= 3) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_17_0 = -49;
                        stackIn_4_0 = stackIn_17_0;
                        stackIn_17_1 = this.field_s[var3] ^ -1;
                        stackIn_4_1 = stackIn_17_1;
                        if (var5 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == stackIn_4_1) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-45 == (this.field_s[var3] ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2_int++;
                        if (var5 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2_int++;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 5;
                        stackIn_17_1 = var2_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 >= stackIn_17_1) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2_int = 5;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = var2_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0;
                }
                case 21: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "rp.D(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if (-1 != (this.field_i & 1 ^ -1)) {
                  stackIn_7_0 = 1;
                  break L1;
                } else {
                  stackIn_7_0 = 0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_u = this.field_u + 2;
            if (param0 == -53) {
              stackIn_4_0 = (255 & this.field_o[-1 + this.field_u]) + ((255 & this.field_o[this.field_u + -2]) << -1038881944);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 116;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.V(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void e(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_12_0 = 0;
        ml stackIn_55_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ga var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        Object var3_ref = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ml var6 = null;
        String var7 = null;
        ml var7_ref = null;
        String var8 = null;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1 = s.field_e;
            var2 = var1.g(31365);
            if (-1 == (var2 ^ -1)) {
              L1: {
                if (bh.field_f == null) {
                  bh.field_f = new sc(128);
                  fn.field_d = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if ((var1.g(31365) ^ -1) != -2) {
                  stackIn_12_0 = 0;
                  break L2;
                } else {
                  stackIn_12_0 = 1;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var3 = stackIn_12_0;
                  var4_ref_String = var1.f((byte) -29);
                  if (var3 != 0) {
                    break L4;
                  } else {
                    var5 = var4_ref_String;
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = var1.f((byte) -19);
                break L3;
              }
              L5: {
                var6 = md.a((byte) -55, var4_ref_String);
                var7 = var1.f((byte) -89);
                var8 = tg.a((CharSequence) ((Object) var4_ref_String), false);
                if (var8 != null) {
                  break L5;
                } else {
                  var8 = var4_ref_String;
                  break L5;
                }
              }
              L6: {
                if (var6 != null) {
                  break L6;
                } else {
                  var6 = md.a((byte) 105, var7);
                  if (null != var6) {
                    bh.field_f.a(-1, var6, (long)var8.hashCode());
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (var6 != null) {
                  break L7;
                } else {
                  var6 = new ml();
                  bh.field_f.a(-1, var6, (long)var8.hashCode());
                  fieldTemp$0 = fn.field_d;
                  fn.field_d = fn.field_d + 1;
                  var6.field_Mb = fieldTemp$0;
                  jf.field_d.a(var6, false);
                  break L7;
                }
              }
              var6.field_Hb = var4_ref_String;
              var6.field_Pb = var5;
              var6.field_Kb = var7;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2 != 1) {
                if (-3 == (var2 ^ -1)) {
                  L8: {
                    if (1 == ge.field_zb) {
                      ge.field_zb = 2;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 == var2) {
                    L9: {
                      if (2 != ge.field_zb) {
                        break L9;
                      } else {
                        ge.field_zb = 1;
                        break L9;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (-5 != (var2 ^ -1)) {
                      bd.a("F1: " + ci.a(0), (Throwable) null, false);
                      ak.a((byte) -119);
                      var3 = 67 % ((-12 - param0) / 48);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      ge.field_zb = 1;
                      var3_ref = var1.f((byte) -119);
                      ta.field_ob = ((String) (var3_ref)).intern();
                      var4 = var1.g(31365);
                      gi.a((byte) -97, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              } else {
                L10: {
                  if (ol.field_o == null) {
                    ol.field_o = new sc(128);
                    dc.field_Fb = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var3_ref = var1.f((byte) -49);
                  if (((String) (var3_ref)).equals("")) {
                    var3_ref = null;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var4_ref_String = var1.f((byte) -14);
                  var5 = var1.f((byte) -45);
                  var6 = dn.a(var4_ref_String, false);
                  if (null != var6) {
                    break L12;
                  } else {
                    var6 = dn.a(var5, false);
                    if (var6 == null) {
                      break L12;
                    } else {
                      ol.field_o.a(-1, var6, (long)tg.a((CharSequence) ((Object) var4_ref_String), false).hashCode());
                      break L12;
                    }
                  }
                }
                L13: {
                  if (var6 == null) {
                    var6 = new ml();
                    ol.field_o.a(-1, var6, (long)tg.a((CharSequence) ((Object) var4_ref_String), false).hashCode());
                    fieldTemp$1 = dc.field_Fb;
                    dc.field_Fb = dc.field_Fb + 1;
                    var6.field_Mb = fieldTemp$1;
                    ro.field_M.a(var6, false);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (null == var3_ref) {
                    break L14;
                  } else {
                    var3_ref = ((String) (var3_ref)).intern();
                    break L14;
                  }
                }
                var6.field_Nb = (String) (var3_ref);
                var6.field_Kb = var5;
                var6.field_Hb = var4_ref_String;
                var6.a(true);
                var7_ref = (ml) ((Object) ro.field_M.c(116));
                L15: while (true) {
                  L16: {
                    L17: {
                      if (var7_ref == null) {
                        break L17;
                      } else {
                        stackIn_55_0 = (ml) (var6);

                        if (var9 != 0) {
                          break L16;
                        } else {
                          if (!md.a(stackIn_55_0, (byte) -49, var7_ref)) {
                            break L17;
                          } else {
                            var7_ref = (ml) ((Object) ro.field_M.b(6));
                            if (var9 == 0) {
                              continue L15;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    stackIn_55_0 = (ml) (var7_ref);
                    break L16;
                  }
                  L18: {
                    L19: {
                      if (stackIn_55_0 != null) {
                        break L19;
                      } else {
                        ro.field_M.a(var6, false);
                        if (var9 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    vc.a(var7_ref, var6, true);
                    break L18;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "rp.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    private final void a(long param0, int param1) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              fieldTemp$8 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$8] = (byte)(int)(param0 >> -860013896);
              fieldTemp$9 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$9] = (byte)(int)(param0 >> -825813136);
              fieldTemp$10 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$10] = (byte)(int)(param0 >> 548135208);
              fieldTemp$11 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$11] = (byte)(int)(param0 >> 1962754144);
              fieldTemp$12 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$12] = (byte)(int)(param0 >> 28332504);
              fieldTemp$13 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$13] = (byte)(int)(param0 >> 564278032);
              if (param1 == -30502) {
                break L1;
              } else {
                this.e(13, 118);
                break L1;
              }
            }
            fieldTemp$14 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$14] = (byte)(int)(param0 >> -661373240);
            fieldTemp$15 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$15] = (byte)(int)param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "rp.P(" + param0 + ',' + param1 + ')');
        }
    }

    private final int d(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_u = this.field_u + 4;
            if (param0 == -16777216) {
              stackIn_4_0 = (255 & this.field_o[-1 + this.field_u]) + (((this.field_o[-3 + this.field_u] & 255) << 136379792) + (-16777216 & this.field_o[this.field_u + -4] << 47607704)) - -((this.field_o[this.field_u + -2] & 255) << 1979869096);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 34;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 53) {
                break L1;
              } else {
                field_j = 53;
                break L1;
              }
            }
            L2: {
              if (0L == (1L << param0 & this.field_f)) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.Q(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void e(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            this.field_i = this.field_i ^ 1;
            if (param0 < -102) {
              L1: {
                if (fb.field_e == null) {
                  break L1;
                } else {
                  fb.field_e.b((byte) 37);
                  break L1;
                }
              }
              we.field_g[47] = vn.field_d[ll.field_k.b((byte) -1)];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                this.field_a = -48;
                break L1;
              }
            }
            fieldTemp$1 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$1] = (byte)tq.b(255, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.B(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] f(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_33_0 = 0;
        byte[] stackIn_37_0 = null;
        boolean stackOut_18_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_a = 5;
                        this.field_o = new byte[hd.field_u];
                        this.field_u = 0;
                        this.b(this.field_a, -1);
                        this.field_i = this.field_i & -13;
                        this.field_i = this.field_i | this.field_k << -553171358;
                        this.b(this.field_i, -1);
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-6 >= (var2_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.b((int) (byte)this.field_m[var2_int], -1);
                        this.b((int) (byte)this.field_g[var2_int], param0 ^ 16612);
                        var2_int++;
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var2_int ^ -1) <= -4) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.b((int) (byte)this.field_s[var2_int], -1);
                        var2_int++;
                        if (var4 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.f(79, this.field_v);
                        this.b(this.field_h, -1);
                        this.a(this.field_n, -30502);
                        fieldTemp$0 = this.field_u;
                        this.field_u = this.field_u + 1;
                        var2_int = fieldTemp$0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var3 ^ -1) <= -64) {
                            statePc = 32;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = this.c(param0 + 16740, var3);
                        stackIn_33_0 = stackOut_18_0 ? 1 : 0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var4 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!stackIn_19_0) {
                            statePc = 31;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((this.field_t[var3] ^ -1) == -1) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!this.d(var3, 53)) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        this.b(var3, -1);
                        this.a((byte) -23, this.field_t[var3]);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var3++;
                        if (var4 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = param0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 == -16613) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        field_l = (cj) null;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        this.field_o[var2_int] = (byte)((this.field_u + -var2_int) / 3);
                        this.a(this.field_f, param0 ^ 14273);
                        stackIn_37_0 = this.field_o;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return stackIn_37_0;
                }
                case 38: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "rp.M(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2 == 0) {
              stackIn_5_0 = this.c(127, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.c(127, param0)) {
                var4 = em.field_ab[param0];
                var5 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if ((var5 ^ -1) <= (var4.length ^ -1)) {
                        break L3;
                      } else {
                        var6 = var4[var5];
                        stackIn_22_0 = var6 ^ -1;

                        stackIn_22_1 = -256;

                        if (var7 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (stackIn_22_0 == stackIn_22_1) {
                              break L4;
                            } else {
                              if (!this.a(var6, (byte) 6, -1 + param2)) {
                                break L4;
                              } else {
                                stackIn_19_0 = 1;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              }
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackIn_22_0 = param1;
                    stackIn_22_1 = 6;
                    break L2;
                  }
                  L5: {
                    if (stackIn_22_0 == stackIn_22_1) {
                      break L5;
                    } else {
                      this.a(-101, 43, 112);
                      break L5;
                    }
                  }
                  stackIn_26_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4_ref), "rp.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_26_0 != 0;
            }
          }
        }
    }

    final boolean a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3_int ^ -1) <= -4) {
                    break L3;
                  } else {
                    stackIn_11_0 = param0;

                    stackIn_11_1 = this.field_s[var3_int];

                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (stackIn_11_0 != stackIn_11_1) {
                        var3_int++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_11_0 = param1;
                stackIn_11_1 = -125;
                break L2;
              }
              L4: {
                if (stackIn_11_0 < stackIn_11_1) {
                  break L4;
                } else {
                  this.b((byte) -42);
                  break L4;
                }
              }
              stackIn_15_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    private final void f(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$0 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_o[fieldTemp$0] = (byte)tq.b(255, param1 >> -421851432);
        int fieldTemp$1 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_o[fieldTemp$1] = (byte)tq.b(param1 >> 1460651856, 255);
        int fieldTemp$2 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_o[fieldTemp$2] = (byte)tq.b(255, param1 >> -226529592);
        if (param0 < 8) {
            return;
        }
        try {
            fieldTemp$3 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$3] = (byte)tq.b(255, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rp.N(" + param0 + ',' + param1 + ')');
        }
    }

    private final int d(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 44) {
              fieldTemp$1 = this.field_u;
              this.field_u = this.field_u + 1;
              stackIn_4_0 = this.field_o[fieldTemp$1] & 255;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 120;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.BA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        try {
            fieldTemp$0 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$0] = (byte)tq.b(param1 >> -1461475064, 255);
            fieldTemp$1 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$1] = (byte)(tq.b(param1, 255) >> -1807972640);
            if (param0 != -23) {
                this.field_c = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rp.AA(" + param0 + ',' + param1 + ')');
        }
    }

    private final long c(int param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = (long)this.d(-16777216) & 4294967295L;
              if (param0 == 16741) {
                break L1;
              } else {
                this.field_u = 18;
                break L1;
              }
            }
            var4 = (long)this.d(-16777216) & 4294967295L;
            stackIn_4_0 = var4 + (var2_long << -429062112);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.U(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 126) {
                break L1;
              } else {
                this.g(-39, 66);
                break L1;
              }
            }
            if ((param1 ^ -1) == -256) {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if ((1L << param1 & this.field_n) == 0L) {
                  stackIn_12_0 = 0;
                  break L2;
                } else {
                  stackIn_12_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.L(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    rp() {
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_a = 1;
                    this.field_t = new int[63];
                    this.field_p = new int[2];
                    this.field_c = new int[2];
                    this.field_s = new int[3];
                    this.field_m = new int[5];
                    this.field_g = new int[5];
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_a = 1;
                        this.field_c[0] = pd.a(-27486);
                        this.field_c[1] = pd.a(-27486);
                        this.field_p[0] = pd.a(-27486);
                        this.field_p[1] = pd.a(-27486);
                        this.field_i = 0;
                        var1_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var1_int ^ -1) <= (this.field_m.length ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_m[var1_int] = 255;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((this.field_g.length ^ -1) >= (var1_int ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_g[var1_int] = 255;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var1_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var1_int >= this.field_s.length) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_s[var1_int] = 255;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var2 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_n = ej.a((byte) -66);
                        this.field_m[1] = 3;
                        this.field_m[2] = 8;
                        this.field_f = 0L;
                        this.field_m[0] = 0;
                        this.field_k = 0;
                        this.field_s[0] = 58;
                        this.field_s[2] = 53;
                        this.field_s[1] = 59;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "rp.<init>()");
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = "Meltdown";
        field_j = 5;
        field_d = 33;
        field_e = "You have 1 unread message!";
    }
}
