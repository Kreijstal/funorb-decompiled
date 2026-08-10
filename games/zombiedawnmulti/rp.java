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
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_37_0 = 0;
        boolean stackOut_22_0;
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
                        statePc = 41;
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
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= stackIn_3_1) {
                            statePc = 20;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = em.field_ab[var3];
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4.length <= var5) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = var4[var5];
                        stackIn_3_0 = -256;
                        stackIn_7_0 = stackIn_3_0;
                        stackIn_3_1 = var6 ^ -1;
                        stackIn_7_1 = stackIn_3_1;
                        if (false) {
                            statePc = 3;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 != stackIn_7_1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.c(127, var3)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_f = this.field_f | 1L << var6;
                        this.field_t[var6] = cr.a(var6, -117);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((this.field_t[var3] ^ -1) <= (cr.a(var3, -81) ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_f = this.field_f | 1L << var3;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var2[var6] = true;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-64 >= (var3 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = var2[var3];
                        stackIn_37_0 = stackOut_22_0 ? 1 : 0;
                        stackIn_23_0 = stackOut_22_0;
                        if (false) {
                            statePc = 37;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_29_0 = 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 == 0 & this.c(127, var3)) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((this.field_t[var3] ^ -1) > (cr.a(var3, -112) ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        this.field_f = this.field_f | 1L << var3;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3++;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = param0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 >= 22) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        field_j = -28;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2_ref), "rp.H(" + param0 + ')');
                }
                case 42: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte[] param1) {
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_o = param1;
              this.field_u = param0;
              this.field_a = this.d((byte) 45);
              if (this.field_a < 4) {
                this.field_c[0] = this.b(-1458);
                this.field_p[0] = this.b(param0 + -1458);
                this.field_c[1] = this.b(-1458);
                this.field_p[1] = this.b(-1458);
                break L1;
              } else {
                this.field_i = this.d((byte) 97);
                this.field_k = (12 & this.field_i) >> 23545570;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                if (-6 >= (var3_int ^ -1)) {
                  var3_int = 0;
                  L4: while (true) {
                    stackIn_21_0 = var3_int ^ -1;
                    stackIn_21_1 = -4;
                    if (stackIn_21_0 <= stackIn_21_1) {
                      break L3;
                    } else {
                      this.field_s[var3_int] = this.d((byte) 97);
                      var3_int++;
                      continue L4;
                    }
                  }
                } else {
                  this.field_m[var3_int] = this.d((byte) 69);
                  stackIn_21_0 = this.field_a ^ -1;

                  stackIn_21_1 = -4;

                  L6: {
                    if (stackIn_21_0 > stackIn_21_1) {
                      this.field_g[var3_int] = 255;
                      break L6;
                    } else {
                      this.field_g[var3_int] = this.d((byte) 83);
                      break L6;
                    }
                  }
                  var3_int++;
                  continue L2;
                }
              }
              L7: {
                if (1 > this.field_a) {
                  break L7;
                } else {
                  this.field_v = this.d(-16777216);
                  this.field_h = this.d((byte) 84);
                  this.field_n = this.c(param0 ^ 16741);
                  this.a((byte) 62);
                  var3_int = 0;
                  L8: while (true) {
                    if (var3_int >= 63) {
                      if (-5 >= (this.field_a ^ -1)) {
                        var3_int = this.d((byte) 79);
                        var4 = 0;
                        L9: while (true) {
                          if (var4 >= var3_int) {
                            this.a((byte) 106);
                            if (this.field_a < 5) {
                              break L7;
                            } else {
                              this.field_f = this.c(16741);
                              break L7;
                            }
                          } else {
                            var5 = this.d((byte) 85);
                            this.field_t[var5] = this.f((byte) -53);
                            var4++;
                            continue L9;
                          }
                        }
                      } else {
                        break L7;
                      }
                    } else {
                      L10: {
                        stackIn_35_0 = this.field_t;

                        stackIn_35_1 = var3_int;

                        if (this.d(var3_int, 53)) {
                          stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                          stackIn_36_1 = stackIn_35_1;
                          stackIn_36_2 = cr.a(var3_int, -95);
                          break L10;
                        } else {


                          stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                          stackIn_36_1 = stackIn_35_1;
                          stackIn_36_2 = 0;
                          break L10;
                        }
                      }
                      stackIn_36_0[stackIn_36_1] = stackIn_36_2;
                      var3_int++;
                      continue L8;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var3);

            stackIn_52_1 = new StringBuilder().append("rp.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L11;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
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
                        if (false) {
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
                        if (false) {
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
                        statePc = 9;
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
                        statePc = 2;
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
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 3;
            var3 = 0;
            var4 = -88 % ((param0 - 68) / 53);
            L1: while (true) {
              L2: {
                if (var3 >= 3) {
                  stackIn_17_0 = 5;
                  stackIn_17_1 = var2_int;
                  break L2;
                } else {
                  stackIn_17_0 = -49;

                  stackIn_17_1 = this.field_s[var3] ^ -1;

                  L3: {
                    if (stackIn_17_0 == stackIn_17_1) {
                      var2_int++;
                      break L3;
                    } else {
                      if (-45 == (this.field_s[var3] ^ -1)) {
                        var2_int++;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
              L4: {
                if (stackIn_17_0 >= stackIn_17_1) {
                  break L4;
                } else {
                  var2_int = 5;
                  break L4;
                }
              }
              stackIn_20_0 = var2_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.D(" + param0 + ')');
        }
        return stackIn_20_0;
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
                var3 = stackIn_12_0;
                var4_ref_String = var1.f((byte) -29);
                if (var3 != 0) {
                  var5 = var1.f((byte) -19);
                  break L3;
                } else {
                  var5 = var4_ref_String;
                  break L3;
                }
              }
              L4: {
                var6 = md.a((byte) -55, var4_ref_String);
                var7 = var1.f((byte) -89);
                var8 = tg.a((CharSequence) ((Object) var4_ref_String), false);
                if (var8 != null) {
                  break L4;
                } else {
                  var8 = var4_ref_String;
                  break L4;
                }
              }
              L5: {
                if (var6 != null) {
                  break L5;
                } else {
                  var6 = md.a((byte) 105, var7);
                  if (null != var6) {
                    bh.field_f.a(-1, var6, (long)var8.hashCode());
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var6 != null) {
                  break L6;
                } else {
                  var6 = new ml();
                  bh.field_f.a(-1, var6, (long)var8.hashCode());
                  fieldTemp$0 = fn.field_d;
                  fn.field_d = fn.field_d + 1;
                  var6.field_Mb = fieldTemp$0;
                  jf.field_d.a(var6, false);
                  break L6;
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
                  L7: {
                    if (1 == ge.field_zb) {
                      ge.field_zb = 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 == var2) {
                    L8: {
                      if (2 != ge.field_zb) {
                        break L8;
                      } else {
                        ge.field_zb = 1;
                        break L8;
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
                L9: {
                  if (ol.field_o == null) {
                    ol.field_o = new sc(128);
                    dc.field_Fb = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var3_ref = var1.f((byte) -49);
                  if (((String) (var3_ref)).equals("")) {
                    var3_ref = null;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var4_ref_String = var1.f((byte) -14);
                  var5 = var1.f((byte) -45);
                  var6 = dn.a(var4_ref_String, false);
                  if (null != var6) {
                    break L11;
                  } else {
                    var6 = dn.a(var5, false);
                    if (var6 == null) {
                      break L11;
                    } else {
                      ol.field_o.a(-1, var6, (long)tg.a((CharSequence) ((Object) var4_ref_String), false).hashCode());
                      break L11;
                    }
                  }
                }
                L12: {
                  if (var6 == null) {
                    var6 = new ml();
                    ol.field_o.a(-1, var6, (long)tg.a((CharSequence) ((Object) var4_ref_String), false).hashCode());
                    fieldTemp$1 = dc.field_Fb;
                    dc.field_Fb = dc.field_Fb + 1;
                    var6.field_Mb = fieldTemp$1;
                    ro.field_M.a(var6, false);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (null == var3_ref) {
                    break L13;
                  } else {
                    var3_ref = ((String) (var3_ref)).intern();
                    break L13;
                  }
                }
                var6.field_Nb = (String) (var3_ref);
                var6.field_Kb = var5;
                var6.field_Hb = var4_ref_String;
                var6.a(true);
                var7_ref = (ml) ((Object) ro.field_M.c(116));
                L14: while (true) {
                  L15: {
                    if (var7_ref == null) {
                      break L15;
                    } else {
                      if (!md.a(var6, (byte) -49, var7_ref)) {
                        break L15;
                      } else {
                        var7_ref = (ml) ((Object) ro.field_M.b(6));
                        continue L14;
                      }
                    }
                  }
                  L16: {
                    if (var7_ref != null) {
                      vc.a(var7_ref, var6, true);
                      break L16;
                    } else {
                      ro.field_M.a(var6, false);
                      break L16;
                    }
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
        boolean stackIn_16_0 = false;
        int stackIn_30_0 = 0;
        byte[] stackIn_34_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_15_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_a = 5;
            this.field_o = new byte[hd.field_u];
            this.field_u = 0;
            this.b(this.field_a, -1);
            this.field_i = this.field_i & -13;
            this.field_i = this.field_i | this.field_k << -553171358;
            this.b(this.field_i, -1);
            var2_int = 0;
            L1: while (true) {
              if (-6 >= (var2_int ^ -1)) {
                var2_int = 0;
                L2: while (true) {
                  if ((var2_int ^ -1) <= -4) {
                    this.f(79, this.field_v);
                    this.b(this.field_h, -1);
                    this.a(this.field_n, -30502);
                    fieldTemp$0 = this.field_u;
                    this.field_u = this.field_u + 1;
                    var2_int = fieldTemp$0;
                    var3 = 0;
                    L3: while (true) {
                      L4: {
                        if ((var3 ^ -1) <= -64) {
                          stackIn_30_0 = param0;
                          break L4;
                        } else {
                          stackOut_15_0 = this.c(param0 + 16740, var3);
                          stackIn_30_0 = stackOut_15_0 ? 1 : 0;
                          stackIn_16_0 = stackOut_15_0;
                          L5: {
                            if (!stackIn_16_0) {
                              break L5;
                            } else {
                              if ((this.field_t[var3] ^ -1) == -1) {
                                break L5;
                              } else {
                                if (!this.d(var3, 53)) {
                                  this.b(var3, -1);
                                  this.a((byte) -23, this.field_t[var3]);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var3++;
                          continue L3;
                        }
                      }
                      L6: {
                        if (stackIn_30_0 == -16613) {
                          break L6;
                        } else {
                          field_l = (cj) null;
                          break L6;
                        }
                      }
                      this.field_o[var2_int] = (byte)((this.field_u + -var2_int) / 3);
                      this.a(this.field_f, param0 ^ 14273);
                      stackIn_34_0 = this.field_o;
                      break L0;
                    }
                  } else {
                    this.b((int) (byte)this.field_s[var2_int], -1);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                this.b((int) (byte)this.field_m[var2_int], -1);
                this.b((int) (byte)this.field_g[var2_int], param0 ^ 16612);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.M(" + param0 + ')');
        }
        return stackIn_34_0;
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
                    if ((var5 ^ -1) <= (var4.length ^ -1)) {
                      stackIn_22_0 = param1;
                      stackIn_22_1 = 6;
                      break L2;
                    } else {
                      var6 = var4[var5];
                      stackIn_22_0 = var6 ^ -1;

                      stackIn_22_1 = -256;

                      L3: {
                        if (stackIn_22_0 == stackIn_22_1) {
                          break L3;
                        } else {
                          if (!this.a(var6, (byte) 6, -1 + param2)) {
                            break L3;
                          } else {
                            stackIn_19_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                  L4: {
                    if (stackIn_22_0 == stackIn_22_1) {
                      break L4;
                    } else {
                      this.a(-101, 43, 112);
                      break L4;
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
                if ((var3_int ^ -1) <= -4) {
                  stackIn_11_0 = param1;
                  stackIn_11_1 = -125;
                  break L2;
                } else {
                  stackIn_11_0 = param0;

                  stackIn_11_1 = this.field_s[var3_int];

                  if (stackIn_11_0 != stackIn_11_1) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L3: {
                if (stackIn_11_0 < stackIn_11_1) {
                  break L3;
                } else {
                  this.b((byte) -42);
                  break L3;
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
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_a = 1;
        this.field_t = new int[63];
        this.field_p = new int[2];
        this.field_c = new int[2];
        this.field_s = new int[3];
        this.field_m = new int[5];
        this.field_g = new int[5];
        try {
          L0: {
            this.field_a = 1;
            this.field_c[0] = pd.a(-27486);
            this.field_c[1] = pd.a(-27486);
            this.field_p[0] = pd.a(-27486);
            this.field_p[1] = pd.a(-27486);
            this.field_i = 0;
            var1_int = 0;
            L1: while (true) {
              if ((var1_int ^ -1) <= (this.field_m.length ^ -1)) {
                var1_int = 0;
                L2: while (true) {
                  if ((this.field_g.length ^ -1) >= (var1_int ^ -1)) {
                    var1_int = 0;
                    L3: while (true) {
                      if (var1_int >= this.field_s.length) {
                        this.field_n = ej.a((byte) -66);
                        this.field_m[1] = 3;
                        this.field_m[2] = 8;
                        this.field_f = 0L;
                        this.field_m[0] = 0;
                        this.field_k = 0;
                        this.field_s[0] = 58;
                        this.field_s[2] = 53;
                        this.field_s[1] = 59;
                        break L0;
                      } else {
                        this.field_s[var1_int] = 255;
                        var1_int++;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_g[var1_int] = 255;
                    var1_int++;
                    continue L2;
                  }
                }
              } else {
                this.field_m[var1_int] = 255;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rp.<init>()");
        }
    }

    static {
        field_b = "Meltdown";
        field_j = 5;
        field_d = 33;
        field_e = "You have 1 unread message!";
    }
}
