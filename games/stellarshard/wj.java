/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wj extends fb {
    private fh field_s;
    static String[] field_t;

    public static void d(byte param0) {
        int var1 = 69 % ((param0 + 39) / 53);
        field_t = null;
    }

    private final void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          ka stackIn_7_0 = null;
          boolean stackIn_7_1 = false;
          int stackIn_8_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_s == null) {
            return;
          }
          if (param0 != 24215) {
            return;
          }
          try {
            this.field_c.field_k = 0;
            stackIn_7_0 = this.field_c;
            stackIn_7_1 = false;
            if (!param1) {
              stackIn_8_2 = 3;
            } else {
              stackIn_8_2 = 2;
            }
            ((ka) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_8_2);
            this.field_c.a(param0 - 24175, 0L);
            this.field_s.a(this.field_c.field_r, 0, 121, this.field_c.field_r.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_s = null;
            this.field_g = -2;
            this.field_i = this.field_i + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public wj() {
    }

    final static int a(String param0, int param1, boolean param2, String param3, byte param4, boolean param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_29_0 = 0;
          boolean stackIn_42_0 = false;
          boolean stackIn_45_0 = false;
          int stackIn_72_0 = 0;
          int stackIn_82_0 = 0;
          int stackIn_84_0 = 0;
          int stackIn_92_0 = 0;
          int stackIn_94_0 = 0;
          RuntimeException stackIn_97_0 = null;
          StringBuilder stackIn_97_1 = null;
          String stackIn_98_2 = null;
          StringBuilder stackIn_100_1 = null;
          String stackIn_101_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          String var7_ref_String = null;
          int var8 = 0;
          int var9 = 0;
          Throwable var9_ref_Throwable = null;
          int var10 = 0;
          String var11 = null;
          CharSequence var12 = null;
          int var7Lifetime1;
          int var7Lifetime2;
          int var9Lifetime1;
          var10 = stellarshard.field_B;
          try {
            if (ob.field_b == null &&
              !nh.a(-1, param5)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (sl.field_d == oa.field_C) {
              if (!param5) {
                le.field_n = h.a(param0, (byte) -117, false, param3);
              } else {
                var11 = (String) null;
                le.field_n = wf.a(we.field_a, (String) null, -124, param0, false);
              }
              pg.field_fb.field_k = 0;
              pg.field_fb.a(false, 14);
              pg.field_fb.a(false, le.field_n.a(160).field_h);
              ue.a((byte) 114, -1);
              sl.field_d = de.field_a;
            }
            var6_int = 119 / ((param4 + 28) / 43);
            if (sl.field_d == de.field_a &&
              qe.b(64, 1)) {
              var7 = ae.field_N.f(4);
              ae.field_N.field_k = 0;
              if (var7 == 0) {
                sl.field_d = vg.field_p;
              } else {
                sl.field_d = ih.field_a;
                ue.field_b = -1;
                ja.field_t = var7;
              }
            }
            if (sl.field_d == vg.field_p &&
              qe.b(64, 8)) {
              ob.field_a = ae.field_N.d(0);
              ae.field_N.field_k = 0;
              cd.a(54, param2, le.field_n, param1, param5);
              sl.field_d = lb.field_o;
            }
            boolean decompiledFrameRemainder0 = true;
            if (sl.field_d == lb.field_o &&
              qe.b(64, 1)) {
              var7Lifetime1 = ae.field_N.f(4);
              ja.field_t = var7Lifetime1;
              pk.field_b = null;
              ae.field_N.field_k = 0;
              if (var7Lifetime1 != 0 &&
                var7Lifetime1 != 1) {
                if (8 != var7Lifetime1) {
                  sl.field_d = ih.field_a;
                  ue.field_b = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  oj.c(-2290);
                  ta.field_u = false;
                  stackIn_29_0 = var7Lifetime1;
                  return stackIn_29_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ue.field_b = -1;
                sl.field_d = ge.field_m;
              }
            }
            if (sl.field_d == ge.field_m &&
              cd.e((byte) 125)) {
              we.field_a = ae.field_N.d(0);
              ph.field_D = ae.field_N.f(4);
              ae.field_N.f(4);
              mk.field_k = ae.field_N.c((byte) 56);
              var7_ref_String = ae.field_N.a(0);
              var8 = ae.field_N.f(4);
              if ((var8 & 1) != 0) {
                nd.g(-26923);
              }
              if (!param5) {
                stackIn_42_0 = ((8 & var8) != 0);
                wd.field_c = stackIn_42_0;
                stackIn_45_0 = ((var8 & 4) != 0);
                ta.field_n = stackIn_45_0;
                if (wd.field_c) {
                }
              }
              if (tl.field_b) {
                ae.field_N.f(4);
                ae.field_N.f(4);
                ae.field_N.b(false);
                aj.field_a = ae.field_N.c((byte) 107);
                bf.field_a = new byte[aj.field_a];
                for (var9 = 0; aj.field_a > var9; var9++) {
                  bf.field_a[var9] = ae.field_N.g(102);
                }
              }
              wf.field_b = ae.field_N.e((byte) 97);
              var12 = (CharSequence) ((Object) wf.field_b);
              wb.field_b = nh.a(var12, false);
              ag.field_c = ae.field_N.f(4);
              sl.field_d = la.field_O;
              if (le.field_n.a(160) != hc.field_s) {
                if (le.field_n.a(160) == ea.field_o) {
                  ak.field_d.a(hf.a((byte) -34), (byte) 73);
                }
              } else {
                kk.field_k.a(hf.a((byte) -8), (byte) 73);
              }
              ta.field_u = false;
              if (var7_ref_String != null) {
                dj.a(false, hf.a((byte) -112), var7_ref_String);
              }
              if (0 >= mk.field_k &&
                !ta.field_n) {
                try {
                  sh.a("unzap", hf.a((byte) -24), (byte) 78);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var9_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  sh.a(new Object[]{cj.a(we.field_a, (byte) -66)}, false, "zap", hf.a((byte) -62));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var9_ref_Throwable = decompiledCaughtException;
                }
              }
              if (0 < mk.field_k) {
                uj.field_f = true;
              }
              pg.field_fb.a(dj.field_b, -1001);
              for (var9Lifetime1 = 0; 4 > var9Lifetime1; var9Lifetime1++) {
                dj.field_b[var9Lifetime1] = dj.field_b[var9Lifetime1] + 50;
              }
              ae.field_N.a(dj.field_b, -1001);
              stackIn_72_0 = ja.field_t;
              return stackIn_72_0;
            }
            if (ih.field_a == sl.field_d &&
              cd.e((byte) 123)) {
              oj.c(-2290);
              if (ja.field_t == 7 &&
                !ta.field_u) {
                ta.field_u = true;
                stackIn_84_0 = -1;
                return stackIn_84_0;
              }
              if (7 == ja.field_t) {
                ja.field_t = 3;
              }
              ga.field_a = ae.field_N.e((byte) 116);
              ta.field_u = false;
              stackIn_82_0 = ja.field_t;
              return stackIn_82_0;
            }
            if (ob.field_b == null) {
              if (ta.field_u) {
                if (tk.b(125) <= 30000L) {
                  ga.field_a = wb.field_h;
                } else {
                  ga.field_a = hj.field_a;
                }
                ta.field_u = false;
                stackIn_92_0 = 3;
                return stackIn_92_0;
              }
              var7Lifetime2 = ue.field_d;
              ue.field_d = wd.field_a;
              wd.field_a = var7Lifetime2;
              ta.field_u = true;
            }
            stackIn_94_0 = -1;
            return stackIn_94_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_97_0 = var6;
            stackIn_97_1 = new StringBuilder().append("wj.D(");
            if (param0 == null) {
              stackIn_98_2 = "null";
            } else {
              stackIn_98_2 = "{...}";
            }
            stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_101_2 = "null";
            } else {
              stackIn_101_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean f(int param0) {
        try {
          int var2_int = 0;
          int stackIn_62_0 = 0;
          int stackIn_78_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          ph var2 = null;
          IOException var2_ref = null;
          int var3_int = 0;
          Exception var3 = null;
          int var4 = 0;
          Exception var5_ref_Exception = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          long var12 = 0L;
          Object var14 = null;
          ph var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          ph var2Lifetime1;
          var16 = stellarshard.field_B;
          if (null != this.field_s) {
            var2_long = ih.a((byte) -98);
            var4 = (int)(var2_long - this.field_l);
            if (200 < var4) {
              var4 = 200;
            }
            this.field_l = var2_long;
            this.field_m = this.field_m + var4;
            if (this.field_m > 30000) {
              try {
                this.field_s.a(true);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
          }
          if (this.field_s == null) {
            if (this.b((byte) -123) != 0) {
              return false;
            }
            if (this.a(param0 ^ 26348) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_s.c(param0 + 32614);
            var2 = (ph) (this.field_o.a(false));
            while (var2 != null) {
              this.field_c.field_k = 0;
              this.field_c.a(false, 1);
              this.field_c.a(116, var2.field_o);
              this.field_s.a(this.field_c.field_r, 0, 107, this.field_c.field_r.length);
              this.field_q.a((byte) 125, var2);
              var2 = (ph) (this.field_o.a(-116));
            }
            if (param0 != 26348) {
              wj.d((byte) 71);
            }
            var2Lifetime1 = (ph) (this.field_j.a(false));
            while (var2Lifetime1 != null) {
              this.field_c.field_k = 0;
              this.field_c.a(false, 0);
              this.field_c.a(param0 - 26250, var2Lifetime1.field_o);
              this.field_s.a(this.field_c.field_r, 0, 114, this.field_c.field_r.length);
              this.field_k.a((byte) 126, var2Lifetime1);
              var2Lifetime1 = (ph) (this.field_j.a(-121));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_s.b(-93);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_m = 0;
                var4 = 0;
                if (this.field_r == null) {
                  var4 = 10;
                } else {
                  if (this.field_r.field_C == 0) {
                    var4 = 1;
                  }
                }
                if (0 < var4) {
                  var5 = -this.field_a.field_k + var4;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_s.a(this.field_a.field_k, (byte) -64, this.field_a.field_r, var5);
                  if (0 != this.field_p) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_a.field_r[var6 + this.field_a.field_k] = (byte)ih.a((int) this.field_a.field_r[var6 + this.field_a.field_k], (int) this.field_p);
                    }
                  }
                  this.field_a.field_k = this.field_a.field_k + var5;
                  if (var4 <= this.field_a.field_k) {
                    if (null != this.field_r) {
                      if (this.field_r.field_C != 0) {
                        throw new IOException();
                      }
                      if (this.field_a.field_r[0] == -1) {
                        this.field_a.field_k = 0;
                        this.field_r.field_C = 1;
                      } else {
                        this.field_r = null;
                      }
                    } else {
                      this.field_a.field_k = 0;
                      var6 = this.field_a.f(4);
                      var7 = this.field_a.b(false);
                      var8 = this.field_a.f(4);
                      var9 = this.field_a.b(false);
                      var10 = 127 & var8;
                      stackIn_62_0 = ((var8 & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_62_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (ph) (this.field_k.a(false));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_o) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (ph) (this.field_k.a(-102));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (ph) (this.field_q.a(false));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_o) {
                            break;
                          }
                          var14_ref = (ph) (this.field_q.a(param0 ^ -26262));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      this.field_r = var14_ref;
                      stackIn_78_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_78_0;
                      this.field_r.field_G = new ka(var15 + var9 + this.field_r.field_F);
                      this.field_r.field_G.a(false, var10);
                      this.field_r.field_G.b(0, var9);
                      this.field_a.field_k = 0;
                      this.field_r.field_C = 10;
                    }
                  }
                } else {
                  var5 = -this.field_r.field_F + this.field_r.field_G.field_r.length;
                  var6 = -this.field_r.field_C + 512;
                  if (var6 > -this.field_r.field_G.field_k + var5) {
                    var6 = -this.field_r.field_G.field_k + var5;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_s.a(this.field_r.field_G.field_k, (byte) -64, this.field_r.field_G.field_r, var6);
                  if (this.field_p != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_r.field_G.field_r[this.field_r.field_G.field_k + var7] = (byte)ih.a((int) this.field_r.field_G.field_r[this.field_r.field_G.field_k + var7], (int) this.field_p);
                    }
                  }
                  this.field_r.field_G.field_k = this.field_r.field_G.field_k + var6;
                  this.field_r.field_C = this.field_r.field_C + var6;
                  if (var5 != this.field_r.field_G.field_k) {
                    if (this.field_r.field_C == 512) {
                      this.field_r.field_C = 0;
                    }
                  } else {
                    this.field_r.c((byte) 36);
                    this.field_r.field_w = false;
                    this.field_r = null;
                  }
                }
                continue;
              }
              break;
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_g = -2;
            this.field_s = null;
            this.field_i = this.field_i + 1;
            if (this.b((byte) -93) == 0 &&
              this.a(param0 ^ 26348) == 0) {
              return true;
            }
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(byte param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_s) {
            return;
          }
          if (param0 != -84) {
            this.a(34, true);
          }
          try {
            this.field_c.field_k = 0;
            this.field_c.a(false, 6);
            this.field_c.b(3, (byte) 119);
            this.field_c.c(0, -121);
            this.field_s.a(this.field_c.field_r, 0, 110, this.field_c.field_r.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_s = null;
            this.field_i = this.field_i + 1;
            this.field_g = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void h(int param0) {
        if (param0 > -124) {
          wj.g(-16);
        }
        if (!cg.field_a) {
          throw new IllegalStateException();
        }
        qh.field_d = true;
        va.a(false, -844);
        eg.field_d = 0;
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          ph var4_ref = null;
          int var4_int = 0;
          RuntimeException var4_ref2 = null;
          IOException var5 = null;
          Exception var6 = null;
          int var7 = 0;
          ph var4_refLifetime1;
          var7 = stellarshard.field_B;
          try {
            if (this.field_s != null) {
              try {
                this.field_s.a(true);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
            this.field_s = (fh) (param1);
            this.e((byte) -84);
            this.a(24215, param0);
            this.field_r = null;
            this.field_a.field_k = 0;
            while (true) {
              var4_ref = (ph) (this.field_q.a((byte) 110));
              if (var4_ref != null) {
                this.field_o.a((byte) 124, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (ph) (this.field_k.a((byte) 61));
              if (var4_refLifetime1 != null) {
                this.field_j.a((byte) 125, var4_refLifetime1);
                continue;
              }
              break;
            }
            var4_int = -48 % ((-59 - param2) / 61);
            if (this.field_p != 0) {
              try {
                this.field_c.field_k = 0;
                this.field_c.a(false, 4);
                this.field_c.a(false, (int) this.field_p);
                this.field_c.b(0, 0);
                this.field_s.a(this.field_c.field_r, 0, 111, this.field_c.field_r.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var5 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_s.a(true);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_g = -2;
                this.field_s = null;
                this.field_i = this.field_i + 1;
              }
            }
            this.field_m = 0;
            this.field_l = ih.a((byte) -98);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var4_ref2;
            stackIn_24_1 = new StringBuilder().append("wj.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        try {
          this.field_s.a(true);
        } catch (Exception exception) {
        }
        this.field_g = -1;
        this.field_s = null;
        if (param0 > -101) {
          return;
        }
        this.field_i = this.field_i + 1;
        this.field_p = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void c(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        pb var2_ref_pb = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        pb var9 = null;
        int var10 = 0;
        pb var11 = null;
        pb var12 = null;
        String var14 = null;
        pb var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_49_3 = 0;
        boolean stackIn_54_0 = false;
        boolean stackIn_63_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var10 = stellarshard.field_B;
        try {
          if (nh.field_g != null &&
            nh.field_g.a((byte) -36) &&
            nh.field_g.a("benefits", (byte) -109) &&
            vf.field_E != null &&
            vf.field_E.a((byte) -36) &&
            vf.field_E.a("benefits", (byte) -109)) {
            tk.field_c = qd.a(nh.field_g, "headline", "benefits", (byte) 81);
            pl.field_T = qd.a(nh.field_g, "blurbpane", "benefits", (byte) 78);
            fe.field_a = qd.a(nh.field_g, "button", "benefits", (byte) 78);
            dd.field_a = qd.a(nh.field_g, "signup_text", "benefits", (byte) 57);
            na.field_e = qd.a(nh.field_g, "menu_text", "benefits", (byte) 42);
            ui.field_F = qd.a(nh.field_g, "button_frame", "benefits", (byte) 59);
            ea.field_l = qd.a(nh.field_g, "arrow", "benefits", (byte) 118);
            o.field_h = (bd) ((Object) ae.a("benefits", "large_font", nh.field_g, -109, vf.field_E));
            fj.field_f = (bd) ((Object) ae.a("benefits", "small_font", nh.field_g, -116, vf.field_E));
            var27 = ti.field_a;
            var2 = ti.field_i;
            var3 = ti.field_b;
            ti.a(pk.field_i);
            var11 = new pb(ea.field_l.field_v + 4, ea.field_l.field_y + 4);
            var11.e();
            ea.field_l.c(2, 2, ki.field_x);
            oj.a(var11, 1, 0, var11.field_y, 2, 0, var11.field_v, true);
            ea.field_l = var11;
            bk.field_b = ea.field_l.f();
            var12 = new pb(195, 221);
            var6 = var12.field_v / 2;
            var12.e();
            o.field_h.c(h.a(ph.field_E, 0, new String[]{vd.field_d}), var6, 40, 16777215, -1);
            fj.field_f.c(h.a(ch.field_c, 0, new String[]{vd.field_d}), var6, 60, 16777215, -1);
            o.field_h.c(h.a(vd.field_a, 0, new String[]{vg.field_r}), var6, 110, 16777215, -1);
            fj.field_f.c(h.a(rb.field_t, 0, new String[]{vg.field_r}), var6, 130, 16777215, -1);
            o.field_h.c(cm.field_b, var6, 180, 16777215, -1);
            fj.field_f.c(nl.field_d, var6, 200, 16777215, -1);
            oj.a(var12, 1, 0, var12.field_y, 3, 0, var12.field_v, true);
            pl.field_T.e();
            var12.e(-pl.field_T.field_t + 18, 241 - pl.field_T.field_s);
            for (var7 = 0; pk.field_d.length > var7; var7++) {
              dl.field_C[var7].e();
              fj.field_f.a(pk.field_d[var7], 3, 3, -6 + dl.field_C[var7].field_v, dl.field_C[var7].field_y - 6, ki.field_x, -1, 1, 1, fj.field_f.field_N + fj.field_f.field_r);
              oj.a(dl.field_C[var7], 1, 0, dl.field_C[var7].field_y, 3, 0, dl.field_C[var7].field_v, true);
            }
            pk.field_d = null;
            q.field_b = dd.field_a.a();
            q.field_b.e();
            ob.a(117, 0, 64, ti.field_i, ti.field_b * 2 / 3, 0);
            ti.a(var27, var2, var3);
            ti.b(pk.field_i);
            wc.field_y = 231 + (fe.field_a.field_v - ui.field_F.field_v) / 2;
            cm.field_a = (fe.field_a.field_v - ui.field_F.field_v) / 2 + 434;
            af.field_l = (fe.field_a.field_y - ui.field_F.field_y) / 2 + 390;
            nh.field_g = null;
            vi.field_a = 390 + (-ui.field_F.field_y + fe.field_a.field_y) / 2;
          }
          if (ve.field_a == null) {
            return;
          }
          if (null != ug.field_f &&
            null != o.field_h) {
            var28 = ti.field_a;
            var2Lifetime1 = ti.field_i;
            var3Lifetime1 = ti.field_b;
            ti.a(pk.field_i);
            var14 = h.a(hj.field_b, 0, new String[]{ai.field_a[ic.field_a]});
            var5 = o.field_h.b(var14, vh.field_i);
            var6Lifetime1 = o.field_h.b(var14, vh.field_i, o.field_h.field_N + o.field_h.field_r);
            var7Lifetime1 = (vh.field_i - var5) / 2 + kk.field_o;
            var8 = (i.field_a - var6Lifetime1) / 2 + vi.field_d;
            var7Lifetime1 -= 3;
            var5 += 6;
            var6Lifetime1 += 6;
            var8 -= 3;
            if (var7Lifetime1 < 0) {
              var9_int = -var7Lifetime1;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              ug.field_f.field_w = ug.field_f.field_w + 2 * var9_int;
              pk.field_g = pk.field_g - var9_int;
              var5 = var5 + var9_int * 2;
              ug.field_f.field_t = ug.field_f.field_t + var9_int;
              kk.field_o = kk.field_o + var9_int;
            }
            if (var5 + var7Lifetime1 > ug.field_f.field_w) {
              var9_intLifetime1 = var5 + var7Lifetime1 - ug.field_f.field_w;
              ug.field_f.field_w = ug.field_f.field_w + var9_intLifetime1 * 2;
              var5 = var5 + 2 * var9_intLifetime1;
              pk.field_g = pk.field_g - var9_intLifetime1;
              kk.field_o = kk.field_o + var9_intLifetime1;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              ug.field_f.field_t = ug.field_f.field_t + var9_intLifetime1;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              vi.field_d = vi.field_d + var9_intLifetime2;
              var8 = var8 + var9_intLifetime2;
              ug.field_f.field_x = ug.field_f.field_x + 2 * var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime2;
              t.field_a = t.field_a - var9_intLifetime2;
              ug.field_f.field_s = ug.field_f.field_s + var9_intLifetime2;
            }
            if (ug.field_f.field_x < var6Lifetime1 + var8) {
              var9_intLifetime3 = -ug.field_f.field_x + var8 + var6Lifetime1;
              ug.field_f.field_s = ug.field_f.field_s + var9_intLifetime3;
              ug.field_f.field_x = ug.field_f.field_x + var9_intLifetime3 * 2;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              t.field_a = t.field_a - var9_intLifetime3;
              vi.field_d = vi.field_d + var9_intLifetime3;
            }
            ug.field_f.b();
            var9 = new pb(ug.field_f.field_w, ug.field_f.field_x);
            var9.e();
            o.field_h.a(var14, kk.field_o, vi.field_d, vh.field_i, i.field_a, 16777215, -1, 1, 1, o.field_h.field_N + o.field_h.field_r);
            oj.a(var9, 1, 0, var9.field_x, 3, 0, var9.field_w, true);
            ug.field_f.e();
            var9.e(0, 0);
            jd.field_a = new pb(640, 480);
            jd.field_a.e();
            ug.field_f.b(pk.field_g + (ug.field_f.field_w >> 1), (ug.field_f.field_x >> 1) + t.field_a, bl.field_d, 4096);
            ug.field_f = null;
            jd.field_a.d();
            ti.a(var28, var2Lifetime1, var3Lifetime1);
            ti.b(pk.field_i);
          }
          if (be.field_f != null &&
            null != fj.field_f) {
            var29 = ti.field_a;
            var2Lifetime2 = ti.field_i;
            var3Lifetime2 = ti.field_b;
            ti.a(pk.field_i);
            var16 = new pb(412, 43);
            var5_ref_String = h.a(wg.field_b, 0, new String[]{be.field_f});
            be.field_f = null;
            var16.e();
            fj.field_f.a(var5_ref_String, 3, 3, -6 + var16.field_v, var16.field_y - 6, 16777215, -1, 0, 1, fj.field_f.field_r + fj.field_f.field_N);
            oj.a(var16, 1, 0, var16.field_y, 3, 0, var16.field_v, true);
            ve.field_a.e();
            var16.e(199 - ve.field_a.field_t, 83 - ve.field_a.field_s);
            ti.a(var29, var2Lifetime2, var3Lifetime2);
            ti.b(pk.field_i);
          }
          if (null != eh.field_f &&
            null != fj.field_f) {
            var30 = ti.field_a;
            var2Lifetime3 = ti.field_i;
            var3Lifetime3 = ti.field_b;
            ti.a(pk.field_i);
            var4 = 6 + fj.field_f.b(li.field_a, 640);
            var5Lifetime1 = 20 + eh.field_f.field_w + var4;
            var6Lifetime2 = 427 - var5Lifetime1 / 2;
            var7Lifetime2 = 20 + (var6Lifetime2 + eh.field_f.field_w);
            ve.field_a.e();
            fj.field_f.a(li.field_a, var7Lifetime2 - ve.field_a.field_t, fj.field_f.field_r - ve.field_a.field_s + (155 + fj.field_f.field_N), 16777215, -1);
            oj.a(ve.field_a, 1, -4 + (var7Lifetime2 - ve.field_a.field_t), 50, 3, 155 - ve.field_a.field_s, var4, true);
            var8Lifetime1 = -ve.field_a.field_s + (155 - (-fj.field_f.field_r - fj.field_f.field_N + (-3 + eh.field_f.field_x)) / 2);
            eh.field_f.e(-ve.field_a.field_t + var6Lifetime2, var8Lifetime1);
            ti.a(var30, var2Lifetime3, var3Lifetime3);
            ti.b(pk.field_i);
            eh.field_f = null;
          }
          ti.a(pk.field_i);
          ti.a(16, 16, 608, 112, 15, ki.field_t, jb.field_a);
          ti.a(231, 144, 393, 232, 15, ki.field_t, jb.field_a);
          if (null != tk.field_c) {
            tk.field_c.e(0, 0);
          }
          if (null != pl.field_T) {
            pl.field_T.e(0, 0);
          }
          ve.field_a.e(0, 0);
          var1_int = -52 % ((2 - param0) / 55);
          if (jd.field_a != null) {
            jd.field_a.e(0, 0);
          }
          if (null != fe.field_a &&
            null != ui.field_F) {
            fe.field_a.e(231, 390);
            var2_ref_pb = dd.field_a;
            if (cd.field_L.field_f == 0) {
              var2_ref_pb = q.field_b;
            }
            var2_ref_pb.e(0, 0);
            stackIn_48_0 = 40;
            stackIn_48_1 = 40;
            stackIn_48_2 = gj.field_v;
            if (cd.field_L.field_f == 0) {
              stackIn_49_3 = 4;
            } else {
              stackIn_49_3 = 3;
            }
            var3Lifetime4 = stackIn_48_0 + (stackIn_48_1 * ih.b(stackIn_48_2 << stackIn_49_3, 64763) >> 16);
            if (var3Lifetime4 > 0) {
              fe.field_a.d(230, 389, var3Lifetime4);
              fe.field_a.d(232, 389, var3Lifetime4);
              fe.field_a.d(232, 391, var3Lifetime4);
              fe.field_a.d(230, 391, var3Lifetime4);
              var2_ref_pb.d(1, 1, var3Lifetime4);
              var2_ref_pb.d(-1, 1, var3Lifetime4);
              var2_ref_pb.d(1, -1, var3Lifetime4);
              var2_ref_pb.d(-1, -1, var3Lifetime4);
            }
            stackIn_54_0 = (cd.field_L.field_f == 0);
            tk.a(stackIn_54_0, wc.field_y, vi.field_a, -127);
          }
          if (null != fe.field_a &&
            null != ui.field_F) {
            fe.field_a.e(434, 390);
            na.field_e.e(0, 0);
            if (1 == cd.field_L.field_f) {
              ob.a(116, 436, 64, fe.field_a.field_v - 4, 7 * fe.field_a.field_y / 12, 392);
            }
            stackIn_63_0 = (1 == cd.field_L.field_f);
            tk.a(stackIn_63_0, cm.field_a, af.field_l, -108);
          }
          if (null != ea.field_l) {
            var2Lifetime4 = 357 - ea.field_l.field_x / 2;
            ea.field_l.e(-ea.field_l.field_w + 269, var2Lifetime4);
            bk.field_b.e(586, var2Lifetime4);
            if (var2Lifetime4 < eb.field_a &&
              eb.field_a < ea.field_l.field_y + var2Lifetime4) {
              var3Lifetime5 = 40 + (ih.b(gj.field_v << 4, 64763) * 40 >> 16);
              if (var3Lifetime5 <= 0) {
                kc.a(36);
                dl.field_C[nk.field_c].e(269, 340);
                return;
              }
              if (-ea.field_l.field_v + 269 < ni.field_e &&
                ni.field_e < 269) {
                ea.field_l.d(-ea.field_l.field_w + 268, -1 + var2Lifetime4, var3Lifetime5);
                ea.field_l.d(1 + (-ea.field_l.field_w + 269), -1 + var2Lifetime4, var3Lifetime5);
                ea.field_l.d(-1 + (-ea.field_l.field_w + 269), 1 + var2Lifetime4, var3Lifetime5);
                ea.field_l.d(-ea.field_l.field_w + 269 + 1, 1 + var2Lifetime4, var3Lifetime5);
              } else {
                if (ni.field_e > 586 &&
                  586 + ea.field_l.field_v > ni.field_e) {
                  bk.field_b.d(585, -1 + var2Lifetime4, var3Lifetime5);
                  bk.field_b.d(587, -1 + var2Lifetime4, var3Lifetime5);
                  bk.field_b.d(585, 1 + var2Lifetime4, var3Lifetime5);
                  bk.field_b.d(587, 1 + var2Lifetime4, var3Lifetime5);
                }
              }
            }
          }
          kc.a(36);
          dl.field_C[nk.field_c].e(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "wj.H(" + param0 + ')');
        }
    }

    final static Boolean g(int param0) {
        Boolean var1 = nb.field_M;
        nb.field_M = null;
        if (param0 >= -111) {
          wj.g(115);
        }
        return var1;
    }

    final void a(byte param0) {
        if (param0 <= 82) {
          wj.d((byte) -54);
        }
        if (this.field_s != null) {
          this.field_s.a(true);
        }
    }

    static {
        field_t = new String[255];
    }
}
