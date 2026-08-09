/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hoa extends rqa {
    static int field_o;
    static String field_p;

    final static boolean a(char param0, boolean param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        if (!param1) {
          if (param0 < 48) {
            if (param0 < 65) {
              L0: {
                if (param0 < 97) {
                  break L0;
                } else {
                  if (param0 > 122) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              if (param0 <= 90) {
                stackIn_30_0 = 1;
                return stackIn_30_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (param0 < 97) {
                      break L2;
                    } else {
                      if (param0 > 122) {
                        break L2;
                      } else {
                        stackIn_27_0 = 1;
                        break L1;
                      }
                    }
                  }
                  stackIn_27_0 = 0;
                  break L1;
                }
                return stackIn_27_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (param0 >= 65) {
                if (param0 > 90) {
                  if (param0 >= 97) {
                    if (param0 > 122) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
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
              si.a(149, 62, param0[0].a(68));
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, 72);
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hoa.A(");

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

    hoa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(String param0, int param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = hp.field_b.field_R;
            var3 = var4;
            hp.field_b.field_R = param0;
            qw.field_l.b(param2, 80);
            hp.field_b.field_R = var4;
            if (param1 == 0) {
              break L0;
            } else {
              hoa.a(77);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("hoa.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != -123) {
            hoa.a(-15);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    static {
        field_o = 0;
        field_p = "Seriously offensive language";
    }
}
