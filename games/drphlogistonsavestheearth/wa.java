/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends pj implements kd, ke {
    private hf field_P;
    static int field_N;
    private hf field_S;
    private kl field_L;
    private String field_J;
    static int[] field_Q;
    static int field_R;
    static he[] field_O;
    private boolean field_U;
    private hf field_K;
    private boolean field_V;
    private boolean field_T;
    private kl field_M;

    public final void a(kl param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 83) {
            return;
          }
          if (param0 == this.field_L) {
            this.field_M.a(false, (vg) (this));
          }
          if (param0 == this.field_M) {
            this.g((byte) -121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wa.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_Q = null;
        if (param0 != -11179) {
          wa.$cfr$intArgs$a$b925f3f4834c(75, false);
        }
        field_O = null;
    }

    private final void g(byte param0) {
        if (na.b(-1) ||
          !(0 >= this.field_L.field_p.length()) &&
          !(this.field_M.field_p.length() <= 0)) {
          pc.a(param0 ^ 32, this.field_L.field_p, this.field_M.field_p);
        }
        if (param0 != -121) {
          this.g((byte) -63);
        }
    }

    final void i(int param0) {
        if (param0 != 134) {
          this.field_P = (hf) null;
        }
        this.field_L.h((byte) 88);
        this.field_M.h((byte) 88);
    }

    public final void a(boolean param0, kl param1) {
        try {
          if (!param0) {
            field_O = (he[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "wa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(boolean param0) {
        if (param0) {
          this.g((byte) 79);
        }
        if (null == this.field_L.field_p) {
          return "";
        }
        return this.field_L.field_p;
    }

    final static void a(String param0, boolean param1, java.applet.Applet param2, byte param3) {
        try {
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (param3 != 9) {
              wa.a((byte) 5);
            }
            if (bl.field_r.startsWith("win") &&
              og.a(param0, 0)) {
              return;
            }
            try {
              param2.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              gb.a((Throwable) null, "MGR1: " + param0, 10);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("wa.H(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (null != this.field_J) {
          uh.field_i.a(this.field_J, 20 + (param0 + this.field_o), this.field_m + (param3 + 15), this.field_w - 40, this.field_k, 16777215, -1, 1, 0, uh.field_i.field_x);
        }
        if (null != this.field_K) {
          wj.g(10 + param0, param3 + 134, -20 + this.field_w, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    wa(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (cg) null);
        dh dupTemp$0 = null;
        dh dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        hf stackIn_18_1 = null;
        hf stackIn_18_2 = null;
        hf stackIn_19_1 = null;
        hf stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ie var6 = null;
        RuntimeException var6_ref = null;
        rf var7 = null;
        String var8 = null;
        sd var9 = null;
        dh var12 = null;
        dh var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_V = stackIn_4_1;
          this.field_J = param1;
          stackIn_7_1 = (param2);
          this.field_T = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_U = stackIn_10_1;
          if (this.field_T && (this.field_V ||
            this.field_U)) {
            throw new IllegalStateException();
          }
          this.field_L = (kl) ((Object) new qg(param0, (fd) (this), 100));
          this.field_M = (kl) ((Object) new qg("", (fd) (this), 20));
          if (!this.field_T) {
            this.field_S = new hf(rc.field_b, (fd) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_U) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = f.field_m;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ml.field_m;
            }
            this.field_P = new hf(stackIn_19_3, (fd) null);
            if (this.field_V) {
              this.field_K = new hf(ai.field_v, (fd) (this));
            }
          } else {
            this.field_S = new hf(DrPhlogistonSavesTheEarth.field_E, (fd) null);
            this.field_P = new hf(qk.field_d, (fd) null);
            this.field_L.field_E = false;
          }
          this.field_L.field_l = (cg) ((Object) new mj(10000536));
          this.field_M.field_l = (cg) ((Object) new dm(10000536));
          var6 = new ie();
          this.field_S.field_l = (cg) ((Object) var6);
          if (null != this.field_P) {
            this.field_P.field_l = (cg) ((Object) var6);
          }
          this.field_L.field_v = bf.field_x;
          if (this.field_K != null) {
            this.field_K.field_l = (cg) ((Object) var6);
          }
          if (null != this.field_K) {
            this.field_K.field_v = ai.field_w;
          }
          if (!this.field_T) {
            if (!this.field_U) {
              this.field_P.field_l = (cg) ((Object) new uk());
            } else {
              this.field_P.field_v = v.field_X;
              this.field_P.field_l = (cg) ((Object) new uk());
            }
          } else {
            this.field_P.field_v = ka.field_l;
          }
          this.field_m = 15;
          var7 = uh.field_i;
          if (this.field_J != null) {
            this.field_m = this.field_m + (var7.a(this.field_J, -40 + this.field_w, var7.field_x) + 5);
          }
          var8 = ij.field_b;
          var9 = dg.a(nb.a(-117), (byte) -87);
          if (var9 == p.field_d) {
            var8 = rc.field_c;
          } else {
            if (var9 == ka.field_q) {
              var8 = gk.field_b;
            }
          }
          dupTemp$0 = new dh(10, this.field_m, this.field_w - 20, 25, this.field_L, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b(dupTemp$0, (byte) 53);
          this.field_m = this.field_m + (((vg) ((Object) var12)).field_k + 5);
          dupTemp$1 = new dh(10, this.field_m, -20 + this.field_w, 25, this.field_M, false, 80, 3, var7, 16777215, qf.field_a);
          var13 = dupTemp$1;
          this.b(dupTemp$1, (byte) 77);
          this.field_m = this.field_m + (((vg) ((Object) var13)).field_k + 5);
          this.field_S.field_u = (fd) (this);
          if (this.field_K != null) {
            this.field_K.field_u = (fd) (this);
          }
          if (this.field_P != null) {
            this.field_P.field_u = (fd) (this);
          }
          if (null != this.field_K) {
            this.field_S.a(this.field_m, 30, 85, 16535, -95 + this.field_w);
            this.field_m = this.field_m + 60;
          } else {
            this.field_S.a(this.field_m, 30, 8, 16535, -16 + this.field_w);
            this.field_m = this.field_m + 35;
          }
          if (this.field_K != null) {
            this.field_K.a(this.field_m, 30, 8, 16535, -6 + (this.field_w - 10));
            this.field_m = this.field_m + 35;
          }
          if (this.field_P != null) {
            if (!this.field_T &&
              !this.field_U) {
              this.field_P.a(this.field_m, 20, 8, 16535, 40);
              this.field_m = this.field_m + 25;
            } else {
              this.field_P.a(this.field_m, 30, 8, 16535, -6 + (this.field_w - 10));
              this.field_m = this.field_m + 35;
            }
          }
          this.a(0, 3 + this.field_m, 0, 16535, this.field_w);
          this.b(this.field_S, (byte) 89);
          if (null != this.field_K) {
            this.b(this.field_K, (byte) 90);
          }
          if (this.field_P != null) {
            this.b(this.field_P, (byte) 54);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("wa.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, 72)) {
            return true;
          }
          if (param3 <= 63) {
            this.field_S = (hf) null;
          }
          if (param0 == 98) {
            stackIn_9_0 = this.a(param2, 65535);
            return stackIn_9_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_13_0 = this.a(param2, (byte) 98);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("wa.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        java.applet.Applet var8 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_S != param3) {
            if (param3 == this.field_K) {
              ta.b(!param2);
            } else {
              if (this.field_P == param3) {
                if (this.field_T) {
                  sg.a(param2);
                } else {
                  if (this.field_U) {
                    gf.d((byte) 89);
                  } else {
                    oh.a((byte) 75);
                  }
                }
              }
            }
          } else {
            this.g((byte) -121);
          }
          if (!param2) {
            var8 = (java.applet.Applet) null;
            wa.a((String) null, true, (java.applet.Applet) null, (byte) -7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("wa.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 != -43) {
          field_R = -56;
        }
    }

    final static int a(byte param0, boolean param1) {
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          nf.field_w = nf.field_w + 65536;
          while (65536 <= bj.a(false, nf.field_w, rd.field_G)) {
            k.field_L = k.field_L + 1;
            nf.field_w = nf.field_w - rd.field_G;
          }
          var2_int = -1;
          if (null != gl.field_e) {
            var2_int = gl.field_e.length;
          } else {
            if (bh.field_c != null) {
              var2_int = bh.field_c.length;
            }
          }
          var3 = -10 / ((param0 + 62) / 33);
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (rd.field_D > la.field_b) {
              la.field_b = la.field_b + 1;
              if (rd.field_F < la.field_b && (null == gl.field_e ||
                null == gl.field_e[ig.field_k])) {
                la.field_b = la.field_b - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (rd.field_D <= la.field_b &&
                  gl.field_e[(1 + ig.field_k) % var2_int] == null) {
                  la.field_b = la.field_b - 1;
                }
              }
            }
            if (rd.field_D <= la.field_b) {
              bd.field_L = ig.field_k;
              if (!ie.field_B) {
                ig.field_k = ig.field_k - 1;
                if (ig.field_k < 0) {
                  ig.field_k = ig.field_k + var2_int;
                }
              } else {
                ig.field_k = ig.field_k + 1;
                if (ig.field_k >= var2_int) {
                  ig.field_k = ig.field_k - var2_int;
                }
              }
              la.field_b = la.field_b - rd.field_D;
            }
            if (la.field_b > rd.field_F) {
              ie.field_B = true;
            }
          }
          if (sc.field_c != null) {
            var4 = 357 - sc.field_c.field_C / 2;
            var5 = 0;
            if (mh.field_f != 0 &&
              var4 < ih.field_R &&
              ih.field_R < var4 + sc.field_c.field_w) {
              if (ae.field_gb > -sc.field_c.field_y + 269 &&
                ae.field_gb < 269) {
                ie.field_B = false;
                var5 = 1;
                la.field_b = rd.field_D;
              }
              if (ae.field_gb > 586 &&
                ae.field_gb < sc.field_c.field_y + 586) {
                var5 = 1;
                la.field_b = rd.field_D;
                ie.field_B = true;
              }
            }
            if (var5 == 0 &&
              rd.field_F < la.field_b &&
              ob.field_g > var4 &&
              ob.field_g < var4 + sc.field_c.field_w) {
              if (-sc.field_c.field_y + 269 < ck.field_c &&
                ck.field_c < 269) {
                la.field_b = rd.field_F;
              }
              if (ck.field_c > 586 &&
                sc.field_c.field_y + 586 > ck.field_c) {
                la.field_b = rd.field_F;
              }
            }
          }
          if (param1) {
            lb.field_w.a(0, ua.a(ob.field_g, -13412, ck.field_c), ua.a(ih.field_R, -13412, ae.field_gb));
            if (lb.field_w.c((byte) -82)) {
              if (lb.field_w.field_f == 0) {
                stackIn_62_0 = 3;
                return stackIn_62_0;
              }
              if (1 == lb.field_w.field_f) {
                stackIn_65_0 = 2;
                return stackIn_65_0;
              }
            }
            while (th.a(83)) {
              lb.field_w.a(0, (byte) 123);
              if (lb.field_w.c((byte) -82)) {
                if (lb.field_w.field_f == 0) {
                  stackIn_72_0 = 3;
                  return stackIn_72_0;
                }
                if (lb.field_w.field_f == 1) {
                  stackIn_75_0 = 1;
                  return stackIn_75_0;
                }
              }
              if (di.field_c != 13) {
                continue;
              }
              stackIn_79_0 = 1;
              return stackIn_79_0;
            }
          }
          stackIn_81_0 = 0;
          return stackIn_81_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "wa.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0, String param1) {
        kl var3 = null;
        String var4 = null;
        try {
          if (param0 < 24) {
            this.field_M = (kl) null;
          }
          var3 = this.field_L;
          var4 = param1;
          var3.a(false, var4, -19116);
          this.field_M.h((byte) 88);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "wa.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Q = new int[75];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$b925f3f4834c(int param0, boolean param1) {
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          nf.field_w = nf.field_w + 65536;
          while (65536 <= bj.a(false, nf.field_w, rd.field_G)) {
            k.field_L = k.field_L + 1;
            nf.field_w = nf.field_w - rd.field_G;
          }
          var2_int = -1;
          if (null != gl.field_e) {
            var2_int = gl.field_e.length;
          } else {
            if (bh.field_c != null) {
              var2_int = bh.field_c.length;
            }
          }
          var3 = -10 / ((param0 + 62) / 33);
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (rd.field_D > la.field_b) {
              la.field_b = la.field_b + 1;
              if (rd.field_F < la.field_b && (null == gl.field_e ||
                null == gl.field_e[ig.field_k])) {
                la.field_b = la.field_b - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (rd.field_D <= la.field_b &&
                  gl.field_e[(1 + ig.field_k) % var2_int] == null) {
                  la.field_b = la.field_b - 1;
                }
              }
            }
            if (rd.field_D <= la.field_b) {
              bd.field_L = ig.field_k;
              if (!ie.field_B) {
                ig.field_k = ig.field_k - 1;
                if (ig.field_k < 0) {
                  ig.field_k = ig.field_k + var2_int;
                }
              } else {
                ig.field_k = ig.field_k + 1;
                if (ig.field_k >= var2_int) {
                  ig.field_k = ig.field_k - var2_int;
                }
              }
              la.field_b = la.field_b - rd.field_D;
            }
            if (la.field_b > rd.field_F) {
              ie.field_B = true;
            }
          }
          if (sc.field_c != null) {
            var4 = 357 - sc.field_c.field_C / 2;
            var5 = 0;
            if (mh.field_f != 0 &&
              var4 < ih.field_R &&
              ih.field_R < var4 + sc.field_c.field_w) {
              if (ae.field_gb > -sc.field_c.field_y + 269 &&
                ae.field_gb < 269) {
                ie.field_B = false;
                var5 = 1;
                la.field_b = rd.field_D;
              }
              if (ae.field_gb > 586 &&
                ae.field_gb < sc.field_c.field_y + 586) {
                var5 = 1;
                la.field_b = rd.field_D;
                ie.field_B = true;
              }
            }
            if (var5 == 0 &&
              rd.field_F < la.field_b &&
              ob.field_g > var4 &&
              ob.field_g < var4 + sc.field_c.field_w) {
              if (-sc.field_c.field_y + 269 < ck.field_c &&
                ck.field_c < 269) {
                la.field_b = rd.field_F;
              }
              if (ck.field_c > 586 &&
                sc.field_c.field_y + 586 > ck.field_c) {
                la.field_b = rd.field_F;
              }
            }
          }
          if (param1) {
            lb.field_w.a(0, ua.a(ob.field_g, -13412, ck.field_c), ua.a(ih.field_R, -13412, ae.field_gb));
            if (lb.field_w.c((byte) -82)) {
              if (lb.field_w.field_f == 0) {
                stackIn_62_0 = 3;
                return stackIn_62_0;
              }
              if (1 == lb.field_w.field_f) {
                stackIn_65_0 = 2;
                return stackIn_65_0;
              }
            }
            while (th.a(83)) {
              lb.field_w.a(0, (byte) 123);
              if (lb.field_w.c((byte) -82)) {
                if (lb.field_w.field_f == 0) {
                  stackIn_72_0 = 3;
                  return stackIn_72_0;
                }
                if (lb.field_w.field_f == 1) {
                  stackIn_75_0 = 1;
                  return stackIn_75_0;
                }
              }
              if (di.field_c != 13) {
                continue;
              }
              stackIn_79_0 = 1;
              return stackIn_79_0;
            }
          }
          stackIn_81_0 = 0;
          return stackIn_81_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "wa.E(" + param0 + ',' + param1 + ')');
        }
    }
}
