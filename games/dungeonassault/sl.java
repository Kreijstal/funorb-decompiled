/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static int field_d;
    static RgbSprite[] field_c;
    static String field_a;
    static rh field_b;

    public static void clearStaticReferences(int param0) {
        field_a = null;
        if (param0 < 103) {
          field_c = (RgbSprite[]) null;
          field_b = null;
          field_c = null;
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          IntrusiveNode.field_c = ah.a(gh.field_c, 200, "", "roman20", StripedProgressWidget.field_I);
          la.field_b = ah.a(gh.field_c, 200, "", "roman12", StripedProgressWidget.field_I);
          f.field_a = oh.a(StripedProgressWidget.field_I, "basic", 11091, "unachieved");
          int var2_int = -24 % ((param0 + 15) / 54);
          PlayerDungeonProfile.field_o = oh.a(StripedProgressWidget.field_I, "basic", 11091, "orbcoin");
          nj.a(gh.field_c, StripedProgressWidget.field_I, -6332);
          cp.a(0, param1, (byte) -36, 0, qk.field_b, 16777215);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "sl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 == 15000) {
          EditableTextField.field_P = true;
          ab.field_a = kd.correctedCurrentTimeMillis(-2456) + 15000L;
          return 11 == AccountNameAvailabilityValidator.field_n ? true : false;
        }
        sl.b(126);
        EditableTextField.field_P = true;
        ab.field_a = kd.correctedCurrentTimeMillis(-2456) + 15000L;
        return 11 == AccountNameAvailabilityValidator.field_n ? true : false;
    }

    static {
        field_a = "Logging in...";
    }
}
