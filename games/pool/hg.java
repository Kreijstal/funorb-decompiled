/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static String field_b;
    static vh field_c;
    static int field_a;

    final static void a(String param0, boolean param1) {
        try {
          if (!param1) {
            hg.a(true);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "hg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        int var4Lifetime1;
        if (param0 == 0) {
          o.field_C.c(param1, param3);
          if (!param2) {
            return;
          }
          var4 = uf.field_X % o.field_C.field_z * 2;
          if (var4 >= o.field_C.field_z) {
            var4 = o.field_C.field_z + (-var4 + o.field_C.field_z);
          }
          if (10 > var4) {
            var4 = 10;
          } else {
            if (-40 + o.field_C.field_z < var4) {
              var4 = -40 + o.field_C.field_z;
            }
          }
          wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
          return;
        }
        field_b = (String) null;
        o.field_C.c(param1, param3);
        if (!param2) {
          return;
        }
        var4Lifetime1 = uf.field_X % o.field_C.field_z * 2;
        if (var4Lifetime1 >= o.field_C.field_z) {
          var4Lifetime1 = o.field_C.field_z + (-var4Lifetime1 + o.field_C.field_z);
        }
        if (10 > var4Lifetime1) {
          var4Lifetime1 = 10;
        } else {
          if (-40 + o.field_C.field_z < var4Lifetime1) {
            var4Lifetime1 = -40 + o.field_C.field_z;
          }
        }
        wf.a(-68, 80, 0, o.field_C, var4Lifetime1, 0, param1, 30, param3);
    }

    final static java.awt.Container a(boolean param0) {
        if (param0) {
          String var2 = (String) null;
          hg.a((String) null, true);
          if (null != op.field_e) {
            return (java.awt.Container) ((Object) op.field_e);
          }
          return (java.awt.Container) ((Object) hk.d(95));
        }
        if (null != op.field_e) {
          return (java.awt.Container) ((Object) op.field_e);
        }
        return (java.awt.Container) ((Object) hk.d(95));
    }

    public static void b(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
          field_c = (vh) null;
        }
    }

    static {
        field_b = "Try again";
    }
}
