/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ud extends ei implements lj {
    static String field_H;
    ei field_L;
    static String field_F;
    static int[] field_I;
    static int[] field_G;
    static String field_M;
    static String field_K;
    static vh field_J;

    ud(int param0, int param1, int param2, int param3, fp param4, cc param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void a(int param0) {
        field_J = null;
        field_M = null;
        field_F = null;
        field_G = null;
        field_I = null;
        field_H = null;
        if (param0 >= 45) {
          field_K = null;
          return;
        }
        ud.a(0.4757129525911979, 55, -32);
        field_K = null;
    }

    void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 62) {
            this.g(80);
          }
          if (null == this.field_L) {
            return;
          }
          this.field_L.a(this.field_C + param0, param1, param2 + this.field_D, param3, (byte) 103, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ud.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void d(byte param0) {
        if (param0 != 99) {
          return;
        }
        if (this.field_L != null) {
          this.field_L.d((byte) 99);
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5 = -76 / ((-42 - param1) / 53);
        if (param0 == 0) {
          if (this.field_z == null) {
            if (this.field_L != null) {
              this.field_L.a(param0, (byte) -111, param2 + this.field_C, this.field_D + param3);
              return;
            }
            return;
          }
          this.field_z.a(true, param2, (byte) 91, param3, (ei) (this));
        }
        if (this.field_L == null) {
          return;
        }
        this.field_L.a(param0, (byte) -111, param2 + this.field_C, this.field_D + param3);
    }

    final boolean d(int param0) {
        int var2 = -73 % ((param0 - 7) / 48);
        return null != this.g(-1) ? true : false;
    }

    private final boolean a(ei param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 10) {
            this.d((byte) -92);
          }
          stackIn_7_0 = (this.field_L != null) && (!this.field_L.d(param1 + 48)) && (this.field_L.a(param0, (byte) -119));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ud.QA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$12 = null;
        int var5_int = 0;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$13 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          discarded$12 = param2.append('\n');
          if (param1 != 3) {
            return;
          }
          for (var5_int = 0; param3 >= var5_int; var5_int++) {
            discarded$14 = param2.append(' ');
          }
          if (null == this.field_L) {
            discarded$13 = param2.append("null");
            return;
          }
          this.field_L.a(param2, 1 + param3, param0, param1 ^ 26);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ud.LA(");
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
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_H = (String) null;
          }
          stackIn_6_0 = (null != this.field_L) && (this.field_L.a(param0, param1 + this.field_C, true, param3, param4, this.field_D + param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ud.AA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void f(int param0) {
        if (param0 >= ~ec.field_b) {
          ka.a(true, 256);
          return;
        }
        int var1 = ec.field_b % 32;
        ka.a(true, -var1 + (32 + ec.field_b));
    }

    final static qb a(qb param0, byte param1, int[] param2) {
        qb var3 = null;
        RuntimeException var3_ref = null;
        qb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new qb(0, 0, 0);
          var3.field_i = param2;
          var3.field_e = param0.field_e;
          var3.field_d = param0.field_d;
          var3.field_b = param0.field_b;
          if (param1 <= 23) {
            ud.a(0.5253398849342288, -86, 126);
          }
          var3.field_f = param0.field_f;
          var3.field_j = param0.field_j;
          var3.field_g = param0.field_g;
          var3.field_h = param0.field_h;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ud.KA(");
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
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 >= -126) {
            return false;
          }
          stackIn_8_0 = (this.field_L != null) && (this.field_L.d(119)) && (this.field_L.a(param0, param1, param2, param3, (byte) -127, param5, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ud.WA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 <= 33) {
          return 43;
        }
        return this.field_L == null ? 0 : this.field_L.c(101);
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            this.f((byte) -27);
          }
          if (null != this.field_L &&
            this.field_L.d(93) &&
            this.field_L.a(param0, param1, param2, param3)) {
            return true;
          }
          var5_int = param1;
          if (var5_int != 80) {
            return false;
          }
          if (!vj.field_c[81]) {
            stackIn_12_0 = this.a(param3, 10);
          } else {
            stackIn_12_0 = this.a(param3, false);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ud.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    ei g(int param0) {
        ei var2 = this.field_L;
        if (param0 != -1) {
          return (ei) null;
        }
        if (var2 == null) {
          return null;
        }
        if (var2.d(86)) {
          return var2;
        }
        return null;
    }

    String e(int param0) {
        String var2 = super.e(-58);
        if (param0 > -10) {
          return (String) null;
        }
        if (null == this.field_L) {
          return var2;
        }
        String var3 = this.field_L.e(-90);
        if (var3 != null) {
          return var3;
        }
        return var2;
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 13) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.b(param1, param2, param0, -1)) {
            this.a(1, param2, param0, param1);
            this.a(param2, 3, param0, param1);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ud.EA(");
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

    private final boolean a(ei param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_G = (int[]) null;
          }
          stackIn_7_0 = (null != this.field_L) && (!this.field_L.d(120)) && (this.field_L.a(param0, (byte) -109));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ud.NA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 122 % ((-43 - param1) / 47);
          stackIn_4_0 = (this.field_L != null) && (this.field_L.a(param0, (byte) 60));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ud.M(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f((byte) -128);
    }

    void f(byte param0) {
        if (param0 == -128) {
          if (null != this.field_L) {
            this.field_L.e((byte) -100);
          }
          return;
        }
        ei var3 = (ei) null;
        this.a((ei) null, (byte) 55);
        if (null != this.field_L) {
          this.field_L.e((byte) -100);
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        ei var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1 + 0, param2, param3);
          if (this.field_L != null) {
            this.field_L.a(param0, 958, param2 + this.field_C, param3 + this.field_D);
          }
          if (param1 == 958) {
            return;
          }
          var6 = (ei) null;
          this.a((ei) null, (byte) 51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ud.S(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(double param0, int param1, int param2) {
        if (param2 != 1) {
          return -6;
        }
        return (int)(0.5 + (double)(1 << param1) * param0);
    }

    static {
        field_H = "Account created successfully!";
        field_K = "Public";
        field_I = new int[3];
        field_M = "Please select options in the following rows:  ";
        field_G = new int[]{62, 20, 21, 49, 6, 5, 3, 61};
    }
}
