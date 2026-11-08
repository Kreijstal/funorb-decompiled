/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends TextButton {
    private UiComponent field_J;
    static int field_H;
    static long field_K;
    static String field_I;

    final static void endTurnInput(byte param0) {
        rk.field_O.clearTurnActive(-256);
        if (StatefulTextPainter.field_p >= 6) {
          if (7 != StatefulTextPainter.field_p) {
            gj.switchScreen(true, true, 14, mn.field_r);
            UiContainer.selectMenuPage((byte) 120, StatefulTextPainter.field_p + 1);
          }
        } else {
          if (co.countUnitsOfType40(-20675) == 0 &&
            7 != StatefulTextPainter.field_p) {
            gj.switchScreen(true, true, 14, mn.field_r);
            UiContainer.selectMenuPage((byte) 120, StatefulTextPainter.field_p + 1);
          }
        }
        if (param0 == 74) {
          return;
        }
        mh.clearKeyQueue((byte) 11);
    }

    final boolean focusNext(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_J = (UiComponent) null;
          }
          stackIn_3_0 = this.field_J.focusNext(param0 + 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    mh(UiComponent param0) {
        try {
          this.field_J = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        int var1 = 53 % ((33 - param0) / 61);
        field_I = null;
    }

    final static void clearKeyQueue(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != 45) {
          mh.endTurnInput((byte) -22);
        }
        if (null == CredentialKind.field_a) {
          return;
        }
        var1 = CredentialKind.field_a;
        synchronized (var1) {
          CredentialKind.field_a = null;
        }
    }

    static {
        field_I = "Wands ";
    }
}
