/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static int[] field_c;
    static le[] field_a;
    static le field_b;

    final static void b(int param0) {
        if (param0 != -25376) {
            dj.b(-79);
        }
    }

    final static String a(byte param0) {
        int var1 = 0;
        if (2 > mc.field_a) {
          return MonkeyPuzzle2.field_E;
        } else {
          if (null == ec.field_a) {
            if (!fj.field_B.a(116)) {
              return vb.field_i;
            } else {
              if (fj.field_B.a(0, "commonui")) {
                if (hf.field_a.a(102)) {
                  if (!hf.field_a.a(0, "commonui")) {
                    return ek.field_e + " - " + hf.field_a.a("commonui", (byte) -81) + "%";
                  } else {
                    var1 = 112 % ((param0 - 21) / 62);
                    if (ii.field_m.a(-108)) {
                      if (!ii.field_m.b(0)) {
                        return db.field_b + " - " + ii.field_m.b(true) + "%";
                      } else {
                        return eg.field_h;
                      }
                    } else {
                      return h.field_f;
                    }
                  }
                } else {
                  return uj.field_b;
                }
              } else {
                return ed.field_a + " - " + fj.field_B.a("commonui", (byte) -81) + "%";
              }
            }
          } else {
            if (!ec.field_a.a(71)) {
              return ug.field_b;
            } else {
              return tk.field_a;
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 16384) {
            field_b = (le) null;
        }
    }

    static {
        field_c = new int[16384];
    }
}
