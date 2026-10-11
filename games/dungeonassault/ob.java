/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ok {
    static int field_hc;
    static int field_Sb;
    static int field_Qb;
    static int field_nc;
    static int field_dc;
    static int field_Lb;
    static int field_Hb;
    static int field_Gb;
    static int field_Zb;
    static int field_Ob;
    static int field_gc;
    static int field_ac;
    static int[] field_cc;
    static int field_Ub;
    static int field_lc;
    static int field_Vb;
    static String[] field_oc;
    static int field_Mb;
    static int field_jc;
    ok field_ic;
    static int field_bc;
    static int field_kc;
    static int field_ec;
    static int field_pc;
    static int field_Ib;
    static int field_mc;
    static int field_Nb;
    static int field_Pb;
    static int field_Jb;
    ok field_Tb;
    static int field_Wb;
    static int field_fc;
    static char field_Yb;
    static String field_Kb;
    static String[] field_Rb;
    static ug field_Xb;

    final static void a(cn param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nh var12 = null;
        int var11Lifetime1;
        int var11Lifetime2;
        try {
          if (!param4) {
            var12 = (nh) null;
            ob.a((byte) -102, (nh) null);
          }
          param1 = param1 + param0.field_w;
          param3 = param3 + param0.field_A;
          var5_int = gf.field_i * param3 + param1;
          var6 = 0;
          var7 = param0.field_v;
          var8 = param0.field_y;
          var9 = -var8 + gf.field_i;
          if (param3 < gf.field_f) {
            var11 = gf.field_f - param3;
            param3 = gf.field_f;
            var5_int = var5_int + var11 * gf.field_i;
            var7 = var7 - var11;
            var6 = var6 + var8 * var11;
          }
          var10 = 0;
          if (gf.field_e < param3 + var7) {
            var7 = var7 - (-gf.field_e + var7 + param3);
          }
          if (param1 < gf.field_j) {
            var11Lifetime1 = gf.field_j - param1;
            var8 = var8 - var11Lifetime1;
            var10 = var10 + var11Lifetime1;
            var6 = var6 + var11Lifetime1;
            param1 = gf.field_j;
            var5_int = var5_int + var11Lifetime1;
            var9 = var9 + var11Lifetime1;
          }
          if (param1 + var8 > gf.field_h) {
            var11Lifetime2 = var8 + param1 - gf.field_h;
            var10 = var10 + var11Lifetime2;
            var9 = var9 + var11Lifetime2;
            var8 = var8 - var11Lifetime2;
          }
          if (0 < var8 &&
            0 < var7) {
            o.a(var8, 0, gf.field_b, var6, param0.field_B, var7, param2, var5_int, 0, var9, var10);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ob.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    ob(long param0, ok param1, ok param2, ok param3, cn param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Tb = new ok(0L, param2);
            this.field_Tb.field_L = param4;
            this.a(this.field_Tb, (byte) 124);
          }
          if (param5 != null) {
            this.field_ic = new ok(0L, param3, param5);
            this.a(this.field_ic, (byte) 124);
            this.e(30509);
          } else {
            this.e(30509);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ob.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(byte param0, nh param1) {
        cn var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new cn(param1.a("final_frame.jpg", "", (byte) -123), (java.awt.Component) ((Object) c.field_h));
          if (param0 >= -40) {
            ob.g(119);
          }
          var3 = var2.field_y;
          var4 = var2.field_v;
          ie.a(99);
          dm.field_g = new cn(var3, 3 * var4 / 4);
          dm.field_g.e();
          var2.c(0, 0);
          lb.field_C = new cn(var3, -dm.field_g.field_v + var4);
          lb.field_C.e();
          var2.c(0, -dm.field_g.field_v);
          lb.field_C.field_A = dm.field_g.field_v;
          ti.c(true);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ob.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        cn var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param2.getGraphics();
            k.field_h.a(param0, true, var4, param3);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
          }
          if (param1 > -76) {
            var5 = (cn) null;
            ob.a((cn) null, -84, 120, -93, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("ob.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void g(int param0) {
        if (param0 != 16) {
          return;
        }
        field_Rb = null;
        field_cc = null;
        field_Xb = null;
        field_Kb = null;
        field_oc = null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = DungeonAssault.field_K;
        try {
          if (param2 != -102) {
            field_hc = -92;
          }
          for (var5_int = 0; var5_int < param3; var5_int++) {
            te.a(param0, var5_int + param1, param4, ji.field_F);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var5), "ob.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_Qb = 12;
        field_hc = 1;
        field_Lb = 13;
        field_Hb = 10;
        field_Zb = 18;
        field_gc = 25;
        field_Vb = 17;
        field_lc = 9;
        field_Gb = 22;
        field_Mb = 2;
        field_dc = 15;
        field_nc = 6;
        field_Ub = 16;
        field_oc = new String[]{"Fragility", "The strange chemicals the <%0> uses to fuel his mindless rage have their own cost; blows that would otherwise only stun a raider are always fatal to the <%0>."};
        field_ac = 28;
        field_jc = 8;
        field_kc = 7;
        field_Sb = 20;
        field_Ob = 11;
        field_Ib = 21;
        field_cc = new int[field_ac];
        field_bc = 26;
        field_Pb = 5;
        field_ec = 27;
        field_Jb = 19;
        field_pc = 24;
        field_Nb = 4;
        field_fc = 0;
        field_mc = 14;
        field_Wb = 3;
        s.a(72, field_fc, 8);
        s.a(72, field_Jb, 8);
        s.a(72, field_pc, 8);
        s.a(72, field_hc, 0);
        s.a(72, field_Mb, 40);
        s.a(72, field_Wb, 16);
        s.a(72, field_Nb, 8);
        s.a(72, field_Pb, 16);
        s.a(72, field_nc, 160);
        s.a(72, field_Ib, 160);
        s.a(72, field_kc, 0);
        s.a(72, field_jc, 0);
        s.a(72, field_lc, 16);
        s.a(72, field_Gb, 16);
        s.a(72, field_Hb, 0);
        s.a(72, field_Ob, 0);
        s.a(72, field_Qb, 0);
        s.a(72, field_Lb, 4);
        s.a(72, field_mc, 0);
        s.a(72, field_dc, 8);
        s.a(72, field_Ub, 16);
        s.a(72, field_Vb, 0);
        s.a(72, field_Sb, 0);
        s.a(72, field_bc, 0);
        s.a(72, field_gc, 0);
        s.a(72, field_ec, 0);
        s.a(72, field_Zb, 16);
        field_Kb = "OFF";
        field_Rb = new String[]{"Master of Chaos", "The <%0> is able to harness the raw power of chaos, using the energy released by the sacrifice of another raider to overcome any room. (Multiple use)"};
    }
}
