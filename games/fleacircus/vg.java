/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends wi {
    int field_B;
    int field_D;
    private boolean field_q;
    int field_C;
    private fa field_G;
    int field_w;
    static af field_r;
    static sg[] field_H;
    static String[] field_u;
    private boolean field_s;
    int field_F;
    int field_E;
    private int field_y;
    static int field_z;
    int field_A;
    static int[] field_I;
    private String field_t;
    static String field_v;
    int field_x;

    final static int c(int param0) {
        if (param0 >= -120) {
            vg.b((byte) -29);
            return m.field_a;
        }
        return m.field_a;
    }

    private final boolean f(int param0) {
        int var2;
        int var3;
        if (this.a((byte) 104)) {
          if (1 != kc.field_f) {
            var2 = 0;
            var2 = var2 != 0 & this.field_k ? 1 : 0;
            var3 = -124 % ((param0 - 42) / 43);
            return var2 != 0;
          } else {
            var2 = 1;
            var2 = var2 != 0 & this.field_k ? 1 : 0;
            var3 = -124 % ((param0 - 42) / 43);
            return var2 != 0;
          }
        } else {
          var2 = 0;
          var2 = var2 != 0 & this.field_k ? 1 : 0;
          var3 = -124 % ((param0 - 42) / 43);
          return var2 != 0;
        }
    }

    final static void b(byte param0) {
        ah.field_g[93] = 43;
        ah.field_g[59] = 57;
        ah.field_g[47] = 73;
        ah.field_g[44] = 71;
        ah.field_g[92] = 74;
        ah.field_g[192] = 28;
        ah.field_g[520] = 59;
        ah.field_g[222] = 58;
        ah.field_g[46] = 72;
        ah.field_g[45] = 26;
        ah.field_g[61] = 27;
        ah.field_g[91] = 42;
        if (param0 != 32) {
            vg.c((byte) -26);
        }
    }

    public static void c(byte param0) {
        field_I = null;
        field_v = null;
        field_r = null;
        field_H = null;
        if (param0 != -53) {
            return;
        }
        field_u = null;
    }

    final void b(boolean param0) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int var3;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          if (this.field_k) {
            L1: {
              this.d(-25579);
              if (!this.field_g) {
                break L1;
              } else {
                L2: {
                  if (-1 == (kc.field_f ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      stackIn_39_0 = 0;

                      if (this.field_s) {
                        stackIn_40_0 = stackIn_39_0;
                        stackIn_40_1 = 0;
                        break L3;
                      } else {
                        stackIn_40_0 = stackIn_39_0;
                        stackIn_40_1 = 1;
                        break L3;
                      }
                    }
                    L4: {
                      if (stackIn_40_0 == stackIn_40_1) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    this.field_s = true;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L5: {
                  this.field_s = false;
                  stackIn_44_0 = this;

                  if (-2 != (kc.field_f ^ -1)) {
                    stackIn_45_0 = this;
                    stackIn_45_1 = 0;
                    break L5;
                  } else {
                    stackIn_45_0 = this;
                    stackIn_45_1 = 1;
                    break L5;
                  }
                }
                ((vg) (this)).field_c = stackIn_45_1 != 0;
                if (!param0) {
                  vg.c(114);
                  return;
                } else {
                  return;
                }
              }
            }
            L6: {
              stackIn_51_0 = this;

              if (-2 != (kc.field_f ^ -1)) {
                stackIn_52_0 = this;
                stackIn_52_1 = 0;
                break L6;
              } else {
                stackIn_52_0 = this;
                stackIn_52_1 = 1;
                break L6;
              }
            }
            ((vg) (this)).field_c = stackIn_52_1 != 0;
            break L0;
          } else {
            this.field_c = false;
            this.field_g = false;
            if (var3 == 0) {
              break L0;
            } else {
              this.d(-25579);
              if (this.field_g) {
                if (-1 != (kc.field_f ^ -1)) {
                  L7: {
                    stackIn_19_0 = 0;

                    if (this.field_s) {
                      stackIn_20_0 = stackIn_19_0;
                      stackIn_20_1 = 0;
                      break L7;
                    } else {
                      stackIn_20_0 = stackIn_19_0;
                      stackIn_20_1 = 1;
                      break L7;
                    }
                  }
                  L8: {
                    if (stackIn_20_0 == stackIn_20_1) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  this.field_s = true;
                  if (var3 != 0) {
                    L9: {
                      this.field_s = false;
                      stackIn_30_0 = this;

                      if (-2 != (kc.field_f ^ -1)) {
                        stackIn_31_0 = this;
                        stackIn_31_1 = 0;
                        break L9;
                      } else {
                        stackIn_31_0 = this;
                        stackIn_31_1 = 1;
                        break L9;
                      }
                    }
                    ((vg) (this)).field_c = stackIn_31_1 != 0;
                    if (!param0) {
                      vg.c(114);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L10: {
                      stackIn_24_0 = this;

                      if (-2 != (kc.field_f ^ -1)) {
                        stackIn_25_0 = this;
                        stackIn_25_1 = 0;
                        break L10;
                      } else {
                        stackIn_25_0 = this;
                        stackIn_25_1 = 1;
                        break L10;
                      }
                    }
                    L11: {
                      ((vg) (this)).field_c = stackIn_25_1 != 0;
                      if (param0) {
                        break L11;
                      } else {
                        vg.c(114);
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  L12: {
                    this.field_s = false;
                    stackIn_12_0 = this;

                    if (-2 != (kc.field_f ^ -1)) {
                      stackIn_13_0 = this;
                      stackIn_13_1 = 0;
                      break L12;
                    } else {
                      stackIn_13_0 = this;
                      stackIn_13_1 = 1;
                      break L12;
                    }
                  }
                  ((vg) (this)).field_c = stackIn_13_1 != 0;
                  if (!param0) {
                    vg.c(114);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L13: {
                  stackIn_5_0 = this;

                  if (-2 != (kc.field_f ^ -1)) {
                    stackIn_6_0 = this;
                    stackIn_6_1 = 0;
                    break L13;
                  } else {
                    stackIn_6_0 = this;
                    stackIn_6_1 = 1;
                    break L13;
                  }
                }
                L14: {
                  ((vg) (this)).field_c = stackIn_6_1 != 0;
                  if (param0) {
                    break L14;
                  } else {
                    vg.c(114);
                    break L14;
                  }
                }
                return;
              }
            }
          }
        }
        if (!param0) {
          vg.c(114);
          return;
        } else {
          return;
        }
    }

    private final void d(int param0) {
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        Object stackIn_108_0 = null;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        Object stackIn_123_0 = null;
        Object stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        Object stackIn_145_0 = null;
        Object stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        Object stackIn_163_0 = null;
        Object stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        Object stackIn_178_0 = null;
        Object stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        Object stackIn_198_0 = null;
        Object stackIn_199_0 = null;
        int stackIn_199_1 = 0;
        Object stackIn_209_0 = null;
        Object stackIn_210_0 = null;
        int stackIn_210_1 = 0;
        Object stackIn_222_0 = null;
        Object stackIn_223_0 = null;
        int stackIn_223_1 = 0;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        if (!this.field_g) {
          L0: {
            if (this.a((byte) 89)) {
              if (kc.field_f != 1) {
                L1: {
                  L2: {
                    this.field_o = li.field_j;
                    if (this.field_q) {
                      break L2;
                    } else {
                      L3: {
                        if (this.f(109)) {
                          break L3;
                        } else {
                          this.field_g = false;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_g = true;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (this.f(-93)) {
                    L4: {
                      stackIn_163_0 = this;

                      if (this.field_g) {
                        stackIn_164_0 = this;
                        stackIn_164_1 = 0;
                        break L4;
                      } else {
                        stackIn_164_0 = this;
                        stackIn_164_1 = 1;
                        break L4;
                      }
                    }
                    ((vg) (this)).field_g = stackIn_164_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L5: {
                  if (param0 == -25579) {
                    break L5;
                  } else {
                    this.b(true);
                    break L5;
                  }
                }
                return;
              } else {
                this.field_o = ji.field_i;
                if (var3 == 0) {
                  break L0;
                } else {
                  L6: {
                    L7: {
                      this.field_o = li.field_j;
                      if (this.field_q) {
                        break L7;
                      } else {
                        L8: {
                          if (this.f(109)) {
                            break L8;
                          } else {
                            this.field_g = false;
                            if (var3 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        this.field_g = true;
                        if (var3 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (this.f(-93)) {
                      L9: {
                        stackIn_178_0 = this;

                        if (this.field_g) {
                          stackIn_179_0 = this;
                          stackIn_179_1 = 0;
                          break L9;
                        } else {
                          stackIn_179_0 = this;
                          stackIn_179_1 = 1;
                          break L9;
                        }
                      }
                      ((vg) (this)).field_g = stackIn_179_1 != 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (param0 != -25579) {
                    this.b(true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              this.field_o = id.field_g;
              if (var3 == 0) {
                break L0;
              } else {
                L10: {
                  if (kc.field_f != 1) {
                    this.field_o = li.field_j;
                    break L10;
                  } else {
                    this.field_o = ji.field_i;
                    this.field_o = li.field_j;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (this.field_q) {
                      break L12;
                    } else {
                      L13: {
                        if (this.f(109)) {
                          break L13;
                        } else {
                          this.field_g = false;
                          if (var3 == 0) {
                            break L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                      this.field_g = true;
                      if (var3 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (this.f(-93)) {
                    L14: {
                      stackIn_145_0 = this;

                      if (this.field_g) {
                        stackIn_146_0 = this;
                        stackIn_146_1 = 0;
                        break L14;
                      } else {
                        stackIn_146_0 = this;
                        stackIn_146_1 = 1;
                        break L14;
                      }
                    }
                    ((vg) (this)).field_g = stackIn_146_1 != 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L15: {
                  if (param0 == -25579) {
                    break L15;
                  } else {
                    this.b(true);
                    break L15;
                  }
                }
                return;
              }
            }
          }
          L16: {
            if (this.field_q) {
              if (this.f(-93)) {
                L17: {
                  stackIn_222_0 = this;

                  if (this.field_g) {
                    stackIn_223_0 = this;
                    stackIn_223_1 = 0;
                    break L17;
                  } else {
                    stackIn_223_0 = this;
                    stackIn_223_1 = 1;
                    break L17;
                  }
                }
                ((vg) (this)).field_g = stackIn_223_1 != 0;
                break L16;
              } else {
                if (param0 == -25579) {
                  return;
                } else {
                  this.b(true);
                  return;
                }
              }
            } else {
              if (this.f(109)) {
                this.field_g = true;
                if (var3 == 0) {
                  break L16;
                } else {
                  L18: {
                    if (this.f(-93)) {
                      L19: {
                        stackIn_209_0 = this;

                        if (this.field_g) {
                          stackIn_210_0 = this;
                          stackIn_210_1 = 0;
                          break L19;
                        } else {
                          stackIn_210_0 = this;
                          stackIn_210_1 = 1;
                          break L19;
                        }
                      }
                      ((vg) (this)).field_g = stackIn_210_1 != 0;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  if (param0 == -25579) {
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                }
              } else {
                this.field_g = false;
                if (var3 != 0) {
                  L20: {
                    this.field_g = true;
                    if (var3 == 0) {
                      break L20;
                    } else {
                      if (this.f(-93)) {
                        L21: {
                          stackIn_198_0 = this;

                          if (this.field_g) {
                            stackIn_199_0 = this;
                            stackIn_199_1 = 0;
                            break L21;
                          } else {
                            stackIn_199_0 = this;
                            stackIn_199_1 = 1;
                            break L21;
                          }
                        }
                        ((vg) (this)).field_g = stackIn_199_1 != 0;
                        break L20;
                      } else {
                        L22: {
                          if (param0 == -25579) {
                            break L22;
                          } else {
                            this.b(true);
                            break L22;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (param0 != -25579) {
                    this.b(true);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param0 != -25579) {
                    this.b(true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (param0 == -25579) {
            return;
          } else {
            this.b(true);
            return;
          }
        } else {
          this.field_o = ji.field_i;
          if (var3 != 0) {
            if (!this.a((byte) 89)) {
              this.field_o = id.field_g;
              if (var3 != 0) {
                if (kc.field_f == 1) {
                  this.field_o = ji.field_i;
                  if (var3 == 0) {
                    L23: {
                      L24: {
                        if (this.field_q) {
                          break L24;
                        } else {
                          L25: {
                            if (this.f(109)) {
                              break L25;
                            } else {
                              this.field_g = false;
                              if (var3 == 0) {
                                break L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                          this.field_g = true;
                          if (var3 == 0) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      if (this.f(-93)) {
                        L26: {
                          stackIn_123_0 = this;

                          if (this.field_g) {
                            stackIn_124_0 = this;
                            stackIn_124_1 = 0;
                            break L26;
                          } else {
                            stackIn_124_0 = this;
                            stackIn_124_1 = 1;
                            break L26;
                          }
                        }
                        ((vg) (this)).field_g = stackIn_124_1 != 0;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L27: {
                      if (param0 == -25579) {
                        break L27;
                      } else {
                        this.b(true);
                        break L27;
                      }
                    }
                    return;
                  } else {
                    this.field_o = li.field_j;
                    L28: {
                      L29: {
                        if (this.field_q) {
                          break L29;
                        } else {
                          L30: {
                            if (this.f(109)) {
                              break L30;
                            } else {
                              this.field_g = false;
                              if (var3 == 0) {
                                break L28;
                              } else {
                                break L30;
                              }
                            }
                          }
                          this.field_g = true;
                          if (var3 == 0) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      if (this.f(-93)) {
                        L31: {
                          stackIn_108_0 = this;

                          if (this.field_g) {
                            stackIn_109_0 = this;
                            stackIn_109_1 = 0;
                            break L31;
                          } else {
                            stackIn_109_0 = this;
                            stackIn_109_1 = 1;
                            break L31;
                          }
                        }
                        ((vg) (this)).field_g = stackIn_109_1 != 0;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L32: {
                      if (param0 == -25579) {
                        break L32;
                      } else {
                        this.b(true);
                        break L32;
                      }
                    }
                    return;
                  }
                } else {
                  this.field_o = li.field_j;
                  L33: {
                    L34: {
                      if (this.field_q) {
                        break L34;
                      } else {
                        L35: {
                          if (this.f(109)) {
                            break L35;
                          } else {
                            this.field_g = false;
                            if (var3 == 0) {
                              break L33;
                            } else {
                              break L35;
                            }
                          }
                        }
                        this.field_g = true;
                        if (var3 == 0) {
                          break L33;
                        } else {
                          break L34;
                        }
                      }
                    }
                    if (this.f(-93)) {
                      L36: {
                        stackIn_91_0 = this;

                        if (this.field_g) {
                          stackIn_92_0 = this;
                          stackIn_92_1 = 0;
                          break L36;
                        } else {
                          stackIn_92_0 = this;
                          stackIn_92_1 = 1;
                          break L36;
                        }
                      }
                      ((vg) (this)).field_g = stackIn_92_1 != 0;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  L37: {
                    if (param0 == -25579) {
                      break L37;
                    } else {
                      this.b(true);
                      break L37;
                    }
                  }
                  return;
                }
              } else {
                L38: {
                  L39: {
                    if (this.field_q) {
                      break L39;
                    } else {
                      L40: {
                        if (this.f(109)) {
                          break L40;
                        } else {
                          this.field_g = false;
                          if (var3 == 0) {
                            break L38;
                          } else {
                            break L40;
                          }
                        }
                      }
                      this.field_g = true;
                      if (var3 == 0) {
                        break L38;
                      } else {
                        break L39;
                      }
                    }
                  }
                  if (this.f(-93)) {
                    L41: {
                      stackIn_73_0 = this;

                      if (this.field_g) {
                        stackIn_74_0 = this;
                        stackIn_74_1 = 0;
                        break L41;
                      } else {
                        stackIn_74_0 = this;
                        stackIn_74_1 = 1;
                        break L41;
                      }
                    }
                    ((vg) (this)).field_g = stackIn_74_1 != 0;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L42: {
                  if (param0 == -25579) {
                    break L42;
                  } else {
                    this.b(true);
                    break L42;
                  }
                }
                return;
              }
            } else {
              L43: {
                if (kc.field_f != 1) {
                  this.field_o = li.field_j;
                  break L43;
                } else {
                  this.field_o = ji.field_i;
                  if (var3 == 0) {
                    break L43;
                  } else {
                    this.field_o = li.field_j;
                    break L43;
                  }
                }
              }
              L44: {
                L45: {
                  if (this.field_q) {
                    break L45;
                  } else {
                    L46: {
                      if (this.f(109)) {
                        break L46;
                      } else {
                        this.field_g = false;
                        if (var3 == 0) {
                          break L44;
                        } else {
                          break L46;
                        }
                      }
                    }
                    this.field_g = true;
                    if (var3 == 0) {
                      break L44;
                    } else {
                      break L45;
                    }
                  }
                }
                if (this.f(-93)) {
                  L47: {
                    stackIn_57_0 = this;

                    if (this.field_g) {
                      stackIn_58_0 = this;
                      stackIn_58_1 = 0;
                      break L47;
                    } else {
                      stackIn_58_0 = this;
                      stackIn_58_1 = 1;
                      break L47;
                    }
                  }
                  ((vg) (this)).field_g = stackIn_58_1 != 0;
                  break L44;
                } else {
                  break L44;
                }
              }
              L48: {
                if (param0 == -25579) {
                  break L48;
                } else {
                  this.b(true);
                  break L48;
                }
              }
              return;
            }
          } else {
            if (!this.field_q) {
              if (this.f(109)) {
                this.field_g = true;
                if (var3 != 0) {
                  L49: {
                    if (this.f(-93)) {
                      L50: {
                        stackIn_35_0 = this;

                        if (this.field_g) {
                          stackIn_36_0 = this;
                          stackIn_36_1 = 0;
                          break L50;
                        } else {
                          stackIn_36_0 = this;
                          stackIn_36_1 = 1;
                          break L50;
                        }
                      }
                      ((vg) (this)).field_g = stackIn_36_1 != 0;
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                  L51: {
                    if (param0 == -25579) {
                      break L51;
                    } else {
                      this.b(true);
                      break L51;
                    }
                  }
                  return;
                } else {
                  L52: {
                    if (param0 == -25579) {
                      break L52;
                    } else {
                      this.b(true);
                      break L52;
                    }
                  }
                  return;
                }
              } else {
                this.field_g = false;
                if (var3 != 0) {
                  L53: {
                    this.field_g = true;
                    if (this.f(-93)) {
                      L54: {
                        stackIn_21_0 = this;

                        if (this.field_g) {
                          stackIn_22_0 = this;
                          stackIn_22_1 = 0;
                          break L54;
                        } else {
                          stackIn_22_0 = this;
                          stackIn_22_1 = 1;
                          break L54;
                        }
                      }
                      ((vg) (this)).field_g = stackIn_22_1 != 0;
                      break L53;
                    } else {
                      break L53;
                    }
                  }
                  L55: {
                    if (param0 == -25579) {
                      break L55;
                    } else {
                      this.b(true);
                      break L55;
                    }
                  }
                  return;
                } else {
                  L56: {
                    if (param0 == -25579) {
                      break L56;
                    } else {
                      this.b(true);
                      break L56;
                    }
                  }
                  return;
                }
              }
            } else {
              L57: {
                if (this.f(-93)) {
                  L58: {
                    stackIn_7_0 = this;

                    if (this.field_g) {
                      stackIn_8_0 = this;
                      stackIn_8_1 = 0;
                      break L58;
                    } else {
                      stackIn_8_0 = this;
                      stackIn_8_1 = 1;
                      break L58;
                    }
                  }
                  ((vg) (this)).field_g = stackIn_8_1 != 0;
                  break L57;
                } else {
                  break L57;
                }
              }
              L59: {
                if (param0 == -25579) {
                  break L59;
                } else {
                  this.b(true);
                  break L59;
                }
              }
              return;
            }
          }
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = fleas.field_A ? 1 : 0;
                    if (ji.field_i == this.field_o) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = this.field_B;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = this.field_w;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var2 = stackIn_3_0;
                    if (ji.field_i != this.field_o) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_6_0 = this.field_B;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = this.field_w;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var3 = stackIn_6_0;
                    if (param0 == -1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_F = -98;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((this.field_A ^ -1) > -256) {
                        statePc = 32;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    gb.e(this.field_l, this.field_a, this.field_n, this.field_d, this.field_E);
                    var4 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var4 >= this.field_D) {
                        statePc = 29;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    gb.d(this.field_l + var4, var4 + this.field_a, -var4 + (this.field_l + this.field_n), var4 + this.field_a, var3);
                    gb.d(var4 + this.field_l, this.field_a - -var4, this.field_l - -var4, -var4 + (this.field_a - -this.field_d), var3);
                    gb.d(var4 + this.field_l, -var4 + this.field_a + this.field_d, this.field_n + this.field_l - var4, -var4 + this.field_d + this.field_a, var2);
                    gb.d(this.field_n + (this.field_l + -var4), var4 + this.field_a, this.field_l - (-this.field_n - -var4), this.field_a + (this.field_d + -var4), var2);
                    var4++;
                    if (var5 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    if (var5 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var5 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    gb.a(ia.field_q);
                    this.field_G.a(this.field_t, (this.field_n >> -836297087) + this.field_l + this.field_y, this.field_a + (this.field_C - -(this.field_d >> -270619007)) - -(this.field_G.field_y >> -815560191), this.field_F, this.field_x);
                    gb.b(ia.field_q);
                    return;
                }
                case 17: {
                    if (0 < this.field_A) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    gb.a(ia.field_q);
                    this.field_G.a(this.field_t, (this.field_n >> -836297087) + this.field_l + this.field_y, this.field_a + (this.field_C - -(this.field_d >> -270619007)) - -(this.field_G.field_y >> -815560191), this.field_F, this.field_x);
                    gb.b(ia.field_q);
                    return;
                }
                case 20: {
                    gb.g(this.field_l, this.field_a, this.field_n, this.field_d, this.field_E, this.field_A);
                    var4 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (this.field_D > var4) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    gb.a(ia.field_q);
                    this.field_G.a(this.field_t, (this.field_n >> -836297087) + this.field_l + this.field_y, this.field_a + (this.field_C - -(this.field_d >> -270619007)) - -(this.field_G.field_y >> -815560191), this.field_F, this.field_x);
                    gb.b(ia.field_q);
                    return;
                }
                case 24: {
                    gb.f(var4 + this.field_l, var4 + this.field_a, -var4 + this.field_n + this.field_l, this.field_a + var4, var3, this.field_A);
                    gb.f(this.field_l - -var4, var4 + this.field_a, var4 + this.field_l, -var4 + (this.field_d + this.field_a), var3, this.field_A);
                    gb.f(this.field_l + var4, this.field_a - -this.field_d - var4, -var4 + this.field_n + this.field_l, this.field_d + (this.field_a + -var4), var2, this.field_A);
                    gb.f(this.field_n + (this.field_l + -var4), var4 + this.field_a, this.field_l - (-this.field_n + var4), this.field_a + (this.field_d + -var4), var2, this.field_A);
                    var4++;
                    if (var5 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                case 26: {
                    if (var5 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    gb.a(ia.field_q);
                    this.field_G.a(this.field_t, (this.field_n >> -836297087) + this.field_l + this.field_y, this.field_a + (this.field_C - -(this.field_d >> -270619007)) - -(this.field_G.field_y >> -815560191), this.field_F, this.field_x);
                    gb.b(ia.field_q);
                    return;
                }
                case 29: {
                    if (var5 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    gb.a(ia.field_q);
                    this.field_G.a(this.field_t, (this.field_n >> -836297087) + this.field_l + this.field_y, this.field_a + (this.field_C - -(this.field_d >> -270619007)) - -(this.field_G.field_y >> -815560191), this.field_F, this.field_x);
                    gb.b(ia.field_q);
                    return;
                }
                case 32: {
                    if (0 < this.field_A) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    gb.a(ia.field_q);
                    this.field_G.a(this.field_t, (this.field_n >> -836297087) + this.field_l + this.field_y, this.field_a + (this.field_C - -(this.field_d >> -270619007)) - -(this.field_G.field_y >> -815560191), this.field_F, this.field_x);
                    gb.b(ia.field_q);
                    return;
                }
                case 34: {
                    gb.g(this.field_l, this.field_a, this.field_n, this.field_d, this.field_E, this.field_A);
                    var4 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (this.field_D > var4) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    gb.a(ia.field_q);
                    this.field_G.a(this.field_t, (this.field_n >> -836297087) + this.field_l + this.field_y, this.field_a + (this.field_C - -(this.field_d >> -270619007)) - -(this.field_G.field_y >> -815560191), this.field_F, this.field_x);
                    gb.b(ia.field_q);
                    return;
                }
                case 37: {
                    gb.f(var4 + this.field_l, var4 + this.field_a, -var4 + this.field_n + this.field_l, this.field_a + var4, var3, this.field_A);
                    gb.f(this.field_l - -var4, var4 + this.field_a, var4 + this.field_l, -var4 + (this.field_d + this.field_a), var3, this.field_A);
                    gb.f(this.field_l + var4, this.field_a - -this.field_d - var4, -var4 + this.field_n + this.field_l, this.field_d + (this.field_a + -var4), var2, this.field_A);
                    gb.f(this.field_n + (this.field_l + -var4), var4 + this.field_a, this.field_l - (-this.field_n + var4), this.field_a + (this.field_d + -var4), var2, this.field_A);
                    var4++;
                    if (var5 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var5 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    gb.a(ia.field_q);
                    this.field_G.a(this.field_t, (this.field_n >> -836297087) + this.field_l + this.field_y, this.field_a + (this.field_C - -(this.field_d >> -270619007)) - -(this.field_G.field_y >> -815560191), this.field_F, this.field_x);
                    gb.b(ia.field_q);
                    return;
                }
                case 40: {
                    if (0 >= this.field_A) {
                        statePc = 46;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    gb.g(this.field_l, this.field_a, this.field_n, this.field_d, this.field_E, this.field_A);
                    var4 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (this.field_D <= var4) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    gb.f(var4 + this.field_l, var4 + this.field_a, -var4 + this.field_n + this.field_l, this.field_a + var4, var3, this.field_A);
                    gb.f(this.field_l - -var4, var4 + this.field_a, var4 + this.field_l, -var4 + (this.field_d + this.field_a), var3, this.field_A);
                    gb.f(this.field_l + var4, this.field_a - -this.field_d - var4, -var4 + this.field_n + this.field_l, this.field_d + (this.field_a + -var4), var2, this.field_A);
                    gb.f(this.field_n + (this.field_l + -var4), var4 + this.field_a, this.field_l - (-this.field_n + var4), this.field_a + (this.field_d + -var4), var2, this.field_A);
                    var4++;
                    if (var5 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var5 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    gb.a(ia.field_q);
                    this.field_G.a(this.field_t, (this.field_n >> -836297087) + this.field_l + this.field_y, this.field_a + (this.field_C - -(this.field_d >> -270619007)) - -(this.field_G.field_y >> -815560191), this.field_F, this.field_x);
                    gb.b(ia.field_q);
                    return;
                }
                case 46: {
                    gb.a(ia.field_q);
                    this.field_G.a(this.field_t, (this.field_n >> -836297087) + this.field_l + this.field_y, this.field_a + (this.field_C - -(this.field_d >> -270619007)) - -(this.field_G.field_y >> -815560191), this.field_F, this.field_x);
                    gb.b(ia.field_q);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    vg(String param0, int param1, int param2, fa param3) {
        this.field_C = 0;
        this.field_w = 12369084;
        this.field_D = 1;
        this.field_y = 0;
        this.field_s = false;
        this.field_q = false;
        this.field_E = 8421504;
        this.field_B = 4737096;
        this.field_F = 16777215;
        this.field_A = 255;
        this.field_x = 0;
        try {
            this.field_t = param0;
            this.field_a = param1;
            this.field_n = 69;
            this.field_G = param3;
            this.field_l = param2;
            this.field_d = this.field_G.field_H + this.field_G.field_K;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = "There are a few limitations on what you can do with these tiles though:";
    }
}
