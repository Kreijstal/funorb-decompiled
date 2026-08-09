/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends pg {
    static String field_h;
    int[] field_g;
    static String field_j;
    static String field_i;

    final static void a(int param0, eg param1, eg param2, eg param3) {
        qb var17 = null;
        ll[] var5 = null;
        ll[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        ll[] var14 = null;
        int var11_int = 0;
        qb var15 = null;
        qb var18 = null;
        qb var11 = null;
        qb var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
            fk.field_g = qe.a(param3, "frame_top", "commonui", 87);
            vi.field_E = qe.a(param3, "frame_bottom", "commonui", 118);
            ci.field_e = fj.a("commonui", -22612, param3, "jagex_logo_grey");
            af.field_Jb = qe.a(param3, "button", "commonui", 86);
            qk.field_lb = nl.a((byte) 31, param3, "validation", "commonui");
            vc.field_e = (dj) ((Object) rm.a("arezzo12", param1, "commonui", -119, param3));
            ia.field_c = (dj) ((Object) rm.a("arezzo14", param1, "commonui", -120, param3));
            go.field_k = (dj) ((Object) rm.a("arezzo14bold", param1, "commonui", -123, param3));
            var17 = new qb(param2.a("", "button.gif", -1), (java.awt.Component) ((Object) on.field_c));
            af.a("dropdown", "commonui", 19412, param3);
            var5 = pk.a("commonui", 0, "screen_options", param3);
            fg.field_k = new ll[4];
            oa.field_d = new ll[4];
            qj.field_j = new ll[4];
            var6 = new ll[][]{oa.field_d, fg.field_k, qj.field_j};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            for (var8 = 1; var8 < var19.length; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_m[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = 4767999;
            if (param0 < 71) {
                aa.b(false);
            }
            for (var9 = 0; -4 < (var9 ^ -1); var9++) {
                var14 = var6[var9];
                ll[] var10 = var14;
                for (var11_int = 0; var14.length > var11_int; var11_int++) {
                    var14[var11_int] = ef.a(var19[var11_int], (byte) -59, var5[var9]);
                }
            }
            var9 = var17.field_y;
            ec.a(65280);
            var17.a();
            de.e(0, 0, de.field_e, de.field_j);
            var15 = new qb(var9, var9);
            var18 = var15;
            var18.a();
            var17.h(0, 0);
            var11 = new qb(var9, var9);
            var11.a();
            var17.h(-var17.field_q + var9, 0);
            var12 = new qb(-(var9 * 2) + var17.field_q, var9);
            var12.a();
            var17.h(-var9, 0);
            oo.c(-15405);
            af.field_Jb = new qb[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static p a(Throwable param0, String param1) {
        p var2 = null;
        if (!(param0 instanceof p)) {
            var2 = new p(param0, param1);
        } else {
            var2 = (p) ((Object) param0);
            var2.field_i = var2.field_i + ' ' + param1;
        }
        return var2;
    }

    public static void b(boolean param0) {
        field_j = null;
        if (param0) {
            field_i = (String) null;
        }
        field_i = null;
        field_h = null;
    }

    final static uj[] a(dl param0, byte param1) {
        uj[] stackIn_4_0 = null;
        uj[] stackIn_10_0 = null;
        uj[] stackIn_13_0 = null;
        uj[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        uj[] var4 = null;
        int var5 = 0;
        uj var6 = null;
        int var7 = 0;
        og var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!param0.a((byte) 46)) {
              stackIn_4_0 = new uj[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = param0.b(-27886);
              L1: while (true) {
                if (var8.field_e != 0) {
                  if (-3 != (var8.field_e ^ -1)) {
                    var10 = (int[]) (var8.field_g);
                    var9 = var10;
                    var3 = var9;
                    if (param1 >= 59) {
                      var4 = new uj[var10.length >> 860439266];
                      var5 = 0;
                      L2: while (true) {
                        if (var4.length <= var5) {
                          stackIn_18_0 = (uj[]) (var4);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var6 = new uj();
                          var4[var5] = var6;
                          var6.field_g = var3[var5 << 1239147010];
                          var6.field_e = var3[1 + (var5 << -2128016542)];
                          var6.field_a = var3[(var5 << 1064242338) - -2];
                          var6.field_d = var3[(var5 << -1133656958) + 3];
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_13_0 = (uj[]) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_10_0 = new uj[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  ao.a(10L, 1);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("aa.D(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_18_0;
            }
          }
        }
    }

    private aa() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Account created successfully!";
        field_j = "You have no wands available.";
        field_i = "Staff impersonation";
    }
}
