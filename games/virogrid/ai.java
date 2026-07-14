/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    static int field_f;
    boolean field_e;
    static int field_h;
    static java.applet.Applet field_a;
    static String field_i;
    String field_g;
    static float field_c;
    String field_d;
    static String field_b;

    final static void a(int param0, um param1, int[] param2, String param3, long param4, String param5, int param6, km param7, int param8) {
        if (param8 <= 43) {
          ai.b(false);
          wf.field_d = param1;
          md.field_e = new dj(param7, param4, param5, param3, param6, param0, param2);
          return;
        } else {
          wf.field_d = param1;
          md.field_e = new dj(param7, param4, param5, param3, param6, param0, param2);
          return;
        }
    }

    public static void b(boolean param0) {
        field_a = null;
        field_i = null;
        field_b = null;
        if (param0) {
            field_i = null;
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        qg var1_ref = null;
        var1 = null;
        if (param0) {
          var1_ref = (qg) (Object) jk.field_a.b(15);
          if (var1_ref == null) {
            throw new IllegalStateException();
          } else {
            df.a(var1_ref.field_p, var1_ref.field_q, var1_ref.field_v);
            df.a(var1_ref.field_o, var1_ref.field_k, var1_ref.field_t, var1_ref.field_i);
            var1_ref.field_p = null;
            sg.field_m.a((l) (Object) var1_ref, (byte) -84);
            return;
          }
        } else {
          ai.a(false);
          var1_ref = (qg) (Object) jk.field_a.b(15);
          if (var1_ref == null) {
            throw new IllegalStateException();
          } else {
            df.a(var1_ref.field_p, var1_ref.field_q, var1_ref.field_v);
            df.a(var1_ref.field_o, var1_ref.field_k, var1_ref.field_t, var1_ref.field_i);
            var1_ref.field_p = null;
            sg.field_m.a((l) (Object) var1_ref, (byte) -84);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Suggest muting this player";
        field_b = "Back";
    }
}
