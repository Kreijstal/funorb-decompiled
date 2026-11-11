/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    int field_d;
    int field_l;
    int[] field_f;
    private int[][] field_m;
    int[] field_k;
    IntIntHashTable[] field_e;
    IntIntHashTable field_b;
    int[][] field_n;
    private int field_o;
    int[] field_p;
    int[] field_c;
    int[] field_j;
    private byte[] field_i;
    private int[] field_g;
    int field_a;
    byte[][] field_h;

    private final void decodeIndex(int param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
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
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          var17 = new PacketBuffer(RotaterMountComponent.decompressContainer(param1, -106));
          if (param0 != -23918) {
            return;
          }
          var4 = var17.readUnsignedByte(255);
          if (5 <= var4 &&
            var4 <= 7) {
            if (6 <= var4) {
              this.field_a = var17.readInt(param0 ^ 23871);
            } else {
              this.field_a = 0;
            }
            var5 = var17.readUnsignedByte(255);
            stackIn_13_0 = (0 == (1 & var5)) ? 0 : 1;
            var6 = stackIn_13_0;
            stackIn_16_0 = (0 == (2 & var5)) ? 0 : 1;
            var7 = stackIn_16_0;
            if (var4 < 7) {
              this.field_o = var17.readUnsignedShort(127);
            } else {
              this.field_o = var17.readUnsignedShortOrInt(-48);
            }
            var8 = 0;
            var9 = -1;
            this.field_k = new int[this.field_o];
            if (7 > var4) {
              for (var10 = 0; var10 < this.field_o; var10++) {
                dupTemp$0 = var8 + var17.readUnsignedShort(125);
                var8 = dupTemp$0;
                this.field_k[var10] = dupTemp$0;
                if (this.field_k[var10] > var9) {
                  var9 = this.field_k[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_o > var10; var10++) {
                dupTemp$1 = var8 + var17.readUnsignedShortOrInt(-48);
                var8 = dupTemp$1;
                this.field_k[var10] = dupTemp$1;
                if (var9 < this.field_k[var10]) {
                  var9 = this.field_k[var10];
                }
              }
            }
            this.field_l = var9 + 1;
            this.field_f = new int[this.field_l];
            if (var7 != 0) {
              this.field_h = new byte[this.field_l][];
            }
            this.field_c = new int[this.field_l];
            this.field_p = new int[this.field_l];
            this.field_n = new int[this.field_l][];
            this.field_j = new int[this.field_l];
            if (var6 != 0) {
              this.field_g = new int[this.field_l];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_l; var10Lifetime1++) {
                this.field_g[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_o > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_g[this.field_k[var10Lifetime1Lifetime1]] = var17.readInt(119);
              }
              this.field_b = new IntIntHashTable(this.field_g);
            }
            for (var10Lifetime2 = 0; this.field_o > var10Lifetime2; var10Lifetime2++) {
              this.field_j[this.field_k[var10Lifetime2]] = var17.readInt(-69);
            }
            if (var7 == 0) {
              for (var10Lifetime3 = 0; this.field_o > var10Lifetime3; var10Lifetime3++) {
                this.field_f[this.field_k[var10Lifetime3]] = var17.readInt(95);
              }
            } else {
              for (var10Lifetime3 = 0; this.field_o > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.readBytes(var21, 0, -106, 64);
                this.field_h[this.field_k[var10Lifetime3]] = var21;
              }
              for (var10Lifetime3 = 0; this.field_o > var10Lifetime3; var10Lifetime3++) {
                this.field_f[this.field_k[var10Lifetime3]] = var17.readInt(95);
              }
            }
            if (var4 >= 7) {
              for (var10Lifetime4 = 0; this.field_o > var10Lifetime4; var10Lifetime4++) {
                this.field_c[this.field_k[var10Lifetime4]] = var17.readUnsignedShortOrInt(-48);
              }
              for (var10Lifetime4 = 0; this.field_o > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_k[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.field_c[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_n[var11] = array$2;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.readUnsignedShortOrInt(-48);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_n[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_p[var11] = var13 + 1;
                if (1 + var13 == var12) {
                  this.field_n[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; this.field_o > var10Lifetime4; var10Lifetime4++) {
                this.field_c[this.field_k[var10Lifetime4]] = var17.readUnsignedShort(123);
              }
              for (var10Lifetime4 = 0; this.field_o > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_k[var10Lifetime4];
                var12 = this.field_c[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$5 = new int[var12];
                this.field_n[var11] = array$5;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.readUnsignedShort(123);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_n[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_p[var11] = var13 + 1;
                if (var12 == 1 + var13) {
                  this.field_n[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_e = new IntIntHashTable[var9 + 1];
              this.field_m = new int[1 + var9][];
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_o; var10Lifetime5++) {
                var11Lifetime1 = this.field_k[var10Lifetime5];
                var12Lifetime1 = this.field_c[var11Lifetime1];
                array$8 = new int[this.field_p[var11Lifetime1]];
                this.field_m[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_p[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_m[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.field_n[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_n[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_m[var11Lifetime1][var14Lifetime1] = var17.readInt(TextLineLayout.bitwiseXor(param0, 23927));
                }
                this.field_e[var11Lifetime1] = new IntIntHashTable(this.field_m[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_106_0 = var3;
          stackIn_106_1 = new StringBuilder().append("dla.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
    }

    final static int getLoadingPercent(int param0) {
        if (cga.field_f < 2) {
          return 0;
        }
        if (ApproachPlayerLocomotor.field_t == 0) {
          if (!tk.field_b.ensureIndex(-100)) {
            return 20;
          }
          if (!tk.field_b.isGroupAvailableByName("commonui", param0 ^ -122)) {
            return 40;
          }
          if (!OpenGlTexture2D.field_n.ensureIndex(param0 - 100)) {
            return 50;
          }
          if (!OpenGlTexture2D.field_n.isGroupAvailableByName("commonui", -126)) {
            return 60;
          }
          if (!WeaveOperator.field_p.ensureIndex(param0 ^ -123)) {
            return 70;
          }
          if (!WeaveOperator.field_p.areAllGroupsAvailable(0)) {
            return 80;
          }
        } else {
          if (InvisibleTouchSwitchComponent.field_J != null) {
            if (!InvisibleTouchSwitchComponent.field_J.ensureIndex(-37)) {
              return 14;
            }
            if (!InvisibleTouchSwitchComponent.field_J.hasGroupName("", 127)) {
              return 29;
            }
            if (!InvisibleTouchSwitchComponent.field_J.isGroupAvailableByName("", -127)) {
              return 29;
            }
          }
          if (!tk.field_b.ensureIndex(param0 - 130)) {
            return 43;
          }
          if (!tk.field_b.isGroupAvailableByName("commonui", -128)) {
            return 57;
          }
          if (!OpenGlTexture2D.field_n.ensureIndex(param0 - 42)) {
            return 71;
          }
          if (!OpenGlTexture2D.field_n.isGroupAvailableByName("commonui", -124)) {
            return 80;
          }
          if (!WeaveOperator.field_p.ensureIndex(-128)) {
            return 82;
          }
          if (!WeaveOperator.field_p.areAllGroupsAvailable(0)) {
            return 86;
          }
        }
        if (param0 == 7) {
          return 100;
        }
        return 91;
    }

    final static void drawDimmedOverlay(int param0) {
        if (vo.field_b) {
          SoftwareRasterizer.darkenRectangle(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight - SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipBottom - SoftwareRasterizer.clipTop);
          AccountCreationDialog.field_gb.drawFullScreen(36, false);
        }
        if (param0 != 23713) {
          ArchiveIndex.getLoadingPercent(120);
        }
    }

    ArchiveIndex(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_d = MusicPlayer.computeCrc32(param0.length, param0, (byte) -124);
          if (param1 != this.field_d) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_i = PlayPhase.whirlpoolDigest(param0.length, param0, 0, 8);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_i[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.decodeIndex(-23918, param0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "dla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
