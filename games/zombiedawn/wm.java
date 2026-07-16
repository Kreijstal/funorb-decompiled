/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wm implements Iterable {
    le[] field_c;
    private le field_a;
    static int field_e;
    static int field_d;
    int field_f;
    static int field_b;

    final le a(boolean param0, long param1) {
        le var4 = null;
        le var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        var4 = ((wm) this).field_c[(int)((long)(-1 + ((wm) this).field_f) & param1)];
        ((wm) this).field_a = var4.field_b;
        L0: while (true) {
          if (var4 == ((wm) this).field_a) {
            if (param0) {
              int discarded$2 = wm.a(17, (byte) 50);
              ((wm) this).field_a = null;
              return null;
            } else {
              ((wm) this).field_a = null;
              return null;
            }
          } else {
            if (((wm) this).field_a.field_f != param1) {
              ((wm) this).field_a = ((wm) this).field_a.field_b;
              continue L0;
            } else {
              var5 = ((wm) this).field_a;
              ((wm) this).field_a = ((wm) this).field_a.field_b;
              return var5;
            }
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 41 / ((-39 - param1) / 56);
        var3 = 0;
        if (-1 >= (param0 ^ -1)) {
          if ((param0 ^ -1) > -65537) {
            L0: {
              if (-257 < (param0 ^ -1)) {
                break L0;
              } else {
                param0 = param0 >>> 8;
                var3 += 8;
                break L0;
              }
            }
            L1: {
              if ((param0 ^ -1) <= -17) {
                param0 = param0 >>> 4;
                var3 += 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (4 <= param0) {
                param0 = param0 >>> 2;
                var3 += 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((param0 ^ -1) <= -2) {
                var3++;
                param0 = param0 >>> 1;
                break L3;
              } else {
                break L3;
              }
            }
            return var3 - -param0;
          } else {
            L4: {
              param0 = param0 >>> 16;
              var3 += 16;
              if (-257 < (param0 ^ -1)) {
                break L4;
              } else {
                param0 = param0 >>> 8;
                var3 += 8;
                break L4;
              }
            }
            L5: {
              if ((param0 ^ -1) <= -17) {
                param0 = param0 >>> 4;
                var3 += 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (4 <= param0) {
                param0 = param0 >>> 2;
                var3 += 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((param0 ^ -1) <= -2) {
                var3++;
                param0 = param0 >>> 1;
                break L7;
              } else {
                break L7;
              }
            }
            return var3 - -param0;
          }
        } else {
          L8: {
            param0 = param0 >>> 16;
            var3 += 16;
            if (-257 < (param0 ^ -1)) {
              break L8;
            } else {
              param0 = param0 >>> 8;
              var3 += 8;
              break L8;
            }
          }
          L9: {
            if ((param0 ^ -1) <= -17) {
              param0 = param0 >>> 4;
              var3 += 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (4 <= param0) {
              param0 = param0 >>> 2;
              var3 += 2;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if ((param0 ^ -1) <= -2) {
              var3++;
              param0 = param0 >>> 1;
              break L11;
            } else {
              break L11;
            }
          }
          return var3 - -param0;
        }
    }

    final static hn a(int param0, gi param1) {
        if (param0 != 96) {
          field_b = 21;
          return aa.a(106, fn.a(param1, 100, 96));
        } else {
          return aa.a(106, fn.a(param1, 100, 96));
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new hl((wm) this);
    }

    final void a(long param0, boolean param1, le param2) {
        le var5 = null;
        le var6 = null;
        le var7 = null;
        if (null == param2.field_d) {
          var7 = ((wm) this).field_c[(int)((long)(((wm) this).field_f - 1) & param0)];
          var5 = var7;
          param2.field_b = var5;
          if (!param1) {
            Iterator discarded$2 = ((wm) this).iterator();
            param2.field_d = var7.field_d;
            param2.field_d.field_b = param2;
            param2.field_f = param0;
            param2.field_b.field_d = param2;
            return;
          } else {
            param2.field_d = var7.field_d;
            param2.field_d.field_b = param2;
            param2.field_f = param0;
            param2.field_b.field_d = param2;
            return;
          }
        } else {
          param2.b(-27598);
          var6 = ((wm) this).field_c[(int)((long)(((wm) this).field_f - 1) & param0)];
          var5 = var6;
          param2.field_b = var5;
          if (param1) {
            param2.field_d = var6.field_d;
            param2.field_d.field_b = param2;
            param2.field_f = param0;
            param2.field_b.field_d = param2;
            return;
          } else {
            Iterator discarded$3 = ((wm) this).iterator();
            param2.field_d = var6.field_d;
            param2.field_d.field_b = param2;
            param2.field_f = param0;
            param2.field_b.field_d = param2;
            return;
          }
        }
    }

    private wm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_b = -1;
    }
}
