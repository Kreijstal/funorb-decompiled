/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ca {
    static boolean field_b;
    ca field_c;
    long field_d;
    ca field_e;
    static String field_a;

    final static short[] a(short[] param0, int param1, boolean param2, se param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var4_int = param3.h(param1, 8);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (var4_int != param0.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.h(4, 8);
                if (!param2) {
                  break L3;
                } else {
                  var9 = null;
                  short[] discarded$2 = ca.a((short[]) null, -25, true, (se) null);
                  break L3;
                }
              }
              L4: {
                var6 = (short)param3.h(16, 8);
                if (0 < var5) {
                  var7 = 0;
                  L5: while (true) {
                    if (~var7 <= ~var4_int) {
                      break L4;
                    } else {
                      param0[var7] = (short)(var6 + param3.h(var5, 8));
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (~var7 <= ~var4_int) {
                      break L4;
                    } else {
                      param0[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (short[]) param0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("ca.JB(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    public static void a(int param0) {
        if (param0 != 40) {
            field_a = null;
        }
        field_a = null;
    }

    final static int a(boolean param0) {
        if (vh.field_n < 2) {
          return 0;
        } else {
          L0: {
            field_b = false;
            if (wj.field_m == 0) {
              if (og.field_g.b(-1)) {
                if (!og.field_g.b((byte) 112, "commonui")) {
                  return 40;
                } else {
                  if (am.field_b.b(-1)) {
                    if (am.field_b.b((byte) 111, "commonui")) {
                      if (!wb.field_b.b(-1)) {
                        return 70;
                      } else {
                        if (wb.field_b.c(7715)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                }
              } else {
                return 20;
              }
            } else {
              L1: {
                if (lf.field_a != null) {
                  if (lf.field_a.b(-1)) {
                    if (!lf.field_a.c((byte) -62, "")) {
                      return 29;
                    } else {
                      if (!lf.field_a.b((byte) -113, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!og.field_g.b(-1)) {
                return 43;
              } else {
                if (og.field_g.b((byte) 58, "commonui")) {
                  if (am.field_b.b(-1)) {
                    if (!am.field_b.b((byte) 94, "commonui")) {
                      return 80;
                    } else {
                      if (!wb.field_b.b(-1)) {
                        return 82;
                      } else {
                        if (wb.field_b.c(7715)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              }
            }
          }
          return 100;
        }
    }

    final void b(int param0) {
        if (!(null != ((ca) this).field_c)) {
            return;
        }
        ((ca) this).field_c.field_e = ((ca) this).field_e;
        if (param0 != 57) {
            Object var3 = null;
            short[] discarded$0 = ca.a((short[]) null, 120, true, (se) null);
        }
        ((ca) this).field_e.field_c = ((ca) this).field_c;
        ((ca) this).field_e = null;
        ((ca) this).field_c = null;
    }

    final boolean b(boolean param0) {
        if (!(null != ((ca) this).field_c)) {
            return false;
        }
        if (!param0) {
            ca.a(-7);
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Max Bolts";
    }
}
