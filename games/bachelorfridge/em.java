/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends am implements lja {
    private hf field_U;
    static kv field_S;
    static String field_V;
    static vr field_T;

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        pn.field_f = pn.field_f + 65536;
        L0: while (true) {
          if ((c.a(ph.field_D, pn.field_f, false) ^ -1) > -65537) {
            L1: {
              var2 = -1;
              if (null == oja.field_f) {
                if (null == taa.field_m) {
                  break L1;
                } else {
                  var2 = taa.field_m.length;
                  break L1;
                }
              } else {
                var2 = oja.field_f.length;
                break L1;
              }
            }
            L2: {
              if (-1 == var2) {
                break L2;
              } else {
                L3: {
                  if (ph.field_G <= gp.field_A) {
                    break L3;
                  } else {
                    L4: {
                      gp.field_A = gp.field_A + 1;
                      if (ph.field_E >= gp.field_A) {
                        break L4;
                      } else {
                        if (oja.field_f != null) {
                          if (null != oja.field_f[ih.field_l]) {
                            break L4;
                          } else {
                            gp.field_A = gp.field_A - 1;
                            break L3;
                          }
                        } else {
                          gp.field_A = gp.field_A - 1;
                          break L3;
                        }
                      }
                    }
                    if (gp.field_A < ph.field_G) {
                      break L3;
                    } else {
                      if (oja.field_f[(ih.field_l + 1) % var2] == null) {
                        gp.field_A = gp.field_A - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  if (gp.field_A >= ph.field_G) {
                    L6: {
                      vj.field_n = ih.field_l;
                      if (!ja.field_p) {
                        ih.field_l = ih.field_l - 1;
                        if ((ih.field_l ^ -1) > -1) {
                          ih.field_l = ih.field_l + var2;
                          break L6;
                        } else {
                          break L6;
                        }
                      } else {
                        ih.field_l = ih.field_l + 1;
                        if (ih.field_l < var2) {
                          break L6;
                        } else {
                          ih.field_l = ih.field_l - var2;
                          break L6;
                        }
                      }
                    }
                    gp.field_A = gp.field_A - ph.field_G;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (ph.field_E >= gp.field_A) {
                  break L2;
                } else {
                  ja.field_p = true;
                  break L2;
                }
              }
            }
            if (param1 == 0) {
              if (id.field_h != null) {
                L7: {
                  var3 = 357 + -(id.field_h.field_o / 2);
                  var4 = 0;
                  if (0 == lf.field_c) {
                    break L7;
                  } else {
                    if (var3 >= jc.field_r) {
                      break L7;
                    } else {
                      if (jc.field_r < id.field_h.field_p + var3) {
                        L8: {
                          if (269 + -id.field_h.field_q >= nfa.field_a) {
                            break L8;
                          } else {
                            if ((nfa.field_a ^ -1) <= -270) {
                              break L8;
                            } else {
                              var4 = 1;
                              ja.field_p = false;
                              gp.field_A = ph.field_G;
                              break L8;
                            }
                          }
                        }
                        if (586 >= nfa.field_a) {
                          break L7;
                        } else {
                          if (nfa.field_a >= 586 + id.field_h.field_q) {
                            break L7;
                          } else {
                            var4 = 1;
                            ja.field_p = true;
                            gp.field_A = ph.field_G;
                            break L7;
                          }
                        }
                      } else {
                        L9: {
                          if (var4 != 0) {
                            break L9;
                          } else {
                            if (ph.field_E >= gp.field_A) {
                              break L9;
                            } else {
                              if (gd.field_m <= var3) {
                                break L9;
                              } else {
                                if (id.field_h.field_p + var3 > gd.field_m) {
                                  L10: {
                                    if (-id.field_h.field_q + 269 >= mk.field_p) {
                                      break L10;
                                    } else {
                                      if (mk.field_p < 269) {
                                        gp.field_A = ph.field_E;
                                        break L10;
                                      } else {
                                        L11: {
                                          if (586 >= mk.field_p) {
                                            break L11;
                                          } else {
                                            if (mk.field_p >= 586 - -id.field_h.field_q) {
                                              break L11;
                                            } else {
                                              gp.field_A = ph.field_E;
                                              break L11;
                                            }
                                          }
                                        }
                                        if (param0) {
                                          L12: {
                                            ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                                            if (!ic.field_i.e(0)) {
                                              break L12;
                                            } else {
                                              if (ic.field_i.field_g == 0) {
                                                return 3;
                                              } else {
                                                if ((ic.field_i.field_g ^ -1) != -2) {
                                                  break L12;
                                                } else {
                                                  return 2;
                                                }
                                              }
                                            }
                                          }
                                          L13: while (true) {
                                            if (kaa.b(param1 + 127)) {
                                              L14: {
                                                ic.field_i.a(0, -128);
                                                if (ic.field_i.e(0)) {
                                                  if (ic.field_i.field_g != 0) {
                                                    if (1 != ic.field_i.field_g) {
                                                      break L14;
                                                    } else {
                                                      return 1;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                } else {
                                                  break L14;
                                                }
                                              }
                                              if (gf.field_k == 13) {
                                                return 1;
                                              } else {
                                                continue L13;
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
                                  if (586 >= mk.field_p) {
                                    break L9;
                                  } else {
                                    if (mk.field_p >= 586 - -id.field_h.field_q) {
                                      break L9;
                                    } else {
                                      L15: {
                                        gp.field_A = ph.field_E;
                                        if (!param0) {
                                          break L15;
                                        } else {
                                          L16: {
                                            ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                                            if (!ic.field_i.e(0)) {
                                              break L16;
                                            } else {
                                              if (ic.field_i.field_g == 0) {
                                                return 3;
                                              } else {
                                                if ((ic.field_i.field_g ^ -1) != -2) {
                                                  break L16;
                                                } else {
                                                  return 2;
                                                }
                                              }
                                            }
                                          }
                                          L17: while (true) {
                                            if (!kaa.b(param1 + 127)) {
                                              break L15;
                                            } else {
                                              L18: {
                                                ic.field_i.a(0, -128);
                                                if (ic.field_i.e(0)) {
                                                  if (ic.field_i.field_g != 0) {
                                                    if (1 != ic.field_i.field_g) {
                                                      break L18;
                                                    } else {
                                                      return 1;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                } else {
                                                  break L18;
                                                }
                                              }
                                              if (gf.field_k == 13) {
                                                return 1;
                                              } else {
                                                continue L17;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      return 0;
                                    }
                                  }
                                } else {
                                  if (param0) {
                                    L19: {
                                      ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                                      if (!ic.field_i.e(0)) {
                                        break L19;
                                      } else {
                                        if (ic.field_i.field_g == 0) {
                                          return 3;
                                        } else {
                                          if ((ic.field_i.field_g ^ -1) != -2) {
                                            break L19;
                                          } else {
                                            return 2;
                                          }
                                        }
                                      }
                                    }
                                    L20: while (true) {
                                      if (kaa.b(param1 + 127)) {
                                        L21: {
                                          ic.field_i.a(0, -128);
                                          if (ic.field_i.e(0)) {
                                            if (ic.field_i.field_g != 0) {
                                              if (1 != ic.field_i.field_g) {
                                                break L21;
                                              } else {
                                                return 1;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L21;
                                          }
                                        }
                                        if (gf.field_k == 13) {
                                          return 1;
                                        } else {
                                          continue L20;
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
                        L22: {
                          if (!param0) {
                            break L22;
                          } else {
                            L23: {
                              ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                              if (!ic.field_i.e(0)) {
                                break L23;
                              } else {
                                if (ic.field_i.field_g == 0) {
                                  return 3;
                                } else {
                                  if ((ic.field_i.field_g ^ -1) != -2) {
                                    break L23;
                                  } else {
                                    return 2;
                                  }
                                }
                              }
                            }
                            L24: while (true) {
                              if (!kaa.b(param1 + 127)) {
                                break L22;
                              } else {
                                L25: {
                                  ic.field_i.a(0, -128);
                                  if (ic.field_i.e(0)) {
                                    if (ic.field_i.field_g != 0) {
                                      if (1 != ic.field_i.field_g) {
                                        break L25;
                                      } else {
                                        return 1;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  } else {
                                    break L25;
                                  }
                                }
                                if (gf.field_k == 13) {
                                  return 1;
                                } else {
                                  continue L24;
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
                L26: {
                  if (var4 != 0) {
                    break L26;
                  } else {
                    if (ph.field_E >= gp.field_A) {
                      break L26;
                    } else {
                      if (gd.field_m <= var3) {
                        break L26;
                      } else {
                        if (id.field_h.field_p + var3 > gd.field_m) {
                          L27: {
                            if (-id.field_h.field_q + 269 >= mk.field_p) {
                              break L27;
                            } else {
                              if (mk.field_p < 269) {
                                gp.field_A = ph.field_E;
                                break L27;
                              } else {
                                L28: {
                                  if (586 >= mk.field_p) {
                                    break L28;
                                  } else {
                                    if (mk.field_p >= 586 - -id.field_h.field_q) {
                                      break L28;
                                    } else {
                                      L29: {
                                        gp.field_A = ph.field_E;
                                        if (!param0) {
                                          break L29;
                                        } else {
                                          L30: {
                                            ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                                            if (!ic.field_i.e(0)) {
                                              break L30;
                                            } else {
                                              if (ic.field_i.field_g == 0) {
                                                return 3;
                                              } else {
                                                if ((ic.field_i.field_g ^ -1) != -2) {
                                                  break L30;
                                                } else {
                                                  return 2;
                                                }
                                              }
                                            }
                                          }
                                          L31: while (true) {
                                            if (!kaa.b(param1 + 127)) {
                                              break L29;
                                            } else {
                                              L32: {
                                                ic.field_i.a(0, -128);
                                                if (ic.field_i.e(0)) {
                                                  if (ic.field_i.field_g != 0) {
                                                    if (1 != ic.field_i.field_g) {
                                                      break L32;
                                                    } else {
                                                      return 1;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                } else {
                                                  break L32;
                                                }
                                              }
                                              if (gf.field_k == 13) {
                                                return 1;
                                              } else {
                                                continue L31;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      return 0;
                                    }
                                  }
                                }
                                L33: {
                                  if (!param0) {
                                    break L33;
                                  } else {
                                    L34: {
                                      ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                                      if (!ic.field_i.e(0)) {
                                        break L34;
                                      } else {
                                        if (ic.field_i.field_g == 0) {
                                          return 3;
                                        } else {
                                          if ((ic.field_i.field_g ^ -1) != -2) {
                                            break L34;
                                          } else {
                                            return 2;
                                          }
                                        }
                                      }
                                    }
                                    L35: while (true) {
                                      if (!kaa.b(param1 + 127)) {
                                        break L33;
                                      } else {
                                        L36: {
                                          ic.field_i.a(0, -128);
                                          if (ic.field_i.e(0)) {
                                            if (ic.field_i.field_g != 0) {
                                              if (1 != ic.field_i.field_g) {
                                                break L36;
                                              } else {
                                                return 1;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L36;
                                          }
                                        }
                                        if (gf.field_k == 13) {
                                          return 1;
                                        } else {
                                          continue L35;
                                        }
                                      }
                                    }
                                  }
                                }
                                return 0;
                              }
                            }
                          }
                          if (586 >= mk.field_p) {
                            break L26;
                          } else {
                            if (mk.field_p >= 586 - -id.field_h.field_q) {
                              break L26;
                            } else {
                              L37: {
                                gp.field_A = ph.field_E;
                                if (!param0) {
                                  break L37;
                                } else {
                                  L38: {
                                    ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                                    if (!ic.field_i.e(0)) {
                                      break L38;
                                    } else {
                                      if (ic.field_i.field_g == 0) {
                                        return 3;
                                      } else {
                                        if ((ic.field_i.field_g ^ -1) != -2) {
                                          break L38;
                                        } else {
                                          return 2;
                                        }
                                      }
                                    }
                                  }
                                  L39: while (true) {
                                    if (!kaa.b(param1 + 127)) {
                                      break L37;
                                    } else {
                                      L40: {
                                        ic.field_i.a(0, -128);
                                        if (ic.field_i.e(0)) {
                                          if (ic.field_i.field_g != 0) {
                                            if (1 != ic.field_i.field_g) {
                                              break L40;
                                            } else {
                                              return 1;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        } else {
                                          break L40;
                                        }
                                      }
                                      if (gf.field_k == 13) {
                                        return 1;
                                      } else {
                                        continue L39;
                                      }
                                    }
                                  }
                                }
                              }
                              return 0;
                            }
                          }
                        } else {
                          L41: {
                            if (!param0) {
                              break L41;
                            } else {
                              L42: {
                                ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                                if (!ic.field_i.e(0)) {
                                  break L42;
                                } else {
                                  if (ic.field_i.field_g == 0) {
                                    return 3;
                                  } else {
                                    if ((ic.field_i.field_g ^ -1) != -2) {
                                      break L42;
                                    } else {
                                      return 2;
                                    }
                                  }
                                }
                              }
                              L43: while (true) {
                                if (!kaa.b(param1 + 127)) {
                                  break L41;
                                } else {
                                  L44: {
                                    ic.field_i.a(0, -128);
                                    if (ic.field_i.e(0)) {
                                      if (ic.field_i.field_g != 0) {
                                        if (1 != ic.field_i.field_g) {
                                          break L44;
                                        } else {
                                          return 1;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    } else {
                                      break L44;
                                    }
                                  }
                                  if (gf.field_k == 13) {
                                    return 1;
                                  } else {
                                    continue L43;
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
                L45: {
                  if (!param0) {
                    break L45;
                  } else {
                    L46: {
                      ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                      if (!ic.field_i.e(0)) {
                        break L46;
                      } else {
                        if (ic.field_i.field_g == 0) {
                          return 3;
                        } else {
                          if ((ic.field_i.field_g ^ -1) != -2) {
                            break L46;
                          } else {
                            return 2;
                          }
                        }
                      }
                    }
                    L47: while (true) {
                      if (!kaa.b(param1 + 127)) {
                        break L45;
                      } else {
                        L48: {
                          ic.field_i.a(0, -128);
                          if (ic.field_i.e(0)) {
                            if (ic.field_i.field_g != 0) {
                              if (1 != ic.field_i.field_g) {
                                break L48;
                              } else {
                                return 1;
                              }
                            } else {
                              return 3;
                            }
                          } else {
                            break L48;
                          }
                        }
                        if (gf.field_k == 13) {
                          return 1;
                        } else {
                          continue L47;
                        }
                      }
                    }
                  }
                }
                return 0;
              } else {
                if (param0) {
                  L49: {
                    ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                    if (!ic.field_i.e(0)) {
                      break L49;
                    } else {
                      if (ic.field_i.field_g == 0) {
                        return 3;
                      } else {
                        if ((ic.field_i.field_g ^ -1) != -2) {
                          break L49;
                        } else {
                          return 2;
                        }
                      }
                    }
                  }
                  L50: while (true) {
                    if (kaa.b(param1 + 127)) {
                      L51: {
                        ic.field_i.a(0, -128);
                        if (ic.field_i.e(0)) {
                          if (ic.field_i.field_g != 0) {
                            if (1 != ic.field_i.field_g) {
                              break L51;
                            } else {
                              return 1;
                            }
                          } else {
                            return 3;
                          }
                        } else {
                          break L51;
                        }
                      }
                      if (gf.field_k == 13) {
                        return 1;
                      } else {
                        continue L50;
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
              L52: {
                field_V = null;
                if (id.field_h != null) {
                  L53: {
                    var3 = 357 + -(id.field_h.field_o / 2);
                    var4 = 0;
                    if (0 == lf.field_c) {
                      break L53;
                    } else {
                      if (var3 >= jc.field_r) {
                        break L53;
                      } else {
                        if (jc.field_r < id.field_h.field_p + var3) {
                          L54: {
                            if (269 + -id.field_h.field_q >= nfa.field_a) {
                              break L54;
                            } else {
                              if ((nfa.field_a ^ -1) <= -270) {
                                break L54;
                              } else {
                                var4 = 1;
                                ja.field_p = false;
                                gp.field_A = ph.field_G;
                                break L54;
                              }
                            }
                          }
                          if (586 >= nfa.field_a) {
                            break L53;
                          } else {
                            if (nfa.field_a >= 586 + id.field_h.field_q) {
                              break L53;
                            } else {
                              var4 = 1;
                              ja.field_p = true;
                              gp.field_A = ph.field_G;
                              break L53;
                            }
                          }
                        } else {
                          break L53;
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L52;
                  } else {
                    if (ph.field_E >= gp.field_A) {
                      break L52;
                    } else {
                      if (gd.field_m <= var3) {
                        break L52;
                      } else {
                        if (id.field_h.field_p + var3 > gd.field_m) {
                          if (-id.field_h.field_q + 269 >= mk.field_p) {
                            if (586 >= mk.field_p) {
                              break L52;
                            } else {
                              if (mk.field_p >= 586 - -id.field_h.field_q) {
                                break L52;
                              } else {
                                gp.field_A = ph.field_E;
                                break L52;
                              }
                            }
                          } else {
                            if (586 >= mk.field_p) {
                              break L52;
                            } else {
                              if (mk.field_p >= 586 - -id.field_h.field_q) {
                                break L52;
                              } else {
                                gp.field_A = ph.field_E;
                                break L52;
                              }
                            }
                          }
                        } else {
                          break L52;
                        }
                      }
                    }
                  }
                } else {
                  break L52;
                }
              }
              if (param0) {
                L55: {
                  ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                  if (!ic.field_i.e(0)) {
                    break L55;
                  } else {
                    if (ic.field_i.field_g == 0) {
                      return 3;
                    } else {
                      if ((ic.field_i.field_g ^ -1) != -2) {
                        break L55;
                      } else {
                        return 2;
                      }
                    }
                  }
                }
                L56: while (true) {
                  if (kaa.b(param1 + 127)) {
                    L57: {
                      ic.field_i.a(0, -128);
                      if (ic.field_i.e(0)) {
                        if (ic.field_i.field_g != 0) {
                          if (1 != ic.field_i.field_g) {
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
                    if (gf.field_k == 13) {
                      return 1;
                    } else {
                      continue L56;
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
            wga.field_s = wga.field_s + 1;
            pn.field_f = pn.field_f - ph.field_D;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1) {
        L0: {
          fb.field_p = param1 >> -1020979388 & 3;
          if ((fb.field_p ^ -1) < -3) {
            fb.field_p = 2;
            break L0;
          } else {
            break L0;
          }
        }
        ri.field_c = param1 >> -1899794398 & 3;
        if (2 >= ri.field_c) {
          fj.field_g = 3 & param1;
          if (param0 >= fj.field_g) {
            return;
          } else {
            fj.field_g = 2;
            return;
          }
        } else {
          ri.field_c = 2;
          fj.field_g = 3 & param1;
          if (param0 >= fj.field_g) {
            return;
          } else {
            fj.field_g = 2;
            return;
          }
        }
    }

    private final hf a(int param0, String param1, pl param2) {
        hf var4 = new hf(param1, param2);
        var4.field_f = (qda) (Object) new ff();
        int var6 = -85 % ((param0 - -69) / 54);
        int var5 = ((em) this).field_q + -6;
        ((em) this).field_q = ((em) this).field_q + 38;
        var4.a(15, 30, (byte) 59, ((em) this).field_p + -14 - 16, var5);
        ((em) this).c((wj) (Object) var4, 61);
        ((em) this).d(6);
        return var4;
    }

    em(rp param0, lo param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        wj var6 = null;
        Object var7 = null;
        wj var8 = null;
        String var9 = null;
        wj var10 = null;
        wj var11 = null;
        var7 = null;
        if (dn.field_b != param1) {
          if (r.field_m == param1) {
            L0: {
              var3 = cn.field_k;
              ((em) this).field_q = ((em) this).field_q + 10;
              if (!od.e((byte) -127)) {
                break L0;
              } else {
                ((em) this).field_q = ((em) this).field_q + 20;
                var3 = dm.field_e;
                break L0;
              }
            }
            var11 = new wj(var3, (pl) null);
            var11.field_v = 50;
            var11.field_q = 80;
            var11.field_s = 0;
            var11.field_p = ((em) this).field_p;
            var11.field_f = (qda) (Object) new gha(oc.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((em) this).c(var11, 70);
            ((em) this).field_U = this.a(-2, ala.field_d, (pl) this);
          } else {
            if (param1 == tma.field_x) {
              ((em) this).field_q = ((em) this).field_q + 30;
              var9 = jia.field_l;
              var3 = var9;
              var3 = var9;
              var10 = new wj(var9, (pl) null);
              var10.field_v = 50;
              var10.field_q = 80;
              var10.field_s = 0;
              var10.field_p = ((em) this).field_p;
              var10.field_f = (qda) (Object) new gha(oc.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((em) this).c(var10, 70);
              ((em) this).field_U = this.a(-2, ala.field_d, (pl) this);
            } else {
              var8 = new wj((String) var7, (pl) null);
              var8.field_v = 50;
              var8.field_q = 80;
              var8.field_s = 0;
              var8.field_p = ((em) this).field_p;
              var8.field_f = (qda) (Object) new gha(oc.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((em) this).c(var8, 70);
              ((em) this).field_U = this.a(-2, ala.field_d, (pl) this);
            }
          }
        } else {
          var5 = qca.field_l;
          var6 = new wj(var5, (pl) null);
          var6.field_v = 50;
          var6.field_q = 80;
          var6.field_s = 0;
          var6.field_p = ((em) this).field_p;
          var6.field_f = (qda) (Object) new gha(oc.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((em) this).c(var6, 70);
          ((em) this).field_U = this.a(-2, ala.field_d, (pl) this);
        }
    }

    private final void n(int param0) {
        if (!((em) this).field_C) {
            return;
        }
        if (param0 != 0) {
            field_T = null;
            ((em) this).field_C = false;
            return;
        }
        ((em) this).field_C = false;
    }

    final static boolean d(byte param0) {
        if (param0 > -26) {
            return true;
        }
        return null != wh.field_p ? true : false;
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        if (((em) this).field_U != param1) {
          if (param3 >= 50) {
            return;
          } else {
            field_T = null;
            return;
          }
        } else {
          this.n(0);
          if (param3 >= 50) {
            return;
          } else {
            field_T = null;
            return;
          }
        }
    }

    public static void o(int param0) {
        field_T = null;
        field_S = null;
        field_V = null;
        if (param0 == -22799) {
            return;
        }
        em.o(95);
    }

    static {
    }
}
