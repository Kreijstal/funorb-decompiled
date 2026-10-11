/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static RgbSprite[] field_f;
    static String field_a;
    static String field_e;
    static RgbSprite[] field_d;
    static dn field_h;
    static boolean field_g;
    static int field_c;
    static ml field_b;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 > 55) {
          field_f = null;
          field_h = null;
          field_e = null;
          field_a = null;
          return;
        }
        field_d = (RgbSprite[]) null;
        field_f = null;
        field_h = null;
        field_e = null;
        field_a = null;
    }

    final static void a(boolean param0, byte param1, int param2, tg param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        tg var6 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4_ref2 = null;
        try {
          if (ja.field_g != null) {
            fn.a(-26907, 1048576, param0, param2, param3);
          }
          if (null != q.field_f) {
            var4_ref2 = fc.field_a;
            synchronized (var4_ref2) {
              q.field_f.a(-1, (byte) 20, param2);
              if (ml.field_g == param3) {
                return;
              }
              q.field_f.c((byte) -98);
              fc.field_a.a();
              ml.field_g = param3;
              if (null != ml.field_g) {
                q.field_f.a(true, param0, ml.field_g);
              }
            }
          }
          if (param1 >= 65) {
            return;
          }
          var6 = (tg) null;
          jn.a(true, (byte) -9, -7, (tg) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("jn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_a = "Menu";
        field_e = "Warning: ";
        field_g = true;
        field_c = 480;
    }
}
