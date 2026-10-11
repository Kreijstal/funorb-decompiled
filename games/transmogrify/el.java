/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    private int field_u;
    int[] field_s;
    static ce field_n;
    int field_b;
    static int[] field_m;
    static boolean field_g;
    private int[][] field_o;
    private int[] field_k;
    int[] field_i;
    int[] field_c;
    private byte[] field_e;
    int field_l;
    db[] field_t;
    int field_r;
    db field_h;
    int[] field_q;
    int[] field_j;
    byte[][] field_p;
    int[][] field_f;
    static String field_a;
    static int field_d;

    private final void a(byte[] param0, byte param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        oa var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = Transmogrify.field_A ? 1 : 0;
        try {
          var17 = new oa(lk.a(-110, param0));
          var4 = var17.d((byte) 85);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (6 <= var4) {
              this.field_b = var17.c((byte) -108);
            } else {
              this.field_b = 0;
            }
            var5 = var17.d((byte) 52);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 >= 7) {
              this.field_u = var17.h(-16777216);
            } else {
              this.field_u = var17.a((byte) -102);
            }
            stackIn_17_0 = (0 == (var5 & 2)) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            this.field_c = new int[this.field_u];
            var9 = -1;
            if (var4 < 7) {
              for (var10 = 0; this.field_u > var10; var10++) {
                dupTemp$0 = var8 + var17.a((byte) -95);
                var8 = dupTemp$0;
                this.field_c[var10] = dupTemp$0;
                if (this.field_c[var10] > var9) {
                  var9 = this.field_c[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_u > var10; var10++) {
                dupTemp$1 = var8 + var17.h(-16777216);
                var8 = dupTemp$1;
                this.field_c[var10] = dupTemp$1;
                if (var9 < this.field_c[var10]) {
                  var9 = this.field_c[var10];
                }
              }
            }
            this.field_l = var9 + 1;
            this.field_q = new int[this.field_l];
            this.field_j = new int[this.field_l];
            this.field_i = new int[this.field_l];
            this.field_f = new int[this.field_l][];
            this.field_s = new int[this.field_l];
            if (var7 != 0) {
              this.field_p = new byte[this.field_l][];
            }
            if (var6 != 0) {
              this.field_k = new int[this.field_l];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_l; var10Lifetime1++) {
                this.field_k[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_u; var10Lifetime1Lifetime1++) {
                this.field_k[this.field_c[var10Lifetime1Lifetime1]] = var17.c((byte) -128);
              }
              this.field_h = new db(this.field_k);
            }
            if (param1 > -111) {
              el.a(-92);
            }
            for (var10Lifetime2 = 0; this.field_u > var10Lifetime2; var10Lifetime2++) {
              this.field_j[this.field_c[var10Lifetime2]] = var17.c((byte) -127);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_u > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(64, 2, var21, 0);
                this.field_p[this.field_c[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; this.field_u > var10Lifetime4; var10Lifetime4++) {
              this.field_q[this.field_c[var10Lifetime4]] = var17.c((byte) -123);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_u; var10Lifetime5++) {
                this.field_s[this.field_c[var10Lifetime5]] = var17.h(-16777216);
              }
              for (var10Lifetime5 = 0; this.field_u > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_c[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_s[var11];
                array$2 = new int[var12];
                this.field_f[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.h(-16777216);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_f[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_i[var11] = 1 + var13;
                if (var12 == var13 + 1) {
                  this.field_f[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; this.field_u > var10Lifetime5; var10Lifetime5++) {
                this.field_s[this.field_c[var10Lifetime5]] = var17.a((byte) -121);
              }
              for (var10Lifetime5 = 0; this.field_u > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_c[var10Lifetime5];
                var12 = this.field_s[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_f[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.a((byte) -96);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_f[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_i[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_f[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_t = new db[var9 + 1];
              this.field_o = new int[var9 + 1][];
              for (var10Lifetime6 = 0; this.field_u > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_c[var10Lifetime6];
                var12Lifetime1 = this.field_s[var11Lifetime1];
                array$8 = new int[this.field_i[var11Lifetime1]];
                this.field_o[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_i[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_o[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_f[var11Lifetime1] != null) {
                    var14Lifetime1 = this.field_f[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_o[var11Lifetime1][var14Lifetime1] = var17.c((byte) -126);
                }
                this.field_t[var11Lifetime1] = new db(this.field_o[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_103_0 = var3;
          stackIn_103_1 = new StringBuilder().append("el.F(");
          if (param0 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          if (0 < param1 &&
            param1 < 128) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (param1 != 0) {
            var6 = af.field_a;
            var2 = var6;
            for (var3 = 0; var6.length > var3; var3++) {
              var4 = var6[var3];
              if (param1 == var4) {
                return true;
              }
            }
          }
          if (param0 != -9904) {
            field_n = (ce) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "el.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = Transmogrify.field_A ? 1 : 0;
        int var1_intLifetime1;
        try {
          th.field_c.a(0);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            kd.field_b[var1_int] = 0L;
          }
          if (param0 != -6491) {
            el.a(5);
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            ik.field_ib[var1_intLifetime1] = 0L;
          }
          ca.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "el.E(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1, String param2, String[] param3) {
        int var5 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 != 33) {
            el.a((byte) -81);
          }
          rh.field_v = gd.field_l;
          if (param0 != 255) {
            if (param0 >= 100 &&
              param0 <= 105) {
              q.field_h = ve.a(param3, (byte) -113);
              return;
            }
            q.field_h = mk.a(242763393, param2, param0);
          } else {
            stackIn_7_0 = !(ab.field_j >= 13);
            q.field_h = de.a(stackIn_7_0, (byte) -116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("el.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 116) {
          return true;
        }
        return c.field_d;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 75) {
          field_a = (String) null;
        }
        field_m = null;
        field_n = null;
    }

    el(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_r = v.a(param0, param0.length, (byte) 40);
          if (this.field_r != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_e = n.a(param0, param0.length, -5705, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_e[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, (byte) -114);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = new int[8192];
        field_a = "Go Back";
        field_n = new ce();
        field_d = -1;
    }
}
