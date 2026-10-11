/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa implements de {
    private qe field_b;
    private int field_d;
    static long field_a;
    private int field_c;

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = StarCannon.field_A;
        try {
          var7 = -40 / ((2 - param2) / 54);
          if (!param4.field_h &&
            !param4.d(true)) {
            stackIn_6_0 = 2188450;
          } else {
            stackIn_6_0 = 3249872;
          }
          var6_int = stackIn_6_0;
          this.field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_k + "</u>", param0 + param4.field_s, param4.field_j + param3, param4.field_i, param4.field_f, var6_int, -1, this.field_d, this.field_c, this.field_b.field_p + this.field_b.field_q);
          if (param4.d(true)) {
            var8 = this.field_b.a(param4.field_k);
            var9 = this.field_b.field_q + this.field_b.field_p;
            var10 = param0 + param4.field_s;
            var11 = param3 + param4.field_j;
            if (this.field_d != 2) {
              if (this.field_d == 1) {
                var10 = var10 + (-var8 + param4.field_i >> 1);
              }
            } else {
              var10 = var10 + (-var8 + param4.field_i);
            }
            if (this.field_c != 2) {
              if (this.field_c == 1) {
                var11 = var11 + (param4.field_f - var9 >> 1);
              }
            } else {
              var11 = var11 + (-var9 + param4.field_f);
            }
            ji.a(var8 + 4, var9, -140110815, 2 + var11, var10 - 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("wa.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static int[] a(byte param0) {
        if (param0 >= -74) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static void a(boolean param0, boolean param1) {
        if (!param0) {
          return;
        }
        ti.field_b.a(0, (byte) -98, 0);
    }

    final static void a(int param0, int param1, int param2, int param3, String[] param4, java.applet.Applet param5) {
        int var8 = 0;
        int var6_int = 0;
        String var7 = null;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = StarCannon.field_A;
        try {
          t.field_q = param5.getParameter("overxgames");
          var6_int = -29 / ((param1 + 30) / 42);
          if (t.field_q == null) {
            t.field_q = "0";
          }
          ii.field_c = param5.getParameter("overxachievements");
          if (ii.field_c == null) {
            ii.field_c = "0";
          }
          var7 = param5.getParameter("currency");
          if (var7 == null) {
            fc.field_c = 2;
          } else {
            if (ba.a(6, (CharSequence) ((Object) var7))) {
              fc.field_c = pd.a((CharSequence) ((Object) var7), 10);
            } else {
              fc.field_c = 2;
            }
          }
          jk.field_l = param3;
          mc.field_c = param2;
          nh.field_i = param0;
          pa.field_I = new hl[param4.length];
          for (var8 = 0; param4.length > var8; var8++) {
            pa.field_I[var8] = new hl(317, 34);
          }
          va.field_t = param4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("wa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        we var4_ref_we = null;
        dg var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        ia var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = StarCannon.field_A;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9 = se.field_p;
          var2 = var9.j(7909);
          var3 = var9.j(7909);
          if (var2 == 0) {
            var4_ref_we = (we) (ma.field_h.c(param0 - 3804));
            if (var4_ref_we == null) {
              ec.a((byte) 27);
              return;
            }
            var5_int = -var9.field_g + il.field_g;
            var11 = var4_ref_we.field_j;
            var10 = var11;
            var6 = var10;
            if (var11.length << 2 < var5_int) {
              var5_int = var11.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.j(7909) << (w.a(var7, 3) << 8));
            }
            var4_ref_we.b(4);
          } else {
            if (var2 == 1) {
              var4 = var9.d((byte) 43);
              var5 = (dg) (vb.field_k.c(param0 ^ 3876));
              while (var5 != null) {
                if (var5.field_k != var3 ||
                  var5.field_f != var4) {
                  var5 = (dg) (vb.field_k.a(-16913));
                  continue;
                }
                break;
              }
              if (var5 == null) {
                ec.a((byte) 27);
                return;
              }
              var5.b(4);
              decompiledFrameRemainder0 = false;
            }
            else {
              hc.a((Throwable) null, "LR1: " + oe.a(59), (byte) 85);
              ec.a((byte) 27);
            }
          }
          if (param0 == -101) {
            return;
          }
          field_a = 71L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "wa.D(" + param0 + ')');
        }
    }

    public wa() {
        this.field_c = 1;
        this.field_d = 1;
        this.field_b = nb.field_c;
    }

    wa(qe param0, int param1, int param2) {
        try {
          this.field_b = param0;
          this.field_d = param1;
          this.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
