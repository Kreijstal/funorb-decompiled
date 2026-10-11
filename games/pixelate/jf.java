/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static tf field_a;
    static String field_b;
    static mj field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != -31476) {
          field_a = (tf) null;
        }
    }

    final static boolean a(boolean param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        ug var4_ref_ug = null;
        int var4 = 0;
        ug var5 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (Pixelate.field_G != uk.field_s) {
            return false;
          }
          if (!param0) {
            field_c = (mj) null;
          }
          var2_long = hm.a(64);
          if (0 != ij.field_s &&
            0 > ao.field_c) {
            var4_ref_ug = (ug) (id.field_d.c(1504642273));
            if (var4_ref_ug != null &&
              var2_long > var4_ref_ug.field_o) {
              var4_ref_ug.c(2779);
              jj.field_b = var4_ref_ug.field_r.length;
              vi.field_o.field_m = 0;
              for (var5_int = 0; jj.field_b > var5_int; var5_int++) {
                vi.field_o.field_k[var5_int] = var4_ref_ug.field_r[var5_int];
              }
              oj.field_G = gb.field_d;
              gb.field_d = tm.field_U;
              tm.field_U = mn.field_e;
              mn.field_e = var4_ref_ug.field_m;
              return true;
            }
          }
          while (true) {
            if (ao.field_c < 0) {
              vi.field_o.field_m = 0;
              if (!rd.a(1, false)) {
                return false;
              }
              ao.field_c = vi.field_o.f((byte) 114);
              vi.field_o.field_m = 0;
              jj.field_b = param1[ao.field_c];
            }
            if (!in.e(-18481)) {
              return false;
            }
            if (0 == ij.field_s) {
              oj.field_G = gb.field_d;
              gb.field_d = tm.field_U;
              tm.field_U = mn.field_e;
              mn.field_e = ao.field_c;
              ao.field_c = -1;
              return true;
            }
            var4 = ij.field_s;
            if (k.field_h != 0.0) {
              var4 = (int)((double)var4 + ai.field_d.nextGaussian() * k.field_h);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new ug(var2_long + (long)var4, ao.field_c, new byte[jj.field_b]);
            for (var6 = 0; var6 < jj.field_b; var6++) {
              var5.field_r[var6] = vi.field_o.field_k[var6];
            }
            id.field_d.a(22125, var5);
            ao.field_c = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("jf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static String a(String param0, int param1, byte param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        pc var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!ai.a((byte) -126, var6)) {
            stackIn_3_0 = qn.field_n;
            return stackIn_3_0;
          }
          if (gk.field_db != 2) {
            stackIn_6_0 = ai.field_C;
            return stackIn_6_0;
          }
          if (sm.a(param0, -1)) {
            stackIn_9_0 = wd.field_h;
            return stackIn_9_0;
          }
          if (ha.a(param0, (byte) 37)) {
            stackIn_13_0 = sd.a(mo.field_b, 34, new String[]{param0});
            return stackIn_13_0;
          }
          if (f.field_q >= 100 &&
            uo.field_j <= 0) {
            stackIn_18_0 = tm.field_Q;
            return stackIn_18_0;
          }
          if (param2 < 57) {
            field_c = (mj) null;
          }
          if (f.field_q >= 200) {
            stackIn_24_0 = tm.field_Q;
            return stackIn_24_0;
          }
          if (i.a(-640, param0)) {
            stackIn_27_0 = sd.a(bm.field_r, 85, new String[]{param0});
            return stackIn_27_0;
          }
          var5 = aa.field_f;
          var5.g(param1, 15514);
          var5.field_m = var5.field_m + 1;
          var4 = var5.field_m;
          var5.e(160, 0);
          var5.b((byte) -41, param0);
          var5.f(-var4 + var5.field_m, -1);
          stackIn_29_0 = null;
          return (String) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("jf.C(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static el a(String param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        el var7 = null;
        int var8 = 0;
        el stackIn_4_0 = null;
        el stackIn_7_0 = null;
        el stackIn_10_0 = null;
        el stackIn_13_0 = null;
        el stackIn_19_0 = null;
        el stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_4_0 = pd.field_Kb;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = mk.field_a;
            return stackIn_7_0;
          }
          var3 = dd.a(param0, (byte) -96, '.');
          if (2 > var3.length) {
            stackIn_10_0 = pd.field_Kb;
            return stackIn_10_0;
          }
          var4 = var3;
          if (param1 != -4384) {
            stackIn_13_0 = (el) null;
            return stackIn_13_0;
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = sl.a(var6, (byte) 120);
            if (var7 != null) {
              stackIn_19_0 = var7;
              return stackIn_19_0;
            }
          }
          stackIn_22_0 = uo.a(-58, var3[var3.length - 1]);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("jf.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ob a(fm param0, int param1, fm param2, int param3, byte param4) {
        RuntimeException var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        ob stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 96) {
            var6 = (String) null;
            jf.a((String) null, -39, (byte) 9);
          }
          if (rk.a(param3, false, param2, param1)) {
            stackIn_6_0 = ed.a(param0.a(param1, param3, true), -28628);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (ob) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("jf.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = "Type your email address again to make sure it's correct";
    }
}
