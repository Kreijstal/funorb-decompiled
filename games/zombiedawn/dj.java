/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    private Object[] field_j;
    static vo field_l;
    private int field_d;
    private w field_h;
    static String field_a;
    private boolean field_f;
    static vo field_m;
    static int[] field_g;
    private Object[][] field_c;
    static hi field_e;
    private jh field_b;
    static vn[] field_k;
    static int[] field_i;

    private final synchronized boolean a(int[] param0, int param1, int param2, byte param3) {
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
        String var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        de var27 = null;
        byte[] var28 = null;
        de var30 = null;
        de var32 = null;
        int[] var33 = null;
        byte[][] var34 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int var14_intLifetime1;
        var22 = ZombieDawn.field_J;
        try {
          if (!this.b(param2, (byte) -82)) {
            return false;
          }
          if (this.field_j[param2] == null) {
            return false;
          }
          var5_int = this.field_b.field_t[param2];
          var35 = this.field_b.field_p[param2];
          var25 = var35;
          var6 = var25;
          if (this.field_c[param2] == null) {
            array$0 = new Object[this.field_b.field_d[param2]];
            this.field_c[param2] = array$0;
          }
          var7 = this.field_c[param2];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var35[var9_int];
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
          if (param0 != null && (param0[0] != 0 ||
            param0[1] != 0 ||
            0 != param0[2] ||
            param0[3] != 0)) {
            var36 = ag.a(this.field_j[param2], (byte) 125, true);
            var26 = var36;
            var9 = var26;
            var27 = new de(var36);
            var27.a(153818020, var27.field_h.length, param0, 5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = ag.a(this.field_j[param2], (byte) 88, false);
          }
          if (param3 > -28) {
            var23 = (String) null;
            this.a((String) (this.field_j[2]), -6, (String) null);
          }
          try {
            var37 = va.a((byte) -112, var9);
            var28 = var37;
            var24 = var28;
            var44 = var24;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_38_0 = var11_ref_RuntimeException;
            stackIn_38_1 = new StringBuilder();
            stackIn_39_2 = (param0 != null);
            throw sh.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(" ").append(param2).append(" ").append(var9.length).append(" ").append(ii.a(8099, var9.length, var9)).append(" ").append(ii.a(8099, var9.length - 2, var9)).append(" ").append(this.field_b.field_j[param2]).append(" ").append(this.field_b.field_m).toString());
          }
          if (this.field_f) {
            this.field_j[param2] = null;
          }
          if (1 < var5_int) {
            if (this.field_d == 2) {
              var11 = var37.length;
              var11--;
              var12 = 255 & var24[var11];
              var11 = var11 - var12 * (var5_int * 4);
              var30 = new de(var44);
              var14_int = 0;
              var30.field_j = var11;
              var15_int = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var30.c(100);
                  if (var6 != null) {
                    var19 = var35[var18];
                  } else {
                    var19 = var18;
                  }
                  if (var19 == param1) {
                    var14_int = var14_int + var17;
                    var15_int = var19;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var45 = new byte[var14_int];
              var14_intLifetime1 = 0;
              var30.field_j = var11;
              var17 = 0;
              for (var18 = 0; var12 > var18; var18++) {
                var19 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19 = var19 + var30.c(-44);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var35[var20];
                  }
                  if (var21 == param1) {
                    gp.a(var44, var17, var45, var14_intLifetime1, var19);
                    var14_intLifetime1 = var14_intLifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15_int] = var45;
            } else {
              var11 = var37.length;
              var11--;
              var12 = 255 & var24[var11];
              var11 = var11 - 4 * (var12 * var5_int);
              var32 = new de(var44);
              var40 = new int[var5_int];
              var33 = var40;
              var14 = var33;
              var32.field_j = var11;
              for (var15_int = 0; var15_int < var12; var15_int++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var32.c(124);
                  var14[var17] = var14[var17] + var16;
                }
              }
              var41 = new byte[var5_int][];
              var34 = var41;
              var15 = var34;
              for (var16 = 0; var16 < var5_int; var16++) {
                array$1 = new byte[var40[var16]];
                var15[var16] = array$1;
                var40[var16] = 0;
              }
              var32.field_j = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var5_int > var19; var19++) {
                  var18 = var18 + var32.c(-48);
                  gp.a(var44, var16, var41[var19], var40[var19], var18);
                  var14[var19] = var14[var19] + var18;
                  var16 = var16 + var18;
                }
              }
              for (var17 = 0; var5_int > var17; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var35[var17];
                }
                if (this.field_d != 0) {
                  var7[var18] = var41[var17];
                } else {
                  var7[var18] = el.a((byte) 94, false, var41[var17]);
                }
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var35[0];
            }
            if (this.field_d != 0) {
              var7[var11] = var37;
              return true;
            }
            var7[var11] = el.a((byte) 94, false, var44);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_107_0 = var5;
          stackIn_107_1 = new StringBuilder().append("dj.A(");
          if (param0 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 73)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 >= -9) {
            this.a(76, (byte) -89, 2);
          }
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_b.field_g.a(1, tc.a(var6, 14));
          if (!this.b(var4_int, (byte) -82)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_b.field_a[var4_int].a(1, tc.a(var7, 14));
          stackIn_9_0 = this.a(var5, (byte) -128, var4_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("dj.B(");
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
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final int d(int param0) {
        if (!this.a((byte) 73)) {
          return -1;
        }
        if (param0 != -1) {
          field_l = (vo) null;
        }
        return this.field_b.field_d.length;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (param3 < 124) {
            this.field_b = (jh) (((Object[]) (this.field_j[16]))[1]);
          }
          if (!this.a(param1, param2, 105)) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          var5 = null;
          if ((this.field_c[param2] == null ||
            this.field_c[param2][param1] == null) && !this.a(param0, param1, param2, (byte) -57)) {
            this.c(4, param2);
            if (!this.a(param0, param1, param2, (byte) -85)) {
              stackIn_11_0 = null;
              return (byte[]) (stackIn_11_0);
            }
          }
          if (this.field_c[param2] == null) {
            throw new RuntimeException("");
          }
          if (null != this.field_c[param2][param1]) {
            var7 = ag.a(this.field_c[param2][param1], (byte) 98, false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 != this.field_d) {
              if (this.field_d == 2) {
                this.field_c[param2] = null;
              }
            } else {
              this.field_c[param2][param1] = null;
              if (this.field_b.field_d[param2] == 1) {
                this.field_c[param2] = null;
              }
            }
          }
          stackIn_27_0 = var5;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("dj.D(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw sh.a((Throwable) (stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0) {
        if (param0 != 73) {
          this.field_b = (jh) (this.field_j[19]);
        }
        if (this.field_b != null) {
          return true;
        }
        this.field_b = this.field_h.b((byte) 106);
        if (null == this.field_b) {
          return false;
        }
        this.field_j = new Object[this.field_b.field_s];
        this.field_c = new Object[this.field_b.field_s][];
        return true;
    }

    final static void a(int param0) {
        String var2 = (String) null;
        jm.a((String) null, "", -901373652);
        int var1 = -106 % ((67 - param0) / 40);
    }

    final synchronized int e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = ZombieDawn.field_J;
        if (!this.a((byte) 73)) {
          return 0;
        }
        var2 = 0;
        if (param0 >= -79) {
          this.a((byte) -52, 65);
        }
        var3 = 0;
        for (var4 = 0; this.field_j.length > var4; var4++) {
          if (0 < this.field_b.field_t[var4]) {
            var3 = var3 + this.a(var4, -5366);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final int a(int param0, String param1, boolean param2) {
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
          if (!this.b(param0, (byte) -82)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          if (!param2) {
            stackIn_6_0 = 8;
            return stackIn_6_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_b.field_a[param0].a(1, tc.a(var5, 14));
          if (this.a(var4_int, param0, 126)) {
            return var4_int;
          }
          stackIn_10_0 = -1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("dj.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final int b(String param0, int param1) {
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
          if (!this.a((byte) 73)) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param1 <= 83) {
            this.field_d = -4;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_g.a(1, tc.a(var4, 14));
          stackIn_7_0 = this.a(var3_int, -5366);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dj.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!this.a(param0, param2, 113)) {
          return false;
        }
        int var4 = -105 / ((-38 - param1) / 58);
        if (this.field_c[param2] != null &&
          null != this.field_c[param2][param0]) {
          return true;
        }
        if (null != this.field_j[param2]) {
          return true;
        }
        this.c(4, param2);
        if (this.field_j[param2] == null) {
          return false;
        }
        return true;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 73)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param1 >= -82) {
            this.a((String) null, (byte) 28, (String) (this.field_j[1]));
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_b.field_g.a(1, tc.a(var6, 14));
          if (!this.b(var4_int, (byte) -82)) {
            stackIn_7_0 = null;
            return (byte[]) (stackIn_7_0);
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_b.field_a[var4_int].a(1, tc.a(var7, 14));
          stackIn_9_0 = this.a((byte) 51, var4_int, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("dj.AA(");
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
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 73)) {
            return false;
          }
          param1 = param1.toLowerCase();
          if (param0 != -1) {
            this.a(((int[]) (this.field_j[7]))[0], -46);
          }
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_b.field_g.a(1, tc.a(var4, param0 + 15));
          stackIn_7_0 = this.b(-29092, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dj.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 != 4) {
          return;
        }
        if (this.field_f) {
          this.field_j[param1] = this.field_h.a(param1, (byte) 112);
        } else {
          this.field_j[param1] = el.a((byte) 94, false, this.field_h.a(param1, (byte) 112));
        }
    }

    private final synchronized boolean b(int param0, byte param1) {
        if (param1 != -82) {
          this.c(((int[]) (this.field_j[4]))[0], 99);
        }
        if (!this.a((byte) 73)) {
          return false;
        }
        if (param0 < 0 ||
          param0 >= this.field_b.field_d.length ||
          this.field_b.field_d[param0] == 0) {
          if (sg.field_ib) {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
          return false;
        }
        return true;
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != 51) {
          this.field_d = -23;
        }
        return this.a((int[]) null, param2, param1, param0 ^ 77);
    }

    public static void b(int param0) {
        field_k = null;
        field_i = null;
        field_a = null;
        field_m = null;
        field_l = null;
        if (param0 <= 67) {
          field_e = (hi) null;
        }
        field_e = null;
        field_g = null;
    }

    final int a(byte param0, int param1) {
        if (param0 < 53) {
          return 18;
        }
        if (!this.b(param1, (byte) -82)) {
          return 0;
        }
        return this.field_b.field_d[param1];
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b(param0, (byte) -82)) {
          return 0;
        }
        if (this.field_j[param0] != null) {
          return 100;
        }
        if (param1 != -5366) {
          this.a((String) null, -127, (String) (this.field_j[4]));
        }
        return this.field_h.a(-90, param0);
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
          if (!this.a((byte) 73)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_g.a(1, tc.a(var4, 14));
          if (param1 <= var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dj.O(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        int var4;
        if (!this.a((byte) 73)) {
          return false;
        }
        if (0 <= param1 &&
          param0 >= 0 &&
          param1 < this.field_b.field_d.length &&
          param0 < this.field_b.field_d[param1]) {
          var4 = -60 % ((63 - param2) / 41);
          return true;
        }
        if (!sg.field_ib) {
          return false;
        }
        throw new IllegalArgumentException(param1 + " " + param0);
    }

    final synchronized byte[] a(int param0, byte param1) {
        if (!this.a((byte) 73)) {
          return null;
        }
        if (1 == this.field_b.field_d.length) {
          return this.a((byte) 51, 0, param0);
        }
        int var3 = 84 % ((-21 - param1) / 37);
        if (!this.b(param0, (byte) -82)) {
          return null;
        }
        if (this.field_b.field_d[param0] == 1) {
          return this.a((byte) 51, param0, 0);
        }
        throw new RuntimeException();
    }

    final int a(String param0, byte param1) {
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
          if (!this.a((byte) 73)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          if (param1 != 8) {
            field_a = (String) null;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_g.a(param1 ^ 9, tc.a(var4, 14));
          if (this.b(var3_int, (byte) -82)) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("dj.L(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean b(int param0, int param1) {
        if (!this.b(param1, (byte) -82)) {
          return false;
        }
        if (param0 != -29092) {
          return false;
        }
        if (null != this.field_j[param1]) {
          return true;
        }
        this.c(4, param1);
        if (this.field_j[param1] == null) {
          return false;
        }
        return true;
    }

    final synchronized boolean c(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = ZombieDawn.field_J;
        if (!this.a((byte) 73)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; this.field_b.field_n.length > var3; var3++) {
          var4 = this.field_b.field_n[var3];
          if (this.field_j[var4] == null) {
            this.c(param0 - 8997, var4);
            if (null == this.field_j[var4]) {
              var2 = 0;
            }
          }
        }
        if (param0 != 9001) {
          this.a(70, ((byte[]) (this.field_j[19]))[2], 26);
        }
        return var2 != 0;
    }

    dj(w param0, boolean param1, int param2) {
        this.field_b = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_f = param1 ? true : false;
          this.field_d = param2;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Passwords can only contain letters and numbers";
        field_l = new vo();
        field_i = ae.a(14821);
    }
}
