/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static String field_a;
    long key;
    static int field_e;
    static e[] field_g;
    IntrusiveNode previous;
    static Sprite field_b;
    static wa field_c;
    IntrusiveNode next;

    final void unlink(boolean param0) {
        if (null != this.previous) {
          this.previous.next = this.next;
          this.next.previous = this.previous;
          this.previous = null;
          this.next = null;
          if (!param0) {
            this.previous = (IntrusiveNode) null;
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
          ia.field_p[param5] = param6;
          ne.field_b[param5] = param0;
          bd.field_m[param5] = param1;
          il.field_q[param5] = param4;
          int var7_int = -98 / ((9 - param3) / 48);
          ea.field_d[param5] = param2;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "da.SB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isLinked(int param0) {
        if (param0 == 11163) {
          return null != this.previous ? true : false;
        }
        this.isLinked(-32);
        if (null == this.previous) {
          return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        field_b = null;
        if (param0 > -87) {
          field_b = (Sprite) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_g = new e[2];
        field_a = "Not yet achieved";
    }
}
