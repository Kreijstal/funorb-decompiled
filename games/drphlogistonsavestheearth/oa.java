/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa implements Iterator {
    private uh field_a;
    static String field_c;
    static String field_d;
    private dg field_f;
    static int field_b;
    private uh field_e;

    public final void remove() {
        if (!(null != ((oa) this).field_a)) {
            throw new IllegalStateException();
        }
        ((oa) this).field_a.f(64);
        ((oa) this).field_a = null;
    }

    public final Object next() {
        uh var1 = ((oa) this).field_e;
        if (((oa) this).field_f.field_b != var1) {
            ((oa) this).field_e = var1.field_p;
        } else {
            ((oa) this).field_e = null;
            var1 = null;
        }
        ((oa) this).field_a = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((oa) this).field_e != ((oa) this).field_f.field_b;
    }

    final static boolean a(byte param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        if (!param3) {
          if (kf.field_c[param2] >= kf.field_c[param1]) {
            if (kf.field_c[param1] >= kf.field_c[param2]) {
              if (rc.field_i[param1] > rc.field_i[param2]) {
                return true;
              } else {
                if (rc.field_i[param2] <= rc.field_i[param1]) {
                  var4 = qj.field_d[param2] + fi.field_h[param2] + kk.field_a[param2];
                  var5 = qj.field_d[param1] + (fi.field_h[param1] - -kk.field_a[param1]);
                  if (var5 <= var4) {
                    if (var4 <= var5) {
                      if (param2 >= param1) {
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
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (rc.field_i[param1] <= rc.field_i[param2]) {
            if (rc.field_i[param1] >= rc.field_i[param2]) {
              if (kf.field_c[param1] <= kf.field_c[param2]) {
                if (kf.field_c[param1] >= kf.field_c[param2]) {
                  var4 = qj.field_d[param2] + fi.field_h[param2] + kk.field_a[param2];
                  var5 = qj.field_d[param1] + (fi.field_h[param1] - -kk.field_a[param1]);
                  if (var5 <= var4) {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L0: {
                        if (param2 >= param1) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          break L0;
                        } else {
                          stackOut_30_0 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          break L0;
                        }
                      }
                      return stackIn_32_0 != 0;
                    }
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
              return false;
            }
          } else {
            return true;
          }
        }
    }

    public static void a() {
        field_d = null;
        field_c = null;
    }

    oa(dg param0) {
        ((oa) this).field_a = null;
        try {
            ((oa) this).field_f = param0;
            ((oa) this).field_e = ((oa) this).field_f.field_b.field_p;
            ((oa) this).field_a = null;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "oa.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Account created successfully!";
        field_b = 80;
    }
}
