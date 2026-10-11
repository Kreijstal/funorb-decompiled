/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk {
    private int field_g;
    private p field_i;
    static int field_c;
    static p field_f;
    static wf field_a;
    private int field_d;
    static int[] field_b;
    static hl field_h;
    private p field_e;

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        oh var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param2 != 13061) {
            var8 = (oh) null;
            sk.a((byte) 95, (oh) null);
          }
          var5 = this.field_i;
          synchronized (var5) {
            if (0 <= param1 &&
              this.field_g >= param1) {
              var6 = this.a(true, param1, param3, 4, param0) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(false, param1, param3, 4, param0) ? 1 : 0;
              }
              stackIn_10_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_10_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var5_ref;
          stackIn_15_1 = new StringBuilder().append("sk.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, byte[] param4) {
        try {
          RuntimeException stackIn_67_0 = null;
          StringBuilder stackIn_67_1 = null;
          String stackIn_68_2 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var6 = null;
          RuntimeException var6_ref = null;
          int var7_int = 0;
          IOException var7 = null;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          EOFException var14 = null;
          int var16 = 0;
          var16 = TetraLink.field_J;
          try {
            var6 = this.field_i;
            synchronized (var6) {
              try {
                if (param0) {
                  if (this.field_e.b(param3 ^ -200000005) < (long)(6 + param2 * 6)) {
                    return false;
                  }
                  this.field_e.a((long)(param2 * 6), 0);
                  this.field_e.a(cf.field_q, 6, 0, (byte) 46);
                  var7_int = (65280 & cf.field_q[4] << 8) + (16711680 & cf.field_q[3] << 16) + (cf.field_q[5] & 255);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_i.b(-200000001) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_i.b(-200000001)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                cf.field_q[2] = (byte)param1;
                cf.field_q[0] = (byte)(param1 >> 16);
                cf.field_q[5] = (byte)var7_int;
                cf.field_q[3] = (byte)(var7_int >> 16);
                cf.field_q[1] = (byte)(param1 >> 8);
                cf.field_q[param3] = (byte)(var7_int >> 8);
                this.field_e.a((long)(6 * param2), 0);
                this.field_e.a(-19735, cf.field_q, 0, 6);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (param1 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param0) {
                      this.field_i.a((long)(var7_int * 520), 0);
                      if (param2 > 65535) {
                        try {
                          this.field_i.a(cf.field_q, 10, 0, (byte) 54);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var12 = (cf.field_q[5] & 255) + ((cf.field_q[4] & 255) << 8);
                        var13 = cf.field_q[9] & 255;
                        var11 = ((255 & cf.field_q[2]) << 8) + ((255 & cf.field_q[0]) << 24) - (-((255 & cf.field_q[1]) << 16) - (255 & cf.field_q[3]));
                        var10 = ((255 & cf.field_q[6]) << 16) + (cf.field_q[7] << 8 & 65280) + (255 & cf.field_q[8]);
                      } else {
                        try {
                          this.field_i.a(cf.field_q, 8, 0, (byte) 43);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var13 = cf.field_q[7] & 255;
                        var12 = ((255 & cf.field_q[2]) << 8) + (255 & cf.field_q[3]);
                        var11 = ((cf.field_q[0] & 255) << 8) + (255 & cf.field_q[1]);
                        var10 = (16711680 & cf.field_q[4] << 16) + (cf.field_q[5] << 8 & 65280) + (cf.field_q[6] & 255);
                      }
                      if ((var11 == param2 &&
                        var12 == var9 &&
                        this.field_d == var13) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !((long)var10 <= this.field_i.b(-200000001) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      var10 = (int)((519L + this.field_i.b(param3 ^ -200000005)) / 520L);
                      param0 = false;
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (512 >= -var8 + param1) {
                      var10 = 0;
                    }
                    if (param2 > 65535) {
                      cf.field_q[6] = (byte)(var10 >> 16);
                      cf.field_q[1] = (byte)(param2 >> 16);
                      cf.field_q[4] = (byte)(var9 >> 8);
                      cf.field_q[7] = (byte)(var10 >> 8);
                      cf.field_q[5] = (byte)var9;
                      cf.field_q[3] = (byte)param2;
                      cf.field_q[8] = (byte)var10;
                      cf.field_q[2] = (byte)(param2 >> 8);
                      cf.field_q[0] = (byte)(param2 >> 24);
                      cf.field_q[9] = (byte)this.field_d;
                      this.field_i.a((long)(520 * var7_int), 0);
                      this.field_i.a(-19735, cf.field_q, 0, 10);
                      var11 = -var8 + param1;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_i.a(param3 ^ -19731, param4, var8, var11);
                      var8 = var8 + var11;
                    } else {
                      cf.field_q[1] = (byte)param2;
                      cf.field_q[5] = (byte)(var10 >> 8);
                      cf.field_q[3] = (byte)var9;
                      cf.field_q[0] = (byte)(param2 >> 8);
                      cf.field_q[2] = (byte)(var9 >> 8);
                      cf.field_q[4] = (byte)(var10 >> 16);
                      cf.field_q[7] = (byte)this.field_d;
                      cf.field_q[6] = (byte)var10;
                      this.field_i.a((long)(520 * var7_int), 0);
                      this.field_i.a(-19735, cf.field_q, 0, 8);
                      var11 = param1 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_i.a(-19735, param4, var8, var11);
                      var8 = var8 + var11;
                    }
                    var9++;
                    var7_int = var10;
                    continue;
                  }
                  break;
                }
                return true;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_67_0 = var6_ref;
            stackIn_67_1 = new StringBuilder().append("sk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_68_2 = "null";
            } else {
              stackIn_68_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        if (aa.field_bc != null) {
          ci.c(67);
          ba.a(1);
          uk.field_x = (float)(aa.field_bc.field_i == 1 ? 0.0 : 3.141592653589793);
        } else {
          uk.field_x = 3.1415927410125732f;
        }
        sa.a(-90, true);
        ti.field_g[param0] = (double)rn.field_d * Math.sin((double)dj.field_h);
        ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
        eo.a(-53);
        wb.a(false, param0 - 7869);
        lb.a(pi.field_c, 573509761);
        int var1 = ui.a(3, param0 + 1692);
        if (var1 == se.field_b) {
          var1 = (se.field_b + 1) % 3;
        }
        se.field_b = var1;
        dl.a(27654, qc.field_bb[var1 + 1]);
    }

    final byte[] a(byte param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int var4_int = 0;
          IOException var4 = null;
          int var5 = 0;
          byte[] var6 = null;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var15 = 0;
          Throwable var17 = null;
          int var18 = 0;
          Object stackIn_9_0 = null;
          Object stackIn_15_0 = null;
          byte[] stackIn_19_0 = null;
          Object stackIn_41_0 = null;
          Object stackIn_47_0 = null;
          byte[] stackIn_54_0 = null;
          Object stackIn_57_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = TetraLink.field_J;
          var3_ref = this.field_i;
          synchronized (var3_ref) {
            try {
              if (this.field_e.b(-200000001) < (long)(6 * param1 + 6)) {
                return null;
              }
              this.field_e.a((long)(param1 * 6), 0);
              this.field_e.a(cf.field_q, 6, 0, (byte) 92);
              var4_int = (255 & cf.field_q[2]) + ((16711680 & cf.field_q[0] << 16) + ((cf.field_q[1] & 255) << 8));
              var5 = (cf.field_q[5] & 255) + ((255 & cf.field_q[3]) << 16) + (65280 & cf.field_q[4] << 8);
              if (0 > var4_int) {
                return null;
              }
              if (this.field_g < var4_int) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > this.field_i.b(param0 ^ 200000029) / 520L) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              if (param0 != -30) {
                stackIn_19_0 = (byte[]) null;
                return stackIn_19_0;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var4_int > var7) {
                if (var5 == 0) {
                  return null;
                }
                this.field_i.a((long)(520 * var5), 0);
                var9 = -var7 + var4_int;
                if (param1 > 65535) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_i.a(cf.field_q, var9 + var14, 0, (byte) 112);
                  var10 = (255 & cf.field_q[3]) + (cf.field_q[2] << 8 & 65280) + (cf.field_q[0] << 24 & -16777216) + ((cf.field_q[1] & 255) << 16);
                  var12 = (65280 & cf.field_q[7] << 8) + ((255 & cf.field_q[6]) << 16) + (cf.field_q[8] & 255);
                  var13 = cf.field_q[9] & 255;
                  var11 = (cf.field_q[5] & 255) + ((255 & cf.field_q[4]) << 8);
                } else {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_i.a(cf.field_q, var14 + var9, 0, (byte) 56);
                  var13 = 255 & cf.field_q[7];
                  var10 = ((255 & cf.field_q[0]) << 8) + (cf.field_q[1] & 255);
                  var11 = (cf.field_q[3] & 255) + (cf.field_q[2] << 8 & 65280);
                  var12 = (255 & cf.field_q[6]) + ((255 & cf.field_q[4]) << 16) + (cf.field_q[5] << 8 & 65280);
                }
                if (param1 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (var13 != this.field_d) {
                  stackIn_41_0 = null;
                  return (byte[]) (stackIn_41_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if (this.field_i.b(-200000001) / 520L < (long)var12) {
                  stackIn_47_0 = null;
                  return (byte[]) (stackIn_47_0);
                }
                var15 = var14 + var9;
                var8++;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = cf.field_q[var16];
                }
                var5 = var12;
              }
              stackIn_54_0 = var6;
              return stackIn_54_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_57_0 = null;
              return (byte[]) (stackIn_57_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.awt.Frame a(int param0, ie param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        nl[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        nl[] var10 = null;
        vl var11 = null;
        var9 = TetraLink.field_J;
        try {
          if (!param1.a((byte) -119)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (param0 == 0) {
            var10 = mn.a(param1, param2 ^ 37956680);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (param3 == var10[var8].field_k &&
                param5 == var10[var8].field_e && ((param4 == 0 ||
                param4 == var10[var8].field_i) &&
                (var7_int == 0 ||
                !(param0 >= var10[var8].field_h)))) {
                param0 = var10[var8].field_h;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          if (param2 != 10) {
            sk.a(78);
          }
          var11 = param1.a(0, param4, param3, param5, param0);
          while (var11.field_d == 0) {
            tb.a(false, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_f);
          if (var7 == null) {
            return null;
          }
          if (var11.field_d != 2) {
            return var7;
          }
          r.a(param1, var7, 0);
          stackIn_39_0 = null;
          return (java.awt.Frame) (stackIn_39_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_42_0 = var6_ref;
          stackIn_42_1 = new StringBuilder().append("sk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(byte param0, oh param1) {
        if (param0 < 104) {
          return;
        }
        try {
          nm.b((byte) 96);
          ra.a(param1.field_C, param1.field_t, param1.field_F);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "sk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        return "" + this.field_d;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != 29187) {
          return;
        }
        field_f = null;
        field_a = null;
        field_h = null;
    }

    final static hm a(byte param0, String param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        hm stackIn_2_0 = null;
        hm stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -79) {
            stackIn_2_0 = (hm) null;
            return stackIn_2_0;
          }
          var4_long = 0L;
          var6 = null;
          if (-1 == param1.indexOf('@')) {
            var7 = (CharSequence) ((Object) param1);
            var4_long = il.a(-23718, var7);
          } else {
            var6 = param1;
          }
          stackIn_7_0 = ug.a(var4_long, (String) (var6), param2, param3, -6336);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("sk.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        gd var1 = null;
        el var1_ref = null;
        int var1_int = 0;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        gd var1Lifetime1;
        var2 = TetraLink.field_J;
        try {
          var1 = (gd) (gl.field_p.c(false));
          while (var1 != null) {
            if (var1.field_Sb > 0) {
              var1.field_Sb = var1.field_Sb - 1;
              if (var1.field_Sb == 0) {
                var1.field_Xb = 0;
                if (var1.d((byte) -1)) {
                  var1.b(false);
                }
              }
            }
            var1 = (gd) (gl.field_p.a((byte) -70));
          }
          var1_ref = (el) (jl.field_a.c(false));
          while (var1_ref != null) {
            if (var1_ref.field_Ub > 0) {
              var1_ref.field_Ub = var1_ref.field_Ub - 1;
              if (var1_ref.field_Ub == 0) {
                var1_ref.field_gc = 0;
                if (var1_ref.h(-597)) {
                  var1_ref.b(false);
                }
              }
            }
            var1_ref = (el) (jl.field_a.a((byte) -70));
          }
          var1Lifetime1 = (gd) (ui.field_d.c(false));
          while (var1Lifetime1 != null) {
            if (0 < var1Lifetime1.field_Sb) {
              var1Lifetime1.field_Sb = var1Lifetime1.field_Sb - 1;
              if (var1Lifetime1.field_Sb != 0) {
                var1Lifetime1 = (gd) (ui.field_d.a((byte) -70));
                continue;
              }
              var1Lifetime1.field_Xb = 0;
              if (var1Lifetime1.d((byte) -1)) {
                var1Lifetime1.b(false);
              }
            }
            var1Lifetime1 = (gd) (ui.field_d.a((byte) -70));
          }
          var1_int = 63 % ((param0 + 48) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref2), "sk.I(" + param0 + ')');
        }
    }

    sk(int param0, p param1, p param2, int param3) {
        this.field_i = null;
        this.field_g = 65000;
        this.field_e = null;
        try {
          this.field_e = param2;
          this.field_g = param3;
          this.field_d = param0;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "sk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static String a(String[] args, String param1, int param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_8_0 = 0;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = TetraLink.field_J;
        try {
          if (param2 <= 118) {
            field_c = -116;
          }
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              stackIn_8_0 = 2 + var6_int;
              for (var5 = stackIn_8_0; var5 < var3_int; var5++) {
                if (fd.a(param1.charAt(var5), (byte) 112)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(var6_int + 2, var5);
              if (!ni.a((CharSequence) ((Object) var7_ref_String), 10)) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (62 != param1.charAt(var5)) {
                continue;
              }
              var5++;
              var8 = rc.a((CharSequence) ((Object) var7_ref_String), 10);
              var4 = var4 + (args[var8].length() - (-var6_int + var5));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$0 = var6.append(param1.substring(var7));
              stackIn_29_0 = var6.toString();
              return stackIn_29_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (fd.a(param1.charAt(var5Lifetime1), (byte) 115)) {
                continue;
              }
              break;
            }
            var9 = param1.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!ni.a((CharSequence) ((Object) var9), 10)) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = rc.a((CharSequence) ((Object) var9), 10);
            discarded$1 = var6.append(param1.substring(var7, var8Lifetime1));
            discarded$2 = var6.append(args[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("sk.D(");
          if (args == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = 256;
        field_b = new int[]{100, 100, 100, 100, 200, 100, 100, 200};
    }
}
