/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk implements dja {
    static String field_a;

    public final tv a(byte param0) {
        int var2 = -55 / ((-64 - param0) / 50);
        return (tv) (Object) new vp();
    }

    final static boolean a(int param0, fm param1, fm param2) {
        if (param2.field_c < param1.field_c) {
          return true;
        } else {
          if (param1.field_c != param2.field_c) {
            if (param0 != -27544) {
              field_a = null;
              return false;
            } else {
              return false;
            }
          } else {
            if (param2.field_a >= param1.field_a) {
              if (param0 == -27544) {
                return false;
              } else {
                field_a = null;
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_a = null;
        if (param0 < 27) {
            uk.c((byte) -7);
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            tv discarded$0 = ((uk) this).a((byte) 15);
            return (tv[]) (Object) new vp[param1];
        }
        return (tv[]) (Object) new vp[param1];
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        rg.field_b = false;
        hab.field_j = null;
        if (!tla.field_c) {
          var1 = jl.field_p;
          if (var1 > 0) {
            if ((var1 ^ -1) == -2) {
              hab.field_j = nnb.field_d;
              hab.field_j = geb.a(0, new CharSequence[3]);
              hwa.field_o.l((byte) -106);
              gib.a((byte) -89);
              if (param0 <= 30) {
                uk.c((byte) 6);
                return;
              } else {
                return;
              }
            } else {
              hab.field_j = isa.a(bva.field_g, new String[1], 119);
              hab.field_j = geb.a(0, new CharSequence[3]);
              hwa.field_o.l((byte) -106);
              gib.a((byte) -89);
              if (param0 > 30) {
                return;
              } else {
                uk.c((byte) 6);
                return;
              }
            }
          } else {
            hwa.field_o.l((byte) -106);
            gib.a((byte) -89);
            if (param0 > 30) {
              return;
            } else {
              uk.c((byte) 6);
              return;
            }
          }
        } else {
          hwa.field_o.g(-123);
          if (param0 <= 30) {
            uk.c((byte) 6);
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> wants to join";
    }
}
