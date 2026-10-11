/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fc extends ag implements ai {
    static String field_y;
    static int field_z;
    ag field_A;

    boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 110) {
            this.j(72);
          }
          stackIn_6_0 = (this.field_A != null) && (this.field_A.a(param0, param1 + this.field_v, this.field_m + param2, param3, (byte) 110, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("fc.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(80);
    }

    private final boolean b(ag param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 10) {
            field_z = 26;
          }
          stackIn_7_0 = (null != this.field_A) && (!this.field_A.g(param1 ^ -9021)) && (this.field_A.a((byte) -92, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fc.AB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    String e(int param0) {
        String var3 = null;
        String var2 = super.e((int) (char)param0);
        if (this.field_A != null) {
          var3 = this.field_A.e(34);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final static boolean i(int param0) {
        if (param0 != -1) {
          field_z = -85;
        }
        return la.a(bn.c(-1), 10295);
    }

    final boolean g(int param0) {
        if (param0 != -9015) {
          fc.h(-9);
        }
        return null != this.a((byte) -83) ? true : false;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 42) {
          ag var6 = (ag) null;
          this.a((byte) 70, (ag) null);
        }
        if (param3 == 0 &&
          null != this.field_h) {
          this.field_h.a(param0, param1, 15430, (ag) (this), true);
        }
        if (this.field_A != null) {
          this.field_A.a(param0 + this.field_m, this.field_v + param1, (byte) 104, param3);
        }
    }

    final void c(byte param0) {
        int var2 = 53 / ((-27 - param0) / 39);
        if (this.field_A != null) {
          this.field_A.c((byte) 59);
        }
    }

    fc(int param0, int param1, int param2, int param3, nn param4, mh param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final boolean a(ag param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -123) {
            return false;
          }
          stackIn_8_0 = (null != this.field_A) && (!this.field_A.g(-9015)) && (this.field_A.a((byte) -120, param0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("fc.DA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    ag a(byte param0) {
        ag var2 = this.field_A;
        if (param0 != -83) {
          return (ag) null;
        }
        if (var2 == null) {
          return null;
        }
        if (!var2.g(-9015)) {
          return null;
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, int param3, ag param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            this.field_A = (ag) null;
          }
          stackIn_7_0 = (null != this.field_A) && (this.field_A.g(param3 - 9015)) && (this.field_A.a(param0, param1, param2, 0, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("fc.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_y = null;
        if (param0 != 1) {
          field_z = 55;
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2 ^ param2, param3);
          if (null != this.field_A) {
            this.field_A.a(param0, param1 + this.field_m, 0, this.field_v + param3);
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "fc.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        boolean discarded$1 = false;
        ag var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_A != null) {
            this.field_A.a(param0, this.field_m + param1, param2 + this.field_v, param3, param4, 0);
          }
          if (param5 != 0) {
            var8 = (ag) null;
            discarded$1 = this.a((ag) null, 65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("fc.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(')').toString());
        }
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2, false, param1)) {
            this.a(param2, param1, param3, 79);
            this.a(-113, param2, param1, param3);
          }
          if (param0 < 73) {
            this.a((byte) 74);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fc.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void j(int param0) {
        if (null != this.field_A) {
          this.field_A.c(0);
        }
        if (param0 != 80) {
          this.a((byte) 100);
        }
    }

    final void a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          discarded$3 = param3.append('\n');
          for (var5_int = 0; var5_int <= param1; var5_int++) {
            discarded$5 = param3.append(' ');
          }
          if (param0 > -16) {
            this.field_A = (ag) null;
          }
          if (this.field_A == null) {
            discarded$4 = param3.append("null");
          } else {
            this.field_A.a(109, param2, 1 + param1, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fc.CB(").append(param0).append(',').append(param1).append(',');
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
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 0) {
            return false;
          }
          stackIn_7_0 = (this.field_A != null) && (this.field_A.a((byte) -100, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fc.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 274) {
            return true;
          }
          if (this.field_A != null &&
            this.field_A.g(param0 - 9289) &&
            this.field_A.a(274, param1, param2, param3)) {
            return true;
          }
          var5_int = param2;
          if (80 != var5_int) {
            return false;
          }
          if (!qh.field_m[81]) {
            stackIn_12_0 = this.b(param1, 10);
          } else {
            stackIn_12_0 = this.a(param1, param0 ^ -362);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("fc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
          return -103;
        }
        return this.field_A == null ? 0 : this.field_A.f(param0 + 0);
    }

    static {
    }
}
