/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SectorCacheStore {
    private int storeId;
    static int[][] field_c;
    private BufferedRandomAccessFile dataFile;
    private int maximumLength;
    private BufferedRandomAccessFile indexFile;

    final static void refreshMembershipMenu(byte guard) {
        MainMenuScreen var1 = AlternateUsernameCredentials.field_q;
        if (var1.members &&
          UiContainer.hasMembership((byte) -39)) {
          return;
        }
        if (var1.members) {
          AlternateUsernameCredentials.field_q = new MainMenuScreen();
          if (guard <= 117) {
            SectorCacheStore.releaseStatics(true);
          }
          LoginHandshakeSupport.field_d = 0;
          GameplaySession.resetSessionMenuState((byte) -9);
          return;
        }
        if (UiContainer.hasMembership((byte) 97)) {
          AlternateUsernameCredentials.field_q = new MainMenuScreen();
          if (guard <= 117) {
            SectorCacheStore.releaseStatics(true);
          }
          LoginHandshakeSupport.field_d = 0;
          GameplaySession.resetSessionMenuState((byte) -9);
          return;
        }
    }

    final static int validLevelIndex(int gameMode, int guard, int levelIndex) {
        int var3 = SpriteFactorySupport.levelCount(false, gameMode);
        if (levelIndex < -1) {
          return -1;
        }
        if (var3 > levelIndex) {
          if (guard != 13565) {
            SectorCacheStore.validLevelIndex(-18, -9, 48);
          }
          return levelIndex;
        }
        return -1;
    }

    final byte[] read(int groupId, int guard) {
        try {
          Object var3 = null;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var18 = EscapeVector.obfuscationControl;
          Object var3_ref = this.dataFile;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + groupId * 6) > this.indexFile.length(guard ^ 22554)) {
                return null;
              }
              this.indexFile.seek(guard - 26296, (long)(6 * groupId));
              this.indexFile.readFully(0, 6, (byte) 101, Checkbox.field_G);
              int var4_int = (Checkbox.field_G[2] & 255) + ((65280 & Checkbox.field_G[1] << 8) + (16711680 & Checkbox.field_G[0] << 16));
              int var5 = ((255 & Checkbox.field_G[3]) << 16) + (Checkbox.field_G[4] << 8 & 65280) + (Checkbox.field_G[5] & 255);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.maximumLength) {
                Object stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if (this.dataFile.length(16034) / 520L < (long)var5) {
                Object stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              if (guard != 26296) {
                this.toString();
              }
              byte[] var6 = new byte[var4_int];
              int var7 = 0;
              int var8 = 0;
              while (var7 < var4_int) {
                if (0 == var5) {
                  Object stackIn_23_0 = null;
                  return (byte[]) (stackIn_23_0);
                }
                this.dataFile.seek(guard ^ 26296, (long)(520 * var5));
                int var9 = var4_int - var7;
                if (groupId > 65535) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.dataFile.readFully(0, var9 + var14, (byte) 101, Checkbox.field_G);
                  var13 = Checkbox.field_G[9] & 255;
                  var12 = (255 & Checkbox.field_G[8]) + (Checkbox.field_G[6] << 16 & 16711680) + ((255 & Checkbox.field_G[7]) << 8);
                  var11 = (255 & Checkbox.field_G[5]) + ((255 & Checkbox.field_G[4]) << 8);
                  var10 = ((255 & Checkbox.field_G[1]) << 16) + ((Checkbox.field_G[0] & 255) << 24) + (((255 & Checkbox.field_G[2]) << 8) + (255 & Checkbox.field_G[3]));
                } else {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.dataFile.readFully(0, var9 + var14, (byte) 101, Checkbox.field_G);
                  var12 = (255 & Checkbox.field_G[6]) + ((16711680 & Checkbox.field_G[4] << 16) + ((255 & Checkbox.field_G[5]) << 8));
                  var11 = (Checkbox.field_G[3] & 255) + (Checkbox.field_G[2] << 8 & 65280);
                  var10 = (65280 & Checkbox.field_G[0] << 8) + (255 & Checkbox.field_G[1]);
                  var13 = Checkbox.field_G[7] & 255;
                }
                if (groupId != var10) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (this.storeId != var13) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > (this.dataFile.length(16034) / 520L)) {
                  Object stackIn_44_0 = null;
                  return (byte[]) (stackIn_44_0);
                }
                int var15 = var9 + var14;
                var8++;
                var5 = var12;
                for (int var16 = var14; var15 > var16; var16++) {
                  int incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = Checkbox.field_G[var16];
                }
              }
              byte[] stackIn_50_0 = var6;
              return stackIn_50_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              Throwable decompiledCaughtException = decompiledCaughtParameter0;
              IOException var4 = (IOException) (Object) decompiledCaughtException;
              Object stackIn_53_0 = null;
              return (byte[]) (stackIn_53_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean write(byte guard, int groupId, int length, byte[] data) {
        Throwable var7 = null;
        boolean stackIn_10_0 = false;
        String stackIn_16_2 = null;
        try {
          Object var5 = this.dataFile;
          synchronized (var5) {
            if (length >= 0 &&
              this.maximumLength >= length) {
              if (guard != 18) {
                this.storeId = -93;
              }
              boolean var6 = (this.writeSectors(512, groupId, data, length, true));
              if (!var6) {
                var6 = (this.writeSectors(guard ^ 530, groupId, data, length, false));
              }
              stackIn_10_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5_ref;
          StringBuilder stackIn_15_1 = new StringBuilder().append("jg.F(").append(guard).append(',').append(groupId).append(',').append(length).append(',');
          if (data == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean guard) {
        if (!guard) {
          return;
        }
        field_c = (int[][]) null;
    }

    public final String toString() {
        return "" + this.storeId;
    }

    private final boolean writeSectors(int guard, int groupId, byte[] data, int length, boolean reuseExisting) {
        try {
          String stackIn_70_2 = null;
          boolean decompiledRegionSelector0 = false;
          boolean decompiledRegionSelector1 = false;
          Throwable decompiledCaughtException = null;
          int var7_int = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          EOFException var14 = null;
          int var16 = EscapeVector.obfuscationControl;
          try {
            Object var6 = this.dataFile;
            synchronized (var6) {
              try {
                if (reuseExisting) {
                  if ((long)(6 * groupId + 6) > this.indexFile.length(16034)) {
                    return false;
                  }
                  this.indexFile.seek(guard - 512, (long)(groupId * 6));
                  this.indexFile.readFully(0, 6, (byte) 101, Checkbox.field_G);
                  var7_int = (Checkbox.field_G[5] & 255) + (((255 & Checkbox.field_G[3]) << 16) + ((Checkbox.field_G[4] & 255) << 8));
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.dataFile.length(guard + 15522) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.dataFile.length(16034)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                Checkbox.field_G[4] = (byte)(var7_int >> 8);
                Checkbox.field_G[5] = (byte)var7_int;
                Checkbox.field_G[1] = (byte)(length >> 8);
                Checkbox.field_G[0] = (byte)(length >> 16);
                Checkbox.field_G[3] = (byte)(var7_int >> 16);
                Checkbox.field_G[2] = (byte)length;
                if (guard != 512) {
                  this.read(21, -91);
                }
                this.indexFile.seek(0, (long)(groupId * 6));
                this.indexFile.write(true, 0, Checkbox.field_G, 6);
                int var8 = 0;
                int var9 = 0;
                scanLoop1: while (true) {
                  if (var8 < length) {
                    boolean decompiledFrameRemainder0 = true;
                    int var10 = 0;
                    if (reuseExisting) {
                      this.dataFile.seek(0, (long)(var7_int * 520));
                      if (groupId > 65535) {
                        try {
                          this.dataFile.readFully(0, 10, (byte) 101, Checkbox.field_G);
                          decompiledRegionSelector0 = false;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = true;
                        }
                        if (decompiledRegionSelector0) {
                          break scanLoop1;
                        }
                        var11 = (Checkbox.field_G[1] << 16 & 16711680) + ((Checkbox.field_G[0] << 24 & -16777216) + ((Checkbox.field_G[2] & 255) << 8) + (Checkbox.field_G[3] & 255));
                        var12 = ((Checkbox.field_G[4] & 255) << 8) + (Checkbox.field_G[5] & 255);
                        var10 = ((255 & Checkbox.field_G[7]) << 8) + ((Checkbox.field_G[6] << 16 & 16711680) + (255 & Checkbox.field_G[8]));
                        var13 = 255 & Checkbox.field_G[9];
                      } else {
                        try {
                          this.dataFile.readFully(0, 8, (byte) 101, Checkbox.field_G);
                          decompiledRegionSelector1 = false;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = true;
                        }
                        if (decompiledRegionSelector1) {
                          break scanLoop1;
                        }
                        var13 = 255 & Checkbox.field_G[7];
                        var12 = (255 & Checkbox.field_G[3]) + (Checkbox.field_G[2] << 8 & 65280);
                        var11 = (255 & Checkbox.field_G[1]) + (Checkbox.field_G[0] << 8 & 65280);
                        var10 = (Checkbox.field_G[6] & 255) + (16711680 & Checkbox.field_G[4] << 16) + (Checkbox.field_G[5] << 8 & 65280);
                      }
                      if (var11 == groupId &&
                        var12 == var9 &&
                        this.storeId == var13 &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= this.dataFile.length(16034) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      var10 = (int)((519L + this.dataFile.length(guard + 15522)) / 520L);
                      reuseExisting = false;
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (-var8 + length <= 512) {
                      var10 = 0;
                    }
                    if (groupId <= 65535) {
                      Checkbox.field_G[6] = (byte)var10;
                      Checkbox.field_G[5] = (byte)(var10 >> 8);
                      Checkbox.field_G[7] = (byte)this.storeId;
                      Checkbox.field_G[0] = (byte)(groupId >> 8);
                      Checkbox.field_G[3] = (byte)var9;
                      Checkbox.field_G[4] = (byte)(var10 >> 16);
                      Checkbox.field_G[1] = (byte)groupId;
                      Checkbox.field_G[2] = (byte)(var9 >> 8);
                      this.dataFile.seek(0, (long)(520 * var7_int));
                      this.dataFile.write(true, 0, Checkbox.field_G, 8);
                      var11 = -var8 + length;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.dataFile.write(true, var8, data, var11);
                      var8 = var8 + var11;
                    } else {
                      Checkbox.field_G[9] = (byte)this.storeId;
                      Checkbox.field_G[6] = (byte)(var10 >> 16);
                      Checkbox.field_G[3] = (byte)groupId;
                      Checkbox.field_G[5] = (byte)var9;
                      Checkbox.field_G[2] = (byte)(groupId >> 8);
                      Checkbox.field_G[7] = (byte)(var10 >> 8);
                      Checkbox.field_G[8] = (byte)var10;
                      Checkbox.field_G[0] = (byte)(groupId >> 24);
                      Checkbox.field_G[4] = (byte)(var9 >> 8);
                      Checkbox.field_G[1] = (byte)(groupId >> 16);
                      this.dataFile.seek(guard - 512, (long)(520 * var7_int));
                      this.dataFile.write(true, 0, Checkbox.field_G, 10);
                      var11 = length - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.dataFile.write(true, var8, data, var11);
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
                IOException var7 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            RuntimeException var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_69_0 = var6_ref;
            StringBuilder stackIn_69_1 = new StringBuilder().append("jg.A(").append(guard).append(',').append(groupId).append(',');
            if (data == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(length).append(',').append(reuseExisting).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String formatCompactStackTrace(Throwable failure, int guard) throws IOException {
        String var2;
        String var11Lifetime5Lifetime2;
        int var13 = EscapeVector.obfuscationControl;
        if (!(failure instanceof ClientException)) {
          var2 = "";
          String var11 = var2;
          var2 = var11;
          String var11Lifetime6 = var2;
        } else {
          ClientException var14 = (ClientException) ((Object) failure);
          failure = var14.cause;
          var2 = var14.context + " | ";
        }
        StringWriter var15 = new StringWriter();
        PrintWriter var4 = new PrintWriter((Writer) ((Object) var15));
        if (guard != 41) {
          SectorCacheStore.releaseStatics(true);
        }
        failure.printStackTrace(var4);
        var4.close();
        String var5 = var15.toString();
        String var11Lifetime1 = var5;
        String var2Lifetime1 = var11Lifetime1;
        String var11Lifetime2 = var5;
        BufferedReader var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        String var7 = var6.readLine();
        String var11Lifetime3 = var7;
        String var2Lifetime2 = var11Lifetime3;
        String var11Lifetime4 = var7;
        while (true) {
          String var8 = var6.readLine();
          String var11Lifetime5 = var8;
          String var2Lifetime3 = var11Lifetime5;
          String var11Lifetime5Lifetime1 = var8;
          if (var8 == null) {
            var2Lifetime3 = var2Lifetime3 + "| " + var7;
            return var2Lifetime3;
          }
          int var9 = var8.indexOf('(');
          int var10 = var8.indexOf(')', 1 + var9);
          if (var9 == -1) {
            var11Lifetime5Lifetime2 = var8;
            String var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
          } else {
            var11Lifetime5Lifetime2 = var8.substring(0, var9);
          }
          String var16 = var11Lifetime5Lifetime2.trim();
          String var2Lifetime3Lifetime2 = var16;
          String var2Lifetime3Lifetime3 = var16;
          String var17 = var16.substring(1 + var16.lastIndexOf(' '));
          String var2Lifetime3Lifetime4 = var17;
          String var2Lifetime3Lifetime5 = var17;
          String var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          String var2Lifetime3Lifetime6 = var18;
          String var2Lifetime3Lifetime7 = var18;
          String var19 = var2Lifetime3Lifetime7 + var18;
          String var2Lifetime3Lifetime8 = var19;
          String var2Lifetime3Lifetime9 = var19;
          String var2Lifetime3Lifetime10 = var19;
          if (var9 != -1) {
            if (-1 == var10) {
              var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
              continue;
            }
            int var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime10 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
        }
    }

    SectorCacheStore(int storeId, BufferedRandomAccessFile dataFile, BufferedRandomAccessFile indexFile, int maximumLength) {
        this.maximumLength = 65000;
        this.indexFile = null;
        this.dataFile = null;
        try {
          this.indexFile = indexFile;
          this.storeId = storeId;
          this.maximumLength = maximumLength;
          this.dataFile = dataFile;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "jg.<init>(" + storeId + ',' + (dataFile != null ? "{...}" : "null") + ',' + (indexFile != null ? "{...}" : "null") + ',' + maximumLength + ')');
        }
    }

    static {
    }
}
