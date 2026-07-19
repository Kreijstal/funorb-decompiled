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
        if (param0 >= -38) {
            return;
        }
        field_c = null;
        field_g = null;
    }

    public final void a(kh param0, byte param1) {
        try {
            param0.h((byte) 118);
            if (param1 != -19) {
                kh var4 = (kh) null;
                this.a((kh) null, (byte) 29);
            }
            this.field_h = param0.b((byte) 44, 4);
            this.field_f = param0.b((byte) 44, 8);
            this.field_e = param0.b((byte) 44, 8);
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dba.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        try {
            if ((gda.field_c ^ -1) == -12) {
                wja.d((byte) 96);
            }
            if (param1 < 84) {
                field_c = (String) null;
            }
            ala.a((byte) -30, ura.field_b, rca.field_l, cka.field_jc);
            fga.a(0, false, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dba.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, byte param1) {
        int var3 = 65 % ((param1 - 7) / 60);
        this.field_f = param0;
        if (!(-256 <= (this.field_f ^ -1))) {
            param0 = 255;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_7_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_14_0 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_3_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 < 83) {
          L0: {
            dba.a((byte) -61);
            if ((55 & param0) != 0) {
              stackOut_10_0 = oba.c(param2, param0, -19531);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = no.a(param0, param2, 36864);
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var3 = stackIn_11_0 ? 1 : 0;
            if (0 == (65536 & param2)) {
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = 1;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          return stackIn_14_0 != 0 | kaa.a(param0, param2, false) | var3 != 0;
        } else {
          L2: {
            if ((55 & param0) != 0) {
              stackOut_3_0 = oba.c(param2, param0, -19531);
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = no.a(param0, param2, 36864);
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var3 = stackIn_4_0 ? 1 : 0;
            if (0 == (65536 & param2)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          return stackIn_7_0 != 0 | kaa.a(param0, param2, false) | var3 != 0;
        }
    }

    public final void a(int param0, kh param1) {
        RuntimeException runtimeException = null;
        java.awt.Canvas var4 = null;
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
              param1.a((byte) 3, this.field_h, 4);
              param1.a((byte) -128, this.field_f, 8);
              param1.a((byte) -126, this.field_e, 8);
              param1.k(-1826190686);
              if (param0 == 200) {
                break L1;
              } else {
                var4 = (java.awt.Canvas) null;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dba.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3 = -59 / ((-1 - param1) / 35);
        this.field_h = param0;
    }

    public final String toString() {
        return "C2SSubmitSettingsPacket: graphics mode: " + this.field_h + " Sfx vol: " + this.field_f + " Music Vol: " + this.field_e;
    }

    final void a(int param0, int param1) {
        if (param1 != 2097152) {
            return;
        }
        this.field_e = param0;
        if (!((this.field_e ^ -1) >= -256)) {
            this.field_e = 255;
        }
    }

    static {
        field_a = 2097152;
        field_c = "<%0> might change the options - wait and see.";
        field_d = new ur(1);
        field_b = new int[]{67, 56, 192, 49, 176, 241, 88, 161, 83};
    }
}
