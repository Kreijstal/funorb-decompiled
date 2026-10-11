/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qf extends wb {
    static String field_s;
    private ge field_r;
    static int[] field_q;

    final void b(int param0) {
        if (null != this.field_r) {
          this.field_r.b(param0 ^ 80);
        }
        if (param0 != 0) {
          this.a((byte) 59);
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param1.equals("I")) {
            stackIn_5_0 = Integer.TYPE;
            return stackIn_5_0;
          }
          if (param0 != -4174) {
            field_q = (int[]) null;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param1.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param1.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (param1.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (!param1.equals("C")) {
            return Class.forName(param1);
          }
          stackIn_28_0 = Character.TYPE;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("qf.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static void f(int param0) {
        if (ug.field_A != null) {
          ug.field_A.g(false);
        }
        if (param0 != -28390) {
          qf.g(-118);
        }
        if (qj.field_fb != null) {
          qj.field_fb.h(param0 + 4239142);
        }
        cb.a((byte) -52);
    }

    private final void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          wf stackIn_5_0 = null;
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_r) {
            return;
          }
          try {
            this.field_b.field_h = 0;
            stackIn_5_0 = this.field_b;
            if (param1) {
              stackIn_6_1 = 2;
            } else {
              stackIn_6_1 = 3;
            }
            ((wf) (Object) stackIn_5_0).c(stackIn_6_1, -1);
            if (param0 >= -53) {
              return;
            }
            this.field_b.a(0L, 687419600);
            this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 54, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_r.b(33);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_p = this.field_p + 1;
            this.field_r = null;
            this.field_j = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_58_0 = 0;
          int stackIn_74_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          dc var2 = null;
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
          dc var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          dc var2Lifetime1;
          int var3_intLifetime1;
          var16 = Lexicominos.field_L ? 1 : 0;
          if (this.field_r != null) {
            var2_long = rf.c(0);
            var4 = (int)(-this.field_n + var2_long);
            this.field_n = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_e = this.field_e + var4;
            if (this.field_e > 30000) {
              try {
                this.field_r.b(75);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_r = null;
            }
          }
          if (null == this.field_r) {
            if (this.c((byte) 67) == 0 &&
              this.a(true) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_r.a(0);
            var2 = (dc) (this.field_l.a(true));
            while (var2 != null) {
              this.field_b.field_h = 0;
              this.field_b.c(1, -1);
              this.field_b.a(var2.field_j, 687419600);
              this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 58, 0);
              this.field_k.a(85, var2);
              var2 = (dc) (this.field_l.a(-256));
            }
            var2Lifetime1 = (dc) (this.field_d.a(true));
            var3_int = 98 % ((-74 - param0) / 48);
            while (var2Lifetime1 != null) {
              this.field_b.field_h = 0;
              this.field_b.c(0, -1);
              this.field_b.a(var2Lifetime1.field_j, 687419600);
              this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, -124, 0);
              this.field_f.a(82, var2Lifetime1);
              var2Lifetime1 = (dc) (this.field_d.a(-256));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_intLifetime1 = this.field_r.d(-6448);
              if (var3_intLifetime1 < 0) {
                throw new IOException();
              }
              if (var3_intLifetime1 != 0) {
                this.field_e = 0;
                var4 = 0;
                if (null == this.field_o) {
                  var4 = 10;
                } else {
                  if (this.field_o.field_w == 0) {
                    var4 = 1;
                  }
                }
                if (0 < var4) {
                  var5 = var4 - this.field_h.field_h;
                  if (var5 > var3_intLifetime1) {
                    var5 = var3_intLifetime1;
                  }
                  this.field_r.a(this.field_h.field_j, (byte) -109, var5, this.field_h.field_h);
                  if (this.field_a != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_h.field_j[var6 + this.field_h.field_h] = (byte)dg.a((int) this.field_h.field_j[var6 + this.field_h.field_h], (int) this.field_a);
                    }
                  }
                  this.field_h.field_h = this.field_h.field_h + var5;
                  if (this.field_h.field_h >= var4) {
                    if (null != this.field_o) {
                      if (this.field_o.field_w != 0) {
                        throw new IOException();
                      }
                      if (this.field_h.field_j[0] == -1) {
                        this.field_o.field_w = 1;
                        this.field_h.field_h = 0;
                      } else {
                        this.field_o = null;
                      }
                    } else {
                      this.field_h.field_h = 0;
                      var6 = this.field_h.d(true);
                      var7 = this.field_h.d((byte) 19);
                      var8 = this.field_h.d(true);
                      var9 = this.field_h.d((byte) 19);
                      var10 = 127 & var8;
                      stackIn_58_0 = ((var8 & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_58_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (dc) (this.field_k.a(true));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_j) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (dc) (this.field_k.a(-256));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (dc) (this.field_f.a(true));
                        while (var14_ref != null) {
                          if (var14_ref.field_j == var12) {
                            break;
                          }
                          var14_ref = (dc) (this.field_f.a(-256));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      this.field_o = var14_ref;
                      stackIn_74_0 = (0 != var10) ? 9 : 5;
                      var15 = stackIn_74_0;
                      this.field_o.field_x = new wf(this.field_o.field_A + var15 + var9);
                      this.field_o.field_x.c(var10, -1);
                      this.field_o.field_x.f(var9, -32287);
                      this.field_o.field_w = 10;
                      this.field_h.field_h = 0;
                    }
                  }
                } else {
                  var5 = -this.field_o.field_A + this.field_o.field_x.field_j.length;
                  var6 = -this.field_o.field_w + 512;
                  if (var6 > -this.field_o.field_x.field_h + var5) {
                    var6 = var5 - this.field_o.field_x.field_h;
                  }
                  if (var3_intLifetime1 < var6) {
                    var6 = var3_intLifetime1;
                  }
                  this.field_r.a(this.field_o.field_x.field_j, (byte) -109, var6, this.field_o.field_x.field_h);
                  if (0 != this.field_a) {
                    for (var7 = 0; var6 > var7; var7++) {
                      this.field_o.field_x.field_j[this.field_o.field_x.field_h + var7] = (byte)dg.a((int) this.field_o.field_x.field_j[this.field_o.field_x.field_h + var7], (int) this.field_a);
                    }
                  }
                  this.field_o.field_w = this.field_o.field_w + var6;
                  this.field_o.field_x.field_h = this.field_o.field_x.field_h + var6;
                  if (this.field_o.field_x.field_h == var5) {
                    this.field_o.b(12);
                    this.field_o.field_v = false;
                    this.field_o = null;
                  } else {
                    if (this.field_o.field_w == 512) {
                      this.field_o.field_w = 0;
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
              this.field_r.b(41);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_j = -2;
            this.field_p = this.field_p + 1;
            this.field_r = null;
            if (this.c((byte) 67) != 0) {
              return false;
            }
            if (this.a(true) == 0) {
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

    public static void e(byte param0) {
        if (param0 != -15) {
          qf.g(49);
        }
        field_q = null;
        field_s = null;
    }

    private final void d(byte param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_r) {
            return;
          }
          try {
            this.field_b.field_h = 0;
            if (param0 != -108) {
              field_s = (String) null;
            }
            this.field_b.c(6, -1);
            this.field_b.d(3, 48);
            this.field_b.e(97, 0);
            this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, param0 ^ -124, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_r.b(param0 + 235);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_p = this.field_p + 1;
            this.field_r = null;
            this.field_j = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void g(int param0) {
        if (null != jj.field_a) {
          jj.field_a.g(true);
        }
        hd.field_a = new r();
        di.field_x.b(122, hd.field_a);
        if (param0 >= -15) {
          field_q = (int[]) null;
        }
    }

    final static void a(Lexicominos param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          qc.field_c[5] = qc.field_c[5] + 43;
          qc.field_a[5] = new int[]{2};
          vg.field_d[5] = new sg(param0, 5);
          qc.field_a[1] = new int[]{21, 2};
          vg.field_d[1] = new sg(param0, 1);
          if (param1 < 108) {
            qf.e((byte) 68);
          }
          if (0 < jd.field_c &&
            pk.a(jh.field_a, -104)) {
            qc.field_a[2] = new int[]{6, 4, 7, 10, 8, 11};
            qc.field_c[2] = -(43 * qc.field_a[2].length / 2) + 225;
            vg.field_d[2] = new sg(param0, 2);
            qc.field_a[14] = new int[]{19, 4, 7, 10, 8, 20};
            qc.field_c[14] = -(qc.field_a[14].length * 43 / 2) + 225;
            vg.field_d[14] = new sg(param0, 14);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("qf.N(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, Object param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          dc var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          dc var4_refLifetime1;
          var6 = Lexicominos.field_L ? 1 : 0;
          try {
            if (null != this.field_r) {
              try {
                this.field_r.b(17);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_r = null;
            }
            this.field_r = (ge) (param2);
            this.d((byte) -108);
            this.a(-82, param0);
            this.field_o = null;
            this.field_h.field_h = 0;
            while (true) {
              var4_ref = (dc) (this.field_k.a((byte) 100));
              if (var4_ref != null) {
                this.field_l.a(-72, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (dc) (this.field_f.a((byte) 100));
              if (var4_refLifetime1 != null) {
                this.field_d.a(-74, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_a != 0) {
              try {
                this.field_b.field_h = 0;
                this.field_b.c(4, -1);
                this.field_b.c((int) this.field_a, -1);
                this.field_b.f(0, -32287);
                this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 67, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_r.b(84);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_r = null;
                this.field_j = -2;
                this.field_p = this.field_p + 1;
              }
            }
            this.field_e = 0;
            this.field_n = rf.c(0);
            if (param1 > -87) {
              this.a(1, false);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("qf.D(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        try {
          this.field_r.b(16);
        } catch (Exception exception) {
        }
        if (param0 != -28488) {
          this.a((byte) 46);
        }
        this.field_j = -1;
        this.field_r = null;
        this.field_p = this.field_p + 1;
        this.field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    public qf() {
    }

    static {
        field_s = "Waiting for graphics";
        field_q = new int[8192];
    }
}
