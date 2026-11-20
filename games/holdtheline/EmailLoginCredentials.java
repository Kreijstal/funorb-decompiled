/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailLoginCredentials extends LoginCredentials {
    private String password;
    static int field_g;
    static int[] field_d;
    private String email;
    static int field_e;

    public static void clearSharedReferences(byte param0) {
        if (param0 < 7) {
          field_e = 84;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final LoginCredentialType getType(boolean param0) {
        if (!param0) {
          return (LoginCredentialType) null;
        }
        return RoadControlPointSpec.field_d;
    }

    final void writeToPacket(int param0, PacketBuffer param1) {
        try {
          param1.writePrefixedCp1252String(29336, this.email);
          param1.writeBase38Name(param0, this.password);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "fh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, Sprite param3, int param4, int param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        Sprite var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = HoldTheLine.field_D;
        try {
          if (param7 != -24983) {
            field_d = (int[]) null;
          }
          if (SoftwareRasterizer.clipLeft > param5) {
            param2 = param2 - (-param5 + SoftwareRasterizer.clipLeft);
            param5 = SoftwareRasterizer.clipLeft;
          }
          if (param4 < SoftwareRasterizer.clipTop) {
            param1 = param1 - (SoftwareRasterizer.clipTop - param4);
            param4 = SoftwareRasterizer.clipTop;
          }
          if (param5 + param2 > SoftwareRasterizer.clipRight) {
            param2 = -param5 + SoftwareRasterizer.clipRight;
          }
          if (param1 + param4 > SoftwareRasterizer.clipBottom) {
            param1 = -param4 + SoftwareRasterizer.clipBottom;
          }
          if (param2 > 0 &&
            param1 > 0) {
            var21 = param3.copy();
            var30 = SoftwareRasterizer.pixels;
            var10 = SoftwareRasterizer.width;
            var11 = SoftwareRasterizer.height;
            var29 = new int[4];
            SoftwareRasterizer.saveClip(var29);
            param3.bindRaster();
            SoftwareRasterizer.intersectClip(var29[0], var29[1], var29[2], var29[3]);
            var13 = param3.width * param4 + param5;
            var14 = -param2 + param3.width;
            var25 = var21.pixels;
            var22 = var25;
            var15 = var22;
            for (var16 = param4; param4 + param1 > var16; var16++) {
              for (var17 = param5; param2 + param5 > var17; var17++) {
                var18 = var25[var13];
                if (var18 != 0) {
                  if (var17 > 0 &&
                    var15[var13 - 1] == 0) {
                    SoftwareRasterizer.fillCircle(var17, var16, param0, param6);
                  } else {
                    if (0 < var16 &&
                      var15[-param3.width + var13] == 0) {
                      SoftwareRasterizer.fillCircle(var17, var16, param0, param6);
                    } else {
                      if (var17 < -1 + param3.width &&
                        var15[1 + var13] == 0) {
                        SoftwareRasterizer.fillCircle(var17, var16, param0, param6);
                      } else {
                        if (-1 + param3.height > var16 &&
                          var15[param3.width + var13] == 0) {
                          SoftwareRasterizer.fillCircle(var17, var16, param0, param6);
                        }
                      }
                    }
                  }
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.draw(-param3.offsetX, -param3.offsetY);
            SoftwareRasterizer.bindRaster(var30, var10, var11);
            SoftwareRasterizer.restoreClip(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_46_0 = var8;
          stackIn_46_1 = new StringBuilder().append("fh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    EmailLoginCredentials(String param0, String param1) {
        try {
          this.password = param1;
          this.email = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "fh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = fc.createHorizontalPointPairs(-29, 25, 2);
    }
}
