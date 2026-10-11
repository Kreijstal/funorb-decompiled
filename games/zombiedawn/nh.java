/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends hp implements hh {
    static vn[] field_R;
    qi field_F;
    private an field_N;
    private an field_Q;
    static int field_G;
    boolean field_H;
    pk field_T;
    String field_U;
    static int field_I;
    rb field_L;
    static int field_P;
    private boolean field_S;
    private int field_M;
    private int field_V;
    static ke field_J;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            this.c((byte) -2);
          }
          stackIn_3_0 = super.a(param0, 1, param2, param3, param4, param5, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("nh.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_R = null;
        int var1 = -87 / ((64 - param0) / 49);
    }

    final boolean e(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -17741) {
          field_J = (ke) null;
        }
        stackIn_7_0 = (this.field_S) || (super.e(-17741));
        return stackIn_7_0;
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        int discarded$0 = 0;
        super.a(119, param1, param0, param2, param3);
        this.field_N.a(44, 0, 0, -20 + param2, this.field_M);
        this.field_Q.a(-79, 0, param2 - 20, 20, this.field_M);
        if (this.field_H) {
          this.field_F.a(-107, this.field_M, 0, param2, -this.field_M + param3);
        }
        if (param4 < 11) {
          String var7 = (String) null;
          discarded$0 = this.a(28, (String) null);
        }
    }

    private final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawn.field_J;
        try {
          param1 = param1.toLowerCase();
          var3_int = 0;
          if (param0 != -129) {
            this.field_T = (pk) null;
          }
          while (true) {
            if (var3_int >= this.field_T.field_L.length) {
              stackIn_9_0 = -1;
              return stackIn_9_0;
            }
            var4 = this.field_T.field_L[var3_int].toString().toLowerCase();
            if (!var4.startsWith(param1)) {
              var3_int++;
              continue;
            }
            break;
          }
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("nh.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, ec param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 77) {
            field_G = 1;
          }
          stackIn_3_0 = param1.c(10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("nh.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_M = param4;
        int var6 = -42 % ((-23 - param0) / 48);
        this.c(param2, param1, param3, param4, 81);
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        boolean stackIn_56_0 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var7_intLifetime1;
        var8 = ZombieDawn.field_J;
        try {
          var5_int = 44 % ((-83 - param0) / 32);
          if (!this.e(-17741)) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_T.field_L) {
            var6 = this.field_T.field_L.length;
            if (99 != param1 &&
              param1 != 98) {
              if (param1 != 105 &&
                param1 != 104) {
                if (param1 == 84) {
                  if (this.field_H) {
                    this.g((byte) -44);
                  } else {
                    this.h((byte) -117);
                  }
                  return true;
                }
                if (85 == param1) {
                  var7_int = this.field_U.length();
                  if (0 >= var7_int) {
                    return true;
                  }
                  this.field_U = this.field_U.substring(0, var7_int - 1);
                  return true;
                }
                decompiledFrameRemainder0 = !(param3 < 32);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(param3 >= 128))) {
                  var7 = this.field_U + param3;
                  this.a(var7, (byte) -89);
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.e((byte) -109)) {
                  this.h((byte) -115);
                }
                var7_intLifetime1 = this.field_F.field_D.field_n / this.field_T.field_I;
                if (param1 == 105) {
                  this.field_T.field_K = this.field_T.field_K + var7_intLifetime1;
                } else {
                  this.field_T.field_K = this.field_T.field_K - var7_intLifetime1;
                }
                if (0 > this.field_T.field_K) {
                  this.field_T.field_K = 0;
                }
                if (this.field_T.field_K >= var6) {
                  this.field_T.field_K = var6 - 1;
                }
                this.a(24);
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              if (!this.e((byte) -43)) {
                this.h((byte) -123);
              }
              if (param1 != 99) {
                this.field_T.field_K = this.field_T.field_K - 1;
              } else {
                this.field_T.field_K = this.field_T.field_K + 1;
              }
              if (this.field_T.field_K < 0) {
                this.field_T.field_K = 0;
              }
              if (var6 <= this.field_T.field_K) {
                this.field_T.field_K = var6 - 1;
              }
              this.a(24);
              return true;
            }
          }
          if (param1 != 80) {
            stackIn_56_0 = super.a(-119, param1, param2, param3);
            return stackIn_56_0;
          }
          this.g((byte) -44);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_59_0 = var5;
          stackIn_59_1 = new StringBuilder().append("nh.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(byte param0) {
        this.field_S = false;
        super.c(param0);
    }

    final boolean e(byte param0) {
        if (param0 >= -10) {
          return true;
        }
        return this.field_H;
    }

    final int h(int param0) {
        if (param0 != 0) {
          this.e(-95);
        }
        return this.field_T.field_K;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
          super.a(param0, (byte) -7, param2, param3);
          int var5_int = 60 / ((param1 - 46) / 42);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "nh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void g(byte param0) {
        if (param0 != -44) {
          return;
        }
        if (!this.e((byte) -84)) {
          return;
        }
        this.c(this.field_k, this.field_j, this.field_i, this.field_M, 27);
        this.field_H = false;
        this.field_F.b(-27598);
    }

    nh(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (io) null);
        this.field_U = "";
        this.field_L = ia.field_e;
        try {
          this.field_T = new pk(this, this.field_L, param0, param1);
          this.field_V = param2;
          this.field_T.field_v = (sk) (this);
          this.field_H = false;
          this.field_N = new an("", new ud(this), (sk) (this));
          this.field_Q = new an();
          this.field_Q.field_h = (io) ((Object) new eb());
          this.field_Q.field_v = (sk) (this);
          this.a(this.field_N, 10);
          this.a(this.field_Q, 10);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void h(byte param0) {
        int var2 = this.field_T.h(1227847265);
        int var3 = var2;
        int var4 = 0;
        if (this.field_V < var3) {
          var3 = this.field_V;
          var4 = 1;
        }
        this.c(this.field_k, this.field_j, this.field_i, var3 + this.field_M, 82);
        this.field_T.a(-117, 0, 0, this.field_i, var2);
        this.field_F = new qi(0, 0, 0, 0, new kh(), this.field_T, (io) null);
        if (var4 != 0) {
          this.field_F.a(true, (byte) 100, wo.v(6130));
        }
        this.field_F.a(-78, this.field_M, 0, this.field_i, this.field_n - this.field_M);
        this.field_H = true;
        if (param0 > -114) {
          return;
        }
        this.a(this.field_F, 10);
        this.a(24);
    }

    final void b(boolean param0) {
        if (!param0) {
          this.e((byte) 82);
        }
        if (this.field_v instanceof qa) {
          ((qa) ((Object) this.field_v)).a(-16510, this);
        }
    }

    final boolean a(byte param0, ga param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 67) {
            this.field_L = (rb) null;
          }
          param1.c((byte) 57);
          this.field_S = true;
          this.field_U = "";
          if (null != this.field_v &&
            this.field_v instanceof ef) {
            ((ef) (this.field_v)).a(this.field_S, (ga) (this), (byte) 15);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = aa.a(sd.a(-66, param0), -27513);
          var3 = 55 / ((-49 - param1) / 61);
          if (var2 == null) {
            var2 = "";
          }
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("nh.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        int var7Lifetime1;
        int var8Lifetime1;
        if (!this.e((byte) -127)) {
          return;
        }
        if (this.field_T.field_K != -1 &&
          null != this.field_T.field_L &&
          this.field_F.field_L != null) {
          var2 = this.field_F.field_D.field_n;
          var3 = this.field_T.field_I;
          var4 = -var2 + this.field_T.field_n;
          if (var4 <= 0) {
            return;
          }
          var5 = var3 * this.field_T.field_K;
          var6 = var5 + this.field_F.field_D.field_z.field_j;
          var7 = var2 >> 2;
          if (var6 < var7) {
            var8 = -(-var5 + var7 << 16) / var4;
            if (var8 < 0) {
              var8 = 0;
            }
            this.field_F.field_L.field_E = var8;
          }
          if (param0 != 24) {
            var9 = (String) null;
            this.a((String) null, (byte) 100);
          }
          var7Lifetime1 = (3 * var2 >> 2) - var3;
          if (var6 > var7Lifetime1) {
            var8Lifetime1 = -(var7Lifetime1 - var5 << 16) / var4;
            if (var8Lifetime1 > 65536) {
              var8Lifetime1 = 65536;
            }
            this.field_F.field_L.field_E = var8Lifetime1;
          }
          return;
        }
    }

    private final void a(String param0, byte param1) {
        if (this.field_T.field_L == null) {
          return;
        }
        int var4 = 31 / ((param1 - 47) / 48);
        int var3_int = this.a(-129, param0.toLowerCase());
        if (var3_int == -1) {
          return;
        }
        try {
          this.field_T.field_K = var3_int;
          this.a(24);
          this.field_U = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "nh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(int param0) {
        int var2;
        if (!this.field_l) {
          return null;
        }
        if (this.e((byte) -57) &&
          this.field_F.field_l &&
          this.field_T.field_O != -1) {
          return this.field_T.field_L[this.field_T.field_O].toString();
        }
        if (null != this.field_T.g(0)) {
          return this.field_T.g(0).toString();
        }
        var2 = 49 % ((10 - param0) / 58);
        return super.d(-89);
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!this.e((byte) -48)) {
            this.h((byte) -122);
          } else {
            this.g((byte) -44);
          }
          if (param1 != -6) {
            this.field_U = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("nh.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_J = null;
        field_P = 480;
        field_I = 2 + field_P / 24;
        field_G = field_P / 2;
    }
}
