/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends rq {
    static int field_f;
    static int field_e;
    static long field_g;

    final void a(boolean param0, int param1) {
        if (param1 != 20186) {
          return;
        }
        this.field_b.a(true, true);
    }

    oc(aw param0) {
        super(param0);
    }

    final static void a(ah param0, boolean param1) {
        int var2_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        nm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ah var11 = null;
        cb var12 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          for (var2_int = 0; db.field_l > var2_int; var2_int++) {
            var11 = aa.field_a[var2_int];
            if (var11 != null) {
              var4 = var11.field_m + param0.field_m;
              if (wn.a(var11.field_z, var4, -104, param0.field_C, var11.field_C, param0.field_z)) {
                var5 = -var11.field_C + param0.field_C;
                var6 = param0.field_z - var11.field_z;
                if (var5 == 0) {
                  var5 = -1 + (2 & iw.field_b << 1);
                }
                if (var6 == 0) {
                  var6 = ((1 & iw.field_b) << 1) - 1;
                }
                var7 = (int)Math.round(Math.sqrt((double)((float)var5 * (float)var5 + (float)var6 * (float)var6)));
                if (var4 > var7) {
                  var8 = var5 * (-var7 + var4) / var7;
                  var9 = (var4 - var7) * var6 / var7;
                  param0.field_C = param0.field_C + var8;
                  param0.field_z = param0.field_z + var9;
                  var11.field_C = var11.field_C - var8;
                  var11.field_z = var11.field_z - var9;
                }
              }
            }
          }
          var12 = new cb(is.field_c);
          var3 = (nm) (var12.b((byte) -80));
          if (param1) {
            return;
          }
          while (var3 != null) {
            var4Lifetime1 = (var3.field_m << 8) + param0.field_m;
            if (wn.a(param0.field_z, var4Lifetime1, -114, var3.field_q, param0.field_C, var3.field_l)) {
              var5Lifetime1 = -var3.field_q + param0.field_C;
              if (var5Lifetime1 == 0) {
                var5Lifetime1 = -1 + (2 & iw.field_b << 1);
              }
              var6Lifetime1 = -var3.field_l + param0.field_z;
              if (var6Lifetime1 == 0) {
                var6Lifetime1 = -1 + ((iw.field_b & 1) << 1);
              }
              var7Lifetime1 = (int)Math.round(Math.sqrt((double)((float)var6Lifetime1 * (float)var6Lifetime1 + (float)var5Lifetime1 * (float)var5Lifetime1)));
              if (var4Lifetime1 > var7Lifetime1) {
                var8Lifetime1 = var5Lifetime1 * (-var7Lifetime1 + var4Lifetime1) / var7Lifetime1;
                param0.field_C = param0.field_C + (var8Lifetime1 << 1);
                var9Lifetime1 = (var4Lifetime1 - var7Lifetime1) * var6Lifetime1 / var7Lifetime1;
                param0.field_z = param0.field_z + (var9Lifetime1 << 1);
              }
            }
            var3 = (nm) (var12.b(0));
          }
          if (-param0.field_m + param0.field_C < 6656) {
            param0.field_C = param0.field_C + (26 << 9 + param0.field_m);
          }
          if (-param0.field_m + param0.field_z < 6656) {
            param0.field_z = param0.field_z + (26 << param0.field_m + 9);
          }
          if (param0.field_m + param0.field_C > rj.field_c - 26 << 8) {
            param0.field_C = param0.field_C - (26 << 9 + param0.field_m);
          }
          if (rl.field_k - 26 << 8 < param0.field_m + param0.field_z) {
            param0.field_z = param0.field_z - (26 << 9 + param0.field_m);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < db.field_l; var4Lifetime2++) {
            if (aa.field_a[var4Lifetime2] == null &&
              var4Lifetime2 != 0) {
              aa.field_a[var4Lifetime2] = param0;
              return;
            }
          }
          if (aa.field_a.length > db.field_l) {
            fieldTemp$0 = db.field_l;
            db.field_l = db.field_l + 1;
            aa.field_a[fieldTemp$0] = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("oc.P(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int d(int param0) {
        int var2 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = 0;
          if (param0 != 17079) {
            field_f = -57;
          }
          for (var2 = 0; var2 < 25; var2++) {
            if (wm.field_f[var2]) {
              var1_int++;
            }
          }
          stackIn_10_0 = var1_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "oc.N(" + param0 + ')');
        }
    }

    final static void a(String param0, boolean param1, byte param2) {
        try {
          lc.field_A = true;
          int var3_int = -70 % ((param2 + 39) / 44);
          ih.field_c = param1 ? true : false;
          hc.field_c = new gt(rf.field_a, tq.field_a, param0, pg.field_a, ih.field_c);
          rf.field_a.a((byte) 108, hc.field_c);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "oc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(boolean param0) {
        this.field_b.a(param0, true);
    }

    final boolean b(byte param0) {
        if (param0 > -8) {
          ah var3 = (ah) null;
          oc.a((ah) null, false);
        }
        return true;
    }

    final static boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param1 != 122) {
          oc.d(-55);
        }
        stackIn_8_0 = (param3 <= param2) && (param2 < param6 + param3) && (param5 >= param0) && (param4 + param0 > param5);
        return stackIn_8_0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        pn.field_p[se.field_d] = param3;
        pd.field_q[se.field_d] = se.field_d;
        lj.field_a[se.field_d] = param5;
        if (!(param5 >= qu.field_k)) {
          ab.field_c = param5;
        }
        if (!(kc.field_l >= param5)) {
          field_f = param5;
        }
        jf.field_f[se.field_d] = param1;
        ic.field_c[se.field_d] = param4;
        vi.field_z[se.field_d] = param0;
        int var6 = param0 + param4 + param1;
        if (!param2) {
          String var8 = (String) null;
          oc.a((String) null, false, (byte) 69);
        }
        int var7 = 0 != var6 ? 1000 * param1 / var6 : 0;
        uc.field_c[se.field_d] = var7;
        se.field_d = se.field_d + 1;
        if (ab.field_c > var7) {
          ab.field_c = var7;
        }
        if (var7 > field_f) {
          field_f = var7;
        }
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = 0; param0 > var4; var4++) {
          var6[var4] = param1;
        }
        if (param2 != -1) {
          oc.a(-114, (byte) 68, -4, 84, 1, -123, 101);
        }
        return new String(var3);
    }

    final void a(int param0, int param1, ed param2) {
        try {
          this.field_b.a(param2, 106);
          if (param1 != 18834) {
            field_f = -50;
          }
          this.field_b.h(109, param0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "oc.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 > -71) {
          field_g = 53L;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
          String var5 = (String) null;
          oc.a((String) null, false, (byte) -121);
        }
    }

    static {
        field_e = 1000;
    }
}
