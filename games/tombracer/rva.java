/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rva extends ae implements tpa {
    static int[] field_u;
    static jpa field_v;
    ae[] field_w;

    private final ae a(int param0) {
        int var3 = 0;
        ae[] var2;
        ae var4;
        int var5;
        ae[] var7;
        StringBuilder var6;
        var5 = TombRacer.field_G ? 1 : 0;
        if (null == this.field_w) {
          return null;
        }
        var7 = this.field_w;
        var2 = var7;
        for (var3 = 0; var3 < var7.length; var3++) {
          var4 = var7[var3];
          if (var4 != null &&
            var4.b((byte) -34)) {
            return var4;
          }
        }
        if (param0 < -10) {
          return null;
        }
        var6 = (StringBuilder) null;
        this.a((Hashtable) null, 73, -34, (StringBuilder) null);
        return null;
    }

    final boolean a(ae param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ae var5 = null;
        ae var6 = null;
        int var7 = 0;
        ae stackIn_8_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == this.field_w) {
            return false;
          }
          var4_int = this.field_w.length - 1;
          while (var4_int >= 0) {
            var5 = this.field_w[var4_int];
            stackIn_8_0 = var5;
            if (stackIn_8_0 != null &&
              var5.b((byte) -34)) {
              for (var4_int = var4_int - param2; var4_int >= 0; var4_int = var4_int - param2) {
                var6 = this.field_w[var4_int];
                if (var6 != null &&
                  var6.a(param0, false)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          if (param1 == -14) {
            return false;
          }
          field_u = (int[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("rva.UA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        ae[] var7 = null;
        ae var9 = null;
        int var10 = 0;
        ae var11 = null;
        ae[] var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == this.field_w) {
            return;
          }
          if (param0 != 59) {
            var11 = (ae) null;
            this.a(103, (ae) null, -84);
          }
          var12 = this.field_w;
          var7 = var12;
          for (var8 = 0; var8 < var12.length; var8++) {
            var9 = var12[var8];
            if (var9 != null) {
              var9.a((byte) 59, param1, param2, this.field_i + param3, this.field_n + param4, param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("rva.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        int var6 = 0;
        ae[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        ae var7 = null;
        int var8 = 0;
        ae[] var9 = null;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_w == null) {
            return false;
          }
          var9 = this.field_w;
          var5 = var9;
          if (!param3) {
            this.a(true);
          }
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.b((byte) -34) &&
              var7.a(param0, param1, param2, true)) {
              return true;
            }
          }
          var5_int = param2;
          if (80 != var5_int) {
            return false;
          }
          if (oj.field_tb[81]) {
            stackIn_20_0 = this.a(param1, 1);
          } else {
            stackIn_20_0 = this.a((byte) 43, param1);
          }
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("rva.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          Class var2 = (Class) null;
          rva.a((Class) null, (byte) -126);
        }
        field_u = null;
        field_v = null;
    }

    final void f(byte param0) {
        int var4 = 0;
        ae[] var2;
        int var3;
        ae var5;
        int var6;
        ae[] var7;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = this.field_w;
        var2 = var7;
        var3 = 99 / ((param0 + 38) / 60);
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (var5 != null) {
            var5.f((byte) -128);
          }
        }
    }

    abstract void a(byte param0);

    final String d(byte param0) {
        ae[] var2;
        int var3;
        ae var4;
        int var6;
        ae[] var7;
        String var5;
        int var3Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        if (null == this.field_w) {
          return null;
        }
        var7 = this.field_w;
        var2 = var7;
        for (var3 = 0; var7.length > var3; var3++) {
          var4 = var7[var3];
          if (var4 != null) {
            var5 = var4.d((byte) 4);
            if (var5 != null) {
              return var5;
            }
          }
        }
        var3Lifetime1 = 103 % ((param0 + 58) / 60);
        return null;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        ae var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param2 == param3 &&
          this.field_r != null) {
          this.field_r.a((ae) (this), param0, 16777215, param1, true);
        }
        if (null != this.field_w) {
          for (var5 = this.field_w.length - 1; 0 <= var5; var5--) {
            var6 = this.field_w[var5];
            if (var6 != null) {
              var6.a(this.field_i + param0, this.field_n + param1, 0, param3);
            }
          }
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        StringBuilder discarded$4 = null;
        int var8 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        ae var7 = null;
        int var9 = 0;
        ae[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_w == null) {
            return;
          }
          var10 = this.field_w;
          if (param2 <= 121) {
            field_v = (jpa) null;
          }
          for (var6 = 0; var6 < var10.length; var6++) {
            var7 = var10[var6];
            discarded$4 = param3.append('\n');
            for (var8 = 0; param1 >= var8; var8++) {
              discarded$6 = param3.append(' ');
            }
            if (var7 == null) {
              discarded$5 = param3.append("null");
            } else {
              var7.a(1 + param1, param0, param3, 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("rva.TA(");
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
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean a(int param0, ae param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ae var5 = null;
        ae var6 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae var6Lifetime1;
        ae var6Lifetime2;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_w == null) {
            return false;
          }
          var4_int = param2;
          while (var4_int < this.field_w.length) {
            var5 = this.field_w[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            if (var5 != null &&
              var5.b((byte) -34)) {
              for (var4_int = var4_int + param0; var4_int < this.field_w.length; var4_int = var4_int + param0) {
                var6Lifetime2 = this.field_w[var4_int];
                if (var6Lifetime2 != null &&
                  var6Lifetime2.a(param1, false)) {
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
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("rva.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    rva(int param0, int param1, int param2, int param3, isa param4) {
        super(param0, param1, param2, param3, param4, (qc) null);
    }

    final int a(boolean param0) {
        int var4 = 0;
        int var2;
        ae[] var3;
        ae var5;
        int var7;
        int var6;
        var7 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = this.field_w;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.a(false);
            if (var6 > var2) {
              var2 = var6;
            }
          }
        }
        if (param0) {
          field_v = (jpa) null;
        }
        return var2;
    }

    final boolean b(byte param0) {
        if (param0 != -34) {
          this.a((byte) 29);
        }
        return this.a(-49) != null ? true : false;
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
          if (this.a((byte) -122, param0, param1, param2)) {
            this.a(1, param2, param1, param0);
            this.a(param1, param0, 123, param2);
          }
          if (param3 != 0) {
            this.field_w = (ae[]) null;
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rva.R(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(Class param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -44) {
            field_v = (jpa) null;
          }
          if (!param0.isArray()) {
            stackIn_6_0 = param0.getName().substring(1 + param0.getName().lastIndexOf("."));
            return stackIn_6_0;
          }
          stackIn_4_0 = rva.a(param0.getComponentType(), (byte) -57) + "[]";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("rva.VA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(byte param0, ae param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 43) {
            this.field_w = (ae[]) null;
          }
          stackIn_3_0 = this.a(1, param1, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rva.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    boolean a(ae param0, boolean param1) {
        int var4 = 0;
        ae[] var3 = null;
        RuntimeException var3_ref = null;
        ae var5 = null;
        int var6 = 0;
        ae[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1) {
            this.b((byte) -65);
          }
          var7 = this.field_w;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a(param0, param1)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("rva.S(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        int var6 = 0;
        ae[] var5 = null;
        ae var7 = null;
        int var8 = 0;
        ae[] var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          if (null == this.field_w) {
            return;
          }
          var9 = this.field_w;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(this.field_i + param0, 2097152, param2, param3 + this.field_n);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("rva.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(ae param0, int param1) {
        RuntimeException var3 = null;
        ae var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            var4 = (ae) null;
            this.a(-74, -77, 93, 125, (ae) null, -41, 108);
          }
          stackIn_3_0 = this.a(param0, (byte) -14, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rva.BB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) 88);
    }

    boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        int var9 = 0;
        ae[] var8 = null;
        RuntimeException var8_ref = null;
        ae var10 = null;
        int var11 = 0;
        ae[] var12 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_w == null) {
            return false;
          }
          if (param6 != -1) {
            this.field_w = (ae[]) null;
          }
          var12 = this.field_w;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.b((byte) -34) &&
              var10.a(param0, param1, param2, param3, param4, param5, param6 + 0)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("rva.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        int var9 = 0;
        ae[] var8 = null;
        RuntimeException var8_ref = null;
        ae var10 = null;
        int var11 = 0;
        ae var12 = null;
        ae[] var13 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_w == null) {
            return false;
          }
          if (param0 < 70) {
            var12 = (ae) null;
            this.a((ae) null, 84);
          }
          var13 = this.field_w;
          var8 = var13;
          for (var9 = 0; var9 < var13.length; var9++) {
            var10 = var13[var9];
            if (var10 != null &&
              var10.a(123, this.field_i + param1, this.field_n + param2, param3, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("rva.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_u = new int[8192];
    }
}
