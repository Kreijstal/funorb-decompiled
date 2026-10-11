/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak {
    private we field_e;
    private int field_b;
    static String field_c;
    private int field_f;
    private we field_d;
    static int field_a;

    public static void a(byte param0) {
        if (param0 < 114) {
          field_c = (String) null;
        }
        field_c = null;
    }

    final byte[] b(int param0, int param1) {
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
          Object stackIn_17_0 = null;
          Object stackIn_23_0 = null;
          Object stackIn_44_0 = null;
          byte[] stackIn_51_0 = null;
          Object stackIn_54_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = Transmogrify.field_A ? 1 : 0;
          var3_ref = this.field_e;
          synchronized (var3_ref) {
            try {
              if (this.field_d.b((byte) 36) < (long)(6 + param1 * 6)) {
                return null;
              }
              this.field_d.a((long)(param1 * 6), (byte) -127);
              this.field_d.a(0, 6, sf.field_kb, (byte) 0);
              if (param0 >= -35) {
                this.field_b = 73;
              }
              var4_int = (sf.field_kb[2] & 255) + (16711680 & sf.field_kb[0] << 16) + (sf.field_kb[1] << 8 & 65280);
              var5 = (255 & sf.field_kb[5]) + (sf.field_kb[4] << 8 & 65280) + (sf.field_kb[3] << 16 & 16711680);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_f) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if ((this.field_e.b((byte) 36) / 520L) < (long)var5) {
                stackIn_17_0 = null;
                return (byte[]) (stackIn_17_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (0 == var5) {
                  stackIn_23_0 = null;
                  return (byte[]) (stackIn_23_0);
                }
                this.field_e.a((long)(var5 * 520), (byte) -126);
                var9 = var4_int - var7;
                if (param1 > 65535) {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_e.a(0, var9 + var14, sf.field_kb, (byte) 0);
                  var13 = 255 & sf.field_kb[9];
                  var12 = (255 & sf.field_kb[8]) + (((sf.field_kb[6] & 255) << 16) + (sf.field_kb[7] << 8 & 65280));
                  var10 = ((sf.field_kb[1] & 255) << 16) + ((sf.field_kb[0] & 255) << 24) + ((sf.field_kb[2] << 8 & 65280) + (255 & sf.field_kb[3]));
                  var11 = (65280 & sf.field_kb[4] << 8) + (sf.field_kb[5] & 255);
                } else {
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_e.a(0, var9 + var14, sf.field_kb, (byte) 0);
                  var13 = 255 & sf.field_kb[7];
                  var11 = (255 & sf.field_kb[3]) + (sf.field_kb[2] << 8 & 65280);
                  var12 = ((sf.field_kb[4] & 255) << 16) - (-(65280 & sf.field_kb[5] << 8) - (sf.field_kb[6] & 255));
                  var10 = (255 & sf.field_kb[1]) + ((255 & sf.field_kb[0]) << 8);
                }
                if (var10 != param1) {
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
                if ((long)var12 > this.field_e.b((byte) 36) / 520L) {
                  stackIn_44_0 = null;
                  return (byte[]) (stackIn_44_0);
                }
                var15 = var14 + var9;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = sf.field_kb[var16];
                }
                var5 = var12;
                var8++;
              }
              stackIn_51_0 = var6;
              return stackIn_51_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_54_0 = null;
              return (byte[]) (stackIn_54_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(boolean param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_e;
          synchronized (var5) {
            if (param3 >= 0 &&
              this.field_f >= param3) {
              var6 = this.a(param2, param3, true, param0, param1) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param2, param3, false, true, param1) ? 1 : 0;
              }
              stackIn_9_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_9_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("ak.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, boolean param3, int param4) {
        try {
          boolean discarded$0 = false;
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
          byte[] var17 = null;
          var16 = Transmogrify.field_A ? 1 : 0;
          try {
            var6 = this.field_e;
            synchronized (var6) {
              try {
                if (param2) {
                  if (this.field_d.b((byte) 36) < (long)(6 + 6 * param4)) {
                    return false;
                  }
                  this.field_d.a((long)(6 * param4), (byte) -122);
                  this.field_d.a(0, 6, sf.field_kb, (byte) 0);
                  var7_int = (sf.field_kb[5] & 255) + ((sf.field_kb[4] & 255) << 8) + (sf.field_kb[3] << 16 & 16711680);
                  if (var7_int <= 0 ||
                    !((this.field_e.b((byte) 36) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_e.b((byte) 36)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                sf.field_kb[4] = (byte)(var7_int >> 8);
                sf.field_kb[0] = (byte)(param1 >> 16);
                sf.field_kb[5] = (byte)var7_int;
                sf.field_kb[1] = (byte)(param1 >> 8);
                sf.field_kb[3] = (byte)(var7_int >> 16);
                sf.field_kb[2] = (byte)param1;
                this.field_d.a((long)(param4 * 6), (byte) -122);
                if (!param3) {
                  var17 = (byte[]) null;
                  discarded$0 = this.a((byte[]) null, -23, true, false, 106);
                }
                this.field_d.a(sf.field_kb, 6, (byte) 110, 0);
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (var8 < param1) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param2) {
                      this.field_e.a((long)(var7_int * 520), (byte) -122);
                      if (param4 > 65535) {
                        try {
                          this.field_e.a(0, 10, sf.field_kb, (byte) 0);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var12 = ((sf.field_kb[4] & 255) << 8) + (sf.field_kb[5] & 255);
                        var11 = ((sf.field_kb[2] & 255) << 8) + (((255 & sf.field_kb[1]) << 16) + (((sf.field_kb[0] & 255) << 24) + (255 & sf.field_kb[3])));
                        var13 = sf.field_kb[9] & 255;
                        var10 = ((255 & sf.field_kb[6]) << 16) + ((sf.field_kb[7] & 255) << 8) + (255 & sf.field_kb[8]);
                      } else {
                        try {
                          this.field_e.a(0, 8, sf.field_kb, (byte) 0);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var11 = (255 & sf.field_kb[1]) + (65280 & sf.field_kb[0] << 8);
                        var13 = 255 & sf.field_kb[7];
                        var12 = (sf.field_kb[3] & 255) + (65280 & sf.field_kb[2] << 8);
                        var10 = (sf.field_kb[6] & 255) + ((sf.field_kb[4] & 255) << 16) + ((sf.field_kb[5] & 255) << 8);
                      }
                      if ((var11 == param4 &&
                        var12 == var9 &&
                        var13 == this.field_b) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((this.field_e.b((byte) 36) / 520L) >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      var10 = (int)((this.field_e.b((byte) 36) + 519L) / 520L);
                      param2 = false;
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (512 >= param1 - var8) {
                      var10 = 0;
                    }
                    if (param4 <= 65535) {
                      sf.field_kb[5] = (byte)(var10 >> 8);
                      sf.field_kb[4] = (byte)(var10 >> 16);
                      sf.field_kb[7] = (byte)this.field_b;
                      sf.field_kb[1] = (byte)param4;
                      sf.field_kb[2] = (byte)(var9 >> 8);
                      sf.field_kb[3] = (byte)var9;
                      sf.field_kb[6] = (byte)var10;
                      sf.field_kb[0] = (byte)(param4 >> 8);
                      this.field_e.a((long)(520 * var7_int), (byte) -120);
                      this.field_e.a(sf.field_kb, 8, (byte) 76, 0);
                      var11 = -var8 + param1;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_e.a(param0, var11, (byte) 116, var8);
                      var8 = var8 + var11;
                    } else {
                      sf.field_kb[0] = (byte)(param4 >> 24);
                      sf.field_kb[7] = (byte)(var10 >> 8);
                      sf.field_kb[5] = (byte)var9;
                      sf.field_kb[6] = (byte)(var10 >> 16);
                      sf.field_kb[8] = (byte)var10;
                      sf.field_kb[1] = (byte)(param4 >> 16);
                      sf.field_kb[3] = (byte)param4;
                      sf.field_kb[9] = (byte)this.field_b;
                      sf.field_kb[2] = (byte)(param4 >> 8);
                      sf.field_kb[4] = (byte)(var9 >> 8);
                      this.field_e.a((long)(520 * var7_int), (byte) -128);
                      this.field_e.a(sf.field_kb, 10, (byte) 90, 0);
                      var11 = -var8 + param1;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.field_e.a(param0, var11, (byte) 118, var8);
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
            stackIn_73_1 = new StringBuilder().append("ak.B(");
            if (param0 == null) {
              stackIn_74_2 = "null";
            } else {
              stackIn_74_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static hh a(byte[] param0, int param1) {
        hh var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        Object stackIn_2_0 = null;
        hh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (hh) (stackIn_2_0);
          }
          if (param1 != 21725) {
            var3 = (byte[]) null;
            ak.a((byte[]) null, 124);
          }
          var2 = new hh(param0, gj.field_j, re.field_a, ql.field_b, wk.field_b, rg.field_D, re.field_K);
          wd.d(120);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ak.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    ak(int param0, we param1, we param2, int param3) {
        this.field_e = null;
        this.field_f = 65000;
        this.field_d = null;
        try {
          this.field_e = param1;
          this.field_f = param3;
          this.field_d = param2;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ak.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final String toString() {
        return "" + this.field_b;
    }

    static {
        field_c = "Resume Tutorial";
        field_a = 500;
    }
}
