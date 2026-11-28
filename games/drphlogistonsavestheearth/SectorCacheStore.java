/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SectorCacheStore {
    private int field_e;
    static bb field_d;
    private BufferedRandomAccessFile field_g;
    private BufferedRandomAccessFile field_c;
    private int field_a;
    static he[] field_f;
    static RgbSprite field_b;
    static String field_h;

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
          String var2 = (String) null;
          SectorCacheStore.a((String) null, (byte) -116);
        }
        field_h = null;
        field_b = null;
        field_d = null;
    }

    final boolean write(byte param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_c;
          synchronized (var5) {
            if (0 <= param1 &&
              this.field_e >= param1) {
              var6 = -74 % ((23 - param0) / 56);
              var7 = this.writeSectorChain(param3, (byte) -15, param2, true, param1) ? 1 : 0;
              if (var7 == 0) {
                var7 = this.writeSectorChain(param3, (byte) -15, param2, false, param1) ? 1 : 0;
              }
              stackIn_8_0 = var7;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_8_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("ik.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 11755) {
          field_d = (bb) null;
        }
        if (0 > vb.field_n) {
          return;
        }
        var3 = param1 - 135;
        var4 = -35 + param2;
        var5 = 256;
        if (vb.field_n < 75) {
          var5 = (vb.field_n << 8) / 75;
        }
        if (200 < vb.field_n) {
          var5 = (250 - vb.field_n << 8) / 50;
        }
        MouseInput.a(bb.field_f, (byte) 91);
        uc.b();
        SoftwareRasterizer.clearRaster();
        DisplayNameSelectionPanel.g((byte) -104);
        if (256 > var5) {
          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_k, SoftwareRasterizer.field_c, 0, -var5 + 256);
        }
        SocketArchiveNetworkClient.d((byte) -106);
        if (150 <= vb.field_n) {
          ji.field_b.drawWithOpacity(var3 + 15, var4 + 10, var5);
        } else {
          bb.field_f.drawHalfSize(var3, var4);
        }
        var6 = -125 + vb.field_n;
        if (var6 > 0 &&
          var6 < 50) {
          if (var6 < 20) {
            var7 = var6 * 256 / 20;
            vh.field_f.drawAdditive(var3, var4, var7);
          } else {
            if (30 > var6) {
              vh.field_f.drawAdditive(var3, var4, 256);
            } else {
              var7 = (-(256 * var6) + 12800) / 20;
              vh.field_f.drawAdditive(var3, var4, var7);
            }
          }
        }
        var6Lifetime1 = vb.field_n - 140;
        if (0 < var6Lifetime1) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = 256 * var6Lifetime1 / 20;
          }
          vb.field_s.drawWithOpacity(15 + var3, 10 + var4, var5 * var7Lifetime1 >> 8);
        }
        return;
    }

    public final String toString() {
        return "" + this.field_a;
    }

    final byte[] read(int param0, int param1) {
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
          Object stackIn_15_0 = null;
          Object stackIn_42_0 = null;
          byte[] stackIn_49_0 = null;
          Object stackIn_52_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var3_ref = this.field_c;
          synchronized (var3_ref) {
            try {
              if (this.field_g.length(true) < (long)(6 + param0 * 6)) {
                return null;
              }
              this.field_g.seek((long)(param0 * 6), (byte) -63);
              this.field_g.readFully(0, ProgressMessageDialog.field_yb, 6, param1 - 105);
              var4_int = (ProgressMessageDialog.field_yb[1] << 8 & 65280) + (((255 & ProgressMessageDialog.field_yb[0]) << 16) + (ProgressMessageDialog.field_yb[2] & 255));
              var5 = (ProgressMessageDialog.field_yb[5] & 255) + ((ProgressMessageDialog.field_yb[4] & 255) << 8) + (ProgressMessageDialog.field_yb[param1] << 16 & 16711680);
              if (var4_int < 0) {
                return null;
              }
              if (this.field_e < var4_int) {
                return null;
              }
              if (0 >= var5) {
                return null;
              }
              if ((long)var5 > (this.field_c.length(true) / 520L)) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var4_int > var7) {
                if (var5 == 0) {
                  return null;
                }
                this.field_c.seek((long)(var5 * 520), (byte) -63);
                var9 = var4_int - var7;
                if (param0 > 65535) {
                  var14 = 10;
                  if (510 < var9) {
                    var9 = 510;
                  }
                  this.field_c.readFully(0, ProgressMessageDialog.field_yb, var14 + var9, -103);
                  var13 = 255 & ProgressMessageDialog.field_yb[9];
                  var10 = (ProgressMessageDialog.field_yb[3] & 255) + (ProgressMessageDialog.field_yb[0] << 24 & -16777216) + (16711680 & ProgressMessageDialog.field_yb[1] << 16) + ((255 & ProgressMessageDialog.field_yb[2]) << 8);
                  var12 = ((255 & ProgressMessageDialog.field_yb[7]) << 8) + ((255 & ProgressMessageDialog.field_yb[6]) << 16) + (255 & ProgressMessageDialog.field_yb[8]);
                  var11 = (65280 & ProgressMessageDialog.field_yb[4] << 8) + (ProgressMessageDialog.field_yb[5] & 255);
                } else {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_c.readFully(0, ProgressMessageDialog.field_yb, var14 + var9, param1 - 114);
                  var11 = (255 & ProgressMessageDialog.field_yb[3]) + ((255 & ProgressMessageDialog.field_yb[2]) << 8);
                  var12 = (ProgressMessageDialog.field_yb[5] << 8 & 65280) + ((ProgressMessageDialog.field_yb[4] & 255) << 16) + (255 & ProgressMessageDialog.field_yb[6]);
                  var13 = 255 & ProgressMessageDialog.field_yb[7];
                  var10 = (ProgressMessageDialog.field_yb[1] & 255) + (65280 & ProgressMessageDialog.field_yb[0] << 8);
                }
                if (var10 != param0) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (var13 != this.field_a) {
                  return null;
                }
                if (0 > var12) {
                  return null;
                }
                if ((this.field_c.length(true) / 520L) < (long)var12) {
                  stackIn_42_0 = null;
                  return (byte[]) (stackIn_42_0);
                }
                var15 = var9 + var14;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = ProgressMessageDialog.field_yb[var16];
                }
                var5 = var12;
                var8++;
              }
              stackIn_49_0 = var6;
              return stackIn_49_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_52_0 = null;
              return (byte[]) (stackIn_52_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean writeSectorChain(int param0, byte param1, byte[] param2, boolean param3, int param4) {
        try {
          RuntimeException stackIn_76_0 = null;
          StringBuilder stackIn_76_1 = null;
          String stackIn_77_2 = null;
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
          var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            var6 = this.field_c;
            synchronized (var6) {
              try {
                if (param3) {
                  if (this.field_g.length(true) < (long)(param0 * 6 + 6)) {
                    return false;
                  }
                  this.field_g.seek((long)(param0 * 6), (byte) -63);
                  this.field_g.readFully(0, ProgressMessageDialog.field_yb, 6, -111);
                  var7_int = ((255 & ProgressMessageDialog.field_yb[4]) << 8) + ((ProgressMessageDialog.field_yb[3] << 16 & 16711680) + (255 & ProgressMessageDialog.field_yb[5]));
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_c.length(true) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_c.length(true) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                ProgressMessageDialog.field_yb[4] = (byte)(var7_int >> 8);
                ProgressMessageDialog.field_yb[5] = (byte)var7_int;
                ProgressMessageDialog.field_yb[1] = (byte)(param4 >> 8);
                ProgressMessageDialog.field_yb[0] = (byte)(param4 >> 16);
                ProgressMessageDialog.field_yb[3] = (byte)(var7_int >> 16);
                ProgressMessageDialog.field_yb[2] = (byte)param4;
                this.field_g.seek((long)(6 * param0), (byte) -63);
                if (param1 != -15) {
                  return true;
                }
                this.field_g.write(6, 0, 18017, ProgressMessageDialog.field_yb);
                var8 = 0;
                var9 = 0;
                scanLoop1: while (true) {
                  if (param4 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param3) {
                      this.field_c.seek((long)(520 * var7_int), (byte) -63);
                      if (param0 > 65535) {
                        try {
                          this.field_c.readFully(0, ProgressMessageDialog.field_yb, 10, -122);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break scanLoop1;
                        }
                        var10 = (16711680 & ProgressMessageDialog.field_yb[6] << 16) + ((ProgressMessageDialog.field_yb[7] & 255) << 8) + (255 & ProgressMessageDialog.field_yb[8]);
                        var12 = (ProgressMessageDialog.field_yb[5] & 255) + (65280 & ProgressMessageDialog.field_yb[4] << 8);
                        var13 = 255 & ProgressMessageDialog.field_yb[9];
                        var11 = (ProgressMessageDialog.field_yb[3] & 255) + (ProgressMessageDialog.field_yb[2] << 8 & 65280) + (((255 & ProgressMessageDialog.field_yb[1]) << 16) + ((ProgressMessageDialog.field_yb[0] & 255) << 24));
                      } else {
                        try {
                          this.field_c.readFully(0, ProgressMessageDialog.field_yb, 8, param1 ^ 109);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break scanLoop1;
                        }
                        var10 = (ProgressMessageDialog.field_yb[6] & 255) + (((255 & ProgressMessageDialog.field_yb[4]) << 16) + ((ProgressMessageDialog.field_yb[5] & 255) << 8));
                        var13 = 255 & ProgressMessageDialog.field_yb[7];
                        var11 = (65280 & ProgressMessageDialog.field_yb[0] << 8) + (ProgressMessageDialog.field_yb[1] & 255);
                        var12 = (255 & ProgressMessageDialog.field_yb[3]) + ((255 & ProgressMessageDialog.field_yb[2]) << 8);
                      }
                      if ((param0 == var11 &&
                        var12 == var9 &&
                        this.field_a == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !(this.field_c.length(true) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param3 = false;
                      var10 = (int)((this.field_c.length(true) + 519L) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (512 >= param4 - var8) {
                      var10 = 0;
                    }
                    if (param0 > 65535) {
                      ProgressMessageDialog.field_yb[4] = (byte)(var9 >> 8);
                      ProgressMessageDialog.field_yb[0] = (byte)(param0 >> 24);
                      ProgressMessageDialog.field_yb[9] = (byte)this.field_a;
                      ProgressMessageDialog.field_yb[5] = (byte)var9;
                      ProgressMessageDialog.field_yb[8] = (byte)var10;
                      ProgressMessageDialog.field_yb[2] = (byte)(param0 >> 8);
                      ProgressMessageDialog.field_yb[3] = (byte)param0;
                      ProgressMessageDialog.field_yb[6] = (byte)(var10 >> 16);
                      ProgressMessageDialog.field_yb[1] = (byte)(param0 >> 16);
                      ProgressMessageDialog.field_yb[7] = (byte)(var10 >> 8);
                      this.field_c.seek((long)(var7_int * 520), (byte) -63);
                      this.field_c.write(10, 0, 18017, ProgressMessageDialog.field_yb);
                      var11 = -var8 + param4;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_c.write(var11, var8, 18017, param2);
                      var8 = var8 + var11;
                    } else {
                      ProgressMessageDialog.field_yb[1] = (byte)param0;
                      ProgressMessageDialog.field_yb[0] = (byte)(param0 >> 8);
                      ProgressMessageDialog.field_yb[2] = (byte)(var9 >> 8);
                      ProgressMessageDialog.field_yb[6] = (byte)var10;
                      ProgressMessageDialog.field_yb[4] = (byte)(var10 >> 16);
                      ProgressMessageDialog.field_yb[5] = (byte)(var10 >> 8);
                      ProgressMessageDialog.field_yb[7] = (byte)this.field_a;
                      ProgressMessageDialog.field_yb[3] = (byte)var9;
                      this.field_c.seek((long)(520 * var7_int), (byte) -63);
                      this.field_c.write(8, 0, 18017, ProgressMessageDialog.field_yb);
                      var11 = -var8 + param4;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_c.write(var11, var8, param1 + 18032, param2);
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
            stackIn_76_0 = var6_ref;
            stackIn_76_1 = new StringBuilder().append("ik.E(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_77_2 = "null";
            } else {
              stackIn_77_2 = "{...}";
            }
            throw ie.wrapClientException((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    SectorCacheStore(int param0, BufferedRandomAccessFile param1, BufferedRandomAccessFile param2, int param3) {
        this.field_e = 65000;
        this.field_c = null;
        this.field_g = null;
        try {
          this.field_e = param3;
          this.field_c = param1;
          this.field_g = param2;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "ik.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -106) {
            stackIn_6_0 = (null != pa.a(param0, (byte) 67));
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ik.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = new bb();
        field_h = "Medium";
    }
}
