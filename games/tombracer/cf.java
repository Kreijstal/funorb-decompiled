/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf implements bo {
    private int field_d;
    static String field_f;
    private int field_j;
    private int[] field_b;
    static String field_c;
    private int field_g;
    private int[][] field_i;
    private int[] field_a;
    static String field_e;
    private int[] field_h;

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_e = null;
        if (param0 != 10) {
            field_c = (String) null;
        }
    }

    public final void a(int param0, kh param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param1.i(param0 + -192);
            param1.a((byte) 115, this.field_g, 3);
            var3_int = 0;
            L1: while (true) {
              if (this.field_g <= var3_int) {
                var3_int = 0;
                L2: while (true) {
                  if (var3_int >= this.field_g) {
                    L3: {
                      if (param0 == 200) {
                        break L3;
                      } else {
                        field_f = (String) null;
                        break L3;
                      }
                    }
                    var3_int = 0;
                    L4: while (true) {
                      if (this.field_g <= var3_int) {
                        param1.a((byte) 55, this.field_d - -1, 3);
                        param1.a((byte) -125, 1 + this.field_j, 16);
                        param1.k(param0 ^ -1826190742);
                        break L0;
                      } else {
                        param1.a((byte) 69, this.field_a[var3_int] + 1, 4);
                        param1.a((byte) -128, this.field_h[var3_int], 10);
                        var3_int++;
                        continue L4;
                      }
                    }
                  } else {
                    param1.a((byte) -127, this.field_b[var3_int], 10);
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                var4 = 0;
                L5: while (true) {
                  if (-4 >= (var4 ^ -1)) {
                    var3_int++;
                    continue L1;
                  } else {
                    param1.a((byte) -128, this.field_i[var3_int][var4], 8);
                    var4++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("cf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "S2CRoundResultPacket:";
        var1 = var1 + " winner:" + this.field_d;
        var1 = var1 + " totals:";
        for (var2 = 0; this.field_g > var2; var2++) {
            var1 = var1 + this.field_b[var2] + " ";
        }
        return var1;
    }

    public final void a(kh param0, byte param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        kh var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param0.h((byte) -71);
            this.field_g = param0.b((byte) 44, 3);
            this.field_i = new int[this.field_g][3];
            var3_int = 0;
            L1: while (true) {
              if (this.field_g <= var3_int) {
                L2: {
                  if (param1 == -19) {
                    break L2;
                  } else {
                    var6 = (kh) null;
                    this.a(41, (kh) null);
                    break L2;
                  }
                }
                this.field_b = new int[this.field_g];
                var3_int = 0;
                L3: while (true) {
                  if (this.field_g <= var3_int) {
                    this.field_a = new int[this.field_g];
                    this.field_h = new int[this.field_g];
                    var3_int = 0;
                    L4: while (true) {
                      if (var3_int >= this.field_g) {
                        this.field_d = param0.b((byte) 44, 3) - 1;
                        this.field_j = -1 + param0.b((byte) 44, 16);
                        param0.i((byte) 98);
                        break L0;
                      } else {
                        this.field_a[var3_int] = -1 + param0.b((byte) 44, 4);
                        this.field_h[var3_int] = param0.b((byte) 44, 10);
                        var3_int++;
                        continue L4;
                      }
                    }
                  } else {
                    this.field_b[var3_int] = param0.b((byte) 44, 10);
                    var3_int++;
                    continue L3;
                  }
                }
              } else {
                var4 = 0;
                L5: while (true) {
                  if (-4 >= (var4 ^ -1)) {
                    var3_int++;
                    continue L1;
                  } else {
                    this.field_i[var3_int][var4] = param0.b((byte) 44, 8);
                    var4++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("cf.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 > -100) {
            field_c = (String) null;
        }
        ff.field_w = param0;
        if (!(null == fq.field_e)) {
            fq.field_e.a(param0, -83);
        }
        if (!(null == tva.field_d)) {
            tva.field_d.a((byte) 91, param0);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -16390) {
                break L1;
              } else {
                cf.a(-31);
                break L1;
              }
            }
            L2: {
              var4_int = -param2 + param3;
              if (var4_int > 0) {
                L3: while (true) {
                  if (var4_int >= -param0 / 2) {
                    L4: while (true) {
                      if (var4_int <= param0 / 2) {
                        break L2;
                      } else {
                        var4_int = var4_int - param0;
                        continue L4;
                      }
                    }
                  } else {
                    var4_int = var4_int + param0;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            stackIn_10_0 = var4_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "cf.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    final void a(qh param0, int param1) {
        ff var8 = null;
        int var4 = 0;
        hca var5 = null;
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        try {
            var8 = param0.field_k;
            for (var4 = param1; var8.field_H.length > var4; var4++) {
                var5 = var8.field_H[var4];
                for (var6 = 0; 3 > var6; var6++) {
                    var5.a(true, var6, this.field_i[var4][var6]);
                }
                var5.a((byte) 126, this.field_b[var4]);
                var5.b(18202625, this.field_a[var4]);
                var5.f(this.field_h[var4], -25915);
            }
            param0.field_k.field_E = this.field_j;
            param0.a((byte) 101, this.field_i, this.field_d);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    cf(int param0) {
        this.field_g = param0;
        this.field_a = new int[this.field_g];
        this.field_h = new int[this.field_g];
        this.field_i = new int[this.field_g][3];
        this.field_b = new int[this.field_g];
    }

    static {
        field_f = "<%0> has joined your game.";
        field_c = "You can ask to join this game";
    }
}
