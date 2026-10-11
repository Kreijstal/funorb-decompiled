/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlatformSupport001 extends com.ms.dll.Callback {
    private volatile int integerState0026;
    private volatile int integerState0027;
    private boolean booleanState0003;
    private int integerState0028;
    private volatile boolean booleanState0004;

    final synchronized int callback(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        if (this.integerState0027 != integerArgument1) {
          integerLocal4 = com.ms.win32.User32.GetWindowLong(integerArgument1, -4);
          return com.ms.win32.User32.CallWindowProc(integerLocal4, integerArgument1, integerArgument2, integerArgument3, integerArgument4);
        }
        if (32 != integerArgument2) {
          if (integerArgument2 != 101024) {
            if (integerArgument2 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.integerState0026, integerArgument1, integerArgument2, integerArgument3, integerArgument4);
            }
            this.integerState0027 = 0;
            this.booleanState0004 = true;
            return com.ms.win32.User32.CallWindowProc(this.integerState0026, integerArgument1, integerArgument2, integerArgument3, integerArgument4);
          }
          if (!this.booleanState0004) {
            stackIntegerLocal1 = 0;
          } else {
            stackIntegerLocal1 = this.integerState0028;
          }
          com.ms.win32.User32.SetCursor(stackIntegerLocal1);
          return 0;
        }
        integerLocal5 = integerArgument4 & 65535;
        if (1 == integerLocal5) {
          if (this.booleanState0004) {
            stackIntegerLocal2 = this.integerState0028;
          } else {
            stackIntegerLocal2 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIntegerLocal2);
          return 0;
        }
        if (integerArgument2 != 101024) {
          if (integerArgument2 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.integerState0026, integerArgument1, integerArgument2, integerArgument3, integerArgument4);
          }
          this.integerState0027 = 0;
          this.booleanState0004 = true;
          return com.ms.win32.User32.CallWindowProc(this.integerState0026, integerArgument1, integerArgument2, integerArgument3, integerArgument4);
        }
        if (!this.booleanState0004) {
          stackIntegerLocal3 = 0;
        } else {
          stackIntegerLocal3 = this.integerState0028;
        }
        com.ms.win32.User32.SetCursor(stackIntegerLocal3);
        return 0;
    }

    final void performAction0051(boolean booleanArgument1, java.awt.Component componentArgument2, byte byteArgument3) {
        boolean stackBooleanLocal1 = false;
        int stackIntegerLocal2 = 0;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        Throwable caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        Object objectLocal8 = null;
        com.ms.awt.WComponentPeer wComponentPeerLocal9 = null;
        int integerLocal10;
        wComponentPeerLocal9 = (com.ms.awt.WComponentPeer) null;
        integerLocal6 = wComponentPeerLocal9.getTopHwnd();
        if (integerLocal6 == this.integerState0027) {
          stackBooleanLocal1 = this.booleanState0004;
          stackIntegerLocal2 = (booleanArgument1) ? 0 : 1;
          if ((stackBooleanLocal1 ? 1 : 0) != stackIntegerLocal2) {
            return;
          }
        }
        if (!this.booleanState0003) {
          this.integerState0028 = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.booleanState0003 = true;
        }
        if (integerLocal6 == this.integerState0027) {
          stackBooleanLocal4 = (booleanArgument1);
          this.booleanState0004 = stackBooleanLocal4;
          integerLocal7 = 126 / ((28 - byteArgument3) / 47);
          com.ms.win32.User32.SendMessage(integerLocal6, 101024, 0, 0);
          return;
        }
        if (0 != this.integerState0027) {
          this.booleanState0004 = true;
          com.ms.win32.User32.SendMessage(integerLocal6, 101024, 0, 0);
          objectLocal8 = this;
          synchronized (objectLocal8) {
            com.ms.win32.User32.SetWindowLong(this.integerState0027, -4, this.integerState0026);
          }
        }
        objectLocal8 = this;
        synchronized (objectLocal8) {
          this.integerState0027 = integerLocal6;
          this.integerState0026 = com.ms.win32.User32.SetWindowLong(this.integerState0027, -4, this);
        }
        stackBooleanLocal3 = (booleanArgument1);
        this.booleanState0004 = stackBooleanLocal3;
        integerLocal10 = 126 / ((28 - byteArgument3) / 47);
        com.ms.win32.User32.SendMessage(integerLocal6, 101024, 0, 0);
    }

    final void performAction0050(int integerArgument1, int integerArgument2, byte byteArgument3) {
        com.ms.win32.User32.SetCursorPos(integerArgument1, integerArgument2);
        if (byteArgument3 != -98) {
          java.awt.Component componentLocal1 = (java.awt.Component) null;
          this.performAction0051(false, (java.awt.Component) null, (byte) -80);
        }
    }

    PlatformSupport001() {
        this.booleanState0004 = true;
    }
}
