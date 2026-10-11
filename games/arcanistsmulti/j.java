/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j implements pf {
    static String field_c;
    static String field_e;
    static qb field_a;
    static kc field_f;
    static String field_b;
    private ti field_d;
    static volatile int field_g;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_e = null;
        if (param0 != -122) {
          nf var2 = (nf) null;
          j.a((ml) null, -73, (byte) -49, (nf) null, -70, 53, 100);
        }
    }

    final static int a(int param0, int param1) {
        if (param1 >= -100) {
          j.a(42, -19, 22);
        }
        param0 = param0 & 8191;
        if (param0 < 4096) {
          return param0 >= 2048 ? -ge.field_l[param0 - 2048] : ge.field_l[2048 - param0];
        }
        return param0 < 6144 ? -ge.field_l[6144 - param0] : ge.field_l[-6144 + param0];
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = 1;
          while (param0 > 1) {
            if ((param0 & 1) != 0) {
              var3_int = var3_int * param2;
            }
            param0 = param0 >> 1;
            param2 = param2 * param2;
          }
          if (param1 >= -29) {
            j.a(-40, -118);
          }
          if (param0 != 1) {
            return var3_int;
          }
          stackIn_13_0 = param2 * var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "j.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static mi a(ml param0, int param1, byte param2, nf param3, int param4, int param5, int param6) {
        mi var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        mi stackIn_2_0 = null;
        mi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = 117 % ((param2 + 43) / 50);
          var7 = (mi) (uh.field_n.c(true));
          if (var7 == null) {
            stackIn_2_0 = new mi(param6, param4, param5, param1, param0, param3);
            return stackIn_2_0;
          }
          var7.a(-104, param6, param1, param5, param4, param3, param0);
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("j.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void b(int param0) {
        try {
          if (null != pg.field_f) {
            try {
              pg.field_f.a(0L, -101);
              pg.field_f.a((byte) -53, df.field_z.field_g, df.field_z.field_j, 24);
            } catch (Exception exception) {
            }
          }
          int var1 = 125 / ((param0 - 27) / 38);
          df.field_z.field_g = df.field_z.field_g + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        nj.field_c = 0;
        if (param0) {
          j.a(121, 53, 31);
        }
        ef.field_r = true;
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var1 = ch.field_a;
          synchronized (var1) {
            hg.field_b = hg.field_b + 1;
            vk.field_u = gn.field_b;
            if (0 > ub.field_b) {
              for (var2 = 0; var2 < 112; var2++) {
                ri.field_b[var2] = false;
              }
              ub.field_b = go.field_g;
            } else {
              while (ub.field_b != go.field_g) {
                var2 = dk.field_d[go.field_g];
                go.field_g = 1 + go.field_g & 127;
                if (var2 >= 0) {
                  ri.field_b[var2] = true;
                  continue;
                }
                ri.field_b[~var2] = false;
              }
            }
            gn.field_b = pi.field_a;
            if (param0 != 24) {
              field_e = (String) null;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "j.B(" + param0 + ')');
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        String var11 = null;
        try {
          var6_int = param0.field_n + param2;
          var7 = param0.field_j + param3;
          kh.a(param0.field_v, var6_int, var7, param0.field_k, 83);
          if (param0.d(-2116)) {
            oj.a(-32171, var7 + 2, var6_int + 2, -4 + param0.field_k, param0.field_v - 4);
          }
          de.h(var6_int, var7, -2 + (var6_int + param0.field_v), param0.field_k + var7);
          var8 = this.field_d.field_P.g(126);
          if (var8 != null) {
            var9 = var8.toString();
            this.field_d.field_Q.a(var9, var6_int + 2, -1 + (this.field_d.field_Q.field_C + param0.field_k >> 1) + var7, 10000536, -1);
            if (this.field_d.d(-2116) &&
              var9.startsWith(this.field_d.field_D)) {
              var10 = this.field_d.field_Q.b(this.field_d.field_D);
              de.e(var6_int + 2, 2 + var7, var10, -4 + param0.field_k, 2188450, 100);
            }
          }
          de.a();
          if (param1 != 5592405) {
            var11 = (String) null;
            j.a(false, (String) null, true, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("j.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    j(ti param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "j.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, String param1, boolean param2, boolean param3) {
        try {
          hk.d(-24225);
          p.field_b.f(-117);
          if (param3) {
            j.a(-101, 37, 87);
          }
          wh.field_f = new e(ge.field_g, (String) null, hk.field_s, param0, param2);
          g.field_e = new no(p.field_b, wh.field_f);
          p.field_b.b(g.field_e, 15637);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "j.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_c = "Book of Cogs";
        field_e = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_g = -1;
        field_b = "Flame spells focus on explosions and fire-based mayhem.";
    }
}
