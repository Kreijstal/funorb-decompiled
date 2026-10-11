/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class kn extends mf implements ra {
    static ug field_H;
    static String field_J;
    static String field_E;
    static md field_F;
    static ed field_D;
    static String field_K;
    mf field_M;
    static km field_G;
    static boolean field_L;
    static jc field_I;

    public static void e(byte param0) {
        field_I = null;
        field_F = null;
        field_D = null;
        field_H = null;
        field_K = null;
        if (param0 == 127) {
          field_J = null;
          field_E = null;
          field_G = null;
          return;
        }
        kn.a((String) null, 18L, 28);
        field_J = null;
        field_E = null;
        field_G = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        this.h(param1 ^ -15582);
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_M != null &&
            this.field_M.d((byte) -67) &&
            this.field_M.a(param0, param1, -1, param3)) {
            return true;
          }
          var5_int = param1;
          if (var5_int == 80) {
            if (ok.field_Jb[81]) {
              stackIn_10_0 = this.a(param3, 82);
            } else {
              stackIn_10_0 = this.a(param3, (byte) 2);
            }
            return stackIn_10_0;
          }
          if (param2 == -1) {
            return false;
          }
          field_D = (ed) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("kn.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static int a(boolean param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_G = (km) null;
          }
          if (!param0) {
            stackIn_6_0 = vj.field_d.b(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = ce.field_a.b(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kn.LB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    mf a(int param0) {
        if (param0 != 0) {
          return (mf) null;
        }
        mf var2 = this.field_M;
        if (var2 == null) {
          return null;
        }
        if (var2.d((byte) -67)) {
          return var2;
        }
        return null;
    }

    final boolean d(byte param0) {
        if (param0 != -67) {
          return true;
        }
        return null != this.a(0) ? true : false;
    }

    final boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_J = (String) null;
          }
          stackIn_6_0 = (this.field_M != null) && (this.field_M.a(0, param1));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    kn(int param0, int param1, int param2, int param3, jm param4, rg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        mf var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_M) {
            this.field_M.a(param0, param1, this.field_u + param2, param3, 0, param5 + this.field_r);
          }
          if (param4 == 0) {
            return;
          }
          var8 = (mf) null;
          this.a(14, (mf) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("kn.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (param0) {
          return this.field_M == null ? 0 : this.field_M.a(true);
        }
        this.a(59);
        return this.field_M == null ? 0 : this.field_M.a(true);
    }

    String g(int param0) {
        String var2 = super.g(param0);
        if (this.field_M == null) {
          return var2;
        }
        String var3 = this.field_M.g(0);
        if (var3 == null) {
          return var2;
        }
        return var3;
    }

    boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 88) {
            return false;
          }
          stackIn_7_0 = (this.field_M != null) && (this.field_M.a(param0, param1, param2, (byte) 88, param4, param5 + this.field_r, param6 + this.field_u));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("kn.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(mf param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            field_K = (String) null;
          }
          stackIn_7_0 = (this.field_M != null) && (!this.field_M.d((byte) -67)) && (this.field_M.a(param1 ^ 2, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kn.KB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(mf param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 19 % ((param1 + 62) / 43);
          stackIn_5_0 = (this.field_M != null) && (!this.field_M.d((byte) -67)) && (this.field_M.a(0, param0));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("kn.AB(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(int param0) {
        int var2 = -70 / ((param0 - 34) / 57);
        if (null != this.field_M) {
          this.field_M.d(117);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 > -80) {
          field_L = true;
        }
        if (param1 == 0 &&
          null != this.field_n) {
          this.field_n.a((byte) 84, param3, param0, true, (mf) (this));
        }
        if (this.field_M != null) {
          this.field_M.a(this.field_r + param0, param1, -96, this.field_u + param3);
        }
    }

    void h(int param0) {
        if (null != this.field_M) {
          this.field_M.c((byte) 90);
        }
        if (param0 != -15616) {
          this.d((byte) -99);
          return;
        }
    }

    void a(int param0, int param1, mf param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -6) {
            return;
          }
          super.a(param0, -109, param2, param3);
          if (this.field_M == null) {
            return;
          }
          this.field_M.a(param0 + this.field_u, -30, param2, this.field_r + param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kn.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(Hashtable param0, byte param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Chess.field_G;
        try {
          discarded$3 = param2.append('\n');
          for (var5_int = 0; param3 >= var5_int; var5_int++) {
            discarded$5 = param2.append(' ');
          }
          if (param1 >= -24) {
            return;
          }
          if (null == this.field_M) {
            discarded$4 = param2.append("null");
            return;
          }
          this.field_M.a(param0, param3 + 1, param2, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("kn.HB(");
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
          throw fk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, mf param3, int param4, int param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        mf var9 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 59) {
            var9 = (mf) null;
            discarded$1 = this.a((mf) null, -84);
          }
          stackIn_7_0 = (this.field_M != null) && (this.field_M.d((byte) -67)) && (this.field_M.a(91, param1, param2, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("kn.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(String param0, long param1, int param2) {
        ve var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 29712) {
            return false;
          }
          var4 = mn.a(param2 ^ -29713, param0);
          if (var4 != null &&
            var4.field_Lb != null) {
            return true;
          }
          stackIn_12_0 = (pd.field_Rb != null) && (null != mi.a(param2 ^ 134188015, param1));
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("kn.GB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param0, param2, param3 - 68)) {
            this.a(param0, param2, param1, false);
            this.a(param0, (byte) -101, param2, param1);
          }
          if (param3 != 1) {
            field_G = (km) null;
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kn.WA(");
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

    static {
        field_J = "Disruptive behaviour";
        field_E = "Buying or selling an account";
        field_H = new ug(2);
        field_K = "Offensive account name";
        field_D = new ed();
        field_L = true;
    }
}
