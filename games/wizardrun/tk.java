/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk implements bf {
    static String field_e;
    private int field_c;
    static String field_f;
    private int field_b;
    private vd field_d;
    static int field_a;

    final static void a(int param0, o param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        r.field_a = param7;
        ta.field_a = param2;
        ka.field_i = param3;
        cb.field_a = param8;
        uk.field_b = param1;
        sl.field_r = param0;
        if (param6 != 2) {
          tk.a(-15);
          jg.field_m = param5;
          kk.field_xb = param4;
          return;
        } else {
          jg.field_m = param5;
          kk.field_xb = param4;
          return;
        }
    }

    public static void a(int param0) {
        int var1 = -36 / ((param0 - -42) / 63);
        field_f = null;
        field_e = null;
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = wizardrun.field_H;
        if (!param2.field_v) {
          if (!param2.d((byte) 53)) {
            var6 = 2188450;
            if (param3) {
              int discarded$6 = ((tk) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_k + "</u>", param2.field_o + param0, param1 + param2.field_l, param2.field_r, param2.field_n, var6, -1, ((tk) this).field_c, ((tk) this).field_b, ((tk) this).field_d.field_M + ((tk) this).field_d.field_B);
              if (param2.d((byte) 53)) {
                L0: {
                  var7 = ((tk) this).field_d.b(param2.field_k);
                  var8 = ((tk) this).field_d.field_M - -((tk) this).field_d.field_B;
                  var9 = param2.field_o + param0;
                  var10 = param2.field_l + param1;
                  if (2 == ((tk) this).field_c) {
                    var9 = var9 + (-var7 + param2.field_r);
                    break L0;
                  } else {
                    if ((((tk) this).field_c ^ -1) != -2) {
                      break L0;
                    } else {
                      var9 = var9 + (param2.field_r + -var7 >> -1136280575);
                      if (((tk) this).field_b != 2) {
                        if (1 != ((tk) this).field_b) {
                          nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                          return;
                        } else {
                          var10 = var10 + (param2.field_n + -var8 >> -2056119423);
                          nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                          return;
                        }
                      } else {
                        var10 = var10 + (param2.field_n - var8);
                        nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                        return;
                      }
                    }
                  }
                }
                if (((tk) this).field_b != 2) {
                  if (1 != ((tk) this).field_b) {
                    nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                    return;
                  } else {
                    var10 = var10 + (param2.field_n + -var8 >> -2056119423);
                    nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                    return;
                  }
                } else {
                  var10 = var10 + (param2.field_n - var8);
                  nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                  return;
                }
              } else {
                return;
              }
            } else {
              ((tk) this).field_b = 65;
              int discarded$7 = ((tk) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_k + "</u>", param2.field_o + param0, param1 + param2.field_l, param2.field_r, param2.field_n, var6, -1, ((tk) this).field_c, ((tk) this).field_b, ((tk) this).field_d.field_M + ((tk) this).field_d.field_B);
              if (param2.d((byte) 53)) {
                L1: {
                  var7 = ((tk) this).field_d.b(param2.field_k);
                  var8 = ((tk) this).field_d.field_M - -((tk) this).field_d.field_B;
                  var9 = param2.field_o + param0;
                  var10 = param2.field_l + param1;
                  if (2 == ((tk) this).field_c) {
                    var9 = var9 + (-var7 + param2.field_r);
                    break L1;
                  } else {
                    if ((((tk) this).field_c ^ -1) != -2) {
                      break L1;
                    } else {
                      L2: {
                        var9 = var9 + (param2.field_r + -var7 >> -1136280575);
                        if (((tk) this).field_b != 2) {
                          if (1 == ((tk) this).field_b) {
                            var10 = var10 + (param2.field_n + -var8 >> -2056119423);
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          var10 = var10 + (param2.field_n - var8);
                          break L2;
                        }
                      }
                      nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                      return;
                    }
                  }
                }
                if (((tk) this).field_b != 2) {
                  if (1 != ((tk) this).field_b) {
                    nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                    return;
                  } else {
                    var10 = var10 + (param2.field_n + -var8 >> -2056119423);
                    nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                    return;
                  }
                } else {
                  var10 = var10 + (param2.field_n - var8);
                  nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            var6 = 3249872;
            if (param3) {
              int discarded$8 = ((tk) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_k + "</u>", param2.field_o + param0, param1 + param2.field_l, param2.field_r, param2.field_n, var6, -1, ((tk) this).field_c, ((tk) this).field_b, ((tk) this).field_d.field_M + ((tk) this).field_d.field_B);
              if (param2.d((byte) 53)) {
                L3: {
                  var7 = ((tk) this).field_d.b(param2.field_k);
                  var8 = ((tk) this).field_d.field_M - -((tk) this).field_d.field_B;
                  var9 = param2.field_o + param0;
                  var10 = param2.field_l + param1;
                  if (2 == ((tk) this).field_c) {
                    var9 = var9 + (-var7 + param2.field_r);
                    break L3;
                  } else {
                    if ((((tk) this).field_c ^ -1) != -2) {
                      break L3;
                    } else {
                      var9 = var9 + (param2.field_r + -var7 >> -1136280575);
                      if (((tk) this).field_b != 2) {
                        if (1 != ((tk) this).field_b) {
                          nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                          return;
                        } else {
                          var10 = var10 + (param2.field_n + -var8 >> -2056119423);
                          nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                          return;
                        }
                      } else {
                        var10 = var10 + (param2.field_n - var8);
                        nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                        return;
                      }
                    }
                  }
                }
                if (((tk) this).field_b != 2) {
                  if (1 != ((tk) this).field_b) {
                    nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                    return;
                  } else {
                    var10 = var10 + (param2.field_n + -var8 >> -2056119423);
                    nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                    return;
                  }
                } else {
                  var10 = var10 + (param2.field_n - var8);
                  nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                  return;
                }
              } else {
                return;
              }
            } else {
              L4: {
                ((tk) this).field_b = 65;
                int discarded$9 = ((tk) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_k + "</u>", param2.field_o + param0, param1 + param2.field_l, param2.field_r, param2.field_n, var6, -1, ((tk) this).field_c, ((tk) this).field_b, ((tk) this).field_d.field_M + ((tk) this).field_d.field_B);
                if (param2.d((byte) 53)) {
                  L5: {
                    var7 = ((tk) this).field_d.b(param2.field_k);
                    var8 = ((tk) this).field_d.field_M - -((tk) this).field_d.field_B;
                    var9 = param2.field_o + param0;
                    var10 = param2.field_l + param1;
                    if (2 == ((tk) this).field_c) {
                      var9 = var9 + (-var7 + param2.field_r);
                      break L5;
                    } else {
                      if ((((tk) this).field_c ^ -1) != -2) {
                        break L5;
                      } else {
                        var9 = var9 + (param2.field_r + -var7 >> -1136280575);
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (((tk) this).field_b != 2) {
                      if (1 == ((tk) this).field_b) {
                        var10 = var10 + (param2.field_n + -var8 >> -2056119423);
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      var10 = var10 + (param2.field_n - var8);
                      break L6;
                    }
                  }
                  nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          }
        } else {
          var6 = 3249872;
          if (param3) {
            int discarded$10 = ((tk) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_k + "</u>", param2.field_o + param0, param1 + param2.field_l, param2.field_r, param2.field_n, var6, -1, ((tk) this).field_c, ((tk) this).field_b, ((tk) this).field_d.field_M + ((tk) this).field_d.field_B);
            if (param2.d((byte) 53)) {
              L7: {
                var7 = ((tk) this).field_d.b(param2.field_k);
                var8 = ((tk) this).field_d.field_M - -((tk) this).field_d.field_B;
                var9 = param2.field_o + param0;
                var10 = param2.field_l + param1;
                if (2 == ((tk) this).field_c) {
                  var9 = var9 + (-var7 + param2.field_r);
                  break L7;
                } else {
                  if ((((tk) this).field_c ^ -1) != -2) {
                    break L7;
                  } else {
                    L8: {
                      var9 = var9 + (param2.field_r + -var7 >> -1136280575);
                      if (((tk) this).field_b != 2) {
                        if (1 == ((tk) this).field_b) {
                          var10 = var10 + (param2.field_n + -var8 >> -2056119423);
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        var10 = var10 + (param2.field_n - var8);
                        break L8;
                      }
                    }
                    nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                    return;
                  }
                }
              }
              if (((tk) this).field_b != 2) {
                if (1 != ((tk) this).field_b) {
                  nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                  return;
                } else {
                  var10 = var10 + (param2.field_n + -var8 >> -2056119423);
                  nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                  return;
                }
              } else {
                var10 = var10 + (param2.field_n - var8);
                nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                return;
              }
            } else {
              return;
            }
          } else {
            L9: {
              ((tk) this).field_b = 65;
              int discarded$11 = ((tk) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_k + "</u>", param2.field_o + param0, param1 + param2.field_l, param2.field_r, param2.field_n, var6, -1, ((tk) this).field_c, ((tk) this).field_b, ((tk) this).field_d.field_M + ((tk) this).field_d.field_B);
              if (param2.d((byte) 53)) {
                L10: {
                  var7 = ((tk) this).field_d.b(param2.field_k);
                  var8 = ((tk) this).field_d.field_M - -((tk) this).field_d.field_B;
                  var9 = param2.field_o + param0;
                  var10 = param2.field_l + param1;
                  if (2 == ((tk) this).field_c) {
                    var9 = var9 + (-var7 + param2.field_r);
                    break L10;
                  } else {
                    if ((((tk) this).field_c ^ -1) != -2) {
                      break L10;
                    } else {
                      var9 = var9 + (param2.field_r + -var7 >> -1136280575);
                      break L10;
                    }
                  }
                }
                L11: {
                  if (((tk) this).field_b != 2) {
                    if (1 == ((tk) this).field_b) {
                      var10 = var10 + (param2.field_n + -var8 >> -2056119423);
                      break L11;
                    } else {
                      break L11;
                    }
                  } else {
                    var10 = var10 + (param2.field_n - var8);
                    break L11;
                  }
                }
                nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
                break L9;
              } else {
                break L9;
              }
            }
            return;
          }
        }
    }

    public tk() {
        ((tk) this).field_d = gh.field_b;
        ((tk) this).field_b = 1;
        ((tk) this).field_c = 1;
    }

    tk(vd param0, int param1, int param2) {
        ((tk) this).field_b = param2;
        ((tk) this).field_d = param0;
        ((tk) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading graphics";
        field_f = "Unfortunately you are not eligible to create an account.";
        field_a = -1;
    }
}
