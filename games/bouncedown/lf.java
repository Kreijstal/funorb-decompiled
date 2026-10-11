/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends gj {
    static hc field_q;
    wi field_p;
    int field_t;
    byte field_s;
    static int[][] field_r;

    final byte[] d(byte param0) {
        if (!this.field_n &&
          this.field_p.field_h >= this.field_p.field_i.length - this.field_s) {
          if (param0 < -106) {
            return this.field_p.field_i;
          }
          return (byte[]) null;
        }
        throw new RuntimeException();
    }

    final static jk a(ii param0, byte param1) {
        int var7 = 0;
        jk stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        jk var5 = null;
        int var6 = 0;
        int var8 = 0;
        ii var9 = null;
        var8 = Bounce.field_N;
        try {
          var2_int = param0.f(7, 8);
          if (param1 > -32) {
            var9 = (ii) null;
            lf.a((ii) null, (byte) -64);
          }
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = re.a(95, param0) ? 1 : 0;
          var4 = re.a(38, param0) ? 1 : 0;
          var5 = new jk();
          var5.field_k = (short)param0.f(7, 16);
          var5.field_g = ne.a(0, 16, var5.field_g, param0);
          var5.field_C = ne.a(0, 16, var5.field_C, param0);
          var5.field_J = ne.a(0, 16, var5.field_J, param0);
          var5.field_L = (short)param0.f(7, 16);
          var5.field_O = ne.a(0, 16, var5.field_O, param0);
          var5.field_P = ne.a(0, 16, var5.field_P, param0);
          var5.field_l = ne.a(0, 16, var5.field_l, param0);
          if (var3 != 0) {
            var5.field_d = (short)param0.f(7, 16);
            var5.field_f = ne.a(0, 16, var5.field_f, param0);
            var5.field_i = ne.a(0, 16, var5.field_i, param0);
            var5.field_x = ne.a(0, 16, var5.field_x, param0);
            var5.field_F = ne.a(0, 16, var5.field_F, param0);
            var5.field_I = ne.a(0, 16, var5.field_I, param0);
            var5.field_Q = ne.a(0, 16, var5.field_Q, param0);
          }
          if (var4 != 0) {
            param0.f(7, 16);
            var5.field_u = ne.a(0, 16, var5.field_u, param0);
            var5.field_s = ne.a(0, 16, var5.field_s, param0);
            var5.field_y = ne.a(0, 16, var5.field_y, param0);
            var5.field_B = ne.a(0, 16, var5.field_B, param0);
            var5.field_b = ne.a(0, 16, var5.field_b, param0);
          }
          if (re.a(91, param0)) {
            var5.field_p = ne.a(0, 16, var5.field_p, param0);
          }
          if (re.a(106, param0)) {
            var5.field_v = qg.a(true, var5.field_v, 16, param0);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_v.length; var7++) {
              if ((255 & var5.field_v[var7]) > var6) {
                var6 = var5.field_v[var7] & 255;
              }
            }
            if (0 != var6) {
              var5.field_w = (byte)(1 + var6);
            } else {
              var5.field_v = null;
            }
          }
          stackIn_26_0 = var5;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("lf.D(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final static byte a(char param0, byte param1) {
        int var2;
        int var3;
        int var4;
        {
          var4 = Bounce.field_N;
          var3 = 35 / ((23 - param1) / 57);
          if ((param0 <= 0 ||
            128 <= param0) && (param0 < 160 ||
            param0 > 255)) {
            if (param0 == 8364) {
              var2 = -128;
            } else if (8218 == param0) {
              var2 = -126;
            } else if (param0 == 402) {
              var2 = -125;
            } else if (param0 == 8222) {
              var2 = -124;
            } else if (param0 == 8230) {
              var2 = -123;
            } else if (param0 == 8224) {
              var2 = -122;
            } else if (param0 == 8225) {
              var2 = -121;
            } else if (param0 == 710) {
              var2 = -120;
            } else if (8240 == param0) {
              var2 = -119;
            } else if (param0 == 352) {
              var2 = -118;
            } else if (param0 == 8249) {
              var2 = -117;
            } else if (param0 == 338) {
              var2 = -116;
            } else if (param0 == 381) {
              var2 = -114;
            } else if (8216 == param0) {
              var2 = -111;
            } else if (8217 == param0) {
              var2 = -110;
            } else if (param0 == 8220) {
              var2 = -109;
            } else if (param0 == 8221) {
              var2 = -108;
            } else if (param0 == 8226) {
              var2 = -107;
            } else if (8211 == param0) {
              var2 = -106;
            } else if (param0 == 8212) {
              var2 = -105;
            } else if (param0 == 732) {
              var2 = -104;
            } else if (8482 == param0) {
              var2 = -103;
            } else if (param0 == 353) {
              var2 = -102;
            } else if (param0 == 8250) {
              var2 = -101;
            } else if (339 == param0) {
              var2 = -100;
            } else if (382 == param0) {
              var2 = -98;
            } else if (param0 != 376) {
              var2 = 63;
            } else {
              var2 = -97;
            }
          } else {
            var2 = (byte)param0;
          }
        }
        return (byte) var2;
    }

    public static void a(boolean param0) {
        field_q = null;
        field_r = (int[][]) null;
        if (param0) {
          lf.a('￙', (byte) -105);
        }
    }

    final int c(byte param0) {
        if (null == this.field_p) {
          return 0;
        }
        if (param0 >= -100) {
          return -110;
        }
        return 100 * this.field_p.field_h / (this.field_p.field_i.length - this.field_s);
    }

    lf() {
    }

    final static void a(ai param0, ai param1, int param2) {
        try {
          if (null != param1.field_f) {
            param1.c(2);
          }
          if (param2 != -17957) {
            lf.a(true);
          }
          param1.field_f = param0.field_f;
          param1.field_c = param0;
          param1.field_f.field_c = param1;
          param1.field_c.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "lf.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static ld a(int param0, int param1) {
        ld var2 = new ld();
        if (param0 >= -59) {
          ai var3 = (ai) null;
          lf.a((ai) null, (ai) null, 33);
        }
        ne.field_r.a(1, var2);
        ea.a(2, param1);
        return var2;
    }

    static {
    }
}
