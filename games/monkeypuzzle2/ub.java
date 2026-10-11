/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static String field_d;
    static int field_b;
    static String field_c;
    static boolean field_a;

    final static void a(int param0) {
        if (param0 != 250) {
          field_d = (String) null;
        }
    }

    final static ba a(byte param0, int param1, java.awt.Component param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          ba var5 = null;
          sl var5_ref = null;
          ba stackIn_3_0 = null;
          sl stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 >= -46) {
                ub.a(-125);
              }
              var4 = Class.forName("hg");
              var5 = (ba) (var4.newInstance());
              var5.a(param1, param2, param3, -103);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new sl();
              ((ba) ((Object) var5_ref)).a(param1, param2, param3, -119);
              stackIn_5_0 = var5_ref;
              return (ba) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("ub.D(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
          return uj.field_i > 250 ? true : false;
        }
        field_b = 104;
        return uj.field_i > 250 ? true : false;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        if (param0) {
          ub.b(true);
        }
    }

    static {
        field_d = "Play free version";
        field_c = "Name is available";
    }
}
