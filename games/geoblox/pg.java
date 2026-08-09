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
            byte[] array$0 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            StringBuilder stackIn_44_1 = null;
            StringBuilder stackIn_45_1 = null;
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
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
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
            var14 = Geoblox.field_C;
            try {
              L0: {
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
                L1: while (true) {
                  if (var5 >= var19.field_f) {
                    L2: {
                      if (param0 == -4) {
                        break L2;
                      } else {
                        var15 = (qc) null;
                        pg.a(96, (d) null, -109, (qc) null);
                        break L2;
                      }
                    }
                    sl.field_k.a(-92, var19);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param3.c((byte) 34);
                            if (0 == var6_int) {
                              break L5;
                            } else {
                              if (1 == var6_int) {
                                break L5;
                              } else {
                                if (var6_int != 2) {
                                  L6: {
                                    if ((var6_int ^ -1) == -4) {
                                      break L6;
                                    } else {
                                      if (var6_int == 4) {
                                        break L6;
                                      } else {
                                        var5++;
                                        decompiledRegionSelector0 = 1;
                                        break L3;
                                      }
                                    }
                                  }
                                  var21 = param3.e((byte) 103);
                                  var8 = param3.e((byte) 98);
                                  var9 = param3.c((byte) 34);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var9 <= var11_int) {
                                      L8: {
                                        var22 = new byte[var9][];
                                        var20 = var22;
                                        var11 = var20;
                                        if ((var6_int ^ -1) == -4) {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var12_int >= var9) {
                                              break L8;
                                            } else {
                                              var13 = param3.a((byte) -70);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param3.b(29915, var13, var22[var12_int], 0);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      var19.field_k[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var18 = 0;
                                      var13 = var18;
                                      L10: while (true) {
                                        if (var18 >= var9) {
                                          var19.field_i[var5] = param1.a(var8, -126, var12, ag.a(var21, false));
                                          var19.field_o[var5] = var22;
                                          break L4;
                                        } else {
                                          var12[var18] = ag.a(var10[var18], false);
                                          var18++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param3.e((byte) 120);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L11: {
                            var16 = param3.e((byte) 117);
                            var7 = var16;
                            var17 = param3.e((byte) 125);
                            var8 = var17;
                            var9 = 0;
                            if (-2 != (var6_int ^ -1)) {
                              break L11;
                            } else {
                              var9 = param3.a((byte) -123);
                              break L11;
                            }
                          }
                          var19.field_k[var5] = var6_int;
                          var19.field_g[var5] = var9;
                          var19.field_n[var5] = param1.a(ag.a(var16, false), 0, var17);
                          break L4;
                        }
                        decompiledRegionSelector0 = 0;
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var19.field_j[var5] = -1;
                        decompiledRegionSelector0 = 0;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var19.field_j[var5] = -2;
                        decompiledRegionSelector0 = 0;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var19.field_j[var5] = -3;
                        decompiledRegionSelector0 = 0;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var19.field_j[var5] = -4;
                        decompiledRegionSelector0 = 0;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var19.field_j[var5] = -5;
                        decompiledRegionSelector0 = 0;
                        break L16;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var5++;
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_41_0 = (RuntimeException) (var4);

                stackIn_41_1 = new StringBuilder().append("pg.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "null";
                  break L17;
                } else {
                  stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "{...}";
                  break L17;
                }
              }
              L18: {


                stackIn_44_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_42_0 = (RuntimeException) ((Object) stackIn_42_0);
                  stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackIn_45_2 = "null";
                  break L18;
                } else {
                  stackIn_42_0 = (RuntimeException) ((Object) stackIn_42_0);
                  stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackIn_45_2 = "{...}";
                  break L18;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_42_0), stackIn_45_2 + ')');
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
