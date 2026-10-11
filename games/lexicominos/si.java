/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class si extends ca {
    boolean field_p;
    static jb[] field_u;
    static int field_s;
    static String field_q;
    static hh field_t;
    volatile boolean field_v;
    boolean field_r;

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        kc var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          if (0 < param0) {
            var8 = new byte[param3];
            var4 = var8;
            for (var5_int = 0; var5_int < param3; var5_int++) {
              var8[var5_int] = param1[var5_int + param0];
            }
          } else {
            var4 = param1;
          }
          var5 = new kc();
          var5.a((byte) 119);
          if (param2 > -42) {
            si.e((byte) -111);
          }
          var5.a((long)(param3 * 8), var4, -24893);
          var6 = new byte[64];
          var5.a(0, false, var6);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("si.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void e(byte param0) {
        if (param0 < 5) {
          field_t = (hh) null;
        }
        kb.field_b.field_p = 0;
        kb.field_b.field_j = 0;
    }

    abstract int c(byte param0);

    abstract byte[] d(byte param0);

    final static int a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 111) {
            field_t = (hh) null;
          }
          stackIn_3_0 = ti.a(10, param1, 113, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("si.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void e(boolean param0) {
        if (param0) {
          field_q = (String) null;
        }
        field_q = null;
        field_t = null;
        field_u = null;
    }

    si() {
        this.field_v = true;
    }

    static {
        field_q = null;
    }
}
