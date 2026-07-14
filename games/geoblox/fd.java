/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    int field_a;

    final static void a(java.applet.Applet param0, int param1) {
        int var2 = 0;
        String var3 = null;
        CharSequence var4 = null;
        var2 = 126 % ((-26 - param1) / 49);
        var3 = param0.getParameter("username");
        if (var3 != null) {
          var4 = (CharSequence) (Object) var3;
          if (0L == rh.a(var4, -48)) {
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, gd param1, boolean param2, int param3) {
        kl var4 = null;
        cg var5 = null;
        var4 = kl.a(param1, 100, param3);
        var5 = rl.a(param0, (ia) (Object) var4, 1000);
        qa.field_f.a(-103, (hf) (Object) new je(var4, (hf) (Object) var5));
        if (param2) {
          return;
        } else {
          ge.field_d.a((ia) (Object) var5);
          return;
        }
    }

    static {
    }
}
