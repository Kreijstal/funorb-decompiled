/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SectorCacheStore {
    static String field_i;
    private BufferedFile field_j;
    private int field_k;
    private int field_e;
    private BufferedFile field_d;
    static String[] field_g;
    static int field_f;
    static int[] field_c;
    static int[] field_b;
    static String field_a;
    static String tutorial2;

    public static void releaseStatics(int param0) {
        field_a = null;
        tutorial2 = null;
        field_g = null;
        field_b = null;
        if (param0 != 3) {
          field_b = (int[]) null;
        }
        field_i = null;
        field_c = null;
    }

    final static int measureText(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1492912648) {
            SectorCacheStore.releaseStatics(123);
          }
          if (!param1) {
            stackIn_6_0 = NodeHashTableIterator.field_h.textWidth(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = LinkTextPainter.field_g.textWidth(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gl.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final boolean writeSectors(byte[] param0, int param1, int param2, int param3, boolean param4) {
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
          int var14 = 0;
          EOFException var15 = null;
          int var17 = 0;
          var17 = Virogrid.field_F ? 1 : 0;
          try {
            var6 = this.field_d;
            synchronized (var6) {
              try {
                if (param4) {
                  if (this.field_j.getLength((byte) 125) < (long)(param3 * 6 + 6)) {
                    return false;
                  }
                  this.field_j.seek((long)(param3 * 6), 0);
                  this.field_j.read(0, 6, TextMeasureHelpers.field_c, (byte) 123);
                  var7_int = (TextMeasureHelpers.field_c[4] << 8 & 65280) + ((255 & TextMeasureHelpers.field_c[3]) << 16) + (255 & TextMeasureHelpers.field_c[5]);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_d.getLength((byte) 126) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_d.getLength((byte) 127)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                TextMeasureHelpers.field_c[4] = (byte)(var7_int >> 8);
                TextMeasureHelpers.field_c[0] = (byte)(param1 >> 16);
                TextMeasureHelpers.field_c[1] = (byte)(param1 >> 8);
                TextMeasureHelpers.field_c[3] = (byte)(var7_int >> 16);
                TextMeasureHelpers.field_c[2] = (byte)param1;
                var8 = -52 % ((54 - param2) / 61);
                TextMeasureHelpers.field_c[5] = (byte)var7_int;
                this.field_j.seek((long)(6 * param3), 0);
                this.field_j.write(0, TextMeasureHelpers.field_c, 6, 0);
                var9 = 0;
                var10 = 0;
                scanLoop1: while (true) {
                  if (var9 < param1) {
                    boolean decompiledFrameRemainder0 = true;
                    var11 = 0;
                    if (param4) {
                      this.field_d.seek((long)(520 * var7_int), 0);
                      if (65535 >= param3) {
                        try {
                          this.field_d.read(0, 8, TextMeasureHelpers.field_c, (byte) 127);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break scanLoop1;
                        }
                        var11 = (65280 & TextMeasureHelpers.field_c[5] << 8) + (((TextMeasureHelpers.field_c[4] & 255) << 16) + (TextMeasureHelpers.field_c[6] & 255));
                        var12 = (255 & TextMeasureHelpers.field_c[1]) + (TextMeasureHelpers.field_c[0] << 8 & 65280);
                        var14 = TextMeasureHelpers.field_c[7] & 255;
                        var13 = ((255 & TextMeasureHelpers.field_c[2]) << 8) + (TextMeasureHelpers.field_c[3] & 255);
                      } else {
                        try {
                          this.field_d.read(0, 10, TextMeasureHelpers.field_c, (byte) 127);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break scanLoop1;
                        }
                        var13 = (255 & TextMeasureHelpers.field_c[5]) + ((TextMeasureHelpers.field_c[4] & 255) << 8);
                        var11 = (TextMeasureHelpers.field_c[6] << 16 & 16711680) + (TextMeasureHelpers.field_c[7] << 8 & 65280) + (TextMeasureHelpers.field_c[8] & 255);
                        var12 = (255 & TextMeasureHelpers.field_c[3]) + (((255 & TextMeasureHelpers.field_c[2]) << 8) + (TextMeasureHelpers.field_c[0] << 24 & -16777216)) + ((TextMeasureHelpers.field_c[1] & 255) << 16);
                        var14 = 255 & TextMeasureHelpers.field_c[9];
                      }
                      if ((param3 == var12 &&
                        var10 == var13 &&
                        var14 == this.field_e) &&
                        (decompiledFrameRemainder0 = (!(var11 >= 0) ||
                        !((long)var11 <= this.field_d.getLength((byte) 125) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var11 == 0) {
                      var11 = (int)((this.field_d.getLength((byte) 127) + 519L) / 520L);
                      param4 = false;
                      if (var11 == 0) {
                        var11++;
                      }
                      if (var7_int == var11) {
                        var11++;
                      }
                    }
                    if (param1 - var9 <= 512) {
                      var11 = 0;
                    }
                    if (param3 <= 65535) {
                      TextMeasureHelpers.field_c[6] = (byte)var11;
                      TextMeasureHelpers.field_c[7] = (byte)this.field_e;
                      TextMeasureHelpers.field_c[2] = (byte)(var10 >> 8);
                      TextMeasureHelpers.field_c[5] = (byte)(var11 >> 8);
                      TextMeasureHelpers.field_c[3] = (byte)var10;
                      TextMeasureHelpers.field_c[4] = (byte)(var11 >> 16);
                      TextMeasureHelpers.field_c[1] = (byte)param3;
                      TextMeasureHelpers.field_c[0] = (byte)(param3 >> 8);
                      this.field_d.seek((long)(var7_int * 520), 0);
                      this.field_d.write(0, TextMeasureHelpers.field_c, 8, 0);
                      var12 = -var9 + param1;
                      if (var12 > 512) {
                        var12 = 512;
                      }
                      this.field_d.write(var9, param0, var12, 0);
                      var9 = var9 + var12;
                    } else {
                      TextMeasureHelpers.field_c[5] = (byte)var10;
                      TextMeasureHelpers.field_c[0] = (byte)(param3 >> 24);
                      TextMeasureHelpers.field_c[9] = (byte)this.field_e;
                      TextMeasureHelpers.field_c[7] = (byte)(var11 >> 8);
                      TextMeasureHelpers.field_c[4] = (byte)(var10 >> 8);
                      TextMeasureHelpers.field_c[3] = (byte)param3;
                      TextMeasureHelpers.field_c[8] = (byte)var11;
                      TextMeasureHelpers.field_c[6] = (byte)(var11 >> 16);
                      TextMeasureHelpers.field_c[2] = (byte)(param3 >> 8);
                      TextMeasureHelpers.field_c[1] = (byte)(param3 >> 16);
                      this.field_d.seek((long)(var7_int * 520), 0);
                      this.field_d.write(0, TextMeasureHelpers.field_c, 10, 0);
                      var12 = -var9 + param1;
                      if (var12 > 510) {
                        var12 = 510;
                      }
                      this.field_d.write(var9, param0, var12, 0);
                      var9 = var9 + var12;
                    }
                    var10++;
                    var7_int = var11;
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
            stackIn_69_1 = new StringBuilder().append("gl.A(");
            if (param0 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void sendQueuedRequest(RankingsRequest param0, byte param1, int param2) {
        CipherPacketBuffer var3 = null;
        try {
          var3 = IterableNodeHashTable.field_g;
          var3.writeCipheredOpcode(param2, 8);
          int var4 = -12 % ((0 - param1) / 43);
          var3.writeByte(param0.field_i, 58);
          var3.writeByte(param0.field_g, 126);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "gl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        return "" + this.field_e;
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
          String var19 = null;
          Object stackIn_11_0 = null;
          Object stackIn_17_0 = null;
          Object stackIn_44_0 = null;
          byte[] stackIn_51_0 = null;
          Object stackIn_54_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = Virogrid.field_F ? 1 : 0;
          var3_ref = this.field_d;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + param0 * 6) > this.field_j.getLength((byte) 127)) {
                return null;
              }
              this.field_j.seek((long)(6 * param0), 0);
              this.field_j.read(0, 6, TextMeasureHelpers.field_c, (byte) 123);
              if (param1 >= -33) {
                var19 = (String) null;
                SectorCacheStore.measureText(-48, false, (String) null);
              }
              var4_int = ((255 & TextMeasureHelpers.field_c[1]) << 8) + ((16711680 & TextMeasureHelpers.field_c[0] << 16) + (TextMeasureHelpers.field_c[2] & 255));
              var5 = (TextMeasureHelpers.field_c[3] << 16 & 16711680) + ((255 & TextMeasureHelpers.field_c[4]) << 8) + (TextMeasureHelpers.field_c[5] & 255);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_k) {
                stackIn_11_0 = null;
                return (byte[]) (stackIn_11_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((this.field_d.getLength((byte) 127) / 520L) < (long)var5) {
                stackIn_17_0 = null;
                return (byte[]) (stackIn_17_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  return null;
                }
                this.field_d.seek((long)(520 * var5), 0);
                var9 = var4_int - var7;
                if (param0 > 65535) {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_d.read(0, var9 + var14, TextMeasureHelpers.field_c, (byte) 127);
                  var11 = (255 & TextMeasureHelpers.field_c[5]) + (65280 & TextMeasureHelpers.field_c[4] << 8);
                  var10 = ((TextMeasureHelpers.field_c[2] & 255) << 8) + (TextMeasureHelpers.field_c[0] << 24 & -16777216) + ((255 & TextMeasureHelpers.field_c[1]) << 16) + (255 & TextMeasureHelpers.field_c[3]);
                  var12 = ((255 & TextMeasureHelpers.field_c[6]) << 16) - (-((TextMeasureHelpers.field_c[7] & 255) << 8) - (255 & TextMeasureHelpers.field_c[8]));
                  var13 = 255 & TextMeasureHelpers.field_c[9];
                } else {
                  var14 = 8;
                  if (512 < var9) {
                    var9 = 512;
                  }
                  this.field_d.read(0, var14 + var9, TextMeasureHelpers.field_c, (byte) 125);
                  var10 = (TextMeasureHelpers.field_c[1] & 255) + ((255 & TextMeasureHelpers.field_c[0]) << 8);
                  var12 = (255 & TextMeasureHelpers.field_c[6]) + ((255 & TextMeasureHelpers.field_c[4]) << 16) + ((TextMeasureHelpers.field_c[5] & 255) << 8);
                  var13 = 255 & TextMeasureHelpers.field_c[7];
                  var11 = ((255 & TextMeasureHelpers.field_c[2]) << 8) + (255 & TextMeasureHelpers.field_c[3]);
                }
                if (var10 != param0) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (var13 != this.field_e) {
                  return null;
                }
                if (0 > var12) {
                  return null;
                }
                if ((long)var12 > (this.field_d.getLength((byte) 127) / 520L)) {
                  stackIn_44_0 = null;
                  return (byte[]) (stackIn_44_0);
                }
                var15 = var9 + var14;
                var8++;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = TextMeasureHelpers.field_c[var16];
                }
                var5 = var12;
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

    final boolean write(byte[] param0, int param1, int param2, byte param3) {
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
          var5 = this.field_d;
          synchronized (var5) {
            if (param2 >= 0 &&
              param2 <= this.field_k) {
              if (param3 >= -43) {
                var8 = (byte[]) null;
                this.write((byte[]) null, 80, 22, (byte) -103);
              }
              var6 = this.writeSectors(param0, param2, 116, param1, true) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.writeSectors(param0, param2, 119, param1, false) ? 1 : 0;
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
          stackIn_15_1 = new StringBuilder().append("gl.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    SectorCacheStore(int param0, BufferedFile param1, BufferedFile param2, int param3) {
        this.field_k = 65000;
        this.field_j = null;
        this.field_d = null;
        try {
          this.field_k = param3;
          this.field_d = param1;
          this.field_e = param0;
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "gl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_g = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_f = -1;
        field_i = "Unpacking models";
        field_a = "Waiting for extra data";
        field_b = new int[8192];
        tutorial2 = "Move one space to clone<br>or two spaces to jump";
    }
}
