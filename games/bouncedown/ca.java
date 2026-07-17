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
        RuntimeException var1 = null;
        boolean[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            var5 = new boolean[]{false, false, false};
            var1_array = var5;
            var2 = 0;
            L1: while (true) {
              if (~vk.field_b >= ~var2) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= vk.field_b) {
                    var2 = vk.field_b;
                    L3: while (true) {
                      if (var2 >= 3) {
                        var2 = 0;
                        L4: while (true) {
                          if (var2 >= vk.field_b) {
                            var2 = 0;
                            L5: while (true) {
                              if (~var2 <= ~vk.field_b) {
                                break L0;
                              } else {
                                var6 = 1 + var2;
                                var3 = var6;
                                L6: while (true) {
                                  if (~var6 <= ~vk.field_b) {
                                    var2++;
                                    continue L5;
                                  } else {
                                    L7: {
                                      if (he.field_n[var2].field_j <= he.field_n[var6].field_j - he.field_n[var6].field_e + 5.0) {
                                        break L7;
                                      } else {
                                        if (-he.field_n[var2].field_e + he.field_n[var2].field_j + 5.0 >= he.field_n[var6].field_j) {
                                          break L7;
                                        } else {
                                          if (var2 == var6) {
                                            break L7;
                                          } else {
                                            if (he.field_n[var2].field_e / 2.0 + he.field_n[var2].field_u <= he.field_n[var6].field_u - he.field_n[var6].field_e / 2.0) {
                                              break L7;
                                            } else {
                                              if (he.field_n[var6].field_e / 2.0 + he.field_n[var6].field_u > -(he.field_n[var2].field_e / 2.0) + he.field_n[var2].field_u) {
                                                L8: {
                                                  if (he.field_n[var2].field_u >= he.field_n[var6].field_u) {
                                                    he.field_n[var2].field_c = he.field_n[var2].field_c + (he.field_n[var2].field_o + he.field_n[var6].field_o) / he.field_n[var2].field_o;
                                                    he.field_n[var6].field_c = he.field_n[var6].field_c - (he.field_n[var6].field_o + he.field_n[var2].field_o) / he.field_n[var6].field_o;
                                                    break L8;
                                                  } else {
                                                    he.field_n[var2].field_c = he.field_n[var2].field_c - (he.field_n[var2].field_o + he.field_n[var6].field_o) / he.field_n[var2].field_o;
                                                    he.field_n[var6].field_c = he.field_n[var6].field_c + (he.field_n[var6].field_o + he.field_n[var2].field_o) / he.field_n[var6].field_o;
                                                    break L8;
                                                  }
                                                }
                                                L9: {
                                                  L10: {
                                                    if (he.field_n[var2].field_d > 0.0) {
                                                      break L10;
                                                    } else {
                                                      if (0.0 >= he.field_n[var6].field_d) {
                                                        break L9;
                                                      } else {
                                                        break L10;
                                                      }
                                                    }
                                                  }
                                                  if (wd.field_x) {
                                                    nj.field_l.a(il.field_a[11], 100, md.field_w * 96 / 256);
                                                    break L9;
                                                  } else {
                                                    if (wd.field_x) {
                                                      nj.field_l.a(il.field_a[14], 100, 96 * md.field_w / 256);
                                                      break L9;
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                L11: {
                                                  if (he.field_n[var2].field_d <= 0.0) {
                                                    break L11;
                                                  } else {
                                                    if (he.field_n[var6].field_j < he.field_n[var2].field_j) {
                                                      he.field_n[var2].field_l = var6 - -1;
                                                      he.field_n[var2].field_d = 0.0;
                                                      if (he.field_n[var6].field_i <= 0) {
                                                        he.field_n[var6].field_p = 3;
                                                        he.field_n[var6].field_f = 10;
                                                        break L11;
                                                      } else {
                                                        break L11;
                                                      }
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                }
                                                if (0.0 >= he.field_n[var6].field_d) {
                                                  break L7;
                                                } else {
                                                  if (he.field_n[var2].field_j >= he.field_n[var6].field_j) {
                                                    break L7;
                                                  } else {
                                                    he.field_n[var6].field_l = 1 + var2;
                                                    he.field_n[var6].field_d = 0.0;
                                                    if (0 < he.field_n[var2].field_i) {
                                                      break L7;
                                                    } else {
                                                      he.field_n[var2].field_p = 3;
                                                      he.field_n[var2].field_f = 10;
                                                      break L7;
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            L12: {
                              if (he.field_n[var2].field_n > 0) {
                                break L12;
                              } else {
                                if (he.field_n[var2].field_p != 0) {
                                  break L12;
                                } else {
                                  he.field_n[var2].field_j = -100.0;
                                  he.field_n[var2].field_t = -1;
                                  break L12;
                                }
                              }
                            }
                            L13: {
                              ua.field_c[var2 + (ua.field_b + -3)].field_c = he.field_n[var2].field_u;
                              ua.field_c[var2 + (-3 + ua.field_b)].field_h = he.field_n[var2].field_j - 0.88 * he.field_n[var2].field_e;
                              ua.field_c[ua.field_b + -3 - -var2].field_b = (int)(he.field_n[var2].field_e / 2.0);
                              if (~(ua.field_b - 3) < ~he.field_n[var2].field_t) {
                                break L13;
                              } else {
                                L14: {
                                  var3 = he.field_n[var2].field_t - ua.field_b + 3;
                                  if (he.field_n[var2].field_o <= he.field_n[var3].field_o + 16.0) {
                                    break L14;
                                  } else {
                                    L15: {
                                      he.field_n[var2].field_l = 1 + var3;
                                      he.field_n[var2].field_q = -4.0;
                                      he.field_n[var2].field_t = -1;
                                      if (wd.field_x) {
                                        nj.field_l.a(il.field_a[9], 100, 96 * md.field_w / 256);
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    if (he.field_n[var3].field_i <= 0) {
                                      he.field_n[var3].field_p = 2;
                                      he.field_n[var3].field_f = 99;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                if (he.field_n[var3].field_d <= 0.0) {
                                  break L13;
                                } else {
                                  if (he.field_n[var3].field_j <= he.field_n[var2].field_j) {
                                    break L13;
                                  } else {
                                    L16: {
                                      he.field_n[var3].field_l = var2 + 1;
                                      he.field_n[var2].field_q = -4.0;
                                      he.field_n[var2].field_t = -1;
                                      if (wd.field_x) {
                                        nj.field_l.a(il.field_a[11], 100, 96 * md.field_w / 256);
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    }
                                    if (0 < he.field_n[var2].field_i) {
                                      break L13;
                                    } else {
                                      he.field_n[var2].field_p = 3;
                                      he.field_n[var2].field_f = 10;
                                      break L13;
                                    }
                                  }
                                }
                              }
                            }
                            var2++;
                            continue L4;
                          }
                        }
                      } else {
                        ua.field_c[-3 + ua.field_b + var2].field_h = 580.0;
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    L17: {
                      if (var5[var2]) {
                        if (0 != he.field_n[var2].field_i) {
                          break L17;
                        } else {
                          he.field_n[var2].field_i = 100;
                          he.field_n[var2].field_n = he.field_n[var2].field_n - 1;
                          he.field_n[var2].field_q = -4.0;
                          he.field_n[var2].field_t = -1;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    var2++;
                    continue L2;
                  }
                }
              } else {
                L18: {
                  if (he.field_n[var2].field_l == -1) {
                    var5[var2] = true;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (0 >= he.field_n[var2].field_l) {
                    break L19;
                  } else {
                    var5[he.field_n[var2].field_l + -1] = true;
                    break L19;
                  }
                }
                he.field_n[var2].field_l = 0;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "ca.C(" + 0 + 41);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if ((param0 & 7) != 0) {
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
