/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    qq field_d;
    static String field_m;
    static String field_k;
    static String field_f;
    int[][] field_i;
    int[] field_l;
    private byte[] field_g;
    int field_h;
    int[] field_s;
    int field_o;
    private int[][] field_c;
    byte[][] field_a;
    int[] field_p;
    int field_e;
    qq[] field_n;
    private int field_q;
    int[] field_b;
    private int[] field_j;
    int[] field_r;

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
        k var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var17 = new k(hb.a(param1, param0));
          var4 = var17.g(31365);
          if (5 <= var4 &&
            7 >= var4) {
            if (var4 >= 6) {
              this.field_h = var17.i(param0 ^ -1478490344);
            } else {
              this.field_h = 0;
            }
            var5 = var17.g(31365);
            stackIn_11_0 = (0 == (1 & var5)) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 < 7) {
              this.field_q = var17.d((byte) 69);
            } else {
              this.field_q = var17.e((byte) -49);
            }
            var8 = 0;
            this.field_l = new int[this.field_q];
            var9 = -1;
            if (var4 >= 7) {
              for (var10 = 0; var10 < this.field_q; var10++) {
                dupTemp$0 = var8 + var17.e((byte) -49);
                var8 = dupTemp$0;
                this.field_l[var10] = dupTemp$0;
                if (this.field_l[var10] > var9) {
                  var9 = this.field_l[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_q > var10; var10++) {
                dupTemp$1 = var8 + var17.d((byte) 69);
                var8 = dupTemp$1;
                this.field_l[var10] = dupTemp$1;
                if (this.field_l[var10] > var9) {
                  var9 = this.field_l[var10];
                }
              }
            }
            this.field_e = var9 + 1;
            this.field_r = new int[this.field_e];
            this.field_p = new int[this.field_e];
            this.field_s = new int[this.field_e];
            this.field_b = new int[this.field_e];
            if (var7 != 0) {
              this.field_a = new byte[this.field_e][];
            }
            this.field_i = new int[this.field_e][];
            if (var6 != 0) {
              this.field_j = new int[this.field_e];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_e; var10Lifetime1++) {
                this.field_j[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_q > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_j[this.field_l[var10Lifetime1Lifetime1]] = var17.i(param0 - 1478490344);
              }
              this.field_d = new qq(this.field_j);
            }
            for (var10Lifetime2 = 0; this.field_q > var10Lifetime2; var10Lifetime2++) {
              this.field_r[this.field_l[var10Lifetime2]] = var17.i(param0 - 1478490344);
            }
            if (var7 == 0) {
              for (var10Lifetime3 = 0; this.field_q > var10Lifetime3; var10Lifetime3++) {
                this.field_p[this.field_l[var10Lifetime3]] = var17.i(vg.a(param0, -1478490344));
              }
            } else {
              for (var10Lifetime3 = 0; this.field_q > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(0, param0 - 6351, 64, var21);
                this.field_a[this.field_l[var10Lifetime3]] = var21;
              }
              for (var10Lifetime3 = 0; this.field_q > var10Lifetime3; var10Lifetime3++) {
                this.field_p[this.field_l[var10Lifetime3]] = var17.i(vg.a(param0, -1478490344));
              }
            }
            if (var4 >= 7) {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_q; var10Lifetime4++) {
                this.field_s[this.field_l[var10Lifetime4]] = var17.e((byte) -49);
              }
              for (var10Lifetime4 = 0; this.field_q > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_l[var10Lifetime4];
                var12 = this.field_s[var11];
                var8Lifetime1 = 0;
                array$2 = new int[var12];
                this.field_i[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.e((byte) -49);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_i[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_b[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_i[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; this.field_q > var10Lifetime4; var10Lifetime4++) {
                this.field_s[this.field_l[var10Lifetime4]] = var17.d((byte) 69);
              }
              for (var10Lifetime4 = 0; this.field_q > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_l[var10Lifetime4];
                var12 = this.field_s[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_i[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.d((byte) 69);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_i[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_b[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_i[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_n = new qq[1 + var9];
              this.field_c = new int[1 + var9][];
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_q; var10Lifetime5++) {
                var11Lifetime1 = this.field_l[var10Lifetime5];
                var12Lifetime1 = this.field_s[var11Lifetime1];
                array$8 = new int[this.field_b[var11Lifetime1]];
                this.field_c[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_b[var11Lifetime1]; var13Lifetime1++) {
                  this.field_c[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_i[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_i[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_c[var11Lifetime1][var14Lifetime1] = var17.i(-1478490344);
                }
                this.field_n[var11Lifetime1] = new qq(this.field_c[var11Lifetime1]);
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
          stackIn_102_1 = new StringBuilder().append("be.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    final static void a(long param0, boolean param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            if (!param1) {
              field_f = (String) null;
            }
            Thread.sleep(param0);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_m = null;
        if (param0 != 0) {
          field_f = (String) null;
        }
        field_k = null;
    }

    be(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_o = pb.a(param0, param0.length, (byte) -120);
          if (this.field_o != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_g = ho.a(4246, 0, param0, param0.length);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_g[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(0, param0);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Hide chat to continue";
        field_k = "Asking to join <%0>'s game...";
        field_f = "No";
    }
}
