/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hoa extends rqa {
    static int field_o;
    static String field_p;

    final static boolean a(char param0, boolean param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
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
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
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
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
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
        Object var4 = null;
        si.a(149, 62, param0[0].a(68));
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((hoa) this).a((nc[]) null, 72);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    hoa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(String param0, int param1, boolean param2) {
        String var3 = null;
        String var4 = null;
        var4 = hp.field_b.field_R;
        var3 = var4;
        hp.field_b.field_R = param0;
        qw.field_l.b(param2, 80);
        hp.field_b.field_R = var4;
        if (param1 != 0) {
          hoa.a(77);
          return;
        } else {
          return;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_p = "Seriously offensive language";
    }
}
