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
        field_L = null;
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
        int var8 = 0;
        wc var9 = null;
        this.a(param0, param1, param2, (byte) 42, param4, param5);
        var8 = -111 % ((-58 - param3) / 53);
        var9 = bn.field_f;
        if (var9 != null) {
          if (((ku) this).b(1, param5, param4, param2, param0)) {
            if (!(((ku) this).field_x instanceof ch)) {
              if (!(var9.field_x instanceof ch)) {
                return;
              } else {
                ((ch) (Object) var9.field_x).a(var9, -14486, (ku) this);
                bn.field_f = null;
                return;
              }
            } else {
              ((ch) (Object) ((ku) this).field_x).a(var9, -14486, (ku) this);
              bn.field_f = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, boolean param1, um param2) {
        nm.a(param2, param1, 256, (byte) 41);
        if (param0 >= -28) {
            field_K = -125;
        }
    }

    private ku(int param0, int param1, int param2, int param3, kh param4, qo param5, kb param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((ku) this).field_E = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = false;
        field_L = new String[][]{new String[7], new String[4], new String[4], new String[5], new String[2], new String[5]};
        field_J = new wk(224, 224);
    }
}
