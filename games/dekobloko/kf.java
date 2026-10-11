/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kf extends ce implements ra {
    static int field_M;
    static String field_N;
    static qc field_I;
    static String field_R;
    static ud field_P;
    static w field_Q;
    static int field_O;
    static int field_L;
    vj field_H;
    static ke field_G;
    static String field_J;
    static int field_K;

    final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return null != this.e((byte) -74) ? true : false;
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          if (param1 <= 38) {
            this.a(false);
          }
          super.a(param0, 68, param2, param3);
          var5 = new rd(this.field_H);
          var6 = (ce) (var5.a((byte) 71));
          while (var6 != null) {
            if (var6.a((byte) 38)) {
              var6.a(param0, 47, this.field_D + param2, param3 + this.field_u);
              var6 = (ce) (var5.a(-62));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("kf.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(ce param0, byte param1) {
        try {
          if (param1 != -55) {
            ce var4 = (ce) null;
            this.a(false, (ce) null);
          }
          this.field_H.a(param0, 2777);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "kf.KC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ce var9 = null;
        rd var10 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          var10 = new rd(this.field_H);
          var6 = 18 % ((-22 - param0) / 49);
          var9 = (ce) (var10.a((byte) 71));
          while (var9 != null) {
            if (var9.a((byte) 124)) {
              if (var9.a(true) &&
                var9.a(-79, param1, param2, param3)) {
                return true;
              }
              var9 = (ce) (var10.a(-78));
              continue;
            }
            break;
          }
          var7 = param1;
          if (var7 != 80) {
            return false;
          }
          if (!bj.field_d[81]) {
            stackIn_15_0 = this.a(32, param2);
          } else {
            stackIn_15_0 = this.a(param2, (byte) -120);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("kf.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        rd var7 = null;
        ce var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = client.field_A ? 1 : 0;
        try {
          var7 = new rd(this.field_H);
          var8 = (ce) (var7.a((byte) 71));
          while (var8 != null) {
            if (var8.a((byte) 119)) {
              var8.a(param0, param1 ^ 0, this.field_u + param2, param3, this.field_D + param4, param5);
              var8 = (ce) (var7.a(-126));
              continue;
            }
            break;
          }
          if (param1 != 64) {
            field_J = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("kf.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param0.length();
          while (var3 > var2_int) {
            if (ug.a(param0.charAt(var2_int), 32)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (ug.a(param0.charAt(var3 - 1), 32)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          var5 = new StringBuilder(var4);
          if (param1 != 2) {
            stackIn_19_0 = (String) null;
            return stackIn_19_0;
          }
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (oe.a((char) var7, param1 ^ -6239)) {
              var8 = un.a(228, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (0 != var5.length()) {
            stackIn_30_0 = var5.toString();
            return stackIn_30_0;
          }
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("kf.MC(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final int d(int param0) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        int var2 = 0;
        rd var3 = new rd(this.field_H);
        ce var4 = (ce) (var3.a((byte) 71));
        int var5Lifetime1;
        while (var4 != null) {
          var5 = var4.d(-31);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (ce) (var3.a(-61));
        }
        var5Lifetime1 = -18 / ((36 - param0) / 51);
        return var2;
    }

    String c(byte param0) {
        rd var2;
        ce var3;
        String var4;
        int var5;
        ce var6;
        var5 = client.field_A ? 1 : 0;
        var2 = new rd(this.field_H);
        var3 = (ce) (var2.a((byte) 71));
        if (param0 != 113) {
          var6 = (ce) null;
          this.a(59, 12, 76, (ce) null, -65, -4, true);
        }
        while (var3 != null) {
          var4 = var3.c((byte) 113);
          if (var4 != null) {
            return var4;
          }
          var3 = (ce) (var2.a(-47));
        }
        return null;
    }

    private final void g(int param0) {
        int var4 = client.field_A ? 1 : 0;
        if (param0 != 0) {
          field_L = -109;
        }
        rd var2 = new rd(this.field_H);
        ce var3 = (ce) (var2.a((byte) 71));
        while (var3 != null) {
          var3.f(121);
          var3 = (ce) (var2.a(param0 - 57));
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -16555) {
          ce var7 = (ce) null;
          this.a((ce) null, (byte) 126);
        }
        super.b(param0, param1, param2, param3, param4 + 0);
        this.g(0);
    }

    final boolean a(ce param0, byte param1) {
        RuntimeException var3 = null;
        ce var4 = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        rd var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          if (this.field_H.b(-105)) {
            return false;
          }
          var8 = new rd(this.field_H);
          var4 = (ce) (var8.a(true));
          while (var4 != null) {
            if (var4.a(true)) {
              var5 = new rd(this.field_H);
              var5.a(var4, (byte) -88);
              var6 = (ce) (var5.d(2078965185));
              while (var6 != null) {
                if (var6.a(false, param0)) {
                  return true;
                }
                var6 = (ce) (var5.d(2078965185));
              }
            }
            var4 = (ce) (var8.d(2078965185));
          }
          if (param1 < -16) {
            return false;
          }
          field_Q = (w) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("kf.QC(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(byte param0) {
        int var4 = client.field_A ? 1 : 0;
        rd var2 = new rd(this.field_H);
        if (param0 != -95) {
          this.c((byte) 50);
        }
        ce var3 = (ce) (var2.a((byte) 71));
        while (var3 != null) {
          var3.d((byte) -95);
          var3 = (ce) (var2.a(-98));
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        rd var8 = null;
        RuntimeException var8_ref = null;
        ce var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          var8 = new rd(this.field_H);
          var9 = (ce) (var8.a((byte) 71));
          if (param6 != -55) {
            return true;
          }
          while (var9 != null) {
            if (var9.a((byte) 120)) {
              if (var9.a(param0, param1, param2, param3, this.field_D + param4, this.field_u + param5, (byte) -55)) {
                return true;
              }
              var9 = (ce) (var8.a(-113));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("kf.LB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    kf(int param0, int param1, int param2, int param3, gl param4) {
        super(param0, param1, param2, param3, param4, (kg) null);
        this.field_H = new vj();
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        ce var9 = null;
        int var10 = 0;
        ce var11 = null;
        rd var12 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          var12 = new rd(this.field_H);
          if (param6) {
            var11 = (ce) null;
            this.a(true, (ce) null);
          }
          var9 = (ce) (var12.a((byte) 71));
          while (var9 != null) {
            if (var9.a((byte) 67)) {
              if (var9.a(true) &&
                var9.a(param0, param1, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (ce) (var12.a(-128));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("kf.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        ce var6 = null;
        int var8 = 0;
        StringBuilder var9 = null;
        rd var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          if (param1 != 0) {
            var9 = (StringBuilder) null;
            this.a((Hashtable) null, -83, (StringBuilder) null, true);
          }
          var10 = new rd(this.field_H);
          var6 = (ce) (var10.a((byte) 71));
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; var7 <= param0; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.a(param3, 1 + param0, param2, true);
            var6 = (ce) (var10.a(-113));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("kf.OC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = client.field_A ? 1 : 0;
        if (param2 == 0 &&
          this.field_p != null) {
          this.field_p.a(true, param0, param3, (byte) -108, (ce) (this));
        }
        rd var5 = new rd(this.field_H);
        ce var6 = (ce) (var5.a(true));
        while (var6 != null) {
          var6.a(param0 + this.field_u, -124, param2, param3 + this.field_D);
          var6 = (ce) (var5.d(2078965185));
        }
        if (param1 > -103) {
          this.a(59, -115, 20, 76);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(0, param1, param0, param2)) {
            this.a((byte) 72, param2, param0, param1);
            this.a(param1, 0, param2, param0);
          }
          if (!param3) {
            field_P = (ud) null;
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kf.MB(");
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
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, ce param1) {
        RuntimeException var3 = null;
        ce var4 = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        rd var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          if (this.field_H.b(-15)) {
            return false;
          }
          var8 = new rd(this.field_H);
          var4 = (ce) (var8.a((byte) 71));
          while (var4 != null) {
            if (var4.a(true)) {
              var5 = new rd(this.field_H);
              var5.a(var4, false);
              var6 = (ce) (var5.a(param0 ^ -24));
              while (var6 != null) {
                if (var6.a(false, param1)) {
                  return true;
                }
                var6 = (ce) (var5.a(param0 - 119));
              }
            }
            var4 = (ce) (var8.a(-109));
          }
          if (param0 != 32) {
            kf.h(-42);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("kf.PC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 < 72) {
          kf.h(-51);
        }
        field_P = null;
        field_R = null;
        field_Q = null;
        field_I = null;
        field_J = null;
        field_N = null;
        field_G = null;
    }

    ce e(byte param0) {
        int var4 = client.field_A ? 1 : 0;
        rd var2 = new rd(this.field_H);
        ce var3 = (ce) (var2.a((byte) 71));
        while (var3 != null) {
          if (var3.a(true)) {
            return var3;
          }
          var3 = (ce) (var2.a(-92));
        }
        if (param0 == -74) {
          return null;
        }
        field_P = (ud) null;
        return null;
    }

    final boolean a(boolean param0, ce param1) {
        rd var3 = null;
        RuntimeException var3_ref = null;
        ce var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          if (param0) {
            field_O = -99;
          }
          var3 = new rd(this.field_H);
          var4 = (ce) (var3.a((byte) 71));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(false, param1)) {
              var4 = (ce) (var3.a(-69));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("kf.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_R = "Offer draw";
        field_N = "Unable to connect to the data server. Please check any firewall you are using.";
        field_L = -1;
        field_J = "This is your RuneScape clan if you have one.";
    }
}
