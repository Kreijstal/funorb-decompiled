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
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            sk.e(-70);
            if (this.field_q == 0) {
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
            if (this.field_q == 0) {
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

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 111) {
          L0: {
            field_g = (ck) null;
            if ((this.field_d ^ -1) != -103) {
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
            if ((this.field_d ^ -1) != -103) {
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
          if (!param3) {
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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_45_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (param3 > 36) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          if (var8 >= var7) {
                            break L5;
                          } else {
                            var9 = param1.charAt(var8);
                            var13 = var8;
                            var12 = 0;
                            if (var11 != 0) {
                              if (var12 == var13) {
                                break L3;
                              } else {
                                break L4;
                              }
                            } else {
                              L6: {
                                L7: {
                                  if (var12 == var13) {
                                    L8: {
                                      if (var9 == 45) {
                                        var4_int = 1;
                                        if (var11 == 0) {
                                          break L6;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    if (var9 != 43) {
                                      break L7;
                                    } else {
                                      if (!param2) {
                                        break L7;
                                      } else {
                                        if (var11 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                                L9: {
                                  L10: {
                                    if (48 > var9) {
                                      break L10;
                                    } else {
                                      if (57 < var9) {
                                        break L10;
                                      } else {
                                        var9 -= 48;
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (65 > var9) {
                                      break L11;
                                    } else {
                                      if (var9 > 90) {
                                        break L11;
                                      } else {
                                        var9 -= 55;
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var9 < 97) {
                                      break L12;
                                    } else {
                                      if (var9 > 122) {
                                        break L12;
                                      } else {
                                        var9 -= 87;
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          return false;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_31_0 = 0;
                                  stackIn_32_0 = stackOut_31_0;
                                  decompiledRegionSelector0 = 0;
                                  break L0;
                                }
                                if (var9 < param3) {
                                  L13: {
                                    if (var4_int == 0) {
                                      break L13;
                                    } else {
                                      var9 = -var9;
                                      break L13;
                                    }
                                  }
                                  var10 = var9 + var6 * param3;
                                  if (var10 / param3 == var6) {
                                    var5 = 1;
                                    var6 = var10;
                                    break L6;
                                  } else {
                                    stackOut_39_0 = 0;
                                    stackIn_40_0 = stackOut_39_0;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  }
                                } else {
                                  stackOut_34_0 = 0;
                                  stackIn_35_0 = stackOut_34_0;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                              var8++;
                              if (var11 == 0) {
                                continue L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        if (param0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      field_b = (String) null;
                      break L3;
                    }
                    stackOut_45_0 = var5;
                    stackIn_46_0 = stackOut_45_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var4);
            stackOut_47_1 = new StringBuilder().append("sk.O(").append(param0).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L14;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L14;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_32_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_35_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_40_0 != 0;
            } else {
              return stackIn_46_0 != 0;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 < -52) {
          param0 = param0 & 8191;
          if (-4097 < (param0 ^ -1)) {
            L0: {
              if (param0 >= 2048) {
                stackOut_18_0 = pd.field_i[4096 - param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = pd.field_i[param0];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-6145 < (param0 ^ -1)) {
                stackOut_14_0 = -pd.field_i[-4096 + param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -pd.field_i[-param0 + 8192];
                stackIn_15_0 = stackOut_13_0;
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
                stackOut_8_0 = pd.field_i[4096 - param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = pd.field_i[param0];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-6145 < (param0 ^ -1)) {
                stackOut_4_0 = -pd.field_i[-4096 + param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -pd.field_i[-param0 + 8192];
                stackIn_5_0 = stackOut_3_0;
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
