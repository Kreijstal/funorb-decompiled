/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends rqa {
    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 0) {
            return false;
        }
        return ve.a(false, (byte) 100, param0);
    }

    final static void a(int param0) {
        int var2 = 0;
        var2 = VoidHunters.field_G;
        if (0 < lia.field_b) {
          lia.field_b = lia.field_b - 1;
          if ((lia.field_b ^ -1) >= param0) {
            if (nf.field_a >= -1) {
              if (-1 <= (tba.field_p ^ -1)) {
                return;
              } else {
                lkb.a(tba.field_p, (byte) -124);
                return;
              }
            } else {
              lkb.a(nf.field_a, (byte) -107);
              if (-1 >= tba.field_p) {
                return;
              } else {
                lkb.a(tba.field_p, (byte) -124);
                return;
              }
            }
          } else {
            moa.a(true);
            if (nf.field_a >= -1) {
              if (-1 <= (tba.field_p ^ -1)) {
                return;
              } else {
                lkb.a(tba.field_p, (byte) -124);
                return;
              }
            } else {
              lkb.a(nf.field_a, (byte) -107);
              if (-1 < tba.field_p) {
                lkb.a(tba.field_p, (byte) -124);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if ((nf.field_a ^ -1) < -1) {
            nf.field_a = nf.field_a - 1;
            if ((lia.field_b ^ -1) >= param0) {
              if (nf.field_a >= -1) {
                if (-1 <= (tba.field_p ^ -1)) {
                  return;
                } else {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                }
              } else {
                lkb.a(nf.field_a, (byte) -107);
                if (-1 >= tba.field_p) {
                  return;
                } else {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                }
              }
            } else {
              moa.a(true);
              if (nf.field_a >= -1) {
                if (-1 <= (tba.field_p ^ -1)) {
                  return;
                } else {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                }
              } else {
                lkb.a(nf.field_a, (byte) -107);
                if (-1 < tba.field_p) {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (tba.field_p <= 0) {
              if ((lia.field_b ^ -1) >= param0) {
                if (nf.field_a >= -1) {
                  if (-1 <= (tba.field_p ^ -1)) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                } else {
                  lkb.a(nf.field_a, (byte) -107);
                  if (-1 >= tba.field_p) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                }
              } else {
                moa.a(true);
                if (nf.field_a >= -1) {
                  if (-1 <= (tba.field_p ^ -1)) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                } else {
                  lkb.a(nf.field_a, (byte) -107);
                  if (-1 >= tba.field_p) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                }
              }
            } else {
              tba.field_p = tba.field_p - 1;
              if ((lia.field_b ^ -1) < param0) {
                moa.a(true);
                if (nf.field_a < -1) {
                  lkb.a(nf.field_a, (byte) -107);
                  if (-1 > (tba.field_p ^ -1)) {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (-1 < tba.field_p) {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (nf.field_a >= -1) {
                  if (-1 < tba.field_p) {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  } else {
                    return;
                  }
                } else {
                  lkb.a(nf.field_a, (byte) -107);
                  if (-1 < tba.field_p) {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc(via.field_b);
    }

    oc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
