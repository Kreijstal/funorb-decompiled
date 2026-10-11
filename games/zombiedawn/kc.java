/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends id {
    private int field_U;
    private fn field_W;
    boolean field_S;
    static int field_R;
    private int field_Z;
    private int field_X;
    int field_V;
    private int field_ab;
    private int field_T;
    static int[] field_Y;
    private boolean field_H;
    static boolean field_Q;
    private boolean field_bb;

    final void a(ej param0, boolean param1) {
        boolean stackIn_4_2 = false;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wk var12 = null;
        int[][] var16 = null;
        int var6Lifetime1;
        var11 = ZombieDawn.field_J;
        try {
          var3_int = 12;
          stackIn_4_2 = !(param1);
          this.field_Z = this.a(stackIn_4_2);
          this.field_X = this.f(237239984);
          var4 = this.field_Z;
          if (param1) {
            var12 = (wk) null;
            this.a((byte) -112, (wk) null);
          }
          var5 = this.field_X;
          this.field_T = var3_int;
          var6 = this.field_V;
          if (var6 == 2) {
            var5 = var5 - var3_int;
            this.field_X = this.field_X + 12;
            var4 = var4 + var3_int;
          } else {
            if (1 == var6) {
              var5 = var5 + var3_int;
            }
          }
          while (var3_int >= 1) {
            if (this.field_V != 2) {
              var5 = var5 + var3_int;
            } else {
              var4 = var4 + var3_int;
            }
            if (param0.a(param1, var5, var4, false)) {
              this.field_T = this.field_T + var3_int;
              continue;
            }
            if (this.field_V == 2) {
              var4 = var4 - var3_int;
            } else {
              var5 = var5 - var3_int;
            }
            var3_int = var3_int / 2;
          }
          if (this.field_V != 2) {
            return;
          }
          var6Lifetime1 = this.field_Z / 24;
          var7 = this.field_X / 24;
          var16 = param0.field_A.field_h;
          if (var6Lifetime1 >= 0 &&
            var7 >= 0 &&
            var6Lifetime1 < var16[0].length) {
            if (var7 >= var16.length) {
              return;
            }
            var9 = var16[var7][var6Lifetime1] >> 7 & 511;
            if (var9 > 217 &&
              246 > var9) {
              stackIn_35_0 = 4;
            } else {
              stackIn_35_0 = 0;
            }
            var10 = stackIn_35_0;
            this.field_T = this.field_T + var10;
            this.field_y = this.field_y - (var10 << 16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("kc.I(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, kd param1) {
        int stackIn_15_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          var3_int = 28 % ((param0 + 8) / 53);
          if (!this.field_S) {
            return false;
          }
          if (this.field_bb &&
            !this.field_H) {
            return false;
          }
          var4 = 0;
          var5 = param1.a(true);
          var6 = param1.f(237239984);
          if (2 != this.field_V) {
            if (1 == this.field_V) {
              var7 = var6 - this.field_X;
              if (5 > Math.abs(-12 + var5 - this.field_Z)) {
                if (var7 > 0) {
                  stackIn_26_0 = (var7 >= this.field_T) ? 0 : 1;
                } else {
                  stackIn_26_0 = 0;
                }
              } else {
                stackIn_26_0 = 0;
              }
              var4 = stackIn_26_0;
            }
          } else {
            var7 = var5 - this.field_Z;
            if (Math.abs(-this.f(237239984) + var6) < 5) {
              if (var7 > 0) {
                stackIn_15_0 = (var7 < this.field_T) ? 1 : 0;
              } else {
                stackIn_15_0 = 0;
              }
            } else {
              stackIn_15_0 = 0;
            }
            var4 = stackIn_15_0;
          }
          if (var4 != 0 &&
            !this.field_bb) {
            this.field_H = true;
            this.field_U = 0;
          }
          stackIn_32_0 = var4;
          return stackIn_32_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("kc.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        qg.field_f = param2;
        ej.field_s = param3;
        qi.field_E = param1;
        if (param0 == 50) {
          return;
        }
        field_Q = true;
    }

    public static void c(boolean param0) {
        field_Y = null;
        if (param0) {
          return;
        }
        field_R = 39;
    }

    final void g(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        boolean stackIn_11_1 = false;
        boolean stackIn_38_1 = false;
        int var2;
        int var2Lifetime1;
        super.g(126);
        if (!this.field_S) {
          return;
        }
        if (this.field_bb) {
          fieldTemp$1 = this.field_U + 1;
          this.field_U = this.field_U + 1;
          if (fieldTemp$1 >= this.field_ab) {
            this.field_U = 0;
            stackIn_11_1 = !(this.field_H);
            this.field_H = stackIn_11_1;
            if (this.field_H) {
              this.field_W = jp.$cfr$intArgs$a$c44adeabe1a9(127, 96);
              var2 = 30;
              this.field_W.f(-(var2 / 2) + so.c(var2) + 256);
              this.field_W.h(ge.field_c / 2);
            } else {
              if (this.field_W != null) {
                this.field_W.e(0);
                this.field_W.i(-1);
                this.field_W.h(0);
                this.field_W = null;
              }
            }
          }
          if (param0 > 95) {
            return;
          }
          this.field_H = true;
          return;
        }
        if (!this.field_H) {
          if (param0 > 95) {
            return;
          }
          this.field_H = true;
          return;
        }
        fieldTemp$0 = this.field_U + 1;
        this.field_U = this.field_U + 1;
        if (fieldTemp$0 >= this.field_ab) {
          this.field_U = 0;
          stackIn_38_1 = !(this.field_H);
          this.field_H = stackIn_38_1;
          if (this.field_H) {
            this.field_W = jp.$cfr$intArgs$a$c44adeabe1a9(127, 96);
            var2Lifetime1 = 30;
            this.field_W.f(-(var2Lifetime1 / 2) + so.c(var2Lifetime1) + 256);
            this.field_W.h(ge.field_c / 2);
          } else {
            if (this.field_W != null) {
              this.field_W.e(0);
              this.field_W.i(-1);
              this.field_W.h(0);
              this.field_W = null;
            }
          }
        }
        if (param0 > 95) {
          return;
        }
        this.field_H = true;
        return;
    }

    kc(int param0, int param1, int param2, boolean param3, boolean param4, int param5, int param6) {
        super(param0, param1, param2);
        this.field_S = true;
        this.field_H = false;
        this.field_S = true;
        this.field_V = param5;
        if (param6 == -1) {
          this.field_bb = false;
          this.field_ab = 400;
          if (!param3) {
            return;
          }
          if (this.field_V == 0) {
            this.field_V = 2;
            return;
          }
          if (this.field_V == 2) {
            this.field_V = 0;
          }
          return;
        }
        this.field_bb = true;
        this.field_ab = 250;
        this.field_U = param6 * this.field_ab / 2;
        if (this.field_U > this.field_ab) {
          this.field_H = !this.field_H ? true : false;
          this.field_U = this.field_U % this.field_ab;
        }
        if (!param3) {
          return;
        }
        if (this.field_V == 0) {
          this.field_V = 2;
          return;
        }
        if (this.field_V == 2) {
          this.field_V = 0;
        }
    }

    final void a(byte param0, wk param1) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          super.a((byte) -92, param1);
          stackIn_3_0 = (3 <= (397 * this.field_U + 197 * (this.field_y >> 16) + (this.field_x >> 16) * 493) % 63) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param0 > -76) {
            return;
          }
          stackIn_8_0 = (var3_int != 0) ? 6336736 : 3182768;
          var4 = stackIn_8_0;
          stackIn_11_0 = (var3_int == 0) ? 10543359 : 7393279;
          var5 = stackIn_11_0;
          var6 = param1.a(this.a(true), (byte) -71);
          var7 = param1.a(this.f(237239984), 0);
          if (null != this.field_W) {
            this.field_W.h(pj.a(var7, 106, var6) >> 1);
          }
          var9 = this.field_V;
          if (var9 == 0) {
            var6 = var6 - this.field_T;
          } else {
            if (var9 != 2) {
              if (var9 != 1) {
                return;
              }
              var6 += 11;
              var7 -= 6;
              if (!this.field_H) {
                return;
              }
              bi.e(-1 + var6, var7, 6 + this.field_T, var4);
              bi.e(var6, var7, this.field_T + 6, var5);
              bi.e(1 + var6, var7, this.field_T + 6, var4);
              return;
            }
          }
          var8 = 18;
          var7 -= 12;
          var6 = var6 + var8;
          if (this.field_H) {
            bi.b(var6, var7 - 1, this.field_T - var8, var4);
            bi.b(var6, var7, -var8 + this.field_T, var5);
            bi.b(var6, 1 + var7, this.field_T - var8, var4);
          }
          var7 -= 12;
          tm.field_h[this.field_F + 1].b(this.field_T + var6 + (-var8 - 24), var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("kc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_R = 0;
        field_Y = new int[]{20, 7};
        field_Q = false;
    }
}
