/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static String field_a;
    private ah field_c;
    private ah field_b;
    private dj field_g;
    static int field_d;
    static boolean field_e;
    private dj field_f;

    private final wf a(int param0, int[] param1, String param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        wf stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_b.a(param0 - 1, param3);
          if (var5_int < 0) {
            return null;
          }
          var6 = this.field_b.a(var5_int, false, param2);
          if (param0 <= var6) {
            stackIn_7_0 = this.a((byte) 118, var6, param1, var5_int);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (wf) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fa.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(ah param0, boolean param1, ah param2, ah param3, byte param4) {
        try {
          oa.field_y = il.a("", param4 ^ 14822);
          oa.field_y.a(false, 8);
          ua.a(param0, param3, param2, -97);
          qe.a(-86);
          pi.field_a = fk.field_Q;
          ma.field_d = fk.field_Q;
          if (param4 != 91) {
            fa.b(-90);
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "fa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final wf a(String param0, byte param1, String param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ah var7 = null;
        Object stackIn_2_0 = null;
        wf stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_c.a(-1, param2);
          if (var5_int < 0) {
            stackIn_2_0 = null;
            return (wf) (stackIn_2_0);
          }
          var6 = this.field_c.a(var5_int, false, param0);
          if (var6 < 0) {
            return null;
          }
          if (param1 <= 47) {
            var7 = (ah) null;
            fa.a((ah) null, false, (ah) null, (ah) null, (byte) 70);
          }
          stackIn_9_0 = this.a(-834608944, var6, param3, var5_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fa.H(");
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
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final wf a(String param0, String param1, byte param2) {
        RuntimeException var4 = null;
        wf stackIn_2_0 = null;
        wf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 1) {
            stackIn_4_0 = this.a(0, (int[]) null, param0, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (wf) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("fa.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2 = param0 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        if (param1 == -24338) {
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return param0 & ~var2;
        }
        return 42;
    }

    final static hl a(boolean param0) {
        if (!param0) {
          byte[] var2 = (byte[]) null;
          fa.a(-120, (byte[]) null);
          return ek.a(true);
        }
        return ek.a(true);
    }

    final static ig a(int param0, byte[] param1) {
        ig var2 = null;
        RuntimeException var2_ref = null;
        ig stackIn_5_0 = null;
        ig stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param0 != -334) {
            stackIn_5_0 = (ig) null;
            return stackIn_5_0;
          }
          var2 = new ig(param1, qa.field_x, i.field_t, je.field_h, sn.field_e, ti.field_c, ga.field_a);
          an.b(-81);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("fa.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final wf a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        wf var8 = null;
        ag var9 = null;
        wf stackIn_2_0 = null;
        wf stackIn_6_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        wf stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        wf var8Lifetime1;
        try {
          if (param0 != -834608944) {
            stackIn_2_0 = (wf) null;
            return stackIn_2_0;
          }
          var5_int = param1 ^ (param3 >>> 12 | 65523 & param3 << 4);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (wf) (this.field_f.a(var6, (byte) -43));
          if (var8 != null) {
            stackIn_6_0 = var8;
            return stackIn_6_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            stackIn_10_0 = null;
            return (wf) (stackIn_10_0);
          }
          var9 = (ag) (this.field_g.a(var6, (byte) -43));
          if (var9 == null) {
            var9 = ag.a(this.field_c, param3, param1);
            if (var9 == null) {
              stackIn_14_0 = null;
              return (wf) (stackIn_14_0);
            }
            this.field_g.a(var6, param0 ^ 834608919, var9);
          }
          var8Lifetime1 = var9.a(param2);
          if (var8Lifetime1 == null) {
            stackIn_18_0 = null;
            return (wf) (stackIn_18_0);
          }
          var9.b(false);
          this.field_f.a(var6, -112, var8Lifetime1);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("fa.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    private final wf a(byte param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        wf var8 = null;
        ge var9 = null;
        String var10 = null;
        wf var11 = null;
        wf stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        wf stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        wf var8Lifetime1;
        try {
          if (param0 <= 104) {
            var10 = (String) null;
            this.a(85, (String) null, (String) null);
          }
          var5_int = ((param3 & 1342181375) << 4 | param3 >>> 12) ^ param1;
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (wf) (this.field_f.a(var6, (byte) -43));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            stackIn_9_0 = null;
            return (wf) (stackIn_9_0);
          }
          var9 = ge.a(this.field_b, param3, param1);
          if (var9 == null) {
            return null;
          }
          var11 = var9.b();
          var8Lifetime1 = var11;
          this.field_f.a(var6, -58, var8Lifetime1);
          if (param2 != null) {
            param2[0] = param2[0] - var11.field_s.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("fa.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final wf a(int param0, String param1, String param2) {
        RuntimeException var4 = null;
        String var5 = null;
        wf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -121) {
            var5 = (String) null;
            this.a(29, (String) null, (String) null);
          }
          stackIn_3_0 = this.a(param2, (byte) 56, param1, (int[]) null);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -2) {
          field_d = -124;
        }
    }

    final wf a(byte param0, int param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        wf stackIn_2_0 = null;
        wf stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b.a(-1) == 1) {
            stackIn_2_0 = this.a((byte) 117, param1, param2, 0);
            return stackIn_2_0;
          }
          var4_int = -40 % ((-15 - param0) / 54);
          if (this.field_b.b(-23126, param1) != 1) {
            throw new RuntimeException();
          }
          stackIn_5_0 = this.a((byte) 127, 0, param2, param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fa.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(int param0) {
        if (param0 > -6) {
          fa.a(-28);
          return id.field_x;
        }
        return id.field_x;
    }

    final wf a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        wf stackIn_2_0 = null;
        wf stackIn_5_0 = null;
        wf stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_c.a(-1) == 1) {
            stackIn_2_0 = this.a(-834608944, param1, param0, 0);
            return stackIn_2_0;
          }
          if (this.field_c.b(-23126, param1) == 1) {
            stackIn_5_0 = this.a(-834608944, 0, param0, param1);
            return stackIn_5_0;
          }
          if (param2 >= 3) {
            throw new RuntimeException();
          }
          stackIn_8_0 = (wf) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("fa.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    fa(ah param0, ah param1) {
        this.field_g = new dj(256);
        this.field_f = new dj(256);
        try {
          this.field_c = param1;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Options";
    }
}
