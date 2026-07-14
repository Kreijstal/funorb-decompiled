/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li extends me {
    static volatile boolean field_j;
    static String field_o;
    static int[] field_n;
    static ci field_k;
    private String field_m;
    private boolean field_l;

    public static void h(int param0) {
        if (param0 <= 117) {
          li.h(106);
          field_n = null;
          field_o = null;
          field_k = null;
          return;
        } else {
          field_n = null;
          field_o = null;
          field_k = null;
          return;
        }
    }

    final String b(int param0, String param1) {
        String var3 = null;
        uj var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        if (param0 == -1) {
          var6 = (CharSequence) (Object) param1;
          var3 = da.a(true, var6);
          if (var3 == null) {
            L0: {
              if (param1.equals((Object) (Object) ((li) this).field_m)) {
                break L0;
              } else {
                var4 = vl.a(42, param1);
                if (var4 != null) {
                  if (var4.field_b == null) {
                    ((li) this).field_l = var4.field_f;
                    ((li) this).field_m = param1;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            if (!((li) this).field_l) {
              return gb.field_e;
            } else {
              return lf.field_e;
            }
          } else {
            return var3;
          }
        } else {
          ((li) this).g(7);
          var5 = (CharSequence) (Object) param1;
          var3 = da.a(true, var5);
          if (var3 == null) {
            L1: {
              if (param1.equals((Object) (Object) ((li) this).field_m)) {
                break L1;
              } else {
                var4 = vl.a(42, param1);
                if (var4 != null) {
                  if (var4.field_b == null) {
                    ((li) this).field_l = var4.field_f;
                    ((li) this).field_m = param1;
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            if (!((li) this).field_l) {
              return gb.field_e;
            } else {
              return lf.field_e;
            }
          } else {
            return var3;
          }
        }
    }

    final static ec a(boolean param0, String param1, int param2) {
        nl var3 = new nl();
        if (param0) {
            return null;
        }
        ((ec) (Object) var3).field_a = param1;
        ((ec) (Object) var3).field_e = param2;
        return (ec) (Object) var3;
    }

    li(rg param0) {
        super(param0);
        ((li) this).field_l = false;
    }

    final rc a(int param0, String param1) {
        uj var3 = null;
        CharSequence var4 = null;
        rc stackIn_8_0 = null;
        rc stackIn_15_0 = null;
        rc stackIn_22_0 = null;
        rc stackIn_29_0 = null;
        rc stackOut_28_0 = null;
        rc stackOut_27_0 = null;
        rc stackOut_21_0 = null;
        rc stackOut_20_0 = null;
        rc stackOut_14_0 = null;
        rc stackOut_13_0 = null;
        rc stackOut_7_0 = null;
        rc stackOut_6_0 = null;
        var4 = (CharSequence) (Object) param1;
        if (!ck.a(var4, (byte) -114)) {
          return ec.field_d;
        } else {
          if (param0 == 95) {
            if (!param1.equals((Object) (Object) ((li) this).field_m)) {
              var3 = vl.a(param0 + -53, param1);
              if (var3 != null) {
                if (var3.field_b != null) {
                  return fi.field_u;
                } else {
                  L0: {
                    ((li) this).field_l = var3.field_f;
                    ((li) this).field_m = param1;
                    if (((li) this).field_l) {
                      stackOut_28_0 = hi.field_b;
                      stackIn_29_0 = stackOut_28_0;
                      break L0;
                    } else {
                      stackOut_27_0 = ec.field_d;
                      stackIn_29_0 = stackOut_27_0;
                      break L0;
                    }
                  }
                  return stackIn_29_0;
                }
              } else {
                return fi.field_u;
              }
            } else {
              L1: {
                if (((li) this).field_l) {
                  stackOut_21_0 = hi.field_b;
                  stackIn_22_0 = stackOut_21_0;
                  break L1;
                } else {
                  stackOut_20_0 = ec.field_d;
                  stackIn_22_0 = stackOut_20_0;
                  break L1;
                }
              }
              return stackIn_22_0;
            }
          } else {
            field_k = null;
            if (!param1.equals((Object) (Object) ((li) this).field_m)) {
              var3 = vl.a(param0 + -53, param1);
              if (var3 != null) {
                if (var3.field_b != null) {
                  return fi.field_u;
                } else {
                  L2: {
                    ((li) this).field_l = var3.field_f;
                    ((li) this).field_m = param1;
                    if (((li) this).field_l) {
                      stackOut_14_0 = hi.field_b;
                      stackIn_15_0 = stackOut_14_0;
                      break L2;
                    } else {
                      stackOut_13_0 = ec.field_d;
                      stackIn_15_0 = stackOut_13_0;
                      break L2;
                    }
                  }
                  return stackIn_15_0;
                }
              } else {
                return fi.field_u;
              }
            } else {
              L3: {
                if (((li) this).field_l) {
                  stackOut_7_0 = hi.field_b;
                  stackIn_8_0 = stackOut_7_0;
                  break L3;
                } else {
                  stackOut_6_0 = ec.field_d;
                  stackIn_8_0 = stackOut_6_0;
                  break L3;
                }
              }
              return stackIn_8_0;
            }
          }
        }
    }

    final static int a(int param0, Random param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param0 > 0) {
          if (nd.a((byte) -106, param0)) {
            return (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> -2044501920);
          } else {
            var3 = -(int)(4294967296L % (long)param0) + -2147483648;
            L0: while (true) {
              var4 = param1.nextInt();
              if (var3 <= var4) {
                continue L0;
              } else {
                if (param2) {
                  return -58;
                } else {
                  return ic.a(param0, (byte) -70, var4);
                }
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void g(int param0) {
        int var2 = 73 / ((param0 - 9) / 61);
        ((li) this).field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[]{0, 0, 1, 2, 4, 8, 15, 24, 36, 50, 50, 50, 50};
        field_j = false;
        field_o = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
