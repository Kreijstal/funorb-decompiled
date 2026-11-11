/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tia {
    static kea field_d;
    static int field_a;
    static String[] fallDeathMessages;
    static String field_b;

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.removeMouseListener(ColourGradientOperator.field_n);
          param1.removeMouseMotionListener(ColourGradientOperator.field_n);
          param1.removeFocusListener(ColourGradientOperator.field_n);
          tka.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "tia.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        if (param0 >= -91) {
          field_d = (kea) null;
          fallDeathMessages = null;
          field_b = null;
          return;
        }
        fallDeathMessages = null;
        field_b = null;
    }

    final static int atan2(int param0, int param1, int param2) {
        if (param2 != -29543) {
          field_b = (String) null;
        }
        if (param1 == 0) {
          if (0 == param0) {
            return 0;
          }
          if (param0 >= 0) {
            return 2048;
          }
          return -2048;
        }
        if (param1 >= 0) {
          if (param0 == 0) {
            return 0;
          }
          if (param0 < 0) {
            return -WeaponShooterBehaviour.atan2FirstQuadrant(-50, -param0, param1);
          }
          return WeaponShooterBehaviour.atan2FirstQuadrant(123, param0, param1);
        }
        if (param0 == 0) {
          return 4096;
        }
        if (param0 >= 0) {
          return -WeaponShooterBehaviour.atan2FirstQuadrant(-29, param0, -param1) + 4096;
        }
        return WeaponShooterBehaviour.atan2FirstQuadrant(120, -param0, -param1) - 4096;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (param5) {
            return;
          }
          incrementValue$0 = param1;
          param1++;
          nra.fillRange((byte) -55, param3, param2, vaa.field_a[incrementValue$0], param4);
          incrementValue$1 = param0;
          param0--;
          nra.fillRange((byte) -55, param3, param2, vaa.field_a[incrementValue$1], param4);
          for (var6_int = param1; param0 >= var6_int; var6_int++) {
            var7 = vaa.field_a[var6_int];
            var7[param2] = param3;
            var7[param4] = param3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var6), "tia.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param1 != -23403) {
          return false;
        }
        return qp.hasFlag16(param2, (byte) 121, param0) & mm.hasFlag2048(-112, param2, param0);
    }

    static {
        fallDeathMessages = new String[]{"<%0> took a tumble", "<%0> slipped and fell", "<%0> fought with gravity and lost", "<%0> fought with Newton's law and the law won", "<%0>'s attempt was pitiful", "<%0> became the fall-guy", "<%0>'s velocity was definitely terminal", "<%0> has fallen and cannot get up"};
        field_d = new kea();
    }
}
