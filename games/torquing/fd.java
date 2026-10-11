/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    int field_o;
    int[] field_h;
    int[] field_b;
    static String[] field_k;
    private byte[] field_d;
    byte[][] field_e;
    private int[][] field_i;
    private int[] field_g;
    int[] field_q;
    int field_c;
    int[] field_l;
    vb field_n;
    vb[] field_j;
    int field_r;
    static boolean field_a;
    int[] field_p;
    private int field_f;
    int[][] field_m;

    final static kn a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          kn var5 = null;
          sn var5_ref = null;
          kn stackIn_2_0 = null;
          kn stackIn_4_0 = null;
          sn stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("fg");
              var5 = (kn) (var4.newInstance());
              var5.a(param3, (byte) 24, param1, param2);
              if (param0 == 0) {
                stackIn_4_0 = var5;
                return stackIn_4_0;
              }
              stackIn_2_0 = (kn) null;
              return stackIn_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new sn();
              ((kn) ((Object) var5_ref)).a(param3, (byte) 24, param1, param2);
              stackIn_6_0 = var5_ref;
              return (kn) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("fd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, la param1, int param2, la param3, la param4) {
        try {
          if (param2 != 0) {
            CharSequence var6 = (CharSequence) null;
            fd.a(-33, (CharSequence) null);
          }
          qk.field_q = ci.a(-121, "");
          qk.field_q.a(84, false);
          re.a(param4, true, param3, param1);
          gh.b(1);
          bh.field_a = tp.field_h;
          kh.field_o = tp.field_h;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Torquing.field_u;
        try {
          var1_int = 0;
          if (param0 >= -65) {
            field_k = (String[]) null;
          }
          while (r.field_b.length > var1_int) {
            if (rn.field_e == r.field_b[var1_int]) {
              r.field_b[var1_int] = un.field_i;
            }
            var1_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "fd.D(" + param0 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = vd.a(-127, param1, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("fd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 <= 57) {
          field_a = false;
        }
    }

    private final void a(boolean param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
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
        fj var17 = null;
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
        var16 = Torquing.field_u;
        try {
          var17 = new fj(l.a(0, param1));
          var4 = var17.i((byte) -101);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_r = 0;
            } else {
              this.field_r = var17.c((byte) -80);
            }
            if (param0) {
              return;
            }
            var5 = var17.i((byte) -101);
            stackIn_13_0 = (0 == (var5 & 1)) ? 0 : 1;
            var6 = stackIn_13_0;
            if (var4 >= 7) {
              this.field_f = var17.c(0);
            } else {
              this.field_f = var17.i(7088);
            }
            stackIn_19_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_19_0;
            var8 = 0;
            this.field_b = new int[this.field_f];
            var9 = -1;
            if (7 > var4) {
              for (var10 = 0; this.field_f > var10; var10++) {
                dupTemp$0 = var8 + var17.i(7088);
                var8 = dupTemp$0;
                this.field_b[var10] = dupTemp$0;
                if (this.field_b[var10] > var9) {
                  var9 = this.field_b[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_f > var10; var10++) {
                dupTemp$1 = var8 + var17.c(0);
                var8 = dupTemp$1;
                this.field_b[var10] = dupTemp$1;
                if (this.field_b[var10] > var9) {
                  var9 = this.field_b[var10];
                }
              }
            }
            this.field_c = var9 + 1;
            this.field_q = new int[this.field_c];
            this.field_m = new int[this.field_c][];
            this.field_p = new int[this.field_c];
            this.field_h = new int[this.field_c];
            if (var7 != 0) {
              this.field_e = new byte[this.field_c][];
            }
            this.field_l = new int[this.field_c];
            if (var6 != 0) {
              this.field_g = new int[this.field_c];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_c; var10Lifetime1++) {
                this.field_g[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_f; var10Lifetime1Lifetime1++) {
                this.field_g[this.field_b[var10Lifetime1Lifetime1]] = var17.c((byte) -62);
              }
              this.field_n = new vb(this.field_g);
            }
            for (var10Lifetime2 = 0; this.field_f > var10Lifetime2; var10Lifetime2++) {
              this.field_p[this.field_b[var10Lifetime2]] = var17.c((byte) -56);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_f; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(48, 64, var21, 0);
                this.field_e[this.field_b[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_f; var10Lifetime4++) {
              this.field_q[this.field_b[var10Lifetime4]] = var17.c((byte) -109);
            }
            if (var4 < 7) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_f; var10Lifetime5++) {
                this.field_l[this.field_b[var10Lifetime5]] = var17.i(7088);
              }
              for (var10Lifetime5 = 0; this.field_f > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_b[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_l[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_m[var11] = array$2;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.i(7088);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_m[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_h[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_m[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_f; var10Lifetime5++) {
                this.field_l[this.field_b[var10Lifetime5]] = var17.c(0);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_f; var10Lifetime5++) {
                var11 = this.field_b[var10Lifetime5];
                var12 = this.field_l[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_m[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.c(0);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_m[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_h[var11] = var13 + 1;
                if (var13 + 1 == var12) {
                  this.field_m[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_j = new vb[var9 + 1];
              this.field_i = new int[1 + var9][];
              for (var10Lifetime6 = 0; this.field_f > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_b[var10Lifetime6];
                var12Lifetime1 = this.field_l[var11Lifetime1];
                array$8 = new int[this.field_h[var11Lifetime1]];
                this.field_i[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_h[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_i[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_m[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_m[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_i[var11Lifetime1][var14Lifetime1] = var17.c((byte) -92);
                }
                this.field_j[var11Lifetime1] = new vb(this.field_i[var11Lifetime1]);
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
          stackIn_102_1 = new StringBuilder().append("fd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    fd(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_o = wf.a((byte) -117, param0.length, param0);
          if (param1 != this.field_o) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_d = np.a(0, param0, param0.length, -127);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_d[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(false, param0);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
