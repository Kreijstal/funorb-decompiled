/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private int field_i;
    nh[] field_c;
    nh field_e;
    static int[] field_b;
    static int[][] field_f;
    static int field_a;
    private int field_d;
    private boolean field_j;
    private int field_k;
    static he[] field_g;
    private int field_l;
    private int field_h;

    final static boolean a(String param0, byte param1) {
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param1 == 59) {
          if (param0 != null) {
            if (param0.length() < ni.field_t) {
              return true;
            } else {
              L0: {
                if (param0.length() > uk.field_g) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          field_g = null;
          if (param0 != null) {
            if (param0.length() >= ni.field_t) {
              if (param0.length() <= uk.field_g) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final kj a(int param0, int param1) {
        ((kj) this).field_l = param1;
        if (param0 != -4130) {
            Object var4 = null;
            ((kj) this).a((byte) 61, (kj) null);
            return (kj) this;
        }
        return (kj) this;
    }

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 14970) {
            kj.a(89);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final void a(byte param0, kj param1) {
        param1.field_h = ((kj) this).field_h;
        if (param0 != -7) {
          field_a = -35;
          param1.field_j = ((kj) this).field_j;
          param1.field_l = ((kj) this).field_l;
          param1.field_k = ((kj) this).field_k;
          param1.field_c = ((kj) this).field_c;
          param1.field_i = ((kj) this).field_i;
          param1.field_d = ((kj) this).field_d;
          param1.field_e = ((kj) this).field_e;
          return;
        } else {
          param1.field_j = ((kj) this).field_j;
          param1.field_l = ((kj) this).field_l;
          param1.field_k = ((kj) this).field_k;
          param1.field_c = ((kj) this).field_c;
          param1.field_i = ((kj) this).field_i;
          param1.field_d = ((kj) this).field_d;
          param1.field_e = ((kj) this).field_e;
          return;
        }
    }

    final kj b(int param0, int param1) {
        if (param0 != 256) {
            return null;
        }
        ((kj) this).field_h = param1;
        return (kj) this;
    }

    final kj a(nh[] param0, int param1) {
        if (param1 >= -47) {
            return null;
        }
        ((kj) this).field_c = param0;
        return (kj) this;
    }

    final kj a(byte param0, int param1) {
        ((kj) this).field_i = param1;
        if (param0 < 65) {
            return null;
        }
        return (kj) this;
    }

    final kj a(byte param0, boolean param1) {
        Object var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 <= 84) {
          L0: {
            var4 = null;
            og discarded$6 = kj.a(13, 21, (String) null);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((kj) this).field_j = stackIn_8_1 != 0;
          return (kj) this;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((kj) this).field_j = stackIn_4_1 != 0;
          return (kj) this;
        }
    }

    final void a(int param0, ch param1, boolean param2, int param3, vg param4, kj param5) {
        if (((kj) this).field_j) {
          param5.a(param1, param4, true, param3, param0);
          param5.b(0);
          if (((kj) this).field_c == null) {
            if (2147483647 == ((kj) this).field_l) {
              if (((kj) this).field_i == -2147483648) {
                L0: {
                  if ((((kj) this).field_d ^ -1) != 2147483647) {
                    param5.field_d = ((kj) this).field_d;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (((kj) this).field_e != null) {
                    param5.field_e = ((kj) this).field_e;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param2) {
                  if ((((kj) this).field_k ^ -1) > 0) {
                    if ((((kj) this).field_h ^ -1) > 0) {
                      return;
                    } else {
                      param5.field_h = ((kj) this).field_h;
                      return;
                    }
                  } else {
                    param5.field_k = ((kj) this).field_k;
                    if ((((kj) this).field_h ^ -1) > 0) {
                      return;
                    } else {
                      param5.field_h = ((kj) this).field_h;
                      return;
                    }
                  }
                } else {
                  kj.a(13);
                  if ((((kj) this).field_k ^ -1) > 0) {
                    if ((((kj) this).field_h ^ -1) > 0) {
                      return;
                    } else {
                      param5.field_h = ((kj) this).field_h;
                      return;
                    }
                  } else {
                    param5.field_k = ((kj) this).field_k;
                    if ((((kj) this).field_h ^ -1) > 0) {
                      return;
                    } else {
                      param5.field_h = ((kj) this).field_h;
                      return;
                    }
                  }
                }
              } else {
                L2: {
                  param5.field_i = ((kj) this).field_i;
                  if ((((kj) this).field_d ^ -1) != 2147483647) {
                    param5.field_d = ((kj) this).field_d;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (((kj) this).field_e != null) {
                    param5.field_e = ((kj) this).field_e;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (param2) {
                  if ((((kj) this).field_k ^ -1) > 0) {
                    if ((((kj) this).field_h ^ -1) > 0) {
                      return;
                    } else {
                      param5.field_h = ((kj) this).field_h;
                      return;
                    }
                  } else {
                    L4: {
                      param5.field_k = ((kj) this).field_k;
                      if ((((kj) this).field_h ^ -1) > 0) {
                        break L4;
                      } else {
                        param5.field_h = ((kj) this).field_h;
                        break L4;
                      }
                    }
                    return;
                  }
                } else {
                  L5: {
                    kj.a(13);
                    if ((((kj) this).field_k ^ -1) > 0) {
                      break L5;
                    } else {
                      param5.field_k = ((kj) this).field_k;
                      break L5;
                    }
                  }
                  L6: {
                    if ((((kj) this).field_h ^ -1) > 0) {
                      break L6;
                    } else {
                      param5.field_h = ((kj) this).field_h;
                      break L6;
                    }
                  }
                  return;
                }
              }
            } else {
              param5.field_l = ((kj) this).field_l;
              if (((kj) this).field_i != -2147483648) {
                L7: {
                  param5.field_i = ((kj) this).field_i;
                  if ((((kj) this).field_d ^ -1) != 2147483647) {
                    param5.field_d = ((kj) this).field_d;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (((kj) this).field_e != null) {
                    param5.field_e = ((kj) this).field_e;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (!param2) {
                  L9: {
                    kj.a(13);
                    if ((((kj) this).field_k ^ -1) > 0) {
                      break L9;
                    } else {
                      param5.field_k = ((kj) this).field_k;
                      break L9;
                    }
                  }
                  L10: {
                    if ((((kj) this).field_h ^ -1) > 0) {
                      break L10;
                    } else {
                      param5.field_h = ((kj) this).field_h;
                      break L10;
                    }
                  }
                  return;
                } else {
                  L11: {
                    if ((((kj) this).field_k ^ -1) > 0) {
                      break L11;
                    } else {
                      param5.field_k = ((kj) this).field_k;
                      break L11;
                    }
                  }
                  L12: {
                    if ((((kj) this).field_h ^ -1) > 0) {
                      break L12;
                    } else {
                      param5.field_h = ((kj) this).field_h;
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  if ((((kj) this).field_d ^ -1) != 2147483647) {
                    param5.field_d = ((kj) this).field_d;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (((kj) this).field_e != null) {
                    param5.field_e = ((kj) this).field_e;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param2) {
                    break L15;
                  } else {
                    kj.a(13);
                    break L15;
                  }
                }
                L16: {
                  if ((((kj) this).field_k ^ -1) > 0) {
                    break L16;
                  } else {
                    param5.field_k = ((kj) this).field_k;
                    break L16;
                  }
                }
                L17: {
                  if ((((kj) this).field_h ^ -1) > 0) {
                    break L17;
                  } else {
                    param5.field_h = ((kj) this).field_h;
                    break L17;
                  }
                }
                return;
              }
            }
          } else {
            param5.field_c = ((kj) this).field_c;
            if (2147483647 == (((kj) this).field_l ^ -1)) {
              L18: {
                if (((kj) this).field_i == -2147483648) {
                  break L18;
                } else {
                  param5.field_i = ((kj) this).field_i;
                  break L18;
                }
              }
              L19: {
                if ((((kj) this).field_d ^ -1) != 2147483647) {
                  param5.field_d = ((kj) this).field_d;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (((kj) this).field_e != null) {
                  param5.field_e = ((kj) this).field_e;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (param2) {
                  break L21;
                } else {
                  kj.a(13);
                  break L21;
                }
              }
              L22: {
                if ((((kj) this).field_k ^ -1) > 0) {
                  break L22;
                } else {
                  param5.field_k = ((kj) this).field_k;
                  break L22;
                }
              }
              L23: {
                if ((((kj) this).field_h ^ -1) > 0) {
                  break L23;
                } else {
                  param5.field_h = ((kj) this).field_h;
                  break L23;
                }
              }
              return;
            } else {
              L24: {
                param5.field_l = ((kj) this).field_l;
                if (((kj) this).field_i == -2147483648) {
                  break L24;
                } else {
                  param5.field_i = ((kj) this).field_i;
                  break L24;
                }
              }
              L25: {
                if ((((kj) this).field_d ^ -1) != 2147483647) {
                  param5.field_d = ((kj) this).field_d;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (((kj) this).field_e != null) {
                  param5.field_e = ((kj) this).field_e;
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                if (param2) {
                  break L27;
                } else {
                  kj.a(13);
                  break L27;
                }
              }
              L28: {
                if ((((kj) this).field_k ^ -1) > 0) {
                  break L28;
                } else {
                  param5.field_k = ((kj) this).field_k;
                  break L28;
                }
              }
              L29: {
                if (((kj) this).field_h > 0) {
                  break L29;
                } else {
                  param5.field_h = ((kj) this).field_h;
                  break L29;
                }
              }
              return;
            }
          }
        } else {
          if (((kj) this).field_c == null) {
            if (2147483647 == ((kj) this).field_l) {
              if (((kj) this).field_i == -2147483648) {
                L30: {
                  if ((((kj) this).field_d ^ -1) != 2147483647) {
                    param5.field_d = ((kj) this).field_d;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (((kj) this).field_e != null) {
                    param5.field_e = ((kj) this).field_e;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                if (param2) {
                  if ((((kj) this).field_k ^ -1) > 0) {
                    if ((((kj) this).field_h ^ -1) <= 0) {
                      param5.field_h = ((kj) this).field_h;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L32: {
                      param5.field_k = ((kj) this).field_k;
                      if ((((kj) this).field_h ^ -1) > 0) {
                        break L32;
                      } else {
                        param5.field_h = ((kj) this).field_h;
                        break L32;
                      }
                    }
                    return;
                  }
                } else {
                  L33: {
                    kj.a(13);
                    if ((((kj) this).field_k ^ -1) > 0) {
                      break L33;
                    } else {
                      param5.field_k = ((kj) this).field_k;
                      break L33;
                    }
                  }
                  L34: {
                    if ((((kj) this).field_h ^ -1) > 0) {
                      break L34;
                    } else {
                      param5.field_h = ((kj) this).field_h;
                      break L34;
                    }
                  }
                  return;
                }
              } else {
                L35: {
                  param5.field_i = ((kj) this).field_i;
                  if ((((kj) this).field_d ^ -1) != 2147483647) {
                    param5.field_d = ((kj) this).field_d;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (((kj) this).field_e != null) {
                    param5.field_e = ((kj) this).field_e;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param2) {
                    break L37;
                  } else {
                    kj.a(13);
                    break L37;
                  }
                }
                L38: {
                  if ((((kj) this).field_k ^ -1) > 0) {
                    break L38;
                  } else {
                    param5.field_k = ((kj) this).field_k;
                    break L38;
                  }
                }
                L39: {
                  if ((((kj) this).field_h ^ -1) > 0) {
                    break L39;
                  } else {
                    param5.field_h = ((kj) this).field_h;
                    break L39;
                  }
                }
                return;
              }
            } else {
              L40: {
                param5.field_l = ((kj) this).field_l;
                if (((kj) this).field_i == -2147483648) {
                  break L40;
                } else {
                  param5.field_i = ((kj) this).field_i;
                  break L40;
                }
              }
              L41: {
                if ((((kj) this).field_d ^ -1) != 2147483647) {
                  param5.field_d = ((kj) this).field_d;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (((kj) this).field_e != null) {
                  param5.field_e = ((kj) this).field_e;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                if (param2) {
                  break L43;
                } else {
                  kj.a(13);
                  break L43;
                }
              }
              L44: {
                if ((((kj) this).field_k ^ -1) > 0) {
                  break L44;
                } else {
                  param5.field_k = ((kj) this).field_k;
                  break L44;
                }
              }
              L45: {
                if ((((kj) this).field_h ^ -1) > 0) {
                  break L45;
                } else {
                  param5.field_h = ((kj) this).field_h;
                  break L45;
                }
              }
              return;
            }
          } else {
            L46: {
              param5.field_c = ((kj) this).field_c;
              if (2147483647 == (((kj) this).field_l ^ -1)) {
                break L46;
              } else {
                param5.field_l = ((kj) this).field_l;
                break L46;
              }
            }
            L47: {
              if (((kj) this).field_i == -2147483648) {
                break L47;
              } else {
                param5.field_i = ((kj) this).field_i;
                break L47;
              }
            }
            L48: {
              if ((((kj) this).field_d ^ -1) != 2147483647) {
                param5.field_d = ((kj) this).field_d;
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              if (((kj) this).field_e != null) {
                param5.field_e = ((kj) this).field_e;
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              if (param2) {
                break L50;
              } else {
                kj.a(13);
                break L50;
              }
            }
            L51: {
              if ((((kj) this).field_k ^ -1) > 0) {
                break L51;
              } else {
                param5.field_k = ((kj) this).field_k;
                break L51;
              }
            }
            L52: {
              if (((kj) this).field_h > 0) {
                break L52;
              } else {
                param5.field_h = ((kj) this).field_h;
                break L52;
              }
            }
            return;
          }
        }
    }

    final static og a(int param0, int param1, String param2) {
        og var3 = null;
        if (param1 != 4) {
          return null;
        } else {
          var3 = new og(false);
          var3.field_g = param2;
          var3.field_a = param0;
          return var3;
        }
    }

    final void b(int param0) {
        ((kj) this).field_k = -1;
        ((kj) this).field_c = null;
        ((kj) this).field_h = param0;
        ((kj) this).field_d = 256;
        ((kj) this).field_e = null;
        ((kj) this).field_l = 0;
        ((kj) this).field_i = 0;
    }

    final kj c(int param0, int param1) {
        ((kj) this).field_k = param0;
        if (param1 < 13) {
            return null;
        }
        return (kj) this;
    }

    final void a(ch param0, vg param1, boolean param2, int param3, int param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        rf stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        rf stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        rf stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        rf stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        rf stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        rf stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        rf stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        rf stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        rf stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        rf stackIn_36_0 = null;
        String stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        rf stackIn_37_0 = null;
        String stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        rf stackIn_38_0 = null;
        String stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        rf stackIn_39_0 = null;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        rf stackIn_40_0 = null;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        rf stackIn_41_0 = null;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        rf stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_42_5 = 0;
        int stackIn_42_6 = 0;
        int stackIn_42_7 = 0;
        rf stackIn_43_0 = null;
        String stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        int stackIn_43_5 = 0;
        int stackIn_43_6 = 0;
        int stackIn_43_7 = 0;
        rf stackIn_44_0 = null;
        String stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_44_6 = 0;
        int stackIn_44_7 = 0;
        int stackIn_44_8 = 0;
        rf stackOut_35_0 = null;
        String stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        rf stackOut_37_0 = null;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        rf stackOut_36_0 = null;
        String stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        rf stackOut_38_0 = null;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        rf stackOut_40_0 = null;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        rf stackOut_39_0 = null;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        rf stackOut_41_0 = null;
        String stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int stackOut_41_5 = 0;
        int stackOut_41_6 = 0;
        int stackOut_41_7 = 0;
        rf stackOut_43_0 = null;
        String stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        int stackOut_43_6 = 0;
        int stackOut_43_7 = 0;
        int stackOut_43_8 = 0;
        rf stackOut_42_0 = null;
        String stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        int stackOut_42_5 = 0;
        int stackOut_42_6 = 0;
        int stackOut_42_7 = 0;
        int stackOut_42_8 = 0;
        rf stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        rf stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        rf stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        rf stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        rf stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        rf stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        rf stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        rf stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        rf stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        L0: {
          am.a(param1.field_m + param3, param1.field_k, param1.field_w, ((kj) this).field_c, 14673, param4 - -param1.field_o);
          if (null != ((kj) this).field_e) {
            L1: {
              var6_int = param1.field_o + param4 - -((kj) this).field_i;
              var7 = param3 + (param1.field_m + ((kj) this).field_l);
              if ((param0.field_p ^ -1) != -2) {
                break L1;
              } else {
                var6_int = var6_int + (param1.field_w + -((kj) this).field_e.field_z) / 2;
                break L1;
              }
            }
            L2: {
              if (-3 == param0.field_p) {
                var6_int = var6_int + (-((kj) this).field_e.field_z + param1.field_w);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-2 != param0.field_c) {
                break L3;
              } else {
                var7 = var7 + (param1.field_k + -((kj) this).field_e.field_C) / 2;
                break L3;
              }
            }
            L4: {
              if ((param0.field_c ^ -1) != -3) {
                break L4;
              } else {
                var7 = var7 + (param1.field_k + -((kj) this).field_e.field_C);
                break L4;
              }
            }
            ((kj) this).field_e.d(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param2) {
          var6 = param0.b(-121, param1);
          if (var6 != null) {
            if (param0.field_g != null) {
              if (((kj) this).field_h < 0) {
                return;
              } else {
                L5: {
                  stackOut_35_0 = param0.field_g;
                  stackOut_35_1 = (String) var6;
                  stackOut_35_2 = param0.field_j + param4;
                  stackOut_35_3 = param1.field_o;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  stackIn_37_3 = stackOut_35_3;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  stackIn_36_3 = stackOut_35_3;
                  if ((((kj) this).field_i ^ -1) == 2147483647) {
                    stackOut_37_0 = (rf) (Object) stackIn_37_0;
                    stackOut_37_1 = (String) (Object) stackIn_37_1;
                    stackOut_37_2 = stackIn_37_2;
                    stackOut_37_3 = stackIn_37_3;
                    stackOut_37_4 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    stackIn_38_2 = stackOut_37_2;
                    stackIn_38_3 = stackOut_37_3;
                    stackIn_38_4 = stackOut_37_4;
                    break L5;
                  } else {
                    stackOut_36_0 = (rf) (Object) stackIn_36_0;
                    stackOut_36_1 = (String) (Object) stackIn_36_1;
                    stackOut_36_2 = stackIn_36_2;
                    stackOut_36_3 = stackIn_36_3;
                    stackOut_36_4 = ((kj) this).field_i;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    stackIn_38_2 = stackOut_36_2;
                    stackIn_38_3 = stackOut_36_3;
                    stackIn_38_4 = stackOut_36_4;
                    break L5;
                  }
                }
                L6: {
                  stackOut_38_0 = (rf) (Object) stackIn_38_0;
                  stackOut_38_1 = (String) (Object) stackIn_38_1;
                  stackOut_38_2 = stackIn_38_2 + (stackIn_38_3 - -stackIn_38_4);
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  if (((kj) this).field_l != -2147483648) {
                    stackOut_40_0 = (rf) (Object) stackIn_40_0;
                    stackOut_40_1 = (String) (Object) stackIn_40_1;
                    stackOut_40_2 = stackIn_40_2;
                    stackOut_40_3 = ((kj) this).field_l;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    stackIn_41_3 = stackOut_40_3;
                    break L6;
                  } else {
                    stackOut_39_0 = (rf) (Object) stackIn_39_0;
                    stackOut_39_1 = (String) (Object) stackIn_39_1;
                    stackOut_39_2 = stackIn_39_2;
                    stackOut_39_3 = 0;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_41_2 = stackOut_39_2;
                    stackIn_41_3 = stackOut_39_3;
                    break L6;
                  }
                }
                L7: {
                  stackOut_41_0 = (rf) (Object) stackIn_41_0;
                  stackOut_41_1 = (String) (Object) stackIn_41_1;
                  stackOut_41_2 = stackIn_41_2;
                  stackOut_41_3 = stackIn_41_3 + (param1.field_m + param3) + param0.field_d;
                  stackOut_41_4 = -param0.field_j + param1.field_w - param0.field_k;
                  stackOut_41_5 = -param0.field_m + (param1.field_k + -param0.field_d);
                  stackOut_41_6 = ((kj) this).field_h;
                  stackOut_41_7 = ((kj) this).field_k;
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_43_2 = stackOut_41_2;
                  stackIn_43_3 = stackOut_41_3;
                  stackIn_43_4 = stackOut_41_4;
                  stackIn_43_5 = stackOut_41_5;
                  stackIn_43_6 = stackOut_41_6;
                  stackIn_43_7 = stackOut_41_7;
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  stackIn_42_3 = stackOut_41_3;
                  stackIn_42_4 = stackOut_41_4;
                  stackIn_42_5 = stackOut_41_5;
                  stackIn_42_6 = stackOut_41_6;
                  stackIn_42_7 = stackOut_41_7;
                  if ((((kj) this).field_d ^ -1) != 2147483647) {
                    stackOut_43_0 = (rf) (Object) stackIn_43_0;
                    stackOut_43_1 = (String) (Object) stackIn_43_1;
                    stackOut_43_2 = stackIn_43_2;
                    stackOut_43_3 = stackIn_43_3;
                    stackOut_43_4 = stackIn_43_4;
                    stackOut_43_5 = stackIn_43_5;
                    stackOut_43_6 = stackIn_43_6;
                    stackOut_43_7 = stackIn_43_7;
                    stackOut_43_8 = ((kj) this).field_d;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    stackIn_44_2 = stackOut_43_2;
                    stackIn_44_3 = stackOut_43_3;
                    stackIn_44_4 = stackOut_43_4;
                    stackIn_44_5 = stackOut_43_5;
                    stackIn_44_6 = stackOut_43_6;
                    stackIn_44_7 = stackOut_43_7;
                    stackIn_44_8 = stackOut_43_8;
                    break L7;
                  } else {
                    stackOut_42_0 = (rf) (Object) stackIn_42_0;
                    stackOut_42_1 = (String) (Object) stackIn_42_1;
                    stackOut_42_2 = stackIn_42_2;
                    stackOut_42_3 = stackIn_42_3;
                    stackOut_42_4 = stackIn_42_4;
                    stackOut_42_5 = stackIn_42_5;
                    stackOut_42_6 = stackIn_42_6;
                    stackOut_42_7 = stackIn_42_7;
                    stackOut_42_8 = 256;
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_44_1 = stackOut_42_1;
                    stackIn_44_2 = stackOut_42_2;
                    stackIn_44_3 = stackOut_42_3;
                    stackIn_44_4 = stackOut_42_4;
                    stackIn_44_5 = stackOut_42_5;
                    stackIn_44_6 = stackOut_42_6;
                    stackIn_44_7 = stackOut_42_7;
                    stackIn_44_8 = stackOut_42_8;
                    break L7;
                  }
                }
                int discarded$2 = ((rf) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_44_4, stackIn_44_5, stackIn_44_6, stackIn_44_7, stackIn_44_8, param0.field_p, param0.field_c, param0.field_a);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((kj) this).field_e = null;
          var6 = param0.b(-121, param1);
          if (var6 != null) {
            if (param0.field_g != null) {
              if (((kj) this).field_h < 0) {
                return;
              } else {
                L8: {
                  stackOut_18_0 = param0.field_g;
                  stackOut_18_1 = (String) var6;
                  stackOut_18_2 = param0.field_j + param4;
                  stackOut_18_3 = param1.field_o;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_20_3 = stackOut_18_3;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  stackIn_19_3 = stackOut_18_3;
                  if ((((kj) this).field_i ^ -1) == 2147483647) {
                    stackOut_20_0 = (rf) (Object) stackIn_20_0;
                    stackOut_20_1 = (String) (Object) stackIn_20_1;
                    stackOut_20_2 = stackIn_20_2;
                    stackOut_20_3 = stackIn_20_3;
                    stackOut_20_4 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    stackIn_21_3 = stackOut_20_3;
                    stackIn_21_4 = stackOut_20_4;
                    break L8;
                  } else {
                    stackOut_19_0 = (rf) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) (Object) stackIn_19_1;
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = stackIn_19_3;
                    stackOut_19_4 = ((kj) this).field_i;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    stackIn_21_3 = stackOut_19_3;
                    stackIn_21_4 = stackOut_19_4;
                    break L8;
                  }
                }
                L9: {
                  stackOut_21_0 = (rf) (Object) stackIn_21_0;
                  stackOut_21_1 = (String) (Object) stackIn_21_1;
                  stackOut_21_2 = stackIn_21_2 + (stackIn_21_3 - -stackIn_21_4);
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  if (((kj) this).field_l != -2147483648) {
                    stackOut_23_0 = (rf) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = ((kj) this).field_l;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    break L9;
                  } else {
                    stackOut_22_0 = (rf) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = 0;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    break L9;
                  }
                }
                L10: {
                  stackOut_24_0 = (rf) (Object) stackIn_24_0;
                  stackOut_24_1 = (String) (Object) stackIn_24_1;
                  stackOut_24_2 = stackIn_24_2;
                  stackOut_24_3 = stackIn_24_3 + (param1.field_m + param3) + param0.field_d;
                  stackOut_24_4 = -param0.field_j + param1.field_w - param0.field_k;
                  stackOut_24_5 = -param0.field_m + (param1.field_k + -param0.field_d);
                  stackOut_24_6 = ((kj) this).field_h;
                  stackOut_24_7 = ((kj) this).field_k;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  stackIn_26_3 = stackOut_24_3;
                  stackIn_26_4 = stackOut_24_4;
                  stackIn_26_5 = stackOut_24_5;
                  stackIn_26_6 = stackOut_24_6;
                  stackIn_26_7 = stackOut_24_7;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  stackIn_25_3 = stackOut_24_3;
                  stackIn_25_4 = stackOut_24_4;
                  stackIn_25_5 = stackOut_24_5;
                  stackIn_25_6 = stackOut_24_6;
                  stackIn_25_7 = stackOut_24_7;
                  if ((((kj) this).field_d ^ -1) != 2147483647) {
                    stackOut_26_0 = (rf) (Object) stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3;
                    stackOut_26_4 = stackIn_26_4;
                    stackOut_26_5 = stackIn_26_5;
                    stackOut_26_6 = stackIn_26_6;
                    stackOut_26_7 = stackIn_26_7;
                    stackOut_26_8 = ((kj) this).field_d;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    stackIn_27_3 = stackOut_26_3;
                    stackIn_27_4 = stackOut_26_4;
                    stackIn_27_5 = stackOut_26_5;
                    stackIn_27_6 = stackOut_26_6;
                    stackIn_27_7 = stackOut_26_7;
                    stackIn_27_8 = stackOut_26_8;
                    break L10;
                  } else {
                    stackOut_25_0 = (rf) (Object) stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = stackIn_25_3;
                    stackOut_25_4 = stackIn_25_4;
                    stackOut_25_5 = stackIn_25_5;
                    stackOut_25_6 = stackIn_25_6;
                    stackOut_25_7 = stackIn_25_7;
                    stackOut_25_8 = 256;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    stackIn_27_3 = stackOut_25_3;
                    stackIn_27_4 = stackOut_25_4;
                    stackIn_27_5 = stackOut_25_5;
                    stackIn_27_6 = stackOut_25_6;
                    stackIn_27_7 = stackOut_25_7;
                    stackIn_27_8 = stackOut_25_8;
                    break L10;
                  }
                }
                int discarded$3 = ((rf) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param0.field_p, param0.field_c, param0.field_a);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    kj() {
        ((kj) this).field_i = -2147483648;
        ((kj) this).field_e = null;
        ((kj) this).field_k = -2;
        ((kj) this).field_j = false;
        ((kj) this).field_d = -2147483648;
        ((kj) this).field_c = null;
        ((kj) this).field_l = -2147483648;
        ((kj) this).field_h = -2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[13];
        field_f = new int[][]{new int[9], new int[1], new int[1], new int[3], new int[1], new int[1], new int[3], new int[1], new int[1]};
        field_b[7] = 200;
        field_b[0] = 200;
        field_b[5] = 200;
        field_b[8] = 200;
        field_b[1] = 200;
        field_b[2] = 180;
        field_b[3] = 80;
        field_b[9] = 100;
        field_b[11] = 200;
        field_b[4] = 200;
        field_b[6] = 200;
        field_b[10] = 200;
    }
}
