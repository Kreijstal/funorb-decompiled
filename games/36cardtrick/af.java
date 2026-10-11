/*
 * Decompiled by CFR-JS 0.4.0.
 */
class af extends ta implements qh {
    private ng field_kb;
    static int field_ob;
    private boolean field_qb;
    static int field_jb;
    private boolean field_lb;
    private boolean field_nb;
    private ee field_pb;
    private boolean field_mb;

    final void d(boolean param0) {
        this.field_kb.a(0, 4210752, 2121792);
        ui var2 = new ui(this, this.field_pb, dg.field_E);
        var2.a(sh.field_h, 15, -14);
        if (param0) {
          lk var3 = (lk) null;
          this.a('9', (byte) -80, 48, (lk) null);
        }
        this.c(var2, (byte) 110);
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -99) {
            this.d(true);
          }
          if (13 != param2) {
            stackIn_6_0 = super.a(param0, (byte) -106, param2, param3);
            return stackIn_6_0;
          }
          this.s(-122);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("af.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public void a(int param0, int param1, int param2, hl param3, int param4) {
        try {
          if (this.field_qb) {
            gh.a(3, 31888);
            this.s(13);
          } else {
            pa.a(mk.g(-125), "tochangedisplayname.ws", -61);
          }
          int var6_int = -72 % ((-62 - param1) / 32);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "af.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Main.field_T;
        try {
          var3_int = 0;
          var4 = qe.field_E;
          while (var3_int < me.field_a.length) {
            var5 = wd.field_d[var3_int];
            if (var5 < 0) {
              var4 = var4 + sa.field_d;
            } else {
              var6 = hj.a(false, true, me.field_a[var3_int]);
              var4 = var4 + e.field_i;
              var7 = -(var6 >> 1) + dl.field_g;
              if (vc.a(tl.field_b + (a.field_o << 1), param2, param0, var4, var7 - tc.field_b, 0, var6 + (tc.field_b << 1))) {
                stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (e.field_i + ((a.field_o << 1) + tl.field_b));
            }
            var3_int++;
          }
          if (!param1) {
            field_ob = -30;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "af.VB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void s(int param0) {
        int var2;
        var2 = 115 % ((param0 + 41) / 41);
        if (!this.field_E) {
          return;
        }
        this.field_E = false;
        if (this.field_lb) {
          ag.a(-9145);
        } else {
          if (this.field_nb) {
            ff.b(-96);
          }
        }
    }

    final static qj r(int param0) {
        if (param0 != 77) {
          return (qj) null;
        }
        return gh.field_k;
    }

    final static java.awt.Container t(int param0) {
        if (null != q.field_g) {
          return (java.awt.Container) ((Object) q.field_g);
        }
        if (param0 != 3) {
          return (java.awt.Container) null;
        }
        return (java.awt.Container) ((Object) mk.g(-120));
    }

    af(j param0, ee param1, String param2, boolean param3, boolean param4) {
        super(param0, new ui((af) null, param1, param2), 77, 10, 10);
        try {
          this.field_nb = param4 ? true : false;
          this.field_mb = false;
          this.field_lb = param3 ? true : false;
          this.field_pb = param1;
          this.field_qb = false;
          this.field_kb = new ng(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_kb.field_I = true;
          this.b(this.field_kb, (byte) 118);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "af.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 < 33) {
          CharSequence var5 = (CharSequence) null;
          af.a(-80, (CharSequence) null, (byte) 110);
        }
        if (param2) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param1) {
          var4++;
        }
        return sb.field_b[var4];
    }

    final static void a(ee param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, kc[] param11, int param12, kc[] param13, int param14, int param15, ee param16, int param17, int param18, int param19, kc[] param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          var21_int = 82 / ((-59 - param4) / 59);
          me.a(param0, param5, param16, param8, param3, param14, param9, new vg(param13), param12, param10, param2, param15, -26024, param17, param6, param7, new vg(param20), param18, param19, param1, new vg(param11));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("af.AC(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',');
          if (param20 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static int a(int param0, CharSequence param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 54) {
            stackIn_4_0 = bd.a(true, param1, (byte) 122, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -11;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("af.UB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(String param0, byte param1, int param2) {
        boolean stackIn_8_1 = false;
        ui stackIn_13_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ui var6 = null;
        var5 = Main.field_T;
        try {
          if (this.field_mb) {
            return;
          }
          if (param1 != -109) {
            af.r(87);
          }
          stackIn_8_1 = (param2 == 256);
          this.field_qb = stackIn_8_1;
          this.field_mb = true;
          this.field_kb.a(param1 + 109, 4210752, 8405024);
          var6 = new ui(this, this.field_pb, param0);
          if (param2 == 5) {
            var6.a(na.field_p, 11, -14);
            var6.a(pg.field_f, 17, -14);
          } else {
            if (param2 != 256) {
              stackIn_13_0 = var6;
              if (!this.field_lb) {
                stackIn_14_1 = uc.field_r;
              } else {
                stackIn_14_1 = tc.field_c;
              }
              ((ui) (Object) stackIn_13_0).a(stackIn_14_1, -1, -14);
            } else {
              var6.a((pl) (this), true, tc.field_c);
            }
          }
          if (param2 != 3) {
            if (param2 == 4) {
              var6.a(s.field_a, 8, -14);
            } else {
              if (param2 != 6) {
                if (param2 != 9) {
                  this.c(var6, (byte) 95);
                  return;
                }
                var6.a((pl) (this), true, wf.field_a);
              } else {
                var6.a(jh.field_a, 9, -14);
              }
            }
          } else {
            var6.a(sk.field_a, 7, -14);
          }
          this.c(var6, (byte) 95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("af.RB(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_ob = 0;
    }
}
