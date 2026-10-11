/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private Object[][] field_b;
    private Object[] field_c;
    static boolean field_g;
    static go field_f;
    private boolean field_d;
    private kn field_a;
    static String field_h;
    static int[] field_j;
    private ff field_i;
    private int field_e;

    final static void a(boolean param0, vi param1, byte param2, int param3) {
        tf stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        vi stackIn_2_3;
        int stackIn_2_4;
        boolean stackIn_3_5 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_2_0 = ai.field_a;
          stackIn_2_1 = param3;
          stackIn_2_2 = 1000000;
          stackIn_2_3 = (vi) (param1);
          stackIn_2_4 = -114;
          stackIn_3_5 = !(param0);
          ((tf) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_2_2, stackIn_2_3, (byte) stackIn_2_4, stackIn_3_5, 256);
          if (param2 != 69) {
            field_h = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("gn.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int b(int param0) {
        if (param0 != -1) {
          this.e(-20, -90);
        }
        if (!this.b((byte) -95)) {
          return -1;
        }
        return this.field_a.field_k.length;
    }

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = HoldTheLine.field_D;
        if (!this.b((byte) -85)) {
          return 0;
        }
        var2 = param0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_c.length; var4++) {
          if (this.field_a.field_u[var4] > 0) {
            var3 = var3 + this.a(96, var4);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final int a(int param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            this.a((byte) -110, (String) (this.field_c[6]));
          }
          if (!this.c(-1, param0)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_a.field_c[param0].a(an.a(var5, 0), (byte) 24);
          if (this.a(var4_int, param0, 877)) {
            return var4_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("gn.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized boolean b(int[] param0, int param1, int param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        boolean stackIn_36_2 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
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
        th var26 = null;
        byte[] var27 = null;
        th var29 = null;
        th var31 = null;
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
        var22 = HoldTheLine.field_D;
        try {
          if (!this.c(-1, param3)) {
            return false;
          }
          if (null == this.field_c[param3]) {
            return false;
          }
          var5_int = this.field_a.field_u[param3];
          var34 = this.field_a.field_m[param3];
          var24 = var34;
          var6 = var24;
          if (null == this.field_b[param3]) {
            array$0 = new Object[this.field_a.field_k[param3]];
            this.field_b[param3] = array$0;
          }
          var7 = this.field_b[param3];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
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
          if (null != param0 && (param0[0] != 0 ||
            0 != param0[1] ||
            param0[2] != 0 ||
            param0[3] != 0)) {
            var35 = ne.a(90, this.field_c[param3], true);
            var25 = var35;
            var9 = var25;
            var26 = new th(var35);
            var26.a(5, var26.field_i.length, param1 ^ 12875, param0);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = ne.a(90, this.field_c[param3], false);
          }
          try {
            var36 = ph.a((byte) -1, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_35_0 = var11_ref_RuntimeException;
            stackIn_35_1 = new StringBuilder();
            stackIn_36_2 = (param0 != null);
            throw kk.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(" ").append(param3).append(" ").append(var9.length).append(" ").append(pg.a((byte) 120, var9, var9.length)).append(" ").append(pg.a((byte) 122, var9, var9.length - 2)).append(" ").append(this.field_a.field_e[param3]).append(" ").append(this.field_a.field_t).toString());
          }
          if (this.field_d) {
            this.field_c[param3] = null;
          }
          if (param1 > ~var5_int) {
            if (2 == this.field_e) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * (var12 * var5_int);
              var29 = new th(var43);
              var14_int = 0;
              var29.field_l = var11;
              var15_int = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.a(-50);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (param2 == var19) {
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
              var29.field_l = var11;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var18Lifetime3 < var12; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var29.a(91);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (param2 == var21) {
                    bc.a(var43, var17Lifetime4, var44, var14_intLifetime1, var19Lifetime2);
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
            var12Lifetime1 = var23[var11] & 255;
            var11 = var11 - 4 * var5_int * var12Lifetime1;
            var31 = new th(var43);
            var39 = new int[var5_int];
            var32 = var39;
            var14 = var32;
            var31.field_l = var11;
            for (var15_intLifetime1 = 0; var12Lifetime1 > var15_intLifetime1; var15_intLifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var5_int > var17Lifetime1; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var31.a(-83);
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
            var31.field_l = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var12Lifetime1 > var17Lifetime2; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var19Lifetime1 < var5_int; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var31.a(-107);
                bc.a(var43, var16Lifetime3, var40[var19Lifetime1], var39[var19Lifetime1], var18Lifetime1);
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 == null) {
                var18Lifetime2 = var17Lifetime3;
              } else {
                var18Lifetime2 = var34[var17Lifetime3];
              }
              if (0 != this.field_e) {
                var7[var18Lifetime2] = var40[var17Lifetime3];
              } else {
                var7[var18Lifetime2] = mg.a((byte) 112, var40[var17Lifetime3], false);
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_e == 0) {
              var7[var11] = mg.a((byte) 95, var43, false);
            } else {
              var7[var11] = var36;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("gn.R(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(String param0, String param1, int param2) {
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
          if (!this.b((byte) -49)) {
            return false;
          }
          if (param2 <= 0) {
            ((int[]) (this.field_c[15]))[2] = -38;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_a.field_h.a(an.a(var6, 0), (byte) 24);
          if (!this.c(-1, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_a.field_c[var4_int].a(an.a(var7, 0), (byte) 24);
          stackIn_11_0 = this.b(var4_int, var5, -1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("gn.DA(");
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
          throw kk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int a(int param0, int param1) {
        if (param0 <= 63) {
          return -15;
        }
        if (!this.c(-1, param1)) {
          return 0;
        }
        if (null != this.field_c[param1]) {
          return 100;
        }
        return this.field_i.a(false, param1);
    }

    final byte[] a(String param0, int param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -54)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param3 = param3.toLowerCase();
          param0 = param0.toLowerCase();
          var7 = (CharSequence) ((Object) param3);
          var5_int = this.field_a.field_h.a(an.a(var7, 0), (byte) 24);
          if (!this.c(-1, var5_int)) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          var8 = (CharSequence) ((Object) param0);
          var6 = this.field_a.field_c[var5_int].a(an.a(var8, param1), (byte) 24);
          stackIn_7_0 = this.a(param2, var6, var5_int, -4599);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("gn.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b((byte) -113)) {
          return false;
        }
        if (param2 != 877) {
          field_f = (go) null;
        }
        if (param1 < 0 ||
          0 > param0 ||
          param1 >= this.field_a.field_k.length ||
          param0 >= this.field_a.field_k[param1]) {
          if (uj.field_e) {
            throw new IllegalArgumentException(param1 + " " + param0);
          }
          return false;
        }
        return true;
    }

    final int a(byte param0, int param1) {
        if (param0 < 109) {
          String var4 = (String) null;
          this.a(-3, (String) null, true);
        }
        if (!this.c(-1, param1)) {
          return 0;
        }
        return this.field_a.field_k[param1];
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!this.b((byte) -94)) {
          return null;
        }
        if (param0 != 15950) {
          this.a(30, true, 45);
        }
        if (this.field_a.field_k.length == 1) {
          return this.a(0, true, param1);
        }
        if (!this.c(param0 - 15951, param1)) {
          return null;
        }
        if (this.field_a.field_k[param1] == 1) {
          return this.a(param1, true, 0);
        }
        throw new RuntimeException();
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -75)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          if (param2 != 23158) {
            this.field_d = true;
          }
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_a.field_h.a(an.a(var6, 0), (byte) 24);
          if (var4_int < 0) {
            return false;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_a.field_c[var4_int].a(an.a(var7, 0), (byte) 24);
          if (var5 >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gn.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized void e(int param0, int param1) {
        if (param1 < 68) {
          this.field_d = ((boolean[]) (this.field_c[2]))[3];
        }
        if (!this.field_d) {
          this.field_c[param0] = mg.a((byte) 106, this.field_i.a((byte) -83, param0), false);
        } else {
          this.field_c[param0] = this.field_i.a((byte) -95, param0);
        }
    }

    final synchronized boolean b(byte param0) {
        if (null == this.field_a) {
          this.field_a = this.field_i.a((byte) 74);
          if (null == this.field_a) {
            return false;
          }
          this.field_c = new Object[this.field_a.field_o];
          this.field_b = new Object[this.field_a.field_o][];
        }
        if (param0 > -45) {
          return ((boolean[]) (((Object[]) (((Object[]) (this.field_c[34]))[0]))[1]))[7];
        }
        return true;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -94)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_a.field_h.a(an.a(var4, param1), (byte) 24);
          stackIn_4_0 = this.a(param1 + 77, var3_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gn.T(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.c("", 3);
          if (-1 != var3_int) {
            stackIn_2_0 = this.a(param1, false, "");
            return stackIn_2_0;
          }
          var4 = 14 % ((-28 - param0) / 43);
          stackIn_4_0 = this.a("", false, param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gn.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        if (param0) {
          gn.a(false);
        }
        field_j = null;
    }

    private final synchronized boolean c(int param0, int param1) {
        if (!this.b((byte) -111)) {
          return false;
        }
        if (param1 >= 0 &&
          param1 < this.field_a.field_k.length &&
          this.field_a.field_k[param1] != 0) {
          if (param0 == -1) {
            return true;
          }
          ((long[]) (((Object[]) (this.field_c[28]))[0]))[4] = ((long[]) (this.field_c[0]))[1];
          return true;
        }
        if (uj.field_e) {
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final boolean a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -125)) {
            return false;
          }
          if (!param1) {
            this.field_a = (kn) (this.field_c[1]);
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_a.field_h.a(an.a(var4, 0), (byte) 24);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gn.O(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
          ((long[]) (this.field_c[2]))[0] = 92L;
        }
        return this.a((int[]) null, param2, param0, -4599);
    }

    final synchronized byte[] a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -71)) {
            return null;
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_a.field_h.a(an.a(var6, 0), (byte) 24);
          if (param1) {
            this.field_i = (ff) (((Object[]) (this.field_c[4]))[1]);
          }
          if (!this.c(-1, var4_int)) {
            stackIn_7_0 = null;
            return (byte[]) (stackIn_7_0);
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_a.field_c[var4_int].a(an.a(var7, 0), (byte) 24);
          stackIn_9_0 = this.a(var4_int, true, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("gn.W(");
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
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized boolean d(int param0, int param1) {
        int var3 = -14 / ((-30 - param1) / 46);
        if (!this.c(-1, param0)) {
          return false;
        }
        if (this.field_c[param0] != null) {
          return true;
        }
        this.e(param0, 89);
        if (this.field_c[param0] == null) {
          return false;
        }
        return true;
    }

    final boolean b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -91)) {
            return false;
          }
          var3_int = -1 % ((param1 + 19) / 59);
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var4 = this.field_a.field_h.a(an.a(var5, 0), (byte) 24);
          stackIn_4_0 = this.d(var4, 113);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gn.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
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
          if (param3 != -4599) {
            this.a((String) (this.field_c[1]), (String) (this.field_c[23]), ((int[]) (this.field_c[9]))[18]);
          }
          if (!this.a(param1, param2, param3 + 5476)) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          var5 = null;
          if ((this.field_b[param2] == null ||
            null == this.field_b[param2][param1]) && !this.b(param0, param3 ^ 4599, param1, param2)) {
            this.e(param2, param3 ^ -4515);
            if (!this.b(param0, -2, param1, param2)) {
              stackIn_12_0 = null;
              return (byte[]) (stackIn_12_0);
            }
          }
          if (null == this.field_b[param2]) {
            throw new RuntimeException("");
          }
          if (null != this.field_b[param2][param1]) {
            var7 = ne.a(90, this.field_b[param2][param1], false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_e != 1) {
              if (2 == this.field_e) {
                this.field_b[param2] = null;
              }
            } else {
              this.field_b[param2][param1] = null;
              if (this.field_a.field_k[param2] == 1) {
                this.field_b[param2] = null;
              }
            }
          }
          stackIn_27_0 = var5;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("gn.Q(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw kk.a((Throwable) (stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -84)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_a.field_h.a(an.a(var4, 0), (byte) 24);
          if (!this.c(-1, var3_int)) {
            stackIn_7_0 = -1;
            return stackIn_7_0;
          }
          if (param1 == 3) {
            stackIn_12_0 = var3_int;
            return stackIn_12_0;
          }
          stackIn_10_0 = -69;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("gn.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a(param1, param0, 877)) {
          return false;
        }
        if (null != this.field_b[param0] &&
          this.field_b[param0][param1] != null) {
          return true;
        }
        if (this.field_c[param0] != null) {
          return true;
        }
        this.e(param0, 83);
        if (param2 != -1) {
          this.a(-30, 89);
        }
        if (null == this.field_c[param0]) {
          return false;
        }
        return true;
    }

    final synchronized boolean a(byte param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        var6 = HoldTheLine.field_D;
        if (!this.b((byte) -100)) {
          return false;
        }
        var3 = -65 % ((8 - param0) / 57);
        var2 = 1;
        for (var4 = 0; this.field_a.field_n.length > var4; var4++) {
          var5 = this.field_a.field_n[var4];
          if (this.field_c[var5] == null) {
            this.e(var5, 112);
            if (this.field_c[var5] == null) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    gn(ff param0, boolean param1, int param2) {
        this.field_a = null;
        try {
          if (0 > param2 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_d = param1 ? true : false;
          this.field_e = param2;
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = false;
        field_h = "Speed";
        field_j = new int[]{5, 5, 2};
    }
}
