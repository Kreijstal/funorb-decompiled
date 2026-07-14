/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends ck {
    static gh field_p;
    static String field_r;
    byte[] field_t;
    boolean field_q;
    static wk field_o;
    static String[] field_s;
    static int field_u;

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        ag.field_u = ag.field_u + 65536;
        L0: while (true) {
          if (-65537 < (wa.a(ag.field_u, hh.field_j, (byte) -27) ^ -1)) {
            L1: {
              var2 = -1;
              if (null == jb.field_S) {
                if (null != bm.field_R) {
                  var2 = bm.field_R.length;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var2 = jb.field_S.length;
                break L1;
              }
            }
            if (0 != (var2 ^ -1)) {
              L2: {
                if (ul.field_g >= hh.field_f) {
                  break L2;
                } else {
                  ul.field_g = ul.field_g + 1;
                  if (ul.field_g <= hh.field_i) {
                    if (ul.field_g < hh.field_f) {
                      break L2;
                    } else {
                      L3: {
                        if (null == jb.field_S[(1 + lh.field_r) % var2]) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ul.field_g = ul.field_g - 1;
                      break L2;
                    }
                  } else {
                    if (ul.field_g < hh.field_f) {
                      break L2;
                    } else {
                      if (null != jb.field_S[(1 + lh.field_r) % var2]) {
                        break L2;
                      } else {
                        ul.field_g = ul.field_g - 1;
                        break L2;
                      }
                    }
                  }
                }
              }
              L4: {
                if (hh.field_f > ul.field_g) {
                  break L4;
                } else {
                  oe.field_e = lh.field_r;
                  ul.field_g = ul.field_g - hh.field_f;
                  if (!rf.field_b) {
                    lh.field_r = lh.field_r - 1;
                    if (lh.field_r < 0) {
                      lh.field_r = lh.field_r + var2;
                      break L4;
                    } else {
                      L5: {
                        if (ul.field_g <= hh.field_i) {
                          break L5;
                        } else {
                          rf.field_b = true;
                          break L5;
                        }
                      }
                      if (param1 == 269) {
                        L6: {
                          if (null != jc.field_b) {
                            L7: {
                              var3 = 357 + -(jc.field_b.field_B / 2);
                              var4 = 0;
                              if (lb.field_gc == 0) {
                                break L7;
                              } else {
                                if (var3 >= rj.field_j) {
                                  break L7;
                                } else {
                                  if (jc.field_b.field_F + var3 <= rj.field_j) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (269 - jc.field_b.field_A >= oa.field_S) {
                                        break L8;
                                      } else {
                                        if ((oa.field_S ^ -1) <= -270) {
                                          break L8;
                                        } else {
                                          rf.field_b = false;
                                          ul.field_g = hh.field_f;
                                          var4 = 1;
                                          break L8;
                                        }
                                      }
                                    }
                                    if (oa.field_S <= 586) {
                                      break L7;
                                    } else {
                                      if (oa.field_S >= jc.field_b.field_A + 586) {
                                        break L7;
                                      } else {
                                        var4 = 1;
                                        rf.field_b = true;
                                        ul.field_g = hh.field_f;
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (var4 != 0) {
                              break L6;
                            } else {
                              if (hh.field_i >= ul.field_g) {
                                break L6;
                              } else {
                                if (var3 >= pi.field_c) {
                                  break L6;
                                } else {
                                  if (jc.field_b.field_F + var3 <= pi.field_c) {
                                    break L6;
                                  } else {
                                    if (oh.field_f <= -jc.field_b.field_A + 269) {
                                      if (oh.field_f > 586) {
                                        if (586 - -jc.field_b.field_A <= oh.field_f) {
                                          break L6;
                                        } else {
                                          ul.field_g = hh.field_i;
                                          break L6;
                                        }
                                      } else {
                                        if (oh.field_f <= 586) {
                                          break L6;
                                        } else {
                                          if (586 - -jc.field_b.field_A <= oh.field_f) {
                                            break L6;
                                          } else {
                                            ul.field_g = hh.field_i;
                                            break L6;
                                          }
                                        }
                                      }
                                    } else {
                                      if (oh.field_f <= 586) {
                                        break L6;
                                      } else {
                                        if (586 - -jc.field_b.field_A <= oh.field_f) {
                                          break L6;
                                        } else {
                                          ul.field_g = hh.field_i;
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        if (param0) {
                          L9: {
                            jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                            if (jh.field_i.c(param1 ^ 269)) {
                              if (0 != jh.field_i.field_e) {
                                if (-2 != (jh.field_i.field_e ^ -1)) {
                                  break L9;
                                } else {
                                  return 2;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (dl.f(22759)) {
                              L11: {
                                jh.field_i.a(true, 0);
                                if (jh.field_i.c(0)) {
                                  if (0 != jh.field_i.field_e) {
                                    if (1 != jh.field_i.field_e) {
                                      break L11;
                                    } else {
                                      return 1;
                                    }
                                  } else {
                                    return 3;
                                  }
                                } else {
                                  break L11;
                                }
                              }
                              if (ei.field_q == 13) {
                                return 1;
                              } else {
                                continue L10;
                              }
                            } else {
                              return 0;
                            }
                          }
                        } else {
                          return 0;
                        }
                      } else {
                        return -13;
                      }
                    }
                  } else {
                    lh.field_r = lh.field_r + 1;
                    if (var2 <= lh.field_r) {
                      lh.field_r = lh.field_r - var2;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (ul.field_g > hh.field_i) {
                rf.field_b = true;
                if (param1 == 269) {
                  L12: {
                    if (null != jc.field_b) {
                      L13: {
                        var3 = 357 + -(jc.field_b.field_B / 2);
                        var4 = 0;
                        if (lb.field_gc == 0) {
                          break L13;
                        } else {
                          if (var3 >= rj.field_j) {
                            break L13;
                          } else {
                            if (jc.field_b.field_F + var3 <= rj.field_j) {
                              break L13;
                            } else {
                              L14: {
                                if (269 - jc.field_b.field_A >= oa.field_S) {
                                  break L14;
                                } else {
                                  if ((oa.field_S ^ -1) <= -270) {
                                    break L14;
                                  } else {
                                    rf.field_b = false;
                                    ul.field_g = hh.field_f;
                                    var4 = 1;
                                    break L14;
                                  }
                                }
                              }
                              if (oa.field_S <= 586) {
                                break L13;
                              } else {
                                if (oa.field_S >= jc.field_b.field_A + 586) {
                                  break L13;
                                } else {
                                  var4 = 1;
                                  rf.field_b = true;
                                  ul.field_g = hh.field_f;
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (var4 == 0) {
                        if (hh.field_i >= ul.field_g) {
                          break L12;
                        } else {
                          if (var3 >= pi.field_c) {
                            break L12;
                          } else {
                            if (jc.field_b.field_F + var3 <= pi.field_c) {
                              break L12;
                            } else {
                              if (oh.field_f <= -jc.field_b.field_A + 269) {
                                if (oh.field_f > 586) {
                                  if (586 - -jc.field_b.field_A <= oh.field_f) {
                                    break L12;
                                  } else {
                                    ul.field_g = hh.field_i;
                                    break L12;
                                  }
                                } else {
                                  if (oh.field_f <= 586) {
                                    break L12;
                                  } else {
                                    if (586 - -jc.field_b.field_A <= oh.field_f) {
                                      break L12;
                                    } else {
                                      ul.field_g = hh.field_i;
                                      break L12;
                                    }
                                  }
                                }
                              } else {
                                if (oh.field_f <= 586) {
                                  break L12;
                                } else {
                                  if (586 - -jc.field_b.field_A <= oh.field_f) {
                                    break L12;
                                  } else {
                                    ul.field_g = hh.field_i;
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (param0) {
                          L15: {
                            jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                            if (jh.field_i.c(param1 ^ 269)) {
                              if (0 != jh.field_i.field_e) {
                                if (-2 != (jh.field_i.field_e ^ -1)) {
                                  break L15;
                                } else {
                                  return 2;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L15;
                            }
                          }
                          L16: while (true) {
                            if (dl.f(22759)) {
                              L17: {
                                jh.field_i.a(true, 0);
                                if (jh.field_i.c(0)) {
                                  if (0 != jh.field_i.field_e) {
                                    if (1 != jh.field_i.field_e) {
                                      break L17;
                                    } else {
                                      return 1;
                                    }
                                  } else {
                                    return 3;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              if (ei.field_q == 13) {
                                return 1;
                              } else {
                                continue L16;
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
                      break L12;
                    }
                  }
                  if (param0) {
                    L18: {
                      jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                      if (jh.field_i.c(param1 ^ 269)) {
                        if (0 != jh.field_i.field_e) {
                          if (-2 != (jh.field_i.field_e ^ -1)) {
                            break L18;
                          } else {
                            return 2;
                          }
                        } else {
                          return 3;
                        }
                      } else {
                        break L18;
                      }
                    }
                    L19: while (true) {
                      if (dl.f(22759)) {
                        L20: {
                          jh.field_i.a(true, 0);
                          if (jh.field_i.c(0)) {
                            if (0 != jh.field_i.field_e) {
                              if (1 != jh.field_i.field_e) {
                                break L20;
                              } else {
                                return 1;
                              }
                            } else {
                              return 3;
                            }
                          } else {
                            break L20;
                          }
                        }
                        if (ei.field_q == 13) {
                          return 1;
                        } else {
                          continue L19;
                        }
                      } else {
                        return 0;
                      }
                    }
                  } else {
                    return 0;
                  }
                } else {
                  return -13;
                }
              } else {
                if (param1 == 269) {
                  if (null != jc.field_b) {
                    L21: {
                      var3 = 357 + -(jc.field_b.field_B / 2);
                      var4 = 0;
                      if (lb.field_gc == 0) {
                        break L21;
                      } else {
                        if (var3 >= rj.field_j) {
                          break L21;
                        } else {
                          if (jc.field_b.field_F + var3 <= rj.field_j) {
                            break L21;
                          } else {
                            L22: {
                              if (269 - jc.field_b.field_A >= oa.field_S) {
                                break L22;
                              } else {
                                if ((oa.field_S ^ -1) <= -270) {
                                  break L22;
                                } else {
                                  rf.field_b = false;
                                  ul.field_g = hh.field_f;
                                  var4 = 1;
                                  break L22;
                                }
                              }
                            }
                            if (oa.field_S <= 586) {
                              break L21;
                            } else {
                              if (oa.field_S >= jc.field_b.field_A + 586) {
                                break L21;
                              } else {
                                var4 = 1;
                                rf.field_b = true;
                                ul.field_g = hh.field_f;
                                break L21;
                              }
                            }
                          }
                        }
                      }
                    }
                    L23: {
                      if (var4 != 0) {
                        break L23;
                      } else {
                        if (hh.field_i >= ul.field_g) {
                          break L23;
                        } else {
                          if (var3 >= pi.field_c) {
                            break L23;
                          } else {
                            if (jc.field_b.field_F + var3 <= pi.field_c) {
                              break L23;
                            } else {
                              L24: {
                                if (oh.field_f <= -jc.field_b.field_A + 269) {
                                  break L24;
                                } else {
                                  if (269 <= oh.field_f) {
                                    break L24;
                                  } else {
                                    L25: {
                                      ul.field_g = hh.field_i;
                                      if (oh.field_f <= 586) {
                                        break L25;
                                      } else {
                                        if (586 - -jc.field_b.field_A <= oh.field_f) {
                                          break L25;
                                        } else {
                                          ul.field_g = hh.field_i;
                                          break L25;
                                        }
                                      }
                                    }
                                    if (param0) {
                                      L26: {
                                        jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                                        if (jh.field_i.c(param1 ^ 269)) {
                                          if (0 != jh.field_i.field_e) {
                                            if (-2 != (jh.field_i.field_e ^ -1)) {
                                              break L26;
                                            } else {
                                              return 2;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        } else {
                                          break L26;
                                        }
                                      }
                                      L27: while (true) {
                                        if (dl.f(22759)) {
                                          L28: {
                                            jh.field_i.a(true, 0);
                                            if (jh.field_i.c(0)) {
                                              if (0 != jh.field_i.field_e) {
                                                if (1 != jh.field_i.field_e) {
                                                  break L28;
                                                } else {
                                                  return 1;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            } else {
                                              break L28;
                                            }
                                          }
                                          if (ei.field_q == 13) {
                                            return 1;
                                          } else {
                                            continue L27;
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
                              if (oh.field_f <= 586) {
                                break L23;
                              } else {
                                if (586 - -jc.field_b.field_A <= oh.field_f) {
                                  break L23;
                                } else {
                                  ul.field_g = hh.field_i;
                                  if (param0) {
                                    L29: {
                                      jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                                      if (jh.field_i.c(param1 ^ 269)) {
                                        if (0 != jh.field_i.field_e) {
                                          if (-2 != (jh.field_i.field_e ^ -1)) {
                                            break L29;
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      } else {
                                        break L29;
                                      }
                                    }
                                    L30: while (true) {
                                      if (dl.f(22759)) {
                                        L31: {
                                          jh.field_i.a(true, 0);
                                          if (jh.field_i.c(0)) {
                                            if (0 != jh.field_i.field_e) {
                                              if (1 != jh.field_i.field_e) {
                                                break L31;
                                              } else {
                                                return 1;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L31;
                                          }
                                        }
                                        if (ei.field_q == 13) {
                                          return 1;
                                        } else {
                                          continue L30;
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
                      jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                      if (jh.field_i.c(param1 ^ 269)) {
                        if (0 != jh.field_i.field_e) {
                          if (-2 != (jh.field_i.field_e ^ -1)) {
                            L32: while (true) {
                              if (dl.f(22759)) {
                                L33: {
                                  jh.field_i.a(true, 0);
                                  if (jh.field_i.c(0)) {
                                    if (0 != jh.field_i.field_e) {
                                      if (1 != jh.field_i.field_e) {
                                        break L33;
                                      } else {
                                        return 1;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  } else {
                                    break L33;
                                  }
                                }
                                if (ei.field_q == 13) {
                                  return 1;
                                } else {
                                  continue L32;
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
                      } else {
                        L34: while (true) {
                          if (dl.f(22759)) {
                            L35: {
                              jh.field_i.a(true, 0);
                              if (jh.field_i.c(0)) {
                                if (0 != jh.field_i.field_e) {
                                  if (1 != jh.field_i.field_e) {
                                    break L35;
                                  } else {
                                    return 1;
                                  }
                                } else {
                                  return 3;
                                }
                              } else {
                                break L35;
                              }
                            }
                            if (ei.field_q == 13) {
                              return 1;
                            } else {
                              continue L34;
                            }
                          } else {
                            return 0;
                          }
                        }
                      }
                    } else {
                      return 0;
                    }
                  } else {
                    if (param0) {
                      L36: {
                        jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                        if (jh.field_i.c(param1 ^ 269)) {
                          if (0 != jh.field_i.field_e) {
                            if (-2 != (jh.field_i.field_e ^ -1)) {
                              break L36;
                            } else {
                              return 2;
                            }
                          } else {
                            return 3;
                          }
                        } else {
                          break L36;
                        }
                      }
                      L37: while (true) {
                        if (dl.f(22759)) {
                          L38: {
                            jh.field_i.a(true, 0);
                            if (jh.field_i.c(0)) {
                              if (0 != jh.field_i.field_e) {
                                if (1 != jh.field_i.field_e) {
                                  break L38;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L38;
                            }
                          }
                          if (ei.field_q == 13) {
                            return 1;
                          } else {
                            continue L37;
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
                  return -13;
                }
              }
            } else {
              if (param1 == 269) {
                if (null != jc.field_b) {
                  L39: {
                    var3 = 357 + -(jc.field_b.field_B / 2);
                    var4 = 0;
                    if (lb.field_gc == 0) {
                      break L39;
                    } else {
                      if (var3 >= rj.field_j) {
                        break L39;
                      } else {
                        if (jc.field_b.field_F + var3 <= rj.field_j) {
                          break L39;
                        } else {
                          L40: {
                            if (269 - jc.field_b.field_A >= oa.field_S) {
                              break L40;
                            } else {
                              if ((oa.field_S ^ -1) <= -270) {
                                break L40;
                              } else {
                                rf.field_b = false;
                                ul.field_g = hh.field_f;
                                var4 = 1;
                                break L40;
                              }
                            }
                          }
                          if (oa.field_S <= 586) {
                            break L39;
                          } else {
                            if (oa.field_S >= jc.field_b.field_A + 586) {
                              break L39;
                            } else {
                              var4 = 1;
                              rf.field_b = true;
                              ul.field_g = hh.field_f;
                              break L39;
                            }
                          }
                        }
                      }
                    }
                  }
                  L41: {
                    if (var4 != 0) {
                      break L41;
                    } else {
                      if (hh.field_i >= ul.field_g) {
                        break L41;
                      } else {
                        if (var3 >= pi.field_c) {
                          break L41;
                        } else {
                          if (jc.field_b.field_F + var3 <= pi.field_c) {
                            break L41;
                          } else {
                            L42: {
                              if (oh.field_f <= -jc.field_b.field_A + 269) {
                                break L42;
                              } else {
                                if (269 <= oh.field_f) {
                                  break L42;
                                } else {
                                  L43: {
                                    ul.field_g = hh.field_i;
                                    if (oh.field_f <= 586) {
                                      break L43;
                                    } else {
                                      if (586 - -jc.field_b.field_A <= oh.field_f) {
                                        break L43;
                                      } else {
                                        L44: {
                                          ul.field_g = hh.field_i;
                                          if (!param0) {
                                            break L44;
                                          } else {
                                            L45: {
                                              jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                                              if (jh.field_i.c(param1 ^ 269)) {
                                                if (0 != jh.field_i.field_e) {
                                                  if (-2 != (jh.field_i.field_e ^ -1)) {
                                                    break L45;
                                                  } else {
                                                    return 2;
                                                  }
                                                } else {
                                                  return 3;
                                                }
                                              } else {
                                                break L45;
                                              }
                                            }
                                            L46: while (true) {
                                              if (!dl.f(22759)) {
                                                break L44;
                                              } else {
                                                L47: {
                                                  jh.field_i.a(true, 0);
                                                  if (jh.field_i.c(0)) {
                                                    if (0 != jh.field_i.field_e) {
                                                      if (1 != jh.field_i.field_e) {
                                                        break L47;
                                                      } else {
                                                        return 1;
                                                      }
                                                    } else {
                                                      return 3;
                                                    }
                                                  } else {
                                                    break L47;
                                                  }
                                                }
                                                if (ei.field_q == 13) {
                                                  return 1;
                                                } else {
                                                  continue L46;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        return 0;
                                      }
                                    }
                                  }
                                  L48: {
                                    if (!param0) {
                                      break L48;
                                    } else {
                                      jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                                      if (jh.field_i.c(param1 ^ 269)) {
                                        if (0 != jh.field_i.field_e) {
                                          if (-2 != (jh.field_i.field_e ^ -1)) {
                                            L49: while (true) {
                                              if (!dl.f(22759)) {
                                                break L48;
                                              } else {
                                                L50: {
                                                  jh.field_i.a(true, 0);
                                                  if (jh.field_i.c(0)) {
                                                    if (0 != jh.field_i.field_e) {
                                                      if (1 != jh.field_i.field_e) {
                                                        break L50;
                                                      } else {
                                                        return 1;
                                                      }
                                                    } else {
                                                      return 3;
                                                    }
                                                  } else {
                                                    break L50;
                                                  }
                                                }
                                                if (ei.field_q == 13) {
                                                  return 1;
                                                } else {
                                                  continue L49;
                                                }
                                              }
                                            }
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      } else {
                                        L51: while (true) {
                                          if (!dl.f(22759)) {
                                            return 0;
                                          } else {
                                            L52: {
                                              jh.field_i.a(true, 0);
                                              if (jh.field_i.c(0)) {
                                                if (0 != jh.field_i.field_e) {
                                                  if (1 != jh.field_i.field_e) {
                                                    break L52;
                                                  } else {
                                                    return 1;
                                                  }
                                                } else {
                                                  return 3;
                                                }
                                              } else {
                                                break L52;
                                              }
                                            }
                                            if (ei.field_q == 13) {
                                              return 1;
                                            } else {
                                              continue L51;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  return 0;
                                }
                              }
                            }
                            if (oh.field_f <= 586) {
                              break L41;
                            } else {
                              if (586 - -jc.field_b.field_A <= oh.field_f) {
                                break L41;
                              } else {
                                L53: {
                                  ul.field_g = hh.field_i;
                                  if (!param0) {
                                    break L53;
                                  } else {
                                    jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                                    if (jh.field_i.c(param1 ^ 269)) {
                                      if (0 != jh.field_i.field_e) {
                                        if (-2 != (jh.field_i.field_e ^ -1)) {
                                          L54: while (true) {
                                            if (!dl.f(22759)) {
                                              break L53;
                                            } else {
                                              L55: {
                                                jh.field_i.a(true, 0);
                                                if (jh.field_i.c(0)) {
                                                  if (0 != jh.field_i.field_e) {
                                                    if (1 != jh.field_i.field_e) {
                                                      break L55;
                                                    } else {
                                                      return 1;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                } else {
                                                  break L55;
                                                }
                                              }
                                              if (ei.field_q == 13) {
                                                return 1;
                                              } else {
                                                continue L54;
                                              }
                                            }
                                          }
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    } else {
                                      L56: while (true) {
                                        if (!dl.f(22759)) {
                                          return 0;
                                        } else {
                                          L57: {
                                            jh.field_i.a(true, 0);
                                            if (jh.field_i.c(0)) {
                                              if (0 != jh.field_i.field_e) {
                                                if (1 != jh.field_i.field_e) {
                                                  break L57;
                                                } else {
                                                  return 1;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            } else {
                                              break L57;
                                            }
                                          }
                                          if (ei.field_q == 13) {
                                            return 1;
                                          } else {
                                            continue L56;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                return 0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L58: {
                    if (!param0) {
                      break L58;
                    } else {
                      jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                      if (jh.field_i.c(param1 ^ 269)) {
                        if (0 != jh.field_i.field_e) {
                          if (-2 != (jh.field_i.field_e ^ -1)) {
                            L59: while (true) {
                              if (!dl.f(22759)) {
                                break L58;
                              } else {
                                L60: {
                                  jh.field_i.a(true, 0);
                                  if (jh.field_i.c(0)) {
                                    if (0 != jh.field_i.field_e) {
                                      if (1 != jh.field_i.field_e) {
                                        break L60;
                                      } else {
                                        return 1;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  } else {
                                    break L60;
                                  }
                                }
                                if (ei.field_q == 13) {
                                  return 1;
                                } else {
                                  continue L59;
                                }
                              }
                            }
                          } else {
                            return 2;
                          }
                        } else {
                          return 3;
                        }
                      } else {
                        L61: while (true) {
                          if (!dl.f(22759)) {
                            return 0;
                          } else {
                            L62: {
                              jh.field_i.a(true, 0);
                              if (jh.field_i.c(0)) {
                                if (0 != jh.field_i.field_e) {
                                  if (1 != jh.field_i.field_e) {
                                    break L62;
                                  } else {
                                    return 1;
                                  }
                                } else {
                                  return 3;
                                }
                              } else {
                                break L62;
                              }
                            }
                            if (ei.field_q == 13) {
                              return 1;
                            } else {
                              continue L61;
                            }
                          }
                        }
                      }
                    }
                  }
                  return 0;
                } else {
                  if (param0) {
                    jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                    if (jh.field_i.c(param1 ^ 269)) {
                      if (0 != jh.field_i.field_e) {
                        if (-2 != (jh.field_i.field_e ^ -1)) {
                          L63: while (true) {
                            if (!dl.f(22759)) {
                              return 0;
                            } else {
                              L64: {
                                jh.field_i.a(true, 0);
                                if (jh.field_i.c(0)) {
                                  if (0 != jh.field_i.field_e) {
                                    if (1 != jh.field_i.field_e) {
                                      break L64;
                                    } else {
                                      return 1;
                                    }
                                  } else {
                                    return 3;
                                  }
                                } else {
                                  break L64;
                                }
                              }
                              if (ei.field_q == 13) {
                                return 1;
                              } else {
                                continue L63;
                              }
                            }
                          }
                        } else {
                          return 2;
                        }
                      } else {
                        return 3;
                      }
                    } else {
                      L65: while (true) {
                        if (dl.f(22759)) {
                          L66: {
                            jh.field_i.a(true, 0);
                            if (jh.field_i.c(0)) {
                              if (0 != jh.field_i.field_e) {
                                if (1 != jh.field_i.field_e) {
                                  break L66;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L66;
                            }
                          }
                          if (ei.field_q == 13) {
                            return 1;
                          } else {
                            continue L65;
                          }
                        } else {
                          return 0;
                        }
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return -13;
              }
            }
          } else {
            ag.field_u = ag.field_u - hh.field_j;
            ik.field_e = ik.field_e + 1;
            continue L0;
          }
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 < -12) {
          if (param1 != 10) {
            if (-7 != param1) {
              if (param1 != 7) {
                if (-10 != param1) {
                  if (-9 == param1) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_p = null;
          if (param1 != 10) {
            if (-7 != param1) {
              if (param1 != 7) {
                if (-10 != param1) {
                  if (-9 == param1) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 != 127) {
          field_p = null;
          field_r = null;
          field_s = null;
          return;
        } else {
          field_r = null;
          field_s = null;
          return;
        }
    }

    c() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "The <%0> is now available for you to use. You can select this chassis in the 'Configuration' screen.";
        field_s = new String[]{"Welcome, <%0>, to the first training mission.<br><br>In this mission you will be using a stripped-down version of one of our staple sentinels, the Slave-class chassis. You will be taught how to operate its movement systems and try your skills in a simple combat exercise.<br>There is much you need to know before you can be trusted on the battlefield. Once you prove your skills in this campaign, you will be able to pit your skills against other sentinel commanders from around the universe.<br><br>On to victory!", "Welcome to the second training mission, <%0>.<br><br>In this mission you will be using a Slave with an extended array of piercer rockets. You will learn about weapon trajectories and automatic rocket defence.<br><br>On to victory!", "Your training is proceeding well, <%0>.<br><br>You have completed initial training, but before you are fully cleared to use the Slave-class sentinel, you must be tested in battle.<br><br>Take the Slave to the warzone and destroy the enemy sentinels.<br><br>On to victory!", "Welcome, <%0>, to the training for the Aquila-class sentinel.<br><br>The Aquila is a fast, lightweight sentinel capable of flight. You will learn about using thrust, energy management, and lasers.<br><br>On to victory!", "The next phase of your Aquila training is live combat, <%0>.<br><br>Take the Aquila to the warzone and destroy our enemies.<br><br>Remember your training on energy management. If you run out of energy while in battle, you will be very vulnerable to attack.<br><br>On to victory!", "Welcome to targeting and missile training, <%0>.<br><br>In this mission you will be using a full Aquila, and learning to use its targeting systems and missiles.<br><br>On to victory!", "Your skills are progressing well, <%0>.<br><br>The last part of Aquila training is a field assessment. On a nearby world is a ruined city in which enemy sentinels have been reported. Proceed down to the city with the Aquila and do battle.<br><br>On to victory!", "Welcome, <%0>, to the training for the Golem-class sentinel.<br><br>The Golem is formidable in the control of a skilled pilot. Its cannon and heavy rocket can inflict severe explosive damage, and its scanner module allows it to aim long-range weapons with lethal accuracy.<br><br>On to victory!", "The next mission is a field test, <%0>.<br><br>You will be using a Golem, armed with a heavy rocket, cannon, and gun. Return to the warzone and destroy the enemy forces there.<br><br>On to victory!", "Welcome to the flak training mission, <%0>.<br><br>The standard Golem is armed with a flak repeater and airburst rockets. Using them effectively is a key part of the Golem's defences.<br><br>Once this mission is complete, you will be clear to take the Golem out into battle.<br><br>On to victory!", "The Lost World is a planet being battled over by orbiting star cruisers. While they destroy each other, sentinels battle on the surface.<br><br><%1>, take the Slave-class sentinel, drop it down to the surface and destroy all enemies.<br><br>On to riches and victory!", "<%1>, your mission to the Lost World has led to intelligence that our enemies are deploying ground sentinels with powerful artillery weapons. Take an Aquila back to the Lost World and destroy any new sentinel models you encounter.<br><br>On to riches and victory!", "<%1>, our work on the Turtle-class sentinel is leading to valuable new developments. Although our Turtle prototype is unfinished, we need you to return to the Lost World and try out its armaments against enemy sentinels.<br><br>On to riches and victory!", "Good news, <%0>. Thanks to your work with the new sentinel model, our engineering on the Turtle is complete. Take it down to the Lost World and try it out. Once the Turtle has passed this final field test, we will begin mass production.<br><br>On to riches and victory!", "Things on the front line have developed not necessarily to our advantage, <%0>. Our enemies have developed an enhanced bipedal sentinel with plasma and close-combat weapons. We urgently need you to return to the war zone and take out these new threats.<br><br>We hope that the Slave-class sentinel will give you the firepower and agility necessary to compete with these new adversaries.<br><br>On to riches and victory!", "We are trying to reproduce the technology of the Commando-class sentinel, <%0>, but we need it field tested before we can finish. Take this work-in-progress sentinel down to the war zone and test it out in battle.<br><br>On to riches and victory!", "Excellent news, <%0>. Owing to your field test, we have developed a fully functional Commando-class sentinel of our own. Not a moment too soon: the situation on the Lost World has reached a critical point, and we need you to take the Commando down there and destroy the enemy forces.<br><br>On to riches and victory!", "We need your help again, <%0>. Reports are coming in of a new sentinel in urban areas, swooping down and destroying our forces with barrages of rockets and accelerated kinetic weapons. We urgently need intelligence from someone who can face these new adversaries in battle.<br><br>Take the Turtle-class sentinel to the city and defeat the enemy forces there.<br><br>On to riches and victory!", "The new flying sentinels are devastating our war effort, <%0>. We are working on engineering our own version, but, in the meantime, we need you to go back to the city and fend off their attacks. You can take the Commando-class sentinel.<br><br>On to riches and victory!", "Superlative news, <%0>. We have completed work on the Hurricane-class sentinel. We haven't got time to test it: the situation in the city has become untenable. Squadrons of Hurricanes and worse are taking out all our forces.<br><br>You will be taking our prototype Hurricane-class sentinel. The probability of survival is slim, but do the best you can.<br><br>On to riches and victory, <%0>!", "Welcome back, <%0>. We need your expertise in the field. Take this Commando-class sentinel down to the ruined city and clear out the enemy forces.<br><br>On to riches and victory!", "<%1>, the ruined city is being overrun by Aquila-class sentinels. Take the Hurricane and destroy all the enemy Aquilas, and any other enemies that you encounter.<br><br>On to riches and victory!", "<%1>, the enemy is using a new anti-air sentinel, designated Scorpion-class. There are multiple Scorpions reported on the Lost World.<br><br>We don't have a strategy to defeat them yet, but take the Hurricane and do the best you can.<br><br>On to riches and victory!", "<%1>, the data from your battles with the Scorpions was invaluable. We have developed a working Scorpion of our own, but it needs to be tried out in combat.<br><br>Take the Scorpion to the war zone and defeat the enemy forces there.<br><br>On to riches and victory!", "Now we have our own working line of Scorpions, it's time to take back the Lost World. <%1>, go down there, take out the enemies, and report back on any new sentinels you face.<br><br>On to riches and victory!", "Worrying news, <%0>. The enemy's new heavy bipedal sentinel, designated Crusher-class, threatens to turn the tide of the war against us, and it's taking all of our resources to combat it.<br><br>We need more intel to develop our own, but all we can spare for this mission is an Aquila-class. Fortunately, the city should provide you with relatively safe vantage points, so you can avoid frontal attacks. We expect to see the combat skills that have made you famous.<br><br>On to riches and victory!", "Marvellous news, <%0>. From your intelligence we have developed our version of the Crusher-class sentinel. We have high hopes for it.<br><br>A star cruiser has crashed on the moon and our enemies are making forays to salvage it. Take the Crusher and fend them off. Be aware that the low gravity will affect the manoeuvring capabilities of all sentinels.<br><br>On to riches and victory!", "We have our enemies on the run, <%0>. Our superior skills have forced them to resort to their older models of sentinel. These are not as sophisticated as modern classes, but when they are fitted with increasingly powerful weapons, they pose a formidable threat.<br><br>Take the Scorpion back to the moon and take out the enemies.<br><br>On to riches and victory!", "The Bertha-class sentinel is not as obsolete as we thought, <%0>. Take it down to the Lost World and clear out the enemy forces.<br><br>On to riches and victory!", "The war has reached a critical juncture. The enemy is nearly defeated, but they are using experimental technology that we cannot defend against.<br><br>Take the Hurricane down to the Lost World and engage in combat. When you have taken out the rest of the enemy forces, they will send out their experimental models. You will have to use all the skills that have made you a legend to destroy them.<br><br>On to glory, <%0>!"};
    }
}
