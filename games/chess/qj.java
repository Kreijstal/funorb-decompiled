/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static int field_f;
    private o field_c;
    private jc field_b;
    static String field_g;
    static ci field_e;
    static String field_a;
    static boolean field_d;
    static String field_h;

    public static void a(int param0) {
        int var1 = -79 / ((-15 - param0) / 45);
        field_a = null;
        field_g = null;
        field_h = null;
        field_e = null;
    }

    final o a(boolean param0, o param1) {
        o var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        o stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_b.field_a.field_h;
          }
          if (var3 == this.field_b.field_a) {
            this.field_c = null;
            stackIn_6_0 = null;
            return (o) (stackIn_6_0);
          }
          this.field_c = var3.field_h;
          if (param0) {
            qj.a(89);
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("qj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final o a(o param0, byte param1) {
        o var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        o stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -115 % ((27 - param1) / 56);
          if (param0 == null) {
            var3 = this.field_b.field_a.field_c;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_b.field_a) {
            this.field_c = null;
            stackIn_6_0 = null;
            return (o) (stackIn_6_0);
          }
          this.field_c = var3.field_c;
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("qj.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final o b(byte param0) {
        o var2 = this.field_c;
        if (var2 == this.field_b.field_a) {
          this.field_c = null;
          return null;
        }
        if (param0 <= -52) {
          this.field_c = var2.field_c;
          return var2;
        }
        qj.a(92);
        this.field_c = var2.field_c;
        return var2;
    }

    qj(jc param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "qj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static km[] a(int param0, int param1, byte param2, um param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 108) {
            field_e = (ci) null;
          }
          if (tj.a(param1, param0, param3, (byte) 83)) {
            return af.a((byte) -109);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("qj.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final o c(int param0) {
        o var2 = this.field_b.field_a.field_h;
        if (param0 != -20229) {
          return (o) null;
        }
        if (this.field_b.field_a == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_h;
        return var2;
    }

    final o b(int param0) {
        o var2 = this.field_c;
        if (this.field_b.field_a == var2) {
          this.field_c = null;
          return null;
        }
        if (param0 == 8922) {
          this.field_c = var2.field_h;
          return var2;
        }
        return (o) null;
    }

    final o a(byte param0) {
        o var2 = this.field_b.field_a.field_c;
        if (var2 != this.field_b.field_a) {
          this.field_c = var2.field_c;
          int var3 = -4 / ((66 - param0) / 34);
          return var2;
        }
        this.field_c = null;
        return null;
    }

    static {
        field_f = 1;
        field_g = "Confirm Email:";
        field_a = "Invalid name";
        field_d = false;
        field_h = "Players";
    }
}
