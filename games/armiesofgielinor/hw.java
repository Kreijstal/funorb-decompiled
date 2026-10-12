/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw extends mn {
    static String field_z;
    static String field_x;
    private int field_A;
    static int field_B;
    private int field_E;
    static String field_C;
    private int field_v;
    static String field_y;
    static String field_w;
    static String field_D;

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            hw.a((byte) 111);
          }
          stackIn_3_0 = nk.a(false, param0, (byte) -95);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hw.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String a(String[] param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -50) {
            field_C = (String) null;
          }
          stackIn_3_0 = this.a(119, param0, "summon");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hw.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 >= -74) {
          field_w = (String) null;
        }
        if (tb.field_e != null) {
          tb.field_e.b(param0, 20);
        }
    }

    public static void a(byte param0) {
        field_y = null;
        if (param0 >= -42) {
          CharSequence var2 = (CharSequence) null;
          hw.a((CharSequence) null, true);
        }
        field_z = null;
        field_D = null;
        field_x = null;
        field_w = null;
        field_C = null;
    }

    final static String a(int param0, Class param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 640) {
            hw.a(false, (byte) 44);
          }
          if (param1.isArray()) {
            stackIn_6_0 = hw.a(param0 ^ 0, param1.getComponentType()) + "[]";
            return stackIn_6_0;
          }
          stackIn_4_0 = param1.getName().substring(1 + param1.getName().lastIndexOf("."));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("hw.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        wk var5 = null;
        int var6 = 0;
        wk var7 = null;
        wk var5Lifetime1;
        int var4Lifetime1;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var3_int = -1;
          if (null != gv.field_a &&
            param1 < gv.field_a.length) {
            if (null != gv.field_a[param1] &&
              gv.field_a[param1].length > param2) {
              if (param0 != 29) {
                hw.a(false);
              }
              for (var4 = 0; gv.field_a[param1][param2].length > var4; var4++) {
                var7 = gv.field_a[param1][param2][var4];
                var5 = var7;
                if (var7 != null &&
                  var7.field_A >= 0 && (var3_int < 0 ||
                  !(var7.field_A < var3_int))) {
                  var3_int = var7.field_A;
                }
              }
              if (var3_int <= 0) {
                return;
              }
              for (var4Lifetime1 = 0; var4Lifetime1 < gv.field_a[param1][param2].length; var4Lifetime1++) {
                var5Lifetime1 = gv.field_a[param1][param2][var4Lifetime1];
                if (var5Lifetime1 != null &&
                  var3_int > var5Lifetime1.field_A) {
                  var5Lifetime1.field_w = -var5Lifetime1.field_A + var3_int >> 1;
                  var5Lifetime1.field_A = var3_int;
                }
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "hw.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final bd a(int param0, ha param1) {
        int var6 = 0;
        String discarded$0 = null;
        String discarded$1 = null;
        String discarded$2 = null;
        Object stackIn_20_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        be stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var4Lifetime1;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          this.d(-114);
          if (this.field_v == 74 &&
            param1.field_Bb) {
            this.field_v = 4;
          }
          if (this.field_v == 4 &&
            param1.field_hb == 2) {
            this.field_v = 81;
          }
          var3_int = bw.field_m[this.field_v][1];
          if (var3_int != -1) {
            var4 = 0;
            var5 = param1.field_c[this.field_p];
            for (var6 = 0; var6 < var5.length; var6++) {
              var7 = var5[var6];
              if (~var7 != ~var3_int) {
                continue;
              }
              var4 = 1;
              break;
            }
            if (var4 == 0) {
              discarded$0 = this.a(new String[]{"God not selected: ", Integer.toString(var3_int)}, (byte) -62);
              stackIn_20_0 = null;
              return (bd) (stackIn_20_0);
            }
          } else {
            var3_int = 12;
          }
          if (0 == (param1.c(this.field_E, -27300, this.field_A, this.field_p) & 1 << var3_int)) {
            discarded$1 = this.a(new String[]{"Can't summon followers of god: ", Integer.toString(var3_int), " at ", ci.c(this.field_E, 0, this.field_A)}, (byte) -111);
            stackIn_24_0 = null;
            return (bd) (stackIn_24_0);
          }
          if (!param1.b(this.field_A, -26813, this.field_v, this.field_E, this.field_p)) {
            discarded$2 = this.a(new String[]{"Can't afford creature type: ", Integer.toString(this.field_v), " at ", ci.c(this.field_E, 0, this.field_A)}, (byte) -87);
            stackIn_27_0 = null;
            return (bd) (stackIn_27_0);
          }
          if (param0 < 31) {
            field_y = (String) null;
          }
          var4Lifetime1 = param1.a(bw.field_m[this.field_v][1], this.field_A, this.field_E, 0, this.field_p, bw.field_m[this.field_v][2]);
          stackIn_31_0 = new be(this.field_E, this.field_A, this.field_v, var4Lifetime1, this.field_p);
          return (bd) ((Object) stackIn_31_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("hw.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
          field_B = -104;
        }
        return -co.field_f + bm.field_h;
    }

    final static void a(byte param0, int[] param1, int param2) {
        try {
          kr.field_y[param2] = param1;
          rq.field_p[param2] = new ci(param2);
          if (param0 <= 17) {
            field_B = -14;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "hw.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    hw(int param0, int param1, int param2, int param3) {
        this.field_v = param3;
        this.field_E = param1;
        this.field_p = param0;
        this.field_A = param2;
    }

    static {
        field_z = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_x = "Plate";
        field_C = "Only show private chat from my friends and opponents";
        field_w = "This coat of arms will be unlocked at <%0>. After collecting <%1> more, you may use any of the parts from it in your own coat of arms.";
        field_y = "You cannot join this game - it is in progress";
        field_D = "Your captured buildings will produce a bonus amount of mana per turn.";
    }
}
