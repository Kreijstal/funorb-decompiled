/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends pa {
    static int field_D;

    final static int a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (4096 <= param1) {
            if (param1 < 6144) {
              stackIn_19_0 = -lo.field_q[-4096 + param1];
            } else {
              stackIn_19_0 = -lo.field_q[8192 - param1];
            }
            return stackIn_19_0;
          }
          if (param1 < 2048) {
            stackIn_15_0 = lo.field_q[param1];
          } else {
            stackIn_15_0 = lo.field_q[4096 - param1];
          }
          return stackIn_15_0;
        }
        rd.a(false, 94);
        param1 = param1 & 8191;
        if (4096 <= param1) {
          if (param1 < 6144) {
            stackIn_9_0 = -lo.field_q[-4096 + param1];
          } else {
            stackIn_9_0 = -lo.field_q[8192 - param1];
          }
          return stackIn_9_0;
        }
        if (param1 < 2048) {
          stackIn_5_0 = lo.field_q[param1];
        } else {
          stackIn_5_0 = lo.field_q[4096 - param1];
        }
        return stackIn_5_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        ij var7 = null;
        try {
          if (param1 < 1) {
            field_D = 107;
          }
          super.a(param0, 5, param2, param3, param4, param5);
          var7 = np.field_H;
          if (var7 != null &&
            this.b(param3, 21224, param4, param0, param2)) {
            if (this.field_v instanceof in) {
              ((in) (this.field_v)).a(-12156, this, var7);
              np.field_H = null;
              return;
            }
            if (var7.field_v instanceof in) {
              ((in) (var7.field_v)).a(-12156, this, var7);
              np.field_H = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "rd.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private rd(int param0, int param1, int param2, int param3, io param4, sk param5, ga param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_z = param6;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "rd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        f.field_b = (58 & param1) >> 4;
        c.field_c = (param1 & 13) >> 2;
        if (2 < f.field_b) {
          f.field_b = 2;
          if (!(2 >= c.field_c)) {
            c.field_c = 2;
          }
          gf.field_c = param1 & 3;
          if (param0 == 20348) {
            if (gf.field_c > 2) {
              gf.field_c = 2;
            }
            return;
          }
          return;
        }
        if (!(2 >= c.field_c)) {
          c.field_c = 2;
        }
        gf.field_c = param1 & 3;
        if (param0 == 20348) {
          if (gf.field_c > 2) {
            gf.field_c = 2;
          }
          return;
        }
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        field_D = 68;
    }
}
