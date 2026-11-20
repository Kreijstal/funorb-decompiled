/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuIndexBufferOwner {
    static String field_b;
    private GpuIndexBuffer indexBuffer;

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var7 = VoidHunters.field_G;
        var2 = 0;
        var3 = SetSalvoaim.field_r;
        if (5 > var3) {
          var2 = var3 * (var3 * 8192) / 1100;
          var4 = 1;
          var5 = 0;
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 4) {
            var4 = 1;
            var5 = 1;
          }
          var6 = -4 % ((38 - param0) / 38);
          if (param1 == 5) {
            var5 = 1;
            var4 = -1;
          }
          if (param1 == 6) {
            var5 = -1;
            var4 = 1;
          }
          if (param1 == 7 ||
            8 == param1) {
            var5 = -1;
            var4 = -1;
          }
          if (param1 == 11) {
            var4 = -1;
          }
          if (param1 == 12) {
            var5 = -1;
            var4 = -1;
          }
          if (param1 == 13) {
            var5 = -1;
            var4 = 1;
          }
          if (14 == param1) {
            var5 = 1;
            var4 = -1;
          }
          if (15 == param1) {
            var4 = 1;
            var5 = 1;
          }
          GetMissileLauncherAimspeed.field_p = OpenGlTexture1D.a(91, var2 * var4, var2 * var5);
          return;
        }
        if (var3 < 105) {
          var2 = (var3 * 16384 - 40960) / 220;
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (param1 == 3) {
            var4Lifetime1 = -1;
          }
          if (param1 == 1) {
            var5Lifetime1 = 1;
          }
          if (param1 == 4) {
            var4Lifetime1 = 1;
            var5Lifetime1 = 1;
          }
          var6Lifetime1 = -4 % ((38 - param0) / 38);
          if (param1 == 5) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (param1 == 6) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (param1 == 7) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          } else {
            if (8 == param1) {
              var5Lifetime1 = -1;
              var4Lifetime1 = -1;
            }
          }
          if (param1 == 11) {
            var4Lifetime1 = -1;
          }
          if (param1 == 12) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          }
          if (param1 == 13) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (14 == param1) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (15 == param1) {
            var4Lifetime1 = 1;
            var5Lifetime1 = 1;
          }
          GetMissileLauncherAimspeed.field_p = OpenGlTexture1D.a(91, var2 * var4Lifetime1, var2 * var5Lifetime1);
          return;
        }
        if (var3 >= 120) {
          var4Lifetime2 = 1;
          var5Lifetime2 = 0;
          if (param1 == 3) {
            var4Lifetime2 = -1;
          }
          if (param1 == 1) {
            var5Lifetime2 = 1;
          }
          if (param1 == 4) {
            var4Lifetime2 = 1;
            var5Lifetime2 = 1;
          }
          var6Lifetime2 = -4 % ((38 - param0) / 38);
          if (param1 == 5) {
            var5Lifetime2 = 1;
            var4Lifetime2 = -1;
          }
          if (param1 == 6) {
            var5Lifetime2 = -1;
            var4Lifetime2 = 1;
          }
          if (param1 == 7 ||
            8 == param1) {
            var5Lifetime2 = -1;
            var4Lifetime2 = -1;
          }
          if (param1 == 11) {
            var4Lifetime2 = -1;
          }
          if (param1 == 12) {
            var5Lifetime2 = -1;
            var4Lifetime2 = -1;
          }
          if (param1 == 13) {
            var5Lifetime2 = -1;
            var4Lifetime2 = 1;
          }
          if (14 == param1) {
            var5Lifetime2 = 1;
            var4Lifetime2 = -1;
          }
          if (15 == param1) {
            var4Lifetime2 = 1;
            var5Lifetime2 = 1;
          }
          GetMissileLauncherAimspeed.field_p = OpenGlTexture1D.a(91, var2 * var4Lifetime2, var2 * var5Lifetime2);
          return;
        }
        var3 = -var3 + 120;
        var2Lifetime1 = -(8192 * (var3 * var3) / 3300) + 8192;
        var4Lifetime3 = 1;
        var5Lifetime3 = 0;
        if (param1 == 3) {
          var4Lifetime3 = -1;
        }
        if (param1 == 1) {
          var5Lifetime3 = 1;
        }
        if (param1 == 4) {
          var4Lifetime3 = 1;
          var5Lifetime3 = 1;
        }
        var6Lifetime3 = -4 % ((38 - param0) / 38);
        if (param1 == 5) {
          var5Lifetime3 = 1;
          var4Lifetime3 = -1;
        }
        if (param1 == 6) {
          var5Lifetime3 = -1;
          var4Lifetime3 = 1;
        }
        if (param1 == 7 ||
          8 == param1) {
          var5Lifetime3 = -1;
          var4Lifetime3 = -1;
        }
        if (param1 == 11) {
          var4Lifetime3 = -1;
        }
        if (param1 == 12) {
          var5Lifetime3 = -1;
          var4Lifetime3 = -1;
        }
        if (param1 == 13) {
          var5Lifetime3 = -1;
          var4Lifetime3 = 1;
        }
        if (14 == param1) {
          var5Lifetime3 = 1;
          var4Lifetime3 = -1;
        }
        if (15 == param1) {
          var4Lifetime3 = 1;
          var5Lifetime3 = 1;
        }
        GetMissileLauncherAimspeed.field_p = OpenGlTexture1D.a(91, var2Lifetime1 * var4Lifetime3, var2Lifetime1 * var5Lifetime3);
        return;
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        if (param0 != -1) {
          GpuIndexBufferOwner.a(-69, 55);
        }
    }

    final void release(byte param0) {
        if (param0 != -35) {
          this.release((byte) 98);
          if (this.indexBuffer != null) {
            this.indexBuffer.release(param0 - 51);
            return;
          }
          return;
        }
        if (this.indexBuffer == null) {
          return;
        }
        this.indexBuffer.release(param0 - 51);
    }

    final static tpa a(boolean param0, int param1) {
        tpa var2 = new tpa(true);
        var2.field_c = param0 ? true : false;
        if (param1 == 1) {
          return var2;
        }
        return (tpa) null;
    }

    GpuIndexBufferOwner(boolean param0) {
    }

    static {
        field_b = "<%0> has dropped out.";
    }
}
