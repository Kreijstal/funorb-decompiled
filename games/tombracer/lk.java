/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends vg implements qn, fo, noa {
    private int field_o;
    private int field_p;
    private bca field_m;
    static boolean[] field_h;
    private boolean field_g;
    private int field_n;
    private boolean field_f;
    private int field_j;
    private la field_i;
    private int field_k;
    static jea field_l;

    private final boolean a(int param0) {
        return false;
    }

    final boolean a(int param0, boolean param1) {
        if (param1) {
            int discarded$0 = ((lk) this).c((byte) -27);
        }
        return ((lk) this).field_m.a(param0, 14530);
    }

    final void a(la param0, byte param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ((lk) this).field_n = param0.a(((lk) this).field_n, (byte) 71);
              stackOut_0_0 = this;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (((lk) this).field_g) {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              ((lk) this).field_g = stackIn_3_1 != 0;
              if (param1 == 104) {
                break L2;
              } else {
                var4 = null;
                ((lk) this).a(-36, (iq) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("lk.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    private final boolean f(byte param0) {
        return ((lk) this).field_i.o((byte) -82) && !((lk) this).a(((lk) this).field_i.i(6029), false);
    }

    final void a(int param0, int param1) {
        ((lk) this).field_n = param1;
        if (param0 != -6492) {
            int discarded$0 = ((lk) this).b((byte) 30);
        }
    }

    public final void a(int param0, iq param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!this.f((byte) -1)) {
                dea.field_a.a(param1, 15, (lk) this);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 103) {
                break L2;
              } else {
                ((lk) this).field_g = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("lk.DB(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public final int b(byte param0) {
        int var2 = -17 % ((-23 - param0) / 53);
        return ((lk) this).field_n;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            ((lk) this).field_i = null;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            if (param0 >= -125) {
                ((lk) this).field_n = -37;
            }
            param1.a((byte) 20, ((lk) this).field_j, 8);
            param1.a((byte) -127, ((lk) this).field_n >> 16, 12);
            param1.a((byte) -43, ((lk) this).field_p >> 16, 12);
            param1.a((byte) -125, ((lk) this).field_k >> 16, 10);
            param1.a((byte) -128, ((lk) this).field_o >> 16, 10);
            param1.a((byte) -127, ((lk) this).field_g ? 1 : 0, 1);
            param1.a((byte) 86, !((lk) this).field_f ? 0 : 1, 1);
            ((lk) this).field_m.a((byte) -86, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lk.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return false;
        }
        return this.a(72);
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            return -46;
        }
        return ((lk) this).field_p;
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            ((lk) this).field_k = -73;
            return 0;
        }
        return 0;
    }

    final int a(byte param0) {
        int var2 = -101 % ((56 - param0) / 62);
        return ((lk) this).field_n;
    }

    final int b(int param0) {
        if (param0 < 36) {
            return -117;
        }
        return ((lk) this).field_k;
    }

    final void b(int param0, int param1) {
        ((lk) this).field_p = param1;
        if (param0 != 0) {
            boolean discarded$0 = ((lk) this).d((byte) 90);
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_h = null;
    }

    final int b(boolean param0) {
        if (param0) {
            field_h = null;
        }
        return ((lk) this).field_o;
    }

    final int g(byte param0) {
        if (param0 >= -58) {
            return -85;
        }
        return ((lk) this).field_p;
    }

    lk(la param0, kh param1) {
        try {
            ((lk) this).field_i = param0;
            ((lk) this).field_j = param1.b((byte) 44, 8);
            ((lk) this).field_n = param1.b((byte) 44, 12) << 16;
            ((lk) this).field_p = param1.b((byte) 44, 12) << 16;
            ((lk) this).field_k = param1.b((byte) 44, 10) << 16;
            ((lk) this).field_o = param1.b((byte) 44, 10) << 16;
            ((lk) this).field_g = param1.b((byte) 44, 1) == 1 ? true : false;
            ((lk) this).field_f = param1.b((byte) 44, 1) == 1 ? true : false;
            ((lk) this).field_m = new bca(param0.field_E, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = new boolean[42];
        for (var0 = 0; var0 < field_h.length; var0++) {
            field_h[var0] = true;
        }
        field_h[0] = false;
        field_h[36] = false;
        field_h[37] = false;
        field_h[38] = false;
        field_h[33] = false;
        field_h[34] = false;
        field_h[39] = false;
        field_h[40] = false;
        field_h[41] = false;
        field_h[35] = false;
    }
}
