/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends fe {
    static int[] field_T;
    private tc field_S;
    static int[] field_N;
    static String field_O;
    static int field_V;
    static String field_P;
    private int field_U;
    static int field_X;
    int field_R;
    static String[] field_W;
    int field_Q;

    final int g(int param0) {
        if (param0 == 0) {
          return this.field_S.a((byte) 98);
        }
        ei var3 = (ei) null;
        this.a((ei) null, -110, false, -50, 44, -90, -14);
        return this.field_S.a((byte) 98);
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Pool.field_O;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param1 + (param6 - this.field_Q);
          var9 = -(2 * this.field_Q) + this.field_l;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (0 > var8_int) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_U / var9;
          if (param3 != 1) {
            if (param3 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_S.a((byte) 87) > var12; var12++) {
                var13 = -var8_int + this.field_S.a(var12, 2229);
                var13 = var13 * var13;
                if (var10 > var13) {
                  var11 = var12;
                  var10 = var13;
                }
              }
              if (var11 < 0) {
                return true;
              }
              this.field_S.c(var11, 40);
            }
          } else {
            this.field_S.a((byte) -2, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("va.AA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_P = null;
        field_W = null;
        field_N = null;
        field_O = null;
        if (param0 == 2) {
          field_T = null;
          return;
        }
        va.g((byte) 126);
        field_T = null;
    }

    final int f(int param0) {
        if (param0 != 0) {
          return 73;
        }
        return this.field_U;
    }

    final static String a(String param0, int param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        oq var6 = null;
        CharSequence var7 = null;
        try {
          var7 = (CharSequence) ((Object) param0);
          if (!gj.a(-25908, var7)) {
            stackIn_2_0 = p.field_g;
            return stackIn_2_0;
          }
          if (2 != th.field_a) {
            stackIn_6_0 = ka.field_n;
            return stackIn_6_0;
          }
          if (or.a((byte) 3, param0)) {
            stackIn_10_0 = fn.field_Qb;
            return stackIn_10_0;
          }
          if (lq.a(param0, -1)) {
            stackIn_13_0 = nr.a(new String[]{param0}, -1, tl.field_H);
            return stackIn_13_0;
          }
          if (nr.field_S >= 100 &&
            mp.field_V <= 0) {
            stackIn_18_0 = wk.field_V;
            return stackIn_18_0;
          }
          if (nr.field_S >= 200) {
            stackIn_22_0 = wk.field_V;
            return stackIn_22_0;
          }
          if (ia.a(param0, 24552)) {
            stackIn_26_0 = nr.a(new String[]{param0}, -1, jp.field_R);
            return stackIn_26_0;
          }
          var6 = ej.field_j;
          var6.b(false, param1);
          var6.field_v = var6.field_v + 1;
          var4 = var6.field_v;
          var6.a(0, false);
          var5 = -59 % ((-53 - param2) / 33);
          var6.a(-9946, param0);
          var6.b(var6.field_v - var4, true);
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("va.G(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean g(byte param0) {
        ho var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ho var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          var5 = (ho) (pj.field_H.c((byte) -88));
          var1 = var5;
          if (var1 == null) {
            return false;
          }
          var2 = 0;
          var3 = -7 % ((param0 + 62) / 57);
          while (var1.field_t > var2) {
            if (null != var5.field_n[var2] &&
              0 == var5.field_n[var2].field_f) {
              return false;
            }
            if (null != var5.field_p[var2] &&
              var5.field_p[var2].field_f == 0) {
              return false;
            }
            var2++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "va.F(" + param0 + ')');
        }
    }

    final static void a(boolean param0, vh param1, vh param2) {
        try {
          if (param0) {
            field_T = (int[]) null;
          }
          param2.field_eb = -param2.field_Db + param1.field_Db >> 1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "va.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(byte param0, int param1) {
        if (param0 > -22) {
          vh var4 = (vh) null;
          va.a(true, (vh) null, (vh) null);
          if (0 > param1) {
            return -1;
          }
          if (param1 < this.field_S.a((byte) 127)) {
            return this.field_S.a(param1, 2229);
          }
          return -1;
        }
        if (0 > param1) {
          return -1;
        }
        if (param1 < this.field_S.a((byte) 127)) {
          return this.field_S.a(param1, 2229);
        }
        return -1;
    }

    private va() throws Throwable {
        throw new Error();
    }

    static {
        field_P = "Friends can be added in multiplayer<nbsp>games";
        field_O = "Just play";
    }
}
