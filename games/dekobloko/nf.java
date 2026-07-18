/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static lm field_d;
    static int[] field_f;
    int field_c;
    static cc field_g;
    int field_i;
    static int field_e;
    static boolean field_b;
    static int field_h;
    int[] field_a;

    final int b(int param0) {
        if (param0 == -6375) {
          if (null != ((nf) this).field_a) {
            if (0 == ((nf) this).field_a.length) {
              return 0;
            } else {
              return ((nf) this).field_a[((nf) this).field_a.length - 1];
            }
          } else {
            return 0;
          }
        } else {
          int discarded$6 = ((nf) this).b(75);
          if (null != ((nf) this).field_a) {
            if (0 == ((nf) this).field_a.length) {
              return 0;
            } else {
              return ((nf) this).field_a[((nf) this).field_a.length - 1];
            }
          } else {
            return 0;
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        fl.a(param3 - -20, 256, 16777215, o.field_c, param1, (mm) (Object) w.field_kb);
        int discarded$1 = se.field_S.a(jg.field_k[param0], param1, param3 + 24, 120, 200, 16777215, -1, 0, 0, 16);
        if (param0 != 0) {
          if (param0 == 1) {
            fb.field_c[param4][4].c(param1 + 30, param3 + 101, 18, 18);
            fb.field_c[param4][4].c(48 + param1, 101 + param3, 18, 18);
            fb.field_c[param4][4].c(param1 - -66, param3 - -101, 18, 18);
            fb.field_c[param4][4].c(30 + param1, param3 + 83, 18, 18);
            fb.field_c[param4][4].c(66 + param1, param3 - -83, 18, 18);
            return;
          } else {
            return;
          }
        } else {
          fb.field_c[param4][0].c(30 + param1, param3 + 101, 18, 18);
          fb.field_c[param4][0].c(48 + param1, 101 + param3, 18, 18);
          fb.field_c[param4][0].c(param1 - -66, param3 - -101, 18, 18);
          fb.field_c[param4][0].c(48 + param1, 83 + param3, 18, 18);
          if (param0 != 1) {
            return;
          } else {
            fb.field_c[param4][4].c(param1 + 30, param3 + 101, 18, 18);
            fb.field_c[param4][4].c(48 + param1, 101 + param3, 18, 18);
            fb.field_c[param4][4].c(param1 - -66, param3 - -101, 18, 18);
            fb.field_c[param4][4].c(30 + param1, param3 + 83, 18, 18);
            fb.field_c[param4][4].c(66 + param1, param3 - -83, 18, 18);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_g = null;
        int var1 = -117 / ((-57 - param0) / 50);
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        if (((nf) this).field_a != null) {
          if (((nf) this).field_a.length != 0) {
            var3 = 1;
            L0: while (true) {
              if (((nf) this).field_a.length <= var3) {
                if (param1 <= 103) {
                  nf.a(-11);
                  return -1 + ((nf) this).field_a.length;
                } else {
                  return -1 + ((nf) this).field_a.length;
                }
              } else {
                if (param0 < ((nf) this).field_a[-1 + var3] + ((nf) this).field_a[var3] >> 1) {
                  return var3 + -1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final static boolean c(int param0) {
        return sc.field_l.a(true);
    }

    nf(int param0, int param1, int param2) {
        ((nf) this).field_c = param0;
        ((nf) this).field_a = new int[param2 + 1];
        ((nf) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
    }
}
