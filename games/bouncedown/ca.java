/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static int[] field_a;
    static gk field_e;
    static int[] field_c;
    static fe field_b;
    static ef field_d;

    final static void a(boolean param0) {
        boolean[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        int var6 = 0;
        var4 = Bounce.field_N;
        var5 = new boolean[]{false, false, param0};
        var1 = var5;
        var2 = 0;
        L0: while (true) {
          if (vk.field_b <= var2) {
            var5 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= vk.field_b) {
                var2 = vk.field_b;
                L2: while (true) {
                  if ((var2 ^ -1) <= -4) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= vk.field_b) {
                        var2 = 0;
                        L4: while (true) {
                          if (var2 >= vk.field_b) {
                            return;
                          } else {
                            var6 = 1 + var2;
                            var3 = var6;
                            L5: while (true) {
                              if (var6 >= vk.field_b) {
                                var2++;
                                continue L4;
                              } else {
                                if (he.field_n[var2].field_j > he.field_n[var6].field_j - he.field_n[var6].field_e + 5.0) {
                                  if (-he.field_n[var2].field_e + he.field_n[var2].field_j + 5.0 < he.field_n[var6].field_j) {
                                    if (var2 != var6) {
                                      if (he.field_n[var2].field_e / 2.0 + he.field_n[var2].field_u > he.field_n[var6].field_u - he.field_n[var6].field_e / 2.0) {
                                        if (he.field_n[var6].field_e / 2.0 + he.field_n[var6].field_u > -(he.field_n[var2].field_e / 2.0) + he.field_n[var2].field_u) {
                                          L6: {
                                            if (he.field_n[var2].field_u >= he.field_n[var6].field_u) {
                                              he.field_n[var2].field_c = he.field_n[var2].field_c + (he.field_n[var2].field_o + he.field_n[var6].field_o) / he.field_n[var2].field_o;
                                              he.field_n[var6].field_c = he.field_n[var6].field_c - (he.field_n[var6].field_o + he.field_n[var2].field_o) / he.field_n[var6].field_o;
                                              break L6;
                                            } else {
                                              he.field_n[var2].field_c = he.field_n[var2].field_c - (he.field_n[var2].field_o + he.field_n[var6].field_o) / he.field_n[var2].field_o;
                                              he.field_n[var6].field_c = he.field_n[var6].field_c + (he.field_n[var6].field_o + he.field_n[var2].field_o) / he.field_n[var6].field_o;
                                              break L6;
                                            }
                                          }
                                          L7: {
                                            L8: {
                                              if (he.field_n[var2].field_d > 0.0) {
                                                break L8;
                                              } else {
                                                if (0.0 >= he.field_n[var6].field_d) {
                                                  break L7;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            if (wd.field_x) {
                                              nj.field_l.a(il.field_a[11], 100, md.field_w * 96 / 256);
                                              break L7;
                                            } else {
                                              if (wd.field_x) {
                                                nj.field_l.a(il.field_a[14], 100, 96 * md.field_w / 256);
                                                break L7;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          L9: {
                                            if (he.field_n[var2].field_d <= 0.0) {
                                              break L9;
                                            } else {
                                              if (he.field_n[var6].field_j < he.field_n[var2].field_j) {
                                                he.field_n[var2].field_l = var6 - -1;
                                                he.field_n[var2].field_d = 0.0;
                                                if (he.field_n[var6].field_i <= 0) {
                                                  he.field_n[var6].field_p = 3;
                                                  he.field_n[var6].field_f = 10;
                                                  break L9;
                                                } else {
                                                  break L9;
                                                }
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          if (0.0 < he.field_n[var6].field_d) {
                                            if (he.field_n[var2].field_j < he.field_n[var6].field_j) {
                                              he.field_n[var6].field_l = 1 + var2;
                                              he.field_n[var6].field_d = 0.0;
                                              if (0 >= he.field_n[var2].field_i) {
                                                he.field_n[var2].field_p = 3;
                                                he.field_n[var2].field_f = 10;
                                                var6++;
                                                continue L5;
                                              } else {
                                                var6++;
                                                continue L5;
                                              }
                                            } else {
                                              var6++;
                                              continue L5;
                                            }
                                          } else {
                                            var6++;
                                            continue L5;
                                          }
                                        } else {
                                          var6++;
                                          continue L5;
                                        }
                                      } else {
                                        var6++;
                                        continue L5;
                                      }
                                    } else {
                                      var6++;
                                      continue L5;
                                    }
                                  } else {
                                    var6++;
                                    continue L5;
                                  }
                                } else {
                                  var6++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L10: {
                          if (he.field_n[var2].field_n > 0) {
                            break L10;
                          } else {
                            if (he.field_n[var2].field_p != 0) {
                              break L10;
                            } else {
                              he.field_n[var2].field_j = -100.0;
                              he.field_n[var2].field_t = -1;
                              break L10;
                            }
                          }
                        }
                        ua.field_c[var2 + (ua.field_b + -3)].field_c = he.field_n[var2].field_u;
                        ua.field_c[var2 + (-3 + ua.field_b)].field_h = he.field_n[var2].field_j - 0.88 * he.field_n[var2].field_e;
                        ua.field_c[ua.field_b + -3 - -var2].field_b = (int)(he.field_n[var2].field_e / 2.0);
                        if (ua.field_b - 3 <= he.field_n[var2].field_t) {
                          L11: {
                            var3 = he.field_n[var2].field_t - ua.field_b + 3;
                            if (he.field_n[var2].field_o <= he.field_n[var3].field_o + 16.0) {
                              break L11;
                            } else {
                              L12: {
                                he.field_n[var2].field_l = 1 + var3;
                                he.field_n[var2].field_q = -4.0;
                                he.field_n[var2].field_t = -1;
                                if (wd.field_x) {
                                  nj.field_l.a(il.field_a[9], 100, 96 * md.field_w / 256);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              if ((he.field_n[var3].field_i ^ -1) >= -1) {
                                he.field_n[var3].field_p = 2;
                                he.field_n[var3].field_f = 99;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (he.field_n[var3].field_d > 0.0) {
                            if (he.field_n[var3].field_j > he.field_n[var2].field_j) {
                              L13: {
                                he.field_n[var3].field_l = var2 + 1;
                                he.field_n[var2].field_q = -4.0;
                                he.field_n[var2].field_t = -1;
                                if (wd.field_x) {
                                  nj.field_l.a(il.field_a[11], 100, 96 * md.field_w / 256);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              if (0 >= he.field_n[var2].field_i) {
                                he.field_n[var2].field_p = 3;
                                he.field_n[var2].field_f = 10;
                                var2++;
                                continue L3;
                              } else {
                                var2++;
                                continue L3;
                              }
                            } else {
                              var2++;
                              continue L3;
                            }
                          } else {
                            var2++;
                            continue L3;
                          }
                        } else {
                          var2++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    ua.field_c[-3 + ua.field_b + var2].field_h = 580.0;
                    var2++;
                    continue L2;
                  }
                }
              } else {
                if (var5[var2]) {
                  if (0 == he.field_n[var2].field_i) {
                    he.field_n[var2].field_i = 100;
                    he.field_n[var2].field_n = he.field_n[var2].field_n - 1;
                    he.field_n[var2].field_q = -4.0;
                    he.field_n[var2].field_t = -1;
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            L14: {
              if (he.field_n[var2].field_l == -1) {
                var5 = var1;
                var5[var2] = true;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var5 = var1;
              if (0 >= he.field_n[var2].field_l) {
                break L15;
              } else {
                var5[he.field_n[var2].field_l + -1] = true;
                break L15;
              }
            }
            he.field_n[var2].field_l = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (-1 != (param0 & 7 ^ -1)) {
            var2 = 8 + -(7 & param0);
        }
        int var3 = param0 + var2;
        if (param1 != 27) {
            int discarded$0 = ca.a(-69, (byte) 34);
        }
        return var3;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -79) {
            return;
        }
        field_e = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
