/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    static int field_b;
    static String allHiscoresText;

    final static ToolkitRasterStateStack rasterStateForToolkit(GraphicsToolkit toolkit, byte guard) {
        ToolkitRasterStateCacheEntry var2 = null;
        ToolkitRasterStateStack var3 = null;
        ToolkitRasterStateStack stackIn_3_0 = null;
        ToolkitRasterStateStack stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (toolkit == im.field_c) {
            stackIn_3_0 = GraphicsToolkit.field_c;
            return stackIn_3_0;
          }
          var2 = (ToolkitRasterStateCacheEntry) (HotspotTextWidget.field_N.a(122, (long)toolkit.toolkitId));
          if (var2 != null &&
            toolkit == var2.toolkit) {
            var3 = var2.stateStack;
          } else {
            if (var2 != null) {
              var2.unlink(false);
            }
            var3 = new ToolkitRasterStateStack(toolkit);
            HotspotTextWidget.field_N.a(new ToolkitRasterStateCacheEntry(toolkit, var3), -1, (long)toolkit.toolkitId);
          }
          im.field_c = toolkit;
          GraphicsToolkit.field_c = var3;
          if (guard <= 8) {
            field_b = 38;
          }
          stackIn_14_0 = var3;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("wq.C(");
          if (toolkit == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(guard).append(')').toString());
        }
    }

    final synchronized static long monotonicTimeMillis(int guard) {
        if (guard >= -5) {
          return 4L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 >= ArchiveIndex.field_j) {
          ArchiveIndex.field_j = var1;
          return var1 + SpriteOptionRenderer.field_n;
        }
        SpriteOptionRenderer.field_n = SpriteOptionRenderer.field_n + (-var1 + ArchiveIndex.field_j);
        ArchiveIndex.field_j = var1;
        return var1 + SpriteOptionRenderer.field_n;
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        allHiscoresText = null;
    }

    final static void a(boolean param0, ResourceArchive param1) {
        CompactMeshGeometry stackIn_10_0;
        int stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        boolean stackIn_11_4;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        CompactMeshGeometry var5 = null;
        int[] var6 = null;
        int var7 = 0;
        IsaacPacketBuffer var8 = null;
        int var9 = 0;
        IsaacPacketBuffer var10 = null;
        int var4Lifetime1;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = new IsaacPacketBuffer(param1.fetchNamedFile("", "logo.fo3d", -1));
          var10 = var8;
          var3 = var10.readUnsignedByte(-31302);
          var10.beginBitAccess((byte) 54);
          LegacyOpenGlReflectionEffect.field_i = IsaacCipher.a(-126, var10);
          HardwareTextureCache.field_b = new CompactMeshGeometry[var3];
          kh.field_c = new int[var3][];
          for (var4 = 0; var3 > var4; var4++) {
            HardwareTextureCache.field_b[var4] = ImageProducerRasterBuffer.a(var8, -16736);
          }
          if (param0) {
            wq.monotonicTimeMillis(-93);
          }
          var10.endBitAccess((byte) -63);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = HardwareTextureCache.field_b[var9];
            stackIn_10_0 = var5;
            stackIn_10_1 = 6;
            stackIn_10_2 = 1;
            stackIn_10_3 = 6;
            stackIn_11_4 = !(param0);
            ((CompactMeshGeometry) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_11_4, 6);
            var5.a(false);
            var6 = new int[]{var5.field_t + var5.field_T >> 1, var5.field_j + var5.field_f >> 1, var5.field_P + var5.field_S >> 1};
            kh.field_c[var9] = var6;
            var5.a(-var6[2], -var6[1], (byte) -81, -var6[0]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("wq.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        allHiscoresText = "ALL HISCORES";
    }
}
