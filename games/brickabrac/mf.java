/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    private Object[][] field_h;
    static NodeDeque field_i;
    static int field_c;
    private bc field_g;
    int field_l;
    private ko field_k;
    private Object[] field_j;
    static cp field_f;
    static String field_e;
    boolean field_b;
    static RgbSprite[] field_a;
    static int[] field_d;

    public static void a(boolean param0) {
        field_e = null;
        field_f = null;
        field_a = null;
        if (param0) {
          String var2 = (String) null;
          mf.a((byte) -93, (String) null);
        }
        field_i = null;
        field_d = null;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -127)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param1 = param1.toLowerCase();
          param2 = param2.toLowerCase();
          var5 = 110 % ((param0 - 33) / 51);
          var7 = (CharSequence) ((Object) param1);
          var4_int = this.field_k.field_n.a(ni.a(-128, var7), (byte) -94);
          if (!this.b(0, var4_int)) {
            return null;
          }
          var8 = (CharSequence) ((Object) param2);
          var6 = this.field_k.field_i[var4_int].a(ni.a(-110, var8), (byte) -106);
          stackIn_7_0 = this.a(var6, var4_int, 4);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("mf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized void a(int param0, byte param1) {
        if (param1 != -78) {
          return;
        }
        if (!this.field_b) {
          this.field_j[param0] = eg.a(param1 - 39, this.field_g.a(param0, (byte) -51), false);
        } else {
          this.field_j[param0] = this.field_g.a(param0, (byte) -121);
        }
    }

    final synchronized boolean a(byte param0) {
        if (param0 != -127) {
          return false;
        }
        if (null != this.field_k) {
          return true;
        }
        this.field_k = this.field_g.b((byte) -112);
        if (this.field_k == null) {
          return false;
        }
        this.field_h = new Object[this.field_k.field_f][];
        this.field_j = new Object[this.field_k.field_f];
        return true;
    }

    final int c(int param0, int param1) {
        if (param0 > -69) {
          ((byte[]) (this.field_j[0]))[0] = (byte) 85;
        }
        if (!this.b(0, param1)) {
          return 0;
        }
        return this.field_k.field_l[param1];
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -127)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 != -28138) {
            field_a = (RgbSprite[]) null;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_k.field_n.a(ni.a(param1 + 28015, var4), (byte) -85);
          stackIn_7_0 = this.a(param1 + 15055, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mf.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int c(int param0) {
        if (!this.a((byte) -127)) {
          return -1;
        }
        if (param0 >= -86) {
          field_d = (int[]) null;
        }
        return this.field_k.field_l.length;
    }

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -127)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param1) {
            var4 = (String) null;
            this.a((String) null, true);
          }
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var3_int = this.field_k.field_n.a(ni.a(-121, var5), (byte) -86);
          if (this.b(0, var3_int)) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("mf.U(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(String param0, String param1, int param2) {
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
          if (!this.a((byte) -127)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_k.field_n.a(ni.a(-112, var6), (byte) -91);
          if (!this.b(param2, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_k.field_i[var4_int].a(ni.a(-109, var7), (byte) -114);
          stackIn_9_0 = this.a(var5, var4_int, (byte) 102);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("mf.T(");
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
          throw qb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int d(int param0, int param1) {
        if (!this.b(0, param0)) {
          return 0;
        }
        if (param1 != -27509) {
          field_a = (RgbSprite[]) null;
        }
        if (null != this.field_j[param0]) {
          return 100;
        }
        return this.field_g.a((byte) -97, param0);
    }

    final synchronized byte[] b(int param0, byte param1) {
        if (!this.a((byte) -127)) {
          return null;
        }
        if (1 == this.field_k.field_l.length) {
          return this.a(param0, 0, 4);
        }
        if (!this.b(0, param0)) {
          return null;
        }
        if (this.field_k.field_l[param0] == 1) {
          return this.a(0, param0, 4);
        }
        if (param1 < 19) {
          return (byte[]) null;
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (!this.a((byte) -127)) {
          return false;
        }
        var2 = 1;
        var3 = 0;
        if (param0 <= 88) {
          var6 = (String) null;
          this.a(-39, (String) (this.field_j[1]), (String) null);
        }
        while (var3 < this.field_k.field_g.length) {
          var4 = this.field_k.field_g[var3];
          if (null == this.field_j[var4]) {
            this.a(var4, (byte) -78);
            if (this.field_j[var4] == null) {
              var2 = 0;
            }
          }
          var3++;
        }
        return var2 != 0;
    }

    final int b(int param0, String param1) {
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
          if (!this.a((byte) -127)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param0 != 0) {
            stackIn_5_0 = 48;
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_k.field_n.a(ni.a(-120, var4), (byte) -94);
          stackIn_7_0 = this.d(var3_int, -27509);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mf.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -127)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var3_int = 12 % ((param0 - 59) / 33);
          var5 = (CharSequence) ((Object) param1);
          var4 = this.field_k.field_n.a(ni.a(-128, var5), (byte) -84);
          if (var4 >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mf.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object stackIn_2_0 = null;
        byte[] stackIn_12_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(true, param2, param1)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((null == this.field_h[param1] ||
            null == this.field_h[param1][param2]) && !this.a(122, param3, param1, param2)) {
            this.a(param1, (byte) -78);
            if (!this.a(106, param3, param1, param2)) {
              return null;
            }
          }
          if (param0 != 646) {
            stackIn_12_0 = (byte[]) null;
            return stackIn_12_0;
          }
          if (this.field_h[param1] == null) {
            throw new RuntimeException("");
          }
          if (this.field_h[param1][param2] != null) {
            var7 = be.a(false, this.field_h[param1][param2], false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_l != 1) {
              if (this.field_l == 2) {
                this.field_h[param1] = null;
              }
            } else {
              this.field_h[param1][param2] = null;
              if (this.field_k.field_l[param1] == 1) {
                this.field_h[param1] = null;
              }
            }
          }
          stackIn_28_0 = var5;
          return (byte[]) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("mf.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw qb.a((Throwable) (stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param2 != 4) {
          return (byte[]) null;
        }
        return this.a(646, param1, param0, (int[]) null);
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(true, param0, param1)) {
          return false;
        }
        if (null != this.field_h[param1] &&
          this.field_h[param1][param0] != null) {
          return true;
        }
        if (null != this.field_j[param1]) {
          return true;
        }
        this.a(param1, (byte) -78);
        if (null != this.field_j[param1]) {
          return true;
        }
        if (param2 != 102) {
          return ((boolean[]) (this.field_j[3]))[5];
        }
        return false;
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (!this.a((byte) -127)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_j.length > var4; var4++) {
          if (this.field_k.field_m[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.d(var4, -27509);
          }
        }
        if (0 == var2) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        if (param0 == -4126) {
          return var4Lifetime1;
        }
        return 74;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
          return true;
        }
        if (!this.a((byte) -127)) {
          return false;
        }
        if (param2 < 0 ||
          param1 < 0 ||
          param2 >= this.field_k.field_l.length ||
          param1 >= this.field_k.field_l[param2]) {
          if (!rn.field_n) {
            return false;
          }
          throw new IllegalArgumentException(param2 + " " + param1);
        }
        return true;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.a((byte) -127)) {
          return false;
        }
        if (param0 <= param1 &&
          this.field_k.field_l.length > param1 &&
          0 != this.field_k.field_l[param1]) {
          return true;
        }
        if (rn.field_n) {
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0, param0)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param2 = param2.toLowerCase();
          var5 = (CharSequence) ((Object) param2);
          var4_int = this.field_k.field_i[param0].a(ni.a(-115, var5), (byte) -109);
          if (!this.a(true, var4_int, param0)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (param1 >= -13) {
            this.a(((int[]) (((Object[]) (((Object[]) (this.field_j[7]))[5]))[0]))[0]);
          }
          stackIn_9_0 = var4_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("mf.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static lo a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        lo stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = 0;
          while (true) {
            if (var3 >= var2_int) {
              if (param0 > -58) {
                mf.a(false);
              }
              stackIn_12_0 = wg.field_c;
              return stackIn_12_0;
            }
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_7_0 = null;
          return (lo) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("mf.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
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
        PacketBuffer var26 = null;
        byte[] var27 = null;
        PacketBuffer var29 = null;
        PacketBuffer var31 = null;
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
        var22 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!this.b(0, param2)) {
            return false;
          }
          if (null == this.field_j[param2]) {
            return false;
          }
          var5_int = this.field_k.field_m[param2];
          var34 = this.field_k.field_h[param2];
          var24 = var34;
          var6 = var24;
          if (null == this.field_h[param2]) {
            array$0 = new Object[this.field_k.field_l[param2]];
            this.field_h[param2] = array$0;
          }
          var7 = this.field_h[param2];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
            if (var6 != null) {
              var10 = var34[var9_int];
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
          if (param1 != null && (0 != param1[0] ||
            param1[1] != 0 ||
            0 != param1[2] ||
            param1[3] != 0)) {
            var35 = be.a(false, this.field_j[param2], true);
            var25 = var35;
            var9 = var25;
            var26 = new PacketBuffer(var35);
            var26.decryptBlocks(param1, 5, var26.data.length, (byte) 85);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = be.a(false, this.field_j[param2], false);
          }
          try {
            var36 = i.a(true, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_34_0 = var11_ref_RuntimeException;
            stackIn_34_1 = new StringBuilder();
            stackIn_35_2 = (param1 != null);
            throw qb.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(" ").append(param2).append(" ").append(var9.length).append(" ").append(cg.a(var9.length, var9, (byte) -86)).append(" ").append(cg.a(var9.length - 2, var9, (byte) -86)).append(" ").append(this.field_k.field_p[param2]).append(" ").append(this.field_k.field_b).toString());
          }
          if (this.field_b) {
            this.field_j[param2] = null;
          }
          if (var5_int > 1) {
            if (2 == this.field_l) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - var12 * (var5_int * 4);
              var29 = new PacketBuffer(var43);
              var14_int = 0;
              var15_int = 0;
              var29.position = var11;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.readInt(255);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (param3 == var19) {
                    var15_int = var19;
                    var14_int = var14_int + var17;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var44 = new byte[var14_int];
              var29.position = var11;
              var14_intLifetime1 = 0;
              var17 = 0;
              for (var18 = 0; var12 > var18; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var29.readInt(255);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (param3 == var21) {
                    pm.a(var43, var17, var44, var14_intLifetime1, var19);
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
              var11 = var11 - var5_int * var12 * 4;
              var31 = new PacketBuffer(var43);
              var31.position = var11;
              var39 = new int[var5_int];
              var32 = var39;
              var14 = var32;
              for (var15_int = 0; var15_int < var12; var15_int++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var31.readInt(255);
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
              var31.position = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var5_int > var19; var19++) {
                  var18 = var18 + var31.readInt(255);
                  pm.a(var43, var16, var40[var19], var39[var19], var18);
                  var16 = var16 + var18;
                  var14[var19] = var14[var19] + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (this.field_l != 0) {
                  var7[var18] = var40[var17];
                } else {
                  var7[var18] = eg.a(-128, var40[var17], false);
                }
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (0 == this.field_l) {
              var7[var11] = eg.a(-123, var43, false);
            } else {
              var7[var11] = var36;
            }
          }
          if (param0 >= 95) {
            return true;
          }
          field_i = (NodeDeque) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("mf.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1) {
        boolean discarded$0 = false;
        if (!this.b(0, param1)) {
          return false;
        }
        if (param0 != -13083) {
          discarded$0 = this.a(-71, (int[]) null, ((int[]) (((Object[]) (((Object[]) (this.field_j[6]))[0]))[3]))[7], -35);
        }
        if (null != this.field_j[param1]) {
          return true;
        }
        this.a(param1, (byte) -78);
        if (this.field_j[param1] == null) {
          return false;
        }
        return true;
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -127)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_k.field_n.a(ni.a(param2 ^ 4, var6), (byte) -114);
          if (var4_int < 0) {
            return false;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_k.field_i[var4_int].a(ni.a(-120, var7), (byte) -105);
          if (0 > var5) {
            return false;
          }
          if (param2 == -121) {
            return true;
          }
          this.b(-9);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("mf.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    mf(bc param0, boolean param1, int param2) {
        this.field_k = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_g = param0;
          this.field_b = param1 ? true : false;
          this.field_l = param2;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_i = new NodeDeque();
        field_e = "Type your email address again to make sure it's correct";
    }
}
