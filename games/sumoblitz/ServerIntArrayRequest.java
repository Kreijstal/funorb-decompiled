/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ServerIntArrayRequest extends IntrusiveNode {
    boolean complete;
    static AccountServiceResult field_l;
    int firstValue;
    static String field_n;
    int[] values;

    public static void releaseStatics(boolean param0) {
        field_n = null;
        field_l = null;
        if (param0) {
          field_n = (String) null;
        }
    }

    ServerIntArrayRequest() {
        this.complete = false;
    }

    final static void decodeSpriteSheet(int guard, byte[] data) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PacketBuffer var16 = null;
        PacketBuffer var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var12Lifetime3;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          var16 = new PacketBuffer(data);
          var17 = var16;
          var17.position = -2 + data.length;
          RasterStateFrame.field_n = var17.readUnsignedShort(255);
          CheckboxRenderer.field_k = new int[RasterStateFrame.field_n];
          ScrollViewport.field_B = new int[RasterStateFrame.field_n];
          SoundCache.field_d = new boolean[RasterStateFrame.field_n];
          TextLayout.field_d = new byte[RasterStateFrame.field_n][];
          StrongCacheReference.field_C = new int[RasterStateFrame.field_n];
          MenuSelectionController.field_h = new int[RasterStateFrame.field_n];
          StatefulWidgetRenderer.field_o = new byte[RasterStateFrame.field_n][];
          var17.position = -(RasterStateFrame.field_n * 8) - 7 + data.length;
          vf.field_d = var17.readUnsignedShort(guard);
          ToolkitImageProducerBuffer.field_u = var17.readUnsignedShort(255);
          var3 = 1 + (var17.readUnsignedByte(guard - 31557) & 255);
          for (var4 = 0; var4 < RasterStateFrame.field_n; var4++) {
            MenuSelectionController.field_h[var4] = var16.readUnsignedShort(255);
          }
          for (var4Lifetime1 = 0; RasterStateFrame.field_n > var4Lifetime1; var4Lifetime1++) {
            StrongCacheReference.field_C[var4Lifetime1] = var17.readUnsignedShort(255);
          }
          for (var4Lifetime2 = 0; RasterStateFrame.field_n > var4Lifetime2; var4Lifetime2++) {
            CheckboxRenderer.field_k[var4Lifetime2] = var17.readUnsignedShort(255);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < RasterStateFrame.field_n; var4Lifetime3++) {
            ScrollViewport.field_B[var4Lifetime3] = var17.readUnsignedShort(GzipDecompressor.bitwiseXor(guard, 0));
          }
          var17.position = -(8 * RasterStateFrame.field_n) + (-7 + data.length - (-1 + var3) * 3);
          LegacyOpenGlEffectManager.field_l = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            LegacyOpenGlEffectManager.field_l[var4Lifetime4] = var17.readUnsignedMedium((byte) 121);
            if (LegacyOpenGlEffectManager.field_l[var4Lifetime4] == 0) {
              LegacyOpenGlEffectManager.field_l[var4Lifetime4] = 1;
            }
          }
          var17.position = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < RasterStateFrame.field_n; var4Lifetime5++) {
            regionExit1: {
              var5 = CheckboxRenderer.field_k[var4Lifetime5];
              var6 = ScrollViewport.field_B[var4Lifetime5];
              var7 = var6 * var5;
              var20 = new byte[var7];
              var18 = var20;
              var8 = var18;
              TextLayout.field_d[var4Lifetime5] = var20;
              var21 = new byte[var7];
              var19 = var21;
              var9 = var19;
              StatefulWidgetRenderer.field_o[var4Lifetime5] = var21;
              var10 = 0;
              var11 = var17.readUnsignedByte(guard - 31557);
              if ((var11 & 1) == 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  var8[var12] = var17.readByte(true);
                }
                if ((0 != (2 & var11))) {
                  for (var12Lifetime3 = 0; var7 > var12Lifetime3; var12Lifetime3++) {
                    dupTemp$1 = var17.readByte(true);
                    var9[var12Lifetime3] = dupTemp$1;
                    var13 = dupTemp$1;
                    stackIn_30_0 = var10;
                    if (var13 == -1) {
                      stackIn_31_1 = 0;
                    } else {
                      stackIn_31_1 = 1;
                    }
                    var10 = stackIn_30_0 | stackIn_31_1;
                  }
                }
                break regionExit1;
              }
              var12Lifetime1 = 0;
              while (var5 > var12Lifetime1) {
                var13Lifetime1 = 0;
                while (true) {
                  stackIn_37_0 = ~var6;
                  stackIn_37_1 = ~var13Lifetime1;
                  if (stackIn_37_0 >= stackIn_37_1) {
                    var12Lifetime1++;
                    break;
                  }
                  var8[var12Lifetime1 + var5 * var13Lifetime1] = var17.readByte(true);
                  var13Lifetime1++;
                }
              }
              if ((2 & var11) != 0) {
                for (var12Lifetime2 = 0; var12Lifetime2 < var5; var12Lifetime2++) {
                  for (var13Lifetime2 = 0; var6 > var13Lifetime2; var13Lifetime2++) {
                    dupTemp$0 = var17.readByte(true);
                    var9[var5 * var13Lifetime2 + var12Lifetime2] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (-1 == var14) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            SoundCache.field_d[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("eg.B(").append(guard).append(',');
          if (data == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    static {
        field_n = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
