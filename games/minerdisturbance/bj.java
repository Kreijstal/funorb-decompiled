/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static gj field_h;
    private vb field_g;
    private int field_j;
    private g field_f;
    static long field_a;
    static ci field_e;
    private Object[][] field_b;
    static String field_c;
    private Object[] field_i;
    private boolean field_d;

    final synchronized boolean a(byte param0) {
        if (this.field_f == null) {
          this.field_f = this.field_g.a((byte) 53);
          if (null == this.field_f) {
            return false;
          }
          this.field_i = new Object[this.field_f.field_c];
          this.field_b = new Object[this.field_f.field_c][];
        }
        if (param0 < 81) {
          this.field_j = -108;
          return true;
        }
        return true;
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 != -31132) {
          return;
        }
        if (this.field_d) {
          this.field_i[param1] = this.field_g.a(113, param1);
        } else {
          this.field_i[param1] = qh.a((byte) 112, false, this.field_g.a(-125, param1));
        }
    }

    private final synchronized boolean a(int param0, int param1) {
        if (!this.a((byte) 124)) {
          return false;
        }
        if (param1 <= param0 &&
          param0 < this.field_f.field_f.length &&
          0 != this.field_f.field_f[param0]) {
          return true;
        }
        if (!em.field_x) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 84)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          var4 = -47 % ((param0 - 66) / 59);
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var3_int = this.field_f.field_s.a((byte) -71, jh.a(var5, 0));
          if (this.a(var3_int, 0)) {
            return var3_int;
          }
          stackIn_6_0 = -1;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("bj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        int var4 = -107 / ((6 - param3) / 48);
        return s.a(-27911);
    }

    final synchronized byte[] e(int param0, int param1) {
        if (!this.a((byte) 106)) {
          return null;
        }
        if (1 == this.field_f.field_f.length) {
          return this.a(false, 0, param0);
        }
        if (!this.a(param0, 0)) {
          return null;
        }
        if (param1 == this.field_f.field_f[param0]) {
          return this.a(false, param0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param2, param0, param1 - 4397)) {
          return false;
        }
        if (this.field_b[param0] != null &&
          null != this.field_b[param0][param2]) {
          return true;
        }
        if (param1 != 4397) {
          field_c = (String) null;
        }
        if (this.field_i[param0] != null) {
          return true;
        }
        this.c(-31132, param0);
        if (null == this.field_i[param0]) {
          return false;
        }
        return true;
    }

    final boolean b(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 99)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var3_int = this.field_f.field_s.a((byte) -71, jh.a(var5, 0));
          if (param0) {
            var4 = (String) null;
            this.a(-56, (String) null);
          }
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("bj.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        boolean stackIn_38_2 = false;
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
        sb var26 = null;
        byte[] var27 = null;
        sb var29 = null;
        sb var31 = null;
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
        var22 = MinerDisturbance.field_ab;
        try {
          if (!this.a(param0, 0)) {
            return false;
          }
          if (null == this.field_i[param0]) {
            return false;
          }
          var5_int = this.field_f.field_d[param0];
          var34 = this.field_f.field_p[param0];
          var24 = var34;
          var6 = var24;
          if (null == this.field_b[param0]) {
            array$0 = new Object[this.field_f.field_f[param0]];
            this.field_b[param0] = array$0;
          }
          var7 = this.field_b[param0];
          if (param2 > -118) {
            return true;
          }
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (null != var6) {
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
          if (null != param3 && (param3[0] != 0 ||
            param3[1] != 0 ||
            0 != param3[2] ||
            param3[3] != 0)) {
            var35 = sc.a(true, true, this.field_i[param0]);
            var25 = var35;
            var9 = var25;
            var26 = new sb(var35);
            var26.a(5, var26.field_u.length, param3, true);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = sc.a(false, true, this.field_i[param0]);
          }
          try {
            var36 = in.a(var9, 0);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_37_0 = var11_ref_RuntimeException;
            stackIn_37_1 = new StringBuilder();
            stackIn_38_2 = (param3 != null);
            throw lj.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(" ").append(param0).append(" ").append(var9.length).append(" ").append(gn.a(var9.length, var9, true)).append(" ").append(gn.a(var9.length - 2, var9, true)).append(" ").append(this.field_f.field_h[param0]).append(" ").append(this.field_f.field_b).toString());
          }
          if (this.field_d) {
            this.field_i[param0] = null;
          }
          if (var5_int > 1) {
            if (this.field_j == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * var5_int * var12;
              var29 = new sb(var43);
              var14_int = 0;
              var29.field_o = var11;
              var15_int = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.b((byte) 81);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (param1 == var19) {
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
              var29.field_o = var11;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var18Lifetime3 < var12; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var29.b((byte) 97);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (param1 == var21) {
                    ai.a(var43, var17Lifetime4, var44, var14_intLifetime1, var19Lifetime2);
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
            var11 = var11 - 4 * (var12Lifetime1 * var5_int);
            var31 = new sb(var43);
            var39 = new int[var5_int];
            var32 = var39;
            var14 = var32;
            var31.field_o = var11;
            for (var15_intLifetime1 = 0; var12Lifetime1 > var15_intLifetime1; var15_intLifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var31.b((byte) 47);
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
            var31.field_o = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var12Lifetime1 > var17Lifetime2; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var5_int > var19Lifetime1; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var31.b((byte) 61);
                ai.a(var43, var16Lifetime3, var40[var19Lifetime1], var39[var19Lifetime1], var18Lifetime1);
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 != null) {
                var18Lifetime2 = var34[var17Lifetime3];
              } else {
                var18Lifetime2 = var17Lifetime3;
              }
              if (this.field_j != 0) {
                var7[var18Lifetime2] = var40[var17Lifetime3];
              } else {
                var7[var18Lifetime2] = qh.a((byte) 112, false, var40[var17Lifetime3]);
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_j == 0) {
              var7[var11] = qh.a((byte) 112, false, var43);
            } else {
              var7[var11] = var36;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("bj.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_9_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        String var7 = null;
        byte[] var8 = null;
        try {
          if (!this.b(param2, param1, 0)) {
            return null;
          }
          var5 = null;
          if ((this.field_b[param1] == null ||
            null == this.field_b[param1][param2]) && !this.a(param1, param2, param3 + 21211, param0)) {
            this.c(-31132, param1);
            if (!this.a(param1, param2, -119, param0)) {
              stackIn_9_0 = null;
              return (byte[]) (stackIn_9_0);
            }
          }
          if (param3 != -21331) {
            var7 = (String) null;
            this.a(-106, (String) null);
          }
          if (this.field_b[param1] == null) {
            throw new RuntimeException("");
          }
          if (this.field_b[param1][param2] != null) {
            var8 = sc.a(false, true, this.field_b[param1][param2]);
            var5 = var8;
            if (var8 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_j == 1) {
              this.field_b[param1][param2] = null;
              if (1 == this.field_f.field_f[param1]) {
                this.field_b[param1] = null;
              }
            } else {
              if (this.field_j == 2) {
                this.field_b[param1] = null;
              }
            }
          }
          stackIn_26_0 = var5;
          return (byte[]) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("bj.H(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw lj.a((Throwable) (stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(param1, 0)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (param2 > -46) {
            this.field_d = false;
          }
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var4_int = this.field_f.field_n[param1].a((byte) -71, jh.a(var5, 0));
          if (this.b(var4_int, param1, 0)) {
            stackIn_9_0 = var4_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("bj.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean d(int param0, int param1) {
        if (!this.a(param0, param1)) {
          return false;
        }
        if (this.field_i[param0] != null) {
          return true;
        }
        this.c(-31132, param0);
        if (this.field_i[param0] != null) {
          return true;
        }
        return false;
    }

    final byte[] a(boolean param0, int param1, int param2) {
        if (param0) {
          this.e(-122, 54);
        }
        return this.a((int[]) null, param1, param2, -21331);
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 127)) {
            return false;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_f.field_s.a((byte) -71, jh.a(var6, param2 ^ param2));
          if (!this.a(var4_int, param2 + 16675)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_f.field_n[var4_int].a((byte) -71, jh.a(var7, param2 + 16675));
          stackIn_7_0 = this.a(var4_int, 4397, var5);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("bj.C(");
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
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final int b(byte param0) {
        if (!this.a((byte) 124)) {
          return -1;
        }
        if (param0 != -71) {
          bj.a(111);
        }
        return this.field_f.field_f.length;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a((byte) 101)) {
          return false;
        }
        if (param1 >= param2 &&
          param0 >= 0 &&
          param1 < this.field_f.field_f.length &&
          param0 < this.field_f.field_f[param1]) {
          return true;
        }
        if (em.field_x) {
          throw new IllegalArgumentException(param1 + " " + param0);
        }
        return false;
    }

    final synchronized boolean b(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        String var6;
        var5 = MinerDisturbance.field_ab;
        if (param0 != -1) {
          var6 = (String) null;
          this.a(122, (String) null);
        }
        if (!this.a((byte) 98)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; this.field_f.field_t.length > var3; var3++) {
          var4 = this.field_f.field_t[var3];
          if (this.field_i[var4] == null) {
            this.c(-31132, var4);
            if (null == this.field_i[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        wh var4 = null;
        CharSequence var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 121)) {
            return false;
          }
          param1 = param1.toLowerCase();
          if (param0) {
            var4 = (wh) null;
            bj.a(22, (wh) null);
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = this.field_f.field_s.a((byte) -71, jh.a(var5, 0));
          stackIn_7_0 = this.d(var3_int, 0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("bj.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int a(String param0, int param1) {
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
          if (param1 >= -117) {
            ((long[]) (((Object[]) (this.field_i[18]))[9]))[0] = 121L;
          }
          if (!this.a((byte) 94)) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_f.field_s.a((byte) -71, jh.a(var4, 0));
          stackIn_6_0 = this.a(var3_int, true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("bj.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 121)) {
            return null;
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_f.field_s.a((byte) -71, jh.a(var6, 0));
          if (!this.a(var4_int, param1 ^ 0)) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_f.field_n[var4_int].a((byte) -71, jh.a(var7, param1));
          stackIn_7_0 = this.a(false, var4_int, var5);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("bj.Q(");
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
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    bj(vb param0, boolean param1, int param2) {
        this.field_f = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_d = param1 ? true : false;
          this.field_g = param0;
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "bj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int a(int param0, boolean param1) {
        if (!this.a(param0, 0)) {
          return 0;
        }
        if (this.field_i[param0] != null) {
          return 100;
        }
        if (!param1) {
          return -119;
        }
        return this.field_g.a((byte) 125, param0);
    }

    public static void c(byte param0) {
        field_c = null;
        int var1 = 30 % ((param0 - 18) / 38);
        field_e = null;
        field_h = null;
    }

    final static void a(int param0) {
        if (sj.field_h != null) {
          sj.field_h.s(2121792);
        }
        bh.field_Z = new lm();
        if (param0 != 0) {
          return;
        }
        de.field_a.a((byte) -103, (fe) (bh.field_Z));
    }

    final int b(int param0, int param1) {
        if (!this.a(param0, param1 ^ param1)) {
          return 0;
        }
        return this.field_f.field_f[param0];
    }

    final static void a(int param0, wh param1) {
        try {
          mk.a(true, param1, 0);
          if (param0 != -6358) {
            field_c = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "bj.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized int c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = MinerDisturbance.field_ab;
        if (!this.a((byte) 107)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_i.length; var4++) {
          if (this.field_f.field_d[var4] > 0) {
            var3 = var3 + this.a(var4, true);
            var2 += 100;
          }
        }
        if (param0 != -14858) {
          this.field_f = (g) null;
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    static {
        field_h = new gj();
    }
}
