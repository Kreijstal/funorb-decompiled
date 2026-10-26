/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    final static void a(ds param0, int param1, byte param2) {
        CipherPacketBuffer var5 = q.outgoingPacket;
        var5.writeCipheredOpcode(109, param1);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        var5.writeByte(-1336879960, 1);
        if (param0.field_f == null) {
          var5.writeByte(-1336879960, 0);
        } else {
          var5.writeByte(-1336879960, param0.field_f.length);
          var5.a(true, param0.field_f.length, 0, param0.field_f);
        }
        var5.appendCrc32(var4, 16);
        var5.position = var5.position - 4;
        param0.field_g = var5.readInt((byte) 121);
        if (param2 < 27) {
          return;
        }
        try {
          var5.patchByteLength(-var4 + var5.position, (byte) 124);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "nn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          SoftwareRasterizer.drawHorizontalLine(param2, param0, param3 + 1, 10000536);
          SoftwareRasterizer.drawHorizontalLine(param2, param4 + param0, param3 + 1, 12105912);
          int var5_int = 1;
          if (param1 != 70) {
            return;
          }
          int var6 = param4;
          if (var5_int + param0 < SoftwareRasterizer.clipTop) {
            var5_int = SoftwareRasterizer.clipTop - param0;
          }
          if (var6 + param0 > SoftwareRasterizer.clipBottom) {
            var6 = -param0 + SoftwareRasterizer.clipBottom;
          }
          for (int var7 = var5_int; var6 > var7; var7++) {
            int var8 = 152 + var7 * 48 / param4;
            int var9 = var8 << 8 | var8 << 16 | var8;
            SoftwareRasterizer.framebuffer[param2 + SoftwareRasterizer.stride * (var7 + param0)] = var9;
            SoftwareRasterizer.framebuffer[param3 + param2 + (param0 + var7) * SoftwareRasterizer.stride] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var5), "nn.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
