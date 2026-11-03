/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeCursor {
    static ph field_c;
    static int field_d;
    static int field_h;
    private IntrusiveDeque field_a;
    static int field_e;
    private IntrusiveNode field_g;
    static String friendnotfound;
    static UiComponent field_b;

    final IntrusiveNode previous(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 > -79) {
          this.next((byte) 37);
          var2 = this.field_g;
          if (var2 != this.field_a.field_e) {
            this.field_g = var2.previous;
            return var2;
          }
          this.field_g = null;
          return null;
        }
        var2Lifetime1 = this.field_g;
        if (var2Lifetime1 != this.field_a.field_e) {
          this.field_g = var2Lifetime1.previous;
          return var2Lifetime1;
        }
        this.field_g = null;
        return null;
    }

    public static void releaseStatics(byte param0) {
        friendnotfound = null;
        if (param0 == -5) {
          field_b = null;
          field_c = null;
          return;
        }
        i var2 = (i) null;
        IntrusiveDequeCursor.a(true, (i) null, 8);
        field_b = null;
        field_c = null;
    }

    final IntrusiveNode last(byte param0) {
        IntrusiveNode var2 = this.field_a.field_e.previous;
        if (param0 != -92) {
          return (IntrusiveNode) null;
        }
        if (var2 == this.field_a.field_e) {
          this.field_g = null;
          return null;
        }
        this.field_g = var2.previous;
        return var2;
    }

    final IntrusiveNode next(byte param0) {
        IntrusiveNode var2 = this.field_g;
        if (this.field_a.field_e == var2) {
          this.field_g = null;
          return null;
        }
        if (param0 == -71) {
          this.field_g = var2.next;
          return var2;
        }
        this.field_g = (IntrusiveNode) null;
        this.field_g = var2.next;
        return var2;
    }

    final IntrusiveNode a(IntrusiveNode param0, int param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_a.field_e.next;
          } else {
            var3 = param0;
          }
          if (param1 > -96) {
            stackIn_5_0 = (IntrusiveNode) null;
            return stackIn_5_0;
          }
          if (this.field_a.field_e != var3) {
            this.field_g = var3.next;
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          this.field_g = null;
          stackIn_8_0 = null;
          return (IntrusiveNode) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("aa.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode first(int param0) {
        IntrusiveNode var2 = this.field_a.field_e.next;
        if (this.field_a.field_e == var2) {
          this.field_g = null;
          return null;
        }
        if (param0 == 0) {
          this.field_g = var2.next;
          return var2;
        }
        field_c = (ph) null;
        this.field_g = var2.next;
        return var2;
    }

    final IntrusiveNode a(IntrusiveNode param0, boolean param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = (IntrusiveNode) null;
            return stackIn_2_0;
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_a.field_e.previous;
          }
          if (var3 != this.field_a.field_e) {
            this.field_g = var3.previous;
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          this.field_g = null;
          stackIn_8_0 = null;
          return (IntrusiveNode) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("aa.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, i param1, int param2) {
        try {
          ue.field_b.b((byte) 85, param1);
          if (param0) {
            field_h = -20;
          }
          gp.a(param2, param1, -6725);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(IntrusiveDeque param0, boolean param1) {
        try {
          if (param1) {
            IntrusiveNode var4 = (IntrusiveNode) null;
            this.a((IntrusiveNode) null, -99);
          }
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "aa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public IntrusiveDequeCursor() {
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "aa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 0;
        field_d = 3;
        friendnotfound = "<%0> is not on your friend list.";
        field_c = new ph();
    }
}
