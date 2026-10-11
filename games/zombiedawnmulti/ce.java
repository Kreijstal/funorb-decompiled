/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends br {
    int field_t;
    static String field_o;
    private int field_j;
    private ja field_f;
    private lq field_p;
    private int field_n;
    int field_s;
    static int field_k;
    private int field_h;
    static String[] field_g;
    private fh field_i;
    int field_l;
    static int field_r;
    int field_q;
    int field_m;

    final void a(fh param0, int param1) {
        boolean stackIn_30_0 = false;
        int stackIn_37_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_29_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nm var6_ref_nm = null;
        int var7_int = 0;
        th var7 = null;
        lk var7_ref = null;
        br var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_51_0Lifetime1;
        int stackIn_51_1Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_i = param0;
          var3_int = 0 % ((59 - param1) / 56);
          this.field_n = 2 * ip.field_f + (this.field_t - 1);
          this.field_h = 2 * ip.field_f + this.field_m - 1;
          if (this.field_i.field_i.field_e <= this.field_n) {
            this.field_n = -1 + this.field_i.field_i.field_e;
          }
          if (this.field_h >= this.field_i.field_i.field_d) {
            this.field_h = -1 + this.field_i.field_i.field_d;
          }
          this.field_j = 0;
          if (o.field_j) {
            this.field_p = new lq();
            if (this.field_q != 1) {
              var4 = 48 * ip.field_f;
              var5 = ip.field_f * 48;
              this.field_f = new ja(var4, var5);
              var6 = this.field_t;
              while (this.field_n >= var6) {
                if (var11 == 0) {
                  var7_int = this.field_m;
                  while (this.field_h >= var7_int) {
                    this.field_i.field_k[var6][var7_int] = false;
                    var7_int++;
                  }
                  var6++;
                  continue;
                }
                break;
              }
              g.c(this.field_f);
              var6_ref_nm = new nm(this.field_i.field_r, this.field_i.field_c);
              var6_ref_nm.field_g = 240 + this.field_t * 24;
              var6_ref_nm.field_k = this.field_m * 24 + 320;
              this.field_i.a((byte) -12, var6_ref_nm);
              if (0 == this.field_q) {
                oo.b();
              }
              this.field_i.a(1, false, var6_ref_nm, -1);
              var7 = fb.field_e.field_H;
              var8 = var7.c(46);
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (null == var8))) {
                stackOut_29_0 = var8 instanceof fd;
                stackIn_37_0 = stackOut_29_0 ? 1 : 0;
                stackIn_30_0 = stackOut_29_0;
                if (var11 == 0) {
                  if (stackIn_30_0) {
                    ((id) (var8)).a(-10136, var6_ref_nm);
                  }
                  var8 = var7.b(6);
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                this.field_i.a(2, false, var6_ref_nm, -1);
                g.d();
                stackIn_37_0 = this.field_t;
              }
              var9 = stackIn_37_0;
              while (this.field_n >= var9) {
                if (var11 != 0) {
                  return;
                }
                var10 = this.field_m;
                while (var10 <= this.field_h) {
                  this.field_i.field_k[var9][var10] = true;
                  var10++;
                }
                var9++;
              }
              if (var11 == 0) {
                return;
              }
            }
            var4Lifetime1 = this.field_t;
            while (true) {
              stackIn_51_0 = this.field_n;
              stackIn_51_1 = var4Lifetime1;
              if (stackIn_51_0 < stackIn_51_1) {
                return;
              }
              if (var11 != 0) {
                return;
              }
              var5Lifetime1 = this.field_m;
              while (var5Lifetime1 <= this.field_h) {
                stackIn_51_0Lifetime1 = 0;
                stackIn_51_1Lifetime1 = this.field_i.field_i.field_h[var4Lifetime1][var5Lifetime1] & 1;
                if (stackIn_51_0Lifetime1 != stackIn_51_1Lifetime1 ||
                  this.field_i.field_k[var4Lifetime1][var5Lifetime1]) {
                  var6Lifetime1 = 0;
                  while (2 > var6Lifetime1) {
                    var7_ref = p.a(var5Lifetime1 * 24, var4Lifetime1 * 24, 100, true);
                    this.field_p.a(29664, var7_ref);
                    op.field_m.field_K.a(-25612, var7_ref);
                    var6Lifetime1++;
                  }
                }
                this.field_i.field_k[var4Lifetime1][var5Lifetime1] = false;
                var5Lifetime1++;
              }
              var4Lifetime1++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_73_0 = var3;
          stackIn_73_1 = new StringBuilder().append("ce.H(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, String param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          nq.field_t.field_wb = param8;
          if (param4 < 109) {
            ce.a(-64);
          }
          if (va.field_a != 2) {
            jk.field_d.field_wb = io.field_e;
            if (ZombieDawnMulti.field_E) {
              jk.field_d.field_wb = tm.field_d;
            }
          } else {
            jk.field_d.field_wb = tm.field_d;
          }
          var9_int = 495;
          var10 = 5;
          br.field_c.a(param0, var10, var9_int - 10, 5, -3344);
          ec.field_b.a(param0, 0, br.field_c.field_zb - ua.field_E.field_zb, 0, -3344);
          var10 = var10 + (param6 + param0);
          ua.field_E.a(param0, 0, ua.field_E.field_zb, ec.field_b.field_zb, -3344);
          dp.field_c.a(param7, var10, dp.field_c.e(0), 5, -3344);
          var11 = jk.field_d.e(0);
          jk.field_d.a(param7, var10, var11, -5 + var9_int - var11, -3344);
          nq.field_t.a(param3, 0, var9_int, 0, -3344);
          var12 = 5 + var10 + param7;
          re.field_a.a(var12, param3, var9_int, 0, -3344);
          var12 = var12 + param3;
          re.field_a.field_ab = tg.a(2105376, re.field_a.field_z, 8421504, 3, 11579568, 49);
          lj.field_v.a(var12, -(var12 / 2) + param5, var9_int, param2 - var9_int / 2, -3344);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_14_0 = var9;
          stackIn_14_1 = new StringBuilder().append("ce.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_j != 0) {
            this.b(false);
          }
          if (param0 != -60) {
            ce.c((byte) -16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ce.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        try {
          field_o = null;
          field_g = null;
          if (param0 != 24) {
            field_g = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ce.I(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1 / 24;
          var5 = param0 / 24;
          if (param2 != -1) {
            this.field_n = 94;
          }
          stackIn_16_0 = (var5 >= this.field_m) && (this.field_h >= var5) && (var4_int >= this.field_t) && (var4_int <= this.field_n);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ce.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, nm param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1.c(this.field_m * 24, -20126);
          param1.c((this.field_h + 1) * 24, -20126);
          if (param0 != 19) {
            return;
          }
          var4 = param1.d(this.field_t * 24, 114);
          param1.d((1 + this.field_n) * 24, 127);
          var5 = 50;
          if (this.field_j == 0) {
            var5 = -this.field_s + this.field_l;
            if (ZombieDawnMulti.field_E &&
              this.field_j == 2) {
              var5 = this.field_s;
            }
          } else {
            if (this.field_j == 2) {
              var5 = this.field_s;
            }
          }
          var6 = 0;
          var7 = 0;
          if (this.field_q == 0) {
            var8 = 47;
            var9 = var8 + (-var8 + 255) * (-var5 + 50) / 50;
            this.field_f.c(var6 + var3_int, var4 + var7, var9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("ce.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void d(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        fc stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        boolean stackIn_15_4 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 <= 40) {
            this.a(79, -32, -25);
          }
          var2_int = this.field_t;
          while (this.field_n >= var2_int) {
            if (var4 != 0) {
              return;
            }
            var3 = this.field_m;
            while (var3 <= this.field_h) {
              stackIn_14_0 = this.field_i.field_i;
              stackIn_14_1 = -8927;
              stackIn_14_2 = var2_int;
              stackIn_14_3 = var3;
              stackIn_15_4 = (0 != (1 & this.field_i.field_i.field_h[var2_int][var3]));
              ((fc) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_15_4);
              this.field_i.field_k[var2_int][var3] = false;
              var3++;
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ce.K(" + param0 + ')');
        }
    }

    final boolean d(int param0) {
        boolean stackIn_41_0 = false;
        int stackIn_48_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_40_0;
        int var2_int = 0;
        qa var2 = null;
        RuntimeException var2_ref = null;
        qa var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.field_s = this.field_s - 1;
          var2_int = this.field_j;
          if (var2_int == 0) {
            if (this.field_f != null &&
              0 == this.field_q) {
              this.field_f.b(0, 1, 0);
            }
            if (this.field_l - 50 >= this.field_s) {
              this.b(false);
              this.field_j = 1;
              return true;
            }
          } else {
            if (var2_int == 1 &&
              var4 == 0) {
              if (!(this.field_s > 50)) {
                this.field_j = 2;
              }
              decompiledFrameRemainder0 = false;
            } else {
              decompiledFrameRemainder0 = (var2_int == 2);
            }
            if (decompiledFrameRemainder0) {
              if (null != this.field_f &&
                this.field_q == 0) {
                this.field_f.b(0, -1, 0);
              }
              boolean decompiledFrameCompleted0 = true;
              if (this.field_p != null) {
                var3 = this.field_p.c((byte) 115);
                while (var3 != null) {
                  var2 = this.field_p.b((byte) 97);
                  ((lk) (var3)).field_S = 1;
                  stackOut_40_0 = ((lk) (var3)).field_O;
                  stackIn_48_0 = stackOut_40_0 ? 1 : 0;
                  stackIn_41_0 = stackOut_40_0;
                  if (var4 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_41_0) {
                    ((lk) (var3)).j(param0 ^ -5404);
                  }
                  var3 = var2;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_48_0 = ~this.field_s;
              }
              if (stackIn_48_0 >= -1) {
                this.d((byte) 87);
                this.a(true);
                return true;
              }
            }
          }
          if (param0 != -20232) {
            this.c(-117);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "ce.C(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        fc stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        boolean stackIn_18_4 = false;
        boolean[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean stackIn_22_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0) {
            ce.a(-36, 94, -24, 32, (byte) 68, -15, -48, 125, (String) null);
          }
          var2_int = this.field_t;
          L1: while (true) {
            stackIn_6_0 = ~this.field_n;
            stackIn_6_1 = ~var2_int;
            if (stackIn_6_0 <= stackIn_6_1) {
              if (var4 != 0) {
                return;
              }
              var3 = this.field_m;
              while (this.field_h >= var3) {
                stackIn_6_0 = ~(this.field_i.field_i.field_g[var2_int][var3] & -2147483648);
                stackIn_6_1 = -1;
                if (stackIn_6_0 == stackIn_6_1) {
                  stackIn_17_0 = this.field_i.field_i;
                  stackIn_17_1 = -8927;
                  stackIn_17_2 = var2_int;
                  stackIn_17_3 = var3;
                  stackIn_18_4 = (0 == this.field_q);
                  ((fc) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_18_4);
                  stackIn_21_0 = this.field_i.field_k[var2_int];
                  stackIn_21_1 = var3;
                  stackIn_22_2 = (this.field_q == 0);
                  stackIn_21_0[stackIn_21_1] = stackIn_22_2;
                }
                var3++;
              }
              var2_int++;
              continue L1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ce.A(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        try {
          cb.a((String) null, 32, mc.field_g);
          if (param0 != -123) {
            ce.a(79);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ce.G(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_s > 50) {
            this.field_s = 50;
          }
          if (param0 != -28188) {
            this.field_h = -2;
          }
          this.field_j = 2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ce.E(" + param0 + ')');
        }
    }

    ce(fh param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = param0;
          param1 = param1 / 24;
          param2 = param2 / 24;
          this.field_q = param4;
          this.field_s = param3;
          this.field_l = param3;
          this.field_t = param2 - ip.field_f;
          if (this.field_t < 0) {
            this.field_t = 0;
          }
          this.field_m = param1 - ip.field_f;
          if (this.field_m < 0) {
            this.field_m = 0;
          }
          if (null != this.field_i) {
            this.a(this.field_i, 118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ce.<init>(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_o = "<%0> must play 1 more rated game before playing with the current options.";
        field_g = new String[]{"Mode: Normal", "Mode: Hard"};
    }
}
