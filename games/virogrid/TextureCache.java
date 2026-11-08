/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureCache implements TextureProvider {
    static TypeCode field_f;
    private IntrusiveDeque field_j;
    private Texture[] field_b;
    static String field_g;
    static int[] field_i;
    static String field_e;
    static String field_k;
    static boolean field_d;
    static String field_m;
    private int field_c;
    private int field_a;
    private int field_h;
    private Js5Archive field_l;

    public final int getTextureAlphaMode(byte param0, int param1) {
        if (param0 > -61) {
          return -51;
        }
        if (this.field_b[param1].field_n) {
          return 0;
        }
        return 1;
    }

    final static boolean handleQuickChatKey(byte param0, int param1, int param2) {
        if (13 == ScrollPane.field_Gb) {
          TextDecodeHelpers.closeModalIfOpen((byte) -126);
          return true;
        }
        int var3 = 78 / ((param0 + 8) / 47);
        if (102 == ScrollPane.field_Gb) {
          Js5Transport.field_v.resetSelection(1026);
          return true;
        }
        if (null == Js5Transport.field_v) {
          return false;
        }
        if (!Js5Transport.field_v.processShortcutKey(true, param2, param1)) {
          return false;
        }
        return true;
    }

    public final int[] getTexturePixels(float param0, byte param1, int param2) {
        Texture var7;
        Texture var9;
        Texture var10;
        Texture var11;
        Texture var12;
        Texture var13;
        Texture var14;
        Texture var10Lifetime1;
        Texture var13Lifetime1;
        if (param1 < -77) {
          var12 = this.field_b[param2];
          var13 = var12;
          var13Lifetime1 = var12;
          if (var12 == null) {
            return null;
          }
          boolean decompiledFrameRemainder1 = true;
          if ((var12.field_l != null) &&
            (decompiledFrameRemainder1 = (param0 != var12.field_h))) {
            var12.unlink(false);
            var12.releasePixels();
            this.field_c = this.field_c + 1;
          }
          if (decompiledFrameRemainder1) {
            if (!var12.buildPixels(param0, this.field_h, this.field_l)) {
              return null;
            }
            if (this.field_c == 0) {
              var14 = (Texture) (this.field_j.removeLast(-92));
              var14.releasePixels();
            } else {
              this.field_c = this.field_c - 1;
            }
          }
          this.field_j.addLast(var12, (byte) -45);
          return var12.field_l;
        }
        TextureCache.decreaseMusicVolume(-69);
        var9 = this.field_b[param2];
        var10 = var9;
        var10Lifetime1 = var9;
        var7 = var9;
        if (var9 == null) {
          return null;
        }
        boolean decompiledFrameRemainder0 = true;
        if ((var9.field_l != null) &&
          (decompiledFrameRemainder0 = (param0 != var9.field_h))) {
          var9.unlink(false);
          var9.releasePixels();
          this.field_c = this.field_c + 1;
        }
        if (decompiledFrameRemainder0) {
          if (!var9.buildPixels(param0, this.field_h, this.field_l)) {
            return null;
          }
          if (this.field_c == 0) {
            var11 = (Texture) (this.field_j.removeLast(-92));
            var11.releasePixels();
          } else {
            this.field_c = this.field_c - 1;
          }
        }
        this.field_j.addLast(var9, (byte) -45);
        return var9.field_l;
    }

    public static void releaseStatics(boolean param0) {
        field_e = null;
        field_f = null;
        if (param0) {
          TextureCache.decreaseMusicVolume(75);
          field_i = null;
          field_m = null;
          field_k = null;
          field_g = null;
          return;
        }
        field_i = null;
        field_m = null;
        field_k = null;
        field_g = null;
    }

    public final boolean isTextureReady(int param0, byte param1) {
        if (param1 < 104) {
          this.field_b = (Texture[]) null;
          return true;
        }
        return true;
    }

    final static void decreaseMusicVolume(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 != 11864) {
          TextureCache.decreaseMusicVolume(-125);
          if (32 >= DisplayNameHelpers.field_a) {
            CachedTextLayout.setMusicVolume(0, 0);
          } else {
            var1 = DisplayNameHelpers.field_a % 32;
            if (var1 == 0) {
              var1 = 32;
            }
            CachedTextLayout.setMusicVolume(-var1 + DisplayNameHelpers.field_a, 0);
          }
          return;
        }
        if (32 >= DisplayNameHelpers.field_a) {
          CachedTextLayout.setMusicVolume(0, 0);
        } else {
          var1Lifetime1 = DisplayNameHelpers.field_a % 32;
          if (var1Lifetime1 == 0) {
            var1Lifetime1 = 32;
          }
          CachedTextLayout.setMusicVolume(-var1Lifetime1 + DisplayNameHelpers.field_a, 0);
        }
    }

    public final int getAverageColor(int param0, byte param1) {
        int var3 = -101 / ((param1 - 57) / 59);
        if (this.field_b[param0] == null) {
          return 0;
        }
        return this.field_b[param0].field_i;
    }

    public final boolean isTextureSize64(int param0, int param1) {
        if (param1 != 0) {
          this.field_h = -1;
          return this.field_h == 64 ? true : false;
        }
        return this.field_h == 64 ? true : false;
    }

    TextureCache(Js5Archive param0, Js5Archive param1, int param2, int param3) {
        int var7 = 0;
        int[] var5 = null;
        int var6 = 0;
        PacketBuffer var8 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        this.field_j = new IntrusiveDeque();
        this.field_c = 0;
        this.field_h = 128;
        try {
          this.field_a = param2;
          this.field_l = param1;
          this.field_c = this.field_a;
          this.field_h = param3;
          var12 = param0.getFileIds((byte) 125, 0);
          var11 = var12;
          var10 = var11;
          var5 = var10;
          var6 = var12.length;
          this.field_b = new Texture[param0.getFileCount((byte) 43, 0)];
          for (var7 = 0; var7 < var6; var7++) {
            var8 = new PacketBuffer(param0.getFile(0, var12[var7], 0));
            this.field_b[var12[var7]] = new Texture(var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("vl.<init>(");
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
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_f = new TypeCode(14, 0, 4, 1);
        field_g = "Chat is currently disabled.";
        field_e = "Create";
        field_m = "Loading textures";
    }
}
