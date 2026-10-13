/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListPanel extends ClientUiComponent {
    ClientUiComponent removeButton;
    static jl field_Mb;
    ClientUiComponent addButton;
    ClientUiComponent listContent;
    static RgbSprite field_Jb;
    ScrollContainer scrollContainer;
    static QuickChatCategoryRepository quickChatCategories;
    static String field_Pb;
    static ClientUiComponent field_Lb;
    static MusicTrack field_Ob;
    static ClientUiComponent field_Qb;

    SocialListPanel(long key, SocialListPanel style, String addLabel, String removeLabel) {
        this(key, style, style.scrollContainer.viewport, style.scrollContainer.scrollbar, style.addButton, addLabel, removeLabel);
    }

    final void setLayout(int x, int scrollbarWidth, int gap, int buttonHeight, int width, int y, int height, byte obfuscationGuard) {
        if (obfuscationGuard <= -34) {
          this.width = width;
          this.x = x;
          this.y = y;
          this.height = height;
          this.layoutControls((byte) -110, scrollbarWidth, buttonHeight, gap);
          return;
        }
        SocialListPanel.k(17);
        this.width = width;
        this.x = x;
        this.y = y;
        this.height = height;
        this.layoutControls((byte) -110, scrollbarWidth, buttonHeight, gap);
    }

    public static void l(int param0) {
        field_Pb = null;
        field_Qb = null;
        field_Ob = null;
        if (param0 != -8291) {
          SocialListPanel.l(-93);
          field_Jb = null;
          quickChatCategories = null;
          field_Mb = null;
          field_Lb = null;
          return;
        }
        field_Jb = null;
        quickChatCategories = null;
        field_Mb = null;
        field_Lb = null;
    }

    SocialListPanel(long key, ClientUiComponent style, ClientUiComponent viewportStyle, VerticalScrollbar scrollbarStyle, ClientUiComponent buttonStyle, String addLabel, String removeLabel) {
        super(key, style);
        try {
          this.listContent = new ClientUiComponent(0L, (ClientUiComponent) null);
          this.scrollContainer = new ScrollContainer(0L, this.listContent, viewportStyle, scrollbarStyle);
          this.addButton = new ClientUiComponent(0L, buttonStyle);
          this.removeButton = new ClientUiComponent(0L, buttonStyle);
          this.addButton.text = addLabel;
          this.removeButton.text = removeLabel;
          this.addChild(this.scrollContainer, 41);
          this.addChild(this.addButton, 80);
          this.addChild(this.removeButton, 111);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mp.<init>(" + key + ',' + (style != null ? "{...}" : "null") + ',' + (viewportStyle != null ? "{...}" : "null") + ',' + (scrollbarStyle != null ? "{...}" : "null") + ',' + (buttonStyle != null ? "{...}" : "null") + ',' + (addLabel != null ? "{...}" : "null") + ',' + (removeLabel != null ? "{...}" : "null") + ')');
        }
    }

    final static int k(int param0) {
        if (param0 <= -38) {
          return nr.field_e.baselineHeight - nr.field_e.maxDescent + (-(nr.field_e.maxAscent >> 1) + (nr.field_e.xHeight >> 2) + 3);
        }
        return 60;
    }

    final void layoutControls(byte obfuscationGuard, int scrollbarWidth, int buttonHeight, int gap) {
        int var5 = (this.width + gap) / 2;
        int var6 = this.height - buttonHeight;
        this.scrollContainer.setLayout(0, false, this.width, gap, scrollbarWidth, 0, -gap + var6);
        this.addButton.x = 0;
        this.addButton.height = buttonHeight;
        this.addButton.y = var6;
        this.addButton.width = var5 - gap;
        this.removeButton.y = var6;
        this.removeButton.width = this.width - var5;
        this.removeButton.x = var5;
        this.removeButton.height = buttonHeight;
        if (obfuscationGuard == -110) {
          return;
        }
        this.layoutControls((byte) 61, 6, 46, 70);
    }

    static {
        field_Pb = "Passwords must be between 5 and 20 characters long";
        field_Mb = new jl();
    }
}
