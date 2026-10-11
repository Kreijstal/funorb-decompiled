/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    static String field_g;
    private int field_h;
    static String field_e;
    static long field_c;
    private int field_d;
    private ew field_f;
    static int field_b;
    static String field_a;
    private ew field_i;

    public static void b(int param0) {
        if (param0 != -1) {
          field_g = (String) null;
        }
        field_a = null;
        field_g = null;
        field_e = null;
    }

    final boolean a(byte param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_i;
          synchronized (var5) {
            if (param2 >= 0 &&
              param2 <= this.field_d) {
              var6 = this.a(true, 16, param1, param3, param2) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(false, 16, param1, param3, param2) ? 1 : 0;
              }
              if (param0 != 66) {
                this.field_h = -36;
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
          stackIn_15_1 = new StringBuilder().append("qh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int var4_int = 0;
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
          int var18 = 0;
          Object stackIn_15_0 = null;
          Object stackIn_21_0 = null;
          Object stackIn_44_0 = null;
          byte[] stackIn_50_0 = null;
          Object stackIn_53_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = Kickabout.field_G;
          var3_ref = this.field_i;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + 6 * param0) > this.field_f.a(param1 - 65162)) {
                return null;
              }
              this.field_f.a((byte) 4, (long)(param0 * 6));
              this.field_f.a(6, 0, (byte) 93, id.field_u);
              var4_int = (param1 & id.field_u[1] << 8) + ((255 & id.field_u[0]) << 16) + (id.field_u[2] & 255);
              var5 = (255 & id.field_u[5]) + (((255 & id.field_u[3]) << 16) + (id.field_u[4] << 8 & 65280));
              if (0 > var4_int) {
                return null;
              }
              if (this.field_d < var4_int) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > this.field_i.a(-76) / 520L) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  stackIn_21_0 = null;
                  return (byte[]) (stackIn_21_0);
                }
                this.field_i.a((byte) 4, (long)(520 * var5));
                var9 = var4_int - var7;
                if (param0 > 65535) {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_i.a(var14 + var9, 0, (byte) 113, id.field_u);
                  var13 = 255 & id.field_u[9];
                  var12 = (id.field_u[8] & 255) + ((id.field_u[7] & 255) << 8) + ((255 & id.field_u[6]) << 16);
                  var10 = (16711680 & id.field_u[1] << 16) + (((id.field_u[0] & 255) << 24) - (-(id.field_u[2] << 8 & 65280) - (id.field_u[3] & 255)));
                  var11 = (id.field_u[4] << 8 & 65280) + (255 & id.field_u[5]);
                } else {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_i.a(var14 + var9, 0, (byte) 116, id.field_u);
                  var11 = (id.field_u[2] << 8 & 65280) + (255 & id.field_u[3]);
                  var10 = (id.field_u[0] << 8 & 65280) + (255 & id.field_u[1]);
                  var13 = 255 & id.field_u[7];
                  var12 = (id.field_u[4] << 16 & 16711680) - (-(65280 & id.field_u[5] << 8) - (255 & id.field_u[6]));
                }
                if (var10 != param0) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (this.field_h != var13) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((this.field_i.a(58) / 520L) < (long)var12) {
                  stackIn_44_0 = null;
                  return (byte[]) (stackIn_44_0);
                }
                var15 = var9 + var14;
                var8++;
                var5 = var12;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = id.field_u[var16];
                }
              }
              stackIn_50_0 = var6;
              return stackIn_50_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_53_0 = null;
              return (byte[]) (stackIn_53_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, tv param1) {
        int var2_int = 0;
        tv var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var4 = Kickabout.field_G;
        try {
          if (null == param1.field_g) {
            return;
          }
          if (0 != param1.field_j ||
            param1.field_p != 0) {
            for (var2_int = 0; vb.field_j > var2_int; var2_int++) {
              var3 = fu.field_b[var2_int];
              if (var3.field_c == 2 &&
                var3.field_j == param1.field_j &&
                var3.field_p == param1.field_p) {
                return;
              }
            }
          }
          if (param1.field_r != null) {
            ol.field_z = param1.field_c;
            mv.field_a = param1.field_q;
            nr.field_r = param1.field_d;
            qs.field_S = param1.field_r;
          }
          var2_intLifetime1 = 50 % ((-10 - param0) / 54);
          ec.a(true, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("qh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final boolean a(boolean param0, int param1, int param2, byte[] param3, int param4) {
        try {
          RuntimeException stackIn_69_0 = null;
          StringBuilder stackIn_69_1 = null;
          String stackIn_70_2 = null;
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
          var16 = Kickabout.field_G;
          try {
            var6 = this.field_i;
            synchronized (var6) {
              try {
                if (param0) {
                  if ((long)(6 + param2 * 6) > this.field_f.a(param1 ^ -115)) {
                    return false;
                  }
                  this.field_f.a((byte) 4, (long)(6 * param2));
                  this.field_f.a(6, 0, (byte) 103, id.field_u);
                  var7_int = (255 & id.field_u[5]) + ((id.field_u[3] & 255) << 16) + ((id.field_u[4] & 255) << 8);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_i.a(107) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_i.a(121)) / 520L);
                  if (0 == var7_int) {
                    var7_int = 1;
                  }
                }
                id.field_u[0] = (byte)(param4 >> 16);
                id.field_u[3] = (byte)(var7_int >> 16);
                id.field_u[4] = (byte)(var7_int >> 8);
                id.field_u[5] = (byte)var7_int;
                id.field_u[1] = (byte)(param4 >> 8);
                if (param1 != 16) {
                  qh.a(-25);
                }
                id.field_u[2] = (byte)param4;
                this.field_f.a((byte) 4, (long)(6 * param2));
                this.field_f.a(0, 56, 6, id.field_u);
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (var8 < param4) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param0) {
                      this.field_i.a((byte) 4, (long)(520 * var7_int));
                      if (param2 <= 65535) {
                        try {
                          this.field_i.a(8, 0, (byte) 118, id.field_u);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var11 = (id.field_u[1] & 255) + (65280 & id.field_u[0] << 8);
                        var10 = (id.field_u[6] & 255) + (((id.field_u[5] & 255) << 8) + (16711680 & id.field_u[4] << 16));
                        var13 = id.field_u[7] & 255;
                        var12 = ((id.field_u[2] & 255) << 8) + (id.field_u[3] & 255);
                      } else {
                        try {
                          this.field_i.a(10, 0, (byte) 104, id.field_u);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var12 = ((id.field_u[4] & 255) << 8) + (255 & id.field_u[5]);
                        var13 = id.field_u[9] & 255;
                        var11 = (65280 & id.field_u[2] << 8) + ((255 & id.field_u[1]) << 16) + (-16777216 & id.field_u[0] << 24) + (id.field_u[3] & 255);
                        var10 = ((255 & id.field_u[6]) << 16) + ((id.field_u[7] & 255) << 8) + (id.field_u[8] & 255);
                      }
                      if ((var11 == param2 &&
                        var12 == var9 &&
                        var13 == this.field_h) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= this.field_i.a(param1 - 117) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param0 = false;
                      var10 = (int)((519L + this.field_i.a(97)) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (-var8 + param4 <= 512) {
                      var10 = 0;
                    }
                    if (param2 > 65535) {
                      id.field_u[3] = (byte)param2;
                      id.field_u[2] = (byte)(param2 >> 8);
                      id.field_u[1] = (byte)(param2 >> 16);
                      id.field_u[5] = (byte)var9;
                      id.field_u[6] = (byte)(var10 >> 16);
                      id.field_u[4] = (byte)(var9 >> 8);
                      id.field_u[8] = (byte)var10;
                      id.field_u[0] = (byte)(param2 >> 24);
                      id.field_u[7] = (byte)(var10 >> 8);
                      id.field_u[9] = (byte)this.field_h;
                      this.field_i.a((byte) 4, (long)(520 * var7_int));
                      this.field_i.a(0, 125, 10, id.field_u);
                      var11 = param4 - var8;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.field_i.a(var8, param1 + 84, var11, param3);
                      var8 = var8 + var11;
                    } else {
                      id.field_u[4] = (byte)(var10 >> 16);
                      id.field_u[3] = (byte)var9;
                      id.field_u[2] = (byte)(var9 >> 8);
                      id.field_u[1] = (byte)param2;
                      id.field_u[0] = (byte)(param2 >> 8);
                      id.field_u[7] = (byte)this.field_h;
                      id.field_u[6] = (byte)var10;
                      id.field_u[5] = (byte)(var10 >> 8);
                      this.field_i.a((byte) 4, (long)(520 * var7_int));
                      this.field_i.a(0, 76, 8, id.field_u);
                      var11 = -var8 + param4;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_i.a(var8, 102, var11, param3);
                      var8 = var8 + var11;
                    }
                    var7_int = var10;
                    var9++;
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
            stackIn_69_0 = var6_ref;
            stackIn_69_1 = new StringBuilder().append("qh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_h;
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        cf var5 = null;
        bc var6 = null;
        int var7 = 0;
        tf var8 = null;
        cf var9 = null;
        cf var5Lifetime1;
        var7 = Kickabout.field_G;
        try {
          var8 = new tf();
          if (jh.field_Hb.field_Db.field_jb != null) {
            jh.field_Hb.field_Db.field_jb.a(-17481, var8);
          }
          var2 = mf.field_Gb;
          if (var2 < 0) {
            var2 = 0;
          }
          var3 = je.field_k;
          var4 = 5 + var2 * 18;
          L2: while (jh.field_Hb.field_Gb.field_mb - (-15 + jh.field_Hb.field_Db.field_J) > var4) {
            if (pu.field_Db[var3] > var2) {
              var5 = (cf) (var8.g(24009));
              while (var5 != null) {
                if (var5.field_yb != var2 ||
                  var5.field_Ab != var3) {
                  var5 = (cf) (var8.c(33));
                  continue;
                }
                break;
              }
              if (var5 == null) {
                var9 = cu.a(false, 0, var3, var2, false, false);
                var5 = var9;
                var9.a(true, 327, 5, var4, 16);
              }
              jh.field_Hb.field_Db.a((byte) -109, (hd) (var5));
              var6 = bf.field_y.a(var2, (byte) 116, var3);
              var4 += 18;
              var2++;
              if (var6 == null) {
                var5.h((byte) 104);
                continue L2;
              }
              var5.a((byte) 59, var6);
              continue L2;
            }
            break;
          }
          var5Lifetime1 = (cf) (var8.b((byte) 127));
          if (param0 < 82) {
            return;
          }
          while (var5Lifetime1 != null) {
            var5Lifetime1.c(true);
            var5Lifetime1 = (cf) (var8.b((byte) 127));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "qh.A(" + param0 + ')');
        }
    }

    qh(int param0, ew param1, ew param2, int param3) {
        this.field_d = 65000;
        this.field_f = null;
        this.field_i = null;
        try {
          this.field_i = param1;
          this.field_h = param0;
          this.field_f = param2;
          this.field_d = param3;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "qh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_e = "Your search returned no results";
        field_a = "Checking";
        field_g = "Log in to browse the leagues.";
    }
}
