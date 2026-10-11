/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ea {
    static boolean field_k;
    int field_i;
    int field_j;
    static wk[] field_m;
    static gk[] field_b;
    static gh field_f;
    int field_g;
    static String field_e;
    static ul field_c;
    int field_n;
    static int field_h;
    int field_d;
    int field_a;
    static gh field_l;

    abstract void a(int param0, int param1, int param2);

    public static void a(byte param0) {
        if (param0 < 55) {
          return;
        }
        field_m = null;
        field_c = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_l = null;
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param1.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param1.equals("Z")) {
            stackIn_16_0 = Boolean.TYPE;
            return stackIn_16_0;
          }
          if (param1.equals("F")) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param1.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (param0 != 10126) {
            field_l = (gh) null;
          }
          if (!param1.equals("C")) {
            stackIn_31_0 = Class.forName(param1);
            return stackIn_31_0;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("ea.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    abstract void a(int param0, int param1);

    final static na a(int param0, int param1, int param2, int param3) {
        boolean stackIn_47_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        na var8_ref_na;
        int var9;
        na var9_ref_na;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = SteelSentinels.field_G;
        sn.field_j.field_Ub.field_M.g(6);
        var4 = null;
        var5 = 0;
        var6 = 0;
        for (var7 = uc.field_a - 1; 0 <= var7; var7--) {
          var8_ref_na = ph.field_e[var7];
          var9 = 0;
          if (!fj.field_e &&
            var5 < cj.field_h) {
            var10_int = ei.a(var8_ref_na.field_k, 1);
            if (var8_ref_na.a((byte) 58) >= var10_int && (var8_ref_na.field_g ||
              !o.a(-99, var8_ref_na.field_p))) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            var8_ref_na.field_m = null;
          } else {
            var5++;
            if (var8_ref_na.field_m == null ||
              cn.field_l) {
              if (var8_ref_na.field_m == null) {
                ln.field_e = ln.field_e + 1;
              }
              var10 = nk.a(-118, var8_ref_na);
              var11 = var10 + mi.a(var8_ref_na.field_o);
              var12 = rf.a(-102, var8_ref_na);
              var8_ref_na.field_m = new gh(0L, td.field_ic, var11);
              var8_ref_na.field_m.field_xb = (8355711 & td.field_ic.field_xb >> 1) - (8355711 & var12 >> 1) + var12;
              var8_ref_na.field_m.field_L = pl.field_X;
              var8_ref_na.field_m.field_nb = var12;
              var8_ref_na.field_m.field_rb = ((td.field_ic.field_rb & 16711422) >> 1) + (-((16711422 & var12) >> 1) + var12);
              var6 = var6 + param3;
            }
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; var8 < uc.field_a; var8++) {
          var9_ref_na = ph.field_e[var8];
          if (null != var9_ref_na.field_m) {
            sn.field_j.field_Ub.a(var9_ref_na.field_m, 127);
            var9_ref_na.field_m.a(0, var7Lifetime1, param3, param1, var9_ref_na.field_m.g(-2147483648));
            var7Lifetime1 = var7Lifetime1 + param3;
            if (var9_ref_na.field_m.field_Eb != 0) {
              var4 = var9_ref_na;
            }
          }
        }
        var8Lifetime1 = sn.field_j.field_Ub.field_lb + sn.field_j.field_Ub.field_Lb - (-var6 + var7Lifetime1);
        sn.field_j.field_Ub.field_Lb = sn.field_j.field_Ub.field_Lb - var8Lifetime1;
        sn.field_j.field_Ub.field_eb = sn.field_j.field_Ub.field_eb + var8Lifetime1;
        if (cn.field_l) {
          sn.field_j.field_Ub.field_Lb = var7Lifetime1;
        }
        if (cn.field_l) {
          rg.field_f = true;
          sn.field_j.field_Ub.field_eb = -sn.field_j.field_Ub.field_Lb + sn.field_j.field_Tb.field_Lb;
          sn.field_j.field_Ub.field_gb = 0;
          cn.field_l = false;
        }
        sn.field_j.field_Ub.field_lb = -sn.field_j.field_Ub.field_Lb + var7Lifetime1;
        if (param2 <= 0) {
          return (na) null;
        }
        if (jn.field_g &&
          hh.field_a != null) {
          rg.field_f = true;
        }
        var9Lifetime1 = sn.field_j.field_Tb.field_Lb - (sn.field_j.field_Ub.field_Lb + sn.field_j.field_Ub.field_lb);
        if (rg.field_f) {
          sn.field_j.field_Ub.field_gb = -sn.field_j.field_Ub.field_eb + var9Lifetime1;
        }
        sn.field_j.a(true, 8113, param3, param0 * 2 * param3);
        stackIn_47_0 = (var9Lifetime1 == sn.field_j.field_Ub.field_eb + sn.field_j.field_Ub.field_gb);
        rg.field_f = stackIn_47_0;
        return (na) (var4);
    }

    final static void a(cm param0, int param1) {
        uk var2 = null;
        try {
          uk.b(param0.a("", -742, "headers.packvorbis"));
          if (param1 != 1728986241) {
            field_c = (ul) null;
          }
          var2 = uk.a(param0, "jagex logo2.packvorbis", "");
          var2.a();
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = "Sentinels Expansion";
    }
}
