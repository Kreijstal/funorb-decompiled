/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends dk {
    static int[] field_C;
    static String field_A;
    static long field_B;

    private gh(String param0, de param1, qg param2) {
        super(param0, param1, param2);
        try {
          this.field_o = eh.field_j.field_p;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1) {
        rf var2 = null;
        int var3 = 0;
        hb var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = StarCannon.field_A;
        try {
          var4 = (hb) (hi.field_f.c(-3905));
          while (var4 != null) {
            hb.a(107, param1, var4);
            var4 = (hb) (hi.field_f.a(-16913));
          }
          var2 = sd.field_d.c(-3905);
          if (param0 >= -27) {
            field_A = (String) null;
          }
          while (var2 != null) {
            u.a(param1, 1);
            var2 = sd.field_d.a(-16913);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "gh.A(" + param0 + ',' + param1 + ')');
        }
    }

    gh(String param0, qg param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private gh(String param0, qg param1) {
        this(param0, eh.field_j.field_d, param1);
        try {
          this.field_o = eh.field_j.field_p;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 13329) {
          field_B = -72L;
          field_C = null;
          field_A = null;
          return;
        }
        field_C = null;
        field_A = null;
    }

    final static boolean f(int param0) {
        if (param0 != -23093) {
          gh.f(-117);
          return m.field_c;
        }
        return m.field_c;
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_z = !this.field_z ? true : false;
        super.a(param0, 93, param2, param3);
        if (param1 <= 59) {
          gh.e(116);
          return;
        }
    }

    static {
        field_A = "GFX - HIGH";
    }
}
