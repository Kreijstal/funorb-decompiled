/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr {
    int field_e;
    static int field_b;
    boolean field_g;
    private rf field_f;
    private tja field_a;
    private Object[][] field_d;
    private Object[] field_c;
    static String field_h;

    final int a(String param0, boolean param1) {
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
          if (!this.a(0)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_f.field_m.a((byte) -79, efa.a(var4, true));
          if (param1) {
            this.b(87, 101);
          }
          if (this.a(var3_int, (byte) 70)) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("vr.U(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
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
          if (param1 != 20637) {
            this.a(15);
          }
          if (!this.a(param1 - 20637)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_f.field_m.a((byte) -75, efa.a(var4, true));
          stackIn_7_0 = this.c(var3_int, -734);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("vr.AA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(int param0) {
        if (param0 != 0) {
          this.a((byte) -17);
        }
        if (this.field_f == null) {
          this.field_f = this.field_a.b(-16);
          if (this.field_f == null) {
            return false;
          }
          this.field_c = new Object[this.field_f.field_f];
          this.field_d = new Object[this.field_f.field_f][];
        }
        return true;
    }

    private final synchronized boolean a(int[] param0, byte param1, int param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        int[] stackIn_29_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        boolean stackIn_40_2 = false;
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
        lu var26 = null;
        byte[] var27 = null;
        lu var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        lu var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = BachelorFridge.field_y;
        try {
          if (!this.a(param3, (byte) 70)) {
            return false;
          }
          if (this.field_c[param3] == null) {
            return false;
          }
          var5_int = this.field_f.field_e[param3];
          var34 = this.field_f.field_c[param3];
          var24 = var34;
          var6 = var24;
          if (this.field_d[param3] == null) {
            array$0 = new Object[this.field_f.field_j[param3]];
            this.field_d[param3] = array$0;
          }
          var7 = this.field_d[param3];
          var8 = 1;
          if (param1 > -83) {
            this.field_c = (Object[]) null;
          }
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
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
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            if (param0[0] == 0) {
              stackIn_29_0 = (int[]) (param0);
              decompiledFrameRemainder0 = (stackIn_29_0[1] != 0 ||
                0 != param0[2] ||
                param0[3] != 0);
            }
            if (decompiledFrameRemainder0) {
              var35 = tb.a(true, (byte) 105, this.field_c[param3]);
              var25 = var35;
              var9 = var25;
              var26 = new lu(var35);
              var26.a(17654, 5, param0, var26.field_h.length);
              decompiledFrameRemainder1 = false;
            }
          }
          if (decompiledFrameRemainder1) {
            var9 = tb.a(false, (byte) 81, this.field_c[param3]);
          }
          try {
            var36 = td.a(-124, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_39_0 = var11_ref_RuntimeException;
            stackIn_39_1 = new StringBuilder();
            stackIn_40_2 = (param0 != null);
            throw pe.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(" ").append(param3).append(" ").append(var9.length).append(" ").append(wc.a(var9, -31303, var9.length)).append(" ").append(wc.a(var9, -31303, var9.length - 2)).append(" ").append(this.field_f.field_p[param3]).append(" ").append(this.field_f.field_b).toString());
          }
          if (this.field_g) {
            this.field_c[param3] = null;
          }
          if (var5_int > 1) {
            if (this.field_e == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var12 * (var5_int * 4);
              var32 = new lu(var43);
              var14 = 0;
              var15 = 0;
              var32.field_g = var11;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var32.f(-68);
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
              var32.field_g = var11;
              var14Lifetime1 = 0;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19 = var19 + var32.f(124);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (var21 == param2) {
                    bl.a(var43, var17, var44, var14Lifetime1, var19);
                    var14Lifetime1 = var14Lifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * (var5_int * var12);
              var29 = new lu(var43);
              var29.field_g = var11;
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              for (var15 = 0; var15 < var12; var15++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var29.f(-128);
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
              var29.field_g = var11;
              var16 = 0;
              for (var17 = 0; var17 < var12; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var29.f(72);
                  bl.a(var43, var16, var39[var19], var38[var19], var18);
                  var16 = var16 + var18;
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (this.field_e == 0) {
                  var7[var18] = ug.a(false, var39[var17], -19524);
                } else {
                  var7[var18] = var39[var17];
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
            var7[var11] = ug.a(false, var43, -19524);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_107_0 = var5;
          stackIn_107_1 = new StringBuilder().append("vr.CA(");
          if (param0 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(0)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param2 = param2.toLowerCase();
          if (param0 != 123) {
            stackIn_5_0 = (byte[]) null;
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_f.field_m.a((byte) -87, efa.a(var6, true));
          if (!this.a(var4_int, (byte) 70)) {
            stackIn_8_0 = null;
            return (byte[]) (stackIn_8_0);
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_f.field_l[var4_int].a((byte) -81, efa.a(var7, true));
          stackIn_10_0 = this.b(-71, var4_int, var5);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("vr.Q(").append(param0).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -19779) {
          return;
        }
        field_h = null;
    }

    final int a(byte param0) {
        if (param0 != 20) {
          return -79;
        }
        if (!this.a(0)) {
          return -1;
        }
        return this.field_f.field_j.length;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        String var5;
        if (!this.a(0)) {
          return false;
        }
        if (param1 >= 0 &&
          param2 >= 0 &&
          this.field_f.field_j.length > param1 &&
          param2 < this.field_f.field_j[param1]) {
          if (!param0) {
            return true;
          }
          var5 = (String) null;
          this.a((String) null, false);
          return true;
        }
        if (!cia.field_j) {
          return false;
        }
        throw new IllegalArgumentException(param1 + " " + param2);
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        boolean stackIn_5_0 = false;
        cr stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        String stackIn_8_2 = null;
        boolean stackIn_9_3 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(0)) {
            return false;
          }
          if (param1) {
            stackIn_5_0 = ((boolean[]) (this.field_c[5]))[9];
            return stackIn_5_0;
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          stackIn_8_0 = this.field_f.field_m;
          stackIn_8_1 = -92;
          stackIn_8_2 = (String) (param2);
          stackIn_9_3 = !(param1);
          var4_int = ((cr) (Object) stackIn_8_0).a((byte) stackIn_8_1, efa.a((CharSequence) ((Object) stackIn_8_2), stackIn_9_3));
          if (!this.a(var4_int, (byte) 70)) {
            return false;
          }
          var6 = (CharSequence) ((Object) param0);
          var5 = this.field_f.field_l[var4_int].a((byte) -104, efa.a(var6, true));
          stackIn_13_0 = this.a(-121, var5, var4_int);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("vr.P(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final synchronized int a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = BachelorFridge.field_y;
        if (!this.a(0)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        if (!param0) {
          return 1;
        }
        for (var4 = 0; var4 < this.field_c.length; var4++) {
          if (this.field_f.field_e[var4] > 0) {
            var3 = var3 + this.b(var4, (byte) -87);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final boolean b(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(0)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_f.field_m.a((byte) -115, efa.a(var4, true));
          if (var3_int < 0) {
            return false;
          }
          if (!param1) {
            return true;
          }
          this.a(((byte[]) (this.field_c[0]))[9], -128, (String) (this.field_c[0]));
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("vr.W(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int b(int param0, byte param1) {
        if (param1 != -87) {
          this.a(((int[]) (this.field_c[13]))[1]);
        }
        if (!this.a(param0, (byte) 70)) {
          return 0;
        }
        if (this.field_c[param0] != null) {
          return 100;
        }
        return this.field_a.a(8192, param0);
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(false, param0, param3)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param2 != -3) {
            stackIn_5_0 = (byte[]) null;
            return stackIn_5_0;
          }
          var5 = null;
          if ((null == this.field_d[param0] ||
            this.field_d[param0][param3] == null) && !this.a(param1, (byte) -116, param3, param0)) {
            this.e(param0, param2 + 3);
            if (!this.a(param1, (byte) -101, param3, param0)) {
              return null;
            }
          }
          if (this.field_d[param0] == null) {
            throw new RuntimeException("");
          }
          if (null != this.field_d[param0][param3]) {
            var7 = tb.a(false, (byte) 96, this.field_d[param0][param3]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_e != 1) {
              if (this.field_e == 2) {
                this.field_d[param0] = null;
              }
            } else {
              this.field_d[param0][param3] = null;
              if (this.field_f.field_j[param0] == 1) {
                this.field_d[param0] = null;
              }
            }
          }
          stackIn_26_0 = var5;
          return (byte[]) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("vr.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pe.a((Throwable) (stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        ne var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BachelorFridge.field_y;
        try {
          if (param0 != 75) {
            field_b = 75;
          }
          var4 = (ne) (rg.field_f.b((byte) 90));
          while (var4 != null) {
            kja.a(param1, (byte) 58, var4);
            var4 = (ne) (rg.field_f.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "vr.M(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.a(param0, (byte) 70)) {
          return false;
        }
        if (param1 != -734) {
          this.field_a = (tja) null;
        }
        if (this.field_c[param0] != null) {
          return true;
        }
        this.e(param0, 0);
        if (this.field_c[param0] == null) {
          return false;
        }
        return true;
    }

    final synchronized boolean b(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = BachelorFridge.field_y;
        if (!this.a(0)) {
          return false;
        }
        var2 = 1;
        if (param0 < 87) {
          vr.a((byte) -107, ((int[]) (this.field_c[5]))[10]);
        }
        for (var3 = 0; var3 < this.field_f.field_o.length; var3++) {
          var4 = this.field_f.field_o[var3];
          if (null == this.field_c[var4]) {
            this.e(var4, 0);
            if (null == this.field_c[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4 = -67 % ((param0 - 20) / 34);
        return this.a(param1, (int[]) null, -3, param2);
    }

    private final synchronized void e(int param0, int param1) {
        if (param1 != 0) {
          this.b((byte) 86);
        }
        if (this.field_g) {
          this.field_c[param0] = this.field_a.a((byte) 112, param0);
        } else {
          this.field_c[param0] = ug.a(false, this.field_a.a((byte) 101, param0), -19524);
        }
    }

    private final synchronized boolean a(int param0, byte param1) {
        boolean discarded$0 = false;
        if (!this.a(0)) {
          return false;
        }
        if (param0 < 0 ||
          param0 >= this.field_f.field_j.length ||
          this.field_f.field_j[param0] == 0) {
          if (cia.field_j) {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
          return false;
        }
        if (param1 != 70) {
          discarded$0 = this.a((int[]) (this.field_c[7]), ((byte[]) (this.field_c[23]))[2], ((int[]) (this.field_c[11]))[1], 106);
          return true;
        }
        return true;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.a(param0 + param0)) {
          return false;
        }
        if (this.field_f.field_j.length == 1) {
          return this.a(-126, param1, 0);
        }
        if (!this.a(param1, (byte) 70)) {
          return false;
        }
        if (this.field_f.field_j[param1] == 1) {
          return this.a(param0 - 102, 0, param1);
        }
        throw new RuntimeException();
    }

    final int a(byte param0, int param1, String param2) {
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
          if (!this.a(param1, (byte) 70)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param2 = param2.toLowerCase();
          if (param0 != 6) {
            this.field_f = (rf) null;
          }
          var5 = (CharSequence) ((Object) param2);
          var4_int = this.field_f.field_l[param1].a((byte) -128, efa.a(var5, true));
          if (this.a(false, param1, var4_int)) {
            stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("vr.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int d(int param0, int param1) {
        if (param1 != 0) {
          vr.a(-90, (po) (((Object[]) (((Object[]) (this.field_c[6]))[0]))[9]), 120, ((int[]) (this.field_c[35]))[29], 19, (kv[]) null, -99, (po) null, -110, ((int[]) (this.field_c[0]))[6], ((boolean[]) (this.field_c[35]))[11], (kv[]) null, 84, ((int[]) (this.field_c[0]))[0], 54);
        }
        if (!this.a(param0, (byte) 70)) {
          return 0;
        }
        return this.field_f.field_j[param0];
    }

    final static void a(int param0, po param1, int param2, int param3, int param4, kv[] param5, int param6, po param7, int param8, int param9, boolean param10, kv[] param11, int param12, int param13, int param14) {
        try {
          kv[] var16 = (kv[]) null;
          ll.a(jc.field_t, param13, param3, param2, param8, param5, 0, param6, param1, param9, param4, (kv[]) null, nja.field_a, param11, param7, param0, 0, 256, param12, param14, fa.field_f);
          la.a(param10, 2);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vr.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ',' + param10 + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!this.a(param1)) {
          return null;
        }
        if (this.field_f.field_j.length == 1) {
          return this.b(param1 ^ -56, 0, param0);
        }
        if (!this.a(param0, (byte) 70)) {
          return null;
        }
        if (this.field_f.field_j[param0] == 1) {
          return this.b(param1 - 45, param0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (param0 >= -101) {
          return ((boolean[]) (this.field_c[3]))[6];
        }
        if (!this.a(false, param2, param1)) {
          return false;
        }
        if (null != this.field_d[param2] &&
          this.field_d[param2][param1] != null) {
          return true;
        }
        if (null != this.field_c[param2]) {
          return true;
        }
        this.e(param2, 0);
        if (null != this.field_c[param2]) {
          return true;
        }
        return false;
    }

    vr(tja param0, boolean param1, int param2) {
        this.field_f = null;
        try {
          if (param2 < 0 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_a = param0;
          this.field_e = param2;
          this.field_g = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(param0)) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_f.field_m.a((byte) -95, efa.a(var4, true));
          stackIn_5_0 = this.b(var3_int, (byte) -87);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vr.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_h = "Age:";
    }
}
