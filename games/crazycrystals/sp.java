/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sp {
    static ng field_c;
    private qa field_d;
    private int field_e;
    private qa field_b;
    private int field_g;
    static na field_a;
    static sj field_f;

    private final boolean a(int param0, int param1, byte[] param2, int param3, boolean param4) {
        try {
          RuntimeException stackIn_72_0 = null;
          StringBuilder stackIn_72_1 = null;
          String stackIn_73_2 = null;
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
          var16 = CrazyCrystals.field_B;
          try {
            var6 = this.field_d;
            synchronized (var6) {
              try {
                if (param4) {
                  if ((long)(6 * param1 + 6) > this.field_b.b(0)) {
                    return false;
                  }
                  this.field_b.a((long)(param1 * 6), -1);
                  this.field_b.a((byte) 106, mf.field_u, 0, 6);
                  var7_int = (16711680 & mf.field_u[3] << 16) + ((65280 & mf.field_u[4] << 8) + (mf.field_u[5] & 255));
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_d.b(0) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_d.b(0) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                mf.field_u[2] = (byte)param0;
                mf.field_u[1] = (byte)(param0 >> 8);
                mf.field_u[5] = (byte)var7_int;
                mf.field_u[4] = (byte)(var7_int >> 8);
                mf.field_u[3] = (byte)(var7_int >> 16);
                mf.field_u[0] = (byte)(param0 >> 16);
                this.field_b.a((long)(6 * param1), -1);
                this.field_b.a(123, mf.field_u, 0, 6);
                var8 = 0;
                if (param3 <= 111) {
                  field_a = (na) null;
                }
                var9 = 0;
                L4: while (true) {
                  if (param0 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param4) {
                      this.field_d.a((long)(520 * var7_int), -1);
                      if (param1 <= 65535) {
                        try {
                          this.field_d.a((byte) 106, mf.field_u, 0, 8);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var10 = ((mf.field_u[4] & 255) << 16) + (mf.field_u[5] << 8 & 65280) + (255 & mf.field_u[6]);
                        var12 = ((mf.field_u[2] & 255) << 8) + (mf.field_u[3] & 255);
                        var13 = mf.field_u[7] & 255;
                        var11 = ((255 & mf.field_u[0]) << 8) + (mf.field_u[1] & 255);
                      } else {
                        try {
                          this.field_d.a((byte) 106, mf.field_u, 0, 10);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var10 = ((255 & mf.field_u[7]) << 8) + (((255 & mf.field_u[6]) << 16) + (255 & mf.field_u[8]));
                        var12 = (mf.field_u[5] & 255) + ((255 & mf.field_u[4]) << 8);
                        var13 = 255 & mf.field_u[9];
                        var11 = (mf.field_u[2] << 8 & 65280) + ((-16777216 & mf.field_u[0] << 24) + ((mf.field_u[1] & 255) << 16)) + (mf.field_u[3] & 255);
                      }
                      if ((param1 == var11 &&
                        var9 == var12 &&
                        this.field_e == var13) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !(this.field_d.b(0) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param4 = false;
                      var10 = (int)((519L + this.field_d.b(0)) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (512 >= param0 - var8) {
                      var10 = 0;
                    }
                    if (param1 > 65535) {
                      mf.field_u[3] = (byte)param1;
                      mf.field_u[4] = (byte)(var9 >> 8);
                      mf.field_u[0] = (byte)(param1 >> 24);
                      mf.field_u[9] = (byte)this.field_e;
                      mf.field_u[6] = (byte)(var10 >> 16);
                      mf.field_u[7] = (byte)(var10 >> 8);
                      mf.field_u[2] = (byte)(param1 >> 8);
                      mf.field_u[8] = (byte)var10;
                      mf.field_u[1] = (byte)(param1 >> 16);
                      mf.field_u[5] = (byte)var9;
                      this.field_d.a((long)(520 * var7_int), -1);
                      this.field_d.a(122, mf.field_u, 0, 10);
                      var11 = param0 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_d.a(125, param2, var8, var11);
                      var8 = var8 + var11;
                    } else {
                      mf.field_u[2] = (byte)(var9 >> 8);
                      mf.field_u[5] = (byte)(var10 >> 8);
                      mf.field_u[0] = (byte)(param1 >> 8);
                      mf.field_u[6] = (byte)var10;
                      mf.field_u[3] = (byte)var9;
                      mf.field_u[7] = (byte)this.field_e;
                      mf.field_u[1] = (byte)param1;
                      mf.field_u[4] = (byte)(var10 >> 16);
                      this.field_d.a((long)(520 * var7_int), -1);
                      this.field_d.a(122, mf.field_u, 0, 8);
                      var11 = param0 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_d.a(123, param2, var8, var11);
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
            stackIn_72_0 = var6_ref;
            stackIn_72_1 = new StringBuilder().append("sp.D(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_73_2 = "null";
            } else {
              stackIn_73_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_e;
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 != 113) {
          field_c = (ng) null;
        }
        field_c = null;
    }

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
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
          var5 = this.field_d;
          synchronized (var5) {
            if (param0 >= 0 &&
              param0 <= this.field_g) {
              if (param2 != 101) {
                field_f = (sj) null;
              }
              var6 = this.a(param0, param3, param1, 112, true) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param0, param3, param1, 126, false) ? 1 : 0;
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
          stackIn_15_1 = new StringBuilder().append("sp.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte[] a(boolean param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$0 = 0;
          Object stackIn_9_0 = null;
          Object stackIn_23_0 = null;
          Object stackIn_39_0 = null;
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
          var18 = CrazyCrystals.field_B;
          var3 = this.field_d;
          synchronized (var3) {
            try {
              if (this.field_b.b(0) < (long)(6 * param1 + 6)) {
                return null;
              }
              this.field_b.a((long)(param1 * 6), -1);
              this.field_b.a((byte) 106, mf.field_u, 0, 6);
              var4_int = (255 & mf.field_u[2]) + ((65280 & mf.field_u[1] << 8) + ((255 & mf.field_u[0]) << 16));
              var5 = (255 & mf.field_u[5]) + ((mf.field_u[4] & 255) << 8) + ((mf.field_u[3] & 255) << 16);
              if (var4_int < 0) {
                return null;
              }
              if (this.field_g < var4_int) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > (this.field_d.b(0) / 520L)) {
                return null;
              }
              if (param0) {
                field_f = (sj) null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (true) {
                if (var7 >= var4_int) {
                  stackIn_52_0 = var6;
                  return stackIn_52_0;
                }
                if (var5 == 0) {
                  stackIn_23_0 = null;
                  return (byte[]) (stackIn_23_0);
                }
                this.field_d.a((long)(var5 * 520), -1);
                var9 = var4_int - var7;
                if (param1 <= 65535) {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_d.a((byte) 106, mf.field_u, 0, var9 + var14);
                  var12 = (mf.field_u[5] << 8 & 65280) + ((16711680 & mf.field_u[4] << 16) + (255 & mf.field_u[6]));
                  var10 = (mf.field_u[1] & 255) + (65280 & mf.field_u[0] << 8);
                  var13 = mf.field_u[7] & 255;
                  var11 = (255 & mf.field_u[3]) + ((255 & mf.field_u[2]) << 8);
                } else {
                  if (510 < var9) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_d.a((byte) 106, mf.field_u, 0, var9 + var14);
                  var10 = ((255 & mf.field_u[2]) << 8) + (((mf.field_u[0] & 255) << 24) + (16711680 & mf.field_u[1] << 16)) + (255 & mf.field_u[3]);
                  var12 = (255 & mf.field_u[8]) + (((255 & mf.field_u[6]) << 16) + (65280 & mf.field_u[7] << 8));
                  var11 = (65280 & mf.field_u[4] << 8) + (mf.field_u[5] & 255);
                  var13 = 255 & mf.field_u[9];
                }
                if (var10 != param1) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (var13 != this.field_e) {
                  stackIn_39_0 = null;
                  return (byte[]) (stackIn_39_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if ((this.field_d.b(0) / 520L) < (long)var12) {
                  return null;
                }
                var15 = var9 + var14;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$0 = var7;
                  var7++;
                  var6[incrementValue$0] = mf.field_u[var16];
                }
                var5 = var12;
                var8++;
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

    sp(int param0, qa param1, qa param2, int param3) {
        this.field_d = null;
        this.field_b = null;
        this.field_g = 65000;
        try {
          this.field_d = param1;
          this.field_g = param3;
          this.field_b = param2;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "sp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = new ng(256);
        field_f = new sj(15, 0, 1, 0);
    }
}
