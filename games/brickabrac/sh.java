/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static String field_b;
    static String field_c;
    static int field_a;
    static mh field_d;

    final static eh a(byte param0) {
        int var1 = 0;
        if (null == dm.field_g) {
          dm.field_g = new eh();
          dm.field_g.a(a.field_u, 13421772);
          dm.field_g.field_p = 2763306;
          dm.field_g.field_h = 6;
          dm.field_g.field_a = 4;
          dm.field_g.field_g = 0;
          dm.field_g.field_f = 5;
          dm.field_g.field_j = 7697781;
          dm.field_g.field_m = 14;
          dm.field_g.field_l = og.field_Yb;
          var1 = 89 / ((param0 - 32) / 44);
          return dm.field_g;
        } else {
          var1 = 89 / ((param0 - 32) / 44);
          return dm.field_g;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        var4 = -59 / ((param1 - 40) / 63);
        if (param3 >= 2) {
          if ((param3 ^ -1) >= -37) {
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = param2.length();
            var9 = 0;
            L0: while (true) {
              if (var8 > var9) {
                L1: {
                  var10 = param2.charAt(var9);
                  if (var9 == 0) {
                    if (var10 != 45) {
                      if (var10 != 43) {
                        break L1;
                      } else {
                        if (!param0) {
                          break L1;
                        } else {
                          var9++;
                          continue L0;
                        }
                      }
                    } else {
                      var5 = 1;
                      var9++;
                      var9++;
                      continue L0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (var10 < 48) {
                      break L3;
                    } else {
                      if (var10 > 57) {
                        break L3;
                      } else {
                        var10 -= 48;
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (var10 < 65) {
                      break L4;
                    } else {
                      if (var10 <= 90) {
                        var10 -= 55;
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var10 < 97) {
                      break L5;
                    } else {
                      if (var10 > 122) {
                        break L5;
                      } else {
                        var10 -= 87;
                        break L2;
                      }
                    }
                  }
                  return false;
                }
                if (param3 <= var10) {
                  return false;
                } else {
                  L6: {
                    if (var5 != 0) {
                      var10 = -var10;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var11 = var10 + var7 * param3;
                  if (var7 == var11 / param3) {
                    var7 = var11;
                    var6 = 1;
                    var9++;
                    continue L0;
                  } else {
                    return false;
                  }
                }
              } else {
                return var6 != 0;
              }
            }
          } else {
            throw new IllegalArgumentException("" + param3);
          }
        } else {
          throw new IllegalArgumentException("" + param3);
        }
    }

    final static void b(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 1) {
                  break L0;
                } else {
                  field_b = null;
                  break L0;
                }
              }
              L1: {
                var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (var1_ref == null) {
                  break L1;
                } else {
                  try {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                    qh.field_a = 1 + (int)(var3.longValue() / 1048576L);
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return;
                  }
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 <= 110) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "More suggestions";
        field_b = "Encouraging rule breaking";
    }
}
