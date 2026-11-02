/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeCursor {
    private IntrusiveDeque field_c;
    static String field_b;
    static String[] field_a;
    private IntrusiveNode field_d;

    final IntrusiveNode c(byte param0) {
        IntrusiveNode var2 = this.field_c.field_g.previous;
        if (param0 < 118) {
          return (IntrusiveNode) null;
        }
        if (var2 != this.field_c.field_g) {
          this.field_d = var2.previous;
          return var2;
        }
        this.field_d = null;
        return null;
    }

    final IntrusiveNode a(byte param0) {
        if (param0 != 0) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_d;
        if (this.field_c.field_g != var2) {
          this.field_d = var2.next;
          return var2;
        }
        this.field_d = null;
        return null;
    }

    final IntrusiveNode b(byte param0) {
        int var3 = 30 / ((param0 + 47) / 53);
        IntrusiveNode var2 = this.field_c.field_g.next;
        if (var2 != this.field_c.field_g) {
          this.field_d = var2.next;
          return var2;
        }
        this.field_d = null;
        return null;
    }

    final static boolean b(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = BachelorFridge.field_y;
        if (param0 != 7) {
          return true;
        }
        var1 = f.b((byte) 73);
        var3 = -pla.field_g + var1;
        if (30000L < var3) {
          pla.field_g = var1;
          qla.field_f = 0;
          return true;
        }
        var5 = 3000;
        if (qla.field_f >= 7) {
          var5 = 12000;
        } else {
          if (qla.field_f >= 5) {
            var5 = 9000;
          } else {
            if (qla.field_f >= 3) {
              var5 = 6000;
            }
          }
        }
        if ((long)var5 >= var3) {
          return false;
        }
        qla.field_f = qla.field_f + 1;
        pla.field_g = var1;
        return true;
    }

    public static void a(int param0) {
        if (param0 != 7) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final IntrusiveNode d(byte param0) {
        IntrusiveNode var2 = this.field_d;
        if (param0 != -124) {
          return (IntrusiveNode) null;
        }
        if (this.field_c.field_g == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.previous;
        return var2;
    }

    final IntrusiveNode a(IntrusiveNode param0, byte param1) {
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
          if (param1 != -86) {
            stackIn_2_0 = (IntrusiveNode) null;
            return stackIn_2_0;
          }
          if (param0 == null) {
            var3 = this.field_c.field_g.previous;
          } else {
            var3 = param0;
          }
          if (var3 != this.field_c.field_g) {
            this.field_d = var3.previous;
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          this.field_d = null;
          stackIn_8_0 = null;
          return (IntrusiveNode) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("rna.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        IntrusiveNode stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_c.field_g.next;
          } else {
            var3 = param1;
          }
          if (param0 != 6000) {
            stackIn_5_0 = (IntrusiveNode) null;
            return stackIn_5_0;
          }
          if (var3 == this.field_c.field_g) {
            this.field_d = null;
            stackIn_9_0 = null;
            return (IntrusiveNode) (stackIn_9_0);
          }
          this.field_d = var3.next;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("rna.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "rna.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Offer unrated rematch";
    }
}
