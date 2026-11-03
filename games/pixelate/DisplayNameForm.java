/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameForm extends UiContainer implements NameSuggestionListener, ButtonListener {
    static fp field_Q;
    static String field_K;
    static DiskCacheWorker field_J;
    static String field_R;
    NameSuggestionsPanel field_S;
    static String field_M;
    private ValidatedTextWidget field_O;
    private TextButton field_P;
    private TextButton field_N;
    static int field_L;
    static dq field_I;

    private final int a(byte param0, int param1, String param2, UiComponent param3, String param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = -111 / ((param0 - 7) / 43);
          stackIn_1_0 = this.a(param5, param3, param1, param2, (byte) -121, param4, 35);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("fh.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean g(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -59) {
          discarded$0 = this.g((byte) -57);
          if (this.passesSubmissionGate(false, this.field_O)) {
            return true;
          }
          return false;
        }
        if (this.passesSubmissionGate(false, this.field_O)) {
          return true;
        }
        return false;
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_P.field_H = this.g((byte) -59);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "fh.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onAction(TextButton param0, int param1, int param2, int param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0 == this.field_N) {
            IntrusiveDequeCursor.b(true);
          } else {
            if (param0 == this.field_P) {
              this.e((byte) 8);
            }
          }
          if (param2 == 11) {
            return;
          }
          field_M = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("fh.Q(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean passesSubmissionGate(boolean param0, ValidationProvider param1) {
        ValidationSource var3 = null;
        RuntimeException var3_ref = null;
        dj var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_K = (String) null;
          }
          var3 = param1.a(1);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a((byte) 93);
          stackIn_8_0 = (var4 == qk.field_g);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("fh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 >= 12) {
          ((NameAvailabilityValidator) (this.field_O.a(1))).f(63);
          return;
        }
        UiComponent var3 = (UiComponent) null;
        this.onFocusedKey(-89, 53, (UiComponent) null, 'e');
        ((NameAvailabilityValidator) (this.field_O.a(1))).f(63);
    }

    private final int a(int param0, UiComponent param1, int param2, String param3, byte param4, String param5, int param6) {
        RuntimeException var8 = null;
        ValidationHelpWidget var9 = null;
        int var10 = 0;
        LabeledField var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new LabeledField(20, param2, param0 + 120, 25, param1, false, 120, 3, he.field_d, 16777215, param5);
          this.b(var11, 80);
          var9 = new ValidationHelpWidget(((ValidationProvider) ((Object) param1)).a(1), param3, 126, param2 + var11.field_C, 25 + param0, param6);
          var9.field_n = (UiListener) (this);
          var10 = 105 % ((param4 + 19) / 35);
          this.b(var9, 80);
          stackIn_1_0 = var11.field_C + var9.field_C;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("fh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    public final void a(String param0, byte param1) {
        ValidatedTextWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_O;
          var4 = param0;
          int var5 = 75 % ((34 - param1) / 59);
          ((EditableTextWidget) ((Object) var3)).setText(false, (byte) 87, var4);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "fh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void e(byte param0) {
        int discarded$0 = 0;
        if (param0 != 8) {
          String var3 = (String) null;
          discarded$0 = this.a((byte) 21, -50, (String) null, (UiComponent) null, (String) null, -110);
          if (this.g((byte) -59)) {
            LobbyPlayer.a(-1710418464, this.field_O.field_q);
            return;
          }
          return;
        }
        if (this.g((byte) -59)) {
          LobbyPlayer.a(-1710418464, this.field_O.field_q);
          return;
        }
    }

    public static void f(byte param0) {
        field_M = null;
        if (param0 > 120) {
          field_I = null;
          field_Q = null;
          field_K = null;
          field_R = null;
          field_J = null;
          return;
        }
        String var2 = (String) null;
        DisplayNameForm.findFriend((String) null, 57);
        field_I = null;
        field_Q = null;
        field_K = null;
        field_R = null;
        field_J = null;
    }

    public DisplayNameForm() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_O = new ValidatedTextWidget("", (UiListener) null, 12);
        TextWidgetPainter var1 = new TextWidgetPainter(ep.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, he.field_d.maxAscent, -1, 2147483647, true);
        UiComponent var2 = new UiComponent(PlayerController.field_d, var1, (UiListener) null);
        this.field_P = new TextButton(ig.field_c, (UiListener) null);
        this.field_N = new TextButton(IntrusiveNode.field_f, (UiListener) null);
        this.field_O.field_l = StatusBar.field_i;
        this.field_O.a((byte) 57, new NameAvailabilityValidator(this.field_O));
        this.field_P.field_H = false;
        this.field_P.field_y = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.field_N.field_y = (WidgetPainter) ((Object) new LinkButtonPainter());
        this.field_O.field_y = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(270, (byte) 51, var3, 20, 50);
        int var5 = 200;
        this.b(var2, 80);
        var3 += 50;
        var3 = var3 + (5 + this.a((byte) 52, var3, na.field_a, this.field_O, BufferedSocket.field_i, 170));
        this.field_P.a(var5, (byte) 49, var3, 496 - var5 >> 1, 40);
        this.field_N.a(60, (byte) 38, 15 + var3, 3 + var4, 40);
        this.field_N.field_n = (UiListener) (this);
        this.field_P.field_n = (UiListener) (this);
        this.b(this.field_P, 80);
        this.b(this.field_N, 80);
        this.field_S = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_S.a(-this.field_O.field_E + (-this.field_O.field_z + (this.field_E - 60)), (byte) 47, 20, this.field_O.field_z - (-this.field_O.field_E - 60), 150);
        this.b(this.field_S, 80);
        this.a(496, (byte) 89, 0, 0, var4 + 55 + var3);
    }

    final static SocialListEntry findFriend(String param0, int param1) {
        String var2 = null;
        int var3 = 0;
        SocialListEntry var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_3_0 = null;
        SocialListEntry stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (null == GameResultsScreen.field_q) {
            stackIn_3_0 = null;
            return (SocialListEntry) (stackIn_3_0);
          }
          var3 = -109 % ((13 - param1) / 46);
          var7 = (CharSequence) ((Object) param0);
          var2 = dh.a(var7, (byte) 118);
          if (var2 == null) {
            var2 = param0;
          }
          var4 = (SocialListEntry) (GameResultsScreen.field_q.a(-11434, (long)var2.hashCode()));
          while (var4 != null) {
            var8 = (CharSequence) ((Object) var4.field_Fb);
            var5 = dh.a(var8, (byte) 27);
            if (var5 == null) {
              var5 = var4.field_Fb;
            }
            if (var5.equals(var2)) {
              stackIn_15_0 = var4;
              return stackIn_15_0;
            }
            var4 = (SocialListEntry) (GameResultsScreen.field_q.b((byte) 47));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("fh.I(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean onFocusedKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onFocusedKey(param0, param1 ^ 0, param2, param3)) {
            return true;
          }
          if (param1 != 3) {
            field_K = (String) null;
          }
          if (param0 == 98) {
            stackIn_9_0 = this.focusNextChild(0, param2);
            return stackIn_9_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_12_0 = this.b(10, param2);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("fh.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_R = "Who can join";
        field_M = "Accept";
        field_K = "Orb coins: ";
        field_L = -1;
        field_Q = new fp();
        field_I = new dq();
    }
}
