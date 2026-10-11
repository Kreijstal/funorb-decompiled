/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    static String field_g;
    static rc field_h;
    static String[] field_f;
    static h field_e;
    static ll[] field_d;
    static qb field_a;
    static sa field_b;
    static int field_c;

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (hn.a(param0, 17769)) {
          return true;
        }
        if (param0 == (char)param1) {
          return true;
        }
        if (160 == param0) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 != 95) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_h = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_b = null;
          field_a = null;
          field_f = null;
          return;
        }
        field_c = 72;
        field_h = null;
        field_e = null;
        field_g = null;
        field_d = null;
        field_b = null;
        field_a = null;
        field_f = null;
    }

    final static ri a(byte param0, String param1) {
        ri stackIn_3_0 = null;
        ri stackIn_7_0 = null;
        ri stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        ri stackIn_25_0 = null;
        ri stackIn_31_0 = null;
        ri stackIn_42_0 = null;
        ri stackIn_47_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_3_0 = uh.field_i;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = b.field_e;
            return stackIn_7_0;
          }
          if (param1.charAt(0) == 34) {
            if (34 != param1.charAt(-1 + var2_int)) {
              stackIn_11_0 = n.field_b;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param1.charAt(var4);
              if (92 == var5) {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_25_0 = n.field_b;
                  return stackIn_25_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          if (param0 != -58) {
            stackIn_31_0 = (ri) null;
            return stackIn_31_0;
          }
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var4Lifetime1 != -1 + var2_int &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_42_0 = n.field_b;
                return stackIn_42_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (tl.field_b.indexOf(var5Lifetime1) == -1) {
                stackIn_47_0 = n.field_b;
                return stackIn_47_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_54_0 = var2;
          stackIn_54_1 = new StringBuilder().append("pm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    final static qb[] a(int param0, qb param1) {
        qb[] var2 = null;
        RuntimeException var2_ref = null;
        qb[] var3 = null;
        qb[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 29) {
            field_a = (qb) null;
          }
          var3 = new qb[9];
          var2 = var3;
          var3[4] = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("pm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(uj[] param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param0.length;
          if (param1 != -1) {
            return;
          }
          for (var3 = 1; var2_int > var3; var3++) {
            var4 = param0[var3];
            for (var5 = var3 - 1; var5 >= 0; var5--) {
              if (cg.a((byte) -111, param0[var5], var4)) {
                param0[var5 + 1] = param0[var5];
                continue;
              }
              break;
            }
            param0[1 + var5] = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("pm.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = "Explode on contact with the landscape. Hold the mouse to increase the velocity of the attack.";
    }
}
