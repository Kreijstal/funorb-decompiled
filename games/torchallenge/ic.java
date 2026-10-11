/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ic extends ee implements gk {
    static ka[] field_D;
    static int[][] field_B;
    ee field_A;
    static int[][] field_E;
    static lj field_C;

    void a(ee param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, (byte) -109, param3);
          if (this.field_A != null) {
            this.field_A.a(param0, this.field_m + param1, (byte) -124, param3 + this.field_i);
          }
          if (param2 < -97) {
            return;
          }
          field_B = (int[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ic.U(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean b(ee param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 0) {
            return true;
          }
          stackIn_8_0 = (this.field_A != null) && (!this.field_A.c(88)) && (this.field_A.a(param0, 0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ic.M(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 <= var2 &&
          var2 < 160) {
          var3 = ae.field_p[var2 - 128];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
        }
        if (param1 == -11721) {
          return (char)var2;
        }
        ic.a((byte) 85, 82);
        return (char)var2;
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            field_E = (int[][]) null;
          }
          if (this.a(param0, param1, -127, param2)) {
            this.a(param2, -96, param0, param1);
            this.a((byte) 113, param2, param0, param1);
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ic.W(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(ee param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            ic.g(90);
          }
          stackIn_6_0 = (null != this.field_A) && (this.field_A.a(param0, 0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ic.RA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(int param0) {
        if (param0 == 6064) {
          if (this.field_A != null) {
            this.field_A.d(param0 ^ 0);
          }
          return;
        }
        ee var3 = (ee) null;
        boolean discarded$3 = this.a(-127, (ee) null);
        if (this.field_A != null) {
          this.field_A.d(param0 ^ 0);
        }
    }

    ee c(byte param0) {
        ee var2 = this.field_A;
        if (var2 == null) {
          if (param0 >= -24) {
            this.b(false);
            return null;
          }
          return null;
        }
        if (var2.c(122)) {
          return var2;
        }
        if (param0 >= -24) {
          this.b(false);
          return null;
        }
        return null;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -81) {
            this.field_A = (ee) null;
          }
          stackIn_6_0 = (this.field_A != null) && (this.field_A.a(param0, param1, param2 ^ 0, this.field_i + param3, param4 + this.field_m, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ic.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(byte param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$11 = null;
        int var5_int = 0;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$12 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          discarded$11 = param1.append('\n');
          if (param0 <= 90) {
            field_D = (ka[]) null;
          }
          for (var5_int = 0; param3 >= var5_int; var5_int++) {
            discarded$13 = param1.append(' ');
          }
          if (this.field_A != null) {
            this.field_A.a(param2, 1 + param3, param1, true);
            return;
          }
          discarded$12 = param1.append("null");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ic.O(").append(param0).append(',');
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
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final int e(int param0) {
        if (param0 != -15000) {
          return 18;
        }
        return this.field_A == null ? 0 : this.field_A.e(-15000);
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, String param5, byte param6, boolean param7) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          if (null == qf.field_e) {
            ui.c(-112);
          }
          var8 = param4;
          if (param6 != 127) {
            ic.g(29);
          }
          var9 = ag.field_e.field_K + ag.field_e.field_x;
          var10 = var9 + 2;
          if (param7) {
            if (param4 == null &&
              param5 == null) {
              return;
            }
            if (param5 != param4 &&
              param5 != null) {
              var8 = param5;
            }
            var11 = ag.field_e.a(var8);
            var12 = 1;
            if (var11 > param3) {
              var11 = param3;
              var12 = ag.field_e.a(var8, var11);
            }
            var13 = var12 * var10;
            if (param1 <= 16) {
              var11 = param1 * var11 >> 4;
              var13 = param1 * var13 >> 4;
            }
            var14 = param2 - (var11 >> 1);
            var15 = -(var13 >> 1) + param0;
            var16 = ph.field_m[0].field_q;
            var17 = ph.field_m[0].field_v;
            ch.a(240, var14 - var16 * 2, -(2 * var17) + var15, var13 + 4 * var17, true, var16 * 4 + var11, ph.field_m);
            if (16 >= param1) {
              return;
            }
            ag.field_e.a(var8, var14, var15, var11, var13, 6488064, -1, 0, 0, var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_22_0 = var8_ref;
          stackIn_22_1 = new StringBuilder().append("ic.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 > 100) {
          super.a((byte) 105, param1, param2, param3, param4);
          this.a(25);
          return;
        }
        ee var7 = (ee) null;
        this.a(-124, -100, 56, -77, 47, 51, (ee) null);
        super.a((byte) 105, param1, param2, param3, param4);
        this.a(25);
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_A &&
            this.field_A.c(122) &&
            this.field_A.a(param0, param1, (byte) 70, param3)) {
            return true;
          }
          var5_int = param0;
          if (var5_int != 80) {
            if (param2 > 9) {
              return false;
            }
            return true;
          }
          if (nj.field_c[81]) {
            stackIn_10_0 = this.a(0, param3);
          } else {
            stackIn_10_0 = this.b(param3, -54);
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ic.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        try {
          if (this.field_A != null) {
            this.field_A.a(param0 + this.field_i, (byte) 35, param2, this.field_m + param3, param4, param5);
          }
          int var7_int = -37 % ((param1 + 29) / 39);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ic.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 < 76) {
          return true;
        }
        return null != this.c((byte) -92) ? true : false;
    }

    final boolean a(int param0, int param1, int param2, int param3, ee param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            return false;
          }
          stackIn_8_0 = (null != this.field_A) && (this.field_A.c(85)) && (this.field_A.a(0, param1, param2, param3, param4, param5, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ic.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(int param0, ee param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.a(72, -19, false, 110);
          }
          stackIn_7_0 = (this.field_A != null) && (!this.field_A.c(param0 + 114)) && (this.field_A.a(param1, 0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ic.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ic(int param0, int param1, int param2, int param3, j param4, gg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String b(boolean param0) {
        String var3 = null;
        String var2 = super.b(param0);
        String var3Lifetime1;
        if (param0) {
          field_C = (lj) null;
          if (null != this.field_A) {
            var3 = this.field_A.b(false);
            if (var3 != null) {
              return var3;
            }
            return var2;
          }
          return var2;
        }
        if (null == this.field_A) {
          return var2;
        }
        var3Lifetime1 = this.field_A.b(false);
        if (var3Lifetime1 == null) {
          return var2;
        }
        return var3Lifetime1;
    }

    void a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 0) {
          if (param2) {
            field_D = (ka[]) null;
            if (this.field_A == null) {
              return;
            }
            this.field_A.a(param0 + this.field_i, param1 + this.field_m, false, param3);
            return;
          }
          if (this.field_A == null) {
            return;
          }
          this.field_A.a(param0 + this.field_i, param1 + this.field_m, false, param3);
          return;
        }
        if (this.field_q == null) {
          if (param2) {
            field_D = (ka[]) null;
            if (this.field_A == null) {
              return;
            }
            this.field_A.a(param0 + this.field_i, param1 + this.field_m, false, param3);
            return;
          }
          if (this.field_A == null) {
            return;
          }
          this.field_A.a(param0 + this.field_i, param1 + this.field_m, false, param3);
          return;
        }
        this.field_q.a((ee) (this), param0, param1, (byte) 97, true);
        if (param2) {
          field_D = (ka[]) null;
          if (this.field_A == null) {
            return;
          }
          this.field_A.a(param0 + this.field_i, param1 + this.field_m, false, param3);
          return;
        }
        if (this.field_A == null) {
          return;
        }
        this.field_A.a(param0 + this.field_i, param1 + this.field_m, false, param3);
    }

    final static int a(qa param0, qa param1, byte param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -47) {
            field_D = (ka[]) null;
          }
          var4 = (String) null;
          stackIn_3_0 = pd.a(param0, 0, (String) null, false, 0, -1, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ic.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_B = (int[][]) null;
        field_D = null;
        field_C = null;
        field_E = (int[][]) null;
        if (param0 != 1) {
          field_E = (int[][]) null;
        }
    }

    void a(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_A == null) {
          var2 = 53 / ((-45 - param0) / 48);
          return;
        }
        this.field_A.b((byte) 121);
        var2Lifetime1 = 53 / ((-45 - param0) / 48);
    }

    static {
        field_B = new int[][]{new int[]{0, 0, 48, 6, 544, 140, 161, 26, 77, 26, 506, 26}, new int[]{1, 0, 116, 20, 407, 89, 229, 40}, new int[]{2, 1, 116, 9, 407, 89, 181, 29}, new int[]{3, 1, 117, 12, 407, 89, 159, 32}, new int[]{4, 1, 117, 9, 407, 90, 164, 29}, new int[]{4, 1, 117, 9, 407, 90, 164, 29}, new int[]{0, 0, 48, 16, 544, 140, 161, 36, 77, 36, 506, 36}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{5, 0, 189, 8, 247, 89, 212, 28}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{6, 0, 336, 14, 247, 89, 404, 34}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$ceabca3815d0(int param0, int param1, int param2, int param3, String param4, String param5, int param6, boolean param7) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          if (null == qf.field_e) {
            ui.c(-112);
          }
          var8 = param4;
          if (param6 != 127) {
            ic.g(29);
          }
          var9 = ag.field_e.field_K + ag.field_e.field_x;
          var10 = var9 + 2;
          if (param7) {
            if (param4 == null &&
              param5 == null) {
              return;
            }
            if (param5 != param4 &&
              param5 != null) {
              var8 = param5;
            }
            var11 = ag.field_e.a(var8);
            var12 = 1;
            if (var11 > param3) {
              var11 = param3;
              var12 = ag.field_e.a(var8, var11);
            }
            var13 = var12 * var10;
            if (param1 <= 16) {
              var11 = param1 * var11 >> 4;
              var13 = param1 * var13 >> 4;
            }
            var14 = param2 - (var11 >> 1);
            var15 = -(var13 >> 1) + param0;
            var16 = ph.field_m[0].field_q;
            var17 = ph.field_m[0].field_v;
            ch.a(240, var14 - var16 * 2, -(2 * var17) + var15, var13 + 4 * var17, true, var16 * 4 + var11, ph.field_m);
            if (16 >= param1) {
              return;
            }
            ag.field_e.a(var8, var14, var15, var11, var13, 6488064, -1, 0, 0, var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_22_0 = var8_ref;
          stackIn_22_1 = new StringBuilder().append("ic.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }
}
