/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_h;
    static kc[] field_a;
    private int field_f;
    private boolean field_e;
    static String field_i;
    private pe field_d;
    private Object[] field_g;
    private d field_c;
    private Object[][] field_b;

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        boolean stackIn_38_2 = false;
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
        pb var26 = null;
        byte[] var27 = null;
        pb var29 = null;
        pb var31 = null;
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
        var22 = Main.field_T;
        try {
          if (!this.b(param1, (byte) -44)) {
            return false;
          }
          if (null == this.field_g[param1]) {
            return false;
          }
          var5_int = this.field_c.field_q[param1];
          var34 = this.field_c.field_o[param1];
          var24 = var34;
          var6 = var24;
          if (this.field_b[param1] == null) {
            array$0 = new Object[this.field_c.field_f[param1]];
            this.field_b[param1] = array$0;
          }
          var7 = this.field_b[param1];
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
          if (param2 != null && (param2[0] != 0 ||
            0 != param2[1] ||
            0 != param2[2] ||
            param2[3] != 0)) {
            var35 = ce.a(true, 0, this.field_g[param1]);
            var25 = var35;
            var9 = var25;
            var26 = new pb(var35);
            var26.a(5, var26.field_g.length, -115, param2);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = ce.a(false, 0, this.field_g[param1]);
          }
          if (param0 < 84) {
            this.a(-69, ((byte[]) (((Object[]) (this.field_g[4]))[0]))[1], -74);
          }
          try {
            var36 = ac.a(-89, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_37_0 = var11_ref_RuntimeException;
            stackIn_37_1 = new StringBuilder();
            stackIn_38_2 = (param2 != null);
            throw ma.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(" ").append(param1).append(" ").append(var9.length).append(" ").append(uh.a((byte) 124, var9.length, var9)).append(" ").append(uh.a((byte) 114, -2 + var9.length, var9)).append(" ").append(this.field_c.field_i[param1]).append(" ").append(this.field_c.field_g).toString());
          }
          if (this.field_e) {
            this.field_g[param1] = null;
          }
          if (var5_int > 1) {
            if (this.field_f == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var5_int * (var12 * 4);
              var29 = new pb(var43);
              var14_int = 0;
              var29.field_i = var11;
              var15_int = 0;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var29.e((byte) 125);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (var19 == param3) {
                    var15_int = var19;
                    var14_int = var14_int + var17;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var44 = new byte[var14_int];
              var29.field_i = var11;
              var14_intLifetime1 = 0;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var12 > var18Lifetime3; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var29.e((byte) 127);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (var21 == param3) {
                    og.a(var43, var17Lifetime4, var44, var14_intLifetime1, var19Lifetime2);
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
            var31 = new pb(var43);
            var31.field_i = var11;
            var39 = new int[var5_int];
            var32 = var39;
            var14 = var32;
            for (var15_intLifetime1 = 0; var15_intLifetime1 < var12Lifetime1; var15_intLifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var31.e((byte) 124);
                var14[var17Lifetime1] = var14[var17Lifetime1] + var16Lifetime1;
              }
            }
            var40 = new byte[var5_int][];
            var33 = var40;
            var15 = var33;
            for (var16Lifetime2 = 0; var16Lifetime2 < var5_int; var16Lifetime2++) {
              array$1 = new byte[var39[var16Lifetime2]];
              var15[var16Lifetime2] = array$1;
              var39[var16Lifetime2] = 0;
            }
            var31.field_i = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var12Lifetime1 > var17Lifetime2; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var19Lifetime1 < var5_int; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var31.e((byte) 126);
                og.a(var43, var16Lifetime3, var40[var19Lifetime1], var39[var19Lifetime1], var18Lifetime1);
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 != null) {
                var18Lifetime2 = var34[var17Lifetime3];
              } else {
                var18Lifetime2 = var17Lifetime3;
              }
              if (0 == this.field_f) {
                var7[var18Lifetime2] = sj.a(false, 136, var40[var17Lifetime3]);
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
            if (this.field_f == 0) {
              var7[var11] = sj.a(false, 136, var43);
            } else {
              var7[var11] = var36;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("qk.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param3).append(')').toString());
        }
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 != -115) {
          return (byte[]) null;
        }
        return this.a((int[]) null, param2, (byte) 125, param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(4)) {
          return false;
        }
        if (param1 != 0) {
          return true;
        }
        if (param0 < 0 ||
          param2 < 0 ||
          this.field_c.field_f.length <= param0 ||
          this.field_c.field_f[param0] <= param2) {
          if (rh.field_j) {
            throw new IllegalArgumentException(param0 + " " + param2);
          }
          return false;
        }
        return true;
    }

    final boolean b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param0 + 0)) {
            return false;
          }
          if (param0 != 4) {
            this.a(-13, ((int[]) (((Object[]) (this.field_g[7]))[0]))[7]);
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_c.field_h.a((byte) -100, ta.a(109, var4));
          stackIn_6_0 = this.a(var3_int, 105);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qk.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized int a(byte param0, int param1) {
        if (!this.b(param1, (byte) -26)) {
          return 0;
        }
        if (param0 != 60) {
          String var4 = (String) null;
          this.a((byte) 42, (String) null, (String) null);
        }
        if (null != this.field_g[param1]) {
          return 100;
        }
        return this.field_d.a(param1, param0 ^ 123);
    }

    final boolean c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(4)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_c.field_h.a((byte) -100, ta.a(98, var4));
          if (param0 <= var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qk.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.b(param0, (byte) -124)) {
          return false;
        }
        if (param1 <= 17) {
          return false;
        }
        if (null != this.field_g[param0]) {
          return true;
        }
        this.a(param0, (byte) -92);
        if (null != this.field_g[param0]) {
          return true;
        }
        return false;
    }

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Main.field_T;
        if (!this.b(4)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_g.length > var4; var4++) {
          if (this.field_c.field_q[var4] > 0) {
            var3 = var3 + this.a((byte) 60, var4);
            var2 += 100;
          }
        }
        if (param0 != 2) {
          this.field_d = (pe) (this.field_g[7]);
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
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(4)) {
            return false;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_c.field_h.a((byte) -100, ta.a(param2 - 7, var6));
          if (!this.b(var4_int, (byte) -112)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_c.field_p[var4_int].a((byte) -100, ta.a(90, var7));
          if (param2 != -44) {
            this.field_b = (Object[][]) null;
          }
          stackIn_11_0 = this.b(27493, var4_int, var5);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("qk.O(");
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
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (param0 != 27493) {
          return ((boolean[]) (this.field_g[3]))[13];
        }
        if (!this.a(param1, param0 - 27493, param2)) {
          return false;
        }
        if (this.field_b[param1] != null &&
          null != this.field_b[param1][param2]) {
          return true;
        }
        if (null != this.field_g[param1]) {
          return true;
        }
        this.a(param1, (byte) 119);
        if (this.field_g[param1] != null) {
          return true;
        }
        return false;
    }

    final int a(int param0, String param1, byte param2) {
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
          if (!this.b(param0, (byte) -122)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_c.field_p[param0].a((byte) -100, ta.a(param2 ^ 99, var5));
          if (!this.a(param0, 0, var4_int)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (param2 != 7) {
            field_i = (String) (this.field_g[1]);
          }
          stackIn_9_0 = var4_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("qk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 7) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          if (!this.b(4)) {
            return null;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_c.field_h.a((byte) -100, ta.a(param0 - 94, var6));
          if (!this.b(var4_int, (byte) -47)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_c.field_p[var4_int].a((byte) -100, ta.a(57, var7));
          stackIn_10_0 = this.a(var5, (byte) -115, var4_int);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("qk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized boolean b(int param0) {
        if (null == this.field_c) {
          this.field_c = this.field_d.b((byte) -126);
          if (null == this.field_c) {
            return false;
          }
          this.field_b = new Object[this.field_c.field_b][];
          this.field_g = new Object[this.field_c.field_b];
        }
        if (param0 != 4) {
          this.a(((byte[]) (((Object[]) (((Object[]) (this.field_g[17]))[6]))[4]))[1], -41);
          return true;
        }
        return true;
    }

    private final synchronized boolean b(int param0, byte param1) {
        if (!this.b(4)) {
          return false;
        }
        if (param1 >= -6) {
          return true;
        }
        if (0 > param0 ||
          this.field_c.field_f.length <= param0 ||
          0 == this.field_c.field_f[param0]) {
          if (!rh.field_j) {
            return false;
          }
          throw new IllegalArgumentException(Integer.toString(param0));
        }
        return true;
    }

    private final synchronized byte[] a(int[] param0, int param1, byte param2, int param3) {
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param1, 0, param3)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param2 <= 68) {
            stackIn_5_0 = (byte[]) null;
            return stackIn_5_0;
          }
          var5 = null;
          if ((this.field_b[param1] == null ||
            null == this.field_b[param1][param3]) && !this.a(119, param1, param0, param3)) {
            this.a(param1, (byte) -111);
            if (!this.a(86, param1, param0, param3)) {
              stackIn_13_0 = null;
              return (byte[]) (stackIn_13_0);
            }
          }
          if (this.field_b[param1] == null) {
            throw new RuntimeException("");
          }
          if (this.field_b[param1][param3] != null) {
            var7 = ce.a(false, 0, this.field_b[param1][param3]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_f == 1) {
              this.field_b[param1][param3] = null;
              if (this.field_c.field_f[param1] == 1) {
                this.field_b[param1] = null;
              }
            } else {
              if (2 == this.field_f) {
                this.field_b[param1] = null;
              }
            }
          }
          stackIn_28_0 = var5;
          return (byte[]) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("qk.N(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ma.a((Throwable) (stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(int param0) {
        int var1 = -123 / ((62 - param0) / 60);
        field_i = null;
        field_h = null;
        field_a = null;
    }

    final int a(String param0, int param1) {
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
          if (!this.b(param1 + 4)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          if (param1 != 0) {
            field_i = (String) (this.field_g[5]);
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_c.field_h.a((byte) -100, ta.a(-54, var4));
          stackIn_6_0 = this.a((byte) 60, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qk.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, String param1) {
        boolean discarded$1 = false;
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
          if (!this.b(4)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_c.field_h.a((byte) -100, ta.a(-62, var4));
          if (param0 != 18659) {
            discarded$1 = this.b(-2, (byte) 61);
          }
          if (this.b(var3_int, (byte) -126)) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("qk.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized void a(int param0, byte param1) {
        if (!this.field_e) {
          this.field_g[param0] = sj.a(false, 136, this.field_d.a(param0, true));
        } else {
          this.field_g[param0] = this.field_d.a(param0, true);
        }
        int var3 = 78 / ((72 - param1) / 41);
    }

    qk(pe param0, boolean param1, int param2) {
        this.field_c = null;
        try {
          if (0 > param2 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_d = param0;
          this.field_e = param1 ? true : false;
          this.field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean a(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = Main.field_T;
        if (!this.b(4)) {
          return false;
        }
        var2 = 1;
        if (param0 < 15) {
          return true;
        }
        for (var3 = 0; this.field_c.field_d.length > var3; var3++) {
          var4 = this.field_c.field_d[var3];
          if (null == this.field_g[var4]) {
            this.a(var4, (byte) -81);
            if (this.field_g[var4] == null) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    static {
        field_h = "Create";
        field_i = "Unfortunately we are unable to create an account for you at this time.";
    }
}
