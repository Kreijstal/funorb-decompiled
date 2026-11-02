/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static qr field_g;
    IntrusiveNode field_h;
    static volatile boolean field_c;
    static String field_f;
    static long field_e;
    private IntrusiveNode field_b;
    static Sprite field_d;
    static Sprite[] field_a;

    final boolean isEmpty(int param0) {
        int var2 = -83 / ((param0 + 24) / 49);
        return this.field_h == this.field_h.next ? true : false;
    }

    final int copyToArray(byte param0, IntrusiveNode[] param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        IntrusiveNode var5 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4 = -101 / ((param0 + 4) / 48);
          var3_int = 0;
          var5 = this.field_h.next;
          while (this.field_h != var5) {
            incrementValue$1 = var3_int;
            var3_int++;
            param1[incrementValue$1] = var5;
            var5 = var5.next;
          }
          stackIn_5_0 = var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        fc var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        fc var4Lifetime1;
        if (param2 != -1043) {
          return;
        }
        ve var3 = rq.a(true, param0, param1);
        if (var3 != null) {
          DerelictVictoryChecker.field_m.a(false, param2 - 15618);
          var4 = DerelictVictoryChecker.field_m;
          var5_ref_String = SocketArchiveNetworkClient.field_u;
          var4.field_j.a(param2 ^ -1044, 5, var5_ref_String);
          var4Lifetime1 = DerelictVictoryChecker.field_m;
          var5 = PointsVictoryChecker.field_p;
          var6 = td.field_P;
          var4Lifetime1.field_j.b(0, 0, 0, var5, var6);
        }
        di.a(-7904, param1, param0);
    }

    final IntrusiveNode startReverse(int param0) {
        IntrusiveNode var2 = this.field_h.previous;
        if (var2 == this.field_h) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.previous;
        if (param0 != 3725) {
          return (IntrusiveNode) null;
        }
        return var2;
    }

    final IntrusiveNode nextReverse(int param0) {
        IntrusiveNode var2 = this.field_b;
        if (this.field_h == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.previous;
        if (param0 >= -120) {
          field_a = (Sprite[]) null;
        }
        return var2;
    }

    final int size(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = param0;
        IntrusiveNode var3 = this.field_h.next;
        while (var3 != this.field_h) {
          var2++;
          var3 = var3.next;
        }
        return var2;
    }

    final IntrusiveNode startForwardFrom(IntrusiveNode param0, int param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9189) {
            this.clear(-87);
          }
          if (param0 == null) {
            var3 = this.field_h.next;
          } else {
            var3 = param0;
          }
          if (this.field_h != var3) {
            this.field_b = var3.next;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_b = null;
          stackIn_7_0 = null;
          return (IntrusiveNode) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("pf.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode pollFirst(int param0) {
        IntrusiveNode var2 = this.field_h.next;
        if (var2 == this.field_h) {
          return null;
        }
        var2.unlink((byte) -104);
        if (param0 <= 25) {
          return (IntrusiveNode) null;
        }
        return var2;
    }

    public static void c(int param0) {
        if (param0 != 0) {
          field_a = (Sprite[]) null;
        }
        field_g = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    final IntrusiveNode startForward(int param0) {
        IntrusiveNode var2 = this.field_h.next;
        if (param0 != 0) {
          field_f = (String) null;
        }
        if (this.field_h == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.next;
        return var2;
    }

    final void addFirst(IntrusiveNode param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != param0.previous) {
            param0.unlink((byte) -90);
          }
          param0.next = this.field_h.next;
          param0.previous = this.field_h;
          param0.previous.next = param0;
          param0.next.previous = param0;
          if (param1 != 0) {
            field_a = (Sprite[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pf.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode pollLast(boolean param0) {
        if (!param0) {
          this.field_h = (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_h.previous;
        if (var2 == this.field_h) {
          return null;
        }
        var2.unlink((byte) -125);
        return var2;
    }

    private final void a(boolean param0, IntrusiveNode param1, IntrusiveDeque param2) {
        IntrusiveNode var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = this.field_h.previous;
          if (param0) {
            field_f = (String) null;
          }
          this.field_h.previous = param1.previous;
          param1.previous.next = this.field_h;
          if (param1 != this.field_h) {
            param1.previous = param2.field_h.previous;
            param1.previous.next = param1;
            var4.next = param2.field_h;
            param2.field_h.previous = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("pf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void addLast(byte param0, IntrusiveNode param1) {
        if (null != param1.previous) {
          param1.unlink((byte) -104);
        }
        param1.previous = this.field_h.previous;
        param1.next = this.field_h;
        param1.previous.next = param1;
        if (param0 != -113) {
          return;
        }
        try {
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "pf.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode nextForward(byte param0) {
        IntrusiveNode var2 = this.field_b;
        if (var2 == this.field_h) {
          this.field_b = null;
          return null;
        }
        if (param0 != -71) {
          return (IntrusiveNode) null;
        }
        this.field_b = var2.next;
        return var2;
    }

    final static boolean a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param0.charAt(0);
          for (var3 = 1; var3 < param0.length(); var3++) {
            if (var2_int != param0.charAt(var3)) {
              return false;
            }
          }
          if (param1 == 24) {
            return true;
          }
          field_f = (String) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("pf.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void clear(int param0) {
        IntrusiveNode var2 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        while (true) {
          var2 = this.field_h.next;
          if (this.field_h == var2) {
            break;
          }
          var2.unlink((byte) -72);
        }
        this.field_b = null;
        if (param0 != 0) {
          IntrusiveNode var4 = (IntrusiveNode) null;
          this.addLast((byte) -24, (IntrusiveNode) null);
        }
    }

    public IntrusiveDeque() {
        this.field_h = new IntrusiveNode();
        this.field_h.next = this.field_h;
        this.field_h.previous = this.field_h;
    }

    final void transferAllTo(byte param0, IntrusiveDeque param1) {
        try {
          this.a(false, this.field_h.next, param1);
          if (param0 != -90) {
            this.field_b = (IntrusiveNode) null;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "pf.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Play free version";
        field_c = false;
    }
}
