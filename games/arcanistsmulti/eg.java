/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    private Object[] field_c;
    private jk field_i;
    static int[] field_g;
    boolean field_h;
    static int[] field_a;
    private tl field_e;
    private Object[][] field_b;
    static String field_d;
    int field_f;

    private final synchronized boolean a(int param0, int[] param1, byte param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        boolean stackIn_38_2 = false;
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
        String var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        wk var27 = null;
        byte[] var28 = null;
        wk var30 = null;
        wk var32 = null;
        int[] var33 = null;
        byte[][] var34 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        byte[] var44 = null;
        byte[] var45 = null;
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
        var22 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!this.b(-127, param3)) {
            return false;
          }
          if (this.field_c[param3] == null) {
            return false;
          }
          var5_int = this.field_i.field_b[param3];
          var35 = this.field_i.field_e[param3];
          var25 = var35;
          var6 = var25;
          if (this.field_b[param3] == null) {
            array$0 = new Object[this.field_i.field_i[param3]];
            this.field_b[param3] = array$0;
          }
          var7 = this.field_b[param3];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
            if (null != var6) {
              var10 = var35[var9_int];
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
            var36 = td.a(this.field_c[param3], -128, true);
            var26 = var36;
            var9 = var26;
            var27 = new wk(var36);
            var27.a(param1, 5, var27.field_j.length, 127);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = td.a(this.field_c[param3], -19, false);
          }
          try {
            if (param2 < 73) {
              var23 = (String) null;
              this.a(false, (String) null);
            }
            var37 = hb.a(false, var9);
            var28 = var37;
            var24 = var28;
            var44 = var24;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_37_0 = var11_ref_RuntimeException;
            stackIn_37_1 = new StringBuilder();
            stackIn_38_2 = (param1 != null);
            throw aa.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(" ").append(param3).append(" ").append(var9.length).append(" ").append(mj.a(var9.length, (byte) -112, var9)).append(" ").append(mj.a(-2 + var9.length, (byte) -86, var9)).append(" ").append(this.field_i.field_h[param3]).append(" ").append(this.field_i.field_p).toString());
          }
          if (this.field_h) {
            this.field_c[param3] = null;
          }
          if (var5_int > 1) {
            if (this.field_f == 2) {
              var11 = var37.length;
              var11--;
              var12 = 255 & var24[var11];
              var11 = var11 - var5_int * (var12 * 4);
              var30 = new wk(var44);
              var14_int = 0;
              var15_int = 0;
              var30.field_g = var11;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var30.d(-10674);
                  if (var6 != null) {
                    var19 = var35[var18];
                  } else {
                    var19 = var18;
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
              var45 = new byte[var14_int];
              var30.field_g = var11;
              var14_intLifetime1 = 0;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var18Lifetime3 < var12; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var30.d(-10674);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var35[var20];
                  }
                  if (var21 == param0) {
                    sf.a(var44, var17Lifetime4, var45, var14_intLifetime1, var19Lifetime2);
                    var14_intLifetime1 = var14_intLifetime1 + var19Lifetime2;
                  }
                  var17Lifetime4 = var17Lifetime4 + var19Lifetime2;
                }
              }
              var7[var15_int] = var45;
              return true;
            }
            var11 = var37.length;
            var11--;
            var12Lifetime1 = 255 & var24[var11];
            var11 = var11 - var12Lifetime1 * var5_int * 4;
            var32 = new wk(var44);
            var40 = new int[var5_int];
            var33 = var40;
            var14 = var33;
            var32.field_g = var11;
            for (var15_intLifetime1 = 0; var12Lifetime1 > var15_intLifetime1; var15_intLifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var32.d(-10674);
                var14[var17Lifetime1] = var14[var17Lifetime1] + var16Lifetime1;
              }
            }
            var41 = new byte[var5_int][];
            var34 = var41;
            var15 = var34;
            for (var16Lifetime2 = 0; var5_int > var16Lifetime2; var16Lifetime2++) {
              array$1 = new byte[var40[var16Lifetime2]];
              var15[var16Lifetime2] = array$1;
              var40[var16Lifetime2] = 0;
            }
            var32.field_g = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var17Lifetime2 < var12Lifetime1; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var19Lifetime1 < var5_int; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var32.d(-10674);
                sf.a(var44, var16Lifetime3, var41[var19Lifetime1], var40[var19Lifetime1], var18Lifetime1);
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var17Lifetime3 < var5_int; var17Lifetime3++) {
              if (var6 == null) {
                var18Lifetime2 = var17Lifetime3;
              } else {
                var18Lifetime2 = var35[var17Lifetime3];
              }
              if (0 != this.field_f) {
                var7[var18Lifetime2] = var41[var17Lifetime3];
              } else {
                var7[var18Lifetime2] = bi.a(false, 0, var41[var17Lifetime3]);
              }
            }
          } else {
            if (var6 != null) {
              var11 = var35[0];
            } else {
              var11 = 0;
            }
            if (this.field_f == 0) {
              var7[var11] = bi.a(false, 0, var44);
            } else {
              var7[var11] = var37;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_105_0 = var5;
          stackIn_105_1 = new StringBuilder().append("eg.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(String param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(-98, param2)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          if (param1 <= 21) {
            stackIn_6_0 = -17;
            return stackIn_6_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var4_int = this.field_i.field_c[param2].a(ml.a(var5, -76), -140);
          if (this.a(var4_int, 0, param2)) {
            return var4_int;
          }
          stackIn_10_0 = -1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("eg.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        int var6;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.c(-10923)) {
          return false;
        }
        var2 = 1;
        var4 = 67 / ((param0 - 46) / 58);
        for (var3 = 0; this.field_i.field_r.length > var3; var3++) {
          var5 = this.field_i.field_r[var3];
          if (this.field_c[var5] == null) {
            this.c(var5, -126);
            if (null == this.field_c[var5]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final synchronized int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var6;
        int var5;
        int var4Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.c(-10923)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_c.length; var4++) {
          if (this.field_i.field_b[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.a(var4, -23760);
          }
        }
        if (0 == var2) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        var5 = -67 / ((param0 - 43) / 33);
        return var4Lifetime1;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.c(-10923)) {
          return false;
        }
        if (param2 >= param1 &&
          param0 >= 0 &&
          this.field_i.field_i.length > param2 &&
          param0 < this.field_i.field_i[param2]) {
          return true;
        }
        if (ji.field_d) {
          throw new IllegalArgumentException(param2 + " " + param0);
        }
        return false;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!this.b(-69, param1)) {
          return false;
        }
        if (this.field_c[param1] != null) {
          return true;
        }
        if (!param0) {
          eg.a(((boolean[]) (this.field_c[0]))[14]);
        }
        this.c(param1, -125);
        if (null != this.field_c[param1]) {
          return true;
        }
        return false;
    }

    final static void b(int param0) {
        if (param0 != 403300833) {
          field_a = (int[]) null;
        }
        int var1 = mb.j((byte) 19);
        int var2 = mo.b(25117);
        ol.field_f.a(-mj.field_r + bk.field_I, -tg.field_d + qe.field_o, -98, var1 + (mj.field_r << 1), (tg.field_d << 1) + var2);
        mn.d(-1);
    }

    final int b(byte param0) {
        if (param0 >= -44) {
          this.field_c = (Object[]) (((Object[]) (this.field_c[0]))[6]);
        }
        if (!this.c(-10923)) {
          return -1;
        }
        return this.field_i.field_i.length;
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b(-124, param0)) {
          return 0;
        }
        if (this.field_c[param0] != null) {
          return 100;
        }
        if (param1 != -23760) {
          this.field_i = (jk) (this.field_c[2]);
        }
        return this.field_e.a(param0, (byte) 124);
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!this.c(-10923)) {
          return null;
        }
        if (1 == this.field_i.field_i.length) {
          return this.b(param0, param1 - 5443, 0);
        }
        if (!this.b(-41, param0)) {
          return null;
        }
        if (param1 != 31662) {
          this.c((String) null, ((int[]) (this.field_c[0]))[16]);
        }
        if (this.field_i.field_i[param0] == 1) {
          return this.b(0, 26219, param0);
        }
        throw new RuntimeException();
    }

    final int a(int param0, byte param1) {
        if (param1 != -60) {
          this.field_c[1] = (Object) null;
        }
        if (!this.b(-35, param0)) {
          return 0;
        }
        return this.field_i.field_i[param0];
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.c(-10923)) {
          return false;
        }
        if (param1 >= 0 &&
          this.field_i.field_i.length > param1 &&
          this.field_i.field_i[param1] != 0) {
          if (param0 <= -27) {
          }
          return true;
        }
        if (ji.field_d) {
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final int c(String param0, int param1) {
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
          if (!this.c(-10923)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          var3_int = 94 % ((23 - param1) / 61);
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var4 = this.field_i.field_l.a(ml.a(var5, -83), -140);
          if (this.b(-106, var4)) {
            return var4;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("eg.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean c(int param0) {
        if (null == this.field_i) {
          this.field_i = this.field_e.d((byte) 122);
          if (this.field_i == null) {
            return false;
          }
          this.field_c = new Object[this.field_i.field_f];
          this.field_b = new Object[this.field_i.field_f][];
        }
        if (param0 != -10923) {
          return false;
        }
        return true;
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(-10923)) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param1 <= 79) {
            stackIn_6_0 = 91;
            return stackIn_6_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_i.field_l.a(ml.a(var4, 80), -140);
          stackIn_8_0 = this.a(var3_int, -23760);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("eg.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(boolean param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_13_0;
        boolean stackIn_13_3;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(-10923)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_i.field_l.a(ml.a(var6, 71), -140);
          if (!this.b(-43, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_i.field_c[var4_int].a(ml.a(var7, -78), -140);
          if (!param0) {
            return false;
          }
          stackIn_12_1 = var4_int;
          stackIn_12_2 = var5;
          if (param0) {
            stackIn_13_0 = this;
            stackIn_13_3 = false;
          } else {
            stackIn_13_0 = this;
            stackIn_13_3 = true;
          }
          stackIn_14_0 = this.a(stackIn_12_1, stackIn_12_2, stackIn_13_3);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("eg.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(-10923)) {
            return false;
          }
          if (param1 != -24417) {
            this.field_e = (tl) null;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_i.field_l.a(ml.a(var4, 82), -140);
          stackIn_6_0 = this.a(true, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("eg.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_g = null;
        if (param0) {
          eg.a(true);
        }
        field_a = null;
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != 26219) {
          this.a(-55, 23);
        }
        return this.a(param0, param2, -10452, (int[]) null);
    }

    final synchronized boolean a(int param0, int param1, boolean param2) {
        if (!this.a(param1, 0, param0)) {
          return false;
        }
        if (null != this.field_b[param0] &&
          this.field_b[param0][param1] != null) {
          return true;
        }
        if (param2) {
          this.field_e = (tl) null;
        }
        if (this.field_c[param0] != null) {
          return true;
        }
        this.c(param0, -125);
        if (null != this.field_c[param0]) {
          return true;
        }
        return false;
    }

    private final synchronized void c(int param0, int param1) {
        if (param1 >= -124) {
          return;
        }
        if (this.field_h) {
          this.field_c[param0] = this.field_e.a(param0, true);
        } else {
          this.field_c[param0] = bi.a(false, 0, this.field_e.a(param0, true));
        }
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        byte[] stackIn_5_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param0, 0, param1)) {
            return null;
          }
          if (param2 != -10452) {
            stackIn_5_0 = (byte[]) null;
            return stackIn_5_0;
          }
          var5 = null;
          if ((this.field_b[param1] == null ||
            null == this.field_b[param1][param0]) && !this.a(param0, param3, (byte) 80, param1)) {
            this.c(param1, -125);
            if (!this.a(param0, param3, (byte) 84, param1)) {
              return null;
            }
          }
          if (this.field_b[param1] == null) {
            throw new RuntimeException("");
          }
          if (null != this.field_b[param1][param0]) {
            var7 = td.a(this.field_b[param1][param0], param2 ^ -10399, false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_f == 1) {
              this.field_b[param1][param0] = null;
              if (this.field_i.field_i[param1] == 1) {
                this.field_b[param1] = null;
              }
            } else {
              if (this.field_f == 2) {
                this.field_b[param1] = null;
              }
            }
          }
          stackIn_27_0 = var5;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("eg.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw aa.a((Throwable) (stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(param2 - 10922)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_i.field_l.a(ml.a(var6, param2 ^ 79), -140);
          if (!this.b(-125, var4_int)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_i.field_c[var4_int].a(ml.a(var7, param2 - 123), -140);
          if (param2 == -1) {
            stackIn_10_0 = this.b(var5, 26219, var4_int);
            return stackIn_10_0;
          }
          stackIn_8_0 = (byte[]) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("eg.D(");
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
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(-10923)) {
            return false;
          }
          param1 = param1.toLowerCase();
          if (!param0) {
            this.a((String) (((Object[]) (((Object[]) (this.field_c[6]))[19]))[0]), (String) (this.field_c[2]), -82);
          }
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_i.field_l.a(ml.a(var4, 116), -140);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("eg.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (11 == fj.field_j) {
            pe.h(7807);
          }
          gi.a(ii.field_f, kl.field_C, af.field_Hb, (byte) -100);
          kn.a(param0, (byte) -112, 0, 0);
          if (param1 > -15) {
            var3 = (java.awt.Canvas) null;
            eg.a((java.awt.Canvas) null, (byte) -58);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("eg.P(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    eg(tl param0, boolean param1, int param2) {
        this.field_i = null;
        try {
          if (0 > param2 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_f = param2;
          this.field_h = param1 ? true : false;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "eg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = new int[]{2, 20, 21, 6, 5, 13};
        field_a = new int[8192];
        field_d = "Resign";
    }
}
