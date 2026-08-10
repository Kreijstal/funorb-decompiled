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
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param3 ^ -8891, param2, param1, param0)) {
                break L1;
              } else {
                this.a(param2, 0, param0, param1);
                this.b(param2, -28327, param0, param1);
                discarded$64 = param2.append(" revert=").append(this.field_F);
                if (-2147483648 == (this.field_J ^ -1)) {
                  break L1;
                } else {
                  if (-2147483648 == (this.field_E ^ -1)) {
                    break L1;
                  } else {
                    discarded$65 = param2.append(" to ").append(this.field_J).append(',').append(this.field_E);
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
            stackIn_7_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("hh.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_D) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param3, param6, param5, param4, (byte) -79)) {
              stackIn_9_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_h = param1;
              if (param1 != 1) {
                stackIn_7_0 = 1;
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
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("hh.VA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
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
        int var2;
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 > 59) {
          var2 = param1;
          if (-33 != (var2 ^ -1)) {
            if (-161 != (var2 ^ -1)) {
              if (-96 != (var2 ^ -1)) {
                if ((var2 ^ -1) != -46) {
                  if (-92 != (var2 ^ -1)) {
                    if ((var2 ^ -1) != -94) {
                      if (var2 != 35) {
                        if (var2 != 224) {
                          if (var2 != 225) {
                            if ((var2 ^ -1) != -227) {
                              if (-229 != (var2 ^ -1)) {
                                if (var2 != 227) {
                                  if ((var2 ^ -1) != -193) {
                                    if ((var2 ^ -1) != -194) {
                                      if (-195 != (var2 ^ -1)) {
                                        if (-197 != (var2 ^ -1)) {
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
                                                                    if (var2 != 206) {
                                                                      if (207 != var2) {
                                                                        if (-243 != (var2 ^ -1)) {
                                                                          if (-244 != (var2 ^ -1)) {
                                                                            if ((var2 ^ -1) != -245) {
                                                                              if ((var2 ^ -1) != -247) {
                                                                                if ((var2 ^ -1) != -246) {
                                                                                  if ((var2 ^ -1) != -211) {
                                                                                    if (var2 != 211) {
                                                                                      if (var2 != 212) {
                                                                                        if (-215 != (var2 ^ -1)) {
                                                                                          if (213 != var2) {
                                                                                            if (249 != var2) {
                                                                                              if (var2 != 250) {
                                                                                                if (var2 != 251) {
                                                                                                  if ((var2 ^ -1) != -253) {
                                                                                                    if (var2 != 217) {
                                                                                                      if (var2 != 218) {
                                                                                                        if (219 != var2) {
                                                                                                          if (220 != var2) {
                                                                                                            if (231 != var2) {
                                                                                                              if (var2 != 199) {
                                                                                                                if (255 != var2) {
                                                                                                                  if (376 != var2) {
                                                                                                                    if (241 != var2) {
                                                                                                                      if (-210 != (var2 ^ -1)) {
                                                                                                                        if (-224 != (var2 ^ -1)) {
                                                                                                                          return Character.toLowerCase(param1);
                                                                                                                        } else {
                                                                                                                          return 'b';
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'n';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'n';
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'y';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'y';
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'c';
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'c';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'u';
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'u';
                                                                                                }
                                                                                              } else {
                                                                                                return 'u';
                                                                                              }
                                                                                            } else {
                                                                                              return 'u';
                                                                                            }
                                                                                          } else {
                                                                                            return 'o';
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'o';
                                                                                }
                                                                              } else {
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              return 'o';
                                                                            }
                                                                          } else {
                                                                            return 'o';
                                                                          }
                                                                        } else {
                                                                          return 'o';
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
                                      return 'a';
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
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
                    var5_int = -param3 + (-this.field_C + bk.field_b);
                    var6 = -param2 + sh.field_e + -this.field_K;
                    if (var5_int != this.field_t) {
                      break L4;
                    } else {
                      if (var6 != this.field_o) {
                        break L4;
                      } else {
                        super.a(param0, param1, param2, param3);
                        return;
                      }
                    }
                  }
                  this.field_o = var6;
                  this.field_t = var5_int;
                  if (!(this.field_r instanceof hj)) {
                    break L1;
                  } else {
                    ((hj) ((Object) this.field_r)).a((hh) (this), 31954, param3, param2);
                    break L1;
                  }
                }
              }
              if (!this.field_F) {
                break L1;
              } else {
                L5: {
                  if (this.field_J == this.field_t) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -this.field_t + this.field_J;
                      stackIn_13_0 = this;

                      stackIn_13_1 = this.field_t;

                      if ((Math.abs(var5_int) ^ -1) >= -3) {
                        stackIn_15_0 = this;

                        if (-1 <= (var5_int ^ -1)) {
                          stackIn_16_0 = this;
                          stackIn_16_1 = stackIn_13_1;
                          stackIn_16_2 = -1;
                          break L6;
                        } else {
                          stackIn_16_0 = this;
                          stackIn_16_1 = stackIn_13_1;
                          stackIn_16_2 = 1;
                          break L6;
                        }
                      } else {
                        stackIn_16_0 = this;
                        stackIn_16_1 = stackIn_13_1;
                        stackIn_16_2 = var5_int >> -1870757791;
                        break L6;
                      }
                    }
                    ((hh) (this)).field_t = stackIn_16_1 + stackIn_16_2;
                    break L5;
                  }
                }
                if (this.field_E != this.field_o) {
                  L7: {
                    var5_int = -this.field_o + this.field_E;
                    stackIn_21_0 = this;

                    stackIn_21_1 = this.field_o;

                    if (2 >= Math.abs(var5_int)) {
                      stackIn_23_0 = this;

                      if (0 < var5_int) {
                        stackIn_24_0 = this;
                        stackIn_24_1 = stackIn_21_1;
                        stackIn_24_2 = 1;
                        break L7;
                      } else {
                        stackIn_24_0 = this;
                        stackIn_24_1 = stackIn_21_1;
                        stackIn_24_2 = -1;
                        break L7;
                      }
                    } else {
                      stackIn_24_0 = this;
                      stackIn_24_1 = stackIn_21_1;
                      stackIn_24_2 = var5_int >> 1332048033;
                      break L7;
                    }
                  }
                  ((hh) (this)).field_o = stackIn_24_1 + stackIn_24_2;
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
          L8: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("hh.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_M = new da();
        field_N = null;
    }
}
