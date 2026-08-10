/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends hf {
    static int field_db;
    static int field_bb;
    static byte[] field_gb;
    static String field_fb;
    static int field_ab;
    static int field_hb;
    static String field_jb;
    private double field_ib;
    private int field_eb;
    private oi field_kb;
    private hm[] field_cb;

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        try {
            this.a(-116, cd.field_o[(this.field_eb & 15) >> -763594655], param1, param3);
            if (param2 >= -5) {
                field_bb = 59;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "wm.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(hm param0, boolean param1) {
        int var3_int = 0;
        hm var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1) {
                break L1;
              } else {
                field_hb = 92;
                break L1;
              }
            }
            L2: while (true) {
              if (this.field_cb.length <= var3_int) {
                break L0;
              } else {
                L3: {
                  var4 = this.field_cb[var3_int];
                  if (var4.c((byte) 125)) {
                    break L3;
                  } else {
                    var4.a(8401151, 0, 50.0, 1.0);
                    if (!var4.a(this.field_cb, false, 15.0)) {
                      break L3;
                    } else {
                      this.field_A.field_B.field_Db = this.field_A.field_B.field_Db + 2.0;
                      var4.field_Q.field_m = 96;
                      this.field_A.field_F.a((rk) (var4), (byte) 72);
                      break L3;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("wm.CA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    wm(hn param0, dj param1, double[] param2, double param3, boolean param4) {
        super(param0, param1.field_E + param2[9] * param1.field_C, param1.field_t + param2[10] * param1.field_C, param1.field_D + param1.field_C * param2[11], 0.4 * param3, 0.2 * param3, param1, param3 * 128.0, 0.01);
        double var7_double = 0.0;
        this.field_eb = 0;
        this.field_kb = new oi((pm) (this));
        this.field_cb = new hm[]{new hm((pm) (this), ki.field_a), new hm((pm) (this), ki.field_a), new hm((pm) (this), ki.field_a)};
        try {
            this.field_G = param1.field_G + param2[10] * 0.4;
            this.field_K = 0.4 * param2[9] + param1.field_K;
            this.field_L = 0.4 * param2[11] + param1.field_L;
            if (param4) {
                var7_double = Math.sqrt(this.field_K * this.field_K + this.field_G * this.field_G + this.field_L * this.field_L);
                if (0.001 > var7_double) {
                    var7_double = 0.001;
                }
                this.field_W = param1.a(this.field_K / var7_double, this.field_G / var7_double, this.field_L / var7_double, false);
            }
            gd.a((int)(param3 * 96.0), -125, vm.field_cb, param1);
            new gk((pm) (this), pn.field_k).field_w = 8.0 * param3;
            this.field_ib = param3 * 32.0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "wm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 72) {
                break L1;
              } else {
                field_ab = 32;
                break L1;
              }
            }
            stackIn_3_0 = param0.f(param1 ^ -61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wm.WA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void n(int param0) {
        field_fb = null;
        field_jb = null;
        field_gb = null;
        if (param0 != -30002) {
            wm.n(103);
        }
    }

    final void b(ee param0, int param1) {
        hm var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 != this.field_R) {
                break L1;
              } else {
                if ((this.field_Q ^ -1) >= -1) {
                  break L1;
                } else {
                  this.field_Q = this.field_Q + 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              this.field_ib = param0.a(14170, true, this.field_ib);
              if (0.00001 > this.field_ib) {
                this.a(param0, 0.0, -101);
                param0.a(14170, false, this.field_V);
                this.d(10797);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 < -122) {
                break L3;
              } else {
                var4 = (hm) null;
                this.a((hm) null, true);
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("wm.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void g(int param0) {
        mb var2 = new mb((pm) (this), 6.0, 0.3, 0.0003, jd.field_a);
        var2.field_M.field_w = this.field_C / 0.4 * 4.0;
        ri.a((rk) (this), 0, var2);
        if (param0 != 26402) {
            this.field_cb = (hm[]) null;
        }
        this.field_z = true;
    }

    final void a(int param0, int param1) {
        this.field_eb = this.field_eb + 1;
        super.a(param0, param1);
        if (!(this.field_D < this.field_A.field_x.field_r[-1 + this.field_A.field_x.field_a])) {
            this.field_z = true;
            this.field_s = 2;
        }
    }

    final static nf a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        if (!param1) {
            wm.a(-107, false, -49);
        }
        nf var6 = new nf(param0, param0);
        nf var3 = var6;
        for (var4 = 0; var4 < var3.field_z.length; var4++) {
            var6.field_z[var4] = param2;
        }
        return var3;
    }

    final void a(mn param0, byte param1) {
        try {
            int var3_int = 111 % ((-2 - param1) / 62);
            this.field_kb.field_o = this.field_t;
            this.field_kb.field_p = this.field_D;
            this.field_kb.field_t = this.field_E;
            this.field_kb.field_u = 100.0 * this.field_C;
            param0.a((rk) (this.field_kb), (byte) -74);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "wm.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 27) {
                break L1;
              } else {
                field_hb = -83;
                break L1;
              }
            }
            stackIn_3_0 = mn.field_e.a(-98, "", param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wm.H(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_gb = new byte[240640];
        field_fb = "<col=FFFFFF>Rapid fire:</col> this radically increases your basic weapon's firing rate. Remember you can't fire continuously without your ready energy meter running out, so time your firing carefully.";
        field_hb = 0;
    }
}
