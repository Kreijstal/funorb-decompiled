/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static boolean[] field_e;
    static qf field_f;
    static byte[][][] field_d;
    static ff field_b;
    static int field_c;
    static String field_a;

    final static pc a(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        pc stackIn_3_0 = null;
        pc stackIn_6_0 = null;
        pc stackIn_16_0 = null;
        pc stackIn_19_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var6 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = h.field_a;
            return stackIn_3_0;
          }
          if (var2_int > 63) {
            stackIn_6_0 = el.field_o;
            return stackIn_6_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (var4 == 45) {
              if (0 == var3 ||
                var3 == var2_int - 1) {
                stackIn_16_0 = si.field_C;
                return stackIn_16_0;
              }
            } else {
              if (cg.field_b.indexOf(var4) == -1) {
                stackIn_19_0 = si.field_C;
                return stackIn_19_0;
              }
            }
          }
          if (param0 > 102) {
            return null;
          }
          var6 = (String) null;
          rg.a((String) null, -120, -30);
          stackIn_24_0 = null;
          return (pc) (stackIn_24_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("rg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static ug a(String param0, int param1, int param2) {
        qk var3 = null;
        RuntimeException var3_ref = null;
        qk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new qk();
          ((ug) ((Object) var3)).field_b = param1;
          if (param2 != 2525) {
            rg.a(-91);
          }
          ((ug) ((Object) var3)).field_c = param0;
          stackIn_3_0 = var3;
          return (ug) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("rg.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(o[] param0, int param1) {
        try {
          int var2_int = 39 / ((param1 - 51) / 37);
          jb.field_d = param0;
          if (jb.field_d != null &&
            param0.length < 3) {
            throw new IllegalArgumentException("");
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "rg.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_d = (byte[][][]) null;
        if (param0 != -40) {
          field_a = (String) null;
        }
        field_a = null;
        field_f = null;
    }

    final static String a(int param0) {
        if (param0 != 0) {
          field_c = 11;
        }
        if (gf.field_Z == ma.field_o) {
          return te.field_K;
        }
        if (gb.field_i == gf.field_Z) {
          return uh.field_r;
        }
        if (!td.field_h.a(false)) {
          return uh.field_r;
        }
        return me.field_h;
    }

    static {
        field_f = new qf();
        field_b = new ff(8, 0, 4, 1);
        field_a = "Game over";
    }
}
