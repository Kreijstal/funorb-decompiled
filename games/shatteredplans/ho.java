/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    static int field_b;
    static qr field_j;
    static nq field_f;
    static int field_c;
    static int field_a;
    static char field_h;
    static String field_g;
    static fs field_d;
    static byte[] field_i;
    static int[] field_e;

    final static void a(boolean param0, int param1) {
        if (null != bq.field_h) {
          gf.h(gf.field_i, gf.field_a, gf.field_l - gf.field_i, -gf.field_a + gf.field_f);
          bq.field_h.b(param0, -100);
          if (param1 != 8323199) {
            ho.a(-86);
            return;
          }
          return;
        }
        if (param1 == 8323199) {
          return;
        }
        ho.a(-86);
    }

    final static li a(int param0, int param1, String param2) {
        pa var3 = null;
        RuntimeException var3_ref = null;
        pa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -4276) {
            field_h = 'ￊ';
          }
          var3 = new pa();
          ((li) ((Object) var3)).field_a = param0;
          ((li) ((Object) var3)).field_f = param2;
          stackIn_3_0 = var3;
          return (li) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ho.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        if (param0 == 520) {
          field_i = null;
          field_g = null;
          field_j = null;
          field_d = null;
          return;
        }
        ho.a(false, 124);
        field_i = null;
        field_g = null;
        field_j = null;
        field_d = null;
    }

    static {
        field_b = 0;
        field_g = "Enemy Production";
        field_e = new int[]{16729156, 4521796, 7829503, 8323199, 16776960, 65535, 16776960, 8388479, 8355839};
        field_i = new byte[520];
    }
}
