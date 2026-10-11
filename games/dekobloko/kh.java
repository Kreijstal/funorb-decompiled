/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kh {
    private nh field_d;
    static String field_b;
    static String field_f;
    static int[] field_e;
    private nh field_a;
    private int field_h;
    private int field_g;
    static String field_c;

    final static void a(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          var1_int = a.field_r[0];
          if (param0 != 2) {
            field_e = (int[]) null;
          }
          for (var2 = 1; a.field_r.length > var2; var2++) {
            var3 = a.field_r[var2];
            an.a(hb.field_Vb, var2 << 4, hb.field_Vb, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "kh.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int var4 = 0;
        vi.field_A.field_n = 0;
        vi.field_A.a(true, 12);
        vi.field_A.a(gg.field_A.nextInt(), false);
        if (param0 < -17) {
          vi.field_A.a(gg.field_A.nextInt(), false);
          vi.field_A.a(true, param1);
          vi.field_A.a(true, param3);
          vi.field_A.d(-1, param2);
          vi.field_A.a(ea.field_k, uk.field_p, true);
          we.field_b.f(18, -4);
          fieldTemp$0 = we.field_b.field_n + 1;
          we.field_b.field_n = we.field_b.field_n + 1;
          var4 = fieldTemp$0;
          we.field_b.a(false, vi.field_A.field_n, vi.field_A.field_r, 0);
          we.field_b.b(we.field_b.field_n - var4, true);
          return;
        }
    }

    public final String toString() {
        return "" + this.field_h;
    }

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
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
          var5 = this.field_a;
          synchronized (var5) {
            if (param3 >= 0 &&
              param3 <= this.field_g) {
              if (param0 != 43) {
                kh.a(')', -33);
              }
              var6 = this.a(true, (byte) -108, param2, param3, param1) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(false, (byte) -43, param2, param3, param1) ? 1 : 0;
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
          stackIn_15_1 = new StringBuilder().append("kh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(boolean param0, byte param1, int param2, int param3, byte[] param4) {
        try {
          RuntimeException stackIn_73_0 = null;
          StringBuilder stackIn_73_1 = null;
          String stackIn_74_2 = null;
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
          var16 = client.field_A ? 1 : 0;
          try {
            var6 = this.field_a;
            synchronized (var6) {
              try {
                if (param1 > -39) {
                  return false;
                }
                if (param0) {
                  if (this.field_d.b(37) < (long)(6 + param2 * 6)) {
                    return false;
                  }
                  this.field_d.a((long)(6 * param2), (byte) -109);
                  this.field_d.a(0, jb.field_b, 741, 6);
                  var7_int = (255 & jb.field_b[5]) + (((255 & jb.field_b[3]) << 16) + (jb.field_b[4] << 8 & 65280));
                  if (0 >= var7_int ||
                    !((this.field_a.b(-94) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_a.b(74) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                jb.field_b[0] = (byte)(param3 >> 16);
                jb.field_b[2] = (byte)param3;
                jb.field_b[5] = (byte)var7_int;
                jb.field_b[1] = (byte)(param3 >> 8);
                jb.field_b[3] = (byte)(var7_int >> 16);
                jb.field_b[4] = (byte)(var7_int >> 8);
                this.field_d.a((long)(6 * param2), (byte) -109);
                this.field_d.a(jb.field_b, (byte) 118, 0, 6);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (var8 < param3) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param0) {
                      this.field_a.a((long)(520 * var7_int), (byte) -109);
                      if (param2 <= 65535) {
                        try {
                          this.field_a.a(0, jb.field_b, 741, 8);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var10 = (255 & jb.field_b[6]) + (16711680 & jb.field_b[4] << 16) + ((255 & jb.field_b[5]) << 8);
                        var13 = 255 & jb.field_b[7];
                        var12 = (255 & jb.field_b[3]) + ((jb.field_b[2] & 255) << 8);
                        var11 = (255 & jb.field_b[1]) + ((255 & jb.field_b[0]) << 8);
                      } else {
                        try {
                          this.field_a.a(0, jb.field_b, 741, 10);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var12 = ((jb.field_b[4] & 255) << 8) + (jb.field_b[5] & 255);
                        var13 = 255 & jb.field_b[9];
                        var11 = (255 & jb.field_b[3]) + (-16777216 & jb.field_b[0] << 24) + ((jb.field_b[1] & 255) << 16) + ((jb.field_b[2] & 255) << 8);
                        var10 = ((255 & jb.field_b[6]) << 16) + (65280 & jb.field_b[7] << 8) + (jb.field_b[8] & 255);
                      }
                      if ((var11 == param2 &&
                        var9 == var12 &&
                        var13 == this.field_h) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= this.field_a.b(-103) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param0 = false;
                      var10 = (int)((this.field_a.b(-121) + 519L) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (-var8 + param3 <= 512) {
                      var10 = 0;
                    }
                    if (param2 > 65535) {
                      jb.field_b[3] = (byte)param2;
                      jb.field_b[1] = (byte)(param2 >> 16);
                      jb.field_b[8] = (byte)var10;
                      jb.field_b[6] = (byte)(var10 >> 16);
                      jb.field_b[4] = (byte)(var9 >> 8);
                      jb.field_b[9] = (byte)this.field_h;
                      jb.field_b[0] = (byte)(param2 >> 24);
                      jb.field_b[5] = (byte)var9;
                      jb.field_b[7] = (byte)(var10 >> 8);
                      jb.field_b[2] = (byte)(param2 >> 8);
                      this.field_a.a((long)(var7_int * 520), (byte) -109);
                      this.field_a.a(jb.field_b, (byte) 96, 0, 10);
                      var11 = param3 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_a.a(param4, (byte) 126, var8, var11);
                      var8 = var8 + var11;
                    } else {
                      jb.field_b[0] = (byte)(param2 >> 8);
                      jb.field_b[7] = (byte)this.field_h;
                      jb.field_b[3] = (byte)var9;
                      jb.field_b[5] = (byte)(var10 >> 8);
                      jb.field_b[4] = (byte)(var10 >> 16);
                      jb.field_b[1] = (byte)param2;
                      jb.field_b[2] = (byte)(var9 >> 8);
                      jb.field_b[6] = (byte)var10;
                      this.field_a.a((long)(var7_int * 520), (byte) -109);
                      this.field_a.a(jb.field_b, (byte) 124, 0, 8);
                      var11 = param3 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_a.a(param4, (byte) 126, var8, var11);
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
            stackIn_73_0 = var6_ref;
            stackIn_73_1 = new StringBuilder().append("kh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_74_2 = "null";
            } else {
              stackIn_74_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != -1643605936) {
          kh.b(15);
        }
    }

    final static boolean a(char param0, int param1) {
        if (param0 >= 32 &&
          param0 <= 126) {
          return true;
        }
        if (param0 >= 160 &&
          255 >= param0) {
          return true;
        }
        if (8364 == param0) {
          return true;
        }
        if (param0 == 338) {
          return true;
        }
        if (param0 == 8212) {
          return true;
        }
        if (339 == param0) {
          return true;
        }
        if (param0 == 376) {
          return true;
        }
        if (param1 == 8212) {
          return false;
        }
        return true;
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = client.field_A ? 1 : 0;
        try {
          var1_int = 0;
          if (!param0) {
            field_f = (String) null;
          }
          while (ic.field_c > var1_int) {
            pd.field_g[var1_int] = null;
            var1_int++;
          }
          ic.field_c = 0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "kh.E(" + param0 + ')');
        }
    }

    final byte[] a(int param0, byte param1) {
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
          byte[] stackIn_7_0 = null;
          Object stackIn_13_0 = null;
          Object stackIn_25_0 = null;
          byte[] stackIn_54_0 = null;
          Object stackIn_57_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = client.field_A ? 1 : 0;
          var3_ref = this.field_a;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + param0 * 6) > this.field_d.b(103)) {
                return null;
              }
              this.field_d.a((long)(6 * param0), (byte) -109);
              this.field_d.a(0, jb.field_b, 741, 6);
              var4_int = (jb.field_b[2] & 255) + (jb.field_b[1] << 8 & 65280) + (jb.field_b[0] << 16 & 16711680);
              if (param1 <= 38) {
                stackIn_7_0 = (byte[]) null;
                return stackIn_7_0;
              }
              var5 = (16711680 & jb.field_b[3] << 16) - (-((jb.field_b[4] & 255) << 8) - (255 & jb.field_b[5]));
              if (var4_int < 0) {
                return null;
              }
              if (this.field_g < var4_int) {
                stackIn_13_0 = null;
                return (byte[]) (stackIn_13_0);
              }
              if (0 >= var5) {
                return null;
              }
              if ((long)var5 > this.field_a.b(-128) / 520L) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (0 == var5) {
                  stackIn_25_0 = null;
                  return (byte[]) (stackIn_25_0);
                }
                this.field_a.a((long)(var5 * 520), (byte) -109);
                var9 = -var7 + var4_int;
                if (param0 > 65535) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_a.a(0, jb.field_b, 741, var9 + var14);
                  var11 = ((255 & jb.field_b[4]) << 8) + (jb.field_b[5] & 255);
                  var12 = ((jb.field_b[6] & 255) << 16) + (jb.field_b[7] << 8 & 65280) + (jb.field_b[8] & 255);
                  var13 = jb.field_b[9] & 255;
                  var10 = (-16777216 & jb.field_b[0] << 24) + ((jb.field_b[1] & 255) << 16) + ((jb.field_b[2] & 255) << 8) + (255 & jb.field_b[3]);
                } else {
                  var14 = 8;
                  if (512 < var9) {
                    var9 = 512;
                  }
                  this.field_a.a(0, jb.field_b, 741, var14 + var9);
                  var12 = (jb.field_b[4] << 16 & 16711680) + (jb.field_b[5] << 8 & 65280) + (255 & jb.field_b[6]);
                  var11 = (255 & jb.field_b[3]) + ((jb.field_b[2] & 255) << 8);
                  var13 = jb.field_b[7] & 255;
                  var10 = (jb.field_b[1] & 255) + (65280 & jb.field_b[0] << 8);
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
                if (this.field_a.b(55) / 520L < (long)var12) {
                  return null;
                }
                var15 = var14 + var9;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = jb.field_b[var16];
                }
                var8++;
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

    kh(int param0, nh param1, nh param2, int param3) {
        this.field_d = null;
        this.field_a = null;
        this.field_g = 65000;
        try {
          this.field_d = param2;
          this.field_a = param1;
          this.field_g = param3;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "kh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_f = "Connection timed out. Please try using a different server.";
        field_b = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = new int[4];
        field_c = "Play the game without logging in just yet";
    }
}
