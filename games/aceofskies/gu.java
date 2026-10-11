/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu {
    private String field_b;
    static vd[] field_a;
    static ll[] field_c;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          gu.a(false);
        }
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    gu(String param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "gu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        Object var3 = null;
        ht var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        gk var13 = null;
        int var14 = 0;
        dl var15 = null;
        int[][] var19 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var3 = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          var15 = nm.field_c;
          var2 = var15.g(param0 - 90);
          var3_ref = (ht) (an.field_b.d(268435455));
          while (var3_ref != null) {
            if (~var2 != ~var3_ref.field_l) {
              var3_ref = (ht) (an.field_b.b((byte) 103));
              continue;
            }
            break;
          }
          if (param0 != 4) {
            var13 = (gk) null;
            gu.a(-24, (gk) null, -121);
          }
          if (var3_ref == null) {
            te.b(true);
            return;
          }
          var4 = var15.g(param0 + 117);
          if (var4 != 0) {
            var5 = var3_ref.field_f;
            mb.field_t[0] = fj.field_a;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              mb.field_t[var6_int] = var15.h(-17883);
            }
            ud.a(var4, var5, 2);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              ju.a(965924047, var15);
              if (var6_intLifetime1 != 0) {
                o.a(fs.field_c, var6_intLifetime1, 54, tj.field_o, ld.field_a, gl.field_b);
              } else {
                o.a(fs.field_c, var6_intLifetime1, 56, tj.field_o, ld.field_a, gl.field_b);
              }
            }
            eu.a(var5, true);
            var6 = new String[2][var5];
            var19 = new int[2][var5 * 4];
            var8 = os.field_w;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = uf.field_d[var9];
              var6[0][var10] = mb.field_t[var11];
              var19[0][var10 * 4] = js.field_c[var11];
              var19[0][1 + var10 * 4] = hg.field_C[var11];
              var19[0][var10 * 4 + 2] = qd.field_p[var11];
              var19[0][3 + 4 * var10] = dd.field_c[var11];
              if (fd.a(mb.field_t[var11], (byte) -6) &&
                qd.field_p[var11] + (hg.field_C[var11] + dd.field_c[var11]) == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = uf.field_d[var9Lifetime1 + var5];
              var6[1][var14] = mb.field_t[var11Lifetime1];
              var19[1][var14 * 4] = js.field_c[var11Lifetime1];
              var19[1][var14 * 4 + 1] = hg.field_C[var11Lifetime1];
              var19[1][2 + var14 * 4] = qd.field_p[var11Lifetime1];
              var19[1][3 + var14 * 4] = dd.field_c[var11Lifetime1];
              if (fd.a(mb.field_t[var11Lifetime1], (byte) -6) &&
                hg.field_C[var11Lifetime1] + qd.field_p[var11Lifetime1] + dd.field_c[var11Lifetime1] == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var9Lifetime1++;
              var14++;
            }
          }
          var3_ref.c(param0 - 128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "gu.A(" + param0 + ')');
        }
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 4) {
            field_c = (ll[]) null;
          }
          stackIn_3_0 = this.field_b.equals(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gu.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static ml a(int param0, gk param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        ml stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param1.d(param0, -2);
          var3 = var4;
          if (var4 == null) {
            stackIn_2_0 = null;
            return (ml) (stackIn_2_0);
          }
          if (param2 != 16652) {
            field_a = (vd[]) null;
          }
          stackIn_6_0 = new ml(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("gu.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(java.applet.Applet param0, byte param1) {
        try {
          jt.a("jagex-last-login-method", this.field_b, 31536000L, param0, 0);
          int var3_int = 79 / ((param1 - 77) / 44);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "gu.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
