/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd implements fo {
    private int field_a;
    private ob field_e;
    private int field_b;
    static qr field_h;
    static String field_d;
    static wa field_g;
    private int field_f;
    private int field_c;

    public final l a(byte param0) throws jn {
        int var5 = 0;
        hs var3;
        ln[] var4_ref_ln__;
        int var4;
        ln var6;
        int var7;
        int var8;
        int var9;
        ln var10;
        int var11;
        l var12;
        int var8Lifetime1;
        int var9Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var12 = new l(pe.a((byte) 34, this.field_f), ls.a(this.field_c, 2), this.field_a, this.field_b);
        var3 = new hs(this.field_f, this.field_c, this.field_a, this.field_b, 1);
        var3.a(false, var12);
        var4_ref_ln__ = var12.field_e;
        for (var5 = 0; var5 < var4_ref_ln__.length; var5++) {
          var6 = var4_ref_ln__[var5];
          var7 = this.field_e.j(-117);
          for (var8 = 0; var7 > var8; var8++) {
            var9 = this.field_e.j(-93);
            var10 = var12.field_e[var9];
            var6.a((byte) -83, var10);
            var10.a((byte) -108, var6);
          }
          var8Lifetime1 = 0;
          while (var8Lifetime1 < 4) {
            var9Lifetime1 = this.field_e.j(-91);
            var6.field_G[var8Lifetime1] = we.a(15, var9Lifetime1);
            var8Lifetime1++;
            if (4 > var8Lifetime1) {
              var6.field_G[var8Lifetime1] = we.a(var9Lifetime1, 240) >> 4;
              var8Lifetime1++;
              continue;
            }
            break;
          }
          var6.field_x = this.field_e.f(-20976);
          if (0 != (32768 & var6.field_x)) {
            var6.field_u = true;
            var6.field_x = var6.field_x & 32767;
          }
          var6.field_B = this.field_e.j(-86);
          var6.field_L = var6.field_B >>> 6;
          var6.field_B = var6.field_B & 63;
        }
        var12.a(26253);
        var4 = 100 % ((-67 - param0) / 44);
        return var12;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -63) {
          rd.a(-45);
        }
        field_g = null;
        field_h = null;
    }

    rd(ob param0, int param1, int param2, int param3, int param4) {
        try {
          this.field_e = param0;
          this.field_a = param1;
          this.field_f = param2;
          this.field_b = param4;
          this.field_c = param3;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static qr a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, nq param8, int param9, int param10, int param11, int param12) {
        qr var13 = null;
        RuntimeException var13_ref = null;
        qr stackIn_2_0 = null;
        qr stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new qr(0L, (qr) null);
          var13.field_F = qp.a(param7, -114, param3);
          var13.field_lb = qp.a(param12, -79, param11);
          var13.field_vb = qp.a(param10, param5 ^ 28, param6);
          var13.field_sb = qp.a(param1, -102, param4);
          var13.field_wb = qp.a(param0, param5 - 213, param2);
          var13.field_nb = param8;
          if (param5 != 99) {
            stackIn_2_0 = (qr) null;
            return stackIn_2_0;
          }
          var13.field_x = param9;
          stackIn_4_0 = var13;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_7_0 = var13_ref;
          stackIn_7_1 = new StringBuilder().append("rd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    static {
        field_g = null;
    }
}
