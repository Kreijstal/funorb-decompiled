/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    byte[] field_c;
    int field_m;
    int field_j;
    int field_n;
    int field_b;
    int field_l;
    static qm field_k;
    int field_e;
    static String field_p;
    static String field_h;
    static int field_o;
    static String field_i;
    static int field_f;
    static int field_g;
    static int field_a;
    static int field_d;

    final static dh[] a(int param0, uf param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        dh[] var4 = null;
        int var6_int = 0;
        dh var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        dh[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          var2_int = param1.a(8, (byte) 80);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (dh[]) (stackIn_3_0);
          }
          if (param0 <= 121) {
            field_i = (String) null;
          }
          var3 = param1.a(12, (byte) 77);
          var4 = new dh[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (wg.a(param1, (byte) 26)) {
              var6 = new dh();
              param1.a(24, (byte) 40);
              param1.a(24, (byte) 73);
              var6.field_a = param1.a(24, (byte) 42);
              param1.a(9, (byte) 98);
              param1.a(12, (byte) 77);
              param1.a(12, (byte) 86);
              param1.a(12, (byte) 108);
              var4[var5] = var6;
            } else {
              var6_int = param1.a(ma.a(var5 - 1, (byte) 49), (byte) 118);
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_13_0 = var4;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("rf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, float param2, String param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (null == pk.field_v) {
            pk.field_v = new qn(ah.field_c, ed.field_d);
            ah.field_c.a((byte) -107, pk.field_v);
          }
          pk.field_v.a(param1, param2, 4210752, param3);
          hk.b();
          cg.a(true, param0 + 106);
          if (param0 != 12) {
            field_k = (qm) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("rf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_p = null;
        field_h = null;
        if (param0) {
          uf var2 = (uf) null;
          rf.a(88, (uf) null);
        }
        field_k = null;
    }

    final static void a(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 != 0) {
          return;
        }
        if (null != ik.field_f) {
          var1 = ik.field_f;
          synchronized (var1) {
            ik.field_f = null;
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          if (param0 != 12) {
            String var3 = (String) null;
            rf.a(29, true, 0.5555365681648254f, (String) null);
          }
          param1.removeKeyListener(f.field_r);
          param1.removeFocusListener(f.field_r);
          wi.field_b = -1;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "rf.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 == param0) {
          var2 = qk.field_i;
        }
        if (param1 == 1) {
          var2 = wh.field_d;
        }
        if (param1 == 2) {
          var2 = wl.field_o;
        }
        return var2;
    }

    final static void a(String[] args, int param1, int param2, int param3, int param4, java.applet.Applet param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = client.field_A ? 1 : 0;
        try {
          wf.field_n = param5.getParameter("overxgames");
          if (wf.field_n == null) {
            wf.field_n = "0";
          }
          jm.field_u = param5.getParameter("overxachievements");
          if (param3 > -22) {
            field_i = (String) null;
          }
          if (jm.field_u == null) {
            jm.field_u = "0";
          }
          var6 = param5.getParameter("currency");
          if (var6 == null) {
            rb.field_m = 2;
          } else {
            if (!be.a((byte) 98, (CharSequence) ((Object) var6))) {
              rb.field_m = 2;
            } else {
              rb.field_m = cb.a((byte) -33, (CharSequence) ((Object) var6));
            }
          }
          w.field_Fb = param2;
          o.field_d = param4;
          qn.field_lb = param1;
          vi.field_z = new ck[args.length];
          for (var7 = 0; var7 < args.length; var7++) {
            vi.field_z[var7] = new ck(317, 34);
          }
          dl.field_K = args;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_21_0 = var6_ref;
          stackIn_21_1 = new StringBuilder().append("rf.B(");
          if (args == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    rf(int param0) {
        this.field_j = param0;
    }

    static {
        field_k = new qm(14, 0, 4, 1);
        field_p = "Unpacking sound effects";
        field_i = "When you match pieces, the machine transforms them into solid shapes.";
        field_h = "Show game chat from my friends";
        field_a = 2;
        field_f = 0;
    }
}
