/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lw extends ksa {
    int field_g;
    static boolean field_f;
    int field_l;
    int field_m;
    int field_h;
    int field_k;
    int field_d;
    int field_j;
    static String field_e;
    static llb field_i;

    final void a(int param0) {
        ((lw) this).field_g = 0;
        ((lw) this).field_d = ((lw) this).field_d + 1;
        if (param0 != -26857) {
          return;
        } else {
          ((lw) this).field_k = 0;
          ((lw) this).field_j = 0;
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_i = null;
    }

    final static int a(byte param0, int param1) {
        if ((long)param1 >= 65536L) {
          if (16777216L <= (long)param1) {
            if ((long)param1 >= 268435456L) {
              if ((long)param1 >= 1073741824L) {
                return eo.field_o[param1 >> 24];
              } else {
                return eo.field_o[param1 >> 22] >> 1;
              }
            } else {
              if ((long)param1 >= 67108864L) {
                return eo.field_o[param1 >> 20] >> 2;
              } else {
                return eo.field_o[param1 >> 18] >> 3;
              }
            }
          } else {
            if ((long)param1 < 1048576L) {
              if ((long)param1 >= 262144L) {
                return eo.field_o[param1 >> 12] >> 6;
              } else {
                return eo.field_o[param1 >> 10] >> 7;
              }
            } else {
              if ((long)param1 < 4194304L) {
                return eo.field_o[param1 >> 14] >> 5;
              } else {
                return eo.field_o[param1 >> 16] >> 4;
              }
            }
          }
        } else {
          if ((long)param1 >= 256L) {
            if ((long)param1 >= 4096L) {
              if (16384L > (long)param1) {
                return eo.field_o[param1 >> 6] >> 9;
              } else {
                return eo.field_o[param1 >> 8] >> 8;
              }
            } else {
              if ((long)param1 < 1024L) {
                return eo.field_o[param1 >> 2] >> 11;
              } else {
                return eo.field_o[param1 >> 4] >> 10;
              }
            }
          } else {
            if (param1 >= 0) {
              return eo.field_o[param1] >> 12;
            } else {
              return -1;
            }
          }
        }
    }

    final void a(int param0, int param1) {
        if (((lw) this).field_j == 0) {
          ((lw) this).field_j = param1;
          ((lw) this).field_k = ((lw) this).field_k + 1;
          if (param0 != -1746542610) {
            return;
          } else {
            L0: {
              if (param1 > 0) {
                break L0;
              } else {
                ((lw) this).field_g = ((lw) this).field_g + 1;
                break L0;
              }
            }
            return;
          }
        } else {
          if (((lw) this).field_j <= param1) {
            ((lw) this).field_k = ((lw) this).field_k + 1;
            if (param0 != -1746542610) {
              return;
            } else {
              L1: {
                if (param1 > 0) {
                  break L1;
                } else {
                  ((lw) this).field_g = ((lw) this).field_g + 1;
                  break L1;
                }
              }
              return;
            }
          } else {
            if (0 < param1) {
              ((lw) this).field_j = param1;
              ((lw) this).field_k = ((lw) this).field_k + 1;
              if (param0 != -1746542610) {
                return;
              } else {
                L2: {
                  if (param1 > 0) {
                    break L2;
                  } else {
                    ((lw) this).field_g = ((lw) this).field_g + 1;
                    break L2;
                  }
                }
                return;
              }
            } else {
              ((lw) this).field_k = ((lw) this).field_k + 1;
              if (param0 != -1746542610) {
                return;
              } else {
                L3: {
                  if (param1 > 0) {
                    break L3;
                  } else {
                    ((lw) this).field_g = ((lw) this).field_g + 1;
                    break L3;
                  }
                }
                return;
              }
            }
          }
        }
    }

    lw(int param0) {
        ((lw) this).field_l = param0;
        if (pca.field_i[((lw) this).field_l].c((byte) -115)) {
            ((lw) this).field_d = 50;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_e = "Owner";
    }
}
