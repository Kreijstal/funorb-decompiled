/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ak field_f;
    static boolean field_b;
    static boolean[] field_g;
    static gh field_d;
    static String[] field_e;
    static kg field_a;
    static int field_h;
    static java.awt.Frame field_c;

    final static fh a(cm param0, String param1, cm param2, int param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param2.a(param1, 45);
        if (param3 != -1) {
          vd.a((byte) 19);
          var6 = param2.a(var5, -32759, param4);
          return dh.a(var5, var6, param2, (byte) 126, param0);
        } else {
          var6 = param2.a(var5, -32759, param4);
          return dh.a(var5, var6, param2, (byte) 126, param0);
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        var2 = SteelSentinels.field_G;
        if (-1 > je.field_t) {
          je.field_t = je.field_t - 1;
          if (-1 <= (je.field_t ^ -1)) {
            L0: {
              if (0 < bd.field_c) {
                vb.a((byte) 112, bd.field_c);
                break L0;
              } else {
                break L0;
              }
            }
            if (0 >= fj.field_f) {
              if (param0 == 63) {
                return;
              } else {
                vd.b((byte) 112);
                return;
              }
            } else {
              vb.a((byte) 84, fj.field_f);
              if (param0 == 63) {
                return;
              } else {
                vd.b((byte) 112);
                return;
              }
            }
          } else {
            L1: {
              bh.a(0);
              if (0 < bd.field_c) {
                vb.a((byte) 112, bd.field_c);
                break L1;
              } else {
                break L1;
              }
            }
            if (0 >= fj.field_f) {
              if (param0 == 63) {
                return;
              } else {
                vd.b((byte) 112);
                return;
              }
            } else {
              vb.a((byte) 84, fj.field_f);
              if (param0 != 63) {
                vd.b((byte) 112);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (-1 >= bd.field_c) {
            if (fj.field_f <= 0) {
              if (-1 <= (je.field_t ^ -1)) {
                L2: {
                  if (0 < bd.field_c) {
                    vb.a((byte) 112, bd.field_c);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (0 >= fj.field_f) {
                  if (param0 == 63) {
                    return;
                  } else {
                    vd.b((byte) 112);
                    return;
                  }
                } else {
                  vb.a((byte) 84, fj.field_f);
                  if (param0 == 63) {
                    return;
                  } else {
                    vd.b((byte) 112);
                    return;
                  }
                }
              } else {
                L3: {
                  bh.a(0);
                  if (0 < bd.field_c) {
                    vb.a((byte) 112, bd.field_c);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (0 >= fj.field_f) {
                  if (param0 == 63) {
                    return;
                  } else {
                    vd.b((byte) 112);
                    return;
                  }
                } else {
                  vb.a((byte) 84, fj.field_f);
                  if (param0 == 63) {
                    return;
                  } else {
                    vd.b((byte) 112);
                    return;
                  }
                }
              }
            } else {
              fj.field_f = fj.field_f - 1;
              if (-1 <= (je.field_t ^ -1)) {
                L4: {
                  if (0 < bd.field_c) {
                    vb.a((byte) 112, bd.field_c);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (0 >= fj.field_f) {
                  if (param0 != 63) {
                    vd.b((byte) 112);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L5: {
                    vb.a((byte) 84, fj.field_f);
                    if (param0 == 63) {
                      break L5;
                    } else {
                      vd.b((byte) 112);
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                L6: {
                  bh.a(0);
                  if (0 < bd.field_c) {
                    vb.a((byte) 112, bd.field_c);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (0 >= fj.field_f) {
                    break L7;
                  } else {
                    vb.a((byte) 84, fj.field_f);
                    break L7;
                  }
                }
                L8: {
                  if (param0 == 63) {
                    break L8;
                  } else {
                    vd.b((byte) 112);
                    break L8;
                  }
                }
                return;
              }
            }
          } else {
            bd.field_c = bd.field_c - 1;
            if (-1 > (je.field_t ^ -1)) {
              L9: {
                bh.a(0);
                if (0 < bd.field_c) {
                  vb.a((byte) 112, bd.field_c);
                  break L9;
                } else {
                  break L9;
                }
              }
              if (0 >= fj.field_f) {
                if (param0 == 63) {
                  return;
                } else {
                  vd.b((byte) 112);
                  return;
                }
              } else {
                L10: {
                  vb.a((byte) 84, fj.field_f);
                  if (param0 == 63) {
                    break L10;
                  } else {
                    vd.b((byte) 112);
                    break L10;
                  }
                }
                return;
              }
            } else {
              L11: {
                if (0 < bd.field_c) {
                  vb.a((byte) 112, bd.field_c);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (0 >= fj.field_f) {
                  break L12;
                } else {
                  vb.a((byte) 84, fj.field_f);
                  break L12;
                }
              }
              L13: {
                if (param0 == 63) {
                  break L13;
                } else {
                  vd.b((byte) 112);
                  break L13;
                }
              }
              return;
            }
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != 56) {
            return;
        }
        field_a = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_g = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Everyone is your enemy.", "Destroy the enemies, but don't attack your own team.", "Destroy as many waves of enemies as you can.", "Cooperate with your ally to destroy as many waves of enemies as you can."};
        field_b = false;
        field_a = null;
    }
}
