/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static String field_a;
    static int field_c;
    static RgbSprite field_e;
    static int field_b;
    static String field_f;
    static int[] field_d;

    final static boolean a(int param0, int param1, int param2) {
        if (ei.field_q == 13) {
          pm.a((byte) -126);
          return true;
        }
        int var3 = -28 / ((35 - param0) / 54);
        if (ei.field_q == 102) {
          jk.field_i.l(-128);
          return true;
        }
        if (jk.field_i == null) {
          return false;
        }
        if (jk.field_i.a(25542, param2, param1)) {
          return true;
        }
        return false;
    }

    final static int a(byte param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -107) {
            field_c = -102;
          }
          stackIn_3_0 = ok.a(0, param1, param2, (byte) 109);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ba.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        if (param0) {
          return;
        }
        field_f = null;
    }

    final static boolean a(byte param0) {
        if (param0 != -57) {
          field_e = (RgbSprite) null;
          return ve.a(ge.field_m, 1, 25);
        }
        return ve.a(ge.field_m, 1, 25);
    }

    final static void b(boolean param0) {
        if (param0) {
          ba.b(true);
          pa.a(12105, ti.field_m);
          return;
        }
        pa.a(12105, ti.field_m);
    }

    static {
        field_a = "Unpacking music";
        field_c = 0;
        field_f = null;
    }
}
