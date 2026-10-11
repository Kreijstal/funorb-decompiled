/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String field_h;
    int field_g;
    private ad field_f;
    private of field_a;
    static String field_c;
    private Object[][] field_e;
    private Object[] field_d;
    boolean field_b;

    private final synchronized void a(int param0, int param1) {
        if (this.field_b) {
          this.field_d[param1] = this.field_a.a(param1, (byte) 91);
        } else {
          this.field_d[param1] = qk.a(this.field_a.a(param1, (byte) 91), -1389597532, false);
        }
        if (param0 != 20351) {
          field_c = (String) null;
        }
    }

    final synchronized boolean b(int param0, byte param1) {
        if (!this.a(param0, (byte) -83)) {
          return false;
        }
        if (this.field_d[param0] != null) {
          return true;
        }
        if (param1 != -106) {
          return ((boolean[]) (this.field_d[0]))[0];
        }
        this.a(20351, param0);
        if (null != this.field_d[param0]) {
          return true;
        }
        return false;
    }

    final int b(int param0, String param1) {
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
          if (!this.a((byte) 121)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param0 != -1) {
            field_h = (String) null;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_f.field_e.a((byte) -68, ta.a(var4, 90));
          if (this.a(var3_int, (byte) -83)) {
            return var3_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ji.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return true;
          }
          if (!this.a((byte) 121)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_f.field_e.a((byte) -68, ta.a(var6, -10));
          if (!this.a(var4_int, (byte) -83)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_f.field_o[var4_int].a((byte) -68, ta.a(var7, 11));
          stackIn_12_0 = this.a((byte) -84, var5, var4_int);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ji.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        if (param0 != -5228) {
          return -48;
        }
        if (!this.a(param1, (byte) -83)) {
          return 0;
        }
        return this.field_f.field_k[param1];
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        if (param0 < 125) {
          field_c = (String) null;
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 121)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var3_int = -49 / ((param1 - 13) / 42);
          var5 = (CharSequence) ((Object) param0);
          var4 = this.field_f.field_e.a((byte) -68, ta.a(var5, -112));
          stackIn_5_0 = this.b(var4, (byte) -106);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ji.K(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 121)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_f.field_e.a((byte) -68, ta.a(var4, 86));
          if (var3_int >= param1) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ji.W(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        boolean stackIn_37_2 = false;
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
        wl var26 = null;
        byte[] var27 = null;
        wl var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        wl var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var12Lifetime1;
        int var15Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var14Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime4;
        int var18Lifetime3;
        int var19Lifetime2;
        var22 = client.field_A ? 1 : 0;
        try {
          if (!this.a(param1, (byte) -83)) {
            return false;
          }
          if (null == this.field_d[param1]) {
            return false;
          }
          var5_int = this.field_f.field_B[param1];
          var34 = this.field_f.field_v[param1];
          var24 = var34;
          var6 = var24;
          if (this.field_e[param1] == null) {
            array$0 = new Object[this.field_f.field_k[param1]];
            this.field_e[param1] = array$0;
          }
          if (param3 != 26687) {
            stackIn_12_0 = ((boolean[]) (((Object[]) (this.field_d[3]))[13]))[3];
            return stackIn_12_0;
          }
          var7 = this.field_e[param1];
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
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
          if (param0 != null && (param0[0] != 0 ||
            param0[1] != 0 ||
            param0[2] != 0 ||
            0 != param0[3])) {
            var35 = cf.a(true, 78, this.field_d[param1]);
            var25 = var35;
            var9 = var25;
            var26 = new wl(var35);
            var26.a((byte) 51, 5, param0, var26.field_r.length);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = cf.a(false, param3 ^ 26717, this.field_d[param1]);
          }
          try {
            var36 = i.a(var9, -120);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (param0 != null);
            throw dh.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param1).append(" ").append(var9.length).append(" ").append(tj.a(var9.length, 0, var9)).append(" ").append(tj.a(-2 + var9.length, 0, var9)).append(" ").append(this.field_f.field_c[param1]).append(" ").append(this.field_f.field_s).toString());
          }
          if (this.field_b) {
            this.field_d[param1] = null;
          }
          if (var5_int > 1) {
            if (this.field_g == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var12 * var5_int * 4;
              var32 = new wl(var43);
              var14 = 0;
              var32.field_n = var11;
              var15 = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var32.i(7553);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (param2 == var19) {
                    var15 = var19;
                    var14 = var14 + var17;
                  }
                }
              }
              if (var14 == 0) {
                return true;
              }
              var44 = new byte[var14];
              var32.field_n = var11;
              var14Lifetime1 = 0;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var18Lifetime3 < var12; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var32.i(param3 ^ 30142);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (var21 == param2) {
                    an.a(var43, var17Lifetime4, var44, var14Lifetime1, var19Lifetime2);
                    var14Lifetime1 = var14Lifetime1 + var19Lifetime2;
                  }
                  var17Lifetime4 = var17Lifetime4 + var19Lifetime2;
                }
              }
              var7[var15] = var44;
              return true;
            }
            var11 = var36.length;
            var11--;
            var12Lifetime1 = var23[var11] & 255;
            var11 = var11 - 4 * (var12Lifetime1 * var5_int);
            var29 = new wl(var43);
            var38 = new int[var5_int];
            var30 = var38;
            var14_ref_int__ = var30;
            var29.field_n = var11;
            for (var15Lifetime1 = 0; var15Lifetime1 < var12Lifetime1; var15Lifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var5_int > var17Lifetime1; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var29.i(7553);
                var14_ref_int__[var17Lifetime1] = var14_ref_int__[var17Lifetime1] + var16Lifetime1;
              }
            }
            var39 = new byte[var5_int][];
            var31 = var39;
            var15_ref_byte____ = var31;
            for (var16Lifetime2 = 0; var5_int > var16Lifetime2; var16Lifetime2++) {
              array$1 = new byte[var38[var16Lifetime2]];
              var15_ref_byte____[var16Lifetime2] = array$1;
              var38[var16Lifetime2] = 0;
            }
            var29.field_n = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var17Lifetime2 < var12Lifetime1; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var19Lifetime1 < var5_int; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var29.i(7553);
                an.a(var43, var16Lifetime3, var39[var19Lifetime1], var38[var19Lifetime1], var18Lifetime1);
                var14_ref_int__[var19Lifetime1] = var14_ref_int__[var19Lifetime1] + var18Lifetime1;
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var17Lifetime3 < var5_int; var17Lifetime3++) {
              if (var6 != null) {
                var18Lifetime2 = var34[var17Lifetime3];
              } else {
                var18Lifetime2 = var17Lifetime3;
              }
              if (this.field_g == 0) {
                var7[var18Lifetime2] = qk.a(var39[var17Lifetime3], -1389597532, false);
              } else {
                var7[var18Lifetime2] = var39[var17Lifetime3];
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_g != 0) {
              var7[var11] = var43;
            } else {
              var7[var11] = qk.a(var36, -1389597532, false);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("ji.U(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized int b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = client.field_A ? 1 : 0;
        if (!this.a((byte) 121)) {
          return 0;
        }
        if (param0 > -44) {
          this.a(91, ((int[]) (((Object[]) (this.field_d[2]))[0]))[0]);
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_d.length > var4; var4++) {
          if (this.field_f.field_B[var4] > 0) {
            var3 = var3 + this.a((byte) 34, var4);
            var2 += 100;
          }
        }
        if (0 == var2) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final synchronized boolean a(byte param0) {
        if (this.field_f == null) {
          this.field_f = this.field_a.a(true);
          if (null == this.field_f) {
            return false;
          }
          this.field_e = new Object[this.field_f.field_n][];
          this.field_d = new Object[this.field_f.field_n];
        }
        if (param0 != 121) {
          return false;
        }
        return true;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 121)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_f.field_e.a((byte) -68, ta.a(var6, 79));
          if (!this.a(var4_int, (byte) -83)) {
            return null;
          }
          if (param0 != 0) {
            stackIn_8_0 = (byte[]) null;
            return stackIn_8_0;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_f.field_o[var4_int].a((byte) -68, ta.a(var7, -112));
          stackIn_10_0 = this.a(var5, 32, var4_int);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ji.F(").append(param0).append(',');
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
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a((byte) 121)) {
          return false;
        }
        if (param2 != -33) {
          this.a((byte) 6, ((int[]) (this.field_d[0]))[26]);
        }
        if (param0 >= 0 &&
          param1 >= 0 &&
          param0 < this.field_f.field_k.length &&
          this.field_f.field_k[param0] > param1) {
          return true;
        }
        if (cd.field_i) {
          throw new IllegalArgumentException(param0 + " " + param1);
        }
        return false;
    }

    final byte[] a(int param0, int param1, int param2) {
        int var4 = 118 / ((param1 + 44) / 62);
        return this.a(param0, (int[]) null, param2, (byte) -33);
    }

    final static String[] a(char param0, byte param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = client.field_A ? 1 : 0;
        try {
          if (param1 != 66) {
            stackIn_3_0 = (String[]) null;
            return stackIn_3_0;
          }
          var10 = (CharSequence) ((Object) param2);
          var3_int = wg.a(true, var10, param0);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param2.charAt(var8) != param0; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ji.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, byte param1) {
        if (param1 != -83) {
          this.field_a = (of) (this.field_d[0]);
        }
        if (!this.a((byte) 121)) {
          return false;
        }
        if (param0 < 0 ||
          param0 >= this.field_f.field_k.length ||
          this.field_f.field_k[param0] == 0) {
          if (!cd.field_i) {
            return false;
          }
          throw new IllegalArgumentException(Integer.toString(param0));
        }
        return true;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != pd.field_f) {
          var3 = pd.field_f.c(497, param2);
          if (-2 != var3) {
            if (var3 != -1) {
              var4 = pd.field_f.e(5658) ? 1 : 0;
              sn.a(pd.field_f.field_Tb, param0, pd.field_f.g((byte) -96), 97, var4 != 0, var3);
            }
            pd.field_f = null;
            tf.i((byte) -76);
          }
        }
        if (param1 != 0) {
          field_c = (String) null;
        }
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(param0, (byte) -83)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param1 != 13030) {
            this.field_d = new Object[6];
          }
          param2 = param2.toLowerCase();
          var5 = (CharSequence) ((Object) param2);
          var4_int = this.field_f.field_o[param0].a((byte) -68, ta.a(var5, -127));
          if (this.a(param0, var4_int, (byte) -33)) {
            stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ji.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void c(int param0, int param1) {
        uf var2 = we.field_b;
        var2.f(param0, param1 ^ -3);
        var2.a(true, param1);
        var2.a(true, 3);
    }

    final synchronized int a(byte param0, int param1) {
        if (!this.a(param1, (byte) -83)) {
          return 0;
        }
        if (param0 != 34) {
          field_h = (String) null;
        }
        if (this.field_d[param1] != null) {
          return 100;
        }
        return this.field_a.a(param1, param0 ^ -102);
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 121)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var3_int = this.field_f.field_e.a((byte) -68, ta.a(var5, -128));
          var4 = 39 / ((param0 + 55) / 53);
          stackIn_4_0 = this.a((byte) 34, var3_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ji.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, byte param3) {
        Object stackIn_2_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param2, param0, param3)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((this.field_e[param2] == null ||
            this.field_e[param2][param0] == null) && !this.a(param1, param2, param0, 26687)) {
            this.a(20351, param2);
            if (!this.a(param1, param2, param0, param3 + 26720)) {
              return null;
            }
          }
          if (null == this.field_e[param2]) {
            throw new RuntimeException("");
          }
          if (this.field_e[param2][param0] != null) {
            var7 = cf.a(false, 95, this.field_e[param2][param0]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_g == 1) {
              this.field_e[param2][param0] = null;
              if (this.field_f.field_k[param2] == 1) {
                this.field_e[param2] = null;
              }
            } else {
              if (this.field_g == 2) {
                this.field_e[param2] = null;
              }
            }
          }
          stackIn_27_0 = var5;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ji.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw dh.a((Throwable) (stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean a(boolean param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        if (!this.a((byte) 121)) {
          return false;
        }
        if (param0) {
          return true;
        }
        var2 = 1;
        for (var3 = 0; var3 < this.field_f.field_f.length; var3++) {
          var4 = this.field_f.field_f[var3];
          if (this.field_d[var4] == null) {
            this.a(20351, var4);
            if (null == this.field_d[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param2, param1, (byte) -33)) {
          return false;
        }
        if (null != this.field_e[param2] &&
          this.field_e[param2][param1] != null) {
          return true;
        }
        if (null != this.field_d[param2]) {
          return true;
        }
        this.a(20351, param2);
        if (null != this.field_d[param2]) {
          return true;
        }
        if (param0 >= -59) {
          this.a(false);
          return false;
        }
        return false;
    }

    ji(of param0, boolean param1, int param2) {
        this.field_f = null;
        try {
          if (param2 < 0 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_b = param1 ? true : false;
          this.field_a = param0;
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ji.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Offer rematch";
        field_h = "FINAL!";
    }
}
