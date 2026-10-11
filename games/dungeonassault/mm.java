/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ne {
    int field_r;
    static int field_t;
    static int field_q;
    int field_i;
    static String field_s;
    int field_n;
    static String field_m;
    int field_l;
    int field_o;
    static boolean field_k;
    static String field_j;
    int field_p;

    final static di a(ec param0, boolean param1) {
        di var2 = null;
        RuntimeException var2_ref = null;
        ec var3 = null;
        di stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new di();
          if (param1) {
            var3 = (ec) null;
            mm.a((ec) null, false);
          }
          var2.a(param0, -1);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("mm.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > 110) {
          field_m = null;
          field_j = null;
          field_s = null;
          return;
        }
        ec var2 = (ec) null;
        mm.a((ec) null, false);
        field_m = null;
        field_j = null;
        field_s = null;
    }

    private mm() throws Throwable {
        throw new Error();
    }

    final static int a(CharSequence param0, boolean param1, int param2, int param3) {
        int var8 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ec var12 = null;
        var11 = DungeonAssault.field_K;
        try {
          if (param2 >= 2 &&
            param2 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            if (param3 != 3703) {
              var12 = (ec) null;
              mm.a((ec) null, false);
            }
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param0.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param1))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param2) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param2;
                if (var10 / param2 != var6) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_41_0 = var6;
            return stackIn_41_0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("mm.B(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_m = "Venturing down from the northern mountains in search of food and combat, the goblin cleaver's wooden shield and hatchet will give a dungeon's lesser denziens cause to think.";
        field_s = "PLAN: ";
        field_j = "Highest: <col=DB0100><%0></col>";
        field_q = -1;
    }
}
