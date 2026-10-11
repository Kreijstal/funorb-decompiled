/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ek {
    static String[] field_b;
    static boolean field_c;
    static String[][] field_a;

    public static void a(byte param0) {
        field_a = (String[][]) null;
        field_b = null;
        if (param0 != 19) {
          ek.a((byte) 93);
        }
    }

    final int a(long param0, int param1) {
        long var4 = 0L;
        if (param1 <= -57) {
          var4 = this.a(0);
          if (0L < var4) {
            gf.a(var4, -10309);
          }
          return this.a(-1374, param0);
        }
        return 68;
    }

    abstract void a(boolean param0);

    final static ln[] a(int param0, bj param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 20839) {
            ek.a((byte) -67);
          }
          if (cn.a(param3, param2 ^ 20581, param0, param1)) {
            return aa.a(-113);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ek.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    abstract int a(int param0, long param1);

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        bj var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() >= nn.field_k &&
            param1.length() <= ah.field_h) {
            if (param0 < -56) {
              return false;
            }
            var3 = (bj) null;
            ek.a(107, (bj) null, -97, 126);
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ek.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    abstract long a(int param0);

    static {
        field_a = new String[][]{new String[]{"You can't breathe this horrible gas! Make sure you get to some fresh air before your oxygen bubble empties. Now, remember: gas rises, so you may be able to dig down to get out of this."}};
    }
}
