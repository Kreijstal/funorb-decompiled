/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends ca {
    private int[][] field_q;
    static int field_v;
    private int[] field_s;
    int[] field_r;
    private String[] field_p;
    static String field_t;
    static String field_u;
    static boolean[] field_w;

    private final void a(int param0, wf param1, int param2) {
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
        aj var7 = null;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          if (1 != param0) {
            if (param0 == 2) {
              var4_int = param1.d(true);
              this.field_r = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_r[var5] = param1.b(-1698573656);
              }
            } else {
              if (param0 == 3) {
                var4_int = param1.d(true);
                this.field_s = new int[var4_int];
                this.field_q = new int[var4_int][];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = param1.b(param2 - 1698584257);
                  var7 = gb.a(var6, 2121865922);
                  if (var7 != null) {
                    this.field_s[var5] = var6;
                    array$0 = new int[var7.field_b];
                    this.field_q[var5] = array$0;
                    for (var8 = 0; var7.field_b > var8; var8++) {
                      this.field_q[var5][var8] = param1.b(-1698573656);
                    }
                  }
                }
              } else {
                if (4 == param0) {
                }
              }
            }
          } else {
            this.field_p = dc.a(param1.c(false), '<', (byte) -125);
          }
          if (param2 != 10601) {
            field_w = (boolean[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("me.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void e(boolean param0) {
        int var7 = 0;
        th stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        RuntimeException decompiledCaughtException = null;
        th var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        th var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        vb var12 = null;
        vi var13 = null;
        int[] var14 = null;
        vi var15 = null;
        int[] var16 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var1 = ig.field_a;
          stackIn_3_0 = var1;
          stackIn_4_1 = !(param0);
          var2 = ((th) (Object) stackIn_3_0).d(stackIn_4_1);
          if (var2 == 0) {
            var11 = wj.b(26770);
            var16 = var11;
            var14 = var16;
            var3 = var14;
            var10 = var11;
            var4 = var10;
            var5 = var1;
            var6 = ((wf) ((Object) var5)).d(true);
            for (var7 = 0; var7 < var6; var7++) {
              var10[var7] = ((wf) ((Object) var5)).d((byte) 19);
            }
            var15 = (vi) (ci.field_f.a(true));
            if (var15 == null) {
              ck.$cfr$intArgs$b$e683eeaaf5b5(-49);
              return;
            }
            var15.field_i = var16[0];
            var15.field_h = true;
            var15.field_k = var3;
            var15.b((byte) -128);
          } else {
            if (var2 != 1) {
              if (var2 == 2) {
                var13 = (vi) (ci.field_f.a(true));
                if (var13 == null) {
                  ck.$cfr$intArgs$b$e683eeaaf5b5(-68);
                  return;
                }
                var13.field_k = wj.b(26770);
                var13.field_i = var13.field_k[0];
                var13.field_h = true;
                var13.b((byte) -116);
              } else {
                uj.a("A1: " + qj.h(-94), (Throwable) null, 1);
                ck.$cfr$intArgs$b$e683eeaaf5b5(-32);
              }
            } else {
              var12 = (vb) (jl.field_a.a(true));
              if (var12 == null) {
                ck.$cfr$intArgs$b$e683eeaaf5b5(-125);
                return;
              }
              var12.b((byte) -125);
            }
          }
          if (param0) {
            field_w = (boolean[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "me.F(" + param0 + ')');
        }
    }

    me() {
    }

    public static void d(int param0) {
        if (param0 != 80) {
          field_u = (String) null;
        }
        field_t = null;
        field_u = null;
        field_w = null;
    }

    final String c(int param0) {
        int var3 = 0;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_p == null) {
          return "";
        }
        StringBuilder discarded$14 = var5.append(this.field_p[0]);
        if (param0 >= -74) {
          field_t = (String) null;
        }
        for (var3 = 1; this.field_p.length > var3; var3++) {
          discarded$15 = var2.append("...");
          discarded$16 = var5.append(this.field_p[var3]);
        }
        return var2.toString();
    }

    final void a(wf param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          while (true) {
            var3_int = param0.d(true);
            if (0 != var3_int) {
              this.a(var3_int, param0, 10601);
              continue;
            }
            break;
          }
          if (param1 != 0) {
            field_u = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("me.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(byte param0) {
        sa.a((byte) 88, kk.c(-14047));
        if (param0 >= -4) {
          field_w = (boolean[]) null;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        if (null != this.field_r) {
          for (var2 = 0; this.field_r.length > var2; var2++) {
            this.field_r[var2] = tb.a(this.field_r[var2], 32768);
          }
        }
        if (param0 > -66) {
          me.c((byte) -21);
        }
    }

    static {
        field_t = "Email address is unavailable";
        field_u = "You are not currently logged in to the<nbsp>game.";
    }
}
