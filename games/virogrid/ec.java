/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ec extends fi implements ja {
    static String field_y;
    static float field_z;
    fi field_x;
    static String field_D;
    static String field_A;
    static km field_C;

    final boolean a(int param0, fi param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != 0) {
            return true;
          }
          stackIn_8_0 = (this.field_x != null) && (this.field_x.f(true)) && (this.field_x.a(param0, param1, param2, param3, param4, param5 + 0, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ec.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    String d(int param0) {
        String var3 = null;
        String var2 = super.d(41);
        String var3Lifetime1;
        if (param0 < 35) {
          field_C = (km) null;
          if (this.field_x == null) {
            return var2;
          }
          var3 = this.field_x.d(38);
          if (var3 != null) {
            return var3;
          }
          return var2;
        }
        if (this.field_x == null) {
          return var2;
        }
        var3Lifetime1 = this.field_x.d(38);
        if (var3Lifetime1 != null) {
          return var3Lifetime1;
        }
        return var2;
    }

    public static void a(int param0) {
        field_C = null;
        field_D = null;
        field_A = null;
        field_y = null;
        if (param0 != -3298) {
          field_D = (String) null;
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_x != null &&
            this.field_x.f(true) &&
            this.field_x.a(param0, param1, param2, -124)) {
            return true;
          }
          var5_int = -96 % ((-75 - param3) / 36);
          var6 = param2;
          if (var6 != 80) {
            return false;
          }
          if (!dc.field_Y[81]) {
            stackIn_9_0 = this.a((byte) -67, param0);
          } else {
            stackIn_9_0 = this.a(param0, true);
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ec.AA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean f(boolean param0) {
        if (!param0) {
          return false;
        }
        return null != this.g(!param0 ? true : false) ? true : false;
    }

    private final boolean a(fi param0, boolean param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        fi var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var4 = (fi) null;
            discarded$1 = this.a((byte) -30, (fi) null);
          }
          stackIn_7_0 = (this.field_x != null) && (!this.field_x.f(true)) && (this.field_x.a(param0, -8515));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ec.WA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -8515) {
            this.d(-27);
          }
          stackIn_6_0 = (this.field_x != null) && (this.field_x.a(param0, -8515));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ec.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 118) {
            var6 = (StringBuilder) null;
            this.a((Hashtable) null, (byte) 94, 63, (StringBuilder) null);
          }
          if (this.a(param0, param2, 34, param3)) {
            this.a(param2, param0, (byte) 126, param3);
            this.a(param0, param3, 8651, param2);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ec.MA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final boolean a(byte param0, fi param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        fi var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -50) {
            var4 = (fi) null;
            discarded$1 = this.a((byte) 59, (fi) null);
          }
          stackIn_7_0 = (this.field_x != null) && (!this.field_x.f(true)) && (this.field_x.a(param1, -8515));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ec.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ec(int param0, int param1, int param2, int param3, ol param4, cd param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        if (!param1) {
          return;
        }
        super.a(param0, param1, param2, param3, param4);
        this.e(-37);
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$4 = null;
        int var5_int = 0;
        StringBuilder discarded$7 = null;
        boolean discarded$5 = false;
        StringBuilder discarded$6 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        fi var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          discarded$4 = param1.append('\n');
          for (var5_int = 0; param3 >= var5_int; var5_int++) {
            discarded$7 = param1.append(' ');
          }
          if (param2 != 8651) {
            var7 = (fi) null;
            discarded$5 = this.a((fi) null, true);
          }
          if (this.field_x != null) {
            this.field_x.a(param0, (byte) 122, param3 + 1, param1);
            return;
          }
          discarded$6 = param1.append("null");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ec.AB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param3 == 0 &&
          this.field_w != null) {
          this.field_w.a(param1, (fi) (this), true, param2, -23294);
        }
        if (param0 != 37) {
          field_y = (String) null;
        }
        if (this.field_x != null) {
          this.field_x.a((byte) 37, param1 + this.field_l, param2 + this.field_u, param3);
        }
    }

    boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            return true;
          }
          stackIn_7_0 = (null != this.field_x) && (this.field_x.a(param0, param1, false, param3 + this.field_l, param4, param5 + this.field_u, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ec.NA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void c(int param0) {
        if (param0 == -1) {
          if (this.field_x != null) {
            this.field_x.c(-1);
          }
          return;
        }
        fi var3 = (fi) null;
        boolean discarded$3 = this.a((fi) null, true);
        if (this.field_x != null) {
          this.field_x.c(-1);
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, 122, param2, param3);
          if (param1 <= 113) {
            this.field_x = (fi) null;
          }
          if (null == this.field_x) {
            return;
          }
          this.field_x.a(this.field_l + param0, 117, param2, this.field_u + param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ec.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    fi g(boolean param0) {
        fi var2 = null;
        fi var2Lifetime1;
        if (param0) {
          field_D = (String) null;
          var2 = this.field_x;
          if (var2 == null) {
            return null;
          }
          if (var2.f(true)) {
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_x;
        if (var2Lifetime1 == null) {
          return null;
        }
        if (var2Lifetime1.f(true)) {
          return var2Lifetime1;
        }
        return null;
    }

    final int b(byte param0) {
        if (param0 == -39) {
          return this.field_x != null ? this.field_x.b((byte) -39) : 0;
        }
        fi var3 = (fi) null;
        this.a((fi) null, 66);
        return this.field_x != null ? this.field_x.b((byte) -39) : 0;
    }

    void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 < 73) {
            ec.a(-26);
          }
          if (this.field_x == null) {
            return;
          }
          this.field_x.a(param0, param1, param2 + this.field_l, param3, param4 + this.field_u, 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ec.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void e(int param0) {
        if (null != this.field_x) {
          this.field_x.d(false);
        }
        if (param0 < -2) {
          return;
        }
        fi var3 = (fi) null;
        boolean discarded$0 = this.a((byte) -16, (fi) null);
    }

    static {
        field_D = "Enter name of friend to delete from list";
        field_y = "<%0>'s turn";
        field_A = "This password contains your Player Name, and would be easy to guess";
    }
}
