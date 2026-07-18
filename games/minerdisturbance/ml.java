/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ml {
    private int field_m;
    private int field_j;
    private int field_n;
    static int field_d;
    private int field_k;
    private int[] field_r;
    private nn field_o;
    private int field_e;
    private int field_h;
    private int field_q;
    private int field_i;
    private int field_g;
    static char[] field_c;
    private boolean field_b;
    private boolean field_p;
    private int field_l;
    static int field_a;
    private int field_f;

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_85_0 = 0;
        Object stackIn_122_0 = null;
        Object stackIn_123_0 = null;
        Object stackIn_124_0 = null;
        Object stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        kd stackIn_139_0 = null;
        kd stackIn_140_0 = null;
        kd stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_207_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_205_0 = 0;
        kd stackOut_138_0 = null;
        kd stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        kd stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        Object stackOut_121_0 = null;
        Object stackOut_122_0 = null;
        Object stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        Object stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          var3 = ((ml) this).field_r[param1];
          var4 = -2;
          var5 = (lj.field_t + rg.field_sb + (nk.field_w - -m.field_e)) % 8;
          if (var5 != 0) {
            if (var5 == 1) {
              di.field_X = di.field_X + ac.field_b;
              qd.field_M = qd.field_M - 1;
              break L0;
            } else {
              if (var5 != 2) {
                if (var5 != 3) {
                  if (var5 == 4) {
                    ac.field_b = ac.field_b + 1;
                    vh.field_g = vh.field_g + qd.field_M;
                    break L0;
                  } else {
                    if (var5 != 5) {
                      if (var5 == 6) {
                        vh.field_g = vh.field_g - qd.field_M;
                        ac.field_b = ac.field_b - 1;
                        break L0;
                      } else {
                        if (var5 != 7) {
                          break L0;
                        } else {
                          vh.field_g = vh.field_g - ac.field_b;
                          qd.field_M = qd.field_M - 1;
                          break L0;
                        }
                      }
                    } else {
                      qd.field_M = qd.field_M + 1;
                      vh.field_g = vh.field_g + ac.field_b;
                      break L0;
                    }
                  }
                } else {
                  qd.field_M = qd.field_M + 1;
                  di.field_X = di.field_X - ac.field_b;
                  break L0;
                }
              } else {
                ac.field_b = ac.field_b + 1;
                di.field_X = di.field_X - qd.field_M;
                break L0;
              }
            }
          } else {
            di.field_X = di.field_X + qd.field_M;
            ac.field_b = ac.field_b - 1;
            break L0;
          }
        }
        L1: {
          var5 = (lj.field_t + (rg.field_sb + (nk.field_w - -m.field_e))) % 4;
          if (var5 != 0) {
            if (1 == var5) {
              pn.field_b = pn.field_b - aa.field_b;
              hl.field_b = hl.field_b - 1;
              break L1;
            } else {
              if (var5 != 2) {
                if (var5 != 3) {
                  break L1;
                } else {
                  aa.field_b = aa.field_b - 1;
                  pn.field_b = pn.field_b - hl.field_b;
                  break L1;
                }
              } else {
                aa.field_b = aa.field_b + 1;
                pn.field_b = pn.field_b + hl.field_b;
                break L1;
              }
            }
          } else {
            pn.field_b = pn.field_b + aa.field_b;
            hl.field_b = hl.field_b + 1;
            break L1;
          }
        }
        L2: {
          var5 = var3;
          if (var5 == 3) {
            if (((ml) this).field_o.a((byte) 113)) {
              L3: {
                L4: {
                  if (!kj.a(false)) {
                    break L4;
                  } else {
                    if (((ml) this).field_n == 0) {
                      break L4;
                    } else {
                      var4 = 8;
                      break L3;
                    }
                  }
                }
                var4 = 3;
                break L3;
              }
              tk.field_a = true;
              break L2;
            } else {
              break L2;
            }
          } else {
            if (17 != var5) {
              if (19 != var5) {
                if (12 != var5) {
                  if (7 != var5) {
                    if (var5 != 18) {
                      if (var5 != 9) {
                        if (var5 != 8) {
                          if (2 != var5) {
                            if (25 != var5) {
                              if (var5 != 1) {
                                if (var5 == 10) {
                                  if (!((ml) this).field_o.a((byte) 113)) {
                                    break L2;
                                  } else {
                                    if (((ml) this).field_k >= 6) {
                                      break L2;
                                    } else {
                                      if (this.a(117)) {
                                        break L2;
                                      } else {
                                        ((ml) this).field_g = ((ml) this).field_k;
                                        this.d(1, -502);
                                        ((ml) this).field_k = ((ml) this).field_k + 1;
                                        break L2;
                                      }
                                    }
                                  }
                                } else {
                                  if (var5 != 11) {
                                    if (var5 != 15) {
                                      if (0 == var5) {
                                        if (!((ml) this).field_o.a((byte) 15)) {
                                          break L2;
                                        } else {
                                          L5: {
                                            tk.field_a = true;
                                            if (0 != mc.field_w) {
                                              break L5;
                                            } else {
                                              if (oj.field_J == 2) {
                                                break L5;
                                              } else {
                                                if (oj.field_J == 5) {
                                                  break L5;
                                                } else {
                                                  var4 = 0;
                                                  break L2;
                                                }
                                              }
                                            }
                                          }
                                          var4 = 4;
                                          break L2;
                                        }
                                      } else {
                                        if (var5 == 16) {
                                          if (((ml) this).field_o.a((byte) 112)) {
                                            ge.field_c = true;
                                            jf.field_b = ((ml) this).field_n;
                                            if (8 == ((ml) this).field_n) {
                                              tm.field_v = 3;
                                              break L2;
                                            } else {
                                              L6: {
                                                if (((ml) this).field_n != 6) {
                                                  break L6;
                                                } else {
                                                  int discarded$6 = -20144;
                                                  if (!ig.a()) {
                                                    break L6;
                                                  } else {
                                                    tm.field_v = 5;
                                                    break L2;
                                                  }
                                                }
                                              }
                                              if (9 == ((ml) this).field_n) {
                                                tm.field_v = 9;
                                                break L2;
                                              } else {
                                                tm.field_v = 2;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          if (var5 == 6) {
                                            L7: {
                                              if (!((ml) this).field_o.b(-96)) {
                                                break L7;
                                              } else {
                                                fc.a(0, (byte) 97);
                                                break L7;
                                              }
                                            }
                                            L8: {
                                              if (!((ml) this).field_o.c(98)) {
                                                break L8;
                                              } else {
                                                fc.a(256, (byte) 89);
                                                break L8;
                                              }
                                            }
                                            L9: {
                                              if (!((ml) this).field_o.d((byte) 77)) {
                                                break L9;
                                              } else {
                                                L10: {
                                                  var5 = 8;
                                                  if (kb.field_c == 2) {
                                                    var5 += 20;
                                                    break L10;
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                                var6 = -var5 - 134 + nk.field_w;
                                                if (var6 > 0) {
                                                  if (144 <= var6) {
                                                    fc.a(256, (byte) 62);
                                                    break L9;
                                                  } else {
                                                    fc.a(256 * var6 / 144, (byte) 68);
                                                    break L9;
                                                  }
                                                } else {
                                                  fc.a(0, (byte) 54);
                                                  break L9;
                                                }
                                              }
                                            }
                                            L11: {
                                              if (!((ml) this).field_o.a(-95)) {
                                                break L11;
                                              } else {
                                                int discarded$7 = 65;
                                                cl.p();
                                                break L11;
                                              }
                                            }
                                            if (!((ml) this).field_o.e((byte) 126)) {
                                              break L2;
                                            } else {
                                              int discarded$8 = -94;
                                              ol.a();
                                              break L2;
                                            }
                                          } else {
                                            if (22 == var5) {
                                              if (!((ml) this).field_o.a((byte) -87)) {
                                                break L2;
                                              } else {
                                                tk.field_a = true;
                                                var4 = 10;
                                                break L2;
                                              }
                                            } else {
                                              if (var5 != 23) {
                                                if (var5 != 14) {
                                                  L12: {
                                                    if (var5 != 21) {
                                                      if (var5 == 24) {
                                                        break L12;
                                                      } else {
                                                        if (var5 == 20) {
                                                          break L12;
                                                        } else {
                                                          if (var5 != 4) {
                                                            if (var5 == 13) {
                                                              if (!((ml) this).field_o.a((byte) -57)) {
                                                                break L2;
                                                              } else {
                                                                var4 = -1;
                                                                el.field_c = true;
                                                                break L2;
                                                              }
                                                            } else {
                                                              if (var5 != 5) {
                                                                break L2;
                                                              } else {
                                                                L13: {
                                                                  if (!((ml) this).field_o.b(-94)) {
                                                                    break L13;
                                                                  } else {
                                                                    ma.a(-124, 0);
                                                                    break L13;
                                                                  }
                                                                }
                                                                L14: {
                                                                  if (!((ml) this).field_o.c(-64)) {
                                                                    break L14;
                                                                  } else {
                                                                    ma.a(-107, 256);
                                                                    break L14;
                                                                  }
                                                                }
                                                                L15: {
                                                                  if (((ml) this).field_o.d((byte) 77)) {
                                                                    L16: {
                                                                      var5 = 8;
                                                                      if (kb.field_c == 2) {
                                                                        var5 += 20;
                                                                        break L16;
                                                                      } else {
                                                                        break L16;
                                                                      }
                                                                    }
                                                                    var6 = nk.field_w - (var5 + 134);
                                                                    if (var6 <= 0) {
                                                                      oc.field_f = 0;
                                                                      break L15;
                                                                    } else {
                                                                      if (144 <= var6) {
                                                                        oc.field_f = 256;
                                                                        break L15;
                                                                      } else {
                                                                        oc.field_f = var6 * 256 / 144;
                                                                        break L15;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    break L15;
                                                                  }
                                                                }
                                                                L17: {
                                                                  if (!((ml) this).field_o.a(112)) {
                                                                    break L17;
                                                                  } else {
                                                                    int discarded$9 = 0;
                                                                    fc.a();
                                                                    break L17;
                                                                  }
                                                                }
                                                                if (!((ml) this).field_o.e((byte) 127)) {
                                                                  break L2;
                                                                } else {
                                                                  pn.b(60);
                                                                  break L2;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (!((ml) this).field_o.a((byte) -45)) {
                                                              break L2;
                                                            } else {
                                                              ng.a((byte) 73);
                                                              uf.a(13, bm.c(-87));
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      if (pj.field_a <= 0) {
                                                        break L2;
                                                      } else {
                                                        if (!ci.field_b) {
                                                          break L2;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (!((ml) this).field_o.a((byte) 122)) {
                                                    break L2;
                                                  } else {
                                                    L18: {
                                                      L19: {
                                                        if (var3 == 20) {
                                                          break L19;
                                                        } else {
                                                          if (24 == var3) {
                                                            break L19;
                                                          } else {
                                                            if (0 < pj.field_a) {
                                                              if (21 == var3) {
                                                                ah.field_f = 1;
                                                                break L18;
                                                              } else {
                                                                break L18;
                                                              }
                                                            } else {
                                                              break L19;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (qd.field_S) {
                                                        ah.field_f = 0;
                                                        break L18;
                                                      } else {
                                                        break L2;
                                                      }
                                                    }
                                                    L20: {
                                                      L21: {
                                                        if (nd.a(ah.field_f, 1)) {
                                                          break L21;
                                                        } else {
                                                          if (!ne.a((byte) 10, 27)) {
                                                            break L20;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                      cm.field_n = cm.field_n + 1;
                                                      break L20;
                                                    }
                                                    if (!d.field_c) {
                                                      L22: {
                                                        sc.field_b = false;
                                                        if (0 != cm.field_n) {
                                                          break L22;
                                                        } else {
                                                          sc.field_b = true;
                                                          if (sc.field_b) {
                                                            L23: {
                                                              int discarded$10 = 122;
                                                              if (wj.g()) {
                                                                stackOut_206_0 = 0;
                                                                stackIn_207_0 = stackOut_206_0;
                                                                break L23;
                                                              } else {
                                                                stackOut_205_0 = 1;
                                                                stackIn_207_0 = stackOut_205_0;
                                                                break L23;
                                                              }
                                                            }
                                                            sc.field_b = stackIn_207_0 != 0;
                                                            break L22;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      sn.field_b[1] = null;
                                                      sn.field_b[0] = null;
                                                      pd.field_b.field_Q = new mc(pd.field_b, ((ml) this).field_o.field_d);
                                                      var4 = -1;
                                                      el.field_c = true;
                                                      break L2;
                                                    } else {
                                                      sn.field_b[1] = null;
                                                      sn.field_b[0] = null;
                                                      pd.field_b.field_Q = new mc(pd.field_b, ((ml) this).field_o.field_d);
                                                      var4 = -1;
                                                      el.field_c = true;
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  if (!((ml) this).field_o.a((byte) 125)) {
                                                    break L2;
                                                  } else {
                                                    tk.field_a = true;
                                                    var4 = 9;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                if (!((ml) this).field_o.a((byte) -72)) {
                                                  break L2;
                                                } else {
                                                  tk.field_a = true;
                                                  var4 = 11;
                                                  break L2;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (!((ml) this).field_o.a((byte) -46)) {
                                        break L2;
                                      } else {
                                        L24: {
                                          var4 = 4;
                                          tk.field_a = true;
                                          int discarded$11 = -4440;
                                          stackOut_138_0 = wk.field_a;
                                          stackIn_140_0 = stackOut_138_0;
                                          stackIn_139_0 = stackOut_138_0;
                                          if (u.b() >= mk.b(58)) {
                                            stackOut_140_0 = (kd) (Object) stackIn_140_0;
                                            stackOut_140_1 = 0;
                                            stackIn_141_0 = stackOut_140_0;
                                            stackIn_141_1 = stackOut_140_1;
                                            break L24;
                                          } else {
                                            stackOut_139_0 = (kd) (Object) stackIn_139_0;
                                            stackOut_139_1 = 1;
                                            stackIn_141_0 = stackOut_139_0;
                                            stackIn_141_1 = stackOut_139_1;
                                            break L24;
                                          }
                                        }
                                        ((kd) (Object) stackIn_141_0).a(stackIn_141_1 != 0, true);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    if (((ml) this).field_o.a((byte) -101)) {
                                      if (((ml) this).field_k <= 0) {
                                        break L2;
                                      } else {
                                        if (this.a(121)) {
                                          break L2;
                                        } else {
                                          ((ml) this).field_g = ((ml) this).field_k;
                                          this.d(1, -502);
                                          ((ml) this).field_k = ((ml) this).field_k - 1;
                                          ((ml) this).field_p = true;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              } else {
                                if (!((ml) this).field_o.a((byte) 108)) {
                                  break L2;
                                } else {
                                  tk.field_a = true;
                                  var4 = 1;
                                  break L2;
                                }
                              }
                            } else {
                              if (((ml) this).field_o.a((byte) 27)) {
                                if (!this.a(99)) {
                                  L25: {
                                    L26: {
                                      this.d(3, -502);
                                      ((ml) this).field_i = (1 + ((ml) this).field_i) % 2;
                                      stackOut_121_0 = this;
                                      stackIn_124_0 = stackOut_121_0;
                                      stackIn_122_0 = stackOut_121_0;
                                      if (nk.field_w <= 468) {
                                        break L26;
                                      } else {
                                        stackOut_122_0 = this;
                                        stackIn_124_0 = stackOut_122_0;
                                        stackIn_123_0 = stackOut_122_0;
                                        if (520 <= nk.field_w) {
                                          break L26;
                                        } else {
                                          stackOut_123_0 = this;
                                          stackOut_123_1 = 1;
                                          stackIn_125_0 = stackOut_123_0;
                                          stackIn_125_1 = stackOut_123_1;
                                          break L25;
                                        }
                                      }
                                    }
                                    stackOut_124_0 = this;
                                    stackOut_124_1 = 0;
                                    stackIn_125_0 = stackOut_124_0;
                                    stackIn_125_1 = stackOut_124_1;
                                    break L25;
                                  }
                                  ((ml) this).field_p = stackIn_125_1 != 0;
                                  break L2;
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                          } else {
                            if (((ml) this).field_o.a((byte) 126)) {
                              L27: {
                                if (((ml) this).field_n != 5) {
                                  if (!kj.a(false)) {
                                    var4 = 2;
                                    break L27;
                                  } else {
                                    var4 = 7;
                                    break L27;
                                  }
                                } else {
                                  var4 = 2;
                                  kd.a(cm.field_o, (byte) -93);
                                  break L27;
                                }
                              }
                              tk.field_a = true;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          if (((ml) this).field_o.a((byte) 115)) {
                            if (this.a(111)) {
                              break L2;
                            } else {
                              if (((ml) this).field_f != 1) {
                                ((ml) this).field_g = ((ml) this).field_f;
                                this.d(2, -502);
                                ((ml) this).field_f = 1;
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        if (((ml) this).field_o.a((byte) 113)) {
                          if (this.a(123)) {
                            break L2;
                          } else {
                            if (((ml) this).field_f != 2) {
                              ((ml) this).field_g = ((ml) this).field_f;
                              this.d(2, -502);
                              ((ml) this).field_f = 2;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      if (!((ml) this).field_o.a((byte) 112)) {
                        break L2;
                      } else {
                        kj.a(-62);
                        break L2;
                      }
                    }
                  } else {
                    if (((ml) this).field_o.a((byte) -9)) {
                      if (this.a(106)) {
                        break L2;
                      } else {
                        if (((ml) this).field_f == 0) {
                          break L2;
                        } else {
                          ((ml) this).field_g = ((ml) this).field_f;
                          this.d(2, -502);
                          ((ml) this).field_f = 0;
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  if (!((ml) this).field_o.a((byte) 10)) {
                    break L2;
                  } else {
                    if (null != kf.field_d) {
                      ng.a((byte) -122);
                      break L2;
                    } else {
                      cl.q(-64);
                      break L2;
                    }
                  }
                }
              } else {
                if (((ml) this).field_o.a((byte) 16)) {
                  L28: {
                    d.field_c = true;
                    if (sc.field_b) {
                      mg.a((byte) -125);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (sc.field_b) {
                      stackOut_84_0 = 0;
                      stackIn_85_0 = stackOut_84_0;
                      break L29;
                    } else {
                      stackOut_83_0 = 1;
                      stackIn_85_0 = stackOut_83_0;
                      break L29;
                    }
                  }
                  sc.field_b = stackIn_85_0 != 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            } else {
              if (((ml) this).field_o.a((byte) -3)) {
                rj.a((byte) -38, 6);
                pd.field_b.s(120);
                var4 = -1;
                el.field_c = true;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        return var4;
    }

    final boolean c(int param0) {
        if (param0 >= -29) {
            return true;
        }
        return true;
    }

    final static void a(sb param0, byte param1, sb param2) {
        RuntimeException var3 = null;
        ql[] var3_array = null;
        String[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        ql[] var17 = null;
        int var18 = 0;
        ql var18_ref_ql = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        ql var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var25 = MinerDisturbance.field_ab;
        try {
          L0: {
            kn.field_H[0] = new ql[je.field_N[0]];
            var3_array = new ql[je.field_N[0]];
            var4 = fg.a(65, param2);
            var5 = -1;
            var6 = -1;
            var7 = -1;
            var8 = -1;
            var9 = -1;
            var10 = -1;
            var11 = -1;
            var12 = -1;
            var13 = -1;
            var14 = -1;
            var15 = -1;
            var16 = -1;
            var17_int = 0;
            L1: while (true) {
              if (var4[0].length <= var17_int) {
                var26 = 0;
                var17_int = var26;
                L2: while (true) {
                  if (var3_array.length <= var26) {
                    kn.field_H[1] = new ql[je.field_N[1]];
                    var17 = new ql[je.field_N[1]];
                    var8 = -1;
                    var12 = -1;
                    var6 = -1;
                    var7 = -1;
                    var15 = -1;
                    var13 = -1;
                    var16 = -1;
                    var4 = fg.a(65, param0);
                    var10 = -1;
                    var5 = -1;
                    var14 = -1;
                    var11 = -1;
                    var9 = -1;
                    var18 = -1;
                    var19 = -1;
                    var20 = -1;
                    var21 = -1;
                    var22 = -1;
                    var23 = 0;
                    L3: while (true) {
                      if (var23 >= var4[0].length) {
                        var27 = 0;
                        var23 = var27;
                        L4: while (true) {
                          if (var27 >= var17.length) {
                            break L0;
                          } else {
                            ql dupTemp$2 = new ql();
                            var17[var27] = dupTemp$2;
                            var24 = dupTemp$2;
                            var24.field_o[0] = Integer.parseInt(var4[var27 + 1][var5]);
                            var24.field_o[1] = Integer.parseInt(var4[1 + var27][var6]);
                            var24.field_o[2] = Integer.parseInt(var4[var27 - -1][var7]);
                            var24.field_o[3] = Integer.parseInt(var4[var27 + 1][var8]);
                            var24.field_o[4] = Integer.parseInt(var4[1 + var27][var9]);
                            var24.field_o[5] = Integer.parseInt(var4[1 + var27][var19]);
                            var24.field_e = Integer.parseInt(var4[var27 - -1][var10]);
                            var24.field_d = Integer.parseInt(var4[var27 + 1][var11]);
                            var24.field_l = Integer.parseInt(var4[var27 - -1][var20]);
                            var24.field_a = Boolean.valueOf(var4[var27 - -1][var18]).booleanValue();
                            var24.field_f = Boolean.valueOf(var4[var27 + 1][var14]).booleanValue();
                            var24.field_k = Boolean.valueOf(var4[var27 - -1][var12]).booleanValue();
                            var24.field_i = Boolean.valueOf(var4[var27 + 1][var13]).booleanValue();
                            var24.field_b = Boolean.valueOf(var4[var27 + 1][var15]).booleanValue();
                            var24.field_h = Boolean.valueOf(var4[var27 + 1][var21]).booleanValue();
                            var24.field_g = Boolean.valueOf(var4[var27 + 1][var22]).booleanValue();
                            var24.field_n = Boolean.valueOf(var4[1 + var27][var16]).booleanValue();
                            var27++;
                            continue L4;
                          }
                        }
                      } else {
                        L5: {
                          if (var4[0][var23].equalsIgnoreCase("Iron Prob")) {
                            var5 = var23;
                            break L5;
                          } else {
                            if (!var4[0][var23].equalsIgnoreCase("Silver Prob")) {
                              if (!var4[0][var23].equalsIgnoreCase("Gold Prob")) {
                                if (!var4[0][var23].equalsIgnoreCase("Effluvium Prob")) {
                                  if (var4[0][var23].equalsIgnoreCase("Diamond Prob")) {
                                    var9 = var23;
                                    break L5;
                                  } else {
                                    if (!var4[0][var23].equalsIgnoreCase("Boulder Prob")) {
                                      if (!var4[0][var23].equalsIgnoreCase("Hole Prob")) {
                                        if (!var4[0][var23].equalsIgnoreCase("Water Cell")) {
                                          if (!var4[0][var23].equalsIgnoreCase("Gas Cell")) {
                                            if (!var4[0][var23].equalsIgnoreCase("Random Water Cell")) {
                                              if (var4[0][var23].equalsIgnoreCase("Oil Cell")) {
                                                var18 = var23;
                                                break L5;
                                              } else {
                                                if (!var4[0][var23].equalsIgnoreCase("Earth Prob")) {
                                                  if (var4[0][var23].equalsIgnoreCase("Freeze Prob")) {
                                                    var19 = var23;
                                                    break L5;
                                                  } else {
                                                    if (var4[0][var23].equalsIgnoreCase("Random Gas Cell")) {
                                                      var15 = var23;
                                                      break L5;
                                                    } else {
                                                      if (!var4[0][var23].equalsIgnoreCase("Monster Is Walrus")) {
                                                        if (var4[0][var23].equalsIgnoreCase("Has Penguin")) {
                                                          var22 = var23;
                                                          break L5;
                                                        } else {
                                                          if (var4[0][var23].equalsIgnoreCase("Central Hole")) {
                                                            var16 = var23;
                                                            break L5;
                                                          } else {
                                                            break L5;
                                                          }
                                                        }
                                                      } else {
                                                        var21 = var23;
                                                        break L5;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var20 = var23;
                                                  break L5;
                                                }
                                              }
                                            } else {
                                              var13 = var23;
                                              break L5;
                                            }
                                          } else {
                                            var14 = var23;
                                            break L5;
                                          }
                                        } else {
                                          var12 = var23;
                                          break L5;
                                        }
                                      } else {
                                        var11 = var23;
                                        break L5;
                                      }
                                    } else {
                                      var10 = var23;
                                      break L5;
                                    }
                                  }
                                } else {
                                  var8 = var23;
                                  break L5;
                                }
                              } else {
                                var7 = var23;
                                break L5;
                              }
                            } else {
                              var6 = var23;
                              break L5;
                            }
                          }
                        }
                        var23++;
                        continue L3;
                      }
                    }
                  } else {
                    ql dupTemp$3 = new ql();
                    var3_array[var26] = dupTemp$3;
                    var18_ref_ql = dupTemp$3;
                    var18_ref_ql.field_o[0] = Integer.parseInt(var4[var26 + 1][var5]);
                    var18_ref_ql.field_o[1] = Integer.parseInt(var4[var26 + 1][var6]);
                    var18_ref_ql.field_o[2] = Integer.parseInt(var4[var26 - -1][var7]);
                    var18_ref_ql.field_o[3] = Integer.parseInt(var4[var26 - -1][var8]);
                    var18_ref_ql.field_o[4] = Integer.parseInt(var4[1 + var26][var9]);
                    var18_ref_ql.field_e = Integer.parseInt(var4[1 + var26][var10]);
                    var18_ref_ql.field_d = Integer.parseInt(var4[1 + var26][var11]);
                    var18_ref_ql.field_f = Boolean.valueOf(var4[var26 - -1][var14]).booleanValue();
                    var18_ref_ql.field_k = Boolean.valueOf(var4[var26 + 1][var12]).booleanValue();
                    var18_ref_ql.field_i = Boolean.valueOf(var4[var26 + 1][var13]).booleanValue();
                    var18_ref_ql.field_b = Boolean.valueOf(var4[var26 + 1][var15]).booleanValue();
                    var18_ref_ql.field_n = Boolean.valueOf(var4[1 + var26][var16]).booleanValue();
                    var26++;
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if (var4[0][var17_int].equalsIgnoreCase("Iron Prob")) {
                    var5 = var17_int;
                    break L6;
                  } else {
                    if (!var4[0][var17_int].equalsIgnoreCase("Silver Prob")) {
                      if (!var4[0][var17_int].equalsIgnoreCase("Gold Prob")) {
                        if (!var4[0][var17_int].equalsIgnoreCase("Effluvium Prob")) {
                          if (!var4[0][var17_int].equalsIgnoreCase("Diamond Prob")) {
                            if (!var4[0][var17_int].equalsIgnoreCase("Boulder Prob")) {
                              if (var4[0][var17_int].equalsIgnoreCase("Hole Prob")) {
                                var11 = var17_int;
                                break L6;
                              } else {
                                if (!var4[0][var17_int].equalsIgnoreCase("Water Cell")) {
                                  if (!var4[0][var17_int].equalsIgnoreCase("Gas Cell")) {
                                    if (!var4[0][var17_int].equalsIgnoreCase("Random Water Cell")) {
                                      if (!var4[0][var17_int].equalsIgnoreCase("Random Gas Cell")) {
                                        if (!var4[0][var17_int].equalsIgnoreCase("Central Hole")) {
                                          break L6;
                                        } else {
                                          var16 = var17_int;
                                          break L6;
                                        }
                                      } else {
                                        var15 = var17_int;
                                        break L6;
                                      }
                                    } else {
                                      var13 = var17_int;
                                      break L6;
                                    }
                                  } else {
                                    var14 = var17_int;
                                    break L6;
                                  }
                                } else {
                                  var12 = var17_int;
                                  break L6;
                                }
                              }
                            } else {
                              var10 = var17_int;
                              break L6;
                            }
                          } else {
                            var9 = var17_int;
                            break L6;
                          }
                        } else {
                          var8 = var17_int;
                          break L6;
                        }
                      } else {
                        var7 = var17_int;
                        break L6;
                      }
                    } else {
                      var6 = var17_int;
                      break L6;
                    }
                  }
                }
                var17_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) var3;
            stackOut_75_1 = new StringBuilder().append("ml.R(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L7;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L7;
            }
          }
          L8: {
            stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(0).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L8;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L8;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param0 != 7) {
            ((ml) this).b(120, -118, -86);
        }
        ((ml) this).field_i = param1;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_34_5 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_33_5 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        var7 = MinerDisturbance.field_ab;
        if (param1 == -22674) {
          L0: {
            var5 = ((ml) this).field_n;
            if (2 == var5) {
              if (this.a(96)) {
                L1: {
                  var5 = ((ml) this).field_g;
                  if (((ml) this).field_j == 3) {
                    var5 = ((ml) this).field_f;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  stackOut_23_0 = this;
                  stackOut_23_1 = param2;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  if (((ml) this).field_p) {
                    stackOut_25_0 = this;
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    break L2;
                  } else {
                    stackOut_24_0 = this;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    break L2;
                  }
                }
                int discarded$6 = 121;
                this.a(stackIn_26_1, stackIn_26_2 != 0, var5);
                int discarded$7 = 121;
                this.a(param2, ((ml) this).field_p, ((ml) this).field_f);
                var6 = 0;
                L3: while (true) {
                  if (((ml) this).field_r.length <= var6) {
                    break L0;
                  } else {
                    L4: {
                      stackOut_28_0 = this;
                      stackOut_28_1 = param2;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      if (~var6 != ~((ml) this).field_o.field_e) {
                        stackOut_30_0 = this;
                        stackOut_30_1 = stackIn_30_1;
                        stackOut_30_2 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
                        break L4;
                      } else {
                        stackOut_29_0 = this;
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = 1;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        break L4;
                      }
                    }
                    L5: {
                      stackOut_31_0 = this;
                      stackOut_31_1 = stackIn_31_1;
                      stackOut_31_2 = stackIn_31_2;
                      stackOut_31_3 = 95;
                      stackOut_31_4 = var6;
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_33_1 = stackOut_31_1;
                      stackIn_33_2 = stackOut_31_2;
                      stackIn_33_3 = stackOut_31_3;
                      stackIn_33_4 = stackOut_31_4;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      stackIn_32_2 = stackOut_31_2;
                      stackIn_32_3 = stackOut_31_3;
                      stackIn_32_4 = stackOut_31_4;
                      if (((ml) this).field_p) {
                        stackOut_33_0 = this;
                        stackOut_33_1 = stackIn_33_1;
                        stackOut_33_2 = stackIn_33_2;
                        stackOut_33_3 = stackIn_33_3;
                        stackOut_33_4 = stackIn_33_4;
                        stackOut_33_5 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        stackIn_34_2 = stackOut_33_2;
                        stackIn_34_3 = stackOut_33_3;
                        stackIn_34_4 = stackOut_33_4;
                        stackIn_34_5 = stackOut_33_5;
                        break L5;
                      } else {
                        stackOut_32_0 = this;
                        stackOut_32_1 = stackIn_32_1;
                        stackOut_32_2 = stackIn_32_2;
                        stackOut_32_3 = stackIn_32_3;
                        stackOut_32_4 = stackIn_32_4;
                        stackOut_32_5 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        stackIn_34_2 = stackOut_32_2;
                        stackIn_34_3 = stackOut_32_3;
                        stackIn_34_4 = stackOut_32_4;
                        stackIn_34_5 = stackOut_32_5;
                        break L5;
                      }
                    }
                    this.a(stackIn_34_1, stackIn_34_2 != 0, (byte) stackIn_34_3, stackIn_34_4, stackIn_34_5 != 0);
                    var6++;
                    continue L3;
                  }
                }
              } else {
                int discarded$8 = 121;
                this.a(param2, false, ((ml) this).field_f);
                break L0;
              }
            } else {
              L6: {
                if (var5 != 8) {
                  if (var5 != 3) {
                    if (var5 == 5) {
                      boolean discarded$9 = jb.a(true, (byte) -59, false, param2, false);
                      break L0;
                    } else {
                      if (var5 == 7) {
                        this.a(80, param2);
                        break L0;
                      } else {
                        if (1 == var5) {
                          if (!this.a(121)) {
                            this.a(((ml) this).field_k, param1 + 22674, false, param2);
                            break L0;
                          } else {
                            L7: {
                              stackOut_47_0 = this;
                              stackOut_47_1 = ((ml) this).field_g;
                              stackOut_47_2 = 0;
                              stackIn_49_0 = stackOut_47_0;
                              stackIn_49_1 = stackOut_47_1;
                              stackIn_49_2 = stackOut_47_2;
                              stackIn_48_0 = stackOut_47_0;
                              stackIn_48_1 = stackOut_47_1;
                              stackIn_48_2 = stackOut_47_2;
                              if (((ml) this).field_p) {
                                stackOut_49_0 = this;
                                stackOut_49_1 = stackIn_49_1;
                                stackOut_49_2 = stackIn_49_2;
                                stackOut_49_3 = 0;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                stackIn_50_2 = stackOut_49_2;
                                stackIn_50_3 = stackOut_49_3;
                                break L7;
                              } else {
                                stackOut_48_0 = this;
                                stackOut_48_1 = stackIn_48_1;
                                stackOut_48_2 = stackIn_48_2;
                                stackOut_48_3 = 1;
                                stackIn_50_0 = stackOut_48_0;
                                stackIn_50_1 = stackOut_48_1;
                                stackIn_50_2 = stackOut_48_2;
                                stackIn_50_3 = stackOut_48_3;
                                break L7;
                              }
                            }
                            this.a(stackIn_50_1, stackIn_50_2, stackIn_50_3 != 0, param2);
                            this.a(((ml) this).field_k, 0, ((ml) this).field_p, param2);
                            break L0;
                          }
                        } else {
                          if (var5 != 6) {
                            if (var5 != 11) {
                              if (var5 != 4) {
                                if (var5 != 9) {
                                  break L0;
                                } else {
                                  var4 = 640 + param2 + -640;
                                  jc.field_G.f(320 + var4 - (jc.field_G.field_x >> 1), 15);
                                  break L0;
                                }
                              } else {
                                m.field_m.f(param2, 0);
                                if (!eg.b(112)) {
                                  l.field_c.f(640 - (l.field_c.field_x + param2), -l.field_c.field_A + 480);
                                  break L0;
                                } else {
                                  if (fa.field_e) {
                                    var5 = -gi.field_a.field_A + 480;
                                    var6 = -param2 + (-gi.field_a.field_x + 640);
                                    gi.field_a.f(var6, 10 * (qd.field_R / 20) + var5);
                                    break L0;
                                  } else {
                                    ak.field_c.f(-param2 + 640 - ak.field_c.field_x, -ak.field_c.field_A + 480);
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              eh.a(-param2, 0, 640, 480);
                              wk.field_a.d(117);
                              eh.a();
                              break L0;
                            }
                          } else {
                            this.b(param2, (byte) -125);
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L8: {
                stackOut_35_0 = 0;
                stackOut_35_1 = 43;
                stackOut_35_2 = 0;
                stackOut_35_3 = param2;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_37_2 = stackOut_35_2;
                stackIn_37_3 = stackOut_35_3;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                stackIn_36_2 = stackOut_35_2;
                stackIn_36_3 = stackOut_35_3;
                if (mc.field_w != 0) {
                  stackOut_37_0 = stackIn_37_0;
                  stackOut_37_1 = stackIn_37_1;
                  stackOut_37_2 = stackIn_37_2;
                  stackOut_37_3 = stackIn_37_3;
                  stackOut_37_4 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  stackIn_38_3 = stackOut_37_3;
                  stackIn_38_4 = stackOut_37_4;
                  break L8;
                } else {
                  stackOut_36_0 = stackIn_36_0;
                  stackOut_36_1 = stackIn_36_1;
                  stackOut_36_2 = stackIn_36_2;
                  stackOut_36_3 = stackIn_36_3;
                  stackOut_36_4 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  stackIn_38_3 = stackOut_36_3;
                  stackIn_38_4 = stackOut_36_4;
                  break L8;
                }
              }
              if (jb.a(stackIn_38_0 != 0, (byte) stackIn_38_1, stackIn_38_2 != 0, stackIn_38_3, stackIn_38_4 != 0)) {
                break L0;
              } else {
                if (kj.a(false)) {
                  if (((ml) this).field_n != 8) {
                    int discarded$10 = ce.field_d.a(kc.field_c, 170 + -param2, 230, 300, 60, 1, -1, 1, 0, 0);
                    break L0;
                  } else {
                    int discarded$11 = ce.field_d.a(vb.field_d, 220 + -param2, 320, 200, 60, 1, -1, 1, 0, 0);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          L9: {
            if (((ml) this).field_n == 11) {
              break L9;
            } else {
              var4 = 0;
              L10: while (true) {
                if (~var4 <= ~((ml) this).field_r.length) {
                  break L9;
                } else {
                  L11: {
                    stackOut_63_0 = this;
                    stackOut_63_1 = param2;
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_65_1 = stackOut_63_1;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    if (((ml) this).field_o.field_e != var4) {
                      stackOut_65_0 = this;
                      stackOut_65_1 = stackIn_65_1;
                      stackOut_65_2 = 0;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      stackIn_66_2 = stackOut_65_2;
                      break L11;
                    } else {
                      stackOut_64_0 = this;
                      stackOut_64_1 = stackIn_64_1;
                      stackOut_64_2 = 1;
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_66_1 = stackOut_64_1;
                      stackIn_66_2 = stackOut_64_2;
                      break L11;
                    }
                  }
                  this.a(stackIn_66_1, stackIn_66_2 != 0, (byte) 85, var4, false);
                  var4++;
                  continue L10;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        ((ml) this).field_k = 0;
        int var2 = -87 / ((-10 - param0) / 43);
        this.d(-111);
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        int var13_int = 0;
        vm var13 = null;
        int[] var13_array = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        L0: {
          var16 = MinerDisturbance.field_ab;
          var5 = ol.field_b[param0];
          if (!((ml) this).field_p) {
            L1: {
              if (param2) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                stackOut_6_0 = 640;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
            }
            var7 = stackIn_8_0 + ((ml) this).field_e;
            var6 = var7 + (-640 + -param3) + 765;
            break L0;
          } else {
            L2: {
              stackOut_1_0 = -((ml) this).field_e;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param2) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = -640;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L2;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L2;
              }
            }
            var7 = stackIn_4_0 - -stackIn_4_1;
            var6 = var7 + param3 - -125;
            break L0;
          }
        }
        ha.field_a.f(param3 - (-320 - -(ha.field_a.field_x >> 1)), 15);
        var7 = 390;
        var8 = ce.field_d.field_E + ce.field_d.field_I + -2;
        var9 = mm.field_a.field_E + mm.field_a.field_I;
        var10 = param1;
        var11 = 0;
        L3: while (true) {
          if (var5.length <= var11) {
            L4: {
              var10 = var10 * var8;
              var10 = var10 + (4 + var9);
              if (param0 != 2) {
                if (param0 != 4) {
                  if (param0 != 5) {
                    break L4;
                  } else {
                    var10 = var10 + 5 * var8;
                    break L4;
                  }
                } else {
                  var10 = var10 + 3 * var8;
                  break L4;
                }
              } else {
                var10 = var10 - 5 * var8;
                break L4;
              }
            }
            L5: {
              g.a(90, var10 + 50, var6 + -30, 450, (byte) 53, hd.field_d);
              if (3 != param0) {
                break L5;
              } else {
                var7 -= 32;
                var6 += 32;
                break L5;
              }
            }
            L6: {
              L7: {
                var11 = 130;
                mm.field_a.a(pf.field_f[param0], var6, var11, 1, -1);
                var11 = var11 + var9;
                if (param0 != 1) {
                  if (param0 == 2) {
                    var12_int = 0;
                    var13_int = 0;
                    L8: while (true) {
                      if (var13_int >= var5.length) {
                        break L7;
                      } else {
                        L9: {
                          L10: {
                            if (var13_int == 3) {
                              break L10;
                            } else {
                              if (7 != var13_int) {
                                L11: {
                                  if (var13_int == 0) {
                                    fl.field_j[0].c(var6 + 180, var11 + -20);
                                    fl.field_j[1].c(214 + var6, var11 + -20);
                                    fl.field_j[2].c(var6 + 180, 14 + var11);
                                    break L11;
                                  } else {
                                    if (var13_int == 4) {
                                      fl.field_j[13].c(var6 - -180, -20 + var11);
                                      fl.field_j[14].c(var6 + 180, 14 + var11);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  L13: {
                                    var14 = var6;
                                    if (0 == var13_int) {
                                      break L13;
                                    } else {
                                      if (var13_int != 4) {
                                        L14: {
                                          if (var13_int == 1) {
                                            break L14;
                                          } else {
                                            if (var13_int == 5) {
                                              break L14;
                                            } else {
                                              var14 += 260;
                                              break L12;
                                            }
                                          }
                                        }
                                        var14 += 60;
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var14 += 0;
                                  break L12;
                                }
                                L15: {
                                  var15 = ce.field_d.a(var5[var13_int], var14, var11 - ce.field_d.field_I, var7 / 3, 480, 1, -1, 0, 0, var8);
                                  var12_int = Math.max(var12_int, var15);
                                  if (2 == var13_int) {
                                    break L15;
                                  } else {
                                    if (6 != var13_int) {
                                      break L9;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var11 = var11 + var8 * (var12_int - -1);
                                var12_int = 0;
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var11 = var11 + (1 + ce.field_d.a(var5[var13_int], var6, -ce.field_d.field_I + var11, var7, 480, 1, -1, 0, 0, var8)) * var8;
                          break L9;
                        }
                        var13_int++;
                        continue L8;
                      }
                    }
                  } else {
                    L16: {
                      if (param0 == 4) {
                        break L16;
                      } else {
                        if (5 != param0) {
                          L17: {
                            var12_int = var6;
                            if (param0 != 3) {
                              break L17;
                            } else {
                              fl.field_j[3].c(-33 + var6, 139);
                              fl.field_j[4].c(-33 + var6, 180);
                              fl.field_j[5].c(-33 + var6, 222);
                              fl.field_j[7].c(var6 - 33, 258);
                              fl.field_j[6].c(var6 - 33, 291);
                              var12_int += 5;
                              var6 -= 32;
                              break L17;
                            }
                          }
                          var13_int = 0;
                          L18: while (true) {
                            if (var13_int >= var5.length) {
                              break L7;
                            } else {
                              var11 = var11 + ce.field_d.a(var5[var13_int], var12_int, var11 + -ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var8) * var8;
                              var13_int++;
                              continue L18;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    if (4 == param0) {
                      var7 -= 32;
                      var6 += 32;
                      var12_int = 0;
                      var18 = new int[2];
                      var13_array = var18;
                      L19: while (true) {
                        if (var12_int >= 2) {
                          var6 -= 32;
                          var7 += 32;
                          L20: while (true) {
                            if (~var12_int <= ~var5.length) {
                              fl.field_j[8].c(-1 + var6, var13_array[0]);
                              fl.field_j[9].c(-1 + var6, var13_array[1]);
                              break L7;
                            } else {
                              var11 = var11 + var8 * ce.field_d.a(var5[var12_int], var6, -ce.field_d.field_I + var11, var7, 480, 1, -1, 0, 0, var8);
                              var12_int++;
                              continue L20;
                            }
                          }
                        } else {
                          var18[var12_int] = -15 + var11;
                          var11 = var11 + ce.field_d.a(var5[var12_int], 5 + var6, -ce.field_d.field_I + var11, var7, 480, 1, -1, 0, 0, var8) * var8;
                          var11 = var11 + var8;
                          var12_int++;
                          continue L19;
                        }
                      }
                    } else {
                      if (param0 == 5) {
                        var12_int = 0;
                        var11 = var11 + ce.field_d.a(var5[var12_int], var6, var11 - ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var8) * var8;
                        var7 -= 32;
                        var6 += 32;
                        var12_int++;
                        var11 = var11 + var8;
                        var17 = new int[4];
                        var13_array = var17;
                        L21: while (true) {
                          if (var12_int >= 5) {
                            var6 -= 32;
                            fl.field_j[10].c(var6 - 1, var17[0]);
                            fl.field_j[11].c(-1 + var6, var17[1]);
                            fl.field_j[12].c(-1 + var6, var17[2]);
                            fl.field_j[15].c(-1 + var6, var17[3]);
                            break L7;
                          } else {
                            L22: {
                              var17[-1 + var12_int] = -15 + var11;
                              var14 = ce.field_d.a(var5[var12_int], 5 + var6, var11 + -ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var8);
                              if (var14 != 1) {
                                break L22;
                              } else {
                                var14++;
                                break L22;
                              }
                            }
                            var11 = var11 + var8 * var14;
                            var11 = var11 + var8;
                            var12_int++;
                            continue L21;
                          }
                        }
                      } else {
                        var12 = param0 - -1 + "/" + 7;
                        var13 = mm.field_a;
                        var14 = 345 + var6;
                        var15 = var13.field_E - -var13.field_I + 90;
                        var13.a(var12, var14, var13.field_N + var15, 1, -1);
                        break L6;
                      }
                    }
                  }
                } else {
                  var12_int = 0;
                  L23: while (true) {
                    if (~var5.length >= ~var12_int) {
                      break L7;
                    } else {
                      L24: {
                        if (var12_int != 0) {
                          if (var12_int != 1) {
                            if (var12_int == 2) {
                              var11 = var11 + var8 * ce.field_d.a(var5[var12_int], var6, var11 - ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var8);
                              var11 = var11 + var8;
                              ib.field_a.f(var6, var11);
                              break L24;
                            } else {
                              var13_int = ce.field_d.a(var5[var12_int], ti.field_N, gf.field_a);
                              var14 = 0;
                              L25: while (true) {
                                if (var14 >= var13_int) {
                                  break L24;
                                } else {
                                  ce.field_d.a(gf.field_a[var14], var6 - (-var7 - -ti.field_N[var14]), var11, 1, -1);
                                  var11 = var11 + var8;
                                  var14++;
                                  continue L25;
                                }
                              }
                            }
                          } else {
                            var11 = var11 + ce.field_d.a(var5[var12_int], var6 - -40, -ce.field_d.field_I + var11, var7 + -40, 480, 1, -1, 0, 0, var8) * var8;
                            var11 = var11 + var8;
                            break L24;
                          }
                        } else {
                          int discarded$1 = ce.field_d.a(var5[var12_int], var6, var11 + -ce.field_d.field_I, 40, 480, 1, -1, 0, 0, var8);
                          break L24;
                        }
                      }
                      var12_int++;
                      continue L23;
                    }
                  }
                }
              }
              var12 = param0 - -1 + "/" + 7;
              var13 = mm.field_a;
              var14 = 345 + var6;
              var15 = var13.field_E - -var13.field_I + 90;
              var13.a(var12, var14, var13.field_N + var15, 1, -1);
              break L6;
            }
            return;
          } else {
            var10 = var10 + ce.field_d.a(var5[var11], var7);
            var11++;
            continue L3;
          }
        }
    }

    private final void a(int param0, int param1, int param2, String param3, int param4, vm param5, int param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              param2 = param2 + ((ml) this).field_l;
              param5.a(param3, -2 + param0, param2, 4, 8218369);
              param5.a(param3, param0 - -2, param2, 4, 8218369);
              param5.a(param3, param0, param2 - -2, 4, 8218369);
              param5.a(param3, param0 + -1, param2 + -1, 4, 8218369);
              param5.a(param3, param0 - -1, param2 + -1, 4, 8218369);
              param5.a(param3, param0 - 1, 1 + param2, 4, 8218369);
              param5.a(param3, 1 + param0, 1 + param2, 4, 8218369);
              if (param8) {
                param5.a(param3, param0, param2, param4, -1);
                break L1;
              } else {
                param5.a(param3, param0, param2, param6, -1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var10;
            stackOut_4_1 = new StringBuilder().append("ml.P(").append(param0).append(',').append(8218369).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param6 + ',' + -1 + ',' + param8 + ')');
        }
    }

    final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var3 = MinerDisturbance.field_ab;
          if (!((ml) this).field_b) {
            L1: {
              if (((ml) this).field_n != 2) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = stackIn_5_0;
                if (lj.field_t != 98) {
                  break L3;
                } else {
                  if (var2 == 0) {
                    break L3;
                  } else {
                    ((ml) this).field_o.c((byte) 126);
                    if (!((ml) this).field_o.d((byte) 77)) {
                      if (((ml) this).field_o.field_e >= 0) {
                        if (((ml) this).field_o.field_e != 3) {
                          if (0 < pj.field_a) {
                            if (((ml) this).field_o.field_e >= 4) {
                              ((ml) this).field_o.a(3, 0);
                              break L2;
                            } else {
                              ((ml) this).field_o.a(4, param0 ^ 1);
                              break L2;
                            }
                          } else {
                            ((ml) this).field_o.a(3, param0 ^ 1);
                            break L2;
                          }
                        } else {
                          ((ml) this).field_o.a(1, 0);
                          break L2;
                        }
                      } else {
                        ((ml) this).field_o.a(0, 0);
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (lj.field_t != 98) {
                  break L4;
                } else {
                  if (1 != ((ml) this).field_n) {
                    break L4;
                  } else {
                    if (((ml) this).field_k != 6) {
                      break L4;
                    } else {
                      ((ml) this).field_o.c((byte) 94);
                      if (!((ml) this).field_o.d((byte) 77)) {
                        if (((ml) this).field_o.field_e < 0) {
                          ((ml) this).field_o.a(0, 0);
                          break L2;
                        } else {
                          if (3 >= ((ml) this).field_o.field_e) {
                            ((ml) this).field_o.a(3, 0);
                            break L2;
                          } else {
                            ((ml) this).field_o.a(((ml) this).field_o.field_e, 0);
                            break L2;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              L5: {
                if (lj.field_t != 99) {
                  break L5;
                } else {
                  if (var2 != 0) {
                    ((ml) this).field_o.c((byte) 93);
                    if (!((ml) this).field_o.d((byte) 77)) {
                      if (((ml) this).field_o.field_e == 4) {
                        ((ml) this).field_o.a(1, 0);
                        break L2;
                      } else {
                        if (((ml) this).field_o.field_e < 3) {
                          ((ml) this).field_o.a(3, param0 + -1);
                          break L2;
                        } else {
                          if (((ml) this).field_o.field_e != 3) {
                            break L2;
                          } else {
                            if (pj.field_a <= 0) {
                              ((ml) this).field_o.a(1, param0 ^ 1);
                              break L2;
                            } else {
                              ((ml) this).field_o.a(4, 0);
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (99 != lj.field_t) {
                  break L6;
                } else {
                  if (1 != ((ml) this).field_n) {
                    break L6;
                  } else {
                    if (6 != ((ml) this).field_k) {
                      break L6;
                    } else {
                      ((ml) this).field_o.c((byte) 118);
                      if (((ml) this).field_o.d((byte) 77)) {
                        break L2;
                      } else {
                        if (((ml) this).field_o.field_e >= 0) {
                          if (((ml) this).field_o.field_e < 3) {
                            ((ml) this).field_o.a(((ml) this).field_o.field_e, 0);
                            break L2;
                          } else {
                            ((ml) this).field_o.a(1, 0);
                            break L2;
                          }
                        } else {
                          ((ml) this).field_o.a(3, 0);
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              ((ml) this).field_o.d(-4664);
              break L2;
            }
            if (((ml) this).field_n != 1) {
              break L0;
            } else {
              L7: {
                if (((ml) this).field_o.field_e != 3) {
                  break L7;
                } else {
                  if (((ml) this).field_k == 6) {
                    break L7;
                  } else {
                    if (lj.field_t == 97) {
                      ((ml) this).field_o.field_e = 0;
                      break L7;
                    } else {
                      ((ml) this).field_o.field_e = 2;
                      break L7;
                    }
                  }
                }
              }
              if (2 != ((ml) this).field_o.field_e) {
                break L0;
              } else {
                if (((ml) this).field_k != 6) {
                  break L0;
                } else {
                  if (97 != lj.field_t) {
                    break L0;
                  } else {
                    ((ml) this).field_o.field_e = 3;
                    break L0;
                  }
                }
              }
            }
          } else {
            ((ml) this).field_o.b((byte) -81);
            break L0;
          }
        }
        L8: {
          if (param0 == 1) {
            break L8;
          } else {
            field_d = 109;
            break L8;
          }
        }
        L9: {
          var2 = -2;
          if (((ml) this).field_o.field_e != -1) {
            var2 = this.b(468, ((ml) this).field_o.field_e);
            break L9;
          } else {
            break L9;
          }
        }
        return var2;
    }

    public static void a() {
        int var1 = 0;
        field_c = null;
    }

    private final void d(int param0, int param1) {
        ((ml) this).field_e = 0;
        ((ml) this).field_j = param0;
    }

    private final int c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((ml) this).field_r.length) {
            return -1;
          } else {
            var5 = pk.field_b.c(m.field_g[var4], 640);
            if (((ml) this).field_m - var5 / 2 <= param2) {
              if (var5 / 2 + ((ml) this).field_m > param2) {
                if (param1 >= var4 * ((ml) this).field_l + ((ml) this).field_q) {
                  if (param1 < pk.field_b.field_I + var4 * ((ml) this).field_l + ((ml) this).field_q - -pk.field_b.field_E) {
                    return var4;
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void d(int param0) {
        ((ml) this).field_j = 0;
        ((ml) this).field_e = -640;
        ((ml) this).field_p = false;
        int var2 = 122 % ((78 - param0) / 47);
    }

    private final void a(int param0, boolean param1, byte param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        vm var8 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ea var16_ref_ea = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        StringBuilder stackIn_18_0 = null;
        StringBuilder stackIn_19_0 = null;
        StringBuilder stackIn_20_0 = null;
        String stackIn_20_1 = null;
        StringBuilder stackIn_23_0 = null;
        StringBuilder stackIn_24_0 = null;
        StringBuilder stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        StringBuilder stackOut_17_0 = null;
        StringBuilder stackOut_19_0 = null;
        String stackOut_19_1 = null;
        StringBuilder stackOut_18_0 = null;
        String stackOut_18_1 = null;
        StringBuilder stackOut_22_0 = null;
        StringBuilder stackOut_24_0 = null;
        String stackOut_24_1 = null;
        StringBuilder stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        L0: {
          var19 = MinerDisturbance.field_ab;
          var6 = ((ml) this).field_r[param3];
          var7 = ((ml) this).field_r.length;
          if (((ml) this).field_n != 1) {
            if (((ml) this).field_n != 2) {
              break L0;
            } else {
              var7--;
              if (0 >= pj.field_a) {
                break L0;
              } else {
                var7--;
                break L0;
              }
            }
          } else {
            L1: {
              if (0 != ((ml) this).field_k) {
                break L1;
              } else {
                if (11 == var6) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (6 != ((ml) this).field_k) {
                break L2;
              } else {
                if (var6 != 10) {
                  break L2;
                } else {
                  return;
                }
              }
            }
            L3: {
              var7--;
              if (var6 != 18) {
                break L3;
              } else {
                if (((ml) this).field_k == 6) {
                  break L3;
                } else {
                  return;
                }
              }
            }
            if (var6 != 18) {
              break L0;
            } else {
              param3 = 0;
              var7 = 1;
              break L0;
            }
          }
        }
        L4: {
          var8 = pk.field_b;
          var9 = m.field_g[var6];
          if (var6 != 12) {
            break L4;
          } else {
            L5: {
              stackOut_17_0 = new StringBuilder().append(var9);
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (kf.field_d == null) {
                stackOut_19_0 = (StringBuilder) (Object) stackIn_19_0;
                stackOut_19_1 = ie.field_a;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L5;
              } else {
                stackOut_18_0 = (StringBuilder) (Object) stackIn_18_0;
                stackOut_18_1 = gm.field_b;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L5;
              }
            }
            var9 = stackIn_20_1;
            break L4;
          }
        }
        L6: {
          if (19 != var6) {
            break L6;
          } else {
            L7: {
              stackOut_22_0 = new StringBuilder().append(var9);
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (!sc.field_b) {
                stackOut_24_0 = (StringBuilder) (Object) stackIn_24_0;
                stackOut_24_1 = ie.field_a;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L7;
              } else {
                stackOut_23_0 = (StringBuilder) (Object) stackIn_23_0;
                stackOut_23_1 = gm.field_b;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L7;
              }
            }
            var9 = stackIn_25_1;
            break L6;
          }
        }
        L8: {
          if (var6 != 0) {
            break L8;
          } else {
            if (mc.field_w != 0) {
              break L8;
            } else {
              L9: {
                if (((ml) this).field_n == 1) {
                  break L9;
                } else {
                  if (((ml) this).field_n != 3) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              var9 = a.field_b;
              break L8;
            }
          }
        }
        if (param2 > 14) {
          L10: {
            var12 = 8218369;
            var13 = 16502531;
            var14 = 15885602;
            if (!((ml) this).field_b) {
              L11: {
                if ((1 & var7) != 0) {
                  var10 = ((ml) this).field_m - (((ml) this).field_l * (var7 / 2) + (-(param3 * ((ml) this).field_l) + -param0));
                  break L11;
                } else {
                  var15 = ((ml) this).field_m + -(((ml) this).field_l / 2) + -((-1 + var7) / 2 * ((ml) this).field_l);
                  var10 = var15 + param3 * ((ml) this).field_l - -param0;
                  break L11;
                }
              }
              var11 = ((ml) this).field_q;
              if (18 != var6) {
                if (0 != var6) {
                  break L10;
                } else {
                  if (((ml) this).field_n == 2) {
                    var10 = ((ml) this).field_m + param0;
                    var11 = var11 + (pk.field_b.field_I + pk.field_b.field_E);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              } else {
                var11 = var11 - (pk.field_b.field_I + pk.field_b.field_E);
                break L10;
              }
            } else {
              var11 = ((ml) this).field_l * param3 + ((ml) this).field_q;
              var10 = param0 + ((ml) this).field_m;
              break L10;
            }
          }
          if (var6 == 25) {
            L12: {
              if (((ml) this).field_p) {
                L13: {
                  stackOut_52_0 = -((ml) this).field_e;
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_53_0 = stackOut_52_0;
                  if (param4) {
                    stackOut_54_0 = stackIn_54_0;
                    stackOut_54_1 = -640;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    break L13;
                  } else {
                    stackOut_53_0 = stackIn_53_0;
                    stackOut_53_1 = 0;
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
                    break L13;
                  }
                }
                var15 = stackIn_55_0 - -stackIn_55_1;
                break L12;
              } else {
                L14: {
                  if (param4) {
                    stackOut_50_0 = 0;
                    stackIn_51_0 = stackOut_50_0;
                    break L14;
                  } else {
                    stackOut_49_0 = 640;
                    stackIn_51_0 = stackOut_49_0;
                    break L14;
                  }
                }
                var15 = stackIn_51_0 + ((ml) this).field_e;
                break L12;
              }
            }
            L15: {
              L16: {
                var10 = var15 + -param0 + 120;
                if (nk.field_w <= 120) {
                  break L16;
                } else {
                  if (nk.field_w >= 172) {
                    break L16;
                  } else {
                    stackOut_58_0 = 1;
                    stackIn_60_0 = stackOut_58_0;
                    break L15;
                  }
                }
              }
              stackOut_59_0 = 0;
              stackIn_60_0 = stackOut_59_0;
              break L15;
            }
            L17: {
              L18: {
                var17 = stackIn_60_0;
                if (nk.field_w <= 468) {
                  break L18;
                } else {
                  if (nk.field_w >= 520) {
                    break L18;
                  } else {
                    stackOut_62_0 = 1;
                    stackIn_64_0 = stackOut_62_0;
                    break L17;
                  }
                }
              }
              stackOut_63_0 = 0;
              stackIn_64_0 = stackOut_63_0;
              break L17;
            }
            L19: {
              L20: {
                L21: {
                  var18 = stackIn_64_0;
                  if (!param1) {
                    break L21;
                  } else {
                    if (var17 != 0) {
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (!param1) {
                    break L22;
                  } else {
                    if (var18 == 0) {
                      break L20;
                    } else {
                      break L22;
                    }
                  }
                }
                var16_ref_ea = bl.field_w;
                break L19;
              }
              var16_ref_ea = h.field_c;
              break L19;
            }
            L23: {
              L24: {
                L25: {
                  var16_ref_ea.g(var10, 83);
                  var10 = var15 + (-param0 + 468);
                  if (!param1) {
                    break L25;
                  } else {
                    if (var18 != 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                L26: {
                  if (!param1) {
                    break L26;
                  } else {
                    if (var17 == 0) {
                      break L24;
                    } else {
                      break L26;
                    }
                  }
                }
                var16_ref_ea = bl.field_w;
                break L23;
              }
              var16_ref_ea = h.field_c;
              break L23;
            }
            var16_ref_ea.a();
            var16_ref_ea.g(var10, 83);
            var16_ref_ea.a();
            return;
          } else {
            L27: {
              if (var6 != 20) {
                break L27;
              } else {
                if (!qd.field_S) {
                  var13 = 11184810;
                  var9 = dc.field_c;
                  var14 = 14235957;
                  break L27;
                } else {
                  break L27;
                }
              }
            }
            L28: {
              if (var6 != 21) {
                break L28;
              } else {
                if (!ci.field_b) {
                  var14 = 16755370;
                  var13 = 11184810;
                  var9 = jk.field_lb;
                  break L28;
                } else {
                  break L28;
                }
              }
            }
            L29: {
              L30: {
                if (var6 != 18) {
                  break L30;
                } else {
                  if (!g.a(-36)) {
                    break L30;
                  } else {
                    var15 = 3355443;
                    this.a(var11, var10, -22542, var8, 6776679, 14013909, var9, var15, param1);
                    break L29;
                  }
                }
              }
              L31: {
                if (!((ml) this).field_b) {
                  break L31;
                } else {
                  if (((ml) this).field_n != 6) {
                    this.a(var10, var12, var11, var9, var14, var8, var13, -1, param1);
                    break L29;
                  } else {
                    break L31;
                  }
                }
              }
              this.a(var11, var10, -22542, var8, var13, var14, var9, var12, param1);
              break L29;
            }
            L32: {
              if (6 == var6) {
                L33: {
                  var15 = var13;
                  var16 = 0;
                  if (kb.field_c != 2) {
                    break L33;
                  } else {
                    var16 = 20;
                    break L33;
                  }
                }
                var17 = 134 + var16;
                eh.c(2 + var10 + var17, 28 + var11, 4, var12);
                eh.c(2 + (144 + var17) + var10, 28 + var11, 4, var12);
                eh.c(-1 + (var10 + var17), var11 + 26, 3, var15);
                eh.d(var17 + var10 + -1, 26 + var11, 4, 1);
                eh.c(-1 + (var10 - -var17 + 144), var11 + 26, 3, var15);
                eh.d(143 + var10 + var17, var11 - -26, 4, 1);
                eh.e(var17 + var10, 23 + var11, 144, 10, var12);
                eh.e(var10 - -var17, var11 - -30, 144, 1);
                eh.e(var17 + var10, 23 + var11, 144, 7, var15);
                eh.e(var17 + var10, 22 + var11, 144, 1);
                var18 = -2 + var17 + (var10 - -(ee.field_J * 144 / 256));
                eh.a(var18 + -1, 18 + var11, 6, 18, 1);
                eh.e(var18, var11 + 19, 4, 16, var15);
                break L32;
              } else {
                break L32;
              }
            }
            L34: {
              if (var6 != 5) {
                break L34;
              } else {
                L35: {
                  var15 = var13;
                  var16 = 0;
                  if (2 == kb.field_c) {
                    var16 = 20;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                var17 = 134 - -var16;
                eh.c(var17 + var10 - -2, 28 + var11, 4, var12);
                eh.c(144 + var10 + var17 + 2, 28 + var11, 4, var12);
                eh.c(-1 + var10 - -var17, 26 + var11, 3, var15);
                eh.d(var17 + var10 - 1, 26 + var11, 4, 1);
                eh.c(var10 - -var17 - -143, 26 + var11, 3, var15);
                eh.d(144 + (var10 - -var17 + -1), 26 + var11, 4, 1);
                eh.e(var10 - -var17, 23 + var11, 144, 10, var12);
                eh.e(var17 + var10, 30 + var11, 144, 1);
                eh.e(var17 + var10, 23 + var11, 144, 7, var15);
                eh.e(var10 + var17, var11 + 22, 144, 1);
                var18 = -2 + (144 * oc.field_f / 256 + var17) + var10;
                eh.a(-1 + var18, 18 + var11, 6, 18, 1);
                eh.e(var18, var11 + 19, 4, 16, var15);
                break L34;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final boolean a(int param0) {
        if (param0 <= 87) {
            return false;
        }
        return ((ml) this).field_j != 0 ? true : false;
    }

    final static int a(int param0, byte param1) {
        return dj.field_g[param0 & 2047];
    }

    final static void a(byte param0, int param1, ea param2, ea param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var12 = MinerDisturbance.field_ab;
        try {
          L0: {
            var4_int = 0;
            var5 = param3.field_D;
            var6 = param2.field_D;
            var7 = param3.field_C;
            var8 = param3.field_y;
            var9 = 0;
            L1: while (true) {
              if (~var9 <= ~var7) {
                break L0;
              } else {
                var10 = 0;
                L2: while (true) {
                  if (~var8 >= ~var10) {
                    var9++;
                    continue L1;
                  } else {
                    L3: {
                      L4: {
                        var11 = var5[var4_int];
                        if (var11 == 0) {
                          break L4;
                        } else {
                          if (var11 == 16777215) {
                            break L4;
                          } else {
                            L5: {
                              L6: {
                                if (var10 == 0) {
                                  break L6;
                                } else {
                                  if (var5[-1 + var4_int] == 0) {
                                    break L6;
                                  } else {
                                    L7: {
                                      if (~var10 == ~(-1 + var8)) {
                                        break L7;
                                      } else {
                                        if (var5[1 + var4_int] == 0) {
                                          break L7;
                                        } else {
                                          L8: {
                                            if (var9 == 0) {
                                              break L8;
                                            } else {
                                              if (var5[var4_int + -var8] == 0) {
                                                break L8;
                                              } else {
                                                L9: {
                                                  if (var7 - 1 == var9) {
                                                    break L9;
                                                  } else {
                                                    if (var5[var8 + var4_int] == 0) {
                                                      break L9;
                                                    } else {
                                                      break L5;
                                                    }
                                                  }
                                                }
                                                var11 = 16777215;
                                                break L5;
                                              }
                                            }
                                          }
                                          var11 = 16777215;
                                          break L5;
                                        }
                                      }
                                    }
                                    var11 = 16777215;
                                    break L5;
                                  }
                                }
                              }
                              var11 = 16777215;
                              break L5;
                            }
                            int incrementValue$1 = var4_int;
                            var4_int++;
                            var6[incrementValue$1] = var11;
                            break L3;
                          }
                        }
                      }
                      var4_int++;
                      break L3;
                    }
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("ml.J(").append(93).append(',').append(16777215).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    final void c(int param0, int param1) {
        nn stackIn_10_0 = null;
        nn stackIn_11_0 = null;
        nn stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        nn stackOut_9_0 = null;
        nn stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        nn stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          if (4 == ((ml) this).field_n) {
            break L0;
          } else {
            L1: {
              if (0 != ((ml) this).field_n) {
                break L1;
              } else {
                if (param1 != -1) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            ((ml) this).field_o.field_e = 0;
            if (((ml) this).field_n == 1) {
              ((ml) this).field_o.field_e = 1;
              break L0;
            } else {
              if (((ml) this).field_n == 2) {
                ((ml) this).field_o.field_e = 2;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          int discarded$1 = -4440;
          stackOut_9_0 = ((ml) this).field_o;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (u.b() >= mk.b(117)) {
            stackOut_11_0 = (nn) (Object) stackIn_11_0;
            stackOut_11_1 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L2;
          } else {
            stackOut_10_0 = (nn) (Object) stackIn_10_0;
            stackOut_10_1 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L2;
          }
        }
        ((nn) (Object) stackIn_12_0).a(stackIn_12_1 != 0, param0, 116);
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var10 = MinerDisturbance.field_ab;
          if (((ml) this).field_n != 2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          if (var4 == 0) {
            break L1;
          } else {
            if (0 >= pj.field_a) {
              break L1;
            } else {
              if (83 >= param2) {
                break L1;
              } else {
                if (111 > param2) {
                  L2: {
                    L3: {
                      if (param1 <= 120) {
                        break L3;
                      } else {
                        if (param1 < 172) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (param1 <= 468) {
                        break L4;
                      } else {
                        if (520 <= param1) {
                          break L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                    return -1;
                  }
                  return 4;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L5: {
          L6: {
            if (var4 != 0) {
              break L6;
            } else {
              if (param2 > pk.field_b.field_I + ((ml) this).field_q + pk.field_b.field_E) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          L7: {
            if (((ml) this).field_n == 1) {
              break L7;
            } else {
              if (((ml) this).field_q > param2) {
                break L5;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (1 != ((ml) this).field_n) {
              break L8;
            } else {
              if (pk.field_b.field_E + (((ml) this).field_q - pk.field_b.field_I) <= param2) {
                break L8;
              } else {
                return -1;
              }
            }
          }
          L9: {
            if (var4 == 0) {
              break L9;
            } else {
              if (param2 <= 3 * (pk.field_b.field_I + pk.field_b.field_E) + ((ml) this).field_q) {
                break L9;
              } else {
                return -1;
              }
            }
          }
          L10: {
            var5 = ((ml) this).field_r.length;
            if (1 == ((ml) this).field_n) {
              var5--;
              break L10;
            } else {
              if (var4 == 0) {
                break L10;
              } else {
                var5--;
                if (pj.field_a <= 0) {
                  break L10;
                } else {
                  var5--;
                  break L10;
                }
              }
            }
          }
          L11: {
            if (0 == (var5 & 1)) {
              var6 = -((var5 + -1) / 2 * ((ml) this).field_l) + (-(((ml) this).field_l / 2) + ((ml) this).field_m);
              break L11;
            } else {
              var6 = ((ml) this).field_m - var5 / 2 * ((ml) this).field_l;
              break L11;
            }
          }
          L12: {
            if (((ml) this).field_n != 1) {
              break L12;
            } else {
              if (((ml) this).field_q <= param2) {
                break L12;
              } else {
                var7 = pk.field_b.c(m.field_g[18], 640);
                if (-(var7 / 2) + ((ml) this).field_m >= param1) {
                  break L12;
                } else {
                  if (param1 < ((ml) this).field_m + var7 / 2) {
                    return 3;
                  } else {
                    break L12;
                  }
                }
              }
            }
          }
          L13: {
            if (var4 == 0) {
              break L13;
            } else {
              if (param2 > ((ml) this).field_q - -((pk.field_b.field_E + pk.field_b.field_I) * 3)) {
                break L13;
              } else {
                if (param2 <= pk.field_b.field_E + (pk.field_b.field_I + ((ml) this).field_q)) {
                  break L13;
                } else {
                  L14: {
                    var7 = pk.field_b.c(m.field_g[0], 640);
                    if (param1 <= -(var7 / 2) + ((ml) this).field_m) {
                      break L14;
                    } else {
                      if (((ml) this).field_m - -(var7 / 2) > param1) {
                        return 3;
                      } else {
                        break L14;
                      }
                    }
                  }
                  return -1;
                }
              }
            }
          }
          var7 = var6;
          var8 = 0;
          if (param0 == 640) {
            L15: while (true) {
              if (var5 <= var8) {
                return -1;
              } else {
                L16: {
                  var9 = pk.field_b.c(m.field_g[((ml) this).field_r[var8]], 640);
                  if (var7 + -(var9 / 2) >= param1) {
                    break L16;
                  } else {
                    if (param1 < var7 + var9 / 2) {
                      return var8;
                    } else {
                      break L16;
                    }
                  }
                }
                var8++;
                var7 = var7 + ((ml) this).field_l;
                continue L15;
              }
            }
          } else {
            return -122;
          }
        }
        return -1;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        String stackIn_44_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_43_0 = null;
        String stackOut_42_0 = null;
        var12 = MinerDisturbance.field_ab;
        if (!kj.a(false)) {
          L0: {
            var5 = ((ml) this).field_i;
            if (((ml) this).field_p) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = stackIn_5_0;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (param1) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          L2: {
            if ((stackIn_8_0 ^ stackIn_8_1) == 0) {
              break L2;
            } else {
              if (((ml) this).field_j == 3) {
                var5 = (1 + ((ml) this).field_i) % 2;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (sn.field_b[var5] == null) {
              L4: {
                if (0 == var5) {
                  stackOut_16_0 = 6;
                  stackIn_17_0 = stackOut_16_0;
                  break L4;
                } else {
                  stackOut_15_0 = 7;
                  stackIn_17_0 = stackOut_15_0;
                  break L4;
                }
              }
              var6 = stackIn_17_0;
              int discarded$4 = 10;
              sn.field_b[var5] = gk.a(3, 1, var6, eg.a(121, -18));
              break L3;
            } else {
              break L3;
            }
          }
          L5: {
            if (!((ml) this).field_p) {
              L6: {
                if (param1) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  break L6;
                } else {
                  stackOut_24_0 = 640;
                  stackIn_26_0 = stackOut_24_0;
                  break L6;
                }
              }
              var6 = stackIn_26_0 + ((ml) this).field_e;
              break L5;
            } else {
              L7: {
                if (!param1) {
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L7;
                } else {
                  stackOut_20_0 = -640;
                  stackIn_22_0 = stackOut_20_0;
                  break L7;
                }
              }
              var6 = stackIn_22_0 + -((ml) this).field_e;
              break L5;
            }
          }
          L8: {
            var7 = var6;
            if (((ml) this).field_j != 3) {
              break L8;
            } else {
              var7 = 0;
              break L8;
            }
          }
          L9: {
            if (param2 == 0) {
              on.field_x.f(640 + (-(on.field_x.field_x >> 1) + (320 + (-param0 + -640)) - -var7), 6);
              break L9;
            } else {
              if (param2 == 2) {
                sk.field_e.f(var7 + 640 + (-(sk.field_e.field_x >> 1) + -param0 + -320), 6);
                break L9;
              } else {
                if (param2 == 1) {
                  ld.field_x.f(var7 + -(ld.field_x.field_x >> 1) + (320 + -param0), 6);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
          }
          L10: {
            var8 = 410;
            var9 = var6 + 115 + -param0;
            var10 = 60 + var8;
            var11 = 285;
            var10 = var10 - (ak.field_a[0].field_x + ak.field_a[2].field_x);
            var10 = var10 / ak.field_a[1].field_x * ak.field_a[1].field_x;
            var11 = var11 - (ak.field_a[0].field_A + ak.field_a[6].field_A);
            var10 = var10 + (ak.field_a[0].field_x + ak.field_a[2].field_x);
            var11 = ak.field_a[3].field_A * (1 + var11 / ak.field_a[3].field_A);
            var11 = var11 + (ak.field_a[6].field_A + ak.field_a[0].field_A);
            if (var10 < var8) {
              var10 = var10 + ak.field_a[1].field_x;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (285 <= var11) {
              break L11;
            } else {
              var11 = var11 + ak.field_a[1].field_A;
              break L11;
            }
          }
          L12: {
            g.a(80, var11, var9 + (var8 - var10) / 2, var10, (byte) 113, ak.field_a);
            ff.field_f.f(var9 - -((var8 + -ff.field_f.field_x) / 2), 85);
            if (0 != var5) {
              stackOut_43_0 = rj.field_a;
              stackIn_44_0 = stackOut_43_0;
              break L12;
            } else {
              stackOut_42_0 = gn.field_a;
              stackIn_44_0 = stackOut_42_0;
              break L12;
            }
          }
          int discarded$5 = 109;
          int discarded$6 = 0;
          bd.a(stackIn_44_0, var9 - -(var8 / 2));
          this.a(23, var5, var8, sn.field_b[var5], var9, param2);
          int discarded$7 = ce.field_d.a(am.field_N, 0 - param0 - -130 - -var6, 310, 380, 30, 1, -1, 1, 1, 0);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, lc param3, int param4, int param5) {
        RuntimeException var7 = null;
        String var7_ref = null;
        int var7_int = 0;
        int var8 = 0;
        String[] var8_ref_String__ = null;
        vm var9 = null;
        String var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        String var16 = null;
        int var17 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var17 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (!param3.field_t) {
                var7_ref = nj.field_d;
                var8 = 100 + pk.field_b.field_I + 76;
                pk.field_b.b(var7_ref, 205 + param4, var8, 16689702, -1);
                break L1;
              } else {
                if (null != param3.field_p) {
                  L2: {
                    var7_int = 0;
                    var8_ref_String__ = param3.field_p[param5];
                    var9 = ce.field_d;
                    if (var8_ref_String__ == null) {
                      break L2;
                    } else {
                      L3: {
                        if (vk.field_a != param1) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          break L3;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          break L3;
                        }
                      }
                      var10_int = stackIn_8_0;
                      var11_ref_int__ = param3.field_n[param5];
                      var12 = 100 - (-var9.field_I + -25);
                      var13 = 0;
                      var14_int = 0;
                      L4: while (true) {
                        if (var14_int >= 10) {
                          if (var13 != 0) {
                            break L2;
                          } else {
                            if (ha.field_b <= 0) {
                              break L2;
                            } else {
                              if (var10_int == 0) {
                                break L2;
                              } else {
                                var14 = ti.field_J + " " + this.d(256, ha.field_b, param1);
                                var9.a(var14, param4 - -45, var12, 16724225, -1);
                                int discarded$3 = 1;
                                var9.c(ab.a(0, kb.field_c, true, (long)Math.abs(ha.field_b)), 410 + (param4 + -35), var12, 16724225, -1);
                                break L2;
                              }
                            }
                          }
                        } else {
                          L5: {
                            if (null != var8_ref_String__[var14_int]) {
                              L6: {
                                var7_int = 1;
                                var15 = var11_ref_int__[var14_int];
                                var16 = var8_ref_String__[var14_int] + " <col=666666>" + this.d(256, var15, param1) + "</col>";
                                if (var10_int == 0) {
                                  break L6;
                                } else {
                                  if (var13 != 0) {
                                    break L6;
                                  } else {
                                    if (ha.field_b < 0) {
                                      break L6;
                                    } else {
                                      if (var15 != Math.abs(ha.field_b)) {
                                        break L6;
                                      } else {
                                        if (ci.a(-27933, var8_ref_String__[var14_int])) {
                                          var13 = 1;
                                          var9.c(1 + var14_int + ". ", param4 + 45, var12, 16610816, -1);
                                          var9.a(var16, 45 + param4, var12, 16610816, -1);
                                          int discarded$4 = 1;
                                          var9.c(ab.a(0, kb.field_c, true, (long)var15), 410 + (param4 + -35), var12, 16610816, -1);
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var9.c(var14_int - -1 + ". ", 45 + param4, var12, 1, -1);
                              var9.a(var16, 45 + param4, var12, 1, -1);
                              int discarded$5 = 1;
                              var9.c(ab.a(0, kb.field_c, true, (long)var15), 410 + (param4 - 35), var12, 1, -1);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var12 += 17;
                          var14_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                  if (var7_int == 0) {
                    var10 = ae.field_b;
                    var11 = 76 + pk.field_b.field_I + 100;
                    pk.field_b.b(var10, param4 - -205, var11, 16689702, -1);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var7_ref = ff.field_d;
                  var8 = pk.field_b.field_I + 176;
                  pk.field_b.b(var7_ref, param4 + 205, var8, 16689702, -1);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var7;
            stackOut_30_1 = new StringBuilder().append("ml.BA(").append(23).append(',').append(param1).append(',').append(410).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = MinerDisturbance.field_ab;
          if (!this.a(107)) {
            break L0;
          } else {
            ((ml) this).field_e = ((ml) this).field_e - 32;
            if (((ml) this).field_e < -640) {
              this.d(param0 + -8654);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (1 == ((ml) this).field_n) {
            if (((ml) this).field_o.field_e >= 0) {
              L2: {
                L3: {
                  if (-1 != ((ml) this).field_k) {
                    break L3;
                  } else {
                    if (-12 == ((ml) this).field_r[((ml) this).field_o.field_e]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((ml) this).field_k != 6) {
                  break L1;
                } else {
                  if (((ml) this).field_r[((ml) this).field_o.field_e] == 10) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = 0;
              L4: while (true) {
                if (((ml) this).field_r.length <= var2) {
                  break L1;
                } else {
                  if (0 == ((ml) this).field_r[var2]) {
                    ((ml) this).field_o.field_e = var2;
                    break L1;
                  } else {
                    var2++;
                    continue L4;
                  }
                }
              }
            } else {
              break L1;
            }
          } else {
            L5: {
              if (3 == ((ml) this).field_n) {
                break L5;
              } else {
                if (-9 == ((ml) this).field_n) {
                  break L5;
                } else {
                  if (-6 != ((ml) this).field_n) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
            }
            c.a((byte) -103);
            break L1;
          }
        }
        L6: {
          if (param0 == 8779) {
            break L6;
          } else {
            ((ml) this).field_k = -5;
            break L6;
          }
        }
        L7: {
          L8: {
            if (((ml) this).field_n == 11) {
              break L8;
            } else {
              if (!((ml) this).field_b) {
                break L8;
              } else {
                if (((ml) this).field_n == 6) {
                  var2 = this.c(-21377, m.field_e, wi.field_w);
                  var3 = this.c(-21377, gb.field_e, nk.field_w);
                  ((ml) this).field_o.a(var3, var2, -1);
                  break L7;
                } else {
                  ((ml) this).field_o.a(((ml) this).field_q, ((ml) this).field_m, 140, ((ml) this).field_l, ((ml) this).field_h + ((ml) this).field_m);
                  break L7;
                }
              }
            }
          }
          var2 = -1;
          var3 = -1;
          if (((ml) this).field_n != 11) {
            var2 = this.a(640, wi.field_w, m.field_e);
            var3 = this.a(param0 + -8139, nk.field_w, gb.field_e);
            ((ml) this).field_o.a(var3, var2, param0 ^ -8780);
            break L7;
          } else {
            var4 = wk.field_a.a(true, 1);
            if (1 == var4) {
              tk.field_a = true;
              return 4;
            } else {
              if (var4 == 2) {
                tk.field_a = true;
                return 4;
              } else {
                break L7;
              }
            }
          }
        }
        if (((ml) this).field_o.field_e != -1) {
          return this.b(468, ((ml) this).field_o.field_e);
        } else {
          return -2;
        }
    }

    private final String d(int param0, int param1, int param2) {
        if (0 == param2) {
          if (0 != param1) {
            if (param1 < 1000) {
              return dh.field_c[0][1];
            } else {
              if (5000 > param1) {
                return dh.field_c[0][2];
              } else {
                if (param1 >= 25000) {
                  if (param1 < 50000) {
                    return dh.field_c[0][4];
                  } else {
                    if (param1 >= 100000) {
                      if (param1 < 200000) {
                        return dh.field_c[0][6];
                      } else {
                        if (500000 <= param1) {
                          if (1000000 > param1) {
                            return dh.field_c[0][8];
                          } else {
                            return dh.field_c[0][9];
                          }
                        } else {
                          return dh.field_c[0][7];
                        }
                      }
                    } else {
                      return dh.field_c[0][5];
                    }
                  }
                } else {
                  return dh.field_c[0][3];
                }
              }
            }
          } else {
            return dh.field_c[0][0];
          }
        } else {
          if (0 != param1) {
            if (5000 > param1) {
              return dh.field_c[1][1];
            } else {
              if (param1 < 25000) {
                return dh.field_c[1][2];
              } else {
                if (param1 < 50000) {
                  return dh.field_c[1][3];
                } else {
                  if (param1 >= 100000) {
                    if (param1 < 200000) {
                      return dh.field_c[1][5];
                    } else {
                      if (param1 < 500000) {
                        return dh.field_c[1][6];
                      } else {
                        if (1000000 > param1) {
                          return dh.field_c[1][7];
                        } else {
                          if (param1 < 2000000) {
                            return dh.field_c[1][8];
                          } else {
                            return dh.field_c[1][9];
                          }
                        }
                      }
                    }
                  } else {
                    return dh.field_c[1][4];
                  }
                }
              }
            }
          } else {
            return dh.field_c[1][0];
          }
        }
    }

    private final void b(int param0, byte param1) {
        int var3 = param0 + 172;
        int var4 = 70;
        int var5 = 296;
        int var6 = 116;
        g.a(var4, var6 - -30, var3 + -20, 40 + var5, (byte) 80, hd.field_d);
        int var7 = ce.field_d.field_I + ce.field_d.field_E;
        var4 += 50;
        pk.field_b.b(si.field_e, 320 + param0, var4, 0, -1);
        var4 = var4 + var7;
        int discarded$0 = ce.field_d.a(ci.field_j, var3 - -10, var4, -20 + var5, 300, 0, -1, 1, 0, 14);
        g.a(285, 90, var3 + -20, var5 + 40, (byte) 47, hd.field_d);
        int discarded$1 = ce.field_d.a(bf.field_a, var3 + 10, 310, var5 - 20, 300, 0, -1, 1, 0, 14);
    }

    private final void a(int param0, int param1) {
        int var3 = ((ml) this).field_e;
        int var4 = var3 + (-param1 + 755);
        on.field_x.f(var3 + (-param1 + 640 + (320 - (on.field_x.field_x >> 1))), 15);
        g.a(80, 235, var4, 410, (byte) 113, hd.field_d);
        String var5 = ae.field_b;
        int var6 = 176 + pk.field_b.field_I;
        pk.field_b.b(var5, var3 + (-param1 + 640) - -320, var6, 16689702, -1);
        int discarded$0 = ce.field_d.a(vb.field_d, var3 + (130 + -param1) + 640, 260, 380, 30, 1, -1, 1, 1, 0);
    }

    private final void a(int param0, int param1, int param2, vm param3, int param4, int param5, String param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              param0 += 42;
              param3.b(param6, -2 + param1, param0, 4, param7);
              param3.b(param6, 2 + param1, param0, 4, param7);
              param3.b(param6, param1, param0 + -2, 4, param7);
              param3.b(param6, param1, param0 + 2, 4, param7);
              param3.b(param6, -1 + param1, -1 + param0, 4, param7);
              param3.b(param6, 1 + param1, param0 + -1, 4, param7);
              param3.b(param6, -1 + param1, 1 + param0, 4, param7);
              param3.b(param6, 1 + param1, param0 - -1, 4, param7);
              if (param8) {
                param3.b(param6, param1, param0, param5, -1);
                break L1;
              } else {
                param3.b(param6, param1, param0, param4, -1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var10;
            stackOut_4_1 = new StringBuilder().append("ml.W(").append(param0).append(',').append(param1).append(',').append(-22542).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    ml(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((ml) this).field_e = -640;
        ((ml) this).field_k = 0;
        ((ml) this).field_i = 0;
        ((ml) this).field_p = false;
        ((ml) this).field_f = 0;
        ((ml) this).field_g = -1;
        try {
          L0: {
            L1: {
              ((ml) this).field_l = param6;
              ((ml) this).field_m = param2;
              ((ml) this).field_n = param0;
              ((ml) this).field_q = param3;
              ((ml) this).field_r = param1;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param7) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ml) this).field_b = stackIn_4_1 != 0;
              ((ml) this).field_h = param4;
              ((ml) this).field_o = new nn(((ml) this).field_r.length);
              if (-2 != ((ml) this).field_n) {
                break L2;
              } else {
                var10_int = 0;
                L3: while (true) {
                  if (-12 <= var10_int) {
                    break L2;
                  } else {
                    L4: {
                      if (var10_int < 8) {
                        ti.field_N[var10_int] = -10 + -ib.field_a.field_x + 390;
                        break L4;
                      } else {
                        ti.field_N[var10_int] = 390;
                        break L4;
                      }
                    }
                    var10_int++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var10;
            stackOut_12_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 9;
        field_c = new char[]{'[', ']', '#'};
    }
}
