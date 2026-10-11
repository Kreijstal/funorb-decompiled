/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends si {
    static int field_I;
    private int field_P;
    static int field_J;
    static o field_K;
    private mg field_M;
    static String[] field_O;
    static int field_N;
    static mg field_H;
    private int field_S;
    private String field_Q;
    private boolean field_L;
    private int field_R;

    public static void d(byte param0) {
        if (param0 == -61) {
          field_K = null;
          field_O = null;
          field_H = null;
          return;
        }
        String var2 = (String) null;
        ke.a((byte) 115, (java.applet.Applet) null, (String) null, false);
        field_K = null;
        field_O = null;
        field_H = null;
    }

    final static int a(byte param0) {
        d.field_b.a(24561);
        int var1 = 17 / ((40 - param0) / 47);
        if (!il.field_c.d((byte) 0)) {
          return pg.a((byte) 83);
        }
        return 0;
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (dl.field_t.startsWith("win") &&
              sj.a(97, param2)) {
              return;
            }
            try {
              param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
              if (param0 < -60) {
                return;
              }
              ke.a((byte) -80);
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              hi.a((Throwable) null, "MGR1: " + param2, 1);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var4_ref;
            stackIn_10_1 = new StringBuilder().append("ke.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
            if (param2 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static int a(boolean param0, boolean param1) {
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
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          ua.field_L = ua.field_L + 65536;
          while (sb.a(ua.field_L, uc.field_b, 1513551664) >= 65536) {
            wd.field_a = wd.field_a + 1;
            ua.field_L = ua.field_L - uc.field_b;
          }
          var2_int = -1;
          if (!param1) {
            ke.b(-18, 56, 85);
          }
          if (null == jb.field_d) {
            if (qd.field_e != null) {
              var2_int = qd.field_e.length;
            }
          } else {
            var2_int = jb.field_d.length;
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (ti.field_e < uc.field_c) {
              ti.field_e = ti.field_e + 1;
              if (ti.field_e > uc.field_e && (null == jb.field_d ||
                null == jb.field_d[we.field_h])) {
                ti.field_e = ti.field_e - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (uc.field_c <= ti.field_e &&
                  null == jb.field_d[(we.field_h + 1) % var2_int]) {
                  ti.field_e = ti.field_e - 1;
                }
              }
            }
            if (uc.field_c <= ti.field_e) {
              vb.field_g = we.field_h;
              if (!fh.field_g) {
                we.field_h = we.field_h - 1;
                if (we.field_h < 0) {
                  we.field_h = we.field_h + var2_int;
                }
              } else {
                we.field_h = we.field_h + 1;
                if (var2_int <= we.field_h) {
                  we.field_h = we.field_h - var2_int;
                }
              }
              ti.field_e = ti.field_e - uc.field_c;
            }
            if (uc.field_e < ti.field_e) {
              fh.field_g = true;
            }
          }
          if (kj.field_S != null) {
            var3 = 357 - kj.field_S.field_r / 2;
            var4 = 0;
            if (hg.field_F != 0 &&
              s.field_gb > var3 &&
              s.field_gb < kj.field_S.field_t + var3) {
              if (db.field_o > 269 - kj.field_S.field_p &&
                db.field_o < 269) {
                var4 = 1;
                ti.field_e = uc.field_c;
                fh.field_g = false;
              }
              if (db.field_o > 586 &&
                kj.field_S.field_p + 586 > db.field_o) {
                var4 = 1;
                ti.field_e = uc.field_c;
                fh.field_g = true;
              }
            }
            if (var4 == 0 &&
              uc.field_e < ti.field_e &&
              var3 < ad.field_m &&
              ad.field_m < var3 + kj.field_S.field_t) {
              if (gb.field_j > 269 - kj.field_S.field_p &&
                gb.field_j < 269) {
                ti.field_e = uc.field_e;
              }
              if (586 < gb.field_j &&
                kj.field_S.field_p + 586 > gb.field_j) {
                ti.field_e = uc.field_e;
              }
            }
          }
          if (!param0) {
            return 0;
          }
          qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
          if (qh.field_b.d((byte) -8)) {
            if (qh.field_b.field_f == 0) {
              stackIn_62_0 = 3;
              return stackIn_62_0;
            }
            if (qh.field_b.field_f == 1) {
              stackIn_65_0 = 2;
              return stackIn_65_0;
            }
          }
          while (true) {
            if (!wk.a((byte) -56)) {
              stackIn_81_0 = 0;
              return stackIn_81_0;
            }
            qh.field_b.a(0, false);
            if (qh.field_b.d((byte) -33)) {
              if (qh.field_b.field_f == 0) {
                stackIn_72_0 = 3;
                return stackIn_72_0;
              }
              if (qh.field_b.field_f == 1) {
                stackIn_75_0 = 1;
                return stackIn_75_0;
              }
            }
            if (el.field_n != 13) {
              continue;
            }
            break;
          }
          stackIn_79_0 = 1;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "ke.D(" + param0 + ',' + param1 + ')');
        }
    }

    final String c(byte param0) {
        int var2 = this.field_G.field_v ? 1 : 0;
        this.field_G.field_v = this.field_v;
        String var3 = this.field_G.c((byte) 45);
        this.field_G.field_v = var2 != 0 ? true : false;
        if (param0 > 14) {
          return var3;
        }
        ke.a(false, true);
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + this.field_m;
        int var6 = this.field_j + param0;
        super.a(param0, param1, param2, param3 + 0);
        if (param1 != param3) {
          return;
        }
        int var7 = this.field_L ? this.field_t + (-this.field_R - 2 * this.field_P) : 0;
        this.field_M.a(this.field_Q, this.field_P + (var5 + var7), this.field_P + var6, this.field_R - this.field_P, this.field_x - 2 * this.field_P, this.field_S, -1, this.field_L ? 0 : 2, 1, this.field_M.field_F);
    }

    final static int b(int param0, int param1, int param2) {
        if (param1 != -1697860097) {
          return 78;
        }
        int var3 = param0 >>> 31;
        return -var3 + (param0 + var3) / param2;
    }

    ke(int param0, int param1, int param2, int param3, rc param4, boolean param5, int param6, int param7, mg param8, int param9, String param10) {
        super(param0, param1, param2, param3, (j) null, (dg) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_S = param9;
          this.field_M = param8;
          this.field_G = param4;
          this.field_R = param6;
          this.field_Q = param10;
          stackIn_4_1 = (param5);
          this.field_L = stackIn_4_1;
          this.field_P = param7;
          var12_int = this.field_R - this.field_P;
          var13 = this.field_M.b(param10, var12_int, this.field_M.field_F) + 2 * this.field_P;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.b(var13, param2, param0, 0, param1);
          }
          if (!this.field_L) {
            stackIn_10_0 = 2 * this.field_P + this.field_R;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_G.b(-(2 * this.field_P) + param3, -(this.field_P * 3) + param2 - this.field_R, var14, 0, (-param3 + var13 >> 1) + this.field_P);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("ke.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
    }
}
