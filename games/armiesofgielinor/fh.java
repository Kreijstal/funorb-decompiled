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
          int discarded$2 = ((fh) this).a(60);
          this.a(param1, ((fh) this).field_a - -1, param0 ^ -27002);
          return;
        } else {
          this.a(param1, ((fh) this).field_a - -1, param0 ^ -27002);
          return;
        }
    }

    final static void a(int param0, gd param1) {
        try {
            param1.field_Z = ih.field_E;
            param1.field_t = ih.field_E;
            param1.field_R = ih.field_E;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fh.C(" + 124 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(int param0, int param1) {
        if (param0 > ((fh) this).field_a) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1 != 652110180) {
            return 75;
          } else {
            return ((fh) this).field_d[param0];
          }
        }
    }

    final int a(int param0) {
        if (param0 > -54) {
            boolean discarded$0 = fh.b((byte) 62);
            return 1 + ((fh) this).field_a;
        }
        return 1 + ((fh) this).field_a;
    }

    final void b(int param0, int param1) {
        if (param0 >= 0) {
          if (((fh) this).field_a >= param0) {
            if (param1 >= -64) {
              L0: {
                field_c = true;
                if (param0 != ((fh) this).field_a) {
                  vm.a(((fh) this).field_d, 1 + param0, ((fh) this).field_d, param0, ((fh) this).field_a + -param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((fh) this).field_a = ((fh) this).field_a - 1;
              return;
            } else {
              L1: {
                if (param0 != ((fh) this).field_a) {
                  vm.a(((fh) this).field_d, 1 + param0, ((fh) this).field_d, param0, ((fh) this).field_a + -param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((fh) this).field_a = ((fh) this).field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    public static void a() {
        field_b = null;
        field_f = null;
    }

    private final void a(int param0, int param1, int param2) {
        if (((fh) this).field_a >= param1) {
          if (param2 > -41) {
            L0: {
              ((fh) this).field_d = null;
              if (param1 >= ((fh) this).field_d.length) {
                this.c(74, param1);
                break L0;
              } else {
                break L0;
              }
            }
            ((fh) this).field_d[param1] = param0;
            return;
          } else {
            L1: {
              if (param1 >= ((fh) this).field_d.length) {
                this.c(74, param1);
                break L1;
              } else {
                break L1;
              }
            }
            ((fh) this).field_d[param1] = param0;
            return;
          }
        } else {
          ((fh) this).field_a = param1;
          if (param2 <= -41) {
            L2: {
              if (param1 >= ((fh) this).field_d.length) {
                this.c(74, param1);
                break L2;
              } else {
                break L2;
              }
            }
            ((fh) this).field_d[param1] = param0;
            return;
          } else {
            L3: {
              ((fh) this).field_d = null;
              if (param1 >= ((fh) this).field_d.length) {
                this.c(74, param1);
                break L3;
              } else {
                break L3;
              }
            }
            ((fh) this).field_d[param1] = param0;
            return;
          }
        }
    }

    private fh() throws Throwable {
        throw new Error();
    }

    private final void c(int param0, int param1) {
        int[] var4 = new int[this.a(param1, -18113)];
        int[] var3 = var4;
        vm.a(((fh) this).field_d, 0, var4, 0, ((fh) this).field_d.length);
        ((fh) this).field_d = var4;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = ((fh) this).field_d.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (((fh) this).field_g) {
              if (var3 != 0) {
                var3 = var3 * ((fh) this).field_h;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            } else {
              var3 = var3 + ((fh) this).field_h;
              continue L0;
            }
          }
        }
    }

    final static boolean b(byte param0) {
        int var1 = 0;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var7_int = tm.field_c;
            var8 = tm.field_j;
            var9 = tm.field_n[150];
            var10 = tm.field_e[150];
            var11 = -(param6 * var9) + var10 * param0 >> 16;
            var12 = param0 * var9 - -(param6 * var10) >> 16;
            if (var12 > 0) {
              var13 = (param5 << 9) / var12 + var7_int;
              var14 = var8 + (var11 << 9) / var12;
              qn.a(var13 << 4, var14 << 4, param1, param4, param3);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("fh.H(").append(param0).append(',').append(param1).append(',').append(56).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_f = new String[]{"This unit can still move and attack this turn", "This unit can still attack enemies in range this turn", "This unit has no actions left this turn", "This unit is poisoned", "This unit is paralysed with fear", "This unit's morale is boosted", "This unit is confused", "This unit has no status modifiers"};
    }
}
