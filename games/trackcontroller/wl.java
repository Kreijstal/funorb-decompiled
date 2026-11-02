/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends IntrusiveNode {
    static Archive field_l;
    byte[] field_k;
    static int field_j;
    static wj field_i;

    final static void a(long param0, boolean param1) {
        if (param1) {
          wl.d(78);
          if (0L >= param0) {
            return;
          }
          if (param0 % 10L != 0L) {
            Model.a(3, param0);
            return;
          }
          Model.a(3, -1L + param0);
          Model.a(3, 1L);
          return;
        }
        if (0L >= param0) {
          return;
        }
        if (param0 % 10L != 0L) {
          Model.a(3, param0);
          return;
        }
        Model.a(3, -1L + param0);
        Model.a(3, 1L);
    }

    wl(byte[] param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "wl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        int var1 = 11 % ((-39 - param0) / 40);
        field_i = null;
        field_l = null;
    }

    static {
        field_j = 5;
    }
}
