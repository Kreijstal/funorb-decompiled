/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends ms {
    byte[] field_k;
    int field_l;
    long field_m;

    final static void a(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_1 = 0;
        ah var1;
        int var2;
        int var3;
        int var4;
        ah var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var5 = aa.field_a[0];
        var1 = var5;
        if (param0 < 18) {
          return;
        }
        if (ar.field_G != 1) {
          if (!hw.field_b[99] &&
            !hw.field_b[Sumoblitz.field_I]) {
            stackIn_9_0 = 0;
          } else {
            stackIn_9_0 = 256;
          }
          if (!hw.field_b[98] &&
            !hw.field_b[nv.field_c]) {
            stackIn_13_1 = 0;
          } else {
            stackIn_13_1 = -256;
          }
          var3 = stackIn_9_0 + stackIn_13_1;
          if (!hw.field_b[96] &&
            !hw.field_b[rp.field_d]) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = -256;
          }
          if (!hw.field_b[97] &&
            !hw.field_b[ad.field_o]) {
            stackIn_22_1 = 0;
          } else {
            stackIn_22_1 = 256;
          }
          var2 = stackIn_17_0 + stackIn_22_1;
          if (var2 != 0 &&
            var3 != 0) {
            var5.b(-109, var3 / 22, var2 / 22);
            kp.field_a = true;
            if (!hw.field_b[83]) {
              var5.m(-95);
              return;
            }
            if (var5.n(123)) {
              var5.k((byte) -90);
              return;
            }
            var5.b(false);
            if (var5.field_l != 1) {
              return;
            }
            if (!var5.j(20)) {
              gn.a(33, true);
            } else {
              gn.a(29, true);
            }
            return;
          }
          if (var2 != 0) {
            var5.b(-119, var3, var2);
            kp.field_a = true;
          } else {
            if (var3 != 0) {
              var5.b(-119, var3, var2);
              kp.field_a = true;
              if (!hw.field_b[83]) {
                var5.m(-95);
                return;
              }
              if (var5.n(123)) {
                var5.k((byte) -90);
                return;
              }
              var5.b(false);
              if (var5.field_l != 1) {
                return;
              }
              if (!var5.j(20)) {
                gn.a(33, true);
              } else {
                gn.a(29, true);
              }
              return;
            }
          }
        } else {
          var5.a(false, pi.field_e << 8, ko.field_p << 8);
          kp.field_a = true;
        }
        if (!hw.field_b[83]) {
          var5.m(-95);
          return;
        }
        if (var5.n(123)) {
          var5.k((byte) -90);
          return;
        }
        var5.b(false);
        if (var5.field_l != 1) {
          return;
        }
        if (!var5.j(20)) {
          gn.a(33, true);
        } else {
          gn.a(29, true);
        }
    }

    ub(long param0, int param1, byte[] param2) {
        try {
          this.field_l = param1;
          this.field_k = param2;
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ub.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static wb[] a(ki param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wb[] stackIn_2_0 = null;
        wb[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(0, param1);
          if (param2 != -56) {
            stackIn_2_0 = (wb[]) null;
            return stackIn_2_0;
          }
          var5 = param0.a(var4_int, param3, (byte) 126);
          stackIn_4_0 = kr.a(19889, param0, var5, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ub.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
    }
}
