/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static bb field_b;
    static ve field_f;
    static String field_c;
    static String field_e;
    static sb field_a;
    static jl field_d;

    final static void a(byte param0, int param1, sm param2) {
        pc var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = aa.field_f;
          var3.g(param1, 15514);
          var3.e(160, 2);
          var3.e(160, 0);
          var3.e(160, param2.field_p);
          if (param0 == -53) {
            return;
          }
          field_a = (sb) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("he.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_a = null;
          field_e = null;
          field_c = null;
          field_f = null;
          field_d = null;
          field_b = null;
          return;
        }
        field_b = (bb) null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_f = null;
        field_d = null;
        field_b = null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_e = (String) null;
          }
          in.a((java.awt.Component) ((Object) param1), 57);
          tj.a((byte) -128, (java.awt.Component) ((Object) param1));
          if (gp.field_Lb == null) {
            return;
          }
          gp.field_Lb.a((java.awt.Component) ((Object) param1), -97);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("he.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_e = "You can ask to join this game";
        field_c = "Final Score: ";
        field_b = new bb();
    }
}
