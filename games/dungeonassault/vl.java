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
        if (ql.field_f == ol.field_i) {
          return ho.field_i;
        }
        if (ql.field_f == wd.field_d) {
          return bf.field_o;
        }
        if (param0 != -29455) {
          vl.a(32, (byte) 15);
          if (im.field_b.b(36)) {
            return co.field_C;
          }
          return bf.field_o;
        }
        if (im.field_b.b(36)) {
          return co.field_C;
        }
        return bf.field_o;
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 > -51) {
          vl.a(-115, (byte) 61);
        }
    }

    final static q[] d(int param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        q[] var1 = new q[dk.field_d];
        for (var2 = 0; dk.field_d > var2; var2++) {
          var1[var2] = new q(ce.field_x, tb.field_i, hg.field_t[var2], fe.field_g[var2], jc.field_f[var2], jn.field_k[var2], ub.field_q[var2], uo.field_b);
        }
        if (param0 <= -62) {
          sb.a(500);
          return var1;
        }
        vl.c(-93);
        sb.a(500);
        return var1;
    }

    final fd b(int param0) {
        int var2 = -64 / ((param0 + 56) / 41);
        return pe.field_j;
    }

    final static void a(int param0, byte param1) {
        if (!ed.c(true)) {
          if (!(param0 > gm.field_d.field_K)) {
            return;
          }
          gm.field_d.field_K = param0;
          ac.field_B.d((byte) -78, 72);
          ac.field_B.a(6, gm.field_d.field_K);
        }
        if (param1 == -49) {
          return;
        }
        int[] var3 = (int[]) null;
        vl.a(105, 115, (int[]) null);
    }

    final static boolean a(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -58) {
            field_l = (String) null;
          }
          stackIn_5_0 = ((param2[param0 >> 5] & 1 << (param0 & 31)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vl.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
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
