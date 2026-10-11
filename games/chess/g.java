/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends java.awt.Canvas {
    static byte[] field_f;
    static ed field_a;
    static int field_h;
    static int field_c;
    private java.awt.Component field_e;
    static ci[] field_d;
    static rk field_g;
    static String[] field_b;

    final static pm a(byte[] param0, int param1) {
        pm var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        pm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 127) {
            field_a = (ed) null;
          }
          if (param0 == null) {
            stackIn_4_0 = null;
            return (pm) (stackIn_4_0);
          }
          var2 = new pm(param0, be.field_a, a.field_c, wm.field_b, b.field_c, uh.field_r, vk.field_d);
          ch.k(param1 + 4210625);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("g.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        b.field_d = param4;
        fd.field_n = param2;
        rm.field_S = param1;
        int var5 = -117 % ((param0 - 0) / 54);
        vh.field_c = param3;
    }

    g(java.awt.Component param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -20905) {
          return;
        }
        field_b = null;
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final static lm a(byte param0, int param1) {
        int var6 = 0;
        int var7 = Chess.field_G;
        lm var2 = new lm(22050, param1);
        double var3 = 6.283185307179586 / (double)param1;
        byte[] var5 = var2.field_m;
        if (param0 == -34) {
          for (var6 = param1 - 1; var6 >= 0; var6--) {
            var5[var6] = (byte)(int)(mn.a((double)var6 * var3, 2278) * 127.0);
          }
          return var2;
        }
        return (lm) null;
    }

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ah.a(param2, (byte) -29)) {
            return false;
          }
          if (pd.a(param2, (byte) 94)) {
            return false;
          }
          if (param0 < 8) {
            field_d = (ci[]) null;
          }
          if (gl.a(0, param2)) {
            return false;
          }
          if (0 == param1.length()) {
            return true;
          }
          if (ml.a(param1, param2, 0)) {
            return false;
          }
          if (ma.a(param1, -123, param2)) {
            return false;
          }
          if (!oc.a(param2, -122, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("g.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 == -1) {
          return param1 >= 2 ? true : false;
        }
        field_d = (ci[]) null;
        return param1 >= 2 ? true : false;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_e.update(param0);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "g.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_e.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "g.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 0;
        field_b = new String[]{"All scores", "My scores", "Best each"};
    }
}
