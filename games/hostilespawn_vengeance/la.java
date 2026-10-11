/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends ca {
    static bd field_e;
    static String field_i;
    private String field_j;
    static int field_g;
    static bd field_h;
    private String field_f;

    final static void a(int param0, String param1, byte param2) {
        int var3_int = 0;
        try {
          rj.field_K = false;
          if (param2 < 41) {
            field_h = (bd) null;
          }
          eh.field_e = false;
          if (null != jj.field_d) {
            if (!jj.field_d.field_F) {
              return;
            }
            var3_int = 1;
            if (8 == param0) {
              if (!li.field_o) {
                param1 = de.field_m;
              } else {
                param1 = ti.field_i;
              }
              param0 = 2;
              ib.field_e.a(rf.field_e, 10000536);
            }
            if (10 == param0) {
              var3_int = 0;
              fe.a(true);
            }
            if (var3_int != 0) {
              if (rj.field_K) {
                param1 = vg.a(new String[]{param1}, 21, ck.field_o);
              }
              if (md.field_i) {
                param1 = jm.field_h;
              }
              jj.field_d.a(param0, 17, param1);
            }
            if (param0 != 256 &&
              param0 != 10 &&
              !li.field_o) {
              ib.field_e.a(false);
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "la.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = HostileSpawn.field_I ? 1 : 0;
          try {
            if (al.field_T) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (a.a("getcookies", param0, param1 - 10419));
              var4 = cj.a(var3, -44, ';');
              if (param1 != 10295) {
                la.b(-103);
              }
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_19_0 = (param0.getParameter("tuhstatbut") != null);
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref2;
            stackIn_22_1 = new StringBuilder().append("la.I(");
            if (param0 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        if (param0 != 19659) {
          return;
        }
        if (uj.field_m != null) {
          uj.field_m.h();
          if (eb.field_e != null) {
            eb.field_e.h();
            return;
          }
          return;
        }
        if (eb.field_e == null) {
          return;
        }
        eb.field_e.h();
    }

    final void a(vi param0, int param1) {
        try {
          param0.a(120, this.field_j);
          if (param1 >= -94) {
            field_g = -36;
          }
          param0.a((byte) -119, this.field_f);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "la.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        kb.field_b = de.field_k[param1];
        u.field_j = gg.field_C[param1];
        if (param0 == -29828) {
          ad.field_b = gm.field_k[param1];
          return;
        }
        java.applet.Applet var3 = (java.applet.Applet) null;
        la.a((java.applet.Applet) null, 68);
        ad.field_b = gm.field_k[param1];
    }

    final static void a(int param0, int param1, pg param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var21 = HostileSpawn.field_I ? 1 : 0;
        try {
          var6_int = (param0 - param4 << 8) / param2.field_i;
          var7 = (param4 << 8) + var6_int * param2.field_c;
          param5 = param5 + param2.field_b;
          param3 = param3 + param2.field_c;
          var8 = si.field_e * param5 + param3;
          var9 = 0;
          var10 = param2.field_f;
          var11 = param2.field_a;
          var12 = -var11 + si.field_e;
          if (param5 < si.field_j) {
            var14 = si.field_j - param5;
            var10 = var10 - var14;
            var9 = var9 + var14 * var11;
            param5 = si.field_j;
            var8 = var8 + var14 * si.field_e;
          }
          var13 = 0;
          if (si.field_a < var10 + param5) {
            var10 = var10 - (-si.field_a + (param5 + var10));
          }
          if (param3 < si.field_b) {
            var14Lifetime1 = si.field_b - param3;
            param3 = si.field_b;
            var11 = var11 - var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var7 = var7 + var14Lifetime1 * var6_int;
            var13 = var13 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
          }
          if (si.field_l < var11 + param3) {
            var14Lifetime2 = -si.field_l + (param3 + var11);
            var12 = var12 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
          }
          if (0 < var11 &&
            var10 > 0) {
            var14Lifetime3 = 75 / ((45 - param1) / 60);
            for (param5 = -var10; 0 > param5; param5++) {
              var15 = var7;
              for (param3 = -var11; 0 > param3; param3++) {
                var16 = var15 >> 8;
                var15 = var15 + var6_int;
                var17 = 256 - var16;
                if (var16 < 0) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var18 = param2.field_k[255 & param2.field_j[incrementValue$0]];
                  if (var18 != 0) {
                    if (var16 > 255) {
                      si.field_i[var8] = var18;
                    } else {
                      var19 = si.field_i[var8];
                      var20 = var16 * (var18 & 16711935) + var17 * (var19 & 16711935) >> 8 & 16711935;
                      si.field_i[var8] = var20 + (ua.a(16711749, var16 * ua.a(65280, var18) + ua.a(var19, 65280) * var17) >> 8);
                    }
                  }
                  var8++;
                }
              }
              var8 = var8 + var12;
              var9 = var9 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("la.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final bl a(boolean param0) {
        if (param0) {
          field_i = (String) null;
          return uk.field_a;
        }
        return uk.field_a;
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
          field_h = (bd) null;
          return ge.field_d[2047 & param0];
        }
        return ge.field_d[2047 & param0];
    }

    final static s b(boolean param0) {
        if (!param0) {
          return new s(jm.a((byte) 93), hm.c(8));
        }
        field_h = (bd) null;
        return new s(jm.a((byte) 93), hm.c(8));
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -62) {
          field_h = (bd) null;
          field_h = null;
          field_i = null;
          return;
        }
        field_h = null;
        field_i = null;
    }

    la(String param0, String param1) {
        try {
          this.field_f = param1;
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "la.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "If you have an account, log in to start at any level you've reached.";
    }
}
