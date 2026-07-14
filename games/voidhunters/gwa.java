/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gwa extends rqa {
    static String field_p;
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = true;
          return new nc((Object) (Object) frb.a(65, 126));
        } else {
          return new nc((Object) (Object) frb.a(65, 126));
        }
    }

    gwa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, double param2, int param3, double param4) {
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (param1 != cd.field_c) {
          if (param0 == -1) {
            L0: {
              mlb.field_q = null;
              cd.field_c = param0;
              aib.field_c = param4;
              if (-1 != (rw.field_q ^ -1)) {
                break L0;
              } else {
                if (param3 >= -1) {
                  break L0;
                } else {
                  bfa.field_o = new ij();
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                }
              }
            }
            if (-1 != param3) {
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            } else {
              bfa.field_o = null;
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            }
          } else {
            L1: {
              cd.field_c = param0;
              aib.field_c = param4;
              if (-1 != rw.field_q) {
                break L1;
              } else {
                if (param3 >= -1) {
                  break L1;
                } else {
                  bfa.field_o = new ij();
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                }
              }
            }
            if (-1 != param3) {
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            } else {
              bfa.field_o = null;
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            }
          }
        } else {
          if (-1 < param0) {
            L2: {
              mlb.field_q = new ij();
              cd.field_c = param0;
              aib.field_c = param4;
              if (-1 != (rw.field_q ^ -1)) {
                break L2;
              } else {
                if (param3 >= -1) {
                  break L2;
                } else {
                  bfa.field_o = new ij();
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                }
              }
            }
            if (-1 != param3) {
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            } else {
              bfa.field_o = null;
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            }
          } else {
            if (param0 == -1) {
              mlb.field_q = null;
              cd.field_c = param0;
              aib.field_c = param4;
              if (-1 == rw.field_q) {
                if (param3 >= -1) {
                  L3: {
                    if (-1 == param3) {
                      bfa.field_o = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                } else {
                  bfa.field_o = new ij();
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                }
              } else {
                L4: {
                  if (-1 == param3) {
                    bfa.field_o = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                rw.field_q = param3;
                npa.field_c = param2;
                return;
              }
            } else {
              cd.field_c = param0;
              aib.field_c = param4;
              if (-1 == rw.field_q) {
                if (param3 >= -1) {
                  L5: {
                    if (-1 == param3) {
                      bfa.field_o = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                } else {
                  bfa.field_o = new ij();
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                }
              } else {
                L6: {
                  if (-1 == (param3 ^ -1)) {
                    bfa.field_o = null;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                rw.field_q = param3;
                npa.field_c = param2;
                return;
              }
            }
          }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "All players have left <%0>'s game.";
    }
}
