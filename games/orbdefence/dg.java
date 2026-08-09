/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends pj {
    private hj field_G;
    private int field_A;
    static String field_C;
    private int field_y;
    static int[] field_B;
    private int field_K;
    private hj[] field_E;
    private int field_H;
    int field_J;
    private hj field_F;
    boolean field_z;
    private hj field_L;
    private int field_x;
    private int field_D;

    dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -21701087 & 8355711, (16711422 & param6) >> -1972298943);
    }

    private final void a(int param0, int param1, int param2, hj param3) {
        hj discarded$0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
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
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = this.field_m + param2;
                        id.a(-this.field_L.field_o + var5_int, param2 + this.field_L.field_o, this.field_r + param1, param1, 734);
                        var6 = param2 + -this.field_A;
                        if (param0 > 100) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        discarded$0 = this.i(114);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var6 >= var5_int) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param3.c(var6, param1);
                        var6 = var6 + param3.field_o;
                        if (var8 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        oc.g((byte) -105);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (this.field_L.field_o + param2 < ul.field_i) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        de.a(-128, this.field_G);
                        param3.c(-this.field_A, 0);
                        param3.c(-this.field_A + 2 * this.field_D, 0);
                        this.field_F.e(0, 0);
                        oc.g((byte) -105);
                        this.field_G.c(param2, param1);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (ul.field_e >= -this.field_L.field_o + var5_int) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        de.a(-127, this.field_G);
                        var7 = this.field_A + this.field_m + -this.field_L.field_o;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (this.field_D * 2 >= var7) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = var7 - 2 * this.field_D;
                        if (var8 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
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
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param3.c(-var7, 0);
                        param3.c(-var7 + 2 * this.field_D, 0);
                        this.field_L.e(0, 0);
                        oc.g((byte) -105);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_G.c(var5_int + -this.field_L.field_o, param1);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var5);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("dg.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param3 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw dd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 113) {
            dg.a((byte) -26);
            field_C = null;
            field_B = null;
            return;
        }
        field_C = null;
        field_B = null;
    }

    private final hj i(int param0) {
        int var2 = 0;
        hj var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = OrbDefence.field_D ? 1 : 0;
                    var2 = this.field_r >> 368752481;
                    var3 = new hj(var2, this.field_r);
                    if (param0 < 33) {
                        statePc = 18;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    de.a(-125, var3);
                    var4 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = var4;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 >= this.field_r) {
                        statePc = 16;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_17_0 = 0;
                    stackIn_5_0 = stackIn_17_0;
                    if (var9 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var5 >= var2) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_r));
                    var8 = 1;
                    stackIn_3_0 = (1.0 < var6 ? -1 : (1.0 == var6 ? 0 : 1));
                    stackIn_8_0 = stackIn_3_0;
                    if (var9 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 > 0) {
                        statePc = 10;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var6 = Math.sqrt(-var6 + 1.0);
                    if (var6 >= 1.0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (int)(255.0 * var6);
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = 255;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var8 = stackIn_13_0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    ul.a(var5, var4, var8 << 200392840 | var8 | var8 << 1723690512);
                    var5++;
                    if (var9 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = -105;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    oc.g((byte) stackIn_17_0);
                    return var3;
                }
                case 18: {
                    return (hj) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final hj a(int param0, byte param1, int param2) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        hj var15;
        hj var16;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        var13 = OrbDefence.field_D ? 1 : 0;
        if (param1 != -45) {
          this.field_J = 82;
          var15 = new hj(2 * this.field_D, this.field_r);
          de.a(-127, var15);
          var5 = this.field_r >> 110509729;
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var6 >= this.field_r) {
                  break L2;
                } else {
                  var7 = (var6 >> 1059469665) * (2 * this.field_D + -1) % (this.field_D * 2);
                  var8 = 16711935 & param0;
                  var9 = param0 & 65280;
                  var10 = var6 - var5;
                  var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
                  stackIn_24_0 = var11;

                  if (var13 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_24_0 < 256) {
                        stackIn_19_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 1637544392;
                        break L3;
                      } else {
                        stackIn_19_0 = var9 | var8;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_19_0;
                      ul.d(var7, var6, this.field_D, var12);
                      ul.d(-(this.field_D * 2) + var7, var6, this.field_D, var12);
                      var8 = 16711935 & param2;
                      var9 = 65280 & param2;
                      if (256 <= var11) {
                        stackIn_22_0 = var9 | var8;
                        break L4;
                      } else {
                        stackIn_22_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> -1927424632;
                        break L4;
                      }
                    }
                    var12 = stackIn_22_0;
                    ul.d(this.field_D + var7, var6, this.field_D, var12);
                    ul.d(var7 + -this.field_D, var6, this.field_D, var12);
                    var6++;
                    if (var13 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_24_0 = -105;
              break L1;
            }
            oc.g((byte) stackIn_24_0);
            return var15;
          }
        } else {
          var16 = new hj(2 * this.field_D, this.field_r);
          de.a(-127, var16);
          var5 = this.field_r >> 110509729;
          var6 = 0;
          L5: while (true) {
            L6: {
              L7: {
                if (var6 >= this.field_r) {
                  break L7;
                } else {
                  var7 = (var6 >> 1059469665) * (2 * this.field_D + -1) % (this.field_D * 2);
                  var8 = 16711935 & param0;
                  var9 = param0 & 65280;
                  var10 = var6 - var5;
                  var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
                  stackIn_12_0 = var11;

                  if (var13 != 0) {
                    break L6;
                  } else {
                    L8: {
                      if (stackIn_12_0 < 256) {
                        stackIn_7_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 1637544392;
                        break L8;
                      } else {
                        stackIn_7_0 = var9 | var8;
                        break L8;
                      }
                    }
                    L9: {
                      var12 = stackIn_7_0;
                      ul.d(var7, var6, this.field_D, var12);
                      ul.d(-(this.field_D * 2) + var7, var6, this.field_D, var12);
                      var8 = 16711935 & param2;
                      var9 = 65280 & param2;
                      if (256 <= var11) {
                        stackIn_10_0 = var9 | var8;
                        break L9;
                      } else {
                        stackIn_10_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> -1927424632;
                        break L9;
                      }
                    }
                    var12 = stackIn_10_0;
                    ul.d(this.field_D + var7, var6, this.field_D, var12);
                    ul.d(var7 + -this.field_D, var6, this.field_D, var12);
                    var6++;
                    if (var13 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              stackIn_12_0 = -105;
              break L6;
            }
            oc.g((byte) stackIn_12_0);
            return var16;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.c(false);
    }

    final void a(int param0, int param1, int param2) {
        this.field_y = param1;
        this.field_H = param2 >> 1279763073 & 8355711;
        this.field_x = param2;
        this.field_K = (param1 & param0) >> -1024194527;
        this.c(false);
    }

    private final void c(boolean param0) {
        this.field_E = new hj[]{this.a(this.field_y, (byte) -45, this.field_x), this.a(this.field_K, (byte) -45, this.field_H)};
        this.field_L = this.i(90);
        if (param0) {
          this.field_y = -26;
          this.field_F = this.field_L.b();
          this.field_G = new hj(this.field_r >> -103743775, this.field_r);
          return;
        } else {
          this.field_F = this.field_L.b();
          this.field_G = new hj(this.field_r >> -103743775, this.field_r);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        if (0 == param1) {
          var5 = this.field_s + param3;
          var6 = param0 - -this.field_n;
          this.a(121, var6, var5, this.field_E[0]);
          if (param2 != 1048575) {
            return;
          } else {
            L0: {
              if (this.field_J < 65536) {
                id.a(var5 + this.field_m, (this.field_m * this.field_J >> -1169100496) + var5, var6 - -this.field_r, var6, 734);
                this.a(111, var6, var5, this.field_E[1]);
                oc.g((byte) -105);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_z) {
                break L1;
              } else {
                this.field_A = this.field_A + 1;
                if (this.field_A <= this.field_D * 2) {
                  break L1;
                } else {
                  this.field_A = this.field_A - 2 * this.field_D;
                  break L1;
                }
              }
            }
            if (param0 == -77) {
              break L0;
            } else {
              this.field_z = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("dg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_H = param8;
        this.field_K = param7;
        this.field_x = param6;
        this.field_y = param5;
        this.field_D = param4;
        this.a(param0, param1, param3, (byte) -90, param2);
    }

    static {
        field_C = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_B = new int[8192];
    }
}
