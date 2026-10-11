/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends ig {
    static dd field_p;
    static int field_x;
    static int field_q;
    static String field_s;
    static wj field_u;
    static boolean field_o;
    private sl field_m;
    static int field_n;
    static int[] field_t;
    static ge field_r;
    private sl field_v;
    static int field_w;

    final static void a(int param0, vh param1, vh param2, vh param3, vh param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (oq.field_z != null) {
            return;
          }
          rg.field_p = false;
          if (ea.field_z) {
            var5 = fg.field_e;
          } else {
            if (!hr.field_y) {
              var5 = vc.field_J;
            } else {
              var5 = sk.field_c;
            }
          }
          var7 = (String) null;
          dr.a((String) null, 11468, mc.field_g, 0, var5);
          pa.field_J.field_P = (8355711 & kb.field_h.field_P >> 1) + (mc.field_g - (8355711 & mc.field_g >> 1));
          lh.field_i = fj.field_j;
          pa.field_J.field_K = ((kb.field_h.field_K & 16711423) >> 1) + (-((16711423 & mc.field_g) >> 1) + mc.field_g);
          pa.field_J.field_Bb = -((mc.field_g & 16711422) >> 1) + (mc.field_g + (8355711 & kb.field_h.field_Bb >> 1));
          oq.field_z = pa.field_J;
          uq.field_D = new vh(0L, param4);
          ma.field_e = new vh(0L, param3);
          ml.field_e = new vh(0L, (vh) null);
          vi.field_c = new vh(0L, param1);
          pa.field_J = new vh(0L, param2);
          pa.field_J.field_I = m.field_c;
          vi.field_c.a(78, pa.field_J);
          fj.field_j = new vh(0L, lh.field_i);
          vi.field_c.a(113, fj.field_j);
          be.field_L = new vh(0L, kb.field_h, ra.field_d);
          wn.field_g = new vh(0L, kb.field_h);
          var6 = 43 % ((-44 - param0) / 45);
          uq.field_D.a(14, ma.field_e);
          uq.field_D.a(-121, ml.field_e);
          ml.field_e.a(-96, vi.field_c);
          ml.field_e.a(127, be.field_L);
          ml.field_e.a(43, wn.field_g);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("uh.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final na a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        na stackIn_5_0 = null;
        na stackIn_9_0 = null;
        na stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_v.field_m.toLowerCase();
          if (!param1) {
            field_p = (dd) null;
          }
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_5_0 = gp.field_d;
            return stackIn_5_0;
          }
          if (!jd.a((byte) -122, var3, var4)) {
            stackIn_9_0 = gp.field_d;
            return stackIn_9_0;
          }
          if (!this.a(-31894, param0)) {
            return kr.field_e;
          }
          stackIn_13_0 = gp.field_d;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("uh.K(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_t = null;
        field_u = null;
        field_s = null;
        field_p = null;
        field_r = null;
        if (!param0) {
          uh.b(true);
        }
    }

    uh(sl param0, sl param1, sl param2) {
        super(param0);
        try {
          this.field_v = param1;
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "uh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -31894) {
            field_w = -85;
          }
          var3 = this.field_m.field_m.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < -1 + var3.length()) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (0 <= var4.indexOf(var6)) {
                return true;
              }
              stackIn_15_0 = (0 <= var4.indexOf(var7));
              return stackIn_15_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("uh.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_v.field_m.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (gh.a(var5, 28350)) {
            stackIn_5_0 = uq.field_K;
            return stackIn_5_0;
          }
          if (param1 != 0) {
            var6 = (String) null;
            this.a((String) null, -37);
          }
          if (qa.a(1, var5)) {
            stackIn_10_0 = bm.field_a;
            return stackIn_10_0;
          }
          if (bm.a(var5, -113)) {
            stackIn_14_0 = lh.field_b;
            return stackIn_14_0;
          }
          if (this.a(-31894, param0)) {
            stackIn_18_0 = l.field_b;
            return stackIn_18_0;
          }
          if (var7.length() <= 0) {
            stackIn_21_0 = hb.field_r;
            return stackIn_21_0;
          }
          if (hq.a(var5, var7, 17924)) {
            stackIn_24_0 = nk.field_o;
            return stackIn_24_0;
          }
          if (co.a(var7, (byte) -112, var5)) {
            stackIn_28_0 = ka.field_m;
            return stackIn_28_0;
          }
          if (!wg.a(23138, var7, var5)) {
            return uq.field_K;
          }
          stackIn_32_0 = nk.field_o;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("uh.L(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = 10485;
        field_s = "Waiting for <%0> to start the game...";
        field_t = new int[3];
        field_w = 128 * field_q / 5;
    }
}
