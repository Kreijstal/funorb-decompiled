/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    String field_a;
    String field_b;
    boolean field_e;
    static ph field_g;
    static tg[] field_c;
    static int field_d;
    static int[] field_f;

    final static ef a(int param0, java.awt.Component param1, int param2, byte param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          ef var5 = null;
          ib var5_ref = null;
          ef stackIn_2_0 = null;
          ef stackIn_4_0 = null;
          ib stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("gb");
              var5 = (ef) (var4.newInstance());
              if (param3 != 41) {
                stackIn_2_0 = (ef) null;
                return stackIn_2_0;
              }
              var5.a(param0, (byte) -102, param1, param2);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ib();
              ((ef) ((Object) var5_ref)).a(param0, (byte) -126, param1, param2);
              stackIn_6_0 = var5_ref;
              return (ef) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("w.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var3 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = Bounce.field_N;
        try {
          var2 = 70 % ((37 - param0) / 51);
          var1_int = ja.field_c[0];
          for (var3 = 1; ja.field_c.length > var3; var3++) {
            var4 = ja.field_c[var3];
            cb.a(lb.field_c, var3 << 4, lb.field_c, var1_int, var4);
            var1_int = var1_int + var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "w.C(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 == 62771140) {
          field_f = null;
          field_g = null;
          field_c = null;
          return;
        }
        field_d = -128;
        field_f = null;
        field_g = null;
        field_c = null;
    }

    static {
        field_g = new ph("usename");
    }
}
