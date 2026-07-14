/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends ih {
    int field_mb;
    static boolean field_nb;
    static wi field_jb;
    String field_kb;
    static gi field_lb;
    String field_ob;
    static eh field_pb;

    final static boolean e(byte param0) {
        hh var1 = null;
        int var2 = 0;
        int var3 = 0;
        hh var4 = null;
        var3 = Bounce.field_N;
        if (param0 == 102) {
          var4 = (hh) (Object) ob.field_c.a((byte) -46);
          var1 = var4;
          if (var1 == null) {
            return false;
          } else {
            var2 = 0;
            L0: while (true) {
              if (var2 >= var1.field_j) {
                return true;
              } else {
                L1: {
                  if (null == var4.field_n[var2]) {
                    break L1;
                  } else {
                    if (var4.field_n[var2].field_f == 0) {
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                if (null != var4.field_s[var2]) {
                  if (var4.field_s[var2].field_f == 0) {
                    return false;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    public static void d(int param0) {
        field_jb = null;
        if (param0 != 4) {
            Object var2 = null;
            fb.a((java.awt.Component) null, (byte) 105);
        }
        field_pb = null;
        field_lb = null;
    }

    final static void a(java.awt.Component param0, byte param1) {
        if (param1 >= -26) {
            fb.d(35);
        }
        param0.addMouseListener((java.awt.event.MouseListener) (Object) nj.field_o);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) nj.field_o);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) nj.field_o);
    }

    fb() {
        super(0L, (ih) null);
    }

    final static String a(byte param0, String param1, String param2, gk param3, String param4) {
        if (param0 >= -7) {
            fb.d(2);
        }
        if (!(param3.c(102))) {
            return param1;
        }
        return param2 + " - " + param3.b(param4, (byte) -100) + "%";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = false;
        field_pb = new eh(2, 4, 4, 0);
    }
}
