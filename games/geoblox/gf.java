/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int field_f;
    static int field_a;
    static int[] field_c;
    static int[] field_b;
    static qh field_d;
    static String field_e;

    final static void a(byte param0) {
        int var2 = 78 % ((-69 - param0) / 46);
        nj var4 = (nj) ((Object) pb.field_t.g(0));
        var4 = var4;
        if (var4 == null) {
            return;
        }
        eh.field_c = 480;
        kj.field_J = 0;
        jf.field_c = 72 + dd.field_G.c(pg.field_a[var4.field_h], 100);
        tl.field_h = 30 * dd.field_G.b(pg.field_a[var4.field_h], 100) + 30;
        if (62 > tl.field_h) {
            tl.field_h = 62;
            return;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (param0) {
            field_c = null;
            field_e = null;
            return;
        }
        String var2 = (String) null;
        gf.a((String) null, (rh) null, (String) null, (String) null, true);
        field_c = null;
        field_e = null;
    }

    final static void a(ja param0, int param1, float param2) {
        float var3_float = 0.0f;
        float var4 = 0.0f;
        try {
            var3_float = -320.0f + param0.field_o;
            var4 = param0.field_v - 240.0f;
            ng.field_G = (int)(0.5 + (Math.cos((double)param2) * (double)var3_float - Math.sin((double)param2) * (double)var4 + 320.0));
            if (param1 != -1232328029) {
                java.applet.Applet var5 = (java.applet.Applet) null;
                gf.a((java.applet.Applet) null, 60);
            }
            td.field_E = (int)(240.0 + (Math.sin((double)param2) * (double)var3_float + (double)var4 * Math.cos((double)param2)) + 0.5);
            vf.field_L.e();
            vb.c();
            param0.field_J.b(param0.field_J.field_s << 3, param0.field_J.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)(65535.0 * ((double)(-param2 + param0.field_u) / 6.283185307179586)), 4096);
            sh.field_y.a(255);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "gf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param1 != 62) {
                field_f = 11;
              }
              try {
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(wf.a(var2, 102, param0), "_top");
                return;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_8_0 = (RuntimeException) (var2_ref2);
              stackIn_8_1 = new StringBuilder().append("gf.D(");
              if (param0 == null) {
                stackIn_9_2 = "null";
              } else {
                stackIn_9_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        pk var2 = null;
        if (param1 >= 28) {
            var2 = fj.field_q;
            var2.a(param0, (byte) -103);
            var2.d((byte) 127, 1);
            var2.d((byte) -20, 0);
            return;
        }
        field_e = (String) null;
        var2 = fj.field_q;
        var2.a(param0, (byte) -103);
        var2.d((byte) 127, 1);
        var2.d((byte) -20, 0);
    }

    final static String a(String param0, rh param1, String param2, String param3, boolean param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4) {
            field_b = (int[]) null;
          }
          if (!param1.a(0)) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = param3 + " - " + param1.a(0, param2) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var5);
          stackIn_10_1 = new StringBuilder().append("gf.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (param0 != 240) {
            field_b = (int[]) null;
            return v.field_e;
        }
        return v.field_e;
    }

    static {
        field_f = 0;
        field_c = new int[128];
        field_a = 0;
        field_b = new int[8192];
        field_e = "This password contains your Player Name, and would be easy to guess";
    }
}
