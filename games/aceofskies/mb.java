/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends he {
    static String[] field_t;
    static String field_s;
    static int field_q;
    static RenderSprite[] field_u;
    private java.lang.ref.SoftReference field_r;

    public static void g(int param0) {
        if (param0 == 255) {
          field_t = null;
          field_s = null;
          field_u = null;
          return;
        }
        field_u = (RenderSprite[]) null;
        field_t = null;
        field_s = null;
        field_u = null;
    }

    final static void a(int param0, int param1, byte param2) {
        ri.field_a = param1;
        if (param2 < 22) {
          mb.a(127, -101, (byte) 75);
          Aircraft.field_o = param0;
          return;
        }
        Aircraft.field_o = param0;
    }

    final Object a(byte param0) {
        if (param0 != 74) {
          mb.a(69, -77, (byte) 76);
          return this.field_r.get();
        }
        return this.field_r.get();
    }

    mb(Object param0, int param1) {
        super(param1);
        try {
          this.field_r = new java.lang.ref.SoftReference(param0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "mb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!bo.a((byte) 102)) {
            if (null != jf.field_a &&
              jf.field_a.field_b) {
              tt.b(-32546);
              hr.field_e.a(new oq(hr.field_e, ro.field_r), 0);
            }
            return;
          }
          hr.field_e.a(ik.field_l, true, qo.field_d, true);
          hr.field_e.f((byte) 33);
          if (param0 < 120) {
            return;
          }
          while (ek.a((byte) -127)) {
            hr.field_e.a(108, fr.field_e, bk.field_f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "mb.F(" + param0 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != 0) {
          return false;
        }
        return true;
    }

    static {
        field_t = new String[255];
        field_s = "Quit to website";
    }
}
