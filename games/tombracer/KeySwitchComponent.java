/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class KeySwitchComponent extends SwitchComponent {
    static String[] field_L;
    static BitmapFont field_J;
    static String field_K;
    static String field_M;

    public static void releaseStatics(byte param0) {
        field_J = null;
        field_K = null;
        field_L = null;
        if (param0 != -12) {
          return;
        }
        field_M = null;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "mj.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        KeyLockBehaviour var5 = null;
        SwitchState var6 = null;
        ModelCodec var7 = null;
        SwitchModel var8 = null;
        Trap var9 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new Trap(param2, param0);
          var9.setSize((byte) -11, this.height, this.width);
          var9.setObstructionLevel(3, param1 ^ param1);
          var9.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param2, param0)));
          var5 = new KeyLockBehaviour(param2, param0);
          var5.setMaxLevel(0, 1);
          this.bindSwitchState(var5, (byte) -101);
          var6 = var5.getSwitchState((byte) -98);
          var6.setUses(1, 106);
          var9.addBehaviour((byte) 83, (Behaviour) (var5));
          var7 = rm.field_a;
          var8 = (SwitchModel) (var7.createModel(9, param1 + 103));
          var8.setVariant(3, (byte) -112);
          var9.addModel(var5, (byte) 124, var8);
          stackIn_1_0 = var9;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("mj.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final int getMaxTargets(int param0) {
        if (param0 != 31609) {
          return 57;
        }
        return 3;
    }

    final static void a(String param0, File param1, int param2) {
        try {
          if (param2 != 1) {
            KeySwitchComponent.releaseStatics((byte) -30);
          }
          gj.field_d.put(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "mj.FC(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean hasInitialState(byte param0) {
        if (param0 != 93) {
          field_M = (String) null;
          return false;
        }
        return false;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          field_J = (BitmapFont) null;
          return 7;
        }
        return 7;
    }

    KeySwitchComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    KeySwitchComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(param0 + 223, 2097152, 2097152);
    }

    final static void loadFonts(byte param0, String param1, ResourceArchive param2, ResourceArchive param3, int param4) {
        GameAssetLoader var7 = null;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        try {
          var7 = (GameAssetLoader) (dma.field_l);
          var7.drawLoadingProgress(param4, (byte) 47, param1);
          HeapIndexArray.field_d = DialogStack.loadBinaryFont((byte) 120, "b12_old", param3, "", param2);
          incrementValue$0 = param4;
          param4++;
          var7.drawLoadingProgress(incrementValue$0, (byte) 47, param1);
          if (param0 > -8) {
            File var6 = (File) null;
            KeySwitchComponent.a((String) null, (File) null, -60);
          }
          cq.field_d = DialogStack.loadBinaryFont((byte) 112, "newfont_old", param3, "", param2);
          incrementValue$1 = param4;
          param4++;
          var7.drawLoadingProgress(incrementValue$1, (byte) 47, param1);
          kv.field_a = joa.loadFontMetrics("b12", param2, "", (byte) 76);
          incrementValue$2 = param4;
          param4++;
          var7.drawLoadingProgress(incrementValue$2, (byte) 47, param1);
          MatchStatistics.field_n = joa.loadFontMetrics("newfont", param2, "", (byte) -111);
          incrementValue$3 = param4;
          param4++;
          var7.drawLoadingProgress(incrementValue$3, (byte) 47, param1);
          wb.field_a = joa.loadFontMetrics("newfont_lrg", param2, "", (byte) -92);
          incrementValue$4 = param4;
          param4++;
          var7.drawLoadingProgress(incrementValue$4, (byte) 47, param1);
          RatingsScreen.field_r = joa.loadFontMetrics("newfont_sml", param2, "", (byte) 126);
          incrementValue$5 = param4;
          param4++;
          var7.drawLoadingProgress(incrementValue$5, (byte) 47, param1);
          rc.field_b = SpriteData.loadSheet(param3, "", "fillfont");
          incrementValue$6 = param4;
          param4++;
          var7.drawLoadingProgress(incrementValue$6, (byte) 47, param1);
          gga.field_O = SpriteData.loadSheet(param3, "", "font_small");
          incrementValue$7 = param4;
          param4++;
          var7.drawLoadingProgress(incrementValue$7, (byte) 47, param1);
          MatchState.field_j = SpriteData.loadSheet(param3, "", "font_med");
          incrementValue$8 = param4;
          param4++;
          var7.drawLoadingProgress(incrementValue$8, (byte) 47, param1);
          MovingPlatformComponent.field_O = SpriteData.loadSheet(param3, "", "font_large");
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "mj.VB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static boolean c(int param0, int param1, int param2) {
        if (param0 != 2097152) {
          field_M = (String) null;
          if (MenuEntry.field_h == 13) {
            Room.l(param0 + 0);
            return true;
          }
          if (MenuEntry.field_h == 102) {
            ItemModel.field_n.resetSelection(true);
            return true;
          }
          if (null == ItemModel.field_n) {
            return false;
          }
          if (ItemModel.field_n.a(param2, (byte) -105, param1)) {
            return true;
          }
          return false;
        }
        if (MenuEntry.field_h == 13) {
          Room.l(param0 + 0);
          return true;
        }
        if (MenuEntry.field_h == 102) {
          ItemModel.field_n.resetSelection(true);
          return true;
        }
        if (null == ItemModel.field_n) {
          return false;
        }
        if (ItemModel.field_n.a(param2, (byte) -105, param1)) {
          return true;
        }
        return false;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return false;
    }

    static {
        field_L = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_M = "Connection lost - attempting to reconnect";
        field_K = "Please try again in a few minutes.";
    }
}
