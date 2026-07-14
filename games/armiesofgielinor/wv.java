/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wv extends af {
    private long field_f;
    static wk[] field_h;
    static String field_d;
    private String field_i;
    static int[] field_g;
    static String field_e;

    final void a(vh param0, int param1) {
        param0.a(((wv) this).field_f, 38359632);
        param0.a(-28, ((wv) this).field_i);
        if (param1 != -11436) {
            Object var4 = null;
            ((wv) this).a((vh) null, 16);
        }
    }

    public static void c(byte param0) {
        field_h = null;
        if (param0 != -3) {
          wv.c((byte) 69);
          field_e = null;
          field_g = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3 = 0;
        Object var4 = null;
        if (param1 == 10) {
          L0: {
            pl.field_A = false;
            ac.field_n = false;
            if (qc.field_a == null) {
              break L0;
            } else {
              if (!qc.field_a.field_L) {
                break L0;
              } else {
                L1: {
                  if (8 == param2) {
                    L2: {
                      if (fh.field_i) {
                        param0 = rq.field_o;
                        break L2;
                      } else {
                        param0 = rs.field_x;
                        break L2;
                      }
                    }
                    param2 = 2;
                    np.field_Qb.a(-17376, ga.field_d);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  var3 = 1;
                  if (param2 != 10) {
                    break L3;
                  } else {
                    ek.a((byte) -99);
                    var3 = 0;
                    break L3;
                  }
                }
                L4: {
                  if (var3 != 0) {
                    L5: {
                      if (!pl.field_A) {
                        break L5;
                      } else {
                        param0 = fo.a(4800, field_d, new String[1]);
                        break L5;
                      }
                    }
                    L6: {
                      if (se.field_f) {
                        param0 = be.field_D;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    qc.field_a.a(param2, (byte) 98, param0);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if ((param2 ^ -1) == -257) {
                  break L0;
                } else {
                  if (10 == param2) {
                    break L0;
                  } else {
                    if (fh.field_i) {
                      break L0;
                    } else {
                      np.field_Qb.a((byte) -111);
                      return;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          var4 = null;
          wv.a((String) null, -77, -29);
          pl.field_A = false;
          ac.field_n = false;
          if (qc.field_a != null) {
            if (qc.field_a.field_L) {
              L7: {
                if (8 == param2) {
                  L8: {
                    if (fh.field_i) {
                      param0 = rq.field_o;
                      break L8;
                    } else {
                      param0 = rs.field_x;
                      break L8;
                    }
                  }
                  param2 = 2;
                  np.field_Qb.a(-17376, ga.field_d);
                  break L7;
                } else {
                  break L7;
                }
              }
              L9: {
                var3 = 1;
                if (param2 != 10) {
                  break L9;
                } else {
                  ek.a((byte) -99);
                  var3 = 0;
                  break L9;
                }
              }
              L10: {
                if (var3 != 0) {
                  L11: {
                    if (!pl.field_A) {
                      break L11;
                    } else {
                      param0 = fo.a(4800, field_d, new String[1]);
                      break L11;
                    }
                  }
                  L12: {
                    if (se.field_f) {
                      param0 = be.field_D;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  qc.field_a.a(param2, (byte) 98, param0);
                  break L10;
                } else {
                  break L10;
                }
              }
              L13: {
                if ((param2 ^ -1) == -257) {
                  break L13;
                } else {
                  if (10 == param2) {
                    break L13;
                  } else {
                    if (fh.field_i) {
                      break L13;
                    } else {
                      np.field_Qb.a((byte) -111);
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    h a(byte param0) {
        int var2 = -93 / ((param0 - -63) / 45);
        return fl.field_u;
    }

    wv(long param0, String param1) {
        ((wv) this).field_i = param1;
        ((wv) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[]{0, 130, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, -30, 120, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 30, 0, 0, 30, -30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_d = "Connection lost. <%0>";
        field_e = "Purchase";
    }
}
