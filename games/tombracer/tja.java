/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tja extends pb {
    static String field_p;
    static MouseWheelInput field_q;
    private Object field_o;

    public static void releaseStatics(boolean param0) {
        field_p = null;
        field_q = null;
        if (param0) {
          tja.releaseStatics(false);
        }
    }

    final boolean a(int param0) {
        if (param0 != 14646) {
          this.getValue(6);
          return false;
        }
        return false;
    }

    final Object getValue(int param0) {
        if (param0 != 29243) {
          this.getValue(77);
          return this.field_o;
        }
        return this.field_o;
    }

    tja(Object param0, int param1) {
        super(param1);
        try {
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "tja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_p = "+2 Loot Bags";
    }
}
