/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CampaignMenuButton {
    private int top;
    private String label;
    private int left;
    static Random connectionRandom;
    int width;
    static long lastPacketReadMillis;
    static int[] field_g;
    static String field_b;
    static pu[] field_a;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.length() != 1) {
            return false;
          }
          if (param0 != 30) {
            CampaignMenuButton.c(70);
          }
          var2_int = param1.charAt(0);
          if (!Character.isLowerCase((char) var2_int)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("iq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void draw(int textRenderParameter) {
        if (!wg.a(-33, db.a(true, this.left), db.a(true, this.left + this.width), MatchConditionEntry.a(this.top, (byte) 94), MatchConditionEntry.a(30 + this.top, (byte) 94))) {
          fe.a(db.a(true, this.left), MatchConditionEntry.a(this.top, (byte) 94), this.width, 30, DisplacedUnitMarker.field_s, nd.field_b, 0, 0);
          fe.c(this.label, db.a(true, this.width / 2 + this.left), MatchConditionEntry.a(this.top + 30, (byte) 94), textRenderParameter, true);
          return;
        }
        fe.a(db.a(true, this.left), MatchConditionEntry.a(this.top, (byte) 94), this.width, 30, DisplacedUnitMarker.field_s, TutorialController.field_e, 0, 0);
        fe.c(this.label, db.a(true, this.width / 2 + this.left), MatchConditionEntry.a(this.top + 30, (byte) 94), textRenderParameter, true);
    }

    final static void b(int param0) {
        if (!bl.field_b) {
          throw new IllegalStateException();
        }
        it.field_b = true;
        if (param0 == -20267) {
          wc.a(false, -49);
          p.field_b = 0;
          return;
        }
        CampaignMenuButton.c(56);
        wc.a(false, -49);
        p.field_b = 0;
    }

    public static void c(int param0) {
        connectionRandom = null;
        if (param0 == 0) {
          field_a = null;
          field_g = null;
          field_b = null;
          return;
        }
        connectionRandom = (Random) null;
        field_a = null;
        field_g = null;
        field_b = null;
    }

    CampaignMenuButton(String label, int left, int top, int width) {
        try {
          this.top = top;
          this.left = left;
          this.width = width;
          this.label = label;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "iq.<init>(" + (label != null ? "{...}" : "null") + ',' + left + ',' + top + ',' + width + ')');
        }
    }

    final boolean containsPointer(byte obfuscationGuard) {
        int var2 = -106 / ((obfuscationGuard - 17) / 39);
        return wg.a(-33, db.a(true, this.left), db.a(true, this.left + this.width), MatchConditionEntry.a(this.top, (byte) 94), MatchConditionEntry.a(this.top + 30, (byte) 94));
    }

    static {
        connectionRandom = new Random();
        field_b = "Owned";
    }
}
