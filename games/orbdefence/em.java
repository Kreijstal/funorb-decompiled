/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends hi {
    static int[] field_s;
    private vi field_p;
    static int field_r;
    private vi field_n;
    static int field_o;
    static int field_q;

    final static void c(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var1_int = ul.field_f;
        int var2 = ul.field_l;
        for (var3 = -1 + var2 * var1_int; var3 >= 0; var3--) {
          var4 = ul.field_b[var3];
          var5 = 0;
          if ((var4 & 8388608) == 8388608) {
            var5 = var5 | var4 & 8323072;
          }
          if ((var4 & 32768) == 32768) {
            var5 = var5 | var4 & 32512;
          }
          if ((var4 & 128) == 128) {
            var5 = var5 | 127 & var4;
          }
          cg.field_d.field_v[var3] = var5 << 1;
        }
        li.field_a.d();
        if (param0 != 67) {
          return;
        }
        try {
          hm.a(cg.field_d.field_v, 3, param0 - 67, 3);
          cb.field_a.a(param0 ^ -101);
          li.field_a.e(0, 0, 640, 480, ef.field_k);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "em.V(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        if (n.b(param0)) {
          return;
        }
        if (pc.field_cb) {
          return;
        }
        if (null == oh.field_c) {
          oh.field_c = lg.a(4, false);
        }
        if (oh.field_c.field_g) {
          lb.field_g = lb.field_g | oh.field_c.field_i;
          dm.field_f = dm.field_f & ~oh.field_c.field_i;
          pc.field_cb = true;
          oh.field_c = null;
          return;
        }
    }

    final qd a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        qd stackIn_2_0 = null;
        qd stackIn_6_0 = null;
        qd stackIn_10_0 = null;
        qd stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -99) {
            stackIn_2_0 = (qd) null;
            return stackIn_2_0;
          }
          var3 = this.field_n.field_l.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_6_0 = vh.field_h;
            return stackIn_6_0;
          }
          if (!kk.a(var3, var4, -1)) {
            stackIn_10_0 = vh.field_h;
            return stackIn_10_0;
          }
          if (!this.b(param0, (byte) -36)) {
            return nc.field_bb;
          }
          stackIn_14_0 = vh.field_h;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("em.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_s = null;
        if (param0 != -15) {
          field_o = 125;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
          if (hi.field_k == 11) {
            md.c(32);
          }
          ih.a(tl.field_e, 0, q.field_b, mf.field_d);
          kg.a(0, (byte) -83, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "em.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    em(vi param0, vi param1, vi param2) {
        super(param0);
        try {
          this.field_n = param1;
          this.field_p = param2;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean b(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = this.field_p.field_l.toLowerCase();
          var4 = param0.toLowerCase();
          var5 = -2 % ((param1 - 37) / 51);
          if (var9.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var6 = var9.lastIndexOf("@");
            if (var6 >= 0 &&
              -1 + var9.length() > var6) {
              var7 = var9.substring(0, var6);
              var8 = var9.substring(var6 + 1);
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
              stackIn_12_0 = (var4.indexOf(var8) >= 0);
              return stackIn_12_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("em.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_n.field_l.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (param0 != -11300) {
            this.field_p = (vi) null;
          }
          var5 = var4;
          if (mm.a(var5, (byte) 51)) {
            stackIn_8_0 = sg.field_F;
            return stackIn_8_0;
          }
          if (md.a(-20767, var5)) {
            stackIn_11_0 = ec.field_H;
            return stackIn_11_0;
          }
          if (me.a(var5, (byte) -27)) {
            stackIn_15_0 = jc.field_n;
            return stackIn_15_0;
          }
          if (this.b(param1, (byte) -99)) {
            stackIn_19_0 = pl.field_f;
            return stackIn_19_0;
          }
          if (0 >= var6.length()) {
            stackIn_34_0 = vc.field_b;
            return stackIn_34_0;
          }
          if (df.a(var5, (byte) 126, var6)) {
            stackIn_23_0 = mf.field_a;
            return stackIn_23_0;
          }
          if (vh.a(false, var6, var5)) {
            stackIn_27_0 = am.field_f;
            return stackIn_27_0;
          }
          if (!l.a(122, var5, var6)) {
            stackIn_32_0 = sg.field_F;
            return stackIn_32_0;
          }
          stackIn_30_0 = mf.field_a;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("em.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        field_r = 0;
        field_s = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
          field_s[var0] = 256 * (var0 / 3) + (1 * (var0 / 2) + var0 * 65536);
        }
    }
}
