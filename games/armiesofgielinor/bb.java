/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    private at field_e;
    static boolean field_a;
    static String field_d;
    static int field_c;
    private tc field_f;
    static wk[] field_b;

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 50) {
            field_c = -105;
          }
          stackIn_3_0 = qk.field_e.a(param1, param0 ^ -72, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > -68) {
          return;
        }
        field_b = null;
        field_d = null;
    }

    final tc a(boolean param0, tc param1) {
        tc var3 = null;
        RuntimeException var3_ref = null;
        tc stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        tc stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (tc) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            var3 = this.field_e.field_d.field_j;
          } else {
            var3 = param1;
          }
          if (this.field_e.field_d == var3) {
            this.field_f = null;
            stackIn_9_0 = null;
            return (tc) (stackIn_9_0);
          }
          this.field_f = var3.field_j;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("bb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final tc b(int param0) {
        if (param0 != 50) {
          return (tc) null;
        }
        tc var2 = this.field_f;
        if (var2 == this.field_e.field_d) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.field_b;
        return var2;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (null == tn.field_Z) {
          if (null != ik.field_b &&
            ik.field_b.l(18585)) {
            ik.field_b = null;
            ot.g(76);
            return true;
          }
          if (param3 != 50) {
            field_b = (wk[]) null;
          }
        } else {
          if (tn.field_Z.c((byte) -121)) {
            ot.g(76);
            return true;
          }
          if (null == ik.field_b) {
            if (param3 != 50) {
              field_b = (wk[]) null;
            }
            if (jt.a((byte) -92)) {
              return true;
            }
            if (!vt.a(param1, param0, param2, (byte) 28)) {
              return false;
            }
            return true;
          }
          if (ik.field_b.l(18585)) {
            ik.field_b = null;
            ot.g(76);
            return true;
          }
          if (param3 == 50) {
            if (jt.a((byte) -92)) {
              return true;
            }
            if (!vt.a(param1, param0, param2, (byte) 28)) {
              return false;
            }
            return true;
          }
          field_b = (wk[]) null;
        }
        if (jt.a((byte) -92)) {
          return true;
        }
        if (vt.a(param1, param0, param2, (byte) 28)) {
          return true;
        }
        return false;
    }

    final tc b(byte param0) {
        if (param0 != -112) {
          return (tc) null;
        }
        tc var2 = this.field_f;
        if (var2 != this.field_e.field_d) {
          this.field_f = var2.field_j;
          return var2;
        }
        this.field_f = null;
        return null;
    }

    final tc a(int param0) {
        tc var2 = this.field_e.field_d.field_j;
        if (param0 != 50) {
          field_d = (String) null;
          if (var2 != this.field_e.field_d) {
            this.field_f = var2.field_j;
            return var2;
          }
          this.field_f = null;
          return null;
        }
        if (var2 != this.field_e.field_d) {
          this.field_f = var2.field_j;
          return var2;
        }
        this.field_f = null;
        return null;
    }

    final tc c(int param0) {
        tc var2 = this.field_e.field_d.field_b;
        if (var2 == this.field_e.field_d) {
          this.field_f = null;
          return null;
        }
        if (param0 == 50) {
          this.field_f = var2.field_b;
          return var2;
        }
        return (tc) null;
    }

    final tc a(tc param0, boolean param1) {
        tc var3 = null;
        RuntimeException var3_ref = null;
        tc stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        tc stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (tc) null;
            return stackIn_2_0;
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_e.field_d.field_b;
          }
          if (this.field_e.field_d == var3) {
            this.field_f = null;
            stackIn_9_0 = null;
            return (tc) (stackIn_9_0);
          }
          this.field_f = var3.field_b;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("bb.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    bb(at param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = true;
        field_d = "Your email address is used to identify this account";
        field_c = 50;
    }
}
