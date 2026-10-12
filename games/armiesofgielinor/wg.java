/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wg implements Iterable {
    static String field_a;
    static String field_e;
    static String field_c;
    DualLinkedNode field_f;
    static String field_d;
    static Unit[] field_b;

    final static boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -33) {
          wg.a(-108);
          if (AiPlanningStrategy.field_d < param1) {
            return false;
          }
          if (AiPlanningStrategy.field_d > param2) {
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
        if (AiPlanningStrategy.field_d < param1) {
          return false;
        }
        if (AiPlanningStrategy.field_d > param2) {
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

    final DualLinkedNode a(boolean param0) {
        DualLinkedNode var2 = this.field_f.secondaryNext;
        if (this.field_f == var2) {
          return null;
        }
        if (!param0) {
          var2.unlinkSecondary((byte) -76);
          return var2;
        }
        return (DualLinkedNode) null;
    }

    final void a(int param0, DualLinkedNode param1) {
        try {
          if (null != param1.secondaryPrevious) {
            param1.unlinkSecondary((byte) -76);
          }
          param1.secondaryPrevious = this.field_f.secondaryPrevious;
          if (param0 != -96) {
            field_a = (String) null;
          }
          param1.secondaryNext = this.field_f;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        field_b = (Unit[]) null;
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
        this.field_f = new DualLinkedNode();
        this.field_f.secondaryPrevious = this.field_f;
        this.field_f.secondaryNext = this.field_f;
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
