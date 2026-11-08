/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheckRequest extends IntrusiveNode {
    int[] field_r;
    static ScrollContainer field_k;
    static long field_m;
    static int field_t;
    int[] field_u;
    int field_p;
    static int field_n;
    int field_s;
    PlatformTask[] field_v;
    byte[][][] field_w;
    int[] field_q;
    PlatformTask[] field_l;
    static int[] field_o;

    final static Object createByteStorage(boolean param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        DirectByteStorage var4 = null;
        Object stackIn_2_0 = null;
        DirectByteStorage stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          var3_int = -39 / ((param2 + 35) / 52);
          if (param1.length > 136) {
            var4 = new DirectByteStorage();
            ((ByteStorage) ((Object) var4)).setBytes(param1, true);
            stackIn_5_0 = var4;
            return stackIn_5_0;
          }
          if (param0) {
            stackIn_10_0 = LoadingStepTracker.copyBytes(true, param1);
            return stackIn_10_0;
          }
          stackIn_8_0 = (byte[]) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("aj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_o = null;
        if (param0 != -38) {
          return;
        }
        field_k = null;
    }

    final static void initializeLobbyChatResources(ResourceArchive param0, ResourceArchive param1, boolean param2, int param3) {
        try {
          nk.buildChatPanelComponents(ProxySocketConnector.field_k, EditableTextWidget.field_Y, ug.field_s, ConditionalTextValue.field_g, (byte) 125, ArchiveIndex.field_l, dn.field_c, bl.field_d, RetroBlock.field_d, param2, TextFieldValidator.field_h, l.field_q);
          Checkbox.field_V = SocketConnector.loadRgbSpritesByName("chatfilter", "lobby", (byte) 47, param1);
          LoginCredentials.field_a[1] = NameSuggestionsPanel.field_J;
          int var4_int = -115 % ((param3 - 44) / 59);
          LoginCredentials.field_a[0] = EmailConfirmationValidator.field_m;
          LoginCredentials.field_a[2] = GrowableIntList.field_e;
          FloatingSquare.createQuickChatResources(65793, ig.field_d, param0);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "aj.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean isWaitingForAccountData(byte param0) {
        if (param0 > -42) {
          byte[] var2 = (byte[]) null;
          ReflectionCheckRequest.createByteStorage(false, (byte[]) null, -36);
          if (!LoadingStep.field_a) {
            return ArrayWidgetContainer.isAccountUiActive((byte) 78) ? true : false;
          }
          if (!TextHotspotWidget.field_U) {
            return ArrayWidgetContainer.isAccountUiActive((byte) 78) ? true : false;
          }
          return true;
        }
        if (LoadingStep.field_a) {
          if (TextHotspotWidget.field_U) {
            return true;
          }
          return ArrayWidgetContainer.isAccountUiActive((byte) 78) ? true : false;
        }
        if (!ArrayWidgetContainer.isAccountUiActive((byte) 78)) {
          return false;
        }
        return true;
    }

    ReflectionCheckRequest() {
    }

    static {
        field_o = new int[]{303, 375, 440, 498, 560};
    }
}
