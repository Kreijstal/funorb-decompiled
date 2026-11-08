/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LabelPairWidget extends UiComponent {
    static boolean field_Pb;
    static UiComponent field_Kb;
    static String field_Mb;
    private UiComponent field_Ob;
    private UiComponent field_Lb;
    static String field_Nb;

    final static void bindSocialLists(UiComponent param0, UiComponent param1, int param2) {
        try {
          if (null == param0.field_fb) {
            param0.field_fb = new IntrusiveDeque();
          }
          if (null == param1.field_fb) {
            param1.field_fb = new IntrusiveDeque();
          }
          if (null == DelegatingCanvas.field_f) {
            DelegatingCanvas.field_f = new DualLinkNodeHashTable(64);
          }
          if (null == LoginDialog.field_nb) {
            LoginDialog.field_nb = new DualLinkNodeHashTable(64);
          }
          CheckboxPainter.field_j = param0.field_fb;
          PasswordValidator.field_s = param1.field_fb;
          TwoColumnListPanel.clearSocialLists(param2 + param2);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "mi.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param2 != 3) {
          return;
        }
        this.setBounds((byte) -98, param1, param5, param3, param0);
        this.layoutContent(param4, 62);
    }

    private final void layoutContent(int param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        this.field_Lb.setBounds((byte) -123, this.field_Lb.measureUnconstrainedWidth(-122), 0, this.field_R, 0);
        if (param1 <= 46) {
          field_Mb = (String) null;
          var3 = this.field_Lb.field_Hb + param0;
          this.field_Ob.setBounds((byte) -121, this.field_Hb - var3, 0, this.field_R, var3);
          return;
        }
        var3Lifetime1 = this.field_Lb.field_Hb + param0;
        this.field_Ob.setBounds((byte) -121, this.field_Hb - var3Lifetime1, 0, this.field_R, var3Lifetime1);
    }

    LabelPairWidget(long param0, Sprite param1, Sprite param2, int param3, UiComponent param4, String param5) {
        this(param0, (UiComponent) null, param4, param5);
        try {
          this.field_Lb.field_vb = param2;
          this.field_Lb.field_X = param1;
          this.field_Lb.field_J = param3;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "mi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int measureRowWidth(int param0, int param1) {
        if (param0 > -118) {
          field_Nb = (String) null;
          return this.field_Lb.measureUnconstrainedWidth(-81) + (param1 + this.field_Ob.measureUnconstrainedWidth(-85));
        }
        return this.field_Lb.measureUnconstrainedWidth(-81) + (param1 + this.field_Ob.measureUnconstrainedWidth(-85));
    }

    final static void sendByteRequest(int param0, int param1, int param2) {
        BitPacketBuffer var3 = QuickChatHelpDialog.field_Lb;
        var3.writeCipheredByte(param2, (byte) -92);
        var3.writeByte(param0, false);
        var3.writeByte(10, false);
        var3.writeShort(param1, false);
    }

    LabelPairWidget(long param0, LabelPairWidget param1, String param2) {
        this(param0, param1.field_Lb, param1.field_Ob, param2);
    }

    public static void releaseStatics(int param0) {
        field_Kb = null;
        field_Mb = null;
        if (param0 != 0) {
          field_Mb = (String) null;
          field_Nb = null;
          return;
        }
        field_Nb = null;
    }

    private LabelPairWidget(long param0, UiComponent param1, UiComponent param2, String param3) {
        super(param0, (UiComponent) null);
        try {
          this.field_Lb = new UiComponent(0L, param1);
          this.field_Ob = new UiComponent(0L, param2);
          this.field_Ob.field_jb = param3;
          this.addChild((byte) 94, this.field_Lb);
          this.addChild((byte) -88, this.field_Ob);
          this.markTreeDirty((byte) 95);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "mi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Mb = "<%0> has joined your game.";
        field_Nb = "Add <%0> to ignore list";
    }
}
