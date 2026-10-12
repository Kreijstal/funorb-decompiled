/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableDualNodeDeque implements Iterable {
    static String field_a;
    static String field_e;
    static String field_c;
    DualLinkedNode sentinel;
    static String field_d;
    static Unit[] field_b;

    final static boolean isPointerInBounds(int obfuscationGuard, int minimumX, int maximumX, int minimumY, int maximumY) {
        if (obfuscationGuard != -33) {
          IterableDualNodeDeque.a(-108);
          if (AiPlanningStrategy.pointerX < minimumX) {
            return false;
          }
          if (AiPlanningStrategy.pointerX > maximumX) {
            return false;
          }
          if (minimumY > ko.pointerY) {
            return false;
          }
          if (maximumY >= ko.pointerY) {
            return true;
          }
          return false;
        }
        if (AiPlanningStrategy.pointerX < minimumX) {
          return false;
        }
        if (AiPlanningStrategy.pointerX > maximumX) {
          return false;
        }
        if (minimumY > ko.pointerY) {
          return false;
        }
        if (maximumY >= ko.pointerY) {
          return true;
        }
        return false;
    }

    final DualLinkedNode popFirst(boolean obfuscationGuard) {
        DualLinkedNode firstNode = this.sentinel.secondaryNext;
        if (this.sentinel == firstNode) {
          return null;
        }
        if (!obfuscationGuard) {
          firstNode.unlinkSecondary((byte) -76);
          return firstNode;
        }
        return (DualLinkedNode) null;
    }

    final void addLast(int obfuscationGuard, DualLinkedNode node) {
        try {
          if (null != node.secondaryPrevious) {
            node.unlinkSecondary((byte) -76);
          }
          node.secondaryPrevious = this.sentinel.secondaryPrevious;
          if (obfuscationGuard != -96) {
            field_a = (String) null;
          }
          node.secondaryNext = this.sentinel;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wg.C(" + obfuscationGuard + ',' + (node != null ? "{...}" : "null") + ')');
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
        return (Iterator) ((Object) new DualNodeIterator(this));
    }

    IterableDualNodeDeque() {
        this.sentinel = new DualLinkedNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 19345) {
          IterableDualNodeDeque.a('`', -95);
        }
    }

    static {
        field_d = "Try changing the following settings:  ";
        field_a = "Friends";
        field_c = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "Report <%0> for abuse";
    }
}
