/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk {
    static h field_a;
    static String field_b;
    private ud field_j;
    private int field_d;
    private ud field_g;
    static int field_i;
    private int field_e;
    static String field_f;
    static boolean field_h;
    static String field_c;

    final byte[] a(int param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$0 = 0;
          Object stackIn_15_0 = null;
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
          var18 = HoldTheLine.field_D;
          var3 = this.field_g;
          synchronized (var3) {
            try {
              if ((long)(param1 * 6 + 6) > this.field_j.c(-32261)) {
                return null;
              }
              this.field_j.a(25971, (long)(param1 * 6));
              this.field_j.a(-1, 0, 6, oi.field_d);
              var4_int = (16711680 & oi.field_d[0] << 16) + ((oi.field_d[1] & 255) << 8) + (oi.field_d[2] & 255);
              var5 = ((255 & oi.field_d[3]) << 16) + ((oi.field_d[4] & 255) << 8) + (255 & oi.field_d[5]);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_e) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > (this.field_g.c(-32261) / 520L)) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              if (param0 <= 99) {
                this.field_j = (ud) null;
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
                this.field_g.a(25971, (long)(var5 * 520));
                var9 = var4_int - var7;
                if (param1 > 65535) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_g.a(-1, 0, var14 + var9, oi.field_d);
                  var11 = (65280 & oi.field_d[4] << 8) + (oi.field_d[5] & 255);
                  var13 = 255 & oi.field_d[9];
                  var12 = (255 & oi.field_d[8]) + (65280 & oi.field_d[7] << 8) + ((oi.field_d[6] & 255) << 16);
                  var10 = (oi.field_d[0] << 24 & -16777216) + ((oi.field_d[1] & 255) << 16) - (-(65280 & oi.field_d[2] << 8) - (255 & oi.field_d[3]));
                } else {
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_g.a(-1, 0, var9 + var14, oi.field_d);
                  var13 = 255 & oi.field_d[7];
                  var12 = (oi.field_d[6] & 255) + (oi.field_d[4] << 16 & 16711680) + (oi.field_d[5] << 8 & 65280);
                  var11 = ((255 & oi.field_d[2]) << 8) + (255 & oi.field_d[3]);
                  var10 = ((255 & oi.field_d[0]) << 8) + (oi.field_d[1] & 255);
                }
                if (var10 != param1) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (this.field_d != var13) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if (this.field_g.c(-32261) / 520L < (long)var12) {
                  stackIn_45_0 = null;
                  return (byte[]) (stackIn_45_0);
                }
                var15 = var14 + var9;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$0 = var7;
                  var7++;
                  var6[incrementValue$0] = oi.field_d[var16];
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

    public final String toString() {
        return "" + this.field_d;
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = -75 / ((param0 - 56) / 32);
        field_c = null;
        field_f = null;
        field_a = null;
    }

    final static int a(byte param0) {
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        try {
          var1_int = 0;
          var2 = 0;
          while (qh.c(-105)) {
            kl.field_q.b(-1);
            if (kl.field_q.a(-1)) {
              var1_int = 1;
            }
            if (aa.field_n != 13) {
              continue;
            }
            var2 = 1;
          }
          kl.field_q.a(cm.a((byte) 110, jb.field_U, lb.field_x), cm.a((byte) 110, rf.field_X, nc.field_g), 4);
          if (kl.field_q.a(-1)) {
            var1_int = 1;
          }
          if (param0 != 18) {
            sk.a(-123);
          }
          var3 = 0;
          if (var1_int != 0 &&
            0 <= kl.field_q.field_g) {
            var3 = ii.field_e[kl.field_q.field_g];
            if (2 == var3 ||
              5 == var3) {
              ah.b(false);
            }
          } else {
            if (var2 != 0 &&
              2 != pa.field_h) {
              ah.b(false);
            }
          }
          if (0 == var3 &&
            pa.field_h == 2) {
            var4 = bb.b(param0 ^ -19) - cg.field_g;
            var6 = (int)((10999L - var4) / 1000L);
            if (var6 <= 0) {
              pe.a(5, true, (byte) -121);
              var3 = 2;
            }
          }
          stackIn_28_0 = var3;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "sk.A(" + param0 + ')');
        }
    }

    private final boolean a(int param0, int param1, int param2, boolean param3, byte[] param4) {
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
          var16 = HoldTheLine.field_D;
          try {
            var6 = this.field_g;
            synchronized (var6) {
              try {
                if (param3) {
                  if ((long)(6 + 6 * param0) > this.field_j.c(-32261)) {
                    return false;
                  }
                  this.field_j.a(25971, (long)(6 * param0));
                  this.field_j.a(-1, 0, 6, oi.field_d);
                  var7_int = (255 & oi.field_d[5]) + ((oi.field_d[3] & 255) << 16) + (65280 & oi.field_d[4] << 8);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_g.c(-32261) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_g.c(-32261) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                oi.field_d[2] = (byte)param1;
                oi.field_d[5] = (byte)var7_int;
                oi.field_d[4] = (byte)(var7_int >> 8);
                oi.field_d[3] = (byte)(var7_int >> 16);
                oi.field_d[0] = (byte)(param1 >> 16);
                oi.field_d[1] = (byte)(param1 >> 8);
                this.field_j.a(25971, (long)(param0 * 6));
                this.field_j.a((byte) 125, 6, 0, oi.field_d);
                if (param2 <= 73) {
                  field_c = (String) null;
                }
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (param1 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param3) {
                      this.field_g.a(25971, (long)(520 * var7_int));
                      if (param0 > 65535) {
                        try {
                          this.field_g.a(-1, 0, 10, oi.field_d);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var11 = (oi.field_d[3] & 255) + ((oi.field_d[0] & 255) << 24) + (((oi.field_d[1] & 255) << 16) + ((oi.field_d[2] & 255) << 8));
                        var12 = (oi.field_d[5] & 255) + ((255 & oi.field_d[4]) << 8);
                        var13 = oi.field_d[9] & 255;
                        var10 = (255 & oi.field_d[8]) + (16711680 & oi.field_d[6] << 16) + (65280 & oi.field_d[7] << 8);
                      } else {
                        try {
                          this.field_g.a(-1, 0, 8, oi.field_d);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var13 = 255 & oi.field_d[7];
                        var12 = (oi.field_d[3] & 255) + (65280 & oi.field_d[2] << 8);
                        var10 = (255 & oi.field_d[6]) + ((oi.field_d[4] & 255) << 16) + (65280 & oi.field_d[5] << 8);
                        var11 = (255 & oi.field_d[1]) + ((oi.field_d[0] & 255) << 8);
                      }
                      if ((var11 == param0 &&
                        var12 == var9 &&
                        this.field_d == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= (this.field_g.c(-32261) / 520L))))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      var10 = (int)((519L + this.field_g.c(-32261)) / 520L);
                      param3 = false;
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
                    if (65535 >= param0) {
                      oi.field_d[6] = (byte)var10;
                      oi.field_d[0] = (byte)(param0 >> 8);
                      oi.field_d[3] = (byte)var9;
                      oi.field_d[2] = (byte)(var9 >> 8);
                      oi.field_d[1] = (byte)param0;
                      oi.field_d[5] = (byte)(var10 >> 8);
                      oi.field_d[7] = (byte)this.field_d;
                      oi.field_d[4] = (byte)(var10 >> 16);
                      this.field_g.a(25971, (long)(520 * var7_int));
                      this.field_g.a((byte) 126, 8, 0, oi.field_d);
                      var11 = param1 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_g.a((byte) 126, var11, var8, param4);
                      var8 = var8 + var11;
                    } else {
                      oi.field_d[3] = (byte)param0;
                      oi.field_d[0] = (byte)(param0 >> 24);
                      oi.field_d[2] = (byte)(param0 >> 8);
                      oi.field_d[1] = (byte)(param0 >> 16);
                      oi.field_d[8] = (byte)var10;
                      oi.field_d[4] = (byte)(var9 >> 8);
                      oi.field_d[5] = (byte)var9;
                      oi.field_d[6] = (byte)(var10 >> 16);
                      oi.field_d[9] = (byte)this.field_d;
                      oi.field_d[7] = (byte)(var10 >> 8);
                      this.field_g.a(25971, (long)(var7_int * 520));
                      this.field_g.a((byte) 126, 10, 0, oi.field_d);
                      var11 = -var8 + param1;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_g.a((byte) 125, var11, var8, param4);
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
            stackIn_72_1 = new StringBuilder().append("sk.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_73_2 = "null";
            } else {
              stackIn_73_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte[] param0, int param1, int param2, boolean param3) {
        boolean discarded$2 = false;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        byte[] var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_g;
          synchronized (var5) {
            if (param2 >= 0 &&
              this.field_e >= param2) {
              if (param3) {
                var8 = (byte[]) null;
                discarded$2 = this.a(-91, 110, -101, false, (byte[]) null);
              }
              var6 = this.a(param1, param2, 113, true, param0) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param1, param2, 96, false, param0) ? 1 : 0;
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
          stackIn_15_1 = new StringBuilder().append("sk.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    sk(int param0, ud param1, ud param2, int param3) {
        this.field_j = null;
        this.field_g = null;
        this.field_e = 65000;
        try {
          this.field_e = param3;
          this.field_g = param1;
          this.field_j = param2;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "sk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = "Connection restored.";
        field_a = new h();
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_f = "Beat your competitors around <col=1>8</col> laps of the course to progress through the game.<br><br>Power-ups scattered around the course will give bonuses to those cars that collect them.";
        field_h = false;
    }
}
