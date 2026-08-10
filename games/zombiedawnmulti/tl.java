/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends qa {
    static ld field_t;
    static int field_v;
    private int[][] field_s;
    int[] field_r;
    private String[] field_u;
    private int[] field_q;

    final static boolean d(byte param0) {
        if (param0 != -20) {
            field_v = 88;
        }
        return pd.a(jj.field_M, ql.field_a, param0 + 22);
    }

    final void a(k param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.g(31365);
              if (-1 != (var3_int ^ -1)) {
                this.a(88, param0, var3_int);
                continue L1;
              } else {
                L2: {
                  if (param1 == 118) {
                    break L2;
                  } else {
                    field_v = -62;
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

            stackIn_9_1 = new StringBuilder().append("tl.I(");

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
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(this.field_r == null)) {
            for (var2 = 0; var2 < this.field_r.length; var2++) {
                this.field_r[var2] = cr.b(this.field_r[var2], 32768);
            }
        }
        if (param0 <= 98) {
            this.field_u = (String[]) null;
        }
    }

    final String e(int param0) {
        int var3 = 0;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_u == null) {
            return "";
        }
        StringBuilder discarded$15 = var5.append(this.field_u[0]);
        if (param0 != -18572) {
            return (String) null;
        }
        for (var3 = 1; var3 < this.field_u.length; var3++) {
            discarded$16 = var2.append("...");
            discarded$17 = var5.append(this.field_u[var3]);
        }
        return var2.toString();
    }

    private final void a(int param0, k param1, int param2) {
        int[] array$0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ao var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 3 / ((param0 - -33) / 46);
              if (-2 != (param2 ^ -1)) {
                L2: {
                  if (2 == param2) {
                    var5 = param1.g(31365);
                    this.field_r = new int[var5];
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= var5) {
                        break L2;
                      } else {
                        this.field_r[var6] = param1.d((byte) 69);
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    if (-4 != (param2 ^ -1)) {
                      if ((param2 ^ -1) != -5) {
                        break L2;
                      } else {
                        break L1;
                      }
                    } else {
                      var5 = param1.g(31365);
                      this.field_s = new int[var5][];
                      this.field_q = new int[var5];
                      var6 = 0;
                      L4: while (true) {
                        if (var6 >= var5) {
                          break L2;
                        } else {
                          L5: {
                            var7 = param1.d((byte) 69);
                            var8 = r.a(var7, (byte) 35);
                            if (var8 != null) {
                              this.field_q[var6] = var7;
                              array$0 = new int[var8.field_f];
                              this.field_s[var6] = array$0;
                              var9 = 0;
                              L6: while (true) {
                                if (var8.field_f <= var9) {
                                  break L5;
                                } else {
                                  this.field_s[var6][var9] = param1.d((byte) 69);
                                  var9++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                break L1;
              } else {
                this.field_u = mk.a('<', false, param1.f((byte) -62));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("tl.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1, ga param2, int param3, int param4, int param5) {
        if (!(!op.field_m.field_c)) {
            return;
        }
        if (df.field_I) {
            cf.field_s.a(param4, param0, 0, param3, 3, param5);
            return;
        }
        try {
            param2.b((byte) -35, 65);
            param2.a(param1 ^ -102, param0);
            param2.a(param5, (byte) -45);
            if (param1 != -11) {
                ga var7 = (ga) null;
                tl.a(-103, (byte) 41, (ga) null, -22, 121, -61);
            }
            param2.a(param3, (byte) -110);
            param2.a(param4, (byte) -64);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "tl.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void f(int param0) {
        field_t = null;
        if (param0 != 32768) {
            field_t = (ld) null;
        }
    }

    tl() {
    }

    static {
        field_v = 65;
    }
}
