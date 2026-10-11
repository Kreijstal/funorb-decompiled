/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf extends ql {
    static int[] field_d;
    static pg[] field_g;
    static bd[] field_i;
    static int[] field_e;
    static int[] field_f;
    static boolean field_h;

    final void b(byte param0) {
        int var2;
        if (vg.field_e[0].field_a != 1) {
          if (vg.field_e[1].field_a == 1 &&
            !vg.field_e[1].a((byte) -121)) {
            vg.field_e[1].field_a = 0;
            var2 = 52 / ((-48 - param0) / 38);
            if (vg.field_e[2].field_a == 1) {
              vg.field_e[2].e(-118);
            }
            if (vg.field_e[3].field_a == 1 &&
              !vg.field_e[3].a((byte) -65)) {
              vg.field_e[3].field_a = 0;
            }
            return;
          }
          var2 = 52 / ((-48 - param0) / 38);
          if (vg.field_e[2].field_a == 1) {
            vg.field_e[2].e(-118);
            if (vg.field_e[3].field_a == 1 &&
              !vg.field_e[3].a((byte) -65)) {
              vg.field_e[3].field_a = 0;
            }
            return;
          }
        } else {
          if (70 >= ng.field_u) {
            if (vg.field_e[1].field_a == 1 &&
              !vg.field_e[1].a((byte) -121)) {
              vg.field_e[1].field_a = 0;
              var2 = 52 / ((-48 - param0) / 38);
              if (vg.field_e[2].field_a == 1) {
                vg.field_e[2].e(-118);
              }
              if (vg.field_e[3].field_a == 1 &&
                !vg.field_e[3].a((byte) -65)) {
                vg.field_e[3].field_a = 0;
              }
              return;
            }
          } else {
            vg.field_e[0].e(-106);
            if (vg.field_e[1].field_a == 1 &&
              !vg.field_e[1].a((byte) -121)) {
              vg.field_e[1].field_a = 0;
              var2 = 52 / ((-48 - param0) / 38);
              if (vg.field_e[2].field_a != 1) {
                if (vg.field_e[3].field_a == 1 &&
                  !vg.field_e[3].a((byte) -65)) {
                  vg.field_e[3].field_a = 0;
                  return;
                }
                return;
              }
              vg.field_e[2].e(-118);
              if (vg.field_e[3].field_a == 1 &&
                !vg.field_e[3].a((byte) -65)) {
                vg.field_e[3].field_a = 0;
              }
              return;
            }
          }
          var2 = 52 / ((-48 - param0) / 38);
          if (vg.field_e[2].field_a == 1) {
            vg.field_e[2].e(-118);
          }
        }
        if (vg.field_e[3].field_a != 1) {
          return;
        }
        if (vg.field_e[3].a((byte) -65)) {
          return;
        }
        vg.field_e[3].field_a = 0;
    }

    final void e(int param0) {
        ih.field_y = new oc[3];
        ih.field_y[0] = new oc(ln.field_a.field_v[0], ln.field_a.field_v[1]);
        ih.field_y[1] = new oc(ln.field_a.field_v[2], ln.field_a.field_v[3]);
        ih.field_y[2] = new oc(ln.field_a.field_v[4], ln.field_a.field_v[5]);
        kd.a(6, 1);
        nh.field_E.a((byte) 46, ih.field_y[0]);
        vg.field_e = new v[4];
        vg.field_e[0] = new v(tm.field_s, -120 + (ti.field_f.field_e * 24 + 50), 24 * (-7 + ti.field_f.field_g) - 20, 200, false);
        vg.field_e[1] = new v(el.field_g, 24 * ih.field_y[0].field_e - 140, ih.field_y[0].field_g * 24, 200, false);
        vg.field_e[2] = new v(im.field_d, 24 + (24 * ih.field_y[1].field_e - 100), -90 + ih.field_y[1].field_g * 24, 200, false);
        vg.field_e[3] = new v(ih.field_z, ih.field_y[2].field_e * 24 + 24 + 40, 40 + 24 * ih.field_y[2].field_g, 200, false);
        vg.field_e[param0].field_a = 1;
    }

    final boolean a(oj param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ha.field_t != 0 &&
            param0.field_j.a(ih.field_y[2], 108)) {
            return true;
          }
          if (param1 != -5) {
            this.c(-111);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("uf.P(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(am param0, am param1, byte param2) {
        try {
          if (param0.field_f != null) {
            param0.b(-124);
          }
          param0.field_g = param1;
          param0.field_f = param1.field_f;
          int var3_int = 105 % ((-18 - param2) / 33);
          param0.field_f.field_g = param0;
          param0.field_g.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "uf.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String a(boolean param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0) {
          am var3 = (am) null;
          uf.a((am) null, (am) null, (byte) 16);
          var2 = ha.field_t;
          if (var2 != 6) {
            if (var2 == 9) {
              return sm.field_a;
            }
            if (var2 == 0) {
              return wk.field_f;
            }
            return null;
          }
          return vb.field_Fb;
        }
        var2Lifetime1 = ha.field_t;
        if (var2Lifetime1 != 6) {
          if (var2Lifetime1 == 9) {
            return sm.field_a;
          }
          if (var2Lifetime1 == 0) {
            return wk.field_f;
          }
          return null;
        }
        return vb.field_Fb;
    }

    public uf() {
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param5 >= param4) {
            return;
          }
          if (param1 <= param5 + 1) {
            return;
          }
          if (5 + param5 < param1 &&
            param0 != param6) {
            var7_int = (1 & (param6 & param0)) + (param6 >> 1) + (param0 >> 1);
            var8 = param5;
            var9 = param0;
            var10 = param6;
            for (var11 = param5; param1 > var11; var11++) {
              var12 = db.field_s[var11];
              if (param3) {
                stackIn_24_0 = qa.field_d[var12];
              } else {
                stackIn_24_0 = hi.field_n[var12];
              }
              var13 = stackIn_24_0;
              if (var13 > var7_int) {
                db.field_s[var11] = db.field_s[var8];
                if (var13 < var9) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                db.field_s[incrementValue$0] = var12;
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            uf.a(param0, var8, param2, param3, param4, param5, var9);
            uf.a(var10, param1, param2 ^ 0, param3, param4, var8, param6);
            return;
          }
          for (var7_intLifetime1 = param1 - 1; param5 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param5; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = db.field_s[var8Lifetime1];
              var10Lifetime1 = db.field_s[var8Lifetime1 + 1];
              if (bl.a(var9Lifetime1, param3, (byte) -72, var10Lifetime1)) {
                db.field_s[var8Lifetime1] = var10Lifetime1;
                db.field_s[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var7), "uf.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
          field_f = (int[]) null;
          ti.a(234, (byte) 73, 21);
          return;
        }
        ti.a(234, (byte) 73, 21);
    }

    final void d(int param0) {
        int var3;
        oc var4;
        int var3Lifetime1;
        int var3Lifetime2;
        var4 = new oc(mm.field_m[0].field_j);
        if (param0 != -1) {
          return;
        }
        if (0 == ha.field_t) {
          super.d(param0 + 0);
          return;
        }
        if (vg.field_e[1].field_a != 0) {
          var3 = ih.a(var4, (byte) -105, ih.field_y[1]);
          if (2 > var3) {
            ca.a(0.5 + (double)ih.field_y[1].field_e, 1, 1.0 + (double)ih.field_y[1].field_g, true, 64);
            kd.a(0, 1);
            nh.field_E.a((byte) 46, ih.field_y[0]);
            vg.field_e[2].field_a = 1;
          }
          if (0 != vg.field_e[3].field_a) {
            return;
          }
          if (Math.abs(var4.field_e - ih.field_y[2].field_e) >= 2) {
            return;
          }
          if (Math.abs(var4.field_g - ih.field_y[2].field_g) >= 2) {
            return;
          }
          vg.field_e[3].field_a = 1;
          return;
        }
        var3Lifetime1 = ih.a(var4, (byte) -82, ih.field_y[0]);
        if (var3Lifetime1 < 2) {
          kd.a(9, 1);
          vg.field_e[1].field_a = 1;
          nh.field_E.a((byte) 46, ih.field_y[1]);
        }
        var3Lifetime2 = ih.a(var4, (byte) -105, ih.field_y[1]);
        if (2 > var3Lifetime2) {
          ca.a(0.5 + (double)ih.field_y[1].field_e, 1, 1.0 + (double)ih.field_y[1].field_g, true, 64);
          kd.a(0, 1);
          nh.field_E.a((byte) 46, ih.field_y[0]);
          vg.field_e[2].field_a = 1;
        }
        if (0 != vg.field_e[3].field_a) {
          return;
        }
        if (Math.abs(var4.field_e - ih.field_y[2].field_e) >= 2) {
          return;
        }
        if (Math.abs(var4.field_g - ih.field_y[2].field_g) >= 2) {
          return;
        }
        vg.field_e[3].field_a = 1;
        return;
    }

    public static void g(int param0) {
        field_f = null;
        if (param0 == 24) {
          field_g = null;
          field_d = null;
          field_e = null;
          field_i = null;
          return;
        }
        field_i = (bd[]) null;
        field_g = null;
        field_d = null;
        field_e = null;
        field_i = null;
    }

    static {
        int var2 = 0;
        int var0 = 0;
        int var1 = 0;
        int var0Lifetime1;
        int var1Lifetime1;
        field_f = new int[128];
        field_d = new int[128];
        field_e = new int[128];
        field_i = new bd[5];
        for (var2 = 0; field_f.length > var2; var2++) {
          var0 = 1114111;
          var1 = (var0 & 16711935) * ((var2 + 1) * 255 / 128);
          field_f[var2] = ua.a(16711680, -var1 + var0 * ((255 * var2 + 255) / 128)) + ua.a(var1, -16711936) >>> 8;
          field_d[var2] = var2 * 65793;
          var0Lifetime1 = 40960;
          var1Lifetime1 = (255 + var2 * 255) / 128 * (var0Lifetime1 & 16711935);
          field_e[var2] = ua.a(var1Lifetime1, -16711936) + ua.a(var0Lifetime1 * (255 * (var2 + 1) / 128) - var1Lifetime1, 16711680) >>> 8;
        }
        field_h = false;
    }
}
