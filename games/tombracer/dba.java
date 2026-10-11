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
          if (gda.field_c == 11) {
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
        if (this.field_f > 255) {
          param0 = 255;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_14_0 = false;
        int var3;
        int var3Lifetime1;
        if (param1 >= 83) {
          if ((55 & param0) != 0) {
            stackIn_4_0 = oba.c(param2, param0, -19531);
          } else {
            stackIn_4_0 = no.a(param0, param2, 36864);
          }
          var3 = stackIn_4_0 ? 1 : 0;
          stackIn_7_0 = (0 != (65536 & param2));
          return stackIn_7_0 | kaa.a(param0, param2, false) | var3 != 0;
        }
        dba.a((byte) -61);
        if ((55 & param0) != 0) {
          stackIn_11_0 = oba.c(param2, param0, -19531);
        } else {
          stackIn_11_0 = no.a(param0, param2, 36864);
        }
        var3Lifetime1 = stackIn_11_0 ? 1 : 0;
        stackIn_14_0 = (0 != (65536 & param2));
        return stackIn_14_0 | kaa.a(param0, param2, false) | var3Lifetime1 != 0;
    }

    public final void a(int param0, kh param1) {
        try {
          param1.i(8);
          param1.a((byte) 3, this.field_h, 4);
          param1.a((byte) -128, this.field_f, 8);
          param1.a((byte) -126, this.field_e, 8);
          param1.k(-1826190686);
          if (param0 != 200) {
            java.awt.Canvas var4 = (java.awt.Canvas) null;
            dba.a((java.awt.Canvas) null, (byte) 16);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dba.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        if (this.field_e > 255) {
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
