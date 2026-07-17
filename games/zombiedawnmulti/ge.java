/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ge extends pa {
    private boolean field_Bb;
    static String field_pb;
    private int field_yb;
    static String field_qb;
    private int field_Db;
    private boolean field_jb;
    private int field_mb;
    private int field_rb;
    boolean field_lb;
    private int field_sb;
    private int field_xb;
    private th field_Cb;
    lm field_tb;
    private int field_hb;
    int field_gb;
    private int field_kb;
    private int field_Ab;
    private qk field_wb;
    private int field_fb;
    private int field_nb;
    private int field_ob;
    private sa field_vb;
    static int field_zb;
    static String field_ib;
    boolean field_eb;
    private int field_ub;

    private final void a(int param0, int param1, int param2) {
        ((ge) this).field_N = param2;
        ((ge) this).field_ab = param0;
        ((ge) this).c(85, ((ge) this).field_M * 14336);
        if (param1 != 750) {
            ((ge) this).field_wb = null;
        }
        ((ge) this).a(6, (byte) -89);
    }

    final boolean a(int param0, boolean param1) {
        if (!(!this.c(true))) {
            return false;
        }
        ((ge) this).a(!param1 ? 15 : 34, (byte) -89);
        ((ge) this).field_S = true;
        if (param0 != 47) {
            field_pb = null;
            return true;
        }
        return true;
    }

    public static void r(int param0) {
        field_qb = null;
        field_pb = null;
        field_ib = null;
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        og var5 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_155_0 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_18_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          super.h(77);
          ((ge) this).field_Ab = ((ge) this).field_Ab - 1;
          ((ge) this).b((byte) 123, ((ge) this).field_Q);
          if (((ge) this).field_Q == 33) {
            break L0;
          } else {
            if (((ge) this).field_Q != 29) {
              ((ge) this).field_ob = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (((ge) this).field_ub > 0) {
            ((ge) this).field_ub = ((ge) this).field_ub - 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 > 30) {
            break L2;
          } else {
            ((ge) this).field_tb = null;
            break L2;
          }
        }
        L3: {
          if (((ge) this).field_xb > 0) {
            ((ge) this).field_xb = ((ge) this).field_xb - 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (29 != ((ge) this).field_Q) {
            ((ge) this).field_lb = false;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          L6: {
            L7: {
              stackOut_15_0 = this;
              stackIn_19_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (!((ge) this).field_Bb) {
                break L7;
              } else {
                stackOut_16_0 = this;
                stackIn_19_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (((ge) this).field_Q == 33) {
                  break L7;
                } else {
                  stackOut_17_0 = this;
                  stackIn_24_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (29 != ((ge) this).field_Q) {
                    break L6;
                  } else {
                    stackOut_18_0 = this;
                    stackIn_19_0 = stackOut_18_0;
                    break L7;
                  }
                }
              }
            }
            stackOut_19_0 = this;
            stackIn_24_0 = stackOut_19_0;
            stackIn_20_0 = stackOut_19_0;
            if (23 == ((ge) this).field_Q) {
              break L6;
            } else {
              stackOut_20_0 = this;
              stackIn_24_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if (((ge) this).o(126)) {
                break L6;
              } else {
                stackOut_21_0 = this;
                stackIn_24_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (((ge) this).field_Q == 9) {
                  break L6;
                } else {
                  stackOut_22_0 = this;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (21 == ((ge) this).field_Q) {
                    break L6;
                  } else {
                    stackOut_23_0 = this;
                    stackOut_23_1 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    break L5;
                  }
                }
              }
            }
          }
          stackOut_24_0 = this;
          stackOut_24_1 = 0;
          stackIn_25_0 = stackOut_24_0;
          stackIn_25_1 = stackOut_24_1;
          break L5;
        }
        L8: {
          ((ge) this).field_jb = stackIn_25_1 != 0;
          if (((ge) this).field_Q == 4) {
            L9: {
              if (((ge) this).field_nb <= 0) {
                break L9;
              } else {
                ((ge) this).field_nb = ((ge) this).field_nb - 1;
                break L9;
              }
            }
            L10: {
              if (!((ge) this).field_Bb) {
                break L10;
              } else {
                if (((ge) this).field_V >= 2) {
                  break L10;
                } else {
                  ((ge) this).field_L = ((ge) this).field_L + 3;
                  break L10;
                }
              }
            }
            L11: {
              if (0 >= ((ge) this).field_fb) {
                break L11;
              } else {
                ((ge) this).field_fb = ((ge) this).field_fb - 1;
                break L11;
              }
            }
            L12: {
              L13: {
                if (((ge) this).field_nb == 1) {
                  break L13;
                } else {
                  L14: {
                    if (((ge) this).field_M <= 2) {
                      break L14;
                    } else {
                      if (((ge) this).field_Bb) {
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (((ge) this).field_nb != 0) {
                    break L12;
                  } else {
                    ((ge) this).field_nb = hp.a((byte) 114, g.field_a, 60) + 60;
                    if (((ge) this).field_A.field_m.b((byte) -98, 55, ((ge) this).field_gb)) {
                      ((ge) this).field_nb = 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              var2 = -24 + ((ge) this).e((byte) -112) + hp.a((byte) 22, g.field_a, 48);
              var3 = -24 + (((ge) this).g(1829947600) - -hp.a((byte) -66, g.field_a, 48));
              if (!((ge) this).field_A.field_b.a(var2, true, true, var3)) {
                ((ge) this).field_nb = ((ge) this).field_nb + 1;
                break L12;
              } else {
                this.a(var3, 750, var2);
                break L12;
              }
            }
            this.n(-26310);
            this.n((byte) 106);
            break L8;
          } else {
            if (((ge) this).field_Q == 23) {
              int fieldTemp$7 = ((ge) this).field_Db - 1;
              ((ge) this).field_Db = ((ge) this).field_Db - 1;
              if (fieldTemp$7 <= 0) {
                ((ge) this).a(4, (byte) -89);
                ((ge) this).field_S = true;
                break L8;
              } else {
                break L8;
              }
            } else {
              if (5 != ((ge) this).field_Q) {
                if (((ge) this).field_Q == 33) {
                  ((ge) this).field_ob = ((ge) this).field_ob + 1;
                  if (((ge) this).field_ob != 0) {
                    if (100 >= ((ge) this).field_ob) {
                      break L8;
                    } else {
                      ((ge) this).a(4, (byte) -89);
                      break L8;
                    }
                  } else {
                    ((ge) this).field_E = ((ge) this).field_rb;
                    ((ge) this).field_G = ((ge) this).field_sb;
                    break L8;
                  }
                } else {
                  if (((ge) this).field_Q != 6) {
                    if (((ge) this).field_Q != 7) {
                      if (((ge) this).field_Q != 8) {
                        if (((ge) this).field_Q == 22) {
                          int fieldTemp$8 = ((ge) this).field_Ab - 1;
                          ((ge) this).field_Ab = ((ge) this).field_Ab - 1;
                          if (fieldTemp$8 <= 0) {
                            ((ge) this).field_Ab = 35;
                            ((ge) this).field_S = true;
                            ((ge) this).a(4, (byte) -89);
                            this.u(92);
                            this.o((byte) 27);
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          if (((ge) this).field_Q == 9) {
                            L15: {
                              if (((ge) this).field_yb == 0) {
                                break L15;
                              } else {
                                ((ge) this).field_G = ((ge) this).field_G + (((ge) this).field_yb << 16);
                                break L15;
                              }
                            }
                            if (((ge) this).field_V != 5) {
                              break L8;
                            } else {
                              ((ge) this).field_A.field_m.a(-99, (ff) this);
                              ((ge) this).t(4);
                              break L8;
                            }
                          } else {
                            if (12 == ((ge) this).field_Q) {
                              ((ge) this).field_Bb = false;
                              ((ge) this).h((byte) 33);
                              if (((ge) this).field_A != null) {
                                L16: {
                                  if (((ge) this).field_A.field_b.a(((ge) this).e((byte) -112), true, true, ((ge) this).g(1829947600))) {
                                    stackOut_154_0 = 0;
                                    stackIn_155_0 = stackOut_154_0;
                                    break L16;
                                  } else {
                                    stackOut_153_0 = 1;
                                    stackIn_155_0 = stackOut_153_0;
                                    break L16;
                                  }
                                }
                                L17: {
                                  var2 = stackIn_155_0;
                                  if (var2 == 0) {
                                    break L17;
                                  } else {
                                    ((ge) this).field_E = ((ge) this).field_E - ((ge) this).field_W;
                                    ((ge) this).field_G = ((ge) this).field_G - ((ge) this).field_R;
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (var2 != 0) {
                                    break L18;
                                  } else {
                                    if (!((ge) this).k(2)) {
                                      break L8;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                this.u(81);
                                this.o((byte) 27);
                                break L8;
                              } else {
                                break L8;
                              }
                            } else {
                              if (((ge) this).field_Q != 13) {
                                L19: {
                                  if (((ge) this).field_Q == 14) {
                                    break L19;
                                  } else {
                                    if (26 == ((ge) this).field_Q) {
                                      break L19;
                                    } else {
                                      if (((ge) this).field_Q != 34) {
                                        if (15 == ((ge) this).field_Q) {
                                          if (4 != ((ge) this).field_V) {
                                            break L8;
                                          } else {
                                            L20: {
                                              ((ge) this).field_Bb = false;
                                              ((ge) this).field_L = ((ge) this).field_L - 1;
                                              ((ge) this).field_xb = 0;
                                              if (((ge) this).field_vb != null) {
                                                break L20;
                                              } else {
                                                ((ge) this).field_vb = new sa((ge) this, ((ge) this).e((byte) -112), -30 + ((ge) this).g(1829947600), ((ge) this).field_A.field_m.a((byte) 32, ((ge) this).field_gb, 750));
                                                ((ge) this).field_A.field_m.field_G.a((br) (Object) ((ge) this).field_vb, false);
                                                break L20;
                                              }
                                            }
                                            if (!((ge) this).field_vb.b(true)) {
                                              break L8;
                                            } else {
                                              ((ge) this).t(4);
                                              ((ge) this).a(4, (byte) -89);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (((ge) this).field_Q != 17) {
                                            L21: {
                                              if (((ge) this).field_Q == 19) {
                                                break L21;
                                              } else {
                                                if (((ge) this).field_Q != 24) {
                                                  if (((ge) this).field_Q == 27) {
                                                    L22: {
                                                      if (((ge) this).field_V != gg.field_j[27] / 2) {
                                                        break L22;
                                                      } else {
                                                        ((ge) this).field_Bb = false;
                                                        ((ge) this).field_ub = 0;
                                                        ((ge) this).field_xb = ((ge) this).field_A.field_m.a((byte) 32, ((ge) this).field_gb, 2250);
                                                        break L22;
                                                      }
                                                    }
                                                    if (~(-1 + gg.field_j[27]) == ~((ge) this).field_V) {
                                                      ((ge) this).a(4, (byte) -89);
                                                      break L8;
                                                    } else {
                                                      break L8;
                                                    }
                                                  } else {
                                                    if (((ge) this).field_Q != 31) {
                                                      if (((ge) this).field_Q == 28) {
                                                        L23: {
                                                          if (gg.field_j[28] / 2 == ((ge) this).field_V) {
                                                            ((ge) this).field_xb = 0;
                                                            ((ge) this).field_Bb = false;
                                                            ((ge) this).field_ub = ((ge) this).field_A.field_m.a((byte) 32, ((ge) this).field_gb, 2250);
                                                            break L23;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                        if (gg.field_j[28] + -1 == ((ge) this).field_V) {
                                                          ((ge) this).a(4, (byte) -89);
                                                          break L8;
                                                        } else {
                                                          break L8;
                                                        }
                                                      } else {
                                                        break L8;
                                                      }
                                                    } else {
                                                      if (~((ge) this).field_V != ~(gg.field_j[31] - 1)) {
                                                        break L8;
                                                      } else {
                                                        ((ge) this).a(4, (byte) -89);
                                                        break L8;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            if (((ge) this).field_V == 5) {
                                              ((ge) this).field_Bb = true;
                                              ((ge) this).a(4, (byte) -89);
                                              break L8;
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            L24: {
                                              if (((ge) this).field_V != 3) {
                                                break L24;
                                              } else {
                                                if (0 != ((ge) this).field_L) {
                                                  break L24;
                                                } else {
                                                  ((ge) this).field_A.a(((ge) this).e((byte) -112), -22930, ((ge) this).field_gb, ((ge) this).g(1829947600));
                                                  break L24;
                                                }
                                              }
                                            }
                                            if (((ge) this).field_V < 5) {
                                              break L8;
                                            } else {
                                              ((ge) this).m((byte) 85);
                                              ((ge) this).field_A.field_m.a(-113, (ff) this);
                                              break L8;
                                            }
                                          }
                                        }
                                      } else {
                                        if (((ge) this).field_V == 4) {
                                          ((ge) this).field_xb = 0;
                                          ((ge) this).field_L = ((ge) this).field_L - 1;
                                          ((ge) this).field_Bb = false;
                                          if (((ge) this).field_vb == null) {
                                            ((ge) this).field_vb = new sa((ge) this, ((ge) this).e((byte) -112), -30 + ((ge) this).g(1829947600), ((ge) this).field_A.field_m.a((byte) 32, ((ge) this).field_gb, 750));
                                            ((ge) this).field_A.field_m.field_G.a((br) (Object) ((ge) this).field_vb, false);
                                            break L8;
                                          } else {
                                            if (((ge) this).field_vb.b(true)) {
                                              ((ge) this).t(4);
                                              ((ge) this).a(4, (byte) -89);
                                              break L8;
                                            } else {
                                              L25: {
                                                if (((ge) this).field_R != 0) {
                                                  break L25;
                                                } else {
                                                  if (0 == ((ge) this).field_W) {
                                                    break L8;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                              L26: {
                                                L27: {
                                                  ((ge) this).h((byte) 66);
                                                  if (((ge) this).k(2)) {
                                                    break L27;
                                                  } else {
                                                    if (((ge) this).field_R != 0) {
                                                      break L26;
                                                    } else {
                                                      if (((ge) this).field_W != 0) {
                                                        break L26;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (((ge) this).field_Cb == null) {
                                                  break L26;
                                                } else {
                                                  if (!((ge) this).field_Cb.f(28113)) {
                                                    this.o((byte) 27);
                                                    ((ge) this).field_S = true;
                                                    break L26;
                                                  } else {
                                                    break L26;
                                                  }
                                                }
                                              }
                                              ((ge) this).field_vb.a(((ge) this).e((byte) -112), (byte) 121, -30 + ((ge) this).g(1829947600));
                                              break L8;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                }
                                ((ge) this).field_Bb = false;
                                if (4 == ((ge) this).field_V) {
                                  ((ge) this).a(4, (byte) -89);
                                  ((ge) this).field_nb = 2;
                                  var5 = new og(((ge) this).e((byte) -112), ((ge) this).g(1829947600), ((ge) this).field_D, ((ge) this).field_gb);
                                  ((ge) this).field_A.field_m.field_K.a((br) (Object) var5, false);
                                  var5.a(-9019, ((ge) this).field_A);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              } else {
                                L28: {
                                  if (((ge) this).field_Bb) {
                                    ((ge) this).field_V = 2;
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                if (((ge) this).field_V == 2) {
                                  ((ge) this).field_Bb = false;
                                  ((ge) this).field_V = 0;
                                  ((ge) this).field_A.a((byte) 65, (ge) this, ((ge) this).field_X);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L29: {
                          L30: {
                            ((ge) this).field_Bb = false;
                            if (((ge) this).field_V == 0) {
                              break L30;
                            } else {
                              if (((ge) this).field_V != 2) {
                                break L29;
                              } else {
                                break L30;
                              }
                            }
                          }
                          if (((ge) this).field_L != 0) {
                            break L29;
                          } else {
                            if (hp.a((byte) 63, g.field_a, 3) != 0) {
                              int discarded$9 = hp.a((byte) 124, g.field_a, 5);
                              break L29;
                            } else {
                              L31: {
                                if (((ge) this).field_tb == null) {
                                  break L31;
                                } else {
                                  if (!((ge) this).field_tb.k((byte) -7)) {
                                    int discarded$10 = hp.a((byte) -106, g.field_a, 3);
                                    break L29;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                              int discarded$11 = hp.a((byte) -111, g.field_a, 4);
                              break L29;
                            }
                          }
                        }
                        int fieldTemp$12 = ((ge) this).field_Ab - 1;
                        ((ge) this).field_Ab = ((ge) this).field_Ab - 1;
                        if (0 >= fieldTemp$12) {
                          ((ge) this).field_A.a(((ge) this).field_gb, (ge) this, -32422, ((ge) this).field_tb);
                          ((ge) this).field_tb.j(18);
                          ((ge) this).field_tb = null;
                          ((ge) this).a(4, (byte) -89);
                          ((ge) this).field_S = true;
                          if (((ge) this).field_wb == null) {
                            break L8;
                          } else {
                            ((ge) this).a(true, ((ge) this).field_A.field_b.b(((ge) this).e((byte) -112), ((ge) this).field_wb.field_h, ((ge) this).g(1829947600), ((ge) this).field_wb.field_g, 8760));
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    } else {
                      L32: {
                        if (!((ge) this).field_A.field_m.b((byte) -66, 61, ((ge) this).field_gb)) {
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                      L33: {
                        if (((ge) this).field_A.field_m.b((byte) -88, 54, ((ge) this).field_gb)) {
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                      L34: {
                        L35: {
                          if (((ge) this).field_tb == null) {
                            break L35;
                          } else {
                            if (((ge) this).field_tb.field_Z) {
                              break L35;
                            } else {
                              if (18 == ((ge) this).field_tb.field_Q) {
                                break L35;
                              } else {
                                if (21 == ((ge) this).field_tb.field_Q) {
                                  break L35;
                                } else {
                                  if (((ge) this).field_tb.field_Q == 20) {
                                    break L35;
                                  } else {
                                    int fieldTemp$13 = ((ge) this).field_fb;
                                    ((ge) this).field_fb = ((ge) this).field_fb + 1;
                                    if (fieldTemp$13 > 60) {
                                      break L35;
                                    } else {
                                      L36: {
                                        if (((ge) this).field_tb.field_Q == 1) {
                                          break L36;
                                        } else {
                                          if (((ge) this).field_tb.field_Q != 2) {
                                            break L34;
                                          } else {
                                            break L36;
                                          }
                                        }
                                      }
                                      this.q((byte) -98);
                                      break L34;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((ge) this).field_tb = null;
                        ((ge) this).a(4, (byte) -89);
                        this.u(-128);
                        this.o((byte) 27);
                        break L34;
                      }
                      ((ge) this).h((byte) 110);
                      this.n(-26310);
                      break L8;
                    }
                  } else {
                    L37: {
                      if (0 < ((ge) this).field_fb) {
                        ((ge) this).field_fb = ((ge) this).field_fb - 1;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    L38: {
                      L39: {
                        ((ge) this).h((byte) 55);
                        if (((ge) this).k(2)) {
                          break L39;
                        } else {
                          if (0 != ((ge) this).field_R) {
                            break L38;
                          } else {
                            if (((ge) this).field_W != 0) {
                              break L38;
                            } else {
                              break L39;
                            }
                          }
                        }
                      }
                      ((ge) this).a(4, (byte) -89);
                      break L38;
                    }
                    this.n(-26310);
                    this.n((byte) 33);
                    break L8;
                  }
                }
              } else {
                L40: {
                  if (((ge) this).field_fb <= 0) {
                    break L40;
                  } else {
                    ((ge) this).field_fb = ((ge) this).field_fb - 1;
                    break L40;
                  }
                }
                L41: {
                  L42: {
                    this.k((byte) 92);
                    ((ge) this).h((byte) 40);
                    if (((ge) this).k(2)) {
                      break L42;
                    } else {
                      if (0 != ((ge) this).field_R) {
                        break L41;
                      } else {
                        if (0 != ((ge) this).field_W) {
                          break L41;
                        } else {
                          break L42;
                        }
                      }
                    }
                  }
                  this.o((byte) 27);
                  break L41;
                }
                if (null != ((ge) this).field_A) {
                  this.n(-26310);
                  this.n((byte) 15);
                  break L8;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static void s(int param0) {
        hn[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        hn var3 = null;
        int var4 = 0;
        hn[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5 = ia.field_x;
            var1 = var5;
            var2 = 0;
            L1: while (true) {
              if (~var5.length >= ~var2) {
                L2: {
                  if (param0 == 9) {
                    break L2;
                  } else {
                    ge.s(101);
                    break L2;
                  }
                }
                break L0;
              } else {
                var3 = var5[var2];
                var3.a(false);
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1_ref, "ge.EC(" + param0 + 41);
        }
    }

    private final void u(int param0) {
        ((ge) this).field_Cb = ((ge) this).field_wb != null ? ((ge) this).field_A.field_b.b(((ge) this).e((byte) -112), ((ge) this).field_wb.field_h, ((ge) this).g(1829947600), ((ge) this).field_wb.field_g, 8760) : null;
        int var2 = 82 / ((-11 - param0) / 51);
    }

    private final void q(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var2 = ((ge) this).field_tb.e((byte) -112);
          var3 = ((ge) this).field_tb.g(1829947600);
          var4 = -var2 + ((ge) this).e((byte) -112);
          var5 = -var3 + ((ge) this).g(1829947600);
          var6 = 6400;
          if (((ge) this).field_A.field_m.b((byte) -101, 61, ((ge) this).field_gb)) {
            var6 = var6 * 3;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!((ge) this).field_A.field_m.b((byte) -109, 54, ((ge) this).field_gb)) {
            break L1;
          } else {
            var6 = var6 * 5;
            break L1;
          }
        }
        L2: {
          L3: {
            if (var5 * var5 + var4 * var4 > var6 + 10) {
              break L3;
            } else {
              if (((ge) this).field_A.field_b.a(var3, -110, var2, ((ge) this).g(1829947600), ((ge) this).e((byte) -112)) == -1) {
                break L3;
              } else {
                L4: {
                  ((ge) this).field_N = var2;
                  ((ge) this).field_ab = var3;
                  var7 = 57344 * ((ge) this).field_M;
                  var8 = var7 / 2;
                  if (!((ge) this).field_A.field_m.b((byte) -68, 61, ((ge) this).field_gb)) {
                    break L4;
                  } else {
                    var7 = var7 + var8;
                    break L4;
                  }
                }
                L5: {
                  if (!((ge) this).field_A.field_m.b((byte) -102, 54, ((ge) this).field_gb)) {
                    break L5;
                  } else {
                    var7 = var7 + var8;
                    break L5;
                  }
                }
                ((ge) this).c(93, var7);
                break L2;
              }
            }
          }
          this.u(72);
          this.o((byte) 27);
          break L2;
        }
        if (param0 <= -42) {
          ((ge) this).field_S = true;
          return;
        } else {
          return;
        }
    }

    final void e(int param0, int param1) {
        ((ge) this).a(31, (byte) -89);
        int var3 = 100 % ((30 - param0) / 32);
        ((ge) this).field_hb = ((ge) this).field_hb | 1 << ((ge) this).field_gb;
        ((ge) this).field_S = true;
        ((ge) this).field_gb = param1;
    }

    final void e(boolean param0) {
        if (!(!this.c(true))) {
            return;
        }
        if (param0) {
            return;
        }
        ((ge) this).a(29, (byte) -89);
        ((ge) this).field_S = true;
    }

    final static void a(String param0, byte param1) {
        if (param1 < 124) {
            return;
        }
        try {
            rb.field_a = param0;
            fb.a(12, 74);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ge.SB(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((ge) this).field_Q != 9) {
          L0: {
            if (((ge) this).field_Q != 17) {
              break L0;
            } else {
              if (param0 != 9) {
                return;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (34 != ((ge) this).field_Q) {
              break L1;
            } else {
              if (9 == param0) {
                break L1;
              } else {
                if (21 != param0) {
                  return;
                } else {
                  break L1;
                }
              }
            }
          }
          L2: {
            if (((ge) this).field_vb == null) {
              break L2;
            } else {
              L3: {
                if (param0 == 9) {
                  break L3;
                } else {
                  if (param0 != 21) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((ge) this).t(4);
              break L2;
            }
          }
          L4: {
            super.a(param0, param1);
            if (((ge) this).field_Q != 4) {
              if (((ge) this).field_Q == 7) {
                ((ge) this).field_eb = true;
                break L4;
              } else {
                if (9 != ((ge) this).field_Q) {
                  L5: {
                    if (((ge) this).field_Q == 27) {
                      break L5;
                    } else {
                      if (28 == ((ge) this).field_Q) {
                        break L5;
                      } else {
                        if (((ge) this).field_Q == 19) {
                          break L5;
                        } else {
                          if (((ge) this).field_Q == 24) {
                            break L5;
                          } else {
                            if (((ge) this).field_Q == 29) {
                              ((ge) this).field_lb = true;
                              break L4;
                            } else {
                              if (((ge) this).field_Q != 33) {
                                if (((ge) this).field_Q != 8) {
                                  break L4;
                                } else {
                                  if (((ge) this).field_A != null) {
                                    break L4;
                                  } else {
                                    if (((ge) this).field_tb == null) {
                                      break L4;
                                    } else {
                                      ((ge) this).field_tb.j((byte) 118);
                                      break L4;
                                    }
                                  }
                                }
                              } else {
                                ((ge) this).field_wb = null;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  ((ge) this).field_ub = 0;
                  ((ge) this).field_Bb = false;
                  ((ge) this).field_xb = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
            } else {
              ((ge) this).field_W = 0;
              ((ge) this).field_R = 0;
              break L4;
            }
          }
          return;
        } else {
          return;
        }
    }

    ge(int param0, int param1, int param2) {
        super(param0, param1, param2, 28672);
        ((ge) this).field_lb = false;
        ((ge) this).field_Ab = 0;
        ((ge) this).field_Bb = false;
        ((ge) this).field_yb = 0;
        ((ge) this).field_hb = 0;
        ((ge) this).field_tb = null;
        ((ge) this).field_ob = 0;
        ((ge) this).field_kb = 0;
        ((ge) this).field_vb = null;
        ((ge) this).field_W = 0;
        ((ge) this).field_R = 0;
        ((ge) this).field_mb = hp.a((byte) -103, g.field_a, 10);
        ((ge) this).field_nb = hp.a((byte) -80, g.field_a, 120);
    }

    final void m(int param0) {
        if (param0 != -6556) {
            ((ge) this).h(-45);
        }
        if (!(!this.c(true))) {
            return;
        }
        ((ge) this).a(27, (byte) -89);
        ((ge) this).field_S = true;
    }

    private final void n(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        c var7 = null;
        ek var8 = null;
        ge var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((ge) this).field_Bb) {
          return;
        } else {
          int fieldTemp$2 = ((ge) this).field_mb;
          ((ge) this).field_mb = ((ge) this).field_mb + 1;
          if (10 > fieldTemp$2) {
            return;
          } else {
            ((ge) this).field_mb = 0;
            if (0 >= ((ge) this).field_Ab) {
              var5 = ((ge) this).field_C - 1;
              L0: while (true) {
                if (((ge) this).field_C - -1 < var5) {
                  L1: {
                    if (param0 >= 4) {
                      break L1;
                    } else {
                      boolean discarded$3 = ((ge) this).q(-53);
                      break L1;
                    }
                  }
                  return;
                } else {
                  var6 = -1 + ((ge) this).field_B;
                  L2: while (true) {
                    if (~(((ge) this).field_B + 1) > ~var6) {
                      var5++;
                      continue L0;
                    } else {
                      L3: {
                        var7 = ((ge) this).field_A.a(true, var5, var6);
                        if (var7 == null) {
                          break L3;
                        } else {
                          var8 = (ek) (Object) var7.a(false);
                          L4: while (true) {
                            if (var8 == null) {
                              break L3;
                            } else {
                              L5: {
                                if (!(var8 instanceof ge)) {
                                  break L5;
                                } else {
                                  var9 = (ge) (Object) var8;
                                  if (var9.field_gb == var9.field_gb) {
                                    break L5;
                                  } else {
                                    if (var9.field_Bb) {
                                      break L5;
                                    } else {
                                      L6: {
                                        if (var9.field_Q == 5) {
                                          break L6;
                                        } else {
                                          if (var9.field_Q == 6) {
                                            break L6;
                                          } else {
                                            if (var9.field_Q == 4) {
                                              break L6;
                                            } else {
                                              var8 = (ek) (Object) var7.c(-1);
                                              continue L4;
                                            }
                                          }
                                        }
                                      }
                                      var2 = var9.e((byte) -112) - ((ge) this).e((byte) -112);
                                      var3 = var9.g(1829947600) - ((ge) this).g(1829947600);
                                      var4 = var3 * var3 + var2 * var2;
                                      if (var4 >= 1600) {
                                        break L5;
                                      } else {
                                        if (-1 == var9.field_A.field_b.a(var9.g(1829947600), -104, var9.e((byte) -112), ((ge) this).g(1829947600), ((ge) this).e((byte) -112))) {
                                          break L5;
                                        } else {
                                          L7: {
                                            ((ge) this).a(22, (byte) -89);
                                            ((ge) this).field_Ab = 70;
                                            if (!var9.field_Bb) {
                                              var9.a(22, (byte) -89);
                                              var9.field_Ab = 70;
                                              break L7;
                                            } else {
                                              break L7;
                                            }
                                          }
                                          L8: {
                                            var10 = var9.field_G - -(var2 << 15);
                                            var11 = (var3 << 15) + var9.field_E;
                                            if (var9.field_A.field_b.a(var11 >> 16, 126, var10 >> 16, var9.g(1829947600), var9.e((byte) -112)) != -1) {
                                              var9.field_G = var10;
                                              var9.field_E = var11;
                                              break L8;
                                            } else {
                                              break L8;
                                            }
                                          }
                                          L9: {
                                            var10 = -(var2 << 15) + var9.field_G;
                                            var11 = var9.field_E - (var3 << 15);
                                            if (var9.field_A.field_b.a(var11 >> 16, -72, var10 >> 16, ((ge) this).g(1829947600), ((ge) this).e((byte) -112)) == -1) {
                                              break L9;
                                            } else {
                                              ((ge) this).field_E = var11;
                                              ((ge) this).field_G = var10;
                                              break L9;
                                            }
                                          }
                                          var9.field_A.a(-89, var9, (ge) this);
                                          return;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var8 = (ek) (Object) var7.c(-1);
                              continue L4;
                            }
                          }
                        }
                      }
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final void j(byte param0) {
        int var2 = 0;
        L0: {
          if (7 != ((ge) this).field_Q) {
            L1: {
              if (((ge) this).field_Q == 5) {
                break L1;
              } else {
                if (((ge) this).field_Q != 6) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.u(83);
            this.o((byte) 27);
            ((ge) this).field_S = true;
            break L0;
          } else {
            this.q((byte) -110);
            break L0;
          }
        }
        var2 = 9 % ((param0 - 3) / 53);
    }

    final void m(byte param0) {
        L0: {
          int fieldTemp$2 = ((ge) this).field_kb;
          ((ge) this).field_kb = ((ge) this).field_kb - 1;
          if (0 < fieldTemp$2) {
            break L0;
          } else {
            if (((ge) this).field_Q != 9) {
              L1: {
                if (((ge) this).field_Q != 8) {
                  break L1;
                } else {
                  if (null != ((ge) this).field_tb) {
                    ((ge) this).field_tb.q(-22882);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param0 >= 37) {
                  break L2;
                } else {
                  this.u(32);
                  break L2;
                }
              }
              L3: {
                if (((ge) this).field_Q != 17) {
                  ((ge) this).a(9, (byte) -89);
                  break L3;
                } else {
                  break L3;
                }
              }
              ((ge) this).field_S = true;
              ((ge) this).field_A.field_p[((ge) this).field_gb] = ((ge) this).field_A.field_p[((ge) this).field_gb] + 1;
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final void t(int param0) {
        if (!(null == ((ge) this).field_vb)) {
            ((ge) this).field_Q = 15;
            ((ge) this).field_vb.d(-108);
            ((ge) this).field_vb.a(true);
            ((ge) this).field_vb = null;
            ((ge) this).a(4, (byte) -89);
        }
        if (param0 != 4) {
            ((ge) this).field_Ab = 97;
        }
    }

    final boolean a(boolean param0, byte param1) {
        if (!(!this.c(true))) {
            return false;
        }
        ((ge) this).a(13, (byte) -89);
        if (param1 <= 3) {
            ((ge) this).field_tb = null;
        }
        ((ge) this).field_X = param0 ? true : false;
        ((ge) this).field_S = true;
        return true;
    }

    final void l(int param0) {
        if (this.c(true)) {
            return;
        }
        if (param0 != 34) {
            ge.s(47);
        }
        ((ge) this).a(28, (byte) -89);
        ((ge) this).field_S = true;
    }

    final void a(boolean param0, th param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 == null) {
                break L1;
              } else {
                if (param1.f(28113)) {
                  break L1;
                } else {
                  L2: {
                    ((ge) this).field_nb = 0;
                    ((ge) this).field_wb = (qk) (Object) param1.a((byte) 115);
                    ((ge) this).field_Cb = param1;
                    if (this.c(param0)) {
                      break L2;
                    } else {
                      this.o((byte) 27);
                      break L2;
                    }
                  }
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("ge.PC(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    private final void k(byte param0) {
    }

    private final void o(byte param0) {
        qk var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (null == ((ge) this).field_Cb) {
            break L0;
          } else {
            if (((ge) this).field_Cb.f(28113)) {
              break L0;
            } else {
              L1: {
                var2 = (qk) (Object) ((ge) this).field_Cb.g(77);
                ((ge) this).field_N = var2.field_g;
                ((ge) this).field_ab = var2.field_h;
                ((ge) this).a(5, (byte) -89);
                var3 = 28672 * ((ge) this).field_M;
                var4 = var3 / 2;
                if (!((ge) this).field_A.field_m.b((byte) -72, 49, ((ge) this).field_gb)) {
                  break L1;
                } else {
                  var3 = var3 + var4;
                  break L1;
                }
              }
              L2: {
                if (!((ge) this).field_A.field_m.b((byte) -101, 47, ((ge) this).field_gb)) {
                  break L2;
                } else {
                  var3 = var3 + var4;
                  break L2;
                }
              }
              ((ge) this).c(-97, var3);
              return;
            }
          }
        }
        ((ge) this).field_Cb = null;
        ((ge) this).field_wb = null;
        ((ge) this).a(4, (byte) -89);
    }

    private final void n(int param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        c var8 = null;
        ek var9 = null;
        lm var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((ge) this).field_xb <= 0) {
          int fieldTemp$1 = ((ge) this).field_mb;
          ((ge) this).field_mb = ((ge) this).field_mb + 1;
          if (fieldTemp$1 < 10) {
            return;
          } else {
            ((ge) this).field_mb = 0;
            var2 = null;
            var6 = ((ge) this).field_C - 1;
            L0: while (true) {
              if (((ge) this).field_C - -1 < var6) {
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    if (((ge) this).field_Q == 7) {
                      break L1;
                    } else {
                      if (((ge) this).field_fb != 0) {
                        break L1;
                      } else {
                        if (((ge) this).field_Bb) {
                          break L1;
                        } else {
                          if (((ge) this).field_Q != 33) {
                            L2: {
                              ((ge) this).field_N = ((lm) var2).e((byte) -112);
                              ((ge) this).field_ab = ((lm) var2).g(1829947600);
                              var6 = 57344 * ((ge) this).field_M;
                              var7 = var6 / 2;
                              if (((ge) this).field_A.field_m.b((byte) -77, 61, ((ge) this).field_gb)) {
                                var6 = var6 + var7;
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                            L3: {
                              if (!((ge) this).field_A.field_m.b((byte) -99, 54, ((ge) this).field_gb)) {
                                break L3;
                              } else {
                                var6 = var6 + var7;
                                break L3;
                              }
                            }
                            ((ge) this).c(-87, var6);
                            ((ge) this).a(7, (byte) -89);
                            ((ge) this).field_tb = (lm) var2;
                            ((ge) this).field_fb = 0;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                var7 = ((ge) this).field_B - 1;
                L4: while (true) {
                  if (1 + ((ge) this).field_B < var7) {
                    var6++;
                    continue L0;
                  } else {
                    L5: {
                      var8 = ((ge) this).field_A.a(true, var6, var7);
                      if (var8 != null) {
                        var9 = (ek) (Object) var8.a(false);
                        L6: while (true) {
                          if (var9 == null) {
                            break L5;
                          } else {
                            L7: {
                              if (!(var9 instanceof lm)) {
                                break L7;
                              } else {
                                var10 = (lm) (Object) var9;
                                if (var10.field_Q == 21) {
                                  break L7;
                                } else {
                                  if (var10.field_Q == 18) {
                                    break L7;
                                  } else {
                                    if (32 == var10.field_Q) {
                                      break L7;
                                    } else {
                                      if (var10.field_Q != 20) {
                                        L8: {
                                          var3 = var10.e((byte) -112) + -((ge) this).e((byte) -112);
                                          var4 = var10.g(1829947600) + -((ge) this).g(1829947600);
                                          var5 = var3 * var3 + var4 * var4;
                                          var11 = 6400;
                                          if (((ge) this).field_A.field_m.b((byte) -79, 61, ((ge) this).field_gb)) {
                                            var11 = var11 * 2;
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        }
                                        L9: {
                                          if (((ge) this).field_A.field_m.b((byte) -91, 54, ((ge) this).field_gb)) {
                                            var11 = var11 * 3;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                        if (~var11 >= ~var5) {
                                          break L7;
                                        } else {
                                          if (((ge) this).field_A.field_b.a(var10.g(1829947600), 111, var10.e((byte) -112), ((ge) this).g(1829947600), ((ge) this).e((byte) -112)) != -1) {
                                            if (400 <= var5) {
                                              L10: {
                                                if (var2 == null) {
                                                  break L10;
                                                } else {
                                                  if (0 == (var10.field_x + ((ge) this).field_x) % 2) {
                                                    break L10;
                                                  } else {
                                                    break L7;
                                                  }
                                                }
                                              }
                                              var2 = (Object) (Object) var10;
                                              break L7;
                                            } else {
                                              ((ge) this).field_tb = var10;
                                              var10.j((byte) 120);
                                              ((ge) this).a(8, (byte) -89);
                                              ((ge) this).field_Ab = 70;
                                              ((ge) this).field_A.a(var10, (ge) this, (var10.e((byte) -112) - -((ge) this).e((byte) -112)) / 2, (var10.g(1829947600) + ((ge) this).g(1829947600)) / 2, (byte) -63);
                                              return;
                                            }
                                          } else {
                                            var9 = (ek) (Object) var8.c(-1);
                                            continue L6;
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
                            var9 = (ek) (Object) var8.c(-1);
                            continue L6;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean d(byte param0, int param1) {
        if (param0 != 61) {
            ((ge) this).field_Db = -106;
        }
        return 0 != (((ge) this).field_hb & 1 << param1) ? true : false;
    }

    final void r(byte param0) {
        if (param0 >= -47) {
            return;
        }
        ((ge) this).field_Db = 0;
    }

    final boolean p(byte param0) {
        if (param0 <= 12) {
            ((ge) this).j((byte) -27);
        }
        return ((ge) this).field_ub > 0 ? true : false;
    }

    final void d(int param0, int param1) {
        if (((ge) this).field_Q == 8) {
            return;
        }
        ((ge) this).a(23, (byte) -89);
        ((ge) this).field_S = true;
        ((ge) this).field_Db = param0;
        if (param1 > -93) {
            boolean discarded$0 = ((ge) this).o(49);
        }
    }

    final boolean q(int param0) {
        if (param0 >= -126) {
            return false;
        }
        return ((ge) this).field_jb;
    }

    ge(int param0, int param1, boolean param2) {
        this(param0, param1, param2 ? 0 : 1);
    }

    final static boolean p(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -59) {
            break L0;
          } else {
            field_zb = -82;
            break L0;
          }
        }
        L1: {
          L2: {
            if (a.field_b < 10) {
              break L2;
            } else {
              if (fn.field_i < 13) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean o(int param0) {
        int var2 = 35 % ((param0 - 75) / 44);
        return ((ge) this).field_xb > 0 ? true : false;
    }

    final void f(boolean param0) {
        L0: {
          L1: {
            if (0 < ((ge) this).field_xb) {
              break L1;
            } else {
              if (0 < ((ge) this).field_ub) {
                break L1;
              } else {
                if (((ge) this).field_Bb) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          ((ge) this).field_Bb = false;
          ((ge) this).field_xb = 0;
          ((ge) this).field_S = true;
          ((ge) this).field_ub = 0;
          break L0;
        }
        L2: {
          if (param0) {
            break L2;
          } else {
            ((ge) this).d(-44, -117);
            break L2;
          }
        }
    }

    private final boolean c(boolean param0) {
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (8 == ((ge) this).field_Q) {
                break L1;
              } else {
                if (((ge) this).field_Q == 9) {
                  break L1;
                } else {
                  if (((ge) this).field_Q == 23) {
                    break L1;
                  } else {
                    if (((ge) this).field_Q == 12) {
                      break L1;
                    } else {
                      if (7 == ((ge) this).field_Q) {
                        break L1;
                      } else {
                        if (((ge) this).field_Q == 13) {
                          break L1;
                        } else {
                          if (((ge) this).field_Q == 14) {
                            break L1;
                          } else {
                            if (26 == ((ge) this).field_Q) {
                              break L1;
                            } else {
                              if (((ge) this).field_Q == 15) {
                                break L1;
                              } else {
                                if (17 == ((ge) this).field_Q) {
                                  break L1;
                                } else {
                                  if (((ge) this).field_Q == 28) {
                                    break L1;
                                  } else {
                                    if (((ge) this).field_Q == 24) {
                                      break L1;
                                    } else {
                                      if (((ge) this).field_Q != 19) {
                                        stackOut_17_0 = 0;
                                        stackIn_18_0 = stackOut_17_0;
                                        break L0;
                                      } else {
                                        break L1;
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
              }
            }
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L0;
          }
          return stackIn_18_0 != 0;
        } else {
          return false;
        }
    }

    final boolean d(boolean param0) {
        if (!param0) {
            ((ge) this).field_gb = -9;
        }
        return ((ge) this).field_D == 0 ? true : false;
    }

    final boolean l(byte param0) {
        if (this.c(true)) {
            return false;
        }
        ((ge) this).a(17, (byte) -89);
        if (param0 != -52) {
            this.u(78);
        }
        ((ge) this).field_S = true;
        return true;
    }

    final boolean b(boolean param0, byte param1) {
        if (!(!this.c(true))) {
            return false;
        }
        if (param1 > -100) {
            ((ge) this).field_mb = -62;
        }
        ((ge) this).a(param0 ? 26 : 14, (byte) -89);
        ((ge) this).field_S = true;
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = "Game options changed (<%0>)";
        field_qb = "Invite <%0> to this game";
        field_ib = "A cloud of corrosive acid that will stop living and dead alike.";
    }
}
