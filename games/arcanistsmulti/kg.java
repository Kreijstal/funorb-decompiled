/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static int field_b;
    static boolean field_f;
    private ig field_g;
    private eg field_e;
    static ec field_h;
    static kc field_c;
    static int[][] field_d;
    private eg field_i;
    static boolean field_a;

    public static void a(int param0) {
        field_h = null;
        field_d = null;
        field_c = null;
        if (param0 != 0) {
            field_a = true;
        }
    }

    final oo a(int param0, int param1) {
        oo var3 = null;
        byte[] var4 = null;
        oo var5 = null;
        if (param0 == 3) {
          var3 = (oo) ((kg) this).field_g.a((long)param1, false);
          if (var3 == null) {
            L0: {
              if (32768 > param1) {
                var4 = ((kg) this).field_e.b(param1, param0 + 26216, 0);
                break L0;
              } else {
                var4 = ((kg) this).field_i.b(32767 & param1, 26219, 0);
                break L0;
              }
            }
            var5 = new oo();
            if (var4 == null) {
              if (param1 >= 32768) {
                var5.f(-94);
                ((kg) this).field_g.a((Object) (Object) var5, (long)param1, -65);
                return var5;
              } else {
                ((kg) this).field_g.a((Object) (Object) var5, (long)param1, -65);
                return var5;
              }
            } else {
              var5.a((byte) 116, new wk(var4));
              if (param1 < 32768) {
                ((kg) this).field_g.a((Object) (Object) var5, (long)param1, -65);
                return var5;
              } else {
                var5.f(-94);
                ((kg) this).field_g.a((Object) (Object) var5, (long)param1, -65);
                return var5;
              }
            }
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    kg(int param0, eg param1, eg param2) {
        ((kg) this).field_g = new ig(64);
        ((kg) this).field_i = param2;
        ((kg) this).field_e = param1;
        if (null != ((kg) this).field_e) {
            int discarded$0 = ((kg) this).field_e.a(0, (byte) -60);
        }
        if (((kg) this).field_i != null) {
            int discarded$1 = ((kg) this).field_i.a(0, (byte) -60);
        }
    }

    final static boolean a(long param0, boolean param1, String param2) {
        wa var4 = null;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        if (param1) {
          var4 = im.a(0, param2);
          if (var4 != null) {
            if (var4.field_Lb == null) {
              L0: {
                L1: {
                  if (wi.field_f == null) {
                    break L1;
                  } else {
                    if (vf.a(param0, 8192) == null) {
                      break L1;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L0;
                    }
                  }
                }
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                break L0;
              }
              return stackIn_30_0 != 0;
            } else {
              return true;
            }
          } else {
            L2: {
              L3: {
                if (wi.field_f == null) {
                  break L3;
                } else {
                  if (vf.a(param0, 8192) == null) {
                    break L3;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L2;
                  }
                }
              }
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L2;
            }
            return stackIn_23_0 != 0;
          }
        } else {
          field_b = 104;
          var4 = im.a(0, param2);
          if (var4 != null) {
            if (var4.field_Lb != null) {
              return true;
            } else {
              if (wi.field_f != null) {
                if (vf.a(param0, 8192) == null) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            if (wi.field_f != null) {
              if (vf.a(param0, 8192) == null) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_d = new int[4][3];
    }
}
