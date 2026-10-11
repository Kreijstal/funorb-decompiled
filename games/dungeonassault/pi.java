/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    private boolean field_a;
    static String field_g;
    static String field_i;
    private int field_h;
    cn field_d;
    private int field_k;
    static cn field_b;
    private int field_c;
    private int field_j;
    cn[] field_e;
    private int field_f;

    final void a(int param0, lm param1, int param2, int param3, an param4) {
        se stackIn_18_0;
        String stackIn_18_1;
        int stackIn_18_2;
        int stackIn_18_3;
        int stackIn_19_4 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        pi var8 = null;
        try {
          sn.a(param0 ^ 116, param1.field_s, this.field_e, param1.field_q + param3, param1.field_v + param2, param1.field_x);
          if (this.field_d != null) {
            var6_int = param3 + (param1.field_q + this.field_j);
            var7 = this.field_k + (param2 + param1.field_v);
            if (1 == param4.field_f) {
              var6_int = var6_int + (param1.field_x - this.field_d.field_E) / 2;
            }
            if (param4.field_f == 2) {
              var6_int = var6_int + (param1.field_x - this.field_d.field_E);
            }
            if (1 == param4.field_d) {
              var7 = var7 + (-this.field_d.field_G + param1.field_s) / 2;
            }
            if (param4.field_d == 2) {
              var7 = var7 + (param1.field_s - this.field_d.field_G);
            }
            this.field_d.h(var6_int, var7);
          }
          var6 = param4.b(param1, -444136767);
          if (var6 != null &&
            null != param4.field_u &&
            this.field_f >= 0) {
            stackIn_18_0 = param4.field_u;
            stackIn_18_1 = var6;
            stackIn_18_2 = param4.field_l + param1.field_q;
            stackIn_18_3 = param3;
            if (-2147483648 != this.field_j) {
              stackIn_19_4 = this.field_j;
            } else {
              stackIn_19_4 = 0;
            }
            stackIn_21_2 = stackIn_18_2 + (stackIn_18_3 + stackIn_19_4);
            if (this.field_k != -2147483648) {
              stackIn_22_3 = this.field_k;
            } else {
              stackIn_22_3 = 0;
            }
            stackIn_24_3 = stackIn_22_3 + (param4.field_e + (param1.field_v + param2));
            stackIn_24_4 = param1.field_x + (-param4.field_l - param4.field_v);
            stackIn_24_5 = -param4.field_i + param1.field_s - param4.field_e;
            stackIn_24_6 = this.field_f;
            stackIn_24_7 = this.field_h;
            if (-2147483648 == this.field_c) {
              stackIn_25_8 = 256;
            } else {
              stackIn_25_8 = this.field_c;
            }
            ((se) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_25_8, param4.field_f, param4.field_d, param4.field_a);
          }
          if (param0 != 0) {
            var8 = (pi) null;
            this.a(false, (pi) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("pi.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static boolean c(int param0) {
        if (param0 != -555) {
          pi.a(49);
        }
        return ql.field_f == wd.field_d ? true : false;
    }

    final pi a(int param0, int param1) {
        if (param0 != -7695) {
          an var4 = (an) null;
          this.a((lm) null, (byte) 80, (pi) null, -58, (an) null, -78);
        }
        this.field_f = param1;
        return this;
    }

    final pi d(int param0, int param1) {
        this.field_h = param0;
        if (param1 != 216) {
          pi var4 = (pi) null;
          this.a(true, (pi) null);
        }
        return this;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          tg.field_f[param2] = param0;
          tg.field_b[param2] = param1;
          tg.field_j[param2] = param4;
          tg.field_h[param2] = param5;
          tg.field_d[param2] = param3;
          if (param6 != 0) {
            pi.a(-9);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pi.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final pi a(cn[] param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            pi.a((byte) 123);
          }
          this.field_e = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pi.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static vk a(byte param0) {
        if (sp.field_e == ol.field_i) {
          throw new IllegalStateException();
        }
        if (param0 != 80) {
          field_g = (String) null;
        }
        if (ol.field_i != dh.field_b) {
          return null;
        }
        ol.field_i = sp.field_e;
        return mh.field_b;
    }

    final void a(boolean param0, pi param1) {
        param1.field_e = this.field_e;
        param1.field_d = this.field_d;
        if (!param0) {
          return;
        }
        try {
          param1.field_a = this.field_a;
          param1.field_k = this.field_k;
          param1.field_f = this.field_f;
          param1.field_h = this.field_h;
          param1.field_c = this.field_c;
          param1.field_j = this.field_j;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pi.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, int[] param2, int param3, se param4, int param5) {
        tf var6 = new tf(param4, param1, param2);
        if (param0 != 0) {
          return;
        }
        try {
          var6.b(-param4.field_H + param5, param0 + 32, param3);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pi.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final pi c(int param0, int param1) {
        this.field_k = param0;
        if (param1 != -33) {
          pi var4 = (pi) null;
          this.a(true, (pi) null);
        }
        return this;
    }

    final static q a(int param0, q param1, int[] param2) {
        q var3 = null;
        RuntimeException var3_ref = null;
        q stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            pi.a(-117);
          }
          var3 = new q(0, 0, 0);
          var3.field_d = param1.field_d;
          var3.field_e = param1.field_e;
          var3.field_i = param2;
          var3.field_a = param1.field_a;
          var3.field_g = param1.field_g;
          var3.field_h = param1.field_h;
          var3.field_j = param1.field_j;
          var3.field_b = param1.field_b;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("pi.G(").append(param0).append(',');
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
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void b(int param0) {
        this.field_d = null;
        this.field_k = param0;
        this.field_e = null;
        this.field_f = 0;
        this.field_h = -1;
        this.field_j = 0;
        this.field_c = 256;
    }

    final pi b(int param0, int param1) {
        this.field_j = param0;
        int var3 = 107 % ((param1 + 77) / 34);
        return this;
    }

    final static byte[] a(String param0, int param1, String param2, String param3, int param4, int param5, nh param6) {
        Object stackIn_3_0 = null;
        byte[] stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int[] var8 = null;
        byte[][] var8_array = null;
        int var9 = 0;
        int var10_int = 0;
        byte[][] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        String var12_ref_String = null;
        int var13 = 0;
        int[] var14 = null;
        byte[] var15 = null;
        int[] var16 = null;
        String var17 = null;
        byte[][] var18 = null;
        byte[][] var19 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[][] var23 = null;
        byte[][] var24 = null;
        byte[] var26 = null;
        byte[] var28 = null;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var11_intLifetime1;
        int var11_intLifetime2;
        var13 = DungeonAssault.field_K;
        try {
          if (!param6.a(false, param3)) {
            stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          var15 = param6.a(param3 + "/" + param0, param2, (byte) -115);
          var28 = var15;
          if (var15 == null) {
            return null;
          }
          oi.field_J.field_o = 0;
          oi.field_J.a(6, 255);
          oi.field_J.a(param1 ^ 6, 216);
          oi.field_J.a(6, 255);
          oi.field_J.a(6, 224);
          oi.field_J.i(16, -121);
          var22 = he.field_o;
          var16 = var22;
          var14 = var16;
          var8 = var14;
          for (var9 = 0; var9 < var22.length; var9++) {
            var10_int = var22[var9];
            oi.field_J.a(6, var10_int);
          }
          oi.field_J.i(258, param1 ^ -91);
          oi.field_J.a(6, 0);
          oi.field_J.i(1, -110);
          oi.field_J.i(1, -109);
          oi.field_J.a(6, 0);
          oi.field_J.a(6, 0);
          oi.field_J.a(6, 255);
          oi.field_J.a(6, 219);
          var23 = new byte[4][];
          var18 = var23;
          var8_array = var18;
          var9Lifetime1 = 2;
          for (var10_intLifetime1 = 0; 4 > var10_intLifetime1; var10_intLifetime1++) {
            var17 = "qt" + var10_intLifetime1;
            if (param6.b(var17, param3, (byte) -82)) {
              var8_array[var10_intLifetime1] = param6.a(param3, var17, (byte) -107);
              var9Lifetime1 = var9Lifetime1 + var23[var10_intLifetime1].length;
            }
          }
          oi.field_J.i(var9Lifetime1, param1 - 108);
          for (var10_intLifetime2 = 0; var10_intLifetime2 < 4; var10_intLifetime2++) {
            if (var23[var10_intLifetime2] != null) {
              oi.field_J.a(var23[var10_intLifetime2], 1, var23[var10_intLifetime2].length, 0);
            }
          }
          oi.field_J.a(6, 255);
          oi.field_J.a(6, 192);
          oi.field_J.i(17, -88);
          oi.field_J.a(6, 8);
          oi.field_J.i(param4, param1 ^ -113);
          oi.field_J.i(param5, -99);
          oi.field_J.a(6, 3);
          oi.field_J.a(6, 1);
          oi.field_J.a(6, 34);
          oi.field_J.a(param1 ^ 6, 0);
          oi.field_J.a(6, 2);
          oi.field_J.a(6, 17);
          oi.field_J.a(6, 1);
          oi.field_J.a(param1 ^ 6, 3);
          oi.field_J.a(6, 17);
          oi.field_J.a(6, 1);
          oi.field_J.a(param1 + 6, 255);
          oi.field_J.a(6, 196);
          var24 = new byte[32][];
          var19 = var24;
          var10 = var19;
          var9Lifetime2 = 2;
          for (var11_int = 0; var11_int < 32; var11_int++) {
            var12_ref_String = "ht" + var11_int;
            if (param6.b(var12_ref_String, param3, (byte) -82)) {
              var10[var11_int] = param6.a(param3, var12_ref_String, (byte) -125);
              var9Lifetime2 = var9Lifetime2 + var24[var11_int].length;
            }
          }
          oi.field_J.i(var9Lifetime2, -100);
          for (var11_intLifetime1 = 0; var11_intLifetime1 < 32; var11_intLifetime1++) {
            if (var24[var11_intLifetime1] != null) {
              oi.field_J.a(var24[var11_intLifetime1], param1 ^ 1, var24[var11_intLifetime1].length, 0);
            }
          }
          oi.field_J.a(6, 255);
          oi.field_J.a(6, 218);
          oi.field_J.i(12, -128);
          oi.field_J.a(6, 3);
          oi.field_J.a(6, 1);
          oi.field_J.a(6, 0);
          oi.field_J.a(6, 2);
          oi.field_J.a(6, 17);
          oi.field_J.a(6, 3);
          oi.field_J.a(6, 17);
          oi.field_J.a(6, 0);
          oi.field_J.a(param1 ^ 6, 63);
          oi.field_J.a(param1 + 6, 0);
          for (var11_intLifetime2 = param1; var11_intLifetime2 < var28.length; var11_intLifetime2++) {
            var12 = var28[var11_intLifetime2];
            oi.field_J.a(6, var12);
            if (255 == (255 & var12)) {
              oi.field_J.a(6, 0);
            }
          }
          oi.field_J.a(6, 255);
          oi.field_J.a(6, 217);
          var26 = new byte[oi.field_J.field_o];
          var21 = var26;
          var11 = var21;
          cj.a(oi.field_J.field_m, 0, var26, 0, oi.field_J.field_o);
          stackIn_40_0 = var11;
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_43_0 = var7;
          stackIn_43_1 = new StringBuilder().append("pi.F(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final void a(lm param0, byte param1, pi param2, int param3, an param4, int param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int[] var8 = null;
        try {
          if (this.field_a) {
            param2.a(0, param0, param3, param5, param4);
            param2.b(0);
          }
          if (this.field_e != null) {
            param2.field_e = this.field_e;
          }
          if (this.field_c != -2147483648) {
            param2.field_c = this.field_c;
          }
          if (this.field_j != -2147483648) {
            param2.field_j = this.field_j;
          }
          if (this.field_h >= -1) {
            param2.field_h = this.field_h;
          }
          if (param1 != 100) {
            var8 = (int[]) null;
            pi.a(-106, (q) null, (int[]) null);
          }
          if (this.field_k != -2147483648) {
            param2.field_k = this.field_k;
          }
          if (this.field_f >= -1) {
            param2.field_f = this.field_f;
          }
          if (null != this.field_d) {
            param2.field_d = this.field_d;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("pi.J(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_i = null;
        if (param0 != 11877) {
          field_i = (String) null;
        }
    }

    final pi a(byte param0, boolean param1) {
        this.field_a = param1 ? true : false;
        if (param0 >= -34) {
          this.a(10, 73);
        }
        return this;
    }

    pi() {
        this.field_a = false;
        this.field_h = -2;
        this.field_d = null;
        this.field_j = -2147483648;
        this.field_c = -2147483648;
        this.field_k = -2147483648;
        this.field_e = null;
        this.field_f = -2;
    }

    static {
        field_g = "Pick an adjacent room, or select another party leader.";
        field_i = "SELECT RAIDERS";
    }
}
