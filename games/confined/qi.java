/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String field_d;
    private int field_g;
    int field_k;
    private int field_c;
    private boolean field_e;
    private int field_l;
    private int field_a;
    private int field_f;
    int field_i;
    static int[] field_h;
    static String field_j;
    boolean field_b;

    final boolean g(byte param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = -31 / ((-57 - param0) / 37);
        if (((qi) this).field_c != 2) {
          if ((((qi) this).field_l ^ -1) == -97) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    final boolean e(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 105) {
          L0: {
            ((qi) this).a(false, -78, -113);
            if (-97 != ((qi) this).field_l) {
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
            if (-97 != ((qi) this).field_l) {
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

    final void c(int param0) {
        ((qi) this).field_c = 0;
        ((qi) this).field_b = false;
        ((qi) this).field_f = 0;
        ((qi) this).field_l = 0;
        if (((qi) this).field_a == 0) {
          if (98 == gk.field_r) {
            if (-1 > (((qi) this).field_i ^ -1)) {
              L0: {
                ((qi) this).field_i = ((qi) this).field_i - 1;
                ((qi) this).field_e = false;
                ((qi) this).field_b = true;
                if (((qi) this).field_a == -1) {
                  ((qi) this).field_l = gk.field_r;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (param0 == ((qi) this).field_a) {
                if (-100 != (gk.field_r ^ -1)) {
                  return;
                } else {
                  L1: {
                    ((qi) this).field_i = ((qi) this).field_i + 1;
                    if (((qi) this).field_k <= ((qi) this).field_i) {
                      ((qi) this).field_i = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((qi) this).field_e = false;
                  ((qi) this).field_b = true;
                  return;
                }
              } else {
                return;
              }
            } else {
              ((qi) this).field_i = ((qi) this).field_k;
              L2: {
                ((qi) this).field_i = ((qi) this).field_i - 1;
                ((qi) this).field_e = false;
                ((qi) this).field_b = true;
                if (((qi) this).field_a == -1) {
                  ((qi) this).field_l = gk.field_r;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (param0 == ((qi) this).field_a) {
                if (-100 != (gk.field_r ^ -1)) {
                  return;
                } else {
                  L3: {
                    ((qi) this).field_i = ((qi) this).field_i + 1;
                    if (((qi) this).field_k <= ((qi) this).field_i) {
                      ((qi) this).field_i = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((qi) this).field_e = false;
                  ((qi) this).field_b = true;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L4: {
              if (((qi) this).field_a == -1) {
                ((qi) this).field_l = gk.field_r;
                break L4;
              } else {
                break L4;
              }
            }
            if (param0 == ((qi) this).field_a) {
              if (-100 != (gk.field_r ^ -1)) {
                return;
              } else {
                L5: {
                  ((qi) this).field_i = ((qi) this).field_i + 1;
                  if (((qi) this).field_k <= ((qi) this).field_i) {
                    ((qi) this).field_i = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((qi) this).field_e = false;
                ((qi) this).field_b = true;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L6: {
            if (((qi) this).field_a == -1) {
              ((qi) this).field_l = gk.field_r;
              break L6;
            } else {
              break L6;
            }
          }
          if (param0 == ((qi) this).field_a) {
            if (-100 != (gk.field_r ^ -1)) {
              return;
            } else {
              L7: {
                ((qi) this).field_i = ((qi) this).field_i + 1;
                if (((qi) this).field_k <= ((qi) this).field_i) {
                  ((qi) this).field_i = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
              ((qi) this).field_e = false;
              ((qi) this).field_b = true;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1) {
        if (param1 == (((qi) this).field_a ^ -1)) {
            ((qi) this).field_b = true;
            ((qi) this).field_e = false;
            ((qi) this).field_i = param0;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param2 < ((qi) this).field_k) {
          if (((qi) this).field_k > param1) {
            ((qi) this).field_c = 0;
            ((qi) this).field_l = 0;
            ((qi) this).field_b = false;
            ((qi) this).field_f = 0;
            if (param0) {
              if (0 == rh.field_X) {
                L0: {
                  if (-1 == (((qi) this).field_a ^ -1)) {
                    break L0;
                  } else {
                    if (Confined.field_I != 0) {
                      L1: {
                        if ((((qi) this).field_g ^ -1) >= -1) {
                          ((qi) this).field_g = gd.field_u;
                          ((qi) this).field_c = ((qi) this).field_a;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      ((qi) this).field_g = ((qi) this).field_g - 1;
                      break L0;
                    } else {
                      L2: {
                        if (0 != rh.field_X) {
                          break L2;
                        } else {
                          if (Confined.field_I != 0) {
                            break L2;
                          } else {
                            ((qi) this).field_a = 0;
                            if (0 != ((qi) this).field_a) {
                              return;
                            } else {
                              if (!((qi) this).field_e) {
                                if (!hn.field_D) {
                                  return;
                                } else {
                                  if (param2 < 0) {
                                    if (((qi) this).field_e) {
                                      ((qi) this).field_i = -1;
                                      return;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    L3: {
                                      if (((qi) this).field_i != param2) {
                                        ((qi) this).field_b = true;
                                        break L3;
                                      } else {
                                        break L3;
                                      }
                                    }
                                    ((qi) this).field_e = true;
                                    ((qi) this).field_i = param2;
                                    return;
                                  }
                                }
                              } else {
                                if (param2 < 0) {
                                  if (((qi) this).field_e) {
                                    ((qi) this).field_i = -1;
                                    return;
                                  } else {
                                    return;
                                  }
                                } else {
                                  L4: {
                                    if (((qi) this).field_i != param2) {
                                      ((qi) this).field_b = true;
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  ((qi) this).field_e = true;
                                  ((qi) this).field_i = param2;
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (0 != ((qi) this).field_a) {
                        return;
                      } else {
                        if (!((qi) this).field_e) {
                          if (!hn.field_D) {
                            return;
                          } else {
                            if (param2 < 0) {
                              if (((qi) this).field_e) {
                                ((qi) this).field_i = -1;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              L5: {
                                if (((qi) this).field_i != param2) {
                                  ((qi) this).field_b = true;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              ((qi) this).field_e = true;
                              ((qi) this).field_i = param2;
                              return;
                            }
                          }
                        } else {
                          if (param2 < 0) {
                            if (((qi) this).field_e) {
                              ((qi) this).field_i = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            L6: {
                              if (((qi) this).field_i != param2) {
                                ((qi) this).field_b = true;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            ((qi) this).field_e = true;
                            ((qi) this).field_i = param2;
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                L7: {
                  if (0 != rh.field_X) {
                    break L7;
                  } else {
                    if (Confined.field_I != 0) {
                      break L7;
                    } else {
                      L8: {
                        ((qi) this).field_a = 0;
                        if (0 != ((qi) this).field_a) {
                          break L8;
                        } else {
                          L9: {
                            if (((qi) this).field_e) {
                              break L9;
                            } else {
                              if (hn.field_D) {
                                break L9;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param2 < 0) {
                            if (((qi) this).field_e) {
                              ((qi) this).field_i = -1;
                              break L8;
                            } else {
                              return;
                            }
                          } else {
                            L10: {
                              if (((qi) this).field_i != param2) {
                                ((qi) this).field_b = true;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            ((qi) this).field_e = true;
                            ((qi) this).field_i = param2;
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L11: {
                  if (0 != ((qi) this).field_a) {
                    break L11;
                  } else {
                    L12: {
                      if (((qi) this).field_e) {
                        break L12;
                      } else {
                        if (hn.field_D) {
                          break L12;
                        } else {
                          return;
                        }
                      }
                    }
                    if (param2 < 0) {
                      if (((qi) this).field_e) {
                        ((qi) this).field_i = -1;
                        break L11;
                      } else {
                        return;
                      }
                    } else {
                      L13: {
                        if (((qi) this).field_i != param2) {
                          ((qi) this).field_b = true;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      ((qi) this).field_e = true;
                      ((qi) this).field_i = param2;
                      return;
                    }
                  }
                }
                return;
              } else {
                ((qi) this).field_i = param1;
                ((qi) this).field_c = rh.field_X;
                ((qi) this).field_f = rh.field_X;
                ((qi) this).field_a = rh.field_X;
                ((qi) this).field_g = em.field_a;
                ((qi) this).field_e = true;
                if (-1 != (((qi) this).field_a ^ -1)) {
                  L14: {
                    if (Confined.field_I != 0) {
                      L15: {
                        if ((((qi) this).field_g ^ -1) >= -1) {
                          ((qi) this).field_g = gd.field_u;
                          ((qi) this).field_c = ((qi) this).field_a;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      ((qi) this).field_g = ((qi) this).field_g - 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  if (0 == rh.field_X) {
                    if (Confined.field_I != 0) {
                      if (0 == ((qi) this).field_a) {
                        L16: {
                          if (((qi) this).field_e) {
                            break L16;
                          } else {
                            if (hn.field_D) {
                              break L16;
                            } else {
                              return;
                            }
                          }
                        }
                        if (param2 < 0) {
                          if (((qi) this).field_e) {
                            ((qi) this).field_i = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L17: {
                            if (((qi) this).field_i != param2) {
                              ((qi) this).field_b = true;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          ((qi) this).field_e = true;
                          ((qi) this).field_i = param2;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L18: {
                        ((qi) this).field_a = 0;
                        if (0 != ((qi) this).field_a) {
                          break L18;
                        } else {
                          L19: {
                            if (((qi) this).field_e) {
                              break L19;
                            } else {
                              if (hn.field_D) {
                                break L19;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if (param2 < 0) {
                            if (((qi) this).field_e) {
                              ((qi) this).field_i = -1;
                              break L18;
                            } else {
                              break L18;
                            }
                          } else {
                            L20: {
                              if (((qi) this).field_i != param2) {
                                ((qi) this).field_b = true;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            ((qi) this).field_e = true;
                            ((qi) this).field_i = param2;
                            break L18;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    if (0 == ((qi) this).field_a) {
                      L21: {
                        L22: {
                          if (((qi) this).field_e) {
                            break L22;
                          } else {
                            if (hn.field_D) {
                              break L22;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (param2 < 0) {
                          if (!((qi) this).field_e) {
                            return;
                          } else {
                            ((qi) this).field_i = -1;
                            return;
                          }
                        } else {
                          L23: {
                            if (((qi) this).field_i != param2) {
                              ((qi) this).field_b = true;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          ((qi) this).field_e = true;
                          ((qi) this).field_i = param2;
                          break L21;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L24: {
                    if (0 != rh.field_X) {
                      break L24;
                    } else {
                      if (Confined.field_I != 0) {
                        break L24;
                      } else {
                        ((qi) this).field_a = 0;
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (0 != ((qi) this).field_a) {
                      break L25;
                    } else {
                      L26: {
                        if (((qi) this).field_e) {
                          break L26;
                        } else {
                          if (hn.field_D) {
                            break L26;
                          } else {
                            break L25;
                          }
                        }
                      }
                      if (param2 < 0) {
                        if (((qi) this).field_e) {
                          ((qi) this).field_i = -1;
                          break L25;
                        } else {
                          break L25;
                        }
                      } else {
                        L27: {
                          if (((qi) this).field_i != param2) {
                            ((qi) this).field_b = true;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        ((qi) this).field_e = true;
                        ((qi) this).field_i = param2;
                        break L25;
                      }
                    }
                  }
                  return;
                }
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

    final boolean b(int param0) {
        int var2 = 23 / ((53 - param0) / 59);
        return -98 == (((qi) this).field_l ^ -1) ? true : false;
    }

    final boolean f(byte param0) {
        if (param0 > -35) {
            return true;
        }
        return -1 != (((qi) this).field_a ^ -1) ? true : false;
    }

    final void h(byte param0) {
        if (param0 == -128) {
          ((qi) this).field_f = 0;
          ((qi) this).field_b = false;
          ((qi) this).field_l = 0;
          ((qi) this).field_c = 0;
          if (-1 == (((qi) this).field_a ^ -1)) {
            ((qi) this).field_l = gk.field_r;
            return;
          } else {
            return;
          }
        } else {
          boolean discarded$2 = ((qi) this).b(126);
          ((qi) this).field_f = 0;
          ((qi) this).field_b = false;
          ((qi) this).field_l = 0;
          ((qi) this).field_c = 0;
          if (-1 != (((qi) this).field_a ^ -1)) {
            return;
          } else {
            ((qi) this).field_l = gk.field_r;
            return;
          }
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
            field_h = null;
            if ((((qi) this).field_l ^ -1) != -103) {
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
            if ((((qi) this).field_l ^ -1) != -103) {
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

    final boolean c(byte param0) {
        int var2 = 56 / ((param0 - -46) / 60);
        return (((qi) this).field_l ^ -1) == -104 ? true : false;
    }

    final boolean b(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 36) {
          if (((qi) this).field_c != 1) {
            if (((qi) this).field_l != 97) {
              if (84 != ((qi) this).field_l) {
                if (-84 == (((qi) this).field_l ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ((qi) this).c(11);
          if (((qi) this).field_c != 1) {
            if (((qi) this).field_l != 97) {
              if (84 != ((qi) this).field_l) {
                if (-84 == (((qi) this).field_l ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
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
          ((qi) this).field_a = param1;
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
        ((qi) this).field_e = stackIn_3_1 != 0;
        if (!((qi) this).field_e) {
          ((qi) this).field_i = param2;
          return;
        } else {
          ((qi) this).field_i = param3;
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param2 > -73) {
          return;
        } else {
          L0: {
            ((qi) this).field_a = 0;
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          L1: {
            ((qi) this).field_e = stackIn_4_1 != 0;
            if (((qi) this).field_e) {
              ((qi) this).field_i = param0;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public qi() {
        ((qi) this).field_e = false;
        ((qi) this).field_i = 0;
    }

    qi(int param0) {
        ((qi) this).field_e = false;
        ((qi) this).field_i = 0;
        ((qi) this).field_k = param0;
    }

    public static void a(byte param0) {
        if (param0 != 46) {
          qi.a((byte) 112);
          field_d = null;
          field_h = null;
          field_j = null;
          return;
        } else {
          field_d = null;
          field_h = null;
          field_j = null;
          return;
        }
    }

    final boolean d(byte param0) {
        if (param0 == 55) {
          if (((qi) this).field_f == 0) {
            if (84 != ((qi) this).field_l) {
              if (((qi) this).field_l == 83) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<col=FFFFFF>Energy weapons:</col> awarded at various levels, or if you've lost or missed one.";
        field_j = "Age:";
        field_h = new int[]{5, 9, 13, 17, 21};
    }
}
