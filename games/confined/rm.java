/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    int[] field_N;
    int[] field_i;
    byte[] field_P;
    int field_L;
    short[] field_m;
    short[] field_o;
    short[] field_x;
    int[] field_d;
    int field_e;
    short[] field_y;
    short field_g;
    short[] field_a;
    int field_t;
    static eg field_f;
    int[] field_q;
    static String field_D;
    short[] field_v;
    short field_w;
    short[] field_k;
    int[] field_M;
    int field_O;
    short[] field_G;
    int[] field_H;
    short[] field_u;
    short[] field_j;
    short[] field_z;
    short[] field_J;
    short[] field_l;
    int field_I;
    static nf field_K;
    short[] field_r;
    int[] field_c;
    short[] field_h;
    int field_s;
    short[] field_F;
    int[] field_Q;
    short[] field_E;
    int[] field_n;
    short field_b;
    short[] field_C;
    private boolean field_p;
    byte field_A;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        for (var5 = 0; this.field_b > var5; var5++) {
            this.field_x[var5] = (short)(this.field_x[var5] + param3);
            this.field_v[var5] = (short)(this.field_v[var5] + param0);
            this.field_F[var5] = (short)(this.field_F[var5] + param1);
        }
        var5 = 104 % ((67 - param2) / 37);
        this.a((byte) 67);
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = Confined.field_J ? 1 : 0;
        if (this.field_p) {
          return;
        } else {
          this.field_p = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= this.field_b) {
              L1: {
                this.field_t = var4;
                if (param0 == 27915) {
                  break L1;
                } else {
                  this.field_m = (short[]) null;
                  break L1;
                }
              }
              this.field_s = var7;
              this.field_I = var5;
              this.field_O = var2;
              this.field_e = var6;
              this.field_L = var3;
              return;
            } else {
              L2: {
                var9 = this.field_x[var8];
                var10 = this.field_v[var8];
                if (var9 >= var2) {
                  break L2;
                } else {
                  var2 = var9;
                  break L2;
                }
              }
              L3: {
                var11 = this.field_F[var8];
                if (var10 > var6) {
                  var6 = var10;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var5 < var9) {
                  var5 = var9;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var3 <= var10) {
                  break L5;
                } else {
                  var3 = var10;
                  break L5;
                }
              }
              L6: {
                if (var11 < var4) {
                  var4 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var7 < var11) {
                var7 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(String param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              bj.a(false, param2, 14451, param0);
              if (param1 == 38) {
                break L1;
              } else {
                field_f = (eg) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("rm.F(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_f = null;
        field_K = null;
        field_D = null;
    }

    private final void a(byte param0) {
        if (param0 != 67) {
            this.a(-14, 92, -74, (byte) 120, -21);
        }
        this.field_p = false;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = Confined.field_J ? 1 : 0;
        for (var6 = 0; this.field_b > var6; var6++) {
            this.field_x[var6] = (short)(param4 * this.field_x[var6] / param1);
            this.field_v[var6] = (short)(this.field_v[var6] * param2 / param1);
            this.field_F[var6] = (short)(param0 * this.field_F[var6] / param1);
        }
        if (param3 != 56) {
            String var8 = (String) null;
            rm.a((String) null, (byte) -76, (String) null);
        }
        this.a((byte) 67);
    }

    rm() {
        this.field_A = (byte) 0;
        this.field_p = false;
    }

    static {
        field_D = "Type your age in years";
    }
}
