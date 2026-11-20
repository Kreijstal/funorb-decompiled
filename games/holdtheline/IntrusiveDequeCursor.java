/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeCursor {
    private IntrusiveDeque field_d;
    private IntrusiveNode field_a;
    static String[] field_b;
    static long field_c;

    final IntrusiveNode firstOrFrom(IntrusiveNode param0, byte param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_d.sentinel.next;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_d.sentinel) {
            this.field_a = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          this.field_a = var3.next;
          if (param1 >= -100) {
            this.field_a = (IntrusiveNode) null;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("tm.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            if (param0 != -32312) {
              IntrusiveDequeCursor.clearSharedReferences((byte) 13);
            }
            il.field_a = param1;
            try {
              var6 = param2.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param1.length() == 0) {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var7 + "; Expires=" + cd.formatCookieDate(param0 + 32381, bb.monotonicTimeMillis(-1) + 94608000000L) + "; Max-Age=" + 94608000L;
              }
              JavaScriptBridge.evaluateJavaScript(param2, -31645, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (Throwable throwable) {
            }
            bb.updateNavigationLinks(param2, (byte) 49);
          } catch (RuntimeException runtimeException) {
            throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "tm.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final IntrusiveNode last(int param0) {
        IntrusiveNode var2 = this.field_d.sentinel.previous;
        if (param0 != 8115) {
          return (IntrusiveNode) null;
        }
        if (var2 != this.field_d.sentinel) {
          this.field_a = var2.previous;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    final static boolean b(boolean param0) {
        if (param0) {
          return false;
        }
        return !WidgetStyleNode.field_o.isComplete(250) ? true : false;
    }

    final IntrusiveNode lastOrFrom(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -10279) {
            field_b = (String[]) null;
          }
          if (param1 == null) {
            var3 = this.field_d.sentinel.previous;
          } else {
            var3 = param1;
          }
          if (var3 != this.field_d.sentinel) {
            this.field_a = var3.previous;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_a = null;
          stackIn_7_0 = null;
          return (IntrusiveNode) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("tm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = 15 / ((param0 - 73) / 50);
        field_b = null;
    }

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = this.field_a;
        if (var2 == this.field_d.sentinel) {
          this.field_a = null;
          return null;
        }
        if (!param0) {
          this.field_a = var2.previous;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode next(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -104) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.lastOrFrom(-43, (IntrusiveNode) null);
          var2 = this.field_a;
          if (this.field_d.sentinel != var2) {
            this.field_a = var2.next;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        var2Lifetime1 = this.field_a;
        if (this.field_d.sentinel != var2Lifetime1) {
          this.field_a = var2Lifetime1.next;
          return var2Lifetime1;
        }
        this.field_a = null;
        return null;
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode c(byte param0) {
        int var3 = -72 % ((param0 + 65) / 49);
        IntrusiveNode var2 = this.field_d.sentinel.next;
        if (var2 != this.field_d.sentinel) {
          this.field_a = var2.next;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    static {
        field_c = 20000000L;
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
