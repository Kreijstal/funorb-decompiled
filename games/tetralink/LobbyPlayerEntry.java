/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyPlayerEntry extends UiComponent {
    static String field_ec;
    UiComponent field_Vb;
    boolean field_Tb;
    int field_Sb;
    int field_Qb;
    UiComponent field_Ob;
    int field_Ub;
    boolean field_cc;
    int field_Xb;
    boolean field_Kb;
    int field_dc;
    long field_bc;
    UiComponent field_Wb;
    long field_Nb;
    UiComponent field_Lb;
    UiComponent field_ac;
    static int field_Mb;
    int field_Pb;
    String field_Rb;
    static int[] field_Zb;
    String field_Yb;

    public static void releaseStatics(int param0) {
        if (param0 != 11042) {
          return;
        }
        field_Zb = null;
        field_ec = null;
    }

    final void updateNames(int param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
          if (param0 <= 26) {
            this.field_Rb = (String) null;
          }
          this.field_Yb = param2;
          this.field_Rb = param1;
          var5 = (CharSequence) ((Object) this.field_Rb);
          DialWidgetPainter.normalizeDisplayName(var5, (byte) 104);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "gd.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean sortsBefore(byte param0, LobbyPlayerEntry param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (this.field_Kb) ? 0 : 1;
          if (param1.field_Kb) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_8_0 = this.field_Kb;
            return stackIn_8_0;
          }
          stackIn_12_0 = (this.field_cc) ? 0 : 1;
          if (stackIn_12_0 == (param1.field_cc ? 1 : 0)) {
            stackIn_15_0 = this.field_cc;
            return stackIn_15_0;
          }
          var3_int = -22 % ((-21 - param0) / 55);
          stackIn_19_0 = !(param1.field_bc <= this.field_bc);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("gd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean isUnindexed(byte param0) {
        if (param0 == -1) {
          return !this.isSecondaryLinked(2) ? true : false;
        }
        this.field_Xb = -80;
        return !this.isSecondaryLinked(2) ? true : false;
    }

    final static Sprite[] buildSpritesFromDecodedSheet(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var2 = 0;
        int var7 = TetraLink.field_J;
        Sprite[] var1 = new Sprite[PendingListRequest.field_n];
        int var2Lifetime1;
        for (var2 = 0; PendingListRequest.field_n > var2; var2++) {
          var3 = ErrorPrintHelpers.field_e[var2] * IntrusiveDeque.field_h[var2];
          var4 = JoinGameTextGlobals.field_a[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = LobbyResourceHelpers.field_c[StatusRequestHelpers.bitAnd((int) var4[var6], 255)];
          }
          var1[var2] = new Sprite(ImageProducerRasterBuffer.field_l, PasswordValidator.field_w, QuickChatCategory.field_x[var2], ViewportController.field_t[var2], IntrusiveDeque.field_h[var2], ErrorPrintHelpers.field_e[var2], var5);
        }
        var2Lifetime1 = 29 % ((param0 + 30) / 37);
        DecodedSpriteBuffers.clearDecodedSpriteData(-104);
        return var1;
    }

    final static void openPlayerContextMenu(String param0, int param1, String param2, int param3, ScrollPane param4, int[] param5, long param6, UiComponent param7, int param8) {
        try {
          PendingMove.field_d = param4;
          if (param1 != 255) {
            LobbyPlayerEntry.releaseStatics(-71);
          }
          EmailAvailabilityValidator.field_s = new PlayerContextMenu(param7, param6, param0, param2, param8, param3, param5);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "gd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    LobbyPlayerEntry(String param0, String param1, long param2) {
        super(0L, (UiComponent) null);
        CharSequence var6 = null;
        try {
          this.field_Yb = param1;
          this.field_Rb = param0;
          this.field_Nb = param2;
          var6 = (CharSequence) ((Object) this.field_Rb);
          DialWidgetPainter.normalizeDisplayName(var6, (byte) 115);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "gd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int hitTestMenuOption(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = TetraLink.field_J;
        try {
          var3_int = 0;
          var4 = TopLevelContainerHelpers.field_e;
          while (TopLevelContainerHelpers.field_h.length > var3_int) {
            var5 = ContentTransitionDialog.field_mb[var3_int];
            if (var5 >= 0) {
              var6 = AccountCreationDialog.measureText(true, TopLevelContainerHelpers.field_h[var3_int], (byte) -89);
              var7 = NameEntryPopup.field_Lb - (var6 >> 1);
              var4 = var4 + ChatLayoutHelpers.field_c;
              if (AnimationSequence.containsPoint(param1, -StartupFlagsHelpers.field_a + var7, var4, param0, var6 + (StartupFlagsHelpers.field_a << 1), LobbyUpdateHelpers.field_d + (CanvasAndErrorHelpers.field_e << 1), -113)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + ((CanvasAndErrorHelpers.field_e << 1) + ChatLayoutHelpers.field_c + LobbyUpdateHelpers.field_d);
            } else {
              var4 = var4 + DirectByteStorage.field_e;
            }
            var3_int++;
          }
          if (param2 == 8395) {
            stackIn_17_0 = -1;
            return stackIn_17_0;
          }
          stackIn_15_0 = 79;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var3), "gd.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void setMenuOptionMetrics(int param0, boolean param1, int param2, int param3, int param4) {
        FontAndFrameStyleHelpers.field_b = param3;
        if (param1) {
          return;
        }
        LoadingResourceHelpers.field_b = param4;
        DirectByteStorage.field_e = param2;
        LobbyUpdateHelpers.field_d = param0;
    }

    final static void unpackChatFilterSettings(int param0, int param1) {
        RegistrationResponseHelpers.field_e = param0 >> 4 & 3;
        RasterStackHelpers.field_b = param0 >> 2 & 3;
        if (!(2 >= RegistrationResponseHelpers.field_e)) {
          RegistrationResponseHelpers.field_e = 2;
        }
        if (!(RasterStackHelpers.field_b <= 2)) {
          RasterStackHelpers.field_b = 2;
        }
        IntrusiveNode.field_f = param1 & param0;
        if (!(IntrusiveNode.field_f <= 2)) {
          IntrusiveNode.field_f = 2;
        }
    }

    static {
        field_ec = "Your request to join has been declined.";
        field_Mb = 50;
    }
}
