/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends al {
    static int field_r;
    int[] field_o;
    static lm[] field_t;
    private jp field_s;
    private jp field_q;
    static int field_m;
    private int[] field_n;
    static vn field_p;

    final static void a(int param0, int param1, byte param2) {
        if (param2 != 50) {
          return;
        }
        try {
          pk.field_N = param0;
          b.field_l = param1;
          if (e.field_S != null) {
            e.field_S.b(param1, false, param0);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pl.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(boolean param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_59_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          if (!param0) {
            field_r = 67;
          }
          param1 = param1 - vh.field_b;
          param2 = param2 - id.field_M;
          if (ce.field_p != 0) {
            stackIn_7_0 = -1;
            return stackIn_7_0;
          }
          if (rg.field_F == -1) {
            param2 -= 80;
            var4_int = -1;
            for (var5 = 0; var5 < 4; var5++) {
              if (this.b(2 + var5, -1, 16777215) &&
                param1 > sf.field_d[var5] &&
                fl.field_c[var5] + sf.field_d[var5] > param1 &&
                param2 > gj.field_n[var5] &&
                param2 < gj.field_n[var5] + pj.field_u[var5]) {
                var4_int = var5;
              }
            }
            if (var4_int >= 0) {
              stackIn_32_0 = 2 + var4_int;
              return stackIn_32_0;
            }
            param2 += 80;
          } else {
            var4_int = 178;
            var5 = (-var4_int + param2) / 29;
            if (param2 < var4_int ||
              var5 < 0 ||
              var5 > 6 ||
              param1 < 200 ||
              param1 > 440) {
              var5 = -1;
            }
            if (-1 != var5 &&
              this.b(var5 + 3, rg.field_F, 16777215)) {
              stackIn_44_0 = 3 + var5;
              return stackIn_44_0;
            }
            if (wl.field_b - 11 < param1 &&
              29 + wl.field_b > param1 &&
              param2 > 120 &&
              param2 < 160) {
              stackIn_50_0 = 2;
              return stackIn_50_0;
            }
          }
          if (param2 > this.field_k &&
            param2 < this.field_k + 29 + 5 &&
            param1 > this.field_g &&
            param1 < this.field_g + this.field_i) {
            return 0;
          }
          stackIn_59_0 = -1;
          return stackIn_59_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "pl.BB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void f(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          i.field_T = new vn(640, 341);
          i.field_T.a();
          if (param1 != -257) {
            return;
          }
          bi.d();
          this.a(0, 0, param1 ^ 260);
          if (param0 >= 0) {
            bi.h(3, 3, 0, 0, 640, 341);
            this.a(0, 0, 0, param0);
            cn.field_f.b(125);
          } else {
            cn.field_f.b(125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "pl.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          if (b.field_q == param2) {
            bd.field_i[qd.field_e][param2].b(param3 + sf.field_d[param2], param1 + gj.field_n[param2], 248, 16776960);
            qn.field_g.b(-10 + (sf.field_d[param2] + param3), param1 + (-10 + gj.field_n[param2]), sn.field_f[rk.field_a]);
          } else {
            if (param4) {
              jo.field_Tb[qd.field_e][param2].e(param3 + sf.field_d[param2], gj.field_n[param2] + param1, 100);
            } else {
              bd.field_i[qd.field_e][param2].b(sf.field_d[param2] + param3, gj.field_n[param2] + param1);
            }
          }
          if (!param4 &&
            n.field_k[param2] != 0) {
            stackIn_14_0 = (b.field_q == param2) ? 2 : 0;
            var6_int = stackIn_14_0;
            sg.field_jb.b(cj.field_a[qd.field_e][param2], te.field_T[param2] + param3, ag.field_b[param2] + param1, var6_int, -1, n.field_k[param2]);
          }
          if (b.field_q == param2 &&
            !this.field_b.field_j) {
            if (ki.field_X[param2] != -1) {
              af.field_d.c(ki.field_X[param2], no.field_G[param2] + param1);
            }
            if (cj.field_c[param2] != -1 &&
              this.b(param2 + 3, -1, 16777215)) {
              af.field_d.b(cj.field_c[param2], param1 + no.field_G[param2]);
            }
          }
          if (param0 <= 68) {
            this.a((byte) -30, 7, 28);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var6), "pl.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    pl(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6, int[] param7) {
        super(param0, param1, param2, param3, param4, param5, param6);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_q = this.field_b;
          this.field_n = this.field_h;
          this.field_o = param7;
          this.field_s = new jp(param7.length);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pl.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param7 == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0) {
        jp stackIn_40_0 = null;
        jp stackIn_42_0 = null;
        jp stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_58_0 = 0;
        jp stackIn_70_0 = null;
        int stackIn_71_1 = 0;
        jp stackIn_81_0 = null;
        jp stackIn_83_0 = null;
        jp stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        try {
          var2_int = this.field_b.field_d;
          if (param0 != -31645) {
            field_m = -125;
          }
          if (48 == kg.field_i &&
            bo.field_p[82] &&
            2 <= lo.field_j) {
            to.field_b[qd.field_e] = 27;
          }
          if (-1 != rg.field_F) {
            var3 = id.field_N;
            if ((kg.field_i == 99 ||
              kg.field_i == 98) && (var2_int == 0 ||
              var2_int == 1)) {
              id.field_N = var2_int;
            }
            boolean decompiledFrameCompleted0 = true;
            if (kg.field_i == 98) {
              if (0 <= var2_int) {
                stackIn_58_0 = 0;
                while (true) {
                  if (stackIn_58_0 != this.field_b.field_d &&
                    this.field_b.field_d != 1) {
                    if (this.field_b.field_d != 2) {
                      this.field_b.b(-1 + this.field_b.field_d, 69);
                    } else {
                      stackIn_70_0 = this.field_b;
                      if (var3 != 0 &&
                        var3 != 1) {
                        stackIn_71_1 = 0;
                      } else {
                        stackIn_71_1 = var3;
                      }
                      ((jp) (Object) stackIn_70_0).b(stackIn_71_1, -111);
                    }
                  } else {
                    this.field_b.b(-1 + this.field_b.field_h, -102);
                  }
                  if (this.b(this.field_b.field_d, rg.field_F, 16777215)) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  stackIn_58_0 = 0;
                }
              }
              if (decompiledFrameCompleted0) {
                this.field_b.b(0, 63);
              }
            }
            boolean decompiledFrameRemainder2 = true;
            if (kg.field_i == 99) {
              if (var2_int >= 0) {
                do {
                  if (-1 + this.field_b.field_h != this.field_b.field_d) {
                    if (this.field_b.field_d != 0 &&
                      this.field_b.field_d != 1) {
                      this.field_b.b(this.field_b.field_d + 1, -76);
                    } else {
                      this.field_b.b(2, param0 + 31557);
                    }
                  } else {
                    boolean decompiledFrameRemainder1 = true;
                    stackIn_81_0 = this.field_b;
                    if (var3 != 0) {
                      stackIn_83_0 = stackIn_81_0;
                      if (var3 != 1) {
                        stackIn_84_0 = stackIn_83_0;
                        stackIn_84_1 = 0;
                        decompiledFrameRemainder1 = false;
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      stackIn_84_0 = stackIn_81_0;
                      stackIn_84_1 = var3;
                    }
                    ((jp) (Object) stackIn_84_0).b(stackIn_84_1, param0 ^ 31699);
                  }
                } while (!this.b(this.field_b.field_d, rg.field_F, 16777215));
                decompiledFrameRemainder2 = false;
              }
              else {
                this.field_b.b(0, -75);
              }
            }
            if (kg.field_i == 97 ||
              96 == kg.field_i) {
              if (var2_int == 0) {
                this.field_b.b(1, 126);
              } else {
                if (var2_int != 1 &&
                  var2_int >= 0) {
                  this.field_b.g(102);
                  return;
                }
                this.field_b.b(0, 97);
              }
            }
          } else {
            if (kg.field_i == 96) {
              if (var2_int < 2) {
                this.field_b.b(0, -125);
              } else {
                if (2 < var2_int) {
                  this.field_b.b(this.field_b.field_d - 1, 107);
                }
              }
            }
            if (kg.field_i == 97) {
              if (var2_int >= 2) {
                if (var2_int < 5 &&
                  this.b(var2_int + 1, -1, 16777215)) {
                  this.field_b.b(1 + var2_int, -81);
                }
              } else {
                this.field_b.b(0, -99);
              }
            }
            if (kg.field_i == 99) {
              if (var2_int >= 2) {
                id.field_N = var2_int;
              }
              this.field_b.b(0, param0 ^ -31697);
            }
            if (kg.field_i == 98) {
              if (-1 != var2_int) {
                if (var2_int < 2) {
                  boolean decompiledFrameRemainder0 = true;
                  stackIn_40_0 = this.field_b;
                  if (id.field_N > 1) {
                    stackIn_42_0 = stackIn_40_0;
                    if (6 > id.field_N) {
                      stackIn_43_0 = stackIn_42_0;
                      stackIn_43_1 = id.field_N;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    stackIn_43_0 = stackIn_40_0;
                    stackIn_43_1 = 2;
                  }
                  ((jp) (Object) stackIn_43_0).b(stackIn_43_1, 120);
                }
              } else {
                this.field_b.b(0, param0 + 31733);
              }
            }
          }
          this.field_b.g(102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "pl.F(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        hi stackIn_44_0 = null;
        hi stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        hi stackIn_45_0 = null;
        hi stackIn_45_1 = null;
        int stackIn_45_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          if (this.field_h.length <= param1) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var4_int = this.field_h[param1];
          var5 = var4_int;
          if (var5 == 26) {
            if (this.field_b.d(-120)) {
              this.e(50, -1);
            }
          } else {
            if (var5 != 22 &&
              var5 != 23 &&
              var5 != 24 &&
              25 != var5) {
              if (27 != var5 &&
                28 != var5 &&
                var5 != 29 &&
                30 != var5 &&
                var5 != 31 &&
                var5 != 32 &&
                33 != var5) {
                super.a(param0, param1, -8512);
              } else {
                if (!(!this.field_b.d(-121))) {
                  var5 = rg.field_F + 4 * qd.field_e;
                  var6 = var4_int - 27;
                  stackIn_44_0 = null;
                  stackIn_44_1 = null;
                  stackIn_44_2 = var5;
                  if (var6 != 6) {
                    stackIn_45_0 = null;
                    stackIn_45_1 = null;
                    stackIn_45_3 = var6;
                  } else {
                    stackIn_45_0 = null;
                    stackIn_45_1 = null;
                    stackIn_45_3 = -1;
                  }
                  vl.field_b = new hi(stackIn_44_2, stackIn_45_3);
                  if (var6 == 0 &&
                    var5 == 0) {
                    ((kl) (jj.c(12, 81))).e(-124);
                    ca.a(true, true, 12);
                  } else {
                    ca.a(true, true, 0);
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_b.d(-122)) {
                this.e(param2 + 8562, var4_int - 22);
              }
            }
          }
          if (param2 != -8512) {
            field_t = (lm[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "pl.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawn.field_J;
        try {
          hm.field_J = -1;
          b.field_q = -1;
          if (param0 < 83) {
            this.a(114, -11, -24, -34);
          }
          if (param1) {
            rg.field_F = -1;
            this.field_b = this.field_q;
            this.field_h = this.field_n;
          }
          for (var3_int = 0; 4 > var3_int; var3_int++) {
            n.field_k[var3_int] = 128;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "pl.L(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          int var3_int = 0;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          g.field_H = param0;
          try {
            var6 = param2.getParameter("cookieprefix");
            var5 = var6;
            var5Lifetime1 = var6;
            var4 = param2.getParameter("cookiehost");
            var5Lifetime2 = var4;
            var5Lifetime3 = var4;
            var7 = var6 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
            var5Lifetime4 = var7;
            var5Lifetime5 = var7;
            var5Lifetime6 = var7;
            if (param0.length() == 0) {
              var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            }
            qe.a("document.cookie=\"" + var5Lifetime6 + "\"", param2, (byte) 116);
          } catch (Throwable throwable) {
          }
          var3_int = 60 % ((6 - param1) / 62);
          hl.a(param2, 1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          super.a((byte) -68);
          if (rg.field_F != -1) {
            this.a(0, vh.field_b, 80 + id.field_M, rg.field_F);
          } else {
            this.a(80 + id.field_M, vh.field_b, -5);
          }
          if (param0 > -35) {
            field_r = 53;
          }
          if (0 != ce.field_p) {
            var2_int = ce.field_p << 4;
            var3 = var2_int * 2;
            if (var3 > 256) {
              var3 = 256;
            }
            if (var2_int >= 128) {
              stackIn_15_0 = var2_int * 2 - 256;
            } else {
              stackIn_15_0 = 0;
            }
            var4 = stackIn_15_0;
            i.field_T.c(vh.field_b, id.field_M + 80, var3, var4);
          }
          hk.field_H.b(vh.field_b + 0, 80 + id.field_M);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "pl.B(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        try {
          int var4_int = -99 % ((-61 - param0) / 34);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pl.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        Object stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        boolean stackIn_4_5 = false;
        Object stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_7_4;
        boolean stackIn_8_5 = false;
        Object stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        int stackIn_11_4;
        boolean stackIn_12_5 = false;
        Object stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        Object stackIn_16_0;
        boolean stackIn_16_5;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          dc.field_a[qd.field_e].b(param1 - param2, 5 + param0);
          stackIn_3_0 = this;
          stackIn_3_1 = 70;
          stackIn_3_2 = param0;
          stackIn_3_3 = 0;
          stackIn_3_4 = param1;
          stackIn_4_5 = !(this.b(2, -1, param2 + 16777220));
          this.a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_4_5);
          stackIn_7_0 = this;
          stackIn_7_1 = 82;
          stackIn_7_2 = param0;
          stackIn_7_3 = 1;
          stackIn_7_4 = param1;
          stackIn_8_5 = !(this.b(3, -1, 16777215));
          this.a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_8_5);
          stackIn_11_0 = this;
          stackIn_11_1 = 69;
          stackIn_11_2 = param0;
          stackIn_11_3 = 3;
          stackIn_11_4 = param1;
          stackIn_12_5 = !(this.b(5, -1, 16777215));
          this.a(stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_12_5);
          stackIn_15_0 = this;
          stackIn_15_1 = 115;
          stackIn_15_2 = param0;
          stackIn_15_3 = 2;
          stackIn_15_4 = param1;
          if (this.b(4, -1, 16777215)) {
            stackIn_16_0 = this;
            stackIn_16_5 = false;
          } else {
            stackIn_16_0 = this;
            stackIn_16_5 = true;
          }
          this.a(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4, stackIn_16_5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "pl.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(int param0) {
        boolean stackIn_12_0 = false;
        boolean stackIn_12_1 = false;
        int stackIn_13_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -26931) {
            this.b((byte) -31, true);
          }
          if (ce.field_p != 0) {
            return;
          }
          if (rg.field_F == -1) {
            stackIn_12_0 = false;
            stackIn_12_1 = true;
            if (be.field_j <= 0) {
              stackIn_13_2 = 1;
            } else {
              stackIn_13_2 = 13;
            }
            ca.a(stackIn_12_0, stackIn_12_1, stackIn_13_2);
          } else {
            this.e(50, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "pl.M(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        tj stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_22_3;
        tj stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        String stackIn_44_0 = null;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var16Lifetime1;
        var17 = ZombieDawn.field_J;
        try {
          stackIn_5_0 = (hm.field_J != -2) ? 8912896 : 16711680;
          var5_int = stackIn_5_0;
          stackIn_9_0 = (hm.field_J != -2) ? 15658734 : 16777215;
          var6 = stackIn_9_0;
          var7 = 13421721;
          var8 = 10079351;
          var9 = 16777215;
          i.field_T.e(param1, param2);
          var10 = 1;
          bi.a(param1 + qo.field_s, 35 + param2, bm.field_c, 280, 0, 128);
          if (nc.field_k.field_r >= bm.field_c) {
            nc.field_k.b(param1 + 195, 30 + param2);
          } else {
            bi.f(0, 0, 320 + param1, nh.field_P);
            nc.field_k.b(qo.field_s + param1, 30 + param2);
            bi.f(320 + param1, 0, bd.field_e, nh.field_P);
            nc.field_k.b(param1 - (-j.field_d + nc.field_k.field_r), 30 + param2);
            bi.c();
          }
          bi.g(param1 + wl.field_b, param2 + 47, 23, 23, 3, var5_int);
          if (hm.field_J == -2) {
            bi.e(wl.field_b + param1, 47 + param2, 23, 23, 3, 16764108);
          }
          bj.field_q.a("X", 11 + (param1 + wl.field_b), param2 + 64, var6, 65793);
          if (9 == param3) {
            stackIn_21_0 = sg.field_jb;
            stackIn_21_1 = kf.field_Y;
            stackIn_21_2 = param1 + 310;
            if (3 == param3) {
              stackIn_22_3 = 5;
            } else {
              stackIn_22_3 = 0;
            }
            ((tj) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2 - stackIn_22_3, 85 + param2, 2, 65793);
            bj.field_q.a(jk.field_h, param1 + 210, 118 + param2, -30 + nc.field_k.field_r, 120, 16777215, 65793, 1, 1, 20);
            return;
          }
          stackIn_27_0 = sg.field_jb;
          stackIn_27_1 = gn.field_c[qd.field_e][param3];
          if (param3 != 3) {
            stackIn_28_2 = 0;
          } else {
            stackIn_28_2 = 5;
          }
          ((tj) (Object) stackIn_27_0).a(stackIn_27_1, -stackIn_28_2 + (310 + param1), param2 + 85, 2, 65793);
          var11 = param3 + qd.field_e * 4;
          for (var12 = param0; var12 < 7; var12++) {
            stackIn_34_0 = (hm.field_J == var12) ? 1 : 0;
            var13 = stackIn_34_0;
            stackIn_38_0 = (this.b(3 + var12, param3, 16777215)) ? 0 : 1;
            var14 = stackIn_38_0;
            var15 = null;
            if (var14 != 0) {
              var15 = o.field_n;
            } else {
              if (var12 != 6) {
                if (var12 < 6) {
                  var15 = gj.field_w[var11][var12];
                }
              } else {
                if (param3 != 3) {
                  stackIn_44_0 = te.field_S;
                } else {
                  stackIn_44_0 = hm.field_M;
                }
                var15 = stackIn_44_0;
              }
            }
            var15 = s.a(param0 + 1938762664, dk.field_Zb, new String[]{Integer.toString(1 + var12), (String) (var15)});
            var16 = 0;
            if (var13 == 0) {
              if (var14 == 0) {
                stackIn_56_0 = (var10 == 0) ? var8 : var7;
                var16Lifetime1 = stackIn_56_0;
              } else {
                var16Lifetime1 = 7829367;
              }
            } else {
              var16Lifetime1 = var9;
            }
            if (var13 != 0) {
              bi.c(5 + qo.field_s + param1, param2 + 118 - 25 + var12 * 29, bm.field_c - 10, 20, 0, 26112);
              bi.c(5 + qo.field_s + param1, 29 * var12 + (param2 + 113), -10 + bm.field_c, 20, 26112, 0);
            }
            stackIn_65_0 = (var10 != 0) ? 0 : 1;
            var10 = stackIn_65_0;
            bj.field_q.c((String) (var15), 220 + param1, param2 + (118 + var12 * 29), var16Lifetime1, 65793);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "pl.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var5 = ZombieDawn.field_J;
        try {
          super.a((byte) -113, param1);
          if (ce.field_p != 0) {
            if (!fm.field_F) {
              ce.field_p = ce.field_p - 1;
              return;
            }
            ce.field_p = ce.field_p + 1;
            if (ce.field_p != 16) {
              return;
            }
            rg.field_F = wm.field_b;
            this.f(-1, -257);
            i.field_T.a();
            bi.h(3, 3, 0, 0, 640, 341);
            cn.field_f.b(-128);
            ce.field_p = 0;
          }
          if (rg.field_F != -1) {
            var3_int = this.field_b.field_d;
            hm.field_J = -1;
            if (var3_int != 2) {
              if (var3_int > 2) {
                hm.field_J = var3_int - 3;
              }
            } else {
              hm.field_J = -2;
            }
            return;
          }
          if (be.field_j <= 0) {
            fieldTemp$0 = te.field_db + 1;
            te.field_db = te.field_db + 1;
            if (50 == fieldTemp$0) {
              te.field_db = 0;
            }
          }
          for (var3_intLifetime1 = 0; var3_intLifetime1 < 4; var3_intLifetime1++) {
            if (var3_intLifetime1 != b.field_q) {
              n.field_k[var3_intLifetime1] = n.field_k[var3_intLifetime1] - 30;
            } else {
              n.field_k[var3_intLifetime1] = n.field_k[var3_intLifetime1] + 30;
            }
            if (n.field_k[var3_intLifetime1] < 128) {
              n.field_k[var3_intLifetime1] = 128;
            }
            if (n.field_k[var3_intLifetime1] > 256) {
              n.field_k[var3_intLifetime1] = 256;
            }
          }
          var4 = 87 % ((param0 + 39) / 61);
          fieldTemp$1 = rk.field_a + 1;
          rk.field_a = rk.field_a + 1;
          if (fieldTemp$1 >= 50) {
            rk.field_a = 0;
          }
          var3_intLifetime2 = this.field_b.field_d;
          if (var3_intLifetime2 < 2) {
            b.field_q = -1;
          } else {
            if (var3_intLifetime2 - 2 != b.field_q) {
              ub.a(-2 + var3_intLifetime2, (byte) -31);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "pl.S(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0, int param1) {
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          this.b((byte) 107, false);
          if (param0 != 50) {
            this.field_o = (int[]) null;
          }
          if (param1 == -1) {
            var3_int = rg.field_F + 2;
            this.f(rg.field_F, -257);
            this.field_h = this.field_n;
            this.field_b = this.field_q;
            fm.field_F = false;
            ce.field_p = 15;
            this.field_b.a(this.field_s.field_j, (byte) -125, this.b(true, ha.field_b, ei.field_K), var3_int);
            rg.field_F = -1;
          } else {
            wm.field_b = param1;
            fm.field_F = true;
            this.field_h = this.field_o;
            this.field_b = this.field_s;
            ce.field_p = 1;
            this.field_b.a(this.field_q.field_j, (byte) -114, this.b(true, ha.field_b, ei.field_K), 3);
            if (param1 != 9) {
              stackIn_7_0 = sg.field_jb.b(gn.field_c[qd.field_e][param1]) + 80;
            } else {
              stackIn_7_0 = 0;
            }
            bm.field_c = stackIn_7_0;
            if (nc.field_k.field_r > bm.field_c) {
              bm.field_c = nc.field_k.field_r;
            }
            j.field_d = 320 + (bm.field_c >> 1);
            qo.field_s = 320 - (bm.field_c >> 1);
            wl.field_b = j.field_d - 34;
            this.f(param1, param0 ^ -307);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "pl.C(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5Lifetime1;
        try {
          if (param2 != 16777215) {
            this.field_o = (int[]) null;
          }
          var4_int = to.field_b[qd.field_e];
          if (param1 != -1) {
            if (param0 <= 3) {
              return true;
            }
            param0 -= 3;
            var5 = param0 + 7 * param1;
            return !(var5 > var4_int);
          }
          if (param0 != 0 &&
            param0 != 1 &&
            param0 != 2) {
            param0 = -2 + param0;
            var5Lifetime1 = var4_int / 7;
            if (var5Lifetime1 >= 8) {
              var5Lifetime1 = 7;
            }
            if (be.field_j <= 0 &&
              param0 > 3) {
              return false;
            }
            return !(var5Lifetime1 < param0);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "pl.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(byte param0) {
        try {
          field_t = null;
          field_p = null;
          if (param0 > -78) {
            field_m = -95;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pl.N(" + param0 + ')');
        }
    }

    static {
        field_r = 6080;
        field_m = 0;
    }
}
