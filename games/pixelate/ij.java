/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends de {
    static bd field_o;
    static String field_q;
    static String field_r;
    static String field_t;
    static String field_p;
    static int field_s;

    ij(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_25_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_233_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0 == -5516) {
          L0: {
            if ((fh.field_L ^ -1) != 0) {
              break L0;
            } else {
              if (-1 == h.field_Q) {
                fh.field_L = uf.field_d;
                h.field_Q = bg.field_k;
                break L0;
              } else {
                no.field_h = no.field_h + 1;
                if (param1 != null) {
                  if (param1.equals((Object) (Object) qg.field_b)) {
                    L1: {
                      qg.field_b = param1;
                      if (re.field_h) {
                        break L1;
                      } else {
                        if (no.field_h >= am.field_c) {
                          break L1;
                        } else {
                          if (im.field_Jb) {
                            tm.field_V = fh.field_L;
                            oo.field_f = h.field_Q;
                            no.field_h = 0;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    L2: {
                      h.field_Q = -1;
                      fh.field_L = -1;
                      if (!re.field_h) {
                        break L2;
                      } else {
                        if (no.field_h != pi.field_Fb) {
                          break L2;
                        } else {
                          re.field_h = false;
                          no.field_h = 0;
                          break L2;
                        }
                      }
                    }
                    return;
                  } else {
                    L3: {
                      if (!re.field_h) {
                        if (no.field_h >= am.field_c) {
                          if (pc.field_s + am.field_c <= no.field_h) {
                            stackOut_142_0 = 0;
                            stackIn_144_0 = stackOut_142_0;
                            break L3;
                          } else {
                            stackOut_141_0 = 1;
                            stackIn_144_0 = stackOut_141_0;
                            break L3;
                          }
                        } else {
                          stackOut_139_0 = 0;
                          stackIn_144_0 = stackOut_139_0;
                          break L3;
                        }
                      } else {
                        stackOut_137_0 = 0;
                        stackIn_144_0 = stackOut_137_0;
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        var2 = stackIn_144_0;
                        if (param1 == null) {
                          break L5;
                        } else {
                          if (re.field_h) {
                            no.field_h = am.field_c;
                            break L4;
                          } else {
                            if (var2 == 0) {
                              break L5;
                            } else {
                              no.field_h = am.field_c;
                              break L4;
                            }
                          }
                        }
                      }
                      no.field_h = 0;
                      break L4;
                    }
                    L6: {
                      oo.field_f = h.field_Q;
                      tm.field_V = fh.field_L;
                      if (param1 != null) {
                        re.field_h = false;
                        break L6;
                      } else {
                        if (var2 != 0) {
                          re.field_h = true;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      qg.field_b = param1;
                      if (re.field_h) {
                        break L7;
                      } else {
                        if (no.field_h >= am.field_c) {
                          break L7;
                        } else {
                          if (im.field_Jb) {
                            tm.field_V = fh.field_L;
                            oo.field_f = h.field_Q;
                            no.field_h = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    L8: {
                      h.field_Q = -1;
                      fh.field_L = -1;
                      if (!re.field_h) {
                        break L8;
                      } else {
                        if (no.field_h != pi.field_Fb) {
                          break L8;
                        } else {
                          re.field_h = false;
                          no.field_h = 0;
                          break L8;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (qg.field_b != null) {
                    L9: {
                      qg.field_b = param1;
                      if (re.field_h) {
                        break L9;
                      } else {
                        if (no.field_h >= am.field_c) {
                          break L9;
                        } else {
                          if (im.field_Jb) {
                            tm.field_V = fh.field_L;
                            oo.field_f = h.field_Q;
                            no.field_h = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    L10: {
                      h.field_Q = -1;
                      fh.field_L = -1;
                      if (!re.field_h) {
                        break L10;
                      } else {
                        if (no.field_h != pi.field_Fb) {
                          break L10;
                        } else {
                          re.field_h = false;
                          no.field_h = 0;
                          break L10;
                        }
                      }
                    }
                    return;
                  } else {
                    L11: {
                      if (!re.field_h) {
                        if (no.field_h >= am.field_c) {
                          if (pc.field_s + am.field_c <= no.field_h) {
                            stackOut_102_0 = 0;
                            stackIn_103_0 = stackOut_102_0;
                            break L11;
                          } else {
                            stackOut_101_0 = 1;
                            stackIn_103_0 = stackOut_101_0;
                            break L11;
                          }
                        } else {
                          stackOut_99_0 = 0;
                          stackIn_103_0 = stackOut_99_0;
                          break L11;
                        }
                      } else {
                        stackOut_97_0 = 0;
                        stackIn_103_0 = stackOut_97_0;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        var2 = stackIn_103_0;
                        if (param1 == null) {
                          break L13;
                        } else {
                          if (re.field_h) {
                            no.field_h = am.field_c;
                            break L12;
                          } else {
                            if (var2 == 0) {
                              break L13;
                            } else {
                              no.field_h = am.field_c;
                              break L12;
                            }
                          }
                        }
                      }
                      no.field_h = 0;
                      break L12;
                    }
                    L14: {
                      oo.field_f = h.field_Q;
                      tm.field_V = fh.field_L;
                      if (param1 != null) {
                        re.field_h = false;
                        break L14;
                      } else {
                        if (var2 != 0) {
                          re.field_h = true;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      qg.field_b = param1;
                      if (re.field_h) {
                        break L15;
                      } else {
                        if (no.field_h >= am.field_c) {
                          break L15;
                        } else {
                          if (im.field_Jb) {
                            tm.field_V = fh.field_L;
                            oo.field_f = h.field_Q;
                            no.field_h = 0;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    L16: {
                      h.field_Q = -1;
                      fh.field_L = -1;
                      if (!re.field_h) {
                        break L16;
                      } else {
                        if (no.field_h != pi.field_Fb) {
                          break L16;
                        } else {
                          re.field_h = false;
                          no.field_h = 0;
                          break L16;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
          no.field_h = no.field_h + 1;
          if (param1 != null) {
            if (!param1.equals((Object) (Object) qg.field_b)) {
              L17: {
                if (!re.field_h) {
                  if (no.field_h >= am.field_c) {
                    if (pc.field_s + am.field_c <= no.field_h) {
                      stackOut_232_0 = 0;
                      stackIn_233_0 = stackOut_232_0;
                      break L17;
                    } else {
                      stackOut_231_0 = 1;
                      stackIn_233_0 = stackOut_231_0;
                      break L17;
                    }
                  } else {
                    stackOut_229_0 = 0;
                    stackIn_233_0 = stackOut_229_0;
                    break L17;
                  }
                } else {
                  stackOut_227_0 = 0;
                  stackIn_233_0 = stackOut_227_0;
                  break L17;
                }
              }
              L18: {
                var2 = stackIn_233_0;
                if (param1 == null) {
                  no.field_h = 0;
                  break L18;
                } else {
                  if (re.field_h) {
                    no.field_h = am.field_c;
                    break L18;
                  } else {
                    if (var2 == 0) {
                      L19: {
                        no.field_h = 0;
                        oo.field_f = h.field_Q;
                        tm.field_V = fh.field_L;
                        if (param1 != null) {
                          re.field_h = false;
                          break L19;
                        } else {
                          if (var2 != 0) {
                            re.field_h = true;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                      }
                      L20: {
                        qg.field_b = param1;
                        if (re.field_h) {
                          break L20;
                        } else {
                          if (no.field_h >= am.field_c) {
                            break L20;
                          } else {
                            if (im.field_Jb) {
                              tm.field_V = fh.field_L;
                              oo.field_f = h.field_Q;
                              no.field_h = 0;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      L21: {
                        h.field_Q = -1;
                        fh.field_L = -1;
                        if (!re.field_h) {
                          break L21;
                        } else {
                          if (no.field_h != pi.field_Fb) {
                            break L21;
                          } else {
                            re.field_h = false;
                            no.field_h = 0;
                            break L21;
                          }
                        }
                      }
                      return;
                    } else {
                      no.field_h = am.field_c;
                      break L18;
                    }
                  }
                }
              }
              oo.field_f = h.field_Q;
              tm.field_V = fh.field_L;
              if (param1 != null) {
                L22: {
                  re.field_h = false;
                  qg.field_b = param1;
                  if (re.field_h) {
                    break L22;
                  } else {
                    if (no.field_h >= am.field_c) {
                      break L22;
                    } else {
                      if (im.field_Jb) {
                        tm.field_V = fh.field_L;
                        oo.field_f = h.field_Q;
                        no.field_h = 0;
                        break L22;
                      } else {
                        L23: {
                          h.field_Q = -1;
                          fh.field_L = -1;
                          if (!re.field_h) {
                            break L23;
                          } else {
                            if (no.field_h != pi.field_Fb) {
                              break L23;
                            } else {
                              re.field_h = false;
                              no.field_h = 0;
                              break L23;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L24: {
                  h.field_Q = -1;
                  fh.field_L = -1;
                  if (!re.field_h) {
                    break L24;
                  } else {
                    if (no.field_h != pi.field_Fb) {
                      break L24;
                    } else {
                      re.field_h = false;
                      no.field_h = 0;
                      return;
                    }
                  }
                }
                return;
              } else {
                if (var2 != 0) {
                  L25: {
                    re.field_h = true;
                    qg.field_b = param1;
                    if (re.field_h) {
                      break L25;
                    } else {
                      if (no.field_h >= am.field_c) {
                        break L25;
                      } else {
                        if (im.field_Jb) {
                          tm.field_V = fh.field_L;
                          oo.field_f = h.field_Q;
                          no.field_h = 0;
                          break L25;
                        } else {
                          L26: {
                            h.field_Q = -1;
                            fh.field_L = -1;
                            if (!re.field_h) {
                              break L26;
                            } else {
                              if (no.field_h != pi.field_Fb) {
                                break L26;
                              } else {
                                re.field_h = false;
                                no.field_h = 0;
                                break L26;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  h.field_Q = -1;
                  fh.field_L = -1;
                  if (re.field_h) {
                    if (no.field_h == pi.field_Fb) {
                      re.field_h = false;
                      no.field_h = 0;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L27: {
                    qg.field_b = param1;
                    if (re.field_h) {
                      break L27;
                    } else {
                      if (no.field_h >= am.field_c) {
                        break L27;
                      } else {
                        if (im.field_Jb) {
                          tm.field_V = fh.field_L;
                          oo.field_f = h.field_Q;
                          no.field_h = 0;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                    }
                  }
                  h.field_Q = -1;
                  fh.field_L = -1;
                  if (re.field_h) {
                    if (no.field_h != pi.field_Fb) {
                      return;
                    } else {
                      re.field_h = false;
                      no.field_h = 0;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              L28: {
                qg.field_b = param1;
                if (re.field_h) {
                  break L28;
                } else {
                  if (no.field_h >= am.field_c) {
                    break L28;
                  } else {
                    if (im.field_Jb) {
                      tm.field_V = fh.field_L;
                      oo.field_f = h.field_Q;
                      no.field_h = 0;
                      break L28;
                    } else {
                      L29: {
                        h.field_Q = -1;
                        fh.field_L = -1;
                        if (!re.field_h) {
                          break L29;
                        } else {
                          if (no.field_h != pi.field_Fb) {
                            break L29;
                          } else {
                            re.field_h = false;
                            no.field_h = 0;
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L30: {
                h.field_Q = -1;
                fh.field_L = -1;
                if (!re.field_h) {
                  break L30;
                } else {
                  if (no.field_h != pi.field_Fb) {
                    break L30;
                  } else {
                    re.field_h = false;
                    no.field_h = 0;
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (qg.field_b != null) {
              L31: {
                qg.field_b = param1;
                if (re.field_h) {
                  break L31;
                } else {
                  if (no.field_h >= am.field_c) {
                    break L31;
                  } else {
                    if (im.field_Jb) {
                      tm.field_V = fh.field_L;
                      oo.field_f = h.field_Q;
                      no.field_h = 0;
                      break L31;
                    } else {
                      h.field_Q = -1;
                      fh.field_L = -1;
                      if (re.field_h) {
                        if (no.field_h == pi.field_Fb) {
                          re.field_h = false;
                          no.field_h = 0;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              h.field_Q = -1;
              fh.field_L = -1;
              if (re.field_h) {
                if (no.field_h != pi.field_Fb) {
                  return;
                } else {
                  re.field_h = false;
                  no.field_h = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              L32: {
                if (!re.field_h) {
                  if (no.field_h >= am.field_c) {
                    if (pc.field_s + am.field_c <= no.field_h) {
                      stackOut_185_0 = 0;
                      stackIn_186_0 = stackOut_185_0;
                      break L32;
                    } else {
                      stackOut_184_0 = 1;
                      stackIn_186_0 = stackOut_184_0;
                      break L32;
                    }
                  } else {
                    stackOut_182_0 = 0;
                    stackIn_186_0 = stackOut_182_0;
                    break L32;
                  }
                } else {
                  stackOut_180_0 = 0;
                  stackIn_186_0 = stackOut_180_0;
                  break L32;
                }
              }
              L33: {
                L34: {
                  var2 = stackIn_186_0;
                  if (param1 == null) {
                    break L34;
                  } else {
                    if (re.field_h) {
                      no.field_h = am.field_c;
                      break L33;
                    } else {
                      if (var2 == 0) {
                        break L34;
                      } else {
                        no.field_h = am.field_c;
                        break L33;
                      }
                    }
                  }
                }
                no.field_h = 0;
                break L33;
              }
              L35: {
                oo.field_f = h.field_Q;
                tm.field_V = fh.field_L;
                if (param1 != null) {
                  re.field_h = false;
                  break L35;
                } else {
                  if (var2 != 0) {
                    re.field_h = true;
                    break L35;
                  } else {
                    break L35;
                  }
                }
              }
              L36: {
                qg.field_b = param1;
                if (re.field_h) {
                  break L36;
                } else {
                  if (no.field_h >= am.field_c) {
                    break L36;
                  } else {
                    if (im.field_Jb) {
                      tm.field_V = fh.field_L;
                      oo.field_f = h.field_Q;
                      no.field_h = 0;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                }
              }
              L37: {
                h.field_Q = -1;
                fh.field_L = -1;
                if (!re.field_h) {
                  break L37;
                } else {
                  if (no.field_h != pi.field_Fb) {
                    break L37;
                  } else {
                    re.field_h = false;
                    no.field_h = 0;
                    break L37;
                  }
                }
              }
              return;
            }
          }
        } else {
          L38: {
            field_r = null;
            if ((fh.field_L ^ -1) != 0) {
              break L38;
            } else {
              if (-1 == h.field_Q) {
                fh.field_L = uf.field_d;
                h.field_Q = bg.field_k;
                break L38;
              } else {
                break L38;
              }
            }
          }
          no.field_h = no.field_h + 1;
          if (param1 != null) {
            if (!param1.equals((Object) (Object) qg.field_b)) {
              L39: {
                if (!re.field_h) {
                  if (no.field_h >= am.field_c) {
                    if (pc.field_s + am.field_c > no.field_h) {
                      stackOut_66_0 = 1;
                      stackIn_68_0 = stackOut_66_0;
                      break L39;
                    } else {
                      stackOut_65_0 = 0;
                      stackIn_68_0 = stackOut_65_0;
                      break L39;
                    }
                  } else {
                    stackOut_63_0 = 0;
                    stackIn_68_0 = stackOut_63_0;
                    break L39;
                  }
                } else {
                  stackOut_61_0 = 0;
                  stackIn_68_0 = stackOut_61_0;
                  break L39;
                }
              }
              L40: {
                var2 = stackIn_68_0;
                if (param1 != null) {
                  L41: {
                    if (re.field_h) {
                      break L41;
                    } else {
                      if (var2 != 0) {
                        break L41;
                      } else {
                        no.field_h = 0;
                        break L40;
                      }
                    }
                  }
                  no.field_h = am.field_c;
                  break L40;
                } else {
                  no.field_h = 0;
                  break L40;
                }
              }
              L42: {
                oo.field_f = h.field_Q;
                tm.field_V = fh.field_L;
                if (param1 != null) {
                  re.field_h = false;
                  break L42;
                } else {
                  if (var2 != 0) {
                    re.field_h = true;
                    break L42;
                  } else {
                    break L42;
                  }
                }
              }
              L43: {
                qg.field_b = param1;
                if (re.field_h) {
                  L44: {
                    h.field_Q = -1;
                    fh.field_L = -1;
                    if (re.field_h) {
                      break L44;
                    } else {
                      h.field_Q = -1;
                      fh.field_L = -1;
                      if (!re.field_h) {
                        break L43;
                      } else {
                        break L44;
                      }
                    }
                  }
                  if (no.field_h != pi.field_Fb) {
                    break L43;
                  } else {
                    re.field_h = false;
                    no.field_h = 0;
                    break L43;
                  }
                } else {
                  h.field_Q = -1;
                  fh.field_L = -1;
                  if (!re.field_h) {
                    break L43;
                  } else {
                    if (no.field_h != pi.field_Fb) {
                      break L43;
                    } else {
                      re.field_h = false;
                      no.field_h = 0;
                      break L43;
                    }
                  }
                }
              }
              return;
            } else {
              L45: {
                qg.field_b = param1;
                if (re.field_h) {
                  break L45;
                } else {
                  if (no.field_h >= am.field_c) {
                    break L45;
                  } else {
                    if (im.field_Jb) {
                      tm.field_V = fh.field_L;
                      oo.field_f = h.field_Q;
                      no.field_h = 0;
                      break L45;
                    } else {
                      break L45;
                    }
                  }
                }
              }
              L46: {
                h.field_Q = -1;
                fh.field_L = -1;
                if (!re.field_h) {
                  break L46;
                } else {
                  if (no.field_h != pi.field_Fb) {
                    break L46;
                  } else {
                    re.field_h = false;
                    no.field_h = 0;
                    break L46;
                  }
                }
              }
              return;
            }
          } else {
            if (qg.field_b == null) {
              L47: {
                if (!re.field_h) {
                  if (no.field_h >= am.field_c) {
                    if (pc.field_s + am.field_c > no.field_h) {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L47;
                    } else {
                      stackOut_22_0 = 0;
                      stackIn_25_0 = stackOut_22_0;
                      break L47;
                    }
                  } else {
                    stackOut_20_0 = 0;
                    stackIn_25_0 = stackOut_20_0;
                    break L47;
                  }
                } else {
                  stackOut_18_0 = 0;
                  stackIn_25_0 = stackOut_18_0;
                  break L47;
                }
              }
              L48: {
                var2 = stackIn_25_0;
                if (param1 != null) {
                  if (re.field_h) {
                    no.field_h = am.field_c;
                    break L48;
                  } else {
                    if (var2 != 0) {
                      no.field_h = am.field_c;
                      break L48;
                    } else {
                      no.field_h = 0;
                      break L48;
                    }
                  }
                } else {
                  no.field_h = 0;
                  break L48;
                }
              }
              L49: {
                oo.field_f = h.field_Q;
                tm.field_V = fh.field_L;
                if (param1 != null) {
                  re.field_h = false;
                  break L49;
                } else {
                  if (var2 != 0) {
                    re.field_h = true;
                    break L49;
                  } else {
                    break L49;
                  }
                }
              }
              L50: {
                qg.field_b = param1;
                if (re.field_h) {
                  L51: {
                    h.field_Q = -1;
                    fh.field_L = -1;
                    if (re.field_h) {
                      break L51;
                    } else {
                      h.field_Q = -1;
                      fh.field_L = -1;
                      if (!re.field_h) {
                        break L50;
                      } else {
                        break L51;
                      }
                    }
                  }
                  if (no.field_h != pi.field_Fb) {
                    break L50;
                  } else {
                    re.field_h = false;
                    no.field_h = 0;
                    break L50;
                  }
                } else {
                  h.field_Q = -1;
                  fh.field_L = -1;
                  if (!re.field_h) {
                    break L50;
                  } else {
                    if (no.field_h != pi.field_Fb) {
                      break L50;
                    } else {
                      re.field_h = false;
                      no.field_h = 0;
                      break L50;
                    }
                  }
                }
              }
              return;
            } else {
              L52: {
                qg.field_b = param1;
                if (re.field_h) {
                  L53: {
                    h.field_Q = -1;
                    fh.field_L = -1;
                    if (re.field_h) {
                      break L53;
                    } else {
                      h.field_Q = -1;
                      fh.field_L = -1;
                      if (!re.field_h) {
                        break L52;
                      } else {
                        break L53;
                      }
                    }
                  }
                  if (no.field_h != pi.field_Fb) {
                    break L52;
                  } else {
                    re.field_h = false;
                    no.field_h = 0;
                    break L52;
                  }
                } else {
                  h.field_Q = -1;
                  fh.field_L = -1;
                  if (!re.field_h) {
                    break L52;
                  } else {
                    if (no.field_h != pi.field_Fb) {
                      break L52;
                    } else {
                      re.field_h = false;
                      no.field_h = 0;
                      break L52;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
            return;
        }
        t.d();
    }

    final void c(byte param0) {
        if (param0 >= -13) {
            ((ij) this).c((byte) -53);
        }
    }

    public static void e(int param0) {
        field_o = null;
        field_r = null;
        field_q = null;
        field_p = null;
        field_t = null;
        int var1 = 8 / ((-77 - param0) / 47);
    }

    final void a(int param0) {
        if (param0 != 11) {
            field_t = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Name";
        field_o = new bd();
        field_t = "Yes";
        field_r = "Day";
        field_p = "Please try changing the following settings:  ";
        field_s = 0;
    }
}
