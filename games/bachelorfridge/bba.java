/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bba {
    int field_d;
    int field_c;
    boolean field_e;
    private boolean field_b;
    private hs field_a;

    final void a(byte param0) {
        ((bba) this).field_d = ((bba) this).field_a.field_b - 2;
        if (param0 >= -62) {
            ((bba) this).field_e = false;
        }
    }

    final void b(int param0) {
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 == 10) {
          if (null != ((bba) this).field_a) {
            if (((bba) this).field_b) {
              if (0 < ((bba) this).field_d) {
                ((bba) this).field_d = ((bba) this).field_d - ((bba) this).field_c;
                return;
              } else {
                return;
              }
            } else {
              if (((bba) this).field_a.field_d != 6) {
                if ((((bba) this).field_a.field_d ^ -1) != -6) {
                  if (10 == ((bba) this).field_a.field_d) {
                    if (((bba) this).field_d >= ((bba) this).field_a.field_b - 2) {
                      if (((bba) this).field_a.field_d != 6) {
                        if (((bba) this).field_b) {
                          ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                          return;
                        } else {
                          ((bba) this).field_e = true;
                          ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                          return;
                        }
                      } else {
                        ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                        return;
                      }
                    } else {
                      ((bba) this).field_d = ((bba) this).field_d + ((bba) this).field_c;
                      return;
                    }
                  } else {
                    if (-2 + ((bba) this).field_a.field_b <= ((bba) this).field_d) {
                      ((bba) this).field_d = 0;
                      return;
                    } else {
                      ((bba) this).field_d = ((bba) this).field_d + ((bba) this).field_c;
                      return;
                    }
                  }
                } else {
                  if (((bba) this).field_d >= ((bba) this).field_a.field_b - 2) {
                    if (((bba) this).field_a.field_d != 6) {
                      if (((bba) this).field_b) {
                        ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                        return;
                      } else {
                        ((bba) this).field_e = true;
                        ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                        return;
                      }
                    } else {
                      ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                      return;
                    }
                  } else {
                    ((bba) this).field_d = ((bba) this).field_d + ((bba) this).field_c;
                    return;
                  }
                }
              } else {
                if (((bba) this).field_d >= ((bba) this).field_a.field_b - 2) {
                  if (((bba) this).field_a.field_d != 6) {
                    if (((bba) this).field_b) {
                      ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                      return;
                    } else {
                      ((bba) this).field_e = true;
                      ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                      return;
                    }
                  } else {
                    ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                    return;
                  }
                } else {
                  ((bba) this).field_d = ((bba) this).field_d + ((bba) this).field_c;
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final nla a(int param0) {
        if (((bba) this).field_a != null) {
          if (param0 >= -94) {
            ((bba) this).field_b = true;
            return ((bba) this).field_a.a(((bba) this).field_d, (byte) 107);
          } else {
            return ((bba) this).field_a.a(((bba) this).field_d, (byte) 107);
          }
        } else {
          return null;
        }
    }

    bba(hs param0, boolean param1) {
        ((bba) this).field_c = 1;
        ((bba) this).field_b = param1 ? true : false;
        ((bba) this).field_a = param0;
        if (((bba) this).field_b) {
            ((bba) this).a((byte) -115);
        }
    }

    static {
    }
}
