/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends hl {
    private String field_n;
    private String field_o;
    static int field_m;
    static String field_l;

    final void a(ec param0, byte param1) {
        if (param1 >= -5) {
            return;
        }
        try {
            param0.a(2, this.field_o);
            param0.a(this.field_n, (byte) 101);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "vl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String c(int param0) {
        if (ql.field_f != ol.field_i) {
          if (ql.field_f == wd.field_d) {
            return bf.field_o;
          } else {
            if (param0 == -29455) {
              if (!im.field_b.b(36)) {
                return bf.field_o;
              } else {
                return co.field_C;
              }
            } else {
              vl.a(32, (byte) 15);
              if (!im.field_b.b(36)) {
                return bf.field_o;
              } else {
                return co.field_C;
              }
            }
          }
        } else {
          return ho.field_i;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 > -51) {
            vl.a(-115, (byte) 61);
        }
    }

    final static q[] d(int param0) {
        q[] var1;
        int var2;
        int var3;
        var3 = DungeonAssault.field_K;
        var1 = new q[dk.field_d];
        var2 = 0;
        L0: while (true) {
          if (dk.field_d <= var2) {
            if (param0 > -62) {
              vl.c(-93);
              sb.a(500);
              return var1;
            } else {
              sb.a(500);
              return var1;
            }
          } else {
            var1[var2] = new q(ce.field_x, tb.field_i, hg.field_t[var2], fe.field_g[var2], jc.field_f[var2], jn.field_k[var2], ub.field_q[var2], uo.field_b);
            var2++;
            continue L0;
          }
        }
    }

    final fd b(int param0) {
        int var2 = -64 / ((param0 - -56) / 41);
        return pe.field_j;
    }

    final static void a(int param0, byte param1) {
        int[] var3;
        L0: {
          if (!ed.c(true)) {
            if (param0 <= gm.field_d.field_K) {
              return;
            } else {
              gm.field_d.field_K = param0;
              ac.field_B.d((byte) -78, 72);
              ac.field_B.a(6, gm.field_d.field_K);
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (param1 != -49) {
          var3 = (int[]) null;
          vl.a(105, 115, (int[]) null);
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -58) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            L2: {
              if (-1 == (param2[param0 >> 15042597] & 1 << (param0 & 31) ^ -1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vl.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    vl(String param0, String param1) {
        try {
            this.field_o = param0;
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "vl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = -1;
        field_l = "This target is much less powerful than you, and is <%0>% more likely to wake.<br>(Renown gambled: <%1>)";
    }
}
