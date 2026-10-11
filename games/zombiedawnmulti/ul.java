/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    int field_b;
    static ip field_n;
    static String[][] field_m;
    boolean field_j;
    private Object[][] field_l;
    private Object[] field_g;
    private be field_k;
    static String field_c;
    private ng field_a;
    static String field_i;
    static String field_d;
    static String field_h;
    static boolean field_e;
    static ri field_f;

    final synchronized byte[] a(String param0, String param1, boolean param2) {
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
          if (!this.a((byte) -120)) {
            return null;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_k.field_d.a(1481485697, kd.a(var6, -79));
          if (param2) {
            ul.b(((byte[]) (this.field_g[3]))[9]);
          }
          if (!this.b(var4_int, -120)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_k.field_n[var4_int].a(1481485697, kd.a(var7, -93));
          stackIn_9_0 = this.a(var4_int, true, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ul.V(");
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
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -110)) {
            return false;
          }
          if (param0) {
            this.field_l = (Object[][]) null;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_k.field_d.a(1481485697, kd.a(var4, -53));
          stackIn_7_0 = this.a(-126, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ul.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.b(param1, 101)) {
          return false;
        }
        if (this.field_g[param1] != null) {
          return true;
        }
        this.c(-127, param1);
        if (param0 > -118) {
          return false;
        }
        if (this.field_g[param1] == null) {
          return false;
        }
        return true;
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a(param0, 6327, param1)) {
          return false;
        }
        if (param2 != 0) {
          return false;
        }
        if (null != this.field_l[param1] &&
          null != this.field_l[param1][param0]) {
          return true;
        }
        if (null != this.field_g[param1]) {
          return true;
        }
        this.c(-113, param1);
        if (null == this.field_g[param1]) {
          return false;
        }
        return true;
    }

    private final synchronized void c(int param0, int param1) {
        if (!this.field_j) {
          this.field_g[param1] = ai.a(-137, false, this.field_a.a(-123, param1));
        } else {
          this.field_g[param1] = this.field_a.a(-123, param1);
        }
        if (param0 >= -85) {
          this.field_k = (be) null;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        field_h = null;
        if (param0 != -35) {
          ul.b((byte) -55);
        }
        field_m = (String[][]) null;
        field_n = null;
        field_f = null;
        field_d = null;
        field_i = null;
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        byte[] stackIn_20_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param1, param2 ^ -31366, param0)) {
            return null;
          }
          var5 = null;
          if ((this.field_l[param0] == null ||
            null == this.field_l[param0][param1]) && !this.a(param0, true, param3, param1)) {
            this.c(-101, param0);
            if (!this.a(param0, true, param3, param1)) {
              return null;
            }
          }
          if (this.field_l[param0] == null) {
            throw new RuntimeException("");
          }
          if (null != this.field_l[param0][param1]) {
            var7 = h.a(this.field_l[param0][param1], -110, false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (param2 != -25139) {
            stackIn_20_0 = (byte[]) null;
            return stackIn_20_0;
          }
          if (var5 != null) {
            if (1 != this.field_b) {
              if (2 == this.field_b) {
                this.field_l[param0] = null;
              }
            } else {
              this.field_l[param0][param1] = null;
              if (this.field_k.field_b[param0] == 1) {
                this.field_l[param0] = null;
              }
            }
          }
          stackIn_28_0 = var5;
          return (byte[]) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("ul.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw fa.a((Throwable) (stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        boolean stackIn_35_2 = false;
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
        k var26 = null;
        byte[] var27 = null;
        k var29 = null;
        k var31 = null;
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
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!this.b(param0, -116)) {
            return false;
          }
          if (this.field_g[param0] == null) {
            return false;
          }
          var5_int = this.field_k.field_s[param0];
          var34 = this.field_k.field_i[param0];
          var24 = var34;
          var6 = var24;
          if (null == this.field_l[param0]) {
            array$0 = new Object[this.field_k.field_b[param0]];
            this.field_l[param0] = array$0;
          }
          var7 = this.field_l[param0];
          var8 = param1 ? 1 : 0;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (var6 != null) {
              var10 = var34[var9_int];
            } else {
              var10 = var9_int;
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
          if (param2 != null && (0 != param2[0] ||
            param2[1] != 0 ||
            param2[2] != 0 ||
            param2[3] != 0)) {
            var35 = h.a(this.field_g[param0], -42, true);
            var25 = var35;
            var9 = var25;
            var26 = new k(var35);
            var26.a(var26.field_m.length, param2, -2564, 5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = h.a(this.field_g[param0], -124, false);
          }
          try {
            var36 = hb.a(var9, 0);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_34_0 = var11_ref_RuntimeException;
            stackIn_34_1 = new StringBuilder();
            stackIn_35_2 = (param2 != null);
            throw fa.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(" ").append(param0).append(" ").append(var9.length).append(" ").append(pb.a(var9, var9.length, (byte) -42)).append(" ").append(pb.a(var9, -2 + var9.length, (byte) 109)).append(" ").append(this.field_k.field_r[param0]).append(" ").append(this.field_k.field_o).toString());
          }
          if (this.field_j) {
            this.field_g[param0] = null;
          }
          if (var5_int > 1) {
            if (this.field_b == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var12 * (var5_int * 4);
              var29 = new k(var43);
              var14_int = 0;
              var15_int = 0;
              var29.field_j = var11;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.i(-1478490344);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (var19 == param3) {
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
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19 = var19 + var29.i(-1478490344);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (var21 == param3) {
                    d.a(var43, var17, var44, var14_intLifetime1, var19);
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
              var11 = var11 - 4 * var12 * var5_int;
              var31 = new k(var43);
              var39 = new int[var5_int];
              var32 = var39;
              var14 = var32;
              var31.field_j = var11;
              for (var15_int = 0; var12 > var15_int; var15_int++) {
                var16 = 0;
                for (var17 = 0; var5_int > var17; var17++) {
                  var16 = var16 + var31.i(-1478490344);
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
              var31.field_j = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var31.i(-1478490344);
                  d.a(var43, var16, var40[var19], var39[var19], var18);
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
                if (this.field_b != 0) {
                  var7[var18] = var40[var17];
                } else {
                  var7[var18] = ai.a(-137, false, var40[var17]);
                }
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_b == 0) {
              var7[var11] = ai.a(-137, false, var36);
              return true;
            }
            var7[var11] = var43;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("ul.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!this.a((byte) -115)) {
          return 0;
        }
        var2 = 0;
        var3 = param0;
        for (var4 = 0; this.field_g.length > var4; var4++) {
          if (this.field_k.field_s[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.a(var4, (byte) 120);
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -109)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var3_int = this.field_k.field_d.a(1481485697, kd.a(var5, -37));
          if (!this.b(var3_int, -114)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          var4 = 7 % ((54 - param1) / 51);
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ul.P(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
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
          if (!this.a((byte) -115)) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          if (param0 != 0) {
            this.field_a = (ng) (this.field_g[27]);
          }
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_k.field_d.a(1481485697, kd.a(var4, param0 - 17));
          stackIn_7_0 = this.a(var3_int, (byte) 125);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ul.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 != -1) {
          return 115;
        }
        if (!this.a((byte) -108)) {
          return -1;
        }
        return this.field_k.field_b.length;
    }

    final int d(int param0, int param1) {
        if (!this.b(param0, param1 ^ -16)) {
          return 0;
        }
        if (param1 != -2) {
          this.c(((int[]) (((Object[]) (this.field_g[7]))[9]))[0], ((int[]) (this.field_g[0]))[2]);
        }
        return this.field_k.field_b[param0];
    }

    final synchronized boolean a(byte param0) {
        if (param0 > -107) {
          return false;
        }
        if (null == this.field_k) {
          this.field_k = this.field_a.a((byte) -106);
          if (this.field_k == null) {
            return false;
          }
          this.field_l = new Object[this.field_k.field_e][];
          this.field_g = new Object[this.field_k.field_e];
        }
        return true;
    }

    final synchronized boolean a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!this.a((byte) -109)) {
          return false;
        }
        var2 = 1;
        for (var3 = param0; var3 < this.field_k.field_l.length; var3++) {
          var4 = this.field_k.field_l[var3];
          if (null == this.field_g[var4]) {
            this.c(-91, var4);
            if (null == this.field_g[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a((byte) -116)) {
          return false;
        }
        if (param2 >= 0 &&
          param0 >= 0 &&
          param2 < this.field_k.field_b.length &&
          this.field_k.field_b[param2] > param0) {
          if (param1 == 6327) {
            return true;
          }
          return ((boolean[]) (this.field_g[17]))[2];
        }
        if (em.field_P) {
          throw new IllegalArgumentException(param2 + " " + param0);
        }
        return false;
    }

    private final synchronized boolean b(int param0, int param1) {
        int var3;
        if (!this.a((byte) -111)) {
          return false;
        }
        if (param0 >= 0 &&
          param0 < this.field_k.field_b.length &&
          this.field_k.field_b[param0] != 0) {
          var3 = -116 / ((param1 + 61) / 53);
          return true;
        }
        if (!em.field_P) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -118)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_k.field_d.a(1481485697, kd.a(var6, 121));
          if (!this.b(var4_int, 10)) {
            return false;
          }
          if (param0 >= -23) {
            return true;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_k.field_n[var4_int].a(1481485697, kd.a(var7, 125));
          stackIn_12_0 = this.b(var5, var4_int, 0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ul.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -112)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_k.field_d.a(1481485697, kd.a(var4, param1 ^ -81));
          if (param1 != 2) {
            ((long[]) (this.field_g[1]))[15] = 4L;
          }
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ul.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized byte[] a(byte param0, int param1) {
        if (param0 != -77) {
          ul.b((byte) -63);
        }
        if (!this.a((byte) -128)) {
          return null;
        }
        if (this.field_k.field_b.length == 1) {
          return this.a(0, true, param1);
        }
        if (!this.b(param1, -123)) {
          return null;
        }
        if (this.field_k.field_b[param1] == 1) {
          return this.a(param1, true, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int a(int param0, byte param1) {
        if (!this.b(param0, 55)) {
          return 0;
        }
        if (null != this.field_g[param0]) {
          return 100;
        }
        if (param1 < 96) {
          this.field_b = ((int[]) (this.field_g[16]))[7];
        }
        return this.field_a.b(param0, -3);
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param1, param2 - 117)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          if (param2 != -1) {
            ((boolean[]) (this.field_g[0]))[27] = true;
          }
          var5 = (CharSequence) ((Object) param0);
          var4_int = this.field_k.field_n[param1].a(param2 ^ -1481485698, kd.a(var5, param2 + 126));
          if (this.a(var4_int, 6327, param1)) {
            return var4_int;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ul.U(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
          this.b(((int[]) (this.field_g[0]))[5]);
        }
        return this.a(param0, param2, -25139, (int[]) null);
    }

    ul(ng param0, boolean param1, int param2) {
        this.field_k = null;
        try {
          if (0 > param2 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_a = param0;
          this.field_j = param1 ? true : false;
          this.field_b = param2;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Your zombies won't wander about if you train them to focus.";
        field_i = "Your hordes will move as fast as lightning...especially if you also equip Determined.";
        field_n = new ip();
        field_d = "Detonate";
        field_h = "Starve your zombies before unleashing them on humans! They'll lunge even faster and from further away than with Hungry.";
    }
}
