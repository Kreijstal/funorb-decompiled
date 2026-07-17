/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cj extends bw {
    static volatile int field_f;
    int field_h;
    static int field_i;
    int field_j;
    static String field_g;

    abstract void a(lu param0, int param1);

    final static boolean b(boolean param0) {
        return dma.field_a || bp.e(-29919);
    }

    abstract at a(int param0, gj param1);

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        ch.field_p = null;
        hla.field_s = null;
        ds.field_m = 0;
        var2 = nj.field_f;
        nj.field_f = gp.field_x;
        gp.field_x = var2;
        if (51 != param0) {
          if (param0 == 50) {
            aka.field_G.field_k = 5;
            aka.field_G.field_e = aka.field_G.field_e + 1;
            if (param1 == 1) {
              if (aka.field_G.field_e < 2) {
                if (2 > aka.field_G.field_e) {
                  if (4 > aka.field_G.field_e) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (param0 == 50) {
                    return 5;
                  } else {
                    if (4 > aka.field_G.field_e) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if (param0 == 51) {
                  return 2;
                } else {
                  if (2 > aka.field_G.field_e) {
                    if (4 > aka.field_G.field_e) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    if (param0 == 50) {
                      return 5;
                    } else {
                      if (4 > aka.field_G.field_e) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
            } else {
              return -49;
            }
          } else {
            aka.field_G.field_k = 1;
            aka.field_G.field_e = aka.field_G.field_e + 1;
            if (param1 == 1) {
              if (aka.field_G.field_e < 2) {
                if (2 > aka.field_G.field_e) {
                  if (4 > aka.field_G.field_e) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (param0 == 50) {
                    return 5;
                  } else {
                    if (4 > aka.field_G.field_e) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if (param0 == 51) {
                  return 2;
                } else {
                  if (2 > aka.field_G.field_e) {
                    if (4 > aka.field_G.field_e) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    if (param0 == 50) {
                      return 5;
                    } else {
                      if (4 > aka.field_G.field_e) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
            } else {
              return -49;
            }
          }
        } else {
          aka.field_G.field_k = 2;
          aka.field_G.field_e = aka.field_G.field_e + 1;
          if (param1 == 1) {
            if (aka.field_G.field_e >= 2) {
              if (param0 == 51) {
                return 2;
              } else {
                if (2 <= aka.field_G.field_e) {
                  if (param0 == 50) {
                    return 5;
                  } else {
                    if (4 > aka.field_G.field_e) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (4 > aka.field_G.field_e) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (2 > aka.field_G.field_e) {
                if (4 > aka.field_G.field_e) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param0 == 50) {
                  return 5;
                } else {
                  if (4 > aka.field_G.field_e) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            return -49;
          }
        }
    }

    abstract void a(op param0, boolean param1);

    cj(int param0) {
        ((cj) this).field_h = param0;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -51) {
            cj.a(45);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_f = 0;
        field_g = "to keep fullscreen or";
    }
}
