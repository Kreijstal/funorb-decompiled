/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends rqa {
    static volatile int field_q;
    static String field_o;
    static String field_p;

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        llb var5 = null;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = VoidHunters.field_G;
        try {
          if (param0 != -19689) {
            var5 = (llb) null;
            am.a((byte[]) null, (llb) null, -17, -59, (llb) null, false, 76, 14, -115, (llb) null);
          }
          var6 = bs.field_b;
          var1 = var6;
          var2 = 0;
          var3 = var6.length;
          while (var3 > var2) {
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "am.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 > -107) {
            field_q = -69;
          }
          if (!li.field_i) {
            sa.a(param4, param1, param2, param3 & 16777215, param3 >>> 24);
          } else {
            if (ne.field_v) {
              rj.a(og.field_r, param4, param1, param2, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("am.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(byte[] param0, llb param1, int param2, int param3, llb param4, boolean param5, int param6, int param7, int param8, llb param9) {
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          wqa.field_a = -1L;
          vu.field_zb = param0;
          sea.field_o = param6;
          ocb.field_l = param0.length;
          lqa.field_o = null;
          ii.field_h = false;
          ohb.field_o = null;
          ce.field_o = new byte[(7 + sea.field_o) / 8];
          var10_int = 0;
          for (var11 = 0; var11 < vu.field_zb.length; var11++) {
            var10_int = var10_int + (vu.field_zb[var11] & 255);
          }
          var10_int = (var10_int + 7) / 8;
          nkb.field_p = new byte[var10_int];
          if (param9.field_lb == null) {
            param9.field_lb = new ij();
          }
          cta.field_q = param9.field_lb;
          cta.field_q.e(109);
          oha.field_o = new pr(param3);
          cla.field_b = -1;
          qea.field_p = 0;
          paa.field_q = 0;
          tg.field_q = -1;
          if (null == param4.field_lb) {
            param4.field_lb = new ij();
          }
          kja.field_E = param4.field_lb;
          kja.field_E.e(118);
          ks.field_r = new pr(param8);
          if (null == param1.field_lb) {
            param1.field_lb = new ij();
          }
          mea.field_e = param1.field_lb;
          mea.field_e.e(93);
          icb.field_p = new pr(param2);
          ktb.field_p = param7;
          if (!param5) {
            field_p = (String) null;
          }
          qga.field_a = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_19_0 = var10;
          stackIn_19_1 = new StringBuilder().append("am.E(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    am(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != -1) {
          field_p = (String) null;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            am.e(28);
          }
          stackIn_3_0 = new nc(frb.a(136, 77));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("am.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = "Your ignore list is full. Max of 100 hit.";
        field_p = "Loading fonts";
        field_q = 0;
    }
}
