/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static w field_c;
    static String field_i;
    private int field_p;
    boolean field_o;
    private int field_j;
    static int field_k;
    static ei[][] field_a;
    private boolean field_n;
    private int field_d;
    static int field_e;
    static ck field_g;
    static String field_m;
    int field_h;
    private int field_q;
    int field_l;
    static ji field_f;
    static String field_b;

    final void a(int param0, byte param1) {
        if (-1 != (this.field_q ^ -1)) {
          if (param1 >= -53) {
            field_b = (String) null;
            return;
          } else {
            return;
          }
        } else {
          this.field_h = param0;
          this.field_o = true;
          this.field_n = false;
          if (param1 < -53) {
            return;
          } else {
            field_b = (String) null;
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (!param0) {
          L0: {
            sk.e(-70);
            if (this.field_q == 0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_q == 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 <= 111) {
          L0: {
            field_g = (ck) null;
            if ((this.field_d ^ -1) != -103) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((this.field_d ^ -1) != -103) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        this.field_q = 0;
        this.field_n = param0 ? true : false;
        if (!(!this.field_n)) {
            this.field_h = param2;
        }
        int var4 = -68 / ((54 - param1) / 44);
    }

    final boolean a(byte param0) {
        if (param0 != -51) {
            return false;
        }
        return (this.field_d ^ -1) == -104 ? true : false;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return this.field_d == 96 ? true : false;
    }

    final void a(byte param0, int param1) {
        if (param0 == 58) {
          this.field_d = 0;
          this.field_p = 0;
          this.field_o = false;
          if (0 != this.field_q) {
            L0: {
              if (0 != this.field_q) {
                break L0;
              } else {
                if ((wh.field_c ^ -1) != -97) {
                  break L0;
                } else {
                  L1: {
                    if ((this.field_h ^ -1) >= -1) {
                      this.field_h = this.field_l;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  this.field_n = false;
                  this.field_h = this.field_h - 1;
                  this.field_o = true;
                  break L0;
                }
              }
            }
            L2: {
              if (-1 != (this.field_q ^ -1)) {
                break L2;
              } else {
                if (wh.field_c != 97) {
                  break L2;
                } else {
                  this.field_h = this.field_h + 1;
                  this.field_n = false;
                  this.field_o = true;
                  if (this.field_l > this.field_h) {
                    break L2;
                  } else {
                    this.field_h = 0;
                    if (this.field_q == 0) {
                      if (98 != wh.field_c) {
                        if ((wh.field_c ^ -1) != -100) {
                          return;
                        } else {
                          L3: {
                            if (-1 < (this.field_h ^ -1)) {
                              this.field_h = param1;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          this.field_n = false;
                          this.field_o = true;
                          return;
                        }
                      } else {
                        L4: {
                          if (-1 < (this.field_h ^ -1)) {
                            this.field_h = param1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_n = false;
                        this.field_o = true;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (this.field_q == 0) {
              if (98 != wh.field_c) {
                if ((wh.field_c ^ -1) != -100) {
                  return;
                } else {
                  L5: {
                    if (-1 < (this.field_h ^ -1)) {
                      this.field_h = param1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  this.field_n = false;
                  this.field_o = true;
                  return;
                }
              } else {
                L6: {
                  if (-1 < (this.field_h ^ -1)) {
                    this.field_h = param1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_n = false;
                this.field_o = true;
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_d = wh.field_c;
            if (0 == this.field_q) {
              if ((wh.field_c ^ -1) == -97) {
                L7: {
                  if ((this.field_h ^ -1) >= -1) {
                    this.field_h = this.field_l;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  this.field_n = false;
                  this.field_h = this.field_h - 1;
                  this.field_o = true;
                  if (-1 != (this.field_q ^ -1)) {
                    break L8;
                  } else {
                    if (wh.field_c != 97) {
                      break L8;
                    } else {
                      this.field_h = this.field_h + 1;
                      this.field_n = false;
                      this.field_o = true;
                      if (this.field_l > this.field_h) {
                        break L8;
                      } else {
                        L9: {
                          this.field_h = 0;
                          if (this.field_q != 0) {
                            break L9;
                          } else {
                            L10: {
                              if (98 == wh.field_c) {
                                break L10;
                              } else {
                                if ((wh.field_c ^ -1) == -100) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L11: {
                              if (-1 < (this.field_h ^ -1)) {
                                this.field_h = param1;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            this.field_n = false;
                            this.field_o = true;
                            break L9;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                if (this.field_q == 0) {
                  if (98 != wh.field_c) {
                    if ((wh.field_c ^ -1) == -100) {
                      L12: {
                        if (-1 < (this.field_h ^ -1)) {
                          this.field_h = param1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      this.field_n = false;
                      this.field_o = true;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L13: {
                      if (-1 < (this.field_h ^ -1)) {
                        this.field_h = param1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    this.field_n = false;
                    this.field_o = true;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L14: {
                  if (-1 != (this.field_q ^ -1)) {
                    break L14;
                  } else {
                    if (wh.field_c != 97) {
                      break L14;
                    } else {
                      this.field_h = this.field_h + 1;
                      this.field_n = false;
                      this.field_o = true;
                      if (this.field_l > this.field_h) {
                        break L14;
                      } else {
                        L15: {
                          this.field_h = 0;
                          if (this.field_q != 0) {
                            break L15;
                          } else {
                            L16: {
                              if (98 == wh.field_c) {
                                break L16;
                              } else {
                                if ((wh.field_c ^ -1) == -100) {
                                  break L16;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L17: {
                              if (-1 < (this.field_h ^ -1)) {
                                this.field_h = param1;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            this.field_n = false;
                            this.field_o = true;
                            break L15;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                if (this.field_q == 0) {
                  if (98 != wh.field_c) {
                    if ((wh.field_c ^ -1) == -100) {
                      L18: {
                        if (-1 < (this.field_h ^ -1)) {
                          this.field_h = param1;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      this.field_n = false;
                      this.field_o = true;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L19: {
                      if (-1 < (this.field_h ^ -1)) {
                        this.field_h = param1;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    this.field_n = false;
                    this.field_o = true;
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L20: {
                if (-1 != (this.field_q ^ -1)) {
                  break L20;
                } else {
                  if (wh.field_c != 97) {
                    break L20;
                  } else {
                    this.field_h = this.field_h + 1;
                    this.field_n = false;
                    this.field_o = true;
                    if (this.field_l > this.field_h) {
                      break L20;
                    } else {
                      L21: {
                        this.field_h = 0;
                        if (this.field_q != 0) {
                          break L21;
                        } else {
                          L22: {
                            if (98 == wh.field_c) {
                              break L22;
                            } else {
                              if ((wh.field_c ^ -1) == -100) {
                                break L22;
                              } else {
                                break L21;
                              }
                            }
                          }
                          L23: {
                            if (-1 < (this.field_h ^ -1)) {
                              this.field_h = param1;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          this.field_n = false;
                          this.field_o = true;
                          break L21;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (this.field_q == 0) {
                if (98 != wh.field_c) {
                  if ((wh.field_c ^ -1) != -100) {
                    return;
                  } else {
                    L24: {
                      if (-1 < (this.field_h ^ -1)) {
                        this.field_h = param1;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    this.field_n = false;
                    this.field_o = true;
                    return;
                  }
                } else {
                  L25: {
                    if (-1 < (this.field_h ^ -1)) {
                      this.field_h = param1;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  this.field_n = false;
                  this.field_o = true;
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          this.field_h = 111;
          this.field_d = 0;
          this.field_p = 0;
          this.field_o = false;
          if (0 == this.field_q) {
            this.field_d = wh.field_c;
            if (0 == this.field_q) {
              L26: {
                if ((wh.field_c ^ -1) != -97) {
                  break L26;
                } else {
                  L27: {
                    if ((this.field_h ^ -1) >= -1) {
                      this.field_h = this.field_l;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  this.field_n = false;
                  this.field_h = this.field_h - 1;
                  this.field_o = true;
                  break L26;
                }
              }
              L28: {
                if (-1 != (this.field_q ^ -1)) {
                  break L28;
                } else {
                  if (wh.field_c != 97) {
                    break L28;
                  } else {
                    this.field_h = this.field_h + 1;
                    this.field_n = false;
                    this.field_o = true;
                    if (this.field_l > this.field_h) {
                      break L28;
                    } else {
                      L29: {
                        this.field_h = 0;
                        if (this.field_q != 0) {
                          break L29;
                        } else {
                          L30: {
                            if (98 == wh.field_c) {
                              break L30;
                            } else {
                              if ((wh.field_c ^ -1) == -100) {
                                break L30;
                              } else {
                                break L29;
                              }
                            }
                          }
                          L31: {
                            if (-1 < (this.field_h ^ -1)) {
                              this.field_h = param1;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          this.field_n = false;
                          this.field_o = true;
                          break L29;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (this.field_q == 0) {
                if (98 != wh.field_c) {
                  if ((wh.field_c ^ -1) != -100) {
                    return;
                  } else {
                    L32: {
                      if (-1 < (this.field_h ^ -1)) {
                        this.field_h = param1;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    this.field_n = false;
                    this.field_o = true;
                    return;
                  }
                } else {
                  L33: {
                    if (-1 < (this.field_h ^ -1)) {
                      this.field_h = param1;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  this.field_n = false;
                  this.field_o = true;
                  return;
                }
              } else {
                return;
              }
            } else {
              L34: {
                if (-1 != (this.field_q ^ -1)) {
                  break L34;
                } else {
                  if (wh.field_c != 97) {
                    break L34;
                  } else {
                    this.field_h = this.field_h + 1;
                    this.field_n = false;
                    this.field_o = true;
                    if (this.field_l > this.field_h) {
                      break L34;
                    } else {
                      this.field_h = 0;
                      break L34;
                    }
                  }
                }
              }
              L35: {
                if (this.field_q != 0) {
                  break L35;
                } else {
                  L36: {
                    if (98 == wh.field_c) {
                      break L36;
                    } else {
                      if ((wh.field_c ^ -1) == -100) {
                        break L36;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L37: {
                    if (-1 < (this.field_h ^ -1)) {
                      this.field_h = param1;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  this.field_n = false;
                  this.field_o = true;
                  break L35;
                }
              }
              return;
            }
          } else {
            L38: {
              if (0 == this.field_q) {
                if (-1 != (this.field_q ^ -1)) {
                  break L38;
                } else {
                  if (wh.field_c != 97) {
                    break L38;
                  } else {
                    this.field_h = this.field_h + 1;
                    this.field_n = false;
                    this.field_o = true;
                    if (this.field_l > this.field_h) {
                      break L38;
                    } else {
                      this.field_h = 0;
                      break L38;
                    }
                  }
                }
              } else {
                if (-1 != (this.field_q ^ -1)) {
                  break L38;
                } else {
                  if (wh.field_c != 97) {
                    break L38;
                  } else {
                    this.field_h = this.field_h + 1;
                    this.field_n = false;
                    this.field_o = true;
                    if (this.field_l > this.field_h) {
                      break L38;
                    } else {
                      this.field_h = 0;
                      break L38;
                    }
                  }
                }
              }
            }
            L39: {
              if (this.field_q != 0) {
                break L39;
              } else {
                L40: {
                  if (98 == wh.field_c) {
                    break L40;
                  } else {
                    if ((wh.field_c ^ -1) == -100) {
                      break L40;
                    } else {
                      break L39;
                    }
                  }
                }
                L41: {
                  if (-1 < (this.field_h ^ -1)) {
                    this.field_h = param1;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                this.field_n = false;
                this.field_o = true;
                break L39;
              }
            }
            return;
          }
        }
    }

    final boolean b(int param0) {
        int var2 = 90 % ((31 - param0) / 42);
        return this.field_d == 97 ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param3) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((sk) (this)).field_n = stackIn_3_1 != 0;
        this.field_q = param1;
        if (this.field_n) {
          this.field_h = param2;
          if (client.field_A) {
            this.field_h = param0;
            return;
          } else {
            return;
          }
        } else {
          this.field_h = param0;
          return;
        }
    }

    final void a(int param0) {
        this.field_o = false;
        this.field_p = 0;
        if (param0 <= -24) {
          this.field_d = 0;
          if (0 == this.field_q) {
            if (wh.field_c == 98) {
              L0: {
                if (this.field_h <= 0) {
                  this.field_h = this.field_l;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                this.field_h = this.field_h - 1;
                this.field_n = false;
                this.field_o = true;
                if (this.field_q == 0) {
                  this.field_d = wh.field_c;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 == this.field_q) {
                if (-100 == (wh.field_c ^ -1)) {
                  this.field_h = this.field_h + 1;
                  this.field_n = false;
                  if (this.field_h < this.field_l) {
                    this.field_o = true;
                    return;
                  } else {
                    this.field_h = 0;
                    this.field_o = true;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L2: {
                if (this.field_q == 0) {
                  this.field_d = wh.field_c;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (0 == this.field_q) {
                if (-100 == (wh.field_c ^ -1)) {
                  this.field_h = this.field_h + 1;
                  this.field_n = false;
                  if (this.field_h < this.field_l) {
                    this.field_o = true;
                    return;
                  } else {
                    this.field_h = 0;
                    this.field_o = true;
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
            L3: {
              if (this.field_q == 0) {
                this.field_d = wh.field_c;
                break L3;
              } else {
                break L3;
              }
            }
            if (0 == this.field_q) {
              if (-100 == (wh.field_c ^ -1)) {
                this.field_h = this.field_h + 1;
                this.field_n = false;
                if (this.field_h < this.field_l) {
                  this.field_o = true;
                  return;
                } else {
                  this.field_h = 0;
                  this.field_o = true;
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

    final static boolean a(boolean param0, CharSequence param1, boolean param2, int param3) {
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 < 2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3 > 36) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException("" + param3);
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = param1.length();
                        var8 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var8 >= var7) {
                            statePc = 43;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = param1.charAt(var8);
                        var13 = var8;
                        var12 = 0;
                        if (var11 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var12 == var13) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var12 == var13) {
                            statePc = 45;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 == 45) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int = 1;
                        if (var11 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var9 != 43) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (!param2) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var11 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (48 > var9) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (57 < var9) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9 -= 48;
                        if (var11 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (65 > var9) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var9 > 90) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9 -= 55;
                        if (var11 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var9 < 97) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var9 > 122) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 -= 87;
                        if (var11 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return stackIn_32_0 != 0;
                }
                case 33: {
                    try {
                        if (var9 < param3) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return stackIn_35_0 != 0;
                }
                case 36: {
                    try {
                        if (var4_int == 0) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = -var9;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10 = var9 + var6 * param3;
                        if (var10 / param3 == var6) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0 != 0;
                }
                case 41: {
                    try {
                        var5 = 1;
                        var6 = var10;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (param0) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        field_b = (String) null;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = var5;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return stackIn_46_0 != 0;
                }
                case 47: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_49_0 = (RuntimeException) (var4);
                    stackIn_48_0 = stackIn_49_0;
                    stackIn_49_1 = new StringBuilder().append("sk.O(").append(param0).append(',');
                    stackIn_48_1 = stackIn_49_1;
                    if (param1 == null) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_50_2 = "{...}";
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                    stackIn_50_2 = "null";
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    throw dh.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param1 < -52) {
          param0 = param0 & 8191;
          if (-4097 < (param0 ^ -1)) {
            L0: {
              if (param0 >= 2048) {
                stackIn_19_0 = pd.field_i[4096 - param0];
                break L0;
              } else {
                stackIn_19_0 = pd.field_i[param0];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-6145 < (param0 ^ -1)) {
                stackIn_15_0 = -pd.field_i[-4096 + param0];
                break L1;
              } else {
                stackIn_15_0 = -pd.field_i[-param0 + 8192];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_k = -122;
          param0 = param0 & 8191;
          if (-4097 < (param0 ^ -1)) {
            L2: {
              if (param0 >= 2048) {
                stackIn_9_0 = pd.field_i[4096 - param0];
                break L2;
              } else {
                stackIn_9_0 = pd.field_i[param0];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-6145 < (param0 ^ -1)) {
                stackIn_5_0 = -pd.field_i[-4096 + param0];
                break L3;
              } else {
                stackIn_5_0 = -pd.field_i[-param0 + 8192];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final void d(int param0) {
        this.field_d = 0;
        this.field_p = param0;
        this.field_o = false;
        if (this.field_q == 0) {
            this.field_d = wh.field_c;
        }
    }

    public static void e(int param0) {
        field_c = null;
        field_i = null;
        field_m = null;
        field_f = null;
        field_g = null;
        if (param0 != -28610) {
          sk.e(69);
          field_a = (ei[][]) null;
          field_b = null;
          return;
        } else {
          field_a = (ei[][]) null;
          field_b = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_l <= param0) {
          throw new IllegalArgumentException();
        } else {
          if (param2 >= this.field_l) {
            throw new IllegalArgumentException();
          } else {
            this.field_d = 0;
            this.field_p = 0;
            this.field_o = false;
            if (-1 == (ig.field_Yb ^ -1)) {
              if (this.field_q != 0) {
                if (be.field_n != 0) {
                  if (this.field_j > 0) {
                    this.field_j = this.field_j - 1;
                    if (param1 == -20563) {
                      L0: {
                        if (-1 != (ig.field_Yb ^ -1)) {
                          break L0;
                        } else {
                          if (-1 == (be.field_n ^ -1)) {
                            this.field_q = 0;
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                      }
                      if (-1 == (this.field_q ^ -1)) {
                        L1: {
                          if (this.field_n) {
                            break L1;
                          } else {
                            if (pm.field_b) {
                              break L1;
                            } else {
                              return;
                            }
                          }
                        }
                        if (param0 >= 0) {
                          if (this.field_h == param0) {
                            this.field_n = true;
                            this.field_h = param0;
                            return;
                          } else {
                            this.field_o = true;
                            this.field_n = true;
                            this.field_h = param0;
                            return;
                          }
                        } else {
                          if (this.field_n) {
                            this.field_h = -1;
                            if (client.field_A) {
                              if (this.field_h == param0) {
                                this.field_n = true;
                                this.field_h = param0;
                                return;
                              } else {
                                this.field_o = true;
                                this.field_n = true;
                                this.field_h = param0;
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
                    } else {
                      return;
                    }
                  } else {
                    this.field_j = qd.field_Ob;
                    this.field_j = this.field_j - 1;
                    if (param1 == -20563) {
                      L2: {
                        if (-1 != (ig.field_Yb ^ -1)) {
                          break L2;
                        } else {
                          if (-1 == (be.field_n ^ -1)) {
                            this.field_q = 0;
                            break L2;
                          } else {
                            L3: {
                              if (-1 != (this.field_q ^ -1)) {
                                break L3;
                              } else {
                                L4: {
                                  if (this.field_n) {
                                    break L4;
                                  } else {
                                    if (pm.field_b) {
                                      break L4;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                L5: {
                                  if (param0 >= 0) {
                                    break L5;
                                  } else {
                                    if (!this.field_n) {
                                      break L3;
                                    } else {
                                      this.field_h = -1;
                                      if (!client.field_A) {
                                        break L3;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                if (this.field_h == param0) {
                                  this.field_n = true;
                                  this.field_h = param0;
                                  return;
                                } else {
                                  this.field_o = true;
                                  this.field_n = true;
                                  this.field_h = param0;
                                  return;
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                      L6: {
                        if (-1 != (this.field_q ^ -1)) {
                          break L6;
                        } else {
                          L7: {
                            if (this.field_n) {
                              break L7;
                            } else {
                              if (pm.field_b) {
                                break L7;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param0 >= 0) {
                            if (this.field_h == param0) {
                              this.field_n = true;
                              this.field_h = param0;
                              return;
                            } else {
                              this.field_o = true;
                              this.field_n = true;
                              this.field_h = param0;
                              return;
                            }
                          } else {
                            if (!this.field_n) {
                              break L6;
                            } else {
                              this.field_h = -1;
                              if (!client.field_A) {
                                break L6;
                              } else {
                                if (this.field_h == param0) {
                                  this.field_n = true;
                                  this.field_h = param0;
                                  return;
                                } else {
                                  this.field_o = true;
                                  this.field_n = true;
                                  this.field_h = param0;
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param1 == -20563) {
                    L8: {
                      if (-1 != (ig.field_Yb ^ -1)) {
                        break L8;
                      } else {
                        if (-1 == (be.field_n ^ -1)) {
                          this.field_q = 0;
                          break L8;
                        } else {
                          if (-1 == (this.field_q ^ -1)) {
                            L9: {
                              if (this.field_n) {
                                break L9;
                              } else {
                                if (pm.field_b) {
                                  break L9;
                                } else {
                                  return;
                                }
                              }
                            }
                            if (param0 >= 0) {
                              if (this.field_h == param0) {
                                this.field_n = true;
                                this.field_h = param0;
                                return;
                              } else {
                                this.field_o = true;
                                this.field_n = true;
                                this.field_h = param0;
                                return;
                              }
                            } else {
                              if (this.field_n) {
                                this.field_h = -1;
                                if (client.field_A) {
                                  if (this.field_h == param0) {
                                    this.field_n = true;
                                    this.field_h = param0;
                                    return;
                                  } else {
                                    this.field_o = true;
                                    this.field_n = true;
                                    this.field_h = param0;
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
                    }
                    if (-1 == (this.field_q ^ -1)) {
                      L10: {
                        if (this.field_n) {
                          break L10;
                        } else {
                          if (pm.field_b) {
                            break L10;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param0 >= 0) {
                        if (this.field_h == param0) {
                          this.field_n = true;
                          this.field_h = param0;
                          return;
                        } else {
                          this.field_o = true;
                          this.field_n = true;
                          this.field_h = param0;
                          return;
                        }
                      } else {
                        if (this.field_n) {
                          this.field_h = -1;
                          if (client.field_A) {
                            if (this.field_h == param0) {
                              this.field_n = true;
                              this.field_h = param0;
                              return;
                            } else {
                              this.field_o = true;
                              this.field_n = true;
                              this.field_h = param0;
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
                  } else {
                    return;
                  }
                }
              } else {
                if (param1 == -20563) {
                  L11: {
                    if (-1 != (ig.field_Yb ^ -1)) {
                      break L11;
                    } else {
                      if (-1 == (be.field_n ^ -1)) {
                        this.field_q = 0;
                        break L11;
                      } else {
                        if (-1 == (this.field_q ^ -1)) {
                          L12: {
                            if (this.field_n) {
                              break L12;
                            } else {
                              if (pm.field_b) {
                                break L12;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param0 >= 0) {
                            if (this.field_h == param0) {
                              this.field_n = true;
                              this.field_h = param0;
                              return;
                            } else {
                              this.field_o = true;
                              this.field_n = true;
                              this.field_h = param0;
                              return;
                            }
                          } else {
                            if (this.field_n) {
                              this.field_h = -1;
                              if (client.field_A) {
                                if (this.field_h == param0) {
                                  this.field_n = true;
                                  this.field_h = param0;
                                  return;
                                } else {
                                  this.field_o = true;
                                  this.field_n = true;
                                  this.field_h = param0;
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
                  }
                  if (-1 == (this.field_q ^ -1)) {
                    L13: {
                      if (this.field_n) {
                        break L13;
                      } else {
                        if (pm.field_b) {
                          break L13;
                        } else {
                          return;
                        }
                      }
                    }
                    if (param0 >= 0) {
                      if (this.field_h == param0) {
                        this.field_n = true;
                        this.field_h = param0;
                        return;
                      } else {
                        this.field_o = true;
                        this.field_n = true;
                        this.field_h = param0;
                        return;
                      }
                    } else {
                      if (this.field_n) {
                        this.field_h = -1;
                        if (client.field_A) {
                          if (this.field_h == param0) {
                            this.field_n = true;
                            this.field_h = param0;
                            return;
                          } else {
                            this.field_o = true;
                            this.field_n = true;
                            this.field_h = param0;
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
                } else {
                  return;
                }
              }
            } else {
              this.field_n = true;
              this.field_q = ig.field_Yb;
              this.field_p = ig.field_Yb;
              this.field_h = param2;
              this.field_j = ib.field_kb;
              if (this.field_q != 0) {
                if (be.field_n != 0) {
                  L14: {
                    if (this.field_j > 0) {
                      this.field_j = this.field_j - 1;
                      break L14;
                    } else {
                      this.field_j = qd.field_Ob;
                      this.field_j = this.field_j - 1;
                      break L14;
                    }
                  }
                  if (param1 == -20563) {
                    L15: {
                      if (-1 != (ig.field_Yb ^ -1)) {
                        break L15;
                      } else {
                        if (-1 == (be.field_n ^ -1)) {
                          this.field_q = 0;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (-1 == (this.field_q ^ -1)) {
                      L16: {
                        if (this.field_n) {
                          break L16;
                        } else {
                          if (pm.field_b) {
                            break L16;
                          } else {
                            return;
                          }
                        }
                      }
                      L17: {
                        if (param0 >= 0) {
                          break L17;
                        } else {
                          if (this.field_n) {
                            this.field_h = -1;
                            if (client.field_A) {
                              break L17;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      if (this.field_h == param0) {
                        this.field_n = true;
                        this.field_h = param0;
                        return;
                      } else {
                        this.field_o = true;
                        this.field_n = true;
                        this.field_h = param0;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (param1 == -20563) {
                    L18: {
                      if (-1 != (ig.field_Yb ^ -1)) {
                        break L18;
                      } else {
                        if (-1 == (be.field_n ^ -1)) {
                          this.field_q = 0;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    }
                    if (-1 == (this.field_q ^ -1)) {
                      L19: {
                        if (this.field_n) {
                          break L19;
                        } else {
                          if (pm.field_b) {
                            break L19;
                          } else {
                            return;
                          }
                        }
                      }
                      L20: {
                        if (param0 >= 0) {
                          break L20;
                        } else {
                          if (this.field_n) {
                            this.field_h = -1;
                            if (client.field_A) {
                              break L20;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      if (this.field_h == param0) {
                        this.field_n = true;
                        this.field_h = param0;
                        return;
                      } else {
                        this.field_o = true;
                        this.field_n = true;
                        this.field_h = param0;
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
                if (param1 == -20563) {
                  L21: {
                    if (-1 != (ig.field_Yb ^ -1)) {
                      break L21;
                    } else {
                      if (-1 == (be.field_n ^ -1)) {
                        this.field_q = 0;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                  }
                  if (-1 == (this.field_q ^ -1)) {
                    L22: {
                      if (this.field_n) {
                        break L22;
                      } else {
                        if (pm.field_b) {
                          break L22;
                        } else {
                          return;
                        }
                      }
                    }
                    L23: {
                      if (param0 >= 0) {
                        break L23;
                      } else {
                        if (this.field_n) {
                          this.field_h = -1;
                          if (client.field_A) {
                            break L23;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    if (this.field_h == param0) {
                      this.field_n = true;
                      this.field_h = param0;
                      return;
                    } else {
                      this.field_o = true;
                      this.field_n = true;
                      this.field_h = param0;
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
        }
    }

    final boolean b(byte param0) {
        if (param0 == 114) {
          if (0 == this.field_p) {
            if (84 != this.field_d) {
              if (-84 == (this.field_d ^ -1)) {
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

    public sk() {
        this.field_n = false;
        this.field_h = 0;
    }

    sk(int param0) {
        this.field_n = false;
        this.field_h = 0;
        this.field_l = param0;
    }

    static {
        field_i = "START!";
        field_a = new ei[2][8];
        field_m = "Private";
        field_b = "Draw?";
    }
}
