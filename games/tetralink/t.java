/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class t {
    int field_i;
    private int[][] field_c;
    int[] field_k;
    byte[][] field_e;
    int field_v;
    int[][] field_a;
    int[] field_u;
    static df field_h;
    int[] field_j;
    qm[] field_n;
    int[] field_m;
    qm field_r;
    int[] field_d;
    static hl field_q;
    static int field_l;
    static int field_t;
    int field_f;
    static String field_p;
    private int[] field_g;
    private int field_s;
    static hl field_o;
    private byte[] field_b;

    final static de a(boolean param0, byte[] param1) {
        de var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        de stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_q = (hl) null;
          }
          if (param1 == null) {
            stackIn_4_0 = null;
            return (de) (stackIn_4_0);
          }
          var2 = new de(param1, qa.field_x, i.field_t, je.field_h, sn.field_e, ga.field_a);
          an.b(-100);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("t.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, String param2, String[] param3, jb param4) {
        int var10 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var7Lifetime1;
        var14 = TetraLink.field_J;
        try {
          var6 = 72 % ((param1 - 53) / 49);
          var5_int = param4.b(param2);
          if (var5_int <= param0 &&
            -1 == param2.indexOf("<br>")) {
            param3[0] = param2;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var7 = (var5_int + param0 - 1) / param0;
          param0 = var5_int / var7;
          var7Lifetime1 = 0;
          var8 = 0;
          var9 = param2.length();
          for (var10 = 0; var9 > var10; var10++) {
            var11 = param2.charAt(var10);
            if (32 == var11 ||
              var11 == 45) {
              var12 = param2.substring(var8, 1 + var10).trim();
              var13 = param4.b(var12);
              if (var13 >= param0) {
                var8 = var10 + 1;
                incrementValue$1 = var7Lifetime1;
                var7Lifetime1++;
                param3[incrementValue$1] = var12;
              }
            }
            if (var11 == 62 &&
              param2.regionMatches(-3 + var10, "<br>", 0, 4)) {
              incrementValue$2 = var7Lifetime1;
              var7Lifetime1++;
              param3[incrementValue$2] = param2.substring(var8, -3 + var10).trim();
              var8 = 1 + var10;
            }
          }
          if (var9 > var8) {
            incrementValue$0 = var7Lifetime1;
            var7Lifetime1++;
            param3[incrementValue$0] = param2.substring(var8, var9).trim();
          }
          stackIn_24_0 = var7Lifetime1;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("t.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param4 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final void a(byte[] param0, int param1) {
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
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
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
        bh var17 = null;
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
        var16 = TetraLink.field_J;
        try {
          var17 = new bh(pk.a(param0, (byte) 94));
          var4 = var17.d((byte) -99);
          if (5 <= var4 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_f = var17.f(param1 - 128);
            } else {
              this.field_f = 0;
            }
            var5 = var17.d((byte) -99);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 < 7) {
              this.field_s = var17.e(127);
            } else {
              this.field_s = var17.c((byte) -40);
            }
            stackIn_17_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            var9 = -1;
            this.field_j = new int[this.field_s];
            if (var4 < 7) {
              for (var10 = 0; var10 < this.field_s; var10++) {
                dupTemp$0 = var8 + var17.e(127);
                var8 = dupTemp$0;
                this.field_j[var10] = dupTemp$0;
                if (var9 < this.field_j[var10]) {
                  var9 = this.field_j[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_s > var10; var10++) {
                dupTemp$1 = var8 + var17.c((byte) -40);
                var8 = dupTemp$1;
                this.field_j[var10] = dupTemp$1;
                if (this.field_j[var10] > var9) {
                  var9 = this.field_j[var10];
                }
              }
            }
            this.field_i = var9 + 1;
            this.field_d = new int[this.field_i];
            if (var7 != 0) {
              this.field_e = new byte[this.field_i][];
            }
            this.field_u = new int[this.field_i];
            this.field_a = new int[this.field_i][];
            this.field_k = new int[this.field_i];
            this.field_m = new int[this.field_i];
            if (var6 != 0) {
              this.field_g = new int[this.field_i];
              for (var10Lifetime1 = 0; this.field_i > var10Lifetime1; var10Lifetime1++) {
                this.field_g[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_s; var10Lifetime1Lifetime1++) {
                this.field_g[this.field_j[var10Lifetime1Lifetime1]] = var17.f(param1 - 112);
              }
              this.field_r = new qm(this.field_g);
            }
            for (var10Lifetime2 = 0; this.field_s > var10Lifetime2; var10Lifetime2++) {
              this.field_u[this.field_j[var10Lifetime2]] = var17.f(param1 - 109);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_s > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.b(64, 0, var21, 126);
                this.field_e[this.field_j[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = param1; var10Lifetime4 < this.field_s; var10Lifetime4++) {
              this.field_k[this.field_j[var10Lifetime4]] = var17.f(7);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                this.field_m[this.field_j[var10Lifetime5]] = var17.c((byte) -40);
              }
              for (var10Lifetime5 = 0; this.field_s > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_j[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_m[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_a[var11] = array$2;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.c((byte) -40);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_a[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_d[var11] = 1 + var13;
                if (var12 == var13 + 1) {
                  this.field_a[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; this.field_s > var10Lifetime5; var10Lifetime5++) {
                this.field_m[this.field_j[var10Lifetime5]] = var17.e(127);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                var11 = this.field_j[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_m[var11];
                var13 = -1;
                array$5 = new int[var12];
                this.field_a[var11] = array$5;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.e(127);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_a[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_d[var11] = 1 + var13;
                if (var12 == var13 + 1) {
                  this.field_a[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_c = new int[1 + var9][];
              this.field_n = new qm[1 + var9];
              for (var10Lifetime6 = 0; this.field_s > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_j[var10Lifetime6];
                var12Lifetime1 = this.field_m[var11Lifetime1];
                array$8 = new int[this.field_d[var11Lifetime1]];
                this.field_c[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_d[var11Lifetime1]; var13Lifetime1++) {
                  this.field_c[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_a[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_a[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_c[var11Lifetime1][var14Lifetime1] = var17.f(-124);
                }
                this.field_n[var11Lifetime1] = new qm(this.field_c[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_99_0 = var3;
          stackIn_99_1 = new StringBuilder().append("t.E(");
          if (param0 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
          return;
        }
        fk.field_W = param0;
    }

    final static void b(int param0, int param1) {
        bh.h((byte) -47);
        if (param1 != -21901) {
          field_p = (String) null;
        }
    }

    final static void a(boolean param0, ie param1, long param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9, int param10, String param11, boolean param12, int param13) {
        try {
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          byte[] var16 = null;
          try {
            kb.field_q = new bc(param4);
            nd.field_Lb = new bc(param7);
            wc.field_I = param3;
            oi.field_m = param5;
            mc.field_k = param12;
            tc.field_s = param2;
            if (param9 <= 29) {
              var16 = (byte[]) null;
              t.a(false, (byte[]) null);
            }
            pg.field_m = param0;
            wg.field_c = param10;
            lm.field_g = param13;
            ko.field_t = param8;
            oi.field_l = param1;
            rl.field_a = param6;
            pd.field_r = param11;
            if (oi.field_l.field_f != null) {
              try {
                sk.field_f = new p(oi.field_l.field_f, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var15_ref;
            stackIn_12_1 = new StringBuilder().append("t.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            if (param11 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_q = null;
        field_p = null;
        field_o = null;
        if (param0 < 75) {
          field_h = (df) null;
        }
    }

    t(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_v = ti.a(param0, (byte) 103, param0.length);
          if (this.field_v != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_b = qb.a(param0, (byte) -89, param0.length, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_b[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "t.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new df(3);
        field_p = "Try changing the following settings:  ";
        field_t = 0;
    }
}
