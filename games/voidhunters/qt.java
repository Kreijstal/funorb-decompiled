/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qt extends rqa {
    static String field_o;

    qt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int param1, int param2) {
        String var4 = null;
        int var3 = ohb.field_o != null ? 1 : 0;
        if (pma.field_o != 9) {
            if (!(-11 != (pma.field_o ^ -1))) {
                if (!(var3 == 0)) {
                    return false;
                }
                or.a(0);
                return true;
            }
            if (pma.field_o == 11) {
                if (!cha.field_o) {
                    if (param1 == 2) {
                        return false;
                    }
                    return false;
                }
                if (2 != gi.field_a) {
                    if ((gi.field_a ^ -1) != -3) {
                        if (var3 != 0) {
                            return false;
                        }
                        if (!jpa.b(param1 + 5)) {
                            return true;
                        }
                        var4 = (String) null;
                        va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                        return true;
                    }
                    if (!jpa.b(param1 + 5)) {
                        return true;
                    }
                    var4 = (String) null;
                    va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                    return true;
                }
                if (ira.a(hb.field_b, cwa.field_b, 41)) {
                    if ((gi.field_a ^ -1) != -3) {
                        if (var3 == 0) {
                            if (jpa.b(param1 + 5)) {
                                var4 = (String) null;
                                va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    if (jpa.b(param1 + 5)) {
                        var4 = (String) null;
                        va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            if (param1 != 2) {
                return false;
            }
            return false;
        }
        if (!jeb.a(abb.field_a, wrb.field_p, itb.field_p, rea.field_d, (byte) -93)) {
            if (!(-11 != (pma.field_o ^ -1))) {
                if (!(var3 == 0)) {
                    return false;
                }
                or.a(0);
                return true;
            }
            if (pma.field_o == 11) {
                if (!cha.field_o) {
                    if (param1 != 2) {
                        return false;
                    }
                    return false;
                }
                if (2 != gi.field_a) {
                    if ((gi.field_a ^ -1) != -3) {
                        if (var3 == 0) {
                            if (jpa.b(param1 + 5)) {
                                var4 = (String) null;
                                va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    if (jpa.b(param1 + 5)) {
                        var4 = (String) null;
                        va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                        return true;
                    }
                    return true;
                }
                if (ira.a(hb.field_b, cwa.field_b, 41)) {
                    if ((gi.field_a ^ -1) != -3) {
                        if (var3 == 0) {
                            if (jpa.b(param1 + 5)) {
                                var4 = (String) null;
                                va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    if (jpa.b(param1 + 5)) {
                        var4 = (String) null;
                        va.a((String) null, -25719, kkb.field_p, param2, gi.field_a, cwa.field_b);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            if (param1 != 2) {
                return false;
            }
            return false;
        }
        if (abb.field_a != 2 && var3 != 0) {
            return false;
        }
        return fia.a(wrb.field_p, abb.field_a, (byte) 123, itb.field_p, rea.field_d);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        phb[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (phb[]) null;
                qt.a((phb[]) null, 64, 92, -41, -29, false);
                break L1;
              }
            }
            si.a(50, 62, param0[0].a(48));
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qt.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 <= 119) {
            field_o = (String) null;
        }
    }

    final static void a(phb[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param3 > 0) {
                  L2: {
                    var6_int = param0[0].field_m;
                    var7 = param0[2].field_m;
                    var8 = param0[1].field_m;
                    param0[0].e(param4, param2, param1);
                    param0[2].e(param3 + param4 - var7, param2, param1);
                    dma.a(ola.field_o);
                    dma.g(var6_int + param4, param2, param3 + (param4 - var7), param2 + param0[1].field_n);
                    if (param5) {
                      break L2;
                    } else {
                      qt.a(27, -59, -55);
                      break L2;
                    }
                  }
                  var9 = var6_int + param4;
                  var10 = -var7 + (param4 - -param3);
                  param4 = var9;
                  L3: while (true) {
                    if (param4 >= var10) {
                      dma.b(ola.field_o);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param0[1].e(param4, param2, param1);
                      param4 = param4 + var8;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("qt.B(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_o = "Grappling hook";
    }
}
