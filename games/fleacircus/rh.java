/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    private boolean field_d;
    private gi field_i;
    static vb field_p;
    private int field_h;
    static ik field_c;
    static mj field_f;
    static String field_b;
    private Object[][] field_l;
    private rf field_m;
    static int field_a;
    private Object[] field_g;
    static String field_o;
    static ed field_k;
    static boolean[] field_j;
    static String field_e;
    static sf field_n;

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
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
        ni var26 = null;
        byte[] var27 = null;
        ni var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ni var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = fleas.field_A ? 1 : 0;
        try {
          if (!this.a(true, param1)) {
            return false;
          }
          if (null == this.field_g[param1]) {
            return false;
          }
          var5_int = this.field_m.field_f[param1];
          var34 = this.field_m.field_h[param1];
          var24 = var34;
          var6 = var24;
          if (null == this.field_l[param1]) {
            array$0 = new Object[this.field_m.field_v[param1]];
            this.field_l[param1] = array$0;
          }
          var7 = this.field_l[param1];
          var8 = 1;
          for (var9_int = param2; var5_int > var9_int; var9_int++) {
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
          if (param0 != null && (0 != param0[0] ||
            param0[1] != 0 ||
            param0[2] != 0 ||
            param0[3] != 0)) {
            var35 = jg.a(false, this.field_g[param1], true);
            var25 = var35;
            var9 = var25;
            var26 = new ni(var35);
            var26.a(param0, 5, -1, var26.field_k.length);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = jg.a(false, this.field_g[param1], false);
          }
          try {
            var36 = qi.a(var9, -22518);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_35_0 = var11_ref_RuntimeException;
            stackIn_35_1 = new StringBuilder();
            stackIn_36_2 = (param0 != null);
            throw pf.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(" ").append(param1).append(" ").append(var9.length).append(" ").append(ia.a(true, var9, var9.length)).append(" ").append(ia.a(true, var9, var9.length - 2)).append(" ").append(this.field_m.field_u[param1]).append(" ").append(this.field_m.field_p).toString());
          }
          if (this.field_d) {
            this.field_g[param1] = null;
          }
          if (var5_int > 1) {
            if (this.field_h == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var12 * var5_int * 4;
              var32 = new ni(var43);
              var14 = 0;
              var15 = 0;
              var32.field_i = var11;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var32.c((byte) -91);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (var19 == param3) {
                    var14 = var14 + var17;
                    var15 = var19;
                  }
                }
              }
              if (var14 == 0) {
                return true;
              }
              var44 = new byte[var14];
              var14Lifetime1 = 0;
              var32.field_i = var11;
              var17 = 0;
              for (var18 = 0; var12 > var18; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var32.c((byte) -70);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (param3 == var21) {
                    dm.a(var43, var17, var44, var14Lifetime1, var19);
                    var14Lifetime1 = var14Lifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * (var5_int * var12);
              var29 = new ni(var43);
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              var29.field_i = var11;
              for (var15 = 0; var12 > var15; var15++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var29.c((byte) -123);
                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                }
              }
              var39 = new byte[var5_int][];
              var31 = var39;
              var15_ref_byte____ = var31;
              for (var16 = 0; var16 < var5_int; var16++) {
                array$1 = new byte[var38[var16]];
                var15_ref_byte____[var16] = array$1;
                var38[var16] = 0;
              }
              var29.field_i = var11;
              var16 = 0;
              for (var17 = 0; var17 < var12; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var29.c((byte) -35);
                  dm.a(var43, var16, var39[var19], var38[var19], var18);
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                  var16 = var16 + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 != null) {
                  var18 = var34[var17];
                } else {
                  var18 = var17;
                }
                if (this.field_h == 0) {
                  var7[var18] = kh.a(false, var39[var17], -137);
                } else {
                  var7[var18] = var39[var17];
                }
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_h == 0) {
              var7[var11] = kh.a(false, var36, -137);
              return true;
            }
            var7[var11] = var43;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("rh.M(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = fleas.field_A ? 1 : 0;
        if (!this.b((byte) -126)) {
          return false;
        }
        var2 = 1;
        if (param0 > -12) {
          ((long[]) (this.field_g[3]))[7] = ((long[]) (this.field_g[3]))[8];
        }
        for (var3 = 0; this.field_m.field_r.length > var3; var3++) {
          var4 = this.field_m.field_r[var3];
          if (null == this.field_g[var4]) {
            this.a((byte) 101, var4);
            if (this.field_g[var4] == null) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -126)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param1 != -100) {
            this.field_g = (Object[]) null;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_m.field_j.a(tb.a(var4, false), (byte) 123);
          if (this.a(true, var3_int)) {
            return var3_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("rh.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, byte param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          while (true) {
            param1--;
            if (0 > param1) {
              if (param4 > -65) {
                rh.c((byte) -61);
              }
              return;
            }
            var9 = param3;
            var5 = var9;
            var6 = param2;
            var7 = param0;
            var9[var6] = (sc.a(16711422, var9[var6]) >> 1) + var7;
            param2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("rh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized boolean b(byte param0) {
        if (this.field_m == null) {
          this.field_m = this.field_i.a(-1712);
          if (this.field_m == null) {
            return false;
          }
          this.field_l = new Object[this.field_m.field_i][];
          this.field_g = new Object[this.field_m.field_i];
        }
        if (param0 > -97) {
          String var3 = (String) null;
          this.a((String) null, (byte) 76);
          return true;
        }
        return true;
    }

    final boolean a(String param0, int param1) {
        boolean discarded$1 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -91) {
            discarded$1 = this.a(((boolean[]) (this.field_g[0]))[1], ((int[]) (this.field_g[3]))[4]);
          }
          if (!this.b((byte) -110)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_m.field_j.a(tb.a(var4, false), (byte) 125);
          stackIn_7_0 = this.c(var3_int, 14969);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rh.T(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -102)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var7 = (CharSequence) ((Object) param1);
          var4_int = this.field_m.field_j.a(tb.a(var7, false), (byte) 121);
          if (!this.a(true, var4_int)) {
            return false;
          }
          var5 = -70 / ((-21 - param2) / 33);
          var8 = (CharSequence) ((Object) param0);
          var6 = this.field_m.field_k[var4_int].a(tb.a(var8, false), (byte) 116);
          stackIn_8_0 = this.a((byte) -29, var4_int, var6);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("rh.L(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(-10, param1, param2)) {
          return false;
        }
        if (param0 != -29) {
          return ((boolean[]) (this.field_g[11]))[1];
        }
        if (this.field_l[param1] != null &&
          this.field_l[param1][param2] != null) {
          return true;
        }
        if (this.field_g[param1] != null) {
          return true;
        }
        this.a((byte) 101, param1);
        if (null != this.field_g[param1]) {
          return true;
        }
        return false;
    }

    final boolean b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 37) {
            field_n = (sf) null;
          }
          if (!this.b((byte) -111)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_m.field_j.a(tb.a(var4, false), (byte) 126);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("rh.K(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_o = null;
        if (param0 != -110) {
          return;
        }
        field_f = null;
        field_c = null;
        field_k = null;
        field_p = null;
        field_b = null;
        field_n = null;
        field_j = null;
        field_e = null;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -101)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param0 >= -37) {
            stackIn_5_0 = ((int[]) (this.field_g[13]))[2];
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_m.field_j.a(tb.a(var4, false), (byte) 125);
          stackIn_7_0 = this.b(var3_int, -2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rh.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int d(byte param0) {
        if (!this.b((byte) -99)) {
          return -1;
        }
        int var2 = -22 % ((-8 - param0) / 41);
        return this.field_m.field_v.length;
    }

    final static String a(byte param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = fleas.field_A ? 1 : 0;
        if (param1 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param1) {
          return null;
        }
        if (0L == param1 % 37L) {
          return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
          var7 = param1;
          param1 = param1 / 37L;
          var9 = ic.field_db[(int)(-(param1 * 37L) + var7)];
          if (95 == var9) {
            var10 = -1 + var6.length();
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            var9 = 160;
          }
          discarded$0 = var6.append((char) var9);
        }
        if (param0 != -70) {
          field_e = (String) null;
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final int a(String param0, byte param1, int param2) {
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
          if (!this.a(true, param2)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param1 != -15) {
            field_b = (String) null;
          }
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var4_int = this.field_m.field_k[param2].a(tb.a(var5, false), (byte) 118);
          if (this.a(-51, param2, var4_int)) {
            return var4_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("rh.V(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int b(int param0, int param1) {
        if (param1 != -2) {
          return -13;
        }
        if (!this.a(true, param0)) {
          return 0;
        }
        if (null != this.field_g[param0]) {
          return 100;
        }
        return this.field_i.a(param0, (byte) -5);
    }

    private final synchronized boolean a(boolean param0, int param1) {
        if (!param0) {
          return true;
        }
        if (!this.b((byte) -124)) {
          return false;
        }
        if (param1 < 0 ||
          param1 >= this.field_m.field_v.length ||
          this.field_m.field_v[param1] == 0) {
          if (rj.field_n) {
            throw new IllegalArgumentException(Integer.toString(param1));
          }
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, int param7, ce param8) {
        try {
          fh.field_g = param5;
          wj.field_d = param1;
          il.field_g = param4;
          of.field_b = param3;
          pg.field_c = param6;
          if (param2 != 8737) {
            field_p = (vb) null;
          }
          b.field_a = param0;
          mh.field_x = param8;
          tj.field_c = param7;
          td.field_k = (w) ((Object) new g());
          vg.field_r = new af(param8);
          gf.field_e = new uf(td.field_k, vg.field_r);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "rh.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(-63, param3, param0)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if (!param1) {
            stackIn_5_0 = (byte[]) (this.field_g[0]);
            return stackIn_5_0;
          }
          if ((null == this.field_l[param3] ||
            this.field_l[param3][param0] == null) &&
            !this.a(param2, param3, 0, param0)) {
            this.a((byte) 101, param3);
            if (!this.a(param2, param3, 0, param0)) {
              return null;
            }
          }
          if (this.field_l[param3] == null) {
            throw new RuntimeException("");
          }
          if (this.field_l[param3][param0] != null) {
            var7 = jg.a(false, this.field_l[param3][param0], false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_h == 1) {
              this.field_l[param3][param0] = null;
              if (1 == this.field_m.field_v[param3]) {
                this.field_l[param3] = null;
              }
            } else {
              if (this.field_h == 2) {
                this.field_l[param3] = null;
              }
            }
          }
          stackIn_28_0 = var5;
          return (byte[]) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("rh.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pf.a((Throwable) (stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(')').toString());
        }
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 < 113) {
          field_j = (boolean[]) null;
        }
        return this.a(param2, true, (int[]) null, param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        int var4 = -7 / ((param0 - 68) / 34);
        if (!this.b((byte) -110)) {
          return false;
        }
        if (param1 >= 0 &&
          param2 >= 0 &&
          this.field_m.field_v.length > param1 &&
          param2 < this.field_m.field_v[param1]) {
          return true;
        }
        if (!rj.field_n) {
          return false;
        }
        throw new IllegalArgumentException(param1 + " " + param2);
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!this.b((byte) -115)) {
          return null;
        }
        if (1 == this.field_m.field_v.length) {
          return this.a(0, (byte) 117, param0);
        }
        if (!this.a(true, param0)) {
          return null;
        }
        if (this.field_m.field_v[param0] == 1) {
          return this.a(param0, (byte) 116, 0);
        }
        if (param1 != 0) {
          this.field_l = (Object[][]) null;
        }
        throw new RuntimeException();
    }

    final int a(int param0, byte param1) {
        if (!this.a(true, param0)) {
          return 0;
        }
        if (param1 > -91) {
          this.c(-123, 42);
        }
        return this.field_m.field_v[param0];
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
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
          if (!this.b((byte) -128)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          if (param0 != 0) {
            field_k = (ed) null;
          }
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_m.field_j.a(tb.a(var6, false), (byte) 118);
          if (!this.a(true, var4_int)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_m.field_k[var4_int].a(tb.a(var7, false), (byte) 117);
          stackIn_9_0 = this.a(var4_int, (byte) 115, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("rh.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final synchronized void a(byte param0, int param1) {
        if (param0 != 101) {
          this.b((String) null, ((int[]) (((Object[]) (this.field_g[3]))[7]))[1]);
        }
        if (!this.field_d) {
          this.field_g[param1] = kh.a(false, this.field_i.b(param1, false), -137);
        } else {
          this.field_g[param1] = this.field_i.b(param1, false);
        }
    }

    final synchronized int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = fleas.field_A ? 1 : 0;
        if (!this.b((byte) -113)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        var4 = 0;
        if (param0 >= -38) {
          return -101;
        }
        while (var4 < this.field_g.length) {
          if (this.field_m.field_f[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.b(var4, -2);
          }
          var4++;
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.a(true, param0)) {
          return false;
        }
        if (null != this.field_g[param0]) {
          return true;
        }
        this.a((byte) 101, param0);
        if (param1 != 14969) {
          return false;
        }
        if (this.field_g[param0] == null) {
          return false;
        }
        return true;
    }

    rh(gi param0, boolean param1, int param2) {
        this.field_m = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_h = param2;
          this.field_i = param0;
          this.field_d = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Previous";
        field_o = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_a = 20;
        field_f = new mj();
        field_e = null;
        field_j = new boolean[]{false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false};
    }
}
