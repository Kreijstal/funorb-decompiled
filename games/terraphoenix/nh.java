/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends rf {
    static String field_D;
    byte field_G;
    dh field_H;
    static int[] field_E;
    int field_F;

    final static nb a(long param0, boolean param1, int param2, String param3, String param4) {
        if (0L != param0) {
          if (param1) {
            return (nb) (Object) new ml(param0, param3);
          } else {
            if (param2 > -49) {
              return null;
            } else {
              return (nb) (Object) new hb(param0, param3);
            }
          }
        } else {
          if (param4 == null) {
            if (param1) {
              return (nb) (Object) new ml(param0, param3);
            } else {
              if (param2 > -49) {
                return null;
              } else {
                return (nb) (Object) new hb(param0, param3);
              }
            }
          } else {
            return (nb) (Object) new mi(param4, param3);
          }
        }
    }

    public static void d(int param0) {
        Object var2 = null;
        if (param0 != 30937) {
          var2 = null;
          String discarded$2 = nh.a(-94, (CharSequence) null);
          field_D = null;
          field_E = null;
          return;
        } else {
          field_D = null;
          field_E = null;
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = Terraphoenix.field_V;
          var2 = param1.length();
          if (20 < var2) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var2 <= var4) {
            if (param0 != -31621) {
              return null;
            } else {
              return new String(var8);
            }
          } else {
            L2: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L2;
              } else {
                if (90 >= var5) {
                  var3[var4] = (char)(var5 + 32);
                  var4++;
                  var4++;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (var5 < 97) {
                  break L4;
                } else {
                  if (var5 <= 122) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (48 > var5) {
                  break L5;
                } else {
                  if (var5 > 57) {
                    break L5;
                  } else {
                    break L3;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              var4++;
              continue L1;
            }
            var3[var4] = (char)var5;
            var4++;
            var4++;
            continue L1;
          }
        }
    }

    final static boolean a(fa param0, fa param1, boolean param2, fa param3) {
        if (param3.a(0)) {
          if (param3.a(-3, "commonui")) {
            if (param0.a(0)) {
              if (param0.a(-3, "commonui")) {
                if (!param2) {
                  if (param1.a(0)) {
                    if (!param1.a(-3, "button.gif")) {
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
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final byte[] b(boolean param0) {
        if (param0) {
          if (!((nh) this).field_A) {
            if (-((nh) this).field_G + ((nh) this).field_H.field_i.length > ((nh) this).field_H.field_k) {
              throw new RuntimeException();
            } else {
              return ((nh) this).field_H.field_i;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return null;
        }
    }

    nh() {
    }

    final int c(int param0) {
        if (((nh) this).field_H != null) {
          if (param0 != 0) {
            return -30;
          } else {
            return 100 * ((nh) this).field_H.field_k / (((nh) this).field_H.field_i.length - ((nh) this).field_G);
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new int[]{1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 3, 3, 3, 2, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 2, 3, 3, 3, 2, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }
}
