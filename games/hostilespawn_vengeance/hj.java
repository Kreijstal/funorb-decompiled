/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends dk {
    private int[][] field_u;
    int[] field_w;
    static String field_s;
    static bd field_r;
    private int[] field_q;
    private String[] field_v;
    static pe field_t;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          var7_int = 0;
          var9 = param1;
          if (param5 != 32101) {
            hj.e(123);
          }
          while (var9 < param4 + param1) {
            var8 = param3 + (-param3 + param2) * (var9 - param1) / param4;
            si.e(param0, var9, param6, var7_int, var8);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var7), "hj.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_t = null;
        field_s = null;
        if (param0 > -36) {
          field_t = (pe) null;
        }
    }

    final static String d(int param0) {
        if (param0 < 33) {
          return (String) null;
        }
        return ad.field_c;
    }

    final static void a(String param0, int param1) {
        try {
          fl.field_b = param0;
          if (param1 < 37) {
            hj.a(-85, -127, -125, -96, -52, -34, 65);
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "hj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, vi param2) {
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
        nd var7 = null;
        int var9 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param1 != 19711) {
            this.field_v = (String[]) null;
          }
          if (1 == param0) {
            this.field_v = cj.a(param2.o(32), -14, '<');
          } else {
            if (param0 == 2) {
              var4_int = param2.l(param1 ^ 13041);
              this.field_w = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_w[var5] = param2.e(bm.a(param1, 19703));
              }
            } else {
              if (param0 == 3) {
                var4_int = param2.l(32270);
                this.field_q = new int[var4_int];
                this.field_u = new int[var4_int][];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = param2.e(8);
                  var7 = mb.c(param1 - 41805, var6);
                  if (var7 != null) {
                    this.field_q[var5] = var6;
                    array$0 = new int[var7.field_b];
                    this.field_u[var5] = array$0;
                    for (var8 = 0; var7.field_b > var8; var8++) {
                      this.field_u[var5][var8] = param2.e(8);
                    }
                  }
                }
              } else {
                if (4 != param0) {
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("hj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static ll b(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ll var5 = null;
        ll stackIn_2_0 = null;
        ll stackIn_7_0 = null;
        ll stackIn_11_0 = null;
        ll stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 11242) {
            stackIn_2_0 = (ll) null;
            return stackIn_2_0;
          }
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (-1 == var2_int) {
              stackIn_11_0 = gf.field_f;
              return stackIn_11_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            var5 = ml.a(-99, var3);
            if (var5 == null) {
              return ic.b(var4, (byte) -36);
            }
            stackIn_15_0 = var5;
            return stackIn_15_0;
          }
          stackIn_7_0 = sg.field_d;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("hj.O(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String[] args, String param1, int param2, int param3) {
        int var5 = 0;
        String[] var6 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          ki.field_f = ee.field_b;
          if (param2 != 0) {
            return;
          }
          if (param3 != 255) {
            if (param3 >= 100 &&
              param3 <= 105) {
              var4 = args;
              jj.a((byte) -112, var4);
              nl.field_a = vf.a(args, true);
              return;
            }
            nl.field_a = an.a(param3, -10, param1);
          } else {
            stackIn_7_0 = !(13 <= ia.field_h);
            nl.field_a = qi.a(stackIn_7_0, false);
            var6 = (String[]) null;
            jj.a((byte) -112, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("hj.A(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(vi param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          while (true) {
            var3_int = param0.l(param1 ^ 32334);
            if (var3_int != 0) {
              this.a(var3_int, 19711, param0);
              continue;
            }
            break;
          }
          if (param1 != 64) {
            this.d((byte) -9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hj.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    hj() {
    }

    final String d(byte param0) {
        int var4 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (this.field_v == null) {
          return "";
        }
        StringBuilder discarded$0 = var6.append(this.field_v[0]);
        int var3 = -127 / ((20 - param0) / 54);
        for (var4 = 1; this.field_v.length > var4; var4++) {
          discarded$1 = var2.append("...");
          discarded$2 = var6.append(this.field_v[var4]);
        }
        return var2.toString();
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_w != null) {
          for (var2 = 0; var2 < this.field_w.length; var2++) {
            this.field_w[var2] = ll.a(this.field_w[var2], 32768);
          }
        }
        if (param0 <= 61) {
          String var4 = (String) null;
          hj.b((String) null, 23);
        }
    }

    static {
        field_s = "Score: <col=ffffff><%0></col> points";
    }
}
