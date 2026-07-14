/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un extends cr {
    private StringBuilder field_Kb;
    static long[] field_Mb;
    private cr field_Nb;
    static boolean field_Ib;
    static ee field_Hb;
    private cr field_Jb;
    private int field_Ob;
    static b field_Lb;

    private final boolean l(int param0) {
        int var2 = 0;
        if (0 != ((un) this).field_Ob) {
          return false;
        } else {
          if ((de.field_f ^ -1) == -86) {
            L0: {
              if ((((un) this).field_Kb.length() ^ -1) < -1) {
                StringBuilder discarded$25 = w.a(true, ' ', -1 + ((un) this).field_Kb.length(), ((un) this).field_Kb);
                break L0;
              } else {
                break L0;
              }
            }
            if (12 > ((un) this).field_Kb.length()) {
              L1: {
                var2 = Character.toLowerCase(ji.field_r);
                if (32 == var2) {
                  var2 = 95;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (var2 == 95) {
                if (0 >= ((un) this).field_Kb.length()) {
                  if (oc.a((char) var2, (byte) -109)) {
                    L2: {
                      StringBuilder discarded$26 = ((un) this).field_Kb.append(var2);
                      if (param0 == 1) {
                        break L2;
                      } else {
                        boolean discarded$27 = this.l(-66);
                        break L2;
                      }
                    }
                    if (84 == de.field_f) {
                      if (0 >= ((un) this).field_Kb.length()) {
                        L3: {
                          ((un) this).field_Ob = 1;
                          if ((de.field_f ^ -1) == -14) {
                            ((un) this).field_Ob = 1;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        return true;
                      } else {
                        ((un) this).field_S = ((un) this).field_Kb.toString();
                        ((un) this).field_Ob = 2;
                        L4: {
                          if ((de.field_f ^ -1) == -14) {
                            ((un) this).field_Ob = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        return true;
                      }
                    } else {
                      L5: {
                        if ((de.field_f ^ -1) == -14) {
                          ((un) this).field_Ob = 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return true;
                    }
                  } else {
                    if (ab.a(false, (char) var2)) {
                      StringBuilder discarded$28 = ((un) this).field_Kb.append(var2);
                      if (param0 == 1) {
                        if (84 == de.field_f) {
                          if (0 >= ((un) this).field_Kb.length()) {
                            L6: {
                              ((un) this).field_Ob = 1;
                              if ((de.field_f ^ -1) == -14) {
                                ((un) this).field_Ob = 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            return true;
                          } else {
                            L7: {
                              ((un) this).field_S = ((un) this).field_Kb.toString();
                              ((un) this).field_Ob = 2;
                              if ((de.field_f ^ -1) == -14) {
                                ((un) this).field_Ob = 1;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            return true;
                          }
                        } else {
                          L8: {
                            if ((de.field_f ^ -1) == -14) {
                              ((un) this).field_Ob = 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          return true;
                        }
                      } else {
                        L9: {
                          boolean discarded$29 = this.l(-66);
                          if (84 != de.field_f) {
                            break L9;
                          } else {
                            if (0 >= ((un) this).field_Kb.length()) {
                              ((un) this).field_Ob = 1;
                              break L9;
                            } else {
                              ((un) this).field_S = ((un) this).field_Kb.toString();
                              ((un) this).field_Ob = 2;
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if ((de.field_f ^ -1) == -14) {
                            ((un) this).field_Ob = 1;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        return true;
                      }
                    } else {
                      if (param0 == 1) {
                        if (84 == de.field_f) {
                          if (0 >= ((un) this).field_Kb.length()) {
                            L11: {
                              ((un) this).field_Ob = 1;
                              if ((de.field_f ^ -1) == -14) {
                                ((un) this).field_Ob = 1;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            return true;
                          } else {
                            L12: {
                              ((un) this).field_S = ((un) this).field_Kb.toString();
                              ((un) this).field_Ob = 2;
                              if ((de.field_f ^ -1) == -14) {
                                ((un) this).field_Ob = 1;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            return true;
                          }
                        } else {
                          L13: {
                            if ((de.field_f ^ -1) == -14) {
                              ((un) this).field_Ob = 1;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          return true;
                        }
                      } else {
                        boolean discarded$30 = this.l(-66);
                        if (84 == de.field_f) {
                          if (0 < ((un) this).field_Kb.length()) {
                            L14: {
                              ((un) this).field_S = ((un) this).field_Kb.toString();
                              ((un) this).field_Ob = 2;
                              if ((de.field_f ^ -1) == -14) {
                                ((un) this).field_Ob = 1;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            return true;
                          } else {
                            L15: {
                              ((un) this).field_Ob = 1;
                              if ((de.field_f ^ -1) == -14) {
                                ((un) this).field_Ob = 1;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            return true;
                          }
                        } else {
                          L16: {
                            if ((de.field_f ^ -1) == -14) {
                              ((un) this).field_Ob = 1;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          return true;
                        }
                      }
                    }
                  }
                } else {
                  L17: {
                    StringBuilder discarded$31 = ((un) this).field_Kb.append(var2);
                    if (oc.a((char) var2, (byte) -109)) {
                      StringBuilder discarded$32 = ((un) this).field_Kb.append(var2);
                      break L17;
                    } else {
                      if (!ab.a(false, (char) var2)) {
                        break L17;
                      } else {
                        StringBuilder discarded$33 = ((un) this).field_Kb.append(var2);
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (param0 == 1) {
                      break L18;
                    } else {
                      boolean discarded$34 = this.l(-66);
                      break L18;
                    }
                  }
                  L19: {
                    if (84 != de.field_f) {
                      break L19;
                    } else {
                      if (0 >= ((un) this).field_Kb.length()) {
                        ((un) this).field_Ob = 1;
                        break L19;
                      } else {
                        ((un) this).field_S = ((un) this).field_Kb.toString();
                        ((un) this).field_Ob = 2;
                        break L19;
                      }
                    }
                  }
                  L20: {
                    if ((de.field_f ^ -1) == -14) {
                      ((un) this).field_Ob = 1;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  return true;
                }
              } else {
                if (oc.a((char) var2, (byte) -109)) {
                  L21: {
                    StringBuilder discarded$35 = ((un) this).field_Kb.append(var2);
                    if (param0 == 1) {
                      break L21;
                    } else {
                      boolean discarded$36 = this.l(-66);
                      break L21;
                    }
                  }
                  L22: {
                    if (84 != de.field_f) {
                      break L22;
                    } else {
                      if (0 >= ((un) this).field_Kb.length()) {
                        ((un) this).field_Ob = 1;
                        break L22;
                      } else {
                        ((un) this).field_S = ((un) this).field_Kb.toString();
                        ((un) this).field_Ob = 2;
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if ((de.field_f ^ -1) == -14) {
                      ((un) this).field_Ob = 1;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  return true;
                } else {
                  if (!ab.a(false, (char) var2)) {
                    if (param0 == 1) {
                      if (84 == de.field_f) {
                        if (0 < ((un) this).field_Kb.length()) {
                          L24: {
                            ((un) this).field_S = ((un) this).field_Kb.toString();
                            ((un) this).field_Ob = 2;
                            if ((de.field_f ^ -1) == -14) {
                              ((un) this).field_Ob = 1;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          return true;
                        } else {
                          L25: {
                            ((un) this).field_Ob = 1;
                            if ((de.field_f ^ -1) == -14) {
                              ((un) this).field_Ob = 1;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          return true;
                        }
                      } else {
                        L26: {
                          if ((de.field_f ^ -1) == -14) {
                            ((un) this).field_Ob = 1;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        return true;
                      }
                    } else {
                      L27: {
                        boolean discarded$37 = this.l(-66);
                        if (84 != de.field_f) {
                          break L27;
                        } else {
                          if (0 >= ((un) this).field_Kb.length()) {
                            ((un) this).field_Ob = 1;
                            break L27;
                          } else {
                            ((un) this).field_S = ((un) this).field_Kb.toString();
                            ((un) this).field_Ob = 2;
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if ((de.field_f ^ -1) == -14) {
                          ((un) this).field_Ob = 1;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      return true;
                    }
                  } else {
                    L29: {
                      StringBuilder discarded$38 = ((un) this).field_Kb.append(var2);
                      if (param0 == 1) {
                        break L29;
                      } else {
                        boolean discarded$39 = this.l(-66);
                        break L29;
                      }
                    }
                    L30: {
                      if (84 != de.field_f) {
                        break L30;
                      } else {
                        if (0 >= ((un) this).field_Kb.length()) {
                          ((un) this).field_Ob = 1;
                          break L30;
                        } else {
                          ((un) this).field_S = ((un) this).field_Kb.toString();
                          ((un) this).field_Ob = 2;
                          break L30;
                        }
                      }
                    }
                    L31: {
                      if ((de.field_f ^ -1) == -14) {
                        ((un) this).field_Ob = 1;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    return true;
                  }
                }
              }
            } else {
              if (param0 == 1) {
                if (84 != de.field_f) {
                  L32: {
                    if ((de.field_f ^ -1) == -14) {
                      ((un) this).field_Ob = 1;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  return true;
                } else {
                  if (0 >= ((un) this).field_Kb.length()) {
                    L33: {
                      ((un) this).field_Ob = 1;
                      if ((de.field_f ^ -1) == -14) {
                        ((un) this).field_Ob = 1;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    return true;
                  } else {
                    L34: {
                      ((un) this).field_S = ((un) this).field_Kb.toString();
                      ((un) this).field_Ob = 2;
                      if ((de.field_f ^ -1) == -14) {
                        ((un) this).field_Ob = 1;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    return true;
                  }
                }
              } else {
                boolean discarded$40 = this.l(-66);
                if (84 == de.field_f) {
                  if (0 < ((un) this).field_Kb.length()) {
                    L35: {
                      ((un) this).field_S = ((un) this).field_Kb.toString();
                      ((un) this).field_Ob = 2;
                      if ((de.field_f ^ -1) == -14) {
                        ((un) this).field_Ob = 1;
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    return true;
                  } else {
                    L36: {
                      ((un) this).field_Ob = 1;
                      if ((de.field_f ^ -1) == -14) {
                        ((un) this).field_Ob = 1;
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    return true;
                  }
                } else {
                  L37: {
                    if ((de.field_f ^ -1) == -14) {
                      ((un) this).field_Ob = 1;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            L38: {
              if (12 > ((un) this).field_Kb.length()) {
                L39: {
                  var2 = Character.toLowerCase(ji.field_r);
                  if (32 == var2) {
                    var2 = 95;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                L40: {
                  if (var2 != 95) {
                    break L40;
                  } else {
                    if (0 >= ((un) this).field_Kb.length()) {
                      break L40;
                    } else {
                      L41: {
                        StringBuilder discarded$41 = ((un) this).field_Kb.append(var2);
                        if (oc.a((char) var2, (byte) -109)) {
                          StringBuilder discarded$42 = ((un) this).field_Kb.append(var2);
                          break L41;
                        } else {
                          if (!ab.a(false, (char) var2)) {
                            break L41;
                          } else {
                            StringBuilder discarded$43 = ((un) this).field_Kb.append(var2);
                            break L41;
                          }
                        }
                      }
                      L42: {
                        if (param0 == 1) {
                          break L42;
                        } else {
                          boolean discarded$44 = this.l(-66);
                          break L42;
                        }
                      }
                      L43: {
                        if (84 != de.field_f) {
                          break L43;
                        } else {
                          if (0 >= ((un) this).field_Kb.length()) {
                            ((un) this).field_Ob = 1;
                            break L43;
                          } else {
                            ((un) this).field_S = ((un) this).field_Kb.toString();
                            ((un) this).field_Ob = 2;
                            break L43;
                          }
                        }
                      }
                      if ((de.field_f ^ -1) != -14) {
                        return true;
                      } else {
                        ((un) this).field_Ob = 1;
                        return true;
                      }
                    }
                  }
                }
                if (oc.a((char) var2, (byte) -109)) {
                  L44: {
                    StringBuilder discarded$45 = ((un) this).field_Kb.append(var2);
                    if (param0 == 1) {
                      break L44;
                    } else {
                      boolean discarded$46 = this.l(-66);
                      break L44;
                    }
                  }
                  L45: {
                    if (84 != de.field_f) {
                      break L45;
                    } else {
                      if (0 >= ((un) this).field_Kb.length()) {
                        ((un) this).field_Ob = 1;
                        break L45;
                      } else {
                        ((un) this).field_S = ((un) this).field_Kb.toString();
                        ((un) this).field_Ob = 2;
                        break L45;
                      }
                    }
                  }
                  L46: {
                    if ((de.field_f ^ -1) == -14) {
                      ((un) this).field_Ob = 1;
                      break L46;
                    } else {
                      break L46;
                    }
                  }
                  return true;
                } else {
                  if (!ab.a(false, (char) var2)) {
                    break L38;
                  } else {
                    L47: {
                      StringBuilder discarded$47 = ((un) this).field_Kb.append(var2);
                      if (param0 == 1) {
                        break L47;
                      } else {
                        boolean discarded$48 = this.l(-66);
                        break L47;
                      }
                    }
                    L48: {
                      if (84 != de.field_f) {
                        break L48;
                      } else {
                        if (0 >= ((un) this).field_Kb.length()) {
                          ((un) this).field_Ob = 1;
                          break L48;
                        } else {
                          ((un) this).field_S = ((un) this).field_Kb.toString();
                          ((un) this).field_Ob = 2;
                          break L48;
                        }
                      }
                    }
                    L49: {
                      if ((de.field_f ^ -1) == -14) {
                        ((un) this).field_Ob = 1;
                        break L49;
                      } else {
                        break L49;
                      }
                    }
                    return true;
                  }
                }
              } else {
                break L38;
              }
            }
            if (param0 == 1) {
              if (84 == de.field_f) {
                if (0 < ((un) this).field_Kb.length()) {
                  L50: {
                    ((un) this).field_S = ((un) this).field_Kb.toString();
                    ((un) this).field_Ob = 2;
                    if ((de.field_f ^ -1) == -14) {
                      ((un) this).field_Ob = 1;
                      break L50;
                    } else {
                      break L50;
                    }
                  }
                  return true;
                } else {
                  L51: {
                    ((un) this).field_Ob = 1;
                    if ((de.field_f ^ -1) == -14) {
                      ((un) this).field_Ob = 1;
                      break L51;
                    } else {
                      break L51;
                    }
                  }
                  return true;
                }
              } else {
                L52: {
                  if ((de.field_f ^ -1) == -14) {
                    ((un) this).field_Ob = 1;
                    break L52;
                  } else {
                    break L52;
                  }
                }
                return true;
              }
            } else {
              L53: {
                boolean discarded$49 = this.l(-66);
                if (84 != de.field_f) {
                  break L53;
                } else {
                  if (0 >= ((un) this).field_Kb.length()) {
                    ((un) this).field_Ob = 1;
                    break L53;
                  } else {
                    ((un) this).field_S = ((un) this).field_Kb.toString();
                    ((un) this).field_Ob = 2;
                    break L53;
                  }
                }
              }
              L54: {
                if ((de.field_f ^ -1) == -14) {
                  ((un) this).field_Ob = 1;
                  break L54;
                } else {
                  break L54;
                }
              }
              return true;
            }
          }
        }
    }

    public static void k(int param0) {
        if (param0 >= -58) {
            field_Hb = null;
            field_Hb = null;
            field_Mb = null;
            field_Lb = null;
            return;
        }
        field_Hb = null;
        field_Mb = null;
        field_Lb = null;
    }

    final int c(boolean param0, int param1) {
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        ((un) this).a(0, param0);
        if (param1 > 69) {
          if (!param0) {
            ((un) this).field_Jb.field_S = ((un) this).field_Kb.toString();
            if (param0) {
              if (kf.field_c != -1) {
                if (-1 == ((un) this).field_tb) {
                  ((un) this).field_Ob = 1;
                  return ((un) this).field_Ob;
                } else {
                  return ((un) this).field_Ob;
                }
              } else {
                return ((un) this).field_Ob;
              }
            } else {
              return ((un) this).field_Ob;
            }
          } else {
            L0: while (true) {
              if (gf.a(false)) {
                L1: {
                  if ((de.field_f ^ -1) != -86) {
                    break L1;
                  } else {
                    if ((((un) this).field_Kb.length() ^ -1) < -1) {
                      StringBuilder discarded$5 = w.a(true, ' ', ((un) this).field_Kb.length() + -1, ((un) this).field_Kb);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (gi.a((CharSequence) (Object) ((un) this).field_Kb, ji.field_r, (byte) 31)) {
                    StringBuilder discarded$6 = ((un) this).field_Kb.append(ji.field_r);
                    break L2;
                  } else {
                    L3: {
                      if (0 != ((un) this).field_Kb.length()) {
                        break L3;
                      } else {
                        if (ji.field_r == 91) {
                          StringBuilder discarded$7 = ((un) this).field_Kb.append(ji.field_r);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (1 != ((un) this).field_Kb.length()) {
                        break L4;
                      } else {
                        if (35 == ji.field_r) {
                          StringBuilder discarded$8 = ((un) this).field_Kb.append(ji.field_r);
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (93 == ji.field_r) {
                      StringBuilder discarded$9 = ((un) this).field_Kb.append(ji.field_r);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                if ((de.field_f ^ -1) != -85) {
                  if (de.field_f == 13) {
                    return 1;
                  } else {
                    continue L0;
                  }
                } else {
                  if ((((un) this).field_Kb.length() ^ -1) < -1) {
                    ((un) this).field_S = ((un) this).field_Kb.toString();
                    return 2;
                  } else {
                    return 1;
                  }
                }
              } else {
                ((un) this).field_Jb.field_S = ((un) this).field_Kb.toString();
                if (kf.field_c != -1) {
                  if (-1 != ((un) this).field_tb) {
                    return ((un) this).field_Ob;
                  } else {
                    ((un) this).field_Ob = 1;
                    return ((un) this).field_Ob;
                  }
                } else {
                  return ((un) this).field_Ob;
                }
              }
            }
          }
        } else {
          return -110;
        }
    }

    un(int param0, int param1, int param2, int param3, String param4, cr param5, cr param6, cr param7) {
        super(0L, param5);
        ((un) this).field_Ob = 0;
        ((un) this).field_Nb = new cr(0L, param6, param4);
        ((un) this).b(((un) this).field_Nb, 127);
        ((un) this).field_Jb = new cr(0L, param7);
        ((un) this).field_Jb.field_A = 16764006;
        ((un) this).b(((un) this).field_Jb, 123);
        ((un) this).field_Jb.field_J = "|";
        ((un) this).field_Kb = new StringBuilder(12);
        int var9 = ((un) this).field_Nb.j(-21391);
        ((un) this).field_Nb.a(80, var9, r.field_f, 3, 5);
        ((un) this).field_Jb.a(81, var9, r.field_f, r.field_f + 3, 5);
        int var10 = 5 + var9 + 5;
        int var11 = 3 + (3 - -(2 * r.field_f));
        int var12 = jf.a(var10, param2, param0, 1);
        int var13 = dm.a(param3, 0, var11, param1);
        ((un) this).a(123, var10, var11, var13, var12);
    }

    final static boolean a(byte param0) {
        if (param0 == -67) {
          if (rc.field_d != null) {
            if (!rc.field_d.l(1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = un.a((byte) -87);
          if (rc.field_d != null) {
            if (!rc.field_d.l(1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static cr b(byte param0) {
        int var1 = -13 / ((37 - param0) / 47);
        return pk.e(2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Mb = new long[1000];
    }
}
