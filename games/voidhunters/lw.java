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
        this.field_g = 0;
        this.field_d = this.field_d + 1;
        if (param0 != -26857) {
          return;
        } else {
          this.field_k = 0;
          this.field_j = 0;
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            field_i = (llb) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static int a(byte param0, int param1) {
        if (param0 == -73) {
          if (((long)param1 ^ -1L) <= -65537L) {
            if (16777216L <= (long)param1) {
              if (-268435457L >= ((long)param1 ^ -1L)) {
                if (-1073741825L >= ((long)param1 ^ -1L)) {
                  return eo.field_o[param1 >> 1078035576];
                } else {
                  return eo.field_o[param1 >> 447431286] >> -1167852767;
                }
              } else {
                if (((long)param1 ^ -1L) <= -67108865L) {
                  return eo.field_o[param1 >> -2008093228] >> 25784162;
                } else {
                  return eo.field_o[param1 >> 1037480530] >> 1805108547;
                }
              }
            } else {
              if ((long)param1 < 1048576L) {
                if ((long)param1 >= 262144L) {
                  return eo.field_o[param1 >> -1311380596] >> 1126935110;
                } else {
                  return eo.field_o[param1 >> -1298018486] >> 1415071111;
                }
              } else {
                if ((long)param1 < 4194304L) {
                  return eo.field_o[param1 >> -1746542610] >> 603895077;
                } else {
                  return eo.field_o[param1 >> -602499664] >> 1228251716;
                }
              }
            }
          } else {
            if (((long)param1 ^ -1L) <= -257L) {
              if (((long)param1 ^ -1L) <= -4097L) {
                if (16384L > (long)param1) {
                  return eo.field_o[param1 >> 367791366] >> 149455913;
                } else {
                  return eo.field_o[param1 >> 420484712] >> 1804114536;
                }
              } else {
                if (-1025L < ((long)param1 ^ -1L)) {
                  return eo.field_o[param1 >> -603513054] >> -977764789;
                } else {
                  return eo.field_o[param1 >> -1578535452] >> -944421206;
                }
              }
            } else {
              if ((param1 ^ -1) <= -1) {
                return eo.field_o[param1] >> -525929748;
              } else {
                return -1;
              }
            }
          }
        } else {
          return -8;
        }
    }

    final void a(int param0, int param1) {
        if (this.field_j == 0) {
          this.field_j = param1;
          this.field_k = this.field_k + 1;
          if (param0 != -1746542610) {
            return;
          } else {
            L0: {
              if ((param1 ^ -1) < -1) {
                break L0;
              } else {
                this.field_g = this.field_g + 1;
                break L0;
              }
            }
            return;
          }
        } else {
          if (this.field_j <= param1) {
            this.field_k = this.field_k + 1;
            if (param0 != -1746542610) {
              return;
            } else {
              L1: {
                if ((param1 ^ -1) < -1) {
                  break L1;
                } else {
                  this.field_g = this.field_g + 1;
                  break L1;
                }
              }
              return;
            }
          } else {
            if (0 < param1) {
              this.field_j = param1;
              this.field_k = this.field_k + 1;
              if (param0 != -1746542610) {
                return;
              } else {
                L2: {
                  if ((param1 ^ -1) < -1) {
                    break L2;
                  } else {
                    this.field_g = this.field_g + 1;
                    break L2;
                  }
                }
                return;
              }
            } else {
              this.field_k = this.field_k + 1;
              if (param0 != -1746542610) {
                return;
              } else {
                L3: {
                  if ((param1 ^ -1) < -1) {
                    break L3;
                  } else {
                    this.field_g = this.field_g + 1;
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
        this.field_l = param0;
        if (pca.field_i[this.field_l].c((byte) -115)) {
            this.field_d = 50;
        }
    }

    static {
        field_f = false;
        field_e = "Owner";
    }
}
