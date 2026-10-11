/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    private kl field_a;
    static int[] field_j;
    private Object[] field_c;
    static int field_b;
    private tf field_l;
    static int[][][] field_g;
    private boolean field_i;
    static qe[] field_n;
    private int field_m;
    private Object[][] field_p;
    static String field_k;
    static int field_e;
    static cf field_r;
    static ka[] field_h;
    static String field_d;
    static ka[] field_o;
    static ka field_f;
    static boolean field_q;

    final synchronized int a(int param0, byte param1) {
        if (param1 != 12) {
          return -38;
        }
        if (!this.a((byte) 27, param0)) {
          return 0;
        }
        if (this.field_c[param0] != null) {
          return 100;
        }
        return this.field_a.a(0, param0);
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
          if (!this.b(-7957)) {
            return false;
          }
          if (param0 != -39) {
            return true;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_l.field_p.a((byte) 90, wh.a((byte) 68, var4));
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("lj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!this.b(-7957)) {
          return null;
        }
        if (1 == this.field_l.field_g.length) {
          return this.c(0, param0, 0);
        }
        if (!this.a((byte) 27, param0)) {
          return null;
        }
        int var3 = 82 / ((param1 - 82) / 32);
        if (1 == this.field_l.field_g[param0]) {
          return this.c(param0, 0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (param0 <= 31) {
          return -78;
        }
        if (!this.b(-7957)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_c.length > var4; var4++) {
          if (this.field_l.field_e[var4] > 0) {
            var3 = var3 + this.a(var4, (byte) 12);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param2, param0, -122)) {
          return false;
        }
        if (null != this.field_p[param2] &&
          this.field_p[param2][param0] != null) {
          return true;
        }
        if (this.field_c[param2] != null) {
          return true;
        }
        int var4 = -107 % ((param1 + 23) / 56);
        this.b(param2, -124);
        if (this.field_c[param2] == null) {
          return false;
        }
        return true;
    }

    final boolean b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(-7957)) {
            return false;
          }
          param1 = param1.toLowerCase();
          if (param0 != 5) {
            var4 = (String) null;
            this.b(79, (String) null, (String) null);
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = this.field_l.field_p.a((byte) 126, wh.a((byte) 68, var5));
          stackIn_7_0 = this.a(true, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("lj.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!this.b(param0 - 7984)) {
          return false;
        }
        if (param0 != 27) {
          return true;
        }
        if (0 > param1 ||
          param1 >= this.field_l.field_g.length ||
          this.field_l.field_g[param1] == 0) {
          if (!vh.field_a) {
            return false;
          }
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        return true;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(-7957)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          var3_int = -64 % ((param1 + 10) / 36);
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var4 = this.field_l.field_p.a((byte) 116, wh.a((byte) 68, var5));
          if (this.a((byte) 27, var4)) {
            return var4;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("lj.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!param0) {
          return false;
        }
        if (!this.a((byte) 27, param1)) {
          return false;
        }
        if (null != this.field_c[param1]) {
          return true;
        }
        this.b(param1, -108);
        if (this.field_c[param1] != null) {
          return true;
        }
        return false;
    }

    final static String a(byte param0) {
        if (mf.field_a == null) {
          return "";
        }
        if (param0 > -70) {
          field_r = (cf) null;
        }
        return mf.field_a;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param0 - 7955)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param0 != -2) {
            stackIn_5_0 = (byte[]) null;
            return stackIn_5_0;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_l.field_p.a((byte) -39, wh.a((byte) 68, var6));
          if (!this.a((byte) 27, var4_int)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_l.field_s[var4_int].a((byte) 101, wh.a((byte) 68, var7));
          stackIn_10_0 = this.c(var4_int, var5, 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("lj.W(").append(param0).append(',');
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
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 != -7957) {
          this.a(((int[]) (this.field_c[1]))[2], -17, ((int[]) (this.field_c[3]))[1]);
        }
        if (null == this.field_l) {
          this.field_l = this.field_a.b(0);
          if (this.field_l == null) {
            return false;
          }
          this.field_p = new Object[this.field_l.field_r][];
          this.field_c = new Object[this.field_l.field_r];
        }
        return true;
    }

    private final synchronized void b(int param0, int param1) {
        if (this.field_i) {
          this.field_c[param0] = this.field_a.a(param0, (byte) -72);
        } else {
          this.field_c[param0] = ah.a(false, false, this.field_a.a(param0, (byte) -72));
        }
        int var3 = -73 / ((-26 - param1) / 43);
    }

    final boolean b(int param0, String param1, String param2) {
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
          if (!this.b(-7957)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_l.field_p.a((byte) -57, wh.a((byte) 68, var6));
          if (!this.a((byte) 27, var4_int)) {
            return false;
          }
          if (param0 >= -16) {
            this.a(((int[]) (this.field_c[4]))[6], ((int[]) (this.field_c[1]))[0]);
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_l.field_s[var4_int].a((byte) 87, wh.a((byte) 68, var7));
          stackIn_11_0 = this.a(var5, -109, var4_int);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("lj.A(").append(param0).append(',');
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
          throw oj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final int a(int param0, String param1) {
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
          if (!this.b(-7957)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_l.field_p.a((byte) -120, wh.a((byte) 68, var4));
          if (param0 < 99) {
            lj.a(30);
          }
          stackIn_6_0 = this.a(var3_int, (byte) 12);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("lj.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, byte param1, int[] param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        boolean stackIn_35_2 = false;
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
        uf var26 = null;
        byte[] var27 = null;
        uf var29 = null;
        uf var31 = null;
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
        var22 = TorChallenge.field_F ? 1 : 0;
        try {
          if (!this.a((byte) 27, param3)) {
            return false;
          }
          if (this.field_c[param3] == null) {
            return false;
          }
          var5_int = this.field_l.field_e[param3];
          var34 = this.field_l.field_A[param3];
          var24 = var34;
          var6 = var24;
          if (this.field_p[param3] == null) {
            array$0 = new Object[this.field_l.field_g[param3]];
            this.field_p[param3] = array$0;
          }
          var7 = this.field_p[param3];
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
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
          if (null != param2 && (param2[0] != 0 ||
            0 != param2[1] ||
            param2[2] != 0 ||
            param2[3] != 0)) {
            var35 = of.a((byte) 125, true, this.field_c[param3]);
            var25 = var35;
            var9 = var25;
            var26 = new uf(var35);
            var26.a(false, param2, var26.field_m.length, 5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = of.a((byte) -109, false, this.field_c[param3]);
          }
          try {
            var36 = pg.a(param1 - 1048551, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_34_0 = var11_ref_RuntimeException;
            stackIn_34_1 = new StringBuilder();
            stackIn_35_2 = (param2 != null);
            throw oj.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(" ").append(param3).append(" ").append(var9.length).append(" ").append(k.a(var9, var9.length, 0)).append(" ").append(k.a(var9, -2 + var9.length, 0)).append(" ").append(this.field_l.field_t[param3]).append(" ").append(this.field_l.field_k).toString());
          }
          if (this.field_i) {
            this.field_c[param3] = null;
          }
          if (var5_int > 1) {
            if (this.field_m == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * (var12 * var5_int);
              var29 = new uf(var43);
              var14_int = 0;
              var29.field_q = var11;
              var15_int = 0;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.i(param1 ^ -126);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (param0 == var19) {
                    var14_int = var14_int + var17;
                    var15_int = var19;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var44 = new byte[var14_int];
              var14_intLifetime1 = 0;
              var29.field_q = var11;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var29.i(28);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (param0 == var21) {
                    he.a(var43, var17, var44, var14_intLifetime1, var19);
                    var14_intLifetime1 = var14_intLifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15_int] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * (var12 * var5_int);
              var31 = new uf(var43);
              var39 = new int[var5_int];
              var32 = var39;
              var14 = var32;
              var31.field_q = var11;
              for (var15_int = 0; var12 > var15_int; var15_int++) {
                var16 = 0;
                for (var17 = 0; var5_int > var17; var17++) {
                  var16 = var16 + var31.i(param1 + 69);
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
              var31.field_q = var11;
              var16 = 0;
              for (var17 = 0; var17 < var12; var17++) {
                var18 = 0;
                for (var19 = 0; var5_int > var19; var19++) {
                  var18 = var18 + var31.i(42);
                  he.a(var43, var16, var40[var19], var39[var19], var18);
                  var16 = var16 + var18;
                  var14[var19] = var14[var19] + var18;
                }
              }
              for (var17 = 0; var5_int > var17; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (this.field_m == 0) {
                  var7[var18] = ah.a(false, false, var40[var17]);
                } else {
                  var7[var18] = var40[var17];
                }
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.field_m != 0) {
              var7[var11] = var43;
            } else {
              var7[var11] = ah.a(false, false, var36);
            }
          }
          if (param1 == -25) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_105_0 = var5;
          stackIn_105_1 = new StringBuilder().append("lj.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param3).append(')').toString());
        }
    }

    final int c(byte param0) {
        if (!this.b(-7957)) {
          return -1;
        }
        if (param0 != 52) {
          return -128;
        }
        return this.field_l.field_g.length;
    }

    final int a(int param0, int param1) {
        byte[] discarded$0 = null;
        if (!this.a((byte) 27, param0)) {
          return 0;
        }
        if (param1 >= -69) {
          int[] var4 = (int[]) null;
          discarded$0 = this.a((int[]) null, -124, -72, 97);
        }
        return this.field_l.field_g[param0];
    }

    final synchronized boolean b(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        Object stackIn_15_0 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (!this.b(-7957)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; this.field_l.field_y.length > var3; var3++) {
          var4 = this.field_l.field_y[var3];
          if (this.field_c[var4] == null) {
            this.b(var4, -92);
            if (null == this.field_c[var4]) {
              var2 = 0;
            }
          }
        }
        if (param0 != 79) {
          stackIn_15_0 = this.field_c[0];
          field_r = (cf) (stackIn_15_0);
        }
        return var2 != 0;
    }

    final int a(int param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 27, param0)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_l.field_s[param0].a((byte) 116, wh.a((byte) 68, var5));
          if (param2 < 81) {
            this.c((byte) 106);
          }
          if (this.b(param0, var4_int, -100)) {
            return var4_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("lj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        byte[] stackIn_5_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.b(param1, param3, -77)) {
            return null;
          }
          var5 = null;
          if (param2 > -22) {
            stackIn_5_0 = (byte[]) (this.field_c[14]);
            return stackIn_5_0;
          }
          if ((this.field_p[param1] == null ||
            this.field_p[param1][param3] == null) &&
            !this.a(param3, (byte) -25, param0, param1)) {
            this.b(param1, 121);
            if (!this.a(param3, (byte) -25, param0, param1)) {
              return null;
            }
          }
          if (this.field_p[param1] == null) {
            throw new RuntimeException("");
          }
          if (this.field_p[param1][param3] != null) {
            var7 = of.a((byte) -115, false, this.field_p[param1][param3]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_m == 1) {
              this.field_p[param1][param3] = null;
              if (this.field_l.field_g[param1] == 1) {
                this.field_p[param1] = null;
              }
            } else {
              if (this.field_m == 2) {
                this.field_p[param1] = null;
              }
            }
          }
          stackIn_28_0 = var5;
          return (byte[]) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("lj.H(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw oj.a((Throwable) (stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (!this.b(-7957)) {
          return false;
        }
        if (param2 >= -68) {
          discarded$0 = this.a(((int[]) (this.field_c[4]))[13], ((byte[]) (((Object[]) (this.field_c[2]))[0]))[10], (int[]) null, ((int[]) (this.field_c[4]))[0]);
        }
        if (param0 < 0 ||
          0 > param1 ||
          this.field_l.field_g.length <= param0 ||
          param1 >= this.field_l.field_g[param0]) {
          if (vh.field_a) {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
          return false;
        }
        return true;
    }

    final byte[] c(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param2 != 0) {
          discarded$0 = this.a(((byte[]) (((Object[]) (this.field_c[4]))[5]))[2], -70);
        }
        return this.a((int[]) null, param0, -62, param1);
    }

    lj(kl param0, boolean param1, int param2) {
        this.field_l = null;
        try {
          if (0 > param2 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_i = param1 ? true : false;
          this.field_m = param2;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        field_f = null;
        field_r = null;
        field_d = null;
        field_k = null;
        field_j = null;
        field_g = (int[][][]) null;
        field_h = null;
        if (param0 != 11446) {
          field_g = (int[][][]) null;
        }
    }

    static {
        field_b = 0;
        field_n = null;
        field_k = "Press <img=2> to exit the tower.";
        field_r = new cf();
        field_d = "Quit";
        field_q = true;
    }
}
