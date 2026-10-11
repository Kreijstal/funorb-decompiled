/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vj {
    private int field_i;
    private wd field_e;
    private boolean field_c;
    private Object[] field_h;
    private kh field_b;
    private Object[][] field_a;
    static sa field_d;
    static double[] field_f;
    static he[][] field_g;

    private final synchronized void a(byte param0, int param1) {
        if (param0 != 109) {
          return;
        }
        if (this.field_c) {
          this.field_h[param1] = this.field_e.b(param1, 60);
        } else {
          this.field_h[param1] = jk.a(false, this.field_e.b(param1, param0 - 49), (byte) -127);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 <= 125) {
          return 71;
        }
        if (!this.b(param0, (byte) 14)) {
          return 0;
        }
        return this.field_b.field_d[param0];
    }

    final synchronized boolean c(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!this.a(0)) {
          return false;
        }
        var2 = 1;
        var3 = 0;
        if (param0 < 16) {
          this.field_e = (wd) null;
        }
        while (var3 < this.field_b.field_r.length) {
          var4 = this.field_b.field_r[var3];
          if (this.field_h[var4] == null) {
            this.a((byte) 109, var4);
            if (null == this.field_h[var4]) {
              var2 = 0;
            }
          }
          var3++;
        }
        return var2 != 0;
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a(param0, param1, 0)) {
          return false;
        }
        int var4 = 18 % ((param2 - 13) / 42);
        if (this.field_a[param0] != null &&
          null != this.field_a[param0][param1]) {
          return true;
        }
        if (null != this.field_h[param0]) {
          return true;
        }
        this.a((byte) 109, param0);
        if (null != this.field_h[param0]) {
          return true;
        }
        return false;
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.b(param0, (byte) 14)) {
          return false;
        }
        if (this.field_h[param0] != null) {
          return true;
        }
        this.a((byte) 109, param0);
        if (null != this.field_h[param0]) {
          return true;
        }
        if (param1 != 29691) {
          return true;
        }
        return false;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        boolean stackIn_36_2 = false;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        od var26 = null;
        byte[] var27 = null;
        od var29 = null;
        od var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var12Lifetime1;
        int var15_intLifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var14_intLifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime4;
        int var18Lifetime3;
        int var19Lifetime2;
        var22 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (!this.b(param2, (byte) 14)) {
            return false;
          }
          if (this.field_h[param2] == null) {
            return false;
          }
          var5_int = this.field_b.field_k[param2];
          var34 = this.field_b.field_f[param2];
          var24 = var34;
          var6 = var24;
          if (this.field_a[param2] == null) {
            array$0 = new Object[this.field_b.field_d[param2]];
            this.field_a[param2] = array$0;
          }
          var7 = this.field_a[param2];
          var8 = param0 ? 1 : 0;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
            }
            if (var7[var10] != null) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3 != null && (param3[0] != 0 ||
            param3[1] != 0 ||
            0 != param3[2] ||
            param3[3] != 0)) {
            var35 = ji.a(23436, this.field_h[param2], true);
            var25 = var35;
            var9 = var25;
            var26 = new od(var35);
            var26.a(param3, true, 5, var26.field_h.length);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = ji.a(23436, this.field_h[param2], false);
          }
          try {
            var36 = ce.a(1, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_35_0 = var11_ref_RuntimeException;
            stackIn_35_1 = new StringBuilder();
            stackIn_36_2 = (param3 != null);
            throw ie.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(" ").append(param2).append(" ").append(var9.length).append(" ").append(th.a(var9, (byte) 127, var9.length)).append(" ").append(th.a(var9, (byte) 125, -2 + var9.length)).append(" ").append(this.field_b.field_j[param2]).append(" ").append(this.field_b.field_p).toString());
          }
          if (this.field_c) {
            this.field_h[param2] = null;
          }
          if (var5_int > 1) {
            if (this.field_i == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var12 * (var5_int * 4);
              var29 = new od(var43);
              var14_int = 0;
              var29.field_j = var11;
              var15_int = 0;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.h(43);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (param1 == var19) {
                    var14_int = var14_int + var17;
                    var15_int = var19;
                  }
                }
              }
              if (0 == var14_int) {
                return true;
              }
              var44 = new byte[var14_int];
              var29.field_j = var11;
              var14_intLifetime1 = 0;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var12 > var18Lifetime3; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var29.h(-90);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (param1 == var21) {
                    kg.a(var43, var17Lifetime4, var44, var14_intLifetime1, var19Lifetime2);
                    var14_intLifetime1 = var14_intLifetime1 + var19Lifetime2;
                  }
                  var17Lifetime4 = var17Lifetime4 + var19Lifetime2;
                }
              }
              var7[var15_int] = var44;
              return true;
            }
            var11 = var36.length;
            var11--;
            var12Lifetime1 = 255 & var23[var11];
            var11 = var11 - 4 * var12Lifetime1 * var5_int;
            var31 = new od(var43);
            var31.field_j = var11;
            var39 = new int[var5_int];
            var32 = var39;
            var14 = var32;
            for (var15_intLifetime1 = 0; var12Lifetime1 > var15_intLifetime1; var15_intLifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var5_int > var17Lifetime1; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var31.h(-103);
                var14[var17Lifetime1] = var14[var17Lifetime1] + var16Lifetime1;
              }
            }
            var40 = new byte[var5_int][];
            var33 = var40;
            var15 = var33;
            for (var16Lifetime2 = 0; var5_int > var16Lifetime2; var16Lifetime2++) {
              array$1 = new byte[var39[var16Lifetime2]];
              var15[var16Lifetime2] = array$1;
              var39[var16Lifetime2] = 0;
            }
            var31.field_j = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var12Lifetime1 > var17Lifetime2; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var19Lifetime1 < var5_int; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var31.h(-119);
                kg.a(var43, var16Lifetime3, var40[var19Lifetime1], var39[var19Lifetime1], var18Lifetime1);
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var17Lifetime3 < var5_int; var17Lifetime3++) {
              if (var6 == null) {
                var18Lifetime2 = var17Lifetime3;
              } else {
                var18Lifetime2 = var34[var17Lifetime3];
              }
              if (this.field_i != 0) {
                var7[var18Lifetime2] = var40[var17Lifetime3];
              } else {
                var7[var18Lifetime2] = jk.a(false, var40[var17Lifetime3], (byte) -124);
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (0 != this.field_i) {
              var7[var11] = var43;
            } else {
              var7[var11] = jk.a(false, var36, (byte) -122);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_105_0 = var5;
          stackIn_105_1 = new StringBuilder().append("vj.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(')').toString());
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(0)) {
            return false;
          }
          if (param0 != 255) {
            return false;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_b.field_s.a(ml.a((byte) -86, var4), param0 - 256);
          stackIn_7_0 = this.c(var3_int, 29691);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("vj.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param3, param0, param1 + 14080)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((this.field_a[param3] == null ||
            null == this.field_a[param3][param0]) && !this.a(true, param0, param3, param2)) {
            this.a((byte) 109, param3);
            if (!this.a(true, param0, param3, param2)) {
              return null;
            }
          }
          if (null == this.field_a[param3]) {
            throw new RuntimeException("");
          }
          if (null != this.field_a[param3][param0]) {
            var7 = ji.a(param1 ^ -28020, this.field_a[param3][param0], false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (param1 != -14080) {
            field_g = (he[][]) null;
          }
          if (var5 != null) {
            if (this.field_i == 1) {
              this.field_a[param3][param0] = null;
              if (this.field_b.field_d[param3] == 1) {
                this.field_a[param3] = null;
              }
            } else {
              if (2 == this.field_i) {
                this.field_a[param3] = null;
              }
            }
          }
          stackIn_26_0 = var5;
          return (byte[]) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("vj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ie.a((Throwable) (stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(0)) {
            return false;
          }
          param1 = param1.toLowerCase();
          if (param0 != 12) {
            this.a(-107, -32);
          }
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_b.field_s.a(ml.a((byte) -86, var4), -1);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("vj.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized boolean b(int param0, byte param1) {
        if (!this.a(0)) {
          return false;
        }
        if (param0 >= 0 &&
          this.field_b.field_d.length > param0 &&
          this.field_b.field_d[param0] != 0) {
          if (param1 == 14) {
            return true;
          }
          this.a((byte) 17, (String) null, ((int[]) (this.field_h[2]))[19]);
          return true;
        }
        if (!hm.field_f) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b(param1, (byte) 14)) {
          return 0;
        }
        if (null != this.field_h[param1]) {
          return 100;
        }
        int var3 = -97 / ((param0 + 44) / 48);
        return this.field_e.a(param1, -1);
    }

    final boolean a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -10) {
            var6 = (String) null;
            this.a((String) null, (String) null, 89);
          }
          if (!this.a(0)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param2 = param2.toLowerCase();
          var7 = (CharSequence) ((Object) param1);
          var4_int = this.field_b.field_s.a(ml.a((byte) -86, var7), -1);
          if (!this.b(var4_int, (byte) 14)) {
            return false;
          }
          var8 = (CharSequence) ((Object) param2);
          var5 = this.field_b.field_b[var4_int].a(ml.a((byte) -86, var8), -1);
          stackIn_10_0 = this.b(var4_int, var5, -52);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("vj.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_g = (he[][]) null;
        if (param0 != 0) {
          return;
        }
        field_d = null;
        field_f = null;
    }

    final synchronized int d(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!this.a(0)) {
          return 0;
        }
        var2 = 0;
        if (param0 != 95) {
          ((boolean[]) (this.field_h[1]))[3] = ((boolean[]) (this.field_h[3]))[1];
        }
        var3 = 0;
        for (var4 = 0; this.field_h.length > var4; var4++) {
          if (this.field_b.field_k[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.a(-100, var4);
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 != 35) {
          vj.e((byte) -62);
        }
        return this.a(param1, param2 - 14115, (int[]) null, param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param2 + param2)) {
          return false;
        }
        if (0 > param0 ||
          param1 < 0 ||
          this.field_b.field_d.length <= param0 ||
          this.field_b.field_d[param0] <= param1) {
          if (hm.field_f) {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
          return false;
        }
        return true;
    }

    final int b(int param0) {
        if (!this.a(0)) {
          return -1;
        }
        if (param0 != -16032) {
          ((byte[]) (this.field_h[1]))[8] = (byte) -39;
        }
        return this.field_b.field_d.length;
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(0)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param0 = param0.toLowerCase();
          if (param2 != 24874) {
            var6 = (String) null;
            this.a((byte) -82, (String) null, 10);
          }
          param1 = param1.toLowerCase();
          var7 = (CharSequence) ((Object) param0);
          var4_int = this.field_b.field_s.a(ml.a((byte) -86, var7), -1);
          if (!this.b(var4_int, (byte) 14)) {
            stackIn_7_0 = null;
            return (byte[]) (stackIn_7_0);
          }
          var8 = (CharSequence) ((Object) param1);
          var5 = this.field_b.field_b[var4_int].a(ml.a((byte) -86, var8), -1);
          stackIn_9_0 = this.a(var4_int, var5, (byte) 35);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("vj.E(");
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
          throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (!pf.a((byte) 97)) {
          return;
        }
        int var1 = 91 % ((param0 + 32) / 61);
        jk.a((byte) 49, false, 4);
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!this.a(0)) {
          return null;
        }
        if (this.field_b.field_d.length == 1) {
          return this.a(0, param0, (byte) 35);
        }
        if (!this.b(param0, (byte) 14)) {
          return null;
        }
        if (param1 == ~this.field_b.field_d[param0]) {
          return this.a(param0, 0, (byte) 35);
        }
        throw new RuntimeException();
    }

    final static mk a(byte param0) {
        mk var1 = new mk();
        int var2 = -124 % ((param0 + 13) / 44);
        var1.field_h = new int[1440000];
        return var1;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(0)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          if (param1 >= -75) {
            stackIn_6_0 = -83;
            return stackIn_6_0;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_s.a(ml.a((byte) -86, var4), -1);
          if (this.b(var3_int, (byte) 14)) {
            stackIn_11_0 = var3_int;
            return stackIn_11_0;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("vj.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var2_int = param0.length();
          if (param1 > -110) {
            vj.c(4);
          }
          var3 = new char[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[var2_int + (-1 - var4)] = param0.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("vj.U(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10461) {
            ((int[]) (this.field_h[9]))[0] = -80;
          }
          if (!this.a(0)) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_b.field_s.a(ml.a((byte) -86, var4), -1);
          stackIn_6_0 = this.a(-100, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vj.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = ge.a((byte) 88, false, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vj.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0) {
        if (null == this.field_b) {
          this.field_b = this.field_e.a((byte) -116);
          if (this.field_b == null) {
            return false;
          }
          this.field_a = new Object[this.field_b.field_m][];
          this.field_h = new Object[this.field_b.field_m];
        }
        if (param0 != 0) {
          ((long[]) (this.field_h[6]))[10] = ((long[]) (((Object[]) (this.field_h[16]))[3]))[2];
          return true;
        }
        return true;
    }

    final int a(byte param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param2, (byte) 14)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          if (param0 >= -26) {
            stackIn_5_0 = -38;
            return stackIn_5_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_b.field_b[param2].a(ml.a((byte) -86, var5), -1);
          if (this.a(param2, var4_int, 0)) {
            return var4_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("vj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int e(byte param0) {
        try {
          int stackIn_12_0 = 0;
          int stackIn_24_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_34_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          CharSequence var2 = null;
          od var3 = null;
          if (4 <= p.field_a.field_c) {
            if (p.field_a.field_h == -1) {
              return 3;
            }
            if (-2 == p.field_a.field_h) {
              return 4;
            }
            return 1;
          }
          try {
            if (hf.field_C == 0) {
              tc.field_e = oi.field_e.a(g.field_r, j.field_ib, 35);
              hf.field_C = hf.field_C + 1;
            }
            if (hf.field_C == 1) {
              if (tc.field_e.field_b == 2) {
                stackIn_12_0 = uj.a((byte) 85, -1);
                return stackIn_12_0;
              }
              if (tc.field_e.field_b == 1) {
                hf.field_C = hf.field_C + 1;
              }
            }
            if (hf.field_C == 2) {
              ea.field_a = new qe((java.net.Socket) (tc.field_e.field_g), oi.field_e);
              var3 = new od(13);
              q.a(tb.field_a, gi.field_c, 26800, pk.field_q, var3);
              var3.c(15, (byte) -92);
              var3.a(mi.field_j, (byte) 107);
              ea.field_a.a(13, -30537, var3.field_h, 0);
              hf.field_C = hf.field_C + 1;
              pf.field_a = la.a(false) + 30000L;
            }
            if (3 == hf.field_C) {
              if (0 < ea.field_a.a((byte) 41)) {
                var1_int = ea.field_a.a(-125);
                if (var1_int != 0) {
                  stackIn_27_0 = uj.a((byte) 85, var1_int);
                  return stackIn_27_0;
                }
                hf.field_C = hf.field_C + 1;
              } else {
                if (pf.field_a < la.a(false)) {
                  stackIn_24_0 = uj.a((byte) 85, -2);
                  return stackIn_24_0;
                }
              }
            }
            if (param0 >= -28) {
              var2 = (CharSequence) null;
              vj.a(true, (CharSequence) null);
            }
            if (hf.field_C != 4) {
              return -1;
            }
            p.field_a.a(ea.field_a, uf.field_i, (byte) -102);
            ea.field_a = null;
            hf.field_C = 0;
            tc.field_e = null;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return uj.a((byte) 85, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    vj(wd param0, boolean param1, int param2) {
        this.field_b = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_e = param0;
          this.field_c = param1 ? true : false;
          this.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "vj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new sa(15, 0, 1, 0);
        field_f = new double[2];
        field_g = new he[77][];
    }
}
