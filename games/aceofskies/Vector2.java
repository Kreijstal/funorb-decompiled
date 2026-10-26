/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Vector2 {
    static int field_c;
    double x;
    double y;

    final static String a(String param0, String param1, ResourceArchive param2, int param3) {
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
        this.set(0.0, 0.0, true);
        if (param0 != 1) {
          this.d(60);
        }
    }

    final void setPolar256(double magnitude, double angle, int obfuscationGuard) {
        angle = angle * 3.141592653589793 / 128.0;
        this.x = magnitude * Math.sin(angle);
        if (obfuscationGuard <= 99) {
          this.y = -0.9803758533084136;
        }
        this.y = Math.cos(angle) * magnitude;
    }

    final double dot(Vector2 other, byte obfuscationGuard) {
        RuntimeException var3 = null;
        Vector2 var4 = null;
        double stackIn_3_0 = 0.0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -3) {
            var4 = (Vector2) null;
            this.subtract((Vector2) null, -117);
          }
          stackIn_3_0 = this.y * other.y + other.x * this.x;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kc.B(");
          if (other == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
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
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
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

    final double lengthSquared(int obfuscationGuard) {
        if (obfuscationGuard != 127) {
          this.x = -1.4009529146571602;
        }
        return this.x * this.x + this.y * this.y;
    }

    final double length(byte obfuscationGuard) {
        if (obfuscationGuard != -74) {
          return 1.5918164754456066;
        }
        return Math.sqrt(this.lengthSquared(127));
    }

    final void add(byte obfuscationGuard, Vector2 other) {
        try {
          this.y = this.y + other.y;
          this.x = this.x + other.x;
          if (obfuscationGuard != 103) {
            field_c = -5;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kc.C(" + obfuscationGuard + ',' + (other != null ? "{...}" : "null") + ')');
        }
    }

    final int angle255(int obfuscationGuard) {
        if (0.0 == this.x &&
          0.0 == this.y) {
          return 255;
        }
        if (obfuscationGuard != -113) {
          return -46;
        }
        return (int)(Math.atan2(this.y, this.x) * 255.0 / 3.141592653589793);
    }

    final void setFrom(Vector2 source, boolean obfuscationGuard) {
        try {
          this.x = source.x;
          this.y = source.y;
          if (!obfuscationGuard) {
            Vector2 var4 = (Vector2) null;
            this.setFrom((Vector2) null, true);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kc.M(" + (source != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final void set(double x, double y, boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.x = -0.3043247171709143;
        }
        this.y = y;
        this.x = x;
    }

    final void subtract(Vector2 other, int obfuscationGuard) {
        try {
          this.y = this.y - other.y;
          this.x = this.x - other.x;
          if (obfuscationGuard != -30507) {
            this.length((byte) -90);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kc.H(" + (other != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public Vector2() {
        this.d(1);
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
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
                var2 = BitmapFont.field_b[gr.field_h];
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

    Vector2(Vector2 source) {
        try {
          this.setFrom(source, true);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kc.<init>(" + (source != null ? "{...}" : "null") + ')');
        }
    }

    Vector2(double x, double y) {
        this.set(x, y, true);
    }

    static {
    }
}
