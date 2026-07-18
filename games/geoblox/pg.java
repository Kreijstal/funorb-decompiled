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
        int discarded$0 = 10;
        qe.b();
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
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
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
            Object var15 = null;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            Object var19 = null;
            byte[][] var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            String stackOut_42_2 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            var14 = Geoblox.field_C;
            try {
              L0: {
                var19 = (Object) (Object) new eg();
                ((eg) var19).field_f = param3.c((byte) 34);
                ((eg) var19).field_m = param3.a((byte) -127);
                ((eg) var19).field_j = new int[((eg) var19).field_f];
                ((eg) var19).field_i = new cb[((eg) var19).field_f];
                ((eg) var19).field_g = new int[((eg) var19).field_f];
                ((eg) var19).field_n = new cb[((eg) var19).field_f];
                ((eg) var19).field_k = new int[((eg) var19).field_f];
                ((eg) var19).field_o = new byte[((eg) var19).field_f][][];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= ((eg) var19).field_f) {
                    L2: {
                      if (param0 == -4) {
                        break L2;
                      } else {
                        var15 = null;
                        pg.a(96, (d) null, -109, (qc) null);
                        break L2;
                      }
                    }
                    sl.field_k.a(-92, (hf) var19);
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
                                  if (var6_int == 3) {
                                    var7 = param3.e((byte) 103);
                                    var8 = param3.e((byte) 98);
                                    var9 = param3.c((byte) 34);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L6: while (true) {
                                      if (var9 <= var11_int) {
                                        L7: {
                                          var23 = new byte[var9][];
                                          var22 = var23;
                                          var21 = var22;
                                          var20 = var21;
                                          var11 = var20;
                                          if (var6_int == 3) {
                                            var12_int = 0;
                                            L8: while (true) {
                                              if (var12_int >= var9) {
                                                break L7;
                                              } else {
                                                var13 = param3.a((byte) -70);
                                                var11[var12_int] = new byte[var13];
                                                param3.b(29915, var13, var23[var12_int], 0);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                        ((eg) var19).field_k[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var18 = 0;
                                        var13 = var18;
                                        L9: while (true) {
                                          if (var18 >= var9) {
                                            int discarded$3 = 0;
                                            ((eg) var19).field_i[var5] = param1.a(var8, -126, var12, ag.a(var7));
                                            ((eg) var19).field_o[var5] = var23;
                                            break L4;
                                          } else {
                                            int discarded$4 = 0;
                                            var12[var18] = ag.a(var10[var18]);
                                            var18++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param3.e((byte) 120);
                                        var11_int++;
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    L10: {
                                      if (var6_int != 4) {
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    var5++;
                                    decompiledRegionSelector0 = 1;
                                    break L3;
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
                            if (var6_int != 1) {
                              break L11;
                            } else {
                              var9 = param3.a((byte) -123);
                              break L11;
                            }
                          }
                          ((eg) var19).field_k[var5] = var6_int;
                          ((eg) var19).field_g[var5] = var9;
                          int discarded$5 = 0;
                          ((eg) var19).field_n[var5] = param1.a(ag.a(var16), 0, var17);
                          break L4;
                        }
                        decompiledRegionSelector0 = 0;
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((eg) var19).field_j[var5] = -1;
                        decompiledRegionSelector0 = 0;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((eg) var19).field_j[var5] = -4;
                        decompiledRegionSelector0 = 0;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        ((eg) var19).field_j[var5] = -5;
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
                stackOut_37_0 = (RuntimeException) var4;
                stackOut_37_1 = new StringBuilder().append("pg.C(").append(param0).append(',');
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param1 == null) {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "null";
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L17;
                } else {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L17;
                }
              }
              L18: {
                stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param2).append(',');
                stackIn_42_0 = stackOut_40_0;
                stackIn_42_1 = stackOut_40_1;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                if (param3 == null) {
                  stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = "null";
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  stackIn_43_2 = stackOut_42_2;
                  break L18;
                } else {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "{...}";
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_43_2 = stackOut_41_2;
                  break L18;
                }
              }
              throw t.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b() {
        field_d = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_c = new le();
        field_a = new String[]{"Geoblox Flush", "Ordered Geometry", "Perfect Geometry", "Chain Geometry", "Sequence Geometry", "Succession Geometry", "Dark Geometry", "Lightning Geometrician", "Natural Geometrician", "Sweet Geometrician", "Sparkly Geometrician", "Sick Geometrician", "Stellar Geometrician", "Sporty Geometrician", "Cooking Geometrician", "Parallel Geometrician", "Spooky Geometrician"};
    }
}
