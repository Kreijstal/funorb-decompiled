/*
 * Decompiled by CFR-JS 0.4.0.
 */
class iu {
    static int field_t;
    int field_g;
    static boolean field_n;
    private int field_p;
    private int field_f;
    int field_w;
    static je field_d;
    static String field_b;
    private int field_m;
    private int field_j;
    private boolean field_v;
    private boolean field_o;
    boolean field_c;
    ic field_q;
    static String field_l;
    static String field_r;
    int field_k;
    private boolean field_s;
    static String field_i;
    private String field_e;
    private int field_a;
    static boolean field_h;
    static int field_x;
    static String field_u;

    private final boolean c(byte param0) {
        if (this.field_q.field_xb.field_t[1].b(false) == 0) {
            if (!((this.field_q.field_xb.field_Eb[pl.field_s[0]].field_a ^ -1) != -1)) {
                return true;
            }
        }
        if (param0 != -62) {
            this.h((byte) -125);
        }
        return false;
    }

    final void a(String param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                this.field_e = param0;
                if (this.field_e == null) {
                  break L2;
                } else {
                  if (!this.field_c) {
                    break L2;
                  } else {
                    this.field_a = 50 + rs.field_n.a(this.field_e, 220, 0);
                    this.field_f = 240;
                    if (!ArmiesOfGielinor.field_M) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_a = 40;
              if ((this.field_k ^ -1) != -35) {
                break L1;
              } else {
                this.field_f = 100;
                break L1;
              }
            }
            L3: {
              if (param1 > 108) {
                break L3;
              } else {
                this.j((byte) 81);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("iu.FA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -3) {
          L0: {
            if (param2 == 5) {
              param2 = this.a(param0, (byte) -124);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (!this.c((byte) -62)) {
              break L1;
            } else {
              if (this.field_v) {
                this.b(28, -30659);
                return;
              } else {
                break L1;
              }
            }
          }
          L2: {
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            L11: {
                              L12: {
                                L13: {
                                  L14: {
                                    L15: {
                                      L16: {
                                        L17: {
                                          L18: {
                                            L19: {
                                              L20: {
                                                L21: {
                                                  L22: {
                                                    L23: {
                                                      L24: {
                                                        L25: {
                                                          L26: {
                                                            L27: {
                                                              L28: {
                                                                L29: {
                                                                  L30: {
                                                                    L31: {
                                                                      L32: {
                                                                        L33: {
                                                                          L34: {
                                                                            var4 = this.field_k;
                                                                            if ((var4 ^ -1) == -1) {
                                                                              if (-2 == (param2 ^ -1)) {
                                                                                this.b(1, -30659);
                                                                                if (var5 == 0) {
                                                                                  break L2;
                                                                                } else {
                                                                                  break L34;
                                                                                }
                                                                              } else {
                                                                                break L2;
                                                                              }
                                                                            } else {
                                                                              if (var4 == 1) {
                                                                                break L34;
                                                                              } else {
                                                                                if (2 == var4) {
                                                                                  break L33;
                                                                                } else {
                                                                                  if (-4 == (var4 ^ -1)) {
                                                                                    break L32;
                                                                                  } else {
                                                                                    L35: {
                                                                                      if ((var4 ^ -1) != -5) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        if (var5 == 0) {
                                                                                          break L31;
                                                                                        } else {
                                                                                          break L35;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    if (-6 == (var4 ^ -1)) {
                                                                                      break L30;
                                                                                    } else {
                                                                                      if (var4 == 6) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        L36: {
                                                                                          if (-8 != (var4 ^ -1)) {
                                                                                            break L36;
                                                                                          } else {
                                                                                            if (var5 == 0) {
                                                                                              break L28;
                                                                                            } else {
                                                                                              break L36;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        if (var4 == 8) {
                                                                                          break L27;
                                                                                        } else {
                                                                                          L37: {
                                                                                            if (-10 != (var4 ^ -1)) {
                                                                                              break L37;
                                                                                            } else {
                                                                                              if (var5 == 0) {
                                                                                                break L26;
                                                                                              } else {
                                                                                                break L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L38: {
                                                                                            if (30 != var4) {
                                                                                              break L38;
                                                                                            } else {
                                                                                              if (var5 == 0) {
                                                                                                break L25;
                                                                                              } else {
                                                                                                break L38;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (var4 == 10) {
                                                                                            break L24;
                                                                                          } else {
                                                                                            if (11 == var4) {
                                                                                              break L23;
                                                                                            } else {
                                                                                              if ((var4 ^ -1) == -13) {
                                                                                                break L22;
                                                                                              } else {
                                                                                                if ((var4 ^ -1) == -14) {
                                                                                                  break L21;
                                                                                                } else {
                                                                                                  L39: {
                                                                                                    if (var4 != 14) {
                                                                                                      break L39;
                                                                                                    } else {
                                                                                                      if (var5 == 0) {
                                                                                                        break L20;
                                                                                                      } else {
                                                                                                        break L39;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  if (var4 == 15) {
                                                                                                    break L19;
                                                                                                  } else {
                                                                                                    L40: {
                                                                                                      if (-17 != (var4 ^ -1)) {
                                                                                                        break L40;
                                                                                                      } else {
                                                                                                        if (var5 == 0) {
                                                                                                          break L18;
                                                                                                        } else {
                                                                                                          break L40;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    L41: {
                                                                                                      if (var4 != 17) {
                                                                                                        break L41;
                                                                                                      } else {
                                                                                                        if (var5 == 0) {
                                                                                                          break L17;
                                                                                                        } else {
                                                                                                          break L41;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    if (18 == var4) {
                                                                                                      break L16;
                                                                                                    } else {
                                                                                                      if (31 == var4) {
                                                                                                        break L15;
                                                                                                      } else {
                                                                                                        if (32 == var4) {
                                                                                                          break L14;
                                                                                                        } else {
                                                                                                          L42: {
                                                                                                            if (var4 != 19) {
                                                                                                              break L42;
                                                                                                            } else {
                                                                                                              if (var5 == 0) {
                                                                                                                break L13;
                                                                                                              } else {
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          if (20 == var4) {
                                                                                                            break L12;
                                                                                                          } else {
                                                                                                            L43: {
                                                                                                              if (-22 != (var4 ^ -1)) {
                                                                                                                break L43;
                                                                                                              } else {
                                                                                                                if (var5 == 0) {
                                                                                                                  break L11;
                                                                                                                } else {
                                                                                                                  break L43;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            if (var4 == 29) {
                                                                                                              break L10;
                                                                                                            } else {
                                                                                                              if ((var4 ^ -1) == -23) {
                                                                                                                break L9;
                                                                                                              } else {
                                                                                                                L44: {
                                                                                                                  if ((var4 ^ -1) != -24) {
                                                                                                                    break L44;
                                                                                                                  } else {
                                                                                                                    if (var5 == 0) {
                                                                                                                      break L8;
                                                                                                                    } else {
                                                                                                                      break L44;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                if (-25 == (var4 ^ -1)) {
                                                                                                                  break L7;
                                                                                                                } else {
                                                                                                                  L45: {
                                                                                                                    if (-26 != (var4 ^ -1)) {
                                                                                                                      break L45;
                                                                                                                    } else {
                                                                                                                      if (var5 == 0) {
                                                                                                                        break L6;
                                                                                                                      } else {
                                                                                                                        break L45;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  if ((var4 ^ -1) == -27) {
                                                                                                                    break L5;
                                                                                                                  } else {
                                                                                                                    L46: {
                                                                                                                      if (27 != var4) {
                                                                                                                        break L46;
                                                                                                                      } else {
                                                                                                                        if (var5 == 0) {
                                                                                                                          break L4;
                                                                                                                        } else {
                                                                                                                          break L46;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    if (var4 == 34) {
                                                                                                                      break L3;
                                                                                                                    } else {
                                                                                                                      break L2;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          if ((param2 ^ -1) == -3) {
                                                                            this.b(2, -30659);
                                                                            if (var5 == 0) {
                                                                              break L2;
                                                                            } else {
                                                                              break L33;
                                                                            }
                                                                          } else {
                                                                            break L2;
                                                                          }
                                                                        }
                                                                        if (param2 != 3) {
                                                                          break L2;
                                                                        } else {
                                                                          this.b(3, -30659);
                                                                          if (var5 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L32;
                                                                          }
                                                                        }
                                                                      }
                                                                      L47: {
                                                                        if (2 == param2) {
                                                                          break L47;
                                                                        } else {
                                                                          if ((param2 ^ -1) != -5) {
                                                                            break L2;
                                                                          } else {
                                                                            this.b(5, param1 + -30656);
                                                                            if (var5 == 0) {
                                                                              break L2;
                                                                            } else {
                                                                              break L47;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      this.b(4, -30659);
                                                                      if (var5 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L31;
                                                                      }
                                                                    }
                                                                    if ((param2 ^ -1) != -5) {
                                                                      break L2;
                                                                    } else {
                                                                      this.b(5, -30659);
                                                                      if (var5 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  L48: {
                                                                    if (-3 != (param2 ^ -1)) {
                                                                      break L48;
                                                                    } else {
                                                                      this.b(6, -30659);
                                                                      if (var5 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L48;
                                                                      }
                                                                    }
                                                                  }
                                                                  L49: {
                                                                    if (param2 != 6) {
                                                                      break L49;
                                                                    } else {
                                                                      this.b(8, -30659);
                                                                      if (var5 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L49;
                                                                      }
                                                                    }
                                                                  }
                                                                  L50: {
                                                                    if (7 != param2) {
                                                                      break L50;
                                                                    } else {
                                                                      this.b(9, -30659);
                                                                      if (var5 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L50;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (param2 == 9) {
                                                                    this.b(10, -30659);
                                                                    if (var5 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L29;
                                                                    }
                                                                  } else {
                                                                    break L2;
                                                                  }
                                                                }
                                                                L51: {
                                                                  if (param2 == 18) {
                                                                    break L51;
                                                                  } else {
                                                                    if (5 == param2) {
                                                                      break L51;
                                                                    } else {
                                                                      if (-10 == (param2 ^ -1)) {
                                                                        break L51;
                                                                      } else {
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                this.b(7, param1 ^ 30656);
                                                                if (var5 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                              L52: {
                                                                if (param2 == 6) {
                                                                  break L52;
                                                                } else {
                                                                  L53: {
                                                                    if (-8 != (param2 ^ -1)) {
                                                                      break L53;
                                                                    } else {
                                                                      this.b(9, param1 ^ 30656);
                                                                      if (var5 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L53;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (-10 != (param2 ^ -1)) {
                                                                    break L2;
                                                                  } else {
                                                                    this.b(10, param1 + -30656);
                                                                    if (var5 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L52;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              this.b(8, -30659);
                                                              if (var5 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                            L54: {
                                                              if (-3 != (param2 ^ -1)) {
                                                                break L54;
                                                              } else {
                                                                this.b(30, -30659);
                                                                if (var5 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L54;
                                                                }
                                                              }
                                                            }
                                                            if ((param2 ^ -1) != -15) {
                                                              break L2;
                                                            } else {
                                                              this.b(12, -30659);
                                                              if (var5 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L26;
                                                              }
                                                            }
                                                          }
                                                          L55: {
                                                            if ((param2 ^ -1) != -3) {
                                                              break L55;
                                                            } else {
                                                              this.b(30, -30659);
                                                              if (var5 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L55;
                                                              }
                                                            }
                                                          }
                                                          if (14 == param2) {
                                                            this.b(12, -30659);
                                                            if (var5 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L25;
                                                            }
                                                          } else {
                                                            break L2;
                                                          }
                                                        }
                                                        L56: {
                                                          if (-3 != (param2 ^ -1)) {
                                                            break L56;
                                                          } else {
                                                            this.b(11, -30659);
                                                            if (var5 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L56;
                                                            }
                                                          }
                                                        }
                                                        if (param2 != 14) {
                                                          break L2;
                                                        } else {
                                                          this.b(12, param1 ^ 30656);
                                                          if (var5 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      if (param2 != 14) {
                                                        break L2;
                                                      } else {
                                                        this.b(12, -30659);
                                                        if (var5 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    if (-15 == (param2 ^ -1)) {
                                                      this.b(12, -30659);
                                                      if (var5 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L22;
                                                      }
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                  L57: {
                                                    L58: {
                                                      if (this.field_s) {
                                                        break L58;
                                                      } else {
                                                        if (-7 == (param2 ^ -1)) {
                                                          break L57;
                                                        } else {
                                                          break L58;
                                                        }
                                                      }
                                                    }
                                                    L59: {
                                                      L60: {
                                                        if (this.field_o) {
                                                          break L60;
                                                        } else {
                                                          if (param2 == 7) {
                                                            break L59;
                                                          } else {
                                                            break L60;
                                                          }
                                                        }
                                                      }
                                                      if ((param2 ^ -1) == -3) {
                                                        L61: {
                                                          if (this.field_s) {
                                                            break L61;
                                                          } else {
                                                            this.b(13, -30659);
                                                            if (var5 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L61;
                                                            }
                                                          }
                                                        }
                                                        L62: {
                                                          if (!this.field_o) {
                                                            break L62;
                                                          } else {
                                                            this.b(31, param1 + -30656);
                                                            if (var5 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L62;
                                                            }
                                                          }
                                                        }
                                                        this.b(16, param1 + -30656);
                                                        if (var5 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L59;
                                                        }
                                                      } else {
                                                        break L2;
                                                      }
                                                    }
                                                    this.b(17, param1 + -30656);
                                                    if (var5 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L57;
                                                    }
                                                  }
                                                  this.b(14, param1 ^ 30656);
                                                  if (var5 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                                if (6 == param2) {
                                                  this.b(14, -30659);
                                                  if (var5 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L20;
                                                  }
                                                } else {
                                                  break L2;
                                                }
                                              }
                                              L63: {
                                                if (param2 == 14) {
                                                  L64: {
                                                    if (this.field_o) {
                                                      break L64;
                                                    } else {
                                                      this.b(16, param1 + -30656);
                                                      if (var5 == 0) {
                                                        break L63;
                                                      } else {
                                                        break L64;
                                                      }
                                                    }
                                                  }
                                                  this.b(31, -30659);
                                                  break L63;
                                                } else {
                                                  break L63;
                                                }
                                              }
                                              if (2 == param2) {
                                                this.b(15, -30659);
                                                if (var5 == 0) {
                                                  break L2;
                                                } else {
                                                  break L19;
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                            if (14 != param2) {
                                              break L18;
                                            } else {
                                              L65: {
                                                if (this.field_o) {
                                                  break L65;
                                                } else {
                                                  this.b(16, -30659);
                                                  if (var5 == 0) {
                                                    break L18;
                                                  } else {
                                                    break L65;
                                                  }
                                                }
                                              }
                                              this.b(31, -30659);
                                              break L18;
                                            }
                                          }
                                          if (7 != param2) {
                                            break L2;
                                          } else {
                                            this.b(17, -30659);
                                            if (var5 == 0) {
                                              break L2;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        L66: {
                                          if (-15 != (param2 ^ -1)) {
                                            break L66;
                                          } else {
                                            L67: {
                                              if (this.field_s) {
                                                break L67;
                                              } else {
                                                this.b(13, param1 + -30656);
                                                if (var5 == 0) {
                                                  break L66;
                                                } else {
                                                  break L67;
                                                }
                                              }
                                            }
                                            this.b(31, -30659);
                                            break L66;
                                          }
                                        }
                                        if ((param2 ^ -1) != -3) {
                                          break L2;
                                        } else {
                                          this.b(18, -30659);
                                          if (var5 == 0) {
                                            break L2;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      if (14 != param2) {
                                        break L15;
                                      } else {
                                        L68: {
                                          if (this.field_s) {
                                            break L68;
                                          } else {
                                            this.b(13, -30659);
                                            if (var5 == 0) {
                                              break L15;
                                            } else {
                                              break L68;
                                            }
                                          }
                                        }
                                        this.b(31, -30659);
                                        break L15;
                                      }
                                    }
                                    if ((param2 ^ -1) != -3) {
                                      break L2;
                                    } else {
                                      this.b(32, -30659);
                                      if (var5 == 0) {
                                        break L2;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if ((param2 ^ -1) == -3) {
                                    this.b(19, -30659);
                                    if (var5 == 0) {
                                      break L2;
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                                if (param2 == 3) {
                                  this.b(20, param1 + -30656);
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                              L69: {
                                if (2 != param2) {
                                  break L69;
                                } else {
                                  this.b(21, -30659);
                                  break L69;
                                }
                              }
                              if (-17 != (param2 ^ -1)) {
                                break L2;
                              } else {
                                this.b(29, param1 + -30656);
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (-17 == (param2 ^ -1)) {
                              this.b(29, -30659);
                              if (var5 == 0) {
                                break L2;
                              } else {
                                break L10;
                              }
                            } else {
                              break L2;
                            }
                          }
                          if (param2 != 17) {
                            break L2;
                          } else {
                            this.b(22, -30659);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (10 != param2) {
                          break L2;
                        } else {
                          this.b(23, -30659);
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (11 == param2) {
                        this.b(24, -30659);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      } else {
                        break L2;
                      }
                    }
                    if ((param2 ^ -1) == -13) {
                      this.b(25, -30659);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (-3 != (param2 ^ -1)) {
                    break L2;
                  } else {
                    this.b(26, param1 + -30656);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                if ((param2 ^ -1) != -3) {
                  break L2;
                } else {
                  this.b(27, -30659);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L70: {
                if (-14 == (param2 ^ -1)) {
                  break L70;
                } else {
                  if (param2 != 15) {
                    break L2;
                  } else {
                    break L70;
                  }
                }
              }
              if (!this.c((byte) -62)) {
                break L2;
              } else {
                this.b(28, param1 + -30656);
                if (var5 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (-3 != (param2 ^ -1)) {
              break L2;
            } else {
              this.field_j = 0;
              break L2;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        L0: {
          L1: {
            var2 = 40;
            if ((this.field_k ^ -1) == -34) {
              break L1;
            } else {
              if (this.field_c) {
                var2 = this.field_a;
                if (!ArmiesOfGielinor.field_M) {
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L0;
              }
            }
          }
          var2 = 0;
          break L0;
        }
        L2: {
          if (0 < this.field_m) {
            this.field_m = this.field_m - 1;
            if ((this.field_m ^ -1) != -1) {
              break L2;
            } else {
              this.b(-1, -3, 1);
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          var3 = 0 / ((-9 - param0) / 47);
          if (var2 < this.field_j) {
            L4: {
              var4 = -var2 + this.field_j;
              stackOut_11_0 = this;
              stackOut_11_1 = this.field_j;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if ((var4 ^ -1) < -6) {
                stackOut_13_0 = this;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = 5;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                break L4;
              } else {
                stackOut_12_0 = this;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = var4;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                break L4;
              }
            }
            ((iu) (this)).field_j = stackIn_14_1 - stackIn_14_2;
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          if ((var2 ^ -1) >= (this.field_j ^ -1)) {
            break L5;
          } else {
            L6: {
              var4 = -this.field_j + var2;
              stackOut_16_0 = this;
              stackOut_16_1 = this.field_j;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              if (5 < var4) {
                stackOut_18_0 = this;
                stackOut_18_1 = stackIn_18_1;
                stackOut_18_2 = 5;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                stackIn_19_2 = stackOut_18_2;
                break L6;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = var4;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                break L6;
              }
            }
            ((iu) (this)).field_j = stackIn_19_1 + stackIn_19_2;
            break L5;
          }
        }
        L7: {
          if ((this.field_g ^ -1) >= (this.field_f ^ -1)) {
            break L7;
          } else {
            L8: {
              var4 = this.field_g - this.field_f;
              stackOut_21_0 = this;
              stackOut_21_1 = this.field_g;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              if ((var4 ^ -1) < -6) {
                stackOut_23_0 = this;
                stackOut_23_1 = stackIn_23_1;
                stackOut_23_2 = 5;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                break L8;
              } else {
                stackOut_22_0 = this;
                stackOut_22_1 = stackIn_22_1;
                stackOut_22_2 = var4;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_24_2 = stackOut_22_2;
                break L8;
              }
            }
            ((iu) (this)).field_g = stackIn_24_1 - stackIn_24_2;
            break L7;
          }
        }
        L9: {
          if (this.field_f <= this.field_g) {
            break L9;
          } else {
            L10: {
              var4 = this.field_f + -this.field_g;
              stackOut_26_0 = this;
              stackOut_26_1 = this.field_g;
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              if (-6 > (var4 ^ -1)) {
                stackOut_28_0 = this;
                stackOut_28_1 = stackIn_28_1;
                stackOut_28_2 = 5;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                stackIn_29_2 = stackOut_28_2;
                break L10;
              } else {
                stackOut_27_0 = this;
                stackOut_27_1 = stackIn_27_1;
                stackOut_27_2 = var4;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_29_2 = stackOut_27_2;
                break L10;
              }
            }
            ((iu) (this)).field_g = stackIn_29_1 + stackIn_29_2;
            break L9;
          }
        }
    }

    private final void b(byte param0) {
        if (param0 <= 72) {
            return;
        }
        this.field_q.field_jc = true;
    }

    private final void g(int param0) {
        int var2 = 103 / ((param0 - -42) / 55);
        uh.a(sb.field_g, 125);
    }

    private final void g(byte param0) {
        int var2 = -88 % ((param0 - 8) / 48);
        this.field_q.field_Ab = true;
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.field_c = true;
          this.field_k = param0;
          this.d((byte) 37);
          if (param1 == -30659) {
            break L0;
          } else {
            this.field_g = -114;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            L11: {
                              L12: {
                                L13: {
                                  L14: {
                                    L15: {
                                      L16: {
                                        L17: {
                                          L18: {
                                            L19: {
                                              L20: {
                                                L21: {
                                                  L22: {
                                                    L23: {
                                                      L24: {
                                                        L25: {
                                                          L26: {
                                                            L27: {
                                                              L28: {
                                                                L29: {
                                                                  L30: {
                                                                    L31: {
                                                                      L32: {
                                                                        L33: {
                                                                          L34: {
                                                                            L35: {
                                                                              L36: {
                                                                                var3 = this.field_k;
                                                                                if (var3 != 0) {
                                                                                  break L36;
                                                                                } else {
                                                                                  if (var4 == 0) {
                                                                                    this.field_w = 2;
                                                                                    this.field_m = 150;
                                                                                    this.field_e = ci.field_f[0];
                                                                                    if (var4 == 0) {
                                                                                      break L2;
                                                                                    } else {
                                                                                      break L35;
                                                                                    }
                                                                                  } else {
                                                                                    break L36;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L37: {
                                                                                if (var3 != 1) {
                                                                                  break L37;
                                                                                } else {
                                                                                  if (var4 == 0) {
                                                                                    break L35;
                                                                                  } else {
                                                                                    break L37;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L38: {
                                                                                if (2 != var3) {
                                                                                  break L38;
                                                                                } else {
                                                                                  if (var4 == 0) {
                                                                                    break L34;
                                                                                  } else {
                                                                                    break L38;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L39: {
                                                                                if (-4 != (var3 ^ -1)) {
                                                                                  break L39;
                                                                                } else {
                                                                                  if (var4 == 0) {
                                                                                    break L33;
                                                                                  } else {
                                                                                    break L39;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (4 == var3) {
                                                                                break L32;
                                                                              } else {
                                                                                L40: {
                                                                                  if (var3 != 5) {
                                                                                    break L40;
                                                                                  } else {
                                                                                    if (var4 == 0) {
                                                                                      break L31;
                                                                                    } else {
                                                                                      break L40;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if ((var3 ^ -1) == -7) {
                                                                                  break L30;
                                                                                } else {
                                                                                  L41: {
                                                                                    if (7 != var3) {
                                                                                      break L41;
                                                                                    } else {
                                                                                      if (var4 == 0) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        break L41;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L42: {
                                                                                    if (8 != var3) {
                                                                                      break L42;
                                                                                    } else {
                                                                                      if (var4 == 0) {
                                                                                        break L28;
                                                                                      } else {
                                                                                        break L42;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if ((var3 ^ -1) == -10) {
                                                                                    break L27;
                                                                                  } else {
                                                                                    L43: {
                                                                                      if (-31 != (var3 ^ -1)) {
                                                                                        break L43;
                                                                                      } else {
                                                                                        if (var4 == 0) {
                                                                                          break L26;
                                                                                        } else {
                                                                                          break L43;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    if ((var3 ^ -1) == -11) {
                                                                                      break L25;
                                                                                    } else {
                                                                                      L44: {
                                                                                        if (11 != var3) {
                                                                                          break L44;
                                                                                        } else {
                                                                                          if (var4 == 0) {
                                                                                            break L24;
                                                                                          } else {
                                                                                            break L44;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (12 == var3) {
                                                                                        break L23;
                                                                                      } else {
                                                                                        L45: {
                                                                                          if (13 != var3) {
                                                                                            break L45;
                                                                                          } else {
                                                                                            if (var4 == 0) {
                                                                                              break L22;
                                                                                            } else {
                                                                                              break L45;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L46: {
                                                                                          if (var3 != 14) {
                                                                                            break L46;
                                                                                          } else {
                                                                                            if (var4 == 0) {
                                                                                              break L21;
                                                                                            } else {
                                                                                              break L46;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        if ((var3 ^ -1) == -16) {
                                                                                          break L20;
                                                                                        } else {
                                                                                          L47: {
                                                                                            if (var3 != 16) {
                                                                                              break L47;
                                                                                            } else {
                                                                                              if (var4 == 0) {
                                                                                                break L19;
                                                                                              } else {
                                                                                                break L47;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (17 == var3) {
                                                                                            break L18;
                                                                                          } else {
                                                                                            L48: {
                                                                                              if (var3 != 18) {
                                                                                                break L48;
                                                                                              } else {
                                                                                                if (var4 == 0) {
                                                                                                  break L17;
                                                                                                } else {
                                                                                                  break L48;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            if (var3 == 31) {
                                                                                              break L16;
                                                                                            } else {
                                                                                              if (var3 == 32) {
                                                                                                break L15;
                                                                                              } else {
                                                                                                if (-20 == (var3 ^ -1)) {
                                                                                                  break L14;
                                                                                                } else {
                                                                                                  L49: {
                                                                                                    if (var3 != 20) {
                                                                                                      break L49;
                                                                                                    } else {
                                                                                                      if (var4 == 0) {
                                                                                                        break L13;
                                                                                                      } else {
                                                                                                        break L49;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  if ((var3 ^ -1) == -22) {
                                                                                                    break L12;
                                                                                                  } else {
                                                                                                    if ((var3 ^ -1) == -23) {
                                                                                                      break L11;
                                                                                                    } else {
                                                                                                      if ((var3 ^ -1) == -24) {
                                                                                                        break L10;
                                                                                                      } else {
                                                                                                        L50: {
                                                                                                          if (var3 != 24) {
                                                                                                            break L50;
                                                                                                          } else {
                                                                                                            if (var4 == 0) {
                                                                                                              break L9;
                                                                                                            } else {
                                                                                                              break L50;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        if ((var3 ^ -1) == -26) {
                                                                                                          break L8;
                                                                                                        } else {
                                                                                                          if (26 == var3) {
                                                                                                            break L7;
                                                                                                          } else {
                                                                                                            L51: {
                                                                                                              if ((var3 ^ -1) != -28) {
                                                                                                                break L51;
                                                                                                              } else {
                                                                                                                if (var4 == 0) {
                                                                                                                  break L6;
                                                                                                                } else {
                                                                                                                  break L51;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            if (-29 == (var3 ^ -1)) {
                                                                                                              break L5;
                                                                                                            } else {
                                                                                                              if (var3 == 29) {
                                                                                                                break L4;
                                                                                                              } else {
                                                                                                                if (var3 == 34) {
                                                                                                                  break L3;
                                                                                                                } else {
                                                                                                                  this.a(this.field_e, (byte) 112);
                                                                                                                  break L1;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_e = ci.field_f[1];
                                                                            this.field_w = 0;
                                                                            if (var4 == 0) {
                                                                              break L2;
                                                                            } else {
                                                                              break L34;
                                                                            }
                                                                          }
                                                                          this.field_e = null;
                                                                          this.a(3, 4, param1 + 30685);
                                                                          this.field_w = 2;
                                                                          if (var4 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L33;
                                                                          }
                                                                        }
                                                                        this.d(-4);
                                                                        this.field_e = ci.field_f[2];
                                                                        this.field_w = 0;
                                                                        if (var4 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L32;
                                                                        }
                                                                      }
                                                                      this.field_e = ci.field_f[3];
                                                                      this.field_w = 1;
                                                                      this.a((byte) -122);
                                                                      if (var4 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L31;
                                                                      }
                                                                    }
                                                                    this.field_e = ci.field_f[4];
                                                                    this.field_w = 0;
                                                                    this.f((byte) -34);
                                                                    if (var4 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L30;
                                                                    }
                                                                  }
                                                                  this.field_w = 1;
                                                                  this.field_e = ci.field_f[5];
                                                                  if (var4 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                                this.field_w = 1;
                                                                this.field_e = ci.field_f[6];
                                                                if (var4 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                              this.field_w = 0;
                                                              this.field_e = ci.field_f[8];
                                                              this.field_s = true;
                                                              if (var4 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                            this.field_o = true;
                                                            this.field_w = 0;
                                                            this.field_e = ci.field_f[7];
                                                            if (var4 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                          this.field_w = 0;
                                                          this.field_e = ci.field_f[25];
                                                          if (var4 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                        this.b((byte) 113);
                                                        this.field_w = 1;
                                                        this.field_e = ci.field_f[9];
                                                        if (var4 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                      this.b((byte) 111);
                                                      this.field_w = 1;
                                                      this.field_e = ci.field_f[10];
                                                      if (var4 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                    this.field_w = 0;
                                                    this.field_e = ci.field_f[11];
                                                    this.e(31);
                                                    if (var4 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                  this.field_w = 1;
                                                  this.field_e = ci.field_f[12];
                                                  this.g(26);
                                                  if (var4 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                                this.field_e = ci.field_f[8];
                                                this.f((byte) -34);
                                                this.field_s = true;
                                                this.field_w = 0;
                                                if (var4 == 0) {
                                                  break L2;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                              this.field_e = ci.field_f[14];
                                              this.f((byte) -34);
                                              this.b((byte) 120);
                                              this.field_w = 1;
                                              if (var4 == 0) {
                                                break L2;
                                              } else {
                                                break L19;
                                              }
                                            }
                                            this.field_e = ci.field_f[13];
                                            this.field_w = 1;
                                            this.a(5);
                                            if (var4 == 0) {
                                              break L2;
                                            } else {
                                              break L18;
                                            }
                                          }
                                          this.field_e = ci.field_f[7];
                                          this.f((byte) -34);
                                          this.field_w = 0;
                                          this.field_o = true;
                                          if (var4 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        this.field_e = ci.field_f[14];
                                        this.f((byte) -34);
                                        this.b((byte) 90);
                                        this.field_w = 1;
                                        if (var4 == 0) {
                                          break L2;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      this.field_e = ci.field_f[26];
                                      this.field_w = 0;
                                      this.j((byte) -119);
                                      if (var4 == 0) {
                                        break L2;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    this.field_e = ci.field_f[27];
                                    this.field_w = 0;
                                    this.k((byte) -120);
                                    if (var4 == 0) {
                                      break L2;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  this.field_w = 2;
                                  this.field_e = null;
                                  this.c(param1 ^ -30659);
                                  this.a(13, 17, 26);
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    break L13;
                                  }
                                }
                                this.field_w = 0;
                                this.field_e = ci.field_f[15];
                                if (var4 == 0) {
                                  break L2;
                                } else {
                                  break L12;
                                }
                              }
                              this.field_e = ci.field_f[16];
                              this.field_w = 1;
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L11;
                              }
                            }
                            this.field_e = ci.field_f[17];
                            this.field_w = 1;
                            if (var4 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          }
                          this.field_e = ci.field_f[18];
                          this.field_w = 1;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                        this.field_e = ci.field_f[19];
                        this.field_w = 1;
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                      this.field_e = ci.field_f[20];
                      this.field_w = 0;
                      this.g((byte) 59);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                    this.field_w = 0;
                    this.field_e = ci.field_f[21];
                    this.e((byte) 115);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                  this.field_e = ci.field_f[22];
                  this.f((byte) -34);
                  this.field_w = 1;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
                this.field_e = ci.field_f[23];
                this.field_w = 3;
                this.i((byte) 44);
                if (var4 == 0) {
                  break L2;
                } else {
                  break L4;
                }
              }
              this.field_w = 1;
              this.field_e = ci.field_f[24];
              if (var4 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
            this.field_e = vl.field_m[this.field_p];
            this.field_w = 1;
            break L2;
          }
          this.a(this.field_e, (byte) 112);
          break L1;
        }
    }

    private final void a(int param0) {
        uh.a(m.field_a, 124);
        if (param0 != 5) {
            this.field_a = 30;
        }
    }

    private final void c(int param0) {
        this.field_q.field_xb.field_Eb[9 - -(this.field_q.field_xb.field_v * 12)].field_h = 10;
        nk.a((byte) 106);
        this.field_q.field_xb.field_l.a((byte) -119, (tc) (new mb(0, 9, 12, -4, 1)));
        this.field_q.field_xb.field_l.a((byte) -119, (tc) (new mb(0, 15, 13, param0, 1)));
        this.field_q.field_xb.field_l.a((byte) -119, (tc) (new mb(5, 16, 17, 0, 1)));
        this.field_v = true;
    }

    private final void a(byte param0) {
        if (param0 != -122) {
            this.f((byte) 104);
        }
        uh.a(f.field_D, 125);
    }

    final void h(byte param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        wk[] stackIn_10_4 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        wk[] stackIn_11_4 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        wk[] stackIn_12_4 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        wk[] stackIn_13_4 = null;
        int[] stackIn_13_5 = null;
        int stackIn_20_0 = 0;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        wk[] stackOut_9_4 = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        wk[] stackOut_10_4 = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        wk[] stackOut_11_4 = null;
        int[] stackOut_11_5 = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        wk[] stackOut_12_4 = null;
        int[] stackOut_12_5 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        String stackOut_23_0 = null;
        String stackOut_22_0 = null;
        String stackOut_27_0 = null;
        String stackOut_26_0 = null;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 21) {
            break L0;
          } else {
            this.field_a = -21;
            break L0;
          }
        }
        L1: {
          if (-1 == (this.field_k ^ -1)) {
            ol.field_y.g(db.a(true, 320) + -(ol.field_y.field_y >> -1526469727), u.a(100, (byte) 94));
            fe.b(this.field_e, db.a(true, 320), u.a(130, (byte) 94));
            fe.c(this.field_e, db.a(true, 320), u.a(130, (byte) 94), nd.field_b, false);
            this.field_j = 40;
            break L1;
          } else {
            break L1;
          }
        }
        if (0 == this.field_j) {
          return;
        } else {
          L2: {
            L3: {
              var2 = so.field_b.field_a;
              var3 = so.field_b.field_g;
              qn.f(-10 + var2 + -this.field_g, -this.field_j + var3 + -10, -10 + var2, var3);
              fe.b(-10 + (-this.field_g + var2), -10 + -this.field_j + var3, this.field_g, this.field_j, io.field_m, nd.field_b, 0, 192);
              if (4 == this.field_w) {
                break L3;
              } else {
                L4: {
                  L5: {
                    stackOut_9_0 = -5 + var2 + -this.field_g;
                    stackOut_9_1 = -45 + var3;
                    stackOut_9_2 = this.field_g - 10;
                    stackOut_9_3 = 30;
                    stackOut_9_4 = il.field_s;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_12_1 = stackOut_9_1;
                    stackIn_12_2 = stackOut_9_2;
                    stackIn_12_3 = stackOut_9_3;
                    stackIn_12_4 = stackOut_9_4;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    stackIn_10_4 = stackOut_9_4;
                    if (-3 == (this.field_w ^ -1)) {
                      break L5;
                    } else {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = stackIn_10_2;
                      stackOut_10_3 = stackIn_10_3;
                      stackOut_10_4 = (wk[]) ((Object) stackIn_10_4);
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      stackIn_12_4 = stackOut_10_4;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      stackIn_11_3 = stackOut_10_3;
                      stackIn_11_4 = stackOut_10_4;
                      if (!wg.a(param0 + -54, -5 + -this.field_g + var2, var2 - 15, -45 + var3, var3 + -15)) {
                        break L5;
                      } else {
                        stackOut_11_0 = stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = stackIn_11_2;
                        stackOut_11_3 = stackIn_11_3;
                        stackOut_11_4 = (wk[]) ((Object) stackIn_11_4);
                        stackOut_11_5 = ci.field_e;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_13_4 = stackOut_11_4;
                        stackIn_13_5 = stackOut_11_5;
                        break L4;
                      }
                    }
                  }
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = stackIn_12_3;
                  stackOut_12_4 = (wk[]) ((Object) stackIn_12_4);
                  stackOut_12_5 = nd.field_b;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  stackIn_13_4 = stackOut_12_4;
                  stackIn_13_5 = stackOut_12_5;
                  break L4;
                }
                L6: {
                  fe.a(stackIn_13_0, stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_13_4, stackIn_13_5, 0, 192, true);
                  if ((this.field_w ^ -1) != -1) {
                    break L6;
                  } else {
                    fe.c(qf.field_c, -10 + (-120 + var2), -16 + var3, 0, true);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-2 != (this.field_w ^ -1)) {
                    break L7;
                  } else {
                    L8: {
                      if (-35 != (this.field_k ^ -1)) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L8;
                      } else {
                        stackOut_18_0 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var4 = stackIn_20_0;
                        if (this.field_c) {
                          break L10;
                        } else {
                          L11: {
                            if (var4 != 0) {
                              stackOut_23_0 = vg.field_k;
                              stackIn_24_0 = stackOut_23_0;
                              break L11;
                            } else {
                              stackOut_22_0 = pl.field_z;
                              stackIn_24_0 = stackOut_22_0;
                              break L11;
                            }
                          }
                          fe.c(stackIn_24_0, var2 + -(this.field_g / 2) - 10, var3 + -16, 0, true);
                          if (var5 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L12: {
                        if (var4 == 0) {
                          stackOut_27_0 = jk.field_a;
                          stackIn_28_0 = stackOut_27_0;
                          break L12;
                        } else {
                          stackOut_26_0 = kj.field_t;
                          stackIn_28_0 = stackOut_26_0;
                          break L12;
                        }
                      }
                      fe.c(stackIn_28_0, -10 + (var2 - this.field_g / 2), var3 - 16, 0, true);
                      break L9;
                    }
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L7;
                    }
                  }
                }
                L13: {
                  if (-3 != (this.field_w ^ -1)) {
                    break L13;
                  } else {
                    fe.c(bc.field_f, -120 + var2 + -10, -16 + var3, 0, true);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (-4 != (this.field_w ^ -1)) {
                    break L14;
                  } else {
                    fe.c(ac.field_u, -10 + var2 - 120, -16 + var3, 0, true);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L14;
                    }
                  }
                }
                if ((this.field_w ^ -1) == -6) {
                  fe.c(al.field_m, -120 + var2 + -10, var3 - 16, 0, true);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  break L2;
                }
              }
            }
            fe.a(-5 + -this.field_g + var2, -45 + var3, -10 + this.field_g, 30, il.field_s, jh.field_k, 0, 192, true);
            break L2;
          }
          L15: {
            if (this.field_e != null) {
              qn.f(var2 - this.field_g, -this.field_j + var3, var2 - 10, var3 - 45);
              discarded$1 = rs.field_n.a(this.field_e, -this.field_g + var2, -this.field_j + var3, 220, 400, 16777215, -1, 0, 0, 0);
              break L15;
            } else {
              break L15;
            }
          }
          qn.a();
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param2 != 26) {
            return;
        }
        this.field_q.c(25, param0, param1);
    }

    final void d(byte param0) {
        this.field_q.field_fc = false;
        this.field_q.field_Mb = false;
        this.field_q.field_Ab = false;
        this.field_q.field_ac = false;
        if (param0 != 37) {
            field_i = (String) null;
        }
    }

    private final void a(int param0, int param1) {
        if (param1 != 13567) {
            return;
        }
        this.field_p = param0;
        this.b(34, -30659);
    }

    private final void e(byte param0) {
        if (param0 <= 90) {
            return;
        }
        uh.a(pl.field_s, -91);
    }

    private final void i(byte param0) {
        rt.d((byte) 113);
        int var2 = 47 / ((param0 - -75) / 34);
        this.field_q.a(0, (byte) 30, 255);
    }

    final void a(boolean param0) {
        int var3 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            this.a((byte) -26);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_w ^ -1) == -1) {
              break L2;
            } else {
              L3: {
                if (1 == this.field_w) {
                  break L3;
                } else {
                  L4: {
                    if ((this.field_w ^ -1) != -4) {
                      break L4;
                    } else {
                      this.field_q.d(114, true);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (this.field_w == 5) {
                    this.field_k = 33;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L5: {
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (this.field_c) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L5;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L5;
                }
              }
              L6: {
                ((iu) (this)).field_c = stackIn_13_1 != 0;
                stackOut_13_0 = this;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (!this.field_c) {
                  stackOut_15_0 = this;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if ((this.field_k ^ -1) != -35) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 240;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L6;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 100;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L6;
                  }
                } else {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 240;
                  stackIn_18_0 = stackOut_14_0;
                  stackIn_18_1 = stackOut_14_1;
                  break L6;
                }
              }
              ((iu) (this)).field_f = stackIn_18_1;
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.b(-1, -3, 2);
          break L1;
        }
    }

    private final void j(byte param0) {
        if (param0 > -95) {
            this.field_p = 95;
        }
        this.field_q.field_fc = true;
    }

    private final void d(int param0) {
        this.field_q.field_xb.field_l.a((byte) -119, (tc) (new mb(0, 3, 4, 5, 0, true)));
        int var2 = -44 % ((-70 - param0) / 43);
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        if (param1 <= -108) {
          var3 = this.field_q.field_xb.field_Eb[param0].field_h;
          var4 = var3;
          if (-8 == (var4 ^ -1)) {
            return 6;
          } else {
            if ((var4 ^ -1) == -9) {
              return 7;
            } else {
              if (9 == var4) {
                return 8;
              } else {
                return 9;
              }
            }
          }
        } else {
          return -34;
        }
    }

    private final void k(byte param0) {
        if (param0 > -55) {
            return;
        }
        this.field_q.field_Mb = true;
    }

    private final void f(byte param0) {
        si.b(13829);
        if (param0 != -34) {
            this.field_s = false;
        }
    }

    final static int a(int param0, String param1, int param2, ka param3, String[] param4) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.a(param1);
              if (param0 < var5_int) {
                break L1;
              } else {
                if ((param1.indexOf("<br>") ^ -1) != 0) {
                  break L1;
                } else {
                  param4[0] = param1;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (param2 == 7502) {
                break L2;
              } else {
                iu.b(6);
                break L2;
              }
            }
            var6 = (-1 + var5_int - -param0) / param0;
            param0 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if ((var8 ^ -1) >= (var9 ^ -1)) {
                    break L5;
                  } else {
                    var10 = param1.charAt(var9);
                    stackOut_9_0 = var10;
                    stackOut_9_1 = 32;
                    stackIn_21_0 = stackOut_9_0;
                    stackIn_21_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (var13 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (stackIn_10_0 == stackIn_10_1) {
                            break L7;
                          } else {
                            if (45 == var10) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var11 = param1.substring(var7, var9 + 1).trim();
                        var12 = param3.a(var11);
                        if (var12 < param0) {
                          break L6;
                        } else {
                          incrementValue$3 = var6;
                          var6++;
                          param4[incrementValue$3] = var11;
                          var7 = 1 + var9;
                          break L6;
                        }
                      }
                      L8: {
                        if (var10 != 62) {
                          break L8;
                        } else {
                          if (param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                            incrementValue$4 = var6;
                            var6++;
                            param4[incrementValue$4] = param1.substring(var7, -3 + var9).trim();
                            var7 = var9 + 1;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var9++;
                      if (var13 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_20_0 = var8;
                stackOut_20_1 = var7;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L4;
              }
              L9: {
                if (stackIn_21_0 > stackIn_21_1) {
                  incrementValue$5 = var6;
                  var6++;
                  param4[incrementValue$5] = param1.substring(var7, var8).trim();
                  break L9;
                } else {
                  break L9;
                }
              }
              stackOut_24_0 = var6;
              stackIn_25_0 = stackOut_24_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var5);
            stackOut_26_1 = new StringBuilder().append("iu.MA(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          L12: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param4 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L12;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_25_0;
        }
    }

    private final void e(int param0) {
        this.field_q.field_ac = true;
        if (param0 != 31) {
            this.field_e = (String) null;
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_u = null;
        field_l = null;
        if (param0 != 1) {
            return;
        }
        field_d = null;
        field_b = null;
        field_r = null;
    }

    iu(ic param0, int param1) {
        this.field_g = 240;
        this.field_w = 0;
        this.field_m = 0;
        this.field_k = 0;
        this.field_j = 40;
        try {
            this.field_a = 40;
            this.field_q = param0;
            this.a(param1, 13567);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "iu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    iu(ic param0) {
        this.field_g = 240;
        this.field_w = 0;
        this.field_m = 0;
        this.field_k = 0;
        this.field_j = 40;
        try {
            this.field_a = 40;
            this.field_q = param0;
            this.field_s = false;
            this.field_v = false;
            this.field_o = false;
            this.b(0, -30659);
            this.field_q.field_xb.field_Eb[pl.field_s[0]].field_a = 1;
            this.field_q.field_xb.field_f = true;
            this.field_q.field_xb.field_z[1][1] = 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "iu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = 0;
        field_b = "Change display name";
        field_l = "Year";
        field_i = "Offline";
        field_x = 4;
        field_h = false;
        field_r = "This unit already has a poisonous attack.";
        field_u = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
