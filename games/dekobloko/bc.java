/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends a {
    static mf field_E;
    static String field_F;
    private sn field_C;
    private sn[] field_A;
    static int[][] field_D;
    static String field_G;
    static int[] field_J;
    static int[] field_I;
    static int field_B;
    static String field_K;

    private final void a(byte param0, bc param1, boolean param2) {
        sn dupTemp$0 = null;
        sn stackIn_9_0 = null;
        sn stackIn_10_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        sn var5 = null;
        sn var6 = null;
        int var7 = 0;
        int var4_intLifetime1;
        var7 = client.field_A ? 1 : 0;
        try {
          super.a(-12253, param1);
          if (param2) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_A[var4_int];
              if (var5 != null) {
                var6 = param1.field_A[var4_int];
                stackIn_9_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new sn();
                  param1.field_A[var4_int] = dupTemp$0;
                  stackIn_10_1 = dupTemp$0;
                } else {
                  stackIn_10_1 = var6;
                }
                ((sn) (Object) stackIn_9_0).a(stackIn_10_1, 1);
              } else {
                param1.field_A[var4_int] = null;
              }
            }
          } else {
            an.a(this.field_A, 0, param1.field_A, 0, 6);
          }
          var4_intLifetime1 = -82 % ((-68 - param0) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("bc.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, ck[] param1, int param2) {
        int var4_int = 0;
        try {
          if (param0 <= 97) {
            ce var5 = (ce) null;
            this.a(true, -54, 87, (byte) -121, (ce) null);
          }
          var4_int = param2;
          if (this.field_A[var4_int] == null) {
            this.field_A[var4_int] = new sn();
          }
          this.field_A[param2].field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "bc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    bc(bc param0, boolean param1) {
        this();
        try {
          param0.a((byte) -117, this, param1);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public bc() {
        this.field_A = new sn[6];
        this.field_C = new sn();
        sn dupTemp$0 = new sn();
        this.field_A[0] = dupTemp$0;
        sn var1 = dupTemp$0;
        var1.b((byte) 68);
    }

    final sn a(int param0, int param1) {
        if (param1 <= 0) {
          field_E = (mf) null;
        }
        sn dupTemp$0 = new sn();
        this.field_A[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final static String a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          if (param1 != 65) {
            field_K = (String) null;
          }
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param0.charAt(var4);
            if (65 <= var5 &&
              var5 <= 90) {
              var3[var4] = (char)(-65 + (var5 + 97));
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("bc.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        ce stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        sn var7 = null;
        sn var9 = null;
        ce var10 = null;
        ek var11 = null;
        sn var12 = null;
        sn var13 = null;
        sn var14 = null;
        sn var15 = null;
        try {
          if (param4 instanceof ek) {
            stackIn_3_0 = (ce) (param4);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (ek) (stackIn_3_0);
          gg.a(param4.field_D + param2, 20763, param4.field_t + param4.field_u + param1, param1 + param4.field_u, param4.field_D + param2 + param4.field_y);
          if (var11 != null) {
            param0 = param0 & var11.field_I;
          }
          var7 = this.field_A[0];
          this.field_C.b((byte) 80);
          var7.a(this.field_C, this, 122, param2, param1, param4);
          if (var11 != null) {
            if (var11.field_H) {
              var12 = this.field_A[1];
              if (var12 != null) {
                var12.a(this.field_C, this, 127, param2, param1, param4);
              }
            }
            if (var11.field_q) {
              var13 = this.field_A[3];
              if (var11.field_o != 0 &&
                var13 != null) {
                var13.a(this.field_C, this, 122, param2, param1, param4);
              } else {
                var9 = this.field_A[2];
                if (var9 != null) {
                  var9.a(this.field_C, this, 126, param2, param1, param4);
                }
              }
            }
          }
          if (param4.a(true)) {
            var14 = this.field_A[5];
            if (var14 != null) {
              var14.a(this.field_C, this, 126, param2, param1, param4);
            }
          }
          if (!param0) {
            var15 = this.field_A[4];
            if (var15 != null) {
              var15.a(this.field_C, this, 124, param2, param1, param4);
            }
          }
          this.field_C.a(-2, param4, param1, this, param2);
          mk.a((byte) -5);
          if (param3 > -60) {
            var10 = (ce) null;
            this.a(true, -61, 21, (byte) -12, (ce) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("bc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void a(ck param0, int param1) {
        int var4 = 0;
        sn[] var3 = null;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = client.field_A ? 1 : 0;
        try {
          var7 = this.field_A;
          var3 = var7;
          if (param1 != 2) {
            field_F = (String) null;
          }
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_b = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("bc.G(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ck[] param0, boolean param1) {
        sn[] var3 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = client.field_A ? 1 : 0;
        try {
          var7 = this.field_A;
          var3 = var7;
          var4 = 0;
          if (param1) {
            return;
          }
          while (var4 < var7.length) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_a = param0;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("bc.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_F = null;
        field_J = null;
        field_D = (int[][]) null;
        field_K = null;
        if (param0 >= -101) {
          field_K = (String) null;
        }
        field_I = null;
        field_G = null;
        field_E = null;
    }

    static {
        field_F = "No spectators";
        field_I = new int[8192];
        field_G = "Allow spectators?";
        field_K = "To play a multiplayer game, please log in or create a free account.";
    }
}
