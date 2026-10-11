/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends pa {
    static dd[] field_t;
    static String field_x;
    private int[] field_u;
    private int[][] field_s;
    private String[] field_y;
    static long field_w;
    static dd field_v;
    static int field_q;
    int[] field_z;
    static String field_r;

    private final void a(ni param0, int param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        fh var7 = null;
        int var9 = 0;
        var9 = fleas.field_A ? 1 : 0;
        try {
          if (param2 != 4) {
            return;
          }
          if (param1 != 1) {
            if (param1 == 2) {
              var4_int = param0.e(false);
              this.field_z = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_z[var5] = param0.d((byte) -122);
              }
            } else if (param1 == 3) {
              var4_int = param0.e(false);
              this.field_s = new int[var4_int][];
              this.field_u = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param0.d((byte) -75);
                var7 = ql.a(param2 ^ -22467, var6);
                if (var7 != null) {
                  this.field_u[var5] = var6;
                  array$0 = new int[var7.field_c];
                  this.field_s[var5] = array$0;
                  for (var8 = 0; var7.field_c > var8; var8++) {
                    this.field_s[var5][var8] = param0.d((byte) -73);
                  }
                }
              }
            } else {
              if (param1 != 4) {
                return;
              }
            }
          } else {
            this.field_y = m.a('<', 123, param0.h(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("aj.E(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 != 0) {
          return;
        }
        try {
          ea.a(120, (java.awt.Component) ((Object) param1));
          il.a(false, (java.awt.Component) ((Object) param1));
          if (null != ui.field_pb) {
            ui.field_pb.a(0, (java.awt.Component) ((Object) param1));
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "aj.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = fleas.field_A ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (this.field_y == null) {
          return "";
        }
        if (param0 < 74) {
          String var5 = (String) null;
          aj.a((String) null, 106);
        }
        StringBuilder discarded$0 = var6.append(this.field_y[0]);
        for (var3 = 1; this.field_y.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var6.append(this.field_y[var3]);
        }
        return var2.toString();
    }

    final static void a(byte param0, Object param1, ce param2) {
        int var3_int = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        try {
          if (param2.field_a == null) {
            return;
          }
          if (param0 != -60) {
            field_x = (String) null;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param2.field_a.peekEvent()) {
              vh.a(1L, 49);
              continue;
            }
            break;
          }
          try {
            if (param1 != null) {
              param2.field_a.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("aj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void g(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = sg.field_i;
        synchronized (var1) {
          kc.field_f = lk.field_J;
          m.field_a = m.field_a + 1;
          ag.field_f = gd.field_a;
          kc.field_b = vf.field_p;
          pl.field_c = ag.field_a;
          ag.field_a = false;
          jk.field_r = vk.field_O;
          pb.field_d = fb.field_b;
          ob.field_e = th.field_s;
          vk.field_O = 0;
        }
        if (param0 != 28003) {
          field_x = (String) null;
        }
    }

    final void a(ni param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          if (param1 != 4) {
            return;
          }
          while (true) {
            var3_int = param0.e(false);
            if (var3_int == 0) {
              return;
            }
            this.a(param0, var3_int, 4);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("aj.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(CharSequence[] param0, int param1, byte param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (1 == param3) {
            var10 = param0[param1];
            var4 = var10;
            if (var4 != null) {
              stackIn_10_0 = var10.toString();
              return stackIn_10_0;
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param1 + param3;
          if (param2 >= -75) {
            field_w = -65L;
          }
          var5 = 0;
          for (var6_int = param1; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param1; var7 < var4_int; var7++) {
            var8 = param0[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_26_0 = var6.toString();
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("aj.F(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_r = null;
        field_x = null;
        int var1 = 34 % ((-22 - param0) / 33);
        field_v = null;
    }

    final static ve a(String param0, int param1) {
        RuntimeException var2 = null;
        ce var3 = null;
        ve stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (uc.field_c.a(-48) &&
            !param0.equals(uc.field_c.c(param1 - 16954))) {
            uc.field_c = pk.a((byte) 68, param0);
          }
          if (param1 != -1) {
            var3 = (ce) null;
            aj.a((byte) -26, (Object) null, (ce) null);
          }
          stackIn_7_0 = uc.field_c;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("aj.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    aj() {
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        if (null != this.field_z) {
          for (var2 = 0; this.field_z.length > var2; var2++) {
            this.field_z[var2] = ne.a(this.field_z[var2], 32768);
          }
        }
        if (param0 != 0) {
          aj.g(-113);
        }
    }

    static {
        field_x = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_r = "Email address is unavailable";
    }
}
