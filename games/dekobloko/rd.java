/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    private bh field_d;
    private vj field_b;
    static boolean[] field_c;
    static w field_e;
    static w field_a;

    final static w b(int param0) {
        if (param0 > -26) {
          rd.a((byte) -21, 73, 124);
          return df.i(119);
        }
        return df.i(119);
    }

    final bh a(bh param0, boolean param1) {
        bh var3 = null;
        RuntimeException var3_ref = null;
        bh stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        bh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = (bh) null;
            return stackIn_2_0;
          }
          if (param0 == null) {
            var3 = this.field_b.field_c.field_b;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_b.field_c) {
            this.field_d = null;
            stackIn_9_0 = null;
            return (bh) (stackIn_9_0);
          }
          this.field_d = var3.field_b;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("rd.J(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -119) {
          field_c = (boolean[]) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    final bh a(int param0) {
        bh var2 = this.field_d;
        if (param0 >= -40) {
          field_c = (boolean[]) null;
          if (this.field_b.field_c == var2) {
            this.field_d = null;
            return null;
          }
          this.field_d = var2.field_b;
          return var2;
        }
        if (this.field_b.field_c == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.field_b;
        return var2;
    }

    final static int a(String param0, int param1, String param2, String param3, int param4, int param5, boolean param6) {
        jg var7 = null;
        RuntimeException var7_ref = null;
        jg var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new jg(param3);
          if (param4 != 0) {
            stackIn_2_0 = -75;
            return stackIn_2_0;
          }
          var8 = new jg(param2);
          stackIn_4_0 = qb.a(param6, param1, var7, -109, param5, var8, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("rd.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final bh a(boolean param0) {
        bh var2 = this.field_b.field_c.field_a;
        if (!param0) {
          String var3 = (String) null;
          rd.a((String) null, 14, (String) null, (String) null, -52, 96, false);
          if (var2 == this.field_b.field_c) {
            this.field_d = null;
            return null;
          }
          this.field_d = var2.field_a;
          return var2;
        }
        if (var2 == this.field_b.field_c) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.field_a;
        return var2;
    }

    final bh a(bh param0, byte param1) {
        bh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        bh stackIn_8_0 = null;
        bh stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_b.field_c.field_a;
          } else {
            var3 = param0;
          }
          if (this.field_b.field_c == var3) {
            this.field_d = null;
            stackIn_5_0 = null;
            return (bh) (stackIn_5_0);
          }
          this.field_d = var3.field_a;
          if (param1 == -88) {
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          stackIn_8_0 = (bh) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("rd.K(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    rd(vj param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final bh d(int param0) {
        bh var2 = this.field_d;
        if (var2 == this.field_b.field_c) {
          this.field_d = null;
          return null;
        }
        if (param0 == 2078965185) {
          this.field_d = var2.field_a;
          return var2;
        }
        rd.b(-96);
        this.field_d = var2.field_a;
        return var2;
    }

    final bh a(byte param0) {
        bh var2 = this.field_b.field_c.field_b;
        if (param0 != 71) {
          String var3 = (String) null;
          rd.a((String) null, -87, (String) null, (String) null, -5, -114, false);
          if (var2 != this.field_b.field_c) {
            this.field_d = var2.field_b;
            return var2;
          }
          this.field_d = null;
          return null;
        }
        if (var2 != this.field_b.field_c) {
          this.field_d = var2.field_b;
          return var2;
        }
        this.field_d = null;
        return null;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            rd.c(-42);
          }
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (ab.a(120, var3) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("rd.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          if (param0 != 16) {
            rd.b(15);
          }
          var3_int = 0;
          while (0 < param1) {
            var3_int = var3_int << 1 | param2 & 1;
            param2 = param2 >>> 1;
            param1--;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "rd.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -27454) {
            stackIn_4_0 = ug.a(param0, false, 100);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rd.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = client.field_A ? 1 : 0;
        try {
          var5 = a.field_r;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1_ref), "rd.M(" + param0 + ')');
        }
    }

    static {
    }
}
