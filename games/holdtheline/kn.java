/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kn {
    private int[][] field_l;
    byte[][] field_g;
    int[] field_n;
    private int field_q;
    gl[] field_c;
    int[] field_e;
    int[] field_k;
    int field_o;
    int[] field_u;
    private int[] field_j;
    static String field_i;
    gl field_h;
    int field_t;
    int[] field_p;
    int[][] field_m;
    static tk field_r;
    static int field_a;
    static Calendar field_f;
    int field_s;
    private byte[] field_d;
    static int[] field_b;

    final static jk a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, ah[] param8, int param9, int param10, int param11, int param12) {
        jk var13 = null;
        RuntimeException var13_ref = null;
        jk var14 = null;
        jk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!mm.field_e.b(0)) {
            var14 = (jk) (mm.field_e.a((byte) 74));
            var13 = var14;
            var14.a(param2, param3, param1, param10, param0, (byte) -126, param6, param9, param12, param11, param5);
          } else {
            var13 = new jk(param6, param1, param0, param10, param3, param9, param12, param2, param11, param5);
          }
          param8[param4 + param7].a((byte) -113, var13);
          stackIn_4_0 = var13;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_7_0 = var13_ref;
          stackIn_7_1 = new StringBuilder().append("kn.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 <= 35) {
          return;
        }
        field_i = null;
        field_f = null;
        field_r = null;
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
        th var17 = null;
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
        var16 = HoldTheLine.field_D;
        try {
          var17 = new th(ph.a((byte) -1, param1));
          var4 = var17.f((byte) -125);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_s = 0;
            } else {
              this.field_s = var17.a(-59);
            }
            var5 = var17.f((byte) -43);
            stackIn_11_0 = (0 == (1 & var5)) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (7 > var4) {
              this.field_q = var17.k(-69);
            } else {
              this.field_q = var17.g(-23);
            }
            var8 = 0;
            this.field_n = new int[this.field_q];
            var9 = -1;
            if (7 > var4) {
              for (var10 = 0; var10 < this.field_q; var10++) {
                dupTemp$0 = var8 + var17.k(89);
                var8 = dupTemp$0;
                this.field_n[var10] = dupTemp$0;
                if (var9 < this.field_n[var10]) {
                  var9 = this.field_n[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_q; var10++) {
                dupTemp$1 = var8 + var17.g(-123);
                var8 = dupTemp$1;
                this.field_n[var10] = dupTemp$1;
                if (this.field_n[var10] > var9) {
                  var9 = this.field_n[var10];
                }
              }
            }
            this.field_o = 1 + var9;
            this.field_m = new int[this.field_o][];
            this.field_e = new int[this.field_o];
            this.field_u = new int[this.field_o];
            this.field_p = new int[this.field_o];
            if (var7 != 0) {
              this.field_g = new byte[this.field_o][];
            }
            this.field_k = new int[this.field_o];
            if (var6 != 0) {
              this.field_j = new int[this.field_o];
              for (var10Lifetime1 = 0; this.field_o > var10Lifetime1; var10Lifetime1++) {
                this.field_j[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_q > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_j[this.field_n[var10Lifetime1Lifetime1]] = var17.a(-98);
              }
              this.field_h = new gl(this.field_j);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_q; var10Lifetime2++) {
              this.field_e[this.field_n[var10Lifetime2]] = var17.a(-66);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_q > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(64, 0, (byte) 84, var21);
                this.field_g[this.field_n[var10Lifetime3]] = var21;
              }
            }
            if (!param0) {
              this.field_k = (int[]) null;
            }
            for (var10Lifetime4 = 0; this.field_q > var10Lifetime4; var10Lifetime4++) {
              this.field_p[this.field_n[var10Lifetime4]] = var17.a(-63);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_q; var10Lifetime5++) {
                this.field_u[this.field_n[var10Lifetime5]] = var17.g(-60);
              }
              for (var10Lifetime5 = 0; this.field_q > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_n[var10Lifetime5];
                var12 = this.field_u[var11];
                var8Lifetime1 = 0;
                array$2 = new int[var12];
                this.field_m[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.g(-54);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_m[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_k[var11] = 1 + var13;
                if (1 + var13 == var12) {
                  this.field_m[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_q; var10Lifetime5++) {
                this.field_u[this.field_n[var10Lifetime5]] = var17.k(122);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_q; var10Lifetime5++) {
                var11 = this.field_n[var10Lifetime5];
                var12 = this.field_u[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$5 = new int[var12];
                this.field_m[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.k(-121);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_m[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_k[var11] = 1 + var13;
                if (1 + var13 == var12) {
                  this.field_m[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_c = new gl[var9 + 1];
              this.field_l = new int[1 + var9][];
              for (var10Lifetime6 = 0; this.field_q > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_n[var10Lifetime6];
                var12Lifetime1 = this.field_u[var11Lifetime1];
                array$8 = new int[this.field_k[var11Lifetime1]];
                this.field_l[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_k[var11Lifetime1]; var13Lifetime1++) {
                  this.field_l[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null != this.field_m[var11Lifetime1]) {
                    var14Lifetime1 = this.field_m[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_l[var11Lifetime1][var14Lifetime1] = var17.a(72);
                }
                this.field_c[var11Lifetime1] = new gl(this.field_l[var11Lifetime1]);
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
          stackIn_102_1 = new StringBuilder().append("kn.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    final static vk b(byte param0) {
        if (param0 != -49) {
          kn.a((byte) -96);
        }
        if (mi.field_d == 3) {
          return tk.field_c[4][0];
        }
        if (mi.field_d != 2) {
          return tk.field_c[cf.field_w][vg.field_P];
        }
        return tk.field_c[5][vg.field_P];
    }

    kn(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_t = pg.a((byte) -86, param0, param0.length);
          if (param1 != this.field_t) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_d = wc.a(param0, -6408, 0, param0.length);
            for (var4_int = 0; 64 > var4_int; var4_int++) {
              if (this.field_d[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(true, param0);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Back";
        field_f = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
