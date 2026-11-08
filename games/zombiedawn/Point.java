/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Point extends IntrusiveNode {
    int x;
    static IntrusiveDeque field_j;
    static String field_k;
    static sg field_i;
    int y;
    static jp field_m;

    final static boolean a(int param0) {
        if (param0 == -251) {
          return LevelNavigation.field_x > 250 ? true : false;
        }
        field_m = (jp) null;
        return LevelNavigation.field_x > 250 ? true : false;
    }

    public static void releaseStatics(byte param0) {
        if (param0 < -102) {
          field_j = null;
          field_i = null;
          field_m = null;
          field_k = null;
          return;
        }
        field_k = (String) null;
        field_j = null;
        field_i = null;
        field_m = null;
        field_k = null;
    }

    final Point copy(int param0) {
        if (param0 >= 36) {
          return new Point(this.x, this.y);
        }
        field_m = (jp) null;
        return new Point(this.x, this.y);
    }

    Point(int param0, int param1) {
        this.y = param1;
        this.x = param0;
    }

    final static oi a(int param0, byte[] param1) {
        oi var2 = null;
        RuntimeException var2_ref = null;
        oi stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          var2 = new oi(param1, sl.field_d, bo.field_o, bn.field_c, uf.field_n, vj.field_m);
          no.f((byte) -87);
          if (param0 != -16491) {
            Point.releaseStatics((byte) -90);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("kk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_j = new IntrusiveDeque();
        field_m = new jp(1);
    }
}
