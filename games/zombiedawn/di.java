/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends hp implements hh {
    private an field_N;
    private an field_F;
    static rh field_L;
    private an field_H;
    static int field_O;
    static int field_M;
    static boolean field_K;
    static boolean field_J;
    static String field_I;

    public static void b(boolean param0) {
        field_I = null;
        field_L = null;
        if (!param0) {
          di.a(45, -46, -29, (byte) 68, 34);
        }
    }

    final static void a(de param0, int param1, int param2, ec param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_38_0 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          n var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = ZombieDawn.field_J;
          try {
            var18 = new n();
            var18.field_l = param0.d((byte) -118);
            var18.field_o = param0.c(102);
            var18.field_i = new byte[var18.field_l][][];
            var18.field_q = new int[var18.field_l];
            var18.field_m = new op[var18.field_l];
            var18.field_n = new op[var18.field_l];
            if (param1 != 30) {
              return;
            }
            var18.field_j = new int[var18.field_l];
            var18.field_h = new int[var18.field_l];
            for (var5 = 0; var18.field_l > var5; var5++) {
              try {
                var6_int = param0.d((byte) -124);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param0.a(true);
                    var21 = param0.a(true);
                    var9 = param0.d((byte) -122);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param0.a(true);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (3 == var6_int) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param0.c(100);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param0.a(var13, 0, var22[var12_int], 11240);
                      }
                    }
                    var18.field_h[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = tm.b((byte) 72, var10[var17]);
                      var17++;
                    }
                    var18.field_m[var5] = param3.a(var12, tm.b((byte) 89, var20), rd.b(param1, 225), var21);
                    var18.field_i[var5] = var22;
                  }
                } else {
                  var16 = param0.a(true);
                  var15 = param0.a(true);
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param0.c(101);
                  }
                  var18.field_h[var5] = var6_int;
                  var18.field_j[var5] = var9;
                  var18.field_n[var5] = param3.a((byte) -113, var15, tm.b((byte) 70, var16));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_q[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_q[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_q[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_q[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_q[var5] = -5;
              }
            }
            dj.field_l.a(0, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("di.G(");
            if (param0 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        fa.field_p = param0;
        ma.field_k = param4;
        pf.field_g = param1;
        if (param3 != -116) {
          return;
        }
        mh.field_G = param2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_k + param2;
        int var6 = this.field_j + param0;
        ia.field_e.a(tg.field_b, 20 + var5, 20 + var6, this.field_i - 40, this.field_n - 50, 16777215, -1, 1, 0, ia.field_e.field_I);
        super.a(param0, param1, param2, param3 + param3);
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ZombieDawn.field_J;
        try {
          if (param1 != -6) {
            return;
          }
          if (this.field_H == param2) {
            dj.a(109);
          } else {
            if (this.field_F == param2) {
              vj.d(69);
            } else {
              if (this.field_N == param2) {
                jp.b((byte) -50);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("di.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(127, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.b((byte) 123, param2);
            return stackIn_6_0;
          }
          var5_int = -79 % ((-83 - param0) / 32);
          if (99 != param1) {
            return false;
          }
          stackIn_10_0 = this.a(1, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("di.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public di() {
        super(0, 0, 476, 225, (io) null);
        this.field_F = new an(hk.field_P, (sk) null);
        this.field_H = new an(vl.field_f, (sk) null);
        this.field_N = new an(hl.field_h, (sk) null);
        vm var1 = new vm();
        this.field_F.field_h = (io) ((Object) var1);
        this.field_H.field_h = (io) ((Object) var1);
        this.field_N.field_h = (io) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_H.a(-90, -var2 + this.field_n - 48, -var3 + this.field_i >> 1, var4, 30);
        this.field_N.a(33, this.field_n - 48 - var2, var2 + (var4 + (this.field_i - var3 >> 1)), var4, 30);
        this.field_F.a(-85, -78 + this.field_n - var2 * 2, -var3 + this.field_i >> 1, var3, 30);
        this.field_H.field_v = (sk) (this);
        this.field_F.field_v = (sk) (this);
        this.field_F.field_s = nk.field_f;
        this.field_N.field_v = (sk) (this);
        this.field_N.field_s = fo.field_c;
        this.a(this.field_H, 10);
        this.a(this.field_F, 10);
        this.a(this.field_N, 10);
    }

    final static v[] a(int param0) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        v[] var1 = new v[t.field_h];
        int var2 = 104 / ((4 - param0) / 61);
        for (var3 = 0; t.field_h > var3; var3++) {
          var1[var3] = new v(gl.field_F, kd.field_pb, sl.field_d[var3], bo.field_o[var3], bn.field_c[var3], uf.field_n[var3], vj.field_m[var3], j.field_a);
        }
        no.f((byte) -79);
        return var1;
    }

    static {
        field_L = new rh();
        field_M = 20;
        field_I = "To Customer Support";
    }
}
