/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int field_e;
    static sa field_c;
    static pi field_b;
    static boolean field_a;
    static int field_d;

    final static void a(byte param0) {
        sf.a(4, 11649);
        if (param0 != 75) {
          field_c = (sa) null;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
          Object var2 = (Object) null;
          oh.a((bl) null, -112, (Object) null);
        }
        return gf.field_G;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 26500) {
          oh.a(true);
        }
        gl.field_c = param2;
        oc.field_B = param1;
    }

    final static void a(bl param0, int param1, Object param2) {
        int var3_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param1 != 1) {
            field_a = false;
          }
          if (param0.field_x == null) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (param0.field_x.peekEvent() != null) {
              kk.a(1L, true);
              continue;
            }
            break;
          }
          try {
            if (param2 != null) {
              param0.field_x.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("oh.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          return;
        }
        field_c = null;
    }

    static {
        field_e = -1;
        field_c = new sa(0, 2, 2, 1);
    }
}
