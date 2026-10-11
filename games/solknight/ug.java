/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ug {
    static String field_d;
    static String field_e;
    static volatile int field_a;
    static int field_f;
    String field_c;
    static hd field_g;
    int field_b;

    final java.net.Socket a(int param0) throws IOException {
        int var2 = 75 / ((param0 - 58) / 57);
        return new java.net.Socket(this.field_c, this.field_b);
    }

    final static ud a(byte param0, sh param1, int param2) {
        RuntimeException var3 = null;
        sh var4 = null;
        ud stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -76) {
            var4 = (sh) null;
            ug.a((byte) -126, (sh) null, -3);
          }
          stackIn_3_0 = qb.a(true, qi.a(param1, 100, param2));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ug.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static o[] a(int param0, int param1, int param2, int param3, int param4) {
        o[] var6 = new o[9];
        o[] var5 = var6;
        o dupTemp$0 = ib.a(param2, true, param4);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        o dupTemp$1 = ib.a(param2, true, param3);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param1 != -8591) {
          return (o[]) null;
        }
        if (param0 == 0) {
          return var5;
        }
        var6[4] = ib.a(64, true, param0);
        return var5;
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        if (param0 == 100) {
          field_g = null;
          return;
        }
        hi var2 = (hi) null;
        ug.a((hi) null, 114, 25, 55, (byte) -101, (hi) null);
        field_g = null;
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(hi param0, int param1, int param2, int param3, byte param4, hi param5) {
        try {
          ai.field_a = param5;
          kb.field_d = param0;
          vg.field_N = param3;
          int var6_int = 57 % ((param4 - 32) / 62);
          bl.field_i = param2;
          g.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ug.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static ia a(String param0, int param1) {
        String var2 = null;
        ia var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ia stackIn_6_0 = null;
        ia stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          if (null == lc.field_m) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = jg.a(var6, -2);
          if (param1 < 103) {
            stackIn_6_0 = (ia) null;
            return stackIn_6_0;
          }
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (ia) (lc.field_m.a((long)var2.hashCode(), true));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_ib);
            var4 = jg.a(var7, -2);
            if (var4 == null) {
              var4 = var3.field_ib;
            }
            if (!var4.equals(var2)) {
              var3 = (ia) (lc.field_m.a((byte) -9));
              continue;
            }
            break;
          }
          stackIn_18_0 = var3;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("ug.N(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Unpacking sound effects";
        field_a = 0;
    }
}
