/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cn {
    static String field_c;
    static jpa field_h;
    boolean field_g;
    private dla field_i;
    static String field_e;
    static int field_k;
    static int field_b;
    private Object[][] field_l;
    static String field_f;
    int field_j;
    private dr field_d;
    private Object[] field_a;

    final boolean b(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param1 ^ -44)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 != 2) {
            this.a(((boolean[]) (((Object[]) (this.field_a[4]))[5]))[6], 76, -83);
          }
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_i.field_b.a(vta.a(var6, -12754), 1);
          if (!this.b(-1, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
          stackIn_10_0 = this.a(var4_int, (byte) -126, var5);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("cn.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_h = null;
        field_f = null;
        field_e = null;
        field_c = null;
        if (param0 != 0) {
          cn.e(22);
        }
    }

    final synchronized int a(int param0, byte param1) {
        if (!this.b(-1, param0)) {
          return 0;
        }
        if (null != this.field_a[param0]) {
          return 100;
        }
        if (param1 <= 108) {
          return -36;
        }
        return this.field_d.b(27079, param0);
    }

    final synchronized int a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.b(-90)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_a.length > var4; var4++) {
          if (0 < this.field_i.field_c[var4]) {
            var2 += 100;
            var3 = var3 + this.a(var4, (byte) 118);
          }
        }
        if (!param0) {
          return -39;
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(-123)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 <= 80) {
            var4 = (String) null;
            this.a((String) null, true);
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = this.field_i.field_b.a(vta.a(var5, -12754), 1);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("cn.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(int param0) {
        sla.b(29585);
        if (param0 != 19470) {
          cn.e(46);
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 > -30) {
          this.a(((int[]) (this.field_a[0]))[3], (byte) -61, 31);
        }
        if (null == this.field_i) {
          this.field_i = this.field_d.a(true);
          if (this.field_i == null) {
            return false;
          }
          this.field_l = new Object[this.field_i.field_l][];
          this.field_a = new Object[this.field_i.field_l];
        }
        return true;
    }

    final synchronized boolean a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.b(param0 - 86)) {
          return false;
        }
        var2 = 1;
        for (var3 = param0; this.field_i.field_k.length > var3; var3++) {
          var4 = this.field_i.field_k[var3];
          if (this.field_a[var4] == null) {
            this.c(param0 + 22214, var4);
            if (null == this.field_a[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int var4 = 26 % ((-23 - param0) / 48);
        return param1 / (param2 / (1 << param3));
    }

    final int a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(-1, param2)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (!param0) {
            ((boolean[]) (this.field_a[2]))[0] = ((boolean[]) (this.field_a[11]))[0];
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_i.field_e[param2].a(vta.a(var5, -12754), 1);
          if (this.a(param2, var4_int, (byte) -75)) {
            stackIn_9_0 = var4_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("cn.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean e(int param0, int param1) {
        if (!this.b(-1, param0)) {
          return false;
        }
        if (null != this.field_a[param0]) {
          return true;
        }
        if (param1 != -2) {
          this.a(((boolean[]) (this.field_a[20]))[1]);
        }
        this.c(22214, param0);
        if (this.field_a[param0] != null) {
          return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.b(-71)) {
          return false;
        }
        if (this.field_i.field_p.length == 1) {
          return this.a(0, (byte) -127, param1);
        }
        if (!this.b(-1, param1)) {
          return false;
        }
        if (param0 != -15121) {
          return ((boolean[]) (this.field_a[6]))[1];
        }
        if (this.field_i.field_p[param1] == 1) {
          return this.a(param1, (byte) -80, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 != 22214) {
          return;
        }
        if (this.field_g) {
          this.field_a[param1] = this.field_d.a(param1, (byte) -39);
        } else {
          this.field_a[param1] = bw.a(270, this.field_d.a(param1, (byte) -39), false);
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        int var10_int = 0;
        int var21 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        boolean stackIn_36_2 = false;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        uia var27 = null;
        byte[] var28 = null;
        uia var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        uia var33 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int var13Lifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var15Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime4;
        int var19Lifetime3;
        int var20Lifetime2;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.b(-1, param0)) {
            return false;
          }
          if (null == this.field_a[param0]) {
            return false;
          }
          var5_int = this.field_i.field_c[param0];
          var35 = this.field_i.field_n[param0];
          var25 = var35;
          var6 = var25;
          if (null == this.field_l[param0]) {
            array$0 = new Object[this.field_i.field_p[param0]];
            this.field_l[param0] = array$0;
          }
          var9 = -97 / ((-45 - param3) / 57);
          var7 = this.field_l[param0];
          var8 = 1;
          for (var10_int = 0; var10_int < var5_int; var10_int++) {
            if (null == var6) {
              var11 = var10_int;
            } else {
              var11 = var35[var10_int];
            }
            if (null != var7[var11]) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != param1 && (param1[0] != 0 ||
            param1[1] != 0 ||
            param1[2] != 0 ||
            param1[3] != 0)) {
            var36 = ir.a(this.field_a[param0], 13588, true);
            var26 = var36;
            var10 = var26;
            var27 = new uia(var36);
            var27.a(var27.field_g.length, -84984444, param1, 5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var10 = ir.a(this.field_a[param0], 13588, false);
          }
          try {
            var37 = sua.a(var10, -101);
            var28 = var37;
            var24 = var28;
            var44 = var24;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var12_ref_RuntimeException = decompiledCaughtException;
            stackIn_35_0 = var12_ref_RuntimeException;
            stackIn_35_1 = new StringBuilder();
            stackIn_36_2 = (param1 != null);
            throw tba.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(" ").append(param0).append(" ").append(var10.length).append(" ").append(sq.a(var10.length, var10, (byte) -103)).append(" ").append(sq.a(-2 + var10.length, var10, (byte) -99)).append(" ").append(this.field_i.field_j[param0]).append(" ").append(this.field_i.field_d).toString());
          }
          if (this.field_g) {
            this.field_a[param0] = null;
          }
          if (var5_int > 1) {
            if (this.field_j == 2) {
              var12 = var37.length;
              var12--;
              var13 = var24[var12] & 255;
              var12 = var12 - 4 * (var5_int * var13);
              var33 = new uia(var44);
              var15 = 0;
              var33.field_h = var12;
              var16 = 0;
              for (var17 = 0; var17 < var13; var17++) {
                var18 = 0;
                for (var19 = 0; var5_int > var19; var19++) {
                  var18 = var18 + var33.e(118);
                  if (var6 == null) {
                    var20 = var19;
                  } else {
                    var20 = var35[var19];
                  }
                  if (var20 == param2) {
                    var16 = var20;
                    var15 = var15 + var18;
                  }
                }
              }
              if (var15 == 0) {
                return true;
              }
              var45 = new byte[var15];
              var33.field_h = var12;
              var15Lifetime1 = 0;
              var18Lifetime4 = 0;
              for (var19Lifetime3 = 0; var13 > var19Lifetime3; var19Lifetime3++) {
                var20Lifetime2 = 0;
                for (var21 = 0; var5_int > var21; var21++) {
                  var20Lifetime2 = var20Lifetime2 + var33.e(-14);
                  if (var6 != null) {
                    var22 = var35[var21];
                  } else {
                    var22 = var21;
                  }
                  if (var22 == param2) {
                    lua.a(var44, var18Lifetime4, var45, var15Lifetime1, var20Lifetime2);
                    var15Lifetime1 = var15Lifetime1 + var20Lifetime2;
                  }
                  var18Lifetime4 = var18Lifetime4 + var20Lifetime2;
                }
              }
              var7[var16] = var45;
              return true;
            }
            var12 = var37.length;
            var12--;
            var13Lifetime1 = var24[var12] & 255;
            var12 = var12 - var13Lifetime1 * var5_int * 4;
            var30 = new uia(var44);
            var39 = new int[var5_int];
            var31 = var39;
            var15_ref_int__ = var31;
            var30.field_h = var12;
            for (var16Lifetime1 = 0; var16Lifetime1 < var13Lifetime1; var16Lifetime1++) {
              var17Lifetime1 = 0;
              for (var18Lifetime1 = 0; var18Lifetime1 < var5_int; var18Lifetime1++) {
                var17Lifetime1 = var17Lifetime1 + var30.e(101);
                var15_ref_int__[var18Lifetime1] = var15_ref_int__[var18Lifetime1] + var17Lifetime1;
              }
            }
            var40 = new byte[var5_int][];
            var32 = var40;
            var16_ref_byte____ = var32;
            for (var17Lifetime2 = 0; var5_int > var17Lifetime2; var17Lifetime2++) {
              array$1 = new byte[var39[var17Lifetime2]];
              var16_ref_byte____[var17Lifetime2] = array$1;
              var39[var17Lifetime2] = 0;
            }
            var30.field_h = var12;
            var17Lifetime3 = 0;
            for (var18Lifetime2 = 0; var13Lifetime1 > var18Lifetime2; var18Lifetime2++) {
              var19Lifetime1 = 0;
              for (var20Lifetime1 = 0; var20Lifetime1 < var5_int; var20Lifetime1++) {
                var19Lifetime1 = var19Lifetime1 + var30.e(-98);
                lua.a(var44, var17Lifetime3, var40[var20Lifetime1], var39[var20Lifetime1], var19Lifetime1);
                var17Lifetime3 = var17Lifetime3 + var19Lifetime1;
                var15_ref_int__[var20Lifetime1] = var15_ref_int__[var20Lifetime1] + var19Lifetime1;
              }
            }
            for (var18Lifetime3 = 0; var5_int > var18Lifetime3; var18Lifetime3++) {
              if (var6 != null) {
                var19Lifetime2 = var35[var18Lifetime3];
              } else {
                var19Lifetime2 = var18Lifetime3;
              }
              if (this.field_j != 0) {
                var7[var19Lifetime2] = var40[var18Lifetime3];
              } else {
                var7[var19Lifetime2] = bw.a(270, var40[var18Lifetime3], false);
              }
            }
          } else {
            if (var6 != null) {
              var12 = var35[0];
            } else {
              var12 = 0;
            }
            if (this.field_j != 0) {
              var7[var12] = var44;
            } else {
              var7[var12] = bw.a(270, var37, false);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("cn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 != 4) {
          this.field_a[4] = ((Object[]) (this.field_a[0]))[5];
        }
        if (!this.b(-44)) {
          return -1;
        }
        return this.field_i.field_p.length;
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        int var4;
        if (!this.b(-74)) {
          return false;
        }
        if (param0 >= 0 &&
          param1 >= 0 &&
          param0 < this.field_i.field_p.length &&
          param1 < this.field_i.field_p[param0]) {
          var4 = 9 % ((23 - param2) / 61);
          return true;
        }
        if (nl.field_b) {
          throw new IllegalArgumentException(param0 + " " + param1);
        }
        return false;
    }

    final synchronized int[] d(int param0, int param1) {
        int[] var7 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (!this.b(-1, param1)) {
          return null;
        }
        int var3 = 121 % ((param0 + 15) / 58);
        int[] var4 = this.field_i.field_n[param1];
        if (var4 == null) {
          var7 = new int[this.field_i.field_c[param1]];
          var4 = var7;
          for (var5 = 0; var5 < var7.length; var5++) {
            var7[var5] = var5;
          }
        }
        return var4;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(-89)) {
            return false;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_i.field_b.a(vta.a(var6, -12754), 1);
          if (var4_int < param2) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
          if (0 <= var5) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("cn.O(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized byte[] f(int param0, int param1) {
        if (!this.b(-63)) {
          return null;
        }
        if (this.field_i.field_p.length == 1) {
          return this.a(false, 0, param0);
        }
        if (!this.b(-1, param0)) {
          return null;
        }
        if (this.field_i.field_p[param0] == 1) {
          return this.a(false, param0, 0);
        }
        int var3 = -8 / ((50 - param1) / 42);
        throw new RuntimeException();
    }

    final static int a(byte param0) {
        if (param0 < 53) {
          return 20;
        }
        return 1900 + new Date().getYear();
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(-93)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          if (param1 != -7768) {
            stackIn_5_0 = 61;
            return stackIn_5_0;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_i.field_b.a(vta.a(var4, -12754), param1 ^ -7767);
          if (this.b(param1 ^ 7767, var3_int)) {
            return var3_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("cn.P(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(-108)) {
            return false;
          }
          if (param1 >= -121) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_i.field_b.a(vta.a(var4, -12754), 1);
          stackIn_8_0 = this.e(var3_int, -2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("cn.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(-31)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param0 = param0.toLowerCase();
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_i.field_b.a(vta.a(var6, -12754), 1);
          if (!this.b(-1, var4_int)) {
            return null;
          }
          if (param1 <= 112) {
            this.a(((int[]) (this.field_a[12]))[21]);
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
          stackIn_9_0 = this.a(false, var4_int, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("cn.DA(");
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
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!this.a(param0, param2, (byte) -97)) {
          return false;
        }
        if (null != this.field_l[param0] &&
          this.field_l[param0][param2] != null) {
          return true;
        }
        if (this.field_a[param0] != null) {
          return true;
        }
        this.c(22214, param0);
        if (this.field_a[param0] != null) {
          return true;
        }
        if (param1 >= -70) {
          this.a(false, (String) (this.field_a[14]), ((int[]) (((Object[]) (this.field_a[14]))[3]))[2]);
          return false;
        }
        return false;
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        byte[] stackIn_2_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!param1) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          if (!this.a(param3, param0, (byte) 92)) {
            return null;
          }
          var5 = null;
          if ((null == this.field_l[param3] ||
            this.field_l[param3][param0] == null) && !this.a(param3, param2, param0, -122)) {
            this.c(22214, param3);
            if (!this.a(param3, param2, param0, 43)) {
              stackIn_13_0 = null;
              return (byte[]) (stackIn_13_0);
            }
          }
          if (this.field_l[param3] == null) {
            throw new RuntimeException("");
          }
          if (this.field_l[param3][param0] != null) {
            var7 = ir.a(this.field_l[param3][param0], 13588, false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_j == 1) {
              this.field_l[param3][param0] = null;
              if (1 == this.field_i.field_p[param3]) {
                this.field_l[param3] = null;
              }
            } else {
              if (this.field_j == 2) {
                this.field_l[param3] = null;
              }
            }
          }
          stackIn_30_0 = var5;
          return (byte[]) (stackIn_30_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("cn.FA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) (stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        if (!this.b(-1, param1)) {
          return 0;
        }
        int var3 = -70 % ((param0 - 3) / 53);
        return this.field_i.field_p[param1];
    }

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(-124)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (!param1) {
            this.field_j = -49;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_i.field_b.a(vta.a(var4, -12754), 1);
          stackIn_6_0 = this.a(var3_int, (byte) 119);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("cn.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.b(-80)) {
          return false;
        }
        if (~param1 > param0 ||
          param1 >= this.field_i.field_p.length ||
          this.field_i.field_p[param1] == 0) {
          if (!nl.field_b) {
            return false;
          }
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        return true;
    }

    final byte[] a(boolean param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0) {
          discarded$0 = this.b(((int[]) (this.field_a[11]))[23], 94);
        }
        return this.a(param2, true, (int[]) null, param1);
    }

    cn(dr param0, boolean param1, int param2) {
        this.field_i = null;
        try {
          if (0 > param2 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_j = param2;
          this.field_d = param0;
          this.field_g = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_k = -1;
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = "End Game";
        field_f = "Low";
    }
}
