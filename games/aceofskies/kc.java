/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_c;
    double field_a;
    double field_b;

    final static String a(String param0, String param1, gk param2, int param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 31) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (param2.b((byte) -127)) {
            stackIn_7_0 = param0 + " - " + param2.a(-85) + "%";
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("kc.I(");
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
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void d(int param0) {
        this.a(0.0, 0.0, true);
        if (param0 != 1) {
          this.d(60);
        }
    }

    final void a(double param0, double param1, int param2) {
        param1 = param1 * 3.141592653589793 / 128.0;
        this.field_a = param0 * Math.sin(param1);
        if (param2 <= 99) {
          this.field_b = -0.9803758533084136;
        }
        this.field_b = Math.cos(param1) * param0;
    }

    final double a(kc param0, byte param1) {
        RuntimeException var3 = null;
        kc var4 = null;
        double stackIn_3_0 = 0.0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -3) {
            var4 = (kc) null;
            this.a((kc) null, -117);
          }
          stackIn_3_0 = this.field_b * param0.field_b + param0.field_a * this.field_a;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kc.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          var2_int = param0.charAt(0);
          if (param1 != 26035) {
            field_c = 0;
          }
          var3 = 1;
          while (true) {
            if (var3 >= param0.length()) {
              return true;
            }
            if (var2_int == param0.charAt(var3)) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("kc.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final double b(int param0) {
        if (param0 != 127) {
          this.field_a = -1.4009529146571602;
        }
        return this.field_a * this.field_a + this.field_b * this.field_b;
    }

    final double a(byte param0) {
        if (param0 != -74) {
          return 1.5918164754456066;
        }
        return Math.sqrt(this.b(127));
    }

    final void a(byte param0, kc param1) {
        try {
          this.field_b = this.field_b + param1.field_b;
          this.field_a = this.field_a + param1.field_a;
          if (param0 != 103) {
            field_c = -5;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0) {
        if (0.0 == this.field_a &&
          0.0 == this.field_b) {
          return 255;
        }
        if (param0 != -113) {
          return -46;
        }
        return (int)(Math.atan2(this.field_b, this.field_a) * 255.0 / 3.141592653589793);
    }

    final void a(kc param0, boolean param1) {
        try {
          this.field_a = param0.field_a;
          this.field_b = param0.field_b;
          if (!param1) {
            kc var4 = (kc) null;
            this.a((kc) null, true);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kc.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(double param0, double param1, boolean param2) {
        if (!param2) {
          this.field_a = -0.3043247171709143;
        }
        this.field_b = param1;
        this.field_a = param0;
    }

    final void a(kc param0, int param1) {
        try {
          this.field_b = this.field_b - param0.field_b;
          this.field_a = this.field_a - param0.field_a;
          if (param1 != -30507) {
            this.a((byte) -90);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public kc() {
        this.d(1);
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          var1 = ua.field_d;
          synchronized (var1) {
            he.field_n = he.field_n + 1;
            ch.field_a = lt.field_u;
            if (param0 > fb.field_a) {
              for (var2 = 0; var2 < 112; var2++) {
                lp.field_a[var2] = false;
              }
              fb.field_a = gr.field_h;
            } else {
              while (fb.field_a != gr.field_h) {
                var2 = da.field_b[gr.field_h];
                gr.field_h = 127 & gr.field_h + 1;
                if (var2 < 0) {
                  lp.field_a[~var2] = false;
                  continue;
                }
                lp.field_a[var2] = true;
              }
            }
            lt.field_u = nl.field_w;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1_ref), "kc.E(" + param0 + ')');
        }
    }

    kc(kc param0) {
        try {
          this.a(param0, true);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    kc(double param0, double param1) {
        this.a(param0, param1, true);
    }

    static {
    }
}
