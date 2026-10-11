/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oe extends ch {
    private int field_P;
    static String field_S;
    boolean field_R;
    static int field_V;
    static int field_Q;
    static so field_U;
    private lq field_T;
    static String field_O;
    static String field_N;

    public static void h(int param0) {
        field_N = null;
        if (param0 != -1) {
          int[] var2 = (int[]) null;
          oe.a(false, (int[]) null);
        }
        field_O = null;
        field_U = null;
        field_S = null;
    }

    private final int a(int param0) {
        if (param0 >= -65) {
          return -39;
        }
        return !this.field_R ? 0 : this == this.field_T.j(117) ? 256 : 0;
    }

    abstract void a(int param0, int param1, int param2);

    final static void a(boolean param0, int param1) {
        ff.a(0, param0);
        if (null != kk.field_B) {
          pp.a(kk.field_B, 1259627265);
        }
        if (param1 != 1) {
          int[] var3 = (int[]) null;
          oe.a(true, (int[]) null);
        }
    }

    boolean g(byte param0) {
        int var2;
        int var3;
        boolean stackIn_11_0 = false;
        if (param0 != -20) {
          field_N = (String) null;
        }
        var2 = this.a(-69);
        var3 = -this.field_P + var2;
        if (var3 > 0) {
          this.field_P = this.field_P + (8 + var3 - 1) / 8;
        }
        if (0 > var3) {
          this.field_P = this.field_P + (1 + (var3 - 16)) / 16;
        }
        stackIn_11_0 = (this.field_P == 0) && (0 == var2) && (!this.field_R);
        return stackIn_11_0;
    }

    boolean a(boolean param0) {
        boolean stackIn_6_0 = false;
        if (param0) {
          return true;
        }
        this.field_P = this.a(-82);
        stackIn_6_0 = (0 == this.field_P) && (!this.field_R);
        return stackIn_6_0;
    }

    final static int a(bf[] param0, int param1, pq[] param2, int[][] param3, int param4) {
        int stackIn_18_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sa var7 = null;
        int var7_int = 0;
        pq var8 = null;
        int var8_int = 0;
        pq var9 = null;
        int var10 = 0;
        int var6Lifetime1;
        int var7_intLifetime1;
        int var8_intLifetime1;
        int var7_intLifetime1Lifetime1;
        int var8_intLifetime1Lifetime1;
        try {
          var5_int = 0;
          for (var6 = param4; var6 < param2.length; var6++) {
            if (param2[var6].field_s) {
              for (var7_int = var6 + 1; var7_int < param2.length; var7_int++) {
                if (param2[var7_int].field_s && (param2[var6].field_v != 0 ||
                  0 != param2[var7_int].field_v)) {
                  var8_int = no.a(param2[var7_int].field_t, param2[var6].field_w, param2[var7_int].field_I, param2[var7_int].field_w, param2[var6].field_I, param2[var7_int].field_k, param2[var6].field_t, param2[var7_int].field_g, 8, param2[var6].field_g, param2[var6].field_k, -1);
                  if (param1 < var8_int) {
                    if (param2[var6].field_w < param2[var7_int].field_w) {
                      stackIn_18_0 = param2[var7_int].field_w;
                    } else {
                      stackIn_18_0 = param2[var6].field_w;
                    }
                    if (stackIn_18_0 <= var8_int) {
                      var5_int = bq.a((byte) -124, var5_int, -1, var7_int, -1, var6, var8_int);
                    }
                  }
                }
              }
              if (0 != param2[var6].field_v) {
                for (var7_intLifetime1 = 0; var7_intLifetime1 < param0.length; var7_intLifetime1++) {
                  var8_intLifetime1 = c.a(param2[var6].field_w, param0[var7_intLifetime1].field_f, param2[var6].field_k, param0[var7_intLifetime1].field_j, param2[var6].field_t, param2[var6].field_g, 8, param0[var7_intLifetime1].field_l, (byte) 98, param0[var7_intLifetime1].field_a, param2[var6].field_I);
                  if (param1 < var8_intLifetime1) {
                    var5_int = bq.a((byte) -128, var5_int, -1, -1, var7_intLifetime1, var6, var8_intLifetime1);
                  }
                }
                for (var7_intLifetime1Lifetime1 = 0; var7_intLifetime1Lifetime1 < param3.length; var7_intLifetime1Lifetime1++) {
                  var8_intLifetime1Lifetime1 = j.a(param2[var6].field_k, param3[var7_intLifetime1Lifetime1][0], param2[var6].field_I, param2[var6].field_t, param2[var6].field_w, 8, param2[var6].field_g, (byte) -121, param3[var7_intLifetime1Lifetime1][1]);
                  if (var8_intLifetime1Lifetime1 > param1) {
                    var5_int = bq.a((byte) -123, var5_int, var7_intLifetime1Lifetime1, -1, -1, var6, var8_intLifetime1Lifetime1);
                  }
                }
              }
            }
          }
          if (var5_int == 0) {
            stackIn_41_0 = -1;
            return stackIn_41_0;
          }
          var10 = 0;
          var6Lifetime1 = var10;
          while (var5_int > var10) {
            var7 = kj.field_g[var10];
            param1 = var7.field_u;
            var8 = param2[var7.field_n];
            if (-1 != var7.field_i) {
              if (var7.field_n == 0 &&
                -1 == hb.field_s) {
                hb.field_s = var7.field_i;
              }
              if ((33554432L & pd.field_i) != 0L) {
                System.out.println("Bounce ball " + var7.field_n + " and ball " + var7.field_i + " at time " + Integer.toString(var7.field_u, 16));
              }
              var9 = param2[var7.field_i];
              ok.a(var7.field_u, var8, var9, (byte) 105);
              if (var8.field_q != null) {
                var8.field_q.a(param2, (int) var7.field_i, param4 - 5);
              } else {
                if (var9.field_q != null) {
                  var9.field_q.a(param2, (int) var7.field_n, -5);
                }
              }
            }
            if (-1 != var7.field_x) {
              var8.field_c = var8.field_c + 1;
              sm.a(var7.field_u, param0[var7.field_x], 117, var8);
              if (null != var8.field_q) {
                var8.field_q.a((int) var7.field_x, -26401, var8);
              }
            }
            if (var7.field_a != -1) {
              var8.field_c = var8.field_c + 1;
              dk.a(param3[var7.field_a][0], (byte) -20, var7.field_u, var8, param3[var7.field_a][1]);
              if (var8.field_q != null) {
                var8.field_q.a(var8, (int) var7.field_a, (byte) 5);
              }
            }
            var10++;
          }
          stackIn_65_0 = param1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_68_0 = var5;
          stackIn_68_1 = new StringBuilder().append("oe.BC(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param3 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param4).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        int discarded$0 = 0;
        if (param1 != 31936) {
          discarded$0 = this.a(87);
        }
        this.a(param2, -param2 + nk.field_j >> 1, param0, false, md.field_b - param0 >> 1);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        if (this.field_P == 0) {
          return;
        }
        if (256 <= this.field_P) {
          if (param0 != 0) {
            return;
          }
          this.a(param2 + this.field_C, param3 + this.field_D, 260);
          super.a(param0, (byte) 70, param2, param3);
          return;
        }
        if (ad.field_y == null ||
          !(ad.field_y.field_z >= this.field_l) ||
          !(this.field_y <= ad.field_y.field_A)) {
          ad.field_y = new dd(this.field_l, this.field_y);
        }
        kj.a(117, ad.field_y);
        qh.d();
        this.a(0, 0, 260);
        super.a(param0, (byte) 48, -this.field_C - param2, -this.field_D - param3);
        oc.a(117);
        ad.field_y.a(this.field_C + param2, param3 + this.field_D, this.field_P);
        var5 = 121 / ((param1 + 42) / 53);
    }

    oe(lq param0, int param1, int param2) {
        super(-param1 + nk.field_j >> 1, -param2 + md.field_b >> 1, param1, param2, (fp) null);
        try {
          this.field_T = param0;
          this.field_P = 0;
          this.field_R = false;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var3 = (int[]) null;
            oe.a(true, (int[]) null);
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= 8) {
              return false;
            }
            if (param1[var2_int] == 0) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("oe.CC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final ei f(byte param0) {
        int var2 = 69 / ((param0 - 51) / 61);
        ei var3 = super.f((byte) 123);
        if (var3 != null) {
          return var3;
        }
        return (ei) (this);
    }

    static {
        field_V = 0;
        field_O = "You are not currently logged in to the game.";
        field_N = "Unfortunately we are unable to create an account for you at this time.";
        field_S = "Blues";
        field_Q = 250;
    }
}
