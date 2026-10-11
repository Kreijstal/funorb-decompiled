/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends ng {
    static int field_A;
    static long field_z;
    static String field_D;
    static char[] field_E;
    static String field_C;

    private ah(pk param0, int param1) {
        super(param0, param1);
    }

    ah(int param0) {
        this(qk.field_e, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Terraphoenix.field_V;
        try {
          l.d(param3, param4, 1 + param2, 10000536);
          l.d(param3, param4 + param0, 1 + param2, 12105912);
          var5_int = 1;
          if (var5_int + param4 < l.field_d) {
            var5_int = -param4 + l.field_d;
          }
          var6 = param0;
          if (var6 + param4 > l.field_c) {
            var6 = l.field_c - param4;
          }
          if (param1 != 128) {
            return;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 48 * var7 / param0 + 152;
            var9 = var8 | (var8 << 8 | var8 << 16);
            l.field_i[param3 + (param4 + var7) * l.field_k] = var9;
            l.field_i[param3 + (l.field_k * (param4 + var7) + param2)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var5), "ah.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ji var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Terraphoenix.field_V;
        try {
          if (param0 != 48) {
            field_E = (char[]) null;
          }
          var4 = (ji) (vc.field_d.d(9272));
          while (var4 != null) {
            nc.a(var4, 75, param1);
            var4 = (ji) (vc.field_d.e((byte) -119));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ah.A(" + param0 + ',' + param1 + ')');
        }
    }

    final String b(gl param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32032) {
            field_D = (String) null;
          }
          stackIn_3_0 = uh.a(0, param0.field_o.length(), '*');
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ah.T(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static mj a(String param0, int param1, int param2) {
        ql var3 = null;
        RuntimeException var3_ref = null;
        ql stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -23891) {
            field_D = (String) null;
          }
          var3 = new ql();
          ((mj) ((Object) var3)).field_d = param0;
          ((mj) ((Object) var3)).field_b = param1;
          stackIn_3_0 = var3;
          return (mj) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ah.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          String var2 = (String) null;
          ah.a((String) null, -18, -98);
          field_D = null;
          field_E = null;
          field_C = null;
          return;
        }
        field_D = null;
        field_E = null;
        field_C = null;
    }

    static {
        field_E = new char[128];
        field_C = "Soldier-A";
        field_D = "ACT II, Invasion";
    }
}
