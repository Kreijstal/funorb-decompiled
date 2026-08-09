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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_15_0 = 0;
                  break L3;
                } else {
                  stackIn_15_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ff.A(").append(param0).append(',');

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
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    private final void a(rb param0, int param1, byte param2) {
        int[] array$0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        o var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var4_int = -121 % ((1 - param2) / 57);
              if (param1 != 1) {
                if (param1 != 2) {
                  if ((param1 ^ -1) == -4) {
                    var5 = param0.j(7909);
                    this.field_n = new int[var5][];
                    this.field_r = new int[var5];
                    var6 = 0;
                    L2: while (true) {
                      if (var6 >= var5) {
                        break L1;
                      } else {
                        L3: {
                          var7 = param0.i(-1174051992);
                          var8 = qf.a(var7, 0);
                          if (var8 == null) {
                            break L3;
                          } else {
                            this.field_r[var6] = var7;
                            array$0 = new int[var8.field_a];
                            this.field_n[var6] = array$0;
                            var9 = 0;
                            L4: while (true) {
                              if (var8.field_a <= var9) {
                                break L3;
                              } else {
                                this.field_n[var6][var9] = param0.i(-1174051992);
                                var9++;
                                continue L4;
                              }
                            }
                          }
                        }
                        var6++;
                        continue L2;
                      }
                    }
                  } else {
                    if (-5 != (param1 ^ -1)) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  var5 = param0.j(7909);
                  this.field_s = new int[var5];
                  var6 = 0;
                  L5: while (true) {
                    if (var6 >= var5) {
                      break L1;
                    } else {
                      this.field_s[var6] = param0.i(-1174051992);
                      var6++;
                      continue L5;
                    }
                  }
                }
              } else {
                this.field_t = uj.a(-46, '<', param0.a(-50));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("ff.F(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(rb param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.j(7909);
              if (-1 != (var3_int ^ -1)) {
                this.a(param0, var3_int, (byte) 99);
                continue L1;
              } else {
                L2: {
                  if (param1 >= 24) {
                    break L2;
                  } else {
                    this.field_s = (int[]) null;
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
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ff.G(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = StarCannon.field_A;
        if (!(null == this.field_s)) {
            for (var2 = 0; var2 < this.field_s.length; var2++) {
                this.field_s[var2] = cl.a(this.field_s[var2], 32768);
            }
        }
        if (param0 > -33) {
            this.e(-31);
        }
    }

    final String e(int param0) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = StarCannon.field_A;
        StringBuilder var7 = new StringBuilder(80);
        var7 = var7;
        if (!(this.field_t != null)) {
            return "";
        }
        StringBuilder discarded$0 = var7.append(this.field_t[0]);
        int var3 = 1;
        if (param0 > -5) {
            ld var5 = (ld) null;
            ff.a(-127, (ld) null, (ld) null);
        }
        while (this.field_t.length > var3) {
            discarded$1 = var7.append("...");
            discarded$2 = var7.append(this.field_t[var3]);
            var3++;
        }
        return var7.toString();
    }

    public static void f(int param0) {
        field_q = null;
        field_p = null;
        if (param0 > -32) {
            ff.g(-95);
        }
    }

    ff() {
    }

    static {
        field_q = "Email (Login):";
        field_p = "The War is going badly for Earth.  The Battle of Proxima has seen the defeat of the Terran Space Navy, and the flagship TNS-HOOD has been destroyed.  A barbaric race of insectoids, the Paragula, is now in position to invade our solar system.<br><br>However, the valiant efforts of our unfortunate pilots have bought enough time for us to bring our experimental fighter, the 'Nova Ray', to battle readiness.  You must command this awesome vessel against almost impossible odds in the defence of Earth.<br><br>Good luck, and good hunting!";
    }
}
