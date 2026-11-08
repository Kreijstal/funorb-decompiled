/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RawDataNode extends IntrusiveNode {
    static MenuInputState field_g;
    byte[] field_t;
    static MainMenuDialog field_k;
    static SpriteFrame field_s;
    static SceneWidget field_i;
    static int field_m;
    static String field_p;
    static int field_o;
    static int field_q;
    static int field_r;
    static int[] field_n;
    static SceneWidget field_u;
    static int field_l;
    static int[] field_v;
    static String field_h;
    static String field_j;

    final static String formatChatPrefix(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 3) {
            stackIn_3_0 = NameRecord.field_a;
            return stackIn_3_0;
          }
          if (6 == param2) {
            stackIn_6_0 = HighscoreEntry.field_k;
            return stackIn_6_0;
          }
          if (param2 == 7) {
            stackIn_10_0 = MenuButtonPainter.field_v;
            return stackIn_10_0;
          }
          if (param2 == 8) {
            stackIn_14_0 = EffectVolumeHelpers.field_f;
            return stackIn_14_0;
          }
          if (param0 >= -5) {
            field_o = -110;
          }
          if (param2 == 9) {
            stackIn_19_0 = ViewportController.field_n;
            return stackIn_19_0;
          }
          if (10 == param2) {
            stackIn_23_0 = LoginMethodHelpers.field_c;
            return stackIn_23_0;
          }
          if (11 == param2) {
            stackIn_27_0 = ResizableViewResizeListener.field_f;
            return stackIn_27_0;
          }
          if (param2 != 14) {
            return null;
          }
          stackIn_31_0 = CachedArchiveProvider.formatTemplate(-17, new String[]{param1}, KeyboardInputHandler.field_k);
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("vf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(')').toString());
        }
    }

    final static SocialListEntry lookupSocialEntry(long param0, int param1) {
        if (param1 != 8192) {
          field_h = (String) null;
          return (SocialListEntry) (OptionsDialog.field_qb.get(param0, (byte) -121));
        }
        return (SocialListEntry) (OptionsDialog.field_qb.get(param0, (byte) -121));
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        field_h = null;
        field_p = null;
        field_u = null;
        field_n = null;
        field_s = null;
        field_j = null;
        field_g = null;
        if (param0 == 27494) {
          field_v = null;
          field_k = null;
          return;
        }
        RawDataNode.lookupSocialEntry(-96L, -109);
        field_v = null;
        field_k = null;
    }

    RawDataNode(byte[] param0) {
        try {
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new MenuInputState(1);
        field_p = "Press '<col=ffffff><%0></col>' or '<col=ffffff><%1></col>' to cycle through your minions or to centre on your Arcanist.<br>  Use the '<col=ffffff>Arrow keys</col>' to scroll around the map.";
        NameCheckRequest.configureSpeed(100, 50);
        field_v = new int[8192];
        field_h = "Spellbook not acquired";
    }
}
