/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gf {
    private int field_B;
    double field_m;
    private double field_H;
    int field_u;
    private int field_a;
    static int[] field_o;
    int field_q;
    int field_I;
    static vd field_h;
    private ck[] field_j;
    private int field_f;
    private int field_E;
    private double field_z;
    nh field_g;
    double field_F;
    int field_l;
    private int field_n;
    private int[] field_x;
    private int[] field_v;
    double field_i;
    private double field_c;
    private int field_J;
    private int field_e;
    private double field_w;
    private int field_y;
    int field_t;
    static vd field_A;
    double field_d;
    static int field_C;
    static int field_D;
    static int[] field_k;
    static hm field_r;
    static int[] field_p;
    static String field_s;
    static boolean field_G;
    static int field_b;

    final boolean a(int param0, double param1, double param2) {
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_87_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        var21 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (-1 == ((gf) this).field_I) {
          return true;
        } else {
          L0: {
            ((gf) this).field_m = ((gf) this).field_m + ((gf) this).field_z;
            ((gf) this).field_F = param1;
            ((gf) this).field_d = param2;
            ((gf) this).field_l = ((gf) this).field_l + 1;
            ((gf) this).field_i = ((gf) this).field_i + ((gf) this).field_c;
            var6 = Math.sqrt(((gf) this).field_z * ((gf) this).field_z + ((gf) this).field_c * ((gf) this).field_c);
            var8 = ((gf) this).field_c / var6;
            var10 = ((gf) this).field_z / var6;
            var12 = param1 - ((gf) this).field_m;
            var20 = ((gf) this).field_I;
            if (var20 == 2) {
              ((gf) this).field_j[0].a((int)((gf) this).field_m + ((gf) this).field_u, 7, 24576, -117, 1, ((gf) this).field_q + (int)((gf) this).field_i);
              ((gf) this).field_j[1].a(2 + (((gf) this).field_u + (int)((gf) this).field_m), 7, 48, param0 ^ 16390, 1, (int)((gf) this).field_i - -((gf) this).field_q);
              ((gf) this).field_j[2].a(((gf) this).field_u + (int)((gf) this).field_m, 7, 24576, param0 + -16533, 1, ((gf) this).field_q + (int)((gf) this).field_i - -2);
              ((gf) this).field_j[3].a(((gf) this).field_u + (int)((gf) this).field_m + -2, 7, 48, -102, 1, ((gf) this).field_q + ((int)((gf) this).field_i + 2));
              break L0;
            } else {
              if (4 == var20) {
                ((gf) this).field_j[0].a((int)((gf) this).field_m + ((gf) this).field_u, 4, 5263440, 114, 1, (int)((gf) this).field_i + ((gf) this).field_q);
                ((gf) this).field_j[1].a(((gf) this).field_u + (int)((gf) this).field_m + 2, 4, 5263440, -114, 1, (int)((gf) this).field_i + ((gf) this).field_q);
                ((gf) this).field_j[2].a((int)((gf) this).field_m + ((gf) this).field_u, 4, 5263440, 122, 1, 2 + (((gf) this).field_q + (int)((gf) this).field_i));
                ((gf) this).field_j[3].a(-2 + (int)((gf) this).field_m + ((gf) this).field_u, 4, 5263440, param0 + -16596, 1, 2 + ((gf) this).field_q + (int)((gf) this).field_i);
                break L0;
              } else {
                if (var20 == 6) {
                  L1: {
                    ((gf) this).field_a = ((gf) this).field_a - 32;
                    if (((gf) this).field_a > 0) {
                      stackOut_38_0 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      break L1;
                    } else {
                      stackOut_37_0 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      break L1;
                    }
                  }
                  return stackIn_39_0 != 0;
                } else {
                  if (27 != var20) {
                    if (11 != var20) {
                      L2: {
                        if (var20 != 13) {
                          if (var20 == 15) {
                            break L2;
                          } else {
                            L3: {
                              if (var20 == 12) {
                                ((gf) this).field_z = ((gf) this).field_z + 0.1;
                                break L3;
                              } else {
                                if (var20 == 14) {
                                  break L3;
                                } else {
                                  L4: {
                                    if (0 == var20) {
                                      ((gf) this).field_j[0].a((int)((gf) this).field_m - -((gf) this).field_u, 20, 2097152, -113, 1, ((gf) this).field_q + (int)((gf) this).field_i);
                                      ((gf) this).field_j[1].a((int)((gf) this).field_m + hi.a(((gf) this).field_y, param0 ^ 16506, ug.field_m), 10, 8192, 112, 1, (int)((gf) this).field_i - -hi.a(((gf) this).field_J, param0 + -16506, ug.field_m));
                                      break L4;
                                    } else {
                                      if (var20 != 5) {
                                        if (var20 != 10) {
                                          if (var20 == 16) {
                                            break L4;
                                          } else {
                                            if (var20 == 26) {
                                              L5: {
                                                ((gf) this).field_a = ((gf) this).field_a - 4;
                                                ((gf) this).field_t = (int)Math.round((double)(((gf) this).field_a * af.field_f[((gf) this).field_I]) / 255.0);
                                                if (((gf) this).field_a > 0) {
                                                  stackOut_60_0 = 0;
                                                  stackIn_61_0 = stackOut_60_0;
                                                  break L5;
                                                } else {
                                                  stackOut_59_0 = 1;
                                                  stackIn_61_0 = stackOut_59_0;
                                                  break L5;
                                                }
                                              }
                                              return stackIn_61_0 != 0;
                                            } else {
                                              if (var20 != 17) {
                                                if (var20 != 18) {
                                                  if (var20 == 22) {
                                                    ((gf) this).field_z = ((gf) this).field_z + var12 / 30.0;
                                                    ((gf) this).field_z = ((gf) this).field_z * 0.95;
                                                    ((gf) this).field_j[0].a((int)((gf) this).field_m - -((gf) this).field_u, 5, 5242880, 116, 1, ((gf) this).field_q + (int)((gf) this).field_i + 3);
                                                    ((gf) this).field_j[1].a((int)((gf) this).field_m + (((gf) this).field_u + 1), 3, 12288, -93, 1, 2 + ((gf) this).field_q + (int)((gf) this).field_i);
                                                    ((gf) this).field_j[2].a(((gf) this).field_u + (int)((gf) this).field_m, 5, 5242880, 105, 1, 1 + ((gf) this).field_q + (int)((gf) this).field_i);
                                                    ((gf) this).field_j[3].a(((gf) this).field_u + ((int)((gf) this).field_m - 1), 3, 12288, param0 ^ 16400, 1, (int)((gf) this).field_i + ((gf) this).field_q);
                                                    ((gf) this).field_j[4].a(((gf) this).field_u + (int)((gf) this).field_m, 5, 5242880, 119, 1, ((gf) this).field_q + (int)((gf) this).field_i + -1);
                                                    ((gf) this).field_j[5].a(1 + (int)((gf) this).field_m + ((gf) this).field_u, 3, 12288, param0 + -16527, 1, -2 + (int)((gf) this).field_i - -((gf) this).field_q);
                                                    ((gf) this).field_j[6].a((int)((gf) this).field_m + ((gf) this).field_u, 5, 5251072, -119, 1, (int)((gf) this).field_i + ((gf) this).field_q - 3);
                                                    ((gf) this).field_j[7].a(((gf) this).field_u + (int)((gf) this).field_m + -1, 3, 12288, -85, 1, ((gf) this).field_q + (int)((gf) this).field_i - 4);
                                                    ((gf) this).field_j[8].a(((gf) this).field_u + (int)((gf) this).field_m, 5, 5242880, -109, 1, -5 + ((int)((gf) this).field_i + ((gf) this).field_q));
                                                    ((gf) this).field_j[9].a((int)((gf) this).field_m + (((gf) this).field_u + 1), 3, 12288, param0 + -16623, 1, ((gf) this).field_q + ((int)((gf) this).field_i - 6));
                                                    break L0;
                                                  } else {
                                                    if (var20 == 20) {
                                                      ((gf) this).field_j[0].a((int)((gf) this).field_m, 5, 8947848, param0 + -16408, 0, ((gf) this).field_q + (int)((gf) this).field_i);
                                                      break L0;
                                                    } else {
                                                      if (var20 != 19) {
                                                        if (23 != var20) {
                                                          if (28 != var20) {
                                                            break L0;
                                                          } else {
                                                            L6: {
                                                              ((gf) this).field_a = ((gf) this).field_a - 51;
                                                              if (((gf) this).field_a > 0) {
                                                                stackOut_86_0 = 0;
                                                                stackIn_87_0 = stackOut_86_0;
                                                                break L6;
                                                              } else {
                                                                stackOut_85_0 = 1;
                                                                stackIn_87_0 = stackOut_85_0;
                                                                break L6;
                                                              }
                                                            }
                                                            return stackIn_87_0 != 0;
                                                          }
                                                        } else {
                                                          L7: {
                                                            ((gf) this).field_B = ((gf) this).field_l / 3 % f.field_i.length;
                                                            if (((gf) this).field_t < 100) {
                                                              var19 = 4210752;
                                                              var18 = 983040;
                                                              break L7;
                                                            } else {
                                                              if (150 <= ((gf) this).field_t) {
                                                                var18 = 1048592;
                                                                var19 = 20224;
                                                                break L7;
                                                              } else {
                                                                var19 = 20224;
                                                                var18 = 983040;
                                                                break L7;
                                                              }
                                                            }
                                                          }
                                                          ((gf) this).field_g = f.field_i[((gf) this).field_B];
                                                          var20 = -2;
                                                          L8: while (true) {
                                                            if (2 < var20) {
                                                              var20 = -1;
                                                              L9: while (true) {
                                                                if (var20 > 1) {
                                                                  break L0;
                                                                } else {
                                                                  ((gf) this).field_j[6 + var20].a(-(var20 * 5) + (int)((gf) this).field_m + ((gf) this).field_u, 10, var19, param0 ^ 16411, 1, (int)((gf) this).field_i + ((gf) this).field_q);
                                                                  var20++;
                                                                  continue L9;
                                                                }
                                                              }
                                                            } else {
                                                              ((gf) this).field_j[var20 - -2].a((int)((gf) this).field_m + (((gf) this).field_u - 5 * var20), 20, var18, -9, 1, ((gf) this).field_q + (int)((gf) this).field_i);
                                                              var20++;
                                                              continue L8;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var20 = 0;
                                                        L10: while (true) {
                                                          if (~((gf) this).field_j.length >= ~var20) {
                                                            break L0;
                                                          } else {
                                                            ((gf) this).field_j[var20].a(((gf) this).field_u + (int)((gf) this).field_m, 1, 16776960, -114, 0, (int)(-((double)var20 * ((gf) this).field_c / (double)((gf) this).field_j.length) + ((gf) this).field_i));
                                                            var20++;
                                                            continue L10;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var20 = 0;
                                                  L11: while (true) {
                                                    if (((gf) this).field_j.length <= var20) {
                                                      break L0;
                                                    } else {
                                                      ((gf) this).field_j[var20].a((int)((double)((gf) this).field_u + ((gf) this).field_m - (double)var20 * var10), 2, 24624, 2, 1, (int)(-(var8 * (double)var20) + ((double)((gf) this).field_q + ((gf) this).field_i)));
                                                      var20++;
                                                      continue L11;
                                                    }
                                                  }
                                                }
                                              } else {
                                                ((gf) this).field_z = ((gf) this).field_z + var12 / 30.0;
                                                ((gf) this).field_z = ((gf) this).field_z * 0.95;
                                                var20 = 0;
                                                L12: while (true) {
                                                  if (var20 >= ((gf) this).field_j.length - 1) {
                                                    break L0;
                                                  } else {
                                                    ((gf) this).field_j[var20].a((int)((double)((gf) this).field_u + ((gf) this).field_m - 3.0 * (Math.random() + var10 * (double)var20)), 8, 48, 119, 1, (int)((double)((gf) this).field_q + ((gf) this).field_i - 3.0 * (Math.random() + (double)var20 * var8)));
                                                    ((gf) this).field_j[var20 + 1].a((int)(((gf) this).field_m + (double)((gf) this).field_u - (Math.random() + (double)(1 + var20) * var10) * 3.0), 8, 24576, 116, 1, (int)((double)((gf) this).field_q + ((gf) this).field_i - (Math.random() + var8 * (double)(var20 - -1)) * 3.0));
                                                    var20 += 2;
                                                    continue L12;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L4;
                                        }
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  L13: {
                                    ((gf) this).field_a = ((gf) this).field_a - 2;
                                    if (((gf) this).field_I != 16) {
                                      break L13;
                                    } else {
                                      ((gf) this).field_a = ((gf) this).field_a - 2;
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    ((gf) this).field_t = (int)Math.round((double)(af.field_f[((gf) this).field_I] * ((gf) this).field_a) / 255.0);
                                    if (0 < ((gf) this).field_a) {
                                      stackOut_56_0 = 0;
                                      stackIn_57_0 = stackOut_56_0;
                                      break L14;
                                    } else {
                                      stackOut_55_0 = 1;
                                      stackIn_57_0 = stackOut_55_0;
                                      break L14;
                                    }
                                  }
                                  return stackIn_57_0 != 0;
                                }
                              }
                            }
                            ((gf) this).field_j[0].a(((gf) this).field_u + (int)((gf) this).field_m, 7, 6291456, -53, 1, ((gf) this).field_q + (int)((gf) this).field_i);
                            ((gf) this).field_j[1].a(2 + (((gf) this).field_u + (int)((gf) this).field_m), 7, 12288, -48, 1, ((gf) this).field_q + (int)((gf) this).field_i);
                            ((gf) this).field_j[2].a((int)((gf) this).field_m - -((gf) this).field_u, 7, 6291456, param0 ^ -16455, 1, ((gf) this).field_q + (int)((gf) this).field_i + 2);
                            ((gf) this).field_j[3].a(-2 + (((gf) this).field_u + (int)((gf) this).field_m), 7, 12288, 122, 1, 2 + ((gf) this).field_q + (int)((gf) this).field_i);
                            break L0;
                          }
                        } else {
                          break L2;
                        }
                      }
                      L15: {
                        var14 = Math.atan2(((gf) this).field_c, ((gf) this).field_z);
                        var16 = Math.atan2(sd.field_a.field_N - ((gf) this).field_i, -((gf) this).field_m + sd.field_a.field_D);
                        if (var14 < var16) {
                          var14 = var14 + 0.05;
                          break L15;
                        } else {
                          var14 = var14 - 0.05;
                          break L15;
                        }
                      }
                      ((gf) this).field_c = var6 * ji.a(65535, var14);
                      ((gf) this).field_z = pj.a(var14, 32768) * var6;
                      ((gf) this).field_j[0].a((int)((gf) this).field_m + ((gf) this).field_u, 7, 6291456, 120, 1, (int)((gf) this).field_i + ((gf) this).field_q);
                      ((gf) this).field_j[1].a(((gf) this).field_u + (int)((gf) this).field_m + 2, 7, 48, -120, 1, (int)((gf) this).field_i + ((gf) this).field_q);
                      ((gf) this).field_j[2].a(((gf) this).field_u + (int)((gf) this).field_m, 7, 6291456, param0 + -16395, 1, ((gf) this).field_q + ((int)((gf) this).field_i + 2));
                      ((gf) this).field_j[3].a(-2 + ((int)((gf) this).field_m - -((gf) this).field_u), 7, 48, 118, 1, 2 + (((gf) this).field_q + (int)((gf) this).field_i));
                      break L0;
                    } else {
                      ((gf) this).field_j[0].a((int)((gf) this).field_m + ((gf) this).field_u, 9, 24576, 114, 1, ((gf) this).field_q + (int)((gf) this).field_i);
                      ((gf) this).field_j[1].a(2 + (int)((gf) this).field_m - -((gf) this).field_u, 9, 48, param0 ^ -16430, 1, (int)((gf) this).field_i + ((gf) this).field_q);
                      ((gf) this).field_j[2].a(((gf) this).field_u + (int)((gf) this).field_m, 9, 24576, -117, 1, ((gf) this).field_q + (int)((gf) this).field_i + 2);
                      ((gf) this).field_j[3].a(((gf) this).field_u + ((int)((gf) this).field_m + -2), 9, 48, -20, 1, 2 + ((int)((gf) this).field_i - -((gf) this).field_q));
                      break L0;
                    }
                  } else {
                    L16: {
                      ((gf) this).field_a = ((gf) this).field_a - 4;
                      if (((gf) this).field_a > 0) {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        break L16;
                      } else {
                        stackOut_41_0 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        break L16;
                      }
                    }
                    return stackIn_43_0 != 0;
                  }
                }
              }
            }
          }
          L17: {
            if ((double)((gf) this).field_e > ((gf) this).field_i) {
              break L17;
            } else {
              if ((double)((gf) this).field_f < ((gf) this).field_i) {
                break L17;
              } else {
                if (((gf) this).field_m < (double)((gf) this).field_n) {
                  break L17;
                } else {
                  if ((double)((gf) this).field_E < ((gf) this).field_m) {
                    break L17;
                  } else {
                    L18: {
                      if (((gf) this).field_I != 22) {
                        break L18;
                      } else {
                        ((gf) this).field_c = ((gf) this).field_c + 0.5;
                        break L18;
                      }
                    }
                    L19: {
                      if (((gf) this).field_I == 20) {
                        ((gf) this).field_z = ((gf) this).field_z + 0.3;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    if (param0 == 16510) {
                      return false;
                    } else {
                      field_h = null;
                      return false;
                    }
                  }
                }
              }
            }
          }
          return true;
        }
    }

    final boolean a(double param0, double param1, double param2, double param3, boolean param4) {
        ((gf) this).field_i = param2;
        ((gf) this).field_m = param1;
        if (!param4) {
            field_o = null;
        }
        return ((gf) this).a(16510, ((gf) this).field_F, ((gf) this).field_d);
    }

    final boolean a(byte param0) {
        if (param0 > -84) {
            return false;
        }
        return ((gf) this).a(16510, ((gf) this).field_F, ((gf) this).field_d);
    }

    final static void b() {
        L0: {
          kj.field_b[2] = 240;
          ih.field_O[2] = 180;
          kj.field_b[4] = 80;
          kj.field_b[10] = 80;
          ih.field_O[4] = 56;
          ih.field_O[10] = 56;
          dl.a(new int[1], 390, 275, 4, 455, 30, (byte) 123);
          th.field_a[4] = new ld(4);
          ul.field_j[9] = new int[2];
          th.field_a[9] = new ld(9);
          dl.a(new int[4], 385, 200, 2, 540, 30, (byte) 124);
          th.field_a[2] = new ld(2);
          dl.a(new int[1], 390, 200, 12, 455, 30, (byte) 119);
          th.field_a[12] = new ld(12);
          ul.field_b[10] = ul.field_b[4];
          ul.field_j[10] = new int[10];
          ul.field_i[10] = ul.field_b[10] - -cb.field_b.b(hg.field_ob[10]);
          th.field_a[10] = new ld(10);
          if (0 >= hb.field_g) {
            break L0;
          } else {
            int discarded$1 = 0;
            if (ea.a(sb.field_d)) {
              dl.a(new int[7], 200, 200, 1, 540, 30, (byte) 122);
              th.field_a[1] = new ld(1);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    final static void d(byte param0) {
        fb.field_e.a(33, (vg) (Object) new ff());
        if (param0 <= 78) {
            field_C = -56;
        }
    }

    gf(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        this(param0, param1, param2, param3, param4, param5, param6, af.field_f[param0]);
    }

    public static void a(boolean param0) {
        field_A = null;
        field_o = null;
        field_h = null;
        if (param0) {
            return;
        }
        field_p = null;
        field_s = null;
        field_k = null;
        field_r = null;
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        double var10 = 0.0;
        gg var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        gg stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        gg stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        gg stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        gg stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        gg stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        gg stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 >= 101) {
          L0: {
            if (2 != sd.field_e) {
              break L0;
            } else {
              var5_int = 0;
              L1: while (true) {
                if (((gf) this).field_j.length <= var5_int) {
                  break L0;
                } else {
                  ((gf) this).field_j[var5_int].c(-1);
                  var5_int++;
                  continue L1;
                }
              }
            }
          }
          L2: {
            var17 = ((gf) this).field_I;
            if (var17 == 21) {
              be.a((int)((gf) this).field_w, (int)((gf) this).field_H, (int)((gf) this).field_i, (int)((gf) this).field_m, 0.15, 255, 0.8);
              break L2;
            } else {
              if (var17 == 28) {
                L3: {
                  var7 = -((gf) this).field_F + ((gf) this).field_m;
                  var5 = -((gf) this).field_d + ((gf) this).field_i;
                  var9 = (int)dl.a(true, var5, var7) / 4;
                  if (var9 <= 64) {
                    break L3;
                  } else {
                    var9 = 64;
                    break L3;
                  }
                }
                L4: {
                  var10 = 3.141592653589793 + Math.atan2(var5, var7);
                  var12 = new gg((int)((gf) this).field_i, (int)((gf) this).field_m, var9, var10, 0.5, 0.9, 1, 1.5, 0.92, ((gf) this).field_l);
                  var2 = 128 * ((gf) this).field_a;
                  var3 = 64 * ((gf) this).field_a;
                  var4 = ((gf) this).field_a * 255;
                  var2 = var2 >> 8;
                  var3 = var3 >> 8;
                  var4 = var4 >> 8;
                  var3 = var3 << 8;
                  var2 = var2 << 16;
                  stackOut_13_0 = (gg) var12;
                  stackOut_13_1 = -1093327740;
                  stackOut_13_2 = 16777215;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  if (sd.field_e != 2) {
                    stackOut_15_0 = (gg) (Object) stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    break L4;
                  } else {
                    stackOut_14_0 = (gg) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = stackIn_14_2;
                    stackOut_14_3 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    break L4;
                  }
                }
                ((gg) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0, var4 | (var2 | var3));
                break L2;
              } else {
                if (26 == var17) {
                  var13 = -((gf) this).field_a + 255;
                  ((gf) this).field_g.c();
                  wj.b(((gf) this).field_g.field_y / 2, ((gf) this).field_g.field_w / 2, var13, 1);
                  lb.field_C.a(119);
                  var15 = (int)((gf) this).field_m - -(((gf) this).field_g.field_w / 2);
                  var14 = (int)((gf) this).field_i + ((gf) this).field_g.field_y / 2;
                  var3 = 255;
                  var4 = 128;
                  var2 = 0;
                  wj.c(var14, var15, var13, 16777215, ((gf) this).field_a);
                  var23 = new int[255];
                  var22 = var23;
                  var21 = var22;
                  var20 = var21;
                  var16 = var20;
                  var17 = 0;
                  L5: while (true) {
                    if (var17 >= 255) {
                      wj.a(var14 << 4, var15 << 4, var13 << 3, 254, var23);
                      break L2;
                    } else {
                      var18 = (var17 >> 5) + 1;
                      var16[var17] = (var3 / var18 << 8) + (var2 / var18 << 16) - -(var4 / var18);
                      var17++;
                      continue L5;
                    }
                  }
                } else {
                  if (gg.field_n[((gf) this).field_I] != 0) {
                    ((gf) this).field_g.a((int)((gf) this).field_i, (int)((gf) this).field_m, ((gf) this).field_a);
                    break L2;
                  } else {
                    if (((gf) this).field_a == 256) {
                      ((gf) this).field_g.d((int)((gf) this).field_i, (int)((gf) this).field_m);
                      break L2;
                    } else {
                      ((gf) this).field_g.e((int)((gf) this).field_i, (int)((gf) this).field_m, ((gf) this).field_a);
                      break L2;
                    }
                  }
                }
              }
            }
          }
          L6: {
            if (sd.field_a.field_F) {
              a.field_g.b(Integer.toString(((gf) this).field_t), (int)((gf) this).field_i, (int)((gf) this).field_m, 16777215, 16777215, 128);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    gf(int param0, double param1, double param2, double param3, double param4, double param5, double param6, int param7) {
        int var15 = 0;
        L0: {
          ((gf) this).field_B = 0;
          ((gf) this).field_x = new int[]{2, 0, 4, 0, 4, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 0, 8, 10, 0, 2, 0, 10, 8, 0, 0, 10, 0, 0};
          ((gf) this).field_l = 0;
          ((gf) this).field_v = new int[]{256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 192, 256, 256, 256, 256};
          ((gf) this).field_H = param2;
          ((gf) this).field_w = param1;
          ((gf) this).field_I = param0;
          ((gf) this).field_i = ((gf) this).field_w;
          ((gf) this).field_z = param4;
          ((gf) this).field_t = param7;
          ((gf) this).field_c = param3;
          ((gf) this).field_m = ((gf) this).field_H;
          ((gf) this).field_j = new ck[((gf) this).field_x[((gf) this).field_I]];
          ((gf) this).field_g = ae.field_hb[((gf) this).field_I];
          ((gf) this).field_a = ((gf) this).field_v[((gf) this).field_I];
          ((gf) this).field_d = param5;
          ((gf) this).field_F = param6;
          if (ej.field_g[((gf) this).field_I] == -1) {
            break L0;
          } else {
            var15 = e.a(127, (int)param1);
            th.a(-27610, uh.field_s[((gf) this).field_I], var15, nl.field_r[ej.field_g[((gf) this).field_I]]);
            break L0;
          }
        }
        L1: {
          L2: {
            var15 = ((gf) this).field_I;
            if (var15 == 5) {
              break L2;
            } else {
              if (var15 == 10) {
                break L2;
              } else {
                if (var15 == 16) {
                  break L2;
                } else {
                  L3: {
                    if (var15 == 6) {
                      break L3;
                    } else {
                      if (var15 == 27) {
                        break L3;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((gf) this).field_m = ((gf) this).field_m + (double)(((gf) this).field_g.field_C >> 1);
                  break L1;
                }
              }
            }
          }
          ((gf) this).field_i = ((gf) this).field_i - 400.0;
          break L1;
        }
        L4: {
          L5: {
            var15 = ((gf) this).field_I;
            if (var15 == 20) {
              break L5;
            } else {
              if (19 == var15) {
                break L5;
              } else {
                if (24 != var15) {
                  if (var15 == 25) {
                    break L5;
                  } else {
                    if (var15 == 22) {
                      break L5;
                    } else {
                      if (var15 == 23) {
                        break L5;
                      } else {
                        if (var15 != 21) {
                          ((gf) this).field_n = -500;
                          ((gf) this).field_e = -500;
                          ((gf) this).field_f = 1140;
                          ((gf) this).field_E = 450;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                } else {
                  ((gf) this).field_f = 740;
                  ((gf) this).field_E = 450;
                  ((gf) this).field_n = -50;
                  ((gf) this).field_e = 0;
                  break L4;
                }
              }
            }
          }
          ((gf) this).field_f = 740;
          ((gf) this).field_E = 450;
          ((gf) this).field_n = -50;
          ((gf) this).field_e = 0;
          break L4;
        }
        var15 = 0;
        L6: while (true) {
          if (~var15 <= ~((gf) this).field_j.length) {
            L7: {
              if (null != ((gf) this).field_g) {
                ((gf) this).field_q = ((gf) this).field_g.field_y / 2 + ((gf) this).field_g.field_D;
                ((gf) this).field_u = ((gf) this).field_g.field_v + ((gf) this).field_g.field_w / 2;
                ((gf) this).field_y = ((gf) this).field_g.field_C;
                ((gf) this).field_J = ((gf) this).field_g.field_z;
                ((gf) this).field_i = ((gf) this).field_i - (double)((gf) this).field_q;
                ((gf) this).field_m = ((gf) this).field_m - (double)((gf) this).field_u;
                break L7;
              } else {
                ((gf) this).field_J = 0;
                ((gf) this).field_q = 0;
                ((gf) this).field_y = 0;
                ((gf) this).field_u = 0;
                break L7;
              }
            }
            return;
          } else {
            ((gf) this).field_j[var15] = new ck();
            var15++;
            continue L6;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new vd();
        field_A = new vd();
        field_k = new int[]{-1, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 68, 68, -1, -1, -1, -1, 68, 68, -1, -1, -1, -1};
        field_p = new int[8192];
        field_G = true;
        field_b = 0;
        field_s = "New game";
    }
}
