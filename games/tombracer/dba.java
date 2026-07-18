/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dba implements bo {
    private int field_e;
    private int field_f;
    private int field_h;
    static jea field_g;
    static int field_a;
    static ur field_d;
    static String field_c;
    static int[] field_b;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_g = null;
    }

    public final void a(kh param0, byte param1) {
        try {
            param0.h((byte) 118);
            if (param1 != -19) {
                Object var4 = null;
                ((dba) this).a((kh) null, (byte) 29);
            }
            ((dba) this).field_h = param0.b((byte) 44, 4);
            ((dba) this).field_f = param0.b((byte) 44, 8);
            ((dba) this).field_e = param0.b((byte) 44, 8);
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dba.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        try {
            if (gda.field_c == 11) {
                wja.d((byte) 96);
            }
            if (param1 < 84) {
                field_c = null;
            }
            ala.a((byte) -30, ura.field_b, rca.field_l, cka.field_jc);
            fga.a(0, false, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dba.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, byte param1) {
        int var3 = 65 % ((param1 - 7) / 60);
        ((dba) this).field_f = param0;
        if (!(((dba) this).field_f <= 255)) {
            param0 = 255;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = (55 & param0) == 0 ? no.a(param0, param2, 36864) ? 1 : 0 : oba.c(param2, param0, -19531) ? 1 : 0;
        return (0 != (65536 & param2) ? true : false) | kaa.a(param0, param2, false) | var3 != 0;
    }

    public final void a(int param0, kh param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              param1.i(8);
              param1.a((byte) 3, ((dba) this).field_h, 4);
              param1.a((byte) -128, ((dba) this).field_f, 8);
              param1.a((byte) -126, ((dba) this).field_e, 8);
              param1.k(-1826190686);
              if (param0 == 200) {
                break L1;
              } else {
                var4 = null;
                dba.a((java.awt.Canvas) null, (byte) 16);
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
            stackOut_3_1 = new StringBuilder().append("dba.B(").append(param0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3 = -59 / ((-1 - param1) / 35);
        ((dba) this).field_h = param0;
    }

    public final String toString() {
        return "C2SSubmitSettingsPacket: graphics mode: " + ((dba) this).field_h + " Sfx vol: " + ((dba) this).field_f + " Music Vol: " + ((dba) this).field_e;
    }

    final void a(int param0, int param1) {
        if (param1 != 2097152) {
            return;
        }
        ((dba) this).field_e = param0;
        if (!(((dba) this).field_e <= 255)) {
            ((dba) this).field_e = 255;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 2097152;
        field_c = "<%0> might change the options - wait and see.";
        field_d = new ur(1);
        field_b = new int[]{67, 56, 192, 49, 176, 241, 88, 161, 83};
    }
}
