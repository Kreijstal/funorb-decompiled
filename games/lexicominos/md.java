/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends w {
    private int field_x;
    static db[] field_A;
    private int field_E;
    private int field_y;
    int field_K;
    private db field_z;
    private db[] field_F;
    static String field_L;
    private int field_C;
    static String field_B;
    private db field_D;
    private int field_M;
    private int field_I;
    boolean field_G;
    private db field_H;

    private final db a(int param0, int param1, byte param2) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        db var14;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        var13 = Lexicominos.field_L ? 1 : 0;
        var14 = new db(this.field_I * 2, this.field_v);
        de.a(var14, 6);
        var5 = this.field_v >> 344066273;
        if (param2 > -38) {
          return (db) null;
        } else {
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (this.field_v <= var6) {
                  break L2;
                } else {
                  var7 = (var6 >> 561276993) * (2 * this.field_I - 1) % (2 * this.field_I);
                  var8 = 16711935 & param1;
                  var9 = param1 & 65280;
                  var10 = -var5 + var6;
                  var11 = 128 - -(int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
                  stackIn_12_0 = var11;

                  if (var13 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_12_0 >= 256) {
                        stackIn_7_0 = var8 | var9;
                        break L3;
                      } else {
                        stackIn_7_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> -1584727736;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_7_0;
                      lf.a(var7, var6, this.field_I, var12);
                      lf.a(var7 - this.field_I * 2, var6, this.field_I, var12);
                      var9 = param0 & 65280;
                      var8 = param0 & 16711935;
                      if ((var11 ^ -1) > -257) {
                        stackIn_10_0 = (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> -1867272600;
                        break L4;
                      } else {
                        stackIn_10_0 = var9 | var8;
                        break L4;
                      }
                    }
                    var12 = stackIn_10_0;
                    lf.a(this.field_I + var7, var6, this.field_I, var12);
                    lf.a(-this.field_I + var7, var6, this.field_I, var12);
                    var6++;
                    if (var13 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_12_0 = -22949;
              break L1;
            }
            pd.a(stackIn_12_0);
            return var14;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        this.field_E = param0;
        this.field_C = (16711422 & param0) >> -2039515423;
        this.field_M = (16711422 & param1) >> -959690047;
        if (param2 <= 68) {
          this.field_H = (db) null;
          this.field_x = param1;
          this.f(-90);
          return;
        } else {
          this.field_x = param1;
          this.f(-90);
          return;
        }
    }

    md(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -363799263 & 8355711, param6 >> 796309793 & 8355711);
    }

    private final db d(boolean param0) {
        int var2 = 0;
        db var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        w var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Lexicominos.field_L ? 1 : 0;
                    var2 = this.field_v >> 1875780257;
                    var3 = new db(var2, this.field_v);
                    de.a(var3, 6);
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackIn_2_0 = var4;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (stackIn_2_0 >= this.field_v) {
                        statePc = 14;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_15_0 = 0;
                    stackIn_4_0 = stackIn_15_0;
                    if (var9 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5 = stackIn_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var2 <= var5) {
                        statePc = 13;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = (double)var5 * (double)var5 / (double)((this.field_v + -var4) * var4);
                    var8 = 1;
                    stackIn_2_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                    stackIn_7_0 = stackIn_2_0;
                    if (var9 != 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 >= 0) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var6 = Math.sqrt(1.0 - var6);
                    if (1.0 > var6) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = 255;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (int)(var6 * 255.0);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var8 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    lf.a(var5, var4, var8 << 1252259600 | (var8 << -1444140344 | var8));
                    var5++;
                    if (var9 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    pd.a(-22949);
                    stackIn_15_0 = param0 ? 1 : 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (stackIn_15_0 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return var3;
                }
                case 17: {
                    var10 = (w) null;
                    this.a((byte) 4, (w) null, -98, 94);
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(int param0) {
        String var2;
        if (param0 != 344066273) {
          var2 = (String) null;
          md.a((String) null, 98);
          field_L = null;
          field_B = null;
          field_A = null;
          return;
        } else {
          field_L = null;
          field_B = null;
          field_A = null;
          return;
        }
    }

    final void a(byte param0, w param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_G) {
                break L1;
              } else {
                this.field_y = this.field_y + 1;
                if (this.field_y > 2 * this.field_I) {
                  this.field_y = this.field_y - 2 * this.field_I;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == -119) {
              break L0;
            } else {
              this.b(94, -94, -98);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("md.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
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
              if (param1 <= -86) {
                break L1;
              } else {
                md.e(-86);
                break L1;
              }
            }
            var3 = (CharSequence) ((Object) param0);
            stackIn_3_0 = cb.field_t.equals(ck.a(var3, (byte) -48));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("md.G(");

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

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        if (-1 != (param3 ^ -1)) {
          return;
        } else {
          var5 = this.field_t + param2;
          var6 = param1 + this.field_o;
          this.a(this.field_F[0], var6, 16711935, var5);
          if (this.field_K >= 65536) {
            if (param0 != -115) {
              this.b(-108, -108, -95);
              return;
            } else {
              return;
            }
          } else {
            ca.a(var5 + this.field_j, var6, var5 - -(this.field_K * this.field_j >> 2069378928), var6 + this.field_v, false);
            this.a(this.field_F[1], var6, param0 + 16712050, var5);
            pd.a(param0 ^ 22998);
            if (param0 == -115) {
              return;
            } else {
              this.b(-108, -108, -95);
              return;
            }
          }
        }
    }

    private final void f(int param0) {
        db discarded$1 = null;
        this.field_F = new db[]{this.a(this.field_E, this.field_x, (byte) -50), this.a(this.field_C, this.field_M, (byte) -98)};
        if (param0 >= -59) {
          discarded$1 = this.d(false);
          this.field_H = this.d(false);
          this.field_z = this.field_H.g();
          this.field_D = new db(this.field_v >> 953499905, this.field_v);
          return;
        } else {
          this.field_H = this.d(false);
          this.field_z = this.field_H.g();
          this.field_D = new db(this.field_v >> 953499905, this.field_v);
          return;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f(-72);
    }

    private final void a(db param0, int param1, int param2, int param3) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param3 + this.field_j;
                        ca.a(-this.field_H.field_p + var5_int, param1, this.field_H.field_p + param3, this.field_v + param1, false);
                        var6 = -this.field_y + param3;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_int <= var6) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0.d(var6, param1);
                        var6 = var6 + param0.field_p;
                        if (var8 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        pd.a(-22949);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (lf.field_g <= param3 + this.field_H.field_p) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        de.a(this.field_D, param2 + -16711929);
                        param0.d(-this.field_y, 0);
                        param0.d(-this.field_y + 2 * this.field_I, 0);
                        this.field_z.e(0, 0);
                        pd.a(-22949);
                        this.field_D.d(param3, param1);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (lf.field_e >= var5_int - this.field_H.field_p) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        de.a(this.field_D, 6);
                        var7 = this.field_j + -this.field_H.field_p + this.field_y;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (2 * this.field_I >= var7) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = var7 - 2 * this.field_I;
                        if (var8 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param0.d(-var7, 0);
                        param0.d(2 * this.field_I - var7, 0);
                        this.field_H.e(0, 0);
                        pd.a(-22949);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_D.d(var5_int + -this.field_H.field_p, param1);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param2 == 16711935) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_K = -126;
                        return;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var5);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("md.F(");
                    stackIn_23_1 = stackIn_24_1;
                    if (param0 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private md(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_x = param5;
        this.field_E = param6;
        this.field_C = param8;
        this.field_I = param4;
        this.field_M = param7;
        this.a(param3, param2, true, param1, param0);
    }

    static {
        field_B = "Reload game";
        field_L = "LONGER";
    }
}
