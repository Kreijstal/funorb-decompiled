/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    private qg field_b;
    static int field_i;
    private int field_d;
    private Object[][] field_e;
    private Object[] field_h;
    private boolean field_c;
    static String field_f;
    private lk field_g;
    static dl[] field_j;
    static wj[] field_a;

    private final synchronized boolean a(byte param0, int param1) {
        if (!this.a((byte) 102)) {
          return false;
        }
        if (param1 >= 0 &&
          this.field_b.field_l.length > param1 &&
          this.field_b.field_l[param1] != 0) {
          if (param0 == 4) {
            return true;
          }
          ((long[]) (this.field_h[6]))[10] = 74L;
          return true;
        }
        if (aq.field_r) {
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!this.a(param2, 0, param0)) {
          return false;
        }
        if (this.field_e[param0] != null &&
          this.field_e[param0][param2] != null) {
          return true;
        }
        if (null != this.field_h[param0]) {
          return true;
        }
        if (param1 <= 126) {
          field_f = (String) null;
        }
        this.c(param0, 24634);
        if (this.field_h[param0] != null) {
          return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a((byte) 102)) {
          return false;
        }
        if (param1 != 0) {
          return ((boolean[]) (this.field_h[2]))[0];
        }
        if (param2 < 0 ||
          param0 < 0 ||
          this.field_b.field_l.length <= param2 ||
          param0 >= this.field_b.field_l[param2]) {
          if (aq.field_r) {
            throw new IllegalArgumentException(param2 + " " + param0);
          }
          return false;
        }
        return true;
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 102)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 >= -42) {
            stackIn_5_0 = ((boolean[]) (this.field_h[8]))[2];
            return stackIn_5_0;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_t.a(0, v.a(-2057727803, var4));
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("db.J(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] a(boolean param0, int[] param1, String param2, String param3) {
        boolean discarded$1 = false;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 102)) {
            return null;
          }
          param3 = param3.toLowerCase();
          param2 = param2.toLowerCase();
          if (param0) {
            discarded$1 = this.a((byte) -107, ((int[]) (this.field_h[3]))[1]);
          }
          var7 = (CharSequence) ((Object) param3);
          var5_int = this.field_b.field_t.a(0, v.a(-2057727803, var7));
          if (!this.a((byte) 4, var5_int)) {
            return null;
          }
          var8 = (CharSequence) ((Object) param2);
          var6 = this.field_b.field_i[var5_int].a(0, v.a(-2057727803, var8));
          stackIn_10_1 = var5_int;
          stackIn_11_2 = !(param0);
          stackIn_12_0 = this.a(stackIn_10_1, stackIn_11_2, param1, var6);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("db.W(").append(param0).append(',');
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
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!this.a((byte) 102)) {
          return null;
        }
        if (this.field_b.field_l.length == 1) {
          return this.b(param1, 0, 0);
        }
        if (!this.a((byte) 4, param1)) {
          return null;
        }
        if (this.field_b.field_l[param1] == 1) {
          return this.b(0, 0, param1);
        }
        if (param0 >= -47) {
          return (byte[]) (this.field_h[9]);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0, int param1) {
        if (!this.a((byte) 4, param1)) {
          return 0;
        }
        if (null != this.field_h[param1]) {
          return 100;
        }
        if (param0 != 25030) {
          field_j = (dl[]) null;
        }
        return this.field_g.a(param1, 486289953);
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != 0) {
          return (byte[]) (this.field_h[19]);
        }
        return this.a(param2, true, (int[]) null, param0);
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
          if (!this.a((byte) 102)) {
            return false;
          }
          if (param0 != -20402) {
            db.b((byte) -19);
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_b.field_t.a(0, v.a(param0 - 2057707401, var4));
          stackIn_7_0 = this.e(var3_int, 83);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("db.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 127) {
          db.b((byte) -99);
        }
        field_j = null;
        field_f = null;
    }

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 87) {
            field_a = (wj[]) null;
          }
          stackIn_3_0 = uh.a(param1, 192, 0, param1.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("db.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
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
        ng var26 = null;
        byte[] var27 = null;
        ng var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ng var32 = null;
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
        var22 = CrazyCrystals.field_B;
        try {
          if (param3 != 30511) {
            ((boolean[]) (this.field_h[32]))[0] = true;
          }
          if (!this.a((byte) 4, param0)) {
            return false;
          }
          if (null == this.field_h[param0]) {
            return false;
          }
          var5_int = this.field_b.field_f[param0];
          var34 = this.field_b.field_h[param0];
          var24 = var34;
          var6 = var24;
          if (null == this.field_e[param0]) {
            array$0 = new Object[this.field_b.field_l[param0]];
            this.field_e[param0] = array$0;
          }
          var7 = this.field_e[param0];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
            if (null == var6) {
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
          boolean decompiledFrameRemainder0 = true;
          if (null != param1 && (param1[0] != 0 ||
            param1[1] != 0 ||
            param1[2] != 0 ||
            param1[3] != 0)) {
            var35 = l.a((byte) 110, true, this.field_h[param0]);
            var25 = var35;
            var9 = var25;
            var26 = new ng(var35);
            var26.a(8, 5, var26.field_h.length, param1);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = l.a((byte) 110, false, this.field_h[param0]);
          }
          try {
            var36 = b.a(var9, -1);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (param1 != null);
            throw dn.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param0).append(" ").append(var9.length).append(" ").append(gi.a(var9.length, var9, 26009)).append(" ").append(gi.a(-2 + var9.length, var9, param3 - 4502)).append(" ").append(this.field_b.field_n[param0]).append(" ").append(this.field_b.field_b).toString());
          }
          if (this.field_c) {
            this.field_h[param0] = null;
          }
          if (var5_int > 1) {
            if (2 == this.field_d) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * var5_int * var12;
              var32 = new ng(var43);
              var14 = 0;
              var15 = 0;
              var32.field_f = var11;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var32.b((byte) -32);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
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
              var32.field_f = var11;
              var14Lifetime1 = 0;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var18Lifetime3 < var12; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var32.b((byte) 127);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (var21 == param2) {
                    eg.a(var43, var17Lifetime4, var44, var14Lifetime1, var19Lifetime2);
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
            var11 = var11 - var12Lifetime1 * (var5_int * 4);
            var29 = new ng(var43);
            var38 = new int[var5_int];
            var30 = var38;
            var14_ref_int__ = var30;
            var29.field_f = var11;
            for (var15Lifetime1 = 0; var12Lifetime1 > var15Lifetime1; var15Lifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var5_int > var17Lifetime1; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var29.b((byte) -65);
                var14_ref_int__[var17Lifetime1] = var14_ref_int__[var17Lifetime1] + var16Lifetime1;
              }
            }
            var39 = new byte[var5_int][];
            var31 = var39;
            var15_ref_byte____ = var31;
            for (var16Lifetime2 = 0; var16Lifetime2 < var5_int; var16Lifetime2++) {
              array$1 = new byte[var38[var16Lifetime2]];
              var15_ref_byte____[var16Lifetime2] = array$1;
              var38[var16Lifetime2] = 0;
            }
            var29.field_f = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var12Lifetime1 > var17Lifetime2; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var5_int > var19Lifetime1; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var29.b((byte) 127);
                eg.a(var43, var16Lifetime3, var39[var19Lifetime1], var38[var19Lifetime1], var18Lifetime1);
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
                var14_ref_int__[var19Lifetime1] = var14_ref_int__[var19Lifetime1] + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var17Lifetime3 < var5_int; var17Lifetime3++) {
              if (var6 == null) {
                var18Lifetime2 = var17Lifetime3;
              } else {
                var18Lifetime2 = var34[var17Lifetime3];
              }
              if (0 != this.field_d) {
                var7[var18Lifetime2] = var39[var17Lifetime3];
              } else {
                var7[var18Lifetime2] = fj.a(false, true, var39[var17Lifetime3]);
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.field_d == 0) {
              var7[var11] = fj.a(false, true, var43);
            } else {
              var7[var11] = var36;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("db.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final synchronized void c(int param0, int param1) {
        if (this.field_c) {
          this.field_h[param0] = this.field_g.a(param0, false);
        } else {
          this.field_h[param0] = fj.a(false, true, this.field_g.a(param0, false));
        }
        if (param1 != 24634) {
          field_a = (wj[]) (this.field_h[2]);
        }
    }

    final int b(String param0, int param1) {
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
          if (!this.a((byte) 102)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          if (param1 >= -27) {
            this.a((String) (this.field_h[4]), 25);
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_t.a(0, v.a(-2057727803, var4));
          stackIn_6_0 = this.b(25030, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("db.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 102)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (param1 != -1) {
            this.field_d = ((int[]) (this.field_h[7]))[20];
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_t.a(0, v.a(-2057727803, var4));
          if (this.a((byte) 4, var3_int)) {
            stackIn_9_0 = var3_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("db.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0) {
        if (param0 != 102) {
          return false;
        }
        if (null != this.field_b) {
          return true;
        }
        this.field_b = this.field_g.a(630779105);
        if (null == this.field_b) {
          return false;
        }
        this.field_h = new Object[this.field_b.field_a];
        this.field_e = new Object[this.field_b.field_a][];
        return true;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 102)) {
            return null;
          }
          param2 = param2.toLowerCase();
          if (param0 != 7693) {
            this.field_d = -38;
          }
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_b.field_t.a(0, v.a(-2057727803, var6));
          if (!this.a((byte) 4, var4_int)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_b.field_i[var4_int].a(0, v.a(-2057727803, var7));
          stackIn_9_0 = this.b(var5, 0, var4_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("db.R(").append(param0).append(',');
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
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized boolean a(boolean param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = CrazyCrystals.field_B;
        if (!this.a((byte) 102)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; var3 < this.field_b.field_e.length; var3++) {
          var4 = this.field_b.field_e[var3];
          if (null == this.field_h[var4]) {
            this.c(var4, 24634);
            if (this.field_h[var4] == null) {
              var2 = 0;
            }
          }
        }
        if (!param0) {
          return var2 != 0;
        }
        return true;
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = CrazyCrystals.field_B;
        if (!this.a((byte) 102)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_h.length; var4++) {
          if (this.field_b.field_f[var4] > 0) {
            var3 = var3 + this.b(25030, var4);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        if (param0 != 3492) {
          ((byte[]) (this.field_h[4]))[1] = (byte) -15;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final int a(int param0, int param1) {
        if (!this.a((byte) 4, param0)) {
          return 0;
        }
        if (param1 != 0) {
          return 32;
        }
        return this.field_b.field_l[param0];
    }

    final synchronized boolean e(int param0, int param1) {
        if (param1 <= 46) {
          this.b(102, 116);
        }
        if (!this.a((byte) 4, param0)) {
          return false;
        }
        if (this.field_h[param0] != null) {
          return true;
        }
        this.c(param0, 24634);
        if (this.field_h[param0] == null) {
          return false;
        }
        return true;
    }

    final int a(int param0) {
        if (param0 < 17) {
          String var3 = (String) null;
          this.a((String) null, 104);
        }
        if (!this.a((byte) 102)) {
          return -1;
        }
        return this.field_b.field_l.length;
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
          if (!this.a((byte) 4, param2)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param0 != -2862) {
            this.field_e = (Object[][]) null;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_b.field_i[param2].a(0, v.a(-2057727803, var5));
          if (this.a(var4_int, 0, param2)) {
            stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("db.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object stackIn_9_0 = null;
        byte[] stackIn_14_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param3, 0, param0)) {
            return null;
          }
          var5 = null;
          if ((this.field_e[param0] == null ||
            this.field_e[param0][param3] == null) && !this.a(param0, param2, param3, 30511)) {
            this.c(param0, 24634);
            if (!this.a(param0, param2, param3, 30511)) {
              stackIn_9_0 = null;
              return (byte[]) (stackIn_9_0);
            }
          }
          if (this.field_e[param0] == null) {
            throw new RuntimeException("");
          }
          if (!param1) {
            stackIn_14_0 = (byte[]) null;
            return stackIn_14_0;
          }
          if (this.field_e[param0][param3] != null) {
            var7 = l.a((byte) 110, false, this.field_e[param0][param3]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 == this.field_d) {
              this.field_e[param0][param3] = null;
              if (this.field_b.field_l[param0] == 1) {
                this.field_e[param0] = null;
              }
            } else {
              if (this.field_d == 2) {
                this.field_e[param0] = null;
              }
            }
          }
          stackIn_28_0 = var5;
          return (byte[]) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("db.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dn.a((Throwable) (stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(')').toString());
        }
    }

    db(lk param0, boolean param1, int param2) {
        this.field_b = null;
        try {
          if (0 > param2 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_g = param0;
          this.field_c = param1 ? true : false;
          this.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(byte param0, String param1, String param2) {
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
          if (!this.a((byte) 102)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param2 = param2.toLowerCase();
          if (param0 != 43) {
            return true;
          }
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_b.field_t.a(param0 ^ 43, v.a(-2057727803, var6));
          if (!this.a((byte) 4, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_b.field_i[var4_int].a(0, v.a(param0 - 2057727846, var7));
          stackIn_12_0 = this.a(var4_int, (byte) 127, var5);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("db.U(").append(param0).append(',');
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
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_f = "That name is not available";
    }
}
