/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ModelMergeHelpers {
    static int field_g;
    static UiComponent field_e;
    static Boolean field_b;
    static IntrusiveDeque field_d;
    static TransitionPhase field_f;
    static long[] field_c;
    static String[] field_a;

    final static boolean tryAcquireChatSendPermit(byte param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = TetraLink.field_J;
        var1 = ClockAndTextHelpers.monotonicMillis(0);
        var3 = var1 - FontAndBrightnessHelpers.field_g;
        if (var3 > 30000L) {
          ConnectionTimingHelpers.field_b = 0;
          FontAndBrightnessHelpers.field_g = var1;
          return true;
        }
        var5 = 3000;
        if (7 <= ConnectionTimingHelpers.field_b) {
          var5 = 12000;
        } else {
          if (ConnectionTimingHelpers.field_b < 5) {
            if (ConnectionTimingHelpers.field_b >= 3) {
              var5 = 6000;
            }
          } else {
            var5 = 9000;
          }
        }
        if ((long)var5 < var3) {
          FontAndBrightnessHelpers.field_g = var1;
          ConnectionTimingHelpers.field_b = ConnectionTimingHelpers.field_b + 1;
          return true;
        }
        if (param0 < -24) {
          return false;
        }
        return true;
    }

    final static void mergeModelGeometry(Model param0, int param1, int param2, Model param3, int param4, int param5, int param6, Model param7, int param8, int param9) {
        byte fieldTemp$0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        Model var10 = null;
        int var10_int = 0;
        RuntimeException var10_ref = null;
        int var11 = 0;
        Model var10Lifetime1;
        Model var10Lifetime2;
        Model var10Lifetime3;
        Model var10Lifetime4;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var10_intLifetime3;
        int var10_intLifetime4;
        int var10_intLifetime5;
        int var10_intLifetime1Lifetime1;
        int var10_intLifetime2Lifetime1;
        int var10_intLifetime3Lifetime1;
        int var10_intLifetime4Lifetime1;
        var11 = TetraLink.field_J;
        try {
          DelayedIncomingPacket.field_w = param3.field_M;
          ReportAbuseDialog.field_Yb = param0.field_j;
          EditableTextWidget.field_S = param3.field_V;
          WidgetTheme.field_b = param3.field_p;
          ChatMessage.field_p = param0.field_M;
          EmailAvailabilityValidator.field_D = param0.field_A;
          LobbyListHelpers.field_c = param0.field_Y;
          IconLabelItem.field_Mb = param0.field_k;
          Bzip2State.field_q = param0.field_gb;
          NineSliceFrame.field_a = param0.field_kb;
          PatchNoteUsage.field_s = param3.field_Y;
          SharedPanelFactory.field_c = param3.field_t;
          JoinGameTextGlobals.field_b = param0.field_hb;
          DualLinkNode.field_r = param3.field_I;
          MiscTextGlobals.field_b = param0.field_t;
          IntroFinalFrameHelpers.field_d = param0.field_p;
          QuickChatCommandType.field_f = param3.field_A;
          GameApplet.field_f = param3.field_k;
          LobbyPlayerEntry.field_Zb = param0.field_V;
          WhirlpoolHasher.field_m = param0.field_I;
          TextureCache.field_l = param3.field_kb;
          IntrusiveNode.field_m = param3.field_hb;
          SecondaryNodeDeque.field_b = param3.field_j;
          RasterTargetHelpers.field_a = param3.field_gb;
          ProxyAuthenticationRequiredException.splitModelByPlane(param4, param2, param7.field_kb, param8, param9, param7.field_V, (ModelData) null, param7.field_ob, param7.field_M, param5, param7.field_E, param7.field_gb, param7.field_t, 118, param1, param7.field_Y, param7.field_I, param7.field_j, param7.field_hb, param7.field_k, param7.field_p, param7.field_ib, (byte[]) null, param7.field_A);
          param3.field_V = EditableTextWidget.field_S;
          param3.field_ib = ClockAndTextHelpers.field_e;
          param3.field_j = SecondaryNodeDeque.field_b;
          param3.field_A = QuickChatCommandType.field_f;
          param3.field_I = DualLinkNode.field_r;
          param3.field_k = GameApplet.field_f;
          param3.field_kb = TextureCache.field_l;
          param3.field_nb = IterableNodeHashTable.field_e;
          param3.field_t = SharedPanelFactory.field_c;
          param3.field_gb = RasterTargetHelpers.field_a;
          param3.field_ob = HuffmanCodec.field_g;
          param3.field_M = DelayedIncomingPacket.field_w;
          param3.field_Y = PatchNoteUsage.field_s;
          param3.field_p = WidgetTheme.field_b;
          param3.field_E = ConditionalTextValue.field_d;
          param3.field_hb = IntrusiveNode.field_m;
          param0.field_A = EmailAvailabilityValidator.field_D;
          param0.field_kb = NineSliceFrame.field_a;
          param0.field_Y = LobbyListHelpers.field_c;
          param0.field_ib = InsetTextPainter.field_u;
          if (param6 != 100) {
            return;
          }
          param0.field_I = WhirlpoolHasher.field_m;
          param0.field_k = IconLabelItem.field_Mb;
          param0.field_gb = Bzip2State.field_q;
          param0.field_ob = QuickChatMenu.field_Xb;
          param0.field_t = MiscTextGlobals.field_b;
          param0.field_E = FullscreenCanvasHelpers.field_p;
          param0.field_M = ChatMessage.field_p;
          param0.field_p = IntroFinalFrameHelpers.field_d;
          param0.field_j = ReportAbuseDialog.field_Yb;
          param0.field_hb = JoinGameTextGlobals.field_b;
          param0.field_nb = DebouncedValidator.field_b;
          param0.field_V = LobbyPlayerEntry.field_Zb;
          if (null != param7.field_U) {
            if (param3.field_U == null ||
              !(param3.field_ob <= param3.field_U.length)) {
              param3.field_U = new byte[100 + param3.field_ob];
            }
            if (null == param0.field_U ||
              !(param0.field_ob <= param0.field_U.length)) {
              param0.field_U = new byte[param0.field_ob + 100];
            }
            for (var10_int = 0; param3.field_ob > var10_int; var10_int++) {
              param3.field_U[var10_int] = param7.field_U[KeyHandlerHelpers.field_c[var10_int]];
            }
            for (var10_intLifetime5 = 0; param0.field_ob > var10_intLifetime5; var10_intLifetime5++) {
              param0.field_U[var10_intLifetime5] = param7.field_U[QuickChatMenuFactory.field_b[var10_intLifetime5]];
            }
          } else {
            param0.field_U = null;
            var10 = param3;
            var10.field_U = null;
            fieldTemp$0 = param7.field_K;
            param0.field_K = param7.field_K;
            param3.field_K = fieldTemp$0;
          }
          if (param7.field_eb != null) {
            if (param3.field_eb == null ||
              !(param3.field_ob <= param3.field_eb.length)) {
              param3.field_eb = new byte[100 + param3.field_ob];
            }
            if (null == param0.field_eb ||
              !(param0.field_ob <= param0.field_eb.length)) {
              param0.field_eb = new byte[100 + param0.field_ob];
            }
            for (var10_intLifetime1 = 0; var10_intLifetime1 < param3.field_ob; var10_intLifetime1++) {
              param3.field_eb[var10_intLifetime1] = param7.field_eb[KeyHandlerHelpers.field_c[var10_intLifetime1]];
            }
            for (var10_intLifetime1Lifetime1 = 0; param0.field_ob > var10_intLifetime1Lifetime1; var10_intLifetime1Lifetime1++) {
              param0.field_eb[var10_intLifetime1Lifetime1] = param7.field_eb[QuickChatMenuFactory.field_b[var10_intLifetime1Lifetime1]];
            }
          } else {
            var10Lifetime1 = param3;
            param0.field_eb = null;
            var10Lifetime1.field_eb = null;
          }
          if (null != param7.field_u) {
            if (param3.field_u == null ||
              !(param3.field_ob <= param3.field_u.length)) {
              param3.field_u = new byte[100 + param3.field_ob];
            }
            if (param0.field_u == null ||
              !(param0.field_u.length >= param0.field_ob)) {
              param0.field_u = new byte[100 + param0.field_ob];
            }
            for (var10_intLifetime2 = 0; var10_intLifetime2 < param3.field_ob; var10_intLifetime2++) {
              param3.field_u[var10_intLifetime2] = param7.field_u[KeyHandlerHelpers.field_c[var10_intLifetime2]];
            }
            for (var10_intLifetime2Lifetime1 = 0; param0.field_ob > var10_intLifetime2Lifetime1; var10_intLifetime2Lifetime1++) {
              param0.field_u[var10_intLifetime2Lifetime1] = param7.field_u[QuickChatMenuFactory.field_b[var10_intLifetime2Lifetime1]];
            }
          } else {
            param0.field_u = null;
            var10Lifetime2 = param3;
            var10Lifetime2.field_u = null;
          }
          if (param7.field_r != null) {
            if (null == param3.field_r ||
              !(param3.field_r.length >= param3.field_ob)) {
              param3.field_r = new short[100 + param3.field_ob];
            }
            if (param0.field_r == null ||
              !(param0.field_r.length >= param0.field_ob)) {
              param0.field_r = new short[100 + param0.field_ob];
            }
            for (var10_intLifetime3 = 0; param3.field_ob > var10_intLifetime3; var10_intLifetime3++) {
              param3.field_r[var10_intLifetime3] = param7.field_r[KeyHandlerHelpers.field_c[var10_intLifetime3]];
            }
            for (var10_intLifetime3Lifetime1 = 0; param0.field_ob > var10_intLifetime3Lifetime1; var10_intLifetime3Lifetime1++) {
              param0.field_r[var10_intLifetime3Lifetime1] = param7.field_r[QuickChatMenuFactory.field_b[var10_intLifetime3Lifetime1]];
            }
          } else {
            param0.field_r = null;
            var10Lifetime3 = param3;
            var10Lifetime3.field_r = null;
          }
          if (null != param7.field_J) {
            if (null == param3.field_J ||
              !(param3.field_J.length >= param3.field_ob)) {
              param3.field_J = new short[param3.field_ob + 100];
            }
            if (null == param0.field_J ||
              !(param0.field_J.length >= param0.field_ob)) {
              param0.field_J = new short[param0.field_ob + 100];
            }
            for (var10_intLifetime4 = 0; var10_intLifetime4 < param3.field_ob; var10_intLifetime4++) {
              param3.field_J[var10_intLifetime4] = param7.field_J[KeyHandlerHelpers.field_c[var10_intLifetime4]];
            }
            for (var10_intLifetime4Lifetime1 = 0; param0.field_ob > var10_intLifetime4Lifetime1; var10_intLifetime4Lifetime1++) {
              param0.field_J[var10_intLifetime4Lifetime1] = param7.field_J[QuickChatMenuFactory.field_b[var10_intLifetime4Lifetime1]];
            }
            return;
          }
          var10Lifetime4 = param3;
          param0.field_J = null;
          var10Lifetime4.field_J = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_86_0 = var10_ref;
          stackIn_86_1 = new StringBuilder().append("ui.D(");
          if (param0 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_86_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 12000) {
          return;
        }
        field_e = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static int nextRandomInt(int param0, int param1) {
        if (param1 != 1692) {
          return 27;
        }
        return BoardAnimator.nextBoundedRandom(ScrollPane.field_Mb, (byte) 118, param0);
    }

    static {
        field_f = new TransitionPhase();
        field_c = new long[32];
        field_a = new String[]{"Link Newcomer", "Link Challenger", "Victory on the Grid", "Attunement to the Grid", "Mastery of the Grid", "Link Duality", "PentaLink", "Ghosts in the Machine"};
    }
}
