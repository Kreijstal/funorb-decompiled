/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ab extends l {
    boolean field_u;
    static String field_t;
    static int[] field_r;
    volatile boolean field_s;
    boolean field_q;

    final static void a(int param0, int param1, int param2, int param3, int param4, km[] param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        var11 = Chess.field_G;
        try {
          if (param5 != null &&
            param1 > 0) {
            var6_int = param5[0].field_v;
            var7 = param5[2].field_v;
            if (param4 >= -82) {
              var12 = (String) null;
              ab.a(13, -74, (String) null);
            }
            var8 = param5[1].field_v;
            param5[0].e(param2, param3, param0);
            param5[2].e(param1 + (param2 - var7), param3, param0);
            wb.b(o.field_d);
            wb.e(param2 + var6_int, param3, -var7 + (param1 + param2), param3 + param5[1].field_u);
            var9 = param2 + var6_int;
            var10 = -var7 + (param1 + param2);
            for (param2 = var9; var10 > param2; param2 = param2 + var8) {
              param5[1].e(param2, param3, param0);
            }
            wb.a(o.field_d);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ab.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    abstract int f(int param0);

    public static void g(int param0) {
        field_r = null;
        int var1 = -110 / ((param0 + 27) / 41);
        field_t = null;
    }

    abstract byte[] a(boolean param0);

    final static String a(int param0, int param1, String param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        ve var7 = null;
        ve var8 = null;
        nk var9 = null;
        CharSequence var10 = null;
        var6 = Chess.field_G;
        try {
          var10 = (CharSequence) ((Object) param2);
          if (!ed.a(var10, 21257)) {
            stackIn_3_0 = qj.field_a;
            return stackIn_3_0;
          }
          if (ld.field_g != 2) {
            stackIn_6_0 = ik.field_b;
            return stackIn_6_0;
          }
          var8 = mn.a(-1, param2);
          if (param1 != 21250) {
            ab.h(3);
          }
          if (var8 == null) {
            stackIn_11_0 = oc.a(kj.field_f, new String[]{param2}, (byte) -114);
            return stackIn_11_0;
          }
          me.field_e.b(var8, (byte) 123);
          while (true) {
            var7 = (ve) (me.field_e.a((byte) -110));
            if (var7 != null) {
              var7.field_Ib = var7.field_Ib - 1;
              continue;
            }
            break;
          }
          var8.c(-2193);
          var8.d(-1);
          wg.field_w = wg.field_w - 1;
          var9 = qn.field_U;
          var9.f(param0, -104);
          var9.field_l = var9.field_l + 1;
          var5 = var9.field_l;
          var9.c(1, (byte) 66);
          var9.a(param1 - 21360, param2);
          var9.a(var9.field_l - var5, -1);
          stackIn_16_0 = null;
          return (String) (stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("ab.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        l var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        l var1Lifetime1;
        var2 = Chess.field_G;
        try {
          f.field_a = null;
          wc.field_v = 0;
          wg.field_w = 0;
          me.field_e.e(-31023);
          cl.field_e.e(-31023);
          var1 = bf.field_M.a(false);
          while (var1 != null) {
            var1.d(-1);
            var1 = bf.field_M.a(0);
          }
          var1Lifetime1 = r.field_Ib.a(false);
          while (var1Lifetime1 != null) {
            var1Lifetime1.d(-1);
            var1Lifetime1 = r.field_Ib.a(0);
          }
          ld.field_g = 0;
          if (param0 < -40) {
            return;
          }
          field_t = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1_ref), "ab.G(" + param0 + ')');
        }
    }

    final static void h(int param0) {
        fm.field_R = new String[38];
        fm.field_R[16] = cn.field_a;
        fm.field_R[17] = aa.field_a;
        fm.field_R[7] = jg.field_L;
        fm.field_R[27] = ec.field_g;
        fm.field_R[15] = qa.field_b;
        fm.field_R[20] = sh.field_c;
        fm.field_R[28] = se.field_Z;
        fm.field_R[6] = jg.field_L;
        fm.field_R[34] = ca.field_e;
        fm.field_R[33] = qm.field_a;
        fm.field_R[13] = rc.field_b;
        fm.field_R[21] = ec.field_g;
        fm.field_R[30] = ma.field_H;
        fm.field_R[32] = hj.field_k;
        fm.field_R[3] = vm.field_g;
        fm.field_R[18] = dh.field_h;
        fm.field_R[29] = wf.field_P;
        fm.field_R[22] = se.field_Z;
        fm.field_R[8] = hm.field_f;
        fm.field_R[24] = ma.field_H;
        fm.field_R[14] = ao.field_c;
        fm.field_R[0] = jf.field_e;
        fm.field_R[11] = kl.field_f;
        fm.field_R[23] = wf.field_P;
        fm.field_R[31] = ue.field_b;
        fm.field_R[19] = ti.field_a;
        fm.field_R[26] = fc.field_c;
        fm.field_R[37] = r.field_Zb;
        fm.field_R[2] = tc.field_y;
        fm.field_R[9] = gl.field_a;
        fm.field_R[param0] = ij.field_d;
        fm.field_R[10] = oh.field_d;
        fm.field_R[5] = vc.field_c;
        fm.field_R[25] = ac.field_p;
        fm.field_R[1] = qa.field_a;
        ec.field_d = new eb(0, 0, 120, 24, fm.field_R[9]);
        qh.field_b = new eb(0, 0, 120, 24, ef.field_l);
    }

    ab() {
        this.field_s = true;
    }

    static {
        field_r = new int[8192];
        field_t = "This password contains your Player Name, and would be easy to guess";
    }
}
