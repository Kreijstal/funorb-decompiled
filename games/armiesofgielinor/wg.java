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
        if (param0 != -33) {
          wg.a(-108);
          if (sm.field_d < param1) {
            return false;
          }
          if (sm.field_d > param2) {
            return false;
          }
          if (param3 > ko.field_b) {
            return false;
          }
          if (param4 >= ko.field_b) {
            return true;
          }
          return false;
        }
        if (sm.field_d < param1) {
          return false;
        }
        if (sm.field_d > param2) {
          return false;
        }
        if (param3 > ko.field_b) {
          return false;
        }
        if (param4 >= ko.field_b) {
          return true;
        }
        return false;
    }

    final ms a(boolean param0) {
        ms var2 = this.field_f.field_s;
        if (this.field_f == var2) {
          return null;
        }
        if (!param0) {
          var2.c((byte) -76);
          return var2;
        }
        return (ms) null;
    }

    final void a(int param0, ms param1) {
        try {
          if (null != param1.field_l) {
            param1.c((byte) -76);
          }
          param1.field_l = this.field_f.field_l;
          if (param0 != -96) {
            field_a = (String) null;
          }
          param1.field_s = this.field_f;
          param1.field_l.field_s = param1;
          param1.field_s.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "wg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        if (param1 == -3904) {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (bi.a(param0, -31000)) {
            return true;
          }
          if (param0 != 45 &&
            param0 != 160 &&
            param0 != 32 &&
            param0 != 95) {
            return false;
          }
          return true;
        }
        field_b = (jd[]) null;
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (bi.a(param0, -31000)) {
          return true;
        }
        if (param0 == 45) {
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (param0 != 32 &&
          param0 != 95) {
          return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new sp(this));
    }

    wg() {
        this.field_f = new ms();
        this.field_f.field_l = this.field_f;
        this.field_f.field_s = this.field_f;
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 19345) {
          wg.a('`', -95);
        }
    }

    static {
        field_d = "Try changing the following settings:  ";
        field_a = "Friends";
        field_c = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "Report <%0> for abuse";
    }
}
