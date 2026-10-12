/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends ClientUiComponent {
    ClientUiComponent field_Rb;
    static jl field_Mb;
    ClientUiComponent field_Ib;
    ClientUiComponent field_Nb;
    static RgbSprite field_Jb;
    ScrollContainer field_Kb;
    static QuickChatCategoryRepository quickChatCategories;
    static String field_Pb;
    static ClientUiComponent field_Lb;
    static um field_Ob;
    static ClientUiComponent field_Qb;

    mp(long param0, mp param1, String param2, String param3) {
        this(param0, param1, param1.field_Kb.viewport, param1.field_Kb.scrollbar, param1.field_Ib, param2, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        if (param7 <= -34) {
          this.width = param4;
          this.x = param0;
          this.y = param5;
          this.height = param6;
          this.a((byte) -110, param1, param3, param2);
          return;
        }
        mp.k(17);
        this.width = param4;
        this.x = param0;
        this.y = param5;
        this.height = param6;
        this.a((byte) -110, param1, param3, param2);
    }

    public static void l(int param0) {
        field_Pb = null;
        field_Qb = null;
        field_Ob = null;
        if (param0 != -8291) {
          mp.l(-93);
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

    mp(long param0, ClientUiComponent param1, ClientUiComponent param2, VerticalScrollbar param3, ClientUiComponent param4, String param5, String param6) {
        super(param0, param1);
        try {
          this.field_Nb = new ClientUiComponent(0L, (ClientUiComponent) null);
          this.field_Kb = new ScrollContainer(0L, this.field_Nb, param2, param3);
          this.field_Ib = new ClientUiComponent(0L, param4);
          this.field_Rb = new ClientUiComponent(0L, param4);
          this.field_Ib.text = param5;
          this.field_Rb.text = param6;
          this.addChild(this.field_Kb, 41);
          this.addChild(this.field_Ib, 80);
          this.addChild(this.field_Rb, 111);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static int k(int param0) {
        if (param0 <= -38) {
          return nr.field_e.field_v - nr.field_e.field_L + (-(nr.field_e.field_H >> 1) + (nr.field_e.field_y >> 2) + 3);
        }
        return 60;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = (this.width + param3) / 2;
        int var6 = this.height - param2;
        this.field_Kb.setLayout(0, false, this.width, param3, param1, 0, -param3 + var6);
        this.field_Ib.x = 0;
        this.field_Ib.height = param2;
        this.field_Ib.y = var6;
        this.field_Ib.width = var5 - param3;
        this.field_Rb.y = var6;
        this.field_Rb.width = this.width - var5;
        this.field_Rb.x = var5;
        this.field_Rb.height = param2;
        if (param0 == -110) {
          return;
        }
        this.a((byte) 61, 6, 46, 70);
    }

    static {
        field_Pb = "Passwords must be between 5 and 20 characters long";
        field_Mb = new jl();
    }
}
