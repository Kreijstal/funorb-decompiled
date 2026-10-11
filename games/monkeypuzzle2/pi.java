/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends bf {
    private int[] field_k;
    int[] field_q;
    private int[][] field_j;
    static String field_p;
    private String[] field_n;
    static Random field_l;
    static int field_o;
    static String field_i;
    static String field_m;

    final void a(gk param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        gk var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (!param1) {
            var5 = (gk) null;
            this.a((gk) null, -61, 68);
          }
          while (true) {
            var3_int = param0.a((byte) 114);
            if (0 == var3_int) {
              return;
            }
            this.a(param0, -305, var3_int);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pi.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(gk param0, int param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        te var7 = null;
        int var9 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2 != 1) {
            if (param2 == 2) {
              var4_int = param0.a((byte) 114);
              this.field_q = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_q[var5] = param0.j(17277);
              }
            } else {
              if (param2 == 3) {
                var4_int = param0.a((byte) 114);
                this.field_j = new int[var4_int][];
                this.field_k = new int[var4_int];
                for (var5 = 0; var5 < var4_int; var5++) {
                  var6 = param0.j(param1 + 17582);
                  var7 = ab.a((byte) -65, var6);
                  if (var7 != null) {
                    this.field_k[var5] = var6;
                    array$0 = new int[var7.field_b];
                    this.field_j[var5] = array$0;
                    for (var8 = 0; var8 < var7.field_b; var8++) {
                      this.field_j[var5][var8] = param0.j(17277);
                    }
                  }
                }
              } else {
                if (param2 != 4) {
                }
              }
            }
          } else {
            this.field_n = ma.a(122, '<', param0.f(-1));
          }
          if (param1 != -305) {
            field_l = (Random) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("pi.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        boolean stackIn_76_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        ki var3 = null;
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var2Lifetime1;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          while (ba.a(-1)) {
            if (oa.field_H != 13 &&
              oa.field_H != 83 &&
              oa.field_H != 84) {
              continue;
            }
            return true;
          }
          if (kc.field_d != 0) {
            return true;
          }
          m.field_h = m.field_h + 1;
          var1_int = 6;
          if (0 == m.field_h % var1_int) {
            for (var2 = 0; var2 < ii.field_E; var2++) {
              stackIn_20_0 = -1;
              stackIn_20_1 = ~ii.field_U[var2];
              if (stackIn_20_0 >= stackIn_20_1) {
                ii.field_U[var2] = ii.field_U[var2] + 1;
                if (3 <= ii.field_U[var2]) {
                  ii.field_U[var2] = -2;
                }
              }
            }
          }
          if (!(m.field_h <= 297) &&
            326 > m.field_h) {
            var1_int = 14;
          }
          boolean decompiledFrameRemainder0 = true;
          if (m.field_h % var1_int == 0) {
            if (196 < m.field_h &&
              m.field_h < 297) {
              if (i.field_i) {
                mg.field_q = mg.field_q - 1;
              } else {
                mg.field_q = mg.field_q + 1;
              }
              if (i.field_i &&
                mg.field_q == 4) {
                i.field_i = false;
              } else {
                if ((mg.field_q == 6)) {
                  i.field_i = true;
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              mg.field_q = mg.field_q + 1;
              if (m.field_h < 196 &&
                mg.field_q == 4) {
                mg.field_q = 0;
              }
              if (m.field_h > 304 &&
                m.field_h < 330) {
                mg.field_q = 7;
              } else {
                if (mg.field_q >= we.field_f.length) {
                  mg.field_q = we.field_f.length - 1 - 3;
                }
              }
            }
          }
          if (102 < m.field_h) {
            var7 = 0;
            var2Lifetime1 = var7;
            var3 = (ki) (bd.field_b.a((byte) -117));
            while (var3 != null) {
              var4 = m.field_h - (102 + ck.field_g[var7]);
              stackIn_56_0 = ~var4;
              stackIn_56_1 = -1;
              if (stackIn_56_0 <= stackIn_56_1) {
                var5 = (float)var4 / 80.0f;
                if (var5 >= 1.0f) {
                  var5 = 1.0f;
                }
                if (var5 >= 0.9700000286102295f &&
                  ii.field_U[var7] == -1) {
                  ii.field_U[var7] = 0;
                  cj.a((byte) 113, ke.field_h[5]);
                }
                var3.field_B = rl.field_c[var7][0] + (-rl.field_c[var7][0] + da.field_b[var7][0]) * var5;
                var3.field_q = rl.field_c[var7][1] + (da.field_b[var7][1] - rl.field_c[var7][1]) * var5;
                var7++;
              } else {
                var7++;
              }
              var3 = (ki) (bd.field_b.d((byte) 63));
            }
          }
          if (param0 < 120) {
            field_p = (String) null;
          }
          if (m.field_h == 330) {
            cj.a((byte) -71, ke.field_h[14]);
          }
          if (m.field_h == 374) {
            cj.a((byte) -99, ke.field_h[12]);
          }
          stackIn_76_0 = !(m.field_h <= 424);
          return stackIn_76_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "pi.E(" + param0 + ')');
        }
    }

    public static void f(int param0) {
        field_p = null;
        field_l = null;
        field_i = null;
        if (param0 != -13739) {
          return;
        }
        field_m = null;
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_q != null) {
          for (var2 = 0; var2 < this.field_q.length; var2++) {
            this.field_q[var2] = bd.a(this.field_q[var2], 32768);
          }
        }
        if (param0 != 0) {
          field_l = (Random) null;
        }
    }

    final String b(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -54) {
          pi.f(62);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_n) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_n[0]);
        for (var3 = 1; this.field_n.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_n[var3]);
        }
        return var2.toString();
    }

    pi() {
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 122) {
            var3 = (CharSequence) null;
            pi.a((byte) -13, (CharSequence) null);
          }
          stackIn_3_0 = wg.a(false, param1, 17212);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pi.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_l = new Random();
        field_m = "Mouse over an icon for details";
        field_i = "Continue";
    }
}
