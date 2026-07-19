/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wka {
    static int field_a;
    private static String field_z;

    final static int a(int param0, int param1, int param2, int param3) {
        oha var4 = null;
        var4 = al.a(-101, param1);
        if (var4 instanceof t) {
          if (-3 != (((t) ((Object) var4)).field_p ^ -1)) {
            if (param0 == 57) {
              if (var4 instanceof t) {
                if (-4 == (((t) ((Object) var4)).field_p ^ -1)) {
                  return (1 + param3) * 6200 / ((1 + param3) * param2 * 57 + 1);
                } else {
                  return param3 * 400 / param2;
                }
              } else {
                return param3 * 400 / param2;
              }
            } else {
              field_a = 79;
              if (var4 instanceof t) {
                if (-4 != (((t) ((Object) var4)).field_p ^ -1)) {
                  return param3 * 400 / param2;
                } else {
                  return (1 + param3) * 6200 / ((1 + param3) * param2 * 57 + 1);
                }
              } else {
                return param3 * 400 / param2;
              }
            }
          } else {
            return (12000 * param3 - -12000) / (param2 * (param3 * 57 - -57));
          }
        } else {
          if (param0 == 57) {
            if (var4 instanceof t) {
              if (-4 != (((t) ((Object) var4)).field_p ^ -1)) {
                return param3 * 400 / param2;
              } else {
                return (1 + param3) * 6200 / ((1 + param3) * param2 * 57 + 1);
              }
            } else {
              return param3 * 400 / param2;
            }
          } else {
            field_a = 79;
            if (var4 instanceof t) {
              if (-4 != (((t) ((Object) var4)).field_p ^ -1)) {
                return param3 * 400 / param2;
              } else {
                return (1 + param3) * 6200 / ((1 + param3) * param2 * 57 + 1);
              }
            } else {
              return param3 * 400 / param2;
            }
          }
        }
    }

    static {
        field_z = "wka.A(";
    }
}
