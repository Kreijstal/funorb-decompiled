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
        Object var4 = null;
        param0.h((byte) 118);
        if (param1 != -19) {
          var4 = null;
          ((dba) this).a((kh) null, (byte) 29);
          ((dba) this).field_h = param0.b((byte) 44, 4);
          ((dba) this).field_f = param0.b((byte) 44, 8);
          ((dba) this).field_e = param0.b((byte) 44, 8);
          param0.i((byte) 98);
          return;
        } else {
          ((dba) this).field_h = param0.b((byte) 44, 4);
          ((dba) this).field_f = param0.b((byte) 44, 8);
          ((dba) this).field_e = param0.b((byte) 44, 8);
          param0.i((byte) 98);
          return;
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        if ((gda.field_c ^ -1) != -12) {
          if (param1 < 84) {
            field_c = null;
            ala.a((byte) -30, ura.field_b, rca.field_l, cka.field_jc);
            fga.a(0, false, 0, param0);
            return;
          } else {
            ala.a((byte) -30, ura.field_b, rca.field_l, cka.field_jc);
            fga.a(0, false, 0, param0);
            return;
          }
        } else {
          wja.d((byte) 96);
          if (param1 >= 84) {
            ala.a((byte) -30, ura.field_b, rca.field_l, cka.field_jc);
            fga.a(0, false, 0, param0);
            return;
          } else {
            field_c = null;
            ala.a((byte) -30, ura.field_b, rca.field_l, cka.field_jc);
            fga.a(0, false, 0, param0);
            return;
          }
        }
    }

    final void b(int param0, byte param1) {
        int var3 = 65 % ((param1 - 7) / 60);
        ((dba) this).field_f = param0;
        if (!(-256 <= (((dba) this).field_f ^ -1))) {
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
        param1.i(8);
        param1.a((byte) 3, ((dba) this).field_h, 4);
        param1.a((byte) -128, ((dba) this).field_f, 8);
        param1.a((byte) -126, ((dba) this).field_e, 8);
        param1.k(-1826190686);
        if (param0 != 200) {
            Object var4 = null;
            dba.a((java.awt.Canvas) null, (byte) 16);
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
        if (!((((dba) this).field_e ^ -1) >= -256)) {
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
