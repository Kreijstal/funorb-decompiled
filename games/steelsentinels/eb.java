/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends ia {
    static wk[] field_s;
    static int[] field_u;
    static String field_q;
    static String field_t;
    static int[] field_o;
    static int field_n;
    static String field_r;
    static wk[] field_p;

    final static boolean b(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          if (param1 != 29974) {
            field_n = -3;
          }
          var2_int = param0.charAt(0);
          for (var3 = 1; param0.length() > var3; var3++) {
            if (param0.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("eb.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_u = null;
        field_t = null;
        if (param0 > 14) {
          field_r = null;
          field_q = null;
          field_s = null;
          field_o = null;
          field_p = null;
          return;
        }
        field_s = (wk[]) null;
        field_r = null;
        field_q = null;
        field_s = null;
        field_o = null;
        field_p = null;
    }

    final vd a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        vd stackIn_3_0 = null;
        vd stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!fg.a(var4, -71)) {
            stackIn_3_0 = fa.field_d;
            return stackIn_3_0;
          }
          if (param1 != -1) {
            field_s = (wk[]) null;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = dj.a(var5, -124);
          if (0 < var3_int &&
            var3_int <= 130) {
            return vf.field_b;
          }
          stackIn_10_0 = fa.field_d;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("eb.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, -1) == fa.field_d) {
            stackIn_3_0 = vn.field_j;
            return stackIn_3_0;
          }
          if (param0 == 100) {
            return null;
          }
          field_u = (int[]) null;
          stackIn_7_0 = null;
          return (String) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("eb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, gh param1, gh param2, gh param3, gh param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = SteelSentinels.field_G;
        try {
          if (tj.field_f != null) {
            return;
          }
          jn.field_g = false;
          if (!fj.field_e) {
            if (!uc.field_g) {
              var5 = sg.field_h;
            } else {
              var5 = al.field_b;
            }
          } else {
            var5 = hk.field_Kc;
          }
          var7 = (String) null;
          qb.a(-104, v.field_e, var5, 0, (String) null);
          vd.field_d.field_rb = ((td.field_ic.field_rb & 16711422) >> 1) + (v.field_e - ((16711422 & v.field_e) >> 1));
          vd.field_d.field_xb = (8355711 & td.field_ic.field_xb >> 1) - ((16711422 & v.field_e) >> 1) + v.field_e;
          sb.field_ab = wh.field_e;
          tj.field_f = vd.field_d;
          vd.field_d.field_Mb = (td.field_ic.field_Mb >> 1 & 8355711) - ((16711422 & v.field_e) >> 1) + v.field_e;
          hh.field_a = new gh(0L, param2);
          cc.field_bc = new gh(0L, param4);
          in.field_d = new gh(0L, (gh) null);
          te.field_f = new gh(0L, param1);
          vd.field_d = new gh((long)param0, param3);
          vd.field_d.field_L = pl.field_X;
          te.field_f.a(vd.field_d, 122);
          wh.field_e = new gh(0L, sb.field_ab);
          te.field_f.a(wh.field_e, 125);
          vc.field_f = new gh(0L, td.field_ic, re.field_cb);
          qa.field_N = new gh(0L, td.field_ic);
          hh.field_a.a(cc.field_bc, 124);
          hh.field_a.a(in.field_d, 127);
          in.field_d.a(te.field_f, 122);
          in.field_d.a(vc.field_f, 119);
          in.field_d.a(qa.field_N, 121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("eb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static na a(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        kj var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        kj var8 = null;
        ao var9 = null;
        var7 = SteelSentinels.field_G;
        var8 = rf.field_d;
        var2 = var8;
        var3 = var8.f((byte) -87);
        m.field_a = var3 & 127;
        stackIn_3_0 = (0 != (var3 & 128));
        oh.field_e = stackIn_3_0;
        be.field_b = var8.f((byte) -121);
        ni.field_d = var8.g((byte) -116);
        if (m.field_a != 2) {
          dk.field_a = 0;
          t.field_k = 0;
        } else {
          dk.field_a = var8.c((byte) -60);
          t.field_k = var8.a(false);
        }
        stackIn_9_0 = (var8.f((byte) -77) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        b.field_g = var8.h(1);
        if (param0 >= -50) {
          field_s = (wk[]) null;
        }
        if (var4 != 0) {
          jk.field_e = var8.h(1);
        } else {
          jk.field_e = b.field_g;
        }
        if (m.field_a == 1) {
          gd.field_lb = var8.c((byte) -60);
          uj.field_a = var8.h(1);
        } else {
          if (m.field_a == 4) {
            gd.field_lb = var8.c((byte) -60);
            uj.field_a = var8.h(1);
          } else {
            uj.field_a = null;
            gd.field_lb = 0;
          }
        }
        if (!param1) {
          bg.field_F = cd.a(var8, 80, (byte) -100);
          bc.field_ob = null;
          return new na(param1);
        }
        var5 = var8.c((byte) -60);
        try {
          var9 = jl.field_w.a(var5, -81);
          bg.field_F = var9.i(1);
          if (jk.field_e.equals(g.field_l)) {
            stackIn_25_0 = null;
          } else {
            stackIn_25_0 = var9.field_F;
          }
          bc.field_ob = stackIn_25_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          sj.a("CC1", -66, (Throwable) ((Object) var6));
          bg.field_F = null;
          bc.field_ob = null;
          return new na(param1);
        }
        return new na(param1);
    }

    eb(jf param0) {
        super(param0);
    }

    static {
        field_q = "Loading...";
        field_o = new int[]{55, 53, 24, 24, 24, 24, 54, 83, 24, 24, 56, 83, 24, 24, 83, 24, 24, 97, 35, -1, -1, -1, -1, -1, -1, -1};
        field_t = "PER MONTH";
        field_r = "You are on <%0>";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static na $cfr$intArgs$a$9d0e4b5217c4(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        kj var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        kj var8 = null;
        ao var9 = null;
        var7 = SteelSentinels.field_G;
        var8 = rf.field_d;
        var2 = var8;
        var3 = var8.f((byte) -87);
        m.field_a = var3 & 127;
        stackIn_3_0 = (0 != (var3 & 128));
        oh.field_e = stackIn_3_0;
        be.field_b = var8.f((byte) -121);
        ni.field_d = var8.g((byte) -116);
        if (m.field_a != 2) {
          dk.field_a = 0;
          t.field_k = 0;
        } else {
          dk.field_a = var8.c((byte) -60);
          t.field_k = var8.a(false);
        }
        stackIn_9_0 = (var8.f((byte) -77) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        b.field_g = var8.h(1);
        if (param0 >= -50) {
          field_s = (wk[]) null;
        }
        if (var4 != 0) {
          jk.field_e = var8.h(1);
        } else {
          jk.field_e = b.field_g;
        }
        if (m.field_a == 1) {
          gd.field_lb = var8.c((byte) -60);
          uj.field_a = var8.h(1);
        } else {
          if (m.field_a == 4) {
            gd.field_lb = var8.c((byte) -60);
            uj.field_a = var8.h(1);
          } else {
            uj.field_a = null;
            gd.field_lb = 0;
          }
        }
        if (!param1) {
          bg.field_F = cd.a(var8, 80, (byte) -100);
          bc.field_ob = null;
          return new na(param1);
        }
        var5 = var8.c((byte) -60);
        try {
          var9 = jl.field_w.a(var5, -81);
          bg.field_F = var9.i(1);
          if (jk.field_e.equals(g.field_l)) {
            stackIn_25_0 = null;
          } else {
            stackIn_25_0 = var9.field_F;
          }
          bc.field_ob = stackIn_25_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          sj.a("CC1", -66, (Throwable) ((Object) var6));
          bg.field_F = null;
          bc.field_ob = null;
          return new na(param1);
        }
        return new na(param1);
    }
}
