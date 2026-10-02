/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    final static boolean a(boolean param0, int param1, byte param2, int param3) {
        int stackIn_36_0 = 0;
        int var4;
        int var5;
        int var6;
        if (!param0) {
          if (gk.field_a[param3] < gk.field_a[param1]) {
            return true;
          }
          if (gk.field_a[param3] > gk.field_a[param1]) {
            return false;
          }
          if (hg.field_a[param1] > hg.field_a[param3]) {
            return true;
          }
          if (hg.field_a[param3] > hg.field_a[param1]) {
            return false;
          }
          var4 = cj.field_b[param3] + fb.field_m[param3] + k.field_i[param3];
          var5 = fb.field_m[param1] + (k.field_i[param1] + cj.field_b[param1]);
          var6 = 76 % ((-38 - param2) / 45);
          if (var4 < var5) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          stackIn_36_0 = (param3 >= param1) ? 0 : 1;
          return stackIn_36_0 != 0;
        }
        if (hg.field_a[param3] < hg.field_a[param1]) {
          return true;
        }
        if (hg.field_a[param3] > hg.field_a[param1]) {
          return false;
        }
        if (gk.field_a[param3] < gk.field_a[param1]) {
          return true;
        }
        if (gk.field_a[param3] > gk.field_a[param1]) {
          return false;
        }
        {
          var4 = cj.field_b[param3] + fb.field_m[param3] + k.field_i[param3];
          var5 = fb.field_m[param1] + (k.field_i[param1] + cj.field_b[param1]);
          var6 = 76 % ((-38 - param2) / 45);
          if (var4 < var5) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          if (param3 >= param1) {
            return false;
          }
          return true;
        }
    }

    final static sl a(String param0, int param1, boolean param2) {
        sl var3 = null;
        RuntimeException var3_ref = null;
        sl stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new sl(param2);
          var3.field_j = param1;
          var3.field_e = param0;
          stackIn_1_0 = (sl) (var3);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var3_ref);

          stackIn_4_1 = new StringBuilder().append("ig.B(");

          if (param0 == null) {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
            stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
            stackIn_5_2 = "null";
          } else {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
            stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
            stackIn_5_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
