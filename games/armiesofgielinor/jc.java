/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends mn {
    private int field_y;
    static String[] field_v;
    static String field_x;
    static um field_B;
    private int field_A;
    static String field_w;
    private int field_z;

    final static String a(String param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          if (param1 != 42) {
            field_w = (String) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (var4 == 0) {
              var5 = hc.a(98, (char) var5);
            } else {
              var5 = Character.toLowerCase((char) var5);
            }
            var3[var4] = (char)var5;
          }
          stackIn_10_0 = new String(var3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("jc.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static b b(int param0, int param1) {
        b var2 = null;
        b var2Lifetime1;
        if (param0 == -1) {
          var2 = new b();
          ta.field_O.a((byte) -119, (tc) (var2));
          a.a(param1, (byte) -32);
          return var2;
        }
        field_w = (String) null;
        var2Lifetime1 = new b();
        ta.field_O.a((byte) -119, (tc) (var2Lifetime1));
        a.a(param1, (byte) -32);
        return var2Lifetime1;
    }

    private final String a(String[] param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_4_0 = this.a(125, param0, "deploy");
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jc.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_x = null;
        field_B = null;
        int var1 = 117 % ((-27 - param0) / 51);
        field_v = null;
        field_w = null;
    }

    jc(int param0, int param1, int param2, int param3) {
        this.field_p = param0;
        this.field_A = param1;
        this.field_y = param3;
        this.field_z = param2;
    }

    final bd a(int param0, ha param1) {
        String discarded$11 = null;
        String discarded$10 = null;
        String discarded$9 = null;
        String discarded$8 = null;
        String discarded$6 = null;
        String discarded$7 = null;
        RuntimeException var3 = null;
        ne var4 = null;
        jd var5 = null;
        jd var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_19_0 = null;
        bd stackIn_22_0 = null;
        pl stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.d(96);
          var5 = param1.c(this.field_z, true, this.field_A);
          var6 = var5;
          if (var6 == null) {
            discarded$11 = this.a(new String[]{"no unit at ", ci.c(this.field_A, 0, this.field_z)}, false);
            stackIn_2_0 = null;
            return (bd) (stackIn_2_0);
          }
          if (this.field_p != var6.field_O) {
            discarded$10 = this.a(new String[]{"unit at ", ci.c(this.field_A, 0, this.field_z), "not owned by player ", "" + this.field_p}, false);
            stackIn_5_0 = null;
            return (bd) (stackIn_5_0);
          }
          if (var6.field_s) {
            discarded$9 = this.a(new String[]{"unit at ", ci.c(this.field_A, 0, this.field_z), " has moved"}, false);
            stackIn_8_0 = null;
            return (bd) (stackIn_8_0);
          }
          if (0 >= (bw.field_m[var5.field_N][10] & 1024)) {
            discarded$8 = this.a(new String[]{"unit at ", ci.c(this.field_A, 0, this.field_z), " cannot deploy"}, false);
            stackIn_11_0 = null;
            return (bd) (stackIn_11_0);
          }
          var4 = param1.field_Eb[var6.field_J + var6.field_w * param1.field_v];
          if (34 == var6.field_N &&
            !var4.f(19725)) {
            discarded$6 = this.a(new String[]{"can't deploy on top of structure at ", ci.c(this.field_A, 0, this.field_z)}, false);
            stackIn_15_0 = null;
            return (bd) (stackIn_15_0);
          }
          if (var6.field_N == 7 &&
            var4.field_h != 0) {
            discarded$7 = this.a(new String[]{"can't deploy on top of structure at ", ci.c(this.field_A, 0, this.field_z)}, false);
            stackIn_19_0 = null;
            return (bd) (stackIn_19_0);
          }
          if (param0 > 31) {
            stackIn_24_0 = new pl(this.field_p, var6, this.field_y);
            return (bd) ((Object) stackIn_24_0);
          }
          stackIn_22_0 = (bd) null;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("jc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_w = "Send private Quick Chat to <%0>";
        field_x = "Warning! All your portals are blocked and you haven't moved a unit recently. You have <%0> turns until you fail the mission.";
    }
}
