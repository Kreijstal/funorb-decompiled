/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ula {
    private int field_e;
    float field_i;
    float field_a;
    static String field_j;
    boolean field_d;
    static int field_f;
    int field_g;
    static kv field_h;
    jfa field_c;
    private int field_b;

    public static void a(int param0) {
        field_h = null;
        field_j = null;
    }

    final void a(byte param0) {
        L0: {
          if (((ula) this).field_d) {
            ((ula) this).field_a = ((ula) this).field_a + ((float)((ula) this).field_e - ((ula) this).field_a) * 0.1599999964237213f;
            ((ula) this).field_i = ((ula) this).field_i + 0.1599999964237213f * ((float)((ula) this).field_b - ((ula) this).field_i);
            break L0;
          } else {
            break L0;
          }
        }
        if (this.a(((ula) this).field_i, (float)((ula) this).field_b, (byte) 110)) {
          if (this.a(((ula) this).field_a, (float)((ula) this).field_e, (byte) 113)) {
            ((ula) this).field_d = false;
            ((ula) this).field_c.field_v.c(param0 ^ 118);
            if (param0 != 125) {
              ((ula) this).field_b = -90;
              return;
            } else {
              return;
            }
          } else {
            ((ula) this).field_c.field_v.c(param0 ^ 118);
            if (param0 != 125) {
              ((ula) this).field_b = -90;
              return;
            } else {
              return;
            }
          }
        } else {
          ((ula) this).field_c.field_v.c(param0 ^ 118);
          if (param0 != 125) {
            ((ula) this).field_b = -90;
            return;
          } else {
            return;
          }
        }
    }

    private final boolean a(float param0, float param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 < 88) {
          L0: {
            ((ula) this).b(101);
            if (2.0f <= Math.abs(-param1 + param0)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (2.0f <= Math.abs(-param1 + param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void b(int param0) {
        ((ula) this).field_c.field_v.a(false, false, 1600, 1600, 0, param0 ^ 17574, 256, -50 + (int)((ula) this).field_i, (int)((ula) this).field_a - 50);
        if (param0 != -17613) {
            boolean discarded$0 = this.a(0.9681364297866821f, -0.7274816632270813f, (byte) -55);
        }
    }

    final static void a(int param0, byte param1, String param2, int param3, boolean param4, long param5) {
        int var7_int = 0;
        try {
            sja.field_fb.c(param0, (byte) 110);
            sja.field_fb.field_g = sja.field_fb.field_g + 1;
            if (param1 != 75) {
                field_j = null;
            }
            var7_int = sja.field_fb.field_g;
            sja.field_fb.b(1686281208, param5);
            sja.field_fb.a((byte) -50, param2);
            sja.field_fb.d(param3, 0);
            sja.field_fb.d(!param4 ? 0 : 1, param1 + -75);
            sja.field_fb.b((byte) -127, sja.field_fb.field_g + -var7_int);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ula.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    ula(int param0, int param1, jfa param2, int param3, int param4) {
        try {
            ((ula) this).field_c = param2;
            ((ula) this).field_b = param0;
            ((ula) this).field_e = param1;
            ((ula) this).field_a = (float)param1;
            ((ula) this).field_g = param3;
            ((ula) this).field_i = (float)param0;
            ((ula) this).field_c.field_v.a((byte) 46, ((ula) this).field_c.field_g.field_o.field_b, 3);
            qm.a(5, 7758);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ula.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static boolean a(char param0, int param1) {
        if (48 > param0) {
            return false;
        }
        if (57 < param0) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Meat";
    }
}
