/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static String field_a;

    final static void c(int param0) {
        if (param0 >= -9) {
            field_a = (String) null;
        }
    }

    final static boolean b(int param0) {
        int discarded$6 = 0;
        if (param0 == 255) {
          if (-21 >= (mi.field_C ^ -1)) {
            if (fj.f(-31456)) {
              if ((ik.field_a ^ -1) < -1) {
                if (ck.b(0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          discarded$6 = bl.a(-112, (byte) -119);
          if (-21 >= (mi.field_C ^ -1)) {
            if (fj.f(-31456)) {
              if ((ik.field_a ^ -1) < -1) {
                if (ck.b(0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static int a(int param0, byte param1) {
        param0 = (-715827883 & param0 >>> -1925489311) + (1431655765 & param0);
        if (param1 != 70) {
          field_a = (String) null;
          param0 = (param0 & 858993459) - -(param0 >>> -1715558078 & 858993459);
          param0 = param0 + (param0 >>> -1073219292) & 252645135;
          param0 = param0 + (param0 >>> 1208603944);
          param0 = param0 + (param0 >>> 526672816);
          return param0 & 255;
        } else {
          param0 = (param0 & 858993459) - -(param0 >>> -1715558078 & 858993459);
          param0 = param0 + (param0 >>> -1073219292) & 252645135;
          param0 = param0 + (param0 >>> 1208603944);
          param0 = param0 + (param0 >>> 526672816);
          return param0 & 255;
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        if (param0 != -9751) {
            discarded$0 = bl.a(31, (byte) -123);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = "Achievements";
    }
}
