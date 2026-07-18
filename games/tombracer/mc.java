/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends nv {
    static nh field_r;
    private int field_p;
    private int field_n;
    private int field_v;
    private int field_t;
    private pc field_u;
    private int field_w;
    private pc field_o;
    private int field_s;
    private int field_q;

    final int a(boolean param0) {
        if (param0) {
            return -109;
        }
        return 29;
    }

    final void n(byte param0) {
        if (param0 <= 68) {
            return;
        }
        super.n((byte) 102);
        this.b(1659280738);
        int discarded$0 = 1;
        this.j();
    }

    private final void b(int param0) {
        int var2 = 0;
        Object var3 = null;
        var2 = ((mc) this).field_g.g(-25787);
        if (param0 == 1659280738) {
          var2 = dfa.a(2048 + var2, 8192, -34);
          if (var2 != ((mc) this).field_v) {
            ((mc) this).field_t = hua.a((byte) 99, var2 >> 2);
            ((mc) this).field_p = bua.a(0, var2 >> 2);
            ((mc) this).field_v = var2;
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          boolean discarded$1 = ((mc) this).a(65, 57, (pc) null, 85);
          var2 = dfa.a(2048 + var2, 8192, -34);
          if (var2 == ((mc) this).field_v) {
            return;
          } else {
            ((mc) this).field_t = hua.a((byte) 99, var2 >> 2);
            ((mc) this).field_p = bua.a(0, var2 >> 2);
            ((mc) this).field_v = var2;
            return;
          }
        }
    }

    final int a(int param0, int param1) {
        param0 = fs.a((byte) 83, param0, ((mc) this).field_w);
        if (param1 > -48) {
            return -43;
        }
        return param0;
    }

    private final int a(boolean param0, pc param1) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = ua.a(-param1.field_d + param1.field_e, -104) - -ua.a(param1.field_a + -param1.field_k, -109);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("mc.R(").append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mc.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    mc(la param0, boolean param1) {
        super(param0, param1);
        ((mc) this).field_v = -1;
        ((mc) this).field_u = new pc();
    }

    mc(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((mc) this).field_v = -1;
        ((mc) this).field_u = new pc();
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            var5_int = al.a(param2, 12, 12, ((mc) this).field_u);
            if (-1 != var5_int) {
              var6 = wm.a(4096, var5_int, -61);
              param2.a(var6, (byte) 47);
              ((mc) this).field_o = param2;
              ((mc) this).field_s = this.a(true, param2);
              ((mc) this).field_q = param0;
              ((mc) this).field_w = var6;
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              ((mc) this).field_o = null;
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("mc.K(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0 != 0;
    }

    public static void g() {
        field_r = null;
        int var1 = -15;
    }

    final int a(int param0, up param1, pc param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        pc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        la var16 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (param2 != ((mc) this).field_o) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var4_int = this.a(true, param2);
              if (((mc) this).field_s != var4_int) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param2.field_b != 0) {
                  L1: {
                    var5 = new pc();
                    if (param0 < -85) {
                      break L1;
                    } else {
                      field_r = null;
                      break L1;
                    }
                  }
                  param2.field_h = var5;
                  var6 = param2.field_e;
                  var5.field_j = param2.field_j;
                  var7 = param2.field_a;
                  var5.field_i = param2.field_i;
                  var8 = qva.a((byte) -99, -param2.field_k + var7, var6 + -param2.field_d);
                  var9 = dfa.a(((mc) this).field_v - -2048, 8192, -71);
                  var10 = cf.a(8192, -16390, var8, var9);
                  var11 = dfa.a(2 * var10 + var8 + 4096, 8192, 126);
                  var12 = hua.a((byte) 99, var11 >> 2);
                  var13 = bua.a(0, var11 >> 2);
                  var14 = param2.field_b + -gqa.a(param2.field_b, (byte) 24, ((mc) this).field_w);
                  var15 = var14 >> 8;
                  var5.a(var6, (var12 >> 8) * var15 + var6, var7, (var13 >> 8) * var15 + var7, 44);
                  var5.field_b = var14;
                  var16 = ((mc) this).b(true);
                  boolean discarded$1 = var16.a(((mc) this).field_q, (gma) (Object) ((mc) this).field_g, -108, var5, (gma) (Object) ((mc) this).e(6), param1);
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("mc.S(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(true, param1);
            param1.a(param0, 120);
            ((mc) this).field_n = et.b(param1.a((byte) 55), param1.c(-23), -23);
            this.b(1659280738);
            int discarded$0 = 1;
            this.j();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mc.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j() {
        int var2 = ((mc) this).field_g.d(3);
        int var3 = ((mc) this).field_g.e(9648);
        int var4 = ((mc) this).field_n >> 8;
        int var5 = (((mc) this).field_t >> 8) * var4 / 2;
        int var6 = var4 * (((mc) this).field_p >> 8) / 2;
        ((mc) this).field_u.a(var2 - var5, var5 + var2, -var6 + var3, var6 + var3, 44);
    }

    final void k(int param0) {
        this.b(param0 ^ 1659275336);
        if (param0 != 5418) {
          ((mc) this).field_p = 81;
          int discarded$4 = 1;
          this.j();
          return;
        } else {
          int discarded$5 = 1;
          this.j();
          return;
        }
    }

    static {
    }
}
