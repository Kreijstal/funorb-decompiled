/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    private ci[] field_a;
    static String field_b;
    static String field_c;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        jl.a(this.field_a, param2, param4, param0, (byte) -123, param1);
        if (param3 != 0) {
          this.a(104, -42, -62, 0, 118);
        }
    }

    final static void a(int param0) {
        vj.a(-24517);
        int var1 = -35 / ((-83 - param0) / 35);
        bm.a(4, (byte) 1);
    }

    final static void a(int param0, byte param1) {
        if (param1 != 1) {
          bm.a(0, (byte) -88);
          ga.field_c = param0;
          return;
        }
        ga.field_c = param0;
    }

    final static void a(int param0, int param1, byte param2) {
        l.e(param1, param0, 16, 0);
        if (param2 >= 126) {
          l.e(param1, param0, 12, 16777215);
          l.e(param1, param0, 8, 0);
          return;
        }
    }

    final static dc a(boolean param0, int param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        uc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        uc var8 = null;
        mb var9 = null;
        var7 = Terraphoenix.field_V;
        var8 = mk.field_j;
        var2 = var8;
        var3 = var8.a(-16384);
        if (param1 != 0) {
          field_c = (String) null;
        }
        im.field_c = 127 & var3;
        stackIn_5_0 = ((128 & var3) != 0);
        ng.field_s = stackIn_5_0;
        da.field_d = var8.a(-16384);
        pl.field_Q = var8.h((byte) 78);
        if (im.field_c != 2) {
          ji.field_k = 0;
          wb.field_c = 0;
        } else {
          wb.field_c = var8.i(-25578);
          ji.field_k = var8.d((byte) -114);
        }
        stackIn_11_0 = (var8.a(-16384) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        ge.field_c = var8.e(-1);
        if (var4 != 0) {
          wh.field_a = var8.e(-1);
        } else {
          wh.field_a = ge.field_c;
        }
        if (im.field_c == 1) {
          var8.i(-25578);
          var8.e(-1);
        } else {
          if (im.field_c == 4) {
            var8.i(-25578);
            var8.e(-1);
          }
        }
        if (!param0) {
          ea.field_n = ui.a(80, var8, param1 ^ -48);
          ui.field_e = null;
          return new dc(param0);
        }
        var5 = var8.i(-25578);
        try {
          var9 = fl.field_c.a(true, var5);
          ea.field_n = var9.a(false);
          if (!wh.field_a.equals(kj.field_f)) {
            stackIn_24_0 = var9.field_r;
          } else {
            stackIn_24_0 = null;
          }
          ui.field_e = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          bd.a((Throwable) ((Object) var6), "CC1", -77);
          ui.field_e = null;
          ea.field_n = null;
          return new dc(param0);
        }
        return new dc(param0);
    }

    bm(ci[] param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static fb a(int param0, int param1, int[] param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        fb var9 = null;
        RuntimeException var9_ref = null;
        fb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 74) {
            field_b = (String) null;
          }
          var9 = new fb(param1, param5, param0, param6, param8, param7, param2);
          hd.field_p.a(var9, -16611);
          mh.a(var9, param3, 0);
          stackIn_3_0 = var9;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_6_0 = var9_ref;
          stackIn_6_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 <= 68) {
          bm.a(36, -120, (byte) -40);
          field_b = null;
          field_c = null;
          return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_b = "Left click to collect objective";
        field_c = "    Impassable Terrain";
    }
}
