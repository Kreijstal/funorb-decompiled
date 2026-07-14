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
        if (((hh) this).a(param3 ^ -8891, param2, param1, param0)) {
          ((hh) this).a(param2, 0, param0, param1);
          ((hh) this).b(param2, -28327, param0, param1);
          StringBuilder discarded$36 = param2.append(" revert=").append(((hh) this).field_F);
          if (-2147483648 != ((hh) this).field_J) {
            if (-2147483648 == ((hh) this).field_E) {
              if (param3 != -15992) {
                field_G = null;
                return param2;
              } else {
                return param2;
              }
            } else {
              L0: {
                StringBuilder discarded$37 = param2.append(" to ").append(((hh) this).field_J).append(44).append(((hh) this).field_E);
                if (param3 == -15992) {
                  break L0;
                } else {
                  field_G = null;
                  break L0;
                }
              }
              return param2;
            }
          } else {
            if (param3 != -15992) {
              field_G = null;
              return param2;
            } else {
              return param2;
            }
          }
        } else {
          if (param3 != -15992) {
            field_G = null;
            return param2;
          } else {
            return param2;
          }
        }
    }

    final void g(int param0) {
        super.g(param0);
        ((hh) this).field_A.a(((hh) this).field_v, ((hh) this).field_j, true, 0, 0);
        ((hh) this).field_J = ((hh) this).field_t;
        ((hh) this).field_E = ((hh) this).field_o;
    }

    public static void h(int param0) {
        field_M = null;
        field_N = null;
        field_G = null;
        field_L = null;
        if (param0 != 225) {
            field_N = null;
        }
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 == 0) {
          if (((hh) this).a(param3, param6, param5, param4, (byte) -79)) {
            ((hh) this).field_h = param1;
            if (param1 == 1) {
              ((hh) this).field_C = -((hh) this).field_t + (param6 - param5);
              si.field_t = (hh) this;
              ((hh) this).field_K = -param4 + param3 - ((hh) this).field_o;
              return true;
            } else {
              return true;
            }
          } else {
            return var8 != 0;
          }
        } else {
          if (!((hh) this).field_D) {
            if (((hh) this).a(param3, param6, param5, param4, (byte) -79)) {
              ((hh) this).field_h = param1;
              if (param1 != 1) {
                return true;
              } else {
                ((hh) this).field_C = -((hh) this).field_t + (param6 - param5);
                si.field_t = (hh) this;
                ((hh) this).field_K = -param4 + param3 - ((hh) this).field_o;
                return true;
              }
            } else {
              return var8 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((hh) this).field_h = 0;
    }

    private hh(int param0, int param1, int param2, int param3, rd param4, vd param5, w param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((hh) this).field_J = 2147483647;
        ((hh) this).field_E = 2147483647;
        ((hh) this).field_D = param8 ? true : false;
        ((hh) this).field_A = param6;
        ((hh) this).field_F = param7 ? true : false;
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 > 59) {
          var2 = param1;
          if (-33 != var2) {
            if (-161 != var2) {
              if (-96 != (var2 ^ -1)) {
                if (var2 != -46) {
                  if (-92 != var2) {
                    if ((var2 ^ -1) != -94) {
                      if (var2 != 35) {
                        if (var2 != 224) {
                          if (var2 != 225) {
                            if (var2 != -227) {
                              if (-229 != var2) {
                                if (var2 != 227) {
                                  if (var2 != -193) {
                                    if (var2 != -194) {
                                      if (-195 != var2) {
                                        if (-197 != var2) {
                                          if (var2 != 195) {
                                            if (var2 != -233) {
                                              if (233 != var2) {
                                                if (234 != var2) {
                                                  if (235 != var2) {
                                                    if (200 != var2) {
                                                      if (-202 != var2) {
                                                        if (var2 != -203) {
                                                          if (-204 != var2) {
                                                            if (var2 != 237) {
                                                              if (-239 != var2) {
                                                                if (-240 != var2) {
                                                                  if (-206 != var2) {
                                                                    if (var2 != 206) {
                                                                      if (207 != var2) {
                                                                        if (-243 != var2) {
                                                                          if (-244 != (var2 ^ -1)) {
                                                                            if ((var2 ^ -1) != -245) {
                                                                              if ((var2 ^ -1) != -247) {
                                                                                if ((var2 ^ -1) != -246) {
                                                                                  if (var2 != -211) {
                                                                                    if (var2 != 211) {
                                                                                      if (var2 != 212) {
                                                                                        if (-215 != var2) {
                                                                                          if (213 != var2) {
                                                                                            if (249 != var2) {
                                                                                              if (var2 != 250) {
                                                                                                if (var2 != 251) {
                                                                                                  L0: {
                                                                                                    if ((var2 ^ -1) == -253) {
                                                                                                      break L0;
                                                                                                    } else {
                                                                                                      if (var2 == 217) {
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        if (var2 != 218) {
                                                                                                          if (219 != var2) {
                                                                                                            if (220 == var2) {
                                                                                                              break L0;
                                                                                                            } else {
                                                                                                              if (231 != var2) {
                                                                                                                if (var2 == 199) {
                                                                                                                  return 'c';
                                                                                                                } else {
                                                                                                                  if (255 != var2) {
                                                                                                                    if (376 == var2) {
                                                                                                                      return 'y';
                                                                                                                    } else {
                                                                                                                      if (241 == var2) {
                                                                                                                        return 'n';
                                                                                                                      } else {
                                                                                                                        if (-210 != var2) {
                                                                                                                          if (-224 != var2) {
                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                          } else {
                                                                                                                            return 'b';
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'n';
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'y';
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'c';
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  return 'u';
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
            field_M = null;
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
        int var5 = 0;
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
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
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
        if (((hh) this).field_A instanceof kf) {
          if (((kf) (Object) ((hh) this).field_A).field_D) {
            if (((hh) this).field_h != 1) {
              if (!((hh) this).field_F) {
                super.a(param0, param1, param2, param3);
                return;
              } else {
                L0: {
                  if (((hh) this).field_J == ((hh) this).field_t) {
                    break L0;
                  } else {
                    L1: {
                      var5 = -((hh) this).field_t + ((hh) this).field_J;
                      stackOut_63_0 = this;
                      stackOut_63_1 = ((hh) this).field_t;
                      stackIn_65_0 = stackOut_63_0;
                      stackIn_65_1 = stackOut_63_1;
                      stackIn_64_0 = stackOut_63_0;
                      stackIn_64_1 = stackOut_63_1;
                      if (Math.abs(var5) >= -3) {
                        stackOut_65_0 = this;
                        stackOut_65_1 = stackIn_65_1;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        if (-1 >= var5) {
                          stackOut_67_0 = this;
                          stackOut_67_1 = stackIn_67_1;
                          stackOut_67_2 = -1;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          stackIn_68_2 = stackOut_67_2;
                          break L1;
                        } else {
                          stackOut_66_0 = this;
                          stackOut_66_1 = stackIn_66_1;
                          stackOut_66_2 = 1;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          stackIn_68_2 = stackOut_66_2;
                          break L1;
                        }
                      } else {
                        stackOut_64_0 = this;
                        stackOut_64_1 = stackIn_64_1;
                        stackOut_64_2 = var5 >> -1870757791;
                        stackIn_68_0 = stackOut_64_0;
                        stackIn_68_1 = stackOut_64_1;
                        stackIn_68_2 = stackOut_64_2;
                        break L1;
                      }
                    }
                    ((hh) this).field_t = stackIn_68_1 + stackIn_68_2;
                    break L0;
                  }
                }
                if (((hh) this).field_E != ((hh) this).field_o) {
                  L2: {
                    var5 = -((hh) this).field_o + ((hh) this).field_E;
                    stackOut_71_0 = this;
                    stackOut_71_1 = ((hh) this).field_o;
                    stackIn_73_0 = stackOut_71_0;
                    stackIn_73_1 = stackOut_71_1;
                    stackIn_72_0 = stackOut_71_0;
                    stackIn_72_1 = stackOut_71_1;
                    if (2 >= Math.abs(var5)) {
                      L3: {
                        stackOut_73_0 = this;
                        stackOut_73_1 = stackIn_73_1;
                        stackIn_75_0 = stackOut_73_0;
                        stackIn_75_1 = stackOut_73_1;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        if (0 < var5) {
                          stackOut_75_0 = this;
                          stackOut_75_1 = stackIn_75_1;
                          stackOut_75_2 = 1;
                          stackIn_76_0 = stackOut_75_0;
                          stackIn_76_1 = stackOut_75_1;
                          stackIn_76_2 = stackOut_75_2;
                          break L3;
                        } else {
                          stackOut_74_0 = this;
                          stackOut_74_1 = stackIn_74_1;
                          stackOut_74_2 = -1;
                          stackIn_76_0 = stackOut_74_0;
                          stackIn_76_1 = stackOut_74_1;
                          stackIn_76_2 = stackOut_74_2;
                          break L3;
                        }
                      }
                      ((hh) this).field_o = stackIn_76_1 + stackIn_76_2;
                      break L2;
                    } else {
                      ((hh) this).field_o = stackIn_72_1 + (var5 >> 1332048033);
                      break L2;
                    }
                  }
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            } else {
              var5 = -param3 + (-((hh) this).field_C + bk.field_b);
              var6 = -param2 + sh.field_e + -((hh) this).field_K;
              if (var5 == ((hh) this).field_t) {
                if (var6 != ((hh) this).field_o) {
                  ((hh) this).field_o = var6;
                  ((hh) this).field_t = var5;
                  if (((hh) this).field_r instanceof hj) {
                    ((hj) (Object) ((hh) this).field_r).a((hh) this, 31954, param3, param2);
                    super.a(param0, param1, param2, param3);
                    return;
                  } else {
                    super.a(param0, param1, param2, param3);
                    return;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                ((hh) this).field_o = var6;
                ((hh) this).field_t = var5;
                if (((hh) this).field_r instanceof hj) {
                  ((hj) (Object) ((hh) this).field_r).a((hh) this, 31954, param3, param2);
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            }
          } else {
            if (!((hh) this).field_F) {
              super.a(param0, param1, param2, param3);
              return;
            } else {
              L4: {
                if (((hh) this).field_J == ((hh) this).field_t) {
                  break L4;
                } else {
                  L5: {
                    var5 = -((hh) this).field_t + ((hh) this).field_J;
                    stackOut_32_0 = this;
                    stackOut_32_1 = ((hh) this).field_t;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    if (Math.abs(var5) >= -3) {
                      stackOut_34_0 = this;
                      stackOut_34_1 = stackIn_34_1;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      if (-1 >= var5) {
                        stackOut_36_0 = this;
                        stackOut_36_1 = stackIn_36_1;
                        stackOut_36_2 = -1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        break L5;
                      } else {
                        stackOut_35_0 = this;
                        stackOut_35_1 = stackIn_35_1;
                        stackOut_35_2 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_37_2 = stackOut_35_2;
                        break L5;
                      }
                    } else {
                      stackOut_33_0 = this;
                      stackOut_33_1 = stackIn_33_1;
                      stackOut_33_2 = var5 >> -1870757791;
                      stackIn_37_0 = stackOut_33_0;
                      stackIn_37_1 = stackOut_33_1;
                      stackIn_37_2 = stackOut_33_2;
                      break L5;
                    }
                  }
                  ((hh) this).field_t = stackIn_37_1 + stackIn_37_2;
                  break L4;
                }
              }
              if (((hh) this).field_E != ((hh) this).field_o) {
                L6: {
                  var5 = -((hh) this).field_o + ((hh) this).field_E;
                  stackOut_40_0 = this;
                  stackOut_40_1 = ((hh) this).field_o;
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  if (2 >= Math.abs(var5)) {
                    L7: {
                      stackOut_42_0 = this;
                      stackOut_42_1 = stackIn_42_1;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_44_1 = stackOut_42_1;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      if (0 < var5) {
                        stackOut_44_0 = this;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = 1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        stackIn_45_2 = stackOut_44_2;
                        break L7;
                      } else {
                        stackOut_43_0 = this;
                        stackOut_43_1 = stackIn_43_1;
                        stackOut_43_2 = -1;
                        stackIn_45_0 = stackOut_43_0;
                        stackIn_45_1 = stackOut_43_1;
                        stackIn_45_2 = stackOut_43_2;
                        break L7;
                      }
                    }
                    ((hh) this).field_o = stackIn_45_1 + stackIn_45_2;
                    break L6;
                  } else {
                    ((hh) this).field_o = stackIn_41_1 + (var5 >> 1332048033);
                    break L6;
                  }
                }
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          }
        } else {
          if (((hh) this).field_h != 1) {
            if (((hh) this).field_F) {
              L8: {
                if (((hh) this).field_J == ((hh) this).field_t) {
                  break L8;
                } else {
                  L9: {
                    var5 = -((hh) this).field_t + ((hh) this).field_J;
                    stackOut_12_0 = this;
                    stackOut_12_1 = ((hh) this).field_t;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if (Math.abs(var5) >= -3) {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (-1 >= var5) {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = -1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        break L9;
                      } else {
                        stackOut_15_0 = this;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        break L9;
                      }
                    } else {
                      stackOut_13_0 = this;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = var5 >> -1870757791;
                      stackIn_17_0 = stackOut_13_0;
                      stackIn_17_1 = stackOut_13_1;
                      stackIn_17_2 = stackOut_13_2;
                      break L9;
                    }
                  }
                  ((hh) this).field_t = stackIn_17_1 + stackIn_17_2;
                  break L8;
                }
              }
              if (((hh) this).field_E != ((hh) this).field_o) {
                L10: {
                  var5 = -((hh) this).field_o + ((hh) this).field_E;
                  stackOut_20_0 = this;
                  stackOut_20_1 = ((hh) this).field_o;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  if (2 >= Math.abs(var5)) {
                    L11: {
                      stackOut_22_0 = this;
                      stackOut_22_1 = stackIn_22_1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      if (0 < var5) {
                        stackOut_24_0 = this;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        break L11;
                      } else {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = -1;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        break L11;
                      }
                    }
                    ((hh) this).field_o = stackIn_25_1 + stackIn_25_2;
                    break L10;
                  } else {
                    ((hh) this).field_o = stackIn_21_1 + (var5 >> 1332048033);
                    break L10;
                  }
                }
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              super.a(param0, param1, param2, param3);
              return;
            }
          } else {
            L12: {
              var5 = -param3 + (-((hh) this).field_C + bk.field_b);
              var6 = -param2 + sh.field_e + -((hh) this).field_K;
              if (var5 != ((hh) this).field_t) {
                break L12;
              } else {
                if (var6 != ((hh) this).field_o) {
                  break L12;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            }
            ((hh) this).field_o = var6;
            ((hh) this).field_t = var5;
            if (((hh) this).field_r instanceof hj) {
              ((hj) (Object) ((hh) this).field_r).a((hh) this, 31954, param3, param2);
              super.a(param0, param1, param2, param3);
              return;
            } else {
              super.a(param0, param1, param2, param3);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new da();
        field_N = null;
    }
}
