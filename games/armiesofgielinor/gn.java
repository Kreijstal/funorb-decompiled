/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private int field_c;
    private StringBuilder field_a;
    private boolean field_b;

    final static void a(int param0, wj param1, int param2) {
        bv var3 = null;
        try {
            var3 = vl.field_n;
            var3.h(32161, param0);
            var3.b(1, 5);
            var3.b(param2 + 1, param2);
            var3.b(true, param1.field_r);
            var3.b(1, param1.field_k);
            var3.b(1, param1.field_p);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "gn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (!(this.field_b)) {
            this.b(param0 ^ 125);
        }
        this.field_c = this.field_c + param1;
        if (param0 != 0) {
            this.b(123);
        }
    }

    final void a(byte param0, String param1) {
        try {
            this.a(param1, 0);
            this.b(124);
            if (param0 != 19) {
                this.field_c = 9;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "gn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) {
        if (param0 < 119) {
            this.field_a = (StringBuilder) null;
        }
        StringBuilder discarded$0 = this.field_a.append("\n");
        this.field_b = true;
    }

    private final void a(String param0, int param1) {
        StringBuilder discarded$12 = null;
        wj var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_b) {
                this.a(0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              discarded$12 = this.field_a.append(param0);
              if (param1 == 0) {
                break L2;
              } else {
                var4 = (wj) null;
                gn.a(-82, (wj) null, 123);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("gn.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(String[] param0, byte param1) {
        try {
            if (param1 >= -45) {
                String var4 = (String) null;
                this.a((byte) 62, (String) null);
            }
            this.a((byte) 19, pj.a(593277313, (CharSequence[]) ((Object) param0)));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "gn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void d(int param0) {
        ik.field_d = new hk(jm.field_b, hr.field_m, uc.field_b, eq.field_h, hs.field_H, ms.field_k);
        if (param0 != 5) {
            gn.d(-31);
        }
    }

    gn() {
        this.field_a = new StringBuilder(1024);
        this.field_b = true;
    }

    final String c(int param0) {
        if (param0 != 1024) {
            return (String) null;
        }
        return this.field_a.toString();
    }

    private final void a(int param0) {
        int var2 = 0;
        StringBuilder discarded$0 = null;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = param0; var2 < this.field_c; var2++) {
            discarded$0 = this.field_a.append(" ");
        }
        this.field_b = false;
    }

    static {
    }
}
