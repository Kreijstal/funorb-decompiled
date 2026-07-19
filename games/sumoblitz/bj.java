/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    private String field_f;
    static tg field_c;
    static jn field_b;
    static int field_a;
    private boolean field_e;
    static ri field_g;
    private boolean field_d;

    final boolean c(int param0) {
        String discarded$0 = null;
        if (param0 != -1) {
            discarded$0 = this.b(4);
            return this.field_e;
        }
        return this.field_e;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > -69) {
            return;
        }
        field_b = null;
        field_g = null;
    }

    final boolean a(boolean param0) {
        String discarded$0 = null;
        if (!param0) {
            discarded$0 = this.b(71);
            return this.field_d;
        }
        return this.field_d;
    }

    final String b(int param0) {
        if (param0 <= 16) {
            field_b = (jn) null;
            return this.field_f;
        }
        return this.field_f;
    }

    final void a(int param0, boolean param1) {
        this.field_e = param1 ? true : false;
        this.field_d = true;
        int var3 = 18 % ((param0 - 38) / 60);
    }

    final static boolean a(int param0, byte param1, int param2) {
        boolean discarded$7 = false;
        if (param1 == -113) {
          if ((param0 & 2048) != 0) {
            if (-1 == (55 & param2 ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$7 = bj.a(-103, (byte) 12, 126);
          if ((param0 & 2048) != 0) {
            if (-1 == (55 & param2 ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    bj(String param0) {
        this.field_e = false;
        this.field_d = false;
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "bj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 0;
        field_c = new tg();
    }
}
