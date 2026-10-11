/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class te {
    static un field_a;

    final static boolean a(byte param0, boolean param1) {
        long dupTemp$2 = 0L;
        if (vj.field_b == null) {
          vj.field_b = gf.field_b.a(fe.field_j, false, df.field_a);
        }
        if (vj.field_b.field_a == 0) {
          return false;
        }
        if (param0 != -19) {
          field_a = (un) null;
        }
        dupTemp$2 = lo.a((byte) -29);
        mp.field_p = dupTemp$2;
        wg.field_y = dupTemp$2;
        if (vj.field_b.field_a != 1) {
        }
        gj.field_k = tp.field_c;
        vj.field_b = null;
        return true;
    }

    abstract void b(int param0);

    abstract te b(byte param0);

    te() {
        String var2 = (String) null;
        um.a(0, (String) null, (byte) 120);
    }

    void a(int param0) {
        if (param0 != -1) {
          field_a = (un) null;
        }
    }

    final static void a(bh param0, int param1, String param2, byte param3, vc param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        try {
          var5_int = 0;
          var6 = -1;
          if (param3 != -95) {
            te.a((byte) -90);
          }
          for (var7 = 1; var7 < param2.length(); var7++) {
            var8 = param2.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) - (-param0.field_e[0] - param4.a(param2.substring(0, var7)));
            }
            if (-1 == var6) {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param0.field_e[var7] = (var5_int >> 8) - (-param0.field_e[0] - param4.a(param2.substring(0, var7 + 1))) - param4.a((char) var8);
            } else {
              param0.field_e[var7] = var6;
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("te.F(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 127 % ((param0 - 26) / 59);
        field_a = null;
    }

    static {
    }
}
