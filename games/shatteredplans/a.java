/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class a extends oh {
    int field_l;
    static String field_i;
    private int field_n;
    private int field_m;
    private boolean field_k;
    static int field_j;
    int field_h;

    public static void a(byte param0) {
        if (param0 != 15) {
            int discarded$0 = a.a(-111, -63);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final void c(int param0, int param1, int param2) {
        if (param1 != 2) {
            ((a) this).field_h = 109;
        }
    }

    final static qr a(int param0) {
        return qs.field_y.field_xb;
    }

    final void d(int param0, int param1, int param2) {
        if (param2 != -30872) {
            ((a) this).field_m = -77;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (!((a) this).field_k) {
          return false;
        } else {
          param0 = param0 - ((a) this).field_l;
          param2 = param2 - ((a) this).field_h;
          if (param1 == -19255) {
            if (0 <= param0) {
              if (param2 >= 0) {
                if (param0 < ((a) this).field_n) {
                  if (((a) this).field_m <= param2) {
                    return false;
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
            return true;
          }
        }
    }

    final a b(int param0, int param1, int param2) {
        if (this.a(param1, -19255, param2)) {
            return (a) this;
        }
        if (param0 <= -108) {
            return null;
        }
        ((a) this).field_h = -25;
        return null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 != param0) {
          if (param0 > 0) {
            L0: {
              var2 = 1;
              if (param0 <= 65535) {
                break L0;
              } else {
                var2 += 16;
                param0 = param0 >> 16;
                break L0;
              }
            }
            L1: {
              if (param0 > 255) {
                param0 = param0 >> 8;
                var2 += 8;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 <= 15) {
                break L2;
              } else {
                param0 = param0 >> 4;
                var2 += 4;
                break L2;
              }
            }
            L3: {
              if (3 < param0) {
                var2 += 2;
                param0 = param0 >> 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 > 1) {
                param0 = param0 >> 1;
                var2++;
                break L4;
              } else {
                break L4;
              }
            }
            return var2;
          } else {
            if (param1 == 1) {
              L5: {
                var2 = 2;
                if (param0 >= -65536) {
                  break L5;
                } else {
                  var2 += 16;
                  param0 = param0 >> 16;
                  break L5;
                }
              }
              L6: {
                if (param0 >= -256) {
                  break L6;
                } else {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L6;
                }
              }
              L7: {
                if (param0 < -16) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param0 >= -4) {
                  break L8;
                } else {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L8;
                }
              }
              L9: {
                if (param0 < -2) {
                  param0 = param0 >> 1;
                  var2++;
                  break L9;
                } else {
                  break L9;
                }
              }
              return var2;
            } else {
              L10: {
                field_j = 112;
                var2 = 2;
                if (param0 >= -65536) {
                  break L10;
                } else {
                  var2 += 16;
                  param0 = param0 >> 16;
                  break L10;
                }
              }
              L11: {
                if (param0 >= -256) {
                  break L11;
                } else {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L11;
                }
              }
              L12: {
                if (param0 < -16) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (param0 >= -4) {
                  break L13;
                } else {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L13;
                }
              }
              L14: {
                if (param0 < -2) {
                  param0 = param0 >> 1;
                  var2++;
                  break L14;
                } else {
                  break L14;
                }
              }
              return var2;
            }
          }
        } else {
          return 0;
        }
    }

    private a() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "All achievements are available only in rated games.";
    }
}
