/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends rh {
    int field_P;
    static int field_N;
    static byte[][] field_M;
    private qh field_J;
    static String field_O;
    private int field_L;
    static String field_K;
    int field_I;

    final static String b(boolean param0) {
        if (param0) {
          qk.j(125);
          if (oe.field_b == fd.field_h) {
            return bf.field_f;
          }
          return lf.field_T;
        }
        if (oe.field_b == fd.field_h) {
          return bf.field_f;
        }
        return lf.field_T;
    }

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(var5 - 65 + 97);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              57 < var5)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          if (param0 > -85) {
            field_O = (String) null;
          }
          stackIn_23_0 = new String(var8);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("qk.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static Object a(byte[] param0, boolean param1, byte param2) {
        pi var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        pi stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param0.length > 136) {
            var3 = new pi();
            ((fh) ((Object) var3)).a(param0, 13673);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          var3_int = 97 / ((72 - param2) / 37);
          if (param1) {
            stackIn_11_0 = qd.a(param0, (byte) 58);
            return stackIn_11_0;
          }
          stackIn_9_0 = (byte[]) (param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("qk.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = TrackController.field_F ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param2 - param5 - this.field_I;
          var9 = this.field_x - 2 * this.field_I;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_L / var9;
          if (1 != param3) {
            if (2 == param3) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_J.b(-1) > var12; var12++) {
                var13 = this.field_J.c((byte) -82, var12) - var8_int;
                var13 = var13 * var13;
                if (var13 < var10) {
                  var10 = var13;
                  var11 = var12;
                }
              }
              if (var11 < 0) {
                return true;
              }
              this.field_J.a(var11, -12759);
            }
          } else {
            this.field_J.a((byte) -120, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("qk.R(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param0 != -1) {
          this.a(-40, 98);
          if (param1 < 0) {
            return -1;
          }
          if (this.field_J.b(param0 + 0) > param1) {
            return this.field_J.c((byte) 70, param1);
          }
          return -1;
        }
        if (param1 < 0) {
          return -1;
        }
        if (this.field_J.b(param0 + 0) > param1) {
          return this.field_J.c((byte) 70, param1);
        }
        return -1;
    }

    final static wj j(int param0) {
        if (param0 != -17514) {
          field_O = (String) null;
          return (wj) ((Object) new eb());
        }
        return (wj) ((Object) new eb());
    }

    final int c(boolean param0) {
        if (!param0) {
          qk.b(true);
          return this.field_J.b(-1);
        }
        return this.field_J.b(-1);
    }

    final int k(int param0) {
        if (param0 != 26856) {
          byte[] var3 = (byte[]) null;
          qk.a((byte[]) null, true, (byte) 68);
          return this.field_L;
        }
        return this.field_L;
    }

    public static void a(byte param0) {
        field_M = (byte[][]) null;
        field_K = null;
        field_O = null;
        if (param0 <= 22) {
          field_O = (String) null;
        }
    }

    private qk() throws Throwable {
        throw new Error();
    }

    static {
        field_O = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_N = 20;
        field_K = "Name is available";
    }
}
