/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class bj extends hm implements ba {
    static boolean[] field_E;
    static java.awt.Image field_z;
    static mf field_B;
    static String field_D;
    cn field_A;
    static int field_y;
    static ie field_C;
    static int[] field_F;

    private final void f(byte param0) {
        int var4 = EscapeVector.field_A;
        wf var2 = new wf(this.field_A);
        if (param0 != 6) {
          bj.e((byte) -76);
        }
        hm var3 = (hm) (var2.c(param0 ^ 9));
        while (var3 != null) {
          var3.i(0);
          var3 = (hm) (var2.a(53));
        }
    }

    public static void g(byte param0) {
        field_C = null;
        field_z = null;
        field_D = null;
        field_F = null;
        if (param0 != -68) {
          field_F = (int[]) null;
        }
        field_B = null;
        field_E = null;
    }

    final boolean h(int param0) {
        if (param0 != 0) {
          return false;
        }
        return this.a(true) != null ? true : false;
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = EscapeVector.field_A;
        if (param1 <= 85) {
          StringBuilder var8 = (StringBuilder) null;
          this.a(37, (Hashtable) null, (StringBuilder) null, 58);
        }
        if (param2 == 0 &&
          null != this.field_s) {
          this.field_s.a(param3, param0, -42, (hm) (this), true);
        }
        wf var5 = new wf(this.field_A);
        hm var6 = (hm) (var5.b(-31616));
        while (var6 != null) {
          var6.a(param0 + this.field_j, (byte) 127, param2, this.field_k + param3);
          var6 = (hm) (var5.a((byte) 59));
        }
    }

    bj(int param0, int param1, int param2, int param3, db param4) {
        super(param0, param1, param2, param3, param4, (wn) null);
        this.field_A = new cn();
    }

    final static boolean e(byte param0) {
        int var1;
        boolean stackIn_4_0 = false;
        var1 = -82 % ((34 - param0) / 63);
        stackIn_4_0 = (!aj.b(-105)) && (0 < s.field_x);
        return stackIn_4_0;
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int var2 = 0;
        wf var3 = new wf(this.field_A);
        if (param0 != 12050) {
          return 121;
        }
        hm var4 = (hm) (var3.c(15));
        while (var4 != null) {
          var5 = var4.e(12050);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (hm) (var3.a(56));
        }
        return var2;
    }

    final String d(int param0) {
        wf var2;
        hm var3;
        String var4;
        int var5;
        Hashtable var6;
        var5 = EscapeVector.field_A;
        var2 = new wf(this.field_A);
        if (param0 != 1) {
          var6 = (Hashtable) null;
          this.a((StringBuilder) null, -16, (Hashtable) null, 72);
        }
        var3 = (hm) (var2.c(15));
        while (var3 != null) {
          var4 = var3.d(1);
          if (var4 != null) {
            return var4;
          }
          var3 = (hm) (var2.a(param0 + 57));
        }
        return null;
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        wf var8 = null;
        RuntimeException var8_ref = null;
        hm var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = EscapeVector.field_A;
        try {
          if (param2 != 3) {
            return false;
          }
          var8 = new wf(this.field_A);
          var9 = (hm) (var8.c(param2 ^ 12));
          while (var9 != null) {
            if (var9.b((byte) 48)) {
              if (!var9.a(this.field_j + param0, param1, (byte) 3, param3, this.field_k + param4, param5, param6)) {
                var9 = (hm) (var8.a(108));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("bj.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        wf var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        hm var8 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          var5 = new wf(this.field_A);
          var8 = (hm) (var5.c(15));
          if (param3 <= 0) {
            return false;
          }
          while (var8 != null) {
            if (var8.b((byte) 48)) {
              if (var8.h(0) &&
                var8.a(param0, param1, param2, 37)) {
                return true;
              }
              var8 = (hm) (var5.a(54));
              continue;
            }
            break;
          }
          var6 = param2;
          if (80 != var6) {
            return false;
          }
          if (!ik.field_h[81]) {
            stackIn_16_0 = this.a(param0, true);
          } else {
            stackIn_16_0 = this.a((byte) 22, param0);
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_19_0 = var5_ref;
          stackIn_19_1 = new StringBuilder().append("bj.G(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        if (!param3) {
          return;
        }
        this.f((byte) 6);
    }

    final boolean b(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        wf var8 = null;
        RuntimeException var8_ref = null;
        hm var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = EscapeVector.field_A;
        try {
          if (param2 >= -103) {
            field_B = (mf) null;
          }
          var8 = new wf(this.field_A);
          var9 = (hm) (var8.c(15));
          while (var9 != null) {
            if (var9.b((byte) 48)) {
              if (var9.h(0) &&
                var9.b(param0, param1, (byte) -127, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (hm) (var8.a(102));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("bj.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        RuntimeException runtimeException = null;
        wf var5 = null;
        hm var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new wf(this.field_A);
          var6 = (hm) (var5.c(15));
          while (var6 != null) {
            if (var6.b((byte) 48)) {
              var6.a(-14472, this.field_j + param1, param2 + this.field_k, param3);
              var6 = (hm) (var5.a(57));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("bj.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void f(int param0) {
        int var4 = EscapeVector.field_A;
        wf var2 = new wf(this.field_A);
        hm var3 = (hm) (var2.c(15));
        while (var3 != null) {
          var3.f(111);
          var3 = (hm) (var2.a(25));
        }
        if (param0 < 46) {
          hm var5 = (hm) null;
          this.a((hm) null, 'c', -45, -89);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = -53 / ((param0 - 70) / 45);
        int var3 = param2 / 2500;
        var3 = kf.a(106, param1, var3);
        return var3;
    }

    final boolean a(byte param0, hm param1) {
        RuntimeException var3 = null;
        hm var4 = null;
        wf var5 = null;
        hm var6 = null;
        int var7 = 0;
        wf var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          if (this.field_A.a(param0 ^ -106)) {
            return false;
          }
          var8 = new wf(this.field_A);
          if (param0 != 22) {
            return true;
          }
          var4 = (hm) (var8.b(-31616));
          while (var4 != null) {
            if (var4.h(0)) {
              var5 = new wf(this.field_A);
              var5.a((byte) 55, (hg) (var4));
              var6 = (hm) (var5.a((byte) 47));
              while (var6 != null) {
                if (var6.a(-4659, param1)) {
                  return true;
                }
                var6 = (hm) (var5.a((byte) 80));
              }
            }
            var4 = (hm) (var8.a((byte) 74));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("bj.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean a(hm param0, boolean param1) {
        RuntimeException var3 = null;
        hm var4 = null;
        wf var5 = null;
        hm var6 = null;
        int var7 = 0;
        hm var8 = null;
        wf var9 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          if (this.field_A.a(-97)) {
            return false;
          }
          var9 = new wf(this.field_A);
          if (!param1) {
            var8 = (hm) null;
            this.a(31, -112, (byte) -74, 114, -25, (hm) null, -91);
          }
          var4 = (hm) (var9.c(15));
          while (var4 != null) {
            if (var4.h(0)) {
              var5 = new wf(this.field_A);
              var5.a(-12818, var4);
              var6 = (hm) (var5.a(125));
              while (var6 != null) {
                if (!var6.a(-4659, param0)) {
                  var6 = (hm) (var5.a(80));
                  continue;
                }
                return true;
              }
            }
            var4 = (hm) (var9.a(98));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("bj.PA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, hm param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        hm var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = EscapeVector.field_A;
        try {
          var3 = new wf(this.field_A);
          if (param0 != -4659) {
            bj.e((byte) 13);
          }
          var4 = (hm) (var3.c(15));
          while (var4 != null) {
            if (var4.a(-4659, param1)) {
              return true;
            }
            var4 = (hm) (var3.a(param0 + 4779));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("bj.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    hm a(boolean param0) {
        wf var2;
        hm var3;
        int var4;
        var4 = EscapeVector.field_A;
        var2 = new wf(this.field_A);
        if (!param0) {
          field_y = 52;
        }
        var3 = (hm) (var2.c(15));
        while (var3 != null) {
          if (var3.h(0)) {
            return var3;
          }
          var3 = (hm) (var2.a(78));
        }
        return null;
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        wf var5 = null;
        hm var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = EscapeVector.field_A;
        try {
          var5 = new wf(this.field_A);
          if (param3 <= 95) {
            field_D = (String) null;
          }
          var6 = (hm) (var5.c(15));
          while (var6 != null) {
            discarded$3 = param0.append('\n');
            for (var7 = 0; param1 >= var7; var7++) {
              discarded$4 = param0.append(' ');
            }
            var6.a(0, param2, param0, param1 + 1);
            var6 = (hm) (var5.a(31));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("bj.IA(");
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
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(hm param0, boolean param1) {
        try {
          if (param1) {
            hm var4 = (hm) null;
            this.a((byte) -114, (hm) null);
          }
          this.field_A.a(-12328, param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bj.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        RuntimeException runtimeException = null;
        wf var7 = null;
        hm var8_ref_hm = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = EscapeVector.field_A;
        try {
          var7 = new wf(this.field_A);
          var8_ref_hm = (hm) (var7.c(15));
          while (var8_ref_hm != null) {
            if (var8_ref_hm.b((byte) 48)) {
              var8_ref_hm.a(param0, this.field_k + param1, param2, param3 + this.field_j, param4, (byte) -113);
              var8_ref_hm = (hm) (var7.a(29));
              continue;
            }
            break;
          }
          var8 = -114 % ((-39 - param5) / 45);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("bj.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(')').toString());
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.a(-82, (byte) 105, -122, -83);
          }
          if (this.a(param3, param1, param2, false)) {
            this.a(param1, param2, param3, 1);
            this.a(param2, param3, param1, 115);
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("bj.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_D = "TNT";
        field_F = new int[]{15, 19};
        field_y = 0;
    }
}
