/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    static nl field_d;
    static ko field_g;
    static int field_f;
    static dd field_j;
    static int field_c;
    static int field_b;
    wd field_i;
    static int field_e;
    static int[] field_h;
    static String[] field_a;

    final static void a(byte param0, int param1, sj param2, ge param3) {
        try {
          int var6 = 0;
          int var12_int = 0;
          int var13_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_37_0 = null;
          StringBuilder stackIn_37_1 = null;
          String stackIn_38_2 = null;
          StringBuilder stackIn_40_1 = null;
          String stackIn_41_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var5 = 0;
          int var7_int = 0;
          ClassNotFoundException var7 = null;
          SecurityException var7_ref = null;
          NullPointerException var7_ref2 = null;
          Exception var7_ref3 = null;
          Throwable var7_ref4 = null;
          String var8 = null;
          String var9 = null;
          int var10 = 0;
          String[] var11 = null;
          byte[][] var12 = null;
          Class[] var13 = null;
          int var14 = 0;
          int var15 = 0;
          String var16 = null;
          String var17 = null;
          int var18 = 0;
          ho var19 = null;
          byte[][] var20 = null;
          String var21 = null;
          String var22 = null;
          byte[][] var23 = null;
          int var14Lifetime1;
          var15 = Pool.field_O;
          try {
            var19 = new ho();
            var19.field_t = param3.g(-105);
            var19.field_o = param3.b(true);
            var19.field_w = new byte[var19.field_t][][];
            var19.field_r = new int[var19.field_t];
            var19.field_p = new le[var19.field_t];
            var19.field_m = new int[var19.field_t];
            var19.field_n = new le[var19.field_t];
            var5 = 57 % ((param0 + 62) / 55);
            var19.field_q = new int[var19.field_t];
            for (var6 = 0; var6 < var19.field_t; var6++) {
              try {
                var7_int = param3.g(-102);
                if (0 != var7_int &&
                  var7_int != 1 &&
                  var7_int != 2) {
                  if (var7_int == 3 ||
                    var7_int == 4) {
                    var21 = param3.j(-21);
                    var22 = param3.j(-26);
                    var10 = param3.g(-84);
                    var11 = new String[var10];
                    for (var12_int = 0; var10 > var12_int; var12_int++) {
                      var11[var12_int] = param3.j(-49);
                    }
                    var23 = new byte[var10][];
                    var20 = var23;
                    var12 = var20;
                    if (var7_int == 3) {
                      for (var13_int = 0; var13_int < var10; var13_int++) {
                        var14 = param3.b(true);
                        array$0 = new byte[var14];
                        var12[var13_int] = array$0;
                        param3.a(0, (byte) -124, var23[var13_int], var14);
                      }
                    }
                    var19.field_m[var6] = var7_int;
                    var13 = new Class[var10];
                    var18 = 0;
                    var14Lifetime1 = var18;
                    while (var18 < var10) {
                      var13[var18] = fm.a(true, var11[var18]);
                      var18++;
                    }
                    var19.field_p[var6] = param2.a((byte) 16, fm.a(true, var21), var13, var22);
                    var19.field_w[var6] = var23;
                  }
                } else {
                  var16 = param3.j(-98);
                  var8 = var16;
                  var17 = param3.j(-46);
                  var9 = var17;
                  var10 = 0;
                  if (var7_int == 1) {
                    var10 = param3.b(true);
                  }
                  var19.field_m[var6] = var7_int;
                  var19.field_r[var6] = var10;
                  var19.field_n[var6] = param2.a(fm.a(true, var16), var17, (byte) -88);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var19.field_q[var6] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var7_ref = (SecurityException) (Object) decompiledCaughtException;
                var19.field_q[var6] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var19.field_q[var6] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var7_ref3 = (Exception) (Object) decompiledCaughtException;
                var19.field_q[var6] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var7_ref4 = decompiledCaughtException;
                var19.field_q[var6] = -5;
              }
            }
            pj.field_H.b((byte) 82, var19);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_37_0 = var4;
            stackIn_37_1 = new StringBuilder().append("vn.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_38_2 = "null";
            } else {
              stackIn_38_2 = "{...}";
            }
            stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
            if (param3 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return -51;
        }
        return aj.a(param3, false, aj.a(param2, false, param0));
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_i.a(param2, param1, -82, param0, param3, var7, var6);
        ba.field_sb.b(0, 2147483647, 0, ud.field_J.field_gb, ad.field_x);
        qk.field_e.b(2 + ad.field_x, 2147483647, 0, -80 + (-2 - nk.field_n) + (ud.field_J.field_gb - 2), 18);
        mb.field_f.b(ad.field_x + 2, 2147483647, -2 + ud.field_J.field_gb + (-nk.field_n - 80), 82 + nk.field_n, 18);
        aj.field_Mb.a(0, ud.field_J.field_gb, 8, 2, nk.field_n, 20, -22 - ad.field_x + ud.field_J.field_Db, 20 + (2 + ad.field_x));
        cp.field_c.a(20, nk.field_n, 0, 2);
        int var8 = 111 % ((param4 + 58) / 45);
    }

    vn(String param0, vh param1) {
        String[] var3 = null;
        vh[] var4 = null;
        try {
          var3 = new String[]{param0, cl.field_i, ll.field_e};
          var4 = new vh[]{param1, ud.field_J, (vh) ((Object) cp.field_c)};
          this.field_i = new wd(0L, bb.field_c, var3, ea.field_u, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_h = null;
        field_j = null;
        field_g = null;
        if (!param0) {
          ge var2 = (ge) null;
          vn.a((byte) -54, -128, (sj) null, (ge) null);
        }
    }

    static {
        field_d = new nl();
        field_b = -1;
        field_a = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
