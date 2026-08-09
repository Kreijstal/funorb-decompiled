/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om {
    static qk field_d;
    static int field_a;
    static cf field_b;
    static java.math.BigInteger field_c;
    static String field_e;

    final static cd a(boolean param0) {
        if (!param0) {
          om.b(-113);
          return new cd(co.e((byte) 92), f.a((byte) -75));
        } else {
          return new cd(co.e((byte) 92), f.a((byte) -75));
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = DungeonAssault.field_K;
            try {
              L0: {
                if (mm.field_k) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      L2: {
                        if (param1 == 2) {
                          break L2;
                        } else {
                          field_e = (String) null;
                          break L2;
                        }
                      }
                      var2 = "tuhstatbut";
                      var3 = (String) (ee.a((byte) -21, param0, "getcookies"));
                      var4 = ih.a(param1 + 121, ';', var3);
                      var5 = 0;
                      L3: while (true) {
                        if (var4.length <= var5) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                break L4;
                              } else {
                                stackIn_12_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L6: {
                      if (null == param0.getParameter("tuhstatbut")) {
                        stackIn_19_0 = 0;
                        break L6;
                      } else {
                        stackIn_19_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref2);

                stackIn_22_1 = new StringBuilder().append("om.B(");

                if (param0 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L7;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L7;
                }
              }
              throw vk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_12_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        int var1 = 99 % ((param0 - -84) / 34);
        field_d = null;
    }

    final static boolean b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            if (bl.field_j != null) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!hj.field_Z.a(false, "benefits")) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                bl.field_j = oh.a(hj.field_Z, "benefits", 11091, "members_benefits_borders");
                rj.field_s = oh.a(hj.field_Z, "benefits", 11091, "members_benefits_price");
                var1_int = -103 / ((param0 - 15) / 37);
                sh.field_a = oh.a(hj.field_Z, "benefits", 11091, "members_benefits_logo");
                g.field_Gb = new cn[4];
                g.field_Gb[0] = rc.a("", sb.field_a, "mb_da_thumbs_01.jpg", (byte) 71);
                g.field_Gb[1] = rc.a("", sb.field_a, "mb_da_thumbs_02.jpg", (byte) 71);
                g.field_Gb[2] = rc.a("", sb.field_a, "mb_da_thumbs_06.jpg", (byte) 71);
                g.field_Gb[3] = rc.a("", sb.field_a, "mb_da_thumbs_05.jpg", (byte) 71);
                var2 = g.field_Gb.length + -1;
                L1: while (true) {
                  if ((var2 ^ -1) > -1) {
                    bp.a(bl.field_j, (byte) 51, ba.field_h);
                    eg.a(80, 15, 16744576, 40, 5, rj.field_s, 2, 40, -2400, ne.field_c, 80);
                    ib.a(-4, g.field_Gb);
                    wa.a(123, sh.field_a);
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    g.field_Gb[var2].h();
                    var2--;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "om.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    static {
        field_c = new java.math.BigInteger("65537");
        field_e = "This incorporeal entity is imbued with dark magic; its glowing red eyes wait to drink in the souls of raiders.<br><br>Defeated raiders permanently lose 2 <%attack>.";
    }
}
