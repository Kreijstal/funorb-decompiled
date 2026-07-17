/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends uh {
    private String[] field_t;
    static int field_o;
    static String field_p;
    int[] field_s;
    static String field_q;
    private int[][] field_n;
    private int[] field_r;

    final static String g(int param0) {
        int var1 = 31 % ((param0 - 57) / 43);
        if (!(jl.field_a != uh.field_k)) {
            return jl.field_c;
        }
        if (!(jl.field_a != ie.field_x)) {
            return te.field_a;
        }
        if (!qa.field_a.b(false)) {
            return te.field_a;
        }
        return lc.field_hb;
    }

    final static boolean a(int param0, ld param1, ld param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var3_int = -param2.field_hb + param1.field_hb;
              if (param1.field_gb != wg.field_a) {
                if (param1.field_gb != null) {
                  break L1;
                } else {
                  var3_int += 200;
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            if (param0 == 80) {
              L2: {
                if (wg.field_a == param2.field_gb) {
                  var3_int += 200;
                  break L2;
                } else {
                  if (null != param2.field_gb) {
                    break L2;
                  } else {
                    var3_int -= 200;
                    break L2;
                  }
                }
              }
              L3: {
                if (var3_int <= 0) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ff.A(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_15_0 != 0;
    }

    private final void a(rb param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        o var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (param1 != 1) {
                L2: {
                  if (param1 != 2) {
                    if (param1 == 3) {
                      var5 = param0.j(7909);
                      ((ff) this).field_n = new int[var5][];
                      ((ff) this).field_r = new int[var5];
                      var6 = 0;
                      L3: while (true) {
                        if (var6 >= var5) {
                          break L2;
                        } else {
                          L4: {
                            var7 = param0.i(-1174051992);
                            var8 = qf.a(var7, 0);
                            if (var8 == null) {
                              break L4;
                            } else {
                              ((ff) this).field_r[var6] = var7;
                              ((ff) this).field_n[var6] = new int[var8.field_a];
                              var9 = 0;
                              L5: while (true) {
                                if (var8.field_a <= var9) {
                                  break L4;
                                } else {
                                  ((ff) this).field_n[var6][var9] = param0.i(-1174051992);
                                  var9++;
                                  continue L5;
                                }
                              }
                            }
                          }
                          var6++;
                          continue L3;
                        }
                      }
                    } else {
                      if (param1 != 4) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    var5 = param0.j(7909);
                    ((ff) this).field_s = new int[var5];
                    var6 = 0;
                    L6: while (true) {
                      if (~var6 <= ~var5) {
                        break L2;
                      } else {
                        ((ff) this).field_s[var6] = param0.i(-1174051992);
                        var6++;
                        continue L6;
                      }
                    }
                  }
                }
                break L1;
              } else {
                ((ff) this).field_t = uj.a(-46, '<', param0.a(-50));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("ff.F(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + 99 + 41);
        }
    }

    final void a(rb param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.j(7909);
              if (var3_int != 0) {
                this.a(param0, var3_int, (byte) 99);
                continue L1;
              } else {
                L2: {
                  if (param1 >= 24) {
                    break L2;
                  } else {
                    ((ff) this).field_s = null;
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ff.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = StarCannon.field_A;
        if (!(null == ((ff) this).field_s)) {
            for (var2 = 0; var2 < ((ff) this).field_s.length; var2++) {
                ((ff) this).field_s[var2] = cl.a(((ff) this).field_s[var2], 32768);
            }
        }
        if (param0 > -33) {
            String discarded$0 = ((ff) this).e(-31);
        }
    }

    final String e(int param0) {
        int var4 = StarCannon.field_A;
        StringBuilder var7 = new StringBuilder(80);
        var7 = var7;
        if (!(((ff) this).field_t != null)) {
            return "";
        }
        StringBuilder discarded$0 = var7.append(((ff) this).field_t[0]);
        int var3 = 1;
        if (param0 > -5) {
            Object var5 = null;
            boolean discarded$1 = ff.a(-127, (ld) null, (ld) null);
        }
        while (((ff) this).field_t.length > var3) {
            StringBuilder discarded$2 = var7.append("...");
            StringBuilder discarded$3 = var7.append(((ff) this).field_t[var3]);
            var3++;
        }
        return var7.toString();
    }

    public static void f(int param0) {
        field_q = null;
        field_p = null;
    }

    ff() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Email (Login):";
        field_p = "The War is going badly for Earth.  The Battle of Proxima has seen the defeat of the Terran Space Navy, and the flagship TNS-HOOD has been destroyed.  A barbaric race of insectoids, the Paragula, is now in position to invade our solar system.<br><br>However, the valiant efforts of our unfortunate pilots have bought enough time for us to bring our experimental fighter, the 'Nova Ray', to battle readiness.  You must command this awesome vessel against almost impossible odds in the defence of Earth.<br><br>Good luck, and good hunting!";
    }
}
