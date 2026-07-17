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
        int stackIn_114_0 = 0;
        Object stackIn_155_0 = null;
        Object stackIn_156_0 = null;
        Object stackIn_157_0 = null;
        Object stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        kd stackIn_174_0 = null;
        kd stackIn_175_0 = null;
        kd stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        int stackIn_251_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        Object stackOut_154_0 = null;
        Object stackOut_155_0 = null;
        Object stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        Object stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        kd stackOut_173_0 = null;
        kd stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        kd stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        int stackOut_250_0 = 0;
        int stackOut_249_0 = 0;
        var7 = MinerDisturbance.field_ab;
        if (param0 == 468) {
          L0: {
            L1: {
              var3 = ((ml) this).field_r[param1];
              var4 = -2;
              var5 = (lj.field_t + rg.field_sb + (nk.field_w - -m.field_e)) % 8;
              if (var5 != 0) {
                break L1;
              } else {
                di.field_X = di.field_X + qd.field_M;
                ac.field_b = ac.field_b - 1;
                if (var7 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var5 == 1) {
                break L2;
              } else {
                L3: {
                  if (var5 != 2) {
                    break L3;
                  } else {
                    ac.field_b = ac.field_b + 1;
                    di.field_X = di.field_X - qd.field_M;
                    if (var7 == 0) {
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 != 3) {
                    break L4;
                  } else {
                    qd.field_M = qd.field_M + 1;
                    di.field_X = di.field_X - ac.field_b;
                    if (var7 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 == 4) {
                    break L5;
                  } else {
                    L6: {
                      if (var5 != 5) {
                        break L6;
                      } else {
                        qd.field_M = qd.field_M + 1;
                        vh.field_g = vh.field_g + ac.field_b;
                        if (var7 == 0) {
                          break L0;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 == 6) {
                        break L7;
                      } else {
                        if (var5 != 7) {
                          break L0;
                        } else {
                          vh.field_g = vh.field_g - ac.field_b;
                          qd.field_M = qd.field_M - 1;
                          if (var7 == 0) {
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    vh.field_g = vh.field_g - qd.field_M;
                    ac.field_b = ac.field_b - 1;
                    if (var7 == 0) {
                      break L0;
                    } else {
                      break L5;
                    }
                  }
                }
                ac.field_b = ac.field_b + 1;
                vh.field_g = vh.field_g + qd.field_M;
                if (var7 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            di.field_X = di.field_X + ac.field_b;
            qd.field_M = qd.field_M - 1;
            break L0;
          }
          L8: {
            L9: {
              var5 = (lj.field_t + (rg.field_sb + (nk.field_w - -m.field_e))) % 4;
              if (var5 != 0) {
                break L9;
              } else {
                pn.field_b = pn.field_b + aa.field_b;
                hl.field_b = hl.field_b + 1;
                if (var7 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (1 == var5) {
                break L10;
              } else {
                L11: {
                  if (var5 != 2) {
                    break L11;
                  } else {
                    aa.field_b = aa.field_b + 1;
                    pn.field_b = pn.field_b + hl.field_b;
                    if (var7 == 0) {
                      break L8;
                    } else {
                      break L11;
                    }
                  }
                }
                if (var5 != 3) {
                  break L8;
                } else {
                  aa.field_b = aa.field_b - 1;
                  pn.field_b = pn.field_b - hl.field_b;
                  if (var7 == 0) {
                    break L8;
                  } else {
                    break L10;
                  }
                }
              }
            }
            pn.field_b = pn.field_b - aa.field_b;
            hl.field_b = hl.field_b - 1;
            break L8;
          }
          L12: {
            L13: {
              L14: {
                L15: {
                  L16: {
                    L17: {
                      L18: {
                        L19: {
                          L20: {
                            L21: {
                              L22: {
                                L23: {
                                  L24: {
                                    L25: {
                                      L26: {
                                        L27: {
                                          L28: {
                                            L29: {
                                              L30: {
                                                L31: {
                                                  L32: {
                                                    L33: {
                                                      L34: {
                                                        L35: {
                                                          var5 = var3;
                                                          if (var5 == 3) {
                                                            break L35;
                                                          } else {
                                                            L36: {
                                                              if (17 != var5) {
                                                                break L36;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L34;
                                                                } else {
                                                                  break L36;
                                                                }
                                                              }
                                                            }
                                                            L37: {
                                                              if (19 != var5) {
                                                                break L37;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L33;
                                                                } else {
                                                                  break L37;
                                                                }
                                                              }
                                                            }
                                                            L38: {
                                                              if (12 != var5) {
                                                                break L38;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L32;
                                                                } else {
                                                                  break L38;
                                                                }
                                                              }
                                                            }
                                                            L39: {
                                                              if (7 != var5) {
                                                                break L39;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L31;
                                                                } else {
                                                                  break L39;
                                                                }
                                                              }
                                                            }
                                                            L40: {
                                                              if (var5 != 18) {
                                                                break L40;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L30;
                                                                } else {
                                                                  break L40;
                                                                }
                                                              }
                                                            }
                                                            L41: {
                                                              if (var5 != 9) {
                                                                break L41;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L29;
                                                                } else {
                                                                  break L41;
                                                                }
                                                              }
                                                            }
                                                            L42: {
                                                              if (var5 != 8) {
                                                                break L42;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L42;
                                                                }
                                                              }
                                                            }
                                                            L43: {
                                                              if (2 != var5) {
                                                                break L43;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L27;
                                                                } else {
                                                                  break L43;
                                                                }
                                                              }
                                                            }
                                                            L44: {
                                                              if (25 != var5) {
                                                                break L44;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L26;
                                                                } else {
                                                                  break L44;
                                                                }
                                                              }
                                                            }
                                                            L45: {
                                                              if (var5 != 1) {
                                                                break L45;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L25;
                                                                } else {
                                                                  break L45;
                                                                }
                                                              }
                                                            }
                                                            if (var5 == 10) {
                                                              break L24;
                                                            } else {
                                                              L46: {
                                                                if (var5 != 11) {
                                                                  break L46;
                                                                } else {
                                                                  if (var7 == 0) {
                                                                    break L23;
                                                                  } else {
                                                                    break L46;
                                                                  }
                                                                }
                                                              }
                                                              L47: {
                                                                if (var5 != 15) {
                                                                  break L47;
                                                                } else {
                                                                  if (var7 == 0) {
                                                                    break L22;
                                                                  } else {
                                                                    break L47;
                                                                  }
                                                                }
                                                              }
                                                              if (0 == var5) {
                                                                break L21;
                                                              } else {
                                                                if (var5 == 16) {
                                                                  break L20;
                                                                } else {
                                                                  if (var5 == 6) {
                                                                    break L19;
                                                                  } else {
                                                                    if (22 == var5) {
                                                                      break L18;
                                                                    } else {
                                                                      L48: {
                                                                        if (var5 != 23) {
                                                                          break L48;
                                                                        } else {
                                                                          if (var7 == 0) {
                                                                            break L17;
                                                                          } else {
                                                                            break L48;
                                                                          }
                                                                        }
                                                                      }
                                                                      L49: {
                                                                        if (var5 != 14) {
                                                                          break L49;
                                                                        } else {
                                                                          if (var7 == 0) {
                                                                            break L16;
                                                                          } else {
                                                                            break L49;
                                                                          }
                                                                        }
                                                                      }
                                                                      L50: {
                                                                        if (var5 != 21) {
                                                                          break L50;
                                                                        } else {
                                                                          if (var7 == 0) {
                                                                            break L15;
                                                                          } else {
                                                                            break L50;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var5 == 24) {
                                                                        break L14;
                                                                      } else {
                                                                        if (var5 == 20) {
                                                                          break L14;
                                                                        } else {
                                                                          L51: {
                                                                            if (var5 != 4) {
                                                                              break L51;
                                                                            } else {
                                                                              if (var7 == 0) {
                                                                                break L13;
                                                                              } else {
                                                                                break L51;
                                                                              }
                                                                            }
                                                                          }
                                                                          L52: {
                                                                            if (var5 == 13) {
                                                                              if (!((ml) this).field_o.a((byte) -57)) {
                                                                                break L12;
                                                                              } else {
                                                                                var4 = -1;
                                                                                el.field_c = true;
                                                                                if (var7 == 0) {
                                                                                  break L12;
                                                                                } else {
                                                                                  break L52;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              if (var5 != 5) {
                                                                                break L12;
                                                                              } else {
                                                                                if (var7 == 0) {
                                                                                  break L52;
                                                                                } else {
                                                                                  break L35;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          L53: {
                                                                            if (!((ml) this).field_o.b(-94)) {
                                                                              break L53;
                                                                            } else {
                                                                              ma.a(-124, 0);
                                                                              break L53;
                                                                            }
                                                                          }
                                                                          L54: {
                                                                            if (!((ml) this).field_o.c(-64)) {
                                                                              break L54;
                                                                            } else {
                                                                              ma.a(-107, 256);
                                                                              break L54;
                                                                            }
                                                                          }
                                                                          L55: {
                                                                            if (((ml) this).field_o.d((byte) 77)) {
                                                                              L56: {
                                                                                var5 = 8;
                                                                                if (kb.field_c == 2) {
                                                                                  var5 += 20;
                                                                                  break L56;
                                                                                } else {
                                                                                  break L56;
                                                                                }
                                                                              }
                                                                              L57: {
                                                                                var6 = nk.field_w - (var5 + 134);
                                                                                if (var6 <= 0) {
                                                                                  break L57;
                                                                                } else {
                                                                                  L58: {
                                                                                    if (144 <= var6) {
                                                                                      break L58;
                                                                                    } else {
                                                                                      oc.field_f = var6 * 256 / 144;
                                                                                      if (var7 == 0) {
                                                                                        break L55;
                                                                                      } else {
                                                                                        break L58;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  oc.field_f = 256;
                                                                                  if (var7 == 0) {
                                                                                    break L55;
                                                                                  } else {
                                                                                    break L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                              oc.field_f = 0;
                                                                              break L55;
                                                                            } else {
                                                                              break L55;
                                                                            }
                                                                          }
                                                                          L59: {
                                                                            if (!((ml) this).field_o.a(112)) {
                                                                              break L59;
                                                                            } else {
                                                                              fc.a(false);
                                                                              break L59;
                                                                            }
                                                                          }
                                                                          if (!((ml) this).field_o.e((byte) 127)) {
                                                                            break L12;
                                                                          } else {
                                                                            pn.b(60);
                                                                            break L12;
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
                                                        if (((ml) this).field_o.a((byte) 113)) {
                                                          L60: {
                                                            L61: {
                                                              if (!kj.a(false)) {
                                                                break L61;
                                                              } else {
                                                                if (((ml) this).field_n == 0) {
                                                                  break L61;
                                                                } else {
                                                                  var4 = 8;
                                                                  if (var7 == 0) {
                                                                    break L60;
                                                                  } else {
                                                                    break L61;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var4 = 3;
                                                            break L60;
                                                          }
                                                          tk.field_a = true;
                                                          if (var7 == 0) {
                                                            break L12;
                                                          } else {
                                                            break L34;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                      if (((ml) this).field_o.a((byte) -3)) {
                                                        rj.a((byte) -38, 6);
                                                        pd.field_b.s(param0 ^ 428);
                                                        var4 = -1;
                                                        el.field_c = true;
                                                        if (var7 == 0) {
                                                          break L12;
                                                        } else {
                                                          break L33;
                                                        }
                                                      } else {
                                                        break L12;
                                                      }
                                                    }
                                                    if (((ml) this).field_o.a((byte) 16)) {
                                                      L62: {
                                                        d.field_c = true;
                                                        if (sc.field_b) {
                                                          mg.a((byte) -125);
                                                          break L62;
                                                        } else {
                                                          break L62;
                                                        }
                                                      }
                                                      L63: {
                                                        if (sc.field_b) {
                                                          stackOut_113_0 = 0;
                                                          stackIn_114_0 = stackOut_113_0;
                                                          break L63;
                                                        } else {
                                                          stackOut_112_0 = 1;
                                                          stackIn_114_0 = stackOut_112_0;
                                                          break L63;
                                                        }
                                                      }
                                                      sc.field_b = stackIn_114_0 != 0;
                                                      if (var7 == 0) {
                                                        break L12;
                                                      } else {
                                                        break L32;
                                                      }
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                  if (!((ml) this).field_o.a((byte) 10)) {
                                                    break L12;
                                                  } else {
                                                    L64: {
                                                      if (null != kf.field_d) {
                                                        break L64;
                                                      } else {
                                                        cl.q(-64);
                                                        if (var7 == 0) {
                                                          break L12;
                                                        } else {
                                                          break L64;
                                                        }
                                                      }
                                                    }
                                                    ng.a((byte) -122);
                                                    if (var7 == 0) {
                                                      break L12;
                                                    } else {
                                                      break L31;
                                                    }
                                                  }
                                                }
                                                if (((ml) this).field_o.a((byte) -9)) {
                                                  if (this.a(param0 ^ 446)) {
                                                    break L12;
                                                  } else {
                                                    if (((ml) this).field_f == 0) {
                                                      break L12;
                                                    } else {
                                                      ((ml) this).field_g = ((ml) this).field_f;
                                                      this.d(2, param0 + -970);
                                                      ((ml) this).field_f = 0;
                                                      if (var7 == 0) {
                                                        break L12;
                                                      } else {
                                                        break L30;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L12;
                                                }
                                              }
                                              if (!((ml) this).field_o.a((byte) 112)) {
                                                break L12;
                                              } else {
                                                kj.a(-62);
                                                if (var7 == 0) {
                                                  break L12;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                            if (((ml) this).field_o.a((byte) 113)) {
                                              if (this.a(123)) {
                                                break L12;
                                              } else {
                                                if (((ml) this).field_f != 2) {
                                                  ((ml) this).field_g = ((ml) this).field_f;
                                                  this.d(2, -502);
                                                  ((ml) this).field_f = 2;
                                                  if (var7 == 0) {
                                                    break L12;
                                                  } else {
                                                    break L28;
                                                  }
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            } else {
                                              break L12;
                                            }
                                          }
                                          if (((ml) this).field_o.a((byte) 115)) {
                                            if (this.a(111)) {
                                              break L12;
                                            } else {
                                              if (((ml) this).field_f != 1) {
                                                ((ml) this).field_g = ((ml) this).field_f;
                                                this.d(2, -502);
                                                ((ml) this).field_f = 1;
                                                if (var7 == 0) {
                                                  break L12;
                                                } else {
                                                  break L27;
                                                }
                                              } else {
                                                break L12;
                                              }
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                        if (((ml) this).field_o.a((byte) 126)) {
                                          L65: {
                                            L66: {
                                              if (((ml) this).field_n != 5) {
                                                break L66;
                                              } else {
                                                var4 = 2;
                                                kd.a(cm.field_o, (byte) -93);
                                                if (var7 == 0) {
                                                  break L65;
                                                } else {
                                                  break L66;
                                                }
                                              }
                                            }
                                            L67: {
                                              if (!kj.a(false)) {
                                                break L67;
                                              } else {
                                                var4 = 7;
                                                if (var7 == 0) {
                                                  break L65;
                                                } else {
                                                  break L67;
                                                }
                                              }
                                            }
                                            var4 = 2;
                                            break L65;
                                          }
                                          tk.field_a = true;
                                          if (var7 == 0) {
                                            break L12;
                                          } else {
                                            break L26;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                      if (((ml) this).field_o.a((byte) 27)) {
                                        if (!this.a(99)) {
                                          L68: {
                                            L69: {
                                              this.d(3, -502);
                                              ((ml) this).field_i = (1 + ((ml) this).field_i) % 2;
                                              stackOut_154_0 = this;
                                              stackIn_157_0 = stackOut_154_0;
                                              stackIn_155_0 = stackOut_154_0;
                                              if (nk.field_w <= 468) {
                                                break L69;
                                              } else {
                                                stackOut_155_0 = this;
                                                stackIn_157_0 = stackOut_155_0;
                                                stackIn_156_0 = stackOut_155_0;
                                                if (520 <= nk.field_w) {
                                                  break L69;
                                                } else {
                                                  stackOut_156_0 = this;
                                                  stackOut_156_1 = 1;
                                                  stackIn_158_0 = stackOut_156_0;
                                                  stackIn_158_1 = stackOut_156_1;
                                                  break L68;
                                                }
                                              }
                                            }
                                            stackOut_157_0 = this;
                                            stackOut_157_1 = 0;
                                            stackIn_158_0 = stackOut_157_0;
                                            stackIn_158_1 = stackOut_157_1;
                                            break L68;
                                          }
                                          ((ml) this).field_p = stackIn_158_1 != 0;
                                          if (var7 == 0) {
                                            break L12;
                                          } else {
                                            break L25;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                    if (!((ml) this).field_o.a((byte) 108)) {
                                      break L12;
                                    } else {
                                      tk.field_a = true;
                                      var4 = 1;
                                      if (var7 == 0) {
                                        break L12;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  if (!((ml) this).field_o.a((byte) 113)) {
                                    break L12;
                                  } else {
                                    if (((ml) this).field_k >= 6) {
                                      break L12;
                                    } else {
                                      if (this.a(117)) {
                                        break L12;
                                      } else {
                                        ((ml) this).field_g = ((ml) this).field_k;
                                        this.d(1, -502);
                                        ((ml) this).field_k = ((ml) this).field_k + 1;
                                        if (var7 == 0) {
                                          break L12;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (((ml) this).field_o.a((byte) -101)) {
                                  if (((ml) this).field_k <= 0) {
                                    break L12;
                                  } else {
                                    if (this.a(121)) {
                                      break L12;
                                    } else {
                                      ((ml) this).field_g = ((ml) this).field_k;
                                      this.d(1, param0 + -970);
                                      ((ml) this).field_k = ((ml) this).field_k - 1;
                                      ((ml) this).field_p = true;
                                      if (var7 == 0) {
                                        break L12;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                              if (!((ml) this).field_o.a((byte) -46)) {
                                break L12;
                              } else {
                                L70: {
                                  var4 = 4;
                                  tk.field_a = true;
                                  stackOut_173_0 = wk.field_a;
                                  stackIn_175_0 = stackOut_173_0;
                                  stackIn_174_0 = stackOut_173_0;
                                  if (u.b(-4440) >= mk.b(58)) {
                                    stackOut_175_0 = (kd) (Object) stackIn_175_0;
                                    stackOut_175_1 = 0;
                                    stackIn_176_0 = stackOut_175_0;
                                    stackIn_176_1 = stackOut_175_1;
                                    break L70;
                                  } else {
                                    stackOut_174_0 = (kd) (Object) stackIn_174_0;
                                    stackOut_174_1 = 1;
                                    stackIn_176_0 = stackOut_174_0;
                                    stackIn_176_1 = stackOut_174_1;
                                    break L70;
                                  }
                                }
                                ((kd) (Object) stackIn_176_0).a(stackIn_176_1 != 0, true);
                                if (var7 == 0) {
                                  break L12;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            if (!((ml) this).field_o.a((byte) 15)) {
                              break L12;
                            } else {
                              L71: {
                                tk.field_a = true;
                                if (0 != mc.field_w) {
                                  break L71;
                                } else {
                                  if (oj.field_J == 2) {
                                    break L71;
                                  } else {
                                    if (oj.field_J == 5) {
                                      break L71;
                                    } else {
                                      var4 = 0;
                                      if (var7 == 0) {
                                        break L12;
                                      } else {
                                        break L71;
                                      }
                                    }
                                  }
                                }
                              }
                              var4 = 4;
                              if (var7 == 0) {
                                break L12;
                              } else {
                                break L20;
                              }
                            }
                          }
                          if (((ml) this).field_o.a((byte) 112)) {
                            L72: {
                              ge.field_c = true;
                              jf.field_b = ((ml) this).field_n;
                              if (8 == ((ml) this).field_n) {
                                break L72;
                              } else {
                                L73: {
                                  if (((ml) this).field_n != 6) {
                                    break L73;
                                  } else {
                                    if (!ig.a(-20144)) {
                                      break L73;
                                    } else {
                                      tm.field_v = 5;
                                      if (var7 == 0) {
                                        break L12;
                                      } else {
                                        break L73;
                                      }
                                    }
                                  }
                                }
                                L74: {
                                  if (9 == ((ml) this).field_n) {
                                    break L74;
                                  } else {
                                    tm.field_v = 2;
                                    if (var7 == 0) {
                                      break L12;
                                    } else {
                                      break L74;
                                    }
                                  }
                                }
                                tm.field_v = 9;
                                if (var7 == 0) {
                                  break L12;
                                } else {
                                  break L72;
                                }
                              }
                            }
                            tm.field_v = 3;
                            if (var7 == 0) {
                              break L12;
                            } else {
                              break L19;
                            }
                          } else {
                            break L12;
                          }
                        }
                        L75: {
                          if (!((ml) this).field_o.b(-96)) {
                            break L75;
                          } else {
                            fc.a(0, (byte) 97);
                            break L75;
                          }
                        }
                        L76: {
                          if (!((ml) this).field_o.c(98)) {
                            break L76;
                          } else {
                            fc.a(256, (byte) 89);
                            break L76;
                          }
                        }
                        L77: {
                          if (!((ml) this).field_o.d((byte) 77)) {
                            break L77;
                          } else {
                            L78: {
                              var5 = 8;
                              if (kb.field_c == 2) {
                                var5 += 20;
                                break L78;
                              } else {
                                break L78;
                              }
                            }
                            L79: {
                              var6 = -var5 - 134 + nk.field_w;
                              if (var6 > 0) {
                                break L79;
                              } else {
                                fc.a(0, (byte) 54);
                                if (var7 == 0) {
                                  break L77;
                                } else {
                                  break L79;
                                }
                              }
                            }
                            L80: {
                              if (144 <= var6) {
                                break L80;
                              } else {
                                fc.a(256 * var6 / 144, (byte) 68);
                                if (var7 == 0) {
                                  break L77;
                                } else {
                                  break L80;
                                }
                              }
                            }
                            fc.a(256, (byte) 62);
                            break L77;
                          }
                        }
                        L81: {
                          if (!((ml) this).field_o.a(-95)) {
                            break L81;
                          } else {
                            cl.p(param0 + -403);
                            break L81;
                          }
                        }
                        if (!((ml) this).field_o.e((byte) 126)) {
                          break L12;
                        } else {
                          ol.a((byte) -94);
                          if (var7 == 0) {
                            break L12;
                          } else {
                            break L18;
                          }
                        }
                      }
                      if (!((ml) this).field_o.a((byte) -87)) {
                        break L12;
                      } else {
                        tk.field_a = true;
                        var4 = 10;
                        if (var7 == 0) {
                          break L12;
                        } else {
                          break L17;
                        }
                      }
                    }
                    if (!((ml) this).field_o.a((byte) -72)) {
                      break L12;
                    } else {
                      tk.field_a = true;
                      var4 = 11;
                      if (var7 == 0) {
                        break L12;
                      } else {
                        break L16;
                      }
                    }
                  }
                  if (!((ml) this).field_o.a((byte) 125)) {
                    break L12;
                  } else {
                    tk.field_a = true;
                    var4 = 9;
                    if (var7 == 0) {
                      break L12;
                    } else {
                      break L15;
                    }
                  }
                }
                if (pj.field_a <= 0) {
                  break L12;
                } else {
                  if (!ci.field_b) {
                    break L12;
                  } else {
                    break L14;
                  }
                }
              }
              if (!((ml) this).field_o.a((byte) 122)) {
                break L12;
              } else {
                L82: {
                  L83: {
                    L84: {
                      if (var3 == 20) {
                        break L84;
                      } else {
                        if (24 == var3) {
                          break L84;
                        } else {
                          if (0 < pj.field_a) {
                            break L83;
                          } else {
                            break L84;
                          }
                        }
                      }
                    }
                    L85: {
                      if (qd.field_S) {
                        break L85;
                      } else {
                        if (var7 == 0) {
                          break L12;
                        } else {
                          break L85;
                        }
                      }
                    }
                    ah.field_f = 0;
                    if (var7 == 0) {
                      break L82;
                    } else {
                      break L83;
                    }
                  }
                  if (21 == var3) {
                    ah.field_f = 1;
                    break L82;
                  } else {
                    break L82;
                  }
                }
                L86: {
                  L87: {
                    if (nd.a(ah.field_f, param0 ^ 469)) {
                      break L87;
                    } else {
                      if (!ne.a((byte) 10, 27)) {
                        break L86;
                      } else {
                        break L87;
                      }
                    }
                  }
                  cm.field_n = cm.field_n + 1;
                  break L86;
                }
                L88: {
                  if (!d.field_c) {
                    sc.field_b = false;
                    if (0 != cm.field_n) {
                      break L88;
                    } else {
                      sc.field_b = true;
                      if (sc.field_b) {
                        L89: {
                          if (wj.g(122)) {
                            stackOut_250_0 = 0;
                            stackIn_251_0 = stackOut_250_0;
                            break L89;
                          } else {
                            stackOut_249_0 = 1;
                            stackIn_251_0 = stackOut_249_0;
                            break L89;
                          }
                        }
                        sc.field_b = stackIn_251_0 != 0;
                        break L88;
                      } else {
                        break L88;
                      }
                    }
                  } else {
                    break L88;
                  }
                }
                sn.field_b[1] = null;
                sn.field_b[0] = null;
                pd.field_b.field_Q = new mc(pd.field_b, ((ml) this).field_o.field_d);
                var4 = -1;
                el.field_c = true;
                if (var7 == 0) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            if (!((ml) this).field_o.a((byte) -45)) {
              break L12;
            } else {
              ng.a((byte) 73);
              uf.a(13, bm.c(param0 + -555));
              break L12;
            }
          }
          return var4;
        } else {
          return -66;
        }
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
        boolean stackIn_6_0 = false;
        int stackIn_32_0 = 0;
        ql[] stackIn_35_0 = null;
        ql[] stackIn_37_0 = null;
        boolean stackIn_40_0 = false;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_31_0 = 0;
        ql[] stackOut_34_0 = null;
        ql[] stackOut_36_0 = null;
        boolean stackOut_39_0 = false;
        int stackOut_76_0 = 0;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var25 = MinerDisturbance.field_ab;
        try {
          L0: {
            kn.field_H[0] = new ql[je.field_N[0]];
            var3_array = new ql[je.field_N[0]];
            var4 = fg.a(65, param2);
            var5 = -1;
            if (param1 == 0) {
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
                L2: {
                  L3: {
                    if (var4[0].length <= var17_int) {
                      break L3;
                    } else {
                      stackOut_5_0 = var4[0][var17_int].equalsIgnoreCase("Iron Prob");
                      stackIn_32_0 = stackOut_5_0 ? 1 : 0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var25 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_6_0) {
                              break L5;
                            } else {
                              L6: {
                                if (!var4[0][var17_int].equalsIgnoreCase("Silver Prob")) {
                                  break L6;
                                } else {
                                  var6 = var17_int;
                                  if (var25 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                if (!var4[0][var17_int].equalsIgnoreCase("Gold Prob")) {
                                  break L7;
                                } else {
                                  var7 = var17_int;
                                  if (var25 == 0) {
                                    break L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (!var4[0][var17_int].equalsIgnoreCase("Effluvium Prob")) {
                                  break L8;
                                } else {
                                  var8 = var17_int;
                                  if (var25 == 0) {
                                    break L4;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (!var4[0][var17_int].equalsIgnoreCase("Diamond Prob")) {
                                  break L9;
                                } else {
                                  var9 = var17_int;
                                  if (var25 == 0) {
                                    break L4;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (!var4[0][var17_int].equalsIgnoreCase("Boulder Prob")) {
                                  break L10;
                                } else {
                                  var10 = var17_int;
                                  if (var25 == 0) {
                                    break L4;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (var4[0][var17_int].equalsIgnoreCase("Hole Prob")) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (!var4[0][var17_int].equalsIgnoreCase("Water Cell")) {
                                      break L12;
                                    } else {
                                      var12 = var17_int;
                                      if (var25 == 0) {
                                        break L4;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (!var4[0][var17_int].equalsIgnoreCase("Gas Cell")) {
                                      break L13;
                                    } else {
                                      var14 = var17_int;
                                      if (var25 == 0) {
                                        break L4;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (!var4[0][var17_int].equalsIgnoreCase("Random Water Cell")) {
                                      break L14;
                                    } else {
                                      var13 = var17_int;
                                      if (var25 == 0) {
                                        break L4;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (!var4[0][var17_int].equalsIgnoreCase("Random Gas Cell")) {
                                      break L15;
                                    } else {
                                      var15 = var17_int;
                                      if (var25 == 0) {
                                        break L4;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  if (!var4[0][var17_int].equalsIgnoreCase("Central Hole")) {
                                    break L4;
                                  } else {
                                    var16 = var17_int;
                                    if (var25 == 0) {
                                      break L4;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              var11 = var17_int;
                              if (var25 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var5 = var17_int;
                          break L4;
                        }
                        var17_int++;
                        if (var25 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_31_0 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  break L2;
                }
                var17_int = stackIn_32_0;
                L16: while (true) {
                  L17: {
                    L18: {
                      if (var3_array.length <= var17_int) {
                        break L18;
                      } else {
                        stackOut_34_0 = (ql[]) var3_array;
                        stackIn_37_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        if (var25 != 0) {
                          break L17;
                        } else {
                          ql dupTemp$2 = new ql();
                          stackIn_35_0[var17_int] = dupTemp$2;
                          var18_ref_ql = dupTemp$2;
                          var18_ref_ql.field_o[0] = Integer.parseInt(var4[var17_int + 1][var5]);
                          var18_ref_ql.field_o[1] = Integer.parseInt(var4[var17_int + 1][var6]);
                          var18_ref_ql.field_o[2] = Integer.parseInt(var4[var17_int - -1][var7]);
                          var18_ref_ql.field_o[3] = Integer.parseInt(var4[var17_int - -1][var8]);
                          var18_ref_ql.field_o[4] = Integer.parseInt(var4[1 + var17_int][var9]);
                          var18_ref_ql.field_e = Integer.parseInt(var4[1 + var17_int][var10]);
                          var18_ref_ql.field_d = Integer.parseInt(var4[1 + var17_int][var11]);
                          var18_ref_ql.field_f = Boolean.valueOf(var4[var17_int - -1][var14]).booleanValue();
                          var18_ref_ql.field_k = Boolean.valueOf(var4[var17_int + 1][var12]).booleanValue();
                          var18_ref_ql.field_i = Boolean.valueOf(var4[var17_int + 1][var13]).booleanValue();
                          var18_ref_ql.field_b = Boolean.valueOf(var4[var17_int + 1][var15]).booleanValue();
                          var18_ref_ql.field_n = Boolean.valueOf(var4[1 + var17_int][var16]).booleanValue();
                          var17_int++;
                          if (var25 == 0) {
                            continue L16;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    kn.field_H[1] = new ql[je.field_N[1]];
                    stackOut_36_0 = new ql[je.field_N[1]];
                    stackIn_37_0 = stackOut_36_0;
                    break L17;
                  }
                  var17 = stackIn_37_0;
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
                  L19: while (true) {
                    L20: {
                      L21: {
                        if (var23 >= var4[0].length) {
                          break L21;
                        } else {
                          stackOut_39_0 = var4[0][var23].equalsIgnoreCase("Iron Prob");
                          stackIn_77_0 = stackOut_39_0 ? 1 : 0;
                          stackIn_40_0 = stackOut_39_0;
                          if (var25 != 0) {
                            break L20;
                          } else {
                            L22: {
                              L23: {
                                if (stackIn_40_0) {
                                  break L23;
                                } else {
                                  L24: {
                                    if (!var4[0][var23].equalsIgnoreCase("Silver Prob")) {
                                      break L24;
                                    } else {
                                      var6 = var23;
                                      if (var25 == 0) {
                                        break L22;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  L25: {
                                    if (!var4[0][var23].equalsIgnoreCase("Gold Prob")) {
                                      break L25;
                                    } else {
                                      var7 = var23;
                                      if (var25 == 0) {
                                        break L22;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  L26: {
                                    if (!var4[0][var23].equalsIgnoreCase("Effluvium Prob")) {
                                      break L26;
                                    } else {
                                      var8 = var23;
                                      if (var25 == 0) {
                                        break L22;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  L27: {
                                    if (var4[0][var23].equalsIgnoreCase("Diamond Prob")) {
                                      break L27;
                                    } else {
                                      L28: {
                                        if (!var4[0][var23].equalsIgnoreCase("Boulder Prob")) {
                                          break L28;
                                        } else {
                                          var10 = var23;
                                          if (var25 == 0) {
                                            break L22;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (!var4[0][var23].equalsIgnoreCase("Hole Prob")) {
                                          break L29;
                                        } else {
                                          var11 = var23;
                                          if (var25 == 0) {
                                            break L22;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (!var4[0][var23].equalsIgnoreCase("Water Cell")) {
                                          break L30;
                                        } else {
                                          var12 = var23;
                                          if (var25 == 0) {
                                            break L22;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      L31: {
                                        if (!var4[0][var23].equalsIgnoreCase("Gas Cell")) {
                                          break L31;
                                        } else {
                                          var14 = var23;
                                          if (var25 == 0) {
                                            break L22;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                      L32: {
                                        if (!var4[0][var23].equalsIgnoreCase("Random Water Cell")) {
                                          break L32;
                                        } else {
                                          var13 = var23;
                                          if (var25 == 0) {
                                            break L22;
                                          } else {
                                            break L32;
                                          }
                                        }
                                      }
                                      L33: {
                                        if (var4[0][var23].equalsIgnoreCase("Oil Cell")) {
                                          break L33;
                                        } else {
                                          L34: {
                                            if (!var4[0][var23].equalsIgnoreCase("Earth Prob")) {
                                              break L34;
                                            } else {
                                              var20 = var23;
                                              if (var25 == 0) {
                                                break L22;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                          L35: {
                                            if (var4[0][var23].equalsIgnoreCase("Freeze Prob")) {
                                              break L35;
                                            } else {
                                              L36: {
                                                if (var4[0][var23].equalsIgnoreCase("Random Gas Cell")) {
                                                  break L36;
                                                } else {
                                                  L37: {
                                                    if (!var4[0][var23].equalsIgnoreCase("Monster Is Walrus")) {
                                                      break L37;
                                                    } else {
                                                      var21 = var23;
                                                      if (var25 == 0) {
                                                        break L22;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                  L38: {
                                                    if (var4[0][var23].equalsIgnoreCase("Has Penguin")) {
                                                      break L38;
                                                    } else {
                                                      if (var4[0][var23].equalsIgnoreCase("Central Hole")) {
                                                        var16 = var23;
                                                        if (var25 == 0) {
                                                          break L22;
                                                        } else {
                                                          break L38;
                                                        }
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  var22 = var23;
                                                  if (var25 == 0) {
                                                    break L22;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                              var15 = var23;
                                              if (var25 == 0) {
                                                break L22;
                                              } else {
                                                break L35;
                                              }
                                            }
                                          }
                                          var19 = var23;
                                          if (var25 == 0) {
                                            break L22;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                      var18 = var23;
                                      if (var25 == 0) {
                                        break L22;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var9 = var23;
                                  if (var25 == 0) {
                                    break L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              var5 = var23;
                              break L22;
                            }
                            var23++;
                            if (var25 == 0) {
                              continue L19;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      stackOut_76_0 = 0;
                      stackIn_77_0 = stackOut_76_0;
                      break L20;
                    }
                    var23 = stackIn_77_0;
                    L39: while (true) {
                      L40: {
                        if (var23 >= var17.length) {
                          break L40;
                        } else {
                          ql dupTemp$3 = new ql();
                          var17[var23] = dupTemp$3;
                          var24 = dupTemp$3;
                          var24.field_o[0] = Integer.parseInt(var4[var23 + 1][var5]);
                          var24.field_o[1] = Integer.parseInt(var4[1 + var23][var6]);
                          var24.field_o[2] = Integer.parseInt(var4[var23 - -1][var7]);
                          var24.field_o[3] = Integer.parseInt(var4[var23 + 1][var8]);
                          var24.field_o[4] = Integer.parseInt(var4[1 + var23][var9]);
                          var24.field_o[5] = Integer.parseInt(var4[1 + var23][var19]);
                          var24.field_e = Integer.parseInt(var4[var23 - -1][var10]);
                          var24.field_d = Integer.parseInt(var4[var23 + 1][var11]);
                          var24.field_l = Integer.parseInt(var4[var23 - -1][var20]);
                          var24.field_a = Boolean.valueOf(var4[var23 - -1][var18]).booleanValue();
                          var24.field_f = Boolean.valueOf(var4[var23 + 1][var14]).booleanValue();
                          var24.field_k = Boolean.valueOf(var4[var23 - -1][var12]).booleanValue();
                          var24.field_i = Boolean.valueOf(var4[var23 + 1][var13]).booleanValue();
                          var24.field_b = Boolean.valueOf(var4[var23 + 1][var15]).booleanValue();
                          var24.field_h = Boolean.valueOf(var4[var23 + 1][var21]).booleanValue();
                          var24.field_g = Boolean.valueOf(var4[var23 + 1][var22]).booleanValue();
                          var24.field_n = Boolean.valueOf(var4[1 + var23][var16]).booleanValue();
                          var23++;
                          if (var25 != 0) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            if (var25 == 0) {
                              continue L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) var3;
            stackOut_83_1 = new StringBuilder().append("ml.R(");
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param0 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L41;
            } else {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L41;
            }
          }
          L42: {
            stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
            stackOut_86_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_86_2).append(44).append(param1).append(44);
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param2 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L42;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L42;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_42_5 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        Object stackIn_79_0 = null;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int stackOut_41_5 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        int stackOut_40_5 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        Object stackOut_78_0 = null;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        Object stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        var7 = MinerDisturbance.field_ab;
        if (param1 == -22674) {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                var5 = ((ml) this).field_n;
                                if (2 == var5) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (var5 != 8) {
                                      break L11;
                                    } else {
                                      if (var7 == 0) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var5 != 3) {
                                      break L12;
                                    } else {
                                      if (var7 == 0) {
                                        break L9;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var5 == 5) {
                                    break L8;
                                  } else {
                                    if (var5 == 7) {
                                      break L7;
                                    } else {
                                      if (1 == var5) {
                                        break L6;
                                      } else {
                                        L13: {
                                          if (var5 != 6) {
                                            break L13;
                                          } else {
                                            if (var7 == 0) {
                                              break L5;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (var5 != 11) {
                                            break L14;
                                          } else {
                                            if (var7 == 0) {
                                              break L4;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        L15: {
                                          if (var5 != 4) {
                                            break L15;
                                          } else {
                                            if (var7 == 0) {
                                              break L3;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        if (var5 != 9) {
                                          break L1;
                                        } else {
                                          if (var7 == 0) {
                                            break L2;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L16: {
                                if (this.a(96)) {
                                  break L16;
                                } else {
                                  this.a(param2, false, ((ml) this).field_f, (byte) 121);
                                  if (var7 == 0) {
                                    break L1;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                var5 = ((ml) this).field_g;
                                if (((ml) this).field_j == 3) {
                                  var5 = ((ml) this).field_f;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                stackOut_30_0 = this;
                                stackOut_30_1 = param2;
                                stackIn_32_0 = stackOut_30_0;
                                stackIn_32_1 = stackOut_30_1;
                                stackIn_31_0 = stackOut_30_0;
                                stackIn_31_1 = stackOut_30_1;
                                if (((ml) this).field_p) {
                                  stackOut_32_0 = this;
                                  stackOut_32_1 = stackIn_32_1;
                                  stackOut_32_2 = 0;
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  stackIn_33_2 = stackOut_32_2;
                                  break L18;
                                } else {
                                  stackOut_31_0 = this;
                                  stackOut_31_1 = stackIn_31_1;
                                  stackOut_31_2 = 1;
                                  stackIn_33_0 = stackOut_31_0;
                                  stackIn_33_1 = stackOut_31_1;
                                  stackIn_33_2 = stackOut_31_2;
                                  break L18;
                                }
                              }
                              this.a(stackIn_33_1, stackIn_33_2 != 0, var5, (byte) 121);
                              this.a(param2, ((ml) this).field_p, ((ml) this).field_f, (byte) 121);
                              var6 = 0;
                              L19: while (true) {
                                L20: {
                                  if (((ml) this).field_r.length <= var6) {
                                    break L20;
                                  } else {
                                    stackOut_35_0 = this;
                                    stackIn_79_0 = stackOut_35_0;
                                    stackIn_36_0 = stackOut_35_0;
                                    if (var7 != 0) {
                                      break L0;
                                    } else {
                                      L21: {
                                        stackOut_36_0 = this;
                                        stackOut_36_1 = param2;
                                        stackIn_38_0 = stackOut_36_0;
                                        stackIn_38_1 = stackOut_36_1;
                                        stackIn_37_0 = stackOut_36_0;
                                        stackIn_37_1 = stackOut_36_1;
                                        if (~var6 != ~((ml) this).field_o.field_e) {
                                          stackOut_38_0 = this;
                                          stackOut_38_1 = stackIn_38_1;
                                          stackOut_38_2 = 0;
                                          stackIn_39_0 = stackOut_38_0;
                                          stackIn_39_1 = stackOut_38_1;
                                          stackIn_39_2 = stackOut_38_2;
                                          break L21;
                                        } else {
                                          stackOut_37_0 = this;
                                          stackOut_37_1 = stackIn_37_1;
                                          stackOut_37_2 = 1;
                                          stackIn_39_0 = stackOut_37_0;
                                          stackIn_39_1 = stackOut_37_1;
                                          stackIn_39_2 = stackOut_37_2;
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        stackOut_39_0 = this;
                                        stackOut_39_1 = stackIn_39_1;
                                        stackOut_39_2 = stackIn_39_2;
                                        stackOut_39_3 = 95;
                                        stackOut_39_4 = var6;
                                        stackIn_41_0 = stackOut_39_0;
                                        stackIn_41_1 = stackOut_39_1;
                                        stackIn_41_2 = stackOut_39_2;
                                        stackIn_41_3 = stackOut_39_3;
                                        stackIn_41_4 = stackOut_39_4;
                                        stackIn_40_0 = stackOut_39_0;
                                        stackIn_40_1 = stackOut_39_1;
                                        stackIn_40_2 = stackOut_39_2;
                                        stackIn_40_3 = stackOut_39_3;
                                        stackIn_40_4 = stackOut_39_4;
                                        if (((ml) this).field_p) {
                                          stackOut_41_0 = this;
                                          stackOut_41_1 = stackIn_41_1;
                                          stackOut_41_2 = stackIn_41_2;
                                          stackOut_41_3 = stackIn_41_3;
                                          stackOut_41_4 = stackIn_41_4;
                                          stackOut_41_5 = 0;
                                          stackIn_42_0 = stackOut_41_0;
                                          stackIn_42_1 = stackOut_41_1;
                                          stackIn_42_2 = stackOut_41_2;
                                          stackIn_42_3 = stackOut_41_3;
                                          stackIn_42_4 = stackOut_41_4;
                                          stackIn_42_5 = stackOut_41_5;
                                          break L22;
                                        } else {
                                          stackOut_40_0 = this;
                                          stackOut_40_1 = stackIn_40_1;
                                          stackOut_40_2 = stackIn_40_2;
                                          stackOut_40_3 = stackIn_40_3;
                                          stackOut_40_4 = stackIn_40_4;
                                          stackOut_40_5 = 1;
                                          stackIn_42_0 = stackOut_40_0;
                                          stackIn_42_1 = stackOut_40_1;
                                          stackIn_42_2 = stackOut_40_2;
                                          stackIn_42_3 = stackOut_40_3;
                                          stackIn_42_4 = stackOut_40_4;
                                          stackIn_42_5 = stackOut_40_5;
                                          break L22;
                                        }
                                      }
                                      this.a(stackIn_42_1, stackIn_42_2 != 0, (byte) stackIn_42_3, stackIn_42_4, stackIn_42_5 != 0);
                                      var6++;
                                      if (var7 == 0) {
                                        continue L19;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                if (var7 == 0) {
                                  break L1;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L23: {
                              stackOut_44_0 = 0;
                              stackOut_44_1 = 43;
                              stackOut_44_2 = 0;
                              stackOut_44_3 = param2;
                              stackIn_46_0 = stackOut_44_0;
                              stackIn_46_1 = stackOut_44_1;
                              stackIn_46_2 = stackOut_44_2;
                              stackIn_46_3 = stackOut_44_3;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              stackIn_45_2 = stackOut_44_2;
                              stackIn_45_3 = stackOut_44_3;
                              if (mc.field_w != 0) {
                                stackOut_46_0 = stackIn_46_0;
                                stackOut_46_1 = stackIn_46_1;
                                stackOut_46_2 = stackIn_46_2;
                                stackOut_46_3 = stackIn_46_3;
                                stackOut_46_4 = 0;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                stackIn_47_2 = stackOut_46_2;
                                stackIn_47_3 = stackOut_46_3;
                                stackIn_47_4 = stackOut_46_4;
                                break L23;
                              } else {
                                stackOut_45_0 = stackIn_45_0;
                                stackOut_45_1 = stackIn_45_1;
                                stackOut_45_2 = stackIn_45_2;
                                stackOut_45_3 = stackIn_45_3;
                                stackOut_45_4 = 1;
                                stackIn_47_0 = stackOut_45_0;
                                stackIn_47_1 = stackOut_45_1;
                                stackIn_47_2 = stackOut_45_2;
                                stackIn_47_3 = stackOut_45_3;
                                stackIn_47_4 = stackOut_45_4;
                                break L23;
                              }
                            }
                            if (jb.a(stackIn_47_0 != 0, (byte) stackIn_47_1, stackIn_47_2 != 0, stackIn_47_3, stackIn_47_4 != 0)) {
                              break L1;
                            } else {
                              if (kj.a(false)) {
                                L24: {
                                  if (((ml) this).field_n != 8) {
                                    break L24;
                                  } else {
                                    int discarded$3 = ce.field_d.a(vb.field_d, 220 + -param2, 320, 200, 60, 1, -1, 1, 0, 0);
                                    if (var7 == 0) {
                                      break L1;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                int discarded$4 = ce.field_d.a(kc.field_c, 170 + -param2, 230, 300, 60, 1, -1, 1, 0, 0);
                                if (var7 == 0) {
                                  break L1;
                                } else {
                                  break L8;
                                }
                              } else {
                                break L1;
                              }
                            }
                          }
                          boolean discarded$5 = jb.a(true, (byte) -59, false, param2, false);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L7;
                          }
                        }
                        this.a(80, param2);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                      L25: {
                        if (!this.a(121)) {
                          break L25;
                        } else {
                          L26: {
                            stackOut_60_0 = this;
                            stackOut_60_1 = ((ml) this).field_g;
                            stackOut_60_2 = 0;
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_62_1 = stackOut_60_1;
                            stackIn_62_2 = stackOut_60_2;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            stackIn_61_2 = stackOut_60_2;
                            if (((ml) this).field_p) {
                              stackOut_62_0 = this;
                              stackOut_62_1 = stackIn_62_1;
                              stackOut_62_2 = stackIn_62_2;
                              stackOut_62_3 = 0;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              stackIn_63_2 = stackOut_62_2;
                              stackIn_63_3 = stackOut_62_3;
                              break L26;
                            } else {
                              stackOut_61_0 = this;
                              stackOut_61_1 = stackIn_61_1;
                              stackOut_61_2 = stackIn_61_2;
                              stackOut_61_3 = 1;
                              stackIn_63_0 = stackOut_61_0;
                              stackIn_63_1 = stackOut_61_1;
                              stackIn_63_2 = stackOut_61_2;
                              stackIn_63_3 = stackOut_61_3;
                              break L26;
                            }
                          }
                          this.a(stackIn_63_1, stackIn_63_2, stackIn_63_3 != 0, param2);
                          this.a(((ml) this).field_k, 0, ((ml) this).field_p, param2);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L25;
                          }
                        }
                      }
                      this.a(((ml) this).field_k, param1 + 22674, false, param2);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                    this.b(param2, (byte) -125);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                  eh.a(-param2, 0, 640, 480);
                  wk.field_a.d(117);
                  eh.a();
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                L27: {
                  m.field_m.f(param2, 0);
                  if (!eg.b(112)) {
                    break L27;
                  } else {
                    L28: {
                      if (fa.field_e) {
                        break L28;
                      } else {
                        ak.field_c.f(-param2 + 640 - ak.field_c.field_x, -ak.field_c.field_A + 480);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L28;
                        }
                      }
                    }
                    var5 = -gi.field_a.field_A + 480;
                    var6 = -param2 + (-gi.field_a.field_x + 640);
                    gi.field_a.f(var6, 10 * (qd.field_R / 20) + var5);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L27;
                    }
                  }
                }
                l.field_c.f(640 - (l.field_c.field_x + param2), -l.field_c.field_A + 480);
                if (var7 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var4 = 640 + param2 + -640;
              jc.field_G.f(320 + var4 - (jc.field_G.field_x >> 1), 15);
              break L1;
            }
            stackOut_78_0 = this;
            stackIn_79_0 = stackOut_78_0;
            break L0;
          }
          L29: {
            if (((ml) this).field_n == 11) {
              break L29;
            } else {
              var4 = 0;
              L30: while (true) {
                L31: {
                  if (~var4 <= ~((ml) this).field_r.length) {
                    break L31;
                  } else {
                    if (var7 != 0) {
                      break L29;
                    } else {
                      L32: {
                        stackOut_83_0 = this;
                        stackOut_83_1 = param2;
                        stackIn_85_0 = stackOut_83_0;
                        stackIn_85_1 = stackOut_83_1;
                        stackIn_84_0 = stackOut_83_0;
                        stackIn_84_1 = stackOut_83_1;
                        if (((ml) this).field_o.field_e != var4) {
                          stackOut_85_0 = this;
                          stackOut_85_1 = stackIn_85_1;
                          stackOut_85_2 = 0;
                          stackIn_86_0 = stackOut_85_0;
                          stackIn_86_1 = stackOut_85_1;
                          stackIn_86_2 = stackOut_85_2;
                          break L32;
                        } else {
                          stackOut_84_0 = this;
                          stackOut_84_1 = stackIn_84_1;
                          stackOut_84_2 = 1;
                          stackIn_86_0 = stackOut_84_0;
                          stackIn_86_1 = stackOut_84_1;
                          stackIn_86_2 = stackOut_84_2;
                          break L32;
                        }
                      }
                      this.a(stackIn_86_1, stackIn_86_2 != 0, (byte) 85, var4, false);
                      var4++;
                      if (var7 == 0) {
                        continue L30;
                      } else {
                        break L31;
                      }
                    }
                  }
                }
                break L29;
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
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            var16 = MinerDisturbance.field_ab;
            var5 = ol.field_b[param0];
            if (!((ml) this).field_p) {
              break L1;
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
              if (var16 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (param2) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L3;
            } else {
              stackOut_6_0 = 640;
              stackIn_8_0 = stackOut_6_0;
              break L3;
            }
          }
          var7 = stackIn_8_0 + ((ml) this).field_e;
          var6 = var7 + (-640 + -param3) + 765;
          break L0;
        }
        ha.field_a.f(param3 - (-320 - -(ha.field_a.field_x >> 1)), 15);
        var7 = 390;
        var8 = ce.field_d.field_E + ce.field_d.field_I + -2;
        var9 = mm.field_a.field_E + mm.field_a.field_I;
        var10 = param1;
        var11 = 0;
        L4: while (true) {
          L5: {
            L6: {
              if (var5.length <= var11) {
                break L6;
              } else {
                var10 = var10 + ce.field_d.a(var5[var11], var7);
                var11++;
                if (var16 != 0) {
                  break L5;
                } else {
                  if (var16 == 0) {
                    continue L4;
                  } else {
                    break L6;
                  }
                }
              }
            }
            var10 = var10 * var8;
            var10 = var10 + (4 + var9);
            break L5;
          }
          L7: {
            L8: {
              if (param0 != 2) {
                break L8;
              } else {
                var10 = var10 - 5 * var8;
                if (var16 == 0) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (param0 != 4) {
                break L9;
              } else {
                var10 = var10 + 3 * var8;
                if (var16 == 0) {
                  break L7;
                } else {
                  break L9;
                }
              }
            }
            if (param0 != 5) {
              break L7;
            } else {
              var10 = var10 + 5 * var8;
              break L7;
            }
          }
          L10: {
            g.a(90, var10 + 50, var6 + -30, 450, (byte) 53, hd.field_d);
            if (3 != param0) {
              break L10;
            } else {
              var7 -= 32;
              var6 += 32;
              break L10;
            }
          }
          L11: {
            L12: {
              L13: {
                var11 = 130;
                mm.field_a.a(pf.field_f[param0], var6, var11, 1, -1);
                var11 = var11 + var9;
                if (param0 != 1) {
                  break L13;
                } else {
                  var12_int = 0;
                  L14: while (true) {
                    L15: {
                      if (~var5.length >= ~var12_int) {
                        break L15;
                      } else {
                        if (var16 != 0) {
                          break L12;
                        } else {
                          L16: {
                            L17: {
                              L18: {
                                if (var12_int != 0) {
                                  break L18;
                                } else {
                                  int discarded$1 = ce.field_d.a(var5[var12_int], var6, var11 + -ce.field_d.field_I, 40, 480, 1, -1, 0, 0, var8);
                                  if (var16 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              L19: {
                                if (var12_int != 1) {
                                  break L19;
                                } else {
                                  var11 = var11 + ce.field_d.a(var5[var12_int], var6 - -40, -ce.field_d.field_I + var11, var7 + -40, 480, 1, -1, 0, 0, var8) * var8;
                                  var11 = var11 + var8;
                                  if (var16 == 0) {
                                    break L17;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              L20: {
                                if (var12_int == 2) {
                                  break L20;
                                } else {
                                  var13_int = ce.field_d.a(var5[var12_int], ti.field_N, gf.field_a);
                                  var14 = 0;
                                  L21: while (true) {
                                    L22: {
                                      if (var14 >= var13_int) {
                                        break L22;
                                      } else {
                                        ce.field_d.a(gf.field_a[var14], var6 - (-var7 - -ti.field_N[var14]), var11, 1, -1);
                                        var11 = var11 + var8;
                                        var14++;
                                        if (var16 != 0) {
                                          break L16;
                                        } else {
                                          if (var16 == 0) {
                                            continue L21;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                    }
                                    if (var16 == 0) {
                                      break L17;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              var11 = var11 + var8 * ce.field_d.a(var5[var12_int], var6, var11 - ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var8);
                              var11 = var11 + var8;
                              ib.field_a.f(var6, var11);
                              break L17;
                            }
                            var12_int++;
                            break L16;
                          }
                          if (var16 == 0) {
                            continue L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    if (var16 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
              }
              L23: {
                if (param0 == 2) {
                  break L23;
                } else {
                  L24: {
                    L25: {
                      if (param0 == 4) {
                        break L25;
                      } else {
                        if (5 != param0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if (4 == param0) {
                        break L26;
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
                          L27: while (true) {
                            L28: {
                              L29: {
                                if (var12_int >= 5) {
                                  break L29;
                                } else {
                                  var17[-1 + var12_int] = -15 + var11;
                                  var14 = ce.field_d.a(var5[var12_int], 5 + var6, var11 + -ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var8);
                                  if (var16 != 0) {
                                    break L28;
                                  } else {
                                    L30: {
                                      if (var14 != 1) {
                                        break L30;
                                      } else {
                                        var14++;
                                        break L30;
                                      }
                                    }
                                    var11 = var11 + var8 * var14;
                                    var11 = var11 + var8;
                                    var12_int++;
                                    if (var16 == 0) {
                                      continue L27;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                              var6 -= 32;
                              fl.field_j[10].c(var6 - 1, var17[0]);
                              fl.field_j[11].c(-1 + var6, var17[1]);
                              fl.field_j[12].c(-1 + var6, var17[2]);
                              fl.field_j[15].c(-1 + var6, var17[3]);
                              break L28;
                            }
                            if (var16 == 0) {
                              break L12;
                            } else {
                              break L26;
                            }
                          }
                        } else {
                          var12 = param0 - -1 + "/" + 7;
                          var13 = mm.field_a;
                          var14 = 345 + var6;
                          var15 = var13.field_E - -var13.field_I + 90;
                          var13.a(var12, var14, var13.field_N + var15, 1, -1);
                          break L11;
                        }
                      }
                    }
                    var7 -= 32;
                    var6 += 32;
                    var12_int = 0;
                    var18 = new int[2];
                    var13_array = var18;
                    L31: while (true) {
                      L32: {
                        L33: {
                          if (var12_int >= 2) {
                            break L33;
                          } else {
                            var18[var12_int] = -15 + var11;
                            var11 = var11 + ce.field_d.a(var5[var12_int], 5 + var6, -ce.field_d.field_I + var11, var7, 480, 1, -1, 0, 0, var8) * var8;
                            var11 = var11 + var8;
                            var12_int++;
                            if (var16 != 0) {
                              break L32;
                            } else {
                              if (var16 == 0) {
                                continue L31;
                              } else {
                                break L33;
                              }
                            }
                          }
                        }
                        var6 -= 32;
                        break L32;
                      }
                      var7 += 32;
                      L34: while (true) {
                        L35: {
                          L36: {
                            if (~var12_int <= ~var5.length) {
                              break L36;
                            } else {
                              var11 = var11 + var8 * ce.field_d.a(var5[var12_int], var6, -ce.field_d.field_I + var11, var7, 480, 1, -1, 0, 0, var8);
                              var12_int++;
                              if (var16 != 0) {
                                break L35;
                              } else {
                                if (var16 == 0) {
                                  continue L34;
                                } else {
                                  break L36;
                                }
                              }
                            }
                          }
                          fl.field_j[8].c(-1 + var6, var18[0]);
                          fl.field_j[9].c(-1 + var6, var18[1]);
                          break L35;
                        }
                        if (var16 == 0) {
                          break L12;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                  L37: {
                    var12_int = var6;
                    if (param0 != 3) {
                      break L37;
                    } else {
                      fl.field_j[3].c(-33 + var6, 139);
                      fl.field_j[4].c(-33 + var6, 180);
                      fl.field_j[5].c(-33 + var6, 222);
                      fl.field_j[7].c(var6 - 33, 258);
                      fl.field_j[6].c(var6 - 33, 291);
                      var12_int += 5;
                      var6 -= 32;
                      break L37;
                    }
                  }
                  var13_int = 0;
                  L38: while (true) {
                    L39: {
                      if (var13_int >= var5.length) {
                        break L39;
                      } else {
                        var11 = var11 + ce.field_d.a(var5[var13_int], var12_int, var11 + -ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var8) * var8;
                        var13_int++;
                        if (var16 != 0) {
                          break L12;
                        } else {
                          if (var16 == 0) {
                            continue L38;
                          } else {
                            break L39;
                          }
                        }
                      }
                    }
                    if (var16 == 0) {
                      break L12;
                    } else {
                      break L23;
                    }
                  }
                }
              }
              var12_int = 0;
              var13_int = 0;
              L40: while (true) {
                if (var13_int >= var5.length) {
                  break L12;
                } else {
                  L41: {
                    L42: {
                      L43: {
                        if (var13_int == 3) {
                          break L43;
                        } else {
                          if (7 != var13_int) {
                            break L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                      var11 = var11 + (1 + ce.field_d.a(var5[var13_int], var6, -ce.field_d.field_I + var11, var7, 480, 1, -1, 0, 0, var8)) * var8;
                      if (var16 == 0) {
                        break L41;
                      } else {
                        break L42;
                      }
                    }
                    L44: {
                      L45: {
                        if (var13_int == 0) {
                          break L45;
                        } else {
                          if (var13_int == 4) {
                            fl.field_j[13].c(var6 - -180, -20 + var11);
                            fl.field_j[14].c(var6 + 180, 14 + var11);
                            if (var16 == 0) {
                              break L44;
                            } else {
                              break L45;
                            }
                          } else {
                            break L44;
                          }
                        }
                      }
                      fl.field_j[0].c(var6 + 180, var11 + -20);
                      fl.field_j[1].c(214 + var6, var11 + -20);
                      fl.field_j[2].c(var6 + 180, 14 + var11);
                      break L44;
                    }
                    L46: {
                      L47: {
                        L48: {
                          var14 = var6;
                          if (0 == var13_int) {
                            break L48;
                          } else {
                            if (var13_int != 4) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        var14 += 0;
                        if (var16 == 0) {
                          break L46;
                        } else {
                          break L47;
                        }
                      }
                      L49: {
                        if (var13_int == 1) {
                          break L49;
                        } else {
                          if (var13_int == 5) {
                            break L49;
                          } else {
                            var14 += 260;
                            if (var16 == 0) {
                              break L46;
                            } else {
                              break L49;
                            }
                          }
                        }
                      }
                      var14 += 60;
                      break L46;
                    }
                    L50: {
                      var15 = ce.field_d.a(var5[var13_int], var14, var11 - ce.field_d.field_I, var7 / 3, 480, 1, -1, 0, 0, var8);
                      var12_int = Math.max(var12_int, var15);
                      if (2 == var13_int) {
                        break L50;
                      } else {
                        if (6 != var13_int) {
                          break L41;
                        } else {
                          break L50;
                        }
                      }
                    }
                    var11 = var11 + var8 * (var12_int - -1);
                    var12_int = 0;
                    break L41;
                  }
                  var13_int++;
                  if (var16 == 0) {
                    continue L40;
                  } else {
                    break L12;
                  }
                }
              }
            }
            var12 = param0 - -1 + "/" + 7;
            var13 = mm.field_a;
            var14 = 345 + var6;
            var15 = var13.field_E - -var13.field_I + 90;
            var13.a(var12, var14, var13.field_N + var15, 1, -1);
            break L11;
          }
          return;
        }
    }

    private final void a(int param0, int param1, int param2, String param3, int param4, vm param5, int param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param2 = param2 + ((ml) this).field_l;
                param5.a(param3, -2 + param0, param2, 4, param1);
                param5.a(param3, param0 - -2, param2, 4, param1);
                param5.a(param3, param0, param2 - -2, 4, param1);
                param5.a(param3, param0 + -1, param2 + -1, 4, param1);
                param5.a(param3, param0 - -1, param2 + param7, 4, param1);
                param5.a(param3, param0 - 1, 1 + param2, 4, param1);
                param5.a(param3, 1 + param0, 1 + param2, 4, param1);
                if (param8) {
                  break L2;
                } else {
                  param5.a(param3, param0, param2, param6, -1);
                  if (MinerDisturbance.field_ab == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param5.a(param3, param0, param2, param4, -1);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var10;
            stackOut_5_1 = new StringBuilder().append("ml.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          L4: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param4).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var3 = MinerDisturbance.field_ab;
            if (!((ml) this).field_b) {
              break L1;
            } else {
              ((ml) this).field_o.b((byte) -81);
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (((ml) this).field_n != 2) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            } else {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L2;
            }
          }
          L3: {
            L4: {
              var2 = stackIn_6_0;
              if (lj.field_t != 98) {
                break L4;
              } else {
                if (var2 == 0) {
                  break L4;
                } else {
                  ((ml) this).field_o.c((byte) 126);
                  if (!((ml) this).field_o.d((byte) 77)) {
                    L5: {
                      if (((ml) this).field_o.field_e >= 0) {
                        break L5;
                      } else {
                        ((ml) this).field_o.a(0, 0);
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (((ml) this).field_o.field_e != 3) {
                        break L6;
                      } else {
                        ((ml) this).field_o.a(1, 0);
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (0 < pj.field_a) {
                        break L7;
                      } else {
                        ((ml) this).field_o.a(3, param0 ^ 1);
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (((ml) this).field_o.field_e >= 4) {
                        break L8;
                      } else {
                        ((ml) this).field_o.a(4, param0 ^ 1);
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ((ml) this).field_o.a(3, 0);
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                }
              }
            }
            L9: {
              if (lj.field_t != 98) {
                break L9;
              } else {
                if (1 != ((ml) this).field_n) {
                  break L9;
                } else {
                  if (((ml) this).field_k != 6) {
                    break L9;
                  } else {
                    ((ml) this).field_o.c((byte) 94);
                    if (!((ml) this).field_o.d((byte) 77)) {
                      L10: {
                        if (((ml) this).field_o.field_e < 0) {
                          break L10;
                        } else {
                          L11: {
                            if (3 >= ((ml) this).field_o.field_e) {
                              break L11;
                            } else {
                              ((ml) this).field_o.a(((ml) this).field_o.field_e, 0);
                              if (var3 == 0) {
                                break L3;
                              } else {
                                break L11;
                              }
                            }
                          }
                          ((ml) this).field_o.a(3, 0);
                          if (var3 == 0) {
                            break L3;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((ml) this).field_o.a(0, 0);
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L9;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            L12: {
              L13: {
                if (lj.field_t != 99) {
                  break L13;
                } else {
                  if (var2 != 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (99 != lj.field_t) {
                  break L14;
                } else {
                  if (1 != ((ml) this).field_n) {
                    break L14;
                  } else {
                    if (6 != ((ml) this).field_k) {
                      break L14;
                    } else {
                      ((ml) this).field_o.c((byte) 118);
                      if (((ml) this).field_o.d((byte) 77)) {
                        break L3;
                      } else {
                        L15: {
                          if (((ml) this).field_o.field_e >= 0) {
                            break L15;
                          } else {
                            ((ml) this).field_o.a(3, 0);
                            if (var3 == 0) {
                              break L3;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (((ml) this).field_o.field_e < 3) {
                            break L16;
                          } else {
                            ((ml) this).field_o.a(1, 0);
                            if (var3 == 0) {
                              break L3;
                            } else {
                              break L16;
                            }
                          }
                        }
                        ((ml) this).field_o.a(((ml) this).field_o.field_e, 0);
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                }
              }
              ((ml) this).field_o.d(-4664);
              if (var3 == 0) {
                break L3;
              } else {
                break L12;
              }
            }
            ((ml) this).field_o.c((byte) 93);
            if (!((ml) this).field_o.d((byte) 77)) {
              L17: {
                if (((ml) this).field_o.field_e == 4) {
                  break L17;
                } else {
                  L18: {
                    if (((ml) this).field_o.field_e < 3) {
                      break L18;
                    } else {
                      if (((ml) this).field_o.field_e != 3) {
                        break L3;
                      } else {
                        L19: {
                          if (pj.field_a <= 0) {
                            break L19;
                          } else {
                            ((ml) this).field_o.a(4, 0);
                            if (var3 == 0) {
                              break L3;
                            } else {
                              break L19;
                            }
                          }
                        }
                        ((ml) this).field_o.a(1, param0 ^ 1);
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  ((ml) this).field_o.a(3, param0 + -1);
                  if (var3 == 0) {
                    break L3;
                  } else {
                    break L17;
                  }
                }
              }
              ((ml) this).field_o.a(1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          if (((ml) this).field_n != 1) {
            break L0;
          } else {
            L20: {
              if (((ml) this).field_o.field_e != 3) {
                break L20;
              } else {
                if (((ml) this).field_k == 6) {
                  break L20;
                } else {
                  L21: {
                    if (lj.field_t == 97) {
                      break L21;
                    } else {
                      ((ml) this).field_o.field_e = 2;
                      if (var3 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  ((ml) this).field_o.field_e = 0;
                  break L20;
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
        }
        L22: {
          if (param0 == 1) {
            break L22;
          } else {
            field_d = 109;
            break L22;
          }
        }
        L23: {
          var2 = -2;
          if (((ml) this).field_o.field_e != -1) {
            var2 = this.b(468, ((ml) this).field_o.field_e);
            break L23;
          } else {
            break L23;
          }
        }
        return var2;
    }

    public static void a(byte param0) {
        int var1 = 12 % ((32 - param0) / 58);
        field_c = null;
    }

    private final void d(int param0, int param1) {
        ((ml) this).field_e = 0;
        ((ml) this).field_j = param0;
        if (param1 != -502) {
            field_a = 90;
        }
    }

    private final int c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var6 = MinerDisturbance.field_ab;
        if (param0 == -21377) {
          var4 = 0;
          L0: while (true) {
            if (var4 < ((ml) this).field_r.length) {
              var5 = pk.field_b.c(m.field_g[var4], 640);
              stackOut_5_0 = ((ml) this).field_m - var5 / 2;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var6 == 0) {
                L1: {
                  if (stackIn_7_0 > param2) {
                    break L1;
                  } else {
                    if (var5 / 2 + ((ml) this).field_m <= param2) {
                      break L1;
                    } else {
                      if (param1 < var4 * ((ml) this).field_l + ((ml) this).field_q) {
                        break L1;
                      } else {
                        if (param1 < pk.field_b.field_I + var4 * ((ml) this).field_l + ((ml) this).field_q - -pk.field_b.field_E) {
                          return var4;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                var4++;
                continue L0;
              } else {
                return stackIn_6_0;
              }
            } else {
              return -1;
            }
          }
        } else {
          return 33;
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
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
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
        int stackOut_53_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_57_0 = 0;
        L0: {
          L1: {
            var19 = MinerDisturbance.field_ab;
            var6 = ((ml) this).field_r[param3];
            var7 = ((ml) this).field_r.length;
            if (((ml) this).field_n != 1) {
              break L1;
            } else {
              L2: {
                if (0 != ((ml) this).field_k) {
                  break L2;
                } else {
                  if (11 == var6) {
                    return;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (6 != ((ml) this).field_k) {
                  break L3;
                } else {
                  if (var6 != 10) {
                    break L3;
                  } else {
                    return;
                  }
                }
              }
              L4: {
                var7--;
                if (var6 != 18) {
                  break L4;
                } else {
                  if (((ml) this).field_k == 6) {
                    break L4;
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
                if (var19 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
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
        }
        L5: {
          var8 = pk.field_b;
          var9 = m.field_g[var6];
          if (var6 != 12) {
            break L5;
          } else {
            L6: {
              stackOut_17_0 = new StringBuilder().append(var9);
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (kf.field_d == null) {
                stackOut_19_0 = (StringBuilder) (Object) stackIn_19_0;
                stackOut_19_1 = ie.field_a;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L6;
              } else {
                stackOut_18_0 = (StringBuilder) (Object) stackIn_18_0;
                stackOut_18_1 = gm.field_b;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L6;
              }
            }
            var9 = stackIn_20_1;
            break L5;
          }
        }
        L7: {
          if (19 != var6) {
            break L7;
          } else {
            L8: {
              stackOut_22_0 = new StringBuilder().append(var9);
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (!sc.field_b) {
                stackOut_24_0 = (StringBuilder) (Object) stackIn_24_0;
                stackOut_24_1 = ie.field_a;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L8;
              } else {
                stackOut_23_0 = (StringBuilder) (Object) stackIn_23_0;
                stackOut_23_1 = gm.field_b;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L8;
              }
            }
            var9 = stackIn_25_1;
            break L7;
          }
        }
        L9: {
          if (var6 != 0) {
            break L9;
          } else {
            if (mc.field_w != 0) {
              break L9;
            } else {
              L10: {
                if (((ml) this).field_n == 1) {
                  break L10;
                } else {
                  if (((ml) this).field_n != 3) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              var9 = a.field_b;
              break L9;
            }
          }
        }
        if (param2 > 14) {
          L11: {
            L12: {
              var12 = 8218369;
              var13 = 16502531;
              var14 = 15885602;
              if (!((ml) this).field_b) {
                break L12;
              } else {
                var11 = ((ml) this).field_l * param3 + ((ml) this).field_q;
                var10 = param0 + ((ml) this).field_m;
                if (var19 == 0) {
                  break L11;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              L14: {
                if ((1 & var7) != 0) {
                  break L14;
                } else {
                  var15 = ((ml) this).field_m + -(((ml) this).field_l / 2) + -((-1 + var7) / 2 * ((ml) this).field_l);
                  var10 = var15 + param3 * ((ml) this).field_l - -param0;
                  if (var19 == 0) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              var10 = ((ml) this).field_m - (((ml) this).field_l * (var7 / 2) + (-(param3 * ((ml) this).field_l) + -param0));
              break L13;
            }
            L15: {
              var11 = ((ml) this).field_q;
              if (18 != var6) {
                break L15;
              } else {
                var11 = var11 - (pk.field_b.field_I + pk.field_b.field_E);
                if (var19 == 0) {
                  break L11;
                } else {
                  break L15;
                }
              }
            }
            if (0 != var6) {
              break L11;
            } else {
              if (((ml) this).field_n == 2) {
                var10 = ((ml) this).field_m + param0;
                var11 = var11 + (pk.field_b.field_I + pk.field_b.field_E);
                break L11;
              } else {
                break L11;
              }
            }
          }
          if (var6 == 25) {
            L16: {
              L17: {
                if (((ml) this).field_p) {
                  break L17;
                } else {
                  var15 = 640 + ((ml) this).field_e;
                  if (var19 == 0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              var15 = -((ml) this).field_e;
              break L16;
            }
            L18: {
              L19: {
                var10 = var15 + -param0 + 120;
                if (nk.field_w <= 120) {
                  break L19;
                } else {
                  if (nk.field_w >= 172) {
                    break L19;
                  } else {
                    stackOut_52_0 = 1;
                    stackIn_54_0 = stackOut_52_0;
                    break L18;
                  }
                }
              }
              stackOut_53_0 = 0;
              stackIn_54_0 = stackOut_53_0;
              break L18;
            }
            L20: {
              L21: {
                var17 = stackIn_54_0;
                if (nk.field_w <= 468) {
                  break L21;
                } else {
                  if (nk.field_w >= 520) {
                    break L21;
                  } else {
                    stackOut_56_0 = 1;
                    stackIn_58_0 = stackOut_56_0;
                    break L20;
                  }
                }
              }
              stackOut_57_0 = 0;
              stackIn_58_0 = stackOut_57_0;
              break L20;
            }
            L22: {
              L23: {
                L24: {
                  var18 = stackIn_58_0;
                  if (!param1) {
                    break L24;
                  } else {
                    if (var17 != 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                L25: {
                  if (!param1) {
                    break L25;
                  } else {
                    if (var18 == 0) {
                      break L23;
                    } else {
                      break L25;
                    }
                  }
                }
                var16_ref_ea = bl.field_w;
                if (var19 == 0) {
                  break L22;
                } else {
                  break L23;
                }
              }
              var16_ref_ea = h.field_c;
              break L22;
            }
            L26: {
              L27: {
                L28: {
                  var16_ref_ea.g(var10, 83);
                  var10 = var15 + (-param0 + 468);
                  if (!param1) {
                    break L28;
                  } else {
                    if (var18 != 0) {
                      break L27;
                    } else {
                      break L28;
                    }
                  }
                }
                L29: {
                  if (!param1) {
                    break L29;
                  } else {
                    if (var17 == 0) {
                      break L27;
                    } else {
                      break L29;
                    }
                  }
                }
                var16_ref_ea = bl.field_w;
                if (var19 == 0) {
                  break L26;
                } else {
                  break L27;
                }
              }
              var16_ref_ea = h.field_c;
              break L26;
            }
            var16_ref_ea.a();
            var16_ref_ea.g(var10, 83);
            var16_ref_ea.a();
            return;
          } else {
            L30: {
              if (var6 != 20) {
                break L30;
              } else {
                if (!qd.field_S) {
                  var13 = 11184810;
                  var9 = dc.field_c;
                  var14 = 14235957;
                  break L30;
                } else {
                  break L30;
                }
              }
            }
            L31: {
              if (var6 != 21) {
                break L31;
              } else {
                if (!ci.field_b) {
                  var14 = 16755370;
                  var13 = 11184810;
                  var9 = jk.field_lb;
                  break L31;
                } else {
                  break L31;
                }
              }
            }
            L32: {
              L33: {
                if (var6 != 18) {
                  break L33;
                } else {
                  if (!g.a(-36)) {
                    break L33;
                  } else {
                    var15 = 3355443;
                    this.a(var11, var10, -22542, var8, 6776679, 14013909, var9, var15, param1);
                    if (var19 == 0) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
              }
              L34: {
                L35: {
                  if (!((ml) this).field_b) {
                    break L35;
                  } else {
                    if (((ml) this).field_n != 6) {
                      break L34;
                    } else {
                      break L35;
                    }
                  }
                }
                this.a(var11, var10, -22542, var8, var13, var14, var9, var12, param1);
                if (var19 == 0) {
                  break L32;
                } else {
                  break L34;
                }
              }
              this.a(var10, var12, var11, var9, var14, var8, var13, -1, param1);
              break L32;
            }
            L36: {
              if (6 == var6) {
                L37: {
                  var15 = var13;
                  var16 = 0;
                  if (kb.field_c != 2) {
                    break L37;
                  } else {
                    var16 = 20;
                    break L37;
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
                break L36;
              } else {
                break L36;
              }
            }
            L38: {
              if (var6 != 5) {
                break L38;
              } else {
                L39: {
                  var15 = var13;
                  var16 = 0;
                  if (2 == kb.field_c) {
                    var16 = 20;
                    break L39;
                  } else {
                    break L39;
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
                break L38;
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
        if (param1 >= -107) {
            return 83;
        }
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var12 = MinerDisturbance.field_ab;
        try {
          L0: {
            var4_int = 0;
            var5 = param3.field_D;
            var6 = param2.field_D;
            if (param0 == 93) {
              var7 = param3.field_C;
              var8 = param3.field_y;
              var9 = 0;
              L1: while (true) {
                stackOut_4_0 = ~var9;
                stackOut_4_1 = ~var7;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                L2: while (true) {
                  L3: {
                    if (stackIn_5_0 <= stackIn_5_1) {
                      break L3;
                    } else {
                      if (var12 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var10 = 0;
                        L4: while (true) {
                          L5: {
                            if (~var8 >= ~var10) {
                              break L5;
                            } else {
                              var11 = var5[var4_int];
                              stackOut_9_0 = ~var11;
                              stackOut_9_1 = -1;
                              stackIn_5_0 = stackOut_9_0;
                              stackIn_5_1 = stackOut_9_1;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              if (var12 != 0) {
                                continue L2;
                              } else {
                                L6: {
                                  L7: {
                                    L8: {
                                      if (stackIn_10_0 == stackIn_10_1) {
                                        break L8;
                                      } else {
                                        if (var11 == param1) {
                                          break L8;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var4_int++;
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L9: {
                                    L10: {
                                      if (var10 == 0) {
                                        break L10;
                                      } else {
                                        if (var5[-1 + var4_int] == 0) {
                                          break L10;
                                        } else {
                                          L11: {
                                            if (~var10 == ~(-1 + var8)) {
                                              break L11;
                                            } else {
                                              if (var5[1 + var4_int] == 0) {
                                                break L11;
                                              } else {
                                                L12: {
                                                  if (var9 == 0) {
                                                    break L12;
                                                  } else {
                                                    if (var5[var4_int + -var8] == 0) {
                                                      break L12;
                                                    } else {
                                                      L13: {
                                                        if (var7 - 1 == var9) {
                                                          break L13;
                                                        } else {
                                                          if (var5[var8 + var4_int] == 0) {
                                                            break L13;
                                                          } else {
                                                            break L9;
                                                          }
                                                        }
                                                      }
                                                      var11 = param1;
                                                      if (var12 == 0) {
                                                        break L9;
                                                      } else {
                                                        break L12;
                                                      }
                                                    }
                                                  }
                                                }
                                                var11 = param1;
                                                if (var12 == 0) {
                                                  break L9;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                          }
                                          var11 = param1;
                                          if (var12 == 0) {
                                            break L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    var11 = param1;
                                    break L9;
                                  }
                                  int incrementValue$1 = var4_int;
                                  var4_int++;
                                  var6[incrementValue$1] = var11;
                                  break L6;
                                }
                                var10++;
                                if (var12 == 0) {
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var9++;
                          if (var12 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("ml.J(").append(param0).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L14;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L14;
            }
          }
          L15: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param3 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L15;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L15;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            L2: {
              ((ml) this).field_o.field_e = 0;
              if (((ml) this).field_n == 1) {
                break L2;
              } else {
                if (((ml) this).field_n == 2) {
                  ((ml) this).field_o.field_e = 2;
                  if (MinerDisturbance.field_ab == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                } else {
                  break L0;
                }
              }
            }
            ((ml) this).field_o.field_e = 1;
            break L0;
          }
        }
        L3: {
          stackOut_9_0 = ((ml) this).field_o;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (u.b(-4440) >= mk.b(117)) {
            stackOut_11_0 = (nn) (Object) stackIn_11_0;
            stackOut_11_1 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = (nn) (Object) stackIn_10_0;
            stackOut_10_1 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
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
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_59_0 = 0;
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
                    if (param1 <= 120) {
                      break L2;
                    } else {
                      if (param1 >= 172) {
                        break L2;
                      } else {
                        return 4;
                      }
                    }
                  }
                  if (param1 > 468) {
                    if (520 > param1) {
                      return 4;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L3: {
          L4: {
            if (var4 != 0) {
              break L4;
            } else {
              if (param2 > pk.field_b.field_I + ((ml) this).field_q + pk.field_b.field_E) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (((ml) this).field_n == 1) {
              break L5;
            } else {
              if (((ml) this).field_q > param2) {
                break L3;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (1 != ((ml) this).field_n) {
              break L6;
            } else {
              if (pk.field_b.field_E + (((ml) this).field_q - pk.field_b.field_I) <= param2) {
                break L6;
              } else {
                return -1;
              }
            }
          }
          L7: {
            if (var4 == 0) {
              break L7;
            } else {
              if (param2 <= 3 * (pk.field_b.field_I + pk.field_b.field_E) + ((ml) this).field_q) {
                break L7;
              } else {
                return -1;
              }
            }
          }
          L8: {
            L9: {
              var5 = ((ml) this).field_r.length;
              if (1 == ((ml) this).field_n) {
                break L9;
              } else {
                if (var4 == 0) {
                  break L8;
                } else {
                  var5--;
                  if (pj.field_a <= 0) {
                    break L8;
                  } else {
                    var5--;
                    if (var10 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            var5--;
            break L8;
          }
          L10: {
            L11: {
              if (0 == (var5 & 1)) {
                break L11;
              } else {
                var6 = ((ml) this).field_m - var5 / 2 * ((ml) this).field_l;
                if (var10 == 0) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            var6 = -((var5 + -1) / 2 * ((ml) this).field_l) + (-(((ml) this).field_l / 2) + ((ml) this).field_m);
            break L10;
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
                  var7 = pk.field_b.c(m.field_g[0], 640);
                  if (param1 > -(var7 / 2) + ((ml) this).field_m) {
                    if (((ml) this).field_m - -(var7 / 2) > param1) {
                      return 3;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                }
              }
            }
          }
          var7 = var6;
          var8 = 0;
          if (param0 == 640) {
            L14: while (true) {
              if (var5 > var8) {
                var9 = pk.field_b.c(m.field_g[((ml) this).field_r[var8]], 640);
                stackOut_59_0 = var7 + -(var9 / 2);
                stackIn_61_0 = stackOut_59_0;
                stackIn_60_0 = stackOut_59_0;
                if (var10 == 0) {
                  L15: {
                    if (stackIn_61_0 >= param1) {
                      break L15;
                    } else {
                      if (param1 < var7 + var9 / 2) {
                        return var8;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var8++;
                  var7 = var7 + ((ml) this).field_l;
                  continue L14;
                } else {
                  return stackIn_60_0;
                }
              } else {
                return -1;
              }
            }
          } else {
            return -122;
          }
        }
        return -1;
    }

    private final void a(int param0, boolean param1, int param2, byte param3) {
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
        String stackIn_45_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        String stackOut_44_0 = null;
        String stackOut_43_0 = null;
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
              sn.field_b[var5] = gk.a(3, 1, var6, eg.a(121, -18), 10);
              break L3;
            } else {
              break L3;
            }
          }
          L5: {
            L6: {
              if (!((ml) this).field_p) {
                break L6;
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
                if (var12 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (param1) {
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                break L8;
              } else {
                stackOut_24_0 = 640;
                stackIn_26_0 = stackOut_24_0;
                break L8;
              }
            }
            var6 = stackIn_26_0 + ((ml) this).field_e;
            break L5;
          }
          L9: {
            var7 = var6;
            if (((ml) this).field_j != 3) {
              break L9;
            } else {
              var7 = 0;
              break L9;
            }
          }
          L10: {
            L11: {
              if (param2 == 0) {
                break L11;
              } else {
                L12: {
                  if (param2 == 2) {
                    break L12;
                  } else {
                    if (param2 == 1) {
                      ld.field_x.f(var7 + -(ld.field_x.field_x >> 1) + (320 + -param0), 6);
                      if (var12 == 0) {
                        break L10;
                      } else {
                        break L12;
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                sk.field_e.f(var7 + 640 + (-(sk.field_e.field_x >> 1) + -param0 + -320), 6);
                if (var12 == 0) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            on.field_x.f(640 + (-(on.field_x.field_x >> 1) + (320 + (-param0 + -640)) - -var7), 6);
            break L10;
          }
          L13: {
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
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            if (285 <= var11) {
              break L14;
            } else {
              var11 = var11 + ak.field_a[1].field_A;
              break L14;
            }
          }
          L15: {
            g.a(80, var11, var9 + (var8 - var10) / 2, var10, (byte) 113, ak.field_a);
            ff.field_f.f(var9 - -((var8 + -ff.field_f.field_x) / 2), 85);
            if (0 != var5) {
              stackOut_44_0 = rj.field_a;
              stackIn_45_0 = stackOut_44_0;
              break L15;
            } else {
              stackOut_43_0 = gn.field_a;
              stackIn_45_0 = stackOut_43_0;
              break L15;
            }
          }
          bd.a(stackIn_45_0, var9 - -(var8 / 2), 0, 109);
          this.a(23, var5, var8, sn.field_b[var5], var9, param2);
          int discarded$1 = ce.field_d.a(am.field_N, 0 - param0 - -130 - -var6, 310, 380, 30, 1, -1, 1, 1, 0);
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
        Object var18 = null;
        int stackIn_8_0 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_33_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var17 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (!param3.field_t) {
                      break L4;
                    } else {
                      L5: {
                        if (null != param3.field_p) {
                          break L5;
                        } else {
                          var7_ref = ff.field_d;
                          var8 = pk.field_b.field_I + 176;
                          pk.field_b.b(var7_ref, param4 + param2 / 2, var8, 16689702, -1);
                          if (var17 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        var7_int = 0;
                        var8_ref_String__ = param3.field_p[param5];
                        var9 = ce.field_d;
                        if (var8_ref_String__ == null) {
                          break L6;
                        } else {
                          L7: {
                            if (vk.field_a != param1) {
                              stackOut_7_0 = 0;
                              stackIn_8_0 = stackOut_7_0;
                              break L7;
                            } else {
                              stackOut_6_0 = 1;
                              stackIn_8_0 = stackOut_6_0;
                              break L7;
                            }
                          }
                          var10_int = stackIn_8_0;
                          var11_ref_int__ = param3.field_n[param5];
                          var12 = 100 - (-var9.field_I + -25);
                          var13 = 0;
                          var14_int = 0;
                          L8: while (true) {
                            L9: {
                              if (var14_int >= 10) {
                                break L9;
                              } else {
                                stackOut_10_0 = null;
                                stackIn_34_0 = stackOut_10_0;
                                stackIn_11_0 = stackOut_10_0;
                                if (var17 != 0) {
                                  break L2;
                                } else {
                                  L10: {
                                    if (stackIn_11_0 != (Object) (Object) var8_ref_String__[var14_int]) {
                                      L11: {
                                        L12: {
                                          var7_int = 1;
                                          var15 = var11_ref_int__[var14_int];
                                          var16 = var8_ref_String__[var14_int] + " <col=666666>" + this.d(256, var15, param1) + "</col>";
                                          if (var10_int == 0) {
                                            break L12;
                                          } else {
                                            if (var13 != 0) {
                                              break L12;
                                            } else {
                                              if (ha.field_b < 0) {
                                                break L12;
                                              } else {
                                                if (var15 != Math.abs(ha.field_b)) {
                                                  break L12;
                                                } else {
                                                  if (ci.a(-27933, var8_ref_String__[var14_int])) {
                                                    break L11;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var9.c(var14_int - -1 + ". ", 45 + param4, var12, 1, -1);
                                        var9.a(var16, 45 + param4, var12, 1, -1);
                                        var9.c(ab.a(0, kb.field_c, true, (long)var15, true), param2 + (param4 - 35), var12, 1, -1);
                                        if (var17 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      var13 = 1;
                                      var9.c(1 + var14_int + ". ", param4 + 45, var12, 16610816, -1);
                                      var9.a(var16, 45 + param4, var12, 16610816, -1);
                                      var9.c(ab.a(0, kb.field_c, true, (long)var15, true), param2 + (param4 + -35), var12, 16610816, -1);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var12 += 17;
                                  var14_int++;
                                  if (var17 == 0) {
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            if (var13 != 0) {
                              break L6;
                            } else {
                              if (ha.field_b <= 0) {
                                break L6;
                              } else {
                                if (var10_int == 0) {
                                  break L6;
                                } else {
                                  var14 = ti.field_J + " " + this.d(256, ha.field_b, param1);
                                  var9.a(var14, param4 - -45, var12, 16724225, -1);
                                  var9.c(ab.a(0, kb.field_c, true, (long)Math.abs(ha.field_b), true), param2 + (param4 + -35), var12, 16724225, -1);
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                      }
                      L13: {
                        if (var7_int == 0) {
                          var10 = ae.field_b;
                          var11 = 76 + pk.field_b.field_I + 100;
                          pk.field_b.b(var10, param4 - -(param2 / 2), var11, 16689702, -1);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      if (var17 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var7_ref = nj.field_d;
                  var8 = 100 + pk.field_b.field_I + 76;
                  pk.field_b.b(var7_ref, param2 / 2 + param4, var8, 16689702, -1);
                  break L3;
                }
                if (param0 == 23) {
                  break L1;
                } else {
                  stackOut_33_0 = null;
                  stackIn_34_0 = stackOut_33_0;
                  break L2;
                }
              }
              var18 = null;
              ml.a((sb) (Object) stackIn_34_0, (byte) 74, (sb) null);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var7;
            stackOut_36_1 = new StringBuilder().append("ml.BA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L14;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
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
          L2: {
            L3: {
              if (1 == ((ml) this).field_n) {
                break L3;
              } else {
                L4: {
                  if (3 == ((ml) this).field_n) {
                    break L4;
                  } else {
                    if (-9 == ((ml) this).field_n) {
                      break L4;
                    } else {
                      if (-6 != ((ml) this).field_n) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                c.a((byte) -103);
                if (var5 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((ml) this).field_o.field_e >= 0) {
              L5: {
                L6: {
                  if (-1 != ((ml) this).field_k) {
                    break L6;
                  } else {
                    if (-12 == ((ml) this).field_r[((ml) this).field_o.field_e]) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (((ml) this).field_k != 6) {
                  break L2;
                } else {
                  if (((ml) this).field_r[((ml) this).field_o.field_e] == 10) {
                    break L5;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = 0;
              L7: while (true) {
                if (((ml) this).field_r.length <= var2) {
                  break L2;
                } else {
                  stackOut_21_0 = 0;
                  stackOut_21_1 = ((ml) this).field_r[var2];
                  stackIn_28_0 = stackOut_21_0;
                  stackIn_28_1 = stackOut_21_1;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L8: {
                      if (stackIn_22_0 == stackIn_22_1) {
                        ((ml) this).field_o.field_e = var2;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var2++;
                    if (var5 == 0) {
                      continue L7;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            } else {
              break L2;
            }
          }
          stackOut_27_0 = param0;
          stackOut_27_1 = 8779;
          stackIn_28_0 = stackOut_27_0;
          stackIn_28_1 = stackOut_27_1;
          break L1;
        }
        L9: {
          if (stackIn_28_0 == stackIn_28_1) {
            break L9;
          } else {
            ((ml) this).field_k = -5;
            break L9;
          }
        }
        L10: {
          L11: {
            if (((ml) this).field_n == 11) {
              break L11;
            } else {
              if (!((ml) this).field_b) {
                break L11;
              } else {
                L12: {
                  if (((ml) this).field_n == 6) {
                    break L12;
                  } else {
                    ((ml) this).field_o.a(((ml) this).field_q, ((ml) this).field_m, 140, ((ml) this).field_l, ((ml) this).field_h + ((ml) this).field_m);
                    if (var5 == 0) {
                      break L10;
                    } else {
                      break L12;
                    }
                  }
                }
                var2 = this.c(-21377, m.field_e, wi.field_w);
                var3 = this.c(-21377, gb.field_e, nk.field_w);
                ((ml) this).field_o.a(var3, var2, -1);
                if (var5 == 0) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
          }
          L13: {
            var2 = -1;
            var3 = -1;
            if (((ml) this).field_n != 11) {
              break L13;
            } else {
              var4 = wk.field_a.a(true, 1);
              if (1 != var4) {
                if (var4 == 2) {
                  tk.field_a = true;
                  return 4;
                } else {
                  if (var5 == 0) {
                    break L10;
                  } else {
                    break L13;
                  }
                }
              } else {
                tk.field_a = true;
                return 4;
              }
            }
          }
          var2 = this.a(640, wi.field_w, m.field_e);
          var3 = this.a(param0 + -8139, nk.field_w, gb.field_e);
          ((ml) this).field_o.a(var3, var2, param0 ^ -8780);
          break L10;
        }
        if (((ml) this).field_o.field_e != -1) {
          return this.b(468, ((ml) this).field_o.field_e);
        } else {
          return -2;
        }
    }

    private final String d(int param0, int param1, int param2) {
        if (param0 == 256) {
          if (0 == param2) {
            if (0 != param1) {
              if (param1 >= 1000) {
                if (5000 <= param1) {
                  if (param1 >= 25000) {
                    if (param1 >= 50000) {
                      if (param1 >= 100000) {
                        if (param1 >= 200000) {
                          if (500000 <= param1) {
                            if (1000000 > param1) {
                              return dh.field_c[0][8];
                            } else {
                              return dh.field_c[0][9];
                            }
                          } else {
                            return dh.field_c[0][7];
                          }
                        } else {
                          return dh.field_c[0][6];
                        }
                      } else {
                        return dh.field_c[0][5];
                      }
                    } else {
                      return dh.field_c[0][4];
                    }
                  } else {
                    return dh.field_c[0][3];
                  }
                } else {
                  return dh.field_c[0][2];
                }
              } else {
                return dh.field_c[0][1];
              }
            } else {
              return dh.field_c[0][0];
            }
          } else {
            if (0 != param1) {
              if (5000 <= param1) {
                if (-25001 >= param1) {
                  if (param1 >= 50000) {
                    if (-100001 <= param1) {
                      if (param1 <= -200001) {
                        if (-500001 <= param1) {
                          if (1000000 <= param1) {
                            if (param1 >= 2000000) {
                              return dh.field_c[1][9];
                            } else {
                              return dh.field_c[1][8];
                            }
                          } else {
                            return dh.field_c[1][7];
                          }
                        } else {
                          return dh.field_c[1][6];
                        }
                      } else {
                        return dh.field_c[1][5];
                      }
                    } else {
                      return dh.field_c[1][4];
                    }
                  } else {
                    return dh.field_c[1][3];
                  }
                } else {
                  return dh.field_c[1][2];
                }
              } else {
                return dh.field_c[1][1];
              }
            } else {
              return dh.field_c[1][0];
            }
          }
        } else {
          return null;
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
        g.a(param0, 235, var4, 410, (byte) 113, hd.field_d);
        String var5 = ae.field_b;
        int var6 = 176 + pk.field_b.field_I;
        pk.field_b.b(var5, var3 + (-param1 + 640) - -320, var6, 16689702, -1);
        int discarded$0 = ce.field_d.a(vb.field_d, var3 + (130 + -param1) + 640, 260, 380, 30, 1, -1, 1, 1, 0);
    }

    private final void a(int param0, int param1, int param2, vm param3, int param4, int param5, String param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              param0 += 42;
              param3.b(param6, -2 + param1, param0, 4, param7);
              param3.b(param6, 2 + param1, param0, 4, param7);
              param3.b(param6, param1, param0 + -2, 4, param7);
              param3.b(param6, param1, param0 + 2, 4, param7);
              if (param2 == -22542) {
                break L1;
              } else {
                ((ml) this).field_n = 46;
                break L1;
              }
            }
            L2: {
              L3: {
                param3.b(param6, -1 + param1, -1 + param0, 4, param7);
                param3.b(param6, 1 + param1, param0 + -1, 4, param7);
                param3.b(param6, -1 + param1, 1 + param0, 4, param7);
                param3.b(param6, 1 + param1, param0 - -1, 4, param7);
                if (param8) {
                  break L3;
                } else {
                  param3.b(param6, param1, param0, param4, -1);
                  if (MinerDisturbance.field_ab == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              param3.b(param6, param1, param0, param5, -1);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var10;
            stackOut_7_1 = new StringBuilder().append("ml.W(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    ml(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = MinerDisturbance.field_ab;
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
                    if (var11 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          if (var10_int < 8) {
                            break L5;
                          } else {
                            ti.field_N[var10_int] = 390;
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        ti.field_N[var10_int] = -10 + -ib.field_a.field_x + 390;
                        break L4;
                      }
                      var10_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var10;
            stackOut_13_1 = new StringBuilder().append("ml.<init>(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
