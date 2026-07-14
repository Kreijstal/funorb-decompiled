/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends ie {
    static ri[] field_C;
    static int[] field_z;
    static int[] field_B;

    we(int param0, int param1, int param2, int param3, mh param4, pk param5) {
        super(param0, param1, param2, param3, param4, (qm) null);
        ((we) this).field_y = param5;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 < -35) {
          L0: {
            if (param3 != -1) {
              break L0;
            } else {
              if (((we) this).field_w == null) {
                break L0;
              } else {
                ((we) this).field_w.a((pk) this, param1, 5592405, true, param0);
                if (-1 != ((we) this).field_q) {
                  if (((we) this).field_p != 0) {
                    ks.field_x.a(((we) this).field_p + param1 - -((we) this).field_v, param0 + ((we) this).field_r, ((we) this).field_v + param1, (byte) -106, param0 + ((we) this).field_r - -((we) this).field_q);
                    ((we) this).field_y.a(((we) this).field_r + param0, ((we) this).field_v + param1, (byte) -95, param3);
                    ks.field_x.b((byte) -84);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (-1 != (((we) this).field_q ^ -1)) {
            if (((we) this).field_p != 0) {
              ks.field_x.a(((we) this).field_p + param1 - -((we) this).field_v, param0 + ((we) this).field_r, ((we) this).field_v + param1, (byte) -106, param0 + ((we) this).field_r - -((we) this).field_q);
              ((we) this).field_y.a(((we) this).field_r + param0, ((we) this).field_v + param1, (byte) -95, param3);
              ks.field_x.b((byte) -84);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          we.a((byte) -109);
          if (param3 == -1) {
            if (((we) this).field_w != null) {
              ((we) this).field_w.a((pk) this, param1, 5592405, true, param0);
              if (-1 != (((we) this).field_q ^ -1)) {
                if (((we) this).field_p != 0) {
                  ks.field_x.a(((we) this).field_p + param1 - -((we) this).field_v, param0 + ((we) this).field_r, ((we) this).field_v + param1, (byte) -106, param0 + ((we) this).field_r - -((we) this).field_q);
                  ((we) this).field_y.a(((we) this).field_r + param0, ((we) this).field_v + param1, (byte) -95, param3);
                  ks.field_x.b((byte) -84);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (-1 != (((we) this).field_q ^ -1)) {
                if (((we) this).field_p == 0) {
                  return;
                } else {
                  ks.field_x.a(((we) this).field_p + param1 - -((we) this).field_v, param0 + ((we) this).field_r, ((we) this).field_v + param1, (byte) -106, param0 + ((we) this).field_r - -((we) this).field_q);
                  ((we) this).field_y.a(((we) this).field_r + param0, ((we) this).field_v + param1, (byte) -95, param3);
                  ks.field_x.b((byte) -84);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (-1 != ((we) this).field_q) {
              if (((we) this).field_p == 0) {
                return;
              } else {
                ks.field_x.a(((we) this).field_p + param1 - -((we) this).field_v, param0 + ((we) this).field_r, ((we) this).field_v + param1, (byte) -106, param0 + ((we) this).field_r - -((we) this).field_q);
                ((we) this).field_y.a(((we) this).field_r + param0, ((we) this).field_v + param1, (byte) -95, param3);
                ks.field_x.b((byte) -84);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 <= -42) {
          if (((we) this).b(param5, -1, param4, param2, param6)) {
            if (!super.a(param0, -55, param2, param3, param4, param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_C = null;
          if (((we) this).b(param5, -1, param4, param2, param6)) {
            if (!super.a(param0, -55, param2, param3, param4, param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean g(int param0) {
        if (param0 == -1) {
          if (10 <= jv.field_a) {
            if ((mp.field_a ^ -1) > -14) {
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
    }

    public static void e(boolean param0) {
        field_C = null;
        field_B = null;
        field_z = null;
        if (param0) {
            field_C = null;
        }
    }

    final void d(boolean param0) {
        ((we) this).field_y.c(param0);
    }

    final static void e(byte param0) {
        qv.field_o = ig.field_a.d(-1);
        int var1 = 74 % ((60 - param0) / 52);
        CharSequence var2 = (CharSequence) (Object) qv.field_o;
        tc.field_f = uk.a(-1, var2);
    }

    final static void a(byte param0) {
        if ((jv.field_a ^ -1) == -11) {
          ch.a(0);
          jv.field_a = 11;
          if (param0 <= 10) {
            return;
          } else {
            ch.field_h = true;
            return;
          }
        } else {
          if (!au.c(1)) {
            ch.a(0);
            jv.field_a = 11;
            if (param0 <= 10) {
              return;
            } else {
              ch.field_h = true;
              return;
            }
          } else {
            if (param0 <= 10) {
              return;
            } else {
              ch.field_h = true;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[8192];
    }
}
