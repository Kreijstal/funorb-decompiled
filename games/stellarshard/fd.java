/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends si {
    static int[] field_qb;
    static int field_nb;
    static boolean field_mb;
    int field_ob;
    String field_rb;
    String field_pb;

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = stellarshard.field_B;
        try {
          if (param0 < 75) {
            field_mb = false;
          }
          var3_int = 1;
          while (param1 > 1) {
            if ((1 & param1) != 0) {
              var3_int = var3_int * param2;
            }
            param1 = param1 >> 1;
            param2 = param2 * param2;
          }
          if (1 != param1) {
            stackIn_14_0 = var3_int;
            return stackIn_14_0;
          }
          stackIn_12_0 = var3_int * param2;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "fd.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    fd() {
        super(0L, (si) null);
    }

    public static void g(int param0) {
        field_qb = null;
        if (param0 != -30900) {
          field_qb = (int[]) null;
        }
    }

    final static boolean d(byte param0) {
        if (param0 != -21) {
          field_mb = false;
          return qh.field_g;
        }
        return qh.field_g;
    }

    static {
        field_qb = new int[25];
    }
}
