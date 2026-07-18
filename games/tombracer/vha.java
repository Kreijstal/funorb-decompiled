/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vha {
    static int field_b;
    static pma field_c;
    static iu field_a;

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (vo.field_b) {
          L0: {
            rua.field_gb.c(-59, param2);
            var4 = kga.field_n.h(0) ? 1 : 0;
            if (0 == hf.field_b) {
              break L0;
            } else {
              if (var4 == 0) {
                la.l(2097152);
                param2 = false;
                break L0;
              } else {
                if (param2) {
                  kga.field_n.a(param0, param3, (byte) -115);
                  if (var4 != 0) {
                    rua.field_gb.c(30, param2);
                    var5 = kga.field_n.g(22514) - -kga.field_n.field_q;
                    if (640 >= var5) {
                      if (var5 < 635) {
                        if (wv.field_j > 0) {
                          wv.field_j = wv.field_j - 5;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      wv.field_j = wv.field_j + 5;
                      return;
                    }
                  } else {
                    var5 = kga.field_n.g(22514) - -kga.field_n.field_q;
                    if (640 >= var5) {
                      if (var5 < 635) {
                        if (wv.field_j <= 0) {
                          return;
                        } else {
                          wv.field_j = wv.field_j - 5;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      wv.field_j = wv.field_j + 5;
                      return;
                    }
                  }
                } else {
                  L1: {
                    rua.field_gb.c(30, param2);
                    var5 = kga.field_n.g(22514) - -kga.field_n.field_q;
                    if (640 < var5) {
                      wv.field_j = wv.field_j + 5;
                      break L1;
                    } else {
                      if (var5 >= 635) {
                        break L1;
                      } else {
                        if (wv.field_j > 0) {
                          wv.field_j = wv.field_j - 5;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          if (!param2) {
            if (var4 == 0) {
              var5 = kga.field_n.g(22514) - -kga.field_n.field_q;
              if (640 < var5) {
                wv.field_j = wv.field_j + 5;
                return;
              } else {
                if (var5 >= 635) {
                  return;
                } else {
                  if (wv.field_j > 0) {
                    wv.field_j = wv.field_j - 5;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              rua.field_gb.c(30, param2);
              var5 = kga.field_n.g(22514) - -kga.field_n.field_q;
              if (640 >= var5) {
                if (var5 < 635) {
                  if (wv.field_j <= 0) {
                    return;
                  } else {
                    wv.field_j = wv.field_j - 5;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                wv.field_j = wv.field_j + 5;
                return;
              }
            }
          } else {
            kga.field_n.a(param0, param3, (byte) -115);
            if (var4 == 0) {
              var5 = kga.field_n.g(22514) - -kga.field_n.field_q;
              if (640 >= var5) {
                if (var5 < 635) {
                  if (wv.field_j <= 0) {
                    return;
                  } else {
                    wv.field_j = wv.field_j - 5;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                wv.field_j = wv.field_j + 5;
                return;
              }
            } else {
              rua.field_gb.c(30, param2);
              var5 = kga.field_n.g(22514) - -kga.field_n.field_q;
              if (640 >= var5) {
                if (var5 < 635) {
                  if (wv.field_j > 0) {
                    wv.field_j = wv.field_j - 5;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                wv.field_j = wv.field_j + 5;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, boolean param6, int param7, int param8, boolean param9, int param10, boolean param11) {
        fna.a(param4, 16777215, param9, param11, param3, -22919, 16777215, param7, true, param1, param8, param6, param10, param2);
        if (param5 < 12) {
            vha.a(true, -67, 8, false, -52, 39, true, -85, -41, false, -10, true);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = new iu(540, 140);
    }
}
