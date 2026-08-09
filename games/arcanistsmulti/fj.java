/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends pg {
    static String field_g;
    static int field_h;
    static String field_i;
    static int field_j;
    int field_k;

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeKeyListener(ch.field_a);
            if (param1 <= 77) {
                field_j = -47;
            }
            param0.removeFocusListener(ch.field_a);
            ub.field_b = -1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "fj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, CharSequence param1, boolean param2, int param3) {
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param3 ^ -1) > -3) {
                break L1;
              } else {
                if (36 < param3) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param1.length();
                    if (param0 == 97) {
                      break L2;
                    } else {
                      field_h = -110;
                      break L2;
                    }
                  }
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      stackIn_41_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (0 == var8) {
                            if (45 == var9) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param2) {
                                  break L5;
                                } else {
                                  var8++;
                                  continue L3;
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (97 > var9) {
                              break L9;
                            } else {
                              if (122 < var9) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          stackIn_28_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (var9 < param3) {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = param3 * var6 - -var9;
                          if (var10 / param3 != var6) {
                            stackIn_37_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
                        } else {
                          stackIn_31_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var4);

            stackIn_44_1 = new StringBuilder().append("fj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L11;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L11;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_28_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_37_0 != 0;
            } else {
              return stackIn_41_0 != 0;
            }
          }
        }
    }

    final static void a(int param0, nk param1, int param2) {
        ab var3 = null;
        try {
            var3 = he.field_e;
            var3.b((byte) -36, param2);
            if (param0 != -26971) {
                String var4 = (String) null;
                fj.a((String) null, 34, (eg) null, (String) null);
            }
            var3.f(param1.field_p, (byte) -41);
            var3.f(param1.field_t, (byte) -85);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "fj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static qb a(String param0, int param1, eg param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.c(param0, 98);
              if (param1 == -22612) {
                break L1;
              } else {
                field_h = -32;
                break L1;
              }
            }
            var5 = param2.a(param3, (byte) 106, var4_int);
            stackIn_3_0 = r.a(param1 + 4684, var5, var4_int, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("fj.E(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    private fj() throws Throwable {
        throw new Error();
    }

    final static void c(int param0) {
        if (!(hk.field_s)) {
            throw new IllegalStateException();
        }
        if (param0 >= -107) {
            nk var2 = (nk) null;
            fj.a(-37, (nk) null, 73);
        }
        if (!(null == vf.field_k)) {
            vf.field_k.h(77);
        }
        String var1 = ho.b((byte) 103);
        wh.field_f = new e(var1, (String) null, true, false, false);
        p.field_b.b(g.field_e, 15637);
        g.field_e.a((byte) -92, (qm) (wh.field_f));
        g.field_e.a(111);
    }

    public static void a(int param0) {
        if (param0 <= 74) {
            return;
        }
        field_g = null;
        field_i = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(param0 != 0)) {
            return 0;
        }
        if ((param0 ^ -1) < -1) {
            var2 = 1;
            if (-65536 > (param0 ^ -1)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (!(param0 <= 255)) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (15 < param0) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (!(-4 <= (param0 ^ -1))) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (param0 > 1) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        if (param1 != 29797) {
            nk var3 = (nk) null;
            fj.a(-58, (nk) null, 1);
        }
        var2 = 2;
        if (!((param0 ^ -1) <= 65535)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(-256 <= param0)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!(-16 <= param0)) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (3 < (param0 ^ -1)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if ((param0 ^ -1) > 1) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    static {
        field_g = "Movement:";
    }
}
