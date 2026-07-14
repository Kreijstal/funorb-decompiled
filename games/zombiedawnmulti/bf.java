/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends br {
    static tq field_n;
    static ja field_f;
    private th field_p;
    private int[][] field_k;
    static boolean field_m;
    static String field_j;
    int field_l;
    static String field_q;
    int field_i;
    int field_o;
    static cj field_h;
    static int field_g;

    final boolean a(lm param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        ui var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 == 0) {
          var3 = param0.e((byte) -112);
          var4 = param0.g(param1 ^ 1829947600);
          var5 = (ui) (Object) ((bf) this).field_p.c(69);
          L0: while (true) {
            if (var5 != null) {
              if (var5.a(param1 + 40, var3, var4)) {
                return true;
              } else {
                var5 = (ui) (Object) ((bf) this).field_p.b(6);
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          ((bf) this).c(-49);
          var3 = param0.e((byte) -112);
          var4 = param0.g(param1 ^ 1829947600);
          var5 = (ui) (Object) ((bf) this).field_p.c(69);
          L1: while (true) {
            if (var5 != null) {
              if (var5.a(param1 + 40, var3, var4)) {
                return true;
              } else {
                var5 = (ui) (Object) ((bf) this).field_p.b(6);
                continue L1;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(ka param0, int param1) {
        int var2 = 0;
        int var4 = 0;
        ka var5 = null;
        ka var6 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != param0.field_d) {
          if (param0.field_i != 0) {
            var2 = 0;
            L0: while (true) {
              if (uf.field_g > var2) {
                var6 = uk.field_M[var2];
                if (-3 == (var6.field_l ^ -1)) {
                  if (var6.field_i == param0.field_i) {
                    if (param0.field_o == var6.field_o) {
                      return;
                    } else {
                      var2++;
                      continue L0;
                    }
                  } else {
                    var2++;
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              } else {
                L1: {
                  if (param0.field_r != null) {
                    ld.field_Kb = param0.field_a;
                    bq.field_f = param0.field_e;
                    tb.field_t = param0.field_r;
                    en.field_c = param0.field_l;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var2 = 98 % ((param1 - -13) / 35);
                vk.a(param0, (byte) 83);
                return;
              }
            }
          } else {
            if (param0.field_o != 0) {
              var2 = 0;
              if (uf.field_g > var2) {
                var5 = uk.field_M[var2];
                if (-3 == (var5.field_l ^ -1)) {
                  if (var5.field_i == param0.field_i) {
                    if (param0.field_o == var5.field_o) {
                      return;
                    } else {
                      L2: {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        if (param0.field_r != null) {
                          ld.field_Kb = param0.field_a;
                          bq.field_f = param0.field_e;
                          tb.field_t = param0.field_r;
                          en.field_c = param0.field_l;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var2 = 98 % ((param1 - -13) / 35);
                      vk.a(param0, (byte) 83);
                      return;
                    }
                  } else {
                    L3: {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      if (param0.field_r != null) {
                        ld.field_Kb = param0.field_a;
                        bq.field_f = param0.field_e;
                        tb.field_t = param0.field_r;
                        en.field_c = param0.field_l;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2 = 98 % ((param1 - -13) / 35);
                    vk.a(param0, (byte) 83);
                    return;
                  }
                } else {
                  var2++;
                  L4: {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    if (param0.field_r != null) {
                      ld.field_Kb = param0.field_a;
                      bq.field_f = param0.field_e;
                      tb.field_t = param0.field_r;
                      en.field_c = param0.field_l;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var2 = 98 % ((param1 - -13) / 35);
                  vk.a(param0, (byte) 83);
                  return;
                }
              } else {
                L5: {
                  if (param0.field_r != null) {
                    ld.field_Kb = param0.field_a;
                    bq.field_f = param0.field_e;
                    tb.field_t = param0.field_r;
                    en.field_c = param0.field_l;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var2 = 98 % ((param1 - -13) / 35);
                vk.a(param0, (byte) 83);
                return;
              }
            } else {
              L6: {
                if (param0.field_r != null) {
                  ld.field_Kb = param0.field_a;
                  bq.field_f = param0.field_e;
                  tb.field_t = param0.field_r;
                  en.field_c = param0.field_l;
                  break L6;
                } else {
                  break L6;
                }
              }
              var2 = 98 % ((param1 - -13) / 35);
              vk.a(param0, (byte) 83);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 29919) {
            return;
        }
        field_n = null;
        field_j = null;
        field_h = null;
        field_q = null;
    }

    final boolean a(int param0, int param1, byte param2) {
        int var5 = 0;
        Object var6 = null;
        ui var7 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = (ui) (Object) ((bf) this).field_p.c(param2 ^ 100);
        L0: while (true) {
          if (var7 == null) {
            if (param2 != 29) {
              var6 = null;
              bf.a(false, -90, (String) null);
              return false;
            } else {
              return false;
            }
          } else {
            if (!var7.a(param2 + -146, param0, param1)) {
              var7 = (ui) (Object) ((bf) this).field_p.b(6);
              continue L0;
            } else {
              return true;
            }
          }
        }
    }

    final void c(int param0) {
        int var3 = 0;
        ui var4 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 0) {
          return;
        } else {
          var4 = (ui) (Object) ((bf) this).field_p.c(43);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              var4.c(9307);
              var4 = (ui) (Object) ((bf) this).field_p.b(6);
              continue L0;
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = -43 / ((param0 - -32) / 47);
        ((bf) this).a(true);
    }

    final static void a(boolean param0, int param1, String param2) {
        int var3 = 0;
        nj.field_f = false;
        ud.field_ab = false;
        if (param0) {
          L0: {
            if (null == h.field_L) {
              break L0;
            } else {
              if (!h.field_L.field_R) {
                break L0;
              } else {
                L1: {
                  var3 = 1;
                  if (-9 != (param1 ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (ch.field_e) {
                        param2 = ql.field_f;
                        break L2;
                      } else {
                        param2 = f.field_b;
                        break L2;
                      }
                    }
                    param1 = 2;
                    b.field_c.a(-120, fa.field_Ib);
                    break L1;
                  }
                }
                L3: {
                  if ((param1 ^ -1) != -11) {
                    break L3;
                  } else {
                    var3 = 0;
                    ua.i(-2);
                    break L3;
                  }
                }
                L4: {
                  if (var3 == 0) {
                    break L4;
                  } else {
                    L5: {
                      if (!ud.field_ab) {
                        break L5;
                      } else {
                        param2 = vl.a(cj.field_Eb, new String[1], 2);
                        break L5;
                      }
                    }
                    L6: {
                      if (bl.field_h) {
                        param2 = wg.field_c;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    h.field_L.a(param2, 125, param1);
                    break L4;
                  }
                }
                if (256 == param1) {
                  break L0;
                } else {
                  if ((param1 ^ -1) != -11) {
                    if (ch.field_e) {
                      break L0;
                    } else {
                      b.field_c.g((byte) 106);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          field_j = null;
          if (null != h.field_L) {
            if (h.field_L.field_R) {
              L7: {
                var3 = 1;
                if (-9 != (param1 ^ -1)) {
                  break L7;
                } else {
                  L8: {
                    if (ch.field_e) {
                      param2 = ql.field_f;
                      break L8;
                    } else {
                      param2 = f.field_b;
                      break L8;
                    }
                  }
                  param1 = 2;
                  b.field_c.a(-120, fa.field_Ib);
                  break L7;
                }
              }
              L9: {
                if ((param1 ^ -1) != -11) {
                  break L9;
                } else {
                  var3 = 0;
                  ua.i(-2);
                  break L9;
                }
              }
              L10: {
                if (var3 == 0) {
                  break L10;
                } else {
                  L11: {
                    if (!ud.field_ab) {
                      break L11;
                    } else {
                      param2 = vl.a(cj.field_Eb, new String[1], 2);
                      break L11;
                    }
                  }
                  L12: {
                    if (bl.field_h) {
                      param2 = wg.field_c;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  h.field_L.a(param2, 125, param1);
                  break L10;
                }
              }
              if (256 != param1) {
                if ((param1 ^ -1) != -11) {
                  if (!ch.field_e) {
                    b.field_c.g((byte) 106);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    bf(fh param0, int param1, int param2, int param3) {
        boolean[][] var5 = null;
        boolean[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean[][] var10_ref_boolean____ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean[][] var15 = null;
        int var16 = 0;
        boolean[][] var17 = null;
        boolean[][] var18 = null;
        boolean[][] var19 = null;
        boolean[][] var20 = null;
        ((bf) this).field_k = param0.field_i.field_k;
        ((bf) this).field_l = param3;
        ((bf) this).field_i = param2;
        ((bf) this).field_o = param1;
        param3 = param3 / 24;
        param2 = param2 / 24;
        var20 = new boolean[oi.field_i * 2 - -1][1 + 2 * oi.field_i];
        var19 = var20;
        var18 = var19;
        var17 = var18;
        var15 = var17;
        var5 = var15;
        var6 = new boolean[var20.length][var20[0].length];
        var7 = param2 - oi.field_i;
        var8 = param3 + -oi.field_i;
        var15[oi.field_i][oi.field_i] = true;
        var9 = 0;
        L0: while (true) {
          if (oi.field_i <= var9) {
            ((bf) this).field_p = new th();
            var9 = 0;
            L1: while (true) {
              if (var5.length <= var9) {
              } else {
                var16 = 0;
                var10 = var16;
                L2: while (true) {
                  if (var5[0].length <= var16) {
                    var9++;
                    continue L1;
                  } else {
                    var11 = var7 + var16;
                    var12 = var9 - -var8;
                    var13 = (param3 + -var12) * (-var12 + param3) + (param2 + -var11) * (param2 - var11);
                    if (64 <= var13) {
                      var16++;
                      continue L2;
                    } else {
                      if (!var5[var9][var16]) {
                        var16++;
                        continue L2;
                      } else {
                        ((bf) this).field_p.a((br) (Object) new ui(var11, var12, var13), false);
                        var16++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var10 = 0;
            L3: while (true) {
              if (var5.length <= var10) {
                var10_ref_boolean____ = var5;
                var5 = var6;
                var6 = var10_ref_boolean____;
                var9++;
                continue L0;
              } else {
                var11 = 0;
                L4: while (true) {
                  if (var5[0].length <= var11) {
                    var10++;
                    continue L3;
                  } else {
                    var12 = var11 - -var7;
                    var13 = var10 - -var8;
                    if (var12 <= 0) {
                      var11++;
                      continue L4;
                    } else {
                      if (-1 <= (var13 ^ -1)) {
                        var11++;
                        continue L4;
                      } else {
                        if (var12 >= ((bf) this).field_k[0].length) {
                          var11++;
                          continue L4;
                        } else {
                          if (((bf) this).field_k.length <= var13) {
                            var11++;
                            continue L4;
                          } else {
                            if ((((bf) this).field_k[var13][var12] & 1) == 0) {
                              var11++;
                              continue L4;
                            } else {
                              L5: {
                                if (var5[var10][var11]) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (-1 <= var11) {
                                      break L6;
                                    } else {
                                      if (var5[var10][var11 - 1]) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  L7: {
                                    if (-1 >= var10) {
                                      break L7;
                                    } else {
                                      if (var5[var10 - 1][var11]) {
                                        break L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  L8: {
                                    if (var11 >= var5[0].length - 1) {
                                      break L8;
                                    } else {
                                      if (var5[var10][var11 + 1]) {
                                        break L5;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  if (var10 >= -1 + var5.length) {
                                    var11++;
                                    continue L4;
                                  } else {
                                    if (!var5[1 + var10][var11]) {
                                      var11++;
                                      continue L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              var6[var10][var11] = true;
                              var11++;
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = false;
        field_j = "Full";
        field_q = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
