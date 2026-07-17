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

    public static void g() {
        field_x = null;
        field_E = null;
        field_u = null;
        field_A = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param0 != 5) {
          ((mf) this).field_z = 65;
          var6 = ((mf) this).field_z << 3;
          param4 = (param4 << 4) + (15 & var6);
          var7 = ((mf) this).field_C << 3;
          param1 = (param1 << 4) - -(15 & var7);
          ((mf) this).a(var6, var7, param4, param1, param3, param2);
          return;
        } else {
          var6 = ((mf) this).field_z << 3;
          param4 = (param4 << 4) + (15 & var6);
          var7 = ((mf) this).field_C << 3;
          param1 = (param1 << 4) - -(15 & var7);
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
            sd.field_a.field_T = 0;
            sd.field_a.field_R = 0;
            var1 = sd.field_a.field_q;
            if (var1 != 0) {
              if (var1 == 3) {
                tc.field_d = -1;
                r.field_d = 6;
                break L1;
              } else {
                if (var1 == 6) {
                  tc.field_d = -1;
                  r.field_d = 6;
                  break L1;
                } else {
                  r.field_d = 7;
                  tc.field_d = -1;
                  break L1;
                }
              }
            } else {
              tc.field_d = -1;
              r.field_d = 6;
              break L1;
            }
          }
          L2: {
            sd.field_a.field_X = 0;
            var1 = sd.field_a.field_q;
            if (var1 == 0) {
              sc.a(-1, true, ki.field_c);
              break L2;
            } else {
              if (var1 != 1) {
                if (var1 != 2) {
                  if (var1 != 3) {
                    if (var1 == 4) {
                      sc.a(-1, true, hi.field_l);
                      break L2;
                    } else {
                      if (var1 != 5) {
                        if (6 != var1) {
                          L3: {
                            if (7 == var1) {
                              break L3;
                            } else {
                              if (var1 != 8) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L4: {
                            sc.a(param0 + 8371, true, le.field_e);
                            if (sd.field_a.field_q < 3) {
                              break L4;
                            } else {
                              if (oh.a(param0 ^ -8372)) {
                                sd.field_a.d((byte) 69);
                                break L4;
                              } else {
                                if (0 < hb.field_g) {
                                  break L4;
                                } else {
                                  sd.field_a.d((byte) 69);
                                  break L4;
                                }
                              }
                            }
                          }
                          L5: {
                            if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                              break L5;
                            } else {
                              ib.field_t = 0;
                              break L5;
                            }
                          }
                          L6: {
                            if (~bi.field_K.length >= ~sd.field_a.field_q) {
                              sc.a(param0 ^ 8371, false, ml.field_l);
                              sd.field_a.d((byte) 98);
                              break L6;
                            } else {
                              sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                              break L6;
                            }
                          }
                          qe.field_a = -150;
                          sd.field_a.field_J = 0;
                          sd.field_a.s(86);
                          return;
                        } else {
                          sc.a(param0 + 8371, true, le.field_e);
                          break L2;
                        }
                      } else {
                        sc.a(-1, true, hi.field_l);
                        break L2;
                      }
                    }
                  } else {
                    L7: {
                      sc.a(-1, true, hi.field_l);
                      if (sd.field_a.field_q < 3) {
                        break L7;
                      } else {
                        if (oh.a(param0 ^ -8372)) {
                          L8: {
                            sd.field_a.d((byte) 69);
                            if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                              break L8;
                            } else {
                              ib.field_t = 0;
                              break L8;
                            }
                          }
                          L9: {
                            if (~bi.field_K.length >= ~sd.field_a.field_q) {
                              sc.a(param0 ^ 8371, false, ml.field_l);
                              sd.field_a.d((byte) 98);
                              break L9;
                            } else {
                              sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                              break L9;
                            }
                          }
                          qe.field_a = -150;
                          sd.field_a.field_J = 0;
                          sd.field_a.s(86);
                          return;
                        } else {
                          if (0 < hb.field_g) {
                            break L7;
                          } else {
                            L10: {
                              sd.field_a.d((byte) 69);
                              if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                                break L10;
                              } else {
                                ib.field_t = 0;
                                break L10;
                              }
                            }
                            L11: {
                              if (~bi.field_K.length >= ~sd.field_a.field_q) {
                                sc.a(param0 ^ 8371, false, ml.field_l);
                                sd.field_a.d((byte) 98);
                                break L11;
                              } else {
                                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                                break L11;
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
                      if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
                      L12: {
                        ib.field_t = 0;
                        if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
                } else {
                  sc.a(-1, true, ki.field_c);
                  break L2;
                }
              } else {
                sc.a(-1, true, ki.field_c);
                break L2;
              }
            }
          }
          if (sd.field_a.field_q >= 3) {
            if (oh.a(param0 ^ -8372)) {
              sd.field_a.d((byte) 69);
              if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
                if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
                  if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
                  if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
                if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                  if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
                  if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
              }
            }
          } else {
            if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
              if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
              if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
          }
        } else {
          L13: {
            pa.field_c = -100;
            sd.field_a.a(255, 0);
            sd.field_a.field_N = (double)(-am.field_l);
            sd.field_a.field_D = 190.0;
            sd.field_a.field_q = sd.field_a.field_q + 1;
            sd.field_a.field_j = 0.0;
            sd.field_a.field_c = 0.0;
            if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
              ib.field_t = 0;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            sd.field_a.field_T = 0;
            sd.field_a.field_R = 0;
            var1 = sd.field_a.field_q;
            if (var1 != 0) {
              if (var1 == 3) {
                tc.field_d = -1;
                r.field_d = 6;
                break L14;
              } else {
                if (var1 == 6) {
                  tc.field_d = -1;
                  r.field_d = 6;
                  break L14;
                } else {
                  r.field_d = 7;
                  tc.field_d = -1;
                  break L14;
                }
              }
            } else {
              tc.field_d = -1;
              r.field_d = 6;
              break L14;
            }
          }
          L15: {
            sd.field_a.field_X = 0;
            var1 = sd.field_a.field_q;
            if (var1 == 0) {
              sc.a(-1, true, ki.field_c);
              break L15;
            } else {
              if (var1 != 1) {
                if (var1 != 2) {
                  if (var1 == 3) {
                    sc.a(-1, true, hi.field_l);
                    break L15;
                  } else {
                    if (var1 == 4) {
                      sc.a(-1, true, hi.field_l);
                      break L15;
                    } else {
                      if (var1 != 5) {
                        if (6 != var1) {
                          L16: {
                            if (7 == var1) {
                              break L16;
                            } else {
                              if (var1 != 8) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L17: {
                            sc.a(param0 + 8371, true, le.field_e);
                            if (sd.field_a.field_q < 3) {
                              break L17;
                            } else {
                              if (oh.a(param0 ^ -8372)) {
                                sd.field_a.d((byte) 69);
                                break L17;
                              } else {
                                if (0 < hb.field_g) {
                                  break L17;
                                } else {
                                  sd.field_a.d((byte) 69);
                                  break L17;
                                }
                              }
                            }
                          }
                          L18: {
                            if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                              break L18;
                            } else {
                              ib.field_t = 0;
                              break L18;
                            }
                          }
                          L19: {
                            if (~bi.field_K.length >= ~sd.field_a.field_q) {
                              sc.a(param0 ^ 8371, false, ml.field_l);
                              sd.field_a.d((byte) 98);
                              break L19;
                            } else {
                              sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                              break L19;
                            }
                          }
                          qe.field_a = -150;
                          sd.field_a.field_J = 0;
                          sd.field_a.s(86);
                          return;
                        } else {
                          sc.a(param0 + 8371, true, le.field_e);
                          break L15;
                        }
                      } else {
                        sc.a(-1, true, hi.field_l);
                        break L15;
                      }
                    }
                  }
                } else {
                  sc.a(-1, true, ki.field_c);
                  break L15;
                }
              } else {
                sc.a(-1, true, ki.field_c);
                break L15;
              }
            }
          }
          L20: {
            if (sd.field_a.field_q < 3) {
              break L20;
            } else {
              if (oh.a(param0 ^ -8372)) {
                L21: {
                  sd.field_a.d((byte) 69);
                  if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
                    break L21;
                  } else {
                    ib.field_t = 0;
                    break L21;
                  }
                }
                L22: {
                  if (~bi.field_K.length >= ~sd.field_a.field_q) {
                    sc.a(param0 ^ 8371, false, ml.field_l);
                    sd.field_a.d((byte) 98);
                    break L22;
                  } else {
                    sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                    break L22;
                  }
                }
                qe.field_a = -150;
                sd.field_a.field_J = 0;
                sd.field_a.s(86);
                return;
              } else {
                if (0 < hb.field_g) {
                  break L20;
                } else {
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
                    if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
                }
              }
            }
          }
          if (nc.field_J[sd.field_a.field_q][ib.field_t]) {
            if (~bi.field_K.length >= ~sd.field_a.field_q) {
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
            L25: {
              ib.field_t = 0;
              if (~bi.field_K.length >= ~sd.field_a.field_q) {
                sc.a(param0 ^ 8371, false, ml.field_l);
                sd.field_a.d((byte) 98);
                break L25;
              } else {
                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                break L25;
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
