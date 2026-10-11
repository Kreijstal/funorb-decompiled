/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo {
    static String field_d;
    static int field_c;
    static kc field_a;
    static boolean field_b;
    static int field_e;

    final static void a(boolean param0) {
        int var2;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (ce.field_h <= 0) {
          if (sm.field_a > 0) {
            sm.field_a = sm.field_a - 1;
          } else {
            if (oo.field_y > 0) {
              oo.field_y = oo.field_y - 1;
            }
          }
        } else {
          ce.field_h = ce.field_h - 1;
        }
        if (!param0) {
          jo.a(19);
        }
        if (ce.field_h > 0) {
          vc.a((byte) 37);
        }
        if (sm.field_a > 0) {
          ej.a(16, sm.field_a);
        }
        if (oo.field_y > 0) {
          ej.a(16, oo.field_y);
        }
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = param0; var4 < param2; var4++) {
          var6[var4] = param1;
        }
        return new String(var6);
    }

    final static boolean a(wk param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.e((byte) -88);
          stackIn_3_0 = (param1 == ~var2_int) ? 1 : 0;
          var3 = stackIn_3_0;
          stackIn_4_0 = var3;
          return stackIn_4_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("jo.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = 0;
          var4 = -83 % ((15 - param1) / 62);
          while (0 < param0) {
            var3_int = param2 & 1 | var3_int << 1;
            param2 = param2 >>> 1;
            param0--;
          }
          stackIn_5_0 = var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "jo.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          jo.a(68, (byte) 21, -121);
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_c = 0;
        field_d = "Lesson 1 of 7<br><br>Learn the basics of throwing fire in a safe and secure environment.<br><br>Use the Fire Ball spell to destroy all three targets.<br><br><br>* How to look around *<br>* Selecting a spell *<br>* Shooting spells *<br>* Use of accuracy *";
    }
}
