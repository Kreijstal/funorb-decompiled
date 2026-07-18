/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private int field_k;
    private int field_l;
    int field_e;
    private int field_m;
    boolean field_a;
    static ja field_h;
    static qj field_c;
    static int field_b;
    private int field_d;
    private int field_f;
    int field_i;
    static boolean field_j;
    static int field_g;

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          if (0 == ((cd) this).field_d) {
            if (84 != ((cd) this).field_f) {
              if (((cd) this).field_f == 83) {
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
          ((cd) this).a(104, 14, true, 13);
          if (0 == ((cd) this).field_d) {
            if (84 == ((cd) this).field_f) {
              return true;
            } else {
              L0: {
                if (-84 != ((cd) this).field_f) {
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

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = this.a(param1, fg.field_a, param4, -85, param0, param2, kf.field_b);
        var7 = this.a(param1, wg.field_e, param4, -85, param0, param2, db.field_X);
        if (param3) {
          int discarded$2 = this.a(-49, 68, -96, -111, -56, 63, 114);
          ((cd) this).a(-126, var6, var7);
          return;
        } else {
          ((cd) this).a(-126, var6, var7);
          return;
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((cd) this).b((byte) -61);
            if (((cd) this).field_f != 102) {
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
            if (((cd) this).field_f != 102) {
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

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            ((cd) this).field_d = 58;
            if (((cd) this).field_l == 0) {
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
            if (((cd) this).field_l == 0) {
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

    final void a(byte param0) {
        ((cd) this).field_f = 0;
        ((cd) this).field_m = 0;
        ((cd) this).field_d = 0;
        if (0 != ((cd) this).field_l) {
          if (param0 >= 10) {
            L0: {
              if (0 != ((cd) this).field_l) {
                break L0;
              } else {
                if (kg.field_d == 96) {
                  L1: {
                    if (((cd) this).field_e <= 0) {
                      ((cd) this).field_e = ((cd) this).field_i;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((cd) this).field_a = false;
                  ((cd) this).field_e = ((cd) this).field_e - 1;
                  break L0;
                } else {
                  if (0 == ((cd) this).field_l) {
                    if (kg.field_d == 97) {
                      ((cd) this).field_e = ((cd) this).field_e + 1;
                      ((cd) this).field_a = false;
                      if (((cd) this).field_e >= ((cd) this).field_i) {
                        ((cd) this).field_e = 0;
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
                }
              }
            }
            if (0 == ((cd) this).field_l) {
              if (kg.field_d == 97) {
                ((cd) this).field_e = ((cd) this).field_e + 1;
                ((cd) this).field_a = false;
                if (((cd) this).field_e < ((cd) this).field_i) {
                  return;
                } else {
                  ((cd) this).field_e = 0;
                  return;
                }
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
          ((cd) this).field_f = kg.field_d;
          if (param0 >= 10) {
            if (0 == ((cd) this).field_l) {
              L2: {
                if (kg.field_d == 96) {
                  L3: {
                    if (((cd) this).field_e <= 0) {
                      ((cd) this).field_e = ((cd) this).field_i;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((cd) this).field_a = false;
                  ((cd) this).field_e = ((cd) this).field_e - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (0 == ((cd) this).field_l) {
                if (kg.field_d == 97) {
                  ((cd) this).field_e = ((cd) this).field_e + 1;
                  ((cd) this).field_a = false;
                  if (((cd) this).field_e >= ((cd) this).field_i) {
                    ((cd) this).field_e = 0;
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
              if (0 == ((cd) this).field_l) {
                if (kg.field_d == 97) {
                  ((cd) this).field_e = ((cd) this).field_e + 1;
                  ((cd) this).field_a = false;
                  if (((cd) this).field_e >= ((cd) this).field_i) {
                    ((cd) this).field_e = 0;
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
            }
          } else {
            return;
          }
        }
    }

    final void b(byte param0) {
        if (param0 <= -52) {
          ((cd) this).field_m = 0;
          ((cd) this).field_d = 0;
          ((cd) this).field_f = 0;
          if (((cd) this).field_l == 0) {
            ((cd) this).field_f = kg.field_d;
            if (0 == ((cd) this).field_l) {
              if (kg.field_d != 98) {
                L0: {
                  if (((cd) this).field_l != 0) {
                    break L0;
                  } else {
                    if (99 != kg.field_d) {
                      break L0;
                    } else {
                      L1: {
                        ((cd) this).field_e = ((cd) this).field_e + 1;
                        if (((cd) this).field_e >= ((cd) this).field_i) {
                          ((cd) this).field_e = 0;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      ((cd) this).field_a = false;
                      break L0;
                    }
                  }
                }
                return;
              } else {
                L2: {
                  if (((cd) this).field_e <= 0) {
                    ((cd) this).field_e = ((cd) this).field_i;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  ((cd) this).field_a = false;
                  ((cd) this).field_e = ((cd) this).field_e - 1;
                  if (((cd) this).field_l != 0) {
                    break L3;
                  } else {
                    if (99 != kg.field_d) {
                      break L3;
                    } else {
                      L4: {
                        ((cd) this).field_e = ((cd) this).field_e + 1;
                        if (((cd) this).field_e >= ((cd) this).field_i) {
                          ((cd) this).field_e = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((cd) this).field_a = false;
                      break L3;
                    }
                  }
                }
                return;
              }
            } else {
              if (((cd) this).field_l == 0) {
                if (99 != kg.field_d) {
                  return;
                } else {
                  L5: {
                    ((cd) this).field_e = ((cd) this).field_e + 1;
                    if (((cd) this).field_e >= ((cd) this).field_i) {
                      ((cd) this).field_e = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((cd) this).field_a = false;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L6: {
              if (0 != ((cd) this).field_l) {
                break L6;
              } else {
                if (kg.field_d != 98) {
                  break L6;
                } else {
                  L7: {
                    if (((cd) this).field_e <= 0) {
                      ((cd) this).field_e = ((cd) this).field_i;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((cd) this).field_a = false;
                  ((cd) this).field_e = ((cd) this).field_e - 1;
                  break L6;
                }
              }
            }
            L8: {
              if (((cd) this).field_l != 0) {
                break L8;
              } else {
                if (99 != kg.field_d) {
                  break L8;
                } else {
                  L9: {
                    ((cd) this).field_e = ((cd) this).field_e + 1;
                    if (((cd) this).field_e >= ((cd) this).field_i) {
                      ((cd) this).field_e = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((cd) this).field_a = false;
                  break L8;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        int var2 = 52 % ((31 - param0) / 56);
        return ((cd) this).field_f == 103 ? true : false;
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
          ((cd) this).field_l = 0;
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
        ((cd) this).field_a = stackIn_3_1 != 0;
        if (param3 >= 96) {
          if (((cd) this).field_a) {
            ((cd) this).field_e = param1;
            return;
          } else {
            ((cd) this).field_e = param0;
            return;
          }
        } else {
          return;
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
            ((cd) this).field_a = false;
            if (((cd) this).field_f != 97) {
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
            if (((cd) this).field_f != 97) {
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

    public static void c(int param0) {
        field_c = null;
        field_h = null;
    }

    final void a(int param0, int param1, int param2) {
        if (((cd) this).field_i <= param1) {
          throw new IllegalArgumentException();
        } else {
          if (param2 < ((cd) this).field_i) {
            L0: {
              ((cd) this).field_m = 0;
              ((cd) this).field_f = 0;
              ((cd) this).field_d = 0;
              if (uk.field_a != 0) {
                ((cd) this).field_e = param2;
                ((cd) this).field_k = qk.field_N;
                ((cd) this).field_l = uk.field_a;
                ((cd) this).field_a = true;
                ((cd) this).field_m = uk.field_a;
                ((cd) this).field_d = uk.field_a;
                break L0;
              } else {
                break L0;
              }
            }
            if (((cd) this).field_l != 0) {
              if (rj.field_a != 0) {
                L1: {
                  if (0 >= ((cd) this).field_k) {
                    ((cd) this).field_m = ((cd) this).field_l;
                    ((cd) this).field_k = f.field_a;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  ((cd) this).field_k = ((cd) this).field_k - 1;
                  if (uk.field_a != 0) {
                    break L2;
                  } else {
                    if (rj.field_a == 0) {
                      ((cd) this).field_l = 0;
                      break L2;
                    } else {
                      L3: {
                        if (0 != ((cd) this).field_l) {
                          break L3;
                        } else {
                          L4: {
                            if (((cd) this).field_a) {
                              break L4;
                            } else {
                              if (!mg.field_a) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (0 <= param1) {
                            if (((cd) this).field_e == param1) {
                              ((cd) this).field_e = param1;
                              ((cd) this).field_a = true;
                              break L3;
                            } else {
                              ((cd) this).field_e = param1;
                              ((cd) this).field_a = true;
                              break L3;
                            }
                          } else {
                            if (!((cd) this).field_a) {
                              break L3;
                            } else {
                              ((cd) this).field_e = -1;
                              break L3;
                            }
                          }
                        }
                      }
                      L5: {
                        if (param0 < -117) {
                          break L5;
                        } else {
                          boolean discarded$24 = ((cd) this).a(true);
                          break L5;
                        }
                      }
                      return;
                    }
                  }
                }
                if (0 == ((cd) this).field_l) {
                  if (((cd) this).field_a) {
                    if (0 <= param1) {
                      if (((cd) this).field_e == param1) {
                        ((cd) this).field_e = param1;
                        ((cd) this).field_a = true;
                        if (param0 < -117) {
                          return;
                        } else {
                          boolean discarded$25 = ((cd) this).a(true);
                          return;
                        }
                      } else {
                        ((cd) this).field_e = param1;
                        ((cd) this).field_a = true;
                        if (param0 < -117) {
                          return;
                        } else {
                          boolean discarded$26 = ((cd) this).a(true);
                          return;
                        }
                      }
                    } else {
                      if (!((cd) this).field_a) {
                        if (param0 < -117) {
                          return;
                        } else {
                          boolean discarded$27 = ((cd) this).a(true);
                          return;
                        }
                      } else {
                        ((cd) this).field_e = -1;
                        if (param0 < -117) {
                          return;
                        } else {
                          boolean discarded$28 = ((cd) this).a(true);
                          return;
                        }
                      }
                    }
                  } else {
                    if (mg.field_a) {
                      if (0 <= param1) {
                        if (((cd) this).field_e == param1) {
                          L6: {
                            ((cd) this).field_e = param1;
                            ((cd) this).field_a = true;
                            if (param0 < -117) {
                              break L6;
                            } else {
                              boolean discarded$29 = ((cd) this).a(true);
                              break L6;
                            }
                          }
                          return;
                        } else {
                          L7: {
                            ((cd) this).field_e = param1;
                            ((cd) this).field_a = true;
                            if (param0 < -117) {
                              break L7;
                            } else {
                              boolean discarded$30 = ((cd) this).a(true);
                              break L7;
                            }
                          }
                          return;
                        }
                      } else {
                        L8: {
                          if (!((cd) this).field_a) {
                            break L8;
                          } else {
                            ((cd) this).field_e = -1;
                            break L8;
                          }
                        }
                        if (param0 >= -117) {
                          boolean discarded$31 = ((cd) this).a(true);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param0 >= -117) {
                        boolean discarded$32 = ((cd) this).a(true);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (param0 >= -117) {
                    boolean discarded$33 = ((cd) this).a(true);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L9: {
                  if (uk.field_a != 0) {
                    break L9;
                  } else {
                    if (rj.field_a == 0) {
                      ((cd) this).field_l = 0;
                      break L9;
                    } else {
                      L10: {
                        if (0 != ((cd) this).field_l) {
                          break L10;
                        } else {
                          L11: {
                            if (((cd) this).field_a) {
                              break L11;
                            } else {
                              if (!mg.field_a) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (0 <= param1) {
                            if (((cd) this).field_e == param1) {
                              ((cd) this).field_e = param1;
                              ((cd) this).field_a = true;
                              break L10;
                            } else {
                              ((cd) this).field_e = param1;
                              ((cd) this).field_a = true;
                              break L10;
                            }
                          } else {
                            if (!((cd) this).field_a) {
                              break L10;
                            } else {
                              ((cd) this).field_e = -1;
                              break L10;
                            }
                          }
                        }
                      }
                      L12: {
                        if (param0 < -117) {
                          break L12;
                        } else {
                          boolean discarded$34 = ((cd) this).a(true);
                          break L12;
                        }
                      }
                      return;
                    }
                  }
                }
                if (0 == ((cd) this).field_l) {
                  if (((cd) this).field_a) {
                    if (0 <= param1) {
                      if (((cd) this).field_e == param1) {
                        L13: {
                          ((cd) this).field_e = param1;
                          ((cd) this).field_a = true;
                          if (param0 < -117) {
                            break L13;
                          } else {
                            boolean discarded$35 = ((cd) this).a(true);
                            break L13;
                          }
                        }
                        return;
                      } else {
                        L14: {
                          ((cd) this).field_e = param1;
                          ((cd) this).field_a = true;
                          if (param0 < -117) {
                            break L14;
                          } else {
                            boolean discarded$36 = ((cd) this).a(true);
                            break L14;
                          }
                        }
                        return;
                      }
                    } else {
                      if (!((cd) this).field_a) {
                        if (param0 >= -117) {
                          boolean discarded$37 = ((cd) this).a(true);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L15: {
                          ((cd) this).field_e = -1;
                          if (param0 < -117) {
                            break L15;
                          } else {
                            boolean discarded$38 = ((cd) this).a(true);
                            break L15;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    if (!mg.field_a) {
                      if (param0 >= -117) {
                        boolean discarded$39 = ((cd) this).a(true);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L16: {
                        if (0 <= param1) {
                          if (((cd) this).field_e == param1) {
                            ((cd) this).field_e = param1;
                            ((cd) this).field_a = true;
                            break L16;
                          } else {
                            ((cd) this).field_e = param1;
                            ((cd) this).field_a = true;
                            break L16;
                          }
                        } else {
                          if (!((cd) this).field_a) {
                            break L16;
                          } else {
                            ((cd) this).field_e = -1;
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (param0 < -117) {
                          break L17;
                        } else {
                          boolean discarded$40 = ((cd) this).a(true);
                          break L17;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (param0 >= -117) {
                    boolean discarded$41 = ((cd) this).a(true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L18: {
                if (uk.field_a != 0) {
                  break L18;
                } else {
                  if (rj.field_a == 0) {
                    ((cd) this).field_l = 0;
                    break L18;
                  } else {
                    L19: {
                      if (0 != ((cd) this).field_l) {
                        break L19;
                      } else {
                        L20: {
                          if (((cd) this).field_a) {
                            break L20;
                          } else {
                            if (!mg.field_a) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        if (0 <= param1) {
                          if (((cd) this).field_e == param1) {
                            ((cd) this).field_e = param1;
                            ((cd) this).field_a = true;
                            break L19;
                          } else {
                            ((cd) this).field_e = param1;
                            ((cd) this).field_a = true;
                            break L19;
                          }
                        } else {
                          if (!((cd) this).field_a) {
                            break L19;
                          } else {
                            ((cd) this).field_e = -1;
                            break L19;
                          }
                        }
                      }
                    }
                    L21: {
                      if (param0 < -117) {
                        break L21;
                      } else {
                        boolean discarded$42 = ((cd) this).a(true);
                        break L21;
                      }
                    }
                    return;
                  }
                }
              }
              L22: {
                if (0 != ((cd) this).field_l) {
                  break L22;
                } else {
                  if (((cd) this).field_a) {
                    if (0 <= param1) {
                      if (((cd) this).field_e == param1) {
                        L23: {
                          ((cd) this).field_e = param1;
                          ((cd) this).field_a = true;
                          if (param0 < -117) {
                            break L23;
                          } else {
                            boolean discarded$43 = ((cd) this).a(true);
                            break L23;
                          }
                        }
                        return;
                      } else {
                        L24: {
                          ((cd) this).field_e = param1;
                          ((cd) this).field_a = true;
                          if (param0 < -117) {
                            break L24;
                          } else {
                            boolean discarded$44 = ((cd) this).a(true);
                            break L24;
                          }
                        }
                        return;
                      }
                    } else {
                      if (!((cd) this).field_a) {
                        break L22;
                      } else {
                        L25: {
                          ((cd) this).field_e = -1;
                          if (param0 < -117) {
                            break L25;
                          } else {
                            boolean discarded$45 = ((cd) this).a(true);
                            break L25;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    if (!mg.field_a) {
                      break L22;
                    } else {
                      L26: {
                        if (0 <= param1) {
                          if (((cd) this).field_e == param1) {
                            ((cd) this).field_e = param1;
                            ((cd) this).field_a = true;
                            break L26;
                          } else {
                            ((cd) this).field_e = param1;
                            ((cd) this).field_a = true;
                            break L26;
                          }
                        } else {
                          if (!((cd) this).field_a) {
                            break L26;
                          } else {
                            ((cd) this).field_e = -1;
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (param0 < -117) {
                          break L27;
                        } else {
                          boolean discarded$46 = ((cd) this).a(true);
                          break L27;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param0 >= -117) {
                boolean discarded$47 = ((cd) this).a(true);
                return;
              } else {
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final void f(int param0) {
        ((cd) this).field_f = 0;
        ((cd) this).field_m = 0;
        ((cd) this).field_d = param0;
        if (!(((cd) this).field_l != 0)) {
            ((cd) this).field_f = kg.field_d;
        }
    }

    final void a(int param0, boolean param1, byte param2) {
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
          if (!param1) {
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
        L1: {
          ((cd) this).field_a = stackIn_3_1 != 0;
          ((cd) this).field_l = 0;
          if (((cd) this).field_a) {
            ((cd) this).field_e = param0;
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 < 75) {
          ((cd) this).field_k = -27;
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 == -85) {
          if (param0 <= param6) {
            if (param6 < param2) {
              if (param4 <= param1) {
                if (param5 * ((cd) this).field_i + param4 <= param1) {
                  return -1;
                } else {
                  return (param1 - param4) / param5;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          ((cd) this).field_l = -109;
          if (param0 <= param6) {
            if (param6 < param2) {
              if (param4 <= param1) {
                if (param5 * ((cd) this).field_i + param4 <= param1) {
                  return -1;
                } else {
                  return (param1 - param4) / param5;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          if (((cd) this).field_m == 0) {
            if (((cd) this).field_f != 84) {
              if (((cd) this).field_f == 83) {
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
          return false;
        }
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 11) {
          L0: {
            boolean discarded$10 = ((cd) this).c((byte) 69);
            if (96 != ((cd) this).field_f) {
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
            if (96 != ((cd) this).field_f) {
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

    cd(int param0) {
        ((cd) this).field_e = 0;
        ((cd) this).field_a = false;
        ((cd) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ja();
        field_g = 0;
        field_j = false;
    }
}
