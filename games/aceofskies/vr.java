/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vr {
    private int field_a;
    private int field_f;
    static Random field_h;
    private qe field_e;
    static ce field_b;
    private wl field_g;
    private hh[] field_d;
    private int field_i;
    static String[] field_c;

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        int var1 = 25 % ((param0 - 55) / 40);
        field_b = null;
    }

    final boolean a(byte param0, int param1) {
        if (param0 != -118) {
            return false;
        }
        return ((vr) this).field_d[param1].a((byte) -124);
    }

    final static boolean a(String param0, int param1) {
        String var3 = null;
        if (param0 != null) {
          if (param0.length() >= jm.field_d) {
            if (param0.length() > dc.field_f) {
              return true;
            } else {
              if (param1 != 2) {
                var3 = (String) null;
                boolean discarded$2 = vr.a((String) null, 81);
                return false;
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        param4 = param4 & ((vr) this).field_g.c((byte) 16);
        if (param2 != 2147483647) {
          L0: {
            ((vr) this).field_d = (hh[]) null;
            if (param4) {
              break L0;
            } else {
              if (param0 != 4) {
                L1: {
                  if (8 == param0) {
                    break L1;
                  } else {
                    if (param0 == -10) {
                      break L1;
                    } else {
                      L2: {
                        if (-1 == param0) {
                          break L2;
                        } else {
                          if (param1) {
                            param0 = param0 | -2147483648;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (param0 != ((vr) this).field_i) {
                        if (0 != ((vr) this).field_i) {
                          L3: {
                            ((vr) this).field_d[2147483647 & ((vr) this).field_i].b((byte) 105);
                            if (param0 != 0) {
                              ((vr) this).field_d[2147483647 & param0].a(false, param1);
                              ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                              ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          ((vr) this).field_f = param3;
                          ((vr) this).field_a = param5;
                          ((vr) this).field_i = param0;
                          return;
                        } else {
                          L4: {
                            if (param0 != 0) {
                              ((vr) this).field_d[2147483647 & param0].a(false, param1);
                              ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                              ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((vr) this).field_f = param3;
                          ((vr) this).field_a = param5;
                          ((vr) this).field_i = param0;
                          return;
                        }
                      } else {
                        L5: {
                          if (0 != ((vr) this).field_i) {
                            L6: {
                              ((vr) this).field_d[((vr) this).field_i & 2147483647].a(4096, param1);
                              if (((vr) this).field_a != param5) {
                                break L6;
                              } else {
                                if (param3 != ((vr) this).field_f) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                            ((vr) this).field_f = param3;
                            ((vr) this).field_a = param5;
                            return;
                          } else {
                            break L5;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L7: {
                  if (param0 != 4) {
                    break L7;
                  } else {
                    param3 = param5;
                    break L7;
                  }
                }
                param0 = 2;
                break L0;
              } else {
                L8: {
                  if (param0 != 4) {
                    break L8;
                  } else {
                    param3 = param5;
                    break L8;
                  }
                }
                L9: {
                  param0 = 2;
                  if (-1 == (param0 ^ -1)) {
                    break L9;
                  } else {
                    if (param1) {
                      param0 = param0 | -2147483648;
                      break L9;
                    } else {
                      L10: {
                        if (param0 != ((vr) this).field_i) {
                          L11: {
                            if (0 == ((vr) this).field_i) {
                              break L11;
                            } else {
                              ((vr) this).field_d[2147483647 & ((vr) this).field_i].b((byte) 105);
                              break L11;
                            }
                          }
                          L12: {
                            if (param0 != 0) {
                              ((vr) this).field_d[2147483647 & param0].a(false, param1);
                              ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                              ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          ((vr) this).field_f = param3;
                          ((vr) this).field_a = param5;
                          ((vr) this).field_i = param0;
                          break L10;
                        } else {
                          if (0 != ((vr) this).field_i) {
                            L13: {
                              ((vr) this).field_d[((vr) this).field_i & 2147483647].a(4096, param1);
                              if (((vr) this).field_a != param5) {
                                break L13;
                              } else {
                                if (param3 != ((vr) this).field_f) {
                                  break L13;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                            ((vr) this).field_f = param3;
                            ((vr) this).field_a = param5;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (param0 != ((vr) this).field_i) {
                  if (0 != ((vr) this).field_i) {
                    L14: {
                      ((vr) this).field_d[2147483647 & ((vr) this).field_i].b((byte) 105);
                      if (param0 != 0) {
                        ((vr) this).field_d[2147483647 & param0].a(false, param1);
                        ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                        ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    ((vr) this).field_f = param3;
                    ((vr) this).field_a = param5;
                    ((vr) this).field_i = param0;
                    return;
                  } else {
                    L15: {
                      if (param0 != 0) {
                        ((vr) this).field_d[2147483647 & param0].a(false, param1);
                        ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                        ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    ((vr) this).field_f = param3;
                    ((vr) this).field_a = param5;
                    ((vr) this).field_i = param0;
                    return;
                  }
                } else {
                  if (0 != ((vr) this).field_i) {
                    ((vr) this).field_d[((vr) this).field_i & 2147483647].a(4096, param1);
                    if (((vr) this).field_a == param5) {
                      if (param3 == ((vr) this).field_f) {
                        return;
                      } else {
                        ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                        ((vr) this).field_f = param3;
                        ((vr) this).field_a = param5;
                        return;
                      }
                    } else {
                      ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                      ((vr) this).field_f = param3;
                      ((vr) this).field_a = param5;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L16: {
            if (-1 == (param0 ^ -1)) {
              break L16;
            } else {
              if (param1) {
                param0 = param0 | -2147483648;
                break L16;
              } else {
                if (param0 != ((vr) this).field_i) {
                  if (0 == ((vr) this).field_i) {
                    L17: {
                      if (param0 != 0) {
                        ((vr) this).field_d[2147483647 & param0].a(false, param1);
                        ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                        ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    ((vr) this).field_f = param3;
                    ((vr) this).field_a = param5;
                    ((vr) this).field_i = param0;
                    return;
                  } else {
                    L18: {
                      ((vr) this).field_d[2147483647 & ((vr) this).field_i].b((byte) 105);
                      if (param0 != 0) {
                        ((vr) this).field_d[2147483647 & param0].a(false, param1);
                        ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                        ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    ((vr) this).field_f = param3;
                    ((vr) this).field_a = param5;
                    ((vr) this).field_i = param0;
                    return;
                  }
                } else {
                  if (0 != ((vr) this).field_i) {
                    ((vr) this).field_d[((vr) this).field_i & 2147483647].a(4096, param1);
                    if (((vr) this).field_a == param5) {
                      if (param3 != ((vr) this).field_f) {
                        ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                        ((vr) this).field_f = param3;
                        ((vr) this).field_a = param5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                      ((vr) this).field_f = param3;
                      ((vr) this).field_a = param5;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (param0 != ((vr) this).field_i) {
            if (0 == ((vr) this).field_i) {
              L19: {
                if (param0 != 0) {
                  ((vr) this).field_d[2147483647 & param0].a(false, param1);
                  ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                  ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                  break L19;
                } else {
                  break L19;
                }
              }
              ((vr) this).field_f = param3;
              ((vr) this).field_a = param5;
              ((vr) this).field_i = param0;
              return;
            } else {
              L20: {
                ((vr) this).field_d[2147483647 & ((vr) this).field_i].b((byte) 105);
                if (param0 != 0) {
                  ((vr) this).field_d[2147483647 & param0].a(false, param1);
                  ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                  ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                  break L20;
                } else {
                  break L20;
                }
              }
              ((vr) this).field_f = param3;
              ((vr) this).field_a = param5;
              ((vr) this).field_i = param0;
              return;
            }
          } else {
            if (0 != ((vr) this).field_i) {
              ((vr) this).field_d[((vr) this).field_i & 2147483647].a(4096, param1);
              if (((vr) this).field_a == param5) {
                if (param3 == ((vr) this).field_f) {
                  return;
                } else {
                  ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                  ((vr) this).field_f = param3;
                  ((vr) this).field_a = param5;
                  return;
                }
              } else {
                ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                ((vr) this).field_f = param3;
                ((vr) this).field_a = param5;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L21: {
            if (param4) {
              break L21;
            } else {
              L22: {
                if (param0 == 4) {
                  break L22;
                } else {
                  if (8 == param0) {
                    break L22;
                  } else {
                    if (param0 == -10) {
                      break L22;
                    } else {
                      L23: {
                        if (-1 == param0) {
                          break L23;
                        } else {
                          if (param1) {
                            param0 = param0 | -2147483648;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (param0 != ((vr) this).field_i) {
                          L25: {
                            if (0 == ((vr) this).field_i) {
                              break L25;
                            } else {
                              ((vr) this).field_d[2147483647 & ((vr) this).field_i].b((byte) 105);
                              break L25;
                            }
                          }
                          L26: {
                            if (param0 != 0) {
                              ((vr) this).field_d[2147483647 & param0].a(false, param1);
                              ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                              ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          ((vr) this).field_f = param3;
                          ((vr) this).field_a = param5;
                          ((vr) this).field_i = param0;
                          break L24;
                        } else {
                          if (0 != ((vr) this).field_i) {
                            L27: {
                              ((vr) this).field_d[((vr) this).field_i & 2147483647].a(4096, param1);
                              if (((vr) this).field_a != param5) {
                                break L27;
                              } else {
                                if (param3 != ((vr) this).field_f) {
                                  break L27;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                            ((vr) this).field_f = param3;
                            ((vr) this).field_a = param5;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L28: {
                if (param0 != 4) {
                  break L28;
                } else {
                  param3 = param5;
                  break L28;
                }
              }
              param0 = 2;
              break L21;
            }
          }
          L29: {
            if (-1 == (param0 ^ -1)) {
              break L29;
            } else {
              if (param1) {
                param0 = param0 | -2147483648;
                break L29;
              } else {
                L30: {
                  if (param0 != ((vr) this).field_i) {
                    L31: {
                      if (0 == ((vr) this).field_i) {
                        break L31;
                      } else {
                        ((vr) this).field_d[2147483647 & ((vr) this).field_i].b((byte) 105);
                        break L31;
                      }
                    }
                    L32: {
                      if (param0 != 0) {
                        ((vr) this).field_d[2147483647 & param0].a(false, param1);
                        ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                        ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    ((vr) this).field_f = param3;
                    ((vr) this).field_a = param5;
                    ((vr) this).field_i = param0;
                    break L30;
                  } else {
                    if (0 != ((vr) this).field_i) {
                      L33: {
                        ((vr) this).field_d[((vr) this).field_i & 2147483647].a(4096, param1);
                        if (((vr) this).field_a != param5) {
                          break L33;
                        } else {
                          if (param3 != ((vr) this).field_f) {
                            break L33;
                          } else {
                            break L30;
                          }
                        }
                      }
                      ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                      ((vr) this).field_f = param3;
                      ((vr) this).field_a = param5;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                }
                return;
              }
            }
          }
          if (param0 != ((vr) this).field_i) {
            if (0 != ((vr) this).field_i) {
              L34: {
                ((vr) this).field_d[2147483647 & ((vr) this).field_i].b((byte) 105);
                if (param0 != 0) {
                  ((vr) this).field_d[2147483647 & param0].a(false, param1);
                  ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                  ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                  break L34;
                } else {
                  break L34;
                }
              }
              ((vr) this).field_f = param3;
              ((vr) this).field_a = param5;
              ((vr) this).field_i = param0;
              return;
            } else {
              L35: {
                if (param0 != 0) {
                  ((vr) this).field_d[2147483647 & param0].a(false, param1);
                  ((vr) this).field_d[param0 & 2147483647].a(4096, param1);
                  ((vr) this).field_d[2147483647 & param0].a((byte) -65, param5, param3);
                  break L35;
                } else {
                  break L35;
                }
              }
              ((vr) this).field_f = param3;
              ((vr) this).field_a = param5;
              ((vr) this).field_i = param0;
              return;
            }
          } else {
            if (0 != ((vr) this).field_i) {
              ((vr) this).field_d[((vr) this).field_i & 2147483647].a(4096, param1);
              if (((vr) this).field_a == param5) {
                if (param3 == ((vr) this).field_f) {
                  return;
                } else {
                  ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                  ((vr) this).field_f = param3;
                  ((vr) this).field_a = param5;
                  return;
                }
              } else {
                ((vr) this).field_d[((vr) this).field_i & 2147483647].a((byte) -65, param5, param3);
                ((vr) this).field_f = param3;
                ((vr) this).field_a = param5;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean a(int param0, int param1, rt param2) {
        if (0 == ((vr) this).field_i) {
          return false;
        } else {
          if (param1 != -1896) {
            boolean discarded$2 = ((vr) this).a((byte) 95, -4);
            ((vr) this).field_d[((vr) this).field_i & 2147483647].a(param0, -1486691000, param2);
            return true;
          } else {
            ((vr) this).field_d[((vr) this).field_i & 2147483647].a(param0, -1486691000, param2);
            return true;
          }
        }
    }

    vr(wl param0) {
        L0: {
          ((vr) this).field_f = 0;
          ((vr) this).field_a = 0;
          ((vr) this).field_i = 0;
          ((vr) this).field_g = param0;
          ((vr) this).field_e = new qe(param0);
          ((vr) this).field_d = new hh[10];
          ((vr) this).field_d[1] = (hh) (Object) new wk(param0);
          ((vr) this).field_d[2] = (hh) (Object) new bk(param0, ((vr) this).field_e);
          ((vr) this).field_d[4] = (hh) (Object) new ij(param0, ((vr) this).field_e);
          ((vr) this).field_d[5] = (hh) (Object) new rc(param0, ((vr) this).field_e);
          ((vr) this).field_d[6] = (hh) (Object) new np(param0);
          ((vr) this).field_d[7] = (hh) (Object) new ne(param0);
          ((vr) this).field_d[3] = (hh) (Object) new g(param0);
          ((vr) this).field_d[8] = (hh) (Object) new sd(param0, ((vr) this).field_e);
          ((vr) this).field_d[9] = (hh) (Object) new ci(param0, ((vr) this).field_e);
          if (((vr) this).field_d[8].a((byte) -76)) {
            break L0;
          } else {
            ((vr) this).field_d[8] = ((vr) this).field_d[4];
            break L0;
          }
        }
        L1: {
          if (((vr) this).field_d[9].a((byte) -128)) {
            break L1;
          } else {
            ((vr) this).field_d[9] = ((vr) this).field_d[8];
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new Random();
        field_c = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
