/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj implements bo {
    static String field_e;
    private int[] field_a;
    private int field_c;
    static String field_f;
    private boolean[] field_g;
    private int[] field_b;
    static int[] field_d;

    public final void a(kh param0, byte param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            if (param1 != -19) {
                kh var5 = (kh) null;
                this.a(-28, (kh) null);
            }
            param0.h((byte) -89);
            for (var3_int = 0; var3_int < this.field_c; var3_int++) {
                this.field_g[var3_int] = param0.b((byte) 44, 1) == 1 ? true : false;
                if (!this.field_g[var3_int]) {
                    this.field_b[var3_int] = param0.b((byte) 44, 3);
                    this.field_a[var3_int] = param0.b((byte) 44, 32);
                } else {
                    this.field_b[var3_int] = -1;
                    this.field_a[var3_int] = 0;
                }
            }
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(qh param0, v param1, byte param2) {
        int stackIn_11_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (this.field_c <= var4_int) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= this.field_c) {
                    L3: {
                      var4_int = 125 % ((57 - param2) / 55);
                      if (-1 != (param0.field_k.field_K ^ -1)) {
                        break L3;
                      } else {
                        param0.k(-1);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    L4: {
                      if (this.field_g[var4_int]) {
                        break L4;
                      } else {
                        param0.field_k.field_c.field_b[var4_int] = this.field_b[var4_int];
                        param0.field_k.field_c.field_e[this.field_b[var4_int]] = var4_int;
                        if (this.field_a[var4_int] == 0) {
                          param0.field_k.field_G[var4_int].a(94, false);
                          break L4;
                        } else {
                          L5: {
                            if (param0.field_k.field_G[var4_int].b(0)) {
                              stackIn_11_0 = 0;
                              break L5;
                            } else {
                              stackIn_11_0 = 1;
                              break L5;
                            }
                          }
                          var5 = stackIn_11_0;
                          param0.field_k.field_G[var4_int].a(84, true);
                          param0.field_k.field_G[var4_int].field_c = this.field_a[var4_int];
                          if (var5 != 0) {
                            param0.a(98, var4_int);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                param0.field_k.field_c.field_b[var4_int] = -1;
                param0.field_k.field_c.field_e[var4_int] = -1;
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("uj.D(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        int var1 = -113 / ((param0 - 0) / 40);
        field_d = null;
    }

    public final void a(int param0, kh param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param1.i(param0 ^ 192);
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= this.field_c) {
                L2: {
                  param1.k(-1826190686);
                  if (param0 == 200) {
                    break L2;
                  } else {
                    this.field_a = (int[]) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (this.field_g[var3_int]) {
                    param1.a((byte) -127, 1, 1);
                    break L3;
                  } else {
                    param1.a((byte) -126, 0, 1);
                    param1.a((byte) 92, this.field_b[var3_int], 3);
                    param1.a((byte) -126, this.field_a[var3_int], 32);
                    break L3;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("uj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static hja[] a(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        hja[] var1 = new hja[fa.field_b];
        for (var2 = param0; fa.field_b > var2; var2++) {
            var1[var2] = new hja(ika.field_a, kba.field_s, ak.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], ck.field_c[var2], mga.field_g);
        }
        loa.a((byte) 106);
        return var1;
    }

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 104) {
                break L1;
              } else {
                uj.a(-27);
                break L1;
              }
            }
            stackIn_3_0 = qga.a(125, param1, 0, param1.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("uj.E(").append(param0).append(',');

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

    uj(int param0) {
        this.field_g = new boolean[param0];
        this.field_b = new int[param0];
        this.field_c = param0;
        this.field_a = new int[param0];
    }

    static {
        field_e = "Revolver";
        field_f = "You've collected a skeleton key. Walk into the lock to open it, or drop the key using <img=8><img=9>";
        field_d = new int[]{0, 28};
    }
}
