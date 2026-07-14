/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ik extends uh {
    volatile boolean field_r;
    boolean field_o;
    boolean field_n;
    static String field_q;
    static char[] field_s;
    static long field_p;

    final static hh a(String param0, int param1, long param2, String param3, boolean param4) {
        L0: {
          if (0L != param2) {
            break L0;
          } else {
            if (param3 != null) {
              return (hh) (Object) new vd(param3, param0);
            } else {
              break L0;
            }
          }
        }
        if (param4) {
          return (hh) (Object) new cl(param2, param0);
        } else {
          L1: {
            if (param1 == -66) {
              break L1;
            } else {
              ik.g(-104);
              break L1;
            }
          }
          return (hh) (Object) new od(param2, param0);
        }
    }

    abstract int e(int param0);

    final static void g(int param0) {
        fd.a(param0, 0);
    }

    final static long a(CharSequence param0, byte param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        var6 = 14 % ((-35 - param1) / 34);
        L0: while (true) {
          L1: {
            if (var5 >= var4) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var7 = param0.charAt(var5);
                  if (var7 < 65) {
                    break L3;
                  } else {
                    if (90 < var7) {
                      break L3;
                    } else {
                      var2 = var2 + (long)(-65 + (var7 + 1));
                      break L2;
                    }
                  }
                }
                L4: {
                  if (var7 < 97) {
                    break L4;
                  } else {
                    if (122 < var7) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(1 + (var7 - 97));
                      break L2;
                    }
                  }
                }
                if (var7 < 48) {
                  break L2;
                } else {
                  if (var7 > 57) {
                    break L2;
                  } else {
                    var2 = var2 + (long)(27 - (-var7 + 48));
                    break L2;
                  }
                }
              }
              if (177917621779460413L <= var2) {
                break L1;
              } else {
                var5++;
                continue L0;
              }
            }
          }
          L5: while (true) {
            L6: {
              if (var2 % 37L != 0L) {
                break L6;
              } else {
                if (var2 == 0L) {
                  break L6;
                } else {
                  var2 = var2 / 37L;
                  continue L5;
                }
              }
            }
            return var2;
          }
        }
    }

    abstract byte[] f(int param0);

    ik() {
        ((ik) this).field_r = true;
    }

    public static void d(int param0) {
        field_q = null;
        if (param0 != 0) {
            return;
        }
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new char[128];
    }
}
