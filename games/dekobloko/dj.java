/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends kf implements vn {
    private String field_Z;
    private gk field_W;
    static StringBuilder field_ab;
    private ek[] field_V;
    static int[][] field_T;
    private int field_U;
    private mm field_X;
    static nh field_cb;
    private int[] field_S;
    static ck field_eb;
    static int field_Y;
    static String field_db;
    static String field_bb;

    dj(gk param0, mm param1, String param2) {
        super(0, 0, 288, 0, (gl) null);
        int var4_int = 0;
        this.field_U = 0;
        try {
            this.field_X = param1;
            this.field_Z = param2;
            this.field_W = param0;
            var4_int = null == this.field_Z ? 0 : this.field_X.b(this.field_Z, 260, this.field_X.field_R);
            this.b(var4_int + 22, 288, 0, 0, -16555);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        if (param0 < 106) {
            dj.b(false);
        }
        return ig.field_dc;
    }

    public static void b(boolean param0) {
        field_ab = null;
        if (!param0) {
            return;
        }
        field_eb = null;
        field_T = (int[][]) null;
        field_bb = null;
        field_db = null;
        field_cb = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, -104, param2, param3);
        this.field_X.a(this.field_Z, param0 - (-this.field_u - 14), this.field_D + (param3 + 10), this.field_t - 28, this.field_y, 16777215, -1, 0, 0, this.field_X.field_R);
        if (param1 > -103) {
            this.a(67, 1, 70, -22);
        }
    }

    private final void b(int param0, int param1) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        if (!(this.field_U < param0)) {
            return;
        }
        ek[] var7 = new ek[param0];
        ek[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; var5 < this.field_U; var5++) {
            var7[var5] = this.field_V[var5];
            var4[var5] = this.field_S[var5];
        }
        this.field_U = param0;
        var5 = -117 % ((50 - param1) / 51);
        this.field_S = var4;
        this.field_V = var3;
    }

    final ek a(int param0, String param1, kg param2) {
        ek var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ek stackIn_2_0 = null;
        ek stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new ek(param1, param2);
            var4.field_p = (gl) ((Object) new fk());
            var5 = -2 + this.field_y;
            if (param0 > 95) {
              this.b(this.field_y + 34, this.field_t, 0, 0, -16555);
              var4.b(30, -14 + this.field_t, 7, var5, -16555);
              this.b(var4, (byte) -55);
              stackIn_4_0 = (ek) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ek) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("dj.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            if (param2 != 14) {
                this.field_Z = (String) null;
            }
            var4_int = this.field_U;
            this.b(1 + var4_int, -104);
            this.field_V[var4_int] = this.a(103, param0, (kg) (this));
            this.field_S[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(ud param0, int param1) {
        try {
            ai.a(98, 0, param0, 128, 128);
            if (param1 != 22) {
                ud var3 = (ud) null;
                dj.a((ud) null, 24);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
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
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 67) {
                break L1;
              } else {
                field_db = (String) null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (var6_int >= this.field_U) {
                  break L3;
                } else {
                  if (this.field_V[var6_int] == param2) {
                    var7 = this.field_S[var6_int];
                    if ((var7 ^ -1) != 0) {
                      hm.a(this.field_S[var6_int], (byte) -109);
                      break L3;
                    } else {
                      this.field_W.n(-123);
                      break L3;
                    }
                  } else {
                    var6_int++;
                    continue L2;
                  }
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

            stackIn_14_1 = new StringBuilder().append("dj.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_T = (int[][]) null;
        field_ab = new StringBuilder(80);
        field_bb = "Show lobby chat from my friends";
        field_db = "Show all game chat";
    }
}
