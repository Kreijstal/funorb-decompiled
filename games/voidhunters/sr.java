/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr {
    int field_f;
    int field_d;
    boolean field_a;
    int field_g;
    int field_e;
    boolean field_c;
    int field_b;

    final void a(int param0, ds param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = VoidHunters.field_G;
        if (param2 != 11) {
          var6 = null;
          this.a(-11, (ds) null, -118, true);
          L0: while (true) {
            var4 = param1.e((byte) -127);
            if (var4 != 0) {
              this.a(param0, param1, var4, false);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            var4 = param1.e((byte) -127);
            if (var4 != 0) {
              this.a(param0, param1, var4, false);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    private final void a(int param0, ds param1, int param2, boolean param3) {
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param3) {
          ((sr) this).field_b = 77;
          if (1 != param2) {
            if (-3 != param2) {
              if (-4 != param2) {
                if ((param2 ^ -1) != -5) {
                  if (param2 != -6) {
                    if (6 != param2) {
                      if (-8 != param2) {
                        return;
                      } else {
                        ((sr) this).field_a = true;
                        return;
                      }
                    } else {
                      ((sr) this).field_c = true;
                      return;
                    }
                  } else {
                    ((sr) this).field_d = param1.e((byte) -126);
                    return;
                  }
                } else {
                  ((sr) this).field_f = param1.e((byte) -108);
                  return;
                }
              } else {
                byte discarded$2 = param1.d((byte) -114);
                return;
              }
            } else {
              ((sr) this).field_g = param1.e(1869) + 1;
              ((sr) this).field_b = param1.e(1869) + 1;
              return;
            }
          } else {
            ((sr) this).field_e = param1.e(1869);
            if (((sr) this).field_e != 65535) {
              return;
            } else {
              ((sr) this).field_e = -1;
              return;
            }
          }
        } else {
          if (1 != param2) {
            if (-3 != param2) {
              if (-4 != param2) {
                if ((param2 ^ -1) != -5) {
                  if (param2 != -6) {
                    if (6 != param2) {
                      if (-8 == param2) {
                        ((sr) this).field_a = true;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((sr) this).field_c = true;
                      return;
                    }
                  } else {
                    ((sr) this).field_d = param1.e((byte) -126);
                    return;
                  }
                } else {
                  ((sr) this).field_f = param1.e((byte) -108);
                  return;
                }
              } else {
                byte discarded$3 = param1.d((byte) -114);
                return;
              }
            } else {
              ((sr) this).field_g = param1.e(1869) + 1;
              ((sr) this).field_b = param1.e(1869) + 1;
              return;
            }
          } else {
            ((sr) this).field_e = param1.e(1869);
            if (((sr) this).field_e != 65535) {
              return;
            } else {
              ((sr) this).field_e = -1;
              return;
            }
          }
        }
    }

    sr() {
        ((sr) this).field_a = false;
        ((sr) this).field_d = 1;
        ((sr) this).field_f = 2;
        ((sr) this).field_e = -1;
        ((sr) this).field_c = false;
        ((sr) this).field_g = 64;
        ((sr) this).field_b = 64;
    }

    static {
    }
}
