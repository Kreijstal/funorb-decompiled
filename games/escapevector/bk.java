/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk extends sb {
    static String[] field_q;
    static sf field_r;
    static int field_s;
    private pj field_t;

    final void a(Object param0, boolean param1, byte param2) {
        try {
          RuntimeException stackIn_39_0 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          s var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          s var4_refLifetime1;
          var6 = EscapeVector.field_A;
          try {
            if (null != this.field_t) {
              try {
                this.field_t.c(12497);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_t = null;
            }
            if (param2 >= -80) {
              return;
            }
            this.field_t = (pj) (param0);
            this.f(78);
            this.a(param1, false);
            this.field_c = null;
            this.field_o.field_m = 0;
            L5: while (true) {
              boolean decompiledFrameRemainder0 = true;
              var4_ref = (s) (this.field_l.b((byte) -75));
              if (var4_ref != null) {
                this.field_p.a(-1, var4_ref);
                if (var6 != 0) {
                  if (var4_ref != null) {
                    this.field_j.a(-1, var4_ref);
                    break L5;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                while (true) {
                  var4_refLifetime1 = (s) (this.field_n.b((byte) -75));
                  if (var4_refLifetime1 == null) {
                    break;
                  }
                  this.field_j.a(-1, var4_refLifetime1);
                  if (var6 != 0) {
                    break L5;
                  }
                }
              }
              if (this.field_m != 0) {
                try {
                  this.field_e.field_m = 0;
                  this.field_e.f(4, -123);
                  this.field_e.f((int) this.field_m, -123);
                  this.field_e.a((byte) 125, 0);
                  this.field_t.a(this.field_e.field_g.length, 0, this.field_e.field_g, 5000);
                  decompiledRegionSelector0 = 0;
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var4_ref2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    this.field_t.c(12497);
                  } catch (java.lang.Exception decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    var5 = (Exception) (Object) decompiledCaughtException;
                  }
                  this.field_g = this.field_g + 1;
                  this.field_d = -2;
                  this.field_t = null;
                  decompiledRegionSelector0 = 1;
                }
                if (decompiledRegionSelector0 != 0) {
                }
              }
              break;
            }
            this.field_f = 0;
            this.field_k = td.b(128);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_39_0 = var4_ref3;
            stackIn_39_1 = new StringBuilder().append("bk.F(");
            if (param0 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_q = null;
          if (param0 != -24811) {
            field_q = (String[]) null;
          }
          field_r = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "bk.Q(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
          n stackIn_5_0 = null;
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          IOException var3 = null;
          RuntimeException var3_ref = null;
          Exception var4 = null;
          try {
            if (null == this.field_t) {
              return;
            }
            try {
              this.field_e.field_m = 0;
              stackIn_5_0 = this.field_e;
              if (!param0) {
                stackIn_6_1 = 3;
              } else {
                stackIn_6_1 = 2;
              }
              ((n) (Object) stackIn_5_0).f(stackIn_6_1, -123);
              this.field_e.a(0L, 125);
              if (param1) {
                bk.g(90);
              }
              this.field_t.a(this.field_e.field_g.length, 0, this.field_e.field_g, 5000);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_t.c(12497);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_t = null;
              this.field_d = -2;
              this.field_g = this.field_g + 1;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var3_ref), "bk.N(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ij a(int param0, boolean param1, int param2, int param3, int param4) {
        ij var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ij stackIn_8_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        ij stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        ij var5Lifetime1;
        var6 = EscapeVector.field_A;
        try {
          var5 = (ij) (qd.field_n.a(false));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var5))) {
            stackIn_11_0 = ~param0;
            stackIn_11_1 = ~var5.field_n;
            if (var6 == 0) {
              if (stackIn_11_0 == stackIn_11_1) {
                stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var5 = (ij) (qd.field_n.b((byte) 70));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = param1 ? 1 : 0;
            stackIn_11_1 = 1;
          }
          if (stackIn_11_0 != stackIn_11_1) {
            field_q = (String[]) null;
          }
          var5Lifetime1 = new ij();
          var5Lifetime1.field_j = param4;
          var5Lifetime1.field_n = param0;
          var5Lifetime1.field_h = param2;
          qd.field_n.a(-12328, var5Lifetime1);
          aj.a(124, param3, var5Lifetime1);
          stackIn_15_0 = var5Lifetime1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5_ref), "bk.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(byte param0) {
        Throwable decompiledCaughtException = null;
        Exception var2 = null;
        RuntimeException var2_ref = null;
        try {
          try {
            this.field_t.c(12497);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (Exception) (Object) decompiledCaughtException;
          }
          this.field_g = this.field_g + 1;
          if (param0 >= -108) {
            bk.h(-33);
          }
          this.field_d = -1;
          this.field_t = null;
          this.field_m = (byte)(int)(1.0 + 255.0 * Math.random());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "bk.B(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 0) {
            this.a(-28);
          }
          if (this.field_t != null) {
            this.field_t.c(12497);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "bk.E(" + param0 + ')');
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = 36;
            return stackIn_2_0;
          }
          var3_int = param2 >>> 31;
          stackIn_4_0 = (param2 + var3_int) / param0 - var3_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "bk.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void g(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_12_0 = 0;
        tg stackIn_63_0 = null;
        tg stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        RuntimeException decompiledCaughtException = null;
        c var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        tg var5 = null;
        String var5_ref = null;
        String var6 = null;
        tg var6_ref = null;
        String var7 = null;
        tg var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = EscapeVector.field_A;
        try {
          var1 = om.field_g;
          var2 = var1.e(param0 ^ 0);
          if (param0 == var2) {
            if (null == ml.field_a) {
              ml.field_a = new nn(128);
              qc.field_Ab = 0;
            }
            stackIn_12_0 = (var1.e(0) != 1) ? 0 : 1;
            var3_int = stackIn_12_0;
            var4_ref_String = var1.c(false);
            if (var3_int != 0) {
              var1.c(false);
            }
            var5 = gf.a(var4_ref_String, (byte) -125);
            var6 = var1.c(false);
            var7 = sf.a(-123, (CharSequence) ((Object) var4_ref_String));
            if (null == var7) {
              var7 = var4_ref_String;
            }
            if (var5 == null) {
              var5 = gf.a(var6, (byte) 114);
              if (null != var5) {
                ml.field_a.a((long)var7.hashCode(), var5, 26);
              }
            }
            if (null == var5) {
              var5 = new tg();
              ml.field_a.a((long)var7.hashCode(), var5, 37);
              fieldTemp$0 = qc.field_Ab;
              qc.field_Ab = qc.field_Ab + 1;
              var5.field_pb = fieldTemp$0;
              jd.field_a.a(-12328, var5);
            }
            var5.field_ob = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (mi.field_g == 1) {
                mi.field_g = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (mi.field_g == 2) {
                mi.field_g = 1;
              }
              return;
            }
            if (4 != var2) {
              pf.a(false, "F1: " + hf.b((byte) -76), (Throwable) null);
              nm.a(16);
              return;
            }
            mi.field_g = 1;
            var3 = var1.c(false);
            di.field_f = ((String) (var3)).intern();
            var4 = var1.e(0);
            ii.a((byte) 16, var4);
            return;
          }
          if (bm.field_b == null) {
            bm.field_b = new nn(128);
            ua.field_a = 0;
          }
          var3Lifetime1 = var1.c(false);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.c(false);
          var5_ref = var1.c(false);
          var6_ref = fk.a(param0 ^ -1465, var4_ref_StringLifetime1);
          if (var6_ref == null) {
            var6_ref = fk.a(-1465, var5_ref);
            if (var6_ref != null) {
              bm.field_b.a((long)sf.a(-88, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6_ref, 25);
            }
          }
          if (null == var6_ref) {
            var6_ref = new tg();
            bm.field_b.a((long)sf.a(-109, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6_ref, param0 ^ 123);
            fieldTemp$1 = ua.field_a;
            ua.field_a = ua.field_a + 1;
            var6_ref.field_pb = fieldTemp$1;
            ji.field_c.a(-12328, var6_ref);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.field_ob = var4_ref_StringLifetime1;
          var6_ref.field_lb = (String) (var3Lifetime1);
          var6_ref.c((byte) -14);
          var7_ref = (tg) (ji.field_c.a(false));
          L13: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != var7_ref) {
              stackIn_63_0 = var6_ref;
              stackIn_63_1 = var7_ref;
              stackIn_63_2 = -7457;
              decompiledFrameRemainder0 = (var8 == 0);
              if ((decompiledFrameRemainder0) &&
                (EscapeVector.a(stackIn_63_0, stackIn_63_1, stackIn_63_2))) {
                var7_ref = (tg) (ji.field_c.b((byte) 70));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var7_ref == null) {
                break L13;
              }
              stackIn_63_0 = var6_ref;
              stackIn_63_1 = var7_ref;
              stackIn_63_2 = -7;
            }
            EscapeVector.$cfr$intArgs$a$aafaec74e55e((hg) (stackIn_63_0), (hg) (stackIn_63_1), stackIn_63_2);
            if (var8 == 0) {
              return;
            }
            break;
          }
          ji.field_c.a(param0 ^ -12328, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "bk.M(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          RuntimeException var2_ref = null;
          Exception var3 = null;
          try {
            if (null == this.field_t) {
              return;
            }
            try {
              this.field_e.field_m = 0;
              this.field_e.f(6, -123);
              var2_int = 45 % ((-48 - param0) / 39);
              this.field_e.b(1743120456, 3);
              this.field_e.h(82, 0);
              this.field_t.a(this.field_e.field_g.length, 0, this.field_e.field_g, 5000);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_t.c(12497);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_g = this.field_g + 1;
              this.field_d = -2;
              this.field_t = null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var2_ref), "bk.L(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean d(int param0) {
        try {
          int stackIn_95_0 = 0;
          int stackIn_122_0 = 0;
          int stackIn_126_0 = 0;
          int stackIn_143_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          s var2 = null;
          int var2_int = 0;
          IOException var2_ref = null;
          RuntimeException var2_ref2 = null;
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
          s var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var5Lifetime1;
          int var6Lifetime1;
          int var7Lifetime1;
          int var6Lifetime1Lifetime1;
          var16 = EscapeVector.field_A;
          try {
            if (null != this.field_t) {
              var2_long = td.b(param0 + 4122);
              var4 = (int)(-this.field_k + var2_long);
              this.field_k = var2_long;
              if (var4 > 200) {
                var4 = 200;
              }
              this.field_f = this.field_f + var4;
              if (30000 < this.field_f) {
                try {
                  this.field_t.c(param0 + 16491);
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                }
                this.field_t = null;
              }
            }
            if (null == this.field_t) {
              if (0 == this.a(true) &&
                this.a((byte) 88) == 0) {
                return true;
              }
              return false;
            }
            try {
              this.field_t.a((byte) 123);
              var2 = (s) (this.field_p.a(0));
              L6: while (true) {
                if (var2 != null) {
                  this.field_e.field_m = 0;
                  this.field_e.f(1, -123);
                  this.field_e.a(var2.field_p, -118);
                  this.field_t.a(this.field_e.field_g.length, 0, this.field_e.field_g, 5000);
                  this.field_l.a(param0 + 3993, var2);
                  var2 = (s) (this.field_p.a((byte) -101));
                  if (var16 != 0) {
                    break L6;
                  }
                  if (var16 == 0) {
                    continue;
                  }
                }
                var2 = (s) (this.field_j.a(param0 ^ param0));
                break;
              }
              while (var2 != null) {
                this.field_e.field_m = 0;
                this.field_e.f(0, -123);
                this.field_e.a(var2.field_p, -3);
                this.field_t.a(this.field_e.field_g.length, 0, this.field_e.field_g, 5000);
                this.field_n.a(-1, var2);
                var2 = (s) (this.field_j.a((byte) -43));
                if (var16 == 0) {
                  continue;
                }
                break;
              }
              var2_int = 0;
              L11: while (true) {
                if (var2_int < 100) {
                  var3_int = this.field_t.b(param0 + 3876);
                  stackIn_143_0 = var3_int;
                  if (var16 != 0) {
                    break L11;
                  }
                  if (stackIn_143_0 < 0) {
                    throw new IOException();
                  }
                  if (var3_int != 0) {
                    this.field_f = 0;
                    var4 = 0;
                    if (this.field_c == null) {
                      var4 = 10;
                      if (var16 != 0 &&
                        this.field_c.field_F == 0) {
                        var4 = 1;
                      }
                    } else {
                      if (this.field_c.field_F == 0) {
                        var4 = 1;
                      }
                    }
                    boolean decompiledFrameRemainder1 = true;
                    if (var4 <= 0) {
                      var5 = this.field_c.field_A.field_g.length - this.field_c.field_y;
                      var6 = -this.field_c.field_F + 512;
                      if ((-this.field_c.field_A.field_m + var5) < var6) {
                        var6 = var5 - this.field_c.field_A.field_m;
                      }
                      if (var6 > var3_int) {
                        var6 = var3_int;
                      }
                      boolean decompiledFrameCompleted4 = true;
                      this.field_t.a(this.field_c.field_A.field_m, var6, this.field_c.field_A.field_g, (byte) -49);
                      if (this.field_m != 0) {
                        var7 = 0;
                        while (var6 > var7) {
                          this.field_c.field_A.field_g[var7 + this.field_c.field_A.field_m] = (byte)n.a((int) this.field_c.field_A.field_g[var7 + this.field_c.field_A.field_m], (int) this.field_m);
                          var7++;
                          if (var16 != 0) {
                            decompiledFrameCompleted4 = false;
                            break;
                          }
                          if (var16 == 0) {
                            continue;
                          }
                          break;
                        }
                      }
                      if (decompiledFrameCompleted4) {
                        this.field_c.field_F = this.field_c.field_F + var6;
                        this.field_c.field_A.field_m = this.field_c.field_A.field_m + var6;
                      }
                      if (~var5 == ~this.field_c.field_A.field_m) {
                        this.field_c.d(-110);
                        this.field_c.field_u = false;
                        this.field_c = null;
                        decompiledFrameRemainder1 = (var16 != 0);
                      }
                      if ((decompiledFrameRemainder1) &&
                        (decompiledFrameRemainder1 = (this.field_c.field_F == 512))) {
                        this.field_c.field_F = 0;
                      }
                    }
                    if ((decompiledFrameRemainder1) &&
                      (!(var4 <= 0) ||
                      var16 != 0)) {
                      var5Lifetime1 = var4 - this.field_o.field_m;
                      if (var3_int < var5Lifetime1) {
                        var5Lifetime1 = var3_int;
                      }
                      boolean decompiledFrameCompleted3 = true;
                      this.field_t.a(this.field_o.field_m, var5Lifetime1, this.field_o.field_g, (byte) -49);
                      if (this.field_m != 0) {
                        var6Lifetime1 = 0;
                        while (var6Lifetime1 < var5Lifetime1) {
                          this.field_o.field_g[var6Lifetime1 + this.field_o.field_m] = (byte)n.a((int) this.field_o.field_g[var6Lifetime1 + this.field_o.field_m], (int) this.field_m);
                          var6Lifetime1++;
                          if (var16 != 0) {
                            decompiledFrameCompleted3 = false;
                            break;
                          }
                          if (var16 == 0) {
                            continue;
                          }
                          break;
                        }
                      }
                      if (decompiledFrameCompleted3) {
                        this.field_o.field_m = this.field_o.field_m + var5Lifetime1;
                      }
                      if (this.field_o.field_m >= var4) {
                        if (this.field_c == null) {
                          this.field_o.field_m = 0;
                          var6Lifetime1Lifetime1 = this.field_o.e(0);
                          var7Lifetime1 = this.field_o.g(-5053);
                          var8 = this.field_o.e(0);
                          var9 = this.field_o.g(-5053);
                          var10 = var8 & 127;
                          stackIn_95_0 = (0 == (128 & var8)) ? 0 : 1;
                          boolean decompiledFrameCompleted2 = true;
                          boolean decompiledFrameCompleted0 = true;
                          boolean decompiledFrameRemainder0 = true;
                          boolean decompiledFrameCompleted1 = true;
                          var11 = stackIn_95_0;
                          var12 = (long)var7Lifetime1 + ((long)var6Lifetime1Lifetime1 << 32);
                          var14 = null;
                          if (var11 != 0) {
                            var14_ref = (s) (this.field_n.a(0));
                            while (var14_ref != null) {
                              stackIn_122_0 = $cfr$lcmp(var12, var14_ref.field_p);
                              if (var16 != 0) {
                                decompiledFrameCompleted2 = false;
                                break;
                              }
                              if (stackIn_122_0 == 0 &&
                                var16 == 0) {
                                decompiledFrameCompleted1 = false;
                                break;
                              }
                              var14_ref = (s) (this.field_n.a((byte) 106));
                            }
                            if (decompiledFrameCompleted2) {
                              decompiledFrameRemainder0 = !(decompiledFrameCompleted1);
                            }
                          }
                          if ((decompiledFrameRemainder0) &&
                            (decompiledFrameCompleted2) &&
                            (decompiledFrameCompleted1)) {
                            var14_ref = (s) (this.field_l.a(0));
                            while (null != var14_ref) {
                              stackIn_122_0 = $cfr$lcmp(~var12, ~var14_ref.field_p);
                              if (var16 != 0) {
                                decompiledFrameCompleted0 = false;
                                break;
                              }
                              if (stackIn_122_0 == 0 &&
                                var16 == 0) {
                                break;
                              }
                              var14_ref = (s) (this.field_l.a((byte) -52));
                              if (var16 == 0) {
                                continue;
                              }
                              break;
                            }
                          }
                          if ((decompiledFrameCompleted2) &&
                            (decompiledFrameCompleted0)) {
                            if (null == var14_ref) {
                              throw new IOException();
                            }
                            this.field_c = var14_ref;
                            stackIn_122_0 = -1;
                          }
                          stackIn_126_0 = (stackIn_122_0 != ~var10) ? 9 : 5;
                          var15 = stackIn_126_0;
                          this.field_c.field_A = new n(var15 + (var9 + this.field_c.field_y));
                          this.field_c.field_A.f(var10, -123);
                          this.field_c.field_A.a((byte) 125, var9);
                          this.field_c.field_F = 10;
                          this.field_o.field_m = 0;
                          decompiledFrameRemainder1 = (var16 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          if (0 == this.field_c.field_F) {
                            if (this.field_o.field_g[0] != -1) {
                              this.field_c = null;
                              decompiledFrameRemainder1 = (var16 != 0);
                            }
                            if (decompiledFrameRemainder1) {
                              this.field_o.field_m = 0;
                              this.field_c.field_F = 1;
                              decompiledFrameRemainder1 = (var16 != 0);
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            throw new IOException();
                          }
                        }
                      }
                    }
                    var2_int++;
                    if (var16 == 0) {
                      continue;
                    }
                  }
                }
                stackIn_143_0 = 1;
                break;
              }
              return stackIn_143_0 != 0;
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_t.c(12497);
              } catch (java.lang.Exception decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_t = null;
              this.field_d = -2;
              this.field_g = this.field_g + 1;
              if (this.a(true) == 0 &&
                this.a((byte) 88) == 0) {
                return true;
              }
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var2_ref2), "bk.I(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static Object a(boolean param0, byte[] param1, int param2) {
        km var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        km stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 9) {
            stackIn_2_0 = (Object) null;
            return stackIn_2_0;
          }
          if (null == param1) {
            stackIn_5_0 = null;
            return stackIn_5_0;
          }
          if (param1.length > 136) {
            var3 = new km();
            ((fh) ((Object) var3)).a(true, param1);
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          if (param0) {
            stackIn_13_0 = pn.a(param2 - 9, param1);
            return stackIn_13_0;
          }
          stackIn_11_0 = (byte[]) (param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("bk.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public bk() {
    }

    static {
        field_q = new String[]{"Well done, commander. You have secured all the stolen technology stored in the aliens' outer system.<delay><br>Your mission is complete."};
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
