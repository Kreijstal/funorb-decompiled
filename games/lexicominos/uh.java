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
        this.a(256, param3, false, param2, param1, (byte) 91);
        int var5 = 83 / ((param0 - -55) / 51);
    }

    private final void a(hl param0, byte param1, hl param2) {
        if (param1 >= -66) {
            return;
        }
        ((uh) this).field_A = param0;
        ((uh) this).field_w = 1048576;
        ((uh) this).field_s = param2;
    }

    private final void a(int param0, int param1, int param2, hl param3) {
        param3.a(-1, param2, false);
        if (param0 > -88) {
          ((uh) this).field_o = true;
          param3.b(-180, param1);
          return;
        } else {
          param3.b(-180, param1);
          return;
        }
    }

    final static void a(sj param0, byte param1, int param2) {
        th var3 = null;
        if (param1 > -91) {
          return;
        } else {
          var3 = ed.field_q;
          var3.h(param2, 0);
          var3.c(5, -1);
          var3.c(0, -1);
          var3.e(91, param0.field_h);
          var3.c(param0.field_o, -1);
          var3.c(param0.field_m, -1);
          return;
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
              if (((uh) this).field_q >= -1) {
                break L2;
              } else {
                if (((uh) this).field_m != null) {
                  ((uh) this).field_z.a(param0);
                  break L2;
                } else {
                  L3: {
                    if (((uh) this).field_p) {
                      L4: {
                        if (-1 >= ((uh) this).field_x) {
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
                      if ((((uh) this).field_x ^ -1) <= -1) {
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
                if (-1 <= (((uh) this).field_x ^ -1)) {
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
                if ((((uh) this).field_x ^ -1) <= -1) {
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
              if (((uh) this).field_q >= -1) {
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
                  if (-1 >= ((uh) this).field_x) {
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
                if ((((uh) this).field_x ^ -1) <= -1) {
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
              ((uh) this).field_w = ((uh) this).field_w + param0 * ((uh) this).field_x;
              if (((uh) this).field_w < 1048576) {
                if (0 >= ((uh) this).field_w) {
                  ((uh) this).field_w = 0;
                  if (!((uh) this).field_p) {
                    ((uh) this).field_x = 0;
                    if (!((uh) this).field_o) {
                      if (null == ((uh) this).field_B) {
                        ((uh) this).field_B = null;
                        return;
                      } else {
                        ((uh) this).field_A.d(false);
                        ((uh) this).field_B = null;
                        return;
                      }
                    } else {
                      return;
                    }
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
                    if (((uh) this).field_t != null) {
                      ((uh) this).field_s.d(false);
                      ((uh) this).field_t = null;
                      return;
                    } else {
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
        } else {
          L15: {
            if (1048576 <= ((uh) this).field_w) {
              break L15;
            } else {
              if (((uh) this).field_t == null) {
                break L15;
              } else {
                ((uh) this).field_s.a(param0);
                break L15;
              }
            }
          }
          L16: {
            if (((uh) this).field_q >= -1) {
              break L16;
            } else {
              if (((uh) this).field_m != null) {
                ((uh) this).field_z.a(param0);
                break L16;
              } else {
                break L16;
              }
            }
          }
          L17: {
            if (((uh) this).field_p) {
              L18: {
                if (-1 >= ((uh) this).field_x) {
                  break L18;
                } else {
                  if (((uh) this).field_A.a((byte) -32)) {
                    break L18;
                  } else {
                    ((uh) this).field_x = -((uh) this).field_x;
                    ((uh) this).field_B = null;
                    ((uh) this).field_p = false;
                    break L17;
                  }
                }
              }
              if ((((uh) this).field_x ^ -1) <= -1) {
                break L17;
              } else {
                if (!((uh) this).field_s.a((byte) -32)) {
                  ((uh) this).field_t = null;
                  ((uh) this).field_x = -((uh) this).field_x;
                  ((uh) this).field_p = false;
                  break L17;
                } else {
                  break L17;
                }
              }
            } else {
              break L17;
            }
          }
          if (((uh) this).field_x != 0) {
            ((uh) this).field_w = ((uh) this).field_w + param0 * ((uh) this).field_x;
            if (((uh) this).field_w < 1048576) {
              if (0 >= ((uh) this).field_w) {
                ((uh) this).field_w = 0;
                if (!((uh) this).field_p) {
                  ((uh) this).field_x = 0;
                  if (!((uh) this).field_o) {
                    if (null != ((uh) this).field_B) {
                      ((uh) this).field_A.d(false);
                      ((uh) this).field_B = null;
                      return;
                    } else {
                      ((uh) this).field_B = null;
                      return;
                    }
                  } else {
                    return;
                  }
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
                  if (((uh) this).field_t != null) {
                    ((uh) this).field_s.d(false);
                    ((uh) this).field_t = null;
                    return;
                  } else {
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

    private final synchronized void a(int param0, int param1, boolean param2, ih param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        hl stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        hl stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        hl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        hl stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        hl stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        hl stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_35_0 = 0;
        hl stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        hl stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        hl stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        hl stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        hl stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        hl stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        hl stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        hl stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        hl stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        hl stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        hl stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        hl stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        hl stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        hl stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        hl stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        Object stackIn_104_0 = null;
        Object stackIn_105_0 = null;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        hl stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        hl stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        hl stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        int stackIn_122_2 = 0;
        hl stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        hl stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        hl stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        int stackIn_129_2 = 0;
        hl stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        hl stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        hl stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        int stackIn_135_2 = 0;
        int stackIn_142_0 = 0;
        hl stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        hl stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        hl stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackIn_152_2 = 0;
        hl stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        hl stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        hl stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_159_2 = 0;
        hl stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        hl stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        hl stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        int stackIn_165_2 = 0;
        hl stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        hl stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        hl stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        int stackIn_179_2 = 0;
        hl stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        hl stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        hl stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        hl stackIn_190_0 = null;
        int stackIn_190_1 = 0;
        hl stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        hl stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        int stackIn_192_2 = 0;
        Object stackOut_103_0 = null;
        Object stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        hl stackOut_189_0 = null;
        int stackOut_189_1 = 0;
        hl stackOut_191_0 = null;
        int stackOut_191_1 = 0;
        int stackOut_191_2 = 0;
        hl stackOut_190_0 = null;
        int stackOut_190_1 = 0;
        int stackOut_190_2 = 0;
        hl stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        hl stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        hl stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        int stackOut_184_2 = 0;
        hl stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        hl stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        int stackOut_178_2 = 0;
        hl stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        int stackOut_177_2 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        hl stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        hl stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        int stackOut_164_2 = 0;
        hl stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        int stackOut_163_2 = 0;
        hl stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        hl stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int stackOut_158_2 = 0;
        hl stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        int stackOut_157_2 = 0;
        hl stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        hl stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int stackOut_151_2 = 0;
        hl stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int stackOut_150_2 = 0;
        hl stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        hl stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        int stackOut_134_2 = 0;
        hl stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        hl stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        hl stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        int stackOut_128_2 = 0;
        hl stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        int stackOut_127_2 = 0;
        hl stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        hl stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        hl stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        hl stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        hl stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        hl stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        hl stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        hl stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        hl stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        hl stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        hl stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        hl stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        hl stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        hl stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        hl stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        hl stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        hl stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        hl stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        hl stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        hl stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        hl stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        hl stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        hl stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        hl stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (((uh) this).field_p) {
          if (param2) {
            if (((uh) this).field_x > 0) {
              if (((uh) this).field_B == null) {
                ((uh) this).field_B = param3;
                if (param3 != null) {
                  ((uh) this).field_A.a(34, false, param3);
                  this.a(-117, param4, param0, ((uh) this).field_A);
                  return;
                } else {
                  return;
                }
              } else {
                L0: {
                  ((uh) this).field_A.d(false);
                  ((uh) this).field_B = param3;
                  if (param3 == null) {
                    break L0;
                  } else {
                    ((uh) this).field_A.a(34, false, param3);
                    this.a(-117, param4, param0, ((uh) this).field_A);
                    break L0;
                  }
                }
                return;
              }
            } else {
              L1: {
                if (((uh) this).field_t != null) {
                  ((uh) this).field_s.d(false);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((uh) this).field_t = param3;
              if (param3 == null) {
                return;
              } else {
                ((uh) this).field_s.a(94, false, param3);
                this.a(-101, param4, param0, ((uh) this).field_s);
                return;
              }
            }
          } else {
            L2: {
              stackOut_103_0 = this;
              stackIn_105_0 = stackOut_103_0;
              stackIn_104_0 = stackOut_103_0;
              if (!param2) {
                stackOut_105_0 = this;
                stackOut_105_1 = 0;
                stackIn_106_0 = stackOut_105_0;
                stackIn_106_1 = stackOut_105_1;
                break L2;
              } else {
                stackOut_104_0 = this;
                stackOut_104_1 = 1;
                stackIn_106_0 = stackOut_104_0;
                stackIn_106_1 = stackOut_104_1;
                break L2;
              }
            }
            ((uh) this).field_p = stackIn_106_1 != 0;
            if (((uh) this).field_B != param3) {
              if (((uh) this).field_t != param3) {
                if (null == ((uh) this).field_B) {
                  var7 = 1;
                  if (param5 >= 89) {
                    if (var7 == 0) {
                      if (((uh) this).field_t != null) {
                        L3: {
                          ((uh) this).field_s.d(false);
                          ((uh) this).field_t = param3;
                          if (param3 == null) {
                            break L3;
                          } else {
                            L4: {
                              stackOut_189_0 = ((uh) this).field_s;
                              stackOut_189_1 = 46;
                              stackIn_191_0 = stackOut_189_0;
                              stackIn_191_1 = stackOut_189_1;
                              stackIn_190_0 = stackOut_189_0;
                              stackIn_190_1 = stackOut_189_1;
                              if (param2) {
                                stackOut_191_0 = (hl) (Object) stackIn_191_0;
                                stackOut_191_1 = stackIn_191_1;
                                stackOut_191_2 = 0;
                                stackIn_192_0 = stackOut_191_0;
                                stackIn_192_1 = stackOut_191_1;
                                stackIn_192_2 = stackOut_191_2;
                                break L4;
                              } else {
                                stackOut_190_0 = (hl) (Object) stackIn_190_0;
                                stackOut_190_1 = stackIn_190_1;
                                stackOut_190_2 = 1;
                                stackIn_192_0 = stackOut_190_0;
                                stackIn_192_1 = stackOut_190_1;
                                stackIn_192_2 = stackOut_190_2;
                                break L4;
                              }
                            }
                            ((hl) (Object) stackIn_192_0).a(stackIn_192_1, stackIn_192_2 != 0, param3);
                            this.a(-116, param4, param0, ((uh) this).field_s);
                            break L3;
                          }
                        }
                        ((uh) this).field_x = -param1;
                        return;
                      } else {
                        L5: {
                          ((uh) this).field_t = param3;
                          if (param3 == null) {
                            break L5;
                          } else {
                            L6: {
                              stackOut_183_0 = ((uh) this).field_s;
                              stackOut_183_1 = 46;
                              stackIn_185_0 = stackOut_183_0;
                              stackIn_185_1 = stackOut_183_1;
                              stackIn_184_0 = stackOut_183_0;
                              stackIn_184_1 = stackOut_183_1;
                              if (param2) {
                                stackOut_185_0 = (hl) (Object) stackIn_185_0;
                                stackOut_185_1 = stackIn_185_1;
                                stackOut_185_2 = 0;
                                stackIn_186_0 = stackOut_185_0;
                                stackIn_186_1 = stackOut_185_1;
                                stackIn_186_2 = stackOut_185_2;
                                break L6;
                              } else {
                                stackOut_184_0 = (hl) (Object) stackIn_184_0;
                                stackOut_184_1 = stackIn_184_1;
                                stackOut_184_2 = 1;
                                stackIn_186_0 = stackOut_184_0;
                                stackIn_186_1 = stackOut_184_1;
                                stackIn_186_2 = stackOut_184_2;
                                break L6;
                              }
                            }
                            ((hl) (Object) stackIn_186_0).a(stackIn_186_1, stackIn_186_2 != 0, param3);
                            this.a(-116, param4, param0, ((uh) this).field_s);
                            break L5;
                          }
                        }
                        ((uh) this).field_x = -param1;
                        return;
                      }
                    } else {
                      L7: {
                        if (null != ((uh) this).field_B) {
                          ((uh) this).field_A.d(false);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        ((uh) this).field_B = param3;
                        if (param3 == null) {
                          break L8;
                        } else {
                          L9: {
                            stackOut_176_0 = ((uh) this).field_A;
                            stackOut_176_1 = 27;
                            stackIn_178_0 = stackOut_176_0;
                            stackIn_178_1 = stackOut_176_1;
                            stackIn_177_0 = stackOut_176_0;
                            stackIn_177_1 = stackOut_176_1;
                            if (param2) {
                              stackOut_178_0 = (hl) (Object) stackIn_178_0;
                              stackOut_178_1 = stackIn_178_1;
                              stackOut_178_2 = 0;
                              stackIn_179_0 = stackOut_178_0;
                              stackIn_179_1 = stackOut_178_1;
                              stackIn_179_2 = stackOut_178_2;
                              break L9;
                            } else {
                              stackOut_177_0 = (hl) (Object) stackIn_177_0;
                              stackOut_177_1 = stackIn_177_1;
                              stackOut_177_2 = 1;
                              stackIn_179_0 = stackOut_177_0;
                              stackIn_179_1 = stackOut_177_1;
                              stackIn_179_2 = stackOut_177_2;
                              break L9;
                            }
                          }
                          ((hl) (Object) stackIn_179_0).a(stackIn_179_1, stackIn_179_2 != 0, param3);
                          this.a(-124, param4, param0, ((uh) this).field_A);
                          break L8;
                        }
                      }
                      ((uh) this).field_x = param1;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (null != ((uh) this).field_t) {
                    L10: {
                      if (524288 <= ((uh) this).field_w) {
                        stackOut_141_0 = 0;
                        stackIn_142_0 = stackOut_141_0;
                        break L10;
                      } else {
                        stackOut_140_0 = 1;
                        stackIn_142_0 = stackOut_140_0;
                        break L10;
                      }
                    }
                    var7 = stackIn_142_0;
                    if (param5 >= 89) {
                      if (var7 == 0) {
                        if (((uh) this).field_t != null) {
                          L11: {
                            ((uh) this).field_s.d(false);
                            ((uh) this).field_t = param3;
                            if (param3 == null) {
                              break L11;
                            } else {
                              L12: {
                                stackOut_162_0 = ((uh) this).field_s;
                                stackOut_162_1 = 46;
                                stackIn_164_0 = stackOut_162_0;
                                stackIn_164_1 = stackOut_162_1;
                                stackIn_163_0 = stackOut_162_0;
                                stackIn_163_1 = stackOut_162_1;
                                if (param2) {
                                  stackOut_164_0 = (hl) (Object) stackIn_164_0;
                                  stackOut_164_1 = stackIn_164_1;
                                  stackOut_164_2 = 0;
                                  stackIn_165_0 = stackOut_164_0;
                                  stackIn_165_1 = stackOut_164_1;
                                  stackIn_165_2 = stackOut_164_2;
                                  break L12;
                                } else {
                                  stackOut_163_0 = (hl) (Object) stackIn_163_0;
                                  stackOut_163_1 = stackIn_163_1;
                                  stackOut_163_2 = 1;
                                  stackIn_165_0 = stackOut_163_0;
                                  stackIn_165_1 = stackOut_163_1;
                                  stackIn_165_2 = stackOut_163_2;
                                  break L12;
                                }
                              }
                              ((hl) (Object) stackIn_165_0).a(stackIn_165_1, stackIn_165_2 != 0, param3);
                              this.a(-116, param4, param0, ((uh) this).field_s);
                              break L11;
                            }
                          }
                          ((uh) this).field_x = -param1;
                          return;
                        } else {
                          L13: {
                            ((uh) this).field_t = param3;
                            if (param3 == null) {
                              break L13;
                            } else {
                              L14: {
                                stackOut_156_0 = ((uh) this).field_s;
                                stackOut_156_1 = 46;
                                stackIn_158_0 = stackOut_156_0;
                                stackIn_158_1 = stackOut_156_1;
                                stackIn_157_0 = stackOut_156_0;
                                stackIn_157_1 = stackOut_156_1;
                                if (param2) {
                                  stackOut_158_0 = (hl) (Object) stackIn_158_0;
                                  stackOut_158_1 = stackIn_158_1;
                                  stackOut_158_2 = 0;
                                  stackIn_159_0 = stackOut_158_0;
                                  stackIn_159_1 = stackOut_158_1;
                                  stackIn_159_2 = stackOut_158_2;
                                  break L14;
                                } else {
                                  stackOut_157_0 = (hl) (Object) stackIn_157_0;
                                  stackOut_157_1 = stackIn_157_1;
                                  stackOut_157_2 = 1;
                                  stackIn_159_0 = stackOut_157_0;
                                  stackIn_159_1 = stackOut_157_1;
                                  stackIn_159_2 = stackOut_157_2;
                                  break L14;
                                }
                              }
                              ((hl) (Object) stackIn_159_0).a(stackIn_159_1, stackIn_159_2 != 0, param3);
                              this.a(-116, param4, param0, ((uh) this).field_s);
                              break L13;
                            }
                          }
                          ((uh) this).field_x = -param1;
                          return;
                        }
                      } else {
                        L15: {
                          if (null != ((uh) this).field_B) {
                            ((uh) this).field_A.d(false);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          ((uh) this).field_B = param3;
                          if (param3 == null) {
                            break L16;
                          } else {
                            L17: {
                              stackOut_149_0 = ((uh) this).field_A;
                              stackOut_149_1 = 27;
                              stackIn_151_0 = stackOut_149_0;
                              stackIn_151_1 = stackOut_149_1;
                              stackIn_150_0 = stackOut_149_0;
                              stackIn_150_1 = stackOut_149_1;
                              if (param2) {
                                stackOut_151_0 = (hl) (Object) stackIn_151_0;
                                stackOut_151_1 = stackIn_151_1;
                                stackOut_151_2 = 0;
                                stackIn_152_0 = stackOut_151_0;
                                stackIn_152_1 = stackOut_151_1;
                                stackIn_152_2 = stackOut_151_2;
                                break L17;
                              } else {
                                stackOut_150_0 = (hl) (Object) stackIn_150_0;
                                stackOut_150_1 = stackIn_150_1;
                                stackOut_150_2 = 1;
                                stackIn_152_0 = stackOut_150_0;
                                stackIn_152_1 = stackOut_150_1;
                                stackIn_152_2 = stackOut_150_2;
                                break L17;
                              }
                            }
                            ((hl) (Object) stackIn_152_0).a(stackIn_152_1, stackIn_152_2 != 0, param3);
                            this.a(-124, param4, param0, ((uh) this).field_A);
                            break L16;
                          }
                        }
                        ((uh) this).field_x = param1;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    var7 = 0;
                    if (param5 >= 89) {
                      if (var7 == 0) {
                        if (((uh) this).field_t != null) {
                          L18: {
                            ((uh) this).field_s.d(false);
                            ((uh) this).field_t = param3;
                            if (param3 == null) {
                              break L18;
                            } else {
                              L19: {
                                stackOut_132_0 = ((uh) this).field_s;
                                stackOut_132_1 = 46;
                                stackIn_134_0 = stackOut_132_0;
                                stackIn_134_1 = stackOut_132_1;
                                stackIn_133_0 = stackOut_132_0;
                                stackIn_133_1 = stackOut_132_1;
                                if (param2) {
                                  stackOut_134_0 = (hl) (Object) stackIn_134_0;
                                  stackOut_134_1 = stackIn_134_1;
                                  stackOut_134_2 = 0;
                                  stackIn_135_0 = stackOut_134_0;
                                  stackIn_135_1 = stackOut_134_1;
                                  stackIn_135_2 = stackOut_134_2;
                                  break L19;
                                } else {
                                  stackOut_133_0 = (hl) (Object) stackIn_133_0;
                                  stackOut_133_1 = stackIn_133_1;
                                  stackOut_133_2 = 1;
                                  stackIn_135_0 = stackOut_133_0;
                                  stackIn_135_1 = stackOut_133_1;
                                  stackIn_135_2 = stackOut_133_2;
                                  break L19;
                                }
                              }
                              ((hl) (Object) stackIn_135_0).a(stackIn_135_1, stackIn_135_2 != 0, param3);
                              this.a(-116, param4, param0, ((uh) this).field_s);
                              break L18;
                            }
                          }
                          ((uh) this).field_x = -param1;
                          return;
                        } else {
                          L20: {
                            ((uh) this).field_t = param3;
                            if (param3 == null) {
                              break L20;
                            } else {
                              L21: {
                                stackOut_126_0 = ((uh) this).field_s;
                                stackOut_126_1 = 46;
                                stackIn_128_0 = stackOut_126_0;
                                stackIn_128_1 = stackOut_126_1;
                                stackIn_127_0 = stackOut_126_0;
                                stackIn_127_1 = stackOut_126_1;
                                if (param2) {
                                  stackOut_128_0 = (hl) (Object) stackIn_128_0;
                                  stackOut_128_1 = stackIn_128_1;
                                  stackOut_128_2 = 0;
                                  stackIn_129_0 = stackOut_128_0;
                                  stackIn_129_1 = stackOut_128_1;
                                  stackIn_129_2 = stackOut_128_2;
                                  break L21;
                                } else {
                                  stackOut_127_0 = (hl) (Object) stackIn_127_0;
                                  stackOut_127_1 = stackIn_127_1;
                                  stackOut_127_2 = 1;
                                  stackIn_129_0 = stackOut_127_0;
                                  stackIn_129_1 = stackOut_127_1;
                                  stackIn_129_2 = stackOut_127_2;
                                  break L21;
                                }
                              }
                              ((hl) (Object) stackIn_129_0).a(stackIn_129_1, stackIn_129_2 != 0, param3);
                              this.a(-116, param4, param0, ((uh) this).field_s);
                              break L20;
                            }
                          }
                          ((uh) this).field_x = -param1;
                          return;
                        }
                      } else {
                        L22: {
                          if (null != ((uh) this).field_B) {
                            ((uh) this).field_A.d(false);
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        L23: {
                          ((uh) this).field_B = param3;
                          if (param3 == null) {
                            break L23;
                          } else {
                            L24: {
                              stackOut_119_0 = ((uh) this).field_A;
                              stackOut_119_1 = 27;
                              stackIn_121_0 = stackOut_119_0;
                              stackIn_121_1 = stackOut_119_1;
                              stackIn_120_0 = stackOut_119_0;
                              stackIn_120_1 = stackOut_119_1;
                              if (param2) {
                                stackOut_121_0 = (hl) (Object) stackIn_121_0;
                                stackOut_121_1 = stackIn_121_1;
                                stackOut_121_2 = 0;
                                stackIn_122_0 = stackOut_121_0;
                                stackIn_122_1 = stackOut_121_1;
                                stackIn_122_2 = stackOut_121_2;
                                break L24;
                              } else {
                                stackOut_120_0 = (hl) (Object) stackIn_120_0;
                                stackOut_120_1 = stackIn_120_1;
                                stackOut_120_2 = 1;
                                stackIn_122_0 = stackOut_120_0;
                                stackIn_122_1 = stackOut_120_1;
                                stackIn_122_2 = stackOut_120_2;
                                break L24;
                              }
                            }
                            ((hl) (Object) stackIn_122_0).a(stackIn_122_1, stackIn_122_2 != 0, param3);
                            this.a(-124, param4, param0, ((uh) this).field_A);
                            break L23;
                          }
                        }
                        ((uh) this).field_x = param1;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                ((uh) this).field_x = -param1;
                this.a(-92, param4, param0, ((uh) this).field_s);
                return;
              }
            } else {
              ((uh) this).field_x = param1;
              this.a(-89, param4, param0, ((uh) this).field_A);
              return;
            }
          }
        } else {
          L25: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param2) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L25;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L25;
            }
          }
          ((uh) this).field_p = stackIn_4_1 != 0;
          if (((uh) this).field_B != param3) {
            if (((uh) this).field_t != param3) {
              if (null == ((uh) this).field_B) {
                var7 = 1;
                if (param5 >= 89) {
                  if (var7 == 0) {
                    if (((uh) this).field_t != null) {
                      L26: {
                        ((uh) this).field_s.d(false);
                        ((uh) this).field_t = param3;
                        if (param3 == null) {
                          break L26;
                        } else {
                          L27: {
                            stackOut_77_0 = ((uh) this).field_s;
                            stackOut_77_1 = 46;
                            stackIn_79_0 = stackOut_77_0;
                            stackIn_79_1 = stackOut_77_1;
                            stackIn_78_0 = stackOut_77_0;
                            stackIn_78_1 = stackOut_77_1;
                            if (param2) {
                              stackOut_79_0 = (hl) (Object) stackIn_79_0;
                              stackOut_79_1 = stackIn_79_1;
                              stackOut_79_2 = 0;
                              stackIn_80_0 = stackOut_79_0;
                              stackIn_80_1 = stackOut_79_1;
                              stackIn_80_2 = stackOut_79_2;
                              break L27;
                            } else {
                              stackOut_78_0 = (hl) (Object) stackIn_78_0;
                              stackOut_78_1 = stackIn_78_1;
                              stackOut_78_2 = 1;
                              stackIn_80_0 = stackOut_78_0;
                              stackIn_80_1 = stackOut_78_1;
                              stackIn_80_2 = stackOut_78_2;
                              break L27;
                            }
                          }
                          ((hl) (Object) stackIn_80_0).a(stackIn_80_1, stackIn_80_2 != 0, param3);
                          this.a(-116, param4, param0, ((uh) this).field_s);
                          break L26;
                        }
                      }
                      ((uh) this).field_x = -param1;
                      return;
                    } else {
                      L28: {
                        ((uh) this).field_t = param3;
                        if (param3 == null) {
                          break L28;
                        } else {
                          L29: {
                            stackOut_71_0 = ((uh) this).field_s;
                            stackOut_71_1 = 46;
                            stackIn_73_0 = stackOut_71_0;
                            stackIn_73_1 = stackOut_71_1;
                            stackIn_72_0 = stackOut_71_0;
                            stackIn_72_1 = stackOut_71_1;
                            if (param2) {
                              stackOut_73_0 = (hl) (Object) stackIn_73_0;
                              stackOut_73_1 = stackIn_73_1;
                              stackOut_73_2 = 0;
                              stackIn_74_0 = stackOut_73_0;
                              stackIn_74_1 = stackOut_73_1;
                              stackIn_74_2 = stackOut_73_2;
                              break L29;
                            } else {
                              stackOut_72_0 = (hl) (Object) stackIn_72_0;
                              stackOut_72_1 = stackIn_72_1;
                              stackOut_72_2 = 1;
                              stackIn_74_0 = stackOut_72_0;
                              stackIn_74_1 = stackOut_72_1;
                              stackIn_74_2 = stackOut_72_2;
                              break L29;
                            }
                          }
                          ((hl) (Object) stackIn_74_0).a(stackIn_74_1, stackIn_74_2 != 0, param3);
                          this.a(-116, param4, param0, ((uh) this).field_s);
                          break L28;
                        }
                      }
                      ((uh) this).field_x = -param1;
                      return;
                    }
                  } else {
                    L30: {
                      if (null != ((uh) this).field_B) {
                        ((uh) this).field_A.d(false);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      ((uh) this).field_B = param3;
                      if (param3 == null) {
                        break L31;
                      } else {
                        L32: {
                          stackOut_64_0 = ((uh) this).field_A;
                          stackOut_64_1 = 27;
                          stackIn_66_0 = stackOut_64_0;
                          stackIn_66_1 = stackOut_64_1;
                          stackIn_65_0 = stackOut_64_0;
                          stackIn_65_1 = stackOut_64_1;
                          if (param2) {
                            stackOut_66_0 = (hl) (Object) stackIn_66_0;
                            stackOut_66_1 = stackIn_66_1;
                            stackOut_66_2 = 0;
                            stackIn_67_0 = stackOut_66_0;
                            stackIn_67_1 = stackOut_66_1;
                            stackIn_67_2 = stackOut_66_2;
                            break L32;
                          } else {
                            stackOut_65_0 = (hl) (Object) stackIn_65_0;
                            stackOut_65_1 = stackIn_65_1;
                            stackOut_65_2 = 1;
                            stackIn_67_0 = stackOut_65_0;
                            stackIn_67_1 = stackOut_65_1;
                            stackIn_67_2 = stackOut_65_2;
                            break L32;
                          }
                        }
                        ((hl) (Object) stackIn_67_0).a(stackIn_67_1, stackIn_67_2 != 0, param3);
                        this.a(-124, param4, param0, ((uh) this).field_A);
                        break L31;
                      }
                    }
                    ((uh) this).field_x = param1;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (null != ((uh) this).field_t) {
                  L33: {
                    if (524288 <= ((uh) this).field_w) {
                      stackOut_34_0 = 0;
                      stackIn_35_0 = stackOut_34_0;
                      break L33;
                    } else {
                      stackOut_33_0 = 1;
                      stackIn_35_0 = stackOut_33_0;
                      break L33;
                    }
                  }
                  var7 = stackIn_35_0;
                  if (param5 < 89) {
                    return;
                  } else {
                    L34: {
                      if (var7 == 0) {
                        L35: {
                          if (((uh) this).field_t == null) {
                            break L35;
                          } else {
                            ((uh) this).field_s.d(false);
                            break L35;
                          }
                        }
                        L36: {
                          ((uh) this).field_t = param3;
                          if (param3 == null) {
                            break L36;
                          } else {
                            L37: {
                              stackOut_49_0 = ((uh) this).field_s;
                              stackOut_49_1 = 46;
                              stackIn_51_0 = stackOut_49_0;
                              stackIn_51_1 = stackOut_49_1;
                              stackIn_50_0 = stackOut_49_0;
                              stackIn_50_1 = stackOut_49_1;
                              if (param2) {
                                stackOut_51_0 = (hl) (Object) stackIn_51_0;
                                stackOut_51_1 = stackIn_51_1;
                                stackOut_51_2 = 0;
                                stackIn_52_0 = stackOut_51_0;
                                stackIn_52_1 = stackOut_51_1;
                                stackIn_52_2 = stackOut_51_2;
                                break L37;
                              } else {
                                stackOut_50_0 = (hl) (Object) stackIn_50_0;
                                stackOut_50_1 = stackIn_50_1;
                                stackOut_50_2 = 1;
                                stackIn_52_0 = stackOut_50_0;
                                stackIn_52_1 = stackOut_50_1;
                                stackIn_52_2 = stackOut_50_2;
                                break L37;
                              }
                            }
                            ((hl) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2 != 0, param3);
                            this.a(-116, param4, param0, ((uh) this).field_s);
                            break L36;
                          }
                        }
                        ((uh) this).field_x = -param1;
                        break L34;
                      } else {
                        L38: {
                          if (null != ((uh) this).field_B) {
                            ((uh) this).field_A.d(false);
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        L39: {
                          ((uh) this).field_B = param3;
                          if (param3 == null) {
                            break L39;
                          } else {
                            L40: {
                              stackOut_41_0 = ((uh) this).field_A;
                              stackOut_41_1 = 27;
                              stackIn_43_0 = stackOut_41_0;
                              stackIn_43_1 = stackOut_41_1;
                              stackIn_42_0 = stackOut_41_0;
                              stackIn_42_1 = stackOut_41_1;
                              if (param2) {
                                stackOut_43_0 = (hl) (Object) stackIn_43_0;
                                stackOut_43_1 = stackIn_43_1;
                                stackOut_43_2 = 0;
                                stackIn_44_0 = stackOut_43_0;
                                stackIn_44_1 = stackOut_43_1;
                                stackIn_44_2 = stackOut_43_2;
                                break L40;
                              } else {
                                stackOut_42_0 = (hl) (Object) stackIn_42_0;
                                stackOut_42_1 = stackIn_42_1;
                                stackOut_42_2 = 1;
                                stackIn_44_0 = stackOut_42_0;
                                stackIn_44_1 = stackOut_42_1;
                                stackIn_44_2 = stackOut_42_2;
                                break L40;
                              }
                            }
                            ((hl) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_44_2 != 0, param3);
                            this.a(-124, param4, param0, ((uh) this).field_A);
                            break L39;
                          }
                        }
                        ((uh) this).field_x = param1;
                        break L34;
                      }
                    }
                    return;
                  }
                } else {
                  var7 = 0;
                  if (param5 < 89) {
                    return;
                  } else {
                    L41: {
                      if (var7 == 0) {
                        L42: {
                          if (((uh) this).field_t == null) {
                            break L42;
                          } else {
                            ((uh) this).field_s.d(false);
                            break L42;
                          }
                        }
                        L43: {
                          ((uh) this).field_t = param3;
                          if (param3 == null) {
                            break L43;
                          } else {
                            L44: {
                              stackOut_24_0 = ((uh) this).field_s;
                              stackOut_24_1 = 46;
                              stackIn_26_0 = stackOut_24_0;
                              stackIn_26_1 = stackOut_24_1;
                              stackIn_25_0 = stackOut_24_0;
                              stackIn_25_1 = stackOut_24_1;
                              if (param2) {
                                stackOut_26_0 = (hl) (Object) stackIn_26_0;
                                stackOut_26_1 = stackIn_26_1;
                                stackOut_26_2 = 0;
                                stackIn_27_0 = stackOut_26_0;
                                stackIn_27_1 = stackOut_26_1;
                                stackIn_27_2 = stackOut_26_2;
                                break L44;
                              } else {
                                stackOut_25_0 = (hl) (Object) stackIn_25_0;
                                stackOut_25_1 = stackIn_25_1;
                                stackOut_25_2 = 1;
                                stackIn_27_0 = stackOut_25_0;
                                stackIn_27_1 = stackOut_25_1;
                                stackIn_27_2 = stackOut_25_2;
                                break L44;
                              }
                            }
                            ((hl) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2 != 0, param3);
                            this.a(-116, param4, param0, ((uh) this).field_s);
                            break L43;
                          }
                        }
                        ((uh) this).field_x = -param1;
                        break L41;
                      } else {
                        L45: {
                          if (null != ((uh) this).field_B) {
                            ((uh) this).field_A.d(false);
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        L46: {
                          ((uh) this).field_B = param3;
                          if (param3 == null) {
                            break L46;
                          } else {
                            L47: {
                              stackOut_16_0 = ((uh) this).field_A;
                              stackOut_16_1 = 27;
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_18_1 = stackOut_16_1;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              if (param2) {
                                stackOut_18_0 = (hl) (Object) stackIn_18_0;
                                stackOut_18_1 = stackIn_18_1;
                                stackOut_18_2 = 0;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                stackIn_19_2 = stackOut_18_2;
                                break L47;
                              } else {
                                stackOut_17_0 = (hl) (Object) stackIn_17_0;
                                stackOut_17_1 = stackIn_17_1;
                                stackOut_17_2 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_19_1 = stackOut_17_1;
                                stackIn_19_2 = stackOut_17_2;
                                break L47;
                              }
                            }
                            ((hl) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2 != 0, param3);
                            this.a(-124, param4, param0, ((uh) this).field_A);
                            break L46;
                          }
                        }
                        ((uh) this).field_x = param1;
                        break L41;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              ((uh) this).field_x = -param1;
              this.a(-92, param4, param0, ((uh) this).field_s);
              return;
            }
          } else {
            ((uh) this).field_x = param1;
            this.a(-89, param4, param0, ((uh) this).field_A);
            return;
          }
        }
    }

    final lk b() {
        return null;
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 <= 113) {
          var2 = null;
          uh.a((sj) null, (byte) 38, -34);
          field_l = null;
          field_C = null;
          field_n = null;
          field_v = null;
          return;
        } else {
          field_l = null;
          field_C = null;
          field_n = null;
          field_v = null;
          return;
        }
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
        if (param2 >= -47) {
            return null;
        }
        if (!nb.a(param1, param3, (byte) 127, param0)) {
            return null;
        }
        return eb.a((byte) 27);
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_189_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        if ((((uh) this).field_u ^ -1) < -1) {
          L0: {
            if (!((uh) this).field_p) {
              break L0;
            } else {
              L1: {
                if (0 >= ((uh) this).field_x) {
                  break L1;
                } else {
                  if (((uh) this).field_A.a((byte) -32)) {
                    break L1;
                  } else {
                    ((uh) this).field_x = -((uh) this).field_x;
                    ((uh) this).field_p = false;
                    ((uh) this).field_B = null;
                    break L0;
                  }
                }
              }
              if (((uh) this).field_x >= 0) {
                break L0;
              } else {
                if (!((uh) this).field_s.a((byte) -32)) {
                  ((uh) this).field_p = false;
                  ((uh) this).field_t = null;
                  ((uh) this).field_x = -((uh) this).field_x;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            var4 = (((uh) this).field_w >> -170141204) * ((uh) this).field_u / 256;
            var5 = -var4 + ((uh) this).field_u;
            if (0 != ((uh) this).field_x) {
              ((uh) this).field_w = ((uh) this).field_w + param2 * ((uh) this).field_x;
              if (((uh) this).field_w >= 1048576) {
                ((uh) this).field_w = 1048576;
                if (((uh) this).field_p) {
                  break L2;
                } else {
                  ((uh) this).field_x = 0;
                  if (!((uh) this).field_o) {
                    if (null == ((uh) this).field_t) {
                      ((uh) this).field_t = null;
                      break L2;
                    } else {
                      ((uh) this).field_s.d(false);
                      ((uh) this).field_t = null;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              } else {
                if (0 < ((uh) this).field_w) {
                  break L2;
                } else {
                  ((uh) this).field_w = 0;
                  if (!((uh) this).field_p) {
                    ((uh) this).field_x = 0;
                    if (((uh) this).field_o) {
                      break L2;
                    } else {
                      L3: {
                        if (((uh) this).field_B == null) {
                          break L3;
                        } else {
                          ((uh) this).field_A.d(false);
                          break L3;
                        }
                      }
                      ((uh) this).field_B = null;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (!b.field_j) {
              stackOut_29_0 = param2;
              stackIn_30_0 = stackOut_29_0;
              break L4;
            } else {
              stackOut_28_0 = param2 << 958621377;
              stackIn_30_0 = stackOut_28_0;
              break L4;
            }
          }
          var6 = stackIn_30_0;
          if (-257 < ((uh) this).field_q) {
            L5: {
              if (null != ((uh) this).field_B) {
                break L5;
              } else {
                if (((uh) this).field_t != null) {
                  break L5;
                } else {
                  if (((uh) this).field_m != null) {
                    if (-1 != (((uh) this).field_q ^ -1)) {
                      if (((uh) this).field_y != null) {
                        if (((uh) this).field_y.length >= var6) {
                          L6: {
                            o.a(((uh) this).field_y, 0, var6);
                            ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                            if (b.field_j) {
                              param1 = param1 << 1;
                              stackOut_83_0 = param1 << 1;
                              stackIn_84_0 = stackOut_83_0;
                              break L6;
                            } else {
                              stackOut_82_0 = param1;
                              stackIn_84_0 = stackOut_82_0;
                              break L6;
                            }
                          }
                          var7 = stackIn_84_0;
                          var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                          var9 = ((uh) this).field_u + -var8;
                          var10 = 0;
                          L7: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                              var10++;
                              continue L7;
                            }
                          }
                        } else {
                          L8: {
                            ((uh) this).field_r = new int[var6];
                            ((uh) this).field_y = new int[var6];
                            ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                            if (b.field_j) {
                              param1 = param1 << 1;
                              stackOut_76_0 = param1 << 1;
                              stackIn_77_0 = stackOut_76_0;
                              break L8;
                            } else {
                              stackOut_75_0 = param1;
                              stackIn_77_0 = stackOut_75_0;
                              break L8;
                            }
                          }
                          var7 = stackIn_77_0;
                          var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                          var9 = ((uh) this).field_u + -var8;
                          var10 = 0;
                          L9: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                              var10++;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        L10: {
                          ((uh) this).field_r = new int[var6];
                          ((uh) this).field_y = new int[var6];
                          ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                          if (b.field_j) {
                            param1 = param1 << 1;
                            stackOut_68_0 = param1 << 1;
                            stackIn_69_0 = stackOut_68_0;
                            break L10;
                          } else {
                            stackOut_67_0 = param1;
                            stackIn_69_0 = stackOut_67_0;
                            break L10;
                          }
                        }
                        var7 = stackIn_69_0;
                        var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                        var9 = ((uh) this).field_u + -var8;
                        var10 = 0;
                        L11: while (true) {
                          if (var6 <= var10) {
                            return;
                          } else {
                            param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                            var10++;
                            continue L11;
                          }
                        }
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
            if (-257 != var4) {
              if (var5 != 256) {
                if (null != ((uh) this).field_y) {
                  if (((uh) this).field_y.length >= var6) {
                    L12: {
                      o.a(((uh) this).field_y, 0, var6);
                      o.a(((uh) this).field_r, 0, var6);
                      ((uh) this).field_A.b(((uh) this).field_y, 0, param2);
                      ((uh) this).field_s.b(((uh) this).field_r, 0, param2);
                      if (!b.field_j) {
                        stackOut_161_0 = param1;
                        stackIn_162_0 = stackOut_161_0;
                        break L12;
                      } else {
                        param1 = param1 << 1;
                        stackOut_160_0 = param1 << 1;
                        stackIn_162_0 = stackOut_160_0;
                        break L12;
                      }
                    }
                    var7 = stackIn_162_0;
                    var8 = 0;
                    L13: while (true) {
                      if (var6 <= var8) {
                        if (((uh) this).field_m != null) {
                          if (-1 != (((uh) this).field_q ^ -1)) {
                            if (((uh) this).field_y != null) {
                              if (((uh) this).field_y.length < var6) {
                                L14: {
                                  ((uh) this).field_r = new int[var6];
                                  ((uh) this).field_y = new int[var6];
                                  ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                                  if (b.field_j) {
                                    param1 = param1 << 1;
                                    stackOut_188_0 = param1 << 1;
                                    stackIn_189_0 = stackOut_188_0;
                                    break L14;
                                  } else {
                                    stackOut_187_0 = param1;
                                    stackIn_189_0 = stackOut_187_0;
                                    break L14;
                                  }
                                }
                                var7 = stackIn_189_0;
                                var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                                var9 = ((uh) this).field_u + -var8;
                                var10 = 0;
                                L15: while (true) {
                                  if (var6 <= var10) {
                                    return;
                                  } else {
                                    param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                                    var10++;
                                    continue L15;
                                  }
                                }
                              } else {
                                L16: {
                                  o.a(((uh) this).field_y, 0, var6);
                                  ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                                  if (b.field_j) {
                                    param1 = param1 << 1;
                                    stackOut_180_0 = param1 << 1;
                                    stackIn_181_0 = stackOut_180_0;
                                    break L16;
                                  } else {
                                    stackOut_179_0 = param1;
                                    stackIn_181_0 = stackOut_179_0;
                                    break L16;
                                  }
                                }
                                var7 = stackIn_181_0;
                                var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                                var9 = ((uh) this).field_u + -var8;
                                var10 = 0;
                                L17: while (true) {
                                  if (var6 <= var10) {
                                    return;
                                  } else {
                                    param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                                    var10++;
                                    continue L17;
                                  }
                                }
                              }
                            } else {
                              L18: {
                                ((uh) this).field_r = new int[var6];
                                ((uh) this).field_y = new int[var6];
                                ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                                if (b.field_j) {
                                  param1 = param1 << 1;
                                  stackOut_172_0 = param1 << 1;
                                  stackIn_173_0 = stackOut_172_0;
                                  break L18;
                                } else {
                                  stackOut_171_0 = param1;
                                  stackIn_173_0 = stackOut_171_0;
                                  break L18;
                                }
                              }
                              var7 = stackIn_173_0;
                              var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                              var9 = ((uh) this).field_u + -var8;
                              var10 = 0;
                              L19: while (true) {
                                if (var6 <= var10) {
                                  return;
                                } else {
                                  param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                                  var10++;
                                  continue L19;
                                }
                              }
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        param0[var7 + var8] = param0[var7 + var8] + (((uh) this).field_r[var8] * var5 + var4 * ((uh) this).field_y[var8] >> -534517816);
                        var8++;
                        continue L13;
                      }
                    }
                  } else {
                    L20: {
                      ((uh) this).field_r = new int[var6];
                      ((uh) this).field_y = new int[var6];
                      ((uh) this).field_A.b(((uh) this).field_y, 0, param2);
                      ((uh) this).field_s.b(((uh) this).field_r, 0, param2);
                      if (!b.field_j) {
                        stackOut_141_0 = param1;
                        stackIn_142_0 = stackOut_141_0;
                        break L20;
                      } else {
                        param1 = param1 << 1;
                        stackOut_140_0 = param1 << 1;
                        stackIn_142_0 = stackOut_140_0;
                        break L20;
                      }
                    }
                    var7 = stackIn_142_0;
                    var8 = 0;
                    L21: while (true) {
                      if (var6 <= var8) {
                        L22: {
                          if (((uh) this).field_m == null) {
                            break L22;
                          } else {
                            if (-1 == (((uh) this).field_q ^ -1)) {
                              break L22;
                            } else {
                              L23: {
                                L24: {
                                  if (((uh) this).field_y == null) {
                                    break L24;
                                  } else {
                                    if (((uh) this).field_y.length < var6) {
                                      break L24;
                                    } else {
                                      o.a(((uh) this).field_y, 0, var6);
                                      break L23;
                                    }
                                  }
                                }
                                ((uh) this).field_r = new int[var6];
                                ((uh) this).field_y = new int[var6];
                                break L23;
                              }
                              L25: {
                                ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                                if (b.field_j) {
                                  param1 = param1 << 1;
                                  stackOut_153_0 = param1 << 1;
                                  stackIn_154_0 = stackOut_153_0;
                                  break L25;
                                } else {
                                  stackOut_152_0 = param1;
                                  stackIn_154_0 = stackOut_152_0;
                                  break L25;
                                }
                              }
                              var7 = stackIn_154_0;
                              var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                              var9 = ((uh) this).field_u + -var8;
                              var10 = 0;
                              L26: while (true) {
                                if (var6 <= var10) {
                                  break L22;
                                } else {
                                  param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                                  var10++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        param0[var7 + var8] = param0[var7 + var8] + (((uh) this).field_r[var8] * var5 + var4 * ((uh) this).field_y[var8] >> -534517816);
                        var8++;
                        continue L21;
                      }
                    }
                  }
                } else {
                  L27: {
                    ((uh) this).field_r = new int[var6];
                    ((uh) this).field_y = new int[var6];
                    ((uh) this).field_A.b(((uh) this).field_y, 0, param2);
                    ((uh) this).field_s.b(((uh) this).field_r, 0, param2);
                    if (!b.field_j) {
                      stackOut_120_0 = param1;
                      stackIn_121_0 = stackOut_120_0;
                      break L27;
                    } else {
                      param1 = param1 << 1;
                      stackOut_119_0 = param1 << 1;
                      stackIn_121_0 = stackOut_119_0;
                      break L27;
                    }
                  }
                  var7 = stackIn_121_0;
                  var8 = 0;
                  L28: while (true) {
                    if (var6 <= var8) {
                      L29: {
                        if (((uh) this).field_m == null) {
                          break L29;
                        } else {
                          if (-1 == (((uh) this).field_q ^ -1)) {
                            break L29;
                          } else {
                            L30: {
                              L31: {
                                if (((uh) this).field_y == null) {
                                  break L31;
                                } else {
                                  if (((uh) this).field_y.length < var6) {
                                    break L31;
                                  } else {
                                    o.a(((uh) this).field_y, 0, var6);
                                    break L30;
                                  }
                                }
                              }
                              ((uh) this).field_r = new int[var6];
                              ((uh) this).field_y = new int[var6];
                              break L30;
                            }
                            L32: {
                              ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                              if (b.field_j) {
                                param1 = param1 << 1;
                                stackOut_132_0 = param1 << 1;
                                stackIn_133_0 = stackOut_132_0;
                                break L32;
                              } else {
                                stackOut_131_0 = param1;
                                stackIn_133_0 = stackOut_131_0;
                                break L32;
                              }
                            }
                            var7 = stackIn_133_0;
                            var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                            var9 = ((uh) this).field_u + -var8;
                            var10 = 0;
                            L33: while (true) {
                              if (var6 <= var10) {
                                break L29;
                              } else {
                                param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                                var10++;
                                continue L33;
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      param0[var7 + var8] = param0[var7 + var8] + (((uh) this).field_r[var8] * var5 + var4 * ((uh) this).field_y[var8] >> -534517816);
                      var8++;
                      continue L28;
                    }
                  }
                }
              } else {
                L34: {
                  ((uh) this).field_s.b(param0, param1, param2);
                  if (((uh) this).field_m == null) {
                    break L34;
                  } else {
                    if (-1 == (((uh) this).field_q ^ -1)) {
                      break L34;
                    } else {
                      L35: {
                        L36: {
                          if (((uh) this).field_y == null) {
                            break L36;
                          } else {
                            if (((uh) this).field_y.length < var6) {
                              break L36;
                            } else {
                              o.a(((uh) this).field_y, 0, var6);
                              break L35;
                            }
                          }
                        }
                        ((uh) this).field_r = new int[var6];
                        ((uh) this).field_y = new int[var6];
                        break L35;
                      }
                      L37: {
                        ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                        if (b.field_j) {
                          param1 = param1 << 1;
                          stackOut_112_0 = param1 << 1;
                          stackIn_113_0 = stackOut_112_0;
                          break L37;
                        } else {
                          stackOut_111_0 = param1;
                          stackIn_113_0 = stackOut_111_0;
                          break L37;
                        }
                      }
                      var7 = stackIn_113_0;
                      var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                      var9 = ((uh) this).field_u + -var8;
                      var10 = 0;
                      L38: while (true) {
                        if (var6 <= var10) {
                          break L34;
                        } else {
                          param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                          var10++;
                          continue L38;
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L39: {
                ((uh) this).field_A.b(param0, param1, param2);
                if (((uh) this).field_m == null) {
                  break L39;
                } else {
                  if (-1 == ((uh) this).field_q) {
                    break L39;
                  } else {
                    L40: {
                      L41: {
                        if (((uh) this).field_y == null) {
                          break L41;
                        } else {
                          if (((uh) this).field_y.length < var6) {
                            break L41;
                          } else {
                            o.a(((uh) this).field_y, 0, var6);
                            break L40;
                          }
                        }
                      }
                      ((uh) this).field_r = new int[var6];
                      ((uh) this).field_y = new int[var6];
                      break L40;
                    }
                    L42: {
                      ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                      if (b.field_j) {
                        param1 = param1 << 1;
                        stackOut_98_0 = param1 << 1;
                        stackIn_99_0 = stackOut_98_0;
                        break L42;
                      } else {
                        stackOut_97_0 = param1;
                        stackIn_99_0 = stackOut_97_0;
                        break L42;
                      }
                    }
                    var7 = stackIn_99_0;
                    var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                    var9 = ((uh) this).field_u + -var8;
                    var10 = 0;
                    L43: while (true) {
                      if (var6 <= var10) {
                        break L39;
                      } else {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                        var10++;
                        continue L43;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            if (((uh) this).field_m != null) {
              if (-1 != ((uh) this).field_q) {
                if (((uh) this).field_y != null) {
                  if (((uh) this).field_y.length >= var6) {
                    L44: {
                      o.a(((uh) this).field_y, 0, var6);
                      ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                      if (b.field_j) {
                        param1 = param1 << 1;
                        stackOut_53_0 = param1 << 1;
                        stackIn_54_0 = stackOut_53_0;
                        break L44;
                      } else {
                        stackOut_52_0 = param1;
                        stackIn_54_0 = stackOut_52_0;
                        break L44;
                      }
                    }
                    var7 = stackIn_54_0;
                    var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                    var9 = ((uh) this).field_u + -var8;
                    var10 = 0;
                    L45: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                        var10++;
                        continue L45;
                      }
                    }
                  } else {
                    L46: {
                      ((uh) this).field_r = new int[var6];
                      ((uh) this).field_y = new int[var6];
                      ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                      if (b.field_j) {
                        param1 = param1 << 1;
                        stackOut_46_0 = param1 << 1;
                        stackIn_47_0 = stackOut_46_0;
                        break L46;
                      } else {
                        stackOut_45_0 = param1;
                        stackIn_47_0 = stackOut_45_0;
                        break L46;
                      }
                    }
                    var7 = stackIn_47_0;
                    var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                    var9 = ((uh) this).field_u + -var8;
                    var10 = 0;
                    L47: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                        var10++;
                        continue L47;
                      }
                    }
                  }
                } else {
                  L48: {
                    ((uh) this).field_r = new int[var6];
                    ((uh) this).field_y = new int[var6];
                    ((uh) this).field_z.b(((uh) this).field_y, 0, param2);
                    if (b.field_j) {
                      param1 = param1 << 1;
                      stackOut_38_0 = param1 << 1;
                      stackIn_39_0 = stackOut_38_0;
                      break L48;
                    } else {
                      stackOut_37_0 = param1;
                      stackIn_39_0 = stackOut_37_0;
                      break L48;
                    }
                  }
                  var7 = stackIn_39_0;
                  var8 = ((uh) this).field_u * ((uh) this).field_q / 256;
                  var9 = ((uh) this).field_u + -var8;
                  var10 = 0;
                  L49: while (true) {
                    if (var6 <= var10) {
                      return;
                    } else {
                      param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((uh) this).field_y[var10] * var8) >> 1607914824;
                      var10++;
                      continue L49;
                    }
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
          ((uh) this).a(param2);
          return;
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
