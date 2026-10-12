/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class iq {
    private int field_c;
    private String field_d;
    private int field_f;
    static Random field_e;
    int field_i;
    static long field_h;
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
            iq.c(70);
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
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (!wg.a(-33, db.a(true, this.field_f), db.a(true, this.field_f + this.field_i), MatchConditionEntry.a(this.field_c, (byte) 94), MatchConditionEntry.a(30 + this.field_c, (byte) 94))) {
          fe.a(db.a(true, this.field_f), MatchConditionEntry.a(this.field_c, (byte) 94), this.field_i, 30, DisplacedUnitMarker.field_s, nd.field_b, 0, 0);
          fe.c(this.field_d, db.a(true, this.field_i / 2 + this.field_f), MatchConditionEntry.a(this.field_c + 30, (byte) 94), param0, true);
          return;
        }
        fe.a(db.a(true, this.field_f), MatchConditionEntry.a(this.field_c, (byte) 94), this.field_i, 30, DisplacedUnitMarker.field_s, TutorialController.field_e, 0, 0);
        fe.c(this.field_d, db.a(true, this.field_i / 2 + this.field_f), MatchConditionEntry.a(this.field_c + 30, (byte) 94), param0, true);
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
        iq.c(56);
        wc.a(false, -49);
        p.field_b = 0;
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 == 0) {
          field_a = null;
          field_g = null;
          field_b = null;
          return;
        }
        field_e = (Random) null;
        field_a = null;
        field_g = null;
        field_b = null;
    }

    iq(String param0, int param1, int param2, int param3) {
        try {
          this.field_c = param2;
          this.field_f = param1;
          this.field_i = param3;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "iq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = -106 / ((param0 - 17) / 39);
        return wg.a(-33, db.a(true, this.field_f), db.a(true, this.field_f + this.field_i), MatchConditionEntry.a(this.field_c, (byte) 94), MatchConditionEntry.a(this.field_c + 30, (byte) 94));
    }

    static {
        field_e = new Random();
        field_b = "Owned";
    }
}
