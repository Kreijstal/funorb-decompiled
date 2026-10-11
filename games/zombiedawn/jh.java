/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    mo[] field_a;
    byte[][] field_f;
    int[] field_t;
    static String field_l;
    private byte[] field_r;
    int[][] field_p;
    int[] field_n;
    int field_m;
    private int[] field_o;
    int field_s;
    int[] field_d;
    static int field_h;
    private int[][] field_b;
    static boolean field_i;
    private int field_q;
    int field_e;
    mo field_g;
    int[] field_c;
    static int field_k;
    int[] field_j;

    final static boolean a(byte param0) {
        int var3 = 0;
        n var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var4 = 0;
        n var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          var5 = (n) (dj.field_l.b((byte) 26));
          var1 = var5;
          if (var1 == null) {
            return false;
          }
          var2 = 1 / ((-61 - param0) / 57);
          for (var3 = 0; var3 < var1.field_l; var3++) {
            if (null != var5.field_n[var3] &&
              var5.field_n[var3].field_f == 0) {
              return false;
            }
            if (var5.field_m[var3] != null &&
              var5.field_m[var3].field_f == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "jh.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 13192) {
          return;
        }
        field_l = null;
    }

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
        int stackIn_14_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
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
        de var17 = null;
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
        var16 = ZombieDawn.field_J;
        try {
          var17 = new de(va.a((byte) -122, param0));
          var4 = var17.d((byte) -127);
          if (var4 >= 5 &&
            7 >= var4) {
            if (6 <= var4) {
              this.field_e = var17.c(-51);
            } else {
              this.field_e = 0;
            }
            var5 = var17.d((byte) -125);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (7 > var4) {
              this.field_q = var17.f(2);
            } else {
              this.field_q = var17.a(-129);
            }
            var8 = 0;
            this.field_n = new int[this.field_q];
            var9 = -1;
            if (var4 < 7) {
              for (var10 = 0; var10 < this.field_q; var10++) {
                dupTemp$0 = var8 + var17.f(2);
                var8 = dupTemp$0;
                this.field_n[var10] = dupTemp$0;
                if (this.field_n[var10] > var9) {
                  var9 = this.field_n[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_q > var10; var10++) {
                dupTemp$1 = var8 + var17.a(-129);
                var8 = dupTemp$1;
                this.field_n[var10] = dupTemp$1;
                if (this.field_n[var10] > var9) {
                  var9 = this.field_n[var10];
                }
              }
            }
            this.field_s = var9 + 1;
            this.field_c = new int[this.field_s];
            this.field_d = new int[this.field_s];
            if (var7 != 0) {
              this.field_f = new byte[this.field_s][];
            }
            this.field_t = new int[this.field_s];
            this.field_p = new int[this.field_s][];
            this.field_j = new int[this.field_s];
            if (param1 != -80) {
              field_l = (String) null;
            }
            if (var6 != 0) {
              this.field_o = new int[this.field_s];
              for (var10Lifetime1 = 0; this.field_s > var10Lifetime1; var10Lifetime1++) {
                this.field_o[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_q; var10Lifetime1Lifetime1++) {
                this.field_o[this.field_n[var10Lifetime1Lifetime1]] = var17.c(rd.b((int) param1, 41));
              }
              this.field_g = new mo(this.field_o);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_q; var10Lifetime2++) {
              this.field_j[this.field_n[var10Lifetime2]] = var17.c(109);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_q; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(64, 0, var21, 11240);
                this.field_f[this.field_n[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_q; var10Lifetime4++) {
              this.field_c[this.field_n[var10Lifetime4]] = var17.c(117);
            }
            if (var4 < 7) {
              for (var10Lifetime5 = 0; this.field_q > var10Lifetime5; var10Lifetime5++) {
                this.field_t[this.field_n[var10Lifetime5]] = var17.f(2);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_q; var10Lifetime5++) {
                var11 = this.field_n[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_t[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_p[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.f(rd.b((int) param1, -78));
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_p[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_d[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_p[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; this.field_q > var10Lifetime5; var10Lifetime5++) {
                this.field_t[this.field_n[var10Lifetime5]] = var17.a(-129);
              }
              for (var10Lifetime5 = 0; this.field_q > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_n[var10Lifetime5];
                var12 = this.field_t[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$5 = new int[var12];
                this.field_p[var11] = array$5;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.a(-129);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_p[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_d[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_p[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_b = new int[1 + var9][];
              this.field_a = new mo[var9 + 1];
              for (var10Lifetime6 = 0; var10Lifetime6 < this.field_q; var10Lifetime6++) {
                var11Lifetime1 = this.field_n[var10Lifetime6];
                var12Lifetime1 = this.field_t[var11Lifetime1];
                array$8 = new int[this.field_d[var11Lifetime1]];
                this.field_b[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_d[var11Lifetime1]; var13Lifetime1++) {
                  this.field_b[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null != this.field_p[var11Lifetime1]) {
                    var14Lifetime1 = this.field_p[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_b[var11Lifetime1][var14Lifetime1] = var17.c(param1 + 189);
                }
                this.field_a[var11Lifetime1] = new mo(this.field_b[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_102_0 = var3;
          stackIn_102_1 = new StringBuilder().append("jh.C(");
          if (param0 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(',').append(param1).append(')').toString());
        }
    }

    jh(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_m = ii.a(8099, param0.length, param0);
          if (this.field_m != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_r = nl.a(0, param0.length, -128, param0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_r[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, (byte) -80);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "jh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Please wait...";
        field_i = true;
        field_h = 0;
    }
}
