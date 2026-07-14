/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    private int field_f;
    private int field_c;
    private int field_e;
    int field_b;
    int field_g;
    private int field_a;
    private boolean field_d;

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          if (((jn) this).field_f == 0) {
            if ((((jn) this).field_c ^ -1) != -85) {
              if (83 == ((jn) this).field_c) {
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
          ((jn) this).field_a = 15;
          if (((jn) this).field_f == 0) {
            if ((((jn) this).field_c ^ -1) == -85) {
              return true;
            } else {
              L0: {
                if (83 != ((jn) this).field_c) {
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

    final static void a(int param0, vn param1, int param2, int param3) {
        if (param3 != 0) {
            return;
        }
        bi.field_g = param0;
        em.field_j = param2;
        nc.field_c = param1;
    }

    final void a(byte param0, int param1) {
        ((jn) this).field_f = 0;
        if (param0 == -21) {
          ((jn) this).field_c = 0;
          if (((jn) this).field_a != -1) {
            L0: {
              if (-1 != (((jn) this).field_a ^ -1)) {
                break L0;
              } else {
                if ((aa.field_n ^ -1) == -97) {
                  L1: {
                    if (((jn) this).field_g <= 0) {
                      ((jn) this).field_g = ((jn) this).field_b;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((jn) this).field_g = ((jn) this).field_g - 1;
                  ((jn) this).field_d = false;
                  break L0;
                } else {
                  if (((jn) this).field_a == -1) {
                    if (-98 == aa.field_n) {
                      ((jn) this).field_g = ((jn) this).field_g + 1;
                      ((jn) this).field_d = false;
                      if (((jn) this).field_g >= ((jn) this).field_b) {
                        ((jn) this).field_g = 0;
                        if (-1 == (((jn) this).field_a ^ -1)) {
                          L2: {
                            if (aa.field_n == 98) {
                              break L2;
                            } else {
                              if (99 == aa.field_n) {
                                break L2;
                              } else {
                                return;
                              }
                            }
                          }
                          if (0 <= ((jn) this).field_g) {
                            ((jn) this).field_d = false;
                            return;
                          } else {
                            ((jn) this).field_g = param1;
                            ((jn) this).field_d = false;
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (-1 == (((jn) this).field_a ^ -1)) {
                          L3: {
                            if (aa.field_n == 98) {
                              break L3;
                            } else {
                              if (99 == aa.field_n) {
                                break L3;
                              } else {
                                return;
                              }
                            }
                          }
                          if (0 <= ((jn) this).field_g) {
                            ((jn) this).field_d = false;
                            return;
                          } else {
                            ((jn) this).field_g = param1;
                            ((jn) this).field_d = false;
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (-1 == ((jn) this).field_a) {
                        L4: {
                          if (aa.field_n == 98) {
                            break L4;
                          } else {
                            if (99 == aa.field_n) {
                              break L4;
                            } else {
                              return;
                            }
                          }
                        }
                        if (0 <= ((jn) this).field_g) {
                          ((jn) this).field_d = false;
                          return;
                        } else {
                          ((jn) this).field_g = param1;
                          ((jn) this).field_d = false;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (-1 == ((jn) this).field_a) {
                      L5: {
                        if (aa.field_n == 98) {
                          break L5;
                        } else {
                          if (99 == aa.field_n) {
                            break L5;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 <= ((jn) this).field_g) {
                        ((jn) this).field_d = false;
                        return;
                      } else {
                        ((jn) this).field_g = param1;
                        ((jn) this).field_d = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            L6: {
              if (((jn) this).field_a != -1) {
                break L6;
              } else {
                if (-98 == aa.field_n) {
                  ((jn) this).field_g = ((jn) this).field_g + 1;
                  ((jn) this).field_d = false;
                  if (((jn) this).field_g < ((jn) this).field_b) {
                    break L6;
                  } else {
                    ((jn) this).field_g = 0;
                    if (-1 == (((jn) this).field_a ^ -1)) {
                      L7: {
                        if (aa.field_n == 98) {
                          break L7;
                        } else {
                          if (99 == aa.field_n) {
                            break L7;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 <= ((jn) this).field_g) {
                        ((jn) this).field_d = false;
                        return;
                      } else {
                        ((jn) this).field_g = param1;
                        ((jn) this).field_d = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  if (-1 == (((jn) this).field_a ^ -1)) {
                    L8: {
                      if (aa.field_n == 98) {
                        break L8;
                      } else {
                        if (99 == aa.field_n) {
                          break L8;
                        } else {
                          return;
                        }
                      }
                    }
                    if (0 <= ((jn) this).field_g) {
                      ((jn) this).field_d = false;
                      return;
                    } else {
                      ((jn) this).field_g = param1;
                      ((jn) this).field_d = false;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (-1 == (((jn) this).field_a ^ -1)) {
              L9: {
                if (aa.field_n == 98) {
                  break L9;
                } else {
                  if (99 == aa.field_n) {
                    break L9;
                  } else {
                    return;
                  }
                }
              }
              if (0 <= ((jn) this).field_g) {
                ((jn) this).field_d = false;
                return;
              } else {
                ((jn) this).field_g = param1;
                ((jn) this).field_d = false;
                return;
              }
            } else {
              return;
            }
          } else {
            ((jn) this).field_c = aa.field_n;
            if (-1 == ((jn) this).field_a) {
              L10: {
                if ((aa.field_n ^ -1) == -97) {
                  L11: {
                    if (((jn) this).field_g <= 0) {
                      ((jn) this).field_g = ((jn) this).field_b;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ((jn) this).field_g = ((jn) this).field_g - 1;
                  ((jn) this).field_d = false;
                  break L10;
                } else {
                  break L10;
                }
              }
              if (((jn) this).field_a == -1) {
                L12: {
                  if (-98 == (aa.field_n ^ -1)) {
                    ((jn) this).field_g = ((jn) this).field_g + 1;
                    ((jn) this).field_d = false;
                    if (((jn) this).field_g < ((jn) this).field_b) {
                      break L12;
                    } else {
                      ((jn) this).field_g = 0;
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                if (-1 == (((jn) this).field_a ^ -1)) {
                  L13: {
                    if (aa.field_n == 98) {
                      break L13;
                    } else {
                      if (99 == aa.field_n) {
                        break L13;
                      } else {
                        return;
                      }
                    }
                  }
                  if (0 <= ((jn) this).field_g) {
                    ((jn) this).field_d = false;
                    return;
                  } else {
                    ((jn) this).field_g = param1;
                    ((jn) this).field_d = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (-1 == ((jn) this).field_a) {
                  L14: {
                    if (aa.field_n == 98) {
                      break L14;
                    } else {
                      if (99 == aa.field_n) {
                        break L14;
                      } else {
                        return;
                      }
                    }
                  }
                  if (0 <= ((jn) this).field_g) {
                    ((jn) this).field_d = false;
                    return;
                  } else {
                    ((jn) this).field_g = param1;
                    ((jn) this).field_d = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L15: {
                if (((jn) this).field_a != -1) {
                  break L15;
                } else {
                  if (-98 == aa.field_n) {
                    ((jn) this).field_g = ((jn) this).field_g + 1;
                    ((jn) this).field_d = false;
                    if (((jn) this).field_g < ((jn) this).field_b) {
                      break L15;
                    } else {
                      ((jn) this).field_g = 0;
                      break L15;
                    }
                  } else {
                    break L15;
                  }
                }
              }
              if (-1 == (((jn) this).field_a ^ -1)) {
                L16: {
                  if (aa.field_n == 98) {
                    break L16;
                  } else {
                    if (99 == aa.field_n) {
                      break L16;
                    } else {
                      return;
                    }
                  }
                }
                if (0 <= ((jn) this).field_g) {
                  ((jn) this).field_d = false;
                  return;
                } else {
                  ((jn) this).field_g = param1;
                  ((jn) this).field_d = false;
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (((jn) this).field_b > param1) {
          if (param0 < ((jn) this).field_b) {
            ((jn) this).field_f = 0;
            ((jn) this).field_c = 0;
            if (param2 == 4) {
              L0: {
                if (gg.field_J != 0) {
                  ((jn) this).field_a = gg.field_J;
                  ((jn) this).field_e = fc.field_d;
                  ((jn) this).field_d = true;
                  ((jn) this).field_f = gg.field_J;
                  ((jn) this).field_g = param0;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (0 == ((jn) this).field_a) {
                  break L1;
                } else {
                  if (rd.field_f != 0) {
                    L2: {
                      if (((jn) this).field_e <= 0) {
                        ((jn) this).field_e = tl.field_x;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((jn) this).field_e = ((jn) this).field_e - 1;
                    break L1;
                  } else {
                    if (gg.field_J == -1) {
                      if (rd.field_f == -1) {
                        ((jn) this).field_a = 0;
                        if (((jn) this).field_a == 0) {
                          L3: {
                            L4: {
                              if (((jn) this).field_d) {
                                break L4;
                              } else {
                                if (na.field_k) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            if (-1 < (param1 ^ -1)) {
                              if (((jn) this).field_d) {
                                ((jn) this).field_g = -1;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (((jn) this).field_g == param1) {
                                ((jn) this).field_d = true;
                                ((jn) this).field_g = param1;
                                break L3;
                              } else {
                                ((jn) this).field_d = true;
                                ((jn) this).field_g = param1;
                                return;
                              }
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L5: {
                          if (((jn) this).field_a != 0) {
                            break L5;
                          } else {
                            L6: {
                              if (((jn) this).field_d) {
                                break L6;
                              } else {
                                if (na.field_k) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (-1 > param1) {
                              if (!((jn) this).field_d) {
                                break L5;
                              } else {
                                ((jn) this).field_g = -1;
                                break L5;
                              }
                            } else {
                              if (((jn) this).field_g == param1) {
                                ((jn) this).field_d = true;
                                ((jn) this).field_g = param1;
                                break L5;
                              } else {
                                ((jn) this).field_d = true;
                                ((jn) this).field_g = param1;
                                break L5;
                              }
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L7: {
                        if (((jn) this).field_a != 0) {
                          break L7;
                        } else {
                          L8: {
                            if (((jn) this).field_d) {
                              break L8;
                            } else {
                              if (na.field_k) {
                                break L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (-1 > param1) {
                            if (!((jn) this).field_d) {
                              break L7;
                            } else {
                              ((jn) this).field_g = -1;
                              break L7;
                            }
                          } else {
                            if (((jn) this).field_g == param1) {
                              ((jn) this).field_d = true;
                              ((jn) this).field_g = param1;
                              break L7;
                            } else {
                              ((jn) this).field_d = true;
                              ((jn) this).field_g = param1;
                              break L7;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L9: {
                if (gg.field_J != 0) {
                  break L9;
                } else {
                  if (rd.field_f != -1) {
                    break L9;
                  } else {
                    ((jn) this).field_a = 0;
                    if (((jn) this).field_a == 0) {
                      L10: {
                        if (((jn) this).field_d) {
                          break L10;
                        } else {
                          if (na.field_k) {
                            break L10;
                          } else {
                            return;
                          }
                        }
                      }
                      if (-1 > param1) {
                        if (((jn) this).field_d) {
                          ((jn) this).field_g = -1;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (((jn) this).field_g == param1) {
                          ((jn) this).field_d = true;
                          ((jn) this).field_g = param1;
                          return;
                        } else {
                          ((jn) this).field_d = true;
                          ((jn) this).field_g = param1;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (((jn) this).field_a == 0) {
                L11: {
                  if (((jn) this).field_d) {
                    break L11;
                  } else {
                    if (na.field_k) {
                      break L11;
                    } else {
                      return;
                    }
                  }
                }
                if (-1 < (param1 ^ -1)) {
                  if (((jn) this).field_d) {
                    ((jn) this).field_g = -1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (((jn) this).field_g == param1) {
                    ((jn) this).field_d = true;
                    ((jn) this).field_g = param1;
                    return;
                  } else {
                    ((jn) this).field_d = true;
                    ((jn) this).field_g = param1;
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final static boolean a(byte param0) {
        if (param0 == -30) {
          if (10 <= bk.field_w) {
            if ((pf.field_d ^ -1) > -14) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void b(int param0) {
        L0: {
          ((jn) this).field_f = 0;
          ((jn) this).field_c = 0;
          if (param0 == ((jn) this).field_a) {
            ((jn) this).field_c = aa.field_n;
            break L0;
          } else {
            break L0;
          }
        }
        if (-1 == ((jn) this).field_a) {
          if (aa.field_n == 98) {
            if (((jn) this).field_g > 0) {
              L1: {
                ((jn) this).field_g = ((jn) this).field_g - 1;
                ((jn) this).field_d = false;
                if (0 != ((jn) this).field_a) {
                  break L1;
                } else {
                  if (99 != aa.field_n) {
                    break L1;
                  } else {
                    L2: {
                      ((jn) this).field_g = ((jn) this).field_g + 1;
                      if (((jn) this).field_g >= ((jn) this).field_b) {
                        ((jn) this).field_g = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((jn) this).field_d = false;
                    break L1;
                  }
                }
              }
              return;
            } else {
              ((jn) this).field_g = ((jn) this).field_b;
              L3: {
                ((jn) this).field_g = ((jn) this).field_g - 1;
                ((jn) this).field_d = false;
                if (0 != ((jn) this).field_a) {
                  break L3;
                } else {
                  if (99 != aa.field_n) {
                    break L3;
                  } else {
                    L4: {
                      ((jn) this).field_g = ((jn) this).field_g + 1;
                      if (((jn) this).field_g >= ((jn) this).field_b) {
                        ((jn) this).field_g = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((jn) this).field_d = false;
                    break L3;
                  }
                }
              }
              return;
            }
          } else {
            if (0 == ((jn) this).field_a) {
              if (99 != aa.field_n) {
                return;
              } else {
                L5: {
                  ((jn) this).field_g = ((jn) this).field_g + 1;
                  if (((jn) this).field_g >= ((jn) this).field_b) {
                    ((jn) this).field_g = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((jn) this).field_d = false;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L6: {
            if (0 != ((jn) this).field_a) {
              break L6;
            } else {
              if (99 != aa.field_n) {
                break L6;
              } else {
                L7: {
                  ((jn) this).field_g = ((jn) this).field_g + 1;
                  if (((jn) this).field_g >= ((jn) this).field_b) {
                    ((jn) this).field_g = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((jn) this).field_d = false;
                break L6;
              }
            }
          }
          return;
        }
    }

    final static void a(gn param0, int param1, gn param2) {
        if (param1 > -8) {
          boolean discarded$1 = jn.a((byte) -64);
          gh.field_n = new vi[7];
          pd.field_f = param2;
          em.field_m = new String[7];
          i.field_k = new vi[7];
          bd.field_Q = param0;
          em.field_m[0] = "holdtheline_title";
          em.field_m[5] = "holdtheline_alpine";
          em.field_m[1] = "holdtheline_victory_jingle";
          ab.field_jb = -1;
          oc.field_a = 7;
          em.field_m[4] = "holdtheline_desert";
          bi.field_e = 0;
          em.field_m[6] = "holdtheline_urban";
          em.field_m[2] = "holdtheline_lose_jingle";
          em.field_m[3] = "holdtheline_classic";
          return;
        } else {
          gh.field_n = new vi[7];
          pd.field_f = param2;
          em.field_m = new String[7];
          i.field_k = new vi[7];
          bd.field_Q = param0;
          em.field_m[0] = "holdtheline_title";
          em.field_m[5] = "holdtheline_alpine";
          em.field_m[1] = "holdtheline_victory_jingle";
          ab.field_jb = -1;
          oc.field_a = 7;
          em.field_m[4] = "holdtheline_desert";
          bi.field_e = 0;
          em.field_m[6] = "holdtheline_urban";
          em.field_m[2] = "holdtheline_lose_jingle";
          em.field_m[3] = "holdtheline_classic";
          return;
        }
    }

    final static int a(int param0, byte param1, da param2) {
        int var3 = 0;
        var3 = param2.h(param0, 7);
        if (param1 != -96) {
          return -57;
        } else {
          L0: {
            if ((1 << param0) - 1 == var3) {
              var3 = -1;
              break L0;
            } else {
              break L0;
            }
          }
          return var3;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
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
          if (!param2) {
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
        ((jn) this).field_d = stackIn_3_1 != 0;
        ((jn) this).field_a = param1;
        if (!((jn) this).field_d) {
          ((jn) this).field_g = param3;
          return;
        } else {
          ((jn) this).field_g = param0;
          return;
        }
    }

    jn(int param0) {
        ((jn) this).field_g = 0;
        ((jn) this).field_d = false;
        ((jn) this).field_b = param0;
    }

    static {
    }
}
