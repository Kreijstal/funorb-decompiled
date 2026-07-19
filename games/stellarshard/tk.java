/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static String field_a;
    static pb field_c;
    static int field_b;

    final static void a(int param0) {
        String var1 = null;
        int var2 = 0;
        if (!gk.field_a) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (ei.field_G != null) {
              ei.field_G.o(3);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = kl.a((byte) 124);
          af.field_r = new la(var1, (String) null, true, false, false);
          na.field_d.a((byte) 107, (rj) (sf.field_f));
          sf.field_f.b(af.field_r, 23143);
          sf.field_f.i(3642);
          var2 = -85 / ((61 - param0) / 57);
          return;
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        if (param3 <= -101) {
          ui.field_F.e(param1, param2);
          if (param0) {
            L0: {
              var4 = 2 * (gj.field_v % ui.field_F.field_v);
              if (ui.field_F.field_v > var4) {
                break L0;
              } else {
                var4 = -var4 - -ui.field_F.field_v + ui.field_F.field_v;
                break L0;
              }
            }
            if (var4 < 10) {
              var4 = 10;
              te.a(30, param2, param1, var4, 80, 0, ui.field_F, 0, (byte) -102);
              return;
            } else {
              if (-40 + ui.field_F.field_v < var4) {
                var4 = -40 + ui.field_F.field_v;
                te.a(30, param2, param1, var4, 80, 0, ui.field_F, 0, (byte) -102);
                return;
              } else {
                te.a(30, param2, param1, var4, 80, 0, ui.field_F, 0, (byte) -102);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static long b(int param0) {
        if (param0 < 124) {
            return 12L;
        }
        return ih.a((byte) -98) - ka.field_o;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -86) {
            tk.a((byte) -52);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_a = "to return to the normal view.";
    }
}
