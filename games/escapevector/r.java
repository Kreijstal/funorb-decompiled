/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class r extends hm implements ba {
    static String[] field_A;
    static int field_B;
    hm field_C;
    static boolean field_y;
    static int field_z;

    private final boolean a(hm param0, int param1) {
        String stackIn_12_2 = null;
        try {
          if (param1 != -812) {
            return false;
          }
          boolean stackIn_8_0 = (null != this.field_C) && (!this.field_C.h(param1 + 812)) && (this.field_C.a(-4659, param0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3;
          StringBuilder stackIn_11_1 = new StringBuilder().append("r.CA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        String stackIn_7_2 = null;
        try {
          int var7_int = 76 / ((param5 + 39) / 45);
          if (this.field_C != null) {
            this.field_C.a(param0, param1 + this.field_k, param2, param3 + this.field_j, param4, (byte) 117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var7;
          StringBuilder stackIn_6_1 = new StringBuilder().append("r.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean b(int param0, hm param1) {
        String stackIn_11_2 = null;
        try {
          if (param0 > -67) {
            hm var4 = (hm) null;
            boolean discarded$1 = this.a((hm) null, -59);
          }
          boolean stackIn_7_0 = (null != this.field_C) && (!this.field_C.h(0)) && (this.field_C.a(-4659, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("r.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          StringBuilder discarded$4 = param3.append('\n');
          for (int var5_int = 0; param0 >= var5_int; var5_int++) {
            StringBuilder discarded$6 = param3.append(' ');
          }
          if (param1 < 61) {
            this.field_C = (hm) null;
          }
          if (this.field_C != null) {
            this.field_C.a(0, param2, param3, 1 + param0);
          } else {
            StringBuilder discarded$5 = param3.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var5;
          StringBuilder stackIn_12_1 = new StringBuilder().append("r.FA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void k(int param0) {
        if (param0 != -6844) {
          return;
        }
        if (null != this.field_C) {
          this.field_C.i(param0 ^ -6844);
        }
    }

    r(int param0, int param1, int param2, int param3, db param4, wn param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int e(int param0) {
        if (param0 != 12050) {
          hm var3 = (hm) null;
          this.a(-87, (hm) null);
        }
        return null != this.field_C ? this.field_C.e(12050) : 0;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        String stackIn_10_2 = null;
        try {
          if (param2 != 3) {
            this.field_C = (hm) null;
          }
          boolean stackIn_6_0 = (null != this.field_C) && (this.field_C.a(this.field_j + param0, param1, (byte) 3, param3, param4 + this.field_k, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var8;
          StringBuilder stackIn_9_1 = new StringBuilder().append("r.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, hm param1) {
        String stackIn_11_2 = null;
        try {
          if (param0 != -4659) {
            return true;
          }
          boolean stackIn_7_0 = (null != this.field_C) && (this.field_C.a(-4659, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("r.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        try {
          if (param0 != 0) {
            hm var6 = (hm) null;
            boolean discarded$1 = this.b(71, (hm) null);
          }
          if (this.a(param3, param1, param2, false)) {
            this.a(param1, param2, param3, 1);
            this.a(param3, (byte) 91, param1, param2);
          }
          StringBuilder stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("r.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(String param0, int param1, String[] param2) {
        String stackIn_29_2 = null;
        String stackIn_32_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          int var3_int = param0.length();
          if (param1 != -63) {
            bd var12 = (bd) null;
            r.a(-19, (bd) null, 121);
          }
          int var4 = var3_int;
          int var5 = 0;
          while (true) {
            int var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (on.a(param0.charAt(var5), false)) {
                  continue;
                }
                break;
              }
              String var7_ref_String = param0.substring(var6_int + 2, var5);
              if (!fk.a(false, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              int var8 = gn.a(16777215, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (param2[var8].length() - (var5 - var6_int));
              continue;
            }
            break;
          }
          StringBuilder var6 = new StringBuilder(var4);
          int var7 = 0;
          int var5Lifetime1 = 0;
          while (true) {
            int var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              StringBuilder discarded$0 = var6.append(param0.substring(var7));
              String stackIn_25_0 = var6.toString();
              return stackIn_25_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (on.a(param0.charAt(var5Lifetime1), false)) {
                continue;
              }
              break;
            }
            String var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!fk.a(false, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (param0.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            int var10 = gn.a(16777215, (CharSequence) ((Object) var9));
            StringBuilder discarded$1 = var6.append(param0.substring(var7, var8Lifetime1));
            StringBuilder discarded$2 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_28_0 = var3;
          StringBuilder stackIn_28_1 = new StringBuilder().append("r.KA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          StringBuilder stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.k(-6844);
    }

    final boolean b(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        String stackIn_11_2 = null;
        try {
          if (param2 > -103) {
            String[] var9 = (String[]) null;
            r.a((String) null, -44, (String[]) null);
          }
          boolean stackIn_7_0 = (null != this.field_C) && (this.field_C.h(0)) && (this.field_C.b(param0, param1, (byte) -115, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var8;
          StringBuilder stackIn_10_1 = new StringBuilder().append("r.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        String stackIn_9_2 = null;
        try {
          super.a(param0 ^ 0, param1, param2, param3);
          if (this.field_C != null) {
            this.field_C.a(param0 + 0, this.field_j + param1, this.field_k + param2, param3);
          }
          if (param0 != -14472) {
            String[] var6 = (String[]) null;
            r.a((String) null, 17, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("r.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (0 == param2 &&
          null != this.field_s) {
          this.field_s.a(param3, param0, -33, (hm) (this), true);
        }
        if (null != this.field_C) {
          this.field_C.a(param0 + this.field_j, (byte) 112, param2, param3 + this.field_k);
        }
        if (param1 <= 85) {
          field_y = false;
        }
    }

    hm j(int param0) {
        hm var2 = this.field_C;
        if (var2 != null &&
          var2.h(0)) {
          return var2;
        }
        if (param0 == 0) {
          return null;
        }
        return (hm) null;
    }

    final static void a(int param0, bd param1, int param2) {
        String stackIn_9_2 = null;
        try {
          c var5 = om.field_c;
          var5.a(param2, true);
          var5.position = var5.position + 1;
          int var4 = var5.position;
          var5.f(1, -123);
          if (param1.field_j != null) {
            var5.f(param1.field_j.length, -123);
            var5.a(param1.field_j.length, (byte) 21, 0, param1.field_j);
          } else {
            var5.f(0, -123);
          }
          var5.c(var4, -38);
          var5.position = var5.position - 4;
          param1.field_i = var5.readInt(-5053);
          var5.e(-80, -var4 + var5.position);
          if (param0 >= -80) {
            r.a((byte) 12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("r.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    String d(int param0) {
        String var2 = super.d(param0);
        if (this.field_C != null) {
          String var3 = this.field_C.d(1);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    public static void a(byte param0) {
        field_A = null;
        if (param0 != 58) {
          bd var2 = (bd) null;
          r.a(-124, (bd) null, 82);
        }
    }

    final void f(int param0) {
        if (this.field_C != null) {
          this.field_C.f(61);
        }
        if (param0 <= 46) {
          this.a(-54, (byte) 0, -102, 84);
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        boolean stackIn_12_0 = false;
        String stackIn_16_2 = null;
        try {
          if (param3 < 0) {
            this.field_C = (hm) null;
          }
          if (this.field_C != null &&
            this.field_C.h(0) &&
            this.field_C.a(param0, param1, param2, 35)) {
            return true;
          }
          int var5_int = param2;
          if (var5_int != 80) {
            return false;
          }
          if (ik.field_h[81]) {
            stackIn_12_0 = this.b(-106, param0);
          } else {
            stackIn_12_0 = this.a(param0, -812);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5;
          StringBuilder stackIn_15_1 = new StringBuilder().append("r.G(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean h(int param0) {
        if (param0 != 0) {
          hm var3 = (hm) null;
          boolean discarded$0 = this.b(-85, (hm) null);
        }
        return null != this.j(0) ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 13202) {
          return;
        }
        SoftwareRasterizer.a(param0, param2 + 7, param3 - 1, 2, param4);
        SoftwareRasterizer.a(param3 + param0, param2, 4, 16, param4);
        SoftwareRasterizer.a(param3 + (param0 + 5), 7 + param2, 63 - param3, 2, param4);
    }

    static {
        field_B = 480;
        field_A = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
