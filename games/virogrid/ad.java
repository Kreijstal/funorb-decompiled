/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static String field_f;
    static String field_a;
    static mg field_b;
    static String field_j;
    private eh field_k;
    private sl field_d;
    static boolean field_h;
    static boolean field_l;
    private eh field_e;
    static int field_i;
    static int field_c;
    static double[] field_g;

    final th a(byte param0, int param1) {
        th var3 = null;
        byte[] var4 = null;
        th var5 = null;
        th var6 = null;
        if (param0 == 125) {
          var3 = (th) ((ad) this).field_d.b((long)param1, 0);
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if ((param1 ^ -1) > -32769) {
                var4 = ((ad) this).field_e.a(1, param1, 0);
                break L0;
              } else {
                var4 = ((ad) this).field_k.a(1, 32767 & param1, 0);
                break L0;
              }
            }
            var6 = new th();
            if (var4 != null) {
              L1: {
                var6.a(new jc(var4), 0);
                if (-32769 >= (param1 ^ -1)) {
                  var6.d(false);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((ad) this).field_d.a((Object) (Object) var6, (long)param1, param0 ^ -14619);
              return var6;
            } else {
              L2: {
                if (-32769 >= (param1 ^ -1)) {
                  var6.d(false);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((ad) this).field_d.a((Object) (Object) var6, (long)param1, param0 ^ -14619);
              return var6;
            }
          }
        } else {
          field_c = -78;
          var3 = (th) ((ad) this).field_d.b((long)param1, 0);
          if (var3 != null) {
            return var3;
          } else {
            L3: {
              if ((param1 ^ -1) > -32769) {
                var4 = ((ad) this).field_e.a(1, param1, 0);
                break L3;
              } else {
                var4 = ((ad) this).field_k.a(1, 32767 & param1, 0);
                break L3;
              }
            }
            var5 = new th();
            var3 = var5;
            if (var4 == null) {
              L4: {
                if (-32769 >= (param1 ^ -1)) {
                  var5.d(false);
                  break L4;
                } else {
                  break L4;
                }
              }
              ((ad) this).field_d.a((Object) (Object) var5, (long)param1, param0 ^ -14619);
              return var5;
            } else {
              L5: {
                var5.a(new jc(var4), 0);
                if (-32769 >= (param1 ^ -1)) {
                  var5.d(false);
                  break L5;
                } else {
                  break L5;
                }
              }
              ((ad) this).field_d.a((Object) (Object) var5, (long)param1, param0 ^ -14619);
              return var5;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 90) {
            return;
        }
        field_a = null;
        field_f = null;
        field_j = null;
        field_g = null;
    }

    ad(int param0, eh param1, eh param2, be param3) {
        ((ad) this).field_d = new sl(64);
        ((ad) this).field_e = param1;
        ((ad) this).field_k = param2;
        if (((ad) this).field_e != null) {
            int discarded$0 = ((ad) this).field_e.d((byte) 91, 1);
        }
        if (null != ((ad) this).field_k) {
            int discarded$1 = ((ad) this).field_k.d((byte) 88, 1);
        }
    }

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (param1 == 15232) {
            if (kn.a(param0, (byte) -69)) {
              return true;
            } else {
              L0: {
                if (45 == param0) {
                  break L0;
                } else {
                  if (param0 == 160) {
                    break L0;
                  } else {
                    if (32 == param0) {
                      break L0;
                    } else {
                      if (95 == param0) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            }
          } else {
            boolean discarded$1 = ad.a(')', -111);
            if (kn.a(param0, (byte) -69)) {
              return true;
            } else {
              if (45 != param0) {
                if (param0 != 160) {
                  if (32 != param0) {
                    if (95 == param0) {
                      return true;
                    } else {
                      return false;
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> would need a rating of <%1> to play with the current options.";
        field_l = true;
        field_f = "ON";
        field_c = 22;
    }
}
