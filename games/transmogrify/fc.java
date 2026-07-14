/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static volatile int field_g;
    static ti[] field_h;
    private boolean field_a;
    private String field_c;
    private boolean field_b;
    static String field_e;
    static int field_d;
    static int field_f;

    final static void a(int param0, String param1) {
        if (param0 < 111) {
          field_g = -123;
          System.out.println("Error: " + mg.a("%0a", false, "\n", param1));
          return;
        } else {
          System.out.println("Error: " + mg.a("%0a", false, "\n", param1));
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = ((fc) this).b(-123);
            return ((fc) this).field_a;
        }
        return ((fc) this).field_a;
    }

    final void a(boolean param0, boolean param1) {
        ((fc) this).field_b = true;
        ((fc) this).field_a = param0 ? true : false;
        if (param1) {
            ((fc) this).a(false, false);
        }
    }

    final static boolean a(byte param0, uk param1, uk param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var4 = Transmogrify.field_A ? 1 : 0;
          if (param0 >= 115) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          var3 = -param1.field_hb + param2.field_hb;
          if (param2.field_fb == bd.field_v) {
            // wide iinc 3 -200
            break L1;
          } else {
            if (param2.field_fb != null) {
              break L1;
            } else {
              // wide iinc 3 200
              break L1;
            }
          }
        }
        if (bd.field_v != param1.field_fb) {
          if (null == param1.field_fb) {
            L2: {
              // wide iinc 3 -200
              if ((var3 ^ -1) >= -1) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L2;
              } else {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L2;
              }
            }
            return stackIn_19_0 != 0;
          } else {
            L3: {
              if ((var3 ^ -1) >= -1) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
            return stackIn_15_0 != 0;
          }
        } else {
          L4: {
            // wide iinc 3 200
            if ((var3 ^ -1) >= -1) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L4;
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L4;
            }
          }
          return stackIn_10_0 != 0;
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int stackIn_12_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_10_0 = 0;
        var3 = vl.b(-1, param2);
        if (param0 == 19) {
          if (param1.indexOf(param2) == -1) {
            if ((param1.indexOf(var3) ^ -1) == 0) {
              if (!param1.startsWith(param2)) {
                if (!param1.startsWith(var3)) {
                  if (!param1.endsWith(param2)) {
                    if (param1.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    return stackIn_28_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_d = 73;
          if (param1.indexOf(param2) == -1) {
            if ((param1.indexOf(var3) ^ -1) == 0) {
              if (!param1.startsWith(param2)) {
                if (!param1.startsWith(var3)) {
                  if (!param1.endsWith(param2)) {
                    if (param1.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    return stackIn_12_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_g = -17;
            field_h = null;
            field_e = null;
            return;
        }
        field_h = null;
        field_e = null;
    }

    fc(String param0) {
        ((fc) this).field_a = false;
        ((fc) this).field_b = false;
        ((fc) this).field_c = param0;
    }

    final String a(byte param0) {
        int var2 = -39 / ((param0 - 19) / 35);
        return ((fc) this).field_c;
    }

    final boolean b(int param0) {
        if (param0 != -26753) {
            ((fc) this).field_a = false;
            return ((fc) this).field_b;
        }
        return ((fc) this).field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
        field_g = -1;
    }
}
