/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    private Object[][] field_c;
    private Object[] field_b;
    private boolean field_a;
    static String field_e;
    private hl field_g;
    private int field_f;
    private pc field_d;

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(17820)) {
            return false;
          }
          param1 = param1.toLowerCase();
          if (param0 != 29) {
            ((long[]) (this.field_b[0]))[20] = -49L;
          }
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_d.field_h.b((byte) 60, wj.a(var4, 2148));
          stackIn_7_0 = this.a(false, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param0 + 17821)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (param0 != -1) {
            var4 = (String) null;
            this.a(((byte[]) (this.field_b[0]))[10], (String) null);
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var3_int = this.field_d.field_h.b((byte) 98, wj.a(var5, 2148));
          if (this.a(var3_int, 6447)) {
            return var3_int;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("kl.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -11986) {
            this.field_b = (Object[]) null;
          }
          if (!this.a(param0, 6447)) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_d.field_x[param0].b((byte) 80, wj.a(var5, 2148));
          if (this.a(var4_int, param0, true)) {
            stackIn_9_0 = var4_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("kl.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized boolean a(boolean param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        boolean stackIn_39_2 = false;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
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
        va var26 = null;
        byte[] var27 = null;
        va var29 = null;
        va var31 = null;
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
        var22 = wizardrun.field_H;
        try {
          if (param0) {
            ((long[]) (this.field_b[0]))[29] = 95L;
          }
          if (!this.a(param2, 6447)) {
            return false;
          }
          if (null == this.field_b[param2]) {
            return false;
          }
          var5_int = this.field_d.field_p[param2];
          var34 = this.field_d.field_w[param2];
          var24 = var34;
          var6 = var24;
          if (this.field_c[param2] == null) {
            array$0 = new Object[this.field_d.field_t[param2]];
            this.field_c[param2] = array$0;
          }
          var7 = this.field_c[param2];
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (null == var6) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
            }
            if (null != var7[var10]) {
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
            0 != param1[2] ||
            0 != param1[3])) {
            var35 = bh.a((byte) 104, this.field_b[param2], true);
            var25 = var35;
            var9 = var25;
            var26 = new va(var35);
            var26.a(param0, param1, 5, var26.field_k.length);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = bh.a((byte) 115, this.field_b[param2], false);
          }
          try {
            var36 = dg.a(var9, 31027);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_38_0 = var11_ref_RuntimeException;
            stackIn_38_1 = new StringBuilder();
            stackIn_39_2 = (param1 != null);
            throw bd.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(" ").append(param2).append(" ").append(var9.length).append(" ").append(bi.a(var9, 10510, var9.length)).append(" ").append(bi.a(var9, 10510, -2 + var9.length)).append(" ").append(this.field_d.field_q[param2]).append(" ").append(this.field_d.field_i).toString());
          }
          if (this.field_a) {
            this.field_b[param2] = null;
          }
          if (1 < var5_int) {
            if (this.field_f == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * var12 * var5_int;
              var29 = new va(var43);
              var14_int = 0;
              var15_int = 0;
              var29.field_m = var11;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.i(255);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (param3 == var19) {
                    var14_int = var14_int + var17;
                    var15_int = var19;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var44 = new byte[var14_int];
              var29.field_m = var11;
              var14_intLifetime1 = 0;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var18Lifetime3 < var12; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var29.i(255);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (param3 == var21) {
                    g.a(var43, var17Lifetime4, var44, var14_intLifetime1, var19Lifetime2);
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
            var11 = var11 - var5_int * var12Lifetime1 * 4;
            var31 = new va(var43);
            var39 = new int[var5_int];
            var32 = var39;
            var14 = var32;
            var31.field_m = var11;
            for (var15_intLifetime1 = 0; var12Lifetime1 > var15_intLifetime1; var15_intLifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var31.i(255);
                var14[var17Lifetime1] = var14[var17Lifetime1] + var16Lifetime1;
              }
            }
            var40 = new byte[var5_int][];
            var33 = var40;
            var15 = var33;
            for (var16Lifetime2 = 0; var16Lifetime2 < var5_int; var16Lifetime2++) {
              array$1 = new byte[var39[var16Lifetime2]];
              var15[var16Lifetime2] = array$1;
              var39[var16Lifetime2] = 0;
            }
            var31.field_m = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var17Lifetime2 < var12Lifetime1; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var19Lifetime1 < var5_int; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var31.i(255);
                g.a(var43, var16Lifetime3, var40[var19Lifetime1], var39[var19Lifetime1], var18Lifetime1);
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 != null) {
                var18Lifetime2 = var34[var17Lifetime3];
              } else {
                var18Lifetime2 = var17Lifetime3;
              }
              if (0 == this.field_f) {
                var7[var18Lifetime2] = pi.a(var40[var17Lifetime3], 0, false);
              } else {
                var7[var18Lifetime2] = var40[var17Lifetime3];
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.field_f != 0) {
              var7[var11] = var43;
            } else {
              var7[var11] = pi.a(var36, 0, false);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_107_0 = var5;
          stackIn_107_1 = new StringBuilder().append("kl.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        param1.addKeyListener(ff.field_H);
        if (param0 != 0) {
          return;
        }
        try {
          param1.addFocusListener(ff.field_H);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "kl.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized boolean d(int param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        var6 = wizardrun.field_H;
        if (!this.b(17820)) {
          return false;
        }
        var2 = -35 / ((param0 - 0) / 45);
        var3 = 1;
        for (var4 = 0; this.field_d.field_c.length > var4; var4++) {
          var5 = this.field_d.field_c[var4];
          if (this.field_b[var5] == null) {
            this.c(var5, -15053);
            if (this.field_b[var5] == null) {
              var3 = 0;
            }
          }
        }
        return var3 != 0;
    }

    private final synchronized boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
          field_e = (String) null;
        }
        if (!this.b(17820)) {
          return false;
        }
        if (param1 < 0 ||
          0 > param0 ||
          param1 >= this.field_d.field_t.length ||
          this.field_d.field_t[param1] <= param0) {
          if (v.field_a) {
            throw new IllegalArgumentException(param1 + " " + param0);
          }
          return false;
        }
        return true;
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object stackIn_4_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (param0 != 1) {
            this.field_g = (hl) null;
          }
          if (!this.a(param1, param3, true)) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          var5 = null;
          if ((this.field_c[param3] == null ||
            this.field_c[param3][param1] == null) && !this.a(false, param2, param3, param1)) {
            this.c(param3, -15053);
            if (!this.a(false, param2, param3, param1)) {
              stackIn_12_0 = null;
              return (byte[]) (stackIn_12_0);
            }
          }
          if (null == this.field_c[param3]) {
            throw new RuntimeException("");
          }
          if (this.field_c[param3][param1] != null) {
            var7 = bh.a((byte) 115, this.field_c[param3][param1], false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 == this.field_f) {
              this.field_c[param3][param1] = null;
              if (this.field_d.field_t[param3] == 1) {
                this.field_c[param3] = null;
              }
            } else {
              if (this.field_f == 2) {
                this.field_c[param3] = null;
              }
            }
          }
          stackIn_27_0 = var5;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("kl.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw bd.a((Throwable) (stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 != 17820) {
          return true;
        }
        if (this.field_d != null) {
          return true;
        }
        this.field_d = this.field_g.b(false);
        if (null == this.field_d) {
          return false;
        }
        this.field_b = new Object[this.field_d.field_s];
        this.field_c = new Object[this.field_d.field_s][];
        return true;
    }

    final boolean c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(17820)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_d.field_h.b((byte) 117, wj.a(var4, param0 ^ -2149));
          if (param0 >= ~var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kl.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int d(int param0, int param1) {
        if (!this.a(param1, 6447)) {
          return 0;
        }
        if (param0 > -81) {
          this.field_f = ((int[]) (this.field_b[1]))[2];
        }
        return this.field_d.field_t[param1];
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -66 / ((param0 + 18) / 54);
          if (!this.b(17820)) {
            return null;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_d.field_h.b((byte) 104, wj.a(var7, 2148));
          if (!this.a(var5, 6447)) {
            return null;
          }
          var8 = (CharSequence) ((Object) param1);
          var6 = this.field_d.field_x[var5].b((byte) 99, wj.a(var8, 2148));
          stackIn_7_0 = this.a(var6, var5, 1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("kl.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int param1) {
        if (!this.b(17820)) {
          return false;
        }
        if (param0 >= 0 &&
          param0 < this.field_d.field_t.length &&
          this.field_d.field_t[param0] != 0) {
          if (param1 == 6447) {
            return true;
          }
          return false;
        }
        if (v.field_a) {
          throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    final int a(int param0, String param1) {
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
          if (param0 != 0) {
            this.field_c = (Object[][]) null;
          }
          if (!this.b(17820)) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_d.field_h.b((byte) 102, wj.a(var4, 2148));
          stackIn_6_0 = this.b((byte) -72, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kl.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
          this.a(51, (String) null, (String) (((Object[]) (this.field_b[10]))[2]));
        }
        if (!this.b(17820)) {
          return -1;
        }
        return this.field_d.field_t.length;
    }

    final synchronized int b(byte param0, int param1) {
        if (!this.a(param1, 6447)) {
          return 0;
        }
        if (param0 >= -33) {
          return 44;
        }
        if (this.field_b[param1] != null) {
          return 100;
        }
        return this.field_g.a(false, param1);
    }

    final synchronized int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        java.awt.Component var6;
        int var4Lifetime1;
        var5 = wizardrun.field_H;
        if (!this.b(17820)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_b.length; var4++) {
          if (0 < this.field_d.field_p[var4]) {
            var2 += 100;
            var3 = var3 + this.b((byte) -95, var4);
          }
        }
        if (param0 != 75) {
          var6 = (java.awt.Component) null;
          kl.a(-90, (java.awt.Component) null);
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final synchronized byte[] a(byte param0, int param1) {
        if (!this.b(17820)) {
          return null;
        }
        if (this.field_d.field_t.length == 1) {
          return this.a(param1, 0, 1);
        }
        if (!this.a(param1, 6447)) {
          return null;
        }
        if (param0 >= -126) {
          return (byte[]) null;
        }
        if (this.field_d.field_t[param1] == 1) {
          return this.a(0, param1, 1);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param1 != -15053) {
          return;
        }
        if (!this.field_a) {
          this.field_b[param0] = pi.a(this.field_g.a((byte) -23, param0), 0, false);
        } else {
          this.field_b[param0] = this.field_g.a((byte) -22, param0);
        }
    }

    final static boolean a(char param0, boolean param1) {
        boolean stackIn_13_0 = false;
        if (!param1) {
          kl.a(18);
        }
        stackIn_13_0 = ((!(param0 < 48) &&
          !(param0 > 57)) ||
          (!(param0 < 65) &&
          !(param0 > 90)) ||
          (!(param0 < 97) &&
          !(param0 > 122)));
        return stackIn_13_0;
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(param1, param0, true)) {
          return false;
        }
        if (this.field_c[param0] != null &&
          null != this.field_c[param0][param1]) {
          return true;
        }
        if (null != this.field_b[param0]) {
          return true;
        }
        this.c(param0, param2 - 14987);
        if (this.field_b[param0] != null) {
          return true;
        }
        if (param2 != -66) {
          this.field_f = -125;
          return false;
        }
        return false;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(17820)) {
            return false;
          }
          if (param2 >= -125) {
            this.d(-13);
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_d.field_h.b((byte) 63, wj.a(var6, 2148));
          if (!this.a(var4_int, 6447)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_d.field_x[var4_int].b((byte) 89, wj.a(var7, 2148));
          stackIn_11_0 = this.a(var4_int, var5, (byte) -66);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("kl.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (param0) {
          ((byte[]) (this.field_b[7]))[1] = (byte) -124;
        }
        if (!this.a(param1, 6447)) {
          return false;
        }
        if (null != this.field_b[param1]) {
          return true;
        }
        this.c(param1, -15053);
        if (this.field_b[param1] != null) {
          return true;
        }
        return false;
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param2 != 1) {
          kl.a('\001', true);
        }
        return this.a(1, param0, (int[]) null, param1);
    }

    public static void a(int param0) {
        if (param0 != 22775) {
          field_e = (String) null;
        }
        field_e = null;
    }

    kl(hl param0, boolean param1, int param2) {
        this.field_d = null;
        try {
          if (param2 < 0 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_g = param0;
          this.field_a = param1 ? true : false;
          this.field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Orb points: <%0>";
    }
}
