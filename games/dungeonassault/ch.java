/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ch extends hl {
    private long field_m;
    static sm[] field_n;
    static String field_l;
    private String field_o;

    fd b(int param0) {
        int var2 = 33 / ((-56 - param0) / 41);
        return ug.field_w;
    }

    final void a(ec param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.a(71, this.field_m);
              param0.a(this.field_o, (byte) 122);
              if (param1 < -5) {
                break L1;
              } else {
                this.field_m = -95L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ch.E(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_l = null;
        field_n = null;
    }

    final static void a(byte param0) {
        int var1 = -28 % ((param0 - 28) / 55);
    }

    final static void a(byte param0, fn param1, int param2) {
        wj var7 = null;
        wj var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        try {
            var7 = ac.field_B;
            var8 = var7;
            var8.d((byte) -93, param2);
            var8.field_o = var8.field_o + 1;
            var4 = var8.field_o;
            if (param0 != -16) {
                field_l = (String) null;
            }
            var8.a(param0 ^ -10, 1);
            var8.i(param1.field_r, -102);
            var8.i(param1.field_s, -115);
            var8.i(param1.field_l, param0 + -105);
            var8.a((byte) 63, param1.field_i);
            var8.a((byte) 63, param1.field_n);
            var8.a((byte) 63, param1.field_m);
            var8.a((byte) 63, param1.field_k);
            var8.a(6, param1.field_p.length);
            for (var5 = 0; var5 < param1.field_p.length; var5++) {
                var7.a((byte) 63, param1.field_p[var5]);
            }
            var8.c((byte) -106, var4);
            var8.c(var8.field_o - var4, -1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ch.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ch(long param0, String param1) {
        try {
            this.field_o = param1;
            this.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ch.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Your raider snuck past trap and disarmed it.";
    }
}
