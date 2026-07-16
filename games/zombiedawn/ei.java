/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ei extends hp {
    dn field_F;
    private int field_I;
    static int field_K;
    boolean field_H;
    static int field_J;
    static int[] field_G;

    boolean e(byte param0) {
        ((ei) this).field_I = this.i(35);
        if (param0 == 28) {
          if (-1 == ((ei) this).field_I) {
            if (((ei) this).field_H) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((ei) this).field_F = null;
          if (-1 == ((ei) this).field_I) {
            if (((ei) this).field_H) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final int i(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 35) {
          return -13;
        } else {
          L0: {
            if (((ei) this).field_H) {
              if ((Object) (Object) ((ei) this).field_F.c(true) != this) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_6_0;
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, boolean param4, int param5, int param6, int param7) {
        Object var9 = null;
        rl.a(param0, param7, param1, param6, (int[]) null, param3, param4, (byte) 120, param2);
        if (param5 != -14237) {
            field_G = null;
        }
    }

    final ga d(byte param0) {
        ga var2 = super.d(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (ga) this;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if ((((ei) this).field_I ^ -1) != -1) {
          if (((ei) this).field_I >= 256) {
            if (-1 != (param1 ^ -1)) {
              return;
            } else {
              ((ei) this).a(param2 + ((ei) this).field_k, ((ei) this).field_j + param0, (byte) -123);
              super.a(param0, param1, param2, param3 + 0);
              return;
            }
          } else {
            if (null != f.field_e) {
              if (f.field_e.field_w >= ((ei) this).field_i) {
                if (f.field_e.field_t >= ((ei) this).field_n) {
                  ki.a((byte) -86, f.field_e);
                  bi.d();
                  ((ei) this).a(param3, 0, (byte) -121);
                  super.a(-param0 - ((ei) this).field_j, param1, -((ei) this).field_k + -param2, 0);
                  pa.a(param3 ^ -21189);
                  f.field_e.e(((ei) this).field_k + param2, ((ei) this).field_j + param0, ((ei) this).field_I);
                  return;
                } else {
                  f.field_e = new vn(((ei) this).field_i, ((ei) this).field_n);
                  ki.a((byte) -86, f.field_e);
                  bi.d();
                  ((ei) this).a(param3, 0, (byte) -121);
                  super.a(-param0 - ((ei) this).field_j, param1, -((ei) this).field_k + -param2, 0);
                  pa.a(param3 ^ -21189);
                  f.field_e.e(((ei) this).field_k + param2, ((ei) this).field_j + param0, ((ei) this).field_I);
                  return;
                }
              } else {
                f.field_e = new vn(((ei) this).field_i, ((ei) this).field_n);
                ki.a((byte) -86, f.field_e);
                bi.d();
                ((ei) this).a(param3, 0, (byte) -121);
                super.a(-param0 - ((ei) this).field_j, param1, -((ei) this).field_k + -param2, 0);
                pa.a(param3 ^ -21189);
                f.field_e.e(((ei) this).field_k + param2, ((ei) this).field_j + param0, ((ei) this).field_I);
                return;
              }
            } else {
              f.field_e = new vn(((ei) this).field_i, ((ei) this).field_n);
              ki.a((byte) -86, f.field_e);
              bi.d();
              ((ei) this).a(param3, 0, (byte) -121);
              super.a(-param0 - ((ei) this).field_j, param1, -((ei) this).field_k + -param2, 0);
              pa.a(param3 ^ -21189);
              f.field_e.e(((ei) this).field_k + param2, ((ei) this).field_j + param0, ((ei) this).field_I);
              return;
            }
          }
        } else {
          return;
        }
    }

    ei(dn param0, int param1, int param2) {
        super(pk.field_N + -param1 >> -1350254175, -param2 + b.field_l >> 591247969, param1, param2, (io) null);
        ((ei) this).field_H = false;
        ((ei) this).field_I = 0;
        ((ei) this).field_F = param0;
    }

    abstract void a(int param0, int param1, byte param2);

    final void a(byte param0, int param1, int param2) {
        if (param0 < 79) {
          return;
        } else {
          ((ei) this).a(-99, -param1 + b.field_l >> -595692095, pk.field_N - param2 >> 2112696897, param2, param1);
          return;
        }
    }

    final static boolean h(int param0) {
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        if (param0 >= -110) {
          L0: {
            field_K = 91;
            if (ul.field_f) {
              vj.field_q = vj.field_q + 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((ma.field_r ^ -1) != (sm.field_a ^ -1)) {
              vj.field_o = vj.field_o - 40;
              if (0 >= vj.field_o) {
                vj.field_o = 0;
                ma.field_r = sm.field_a;
                jd.field_c = rc.field_w;
                break L1;
              } else {
                L2: {
                  if (!nm.field_b) {
                    break L2;
                  } else {
                    if (-1 != (sm.field_a ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (-2 != (vk.field_c ^ -1)) {
                            break L4;
                          } else {
                            if ((vf.field_f ^ -1) == -1) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (vk.field_c != 5) {
                            break L5;
                          } else {
                            if ((vf.field_f ^ -1) == -1) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (-6 != (vk.field_c ^ -1)) {
                            break L6;
                          } else {
                            if (-2 == (vf.field_f ^ -1)) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (5 != vk.field_c) {
                            break L7;
                          } else {
                            if ((vf.field_f ^ -1) == -3) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (vk.field_c != 5) {
                          break L2;
                        } else {
                          if (-5 != (vf.field_f ^ -1)) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      return true;
                    }
                  }
                }
                return false;
              }
            } else {
              if (nm.field_b) {
                if (-401 < (vj.field_o ^ -1)) {
                  vj.field_o = vj.field_o + 40;
                  if (400 >= vj.field_o) {
                    break L1;
                  } else {
                    vj.field_o = 400;
                    break L1;
                  }
                } else {
                  if (nm.field_b) {
                    break L1;
                  } else {
                    if (vj.field_o > 0) {
                      vj.field_o = vj.field_o - 40;
                      if (0 < vj.field_o) {
                        break L1;
                      } else {
                        vj.field_o = 0;
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                L8: {
                  if (nm.field_b) {
                    break L8;
                  } else {
                    if (vj.field_o > 0) {
                      vj.field_o = vj.field_o - 40;
                      if (0 < vj.field_o) {
                        break L8;
                      } else {
                        vj.field_o = 0;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (!nm.field_b) {
                    break L9;
                  } else {
                    if (-1 != (sm.field_a ^ -1)) {
                      break L9;
                    } else {
                      L10: {
                        if (-2 != (vk.field_c ^ -1)) {
                          if (vk.field_c != 5) {
                            if (-6 != (vk.field_c ^ -1)) {
                              if (5 != vk.field_c) {
                                if (vk.field_c != 5) {
                                  break L9;
                                } else {
                                  if (-5 != (vf.field_f ^ -1)) {
                                    break L9;
                                  } else {
                                    return true;
                                  }
                                }
                              } else {
                                if ((vf.field_f ^ -1) == -3) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (vk.field_c != 5) {
                                      break L11;
                                    } else {
                                      if (-5 != (vf.field_f ^ -1)) {
                                        break L11;
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                  return false;
                                }
                              }
                            } else {
                              if (-2 == (vf.field_f ^ -1)) {
                                break L10;
                              } else {
                                L12: {
                                  L13: {
                                    if (5 != vk.field_c) {
                                      break L13;
                                    } else {
                                      if ((vf.field_f ^ -1) == -3) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (vk.field_c != 5) {
                                      break L14;
                                    } else {
                                      if (-5 != (vf.field_f ^ -1)) {
                                        break L14;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  return false;
                                }
                                return true;
                              }
                            }
                          } else {
                            if ((vf.field_f ^ -1) == -1) {
                              break L10;
                            } else {
                              L15: {
                                L16: {
                                  if (-6 != (vk.field_c ^ -1)) {
                                    break L16;
                                  } else {
                                    if (-2 == (vf.field_f ^ -1)) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (5 != vk.field_c) {
                                    break L17;
                                  } else {
                                    if ((vf.field_f ^ -1) == -3) {
                                      break L15;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  if (vk.field_c != 5) {
                                    break L18;
                                  } else {
                                    if (-5 != (vf.field_f ^ -1)) {
                                      break L18;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                return false;
                              }
                              return true;
                            }
                          }
                        } else {
                          if ((vf.field_f ^ -1) == -1) {
                            break L10;
                          } else {
                            L19: {
                              L20: {
                                if (vk.field_c != 5) {
                                  break L20;
                                } else {
                                  if ((vf.field_f ^ -1) == -1) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              L21: {
                                if (-6 != (vk.field_c ^ -1)) {
                                  break L21;
                                } else {
                                  if (-2 == (vf.field_f ^ -1)) {
                                    break L19;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              L22: {
                                if (5 != vk.field_c) {
                                  break L22;
                                } else {
                                  if ((vf.field_f ^ -1) == -3) {
                                    break L19;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                              L23: {
                                if (vk.field_c != 5) {
                                  break L23;
                                } else {
                                  if (-5 != (vf.field_f ^ -1)) {
                                    break L23;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              return false;
                            }
                            return true;
                          }
                        }
                      }
                      return true;
                    }
                  }
                }
                return false;
              }
            }
          }
          if (nm.field_b) {
            if (-1 == (sm.field_a ^ -1)) {
              L24: {
                if (-2 != (vk.field_c ^ -1)) {
                  if (vk.field_c != 5) {
                    if (-6 != (vk.field_c ^ -1)) {
                      if (5 != vk.field_c) {
                        L25: {
                          if (vk.field_c != 5) {
                            break L25;
                          } else {
                            if (-5 != (vf.field_f ^ -1)) {
                              break L25;
                            } else {
                              return true;
                            }
                          }
                        }
                        return false;
                      } else {
                        if ((vf.field_f ^ -1) == -3) {
                          break L24;
                        } else {
                          L26: {
                            if (vk.field_c != 5) {
                              break L26;
                            } else {
                              if (-5 != (vf.field_f ^ -1)) {
                                break L26;
                              } else {
                                return true;
                              }
                            }
                          }
                          return false;
                        }
                      }
                    } else {
                      if (-2 == (vf.field_f ^ -1)) {
                        break L24;
                      } else {
                        if (5 != vk.field_c) {
                          L27: {
                            if (vk.field_c != 5) {
                              break L27;
                            } else {
                              if (-5 != (vf.field_f ^ -1)) {
                                break L27;
                              } else {
                                return true;
                              }
                            }
                          }
                          return false;
                        } else {
                          if ((vf.field_f ^ -1) == -3) {
                            return true;
                          } else {
                            L28: {
                              if (vk.field_c != 5) {
                                break L28;
                              } else {
                                if (-5 != (vf.field_f ^ -1)) {
                                  break L28;
                                } else {
                                  return true;
                                }
                              }
                            }
                            return false;
                          }
                        }
                      }
                    }
                  } else {
                    if ((vf.field_f ^ -1) == -1) {
                      break L24;
                    } else {
                      L29: {
                        if (-6 != (vk.field_c ^ -1)) {
                          if (5 != vk.field_c) {
                            L30: {
                              if (vk.field_c != 5) {
                                break L30;
                              } else {
                                if (-5 != (vf.field_f ^ -1)) {
                                  break L30;
                                } else {
                                  return true;
                                }
                              }
                            }
                            return false;
                          } else {
                            if ((vf.field_f ^ -1) == -3) {
                              break L29;
                            } else {
                              L31: {
                                if (vk.field_c != 5) {
                                  break L31;
                                } else {
                                  if (-5 != (vf.field_f ^ -1)) {
                                    break L31;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                              return false;
                            }
                          }
                        } else {
                          if (-2 == (vf.field_f ^ -1)) {
                            break L29;
                          } else {
                            if (5 != vk.field_c) {
                              L32: {
                                if (vk.field_c != 5) {
                                  break L32;
                                } else {
                                  if (-5 != (vf.field_f ^ -1)) {
                                    break L32;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                              return false;
                            } else {
                              if ((vf.field_f ^ -1) == -3) {
                                return true;
                              } else {
                                L33: {
                                  if (vk.field_c != 5) {
                                    break L33;
                                  } else {
                                    if (-5 != (vf.field_f ^ -1)) {
                                      break L33;
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                                return false;
                              }
                            }
                          }
                        }
                      }
                      return true;
                    }
                  }
                } else {
                  if ((vf.field_f ^ -1) == -1) {
                    break L24;
                  } else {
                    L34: {
                      L35: {
                        if (vk.field_c != 5) {
                          break L35;
                        } else {
                          if ((vf.field_f ^ -1) == -1) {
                            break L34;
                          } else {
                            break L35;
                          }
                        }
                      }
                      L36: {
                        if (-6 != (vk.field_c ^ -1)) {
                          break L36;
                        } else {
                          if (-2 == (vf.field_f ^ -1)) {
                            break L34;
                          } else {
                            break L36;
                          }
                        }
                      }
                      L37: {
                        if (5 != vk.field_c) {
                          break L37;
                        } else {
                          if ((vf.field_f ^ -1) == -3) {
                            break L34;
                          } else {
                            break L37;
                          }
                        }
                      }
                      L38: {
                        if (vk.field_c != 5) {
                          break L38;
                        } else {
                          if (-5 != (vf.field_f ^ -1)) {
                            break L38;
                          } else {
                            return true;
                          }
                        }
                      }
                      return false;
                    }
                    return true;
                  }
                }
              }
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          L39: {
            if (ul.field_f) {
              vj.field_q = vj.field_q + 1;
              break L39;
            } else {
              break L39;
            }
          }
          L40: {
            if ((ma.field_r ^ -1) != (sm.field_a ^ -1)) {
              vj.field_o = vj.field_o - 40;
              if (0 >= vj.field_o) {
                vj.field_o = 0;
                ma.field_r = sm.field_a;
                jd.field_c = rc.field_w;
                break L40;
              } else {
                L41: {
                  if (!nm.field_b) {
                    break L41;
                  } else {
                    if (-1 != (sm.field_a ^ -1)) {
                      break L41;
                    } else {
                      L42: {
                        L43: {
                          if (-2 != (vk.field_c ^ -1)) {
                            break L43;
                          } else {
                            if ((vf.field_f ^ -1) == -1) {
                              break L42;
                            } else {
                              break L43;
                            }
                          }
                        }
                        L44: {
                          if (vk.field_c != 5) {
                            break L44;
                          } else {
                            if ((vf.field_f ^ -1) == -1) {
                              break L42;
                            } else {
                              break L44;
                            }
                          }
                        }
                        L45: {
                          if (-6 != (vk.field_c ^ -1)) {
                            break L45;
                          } else {
                            if (-2 == (vf.field_f ^ -1)) {
                              break L42;
                            } else {
                              break L45;
                            }
                          }
                        }
                        L46: {
                          if (5 != vk.field_c) {
                            break L46;
                          } else {
                            if ((vf.field_f ^ -1) == -3) {
                              break L42;
                            } else {
                              break L46;
                            }
                          }
                        }
                        if (vk.field_c != 5) {
                          break L41;
                        } else {
                          if (-5 != (vf.field_f ^ -1)) {
                            break L41;
                          } else {
                            return true;
                          }
                        }
                      }
                      return true;
                    }
                  }
                }
                return false;
              }
            } else {
              L47: {
                if (!nm.field_b) {
                  break L47;
                } else {
                  if (-401 < (vj.field_o ^ -1)) {
                    vj.field_o = vj.field_o + 40;
                    if (400 >= vj.field_o) {
                      break L40;
                    } else {
                      vj.field_o = 400;
                      break L40;
                    }
                  } else {
                    break L47;
                  }
                }
              }
              if (nm.field_b) {
                break L40;
              } else {
                if (vj.field_o > 0) {
                  vj.field_o = vj.field_o - 40;
                  if (0 < vj.field_o) {
                    break L40;
                  } else {
                    vj.field_o = 0;
                    break L40;
                  }
                } else {
                  break L40;
                }
              }
            }
          }
          L48: {
            if (!nm.field_b) {
              break L48;
            } else {
              if (-1 != (sm.field_a ^ -1)) {
                break L48;
              } else {
                L49: {
                  if (-2 != (vk.field_c ^ -1)) {
                    if (vk.field_c != 5) {
                      if (-6 != (vk.field_c ^ -1)) {
                        if (5 != vk.field_c) {
                          if (vk.field_c != 5) {
                            break L48;
                          } else {
                            if (-5 != (vf.field_f ^ -1)) {
                              break L48;
                            } else {
                              return true;
                            }
                          }
                        } else {
                          if ((vf.field_f ^ -1) == -3) {
                            break L49;
                          } else {
                            L50: {
                              if (vk.field_c != 5) {
                                break L50;
                              } else {
                                if (-5 != (vf.field_f ^ -1)) {
                                  break L50;
                                } else {
                                  return true;
                                }
                              }
                            }
                            return false;
                          }
                        }
                      } else {
                        if (-2 == (vf.field_f ^ -1)) {
                          break L49;
                        } else {
                          L51: {
                            L52: {
                              if (5 != vk.field_c) {
                                break L52;
                              } else {
                                if ((vf.field_f ^ -1) == -3) {
                                  break L51;
                                } else {
                                  break L52;
                                }
                              }
                            }
                            L53: {
                              if (vk.field_c != 5) {
                                break L53;
                              } else {
                                if (-5 != (vf.field_f ^ -1)) {
                                  break L53;
                                } else {
                                  break L51;
                                }
                              }
                            }
                            return false;
                          }
                          return true;
                        }
                      }
                    } else {
                      if ((vf.field_f ^ -1) == -1) {
                        break L49;
                      } else {
                        L54: {
                          L55: {
                            if (-6 != (vk.field_c ^ -1)) {
                              break L55;
                            } else {
                              if (-2 == (vf.field_f ^ -1)) {
                                break L54;
                              } else {
                                break L55;
                              }
                            }
                          }
                          L56: {
                            if (5 != vk.field_c) {
                              break L56;
                            } else {
                              if ((vf.field_f ^ -1) == -3) {
                                break L54;
                              } else {
                                break L56;
                              }
                            }
                          }
                          L57: {
                            if (vk.field_c != 5) {
                              break L57;
                            } else {
                              if (-5 != (vf.field_f ^ -1)) {
                                break L57;
                              } else {
                                break L54;
                              }
                            }
                          }
                          return false;
                        }
                        return true;
                      }
                    }
                  } else {
                    if ((vf.field_f ^ -1) == -1) {
                      break L49;
                    } else {
                      L58: {
                        L59: {
                          if (vk.field_c != 5) {
                            break L59;
                          } else {
                            if ((vf.field_f ^ -1) == -1) {
                              break L58;
                            } else {
                              break L59;
                            }
                          }
                        }
                        L60: {
                          if (-6 != (vk.field_c ^ -1)) {
                            break L60;
                          } else {
                            if (-2 == (vf.field_f ^ -1)) {
                              break L58;
                            } else {
                              break L60;
                            }
                          }
                        }
                        L61: {
                          if (5 != vk.field_c) {
                            break L61;
                          } else {
                            if ((vf.field_f ^ -1) == -3) {
                              break L58;
                            } else {
                              break L61;
                            }
                          }
                        }
                        L62: {
                          if (vk.field_c != 5) {
                            break L62;
                          } else {
                            if (-5 != (vf.field_f ^ -1)) {
                              break L62;
                            } else {
                              break L58;
                            }
                          }
                        }
                        return false;
                      }
                      return true;
                    }
                  }
                }
                return true;
              }
            }
          }
          return false;
        }
    }

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        if (param0 != 2634) {
          L0: {
            ((ei) this).a((byte) -43, -14, -18);
            var2 = this.i(35);
            var3 = -((ei) this).field_I + var2;
            if (-1 > (var3 ^ -1)) {
              ((ei) this).field_I = ((ei) this).field_I + (-1 + (var3 - -8)) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 > var3) {
              ((ei) this).field_I = ((ei) this).field_I + (-16 + var3 + 1) / 16;
              break L1;
            } else {
              break L1;
            }
          }
          if (0 == ((ei) this).field_I) {
            if (0 != var2) {
              return false;
            } else {
              L2: {
                if (((ei) this).field_H) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L2;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L2;
                }
              }
              return stackIn_25_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          L3: {
            var2 = this.i(35);
            var3 = -((ei) this).field_I + var2;
            if (-1 > (var3 ^ -1)) {
              ((ei) this).field_I = ((ei) this).field_I + (-1 + (var3 - -8)) / 8;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (0 > var3) {
              ((ei) this).field_I = ((ei) this).field_I + (-16 + var3 + 1) / 16;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            L6: {
              if (0 != ((ei) this).field_I) {
                break L6;
              } else {
                if (0 != var2) {
                  break L6;
                } else {
                  if (((ei) this).field_H) {
                    break L6;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L5;
                  }
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L5;
          }
          return stackIn_12_0 != 0;
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 < 99) {
            field_G = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = 0;
        field_G = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
