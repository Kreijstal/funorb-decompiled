/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tc extends ChatTarget {
    private String field_e;
    private long field_g;
    static SecondaryNodeHashTable field_d;
    static String field_f;

    final static ToolkitModel[] createModels(ModelData[] param0, int param1, GraphicsToolkit param2) {
        int var4 = 0;
        ToolkitModel[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        ToolkitModel[] var6 = null;
        ToolkitModel[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 == null) {
            return null;
          }
          var6 = new ToolkitModel[param0.length];
          var3 = var6;
          if (param1 != -8829) {
            field_f = (String) null;
          }
          for (var4 = 0; var6.length > var4; var4++) {
            var6[var4] = gb.createModel(param0[var4], param1 + 8957, param2);
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("tc.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 17129) {
          tc.a(false, 119);
          field_d = null;
          field_f = null;
          return;
        }
        field_d = null;
        field_f = null;
    }

    final void write(PacketBuffer param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          param0.writeLong(1736565456, this.field_g);
          param0.writeBase38Name(this.field_e, -124);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (null != ArchiveNetworkClient.field_b) {
          TrackPlayerLocomotor.drawTooltip(-107, ArchiveNetworkClient.field_b);
        }
        if (hka.field_b != null) {
          hka.field_b.draw(true, param0);
        }
        if (param1 != 0) {
          field_d = (SecondaryNodeHashTable) null;
        }
        jl.a((byte) -128, param0);
        if (null != RoomViewRenderer.field_c) {
          RoomViewRenderer.field_c.drawFullScreen(param1 + 74, param0);
        }
        TextureFilter.a(param0, (byte) -91);
    }

    final static void a(int param0, int param1) {
        if (param1 != -2886) {
          return;
        }
        PowerUpItemBehaviour.r(-93);
    }

    tc(long param0, String param1) {
        try {
          this.field_e = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ChatChannelType getChannelType(byte param0) {
        if (param0 != 113) {
          return (ChatChannelType) null;
        }
        return ViewportManager.field_f;
    }

    static {
        field_f = "Create a free account to store achievements, submit your best times and play online against friends! Without signing in, no progress will be saved!";
    }
}
