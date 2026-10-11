/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fl extends vb {
    private wb field_u;
    static int[][] field_t;
    static int field_v;
    static ka[] field_s;

    public static void e(int param0) {
        field_s = null;
        if (param0 != -25984) {
          field_s = (ka[]) null;
        }
        field_t = (int[][]) null;
    }

    private final void a(boolean param0, byte param1) {
        try {
          IOException iOException = null;
          uf stackIn_7_0 = null;
          int stackIn_8_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (param1 > -50) {
            this.d((byte) -9);
          }
          if (null == this.field_u) {
            return;
          }
          try {
            this.field_d.field_q = 0;
            stackIn_7_0 = this.field_d;
            if (!param0) {
              stackIn_8_1 = 3;
            } else {
              stackIn_8_1 = 2;
            }
            ((uf) (Object) stackIn_7_0).d(stackIn_8_1, (byte) 122);
            this.field_d.a(0L, -1709073240);
            this.field_u.a(this.field_d.field_m.length, 0, (byte) 98, this.field_d.field_m);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_u.a((byte) -35);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_u = null;
            this.field_b = -2;
            this.field_h = this.field_h + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        if (null != this.field_u) {
          this.field_u.a((byte) 111);
        }
        if (param0 != -19315) {
          this.field_u = (wb) null;
        }
    }

    final void a(boolean param0, Object param1, byte param2) {
        try {
          RuntimeException stackIn_27_0 = null;
          StringBuilder stackIn_27_1 = null;
          String stackIn_28_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          db var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          pa var7 = null;
          db var4_refLifetime1;
          var6 = TorChallenge.field_F ? 1 : 0;
          try {
            if (null != this.field_u) {
              try {
                this.field_u.a((byte) 107);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_u = null;
            }
            this.field_u = (wb) (param1);
            this.d((byte) 2);
            this.a(param0, (byte) -71);
            this.field_o.field_q = 0;
            this.field_p = null;
            if (param2 != 115) {
              var7 = (pa) null;
              fl.a((pa) null, (byte) 59);
            }
            while (true) {
              var4_ref = (db) (this.field_l.c(-1));
              if (var4_ref != null) {
                this.field_c.a(var4_ref, 3329);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (db) (this.field_i.c(-1));
              if (var4_refLifetime1 != null) {
                this.field_k.a(var4_refLifetime1, param2 + 3214);
                continue;
              }
              break;
            }
            if (0 != this.field_f) {
              try {
                this.field_d.field_q = 0;
                this.field_d.d(4, (byte) 122);
                this.field_d.d((int) this.field_f, (byte) 122);
                this.field_d.a(0, false);
                this.field_u.a(this.field_d.field_m.length, 0, (byte) 112, this.field_d.field_m);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_u.a((byte) 127);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_b = -2;
                this.field_h = this.field_h + 1;
                this.field_u = null;
              }
            }
            this.field_g = 0;
            this.field_j = ol.a(256);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = var4_ref3;
            stackIn_27_1 = new StringBuilder().append("fl.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_28_2 = "null";
            } else {
              stackIn_28_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public fl() {
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        try {
          lg.field_b = param2;
          ja.field_b = param3;
          if (param0 >= -57) {
            field_s = (ka[]) null;
          }
          gh.a((byte) -116, nk.field_c, param1);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "fl.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          this.field_u.a((byte) 115);
          if (param0 != -30317) {
            this.c(86);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        this.field_b = -1;
        this.field_u = null;
        this.field_h = this.field_h + 1;
        this.field_f = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    private final void d(byte param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_u) {
            return;
          }
          if (param0 != 2) {
            field_s = (ka[]) null;
          }
          try {
            this.field_d.field_q = 0;
            this.field_d.d(6, (byte) 122);
            this.field_d.a((byte) -124, 3);
            this.field_d.a(0, (byte) 106);
            this.field_u.a(this.field_d.field_m.length, 0, (byte) 121, this.field_d.field_m);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_u.a((byte) 100);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_h = this.field_h + 1;
            this.field_b = -2;
            this.field_u = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(pa param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 103) {
            fl.f(97);
          }
          stackIn_5_0 = (param0.e(1, -53) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("fl.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(int param0) {
        try {
          int var2_int = 0;
          int stackIn_63_0 = 0;
          int stackIn_80_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          db var2 = null;
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
          db var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          db var2Lifetime1;
          var16 = TorChallenge.field_F ? 1 : 0;
          if (this.field_u != null) {
            var2_long = ol.a(256);
            var4 = (int)(var2_long - this.field_j);
            this.field_j = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_g = this.field_g + var4;
            if (this.field_g > 30000) {
              try {
                this.field_u.a((byte) -55);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_u = null;
            }
          }
          if (null == this.field_u) {
            if (0 == this.a((byte) 120) &&
              this.c((byte) 99) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_u.b(127);
            var2 = (db) (this.field_c.a(25777));
            while (var2 != null) {
              this.field_d.field_q = 0;
              this.field_d.d(1, (byte) 122);
              this.field_d.a(var2.field_l, -1709073240);
              this.field_u.a(this.field_d.field_m.length, 0, (byte) 101, this.field_d.field_m);
              this.field_l.a(var2, 3329);
              var2 = (db) (this.field_c.d(49));
            }
            if (param0 > -44) {
              field_v = -12;
            }
            var2Lifetime1 = (db) (this.field_k.a(25777));
            while (var2Lifetime1 != null) {
              this.field_d.field_q = 0;
              this.field_d.d(0, (byte) 122);
              this.field_d.a(var2Lifetime1.field_l, -1709073240);
              this.field_u.a(this.field_d.field_m.length, 0, (byte) 76, this.field_d.field_m);
              this.field_i.a(var2Lifetime1, 3329);
              var2Lifetime1 = (db) (this.field_k.d(118));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_u.a(0);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int == 0) {
                return true;
              }
              this.field_g = 0;
              var4 = 0;
              if (this.field_p == null) {
                var4 = 10;
              } else {
                if (this.field_p.field_C == 0) {
                  var4 = 1;
                }
              }
              if (var4 > 0) {
                var5 = var4 - this.field_o.field_q;
                if (var5 > var3_int) {
                  var5 = var3_int;
                }
                this.field_u.a(-1, this.field_o.field_q, var5, this.field_o.field_m);
                if (0 != this.field_f) {
                  for (var6 = 0; var6 < var5; var6++) {
                    this.field_o.field_m[var6 + this.field_o.field_q] = (byte)TorChallenge.a((int) this.field_o.field_m[var6 + this.field_o.field_q], (int) this.field_f);
                  }
                }
                this.field_o.field_q = this.field_o.field_q + var5;
                if (this.field_o.field_q >= var4) {
                  if (null == this.field_p) {
                    this.field_o.field_q = 0;
                    var6 = this.field_o.j(-101);
                    var7 = this.field_o.i(39);
                    var8 = this.field_o.j(-111);
                    var9 = this.field_o.i(64);
                    var10 = var8 & 127;
                    stackIn_63_0 = ((var8 & 128) == 0) ? 0 : 1;
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameCompleted0 = true;
                    var11 = stackIn_63_0;
                    var12 = ((long)var6 << 32) + (long)var7;
                    var14 = null;
                    if (var11 != 0) {
                      var14_ref = (db) (this.field_i.a(25777));
                      while (var14_ref != null) {
                        if (var14_ref.field_l == var12) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var14_ref = (db) (this.field_i.d(116));
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted0)) {
                      var14_ref = (db) (this.field_l.a(25777));
                      while (var14_ref != null) {
                        if (var14_ref.field_l == var12) {
                          break;
                        }
                        var14_ref = (db) (this.field_l.d(121));
                      }
                    }
                    if (var14_ref == null) {
                      throw new IOException();
                    }
                    stackIn_80_0 = (0 == var10) ? 5 : 9;
                    var15 = stackIn_80_0;
                    this.field_p = var14_ref;
                    this.field_p.field_A = new uf(var15 + var9 + this.field_p.field_F);
                    this.field_p.field_A.d(var10, (byte) 122);
                    this.field_p.field_A.a(var9, false);
                    this.field_p.field_C = 10;
                    this.field_o.field_q = 0;
                  } else {
                    if (this.field_p.field_C != 0) {
                      throw new IOException();
                    }
                    if (this.field_o.field_m[0] == -1) {
                      this.field_p.field_C = 1;
                      this.field_o.field_q = 0;
                    } else {
                      this.field_p = null;
                    }
                  }
                }
              } else {
                var5 = -this.field_p.field_F + this.field_p.field_A.field_m.length;
                var6 = -this.field_p.field_C + 512;
                if (var5 - this.field_p.field_A.field_q < var6) {
                  var6 = -this.field_p.field_A.field_q + var5;
                }
                if (var6 > var3_int) {
                  var6 = var3_int;
                }
                this.field_u.a(-1, this.field_p.field_A.field_q, var6, this.field_p.field_A.field_m);
                if (this.field_f != 0) {
                  for (var7 = 0; var6 > var7; var7++) {
                    this.field_p.field_A.field_m[var7 + this.field_p.field_A.field_q] = (byte)TorChallenge.a((int) this.field_p.field_A.field_m[var7 + this.field_p.field_A.field_q], (int) this.field_f);
                  }
                }
                this.field_p.field_C = this.field_p.field_C + var6;
                this.field_p.field_A.field_q = this.field_p.field_A.field_q + var6;
                if (this.field_p.field_A.field_q == var5) {
                  this.field_p.a(12695);
                  this.field_p.field_v = false;
                  this.field_p = null;
                } else {
                  if (this.field_p.field_C == 512) {
                    this.field_p.field_C = 0;
                  }
                }
              }
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_u.a((byte) 118);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_h = this.field_h + 1;
            this.field_u = null;
            this.field_b = -2;
            if (0 == this.a((byte) 117) &&
              0 == this.c((byte) 99)) {
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

    final static int f(int param0) {
        if (param0 != 0) {
          return -81;
        }
        return sd.field_a - qe.field_R;
    }

    static {
        field_t = new int[][]{null, null, null, null, null, null, null, null, null, null, null, null, new int[]{0, 465, 617, 13, 46, 0, 0, 152, 33, 5, 5, 9, 8, 7, 6, 14, 6, 2, -1, 0, -1}, null, null, null};
    }
}
