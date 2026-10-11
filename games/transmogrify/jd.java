/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd extends IOException {
    static int field_a;
    static int field_b;

    final static mi a(byte[] param0, int param1, ii[] param2) {
        int var9 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        byte[][] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        byte[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[][] var21 = null;
        mi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          if (256 != param2.length) {
            throw new IllegalArgumentException();
          }
          var17 = new int[256];
          var12 = var17;
          var11 = var12;
          var3 = var11;
          var5 = -98 / ((-28 - param1) / 54);
          var18 = new int[256];
          var13 = var18;
          var4 = var13;
          var19 = new int[256];
          var14 = var19;
          var6 = var14;
          var20 = new int[256];
          var15 = var20;
          var7 = var15;
          var21 = new byte[256][];
          var16 = var21;
          var8 = var16;
          for (var9 = 0; var9 < 256; var9++) {
            var11[var9] = param2[var9].field_c;
            var4[var9] = param2[var9].field_b;
            var6[var9] = param2[var9].field_f;
            var7[var9] = param2[var9].field_g;
            var8[var9] = param2[var9].field_i;
          }
          stackIn_7_0 = new mi(param0, var17, var18, var19, var20, var21);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("jd.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1 = -128 / ((-25 - param0) / 47);
    }

    jd(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1, ti[] param2, int param3, int param4, int param5, kg param6, int param7, int param8, ti[] param9, boolean param10) {
        try {
          je.a(-11);
          if (param10) {
            field_a = -111;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "jd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ')');
        }
    }

    final static int a(int param0, hg param1, byte param2, String param3, int param4, boolean param5, hg param6) {
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        oa stackIn_13_0 = null;
        String stackIn_14_1 = null;
        oa stackIn_16_0 = null;
        String stackIn_17_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          var14 = param6.a(false);
          var8 = param1.a(false);
          if (param2 != -9) {
            stackIn_3_0 = -40;
            return stackIn_3_0;
          }
          if (null == nk.field_b &&
            !gk.a(false, 127)) {
            stackIn_7_0 = -1;
            return stackIn_7_0;
          }
          if (lj.field_z == jk.field_y) {
            ch.field_f = null;
            ff.field_D.field_h = 0;
            if (param3 != null) {
              var9 = 0;
              if (param5) {
                var9 = var9 | 1;
              }
              d.field_d.field_h = 0;
              d.field_d.a(param2 - 94, d.field_c.nextInt());
              d.field_d.a(param2 ^ 110, d.field_c.nextInt());
              d.field_d.a(var14, 123);
              d.field_d.a(var8, 125);
              var15 = (CharSequence) ((Object) param3);
              d.field_d.a(ob.a((byte) 107, var15), param2 ^ -120);
              d.field_d.c(param4, -159688920);
              d.field_d.f(6389, param0);
              d.field_d.f(6389, var9);
              ff.field_D.f(6389, 18);
              ff.field_D.field_h = ff.field_D.field_h + 2;
              var10 = ff.field_D.field_h;
              var11_ref_String = wk.a(ha.b(116), (byte) -45);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              ff.field_D.a(92, var11_ref_String);
              bj.a(kb.field_p, q.field_f, ff.field_D, (byte) -123, d.field_d);
              ff.field_D.b(-109, ff.field_D.field_h - var10);
            } else {
              d.field_d.field_h = 0;
              d.field_d.a(param2 - 96, d.field_c.nextInt());
              d.field_d.a(-103, d.field_c.nextInt());
              stackIn_13_0 = d.field_d;
              if (param6.a((byte) -121)) {
                stackIn_14_1 = var14;
              } else {
                stackIn_14_1 = "";
              }
              ((oa) (Object) stackIn_13_0).a(stackIn_14_1, 126);
              stackIn_16_0 = d.field_d;
              if (param1.a((byte) -121)) {
                stackIn_17_1 = var8;
              } else {
                stackIn_17_1 = "";
              }
              ((oa) (Object) stackIn_16_0).a(stackIn_17_1, param2 ^ -117);
              ff.field_D.f(6389, 16);
              ff.field_D.field_h = ff.field_D.field_h + 1;
              var9 = ff.field_D.field_h;
              bj.a(kb.field_p, q.field_f, ff.field_D, (byte) -108, d.field_d);
              ff.field_D.a((byte) -42, -var9 + ff.field_D.field_h);
            }
            rb.a(-1, -377);
            lj.field_z = vf.field_b;
          }
          if (vf.field_b == lj.field_z &&
            ue.a(1, 0)) {
            var9Lifetime1 = nf.field_l.d((byte) 97);
            nf.field_l.field_h = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              lj.field_z = aa.field_b;
              wh.field_F = new String[var9Lifetime1 - 100];
            } else {
              if (var9Lifetime1 == 248) {
                tb.a(ha.b(param2 ^ -66), true);
                Transmogrify.field_B = nj.field_j;
                pc.a(1);
                ej.field_k = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (99 != var9Lifetime1) {
                lj.field_z = gg.field_f;
                tg.field_a = -1;
                ca.field_e = var9Lifetime1;
              } else {
                ue.a(jk.a((byte) -114), 0);
                ch.field_f = new Boolean(oh.a((byte) -87, nf.field_l));
                nf.field_l.field_h = 0;
              }
            }
          }
          if (aa.field_b == lj.field_z) {
            var9Lifetime2 = 2;
            if (ue.a(var9Lifetime2, 0)) {
              var10Lifetime1 = nf.field_l.a((byte) -102);
              nf.field_l.field_h = 0;
              if (ue.a(var10Lifetime1, 0)) {
                var11 = wh.field_F.length;
                for (var12 = 0; var11 > var12; var12++) {
                  wh.field_F[var12] = nf.field_l.e(26);
                }
                pc.a(1);
                ej.field_k = false;
                stackIn_45_0 = var11 + 100;
                return stackIn_45_0;
              }
            }
          }
          if (gg.field_f == lj.field_z &&
            ce.a(0)) {
            if (ca.field_e == 255) {
              var9_ref_String = nf.field_l.j(-1640531527);
              if (var9_ref_String != null) {
                v.a(0, var9_ref_String, ha.b(114));
              }
            } else {
              Transmogrify.field_B = nf.field_l.g(param2 + 12257);
            }
            pc.a(1);
            ej.field_k = false;
            stackIn_55_0 = ca.field_e;
            return stackIn_55_0;
          }
          if (null == nk.field_b) {
            if (ej.field_k) {
              if (mc.b(true) <= 30000L) {
                Transmogrify.field_B = bd.field_s;
              } else {
                Transmogrify.field_B = ng.field_h;
              }
              ej.field_k = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9Lifetime3 = lf.field_c;
            lf.field_c = kf.field_p;
            kf.field_p = var9Lifetime3;
            ej.field_k = true;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    static {
    }
}
