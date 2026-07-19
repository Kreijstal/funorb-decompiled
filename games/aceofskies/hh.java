/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hh {
    wl field_a;
    static hd field_c;
    static qk field_b;

    abstract void a(int param0, boolean param1);

    abstract void a(byte param0, int param1, int param2);

    abstract void b(byte param0);

    public static void a(int param0) {
        field_c = null;
        if (param0 < 7) {
            field_c = (hd) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    hh(wl param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "hh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(int param0, int param1, rt param2);

    final static void a(int param0, ha param1) {
        bo var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
            var2 = fa.a(param1, true);
            if (param0 != 255) {
                field_b = (qk) null;
            }
            var3 = sh.field_u;
            var4 = gp.field_w;
            var5 = 0;
            var6 = 0;
            param1.d(var4, var3, var6, -5782, -65281, var5);
            var2.a(var3 + var5, var5, var4 + var6, var6, 70);
            param1.SA(0, var6, vp.field_i, var4, vp.field_j, var6 * vp.field_i, vp.field_i);
            var2.a(true);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "hh.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ha var6 = null;
        ce.field_u = param1;
        if (param2 >= -52) {
          var6 = (ha) null;
          hh.a(-76, (ha) null);
          ke.field_b = param3;
          tf.field_b = param4;
          lp.field_h = param0;
          return;
        } else {
          ke.field_b = param3;
          tf.field_b = param4;
          lp.field_h = param0;
          return;
        }
    }

    abstract void a(boolean param0, boolean param1);

    final static int a(int param0, int param1) {
        param1 = (param1 & 1431655765) + ((param1 & -1431655765) >>> -1388627839);
        if (param0 != 0) {
          return -114;
        } else {
          param1 = (param1 >>> -1580371422 & -214748365) + (param1 & 858993459);
          param1 = param1 + (param1 >>> 419460452) & 252645135;
          param1 = param1 + (param1 >>> -1486691000);
          param1 = param1 + (param1 >>> -1728259856);
          return 255 & param1;
        }
    }

    final static void a(int param0, String param1, int param2, int param3, byte param4, rk param5, int param6, int param7, int param8) {
        l.field_f = param2;
        nm.field_b = param3;
        ob.field_e = param8;
        si.field_c = param7;
        if (param4 != -36) {
            return;
        }
        try {
            cs.field_d = param5;
            uk.field_g = param6;
            hi.field_x = param1;
            ah.field_s = param0;
            ul.field_r = (un) ((Object) new hf());
            ii.field_m = new dk(param5);
            om.field_c = new wq(ul.field_r, ii.field_m);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "hh.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            field_b = (qk) null;
            if ((param1 & 256) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param1 & 256) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int[][] a(byte param0, int param1, int param2, boolean param3, int param4, float param5, int param6, int param7, int param8) {
        int var12 = 0;
        int var13 = AceOfSkies.field_G ? 1 : 0;
        int[][] var16 = new int[param4][param2];
        int[][] var15 = var16;
        int[][] var14 = var15;
        int[][] var9 = var14;
        ql var10 = new ql();
        var10.field_j = (int)(param5 * 4096.0f);
        var10.field_h = param6;
        var10.field_q = param8;
        int var11 = 119 % ((2 - param0) / 58);
        var10.field_s = param1;
        var10.field_n = param3 ? true : false;
        var10.d(1);
        ji.a(param4, param2, (byte) 37);
        for (var12 = 0; param4 > var12; var12++) {
            var10.a(true, var16[var12], var12);
        }
        return var9;
    }

    abstract boolean a(byte param0);

    static {
        field_c = new hd(2);
        field_b = new qk(16);
    }
}
