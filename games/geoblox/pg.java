/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static le field_c;
    static int[] field_d;
    static String[] field_a;
    static boolean field_e;
    static int field_b;

    final static void a(int param0) {
        og.field_r = 0.4000000059604645f;
        sa.field_c = 0.0;
        ul.field_b = 0;
        ag.field_k = 3;
        fj.field_m = 0;
        ji.field_h = 0;
        fa.field_b = 40;
        f.field_qb = 4;
        qe.b(10);
        ij.field_ab = 0.75f;
        rc.field_h = 0.01666666753590107f;
        if (param0 != 9408) {
            return;
        }
        di.field_g = 0;
        sa.b(true);
        el.field_t = 0;
        gb.field_c = 0;
    }

    final static void a(int param0, d param1, int param2, qc param3) {
        try {
            int var11_int = 0;
            int var12_int = 0;
            byte[] array$0 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_42_2 = null;
            StringBuilder stackIn_44_1 = null;
            String stackIn_45_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            qc var15 = null;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            eg var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            int var13Lifetime1;
            var14 = Geoblox.field_C;
            try {
              var19 = new eg();
              var19.field_f = param3.c((byte) 34);
              var19.field_m = param3.a((byte) -127);
              var19.field_j = new int[var19.field_f];
              var19.field_i = new cb[var19.field_f];
              var19.field_g = new int[var19.field_f];
              var19.field_n = new cb[var19.field_f];
              var19.field_k = new int[var19.field_f];
              var19.field_o = new byte[var19.field_f][][];
              var5 = 0;
              while (var5 < var19.field_f) {
                try {
                  L2: {
                    var6_int = param3.c((byte) 34);
                    if (0 != var6_int &&
                        1 != var6_int &&
                        var6_int != 2) {
                      if (var6_int != 3 &&
                          var6_int != 4) {
                        var5++;
                        decompiledRegionSelector0 = 1;
                        break L2;
                      }
                      var21 = param3.e((byte) 103);
                      var8 = param3.e((byte) 98);
                      var9 = param3.c((byte) 34);
                      var10 = new String[var9];
                      for (var11_int = 0; var9 > var11_int; var11_int++) {
                        var10[var11_int] = param3.e((byte) 120);
                      }
                      var22 = new byte[var9][];
                      var20 = var22;
                      var11 = var20;
                      if (var6_int == 3) {
                        for (var12_int = 0; var12_int < var9; var12_int++) {
                          var13 = param3.a((byte) -70);
                          array$0 = new byte[var13];
                          var11[var12_int] = array$0;
                          param3.b(29915, var13, var22[var12_int], 0);
                        }
                      }
                      var19.field_k[var5] = var6_int;
                      var12 = new Class[var9];
                      var18 = 0;
                      var13Lifetime1 = var18;
                      while (var18 < var9) {
                        var12[var18] = ag.a(var10[var18], false);
                        var18++;
                      }
                      var19.field_i[var5] = param1.a(var8, -126, var12, ag.a(var21, false));
                      var19.field_o[var5] = var22;
                    } else {
                      var16 = param3.e((byte) 117);
                      var7 = var16;
                      var17 = param3.e((byte) 125);
                      var8 = var17;
                      var9 = 0;
                      if (var6_int == 1) {
                        var9 = param3.a((byte) -123);
                      }
                      var19.field_k[var5] = var6_int;
                      var19.field_g[var5] = var9;
                      var19.field_n[var5] = param1.a(ag.a(var16, false), 0, var17);
                    }
                    decompiledRegionSelector0 = 0;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  var19.field_j[var5] = -1;
                  decompiledRegionSelector0 = 0;
                } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (SecurityException) (Object) decompiledCaughtException;
                  var19.field_j[var5] = -2;
                  decompiledRegionSelector0 = 0;
                } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var19.field_j[var5] = -3;
                  decompiledRegionSelector0 = 0;
                } catch (java.lang.Exception decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var19.field_j[var5] = -4;
                  decompiledRegionSelector0 = 0;
                } catch (java.lang.Throwable decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = decompiledCaughtException;
                  var19.field_j[var5] = -5;
                  decompiledRegionSelector0 = 0;
                }
                if (decompiledRegionSelector0 != 0) {
                  continue;
                }
                var5++;
              }
              if (param0 != -4) {
                var15 = (qc) null;
                pg.a(96, (d) null, -109, (qc) null);
              }
              sl.field_k.a(-92, var19);
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              var4 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_41_0 = var4;
              stackIn_41_1 = new StringBuilder().append("pg.C(").append(param0).append(',');
              if (param1 == null) {
                stackIn_42_2 = "null";
              } else {
                stackIn_42_2 = "{...}";
              }
              stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(',');
              if (param3 == null) {
                stackIn_45_2 = "null";
              } else {
                stackIn_45_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 != 22059) {
            pg.a(52);
        }
    }

    static {
        field_d = new int[8192];
        field_c = new le();
        field_a = new String[]{"Geoblox Flush", "Ordered Geometry", "Perfect Geometry", "Chain Geometry", "Sequence Geometry", "Succession Geometry", "Dark Geometry", "Lightning Geometrician", "Natural Geometrician", "Sweet Geometrician", "Sparkly Geometrician", "Sick Geometrician", "Stellar Geometrician", "Sporty Geometrician", "Cooking Geometrician", "Parallel Geometrician", "Spooky Geometrician"};
    }
}
