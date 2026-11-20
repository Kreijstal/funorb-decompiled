/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextFieldRenderer extends TextWidgetStyle {
    static String[] field_r;
    static MenuSelectionController field_q;
    static PlatformTaskDispatcher field_v;
    static NamedSoundEffect field_t;
    static MeshMaterial[] field_s;
    static String field_u;

    public final void drawWidget(boolean param0, int param1, int param2, UiWidget param3, int param4) {
        try {
          if (param2 >= -48) {
            field_s = (MeshMaterial[]) null;
          }
          if (param0) {
            GrowableStringList.drawGradientBorder(param1 + param3.x, param3.width, 152, param4 + param3.y, param3.height);
          }
          super.drawWidget(param0, param1, -106, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "kl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    TextFieldRenderer(int param0) {
        this(IntrusiveNode.field_g, param0);
    }

    TextFieldRenderer(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.ascent, -1, 2147483647, false);
    }

    public static void clearSharedReferences(boolean param0) {
        field_t = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_u = null;
        field_v = null;
        if (!param0) {
          field_q = (MenuSelectionController) null;
        }
    }

    final static NameAvailabilityResult a(boolean param0, int param1) {
        NameAvailabilityResult var2 = new NameAvailabilityResult(true);
        if (param1 == 0) {
          var2.field_i = param0 ? true : false;
          return var2;
        }
        field_r = (String[]) null;
        var2.field_i = param0 ? true : false;
        return var2;
    }

    static {
        field_r = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_q = new MenuSelectionController(1);
    }
}
