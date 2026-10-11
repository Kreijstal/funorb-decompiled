/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String[] field_a;
    static String field_c;
    private hj[] field_d;
    static hj field_b;

    final static wa a(int param0, int param1, ki param2, ki param3, int param4) {
        RuntimeException var5 = null;
        wa stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!pk.a(80, param0, param3, param4)) {
            return null;
          }
          if (param1 != -6) {
            pf.a((byte) 9, 16);
          }
          stackIn_6_0 = i.a(false, param2.b(param0, false, param4));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("pf.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        field_b = (hj) null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var7 = OrbDefence.field_D ? 1 : 0;
        var2 = 0;
        var3 = ji.field_b;
        if (var3 < 5) {
          var2 = var3 * (var3 * 8192) / 1100;
          var4 = 1;
          var5 = 0;
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (param1 == 5) {
            var5 = 1;
            var4 = -1;
          }
          if (6 == param1) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 7) {
            var4 = -1;
            var5 = -1;
          } else {
            if (param1 == 8) {
              var4 = -1;
              var5 = -1;
            }
          }
          var6 = -24 % ((param0 - 58) / 40);
          if (param1 == 11) {
            var4 = -1;
          }
          if (12 == param1) {
            var4 = -1;
            var5 = -1;
          }
          if (param1 == 13) {
            var5 = -1;
            var4 = 1;
          }
          if (14 == param1) {
            var4 = -1;
            var5 = 1;
          }
          if (15 == param1) {
            var4 = 1;
            var5 = 1;
          }
          kg.field_i = dk.a(var4 * var2, var2 * var5, false);
          return;
        }
        if (105 > var3) {
          var2 = (-40960 + 16384 * var3) / 220;
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (param1 == 1) {
            var5Lifetime1 = 1;
          }
          if (param1 == 3) {
            var4Lifetime1 = -1;
          }
          if (param1 == 4) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (param1 == 5) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (6 == param1) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (param1 == 7 ||
            param1 == 8) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
          var6Lifetime1 = -24 % ((param0 - 58) / 40);
          if (param1 == 11) {
            var4Lifetime1 = -1;
          }
          if (12 == param1) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
          if (param1 == 13) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (14 == param1) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (15 == param1) {
            var4Lifetime1 = 1;
            var5Lifetime1 = 1;
          }
          kg.field_i = dk.a(var4Lifetime1 * var2, var2 * var5Lifetime1, false);
          return;
        }
        if (var3 >= 120) {
          var4Lifetime2 = 1;
          var5Lifetime2 = 0;
          if (param1 == 1) {
            var5Lifetime2 = 1;
          }
          if (param1 == 3) {
            var4Lifetime2 = -1;
          }
          if (param1 == 4) {
            var5Lifetime2 = 1;
            var4Lifetime2 = 1;
          }
          if (param1 == 5) {
            var5Lifetime2 = 1;
            var4Lifetime2 = -1;
          }
          if (6 == param1) {
            var4Lifetime2 = 1;
            var5Lifetime2 = -1;
          }
          if (param1 == 7 ||
            param1 == 8) {
            var4Lifetime2 = -1;
            var5Lifetime2 = -1;
          }
          var6Lifetime2 = -24 % ((param0 - 58) / 40);
          if (param1 == 11) {
            var4Lifetime2 = -1;
          }
          if (12 == param1) {
            var4Lifetime2 = -1;
            var5Lifetime2 = -1;
          }
          if (param1 == 13) {
            var5Lifetime2 = -1;
            var4Lifetime2 = 1;
          }
          if (14 == param1) {
            var4Lifetime2 = -1;
            var5Lifetime2 = 1;
          }
          if (15 == param1) {
            var4Lifetime2 = 1;
            var5Lifetime2 = 1;
          }
          kg.field_i = dk.a(var4Lifetime2 * var2, var2 * var5Lifetime2, false);
          return;
        }
        var3 = -var3 + 120;
        var2Lifetime1 = 8192 - var3 * var3 * 8192 / 3300;
        var4Lifetime3 = 1;
        var5Lifetime3 = 0;
        if (param1 == 1) {
          var5Lifetime3 = 1;
        }
        if (param1 == 3) {
          var4Lifetime3 = -1;
        }
        if (param1 == 4) {
          var5Lifetime3 = 1;
          var4Lifetime3 = 1;
        }
        if (param1 == 5) {
          var5Lifetime3 = 1;
          var4Lifetime3 = -1;
        }
        if (6 == param1) {
          var4Lifetime3 = 1;
          var5Lifetime3 = -1;
        }
        if (param1 == 7 ||
          param1 == 8) {
          var4Lifetime3 = -1;
          var5Lifetime3 = -1;
        }
        var6Lifetime3 = -24 % ((param0 - 58) / 40);
        if (param1 == 11) {
          var4Lifetime3 = -1;
        }
        if (12 == param1) {
          var4Lifetime3 = -1;
          var5Lifetime3 = -1;
        }
        if (param1 == 13) {
          var5Lifetime3 = -1;
          var4Lifetime3 = 1;
        }
        if (14 == param1) {
          var4Lifetime3 = -1;
          var5Lifetime3 = 1;
        }
        if (15 == param1) {
          var4Lifetime3 = 1;
          var5Lifetime3 = 1;
        }
        kg.field_i = dk.a(var4Lifetime3 * var2Lifetime1, var2Lifetime1 * var5Lifetime3, false);
        return;
    }

    pf(hj[] param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        bm.field_e = false;
        if (param0 >= 73) {
          sl.field_ab = -1;
          ce.field_c = null;
          uk.field_c = -1;
          sd.field_g = 0;
          return;
        }
        field_c = (String) null;
        sl.field_ab = -1;
        ce.field_c = null;
        uk.field_c = -1;
        sd.field_g = 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ti.a(param2, 6, param4, this.field_d, param1, param3);
        if (param0 >= -63) {
          pf.a(false);
        }
    }

    static {
        field_c = "Confirm Password: ";
        field_a = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
