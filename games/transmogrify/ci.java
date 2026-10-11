/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private ih field_c;
    static boolean[] field_g;
    private Object[][] field_d;
    static da field_f;
    private int field_e;
    private boolean field_a;
    private el field_b;
    private Object[] field_h;

    final int a(int param0, byte param1) {
        if (!this.b(14555, param0)) {
          return 0;
        }
        if (param1 < 71) {
          return 34;
        }
        return this.field_b.field_i[param0];
    }

    private final synchronized void a(int param0, int param1) {
        if (this.field_a) {
          this.field_h[param0] = this.field_c.a(param0, 119);
        } else {
          this.field_h[param0] = lf.a((byte) -43, false, this.field_c.a(param0, 57));
        }
        int var3 = 62 / ((-6 - param1) / 62);
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        int var4Lifetime1;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (!this.a((byte) -123)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_h.length > var4; var4++) {
          if (this.field_b.field_s[var4] > 0) {
            var3 = var3 + this.a(true, var4);
            var2 += 100;
          }
        }
        if (param0 != -22884) {
          var6 = (String) null;
          this.a(((byte[]) (((Object[]) (this.field_h[1]))[1]))[1], (String) null);
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final synchronized boolean a(byte param0) {
        if (param0 > -112) {
          this.a(5, (String) (this.field_h[3]));
        }
        if (null != this.field_b) {
          return true;
        }
        this.field_b = this.field_c.a(-110);
        if (this.field_b == null) {
          return false;
        }
        this.field_d = new Object[this.field_b.field_l][];
        this.field_h = new Object[this.field_b.field_l];
        return true;
    }

    final synchronized byte[] b(byte param0, int param1) {
        if (!this.a((byte) -118)) {
          return null;
        }
        if (1 == this.field_b.field_i.length) {
          return this.a((byte) -93, param1, 0);
        }
        if (!this.b(14555, param1)) {
          return null;
        }
        if (this.field_b.field_i[param1] == 1) {
          return this.a((byte) -93, 0, param1);
        }
        int var3 = 42 % ((param0 + 22) / 63);
        throw new RuntimeException();
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -128)) {
            return null;
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_b.field_h.a(gb.a(-14741, var6), false);
          if (!this.b(14555, var4_int)) {
            return null;
          }
          if (param1 <= 66) {
            field_f = (da) (this.field_h[3]);
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_b.field_t[var4_int].a(gb.a(-14741, var7), false);
          stackIn_9_0 = this.a((byte) -93, var5, var4_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ci.Q(");
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
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized boolean c(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (!this.a((byte) -117)) {
          return false;
        }
        var2 = 1;
        if (param0 != 32031) {
          return false;
        }
        for (var3 = 0; this.field_b.field_c.length > var3; var3++) {
          var4 = this.field_b.field_c[var3];
          if (this.field_h[var4] == null) {
            this.a(var4, param0 - 31917);
            if (null == this.field_h[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final int a(int param0, String param1, int param2) {
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
          if (!this.b(param0 + 14556, param2)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_b.field_t[param2].a(gb.a(-14741, var5), false);
          if (param0 != -1) {
            stackIn_5_0 = -93;
            return stackIn_5_0;
          }
          if (this.a(var4_int, (byte) 87, param2)) {
            return var4_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ci.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int a(boolean param0, int param1) {
        if (!param0) {
          this.a(((boolean[]) (this.field_h[0]))[12]);
        }
        if (!this.b(14555, param1)) {
          return 0;
        }
        if (this.field_h[param1] != null) {
          return 100;
        }
        return this.field_c.b(-42, param1);
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (qk.a(param0, (byte) -110)) {
            return true;
          }
          var6 = h.field_l;
          var2 = var6;
          for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (~param0 == ~var4) {
              return true;
            }
          }
          var2Lifetime1 = hf.field_k;
          var3Lifetime1 = param1;
          while (true) {
            if (var3Lifetime1 >= var2Lifetime1.length) {
              return false;
            }
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param0 != var4Lifetime1) {
              var3Lifetime1++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "ci.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.a((byte) -123)) {
          return false;
        }
        if (0 > param1 ||
          this.field_b.field_i.length <= param1 ||
          this.field_b.field_i[param1] == 0) {
          if (!uk.field_gb) {
            return false;
          }
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        if (param0 != 14555) {
          this.field_a = false;
          return true;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        boolean stackIn_36_2 = false;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
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
        oa var26 = null;
        byte[] var27 = null;
        oa var29 = null;
        oa var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14_intLifetime1;
        var22 = Transmogrify.field_A ? 1 : 0;
        try {
          if (!this.b(14555, param2)) {
            return false;
          }
          if (null == this.field_h[param2]) {
            return false;
          }
          var5_int = this.field_b.field_s[param2];
          var34 = this.field_b.field_f[param2];
          var24 = var34;
          var6 = var24;
          if (this.field_d[param2] == null) {
            array$0 = new Object[this.field_b.field_i[param2]];
            this.field_d[param2] = array$0;
          }
          var7 = this.field_d[param2];
          var8 = 1;
          for (var9_int = param3; var9_int < var5_int; var9_int++) {
            if (null != var6) {
              var10 = var34[var9_int];
            } else {
              var10 = var9_int;
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
          if (null != param1 && (param1[0] != 0 ||
            param1[1] != 0 ||
            param1[2] != 0 ||
            param1[3] != 0)) {
            var35 = cf.a(this.field_h[param2], true, (byte) 16);
            var25 = var35;
            var9 = var25;
            var26 = new oa(var35);
            var26.a(param1, false, 5, var26.field_g.length);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = cf.a(this.field_h[param2], false, (byte) 16);
          }
          try {
            var36 = lk.a(70, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_35_0 = var11_ref_RuntimeException;
            stackIn_35_1 = new StringBuilder();
            stackIn_36_2 = (param1 != null);
            throw ch.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(" ").append(param2).append(" ").append(var9.length).append(" ").append(v.a(var9, var9.length, (byte) 40)).append(" ").append(v.a(var9, var9.length - 2, (byte) 40)).append(" ").append(this.field_b.field_j[param2]).append(" ").append(this.field_b.field_r).toString());
          }
          if (this.field_a) {
            this.field_h[param2] = null;
          }
          if (var5_int > 1) {
            if (2 == this.field_e) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * var12 * var5_int;
              var29 = new oa(var43);
              var14_int = 0;
              var15_int = 0;
              var29.field_h = var11;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var29.c((byte) -107);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (var19 == param0) {
                    var15_int = var19;
                    var14_int = var14_int + var17;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var44 = new byte[var14_int];
              var14_intLifetime1 = 0;
              var29.field_h = var11;
              var17 = 0;
              for (var18 = 0; var12 > var18; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var29.c((byte) -110);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (param0 == var21) {
                    ji.a(var43, var17, var44, var14_intLifetime1, var19);
                    var14_intLifetime1 = var14_intLifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15_int] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * (var12 * var5_int);
              var31 = new oa(var43);
              var31.field_h = var11;
              var39 = new int[var5_int];
              var32 = var39;
              var14 = var32;
              for (var15_int = 0; var15_int < var12; var15_int++) {
                var16 = 0;
                for (var17 = 0; var5_int > var17; var17++) {
                  var16 = var16 + var31.c((byte) -106);
                  var14[var17] = var14[var17] + var16;
                }
              }
              var40 = new byte[var5_int][];
              var33 = var40;
              var15 = var33;
              for (var16 = 0; var16 < var5_int; var16++) {
                array$1 = new byte[var39[var16]];
                var15[var16] = array$1;
                var39[var16] = 0;
              }
              var31.field_h = var11;
              var16 = 0;
              for (var17 = 0; var17 < var12; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var31.c((byte) -119);
                  ji.a(var43, var16, var40[var19], var39[var19], var18);
                  var16 = var16 + var18;
                  var14[var19] = var14[var19] + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 != null) {
                  var18 = var34[var17];
                } else {
                  var18 = var17;
                }
                if (0 != this.field_e) {
                  var7[var18] = var40[var17];
                } else {
                  var7[var18] = lf.a((byte) -43, false, var40[var17]);
                }
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.field_e != 0) {
              var7[var11] = var36;
              return true;
            }
            var7[var11] = lf.a((byte) -43, false, var43);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_103_0 = var5;
          stackIn_103_1 = new StringBuilder().append("ci.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        if (!this.a((byte) -118)) {
          return false;
        }
        if (param1 <= 72) {
          String var5 = (String) null;
          this.a((byte) -97, (String) (this.field_h[2]), (String) null);
        }
        if (param2 < 0 ||
          0 > param0 ||
          this.field_b.field_i.length <= param2 ||
          this.field_b.field_i[param2] <= param0) {
          if (uk.field_gb) {
            throw new IllegalArgumentException(param2 + " " + param0);
          }
          return false;
        }
        return true;
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != -93) {
          return (byte[]) null;
        }
        return this.a(param1, param2, (int[]) null, param0 ^ 20);
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 88 / ((62 - param0) / 48);
          if (!this.a((byte) -117)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4 = this.field_b.field_h.a(gb.a(-14741, var5), false);
          stackIn_5_0 = this.a((byte) 107, var4);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ci.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        byte[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (param3 > -46) {
            stackIn_2_0 = (byte[]) (this.field_h[2]);
            return stackIn_2_0;
          }
          if (!this.a(param0, (byte) 88, param1)) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          var5 = null;
          if ((null == this.field_d[param1] ||
            this.field_d[param1][param0] == null) && !this.a(param0, param2, param1, 0)) {
            this.a(param1, -69);
            if (!this.a(param0, param2, param1, 0)) {
              stackIn_12_0 = null;
              return (byte[]) (stackIn_12_0);
            }
          }
          if (this.field_d[param1] == null) {
            throw new RuntimeException("");
          }
          if (this.field_d[param1][param0] != null) {
            var7 = cf.a(this.field_d[param1][param0], false, (byte) 16);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_e != 1) {
              if (this.field_e == 2) {
                this.field_d[param1] = null;
              }
            } else {
              this.field_d[param1][param0] = null;
              if (this.field_b.field_i[param1] == 1) {
                this.field_d[param1] = null;
              }
            }
          }
          stackIn_27_0 = var5;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ci.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ch.a((Throwable) (stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    final int[] a(boolean param0) {
        if (!this.a((byte) -114)) {
          return null;
        }
        if (param0) {
          return (int[]) null;
        }
        return this.field_b.field_c;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -119)) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_b.field_h.a(gb.a(-14741, var4), false);
          if (param0 != 0) {
            this.a(((int[]) (this.field_h[1]))[1], (String) (this.field_h[4]), -26);
          }
          stackIn_7_0 = this.a(true, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ci.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int a(int param0) {
        int var2 = 53 % ((52 - param0) / 32);
        if (!this.a((byte) -123)) {
          return -1;
        }
        return this.field_b.field_i.length;
    }

    final synchronized boolean a(byte param0, int param1) {
        if (!this.b(14555, param1)) {
          return false;
        }
        int var3 = 114 % ((param0 - 40) / 56);
        if (this.field_h[param1] != null) {
          return true;
        }
        this.a(param1, -124);
        if (null != this.field_h[param1]) {
          return true;
        }
        return false;
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 > -74) {
          ci.d(-75);
        }
        field_f = null;
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -115)) {
            return false;
          }
          param1 = param1.toLowerCase();
          if (param0 != -120) {
            stackIn_5_0 = ((boolean[]) (((Object[]) (this.field_h[10]))[0]))[4];
            return stackIn_5_0;
          }
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_b.field_h.a(gb.a(-14741, var4), false);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ci.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 17) {
            stackIn_2_0 = ((boolean[]) (this.field_h[0]))[3];
            return stackIn_2_0;
          }
          if (!this.a((byte) -116)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_b.field_h.a(gb.a(-14741, var6), false);
          if (!this.b(14555, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_b.field_t[var4_int].a(gb.a(-14741, var7), false);
          stackIn_11_0 = this.a(var5, 0, var4_int);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ci.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param0, (byte) 77, param2)) {
          return false;
        }
        if (null != this.field_d[param2] &&
          null != this.field_d[param2][param0]) {
          return true;
        }
        if (param1 != 0) {
          ((int[]) (((Object[]) (this.field_h[5]))[22]))[8] = ((int[]) (this.field_h[2]))[5];
        }
        if (null != this.field_h[param2]) {
          return true;
        }
        this.a(param2, -102);
        if (null != this.field_h[param2]) {
          return true;
        }
        return false;
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -113)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_b.field_h.a(gb.a(-14741, var4), false);
          if (!this.b(14555, var3_int)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (param0 >= 39) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = 17;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ci.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    ci(ih param0, boolean param1, int param2) {
        this.field_b = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_a = param1 ? true : false;
          this.field_c = param0;
          this.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = new boolean[8];
        field_g[4] = true;
        field_g[3] = true;
        field_g[2] = true;
        field_g[5] = true;
        field_g[6] = true;
    }
}
