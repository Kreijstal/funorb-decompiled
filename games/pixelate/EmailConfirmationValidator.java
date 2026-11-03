/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailConfirmationValidator extends TextFieldValidator {
    static String field_n;
    static String field_s;
    static String[] field_p;
    static BitmapFont field_r;
    private boolean field_q;
    static SceneWidget field_u;
    private MatchingTextValidator matchingValidator;
    private String checkedEmail;
    static String field_m;

    public static void f(int param0) {
        field_s = null;
        field_u = null;
        if (param0 == 16) {
          field_m = null;
          field_p = null;
          field_n = null;
          field_r = null;
          return;
        }
        EmailConfirmationValidator.e(-78);
        field_m = null;
        field_p = null;
        field_n = null;
        field_r = null;
    }

    final String describeText(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.matchingValidator.validateText(param1, true) == sk.field_a) {
            stackIn_2_0 = this.matchingValidator.describeText(-80, param1);
            return stackIn_2_0;
          }
          if (param0 >= -76) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          if (this.validateText(param1, true) != sk.field_a) {
            return e.field_c;
          }
          stackIn_9_0 = SpriteCheckboxPainter.field_e;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("kc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    EmailConfirmationValidator(EditableTextWidget param0, EditableTextWidget param1) {
        super(param0);
        this.field_q = false;
        this.checkedEmail = "";
        try {
          this.matchingValidator = new MatchingTextValidator(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "kc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static SceneWidget e(int param0) {
        if (param0 != 16) {
          return (SceneWidget) null;
        }
        return Vector3.field_c.field_Fb;
    }

    final dj validateText(String param0, boolean param1) {
        fl var3 = null;
        RuntimeException var3_ref = null;
        dj stackIn_2_0 = null;
        dj stackIn_5_0 = null;
        dj stackIn_11_0 = null;
        dj stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (dj) null;
            return stackIn_2_0;
          }
          if (this.matchingValidator.validateText(param0, param1) == sk.field_a) {
            stackIn_5_0 = sk.field_a;
            return stackIn_5_0;
          }
          if (!param0.equals(this.checkedEmail)) {
            var3 = SectorCacheStore.a(param0, (byte) -99);
            if (!var3.d(121)) {
              stackIn_11_0 = UiTheme.field_j;
              return stackIn_11_0;
            }
            this.checkedEmail = param0;
            this.field_q = var3.b(-20425);
          }
          if (!this.field_q) {
            stackIn_16_0 = sk.field_a;
          } else {
            stackIn_16_0 = qk.field_g;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("kc.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_s = "Message lobby";
        field_n = "<%0> cannot join; the game is full.";
        field_p = new String[16];
        field_m = "On";
    }
}
