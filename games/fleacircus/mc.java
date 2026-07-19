/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_b;
    static k[] field_c;
    static int field_a;

    public static void a(byte param0) {
        if (param0 <= 82) {
            mc.a((byte) 110);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(dd param0, String param1, int param2) {
        try {
            pa.field_k = param1;
            if (param2 != 0) {
                field_c = (k[]) null;
            }
            cd.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "mc.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean b(byte param0) {
        int var1 = 0;
        var1 = -121 % ((-69 - param0) / 40);
        if (-21 >= (ib.field_k ^ -1)) {
          if (nl.a(99)) {
            if (0 < nb.field_h) {
              if (lk.a(95)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static boolean a(int param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -124) {
          L0: {
            field_b = -97;
            if ((-param0 & param0) != param0) {
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
            if ((-param0 & param0) != param0) {
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

    static {
    }
}
