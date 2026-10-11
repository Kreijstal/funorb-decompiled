/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ch {
    static int field_o;
    private jd field_m;
    static sg field_n;

    final static jk e(int param0) {
        if (param0 != 48) {
          field_n = (sg) null;
        }
        return new jk(ja.a(-7705), oj.a(104));
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != -14282) {
          field_o = -16;
        }
    }

    final void c(byte param0) {
        try {
          this.field_m.a(true);
        } catch (Exception exception) {
        }
        if (param0 != 0) {
          a.d((byte) 104);
        }
        this.field_b = this.field_b + 1;
        this.field_m = null;
        this.field_l = -1;
        this.field_f = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final void a(int param0) {
        if (this.field_m != null) {
          this.field_m.a(true);
        }
        if (param0 <= 22) {
          a.a(124, 36, 81, 117, -47, 33);
        }
    }

    final boolean b(byte param0) {
        try {
          int stackIn_46_0 = 0;
          int stackIn_61_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          int var2_int = 0;
          na var2 = null;
          IOException var2_ref = null;
          na var3 = null;
          int var3_int = 0;
          Exception var3_ref = null;
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
          na var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var2_intLifetime1;
          var16 = Main.field_T;
          if (null != this.field_m) {
            var2_long = id.a(25);
            var4 = (int)(-this.field_d + var2_long);
            this.field_d = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_k = this.field_k + var4;
            if (this.field_k > 30000) {
              try {
                this.field_m.a(true);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_m = null;
            }
          }
          if (null == this.field_m) {
            if (0 != this.a((byte) -35)) {
              return false;
            }
            if (this.b(-21040) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_m.b((byte) -44);
            var2_int = -9 / ((-82 - param0) / 34);
            var3 = (na) (this.field_g.c((byte) -112));
            while (var3 != null) {
              this.field_c.field_i = 0;
              this.field_c.b(-9469, 1);
              this.field_c.a(var3.field_j, 101);
              this.field_m.a(0, (byte) -89, this.field_c.field_g.length, this.field_c.field_g);
              this.field_h.a((byte) -90, var3);
              var3 = (na) (this.field_g.b((byte) -122));
            }
            var2 = (na) (this.field_a.c((byte) -107));
            while (var2 != null) {
              this.field_c.field_i = 0;
              this.field_c.b(-9469, 0);
              this.field_c.a(var2.field_j, 100);
              this.field_m.a(0, (byte) -89, this.field_c.field_g.length, this.field_c.field_g);
              this.field_e.a((byte) -96, var2);
              var2 = (na) (this.field_a.b((byte) -122));
            }
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 100; var2_intLifetime1++) {
              var3_int = this.field_m.b(-125);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_k = 0;
                var4 = 0;
                if (this.field_j != null) {
                  if (this.field_j.field_t == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (0 >= var4) {
                  var5 = -this.field_j.field_u + this.field_j.field_s.field_g.length;
                  var6 = -this.field_j.field_t + 512;
                  if (var6 > -this.field_j.field_s.field_i + var5) {
                    var6 = var5 - this.field_j.field_s.field_i;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_m.a((byte) 66, this.field_j.field_s.field_g, var6, this.field_j.field_s.field_i);
                  if (this.field_f != 0) {
                    for (var7 = 0; var6 > var7; var7++) {
                      this.field_j.field_s.field_g[var7 + this.field_j.field_s.field_i] = (byte)hi.a((int) this.field_j.field_s.field_g[var7 + this.field_j.field_s.field_i], (int) this.field_f);
                    }
                  }
                  this.field_j.field_t = this.field_j.field_t + var6;
                  this.field_j.field_s.field_i = this.field_j.field_s.field_i + var6;
                  if (this.field_j.field_s.field_i == var5) {
                    this.field_j.d(12);
                    this.field_j.field_n = false;
                    this.field_j = null;
                  } else {
                    if (this.field_j.field_t == 512) {
                      this.field_j.field_t = 0;
                    }
                  }
                } else {
                  var5 = -this.field_i.field_i + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_m.a((byte) 66, this.field_i.field_g, var5, this.field_i.field_i);
                  if (this.field_f != 0) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_i.field_g[var6 + this.field_i.field_i] = (byte)hi.a((int) this.field_i.field_g[var6 + this.field_i.field_i], (int) this.field_f);
                    }
                  }
                  this.field_i.field_i = this.field_i.field_i + var5;
                  if (var4 <= this.field_i.field_i) {
                    if (this.field_j != null) {
                      if (this.field_j.field_t != 0) {
                        throw new IOException();
                      }
                      if (this.field_i.field_g[0] != -1) {
                        this.field_j = null;
                      } else {
                        this.field_j.field_t = 1;
                        this.field_i.field_i = 0;
                      }
                    } else {
                      this.field_i.field_i = 0;
                      var6 = this.field_i.f(64);
                      var7 = this.field_i.e((byte) 125);
                      var8 = this.field_i.f(16);
                      var9 = this.field_i.e((byte) 126);
                      var10 = var8 & 127;
                      stackIn_46_0 = ((var8 & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_46_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (na) (this.field_e.c((byte) -109));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_j) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (na) (this.field_e.b((byte) -122));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (na) (this.field_h.c((byte) -128));
                        while (var14_ref != null) {
                          if (~var14_ref.field_j == ~var12) {
                            break;
                          }
                          var14_ref = (na) (this.field_h.b((byte) -122));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_61_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_61_0;
                      this.field_j = var14_ref;
                      this.field_j.field_s = new pb(this.field_j.field_u + (var15 + var9));
                      this.field_j.field_s.b(-9469, var10);
                      this.field_j.field_s.a(-246, var9);
                      this.field_i.field_i = 0;
                      this.field_j.field_t = 10;
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
              this.field_m.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            this.field_m = null;
            this.field_b = this.field_b + 1;
            this.field_l = -2;
            if (this.a((byte) 74) == 0 &&
              0 == this.b(-21040)) {
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ah.field_c[ei.field_f] = param4;
        if (param3 != -23576) {
          field_o = 23;
        }
        re.field_c[ei.field_f] = ei.field_f;
        p.field_n[ei.field_f] = param1;
        if (bd.field_F < param1) {
          ah.field_d = param1;
        }
        if (param1 < fk.field_h) {
          mf.field_g = param1;
        }
        q.field_h[ei.field_f] = param2;
        mj.field_b[ei.field_f] = param0;
        ij.field_c[ei.field_f] = param5;
        int var6 = param5 + (param2 + param0);
        int var7 = var6 == 0 ? 0 : 1000 * param2 / var6;
        db.field_l[ei.field_f] = var7;
        if (!(mf.field_g <= var7)) {
          mf.field_g = var7;
        }
        if (!(var7 <= ah.field_d)) {
          ah.field_d = var7;
        }
        ei.field_f = ei.field_f + 1;
    }

    final void a(Object param0, boolean param1, boolean param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          na var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          na var4_refLifetime1;
          var6 = Main.field_T;
          try {
            if (param2) {
              field_o = 20;
            }
            if (this.field_m != null) {
              try {
                this.field_m.a(true);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_m = null;
            }
            this.field_m = (jd) (param0);
            this.f(29034);
            this.a((byte) 85, param1);
            this.field_i.field_i = 0;
            this.field_j = null;
            while (true) {
              var4_ref = (na) (this.field_h.a(-99));
              if (var4_ref != null) {
                this.field_g.a((byte) -124, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (na) (this.field_e.a(121));
              if (var4_refLifetime1 != null) {
                this.field_a.a((byte) -120, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_f != 0) {
              try {
                this.field_c.field_i = 0;
                this.field_c.b(-9469, 4);
                this.field_c.b(-9469, (int) this.field_f);
                this.field_c.a(-246, 0);
                this.field_m.a(0, (byte) -89, this.field_c.field_g.length, this.field_c.field_g);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_m.a(true);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_m = null;
                this.field_l = -2;
                this.field_b = this.field_b + 1;
              }
            }
            this.field_k = 0;
            this.field_d = id.a(114);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("a.C(");
            if (param0 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Main.field_T;
        try {
          while (true) {
            param2--;
            if (param2 < 0) {
              if (param4 != -1483723263) {
                field_n = (sg) null;
              }
              return;
            }
            var9 = param3;
            var5 = var9;
            var6 = param0;
            var7 = param1;
            var9[var6] = bc.a(8355711, var9[var6] >> 1) + var7;
            param0++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("a.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
          IOException iOException = null;
          int var3 = 0;
          pb stackIn_5_0 = null;
          int stackIn_5_1 = 0;
          int stackIn_6_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var5 = null;
          if (null == this.field_m) {
            return;
          }
          var3 = -115 / ((param0 + 61) / 55);
          try {
            this.field_c.field_i = 0;
            stackIn_5_0 = this.field_c;
            stackIn_5_1 = -9469;
            if (!param1) {
              stackIn_6_2 = 3;
            } else {
              stackIn_6_2 = 2;
            }
            ((pb) (Object) stackIn_5_0).b(stackIn_5_1, stackIn_6_2);
            this.field_c.a(0L, 121);
            this.field_m.a(0, (byte) -89, this.field_c.field_g.length, this.field_c.field_g);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_m.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_l = -2;
            this.field_m = null;
            this.field_b = this.field_b + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static wb a(wb param0, int[] param1, int param2) {
        wb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        wb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new wb(0, 0, 0);
          var3.field_c = param0.field_c;
          var3.field_j = param1;
          var3.field_b = param0.field_b;
          var3.field_i = param0.field_i;
          var3.field_g = param0.field_g;
          var3.field_h = param0.field_h;
          var3.field_e = param0.field_e;
          var3.field_f = param0.field_f;
          var4 = 69 % ((69 - param2) / 42);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("a.S(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void f(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_m == null) {
            return;
          }
          if (param0 != 29034) {
            field_n = (sg) null;
          }
          try {
            this.field_c.field_i = 0;
            this.field_c.b(-9469, 6);
            this.field_c.a(3, (byte) 60);
            this.field_c.e(0, param0 ^ 5330);
            this.field_m.a(0, (byte) -89, this.field_c.field_g.length, this.field_c.field_g);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_m.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_b = this.field_b + 1;
            this.field_m = null;
            this.field_l = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(byte param0) {
        if (param0 <= 28) {
          field_n = (sg) null;
        }
        vb.field_h.c(new tj(), (byte) 35);
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Main.field_T;
        try {
          for (var6_int = -3; var6_int <= 3; var6_int++) {
            for (var7 = -3; var7 <= 3; var7++) {
              var8 = (var6_int >= 0 ? var6_int : -var6_int) + (var7 >= 0 ? var7 : -var7);
              if (4 >= var8) {
                qa.field_b.a(param1, var6_int + param3, var7 + param5, param0, -1, 256 - var8 * 48);
              }
            }
          }
          qa.field_b.b(param1, param3, param5, param4, param2);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "a.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public a() {
    }

    static {
        field_n = new sg();
    }
}
