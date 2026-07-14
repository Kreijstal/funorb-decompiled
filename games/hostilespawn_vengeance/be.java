/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    private int field_h;
    int field_f;
    private int field_d;
    private int field_j;
    private int field_a;
    static int field_i;
    static int field_e;
    int field_b;
    static td field_g;
    private boolean field_c;

    final void a(byte param0, int param1, int param2) {
        if (param0 <= -22) {
          if (param1 < ((be) this).field_b) {
            if (((be) this).field_b <= param2) {
              throw new IllegalArgumentException();
            } else {
              L0: {
                ((be) this).field_d = 0;
                ((be) this).field_a = 0;
                if (pf.field_o != 0) {
                  ((be) this).field_h = pf.field_o;
                  ((be) this).field_d = pf.field_o;
                  ((be) this).field_j = an.field_q;
                  ((be) this).field_f = param2;
                  ((be) this).field_c = true;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (0 == ((be) this).field_h) {
                  break L1;
                } else {
                  if (-1 == (ig.field_L ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if ((((be) this).field_j ^ -1) >= -1) {
                        ((be) this).field_j = pk.field_l;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((be) this).field_j = ((be) this).field_j - 1;
                    break L1;
                  }
                }
              }
              L3: {
                if (0 != pf.field_o) {
                  break L3;
                } else {
                  if (ig.field_L == 0) {
                    ((be) this).field_h = 0;
                    break L3;
                  } else {
                    if (((be) this).field_h == 0) {
                      L4: {
                        if (((be) this).field_c) {
                          break L4;
                        } else {
                          if (um.field_d) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 > param1) {
                        if (!((be) this).field_c) {
                          return;
                        } else {
                          ((be) this).field_f = -1;
                          return;
                        }
                      } else {
                        if (param1 != ((be) this).field_f) {
                          ((be) this).field_c = true;
                          ((be) this).field_f = param1;
                          return;
                        } else {
                          ((be) this).field_c = true;
                          ((be) this).field_f = param1;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (((be) this).field_h == 0) {
                if (((be) this).field_c) {
                  if (0 > param1) {
                    if (((be) this).field_c) {
                      ((be) this).field_f = -1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param1 != ((be) this).field_f) {
                      ((be) this).field_c = true;
                      ((be) this).field_f = param1;
                      return;
                    } else {
                      ((be) this).field_c = true;
                      ((be) this).field_f = param1;
                      return;
                    }
                  }
                } else {
                  if (um.field_d) {
                    if (0 > param1) {
                      if (!((be) this).field_c) {
                        return;
                      } else {
                        ((be) this).field_f = -1;
                        return;
                      }
                    } else {
                      if (param1 != ((be) this).field_f) {
                        ((be) this).field_c = true;
                        ((be) this).field_f = param1;
                        return;
                      } else {
                        ((be) this).field_c = true;
                        ((be) this).field_f = param1;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          ((be) this).field_h = 117;
          if (param1 < ((be) this).field_b) {
            if (((be) this).field_b <= param2) {
              throw new IllegalArgumentException();
            } else {
              L5: {
                ((be) this).field_d = 0;
                ((be) this).field_a = 0;
                if (pf.field_o != 0) {
                  ((be) this).field_h = pf.field_o;
                  ((be) this).field_d = pf.field_o;
                  ((be) this).field_j = an.field_q;
                  ((be) this).field_f = param2;
                  ((be) this).field_c = true;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (0 != ((be) this).field_h) {
                if (-1 != (ig.field_L ^ -1)) {
                  L6: {
                    if ((((be) this).field_j ^ -1) >= -1) {
                      ((be) this).field_j = pk.field_l;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    ((be) this).field_j = ((be) this).field_j - 1;
                    if (0 != pf.field_o) {
                      break L7;
                    } else {
                      if (ig.field_L == 0) {
                        ((be) this).field_h = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (((be) this).field_h == 0) {
                    if (!((be) this).field_c) {
                      if (!um.field_d) {
                        return;
                      } else {
                        L8: {
                          if (0 > param1) {
                            if (((be) this).field_c) {
                              ((be) this).field_f = -1;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            if (param1 != ((be) this).field_f) {
                              ((be) this).field_c = true;
                              ((be) this).field_f = param1;
                              break L8;
                            } else {
                              ((be) this).field_c = true;
                              ((be) this).field_f = param1;
                              break L8;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L9: {
                        if (0 > param1) {
                          if (((be) this).field_c) {
                            ((be) this).field_f = -1;
                            break L9;
                          } else {
                            break L9;
                          }
                        } else {
                          if (param1 != ((be) this).field_f) {
                            ((be) this).field_c = true;
                            ((be) this).field_f = param1;
                            break L9;
                          } else {
                            ((be) this).field_c = true;
                            ((be) this).field_f = param1;
                            break L9;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L10: {
                    if (0 != pf.field_o) {
                      break L10;
                    } else {
                      if (ig.field_L == 0) {
                        ((be) this).field_h = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (((be) this).field_h != 0) {
                      break L11;
                    } else {
                      L12: {
                        if (((be) this).field_c) {
                          break L12;
                        } else {
                          if (!um.field_d) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (0 > param1) {
                        if (((be) this).field_c) {
                          ((be) this).field_f = -1;
                          break L11;
                        } else {
                          break L11;
                        }
                      } else {
                        if (param1 != ((be) this).field_f) {
                          ((be) this).field_c = true;
                          ((be) this).field_f = param1;
                          break L11;
                        } else {
                          ((be) this).field_c = true;
                          ((be) this).field_f = param1;
                          break L11;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  if (0 != pf.field_o) {
                    break L13;
                  } else {
                    if (ig.field_L == 0) {
                      ((be) this).field_h = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (((be) this).field_h != 0) {
                    break L14;
                  } else {
                    L15: {
                      if (((be) this).field_c) {
                        break L15;
                      } else {
                        if (!um.field_d) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (0 > param1) {
                      if (((be) this).field_c) {
                        ((be) this).field_f = -1;
                        break L14;
                      } else {
                        break L14;
                      }
                    } else {
                      if (param1 != ((be) this).field_f) {
                        ((be) this).field_c = true;
                        ((be) this).field_f = param1;
                        break L14;
                      } else {
                        ((be) this).field_c = true;
                        ((be) this).field_f = param1;
                        break L14;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            be.a(-66);
            field_g = null;
            return;
        }
        field_g = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((be) this).field_h = param1;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((be) this).field_c = stackIn_3_1 != 0;
        if (!((be) this).field_c) {
          ((be) this).field_f = param3;
          return;
        } else {
          ((be) this).field_f = param2;
          return;
        }
    }

    final void c(int param0) {
        L0: {
          ((be) this).field_d = 0;
          ((be) this).field_a = param0;
          if (-1 == (((be) this).field_h ^ -1)) {
            ((be) this).field_a = pj.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        if (((be) this).field_h != 0) {
          if (((be) this).field_h == 0) {
            if (pj.field_e == 99) {
              ((be) this).field_f = ((be) this).field_f + 1;
              ((be) this).field_c = false;
              if (((be) this).field_f >= ((be) this).field_b) {
                ((be) this).field_f = 0;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          if ((pj.field_e ^ -1) == -99) {
            if (0 < ((be) this).field_f) {
              ((be) this).field_c = false;
              ((be) this).field_f = ((be) this).field_f - 1;
              if (((be) this).field_h == 0) {
                if (pj.field_e == 99) {
                  ((be) this).field_f = ((be) this).field_f + 1;
                  ((be) this).field_c = false;
                  if (((be) this).field_f < ((be) this).field_b) {
                    return;
                  } else {
                    ((be) this).field_f = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              ((be) this).field_f = ((be) this).field_b;
              ((be) this).field_c = false;
              ((be) this).field_f = ((be) this).field_f - 1;
              if (((be) this).field_h == 0) {
                if (pj.field_e == 99) {
                  ((be) this).field_f = ((be) this).field_f + 1;
                  ((be) this).field_c = false;
                  if (((be) this).field_f < ((be) this).field_b) {
                    return;
                  } else {
                    ((be) this).field_f = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (((be) this).field_h == 0) {
              if (pj.field_e != 99) {
                return;
              } else {
                L1: {
                  ((be) this).field_f = ((be) this).field_f + 1;
                  ((be) this).field_c = false;
                  if (((be) this).field_f >= ((be) this).field_b) {
                    ((be) this).field_f = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public be() {
        ((be) this).field_f = 0;
        ((be) this).field_c = false;
    }

    final boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          if (-1 == ((be) this).field_d) {
            if (-85 != ((be) this).field_a) {
              if (((be) this).field_a == 83) {
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
          ((be) this).a(false, -110, -98, 25);
          if (-1 == ((be) this).field_d) {
            if (-85 == ((be) this).field_a) {
              return true;
            } else {
              L0: {
                if (((be) this).field_a != 83) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    be(int param0) {
        ((be) this).field_f = 0;
        ((be) this).field_c = false;
        ((be) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 48;
    }
}
