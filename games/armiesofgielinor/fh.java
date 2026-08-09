/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    private boolean field_g;
    static um[] field_b;
    static boolean field_c;
    private int field_h;
    static String[] field_f;
    static int field_e;
    private int field_a;
    private int[] field_d;
    static boolean field_i;

    final void e(int param0, int param1) {
        if (param0 != 26884) {
          this.a(60);
          this.a(param1, this.field_a - -1, param0 ^ -27002);
          return;
        } else {
          this.a(param1, this.field_a - -1, param0 ^ -27002);
          return;
        }
    }

    final static void a(int param0, gd param1) {
        try {
            if (param0 <= 123) {
                field_c = false;
            }
            param1.field_Z = ih.field_E;
            param1.field_t = ih.field_E;
            param1.field_R = ih.field_E;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(int param0, int param1) {
        if (param0 > this.field_a) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1 != 652110180) {
            return 75;
          } else {
            return this.field_d[param0];
          }
        }
    }

    final int a(int param0) {
        if (param0 > -54) {
            fh.b((byte) 62);
            return 1 + this.field_a;
        }
        return 1 + this.field_a;
    }

    final void b(int param0, int param1) {
        if (-1 >= (param0 ^ -1)) {
          if (this.field_a >= param0) {
            if (param1 >= -64) {
              L0: {
                field_c = true;
                if (param0 != this.field_a) {
                  vm.a(this.field_d, 1 + param0, this.field_d, param0, this.field_a + -param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              this.field_a = this.field_a - 1;
              return;
            } else {
              L1: {
                if (param0 != this.field_a) {
                  vm.a(this.field_d, 1 + param0, this.field_d, param0, this.field_a + -param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_a = this.field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    public static void a(byte param0) {
        int[] var2;
        field_b = null;
        if (param0 != -28) {
          var2 = (int[]) null;
          fh.a(3, 71, (byte) -110, (int[]) null, 86, 72, -80);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_a >= param1) {
          if (param2 > -41) {
            L0: {
              this.field_d = (int[]) null;
              if (param1 >= this.field_d.length) {
                this.c(74, param1);
                break L0;
              } else {
                break L0;
              }
            }
            this.field_d[param1] = param0;
            return;
          } else {
            L1: {
              if (param1 >= this.field_d.length) {
                this.c(74, param1);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_d[param1] = param0;
            return;
          }
        } else {
          this.field_a = param1;
          if (param2 <= -41) {
            L2: {
              if (param1 >= this.field_d.length) {
                this.c(74, param1);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_d[param1] = param0;
            return;
          } else {
            L3: {
              this.field_d = (int[]) null;
              if (param1 >= this.field_d.length) {
                this.c(74, param1);
                break L3;
              } else {
                break L3;
              }
            }
            this.field_d[param1] = param0;
            return;
          }
        }
    }

    private fh() throws Throwable {
        throw new Error();
    }

    private final void c(int param0, int param1) {
        int[] var3;
        int[] var4;
        var4 = new int[this.a(param1, -18113)];
        var3 = var4;
        vm.a(this.field_d, 0, var4, 0, this.field_d.length);
        this.field_d = var4;
        if (param0 <= 34) {
          this.a(99);
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1) {
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = this.field_d.length;
        L0: while (true) {
          if (param0 < var3) {
            if (param1 != -18113) {
              this.field_d = (int[]) null;
              return var3;
            } else {
              return var3;
            }
          } else {
            if (this.field_g) {
              if (-1 != (var3 ^ -1)) {
                var3 = var3 * this.field_h;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            } else {
              var3 = var3 + this.field_h;
              continue L0;
            }
          }
        }
    }

    final static boolean b(byte param0) {
        int var1;
        var1 = -84 % ((-51 - param0) / 32);
        if (null != am.field_z) {
          if (!ov.field_g.b((byte) -121)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, byte param2, int[] param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        gd var15 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7_int = tm.field_c;
              var8 = tm.field_j;
              var9 = tm.field_n[150];
              var10 = tm.field_e[150];
              if (param2 == 56) {
                break L1;
              } else {
                var15 = (gd) null;
                fh.a(104, (gd) null);
                break L1;
              }
            }
            var11 = -(param6 * var9) + var10 * param0 >> 192398192;
            var12 = param0 * var9 - -(param6 * var10) >> 1011992528;
            if (var12 > 0) {
              var13 = (param5 << 386965193) / var12 + var7_int;
              var14 = var8 + (var11 << -1394637303) / var12;
              qn.a(var13 << 1531339236, var14 << 652110180, param1, param4, param3);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("fh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_c = true;
        field_f = new String[]{"This unit can still move and attack this turn", "This unit can still attack enemies in range this turn", "This unit has no actions left this turn", "This unit is poisoned", "This unit is paralysed with fear", "This unit's morale is boosted", "This unit is confused", "This unit has no status modifiers"};
    }
}
