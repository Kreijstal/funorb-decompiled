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
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 55) {
            stackIn_2_0 = (pb[]) null;
            return stackIn_2_0;
          }
          if (tl.a(param2, (byte) -5, param1, param0)) {
            stackIn_7_0 = ma.a(false);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (pb[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("wb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = oe.a(param3, param4, param2, param5, param0, -1);
          var6 = var9;
          if (var9 == null) {
            return null;
          }
          var7 = new va();
          var7.field_d = var9;
          var7.field_d.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param4, param2);
          var7.addFocusListener(var7);
          var7.requestFocus();
          var8 = 120 % ((param1 - 78) / 48);
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("wb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 < -48) {
          field_f = null;
          field_i = null;
          field_e = null;
          field_h = null;
          field_a = null;
          return;
        }
        field_f = (oj) null;
        field_f = null;
        field_i = null;
        field_e = null;
        field_h = null;
        field_a = null;
    }

    static {
        field_f = new oj();
        field_g = new int[8192];
        field_d = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_i = "SCANNER";
        field_h = "Error connecting to server. Please try using a different server.";
    }
}
