/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StateIconLabel extends UiComponent {
    private UiComponent label;
    static IntrusiveDeque field_Lb;
    private UiComponent icon;
    static int[] field_Nb;
    static String[] field_Mb;
    static String muLobbyFriendAdd;
    static byte[][] field_Sb;
    static String warningIfyouquit;

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          StateIconLabel.releaseStatics(82);
          field_Nb = null;
          field_Mb = null;
          warningIfyouquit = null;
          muLobbyFriendAdd = null;
          field_Sb = (byte[][]) null;
          field_Lb = null;
          return;
        }
        field_Nb = null;
        field_Mb = null;
        warningIfyouquit = null;
        muLobbyFriendAdd = null;
        field_Sb = (byte[][]) null;
        field_Lb = null;
    }

    private StateIconLabel(long param0, UiComponent param1, UiComponent param2, String param3) {
        super(param0, (UiComponent) null);
        try {
          this.icon = new UiComponent(0L, param1);
          this.label = new UiComponent(0L, param2);
          this.label.text = param3;
          this.addChild(-93, this.icon);
          this.addChild(-127, this.label);
          this.markDescendantsToInheritVisualState((byte) -127);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void layoutIconLabel(byte param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        this.icon.setBounds(0, 2147483647, 0, this.icon.getContentWidth(true), this.height);
        if (param0 >= 32) {
          var3 = this.icon.width + param1;
          this.label.setBounds(0, 2147483647, var3, -var3 + this.width, this.height);
          return;
        }
        field_Nb = (int[]) null;
        var3Lifetime1 = this.icon.width + param1;
        this.label.setBounds(0, 2147483647, var3Lifetime1, -var3Lifetime1 + this.width, this.height);
    }

    StateIconLabel(long param0, Sprite param1, Sprite param2, int param3, UiComponent param4, String param5) {
        this(param0, (UiComponent) null, param4, param5);
        try {
          this.icon.selectedSprite = param1;
          this.icon.sprite = param2;
          this.icon.verticalAlignment = param3;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = UiComponentNode.replaceChar('_', "", param1, param0 ^ 23139);
          if (param0 != 23138) {
            StateIconLabel.releaseStatics(-5);
          }
          var3 = HotspotRectangle.reverseString(param1, 0);
          stackIn_7_0 = (-1 != param2.indexOf(param1)) || (param2.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("wg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void setIconLabelBounds(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        this.setBounds(param0, 2147483647, param1, param4, param2);
        this.layoutIconLabel((byte) 96, param5);
        if (param3) {
          StateIconLabel.releaseStatics(-5);
        }
    }

    StateIconLabel(long param0, StateIconLabel param1, String param2) {
        this(param0, param1.icon, param1.label, param2);
    }

    final int measureIconLabelWidth(int param0, int param1) {
        if (param1 == 2154) {
          return this.icon.getContentWidth(true) - (-param0 - this.label.getContentWidth(true));
        }
        this.measureIconLabelWidth(-72, 60);
        return this.icon.getContentWidth(true) - (-param0 - this.label.getContentWidth(true));
    }

    static {
        field_Lb = new IntrusiveDeque();
        warningIfyouquit = "Warning: if you quit, you will lose any game you are in the middle of!";
        muLobbyFriendAdd = "Add friend";
    }
}
