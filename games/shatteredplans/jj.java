/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends me {
    static qf field_l;
    static String field_o;
    static int field_m;
    static String field_p;
    static boolean field_n;
    static int field_k;

    final void a(byte param0, dc param1, kq param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("jj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 < 36) {
          return;
        }
        field_p = null;
        field_l = null;
        field_o = null;
    }

    final static qf a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        qf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -92) {
            field_l = (qf) null;
          }
          stackIn_3_0 = new qf(mj.field_Sb.a("", param2, -22888), param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, ob param1) {
        try {
          int var3_int = -114 / ((-72 - param0) / 45);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "jj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(boolean param0) {
        if (param0) {
          return 8;
        }
        return -1;
    }

    final static nk[] c(boolean param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        nk[] var1 = new nk[en.field_c];
        for (var2 = 0; en.field_c > var2; var2++) {
          var1[var2] = new nk(tk.field_y, eg.field_t, cf.field_H[var2], sj.field_a[var2], mc.field_s[var2], cm.field_g[var2], hd.field_q[var2], eo.field_fb);
        }
        if (param0) {
          pd.a(0);
          return var1;
        }
        String var4 = (String) null;
        jj.a((byte) 73, 51, (String) null);
        pd.a(0);
        return var1;
    }

    jj(fs[] param0) {
        super(param0);
    }

    final fs[] b(int param0) {
        if (param0 != 0) {
          ob var3 = (ob) null;
          this.a((ob) null, (byte) -82);
          return new fs[]{};
        }
        return new fs[]{};
    }

    final void a(ob param0, byte param1) {
        try {
          if (param1 != -109) {
            field_o = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "jj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_m = 0;
        field_n = false;
        field_p = "Offline";
    }
}
