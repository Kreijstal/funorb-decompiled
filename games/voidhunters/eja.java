/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eja extends rqa {
    static String field_p;
    static int[] field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            field_p = null;
            return new nc(lfa.field_j);
        }
        return new nc(lfa.field_j);
    }

    eja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == hb.field_d) {
              break L1;
            } else {
              if (hb.field_d.length < param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          hb.field_d = new int[2 * param1];
          break L0;
        }
        if (fmb.field_o != null) {
          if (param1 > fmb.field_o.length) {
            L2: {
              L3: {
                fmb.field_o = new int[param1 * 2];
                if (null == emb.field_o) {
                  break L3;
                } else {
                  if (param1 <= emb.field_o.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              emb.field_o = new int[param1 * 2];
              break L2;
            }
            L4: {
              L5: {
                if (hma.field_d == null) {
                  break L5;
                } else {
                  if (hma.field_d.length < param1) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              hma.field_d = new int[2 * param1];
              break L4;
            }
            if (null == fv.field_o) {
              L6: {
                L7: {
                  fv.field_o = new int[2 * param1];
                  if (hga.field_o == null) {
                    break L7;
                  } else {
                    if (param1 <= hga.field_o.length) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                hga.field_o = new int[2 * param1];
                break L6;
              }
              if (null != sv.field_f) {
                if (sv.field_f.length >= param0 + param1) {
                  L8: {
                    L9: {
                      if (uj.field_a == null) {
                        break L9;
                      } else {
                        if (param1 > uj.field_a.length) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    uj.field_a = new boolean[param1 * 2];
                    break L8;
                  }
                  rha.field_d = 2147483647;
                  qbb.field_a = -2147483648;
                  pn.field_b = -2147483648;
                  bea.field_e = param2;
                  npa.field_d = 2147483647;
                  return;
                } else {
                  L10: {
                    L11: {
                      sv.field_f = new int[2 * (param0 + param1)];
                      if (uj.field_a == null) {
                        break L11;
                      } else {
                        if (param1 > uj.field_a.length) {
                          break L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                    uj.field_a = new boolean[param1 * 2];
                    break L10;
                  }
                  rha.field_d = 2147483647;
                  qbb.field_a = -2147483648;
                  pn.field_b = -2147483648;
                  bea.field_e = param2;
                  npa.field_d = 2147483647;
                  return;
                }
              } else {
                L12: {
                  L13: {
                    sv.field_f = new int[2 * (param0 + param1)];
                    if (uj.field_a == null) {
                      break L13;
                    } else {
                      if (param1 > uj.field_a.length) {
                        break L13;
                      } else {
                        break L12;
                      }
                    }
                  }
                  uj.field_a = new boolean[param1 * 2];
                  break L12;
                }
                rha.field_d = 2147483647;
                qbb.field_a = -2147483648;
                pn.field_b = -2147483648;
                bea.field_e = param2;
                npa.field_d = 2147483647;
                return;
              }
            } else {
              if (param1 <= fv.field_o.length) {
                if (hga.field_o == null) {
                  hga.field_o = new int[2 * param1];
                  if (null != sv.field_f) {
                    if (sv.field_f.length >= param0 + param1) {
                      L14: {
                        L15: {
                          if (uj.field_a == null) {
                            break L15;
                          } else {
                            if (param1 > uj.field_a.length) {
                              break L15;
                            } else {
                              break L14;
                            }
                          }
                        }
                        uj.field_a = new boolean[param1 * 2];
                        break L14;
                      }
                      rha.field_d = 2147483647;
                      qbb.field_a = -2147483648;
                      pn.field_b = -2147483648;
                      bea.field_e = param2;
                      npa.field_d = 2147483647;
                      return;
                    } else {
                      L16: {
                        L17: {
                          sv.field_f = new int[2 * (param0 + param1)];
                          if (uj.field_a == null) {
                            break L17;
                          } else {
                            if (param1 > uj.field_a.length) {
                              break L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                        uj.field_a = new boolean[param1 * 2];
                        break L16;
                      }
                      rha.field_d = 2147483647;
                      qbb.field_a = -2147483648;
                      pn.field_b = -2147483648;
                      bea.field_e = param2;
                      npa.field_d = 2147483647;
                      return;
                    }
                  } else {
                    L18: {
                      L19: {
                        sv.field_f = new int[2 * (param0 + param1)];
                        if (uj.field_a == null) {
                          break L19;
                        } else {
                          if (param1 > uj.field_a.length) {
                            break L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                      uj.field_a = new boolean[param1 * 2];
                      break L18;
                    }
                    rha.field_d = 2147483647;
                    qbb.field_a = -2147483648;
                    pn.field_b = -2147483648;
                    bea.field_e = param2;
                    npa.field_d = 2147483647;
                    return;
                  }
                } else {
                  if (param1 <= hga.field_o.length) {
                    if (null != sv.field_f) {
                      if (sv.field_f.length < param0 + param1) {
                        L20: {
                          L21: {
                            sv.field_f = new int[2 * (param0 + param1)];
                            if (uj.field_a == null) {
                              break L21;
                            } else {
                              if (param1 > uj.field_a.length) {
                                break L21;
                              } else {
                                break L20;
                              }
                            }
                          }
                          uj.field_a = new boolean[param1 * 2];
                          break L20;
                        }
                        rha.field_d = 2147483647;
                        qbb.field_a = -2147483648;
                        pn.field_b = -2147483648;
                        bea.field_e = param2;
                        npa.field_d = 2147483647;
                        return;
                      } else {
                        L22: {
                          L23: {
                            if (uj.field_a == null) {
                              break L23;
                            } else {
                              if (param1 > uj.field_a.length) {
                                break L23;
                              } else {
                                break L22;
                              }
                            }
                          }
                          uj.field_a = new boolean[param1 * 2];
                          break L22;
                        }
                        rha.field_d = 2147483647;
                        qbb.field_a = -2147483648;
                        pn.field_b = -2147483648;
                        bea.field_e = param2;
                        npa.field_d = 2147483647;
                        return;
                      }
                    } else {
                      L24: {
                        L25: {
                          sv.field_f = new int[2 * (param0 + param1)];
                          if (uj.field_a == null) {
                            break L25;
                          } else {
                            if (param1 > uj.field_a.length) {
                              break L25;
                            } else {
                              break L24;
                            }
                          }
                        }
                        uj.field_a = new boolean[param1 * 2];
                        break L24;
                      }
                      rha.field_d = 2147483647;
                      qbb.field_a = -2147483648;
                      pn.field_b = -2147483648;
                      bea.field_e = param2;
                      npa.field_d = 2147483647;
                      return;
                    }
                  } else {
                    hga.field_o = new int[2 * param1];
                    if (null != sv.field_f) {
                      if (sv.field_f.length >= param0 + param1) {
                        L26: {
                          L27: {
                            if (uj.field_a == null) {
                              break L27;
                            } else {
                              if (param1 > uj.field_a.length) {
                                break L27;
                              } else {
                                break L26;
                              }
                            }
                          }
                          uj.field_a = new boolean[param1 * 2];
                          break L26;
                        }
                        rha.field_d = 2147483647;
                        qbb.field_a = -2147483648;
                        pn.field_b = -2147483648;
                        bea.field_e = param2;
                        npa.field_d = 2147483647;
                        return;
                      } else {
                        L28: {
                          L29: {
                            sv.field_f = new int[2 * (param0 + param1)];
                            if (uj.field_a == null) {
                              break L29;
                            } else {
                              if (param1 > uj.field_a.length) {
                                break L29;
                              } else {
                                break L28;
                              }
                            }
                          }
                          uj.field_a = new boolean[param1 * 2];
                          break L28;
                        }
                        rha.field_d = 2147483647;
                        qbb.field_a = -2147483648;
                        pn.field_b = -2147483648;
                        bea.field_e = param2;
                        npa.field_d = 2147483647;
                        return;
                      }
                    } else {
                      L30: {
                        L31: {
                          sv.field_f = new int[2 * (param0 + param1)];
                          if (uj.field_a == null) {
                            break L31;
                          } else {
                            if (param1 > uj.field_a.length) {
                              break L31;
                            } else {
                              break L30;
                            }
                          }
                        }
                        uj.field_a = new boolean[param1 * 2];
                        break L30;
                      }
                      rha.field_d = 2147483647;
                      qbb.field_a = -2147483648;
                      pn.field_b = -2147483648;
                      bea.field_e = param2;
                      npa.field_d = 2147483647;
                      return;
                    }
                  }
                }
              } else {
                L32: {
                  L33: {
                    fv.field_o = new int[2 * param1];
                    if (hga.field_o == null) {
                      break L33;
                    } else {
                      if (param1 <= hga.field_o.length) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  hga.field_o = new int[2 * param1];
                  break L32;
                }
                L34: {
                  L35: {
                    if (null == sv.field_f) {
                      break L35;
                    } else {
                      if (sv.field_f.length >= param0 + param1) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  sv.field_f = new int[2 * (param0 + param1)];
                  break L34;
                }
                L36: {
                  L37: {
                    if (uj.field_a == null) {
                      break L37;
                    } else {
                      if (param1 > uj.field_a.length) {
                        break L37;
                      } else {
                        break L36;
                      }
                    }
                  }
                  uj.field_a = new boolean[param1 * 2];
                  break L36;
                }
                rha.field_d = 2147483647;
                qbb.field_a = -2147483648;
                pn.field_b = -2147483648;
                bea.field_e = param2;
                npa.field_d = 2147483647;
                return;
              }
            }
          } else {
            L38: {
              L39: {
                if (null == emb.field_o) {
                  break L39;
                } else {
                  if (param1 <= emb.field_o.length) {
                    break L38;
                  } else {
                    break L39;
                  }
                }
              }
              emb.field_o = new int[param1 * 2];
              break L38;
            }
            L40: {
              L41: {
                if (hma.field_d == null) {
                  break L41;
                } else {
                  if (hma.field_d.length < param1) {
                    break L41;
                  } else {
                    break L40;
                  }
                }
              }
              hma.field_d = new int[2 * param1];
              break L40;
            }
            if (null != fv.field_o) {
              if (param1 <= fv.field_o.length) {
                if (hga.field_o != null) {
                  if (param1 <= hga.field_o.length) {
                    if (null != sv.field_f) {
                      if (sv.field_f.length < param0 + param1) {
                        L42: {
                          L43: {
                            sv.field_f = new int[2 * (param0 + param1)];
                            if (uj.field_a == null) {
                              break L43;
                            } else {
                              if (param1 > uj.field_a.length) {
                                break L43;
                              } else {
                                break L42;
                              }
                            }
                          }
                          uj.field_a = new boolean[param1 * 2];
                          break L42;
                        }
                        rha.field_d = 2147483647;
                        qbb.field_a = -2147483648;
                        pn.field_b = -2147483648;
                        bea.field_e = param2;
                        npa.field_d = 2147483647;
                        return;
                      } else {
                        L44: {
                          L45: {
                            if (uj.field_a == null) {
                              break L45;
                            } else {
                              if (param1 > uj.field_a.length) {
                                break L45;
                              } else {
                                break L44;
                              }
                            }
                          }
                          uj.field_a = new boolean[param1 * 2];
                          break L44;
                        }
                        rha.field_d = 2147483647;
                        qbb.field_a = -2147483648;
                        pn.field_b = -2147483648;
                        bea.field_e = param2;
                        npa.field_d = 2147483647;
                        return;
                      }
                    } else {
                      L46: {
                        L47: {
                          sv.field_f = new int[2 * (param0 + param1)];
                          if (uj.field_a == null) {
                            break L47;
                          } else {
                            if (param1 > uj.field_a.length) {
                              break L47;
                            } else {
                              break L46;
                            }
                          }
                        }
                        uj.field_a = new boolean[param1 * 2];
                        break L46;
                      }
                      rha.field_d = 2147483647;
                      qbb.field_a = -2147483648;
                      pn.field_b = -2147483648;
                      bea.field_e = param2;
                      npa.field_d = 2147483647;
                      return;
                    }
                  } else {
                    L48: {
                      L49: {
                        hga.field_o = new int[2 * param1];
                        if (null == sv.field_f) {
                          break L49;
                        } else {
                          if (sv.field_f.length >= param0 + param1) {
                            break L48;
                          } else {
                            break L49;
                          }
                        }
                      }
                      sv.field_f = new int[2 * (param0 + param1)];
                      break L48;
                    }
                    L50: {
                      L51: {
                        if (uj.field_a == null) {
                          break L51;
                        } else {
                          if (param1 > uj.field_a.length) {
                            break L51;
                          } else {
                            break L50;
                          }
                        }
                      }
                      uj.field_a = new boolean[param1 * 2];
                      break L50;
                    }
                    rha.field_d = 2147483647;
                    qbb.field_a = -2147483648;
                    pn.field_b = -2147483648;
                    bea.field_e = param2;
                    npa.field_d = 2147483647;
                    return;
                  }
                } else {
                  L52: {
                    L53: {
                      hga.field_o = new int[2 * param1];
                      if (null == sv.field_f) {
                        break L53;
                      } else {
                        if (sv.field_f.length >= param0 + param1) {
                          break L52;
                        } else {
                          break L53;
                        }
                      }
                    }
                    sv.field_f = new int[2 * (param0 + param1)];
                    break L52;
                  }
                  L54: {
                    L55: {
                      if (uj.field_a == null) {
                        break L55;
                      } else {
                        if (param1 > uj.field_a.length) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    uj.field_a = new boolean[param1 * 2];
                    break L54;
                  }
                  rha.field_d = 2147483647;
                  qbb.field_a = -2147483648;
                  pn.field_b = -2147483648;
                  bea.field_e = param2;
                  npa.field_d = 2147483647;
                  return;
                }
              } else {
                L56: {
                  L57: {
                    fv.field_o = new int[2 * param1];
                    if (hga.field_o == null) {
                      break L57;
                    } else {
                      if (param1 <= hga.field_o.length) {
                        break L56;
                      } else {
                        break L57;
                      }
                    }
                  }
                  hga.field_o = new int[2 * param1];
                  break L56;
                }
                L58: {
                  L59: {
                    if (null == sv.field_f) {
                      break L59;
                    } else {
                      if (sv.field_f.length >= param0 + param1) {
                        break L58;
                      } else {
                        break L59;
                      }
                    }
                  }
                  sv.field_f = new int[2 * (param0 + param1)];
                  break L58;
                }
                L60: {
                  L61: {
                    if (uj.field_a == null) {
                      break L61;
                    } else {
                      if (param1 > uj.field_a.length) {
                        break L61;
                      } else {
                        break L60;
                      }
                    }
                  }
                  uj.field_a = new boolean[param1 * 2];
                  break L60;
                }
                rha.field_d = 2147483647;
                qbb.field_a = -2147483648;
                pn.field_b = -2147483648;
                bea.field_e = param2;
                npa.field_d = 2147483647;
                return;
              }
            } else {
              L62: {
                L63: {
                  fv.field_o = new int[2 * param1];
                  if (hga.field_o == null) {
                    break L63;
                  } else {
                    if (param1 <= hga.field_o.length) {
                      break L62;
                    } else {
                      break L63;
                    }
                  }
                }
                hga.field_o = new int[2 * param1];
                break L62;
              }
              L64: {
                L65: {
                  if (null == sv.field_f) {
                    break L65;
                  } else {
                    if (sv.field_f.length >= param0 + param1) {
                      break L64;
                    } else {
                      break L65;
                    }
                  }
                }
                sv.field_f = new int[2 * (param0 + param1)];
                break L64;
              }
              L66: {
                L67: {
                  if (uj.field_a == null) {
                    break L67;
                  } else {
                    if (param1 > uj.field_a.length) {
                      break L67;
                    } else {
                      break L66;
                    }
                  }
                }
                uj.field_a = new boolean[param1 * 2];
                break L66;
              }
              rha.field_d = 2147483647;
              qbb.field_a = -2147483648;
              pn.field_b = -2147483648;
              bea.field_e = param2;
              npa.field_d = 2147483647;
              return;
            }
          }
        } else {
          L68: {
            L69: {
              fmb.field_o = new int[param1 * 2];
              if (null == emb.field_o) {
                break L69;
              } else {
                if (param1 <= emb.field_o.length) {
                  break L68;
                } else {
                  break L69;
                }
              }
            }
            emb.field_o = new int[param1 * 2];
            break L68;
          }
          L70: {
            L71: {
              if (hma.field_d == null) {
                break L71;
              } else {
                if (hma.field_d.length < param1) {
                  break L71;
                } else {
                  break L70;
                }
              }
            }
            hma.field_d = new int[2 * param1];
            break L70;
          }
          if (null != fv.field_o) {
            if (param1 <= fv.field_o.length) {
              if (hga.field_o != null) {
                if (param1 <= hga.field_o.length) {
                  if (null != sv.field_f) {
                    if (sv.field_f.length < param0 + param1) {
                      L72: {
                        L73: {
                          sv.field_f = new int[2 * (param0 + param1)];
                          if (uj.field_a == null) {
                            break L73;
                          } else {
                            if (param1 > uj.field_a.length) {
                              break L73;
                            } else {
                              break L72;
                            }
                          }
                        }
                        uj.field_a = new boolean[param1 * 2];
                        break L72;
                      }
                      rha.field_d = 2147483647;
                      qbb.field_a = -2147483648;
                      pn.field_b = -2147483648;
                      bea.field_e = param2;
                      npa.field_d = 2147483647;
                      return;
                    } else {
                      L74: {
                        L75: {
                          if (uj.field_a == null) {
                            break L75;
                          } else {
                            if (param1 > uj.field_a.length) {
                              break L75;
                            } else {
                              break L74;
                            }
                          }
                        }
                        uj.field_a = new boolean[param1 * 2];
                        break L74;
                      }
                      rha.field_d = 2147483647;
                      qbb.field_a = -2147483648;
                      pn.field_b = -2147483648;
                      bea.field_e = param2;
                      npa.field_d = 2147483647;
                      return;
                    }
                  } else {
                    L76: {
                      L77: {
                        sv.field_f = new int[2 * (param0 + param1)];
                        if (uj.field_a == null) {
                          break L77;
                        } else {
                          if (param1 > uj.field_a.length) {
                            break L77;
                          } else {
                            break L76;
                          }
                        }
                      }
                      uj.field_a = new boolean[param1 * 2];
                      break L76;
                    }
                    rha.field_d = 2147483647;
                    qbb.field_a = -2147483648;
                    pn.field_b = -2147483648;
                    bea.field_e = param2;
                    npa.field_d = 2147483647;
                    return;
                  }
                } else {
                  L78: {
                    L79: {
                      hga.field_o = new int[2 * param1];
                      if (null == sv.field_f) {
                        break L79;
                      } else {
                        if (sv.field_f.length >= param0 + param1) {
                          break L78;
                        } else {
                          break L79;
                        }
                      }
                    }
                    sv.field_f = new int[2 * (param0 + param1)];
                    break L78;
                  }
                  L80: {
                    L81: {
                      if (uj.field_a == null) {
                        break L81;
                      } else {
                        if (param1 > uj.field_a.length) {
                          break L81;
                        } else {
                          break L80;
                        }
                      }
                    }
                    uj.field_a = new boolean[param1 * 2];
                    break L80;
                  }
                  rha.field_d = 2147483647;
                  qbb.field_a = -2147483648;
                  pn.field_b = -2147483648;
                  bea.field_e = param2;
                  npa.field_d = 2147483647;
                  return;
                }
              } else {
                L82: {
                  L83: {
                    hga.field_o = new int[2 * param1];
                    if (null == sv.field_f) {
                      break L83;
                    } else {
                      if (sv.field_f.length >= param0 + param1) {
                        break L82;
                      } else {
                        break L83;
                      }
                    }
                  }
                  sv.field_f = new int[2 * (param0 + param1)];
                  break L82;
                }
                L84: {
                  L85: {
                    if (uj.field_a == null) {
                      break L85;
                    } else {
                      if (param1 > uj.field_a.length) {
                        break L85;
                      } else {
                        break L84;
                      }
                    }
                  }
                  uj.field_a = new boolean[param1 * 2];
                  break L84;
                }
                rha.field_d = 2147483647;
                qbb.field_a = -2147483648;
                pn.field_b = -2147483648;
                bea.field_e = param2;
                npa.field_d = 2147483647;
                return;
              }
            } else {
              L86: {
                L87: {
                  fv.field_o = new int[2 * param1];
                  if (hga.field_o == null) {
                    break L87;
                  } else {
                    if (param1 <= hga.field_o.length) {
                      break L86;
                    } else {
                      break L87;
                    }
                  }
                }
                hga.field_o = new int[2 * param1];
                break L86;
              }
              L88: {
                L89: {
                  if (null == sv.field_f) {
                    break L89;
                  } else {
                    if (sv.field_f.length >= param0 + param1) {
                      break L88;
                    } else {
                      break L89;
                    }
                  }
                }
                sv.field_f = new int[2 * (param0 + param1)];
                break L88;
              }
              L90: {
                L91: {
                  if (uj.field_a == null) {
                    break L91;
                  } else {
                    if (param1 > uj.field_a.length) {
                      break L91;
                    } else {
                      break L90;
                    }
                  }
                }
                uj.field_a = new boolean[param1 * 2];
                break L90;
              }
              rha.field_d = 2147483647;
              qbb.field_a = -2147483648;
              pn.field_b = -2147483648;
              bea.field_e = param2;
              npa.field_d = 2147483647;
              return;
            }
          } else {
            L92: {
              L93: {
                fv.field_o = new int[2 * param1];
                if (hga.field_o == null) {
                  break L93;
                } else {
                  if (param1 <= hga.field_o.length) {
                    break L92;
                  } else {
                    break L93;
                  }
                }
              }
              hga.field_o = new int[2 * param1];
              break L92;
            }
            L94: {
              L95: {
                if (null == sv.field_f) {
                  break L95;
                } else {
                  if (sv.field_f.length >= param0 + param1) {
                    break L94;
                  } else {
                    break L95;
                  }
                }
              }
              sv.field_f = new int[2 * (param0 + param1)];
              break L94;
            }
            L96: {
              L97: {
                if (uj.field_a == null) {
                  break L97;
                } else {
                  if (param1 > uj.field_a.length) {
                    break L97;
                  } else {
                    break L96;
                  }
                }
              }
              uj.field_a = new boolean[param1 * 2];
              break L96;
            }
            rha.field_d = 2147483647;
            qbb.field_a = -2147483648;
            pn.field_b = -2147483648;
            bea.field_e = param2;
            npa.field_d = 2147483647;
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
            eja.a(-99);
            field_o = null;
            field_p = null;
            return;
        }
        field_o = null;
        field_p = null;
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 >= -49) {
            return false;
        }
        return (param0 & 2048 ^ -1) != -1 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[4];
        field_p = "Next condition/action";
    }
}
