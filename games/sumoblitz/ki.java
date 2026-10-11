/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ki {
    private sg field_h;
    private boolean field_a;
    static volatile boolean field_i;
    private int field_c;
    static String field_j;
    private rb field_e;
    static Random field_b;
    private Object[][] field_g;
    private Object[] field_d;
    static int field_f;

    final synchronized byte[] a(String param0, String param1, int param2) {
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
          if (!this.b((byte) 127)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_h.field_e.a(l.a(var6, param2 - 44), (byte) -113);
          if (!this.a(var4_int, true)) {
            return null;
          }
          if (param2 != -1) {
            stackIn_8_0 = (byte[]) null;
            return stackIn_8_0;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_h.field_q[var4_int].a(l.a(var7, -84), (byte) 90);
          stackIn_10_0 = this.a((byte) 118, var5, var4_int);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ki.P(");
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
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static an c(byte param0) {
        if (param0 <= 80) {
          ki.b(62);
        }
        if (nw.field_e == hm.field_a) {
          throw new IllegalStateException();
        }
        if (st.field_z == nw.field_e) {
          nw.field_e = hm.field_a;
          return eg.field_l;
        }
        return null;
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 <= 84) {
          this.c(-101, 72);
        }
        return this.a(param2, 104, (int[]) null, param1);
    }

    final int a(int param0, String param1) {
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
          if (!this.b((byte) 127)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (param0 != 0) {
            ki.c(((byte[]) (this.field_d[9]))[0]);
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_h.field_e.a(l.a(var4, param0 ^ -66), (byte) 109);
          if (this.a(var3_int, true)) {
            stackIn_9_0 = var3_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ki.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final synchronized boolean b(byte param0) {
        if (param0 != 127) {
          return true;
        }
        if (this.field_h == null) {
          this.field_h = this.field_e.b((byte) -111);
          if (null == this.field_h) {
            return false;
          }
          this.field_g = new Object[this.field_h.field_d][];
          this.field_d = new Object[this.field_h.field_d];
        }
        return true;
    }

    final int a(int param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 125) {
            var5 = (String) null;
            this.a(-98, (String) null, (byte) -65);
          }
          if (!this.a(param0, true)) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_h.field_q[param0].a(l.a(var6, -115), (byte) 105);
          if (this.a(param0, var4_int, (byte) -79)) {
            stackIn_9_0 = var4_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ki.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 127)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var3_int = -43 / ((-28 - param0) / 53);
          var5 = (CharSequence) ((Object) param1);
          var4 = this.field_h.field_e.a(l.a(var5, -108), (byte) -72);
          if (var4 >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ki.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized boolean b(byte param0, int param1) {
        if (!this.a(param1, true)) {
          return false;
        }
        if (null != this.field_d[param1]) {
          return true;
        }
        this.b(param1, 89);
        if (param0 != -110) {
          this.a((String) null, (String) (this.field_d[6]), -2);
        }
        if (this.field_d[param1] == null) {
          return false;
        }
        return true;
    }

    final synchronized byte[] c(int param0, int param1) {
        if (param0 != -14296) {
          this.field_d = (Object[]) null;
        }
        if (!this.b((byte) 127)) {
          return null;
        }
        if (this.field_h.field_r.length == 1) {
          return this.a((byte) 108, param1, 0);
        }
        if (!this.a(param1, true)) {
          return null;
        }
        if (1 == this.field_h.field_r[param1]) {
          return this.a((byte) 111, 0, param1);
        }
        throw new RuntimeException();
    }

    final synchronized int a(int param0, byte param1) {
        if (!this.a(param0, true)) {
          return 0;
        }
        if (null != this.field_d[param0]) {
          return 100;
        }
        int var3 = 81 % ((param1 + 11) / 36);
        return this.field_e.a(param0, 0);
    }

    final byte[] a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 108) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var3_int = this.a(0, "");
          if (-1 != var3_int) {
            stackIn_6_0 = this.a(param1, "", -1);
            return stackIn_6_0;
          }
          stackIn_8_0 = this.a("", param1, -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ki.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != 6) {
          ki.c((byte) 84);
        }
        if (null == km.field_o) {
          km.field_o = gd.a((byte) -82, 6);
        }
        if (km.field_o.field_o) {
          ah.field_g = km.field_o.field_m;
          km.field_o = null;
          if (ah.field_g == null) {
            return true;
          }
          kf.a((byte) 111);
          return true;
        }
        return false;
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
          if (!this.b((byte) 127)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 != 100) {
            return true;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_h.field_e.a(l.a(var4, -116), (byte) 124);
          stackIn_7_0 = this.b((byte) -110, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ki.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, boolean param1, int param2) {
        if (!this.a(param0, param2, (byte) -79)) {
          return false;
        }
        if (this.field_g[param0] != null &&
          null != this.field_g[param0][param2]) {
          return true;
        }
        if (null != this.field_d[param0]) {
          return true;
        }
        if (param1) {
          String var5 = (String) null;
          this.b((byte) 11, (String) null);
        }
        this.b(param0, 84);
        if (null != this.field_d[param0]) {
          return true;
        }
        return false;
    }

    final int a(byte param0, int param1) {
        if (!this.a(param1, true)) {
          return 0;
        }
        if (param0 != -65) {
          this.b((byte) 97, -83);
        }
        return this.field_h.field_r[param1];
    }

    final int b(boolean param0) {
        if (!this.b((byte) 127)) {
          return -1;
        }
        if (!param0) {
          this.a((String) (this.field_d[2]), ((byte[]) (this.field_d[4]))[1]);
        }
        return this.field_h.field_r.length;
    }

    private final synchronized void b(int param0, int param1) {
        if (param1 <= 19) {
          this.field_d = (Object[]) null;
        }
        if (this.field_a) {
          this.field_d[param0] = this.field_e.a(param0, false);
        } else {
          this.field_d[param0] = aj.a((byte) -121, this.field_e.a(param0, false), false);
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
        fs var26 = null;
        byte[] var27 = null;
        fs var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        fs var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!this.a(param3, true)) {
            return false;
          }
          if (this.field_d[param3] == null) {
            return false;
          }
          var5_int = this.field_h.field_m[param3];
          var34 = this.field_h.field_s[param3];
          var24 = var34;
          var6 = var24;
          if (null == this.field_g[param3]) {
            array$0 = new Object[this.field_h.field_r[param3]];
            this.field_g[param3] = array$0;
          }
          var7 = this.field_g[param3];
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (null == var6) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
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
          if (null != param1 && (param1[0] != 0 ||
            0 != param1[1] ||
            param1[2] != 0 ||
            0 != param1[3])) {
            var35 = ab.a(true, this.field_d[param3], 0);
            var25 = var35;
            var9 = var25;
            var26 = new fs(var35);
            var26.a(var26.field_n.length, (byte) 127, 5, param1);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = ab.a(false, this.field_d[param3], 0);
          }
          try {
            var36 = nd.a(-1, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (param1 != null);
            throw qo.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param3).append(" ").append(var9.length).append(" ").append(am.a(var9.length, var9, (byte) 56)).append(" ").append(am.a(var9.length - 2, var9, (byte) -103)).append(" ").append(this.field_h.field_b[param3]).append(" ").append(this.field_h.field_p).toString());
          }
          if (param0 > -76) {
            this.field_g = (Object[][]) (this.field_d[33]);
          }
          if (this.field_a) {
            this.field_d[param3] = null;
          }
          if (var5_int > 1) {
            if (2 == this.field_c) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * (var12 * var5_int);
              var32 = new fs(var43);
              var14 = 0;
              var32.field_p = var11;
              var15 = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var32.c(true);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
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
              var14Lifetime1 = 0;
              var32.field_p = var11;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19 = var19 + var32.c(true);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (param2 == var21) {
                    la.a(var43, var17, var44, var14Lifetime1, var19);
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
              var11 = var11 - 4 * (var12 * var5_int);
              var29 = new fs(var43);
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              var29.field_p = var11;
              for (var15 = 0; var15 < var12; var15++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var29.c(true);
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
              var29.field_p = var11;
              var16 = 0;
              for (var17 = 0; var17 < var12; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var29.c(true);
                  la.a(var43, var16, var39[var19], var38[var19], var18);
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                  var16 = var16 + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (this.field_c == 0) {
                  var7[var18] = aj.a((byte) -119, var39[var17], false);
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
            if (0 != this.field_c) {
              var7[var11] = var36;
              return true;
            }
            var7[var11] = aj.a((byte) -119, var43, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_107_0 = var5;
          stackIn_107_1 = new StringBuilder().append("ki.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        if (param2 != -79) {
          field_i = true;
        }
        if (!this.b((byte) 127)) {
          return false;
        }
        if (param0 < 0 ||
          param1 < 0 ||
          param0 >= this.field_h.field_r.length ||
          param1 >= this.field_h.field_r[param0]) {
          if (!jg.field_a) {
            return false;
          }
          throw new IllegalArgumentException(param0 + " " + param1);
        }
        return true;
    }

    final int a(String param0, byte param1) {
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
          if (!this.b((byte) 127)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          if (param1 != 33) {
            stackIn_5_0 = 123;
            return stackIn_5_0;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_h.field_e.a(l.a(var4, param1 ^ -101), (byte) 103);
          stackIn_7_0 = this.a(var3_int, (byte) 79);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ki.BA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        byte[] var8 = null;
        try {
          var5_int = 83 / ((param1 - 45) / 38);
          if (!this.a(param0, param3, (byte) -79)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var6 = null;
          if ((null == this.field_g[param0] ||
            this.field_g[param0][param3] == null) && !this.a(-126, param2, param3, param0)) {
            this.b(param0, 124);
            if (!this.a(-93, param2, param3, param0)) {
              return null;
            }
          }
          if (this.field_g[param0] == null) {
            throw new RuntimeException("");
          }
          if (null != this.field_g[param0][param3]) {
            var8 = ab.a(false, this.field_g[param0][param3], 0);
            var6 = var8;
            if (var8 == null) {
              throw new RuntimeException("");
            }
          }
          if (var6 != null) {
            if (this.field_c == 1) {
              this.field_g[param0][param3] = null;
              if (this.field_h.field_r[param0] == 1) {
                this.field_g[param0] = null;
              }
            } else {
              if (this.field_c == 2) {
                this.field_g[param0] = null;
              }
            }
          }
          stackIn_27_0 = var6;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ki.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized int[] a(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (!this.a(param0, true)) {
          return null;
        }
        int[] var3 = this.field_h.field_s[param0];
        if (param1 != -25915) {
          ki.c((byte) 102);
        }
        if (var3 == null) {
          var6 = new int[this.field_h.field_m[param0]];
          var3 = var6;
          for (var4 = 0; var4 < var6.length; var4++) {
            var6[var4] = var4;
          }
        }
        return var3;
    }

    final synchronized boolean a(boolean param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (!this.b((byte) 127)) {
          return false;
        }
        var2 = param0 ? 1 : 0;
        for (var3 = 0; var3 < this.field_h.field_f.length; var3++) {
          var4 = this.field_h.field_f[var3];
          if (null == this.field_d[var4]) {
            this.b(var4, 99);
            if (null == this.field_d[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (!this.b((byte) 127)) {
          return 0;
        }
        var2 = param0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_d.length; var4++) {
          if (this.field_h.field_m[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.a(var4, (byte) 50);
          }
        }
        if (0 == var2) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final boolean b(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 127)) {
            return false;
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_h.field_e.a(l.a(var6, -124), (byte) 100);
          if (var4_int < 0) {
            return false;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_h.field_q[var4_int].a(l.a(var7, -115), (byte) -83);
          if (param2 >= ~var5) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ki.C(");
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
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != 35) {
          ki.b(91);
        }
        field_b = null;
        field_j = null;
    }

    ki(rb param0, boolean param1, int param2) {
        this.field_h = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_c = param2;
          this.field_e = param0;
          this.field_a = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized boolean a(int param0, boolean param1) {
        if (!this.b((byte) 127)) {
          return false;
        }
        if (!param1) {
          field_j = (String) (this.field_d[5]);
        }
        if (param0 >= 0 &&
          this.field_h.field_r.length > param0 &&
          this.field_h.field_r[param0] != 0) {
          return true;
        }
        if (!jg.field_a) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final boolean a(String param0, int param1, String param2) {
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
          if (!this.b((byte) 127)) {
            return false;
          }
          param0 = param0.toLowerCase();
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_h.field_e.a(l.a(var6, -103), (byte) -78);
          if (!this.a(var4_int, true)) {
            return false;
          }
          if (param1 != -1158) {
            return false;
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_h.field_q[var4_int].a(l.a(var7, -41), (byte) -25);
          stackIn_11_0 = this.a(var4_int, false, var5);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ki.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_i = false;
        field_j = "Fullscreen";
        field_b = new Random();
        field_f = 1;
    }
}
