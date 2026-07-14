/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends kk {
    static String field_Q;
    static String field_M;
    static String field_L;
    static long field_K;
    static int field_J;
    static int field_O;
    static String field_H;
    private Object field_N;
    static int field_I;

    public static void i(int param0) {
        if (param0 != 0) {
          field_H = null;
          field_Q = null;
          field_M = null;
          field_H = null;
          field_L = null;
          return;
        } else {
          field_Q = null;
          field_M = null;
          field_H = null;
          field_L = null;
          return;
        }
    }

    final static int a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pool.field_O;
        li.field_d = li.field_d + 65536;
        L0: while (true) {
          if (-65537 < (ng.a(hj.field_f, param1 + -65, li.field_d) ^ -1)) {
            L1: {
              var2 = -1;
              if (nf.field_V == null) {
                if (jr.field_m == null) {
                  break L1;
                } else {
                  var2 = jr.field_m.length;
                  break L1;
                }
              } else {
                var2 = nf.field_V.length;
                break L1;
              }
            }
            L2: {
              if (param1 == 65) {
                break L2;
              } else {
                fd.i(38);
                break L2;
              }
            }
            L3: {
              if (0 == (var2 ^ -1)) {
                break L3;
              } else {
                L4: {
                  if (hj.field_g > ug.field_u) {
                    ug.field_u = ug.field_u + 1;
                    if (ug.field_u > hj.field_l) {
                      if (nf.field_V != null) {
                        L5: {
                          if (nf.field_V[rj.field_f] == null) {
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ug.field_u = ug.field_u - 1;
                        break L4;
                      } else {
                        ug.field_u = ug.field_u - 1;
                        break L4;
                      }
                    } else {
                      if (ug.field_u < hj.field_g) {
                        break L4;
                      } else {
                        if (null != nf.field_V[(1 + rj.field_f) % var2]) {
                          break L4;
                        } else {
                          ug.field_u = ug.field_u - 1;
                          break L4;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (ug.field_u >= hj.field_g) {
                    cf.field_b = rj.field_f;
                    ug.field_u = ug.field_u - hj.field_g;
                    if (!b.field_K) {
                      rj.field_f = rj.field_f - 1;
                      if (-1 < (rj.field_f ^ -1)) {
                        rj.field_f = rj.field_f + var2;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      rj.field_f = rj.field_f + 1;
                      if (rj.field_f < var2) {
                        break L6;
                      } else {
                        rj.field_f = rj.field_f - var2;
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                if (ug.field_u > hj.field_l) {
                  b.field_K = true;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (null != vq.field_Yb) {
              var3 = -(vq.field_Yb.field_y / 2) + 357;
              var4 = 0;
              if (0 != ne.field_s) {
                L7: {
                  if (ua.field_o <= var3) {
                    break L7;
                  } else {
                    if (var3 - -vq.field_Yb.field_A > ua.field_o) {
                      L8: {
                        if (-vq.field_Yb.field_z + 269 >= lq.field_W) {
                          break L8;
                        } else {
                          if (269 <= lq.field_W) {
                            break L8;
                          } else {
                            b.field_K = false;
                            ug.field_u = hj.field_g;
                            var4 = 1;
                            break L8;
                          }
                        }
                      }
                      if (586 >= lq.field_W) {
                        break L7;
                      } else {
                        if (lq.field_W >= 586 + vq.field_Yb.field_z) {
                          break L7;
                        } else {
                          var4 = 1;
                          b.field_K = true;
                          ug.field_u = hj.field_g;
                          break L7;
                        }
                      }
                    } else {
                      L9: {
                        if (var4 != 0) {
                          break L9;
                        } else {
                          if (hj.field_l >= ug.field_u) {
                            break L9;
                          } else {
                            if (gg.field_f <= var3) {
                              break L9;
                            } else {
                              if (gg.field_f >= var3 + vq.field_Yb.field_A) {
                                break L9;
                              } else {
                                L10: {
                                  if (-vq.field_Yb.field_z + 269 >= wn.field_i) {
                                    break L10;
                                  } else {
                                    if (-270 >= (wn.field_i ^ -1)) {
                                      break L10;
                                    } else {
                                      ug.field_u = hj.field_l;
                                      break L10;
                                    }
                                  }
                                }
                                if (586 >= wn.field_i) {
                                  break L9;
                                } else {
                                  if (wn.field_i < 586 + vq.field_Yb.field_z) {
                                    ug.field_u = hj.field_l;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (param0) {
                        L11: {
                          jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 + -192);
                          if (!jc.field_j.b((byte) 62)) {
                            break L11;
                          } else {
                            if (-1 != (jc.field_j.field_h ^ -1)) {
                              if ((jc.field_j.field_h ^ -1) == -2) {
                                return 2;
                              } else {
                                break L11;
                              }
                            } else {
                              return 3;
                            }
                          }
                        }
                        L12: while (true) {
                          if (n.h(127)) {
                            L13: {
                              jc.field_j.a(true, 0);
                              if (jc.field_j.b((byte) 101)) {
                                if (jc.field_j.field_h == 0) {
                                  return 3;
                                } else {
                                  if (-2 == (jc.field_j.field_h ^ -1)) {
                                    return 1;
                                  } else {
                                    break L13;
                                  }
                                }
                              } else {
                                break L13;
                              }
                            }
                            if (qi.field_a == 13) {
                              return 1;
                            } else {
                              continue L12;
                            }
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 0;
                      }
                    }
                  }
                }
                if (var4 == 0) {
                  if (hj.field_l < ug.field_u) {
                    L14: {
                      if (gg.field_f <= var3) {
                        break L14;
                      } else {
                        if (gg.field_f >= var3 + vq.field_Yb.field_A) {
                          break L14;
                        } else {
                          L15: {
                            if (-vq.field_Yb.field_z + 269 >= wn.field_i) {
                              break L15;
                            } else {
                              if (-270 >= (wn.field_i ^ -1)) {
                                break L15;
                              } else {
                                L16: {
                                  ug.field_u = hj.field_l;
                                  if (586 >= wn.field_i) {
                                    break L16;
                                  } else {
                                    if (wn.field_i < 586 + vq.field_Yb.field_z) {
                                      ug.field_u = hj.field_l;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (param0) {
                                  jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 + -192);
                                  if (!jc.field_j.b((byte) 62)) {
                                    L17: while (true) {
                                      if (!n.h(127)) {
                                        return 0;
                                      } else {
                                        L18: {
                                          jc.field_j.a(true, 0);
                                          if (jc.field_j.b((byte) 101)) {
                                            if (jc.field_j.field_h == 0) {
                                              return 3;
                                            } else {
                                              if (-2 == (jc.field_j.field_h ^ -1)) {
                                                return 1;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          } else {
                                            break L18;
                                          }
                                        }
                                        if (qi.field_a == 13) {
                                          return 1;
                                        } else {
                                          continue L17;
                                        }
                                      }
                                    }
                                  } else {
                                    if (-1 != (jc.field_j.field_h ^ -1)) {
                                      if ((jc.field_j.field_h ^ -1) == -2) {
                                        return 2;
                                      } else {
                                        L19: while (true) {
                                          if (!n.h(127)) {
                                            return 0;
                                          } else {
                                            L20: {
                                              jc.field_j.a(true, 0);
                                              if (jc.field_j.b((byte) 101)) {
                                                if (jc.field_j.field_h == 0) {
                                                  return 3;
                                                } else {
                                                  if (-2 == (jc.field_j.field_h ^ -1)) {
                                                    return 1;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              } else {
                                                break L20;
                                              }
                                            }
                                            if (qi.field_a == 13) {
                                              return 1;
                                            } else {
                                              continue L19;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      return 3;
                                    }
                                  }
                                } else {
                                  return 0;
                                }
                              }
                            }
                          }
                          if (586 >= wn.field_i) {
                            break L14;
                          } else {
                            if (wn.field_i < 586 + vq.field_Yb.field_z) {
                              ug.field_u = hj.field_l;
                              break L14;
                            } else {
                              if (param0) {
                                jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 + -192);
                                if (!jc.field_j.b((byte) 62)) {
                                  L21: while (true) {
                                    if (!n.h(127)) {
                                      return 0;
                                    } else {
                                      L22: {
                                        jc.field_j.a(true, 0);
                                        if (jc.field_j.b((byte) 101)) {
                                          if (jc.field_j.field_h == 0) {
                                            return 3;
                                          } else {
                                            if (-2 == (jc.field_j.field_h ^ -1)) {
                                              return 1;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        } else {
                                          break L22;
                                        }
                                      }
                                      if (qi.field_a == 13) {
                                        return 1;
                                      } else {
                                        continue L21;
                                      }
                                    }
                                  }
                                } else {
                                  if (-1 != (jc.field_j.field_h ^ -1)) {
                                    if ((jc.field_j.field_h ^ -1) == -2) {
                                      return 2;
                                    } else {
                                      L23: while (true) {
                                        if (!n.h(127)) {
                                          return 0;
                                        } else {
                                          L24: {
                                            jc.field_j.a(true, 0);
                                            if (jc.field_j.b((byte) 101)) {
                                              if (jc.field_j.field_h == 0) {
                                                return 3;
                                              } else {
                                                if (-2 == (jc.field_j.field_h ^ -1)) {
                                                  return 1;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            } else {
                                              break L24;
                                            }
                                          }
                                          if (qi.field_a == 13) {
                                            return 1;
                                          } else {
                                            continue L23;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    return 3;
                                  }
                                }
                              } else {
                                return 0;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param0) {
                      jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 + -192);
                      if (!jc.field_j.b((byte) 62)) {
                        L25: while (true) {
                          if (!n.h(127)) {
                            return 0;
                          } else {
                            L26: {
                              jc.field_j.a(true, 0);
                              if (jc.field_j.b((byte) 101)) {
                                if (jc.field_j.field_h == 0) {
                                  return 3;
                                } else {
                                  if (-2 == (jc.field_j.field_h ^ -1)) {
                                    return 1;
                                  } else {
                                    break L26;
                                  }
                                }
                              } else {
                                break L26;
                              }
                            }
                            if (qi.field_a == 13) {
                              return 1;
                            } else {
                              continue L25;
                            }
                          }
                        }
                      } else {
                        if (-1 != (jc.field_j.field_h ^ -1)) {
                          if ((jc.field_j.field_h ^ -1) == -2) {
                            return 2;
                          } else {
                            L27: while (true) {
                              if (!n.h(127)) {
                                return 0;
                              } else {
                                L28: {
                                  jc.field_j.a(true, 0);
                                  if (jc.field_j.b((byte) 101)) {
                                    if (jc.field_j.field_h == 0) {
                                      return 3;
                                    } else {
                                      if (-2 == (jc.field_j.field_h ^ -1)) {
                                        return 1;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  } else {
                                    break L28;
                                  }
                                }
                                if (qi.field_a == 13) {
                                  return 1;
                                } else {
                                  continue L27;
                                }
                              }
                            }
                          }
                        } else {
                          return 3;
                        }
                      }
                    } else {
                      return 0;
                    }
                  } else {
                    if (param0) {
                      jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 + -192);
                      if (!jc.field_j.b((byte) 62)) {
                        L29: while (true) {
                          if (!n.h(127)) {
                            return 0;
                          } else {
                            L30: {
                              jc.field_j.a(true, 0);
                              if (jc.field_j.b((byte) 101)) {
                                if (jc.field_j.field_h == 0) {
                                  return 3;
                                } else {
                                  if (-2 == (jc.field_j.field_h ^ -1)) {
                                    return 1;
                                  } else {
                                    break L30;
                                  }
                                }
                              } else {
                                break L30;
                              }
                            }
                            if (qi.field_a == 13) {
                              return 1;
                            } else {
                              continue L29;
                            }
                          }
                        }
                      } else {
                        if (-1 != (jc.field_j.field_h ^ -1)) {
                          if ((jc.field_j.field_h ^ -1) != -2) {
                            L31: while (true) {
                              if (n.h(127)) {
                                L32: {
                                  jc.field_j.a(true, 0);
                                  if (jc.field_j.b((byte) 101)) {
                                    if (jc.field_j.field_h == 0) {
                                      return 3;
                                    } else {
                                      if (-2 == (jc.field_j.field_h ^ -1)) {
                                        return 1;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  } else {
                                    break L32;
                                  }
                                }
                                if (qi.field_a == 13) {
                                  return 1;
                                } else {
                                  continue L31;
                                }
                              } else {
                                return 0;
                              }
                            }
                          } else {
                            return 2;
                          }
                        } else {
                          return 3;
                        }
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  if (param0) {
                    jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 + -192);
                    if (!jc.field_j.b((byte) 62)) {
                      L33: while (true) {
                        if (n.h(127)) {
                          L34: {
                            jc.field_j.a(true, 0);
                            if (jc.field_j.b((byte) 101)) {
                              if (jc.field_j.field_h == 0) {
                                return 3;
                              } else {
                                if (-2 == (jc.field_j.field_h ^ -1)) {
                                  return 1;
                                } else {
                                  break L34;
                                }
                              }
                            } else {
                              break L34;
                            }
                          }
                          if (qi.field_a == 13) {
                            return 1;
                          } else {
                            continue L33;
                          }
                        } else {
                          return 0;
                        }
                      }
                    } else {
                      if (-1 != (jc.field_j.field_h ^ -1)) {
                        if ((jc.field_j.field_h ^ -1) != -2) {
                          L35: while (true) {
                            if (n.h(127)) {
                              L36: {
                                jc.field_j.a(true, 0);
                                if (jc.field_j.b((byte) 101)) {
                                  if (jc.field_j.field_h == 0) {
                                    return 3;
                                  } else {
                                    if (-2 == (jc.field_j.field_h ^ -1)) {
                                      return 1;
                                    } else {
                                      break L36;
                                    }
                                  }
                                } else {
                                  break L36;
                                }
                              }
                              if (qi.field_a == 13) {
                                return 1;
                              } else {
                                continue L35;
                              }
                            } else {
                              return 0;
                            }
                          }
                        } else {
                          return 2;
                        }
                      } else {
                        return 3;
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                L37: {
                  if (var4 != 0) {
                    break L37;
                  } else {
                    if (hj.field_l >= ug.field_u) {
                      break L37;
                    } else {
                      if (gg.field_f <= var3) {
                        break L37;
                      } else {
                        if (gg.field_f >= var3 + vq.field_Yb.field_A) {
                          break L37;
                        } else {
                          L38: {
                            if (-vq.field_Yb.field_z + 269 >= wn.field_i) {
                              break L38;
                            } else {
                              if (-270 >= (wn.field_i ^ -1)) {
                                break L38;
                              } else {
                                L39: {
                                  ug.field_u = hj.field_l;
                                  if (586 >= wn.field_i) {
                                    break L39;
                                  } else {
                                    if (wn.field_i < 586 + vq.field_Yb.field_z) {
                                      ug.field_u = hj.field_l;
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                                if (param0) {
                                  L40: {
                                    jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 + -192);
                                    if (!jc.field_j.b((byte) 62)) {
                                      break L40;
                                    } else {
                                      if (-1 != (jc.field_j.field_h ^ -1)) {
                                        if ((jc.field_j.field_h ^ -1) == -2) {
                                          return 2;
                                        } else {
                                          break L40;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    }
                                  }
                                  L41: while (true) {
                                    if (n.h(127)) {
                                      L42: {
                                        jc.field_j.a(true, 0);
                                        if (jc.field_j.b((byte) 101)) {
                                          if (jc.field_j.field_h == 0) {
                                            return 3;
                                          } else {
                                            if (-2 == (jc.field_j.field_h ^ -1)) {
                                              return 1;
                                            } else {
                                              break L42;
                                            }
                                          }
                                        } else {
                                          break L42;
                                        }
                                      }
                                      if (qi.field_a == 13) {
                                        return 1;
                                      } else {
                                        continue L41;
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                } else {
                                  return 0;
                                }
                              }
                            }
                          }
                          if (586 >= wn.field_i) {
                            break L37;
                          } else {
                            if (wn.field_i < 586 + vq.field_Yb.field_z) {
                              ug.field_u = hj.field_l;
                              break L37;
                            } else {
                              if (param0) {
                                L43: {
                                  jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 + -192);
                                  if (!jc.field_j.b((byte) 62)) {
                                    break L43;
                                  } else {
                                    if (-1 != (jc.field_j.field_h ^ -1)) {
                                      if ((jc.field_j.field_h ^ -1) == -2) {
                                        return 2;
                                      } else {
                                        break L43;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  }
                                }
                                L44: while (true) {
                                  if (n.h(127)) {
                                    L45: {
                                      jc.field_j.a(true, 0);
                                      if (jc.field_j.b((byte) 101)) {
                                        if (jc.field_j.field_h == 0) {
                                          return 3;
                                        } else {
                                          if (-2 == (jc.field_j.field_h ^ -1)) {
                                            return 1;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      } else {
                                        break L45;
                                      }
                                    }
                                    if (qi.field_a == 13) {
                                      return 1;
                                    } else {
                                      continue L44;
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              } else {
                                return 0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (param0) {
                  jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 + -192);
                  if (!jc.field_j.b((byte) 62)) {
                    L46: while (true) {
                      if (n.h(127)) {
                        L47: {
                          jc.field_j.a(true, 0);
                          if (jc.field_j.b((byte) 101)) {
                            if (jc.field_j.field_h == 0) {
                              return 3;
                            } else {
                              if (-2 == (jc.field_j.field_h ^ -1)) {
                                return 1;
                              } else {
                                break L47;
                              }
                            }
                          } else {
                            break L47;
                          }
                        }
                        if (qi.field_a == 13) {
                          return 1;
                        } else {
                          continue L46;
                        }
                      } else {
                        return 0;
                      }
                    }
                  } else {
                    if (-1 != (jc.field_j.field_h ^ -1)) {
                      if ((jc.field_j.field_h ^ -1) != -2) {
                        L48: while (true) {
                          if (n.h(127)) {
                            L49: {
                              jc.field_j.a(true, 0);
                              if (jc.field_j.b((byte) 101)) {
                                if (jc.field_j.field_h == 0) {
                                  return 3;
                                } else {
                                  if (-2 == (jc.field_j.field_h ^ -1)) {
                                    return 1;
                                  } else {
                                    break L49;
                                  }
                                }
                              } else {
                                break L49;
                              }
                            }
                            if (qi.field_a == 13) {
                              return 1;
                            } else {
                              continue L48;
                            }
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 2;
                      }
                    } else {
                      return 3;
                    }
                  }
                } else {
                  return 0;
                }
              }
            } else {
              if (param0) {
                L50: {
                  jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 + -192);
                  if (!jc.field_j.b((byte) 62)) {
                    break L50;
                  } else {
                    if (-1 != (jc.field_j.field_h ^ -1)) {
                      if ((jc.field_j.field_h ^ -1) == -2) {
                        return 2;
                      } else {
                        break L50;
                      }
                    } else {
                      return 3;
                    }
                  }
                }
                L51: while (true) {
                  if (n.h(127)) {
                    L52: {
                      jc.field_j.a(true, 0);
                      if (jc.field_j.b((byte) 101)) {
                        if (jc.field_j.field_h == 0) {
                          return 3;
                        } else {
                          if (-2 == (jc.field_j.field_h ^ -1)) {
                            return 1;
                          } else {
                            break L52;
                          }
                        }
                      } else {
                        break L52;
                      }
                    }
                    if (qi.field_a == 13) {
                      return 1;
                    } else {
                      continue L51;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 0;
              }
            }
          } else {
            li.field_d = li.field_d - hj.field_f;
            uf.field_X = uf.field_X + 1;
            continue L0;
          }
        }
    }

    final static void h(int param0) {
        oq var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        var1 = ej.field_j;
        if (param0 > 117) {
          L0: while (true) {
            if (va.g((byte) -120)) {
              var1.b(false, 8);
              var1.field_v = var1.field_v + 1;
              var2 = var1.field_v + 1;
              wn.a(var1, 1);
              ej.field_j.b(var1.field_v + -var2, true);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    fd(Object param0, int param1) {
        super(param1);
        ((fd) this).field_N = param0;
    }

    final static void a(int[] param0, int[] param1, byte param2) {
        Object var4 = null;
        th.a(0, param2 ^ 30966, param0, param1, param0.length - 1);
        if (param2 == -54) {
          return;
        } else {
          var4 = null;
          fd.a((int[]) null, (int[]) null, (byte) -96);
          return;
        }
    }

    final boolean e(int param0) {
        if (param0 >= -16) {
            fd.i(-107);
            return false;
        }
        return false;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int[] var9 = null;
        if (param4 != 2) {
          var8 = null;
          fd.a((int[]) null, (int[]) null, (byte) -8);
          param3--;
          L0: while (true) {
            if (param3 < 0) {
              return;
            } else {
              var9 = param0;
              var5 = var9;
              var6 = param2;
              var7 = param1;
              var9[var6] = var7 + rb.b(8355711, var9[var6] >> -64045407);
              param2++;
              param3--;
              continue L0;
            }
          }
        } else {
          param3--;
          L1: while (true) {
            if (param3 < 0) {
              return;
            } else {
              var9 = param0;
              var5 = var9;
              var6 = param2;
              var7 = param1;
              var9[var6] = var7 + rb.b(8355711, var9[var6] >> -64045407);
              param2++;
              param3--;
              continue L1;
            }
          }
        }
    }

    final Object c(byte param0) {
        if (param0 <= 119) {
            return null;
        }
        return ((fd) this).field_N;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "<%0> has declined the invitation.";
        field_O = 0;
        field_Q = "Eight-ball";
        field_J = 360;
        field_H = "<%0> all want to draw.";
        field_L = "Mouse over an icon for details";
        field_I = 0;
    }
}
