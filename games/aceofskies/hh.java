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

    final static void a(int param0, GraphicsRenderer param1) {
        try {
          bo var2 = fa.a(param1, true);
          if (param0 != 255) {
            field_b = (qk) null;
          }
          int var3 = sh.field_u;
          int var4 = gp.field_w;
          int var5 = 0;
          int var6 = 0;
          param1.d(var4, var3, var6, -5782, -65281, var5);
          var2.a(var3 + var5, var5, var4 + var6, var6, 70);
          param1.SA(0, var6, SoftwareRasterizer.stride, var4, SoftwareRasterizer.framebuffer, var6 * SoftwareRasterizer.stride, SoftwareRasterizer.stride);
          var2.a(true);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hh.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ce.field_u = param1;
        if (param2 < -52) {
          ke.field_b = param3;
          tf.field_b = param4;
          lp.field_h = param0;
          return;
        }
        GraphicsRenderer var6 = (GraphicsRenderer) null;
        hh.a(-76, (GraphicsRenderer) null);
        ke.field_b = param3;
        tf.field_b = param4;
        lp.field_h = param0;
    }

    abstract void a(boolean param0, boolean param1);

    final static int a(int param0, int param1) {
        param1 = (param1 & 1431655765) + ((param1 & -1431655765) >>> 1);
        if (param0 == 0) {
          param1 = (param1 >>> 2 & -214748365) + (param1 & 858993459);
          param1 = param1 + (param1 >>> 4) & 252645135;
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return 255 & param1;
        }
        return -114;
    }

    final static void a(int param0, String param1, int param2, int param3, byte param4, rk param5, int param6, int param7, int param8) {
        RendererManager.field_f = param2;
        IntKeyLookup.field_b = param3;
        SoundCache.field_e = param8;
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
        if (param0 == 0) {
          return (param1 & 256) != 0 ? true : false;
        }
        field_b = (qk) null;
        return (param1 & 256) != 0 ? true : false;
    }

    final static int[][] a(byte param0, int param1, int param2, boolean param3, int param4, float param5, int param6, int param7, int param8) {
        int var13 = AceOfSkies.obfuscationControl ? 1 : 0;
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
        for (int var12 = 0; param4 > var12; var12++) {
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
