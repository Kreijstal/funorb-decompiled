/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static String field_c;
    static String field_a;
    static String[] field_b;

    final static boolean a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = DungeonAssault.field_K;
        if (null == gk.field_L) {
          if (null == jn.field_l) {
            if (no.field_d == 0) {
              L0: {
                if (la.field_g == 0) {
                  ii.field_G = -1;
                  a.field_i = -1;
                  break L0;
                } else {
                  if (ii.field_G != -1) {
                    L1: {
                      var1 = -ii.field_G + hj.field_S;
                      var2 = eh.field_h - a.field_i;
                      hh.field_p = hh.field_p + var1;
                      ed.field_P = ed.field_P + var2;
                      if (hh.field_p >= 0) {
                        break L1;
                      } else {
                        hh.field_p = 0;
                        break L1;
                      }
                    }
                    L2: {
                      if (hh.field_p > 640) {
                        hh.field_p = 640;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (ed.field_P < 0) {
                        ed.field_P = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      ii.field_G = hj.field_S;
                      if (480 < ed.field_P) {
                        ed.field_P = 480;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    a.field_i = eh.field_h;
                    break L0;
                  } else {
                    ii.field_G = -1;
                    a.field_i = -1;
                    break L0;
                  }
                }
              }
              if (!pd.c(eh.field_h, hj.field_S, (byte) 120)) {
                return false;
              } else {
                L5: {
                  if (no.field_d == 0) {
                    break L5;
                  } else {
                    if (-1 != ii.field_G) {
                      break L5;
                    } else {
                      ii.field_G = lc.field_c;
                      a.field_i = hm.field_k;
                      if (param0 <= -50) {
                        int discarded$30 = 1;
                        eg.a(pp.field_K);
                        if ((Object) (Object) ec.field_n != (Object) (Object) hh.field_s) {
                          if ((Object) (Object) tk.field_k != (Object) (Object) hh.field_s) {
                            if ((Object) (Object) ti.field_A != (Object) (Object) hh.field_s) {
                              return true;
                            } else {
                              var4 = null;
                              og.a(false, 0, (gn) null);
                              return true;
                            }
                          } else {
                            L6: {
                              int fieldTemp$31 = fc.field_d - 1;
                              fc.field_d = fc.field_d - 1;
                              if (0 > fieldTemp$31) {
                                fc.field_d = -1 + uo.field_f.length;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            og.a(true, 0, uo.field_f[fc.field_d]);
                            return true;
                          }
                        } else {
                          int fieldTemp$32 = fc.field_d + 1;
                          fc.field_d = fc.field_d + 1;
                          if (fieldTemp$32 >= uo.field_f.length) {
                            fc.field_d = 0;
                            og.a(false, 0, uo.field_f[fc.field_d]);
                            return true;
                          } else {
                            og.a(false, 0, uo.field_f[fc.field_d]);
                            return true;
                          }
                        }
                      } else {
                        L7: {
                          field_b = null;
                          int discarded$33 = 1;
                          eg.a(pp.field_K);
                          if ((Object) (Object) ec.field_n != (Object) (Object) hh.field_s) {
                            if ((Object) (Object) tk.field_k != (Object) (Object) hh.field_s) {
                              if ((Object) (Object) ti.field_A == (Object) (Object) hh.field_s) {
                                var4 = null;
                                og.a(false, 0, (gn) null);
                                break L7;
                              } else {
                                break L7;
                              }
                            } else {
                              L8: {
                                int fieldTemp$34 = fc.field_d - 1;
                                fc.field_d = fc.field_d - 1;
                                if (0 > fieldTemp$34) {
                                  fc.field_d = -1 + uo.field_f.length;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              og.a(true, 0, uo.field_f[fc.field_d]);
                              break L7;
                            }
                          } else {
                            L9: {
                              int fieldTemp$35 = fc.field_d + 1;
                              fc.field_d = fc.field_d + 1;
                              if (fieldTemp$35 < uo.field_f.length) {
                                break L9;
                              } else {
                                fc.field_d = 0;
                                break L9;
                              }
                            }
                            og.a(false, 0, uo.field_f[fc.field_d]);
                            break L7;
                          }
                        }
                        return true;
                      }
                    }
                  }
                }
                if (param0 <= -50) {
                  int discarded$36 = 1;
                  eg.a(pp.field_K);
                  if ((Object) (Object) ec.field_n != (Object) (Object) hh.field_s) {
                    if ((Object) (Object) tk.field_k != (Object) (Object) hh.field_s) {
                      if ((Object) (Object) ti.field_A == (Object) (Object) hh.field_s) {
                        var4 = null;
                        og.a(false, 0, (gn) null);
                        return true;
                      } else {
                        return true;
                      }
                    } else {
                      L10: {
                        int fieldTemp$37 = fc.field_d - 1;
                        fc.field_d = fc.field_d - 1;
                        if (0 > fieldTemp$37) {
                          fc.field_d = -1 + uo.field_f.length;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      og.a(true, 0, uo.field_f[fc.field_d]);
                      return true;
                    }
                  } else {
                    int fieldTemp$38 = fc.field_d + 1;
                    fc.field_d = fc.field_d + 1;
                    if (fieldTemp$38 < uo.field_f.length) {
                      og.a(false, 0, uo.field_f[fc.field_d]);
                      return true;
                    } else {
                      fc.field_d = 0;
                      og.a(false, 0, uo.field_f[fc.field_d]);
                      return true;
                    }
                  }
                } else {
                  field_b = null;
                  int discarded$39 = 1;
                  eg.a(pp.field_K);
                  if ((Object) (Object) ec.field_n != (Object) (Object) hh.field_s) {
                    if ((Object) (Object) tk.field_k != (Object) (Object) hh.field_s) {
                      if ((Object) (Object) ti.field_A == (Object) (Object) hh.field_s) {
                        var4 = null;
                        og.a(false, 0, (gn) null);
                        return true;
                      } else {
                        return true;
                      }
                    } else {
                      L11: {
                        int fieldTemp$40 = fc.field_d - 1;
                        fc.field_d = fc.field_d - 1;
                        if (0 > fieldTemp$40) {
                          fc.field_d = -1 + uo.field_f.length;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      og.a(true, 0, uo.field_f[fc.field_d]);
                      return true;
                    }
                  } else {
                    int fieldTemp$41 = fc.field_d + 1;
                    fc.field_d = fc.field_d + 1;
                    if (fieldTemp$41 >= uo.field_f.length) {
                      fc.field_d = 0;
                      og.a(false, 0, uo.field_f[fc.field_d]);
                      return true;
                    } else {
                      og.a(false, 0, uo.field_f[fc.field_d]);
                      return true;
                    }
                  }
                }
              }
            } else {
              if (!pd.c(hm.field_k, lc.field_c, (byte) 67)) {
                return false;
              } else {
                og.a(false, 0, uo.field_f[fc.field_d]);
                return true;
              }
            }
          } else {
            L12: {
              if (la.field_g == 0) {
                ii.field_G = -1;
                a.field_i = -1;
                break L12;
              } else {
                if (ii.field_G != -1) {
                  L13: {
                    var1 = -ii.field_G + hj.field_S;
                    var2 = eh.field_h - a.field_i;
                    hh.field_p = hh.field_p + var1;
                    ed.field_P = ed.field_P + var2;
                    if (hh.field_p >= 0) {
                      break L13;
                    } else {
                      hh.field_p = 0;
                      break L13;
                    }
                  }
                  L14: {
                    if (hh.field_p > 640) {
                      hh.field_p = 640;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (ed.field_P < 0) {
                      ed.field_P = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    ii.field_G = hj.field_S;
                    if (480 < ed.field_P) {
                      ed.field_P = 480;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  a.field_i = eh.field_h;
                  break L12;
                } else {
                  ii.field_G = -1;
                  a.field_i = -1;
                  break L12;
                }
              }
            }
            if (!pd.c(eh.field_h, hj.field_S, (byte) 120)) {
              return false;
            } else {
              L17: {
                if (no.field_d == 0) {
                  break L17;
                } else {
                  if (-1 != ii.field_G) {
                    break L17;
                  } else {
                    L18: {
                      ii.field_G = lc.field_c;
                      a.field_i = hm.field_k;
                      if (param0 <= -50) {
                        break L18;
                      } else {
                        field_b = null;
                        break L18;
                      }
                    }
                    L19: {
                      int discarded$42 = 1;
                      eg.a(pp.field_K);
                      if ((Object) (Object) ec.field_n != (Object) (Object) hh.field_s) {
                        if ((Object) (Object) tk.field_k != (Object) (Object) hh.field_s) {
                          if ((Object) (Object) ti.field_A == (Object) (Object) hh.field_s) {
                            var4 = null;
                            og.a(false, 0, (gn) null);
                            break L19;
                          } else {
                            break L19;
                          }
                        } else {
                          L20: {
                            int fieldTemp$43 = fc.field_d - 1;
                            fc.field_d = fc.field_d - 1;
                            if (0 > fieldTemp$43) {
                              fc.field_d = -1 + uo.field_f.length;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          og.a(true, 0, uo.field_f[fc.field_d]);
                          break L19;
                        }
                      } else {
                        L21: {
                          int fieldTemp$44 = fc.field_d + 1;
                          fc.field_d = fc.field_d + 1;
                          if (fieldTemp$44 < uo.field_f.length) {
                            break L21;
                          } else {
                            fc.field_d = 0;
                            break L21;
                          }
                        }
                        og.a(false, 0, uo.field_f[fc.field_d]);
                        break L19;
                      }
                    }
                    return true;
                  }
                }
              }
              if (param0 <= -50) {
                int discarded$45 = 1;
                eg.a(pp.field_K);
                if ((Object) (Object) ec.field_n != (Object) (Object) hh.field_s) {
                  if ((Object) (Object) tk.field_k != (Object) (Object) hh.field_s) {
                    if ((Object) (Object) ti.field_A != (Object) (Object) hh.field_s) {
                      return true;
                    } else {
                      var4 = null;
                      og.a(false, 0, (gn) null);
                      return true;
                    }
                  } else {
                    L22: {
                      int fieldTemp$46 = fc.field_d - 1;
                      fc.field_d = fc.field_d - 1;
                      if (0 > fieldTemp$46) {
                        fc.field_d = -1 + uo.field_f.length;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    og.a(true, 0, uo.field_f[fc.field_d]);
                    return true;
                  }
                } else {
                  int fieldTemp$47 = fc.field_d + 1;
                  fc.field_d = fc.field_d + 1;
                  if (fieldTemp$47 >= uo.field_f.length) {
                    fc.field_d = 0;
                    og.a(false, 0, uo.field_f[fc.field_d]);
                    return true;
                  } else {
                    og.a(false, 0, uo.field_f[fc.field_d]);
                    return true;
                  }
                }
              } else {
                L23: {
                  field_b = null;
                  int discarded$48 = 1;
                  eg.a(pp.field_K);
                  if ((Object) (Object) ec.field_n != (Object) (Object) hh.field_s) {
                    if ((Object) (Object) tk.field_k != (Object) (Object) hh.field_s) {
                      if ((Object) (Object) ti.field_A == (Object) (Object) hh.field_s) {
                        var4 = null;
                        og.a(false, 0, (gn) null);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      L24: {
                        int fieldTemp$49 = fc.field_d - 1;
                        fc.field_d = fc.field_d - 1;
                        if (0 > fieldTemp$49) {
                          fc.field_d = -1 + uo.field_f.length;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      og.a(true, 0, uo.field_f[fc.field_d]);
                      break L23;
                    }
                  } else {
                    L25: {
                      int fieldTemp$50 = fc.field_d + 1;
                      fc.field_d = fc.field_d + 1;
                      if (fieldTemp$50 < uo.field_f.length) {
                        break L25;
                      } else {
                        fc.field_d = 0;
                        break L25;
                      }
                    }
                    og.a(false, 0, uo.field_f[fc.field_d]);
                    break L23;
                  }
                }
                return true;
              }
            }
          }
        } else {
          L26: {
            if (la.field_g == 0) {
              ii.field_G = -1;
              a.field_i = -1;
              break L26;
            } else {
              if (ii.field_G != -1) {
                L27: {
                  var1 = -ii.field_G + hj.field_S;
                  var2 = eh.field_h - a.field_i;
                  hh.field_p = hh.field_p + var1;
                  ed.field_P = ed.field_P + var2;
                  if (hh.field_p >= 0) {
                    break L27;
                  } else {
                    hh.field_p = 0;
                    break L27;
                  }
                }
                L28: {
                  if (hh.field_p > 640) {
                    hh.field_p = 640;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (ed.field_P < 0) {
                    ed.field_P = 0;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  ii.field_G = hj.field_S;
                  if (480 < ed.field_P) {
                    ed.field_P = 480;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                a.field_i = eh.field_h;
                break L26;
              } else {
                ii.field_G = -1;
                a.field_i = -1;
                break L26;
              }
            }
          }
          if (!pd.c(eh.field_h, hj.field_S, (byte) 120)) {
            return false;
          } else {
            L31: {
              if (no.field_d == 0) {
                break L31;
              } else {
                if (-1 != ii.field_G) {
                  break L31;
                } else {
                  L32: {
                    ii.field_G = lc.field_c;
                    a.field_i = hm.field_k;
                    if (param0 <= -50) {
                      break L32;
                    } else {
                      field_b = null;
                      break L32;
                    }
                  }
                  L33: {
                    int discarded$51 = 1;
                    eg.a(pp.field_K);
                    if ((Object) (Object) ec.field_n != (Object) (Object) hh.field_s) {
                      if ((Object) (Object) tk.field_k != (Object) (Object) hh.field_s) {
                        if ((Object) (Object) ti.field_A != (Object) (Object) hh.field_s) {
                          return true;
                        } else {
                          var4 = null;
                          og.a(false, 0, (gn) null);
                          return true;
                        }
                      } else {
                        L34: {
                          int fieldTemp$52 = fc.field_d - 1;
                          fc.field_d = fc.field_d - 1;
                          if (0 > fieldTemp$52) {
                            fc.field_d = -1 + uo.field_f.length;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        og.a(true, 0, uo.field_f[fc.field_d]);
                        break L33;
                      }
                    } else {
                      L35: {
                        int fieldTemp$53 = fc.field_d + 1;
                        fc.field_d = fc.field_d + 1;
                        if (fieldTemp$53 < uo.field_f.length) {
                          break L35;
                        } else {
                          fc.field_d = 0;
                          break L35;
                        }
                      }
                      og.a(false, 0, uo.field_f[fc.field_d]);
                      break L33;
                    }
                  }
                  return true;
                }
              }
            }
            if (param0 <= -50) {
              int discarded$54 = 1;
              eg.a(pp.field_K);
              if ((Object) (Object) ec.field_n != (Object) (Object) hh.field_s) {
                if ((Object) (Object) tk.field_k != (Object) (Object) hh.field_s) {
                  if ((Object) (Object) ti.field_A != (Object) (Object) hh.field_s) {
                    return true;
                  } else {
                    var4 = null;
                    og.a(false, 0, (gn) null);
                    return true;
                  }
                } else {
                  L36: {
                    int fieldTemp$55 = fc.field_d - 1;
                    fc.field_d = fc.field_d - 1;
                    if (0 > fieldTemp$55) {
                      fc.field_d = -1 + uo.field_f.length;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  og.a(true, 0, uo.field_f[fc.field_d]);
                  return true;
                }
              } else {
                int fieldTemp$56 = fc.field_d + 1;
                fc.field_d = fc.field_d + 1;
                if (fieldTemp$56 >= uo.field_f.length) {
                  fc.field_d = 0;
                  og.a(false, 0, uo.field_f[fc.field_d]);
                  return true;
                } else {
                  og.a(false, 0, uo.field_f[fc.field_d]);
                  return true;
                }
              }
            } else {
              L37: {
                field_b = null;
                int discarded$57 = 1;
                eg.a(pp.field_K);
                if ((Object) (Object) ec.field_n != (Object) (Object) hh.field_s) {
                  if ((Object) (Object) tk.field_k != (Object) (Object) hh.field_s) {
                    if ((Object) (Object) ti.field_A == (Object) (Object) hh.field_s) {
                      var4 = null;
                      og.a(false, 0, (gn) null);
                      break L37;
                    } else {
                      break L37;
                    }
                  } else {
                    L38: {
                      int fieldTemp$58 = fc.field_d - 1;
                      fc.field_d = fc.field_d - 1;
                      if (0 > fieldTemp$58) {
                        fc.field_d = -1 + uo.field_f.length;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    og.a(true, 0, uo.field_f[fc.field_d]);
                    break L37;
                  }
                } else {
                  L39: {
                    int fieldTemp$59 = fc.field_d + 1;
                    fc.field_d = fc.field_d + 1;
                    if (fieldTemp$59 < uo.field_f.length) {
                      break L39;
                    } else {
                      fc.field_d = 0;
                      break L39;
                    }
                  }
                  og.a(false, 0, uo.field_f[fc.field_d]);
                  break L37;
                }
              }
              return true;
            }
          }
        }
    }

    public static void b() {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This is the active raider.";
        field_c = "<col=FF8000><%0></col> of your raiders were caught and eaten.";
        field_b = new String[]{"<%0> the Warrior", "<%0> the Veteran", "<%0> the Elder", "<%0> the Venerated", "<%0> the Ancient", "<%0> the Immortal"};
    }
}
