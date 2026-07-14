/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ac extends tc {
    private int field_z;
    private int field_y;
    static String field_u;
    private int field_q;
    private int field_w;
    static String field_x;
    private int field_v;
    static int field_p;
    static ru[] field_k;
    private int field_l;
    static boolean field_n;
    static int field_m;
    static String field_s;
    private int field_t;
    private int field_r;
    private int field_o;

    final void a(ha param0, int param1) {
        if (param1 == -12614) {
          L0: {
            param0.field_H[((ac) this).field_q] = param0.field_H[((ac) this).field_q] + ((ac) this).field_w;
            if (1000000000 < param0.field_H[((ac) this).field_q]) {
              param0.field_H[((ac) this).field_q] = 1000000000;
              break L0;
            } else {
              break L0;
            }
          }
          if ((((ac) this).field_y ^ -1) == -4) {
            ((ac) this).d(96);
            return;
          } else {
            if ((((ac) this).field_y ^ -1) != -5) {
              param0.field_fb[param0.o(((ac) this).field_q, -1)] = param0.field_fb[param0.o(((ac) this).field_q, -1)] + ((ac) this).field_w;
              if ((param0.field_fb[param0.o(((ac) this).field_q, param1 + 12613)] ^ -1) < -1000000001) {
                param0.field_fb[param0.o(((ac) this).field_q, -1)] = 1000000000;
                ((ac) this).d(96);
                return;
              } else {
                ((ac) this).d(96);
                return;
              }
            } else {
              ((ac) this).d(96);
              return;
            }
          }
        } else {
          L1: {
            field_x = null;
            param0.field_H[((ac) this).field_q] = param0.field_H[((ac) this).field_q] + ((ac) this).field_w;
            if (1000000000 < param0.field_H[((ac) this).field_q]) {
              param0.field_H[((ac) this).field_q] = 1000000000;
              break L1;
            } else {
              break L1;
            }
          }
          if ((((ac) this).field_y ^ -1) == -4) {
            ((ac) this).d(96);
            return;
          } else {
            if ((((ac) this).field_y ^ -1) != -5) {
              param0.field_fb[param0.o(((ac) this).field_q, -1)] = param0.field_fb[param0.o(((ac) this).field_q, -1)] + ((ac) this).field_w;
              if ((param0.field_fb[param0.o(((ac) this).field_q, param1 + 12613)] ^ -1) < -1000000001) {
                param0.field_fb[param0.o(((ac) this).field_q, -1)] = 1000000000;
                ((ac) this).d(96);
                return;
              } else {
                ((ac) this).d(96);
                return;
              }
            } else {
              ((ac) this).d(96);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_x = null;
        field_u = null;
        field_s = null;
        if (param0 <= 19) {
            ac.a((byte) 70);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = -param0 + (((ac) this).field_v >> -1668473628);
        if (param2 <= -6) {
          var5 = -param1 + (((ac) this).field_l >> -1383250204);
          if (((ac) this).field_o <= 100) {
            if (-1 >= (((ac) this).field_o ^ -1)) {
              var5 = (((ac) this).field_o * 30 + var5 * (-((ac) this).field_o + 100)) / 100;
              var4 = (var4 * (100 - ((ac) this).field_o) + 210 * ((ac) this).field_o) / 100;
              if ((((ac) this).field_o ^ -1) <= -1) {
                vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
                return;
              } else {
                return;
              }
            } else {
              if ((((ac) this).field_o ^ -1) <= -1) {
                vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
                return;
              } else {
                return;
              }
            }
          } else {
            var4 = 210;
            var5 = 30;
            if ((((ac) this).field_o ^ -1) > -1) {
              return;
            } else {
              vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
              return;
            }
          }
        } else {
          ((ac) this).field_o = 62;
          var5 = -param1 + (((ac) this).field_l >> -1383250204);
          if (((ac) this).field_o <= 100) {
            if (-1 >= (((ac) this).field_o ^ -1)) {
              var5 = (((ac) this).field_o * 30 + var5 * (-((ac) this).field_o + 100)) / 100;
              var4 = (var4 * (100 - ((ac) this).field_o) + 210 * ((ac) this).field_o) / 100;
              if ((((ac) this).field_o ^ -1) > -1) {
                return;
              } else {
                vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
                return;
              }
            } else {
              if ((((ac) this).field_o ^ -1) > -1) {
                return;
              } else {
                vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
                return;
              }
            }
          } else {
            var4 = 210;
            var5 = 30;
            if ((((ac) this).field_o ^ -1) > -1) {
              return;
            } else {
              vc.field_k[((ac) this).field_t].g(-8 + var4, -8 + var5);
              return;
            }
          }
        }
    }

    final void b(ha param0, int param1) {
        Object var4 = null;
        if (((ac) this).field_o >= 0) {
          L0: {
            ((ac) this).field_l = ((ac) this).field_l + ((ac) this).field_z;
            ((ac) this).field_v = ((ac) this).field_v + ((ac) this).field_r;
            ((ac) this).field_r = ((ac) this).field_r + 1;
            if (1600 >= ((ac) this).field_l) {
              ((ac) this).field_z = ((ac) this).field_z + 1;
              break L0;
            } else {
              ((ac) this).field_z = ((ac) this).field_z - 1;
              break L0;
            }
          }
          ((ac) this).field_o = ((ac) this).field_o + 1;
          if (-1 == ((ac) this).field_o) {
            L1: {
              if (-1 != ((ac) this).field_y) {
                break L1;
              } else {
                if (!uu.field_b) {
                  te discarded$47 = ub.a((byte) 29, el.field_b[0]);
                  ep.field_f = false;
                  uu.field_b = true;
                  break L1;
                } else {
                  if (((ac) this).field_y != 1) {
                    L2: {
                      if (((ac) this).field_y != 2) {
                        break L2;
                      } else {
                        if (wt.field_G) {
                          break L2;
                        } else {
                          te discarded$48 = ub.a((byte) 113, el.field_b[0]);
                          ep.field_f = false;
                          wt.field_G = true;
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (((ac) this).field_y != 3) {
                        break L3;
                      } else {
                        if (!ep.field_f) {
                          te discarded$49 = ub.a((byte) 57, el.field_b[0]);
                          et.field_d = false;
                          wt.field_G = false;
                          uu.field_b = false;
                          ep.field_f = true;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (((ac) this).field_o >= 0) {
                        ((ac) this).field_o = ((ac) this).field_o + 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (param1 == 100) {
                        break L5;
                      } else {
                        var4 = null;
                        ((ac) this).b((ha) null, -123);
                        break L5;
                      }
                    }
                    L6: {
                      if ((((ac) this).field_o ^ -1) > -101) {
                        break L6;
                      } else {
                        ((ac) this).a(param0, -12614);
                        te discarded$50 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                        break L6;
                      }
                    }
                    return;
                  } else {
                    L7: {
                      if (et.field_d) {
                        break L7;
                      } else {
                        te discarded$51 = ub.a((byte) 50, el.field_b[0]);
                        ep.field_f = false;
                        et.field_d = true;
                        break L7;
                      }
                    }
                    L8: {
                      if (((ac) this).field_y != 2) {
                        break L8;
                      } else {
                        if (wt.field_G) {
                          break L8;
                        } else {
                          te discarded$52 = ub.a((byte) 113, el.field_b[0]);
                          ep.field_f = false;
                          wt.field_G = true;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (((ac) this).field_y != 3) {
                        break L9;
                      } else {
                        if (!ep.field_f) {
                          te discarded$53 = ub.a((byte) 57, el.field_b[0]);
                          et.field_d = false;
                          wt.field_G = false;
                          uu.field_b = false;
                          ep.field_f = true;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (((ac) this).field_o >= 0) {
                        ((ac) this).field_o = ((ac) this).field_o + 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param1 == 100) {
                        break L11;
                      } else {
                        var4 = null;
                        ((ac) this).b((ha) null, -123);
                        break L11;
                      }
                    }
                    L12: {
                      if ((((ac) this).field_o ^ -1) > -101) {
                        break L12;
                      } else {
                        ((ac) this).a(param0, -12614);
                        te discarded$54 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                        break L12;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L13: {
              if (((ac) this).field_y != 1) {
                break L13;
              } else {
                if (et.field_d) {
                  break L13;
                } else {
                  L14: {
                    te discarded$55 = ub.a((byte) 50, el.field_b[0]);
                    ep.field_f = false;
                    et.field_d = true;
                    if (((ac) this).field_y != 2) {
                      break L14;
                    } else {
                      if (wt.field_G) {
                        break L14;
                      } else {
                        te discarded$56 = ub.a((byte) 113, el.field_b[0]);
                        ep.field_f = false;
                        wt.field_G = true;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (((ac) this).field_y != 3) {
                      break L15;
                    } else {
                      if (!ep.field_f) {
                        te discarded$57 = ub.a((byte) 57, el.field_b[0]);
                        et.field_d = false;
                        wt.field_G = false;
                        uu.field_b = false;
                        ep.field_f = true;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (((ac) this).field_o >= 0) {
                      ((ac) this).field_o = ((ac) this).field_o + 1;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (param1 == 100) {
                      break L17;
                    } else {
                      var4 = null;
                      ((ac) this).b((ha) null, -123);
                      break L17;
                    }
                  }
                  L18: {
                    if ((((ac) this).field_o ^ -1) > -101) {
                      break L18;
                    } else {
                      ((ac) this).a(param0, -12614);
                      te discarded$58 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                      break L18;
                    }
                  }
                  return;
                }
              }
            }
            if (((ac) this).field_y == 2) {
              if (!wt.field_G) {
                L19: {
                  te discarded$59 = ub.a((byte) 113, el.field_b[0]);
                  ep.field_f = false;
                  wt.field_G = true;
                  if (((ac) this).field_y != 3) {
                    break L19;
                  } else {
                    if (!ep.field_f) {
                      te discarded$60 = ub.a((byte) 57, el.field_b[0]);
                      et.field_d = false;
                      wt.field_G = false;
                      uu.field_b = false;
                      ep.field_f = true;
                      break L19;
                    } else {
                      L20: {
                        if (((ac) this).field_o >= 0) {
                          ((ac) this).field_o = ((ac) this).field_o + 1;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        if (param1 == 100) {
                          break L21;
                        } else {
                          var4 = null;
                          ((ac) this).b((ha) null, -123);
                          break L21;
                        }
                      }
                      L22: {
                        if ((((ac) this).field_o ^ -1) > -101) {
                          break L22;
                        } else {
                          ((ac) this).a(param0, -12614);
                          te discarded$61 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                          break L22;
                        }
                      }
                      return;
                    }
                  }
                }
                L23: {
                  if (((ac) this).field_o >= 0) {
                    ((ac) this).field_o = ((ac) this).field_o + 1;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                if (param1 == 100) {
                  if ((((ac) this).field_o ^ -1) > -101) {
                    return;
                  } else {
                    ((ac) this).a(param0, -12614);
                    te discarded$62 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                    return;
                  }
                } else {
                  L24: {
                    var4 = null;
                    ((ac) this).b((ha) null, -123);
                    if ((((ac) this).field_o ^ -1) > -101) {
                      break L24;
                    } else {
                      ((ac) this).a(param0, -12614);
                      te discarded$63 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                      break L24;
                    }
                  }
                  return;
                }
              } else {
                L25: {
                  if (((ac) this).field_y != 3) {
                    break L25;
                  } else {
                    if (!ep.field_f) {
                      te discarded$64 = ub.a((byte) 57, el.field_b[0]);
                      et.field_d = false;
                      wt.field_G = false;
                      uu.field_b = false;
                      ep.field_f = true;
                      break L25;
                    } else {
                      L26: {
                        if (((ac) this).field_o >= 0) {
                          ((ac) this).field_o = ((ac) this).field_o + 1;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      if (param1 == 100) {
                        if ((((ac) this).field_o ^ -1) <= -101) {
                          ((ac) this).a(param0, -12614);
                          te discarded$65 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L27: {
                          var4 = null;
                          ((ac) this).b((ha) null, -123);
                          if ((((ac) this).field_o ^ -1) > -101) {
                            break L27;
                          } else {
                            ((ac) this).a(param0, -12614);
                            te discarded$66 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                            break L27;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L28: {
                  if (((ac) this).field_o >= 0) {
                    ((ac) this).field_o = ((ac) this).field_o + 1;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                if (param1 == 100) {
                  if ((((ac) this).field_o ^ -1) <= -101) {
                    ((ac) this).a(param0, -12614);
                    te discarded$67 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var4 = null;
                  ((ac) this).b((ha) null, -123);
                  if ((((ac) this).field_o ^ -1) <= -101) {
                    ((ac) this).a(param0, -12614);
                    te discarded$68 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L29: {
                if (((ac) this).field_y != 3) {
                  break L29;
                } else {
                  if (!ep.field_f) {
                    te discarded$69 = ub.a((byte) 57, el.field_b[0]);
                    et.field_d = false;
                    wt.field_G = false;
                    uu.field_b = false;
                    ep.field_f = true;
                    break L29;
                  } else {
                    L30: {
                      if (((ac) this).field_o >= 0) {
                        ((ac) this).field_o = ((ac) this).field_o + 1;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    if (param1 == 100) {
                      if ((((ac) this).field_o ^ -1) <= -101) {
                        ((ac) this).a(param0, -12614);
                        te discarded$70 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L31: {
                        var4 = null;
                        ((ac) this).b((ha) null, -123);
                        if ((((ac) this).field_o ^ -1) > -101) {
                          break L31;
                        } else {
                          ((ac) this).a(param0, -12614);
                          te discarded$71 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                          break L31;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L32: {
                if (((ac) this).field_o >= 0) {
                  ((ac) this).field_o = ((ac) this).field_o + 1;
                  break L32;
                } else {
                  break L32;
                }
              }
              if (param1 == 100) {
                if ((((ac) this).field_o ^ -1) <= -101) {
                  ((ac) this).a(param0, -12614);
                  te discarded$72 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                  return;
                } else {
                  return;
                }
              } else {
                var4 = null;
                ((ac) this).b((ha) null, -123);
                if ((((ac) this).field_o ^ -1) <= -101) {
                  ((ac) this).a(param0, -12614);
                  te discarded$73 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L33: {
              if (((ac) this).field_o >= 0) {
                ((ac) this).field_o = ((ac) this).field_o + 1;
                break L33;
              } else {
                break L33;
              }
            }
            if (param1 == 100) {
              if ((((ac) this).field_o ^ -1) > -101) {
                return;
              } else {
                ((ac) this).a(param0, -12614);
                te discarded$74 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                return;
              }
            } else {
              var4 = null;
              ((ac) this).b((ha) null, -123);
              if ((((ac) this).field_o ^ -1) > -101) {
                return;
              } else {
                ((ac) this).a(param0, -12614);
                te discarded$75 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                return;
              }
            }
          }
        } else {
          L34: {
            ((ac) this).field_o = ((ac) this).field_o + 1;
            if (-1 == ((ac) this).field_o) {
              L35: {
                if (-1 != ((ac) this).field_y) {
                  break L35;
                } else {
                  if (!uu.field_b) {
                    te discarded$76 = ub.a((byte) 29, el.field_b[0]);
                    ep.field_f = false;
                    uu.field_b = true;
                    break L35;
                  } else {
                    L36: {
                      if (((ac) this).field_y == 1) {
                        if (!et.field_d) {
                          te discarded$77 = ub.a((byte) 50, el.field_b[0]);
                          ep.field_f = false;
                          et.field_d = true;
                          if (((ac) this).field_y != 2) {
                            break L36;
                          } else {
                            if (wt.field_G) {
                              break L36;
                            } else {
                              te discarded$78 = ub.a((byte) 113, el.field_b[0]);
                              ep.field_f = false;
                              wt.field_G = true;
                              break L36;
                            }
                          }
                        } else {
                          if (((ac) this).field_y != 2) {
                            break L36;
                          } else {
                            if (wt.field_G) {
                              break L36;
                            } else {
                              te discarded$79 = ub.a((byte) 113, el.field_b[0]);
                              ep.field_f = false;
                              wt.field_G = true;
                              break L36;
                            }
                          }
                        }
                      } else {
                        if (((ac) this).field_y != 2) {
                          break L36;
                        } else {
                          if (wt.field_G) {
                            break L36;
                          } else {
                            te discarded$80 = ub.a((byte) 113, el.field_b[0]);
                            ep.field_f = false;
                            wt.field_G = true;
                            break L36;
                          }
                        }
                      }
                    }
                    L37: {
                      if (((ac) this).field_y != 3) {
                        break L37;
                      } else {
                        if (!ep.field_f) {
                          te discarded$81 = ub.a((byte) 57, el.field_b[0]);
                          et.field_d = false;
                          wt.field_G = false;
                          uu.field_b = false;
                          ep.field_f = true;
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                    }
                    L38: {
                      if (((ac) this).field_o >= 0) {
                        ((ac) this).field_o = ((ac) this).field_o + 1;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    L39: {
                      if (param1 == 100) {
                        break L39;
                      } else {
                        var4 = null;
                        ((ac) this).b((ha) null, -123);
                        break L39;
                      }
                    }
                    L40: {
                      if ((((ac) this).field_o ^ -1) > -101) {
                        break L40;
                      } else {
                        ((ac) this).a(param0, -12614);
                        te discarded$82 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                        break L40;
                      }
                    }
                    return;
                  }
                }
              }
              L41: {
                if (((ac) this).field_y != 1) {
                  break L41;
                } else {
                  if (et.field_d) {
                    break L41;
                  } else {
                    L42: {
                      te discarded$83 = ub.a((byte) 50, el.field_b[0]);
                      ep.field_f = false;
                      et.field_d = true;
                      if (((ac) this).field_y != 2) {
                        break L42;
                      } else {
                        if (wt.field_G) {
                          break L42;
                        } else {
                          te discarded$84 = ub.a((byte) 113, el.field_b[0]);
                          ep.field_f = false;
                          wt.field_G = true;
                          break L42;
                        }
                      }
                    }
                    L43: {
                      if (((ac) this).field_y != 3) {
                        break L43;
                      } else {
                        if (!ep.field_f) {
                          te discarded$85 = ub.a((byte) 57, el.field_b[0]);
                          et.field_d = false;
                          wt.field_G = false;
                          uu.field_b = false;
                          ep.field_f = true;
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                    }
                    L44: {
                      if (((ac) this).field_o >= 0) {
                        ((ac) this).field_o = ((ac) this).field_o + 1;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    L45: {
                      if (param1 == 100) {
                        break L45;
                      } else {
                        var4 = null;
                        ((ac) this).b((ha) null, -123);
                        break L45;
                      }
                    }
                    L46: {
                      if ((((ac) this).field_o ^ -1) > -101) {
                        break L46;
                      } else {
                        ((ac) this).a(param0, -12614);
                        te discarded$86 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                        break L46;
                      }
                    }
                    return;
                  }
                }
              }
              L47: {
                if (((ac) this).field_y != 2) {
                  break L47;
                } else {
                  if (wt.field_G) {
                    break L47;
                  } else {
                    L48: {
                      te discarded$87 = ub.a((byte) 113, el.field_b[0]);
                      ep.field_f = false;
                      wt.field_G = true;
                      if (((ac) this).field_y != 3) {
                        break L48;
                      } else {
                        if (!ep.field_f) {
                          te discarded$88 = ub.a((byte) 57, el.field_b[0]);
                          et.field_d = false;
                          wt.field_G = false;
                          uu.field_b = false;
                          ep.field_f = true;
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                    }
                    L49: {
                      if (((ac) this).field_o >= 0) {
                        ((ac) this).field_o = ((ac) this).field_o + 1;
                        break L49;
                      } else {
                        break L49;
                      }
                    }
                    L50: {
                      if (param1 == 100) {
                        break L50;
                      } else {
                        var4 = null;
                        ((ac) this).b((ha) null, -123);
                        break L50;
                      }
                    }
                    L51: {
                      if ((((ac) this).field_o ^ -1) > -101) {
                        break L51;
                      } else {
                        ((ac) this).a(param0, -12614);
                        te discarded$89 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                        break L51;
                      }
                    }
                    return;
                  }
                }
              }
              if (((ac) this).field_y != 3) {
                break L34;
              } else {
                if (!ep.field_f) {
                  te discarded$90 = ub.a((byte) 57, el.field_b[0]);
                  et.field_d = false;
                  wt.field_G = false;
                  uu.field_b = false;
                  ep.field_f = true;
                  break L34;
                } else {
                  L52: {
                    if (((ac) this).field_o >= 0) {
                      ((ac) this).field_o = ((ac) this).field_o + 1;
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  L53: {
                    if (param1 == 100) {
                      break L53;
                    } else {
                      var4 = null;
                      ((ac) this).b((ha) null, -123);
                      break L53;
                    }
                  }
                  L54: {
                    if ((((ac) this).field_o ^ -1) > -101) {
                      break L54;
                    } else {
                      ((ac) this).a(param0, -12614);
                      te discarded$91 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                      break L54;
                    }
                  }
                  return;
                }
              }
            } else {
              break L34;
            }
          }
          L55: {
            if (((ac) this).field_o >= 0) {
              ((ac) this).field_o = ((ac) this).field_o + 1;
              break L55;
            } else {
              break L55;
            }
          }
          if (param1 == 100) {
            if ((((ac) this).field_o ^ -1) <= -101) {
              ((ac) this).a(param0, -12614);
              te discarded$92 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
              return;
            } else {
              return;
            }
          } else {
            L56: {
              var4 = null;
              ((ac) this).b((ha) null, -123);
              if ((((ac) this).field_o ^ -1) > -101) {
                break L56;
              } else {
                ((ac) this).a(param0, -12614);
                te discarded$93 = ub.a((byte) 91, el.field_b[1 + ns.a(false, 8, li.field_n)]);
                break L56;
              }
            }
            return;
          }
        }
    }

    final static wk[] a(kl param0, String param1, byte param2, String param3) {
        int var4 = param0.a(param3, 124);
        if (param2 != -4) {
            ac.a((byte) -15);
        }
        int var5 = param0.a((byte) -20, var4, param1);
        return nk.a(var4, (byte) 28, var5, param0);
    }

    ac(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ac) this).field_v = param0 << -330144316;
        ((ac) this).field_l = param1 << 1354733380;
        ((ac) this).field_r = param2 + ((int)(-80.0 + 161.0 * Math.random()) >> 1872581153);
        ((ac) this).field_z = param3 - -((int)(Math.random() * 161.0 - 80.0) >> -1745871903);
        ((ac) this).field_q = param4;
        ((ac) this).field_w = param6;
        ((ac) this).field_o = -param5;
        ((ac) this).field_t = ns.a(false, vc.field_k.length, li.field_n);
        ((ac) this).field_y = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "End tutorial";
        field_x = "Accept <%0> into this game";
        field_s = "Cancel";
        field_n = false;
    }
}
