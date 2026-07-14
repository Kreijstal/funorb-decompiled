/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qka extends llb {
    private StringBuilder field_yb;
    private llb field_vb;
    private int field_wb;
    private llb field_xb;

    final boolean a(boolean param0) {
        int var2 = 0;
        if (-1 != ((qka) this).field_wb) {
          return false;
        } else {
          if (-86 == pma.field_o) {
            L0: {
              if (((qka) this).field_yb.length() > 0) {
                StringBuilder discarded$11 = npa.a(((qka) this).field_yb.length() + -1, param0, ((qka) this).field_yb, ' ');
                break L0;
              } else {
                break L0;
              }
            }
            if (-13 < (((qka) this).field_yb.length() ^ -1)) {
              L1: {
                var2 = Character.toLowerCase(jl.field_r);
                if (var2 != 32) {
                  break L1;
                } else {
                  var2 = 95;
                  break L1;
                }
              }
              L2: {
                if (var2 != 95) {
                  break L2;
                } else {
                  if (0 < ((qka) this).field_yb.length()) {
                    StringBuilder discarded$12 = ((qka) this).field_yb.append(var2);
                    break L2;
                  } else {
                    L3: {
                      if (cs.a((char) var2, 0)) {
                        StringBuilder discarded$13 = ((qka) this).field_yb.append(var2);
                        break L3;
                      } else {
                        if (haa.a((char) var2, true)) {
                          StringBuilder discarded$14 = ((qka) this).field_yb.append(var2);
                          break L3;
                        } else {
                          L4: {
                            if (pma.field_o == 84) {
                              if (-1 <= (((qka) this).field_yb.length() ^ -1)) {
                                ((qka) this).field_wb = 1;
                                break L4;
                              } else {
                                ((qka) this).field_R = ((qka) this).field_yb.toString();
                                ((qka) this).field_wb = 2;
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            if (pma.field_o == 13) {
                              ((qka) this).field_wb = 1;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          if (param0) {
                            return false;
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                    L6: {
                      if (pma.field_o == 84) {
                        if (-1 <= (((qka) this).field_yb.length() ^ -1)) {
                          ((qka) this).field_wb = 1;
                          break L6;
                        } else {
                          ((qka) this).field_R = ((qka) this).field_yb.toString();
                          ((qka) this).field_wb = 2;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (pma.field_o == 13) {
                        ((qka) this).field_wb = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (param0) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
              if (cs.a((char) var2, 0)) {
                StringBuilder discarded$15 = ((qka) this).field_yb.append(var2);
                if (pma.field_o == 84) {
                  if (-1 <= (((qka) this).field_yb.length() ^ -1)) {
                    L8: {
                      ((qka) this).field_wb = 1;
                      if (pma.field_o == 13) {
                        ((qka) this).field_wb = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (!param0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    L9: {
                      ((qka) this).field_R = ((qka) this).field_yb.toString();
                      ((qka) this).field_wb = 2;
                      if (pma.field_o == 13) {
                        ((qka) this).field_wb = 1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (!param0) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  L10: {
                    if (pma.field_o == 13) {
                      ((qka) this).field_wb = 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (!param0) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                if (haa.a((char) var2, true)) {
                  StringBuilder discarded$16 = ((qka) this).field_yb.append(var2);
                  if (pma.field_o == 84) {
                    if (-1 <= (((qka) this).field_yb.length() ^ -1)) {
                      L11: {
                        ((qka) this).field_wb = 1;
                        if (pma.field_o == 13) {
                          ((qka) this).field_wb = 1;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      L12: {
                        ((qka) this).field_R = ((qka) this).field_yb.toString();
                        ((qka) this).field_wb = 2;
                        if (pma.field_o == 13) {
                          ((qka) this).field_wb = 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    L13: {
                      if (pma.field_o == 13) {
                        ((qka) this).field_wb = 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (!param0) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  if (pma.field_o == 84) {
                    if (-1 <= (((qka) this).field_yb.length() ^ -1)) {
                      L14: {
                        ((qka) this).field_wb = 1;
                        if (pma.field_o == 13) {
                          ((qka) this).field_wb = 1;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      L15: {
                        ((qka) this).field_R = ((qka) this).field_yb.toString();
                        ((qka) this).field_wb = 2;
                        if (pma.field_o == 13) {
                          ((qka) this).field_wb = 1;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    L16: {
                      if (pma.field_o == 13) {
                        ((qka) this).field_wb = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (!param0) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              if (pma.field_o == 84) {
                if (-1 <= (((qka) this).field_yb.length() ^ -1)) {
                  L17: {
                    ((qka) this).field_wb = 1;
                    if (pma.field_o == 13) {
                      ((qka) this).field_wb = 1;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  if (!param0) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  L18: {
                    ((qka) this).field_R = ((qka) this).field_yb.toString();
                    ((qka) this).field_wb = 2;
                    if (pma.field_o == 13) {
                      ((qka) this).field_wb = 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  if (!param0) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                L19: {
                  if (pma.field_o == 13) {
                    ((qka) this).field_wb = 1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                if (!param0) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            L20: {
              if (-13 < (((qka) this).field_yb.length() ^ -1)) {
                L21: {
                  var2 = Character.toLowerCase(jl.field_r);
                  if (var2 != 32) {
                    break L21;
                  } else {
                    var2 = 95;
                    break L21;
                  }
                }
                L22: {
                  if (var2 != 95) {
                    break L22;
                  } else {
                    if (0 < ((qka) this).field_yb.length()) {
                      StringBuilder discarded$17 = ((qka) this).field_yb.append(var2);
                      break L22;
                    } else {
                      L23: {
                        if (cs.a((char) var2, 0)) {
                          StringBuilder discarded$18 = ((qka) this).field_yb.append(var2);
                          break L23;
                        } else {
                          if (!haa.a((char) var2, true)) {
                            break L23;
                          } else {
                            StringBuilder discarded$19 = ((qka) this).field_yb.append(var2);
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (pma.field_o == 84) {
                          if (-1 <= (((qka) this).field_yb.length() ^ -1)) {
                            ((qka) this).field_wb = 1;
                            break L24;
                          } else {
                            ((qka) this).field_R = ((qka) this).field_yb.toString();
                            ((qka) this).field_wb = 2;
                            break L24;
                          }
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (pma.field_o == 13) {
                          ((qka) this).field_wb = 1;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      if (param0) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                if (cs.a((char) var2, 0)) {
                  L26: {
                    StringBuilder discarded$20 = ((qka) this).field_yb.append(var2);
                    if (pma.field_o == 84) {
                      if (-1 <= (((qka) this).field_yb.length() ^ -1)) {
                        ((qka) this).field_wb = 1;
                        break L26;
                      } else {
                        ((qka) this).field_R = ((qka) this).field_yb.toString();
                        ((qka) this).field_wb = 2;
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (pma.field_o == 13) {
                      ((qka) this).field_wb = 1;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (param0) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  if (!haa.a((char) var2, true)) {
                    break L20;
                  } else {
                    L28: {
                      StringBuilder discarded$21 = ((qka) this).field_yb.append(var2);
                      if (pma.field_o == 84) {
                        if (-1 <= (((qka) this).field_yb.length() ^ -1)) {
                          ((qka) this).field_wb = 1;
                          break L28;
                        } else {
                          ((qka) this).field_R = ((qka) this).field_yb.toString();
                          ((qka) this).field_wb = 2;
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (pma.field_o == 13) {
                        ((qka) this).field_wb = 1;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    if (param0) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                break L20;
              }
            }
            if (pma.field_o == 84) {
              if (-1 <= (((qka) this).field_yb.length() ^ -1)) {
                L30: {
                  ((qka) this).field_wb = 1;
                  if (pma.field_o == 13) {
                    ((qka) this).field_wb = 1;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                if (param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                L31: {
                  ((qka) this).field_R = ((qka) this).field_yb.toString();
                  ((qka) this).field_wb = 2;
                  if (pma.field_o == 13) {
                    ((qka) this).field_wb = 1;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                if (param0) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              L32: {
                if (pma.field_o == 13) {
                  ((qka) this).field_wb = 1;
                  break L32;
                } else {
                  break L32;
                }
              }
              if (param0) {
                return false;
              } else {
                return true;
              }
            }
          }
        }
    }

    final int a(int param0, boolean param1) {
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param0 == 0) {
          ((qka) this).a(param1, 1332);
          if (param1) {
            L0: while (true) {
              if (!ata.e(127)) {
                L1: {
                  ((qka) this).field_vb.field_R = ((qka) this).field_yb.toString();
                  if (!param1) {
                    break L1;
                  } else {
                    if (pba.field_o == 0) {
                      break L1;
                    } else {
                      if (((qka) this).field_o == 0) {
                        ((qka) this).field_wb = 1;
                        break L1;
                      } else {
                        return ((qka) this).field_wb;
                      }
                    }
                  }
                }
                return ((qka) this).field_wb;
              } else {
                L2: {
                  if (-86 != pma.field_o) {
                    break L2;
                  } else {
                    if (-1 >= ((qka) this).field_yb.length()) {
                      break L2;
                    } else {
                      StringBuilder discarded$10 = npa.a(-1 + ((qka) this).field_yb.length(), false, ((qka) this).field_yb, ' ');
                      break L2;
                    }
                  }
                }
                L3: {
                  if (dtb.a(jl.field_r, 109, (CharSequence) (Object) ((qka) this).field_yb)) {
                    StringBuilder discarded$11 = ((qka) this).field_yb.append(jl.field_r);
                    break L3;
                  } else {
                    L4: {
                      if (-1 != ((qka) this).field_yb.length()) {
                        break L4;
                      } else {
                        if (jl.field_r == 91) {
                          StringBuilder discarded$12 = ((qka) this).field_yb.append(jl.field_r);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (-2 != ((qka) this).field_yb.length()) {
                        break L5;
                      } else {
                        if (35 == jl.field_r) {
                          StringBuilder discarded$13 = ((qka) this).field_yb.append(jl.field_r);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (93 == jl.field_r) {
                      StringBuilder discarded$14 = ((qka) this).field_yb.append(jl.field_r);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                if (pma.field_o != 84) {
                  if (-14 == (pma.field_o ^ -1)) {
                    return 1;
                  } else {
                    continue L0;
                  }
                } else {
                  if (0 < ((qka) this).field_yb.length()) {
                    ((qka) this).field_R = ((qka) this).field_yb.toString();
                    return 2;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            L6: {
              ((qka) this).field_vb.field_R = ((qka) this).field_yb.toString();
              if (!param1) {
                break L6;
              } else {
                if (pba.field_o == 0) {
                  break L6;
                } else {
                  if (((qka) this).field_o == -1) {
                    ((qka) this).field_wb = 1;
                    break L6;
                  } else {
                    return ((qka) this).field_wb;
                  }
                }
              }
            }
            return ((qka) this).field_wb;
          }
        } else {
          ((qka) this).field_vb = null;
          ((qka) this).a(param1, 1332);
          if (!param1) {
            ((qka) this).field_vb.field_R = ((qka) this).field_yb.toString();
            if (param1) {
              if (pba.field_o != 0) {
                if (((qka) this).field_o == -1) {
                  ((qka) this).field_wb = 1;
                  return ((qka) this).field_wb;
                } else {
                  return ((qka) this).field_wb;
                }
              } else {
                return ((qka) this).field_wb;
              }
            } else {
              return ((qka) this).field_wb;
            }
          } else {
            L7: while (true) {
              if (ata.e(127)) {
                L8: {
                  if (-86 != pma.field_o) {
                    break L8;
                  } else {
                    if (-1 >= ((qka) this).field_yb.length()) {
                      break L8;
                    } else {
                      StringBuilder discarded$15 = npa.a(-1 + ((qka) this).field_yb.length(), false, ((qka) this).field_yb, ' ');
                      break L8;
                    }
                  }
                }
                L9: {
                  if (dtb.a(jl.field_r, 109, (CharSequence) (Object) ((qka) this).field_yb)) {
                    StringBuilder discarded$16 = ((qka) this).field_yb.append(jl.field_r);
                    break L9;
                  } else {
                    L10: {
                      if (-1 != ((qka) this).field_yb.length()) {
                        break L10;
                      } else {
                        if (jl.field_r == 91) {
                          StringBuilder discarded$17 = ((qka) this).field_yb.append(jl.field_r);
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (-2 != ((qka) this).field_yb.length()) {
                        break L11;
                      } else {
                        if (35 == jl.field_r) {
                          StringBuilder discarded$18 = ((qka) this).field_yb.append(jl.field_r);
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (93 == jl.field_r) {
                      StringBuilder discarded$19 = ((qka) this).field_yb.append(jl.field_r);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                if (pma.field_o != 84) {
                  if (-14 == (pma.field_o ^ -1)) {
                    return 1;
                  } else {
                    continue L7;
                  }
                } else {
                  if (0 >= ((qka) this).field_yb.length()) {
                    return 1;
                  } else {
                    ((qka) this).field_R = ((qka) this).field_yb.toString();
                    return 2;
                  }
                }
              } else {
                L12: {
                  ((qka) this).field_vb.field_R = ((qka) this).field_yb.toString();
                  if (pba.field_o == 0) {
                    break L12;
                  } else {
                    if (((qka) this).field_o == -1) {
                      ((qka) this).field_wb = 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                return ((qka) this).field_wb;
              }
            }
          }
        }
    }

    qka(int param0, int param1, int param2, int param3, String param4, llb param5, llb param6, llb param7) {
        super(0L, param5);
        ((qka) this).field_wb = 0;
        ((qka) this).field_xb = new llb(0L, param6, param4);
        ((qka) this).b(-561, ((qka) this).field_xb);
        ((qka) this).field_vb = new llb(0L, param7);
        ((qka) this).field_vb.field_Y = 16764006;
        ((qka) this).b(-561, ((qka) this).field_vb);
        ((qka) this).field_vb.field_s = "|";
        ((qka) this).field_yb = new StringBuilder(12);
        int var9 = ((qka) this).field_xb.e(57);
        ((qka) this).field_xb.a(5, 119, var9, 3, nna.field_w);
        ((qka) this).field_vb.a(5, 43, var9, 3 + nna.field_w, nna.field_w);
        int var10 = 10 + var9;
        int var11 = 3 - -(2 * nna.field_w) - -3;
        int var12 = jv.a((byte) -109, param0, param2, var10);
        int var13 = lma.a(param3, param1, var11, (byte) -16);
        ((qka) this).a(var12, 122, var10, var13, var11);
    }

    static {
    }
}
