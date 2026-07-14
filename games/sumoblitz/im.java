/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static ha field_c;
    static hr field_a;
    static jn field_b;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static an a(byte param0, String param1) {
        if (param0 <= -23) {
          if (ad.field_p != vm.field_c) {
            if (st.field_z == vm.field_c) {
              if (!param1.equals((Object) (Object) tl.field_s)) {
                jh.field_z = null;
                vm.field_c = ad.field_p;
                tl.field_s = param1;
                return null;
              } else {
                vm.field_c = hm.field_a;
                return jh.field_z;
              }
            } else {
              jh.field_z = null;
              vm.field_c = ad.field_p;
              tl.field_s = param1;
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_c = null;
          if (ad.field_p != vm.field_c) {
            if (st.field_z == vm.field_c) {
              if (!param1.equals((Object) (Object) tl.field_s)) {
                jh.field_z = null;
                vm.field_c = ad.field_p;
                tl.field_s = param1;
                return null;
              } else {
                vm.field_c = hm.field_a;
                return jh.field_z;
              }
            } else {
              jh.field_z = null;
              vm.field_c = ad.field_p;
              tl.field_s = param1;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
    }
}
