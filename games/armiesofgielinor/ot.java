/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ot extends dr {
    static NodeDeque ignoreEntries;
    static int field_G;
    static String field_H;
    static String field_F;

    final static void a(byte param0, int param1, iw param2) {
        CipherPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = vl.outgoingPacket;
          var6.writeCipheredOpcode(32161, param1);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(param0 ^ 113, 1);
          var6.writeByte(1, param2.field_r);
          if (param0 != 112) {
            iw var5 = (iw) null;
            ot.a((byte) 26, -53, (iw) null);
          }
          var6.writeByte(1, param2.field_k);
          var6.writeInt((byte) -96, param2.field_q);
          var6.writeInt((byte) -102, param2.field_m);
          var6.writeInt((byte) -86, param2.field_t);
          var6.writeInt((byte) -60, param2.field_s);
          var6.b((byte) -39, var4);
          var6.writeByteLengthPrefix(var6.position - var4, 5930);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ot.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void g(int param0) {
        if (tn.activeContextMenu != null) {
          if (tn.activeContextMenu.sourceComponent == null) {
            tn.activeContextMenu = null;
            if (param0 != 76) {
              ot.e((byte) -104);
              PointerInputHandler.contextMenuScrollContainer = null;
              return;
            }
            PointerInputHandler.contextMenuScrollContainer = null;
            return;
          }
          tn.activeContextMenu.sourceComponent.selected = false;
        }
        tn.activeContextMenu = null;
        if (param0 == 76) {
          PointerInputHandler.contextMenuScrollContainer = null;
          return;
        }
        ot.e((byte) -104);
        PointerInputHandler.contextMenuScrollContainer = null;
    }

    ot(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_2_0 = null;
        nd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -24872) {
            stackIn_4_0 = new nd(ih.e(90));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nd) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ot.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        ignoreEntries = null;
        field_H = null;
        int var1 = -2 % ((param0 + 35) / 35);
        field_F = null;
    }

    final static void a(Battlefield param0, BattleGraphicsAssets param1, int param2, GameplayController param3) {
        RgbSprite discarded$1 = null;
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          NetworkResourceRequest.field_C = param3;
          CipherPacketBuffer.currentBattlefield = param0;
          PaletteRegionMap.field_g = new AnimationPlayer(param2);
          PaletteRegionMap.field_g.selectSequence(-1, ck.animationSequencesByGroup[sf.unitAnimationGroups[76]][0]);
          ResourceArchive.field_a = NetworkResourceRequest.field_C.camera;
          discarded$1 = new RgbSprite(80, 40);
          ef.field_c = CipherPacketBuffer.currentBattlefield.mapHeight;
          ResourceRequest.field_y = CipherPacketBuffer.currentBattlefield.mapWidth;
          og.field_p = ResourceArchive.field_a.overlayValues;
          vs.field_e = CipherPacketBuffer.currentBattlefield.tiles;
          bt.field_f = CipherPacketBuffer.currentBattlefield.mapTheme;
          nk.a((byte) 111);
          Unit.field_L = false;
          ro.field_lb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ot.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_H = "<%0> has lost connection.";
        field_G = 0;
        field_F = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
