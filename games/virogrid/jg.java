/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static il field_i;
    static boolean[] field_b;
    static String field_c;
    private ln field_h;
    static String[] field_g;
    private eh field_d;
    static int field_e;
    private eh field_f;
    private ln field_a;

    final ml a(byte param0, String param1, String param2) {
        ml discarded$1 = null;
        RuntimeException var4 = null;
        String var5 = null;
        ml stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 76) {
            var5 = (String) null;
            discarded$1 = this.a((int[]) null, (String) null, (String) null, (byte) -47);
          }
          stackIn_3_0 = this.a((int[]) null, param1, param2, (byte) -123);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jg.C(").append(param0).append(',');
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
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 28275) {
          return;
        }
        field_g = null;
        field_b = null;
        field_c = null;
        field_i = null;
    }

    private final ml a(int[] param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ml var8 = null;
        vn var9 = null;
        int[] var10 = null;
        ml var11 = null;
        ml stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        ml stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml var8Lifetime1;
        try {
          var5_int = (param3 >>> 12 | (param3 & -2147479553) << 4) ^ param2;
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (ml) (this.field_a.a(var6, -14905));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            return null;
          }
          var9 = vn.a(this.field_f, param3, param2);
          if (var9 == null) {
            stackIn_9_0 = null;
            return (ml) (stackIn_9_0);
          }
          if (param1) {
            var10 = (int[]) null;
            this.a((int[]) null, 119, 9);
          }
          var11 = var9.b();
          var8Lifetime1 = var11;
          this.field_a.a(var8Lifetime1, (byte) 2, var6);
          if (param0 != null) {
            param0[0] = param0[0] - var11.field_k.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("jg.G(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 == 461050508) {
          vi.field_g = di.c((byte) -6);
          tm.field_l = new je();
          vc.a(true, true, param0 - 461066621);
          return;
        }
        field_i = (il) null;
        vi.field_g = di.c((byte) -6);
        tm.field_l = new je();
        vc.a(true, true, param0 - 461066621);
    }

    final ml a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        ml stackIn_2_0 = null;
        ml stackIn_5_0 = null;
        ml stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            stackIn_2_0 = (ml) null;
            return stackIn_2_0;
          }
          if (this.field_f.e(60) == 1) {
            stackIn_5_0 = this.a(param0, false, param1, 0);
            return stackIn_5_0;
          }
          if (1 != this.field_f.d((byte) 70, param1)) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.a(param0, false, 0, param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("jg.I(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final ml a(int[] param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        ml stackIn_4_0 = null;
        ml stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            this.field_f = (eh) null;
          }
          if (this.field_d.e(46) == 1) {
            stackIn_4_0 = this.a(param0, (byte) 90, param1, 0);
            return stackIn_4_0;
          }
          if (this.field_d.d((byte) 50, param1) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(param0, (byte) 90, 0, param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("jg.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String[] args, String[] param1, String[][] param2, byte[] param3, eh param4, mg[][] param5, String[][] param6, byte[] param7, int param8, int param9, boolean param10, rm[] param11, int param12, eh param13, int[] param14, eh param15, byte param16, int[] param17, String[] param18, mg[][] param19) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var20_int = 0;
        RuntimeException var20 = null;
        try {
          jd.a(param15, (byte) 99, param17, param4, param11);
          oa.a((byte) -117, param4);
          tm.a(param19, 126, param12, param9, param14, param4, param5, param7, param2, param8, param6, param1, param18, param3, args);
          var20_int = -124 % ((param16 + 36) / 51);
          vj.a(param13, param4, param10, true);
          ak.c(-7597);
          ld.a(0);
          el.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_4_0 = var20;
          stackIn_4_1 = new StringBuilder().append("jg.E(");
          if (args == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
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
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param7 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param14 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param15 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (param18 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param19 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    private final ml a(int[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ml var8 = null;
        gj var9 = null;
        ml stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        ml stackIn_9_0 = null;
        ml stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml var8Lifetime1;
        try {
          var5_int = param2 ^ (param3 >>> 12 | (-536866817 & param3) << 4);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (ml) (this.field_a.a(var6, -14905));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_6_0 = null;
            return (ml) (stackIn_6_0);
          }
          if (param1 != 90) {
            stackIn_9_0 = (ml) null;
            return stackIn_9_0;
          }
          var9 = (gj) (this.field_h.a(var6, -14905));
          if (var9 == null) {
            var9 = gj.a(this.field_d, param3, param2);
            if (var9 == null) {
              return null;
            }
            this.field_h.a(var9, (byte) 21, var6);
          }
          var8Lifetime1 = var9.a(param0);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.a(false);
          this.field_a.a(var8Lifetime1, (byte) 104, var6);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("jg.F(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final ml a(String param0, int param1, String param2) {
        RuntimeException var4 = null;
        ml stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 595749988) {
            jg.b(-106);
          }
          stackIn_3_0 = this.a(false, param0, (int[]) null, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jg.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final ml a(int[] param0, String param1, String param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ml stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        ml stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_f.a(-1, param1);
          if (param3 > -63) {
            stackIn_2_0 = (ml) null;
            return stackIn_2_0;
          }
          if (0 > var5_int) {
            return null;
          }
          var6 = this.field_f.a(-114, var5_int, param2);
          if (var6 >= 0) {
            stackIn_10_0 = this.a(param0, false, var6, var5_int);
            return stackIn_10_0;
          }
          stackIn_8_0 = null;
          return (ml) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("jg.B(");
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
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    jg(eh param0, eh param1) {
        this.field_h = new ln(256);
        this.field_a = new ln(256);
        try {
          this.field_d = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final ml a(boolean param0, String param1, int[] param2, String param3) {
        ml discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_7_0 = null;
        ml stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var7 = (String) null;
            discarded$1 = this.a(false, (String) null, (int[]) null, (String) null);
          }
          var5_int = this.field_d.a(-1, param1);
          if (var5_int < 0) {
            return null;
          }
          var6 = this.field_d.a(-108, var5_int, param3);
          if (var6 >= 0) {
            stackIn_9_0 = this.a(param2, (byte) 90, var6, var5_int);
            return stackIn_9_0;
          }
          stackIn_7_0 = null;
          return (ml) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("jg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
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
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_g = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_c = "Honour";
    }
}
