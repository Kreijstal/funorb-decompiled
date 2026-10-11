/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jg {
    private int field_b;
    static int[][] field_c;
    private rg field_a;
    private int field_e;
    private rg field_d;

    final static void a(byte param0) {
        t var1 = pl.field_q;
        if (var1.field_c &&
          bj.e((byte) -39)) {
          return;
        }
        if (var1.field_c) {
          pl.field_q = new t();
          if (param0 <= 117) {
            jg.a(true);
          }
          mj.field_d = 0;
          oe.c((byte) -9);
          return;
        }
        if (bj.e((byte) 97)) {
          pl.field_q = new t();
          if (param0 <= 117) {
            jg.a(true);
          }
          mj.field_d = 0;
          oe.c((byte) -9);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = je.a(false, param0);
        if (param2 < -1) {
          return -1;
        }
        if (var3 > param2) {
          if (param1 != 13565) {
            jg.a(-18, -9, 48);
          }
          return param2;
        }
        return -1;
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
          Object stackIn_9_0 = null;
          Object stackIn_15_0 = null;
          Object stackIn_23_0 = null;
          Object stackIn_44_0 = null;
          byte[] stackIn_50_0 = null;
          Object stackIn_53_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = EscapeVector.field_A;
          var3_ref = this.field_a;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + param0 * 6) > this.field_d.a(param1 ^ 22554)) {
                return null;
              }
              this.field_d.a(param1 - 26296, (long)(6 * param0));
              this.field_d.a(0, 6, (byte) 101, bo.field_G);
              var4_int = (bo.field_G[2] & 255) + ((65280 & bo.field_G[1] << 8) + (16711680 & bo.field_G[0] << 16));
              var5 = ((255 & bo.field_G[3]) << 16) + (bo.field_G[4] << 8 & 65280) + (bo.field_G[5] & 255);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_e) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if (this.field_a.a(16034) / 520L < (long)var5) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              if (param1 != 26296) {
                this.toString();
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (0 == var5) {
                  stackIn_23_0 = null;
                  return (byte[]) (stackIn_23_0);
                }
                this.field_a.a(param1 ^ 26296, (long)(520 * var5));
                var9 = var4_int - var7;
                if (param0 > 65535) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_a.a(0, var9 + var14, (byte) 101, bo.field_G);
                  var13 = bo.field_G[9] & 255;
                  var12 = (255 & bo.field_G[8]) + (bo.field_G[6] << 16 & 16711680) + ((255 & bo.field_G[7]) << 8);
                  var11 = (255 & bo.field_G[5]) + ((255 & bo.field_G[4]) << 8);
                  var10 = ((255 & bo.field_G[1]) << 16) + ((bo.field_G[0] & 255) << 24) + (((255 & bo.field_G[2]) << 8) + (255 & bo.field_G[3]));
                } else {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_a.a(0, var9 + var14, (byte) 101, bo.field_G);
                  var12 = (255 & bo.field_G[6]) + ((16711680 & bo.field_G[4] << 16) + ((255 & bo.field_G[5]) << 8));
                  var11 = (bo.field_G[3] & 255) + (bo.field_G[2] << 8 & 65280);
                  var10 = (65280 & bo.field_G[0] << 8) + (255 & bo.field_G[1]);
                  var13 = bo.field_G[7] & 255;
                }
                if (param0 != var10) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (this.field_b != var13) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > (this.field_a.a(16034) / 520L)) {
                  stackIn_44_0 = null;
                  return (byte[]) (stackIn_44_0);
                }
                var15 = var9 + var14;
                var8++;
                var5 = var12;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = bo.field_G[var16];
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
          var5 = this.field_a;
          synchronized (var5) {
            if (param2 >= 0 &&
              this.field_e >= param2) {
              if (param0 != 18) {
                this.field_b = -93;
              }
              var6 = this.a(512, param1, param3, param2, true) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param0 ^ 530, param1, param3, param2, false) ? 1 : 0;
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
          stackIn_15_1 = new StringBuilder().append("jg.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_c = (int[][]) null;
    }

    public final String toString() {
        return "" + this.field_b;
    }

    private final boolean a(int param0, int param1, byte[] param2, int param3, boolean param4) {
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
          var16 = EscapeVector.field_A;
          try {
            var6 = this.field_a;
            synchronized (var6) {
              try {
                if (param4) {
                  if ((long)(6 * param1 + 6) > this.field_d.a(16034)) {
                    return false;
                  }
                  this.field_d.a(param0 - 512, (long)(param1 * 6));
                  this.field_d.a(0, 6, (byte) 101, bo.field_G);
                  var7_int = (bo.field_G[5] & 255) + (((255 & bo.field_G[3]) << 16) + ((bo.field_G[4] & 255) << 8));
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_a.a(param0 + 15522) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_a.a(16034)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                bo.field_G[4] = (byte)(var7_int >> 8);
                bo.field_G[5] = (byte)var7_int;
                bo.field_G[1] = (byte)(param3 >> 8);
                bo.field_G[0] = (byte)(param3 >> 16);
                bo.field_G[3] = (byte)(var7_int >> 16);
                bo.field_G[2] = (byte)param3;
                if (param0 != 512) {
                  this.a(21, -91);
                }
                this.field_d.a(0, (long)(param1 * 6));
                this.field_d.a(true, 0, bo.field_G, 6);
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (var8 < param3) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param4) {
                      this.field_a.a(0, (long)(var7_int * 520));
                      if (param1 > 65535) {
                        try {
                          this.field_a.a(0, 10, (byte) 101, bo.field_G);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var11 = (bo.field_G[1] << 16 & 16711680) + ((bo.field_G[0] << 24 & -16777216) + ((bo.field_G[2] & 255) << 8) + (bo.field_G[3] & 255));
                        var12 = ((bo.field_G[4] & 255) << 8) + (bo.field_G[5] & 255);
                        var10 = ((255 & bo.field_G[7]) << 8) + ((bo.field_G[6] << 16 & 16711680) + (255 & bo.field_G[8]));
                        var13 = 255 & bo.field_G[9];
                      } else {
                        try {
                          this.field_a.a(0, 8, (byte) 101, bo.field_G);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var13 = 255 & bo.field_G[7];
                        var12 = (255 & bo.field_G[3]) + (bo.field_G[2] << 8 & 65280);
                        var11 = (255 & bo.field_G[1]) + (bo.field_G[0] << 8 & 65280);
                        var10 = (bo.field_G[6] & 255) + (16711680 & bo.field_G[4] << 16) + (bo.field_G[5] << 8 & 65280);
                      }
                      if ((var11 == param1 &&
                        var12 == var9 &&
                        this.field_b == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= this.field_a.a(16034) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      var10 = (int)((519L + this.field_a.a(param0 + 15522)) / 520L);
                      param4 = false;
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
                    if (param1 <= 65535) {
                      bo.field_G[6] = (byte)var10;
                      bo.field_G[5] = (byte)(var10 >> 8);
                      bo.field_G[7] = (byte)this.field_b;
                      bo.field_G[0] = (byte)(param1 >> 8);
                      bo.field_G[3] = (byte)var9;
                      bo.field_G[4] = (byte)(var10 >> 16);
                      bo.field_G[1] = (byte)param1;
                      bo.field_G[2] = (byte)(var9 >> 8);
                      this.field_a.a(0, (long)(520 * var7_int));
                      this.field_a.a(true, 0, bo.field_G, 8);
                      var11 = -var8 + param3;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_a.a(true, var8, param2, var11);
                      var8 = var8 + var11;
                    } else {
                      bo.field_G[9] = (byte)this.field_b;
                      bo.field_G[6] = (byte)(var10 >> 16);
                      bo.field_G[3] = (byte)param1;
                      bo.field_G[5] = (byte)var9;
                      bo.field_G[2] = (byte)(param1 >> 8);
                      bo.field_G[7] = (byte)(var10 >> 8);
                      bo.field_G[8] = (byte)var10;
                      bo.field_G[0] = (byte)(param1 >> 24);
                      bo.field_G[4] = (byte)(var9 >> 8);
                      bo.field_G[1] = (byte)(param1 >> 16);
                      this.field_a.a(param0 - 512, (long)(520 * var7_int));
                      this.field_a.a(true, 0, bo.field_G, 10);
                      var11 = param3 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_a.a(true, var8, param2, var11);
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
            stackIn_69_0 = var6_ref;
            stackIn_69_1 = new StringBuilder().append("jg.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        rn var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var11Lifetime5Lifetime1;
        String var11Lifetime5Lifetime2;
        var13 = EscapeVector.field_A;
        if (!(param0 instanceof rn)) {
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
        } else {
          var14 = (rn) ((Object) param0);
          param0 = var14.field_a;
          var2 = var14.field_g + " | ";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        if (param1 != 41) {
          jg.a(true);
        }
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var11Lifetime3 = var7;
        var2Lifetime2 = var11Lifetime3;
        var11Lifetime4 = var7;
        while (true) {
          var8 = var6.readLine();
          var11Lifetime5 = var8;
          var2Lifetime3 = var11Lifetime5;
          var11Lifetime5Lifetime1 = var8;
          if (var8 == null) {
            var2Lifetime3 = var2Lifetime3 + "| " + var7;
            return var2Lifetime3;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (var9 == -1) {
            var11Lifetime5Lifetime2 = var8;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
          } else {
            var11Lifetime5Lifetime2 = var8.substring(0, var9);
          }
          var16 = var11Lifetime5Lifetime2.trim();
          var2Lifetime3Lifetime2 = var16;
          var2Lifetime3Lifetime3 = var16;
          var17 = var16.substring(1 + var16.lastIndexOf(' '));
          var2Lifetime3Lifetime4 = var17;
          var2Lifetime3Lifetime5 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var2Lifetime3Lifetime7 + var18;
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var2Lifetime3Lifetime10 = var19;
          if (var9 != -1) {
            if (-1 == var10) {
              var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime10 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
        }
    }

    jg(int param0, rg param1, rg param2, int param3) {
        this.field_e = 65000;
        this.field_d = null;
        this.field_a = null;
        try {
          this.field_d = param2;
          this.field_b = param0;
          this.field_e = param3;
          this.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "jg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
