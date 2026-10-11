/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cc extends aj {
    static float field_x;
    static mg field_u;
    static String[] field_v;
    static km field_w;

    final static lc[] a(byte param0) {
        if (param0 == -104) {
          return new lc[]{pm.field_q, dn.field_d, db.field_z, pn.field_z, gf.field_z, na.field_Fb, af.field_l, ud.field_c, lm.field_i, ji.field_b, dk.field_s, oj.field_Xb, vl.field_f, oe.field_e};
        }
        cc.a(-65, 105, true, false);
        return new lc[]{pm.field_q, dn.field_d, db.field_z, pn.field_z, gf.field_z, na.field_Fb, af.field_l, ud.field_c, lm.field_i, ji.field_b, dk.field_s, oj.field_Xb, vl.field_f, oe.field_e};
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            bf.a(true, param1.field_g, param1.field_l + param0, param3 + param1.field_u, param1.field_m);
          }
          super.a(param0, param1, param2, param3, param4 + 0);
          if (param4 == -23294) {
            return;
          }
          field_x = -0.093443363904953f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("cc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        if (param2) {
          return 38;
        }
        return sn.h(3938);
    }

    cc(int param0) {
        this(dj.field_h, param0);
    }

    final static void a(boolean param0, he param1, boolean param2, jc param3) {
        int var8 = 0;
        he stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        he stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        he stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        he stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        he stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        he stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0) {
            param1.field_ic = param3.g(11132);
          }
          param1.field_vc = param3.g(11132);
          param1.field_fc = param3.g(11132);
          var4_int = param3.g(11132);
          stackIn_6_0 = (he) (param1);
          stackIn_7_1 = ((128 & var4_int) != 0);
          stackIn_6_0.field_Sb = stackIn_7_1;
          stackIn_9_0 = (he) (param1);
          stackIn_10_1 = ((var4_int & 64) != 0);
          stackIn_9_0.field_kc = stackIn_10_1;
          stackIn_13_0 = (he) (param1);
          stackIn_14_1 = (param1.field_Sb) && (param1.field_vc > param1.field_ic);
          stackIn_13_0.field_Ib = stackIn_14_1;
          stackIn_16_0 = (he) (param1);
          if (0 != (16 & var4_int)) {
            stackIn_17_1 = 2;
          } else {
            stackIn_17_1 = 1;
          }
          stackIn_16_0.field_lc = stackIn_17_1;
          stackIn_19_0 = (he) (param1);
          stackIn_20_1 = ((var4_int & 32) != 0);
          stackIn_19_0.field_Ub = stackIn_20_1;
          stackIn_22_0 = (he) (param1);
          stackIn_23_1 = (0 != (8 & var4_int));
          stackIn_22_0.field_Rb = stackIn_23_1;
          stackIn_26_0 = ((4 & var4_int) == 0) ? 0 : 1;
          var5 = stackIn_26_0;
          param3.a(0, param1.field_Pb.length, param2, param1.field_Pb);
          stackIn_29_0 = ((2 & var4_int) == 0) ? 0 : 1;
          var6 = stackIn_29_0;
          param1.field_ac = param3.c((byte) 47);
          param1.field_Hb = hc.a(-9986) - (long)param3.d((byte) 119);
          if (var5 != 0) {
            param1.field_mc = param3.d((byte) 127);
          } else {
            param1.field_mc = -1;
          }
          param1.field_gc = param3.e((byte) -60);
          var7 = param3.field_l;
          param1.field_Qb = param3.h(-119);
          if (var6 == 0) {
            param1.field_Zb = null;
            return;
          }
          param3.field_l = var7;
          param1.field_Zb = new String[param1.field_ic];
          for (var8 = 0; param1.field_ic > var8; var8++) {
            param1.field_Zb[var8] = param3.h(-119);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_40_0 = var4;
          stackIn_40_1 = new StringBuilder().append("cc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_w = null;
        field_u = null;
        field_v = null;
    }

    cc(e param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    static {
        field_u = new mg(270, 70);
        field_v = new String[]{"2D - Fastest", "2D - Best", "3D - Fastest", "3D - Best"};
    }
}
