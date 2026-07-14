/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie {
    static qm field_d;
    static w field_a;
    static int field_b;
    static ud field_e;
    static w field_c;

    abstract int a(byte param0, long param1);

    abstract void b(int param0);

    abstract long a(int param0);

    final static void a(ck[] param0, mm param1, ck[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, mm param12, ck[] param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        if (param16 != 10406) {
          return;
        } else {
          dh.a(param1, param7, param6, new cc(param0), new cc(param2), new cc(param13), param14, param3, param12, param10, param18, param11, param5, false, param15, param9, param17, param4, param8, param19);
          return;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_d = null;
        field_c = null;
        if (param0 >= -117) {
          var2 = null;
          ie.a((ck[]) null, (mm) null, (ck[]) null, 49, -127, -49, -3, 31, 17, -85, 4, 92, (mm) null, (ck[]) null, -45, 72, 26, 15, 123, 106);
          field_a = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          return;
        }
    }

    final int a(long param0, int param1) {
        long var4 = 0L;
        if (param1 != 4) {
          L0: {
            field_e = null;
            var4 = ((ie) this).a(param1 ^ -22966);
            if (0L < var4) {
              ua.a(var4, param1 ^ -124);
              break L0;
            } else {
              break L0;
            }
          }
          return ((ie) this).a((byte) 109, param0);
        } else {
          L1: {
            var4 = ((ie) this).a(param1 ^ -22966);
            if (0L < var4) {
              ua.a(var4, param1 ^ -124);
              break L1;
            } else {
              break L1;
            }
          }
          return ((ie) this).a((byte) 109, param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new qm(2, 4, 4, 0);
    }
}
