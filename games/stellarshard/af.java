/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends gg {
    static pb field_n;
    static int field_q;
    static int field_k;
    int[] field_s;
    static la field_r;
    boolean field_m;
    static int field_l;
    static int field_o;
    int field_p;

    final static void a(int param0, int param1, int param2, int param3, pb[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = stellarshard.field_B;
          if (param4 == null) {
            break L0;
          } else {
            if (0 < param2) {
              var6 = param4[0].field_w;
              var7 = param4[2].field_w;
              var8 = param4[1].field_w;
              param4[0].a(param5, param3, param1);
              param4[2].a(-var7 + param2 + param5, param3, param1);
              ti.a(og.field_b);
              ti.a(var6 + param5, param3, param2 + param5 - var7, param4[1].field_x + param3);
              var9 = var6 + param5;
              var10 = -var7 + (param5 - -param2);
              param5 = var9;
              L1: while (true) {
                if (var10 <= param5) {
                  if (param0 <= -38) {
                    ti.b(og.field_b);
                    return;
                  } else {
                    field_o = -74;
                    ti.b(og.field_b);
                    return;
                  }
                } else {
                  param4[1].a(param5, param3, param1);
                  param5 = param5 + var8;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(int param0) {
        int var1 = 82 % ((param0 - 8) / 41);
        field_r = null;
        field_n = null;
    }

    final static void a(boolean param0, byte param1) {
        if (param1 >= -41) {
            af.a(true, (byte) 62);
            na.field_d.a(0, 0, 0);
            return;
        }
        na.field_d.a(0, 0, 0);
    }

    final static int a(int param0, int param1, int param2) {
        if (ui.field_F == null) {
          return -1;
        } else {
          if (param0 == 1) {
            L0: {
              if (param1 < wc.field_y) {
                break L0;
              } else {
                if (param1 >= ui.field_F.field_v + wc.field_y) {
                  break L0;
                } else {
                  if (vi.field_a > param2) {
                    break L0;
                  } else {
                    if (vi.field_a - -ui.field_F.field_y <= param2) {
                      break L0;
                    } else {
                      return 0;
                    }
                  }
                }
              }
            }
            if (param1 >= cm.field_a) {
              if (param1 < ui.field_F.field_v + cm.field_a) {
                if (param2 >= field_l) {
                  if (ui.field_F.field_y + field_l > param2) {
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
          } else {
            field_l = 68;
            if (param1 >= wc.field_y) {
              if (param1 < ui.field_F.field_v + wc.field_y) {
                L1: {
                  if (vi.field_a > param2) {
                    break L1;
                  } else {
                    if (vi.field_a - -ui.field_F.field_y <= param2) {
                      break L1;
                    } else {
                      return 0;
                    }
                  }
                }
                if (param1 >= cm.field_a) {
                  if (param1 < ui.field_F.field_v + cm.field_a) {
                    if (param2 >= field_l) {
                      if (ui.field_F.field_y + field_l > param2) {
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
              } else {
                if (param1 >= cm.field_a) {
                  if (param1 < ui.field_F.field_v + cm.field_a) {
                    if (param2 >= field_l) {
                      if (ui.field_F.field_y + field_l <= param2) {
                        return -1;
                      } else {
                        return 1;
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
            } else {
              if (param1 >= cm.field_a) {
                if (param1 < ui.field_F.field_v + cm.field_a) {
                  if (param2 >= field_l) {
                    if (ui.field_F.field_y + field_l <= param2) {
                      return -1;
                    } else {
                      return 1;
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

    af() {
    }

    static {
    }
}
