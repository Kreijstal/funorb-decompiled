/*
 * Decompiled by CFR-JS 0.4.0.
 */
class re extends TextWidgetPainter {
    static ValidationState field_s;
    static IntrusiveDeque field_q;
    static String[] field_r;

    re(int param0) {
        this(Js5Transport.field_a, param0);
    }

    final static void d(int param0) {
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == ck.field_v) {
          if (param0 == 2) {
            return;
          }
          DialogueScreen var3 = (DialogueScreen) null;
          re.a(68, (DialogueScreen) null);
          return;
        }
        Object var1 = ck.field_v;
        synchronized (var1) {
          ck.field_v = null;
        }
        if (param0 != 2) {
          DialogueScreen var3Lifetime1 = (DialogueScreen) null;
          re.a(68, (DialogueScreen) null);
        }
    }

    final static void a(int param0, DialogueScreen param1) {
        try {
          mg.field_e.addLast(-12328, param1);
          if (param0 != 1820) {
            field_r = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "re.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        String stackIn_8_2 = null;
        try {
          if (enabled) {
            mn.a(-27951, originX + component.x, originY + component.y, component.width, component.height);
          }
          super.drawWidget(originX, originY, -60, component, enabled);
          if (guard < -14) {
            return;
          }
          field_s = (ValidationState) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var6;
          StringBuilder stackIn_7_1 = new StringBuilder().append("re.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(enabled).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_r = null;
        field_s = null;
        field_q = null;
        if (param0 != -11967) {
          field_s = (ValidationState) null;
        }
    }

    re(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_r, -1, 2147483647, false);
    }

    static {
        field_s = new ValidationState();
        field_q = new IntrusiveDeque();
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
