/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends cr {
    int field_Kb;
    int field_Ib;
    cr field_Lb;
    static String field_ac;
    boolean field_Ob;
    boolean field_Yb;
    String field_Wb;
    cr field_Sb;
    cr field_Nb;
    String field_bc;
    int field_Ub;
    static String field_Vb;
    long field_Jb;
    static be field_Xb;
    cr field_Qb;
    boolean field_Zb;
    cr field_Tb;
    int field_Hb;
    int field_Mb;
    int field_Rb;
    long field_Pb;

    final boolean k(int param0) {
        if (param0 != 15) {
          this.field_Nb = (cr) null;
        }
        return !this.e(param0 - 109) ? true : false;
    }

    bs(String param0, String param1, long param2) {
        super(0L, (cr) null);
        CharSequence var6 = null;
        try {
          this.field_Wb = param1;
          this.field_Pb = param2;
          this.field_bc = param0;
          var6 = (CharSequence) ((Object) this.field_bc);
          rc.a(var6, 320);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "bs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var15Lifetime1;
        int var15Lifetime2;
        var17 = Vertigo2.field_L ? 1 : 0;
        try {
          var11 = pk.a((byte) -14, cj.field_D, param5, ua.field_e);
          var12 = pk.a((byte) -14, cj.field_D, param3, ua.field_e);
          var13 = pk.a((byte) -14, ib.field_a, param4, ap.field_e);
          var14 = pk.a((byte) -14, ib.field_a, param1, ap.field_e);
          if (param6 != 0) {
            return;
          }
          var7_int = pk.a((byte) -14, cj.field_D, param5 + param0, ua.field_e);
          var8 = pk.a((byte) -14, cj.field_D, param3 - param0, ua.field_e);
          for (var15 = var11; var15 < var7_int; var15++) {
            ki.a(-121, var13, vl.field_e[var15], var14, param2);
          }
          for (var15Lifetime1 = var12; var8 < var15Lifetime1; var15Lifetime1--) {
            ki.a(param6 - 126, var13, vl.field_e[var15Lifetime1], var14, param2);
          }
          var9 = pk.a((byte) -14, ib.field_a, param4 + param0, ap.field_e);
          var10 = pk.a((byte) -14, ib.field_a, -param0 + param1, ap.field_e);
          for (var15Lifetime2 = var7_int; var15Lifetime2 <= var8; var15Lifetime2++) {
            var21 = vl.field_e[var15Lifetime2];
            ki.a(param6 - 105, var13, var21, var9, param2);
            ki.a(-84, var10, var21, var14, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var7), "bs.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean a(bs param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_15_1 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_21_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.field_Tb = (cr) null;
          }
          stackIn_5_0 = (this.field_Ob) ? 0 : 1;
          if (param0.field_Ob) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            stackIn_11_0 = this.field_Ob;
            return stackIn_11_0;
          }
          stackIn_14_0 = param0.field_Yb;
          if (this.field_Yb) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if ((stackIn_14_0 ? 1 : 0) != stackIn_15_1) {
            stackIn_21_0 = !(this.field_Jb >= param0.field_Jb);
            return stackIn_21_0;
          }
          stackIn_17_0 = this.field_Yb;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("bs.G(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_Xb = null;
        if (param0 < 62) {
          bs.a((byte) 14);
        }
        field_Vb = null;
        field_ac = null;
    }

    final static void a(byte param0) {
        er var1 = null;
        er var2 = null;
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != -12) {
            bs.b((byte) 18);
          }
          var1 = new er(540, 140);
          lq.a(var1, (byte) -94);
          oo.c();
          bi.c();
          hm.field_F = 0;
          bq.h(-105);
          var2 = var1.c();
          for (var3 = 0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            bi.c(4, 4, 0, 0, 540, 140);
          }
          pl.field_h.d();
          var1.b(0, 0);
          ln.d(-28558);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "bs.D(" + param0 + ')');
        }
    }

    final static void a(r param0, int param1) {
        cr var3 = null;
        cr var4 = null;
        try {
          qr.field_q = tn.a("display_name_changed", param0, -99, "basic");
          h.field_D = new dm(0L, pb.field_b, we.field_J, nf.field_o);
          ao.field_O = new dm(0L, pb.field_b, sl.field_s, eq.field_B);
          wi.field_g = new cr(0L, (cr) null);
          el.field_a = new cr(0L, ee.field_b);
          el.field_a.field_O = 1;
          int var2_int = -113 % ((param1 - 32) / 50);
          jg.field_q = new cr(0L, db.field_t, kc.field_c);
          va.field_f = new cr(0L, sa.field_a, ho.field_i);
          hb.field_k = new cr(0L, ja.field_e);
          wi.field_g.b(el.field_a, 118);
          wi.field_g.b(jg.field_q, 127);
          wi.field_g.b(va.field_f, 127);
          wi.field_g.b(h.field_D, 118);
          wi.field_g.b(hb.field_k, 118);
          h.field_D.field_Lb.field_Lb.a(ee.field_b, -34);
          h.field_D.field_Lb.field_Lb.field_ab = 1;
          var3 = h.field_D.field_Lb.field_Lb;
          var3.field_O = 1;
          ao.field_O.field_Lb.field_Lb.a(ee.field_b, -114);
          var4 = ao.field_O.field_Lb.field_Lb;
          ao.field_O.field_Lb.field_Lb.field_ab = 1;
          var4.field_O = 1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "bs.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
          if (param0 != 1) {
            bs.a(6, (byte) -63, 124);
          }
          this.field_Wb = param1;
          this.field_bc = param2;
          var5 = (CharSequence) ((Object) this.field_bc);
          rc.a(var5, 320);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "bs.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        mi var3 = uh.field_Wb;
        var3.j(param0, param1 ^ -89);
        if (param1 != -47) {
          return;
        }
        var3.f(3, 105);
        var3.f(10, -114);
        var3.d(param2, param1 ^ 1752);
    }

    static {
        field_ac = "Reject";
        field_Vb = "Time watching:";
    }
}
