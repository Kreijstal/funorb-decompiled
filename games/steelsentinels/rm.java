/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    private int field_d;
    static int field_g;
    private int field_a;
    static boolean field_p;
    static int field_n;
    int field_m;
    boolean field_c;
    private int field_b;
    private int field_k;
    static String[] field_o;
    static gh field_j;
    static boolean field_f;
    static String field_i;
    int field_e;
    static int[] field_h;
    private boolean field_l;

    final void a(int param0, int param1) {
        if (!(((rm) this).field_d != param0)) {
            ((rm) this).field_e = param1;
            ((rm) this).field_l = false;
            ((rm) this).field_c = true;
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            ((rm) this).a(false, -82);
            if (0 == ((rm) this).field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == ((rm) this).field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
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
        ((rm) this).field_l = stackIn_3_1 != 0;
        ((rm) this).field_d = param2;
        if (!((rm) this).field_l) {
          ((rm) this).field_e = param1;
          return;
        } else {
          ((rm) this).field_e = param3;
          return;
        }
    }

    final void a(boolean param0, int param1) {
        ((rm) this).field_c = false;
        if (param0) {
          L0: {
            ((rm) this).field_b = 0;
            ((rm) this).field_k = 0;
            if (-1 != (((rm) this).field_d ^ -1)) {
              break L0;
            } else {
              if (ei.field_q == -97) {
                L1: {
                  if (((rm) this).field_e <= 0) {
                    ((rm) this).field_e = ((rm) this).field_m;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((rm) this).field_c = true;
                ((rm) this).field_l = false;
                ((rm) this).field_e = ((rm) this).field_e - 1;
                break L0;
              } else {
                L2: {
                  if (0 == ((rm) this).field_d) {
                    ((rm) this).field_b = ei.field_q;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (((rm) this).field_d != 0) {
                    break L3;
                  } else {
                    if (-98 != ei.field_q) {
                      break L3;
                    } else {
                      L4: {
                        ((rm) this).field_e = ((rm) this).field_e + 1;
                        if (((rm) this).field_e >= ((rm) this).field_m) {
                          ((rm) this).field_e = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((rm) this).field_c = true;
                      ((rm) this).field_l = false;
                      break L3;
                    }
                  }
                }
                if (((rm) this).field_d == 0) {
                  if ((ei.field_q ^ -1) == -99) {
                    if (-1 >= (((rm) this).field_e ^ -1)) {
                      ((rm) this).field_l = false;
                      ((rm) this).field_c = true;
                      return;
                    } else {
                      ((rm) this).field_e = param1;
                      ((rm) this).field_l = false;
                      ((rm) this).field_c = true;
                      return;
                    }
                  } else {
                    if (ei.field_q == -100) {
                      if (-1 <= ((rm) this).field_e) {
                        ((rm) this).field_l = false;
                        ((rm) this).field_c = true;
                        return;
                      } else {
                        ((rm) this).field_e = param1;
                        ((rm) this).field_l = false;
                        ((rm) this).field_c = true;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          L5: {
            if (0 == ((rm) this).field_d) {
              ((rm) this).field_b = ei.field_q;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (((rm) this).field_d != 0) {
              break L6;
            } else {
              if (-98 != (ei.field_q ^ -1)) {
                break L6;
              } else {
                L7: {
                  ((rm) this).field_e = ((rm) this).field_e + 1;
                  if (((rm) this).field_e >= ((rm) this).field_m) {
                    ((rm) this).field_e = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((rm) this).field_c = true;
                ((rm) this).field_l = false;
                break L6;
              }
            }
          }
          if (((rm) this).field_d == 0) {
            if ((ei.field_q ^ -1) == -99) {
              if (-1 >= (((rm) this).field_e ^ -1)) {
                ((rm) this).field_l = false;
                ((rm) this).field_c = true;
                return;
              } else {
                ((rm) this).field_e = param1;
                ((rm) this).field_l = false;
                ((rm) this).field_c = true;
                return;
              }
            } else {
              if (ei.field_q == -100) {
                if (-1 <= ((rm) this).field_e) {
                  ((rm) this).field_l = false;
                  ((rm) this).field_c = true;
                  return;
                } else {
                  ((rm) this).field_e = param1;
                  ((rm) this).field_l = false;
                  ((rm) this).field_c = true;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          boolean discarded$1 = ((rm) this).c(-28);
          ((rm) this).field_b = 0;
          ((rm) this).field_k = 0;
          if (-1 == ((rm) this).field_d) {
            L8: {
              if ((ei.field_q ^ -1) == -97) {
                L9: {
                  if (((rm) this).field_e <= 0) {
                    ((rm) this).field_e = ((rm) this).field_m;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((rm) this).field_c = true;
                ((rm) this).field_l = false;
                ((rm) this).field_e = ((rm) this).field_e - 1;
                break L8;
              } else {
                break L8;
              }
            }
            L10: {
              if (0 == ((rm) this).field_d) {
                ((rm) this).field_b = ei.field_q;
                break L10;
              } else {
                break L10;
              }
            }
            if (((rm) this).field_d == 0) {
              L11: {
                if (-98 != (ei.field_q ^ -1)) {
                  break L11;
                } else {
                  L12: {
                    ((rm) this).field_e = ((rm) this).field_e + 1;
                    if (((rm) this).field_e >= ((rm) this).field_m) {
                      ((rm) this).field_e = 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  ((rm) this).field_c = true;
                  ((rm) this).field_l = false;
                  break L11;
                }
              }
              if (((rm) this).field_d == 0) {
                if ((ei.field_q ^ -1) == -99) {
                  if (-1 >= (((rm) this).field_e ^ -1)) {
                    ((rm) this).field_l = false;
                    ((rm) this).field_c = true;
                    return;
                  } else {
                    ((rm) this).field_e = param1;
                    ((rm) this).field_l = false;
                    ((rm) this).field_c = true;
                    return;
                  }
                } else {
                  if (ei.field_q == -100) {
                    if (-1 <= ((rm) this).field_e) {
                      ((rm) this).field_l = false;
                      ((rm) this).field_c = true;
                      return;
                    } else {
                      ((rm) this).field_e = param1;
                      ((rm) this).field_l = false;
                      ((rm) this).field_c = true;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              if (((rm) this).field_d == 0) {
                if ((ei.field_q ^ -1) == -99) {
                  if (-1 >= (((rm) this).field_e ^ -1)) {
                    ((rm) this).field_l = false;
                    ((rm) this).field_c = true;
                    return;
                  } else {
                    ((rm) this).field_e = param1;
                    ((rm) this).field_l = false;
                    ((rm) this).field_c = true;
                    return;
                  }
                } else {
                  if (ei.field_q == -100) {
                    if (-1 <= ((rm) this).field_e) {
                      ((rm) this).field_l = false;
                      ((rm) this).field_c = true;
                      return;
                    } else {
                      ((rm) this).field_e = param1;
                      ((rm) this).field_l = false;
                      ((rm) this).field_c = true;
                      return;
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
            L13: {
              if (0 == ((rm) this).field_d) {
                ((rm) this).field_b = ei.field_q;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (((rm) this).field_d != 0) {
                break L14;
              } else {
                if (-98 != ei.field_q) {
                  break L14;
                } else {
                  L15: {
                    ((rm) this).field_e = ((rm) this).field_e + 1;
                    if (((rm) this).field_e >= ((rm) this).field_m) {
                      ((rm) this).field_e = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  ((rm) this).field_c = true;
                  ((rm) this).field_l = false;
                  break L14;
                }
              }
            }
            if (((rm) this).field_d == 0) {
              L16: {
                if ((ei.field_q ^ -1) == -99) {
                  break L16;
                } else {
                  if (ei.field_q == -100) {
                    break L16;
                  } else {
                    return;
                  }
                }
              }
              if (-1 <= ((rm) this).field_e) {
                ((rm) this).field_l = false;
                ((rm) this).field_c = true;
                return;
              } else {
                ((rm) this).field_e = param1;
                ((rm) this).field_l = false;
                ((rm) this).field_c = true;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean b(int param0) {
        int var2 = -101 / ((50 - param0) / 62);
        return -103 == (((rm) this).field_b ^ -1) ? true : false;
    }

    final boolean c(int param0) {
        if (param0 == 0) {
          if (((rm) this).field_k == 0) {
            if (-85 != ((rm) this).field_b) {
              if (-84 == ((rm) this).field_b) {
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
          return true;
        }
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -97) {
          L0: {
            boolean discarded$10 = ((rm) this).a(2);
            if ((((rm) this).field_b ^ -1) != -97) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((rm) this).field_b ^ -1) != -97) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void b(byte param0) {
        if (param0 > -79) {
          return;
        } else {
          hh.field_g = new String[fc.field_d];
          hh.field_g[21] = am.field_a;
          hh.field_g[6] = oh.field_d;
          hh.field_g[4] = dj.field_a;
          hh.field_g[19] = ti.field_q;
          hh.field_g[15] = hj.field_u;
          hh.field_g[20] = en.field_c;
          hh.field_g[11] = sf.field_b;
          hh.field_g[18] = tc.field_v;
          hh.field_g[7] = rb.field_e;
          hh.field_g[5] = bj.field_f;
          hh.field_g[16] = bh.field_i;
          hh.field_g[17] = nf.field_d;
          hh.field_g[9] = hh.field_e;
          hh.field_g[13] = i.field_c;
          return;
        }
    }

    final void a(boolean param0) {
        ((rm) this).field_b = 0;
        if (param0) {
          L0: {
            ((rm) this).field_c = false;
            ((rm) this).field_k = 0;
            if (((rm) this).field_d == 0) {
              ((rm) this).field_b = ei.field_q;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != ((rm) this).field_d) {
              break L1;
            } else {
              if (ei.field_q == 98) {
                L2: {
                  if (0 >= ((rm) this).field_e) {
                    ((rm) this).field_e = ((rm) this).field_m;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((rm) this).field_e = ((rm) this).field_e - 1;
                ((rm) this).field_l = false;
                ((rm) this).field_c = true;
                break L1;
              } else {
                if (0 == ((rm) this).field_d) {
                  if (99 != ei.field_q) {
                    return;
                  } else {
                    L3: {
                      ((rm) this).field_e = ((rm) this).field_e + 1;
                      if (((rm) this).field_m <= ((rm) this).field_e) {
                        ((rm) this).field_e = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((rm) this).field_l = false;
                    ((rm) this).field_c = true;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (0 == ((rm) this).field_d) {
            if (99 != ei.field_q) {
              return;
            } else {
              L4: {
                ((rm) this).field_e = ((rm) this).field_e + 1;
                if (((rm) this).field_m <= ((rm) this).field_e) {
                  ((rm) this).field_e = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              ((rm) this).field_l = false;
              ((rm) this).field_c = true;
              return;
            }
          } else {
            return;
          }
        } else {
          L5: {
            ((rm) this).a(104, 84);
            ((rm) this).field_c = false;
            ((rm) this).field_k = 0;
            if (((rm) this).field_d == 0) {
              ((rm) this).field_b = ei.field_q;
              break L5;
            } else {
              break L5;
            }
          }
          if (0 == ((rm) this).field_d) {
            L6: {
              if (ei.field_q == 98) {
                L7: {
                  if (0 >= ((rm) this).field_e) {
                    ((rm) this).field_e = ((rm) this).field_m;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((rm) this).field_e = ((rm) this).field_e - 1;
                ((rm) this).field_l = false;
                ((rm) this).field_c = true;
                break L6;
              } else {
                break L6;
              }
            }
            if (0 != ((rm) this).field_d) {
              return;
            } else {
              L8: {
                if (99 == ei.field_q) {
                  L9: {
                    ((rm) this).field_e = ((rm) this).field_e + 1;
                    if (((rm) this).field_m <= ((rm) this).field_e) {
                      ((rm) this).field_e = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((rm) this).field_l = false;
                  ((rm) this).field_c = true;
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            }
          } else {
            if (0 == ((rm) this).field_d) {
              if (99 != ei.field_q) {
                return;
              } else {
                L10: {
                  ((rm) this).field_e = ((rm) this).field_e + 1;
                  if (((rm) this).field_m <= ((rm) this).field_e) {
                    ((rm) this).field_e = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((rm) this).field_l = false;
                ((rm) this).field_c = true;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 51) {
          L0: {
            rm.b((byte) 74);
            if (-98 != ((rm) this).field_b) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-98 != ((rm) this).field_b) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (((rm) this).field_m <= param1) {
          throw new IllegalArgumentException();
        } else {
          if (param2 < ((rm) this).field_m) {
            L0: {
              ((rm) this).field_c = false;
              ((rm) this).field_b = 0;
              ((rm) this).field_k = 0;
              if (lb.field_gc != 0) {
                ((rm) this).field_d = lb.field_gc;
                ((rm) this).field_e = param2;
                ((rm) this).field_k = lb.field_gc;
                ((rm) this).field_a = tc.field_x;
                ((rm) this).field_l = true;
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 != (((rm) this).field_d ^ -1)) {
              L1: {
                if (0 != nc.field_d) {
                  if ((((rm) this).field_a ^ -1) < -1) {
                    ((rm) this).field_a = ((rm) this).field_a - 1;
                    break L1;
                  } else {
                    ((rm) this).field_a = pg.field_B;
                    ((rm) this).field_a = ((rm) this).field_a - 1;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (0 != lb.field_gc) {
                  break L2;
                } else {
                  if (nc.field_d == 0) {
                    ((rm) this).field_d = 0;
                    break L2;
                  } else {
                    if (param0 > 123) {
                      L3: {
                        if (0 != ((rm) this).field_d) {
                          break L3;
                        } else {
                          L4: {
                            if (((rm) this).field_l) {
                              break L4;
                            } else {
                              if (!ik.field_a) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (0 > param1) {
                            if (((rm) this).field_l) {
                              ((rm) this).field_e = -1;
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            if (((rm) this).field_e == param1) {
                              ((rm) this).field_e = param1;
                              ((rm) this).field_l = true;
                              break L3;
                            } else {
                              ((rm) this).field_c = true;
                              ((rm) this).field_e = param1;
                              ((rm) this).field_l = true;
                              break L3;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      L5: {
                        boolean discarded$4 = ((rm) this).d(-13);
                        if (0 != ((rm) this).field_d) {
                          break L5;
                        } else {
                          L6: {
                            if (((rm) this).field_l) {
                              break L6;
                            } else {
                              if (!ik.field_a) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (0 > param1) {
                            if (((rm) this).field_l) {
                              ((rm) this).field_e = -1;
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            if (((rm) this).field_e == param1) {
                              ((rm) this).field_e = param1;
                              ((rm) this).field_l = true;
                              break L5;
                            } else {
                              ((rm) this).field_c = true;
                              ((rm) this).field_e = param1;
                              ((rm) this).field_l = true;
                              break L5;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param0 > 123) {
                if (0 == ((rm) this).field_d) {
                  if (((rm) this).field_l) {
                    if (0 > param1) {
                      if (((rm) this).field_l) {
                        ((rm) this).field_e = -1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (((rm) this).field_e == param1) {
                        ((rm) this).field_e = param1;
                        ((rm) this).field_l = true;
                        return;
                      } else {
                        ((rm) this).field_c = true;
                        ((rm) this).field_e = param1;
                        ((rm) this).field_l = true;
                        return;
                      }
                    }
                  } else {
                    if (ik.field_a) {
                      if (0 > param1) {
                        if (((rm) this).field_l) {
                          ((rm) this).field_e = -1;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (((rm) this).field_e == param1) {
                          ((rm) this).field_e = param1;
                          ((rm) this).field_l = true;
                          return;
                        } else {
                          ((rm) this).field_c = true;
                          ((rm) this).field_e = param1;
                          ((rm) this).field_l = true;
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
              } else {
                boolean discarded$5 = ((rm) this).d(-13);
                if (0 == ((rm) this).field_d) {
                  L7: {
                    if (((rm) this).field_l) {
                      break L7;
                    } else {
                      if (ik.field_a) {
                        break L7;
                      } else {
                        return;
                      }
                    }
                  }
                  if (0 > param1) {
                    if (!((rm) this).field_l) {
                      return;
                    } else {
                      ((rm) this).field_e = -1;
                      return;
                    }
                  } else {
                    if (((rm) this).field_e == param1) {
                      ((rm) this).field_e = param1;
                      ((rm) this).field_l = true;
                      return;
                    } else {
                      ((rm) this).field_c = true;
                      ((rm) this).field_e = param1;
                      ((rm) this).field_l = true;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L8: {
                if (0 != lb.field_gc) {
                  break L8;
                } else {
                  if (nc.field_d == 0) {
                    ((rm) this).field_d = 0;
                    break L8;
                  } else {
                    L9: {
                      if (param0 > 123) {
                        break L9;
                      } else {
                        boolean discarded$6 = ((rm) this).d(-13);
                        break L9;
                      }
                    }
                    L10: {
                      if (0 != ((rm) this).field_d) {
                        break L10;
                      } else {
                        L11: {
                          if (((rm) this).field_l) {
                            break L11;
                          } else {
                            if (!ik.field_a) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (0 > param1) {
                          if (((rm) this).field_l) {
                            ((rm) this).field_e = -1;
                            break L10;
                          } else {
                            break L10;
                          }
                        } else {
                          if (((rm) this).field_e == param1) {
                            ((rm) this).field_e = param1;
                            ((rm) this).field_l = true;
                            break L10;
                          } else {
                            ((rm) this).field_c = true;
                            ((rm) this).field_e = param1;
                            ((rm) this).field_l = true;
                            break L10;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (param0 > 123) {
                if (0 == ((rm) this).field_d) {
                  if (((rm) this).field_l) {
                    if (0 > param1) {
                      if (!((rm) this).field_l) {
                        return;
                      } else {
                        ((rm) this).field_e = -1;
                        return;
                      }
                    } else {
                      if (((rm) this).field_e == param1) {
                        ((rm) this).field_e = param1;
                        ((rm) this).field_l = true;
                        return;
                      } else {
                        ((rm) this).field_c = true;
                        ((rm) this).field_e = param1;
                        ((rm) this).field_l = true;
                        return;
                      }
                    }
                  } else {
                    if (ik.field_a) {
                      L12: {
                        if (0 > param1) {
                          if (((rm) this).field_l) {
                            ((rm) this).field_e = -1;
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          if (((rm) this).field_e == param1) {
                            ((rm) this).field_e = param1;
                            ((rm) this).field_l = true;
                            break L12;
                          } else {
                            ((rm) this).field_c = true;
                            ((rm) this).field_e = param1;
                            ((rm) this).field_l = true;
                            break L12;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L13: {
                  boolean discarded$7 = ((rm) this).d(-13);
                  if (0 != ((rm) this).field_d) {
                    break L13;
                  } else {
                    L14: {
                      if (((rm) this).field_l) {
                        break L14;
                      } else {
                        if (!ik.field_a) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (0 > param1) {
                      if (((rm) this).field_l) {
                        ((rm) this).field_e = -1;
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      if (((rm) this).field_e == param1) {
                        ((rm) this).field_e = param1;
                        ((rm) this).field_l = true;
                        break L13;
                      } else {
                        ((rm) this).field_c = true;
                        ((rm) this).field_e = param1;
                        ((rm) this).field_l = true;
                        break L13;
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

    final void e(byte param0) {
        ((rm) this).field_k = 0;
        if (param0 == 22) {
          ((rm) this).field_b = 0;
          ((rm) this).field_c = false;
          if (((rm) this).field_d == 0) {
            ((rm) this).field_b = ei.field_q;
            return;
          } else {
            return;
          }
        } else {
          boolean discarded$2 = ((rm) this).d(51);
          ((rm) this).field_b = 0;
          ((rm) this).field_c = false;
          if (((rm) this).field_d != 0) {
            return;
          } else {
            ((rm) this).field_b = ei.field_q;
            return;
          }
        }
    }

    final boolean a(byte param0) {
        int var2 = 22 % ((param0 - -5) / 55);
        return 103 == ((rm) this).field_b ? true : false;
    }

    public static void d(byte param0) {
        field_j = null;
        field_h = null;
        if (param0 != -18) {
            return;
        }
        field_i = null;
        field_o = null;
    }

    rm(int param0) {
        ((rm) this).field_e = 0;
        ((rm) this).field_l = false;
        ((rm) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_p = true;
        field_o = new String[]{"Showing by rating", "Showing by win percentage"};
        field_n = 2048;
        field_i = "Location";
        field_h = new int[129];
        field_h[0] = 0;
        for (var0 = 0; -65 < (var0 ^ -1); var0++) {
            field_h[var0 + 1] = 257 * (var0 * 255 / 64);
            field_h[var0 + 65] = 65793 * (var0 * 255 / 64);
        }
    }
}
