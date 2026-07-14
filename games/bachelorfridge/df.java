/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends ii {
    static String field_s;
    static int field_r;
    int field_n;
    static String field_q;
    static int field_o;
    int field_p;
    boolean field_t;

    final void a(byte param0, lu param1) {
        int var3 = 0;
        var3 = ((df) this).field_n << 922195939 | ((df) this).field_p;
        if (param0 > -12) {
          L0: {
            field_o = -50;
            if (((df) this).field_t) {
              var3 = var3 | 128;
              break L0;
            } else {
              break L0;
            }
          }
          param1.d(var3, 0);
          return;
        } else {
          L1: {
            if (((df) this).field_t) {
              var3 = var3 | 128;
              break L1;
            } else {
              break L1;
            }
          }
          param1.d(var3, 0);
          return;
        }
    }

    df(int param0, nq param1, int param2, int param3, boolean param4) {
        super(2, param0, param1);
        ((df) this).field_p = param2;
        ((df) this).field_t = param4 ? true : false;
        ((df) this).field_n = param3;
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((df) this).a((op) null, false);
          return (at) (Object) new qf(param1, (df) this);
        } else {
          return (at) (Object) new qf(param1, (df) this);
        }
    }

    final static pp b(lu param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        if (param1 < 33) {
          var5 = null;
          pp discarded$2 = df.b((lu) null, -113);
          var2 = param0.b(16711935);
          var3 = param0.b(16711935);
          var4 = param0.b(16711935);
          return (pp) (Object) new bm(var2, var3, var4);
        } else {
          var2 = param0.b(16711935);
          var3 = param0.b(16711935);
          var4 = param0.b(16711935);
          return (pp) (Object) new bm(var2, var3, var4);
        }
    }

    final void a(op param0, boolean param1) {
        aga var3 = null;
        var3 = ((df) this).field_l.a(103, param0);
        var3.d(((df) this).field_k, (byte) -104);
        var3.a(param1, ((df) this).field_n, ((df) this).field_p);
        var3.field_s = ((df) this).field_p;
        if (hl.a((byte) 109, ((df) this).field_k)) {
          if (!var3.g((byte) 85)) {
            if (33 != var3.field_y) {
              if ((var3.field_y ^ -1) == -32) {
                return;
              } else {
                var3.b((byte) 123, 2);
                var3.field_C = var3.field_C - 1;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    df(lu param0) {
        super(2, param0);
        int var2 = param0.b(16711935);
        ((df) this).field_p = 7 & var2;
        ((df) this).field_n = 15 & var2 >> 888703523;
        ((df) this).field_t = -1 != (var2 & 128 ^ -1) ? true : false;
    }

    public static void c(int param0) {
        field_q = null;
        field_s = null;
        if (param0 != 15) {
            field_s = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_q = "This game option has not yet been unlocked for use.";
    }
}
