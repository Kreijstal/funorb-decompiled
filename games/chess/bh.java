/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class bh extends mf implements ra {
    static jc field_D;
    mf[] field_E;
    static ci field_G;
    static String field_H;
    static int field_F;

    final String g(int param0) {
        int var3 = 0;
        mf[] var2;
        mf var4;
        int var6;
        mf[] var7;
        String var5;
        var6 = Chess.field_G;
        if (this.field_E == null) {
          return null;
        }
        var7 = this.field_E;
        var2 = var7;
        for (var3 = param0; var3 < var7.length; var3++) {
          var4 = var7[var3];
          if (var4 != null) {
            var5 = var4.g(0);
            if (var5 != null) {
              return var5;
            }
          }
        }
        return null;
    }

    void a(int param0, int param1, mf param2, int param3) {
        int var6 = 0;
        mf[] var5 = null;
        mf var7 = null;
        int var8 = 0;
        mf[] var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Chess.field_G;
        try {
          super.a(param0, -54, param2, param3);
          if (null == this.field_E) {
            return;
          }
          var9 = this.field_E;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(this.field_u + param0, -97, param2, this.field_r + param3);
            }
          }
          if (param1 >= -6) {
            field_D = (jc) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("bh.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(dc param0, byte param1, int param2) {
        nk var5 = null;
        int var4 = 0;
        try {
          if (param1 != 46) {
            bh.f((byte) -11);
          }
          var5 = qn.field_U;
          var5.f(param2, param1 ^ -90);
          var5.field_l = var5.field_l + 1;
          var4 = var5.field_l;
          var5.c(1, (byte) -98);
          var5.c(param0.field_j, (byte) -72);
          var5.c((byte) -125, param0.field_l);
          var5.d(param0.field_k, (byte) -81);
          var5.d(param0.field_o, (byte) -81);
          var5.d(param0.field_p, (byte) -81);
          var5.d(param0.field_r, (byte) -81);
          var5.b(var4, (byte) -125);
          var5.a(-var4 + var5.field_l, -1);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "bh.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean a(int param0, mf param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        mf var5 = null;
        mf var6 = null;
        int var7 = 0;
        Object stackIn_7_0 = null;
        mf stackIn_7_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          if (null == this.field_E) {
            return false;
          }
          var4_int = this.field_E.length - 1;
          while (0 <= var4_int) {
            var5 = this.field_E[var4_int];
            stackIn_7_0 = null;
            stackIn_7_1 = var5;
            if (stackIn_7_0 != stackIn_7_1 &&
              var5.d((byte) -67)) {
              for (var4_int = var4_int - param0; var4_int >= 0; var4_int = var4_int - param0) {
                var6 = this.field_E[var4_int];
                if (null != var6 &&
                  var6.a(0, param1)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          if (!param2) {
            return false;
          }
          field_F = 8;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("bh.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        this.a(30);
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 1) {
            bh.e((byte) 117);
          }
          if (this.a(param1, param0, param2, param3 - 90)) {
            this.a(param0, param2, param1, false);
            this.a(param0, 40, param1, param2);
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("bh.WA(");
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
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        mf[] var7 = null;
        mf var9 = null;
        int var10 = 0;
        mf[] var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Chess.field_G;
        try {
          if (this.field_E == null) {
            return;
          }
          var11 = this.field_E;
          var7 = var11;
          for (var8 = param4; var11.length > var8; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(param0, param1, param2 + this.field_u, param3, 0, param5 + this.field_r);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("bh.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(mf param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 1) {
            stackIn_4_0 = this.a(1, param0, false);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bh.T(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(byte param0, mf param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        mf var5 = null;
        mf var6 = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          if (null == this.field_E) {
            return false;
          }
          var4_int = 0;
          if (param0 > -118) {
            return true;
          }
          while (var4_int < this.field_E.length) {
            var5 = this.field_E[var4_int];
            if (var5 != null &&
              var5.d((byte) -67)) {
              for (var4_int = var4_int + param2; var4_int < this.field_E.length; var4_int = var4_int + param2) {
                var6 = this.field_E[var4_int];
                if (var6 != null &&
                  var6.a(0, param1)) {
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
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("bh.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    final void d(int param0) {
        int var3 = 0;
        mf[] var2_ref_mf__;
        mf var4;
        int var5;
        mf[] var6;
        int var2;
        var5 = Chess.field_G;
        var6 = this.field_E;
        var2_ref_mf__ = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.d(92);
          }
        }
        var2 = 22 / ((34 - param0) / 57);
    }

    final boolean a(int param0, mf param1) {
        int var4 = 0;
        mf[] var3 = null;
        RuntimeException var3_ref = null;
        mf var5 = null;
        int var6 = 0;
        mf[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Chess.field_G;
        try {
          var7 = this.field_E;
          var3 = var7;
          for (var4 = param0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a(0, param1)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("bh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean e(byte param0) {
        dc var2;
        boolean stackIn_7_0 = false;
        if (param0 != 55) {
          var2 = (dc) null;
          bh.a((dc) null, (byte) 43, 62);
        }
        stackIn_7_0 = (hm.field_g) || (vi.a(param0 - 58));
        return stackIn_7_0;
    }

    public static void j(int param0) {
        field_G = null;
        field_H = null;
        if (param0 != 0) {
          bh.f((byte) -91);
        }
        field_D = null;
    }

    final int a(boolean param0) {
        int var4 = 0;
        int var2;
        mf[] var3;
        mf var5;
        int var7;
        int var6;
        var7 = Chess.field_G;
        var2 = 0;
        if (!param0) {
          return 63;
        }
        var3 = this.field_E;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.a(param0);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        StringBuilder discarded$4 = null;
        int var8 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        mf var7 = null;
        int var9 = 0;
        mf[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Chess.field_G;
        try {
          if (null == this.field_E) {
            return;
          }
          if (param1 <= 34) {
            return;
          }
          var10 = this.field_E;
          for (var6 = 0; var10.length > var6; var6++) {
            var7 = var10[var6];
            discarded$4 = param3.append('\n');
            for (var8 = 0; param2 >= var8; var8++) {
              discarded$6 = param3.append(' ');
            }
            if (var7 == null) {
              discarded$5 = param3.append("null");
            } else {
              var7.a(param0, 1 + param2, param3, 1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("bh.R(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        int var6 = 0;
        mf[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        mf var7 = null;
        int var8 = 0;
        mf[] var9 = null;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          if (null == this.field_E) {
            return false;
          }
          var9 = this.field_E;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.d((byte) -67) &&
              var7.a(param0, param1, -1, param3)) {
              return true;
            }
          }
          if (param2 != -1) {
            field_G = (ci) null;
          }
          var5_int = param1;
          if (var5_int != 80) {
            return false;
          }
          if (!ok.field_Jb[81]) {
            stackIn_19_0 = this.a(param3, (byte) 121);
          } else {
            stackIn_19_0 = this.a(param3, param2 + 2);
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_24_0 = var5_ref;
          stackIn_24_1 = new StringBuilder().append("bh.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, mf param3, int param4, int param5, int param6) {
        int var9 = 0;
        mf[] var8 = null;
        RuntimeException var8_ref = null;
        mf var10 = null;
        int var11 = 0;
        mf[] var12 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Chess.field_G;
        try {
          if (this.field_E == null) {
            return false;
          }
          var12 = this.field_E;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.d((byte) -67) &&
              var10.a(106, param1, param2, param3, param4, param5, param6)) {
              return true;
            }
          }
          if (param0 > 59) {
            return false;
          }
          field_F = 27;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_20_0 = var8_ref;
          stackIn_20_1 = new StringBuilder().append("bh.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11) {
        ic.a(param11, param10, false, param3, param4, param7, param6, param9, param2, param5, param8, 16777215, param1, 16777215);
        if (param0 >= -102) {
          field_D = (jc) null;
        }
    }

    final static void f(byte param0) {
        try {
          if (tc.field_z != null) {
            try {
              tc.field_z.a(0L, 0);
              tc.field_z.a(tk.field_h.field_l, 24, -1, tk.field_h.field_o);
            } catch (Exception exception) {
            }
          }
          tk.field_h.field_l = tk.field_h.field_l + 24;
          if (param0 != -74) {
            field_H = (String) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(mf param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 43) {
            stackIn_4_0 = this.a((byte) -123, param0, 1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bh.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final mf h(int param0) {
        int var3 = 0;
        mf[] var2;
        mf var4;
        int var5;
        mf[] var6;
        var5 = Chess.field_G;
        if (param0 != -31830) {
          this.field_E = (mf[]) null;
        }
        if (null == this.field_E) {
          return null;
        }
        var6 = this.field_E;
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.d((byte) -67)) {
            return var4;
          }
        }
        return null;
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        int var9 = 0;
        mf[] var8 = null;
        RuntimeException var8_ref = null;
        mf var10 = null;
        int var11 = 0;
        mf[] var12 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Chess.field_G;
        try {
          if (null == this.field_E) {
            return false;
          }
          if (param3 != 88) {
            return true;
          }
          var12 = this.field_E;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(param0, param1, param2, (byte) 88, param4, this.field_r + param5, param6 + this.field_u)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_20_0 = var8_ref;
          stackIn_20_1 = new StringBuilder().append("bh.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static java.applet.Applet i(int param0) {
        if (param0 != 81) {
          return (java.applet.Applet) null;
        }
        if (qe.field_B != null) {
          return qe.field_B;
        }
        return (java.applet.Applet) ((Object) nk.field_w);
    }

    abstract void a(int param0);

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        mf var6;
        int var7;
        var7 = Chess.field_G;
        if (param1 == 0 &&
          null != this.field_n) {
          this.field_n.a((byte) 88, param3, param0, true, (mf) (this));
        }
        if (param2 > -80) {
          return;
        }
        if (this.field_E != null) {
          for (var5 = -1 + this.field_E.length; var5 >= 0; var5--) {
            var6 = this.field_E[var5];
            if (var6 != null) {
              var6.a(param0 + this.field_r, param1, -92, this.field_u + param3);
            }
          }
        }
    }

    final boolean d(byte param0) {
        if (param0 != -67) {
          field_G = (ci) null;
        }
        return this.h(-31830) != null ? true : false;
    }

    bh(int param0, int param1, int param2, int param3, jm param4) {
        super(param0, param1, param2, param3, param4, (rg) null);
    }

    static {
        field_D = new jc();
    }
}
