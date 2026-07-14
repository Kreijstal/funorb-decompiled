/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cf implements Iterator {
    private gp field_c;
    private sr field_e;
    private gp field_d;
    static String field_b;
    static volatile int field_a;

    final static cr a(boolean param0) {
        if (!param0) {
            return null;
        }
        return pp.f(-126);
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 == 31077) {
          if (de.field_f == -14) {
            on.a(9110);
            return true;
          } else {
            if (-103 == de.field_f) {
              ji.field_n.a((byte) 34);
              return true;
            } else {
              if (ji.field_n != null) {
                if (!ji.field_n.a(param1, false, param2)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        if (param3 >= 47) {
          L0: {
            if (param0 != 0) {
              break L0;
            } else {
              if (rm.field_B != param1) {
                rm.field_B = param1;
                dc.field_B = true;
                jm.d(1, param2);
                break L0;
              } else {
                if (-2 == (param0 ^ -1)) {
                  L1: {
                    if (param1 != oa.field_p) {
                      oa.field_p = param1;
                      dc.field_B = true;
                      jm.d(1, param2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (2 == param0) {
                    if (param1 != mf.field_b) {
                      mf.field_b = param1;
                      dc.field_B = true;
                      jm.d(1, param2);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (2 == param0) {
                    if (param1 == mf.field_b) {
                      return;
                    } else {
                      mf.field_b = param1;
                      dc.field_B = true;
                      jm.d(1, param2);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L2: {
            if (-2 != (param0 ^ -1)) {
              break L2;
            } else {
              if (param1 != oa.field_p) {
                oa.field_p = param1;
                dc.field_B = true;
                jm.d(1, param2);
                break L2;
              } else {
                if (2 == param0) {
                  if (param1 == mf.field_b) {
                    return;
                  } else {
                    mf.field_b = param1;
                    dc.field_B = true;
                    jm.d(1, param2);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (2 == param0) {
            if (param1 == mf.field_b) {
              return;
            } else {
              mf.field_b = param1;
              dc.field_B = true;
              jm.d(1, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final void remove() {
        if (null == ((cf) this).field_c) {
            throw new IllegalStateException();
        }
        ((cf) this).field_c.a(-105);
        ((cf) this).field_c = null;
    }

    public static void a(int param0) {
        int var1 = 21 / ((36 - param0) / 55);
        field_b = null;
    }

    final static int a(int param0, CharSequence param1) {
        if (param0 <= 68) {
            return -31;
        }
        return li.a(10, true, param1, true);
    }

    public final Object next() {
        gp var1 = ((cf) this).field_d;
        if (((cf) this).field_e.field_b == var1) {
            ((cf) this).field_d = null;
            var1 = null;
        } else {
            ((cf) this).field_d = var1.field_p;
        }
        ((cf) this).field_c = var1;
        return (Object) (Object) var1;
    }

    final static int a(int param0, CharSequence param1, byte param2) {
        int var3 = 83 % ((param2 - 8) / 48);
        return li.a(param0, true, param1, true);
    }

    public final boolean hasNext() {
        return ((cf) this).field_e.field_b != ((cf) this).field_d;
    }

    cf(sr param0) {
        ((cf) this).field_c = null;
        ((cf) this).field_e = param0;
        ((cf) this).field_c = null;
        ((cf) this).field_d = ((cf) this).field_e.field_b.field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = "Your request to join has been declined.";
    }
}
