/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int[] field_f;
    static int field_e;
    int field_d;
    static float field_b;
    int field_a;
    int[] field_c;

    final int a(int param0) {
        if (param0 == 0) {
          if (((lk) this).field_c != null) {
            if (0 == ((lk) this).field_c.length) {
              return 0;
            } else {
              return ((lk) this).field_c[-1 + ((lk) this).field_c.length];
            }
          } else {
            return 0;
          }
        } else {
          field_f = null;
          if (((lk) this).field_c != null) {
            if (0 == ((lk) this).field_c.length) {
              return 0;
            } else {
              return ((lk) this).field_c[-1 + ((lk) this).field_c.length];
            }
          } else {
            return 0;
          }
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        if (null != ((lk) this).field_c) {
          if (((lk) this).field_c.length != 0) {
            var3 = 1;
            L0: while (true) {
              if (((lk) this).field_c.length > var3) {
                if (((lk) this).field_c[var3] + ((lk) this).field_c[-1 + var3] >> 1 <= param1) {
                  var3++;
                  continue L0;
                } else {
                  return var3 + -1;
                }
              } else {
                var3 = 35 / ((param0 - -9) / 51);
                return ((lk) this).field_c.length + -1;
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    public static void a(byte param0) {
        if (param0 != 0) {
            lk.a((byte) 43);
            field_f = null;
            return;
        }
        field_f = null;
    }

    lk(int param0, int param1, int param2) {
        ((lk) this).field_d = param0;
        ((lk) this).field_c = new int[1 + param2];
        ((lk) this).field_a = param1;
    }

    static {
    }
}
