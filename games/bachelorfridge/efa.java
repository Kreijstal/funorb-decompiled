/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class efa extends td {
    static boolean field_p;

    final static sna c(boolean param0) {
        if (!param0) {
          efa.c(false);
        }
        return ok.f((byte) -15);
    }

    final static void a(int param0, int param1, int param2, boolean param3, ht param4, int param5, java.awt.Component param6, jp param7) {
        try {
          pb.a(param0, param3, 10);
          lc.field_l = pb.a(param4, param6, 0, param1);
          nia.field_m = pb.a(param4, param6, 1, param2);
          saa.field_a = new hn();
          ud.field_p = 1000 * param2 / param0;
          nia.field_m.a(saa.field_a);
          uf.field_c = param7;
          uf.field_c.a(23679, bs.field_k);
          lc.field_l.a(uf.field_c);
          if (param5 != 19299) {
            field_p = true;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "efa.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(CharSequence param0, boolean param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var2_int = param0.length();
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = -var3 + (var3 << 5) + aca.a(param0.charAt(var4), 8220);
          }
          if (!param1) {
            field_p = true;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("efa.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    efa(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_k = param2;
          this.field_n = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "efa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        u var4 = null;
        ii stackIn_2_0 = null;
        u stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_h.a(107, param0);
          var4 = new u(this.field_g, new nq(var3));
          var4.field_q = this.field_n;
          var4.field_r = this.field_k;
          if (param1 == 3) {
            stackIn_4_0 = var4;
            return (ii) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (ii) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("efa.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
