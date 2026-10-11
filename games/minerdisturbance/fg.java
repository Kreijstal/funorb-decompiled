/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fg {
    static ag field_d;
    static Calendar field_h;
    static String field_e;
    String field_f;
    static int field_b;
    String field_a;
    boolean field_g;
    static ea[] field_c;

    final static boolean a(int param0, char param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        sb var3;
        if (param0 != -1975005818) {
          var3 = (sb) null;
          fg.a((byte) -41, (sb) null);
          if (param1 < 48) {
            if (param1 >= 65 &&
              90 >= param1) {
              return true;
            }
            if (97 > param1) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 57) {
            return true;
          }
          if (param1 < 65) {
            if (97 > param1) {
              return false;
            }
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (90 >= param1) {
            return true;
          }
          stackIn_28_0 = (97 <= param1) && (param1 <= 122);
          return stackIn_28_0;
        }
        if (param1 < 48) {
          if (param1 < 65) {
            if (97 > param1) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (90 >= param1) {
            return true;
          }
          stackIn_64_0 = (97 <= param1) && (param1 <= 122);
          return stackIn_64_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (param1 < 65) {
          if (97 > param1) {
            return false;
          }
          if (param1 > 122) {
            return false;
          }
          return true;
        }
        if (90 >= param1) {
          return true;
        }
        stackIn_50_0 = (97 <= param1) && (param1 <= 122);
        return stackIn_50_0;
    }

    final static void a(byte param0, sl param1, int param2) {
        int var4 = 0;
        ld var5 = sn.field_c;
        if (param0 != 5) {
          return;
        }
        try {
          var5.d((byte) -81, param2);
          var5.field_o = var5.field_o + 1;
          var4 = var5.field_o;
          var5.c(1, param0 ^ 25561);
          var5.c(param1.field_n, 25564);
          var5.c(param1.field_p, param0 ^ 25561);
          var5.a((byte) 122, param1.field_t);
          var5.a((byte) 120, param1.field_s);
          var5.a((byte) 117, param1.field_r);
          var5.a((byte) 94, param1.field_o);
          var5.e(86, var4);
          var5.g(-1, var5.field_o - var4);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "fg.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String[][] a(int param0, sb param1) {
        int var4 = 0;
        ta var2 = null;
        RuntimeException var2_ref = null;
        String[][] var3 = null;
        int var5 = 0;
        String[][] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          if (param0 != 65) {
            fg.a(-58);
          }
          var2 = new ta();
          while (param1.field_u.length > param1.field_o) {
            var2.a((byte) -124, new fn(lm.a(param1, (byte) -101)));
          }
          var3 = new String[var2.c((byte) -119)][];
          for (var4 = 0; var3.length > var4; var4++) {
            var3[var4] = ((fn) (var2.e(eg.a(param0, 63791)))).field_n;
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("fg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(byte param0, sb param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          ah.field_b = param1.e(-25) << 5;
          var2_int = param1.d((byte) -54);
          vb.field_b = (var2_int & 7) << 18;
          ah.field_b = ah.field_b + (var2_int >> 3);
          vb.field_b = vb.field_b + (param1.e(param0 ^ 41) << 2);
          var2_intLifetime1 = param1.d((byte) -54);
          tk.field_h = var2_intLifetime1 << 15 & 2064384;
          vb.field_b = vb.field_b + (var2_intLifetime1 >> 6);
          tk.field_h = tk.field_h + (param1.d((byte) -54) << 7);
          if (param0 != -86) {
            field_e = (String) null;
          }
          var2_intLifetime2 = param1.d((byte) -54);
          tk.field_h = tk.field_h + (var2_intLifetime2 >> 1);
          fl.field_c = var2_intLifetime2 << 16 & 65536;
          fl.field_c = fl.field_c + param1.e(param0 + 40);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "fg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= -99) {
          field_c = null;
          field_d = null;
          field_h = null;
          field_e = null;
          return;
        }
        sl var2 = (sl) null;
        fg.a((byte) 10, (sl) null, 95);
        field_c = null;
        field_d = null;
        field_h = null;
        field_e = null;
    }

    static {
        field_d = new ag();
        field_e = "Hydraulic fist: Gives strength to push rock.";
        field_h = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
