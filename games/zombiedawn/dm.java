/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends nb {
    static String field_q;
    static String field_s;
    int[] field_u;
    private String[] field_t;
    static int[] field_r;
    private int[] field_v;
    private int[][] field_w;
    static int[] field_p;

    final void a(de param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.field_t = (String[]) null;
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.d((byte) -120);
              if (0 != var3_int) {
                this.a(param0, var3_int, -9604);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("dm.B(");

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
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        if (this.field_u != null) {
            for (var2 = 0; this.field_u.length > var2; var2++) {
                this.field_u[var2] = hi.a(this.field_u[var2], 32768);
            }
        }
        if (param0 != -76) {
            field_s = (String) null;
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 80) {
            field_q = (String) null;
        }
        uo.a(true, param0 + -28598, param1);
    }

    final String e(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = ZombieDawn.field_J;
        StringBuilder var5 = new StringBuilder(param0);
        StringBuilder var2 = var5;
        if (!(this.field_t != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_t[0]);
        for (var3 = 1; var3 < this.field_t.length; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_t[var3]);
        }
        return var2.toString();
    }

    dm() {
    }

    public static void d(int param0) {
        field_q = null;
        field_s = null;
        field_r = null;
        if (param0 != 3) {
            dm.a((byte) -123, false);
        }
        field_p = null;
    }

    private final void a(de param0, int param1, int param2) {
        int[] array$0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        cg var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param2 == -9604) {
                break L1;
              } else {
                this.e(58);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param1 ^ -1) == -2) {
                  this.field_t = de.a('<', param0.a(true), -123);
                  break L3;
                } else {
                  if (-3 != (param1 ^ -1)) {
                    if ((param1 ^ -1) != -4) {
                      if ((param1 ^ -1) == -5) {
                        break L3;
                      } else {
                        break L2;
                      }
                    } else {
                      var4_int = param0.d((byte) -127);
                      this.field_v = new int[var4_int];
                      this.field_w = new int[var4_int][];
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var4_int) {
                          break L3;
                        } else {
                          L5: {
                            var6 = param0.f(param2 ^ -9602);
                            var7 = cj.a(var6, 0);
                            if (var7 != null) {
                              this.field_v[var5] = var6;
                              array$0 = new int[var7.field_a];
                              this.field_w[var5] = array$0;
                              var8 = 0;
                              L6: while (true) {
                                if (var7.field_a <= var8) {
                                  break L5;
                                } else {
                                  this.field_w[var5][var8] = param0.f(rd.b(param2, -9602));
                                  var8++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    var4_int = param0.d((byte) -122);
                    this.field_u = new int[var4_int];
                    var5 = 0;
                    L7: while (true) {
                      if (var5 >= var4_int) {
                        break L3;
                      } else {
                        this.field_u[var5] = param0.f(2);
                        var5++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("dm.F(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        field_s = "SHOCKWAVE";
        field_q = "Previous";
        field_p = new int[256];
        field_r = new int[256];
        for (var0 = 0; field_p.length > var0; var0++) {
            field_p[var0] = hi.a(field_p[var0], var0 << -230103472);
            field_p[var0] = hi.a(field_p[var0], var0 / 3 << -1855224600);
        }
        int var1 = 0;
        var0 = var1;
        while (field_r.length > var1) {
            field_r[var1] = hi.a(field_r[var1], var1 << 595492528);
            field_r[var1] = hi.a(field_r[var1], var1 << -235960312);
            field_r[var1] = hi.a(field_r[var1], var1);
            var1++;
        }
    }
}
