/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku extends nl {
    static String[][] field_L;
    static volatile boolean field_I;
    static int field_K;
    static wk field_J;

    public static void k(int param0) {
        if (param0 <= 43) {
            return;
        }
        field_L = (String[][]) null;
        field_J = null;
    }

    final static sl j(int param0) {
        if (param0 > 78) {
          if (null == bu.field_b) {
            return null;
          } else {
            return bu.field_b;
          }
        } else {
          ku.k(-59);
          if (null == bu.field_b) {
            return null;
          } else {
            return bu.field_b;
          }
        }
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        wc var9 = null;
        try {
            super.a(param0, param1, param2, (byte) 42, param4, param5);
            int var8 = -111 % ((-58 - param3) / 53);
            var9 = bn.field_f;
            if (var9 != null && this.b(1, param5, param4, param2, param0)) {
                if (!(this.field_x instanceof ch)) {
                    if (!(var9.field_x instanceof ch)) {
                        return;
                    }
                    ((ch) ((Object) var9.field_x)).a(var9, -14486, (ku) (this));
                    bn.field_f = null;
                    return;
                }
                ((ch) ((Object) this.field_x)).a(var9, -14486, (ku) (this));
                bn.field_f = null;
                return;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ku.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0, boolean param1, um param2) {
        try {
            nm.a(param2, param1, 256, (byte) 41);
            if (param0 >= -28) {
                field_K = -125;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ku.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private ku(int param0, int param1, int param2, int param3, kh param4, qo param5, kb param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_E = param6;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ku.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = false;
        field_L = new String[][]{new String[]{"240", "180", "150", "120", "90", "60", "30"}, new String[]{"Small", "Medium", "Large", "Epic"}, new String[]{"Regular", "Double", "Triple", "Quadruple"}, new String[]{null, null, null, null, null}, new String[]{"Free For All", "Team Game"}, new String[]{"Off", "25", "75", "150", "No limit"}};
        field_J = new wk(224, 224);
    }
}
