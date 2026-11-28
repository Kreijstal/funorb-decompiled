/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    IntrusiveNode sentinel;
    static String field_f;
    static String field_e;
    static String[] field_c;
    static String field_b;
    private IntrusiveNode iterationCursor;

    final IntrusiveNode beginForward(byte param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (param0 != 74) {
          this.iterationCursor = (IntrusiveNode) null;
          if (var2 != this.sentinel) {
            this.iterationCursor = var2.next;
            return var2;
          }
          this.iterationCursor = null;
          return null;
        }
        if (var2 != this.sentinel) {
          this.iterationCursor = var2.next;
          return var2;
        }
        this.iterationCursor = null;
        return null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2, boolean param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 != -25573) {
              return;
            }
            if (PlatformTaskDispatcher.field_m.startsWith("win") &&
              ValidationStatusIcon.a(param2, 873140897)) {
              return;
            }
            try {
              param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              DebouncedFieldValidator.a((Throwable) null, (byte) -120, "MGR1: " + param2);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("bk.C(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ma.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final IntrusiveNode removeFirst(int param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (param0 >= -58) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.addLast((IntrusiveNode) null, -66);
          if (var2 != this.sentinel) {
            var2.unlink(111);
            return var2;
          }
          return null;
        }
        if (var2 != this.sentinel) {
          var2.unlink(111);
          return var2;
        }
        return null;
    }

    final IntrusiveNode nextForward(byte param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        if (param0 <= -91) {
          this.iterationCursor = var2.next;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    public static void clearStaticReferences(boolean param0) {
        if (param0) {
          return;
        }
        field_b = null;
        field_e = null;
        field_f = null;
        field_c = null;
    }

    final boolean isEmpty(int param0) {
        if (param0 == 2220) {
          return this.sentinel == this.sentinel.next ? true : false;
        }
        field_c = (String[]) null;
        return this.sentinel == this.sentinel.next ? true : false;
    }

    final IntrusiveNode removeLast(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 >= -6) {
          field_f = (String) null;
          var2 = this.sentinel.previous;
          if (this.sentinel != var2) {
            var2.unlink(126);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (this.sentinel != var2Lifetime1) {
          var2Lifetime1.unlink(126);
          return var2Lifetime1;
        }
        return null;
    }

    final void addFirst(int param0, IntrusiveNode param1) {
        try {
          if (null != param1.previous) {
            param1.unlink(109);
          }
          param1.previous = this.sentinel;
          if (param0 > -119) {
            String var4 = (String) null;
            IntrusiveDeque.a((java.applet.Applet) null, 44, (String) null, true);
          }
          param1.next = this.sentinel.next;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "bk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.next = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    final void addLast(IntrusiveNode param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.previous != null) {
            param0.unlink(107);
          }
          param0.previous = this.sentinel.previous;
          param0.next = this.sentinel;
          param0.previous.next = param0;
          param0.next.previous = param0;
          if (param1 == 27362) {
            return;
          }
          var4 = (String) null;
          IntrusiveDeque.a((java.applet.Applet) null, -120, (String) null, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("bk.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void clear(int param0) {
        IntrusiveNode var2 = null;
        int var3 = Main.field_T;
        while (true) {
          var2 = this.sentinel.next;
          if (var2 == this.sentinel) {
            break;
          }
          var2.unlink(param0 ^ 28988);
        }
        if (param0 == 29026) {
          this.iterationCursor = null;
          return;
        }
        field_c = (String[]) null;
        this.iterationCursor = null;
    }

    static {
        field_e = "Account created successfully!";
        field_b = "Email address is unavailable";
        field_f = "Loading graphics";
    }
}
