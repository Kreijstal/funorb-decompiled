/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static ml field_b;
    static jb[] field_d;
    static String field_c;
    static int field_a;
    static int field_e;

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -127) {
          return;
        }
        field_d = null;
        field_c = null;
    }

    abstract long c(int param0);

    abstract int a(long param0, boolean param1);

    abstract void b(int param0);

    final static boolean a(byte param0, ae param1, ae param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Torquing.field_u;
        try {
          var3_int = param1.field_kb - param2.field_kb;
          if (param1.field_jb == og.field_m) {
            var3_int -= 200;
          } else {
            if (param1.field_jb == null) {
              var3_int += 200;
            }
          }
          if (param0 <= 66) {
            ha.a(-19);
          }
          if (param2.field_jb != og.field_m) {
            if (null == param2.field_jb) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ha.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final int a(byte param0, long param1) {
        long var4 = this.c(20520);
        if (param0 >= -97) {
          return 126;
        }
        if (var4 > 0L) {
          ub.a(1976, var4);
        }
        return this.a(param1, true);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var11 = Torquing.field_u;
        try {
          var6_int = ln.a(qk.field_p, j.field_q, param4, 91);
          var7 = ln.a(qk.field_p, j.field_q, param5, 97);
          var8 = ln.a(qg.field_z, kn.field_e, param0, 81);
          var9 = ln.a(qg.field_z, kn.field_e, param3, 81);
          if (param2 > -45) {
            field_c = (String) null;
          }
          for (var10 = var6_int; var10 <= var7; var10++) {
            di.a(var8, (byte) -113, param1, qd.field_a[var10], var9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "ha.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_c = "Just play";
        field_a = -1;
        field_b = new ml();
    }
}
