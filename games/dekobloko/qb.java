/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb extends dd {
    static im field_r;
    static String field_t;
    private qk field_v;
    static ln field_s;
    static ck field_q;
    static int field_u;
    static w field_p;

    final void d(byte param0) {
        if (param0 < 107) {
          this.d((byte) 12);
        }
        if (null != this.field_v) {
          this.field_v.a(0);
        }
    }

    final void a(Object param0, byte param1, boolean param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          int var4_int = 0;
          RuntimeException var4_ref = null;
          pj var5 = null;
          IOException var5_ref = null;
          Exception var6 = null;
          int var7 = 0;
          pj var5Lifetime1;
          var7 = client.field_A ? 1 : 0;
          try {
            if (null != this.field_v) {
              try {
                this.field_v.a(0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_v = null;
            }
            this.field_v = (qk) (param0);
            this.e((byte) -15);
            this.a((byte) -124, param2);
            var4_int = -84 % ((param1 + 75) / 50);
            this.field_h = null;
            this.field_c.field_n = 0;
            while (true) {
              var5 = (pj) (this.field_g.a((byte) -111));
              if (var5 != null) {
                this.field_d.a(var5, -7267);
                continue;
              }
              break;
            }
            while (true) {
              var5Lifetime1 = (pj) (this.field_l.a((byte) -71));
              if (var5Lifetime1 != null) {
                this.field_n.a(var5Lifetime1, -7267);
                continue;
              }
              break;
            }
            if (0 != this.field_f) {
              try {
                this.field_i.field_n = 0;
                this.field_i.a(true, 4);
                this.field_i.a(true, (int) this.field_f);
                this.field_i.a(0, false);
                this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var5_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_v.a(0);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_j = this.field_j + 1;
                this.field_o = -2;
                this.field_v = null;
              }
            }
            this.field_b = 0;
            this.field_e = ik.a(4);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref;
            stackIn_26_1 = new StringBuilder().append("qb.K(");
            if (param0 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
          IOException iOException = null;
          wl stackIn_4_0 = null;
          boolean stackIn_4_1 = false;
          int stackIn_5_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_v) {
            return;
          }
          try {
            this.field_i.field_n = 0;
            stackIn_4_0 = this.field_i;
            stackIn_4_1 = true;
            if (!param1) {
              stackIn_5_2 = 3;
            } else {
              stackIn_5_2 = 2;
            }
            ((wl) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_5_2);
            if (param0 >= -108) {
              return;
            }
            this.field_i.a(-93, 0L);
            this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_v.a(0);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_j = this.field_j + 1;
            this.field_o = -2;
            this.field_v = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, int param1, jg param2, int param3, int param4, jg param5, String param6) {
        int var13 = 0;
        int stackIn_4_0 = 0;
        wl stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        wl stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String stackIn_19_2 = null;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        String var10_ref_String = null;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var14 = 0;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        String var12_ref_StringLifetime1;
        String var12_ref_StringLifetime2;
        String var12_ref_StringLifetime3;
        String var12_ref_StringLifetime4;
        int var11Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        var16 = null;
        var14 = client.field_A ? 1 : 0;
        try {
          var15 = param2.a((byte) 56);
          var12_ref_String = var15;
          var12_ref_StringLifetime1 = var15;
          var8 = -65 / ((-58 - param3) / 43);
          var9 = param5.a((byte) 56);
          var12_ref_StringLifetime2 = var9;
          var12_ref_StringLifetime3 = var9;
          if (null == qc.field_s &&
            !mb.a(false, -75)) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (ph.field_xb == ba.field_f) {
            wb.field_Ub = null;
            we.field_b.field_n = 0;
            if (param6 == null) {
              vi.field_A.field_n = 0;
              vi.field_A.a(gg.field_A.nextInt(), false);
              vi.field_A.a(gg.field_A.nextInt(), false);
              stackIn_15_0 = vi.field_A;
              stackIn_15_1 = 8;
              if (!param2.a(true)) {
                stackIn_16_2 = "";
              } else {
                stackIn_16_2 = var15;
              }
              ((wl) (Object) stackIn_15_0).b(stackIn_15_1, stackIn_16_2);
              stackIn_18_0 = vi.field_A;
              stackIn_18_1 = 8;
              if (param5.a(true)) {
                stackIn_19_2 = var9;
              } else {
                stackIn_19_2 = "";
              }
              ((wl) (Object) stackIn_18_0).b(stackIn_18_1, stackIn_19_2);
              we.field_b.a(true, 16);
              we.field_b.field_n = we.field_b.field_n + 1;
              var10 = we.field_b.field_n;
              re.a(uk.field_p, ea.field_k, we.field_b, vi.field_A, 0);
              we.field_b.b(-var10 + we.field_b.field_n, true);
            } else {
              var10 = 0;
              if (param0) {
                var10 = var10 | 1;
              }
              vi.field_A.field_n = 0;
              vi.field_A.a(gg.field_A.nextInt(), false);
              vi.field_A.a(gg.field_A.nextInt(), false);
              vi.field_A.b(8, var15);
              vi.field_A.b(8, var9);
              var17 = (CharSequence) ((Object) param6);
              vi.field_A.b(8, bc.a(var17, 65));
              vi.field_A.d(-1, param4);
              vi.field_A.a(true, param1);
              vi.field_A.a(true, var10);
              we.field_b.a(true, 18);
              we.field_b.field_n = we.field_b.field_n + 2;
              var11 = we.field_b.field_n;
              var12_ref_StringLifetime4 = a.a(se.h(25144), (byte) 121);
              if (var12_ref_StringLifetime4 == null) {
                var12_ref_StringLifetime4 = "";
              }
              we.field_b.a(0, var12_ref_StringLifetime4);
              re.a(uk.field_p, ea.field_k, we.field_b, vi.field_A, 0);
              we.field_b.b(true, -var11 + we.field_b.field_n);
            }
            wj.c(4792, -1);
            ph.field_xb = kb.field_c;
          }
          if (kb.field_c == ph.field_xb &&
            pe.b(25973, 1)) {
            var10Lifetime1 = de.field_V.d((byte) -70);
            de.field_V.field_n = 0;
            if (var10Lifetime1 >= 100 &&
              var10Lifetime1 <= 105) {
              ph.field_xb = ll.field_a;
              ph.field_Eb = new String[-100 + var10Lifetime1];
            } else {
              if (var10Lifetime1 == 248) {
                jg.a(se.h(25144), 0);
                rk.field_Y = tj.field_ic;
                si.a(89);
                jd.field_Qb = false;
                stackIn_31_0 = var10Lifetime1;
                return stackIn_31_0;
              }
              if (99 == var10Lifetime1) {
                pe.b(25973, vi.d(1));
                wb.field_Ub = new Boolean(f.a(de.field_V, 19));
                de.field_V.field_n = 0;
              } else {
                sm.field_e = -1;
                bh.field_k = var10Lifetime1;
                ph.field_xb = rb.field_f;
              }
            }
          }
          if (ph.field_xb == ll.field_a) {
            var10Lifetime2 = 2;
            if (pe.b(25973, var10Lifetime2)) {
              var11Lifetime1 = de.field_V.e(3);
              de.field_V.field_n = 0;
              if (pe.b(25973, var11Lifetime1)) {
                var12 = ph.field_Eb.length;
                for (var13 = 0; var12 > var13; var13++) {
                  ph.field_Eb[var13] = de.field_V.b(true);
                }
                si.a(60);
                jd.field_Qb = false;
                stackIn_42_0 = var12 + 100;
                return stackIn_42_0;
              }
            }
          }
          if (rb.field_f == ph.field_xb &&
            fh.a((byte) 117)) {
            if (255 == bh.field_k) {
              var10_ref_String = de.field_V.c(-16829);
              if (var10_ref_String != null) {
                a.a(var10_ref_String, false, se.h(25144));
              }
            } else {
              rk.field_Y = de.field_V.c((byte) -38);
            }
            si.a(105);
            jd.field_Qb = false;
            stackIn_50_0 = bh.field_k;
            return stackIn_50_0;
          }
          if (null == qc.field_s) {
            if (jd.field_Qb) {
              if (30000L < sl.a(-1)) {
                rk.field_Y = kh.field_f;
              } else {
                rk.field_Y = re.field_u;
              }
              jd.field_Qb = false;
              stackIn_58_0 = 249;
              return stackIn_58_0;
            }
            var10Lifetime3 = hc.field_a;
            hc.field_a = ef.field_P;
            jd.field_Qb = true;
            ef.field_P = var10Lifetime3;
          }
          stackIn_61_0 = -1;
          return stackIn_61_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_64_0 = var7;
          stackIn_64_1 = new StringBuilder().append("qb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param6 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_48_0 = 0;
          int stackIn_64_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          pj var2 = null;
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
          pj var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          pj var2Lifetime1;
          var16 = client.field_A ? 1 : 0;
          if (null != this.field_v) {
            var2_long = ik.a(param0 ^ -52);
            var4 = (int)(-this.field_e + var2_long);
            if (200 < var4) {
              var4 = 200;
            }
            this.field_e = var2_long;
            this.field_b = this.field_b + var4;
            if (this.field_b > 30000) {
              try {
                this.field_v.a(0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_v = null;
            }
          }
          if (null == this.field_v) {
            if (this.c((byte) -114) == 0 &&
              this.c(param0 ^ -56) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_v.b((byte) -124);
            var2 = (pj) (this.field_d.b(-2198));
            while (var2 != null) {
              this.field_i.field_n = 0;
              this.field_i.a(true, 1);
              this.field_i.a(-71, var2.field_r);
              this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
              this.field_g.a(var2, -7267);
              var2 = (pj) (this.field_d.b((byte) 20));
            }
            if (param0 != -56) {
              return false;
            }
            var2Lifetime1 = (pj) (this.field_n.b(-2198));
            while (var2Lifetime1 != null) {
              this.field_i.field_n = 0;
              this.field_i.a(true, 0);
              this.field_i.a(-98, var2Lifetime1.field_r);
              this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
              this.field_l.a(var2Lifetime1, -7267);
              var2Lifetime1 = (pj) (this.field_n.b((byte) 20));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_v.b(0);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int == 0) {
                return true;
              }
              this.field_b = 0;
              var4 = 0;
              if (null != this.field_h) {
                if (0 == this.field_h.field_K) {
                  var4 = 1;
                }
              } else {
                var4 = 10;
              }
              if (var4 <= 0) {
                var5 = -this.field_h.field_M + this.field_h.field_J.field_r.length;
                var6 = -this.field_h.field_K + 512;
                if (var6 > var5 - this.field_h.field_J.field_n) {
                  var6 = var5 - this.field_h.field_J.field_n;
                }
                if (var6 > var3_int) {
                  var6 = var3_int;
                }
                this.field_v.a(var6, this.field_h.field_J.field_n, (byte) 17, this.field_h.field_J.field_r);
                if (0 != this.field_f) {
                  for (var7 = 0; var7 < var6; var7++) {
                    this.field_h.field_J.field_r[var7 + this.field_h.field_J.field_n] = (byte)qm.b((int) this.field_h.field_J.field_r[var7 + this.field_h.field_J.field_n], (int) this.field_f);
                  }
                }
                this.field_h.field_K = this.field_h.field_K + var6;
                this.field_h.field_J.field_n = this.field_h.field_J.field_n + var6;
                if (this.field_h.field_J.field_n != var5) {
                  if (512 == this.field_h.field_K) {
                    this.field_h.field_K = 0;
                  }
                } else {
                  this.field_h.e((byte) 116);
                  this.field_h.field_z = false;
                  this.field_h = null;
                }
              } else {
                var5 = -this.field_c.field_n + var4;
                if (var5 > var3_int) {
                  var5 = var3_int;
                }
                this.field_v.a(var5, this.field_c.field_n, (byte) 17, this.field_c.field_r);
                if (this.field_f != 0) {
                  for (var6 = 0; var5 > var6; var6++) {
                    this.field_c.field_r[this.field_c.field_n + var6] = (byte)qm.b((int) this.field_c.field_r[this.field_c.field_n + var6], (int) this.field_f);
                  }
                }
                this.field_c.field_n = this.field_c.field_n + var5;
                if (this.field_c.field_n >= var4) {
                  if (this.field_h == null) {
                    this.field_c.field_n = 0;
                    var6 = this.field_c.d((byte) -48);
                    var7 = this.field_c.i(7553);
                    var8 = this.field_c.d((byte) -99);
                    var9 = this.field_c.i(7553);
                    var10 = 127 & var8;
                    stackIn_48_0 = (0 == (128 & var8)) ? 0 : 1;
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameCompleted0 = true;
                    var11 = stackIn_48_0;
                    var12 = (long)var7 + ((long)var6 << 32);
                    var14 = null;
                    if (var11 == 0) {
                      var14_ref = (pj) (this.field_g.b(-2198));
                      while (var14_ref != null) {
                        if (~var14_ref.field_r == ~var12) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var14_ref = (pj) (this.field_g.b((byte) 20));
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted0)) {
                      var14_ref = (pj) (this.field_l.b(param0 - 2142));
                      while (var14_ref != null) {
                        if (var14_ref.field_r == var12) {
                          break;
                        }
                        var14_ref = (pj) (this.field_l.b((byte) 20));
                      }
                    }
                    if (var14_ref == null) {
                      throw new IOException();
                    }
                    stackIn_64_0 = (var10 == 0) ? 5 : 9;
                    var15 = stackIn_64_0;
                    this.field_h = var14_ref;
                    this.field_h.field_J = new wl(var9 + var15 + this.field_h.field_M);
                    this.field_h.field_J.a(true, var10);
                    this.field_h.field_J.a(var9, false);
                    this.field_h.field_K = 10;
                    this.field_c.field_n = 0;
                  } else {
                    if (0 != this.field_h.field_K) {
                      throw new IOException();
                    }
                    if (-1 != this.field_c.field_r[0]) {
                      this.field_h = null;
                    } else {
                      this.field_h.field_K = 1;
                      this.field_c.field_n = 0;
                    }
                  }
                }
              }
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_v.a(0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_j = this.field_j + 1;
            this.field_o = -2;
            this.field_v = null;
            if (this.c((byte) -115) == 0 &&
              this.c(0) == 0) {
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

    final void a(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          this.field_v.a(0);
          if (param0 != 8192) {
            this.a((byte) -2);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        this.field_o = -1;
        this.field_j = this.field_j + 1;
        this.field_v = null;
        this.field_f = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    public static void d(int param0) {
        field_s = null;
        field_q = null;
        field_p = null;
        int var1 = -57 % ((60 - param0) / 50);
        field_t = null;
        field_r = null;
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            stackIn_2_0 = 14;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = aj.field_d.a(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = wf.field_q.a(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, kn param2) {
        try {
          pb.field_c.a(param2, 2777);
          if (param1 != 85) {
            field_t = (String) null;
          }
          fm.a((byte) -113, param0, param2);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "qb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
          fd stackIn_11_0;
          java.net.URL stackIn_11_1;
          java.net.URL stackIn_11_2;
          java.net.URL stackIn_11_3;
          StringBuilder stackIn_11_4;
          java.net.URL stackIn_12_1;
          java.net.URL stackIn_12_2;
          String stackIn_12_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          mh var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          var6 = client.field_A ? 1 : 0;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = j.a(param0, (byte) 37);
            }
            if (param2 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            im.a(18239, var3);
            var3 = bh.a(0, var3, "%3a", ":");
            var3 = bh.a(param1 - 16408, var3, "%40", "@");
            var3 = bh.a(param1 ^ param1, var3, "%26", "&");
            var7 = bh.a(0, var3, "%23", "#");
            if (null == th.field_b) {
              return;
            }
            stackIn_11_0 = o.field_f;
            stackIn_11_1 = null;
            stackIn_11_2 = null;
            stackIn_11_3 = th.field_b.getCodeBase();
            stackIn_11_4 = new StringBuilder().append("clienterror.ws?c=").append(wb.field_Rb).append("&u=");
            if (eh.field_d != null) {
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_5 = eh.field_d;
            } else {
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_5 = "" + ua.field_B;
            }
            var4 = ((fd) (Object) stackIn_11_0).a(new java.net.URL(stackIn_11_3, ((StringBuilder) (Object) stackIn_11_4).append(stackIn_12_5).append("&v1=").append(fd.field_k).append("&v2=").append(fd.field_c).append("&e=").append(var7).toString()), (byte) 42);
            while (var4.field_c == 0) {
              ua.a(1L, -128);
            }
            if (1 == var4.field_c) {
              var5 = (DataInputStream) (var4.field_b);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
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
          if (param0 != -15) {
            return;
          }
          if (this.field_v == null) {
            return;
          }
          try {
            this.field_i.field_n = 0;
            this.field_i.a(true, 6);
            this.field_i.b((byte) 46, 3);
            this.field_i.d(-1, 0);
            this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_v.a(param0 + 15);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_v = null;
            this.field_j = this.field_j + 1;
            this.field_o = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public qb() {
    }

    static {
        field_u = 22;
        field_s = new ln();
    }
}
