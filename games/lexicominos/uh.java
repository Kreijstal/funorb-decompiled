/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh extends lk {
    hl field_s;
    int field_u;
    private ih field_t;
    private int field_w;
    hl field_A;
    private int[] field_r;
    private ih field_m;
    private int field_x;
    private ih field_B;
    private int[] field_y;
    private hl field_z;
    static java.util.zip.CRC32 field_v;
    private boolean field_o;
    private int field_q;
    private boolean field_p;
    static dg field_l;
    static int field_D;
    static uh field_n;
    static int[] field_C;

    final synchronized void a(byte param0, int param1, ih param2, int param3) {
        try {
            int discarded$0 = 91;
            this.a(256, param3, false, param2, param1);
            int var5_int = 83 / ((param0 - -55) / 51);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "uh.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    private final void a(hl param0, byte param1, hl param2) {
        try {
            ((uh) this).field_A = param0;
            ((uh) this).field_w = 1048576;
            ((uh) this).field_s = param2;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "uh.J(" + (param0 != null ? "{...}" : "null") + 44 + -72 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, int param1, int param2, hl param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              param3.a(-1, param2, false);
              if (param0 > -88) {
                ((uh) this).field_o = true;
                param3.b(-180, param1);
                break L1;
              } else {
                param3.b(-180, param1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("uh.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final static void a(sj param0, byte param1, int param2) {
        th var3 = null;
        if (param1 > -91) {
            return;
        }
        try {
            var3 = ed.field_q;
            var3.h(param2, 0);
            var3.c(5, -1);
            var3.c(0, -1);
            var3.e(91, param0.field_h);
            var3.c(param0.field_o, -1);
            var3.c(param0.field_m, -1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "uh.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (0 < ((uh) this).field_w) {
          L0: {
            if (((uh) this).field_B != null) {
              ((uh) this).field_A.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (1048576 > ((uh) this).field_w) {
            L1: {
              if (((uh) this).field_t == null) {
                break L1;
              } else {
                ((uh) this).field_s.a(param0);
                break L1;
              }
            }
            L2: {
              if (((uh) this).field_q <= 0) {
                break L2;
              } else {
                if (((uh) this).field_m != null) {
                  ((uh) this).field_z.a(param0);
                  break L2;
                } else {
                  L3: {
                    if (((uh) this).field_p) {
                      L4: {
                        if (((uh) this).field_x <= 0) {
                          break L4;
                        } else {
                          if (((uh) this).field_A.a((byte) -32)) {
                            break L4;
                          } else {
                            ((uh) this).field_x = -((uh) this).field_x;
                            ((uh) this).field_B = null;
                            ((uh) this).field_p = false;
                            break L3;
                          }
                        }
                      }
                      if (((uh) this).field_x >= 0) {
                        break L3;
                      } else {
                        if (!((uh) this).field_s.a((byte) -32)) {
                          ((uh) this).field_t = null;
                          ((uh) this).field_x = -((uh) this).field_x;
                          ((uh) this).field_p = false;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  if (((uh) this).field_x != 0) {
                    ((uh) this).field_w = ((uh) this).field_w + param0 * ((uh) this).field_x;
                    if (((uh) this).field_w < 1048576) {
                      if (0 >= ((uh) this).field_w) {
                        ((uh) this).field_w = 0;
                        if (!((uh) this).field_p) {
                          L5: {
                            ((uh) this).field_x = 0;
                            if (((uh) this).field_o) {
                              break L5;
                            } else {
                              if (null == ((uh) this).field_B) {
                                ((uh) this).field_B = null;
                                break L5;
                              } else {
                                ((uh) this).field_A.d(false);
                                ((uh) this).field_B = null;
                                return;
                              }
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ((uh) this).field_w = 1048576;
                      if (!((uh) this).field_p) {
                        ((uh) this).field_x = 0;
                        if (!((uh) this).field_o) {
                          if (((uh) this).field_t == null) {
                            ((uh) this).field_t = null;
                            return;
                          } else {
                            ((uh) this).field_s.d(false);
                            ((uh) this).field_t = null;
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
            if (((uh) this).field_p) {
              L6: {
                if (((uh) this).field_x <= 0) {
                  break L6;
                } else {
                  if (((uh) this).field_A.a((byte) -32)) {
                    break L6;
                  } else {
                    ((uh) this).field_x = -((uh) this).field_x;
                    ((uh) this).field_B = null;
                    ((uh) this).field_p = false;
                    if (((uh) this).field_x != 0) {
                      L7: {
                        ((uh) this).field_w = ((uh) this).field_w + param0 * ((uh) this).field_x;
                        if (((uh) this).field_w < 1048576) {
                          if (0 < ((uh) this).field_w) {
                            break L7;
                          } else {
                            ((uh) this).field_w = 0;
                            if (!((uh) this).field_p) {
                              ((uh) this).field_x = 0;
                              if (((uh) this).field_o) {
                                break L7;
                              } else {
                                if (null == ((uh) this).field_B) {
                                  ((uh) this).field_B = null;
                                  break L7;
                                } else {
                                  ((uh) this).field_A.d(false);
                                  ((uh) this).field_B = null;
                                  return;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        } else {
                          ((uh) this).field_w = 1048576;
                          if (((uh) this).field_p) {
                            break L7;
                          } else {
                            ((uh) this).field_x = 0;
                            if (!((uh) this).field_o) {
                              if (((uh) this).field_t == null) {
                                ((uh) this).field_t = null;
                                return;
                              } else {
                                ((uh) this).field_s.d(false);
                                ((uh) this).field_t = null;
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              L8: {
                if (((uh) this).field_x >= 0) {
                  break L8;
                } else {
                  if (!((uh) this).field_s.a((byte) -32)) {
                    ((uh) this).field_t = null;
                    ((uh) this).field_x = -((uh) this).field_x;
                    ((uh) this).field_p = false;
                    break L8;
                  } else {
                    if (((uh) this).field_x != 0) {
                      L9: {
                        ((uh) this).field_w = ((uh) this).field_w + param0 * ((uh) this).field_x;
                        if (((uh) this).field_w < 1048576) {
                          if (0 < ((uh) this).field_w) {
                            break L9;
                          } else {
                            ((uh) this).field_w = 0;
                            if (!((uh) this).field_p) {
                              ((uh) this).field_x = 0;
                              if (((uh) this).field_o) {
                                break L9;
                              } else {
                                if (null == ((uh) this).field_B) {
                                  ((uh) this).field_B = null;
                                  break L9;
                                } else {
                                  ((uh) this).field_A.d(false);
                                  ((uh) this).field_B = null;
                                  return;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        } else {
                          ((uh) this).field_w = 1048576;
                          if (((uh) this).field_p) {
                            break L9;
                          } else {
                            ((uh) this).field_x = 0;
                            if (!((uh) this).field_o) {
                              if (((uh) this).field_t == null) {
                                ((uh) this).field_t = null;
                                return;
                              } else {
                                ((uh) this).field_s.d(false);
                                ((uh) this).field_t = null;
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (((uh) this).field_x != 0) {
                L10: {
                  ((uh) this).field_w = ((uh) this).field_w + param0 * ((uh) this).field_x;
                  if (((uh) this).field_w < 1048576) {
                    if (0 < ((uh) this).field_w) {
                      break L10;
                    } else {
                      ((uh) this).field_w = 0;
                      if (!((uh) this).field_p) {
                        ((uh) this).field_x = 0;
                        if (((uh) this).field_o) {
                          break L10;
                        } else {
                          if (null == ((uh) this).field_B) {
                            ((uh) this).field_B = null;
                            break L10;
                          } else {
                            ((uh) this).field_A.d(false);
                            ((uh) this).field_B = null;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    ((uh) this).field_w = 1048576;
                    if (((uh) this).field_p) {
                      break L10;
                    } else {
                      ((uh) this).field_x = 0;
                      if (!((uh) this).field_o) {
                        if (((uh) this).field_t == null) {
                          ((uh) this).field_t = null;
                          return;
                        } else {
                          ((uh) this).field_s.d(false);
                          ((uh) this).field_t = null;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              if (((uh) this).field_x != 0) {
                L11: {
                  ((uh) this).field_w = ((uh) this).field_w + param0 * ((uh) this).field_x;
                  if (((uh) this).field_w < 1048576) {
                    if (0 < ((uh) this).field_w) {
                      break L11;
                    } else {
                      ((uh) this).field_w = 0;
                      if (!((uh) this).field_p) {
                        ((uh) this).field_x = 0;
                        if (((uh) this).field_o) {
                          break L11;
                        } else {
                          if (null == ((uh) this).field_B) {
                            ((uh) this).field_B = null;
                            break L11;
                          } else {
                            ((uh) this).field_A.d(false);
                            ((uh) this).field_B = null;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    ((uh) this).field_w = 1048576;
                    if (((uh) this).field_p) {
                      break L11;
                    } else {
                      ((uh) this).field_x = 0;
                      if (!((uh) this).field_o) {
                        if (((uh) this).field_t == null) {
                          ((uh) this).field_t = null;
                          return;
                        } else {
                          ((uh) this).field_s.d(false);
                          ((uh) this).field_t = null;
                          return;
                        }
                      } else {
                        return;
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
            L12: {
              if (((uh) this).field_q <= 0) {
                break L12;
              } else {
                if (((uh) this).field_m != null) {
                  ((uh) this).field_z.a(param0);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if (((uh) this).field_p) {
                L14: {
                  if (((uh) this).field_x <= 0) {
                    break L14;
                  } else {
                    if (((uh) this).field_A.a((byte) -32)) {
                      break L14;
                    } else {
                      ((uh) this).field_x = -((uh) this).field_x;
                      ((uh) this).field_B = null;
                      ((uh) this).field_p = false;
                      break L13;
                    }
                  }
                }
                if (((uh) this).field_x >= 0) {
                  break L13;
                } else {
                  if (!((uh) this).field_s.a((byte) -32)) {
                    ((uh) this).field_t = null;
                    ((uh) this).field_x = -((uh) this).field_x;
                    ((uh) this).field_p = false;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              } else {
                break L13;
              }
            }
            if (((uh) this).field_x != 0) {
              L15: {
                ((uh) this).field_w = ((uh) this).field_w + param0 * ((uh) this).field_x;
                if (((uh) this).field_w < 1048576) {
                  if (0 < ((uh) this).field_w) {
                    break L15;
                  } else {
                    ((uh) this).field_w = 0;
                    if (!((uh) this).field_p) {
                      ((uh) this).field_x = 0;
                      if (((uh) this).field_o) {
                        break L15;
                      } else {
                        if (null == ((uh) this).field_B) {
                          ((uh) this).field_B = null;
                          break L15;
                        } else {
                          ((uh) this).field_A.d(false);
                          ((uh) this).field_B = null;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  ((uh) this).field_w = 1048576;
                  if (((uh) this).field_p) {
                    break L15;
                  } else {
                    ((uh) this).field_x = 0;
                    if (!((uh) this).field_o) {
                      if (((uh) this).field_t == null) {
                        ((uh) this).field_t = null;
                        return;
                      } else {
                        ((uh) this).field_s.d(false);
                        ((uh) this).field_t = null;
                        return;
                      }
                    } else {
                      return;
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
          L16: {
            if (1048576 <= ((uh) this).field_w) {
              break L16;
            } else {
              if (((uh) this).field_t == null) {
                break L16;
              } else {
                ((uh) this).field_s.a(param0);
                break L16;
              }
            }
          }
          L17: {
            if (((uh) this).field_q <= 0) {
              break L17;
            } else {
              if (((uh) this).field_m != null) {
                ((uh) this).field_z.a(param0);
                break L17;
              } else {
                break L17;
              }
            }
          }
          L18: {
            if (((uh) this).field_p) {
              L19: {
                if (((uh) this).field_x <= 0) {
                  break L19;
                } else {
                  if (((uh) this).field_A.a((byte) -32)) {
                    break L19;
                  } else {
                    ((uh) this).field_x = -((uh) this).field_x;
                    ((uh) this).field_B = null;
                    ((uh) this).field_p = false;
                    break L18;
                  }
                }
              }
              if (((uh) this).field_x >= 0) {
                break L18;
              } else {
                if (!((uh) this).field_s.a((byte) -32)) {
                  ((uh) this).field_t = null;
                  ((uh) this).field_x = -((uh) this).field_x;
                  ((uh) this).field_p = false;
                  break L18;
                } else {
                  break L18;
                }
              }
            } else {
              break L18;
            }
          }
          if (((uh) this).field_x != 0) {
            L20: {
              ((uh) this).field_w = ((uh) this).field_w + param0 * ((uh) this).field_x;
              if (((uh) this).field_w < 1048576) {
                if (0 < ((uh) this).field_w) {
                  break L20;
                } else {
                  ((uh) this).field_w = 0;
                  if (!((uh) this).field_p) {
                    ((uh) this).field_x = 0;
                    if (((uh) this).field_o) {
                      break L20;
                    } else {
                      if (null == ((uh) this).field_B) {
                        ((uh) this).field_B = null;
                        break L20;
                      } else {
                        ((uh) this).field_A.d(false);
                        ((uh) this).field_B = null;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                ((uh) this).field_w = 1048576;
                if (((uh) this).field_p) {
                  break L20;
                } else {
                  ((uh) this).field_x = 0;
                  if (!((uh) this).field_o) {
                    if (((uh) this).field_t == null) {
                      ((uh) this).field_t = null;
                      return;
                    } else {
                      ((uh) this).field_s.d(false);
                      ((uh) this).field_t = null;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final synchronized void a(int param0, int param1, boolean param2, ih param3, int param4) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((uh) this).field_p) {
                break L1;
              } else {
                break L1;
              }
            }
            ((uh) this).field_p = false;
            if (((uh) this).field_B != param3) {
              if (((uh) this).field_t != param3) {
                L2: {
                  if (null == ((uh) this).field_B) {
                    var7_int = 1;
                    break L2;
                  } else {
                    if (null != ((uh) this).field_t) {
                      L3: {
                        if (524288 <= ((uh) this).field_w) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L3;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L3;
                        }
                      }
                      var7_int = stackIn_16_0;
                      break L2;
                    } else {
                      var7_int = 0;
                      break L2;
                    }
                  }
                }
                if (var7_int == 0) {
                  L4: {
                    if (((uh) this).field_t == null) {
                      break L4;
                    } else {
                      ((uh) this).field_s.d(false);
                      break L4;
                    }
                  }
                  L5: {
                    ((uh) this).field_t = param3;
                    if (param3 == null) {
                      break L5;
                    } else {
                      ((uh) this).field_s.a(46, true, param3);
                      this.a(-116, param4, 256, ((uh) this).field_s);
                      break L5;
                    }
                  }
                  ((uh) this).field_x = -param1;
                  break L0;
                } else {
                  L6: {
                    if (null != ((uh) this).field_B) {
                      ((uh) this).field_A.d(false);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    ((uh) this).field_B = param3;
                    if (param3 == null) {
                      break L7;
                    } else {
                      ((uh) this).field_A.a(27, true, param3);
                      this.a(-124, param4, 256, ((uh) this).field_A);
                      break L7;
                    }
                  }
                  ((uh) this).field_x = param1;
                  return;
                }
              } else {
                ((uh) this).field_x = -param1;
                this.a(-92, param4, 256, ((uh) this).field_s);
                return;
              }
            } else {
              ((uh) this).field_x = param1;
              this.a(-89, param4, 256, ((uh) this).field_A);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var7;
            stackOut_32_1 = new StringBuilder().append("uh.G(").append(256).append(44).append(param1).append(44).append(0).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L8;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param4 + 44 + 91 + 41);
        }
    }

    final lk b() {
        return null;
    }

    public static void a(byte param0) {
        field_l = null;
        field_C = null;
        field_n = null;
        field_v = null;
    }

    final lk d() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 0) {
            lk discarded$0 = ((uh) this).b();
            ((uh) this).field_u = param1;
            return;
        }
        ((uh) this).field_u = param1;
    }

    final static db a(sh param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        db stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        db stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (nb.a(param1, param3, (byte) 127, param0)) {
              int discarded$2 = 27;
              stackOut_5_0 = eb.a();
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (db) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("uh.K(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + -108 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_31_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (((uh) this).field_u > 0) {
              L1: {
                if (!((uh) this).field_p) {
                  break L1;
                } else {
                  L2: {
                    if (0 >= ((uh) this).field_x) {
                      break L2;
                    } else {
                      if (((uh) this).field_A.a((byte) -32)) {
                        break L2;
                      } else {
                        ((uh) this).field_x = -((uh) this).field_x;
                        ((uh) this).field_p = false;
                        ((uh) this).field_B = null;
                        break L1;
                      }
                    }
                  }
                  if (((uh) this).field_x >= 0) {
                    break L1;
                  } else {
                    if (!((uh) this).field_s.a((byte) -32)) {
                      ((uh) this).field_p = false;
                      ((uh) this).field_t = null;
                      ((uh) this).field_x = -((uh) this).field_x;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (((uh) this).field_w >> 12) * ((uh) this).field_u / 256;
                var5 = -var4_int + ((uh) this).field_u;
                if (0 != ((uh) this).field_x) {
                  ((uh) this).field_w = ((uh) this).field_w + param2 * ((uh) this).field_x;
                  if (((uh) this).field_w >= 1048576) {
                    ((uh) this).field_w = 1048576;
                    if (((uh) this).field_p) {
                      break L3;
                    } else {
                      ((uh) this).field_x = 0;
                      if (!((uh) this).field_o) {
                        L4: {
                          if (null == ((uh) this).field_t) {
                            break L4;
                          } else {
                            ((uh) this).field_s.d(false);
                            break L4;
                          }
                        }
                        ((uh) this).field_t = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (0 < ((uh) this).field_w) {
                      break L3;
                    } else {
                      ((uh) this).field_w = 0;
                      if (!((uh) this).field_p) {
                        ((uh) this).field_x = 0;
                        if (((uh) this).field_o) {
                          break L3;
                        } else {
                          L5: {
                            if (((uh) this).field_B == null) {
                              break L5;
                            } else {
                              ((uh) this).field_A.d(false);
                              break L5;
                            }
                          }
                          ((uh) this).field_B = null;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (!b.field_j) {
                  stackOut_30_0 = param2;
                  stackIn_31_0 = stackOut_30_0;
                  break L6;
                } else {
                  stackOut_29_0 = param2 << 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_31_0;
                if (((uh) this).field_q < 256) {
                  L8: {
                    if (null != ((uh) this).field_B) {
                      break L8;
                    } else {
                      if (((uh) this).field_t != null) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (null == ((uh) this).field_y) {
                            break L10;
                          } else {
                            if (((uh) this).field_y.length < var6) {
                              break L10;
                            } else {
                              o.a(((uh) this).field_y, 0, var6);
                              o.a(((uh) this).field_r, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((uh) this).field_r = new int[var6];
                        ((uh) this).field_y = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((uh) this).field_A.b(((uh) this).field_y, 0, param2);
                        ((uh) this).field_s.b(((uh) this).field_r, 0, param2);
                        if (!b.field_j) {
                          stackOut_46_0 = param1;
                          stackIn_47_0 = stackOut_46_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_45_0 = param1 << 1;
                          stackIn_47_0 = stackOut_45_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_47_0;
                      var8 = 0;
                      L12: while (true) {
                        if (~var6 >= ~var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (((uh) this).field_r[var8] * var5 + var4_int * ((uh) this).field_y[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      ((uh) this).field_s.b(param0, param1, param2);
                      break L7;
                    }
                  } else {
                    ((uh) this).field_A.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (((uh) this).field_m == null) {
                  break L13;
                } else {
                  if (((uh) this).field_q == 0) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (((uh) this).field_y == null) {
                          break L15;
                        } else {
                          if (((uh) this).field_y.length < var6) {
                            break L15;
                          } else {
                            o.a(((uh) this).field_y, 0, var6);
                            break L14;
                          }
                        }
                      }
                      ((uh) this).field_r = new int[var6];
                      ((uh) this).field_y = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                      if (b.field_j) {
                        param1 = param1 << 1;
                        stackOut_58_0 = param1 << 1;
                        stackIn_59_0 = stackOut_58_0;
                        break L16;
                      } else {
                        stackOut_57_0 = param1;
                        stackIn_59_0 = stackOut_57_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_59_0;
                    var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                    var9 = ((uh) this).field_u + -var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              ((uh) this).a(param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var4;
            stackOut_63_1 = new StringBuilder().append("uh.I(");
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L18;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L18;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_66_0, stackIn_66_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public uh() {
        ((uh) this).field_u = 256;
        ((uh) this).field_q = 0;
        ((uh) this).field_o = false;
        hl var1 = new hl();
        this.a(var1, (byte) -72, new hl(var1));
    }

    final synchronized int a() {
        return 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new java.util.zip.CRC32();
        field_l = new dg();
        field_C = new int[4];
    }
}
