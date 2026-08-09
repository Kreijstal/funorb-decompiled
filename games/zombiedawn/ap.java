/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap extends al {
    private int field_D;
    private boolean field_H;
    private boolean field_t;
    private int field_x;
    static int field_u;
    private int field_q;
    private int field_G;
    static long field_m;
    private boolean field_F;
    private boolean field_o;
    private int field_n;
    private int field_E;
    private int field_B;
    private int field_A;
    private int field_z;
    static String field_w;
    static String field_s;
    private int field_p;
    private int field_r;
    private boolean field_y;
    private int field_v;

    public static void a(boolean param0) {
        if (param0) {
            field_s = (String) null;
            field_w = null;
            field_s = null;
            return;
        }
        field_w = null;
        field_s = null;
    }

    ap(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, ua.field_a);
        this.field_x = 0;
        this.field_o = false;
        this.field_F = false;
        this.field_H = false;
        this.field_G = 8;
        this.field_y = false;
        this.field_t = false;
        this.field_v = 8;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, boolean param5, boolean param6, boolean param7) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int[] stackIn_44_1 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_76_0 = null;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        int[] stackIn_91_1 = null;
        Object stackIn_94_0 = null;
        Object stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        Object stackIn_97_0 = null;
        Object stackIn_98_0 = null;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        Object stackIn_102_0 = null;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        Object stackIn_105_0 = null;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        Object stackIn_108_0 = null;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        Object stackIn_111_0 = null;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        Object stackIn_124_0 = null;
        Object stackIn_125_0 = null;
        int[] stackIn_125_1 = null;
        Object stackIn_128_0 = null;
        Object stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        Object stackIn_141_0 = null;
        Object stackIn_142_0 = null;
        int[] stackIn_142_1 = null;
        Object stackIn_145_0 = null;
        Object stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        Object stackIn_161_0 = null;
        Object stackIn_162_0 = null;
        int[] stackIn_162_1 = null;
        Object stackIn_165_0 = null;
        Object stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        Object stackIn_173_0 = null;
        Object stackIn_174_0 = null;
        int[] stackIn_174_1 = null;
        Object stackIn_177_0 = null;
        Object stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        Object stackIn_187_0 = null;
        Object stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        Object stackIn_195_0 = null;
        Object stackIn_196_0 = null;
        int[] stackIn_196_1 = null;
        Object stackIn_199_0 = null;
        Object stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        int var10;
        L0: {
          L1: {
            var10 = ZombieDawn.field_J;
            this.field_D = param4;
            this.field_r = param2;
            stackIn_51_0 = this;

            if (!param6) {
              break L1;
            } else {
              stackIn_50_0 = this;

              if (3 == param1) {
                stackIn_52_0 = this;
                stackIn_52_1 = 1;
                break L0;
              } else {
                stackIn_51_0 = this;

                if ((param1 ^ -1) != -8) {
                  break L1;
                } else {
                  L2: {
                    ((ap) (this)).field_y = true;
                    stackIn_5_0 = this;

                    if (5 != param1) {
                      stackIn_6_0 = this;
                      stackIn_6_1 = 0;
                      break L2;
                    } else {
                      stackIn_6_0 = this;
                      stackIn_6_1 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      ((ap) (this)).field_t = stackIn_6_1 != 0;
                      this.field_p = param0;
                      stackIn_11_0 = this;

                      if (!param6) {
                        break L4;
                      } else {
                        L5: {
                          stackIn_10_0 = this;

                          if (-7 == (param1 ^ -1)) {
                            break L5;
                          } else {
                            stackIn_11_0 = this;

                            if (param1 != 1) {
                              break L4;
                            } else {
                              stackIn_10_0 = this;
                              break L5;
                            }
                          }
                        }
                        stackIn_12_0 = this;
                        stackIn_12_1 = 1;
                        break L3;
                      }
                    }
                    stackIn_12_0 = this;
                    stackIn_12_1 = 0;
                    break L3;
                  }
                  L6: {
                    L7: {
                      ((ap) (this)).field_o = stackIn_12_1 != 0;
                      stackIn_15_0 = this;

                      if (!param5) {
                        break L7;
                      } else {
                        stackIn_15_0 = this;

                        if (this.field_r <= 0) {
                          break L7;
                        } else {
                          stackIn_16_0 = this;
                          stackIn_16_1 = 1;
                          break L6;
                        }
                      }
                    }
                    stackIn_16_0 = this;
                    stackIn_16_1 = 0;
                    break L6;
                  }
                  L8: {
                    ((ap) (this)).field_H = stackIn_16_1 != 0;
                    stackIn_18_0 = this;

                    if (vi.field_a) {
                      stackIn_19_0 = this;
                      stackIn_19_1 = f.field_c;
                      break L8;
                    } else {
                      stackIn_19_0 = this;
                      stackIn_19_1 = ja.field_a;
                      break L8;
                    }
                  }
                  L9: {
                    ((ap) (this)).field_A = stackIn_19_1;
                    stackIn_21_0 = this;

                    if (vi.field_a) {
                      stackIn_22_0 = this;
                      stackIn_22_1 = mf.field_c;
                      break L9;
                    } else {
                      stackIn_22_0 = this;
                      stackIn_22_1 = cn.field_g;
                      break L9;
                    }
                  }
                  L10: {
                    ((ap) (this)).field_E = stackIn_22_1;
                    stackIn_24_0 = this;

                    if (!vi.field_a) {
                      stackIn_25_0 = this;
                      stackIn_25_1 = gk.field_G;
                      break L10;
                    } else {
                      stackIn_25_0 = this;
                      stackIn_25_1 = lo.field_m;
                      break L10;
                    }
                  }
                  L11: {
                    ((ap) (this)).field_n = stackIn_25_1;
                    this.field_G = 8;
                    if (!param6) {
                      break L11;
                    } else {
                      if ((param1 ^ -1) != -7) {
                        break L11;
                      } else {
                        L12: {
                          stackIn_29_0 = this;

                          if (-1 <= (param4 ^ -1)) {
                            stackIn_30_0 = this;
                            stackIn_30_1 = 0;
                            break L12;
                          } else {
                            stackIn_30_0 = this;
                            stackIn_30_1 = 1;
                            break L12;
                          }
                        }
                        ((ap) (this)).field_H = stackIn_30_1 != 0;
                        this.field_A = this.field_A * 5;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    this.field_v = 8;
                    this.field_B = 50;
                    this.field_z = 50;
                    if (param3 < -19) {
                      break L13;
                    } else {
                      this.a((byte) -39);
                      break L13;
                    }
                  }
                  L14: {
                    if (!param6) {
                      L15: {
                        if (!param5) {
                          L16: {
                            stackIn_43_0 = this;

                            if (dj.field_e.b(-25983)) {
                              stackIn_44_0 = this;
                              stackIn_44_1 = kc.field_Y;
                              break L16;
                            } else {
                              stackIn_44_0 = this;
                              stackIn_44_1 = po.field_wb;
                              break L16;
                            }
                          }
                          ((ap) (this)).field_h = stackIn_44_1;
                          break L15;
                        } else {
                          this.field_h = ua.field_a;
                          break L15;
                        }
                      }
                      L17: {
                        stackIn_47_0 = this;

                        if (param5) {
                          stackIn_48_0 = this;
                          stackIn_48_1 = 1;
                          break L17;
                        } else {
                          stackIn_48_0 = this;
                          stackIn_48_1 = 2;
                          break L17;
                        }
                      }
                      ((ap) (this)).field_x = stackIn_48_1;
                      break L14;
                    } else {
                      this.field_x = -1;
                      this.field_h = ua.field_a;
                      if (3 == param1) {
                        this.field_q = 1;
                        this.field_h = fe.field_G;
                        break L14;
                      } else {
                        if ((param1 ^ -1) != -8) {
                          break L14;
                        } else {
                          this.field_q = 1;
                          this.field_h = fe.field_G;
                          break L14;
                        }
                      }
                    }
                  }
                  this.field_F = this.field_t;
                  this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
                  return;
                }
              }
            }
          }
          stackIn_52_0 = this;
          stackIn_52_1 = 0;
          break L0;
        }
        L18: {
          L19: {
            ((ap) (this)).field_y = stackIn_52_1 != 0;
            stackIn_55_0 = this;

            if (!param6) {
              break L19;
            } else {
              stackIn_55_0 = this;

              if (5 != param1) {
                break L19;
              } else {
                stackIn_56_0 = this;
                stackIn_56_1 = 1;
                break L18;
              }
            }
          }
          stackIn_56_0 = this;
          stackIn_56_1 = 0;
          break L18;
        }
        L20: {
          L21: {
            ((ap) (this)).field_t = stackIn_56_1 != 0;
            this.field_p = param0;
            stackIn_98_0 = this;

            if (!param6) {
              break L21;
            } else {
              stackIn_97_0 = this;

              if (-7 == (param1 ^ -1)) {
                stackIn_99_0 = this;
                stackIn_99_1 = 1;
                break L20;
              } else {
                stackIn_98_0 = this;

                if (param1 != 1) {
                  break L21;
                } else {
                  L22: {
                    L23: {
                      ((ap) (this)).field_o = true;
                      stackIn_62_0 = this;

                      if (!param5) {
                        break L23;
                      } else {
                        stackIn_62_0 = this;

                        if (this.field_r <= 0) {
                          break L23;
                        } else {
                          stackIn_63_0 = this;
                          stackIn_63_1 = 1;
                          break L22;
                        }
                      }
                    }
                    stackIn_63_0 = this;
                    stackIn_63_1 = 0;
                    break L22;
                  }
                  L24: {
                    ((ap) (this)).field_H = stackIn_63_1 != 0;
                    stackIn_65_0 = this;

                    if (vi.field_a) {
                      stackIn_66_0 = this;
                      stackIn_66_1 = f.field_c;
                      break L24;
                    } else {
                      stackIn_66_0 = this;
                      stackIn_66_1 = ja.field_a;
                      break L24;
                    }
                  }
                  L25: {
                    ((ap) (this)).field_A = stackIn_66_1;
                    stackIn_68_0 = this;

                    if (vi.field_a) {
                      stackIn_69_0 = this;
                      stackIn_69_1 = mf.field_c;
                      break L25;
                    } else {
                      stackIn_69_0 = this;
                      stackIn_69_1 = cn.field_g;
                      break L25;
                    }
                  }
                  L26: {
                    ((ap) (this)).field_E = stackIn_69_1;
                    stackIn_71_0 = this;

                    if (!vi.field_a) {
                      stackIn_72_0 = this;
                      stackIn_72_1 = gk.field_G;
                      break L26;
                    } else {
                      stackIn_72_0 = this;
                      stackIn_72_1 = lo.field_m;
                      break L26;
                    }
                  }
                  L27: {
                    ((ap) (this)).field_n = stackIn_72_1;
                    this.field_G = 8;
                    if (!param6) {
                      break L27;
                    } else {
                      if ((param1 ^ -1) != -7) {
                        break L27;
                      } else {
                        L28: {
                          stackIn_76_0 = this;

                          if (-1 <= (param4 ^ -1)) {
                            stackIn_77_0 = this;
                            stackIn_77_1 = 0;
                            break L28;
                          } else {
                            stackIn_77_0 = this;
                            stackIn_77_1 = 1;
                            break L28;
                          }
                        }
                        ((ap) (this)).field_H = stackIn_77_1 != 0;
                        this.field_A = this.field_A * 5;
                        break L27;
                      }
                    }
                  }
                  L29: {
                    this.field_v = 8;
                    this.field_B = 50;
                    this.field_z = 50;
                    if (param3 < -19) {
                      break L29;
                    } else {
                      this.a((byte) -39);
                      break L29;
                    }
                  }
                  L30: {
                    if (!param6) {
                      L31: {
                        if (!param5) {
                          L32: {
                            stackIn_90_0 = this;

                            if (dj.field_e.b(-25983)) {
                              stackIn_91_0 = this;
                              stackIn_91_1 = kc.field_Y;
                              break L32;
                            } else {
                              stackIn_91_0 = this;
                              stackIn_91_1 = po.field_wb;
                              break L32;
                            }
                          }
                          ((ap) (this)).field_h = stackIn_91_1;
                          break L31;
                        } else {
                          this.field_h = ua.field_a;
                          break L31;
                        }
                      }
                      L33: {
                        stackIn_94_0 = this;

                        if (param5) {
                          stackIn_95_0 = this;
                          stackIn_95_1 = 1;
                          break L33;
                        } else {
                          stackIn_95_0 = this;
                          stackIn_95_1 = 2;
                          break L33;
                        }
                      }
                      ((ap) (this)).field_x = stackIn_95_1;
                      break L30;
                    } else {
                      this.field_x = -1;
                      this.field_h = ua.field_a;
                      if (3 == param1) {
                        this.field_q = 1;
                        this.field_h = fe.field_G;
                        break L30;
                      } else {
                        if ((param1 ^ -1) != -8) {
                          break L30;
                        } else {
                          this.field_q = 1;
                          this.field_h = fe.field_G;
                          break L30;
                        }
                      }
                    }
                  }
                  this.field_F = this.field_t;
                  this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
                  return;
                }
              }
            }
          }
          stackIn_99_0 = this;
          stackIn_99_1 = 0;
          break L20;
        }
        L34: {
          L35: {
            ((ap) (this)).field_o = stackIn_99_1 != 0;
            stackIn_102_0 = this;

            if (!param5) {
              break L35;
            } else {
              stackIn_102_0 = this;

              if (this.field_r <= 0) {
                break L35;
              } else {
                stackIn_103_0 = this;
                stackIn_103_1 = 1;
                break L34;
              }
            }
          }
          stackIn_103_0 = this;
          stackIn_103_1 = 0;
          break L34;
        }
        L36: {
          ((ap) (this)).field_H = stackIn_103_1 != 0;
          stackIn_105_0 = this;

          if (vi.field_a) {
            stackIn_106_0 = this;
            stackIn_106_1 = f.field_c;
            break L36;
          } else {
            stackIn_106_0 = this;
            stackIn_106_1 = ja.field_a;
            break L36;
          }
        }
        L37: {
          ((ap) (this)).field_A = stackIn_106_1;
          stackIn_108_0 = this;

          if (vi.field_a) {
            stackIn_109_0 = this;
            stackIn_109_1 = mf.field_c;
            break L37;
          } else {
            stackIn_109_0 = this;
            stackIn_109_1 = cn.field_g;
            break L37;
          }
        }
        L38: {
          ((ap) (this)).field_E = stackIn_109_1;
          stackIn_111_0 = this;

          if (!vi.field_a) {
            stackIn_112_0 = this;
            stackIn_112_1 = gk.field_G;
            break L38;
          } else {
            stackIn_112_0 = this;
            stackIn_112_1 = lo.field_m;
            break L38;
          }
        }
        ((ap) (this)).field_n = stackIn_112_1;
        this.field_G = 8;
        if (param6) {
          if ((param1 ^ -1) == -7) {
            L39: {
              stackIn_187_0 = this;

              if (-1 <= (param4 ^ -1)) {
                stackIn_188_0 = this;
                stackIn_188_1 = 0;
                break L39;
              } else {
                stackIn_188_0 = this;
                stackIn_188_1 = 1;
                break L39;
              }
            }
            L40: {
              ((ap) (this)).field_H = stackIn_188_1 != 0;
              this.field_A = this.field_A * 5;
              this.field_v = 8;
              this.field_B = 50;
              this.field_z = 50;
              if (param3 < -19) {
                break L40;
              } else {
                this.a((byte) -39);
                break L40;
              }
            }
            if (param6) {
              this.field_x = -1;
              this.field_h = ua.field_a;
              if (3 != param1) {
                if ((param1 ^ -1) == -8) {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                  this.field_F = this.field_t;
                  this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
                  return;
                } else {
                  this.field_F = this.field_t;
                  this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
                  return;
                }
              } else {
                this.field_q = 1;
                this.field_h = fe.field_G;
                this.field_F = this.field_t;
                this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
                return;
              }
            } else {
              L41: {
                if (!param5) {
                  L42: {
                    stackIn_195_0 = this;

                    if (dj.field_e.b(-25983)) {
                      stackIn_196_0 = this;
                      stackIn_196_1 = kc.field_Y;
                      break L42;
                    } else {
                      stackIn_196_0 = this;
                      stackIn_196_1 = po.field_wb;
                      break L42;
                    }
                  }
                  ((ap) (this)).field_h = stackIn_196_1;
                  break L41;
                } else {
                  this.field_h = ua.field_a;
                  break L41;
                }
              }
              L43: {
                stackIn_199_0 = this;

                if (param5) {
                  stackIn_200_0 = this;
                  stackIn_200_1 = 1;
                  break L43;
                } else {
                  stackIn_200_0 = this;
                  stackIn_200_1 = 2;
                  break L43;
                }
              }
              ((ap) (this)).field_x = stackIn_200_1;
              this.field_F = this.field_t;
              this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
              return;
            }
          } else {
            this.field_v = 8;
            this.field_B = 50;
            this.field_z = 50;
            if (param3 < -19) {
              if (param6) {
                this.field_x = -1;
                this.field_h = ua.field_a;
                if (3 != param1) {
                  if ((param1 ^ -1) == -8) {
                    this.field_q = 1;
                    this.field_h = fe.field_G;
                    this.field_F = this.field_t;
                    this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
                    return;
                  } else {
                    this.field_F = this.field_t;
                    this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
                    return;
                  }
                } else {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                  this.field_F = this.field_t;
                  this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
                  return;
                }
              } else {
                L44: {
                  if (!param5) {
                    L45: {
                      stackIn_173_0 = this;

                      if (dj.field_e.b(-25983)) {
                        stackIn_174_0 = this;
                        stackIn_174_1 = kc.field_Y;
                        break L45;
                      } else {
                        stackIn_174_0 = this;
                        stackIn_174_1 = po.field_wb;
                        break L45;
                      }
                    }
                    ((ap) (this)).field_h = stackIn_174_1;
                    break L44;
                  } else {
                    this.field_h = ua.field_a;
                    break L44;
                  }
                }
                L46: {
                  stackIn_177_0 = this;

                  if (param5) {
                    stackIn_178_0 = this;
                    stackIn_178_1 = 1;
                    break L46;
                  } else {
                    stackIn_178_0 = this;
                    stackIn_178_1 = 2;
                    break L46;
                  }
                }
                ((ap) (this)).field_x = stackIn_178_1;
                this.field_F = this.field_t;
                this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
                return;
              }
            } else {
              L47: {
                this.a((byte) -39);
                if (!param6) {
                  L48: {
                    if (!param5) {
                      L49: {
                        stackIn_161_0 = this;

                        if (dj.field_e.b(-25983)) {
                          stackIn_162_0 = this;
                          stackIn_162_1 = kc.field_Y;
                          break L49;
                        } else {
                          stackIn_162_0 = this;
                          stackIn_162_1 = po.field_wb;
                          break L49;
                        }
                      }
                      ((ap) (this)).field_h = stackIn_162_1;
                      break L48;
                    } else {
                      this.field_h = ua.field_a;
                      break L48;
                    }
                  }
                  L50: {
                    stackIn_165_0 = this;

                    if (param5) {
                      stackIn_166_0 = this;
                      stackIn_166_1 = 1;
                      break L50;
                    } else {
                      stackIn_166_0 = this;
                      stackIn_166_1 = 2;
                      break L50;
                    }
                  }
                  ((ap) (this)).field_x = stackIn_166_1;
                  break L47;
                } else {
                  this.field_x = -1;
                  this.field_h = ua.field_a;
                  if (3 == param1) {
                    this.field_q = 1;
                    this.field_h = fe.field_G;
                    break L47;
                  } else {
                    if ((param1 ^ -1) != -8) {
                      break L47;
                    } else {
                      this.field_q = 1;
                      this.field_h = fe.field_G;
                      break L47;
                    }
                  }
                }
              }
              this.field_F = this.field_t;
              this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
              return;
            }
          }
        } else {
          this.field_v = 8;
          this.field_B = 50;
          this.field_z = 50;
          if (param3 >= -19) {
            L51: {
              this.a((byte) -39);
              if (!param6) {
                L52: {
                  if (!param5) {
                    L53: {
                      stackIn_141_0 = this;

                      if (dj.field_e.b(-25983)) {
                        stackIn_142_0 = this;
                        stackIn_142_1 = kc.field_Y;
                        break L53;
                      } else {
                        stackIn_142_0 = this;
                        stackIn_142_1 = po.field_wb;
                        break L53;
                      }
                    }
                    ((ap) (this)).field_h = stackIn_142_1;
                    break L52;
                  } else {
                    this.field_h = ua.field_a;
                    break L52;
                  }
                }
                L54: {
                  stackIn_145_0 = this;

                  if (param5) {
                    stackIn_146_0 = this;
                    stackIn_146_1 = 1;
                    break L54;
                  } else {
                    stackIn_146_0 = this;
                    stackIn_146_1 = 2;
                    break L54;
                  }
                }
                ((ap) (this)).field_x = stackIn_146_1;
                break L51;
              } else {
                this.field_x = -1;
                this.field_h = ua.field_a;
                if (3 == param1) {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                  break L51;
                } else {
                  if ((param1 ^ -1) != -8) {
                    break L51;
                  } else {
                    this.field_q = 1;
                    this.field_h = fe.field_G;
                    break L51;
                  }
                }
              }
            }
            this.field_F = this.field_t;
            this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
            return;
          } else {
            L55: {
              if (!param6) {
                L56: {
                  if (!param5) {
                    L57: {
                      stackIn_124_0 = this;

                      if (dj.field_e.b(-25983)) {
                        stackIn_125_0 = this;
                        stackIn_125_1 = kc.field_Y;
                        break L57;
                      } else {
                        stackIn_125_0 = this;
                        stackIn_125_1 = po.field_wb;
                        break L57;
                      }
                    }
                    ((ap) (this)).field_h = stackIn_125_1;
                    break L56;
                  } else {
                    this.field_h = ua.field_a;
                    break L56;
                  }
                }
                L58: {
                  stackIn_128_0 = this;

                  if (param5) {
                    stackIn_129_0 = this;
                    stackIn_129_1 = 1;
                    break L58;
                  } else {
                    stackIn_129_0 = this;
                    stackIn_129_1 = 2;
                    break L58;
                  }
                }
                ((ap) (this)).field_x = stackIn_129_1;
                break L55;
              } else {
                this.field_x = -1;
                this.field_h = ua.field_a;
                if (3 == param1) {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                  break L55;
                } else {
                  if ((param1 ^ -1) != -8) {
                    break L55;
                  } else {
                    this.field_q = 1;
                    this.field_h = fe.field_G;
                    break L55;
                  }
                }
              }
            }
            this.field_F = this.field_t;
            this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
            return;
          }
        }
    }

    private final String d(byte param0) {
        int var2 = this.field_r / 60;
        int var3 = 123 % ((param0 - 44) / 37);
        int var4 = this.field_r % 60;
        return var2 + ":" + (var4 >= 10 ? "" : "0") + var4;
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int var3;
        int var5;
        int var6;
        hi var7;
        hi var9;
        hi var10;
        var6 = ZombieDawn.field_J;
        super.a((byte) -104, param1);
        var3 = 121 / ((-39 - param0) / 61);
        if (!this.field_F) {
          if (!this.field_y) {
            if (1 != this.field_x) {
              if ((this.field_x ^ -1) != 0) {
                L0: {
                  this.field_F = true;
                  if (-1 != (this.field_b.field_d ^ -1)) {
                    break L0;
                  } else {
                    if (this.field_h[0] == 39) {
                      this.field_b.b(1, -123);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
                if (2 == this.field_x) {
                  return;
                } else {
                  fieldTemp$0 = this.field_B - 1;
                  this.field_B = this.field_B - 1;
                  if (fieldTemp$0 <= 0) {
                    L1: {
                      if (!this.field_y) {
                        L2: {
                          if (0 >= this.field_D) {
                            break L2;
                          } else {
                            if (this.field_t) {
                              break L2;
                            } else {
                              L3: {
                                this.field_z = this.field_z + 1;
                                this.field_G = 9;
                                this.field_p = this.field_p + this.field_A;
                                this.field_D = this.field_D - 1;
                                this.field_B = 500 / this.field_z;
                                if (-3 < (this.field_B ^ -1)) {
                                  this.field_B = 2;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                              L4: {
                                if (-1 == (this.field_D ^ -1)) {
                                  break L4;
                                } else {
                                  if (!this.field_y) {
                                    kh.a(58, false);
                                    break L1;
                                  } else {
                                    if (this.field_D >= 9999999) {
                                      break L4;
                                    } else {
                                      kh.a(58, false);
                                      break L1;
                                    }
                                  }
                                }
                              }
                              this.field_G = 8;
                              this.field_B = 50;
                              if (this.field_H) {
                                kh.a(58, false);
                                return;
                              } else {
                                tp.a(123, false, w.field_a[6]);
                                kh.a(58, false);
                                return;
                              }
                            }
                          }
                        }
                        if ((this.field_r ^ -1) < -1) {
                          if (!this.field_H) {
                            this.field_v = 8;
                            return;
                          } else {
                            L5: {
                              this.field_v = 9;
                              this.field_p = this.field_p + this.field_E;
                              this.field_B = 2;
                              this.field_r = this.field_r - 2;
                              if ((this.field_r ^ -1) >= -1) {
                                this.field_r = 0;
                                tp.a(85, false, w.field_a[6]);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            kh.a(57, false).h(3 * ge.field_c >> -927299517);
                            return;
                          }
                        } else {
                          this.field_v = 8;
                          return;
                        }
                      } else {
                        L6: {
                          if ((this.field_D ^ -1) > -10000000) {
                            L7: {
                              this.field_D = this.field_D + this.field_q;
                              if (-10000000 >= (this.field_D ^ -1)) {
                                this.field_p = this.field_p + this.field_n;
                                this.field_D = 9999999;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            this.field_q = this.field_q + (1 - -(this.field_q >> 2042701252));
                            kh.a(58, false);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        this.field_B = 2;
                        break L1;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L8: {
                  var10 = dj.field_e;
                  var5 = (this.field_r + 1) / 2 * this.field_E - -(this.field_D * this.field_A);
                  var10.field_eb = var10.field_eb + (var5 << -1827917464);
                  var10.field_g = var10.field_g - var10.field_K * var5;
                  var10.field_l = var10.field_l + var5;
                  var10.field_G = var10.field_G + var5;
                  var10.h(1);
                  this.field_F = true;
                  if (-1 != (this.field_b.field_d ^ -1)) {
                    break L8;
                  } else {
                    if (this.field_h[0] == 39) {
                      this.field_b.b(1, -123);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                if (2 == this.field_x) {
                  return;
                } else {
                  fieldTemp$1 = this.field_B - 1;
                  this.field_B = this.field_B - 1;
                  if (fieldTemp$1 <= 0) {
                    L9: {
                      if (!this.field_y) {
                        L10: {
                          if (0 >= this.field_D) {
                            break L10;
                          } else {
                            if (this.field_t) {
                              break L10;
                            } else {
                              L11: {
                                this.field_z = this.field_z + 1;
                                this.field_G = 9;
                                this.field_p = this.field_p + this.field_A;
                                this.field_D = this.field_D - 1;
                                this.field_B = 500 / this.field_z;
                                if (-3 < (this.field_B ^ -1)) {
                                  this.field_B = 2;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                if (-1 == (this.field_D ^ -1)) {
                                  break L12;
                                } else {
                                  if (!this.field_y) {
                                    kh.a(58, false);
                                    break L9;
                                  } else {
                                    if (this.field_D >= 9999999) {
                                      break L12;
                                    } else {
                                      kh.a(58, false);
                                      break L9;
                                    }
                                  }
                                }
                              }
                              this.field_G = 8;
                              this.field_B = 50;
                              if (this.field_H) {
                                kh.a(58, false);
                                return;
                              } else {
                                tp.a(123, false, w.field_a[6]);
                                kh.a(58, false);
                                return;
                              }
                            }
                          }
                        }
                        if ((this.field_r ^ -1) < -1) {
                          if (!this.field_H) {
                            this.field_v = 8;
                            return;
                          } else {
                            L13: {
                              this.field_v = 9;
                              this.field_p = this.field_p + this.field_E;
                              this.field_B = 2;
                              this.field_r = this.field_r - 2;
                              if ((this.field_r ^ -1) >= -1) {
                                this.field_r = 0;
                                tp.a(85, false, w.field_a[6]);
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            kh.a(57, false).h(3 * ge.field_c >> -927299517);
                            return;
                          }
                        } else {
                          this.field_v = 8;
                          return;
                        }
                      } else {
                        L14: {
                          if ((this.field_D ^ -1) > -10000000) {
                            L15: {
                              this.field_D = this.field_D + this.field_q;
                              if (-10000000 >= (this.field_D ^ -1)) {
                                this.field_p = this.field_p + this.field_n;
                                this.field_D = 9999999;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            this.field_q = this.field_q + (1 - -(this.field_q >> 2042701252));
                            kh.a(58, false);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        this.field_B = 2;
                        break L9;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L16: {
                var9 = dj.field_e;
                var5 = (this.field_r + 1) / 2 * this.field_E - -(this.field_D * this.field_A);
                var9.field_eb = var9.field_eb + (var5 << -1827917464);
                var9.field_g = var9.field_g - var9.field_K * var5;
                var9.field_l = var9.field_l + var5;
                var9.field_G = var9.field_G + var5;
                var9.h(1);
                this.field_F = true;
                if (-1 != (this.field_b.field_d ^ -1)) {
                  break L16;
                } else {
                  if (this.field_h[0] == 39) {
                    this.field_b.b(1, -123);
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              if (2 == this.field_x) {
                return;
              } else {
                fieldTemp$2 = this.field_B - 1;
                this.field_B = this.field_B - 1;
                if (fieldTemp$2 <= 0) {
                  L17: {
                    if (!this.field_y) {
                      L18: {
                        if (0 >= this.field_D) {
                          break L18;
                        } else {
                          if (this.field_t) {
                            break L18;
                          } else {
                            L19: {
                              this.field_z = this.field_z + 1;
                              this.field_G = 9;
                              this.field_p = this.field_p + this.field_A;
                              this.field_D = this.field_D - 1;
                              this.field_B = 500 / this.field_z;
                              if (-3 < (this.field_B ^ -1)) {
                                this.field_B = 2;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if (-1 == (this.field_D ^ -1)) {
                                break L20;
                              } else {
                                if (!this.field_y) {
                                  kh.a(58, false);
                                  break L17;
                                } else {
                                  if (this.field_D >= 9999999) {
                                    break L20;
                                  } else {
                                    kh.a(58, false);
                                    break L17;
                                  }
                                }
                              }
                            }
                            this.field_G = 8;
                            this.field_B = 50;
                            if (this.field_H) {
                              kh.a(58, false);
                              return;
                            } else {
                              tp.a(123, false, w.field_a[6]);
                              kh.a(58, false);
                              return;
                            }
                          }
                        }
                      }
                      if ((this.field_r ^ -1) < -1) {
                        if (this.field_H) {
                          L21: {
                            this.field_v = 9;
                            this.field_p = this.field_p + this.field_E;
                            this.field_B = 2;
                            this.field_r = this.field_r - 2;
                            if ((this.field_r ^ -1) >= -1) {
                              this.field_r = 0;
                              tp.a(85, false, w.field_a[6]);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          kh.a(57, false).h(3 * ge.field_c >> -927299517);
                          return;
                        } else {
                          this.field_v = 8;
                          return;
                        }
                      } else {
                        this.field_v = 8;
                        return;
                      }
                    } else {
                      L22: {
                        if ((this.field_D ^ -1) > -10000000) {
                          L23: {
                            this.field_D = this.field_D + this.field_q;
                            if (-10000000 >= (this.field_D ^ -1)) {
                              this.field_p = this.field_p + this.field_n;
                              this.field_D = 9999999;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          this.field_q = this.field_q + (1 - -(this.field_q >> 2042701252));
                          kh.a(58, false);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      this.field_B = 2;
                      break L17;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            var7 = dj.field_e;
            var5 = this.field_n;
            var7.field_eb = var7.field_eb + (var5 << 813403624);
            var7.field_G = var7.field_G + var5;
            var7.field_g = var7.field_g - var5 * var7.field_K;
            var7.field_l = var7.field_l + var5;
            var7.h(1);
            this.field_F = true;
            L24: {
              if (-1 != (this.field_b.field_d ^ -1)) {
                break L24;
              } else {
                if (this.field_h[0] == 39) {
                  this.field_b.b(1, -123);
                  break L24;
                } else {
                  if (2 == this.field_x) {
                    return;
                  } else {
                    fieldTemp$3 = this.field_B - 1;
                    this.field_B = this.field_B - 1;
                    if (fieldTemp$3 <= 0) {
                      if (!this.field_y) {
                        if (0 < this.field_D) {
                          if (this.field_t) {
                            if ((this.field_r ^ -1) >= -1) {
                              this.field_v = 8;
                              return;
                            } else {
                              if (!this.field_H) {
                                this.field_v = 8;
                                return;
                              } else {
                                L25: {
                                  this.field_v = 9;
                                  this.field_p = this.field_p + this.field_E;
                                  this.field_B = 2;
                                  this.field_r = this.field_r - 2;
                                  if ((this.field_r ^ -1) >= -1) {
                                    this.field_r = 0;
                                    tp.a(85, false, w.field_a[6]);
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                kh.a(57, false).h(3 * ge.field_c >> -927299517);
                                return;
                              }
                            }
                          } else {
                            L26: {
                              this.field_z = this.field_z + 1;
                              this.field_G = 9;
                              this.field_p = this.field_p + this.field_A;
                              this.field_D = this.field_D - 1;
                              this.field_B = 500 / this.field_z;
                              if (-3 < (this.field_B ^ -1)) {
                                this.field_B = 2;
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            L27: {
                              if (-1 == (this.field_D ^ -1)) {
                                break L27;
                              } else {
                                if (this.field_y) {
                                  if (this.field_D >= 9999999) {
                                    break L27;
                                  } else {
                                    kh.a(58, false);
                                    return;
                                  }
                                } else {
                                  kh.a(58, false);
                                  return;
                                }
                              }
                            }
                            this.field_G = 8;
                            this.field_B = 50;
                            if (!this.field_H) {
                              tp.a(123, false, w.field_a[6]);
                              kh.a(58, false);
                              return;
                            } else {
                              kh.a(58, false);
                              return;
                            }
                          }
                        } else {
                          if ((this.field_r ^ -1) < -1) {
                            if (this.field_H) {
                              L28: {
                                this.field_v = 9;
                                this.field_p = this.field_p + this.field_E;
                                this.field_B = 2;
                                this.field_r = this.field_r - 2;
                                if ((this.field_r ^ -1) >= -1) {
                                  this.field_r = 0;
                                  tp.a(85, false, w.field_a[6]);
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              kh.a(57, false).h(3 * ge.field_c >> -927299517);
                              return;
                            } else {
                              this.field_v = 8;
                              return;
                            }
                          } else {
                            this.field_v = 8;
                            return;
                          }
                        }
                      } else {
                        L29: {
                          if ((this.field_D ^ -1) > -10000000) {
                            L30: {
                              this.field_D = this.field_D + this.field_q;
                              if (-10000000 >= (this.field_D ^ -1)) {
                                this.field_p = this.field_p + this.field_n;
                                this.field_D = 9999999;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            this.field_q = this.field_q + (1 - -(this.field_q >> 2042701252));
                            kh.a(58, false);
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        this.field_B = 2;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (2 == this.field_x) {
              return;
            } else {
              fieldTemp$4 = this.field_B - 1;
              this.field_B = this.field_B - 1;
              if (fieldTemp$4 <= 0) {
                if (!this.field_y) {
                  L31: {
                    if (0 >= this.field_D) {
                      break L31;
                    } else {
                      if (this.field_t) {
                        break L31;
                      } else {
                        L32: {
                          this.field_z = this.field_z + 1;
                          this.field_G = 9;
                          this.field_p = this.field_p + this.field_A;
                          this.field_D = this.field_D - 1;
                          this.field_B = 500 / this.field_z;
                          if (-3 < (this.field_B ^ -1)) {
                            this.field_B = 2;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        L33: {
                          if (-1 == (this.field_D ^ -1)) {
                            break L33;
                          } else {
                            if (!this.field_y) {
                              kh.a(58, false);
                              return;
                            } else {
                              if (this.field_D >= 9999999) {
                                break L33;
                              } else {
                                kh.a(58, false);
                                return;
                              }
                            }
                          }
                        }
                        this.field_G = 8;
                        this.field_B = 50;
                        if (this.field_H) {
                          kh.a(58, false);
                          return;
                        } else {
                          tp.a(123, false, w.field_a[6]);
                          kh.a(58, false);
                          return;
                        }
                      }
                    }
                  }
                  if ((this.field_r ^ -1) >= -1) {
                    this.field_v = 8;
                    return;
                  } else {
                    if (!this.field_H) {
                      this.field_v = 8;
                      return;
                    } else {
                      L34: {
                        this.field_v = 9;
                        this.field_p = this.field_p + this.field_E;
                        this.field_B = 2;
                        this.field_r = this.field_r - 2;
                        if ((this.field_r ^ -1) >= -1) {
                          this.field_r = 0;
                          tp.a(85, false, w.field_a[6]);
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      kh.a(57, false).h(3 * ge.field_c >> -927299517);
                      return;
                    }
                  }
                } else {
                  L35: {
                    if ((this.field_D ^ -1) > -10000000) {
                      L36: {
                        this.field_D = this.field_D + this.field_q;
                        if (-10000000 >= (this.field_D ^ -1)) {
                          this.field_p = this.field_p + this.field_n;
                          this.field_D = 9999999;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      this.field_q = this.field_q + (1 - -(this.field_q >> 2042701252));
                      kh.a(58, false);
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  this.field_B = 2;
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          L37: {
            if (-1 != (this.field_b.field_d ^ -1)) {
              break L37;
            } else {
              if (this.field_h[0] == 39) {
                this.field_b.b(1, -123);
                break L37;
              } else {
                if (2 == this.field_x) {
                  return;
                } else {
                  fieldTemp$5 = this.field_B - 1;
                  this.field_B = this.field_B - 1;
                  if (fieldTemp$5 <= 0) {
                    L38: {
                      if (!this.field_y) {
                        L39: {
                          if (0 >= this.field_D) {
                            break L39;
                          } else {
                            if (this.field_t) {
                              break L39;
                            } else {
                              L40: {
                                this.field_z = this.field_z + 1;
                                this.field_G = 9;
                                this.field_p = this.field_p + this.field_A;
                                this.field_D = this.field_D - 1;
                                this.field_B = 500 / this.field_z;
                                if (-3 < (this.field_B ^ -1)) {
                                  this.field_B = 2;
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              L41: {
                                if (-1 == (this.field_D ^ -1)) {
                                  break L41;
                                } else {
                                  if (!this.field_y) {
                                    kh.a(58, false);
                                    break L38;
                                  } else {
                                    if (this.field_D >= 9999999) {
                                      break L41;
                                    } else {
                                      kh.a(58, false);
                                      break L38;
                                    }
                                  }
                                }
                              }
                              this.field_G = 8;
                              this.field_B = 50;
                              if (this.field_H) {
                                kh.a(58, false);
                                return;
                              } else {
                                tp.a(123, false, w.field_a[6]);
                                kh.a(58, false);
                                return;
                              }
                            }
                          }
                        }
                        if ((this.field_r ^ -1) < -1) {
                          if (this.field_H) {
                            L42: {
                              this.field_v = 9;
                              this.field_p = this.field_p + this.field_E;
                              this.field_B = 2;
                              this.field_r = this.field_r - 2;
                              if ((this.field_r ^ -1) >= -1) {
                                this.field_r = 0;
                                tp.a(85, false, w.field_a[6]);
                                break L42;
                              } else {
                                break L42;
                              }
                            }
                            kh.a(57, false).h(3 * ge.field_c >> -927299517);
                            return;
                          } else {
                            this.field_v = 8;
                            return;
                          }
                        } else {
                          this.field_v = 8;
                          return;
                        }
                      } else {
                        L43: {
                          if ((this.field_D ^ -1) > -10000000) {
                            L44: {
                              this.field_D = this.field_D + this.field_q;
                              if (-10000000 >= (this.field_D ^ -1)) {
                                this.field_p = this.field_p + this.field_n;
                                this.field_D = 9999999;
                                break L44;
                              } else {
                                break L44;
                              }
                            }
                            this.field_q = this.field_q + (1 - -(this.field_q >> 2042701252));
                            kh.a(58, false);
                            break L43;
                          } else {
                            break L43;
                          }
                        }
                        this.field_B = 2;
                        break L38;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (2 == this.field_x) {
            return;
          } else {
            fieldTemp$6 = this.field_B - 1;
            this.field_B = this.field_B - 1;
            if (fieldTemp$6 <= 0) {
              if (!this.field_y) {
                L45: {
                  if (0 >= this.field_D) {
                    break L45;
                  } else {
                    if (this.field_t) {
                      break L45;
                    } else {
                      L46: {
                        this.field_z = this.field_z + 1;
                        this.field_G = 9;
                        this.field_p = this.field_p + this.field_A;
                        this.field_D = this.field_D - 1;
                        this.field_B = 500 / this.field_z;
                        if (-3 < (this.field_B ^ -1)) {
                          this.field_B = 2;
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                      L47: {
                        if (-1 == (this.field_D ^ -1)) {
                          break L47;
                        } else {
                          if (this.field_y) {
                            if (this.field_D >= 9999999) {
                              break L47;
                            } else {
                              kh.a(58, false);
                              return;
                            }
                          } else {
                            kh.a(58, false);
                            return;
                          }
                        }
                      }
                      this.field_G = 8;
                      this.field_B = 50;
                      if (!this.field_H) {
                        tp.a(123, false, w.field_a[6]);
                        kh.a(58, false);
                        return;
                      } else {
                        kh.a(58, false);
                        return;
                      }
                    }
                  }
                }
                if ((this.field_r ^ -1) < -1) {
                  if (this.field_H) {
                    L48: {
                      this.field_v = 9;
                      this.field_p = this.field_p + this.field_E;
                      this.field_B = 2;
                      this.field_r = this.field_r - 2;
                      if ((this.field_r ^ -1) >= -1) {
                        this.field_r = 0;
                        tp.a(85, false, w.field_a[6]);
                        break L48;
                      } else {
                        break L48;
                      }
                    }
                    kh.a(57, false).h(3 * ge.field_c >> -927299517);
                    return;
                  } else {
                    this.field_v = 8;
                    return;
                  }
                } else {
                  this.field_v = 8;
                  return;
                }
              } else {
                L49: {
                  if ((this.field_D ^ -1) > -10000000) {
                    L50: {
                      this.field_D = this.field_D + this.field_q;
                      if (-10000000 >= (this.field_D ^ -1)) {
                        this.field_p = this.field_p + this.field_n;
                        this.field_D = 9999999;
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                    this.field_q = this.field_q + (1 - -(this.field_q >> 2042701252));
                    kh.a(58, false);
                    break L49;
                  } else {
                    break L49;
                  }
                }
                this.field_B = 2;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        Object var6;
        String var7;
        String var8;
        String var9;
        String var10;
        String var11;
        String var14;
        String var15;
        super.a((byte) -91);
        var2 = 8;
        var3 = 0;
        var4 = sg.field_jb.field_x + sg.field_jb.field_I;
        var5 = id.field_M - -94;
        var6 = null;
        if (this.field_x != 1) {
          if ((this.field_x ^ -1) != -3) {
            L0: {
              if (0 != (this.field_x ^ -1)) {
                break L0;
              } else {
                if (-28 == (vl.field_b.f(-107) ^ -1)) {
                  var6 = hb.field_D[vl.field_b.field_bb];
                  break L0;
                } else {
                  var10 = tc.field_u;
                  if (var10 != null) {
                    var5 = var5 + (var4 * (1 + sg.field_jb.a(var10, vh.field_b - -40, var5, 560, 240, var2, var3, 1, 0, 30)) - 5);
                    if (param0 >= -35) {
                      L1: {
                        this.field_r = -90;
                        if ((var5 ^ -1) > -206) {
                          var5 = 205;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L2: {
                        var11 = gj.field_c;
                        if (this.field_o) {
                          var7 = sa.field_bb;
                          break L2;
                        } else {
                          if (this.field_t) {
                            var7 = kn.field_I;
                            break L2;
                          } else {
                            L3: {
                              sg.field_jb.b(var11, vh.field_b + 350, var5, this.field_G, var3);
                              sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
                              var5 = var5 + (var4 + 5);
                              if (!this.field_H) {
                                break L3;
                              } else {
                                sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                                sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                                break L3;
                              }
                            }
                            sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                            sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                            return;
                          }
                        }
                      }
                      sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
                      sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
                      var5 = var5 + (var4 + 5);
                      if (this.field_H) {
                        sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                        sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                        sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                        sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                        return;
                      } else {
                        sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                        sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                        return;
                      }
                    } else {
                      L4: {
                        if ((var5 ^ -1) > -206) {
                          var5 = 205;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var7 = gj.field_c;
                        if (this.field_o) {
                          var7 = sa.field_bb;
                          break L5;
                        } else {
                          if (!this.field_t) {
                            break L5;
                          } else {
                            var7 = kn.field_I;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
                        sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
                        var5 = var5 + (var4 + 5);
                        if (!this.field_H) {
                          break L6;
                        } else {
                          sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                          sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                          break L6;
                        }
                      }
                      sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                      sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (var6 != null) {
              var5 = var5 + (var4 * (1 + sg.field_jb.a((String) (var6), vh.field_b - -40, var5, 560, 240, var2, var3, 1, 0, 30)) - 5);
              if (param0 < -35) {
                L7: {
                  if ((var5 ^ -1) > -206) {
                    var5 = 205;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var7 = gj.field_c;
                  if (this.field_o) {
                    var7 = sa.field_bb;
                    break L8;
                  } else {
                    if (!this.field_t) {
                      break L8;
                    } else {
                      var15 = kn.field_I;
                      sg.field_jb.b(var15, vh.field_b + 350, var5, this.field_G, var3);
                      sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
                      var5 = var5 + (var4 + 5);
                      if (this.field_H) {
                        sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                        sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                        sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                        sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                        return;
                      } else {
                        sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                        sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                        return;
                      }
                    }
                  }
                }
                sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
                sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
                var5 = var5 + (var4 + 5);
                if (this.field_H) {
                  sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                  sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                  sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                  sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                  return;
                } else {
                  sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                  sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                  return;
                }
              } else {
                L9: {
                  this.field_r = -90;
                  if ((var5 ^ -1) > -206) {
                    var5 = 205;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var7 = gj.field_c;
                  if (this.field_o) {
                    var7 = sa.field_bb;
                    break L10;
                  } else {
                    if (!this.field_t) {
                      break L10;
                    } else {
                      L11: {
                        var14 = kn.field_I;
                        sg.field_jb.b(var14, vh.field_b + 350, var5, this.field_G, var3);
                        sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
                        var5 = var5 + (var4 + 5);
                        if (!this.field_H) {
                          break L11;
                        } else {
                          sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                          sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                          break L11;
                        }
                      }
                      sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                      sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                      return;
                    }
                  }
                }
                sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
                sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
                var5 = var5 + (var4 + 5);
                if (this.field_H) {
                  sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                  sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                  sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                  sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                  return;
                } else {
                  sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
                  sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            var9 = fm.field_I;
            if (var9 == null) {
              return;
            } else {
              L12: {
                var5 = var5 + (var4 * (1 + sg.field_jb.a(var9, vh.field_b - -40, var5, 560, 240, var2, var3, 1, 0, 30)) - 5);
                if (param0 < -35) {
                  break L12;
                } else {
                  this.field_r = -90;
                  break L12;
                }
              }
              L13: {
                if ((var5 ^ -1) > -206) {
                  var5 = 205;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                var7 = gj.field_c;
                if (this.field_o) {
                  var7 = sa.field_bb;
                  break L14;
                } else {
                  if (!this.field_t) {
                    break L14;
                  } else {
                    var7 = kn.field_I;
                    break L14;
                  }
                }
              }
              L15: {
                sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
                sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
                var5 = var5 + (var4 + 5);
                if (!this.field_H) {
                  break L15;
                } else {
                  sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                  sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                  break L15;
                }
              }
              sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
              sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
              return;
            }
          }
        } else {
          var8 = ud.field_a;
          if (var8 == null) {
            return;
          } else {
            L16: {
              var5 = var5 + (var4 * (1 + sg.field_jb.a(var8, vh.field_b - -40, var5, 560, 240, var2, var3, 1, 0, 30)) - 5);
              if (param0 < -35) {
                break L16;
              } else {
                this.field_r = -90;
                break L16;
              }
            }
            L17: {
              if ((var5 ^ -1) > -206) {
                var5 = 205;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var7 = gj.field_c;
              if (this.field_o) {
                var7 = sa.field_bb;
                break L18;
              } else {
                if (!this.field_t) {
                  break L18;
                } else {
                  var7 = kn.field_I;
                  break L18;
                }
              }
            }
            L19: {
              sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
              sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
              var5 = var5 + (var4 + 5);
              if (!this.field_H) {
                break L19;
              } else {
                sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                break L19;
              }
            }
            sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M - -340, var2, var3);
            sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
            return;
          }
        }
    }

    final void b(byte param0) {
        vn[] stackIn_4_0 = null;
        vn[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        vn[] stackIn_9_0 = null;
        vn[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        vn[] stackIn_18_0 = null;
        vn[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        vn[] stackIn_23_0 = null;
        vn[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int var3;
        var3 = ZombieDawn.field_J;
        if (param0 >= 105) {
          if (640 == bd.field_e) {
            if (-481 == (nh.field_P ^ -1)) {
              if (this.field_x == 2) {
                qk.field_Hb[3].e(0, 0);
                return;
              } else {
                qk.field_Hb[2].e(0, 0);
                return;
              }
            } else {
              L0: {
                stackIn_23_0 = qk.field_Hb;

                if (2 != this.field_x) {
                  stackIn_24_0 = (vn[]) ((Object) stackIn_23_0);
                  stackIn_24_1 = 2;
                  break L0;
                } else {
                  stackIn_24_0 = (vn[]) ((Object) stackIn_23_0);
                  stackIn_24_1 = 3;
                  break L0;
                }
              }
              ((vn) (Object) stackIn_24_0[stackIn_24_1]).a(0, 0, bd.field_e, nh.field_P);
              return;
            }
          } else {
            L1: {
              stackIn_18_0 = qk.field_Hb;

              if (2 != this.field_x) {
                stackIn_19_0 = (vn[]) ((Object) stackIn_18_0);
                stackIn_19_1 = 2;
                break L1;
              } else {
                stackIn_19_0 = (vn[]) ((Object) stackIn_18_0);
                stackIn_19_1 = 3;
                break L1;
              }
            }
            ((vn) (Object) stackIn_19_0[stackIn_19_1]).a(0, 0, bd.field_e, nh.field_P);
            return;
          }
        } else {
          this.a((byte) 101);
          if (640 == bd.field_e) {
            L2: {
              if (-481 == (nh.field_P ^ -1)) {
                if (this.field_x != 2) {
                  qk.field_Hb[2].e(0, 0);
                  return;
                } else {
                  qk.field_Hb[3].e(0, 0);
                  break L2;
                }
              } else {
                L3: {
                  stackIn_9_0 = qk.field_Hb;

                  if (2 != this.field_x) {
                    stackIn_10_0 = (vn[]) ((Object) stackIn_9_0);
                    stackIn_10_1 = 2;
                    break L3;
                  } else {
                    stackIn_10_0 = (vn[]) ((Object) stackIn_9_0);
                    stackIn_10_1 = 3;
                    break L3;
                  }
                }
                ((vn) (Object) stackIn_10_0[stackIn_10_1]).a(0, 0, bd.field_e, nh.field_P);
                break L2;
              }
            }
            return;
          } else {
            L4: {
              stackIn_4_0 = qk.field_Hb;

              if (2 != this.field_x) {
                stackIn_5_0 = (vn[]) ((Object) stackIn_4_0);
                stackIn_5_1 = 2;
                break L4;
              } else {
                stackIn_5_0 = (vn[]) ((Object) stackIn_4_0);
                stackIn_5_1 = 3;
                break L4;
              }
            }
            ((vn) (Object) stackIn_5_0[stackIn_5_1]).a(0, 0, bd.field_e, nh.field_P);
            return;
          }
        }
    }

    static {
        field_s = "Accept";
        field_w = "Loading levels";
    }
}
