/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private int field_c;
    private StringBuilder field_a;
    private boolean field_b;

    final static void a(int param0, wj param1) {
        bv var3 = null;
        try {
            var3 = vl.field_n;
            var3.h(32161, param0);
            var3.b(1, 5);
            var3.b(1, 0);
            var3.b(true, param1.field_r);
            var3.b(1, param1.field_k);
            var3.b(1, param1.field_p);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "gn.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final void a(int param0, int param1) {
        if (!(((gn) this).field_b)) {
            this.b(param0 ^ 125);
        }
        ((gn) this).field_c = ((gn) this).field_c + param1;
        if (param0 != 0) {
            this.b(123);
        }
    }

    final void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              int discarded$2 = 0;
              this.a(param1);
              this.b(124);
              if (param0 == 19) {
                break L1;
              } else {
                ((gn) this).field_c = 9;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gn.A(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final void b(int param0) {
        if (param0 < 119) {
            ((gn) this).field_a = null;
        }
        StringBuilder discarded$0 = ((gn) this).field_a.append("\n");
        ((gn) this).field_b = true;
    }

    private final void a(String param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (((gn) this).field_b) {
                int discarded$4 = 0;
                this.a();
                break L1;
              } else {
                break L1;
              }
            }
            StringBuilder discarded$5 = ((gn) this).field_a.append(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("gn.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
    }

    final void a(String[] param0, byte param1) {
        try {
            if (param1 >= -45) {
                Object var4 = null;
                ((gn) this).a((byte) 62, (String) null);
            }
            ((gn) this).a((byte) 19, pj.a(593277313, (CharSequence[]) (Object) param0));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "gn.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void d(int param0) {
        ik.field_d = new hk(jm.field_b, hr.field_m, uc.field_b, eq.field_h, (je) (Object) hs.field_H, ms.field_k);
        if (param0 != 5) {
            gn.d(-31);
        }
    }

    gn() {
        ((gn) this).field_a = new StringBuilder(1024);
        ((gn) this).field_b = true;
    }

    final String c(int param0) {
        if (param0 != 1024) {
            return null;
        }
        return ((gn) this).field_a.toString();
    }

    private final void a() {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = 0; var2 < ((gn) this).field_c; var2++) {
            StringBuilder discarded$0 = ((gn) this).field_a.append(" ");
        }
        ((gn) this).field_b = false;
    }

    static {
    }
}
