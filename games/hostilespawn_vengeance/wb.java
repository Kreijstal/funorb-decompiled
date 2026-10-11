/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb extends ul {
    private int field_U;
    private int field_Q;
    static bd field_W;
    static int field_S;
    static boolean field_Z;
    private int field_Y;
    static int field_R;
    private int field_T;
    private int field_V;
    private int field_X;

    void m(int param0) {
        if (param0 >= 0) {
          return;
        }
        if (this.field_U <= 0) {
          return;
        }
        this.a(this.field_Q, 15767, this.field_Y);
        this.field_U = 0;
        this.o(20);
    }

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != 65393) {
          return false;
        }
        if (this.field_U <= 0) {
        } else {
          var2 = this.field_Q;
          var3 = this.field_Y;
          fieldTemp$0 = this.field_T + 1;
          this.field_T = this.field_T + 1;
          if (this.field_U > fieldTemp$0) {
            var4 = (-this.field_T + 2 * this.field_U) * this.field_T;
            var5 = this.field_U * this.field_U;
            var3 = this.field_X + var4 * (-this.field_X + this.field_Y) / var5;
            var2 = this.field_V + var4 * (-this.field_V + this.field_Q) / var5;
          } else {
            this.field_U = 0;
            this.o(param0 - 65373);
          }
          this.a(var2, 15767, var3);
        }
        return super.l(65393);
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var13Lifetime2;
        var16 = HostileSpawn.field_I ? 1 : 0;
        si.c(6 + param2, param0 + 35, -12 + this.field_s, -40 + this.field_x, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        if (param1 != -238948511) {
          return;
        }
        var7 = 0;
        var8 = param0;
        while (var7 < var4) {
          if (var8 >= si.field_j &&
            var8 < si.field_a) {
            L4: {
              L5: {
                var9 = var5 + var7 * (-var5 + var6) / var4;
                var10 = 0;
                var11 = this.field_s;
                if (var7 <= 20) {
                  while (var10 <= 20) {
                    var12 = (-var10 + 20) * (20 - var10) + (20 - var7) * (20 - var7);
                    if (var12 <= 462) {
                      if (420 > var12) {
                        if (var7 > 20) {
                          break L4;
                        }
                        var12 = var11;
                        var11 -= 21;
                        var13 = 0;
                        while (var13 <= 20) {
                          var14 = var13 * var13 + (20 - var7) * (20 - var7);
                          if (462 < var14) {
                            break;
                          }
                          if (var14 >= 420) {
                            var15 = (-var14 + 462) * var9 / 42;
                            var15 = var15 | (var15 << 8 | var15 << 16);
                            si.field_i[var8 * si.field_e + (param2 + var11)] = var15;
                          } else {
                            var12 = var11 + 1;
                          }
                          var13++;
                          var11++;
                        }
                        break L5;
                      }
                      var13Lifetime2 = (462 - var12) * var9 / 42;
                      var13Lifetime2 = var13Lifetime2 | (var13Lifetime2 << 8 | var13Lifetime2 << 16);
                      si.field_i[var10 + si.field_e * var8 + param2] = var13Lifetime2;
                    }
                    var10++;
                  }
                }
                if (var7 > 20) {
                  break L4;
                }
                var12 = var11;
                var11 -= 21;
                var13Lifetime1 = 0;
                while (var13Lifetime1 <= 20) {
                  var14Lifetime1 = var13Lifetime1 * var13Lifetime1 + (20 - var7) * (20 - var7);
                  if (462 < var14Lifetime1) {
                    break;
                  }
                  if (var14Lifetime1 >= 420) {
                    var15Lifetime1 = (-var14Lifetime1 + 462) * var9 / 42;
                    var15Lifetime1 = var15Lifetime1 | (var15Lifetime1 << 8 | var15Lifetime1 << 16);
                    si.field_i[var8 * si.field_e + (param2 + var11)] = var15Lifetime1;
                  } else {
                    var12 = var11 + 1;
                  }
                  var13Lifetime1++;
                  var11++;
                }
              }
              var11 = var12;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            si.a(var10 + param2, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param0;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          si.a(param2, var8Lifetime1, 6, var9Lifetime1);
          si.a(this.field_s + (param2 - 6), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        sf.field_ab.e(-90 + (this.field_s + param2), 10 + param0);
        tg.a(110, bh.field_a, -10 + this.field_s, 35 + param0, param2 + 5);
        tg.a(108, g.field_G, this.field_s, param0 + this.field_x - 22, param2);
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var4Lifetime2 = -79 + this.field_x;
        var7Lifetime2 = 0;
        var8Lifetime2 = param0 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = (var6Lifetime2 - var5Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          si.a(param2, var8Lifetime2, 6, var9Lifetime2);
          si.a(-6 + this.field_s + param2, var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
        return;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 <= 0) {
          this.a(param1, 15767, param3);
          return;
        }
        this.field_Q = param1;
        this.field_V = this.field_s;
        this.field_Y = param3;
        this.field_T = 0;
        this.field_X = this.field_x;
        int var5 = -90 / ((param2 - 0) / 63);
        this.field_U = param0;
    }

    public static void n(int param0) {
        if (param0 != 420) {
          return;
        }
        field_W = null;
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        if (param2) {
          wb.a(true, false, true, false);
        }
        int var4 = 0;
        if (param3) {
          var4 += 4;
        }
        if (param0) {
          var4 += 2;
        }
        if (param1) {
          var4++;
        }
        return ti.field_a[var4];
    }

    final static int a(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 79) {
            wb.n(119);
          }
          if (!param1) {
            stackIn_6_0 = lj.field_u.a(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = na.field_c.a(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wb.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    boolean j(int param0) {
        if (param0 != -15953) {
          return false;
        }
        this.m(param0 + 15877);
        return super.j(-15953);
    }

    wb(gg param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_U = 0;
        this.field_T = 0;
    }

    void o(int param0) {
        if (param0 != 20) {
          this.o(0);
        }
    }

    static {
        field_Z = false;
        field_R = 0;
    }
}
