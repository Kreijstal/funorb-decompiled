/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends nm {
    int field_o;
    static String field_l;
    int field_p;
    static boolean field_j;
    static int field_q;
    static String[] field_r;
    int field_n;
    int field_k;
    int field_m;
    static String field_s;
    int field_t;
    int[] field_i;

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ii) this).field_k = param7;
        ((ii) this).field_m = param2;
        ((ii) this).field_n = param1;
        ((ii) this).field_o = param6;
        ((ii) this).field_p = param3;
        ((ii) this).field_t = param5;
        if (param4 != -161) {
            return;
        }
        try {
            ((ii) this).field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ii.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static boolean a(boolean param0, char param1) {
        if (param1 >= 32) {
          if (126 >= param1) {
            return true;
          } else {
            L0: {
              if (param1 < 160) {
                break L0;
              } else {
                if (255 < param1) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            L1: {
              if (param1 == 8364) {
                break L1;
              } else {
                if (param1 == 338) {
                  break L1;
                } else {
                  if (param1 == 8212) {
                    break L1;
                  } else {
                    if (param1 == 339) {
                      break L1;
                    } else {
                      if (param1 != 376) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            }
            return true;
          }
        } else {
          if (param1 >= 160) {
            if (255 >= param1) {
              return true;
            } else {
              L2: {
                if (param1 == 8364) {
                  break L2;
                } else {
                  if (param1 == 338) {
                    break L2;
                  } else {
                    if (param1 == 8212) {
                      break L2;
                    } else {
                      if (param1 == 339) {
                        break L2;
                      } else {
                        if (param1 != 376) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
              }
              return true;
            }
          } else {
            if (param1 != 8364) {
              if (param1 != 338) {
                if (param1 != 8212) {
                  if (param1 != 339) {
                    if (param1 != 376) {
                      return false;
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
              return true;
            }
          }
        }
    }

    public static void a() {
        field_l = null;
        field_r = null;
        field_s = null;
    }

    ii() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[16];
        field_l = "Only show lobby chat from my friends";
        field_q = 2;
        field_s = "<%0> installed";
    }
}
