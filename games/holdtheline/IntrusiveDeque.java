/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    IntrusiveNode sentinel;
    static DualNodeHashTable field_a;
    static int field_b;
    static ResourceArchive field_d;
    private IntrusiveNode cursor;

    final static int a(BoundaryCurve param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        TrackBoundary var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10Lifetime1;
        try {
          var11 = (TrackBoundary) (param0);
          var5 = var11.start.y;
          var6 = var11.end.y;
          var7 = var11.start.x;
          var8 = var11.end.x;
          if (var5 == var6) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = 27 / ((param1 - 31) / 32);
          if (var5 > var6) {
            var10 = var5;
            var5 = var6;
            var6 = var10;
            var10Lifetime1 = var7;
            var7 = var8;
            var8 = var10Lifetime1;
          }
          if (param2 <= var5) {
            stackIn_11_0 = 0;
            return stackIn_11_0;
          }
          if (var6 < param2) {
            return 0;
          }
          if ((-var5 + param2) * (-var7 + var8) <= (-var7 + param3) * (-var5 + var6)) {
            stackIn_16_0 = 0;
            return stackIn_16_0;
          }
          stackIn_14_0 = 1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ah.M(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final IntrusiveNode next(byte param0) {
        IntrusiveNode var2 = this.cursor;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        int var3 = 110 % ((32 - param0) / 54);
        this.cursor = var2.next;
        return var2;
    }

    final static void b(boolean param0) {
        oi.field_f = param0 ? true : false;
        DelayedServerPacket.field_j = null;
        dg.field_b = null;
        qg.field_b = null;
        StraightRoadSlicer.field_a = null;
    }

    private final void moveSuffixTo(IntrusiveNode param0, byte param1, IntrusiveDeque param2) {
        IntrusiveNode var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = this.sentinel.previous;
          this.sentinel.previous = param0.previous;
          param0.previous.next = this.sentinel;
          if (param0 != this.sentinel) {
            param0.previous = param2.sentinel.previous;
            param0.previous.next = param0;
            var4.next = param2.sentinel;
            param2.sentinel.previous = var4;
          }
          if (param1 < -98) {
            return;
          }
          field_b = 68;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("ah.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
        field_d = null;
    }

    final boolean isEmpty(int param0) {
        if (param0 == 0) {
          return this.sentinel.next == this.sentinel ? true : false;
        }
        field_d = (ResourceArchive) null;
        return this.sentinel.next == this.sentinel ? true : false;
    }

    final static void insertBefore(IntrusiveNode param0, int param1, IntrusiveNode param2) {
        try {
          if (null != param2.previous) {
            param2.unlink(0);
          }
          param2.next = param0;
          param2.previous = param0.previous;
          if (param1 != 0) {
            field_a = (DualNodeHashTable) null;
          }
          param2.previous.next = param2;
          param2.next.previous = param2;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ah.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void addLast(byte param0, IntrusiveNode param1) {
        if (param0 >= -61) {
          return;
        }
        try {
          if (param1.previous != null) {
            param1.unlink(0);
          }
          param1.next = this.sentinel;
          param1.previous = this.sentinel.previous;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ah.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, byte param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (il.field_a != null &&
            !il.field_a.equals(param1.getParameter("settings"))) {
            var3 = il.field_a;
            var4 = var3;
            var4 = var3;
          }
          if (null != DialWidget.field_M &&
            !DialWidget.field_M.equals(param1.getParameter("session"))) {
            var4 = DialWidget.field_M;
          }
          if (param2 > 6) {
            stackIn_10_0 = AccountProgressDialog.a((String) (var3), (String) (var4), param0, (byte) -118, -1);
            return stackIn_10_0;
          }
          stackIn_8_0 = (java.net.URL) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ah.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final void clear(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = HoldTheLine.field_D;
        while (true) {
          var2 = this.sentinel.next;
          if (this.sentinel != var2) {
            var2.unlink(0);
            continue;
          }
          break;
        }
        if (param0 == 29020) {
          this.cursor = null;
          return;
        }
        field_d = (ResourceArchive) null;
        this.cursor = null;
        return;
    }

    final IntrusiveNode last(byte param0) {
        if (param0 != 124) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.previous;
        return var2;
    }

    final IntrusiveNode previous(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -4140) {
          this.sentinel = (IntrusiveNode) null;
          var2 = this.cursor;
          if (this.sentinel == var2) {
            this.cursor = null;
            return null;
          }
          this.cursor = var2.previous;
          return var2;
        }
        var2Lifetime1 = this.cursor;
        if (this.sentinel == var2Lifetime1) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    final IntrusiveNode removeLast(byte param0) {
        if (param0 != 74) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel != var2) {
          var2.unlink(0);
          return var2;
        }
        return null;
    }

    final void moveAllTo(int param0, IntrusiveDeque param1) {
        try {
          if (param0 != -30510) {
            field_b = -18;
          }
          this.moveSuffixTo(this.sentinel.next, (byte) -123, param1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ah.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void addFirst(IntrusiveNode param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.previous != null) {
            param0.unlink(0);
          }
          param0.next = this.sentinel.next;
          param0.previous = this.sentinel;
          param0.previous.next = param0;
          param0.next.previous = param0;
          if (!param1) {
            return;
          }
          this.sentinel = (IntrusiveNode) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ah.P(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode first(byte param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (param0 <= 84) {
          IntrusiveDeque.clearSharedReferences(true);
          if (this.sentinel != var2) {
            this.cursor = var2.next;
            return var2;
          }
          this.cursor = null;
          return null;
        }
        if (this.sentinel != var2) {
          this.cursor = var2.next;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    static {
    }
}
