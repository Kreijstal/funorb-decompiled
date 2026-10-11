/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    private Object[][] field_h;
    static int field_a;
    private Object[] field_i;
    private hk field_b;
    private t field_e;
    static String[] field_j;
    static String field_c;
    static int[] field_g;
    boolean field_f;
    int field_d;

    final int a(String param0, boolean param1) {
        boolean discarded$1 = false;
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
          if (!this.c(97)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          if (!param1) {
            discarded$1 = this.a(-27, (int[]) null, true, ((int[]) (((Object[]) (this.field_i[4]))[7]))[23]);
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_e.field_r.a(-114, g.a(-1, var4));
          stackIn_6_0 = this.e(-11337, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ah.CA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean f(int param0, int param1) {
        if (param1 <= 30) {
          return true;
        }
        if (!this.c(105)) {
          return false;
        }
        if (this.field_e.field_d.length == 1) {
          return this.a((byte) -30, 0, param0);
        }
        if (!this.a((byte) 119, param0)) {
          return false;
        }
        if (this.field_e.field_d[param0] == 1) {
          return this.a((byte) -30, param0, 0);
        }
        throw new RuntimeException();
    }

    final byte[] a(int param0, int param1, int param2) {
        int var4 = 8 / ((-45 - param0) / 33);
        return this.a(-2, (int[]) null, param2, param1);
    }

    final int a(int param0) {
        boolean discarded$0 = false;
        if (!this.c(94)) {
          return -1;
        }
        if (param0 != -1) {
          int[] var3 = (int[]) null;
          discarded$0 = this.a(((int[]) (((Object[]) (this.field_i[0]))[4]))[0], (int[]) null, false, 120);
        }
        return this.field_e.field_d.length;
    }

    final static oh[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        oh var16 = null;
        int[] var18 = ra.field_b;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = ra.field_f;
        int var8 = ra.field_e;
        oh var9 = new oh(param1, -(param1 * 2) + param5);
        var9.c();
        ra.b(0, 0, param1, param5 - param1 * 2, param4, param2);
        oh var10 = new oh(param1, param1);
        var10.c();
        ra.c(0, 0, param1, param1, param4);
        oh var11 = new oh(16, param1);
        var11.c();
        ra.c(0, 0, 16, param1, param4);
        oh var12 = new oh(param1, param1);
        var12.c();
        ra.c(0, 0, param1, param1, param2);
        oh var13 = new oh(16, param1);
        var13.c();
        ra.c(0, 0, param3, param1, param2);
        Object var14 = null;
        if (param0 > 0) {
          var16 = new oh(16, 16);
          var14 = var16;
          var16.c();
          ra.c(0, 0, 16, 16, param0);
        }
        ra.a(var18, var7, var8);
        return new oh[]{var10, var11, var10, var9, (oh) (var14), var9, var12, var13, var12};
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(111)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_e.field_r.a(84, g.a(-1, var4));
          if (param1 <= -61) {
            stackIn_7_0 = this.d(var3_int, 0);
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ah.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int e(int param0, int param1) {
        if (!this.a((byte) 119, param1)) {
          return 0;
        }
        if (null != this.field_i[param1]) {
          return 100;
        }
        if (param0 != -11337) {
          this.field_e = (t) (this.field_i[9]);
        }
        return this.field_b.a(param1, 0);
    }

    private final synchronized void b(byte param0, int param1) {
        if (!this.field_f) {
          this.field_i[param1] = ik.a(this.field_b.b(20396, param1), false, param0 - 134);
        } else {
          this.field_i[param1] = this.field_b.b(20396, param1);
        }
        if (param0 != -3) {
          this.a(((boolean[]) (this.field_i[4]))[5]);
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        byte[] stackIn_13_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param2, (byte) -72, param3)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((this.field_h[param2] == null ||
            null == this.field_h[param2][param3]) && !this.a(param2, param1, false, param3)) {
            this.b((byte) -3, param2);
            if (!this.a(param2, param1, false, param3)) {
              return null;
            }
          }
          if (param0 != -2) {
            stackIn_13_0 = (byte[]) null;
            return stackIn_13_0;
          }
          if (this.field_h[param2] == null) {
            throw new RuntimeException("");
          }
          if (this.field_h[param2][param3] != null) {
            var7 = vj.a(false, (byte) -28, this.field_h[param2][param3]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_d != 1) {
              if (this.field_d == 2) {
                this.field_h[param2] = null;
              }
            } else {
              this.field_h[param2][param3] = null;
              if (this.field_e.field_d[param2] == 1) {
                this.field_h[param2] = null;
              }
            }
          }
          stackIn_28_0 = var5;
          return (byte[]) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("ah.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw oi.a((Throwable) (stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean c(int param0) {
        if (param0 <= 87) {
          ah.a(103, -121, ((int[]) (this.field_i[4]))[43], -50, ((int[]) (this.field_i[4]))[7], 99);
        }
        if (null != this.field_e) {
          return true;
        }
        this.field_e = this.field_b.a(0);
        if (null == this.field_e) {
          return false;
        }
        this.field_i = new Object[this.field_e.field_i];
        this.field_h = new Object[this.field_e.field_i][];
        return true;
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        if (!this.c(param1 + 178)) {
          return false;
        }
        if (param1 != -72) {
          ((boolean[]) (this.field_i[30]))[8] = true;
        }
        if (0 <= param0 &&
          param2 >= 0 &&
          this.field_e.field_d.length > param0 &&
          param2 < this.field_e.field_d[param0]) {
          return true;
        }
        if (ec.field_k) {
          throw new IllegalArgumentException(param0 + " " + param2);
        }
        return false;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(88)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_e.field_r.a(-115, g.a(param1 - 1, var4));
          if (var3_int >= param1) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ah.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        if (param0 != -23126) {
          this.e(1, 109);
        }
        if (!this.a((byte) 119, param1)) {
          return 0;
        }
        return this.field_e.field_d[param1];
    }

    private final synchronized boolean a(int param0, int[] param1, boolean param2, int param3) {
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
        bh var26 = null;
        byte[] var27 = null;
        bh var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        bh var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = TetraLink.field_J;
        try {
          if (!this.a((byte) 119, param0)) {
            return false;
          }
          if (null == this.field_i[param0]) {
            return false;
          }
          var5_int = this.field_e.field_m[param0];
          var34 = this.field_e.field_a[param0];
          var24 = var34;
          var6 = var24;
          if (null == this.field_h[param0]) {
            array$0 = new Object[this.field_e.field_d[param0]];
            this.field_h[param0] = array$0;
          }
          if (param2) {
            return false;
          }
          var7 = this.field_h[param0];
          var8 = 1;
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
          if (param1 != null && (param1[0] != 0 ||
            0 != param1[1] ||
            param1[2] != 0 ||
            param1[3] != 0)) {
            var35 = vj.a(true, (byte) -28, this.field_i[param0]);
            var25 = var35;
            var9 = var25;
            var26 = new bh(var35);
            var26.a(-25351, param1, var26.field_u.length, 5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = vj.a(false, (byte) -28, this.field_i[param0]);
          }
          try {
            var36 = pk.a(var9, (byte) 88);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_38_0 = var11_ref_RuntimeException;
            stackIn_38_1 = new StringBuilder();
            stackIn_39_2 = (param1 != null);
            throw oi.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(" ").append(param0).append(" ").append(var9.length).append(" ").append(ti.a(var9, (byte) 92, var9.length)).append(" ").append(ti.a(var9, (byte) -15, -2 + var9.length)).append(" ").append(this.field_e.field_u[param0]).append(" ").append(this.field_e.field_v).toString());
          }
          if (this.field_f) {
            this.field_i[param0] = null;
          }
          if (var5_int > 1) {
            if (this.field_d == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var12 * var5_int * 4;
              var32 = new bh(var43);
              var14 = 0;
              var32.field_t = var11;
              var15 = 0;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var32.f(-124);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (param3 == var19) {
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
              var32.field_t = var11;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19 = var19 + var32.f(48);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (var21 == param3) {
                    rd.a(var43, var17, var44, var14Lifetime1, var19);
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
              var29 = new bh(var43);
              var29.field_t = var11;
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              for (var15 = 0; var15 < var12; var15++) {
                var16 = 0;
                for (var17 = 0; var5_int > var17; var17++) {
                  var16 = var16 + var29.f(-112);
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
              var29.field_t = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var29.f(-111);
                  rd.a(var43, var16, var39[var19], var38[var19], var18);
                  var16 = var16 + var18;
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 != null) {
                  var18 = var34[var17];
                } else {
                  var18 = var17;
                }
                if (this.field_d != 0) {
                  var7[var18] = var39[var17];
                } else {
                  var7[var18] = ik.a(var39[var17], false, -137);
                }
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (0 == this.field_d) {
              var7[var11] = ik.a(var36, false, -137);
              return true;
            }
            var7[var11] = var43;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_107_0 = var5;
          stackIn_107_1 = new StringBuilder().append("ah.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_g = null;
        field_c = null;
        field_j = null;
        if (param0 != 16) {
          field_j = (String[]) null;
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
          if (!this.c(121)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_e.field_r.a(-85, g.a(param0, var4));
          if (this.a((byte) 119, var3_int)) {
            return var3_int;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ah.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final synchronized boolean a(boolean param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = TetraLink.field_J;
        if (!this.c(95)) {
          return false;
        }
        var2 = 1;
        if (param0) {
          return true;
        }
        for (var3 = 0; this.field_e.field_j.length > var3; var3++) {
          var4 = this.field_e.field_j[var3];
          if (null == this.field_i[var4]) {
            this.b((byte) -3, var4);
            if (null == this.field_i[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final synchronized int[] c(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = TetraLink.field_J;
        if (!this.a((byte) 119, param0)) {
          return null;
        }
        int[] var3 = this.field_e.field_a[param0];
        if (var3 == null) {
          var6 = new int[this.field_e.field_m[param0]];
          var3 = var6;
          for (var4 = 0; var6.length > var4; var4++) {
            var6[var4] = var4;
          }
        }
        if (param1 != 0) {
          this.f(((int[]) (this.field_i[1]))[2], -20);
        }
        return var3;
    }

    final boolean a(String param0, int param1, String param2) {
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
          if (param1 >= -114) {
            return false;
          }
          if (!this.c(98)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_e.field_r.a(60, g.a(-1, var6));
          if (!this.a((byte) 119, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_e.field_n[var4_int].a(-81, g.a(-1, var7));
          stackIn_10_0 = this.a((byte) -30, var4_int, var5);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ah.W(");
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
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (param0 != 119) {
          this.e(-56, -114);
        }
        if (!this.c(104)) {
          return false;
        }
        if (param1 >= 0 &&
          param1 < this.field_e.field_d.length &&
          this.field_e.field_d[param1] != 0) {
          return true;
        }
        if (ec.field_k) {
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final int a(int param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 119, param0)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param2 = param2.toLowerCase();
          if (param1) {
            var5 = (String) null;
            this.a((String) null, 39);
          }
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_e.field_n[param0].a(83, g.a(-1, var6));
          if (this.a(param0, (byte) -72, var4_int)) {
            return var4_int;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ah.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param1, (byte) -72, param2)) {
          return false;
        }
        if (null != this.field_h[param1] &&
          null != this.field_h[param1][param2]) {
          return true;
        }
        if (this.field_i[param1] != null) {
          return true;
        }
        this.b((byte) -3, param1);
        if (null != this.field_i[param1]) {
          return true;
        }
        if (param0 != -30) {
          return false;
        }
        return false;
    }

    final synchronized boolean d(int param0, int param1) {
        if (!this.a((byte) 119, param0)) {
          return false;
        }
        if (this.field_i[param0] != null) {
          return true;
        }
        if (param1 != 0) {
          ah.d(74);
        }
        this.b((byte) -3, param0);
        if (null == this.field_i[param0]) {
          return false;
        }
        return true;
    }

    ah(hk param0, boolean param1, int param2) {
        this.field_e = null;
        try {
          if (param2 < 0 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_f = param1 ? true : false;
          this.field_b = param0;
          this.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ah.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = TetraLink.field_J;
        if (!this.c(89)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_i.length > var4; var4++) {
          if (0 < this.field_e.field_m[var4]) {
            var3 = var3 + this.e(-11337, var4);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        if (param0 != 22300) {
          return ((int[]) (((Object[]) (this.field_i[0]))[1]))[7];
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final synchronized byte[] a(String param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(97)) {
            return null;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_e.field_r.a(102, g.a(-1, var6));
          if (!this.a((byte) 119, var4_int)) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (!param2) {
            field_j = (String[]) null;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_e.field_n[var4_int].a(-119, g.a(-1, var7));
          stackIn_9_0 = this.a(-127, var5, var4_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ah.R(");
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
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!this.c(113)) {
          return null;
        }
        if (param0 != 0) {
          this.a((byte) -43, 44, -77);
        }
        if (this.field_e.field_d.length == 1) {
          return this.a(8, param1, 0);
        }
        if (!this.a((byte) 119, param1)) {
          return null;
        }
        if (this.field_e.field_d[param1] == 1) {
          return this.a(103, 0, param1);
        }
        throw new RuntimeException();
    }

    static {
        field_c = "Owner";
        field_g = new int[128];
    }
}
