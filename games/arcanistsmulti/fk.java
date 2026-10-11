/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends pg {
    static long field_k;
    static String field_i;
    kd field_m;
    static qb[] field_g;
    pg field_n;
    int field_l;
    static int[] field_h;
    static String field_j;

    public static void a(int param0) {
        if (param0 != -1333592895) {
          field_j = (String) null;
        }
        field_i = null;
        field_j = null;
        field_g = null;
        field_h = null;
    }

    final static qb[] a(int param0, int param1, int param2) {
        if (param1 <= 27) {
          qb var4 = (qb) null;
          fk.a((nf) null, -111, (ll) null, 35, (byte) -40, (qb) null);
        }
        return ql.a(1, (byte) 127, param2, param0);
    }

    final static void d(int param0) {
        if (param0 != -11) {
          field_h = (int[]) null;
        }
        if (fj.field_j == 10 ||
          !ke.g(-115)) {
          pa.b((byte) 108);
          fj.field_j = 11;
        }
        ii.field_f = true;
    }

    final static boolean a(nf param0, int param1, ll param2, int param3, byte param4, qb param5) {
        int var19 = 0;
        int var20 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int var21 = 0;
        int[] var23 = null;
        int[] var25 = null;
        byte[] var27 = null;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param3 = param3 + param5.field_x;
          param1 = param1 + param5.field_o;
          ce.field_k = 0;
          var6_int = 0;
          di.field_m = 0;
          jo.field_b = false;
          if (param4 != -1) {
            field_k = -23L;
          }
          var7 = param5.field_q;
          var8 = param5.field_y;
          if (param3 < param0.field_y &&
            -var7 < param3) {
            if (param1 >= param0.field_H) {
              return false;
            }
            if (-var8 >= param1) {
              return false;
            }
            stackIn_16_0 = (0 < param3) ? param3 : 0;
            var9 = stackIn_16_0;
            var10 = param3 + var7;
            if (param0.field_y < var10) {
              var10 = param0.field_y;
            }
            stackIn_22_0 = (param1 <= 0) ? 0 : param1;
            var11 = stackIn_22_0;
            var12 = param1 + var8;
            if (param0.field_y < var12) {
              var12 = param0.field_y;
            }
            var10 = var10 - var9;
            var12 = var12 - var11;
            if ((var12 & 1) > 0) {
              var12--;
            }
            if ((1 & var10) > 0) {
              var10--;
            }
            var13 = (var9 >> 1) + (var11 >> 1) * param0.field_hb;
            var14 = param0.field_hb - (var10 >> 1);
            var15 = (-param1 + var11) * param5.field_q - param3 + var9;
            var16 = var7 - var10;
            var16 = var16 + var7;
            var27 = param2.field_m;
            var25 = param5.field_A;
            var23 = var25;
            var18 = var23;
            for (var19 = var12; var19 > 0; var19 -= 2) {
              for (var20 = var10; var20 > 0; var20 -= 2) {
                if (var27[var13] != 0) {
                  if (var25[var15] != 0) {
                    ce.field_k = ce.field_k + (var12 + (var11 - var19));
                    di.field_m = di.field_m + (-var20 + (var10 + var9));
                    var6_int++;
                    if (-1 == var27[var13]) {
                      jo.field_b = true;
                    }
                  }
                  if (var18[var15 + 1] != 0) {
                    ce.field_k = ce.field_k + (-var19 + var11 + var12);
                    di.field_m = di.field_m + (-var20 + (var9 + var10 + 1));
                    if (var27[var13] == -1) {
                      jo.field_b = true;
                    }
                    var6_int++;
                  }
                  if (0 != var18[var15 + var7]) {
                    ce.field_k = ce.field_k + (1 - var19 + (var12 + var11));
                    di.field_m = di.field_m + (-var20 + var10 + var9);
                    var6_int++;
                    if (var27[var13] == -1) {
                      jo.field_b = true;
                    }
                  }
                  if (var18[1 + (var15 + var7)] != 0) {
                    di.field_m = di.field_m + (-var20 + (var10 + (var9 + 1)));
                    ce.field_k = ce.field_k + (1 + (-var19 + (var12 + var11)));
                    var6_int++;
                    if (-1 == var27[var13]) {
                      jo.field_b = true;
                    }
                  }
                }
                var13++;
                var15 += 2;
              }
              var13 = var13 + var14;
              var15 = var15 + var16;
              if (var13 >= param2.field_m.length) {
                return false;
              }
            }
            if (var6_int <= 0) {
              return false;
            }
            di.field_m = di.field_m / var6_int;
            ce.field_k = ce.field_k / var6_int;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_67_0 = var6;
          stackIn_67_1 = new StringBuilder().append("fk.A(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final static ll[] c(int param0) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        ll[] var1 = new ll[h.field_J];
        for (var2 = param0; h.field_J > var2; var2++) {
          var1[var2] = new ll(pb.field_g, gn.field_a, hl.field_l[var2], be.field_d[var2], jg.field_p[var2], ho.field_i[var2], ln.field_I[var2], ph.field_c);
        }
        dk.a(-18229);
        return var1;
    }

    final static void a(qb param0, int param1) {
        try {
          if (param1 != -23095) {
            qb var3 = (qb) null;
            fk.a((qb) null, -12);
          }
          ec.a(65280);
          de.a(param0.field_A, param0.field_n, param0.field_w);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "fk.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ab var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        cm var11 = null;
        fe var12 = null;
        ab var13 = null;
        fe var14 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 != -20) {
            return;
          }
          var13 = df.field_z;
          var2 = var13.e((byte) 54);
          if (var2 == 0) {
            var10 = la.b((byte) 12);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var13;
            var6 = ((wk) ((Object) var5)).e((byte) -100);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((wk) ((Object) var5)).d(-10674);
            }
            var12 = (fe) (i.field_e.b(param0 ^ -12637));
            if (var12 == null) {
              ka.b(false);
              return;
            }
            var12.field_l = true;
            var12.field_i = var3;
            var12.a(true);
            return;
          }
          if (var2 == 1) {
            var11 = (cm) (cc.field_e.b(12623));
            if (var11 == null) {
              ka.b(false);
              return;
            }
            var11.a(true);
          } else {
            if (var2 != 2) {
              jh.a((Throwable) null, "A1: " + nn.g((byte) -25), (byte) 20);
              ka.b(false);
            } else {
              var14 = (fe) (i.field_e.b(12623));
              if (var14 == null) {
                ka.b(false);
                return;
              }
              var14.field_i = la.b((byte) 12);
              var14.field_l = true;
              var14.a(true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "fk.G(" + param0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2) {
        try {
          java.net.URL var3 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param0.getCodeBase(), param2);
              var3 = nm.a(param0, var3, -31843);
              jh.a(var3.toString(), param0, true, (byte) -109);
              if (param1) {
                field_i = (String) null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var3_ref2;
            stackIn_7_1 = new StringBuilder().append("fk.C(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = an.field_g;
          var3 = me.field_I;
          var4 = pg.field_c.field_Z.a(param1, 500);
          var5 = 6 + pg.field_c.field_Z.c(param1, 500);
          var6 = 2 + var4 * ga.field_r;
          var7 = ih.a(var2_int, var5, 12, 246);
          var8 = ql.a(param0 + 10, 20, var6, var3);
          de.a(var7, var8, var5, var6, 0);
          de.d(var7 + 1, 1 + var8, -2 + var5, -2 + var6, 16777088);
          pg.field_c.field_Z.a(param1, var7 + 3, 1 + (var8 + oc.field_i - pg.field_c.field_Z.field_C), 500, 1000, 0, -1, param0, 0, ga.field_r);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "fk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    fk(kd param0, pg param1) {
        try {
          this.field_m = param0;
          this.field_l = param0.f();
          this.field_n = param1;
          this.field_m.c(si.field_l * this.field_l + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "fk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Down at the bottom-right of the screen you will see the map. You can use this to scan for your enemies and get a general feel of the arena. Click on it to move the view quickly.";
        field_h = new int[]{58, 59, 60};
        field_j = "Change display name";
    }
}
