/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wpb extends rqa {
    static java.awt.Color field_p;
    static String field_o;

    wpb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
          wpb.a(108, -55);
          field_p = null;
          return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oq.field_d = param0[0].a(66);
          if (param1 >= -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -50);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wpb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int[] param0, int[] param1, byte param2) {
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        try {
          if (param0 == param1) {
            return false;
          }
          if (param1 == null) {
            stackIn_9_0 = (param0 != null);
            return stackIn_9_0;
          }
          if (param0 == null) {
            return true;
          }
          if (param2 != 28) {
            return false;
          }
          if (param1.length != param0.length) {
            return true;
          }
          var3_int = 0;
          var4 = param1.length - 3;
          while (true) {
            if (var4 <= var3_int) {
              var4 += 3;
              while (true) {
                if (var4 <= var3_int) {
                  return false;
                }
                if (param0[var3_int] == param1[var3_int]) {
                  var3_int++;
                  continue;
                }
                break;
              }
              return true;
            }
            if (~param0[var3_int] != ~param1[var3_int]) {
              return true;
            }
            var3_int++;
            if (param1[var3_int] != param0[var3_int]) {
              return true;
            }
            var3_int++;
            if (param1[var3_int] != param0[var3_int]) {
              return true;
            }
            var3_int++;
            if (param0[var3_int] == param1[var3_int]) {
              var3_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_48_0 = var3;
          stackIn_48_1 = new StringBuilder().append("wpb.D(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param1 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param2).append(')').toString());
        }
    }

    final static asb a(int param0, int param1) {
        if (param1 != 11835) {
          field_o = (String) null;
          if (akb.field_a == null) {
            return -1 == param0 ? akb.field_a : mla.a(true, false, -52, true, param0, 1);
          }
          return akb.field_a;
        }
        if (akb.field_a != null) {
          return akb.field_a;
        }
        if (-1 != param0) {
          return mla.a(true, false, -52, true, param0, 1);
        }
        return akb.field_a;
    }

    static {
        field_o = "Accept rematch";
        field_p = new java.awt.Color(10040319);
    }
}
