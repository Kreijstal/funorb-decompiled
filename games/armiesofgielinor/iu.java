/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        if (((iu) this).field_q.field_xb.field_t[1].b(false) == 0) {
          if (((iu) this).field_q.field_xb.field_Eb[pl.field_s[0]].field_a != 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(String param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                ((iu) this).field_e = param0;
                if (((iu) this).field_e == null) {
                  break L2;
                } else {
                  if (!((iu) this).field_c) {
                    break L2;
                  } else {
                    ((iu) this).field_a = 50 + rs.field_n.a(((iu) this).field_e, 220, 0);
                    ((iu) this).field_f = 240;
                    break L1;
                  }
                }
              }
              ((iu) this).field_a = 40;
              if (((iu) this).field_k != 34) {
                break L1;
              } else {
                ((iu) this).field_f = 100;
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
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("iu.FA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
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
              if (((iu) this).field_v) {
                this.b(28, -30659);
                return;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var4 = ((iu) this).field_k;
            if (var4 == 0) {
              if (param2 == 1) {
                this.b(1, -30659);
                break L2;
              } else {
                break L2;
              }
            } else {
              if (var4 == 1) {
                if (param2 == 2) {
                  this.b(2, -30659);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                if (2 == var4) {
                  if (param2 != 3) {
                    break L2;
                  } else {
                    this.b(3, -30659);
                    break L2;
                  }
                } else {
                  if (var4 == 3) {
                    if (2 == param2) {
                      this.b(4, -30659);
                      break L2;
                    } else {
                      if (param2 != 4) {
                        break L2;
                      } else {
                        this.b(5, param1 + -30656);
                        break L2;
                      }
                    }
                  } else {
                    if (var4 != 4) {
                      if (var4 == 5) {
                        if (param2 != 2) {
                          if (param2 != 6) {
                            if (7 != param2) {
                              if (param2 == 9) {
                                this.b(10, -30659);
                                break L2;
                              } else {
                                break L2;
                              }
                            } else {
                              this.b(9, -30659);
                              break L2;
                            }
                          } else {
                            this.b(8, -30659);
                            break L2;
                          }
                        } else {
                          this.b(6, -30659);
                          break L2;
                        }
                      } else {
                        if (var4 == 6) {
                          L3: {
                            if (param2 == 18) {
                              break L3;
                            } else {
                              if (5 == param2) {
                                break L3;
                              } else {
                                if (param2 == 9) {
                                  break L3;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                          this.b(7, param1 ^ 30656);
                          break L2;
                        } else {
                          if (var4 != 7) {
                            if (var4 == 8) {
                              if (param2 != 2) {
                                if (param2 != 14) {
                                  break L2;
                                } else {
                                  this.b(12, -30659);
                                  break L2;
                                }
                              } else {
                                this.b(30, -30659);
                                break L2;
                              }
                            } else {
                              if (var4 != 9) {
                                if (30 != var4) {
                                  if (var4 == 10) {
                                    if (param2 != 14) {
                                      break L2;
                                    } else {
                                      this.b(12, -30659);
                                      break L2;
                                    }
                                  } else {
                                    if (11 == var4) {
                                      if (param2 == 14) {
                                        this.b(12, -30659);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      if (var4 == 12) {
                                        L4: {
                                          if (((iu) this).field_s) {
                                            break L4;
                                          } else {
                                            if (param2 == 6) {
                                              this.b(14, param1 ^ 30656);
                                              break L2;
                                            } else {
                                              break L4;
                                            }
                                          }
                                        }
                                        L5: {
                                          if (((iu) this).field_o) {
                                            break L5;
                                          } else {
                                            if (param2 == 7) {
                                              this.b(17, param1 + -30656);
                                              break L2;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        if (param2 == 2) {
                                          if (((iu) this).field_s) {
                                            if (!((iu) this).field_o) {
                                              this.b(16, param1 + -30656);
                                              break L2;
                                            } else {
                                              this.b(31, param1 + -30656);
                                              break L2;
                                            }
                                          } else {
                                            this.b(13, -30659);
                                            break L2;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      } else {
                                        if (var4 == 13) {
                                          if (6 == param2) {
                                            this.b(14, -30659);
                                            break L2;
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          if (var4 != 14) {
                                            L6: {
                                              if (var4 == 15) {
                                                if (14 != param2) {
                                                  break L6;
                                                } else {
                                                  if (((iu) this).field_o) {
                                                    this.b(31, -30659);
                                                    break L6;
                                                  } else {
                                                    this.b(16, -30659);
                                                    break L6;
                                                  }
                                                }
                                              } else {
                                                if (var4 != 16) {
                                                  if (var4 != 17) {
                                                    L7: {
                                                      if (18 == var4) {
                                                        if (14 != param2) {
                                                          break L7;
                                                        } else {
                                                          if (((iu) this).field_s) {
                                                            this.b(31, -30659);
                                                            break L7;
                                                          } else {
                                                            this.b(13, -30659);
                                                            break L7;
                                                          }
                                                        }
                                                      } else {
                                                        if (31 == var4) {
                                                          break L7;
                                                        } else {
                                                          if (32 == var4) {
                                                            if (param2 == 2) {
                                                              this.b(19, -30659);
                                                              break L2;
                                                            } else {
                                                              break L2;
                                                            }
                                                          } else {
                                                            if (var4 != 19) {
                                                              if (20 == var4) {
                                                                L8: {
                                                                  if (2 != param2) {
                                                                    break L8;
                                                                  } else {
                                                                    this.b(21, -30659);
                                                                    break L8;
                                                                  }
                                                                }
                                                                if (param2 != 16) {
                                                                  break L2;
                                                                } else {
                                                                  this.b(29, param1 + -30656);
                                                                  break L2;
                                                                }
                                                              } else {
                                                                if (var4 != 21) {
                                                                  if (var4 == 29) {
                                                                    if (param2 != 17) {
                                                                      break L2;
                                                                    } else {
                                                                      this.b(22, -30659);
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    if (var4 == 22) {
                                                                      if (10 != param2) {
                                                                        break L2;
                                                                      } else {
                                                                        this.b(23, -30659);
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      if (var4 != 23) {
                                                                        if (var4 == 24) {
                                                                          if (param2 == 12) {
                                                                            this.b(25, -30659);
                                                                            break L2;
                                                                          } else {
                                                                            break L2;
                                                                          }
                                                                        } else {
                                                                          if (var4 != 25) {
                                                                            if (var4 == 26) {
                                                                              if (param2 != 2) {
                                                                                break L2;
                                                                              } else {
                                                                                this.b(27, -30659);
                                                                                break L2;
                                                                              }
                                                                            } else {
                                                                              if (27 != var4) {
                                                                                if (var4 == 34) {
                                                                                  if (param2 != 2) {
                                                                                    break L2;
                                                                                  } else {
                                                                                    ((iu) this).field_j = 0;
                                                                                    break L2;
                                                                                  }
                                                                                } else {
                                                                                  break L2;
                                                                                }
                                                                              } else {
                                                                                L9: {
                                                                                  if (param2 == 13) {
                                                                                    break L9;
                                                                                  } else {
                                                                                    if (param2 != 15) {
                                                                                      break L2;
                                                                                    } else {
                                                                                      break L9;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (!this.c((byte) -62)) {
                                                                                  break L2;
                                                                                } else {
                                                                                  this.b(28, param1 + -30656);
                                                                                  break L2;
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (param2 != 2) {
                                                                              break L2;
                                                                            } else {
                                                                              this.b(26, param1 + -30656);
                                                                              break L2;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (11 == param2) {
                                                                          this.b(24, -30659);
                                                                          break L2;
                                                                        } else {
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (param2 == 16) {
                                                                    this.b(29, -30659);
                                                                    break L2;
                                                                  } else {
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (param2 == 3) {
                                                                this.b(20, param1 + -30656);
                                                                break L2;
                                                              } else {
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (param2 != 2) {
                                                      break L2;
                                                    } else {
                                                      this.b(32, -30659);
                                                      break L2;
                                                    }
                                                  } else {
                                                    L10: {
                                                      if (param2 != 14) {
                                                        break L10;
                                                      } else {
                                                        if (((iu) this).field_s) {
                                                          this.b(31, -30659);
                                                          break L10;
                                                        } else {
                                                          this.b(13, param1 + -30656);
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    if (param2 != 2) {
                                                      break L2;
                                                    } else {
                                                      this.b(18, -30659);
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                            if (7 != param2) {
                                              break L2;
                                            } else {
                                              this.b(17, -30659);
                                              break L2;
                                            }
                                          } else {
                                            L11: {
                                              if (param2 == 14) {
                                                if (((iu) this).field_o) {
                                                  this.b(31, -30659);
                                                  break L11;
                                                } else {
                                                  this.b(16, param1 + -30656);
                                                  break L11;
                                                }
                                              } else {
                                                break L11;
                                              }
                                            }
                                            if (2 == param2) {
                                              this.b(15, -30659);
                                              break L2;
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (param2 != 2) {
                                    if (param2 != 14) {
                                      break L2;
                                    } else {
                                      this.b(12, param1 ^ 30656);
                                      break L2;
                                    }
                                  } else {
                                    this.b(11, -30659);
                                    break L2;
                                  }
                                }
                              } else {
                                if (param2 != 2) {
                                  if (14 == param2) {
                                    this.b(12, -30659);
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  this.b(30, -30659);
                                  break L2;
                                }
                              }
                            }
                          } else {
                            if (param2 == 6) {
                              this.b(8, -30659);
                              break L2;
                            } else {
                              if (param2 != 7) {
                                if (param2 != 9) {
                                  break L2;
                                } else {
                                  this.b(10, param1 + -30656);
                                  break L2;
                                }
                              } else {
                                this.b(9, param1 ^ 30656);
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (param2 != 4) {
                        break L2;
                      } else {
                        this.b(5, -30659);
                        break L2;
                      }
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
          var2 = 40;
          if (((iu) this).field_k == 33) {
            var2 = 0;
            break L0;
          } else {
            if (((iu) this).field_c) {
              var2 = ((iu) this).field_a;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (0 < ((iu) this).field_m) {
            ((iu) this).field_m = ((iu) this).field_m - 1;
            if (((iu) this).field_m != 0) {
              break L1;
            } else {
              ((iu) this).b(-1, -3, 1);
              break L1;
            }
          } else {
            break L1;
          }
        }
        L2: {
          var3 = 0 / ((-9 - param0) / 47);
          if (var2 < ((iu) this).field_j) {
            L3: {
              var4 = -var2 + ((iu) this).field_j;
              stackOut_11_0 = this;
              stackOut_11_1 = ((iu) this).field_j;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (var4 > 5) {
                stackOut_13_0 = this;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = 5;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                break L3;
              } else {
                stackOut_12_0 = this;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = var4;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                break L3;
              }
            }
            ((iu) this).field_j = stackIn_14_1 - stackIn_14_2;
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          if (var2 <= ((iu) this).field_j) {
            break L4;
          } else {
            L5: {
              var4 = -((iu) this).field_j + var2;
              stackOut_16_0 = this;
              stackOut_16_1 = ((iu) this).field_j;
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
                break L5;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = var4;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                break L5;
              }
            }
            ((iu) this).field_j = stackIn_19_1 + stackIn_19_2;
            break L4;
          }
        }
        L6: {
          if (((iu) this).field_g <= ((iu) this).field_f) {
            break L6;
          } else {
            L7: {
              var4 = ((iu) this).field_g - ((iu) this).field_f;
              stackOut_21_0 = this;
              stackOut_21_1 = ((iu) this).field_g;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              if (var4 > 5) {
                stackOut_23_0 = this;
                stackOut_23_1 = stackIn_23_1;
                stackOut_23_2 = 5;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                break L7;
              } else {
                stackOut_22_0 = this;
                stackOut_22_1 = stackIn_22_1;
                stackOut_22_2 = var4;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_24_2 = stackOut_22_2;
                break L7;
              }
            }
            ((iu) this).field_g = stackIn_24_1 - stackIn_24_2;
            break L6;
          }
        }
        L8: {
          if (((iu) this).field_f <= ((iu) this).field_g) {
            break L8;
          } else {
            L9: {
              var4 = ((iu) this).field_f + -((iu) this).field_g;
              stackOut_26_0 = this;
              stackOut_26_1 = ((iu) this).field_g;
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              if (var4 > 5) {
                stackOut_28_0 = this;
                stackOut_28_1 = stackIn_28_1;
                stackOut_28_2 = 5;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                stackIn_29_2 = stackOut_28_2;
                break L9;
              } else {
                stackOut_27_0 = this;
                stackOut_27_1 = stackIn_27_1;
                stackOut_27_2 = var4;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_29_2 = stackOut_27_2;
                break L9;
              }
            }
            ((iu) this).field_g = stackIn_29_1 + stackIn_29_2;
            break L8;
          }
        }
    }

    private final void b(byte param0) {
        if (param0 <= 72) {
            return;
        }
        ((iu) this).field_q.field_jc = true;
    }

    private final void g(int param0) {
        int var2 = 103;
        uh.a(sb.field_g, 125);
    }

    private final void g(byte param0) {
        int var2 = 0;
        ((iu) this).field_q.field_Ab = true;
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((iu) this).field_c = true;
          ((iu) this).field_k = param0;
          ((iu) this).d((byte) 37);
          if (param1 == -30659) {
            break L0;
          } else {
            ((iu) this).field_g = -114;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = ((iu) this).field_k;
            if (var3 != 0) {
              if (var3 != 1) {
                if (2 != var3) {
                  if (var3 != 3) {
                    if (4 == var3) {
                      ((iu) this).field_e = ci.field_f[3];
                      ((iu) this).field_w = 1;
                      this.a((byte) -122);
                      break L2;
                    } else {
                      if (var3 != 5) {
                        if (var3 == 6) {
                          ((iu) this).field_w = 1;
                          ((iu) this).field_e = ci.field_f[5];
                          break L2;
                        } else {
                          if (7 != var3) {
                            if (8 != var3) {
                              if (var3 == 9) {
                                ((iu) this).field_o = true;
                                ((iu) this).field_w = 0;
                                ((iu) this).field_e = ci.field_f[7];
                                break L2;
                              } else {
                                if (var3 != 30) {
                                  if (var3 == 10) {
                                    this.b((byte) 113);
                                    ((iu) this).field_w = 1;
                                    ((iu) this).field_e = ci.field_f[9];
                                    break L2;
                                  } else {
                                    if (11 != var3) {
                                      if (12 == var3) {
                                        ((iu) this).field_w = 0;
                                        ((iu) this).field_e = ci.field_f[11];
                                        this.e(31);
                                        break L2;
                                      } else {
                                        if (13 != var3) {
                                          if (var3 != 14) {
                                            if (var3 == 15) {
                                              ((iu) this).field_e = ci.field_f[14];
                                              this.f((byte) -34);
                                              this.b((byte) 120);
                                              ((iu) this).field_w = 1;
                                              break L2;
                                            } else {
                                              if (var3 != 16) {
                                                if (17 == var3) {
                                                  ((iu) this).field_e = ci.field_f[7];
                                                  this.f((byte) -34);
                                                  ((iu) this).field_w = 0;
                                                  ((iu) this).field_o = true;
                                                  break L2;
                                                } else {
                                                  if (var3 != 18) {
                                                    if (var3 == 31) {
                                                      ((iu) this).field_e = ci.field_f[26];
                                                      ((iu) this).field_w = 0;
                                                      this.j((byte) -119);
                                                      break L2;
                                                    } else {
                                                      if (var3 == 32) {
                                                        ((iu) this).field_e = ci.field_f[27];
                                                        ((iu) this).field_w = 0;
                                                        this.k((byte) -120);
                                                        break L2;
                                                      } else {
                                                        if (var3 == 19) {
                                                          ((iu) this).field_w = 2;
                                                          ((iu) this).field_e = null;
                                                          this.c(param1 ^ -30659);
                                                          this.a(13, 17, 26);
                                                          break L2;
                                                        } else {
                                                          if (var3 != 20) {
                                                            if (var3 == 21) {
                                                              ((iu) this).field_e = ci.field_f[16];
                                                              ((iu) this).field_w = 1;
                                                              break L2;
                                                            } else {
                                                              if (var3 == 22) {
                                                                ((iu) this).field_e = ci.field_f[17];
                                                                ((iu) this).field_w = 1;
                                                                break L2;
                                                              } else {
                                                                if (var3 == 23) {
                                                                  ((iu) this).field_e = ci.field_f[18];
                                                                  ((iu) this).field_w = 1;
                                                                  break L2;
                                                                } else {
                                                                  if (var3 != 24) {
                                                                    if (var3 == 25) {
                                                                      ((iu) this).field_e = ci.field_f[20];
                                                                      ((iu) this).field_w = 0;
                                                                      this.g((byte) 59);
                                                                      break L2;
                                                                    } else {
                                                                      if (26 == var3) {
                                                                        ((iu) this).field_w = 0;
                                                                        ((iu) this).field_e = ci.field_f[21];
                                                                        this.e((byte) 115);
                                                                        break L2;
                                                                      } else {
                                                                        if (var3 != 27) {
                                                                          if (var3 == 28) {
                                                                            ((iu) this).field_e = ci.field_f[23];
                                                                            ((iu) this).field_w = 3;
                                                                            this.i((byte) 44);
                                                                            break L2;
                                                                          } else {
                                                                            if (var3 == 29) {
                                                                              ((iu) this).field_w = 1;
                                                                              ((iu) this).field_e = ci.field_f[24];
                                                                              break L2;
                                                                            } else {
                                                                              if (var3 == 34) {
                                                                                ((iu) this).field_e = vl.field_m[((iu) this).field_p];
                                                                                ((iu) this).field_w = 1;
                                                                                break L2;
                                                                              } else {
                                                                                ((iu) this).a(((iu) this).field_e, (byte) 112);
                                                                                break L1;
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          ((iu) this).field_e = ci.field_f[22];
                                                                          this.f((byte) -34);
                                                                          ((iu) this).field_w = 1;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    ((iu) this).field_e = ci.field_f[19];
                                                                    ((iu) this).field_w = 1;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            ((iu) this).field_w = 0;
                                                            ((iu) this).field_e = ci.field_f[15];
                                                            break L2;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    ((iu) this).field_e = ci.field_f[14];
                                                    this.f((byte) -34);
                                                    this.b((byte) 90);
                                                    ((iu) this).field_w = 1;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                ((iu) this).field_e = ci.field_f[13];
                                                ((iu) this).field_w = 1;
                                                this.a(5);
                                                break L2;
                                              }
                                            }
                                          } else {
                                            ((iu) this).field_e = ci.field_f[8];
                                            this.f((byte) -34);
                                            ((iu) this).field_s = true;
                                            ((iu) this).field_w = 0;
                                            break L2;
                                          }
                                        } else {
                                          ((iu) this).field_w = 1;
                                          ((iu) this).field_e = ci.field_f[12];
                                          this.g(26);
                                          break L2;
                                        }
                                      }
                                    } else {
                                      this.b((byte) 111);
                                      ((iu) this).field_w = 1;
                                      ((iu) this).field_e = ci.field_f[10];
                                      break L2;
                                    }
                                  }
                                } else {
                                  ((iu) this).field_w = 0;
                                  ((iu) this).field_e = ci.field_f[25];
                                  break L2;
                                }
                              }
                            } else {
                              ((iu) this).field_w = 0;
                              ((iu) this).field_e = ci.field_f[8];
                              ((iu) this).field_s = true;
                              break L2;
                            }
                          } else {
                            ((iu) this).field_w = 1;
                            ((iu) this).field_e = ci.field_f[6];
                            break L2;
                          }
                        }
                      } else {
                        ((iu) this).field_e = ci.field_f[4];
                        ((iu) this).field_w = 0;
                        this.f((byte) -34);
                        break L2;
                      }
                    }
                  } else {
                    this.d(-4);
                    ((iu) this).field_e = ci.field_f[2];
                    ((iu) this).field_w = 0;
                    break L2;
                  }
                } else {
                  ((iu) this).field_e = null;
                  this.a(3, 4, param1 + 30685);
                  ((iu) this).field_w = 2;
                  break L2;
                }
              } else {
                ((iu) this).field_e = ci.field_f[1];
                ((iu) this).field_w = 0;
                break L2;
              }
            } else {
              ((iu) this).field_w = 2;
              ((iu) this).field_m = 150;
              ((iu) this).field_e = ci.field_f[0];
              break L2;
            }
          }
          ((iu) this).a(((iu) this).field_e, (byte) 112);
          break L1;
        }
    }

    private final void a(int param0) {
        uh.a(m.field_a, 124);
    }

    private final void c(int param0) {
        ((iu) this).field_q.field_xb.field_Eb[9 - -(((iu) this).field_q.field_xb.field_v * 12)].field_h = 10;
        nk.a((byte) 106);
        ((iu) this).field_q.field_xb.field_l.a((byte) -119, (tc) (Object) new mb(0, 9, 12, -4, 1));
        ((iu) this).field_q.field_xb.field_l.a((byte) -119, (tc) (Object) new mb(0, 15, 13, param0, 1));
        ((iu) this).field_q.field_xb.field_l.a((byte) -119, (tc) (Object) new mb(5, 16, 17, 0, 1));
        ((iu) this).field_v = true;
    }

    private final void a(byte param0) {
        if (param0 != -122) {
            this.f((byte) 104);
        }
        uh.a(f.field_D, 125);
    }

    final void h(byte param0) {
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
        int stackIn_19_0 = 0;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
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
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 21) {
            break L0;
          } else {
            ((iu) this).field_a = -21;
            break L0;
          }
        }
        L1: {
          if (((iu) this).field_k == 0) {
            ol.field_y.g(db.a(true, 320) + -(ol.field_y.field_y >> 1), u.a(100, (byte) 94));
            fe.b(((iu) this).field_e, db.a(true, 320), u.a(130, (byte) 94));
            fe.c(((iu) this).field_e, db.a(true, 320), u.a(130, (byte) 94), nd.field_b, false);
            ((iu) this).field_j = 40;
            break L1;
          } else {
            break L1;
          }
        }
        if (0 == ((iu) this).field_j) {
          return;
        } else {
          L2: {
            var2 = so.field_b.field_a;
            var3 = so.field_b.field_g;
            qn.f(-10 + var2 + -((iu) this).field_g, -((iu) this).field_j + var3 + -10, -10 + var2, var3);
            fe.b(-10 + (-((iu) this).field_g + var2), -10 + -((iu) this).field_j + var3, ((iu) this).field_g, ((iu) this).field_j, io.field_m, nd.field_b, 0, 192);
            if (4 == ((iu) this).field_w) {
              fe.a(-5 + -((iu) this).field_g + var2, -45 + var3, -10 + ((iu) this).field_g, 30, il.field_s, jh.field_k, 0, 192, true);
              break L2;
            } else {
              L3: {
                L4: {
                  stackOut_9_0 = -5 + var2 + -((iu) this).field_g;
                  stackOut_9_1 = -45 + var3;
                  stackOut_9_2 = ((iu) this).field_g - 10;
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
                  if (((iu) this).field_w == 2) {
                    break L4;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = stackIn_10_2;
                    stackOut_10_3 = stackIn_10_3;
                    stackOut_10_4 = (wk[]) (Object) stackIn_10_4;
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
                    if (!wg.a(param0 + -54, -5 + -((iu) this).field_g + var2, var2 - 15, -45 + var3, var3 + -15)) {
                      break L4;
                    } else {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = stackIn_11_2;
                      stackOut_11_3 = stackIn_11_3;
                      stackOut_11_4 = (wk[]) (Object) stackIn_11_4;
                      stackOut_11_5 = ci.field_e;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_13_3 = stackOut_11_3;
                      stackIn_13_4 = stackOut_11_4;
                      stackIn_13_5 = stackOut_11_5;
                      break L3;
                    }
                  }
                }
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = stackIn_12_3;
                stackOut_12_4 = (wk[]) (Object) stackIn_12_4;
                stackOut_12_5 = nd.field_b;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                stackIn_13_4 = stackOut_12_4;
                stackIn_13_5 = stackOut_12_5;
                break L3;
              }
              fe.a(stackIn_13_0, stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_13_4, stackIn_13_5, 0, 192, true);
              if (((iu) this).field_w != 0) {
                if (-2 != ((iu) this).field_w) {
                  if (-3 != ((iu) this).field_w) {
                    if (-4 != ((iu) this).field_w) {
                      if (((iu) this).field_w == 5) {
                        fe.c(al.field_m, -120 + var2 + -10, var3 - 16, 0, true);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      fe.c(ac.field_u, -10 + var2 - 120, -16 + var3, 0, true);
                      break L2;
                    }
                  } else {
                    fe.c(bc.field_f, -120 + var2 + -10, -16 + var3, 0, true);
                    break L2;
                  }
                } else {
                  L5: {
                    if (-35 != ((iu) this).field_k) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L5;
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L5;
                    }
                  }
                  var4 = stackIn_19_0;
                  if (((iu) this).field_c) {
                    L6: {
                      if (var4 == 0) {
                        stackOut_26_0 = jk.field_a;
                        stackIn_27_0 = stackOut_26_0;
                        break L6;
                      } else {
                        stackOut_25_0 = kj.field_t;
                        stackIn_27_0 = stackOut_25_0;
                        break L6;
                      }
                    }
                    fe.c(stackIn_27_0, -10 + (var2 - ((iu) this).field_g / 2), var3 - 16, 0, true);
                    break L2;
                  } else {
                    L7: {
                      if (var4 != 0) {
                        stackOut_22_0 = vg.field_k;
                        stackIn_23_0 = stackOut_22_0;
                        break L7;
                      } else {
                        stackOut_21_0 = pl.field_z;
                        stackIn_23_0 = stackOut_21_0;
                        break L7;
                      }
                    }
                    fe.c(stackIn_23_0, var2 + -(((iu) this).field_g / 2) - 10, var3 + -16, 0, true);
                    break L2;
                  }
                }
              } else {
                fe.c(qf.field_c, -10 + (-120 + var2), -16 + var3, 0, true);
                break L2;
              }
            }
          }
          L8: {
            if (((iu) this).field_e != null) {
              qn.f(var2 - ((iu) this).field_g, -((iu) this).field_j + var3, var2 - 10, var3 - 45);
              int discarded$1 = rs.field_n.a(((iu) this).field_e, -((iu) this).field_g + var2, -((iu) this).field_j + var3, 220, 400, 16777215, -1, 0, 0, 0);
              break L8;
            } else {
              break L8;
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
        ((iu) this).field_q.c(25, param0, param1);
    }

    final void d(byte param0) {
        ((iu) this).field_q.field_fc = false;
        ((iu) this).field_q.field_Mb = false;
        ((iu) this).field_q.field_Ab = false;
        ((iu) this).field_q.field_ac = false;
        if (param0 != 37) {
            field_i = null;
        }
    }

    private final void a(int param0, int param1) {
        ((iu) this).field_p = param0;
        this.b(34, -30659);
    }

    private final void e(byte param0) {
        uh.a(pl.field_s, -91);
    }

    private final void i(byte param0) {
        rt.d((byte) 113);
        int var2 = 15;
        ((iu) this).field_q.a(0, (byte) 30, 255);
    }

    final void a(boolean param0) {
        int var3 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
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
          if (((iu) this).field_w == 0) {
            ((iu) this).b(-1, -3, 2);
            break L1;
          } else {
            if (1 == ((iu) this).field_w) {
              L2: {
                stackOut_9_0 = this;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (((iu) this).field_c) {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L2;
                } else {
                  stackOut_10_0 = this;
                  stackOut_10_1 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L2;
                }
              }
              ((iu) this).field_c = stackIn_12_1 != 0;
              stackOut_12_0 = this;
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (!((iu) this).field_c) {
                L3: {
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (((iu) this).field_k != 34) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 240;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L3;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 100;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L3;
                  }
                }
                ((iu) this).field_f = stackIn_17_1;
                break L1;
              } else {
                ((iu) this).field_f = 240;
                break L1;
              }
            } else {
              if (((iu) this).field_w != 3) {
                if (((iu) this).field_w == 5) {
                  ((iu) this).field_k = 33;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ((iu) this).field_q.d(114, true);
                break L1;
              }
            }
          }
        }
    }

    private final void j(byte param0) {
        if (param0 > -95) {
            ((iu) this).field_p = 95;
        }
        ((iu) this).field_q.field_fc = true;
    }

    private final void d(int param0) {
        ((iu) this).field_q.field_xb.field_l.a((byte) -119, (tc) (Object) new mb(0, 3, 4, 5, 0, true));
        int var2 = 0;
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var3 = ((iu) this).field_q.field_xb.field_Eb[param0].field_h;
        var4 = var3;
        if (var4 != 7) {
          if (var4 != 8) {
            if (9 != var4) {
              return 9;
            } else {
              return 8;
            }
          } else {
            return 7;
          }
        } else {
          return 6;
        }
    }

    private final void k(byte param0) {
        ((iu) this).field_q.field_Mb = true;
    }

    private final void f(byte param0) {
        si.b(13829);
        if (param0 != -34) {
            ((iu) this).field_s = false;
        }
    }

    final static int a(int param0, String param1, int param2, ka param3, String[] param4) {
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
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.a(param1);
              if (param0 < var5_int) {
                break L1;
              } else {
                if (param1.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param4[0] = (String) (Object) param4;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
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
              if (var8 <= var9) {
                L4: {
                  if (var8 > var7) {
                    int incrementValue$2 = var6;
                    var6++;
                    param4[incrementValue$2] = param1.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_20_0 = var6;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param1.charAt(var9);
                    if (var10 == 32) {
                      break L6;
                    } else {
                      if (45 == var10) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param1.substring(var7, var9 + 1).trim();
                  var12 = param3.a(var11);
                  if (var12 < param0) {
                    break L5;
                  } else {
                    int incrementValue$3 = var6;
                    var6++;
                    param4[incrementValue$3] = var11;
                    var7 = 1 + var9;
                    break L5;
                  }
                }
                L7: {
                  if (var10 != 62) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("iu.MA(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
        return stackIn_21_0;
    }

    private final void e(int param0) {
        ((iu) this).field_q.field_ac = true;
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
        ((iu) this).field_g = 240;
        ((iu) this).field_w = 0;
        ((iu) this).field_m = 0;
        ((iu) this).field_k = 0;
        ((iu) this).field_j = 40;
        try {
            ((iu) this).field_a = 40;
            ((iu) this).field_q = param0;
            this.a(param1, 13567);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "iu.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    iu(ic param0) {
        ((iu) this).field_g = 240;
        ((iu) this).field_w = 0;
        ((iu) this).field_m = 0;
        ((iu) this).field_k = 0;
        ((iu) this).field_j = 40;
        try {
            ((iu) this).field_a = 40;
            ((iu) this).field_q = param0;
            ((iu) this).field_s = false;
            ((iu) this).field_v = false;
            ((iu) this).field_o = false;
            this.b(0, -30659);
            ((iu) this).field_q.field_xb.field_Eb[pl.field_s[0]].field_a = 1;
            ((iu) this).field_q.field_xb.field_f = true;
            ((iu) this).field_q.field_xb.field_z[1][1] = 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "iu.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
