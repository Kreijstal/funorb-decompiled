/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends ee implements pl {
    private String field_K;
    private f field_J;
    private hk[] field_F;
    private int[] field_H;
    private m field_G;
    private int field_D;
    static String field_C;
    static int field_I;

    private final void c(int param0, int param1) {
        int var5 = 0;
        int var6 = Geoblox.field_C;
        if (this.field_D >= param1) {
            return;
        }
        hk[] var7 = new hk[param1];
        hk[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < this.field_D; var5++) {
            var7[var5] = this.field_F[var5];
            var4[var5] = this.field_H[var5];
        }
        this.field_F = var3;
        this.field_H = var4;
        this.field_D = param1;
        if (param0 != -11272) {
            this.field_G = (m) null;
        }
    }

    final static void a(rh param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        nf var5 = null;
        int[] var6 = null;
        int var7 = 0;
        pk var8 = null;
        int var9 = 0;
        pk var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            var8 = new pk(param0.a(param1 + param1, "", "logo.fo3d"));
            var10 = var8;
            var3 = var10.c((byte) 34);
            var10.k(param1 + 8);
            l.field_i = jc.a(var10, true);
            bm.field_l = new nf[var3];
            pi.field_R = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var10.i(-16989);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = bm.field_l[var9];
                    var5.a(6, 1, (byte) 89, 6, 6);
                    var5.a((byte) -99);
                    var6 = new int[]{var5.field_Q - -var5.field_I >> -2078108927, var5.field_H + var5.field_s >> -144591135, var5.field_N + var5.field_F >> 484842465};
                    pi.field_R[var9] = var6;
                    var5.a(-var6[0], -var6[1], -9121, -var6[2]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                bm.field_l[var4] = uh.a(var8, (byte) 113);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("ni.KA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final hk a(int param0, String param1, bb param2) {
        hk var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new hk(param1, param2);
            var4.field_q = (dh) ((Object) new ml());
            var5 = param0 + this.field_h;
            this.a(34 + this.field_h, this.field_r, (byte) -53, 0, 0);
            var4.a(30, this.field_r - 14, (byte) -33, var5, 7);
            this.b((byte) -73, var4);
            stackIn_1_0 = (hk) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("ni.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    ni(f param0, m param1, String param2) {
        super(0, 0, 288, 0, (dh) null);
        int var4_int = 0;
        this.field_D = 0;
        try {
            this.field_G = param1;
            this.field_J = param0;
            this.field_K = param2;
            var4_int = null == this.field_K ? 0 : this.field_G.b(this.field_K, 260, this.field_G.field_o);
            this.a(var4_int + 22, 288, (byte) -119, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void f(int param0) {
        int var2 = 0;
        ja var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param0 == 484842465) {
                break L1;
              } else {
                ni.f(15);
                break L1;
              }
            }
            var3 = (ja) ((Object) bh.field_c.g(0));
            L2: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.l(1915952803);
                var3 = (ja) ((Object) bh.field_c.d(1));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ni.JA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 54, param3);
        this.field_G.a(this.field_K, this.field_v + (param0 - -14), 10 + param1 - -this.field_m, this.field_r - 28, this.field_h, 16777215, -1, 0, 0, this.field_G.field_o);
        int var5 = 35 / ((param2 - 1) / 43);
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (var6_int >= this.field_D) {
                  break L2;
                } else {
                  if (param4 == this.field_F[var6_int]) {
                    var7 = this.field_H[var6_int];
                    if ((var7 ^ -1) != 0) {
                      pc.a(this.field_H[var6_int], false);
                      break L2;
                    } else {
                      this.field_J.h((byte) -104);
                      break L2;
                    }
                  } else {
                    var6_int++;
                    continue L1;
                  }
                }
              }
              L3: {
                if (param1 == -20) {
                  break L3;
                } else {
                  ni.a((byte) 87);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("ni.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_D;
            this.c(-11272, var4_int + param1);
            this.field_F[var4_int] = this.a(-2, param0, (bb) (this));
            this.field_H[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ni.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_C = null;
        if (param0 >= -19) {
            field_C = (String) null;
        }
    }

    final static nc a(byte[] param0, int param1) {
        nc var2 = null;
        RuntimeException var2_ref = null;
        nc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var2 = new nc(param0, gh.field_m, md.field_e, rc.field_j, hl.field_K, cm.field_j, mj.field_a);
                kj.c(true);
                if (param1 < -107) {
                  break L1;
                } else {
                  field_C = (String) null;
                  break L1;
                }
              }
              stackIn_6_0 = (nc) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("ni.MA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    static {
        field_C = "Create a free account to start using this feature";
    }
}
