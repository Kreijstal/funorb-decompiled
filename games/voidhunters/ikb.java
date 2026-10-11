/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ikb extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new nc(frb.a(221, 113));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ikb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int[] param0, int[] param1, boolean param2) {
        try {
          StringBuilder discarded$0 = null;
          int var5 = 0;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$1 = null;
          int stackIn_6_0 = 0;
          int stackIn_10_0 = 0;
          int stackIn_33_0 = 0;
          RuntimeException stackIn_36_0 = null;
          StringBuilder stackIn_36_1 = null;
          String stackIn_37_2 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          RuntimeException decompiledCaughtException = null;
          int var3_int = 0;
          RuntimeException var3 = null;
          StringBuilder var4 = null;
          int var6 = 0;
          int var3_intLifetime1;
          var6 = VoidHunters.field_G;
          try {
            if (param0 == null) {
              stackIn_6_0 = (param1 == null) ? 0 : 1;
              var3_int = stackIn_6_0;
              if (var3_int != 0) {
                System.out.println("Before=" + param1 + ", after=" + param0);
              }
              stackIn_10_0 = var3_int;
              return stackIn_10_0 != 0;
            }
            if (param0 == param1) {
              System.out.println("Using duplicate array reference in debug diffs!");
              new Throwable().printStackTrace();
              return false;
            }
            if (param1 == null) {
              System.out.println("Before=" + param1 + ", after=" + param0);
              return true;
            }
            if (param1.length != param0.length) {
              System.out.println("Before length=" + param1.length + ", after length=" + param0.length);
              return true;
            }
            var3_intLifetime1 = param2 ? 1 : 0;
            var4 = new StringBuilder();
            discarded$0 = var4.append("{");
            for (var5 = 0; var5 < param0.length; var5++) {
              if (var5 > 0) {
                discarded$2 = var4.append(",");
              }
              if (param1[var5] == param0[var5]) {
                discarded$3 = var4.append("_");
              } else {
                discarded$4 = var4.append(param1[var5] + "->" + param0[var5]);
                var3_intLifetime1 = 1;
              }
            }
            discarded$1 = var4.append("}");
            if (var3_intLifetime1 != 0) {
              System.out.println(var4);
            }
            stackIn_33_0 = var3_intLifetime1;
            return stackIn_33_0 != 0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            stackIn_36_0 = var3;
            stackIn_36_1 = new StringBuilder().append("ikb.C(");
            if (param0 == null) {
              stackIn_37_2 = "null";
            } else {
              stackIn_37_2 = "{...}";
            }
            stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
            if (param1 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ikb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 221) {
          int[] var2 = (int[]) null;
          ikb.a((int[]) null, (int[]) null, false);
        }
    }

    final static void e(byte param0) {
        if (param0 > -116) {
          return;
        }
        if (null != hg.field_b) {
          hg.field_b.b(-85);
        }
    }

    static {
        field_o = "Open";
    }
}
