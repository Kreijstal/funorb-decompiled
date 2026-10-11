/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ln {
    static int field_e;
    private int field_b;
    static int field_d;
    static String field_c;
    private int field_a;
    private hd field_f;
    private hd field_g;

    final static void a(ni param0, int param1) {
        try {
          if (param1 != -28711) {
            String var3 = (String) null;
            ln.a(-57, (String) null, -45);
          }
          wa.field_j.a(param0);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ln.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(int param0, String param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = bh.a(125, param0);
          if (var3 == null) {
            stackIn_3_0 = (String) (param1);
            return stackIn_3_0;
          }
          if (param2 == 255) {
            stackIn_8_0 = jk.a(new String[]{param1}, var3, 30496);
            return stackIn_8_0;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ln.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1) {
        try {
          int var17 = 0;
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
          int var16 = 0;
          int var19 = 0;
          Object stackIn_3_0 = null;
          Object stackIn_9_0 = null;
          Object stackIn_15_0 = null;
          byte[] stackIn_48_0 = null;
          Object stackIn_51_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var19 = DungeonAssault.field_K;
          var3_ref = this.field_f;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + param0 * 6) > this.field_g.a((byte) -92)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_g.a((long)(6 * param0), -26296);
              this.field_g.a(0, -1, un.field_c, 6);
              var4_int = ((255 & un.field_c[0]) << 16) + (((un.field_c[1] & 255) << 8) + (un.field_c[2] & 255));
              var5 = (un.field_c[5] & 255) + (((un.field_c[4] & 255) << 8) + ((un.field_c[3] & 255) << 16));
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_b) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > (this.field_f.a((byte) -92) / 520L)) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = -83 / ((-59 - param1) / 54);
              var9 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  return null;
                }
                this.field_f.a((long)(var5 * 520), -26296);
                var10 = var4_int - var7;
                if (param0 <= 65535) {
                  if (var10 > 512) {
                    var10 = 512;
                  }
                  var15 = 8;
                  this.field_f.a(0, -1, un.field_c, var15 + var10);
                  var11 = (65280 & un.field_c[0] << 8) + (255 & un.field_c[1]);
                  var14 = 255 & un.field_c[7];
                  var13 = ((un.field_c[5] & 255) << 8) + (((un.field_c[4] & 255) << 16) + (255 & un.field_c[6]));
                  var12 = (un.field_c[3] & 255) + (65280 & un.field_c[2] << 8);
                } else {
                  var15 = 10;
                  if (510 < var10) {
                    var10 = 510;
                  }
                  this.field_f.a(0, -1, un.field_c, var15 + var10);
                  var13 = ((255 & un.field_c[6]) << 16) - (-((un.field_c[7] & 255) << 8) - (un.field_c[8] & 255));
                  var14 = 255 & un.field_c[9];
                  var11 = (un.field_c[3] & 255) + ((65280 & un.field_c[2] << 8) + (-16777216 & un.field_c[0] << 24) + ((un.field_c[1] & 255) << 16));
                  var12 = ((un.field_c[4] & 255) << 8) + (255 & un.field_c[5]);
                }
                if (var11 != param0) {
                  return null;
                }
                if (var9 != var12) {
                  return null;
                }
                if (var14 != this.field_a) {
                  return null;
                }
                if (0 > var13) {
                  return null;
                }
                if ((long)var13 > this.field_f.a((byte) -92) / 520L) {
                  return null;
                }
                var16 = var15 + var10;
                var5 = var13;
                var9++;
                for (var17 = var15; var16 > var17; var17++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = un.field_c[var17];
                }
              }
              stackIn_48_0 = var6;
              return stackIn_48_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_51_0 = null;
              return (byte[]) (stackIn_51_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(long param0, byte param1) {
        try {
          try {
            Thread.sleep(param0);
          } catch (InterruptedException interruptedException) {
          }
          if (param1 > -41) {
            field_d = -95;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cd a(byte param0) {
        String var1 = vl.c(param0 - 29335);
        if (var1 != null &&
          !(0 > var1.indexOf('@'))) {
          var1 = "";
        }
        if (param0 != -120) {
          field_e = -79;
        }
        return new cd(vl.c(param0 - 29335), pi.c(-555));
    }

    public static void b(int param0) {
        if (param0 != 1148357992) {
          field_c = (String) null;
        }
        field_c = null;
    }

    private final boolean a(boolean param0, int param1, int param2, boolean param3, byte[] param4) {
        try {
          RuntimeException stackIn_70_0 = null;
          StringBuilder stackIn_70_1 = null;
          String stackIn_71_2 = null;
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
          var16 = DungeonAssault.field_K;
          try {
            var6 = this.field_f;
            synchronized (var6) {
              try {
                if (param3) {
                  if (this.field_g.a((byte) -92) < (long)(6 * param2 + 6)) {
                    return false;
                  }
                  this.field_g.a((long)(param2 * 6), -26296);
                  this.field_g.a(0, -1, un.field_c, 6);
                  var7_int = ((255 & un.field_c[4]) << 8) + ((255 & un.field_c[3]) << 16) + (255 & un.field_c[5]);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_f.a((byte) -92) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_f.a((byte) -92) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                un.field_c[5] = (byte)var7_int;
                un.field_c[3] = (byte)(var7_int >> 16);
                un.field_c[4] = (byte)(var7_int >> 8);
                un.field_c[2] = (byte)param1;
                un.field_c[0] = (byte)(param1 >> 16);
                un.field_c[1] = (byte)(param1 >> 8);
                this.field_g.a((long)(6 * param2), -26296);
                this.field_g.a(0, -91, 6, un.field_c);
                var8 = 0;
                if (!param0) {
                  this.field_b = 88;
                }
                var9 = 0;
                L4: while (true) {
                  if (var8 < param1) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param3) {
                      this.field_f.a((long)(520 * var7_int), -26296);
                      if (65535 >= param2) {
                        try {
                          this.field_f.a(0, -1, un.field_c, 8);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var12 = (65280 & un.field_c[2] << 8) + (un.field_c[3] & 255);
                        var13 = un.field_c[7] & 255;
                        var10 = (un.field_c[4] << 16 & 16711680) + (((un.field_c[5] & 255) << 8) + (255 & un.field_c[6]));
                        var11 = (un.field_c[1] & 255) + (un.field_c[0] << 8 & 65280);
                      } else {
                        try {
                          this.field_f.a(0, -1, un.field_c, 10);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var11 = ((un.field_c[1] & 255) << 16) + ((-16777216 & un.field_c[0] << 24) + (un.field_c[2] << 8 & 65280) + (un.field_c[3] & 255));
                        var10 = (un.field_c[7] << 8 & 65280) + ((un.field_c[6] & 255) << 16) + (255 & un.field_c[8]);
                        var12 = ((255 & un.field_c[4]) << 8) + (255 & un.field_c[5]);
                        var13 = 255 & un.field_c[9];
                      }
                      if ((var11 == param2 &&
                        var9 == var12 &&
                        this.field_a == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !(this.field_f.a((byte) -92) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      var10 = (int)((519L + this.field_f.a((byte) -92)) / 520L);
                      param3 = false;
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (-var8 + param1 <= 512) {
                      var10 = 0;
                    }
                    if (param2 > 65535) {
                      un.field_c[1] = (byte)(param2 >> 16);
                      un.field_c[7] = (byte)(var10 >> 8);
                      un.field_c[5] = (byte)var9;
                      un.field_c[6] = (byte)(var10 >> 16);
                      un.field_c[4] = (byte)(var9 >> 8);
                      un.field_c[3] = (byte)param2;
                      un.field_c[0] = (byte)(param2 >> 24);
                      un.field_c[9] = (byte)this.field_a;
                      un.field_c[2] = (byte)(param2 >> 8);
                      un.field_c[8] = (byte)var10;
                      this.field_f.a((long)(var7_int * 520), -26296);
                      this.field_f.a(0, -116, 10, un.field_c);
                      var11 = -var8 + param1;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_f.a(var8, -106, var11, param4);
                      var8 = var8 + var11;
                    } else {
                      un.field_c[2] = (byte)(var9 >> 8);
                      un.field_c[6] = (byte)var10;
                      un.field_c[5] = (byte)(var10 >> 8);
                      un.field_c[1] = (byte)param2;
                      un.field_c[4] = (byte)(var10 >> 16);
                      un.field_c[7] = (byte)this.field_a;
                      un.field_c[3] = (byte)var9;
                      un.field_c[0] = (byte)(param2 >> 8);
                      this.field_f.a((long)(520 * var7_int), -26296);
                      this.field_f.a(0, -97, 8, un.field_c);
                      var11 = -var8 + param1;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_f.a(var8, -125, var11, param4);
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
            stackIn_70_0 = var6_ref;
            stackIn_70_1 = new StringBuilder().append("ln.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_71_2 = "null";
            } else {
              stackIn_71_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_a;
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param3 != -29447) {
            return false;
          }
          var5 = this.field_f;
          synchronized (var5) {
            if (param2 >= 0 &&
              this.field_b >= param2) {
              var6 = this.a(true, param2, param1, true, param0) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(true, param2, param1, false, param0) ? 1 : 0;
              }
              stackIn_12_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_12_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var5_ref;
          stackIn_17_1 = new StringBuilder().append("ln.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 255) {
          return false;
        }
        return bl.field_r.b((byte) 113);
    }

    ln(int param0, hd param1, hd param2, int param3) {
        this.field_b = 65000;
        this.field_f = null;
        this.field_g = null;
        try {
          this.field_f = param1;
          this.field_g = param2;
          this.field_a = param0;
          this.field_b = param3;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ln.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = "Use this alternative as your account name";
    }
}
