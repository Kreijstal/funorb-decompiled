/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qc extends ar {
    static String field_s;
    static qf field_w;
    static String field_t;
    private ke field_v;
    static String field_u;

    final static void a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          c.c();
          c.a(param2, 0, param2.length);
          if (param1 != 18117) {
            return;
          }
          c.d();
          while (c.a()) {
            gf.f(c.field_e, c.field_h, -c.field_e + c.field_a, param0, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("qc.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean d(int param0) {
        try {
          int var2_int = 0;
          int stackIn_44_0 = 0;
          int stackIn_60_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          tk var2 = null;
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
          tk var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var17 = 0;
          tk var2Lifetime1;
          var16 = ShatteredPlansClient.field_F ? 1 : 0;
          if (this.field_v != null) {
            var2_long = pr.a(14274);
            var4 = (int)(-this.field_k + var2_long);
            this.field_k = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_n = this.field_n + var4;
            if (this.field_n > 30000) {
              try {
                this.field_v.b(100);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_v = null;
            }
          }
          if (null == this.field_v) {
            if (this.a((byte) 0) == 0 &&
              0 == this.b(-5205)) {
              return true;
            }
            return false;
          }
          try {
            this.field_v.a(false);
            var2 = (tk) (this.field_h.c(-128));
            while (var2 != null) {
              this.field_c.field_j = 0;
              this.field_c.c(1, (byte) -85);
              this.field_c.a(param0 + 1729379144, var2.field_l);
              this.field_v.a(this.field_c.field_h.length, 0, this.field_c.field_h, -13976);
              this.field_j.a(var2, 32);
              var2 = (tk) (this.field_h.b(32));
            }
            var2Lifetime1 = (tk) (this.field_m.c(-128));
            while (var2Lifetime1 != null) {
              this.field_c.field_j = 0;
              this.field_c.c(0, (byte) -109);
              this.field_c.a(param0 ^ 1729379144, var2Lifetime1.field_l);
              this.field_v.a(this.field_c.field_h.length, 0, this.field_c.field_h, param0 - 13976);
              this.field_f.a(var2Lifetime1, 32);
              var2Lifetime1 = (tk) (this.field_m.b(32));
            }
            for (var2_int = param0; var2_int < 100; var2_int++) {
              var3_int = this.field_v.a(-1);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_n = 0;
                var4 = 0;
                if (null != this.field_l) {
                  if (this.field_l.field_A == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 <= 0) {
                  var5 = -this.field_l.field_w + this.field_l.field_D.field_h.length;
                  var6 = -this.field_l.field_A + 512;
                  if (var6 > var5 - this.field_l.field_D.field_j) {
                    var6 = var5 - this.field_l.field_D.field_j;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_v.a(this.field_l.field_D.field_h, var6, this.field_l.field_D.field_j, (byte) 112);
                  if (this.field_d != 0) {
                    var17 = 0;
                    var7 = var17;
                    while (var6 > var17) {
                      this.field_l.field_D.field_h[this.field_l.field_D.field_j + var17] = (byte)nc.a((int) this.field_l.field_D.field_h[this.field_l.field_D.field_j + var17], (int) this.field_d);
                      var17++;
                    }
                  }
                  this.field_l.field_A = this.field_l.field_A + var6;
                  this.field_l.field_D.field_j = this.field_l.field_D.field_j + var6;
                  if (var5 != this.field_l.field_D.field_j) {
                    if (this.field_l.field_A == 512) {
                      this.field_l.field_A = 0;
                    }
                  } else {
                    this.field_l.a(16);
                    this.field_l.field_u = false;
                    this.field_l = null;
                  }
                } else {
                  var5 = var4 - this.field_q.field_j;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_v.a(this.field_q.field_h, var5, this.field_q.field_j, (byte) -52);
                  if (0 != this.field_d) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_q.field_h[this.field_q.field_j + var6] = (byte)nc.a((int) this.field_q.field_h[this.field_q.field_j + var6], (int) this.field_d);
                    }
                  }
                  this.field_q.field_j = this.field_q.field_j + var5;
                  if (this.field_q.field_j >= var4) {
                    if (null != this.field_l) {
                      if (this.field_l.field_A != 0) {
                        throw new IOException();
                      }
                      if (-1 != this.field_q.field_h[0]) {
                        this.field_l = null;
                      } else {
                        this.field_q.field_j = 0;
                        this.field_l.field_A = 1;
                      }
                    } else {
                      this.field_q.field_j = 0;
                      var6 = this.field_q.j(-128);
                      var7 = this.field_q.a(16711680);
                      var8 = this.field_q.j(-65);
                      var9 = this.field_q.a(16711680);
                      var10 = var8 & 127;
                      stackIn_44_0 = (0 == (var8 & 128)) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_44_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (tk) (this.field_j.c(-127));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_l) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (tk) (this.field_j.b(32));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (tk) (this.field_f.c(param0 ^ -127));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_l) {
                            break;
                          }
                          var14_ref = (tk) (this.field_f.b(32));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_60_0 = (var10 == 0) ? 5 : 9;
                      var15 = stackIn_60_0;
                      this.field_l = var14_ref;
                      this.field_l.field_D = new ob(this.field_l.field_w + var9 + var15);
                      this.field_l.field_D.c(var10, (byte) -106);
                      this.field_l.field_D.e(11135, var9);
                      this.field_q.field_j = 0;
                      this.field_l.field_A = 10;
                    }
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
              this.field_v.b(117);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_v = null;
            this.field_a = this.field_a + 1;
            this.field_p = -2;
            if (this.a((byte) 0) == 0 &&
              0 == this.b(-5205)) {
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ua.field_f.a(param4, param0, (byte) 46, param1, param5);
        if (mr.field_h != null) {
          mr.field_h.a(-1, param2, param0, -jj.field_m + param2, param6, param0);
        }
        if (param3 != 3) {
          field_t = (String) null;
        }
    }

    final void a(byte param0, boolean param1, Object param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          tk var4_ref = null;
          IOException var4_ref2 = null;
          int var4_int = 0;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          tk var4_refLifetime1;
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            if (this.field_v != null) {
              try {
                this.field_v.b(116);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_v = null;
            }
            this.field_v = (ke) (param2);
            this.g(-20189);
            this.a(param1, 3);
            this.field_l = null;
            this.field_q.field_j = 0;
            while (true) {
              var4_ref = (tk) (this.field_j.a(-44));
              if (var4_ref != null) {
                this.field_h.a(var4_ref, 32);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (tk) (this.field_f.a(110));
              if (var4_refLifetime1 != null) {
                this.field_m.a(var4_refLifetime1, 32);
                continue;
              }
              break;
            }
            if (0 != this.field_d) {
              try {
                this.field_c.field_j = 0;
                this.field_c.c(4, (byte) -86);
                this.field_c.c((int) this.field_d, (byte) -88);
                this.field_c.e(11135, 0);
                this.field_v.a(this.field_c.field_h.length, 0, this.field_c.field_h, -13976);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_v.b(127);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_v = null;
                this.field_p = -2;
                this.field_a = this.field_a + 1;
              }
            }
            this.field_n = 0;
            this.field_k = pr.a(14274);
            var4_int = 50 % ((-11 - param0) / 48);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("qc.F(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        try {
          this.field_v.b(param0 + 209);
        } catch (Exception exception) {
        }
        if (param0 != -91) {
          return;
        }
        this.field_v = null;
        this.field_p = -1;
        this.field_a = this.field_a + 1;
        this.field_d = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final void e(int param0) {
        if (param0 != -16363) {
          field_s = (String) null;
        }
        if (null != this.field_v) {
          this.field_v.b(126);
        }
    }

    public static void f(int param0) {
        int var1 = 67 % ((35 - param0) / 48);
        field_t = null;
        field_u = null;
        field_s = null;
        field_w = null;
    }

    private final void a(boolean param0, int param1) {
        try {
          IOException iOException = null;
          ob stackIn_5_0 = null;
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_v) {
            return;
          }
          try {
            this.field_c.field_j = 0;
            stackIn_5_0 = this.field_c;
            if (param0) {
              stackIn_6_1 = 2;
            } else {
              stackIn_6_1 = 3;
            }
            ((ob) (Object) stackIn_5_0).c(stackIn_6_1, (byte) -97);
            if (param1 != 3) {
              qc.f(88);
            }
            this.field_c.a(param1 + 1729379141, 0L);
            this.field_v.a(this.field_c.field_h.length, 0, this.field_c.field_h, param1 - 13979);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_v.b(89);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_a = this.field_a + 1;
            this.field_p = -2;
            this.field_v = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, int param1) {
        de var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 > -108) {
            return true;
          }
          var2 = (de) (qi.field_h.d(0));
          while (var2 != null) {
            if (param0.equalsIgnoreCase(var2.field_l)) {
              return false;
            }
            var2 = (de) (qi.field_h.a((byte) -71));
          }
          qi.field_h.a((byte) -113, new de(param0));
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("qc.O(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void g(int param0) {
        try {
          IOException iOException = null;
          int[] var4 = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_v) {
            return;
          }
          try {
            this.field_c.field_j = 0;
            this.field_c.c(6, (byte) -59);
            this.field_c.a(true, 3);
            this.field_c.d(0, 255);
            if (param0 != -20189) {
              var4 = (int[]) null;
              qc.a(88, -57, (int[]) null, 10);
            }
            this.field_v.a(this.field_c.field_h.length, 0, this.field_c.field_h, -13976);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_v.b(124);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_a = this.field_a + 1;
            this.field_v = null;
            this.field_p = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void h(int param0) {
        qj.a((byte) -127, 4);
        if (param0 != 30252) {
          field_u = (String) null;
        }
    }

    public qc() {
    }

    static {
        field_s = "Cancel rematch";
        field_u = "Remove friend";
        field_t = "N/A";
    }
}
