/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static String field_a;
    static int field_b;

    final static int b(int param0) {
        if (param0 != -13043) {
            String var2 = (String) null;
            co.a((String) null, -49);
            return p.field_d;
        }
        return p.field_d;
    }

    public static void d(int param0) {
        field_a = null;
        if (param0 != 28186) {
            String var2 = (String) null;
            co.a((String) null, -91);
        }
    }

    final static id a(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object var6;
        int var7;
        if (param5 == -19653) {
          var6 = null;
          var7 = 0;
          L0: while (true) {
            if (bm.field_a.length > var7) {
              if (bm.field_a[var7] == param4) {
                L1: {
                  var6 = new kc(param2, param1, hd.field_u[var7], param0, param3, hg.field_a[var7], si.field_Qb[var7]);
                  rg.field_J.a((nb) (var6), (byte) -119);
                  if (param4 == ch.field_b) {
                    var6 = new te(param2, param1, 0, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var6 == null) {
                    var6 = new id(param2, param1, param4);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  stackIn_27_0 = var6;

                  if (!param0) {
                    stackIn_28_0 = stackIn_27_0;
                    stackIn_28_1 = 0;
                    break L3;
                  } else {
                    stackIn_28_0 = stackIn_27_0;
                    stackIn_28_1 = 1;
                    break L3;
                  }
                }
                L4: {
                  ((id) ((Object) stackIn_28_0)).field_P = stackIn_28_1 != 0;
                  stackIn_30_0 = var6;

                  if (!param3) {
                    stackIn_31_0 = stackIn_30_0;
                    stackIn_31_1 = 0;
                    break L4;
                  } else {
                    stackIn_31_0 = stackIn_30_0;
                    stackIn_31_1 = 1;
                    break L4;
                  }
                }
                ((id) ((Object) stackIn_31_0)).field_J = stackIn_31_1 != 0;
                return (id) (var6);
              } else {
                var7++;
                continue L0;
              }
            } else {
              L5: {
                if (param4 == ch.field_b) {
                  var6 = new te(param2, param1, 0, param0);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var6 == null) {
                  var6 = new id(param2, param1, param4);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                stackIn_12_0 = var6;

                if (!param0) {
                  stackIn_13_0 = stackIn_12_0;
                  stackIn_13_1 = 0;
                  break L7;
                } else {
                  stackIn_13_0 = stackIn_12_0;
                  stackIn_13_1 = 1;
                  break L7;
                }
              }
              L8: {
                ((id) ((Object) stackIn_13_0)).field_P = stackIn_13_1 != 0;
                stackIn_15_0 = var6;

                if (!param3) {
                  stackIn_16_0 = stackIn_15_0;
                  stackIn_16_1 = 0;
                  break L8;
                } else {
                  stackIn_16_0 = stackIn_15_0;
                  stackIn_16_1 = 1;
                  break L8;
                }
              }
              ((id) ((Object) stackIn_16_0)).field_J = stackIn_16_1 != 0;
              return (id) (var6);
            }
          }
        } else {
          return (id) null;
        }
    }

    final static tk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        tk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -10 / ((param1 - -49) / 51);
            stackIn_1_0 = new tk(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("co.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0) {
        le var1 = null;
        le var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            var1 = kn.field_L.b((byte) 26);
            L1: while (true) {
              if (!(var1 instanceof tm)) {
                L2: {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    field_a = (String) null;
                    break L2;
                  }
                }
                var1 = se.field_m.b((byte) 26);
                L3: while (true) {
                  if (!(var1 instanceof tm)) {
                    var1 = rm.field_e.b((byte) 26);
                    L4: while (true) {
                      if (!(var1 instanceof tm)) {
                        mg.a(-120);
                        break L0;
                      } else {
                        L5: {
                          var2 = var1.field_b;
                          if (!((tm) ((Object) var1)).field_j.l()) {
                            break L5;
                          } else {
                            var1.b(-27598);
                            break L5;
                          }
                        }
                        var1 = var2;
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      var2 = var1.field_b;
                      if (!((tm) ((Object) var1)).field_j.l()) {
                        break L6;
                      } else {
                        var1.b(-27598);
                        break L6;
                      }
                    }
                    var1 = var2;
                    continue L3;
                  }
                }
              } else {
                L7: {
                  var2 = var1.field_b;
                  if (!((tm) ((Object) var1)).field_j.l()) {
                    break L7;
                  } else {
                    var1.b(-27598);
                    break L7;
                  }
                }
                var1 = var2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "co.C(" + param0 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 != 17821) {
            field_b = 79;
            return df.field_l;
        }
        return df.field_l;
    }

    static {
        field_a = "Music: ";
    }
}
