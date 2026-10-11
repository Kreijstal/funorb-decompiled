/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends sp implements ca, ai {
    static ri field_C;
    static int field_H;
    private uk field_G;
    private wp field_D;
    static hr field_B;
    private ar field_F;

    final boolean a(pk param0, char param1, byte param2, int param3) {
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.a(param0, param1, (byte) 60, param3)) {
            return true;
          }
          if (98 == param3) {
            stackIn_7_0 = this.a((byte) -94, param0);
            return stackIn_7_0;
          }
          if (param3 == 99) {
            stackIn_10_0 = this.a(param0, false);
            return stackIn_10_0;
          }
          if (param2 < 9) {
            th.e(false);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("th.KA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    th(uk param0) {
        super(0, 0, 288, 0, (mh) null);
        RuntimeException runtimeException = null;
        int var3 = 0;
        gm var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_G = param0;
          this.field_D = new wp(wd.field_h, (qm) null);
          this.field_D.field_w = (mh) ((Object) new ue());
          var7 = ic.a(qv.field_l, new String[]{this.a((byte) 43), this.g(116)}, (byte) -128);
          var3 = 20;
          var4 = new gm(kw.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, kw.field_b.field_s, -1, 2147483647, true);
          this.field_F = new ar(var7, var4);
          this.field_F.field_t = "";
          this.field_F.a(-57, sb.field_e, 0);
          this.field_F.a(-66, sb.field_e, 1);
          this.field_F.field_o = (qm) (this);
          this.field_F.field_q = -40 + this.field_q;
          this.field_F.a(var3, false, 26, -40 + this.field_q);
          var3 = var3 + (15 + this.field_F.field_p);
          this.a(this.field_F, 99);
          var5 = 4;
          var6 = 200;
          this.field_D.a(-79, 300 - var6 >> 1, var3, 40, var6);
          this.field_D.field_o = (qm) (this);
          this.a(this.field_D, 76);
          this.a(-112, 0, 0, 55 + var3 + var5, 300);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("th.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void b(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 1 << param2;
          if ((var3_int & kh.field_e) != 0) {
            return;
          }
          kh.field_e = kh.field_e | var3_int;
          wj.field_e = wj.field_e | var3_int;
          pl.field_v.a((ms) (new ge(param2)), (byte) 39);
          if (gj.a((byte) -84, 10) >= 5) {
            fb.field_a = fb.field_a + iw.field_b;
          } else {
            ha.field_f = ha.field_f + iw.field_b;
          }
          if (gj.a((byte) -84, 10) < 5) {
            ts.field_a = ts.field_a - te.field_c;
          } else {
            kn.field_b = kn.field_b - te.field_c;
          }
          ia.a(param2, (byte) -82);
          if (param0 != 24753) {
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          if (3 == param2) {
            kn.field_b = kn.field_b - ld.field_C;
            ha.field_f = ha.field_f + oh.field_e;
            ts.field_a = ts.field_a - nq.field_i;
          } else {
            if (param2 != 4 &&
              param2 != 5 &&
              6 != param2 &&
              param2 != 7) {
              if (param2 == 10) {
                ha.field_f = ha.field_f + oh.field_e;
              } else {
                if ((param2 == 0 ||
                  param2 == 1 ||
                  2 == param2)) {
                  fb.field_a = fb.field_a + oh.field_e;
                }
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              ts.field_a = ts.field_a + nq.field_i;
            }
          }
          if (!f.field_w) {
            pn.field_q.a((ms) (new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b)), (byte) 39);
          }
          boolean decompiledFrameRemainder0 = true;
          if (3 != param2) {
            if (param2 != 4 &&
              param2 != 5 &&
              6 != param2 &&
              param2 != 7) {
              if (10 == param2) {
                ha.field_f = ha.field_f - oh.field_e;
              } else {
                if ((param2 == 0 ||
                  param2 == 1 ||
                  param2 == 2)) {
                  fb.field_a = fb.field_a - oh.field_e;
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              ts.field_a = ts.field_a - nq.field_i;
            }
          } else {
            kn.field_b = kn.field_b + ld.field_C;
            ha.field_f = ha.field_f - oh.field_e;
            ts.field_a = ts.field_a + nq.field_i;
          }
          if (5 > gj.a((byte) -84, 10)) {
            ha.field_f = ha.field_f - iw.field_b;
          } else {
            fb.field_a = fb.field_a - iw.field_b;
          }
          if (gj.a((byte) -84, 10) >= 5) {
            kn.field_b = kn.field_b + te.field_c;
            return;
          }
          ts.field_a = ts.field_a + te.field_c;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "th.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, ar param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 == 0) {
            hn.a((byte) 113, "terms.ws");
          } else {
            if (1 == param0) {
              hn.a((byte) 80, "privacy.ws");
            } else {
              if (param0 == 2) {
                hn.a((byte) 98, "conduct.ws");
              }
            }
          }
          if (param3 == -20036) {
            return;
          }
          this.field_G = (uk) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("th.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String g(int param0) {
        RuntimeException var2 = null;
        ar var3 = null;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 2) {
            var3 = (ar) null;
            this.a(-104, (ar) null, -45, 28);
          }
          stackIn_3_0 = "</col></u>";
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "th.H(" + param0 + ')');
        }
    }

    final static void e(boolean param0) {
        try {
          ha.field_d = fd.field_i + " <b>" + km.field_m + "</b> " + ws.field_a + " <b>" + up.field_b + "</b> " + oh.field_b + "<br>" + "<br>" + c.field_q;
          if (!param0) {
            th.e(false);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "th.I(" + param0 + ')');
        }
    }

    private final String a(byte param0) {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 75 / ((-65 - param0) / 44);
          stackIn_1_0 = "<u=2164A2><col=2164A2>";
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "th.F(" + param0 + ')');
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == this.field_D) {
            kh.a(false);
            this.field_G.n(-7);
          }
          if (param1 == 710) {
            return;
          }
          th.f(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("th.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void f(boolean param0) {
        try {
          if (param0) {
            th.b(82, -23, -57);
          }
          field_C = null;
          field_B = null;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "th.G(" + param0 + ')');
        }
    }

    static {
        field_H = 0;
    }
}
