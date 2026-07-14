/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr {
    private int field_d;
    int field_g;
    private int field_e;
    private int field_j;
    private boolean field_f;
    static en field_b;
    static int field_h;
    static wp[] field_i;
    private int field_a;
    int field_c;

    final void a(boolean param0) {
        ((gr) this).field_e = 0;
        if (param0) {
          L0: {
            ((gr) this).field_a = 0;
            if (-1 != (((gr) this).field_d ^ -1)) {
              break L0;
            } else {
              if (98 == bk.field_f) {
                L1: {
                  if (((gr) this).field_g <= 0) {
                    ((gr) this).field_g = ((gr) this).field_c;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((gr) this).field_g = ((gr) this).field_g - 1;
                ((gr) this).field_f = false;
                break L0;
              } else {
                if (((gr) this).field_d != 0) {
                  L2: {
                    if (0 != ((gr) this).field_d) {
                      break L2;
                    } else {
                      if (99 == bk.field_f) {
                        ((gr) this).field_g = ((gr) this).field_g + 1;
                        ((gr) this).field_f = false;
                        if (((gr) this).field_c <= ((gr) this).field_g) {
                          ((gr) this).field_g = 0;
                          break L2;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L3: {
                    ((gr) this).field_e = bk.field_f;
                    if (0 != ((gr) this).field_d) {
                      break L3;
                    } else {
                      if (99 == bk.field_f) {
                        ((gr) this).field_g = ((gr) this).field_g + 1;
                        ((gr) this).field_f = false;
                        if (((gr) this).field_c <= ((gr) this).field_g) {
                          ((gr) this).field_g = 0;
                          break L3;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          if (((gr) this).field_d != 0) {
            L4: {
              if (0 != ((gr) this).field_d) {
                break L4;
              } else {
                if (99 == bk.field_f) {
                  ((gr) this).field_g = ((gr) this).field_g + 1;
                  ((gr) this).field_f = false;
                  if (((gr) this).field_c <= ((gr) this).field_g) {
                    ((gr) this).field_g = 0;
                    break L4;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            return;
          } else {
            L5: {
              ((gr) this).field_e = bk.field_f;
              if (0 != ((gr) this).field_d) {
                break L5;
              } else {
                if (99 == bk.field_f) {
                  ((gr) this).field_g = ((gr) this).field_g + 1;
                  ((gr) this).field_f = false;
                  if (((gr) this).field_c <= ((gr) this).field_g) {
                    ((gr) this).field_g = 0;
                    break L5;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            return;
          }
        } else {
          ((gr) this).a(true);
          ((gr) this).field_a = 0;
          if (-1 == (((gr) this).field_d ^ -1)) {
            L6: {
              if (98 == bk.field_f) {
                L7: {
                  if (((gr) this).field_g <= 0) {
                    ((gr) this).field_g = ((gr) this).field_c;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((gr) this).field_g = ((gr) this).field_g - 1;
                ((gr) this).field_f = false;
                break L6;
              } else {
                break L6;
              }
            }
            if (((gr) this).field_d == 0) {
              ((gr) this).field_e = bk.field_f;
              if (0 == ((gr) this).field_d) {
                L8: {
                  if (99 == bk.field_f) {
                    ((gr) this).field_g = ((gr) this).field_g + 1;
                    ((gr) this).field_f = false;
                    if (((gr) this).field_c <= ((gr) this).field_g) {
                      ((gr) this).field_g = 0;
                      break L8;
                    } else {
                      return;
                    }
                  } else {
                    break L8;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              if (0 == ((gr) this).field_d) {
                if (99 == bk.field_f) {
                  ((gr) this).field_g = ((gr) this).field_g + 1;
                  ((gr) this).field_f = false;
                  if (((gr) this).field_c <= ((gr) this).field_g) {
                    ((gr) this).field_g = 0;
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
            L9: {
              if (((gr) this).field_d != 0) {
                break L9;
              } else {
                ((gr) this).field_e = bk.field_f;
                break L9;
              }
            }
            if (0 == ((gr) this).field_d) {
              if (99 == bk.field_f) {
                ((gr) this).field_g = ((gr) this).field_g + 1;
                ((gr) this).field_f = false;
                if (((gr) this).field_c > ((gr) this).field_g) {
                  return;
                } else {
                  ((gr) this).field_g = 0;
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

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 50) {
          L0: {
            boolean discarded$10 = ((gr) this).a(-96);
            if (102 != ((gr) this).field_e) {
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
            if (102 != ((gr) this).field_e) {
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

    final boolean e(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > 80) {
          if (-1 == ((gr) this).field_a) {
            if ((((gr) this).field_e ^ -1) != -85) {
              if (((gr) this).field_e == 83) {
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
          ((gr) this).field_c = -21;
          if (-1 == (((gr) this).field_a ^ -1)) {
            if (((gr) this).field_e == -85) {
              return true;
            } else {
              L0: {
                if (((gr) this).field_e != 83) {
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

    final void a(byte param0, int param1) {
        if (0 != ((gr) this).field_d) {
          if (param0 >= -98) {
            field_h = 4;
            return;
          } else {
            return;
          }
        } else {
          ((gr) this).field_f = false;
          ((gr) this).field_g = param1;
          if (param0 < -98) {
            return;
          } else {
            field_h = 4;
            return;
          }
        }
    }

    final boolean a(int param0) {
        int var2 = 39 / ((71 - param0) / 37);
        return -97 == (((gr) this).field_e ^ -1) ? true : false;
    }

    final void d(byte param0) {
        ((gr) this).field_a = 0;
        ((gr) this).field_e = 0;
        if (-1 != (((gr) this).field_d ^ -1)) {
          if (param0 <= 122) {
            field_b = (en) null;
            return;
          } else {
            return;
          }
        } else {
          ((gr) this).field_e = bk.field_f;
          if (param0 > 122) {
            return;
          } else {
            field_b = (en) null;
            return;
          }
        }
    }

    final void c(byte param0) {
        ((gr) this).field_e = 0;
        if (param0 <= -47) {
          L0: {
            ((gr) this).field_a = 0;
            if (((gr) this).field_d == 0) {
              ((gr) this).field_e = bk.field_f;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != ((gr) this).field_d) {
              break L1;
            } else {
              if (-97 == (bk.field_f ^ -1)) {
                L2: {
                  if (((gr) this).field_g <= 0) {
                    ((gr) this).field_g = ((gr) this).field_c;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((gr) this).field_g = ((gr) this).field_g - 1;
                ((gr) this).field_f = false;
                break L1;
              } else {
                if (((gr) this).field_d == 0) {
                  if (bk.field_f == 97) {
                    ((gr) this).field_g = ((gr) this).field_g + 1;
                    if (((gr) this).field_c > ((gr) this).field_g) {
                      ((gr) this).field_f = false;
                      return;
                    } else {
                      ((gr) this).field_g = 0;
                      ((gr) this).field_f = false;
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
          if (((gr) this).field_d == 0) {
            if (bk.field_f == 97) {
              ((gr) this).field_g = ((gr) this).field_g + 1;
              if (((gr) this).field_c > ((gr) this).field_g) {
                ((gr) this).field_f = false;
                return;
              } else {
                ((gr) this).field_g = 0;
                ((gr) this).field_f = false;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          L3: {
            ((gr) this).field_e = 73;
            ((gr) this).field_a = 0;
            if (((gr) this).field_d == 0) {
              ((gr) this).field_e = bk.field_f;
              break L3;
            } else {
              break L3;
            }
          }
          if (0 == ((gr) this).field_d) {
            L4: {
              if (-97 == (bk.field_f ^ -1)) {
                L5: {
                  if (((gr) this).field_g <= 0) {
                    ((gr) this).field_g = ((gr) this).field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((gr) this).field_g = ((gr) this).field_g - 1;
                ((gr) this).field_f = false;
                break L4;
              } else {
                break L4;
              }
            }
            if (((gr) this).field_d == 0) {
              if (bk.field_f == 97) {
                ((gr) this).field_g = ((gr) this).field_g + 1;
                if (((gr) this).field_c > ((gr) this).field_g) {
                  ((gr) this).field_f = false;
                  return;
                } else {
                  ((gr) this).field_g = 0;
                  ((gr) this).field_f = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (((gr) this).field_d == 0) {
              if (bk.field_f == 97) {
                ((gr) this).field_g = ((gr) this).field_g + 1;
                if (((gr) this).field_c > ((gr) this).field_g) {
                  ((gr) this).field_f = false;
                  return;
                } else {
                  ((gr) this).field_g = 0;
                  ((gr) this).field_f = false;
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

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 22) {
          L0: {
            boolean discarded$11 = ((gr) this).d(-16);
            if (((gr) this).field_d == 0) {
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
            if (((gr) this).field_d == 0) {
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
        ((gr) this).field_f = stackIn_3_1 != 0;
        ((gr) this).field_d = param2;
        if (!((gr) this).field_f) {
          ((gr) this).field_g = param3;
          return;
        } else {
          ((gr) this).field_g = param1;
          return;
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_b = null;
        if (param0 >= -117) {
            field_b = (en) null;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (((gr) this).field_c <= param1) {
          throw new IllegalArgumentException();
        } else {
          if (((gr) this).field_c > param0) {
            L0: {
              ((gr) this).field_a = 0;
              ((gr) this).field_e = 0;
              if (0 != vj.field_d) {
                ((gr) this).field_j = pn.field_d;
                ((gr) this).field_a = vj.field_d;
                ((gr) this).field_f = true;
                ((gr) this).field_d = vj.field_d;
                ((gr) this).field_g = param0;
                break L0;
              } else {
                break L0;
              }
            }
            if (param2 == -24702) {
              if (-1 != (((gr) this).field_d ^ -1)) {
                if (0 != vu.field_f) {
                  if (-1 > (((gr) this).field_j ^ -1)) {
                    L1: {
                      ((gr) this).field_j = ((gr) this).field_j - 1;
                      if (0 != vj.field_d) {
                        break L1;
                      } else {
                        if (vu.field_f == 0) {
                          ((gr) this).field_d = 0;
                          break L1;
                        } else {
                          if (0 == ((gr) this).field_d) {
                            L2: {
                              if (((gr) this).field_f) {
                                break L2;
                              } else {
                                if (uu.field_e) {
                                  break L2;
                                } else {
                                  return;
                                }
                              }
                            }
                            if (0 > param1) {
                              if (((gr) this).field_f) {
                                ((gr) this).field_g = -1;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (((gr) this).field_g == param1) {
                                ((gr) this).field_g = param1;
                                ((gr) this).field_f = true;
                                return;
                              } else {
                                ((gr) this).field_g = param1;
                                ((gr) this).field_f = true;
                                return;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    if (0 == ((gr) this).field_d) {
                      L3: {
                        if (((gr) this).field_f) {
                          break L3;
                        } else {
                          if (uu.field_e) {
                            break L3;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 > param1) {
                        if (!((gr) this).field_f) {
                          return;
                        } else {
                          ((gr) this).field_g = -1;
                          return;
                        }
                      } else {
                        if (((gr) this).field_g == param1) {
                          ((gr) this).field_g = param1;
                          ((gr) this).field_f = true;
                          return;
                        } else {
                          ((gr) this).field_g = param1;
                          ((gr) this).field_f = true;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((gr) this).field_j = wm.field_h;
                    ((gr) this).field_j = ((gr) this).field_j - 1;
                    if (0 == vj.field_d) {
                      L4: {
                        if (vu.field_f == 0) {
                          ((gr) this).field_d = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (0 != ((gr) this).field_d) {
                          break L5;
                        } else {
                          L6: {
                            if (((gr) this).field_f) {
                              break L6;
                            } else {
                              if (uu.field_e) {
                                break L6;
                              } else {
                                return;
                              }
                            }
                          }
                          if (0 > param1) {
                            if (!((gr) this).field_f) {
                              break L5;
                            } else {
                              ((gr) this).field_g = -1;
                              return;
                            }
                          } else {
                            if (((gr) this).field_g == param1) {
                              ((gr) this).field_g = param1;
                              ((gr) this).field_f = true;
                              return;
                            } else {
                              ((gr) this).field_g = param1;
                              ((gr) this).field_f = true;
                              return;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      if (0 == ((gr) this).field_d) {
                        L7: {
                          if (((gr) this).field_f) {
                            break L7;
                          } else {
                            if (uu.field_e) {
                              break L7;
                            } else {
                              return;
                            }
                          }
                        }
                        if (0 > param1) {
                          if (!((gr) this).field_f) {
                            return;
                          } else {
                            ((gr) this).field_g = -1;
                            return;
                          }
                        } else {
                          if (((gr) this).field_g == param1) {
                            ((gr) this).field_g = param1;
                            ((gr) this).field_f = true;
                            return;
                          } else {
                            ((gr) this).field_g = param1;
                            ((gr) this).field_f = true;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  L8: {
                    if (0 != vj.field_d) {
                      break L8;
                    } else {
                      if (vu.field_f == 0) {
                        ((gr) this).field_d = 0;
                        break L8;
                      } else {
                        if (0 == ((gr) this).field_d) {
                          L9: {
                            if (((gr) this).field_f) {
                              break L9;
                            } else {
                              if (uu.field_e) {
                                break L9;
                              } else {
                                return;
                              }
                            }
                          }
                          if (0 > param1) {
                            if (((gr) this).field_f) {
                              ((gr) this).field_g = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (((gr) this).field_g == param1) {
                              ((gr) this).field_g = param1;
                              ((gr) this).field_f = true;
                              return;
                            } else {
                              ((gr) this).field_g = param1;
                              ((gr) this).field_f = true;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (0 == ((gr) this).field_d) {
                    L10: {
                      if (((gr) this).field_f) {
                        break L10;
                      } else {
                        if (uu.field_e) {
                          break L10;
                        } else {
                          return;
                        }
                      }
                    }
                    if (0 > param1) {
                      if (((gr) this).field_f) {
                        ((gr) this).field_g = -1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (((gr) this).field_g == param1) {
                        ((gr) this).field_g = param1;
                        ((gr) this).field_f = true;
                        return;
                      } else {
                        ((gr) this).field_g = param1;
                        ((gr) this).field_f = true;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L11: {
                  if (0 != vj.field_d) {
                    break L11;
                  } else {
                    if (vu.field_f == 0) {
                      ((gr) this).field_d = 0;
                      break L11;
                    } else {
                      L12: {
                        if (0 != ((gr) this).field_d) {
                          break L12;
                        } else {
                          L13: {
                            if (((gr) this).field_f) {
                              break L13;
                            } else {
                              if (uu.field_e) {
                                break L13;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if (0 > param1) {
                            if (!((gr) this).field_f) {
                              break L12;
                            } else {
                              ((gr) this).field_g = -1;
                              break L12;
                            }
                          } else {
                            if (((gr) this).field_g == param1) {
                              ((gr) this).field_g = param1;
                              ((gr) this).field_f = true;
                              break L12;
                            } else {
                              ((gr) this).field_g = param1;
                              ((gr) this).field_f = true;
                              break L12;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (0 == ((gr) this).field_d) {
                  L14: {
                    if (((gr) this).field_f) {
                      break L14;
                    } else {
                      if (uu.field_e) {
                        break L14;
                      } else {
                        return;
                      }
                    }
                  }
                  if (0 > param1) {
                    if (((gr) this).field_f) {
                      ((gr) this).field_g = -1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (((gr) this).field_g == param1) {
                      ((gr) this).field_g = param1;
                      ((gr) this).field_f = true;
                      return;
                    } else {
                      ((gr) this).field_g = param1;
                      ((gr) this).field_f = true;
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
            throw new IllegalArgumentException();
          }
        }
    }

    final boolean b(int param0) {
        if (param0 > -9) {
            return false;
        }
        return ((gr) this).field_e == 103 ? true : false;
    }

    gr(int param0) {
        ((gr) this).field_g = 0;
        ((gr) this).field_f = false;
        ((gr) this).field_c = param0;
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -102) {
          L0: {
            ((gr) this).field_f = true;
            if ((((gr) this).field_e ^ -1) != -98) {
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
            if ((((gr) this).field_e ^ -1) != -98) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
    }
}
