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
        if (!(null != lk.field_v)) {
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
        }
        return lk.field_v;
    }

    final static void a(java.awt.Component param0, boolean param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) ef.field_b);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ef.field_b);
        try {
            param0.addFocusListener((java.awt.event.FocusListener) (Object) ef.field_b);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "sa.B(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    final static void a(String param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              fm.a(false, -78, param2, param0);
              if (param1 >= 121) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sa.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    sa() {
        ((sa) this).field_c = new pi[2];
        ((sa) this).field_f = false;
        ((sa) this).field_e = false;
    }

    public static void a(boolean param0) {
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
