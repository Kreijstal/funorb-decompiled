/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class kl extends qm implements a {
    static String field_x;
    static String field_C;
    static String field_F;
    qm[] field_z;
    static ll[] field_G;
    static String field_y;
    static int field_A;
    static int[] field_B;
    static qb[] field_E;
    static String field_D;

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$7 = null;
        qm var7 = null;
        int var9 = 0;
        qm[] var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 != 31115) {
            this.field_z = (qm[]) null;
          }
          if (null == this.field_z) {
            return;
          }
          var10 = this.field_z;
          for (var6 = 0; var10.length > var6; var6++) {
            var7 = var10[var6];
            discarded$6 = param2.append('\n');
            for (var8 = 0; var8 <= param1; var8++) {
              discarded$8 = param2.append(' ');
            }
            if (var7 != null) {
              var7.a(param2, param1 + 1, param3, (byte) 110);
            } else {
              discarded$7 = param2.append("null");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("kl.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean a(int param0, qm param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        qm var5 = null;
        qm var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param2 != 9) {
            field_F = (String) null;
          }
          if (this.field_z == null) {
            return false;
          }
          var4_int = this.field_z.length - 1;
          while (var4_int >= 0) {
            var5 = this.field_z[var4_int];
            if (var5 != null &&
              var5.d(-2116)) {
              for (var4_int = var4_int - param0; var4_int >= 0; var4_int = var4_int - param0) {
                var6 = this.field_z[var4_int];
                if (var6 != null &&
                  var6.a(0, param1)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("kl.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    boolean a(int param0, qm param1) {
        int var4 = 0;
        qm[] var3 = null;
        RuntimeException var3_ref = null;
        qm var5 = null;
        int var6 = 0;
        qm[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var7 = this.field_z;
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
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("kl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(qm param0, int param1) {
        RuntimeException var3 = null;
        qm var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -8) {
            var4 = (qm) null;
            this.a((qm) null, 31, -110, 42);
          }
          stackIn_3_0 = this.a(1, param0, (byte) 9);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kl.OA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    kl(int param0, int param1, int param2, int param3, pf param4) {
        super(param0, param1, param2, param3, param4, (wc) null);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        qm var6;
        int var7;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 == param2 &&
          null != this.field_r) {
          this.field_r.a((qm) (this), 5592405, param1, param3, true);
        }
        if (null != this.field_z) {
          for (var5 = this.field_z.length - 1; 0 <= var5; var5--) {
            var6 = this.field_z[var5];
            if (var6 != null) {
              var6.a((byte) -112, param1 + this.field_n, param2, param3 + this.field_j);
            }
          }
        }
        if (param0 >= -52) {
          field_D = (String) null;
        }
    }

    private final qm a(int param0) {
        int var3 = 0;
        qm[] var2;
        qm var4;
        int var5;
        qm[] var6;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == this.field_z) {
          return null;
        }
        var6 = this.field_z;
        var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.d(-2116)) {
            return var4;
          }
        }
        return null;
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var6 = 0;
        qm[] var5 = null;
        qm var7 = null;
        int var8 = 0;
        qm[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_z == null) {
            return;
          }
          var9 = this.field_z;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(param0, param1 + this.field_n, 170, param3 + this.field_j);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("kl.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qm param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        qm var5 = null;
        qm var6 = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        qm var6Lifetime1;
        qm var6Lifetime2;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_z == null) {
            return false;
          }
          if (param0 != 29787) {
            field_A = 123;
          }
          var4_int = 0;
          while (var4_int < this.field_z.length) {
            var5 = this.field_z[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            if (null != var5 &&
              var5.d(param0 - 31903)) {
              for (var4_int = var4_int + param1; var4_int < this.field_z.length; var4_int = var4_int + param1) {
                var6Lifetime2 = this.field_z[var4_int];
                if (null != var6Lifetime2 &&
                  var6Lifetime2.a(0, param2)) {
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
          stackIn_24_1 = new StringBuilder().append("kl.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            var3 = (String) null;
            kl.a((String) null, -51);
          }
          stackIn_5_0 = (im.a(0, param0) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("kl.LA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int c(int param0) {
        int var4 = 0;
        int var2;
        qm[] var3;
        qm var5;
        int var7;
        int var6;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        var3 = this.field_z;
        for (var4 = param0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.c(0);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, (byte) -90, param2, param1)) {
            this.a(param0, param1, param2, 1);
            this.a(31115, param1, param0, param2);
          }
          var5_int = 76 % ((50 - param3) / 60);
          stackIn_3_0 = (StringBuilder) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("kl.FA(");
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        int var9 = 0;
        qm[] var8 = null;
        RuntimeException var8_ref = null;
        qm var10 = null;
        int var11 = 0;
        qm[] var12 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_z == null) {
            return false;
          }
          var12 = this.field_z;
          var8 = var12;
          for (var9 = param5; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.d(-2116) &&
              var10.a(param0, param1, param2, param3, param4, 0, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("kl.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        int var6 = 0;
        qm[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        qm var7 = null;
        int var8 = 0;
        qm[] var9 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_z == null) {
            return false;
          }
          var9 = this.field_z;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.d(-2116) &&
              var7.a(param0, (byte) -124, param2, param3)) {
              return true;
            }
          }
          var5_int = param3;
          if (var5_int != 80) {
            if (param1 < -120) {
              return false;
            }
            return true;
          }
          if (!ri.field_b[81]) {
            stackIn_16_0 = this.a((byte) -127, param0);
          } else {
            stackIn_16_0 = this.a(param0, -55);
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_24_0 = var5_ref;
          stackIn_24_1 = new StringBuilder().append("kl.N(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_D = null;
        field_F = null;
        if (param0 != -90) {
          field_C = (String) null;
        }
        field_y = null;
        field_G = null;
        field_C = null;
        field_x = null;
        field_E = null;
        field_B = null;
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        qm[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        qm var11 = null;
        int var12 = 0;
        qm[] var13 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (null == this.field_z) {
            return false;
          }
          var13 = this.field_z;
          var8 = var13;
          var9 = 0;
          var10 = -123 / ((-42 - param4) / 35);
          while (var9 < var13.length) {
            var11 = var13[var9];
            if (var11 != null &&
              var11.a(param0, param1, param2, this.field_j + param3, 34, param5, this.field_n + param6)) {
              return true;
            }
            var9++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("kl.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(byte param0, qm param1) {
        RuntimeException var3 = null;
        qm var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -126) {
            var4 = (qm) null;
            this.a(-118, 91, 35, -86, 59, 78, (qm) null);
          }
          stackIn_3_0 = this.a(29787, 1, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kl.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    abstract void e(int param0);

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        int var8 = 0;
        qm[] var7 = null;
        qm var9 = null;
        int var10 = 0;
        qm[] var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 != -20592) {
            field_D = (String) null;
          }
          if (null == this.field_z) {
            return;
          }
          var11 = this.field_z;
          var7 = var11;
          for (var8 = 0; var11.length > var8; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(param0, -20592, param2, this.field_j + param3, param4 + this.field_n, param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("kl.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final String b(boolean param0) {
        int var3 = 0;
        qm[] var2;
        qm var4;
        int var6;
        String var5;
        String var7;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == this.field_z) {
          return null;
        }
        var2 = this.field_z;
        for (var3 = 0; var2.length > var3; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.b(param0);
            if (var5 != null) {
              return var5;
            }
          }
        }
        if (!param0) {
          return null;
        }
        var7 = (String) null;
        kl.a((String) null, 33);
        return null;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
          return;
        }
        super.a(param0, param1, param2, param3, -57);
        this.e(106);
    }

    final boolean d(int param0) {
        if (param0 != -2116) {
          field_D = (String) null;
        }
        return null != this.a(0) ? true : false;
    }

    final void d(byte param0) {
        int var3 = 0;
        qm[] var2;
        qm var4;
        int var5;
        qm[] var7;
        qm var6;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var7 = this.field_z;
        var2 = var7;
        for (var3 = 0; var7.length > var3; var3++) {
          var4 = var7[var3];
          if (var4 != null) {
            var4.d((byte) 29);
          }
        }
        if (param0 != 29) {
          var6 = (qm) null;
          this.a(-1, (qm) null, (byte) -103);
        }
    }

    static {
        field_x = "Playing";
        field_y = "You require the '<%0>' Achievement to select this item";
        field_F = "  When summoning or increasing the power of your familiar you channel 20 of your health into it. The more life the familiar has the more powerful are the effects it provides. You can channel as much life as you wish each turn into it up to a maximum of 100 health.";
        field_B = new int[1024];
        field_D = "This game option is not available in rated games.";
    }
}
