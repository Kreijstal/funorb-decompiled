/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tb extends v {
    static v field_p;
    static String[] field_r;
    private pc field_q;
    static long field_n;
    static String field_o;

    final void a(byte param0, Object param1, boolean param2) {
        try {
          RuntimeException stackIn_29_0 = null;
          StringBuilder stackIn_29_1 = null;
          String stackIn_30_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          lf var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          lf var4_refLifetime1;
          var6 = Bounce.field_N;
          try {
            if (null != this.field_q) {
              try {
                this.field_q.a((byte) -70);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
            this.field_q = (pc) (param1);
            this.d(31383);
            this.a(param2, (byte) 119);
            this.field_c.field_h = 0;
            this.field_b = null;
            while (true) {
              var4_ref = (lf) (this.field_e.a(param0 + 113));
              if (var4_ref != null) {
                this.field_i.a((byte) -78, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (lf) (this.field_m.a(-1));
              if (var4_refLifetime1 != null) {
                this.field_h.a((byte) -78, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_j != 0) {
              try {
                this.field_a.field_h = 0;
                this.field_a.a(4, (byte) 79);
                this.field_a.a((int) this.field_j, (byte) 103);
                this.field_a.b(0, (byte) 65);
                this.field_q.a(this.field_a.field_i.length, this.field_a.field_i, 0, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_q.a((byte) -70);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_l = this.field_l + 1;
                this.field_d = -2;
                this.field_q = null;
              }
            }
            if (param0 != -114) {
              return;
            }
            this.field_g = 0;
            this.field_k = fa.a(98);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = var4_ref3;
            stackIn_29_1 = new StringBuilder().append("tb.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_30_2 = "null";
            } else {
              stackIn_30_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        field_r = null;
        field_o = null;
        field_p = null;
        int var1 = 3 % ((9 - param0) / 57);
    }

    final void a(int param0) {
        if (param0 > -76) {
          this.c((byte) 0);
        }
        if (this.field_q != null) {
          this.field_q.a((byte) -70);
        }
    }

    private final void a(boolean param0, byte param1) {
        try {
          IOException iOException = null;
          wi stackIn_5_0 = null;
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_q == null) {
            return;
          }
          try {
            this.field_a.field_h = 0;
            stackIn_5_0 = this.field_a;
            if (!param0) {
              stackIn_6_1 = 3;
            } else {
              stackIn_6_1 = 2;
            }
            ((wi) (Object) stackIn_5_0).a(stackIn_6_1, (byte) 68);
            this.field_a.a(0L, (byte) -29);
            if (param1 != 119) {
              return;
            }
            this.field_q.a(this.field_a.field_i.length, this.field_a.field_i, 0, param1 ^ 119);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.a((byte) -70);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_d = -2;
            this.field_q = null;
            this.field_l = this.field_l + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean e(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -11) {
          tb.e((byte) 123);
        }
        stackIn_7_0 = (mh.field_U >= 10) && (!pg.field_c) && (!ej.b(-27));
        return stackIn_7_0;
    }

    final void c(byte param0) {
        try {
          this.field_q.a((byte) -70);
        } catch (Exception exception) {
        }
        this.field_q = null;
        this.field_l = this.field_l + 1;
        if (param0 < 108) {
          field_n = -77L;
        }
        this.field_d = -1;
        this.field_j = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final boolean a(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_49_0 = 0;
          int stackIn_64_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          lf var2 = null;
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
          lf var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          lf var2Lifetime1;
          var16 = Bounce.field_N;
          if (null != this.field_q) {
            var2_long = fa.a(param0 ^ -54);
            var4 = (int)(-this.field_k + var2_long);
            this.field_k = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_g = this.field_g + var4;
            if (this.field_g > 30000) {
              try {
                this.field_q.a((byte) -70);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
          }
          if (null == this.field_q) {
            if (this.c(-8217) == 0 &&
              0 == this.a(true)) {
              return true;
            }
            return false;
          }
          try {
            this.field_q.a(-20);
            if (param0 != 71) {
              field_o = (String) null;
            }
            var2 = (lf) (this.field_i.d(-80));
            while (var2 != null) {
              this.field_a.field_h = 0;
              this.field_a.a(1, (byte) 87);
              this.field_a.a(var2.field_j, (byte) -29);
              this.field_q.a(this.field_a.field_i.length, this.field_a.field_i, 0, param0 ^ 71);
              this.field_e.a((byte) -78, var2);
              var2 = (lf) (this.field_i.b(0));
            }
            var2Lifetime1 = (lf) (this.field_h.d(-122));
            while (var2Lifetime1 != null) {
              this.field_a.field_h = 0;
              this.field_a.a(0, (byte) 78);
              this.field_a.a(var2Lifetime1.field_j, (byte) -29);
              this.field_q.a(this.field_a.field_i.length, this.field_a.field_i, 0, 0);
              this.field_m.a((byte) -78, var2Lifetime1);
              var2Lifetime1 = (lf) (this.field_h.b(param0 ^ 71));
            }
            for (var2_int = 0; 100 > var2_int; var2_int++) {
              var3_int = this.field_q.d(0);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int == 0) {
                return true;
              }
              this.field_g = 0;
              var4 = 0;
              if (null == this.field_b) {
                var4 = 10;
              } else {
                if (this.field_b.field_t == 0) {
                  var4 = 1;
                }
              }
              if (var4 <= 0) {
                var5 = -this.field_b.field_s + this.field_b.field_p.field_i.length;
                var6 = -this.field_b.field_t + 512;
                if (var5 - this.field_b.field_p.field_h < var6) {
                  var6 = -this.field_b.field_p.field_h + var5;
                }
                if (var6 > var3_int) {
                  var6 = var3_int;
                }
                this.field_q.a(this.field_b.field_p.field_i, true, var6, this.field_b.field_p.field_h);
                if (0 != this.field_j) {
                  for (var7 = 0; var7 < var6; var7++) {
                    this.field_b.field_p.field_i[var7 + this.field_b.field_p.field_h] = (byte)ud.a((int) this.field_b.field_p.field_i[var7 + this.field_b.field_p.field_h], (int) this.field_j);
                  }
                }
                this.field_b.field_p.field_h = this.field_b.field_p.field_h + var6;
                this.field_b.field_t = this.field_b.field_t + var6;
                if (var5 != this.field_b.field_p.field_h) {
                  if (this.field_b.field_t == 512) {
                    this.field_b.field_t = 0;
                  }
                } else {
                  this.field_b.a(param0 ^ 7);
                  this.field_b.field_n = false;
                  this.field_b = null;
                }
              } else {
                var5 = -this.field_c.field_h + var4;
                if (var3_int < var5) {
                  var5 = var3_int;
                }
                this.field_q.a(this.field_c.field_i, true, var5, this.field_c.field_h);
                if (this.field_j != 0) {
                  for (var6 = 0; var5 > var6; var6++) {
                    this.field_c.field_i[this.field_c.field_h + var6] = (byte)ud.a((int) this.field_c.field_i[this.field_c.field_h + var6], (int) this.field_j);
                  }
                }
                this.field_c.field_h = this.field_c.field_h + var5;
                if (var4 <= this.field_c.field_h) {
                  if (this.field_b != null) {
                    if (this.field_b.field_t != 0) {
                      throw new IOException();
                    }
                    if (this.field_c.field_i[0] == -1) {
                      this.field_b.field_t = 1;
                      this.field_c.field_h = 0;
                    } else {
                      this.field_b = null;
                    }
                  } else {
                    this.field_c.field_h = 0;
                    var6 = this.field_c.d((byte) -78);
                    var7 = this.field_c.j(-3);
                    var8 = this.field_c.d((byte) -106);
                    var9 = this.field_c.j(param0 - 74);
                    var10 = 127 & var8;
                    stackIn_49_0 = ((var8 & 128) == 0) ? 0 : 1;
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameCompleted0 = true;
                    var11 = stackIn_49_0;
                    var12 = (long)var7 + ((long)var6 << 32);
                    var14 = null;
                    if (var11 == 0) {
                      var14_ref = (lf) (this.field_e.d(param0 ^ -47));
                      while (var14_ref != null) {
                        if (var12 == var14_ref.field_j) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var14_ref = (lf) (this.field_e.b(0));
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted0)) {
                      var14_ref = (lf) (this.field_m.d(-92));
                      while (var14_ref != null) {
                        if (~var12 == ~var14_ref.field_j) {
                          break;
                        }
                        var14_ref = (lf) (this.field_m.b(param0 ^ 71));
                      }
                    }
                    if (var14_ref == null) {
                      throw new IOException();
                    }
                    stackIn_64_0 = (var10 == 0) ? 5 : 9;
                    var15 = stackIn_64_0;
                    this.field_b = var14_ref;
                    this.field_b.field_p = new wi(var15 + (var9 + this.field_b.field_s));
                    this.field_b.field_p.a(var10, (byte) 126);
                    this.field_b.field_p.b(var9, (byte) 76);
                    this.field_c.field_h = 0;
                    this.field_b.field_t = 10;
                  }
                }
              }
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.a((byte) -70);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_d = -2;
            this.field_q = null;
            this.field_l = this.field_l + 1;
            if (0 == this.c(param0 ^ -8288) &&
              this.a(true) == 0) {
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

    private final void d(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_q == null) {
            return;
          }
          try {
            this.field_a.field_h = 0;
            this.field_a.a(6, (byte) 97);
            this.field_a.a(3, param0 ^ 490710151);
            this.field_a.e(-750655096, 0);
            this.field_q.a(this.field_a.field_i.length, this.field_a.field_i, 0, param0 ^ param0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.a((byte) -70);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_q = null;
            this.field_l = this.field_l + 1;
            this.field_d = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public tb() {
    }

    static {
        field_o = "Members";
        field_r = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
