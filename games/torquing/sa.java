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
        pi var2 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = Torquing.field_u;
        this.field_e = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_f) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (2 <= var1_int) {
                        ub.a(1976, 10L);
                        var5 = (Object) null;
                        oe.a(this.field_b, 0, (Object) null);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_c[var1_int];
                          if (var2 == null) {
                            break L4;
                          } else {
                            var2.b();
                            break L4;
                          }
                        }
                        var1_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              nn.a((String) null, (Throwable) ((Object) var1), -9958);
              this.field_e = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_e = false;
          throw sa.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_e = false;
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
        param0.addMouseListener(ef.field_b);
        param0.addMouseMotionListener(ef.field_b);
        if (!param1) {
            return;
        }
        try {
            param0.addFocusListener(ef.field_b);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "sa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
            fm.a(false, -78, param2, param0);
            if (param1 < 121) {
                field_d = (Random) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "sa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    sa() {
        this.field_c = new pi[2];
        this.field_f = false;
        this.field_e = false;
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = new Random();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
