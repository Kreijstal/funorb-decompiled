/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    private IntrusiveDeque field_E;
    static int[] field_A;
    static String[] field_D;
    static String field_B;

    final void advanceDialogs(byte param0) {
        int var4 = Bounce.field_N;
        ea var2 = new ea(this.field_E);
        if (param0 <= 109) {
          field_A = (int[]) null;
        }
        ModalDialog var3 = (ModalDialog) (var2.a(22092));
        while (var3 != null) {
          if (var3.advanceDialogAnimation((byte) 21)) {
            var3.unlink(2);
          }
          var3 = (ModalDialog) (var2.c(-124));
        }
        this.field_x = (UiWidget) ((Object) this.getTopOpenDialog(false));
    }

    public static void clearStaticReferences(int param0) {
        field_B = null;
        if (param0 != -1) {
          field_A = (int[]) null;
        }
        field_A = null;
        field_D = null;
    }

    final void snapAndPruneDialogs(int param0) {
        int var4 = Bounce.field_N;
        if (param0 != -26623) {
          return;
        }
        ea var2 = new ea(this.field_E);
        ModalDialog var3 = (ModalDialog) (var2.a(22092));
        while (var3 != null) {
          if (var3.snapDialogAnimation((byte) -33)) {
            var3.unlink(param0 ^ -26621);
          }
          var3 = (ModalDialog) (var2.c(-102));
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != 128) {
            field_A = (int[]) null;
          }
          var3 = IntrusiveDeque.a(param2, -123);
          if (-1 != param1.indexOf(param2)) {
            return true;
          }
          if (-1 != param1.indexOf(var3)) {
            return true;
          }
          stackIn_14_0 = (param1.startsWith(param2)) || (param1.startsWith(var3)) || (param1.endsWith(param2)) || (param1.endsWith(var3));
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("pf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final ModalDialog getTopOpenDialog(boolean param0) {
        ea var2;
        ModalDialog var3;
        int var4;
        var4 = Bounce.field_N;
        var2 = new ea(this.field_E);
        var3 = (ModalDialog) (var2.a(22092));
        if (param0) {
          this.drawWidget(43, 120, -50, -123);
        }
        while (var3 != null) {
          if (var3.field_D) {
            return var3;
          }
          var3 = (ModalDialog) (var2.c(-109));
        }
        return null;
    }

    final void closeAllDialogs(int param0) {
        int var4 = Bounce.field_N;
        ea var2 = new ea(this.field_E);
        ModalDialog var3 = (ModalDialog) (var2.a(22092));
        while (var3 != null) {
          var3.field_D = false;
          var3 = (ModalDialog) (var2.c(-85));
        }
        if (param0 != -20281) {
          field_D = (String[]) null;
        }
        this.field_x = null;
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        String var3 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param0.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param0.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param0.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param1 != -1) {
            var3 = (String) null;
            ModalDialogHost.a(-115, (String) null, (String) null);
          }
          if (param0.equals("Z")) {
            stackIn_20_0 = Boolean.TYPE;
            return stackIn_20_0;
          }
          if (param0.equals("F")) {
            stackIn_23_0 = Float.TYPE;
            return stackIn_23_0;
          }
          if (param0.equals("D")) {
            stackIn_27_0 = Double.TYPE;
            return stackIn_27_0;
          }
          if (!param0.equals("C")) {
            return Class.forName(param0);
          }
          stackIn_31_0 = Character.TYPE;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("pf.O(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        int var7 = Bounce.field_N;
        if (null != this.field_j) {
          this.field_j.paintWidget(param1, (UiWidget) (this), (byte) 3, true, param3);
        }
        if (param2 < 33) {
          field_B = (String) null;
        }
        ea var5 = new ea(this.field_E);
        UiWidget var6 = (UiWidget) (var5.e(50));
        while (var6 != null) {
          var6.drawWidget(param0, param1 + this.field_i, 68, param3 + this.field_r);
          var6 = (UiWidget) (var5.a((byte) 33));
        }
    }

    final void showDialog(UiWidget param0, boolean param1) {
        ModalDialog var3 = null;
        try {
          if (!(param0 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalDialog) (param0);
          this.field_E.addFirst((byte) 83, (IntrusiveNode) (var3));
          var3.field_D = true;
          var3.takeFocus((UiWidget) (this), param1);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "pf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final UiWidget getFocusedChild(int param0) {
        ea var2;
        ModalDialog var3;
        int var4;
        var4 = Bounce.field_N;
        var2 = new ea(this.field_E);
        if (param0 != 0) {
          this.advanceDialogs((byte) -47);
        }
        var3 = (ModalDialog) (var2.a(22092));
        while (var3 != null) {
          if (var3.field_D) {
            return var3.getFocusedChild((byte) 99);
          }
          var3 = (ModalDialog) (var2.c(-119));
        }
        return null;
    }

    public ModalDialogHost() {
        super(0, 0, ob.field_a, gi.field_e, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_E = new IntrusiveDeque();
    }

    static {
        field_A = new int[128];
        field_D = new String[]{"Showing by rating", "Showing by win percentage"};
        field_B = "Please try again in a few minutes.";
    }
}
