/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static int field_g;
    static int field_f;
    int field_k;
    private tk field_i;
    private Object[][] field_h;
    private boolean field_e;
    private we field_j;
    static nf field_a;
    private Object[] field_d;
    static int[] field_c;
    static bi[] field_b;

    private final synchronized boolean b(int param0, byte param1) {
        if (param1 != 23) {
          this.field_j = (we) null;
        }
        if (!this.b(0)) {
          return false;
        }
        if (param0 < 0 ||
          param0 >= this.field_j.field_q.length ||
          this.field_j.field_q[param0] == 0) {
          if (!oe.field_P) {
            return false;
          }
          throw new IllegalArgumentException(Integer.toString(param0));
        }
        return true;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.b(param0, (byte) 23)) {
          return false;
        }
        if (param1 != 0) {
          return ((boolean[]) (this.field_d[0]))[21];
        }
        if (this.field_d[param0] != null) {
          return true;
        }
        this.c(param0, param1 ^ 124);
        if (null != this.field_d[param0]) {
          return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int[] param1, byte param2, int param3) {
        Object[] array$0 = null;
        int var10_int = 0;
        int var21 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        boolean stackIn_36_2 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        Object[] var8 = null;
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
        kg var27 = null;
        byte[] var28 = null;
        kg var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        kg var33 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int var15Lifetime1;
        var23 = Confined.field_J ? 1 : 0;
        try {
          if (!this.b(param0, (byte) 23)) {
            return false;
          }
          if (this.field_d[param0] == null) {
            return false;
          }
          var5_int = this.field_j.field_t[param0];
          var6 = 74 % ((param2 - 41) / 46);
          var35 = this.field_j.field_r[param0];
          var25 = var35;
          var7 = var25;
          if (this.field_h[param0] == null) {
            array$0 = new Object[this.field_j.field_q[param0]];
            this.field_h[param0] = array$0;
          }
          var8 = this.field_h[param0];
          var9 = 1;
          for (var10_int = 0; var5_int > var10_int; var10_int++) {
            if (null == var7) {
              var11 = var10_int;
            } else {
              var11 = var35[var10_int];
            }
            if (null != var8[var11]) {
              continue;
            }
            var9 = 0;
            break;
          }
          if (var9 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != param1 && (param1[0] != 0 ||
            param1[1] != 0 ||
            0 != param1[2] ||
            param1[3] != 0)) {
            var36 = vb.a(true, 6, this.field_d[param0]);
            var26 = var36;
            var10 = var26;
            var27 = new kg(var36);
            var27.a(5, param1, var27.field_m.length, (byte) 72);
            decompiledFrameRemainder0 = false;
          }
          else {
            var10 = vb.a(false, 6, this.field_d[param0]);
          }
          try {
            var37 = tm.a(119, var10);
            var28 = var37;
            var24 = var28;
            var44 = var24;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var12_ref_RuntimeException = decompiledCaughtException;
            stackIn_35_0 = var12_ref_RuntimeException;
            stackIn_35_1 = new StringBuilder();
            stackIn_36_2 = (param1 != null);
            throw sd.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(" ").append(param0).append(" ").append(var10.length).append(" ").append(in.a(var10.length, var10, -97)).append(" ").append(in.a(-2 + var10.length, var10, -116)).append(" ").append(this.field_j.field_l[param0]).append(" ").append(this.field_j.field_s).toString());
          }
          if (this.field_e) {
            this.field_d[param0] = null;
          }
          if (var5_int > 1) {
            if (this.field_k == 2) {
              var12 = var37.length;
              var12--;
              var13 = var24[var12] & 255;
              var12 = var12 - var5_int * (var13 * 4);
              var33 = new kg(var44);
              var15 = 0;
              var16 = 0;
              var33.field_n = var12;
              for (var17 = 0; var17 < var13; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var33.f((byte) 92);
                  if (var7 == null) {
                    var20 = var19;
                  } else {
                    var20 = var35[var19];
                  }
                  if (param3 == var20) {
                    var15 = var15 + var18;
                    var16 = var20;
                  }
                }
              }
              if (var15 == 0) {
                return true;
              }
              var45 = new byte[var15];
              var33.field_n = var12;
              var15Lifetime1 = 0;
              var18 = 0;
              for (var19 = 0; var19 < var13; var19++) {
                var20 = 0;
                for (var21 = 0; var21 < var5_int; var21++) {
                  var20 = var20 + var33.f((byte) 51);
                  if (var7 == null) {
                    var22 = var21;
                  } else {
                    var22 = var35[var21];
                  }
                  if (param3 == var22) {
                    lj.a(var44, var18, var45, var15Lifetime1, var20);
                    var15Lifetime1 = var15Lifetime1 + var20;
                  }
                  var18 = var18 + var20;
                }
              }
              var8[var16] = var45;
            } else {
              var12 = var37.length;
              var12--;
              var13 = 255 & var24[var12];
              var12 = var12 - var5_int * (var13 * 4);
              var30 = new kg(var44);
              var39 = new int[var5_int];
              var31 = var39;
              var15_ref_int__ = var31;
              var30.field_n = var12;
              for (var16 = 0; var13 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var30.f((byte) 81);
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
              var30.field_n = var12;
              var17 = 0;
              for (var18 = 0; var13 > var18; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var30.f((byte) 59);
                  lj.a(var44, var17, var40[var20], var39[var20], var19);
                  var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                  var17 = var17 + var19;
                }
              }
              for (var18 = 0; var5_int > var18; var18++) {
                if (var7 != null) {
                  var19 = var35[var18];
                } else {
                  var19 = var18;
                }
                if (this.field_k != 0) {
                  var8[var19] = var40[var18];
                } else {
                  var8[var19] = ug.a(127, false, var40[var18]);
                }
              }
            }
          } else {
            if (var7 == null) {
              var12 = 0;
            } else {
              var12 = var35[0];
            }
            if (this.field_k != 0) {
              var8[var12] = var37;
              return true;
            }
            var8[var12] = ug.a(125, false, var44);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("mi.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_j.field_h.a((byte) 76, mg.a(var4, (byte) -95));
          if (!this.b(var3_int, (byte) 23)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (param0 < -25) {
            stackIn_11_0 = var3_int;
            return stackIn_11_0;
          }
          stackIn_9_0 = ((int[]) (((Object[]) (((Object[]) (this.field_d[2]))[4]))[0]))[0];
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("mi.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final synchronized int[] a(byte param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        if (param0 >= -39) {
          return (int[]) null;
        }
        if (!this.b(param1, (byte) 23)) {
          return null;
        }
        int[] var3 = this.field_j.field_r[param1];
        if (var3 == null) {
          var6 = new int[this.field_j.field_t[param1]];
          var3 = var6;
          for (var4 = 0; var6.length > var4; var4++) {
            var6[var4] = var4;
          }
        }
        return var3;
    }

    final synchronized boolean a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        String var6;
        var5 = Confined.field_J ? 1 : 0;
        if (!this.b(0)) {
          return false;
        }
        var2 = 1;
        if (param0 != 25057) {
          var6 = (String) null;
          this.a(((int[]) (this.field_d[9]))[36], (String) null, -11);
        }
        for (var3 = 0; this.field_j.field_u.length > var3; var3++) {
          var4 = this.field_j.field_u[var3];
          if (this.field_d[var4] == null) {
            this.c(var4, param0 - 24987);
            if (this.field_d[var4] == null) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final boolean b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0)) {
            return false;
          }
          if (param1 != -4308) {
            this.a(((int[]) (this.field_d[7]))[0], (String) null, ((int[]) (this.field_d[0]))[8]);
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_j.field_h.a((byte) 76, mg.a(var4, (byte) -100));
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("mi.O(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 > -61) {
          field_b = (bi[]) null;
        }
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != -2) {
          field_a = (nf) null;
        }
        return this.a(param0 ^ -60, param2, param1, (int[]) null);
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.b(param2 + 0)) {
          return false;
        }
        if (param1 >= param2 &&
          param0 >= 0 &&
          this.field_j.field_q.length > param1 &&
          this.field_j.field_q[param1] > param0) {
          return true;
        }
        if (oe.field_P) {
          throw new IllegalArgumentException(param1 + " " + param0);
        }
        return false;
    }

    private final synchronized void c(int param0, int param1) {
        if (!this.field_e) {
          this.field_d[param0] = ug.a(126, false, this.field_i.a(param0, 0));
        } else {
          this.field_d[param0] = this.field_i.a(param0, 0);
        }
        int var3 = -45 % ((-19 - param1) / 57);
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
          return false;
        }
        if (null != this.field_j) {
          return true;
        }
        this.field_j = this.field_i.a((byte) -55);
        if (null == this.field_j) {
          return false;
        }
        this.field_h = new Object[this.field_j.field_i][];
        this.field_d = new Object[this.field_j.field_i];
        return true;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param2 ^ param2)) {
            return false;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_j.field_h.a((byte) 76, mg.a(var6, (byte) 71));
          if (!this.b(var4_int, (byte) 23)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_j.field_j[var4_int].a((byte) 76, mg.a(var7, (byte) 94));
          stackIn_8_0 = this.a(var4_int, var5, 0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("mi.AA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized byte[] c(int param0, byte param1) {
        if (!this.b(0)) {
          return null;
        }
        if (param1 < 24) {
          ((int[]) (((Object[]) (this.field_d[36]))[4]))[10] = -56;
        }
        if (this.field_j.field_q.length == 1) {
          return this.a((byte) -2, 0, param0);
        }
        if (!this.b(param0, (byte) 23)) {
          return null;
        }
        if (1 == this.field_j.field_q[param0]) {
          return this.a((byte) -2, param0, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        byte[] stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.b(param1, param2, 0)) {
            return null;
          }
          var5 = null;
          if ((null == this.field_h[param2] ||
            null == this.field_h[param2][param1]) && !this.a(param2, param3, (byte) 87, param1)) {
            this.c(param2, 95);
            if (!this.a(param2, param3, (byte) 98, param1)) {
              return null;
            }
          }
          if (this.field_h[param2] == null) {
            throw new RuntimeException("");
          }
          if (this.field_h[param2][param1] != null) {
            var7 = vb.a(false, 6, this.field_h[param2][param1]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_k == 1) {
              this.field_h[param2][param1] = null;
              if (this.field_j.field_q[param2] == 1) {
                this.field_h[param2] = null;
              }
            } else {
              if (this.field_k == 2) {
                this.field_h[param2] = null;
              }
            }
          }
          if (param0 >= 47) {
            stackIn_29_0 = var5;
            return (byte[]) (stackIn_29_0);
          }
          stackIn_27_0 = (byte[]) (this.field_d[0]);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("mi.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sd.a((Throwable) (stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param1, param0, param2)) {
          return false;
        }
        if (this.field_h[param0] != null &&
          this.field_h[param0][param1] != null) {
          return true;
        }
        if (null != this.field_d[param0]) {
          return true;
        }
        this.c(param0, 62);
        if (null != this.field_d[param0]) {
          return true;
        }
        return false;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(0)) {
            return null;
          }
          param1 = param1.toLowerCase();
          param2 = param2.toLowerCase();
          var5 = -25 % ((param0 - 19) / 55);
          var7 = (CharSequence) ((Object) param1);
          var4_int = this.field_j.field_h.a((byte) 76, mg.a(var7, (byte) 65));
          if (!this.b(var4_int, (byte) 23)) {
            return null;
          }
          var8 = (CharSequence) ((Object) param2);
          var6 = this.field_j.field_j[var4_int].a((byte) 76, mg.a(var8, (byte) -87));
          stackIn_7_0 = this.a((byte) -2, var4_int, var6);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("mi.R(").append(param0).append(',');
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
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int d(int param0, byte param1) {
        if (param1 > -70) {
          this.a(-88, (String) (this.field_d[0]));
        }
        if (!this.b(param0, (byte) 23)) {
          return 0;
        }
        return this.field_j.field_q[param0];
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
          if (!this.b(0)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param0 != -8087) {
            stackIn_5_0 = ((int[]) (((Object[]) (this.field_d[10]))[4]))[1];
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_j.field_h.a((byte) 76, mg.a(var4, (byte) 88));
          stackIn_7_0 = this.b(var3_int, -102);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mi.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int a(int param0, String param1, int param2) {
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
          if (!this.b(param0, (byte) 23)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          if (param2 >= -23) {
            this.a(25, (String) (this.field_d[5]));
          }
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_j.field_j[param0].a((byte) 76, mg.a(var5, (byte) -107));
          if (this.b(var4_int, param0, 0)) {
            stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("mi.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Confined.field_J ? 1 : 0;
        if (!this.b(0)) {
          return 0;
        }
        if (param0 > -121) {
          ((Object[]) (this.field_d[8]))[2] = (Object) null;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_d.length > var4; var4++) {
          if (this.field_j.field_t[var4] > 0) {
            var3 = var3 + this.b(var4, -109);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param1)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_j.field_h.a((byte) 76, mg.a(var4, (byte) 65));
          stackIn_4_0 = this.a(var3_int, 0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mi.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!this.b(param1 + 37)) {
          return false;
        }
        if (this.field_j.field_q.length == 1) {
          return this.a(0, param0, param1 ^ -37);
        }
        if (!this.b(param0, (byte) 23)) {
          return false;
        }
        if (param1 != -37) {
          this.b(-115, -51);
        }
        if (this.field_j.field_q[param0] == 1) {
          return this.a(param0, 0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0, int param1) {
        if (param1 > -18) {
          return 67;
        }
        if (!this.b(param0, (byte) 23)) {
          return 0;
        }
        if (null != this.field_d[param0]) {
          return 100;
        }
        return this.field_i.a(param0, true);
    }

    mi(tk param0, boolean param1, int param2) {
        this.field_j = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_i = param0;
          this.field_e = param1 ? true : false;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = 0;
        field_a = new nf(540, 140);
        field_c = new int[8192];
        field_b = new bi[4];
    }
}
