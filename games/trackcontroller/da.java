/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class da extends ae {
    static int field_m;
    private bc field_q;
    static qe field_n;
    static qj[][] field_p;
    static int field_o;

    final static li a(ik param0, int param1, byte param2) {
        RuntimeException var3 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -108) {
            da.a(79, (byte) -19);
          }
          stackIn_3_0 = bd.a(-31085, bh.a(param0, 100, param1));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("da.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void c(byte param0) {
        if (this.field_q != null) {
          this.field_q.d(param0 ^ 16777114);
        }
        if (param0 != 101) {
          da.a(-15, (byte) 51);
        }
    }

    final static int a(boolean param0, boolean param1, String param2, String param3, int param4, int param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_9_0 = 0;
          int stackIn_35_0 = 0;
          boolean stackIn_47_0 = false;
          boolean stackIn_50_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_85_0 = 0;
          int stackIn_90_0 = 0;
          int stackIn_97_0 = 0;
          int stackIn_100_0 = 0;
          RuntimeException stackIn_103_0 = null;
          StringBuilder stackIn_103_1 = null;
          String stackIn_104_2 = null;
          StringBuilder stackIn_106_1 = null;
          String stackIn_107_2 = null;
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
          var9 = TrackController.field_F ? 1 : 0;
          try {
            if (r.field_i == null &&
              !bf.a(param1, (byte) 104)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (param4 <= 67) {
              stackIn_9_0 = 76;
              return stackIn_9_0;
            }
            if (jc.field_a == gk.field_a) {
              if (param1) {
                var10 = (String) null;
                af.field_o = ie.a(nl.field_e, param3, false, (String) null, (byte) -119);
              } else {
                af.field_o = rl.a(20, false, param3, param2);
              }
              ra.field_C.field_k = 0;
              ra.field_C.a(14, (byte) -72);
              ra.field_C.a(af.field_o.a(false).field_b, (byte) -100);
              me.a(-1, -1);
              jc.field_a = sg.field_d;
            }
            if (jc.field_a == sg.field_d &&
              hf.a(1, false)) {
              var6_int = ne.field_a.h(16383);
              if (var6_int == 0) {
                jc.field_a = md.field_e;
              } else {
                hd.field_o = -1;
                uk.field_c = var6_int;
                jc.field_a = ij.field_j;
              }
              ne.field_a.field_k = 0;
            }
            if (jc.field_a == md.field_e &&
              hf.a(8, false)) {
              h.field_d = ne.field_a.f((byte) 110);
              ne.field_a.field_k = 0;
              md.a(af.field_o, param5, param1, -1, param0);
              jc.field_a = ca.field_b;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ca.field_b == jc.field_a &&
              hf.a(1, false)) {
              var6_intLifetime1 = ne.field_a.h(16383);
              kg.field_a = null;
              uk.field_c = var6_intLifetime1;
              ne.field_a.field_k = 0;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (8 != var6_intLifetime1) {
                  jc.field_a = ij.field_j;
                  hd.field_o = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  lj.a((byte) 124);
                  kg.field_f = false;
                  stackIn_35_0 = var6_intLifetime1;
                  return stackIn_35_0;
                }
              }
              if (decompiledFrameRemainder0) {
                hd.field_o = -1;
                jc.field_a = qe.field_C;
              }
            }
            if (jc.field_a == qe.field_C &&
              fh.a(520)) {
              nl.field_e = ne.field_a.f((byte) 28);
              sl.field_j = ne.field_a.h(16383);
              ne.field_a.h(16383);
              hk.field_d = ne.field_a.d((byte) -67);
              var6 = ne.field_a.d(19016);
              var7 = ne.field_a.h(16383);
              if ((1 & var7) != 0) {
                qi.b(8770);
              }
              if (!param1) {
                stackIn_47_0 = ((4 & var7) != 0);
                fd.field_i = stackIn_47_0;
                stackIn_50_0 = ((8 & var7) != 0);
                fi.field_o = stackIn_50_0;
                if (fi.field_o) {
                }
              }
              if (mk.field_c) {
                ne.field_a.h(16383);
                ne.field_a.h(16383);
                ne.field_a.e((byte) 113);
                jd.field_d = ne.field_a.d((byte) -118);
                qa.field_a = new byte[jd.field_d];
                for (var8 = 0; jd.field_d > var8; var8++) {
                  qa.field_a[var8] = ne.field_a.f(-127);
                }
              }
              ue.field_a = ne.field_a.g(0);
              var11 = (CharSequence) ((Object) ue.field_a);
              dd.field_p = r.a(var11, -11133);
              si.field_d = ne.field_a.h(16383);
              jc.field_a = ka.field_b;
              if (af.field_o.a(false) != nd.field_M) {
                if (af.field_o.a(false) == ji.field_a) {
                  qi.field_f.a(gd.b((byte) 77), -4);
                }
              } else {
                rd.field_o.a(gd.b((byte) 77), -4);
              }
              kg.field_f = false;
              if (var6 != null) {
                dh.a(-19136, var6, gd.b((byte) 77));
              }
              if (hk.field_d <= 0 &&
                !fd.field_i) {
                try {
                  sj.a((byte) -128, "unzap", gd.b((byte) 77));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  sj.a(gd.b((byte) 77), new Object[]{ue.a(nl.field_e, (byte) 114)}, 7648, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (hk.field_d > 0) {
                oc.field_i = true;
              }
              ra.field_C.a((byte) -83, pl.field_a);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                pl.field_a[var8Lifetime1] = pl.field_a[var8Lifetime1] + 50;
              }
              ne.field_a.a((byte) -83, pl.field_a);
              stackIn_79_0 = uk.field_c;
              return stackIn_79_0;
            }
            if (jc.field_a == ij.field_j &&
              fh.a(520)) {
              lj.a((byte) 124);
              if (uk.field_c == 7 &&
                !kg.field_f) {
                kg.field_f = true;
                stackIn_85_0 = -1;
                return stackIn_85_0;
              }
              if (uk.field_c == 7) {
                uk.field_c = 3;
              }
              fi.field_t = ne.field_a.g(0);
              kg.field_f = false;
              stackIn_90_0 = uk.field_c;
              return stackIn_90_0;
            }
            if (r.field_i == null) {
              if (kg.field_f) {
                if (bj.b(-21676) <= 30000L) {
                  fi.field_t = cf.field_m;
                } else {
                  fi.field_t = nk.field_j;
                }
                kg.field_f = false;
                stackIn_97_0 = 3;
                return stackIn_97_0;
              }
              var6_intLifetime2 = ke.field_c;
              ke.field_c = ma.field_c;
              ma.field_c = var6_intLifetime2;
              kg.field_f = true;
            }
            stackIn_100_0 = -1;
            return stackIn_100_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_103_0 = var6_ref;
            stackIn_103_1 = new StringBuilder().append("da.P(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_104_2 = "null";
            } else {
              stackIn_104_2 = "{...}";
            }
            stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
            if (param3 == null) {
              stackIn_107_2 = "null";
            } else {
              stackIn_107_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        try {
          this.field_q.d(16777215);
        } catch (Exception exception) {
        }
        this.field_q = null;
        if (param0 <= 95) {
          field_m = 57;
        }
        this.field_b = -1;
        this.field_e = this.field_e + 1;
        this.field_i = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public static void e(int param0) {
        field_n = null;
        field_p = (qj[][]) null;
        if (param0 < 63) {
          field_p = (qj[][]) null;
        }
    }

    private final void a(boolean param0, int param1) {
        try {
          IOException iOException = null;
          be stackIn_4_0 = null;
          int stackIn_5_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_q) {
            return;
          }
          try {
            this.field_g.field_k = 0;
            stackIn_4_0 = this.field_g;
            if (!param0) {
              stackIn_5_1 = 3;
            } else {
              stackIn_5_1 = 2;
            }
            ((be) (Object) stackIn_4_0).a(stackIn_5_1, (byte) -127);
            this.field_g.a(2488, 0L);
            this.field_q.a(-103, this.field_g.field_j, this.field_g.field_j.length, param1);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.d(16777215);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_b = -2;
            this.field_e = this.field_e + 1;
            this.field_q = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1) {
        li var2 = null;
        int var3 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        li var2Lifetime1;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          qd.field_d = param0;
          var2 = (li) (kd.field_a.b(2));
          if (param1 != -74) {
            field_p = (qj[][]) null;
          }
          while (var2 != null) {
            if (var2.field_k.b(10000536)) {
              var2.field_j.g(128 + var2.field_m * qd.field_d >> 8);
            } else {
              var2.a(-76);
            }
            var2 = (li) (kd.field_a.a(param1 ^ -68));
          }
          if (jk.field_c != null) {
            var2Lifetime1 = (li) (jk.field_c.b(2));
            while (var2Lifetime1 != null) {
              stackIn_13_0 = var2Lifetime1.field_k.b(param1 ^ -10000594);
              if (!stackIn_13_0) {
                var2Lifetime1.a(-33);
              } else {
                var2Lifetime1.field_j.g(128 + qd.field_d * var2Lifetime1.field_m >> 8);
              }
              var2Lifetime1 = (li) (jk.field_c.a(10));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2_ref), "da.L(" + param0 + ',' + param1 + ')');
        }
    }

    public da() {
    }

    private final void d(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          Exception var3 = null;
          if (this.field_q == null) {
            return;
          }
          try {
            this.field_g.field_k = 0;
            this.field_g.a(6, (byte) -59);
            this.field_g.c((byte) -38, 3);
            this.field_g.b(0, (byte) -118);
            this.field_q.a(-102, this.field_g.field_j, this.field_g.field_j.length, 0);
            if (param0 >= -5) {
              field_p = (qj[][]) null;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.d(16777215);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_e = this.field_e + 1;
            this.field_b = -2;
            this.field_q = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, boolean param1, Object param2) {
        try {
          RuntimeException stackIn_28_0 = null;
          StringBuilder stackIn_28_1 = null;
          String stackIn_29_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          hi var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          hi var4_refLifetime1;
          var6 = TrackController.field_F ? 1 : 0;
          try {
            if (null != this.field_q) {
              try {
                this.field_q.d(16777215);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
            this.field_q = (bc) (param2);
            this.d((byte) -42);
            this.a(param1, 0);
            this.field_l = null;
            this.field_a.field_k = 0;
            while (true) {
              var4_ref = (hi) (this.field_c.a(-58));
              if (var4_ref != null) {
                this.field_f.a(var4_ref, true);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (hi) (this.field_k.a(-58));
              if (var4_refLifetime1 != null) {
                this.field_h.a(var4_refLifetime1, true);
                continue;
              }
              break;
            }
            if (param0 != 121) {
              this.c((byte) 104);
            }
            if (this.field_i != 0) {
              try {
                this.field_g.field_k = 0;
                this.field_g.a(4, (byte) -112);
                this.field_g.a((int) this.field_i, (byte) -99);
                this.field_g.b(false, 0);
                this.field_q.a(-126, this.field_g.field_j, this.field_g.field_j.length, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_q.d(16777215);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_b = -2;
                this.field_q = null;
                this.field_e = this.field_e + 1;
              }
            }
            this.field_d = 0;
            this.field_j = qg.a(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_28_0 = var4_ref3;
            stackIn_28_1 = new StringBuilder().append("da.F(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_29_2 = "null";
            } else {
              stackIn_29_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(int param0) {
        try {
          int var2_int = 0;
          int stackIn_62_0 = 0;
          int stackIn_78_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          hi var2 = null;
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
          hi var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          hi var2Lifetime1;
          var16 = TrackController.field_F ? 1 : 0;
          if (null != this.field_q) {
            var2_long = qg.a(false);
            var4 = (int)(-this.field_j + var2_long);
            if (200 < var4) {
              var4 = 200;
            }
            this.field_j = var2_long;
            this.field_d = this.field_d + var4;
            if (30000 < this.field_d) {
              try {
                this.field_q.d(param0 + 16748049);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
          }
          if (null == this.field_q) {
            if (0 != this.a((byte) 105)) {
              return false;
            }
            if (0 == this.a(param0 ^ 29161)) {
              return true;
            }
            return false;
          }
          if (param0 != 29166) {
            return true;
          }
          try {
            this.field_q.a(true);
            var2 = (hi) (this.field_f.b(48));
            while (var2 != null) {
              this.field_g.field_k = 0;
              this.field_g.a(1, (byte) -96);
              this.field_g.a(2488, var2.field_m);
              this.field_q.a(-124, this.field_g.field_j, this.field_g.field_j.length, 0);
              this.field_c.a(var2, true);
              var2 = (hi) (this.field_f.a((byte) 108));
            }
            var2Lifetime1 = (hi) (this.field_h.b(48));
            while (var2Lifetime1 != null) {
              this.field_g.field_k = 0;
              this.field_g.a(0, (byte) -74);
              this.field_g.a(2488, var2Lifetime1.field_m);
              this.field_q.a(-106, this.field_g.field_j, this.field_g.field_j.length, 0);
              this.field_k.a(var2Lifetime1, true);
              var2Lifetime1 = (hi) (this.field_h.a((byte) 113));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_q.b(0);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (0 != var3_int) {
                this.field_d = 0;
                var4 = 0;
                if (null == this.field_l) {
                  var4 = 10;
                } else {
                  if (this.field_l.field_z == 0) {
                    var4 = 1;
                  }
                }
                if (var4 > 0) {
                  var5 = var4 - this.field_a.field_k;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_q.a(this.field_a.field_j, 0, var5, this.field_a.field_k);
                  if (this.field_i != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_a.field_j[this.field_a.field_k + var6] = (byte)ma.a((int) this.field_a.field_j[this.field_a.field_k + var6], (int) this.field_i);
                    }
                  }
                  this.field_a.field_k = this.field_a.field_k + var5;
                  if (this.field_a.field_k >= var4) {
                    if (null != this.field_l) {
                      if (0 != this.field_l.field_z) {
                        throw new IOException();
                      }
                      if (this.field_a.field_j[0] == -1) {
                        this.field_l.field_z = 1;
                        this.field_a.field_k = 0;
                      } else {
                        this.field_l = null;
                      }
                    } else {
                      this.field_a.field_k = 0;
                      var6 = this.field_a.h(16383);
                      var7 = this.field_a.e((byte) 113);
                      var8 = this.field_a.h(16383);
                      var9 = this.field_a.e((byte) 113);
                      var10 = var8 & 127;
                      stackIn_62_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_62_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (hi) (this.field_c.b(48));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_m) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (hi) (this.field_c.a((byte) 118));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (hi) (this.field_k.b(48));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_m) {
                            break;
                          }
                          var14_ref = (hi) (this.field_k.a((byte) 109));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_78_0 = (0 == var10) ? 5 : 9;
                      var15 = stackIn_78_0;
                      this.field_l = var14_ref;
                      this.field_l.field_x = new be(var9 - (-var15 - this.field_l.field_B));
                      this.field_l.field_x.a(var10, (byte) -120);
                      this.field_l.field_x.b(false, var9);
                      this.field_l.field_z = 10;
                      this.field_a.field_k = 0;
                    }
                  }
                } else {
                  var5 = -this.field_l.field_B + this.field_l.field_x.field_j.length;
                  var6 = -this.field_l.field_z + 512;
                  if (var6 > -this.field_l.field_x.field_k + var5) {
                    var6 = var5 - this.field_l.field_x.field_k;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_q.a(this.field_l.field_x.field_j, 0, var6, this.field_l.field_x.field_k);
                  if (this.field_i != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_l.field_x.field_j[this.field_l.field_x.field_k + var7] = (byte)ma.a((int) this.field_l.field_x.field_j[this.field_l.field_x.field_k + var7], (int) this.field_i);
                    }
                  }
                  this.field_l.field_x.field_k = this.field_l.field_x.field_k + var6;
                  this.field_l.field_z = this.field_l.field_z + var6;
                  if (var5 != this.field_l.field_x.field_k) {
                    if (this.field_l.field_z == 512) {
                      this.field_l.field_z = 0;
                    }
                  } else {
                    this.field_l.e(param0 - 29166);
                    this.field_l.field_w = false;
                    this.field_l = null;
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
              this.field_q.d(16777215);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_q = null;
            this.field_b = -2;
            this.field_e = this.field_e + 1;
            if (this.a((byte) 105) == 0 &&
              0 == this.a(7)) {
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

    static {
        field_m = 20;
    }
}
