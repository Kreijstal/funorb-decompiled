/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static u[] field_k;
    int field_d;
    private Object[][] field_i;
    private Object[] field_e;
    private ab field_a;
    static int field_j;
    static long field_h;
    static int field_f;
    static int[] field_c;
    private ff field_g;
    boolean field_b;

    private final synchronized void d(int param0, byte param1) {
        if (param1 <= 99) {
          this.field_d = -46;
        }
        if (!this.field_b) {
          this.field_e[param0] = oh.a(false, true, this.field_a.a(true, param0));
        } else {
          this.field_e[param0] = this.field_a.a(true, param0);
        }
    }

    final int c(int param0) {
        if (!this.b(param0 ^ param0)) {
          return -1;
        }
        return this.field_g.field_r.length;
    }

    final boolean a(String param0, String param1, boolean param2) {
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
          if (!this.b(0)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_g.field_k.a(og.a(var6, (byte) -116), 1);
          if (!this.c(var4_int, (byte) -81)) {
            return false;
          }
          if (param2) {
            this.a(((byte[]) (((Object[]) (this.field_e[0]))[0]))[5]);
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_g.field_t[var4_int].a(og.a(var7, (byte) -121), 1);
          stackIn_10_0 = this.b(0, var4_int, var5);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("r.Q(");
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
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param0 < 110) {
            this.b(49, (byte) 11);
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_g.field_k.a(og.a(var4, (byte) -121), 1);
          if (this.c(var3_int, (byte) -75)) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("r.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (param2 != -20729) {
          this.d(((int[]) (this.field_e[0]))[8], (byte) -39);
        }
        if (!this.b(param2 + 20729)) {
          return false;
        }
        if (0 <= param0 &&
          param1 >= 0 &&
          this.field_g.field_r.length > param0 &&
          param1 < this.field_g.field_r[param0]) {
          return true;
        }
        if (!rq.field_y) {
          return false;
        }
        throw new IllegalArgumentException(param0 + " " + param1);
    }

    final synchronized byte[] a(boolean param0, int param1) {
        if (!this.b(0)) {
          return null;
        }
        if (this.field_g.field_r.length == 1) {
          return this.a(0, param1, (byte) -41);
        }
        if (!param0) {
          this.field_d = -20;
        }
        if (!this.c(param1, (byte) -117)) {
          return null;
        }
        if (this.field_g.field_r[param1] == 1) {
          return this.a(param1, 0, (byte) -72);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!this.b(0)) {
          return false;
        }
        if (1 == this.field_g.field_r.length) {
          return this.b(0, 0, param0);
        }
        if (!this.c(param0, (byte) -96)) {
          return false;
        }
        if (1 == this.field_g.field_r[param0]) {
          return this.b(0, param0, 0);
        }
        int var3 = 53 / ((-28 - param1) / 51);
        throw new RuntimeException();
    }

    final synchronized int b(int param0, int param1) {
        if (!this.c(param0, (byte) -60)) {
          return 0;
        }
        if (this.field_e[param0] != null) {
          return 100;
        }
        if (param1 != 100) {
          return 31;
        }
        return this.field_a.b(param0, 57);
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param1)) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_k.a(og.a(var4, (byte) -119), 1);
          stackIn_5_0 = this.b(var3_int, 100);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("r.L(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1, byte param2) {
        boolean discarded$0 = false;
        if (param2 > -3) {
          discarded$0 = this.a(7, 10, ((int[]) (this.field_e[1]))[6]);
        }
        return this.a(param0, param1, 97, (int[]) null);
    }

    final synchronized boolean a(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (!this.b(param0 ^ -112)) {
          return false;
        }
        var2 = 1;
        if (param0 != -112) {
          return ((boolean[]) (((Object[]) (this.field_e[0]))[1]))[0];
        }
        for (var3 = 0; var3 < this.field_g.field_e.length; var3++) {
          var4 = this.field_g.field_e[var3];
          if (this.field_e[var4] == null) {
            this.d(var4, (byte) 116);
            if (this.field_e[var4] == null) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final synchronized int[] a(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (!this.c(param1, (byte) -85)) {
          return null;
        }
        if (param0 != 0) {
          return (int[]) null;
        }
        int[] var3 = this.field_g.field_g[param1];
        if (var3 == null) {
          var6 = new int[this.field_g.field_h[param1]];
          var3 = var6;
          for (var4 = 0; var6.length > var4; var4++) {
            var6[var4] = var4;
          }
        }
        return var3;
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param2 + param2)) {
            return null;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_g.field_k.a(og.a(var6, (byte) -94), param2 ^ 1);
          if (!this.c(var4_int, (byte) -109)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_g.field_t[var4_int].a(og.a(var7, (byte) -122), 1);
          stackIn_7_0 = this.a(var4_int, var5, (byte) -125);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("r.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final int b(int param0, byte param1) {
        if (!this.c(param0, (byte) -52)) {
          return 0;
        }
        if (param1 >= -27) {
          this.field_e = (Object[]) null;
        }
        return this.field_g.field_r[param0];
    }

    private final synchronized boolean b(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        boolean stackIn_37_2 = false;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
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
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        ed var26 = null;
        byte[] var27 = null;
        ed var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ed var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!this.c(param1, (byte) -114)) {
            return false;
          }
          if (this.field_e[param1] == null) {
            return false;
          }
          var5_int = this.field_g.field_h[param1];
          var34 = this.field_g.field_g[param1];
          var24 = var34;
          var6 = var24;
          if (null == this.field_i[param1]) {
            array$0 = new Object[this.field_g.field_r[param1]];
            this.field_i[param1] = array$0;
          }
          var7 = this.field_i[param1];
          var8 = 1;
          for (var9_int = param0; var5_int > var9_int; var9_int++) {
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
            param3[2] != 0 ||
            param3[3] != 0)) {
            var35 = pc.a((byte) 6, true, this.field_e[param1]);
            var25 = var35;
            var9 = var25;
            var26 = new ed(var35);
            var26.a(param3, var26.field_p.length, 5, -123);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = pc.a((byte) 6, false, this.field_e[param1]);
          }
          try {
            var36 = hm.a(-20595, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (param3 != null);
            throw wn.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param1).append(" ").append(var9.length).append(" ").append(w.a(var9.length, var9, -115)).append(" ").append(w.a(var9.length - 2, var9, 67)).append(" ").append(this.field_g.field_j[param1]).append(" ").append(this.field_g.field_o).toString());
          }
          if (this.field_b) {
            this.field_e[param1] = null;
          }
          if (1 < var5_int) {
            if (this.field_d == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * var5_int * var12;
              var32 = new ed(var43);
              var14 = 0;
              var32.field_u = var11;
              var15 = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var32.b(true);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (var19 == param2) {
                    var15 = var19;
                    var14 = var14 + var17;
                  }
                }
              }
              if (var14 == 0) {
                return true;
              }
              var44 = new byte[var14];
              var14Lifetime1 = 0;
              var32.field_u = var11;
              var17 = 0;
              for (var18 = 0; var12 > var18; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var32.b(true);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (var21 == param2) {
                    qq.a(var43, var17, var44, var14Lifetime1, var19);
                    var14Lifetime1 = var14Lifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * var5_int * var12;
              var29 = new ed(var43);
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              var29.field_u = var11;
              for (var15 = 0; var15 < var12; var15++) {
                var16 = 0;
                for (var17 = 0; var5_int > var17; var17++) {
                  var16 = var16 + var29.b(true);
                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                }
              }
              var39 = new byte[var5_int][];
              var31 = var39;
              var15_ref_byte____ = var31;
              for (var16 = 0; var5_int > var16; var16++) {
                array$1 = new byte[var38[var16]];
                var15_ref_byte____[var16] = array$1;
                var38[var16] = 0;
              }
              var29.field_u = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var5_int > var19; var19++) {
                  var18 = var18 + var29.b(true);
                  qq.a(var43, var16, var39[var19], var38[var19], var18);
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                  var16 = var16 + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (this.field_d != 0) {
                  var7[var18] = var39[var17];
                } else {
                  var7[var18] = oh.a(false, true, var39[var17]);
                }
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.field_d != 0) {
              var7[var11] = var36;
              return true;
            }
            var7[var11] = oh.a(false, true, var43);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("r.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (param0 != 0) {
          this.c(-100);
        }
        if (!this.a(param1, param2, param0 - 20729)) {
          return false;
        }
        if (this.field_i[param1] != null &&
          null != this.field_i[param1][param2]) {
          return true;
        }
        if (null != this.field_e[param1]) {
          return true;
        }
        this.d(param1, (byte) 122);
        if (this.field_e[param1] != null) {
          return true;
        }
        return false;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(param0, (byte) -43)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_g.field_t[param0].a(og.a(var5, (byte) -108), 1);
          if (!this.a(param0, var4_int, -20729)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (param2 < 93) {
            field_c = (int[]) null;
          }
          stackIn_10_0 = var4_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("r.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > -49) {
          return;
        }
        field_c = null;
        field_k = null;
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        try {
          if (!this.a(param0, param1, -20729)) {
            return null;
          }
          var5 = null;
          if ((null == this.field_i[param0] ||
            null == this.field_i[param0][param1]) && !this.b(0, param0, param1, param3)) {
            this.d(param0, (byte) 107);
            if (!this.b(0, param0, param1, param3)) {
              return null;
            }
          }
          var6 = -41 % ((37 - param2) / 47);
          if (null == this.field_i[param0]) {
            throw new RuntimeException("");
          }
          if (null != this.field_i[param0][param1]) {
            var7 = pc.a((byte) 6, false, this.field_i[param0][param1]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_d != 1) {
              if (this.field_d == 2) {
                this.field_i[param0] = null;
              }
            } else {
              this.field_i[param0][param1] = null;
              if (this.field_g.field_r[param0] == 1) {
                this.field_i[param0] = null;
              }
            }
          }
          stackIn_24_0 = var5;
          return (byte[]) (stackIn_24_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("r.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wn.a((Throwable) (stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param1 ^ param1)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_k.a(og.a(var4, (byte) -100), param1 + 1);
          stackIn_4_0 = this.c(param1 + 11321, var3_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("r.AA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
          r.a(82);
        }
        if (this.field_g == null) {
          this.field_g = this.field_a.a(true);
          if (null == this.field_g) {
            return false;
          }
          this.field_e = new Object[this.field_g.field_p];
          this.field_i = new Object[this.field_g.field_p][];
        }
        return true;
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.c(param1, (byte) -121)) {
          return false;
        }
        if (null != this.field_e[param1]) {
          return true;
        }
        this.d(param1, (byte) 111);
        if (this.field_e[param1] != null) {
          return true;
        }
        if (param0 != 11321) {
          return ((boolean[]) (this.field_e[7]))[0];
        }
        return false;
    }

    final synchronized int d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (!this.b(0)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_e.length > var4; var4++) {
          if (this.field_g.field_h[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.b(var4, 100);
          }
        }
        if (param0 == ~var2) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final boolean b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param1 + 1)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_k.a(og.a(var4, (byte) -103), 1);
          if (~var3_int <= param1) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("r.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized boolean c(int param0, byte param1) {
        if (!this.b(0)) {
          return false;
        }
        if (param0 < 0 ||
          this.field_g.field_r.length <= param0 ||
          this.field_g.field_r[param0] == 0) {
          if (rq.field_y) {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
          return false;
        }
        if (param1 >= -38) {
          this.b(91, (byte) 121);
          return true;
        }
        return true;
    }

    r(ab param0, boolean param1, int param2) {
        this.field_g = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_a = param0;
          this.field_d = param2;
          this.field_b = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "r.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
