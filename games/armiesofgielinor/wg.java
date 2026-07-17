/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wg implements Iterable {
    static String field_a;
    static String field_e;
    static String field_c;
    ms field_f;
    static String field_d;
    static jd[] field_b;

    final static boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 == -33) {
          if (sm.field_d >= param1) {
            if (sm.field_d <= param2) {
              if (param3 <= ko.field_b) {
                if (param4 < ko.field_b) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          wg.a(-108);
          if (sm.field_d >= param1) {
            if (sm.field_d <= param2) {
              if (param3 <= ko.field_b) {
                if (param4 < ko.field_b) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final ms a(boolean param0) {
        ms var2 = null;
        var2 = ((wg) this).field_f.field_s;
        if (((wg) this).field_f != var2) {
          if (param0) {
            return null;
          } else {
            var2.c((byte) -76);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, ms param1) {
        try {
            if (!(null == param1.field_l)) {
                param1.c((byte) -76);
            }
            param1.field_l = ((wg) this).field_f.field_l;
            if (param0 != -96) {
                field_a = null;
            }
            param1.field_s = ((wg) this).field_f;
            param1.field_l.field_s = param1;
            param1.field_s.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wg.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(char param0, int param1) {
        if (param1 == -3904) {
          if (!Character.isISOControl(param0)) {
            int discarded$2 = -31000;
            if (!bi.a(param0)) {
              L0: {
                if (param0 == 45) {
                  break L0;
                } else {
                  if (param0 == 160) {
                    break L0;
                  } else {
                    if (param0 == 32) {
                      break L0;
                    } else {
                      if (param0 == 95) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (!Character.isISOControl(param0)) {
            int discarded$3 = -31000;
            if (!bi.a(param0)) {
              if (param0 != 45) {
                if (param0 != 160) {
                  L1: {
                    if (param0 == 32) {
                      break L1;
                    } else {
                      if (param0 == 95) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                  return true;
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
            return false;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new sp((wg) this);
    }

    wg() {
        ((wg) this).field_f = new ms();
        ((wg) this).field_f.field_l = ((wg) this).field_f;
        ((wg) this).field_f.field_s = ((wg) this).field_f;
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 19345) {
            boolean discarded$0 = wg.a('`', -95);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Try changing the following settings:  ";
        field_a = "Friends";
        field_c = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "Report <%0> for abuse";
    }
}
