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
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        up var4 = null;
        kh var5 = null;
        up stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.b((byte) 44, 4);
              if (param0 == 87) {
                break L1;
              } else {
                var5 = (kh) null;
                ad.a((byte) -125, (kh) null);
                break L1;
              }
            }
            var3 = param1.b((byte) 44, 10);
            var4 = new up(var2_int, var3);
            stackIn_3_0 = (up) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ad.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
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
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    stackIn_6_0 = bca.field_a;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackIn_6_0 = bca.field_a;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0.length <= var2_int) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1 == bca.field_a[var2_int]) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0 != 0;
                }
                case 11: {
                    try {
                        var2_int++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var2), "ad.B(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, boolean param1) {
        int var3;
        int var4_int;
        String var4;
        int var5;
        int var6;
        nh[] var7;
        ha var8;
        String var9;
        String var10;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        var5 = -38 / ((32 - param0) / 33);
        var8 = tga.field_a;
        var4_int = this.field_k;
        var6 = this.field_g;
        var7 = dr.field_a;
        tra.a(1, var7, (byte) -96, var4_int, var8, 64, 1, 64, var6, 0);
        tga.field_a.KA(this.field_k, this.field_g, this.field_k + 64, -3 + this.field_g - -64);
        if (!this.a(-64)) {
          L0: {
            fa.field_a[this.field_f].a(this.field_k, this.field_g);
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
              stackIn_12_0 = "";
              break L1;
            } else {
              stackIn_12_0 = la.field_m[this.field_f];
              break L1;
            }
          }
          var9 = stackIn_12_0;
          var4 = var9;
          be.a(var9.toUpperCase(), 1, qf.field_j, var3, 0, 64, 1, 40 + this.field_g, -10 + this.field_k, -1, (byte) 60, 84);
          return;
        } else {
          L2: {
            nc.field_e.a(this.field_k, this.field_g);
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
              stackIn_6_0 = "";
              break L3;
            } else {
              stackIn_6_0 = la.field_m[this.field_f];
              break L3;
            }
          }
          var10 = stackIn_6_0;
          var4 = var10;
          be.a(var10.toUpperCase(), 1, qf.field_j, var3, 0, 64, 1, 40 + this.field_g, -10 + this.field_k, -1, (byte) 60, 84);
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
