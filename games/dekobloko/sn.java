/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    private int field_i;
    private int field_f;
    private int field_d;
    private boolean field_h;
    ck[] field_a;
    static vj field_e;
    ck field_b;
    private int field_c;
    static boolean field_g;
    static cn field_k;
    private int field_j;

    final sn c(int param0, int param1) {
        if (param0 != -1) {
          this.field_c = 9;
        }
        this.field_i = param1;
        return this;
    }

    final void a(sn param0, int param1) {
        try {
          param0.field_b = this.field_b;
          if (param1 != 1) {
            sn var4 = (sn) null;
            this.a((sn) null, -53);
          }
          param0.field_a = this.field_a;
          param0.field_i = this.field_i;
          param0.field_c = this.field_c;
          param0.field_f = this.field_f;
          param0.field_j = this.field_j;
          param0.field_d = this.field_d;
          param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "sn.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, ce param1, int param2, bc param3, int param4) {
        mm stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_8;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        ck[] var8 = null;
        try {
          vk.a(param1.field_y, (byte) 50, this.field_a, param1.field_t, param4 + param1.field_D, param2 + param1.field_u);
          if (param0 != -2) {
            var8 = (ck[]) null;
            this.a(-28, (ck[]) null);
          }
          if (null != this.field_b) {
            var6_int = this.field_i + param1.field_u + param2;
            var7 = param4 + (param1.field_D + this.field_j);
            if (param3.field_f == 1) {
              var6_int = var6_int + (-this.field_b.field_K + param1.field_t) / 2;
            }
            if (1 == param3.field_o) {
              var7 = var7 + (-this.field_b.field_C + param1.field_y) / 2;
            }
            if (param3.field_f == 2) {
              var6_int = var6_int + (param1.field_t - this.field_b.field_K);
            }
            if (param3.field_o == 2) {
              var7 = var7 + (-this.field_b.field_C + param1.field_y);
            }
            this.field_b.c(var6_int, var7);
          }
          var6 = param3.b(param1, (byte) -116);
          if (var6 != null &&
            param3.field_z != null &&
            this.field_f >= 0) {
            stackIn_18_0 = param3.field_z;
            stackIn_18_1 = var6;
            if (this.field_i == -2147483648) {
              stackIn_19_2 = 0;
            } else {
              stackIn_19_2 = this.field_i;
            }
            stackIn_21_2 = stackIn_19_2 + (param1.field_u + param2) + param3.field_s;
            if (this.field_j == -2147483648) {
              stackIn_22_3 = 0;
            } else {
              stackIn_22_3 = this.field_j;
            }
            stackIn_24_3 = stackIn_22_3 + (param3.field_m + (param1.field_D + param4));
            stackIn_24_4 = param1.field_t - param3.field_s - param3.field_i;
            stackIn_24_5 = -param3.field_m + (param1.field_y - param3.field_y);
            stackIn_24_6 = this.field_f;
            stackIn_24_7 = this.field_d;
            if (this.field_c != -2147483648) {
              stackIn_25_8 = this.field_c;
            } else {
              stackIn_25_8 = 256;
            }
            ((mm) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_25_8, param3.field_f, param3.field_o, param3.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_29_0 = var6_ref;
          stackIn_29_1 = new StringBuilder().append("sn.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param4).append(')').toString());
        }
    }

    final sn a(int param0, int param1) {
        this.field_j = param0;
        if (param1 != -2147483648) {
          field_e = (vj) null;
        }
        return this;
    }

    final static void a(long param0, int param1, String param2, int param3, boolean param4, int param5) {
        int var7_int = 0;
        try {
          we.field_b.f(param1, -4);
          we.field_b.field_n = we.field_b.field_n + 1;
          if (param3 <= 34) {
            field_e = (vj) null;
          }
          var7_int = we.field_b.field_n;
          we.field_b.a(param0, (byte) 0);
          we.field_b.a(0, param2);
          we.field_b.a(true, param5);
          we.field_b.a(true, param4 ? 1 : 0);
          we.field_b.b(-var7_int + we.field_b.field_n, true);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "sn.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c(byte param0) {
        ta.field_k.field_j = 0;
        ta.field_k.field_o = 0;
        int var1 = -59 % ((-49 - param0) / 38);
    }

    final sn b(int param0, int param1) {
        this.field_d = param1;
        if (param0 >= -76) {
          return (sn) null;
        }
        return this;
    }

    final void b(byte param0) {
        this.field_f = 0;
        this.field_c = 256;
        this.field_b = null;
        if (param0 <= 66) {
          return;
        }
        this.field_d = -1;
        this.field_i = 0;
        this.field_a = null;
        this.field_j = 0;
    }

    final static int a(String param0, boolean param1, String param2, byte param3, int param4, boolean param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_21_0 = 0;
          int stackIn_38_0 = 0;
          boolean stackIn_48_0 = false;
          boolean stackIn_51_0 = false;
          boolean stackIn_54_0 = false;
          boolean stackIn_59_0 = false;
          int stackIn_87_0 = 0;
          int stackIn_94_0 = 0;
          int stackIn_99_0 = 0;
          int stackIn_107_0 = 0;
          int stackIn_110_0 = 0;
          RuntimeException stackIn_113_0 = null;
          StringBuilder stackIn_113_1 = null;
          String stackIn_114_2 = null;
          StringBuilder stackIn_116_1 = null;
          String stackIn_117_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = client.field_A ? 1 : 0;
          try {
            if (qc.field_s == null &&
              !mb.a(param5, param3 - 129)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (ba.field_f == ph.field_xb) {
              if (param5) {
                var10 = (String) null;
                wb.field_Nb = sb.a(sh.field_f, param2, false, (String) null, 0);
              } else {
                wb.field_Nb = hm.a(false, param2, param0, 9507);
              }
              we.field_b.field_n = 0;
              we.field_b.a(true, 14);
              we.field_b.a(true, wb.field_Nb.a(param3 ^ 37).field_a);
              wj.c(4792, -1);
              ph.field_xb = wf.field_p;
            }
            if (ph.field_xb == wf.field_p &&
              pe.b(25973, 1)) {
              var6_int = de.field_V.d((byte) -85);
              if (var6_int != 0) {
                bh.field_k = var6_int;
                ph.field_xb = bh.field_l;
                sm.field_e = -1;
              } else {
                ph.field_xb = kk.field_p;
              }
              de.field_V.field_n = 0;
            }
            if (param3 != 55) {
              stackIn_21_0 = -94;
              return stackIn_21_0;
            }
            if (kk.field_p == ph.field_xb &&
              pe.b(25973, 8)) {
              lc.field_j = de.field_V.f((byte) -108);
              de.field_V.field_n = 0;
              jm.a(param5, wb.field_Nb, param4, (byte) 127, param1);
              ph.field_xb = nn.field_c;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ph.field_xb == nn.field_c &&
              pe.b(25973, 1)) {
              var6_intLifetime1 = de.field_V.d((byte) -46);
              vh.field_f = null;
              bh.field_k = var6_intLifetime1;
              de.field_V.field_n = 0;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (8 != var6_intLifetime1) {
                  sm.field_e = -1;
                  ph.field_xb = bh.field_l;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  si.a(param3 + 22);
                  jd.field_Qb = false;
                  stackIn_38_0 = var6_intLifetime1;
                  return stackIn_38_0;
                }
              }
              if (decompiledFrameRemainder0) {
                sm.field_e = -1;
                ph.field_xb = of.field_a;
              }
            }
            if (ph.field_xb == of.field_a &&
              fh.a((byte) -62)) {
              sh.field_f = de.field_V.f((byte) -108);
              jk.field_a = param2;
              te.field_p = de.field_V.d((byte) -76);
              d.field_b = de.field_V.d((byte) -113);
              eh.field_a = de.field_V.e(3);
              var6 = de.field_V.c(-16829);
              var7 = de.field_V.d((byte) -93);
              if ((var7 & 1) != 0) {
                qj.a((byte) 64);
              }
              if (!param5) {
                stackIn_48_0 = (0 != (8 & var7));
                wc.field_n = stackIn_48_0;
                stackIn_51_0 = ((4 & var7) != 0);
                on.field_d = stackIn_51_0;
                stackIn_54_0 = ((var7 & 2) != 0);
                wl.field_p = stackIn_54_0;
                if (wc.field_n) {
                  wl.field_p = true;
                }
              }
              stackIn_59_0 = (0 != (16 & var7));
              gf.field_i = stackIn_59_0;
              if (ci.field_c) {
                de.field_V.d((byte) -25);
                de.field_V.d((byte) -71);
                de.field_V.i(param3 ^ 7606);
                uj.field_a = de.field_V.e(3);
                ai.field_N = new byte[uj.field_a];
                for (var8 = 0; var8 < uj.field_a; var8++) {
                  ai.field_N[var8] = de.field_V.g((byte) -99);
                }
              }
              oa.field_f = de.field_V.c((byte) -38);
              var11 = (CharSequence) ((Object) oa.field_f);
              h.field_c = kf.a(var11, (byte) 2);
              bb.field_e = de.field_V.d((byte) -49);
              ph.field_xb = wf.field_u;
              if (wb.field_Nb.a(18) != pb.field_i) {
                if (wb.field_Nb.a(18) == ui.field_t) {
                  ge.field_g.a(-117, se.h(25144));
                }
              } else {
                ah.field_f.a(-69, se.h(param3 ^ 25103));
              }
              jd.field_Qb = false;
              if (var6 != null) {
                a.a(var6, false, se.h(25144));
              }
              if (eh.field_a <= 0 &&
                !on.field_d) {
                try {
                  nc.a(true, "unzap", se.h(25144));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  nc.a("zap", -14541, se.h(25144), new Object[]{cf.a(0, sh.field_f)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (eh.field_a > 0) {
                ce.field_w = true;
              }
              we.field_b.a(pd.field_h, (byte) 63);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                pd.field_h[var8Lifetime1] = pd.field_h[var8Lifetime1] + 50;
              }
              de.field_V.a(pd.field_h, (byte) 123);
              stackIn_87_0 = bh.field_k;
              return stackIn_87_0;
            }
            if (ph.field_xb == bh.field_l &&
              fh.a((byte) 122)) {
              si.a(119);
              if (bh.field_k == 7 &&
                !jd.field_Qb) {
                jd.field_Qb = true;
                stackIn_94_0 = -1;
                return stackIn_94_0;
              }
              if (bh.field_k == 7) {
                bh.field_k = 3;
              }
              rk.field_Y = de.field_V.c((byte) -38);
              jd.field_Qb = false;
              stackIn_99_0 = bh.field_k;
              return stackIn_99_0;
            }
            if (qc.field_s == null) {
              if (jd.field_Qb) {
                if (sl.a(-1) <= 30000L) {
                  rk.field_Y = re.field_u;
                } else {
                  rk.field_Y = kh.field_f;
                }
                jd.field_Qb = false;
                stackIn_107_0 = 3;
                return stackIn_107_0;
              }
              var6_intLifetime2 = hc.field_a;
              hc.field_a = ef.field_P;
              jd.field_Qb = true;
              ef.field_P = var6_intLifetime2;
            }
            stackIn_110_0 = -1;
            return stackIn_110_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_113_0 = var6_ref;
            stackIn_113_1 = new StringBuilder().append("sn.G(");
            if (param0 == null) {
              stackIn_114_2 = "null";
            } else {
              stackIn_114_2 = "{...}";
            }
            stackIn_116_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_117_2 = "null";
            } else {
              stackIn_117_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_116_1).append(stackIn_117_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final sn a(int param0, byte param1) {
        this.field_f = param0;
        if (param1 != 106) {
          return (sn) null;
        }
        return this;
    }

    final void a(sn param0, bc param1, int param2, int param3, int param4, ce param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        ce var8 = null;
        try {
          if (this.field_h) {
            param0.a(-2, param5, param4, param1, param3);
            param0.b((byte) 76);
          }
          if (-2147483648 != this.field_j) {
            param0.field_j = this.field_j;
          }
          if (this.field_i != -2147483648) {
            param0.field_i = this.field_i;
          }
          if (param2 <= 121) {
            var8 = (ce) null;
            this.a((sn) null, (bc) null, 121, -77, -29, (ce) null);
          }
          if (this.field_c != -2147483648) {
            param0.field_c = this.field_c;
          }
          if (this.field_f >= -1) {
            param0.field_f = this.field_f;
          }
          if (-1 <= this.field_d) {
            param0.field_d = this.field_d;
          }
          if (this.field_b != null) {
            param0.field_b = this.field_b;
          }
          if (null != this.field_a) {
            param0.field_a = this.field_a;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("sn.J(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final sn a(int param0, ck[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param1;
          var3_int = -21 % ((45 - param0) / 52);
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("sn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (cl.field_v == null) {
          return;
        }
        tj.a(param0, cl.field_v);
        cl.field_v.a(lf.field_e, 115);
        cl.field_v = null;
        if (null != li.field_b) {
          li.field_b.b((byte) -110);
        }
        jh.field_b.requestFocus();
    }

    sn() {
        this.field_i = -2147483648;
        this.field_d = -2;
        this.field_a = null;
        this.field_h = false;
        this.field_c = -2147483648;
        this.field_b = null;
        this.field_f = -2;
        this.field_j = -2147483648;
    }

    final sn a(int param0, boolean param1) {
        if (param0 != -16598) {
          this.field_h = true;
        }
        this.field_h = param1 ? true : false;
        return this;
    }

    public static void a(byte param0) {
        field_k = null;
        int var1 = -72 % ((param0 - 30) / 37);
        field_e = null;
    }

    static {
        field_e = new vj();
    }
}
