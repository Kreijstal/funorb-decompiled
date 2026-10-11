/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class at {
    static int[] field_c;
    static boolean field_a;
    static int[] field_b;
    tc field_d;
    private tc field_e;

    final void a(boolean param0, at param1) {
        try {
          this.a(this.field_d.field_b, param1, -41);
          if (!param0) {
            this.b(-29);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "at.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final tc a(int param0) {
        tc var2 = null;
        tc var2Lifetime1;
        if (param0 != 0) {
          field_a = false;
          var2 = this.field_d.field_b;
          if (var2 != this.field_d) {
            var2.d(param0 + 101);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_d.field_b;
        if (var2Lifetime1 != this.field_d) {
          var2Lifetime1.d(param0 + 101);
          return var2Lifetime1;
        }
        return null;
    }

    public static void c(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 250) {
          field_b = (int[]) null;
        }
    }

    final tc e(byte param0) {
        tc var2 = this.field_d.field_b;
        if (this.field_d == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_b;
        if (param0 > 86) {
          return var2;
        }
        field_c = (int[]) null;
        return var2;
    }

    final tc a(boolean param0, tc param1) {
        tc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        tc stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_d.field_b;
          }
          if (this.field_d == var3) {
            this.field_e = null;
            stackIn_5_0 = null;
            return (tc) (stackIn_5_0);
          }
          if (!param0) {
            this.field_e = (tc) null;
          }
          this.field_e = var3.field_b;
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("at.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final tc d(byte param0) {
        tc var2 = null;
        tc var2Lifetime1;
        if (param0 >= -69) {
          field_c = (int[]) null;
          var2 = this.field_d.field_j;
          if (var2 != this.field_d) {
            this.field_e = var2.field_j;
            return var2;
          }
          this.field_e = null;
          return null;
        }
        var2Lifetime1 = this.field_d.field_j;
        if (var2Lifetime1 != this.field_d) {
          this.field_e = var2Lifetime1.field_j;
          return var2Lifetime1;
        }
        this.field_e = null;
        return null;
    }

    final tc c(byte param0) {
        tc var2 = this.field_d.field_j;
        if (param0 > -120) {
          this.a(true);
          if (this.field_d != var2) {
            var2.d(127);
            return var2;
          }
          return null;
        }
        if (this.field_d != var2) {
          var2.d(127);
          return var2;
        }
        return null;
    }

    final void a(int param0, tc param1) {
        RuntimeException var3 = null;
        at var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_j != null) {
            param1.d(66);
          }
          param1.field_j = this.field_d;
          param1.field_b = this.field_d.field_b;
          param1.field_j.field_b = param1;
          param1.field_b.field_j = param1;
          if (param0 == 750) {
            return;
          }
          var4 = (at) null;
          this.a((tc) null, (at) null, -6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("at.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final tc b(byte param0) {
        tc var2 = this.field_e;
        int var3 = -44 % ((param0 + 5) / 34);
        if (var2 == this.field_d) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_j;
        return var2;
    }

    final tc a(byte param0) {
        tc var2 = this.field_e;
        if (this.field_d == var2) {
          this.field_e = null;
          return null;
        }
        if (param0 == 123) {
          this.field_e = var2.field_b;
          return var2;
        }
        field_a = false;
        this.field_e = var2.field_b;
        return var2;
    }

    final void b(int param0) {
        tc var2 = null;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        while (true) {
          var2 = this.field_d.field_b;
          if (this.field_d == var2) {
            break;
          }
          var2.d(-116);
        }
        this.field_e = null;
        if (param0 > 74) {
          return;
        }
        tc var4 = (tc) null;
        this.a((byte) -117, (tc) null);
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return this.field_d == this.field_d.field_b ? true : false;
        }
        this.field_e = (tc) null;
        return this.field_d == this.field_d.field_b ? true : false;
    }

    private final void a(tc param0, at param1, int param2) {
        tc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = this.field_d.field_j;
          this.field_d.field_j = param0.field_j;
          var5 = 91 % ((61 - param2) / 58);
          param0.field_j.field_b = this.field_d;
          if (param0 == this.field_d) {
            return;
          }
          param0.field_j = param1.field_d.field_j;
          param0.field_j.field_b = param0;
          param1.field_d.field_j = var4;
          var4.field_b = param1.field_d;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("at.O(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final int b(boolean param0) {
        int var2 = 0;
        tc var3 = null;
        tc var3Lifetime1;
        int var2Lifetime1;
        if (!param0) {
          var2 = 0;
          var3 = this.field_d.field_b;
          while (var3 != this.field_d) {
            var2++;
            var3 = var3.field_b;
          }
          return var2;
        }
        this.a(-77);
        var2Lifetime1 = 0;
        var3Lifetime1 = this.field_d.field_b;
        while (var3Lifetime1 != this.field_d) {
          var2Lifetime1++;
          var3Lifetime1 = var3Lifetime1.field_b;
        }
        return var2Lifetime1;
    }

    final void a(byte param0, tc param1) {
        try {
          if (param1.field_j != null) {
            param1.d(param0 + 181);
          }
          param1.field_j = this.field_d.field_j;
          param1.field_b = this.field_d;
          if (param0 != -119) {
            field_a = true;
          }
          param1.field_j.field_b = param1;
          param1.field_b.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "at.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public at() {
        this.field_d = new tc();
        this.field_d.field_b = this.field_d;
        this.field_d.field_j = this.field_d;
    }

    static {
        field_c = new int[]{50, 100, 250, 500, 750, 1000, 2500, 5000, 7500, 10000};
    }
}
