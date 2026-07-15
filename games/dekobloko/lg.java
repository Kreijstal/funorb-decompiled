/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends kf implements vn {
    static se field_Y;
    private ek field_V;
    private ek field_S;
    private ek field_X;
    static int field_W;
    static String field_T;
    static int field_U;

    public lg() {
        super(0, 0, 476, 225, (gl) null);
        ((lg) this).field_X = new ek(i.field_f, (kg) null);
        ((lg) this).field_S = new ek(ec.field_q, (kg) null);
        ((lg) this).field_V = new ek(ic.field_b, (kg) null);
        fk var1 = new fk();
        ((lg) this).field_X.field_p = (gl) (Object) var1;
        ((lg) this).field_S.field_p = (gl) (Object) var1;
        ((lg) this).field_V.field_p = (gl) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -176982079;
        ((lg) this).field_S.b(30, var4, -var3 + ((lg) this).field_t >> 389726337, -var2 + (((lg) this).field_y - 48), -16555);
        ((lg) this).field_V.b(30, var4, var4 + ((-var3 + ((lg) this).field_t >> 485816257) + var2), -48 + (((lg) this).field_y - var2), -16555);
        ((lg) this).field_X.b(30, var3, ((lg) this).field_t + -var3 >> -18885599, -(2 * var2) + -78 + ((lg) this).field_y, -16555);
        ((lg) this).field_S.field_v = (kg) this;
        ((lg) this).field_X.field_v = (kg) this;
        ((lg) this).field_X.field_B = tm.field_h;
        ((lg) this).field_V.field_v = (kg) this;
        ((lg) this).field_V.field_B = kh.field_c;
        ((lg) this).b((ce) (Object) ((lg) this).field_S, (byte) -55);
        ((lg) this).b((ce) (Object) ((lg) this).field_X, (byte) -55);
        ((lg) this).b((ce) (Object) ((lg) this).field_V, (byte) -55);
    }

    public static void f(byte param0) {
        if (param0 != 1) {
            field_T = null;
            field_T = null;
            field_Y = null;
            return;
        }
        field_T = null;
        field_Y = null;
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        sc.field_n = sc.field_n + 65536;
        L0: while (true) {
          if (um.a(dk.field_c, sc.field_n, param0 + 11469) < 65536) {
            L1: {
              var2 = -1;
              if (null != d.field_h) {
                var2 = d.field_h.length;
                break L1;
              } else {
                if (vi.field_z == null) {
                  break L1;
                } else {
                  var2 = vi.field_z.length;
                  break L1;
                }
              }
            }
            L2: {
              if (-1 == var2) {
                break L2;
              } else {
                L3: {
                  if (ac.field_F >= dk.field_g) {
                    break L3;
                  } else {
                    L4: {
                      ac.field_F = ac.field_F + 1;
                      if (dk.field_i >= ac.field_F) {
                        break L4;
                      } else {
                        if (null != d.field_h) {
                          if (d.field_h[wh.field_a] != null) {
                            break L4;
                          } else {
                            ac.field_F = ac.field_F - 1;
                            break L3;
                          }
                        } else {
                          ac.field_F = ac.field_F - 1;
                          break L3;
                        }
                      }
                    }
                    if (ac.field_F < dk.field_g) {
                      break L3;
                    } else {
                      if (d.field_h[(1 + wh.field_a) % var2] == null) {
                        ac.field_F = ac.field_F - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  if (dk.field_g > ac.field_F) {
                    break L5;
                  } else {
                    bh.field_m = wh.field_a;
                    if (lb.field_b) {
                      wh.field_a = wh.field_a + 1;
                      if (wh.field_a >= var2) {
                        wh.field_a = wh.field_a - var2;
                        ac.field_F = ac.field_F - dk.field_g;
                        break L5;
                      } else {
                        ac.field_F = ac.field_F - dk.field_g;
                        break L5;
                      }
                    } else {
                      wh.field_a = wh.field_a - 1;
                      if (wh.field_a < 0) {
                        wh.field_a = wh.field_a + var2;
                        ac.field_F = ac.field_F - dk.field_g;
                        break L5;
                      } else {
                        ac.field_F = ac.field_F - dk.field_g;
                        break L5;
                      }
                    }
                  }
                }
                if (dk.field_i < ac.field_F) {
                  lb.field_b = true;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (ge.field_h != null) {
              var3 = -(ge.field_h.field_C / 2) + 357;
              var4 = 0;
              if (ig.field_Yb != 0) {
                L6: {
                  if (nf.field_h <= var3) {
                    break L6;
                  } else {
                    if (nf.field_h < ge.field_h.field_H + var3) {
                      L7: {
                        if (he.field_S <= 269 + -ge.field_h.field_I) {
                          break L7;
                        } else {
                          if (he.field_S >= 269) {
                            break L7;
                          } else {
                            lb.field_b = false;
                            var4 = 1;
                            ac.field_F = dk.field_g;
                            break L7;
                          }
                        }
                      }
                      if (-587 <= (he.field_S ^ -1)) {
                        break L6;
                      } else {
                        if (he.field_S >= ge.field_h.field_I + 586) {
                          break L6;
                        } else {
                          lb.field_b = true;
                          var4 = 1;
                          ac.field_F = dk.field_g;
                          break L6;
                        }
                      }
                    } else {
                      L8: {
                        if (var4 != 0) {
                          break L8;
                        } else {
                          if (ac.field_F <= dk.field_i) {
                            break L8;
                          } else {
                            if (var3 >= pm.field_f) {
                              break L8;
                            } else {
                              if (pm.field_f < ge.field_h.field_H + var3) {
                                L9: {
                                  if (269 - ge.field_h.field_I >= bh.field_g) {
                                    break L9;
                                  } else {
                                    if (bh.field_g >= 269) {
                                      break L9;
                                    } else {
                                      ac.field_F = dk.field_i;
                                      break L9;
                                    }
                                  }
                                }
                                if (-587 <= (bh.field_g ^ -1)) {
                                  break L8;
                                } else {
                                  if (bh.field_g < 586 - -ge.field_h.field_I) {
                                    ac.field_F = dk.field_i;
                                    break L8;
                                  } else {
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
                      if (param0 == 0) {
                        if (param1) {
                          L10: {
                            rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                            if (rg.field_a.b((byte) 114)) {
                              if (-1 == (rg.field_a.field_h ^ -1)) {
                                return 3;
                              } else {
                                if ((rg.field_a.field_h ^ -1) == -2) {
                                  return 2;
                                } else {
                                  break L10;
                                }
                              }
                            } else {
                              break L10;
                            }
                          }
                          L11: while (true) {
                            if (ab.c((byte) -125)) {
                              L12: {
                                rg.field_a.a((byte) 58, 0);
                                if (!rg.field_a.b((byte) 114)) {
                                  break L12;
                                } else {
                                  if (rg.field_a.field_h != 0) {
                                    if (1 != rg.field_a.field_h) {
                                      break L12;
                                    } else {
                                      return 1;
                                    }
                                  } else {
                                    return 3;
                                  }
                                }
                              }
                              if (wh.field_c != 13) {
                                continue L11;
                              } else {
                                return 1;
                              }
                            } else {
                              return 0;
                            }
                          }
                        } else {
                          return 0;
                        }
                      } else {
                        return 81;
                      }
                    }
                  }
                }
                if (var4 == 0) {
                  if (ac.field_F > dk.field_i) {
                    L13: {
                      if (var3 >= pm.field_f) {
                        break L13;
                      } else {
                        if (pm.field_f < ge.field_h.field_H + var3) {
                          L14: {
                            if (269 - ge.field_h.field_I >= bh.field_g) {
                              break L14;
                            } else {
                              if (bh.field_g >= 269) {
                                break L14;
                              } else {
                                L15: {
                                  ac.field_F = dk.field_i;
                                  if (-587 <= (bh.field_g ^ -1)) {
                                    break L15;
                                  } else {
                                    if (bh.field_g < 586 - -ge.field_h.field_I) {
                                      ac.field_F = dk.field_i;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                if (param0 == 0) {
                                  if (!param1) {
                                    return 0;
                                  } else {
                                    rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                                    if (rg.field_a.b((byte) 114)) {
                                      if (-1 == (rg.field_a.field_h ^ -1)) {
                                        return 3;
                                      } else {
                                        if ((rg.field_a.field_h ^ -1) == -2) {
                                          return 2;
                                        } else {
                                          L16: while (true) {
                                            if (!ab.c((byte) -125)) {
                                              return 0;
                                            } else {
                                              L17: {
                                                rg.field_a.a((byte) 58, 0);
                                                if (!rg.field_a.b((byte) 114)) {
                                                  break L17;
                                                } else {
                                                  if (rg.field_a.field_h != 0) {
                                                    if (1 != rg.field_a.field_h) {
                                                      break L17;
                                                    } else {
                                                      return 1;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                }
                                              }
                                              if (wh.field_c != 13) {
                                                continue L16;
                                              } else {
                                                return 1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L18: while (true) {
                                        if (!ab.c((byte) -125)) {
                                          return 0;
                                        } else {
                                          L19: {
                                            rg.field_a.a((byte) 58, 0);
                                            if (!rg.field_a.b((byte) 114)) {
                                              break L19;
                                            } else {
                                              if (rg.field_a.field_h != 0) {
                                                if (1 != rg.field_a.field_h) {
                                                  break L19;
                                                } else {
                                                  return 1;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            }
                                          }
                                          if (wh.field_c != 13) {
                                            continue L18;
                                          } else {
                                            return 1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  return 81;
                                }
                              }
                            }
                          }
                          if (-587 <= (bh.field_g ^ -1)) {
                            break L13;
                          } else {
                            if (bh.field_g < 586 - -ge.field_h.field_I) {
                              ac.field_F = dk.field_i;
                              break L13;
                            } else {
                              if (param0 == 0) {
                                if (!param1) {
                                  return 0;
                                } else {
                                  rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                                  if (rg.field_a.b((byte) 114)) {
                                    if (-1 == (rg.field_a.field_h ^ -1)) {
                                      return 3;
                                    } else {
                                      if ((rg.field_a.field_h ^ -1) == -2) {
                                        return 2;
                                      } else {
                                        L20: while (true) {
                                          if (!ab.c((byte) -125)) {
                                            return 0;
                                          } else {
                                            L21: {
                                              rg.field_a.a((byte) 58, 0);
                                              if (!rg.field_a.b((byte) 114)) {
                                                break L21;
                                              } else {
                                                if (rg.field_a.field_h != 0) {
                                                  if (1 != rg.field_a.field_h) {
                                                    break L21;
                                                  } else {
                                                    return 1;
                                                  }
                                                } else {
                                                  return 3;
                                                }
                                              }
                                            }
                                            if (wh.field_c != 13) {
                                              continue L20;
                                            } else {
                                              return 1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L22: while (true) {
                                      if (!ab.c((byte) -125)) {
                                        return 0;
                                      } else {
                                        L23: {
                                          rg.field_a.a((byte) 58, 0);
                                          if (!rg.field_a.b((byte) 114)) {
                                            break L23;
                                          } else {
                                            if (rg.field_a.field_h != 0) {
                                              if (1 != rg.field_a.field_h) {
                                                break L23;
                                              } else {
                                                return 1;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          }
                                        }
                                        if (wh.field_c != 13) {
                                          continue L22;
                                        } else {
                                          return 1;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                return 81;
                              }
                            }
                          }
                        } else {
                          if (param0 == 0) {
                            L24: {
                              if (!param1) {
                                break L24;
                              } else {
                                L25: {
                                  rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                                  if (rg.field_a.b((byte) 114)) {
                                    if (-1 == (rg.field_a.field_h ^ -1)) {
                                      return 3;
                                    } else {
                                      if ((rg.field_a.field_h ^ -1) == -2) {
                                        return 2;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  } else {
                                    break L25;
                                  }
                                }
                                L26: while (true) {
                                  if (!ab.c((byte) -125)) {
                                    break L24;
                                  } else {
                                    L27: {
                                      rg.field_a.a((byte) 58, 0);
                                      if (!rg.field_a.b((byte) 114)) {
                                        break L27;
                                      } else {
                                        if (rg.field_a.field_h != 0) {
                                          if (1 != rg.field_a.field_h) {
                                            break L27;
                                          } else {
                                            return 1;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      }
                                    }
                                    if (wh.field_c != 13) {
                                      continue L26;
                                    } else {
                                      return 1;
                                    }
                                  }
                                }
                              }
                            }
                            return 0;
                          } else {
                            return 81;
                          }
                        }
                      }
                    }
                    if (param0 == 0) {
                      if (!param1) {
                        return 0;
                      } else {
                        rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                        if (rg.field_a.b((byte) 114)) {
                          if (-1 == (rg.field_a.field_h ^ -1)) {
                            return 3;
                          } else {
                            if ((rg.field_a.field_h ^ -1) == -2) {
                              return 2;
                            } else {
                              L28: while (true) {
                                if (!ab.c((byte) -125)) {
                                  return 0;
                                } else {
                                  L29: {
                                    rg.field_a.a((byte) 58, 0);
                                    if (!rg.field_a.b((byte) 114)) {
                                      break L29;
                                    } else {
                                      if (rg.field_a.field_h != 0) {
                                        if (1 != rg.field_a.field_h) {
                                          break L29;
                                        } else {
                                          return 1;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    }
                                  }
                                  if (wh.field_c != 13) {
                                    continue L28;
                                  } else {
                                    return 1;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L30: while (true) {
                            if (!ab.c((byte) -125)) {
                              return 0;
                            } else {
                              L31: {
                                rg.field_a.a((byte) 58, 0);
                                if (!rg.field_a.b((byte) 114)) {
                                  break L31;
                                } else {
                                  if (rg.field_a.field_h != 0) {
                                    if (1 != rg.field_a.field_h) {
                                      break L31;
                                    } else {
                                      return 1;
                                    }
                                  } else {
                                    return 3;
                                  }
                                }
                              }
                              if (wh.field_c != 13) {
                                continue L30;
                              } else {
                                return 1;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      return 81;
                    }
                  } else {
                    if (param0 == 0) {
                      if (!param1) {
                        return 0;
                      } else {
                        rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                        if (rg.field_a.b((byte) 114)) {
                          if (-1 == (rg.field_a.field_h ^ -1)) {
                            return 3;
                          } else {
                            if ((rg.field_a.field_h ^ -1) == -2) {
                              return 2;
                            } else {
                              L32: while (true) {
                                if (!ab.c((byte) -125)) {
                                  return 0;
                                } else {
                                  L33: {
                                    rg.field_a.a((byte) 58, 0);
                                    if (!rg.field_a.b((byte) 114)) {
                                      break L33;
                                    } else {
                                      if (rg.field_a.field_h != 0) {
                                        if (1 != rg.field_a.field_h) {
                                          break L33;
                                        } else {
                                          return 1;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    }
                                  }
                                  if (wh.field_c != 13) {
                                    continue L32;
                                  } else {
                                    return 1;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L34: while (true) {
                            if (!ab.c((byte) -125)) {
                              return 0;
                            } else {
                              L35: {
                                rg.field_a.a((byte) 58, 0);
                                if (!rg.field_a.b((byte) 114)) {
                                  break L35;
                                } else {
                                  if (rg.field_a.field_h != 0) {
                                    if (1 != rg.field_a.field_h) {
                                      break L35;
                                    } else {
                                      return 1;
                                    }
                                  } else {
                                    return 3;
                                  }
                                }
                              }
                              if (wh.field_c != 13) {
                                continue L34;
                              } else {
                                return 1;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      return 81;
                    }
                  }
                } else {
                  if (param0 == 0) {
                    if (param1) {
                      rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                      if (rg.field_a.b((byte) 114)) {
                        if (-1 == (rg.field_a.field_h ^ -1)) {
                          return 3;
                        } else {
                          if ((rg.field_a.field_h ^ -1) != -2) {
                            L36: while (true) {
                              if (!ab.c((byte) -125)) {
                                return 0;
                              } else {
                                L37: {
                                  rg.field_a.a((byte) 58, 0);
                                  if (!rg.field_a.b((byte) 114)) {
                                    break L37;
                                  } else {
                                    if (rg.field_a.field_h != 0) {
                                      if (1 != rg.field_a.field_h) {
                                        break L37;
                                      } else {
                                        return 1;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  }
                                }
                                if (wh.field_c != 13) {
                                  continue L36;
                                } else {
                                  return 1;
                                }
                              }
                            }
                          } else {
                            return 2;
                          }
                        }
                      } else {
                        L38: while (true) {
                          if (ab.c((byte) -125)) {
                            L39: {
                              rg.field_a.a((byte) 58, 0);
                              if (!rg.field_a.b((byte) 114)) {
                                break L39;
                              } else {
                                if (rg.field_a.field_h != 0) {
                                  if (1 != rg.field_a.field_h) {
                                    break L39;
                                  } else {
                                    return 1;
                                  }
                                } else {
                                  return 3;
                                }
                              }
                            }
                            if (wh.field_c != 13) {
                              continue L38;
                            } else {
                              return 1;
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
                    return 81;
                  }
                }
              } else {
                L40: {
                  if (var4 != 0) {
                    break L40;
                  } else {
                    if (ac.field_F <= dk.field_i) {
                      break L40;
                    } else {
                      if (var3 >= pm.field_f) {
                        break L40;
                      } else {
                        if (pm.field_f < ge.field_h.field_H + var3) {
                          L41: {
                            if (269 - ge.field_h.field_I >= bh.field_g) {
                              break L41;
                            } else {
                              if (bh.field_g >= 269) {
                                break L41;
                              } else {
                                L42: {
                                  ac.field_F = dk.field_i;
                                  if (-587 <= (bh.field_g ^ -1)) {
                                    break L42;
                                  } else {
                                    if (bh.field_g < 586 - -ge.field_h.field_I) {
                                      ac.field_F = dk.field_i;
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                                if (param0 == 0) {
                                  if (param1) {
                                    L43: {
                                      rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                                      if (rg.field_a.b((byte) 114)) {
                                        if (-1 == (rg.field_a.field_h ^ -1)) {
                                          return 3;
                                        } else {
                                          if ((rg.field_a.field_h ^ -1) == -2) {
                                            return 2;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      } else {
                                        break L43;
                                      }
                                    }
                                    L44: while (true) {
                                      if (ab.c((byte) -125)) {
                                        L45: {
                                          rg.field_a.a((byte) 58, 0);
                                          if (!rg.field_a.b((byte) 114)) {
                                            break L45;
                                          } else {
                                            if (rg.field_a.field_h != 0) {
                                              if (1 != rg.field_a.field_h) {
                                                break L45;
                                              } else {
                                                return 1;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          }
                                        }
                                        if (wh.field_c != 13) {
                                          continue L44;
                                        } else {
                                          return 1;
                                        }
                                      } else {
                                        return 0;
                                      }
                                    }
                                  } else {
                                    return 0;
                                  }
                                } else {
                                  return 81;
                                }
                              }
                            }
                          }
                          if (-587 <= (bh.field_g ^ -1)) {
                            break L40;
                          } else {
                            if (bh.field_g < 586 - -ge.field_h.field_I) {
                              ac.field_F = dk.field_i;
                              break L40;
                            } else {
                              if (param0 == 0) {
                                if (param1) {
                                  L46: {
                                    rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                                    if (rg.field_a.b((byte) 114)) {
                                      if (-1 == (rg.field_a.field_h ^ -1)) {
                                        return 3;
                                      } else {
                                        if ((rg.field_a.field_h ^ -1) == -2) {
                                          return 2;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    } else {
                                      break L46;
                                    }
                                  }
                                  L47: while (true) {
                                    if (ab.c((byte) -125)) {
                                      L48: {
                                        rg.field_a.a((byte) 58, 0);
                                        if (!rg.field_a.b((byte) 114)) {
                                          break L48;
                                        } else {
                                          if (rg.field_a.field_h != 0) {
                                            if (1 != rg.field_a.field_h) {
                                              break L48;
                                            } else {
                                              return 1;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        }
                                      }
                                      if (wh.field_c != 13) {
                                        continue L47;
                                      } else {
                                        return 1;
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                } else {
                                  return 0;
                                }
                              } else {
                                return 81;
                              }
                            }
                          }
                        } else {
                          if (param0 == 0) {
                            if (param1) {
                              L49: {
                                rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                                if (rg.field_a.b((byte) 114)) {
                                  if (-1 == (rg.field_a.field_h ^ -1)) {
                                    return 3;
                                  } else {
                                    if ((rg.field_a.field_h ^ -1) == -2) {
                                      return 2;
                                    } else {
                                      break L49;
                                    }
                                  }
                                } else {
                                  break L49;
                                }
                              }
                              L50: while (true) {
                                if (ab.c((byte) -125)) {
                                  L51: {
                                    rg.field_a.a((byte) 58, 0);
                                    if (!rg.field_a.b((byte) 114)) {
                                      break L51;
                                    } else {
                                      if (rg.field_a.field_h != 0) {
                                        if (1 != rg.field_a.field_h) {
                                          break L51;
                                        } else {
                                          return 1;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    }
                                  }
                                  if (wh.field_c != 13) {
                                    continue L50;
                                  } else {
                                    return 1;
                                  }
                                } else {
                                  return 0;
                                }
                              }
                            } else {
                              return 0;
                            }
                          } else {
                            return 81;
                          }
                        }
                      }
                    }
                  }
                }
                if (param0 == 0) {
                  if (param1) {
                    rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                    if (rg.field_a.b((byte) 114)) {
                      if (-1 == (rg.field_a.field_h ^ -1)) {
                        return 3;
                      } else {
                        if ((rg.field_a.field_h ^ -1) != -2) {
                          L52: while (true) {
                            if (ab.c((byte) -125)) {
                              L53: {
                                rg.field_a.a((byte) 58, 0);
                                if (!rg.field_a.b((byte) 114)) {
                                  break L53;
                                } else {
                                  if (rg.field_a.field_h != 0) {
                                    if (1 != rg.field_a.field_h) {
                                      break L53;
                                    } else {
                                      return 1;
                                    }
                                  } else {
                                    return 3;
                                  }
                                }
                              }
                              if (wh.field_c != 13) {
                                continue L52;
                              } else {
                                return 1;
                              }
                            } else {
                              return 0;
                            }
                          }
                        } else {
                          return 2;
                        }
                      }
                    } else {
                      L54: while (true) {
                        if (ab.c((byte) -125)) {
                          L55: {
                            rg.field_a.a((byte) 58, 0);
                            if (!rg.field_a.b((byte) 114)) {
                              break L55;
                            } else {
                              if (rg.field_a.field_h != 0) {
                                if (1 != rg.field_a.field_h) {
                                  break L55;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 3;
                              }
                            }
                          }
                          if (wh.field_c != 13) {
                            continue L54;
                          } else {
                            return 1;
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
                  return 81;
                }
              }
            } else {
              if (param0 == 0) {
                if (param1) {
                  rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                  if (rg.field_a.b((byte) 114)) {
                    if (-1 == (rg.field_a.field_h ^ -1)) {
                      return 3;
                    } else {
                      if ((rg.field_a.field_h ^ -1) != -2) {
                        L56: while (true) {
                          if (ab.c((byte) -125)) {
                            L57: {
                              rg.field_a.a((byte) 58, 0);
                              if (!rg.field_a.b((byte) 114)) {
                                break L57;
                              } else {
                                if (rg.field_a.field_h != 0) {
                                  if (1 != rg.field_a.field_h) {
                                    break L57;
                                  } else {
                                    return 1;
                                  }
                                } else {
                                  return 3;
                                }
                              }
                            }
                            if (wh.field_c != 13) {
                              continue L56;
                            } else {
                              return 1;
                            }
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 2;
                      }
                    }
                  } else {
                    L58: while (true) {
                      if (ab.c((byte) -125)) {
                        L59: {
                          rg.field_a.a((byte) 58, 0);
                          if (!rg.field_a.b((byte) 114)) {
                            break L59;
                          } else {
                            if (rg.field_a.field_h != 0) {
                              if (1 != rg.field_a.field_h) {
                                break L59;
                              } else {
                                return 1;
                              }
                            } else {
                              return 3;
                            }
                          }
                        }
                        if (wh.field_c != 13) {
                          continue L58;
                        } else {
                          return 1;
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
                return 81;
              }
            }
          } else {
            sc.field_n = sc.field_n - dk.field_c;
            rb.field_b = rb.field_b + 1;
            continue L0;
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 8927) {
            field_Y = null;
            hm.a(4, (byte) -111);
            return;
        }
        hm.a(4, (byte) -111);
    }

    final static void a(boolean param0, int param1) {
        if (param1 <= -101) {
          if (null == kb.field_i) {
            return;
          } else {
            hk.d(hk.field_c, hk.field_h, hk.field_g + -hk.field_c, hk.field_b - hk.field_h);
            kb.field_i.a(1141039778, param0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 >= -103) {
          field_W = 48;
          var5 = param0 + ((lg) this).field_u;
          var6 = ((lg) this).field_D - -param3;
          int discarded$2 = hh.field_e.a(hh.field_c, var5 - -20, var6 + 20, ((lg) this).field_t - 40, ((lg) this).field_y + -50, 16777215, -1, 1, 0, hh.field_e.field_R);
          super.a(param0, -109, param2, param3);
          return;
        } else {
          var5 = param0 + ((lg) this).field_u;
          var6 = ((lg) this).field_D - -param3;
          int discarded$3 = hh.field_e.a(hh.field_c, var5 - -20, var6 + 20, ((lg) this).field_t - 40, ((lg) this).field_y + -50, 16777215, -1, 1, 0, hh.field_e.field_R);
          super.a(param0, -109, param2, param3);
          return;
        }
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        if (((lg) this).field_S == param2) {
          vb.g((byte) 105);
          if (param0 == 67) {
            return;
          } else {
            field_T = null;
            return;
          }
        } else {
          if (param2 != ((lg) this).field_X) {
            if (((lg) this).field_V != param2) {
              if (param0 == 67) {
                return;
              } else {
                field_T = null;
                return;
              }
            } else {
              rk.c(false);
              if (param0 == 67) {
                return;
              } else {
                field_T = null;
                return;
              }
            }
          } else {
            ha.e(0);
            if (param0 == 67) {
              return;
            } else {
              field_T = null;
              return;
            }
          }
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        if (super.a(95, param1, param2, param3)) {
            return true;
        }
        if ((param1 ^ -1) == -99) {
            return ((lg) this).a(param2, (byte) -74);
        }
        if (-100 == (param1 ^ -1)) {
            return ((lg) this).a(32, param2);
        }
        int var5 = 86 / ((param0 - -22) / 49);
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Discard";
        field_U = -1;
    }
}
