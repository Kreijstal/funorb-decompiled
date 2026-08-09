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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var6 = null;
              if ((param0.indexOf('@') ^ -1) == 0) {
                var8 = (CharSequence) ((Object) param0);
                var4_long = uk.b(117, var8);
                break L1;
              } else {
                var6 = param0;
                break L1;
              }
            }
            L2: {
              if (param1 >= 24) {
                break L2;
              } else {
                var7 = (String) null;
                bf.a((String) null, (byte) -101, true, (String) null);
                break L2;
              }
            }
            stackIn_6_0 = dk.a((String) (var6), var4_long, param2, param3, 103);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("bf.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
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
