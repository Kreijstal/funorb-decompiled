/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends gb {
    static String field_v;
    static String field_o;
    static bc field_u;
    int[] field_r;
    static char[] field_q;
    private int[][] field_t;
    private String[] field_s;
    static String field_w;
    static String field_x;
    private int[] field_p;

    private final void a(be param0, int param1, boolean param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        aa var7 = null;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          if (param1 == 1) {
            this.field_s = te.a(param0.g(0), '<', (byte) -94);
          } else {
            if (2 == param1) {
              var4_int = param0.h(16383);
              this.field_r = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_r[var5] = param0.d((byte) -66);
              }
            } else {
              if (param1 == 3) {
                var4_int = param0.h(16383);
                this.field_p = new int[var4_int];
                this.field_t = new int[var4_int][];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = param0.d((byte) -79);
                  var7 = dk.a(var6, (byte) 25);
                  if (var7 != null) {
                    this.field_p[var5] = var6;
                    array$0 = new int[var7.field_b];
                    this.field_t[var5] = array$0;
                    for (var8 = 0; var7.field_b > var8; var8++) {
                      this.field_t[var5][var8] = param0.d((byte) -78);
                    }
                  }
                }
              } else {
                if (param1 != 4) {
                }
              }
            }
          }
          if (param2) {
            ob.h(-53);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ob.H(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_x = null;
        field_w = null;
        field_u = null;
        field_o = null;
        if (param0 != -68) {
          field_q = (char[]) null;
        }
        field_q = null;
        field_v = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          wd.field_R = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          if (param0 != 209) {
            field_w = (String) null;
          }
          dh.a(var3, var4, param1, var2, 1000);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ob.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0 != 2) {
          this.a((byte) 10);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_s == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_s[0]);
        for (var3 = 1; var3 < this.field_s.length; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_s[var3]);
        }
        return var2.toString();
    }

    final void a(boolean param0, be param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          if (param0) {
            field_x = (String) null;
          }
          while (true) {
            var3_int = param1.h(16383);
            if (var3_int == 0) {
              return;
            }
            this.a(param1, var3_int, false);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ob.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, float param2, String param3) {
        if (param1 != 209) {
          return;
        }
        try {
          if (null == ib.field_e) {
            ib.field_e = new rk(gl.field_E, tk.field_r);
            gl.field_E.d((byte) -97, ib.field_e);
          }
          ib.field_e.a(param3, (byte) 88, param0, param2);
          ll.a();
          lh.a(true, 66);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ob.K(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        if (param0 != 32768) {
          field_u = (bc) null;
        }
        if (null != this.field_r) {
          for (var2 = 0; var2 < this.field_r.length; var2++) {
            this.field_r[var2] = ok.a(this.field_r[var2], 32768);
          }
        }
    }

    final static ve a(int param0, String param1) {
        int var2_int = 0;
        String var3 = null;
        ve var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        ve stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          if (null == ag.field_d) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            stackIn_7_0 = null;
            return (ve) (stackIn_7_0);
          }
          var2_int = -100 % ((-10 - param0) / 50);
          var7 = (CharSequence) ((Object) param1);
          var3 = r.a(var7, -11133);
          if (var3 == null) {
            stackIn_10_0 = null;
            return (ve) (stackIn_10_0);
          }
          var4 = (ve) (ag.field_d.a(-1, (long)var3.hashCode()));
          while (true) {
            if (var4 == null) {
              return null;
            }
            var8 = (CharSequence) ((Object) var4.field_jb);
            var5 = r.a(var8, -11133);
            if (!var5.equals(var3)) {
              var4 = (ve) (ag.field_d.a(-1));
              continue;
            }
            break;
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 != -26998) {
          return false;
        }
        ka.field_a = true;
        rk.field_eb = qg.a(false) + 15000L;
        return rl.field_N == 11 ? true : false;
    }

    final static void h(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 != 16473) {
            ob.g(-53);
          }
          var1 = cj.field_o;
          synchronized (var1) {
            mb.field_f = mb.field_f + 1;
            lj.field_d = fc.field_d;
            if (mg.field_f < 0) {
              for (var2 = 0; var2 < 112; var2++) {
                ni.field_m[var2] = false;
              }
              mg.field_f = hb.field_f;
            } else {
              while (hb.field_f != mg.field_f) {
                var2 = md.field_b[hb.field_f];
                hb.field_f = hb.field_f + 1 & 127;
                if (var2 < 0) {
                  ni.field_m[~var2] = false;
                  continue;
                }
                ni.field_m[var2] = true;
              }
            }
            fc.field_d = ri.field_V;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1_ref), "ob.F(" + param0 + ')');
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 100) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var2 = ue.a(vh.a((byte) -127, param1), (byte) 76);
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ob.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    ob() {
    }

    static {
        field_v = "Please check if address is correct";
        field_o = "Level value <%0> + Time bonus <%1> = <%2>";
        field_x = "You have 1 unread message!";
        field_q = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_w = "Waiting for music";
    }
}
