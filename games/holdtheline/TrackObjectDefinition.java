/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackObjectDefinition {
    int field_h;
    int[] field_l;
    int collisionRadius;
    private RotatedSpriteSheetAsset field_q;
    private static int[] field_e;
    int field_m;
    Sprite[] field_g;
    static PacketBuffer field_n;
    boolean rectangularCollision;
    static SpriteAsset field_i;
    boolean field_c;
    static int[] field_p;
    private SpriteAsset field_k;
    private RotatedSpriteAsset field_j;
    private SpriteSheetAsset field_o;
    int flags;
    RotatedSpriteCache[] field_f;

    private final void setRotatedSprite(int param0, RotatedSpriteAsset param1) {
        try {
          this.field_j = param1;
          this.field_c = false;
          if (param0 != 1) {
            BlobWriteRequest var4 = (BlobWriteRequest) null;
            TrackObjectDefinition.sendBlobWriteRequest(74, (BlobWriteRequest) null, -105);
          }
          this.field_g = null;
          this.field_l = null;
          this.field_f = null;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void setSprite(int param0, SpriteAsset param1) {
        try {
          this.field_l = null;
          int var3_int = 125 % ((param0 + 14) / 34);
          this.field_k = param1;
          this.field_g = null;
          this.field_f = null;
          this.field_c = false;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean pollGraphicsLoaded(byte param0) {
        RotatedSpriteCache var5 = null;
        RotatedSpriteCache var3 = null;
        RotatedSpriteCache[] var7 = null;
        Sprite[] var8 = null;
        int var4 = HoldTheLine.field_D;
        if (this.field_c) {
          return true;
        }
        int var2 = -8 / ((-92 - param0) / 34);
        if (this.field_k == null) {
          if (this.field_j != null) {
            var5 = this.field_j.getRotatedSprites((byte) -105);
            var3 = var5;
            if (var3 != null) {
              this.field_f = new RotatedSpriteCache[]{var5};
              this.field_c = true;
              return this.field_c;
            }
            return this.field_c;
          }
          if (null == this.field_o) {
            if (null == this.field_q) {
              return this.field_c;
            }
            var7 = this.field_q.getRotatedSprites(16);
            RotatedSpriteCache[] var3_array = var7;
            if (var7 != null) {
              this.field_f = var7;
              this.field_c = true;
              return this.field_c;
            }
            return this.field_c;
          }
          var8 = this.field_o.getSprites(180);
          Sprite[] var3_array2 = var8;
          if (var8 != null) {
            this.field_g = var8;
            this.field_c = true;
            return this.field_c;
          }
          return this.field_c;
        }
        Sprite var6 = this.field_k.getSprite(8192);
        Sprite var3_ref = var6;
        if (var3_ref != null) {
          this.field_g = new Sprite[]{var6};
          this.field_c = true;
          return this.field_c;
        }
        return this.field_c;
    }

    public static void clearSharedReferences(byte param0) {
        field_p = null;
        field_n = null;
        if (param0 != -6) {
          return;
        }
        field_e = null;
        field_i = null;
    }

    final static void setMenuDescriptions(String[][] param0, int param1, int param2) {
        try {
          LoadProgressDialog.field_ab = -1;
          MusicPatchEnvelope.field_i = param2;
          DialogLayer.field_I = -1;
          mc.field_b = param0;
          mn.field_b = -1;
          MessagePanel.h(0);
          if (param1 <= 10) {
            ResourceArchive var4 = (ResourceArchive) null;
            TrackObjectDefinition.loadNamedFont((String) null, (ResourceArchive) null, (String) null, 14, (ResourceArchive) null);
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void setSpriteSheet(SpriteSheetAsset param0, int[] param1, boolean param2) {
        this.field_l = param1;
        this.field_c = false;
        this.field_o = param0;
        if (!param2) {
          return;
        }
        try {
          this.field_g = null;
          this.field_f = null;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static PaletteBitmapFont loadNamedFont(String param0, ResourceArchive param1, String param2, int param3, ResourceArchive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        PaletteBitmapFont stackIn_2_0 = null;
        PaletteBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 8192) {
            stackIn_2_0 = (PaletteBitmapFont) null;
            return stackIn_2_0;
          }
          var5_int = param4.getGroupId(param0, 3);
          var6 = param4.getFileId(var5_int, param2, false);
          stackIn_4_0 = ta.a(var5_int, var6, param4, param1, -105);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("om.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void sendBlobWriteRequest(int param0, BlobWriteRequest param1, int param2) {
        IsaacPacketBuffer var6 = null;
        int var4 = 0;
        try {
          if (param0 != 27391) {
            BlobWriteRequest var5 = (BlobWriteRequest) null;
            TrackObjectDefinition.sendBlobWriteRequest(-52, (BlobWriteRequest) null, -89);
          }
          var6 = IsaacPacketBuffer.field_p;
          var6.writeCipheredOpcode((byte) 33, param2);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(111, 1);
          if (null != param1.payload) {
            var6.writeByte(param0 - 27280, param1.payload.length);
            var6.writeBytes(param1.payload.length, 86, param1.payload, 0);
          } else {
            var6.writeByte(param0 ^ 27280, 0);
          }
          var6.appendCrc32(var4, (byte) 118);
          var6.position = var6.position - 4;
          param1.acknowledgementCrc = var6.readInt(62);
          var6.backpatchByteLength(-268435456, var6.position - var4);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void setCollisionRadius(int param0, int param1) {
        if (param0 == 32768) {
          this.rectangularCollision = false;
          this.collisionRadius = param1;
          return;
        }
        field_i = (SpriteAsset) null;
        this.rectangularCollision = false;
        this.collisionRadius = param1;
    }

    private final void setCollisionRectangle(int param0, int param1, int param2) {
        this.field_h = param1;
        this.field_m = param2;
        this.rectangularCollision = true;
        if (param0 == 92682) {
          this.collisionRadius = (int)Math.sqrt((double)(this.field_m * this.field_m + this.field_h * this.field_h));
          return;
        }
        int[] var5 = (int[]) null;
        this.setSpriteSheet((SpriteSheetAsset) null, (int[]) null, true);
        this.collisionRadius = (int)Math.sqrt((double)(this.field_m * this.field_m + this.field_h * this.field_h));
    }

    private final void setRotatedSpriteSheet(int param0, RotatedSpriteSheetAsset param1, int[] param2) {
        this.field_l = param2;
        this.field_g = null;
        this.field_q = param1;
        this.field_c = false;
        if (param0 != 4) {
          return;
        }
        try {
          this.field_f = null;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    TrackObjectDefinition(int param0, int param1, SpriteSheetAsset param2, int[] param3, int param4) {
        try {
          this.flags = param1;
          this.setCollisionRadius(32768, param0);
          this.setSpriteSheet(param2, param3, true);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void detachInputListeners(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          lh.a((java.awt.Component) ((Object) param1), false);
          ArchiveLoadStage.detachMouseInput(23147, (java.awt.Component) ((Object) param1));
          if (TrackBoundary.field_u != null) {
            TrackBoundary.field_u.a((java.awt.Component) ((Object) param1), -1);
          }
          if (param0 == -46342) {
            return;
          }
          var3 = (java.awt.Canvas) null;
          TrackObjectDefinition.detachInputListeners(93, (java.awt.Canvas) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("om.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    TrackObjectDefinition(int param0, int param1, RotatedSpriteSheetAsset param2, int[] param3, int param4) {
        try {
          this.flags = param1;
          this.setCollisionRadius(32768, param0);
          this.setRotatedSpriteSheet(4, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    TrackObjectDefinition(int param0, int param1, int param2, RotatedSpriteSheetAsset param3, int[] param4, int param5) {
        try {
          this.flags = param2;
          this.setCollisionRectangle(92682, param1, param0);
          this.setRotatedSpriteSheet(4, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    TrackObjectDefinition(int param0, int param1, SpriteAsset param2, int param3) {
        try {
          this.flags = param1;
          this.setCollisionRadius(32768, param0);
          this.setSprite(-103, param2);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    TrackObjectDefinition(int param0, int param1, int param2, SpriteAsset param3, int param4) {
        try {
          this.flags = param2;
          this.setCollisionRectangle(92682, param1, param0);
          this.setSprite(-57, param3);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    TrackObjectDefinition(int param0, int param1, RotatedSpriteAsset param2, int param3) {
        try {
          this.flags = param1;
          this.setCollisionRadius(32768, param0);
          this.setRotatedSprite(1, param2);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    TrackObjectDefinition(int param0, int param1, int param2, RotatedSpriteAsset param3, int param4) {
        try {
          this.flags = param2;
          this.setCollisionRectangle(92682, param1, param0);
          this.setRotatedSprite(1, param3);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    TrackObjectDefinition(int param0, int param1, int param2, int param3) {
        this.flags = param2;
        this.setCollisionRectangle(92682, param1, param0);
        this.field_g = null;
        this.field_f = null;
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_e = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var6 = (long)(1 + (var0 << 1));
          var4 = (long)(-1 + (var0 << 1));
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          if (var3 >= field_e.length) {
            var3 = field_e.length - 1;
          }
          for (var1 = var2 < 0 ? 0 : var2; var3 >= var1; var1++) {
            field_e[var1] = var0;
          }
        }
        field_p = new int[8192];
    }
}
