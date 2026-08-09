/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static oj field_f;
    static int[] field_g;
    static char[] field_d;
    static String field_i;
    static String field_c;
    static String field_b;
    static int[] field_e;
    static java.security.SecureRandom field_a;
    static String field_h;

    final static pb[] a(int param0, int param1, pf param2, int param3) {
        RuntimeException var4 = null;
        pb[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        pb[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 55) {
              if (tl.a(param2, (byte) -5, param1, param0)) {
                stackIn_7_0 = ma.a(false);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (pb[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("wb.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (pb[]) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static va a(int param0, int param1, int param2, ej param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        va var7 = null;
        int var8 = 0;
        java.awt.Frame var9 = null;
        va stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = oe.a(param3, param4, param2, param5, param0, -1);
            var6 = var9;
            if (var9 != null) {
              var7 = new va();
              var7.field_d = var9;
              var7.field_d.add((java.awt.Component) ((Object) var7));
              var7.setBounds(0, 0, param4, param2);
              var7.addFocusListener(var7);
              var7.requestFocus();
              var8 = 120 % ((param1 - 78) / 48);
              stackIn_4_0 = (va) (var7);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6_ref);

            stackIn_7_1 = new StringBuilder().append("wb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 >= -48) {
          field_f = (oj) null;
          field_f = null;
          field_i = null;
          field_e = null;
          field_h = null;
          field_a = null;
          return;
        } else {
          field_f = null;
          field_i = null;
          field_e = null;
          field_h = null;
          field_a = null;
          return;
        }
    }

    static {
        field_f = new oj();
        field_g = new int[8192];
        field_d = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_i = "SCANNER";
        field_h = "Error connecting to server. Please try using a different server.";
    }
}
