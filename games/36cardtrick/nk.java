/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    boolean field_b;
    boolean field_e;
    int field_g;
    String field_d;
    String[] field_c;
    static int[] field_a;
    static String[] field_f;

    final static ff a(int param0, boolean param1, long param2, String param3, String param4) {
        if (param0 < -78) {
          if ((param2 ^ -1L) == -1L) {
            if (param3 == null) {
              if (param1) {
                return (ff) (Object) new rb(param2, param4);
              } else {
                return (ff) (Object) new mi(param2, param4);
              }
            } else {
              return (ff) (Object) new jl(param3, param4);
            }
          } else {
            if (param1) {
              return (ff) (Object) new rb(param2, param4);
            } else {
              return (ff) (Object) new mi(param2, param4);
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
            nk.a(47);
            field_f = null;
            field_a = null;
            return;
        }
        field_f = null;
        field_a = null;
    }

    final static void a(int param0, int param1, String param2) {
        int var3 = 0;
        r.field_p = false;
        cg.field_f = false;
        if (pc.field_a != null) {
          if (pc.field_a.field_E) {
            L0: {
              if (-9 != (param0 ^ -1)) {
                break L0;
              } else {
                L1: {
                  if (ei.field_e) {
                    param2 = rl.field_t;
                    break L1;
                  } else {
                    param2 = jh.field_d;
                    break L1;
                  }
                }
                param0 = 2;
                i.field_a.a(ng.field_y, -95);
                break L0;
              }
            }
            L2: {
              var3 = 1;
              if ((param0 ^ -1) != -11) {
                break L2;
              } else {
                var3 = 0;
                di.b(param1 ^ -10);
                break L2;
              }
            }
            L3: {
              if (var3 == 0) {
                break L3;
              } else {
                L4: {
                  if (cg.field_f) {
                    param2 = re.a(lk.field_p, new String[1], (byte) -50);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (ij.field_g) {
                    param2 = ph.field_a;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                pc.field_a.a(param2, (byte) -109, param0);
                break L3;
              }
            }
            L6: {
              if (-257 == (param0 ^ -1)) {
                break L6;
              } else {
                if ((param0 ^ -1) == -11) {
                  break L6;
                } else {
                  if (!ei.field_e) {
                    i.field_a.l(-31940);
                    break L6;
                  } else {
                    if (param1 != -9) {
                      nk.a(40);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (param1 != -9) {
              nk.a(40);
              return;
            } else {
              return;
            }
          } else {
            if (param1 == -9) {
              return;
            } else {
              nk.a(40);
              return;
            }
          }
        } else {
          if (param1 != -9) {
            nk.a(40);
            return;
          } else {
            return;
          }
        }
    }

    nk(boolean param0) {
        ((nk) this).field_b = param0 ? true : false;
    }

    final static lb a(boolean param0, String param1) {
        if (param0) {
            field_f = null;
            return new lb(param1);
        }
        return new lb(param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
