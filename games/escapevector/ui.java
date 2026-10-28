/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static LoginCredentialType field_a;
    static String field_d;
    int field_c;
    static al field_b;
    static volatile int field_e;

    public static void releaseStatics(boolean guard) {
        field_a = null;
        if (!guard) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    final static int a(sn param0, sn param1, int param2) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        try {
          int var3_int = -113 % ((param2 + 13) / 50);
          String var4 = (String) null;
          int stackIn_1_0 = SelfDestructEffects.a((byte) -32, false, (String) null, param0, param1, 0, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3;
          StringBuilder stackIn_4_1 = new StringBuilder().append("ui.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final static Sprite[] a(String param0, ResourceArchive param1, String param2, byte param3) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param3 < 67) {
            field_b = (al) null;
          }
          int var4_int = param1.findGroupId(-1, param2);
          int var5 = param1.findFileId(var4_int, param0, true);
          Sprite[] stackIn_3_0 = gm.a(var4_int, var5, param1, 8192);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ui.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (be.field_b == null) {
          int var1 = -22 / ((param0 - 26) / 51);
          rc.field_b = new DisplayNameForm();
          rd.field_c.transitionToContent(rc.field_b, 30);
          return;
        }
        be.field_b.closeDialog(-18861);
        int var1Lifetime1 = -22 / ((param0 - 26) / 51);
        rc.field_b = new DisplayNameForm();
        rd.field_c.transitionToContent(rc.field_b, 30);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        ValidatedTextWidget.field_X = param0;
        pc.field_d = param1;
        lh.field_e = param2;
        if (param3 != -11997) {
          field_e = 84;
        }
    }

    static {
        field_a = new LoginCredentialType(0);
        field_d = "Explosive is on hill - please land closer";
        field_e = 0;
    }
}
