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
        this.field_N = param2;
        this.field_ab = param0;
        this.c(85, this.field_M * 14336);
        if (param1 != 750) {
            this.field_wb = (qk) null;
        }
        this.a(6, (byte) -89);
    }

    final boolean a(int param0, boolean param1) {
        if (!(!this.c(true))) {
            return false;
        }
        this.a(!param1 ? 15 : 34, (byte) -89);
        this.field_S = true;
        if (param0 != 47) {
            field_pb = (String) null;
            return true;
        }
        return true;
    }

    public static void r(int param0) {
        field_qb = null;
        field_pb = null;
        if (param0 >= -7) {
            return;
        }
        field_ib = null;
    }

    final void h(int param0) {
        int fieldTemp$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
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
        int stackIn_164_0 = 0;
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
        int stackOut_163_0 = 0;
        int stackOut_162_0 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          super.h(77);
          this.field_Ab = this.field_Ab - 1;
          this.b((byte) 123, this.field_Q);
          if (-34 == (this.field_Q ^ -1)) {
            break L0;
          } else {
            if (-30 != (this.field_Q ^ -1)) {
              this.field_ob = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (this.field_ub > 0) {
            this.field_ub = this.field_ub - 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 > 30) {
            break L2;
          } else {
            this.field_tb = (lm) null;
            break L2;
          }
        }
        L3: {
          if (this.field_xb > 0) {
            this.field_xb = this.field_xb - 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (29 != this.field_Q) {
            this.field_lb = false;
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
              if (!this.field_Bb) {
                break L7;
              } else {
                stackOut_16_0 = this;
                stackIn_19_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (-34 == (this.field_Q ^ -1)) {
                  break L7;
                } else {
                  stackOut_17_0 = this;
                  stackIn_24_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (29 != this.field_Q) {
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
            if (23 == this.field_Q) {
              break L6;
            } else {
              stackOut_20_0 = this;
              stackIn_24_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if (this.o(126)) {
                break L6;
              } else {
                stackOut_21_0 = this;
                stackIn_24_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (-10 == (this.field_Q ^ -1)) {
                  break L6;
                } else {
                  stackOut_22_0 = this;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (21 == this.field_Q) {
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
          L9: {
            ((ge) (this)).field_jb = stackIn_25_1 != 0;
            if ((this.field_Q ^ -1) == -5) {
              break L9;
            } else {
              L10: {
                if (-24 == (this.field_Q ^ -1)) {
                  break L10;
                } else {
                  L11: {
                    if (5 != this.field_Q) {
                      break L11;
                    } else {
                      L12: {
                        if ((this.field_fb ^ -1) >= -1) {
                          break L12;
                        } else {
                          this.field_fb = this.field_fb - 1;
                          break L12;
                        }
                      }
                      L13: {
                        L14: {
                          this.k((byte) 92);
                          this.h((byte) 40);
                          if (this.k(2)) {
                            break L14;
                          } else {
                            if (0 != this.field_R) {
                              break L13;
                            } else {
                              if (0 != this.field_W) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        this.o((byte) 27);
                        break L13;
                      }
                      if (null != this.field_A) {
                        this.n(-26310);
                        this.n((byte) 15);
                        if (var4 == 0) {
                          break L8;
                        } else {
                          break L11;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  L15: {
                    if (-34 == (this.field_Q ^ -1)) {
                      break L15;
                    } else {
                      L16: {
                        if (this.field_Q != 6) {
                          break L16;
                        } else {
                          L17: {
                            if (0 < this.field_fb) {
                              this.field_fb = this.field_fb - 1;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            L19: {
                              this.h((byte) 55);
                              if (this.k(2)) {
                                break L19;
                              } else {
                                if (0 != this.field_R) {
                                  break L18;
                                } else {
                                  if ((this.field_W ^ -1) != -1) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            this.a(4, (byte) -89);
                            break L18;
                          }
                          this.n(-26310);
                          this.n((byte) 33);
                          if (var4 == 0) {
                            break L8;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L20: {
                        if ((this.field_Q ^ -1) != -8) {
                          break L20;
                        } else {
                          L21: {
                            if (!this.field_A.field_m.b((byte) -66, 61, this.field_gb)) {
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L22: {
                            if (this.field_A.field_m.b((byte) -88, 54, this.field_gb)) {
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          L23: {
                            L24: {
                              if (this.field_tb == null) {
                                break L24;
                              } else {
                                if (this.field_tb.field_Z) {
                                  break L24;
                                } else {
                                  if (18 == this.field_tb.field_Q) {
                                    break L24;
                                  } else {
                                    if (21 == this.field_tb.field_Q) {
                                      break L24;
                                    } else {
                                      if ((this.field_tb.field_Q ^ -1) == -21) {
                                        break L24;
                                      } else {
                                        fieldTemp$7 = this.field_fb;
                                        this.field_fb = this.field_fb + 1;
                                        if ((fieldTemp$7 ^ -1) < -61) {
                                          break L24;
                                        } else {
                                          L25: {
                                            if (this.field_tb.field_Q == 1) {
                                              break L25;
                                            } else {
                                              if (this.field_tb.field_Q != 2) {
                                                break L23;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                          this.q((byte) -98);
                                          if (var4 == 0) {
                                            break L23;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            this.field_tb = null;
                            this.a(4, (byte) -89);
                            this.u(-128);
                            this.o((byte) 27);
                            break L23;
                          }
                          this.h((byte) 110);
                          this.n(-26310);
                          if (var4 == 0) {
                            break L8;
                          } else {
                            break L20;
                          }
                        }
                      }
                      L26: {
                        if (-9 != (this.field_Q ^ -1)) {
                          break L26;
                        } else {
                          L27: {
                            L28: {
                              this.field_Bb = false;
                              if (-1 == (this.field_V ^ -1)) {
                                break L28;
                              } else {
                                if ((this.field_V ^ -1) != -3) {
                                  break L27;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            if (-1 != (this.field_L ^ -1)) {
                              break L27;
                            } else {
                              L29: {
                                if (hp.a((byte) 63, g.field_a, 3) != 0) {
                                  break L29;
                                } else {
                                  L30: {
                                    L31: {
                                      if (this.field_tb == null) {
                                        break L31;
                                      } else {
                                        if (!this.field_tb.k((byte) -7)) {
                                          break L30;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                    discarded$8 = hp.a((byte) -111, g.field_a, 4);
                                    if (var4 == 0) {
                                      break L27;
                                    } else {
                                      break L30;
                                    }
                                  }
                                  discarded$9 = hp.a((byte) -106, g.field_a, 3);
                                  if (var4 == 0) {
                                    break L27;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                              discarded$10 = hp.a((byte) 124, g.field_a, 5);
                              break L27;
                            }
                          }
                          fieldTemp$11 = this.field_Ab - 1;
                          this.field_Ab = this.field_Ab - 1;
                          if (0 >= fieldTemp$11) {
                            this.field_A.a(this.field_gb, (ge) (this), -32422, this.field_tb);
                            this.field_tb.j(18);
                            this.field_tb = null;
                            this.a(4, (byte) -89);
                            this.field_S = true;
                            if (this.field_wb == null) {
                              break L8;
                            } else {
                              this.a(true, this.field_A.field_b.b(this.e((byte) -112), this.field_wb.field_h, this.g(1829947600), this.field_wb.field_g, 8760));
                              if (var4 == 0) {
                                break L8;
                              } else {
                                break L26;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      L32: {
                        if ((this.field_Q ^ -1) == -23) {
                          break L32;
                        } else {
                          L33: {
                            if ((this.field_Q ^ -1) == -10) {
                              break L33;
                            } else {
                              L34: {
                                if (12 == this.field_Q) {
                                  break L34;
                                } else {
                                  L35: {
                                    if (this.field_Q != 13) {
                                      break L35;
                                    } else {
                                      L36: {
                                        if (this.field_Bb) {
                                          this.field_V = 2;
                                          break L36;
                                        } else {
                                          break L36;
                                        }
                                      }
                                      if (-3 == (this.field_V ^ -1)) {
                                        this.field_Bb = false;
                                        this.field_V = 0;
                                        this.field_A.a((byte) 65, (ge) (this), this.field_X);
                                        if (var4 == 0) {
                                          break L8;
                                        } else {
                                          break L35;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L37: {
                                    if (-15 == (this.field_Q ^ -1)) {
                                      break L37;
                                    } else {
                                      if (26 == this.field_Q) {
                                        break L37;
                                      } else {
                                        L38: {
                                          if (this.field_Q != 34) {
                                            break L38;
                                          } else {
                                            if (this.field_V == 4) {
                                              L39: {
                                                this.field_xb = 0;
                                                this.field_L = this.field_L - 1;
                                                this.field_Bb = false;
                                                if (this.field_vb == null) {
                                                  break L39;
                                                } else {
                                                  L40: {
                                                    if (this.field_vb.b(true)) {
                                                      break L40;
                                                    } else {
                                                      L41: {
                                                        if (this.field_R != 0) {
                                                          break L41;
                                                        } else {
                                                          if (0 == this.field_W) {
                                                            break L8;
                                                          } else {
                                                            break L41;
                                                          }
                                                        }
                                                      }
                                                      L42: {
                                                        L43: {
                                                          this.h((byte) 66);
                                                          if (this.k(2)) {
                                                            break L43;
                                                          } else {
                                                            if ((this.field_R ^ -1) != -1) {
                                                              break L42;
                                                            } else {
                                                              if ((this.field_W ^ -1) != -1) {
                                                                break L42;
                                                              } else {
                                                                break L43;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        if (this.field_Cb == null) {
                                                          break L42;
                                                        } else {
                                                          if (!this.field_Cb.f(28113)) {
                                                            this.o((byte) 27);
                                                            this.field_S = true;
                                                            break L42;
                                                          } else {
                                                            break L42;
                                                          }
                                                        }
                                                      }
                                                      this.field_vb.a(this.e((byte) -112), (byte) 121, -30 + this.g(1829947600));
                                                      if (var4 == 0) {
                                                        break L8;
                                                      } else {
                                                        break L40;
                                                      }
                                                    }
                                                  }
                                                  this.t(4);
                                                  this.a(4, (byte) -89);
                                                  if (var4 == 0) {
                                                    break L8;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                              }
                                              this.field_vb = new sa((ge) (this), this.e((byte) -112), -30 + this.g(1829947600), this.field_A.field_m.a((byte) 32, this.field_gb, 750));
                                              this.field_A.field_m.field_G.a(this.field_vb, false);
                                              if (var4 == 0) {
                                                break L8;
                                              } else {
                                                break L38;
                                              }
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        L44: {
                                          if (15 == this.field_Q) {
                                            break L44;
                                          } else {
                                            L45: {
                                              if (-18 != (this.field_Q ^ -1)) {
                                                break L45;
                                              } else {
                                                L46: {
                                                  if ((this.field_V ^ -1) != -4) {
                                                    break L46;
                                                  } else {
                                                    if (0 != this.field_L) {
                                                      break L46;
                                                    } else {
                                                      this.field_A.a(this.e((byte) -112), -22930, this.field_gb, this.g(1829947600));
                                                      break L46;
                                                    }
                                                  }
                                                }
                                                if (-6 < (this.field_V ^ -1)) {
                                                  break L8;
                                                } else {
                                                  this.m((byte) 85);
                                                  this.field_A.field_m.a(-113, (ff) (this));
                                                  if (var4 == 0) {
                                                    break L8;
                                                  } else {
                                                    break L45;
                                                  }
                                                }
                                              }
                                            }
                                            L47: {
                                              L48: {
                                                if (this.field_Q == 19) {
                                                  break L48;
                                                } else {
                                                  if (-25 != (this.field_Q ^ -1)) {
                                                    break L47;
                                                  } else {
                                                    break L48;
                                                  }
                                                }
                                              }
                                              if (this.field_V == 5) {
                                                this.field_Bb = true;
                                                this.a(4, (byte) -89);
                                                if (var4 == 0) {
                                                  break L8;
                                                } else {
                                                  break L47;
                                                }
                                              } else {
                                                break L8;
                                              }
                                            }
                                            L49: {
                                              if (this.field_Q == 27) {
                                                break L49;
                                              } else {
                                                L50: {
                                                  if (-32 != (this.field_Q ^ -1)) {
                                                    break L50;
                                                  } else {
                                                    if ((this.field_V ^ -1) != (gg.field_j[31] - 1 ^ -1)) {
                                                      break L8;
                                                    } else {
                                                      this.a(4, (byte) -89);
                                                      if (var4 == 0) {
                                                        break L8;
                                                      } else {
                                                        break L50;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (-29 == (this.field_Q ^ -1)) {
                                                  L51: {
                                                    if (gg.field_j[28] / 2 == this.field_V) {
                                                      this.field_xb = 0;
                                                      this.field_Bb = false;
                                                      this.field_ub = this.field_A.field_m.a((byte) 32, this.field_gb, 2250);
                                                      break L51;
                                                    } else {
                                                      break L51;
                                                    }
                                                  }
                                                  if (gg.field_j[28] + -1 == this.field_V) {
                                                    this.a(4, (byte) -89);
                                                    if (var4 == 0) {
                                                      break L8;
                                                    } else {
                                                      break L49;
                                                    }
                                                  } else {
                                                    break L8;
                                                  }
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            L52: {
                                              if (this.field_V != gg.field_j[27] / 2) {
                                                break L52;
                                              } else {
                                                this.field_Bb = false;
                                                this.field_ub = 0;
                                                this.field_xb = this.field_A.field_m.a((byte) 32, this.field_gb, 2250);
                                                break L52;
                                              }
                                            }
                                            if ((-1 + gg.field_j[27] ^ -1) == (this.field_V ^ -1)) {
                                              this.a(4, (byte) -89);
                                              if (var4 == 0) {
                                                break L8;
                                              } else {
                                                break L44;
                                              }
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        if (4 != this.field_V) {
                                          break L8;
                                        } else {
                                          L53: {
                                            this.field_Bb = false;
                                            this.field_L = this.field_L - 1;
                                            this.field_xb = 0;
                                            if (this.field_vb != null) {
                                              break L53;
                                            } else {
                                              this.field_vb = new sa((ge) (this), this.e((byte) -112), -30 + this.g(1829947600), this.field_A.field_m.a((byte) 32, this.field_gb, 750));
                                              this.field_A.field_m.field_G.a(this.field_vb, false);
                                              break L53;
                                            }
                                          }
                                          if (!this.field_vb.b(true)) {
                                            break L8;
                                          } else {
                                            this.t(4);
                                            this.a(4, (byte) -89);
                                            if (var4 == 0) {
                                              break L8;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.field_Bb = false;
                                  if (4 == this.field_V) {
                                    this.a(4, (byte) -89);
                                    this.field_nb = 2;
                                    var5 = new og(this.e((byte) -112), this.g(1829947600), this.field_D, this.field_gb);
                                    this.field_A.field_m.field_K.a(var5, false);
                                    var5.a(-9019, this.field_A);
                                    if (var4 == 0) {
                                      break L8;
                                    } else {
                                      break L34;
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              this.field_Bb = false;
                              this.h((byte) 33);
                              if (this.field_A != null) {
                                L54: {
                                  if (this.field_A.field_b.a(this.e((byte) -112), true, true, this.g(1829947600))) {
                                    stackOut_163_0 = 0;
                                    stackIn_164_0 = stackOut_163_0;
                                    break L54;
                                  } else {
                                    stackOut_162_0 = 1;
                                    stackIn_164_0 = stackOut_162_0;
                                    break L54;
                                  }
                                }
                                L55: {
                                  var2 = stackIn_164_0;
                                  if (var2 == 0) {
                                    break L55;
                                  } else {
                                    this.field_E = this.field_E - this.field_W;
                                    this.field_G = this.field_G - this.field_R;
                                    break L55;
                                  }
                                }
                                L56: {
                                  L57: {
                                    if (var2 != 0) {
                                      break L57;
                                    } else {
                                      if (!this.k(2)) {
                                        break L56;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                  this.u(81);
                                  this.o((byte) 27);
                                  break L56;
                                }
                                if (var4 == 0) {
                                  break L8;
                                } else {
                                  break L33;
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                          L58: {
                            if ((this.field_yb ^ -1) == -1) {
                              break L58;
                            } else {
                              this.field_G = this.field_G + (this.field_yb << 2062764560);
                              break L58;
                            }
                          }
                          if ((this.field_V ^ -1) != -6) {
                            break L8;
                          } else {
                            this.field_A.field_m.a(-99, (ff) (this));
                            this.t(4);
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L32;
                            }
                          }
                        }
                      }
                      fieldTemp$12 = this.field_Ab - 1;
                      this.field_Ab = this.field_Ab - 1;
                      if (-1 <= (fieldTemp$12 ^ -1)) {
                        this.field_Ab = 35;
                        this.field_S = true;
                        this.a(4, (byte) -89);
                        this.u(92);
                        this.o((byte) 27);
                        if (var4 == 0) {
                          break L8;
                        } else {
                          break L15;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  L59: {
                    this.field_ob = this.field_ob + 1;
                    if (-1 != (this.field_ob ^ -1)) {
                      break L59;
                    } else {
                      this.field_E = this.field_rb;
                      this.field_G = this.field_sb;
                      if (var4 == 0) {
                        break L8;
                      } else {
                        break L59;
                      }
                    }
                  }
                  if (100 >= this.field_ob) {
                    break L8;
                  } else {
                    this.a(4, (byte) -89);
                    if (var4 == 0) {
                      break L8;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              fieldTemp$13 = this.field_Db - 1;
              this.field_Db = this.field_Db - 1;
              if (-1 <= (fieldTemp$13 ^ -1)) {
                this.a(4, (byte) -89);
                this.field_S = true;
                if (var4 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              } else {
                break L8;
              }
            }
          }
          L60: {
            if (-1 <= (this.field_nb ^ -1)) {
              break L60;
            } else {
              this.field_nb = this.field_nb - 1;
              break L60;
            }
          }
          L61: {
            if (!this.field_Bb) {
              break L61;
            } else {
              if ((this.field_V ^ -1) <= -3) {
                break L61;
              } else {
                this.field_L = this.field_L + 3;
                break L61;
              }
            }
          }
          L62: {
            if (0 >= this.field_fb) {
              break L62;
            } else {
              this.field_fb = this.field_fb - 1;
              break L62;
            }
          }
          L63: {
            L64: {
              L65: {
                if (this.field_nb == 1) {
                  break L65;
                } else {
                  if (this.field_M <= 2) {
                    break L64;
                  } else {
                    if (this.field_Bb) {
                      break L64;
                    } else {
                      break L65;
                    }
                  }
                }
              }
              L66: {
                L67: {
                  var2 = -24 + this.e((byte) -112) + hp.a((byte) 22, g.field_a, 48);
                  var3 = -24 + (this.g(1829947600) - -hp.a((byte) -66, g.field_a, 48));
                  if (!this.field_A.field_b.a(var2, true, true, var3)) {
                    break L67;
                  } else {
                    this.a(var3, 750, var2);
                    if (var4 == 0) {
                      break L66;
                    } else {
                      break L67;
                    }
                  }
                }
                this.field_nb = this.field_nb + 1;
                break L66;
              }
              if (var4 == 0) {
                break L63;
              } else {
                break L64;
              }
            }
            if (-1 != (this.field_nb ^ -1)) {
              break L63;
            } else {
              this.field_nb = hp.a((byte) 114, g.field_a, 60) + 60;
              if (this.field_A.field_m.b((byte) -98, 55, this.field_gb)) {
                this.field_nb = 0;
                break L63;
              } else {
                break L63;
              }
            }
          }
          this.n(-26310);
          this.n((byte) 106);
          break L8;
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
              L2: {
                L3: {
                  L4: {
                    if ((var5.length ^ -1) >= (var2 ^ -1)) {
                      break L4;
                    } else {
                      var3 = var5[var2];
                      var3.a(false);
                      var2++;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 == 9) {
                    break L3;
                  } else {
                    ge.s(101);
                    break L2;
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "ge.EC(" + param0 + ')');
        }
    }

    private final void u(int param0) {
        this.field_Cb = this.field_wb != null ? this.field_A.field_b.b(this.e((byte) -112), this.field_wb.field_h, this.g(1829947600), this.field_wb.field_g, 8760) : null;
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
          var2 = this.field_tb.e((byte) -112);
          var3 = this.field_tb.g(1829947600);
          var4 = -var2 + this.e((byte) -112);
          var5 = -var3 + this.g(1829947600);
          var6 = 6400;
          if (this.field_A.field_m.b((byte) -101, 61, this.field_gb)) {
            var6 = var6 * 3;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!this.field_A.field_m.b((byte) -109, 54, this.field_gb)) {
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
              if ((this.field_A.field_b.a(var3, -110, var2, this.g(1829947600), this.e((byte) -112)) ^ -1) == 0) {
                break L3;
              } else {
                L4: {
                  this.field_N = var2;
                  this.field_ab = var3;
                  var7 = 57344 * this.field_M;
                  var8 = var7 / 2;
                  if (!this.field_A.field_m.b((byte) -68, 61, this.field_gb)) {
                    break L4;
                  } else {
                    var7 = var7 + var8;
                    break L4;
                  }
                }
                L5: {
                  if (!this.field_A.field_m.b((byte) -102, 54, this.field_gb)) {
                    break L5;
                  } else {
                    var7 = var7 + var8;
                    break L5;
                  }
                }
                this.c(93, var7);
                if (!ZombieDawnMulti.field_E) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
          }
          this.u(72);
          this.o((byte) 27);
          break L2;
        }
        if (param0 <= -42) {
          this.field_S = true;
          return;
        } else {
          return;
        }
    }

    final void e(int param0, int param1) {
        this.a(31, (byte) -89);
        int var3 = 100 % ((30 - param0) / 32);
        this.field_hb = this.field_hb | 1 << this.field_gb;
        this.field_S = true;
        this.field_gb = param1;
    }

    final void e(boolean param0) {
        if (!(!this.c(true))) {
            return;
        }
        if (param0) {
            return;
        }
        this.a(29, (byte) -89);
        this.field_S = true;
    }

    final static void a(String param0, byte param1) {
        if (param1 < 124) {
            return;
        }
        try {
            rb.field_a = param0;
            fb.a(12, 74);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ge.SB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if ((this.field_Q ^ -1) != -10) {
          L0: {
            if ((this.field_Q ^ -1) != -18) {
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
            if (34 != this.field_Q) {
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
            if (this.field_vb == null) {
              break L2;
            } else {
              L3: {
                if ((param0 ^ -1) == -10) {
                  break L3;
                } else {
                  if ((param0 ^ -1) != -22) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.t(4);
              break L2;
            }
          }
          L4: {
            L5: {
              super.a(param0, param1);
              if (this.field_Q != 4) {
                break L5;
              } else {
                this.field_W = 0;
                this.field_R = 0;
                if (var4 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (this.field_Q == 7) {
                break L6;
              } else {
                if (9 != this.field_Q) {
                  L7: {
                    if (this.field_Q == 27) {
                      break L7;
                    } else {
                      if (28 == this.field_Q) {
                        break L7;
                      } else {
                        if ((this.field_Q ^ -1) == -20) {
                          break L7;
                        } else {
                          if (-25 == (this.field_Q ^ -1)) {
                            break L7;
                          } else {
                            L8: {
                              if (this.field_Q == 29) {
                                break L8;
                              } else {
                                L9: {
                                  if ((this.field_Q ^ -1) != -34) {
                                    break L9;
                                  } else {
                                    this.field_wb = null;
                                    if (var4 == 0) {
                                      break L4;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (-9 != (this.field_Q ^ -1)) {
                                  break L4;
                                } else {
                                  if (this.field_A != null) {
                                    break L4;
                                  } else {
                                    if (this.field_tb == null) {
                                      break L4;
                                    } else {
                                      this.field_tb.j((byte) 118);
                                      if (var4 == 0) {
                                        break L4;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            this.field_lb = true;
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  this.field_ub = 0;
                  this.field_Bb = false;
                  this.field_xb = 0;
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L6;
                  }
                } else {
                  break L4;
                }
              }
            }
            this.field_eb = true;
            break L4;
          }
          return;
        } else {
          return;
        }
    }

    ge(int param0, int param1, int param2) {
        super(param0, param1, param2, 28672);
        this.field_lb = false;
        this.field_Ab = 0;
        this.field_Bb = false;
        this.field_yb = 0;
        this.field_hb = 0;
        this.field_tb = null;
        this.field_ob = 0;
        this.field_kb = 0;
        this.field_vb = null;
        this.field_W = 0;
        this.field_R = 0;
        this.field_mb = hp.a((byte) -103, g.field_a, 10);
        this.field_nb = hp.a((byte) -80, g.field_a, 120);
    }

    final void m(int param0) {
        if (param0 != -6556) {
            this.h(-45);
        }
        if (!(!this.c(true))) {
            return;
        }
        this.a(27, (byte) -89);
        this.field_S = true;
    }

    private final void n(byte param0) {
        int fieldTemp$2 = 0;
        boolean discarded$3 = false;
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
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_42_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_18_0 = false;
        byte stackOut_41_0 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_Bb) {
          return;
        } else {
          L0: {
            fieldTemp$2 = this.field_mb;
            this.field_mb = this.field_mb + 1;
            if (10 > fieldTemp$2) {
              break L0;
            } else {
              this.field_mb = 0;
              if (var12 == 0) {
                if (0 >= this.field_Ab) {
                  var5 = this.field_C - 1;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (this.field_C - -1 < var5) {
                          break L3;
                        } else {
                          stackOut_10_0 = -1 + this.field_B;
                          stackIn_42_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var12 != 0) {
                            break L2;
                          } else {
                            var6 = stackIn_11_0;
                            L4: while (true) {
                              stackOut_12_0 = this.field_B + 1 ^ -1;
                              stackIn_13_0 = stackOut_12_0;
                              L5: while (true) {
                                L6: {
                                  L7: {
                                    if (stackIn_13_0 > (var6 ^ -1)) {
                                      break L7;
                                    } else {
                                      var7 = this.field_A.a(true, var5, var6);
                                      if (var12 != 0) {
                                        break L6;
                                      } else {
                                        L8: {
                                          if (var7 == null) {
                                            break L8;
                                          } else {
                                            var8 = (ek) ((Object) var7.a(false));
                                            L9: while (true) {
                                              if (var8 == null) {
                                                break L8;
                                              } else {
                                                stackOut_18_0 = var8 instanceof ge;
                                                stackIn_13_0 = stackOut_18_0 ? 1 : 0;
                                                stackIn_19_0 = stackOut_18_0;
                                                if (var12 != 0) {
                                                  continue L5;
                                                } else {
                                                  L10: {
                                                    if (!stackIn_19_0) {
                                                      break L10;
                                                    } else {
                                                      var9 = (ge) ((Object) var8);
                                                      if (var9.field_gb == this.field_gb) {
                                                        break L10;
                                                      } else {
                                                        if (var9.field_Bb) {
                                                          break L10;
                                                        } else {
                                                          L11: {
                                                            if (var9.field_Q == 5) {
                                                              break L11;
                                                            } else {
                                                              if (var9.field_Q == 6) {
                                                                break L11;
                                                              } else {
                                                                if (var9.field_Q == 4) {
                                                                  break L11;
                                                                } else {
                                                                  break L10;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var2 = var9.e((byte) -112) - this.e((byte) -112);
                                                          var3 = var9.g(1829947600) - this.g(1829947600);
                                                          var4 = var3 * var3 + var2 * var2;
                                                          if ((var4 ^ -1) <= -1601) {
                                                            break L10;
                                                          } else {
                                                            if (-1 == this.field_A.field_b.a(var9.g(1829947600), -104, var9.e((byte) -112), this.g(1829947600), this.e((byte) -112))) {
                                                              break L10;
                                                            } else {
                                                              L12: {
                                                                this.a(22, (byte) -89);
                                                                this.field_Ab = 70;
                                                                if (!var9.field_Bb) {
                                                                  var9.a(22, (byte) -89);
                                                                  var9.field_Ab = 70;
                                                                  break L12;
                                                                } else {
                                                                  break L12;
                                                                }
                                                              }
                                                              L13: {
                                                                var10 = var9.field_G - -(var2 << -2028638161);
                                                                var11 = (var3 << 329692175) + var9.field_E;
                                                                if (this.field_A.field_b.a(var11 >> -600248592, 126, var10 >> -2082759536, var9.g(1829947600), var9.e((byte) -112)) != -1) {
                                                                  var9.field_G = var10;
                                                                  var9.field_E = var11;
                                                                  break L13;
                                                                } else {
                                                                  break L13;
                                                                }
                                                              }
                                                              L14: {
                                                                var10 = -(var2 << 1555842671) + this.field_G;
                                                                var11 = this.field_E - (var3 << 1266656591);
                                                                if (0 == (this.field_A.field_b.a(var11 >> -996609040, -72, var10 >> 962525808, this.g(1829947600), this.e((byte) -112)) ^ -1)) {
                                                                  break L14;
                                                                } else {
                                                                  this.field_E = var11;
                                                                  this.field_G = var10;
                                                                  break L14;
                                                                }
                                                              }
                                                              this.field_A.a(-89, var9, (ge) (this));
                                                              return;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var8 = (ek) ((Object) var7.c(-1));
                                                  if (var12 == 0) {
                                                    continue L9;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var6++;
                                        if (var12 == 0) {
                                          continue L4;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                  var5++;
                                  break L6;
                                }
                                if (var12 == 0) {
                                  continue L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_41_0 = param0;
                      stackIn_42_0 = stackOut_41_0;
                      break L2;
                    }
                    L15: {
                      if (stackIn_42_0 >= 4) {
                        break L15;
                      } else {
                        discarded$3 = this.q(-53);
                        break L15;
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    final void j(byte param0) {
        int var2 = 0;
        L0: {
          L1: {
            if (7 != this.field_Q) {
              break L1;
            } else {
              this.q((byte) -110);
              if (!ZombieDawnMulti.field_E) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if ((this.field_Q ^ -1) == -6) {
              break L2;
            } else {
              if (-7 != (this.field_Q ^ -1)) {
                break L0;
              } else {
                break L2;
              }
            }
          }
          this.u(83);
          this.o((byte) 27);
          this.field_S = true;
          break L0;
        }
        var2 = 9 % ((param0 - 3) / 53);
    }

    final void m(byte param0) {
        int fieldTemp$2 = 0;
        L0: {
          fieldTemp$2 = this.field_kb;
          this.field_kb = this.field_kb - 1;
          if (0 < fieldTemp$2) {
            break L0;
          } else {
            if ((this.field_Q ^ -1) != -10) {
              L1: {
                if (-9 != (this.field_Q ^ -1)) {
                  break L1;
                } else {
                  if (null != this.field_tb) {
                    this.field_tb.q(-22882);
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
                if ((this.field_Q ^ -1) != -18) {
                  this.a(9, (byte) -89);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_S = true;
              this.field_A.field_p[this.field_gb] = this.field_A.field_p[this.field_gb] + 1;
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final void t(int param0) {
        if (!(null == this.field_vb)) {
            this.field_Q = 15;
            this.field_vb.d(-108);
            this.field_vb.a(true);
            this.field_vb = null;
            this.a(4, (byte) -89);
        }
        if (param0 != 4) {
            this.field_Ab = 97;
        }
    }

    final boolean a(boolean param0, byte param1) {
        if (!(!this.c(true))) {
            return false;
        }
        this.a(13, (byte) -89);
        if (param1 <= 3) {
            this.field_tb = (lm) null;
        }
        this.field_X = param0 ? true : false;
        this.field_S = true;
        return true;
    }

    final void l(int param0) {
        if (this.c(true)) {
            return;
        }
        if (param0 != 34) {
            ge.s(47);
        }
        this.a(28, (byte) -89);
        this.field_S = true;
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
        int decompiledRegionSelector0 = 0;
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
                    this.field_nb = 0;
                    this.field_wb = (qk) ((Object) param1.a((byte) 115));
                    this.field_Cb = param1;
                    if (this.c(param0)) {
                      break L2;
                    } else {
                      this.o((byte) 27);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("ge.PC(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void k(byte param0) {
        if (param0 != 92) {
            this.field_yb = -27;
        }
    }

    private final void o(byte param0) {
        int var3 = 0;
        int var4 = 0;
        qk var5 = null;
        L0: {
          if (null == this.field_Cb) {
            break L0;
          } else {
            if (this.field_Cb.f(param0 ^ 28106)) {
              break L0;
            } else {
              L1: {
                var5 = (qk) ((Object) this.field_Cb.g(77));
                this.field_N = var5.field_g;
                this.field_ab = var5.field_h;
                this.a(5, (byte) -89);
                var3 = 28672 * this.field_M;
                if (param0 == 27) {
                  break L1;
                } else {
                  this.field_nb = 3;
                  break L1;
                }
              }
              L2: {
                var4 = var3 / 2;
                if (!this.field_A.field_m.b((byte) -72, 49, this.field_gb)) {
                  break L2;
                } else {
                  var3 = var3 + var4;
                  break L2;
                }
              }
              L3: {
                if (!this.field_A.field_m.b((byte) -101, 47, this.field_gb)) {
                  break L3;
                } else {
                  var3 = var3 + var4;
                  break L3;
                }
              }
              this.c(-97, var3);
              return;
            }
          }
        }
        this.field_Cb = null;
        this.field_wb = null;
        this.a(4, (byte) -89);
    }

    private final void n(int param0) {
        int fieldTemp$1 = 0;
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
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_20_0 = false;
        int stackIn_47_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_19_0 = false;
        int stackOut_46_0 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (-1 <= (this.field_xb ^ -1)) {
          L0: {
            fieldTemp$1 = this.field_mb;
            this.field_mb = this.field_mb + 1;
            if (-11 < (fieldTemp$1 ^ -1)) {
              break L0;
            } else {
              this.field_mb = 0;
              if (var12 == 0) {
                L1: {
                  if (param0 == -26310) {
                    break L1;
                  } else {
                    this.field_rb = 98;
                    break L1;
                  }
                }
                var2 = null;
                var6 = this.field_C - 1;
                L2: while (true) {
                  L3: {
                    L4: {
                      L5: {
                        if (this.field_C - -1 < var6) {
                          break L5;
                        } else {
                          stackOut_9_0 = this.field_B - 1;
                          stackIn_47_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var12 != 0) {
                            break L4;
                          } else {
                            var7 = stackIn_10_0;
                            L6: while (true) {
                              stackOut_11_0 = 1 + this.field_B;
                              stackIn_12_0 = stackOut_11_0;
                              L7: while (true) {
                                L8: {
                                  L9: {
                                    if (stackIn_12_0 < var7) {
                                      break L9;
                                    } else {
                                      var8 = this.field_A.a(true, var6, var7);
                                      if (var12 != 0) {
                                        break L8;
                                      } else {
                                        L10: {
                                          L11: {
                                            if (var8 != null) {
                                              break L11;
                                            } else {
                                              if (var12 == 0) {
                                                break L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          var9 = (ek) ((Object) var8.a(false));
                                          L12: while (true) {
                                            if (var9 == null) {
                                              break L10;
                                            } else {
                                              stackOut_19_0 = var9 instanceof lm;
                                              stackIn_12_0 = stackOut_19_0 ? 1 : 0;
                                              stackIn_20_0 = stackOut_19_0;
                                              if (var12 != 0) {
                                                continue L7;
                                              } else {
                                                L13: {
                                                  if (!stackIn_20_0) {
                                                    break L13;
                                                  } else {
                                                    var10 = (lm) ((Object) var9);
                                                    if (var10.field_Q == 21) {
                                                      break L13;
                                                    } else {
                                                      if ((var10.field_Q ^ -1) == -19) {
                                                        break L13;
                                                      } else {
                                                        if (32 == var10.field_Q) {
                                                          break L13;
                                                        } else {
                                                          if (-21 != (var10.field_Q ^ -1)) {
                                                            L14: {
                                                              var3 = var10.e((byte) -112) + -this.e((byte) -112);
                                                              var4 = var10.g(param0 ^ -1829940758) + -this.g(1829947600);
                                                              var5 = var3 * var3 + var4 * var4;
                                                              var11 = 6400;
                                                              if (this.field_A.field_m.b((byte) -79, 61, this.field_gb)) {
                                                                var11 = var11 * 2;
                                                                break L14;
                                                              } else {
                                                                break L14;
                                                              }
                                                            }
                                                            L15: {
                                                              if (this.field_A.field_m.b((byte) -91, 54, this.field_gb)) {
                                                                var11 = var11 * 3;
                                                                break L15;
                                                              } else {
                                                                break L15;
                                                              }
                                                            }
                                                            if ((var11 ^ -1) >= (var5 ^ -1)) {
                                                              break L13;
                                                            } else {
                                                              if (0 != (this.field_A.field_b.a(var10.g(1829947600), 111, var10.e((byte) -112), this.g(1829947600), this.e((byte) -112)) ^ -1)) {
                                                                if (400 <= var5) {
                                                                  L16: {
                                                                    if (var2 == null) {
                                                                      break L16;
                                                                    } else {
                                                                      if (0 == (var10.field_x + this.field_x) % 2) {
                                                                        break L16;
                                                                      } else {
                                                                        break L13;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = var10;
                                                                  break L13;
                                                                } else {
                                                                  this.field_tb = var10;
                                                                  var10.j((byte) 120);
                                                                  this.a(8, (byte) -89);
                                                                  this.field_Ab = 70;
                                                                  this.field_A.a(var10, (ge) (this), (var10.e((byte) -112) - -this.e((byte) -112)) / 2, (var10.g(1829947600) + this.g(1829947600)) / 2, (byte) -63);
                                                                  return;
                                                                }
                                                              } else {
                                                                break L13;
                                                              }
                                                            }
                                                          } else {
                                                            break L13;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var9 = (ek) ((Object) var8.c(-1));
                                                if (var12 == 0) {
                                                  continue L12;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var7++;
                                        if (var12 == 0) {
                                          continue L6;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  var6++;
                                  break L8;
                                }
                                if (var12 == 0) {
                                  continue L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (var2 == null) {
                        break L3;
                      } else {
                        stackOut_46_0 = this.field_Q;
                        stackIn_47_0 = stackOut_46_0;
                        break L4;
                      }
                    }
                    if (stackIn_47_0 == 7) {
                      break L3;
                    } else {
                      if (-1 != (this.field_fb ^ -1)) {
                        break L3;
                      } else {
                        if (this.field_Bb) {
                          break L3;
                        } else {
                          if (-34 != (this.field_Q ^ -1)) {
                            L17: {
                              this.field_N = ((lm) (var2)).e((byte) -112);
                              this.field_ab = ((lm) (var2)).g(param0 + 1829973910);
                              var6 = 57344 * this.field_M;
                              var7 = var6 / 2;
                              if (this.field_A.field_m.b((byte) -77, 61, this.field_gb)) {
                                var6 = var6 + var7;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if (!this.field_A.field_m.b((byte) -99, 54, this.field_gb)) {
                                break L18;
                              } else {
                                var6 = var6 + var7;
                                break L18;
                              }
                            }
                            this.c(param0 ^ 26259, var6);
                            this.a(7, (byte) -89);
                            this.field_tb = (lm) (var2);
                            this.field_fb = 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean d(byte param0, int param1) {
        if (param0 != 61) {
            this.field_Db = -106;
        }
        return 0 != (this.field_hb & 1 << param1) ? true : false;
    }

    final void r(byte param0) {
        if (param0 >= -47) {
            return;
        }
        this.field_Db = 0;
    }

    final boolean p(byte param0) {
        if (param0 <= 12) {
            this.j((byte) -27);
        }
        return (this.field_ub ^ -1) < -1 ? true : false;
    }

    final void d(int param0, int param1) {
        boolean discarded$0 = false;
        if (-9 == (this.field_Q ^ -1)) {
            return;
        }
        this.a(23, (byte) -89);
        this.field_S = true;
        this.field_Db = param0;
        if (param1 > -93) {
            discarded$0 = this.o(49);
        }
    }

    final boolean q(int param0) {
        if (param0 >= -126) {
            return false;
        }
        return this.field_jb;
    }

    ge(int param0, int param1, boolean param2) {
        this(param0, param1, param2 ? 0 : 1);
        Object stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        L0: {
          stackOut_0_0 = this;
          stackOut_0_1 = param0;
          stackOut_0_2 = param1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (!param2) {
            stackOut_2_0 = this;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
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
            if (-11 < (a.field_b ^ -1)) {
              break L2;
            } else {
              if (-14 < (fn.field_i ^ -1)) {
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
        return this.field_xb > 0 ? true : false;
    }

    final void f(boolean param0) {
        L0: {
          L1: {
            if (0 < this.field_xb) {
              break L1;
            } else {
              if (0 < this.field_ub) {
                break L1;
              } else {
                if (this.field_Bb) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          this.field_Bb = false;
          this.field_xb = 0;
          this.field_S = true;
          this.field_ub = 0;
          break L0;
        }
        L2: {
          if (param0) {
            break L2;
          } else {
            this.d(-44, -117);
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
              if (8 == this.field_Q) {
                break L1;
              } else {
                if (this.field_Q == 9) {
                  break L1;
                } else {
                  if (this.field_Q == 23) {
                    break L1;
                  } else {
                    if ((this.field_Q ^ -1) == -13) {
                      break L1;
                    } else {
                      if (7 == this.field_Q) {
                        break L1;
                      } else {
                        if (-14 == (this.field_Q ^ -1)) {
                          break L1;
                        } else {
                          if ((this.field_Q ^ -1) == -15) {
                            break L1;
                          } else {
                            if (26 == this.field_Q) {
                              break L1;
                            } else {
                              if (-16 == (this.field_Q ^ -1)) {
                                break L1;
                              } else {
                                if (17 == this.field_Q) {
                                  break L1;
                                } else {
                                  if ((this.field_Q ^ -1) == -29) {
                                    break L1;
                                  } else {
                                    if (-25 == (this.field_Q ^ -1)) {
                                      break L1;
                                    } else {
                                      if (this.field_Q != 19) {
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
            this.field_gb = -9;
        }
        return (this.field_D ^ -1) == -1 ? true : false;
    }

    final boolean l(byte param0) {
        if (this.c(true)) {
            return false;
        }
        this.a(17, (byte) -89);
        if (param0 != -52) {
            this.u(78);
        }
        this.field_S = true;
        return true;
    }

    final boolean b(boolean param0, byte param1) {
        if (!(!this.c(true))) {
            return false;
        }
        if (param1 > -100) {
            this.field_mb = -62;
        }
        this.a(param0 ? 26 : 14, (byte) -89);
        this.field_S = true;
        return true;
    }

    static {
        field_pb = "Game options changed (<%0>)";
        field_qb = "Invite <%0> to this game";
        field_ib = "A cloud of corrosive acid that will stop living and dead alike.";
    }
}
