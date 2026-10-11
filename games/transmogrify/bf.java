/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends lj {
    static pe field_C;
    static int field_B;

    private bf(String param0, ui param1, ma param2) {
        super(param0, param1, param2);
        try {
          this.field_q = vi.field_e.field_b;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        this.field_y = !this.field_y ? true : false;
        int var5 = 87 % ((param0 - 50) / 45);
        super.a((byte) -126, param1, param2, param3);
    }

    final static kk a(String param0, byte param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        kk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param0.indexOf('@') == -1) {
            var8 = (CharSequence) ((Object) param0);
            var4_long = uk.b(117, var8);
          } else {
            var6 = param0;
          }
          if (param1 < 24) {
            var7 = (String) null;
            bf.a((String) null, (byte) -101, true, (String) null);
          }
          stackIn_6_0 = dk.a((String) (var6), var4_long, param2, param3, 103);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("bf.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private bf(String param0, ma param1) {
        this(param0, vi.field_e.field_d, param1);
        try {
          this.field_q = vi.field_e.field_b;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_C = null;
        if (param0 != 16) {
          bf.a((byte) 39);
        }
    }

    bf(String param0, ma param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_y = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_B = 0;
    }
}
