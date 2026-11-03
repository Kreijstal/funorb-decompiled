/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    private int groupCount;
    static int field_s;
    int field_o;
    int[] field_k;
    static Boolean field_j;
    int revision;
    private int[][] fileNameHashes;
    static SceneWidget field_l;
    private int[] groupNameHashes;
    int groupCapacity;
    int[] groupVersions;
    int[][] fileIds;
    int[] fileCounts;
    private byte[] field_e;
    ap[] fileNameLookups;
    int[] field_i;
    int[] groupIds;
    byte[][] groupDigests;
    ap groupNameLookup;

    public static void b(int param0) {
        if (param0 <= 47) {
          return;
        }
        field_j = null;
        field_l = null;
    }

    final static void a(int param0) {
        LobbyPlayer var3 = null;
        int var2 = Pixelate.field_H ? 1 : 0;
        try {
          TriangleMesh.field_r = false;
          io.field_c = null;
          DraggableWidget.field_S = null;
          if (null != ImageProducerRasterBuffer.field_n) {
            ImageProducerRasterBuffer.field_n.e(-123);
            ImageProducerRasterBuffer.field_n = null;
          }
          if (param0 != 23949) {
            field_s = 72;
          }
          il.field_d = null;
          if (null != nk.field_a) {
            nk.field_a.e(117);
            nk.field_a = null;
          }
          dg.field_f = null;
          if (null != ClientContextMenu.field_a) {
            ClientContextMenu.field_a.e(126);
            ClientContextMenu.field_a = null;
          }
          SocketConnector.field_f = null;
          if (il.field_d != null) {
            var3 = (LobbyPlayer) (il.field_d.a(-109));
            while (var3 != null) {
              var3.e(17);
              var3 = (LobbyPlayer) (il.field_d.a((byte) 50));
            }
            il.field_d = null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "kj.C(" + param0 + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          if ((param0 <= 0 ||
            param0 >= 128) &&
            (param0 < 160 ||
            param0 > 255)) {
            if (param1 < 89) {
              field_j = (Boolean) null;
            }
            if (param0 == 0) {
              return false;
            }
            var6 = ArrayWidgetContainer.field_I;
            var2 = var6;
            var3 = 0;
            while (true) {
              if (var6.length <= var3) {
                return false;
              }
              var4 = var6[var3];
              if (var4 != param0) {
                var3++;
                continue;
              }
              break;
            }
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "kj.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void decode(int param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        PacketBuffer var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = Pixelate.field_H ? 1 : 0;
        try {
          var17 = new PacketBuffer(la.a(param1, 0));
          var4 = var17.f(255);
          if (5 <= var4 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.revision = var17.readInt(0);
            } else {
              this.revision = 0;
            }
            var5 = var17.f(255);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 >= 7) {
              this.groupCount = var17.i(9997);
            } else {
              this.groupCount = var17.a((byte) -119);
            }
            stackIn_17_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            var9 = -1;
            this.groupIds = new int[this.groupCount];
            if (var4 < 7) {
              for (var10 = 0; this.groupCount > var10; var10++) {
                dupTemp$0 = var8 + var17.a((byte) -111);
                var8 = dupTemp$0;
                this.groupIds[var10] = dupTemp$0;
                if (this.groupIds[var10] > var9) {
                  var9 = this.groupIds[var10];
                }
              }
            } else {
              for (var10 = 0; this.groupCount > var10; var10++) {
                dupTemp$1 = var8 + var17.i(9997);
                var8 = dupTemp$1;
                this.groupIds[var10] = dupTemp$1;
                if (var9 < this.groupIds[var10]) {
                  var9 = this.groupIds[var10];
                }
              }
            }
            this.groupCapacity = 1 + var9;
            this.fileCounts = new int[this.groupCapacity];
            if (var7 != 0) {
              this.groupDigests = new byte[this.groupCapacity][];
            }
            this.groupVersions = new int[this.groupCapacity];
            this.fileIds = new int[this.groupCapacity][];
            this.field_k = new int[this.groupCapacity];
            this.field_i = new int[this.groupCapacity];
            if (var6 != 0) {
              this.groupNameHashes = new int[this.groupCapacity];
              for (var10Lifetime1 = 0; this.groupCapacity > var10Lifetime1; var10Lifetime1++) {
                this.groupNameHashes[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.groupCount; var10Lifetime1Lifetime1++) {
                this.groupNameHashes[this.groupIds[var10Lifetime1Lifetime1]] = var17.readInt(0);
              }
              this.groupNameLookup = new ap(this.groupNameHashes);
            }
            for (var10Lifetime2 = 0; this.groupCount > var10Lifetime2; var10Lifetime2++) {
              this.field_k[this.groupIds[var10Lifetime2]] = var17.readInt(0);
            }
            var11 = -79 % ((param0 - 0) / 44);
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.groupCount > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(var21, 0, -128, 64);
                this.groupDigests[this.groupIds[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; this.groupCount > var10Lifetime4; var10Lifetime4++) {
              this.groupVersions[this.groupIds[var10Lifetime4]] = var17.readInt(0);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; this.groupCount > var10Lifetime5; var10Lifetime5++) {
                this.fileCounts[this.groupIds[var10Lifetime5]] = var17.i(9997);
              }
              for (var10Lifetime5 = 0; this.groupCount > var10Lifetime5; var10Lifetime5++) {
                var11Lifetime1 = this.groupIds[var10Lifetime5];
                var12 = this.fileCounts[var11Lifetime1];
                var8Lifetime1 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.fileIds[var11Lifetime1] = array$2;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.i(9997);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.fileIds[var11Lifetime1];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_i[var11Lifetime1] = 1 + var13;
                if (1 + var13 == var12) {
                  this.fileIds[var11Lifetime1] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; this.groupCount > var10Lifetime5; var10Lifetime5++) {
                this.fileCounts[this.groupIds[var10Lifetime5]] = var17.a((byte) -123);
              }
              for (var10Lifetime5 = 0; this.groupCount > var10Lifetime5; var10Lifetime5++) {
                var11Lifetime1 = this.groupIds[var10Lifetime5];
                var12 = this.fileCounts[var11Lifetime1];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.fileIds[var11Lifetime1] = array$5;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.a((byte) -119);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.fileIds[var11Lifetime1];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_i[var11Lifetime1] = var13 + 1;
                if (1 + var13 == var12) {
                  this.fileIds[var11Lifetime1] = null;
                }
              }
            }
            if (var6 != 0) {
              this.fileNameHashes = new int[var9 + 1][];
              this.fileNameLookups = new ap[var9 + 1];
              for (var10Lifetime6 = 0; this.groupCount > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime2 = this.groupIds[var10Lifetime6];
                var12Lifetime1 = this.fileCounts[var11Lifetime2];
                array$8 = new int[this.field_i[var11Lifetime2]];
                this.fileNameHashes[var11Lifetime2] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_i[var11Lifetime2]; var13Lifetime1++) {
                  this.fileNameHashes[var11Lifetime2][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.fileIds[var11Lifetime2] != null) {
                    var14Lifetime1 = this.fileIds[var11Lifetime2][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.fileNameHashes[var11Lifetime2][var14Lifetime1] = var17.readInt(0);
                }
                this.fileNameLookups[var11Lifetime2] = new ap(this.fileNameHashes[var11Lifetime2]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = var3;
          stackIn_100_1 = new StringBuilder().append("kj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        DateOfBirthValidator.field_j = 1;
        un.field_j = gd.field_e[param0];
        un.field_j.b(false);
        if (param1 < 124) {
          Sprite var3 = (Sprite) null;
          ArchiveIndex.a(-60, (Sprite) null, 85, -59, 28, 57);
        }
    }

    final static void a(int param0, Sprite param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        var21 = Pixelate.field_H ? 1 : 0;
        try {
          var6_int = -91 % ((param3 - 37) / 51);
          var7 = (-param5 + param0 << 8) / param1.field_A;
          param4 = param4 + param1.field_y;
          param2 = param2 + param1.field_D;
          var8 = (param5 << 8) + param1.field_D * var7;
          var9 = param2 + param4 * SoftwareRasterizer.field_j;
          var10 = 0;
          var11 = param1.field_E;
          var12 = param1.field_F;
          var13 = -var12 + SoftwareRasterizer.field_j;
          var14 = 0;
          if (SoftwareRasterizer.field_f > param4) {
            var15 = -param4 + SoftwareRasterizer.field_f;
            var9 = var9 + SoftwareRasterizer.field_j * var15;
            var11 = var11 - var15;
            var10 = var10 + var15 * var12;
            param4 = SoftwareRasterizer.field_f;
          }
          if (param4 + var11 > SoftwareRasterizer.field_a) {
            var11 = var11 - (var11 + (param4 - SoftwareRasterizer.field_a));
          }
          if (SoftwareRasterizer.field_e > param2) {
            var15Lifetime1 = -param2 + SoftwareRasterizer.field_e;
            var10 = var10 + var15Lifetime1;
            var13 = var13 + var15Lifetime1;
            var9 = var9 + var15Lifetime1;
            var8 = var8 + var7 * var15Lifetime1;
            var12 = var12 - var15Lifetime1;
            param2 = SoftwareRasterizer.field_e;
            var14 = var14 + var15Lifetime1;
          }
          if (SoftwareRasterizer.field_h < var12 + param2) {
            var15Lifetime2 = param2 + (var12 - SoftwareRasterizer.field_h);
            var13 = var13 + var15Lifetime2;
            var14 = var14 + var15Lifetime2;
            var12 = var12 - var15Lifetime2;
          }
          if (var12 > 0 &&
            var11 > 0) {
            for (param4 = -var11; 0 > param4; param4++) {
              var15Lifetime3 = var8;
              for (param2 = -var12; 0 > param2; param2++) {
                var16 = var15Lifetime3 >> 8;
                var17 = -var16 + 256;
                var15Lifetime3 = var15Lifetime3 + var7;
                if (var16 < 0) {
                  var9++;
                  var10++;
                } else {
                  incrementValue$0 = var10;
                  var10++;
                  var18 = param1.field_G[incrementValue$0];
                  if (var18 != 0) {
                    if (var16 > 255) {
                      SoftwareRasterizer.field_k[var9] = var18;
                    } else {
                      var19 = SoftwareRasterizer.field_k[var9];
                      var20 = 16711935 & (var19 & 16711935) * var17 + (16711935 & var18) * var16 >> 8;
                      SoftwareRasterizer.field_k[var9] = var20 + (cm.a(var17 * cm.a(65280, var19) + var16 * cm.a(65280, var18), 16711874) >> 8);
                    }
                  }
                  var9++;
                }
              }
              var9 = var9 + var13;
              var10 = var10 + var14;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("kj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    ArchiveIndex(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_o = wg.a(param0, 125, param0.length);
          if (param1 != this.field_o) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_e = TextHotspotWidget.a(param0, 0, 1761872464, param0.length);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_e[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.decode(-89, param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
