/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends vg {
    static String field_i;
    static String field_h;
    int field_f;
    private int field_g;
    static TombRacer field_j;
    private int field_k;

    final boolean a(byte param0) {
        if (param0 < -62) {
          if (this.field_k <= jba.field_j) {
            if (this.field_k - -64 >= jba.field_j) {
              if (sta.field_B >= this.field_g) {
                if (sta.field_B > 64 + this.field_g) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.field_k = -99;
          if (this.field_k <= jba.field_j) {
            if (this.field_k - -64 >= jba.field_j) {
              if (sta.field_B >= this.field_g) {
                if (sta.field_B > 64 + this.field_g) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        int var1 = -85 / ((42 - param0) / 45);
        field_i = null;
        field_h = null;
        field_j = null;
    }

    ad(int param0, int param1, int param2) {
        this(param1, param2);
        this.field_f = param0;
    }

    final boolean a(int param0) {
        if (param0 != -64) {
            return true;
        }
        return (this.field_f ^ -1) == 0 ? true : false;
    }

    final static up a(byte param0, kh param1) {
        up discarded$2 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        up var4 = null;
        kh var5 = null;
        up stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        up stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.b((byte) 44, 4);
              if (param0 == 87) {
                break L1;
              } else {
                var5 = (kh) null;
                discarded$2 = ad.a((byte) -125, (kh) null);
                break L1;
              }
            }
            var3 = param1.b((byte) 44, 10);
            var4 = new up(var2_int, var3);
            stackOut_2_0 = (up) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ad.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_2_0 = 0;
        int[] stackOut_4_0 = null;
        int[] stackOut_5_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        if (param0 == -13545) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    stackOut_4_0 = bca.field_a;
                    stackIn_6_0 = stackOut_4_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = bca.field_a;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0.length <= var2_int) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = param1 ^ -1;
                        stackIn_14_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var3 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == (bca.field_a[var2_int] ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    try {
                        var2_int++;
                        if (var3 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var2), "ad.B(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, boolean param1) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        nh[] var7 = null;
        ha var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String stackIn_6_0 = null;
        String stackIn_13_0 = null;
        String stackIn_19_0 = null;
        String stackOut_18_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_11_0 = null;
        String stackOut_5_0 = null;
        String stackOut_4_0 = null;
        var5 = -38 / ((32 - param0) / 33);
        var8 = tga.field_a;
        var4_int = this.field_k;
        var6 = this.field_g;
        var7 = dr.field_a;
        tra.a(1, var7, (byte) -96, var4_int, var8, 64, 1, 64, var6, 0);
        tga.field_a.KA(this.field_k, this.field_g, this.field_k + 64, -3 + this.field_g - -64);
        if (!this.a(-64)) {
          fa.field_a[this.field_f].a(this.field_k, this.field_g);
          if (TombRacer.field_G) {
            L0: {
              nc.field_e.a(this.field_k, this.field_g);
              tga.field_a.la();
              var3 = 2431750;
              if (!param1) {
                break L0;
              } else {
                var3 = 10309393;
                break L0;
              }
            }
            L1: {
              if (this.a(-64)) {
                stackOut_18_0 = "";
                stackIn_19_0 = stackOut_18_0;
                break L1;
              } else {
                stackOut_17_0 = la.field_m[this.field_f];
                stackIn_19_0 = stackOut_17_0;
                break L1;
              }
            }
            var10 = stackIn_19_0;
            var4 = var10;
            discarded$3 = be.a(var10.toUpperCase(), 1, qf.field_j, var3, 0, 64, 1, 40 + this.field_g, -10 + this.field_k, -1, (byte) 60, 84);
            return;
          } else {
            L2: {
              tga.field_a.la();
              var3 = 2431750;
              if (!param1) {
                break L2;
              } else {
                var3 = 10309393;
                break L2;
              }
            }
            L3: {
              if (this.a(-64)) {
                stackOut_12_0 = "";
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_11_0 = la.field_m[this.field_f];
                stackIn_13_0 = stackOut_11_0;
                break L3;
              }
            }
            var11 = stackIn_13_0;
            var4 = var11;
            discarded$4 = be.a(var11.toUpperCase(), 1, qf.field_j, var3, 0, 64, 1, 40 + this.field_g, -10 + this.field_k, -1, (byte) 60, 84);
            return;
          }
        } else {
          L4: {
            nc.field_e.a(this.field_k, this.field_g);
            tga.field_a.la();
            var3 = 2431750;
            if (!param1) {
              break L4;
            } else {
              var3 = 10309393;
              break L4;
            }
          }
          L5: {
            if (this.a(-64)) {
              stackOut_5_0 = "";
              stackIn_6_0 = stackOut_5_0;
              break L5;
            } else {
              stackOut_4_0 = la.field_m[this.field_f];
              stackIn_6_0 = stackOut_4_0;
              break L5;
            }
          }
          var9 = stackIn_6_0;
          var4 = var9;
          discarded$5 = be.a(var9.toUpperCase(), 1, qf.field_j, var3, 0, 64, 1, 40 + this.field_g, -10 + this.field_k, -1, (byte) 60, 84);
          return;
        }
    }

    ad(int param0, int param1) {
        this.field_f = -1;
        this.field_k = -2 + param0 - -uca.field_c.a(4, 0);
        this.field_g = -5 + (uca.field_c.a(10, 0) + param1);
    }

    static {
        field_i = "Completed";
        field_h = "<%0> wants to draw.";
    }
}
