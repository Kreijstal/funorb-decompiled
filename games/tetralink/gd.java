/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends hl {
    static String field_ec;
    hl field_Vb;
    boolean field_Tb;
    int field_Sb;
    int field_Qb;
    hl field_Ob;
    int field_Ub;
    boolean field_cc;
    int field_Xb;
    boolean field_Kb;
    int field_dc;
    long field_bc;
    hl field_Wb;
    long field_Nb;
    hl field_Lb;
    hl field_ac;
    static int field_Mb;
    int field_Pb;
    String field_Rb;
    static int[] field_Zb;
    String field_Yb;

    public static void h(int param0) {
        if (param0 != 11042) {
          return;
        }
        field_Zb = null;
        field_ec = null;
    }

    final void a(int param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
          if (param0 <= 26) {
            this.field_Rb = (String) null;
          }
          this.field_Yb = param2;
          this.field_Rb = param1;
          var5 = (CharSequence) ((Object) this.field_Rb);
          cc.a(var5, (byte) 104);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "gd.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0, gd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (this.field_Kb) ? 0 : 1;
          if (param1.field_Kb) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_8_0 = this.field_Kb;
            return stackIn_8_0;
          }
          stackIn_12_0 = (this.field_cc) ? 0 : 1;
          if (stackIn_12_0 == (param1.field_cc ? 1 : 0)) {
            stackIn_15_0 = this.field_cc;
            return stackIn_15_0;
          }
          var3_int = -22 % ((-21 - param0) / 55);
          stackIn_19_0 = !(param1.field_bc <= this.field_bc);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("gd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        if (param0 == -1) {
          return !this.a(2) ? true : false;
        }
        this.field_Xb = -80;
        return !this.a(2) ? true : false;
    }

    final static oh[] e(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var2 = 0;
        int var7 = TetraLink.field_J;
        oh[] var1 = new oh[vj.field_n];
        int var2Lifetime1;
        for (var2 = 0; vj.field_n > var2; var2++) {
          var3 = sn.field_e[var2] * je.field_h[var2];
          var4 = ga.field_a[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = ti.field_c[pl.a((int) var4[var6], 255)];
          }
          var1[var2] = new oh(wm.field_l, mm.field_w, qa.field_x[var2], i.field_t[var2], je.field_h[var2], sn.field_e[var2], var5);
        }
        var2Lifetime1 = 29 % ((param0 + 30) / 37);
        an.b(-104);
        return var1;
    }

    final static void a(String param0, int param1, String param2, int param3, rb param4, int[] param5, long param6, hl param7, int param8) {
        try {
          bi.field_d = param4;
          if (param1 != 255) {
            gd.h(-71);
          }
          hd.field_s = new pf(param7, param6, param0, param2, param8, param3, param5);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "gd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    gd(String param0, String param1, long param2) {
        super(0L, (hl) null);
        CharSequence var6 = null;
        try {
          this.field_Yb = param1;
          this.field_Rb = param0;
          this.field_Nb = param2;
          var6 = (CharSequence) ((Object) this.field_Rb);
          cc.a(var6, (byte) 115);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "gd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = TetraLink.field_J;
        try {
          var3_int = 0;
          var4 = pj.field_e;
          while (pj.field_h.length > var3_int) {
            var5 = ml.field_mb[var3_int];
            if (var5 >= 0) {
              var6 = fi.a(true, pj.field_h[var3_int], (byte) -89);
              var7 = vg.field_Lb - (var6 >> 1);
              var4 = var4 + mn.field_c;
              if (tb.a(param1, -io.field_a + var7, var4, param0, var6 + (io.field_a << 1), bj.field_d + (da.field_e << 1), -113)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + ((da.field_e << 1) + mn.field_c + bj.field_d);
            } else {
              var4 = var4 + la.field_e;
            }
            var3_int++;
          }
          if (param2 == 8395) {
            stackIn_17_0 = -1;
            return stackIn_17_0;
          }
          stackIn_15_0 = 79;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "gd.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        jj.field_b = param3;
        if (param1) {
          return;
        }
        rn.field_b = param4;
        la.field_e = param2;
        bj.field_d = param0;
    }

    final static void d(int param0, int param1) {
        ik.field_e = param0 >> 4 & 3;
        me.field_b = param0 >> 2 & 3;
        if (!(2 >= ik.field_e)) {
          ik.field_e = 2;
        }
        if (!(me.field_b <= 2)) {
          me.field_b = 2;
        }
        mc.field_f = param1 & param0;
        if (!(mc.field_f <= 2)) {
          mc.field_f = 2;
        }
    }

    static {
        field_ec = "Your request to join has been declined.";
        field_Mb = 50;
    }
}
