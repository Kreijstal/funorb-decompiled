/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static String[] field_a;
    private gm field_b;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            ut discarded$0 = j.a(112);
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        var3 = bo.a(-1, param1);
        var4 = -111 % ((-20 - param0) / 49);
        if (-1 == param2.indexOf(param1)) {
          if (param2.indexOf(var3) == -1) {
            if (!param2.startsWith(param1)) {
              if (!param2.startsWith(var3)) {
                if (!param2.endsWith(param1)) {
                  if (param2.endsWith(var3)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  return stackIn_12_0 != 0;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static ut a(int param0) {
        if (param0 != -5275) {
            field_a = null;
            return cv.field_b[ih.field_c][rm.field_C];
        }
        return cv.field_b[ih.field_c][rm.field_C];
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = ((j) this).field_b.field_R;
        if (!ia.field_c) {
          iw.a(param0 + 39, wa.field_a);
          on.b();
          ((j) this).field_b.a(1200, 300, 48, 90, (byte) -105);
          ta.e(127);
          wa.field_a.f(param2 - param0, -47 + param1);
          if (ia.field_c) {
            ((j) this).field_b.field_R = var4;
            return;
          } else {
            return;
          }
        } else {
          ((j) this).field_b.field_R = (((j) this).field_b.field_R + 1024) % 2048;
          iw.a(param0 + 39, wa.field_a);
          on.b();
          ((j) this).field_b.a(1200, 300, 48, 90, (byte) -105);
          ta.e(127);
          wa.field_a.f(param2 - param0, -47 + param1);
          if (!ia.field_c) {
            return;
          } else {
            ((j) this).field_b.field_R = var4;
            return;
          }
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 0) {
          ((j) this).field_b.field_G = 8;
          if ((param0 ^ -1) != -130) {
            ((j) this).field_b.a(2, (la[]) null, false, false);
            if (param1 != 1) {
              field_a = null;
              ((j) this).field_b.g((byte) 125);
              return;
            } else {
              ((j) this).field_b.g((byte) 125);
              return;
            }
          } else {
            ((j) this).field_b.field_G = 3;
            ((j) this).field_b.a(2, (la[]) null, false, false);
            if (param1 != 1) {
              field_a = null;
              ((j) this).field_b.g((byte) 125);
              return;
            } else {
              ((j) this).field_b.g((byte) 125);
              return;
            }
          }
        } else {
          ((j) this).field_b.field_G = 0;
          ((j) this).field_b.field_j = 1;
          ((j) this).field_b.field_n = 0;
          if ((param0 ^ -1) == -130) {
            ((j) this).field_b.field_G = 3;
            ((j) this).field_b.a(2, (la[]) null, false, false);
            if (param1 == 1) {
              ((j) this).field_b.g((byte) 125);
              return;
            } else {
              field_a = null;
              ((j) this).field_b.g((byte) 125);
              return;
            }
          } else {
            ((j) this).field_b.a(2, (la[]) null, false, false);
            if (param1 != 1) {
              field_a = null;
              ((j) this).field_b.g((byte) 125);
              return;
            } else {
              ((j) this).field_b.g((byte) 125);
              return;
            }
          }
        }
    }

    j(int param0) {
        int var2 = 3;
        gr var3 = new gr();
        var3.field_w = 4;
        if (param0 != 0) {
            var3.field_k = 10;
            var3.field_R = 31;
        } else {
            var3.field_R = 31;
            var3.field_k = 16;
        }
        vn var4 = fp.a(var3.field_w, var3.field_k, 0, var2, 0, 0, var3.field_R, false, false, false);
        ((j) this).field_b = new gm(var4, var2, false);
        ((j) this).field_b.field_G = 8;
        ((j) this).field_b.field_R = 1536;
        ((j) this).field_b.b((byte) -128, 5);
        if (-1 == (param0 ^ -1)) {
            ((j) this).field_b.field_mb.a(10, 126);
        }
    }

    static {
    }
}
