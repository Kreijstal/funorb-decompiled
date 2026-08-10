/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class li implements sp {
    private long field_a;
    static String field_b;

    public final String a(boolean param0) {
        String var3;
        if (param0) {
          if (!this.a(26921)) {
            if (kh.a(-104) < this.field_a + 350L) {
              return null;
            } else {
              return this.b(8192);
            }
          } else {
            return null;
          }
        } else {
          var3 = (String) null;
          li.a(-62, -108, (String) null);
          if (!this.a(26921)) {
            if (kh.a(-104) < this.field_a + 350L) {
              return null;
            } else {
              return this.b(8192);
            }
          } else {
            return null;
          }
        }
    }

    abstract pt c(int param0);

    public final void a(byte param0) {
        if (param0 <= 62) {
            this.b(-122);
            this.field_a = kh.a(-74);
            return;
        }
        this.field_a = kh.a(-74);
    }

    abstract String b(int param0);

    public final pt b(boolean param0) {
        if (!(!this.a(26921))) {
            return vb.field_o;
        }
        if (!param0) {
            this.a((byte) 120);
            if (!((kh.a(-113) ^ -1L) <= (this.field_a - -350L ^ -1L))) {
                return jc.field_Pc;
            }
            return this.c(0);
        }
        if (!((kh.a(-113) ^ -1L) <= (this.field_a - -350L ^ -1L))) {
            return jc.field_Pc;
        }
        return this.c(0);
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -90) {
            String var2 = (String) null;
            li.a(0, -79, (String) null);
        }
    }

    final static void a(int param0, int param1, String param2) {
        int var4 = 0;
        try {
            int var3_int = 101 % ((65 - param0) / 43);
            nm.field_a = false;
            ss.field_t = false;
            if (ml.field_m != null && ml.field_m.field_z) {
                if ((param1 ^ -1) != -9) {
                } else {
                    if (!nf.field_a) {
                        param2 = id.field_e;
                    } else {
                        param2 = jr.field_p;
                    }
                    param1 = 2;
                    vr.field_b.a(se.field_a, 122);
                }
                var4 = 1;
                if (!(10 != param1)) {
                    bt.a(10);
                    var4 = 0;
                }
                if (var4 != 0) {
                    if (!(!nm.field_a)) {
                        param2 = sn.a(bc.field_v, 107, new String[]{param2});
                    }
                    if (ae.field_f) {
                        param2 = sl.field_n;
                    }
                    ml.field_m.a((byte) -117, param1, param2);
                }
                if (256 != param1) {
                    if (10 == param1) {
                        return;
                    }
                    if (!nf.field_a) {
                        vr.field_b.h(310);
                        return;
                    }
                }
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "li.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "to return to the normal view.";
    }
}
