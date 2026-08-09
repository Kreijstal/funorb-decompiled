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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 1) {
              var3 = "turn0" + param1;
              stackIn_4_0 = mf.a(param0, "", var3, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (bi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("vr.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final String toString() {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_2_1 = null;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        String stackIn_3_2 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder var2;
        L0: {
          var2 = new StringBuilder();
          stackIn_2_0 = (StringBuilder) (var2);

          stackIn_2_1 = new StringBuilder().append("Diplomacy Allowed: ");

          if (!this.field_j) {
            stackIn_3_0 = (StringBuilder) ((Object) stackIn_2_0);
            stackIn_3_1 = (StringBuilder) ((Object) stackIn_2_1);
            stackIn_3_2 = "No";
            break L0;
          } else {
            stackIn_3_0 = (StringBuilder) ((Object) stackIn_2_0);
            stackIn_3_1 = (StringBuilder) ((Object) stackIn_2_1);
            stackIn_3_2 = "Yes";
            break L0;
          }
        }
        L1: {
          discarded$0 = ((StringBuilder) (Object) stackIn_3_0).append(stackIn_3_2 + "\n");
          stackIn_5_0 = (StringBuilder) (var2);

          stackIn_5_1 = new StringBuilder().append("Projects Allowed: ");

          if (!this.field_h) {
            stackIn_6_0 = (StringBuilder) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "No";
            break L1;
          } else {
            stackIn_6_0 = (StringBuilder) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "Yes";
            break L1;
          }
        }
        L2: {
          discarded$1 = ((StringBuilder) (Object) stackIn_6_0).append(stackIn_6_2 + "\n");
          stackIn_8_0 = (StringBuilder) (var2);

          stackIn_8_1 = new StringBuilder().append("Simple Garrisoning: ");

          if (!this.field_l) {
            stackIn_9_0 = (StringBuilder) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "No";
            break L2;
          } else {
            stackIn_9_0 = (StringBuilder) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "Yes";
            break L2;
          }
        }
        L3: {
          discarded$2 = ((StringBuilder) (Object) stackIn_9_0).append(stackIn_9_2 + "\n");
          stackIn_11_0 = (StringBuilder) (var2);

          stackIn_11_1 = new StringBuilder().append("Garrisons Can Be Removed: ");

          if (!this.field_e) {
            stackIn_12_0 = (StringBuilder) ((Object) stackIn_11_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "No";
            break L3;
          } else {
            stackIn_12_0 = (StringBuilder) ((Object) stackIn_11_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "Yes";
            break L3;
          }
        }
        L4: {
          discarded$3 = ((StringBuilder) (Object) stackIn_12_0).append(stackIn_12_2 + "\n");
          stackIn_14_0 = (StringBuilder) (var2);

          stackIn_14_1 = new StringBuilder().append("Chain Collapsing: ");

          if (this.field_k) {
            stackIn_15_0 = (StringBuilder) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "No";
            break L4;
          } else {
            stackIn_15_0 = (StringBuilder) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "Yes";
            break L4;
          }
        }
        L5: {
          discarded$4 = ((StringBuilder) (Object) stackIn_15_0).append(stackIn_15_2 + "\n");
          stackIn_17_0 = (StringBuilder) (var2);

          stackIn_17_1 = new StringBuilder().append("Unified Territories: ");

          if (this.field_i) {
            stackIn_18_0 = (StringBuilder) ((Object) stackIn_17_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "Yes";
            break L5;
          } else {
            stackIn_18_0 = (StringBuilder) ((Object) stackIn_17_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "No";
            break L5;
          }
        }
        L6: {
          discarded$5 = ((StringBuilder) (Object) stackIn_18_0).append(stackIn_18_2 + "\n");
          stackIn_20_0 = (StringBuilder) (var2);

          stackIn_20_1 = new StringBuilder().append("Destructable Defence Nets: ");

          if (this.field_f) {
            stackIn_21_0 = (StringBuilder) ((Object) stackIn_20_0);
            stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
            stackIn_21_2 = "Yes";
            break L6;
          } else {
            stackIn_21_0 = (StringBuilder) ((Object) stackIn_20_0);
            stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
            stackIn_21_2 = "No";
            break L6;
          }
        }
        StringBuilder discarded$6 = ((StringBuilder) (Object) stackIn_21_0).append(stackIn_21_2 + "\n");
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
            Throwable throwable = null;
            bc var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                ll.a(kq.f((byte) 124), "resizing", new Object[]{new Integer(param1)}, param0 + 15355);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                throwable = decompiledCaughtException;
                break L1;
              }
            }
            if (param0 != -15469) {
              var3 = (bc) null;
              vr.a((bc) null, -29, -123);
              return;
            } else {
              return;
            }
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
