/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ih {
    static dh field_u;
    static String field_t;
    static jp[] field_s;
    private wh field_q;
    static String field_r;

    final static void a(int param0, ak param1, j param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jp var4 = null;
        jp var5 = null;
        int var6 = 0;
        jp[] var7 = null;
        jp var9 = null;
        jp var10 = null;
        try {
          if (oa.field_Sb == null) {
            return;
          }
          var3_int = 256 * km.field_i / 32;
          var4 = oa.field_Sb.c((byte) -123);
          if (var4 != null) {
            if (km.field_i == 0) {
              var4.c(-var4.field_x + 640, 470 - var4.field_z);
            } else {
              var4.b(-var4.field_x + 640, 470 - var4.field_z, 256 - var3_int);
            }
          }
          if (param0 != 640) {
            field_r = (String) null;
          }
          if (km.field_i > 0 &&
            ih.field_k != null) {
            ih.field_k.b(640 - ih.field_k.field_x, 480 - ih.field_k.field_z - 10, var3_int);
          }
          var5 = nm.field_f[param2.field_y];
          if (var4 != null) {
            var5.c(-3 + (640 - (var4.field_x + var5.field_x) / 2), -var4.field_z + 480 - 10 + 45);
          }
          var6 = kb.a(param1, 0, 100, param2);
          var7 = oa.field_Sb.b(param0 ^ -746);
          if (var7 != null) {
            var9 = var7[var6];
            var9.c(-20 + (-var9.field_x + 640), 520 - var9.field_z);
          }
          if (km.field_i > 0) {
            if (null == fq.field_c) {
              return;
            }
            var10 = fq.field_c[var6];
            var10.b(-var10.field_x + 620, 40 + (-var10.field_z + 480), var3_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("a.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        try {
          IOException iOException = null;
          int var2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_q == null) {
            return;
          }
          var2 = 74 % ((param0 - 14) / 57);
          try {
            this.field_m.field_l = 0;
            this.field_m.a(44, 6);
            this.field_m.a((byte) 47, 3);
            this.field_m.b((byte) 125, 0);
            this.field_q.a(this.field_m.field_k, true, this.field_m.field_k.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.a((byte) 112);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_f = -2;
            this.field_q = null;
            this.field_i = this.field_i + 1;
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
          int stackIn_50_0 = 0;
          int stackIn_66_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          da var2 = null;
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
          da var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          da var2Lifetime1;
          var16 = BrickABrac.field_J ? 1 : 0;
          if (this.field_q != null) {
            var2_long = ue.a(false);
            var4 = (int)(var2_long - this.field_o);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_o = var2_long;
            this.field_b = this.field_b + var4;
            if (this.field_b > 30000) {
              try {
                this.field_q.a((byte) 120);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
          }
          if (this.field_q == null) {
            if (0 != this.e((byte) -67)) {
              return false;
            }
            if (this.c((byte) -105) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_q.c(-1);
            var2 = (da) (this.field_g.a(true));
            while (var2 != null) {
              this.field_m.field_l = 0;
              this.field_m.a(-102, 1);
              this.field_m.a(var2.field_j, (byte) -32);
              this.field_q.a(this.field_m.field_k, true, this.field_m.field_k.length, 0);
              this.field_n.a(var2, false);
              var2 = (da) (this.field_g.e(-8394));
            }
            var2Lifetime1 = (da) (this.field_a.a(true));
            while (var2Lifetime1 != null) {
              this.field_m.field_l = 0;
              this.field_m.a(-128, 0);
              this.field_m.a(var2Lifetime1.field_j, (byte) -32);
              this.field_q.a(this.field_m.field_k, true, this.field_m.field_k.length, 0);
              this.field_c.a(var2Lifetime1, false);
              var2Lifetime1 = (da) (this.field_a.e(-8394));
            }
            if (param0 <= 10) {
              a.h((byte) -19);
            }
            for (var2_int = 0; 100 > var2_int; var2_int++) {
              var3_int = this.field_q.d(10434);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (0 != var3_int) {
                this.field_b = 0;
                var4 = 0;
                if (null == this.field_e) {
                  var4 = 10;
                } else {
                  if (0 == this.field_e.field_K) {
                    var4 = 1;
                  }
                }
                if (var4 <= 0) {
                  var5 = -this.field_e.field_F + this.field_e.field_D.field_k.length;
                  var6 = 512 - this.field_e.field_K;
                  if (var6 > var5 - this.field_e.field_D.field_l) {
                    var6 = var5 - this.field_e.field_D.field_l;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_q.a(25826, this.field_e.field_D.field_k, var6, this.field_e.field_D.field_l);
                  if (this.field_h != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_e.field_D.field_k[var7 + this.field_e.field_D.field_l] = (byte)pn.a((int) this.field_e.field_D.field_k[var7 + this.field_e.field_D.field_l], (int) this.field_h);
                    }
                  }
                  this.field_e.field_K = this.field_e.field_K + var6;
                  this.field_e.field_D.field_l = this.field_e.field_D.field_l + var6;
                  if (var5 != this.field_e.field_D.field_l) {
                    if (this.field_e.field_K == 512) {
                      this.field_e.field_K = 0;
                    }
                  } else {
                    this.field_e.d(3);
                    this.field_e.field_u = false;
                    this.field_e = null;
                  }
                } else {
                  var5 = var4 - this.field_l.field_l;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_q.a(25826, this.field_l.field_k, var5, this.field_l.field_l);
                  if (0 != this.field_h) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_l.field_k[this.field_l.field_l + var6] = (byte)pn.a((int) this.field_l.field_k[this.field_l.field_l + var6], (int) this.field_h);
                    }
                  }
                  this.field_l.field_l = this.field_l.field_l + var5;
                  if (this.field_l.field_l >= var4) {
                    if (null == this.field_e) {
                      this.field_l.field_l = 0;
                      var6 = this.field_l.l(255);
                      var7 = this.field_l.e(255);
                      var8 = this.field_l.l(255);
                      var9 = this.field_l.e(255);
                      var10 = var8 & 127;
                      stackIn_50_0 = (0 == (var8 & 128)) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_50_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (da) (this.field_n.a(true));
                        while (var14_ref != null) {
                          if (var14_ref.field_j == var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (da) (this.field_n.e(-8394));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (da) (this.field_c.a(true));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_j) {
                            break;
                          }
                          var14_ref = (da) (this.field_c.e(-8394));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_66_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_66_0;
                      this.field_e = var14_ref;
                      this.field_e.field_D = new wq(var9 + var15 + this.field_e.field_F);
                      this.field_e.field_D.a(-107, var10);
                      this.field_e.field_D.a(var9, (byte) -79);
                      this.field_e.field_K = 10;
                      this.field_l.field_l = 0;
                    } else {
                      if (0 != this.field_e.field_K) {
                        throw new IOException();
                      }
                      if (this.field_l.field_k[0] == -1) {
                        this.field_l.field_l = 0;
                        this.field_e.field_K = 1;
                      } else {
                        this.field_e = null;
                      }
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
              this.field_q.a((byte) 119);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_f = -2;
            this.field_q = null;
            this.field_i = this.field_i + 1;
            if (this.e((byte) -41) == 0 &&
              0 == this.c((byte) 101)) {
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

    final static boolean a(int param0, mp param1, mp param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = param2.field_Sb - param1.field_Sb;
          if (rk.field_Tb != param2.field_Ub) {
            if (null == param2.field_Ub) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param0 != 200) {
            return false;
          }
          if (rk.field_Tb == param1.field_Ub) {
            var3_int += 200;
          } else {
            if (param1.field_Ub == null) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("a.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        try {
          this.field_q.a((byte) 113);
        } catch (Exception exception) {
        }
        this.field_i = this.field_i + 1;
        if (param0 != 8) {
          return;
        }
        this.field_f = -1;
        this.field_q = null;
        this.field_h = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public static void h(byte param0) {
        field_r = null;
        if (param0 > -92) {
          a.h((byte) 64);
        }
        field_u = null;
        field_s = null;
        field_t = null;
    }

    final static void f(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var1_int = fi.field_w[0];
          if (param0 != 94) {
            a.f((byte) 52);
          }
          for (var2 = 1; fi.field_w.length > var2; var2++) {
            var3 = fi.field_w[var2];
            pm.a(ek.field_jb, var2 << 4, ek.field_jb, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "a.F(" + param0 + ')');
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          da var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          da var4_refLifetime1;
          var6 = BrickABrac.field_J ? 1 : 0;
          try {
            if (this.field_q != null) {
              try {
                this.field_q.a((byte) 114);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
            this.field_q = (wh) (param0);
            this.g((byte) 116);
            this.a(param1, false);
            if (param2 != 12) {
              this.a((byte) -71);
            }
            this.field_l.field_l = 0;
            this.field_e = null;
            while (true) {
              var4_ref = (da) (this.field_n.a(25609));
              if (var4_ref != null) {
                this.field_g.a(var4_ref, false);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (da) (this.field_c.a(param2 + 25597));
              if (var4_refLifetime1 != null) {
                this.field_a.a(var4_refLifetime1, false);
                continue;
              }
              break;
            }
            if (this.field_h != 0) {
              try {
                this.field_m.field_l = 0;
                this.field_m.a(param2 + 50, 4);
                this.field_m.a(40, (int) this.field_h);
                this.field_m.a(0, (byte) -79);
                this.field_q.a(this.field_m.field_k, true, this.field_m.field_k.length, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_q.a((byte) 116);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_i = this.field_i + 1;
                this.field_q = null;
                this.field_f = -2;
              }
            }
            this.field_b = 0;
            this.field_o = ue.a(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("a.E(");
            if (param0 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw qb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        if (this.field_q != null) {
          this.field_q.a((byte) 111);
        }
        if (param0 != 30) {
          this.g((byte) -72);
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
          IOException iOException = null;
          wq stackIn_6_0 = null;
          int stackIn_6_1 = 0;
          int stackIn_7_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_q == null) {
            return;
          }
          try {
            this.field_m.field_l = 0;
            if (param1) {
              return;
            }
            stackIn_6_0 = this.field_m;
            stackIn_6_1 = 37;
            if (!param0) {
              stackIn_7_2 = 3;
            } else {
              stackIn_7_2 = 2;
            }
            ((wq) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_7_2);
            this.field_m.a(0L, (byte) -32);
            this.field_q.a(this.field_m.field_k, true, this.field_m.field_k.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.a((byte) 117);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_f = -2;
            this.field_i = this.field_i + 1;
            this.field_q = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public a() {
    }

    static {
        field_t = "Enter name of friend to add to list";
        field_r = "Music: ";
    }
}
