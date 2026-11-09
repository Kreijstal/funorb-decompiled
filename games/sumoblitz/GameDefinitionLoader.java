/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameDefinitionLoader {
    static int tooltipDuration;
    static int justificationRemainderQ8;
    static String openInPopupWindowText;
    static GzipDecompressor gzipDecompressor;
    static RasterIndexedSprite[] field_d;

    final static GraphicsToolkit createOpenGlToolkit(ResourceArchive resources, int guard, TextureProvider textures, java.awt.Canvas canvas, int samples) {
        RuntimeException var5 = null;
        long var6 = 0L;
        OpenGlGraphicsToolkit var8 = null;
        jaggl.OpenGL var9 = null;
        OpenGlGraphicsToolkit stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!HiscoreRequest.loadNativeSoftwareLibraries((byte) 119)) {
            throw new RuntimeException("");
          }
          if (guard != -6708) {
            GameDefinitionLoader.releaseStatics(false);
          }
          if (!ScrollPane.loadNativeLibrary((byte) 120, "jaggl")) {
            throw new RuntimeException("");
          }
          var9 = new jaggl.OpenGL();
          var6 = var9.init(canvas, 8, 8, 8, 24, 0, samples);
          if (var6 == 0L) {
            throw new RuntimeException("");
          }
          var8 = new OpenGlGraphicsToolkit(var9, canvas, var6, textures, resources, samples);
          var8.initializeHardwareResources(false);
          stackIn_9_0 = var8;
          return (GraphicsToolkit) ((Object) stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("sb.B(");
          if (resources == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(',');
          if (textures == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (canvas == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(samples).append(')').toString());
        }
    }

    final static void writeServicePreamble(int param0, int param1, int param2, int param3, PacketBuffer param4) {
        try {
          param4.writeByte((byte) 122, 12);
          param4.writeShort(-42, 17);
          if (param1 <= 77) {
            java.awt.Canvas var6 = (java.awt.Canvas) null;
            GameDefinitionLoader.createOpenGlToolkit((ResourceArchive) null, -117, (TextureProvider) null, (java.awt.Canvas) null, 97);
          }
          param4.writeShort(117, param3);
          param4.writeShort(117, param2);
          param4.writeByte((byte) 52, param0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          tooltipDuration = 40;
        }
        openInPopupWindowText = null;
        gzipDecompressor = null;
        field_d = null;
    }

    final static void loadWavesAndLevels(int guard, ResourceArchive archive) {
        int var5_int = 0;
        int var9 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        DroneWave[] var4 = null;
        ArenaDefinition[] var5 = null;
        int var6 = 0;
        PacketBuffer var6_ref_fs = null;
        Exception var7 = null;
        DroneWave[] var7_array = null;
        DroneWave[] var8 = null;
        PacketBuffer var10 = null;
        int var11 = 0;
        PacketBuffer var14 = null;
        DroneWave[] var16 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = archive.groupId(guard + 9937, "waves/");
          var23 = archive.fileIds(var2_int, -25915);
          IntrusiveDequeCursor.field_a = new DroneWave[41];
          var4 = new DroneWave[41];
          for (var5_int = 0; var23.length > var5_int; var5_int++) {
            var6_ref_fs = new PacketBuffer(archive.fetchFile((byte) 94, var23[var5_int], var2_int));
            var6_ref_fs.position = var6_ref_fs.position + 1;
            var4[var5_int] = CheckboxWidget.decodeDroneWave(true, var6_ref_fs, false);
            IntrusiveDequeCursor.field_a[var4[var5_int].field_a] = var4[var5_int];
          }
          var2_int = archive.groupId(guard ^ guard, "levels/");
          var24 = archive.fileIds(var2_int, -25915);
          var5 = new ArenaDefinition[var24.length];
          EnemyDrone.field_S = new ArenaDefinition[25];
          for (var6 = 0; var24.length > var6; var6++) {
            var14 = new PacketBuffer(archive.fetchFile((byte) 98, var24[var6], var2_int));
            var14.position = var14.position + 1;
            var5[var6] = ArenaDefinitionCodec.decodeArena(var14, true, 102);
            if (25 > var5[var6].levelId) {
              EnemyDrone.field_S[var5[var6].levelId] = var5[var6];
            }
          }
          NoiseSliceGenerator.field_a = new IntrusiveNodeHashTable(16);
          for (var6 = 0; 9 > var6; var6++) {
            try {
              var2_int = archive.groupId(0, "engineered_levels/" + (1 + var6) + "/");
              decompiledRegionSelector0 = 0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7 = (Exception) (Object) decompiledCaughtException;
              decompiledRegionSelector0 = 1;
            }
            if (decompiledRegionSelector0 == 0 &&
              var2_int != -1) {
              var25 = archive.fileIds(var2_int, -25915);
              var16 = new DroneWave[var25.length];
              var7_array = var16;
              var8 = new DroneWave[var25.length];
              for (var9 = 0; var9 < var25.length; var9++) {
                var10 = new PacketBuffer(archive.fetchFile((byte) 106, var25[var9], var2_int));
                var10.position = var10.position + 1;
                var7_array[var9] = CheckboxWidget.decodeDroneWave(true, var10, false);
                var8[var16[var9].field_a] = var16[var9];
              }
              NoiseSliceGenerator.field_a.put(new DroneWaveDefinition(var8), guard ^ 9936, (long)WidgetContainer.field_x[var6]);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("sb.E(").append(guard).append(',');
          if (archive == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static int pollAccountDialogResult(boolean unusedFlag, int unusedFirst, int unusedSecond, byte guard) {
        if (guard <= 46) {
          return 59;
        }
        return LoginCredentials.pollAccountDialogs(19886);
    }

    static {
        justificationRemainderQ8 = 0;
        openInPopupWindowText = "Open in popup window";
        tooltipDuration = 250;
        gzipDecompressor = new GzipDecompressor();
    }
}
