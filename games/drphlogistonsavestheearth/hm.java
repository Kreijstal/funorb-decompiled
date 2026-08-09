/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    private uh field_b;
    private long field_c;
    private int field_a;
    private uh[] field_d;
    static boolean field_f;
    static od field_e;

    final uh b(int param0) {
        uh var3 = null;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_b == null) {
            return null;
        }
        uh var2 = this.field_d[(int)((long)(param0 + this.field_a) & this.field_c)];
        while (var2 != this.field_b) {
            if ((this.field_c ^ -1L) == (this.field_b.field_t ^ -1L)) {
                var3 = this.field_b;
                this.field_b = this.field_b.field_p;
                return var3;
            }
            this.field_b = this.field_b.field_p;
        }
        this.field_b = null;
        return null;
    }

    final static String a(int param0) {
        if (param0 != 22812) {
            return (String) null;
        }
        return pi.field_J;
    }

    final static void a(int param0, int param1, gk param2, int param3, int param4, rf param5, int param6, int param7, int param8, gk param9, int param10, gk param11, rf param12, int param13, boolean param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            fj.a(param7, param12, (byte) 114, param5);
            fa.a(param14, param1, param15, param20, param8);
            a.a(param0, param4, (byte) 103);
            la.a(param16, 2, param9, param17, param11, param18);
            ia.a(param2, 0, param13, param10);
            vd.a(param19, param6, param14, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var21);

            stackIn_4_1 = new StringBuilder().append("hm.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param12 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_5_0), stackIn_17_2 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
        }
    }

    hm(int param0) {
        int var2 = 0;
        uh dupTemp$0 = null;
        uh var3 = null;
        this.field_d = new uh[param0];
        this.field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new uh();
            var3 = dupTemp$0;
            this.field_d[var2] = dupTemp$0;
            var3.field_n = var3;
            var3.field_p = var3;
        }
    }

    final void a(long param0, int param1, uh param2) {
        uh var5 = null;
        try {
            if (!(param2.field_n == null)) {
                param2.f(64);
            }
            int var6 = 8 % ((70 - param1) / 48);
            var5 = this.field_d[(int)((long)(-1 + this.field_a) & param0)];
            param2.field_p = var5;
            param2.field_n = var5.field_n;
            param2.field_n.field_p = param2;
            param2.field_p.field_n = param2;
            param2.field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "hm.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 > -16) {
            hm.a(104);
        }
    }

    final uh a(long param0, int param1) {
        uh var6 = null;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_c = param0;
        uh var4 = this.field_d[(int)((long)(this.field_a + -1) & param0)];
        int var5 = -33 % ((26 - param1) / 45);
        this.field_b = var4.field_p;
        while (var4 != this.field_b) {
            if ((param0 ^ -1L) == (this.field_b.field_t ^ -1L)) {
                var6 = this.field_b;
                this.field_b = this.field_b.field_p;
                return var6;
            }
            this.field_b = this.field_b.field_p;
        }
        this.field_b = null;
        return null;
    }

    static {
        field_f = false;
    }
}
