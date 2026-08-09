/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    short[] field_I;
    short[] field_j;
    int field_v;
    short[] field_h;
    short[] field_P;
    short[] field_e;
    byte field_N;
    short[] field_d;
    int[] field_C;
    private boolean field_f;
    int[] field_y;
    short field_H;
    int[] field_o;
    short[] field_c;
    int[] field_u;
    int field_m;
    int[] field_r;
    short[] field_a;
    short field_w;
    short[] field_B;
    short field_A;
    short[] field_b;
    byte[] field_J;
    short[] field_q;
    short[] field_s;
    static ab field_n;
    short[] field_g;
    short[] field_k;
    int field_G;
    int[] field_p;
    int field_F;
    int[] field_t;
    short[] field_z;
    short[] field_E;
    int[] field_l;
    int field_M;
    static String field_D;
    int[] field_i;
    short[] field_x;
    short[] field_K;
    int field_O;

    public static void a(int param0) {
        if (param0 != 15569) {
          pk.a(-101, 70, -94, -69, -87);
          field_D = null;
          field_n = null;
          return;
        } else {
          field_D = null;
          field_n = null;
          return;
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ab var13;
        int var14;
        int var15;
        var12 = Lexicominos.field_L ? 1 : 0;
        if (!this.field_f) {
          this.field_f = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var8 >= this.field_w) {
                  break L2;
                } else {
                  var9 = this.field_h[var8];
                  var10 = this.field_I[var8];
                  var15 = var6;
                  var14 = var10;
                  if (var12 != 0) {
                    if (var14 != var15) {
                      break L1;
                    } else {
                      this.field_M = var3;
                      this.field_O = var4;
                      return;
                    }
                  } else {
                    L3: {
                      if (var14 <= var15) {
                        break L3;
                      } else {
                        var6 = var10;
                        break L3;
                      }
                    }
                    L4: {
                      if (var9 < var2) {
                        var2 = var9;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 < var9) {
                        var5 = var9;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (var10 >= var3) {
                        break L6;
                      } else {
                        var3 = var10;
                        break L6;
                      }
                    }
                    L7: {
                      var11 = this.field_g[var8];
                      if (var11 > var7) {
                        var7 = var11;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 > var11) {
                        var4 = var11;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var8++;
                    if (var12 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_F = var7;
              this.field_m = var2;
              this.field_v = var5;
              this.field_G = var6;
              if (param0 != -50) {
                break L1;
              } else {
                this.field_M = var3;
                this.field_O = var4;
                return;
              }
            }
            var13 = (ab) null;
            pk.a((ab) null, 77);
            this.field_M = var3;
            this.field_O = var4;
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0) {
        this.field_f = false;
        if (param0 != 2933) {
            this.field_q = (short[]) null;
        }
    }

    final static boolean a(ab param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -74) {
                break L1;
              } else {
                pk.a(-91);
                break L1;
              }
            }
            stackIn_3_0 = param0.b(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pk.B(");

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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    var5 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var5 >= this.field_w) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_h[var5] = (short)(this.field_h[var5] + param3);
                    this.field_I[var5] = (short)(this.field_I[var5] + param1);
                    this.field_g[var5] = (short)(this.field_g[var5] + param0);
                    var5++;
                    if (var6 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!param2) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.a(-72, 18, true, -78);
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    this.b(2933);
                    return;
                }
                case 8: {
                    this.b(2933);
                    return;
                }
                case 9: {
                    if (!param2) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.a(-72, 18, true, -78);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    this.b(2933);
                    return;
                }
                case 12: {
                    this.b(2933);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param2 + param4;
                        if (param3 == 1) {
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
                        field_n = (ab) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = param1 + param0;
                        if (lf.field_g < param2) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_6_0 = lf.field_g;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = param2;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = stackIn_6_0;
                        if (lf.field_c >= param1) {
                            statePc = 8;
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
                        stackIn_9_0 = param1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = lf.field_c;
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
                        var8 = stackIn_9_0;
                        if (var5_int >= lf.field_e) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = var5_int;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = lf.field_e;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = stackIn_12_0;
                        if (lf.field_h > var6) {
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
                        stackIn_15_0 = lf.field_h;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = var6;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10 = stackIn_15_0;
                        if (param2 < lf.field_g) {
                            statePc = 22;
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
                        if (lf.field_e <= param2) {
                            statePc = 22;
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
                        var11 = var8 * lf.field_f - -param2;
                        var12 = 1 + var10 + -var8 >> 1982519169;
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
                        var12--;
                        if (var12 < 0) {
                            statePc = 22;
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
                        lf.field_b[var11] = 16777215;
                        var11 = var11 + 2 * lf.field_f;
                        if (var13 != 0) {
                            statePc = 29;
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
                        if (var13 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param1 < lf.field_c) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (lf.field_h <= var6) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var11 = var7 + lf.field_f * param1;
                        var12 = 1 - (-var9 - -var7) >> 1216263329;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var12--;
                        if (var12 < 0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        lf.field_b[var11] = 16777215;
                        var11 += 2;
                        if (var13 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var13 == 0) {
                            statePc = 25;
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
                        if (lf.field_g > var5_int) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (lf.field_e <= var5_int) {
                            statePc = 36;
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
                        var11 = var5_int + lf.field_f * (var8 + (var5_int + -param2 & 1));
                        var12 = -var8 + (var10 + 1) >> 882822273;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12--;
                        if (var12 < 0) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        lf.field_b[var11] = 16777215;
                        var11 = var11 + lf.field_f * 2;
                        if (var13 != 0) {
                            statePc = 47;
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
                        if (var13 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (param1 < lf.field_c) {
                            statePc = 47;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (lf.field_h > var6) {
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
                    try {
                        return;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11 = var7 + lf.field_f * var6 - -(1 & -param1 + var6);
                        var12 = 1 + var9 - var7 >> 1444582337;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                            statePc = 47;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        lf.field_b[var11] = 16777215;
                        var11 += 2;
                        if (var13 == 0) {
                            statePc = 43;
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
                        return;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var13 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        return;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var5), "pk.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    var6 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_w <= var6) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_h[var6] = (short)(param4 * this.field_h[var6] / param3);
                    this.field_I[var6] = (short)(this.field_I[var6] * param1 / param3);
                    this.field_g[var6] = (short)(this.field_g[var6] * param0 / param3);
                    var6++;
                    if (var7 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.b(2933);
                    if (param2 > 44) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    pk.a(-33);
                    return;
                }
                case 7: {
                    return;
                }
                case 9: {
                    this.b(2933);
                    if (param2 > 44) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    pk.a(-33);
                    return;
                }
                case 11: {
                    return;
                }
                case 13: {
                    if (param2 <= 44) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 15: {
                    pk.a(-33);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    pk() {
        this.field_N = (byte) 0;
        this.field_f = false;
    }

    static {
        field_D = "Longer words score many more points than shorter words.";
    }
}
