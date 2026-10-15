/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MicrosoftJvmCursorController extends com.ms.dll.Callback {
    private volatile boolean cursorVisible;
    private volatile int windowHandle;
    private volatile int previousWindowProcedure;
    private boolean callbackAllocated;
    private int arrowCursorHandle;

    final void movePointer(int y, int obfuscationGuard, int x) {
        if (obfuscationGuard != -4) {
          this.callbackAllocated = false;
          com.ms.win32.User32.SetCursorPos(x, y);
          return;
        }
        com.ms.win32.User32.SetCursorPos(x, y);
    }

    final void setCursorVisible(java.awt.Component component, int messageValue, boolean visible) {
        int newWindowHandle = 0;
        Object callbackLock = null;
        Throwable unusedFailure = null;
        com.ms.awt.WComponentPeer unsupportedPeer = null;
        boolean visibleForNewWindow = false;
        boolean visibleForExistingWindow = false;
        Throwable caughtFailure = null;
        unsupportedPeer = (com.ms.awt.WComponentPeer) null;
        newWindowHandle = unsupportedPeer.getTopHwnd();
        if (this.windowHandle == newWindowHandle &&
          this.cursorVisible == visible) {
          return;
        }
        if (!this.callbackAllocated) {
          this.arrowCursorHandle = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.callbackAllocated = true;
        }
        if (this.windowHandle == newWindowHandle) {
          visibleForExistingWindow = (visible);
          this.cursorVisible = visibleForExistingWindow;
        } else {
          if (this.windowHandle != 0) {
            this.cursorVisible = true;
            com.ms.win32.User32.SendMessage(newWindowHandle, 101024, 0, 0);
            callbackLock = this;
            synchronized (callbackLock) {
              com.ms.win32.User32.SetWindowLong(this.windowHandle, -4, this.previousWindowProcedure);
            }
          }
          callbackLock = this;
          synchronized (callbackLock) {
            this.windowHandle = newWindowHandle;
            this.previousWindowProcedure = com.ms.win32.User32.SetWindowLong(this.windowHandle, -4, this);
          }
          visibleForNewWindow = (visible);
          this.cursorVisible = visibleForNewWindow;
        }
        com.ms.win32.User32.SendMessage(newWindowHandle, 101024, messageValue, 0);
    }

    MicrosoftJvmCursorController() {
        this.cursorVisible = true;
    }

    final synchronized int callback(int windowHandle, int messageId, int wParam, int lParam) {
        int customMessageCursorHandle = 0;
        int clientCursorHandle = 0;
        int fallbackCursorHandle = 0;
        int foreignWindowProcedure;
        int hitTestCode;
        if (windowHandle != this.windowHandle) {
          foreignWindowProcedure = com.ms.win32.User32.GetWindowLong(windowHandle, -4);
          return com.ms.win32.User32.CallWindowProc(foreignWindowProcedure, windowHandle, messageId, wParam, lParam);
        }
        if (messageId != 32) {
          if (messageId != 101024) {
            if (messageId != 1) {
              return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, windowHandle, messageId, wParam, lParam);
            }
            this.windowHandle = 0;
            this.cursorVisible = true;
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, windowHandle, messageId, wParam, lParam);
          }
          if (!this.cursorVisible) {
            customMessageCursorHandle = 0;
          } else {
            customMessageCursorHandle = this.arrowCursorHandle;
          }
          com.ms.win32.User32.SetCursor(customMessageCursorHandle);
          return 0;
        }
        hitTestCode = lParam & 65535;
        if (1 == hitTestCode) {
          if (this.cursorVisible) {
            clientCursorHandle = this.arrowCursorHandle;
          } else {
            clientCursorHandle = 0;
          }
          com.ms.win32.User32.SetCursor(clientCursorHandle);
          return 0;
        }
        if (messageId != 101024) {
          if (messageId != 1) {
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, windowHandle, messageId, wParam, lParam);
          }
          this.windowHandle = 0;
          this.cursorVisible = true;
          return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, windowHandle, messageId, wParam, lParam);
        }
        if (!this.cursorVisible) {
          fallbackCursorHandle = 0;
        } else {
          fallbackCursorHandle = this.arrowCursorHandle;
        }
        com.ms.win32.User32.SetCursor(fallbackCursorHandle);
        return 0;
    }
}
