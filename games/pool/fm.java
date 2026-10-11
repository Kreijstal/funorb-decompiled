/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fm extends ei implements lj {
    static dd[] field_G;
    static boolean field_H;
    static jd[][] field_K;
    static String field_I;
    static int field_M;
    ei[] field_L;
    static String field_J;

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        int var6 = 0;
        ei[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        ei var7 = null;
        int var8 = 0;
        ei[] var9 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Pool.field_O;
        try {
          if (null == this.field_L) {
            return false;
          }
          var9 = this.field_L;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.d(-117) &&
              var7.a(param0, param1, param2, param3)) {
              return true;
            }
          }
          var5_int = param1;
          if (var5_int != 80) {
            if (!param2) {
              return false;
            }
            return true;
          }
          if (!vj.field_c[81]) {
            stackIn_17_0 = this.a(param3, -3094);
          } else {
            stackIn_17_0 = this.b(param3, (byte) 89);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("fm.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, ei param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ei var5 = null;
        ei var6 = null;
        int var7 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          if (this.field_L == null) {
            return false;
          }
          if (param1 != 2676) {
            return true;
          }
          var4_int = this.field_L.length - 1;
          while (0 <= var4_int) {
            var5 = this.field_L[var4_int];
            if (null != var5 &&
              var5.d(param1 - 2568)) {
              for (var4_int = var4_int - param0; var4_int >= 0; var4_int = var4_int - param0) {
                var6 = this.field_L[var4_int];
                if (null != var6 &&
                  var6.a(param2, (byte) -106)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("fm.NA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int c(int param0) {
        int var4 = 0;
        int var2;
        ei[] var3;
        ei var5;
        int var7;
        int var6;
        var7 = Pool.field_O;
        if (param0 <= 33) {
          return 77;
        }
        var2 = 0;
        var3 = this.field_L;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.c(73);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    public static void g(int param0) {
        field_I = null;
        field_K = (jd[][]) null;
        if (param0 != 16) {
          return;
        }
        field_G = null;
        field_J = null;
    }

    private final ei f(int param0) {
        int var3 = 0;
        ei[] var2;
        ei var4;
        int var5;
        ei[] var6;
        var5 = Pool.field_O;
        if (this.field_L == null) {
          return null;
        }
        if (param0 != 15041) {
          return (ei) null;
        }
        var6 = this.field_L;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.d(124)) {
            return var4;
          }
        }
        return null;
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, byte param3) {
        int var6 = 0;
        StringBuilder discarded$4 = null;
        int var8 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        ei var7 = null;
        int var9 = 0;
        ei[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Pool.field_O;
        try {
          if (this.field_L == null) {
            return;
          }
          var10 = this.field_L;
          if (param3 <= 96) {
            this.field_L = (ei[]) null;
          }
          for (var6 = 0; var10.length > var6; var6++) {
            var7 = var10[var6];
            discarded$4 = param1.append('\n');
            for (var8 = 0; var8 <= param2; var8++) {
              discarded$6 = param1.append(' ');
            }
            if (var7 == null) {
              discarded$5 = param1.append("null");
            } else {
              var7.a(param1, 1 + param2, param0, 61);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("fm.PA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(ei param0, byte param1) {
        int var5 = 0;
        ei[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ei var6 = null;
        int var7 = 0;
        ei[] var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          var8 = this.field_L;
          var3 = var8;
          var4 = -24 % ((param1 + 43) / 47);
          for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (var6 != null &&
              var6.a(param0, (byte) 32)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("fm.M(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var9 = 0;
        ei[] var8 = null;
        RuntimeException var8_ref = null;
        ei var10 = null;
        int var11 = 0;
        ei[] var12 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Pool.field_O;
        try {
          if (param4 >= -126) {
            field_K = (jd[][]) null;
          }
          if (this.field_L == null) {
            return false;
          }
          var12 = this.field_L;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.d(-85) &&
              var10.a(param0, param1, param2, param3, (byte) -127, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("fm.WA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void d(byte param0) {
        int var3 = 0;
        ei[] var2;
        ei var4;
        int var5;
        ei[] var6;
        var5 = Pool.field_O;
        var6 = this.field_L;
        var2 = var6;
        if (param0 != 99) {
          field_I = (String) null;
        }
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.d((byte) 99);
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5;
        ei var6;
        int var7;
        int var5Lifetime1;
        var7 = Pool.field_O;
        if (param0 == 0 &&
          this.field_z != null) {
          this.field_z.a(true, param2, (byte) 51, param3, (ei) (this));
        }
        if (null != this.field_L) {
          for (var5 = -1 + this.field_L.length; var5 >= 0; var5--) {
            var6 = this.field_L[var5];
            if (var6 != null) {
              var6.a(param0, (byte) -98, this.field_C + param2, this.field_D + param3);
            }
          }
        }
        var5Lifetime1 = 93 / ((param1 + 42) / 53);
    }

    private final boolean b(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -98 % ((49 - param1) / 35);
          stackIn_1_0 = this.a(1, 2676, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("fm.QA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static oc a(int param0, oq param1) {
        int var7 = 0;
        oc stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        try {
          var2_int = param1.e(8, 74);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          if (param0 != -16336) {
            fm.g(-31);
          }
          var3 = gk.a((byte) 118, param1) ? 1 : 0;
          var4 = gk.a((byte) 118, param1) ? 1 : 0;
          var5 = new oc();
          var5.field_k = (short)param1.e(16, 98);
          var5.field_m = kh.a(16, var5.field_m, (byte) 127, param1);
          var5.field_s = kh.a(16, var5.field_s, (byte) 99, param1);
          var5.field_l = kh.a(16, var5.field_l, (byte) 123, param1);
          var5.field_d = (short)param1.e(16, 69);
          var5.field_y = kh.a(16, var5.field_y, (byte) 122, param1);
          var5.field_r = kh.a(16, var5.field_r, (byte) 111, param1);
          var5.field_u = kh.a(16, var5.field_u, (byte) 109, param1);
          if (var3 != 0) {
            var5.field_o = (short)param1.e(16, param0 + 16375);
            var5.field_Q = kh.a(16, var5.field_Q, (byte) 109, param1);
            var5.field_p = kh.a(16, var5.field_p, (byte) 121, param1);
            var5.field_j = kh.a(16, var5.field_j, (byte) 120, param1);
            var5.field_x = kh.a(16, var5.field_x, (byte) 109, param1);
            var5.field_w = kh.a(16, var5.field_w, (byte) 110, param1);
            var5.field_O = kh.a(16, var5.field_O, (byte) 118, param1);
          }
          if (var4 != 0) {
            param1.e(16, param0 ^ -16283);
            var5.field_v = kh.a(16, var5.field_v, (byte) 94, param1);
            var5.field_a = kh.a(16, var5.field_a, (byte) 118, param1);
            var5.field_i = kh.a(16, var5.field_i, (byte) 111, param1);
            var5.field_P = kh.a(16, var5.field_P, (byte) 104, param1);
            var5.field_z = kh.a(16, var5.field_z, (byte) 102, param1);
          }
          if (gk.a((byte) 118, param1)) {
            var5.field_H = kh.a(16, var5.field_H, (byte) 110, param1);
          }
          if (gk.a((byte) 118, param1)) {
            var5.field_K = cb.a(50, 16, param1, var5.field_K);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_K.length; var7++) {
              if ((var5.field_K[var7] & 255) > var6) {
                var6 = 255 & var5.field_K[var7];
              }
            }
            if (0 != var6) {
              var5.field_I = (byte)(1 + var6);
            } else {
              var5.field_K = null;
            }
          }
          stackIn_24_0 = var5;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("fm.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param1, param2, param0, -1)) {
            this.a(1, param2, param0, param1);
            this.a(param2, param0, param1, (byte) 108);
          }
          if (param3 >= 13) {
            stackIn_7_0 = (StringBuilder) (param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fm.EA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(ge param0, boolean param1, int param2, int param3, int param4) {
        param0.a(12, false);
        param0.a((byte) -81, 17);
        if (!param1) {
          return;
        }
        try {
          param0.a((byte) -81, param2);
          param0.a((byte) -81, param4);
          param0.a(param3, false);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fm.VA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    fm(int param0, int param1, int param2, int param3, fp param4) {
        super(param0, param1, param2, param3, param4, (cc) null);
    }

    private final boolean a(int param0, ei param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ei var5 = null;
        ei var6 = null;
        int var7 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        ei var6Lifetime1;
        ei var6Lifetime2;
        var7 = Pool.field_O;
        try {
          if (null == this.field_L) {
            return false;
          }
          if (param2 != -9478) {
            this.field_L = (ei[]) null;
          }
          var4_int = 0;
          while (this.field_L.length > var4_int) {
            var5 = this.field_L[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            if (var5 != null &&
              var5.d(103)) {
              for (var4_int = var4_int + param0; var4_int < this.field_L.length; var4_int = var4_int + param0) {
                var6Lifetime2 = this.field_L[var4_int];
                if (var6Lifetime2 != null &&
                  var6Lifetime2.a(param1, (byte) -112)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("fm.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    final String e(int param0) {
        int var3 = 0;
        ei[] var2;
        ei var4;
        int var6;
        StringBuilder var7;
        String var5;
        var6 = Pool.field_O;
        if (null == this.field_L) {
          return null;
        }
        if (param0 >= -10) {
          var7 = (StringBuilder) null;
          this.a((Hashtable) null, (StringBuilder) null, -53, (byte) -52);
        }
        var2 = this.field_L;
        for (var3 = 0; var2.length > var3; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.e(-47);
            if (var5 != null) {
              return var5;
            }
          }
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        int var8 = 0;
        ei[] var7 = null;
        ei var9 = null;
        int var10 = 0;
        ei[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Pool.field_O;
        try {
          if (this.field_L == null) {
            return;
          }
          var11 = this.field_L;
          var7 = var11;
          for (var8 = 0; var11.length > var8; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(param0 + this.field_C, param1, this.field_D + param2, param3, (byte) 86, param5);
            }
          }
          if (param4 < 62) {
            field_I = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_14_0 = var7_ref;
          stackIn_14_1 = new StringBuilder().append("fm.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f((byte) -125);
    }

    private final boolean a(ei param0, int param1) {
        RuntimeException var3 = null;
        ei var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -3094) {
            var4 = (ei) null;
            this.a((ei) null, 110, true, -117, 91, 109, -124);
          }
          stackIn_3_0 = this.a(1, param0, param1 ^ 10512);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fm.KA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        ei[] var8 = null;
        RuntimeException var8_ref = null;
        ei var10 = null;
        int var11 = 0;
        ei[] var12 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Pool.field_O;
        try {
          if (null == this.field_L) {
            return false;
          }
          if (!param2) {
            return true;
          }
          var12 = this.field_L;
          var8 = var12;
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(param0, param1 + this.field_C, param2, param3, param4, this.field_D + param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_20_0 = var8_ref;
          stackIn_20_1 = new StringBuilder().append("fm.AA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    abstract void f(byte param0);

    final static Class a(boolean param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (!param0) {
            field_K = (jd[][]) null;
          }
          if (param1.equals("I")) {
            stackIn_8_0 = Integer.TYPE;
            return stackIn_8_0;
          }
          if (param1.equals("S")) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (param1.equals("J")) {
            stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (param1.equals("Z")) {
            stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (param1.equals("F")) {
            stackIn_22_0 = Float.TYPE;
            return stackIn_22_0;
          }
          if (param1.equals("D")) {
            stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!param1.equals("C")) {
            stackIn_31_0 = Class.forName(param1);
            return stackIn_31_0;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("fm.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        int var6 = 0;
        ei[] var5 = null;
        ei var7 = null;
        int var8 = 0;
        ei[] var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Pool.field_O;
        try {
          if (param1 != 958) {
            field_K = (jd[][]) null;
          }
          super.a(param0, param1 + 0, param2, param3);
          if (this.field_L == null) {
            return;
          }
          var9 = this.field_L;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(param0, 958, param2 + this.field_C, this.field_D + param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("fm.S(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean d(int param0) {
        int var2 = -51 / ((7 - param0) / 48);
        return null != this.f(15041) ? true : false;
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = Pool.field_O;
        int var1_intLifetime1;
        try {
          pj.field_J.b((byte) 26);
          for (var1_int = param0; var1_int < 32; var1_int++) {
            dj.field_l[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; 32 > var1_intLifetime1; var1_intLifetime1++) {
            oa.field_f[var1_intLifetime1] = 0L;
          }
          rn.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fm.AB(" + param0 + ')');
        }
    }

    static {
        field_H = false;
        field_J = "Please select an option in the '<%0>' row.";
    }
}
