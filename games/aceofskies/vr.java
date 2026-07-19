/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vr {
    private int field_a;
    private int field_f;
    static Random field_h;
    private qe field_e;
    static ce field_b;
    private wl field_g;
    private hh[] field_d;
    private int field_i;
    static String[] field_c;

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        int var1 = 25 % ((param0 - 55) / 40);
        field_b = null;
    }

    final boolean a(byte param0, int param1) {
        if (param0 != -118) {
            return false;
        }
        return this.field_d[param1].a((byte) -124);
    }

    final static boolean a(String param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() < jm.field_d) {
                  break L1;
                } else {
                  if (param0.length() > dc.field_f) {
                    break L1;
                  } else {
                    if (param1 == 2) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3 = (String) null;
                      discarded$2 = vr.a((String) null, 81);
                      return false;
                    }
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("vr.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        param4 = param4 & this.field_g.c((byte) 16);
        if (param2 != 2147483647) {
          L0: {
            this.field_d = (hh[]) null;
            if (param4) {
              break L0;
            } else {
              if (param0 != 4) {
                L1: {
                  if (8 == param0) {
                    break L1;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      break L1;
                    } else {
                      L2: {
                        if (-1 == (param0 ^ -1)) {
                          break L2;
                        } else {
                          if (param1) {
                            param0 = param0 | -2147483648;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (param0 != this.field_i) {
                        if (0 != this.field_i) {
                          L3: {
                            this.field_d[2147483647 & this.field_i].b((byte) 105);
                            if (param0 != 0) {
                              this.field_d[2147483647 & param0].a(false, param1);
                              this.field_d[param0 & 2147483647].a(4096, param1);
                              this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          this.field_f = param3;
                          this.field_a = param5;
                          this.field_i = param0;
                          return;
                        } else {
                          L4: {
                            if (param0 != 0) {
                              this.field_d[2147483647 & param0].a(false, param1);
                              this.field_d[param0 & 2147483647].a(4096, param1);
                              this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.field_f = param3;
                          this.field_a = param5;
                          this.field_i = param0;
                          return;
                        }
                      } else {
                        L5: {
                          if (0 != this.field_i) {
                            L6: {
                              this.field_d[this.field_i & 2147483647].a(4096, param1);
                              if (this.field_a != param5) {
                                break L6;
                              } else {
                                if (param3 != this.field_f) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                            this.field_f = param3;
                            this.field_a = param5;
                            return;
                          } else {
                            break L5;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L7: {
                  if (param0 != 4) {
                    break L7;
                  } else {
                    param3 = param5;
                    break L7;
                  }
                }
                param0 = 2;
                break L0;
              } else {
                L8: {
                  if (param0 != 4) {
                    break L8;
                  } else {
                    param3 = param5;
                    break L8;
                  }
                }
                L9: {
                  param0 = 2;
                  if (-1 == (param0 ^ -1)) {
                    break L9;
                  } else {
                    if (param1) {
                      param0 = param0 | -2147483648;
                      break L9;
                    } else {
                      L10: {
                        if (param0 != this.field_i) {
                          L11: {
                            if (0 == this.field_i) {
                              break L11;
                            } else {
                              this.field_d[2147483647 & this.field_i].b((byte) 105);
                              break L11;
                            }
                          }
                          L12: {
                            if (param0 != 0) {
                              this.field_d[2147483647 & param0].a(false, param1);
                              this.field_d[param0 & 2147483647].a(4096, param1);
                              this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          this.field_f = param3;
                          this.field_a = param5;
                          this.field_i = param0;
                          break L10;
                        } else {
                          if (0 != this.field_i) {
                            L13: {
                              this.field_d[this.field_i & 2147483647].a(4096, param1);
                              if (this.field_a != param5) {
                                break L13;
                              } else {
                                if (param3 != this.field_f) {
                                  break L13;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                            this.field_f = param3;
                            this.field_a = param5;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (param0 != this.field_i) {
                  if (0 != this.field_i) {
                    L14: {
                      this.field_d[2147483647 & this.field_i].b((byte) 105);
                      if (param0 != 0) {
                        this.field_d[2147483647 & param0].a(false, param1);
                        this.field_d[param0 & 2147483647].a(4096, param1);
                        this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    this.field_f = param3;
                    this.field_a = param5;
                    this.field_i = param0;
                    return;
                  } else {
                    L15: {
                      if (param0 != 0) {
                        this.field_d[2147483647 & param0].a(false, param1);
                        this.field_d[param0 & 2147483647].a(4096, param1);
                        this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    this.field_f = param3;
                    this.field_a = param5;
                    this.field_i = param0;
                    return;
                  }
                } else {
                  if (0 != this.field_i) {
                    this.field_d[this.field_i & 2147483647].a(4096, param1);
                    if (this.field_a == param5) {
                      if (param3 == this.field_f) {
                        return;
                      } else {
                        this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                        this.field_f = param3;
                        this.field_a = param5;
                        return;
                      }
                    } else {
                      this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                      this.field_f = param3;
                      this.field_a = param5;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L16: {
            if (-1 == (param0 ^ -1)) {
              break L16;
            } else {
              if (param1) {
                param0 = param0 | -2147483648;
                break L16;
              } else {
                if (param0 != this.field_i) {
                  if (0 == this.field_i) {
                    L17: {
                      if (param0 != 0) {
                        this.field_d[2147483647 & param0].a(false, param1);
                        this.field_d[param0 & 2147483647].a(4096, param1);
                        this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    this.field_f = param3;
                    this.field_a = param5;
                    this.field_i = param0;
                    return;
                  } else {
                    L18: {
                      this.field_d[2147483647 & this.field_i].b((byte) 105);
                      if (param0 != 0) {
                        this.field_d[2147483647 & param0].a(false, param1);
                        this.field_d[param0 & 2147483647].a(4096, param1);
                        this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    this.field_f = param3;
                    this.field_a = param5;
                    this.field_i = param0;
                    return;
                  }
                } else {
                  if (0 != this.field_i) {
                    this.field_d[this.field_i & 2147483647].a(4096, param1);
                    if (this.field_a == param5) {
                      if (param3 != this.field_f) {
                        this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                        this.field_f = param3;
                        this.field_a = param5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                      this.field_f = param3;
                      this.field_a = param5;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (param0 != this.field_i) {
            if (0 == this.field_i) {
              L19: {
                if (param0 != 0) {
                  this.field_d[2147483647 & param0].a(false, param1);
                  this.field_d[param0 & 2147483647].a(4096, param1);
                  this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                  break L19;
                } else {
                  break L19;
                }
              }
              this.field_f = param3;
              this.field_a = param5;
              this.field_i = param0;
              return;
            } else {
              L20: {
                this.field_d[2147483647 & this.field_i].b((byte) 105);
                if (param0 != 0) {
                  this.field_d[2147483647 & param0].a(false, param1);
                  this.field_d[param0 & 2147483647].a(4096, param1);
                  this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                  break L20;
                } else {
                  break L20;
                }
              }
              this.field_f = param3;
              this.field_a = param5;
              this.field_i = param0;
              return;
            }
          } else {
            if (0 != this.field_i) {
              this.field_d[this.field_i & 2147483647].a(4096, param1);
              if (this.field_a == param5) {
                if (param3 == this.field_f) {
                  return;
                } else {
                  this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                  this.field_f = param3;
                  this.field_a = param5;
                  return;
                }
              } else {
                this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                this.field_f = param3;
                this.field_a = param5;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L21: {
            if (param4) {
              break L21;
            } else {
              L22: {
                if (param0 == 4) {
                  break L22;
                } else {
                  if (8 == param0) {
                    break L22;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      break L22;
                    } else {
                      L23: {
                        if (-1 == (param0 ^ -1)) {
                          break L23;
                        } else {
                          if (param1) {
                            param0 = param0 | -2147483648;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (param0 != this.field_i) {
                          L25: {
                            if (0 == this.field_i) {
                              break L25;
                            } else {
                              this.field_d[2147483647 & this.field_i].b((byte) 105);
                              break L25;
                            }
                          }
                          L26: {
                            if (param0 != 0) {
                              this.field_d[2147483647 & param0].a(false, param1);
                              this.field_d[param0 & 2147483647].a(4096, param1);
                              this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          this.field_f = param3;
                          this.field_a = param5;
                          this.field_i = param0;
                          break L24;
                        } else {
                          if (0 != this.field_i) {
                            L27: {
                              this.field_d[this.field_i & 2147483647].a(4096, param1);
                              if (this.field_a != param5) {
                                break L27;
                              } else {
                                if (param3 != this.field_f) {
                                  break L27;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                            this.field_f = param3;
                            this.field_a = param5;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L28: {
                if (param0 != 4) {
                  break L28;
                } else {
                  param3 = param5;
                  break L28;
                }
              }
              param0 = 2;
              break L21;
            }
          }
          L29: {
            if (-1 == (param0 ^ -1)) {
              break L29;
            } else {
              if (param1) {
                param0 = param0 | -2147483648;
                break L29;
              } else {
                L30: {
                  if (param0 != this.field_i) {
                    L31: {
                      if (0 == this.field_i) {
                        break L31;
                      } else {
                        this.field_d[2147483647 & this.field_i].b((byte) 105);
                        break L31;
                      }
                    }
                    L32: {
                      if (param0 != 0) {
                        this.field_d[2147483647 & param0].a(false, param1);
                        this.field_d[param0 & 2147483647].a(4096, param1);
                        this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    this.field_f = param3;
                    this.field_a = param5;
                    this.field_i = param0;
                    break L30;
                  } else {
                    if (0 != this.field_i) {
                      L33: {
                        this.field_d[this.field_i & 2147483647].a(4096, param1);
                        if (this.field_a != param5) {
                          break L33;
                        } else {
                          if (param3 != this.field_f) {
                            break L33;
                          } else {
                            break L30;
                          }
                        }
                      }
                      this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                      this.field_f = param3;
                      this.field_a = param5;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                }
                return;
              }
            }
          }
          if (param0 != this.field_i) {
            if (0 != this.field_i) {
              L34: {
                this.field_d[2147483647 & this.field_i].b((byte) 105);
                if (param0 != 0) {
                  this.field_d[2147483647 & param0].a(false, param1);
                  this.field_d[param0 & 2147483647].a(4096, param1);
                  this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                  break L34;
                } else {
                  break L34;
                }
              }
              this.field_f = param3;
              this.field_a = param5;
              this.field_i = param0;
              return;
            } else {
              L35: {
                if (param0 != 0) {
                  this.field_d[2147483647 & param0].a(false, param1);
                  this.field_d[param0 & 2147483647].a(4096, param1);
                  this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                  break L35;
                } else {
                  break L35;
                }
              }
              this.field_f = param3;
              this.field_a = param5;
              this.field_i = param0;
              return;
            }
          } else {
            if (0 != this.field_i) {
              this.field_d[this.field_i & 2147483647].a(4096, param1);
              if (this.field_a == param5) {
                if (param3 == this.field_f) {
                  return;
                } else {
                  this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                  this.field_f = param3;
                  this.field_a = param5;
                  return;
                }
              } else {
                this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                this.field_f = param3;
                this.field_a = param5;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean a(int param0, int param1, rt param2) {
        boolean discarded$2 = false;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
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
            if (0 == this.field_i) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == -1896) {
                  break L1;
                } else {
                  discarded$2 = this.a((byte) 95, -4);
                  break L1;
                }
              }
              this.field_d[this.field_i & 2147483647].a(param0, -1486691000, param2);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("vr.D(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    vr(wl param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        this.field_f = 0;
        this.field_a = 0;
        this.field_i = 0;
        try {
          L0: {
            L1: {
              this.field_g = param0;
              this.field_e = new qe(param0);
              this.field_d = new hh[10];
              this.field_d[1] = (hh) ((Object) new wk(param0));
              this.field_d[2] = (hh) ((Object) new bk(param0, this.field_e));
              this.field_d[4] = (hh) ((Object) new ij(param0, this.field_e));
              this.field_d[5] = (hh) ((Object) new rc(param0, this.field_e));
              this.field_d[6] = (hh) ((Object) new np(param0));
              this.field_d[7] = (hh) ((Object) new ne(param0));
              this.field_d[3] = (hh) ((Object) new g(param0));
              this.field_d[8] = (hh) ((Object) new sd(param0, this.field_e));
              this.field_d[9] = (hh) ((Object) new ci(param0, this.field_e));
              if (this.field_d[8].a((byte) -76)) {
                break L1;
              } else {
                this.field_d[8] = this.field_d[4];
                break L1;
              }
            }
            L2: {
              if (this.field_d[9].a((byte) -128)) {
                break L2;
              } else {
                this.field_d[9] = this.field_d[8];
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("vr.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_h = new Random();
        field_c = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
