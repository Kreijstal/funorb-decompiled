/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pmb extends rqa {
    static phb[] field_o;
    static int field_p;

    pmb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2) {
        if (nob.field_o == null) {
          return -1;
        } else {
          if (cab.field_r <= param2) {
            if (nob.field_o.field_q + cab.field_r > param2) {
              L0: {
                if (param1 < qtb.field_p) {
                  break L0;
                } else {
                  if (nob.field_o.field_p + qtb.field_p <= param1) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
              if (param0 == -1) {
                L1: {
                  if (qr.field_g > param2) {
                    break L1;
                  } else {
                    if (param2 >= qr.field_g + nob.field_o.field_q) {
                      break L1;
                    } else {
                      if (mqa.field_q > param1) {
                        break L1;
                      } else {
                        if (nob.field_o.field_p + mqa.field_q <= param1) {
                          break L1;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              } else {
                L2: {
                  int discarded$3 = pmb.a(109, -32, 51);
                  if (qr.field_g > param2) {
                    break L2;
                  } else {
                    if (param2 >= qr.field_g + nob.field_o.field_q) {
                      break L2;
                    } else {
                      if (mqa.field_q > param1) {
                        break L2;
                      } else {
                        if (nob.field_o.field_p + mqa.field_q <= param1) {
                          break L2;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              }
            } else {
              if (param0 == -1) {
                L3: {
                  if (qr.field_g > param2) {
                    break L3;
                  } else {
                    if (param2 >= qr.field_g + nob.field_o.field_q) {
                      break L3;
                    } else {
                      if (mqa.field_q > param1) {
                        break L3;
                      } else {
                        if (nob.field_o.field_p + mqa.field_q <= param1) {
                          break L3;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              } else {
                L4: {
                  int discarded$4 = pmb.a(109, -32, 51);
                  if (qr.field_g > param2) {
                    break L4;
                  } else {
                    if (param2 >= qr.field_g + nob.field_o.field_q) {
                      break L4;
                    } else {
                      if (mqa.field_q > param1) {
                        break L4;
                      } else {
                        if (nob.field_o.field_p + mqa.field_q <= param1) {
                          break L4;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              }
            }
          } else {
            if (param0 == -1) {
              L5: {
                if (qr.field_g > param2) {
                  break L5;
                } else {
                  if (param2 >= qr.field_g + nob.field_o.field_q) {
                    break L5;
                  } else {
                    if (mqa.field_q > param1) {
                      break L5;
                    } else {
                      if (nob.field_o.field_p + mqa.field_q <= param1) {
                        break L5;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              return -1;
            } else {
              int discarded$5 = pmb.a(109, -32, 51);
              if (qr.field_g <= param2) {
                if (param2 < qr.field_g + nob.field_o.field_q) {
                  if (mqa.field_q <= param1) {
                    if (nob.field_o.field_p + mqa.field_q > param1) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          }
        }
    }

    final static cp a(int param0, ds param1) {
        if (param0 < 121) {
          field_o = null;
          return new cp(param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.c((byte) -77), param1.e((byte) -113));
        } else {
          return new cp(param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.c((byte) -77), param1.e((byte) -113));
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(126, 108));
    }

    public static void a(int param0) {
        if (param0 != -1) {
            int discarded$0 = pmb.a(89, -110, -100);
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 1;
    }
}
