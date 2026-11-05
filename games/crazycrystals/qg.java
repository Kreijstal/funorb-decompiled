/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    int field_b;
    int[] field_g;
    static ih field_s;
    private int[] field_k;
    v field_t;
    private int[][] field_d;
    int[][] field_h;
    int[] field_l;
    static int field_q;
    v[] field_i;
    int[] field_e;
    int[] field_n;
    private byte[] field_j;
    int[] field_f;
    int field_a;
    private int field_p;
    int field_r;
    byte[][] field_m;
    static String field_o;
    static String[] field_c;

    private final void a(int param0, byte[] param1) {
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
        int stackIn_14_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
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
        byte[] var17 = null;
        ng var18 = null;
        byte[] var22 = null;
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
        var16 = CrazyCrystals.field_B;
        try {
          var18 = new ng(b.a(param1, -1));
          var4 = var18.h(255);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_r = 0;
            } else {
              this.field_r = var18.b((byte) 127);
            }
            var5 = var18.h(255);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 >= 7) {
              this.field_p = var18.a((byte) -122);
            } else {
              this.field_p = var18.c((byte) -7);
            }
            var8 = 0;
            var9 = -1;
            this.field_e = new int[this.field_p];
            if (7 > var4) {
              for (var10 = 0; this.field_p > var10; var10++) {
                dupTemp$0 = var8 + var18.c((byte) -7);
                var8 = dupTemp$0;
                this.field_e[var10] = dupTemp$0;
                if (var9 < this.field_e[var10]) {
                  var9 = this.field_e[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_p; var10++) {
                dupTemp$1 = var8 + var18.a((byte) -124);
                var8 = dupTemp$1;
                this.field_e[var10] = dupTemp$1;
                if (this.field_e[var10] > var9) {
                  var9 = this.field_e[var10];
                }
              }
            }
            this.field_a = 1 + var9;
            if (var7 != 0) {
              this.field_m = new byte[this.field_a][];
            }
            this.field_l = new int[this.field_a];
            this.field_h = new int[this.field_a][];
            this.field_f = new int[this.field_a];
            this.field_g = new int[this.field_a];
            this.field_n = new int[this.field_a];
            if (var6 != 0) {
              this.field_k = new int[this.field_a];
              for (var10Lifetime1 = 0; this.field_a > var10Lifetime1; var10Lifetime1++) {
                this.field_k[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_p; var10Lifetime1Lifetime1++) {
                this.field_k[this.field_e[var10Lifetime1Lifetime1]] = var18.b((byte) -23);
              }
              this.field_t = new v(this.field_k);
            }
            for (var10Lifetime2 = 0; this.field_p > var10Lifetime2; var10Lifetime2++) {
              this.field_n[this.field_e[var10Lifetime2]] = var18.b((byte) 127);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_p > var10Lifetime3; var10Lifetime3++) {
                var22 = new byte[64];
                var18.a(64, var22, (byte) -110, 0);
                this.field_m[this.field_e[var10Lifetime3]] = var22;
              }
            }
            for (var10Lifetime4 = 0; this.field_p > var10Lifetime4; var10Lifetime4++) {
              this.field_g[this.field_e[var10Lifetime4]] = var18.b((byte) 127);
            }
            if (var4 < 7) {
              for (var10Lifetime5 = 0; this.field_p > var10Lifetime5; var10Lifetime5++) {
                this.field_f[this.field_e[var10Lifetime5]] = var18.c((byte) -7);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_p; var10Lifetime5++) {
                var11 = this.field_e[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_f[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_h[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var18.c((byte) -7);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_h[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_l[var11] = var13 + 1;
                if (1 + var13 == var12) {
                  this.field_h[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_p; var10Lifetime5++) {
                this.field_f[this.field_e[var10Lifetime5]] = var18.a((byte) -121);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_p; var10Lifetime5++) {
                var11 = this.field_e[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_f[var11];
                var13 = -1;
                array$5 = new int[var12];
                this.field_h[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var18.a((byte) -121);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_h[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_l[var11] = 1 + var13;
                if (var12 == var13 + 1) {
                  this.field_h[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_d = new int[var9 + 1][];
              this.field_i = new v[var9 + 1];
              for (var10Lifetime6 = 0; this.field_p > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_e[var10Lifetime6];
                var12Lifetime1 = this.field_f[var11Lifetime1];
                array$8 = new int[this.field_l[var11Lifetime1]];
                this.field_d[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_l[var11Lifetime1]; var13Lifetime1++) {
                  this.field_d[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null != this.field_h[var11Lifetime1]) {
                    var14Lifetime1 = this.field_h[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_d[var11Lifetime1][var14Lifetime1] = var18.b((byte) -59);
                }
                this.field_i[var11Lifetime1] = new v(this.field_d[var11Lifetime1]);
              }
            }
            if (param0 != 64) {
              var17 = (byte[]) null;
              this.a(-2, (byte[]) null);
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("qg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_o = null;
        if (param0 != 51) {
          field_o = (String) null;
        }
        field_s = null;
    }

    qg(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_b = gi.a(param0.length, param0, 26009);
          if (this.field_b != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_j = ac.a(param0, 0, param0.length, (byte) -127);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_j[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(64, param0);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "qg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = new ih();
        field_c = new String[]{"Three's a Crowd", "Infestation Team", "Chomp", "Crystal Race", "Armageddon!"};
        field_o = "You are not currently logged in to the<nbsp>game.";
    }
}
