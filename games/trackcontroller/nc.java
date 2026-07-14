/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends di {
    final ud a(int param0, String param1) {
        int var3 = 0;
        Object var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = (CharSequence) (Object) param1;
        if (!ej.a(false, var5)) {
          return ef.field_b;
        } else {
          if (param0 < -106) {
            var7 = (CharSequence) (Object) param1;
            var3 = uk.a(var7, 10);
            if (-1 < var3) {
              if ((var3 ^ -1) < -131) {
                return ef.field_b;
              } else {
                return TrackController.field_G;
              }
            } else {
              return ef.field_b;
            }
          } else {
            var4 = null;
            ud discarded$2 = ((nc) this).a(-109, (String) null);
            var6 = (CharSequence) (Object) param1;
            var3 = uk.a(var6, 10);
            if (-1 > (var3 ^ -1)) {
              if (var3 < -131) {
                return ef.field_b;
              } else {
                return TrackController.field_G;
              }
            } else {
              return ef.field_b;
            }
          }
        }
    }

    nc(lb param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        if (((nc) this).a(-117, param0) == ef.field_b) {
            return ol.field_m;
        }
        if (param1 == 426) {
            return null;
        }
        return null;
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -131) {
            nc.a(false, 96);
            ki.a(true, 0, param0);
            return;
        }
        ki.a(true, 0, param0);
    }

    static {
    }
}
