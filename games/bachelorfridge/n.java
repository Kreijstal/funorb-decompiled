/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    private boolean field_b;
    static String field_d;
    private String field_e;
    private boolean field_a;
    static String field_c;

    final void a(boolean param0, int param1) {
        this.field_a = param0 ? true : false;
        if (param1 != 1537025605) {
            return;
        }
        this.field_b = true;
    }

    final String b(int param0) {
        if (param0 != 25477) {
            field_c = (String) null;
            return this.field_e;
        }
        return this.field_e;
    }

    final static pp a(lu param0, int param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        lu var8 = null;
        int stackIn_5_0 = 0;
        iv stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -126) {
                break L1;
              } else {
                var8 = (lu) null;
                n.a((lu) null, -83);
                break L1;
              }
            }
            L2: {
              var2 = qi.a(param0, (byte) 123);
              var3 = param0.e((byte) 126);
              if (0 == (var3 & 32768)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            var4 = stackIn_5_0;
            var5 = var3 & 32767;
            var3 = param0.b(16711935);
            var5 = -16384 + (var5 ^ 16384);
            var6 = var3 >> 1537025605;
            var7 = param0.b(16711935);
            stackIn_6_0 = new iv(var2, var4 != 0, var6, var5, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("n.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return (pp) ((Object) stackIn_6_0);
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return this.field_b;
    }

    public static void a(byte param0) {
        if (param0 < 81) {
            n.a((byte) 118);
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    final boolean a(int param0) {
        if (param0 != -7750) {
            lu var3 = (lu) null;
            n.a((lu) null, 124);
            return this.field_a;
        }
        return this.field_a;
    }

    n(String param0) {
        this.field_a = false;
        this.field_b = false;
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "The blue square shows where your creature can move to, click any blue square to command your creature to move there.";
        field_c = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
