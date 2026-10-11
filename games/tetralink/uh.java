/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uh {
    static String field_d;
    static hl field_f;
    static hl field_e;
    static long[] field_c;
    static java.awt.Canvas field_b;
    static String field_a;

    final static oh[] a(int param0, int param1, ah param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        oh[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_e = (hl) null;
          }
          if (ia.a(param0, param2, param3, -60)) {
            stackIn_6_0 = gd.e((byte) 76);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (oh[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("uh.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0, long param1) {
        long var4 = 0L;
        long var4Lifetime1;
        if (param0 == -70) {
          var4 = this.b((byte) -58);
          if (0L < var4) {
            tb.a(false, var4);
          }
          return this.a(param1, (byte) 52);
        }
        field_c = (long[]) null;
        var4Lifetime1 = this.b((byte) -58);
        if (0L < var4Lifetime1) {
          tb.a(false, var4Lifetime1);
        }
        return this.a(param1, (byte) 52);
    }

    abstract void a(int param0);

    abstract long b(byte param0);

    final static hl b(int param0) {
        if (param0 != 32) {
          field_e = (hl) null;
          return wa.a(57);
        }
        return wa.a(57);
    }

    abstract int a(long param0, byte param1);

    public static void a(byte param0) {
        if (param0 == 41) {
          field_b = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_d = null;
          field_a = null;
          return;
        }
        uh.b(-116);
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_c = new long[32];
        field_d = "Show lobby chat from my friends";
        field_a = "Quit to website";
    }
}
