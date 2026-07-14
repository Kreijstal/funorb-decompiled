/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho extends ma {
    int field_t;
    int[] field_m;
    int[] field_q;
    static String[] field_u;
    int field_o;
    byte[][][] field_w;
    le[] field_n;
    le[] field_p;
    static int[] field_l;
    int[] field_r;
    static int[] field_s;
    static volatile int field_v;

    final static int a(byte param0, int param1, int param2) {
        if (o.field_C != null) {
          if (param0 <= 0) {
            if (ir.field_n <= param1) {
              if (ir.field_n + o.field_C.field_z > param1) {
                if (oj.field_s > param2) {
                  if (param1 >= tn.field_o) {
                    if (o.field_C.field_z + tn.field_o > param1) {
                      if (param2 >= ln.field_o) {
                        if (ln.field_o - -o.field_C.field_A > param2) {
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
                  if (param2 >= oj.field_s - -o.field_C.field_A) {
                    if (param1 >= tn.field_o) {
                      if (o.field_C.field_z + tn.field_o > param1) {
                        if (param2 >= ln.field_o) {
                          if (ln.field_o - -o.field_C.field_A > param2) {
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
                    return 0;
                  }
                }
              } else {
                if (param1 >= tn.field_o) {
                  if (o.field_C.field_z + tn.field_o > param1) {
                    if (param2 >= ln.field_o) {
                      if (ln.field_o - -o.field_C.field_A <= param2) {
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
              if (param1 >= tn.field_o) {
                if (o.field_C.field_z + tn.field_o > param1) {
                  if (param2 >= ln.field_o) {
                    if (ln.field_o - -o.field_C.field_A <= param2) {
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
            return -12;
          }
        } else {
          return -1;
        }
    }

    final static void c(byte param0) {
        wa.l(23323);
        int var1 = 95 / ((param0 - 47) / 60);
        af.a(sg.field_M[0].field_w, kj.field_j, ad.field_x, nk.field_n, (byte) 36, tk.field_i);
    }

    public static void a(boolean param0) {
        field_s = null;
        field_u = null;
        field_l = null;
        if (!param0) {
            field_s = null;
        }
    }

    ho() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[]{"<col=ffffff>Cue ball</col>", "<col=ffff99>1: Spots</col>", "<col=9999ff>2: Spots</col>", "<col=ff9999>3: Spots</col>", "<col=cc99ff>4: Spots</col>", "<col=ffcc99>5: Spots</col>", "<col=99ff99>6: Spots</col>", "<col=cc9966>7: Spots</col>", "<col=999999>8: Black</col>", "<col=ffff99>9: Stripes</col>", "<col=9999ff>10: Stripes</col>", "<col=ff9999>11: Stripes</col>", "<col=cc99ff>12: Stripes</col>", "<col=ffcc99>13: Stripes</col>", "<col=99ff99>14: Stripes</col>", "<col=cc9966>15: Stripes</col>"};
        field_s = new int[4];
        field_v = 0;
    }
}
