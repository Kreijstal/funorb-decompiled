/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static String field_a;
    static int field_e;
    static ll[] field_d;
    static String field_b;
    static sn field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 98) {
          return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void a(boolean param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ul.field_h = false;
          u.field_k = false;
          if (null != vf.field_k &&
            vf.field_k.field_G) {
            var3_int = 1;
            if (param1 == 8) {
              if (hk.field_s) {
                param2 = nj.field_f;
              } else {
                param2 = ul.field_v;
              }
              param1 = 2;
              wh.field_f.a(26152, ge.field_g);
            }
            if (10 == param1) {
              var3_int = 0;
              ma.h(-90);
            }
            if (var3_int != 0) {
              if (ul.field_h) {
                param2 = tj.a(114, new String[]{param2}, wa.field_Eb);
              }
              if (di.field_h) {
                param2 = si.field_n;
              }
              vf.field_k.a(true, param2, param1);
            }
            if (param1 != 256 &&
              param1 != 10 &&
              !hk.field_s) {
              wh.field_f.f(true);
            }
          }
          if (param0) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("oa.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    static {
        field_a = "Chat view has been scrolled up. Scroll down to chat.";
        field_e = 50;
        field_b = "Minimap";
    }
}
