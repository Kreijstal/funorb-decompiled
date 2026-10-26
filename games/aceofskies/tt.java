/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static String[][] field_d;
    static String field_b;
    static vd[] field_c;
    static boolean field_a;

    public static void a(int param0) {
        if (param0 != 20525) {
          return;
        }
        field_d = (String[][]) null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        ds var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 2048) {
            field_b = (String) null;
          }
          var4 = (ds) (cl.field_eb.first(268435455));
          while (var4 != null) {
            nn.a(var4, param0, (byte) 62);
            var4 = (ds) (cl.field_eb.next((byte) 103));
          }
          var2 = ep.field_z.first(268435455);
          while (var2 != null) {
            hn.a(0, param0);
            var2 = ep.field_z.next((byte) 103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "tt.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        if (null == jf.field_a) {
          return;
        }
        pg.a(jf.field_a, param0 ^ -32631);
        jf.field_a.a((byte) 87, pt.field_b);
        jf.field_a = null;
        if (null != aj.field_s) {
          aj.field_s.c(1);
          if (param0 != -32546) {
            field_c = (vd[]) null;
            ci.field_f.requestFocus();
            return;
          }
          ci.field_f.requestFocus();
          return;
        }
        if (param0 == -32546) {
          ci.field_f.requestFocus();
          return;
        }
        field_c = (vd[]) null;
        ci.field_f.requestFocus();
    }

    final static boolean a(int param0, boolean param1, int param2) {
        if (param1) {
          return 0 != (param0 & 2048) ? true : false;
        }
        field_d = (String[][]) null;
        return 0 != (param0 & 2048) ? true : false;
    }

    static {
        field_d = new String[][]{new String[]{"single_shot1", "single_shot2", "single_shot3", "single_shot4", "single_shot5"}, new String[]{"double_shot1", "double_shot2", "double_shot3", "double_shot4", "double_shot5"}, new String[]{"spreader_shot1", "spreader_shot2"}, new String[]{"gattling_loop1", "gattling_loop2", "gattling_loop3", "gattling_loop4"}, new String[]{"ufo_shot1", "ufo_shot2", "ufo_shot3", "ufo_shot4"}};
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_a = false;
    }
}
