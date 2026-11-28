/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyboardInputHandler implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static int field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (null != sj.field_d) {
            mh.field_b = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < mi.field_c.length) {
              var2_int = mi.field_c[var2_int];
              if (0 != (var2_int & 128)) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (AccountCreationResultPanel.field_rb >= 0 &&
              var2_int >= 0) {
              oc.field_h[AccountCreationResultPanel.field_rb] = var2_int;
              AccountCreationResultPanel.field_rb = 1 + AccountCreationResultPanel.field_rb & 127;
              if (field_b == AccountCreationResultPanel.field_rb) {
                AccountCreationResultPanel.field_rb = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 1 + sa.field_b & 127;
              if (DiskArchiveRequest.field_t != var3) {
                db.field_c[sa.field_b] = var2_int;
                e.field_b[sa.field_b] = (char)0;
                sa.field_b = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if (0 != (10 & var3Lifetime1)) {
              param0.consume();
              return;
            }
            if (var2_int == 85) {
              param0.consume();
              return;
            }
            if (var2_int == 10) {
              param0.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("be.keyPressed(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (sj.field_d == null) {
            return;
          }
          AccountCreationResultPanel.field_rb = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("be.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (sj.field_d != null) {
            mh.field_b = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              mi.field_c.length > var2_int) {
              var2_int = -129 & mi.field_c[var2_int];
            } else {
              var2_int = -1;
            }
            if (AccountCreationResultPanel.field_rb >= 0 &&
              var2_int >= 0) {
              oc.field_h[AccountCreationResultPanel.field_rb] = ~var2_int;
              AccountCreationResultPanel.field_rb = AccountCreationResultPanel.field_rb + 1 & 127;
              if (field_b == AccountCreationResultPanel.field_rb) {
                AccountCreationResultPanel.field_rb = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("be.keyReleased(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (sj.field_d != null) {
            var2_int = param0.getKeyChar();
            if (0 != var2_int && 65535 != var2_int &&
              TextFieldValidator.isSupportedCp1252KeyCharacter(111, (char) var2_int)) {
              var3 = sa.field_b + 1 & 127;
              if (var3 != DiskArchiveRequest.field_t) {
                db.field_c[sa.field_b] = -1;
                e.field_b[sa.field_b] = (char)var2_int;
                sa.field_b = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "be.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        ti.field_c = gf.field_h[param1];
        FullscreenFocusCanvas.field_d = ri.field_a[param1];
        int var2 = -109 / ((-56 - param0) / 40);
        MatchingFieldValidator.field_j = RichTextWidget.field_I[param1];
    }

    static {
        field_b = 0;
    }
}
