/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf {
    private int field_c;
    static boolean field_d;
    private td field_b;
    private td field_e;
    private int field_a;

    private final boolean a(byte param0, int param1, int param2, byte[] param3, boolean param4) {
        try {
          RuntimeException stackIn_71_0 = null;
          StringBuilder stackIn_71_1 = null;
          String stackIn_72_2 = null;
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
          var16 = StarCannon.field_A;
          try {
            var6 = this.field_b;
            synchronized (var6) {
              try {
                if (param4) {
                  if ((long)(6 + param2 * 6) > this.field_e.b(false)) {
                    return false;
                  }
                  this.field_e.a((long)(param2 * 6), 0);
                  this.field_e.a(param0 ^ 38, cb.field_b, 0, 6);
                  var7_int = (255 & cb.field_b[5]) + (cb.field_b[3] << 16 & 16711680) + (cb.field_b[4] << 8 & 65280);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_b.b(false) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_b.b(false) + 519L) / 520L);
                  if (0 == var7_int) {
                    var7_int = 1;
                  }
                }
                cb.field_b[1] = (byte)(param1 >> 8);
                cb.field_b[5] = (byte)var7_int;
                cb.field_b[4] = (byte)(var7_int >> 8);
                cb.field_b[2] = (byte)param1;
                cb.field_b[0] = (byte)(param1 >> 16);
                cb.field_b[3] = (byte)(var7_int >> 16);
                this.field_e.a((long)(6 * param2), 0);
                this.field_e.a(0, 6, false, cb.field_b);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (var8 < param1) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param4) {
                      this.field_b.a((long)(520 * var7_int), 0);
                      if (param2 > 65535) {
                        try {
                          this.field_b.a(param0 - 38, cb.field_b, 0, 10);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var11 = (255 & cb.field_b[3]) + ((cb.field_b[2] & 255) << 8) + (((255 & cb.field_b[0]) << 24) + (cb.field_b[1] << 16 & 16711680));
                        var13 = cb.field_b[9] & 255;
                        var12 = (255 & cb.field_b[5]) + (65280 & cb.field_b[4] << 8);
                        var10 = (cb.field_b[8] & 255) + (cb.field_b[6] << 16 & 16711680) + (cb.field_b[7] << 8 & 65280);
                      } else {
                        try {
                          this.field_b.a(0, cb.field_b, 0, 8);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var12 = (cb.field_b[3] & 255) + (cb.field_b[2] << 8 & 65280);
                        var10 = ((255 & cb.field_b[5]) << 8) + (((255 & cb.field_b[4]) << 16) + (cb.field_b[6] & 255));
                        var13 = 255 & cb.field_b[7];
                        var11 = (255 & cb.field_b[1]) + ((cb.field_b[0] & 255) << 8);
                      }
                      if ((var11 == param2 &&
                        var12 == var9 &&
                        var13 == this.field_c) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !((this.field_b.b(false) / 520L) >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param4 = false;
                      var10 = (int)((this.field_b.b(false) + 519L) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (param1 - var8 <= 512) {
                      var10 = 0;
                    }
                    if (param2 > 65535) {
                      cb.field_b[3] = (byte)param2;
                      cb.field_b[2] = (byte)(param2 >> 8);
                      cb.field_b[0] = (byte)(param2 >> 24);
                      cb.field_b[7] = (byte)(var10 >> 8);
                      cb.field_b[6] = (byte)(var10 >> 16);
                      cb.field_b[4] = (byte)(var9 >> 8);
                      cb.field_b[1] = (byte)(param2 >> 16);
                      cb.field_b[5] = (byte)var9;
                      cb.field_b[8] = (byte)var10;
                      cb.field_b[9] = (byte)this.field_c;
                      this.field_b.a((long)(var7_int * 520), 0);
                      this.field_b.a(0, 10, false, cb.field_b);
                      var11 = -var8 + param1;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_b.a(var8, var11, false, param3);
                      var8 = var8 + var11;
                    } else {
                      cb.field_b[3] = (byte)var9;
                      cb.field_b[6] = (byte)var10;
                      cb.field_b[5] = (byte)(var10 >> 8);
                      cb.field_b[1] = (byte)param2;
                      cb.field_b[4] = (byte)(var10 >> 16);
                      cb.field_b[7] = (byte)this.field_c;
                      cb.field_b[2] = (byte)(var9 >> 8);
                      cb.field_b[0] = (byte)(param2 >> 8);
                      this.field_b.a((long)(var7_int * 520), 0);
                      this.field_b.a(0, 8, false, cb.field_b);
                      var11 = param1 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_b.a(var8, var11, false, param3);
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
                if (param0 != 38) {
                  this.field_b = (td) null;
                }
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_71_0 = var6_ref;
            stackIn_71_1 = new StringBuilder().append("uf.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_c;
    }

    final static qb a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        qb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 11 / ((-49 - param1) / 55);
          stackIn_1_0 = new qb(param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("uf.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] a(int param0, byte param1) {
        try {
          int var16 = 0;
          int incrementValue$0 = 0;
          Object stackIn_3_0 = null;
          Object stackIn_11_0 = null;
          Object stackIn_39_0 = null;
          Object stackIn_45_0 = null;
          byte[] stackIn_52_0 = null;
          Object stackIn_55_0 = null;
          Throwable decompiledCaughtException = null;
          Object var3 = null;
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
          int var18 = 0;
          var18 = StarCannon.field_A;
          var3 = this.field_b;
          synchronized (var3) {
            try {
              if (this.field_e.b(false) < (long)(6 + 6 * param0)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_e.a((long)(6 * param0), 0);
              this.field_e.a(0, cb.field_b, 0, 6);
              if (param1 != 114) {
                this.a(24, (byte) 53);
              }
              var4_int = (255 & cb.field_b[2]) + ((cb.field_b[1] << 8 & 65280) + (16711680 & cb.field_b[0] << 16));
              var5 = (65280 & cb.field_b[4] << 8) + ((16711680 & cb.field_b[3] << 16) + (cb.field_b[5] & 255));
              if (var4_int < 0) {
                return null;
              }
              if (this.field_a < var4_int) {
                stackIn_11_0 = null;
                return (byte[]) (stackIn_11_0);
              }
              if (0 >= var5) {
                return null;
              }
              if (this.field_b.b(false) / 520L < (long)var5) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (true) {
                if (var4_int <= var7) {
                  stackIn_52_0 = var6;
                  return stackIn_52_0;
                }
                if (var5 == 0) {
                  return null;
                }
                this.field_b.a((long)(var5 * 520), 0);
                var9 = -var7 + var4_int;
                if (param0 <= 65535) {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_b.a(0, cb.field_b, 0, var14 + var9);
                  var12 = (cb.field_b[6] & 255) + (65280 & cb.field_b[5] << 8) + (cb.field_b[4] << 16 & 16711680);
                  var10 = (cb.field_b[0] << 8 & 65280) + (255 & cb.field_b[1]);
                  var11 = (cb.field_b[2] << 8 & 65280) + (cb.field_b[3] & 255);
                  var13 = 255 & cb.field_b[7];
                } else {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_b.a(0, cb.field_b, 0, var14 + var9);
                  var11 = (65280 & cb.field_b[4] << 8) + (cb.field_b[5] & 255);
                  var12 = (255 & cb.field_b[8]) + (((cb.field_b[6] & 255) << 16) + (65280 & cb.field_b[7] << 8));
                  var10 = (255 & cb.field_b[3]) + (16711680 & cb.field_b[1] << 16) + (-16777216 & cb.field_b[0] << 24) + (cb.field_b[2] << 8 & 65280);
                  var13 = cb.field_b[9] & 255;
                }
                if (var10 != param0) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (var13 != this.field_c) {
                  stackIn_39_0 = null;
                  return (byte[]) (stackIn_39_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if (this.field_b.b(false) / 520L < (long)var12) {
                  stackIn_45_0 = null;
                  return (byte[]) (stackIn_45_0);
                }
                var15 = var14 + var9;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$0 = var7;
                  var7++;
                  var6[incrementValue$0] = cb.field_b[var16];
                }
                var8++;
                var5 = var12;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_55_0 = null;
              return (byte[]) (stackIn_55_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_b;
          synchronized (var5) {
            if (param0 >= ~param1 &&
              this.field_a >= param1) {
              var6 = this.a((byte) 38, param1, param3, param2, true) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a((byte) 38, param1, param3, param2, false) ? 1 : 0;
              }
              stackIn_7_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("uf.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
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
        ii var13;
        StringWriter var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
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
        String var2Lifetime3Lifetime11;
        String var2Lifetime3Lifetime12;
        String var11Lifetime3Lifetime1;
        if (param0 instanceof ii) {
          var13 = (ii) ((Object) param0);
          param0 = var13.field_a;
          var2 = var13.field_b + " | ";
          var11 = var2;
        } else {
          var2 = "";
        }
        var14 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var14));
        if (param1 != -17490) {
          field_d = false;
        }
        param0.printStackTrace(var4);
        var4.close();
        var5 = var14.toString();
        var2Lifetime1 = var5;
        var11Lifetime1 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var2Lifetime2 = var7;
        var11Lifetime2 = var7;
        while (true) {
          var8 = var6.readLine();
          var2Lifetime3 = var8;
          var11Lifetime3 = var8;
          var2Lifetime3Lifetime1 = var11Lifetime3;
          if (var8 == null) {
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var11Lifetime3 = var2Lifetime3Lifetime2;
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var2Lifetime3Lifetime2 = var2Lifetime3Lifetime2 + "| " + var7;
            return var2Lifetime3Lifetime2;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (-1 == var9) {
            var11Lifetime3Lifetime1 = var8;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
          } else {
            var11Lifetime3Lifetime1 = var8.substring(0, var9);
          }
          var15 = var11Lifetime3Lifetime1.trim();
          var2Lifetime3Lifetime4 = var15;
          var2Lifetime3Lifetime5 = var15;
          var16 = var15.substring(var15.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime6 = var16;
          var2Lifetime3Lifetime7 = var16;
          var17 = var16.substring(var16.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime8 = var17;
          var2Lifetime3Lifetime9 = var17;
          var18 = var2Lifetime3Lifetime9 + var17;
          var2Lifetime3Lifetime10 = var18;
          var2Lifetime3Lifetime11 = var18;
          var2Lifetime3Lifetime12 = var18;
          if (var9 != -1 &&
            -1 != var10) {
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime12 = var18 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    uf(int param0, td param1, td param2, int param3) {
        this.field_b = null;
        this.field_e = null;
        this.field_a = 65000;
        try {
          this.field_b = param1;
          this.field_c = param0;
          this.field_a = param3;
          this.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "uf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_d = false;
    }
}
