/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static int field_d;
    static int field_e;
    static String[] field_c;
    static String field_b;
    static String field_a;

    final static void a(int param0) {
        tj var1;
        Object var2;
        int var3;
        int var4;
        ed var12;
        ed var13;
        ed var14;
        ed var15;
        ed var16;
        ed var17;
        ed var18;
        ed var19;
        ed var20;
        ed var21;
        ed var22;
        ed var23;
        ed var24;
        ed var25;
        ed var26;
        ed var27;
        ed var28;
        ed var29;
        ed var30;
        ed var31;
        ed var32;
        int var3Lifetime1;
        int var3Lifetime2;
        Object var2Lifetime1;
        Object var2Lifetime2;
        var4 = EscapeVector.field_A;
        var1 = qa.f((byte) -49);
        if (param0 >= 60) {
          if (null != ma.field_a) {
            am.field_k = 0;
            return;
          }
          if (var1 == null &&
            am.field_k < 80) {
            am.field_k = 95;
            rk.field_e.a(qh.field_i, 100, 3072 * qm.field_c / 64, 8192);
          }
          var2 = null;
          var3 = 0;
          if (!wk.field_c) {
            if (pg.field_b) {
              var18 = k.field_j;
              var2 = var18;
              var3 = (77 - var18.field_z) / 2;
            } else {
              if (od.field_q == 0) {
                var17 = kb.field_c;
                var2 = var17;
                var3 = (77 - var17.field_z) / 2;
                if (var2 == null) {
                  if (am.field_k == 110) {
                    rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
                  }
                  if (am.field_k > 80) {
                    am.field_k = am.field_k - 1;
                  }
                } else {
                  fg.field_b = var3;
                  dg.field_t = (ed) (var2);
                  if (am.field_k >= 95) {
                    if (am.field_k < 110) {
                      am.field_k = am.field_k + 1;
                    }
                  } else {
                    am.field_k = 95;
                    rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
                  }
                }
                return;
              }
              if (od.field_q != 1) {
                if (od.field_q != 2) {
                  if (od.field_q != 3) {
                    if (!n.field_h) {
                      if (e.field_a) {
                        if (ce.field_f.b(123)) {
                          var2 = lf.field_I;
                        } else {
                          var2 = oi.field_O;
                        }
                        var3 = (-((ed) (var2)).field_z + 90) / 2;
                        if (var2 == null) {
                          if (am.field_k == 110) {
                            rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
                          }
                          if (am.field_k > 80) {
                            am.field_k = am.field_k - 1;
                          }
                        } else {
                          fg.field_b = var3;
                          dg.field_t = (ed) (var2);
                          if (am.field_k >= 95) {
                            if (am.field_k < 110) {
                              am.field_k = am.field_k + 1;
                            }
                          } else {
                            am.field_k = 95;
                            rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
                          }
                        }
                        return;
                      }
                      if (!hn.field_n) {
                        if (ch.field_b) {
                          var16 = jf.field_H;
                          var2 = var16;
                          var3 = (100 - var16.field_z) / 2;
                        }
                      } else {
                        var15 = na.field_w;
                        var2 = var15;
                        var3 = (66 - var15.field_z) / 2;
                      }
                    }
                  } else {
                    var14 = oj.field_Q;
                    var2 = var14;
                    var3 = (77 - var14.field_z) / 2;
                  }
                } else {
                  var13 = p.field_c;
                  var2 = var13;
                  var3 = (77 - var13.field_z) / 2;
                }
              } else {
                var12 = kb.field_c;
                var2 = var12;
                var3 = (77 - var12.field_z) / 2;
              }
            }
          }
          if (var2 == null) {
            if (am.field_k == 110) {
              rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
            }
            if (am.field_k <= 80) {
              return;
            }
            am.field_k = am.field_k - 1;
          } else {
            fg.field_b = var3;
            dg.field_t = (ed) (var2);
            if (am.field_k < 95) {
              am.field_k = 95;
              rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
              return;
            }
            if (am.field_k < 110) {
              am.field_k = am.field_k + 1;
              return;
            }
          }
          return;
        }
        lh.a((byte) -88);
        if (null != ma.field_a) {
          am.field_k = 0;
          return;
        }
        if (var1 != null) {
          var2Lifetime1 = null;
          var3Lifetime1 = 0;
          if (!wk.field_c) {
            if (pg.field_b) {
              var25 = k.field_j;
              var2Lifetime1 = var25;
              var3Lifetime1 = (77 - var25.field_z) / 2;
            } else {
              if (od.field_q == 0) {
                var24 = kb.field_c;
                var2Lifetime1 = var24;
                var3Lifetime1 = (77 - var24.field_z) / 2;
                if (var2Lifetime1 == null) {
                  if (am.field_k == 110) {
                    rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
                  }
                  if (am.field_k > 80) {
                    am.field_k = am.field_k - 1;
                  }
                } else {
                  fg.field_b = var3Lifetime1;
                  dg.field_t = (ed) (var2Lifetime1);
                  if (am.field_k >= 95) {
                    if (am.field_k < 110) {
                      am.field_k = am.field_k + 1;
                    }
                  } else {
                    am.field_k = 95;
                    rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
                  }
                }
                return;
              }
              if (od.field_q != 1) {
                if (od.field_q != 2) {
                  if (od.field_q != 3) {
                    if (!n.field_h) {
                      if (e.field_a) {
                        if (ce.field_f.b(123)) {
                          var2Lifetime1 = lf.field_I;
                        } else {
                          var2Lifetime1 = oi.field_O;
                        }
                        var3Lifetime1 = (-((ed) (var2Lifetime1)).field_z + 90) / 2;
                        if (var2Lifetime1 == null) {
                          if (am.field_k == 110) {
                            rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
                          }
                          if (am.field_k > 80) {
                            am.field_k = am.field_k - 1;
                          }
                        } else {
                          fg.field_b = var3Lifetime1;
                          dg.field_t = (ed) (var2Lifetime1);
                          if (am.field_k >= 95) {
                            if (am.field_k < 110) {
                              am.field_k = am.field_k + 1;
                            }
                          } else {
                            am.field_k = 95;
                            rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
                          }
                        }
                        return;
                      }
                      if (!hn.field_n) {
                        if (ch.field_b) {
                          var23 = jf.field_H;
                          var2Lifetime1 = var23;
                          var3Lifetime1 = (100 - var23.field_z) / 2;
                        }
                      } else {
                        var22 = na.field_w;
                        var2Lifetime1 = var22;
                        var3Lifetime1 = (66 - var22.field_z) / 2;
                      }
                    }
                  } else {
                    var21 = oj.field_Q;
                    var2Lifetime1 = var21;
                    var3Lifetime1 = (77 - var21.field_z) / 2;
                  }
                } else {
                  var20 = p.field_c;
                  var2Lifetime1 = var20;
                  var3Lifetime1 = (77 - var20.field_z) / 2;
                }
              } else {
                var19 = kb.field_c;
                var2Lifetime1 = var19;
                var3Lifetime1 = (77 - var19.field_z) / 2;
              }
            }
          }
          if (var2Lifetime1 == null) {
            if (am.field_k == 110) {
              rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
            }
            if (am.field_k <= 80) {
              return;
            }
            am.field_k = am.field_k - 1;
            return;
          }
          fg.field_b = var3Lifetime1;
          dg.field_t = (ed) (var2Lifetime1);
          if (am.field_k < 95) {
            am.field_k = 95;
            rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
            return;
          }
          if (am.field_k >= 110) {
            return;
          }
          am.field_k = am.field_k + 1;
          return;
        }
        if (am.field_k < 80) {
          am.field_k = 95;
          rk.field_e.a(qh.field_i, 100, 3072 * qm.field_c / 64, 8192);
        }
        var2Lifetime2 = null;
        var3Lifetime2 = 0;
        if (wk.field_c) {
          if (var2Lifetime2 == null) {
            if (am.field_k == 110) {
              rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
            }
            if (am.field_k <= 80) {
              return;
            }
            am.field_k = am.field_k - 1;
            return;
          }
          fg.field_b = var3Lifetime2;
          dg.field_t = (ed) (var2Lifetime2);
          if (am.field_k < 95) {
            am.field_k = 95;
            rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
            return;
          }
          if (am.field_k >= 110) {
            return;
          }
          am.field_k = am.field_k + 1;
          return;
        }
        if (pg.field_b) {
          var32 = k.field_j;
          var2Lifetime2 = var32;
          var3Lifetime2 = (77 - var32.field_z) / 2;
        } else {
          if (od.field_q == 0) {
            var31 = kb.field_c;
            var2Lifetime2 = var31;
            var3Lifetime2 = (77 - var31.field_z) / 2;
            if (var2Lifetime2 == null) {
              if (am.field_k == 110) {
                rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
              }
              if (am.field_k <= 80) {
                return;
              }
              am.field_k = am.field_k - 1;
            } else {
              fg.field_b = var3Lifetime2;
              dg.field_t = (ed) (var2Lifetime2);
              if (am.field_k < 95) {
                am.field_k = 95;
                rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
                return;
              }
              if (am.field_k < 110) {
                am.field_k = am.field_k + 1;
                return;
              }
            }
            return;
          }
          if (od.field_q != 1) {
            if (od.field_q != 2) {
              if (od.field_q != 3) {
                if (n.field_h) {
                  if (var2Lifetime2 == null) {
                    if (am.field_k == 110) {
                      rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
                    }
                    if (am.field_k <= 80) {
                      return;
                    }
                    am.field_k = am.field_k - 1;
                    return;
                  }
                  fg.field_b = var3Lifetime2;
                  dg.field_t = (ed) (var2Lifetime2);
                  if (am.field_k < 95) {
                    am.field_k = 95;
                    rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
                    return;
                  }
                  if (am.field_k >= 110) {
                    return;
                  }
                  am.field_k = am.field_k + 1;
                  return;
                }
                if (e.field_a) {
                  if (ce.field_f.b(123)) {
                    var2Lifetime2 = lf.field_I;
                  } else {
                    var2Lifetime2 = oi.field_O;
                  }
                  var3Lifetime2 = (-((ed) (var2Lifetime2)).field_z + 90) / 2;
                  if (var2Lifetime2 == null) {
                    if (am.field_k == 110) {
                      rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
                    }
                    if (am.field_k <= 80) {
                      return;
                    }
                    am.field_k = am.field_k - 1;
                  } else {
                    fg.field_b = var3Lifetime2;
                    dg.field_t = (ed) (var2Lifetime2);
                    if (am.field_k < 95) {
                      am.field_k = 95;
                      rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
                      return;
                    }
                    if (am.field_k < 110) {
                      am.field_k = am.field_k + 1;
                      return;
                    }
                  }
                  return;
                }
                if (hn.field_n) {
                  var29 = na.field_w;
                  var2Lifetime2 = var29;
                  var3Lifetime2 = (66 - var29.field_z) / 2;
                  if (var2Lifetime2 == null) {
                    if (am.field_k == 110) {
                      rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
                    }
                    if (am.field_k <= 80) {
                      return;
                    }
                    am.field_k = am.field_k - 1;
                    return;
                  }
                  fg.field_b = var3Lifetime2;
                  dg.field_t = (ed) (var2Lifetime2);
                  if (am.field_k < 95) {
                    am.field_k = 95;
                    rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
                    return;
                  }
                  if (am.field_k >= 110) {
                    return;
                  }
                  am.field_k = am.field_k + 1;
                  return;
                }
                if (!ch.field_b) {
                  if (var2Lifetime2 == null) {
                    if (am.field_k == 110) {
                      rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
                    }
                    if (am.field_k <= 80) {
                      return;
                    }
                    am.field_k = am.field_k - 1;
                  } else {
                    fg.field_b = var3Lifetime2;
                    dg.field_t = (ed) (var2Lifetime2);
                    if (am.field_k < 95) {
                      am.field_k = 95;
                      rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
                      return;
                    }
                    if (am.field_k < 110) {
                      am.field_k = am.field_k + 1;
                      return;
                    }
                  }
                  return;
                }
                var30 = jf.field_H;
                var2Lifetime2 = var30;
                var3Lifetime2 = (100 - var30.field_z) / 2;
                if (var2Lifetime2 == null) {
                  if (am.field_k == 110) {
                    rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
                  }
                  if (am.field_k <= 80) {
                    return;
                  }
                  am.field_k = am.field_k - 1;
                } else {
                  fg.field_b = var3Lifetime2;
                  dg.field_t = (ed) (var2Lifetime2);
                  if (am.field_k < 95) {
                    am.field_k = 95;
                    rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
                    return;
                  }
                  if (am.field_k < 110) {
                    am.field_k = am.field_k + 1;
                    return;
                  }
                }
                return;
              }
              var28 = oj.field_Q;
              var2Lifetime2 = var28;
              var3Lifetime2 = (77 - var28.field_z) / 2;
            } else {
              var27 = p.field_c;
              var2Lifetime2 = var27;
              var3Lifetime2 = (77 - var27.field_z) / 2;
            }
          } else {
            var26 = kb.field_c;
            var2Lifetime2 = var26;
            var3Lifetime2 = (77 - var26.field_z) / 2;
          }
        }
        if (var2Lifetime2 == null) {
          if (am.field_k == 110) {
            rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 8192);
          }
          if (am.field_k <= 80) {
            return;
          }
          am.field_k = am.field_k - 1;
        } else {
          fg.field_b = var3Lifetime2;
          dg.field_t = (ed) (var2Lifetime2);
          if (am.field_k < 95) {
            am.field_k = 95;
            rk.field_e.a(qh.field_i, 100, qm.field_c * 3072 / 64, 8192);
            return;
          }
          if (am.field_k < 110) {
            am.field_k = am.field_k + 1;
            return;
          }
        }
        return;
    }

    final static void a(byte param0, int param1) {
        if (bk.field_r != null) {
          bk.field_r.d(param1, 136);
          if (param0 != 99) {
            lh.a((byte) -88);
            return;
          }
          return;
        }
        if (param0 == 99) {
          return;
        }
        lh.a((byte) -88);
    }

    final static boolean b(byte param0) {
        int var1 = 1;
        int var3 = 116 / ((param0 + 18) / 46);
        wc var2 = di.field_d;
        if (var2 != null) {
          var1 = var2.field_j ? 1 : 0;
        }
        return var1 != 0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 26) {
          lh.b((byte) 37);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_c = new String[]{"Commander, you have been tasked with eliminating the alien's fuel processing facilities located in their asteroid belt.", "Seek out and destroy their manufacturing equipment.", "Your ship has been outfitted with a more powerful engine and its guns have also been upgraded."};
        field_b = "Login: ";
        field_a = "Members";
    }
}
