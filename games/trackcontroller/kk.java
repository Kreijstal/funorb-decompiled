/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    private pc field_b;
    private wi field_c;
    private Object[] field_d;
    private int field_i;
    private boolean field_e;
    private Object[][] field_f;
    static String field_a;
    static int field_h;
    static int[] field_g;

    private final synchronized byte[] a(int[] param0, boolean param1, int param2, int param3) {
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param1, param3, param2)) {
            return null;
          }
          var5 = null;
          if ((this.field_f[param3] == null ||
            this.field_f[param3][param2] == null) && !this.a(4, param3, param2, param0)) {
            this.d(118, param3);
            if (!this.a(4, param3, param2, param0)) {
              return null;
            }
          }
          if (this.field_f[param3] == null) {
            throw new RuntimeException("");
          }
          if (null != this.field_f[param3][param2]) {
            var7 = me.a(false, 22692, this.field_f[param3][param2]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_i != 1) {
              if (2 == this.field_i) {
                this.field_f[param3] = null;
              }
            } else {
              this.field_f[param3][param2] = null;
              if (this.field_b.field_a[param3] == 1) {
                this.field_f[param3] = null;
              }
            }
          }
          stackIn_26_0 = var5;
          return (byte[]) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("kk.L(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw sl.a((Throwable) (stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = TrackController.field_F ? 1 : 0;
        if (!this.c(-69)) {
          return false;
        }
        var2 = 1;
        if (param0 != 48) {
          return ((boolean[]) (((Object[]) (this.field_d[3]))[3]))[6];
        }
        for (var3 = 0; this.field_b.field_f.length > var3; var3++) {
          var4 = this.field_b.field_f[var3];
          if (null == this.field_d[var4]) {
            this.d(127, var4);
            if (this.field_d[var4] == null) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final synchronized boolean a(byte param0, int param1) {
        if (param0 != -40) {
          this.b(-100, ((int[]) (this.field_d[2]))[0]);
        }
        if (!this.c(71, param1)) {
          return false;
        }
        if (null != this.field_d[param1]) {
          return true;
        }
        this.d(param0 - 80, param1);
        if (null != this.field_d[param1]) {
          return true;
        }
        return false;
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!this.c(-101)) {
          return null;
        }
        if (1 == this.field_b.field_a.length) {
          return this.a(0, param0, (byte) -39);
        }
        if (!this.c(-116, param0)) {
          return null;
        }
        if (param1 != 20095) {
          return (byte[]) null;
        }
        if (this.field_b.field_a[param0] == 1) {
          return this.a(param0, 0, (byte) -82);
        }
        throw new RuntimeException();
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 >= -21) {
          field_a = (String) (this.field_d[13]);
        }
        return this.a((int[]) null, true, param1, param0);
    }

    final int b(int param0) {
        if (param0 != 0) {
          field_g = (int[]) null;
        }
        if (!this.c(-23)) {
          return -1;
        }
        return this.field_b.field_a.length;
    }

    final int a(String param0, int param1, int param2) {
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
          if (!this.c(param2 ^ 66, param1)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          if (param2 != -1) {
            this.field_d[6] = (Object) null;
          }
          var5 = (CharSequence) ((Object) param0);
          var4_int = this.field_b.field_e[param1].a(hk.a(var5, 0), param2 ^ 26555);
          if (this.a(true, param1, var4_int)) {
            return var4_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("kk.S(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = TrackController.field_F ? 1 : 0;
        if (!this.c(100)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        if (!param0) {
          field_a = (String) (this.field_d[2]);
        }
        for (var4 = 0; this.field_d.length > var4; var4++) {
          if (this.field_b.field_l[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.a(var4, -24214);
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final boolean a(String param0, String param1, byte param2) {
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
          if (!this.c(102)) {
            return false;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          if (param2 != -45) {
            ((long[]) (this.field_d[16]))[11] = -121L;
          }
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_b.field_q.a(hk.a(var6, 0), param2 - 26511);
          if (!this.c(param2 ^ -110, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_b.field_e[var4_int].a(hk.a(var7, param2 + 45), param2 - 26511);
          stackIn_10_0 = this.a(var4_int, var5, param2 ^ 44);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("kk.B(");
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
          throw sl.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(String param0, byte param1) {
        byte[] discarded$1 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(119)) {
            return false;
          }
          if (param1 != -3) {
            discarded$1 = this.a((int[]) (((Object[]) (this.field_d[43]))[6]), ((boolean[]) (((Object[]) (this.field_d[3]))[3]))[2], -64, -39);
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_q.a(hk.a(var4, 0), -26556);
          stackIn_6_0 = this.a((byte) -40, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kk.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        if (param0 >= -50) {
          kk.a(-33);
        }
        return vg.field_o;
    }

    final int a(int param0, byte param1) {
        if (!this.c(67, param0)) {
          return 0;
        }
        if (param1 != -91) {
          return 56;
        }
        return this.field_b.field_a[param0];
    }

    final int a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(92)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (!param0) {
            var4 = (String) null;
            this.a(true, (String) null);
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var3_int = this.field_b.field_q.a(hk.a(var5, 0), -26556);
          if (this.c(74, var3_int)) {
            stackIn_9_0 = var3_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("kk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(true, param0, param1)) {
          return false;
        }
        if (null != this.field_f[param0] &&
          this.field_f[param0][param1] != null) {
          return true;
        }
        if (param2 != -1) {
          ((byte[]) (this.field_d[6]))[2] = ((byte[]) (this.field_d[9]))[0];
        }
        if (null != this.field_d[param0]) {
          return true;
        }
        this.d(73, param0);
        if (this.field_d[param0] == null) {
          return false;
        }
        return true;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!this.c(-115)) {
          return false;
        }
        if (param1 < 0 ||
          0 > param2 ||
          this.field_b.field_a.length <= param1 ||
          param2 >= this.field_b.field_a[param1]) {
          if (sk.field_b) {
            throw new IllegalArgumentException(param1 + " " + param2);
          }
          return false;
        }
        if (!param0) {
          this.field_b = (pc) null;
          return true;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_g = null;
        field_a = null;
    }

    private final synchronized void d(int param0, int param1) {
        int var3 = 83 / ((param0 - 2) / 61);
        if (this.field_e) {
          this.field_d[param1] = this.field_c.a(-1, param1);
        } else {
          this.field_d[param1] = qk.a(this.field_c.a(-1, param1), false, (byte) -88);
        }
    }

    final synchronized int a(int param0, int param1) {
        if (param1 != -24214) {
          return 22;
        }
        if (!this.c(-42, param0)) {
          return 0;
        }
        if (null != this.field_d[param0]) {
          return 100;
        }
        return this.field_c.b(param0, param1 ^ 2972);
    }

    private final synchronized boolean c(int param0, int param1) {
        int var3;
        if (!this.c(-79)) {
          return false;
        }
        if (0 <= param1 &&
          param1 < this.field_b.field_a.length &&
          this.field_b.field_a[param1] != 0) {
          var3 = 91 % ((13 - param0) / 52);
          return true;
        }
        if (!sk.field_b) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(-79)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param0 = param0.toLowerCase();
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_b.field_q.a(hk.a(var6, param1 ^ param1), param1 - 26555);
          if (!this.c(93, var4_int)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_b.field_e[var4_int].a(hk.a(var7, 0), -26556);
          stackIn_7_0 = this.a(var4_int, var5, (byte) -64);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("kk.E(");
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
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(110)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_q.a(hk.a(var4, 0), -26556);
          if (param1 > -85) {
            this.field_b = (pc) null;
          }
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kk.W(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean c(int param0) {
        int var2 = 122 % ((param0 - 33) / 55);
        if (null == this.field_b) {
          this.field_b = this.field_c.a(9);
          if (this.field_b == null) {
            return false;
          }
          this.field_d = new Object[this.field_b.field_n];
          this.field_f = new Object[this.field_b.field_n][];
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        int[] stackIn_29_0 = null;
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
        be var26 = null;
        byte[] var27 = null;
        be var29 = null;
        be var31 = null;
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
        var22 = TrackController.field_F ? 1 : 0;
        try {
          if (!this.c(90, param1)) {
            return false;
          }
          if (null == this.field_d[param1]) {
            return false;
          }
          var5_int = this.field_b.field_l[param1];
          var34 = this.field_b.field_r[param1];
          var24 = var34;
          var6 = var24;
          if (param0 != 4) {
            return false;
          }
          if (this.field_f[param1] == null) {
            array$0 = new Object[this.field_b.field_a[param1]];
            this.field_f[param1] = array$0;
          }
          var7 = this.field_f[param1];
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
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          if (param3 != null) {
            if (param3[0] == 0 &&
              param3[1] == 0 &&
              param3[2] == 0) {
              stackIn_29_0 = (int[]) (param3);
              decompiledFrameRemainder0 = (stackIn_29_0[3] != 0);
            }
            if (decompiledFrameRemainder0) {
              var35 = me.a(true, 22692, this.field_d[param1]);
              var25 = var35;
              var9 = var25;
              var26 = new be(var35);
              var26.a(5, param3, var26.field_j.length, false);
              decompiledFrameRemainder1 = false;
            }
          }
          if (decompiledFrameRemainder1) {
            var9 = me.a(false, param0 ^ 22688, this.field_d[param1]);
          }
          try {
            var36 = al.a(-127, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (param3 != null);
            throw sl.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param1).append(" ").append(var9.length).append(" ").append(ql.a(0, var9, var9.length)).append(" ").append(ql.a(param0 ^ 4, var9, -2 + var9.length)).append(" ").append(this.field_b.field_b[param1]).append(" ").append(this.field_b.field_p).toString());
          }
          if (this.field_e) {
            this.field_d[param1] = null;
          }
          if (1 < var5_int) {
            if (this.field_i == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * (var12 * var5_int);
              var29 = new be(var43);
              var14_int = 0;
              var29.field_k = var11;
              var15_int = 0;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.e((byte) 113);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (var19 == param2) {
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
              var29.field_k = var11;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var18Lifetime3 < var12; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var29.e((byte) 113);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (param2 == var21) {
                    pd.a(var43, var17Lifetime4, var44, var14_intLifetime1, var19Lifetime2);
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
            var12Lifetime1 = 255 & var23[var11];
            var11 = var11 - 4 * var5_int * var12Lifetime1;
            var31 = new be(var43);
            var31.field_k = var11;
            var39 = new int[var5_int];
            var32 = var39;
            var14 = var32;
            for (var15_intLifetime1 = 0; var15_intLifetime1 < var12Lifetime1; var15_intLifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var31.e((byte) 113);
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
            var31.field_k = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var17Lifetime2 < var12Lifetime1; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var19Lifetime1 < var5_int; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var31.e((byte) 113);
                pd.a(var43, var16Lifetime3, var40[var19Lifetime1], var39[var19Lifetime1], var18Lifetime1);
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var17Lifetime3 < var5_int; var17Lifetime3++) {
              if (var6 != null) {
                var18Lifetime2 = var34[var17Lifetime3];
              } else {
                var18Lifetime2 = var17Lifetime3;
              }
              if (this.field_i == 0) {
                var7[var18Lifetime2] = qk.a(var40[var17Lifetime3], false, (byte) -19);
              } else {
                var7[var18Lifetime2] = var40[var17Lifetime3];
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_i == 0) {
              var7[var11] = qk.a(var43, false, (byte) 8);
            } else {
              var7[var11] = var36;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("kk.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
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
          if (!this.c(-82)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_q.a(hk.a(var4, param1), -26556);
          stackIn_4_0 = this.a(var3_int, -24214);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kk.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    kk(wi param0, boolean param1, int param2) {
        this.field_b = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_i = param2;
          this.field_c = param0;
          this.field_e = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "kk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "You are unable to access this level yet.";
        field_g = new int[4];
    }
}
