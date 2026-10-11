/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we {
    int[] field_o;
    int[] field_t;
    int[] field_q;
    ni field_h;
    int[] field_l;
    int field_m;
    int field_i;
    int field_s;
    private int field_p;
    static int field_g;
    static bi field_b;
    byte[][] field_d;
    int[] field_u;
    ni[] field_j;
    private int[][] field_f;
    private byte[] field_n;
    static int field_k;
    int[][] field_r;
    static int field_c;
    static int field_a;
    private int[] field_e;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -21) {
          we.a(86, false, (byte) 113, true, -103, true);
        }
    }

    final static mi a(int param0, boolean param1, byte param2, boolean param3, int param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          tj var8 = null;
          mi stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2 >= -44) {
              we.a((byte) -3);
            }
            var6 = null;
            var7 = null;
            if (ek.field_p.field_t != null) {
              gd.field_q = new pf(ek.field_p.field_t, 5200, 0);
              ek.field_p.field_t = null;
              var6 = new ae(255, gd.field_q, new pf(ek.field_p.field_v, 12000, 0), 2097152);
            }
            if (null != gd.field_q) {
              if (vh.field_e == null) {
                vh.field_e = new pf[ek.field_p.field_d.length];
              }
              if (vh.field_e[param0] == null) {
                vh.field_e[param0] = new pf(ek.field_p.field_d[param0], 12000, 0);
                ek.field_p.field_d[param0] = null;
              }
              var7 = new ae(param0, gd.field_q, vh.field_e[param0], 2097152);
            }
            var8 = dh.field_vb.a((ae) (var6), (byte) -60, param1, param0, (ae) (var7));
            if (param5) {
              var8.b(-2);
            }
            stackIn_15_0 = new mi(var8, param3, param4);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

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
        kg var17 = null;
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
        var16 = Confined.field_J ? 1 : 0;
        try {
          var17 = new kg(tm.a(-64, param1));
          var4 = var17.c(32);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_m = var17.f((byte) 50);
            } else {
              this.field_m = 0;
            }
            var5 = var17.c(32);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (7 > var4) {
              this.field_p = var17.a((byte) 25);
            } else {
              this.field_p = var17.j((byte) 119);
            }
            stackIn_17_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            this.field_u = new int[this.field_p];
            var9 = -1;
            if (7 > var4) {
              for (var10 = 0; this.field_p > var10; var10++) {
                dupTemp$0 = var8 + var17.a((byte) 25);
                var8 = dupTemp$0;
                this.field_u[var10] = dupTemp$0;
                if (this.field_u[var10] > var9) {
                  var9 = this.field_u[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_p; var10++) {
                dupTemp$1 = var8 + var17.j((byte) -19);
                var8 = dupTemp$1;
                this.field_u[var10] = dupTemp$1;
                if (var9 < this.field_u[var10]) {
                  var9 = this.field_u[var10];
                }
              }
            }
            this.field_i = 1 + var9;
            this.field_q = new int[this.field_i];
            this.field_t = new int[this.field_i];
            if (var7 != 0) {
              this.field_d = new byte[this.field_i][];
            }
            this.field_r = new int[this.field_i][];
            this.field_o = new int[this.field_i];
            this.field_l = new int[this.field_i];
            if (var6 != 0) {
              this.field_e = new int[this.field_i];
              for (var10Lifetime1 = 0; this.field_i > var10Lifetime1; var10Lifetime1++) {
                this.field_e[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_p; var10Lifetime1Lifetime1++) {
                this.field_e[this.field_u[var10Lifetime1Lifetime1]] = var17.f((byte) 79);
              }
              this.field_h = new ni(this.field_e);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_p; var10Lifetime2++) {
              this.field_l[this.field_u[var10Lifetime2]] = var17.f((byte) 116);
            }
            if (var7 == 0) {
              for (var10Lifetime3 = param0; this.field_p > var10Lifetime3; var10Lifetime3++) {
                this.field_o[this.field_u[var10Lifetime3]] = var17.f((byte) 88);
              }
            } else {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_p; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(0, (byte) 72, 64, var21);
                this.field_d[this.field_u[var10Lifetime3]] = var21;
              }
              for (var10Lifetime3 = param0; this.field_p > var10Lifetime3; var10Lifetime3++) {
                this.field_o[this.field_u[var10Lifetime3]] = var17.f((byte) 88);
              }
            }
            if (var4 >= 7) {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_p; var10Lifetime4++) {
                this.field_t[this.field_u[var10Lifetime4]] = var17.j((byte) -73);
              }
              for (var10Lifetime4 = 0; this.field_p > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_u[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.field_t[var11];
                array$2 = new int[var12];
                this.field_r[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.j((byte) 108);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_r[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_q[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_r[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_p; var10Lifetime4++) {
                this.field_t[this.field_u[var10Lifetime4]] = var17.a((byte) 25);
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_p; var10Lifetime4++) {
                var11 = this.field_u[var10Lifetime4];
                var12 = this.field_t[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_r[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.a((byte) 25);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_r[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_q[var11] = 1 + var13;
                if (1 + var13 == var12) {
                  this.field_r[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_j = new ni[1 + var9];
              this.field_f = new int[var9 + 1][];
              for (var10Lifetime5 = 0; this.field_p > var10Lifetime5; var10Lifetime5++) {
                var11Lifetime1 = this.field_u[var10Lifetime5];
                var12Lifetime1 = this.field_t[var11Lifetime1];
                array$8 = new int[this.field_q[var11Lifetime1]];
                this.field_f[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_q[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_f[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_r[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_r[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_f[var11Lifetime1][var14Lifetime1] = var17.f((byte) 101);
                }
                this.field_j[var11Lifetime1] = new ni(this.field_f[var11Lifetime1]);
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
          stackIn_103_1 = new StringBuilder().append("we.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
        }
    }

    we(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_s = in.a(param0.length, param0, -127);
          if (this.field_s != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_n = in.a(0, param0, param0.length, -26879);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_n[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(0, param0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
