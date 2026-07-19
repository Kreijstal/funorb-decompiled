/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hh extends mg {
    static java.awt.Frame field_G;
    private int field_K;
    static int field_I;
    private int field_J;
    private int field_C;
    static da field_M;
    private boolean field_F;
    static sj field_N;
    static sh field_L;
    private int field_E;
    private boolean field_D;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!this.a(param3 ^ -8891, param2, param1, param0)) {
                break L1;
              } else {
                this.a(param2, 0, param0, param1);
                this.b(param2, -28327, param0, param1);
                discarded$26 = param2.append(" revert=").append(this.field_F);
                if (-2147483648 == (this.field_J ^ -1)) {
                  break L1;
                } else {
                  if (-2147483648 == (this.field_E ^ -1)) {
                    break L1;
                  } else {
                    discarded$27 = param2.append(" to ").append(this.field_J).append(',').append(this.field_E);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param3 == -15992) {
                break L2;
              } else {
                field_G = (java.awt.Frame) null;
                break L2;
              }
            }
            stackOut_6_0 = (StringBuilder) (param2);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("hh.TA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final void g(int param0) {
        super.g(param0);
        this.field_A.a(this.field_v, this.field_j, true, 0, 0);
        this.field_J = this.field_t;
        this.field_E = this.field_o;
    }

    public static void h(int param0) {
        field_M = null;
        field_N = null;
        field_G = null;
        field_L = null;
        if (param0 != 225) {
            field_N = (sj) null;
        }
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_D) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param3, param6, param5, param4, (byte) -79)) {
              stackOut_8_0 = var8_int;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_h = param1;
              if (param1 != 1) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                this.field_C = -this.field_t + (param6 - param5);
                si.field_t = (hh) (this);
                this.field_K = -param4 + param3 - this.field_o;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var8);
            stackOut_12_1 = new StringBuilder().append("hh.VA(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_h = 0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "hh.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private hh(int param0, int param1, int param2, int param3, rd param4, vd param5, w param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_J = 2147483647;
        this.field_E = 2147483647;
        try {
            this.field_D = param8 ? true : false;
            this.field_A = param6;
            this.field_F = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "hh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 > 59) {
          var2 = param1;
          if (-33 != (var2 ^ -1)) {
            if (-161 != (var2 ^ -1)) {
              if (-96 != (var2 ^ -1)) {
                if ((var2 ^ -1) != -46) {
                  if (-92 != (var2 ^ -1)) {
                    if ((var2 ^ -1) != -94) {
                      L0: {
                        if (var2 != 35) {
                          break L0;
                        } else {
                          if (var3 != 0) {
                            break L0;
                          } else {
                            return param1;
                          }
                        }
                      }
                      L1: {
                        if (var2 != 224) {
                          break L1;
                        } else {
                          if (var3 != 0) {
                            break L1;
                          } else {
                            return 'a';
                          }
                        }
                      }
                      L2: {
                        if (var2 != 225) {
                          break L2;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            return 'a';
                          }
                        }
                      }
                      L3: {
                        if ((var2 ^ -1) != -227) {
                          break L3;
                        } else {
                          if (var3 != 0) {
                            break L3;
                          } else {
                            return 'a';
                          }
                        }
                      }
                      L4: {
                        if (-229 != (var2 ^ -1)) {
                          break L4;
                        } else {
                          if (var3 != 0) {
                            break L4;
                          } else {
                            return 'a';
                          }
                        }
                      }
                      if (var2 != 227) {
                        if ((var2 ^ -1) != -193) {
                          L5: {
                            if ((var2 ^ -1) != -194) {
                              break L5;
                            } else {
                              if (var3 != 0) {
                                break L5;
                              } else {
                                return 'a';
                              }
                            }
                          }
                          L6: {
                            if (-195 != (var2 ^ -1)) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                return 'a';
                              }
                            }
                          }
                          L7: {
                            if (-197 != (var2 ^ -1)) {
                              break L7;
                            } else {
                              if (var3 != 0) {
                                break L7;
                              } else {
                                return 'a';
                              }
                            }
                          }
                          if (var2 != 195) {
                            if ((var2 ^ -1) != -233) {
                              if (233 != var2) {
                                if (234 != var2) {
                                  if (235 != var2) {
                                    if (200 != var2) {
                                      if (-202 != (var2 ^ -1)) {
                                        if ((var2 ^ -1) != -203) {
                                          if (-204 != (var2 ^ -1)) {
                                            if (var2 != 237) {
                                              if (-239 != (var2 ^ -1)) {
                                                if (-240 != (var2 ^ -1)) {
                                                  if (-206 != (var2 ^ -1)) {
                                                    L8: {
                                                      if (var2 != 206) {
                                                        break L8;
                                                      } else {
                                                        if (var3 != 0) {
                                                          break L8;
                                                        } else {
                                                          return 'i';
                                                        }
                                                      }
                                                    }
                                                    L9: {
                                                      if (207 != var2) {
                                                        break L9;
                                                      } else {
                                                        if (var3 == 0) {
                                                          return 'i';
                                                        } else {
                                                          break L9;
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (-243 == (var2 ^ -1)) {
                                                        break L10;
                                                      } else {
                                                        if (-244 == (var2 ^ -1)) {
                                                          break L10;
                                                        } else {
                                                          if ((var2 ^ -1) == -245) {
                                                            break L10;
                                                          } else {
                                                            L11: {
                                                              if ((var2 ^ -1) != -247) {
                                                                break L11;
                                                              } else {
                                                                if (var3 == 0) {
                                                                  break L10;
                                                                } else {
                                                                  break L11;
                                                                }
                                                              }
                                                            }
                                                            if ((var2 ^ -1) == -246) {
                                                              break L10;
                                                            } else {
                                                              if ((var2 ^ -1) == -211) {
                                                                break L10;
                                                              } else {
                                                                if (var2 == 211) {
                                                                  break L10;
                                                                } else {
                                                                  L12: {
                                                                    if (var2 != 212) {
                                                                      break L12;
                                                                    } else {
                                                                      if (var3 == 0) {
                                                                        break L10;
                                                                      } else {
                                                                        break L12;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (-215 == (var2 ^ -1)) {
                                                                    break L10;
                                                                  } else {
                                                                    L13: {
                                                                      if (213 != var2) {
                                                                        break L13;
                                                                      } else {
                                                                        if (var3 == 0) {
                                                                          break L10;
                                                                        } else {
                                                                          break L13;
                                                                        }
                                                                      }
                                                                    }
                                                                    L14: {
                                                                      if (249 == var2) {
                                                                        break L14;
                                                                      } else {
                                                                        L15: {
                                                                          if (var2 != 250) {
                                                                            break L15;
                                                                          } else {
                                                                            if (var3 == 0) {
                                                                              break L14;
                                                                            } else {
                                                                              break L15;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (var2 == 251) {
                                                                          break L14;
                                                                        } else {
                                                                          if ((var2 ^ -1) == -253) {
                                                                            break L14;
                                                                          } else {
                                                                            if (var2 == 217) {
                                                                              break L14;
                                                                            } else {
                                                                              if (var2 != 218) {
                                                                                if (219 != var2) {
                                                                                  if (220 == var2) {
                                                                                    break L14;
                                                                                  } else {
                                                                                    L16: {
                                                                                      if (231 != var2) {
                                                                                        if (var2 == 199) {
                                                                                          break L16;
                                                                                        } else {
                                                                                          L17: {
                                                                                            if (255 != var2) {
                                                                                              if (376 == var2) {
                                                                                                break L17;
                                                                                              } else {
                                                                                                L18: {
                                                                                                  if (241 == var2) {
                                                                                                    break L18;
                                                                                                  } else {
                                                                                                    if (-210 != (var2 ^ -1)) {
                                                                                                      if (-224 != (var2 ^ -1)) {
                                                                                                        return Character.toLowerCase(param1);
                                                                                                      } else {
                                                                                                        if (var3 == 0) {
                                                                                                          return 'b';
                                                                                                        } else {
                                                                                                          return '_';
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      if (var3 == 0) {
                                                                                                        break L18;
                                                                                                      } else {
                                                                                                        if (-224 != (var2 ^ -1)) {
                                                                                                          return Character.toLowerCase(param1);
                                                                                                        } else {
                                                                                                          return '_';
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                return 'n';
                                                                                              }
                                                                                            } else {
                                                                                              if (var3 == 0) {
                                                                                                break L17;
                                                                                              } else {
                                                                                                if (376 == var2) {
                                                                                                  return 'y';
                                                                                                } else {
                                                                                                  if (241 == var2) {
                                                                                                    return 'n';
                                                                                                  } else {
                                                                                                    if (-210 != (var2 ^ -1)) {
                                                                                                      if (-224 != (var2 ^ -1)) {
                                                                                                        return Character.toLowerCase(param1);
                                                                                                      } else {
                                                                                                        if (var3 == 0) {
                                                                                                          return 'b';
                                                                                                        } else {
                                                                                                          return '_';
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      if (-224 != (var2 ^ -1)) {
                                                                                                        return Character.toLowerCase(param1);
                                                                                                      } else {
                                                                                                        return '_';
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          return 'y';
                                                                                        }
                                                                                      } else {
                                                                                        if (var3 == 0) {
                                                                                          break L16;
                                                                                        } else {
                                                                                          if (var2 == 199) {
                                                                                            return 'c';
                                                                                          } else {
                                                                                            if (255 != var2) {
                                                                                              if (376 == var2) {
                                                                                                return 'y';
                                                                                              } else {
                                                                                                L19: {
                                                                                                  if (241 == var2) {
                                                                                                    break L19;
                                                                                                  } else {
                                                                                                    if (-210 != (var2 ^ -1)) {
                                                                                                      if (-224 != (var2 ^ -1)) {
                                                                                                        return Character.toLowerCase(param1);
                                                                                                      } else {
                                                                                                        if (var3 == 0) {
                                                                                                          return 'b';
                                                                                                        } else {
                                                                                                          return '_';
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      if (var3 == 0) {
                                                                                                        break L19;
                                                                                                      } else {
                                                                                                        if (-224 != (var2 ^ -1)) {
                                                                                                          return Character.toLowerCase(param1);
                                                                                                        } else {
                                                                                                          return '_';
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                return 'n';
                                                                                              }
                                                                                            } else {
                                                                                              if (376 == var2) {
                                                                                                return 'y';
                                                                                              } else {
                                                                                                if (241 == var2) {
                                                                                                  return 'n';
                                                                                                } else {
                                                                                                  if (-210 != (var2 ^ -1)) {
                                                                                                    if (-224 != (var2 ^ -1)) {
                                                                                                      return Character.toLowerCase(param1);
                                                                                                    } else {
                                                                                                      if (var3 == 0) {
                                                                                                        return 'b';
                                                                                                      } else {
                                                                                                        return '_';
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    if (-224 != (var2 ^ -1)) {
                                                                                                      return Character.toLowerCase(param1);
                                                                                                    } else {
                                                                                                      return '_';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    return 'c';
                                                                                  }
                                                                                } else {
                                                                                  if (var3 == 0) {
                                                                                    break L14;
                                                                                  } else {
                                                                                    if (220 == var2) {
                                                                                      return 'u';
                                                                                    } else {
                                                                                      if (231 != var2) {
                                                                                        if (var2 == 199) {
                                                                                          return 'c';
                                                                                        } else {
                                                                                          L20: {
                                                                                            if (255 != var2) {
                                                                                              if (376 == var2) {
                                                                                                break L20;
                                                                                              } else {
                                                                                                L21: {
                                                                                                  if (241 == var2) {
                                                                                                    break L21;
                                                                                                  } else {
                                                                                                    if (-210 != (var2 ^ -1)) {
                                                                                                      if (-224 != (var2 ^ -1)) {
                                                                                                        return Character.toLowerCase(param1);
                                                                                                      } else {
                                                                                                        if (var3 == 0) {
                                                                                                          return 'b';
                                                                                                        } else {
                                                                                                          return '_';
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      if (var3 == 0) {
                                                                                                        break L21;
                                                                                                      } else {
                                                                                                        if (-224 != (var2 ^ -1)) {
                                                                                                          return Character.toLowerCase(param1);
                                                                                                        } else {
                                                                                                          return '_';
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                return 'n';
                                                                                              }
                                                                                            } else {
                                                                                              if (var3 == 0) {
                                                                                                break L20;
                                                                                              } else {
                                                                                                if (376 == var2) {
                                                                                                  return 'y';
                                                                                                } else {
                                                                                                  if (241 == var2) {
                                                                                                    return 'n';
                                                                                                  } else {
                                                                                                    L22: {
                                                                                                      if (-210 != (var2 ^ -1)) {
                                                                                                        break L22;
                                                                                                      } else {
                                                                                                        break L22;
                                                                                                      }
                                                                                                    }
                                                                                                    if (-224 != (var2 ^ -1)) {
                                                                                                      return Character.toLowerCase(param1);
                                                                                                    } else {
                                                                                                      if (var3 == 0) {
                                                                                                        return 'b';
                                                                                                      } else {
                                                                                                        return '_';
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          return 'y';
                                                                                        }
                                                                                      } else {
                                                                                        if (var2 == 199) {
                                                                                          return 'c';
                                                                                        } else {
                                                                                          L23: {
                                                                                            if (255 != var2) {
                                                                                              break L23;
                                                                                            } else {
                                                                                              break L23;
                                                                                            }
                                                                                          }
                                                                                          if (376 == var2) {
                                                                                            return 'y';
                                                                                          } else {
                                                                                            L24: {
                                                                                              if (241 == var2) {
                                                                                                break L24;
                                                                                              } else {
                                                                                                L25: {
                                                                                                  if (-210 != (var2 ^ -1)) {
                                                                                                    break L25;
                                                                                                  } else {
                                                                                                    if (var3 == 0) {
                                                                                                      break L24;
                                                                                                    } else {
                                                                                                      break L25;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                if (-224 != (var2 ^ -1)) {
                                                                                                  return Character.toLowerCase(param1);
                                                                                                } else {
                                                                                                  if (var3 == 0) {
                                                                                                    return 'b';
                                                                                                  } else {
                                                                                                    return '_';
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            return 'n';
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                if (var3 == 0) {
                                                                                  break L14;
                                                                                } else {
                                                                                  L26: {
                                                                                    if (219 != var2) {
                                                                                      break L26;
                                                                                    } else {
                                                                                      break L26;
                                                                                    }
                                                                                  }
                                                                                  if (220 == var2) {
                                                                                    return 'u';
                                                                                  } else {
                                                                                    L27: {
                                                                                      L28: {
                                                                                        if (231 != var2) {
                                                                                          break L28;
                                                                                        } else {
                                                                                          if (var3 == 0) {
                                                                                            break L27;
                                                                                          } else {
                                                                                            break L28;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (var2 == 199) {
                                                                                        break L27;
                                                                                      } else {
                                                                                        L29: {
                                                                                          L30: {
                                                                                            if (255 != var2) {
                                                                                              break L30;
                                                                                            } else {
                                                                                              if (var3 == 0) {
                                                                                                break L29;
                                                                                              } else {
                                                                                                break L30;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (376 == var2) {
                                                                                            break L29;
                                                                                          } else {
                                                                                            L31: {
                                                                                              if (241 == var2) {
                                                                                                break L31;
                                                                                              } else {
                                                                                                L32: {
                                                                                                  if (-210 != (var2 ^ -1)) {
                                                                                                    break L32;
                                                                                                  } else {
                                                                                                    if (var3 == 0) {
                                                                                                      break L31;
                                                                                                    } else {
                                                                                                      break L32;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                if (-224 != (var2 ^ -1)) {
                                                                                                  return Character.toLowerCase(param1);
                                                                                                } else {
                                                                                                  if (var3 == 0) {
                                                                                                    return 'b';
                                                                                                  } else {
                                                                                                    return '_';
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            return 'n';
                                                                                          }
                                                                                        }
                                                                                        return 'y';
                                                                                      }
                                                                                    }
                                                                                    return 'c';
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'u';
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    return 'o';
                                                  } else {
                                                    return 'i';
                                                  }
                                                } else {
                                                  return 'i';
                                                }
                                              } else {
                                                return 'i';
                                              }
                                            } else {
                                              return 'i';
                                            }
                                          } else {
                                            return 'e';
                                          }
                                        } else {
                                          return 'e';
                                        }
                                      } else {
                                        return 'e';
                                      }
                                    } else {
                                      return 'e';
                                    }
                                  } else {
                                    return 'e';
                                  }
                                } else {
                                  return 'e';
                                }
                              } else {
                                return 'e';
                              }
                            } else {
                              return 'e';
                            }
                          } else {
                            return 'a';
                          }
                        } else {
                          return 'a';
                        }
                      } else {
                        return 'a';
                      }
                    } else {
                      return param1;
                    }
                  } else {
                    return param1;
                  }
                } else {
                  return '_';
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        } else {
          return '￧';
        }
    }

    final static fh a(byte param0) {
        if (param0 < 107) {
          L0: {
            field_M = (da) null;
            if (null == bg.field_d) {
              bg.field_d = new fh();
              bg.field_d.a(ql.field_Q, 48);
              bg.field_d.field_h = 2763306;
              bg.field_d.field_d = 6;
              bg.field_d.field_l = 14;
              bg.field_d.field_e = 5;
              bg.field_d.field_c = 7697781;
              bg.field_d.field_p = cl.field_T;
              bg.field_d.field_k = 0;
              bg.field_d.field_n = 4;
              break L0;
            } else {
              break L0;
            }
          }
          return bg.field_d;
        } else {
          L1: {
            if (null == bg.field_d) {
              bg.field_d = new fh();
              bg.field_d.a(ql.field_Q, 48);
              bg.field_d.field_h = 2763306;
              bg.field_d.field_d = 6;
              bg.field_d.field_l = 14;
              bg.field_d.field_e = 5;
              bg.field_d.field_c = 7697781;
              bg.field_d.field_p = cl.field_T;
              bg.field_d.field_k = 0;
              bg.field_d.field_n = 4;
              break L1;
            } else {
              break L1;
            }
          }
          return bg.field_d;
        }
    }

    final void a(byte param0, w param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_A instanceof kf)) {
                    break L3;
                  } else {
                    if (!((kf) ((Object) this.field_A)).field_D) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_h != 1) {
                  break L2;
                } else {
                  L4: {
                    L5: {
                      var5_int = -param3 + (-this.field_C + bk.field_b);
                      var6 = -param2 + sh.field_e + -this.field_K;
                      if (var5_int != this.field_t) {
                        break L5;
                      } else {
                        if (var6 != this.field_o) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_o = var6;
                    this.field_t = var5_int;
                    if (!(this.field_r instanceof hj)) {
                      break L4;
                    } else {
                      ((hj) ((Object) this.field_r)).a((hh) (this), 31954, param3, param2);
                      break L4;
                    }
                  }
                  if (!Lexicominos.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (!this.field_F) {
                break L1;
              } else {
                L6: {
                  if (this.field_J == this.field_t) {
                    break L6;
                  } else {
                    L7: {
                      var5_int = -this.field_t + this.field_J;
                      stackOut_12_0 = this;
                      stackOut_12_1 = this.field_t;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if ((Math.abs(var5_int) ^ -1) >= -3) {
                        stackOut_14_0 = this;
                        stackOut_14_1 = stackIn_14_1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (-1 <= (var5_int ^ -1)) {
                          stackOut_16_0 = this;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = -1;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L7;
                        } else {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          break L7;
                        }
                      } else {
                        stackOut_13_0 = this;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = var5_int >> -1870757791;
                        stackIn_17_0 = stackOut_13_0;
                        stackIn_17_1 = stackOut_13_1;
                        stackIn_17_2 = stackOut_13_2;
                        break L7;
                      }
                    }
                    ((hh) (this)).field_t = stackIn_17_1 + stackIn_17_2;
                    break L6;
                  }
                }
                if (this.field_E != this.field_o) {
                  L8: {
                    var5_int = -this.field_o + this.field_E;
                    stackOut_20_0 = this;
                    stackOut_20_1 = this.field_o;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    if (2 >= Math.abs(var5_int)) {
                      stackOut_22_0 = this;
                      stackOut_22_1 = stackIn_22_1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      if (0 < var5_int) {
                        stackOut_24_0 = this;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        break L8;
                      } else {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = -1;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        break L8;
                      }
                    } else {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = var5_int >> 1332048033;
                      stackIn_25_0 = stackOut_21_0;
                      stackIn_25_1 = stackOut_21_1;
                      stackIn_25_2 = stackOut_21_2;
                      break L8;
                    }
                  }
                  ((hh) (this)).field_o = stackIn_25_1 + stackIn_25_2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("hh.FA(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_M = new da();
        field_N = null;
    }
}
