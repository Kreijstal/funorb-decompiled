/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr {
    boolean field_i;
    static String field_d;
    boolean field_e;
    boolean field_f;
    boolean field_k;
    boolean field_h;
    static sp field_a;
    static int field_c;
    boolean field_j;
    static int field_m;
    boolean field_l;
    static int field_g;
    int field_b;

    final static bi a(bc param0, int param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        bi stackIn_2_0 = null;
        bi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            stackIn_2_0 = (bi) null;
            return stackIn_2_0;
          }
          var3 = "turn0" + param1;
          stackIn_4_0 = mf.a(param0, "", var3, false);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("vr.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final String toString() {
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_2_1 = null;
        String stackIn_3_2 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder var2;
        var2 = new StringBuilder();
        stackIn_2_0 = var2;
        stackIn_2_1 = new StringBuilder().append("Diplomacy Allowed: ");
        if (!this.field_j) {
          stackIn_3_2 = "No";
        } else {
          stackIn_3_2 = "Yes";
        }
        StringBuilder discarded$0 = ((StringBuilder) (Object) stackIn_2_0).append(((StringBuilder) (Object) stackIn_2_1).append(stackIn_3_2).append("\n").toString());
        stackIn_5_0 = var2;
        stackIn_5_1 = new StringBuilder().append("Projects Allowed: ");
        if (!this.field_h) {
          stackIn_6_2 = "No";
        } else {
          stackIn_6_2 = "Yes";
        }
        StringBuilder discarded$1 = ((StringBuilder) (Object) stackIn_5_0).append(((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append("\n").toString());
        stackIn_8_0 = var2;
        stackIn_8_1 = new StringBuilder().append("Simple Garrisoning: ");
        if (!this.field_l) {
          stackIn_9_2 = "No";
        } else {
          stackIn_9_2 = "Yes";
        }
        StringBuilder discarded$2 = ((StringBuilder) (Object) stackIn_8_0).append(((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append("\n").toString());
        stackIn_11_0 = var2;
        stackIn_11_1 = new StringBuilder().append("Garrisons Can Be Removed: ");
        if (!this.field_e) {
          stackIn_12_2 = "No";
        } else {
          stackIn_12_2 = "Yes";
        }
        StringBuilder discarded$3 = ((StringBuilder) (Object) stackIn_11_0).append(((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append("\n").toString());
        stackIn_14_0 = var2;
        stackIn_14_1 = new StringBuilder().append("Chain Collapsing: ");
        if (this.field_k) {
          stackIn_15_2 = "No";
        } else {
          stackIn_15_2 = "Yes";
        }
        StringBuilder discarded$4 = ((StringBuilder) (Object) stackIn_14_0).append(((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append("\n").toString());
        stackIn_17_0 = var2;
        stackIn_17_1 = new StringBuilder().append("Unified Territories: ");
        if (this.field_i) {
          stackIn_18_2 = "Yes";
        } else {
          stackIn_18_2 = "No";
        }
        StringBuilder discarded$5 = ((StringBuilder) (Object) stackIn_17_0).append(((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append("\n").toString());
        stackIn_20_0 = var2;
        stackIn_20_1 = new StringBuilder().append("Destructable Defence Nets: ");
        if (this.field_f) {
          stackIn_21_2 = "Yes";
        } else {
          stackIn_21_2 = "No";
        }
        StringBuilder discarded$6 = ((StringBuilder) (Object) stackIn_20_0).append(((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append("\n").toString());
        StringBuilder discarded$7 = var2.append("Movement Range: " + this.field_b);
        return var2.toString();
    }

    public static void a(boolean param0) {
        field_a = null;
        field_d = null;
        if (!param0) {
          bc var2 = (bc) null;
          vr.a((bc) null, -126, 48);
        }
    }

    final static void a(int param0, int param1) {
        try {
          try {
            ll.a(kq.f((byte) 124), "resizing", new Object[]{new Integer(param1)}, param0 + 15355);
          } catch (Throwable throwable) {
          }
          if (param0 == -15469) {
            return;
          }
          bc var3 = (bc) null;
          vr.a((bc) null, -29, -123);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    vr(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6, int param7) {
        this.field_k = param4 ? true : false;
        this.field_f = param6 ? true : false;
        this.field_l = param2 ? true : false;
        this.field_e = param3 ? true : false;
        this.field_i = param5 ? true : false;
        this.field_j = param0 ? true : false;
        this.field_b = param7;
        this.field_h = param1 ? true : false;
    }

    static {
        field_d = "A fortunate few found more habitable planets and, around this handful of stars, civilization began to flourish once again.";
        field_g = 1;
    }
}
