/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ma extends mf implements ra {
    static ci field_G;
    static boolean field_D;
    static String field_H;
    static String field_F;
    static int[] field_J;
    static long field_E;
    jc field_I;

    private final void b(boolean param0) {
        int var4 = Chess.field_G;
        qj var2 = new qj(this.field_I);
        if (!param0) {
          return;
        }
        mf var3 = (mf) (var2.c(-20229));
        while (var3 != null) {
          var3.c((byte) 119);
          var3 = (mf) (var2.b(8922));
        }
    }

    final boolean a(mf param0, int param1) {
        RuntimeException var3 = null;
        mf var4 = null;
        qj var5 = null;
        mf var6 = null;
        int var7 = 0;
        qj var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          if (this.field_I.h(-93)) {
            return false;
          }
          var8 = new qj(this.field_I);
          if (param1 != 27964) {
            this.d(-95);
          }
          var4 = (mf) (var8.a((byte) -20));
          while (var4 != null) {
            if (var4.d((byte) -67)) {
              var5 = new qj(this.field_I);
              var5.a(var4, (byte) 127);
              var6 = (mf) (var5.b((byte) -69));
              while (var6 != null) {
                if (!var6.a(0, param0)) {
                  var6 = (mf) (var5.b((byte) -93));
                  continue;
                }
                return true;
              }
            }
            var4 = (mf) (var8.b((byte) -55));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("ma.SA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(mf param0, int param1) {
        try {
          if (param1 != 95) {
            field_D = true;
          }
          this.field_I.a((o) (param0), (byte) 109);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ma.EB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mf e(byte param0) {
        qj var2;
        mf var3;
        int var4;
        var4 = Chess.field_G;
        var2 = new qj(this.field_I);
        if (param0 != 19) {
          return (mf) null;
        }
        var3 = (mf) (var2.c(param0 - 20248));
        while (var3 != null) {
          if (var3.d((byte) -67)) {
            return var3;
          }
          var3 = (mf) (var2.b(param0 + 8903));
        }
        return null;
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = qm.a('_', param0, "", (byte) -51);
          var3 = i.a(0, param2);
          var4 = 79 / ((param1 + 66) / 51);
          stackIn_5_0 = (-1 != param0.indexOf(param2)) || (-1 != param0.indexOf(var3));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("ma.AB(");
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
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        qj var7 = null;
        mf var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Chess.field_G;
        try {
          var7 = new qj(this.field_I);
          if (param4 != 0) {
            return;
          }
          var8 = (mf) (var7.c(-20229));
          while (var8 != null) {
            if (var8.b(20478)) {
              var8.a(param0, param1, this.field_u + param2, param3, 0, this.field_r + param5);
              var8 = (mf) (var7.b(param4 + 8922));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ma.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void d(int param0) {
        int var5 = Chess.field_G;
        qj var2 = new qj(this.field_I);
        mf var3 = (mf) (var2.c(-20229));
        int var4 = -94 % ((param0 - 34) / 57);
        while (var3 != null) {
          var3.d(102);
          var3 = (mf) (var2.b(8922));
        }
    }

    void a(int param0, int param1, mf param2, int param3) {
        RuntimeException runtimeException = null;
        qj var5 = null;
        mf var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          super.a(param0, -89, param2, param3);
          var5 = new qj(this.field_I);
          var6 = (mf) (var5.c(-20229));
          if (param1 >= -6) {
            return;
          }
          while (var6 != null) {
            if (var6.b(20478)) {
              var6.a(this.field_u + param0, -54, param2, param3 + this.field_r);
              var6 = (mf) (var5.b(8922));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("ma.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = Chess.field_G;
        if (param1 == 0 &&
          null != this.field_n) {
          this.field_n.a((byte) 107, param3, param0, true, (mf) (this));
        }
        qj var5 = new qj(this.field_I);
        mf var6 = (mf) (var5.a((byte) -11));
        if (param2 > -80) {
          return;
        }
        while (var6 != null) {
          var6.a(param0 + this.field_r, param1, -91, this.field_u + param3);
          var6 = (mf) (var5.b((byte) -121));
        }
    }

    final int a(boolean param0) {
        int var5 = 0;
        int var6 = Chess.field_G;
        int var2 = 0;
        qj var3 = new qj(this.field_I);
        mf var4 = (mf) (var3.c(-20229));
        while (var4 != null) {
          var5 = var4.a(true);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (mf) (var3.b(8922));
        }
        if (!param0) {
          this.d(58);
        }
        return var2;
    }

    final boolean d(byte param0) {
        if (param0 != -67) {
          this.d((byte) -111);
        }
        return this.e((byte) 19) != null ? true : false;
    }

    final boolean a(mf param0, byte param1) {
        RuntimeException var3 = null;
        mf var4 = null;
        qj var5 = null;
        mf var6 = null;
        int var7 = 0;
        qj var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          if (this.field_I.h(-25)) {
            return false;
          }
          var8 = new qj(this.field_I);
          var4 = (mf) (var8.c(-20229));
          while (var4 != null) {
            if (var4.d((byte) -67)) {
              var5 = new qj(this.field_I);
              var5.a(false, var4);
              var6 = (mf) (var5.b(8922));
              while (var6 != null) {
                if (var6.a(0, param0)) {
                  return true;
                }
                var6 = (mf) (var5.b(8922));
              }
            }
            var4 = (mf) (var8.b(8922));
          }
          if (param1 == -73) {
            return false;
          }
          field_J = (int[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ma.RA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        String var6 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 1) {
            var6 = (String) null;
            ma.a((String) null, -112, (String) null);
          }
          if (this.a(param1, param0, param2, -35)) {
            this.a(param0, param2, param1, false);
            this.a(param1, (byte) 26, param0, param2);
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ma.WA(");
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

    String g(int param0) {
        qj var2;
        mf var3;
        String var4;
        int var5;
        StringBuilder var6;
        var5 = Chess.field_G;
        var2 = new qj(this.field_I);
        if (param0 != 0) {
          var6 = (StringBuilder) null;
          this.a(125, (byte) -28, (Hashtable) null, (StringBuilder) null);
        }
        var3 = (mf) (var2.c(-20229));
        while (var3 != null) {
          var4 = var3.g(0);
          if (var4 != null) {
            return var4;
          }
          var3 = (mf) (var2.b(8922));
        }
        return null;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        this.b(true);
    }

    ma(int param0, int param1, int param2, int param3, jm param4) {
        super(param0, param1, param2, param3, param4, (rg) null);
        this.field_I = new jc();
    }

    final boolean a(int param0, int param1, int param2, mf param3, int param4, int param5, int param6) {
        qj var8 = null;
        RuntimeException var8_ref = null;
        mf var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Chess.field_G;
        try {
          var8 = new qj(this.field_I);
          var9 = (mf) (var8.c(-20229));
          while (var9 != null) {
            if (var9.b(20478)) {
              if (var9.d((byte) -67) &&
                var9.a(73, param1, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (mf) (var8.b(8922));
              continue;
            }
            break;
          }
          if (param0 > 59) {
            return false;
          }
          field_D = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("ma.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 >= -87) {
          return;
        }
        field_F = null;
        field_J = null;
        field_G = null;
        field_H = null;
    }

    private final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        qj var5 = null;
        mf var6 = null;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Chess.field_G;
        try {
          var5 = new qj(this.field_I);
          var6 = (mf) (var5.c(-20229));
          if (param1 != 26) {
            return;
          }
          while (var6 != null) {
            discarded$3 = param3.append('\n');
            for (var7 = 0; var7 <= param0; var7++) {
              discarded$4 = param3.append(' ');
            }
            var6.a(param2, 1 + param0, param3, 1);
            var6 = (mf) (var5.b(8922));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("ma.UA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(int param0, mf param1) {
        qj var3 = null;
        RuntimeException var3_ref = null;
        mf var4 = null;
        int var5 = 0;
        mf var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Chess.field_G;
        try {
          var3 = new qj(this.field_I);
          var4 = (mf) (var3.c(-20229));
          if (param0 != 0) {
            var6 = (mf) null;
            this.a(37, 99, -118, (mf) null, -21, 62, -50);
          }
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(0, param1)) {
              var4 = (mf) (var3.b(8922));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ma.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        RuntimeException var8 = null;
        mf var9 = null;
        int var10 = 0;
        qj var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Chess.field_G;
        try {
          var11 = new qj(this.field_I);
          var9 = (mf) (var11.c(-20229));
          while (var9 != null) {
            if (var9.b(20478)) {
              if (var9.a(param0, param1, param2, (byte) 88, param4, param5 + this.field_r, this.field_u + param6)) {
                return true;
              }
              var9 = (mf) (var11.b(8922));
              continue;
            }
            break;
          }
          if (param3 == 88) {
            return false;
          }
          field_F = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("ma.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        mf var8 = null;
        qj var9 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          var9 = new qj(this.field_I);
          var8 = (mf) (var9.c(-20229));
          while (var8 != null) {
            if (var8.b(param2 + 20479)) {
              if (var8.d((byte) -67) &&
                var8.a(param0, param1, -1, param3)) {
                return true;
              }
              var8 = (mf) (var9.b(8922));
              continue;
            }
            break;
          }
          if (param2 != -1) {
            return true;
          }
          var6 = param1;
          if (80 != var6) {
            return false;
          }
          if (!ok.field_Jb[81]) {
            stackIn_17_0 = this.a(param3, (byte) -73);
          } else {
            stackIn_17_0 = this.a(param3, 27964);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ma.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_H = "Queen";
        field_F = "The invitation has been withdrawn.";
        field_J = new int[]{200, 100, 200, 500, 500, 100, 200, 200, 300, 500, 100};
    }
}
