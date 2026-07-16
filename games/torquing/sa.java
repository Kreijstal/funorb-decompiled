/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sa implements Runnable {
    volatile boolean field_f;
    vh field_b;
    volatile pi[] field_c;
    static String field_a;
    static Random field_d;
    volatile boolean field_e;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        pi var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = Torquing.field_u;
        ((sa) this).field_e = true;
        try {
          L0: while (true) {
            if (((sa) this).field_f) {
              ((sa) this).field_e = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (2 <= var1_int) {
                  ub.a(1976, 10L);
                  var5 = null;
                  oe.a(((sa) this).field_b, 0, (Object) null);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((sa) this).field_c[var1_int];
                    if (var2 == null) {
                      var1_int++;
                      var1_int++;
                      break L2;
                    } else {
                      var2.b();
                      var1_int++;
                      break L2;
                    }
                  }
                  var1_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Exception) (Object) decompiledCaughtException;
          var6 = null;
          nn.a((String) null, (Throwable) (Object) var1, -9958);
          ((sa) this).field_e = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((sa) this).field_e = false;
          throw sa.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    final static dq a(byte param0) {
        L0: {
          if (null == lk.field_v) {
            lk.field_v = new dq();
            lk.field_v.a(dg.field_e, (byte) -124);
            lk.field_v.field_p = 5;
            lk.field_v.field_h = 0;
            lk.field_v.field_e = 7697781;
            lk.field_v.field_c = 2763306;
            lk.field_v.field_d = 6;
            lk.field_v.field_b = 14;
            lk.field_v.field_j = sp.field_R;
            lk.field_v.field_f = 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 35) {
          sa.a(true);
          return lk.field_v;
        } else {
          return lk.field_v;
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) ef.field_b);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ef.field_b);
        if (!param1) {
            return;
        }
        param0.addFocusListener((java.awt.event.FocusListener) (Object) ef.field_b);
    }

    final static void a(String param0, int param1, String param2) {
        fm.a(false, -78, param2, param0);
        if (param1 < 121) {
            field_d = null;
        }
    }

    sa() {
        ((sa) this).field_c = new pi[2];
        ((sa) this).field_f = false;
        ((sa) this).field_e = false;
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = new Random();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
