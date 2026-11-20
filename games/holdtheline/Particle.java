/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class Particle extends IntrusiveNode {
    private int velocityY;
    private int alphaStep;
    int lifetime;
    static RotatedSpriteSheetAsset field_p;
    int color;
    static String field_r;
    private int radiusStep;
    int alpha;
    private int velocityX;
    int fixedX;
    int fixedRadius;
    int fixedY;
    static int[] field_l;

    final void recycle(byte param0) {
        if (param0 >= -4) {
          this.lifetime = -41;
          this.unlink(0);
          RasterBuffer.field_e.addLast((byte) -112, (IntrusiveNode) (this));
          return;
        }
        this.unlink(0);
        RasterBuffer.field_e.addLast((byte) -112, (IntrusiveNode) (this));
    }

    final static void closeCacheResources(int param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = HoldTheLine.field_D;
          try {
            if (OutlinedRoadStripRenderer.field_n != null) {
              OutlinedRoadStripRenderer.field_n.close(param0 ^ 27371);
            }
            if (null != IterableSecondaryNodeDeque.field_d) {
              IterableSecondaryNodeDeque.field_d.shutdown(true);
            }
            if (null != StereoMusicSample.field_g) {
              try {
                StereoMusicSample.field_g.close(param0 ^ -27371);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (vb.field_a != null) {
              for (var1_int = 0; vb.field_a.length > var1_int; var1_int++) {
                if (null != vb.field_a[var1_int]) {
                  try {
                    vb.field_a[var1_int].close(-1);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
            }
            if (param0 != 27370) {
              Particle.loadLogoModels((ResourceArchive) null, -66);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw EntitySound.wrapException((Throwable) ((Object) var1_ref), "jk.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void update(int param0) {
        this.fixedRadius = this.fixedRadius + this.radiusStep;
        this.fixedX = this.fixedX + this.velocityX;
        this.lifetime = this.lifetime - 1;
        this.fixedY = this.fixedY + this.velocityY;
        this.alpha = this.alpha + this.alphaStep;
        if (param0 >= -56) {
          this.fixedY = 46;
        }
    }

    public static void clearSharedReferences(int param0) {
        field_p = null;
        field_r = null;
        if (param0 != 1288) {
          Particle.closeCacheResources(27);
          field_l = null;
          return;
        }
        field_l = null;
    }

    final static void loadLogoModels(ResourceArchive param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        TriangleMesh var5 = null;
        int[] var6 = null;
        int var7 = 0;
        IsaacPacketBuffer var8 = null;
        int var9 = 0;
        IsaacPacketBuffer var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = HoldTheLine.field_D;
        try {
          var8 = new IsaacPacketBuffer(param0.getNamedFile("", false, "logo.fo3d"));
          var10 = var8;
          var3 = var10.readUnsignedByte((byte) -16);
          var10.beginBitReading(true);
          TextFieldRenderer.field_s = SpriteSheetAsset.a(11658, var10);
          ByteStorage.field_c = new TriangleMesh[var3];
          TextFieldValidator.field_e = new int[var3][];
          var4 = 0;
          var5_int = -65 / ((58 - param1) / 41);
          while (var3 > var4) {
            ByteStorage.field_c[var4] = ClientTextResources.a(6, var8);
            var4++;
          }
          var10.endBitReading(-71);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < var3) {
            var5 = ByteStorage.field_c[var9];
            var5.scale(6, 6, 6, 2, 1);
            var5.calculateBounds(0);
            var6 = new int[]{var5.field_F + var5.field_L >> 1, var5.field_H + var5.field_d >> 1, var5.field_p + var5.field_n >> 1};
            TextFieldValidator.field_e[var9] = var6;
            var5.translate(-var6[1], -var6[0], -26608, -var6[2]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("jk.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void initialize(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10) {
        this.fixedY = param2 << 10;
        this.fixedRadius = param8 << 10;
        this.radiusStep = param0;
        int var12 = 105 / ((-81 - param5) / 39);
        this.fixedX = param6 << 10;
        this.lifetime = param1;
        this.alphaStep = param10;
        this.color = param7;
        this.velocityY = param3;
        this.velocityX = param4;
        this.alpha = param9 << 2;
    }

    Particle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.initialize(param7, param4, param1, param3, param2, (byte) 79, param0, param5, param6, param8, param9);
    }

    static {
        field_l = new int[]{4, 4, 2};
    }
}
