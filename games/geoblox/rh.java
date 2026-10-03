/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_i;
    private Object[][] field_e;
    static tf field_a;
    private bm field_c;
    private boolean field_h;
    private Object[] field_f;
    static tf field_d;
    private nh field_g;
    private int field_b;
    static String field_j;

    final int a(boolean param0) {
        if (!this.a(0)) {
            return -1;
        }
        if (param0) {
            return 84;
        }
        return this.field_c.field_k.length;
    }

    final static void a(byte param0) {
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        ja var2 = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          if (param0 <= 93) {
            rh.a((byte) 28);
          }
          var1_float = 0.0f;
          var2 = (ja) ((Object) a.field_d.g(0));
          while (var2 != null) {
            var2.field_E = var2.field_E - 1;
            if (var2.field_E == 0) {
              ab.field_f = true;
            }
            if (null == var2.field_K) {
              var2.b(true);
              if ((3 == var2.field_z) &&
                  (var2.field_t) &&
                  (0 >= var2.field_E)) {
                w.field_f = true;
              }
              if (var1_float < (var2.field_o - 320.0f) * (-320.0f + var2.field_o) + (var2.field_v - 240.0f) * (var2.field_v - 240.0f)) {
                var1_float = (-240.0f + var2.field_v) * (-240.0f + var2.field_v) + (-320.0f + var2.field_o) * (-320.0f + var2.field_o);
              }
            }
            var2 = (ja) ((Object) a.field_d.d(1));
          }
          wc.a(var1_float, (byte) 14);
          if (10000.0f > var1_float) {
            stackIn_22_0 = 0;
            jc.a(stackIn_22_0, false);
          } else {
            if (!(25600.0f > var1_float)) {
              jc.a(2, false);
            } else {
              jc.a(1, false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "rh.I(" + param0 + ')');
        }
    }

    final int c(int param0, int param1) {
        if (!(this.b(param1, 3))) {
            return 0;
        }
        if (param0 != -9467) {
            rh.b(91);
        }
        return this.field_c.field_k[param1];
    }

    private final synchronized void a(int param0, int param1) {
        boolean discarded$0 = false;
        if (!this.field_h) {
            this.field_f[param0] = hf.a(-105, this.field_g.b(4, param0), false);
        } else {
            this.field_f[param0] = this.field_g.b(4, param0);
        }
        if (param1 >= -103) {
            discarded$0 = this.b(((int[]) (this.field_f[5]))[9], 37);
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -28153) {
            this.a((byte) -106, (String) null, (String) (this.field_f[14]));
        }
        return this.a(param0, true, (int[]) null, param2);
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -87) {
            return true;
          }
          if (!this.a(0)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_c.field_n.a(true, ab.a(94, var4));
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var3);
          stackIn_12_1 = new StringBuilder().append("rh.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final synchronized boolean b(boolean param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = Geoblox.field_C;
        if (!this.a(0)) {
          return false;
        }
        var2 = param0 ? 1 : 0;
        for (var3 = 0; this.field_c.field_i.length > var3; var3++) {
          var4 = this.field_c.field_i[var3];
          if (this.field_f[var4] != null) {
            continue;
          }
          this.a(var4, -119);
          if (null != this.field_f[var4]) {
            continue;
          }
          var2 = 0;
        }
        return var2 != 0;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (param1 != -1) {
            return ((boolean[]) (this.field_f[3]))[0];
        }
        if (!(this.a(0))) {
            return false;
        }
        if (0 > param2 || param0 < 0 || this.field_c.field_k.length <= param2 || this.field_c.field_k[param2] <= param0) {
            if (!vf.field_K) {
                return false;
            }
            throw new IllegalArgumentException(param2 + " " + param0);
        }
        return true;
    }

    final int a(String param0, int param1, int param2) {
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
          if (!this.b(param2, 3)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param1 > -55) {
            field_d = (tf) null;
          }
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var4_int = this.field_c.field_f[param2].a(true, ab.a(99, var5));
          if (this.b(var4_int, -1, param2)) {
            stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var4);
          stackIn_13_1 = new StringBuilder().append("rh.W(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0) {
        if (param0 != 0) {
            this.c(70, -80);
        }
        if (this.field_c != null) {
            return true;
        }
        this.field_c = this.field_g.a((byte) 113);
        if (this.field_c == null) {
            return false;
        }
        this.field_f = new Object[this.field_c.field_b];
        this.field_e = new Object[this.field_c.field_b][];
        return true;
    }

    final int a(int param0, String param1) {
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
          if (!this.a(param0)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_c.field_n.a(true, ab.a(84, var4));
          stackIn_4_0 = this.b((byte) 85, var3_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var3);
          stackIn_7_1 = new StringBuilder().append("rh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.a(0)) {
            return false;
        }
        if (param1 != 3) {
            field_j = (String) null;
        }
        if (param0 >= 0 && param0 < this.field_c.field_k.length && this.field_c.field_k[param0] != 0) {
            return true;
        }
        if (vf.field_K) {
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_j = null;
        if (param0 != 30261) {
            field_a = (tf) null;
        }
        field_i = null;
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!this.a(0)) {
            return null;
        }
        if (!(this.field_c.field_k.length != 1)) {
            return this.a(0, param0 - 56472, param1);
        }
        if (param0 != 28319) {
            return (byte[]) null;
        }
        if (!this.b(param1, 3)) {
            return null;
        }
        if (!(this.field_c.field_k[param1] != 1)) {
            return this.a(param1, param0 ^ -872, 0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(byte param0, int param1) {
        if (!(this.b(param1, 3))) {
            return false;
        }
        if (!(this.field_f[param1] == null)) {
            return true;
        }
        if (param0 != 102) {
            this.b((byte) -65, 111);
        }
        this.a(param1, -108);
        if (this.field_f[param1] == null) {
            return false;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        boolean stackIn_39_2 = false;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
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
        byte[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        qc var25 = null;
        byte[] var26 = null;
        qc var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        qc var31 = null;
        int[] var33 = null;
        byte[] var34 = null;
        byte[] var35 = null;
        int[] var37 = null;
        byte[][] var38 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        try {
          if (!this.b(param3, 3)) {
            return false;
          }
          if (this.field_f[param3] == null) {
            return false;
          }
          var5_int = this.field_c.field_a[param3];
          var33 = this.field_c.field_o[param3];
          var23 = var33;
          var6 = var23;
          if (null == this.field_e[param3]) {
            array$0 = new Object[this.field_c.field_k[param3]];
            this.field_e[param3] = array$0;
          }
          var7 = this.field_e[param3];
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var33[var9_int];
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
          L4: {
            L5: {
              if (param2 != null) {
                if ((param2[0] == 0) &&
                    (param2[1] == 0) &&
                    (param2[2] == 0) &&
                    (0 == param2[3])) {
                  break L5;
                }
                var34 = uk.a(true, param1 ^ -114, this.field_f[param3]);
                var24 = var34;
                var9 = var24;
                var25 = new qc(var34);
                var25.a((byte) -125, param2, 5, var25.field_j.length);
                break L4;
              }
            }
            var9 = uk.a(false, param1 - 90, this.field_f[param3]);
          }
          if (param1 != 4) {
            return false;
          }
          try {
            var35 = v.a(var9, -1);
            var26 = var35;
            var22 = var26;
            var42 = var22;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var11_ref_RuntimeException);
            stackIn_38_1 = new StringBuilder();
            if (param2 == null) {
              stackIn_39_2 = false;
            } else {
              stackIn_39_2 = true;
            }
            throw t.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(" ").append(param3).append(" ").append(var9.length).append(" ").append(gg.a(var9, param1 + 95, var9.length)).append(" ").append(gg.a(var9, param1 ^ 73, var9.length - 2)).append(" ").append(this.field_c.field_q[param3]).append(" ").append(this.field_c.field_m).toString());
          }
          if (this.field_h) {
            this.field_f[param3] = null;
          }
          L10: {
            if (var5_int > 1) {
              if (this.field_b == 2) {
                var11 = var35.length;
                var11--;
                var12 = 255 & var22[var11];
                var11 = var11 - var5_int * (var12 * 4);
                var31 = new qc(var42);
                var14 = 0;
                var15 = 0;
                var31.field_f = var11;
                for (var16 = 0; var16 < var12; var16++) {
                  var17 = 0;
                  for (var18 = 0; var18 < var5_int; var18++) {
                    var17 = var17 + var31.a((byte) -126);
                    if (var6 == null) {
                      var19 = var18;
                    } else {
                      var19 = var33[var18];
                    }
                    if (param0 == var19) {
                      var14 = var14 + var17;
                      var15 = var19;
                    }
                  }
                }
                if (var14 == 0) {
                  return true;
                }
                var43 = new byte[var14];
                var31.field_f = var11;
                var14 = 0;
                var17 = 0;
                for (var18 = 0; var18 < var12; var18++) {
                  var19 = 0;
                  for (var20 = 0; var20 < var5_int; var20++) {
                    var19 = var19 + var31.a((byte) -82);
                    if (var6 == null) {
                      var21 = var20;
                    } else {
                      var21 = var33[var20];
                    }
                    if (var21 == param0) {
                      sf.a(var42, var17, var43, var14, var19);
                      var14 = var14 + var19;
                    }
                    var17 = var17 + var19;
                  }
                }
                var7[var15] = var43;
                return true;
              }
              var11 = var35.length;
              var11--;
              var12 = 255 & var22[var11];
              var11 = var11 - 4 * var12 * var5_int;
              var28 = new qc(var42);
              var37 = new int[var5_int];
              var29 = var37;
              var14_ref_int__ = var29;
              var28.field_f = var11;
              for (var15 = 0; var15 < var12; var15++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var28.a((byte) -27);
                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                }
              }
              var38 = new byte[var5_int][];
              var30 = var38;
              var15_ref_byte____ = var30;
              for (var16 = 0; var5_int > var16; var16++) {
                array$1 = new byte[var37[var16]];
                var15_ref_byte____[var16] = array$1;
                var37[var16] = 0;
              }
              var28.field_f = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var5_int > var19; var19++) {
                  var18 = var18 + var28.a((byte) -106);
                  sf.a(var35, var16, var38[var19], var37[var19], var18);
                  var16 = var16 + var18;
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                }
              }
              for (var17 = 0; var5_int > var17; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var33[var17];
                }
                if (this.field_b != 0) {
                  var7[var18] = var38[var17];
                } else {
                  var7[var18] = hf.a(param1 - 126, var38[var17], false);
                }
              }
              break L10;
            }
            if (var6 != null) {
              var11 = var33[0];
            } else {
              var11 = 0;
            }
            if (this.field_b != 0) {
              var7[var11] = var35;
            } else {
              var7[var11] = hf.a(-113, var35, false);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_105_0 = (RuntimeException) (var5);
          stackIn_105_1 = new StringBuilder().append("rh.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!(this.b(param2, -1, param1))) {
            return false;
        }
        if (param0 != 37) {
            return true;
        }
        if ((null != this.field_e[param1]) &&
            (!(this.field_e[param1][param2] == null))) {
            return true;
        }
        if (this.field_f[param1] != null) {
            return true;
        }
        this.a(param1, -118);
        if (this.field_f[param1] != null) {
            return true;
        }
        return false;
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object stackIn_4_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!param1) {
            field_i = (String) (this.field_f[0]);
          }
          if (!this.b(param3, -1, param0)) {
            stackIn_4_0 = null;
            return (byte[]) ((Object) stackIn_4_0);
          }
          L1: {
            var5 = null;
            if ((this.field_e[param0] != null) &&
                (null != this.field_e[param0][param3])) {
              break L1;
            }
            if (!this.a(param3, 4, param2, param0)) {
              this.a(param0, -118);
              if (!this.a(param3, 4, param2, param0)) {
                stackIn_12_0 = null;
                return (byte[]) ((Object) stackIn_12_0);
              }
            }
          }
          if (this.field_e[param0] == null) {
            throw new RuntimeException("");
          }
          if (null != this.field_e[param0][param3]) {
            var7 = uk.a(false, -116, this.field_e[param0][param3]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_b == 1) {
              this.field_e[param0][param3] = null;
              if (this.field_c.field_k[param0] == 1) {
                this.field_e[param0] = null;
              }
            } else {
              if (this.field_b == 2) {
                this.field_e[param0] = null;
              }
            }
          }
          stackIn_26_0 = var5;
          return (byte[]) ((Object) stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("rh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(0)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_c.field_n.a(true, ab.a(124, var4));
          if (!this.b(var3_int, 3)) {
            stackIn_7_0 = -1;
            return stackIn_7_0;
          }
          if (param0 <= 125) {
            this.field_h = false;
          }
          stackIn_11_0 = var3_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (var3);
          stackIn_14_1 = new StringBuilder().append("rh.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(0)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 > -123) {
            field_j = (String) null;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_c.field_n.a(true, ab.a(69, var4));
          stackIn_6_0 = this.a((byte) 102, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var3);
          stackIn_9_1 = new StringBuilder().append("rh.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Geoblox.field_C;
        if (!this.a(0)) {
          return 0;
        }
        if (param0 < 99) {
          return 9;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_f.length > var4; var4++) {
          if (this.field_c.field_a[var4] <= 0) {
            continue;
          }
          var3 = var3 + this.b((byte) 59, var4);
          var2 += 100;
        }
        if (var2 == 0) {
          return 100;
        }
        var4 = var3 * 100 / var2;
        return var4;
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(0)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_c.field_n.a(true, ab.a(80, var6));
          if (!this.b(var4_int, 3)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_c.field_f[var4_int].a(true, ab.a(93, var7));
          if (param0 == 113) {
            stackIn_12_0 = this.a((byte) 37, var4_int, var5);
            return stackIn_12_0;
          }
          stackIn_10_0 = ((boolean[]) (((Object[]) (this.field_f[8]))[2]))[9];
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var4);
          stackIn_15_1 = new StringBuilder().append("rh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    rh(nh param0, boolean param1, int param2) {
        this.field_c = null;
        try {
            if (0 > param2 || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_b = param2;
            this.field_g = param0;
            this.field_h = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
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
          if (!this.a(param0)) {
            stackIn_2_0 = null;
            return (byte[]) ((Object) stackIn_2_0);
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_c.field_n.a(true, ab.a(54, var6));
          if (!this.b(var4_int, 3)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_c.field_f[var4_int].a(true, ab.a(43, var7));
          stackIn_7_0 = this.a(var4_int, -28153, var5);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var4);
          stackIn_10_1 = new StringBuilder().append("rh.Q(").append(param0).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized int b(byte param0, int param1) {
        boolean discarded$0 = false;
        if (!(this.b(param1, 3))) {
            return 0;
        }
        if (null != this.field_f[param1]) {
            return 100;
        }
        if (param0 <= 31) {
            discarded$0 = this.b(-88, ((int[]) (((Object[]) (this.field_f[0]))[2]))[7]);
        }
        return this.field_g.a(126, param1);
    }

    final static long a(CharSequence param0, int param1) {
        int var5 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        var7 = Geoblox.field_C;
        try {
          var2_long = 0L;
          if (param1 != -48) {
            var8 = (CharSequence) null;
            rh.a((CharSequence) null, -67);
          }
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            L3: {
              var2_long = var2_long * 37L;
              var6 = param0.charAt(var5);
              if ((var6 >= 65) &&
                  (var6 <= 90)) {
                var2_long = var2_long + (long)(-65 + (1 + var6));
                break L3;
              }
              if ((var6 >= 97) &&
                  (var6 <= 122)) {
                var2_long = var2_long + (long)(-96 + var6);
                break L3;
              }
              if ((48 <= var6) &&
                  (57 >= var6)) {
                var2_long = var2_long + (long)(-48 + var6 + 27);
              }
            }
            if (177917621779460413L > var2_long) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = (RuntimeException) (var2);
          stackIn_25_1 = new StringBuilder().append("rh.N(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new tf();
        field_d = new tf();
        field_j = "That name is not available";
    }
}
