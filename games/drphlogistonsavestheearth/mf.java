/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mf extends uh {
    int field_C;
    int field_y;
    int field_v;
    int field_w;
    static String field_u;
    static int[] field_x;
    static sd field_A;
    int field_D;
    static int field_F;
    static int[] field_E;
    int field_z;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    public static void g(int param0) {
        if (param0 >= -44) {
          mf.h(-109);
          field_x = null;
          field_E = null;
          field_u = null;
          field_A = null;
          return;
        } else {
          field_x = null;
          field_E = null;
          field_u = null;
          field_A = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param0 != 5) {
          ((mf) this).field_z = 65;
          var6 = ((mf) this).field_z << 977481795;
          param4 = (param4 << -333490908) + (15 & var6);
          var7 = ((mf) this).field_C << -1628453021;
          param1 = (param1 << 428988356) - -(15 & var7);
          ((mf) this).a(var6, var7, param4, param1, param3, param2);
          return;
        } else {
          var6 = ((mf) this).field_z << 977481795;
          param4 = (param4 << -333490908) + (15 & var6);
          var7 = ((mf) this).field_C << -1628453021;
          param1 = (param1 << 428988356) - -(15 & var7);
          ((mf) this).a(var6, var7, param4, param1, param3, param2);
          return;
        }
    }

    final static void h(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        cj.field_e = null;
        gm.field_J = 0;
        ul.field_d = 0;
        ck.field_j = new td[3];
        if (param0 != -8372) {
          L0: {
            mf.h(85);
            pa.field_c = -100;
            sd.field_a.a(255, 0);
            sd.field_a.field_N = (double)(-am.field_l);
            sd.field_a.field_D = 190.0;
            sd.field_a.field_q = sd.field_a.field_q + 1;
            sd.field_a.field_j = 0.0;
            sd.field_a.field_c = 0.0;
            if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
              ib.field_t = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            L2: {
              sd.field_a.field_T = 0;
              sd.field_a.field_R = 0;
              var1 = sd.field_a.field_q;
              if (var1 != 0) {
                if (var1 == -4) {
                  break L2;
                } else {
                  if (-7 == var1) {
                    break L2;
                  } else {
                    r.field_d = 7;
                    tc.field_d = -1;
                    break L1;
                  }
                }
              } else {
                break L2;
              }
            }
            tc.field_d = -1;
            r.field_d = 6;
            break L1;
          }
          L3: {
            sd.field_a.field_X = 0;
            var1 = sd.field_a.field_q;
            if (-1 == (var1 ^ -1)) {
              sc.a(-1, true, ki.field_c);
              break L3;
            } else {
              if ((var1 ^ -1) != -2) {
                if (var1 != -3) {
                  if (var1 != 3) {
                    if ((var1 ^ -1) == -5) {
                      sc.a(-1, true, hi.field_l);
                      break L3;
                    } else {
                      if (var1 != 5) {
                        if (6 != var1) {
                          L4: {
                            if (7 == var1) {
                              break L4;
                            } else {
                              if ((var1 ^ -1) != -9) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L5: {
                            sc.a(param0 + 8371, true, le.field_e);
                            if (-4 < (sd.field_a.field_q ^ -1)) {
                              break L5;
                            } else {
                              if (oh.a(param0 ^ -8372)) {
                                sd.field_a.d((byte) 69);
                                break L5;
                              } else {
                                if (0 < hb.field_g) {
                                  break L5;
                                } else {
                                  sd.field_a.d((byte) 69);
                                  break L5;
                                }
                              }
                            }
                          }
                          L6: {
                            if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                              break L6;
                            } else {
                              ib.field_t = 0;
                              break L6;
                            }
                          }
                          L7: {
                            if (bi.field_K.length <= sd.field_a.field_q) {
                              sc.a(param0 ^ 8371, false, ml.field_l);
                              sd.field_a.d((byte) 98);
                              break L7;
                            } else {
                              sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                              break L7;
                            }
                          }
                          qe.field_a = -150;
                          sd.field_a.field_J = 0;
                          sd.field_a.s(86);
                          return;
                        } else {
                          sc.a(param0 + 8371, true, le.field_e);
                          break L3;
                        }
                      } else {
                        sc.a(-1, true, hi.field_l);
                        break L3;
                      }
                    }
                  } else {
                    L8: {
                      sc.a(-1, true, hi.field_l);
                      if (-4 > sd.field_a.field_q) {
                        break L8;
                      } else {
                        if (oh.a(param0 ^ -8372)) {
                          L9: {
                            sd.field_a.d((byte) 69);
                            if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                              break L9;
                            } else {
                              ib.field_t = 0;
                              break L9;
                            }
                          }
                          L10: {
                            if (bi.field_K.length <= sd.field_a.field_q) {
                              sc.a(param0 ^ 8371, false, ml.field_l);
                              sd.field_a.d((byte) 98);
                              break L10;
                            } else {
                              sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                              break L10;
                            }
                          }
                          qe.field_a = -150;
                          sd.field_a.field_J = 0;
                          sd.field_a.s(86);
                          return;
                        } else {
                          if (0 < hb.field_g) {
                            break L8;
                          } else {
                            L11: {
                              sd.field_a.d((byte) 69);
                              if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                                break L11;
                              } else {
                                ib.field_t = 0;
                                break L11;
                              }
                            }
                            L12: {
                              if (bi.field_K.length <= sd.field_a.field_q) {
                                sc.a(param0 ^ 8371, false, ml.field_l);
                                sd.field_a.d((byte) 98);
                                break L12;
                              } else {
                                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                                break L12;
                              }
                            }
                            qe.field_a = -150;
                            sd.field_a.field_J = 0;
                            sd.field_a.s(86);
                            return;
                          }
                        }
                      }
                    }
                    if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                      if (bi.field_K.length > sd.field_a.field_q) {
                        sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                        qe.field_a = -150;
                        sd.field_a.field_J = 0;
                        sd.field_a.s(86);
                        return;
                      } else {
                        sc.a(param0 ^ 8371, false, ml.field_l);
                        sd.field_a.d((byte) 98);
                        qe.field_a = -150;
                        sd.field_a.field_J = 0;
                        sd.field_a.s(86);
                        return;
                      }
                    } else {
                      L13: {
                        ib.field_t = 0;
                        if (bi.field_K.length <= sd.field_a.field_q) {
                          sc.a(param0 ^ 8371, false, ml.field_l);
                          sd.field_a.d((byte) 98);
                          break L13;
                        } else {
                          sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                          break L13;
                        }
                      }
                      qe.field_a = -150;
                      sd.field_a.field_J = 0;
                      sd.field_a.s(86);
                      return;
                    }
                  }
                } else {
                  sc.a(-1, true, ki.field_c);
                  break L3;
                }
              } else {
                sc.a(-1, true, ki.field_c);
                break L3;
              }
            }
          }
          if (-4 >= (sd.field_a.field_q ^ -1)) {
            if (oh.a(param0 ^ -8372)) {
              sd.field_a.d((byte) 69);
              if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                if (bi.field_K.length <= sd.field_a.field_q) {
                  sc.a(param0 ^ 8371, false, ml.field_l);
                  sd.field_a.d((byte) 98);
                  qe.field_a = -150;
                  sd.field_a.field_J = 0;
                  sd.field_a.s(86);
                  return;
                } else {
                  sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                  qe.field_a = -150;
                  sd.field_a.field_J = 0;
                  sd.field_a.s(86);
                  return;
                }
              } else {
                ib.field_t = 0;
                if (bi.field_K.length <= sd.field_a.field_q) {
                  sc.a(param0 ^ 8371, false, ml.field_l);
                  sd.field_a.d((byte) 98);
                  qe.field_a = -150;
                  sd.field_a.field_J = 0;
                  sd.field_a.s(86);
                  return;
                } else {
                  sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                  qe.field_a = -150;
                  sd.field_a.field_J = 0;
                  sd.field_a.s(86);
                  return;
                }
              }
            } else {
              if (0 >= hb.field_g) {
                sd.field_a.d((byte) 69);
                if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                  if (bi.field_K.length > sd.field_a.field_q) {
                    sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                    qe.field_a = -150;
                    sd.field_a.field_J = 0;
                    sd.field_a.s(86);
                    return;
                  } else {
                    sc.a(param0 ^ 8371, false, ml.field_l);
                    sd.field_a.d((byte) 98);
                    qe.field_a = -150;
                    sd.field_a.field_J = 0;
                    sd.field_a.s(86);
                    return;
                  }
                } else {
                  ib.field_t = 0;
                  if (bi.field_K.length > sd.field_a.field_q) {
                    sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                    qe.field_a = -150;
                    sd.field_a.field_J = 0;
                    sd.field_a.s(86);
                    return;
                  } else {
                    sc.a(param0 ^ 8371, false, ml.field_l);
                    sd.field_a.d((byte) 98);
                    qe.field_a = -150;
                    sd.field_a.field_J = 0;
                    sd.field_a.s(86);
                    return;
                  }
                }
              } else {
                if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                  if (bi.field_K.length > sd.field_a.field_q) {
                    sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                    qe.field_a = -150;
                    sd.field_a.field_J = 0;
                    sd.field_a.s(86);
                    return;
                  } else {
                    sc.a(param0 ^ 8371, false, ml.field_l);
                    sd.field_a.d((byte) 98);
                    qe.field_a = -150;
                    sd.field_a.field_J = 0;
                    sd.field_a.s(86);
                    return;
                  }
                } else {
                  ib.field_t = 0;
                  if (bi.field_K.length > sd.field_a.field_q) {
                    sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                    qe.field_a = -150;
                    sd.field_a.field_J = 0;
                    sd.field_a.s(86);
                    return;
                  } else {
                    sc.a(param0 ^ 8371, false, ml.field_l);
                    sd.field_a.d((byte) 98);
                    qe.field_a = -150;
                    sd.field_a.field_J = 0;
                    sd.field_a.s(86);
                    return;
                  }
                }
              }
            }
          } else {
            if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
              if (bi.field_K.length > sd.field_a.field_q) {
                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                qe.field_a = -150;
                sd.field_a.field_J = 0;
                sd.field_a.s(86);
                return;
              } else {
                sc.a(param0 ^ 8371, false, ml.field_l);
                sd.field_a.d((byte) 98);
                qe.field_a = -150;
                sd.field_a.field_J = 0;
                sd.field_a.s(86);
                return;
              }
            } else {
              ib.field_t = 0;
              if (bi.field_K.length > sd.field_a.field_q) {
                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                qe.field_a = -150;
                sd.field_a.field_J = 0;
                sd.field_a.s(86);
                return;
              } else {
                sc.a(param0 ^ 8371, false, ml.field_l);
                sd.field_a.d((byte) 98);
                qe.field_a = -150;
                sd.field_a.field_J = 0;
                sd.field_a.s(86);
                return;
              }
            }
          }
        } else {
          L14: {
            pa.field_c = -100;
            sd.field_a.a(255, 0);
            sd.field_a.field_N = (double)(-am.field_l);
            sd.field_a.field_D = 190.0;
            sd.field_a.field_q = sd.field_a.field_q + 1;
            sd.field_a.field_j = 0.0;
            sd.field_a.field_c = 0.0;
            if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
              ib.field_t = 0;
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            L16: {
              sd.field_a.field_T = 0;
              sd.field_a.field_R = 0;
              var1 = sd.field_a.field_q;
              if (var1 != 0) {
                if (var1 == -4) {
                  break L16;
                } else {
                  if (-7 == var1) {
                    break L16;
                  } else {
                    r.field_d = 7;
                    tc.field_d = -1;
                    break L15;
                  }
                }
              } else {
                break L16;
              }
            }
            tc.field_d = -1;
            r.field_d = 6;
            break L15;
          }
          L17: {
            sd.field_a.field_X = 0;
            var1 = sd.field_a.field_q;
            if (-1 == (var1 ^ -1)) {
              sc.a(-1, true, ki.field_c);
              break L17;
            } else {
              if ((var1 ^ -1) != -2) {
                if ((var1 ^ -1) != -3) {
                  if (var1 == 3) {
                    sc.a(-1, true, hi.field_l);
                    break L17;
                  } else {
                    if ((var1 ^ -1) == -5) {
                      sc.a(-1, true, hi.field_l);
                      break L17;
                    } else {
                      if (var1 != 5) {
                        if (6 != var1) {
                          L18: {
                            if (7 == var1) {
                              break L18;
                            } else {
                              if ((var1 ^ -1) != -9) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          L19: {
                            sc.a(param0 + 8371, true, le.field_e);
                            if (-4 < (sd.field_a.field_q ^ -1)) {
                              break L19;
                            } else {
                              if (oh.a(param0 ^ -8372)) {
                                sd.field_a.d((byte) 69);
                                break L19;
                              } else {
                                if (0 < hb.field_g) {
                                  break L19;
                                } else {
                                  sd.field_a.d((byte) 69);
                                  break L19;
                                }
                              }
                            }
                          }
                          L20: {
                            if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                              break L20;
                            } else {
                              ib.field_t = 0;
                              break L20;
                            }
                          }
                          L21: {
                            if (bi.field_K.length <= sd.field_a.field_q) {
                              sc.a(param0 ^ 8371, false, ml.field_l);
                              sd.field_a.d((byte) 98);
                              break L21;
                            } else {
                              sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                              break L21;
                            }
                          }
                          qe.field_a = -150;
                          sd.field_a.field_J = 0;
                          sd.field_a.s(86);
                          return;
                        } else {
                          sc.a(param0 + 8371, true, le.field_e);
                          break L17;
                        }
                      } else {
                        sc.a(-1, true, hi.field_l);
                        break L17;
                      }
                    }
                  }
                } else {
                  sc.a(-1, true, ki.field_c);
                  break L17;
                }
              } else {
                sc.a(-1, true, ki.field_c);
                break L17;
              }
            }
          }
          L22: {
            if (-4 < (sd.field_a.field_q ^ -1)) {
              break L22;
            } else {
              if (oh.a(param0 ^ -8372)) {
                L23: {
                  sd.field_a.d((byte) 69);
                  if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                    break L23;
                  } else {
                    ib.field_t = 0;
                    break L23;
                  }
                }
                L24: {
                  if (bi.field_K.length <= sd.field_a.field_q) {
                    sc.a(param0 ^ 8371, false, ml.field_l);
                    sd.field_a.d((byte) 98);
                    break L24;
                  } else {
                    sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                    break L24;
                  }
                }
                qe.field_a = -150;
                sd.field_a.field_J = 0;
                sd.field_a.s(86);
                return;
              } else {
                if (0 < hb.field_g) {
                  break L22;
                } else {
                  L25: {
                    sd.field_a.d((byte) 69);
                    if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                      break L25;
                    } else {
                      ib.field_t = 0;
                      break L25;
                    }
                  }
                  L26: {
                    if (bi.field_K.length <= sd.field_a.field_q) {
                      sc.a(param0 ^ 8371, false, ml.field_l);
                      sd.field_a.d((byte) 98);
                      break L26;
                    } else {
                      sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                      break L26;
                    }
                  }
                  qe.field_a = -150;
                  sd.field_a.field_J = 0;
                  sd.field_a.s(86);
                  return;
                }
              }
            }
          }
          if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
            if (bi.field_K.length > sd.field_a.field_q) {
              sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
              qe.field_a = -150;
              sd.field_a.field_J = 0;
              sd.field_a.s(86);
              return;
            } else {
              sc.a(param0 ^ 8371, false, ml.field_l);
              sd.field_a.d((byte) 98);
              qe.field_a = -150;
              sd.field_a.field_J = 0;
              sd.field_a.s(86);
              return;
            }
          } else {
            L27: {
              ib.field_t = 0;
              if (bi.field_K.length <= sd.field_a.field_q) {
                sc.a(param0 ^ 8371, false, ml.field_l);
                sd.field_a.d((byte) 98);
                break L27;
              } else {
                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                break L27;
              }
            }
            qe.field_a = -150;
            sd.field_a.field_J = 0;
            sd.field_a.s(86);
            return;
          }
        }
    }

    mf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = null;
        field_A = new sd("");
    }
}
