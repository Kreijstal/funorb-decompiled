/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ts extends kg {
    static String[] field_K;
    static bi[] field_L;
    private pf field_D;
    private ql field_I;
    private String[] field_J;
    static String field_E;
    static String field_H;
    static kf field_G;
    static String field_F;

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (0 != param0) {
          return;
        }
        pj var5 = (pj) ((Object) this.field_p);
        ql var6 = this.field_I;
        if (var6 != null) {
          var7 = var5.b(0, (vg) (this), param3);
          var8 = var5.a(param2, (vg) (this), 100);
          do {
            dd.a(2 + var6.field_l, param1 ^ -11858, 2 + var6.field_j, var6.field_k + var7 - 2, var8 + (var6.field_m - 2));
            var6 = var6.field_h;
          } while (var6 != null);
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int var5 = 0;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null == this.field_J ||
            this.field_J.length <= param0) {
            var7 = new String[1 + param0];
            var8 = var7;
            var4 = var8;
            if (null != this.field_J) {
              for (var5 = 0; this.field_J.length > var5; var5++) {
                var7[var5] = this.field_J[var5];
              }
            }
            this.field_J = var8;
          }
          this.field_J[param0] = param2;
          if (param1) {
            return;
          }
          this.e(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("ts.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    ts(String param0, iq param1) {
        super(param0, (ko) null);
        this.field_I = null;
        try {
          this.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ts.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 122, param3, param4);
        this.e(false);
        if (param2 < 99) {
          this.a(23, -42, -29, 82);
        }
    }

    boolean a(byte param0, vg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 125 / ((61 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ts.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_F = null;
        field_E = null;
        int var1 = -63 / ((-15 - param0) / 60);
        field_L = null;
        field_K = null;
        field_H = null;
    }

    final static boolean a(boolean param0, int param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          sl var4 = null;
          sl var5 = null;
          int stackIn_9_0 = 0;
          Throwable decompiledCaughtException = null;
          if (da.field_e == null) {
            da.field_e = nr.field_l.a(65535, of.field_f, mk.field_c);
          }
          if (da.field_e.field_d == 0) {
            return false;
          }
          dupTemp$1 = pr.a(14274);
          mj.field_Pb = dupTemp$1;
          pf.field_e = dupTemp$1;
          if (param1 != ~da.field_e.field_d) {
            cs.field_j = oa.field_a;
          } else {
            try {
              wg.field_f = new ke((java.net.Socket) (da.field_e.field_e), nr.field_l);
              var4 = sa.field_a;
              var5 = var4;
              js.field_f.field_j = 0;
              stackIn_9_0 = (param0) ? -2 : -1;
              rm.field_e = stackIn_9_0;
              tp.field_g = stackIn_9_0;
              kp.field_n = stackIn_9_0;
              cs.field_j = j.field_r;
              var5.field_j = 0;
              hq.a(sp.field_g, ee.field_o, js.field_f, (byte) 20, uk.field_a);
              d.$cfr$intArgs$a$a6964d7afeb1(-1, 82);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              cs.field_j = oa.field_a;
              da.field_e = null;
              return true;
            }
          }
          da.field_e = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              var3 = 96 / ((param1 + 19) / 53);
              param0.getAppletContext().showDocument(jg.a(param0, false, var2), "_top");
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
            stackIn_6_0 = var2_ref2;
            stackIn_6_1 = new StringBuilder().append("ts.E(");
            if (param0 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        this.a(param1, ((pj) ((Object) this.field_p)).a(true, (vg) (this)), (byte) 100, param0, param3);
        if (param2 != 57) {
          field_E = (String) null;
        }
    }

    final static void a(int param0) {
        int var1;
        int var2;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (ui.field_m == 0) {
          gd.a(-114);
        } else {
          if (ui.field_m == 1) {
            hd.a(param0 - 6373);
          } else {
            if (2 == ui.field_m) {
              wj.a(128);
            } else {
              if (ui.field_m == 3) {
                pa.c(8421504);
              } else {
                if (4 == ui.field_m) {
                  eb.a(param0 - 6173);
                } else {
                  if (ui.field_m == 5) {
                    vi.c(param0 ^ 6333);
                  }
                }
              }
            }
          }
        }
        if (param0 != 6493) {
          return;
        }
        if (bj.field_L < 50) {
          us.a(0, bj.field_L);
        }
        qn.a((byte) -120);
        var1 = tk.field_C.c(np.field_d) + 20;
        if (var1 < 80) {
          var1 = 80;
        }
        nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
    }

    final void e(boolean param0) {
        int var2;
        int var5;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        int var13;
        int var14;
        int var16;
        Object var17;
        Object var22;
        String var23;
        qo var24;
        ha var25;
        ql var26;
        pj var27;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        String var18;
        qo var19;
        ha var20;
        ql var21;
        pj var28;
        int var2Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var7Lifetime2;
        int var7Lifetime1Lifetime1;
        Object var10Lifetime1;
        var17 = null;
        var22 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_D = new pf();
        if (!param0) {
          var2 = 0;
          var27 = (pj) ((Object) this.field_p);
          var24 = var27.a((vg) (this), true);
          while (true) {
            var5 = this.field_s.indexOf("<hotspot=", var2);
            if (var5 == -1) {
              return;
            }
            var7 = this.field_s.indexOf(">", var5);
            var23 = this.field_s.substring(var5 + 9, var7);
            var7Lifetime2 = Integer.parseInt(var23);
            var2 = this.field_s.indexOf("</hotspot>", var5);
            var8 = var24.a((byte) 87, var5);
            var9 = var24.a((byte) 103, var2);
            var10 = null;
            for (var11 = var8; var9 >= var11; var11++) {
              var25 = var24.field_d[var11];
              if (var8 == var11) {
                stackIn_9_0 = var24.a(true, var5);
              } else {
                stackIn_9_0 = var25.field_b[0];
              }
              var13 = stackIn_9_0;
              if (var11 == var9) {
                stackIn_14_0 = var24.a(true, var2);
              } else {
                if (var25 != null) {
                  stackIn_14_0 = var25.field_b[var25.field_b.length - 1];
                } else {
                  stackIn_14_0 = 0;
                }
              }
              var14 = stackIn_14_0;
              var26 = new ql(var7Lifetime2, var13, var25.field_e, var14 - var13, Math.max(var27.a(false), -var25.field_e + var25.field_c));
              if (var10 == null) {
                var10 = var26;
                this.field_D.a((byte) -113, var26);
              } else {
                ((ql) (var10)).field_h = var26;
                var10 = var26;
                this.field_D.a((byte) -113, var26);
              }
            }
          }
        }
        field_L = (bi[]) null;
        var2Lifetime1 = 0;
        var28 = (pj) ((Object) this.field_p);
        var19 = var28.a((vg) (this), true);
        while (true) {
          var5Lifetime1 = this.field_s.indexOf("<hotspot=", var2Lifetime1);
          if (var5Lifetime1 == -1) {
            return;
          }
          var7Lifetime1 = this.field_s.indexOf(">", var5Lifetime1);
          var18 = this.field_s.substring(var5Lifetime1 + 9, var7Lifetime1);
          var7Lifetime1Lifetime1 = Integer.parseInt(var18);
          var2Lifetime1 = this.field_s.indexOf("</hotspot>", var5Lifetime1);
          var8Lifetime1 = var19.a((byte) 87, var5Lifetime1);
          var9Lifetime1 = var19.a((byte) 103, var2Lifetime1);
          var10Lifetime1 = null;
          for (var11Lifetime1 = var8Lifetime1; var9Lifetime1 >= var11Lifetime1; var11Lifetime1++) {
            var20 = var19.field_d[var11Lifetime1];
            if (var8Lifetime1 == var11Lifetime1) {
              stackIn_29_0 = var19.a(true, var5Lifetime1);
            } else {
              stackIn_29_0 = var20.field_b[0];
            }
            var13Lifetime1 = stackIn_29_0;
            if (var11Lifetime1 == var9Lifetime1) {
              stackIn_34_0 = var19.a(true, var2Lifetime1);
            } else {
              if (var20 != null) {
                stackIn_34_0 = var20.field_b[var20.field_b.length - 1];
              } else {
                stackIn_34_0 = 0;
              }
            }
            var14Lifetime1 = stackIn_34_0;
            var21 = new ql(var7Lifetime1Lifetime1, var13Lifetime1, var20.field_e, var14Lifetime1 - var13Lifetime1, Math.max(var28.a(false), -var20.field_e + var20.field_c));
            if (var10Lifetime1 == null) {
              var10Lifetime1 = var21;
              this.field_D.a((byte) -113, var21);
            } else {
              ((ql) (var10Lifetime1)).field_h = var21;
              var10Lifetime1 = var21;
              this.field_D.a((byte) -113, var21);
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        param0 += 30;
        if (param1 == -1) {
          param2 += 30;
          ga.a(param2, -param2 + 480 >> 1, -param0 + 640 >> 1, (byte) -70, param0);
          return;
        }
    }

    private final ql b(int param0, int param1, byte param2) {
        ql var4;
        ql var5;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = (ql) (this.field_D.d(0));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_k <= param0 &&
              var5.field_m <= param1 &&
              var5.field_k + var5.field_j > param0 &&
              var5.field_l + var5.field_m >= param1) {
              return var4;
            }
            var5 = var5.field_h;
          }
          var4 = (ql) (this.field_D.a((byte) -71));
        }
        if (param2 == -66) {
          return null;
        }
        this.field_J = (String[]) null;
        return null;
    }

    String c(boolean param0) {
        if (null == this.field_I) {
          return null;
        }
        if (this.field_J == null) {
          return null;
        }
        if (this.field_J.length <= this.field_I.field_i) {
          return null;
        }
        if (param0) {
          return this.field_J[this.field_I.field_i];
        }
        field_F = (String) null;
        return this.field_J[this.field_I.field_i];
    }

    void a(int param0, int param1, vg param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.field_I = null;
          if (this.field_k) {
            var5_int = -this.field_m + (-param0 + pd.field_k);
            var6 = bb.field_b - param1 - this.field_q;
            this.field_I = this.b(var5_int, var6, (byte) -66);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ts.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -this.field_m + param1;
        int var6 = -this.field_q + param2;
        ql var7 = this.b(var5, var6, (byte) -66);
        if (var7 == null) {
          return;
        }
        if (this.field_u != null) {
          ((op) ((Object) this.field_u)).a(param0, var7.field_i, 2, this);
          return;
        }
    }

    static {
        field_K = new String[16];
        field_E = "Retry";
        field_H = "Show lobby chat from my friends";
        field_F = "Add <%0> to ignore list";
        field_G = null;
    }
}
