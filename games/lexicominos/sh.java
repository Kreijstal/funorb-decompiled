/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static nj[] field_d;
    private e field_g;
    private hf field_h;
    static int field_a;
    private boolean field_i;
    static int field_e;
    static int field_f;
    private int field_c;
    private Object[][] field_b;
    private Object[] field_j;

    final int c(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(81)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
          if (param1 != -89) {
            stackIn_6_0 = -87;
            return stackIn_6_0;
          }
          if (this.b(var3_int, 127)) {
            return var3_int;
          }
          stackIn_10_0 = -1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("sh.V(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -27493) {
          field_e = -77;
        }
        return this.a((int[]) null, (byte) 101, param0, param2);
    }

    final synchronized boolean c(int param0) {
        if (null == this.field_g) {
          this.field_g = this.field_h.a(false);
          if (this.field_g == null) {
            return false;
          }
          this.field_j = new Object[this.field_g.field_d];
          this.field_b = new Object[this.field_g.field_d][];
        }
        int var2 = -54 % ((21 - param0) / 52);
        return true;
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
          if (!this.b(param2, 127)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          if (param1 != -27964) {
            this.field_c = 26;
          }
          var5 = (CharSequence) ((Object) param0);
          var4_int = this.field_g.field_c[param2].a(-20075, na.a(param1 ^ -1076540, var5));
          if (this.a(true, param2, var4_int)) {
            stackIn_9_0 = var4_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("sh.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!this.a(true, param0, param2)) {
          return false;
        }
        if (null != this.field_b[param0] &&
          null != this.field_b[param0][param2]) {
          return true;
        }
        if (null != this.field_j[param0]) {
          return true;
        }
        this.a(param0, true);
        if (null != this.field_j[param0]) {
          return true;
        }
        if (param1 != 78) {
          sh.d((String) (this.field_j[7]), (byte) -115);
          return false;
        }
        return false;
    }

    final int b(int param0) {
        if (!this.c(-54)) {
          return -1;
        }
        int var2 = 30 % ((-72 - param0) / 54);
        return this.field_g.field_a.length;
    }

    final int b(String param0, byte param1) {
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
          if (param1 <= 109) {
            this.field_i = false;
          }
          if (!this.c(-41)) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
          stackIn_6_0 = this.b((byte) -113, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("sh.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 1) {
          field_d = (nj[]) null;
        }
    }

    private final synchronized byte[] a(int[] param0, byte param1, int param2, int param3) {
        boolean discarded$0 = false;
        Object stackIn_4_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int[] var7 = null;
        byte[] var8 = null;
        try {
          if (param1 != 101) {
            var7 = (int[]) null;
            discarded$0 = this.a(69, ((int[]) (this.field_j[2]))[7], (int[]) null, 35);
          }
          if (!this.a(true, param2, param3)) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          var5 = null;
          if ((null == this.field_b[param2] ||
            null == this.field_b[param2][param3]) && !this.a(param2, 80, param0, param3)) {
            this.a(param2, true);
            if (!this.a(param2, 124, param0, param3)) {
              return null;
            }
          }
          if (null == this.field_b[param2]) {
            throw new RuntimeException("");
          }
          if (this.field_b[param2][param3] != null) {
            var8 = nl.a(this.field_b[param2][param3], (byte) -74, false);
            var5 = var8;
            if (var8 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 != this.field_c) {
              if (this.field_c == 2) {
                this.field_b[param2] = null;
              }
            } else {
              this.field_b[param2][param3] = null;
              if (this.field_g.field_a[param2] == 1) {
                this.field_b[param2] = null;
              }
            }
          }
          stackIn_29_0 = var5;
          return (byte[]) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("sh.W(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ld.a((Throwable) (stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.b(param1, 126)) {
          return false;
        }
        if (null != this.field_j[param1]) {
          return true;
        }
        this.a(param1, true);
        if (null != this.field_j[param1]) {
          return true;
        }
        if (param0 != 5) {
          return ((boolean[]) (this.field_j[4]))[1];
        }
        return false;
    }

    private final synchronized void a(int param0, boolean param1) {
        if (this.field_i) {
          this.field_j[param0] = this.field_h.a(param0, param1);
        } else {
          this.field_j[param0] = ri.a(136, this.field_h.a(param0, param1), false);
        }
        if (!param1) {
          field_f = ((int[]) (((Object[]) (this.field_j[13]))[1]))[8];
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(param1 ^ 10842)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_b.a(-20075, na.a(param1 ^ 1059338, var4));
          if (param1 == 10762) {
            stackIn_8_0 = this.c(5, var3_int);
            return stackIn_8_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("sh.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int b(byte param0, int param1) {
        if (!this.b(param1, 126)) {
          return 0;
        }
        if (param0 > -79) {
          return ((int[]) (this.field_j[0]))[9];
        }
        if (null != this.field_j[param1]) {
          return 100;
        }
        return this.field_h.a(param1, 1215);
    }

    final synchronized boolean a(byte param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (!this.c(121)) {
          return false;
        }
        var2 = 1;
        var3 = 39 % ((-47 - param0) / 62);
        for (var4 = 0; var4 < this.field_g.field_f.length; var4++) {
          var5 = this.field_g.field_f[var4];
          if (this.field_j[var5] == null) {
            this.a(var5, true);
            if (null == this.field_j[var5]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
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
          if (!this.c(param0 - 250)) {
            return null;
          }
          param2 = param2.toLowerCase();
          if (param0 != 127) {
            ((long[]) (this.field_j[9]))[2] = ((long[]) (this.field_j[0]))[1];
          }
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_g.field_b.a(-20075, na.a(param0 ^ 1048703, var6));
          if (!this.b(var4_int, 127)) {
            stackIn_7_0 = null;
            return (byte[]) (stackIn_7_0);
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_g.field_c[var4_int].a(-20075, na.a(param0 + 1048449, var7));
          stackIn_9_0 = this.a(var4_int, -27493, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("sh.R(").append(param0).append(',');
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
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!this.c(125)) {
          return null;
        }
        if (this.field_g.field_a.length == 1) {
          return this.a(0, -27493, param0);
        }
        if (!this.b(param0, 127)) {
          return null;
        }
        if (this.field_g.field_a[param0] == 1) {
          return this.a(param0, -27493, 0);
        }
        int var3 = 81 / ((param1 + 44) / 43);
        throw new RuntimeException();
    }

    final synchronized int a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (!this.c(-98)) {
          return 0;
        }
        var2 = 0;
        if (param0) {
          this.field_j[1] = (Object) null;
        }
        var3 = 0;
        for (var4 = 0; this.field_j.length > var4; var4++) {
          if (this.field_g.field_m[var4] > 0) {
            var3 = var3 + this.b((byte) -98, var4);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final boolean a(String param0, String param1, int param2) {
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
          if (!this.c(-118)) {
            return false;
          }
          param1 = param1.toLowerCase();
          if (param2 != -1) {
            field_a = ((int[]) (((Object[]) (this.field_j[2]))[2]))[0];
          }
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_g.field_b.a(-20075, na.a(param2 ^ -1048577, var6));
          if (!this.b(var4_int, 126)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_g.field_c[var4_int].a(-20075, na.a(1048576, var7));
          stackIn_11_0 = this.a(var4_int, (byte) 78, var5);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("sh.J(");
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
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
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
          if (param1 >= -113) {
            this.c(71, ((int[]) (this.field_j[23]))[0]);
          }
          if (!this.c(85)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("sh.S(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.c(101)) {
          return false;
        }
        if (param0 >= 0 &&
          this.field_g.field_a.length > param0 &&
          this.field_g.field_a[param0] != 0) {
          if (param1 >= 125) {
            return true;
          }
          return false;
        }
        if (!oc.field_b) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!this.c(-94)) {
          return false;
        }
        if (0 <= param1 &&
          0 <= param2 &&
          this.field_g.field_a.length > param1 &&
          this.field_g.field_a[param1] > param2) {
          if (param0) {
            return true;
          }
          return false;
        }
        if (oc.field_b) {
          throw new IllegalArgumentException(param1 + " " + param2);
        }
        return false;
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        Object[] array$0 = null;
        int var10_int = 0;
        int var21 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        boolean stackIn_35_2 = false;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        wf var27 = null;
        byte[] var28 = null;
        wf var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        wf var33 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int var15Lifetime1;
        var23 = Lexicominos.field_L ? 1 : 0;
        try {
          if (!this.b(param0, 126)) {
            return false;
          }
          if (null == this.field_j[param0]) {
            return false;
          }
          var5_int = this.field_g.field_m[param0];
          var35 = this.field_g.field_n[param0];
          var25 = var35;
          var6 = var25;
          if (this.field_b[param0] == null) {
            array$0 = new Object[this.field_g.field_a[param0]];
            this.field_b[param0] = array$0;
          }
          var7 = this.field_b[param0];
          var8 = -4 % ((param1 - 17) / 39);
          var9 = 1;
          for (var10_int = 0; var5_int > var10_int; var10_int++) {
            if (var6 == null) {
              var11 = var10_int;
            } else {
              var11 = var35[var10_int];
            }
            if (var7[var11] != null) {
              continue;
            }
            var9 = 0;
            break;
          }
          if (var9 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param2 != null && (0 != param2[0] ||
            param2[1] != 0 ||
            param2[2] != 0 ||
            param2[3] != 0)) {
            var36 = nl.a(this.field_j[param0], (byte) -74, true);
            var26 = var36;
            var10 = var26;
            var27 = new wf(var36);
            var27.a(4, var27.field_j.length, 5, param2);
            decompiledFrameRemainder0 = false;
          }
          else {
            var10 = nl.a(this.field_j[param0], (byte) -74, false);
          }
          try {
            var37 = qk.a(65, var10);
            var28 = var37;
            var24 = var28;
            var44 = var24;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var12_ref_RuntimeException = decompiledCaughtException;
            stackIn_34_0 = var12_ref_RuntimeException;
            stackIn_34_1 = new StringBuilder();
            stackIn_35_2 = (param2 != null);
            throw ld.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(" ").append(param0).append(" ").append(var10.length).append(" ").append(oe.a(88, var10, var10.length)).append(" ").append(oe.a(-91, var10, -2 + var10.length)).append(" ").append(this.field_g.field_r[param0]).append(" ").append(this.field_g.field_i).toString());
          }
          if (this.field_i) {
            this.field_j[param0] = null;
          }
          if (1 < var5_int) {
            if (this.field_c == 2) {
              var12 = var37.length;
              var12--;
              var13 = var24[var12] & 255;
              var12 = var12 - var5_int * var13 * 4;
              var33 = new wf(var44);
              var15 = 0;
              var16 = 0;
              var33.field_h = var12;
              for (var17 = 0; var13 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var5_int > var19; var19++) {
                  var18 = var18 + var33.d((byte) 19);
                  if (var6 == null) {
                    var20 = var19;
                  } else {
                    var20 = var35[var19];
                  }
                  if (var20 == param3) {
                    var16 = var20;
                    var15 = var15 + var18;
                  }
                }
              }
              if (var15 == 0) {
                return true;
              }
              var45 = new byte[var15];
              var15Lifetime1 = 0;
              var33.field_h = var12;
              var18 = 0;
              for (var19 = 0; var19 < var13; var19++) {
                var20 = 0;
                for (var21 = 0; var21 < var5_int; var21++) {
                  var20 = var20 + var33.d((byte) 19);
                  if (var6 != null) {
                    var22 = var35[var21];
                  } else {
                    var22 = var21;
                  }
                  if (param3 == var22) {
                    o.a(var44, var18, var45, var15Lifetime1, var20);
                    var15Lifetime1 = var15Lifetime1 + var20;
                  }
                  var18 = var18 + var20;
                }
              }
              var7[var16] = var45;
            } else {
              var12 = var37.length;
              var12--;
              var13 = 255 & var24[var12];
              var12 = var12 - 4 * (var13 * var5_int);
              var30 = new wf(var44);
              var30.field_h = var12;
              var39 = new int[var5_int];
              var31 = var39;
              var15_ref_int__ = var31;
              for (var16 = 0; var13 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var30.d((byte) 19);
                  var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                }
              }
              var40 = new byte[var5_int][];
              var32 = var40;
              var16_ref_byte____ = var32;
              for (var17 = 0; var5_int > var17; var17++) {
                array$1 = new byte[var39[var17]];
                var16_ref_byte____[var17] = array$1;
                var39[var17] = 0;
              }
              var30.field_h = var12;
              var17 = 0;
              for (var18 = 0; var18 < var13; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var30.d((byte) 19);
                  o.a(var44, var17, var40[var20], var39[var20], var19);
                  var17 = var17 + var19;
                  var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                }
              }
              for (var18 = 0; var18 < var5_int; var18++) {
                if (var6 != null) {
                  var19 = var35[var18];
                } else {
                  var19 = var18;
                }
                if (this.field_c == 0) {
                  var7[var19] = ri.a(136, var40[var18], false);
                } else {
                  var7[var19] = var40[var18];
                }
              }
            }
          } else {
            if (var6 != null) {
              var12 = var35[0];
            } else {
              var12 = 0;
            }
            if (this.field_c == 0) {
              var7[var12] = ri.a(136, var37, false);
              return true;
            }
            var7[var12] = var44;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_103_0 = var5;
          stackIn_103_1 = new StringBuilder().append("sh.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param3).append(')').toString());
        }
    }

    sh(hf param0, boolean param1, int param2) {
        this.field_g = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_i = param1 ? true : false;
          this.field_c = param2;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean d(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = 0;
          if (param1 != 50) {
            field_a = -22;
          }
          while (var2_int < param0.length()) {
            var3 = param0.charAt(var2_int);
            if (!hi.a(18670, (char) var3) &&
              !ne.a((byte) 94, (char) var3)) {
              return true;
            }
            var2_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("sh.O(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 92 % ((70 - param0) / 40);
        if (!this.b(param1, 126)) {
          return 0;
        }
        return this.field_g.field_a[param1];
    }

    static {
        field_f = 0;
        field_e = 0;
    }
}
