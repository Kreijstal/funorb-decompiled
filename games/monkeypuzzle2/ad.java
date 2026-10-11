/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private Object[][] field_i;
    private int field_e;
    private Object[] field_h;
    private boolean field_b;
    private rf field_c;
    static String field_d;
    private wd field_a;
    static String field_j;
    static int[] field_g;
    static String field_k;
    static String field_f;

    public static void a(byte param0) {
        field_j = null;
        field_g = null;
        field_d = null;
        if (param0 != 123) {
          field_j = (String) null;
        }
        field_k = null;
        field_f = null;
    }

    final boolean a(String param0, boolean param1, String param2) {
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
          if (!this.a(-22)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          if (!param1) {
            return true;
          }
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_a.field_b.a(param1, ra.a((byte) -21, var6));
          if (!this.a((byte) 115, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_a.field_t[var4_int].a(param1, ra.a((byte) 99, var7));
          stackIn_10_0 = this.c(var4_int, var5, -119);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ad.K(");
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
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, byte param3) {
        byte[] stackIn_5_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param2, param0, 0)) {
            return null;
          }
          if (param3 > -30) {
            stackIn_5_0 = (byte[]) null;
            return stackIn_5_0;
          }
          var5 = null;
          if ((null == this.field_i[param2] ||
            this.field_i[param2][param0] == null) && !this.a((byte) -12, param1, param0, param2)) {
            this.a(3, param2);
            if (!this.a((byte) -12, param1, param0, param2)) {
              return null;
            }
          }
          if (null == this.field_i[param2]) {
            throw new RuntimeException("");
          }
          if (this.field_i[param2][param0] != null) {
            var7 = uj.a(43, this.field_i[param2][param0], false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_e == 1) {
              this.field_i[param2][param0] = null;
              if (this.field_a.field_r[param2] == 1) {
                this.field_i[param2] = null;
              }
            } else {
              if (2 == this.field_e) {
                this.field_i[param2] = null;
              }
            }
          }
          stackIn_30_0 = var5;
          return (byte[]) (stackIn_30_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("ad.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw la.a((Throwable) (stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean c(int param0, int param1, int param2) {
        int var4 = 43 / ((param2 - 5) / 50);
        if (!this.a(param0, param1, 0)) {
          return false;
        }
        if (this.field_i[param0] != null &&
          null != this.field_i[param0][param1]) {
          return true;
        }
        if (this.field_h[param0] != null) {
          return true;
        }
        this.a(3, param0);
        if (null != this.field_h[param0]) {
          return true;
        }
        return false;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.b(93);
          }
          if (!this.a(118)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_a.field_b.a(true, ra.a((byte) 115, var4));
          stackIn_6_0 = this.a(false, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ad.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, float param2) {
        try {
          pj.field_h = param2;
          be.field_d = param0;
          if (param1 != -24119) {
            field_f = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ad.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int c(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(112)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (param1 != -105) {
            field_j = (String) null;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_a.field_b.a(true, ra.a((byte) -14, var4));
          if (this.a((byte) 73, var3_int)) {
            return var3_int;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ad.M(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!this.a((byte) 124, param1)) {
          return false;
        }
        if (null != this.field_h[param1]) {
          return true;
        }
        this.a(3, param1);
        if (this.field_h[param1] != null) {
          return true;
        }
        if (param0) {
          return ((boolean[]) (this.field_h[1]))[8];
        }
        return false;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!this.a(-18)) {
          return false;
        }
        if (param1 >= 0 &&
          this.field_a.field_r.length > param1 &&
          this.field_a.field_r[param1] != 0) {
          if (param0 >= 64) {
            return true;
          }
          this.b(0, 17);
          return true;
        }
        if (mg.field_t) {
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final boolean b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(-63)) {
            return false;
          }
          var3_int = 20 % ((param1 + 58) / 43);
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var4 = this.field_a.field_b.a(true, ra.a((byte) 104, var5));
          if (var4 >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ad.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized void a(int param0, int param1) {
        if (param0 != 3) {
          return;
        }
        if (this.field_b) {
          this.field_h[param1] = this.field_c.b(-113, param1);
        } else {
          this.field_h[param1] = p.a(this.field_c.b(-116, param1), (byte) 111, false);
        }
    }

    private final synchronized boolean a(byte param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        boolean stackIn_35_2 = false;
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
        gk var26 = null;
        byte[] var27 = null;
        gk var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        gk var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (!this.a((byte) 88, param3)) {
            return false;
          }
          if (this.field_h[param3] == null) {
            return false;
          }
          var5_int = this.field_a.field_m[param3];
          var34 = this.field_a.field_a[param3];
          var24 = var34;
          var6 = var24;
          if (this.field_i[param3] == null) {
            array$0 = new Object[this.field_a.field_r[param3]];
            this.field_i[param3] = array$0;
          }
          var7 = this.field_i[param3];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
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
          if (param1 != null && (param1[0] != 0 ||
            param1[1] != 0 ||
            param1[2] != 0 ||
            0 != param1[3])) {
            var35 = uj.a(59, this.field_h[param3], true);
            var25 = var35;
            var9 = var25;
            var26 = new gk(var35);
            var26.a(5, var26.field_g.length, -84, param1);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = uj.a(67, this.field_h[param3], false);
          }
          try {
            var36 = rc.a(var9, 120);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_34_0 = var11_ref_RuntimeException;
            stackIn_34_1 = new StringBuilder();
            stackIn_35_2 = (param1 != null);
            throw la.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(" ").append(param3).append(" ").append(var9.length).append(" ").append(w.a(var9.length, var9, -18694)).append(" ").append(w.a(-2 + var9.length, var9, param0 ^ 18702)).append(" ").append(this.field_a.field_j[param3]).append(" ").append(this.field_a.field_d).toString());
          }
          if (param0 != -12) {
            this.a((String) (this.field_h[11]), (byte) 73);
          }
          if (this.field_b) {
            this.field_h[param3] = null;
          }
          if (var5_int > 1) {
            if (this.field_e == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * var5_int * var12;
              var32 = new gk(var43);
              var14 = 0;
              var15 = 0;
              var32.field_h = var11;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var32.e(param0 ^ -118);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (param2 == var19) {
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
              var32.field_h = var11;
              var17 = 0;
              for (var18 = 0; var12 > var18; var18++) {
                var19 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19 = var19 + var32.e(param0 - 102);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (param2 == var21) {
                    gl.a(var43, var17, var44, var14Lifetime1, var19);
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
              var11 = var11 - var5_int * var12 * 4;
              var29 = new gk(var43);
              var29.field_h = var11;
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              for (var15 = 0; var12 > var15; var15++) {
                var16 = 0;
                for (var17 = 0; var5_int > var17; var17++) {
                  var16 = var16 + var29.e(-30);
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
              var29.field_h = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var29.e(-95);
                  gl.a(var43, var16, var39[var19], var38[var19], var18);
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
                if (this.field_e != 0) {
                  var7[var18] = var39[var17];
                } else {
                  var7[var18] = p.a(var39[var17], (byte) 117, false);
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
            var7[var11] = p.a(var43, (byte) 110, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("ad.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized int b(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!this.a(89)) {
          return 0;
        }
        if (!param0) {
          this.field_e = 47;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_h.length; var4++) {
          if (0 < this.field_a.field_m[var4]) {
            var3 = var3 + this.b(var4, 11619);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final static boolean c(boolean param0) {
        if (param0) {
          field_g = (int[]) null;
        }
        return oa.a((byte) -127, ii.a(false));
    }

    final byte[] b(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0 != 255) {
          discarded$0 = this.a((byte) 89, -23);
        }
        return this.a(param1, (int[]) null, param2, (byte) -85);
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
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
          if (!this.a(85)) {
            return null;
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var5 = 26 / ((-88 - param2) / 36);
          var7 = (CharSequence) ((Object) param1);
          var4_int = this.field_a.field_b.a(true, ra.a((byte) 125, var7));
          if (!this.a((byte) 117, var4_int)) {
            return null;
          }
          var8 = (CharSequence) ((Object) param0);
          var6 = this.field_a.field_t[var4_int].a(true, ra.a((byte) -59, var8));
          stackIn_7_0 = this.b(255, var6, var4_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ad.L(");
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
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          field_j = (String) null;
        }
        return wd.field_g;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param2 ^ -42)) {
          return false;
        }
        if (param0 >= param2 &&
          param1 >= 0 &&
          this.field_a.field_r.length > param0 &&
          param1 < this.field_a.field_r[param0]) {
          return true;
        }
        if (!mg.field_t) {
          return false;
        }
        throw new IllegalArgumentException(param0 + " " + param1);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        if (!param1) {
          return;
        }
        try {
          mk.a("", (byte) -5, param0);
          l.a(param0, -106);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ad.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized boolean a(int param0) {
        if (this.field_a == null) {
          this.field_a = this.field_c.a((byte) 80);
          if (this.field_a == null) {
            return false;
          }
          this.field_h = new Object[this.field_a.field_e];
          this.field_i = new Object[this.field_a.field_e][];
        }
        int var2 = -110 / ((param0 - 24) / 38);
        return true;
    }

    final synchronized boolean b(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!this.a(-123)) {
          return false;
        }
        var2 = 1;
        for (var3 = param0; var3 < this.field_a.field_f.length; var3++) {
          var4 = this.field_a.field_f[var3];
          if (this.field_h[var4] == null) {
            this.a(3, var4);
            if (null == this.field_h[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
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
          if (!this.a((byte) 96, param1)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var4_int = this.field_a.field_t[param1].a(true, ra.a((byte) 3, var5));
          if (param2 != -28459) {
            ((int[]) (((Object[]) (((Object[]) (this.field_h[1]))[14]))[2]))[0] = -43;
          }
          if (this.a(param1, var4_int, 0)) {
            return var4_int;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ad.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int b(int param0, int param1) {
        if (param1 != 11619) {
          return -123;
        }
        if (!this.a((byte) 73, param0)) {
          return 0;
        }
        if (null != this.field_h[param0]) {
          return 100;
        }
        return this.field_c.a(-48, param0);
    }

    ad(rf param0, boolean param1, int param2) {
        this.field_a = null;
        try {
          if (0 > param2 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_b = param1 ? true : false;
          this.field_e = param2;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3, String param4, String param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_32_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          int stackIn_75_0 = 0;
          int stackIn_82_0 = 0;
          int stackIn_86_0 = 0;
          int stackIn_96_0 = 0;
          int stackIn_98_0 = 0;
          RuntimeException stackIn_101_0 = null;
          StringBuilder stackIn_101_1 = null;
          String stackIn_102_2 = null;
          StringBuilder stackIn_104_1 = null;
          String stackIn_105_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            if (null == ol.field_g &&
              !cb.a(param1 ^ 665, param3)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (dk.field_h == ii.field_r) {
              if (!param3) {
                pj.field_b = h.a(param1 ^ -739, false, param4, param5);
              } else {
                var11 = (String) null;
                pj.field_b = sk.a(param4, ia.field_f, false, true, (String) null);
              }
              gf.field_c.field_h = 0;
              gf.field_c.b(14, -49152);
              gf.field_c.b(pj.field_b.a(false).field_b, -49152);
              al.a((byte) -71, -1);
              dk.field_h = kh.field_a;
            }
            if (dk.field_h == kh.field_a &&
              hj.a(1, true)) {
              var6_int = MonkeyPuzzle2.field_D.a((byte) 114);
              if (var6_int != 0) {
                dk.field_h = dk.field_d;
                rc.field_f = -1;
                wk.field_a = var6_int;
              } else {
                dk.field_h = aa.field_b;
              }
              MonkeyPuzzle2.field_D.field_h = 0;
            }
            if (aa.field_b == dk.field_h &&
              hj.a(8, true)) {
              ld.field_a = MonkeyPuzzle2.field_D.i(127);
              MonkeyPuzzle2.field_D.field_h = 0;
              ki.a(param0, pj.field_b, true, param3, param2);
              dk.field_h = qk.field_c;
            }
            boolean decompiledFrameRemainder0 = true;
            if (qk.field_c == dk.field_h &&
              hj.a(1, true)) {
              var6_intLifetime1 = MonkeyPuzzle2.field_D.a((byte) 114);
              df.field_o = null;
              wk.field_a = var6_intLifetime1;
              MonkeyPuzzle2.field_D.field_h = 0;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  dk.field_h = dk.field_d;
                  rc.field_f = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  gk.a(-1);
                  ck.field_e = false;
                  stackIn_32_0 = var6_intLifetime1;
                  return stackIn_32_0;
                }
              }
              if (decompiledFrameRemainder0) {
                dk.field_h = ea.field_a;
                rc.field_f = -1;
              }
            }
            if (dk.field_h == ea.field_a &&
              gb.a(true)) {
              ia.field_f = MonkeyPuzzle2.field_D.i(103);
              ec.field_d = MonkeyPuzzle2.field_D.a((byte) 114);
              MonkeyPuzzle2.field_D.a((byte) 114);
              af.field_c = MonkeyPuzzle2.field_D.j(17277);
              var6 = MonkeyPuzzle2.field_D.g(-1185292952);
              var7 = MonkeyPuzzle2.field_D.a((byte) 114);
              if ((1 & var7) != 0) {
                gd.b(-594181854);
              }
              if (!param3) {
                stackIn_43_0 = ((8 & var7) != 0);
                rh.field_B = stackIn_43_0;
                stackIn_46_0 = (0 != (var7 & 4));
                fj.field_J = stackIn_46_0;
                if (rh.field_B) {
                }
              }
              if (me.field_e) {
                MonkeyPuzzle2.field_D.a((byte) 114);
                MonkeyPuzzle2.field_D.a((byte) 114);
                MonkeyPuzzle2.field_D.e(param1 ^ 756);
                il.field_h = MonkeyPuzzle2.field_D.j(param1 + 16627);
                il.field_g = new byte[il.field_h];
                for (var8 = 0; il.field_h > var8; var8++) {
                  il.field_g[var8] = MonkeyPuzzle2.field_D.k(-91);
                }
              }
              cl.field_e = MonkeyPuzzle2.field_D.f(-1);
              var12 = (CharSequence) ((Object) cl.field_e);
              uj.field_f = pl.a((byte) 109, var12);
              ue.field_G = MonkeyPuzzle2.field_D.a((byte) 114);
              dk.field_h = wh.field_b;
              if (pj.field_b.a(false) != te.field_a) {
                if (pj.field_b.a(false) == sj.field_g) {
                  dh.field_d.a(false, ii.a(false));
                }
              } else {
                oe.field_l.a(false, ii.a(false));
              }
              ck.field_e = false;
              if (var6 != null) {
                pe.a(var6, (byte) -108, ii.a(false));
              }
              if (af.field_c <= 0 &&
                !fj.field_J) {
                try {
                  mf.a(-26159, "unzap", ii.a(false));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  mf.a(126, "zap", ii.a(false), new Object[]{mk.a(ia.field_f, 480)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (af.field_c > 0) {
                mb.field_c = true;
              }
              gf.field_c.a(e.field_b, param1 ^ 650);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                e.field_b[var8Lifetime1] = e.field_b[var8Lifetime1] + 50;
              }
              MonkeyPuzzle2.field_D.a(e.field_b, 0);
              stackIn_75_0 = wk.field_a;
              return stackIn_75_0;
            }
            if (dk.field_h == dk.field_d &&
              gb.a(true)) {
              gk.a(param1 - 651);
              if (wk.field_a == 7 &&
                !ck.field_e) {
                ck.field_e = true;
                stackIn_82_0 = -1;
                return stackIn_82_0;
              }
              if (wk.field_a == 7) {
                wk.field_a = 3;
              }
              sl.field_n = MonkeyPuzzle2.field_D.f(-1);
              ck.field_e = false;
              stackIn_86_0 = wk.field_a;
              return stackIn_86_0;
            }
            if (param1 != 650) {
              var10 = (String) null;
              ad.a(-115, 60, false, false, (String) null, (String) null);
            }
            if (ol.field_g == null) {
              if (ck.field_e) {
                if (30000L >= wf.a(84)) {
                  sl.field_n = hh.field_p;
                } else {
                  sl.field_n = kj.field_E;
                }
                ck.field_e = false;
                stackIn_96_0 = 3;
                return stackIn_96_0;
              }
              var6_intLifetime2 = cg.field_g;
              cg.field_g = id.field_m;
              id.field_m = var6_intLifetime2;
              ck.field_e = true;
            }
            stackIn_98_0 = -1;
            return stackIn_98_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_101_0 = var6_ref;
            stackIn_101_1 = new StringBuilder().append("ad.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_102_2 = "null";
            } else {
              stackIn_102_2 = "{...}";
            }
            stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',');
            if (param5 == null) {
              stackIn_105_2 = "null";
            } else {
              stackIn_105_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -81) {
            this.c((String) (this.field_h[13]), (byte) 11);
          }
          if (!this.a(85)) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_a.field_b.a(true, ra.a((byte) -117, var4));
          stackIn_7_0 = this.b(var3_int, 11619);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ad.Q(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        field_d = "This password contains your email address, and would be easy to guess";
        field_k = "This entry doesn't match";
        field_g = new int[5];
        field_j = "Use this alternative as your account name";
        for (var0 = 0; field_g.length > var0; var0++) {
          if (var0 == 0) {
            field_g[var0] = 20 * (var0 + 1) << 16;
          } else {
            field_g[var0] = var0 * 51 + 51 << 16;
          }
          if (2 < var0) {
            field_g[var0] = bd.a(field_g[var0], (-2 + var0) * 22 << 8);
          }
        }
        field_f = "Your email address is used to identify this account";
    }
}
