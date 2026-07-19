/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends w {
    private w field_Nb;
    static String field_Pb;
    static ui field_Ub;
    private StringBuilder field_Xb;
    static int field_Wb;
    private w field_Sb;
    private int field_Rb;
    static String[][] field_Qb;
    static String field_Tb;
    static String field_Ob;
    static int[] field_Vb;

    final int a(byte param0, boolean param1) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        this.a(false, param1);
        if (!param1) {
          this.field_Sb.field_Y = this.field_Xb.toString();
          if (param1) {
            if (ig.field_Yb != 0) {
              if (this.field_ob == 0) {
                this.field_Rb = 1;
                if (param0 == -63) {
                  return this.field_Rb;
                } else {
                  field_Wb = 87;
                  return this.field_Rb;
                }
              } else {
                if (param0 == -63) {
                  return this.field_Rb;
                } else {
                  field_Wb = 87;
                  return this.field_Rb;
                }
              }
            } else {
              if (param0 != -63) {
                field_Wb = 87;
                return this.field_Rb;
              } else {
                return this.field_Rb;
              }
            }
          } else {
            if (param0 != -63) {
              field_Wb = 87;
              return this.field_Rb;
            } else {
              return this.field_Rb;
            }
          }
        } else {
          L0: while (true) {
            if (ab.c((byte) -126)) {
              L1: {
                if (85 != wh.field_c) {
                  break L1;
                } else {
                  if (this.field_Xb.length() <= 0) {
                    break L1;
                  } else {
                    discarded$5 = vf.a(this.field_Xb, -23510, -1 + this.field_Xb.length(), ' ');
                    break L1;
                  }
                }
              }
              L2: {
                if (re.a(param0 ^ 9, el.field_G, (CharSequence) ((Object) this.field_Xb))) {
                  discarded$6 = this.field_Xb.append(el.field_G);
                  break L2;
                } else {
                  L3: {
                    if (this.field_Xb.length() != 0) {
                      break L3;
                    } else {
                      if (91 == el.field_G) {
                        discarded$7 = this.field_Xb.append(el.field_G);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (this.field_Xb.length() != 1) {
                      break L4;
                    } else {
                      if (el.field_G == 35) {
                        discarded$8 = this.field_Xb.append(el.field_G);
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (el.field_G == 93) {
                    discarded$9 = this.field_Xb.append(el.field_G);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (wh.field_c == 84) {
                if (this.field_Xb.length() > 0) {
                  this.field_Y = this.field_Xb.toString();
                  return 2;
                } else {
                  return 1;
                }
              } else {
                if (wh.field_c != 13) {
                  continue L0;
                } else {
                  return 1;
                }
              }
            } else {
              L5: {
                this.field_Sb.field_Y = this.field_Xb.toString();
                if (!param1) {
                  break L5;
                } else {
                  if (ig.field_Yb == 0) {
                    break L5;
                  } else {
                    if (this.field_ob != 0) {
                      break L5;
                    } else {
                      L6: {
                        this.field_Rb = 1;
                        if (param0 == -63) {
                          break L6;
                        } else {
                          field_Wb = 87;
                          break L6;
                        }
                      }
                      return this.field_Rb;
                    }
                  }
                }
              }
              if (param0 != -63) {
                field_Wb = 87;
                return this.field_Rb;
              } else {
                return this.field_Rb;
              }
            }
          }
        }
    }

    final boolean f(int param0) {
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        int discarded$30 = 0;
        int discarded$31 = 0;
        int discarded$32 = 0;
        int discarded$33 = 0;
        int discarded$34 = 0;
        int discarded$35 = 0;
        int discarded$36 = 0;
        StringBuilder discarded$37 = null;
        StringBuilder discarded$38 = null;
        StringBuilder discarded$39 = null;
        int discarded$40 = 0;
        int discarded$41 = 0;
        int discarded$42 = 0;
        int discarded$43 = 0;
        int discarded$44 = 0;
        StringBuilder discarded$45 = null;
        StringBuilder discarded$46 = null;
        StringBuilder discarded$47 = null;
        int discarded$48 = 0;
        int discarded$49 = 0;
        int discarded$50 = 0;
        int discarded$51 = 0;
        int var2 = 0;
        if (this.field_Rb == 0) {
          if (wh.field_c == 85) {
            if (this.field_Xb.length() > 0) {
              L0: {
                discarded$26 = vf.a(this.field_Xb, param0 ^ -23249, this.field_Xb.length() + -1, ' ');
                if (this.field_Xb.length() >= 12) {
                  break L0;
                } else {
                  L1: {
                    var2 = Character.toLowerCase(el.field_G);
                    if (var2 != 32) {
                      break L1;
                    } else {
                      var2 = 95;
                      break L1;
                    }
                  }
                  L2: {
                    if (95 != var2) {
                      break L2;
                    } else {
                      if (0 < this.field_Xb.length()) {
                        discarded$27 = this.field_Xb.append((char) var2);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (v.a((char) var2, -24380)) {
                    discarded$28 = this.field_Xb.append((char) var2);
                    break L0;
                  } else {
                    if (fl.a((char) var2, (byte) 23)) {
                      L3: {
                        discarded$29 = this.field_Xb.append((char) var2);
                        if (wh.field_c == 84) {
                          if (this.field_Xb.length() > 0) {
                            this.field_Y = this.field_Xb.toString();
                            this.field_Rb = 2;
                            break L3;
                          } else {
                            this.field_Rb = 1;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (wh.field_c != 13) {
                          break L4;
                        } else {
                          this.field_Rb = 1;
                          break L4;
                        }
                      }
                      L5: {
                        if (param0 == 261) {
                          break L5;
                        } else {
                          discarded$30 = this.a((byte) 13, false);
                          break L5;
                        }
                      }
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              if (wh.field_c == 84) {
                if (this.field_Xb.length() > 0) {
                  this.field_Y = this.field_Xb.toString();
                  this.field_Rb = 2;
                  if (wh.field_c != 13) {
                    if (param0 != 261) {
                      discarded$31 = this.a((byte) 13, false);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    this.field_Rb = 1;
                    if (param0 != 261) {
                      discarded$32 = this.a((byte) 13, false);
                      return true;
                    } else {
                      return true;
                    }
                  }
                } else {
                  this.field_Rb = 1;
                  if (wh.field_c != 13) {
                    if (param0 != 261) {
                      discarded$33 = this.a((byte) 13, false);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    this.field_Rb = 1;
                    if (param0 != 261) {
                      discarded$34 = this.a((byte) 13, false);
                      return true;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                if (wh.field_c != 13) {
                  if (param0 != 261) {
                    discarded$35 = this.a((byte) 13, false);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  L6: {
                    this.field_Rb = 1;
                    if (param0 == 261) {
                      break L6;
                    } else {
                      discarded$36 = this.a((byte) 13, false);
                      break L6;
                    }
                  }
                  return true;
                }
              }
            } else {
              L7: {
                if (this.field_Xb.length() >= 12) {
                  break L7;
                } else {
                  L8: {
                    var2 = Character.toLowerCase(el.field_G);
                    if (var2 != 32) {
                      break L8;
                    } else {
                      var2 = 95;
                      break L8;
                    }
                  }
                  L9: {
                    if (95 != var2) {
                      break L9;
                    } else {
                      if (0 < this.field_Xb.length()) {
                        discarded$37 = this.field_Xb.append((char) var2);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (v.a((char) var2, -24380)) {
                    discarded$38 = this.field_Xb.append((char) var2);
                    break L7;
                  } else {
                    if (fl.a((char) var2, (byte) 23)) {
                      L10: {
                        discarded$39 = this.field_Xb.append((char) var2);
                        if (wh.field_c == 84) {
                          if (this.field_Xb.length() > 0) {
                            this.field_Y = this.field_Xb.toString();
                            this.field_Rb = 2;
                            break L10;
                          } else {
                            this.field_Rb = 1;
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (wh.field_c != 13) {
                          break L11;
                        } else {
                          this.field_Rb = 1;
                          break L11;
                        }
                      }
                      L12: {
                        if (param0 == 261) {
                          break L12;
                        } else {
                          discarded$40 = this.a((byte) 13, false);
                          break L12;
                        }
                      }
                      return true;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              if (wh.field_c == 84) {
                if (this.field_Xb.length() > 0) {
                  this.field_Y = this.field_Xb.toString();
                  this.field_Rb = 2;
                  if (wh.field_c == 13) {
                    this.field_Rb = 1;
                    if (param0 == 261) {
                      return true;
                    } else {
                      discarded$41 = this.a((byte) 13, false);
                      return true;
                    }
                  } else {
                    L13: {
                      if (param0 == 261) {
                        break L13;
                      } else {
                        discarded$42 = this.a((byte) 13, false);
                        break L13;
                      }
                    }
                    return true;
                  }
                } else {
                  L14: {
                    this.field_Rb = 1;
                    if (wh.field_c != 13) {
                      break L14;
                    } else {
                      this.field_Rb = 1;
                      break L14;
                    }
                  }
                  L15: {
                    if (param0 == 261) {
                      break L15;
                    } else {
                      discarded$43 = this.a((byte) 13, false);
                      break L15;
                    }
                  }
                  return true;
                }
              } else {
                L16: {
                  if (wh.field_c != 13) {
                    break L16;
                  } else {
                    this.field_Rb = 1;
                    break L16;
                  }
                }
                L17: {
                  if (param0 == 261) {
                    break L17;
                  } else {
                    discarded$44 = this.a((byte) 13, false);
                    break L17;
                  }
                }
                return true;
              }
            }
          } else {
            L18: {
              if (this.field_Xb.length() >= 12) {
                break L18;
              } else {
                L19: {
                  var2 = Character.toLowerCase(el.field_G);
                  if (var2 != 32) {
                    break L19;
                  } else {
                    var2 = 95;
                    break L19;
                  }
                }
                L20: {
                  if (95 != var2) {
                    break L20;
                  } else {
                    if (0 < this.field_Xb.length()) {
                      discarded$45 = this.field_Xb.append((char) var2);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                if (v.a((char) var2, -24380)) {
                  discarded$46 = this.field_Xb.append((char) var2);
                  break L18;
                } else {
                  if (fl.a((char) var2, (byte) 23)) {
                    L21: {
                      discarded$47 = this.field_Xb.append((char) var2);
                      if (wh.field_c == 84) {
                        if (this.field_Xb.length() > 0) {
                          this.field_Y = this.field_Xb.toString();
                          this.field_Rb = 2;
                          break L21;
                        } else {
                          this.field_Rb = 1;
                          break L21;
                        }
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (wh.field_c != 13) {
                        break L22;
                      } else {
                        this.field_Rb = 1;
                        break L22;
                      }
                    }
                    if (param0 != 261) {
                      discarded$48 = this.a((byte) 13, false);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    break L18;
                  }
                }
              }
            }
            if (wh.field_c == 84) {
              if (this.field_Xb.length() <= 0) {
                L23: {
                  this.field_Rb = 1;
                  if (wh.field_c != 13) {
                    break L23;
                  } else {
                    this.field_Rb = 1;
                    break L23;
                  }
                }
                L24: {
                  if (param0 == 261) {
                    break L24;
                  } else {
                    discarded$49 = this.a((byte) 13, false);
                    break L24;
                  }
                }
                return true;
              } else {
                L25: {
                  this.field_Y = this.field_Xb.toString();
                  this.field_Rb = 2;
                  if (wh.field_c != 13) {
                    break L25;
                  } else {
                    this.field_Rb = 1;
                    break L25;
                  }
                }
                L26: {
                  if (param0 == 261) {
                    break L26;
                  } else {
                    discarded$50 = this.a((byte) 13, false);
                    break L26;
                  }
                }
                return true;
              }
            } else {
              L27: {
                if (wh.field_c != 13) {
                  break L27;
                } else {
                  this.field_Rb = 1;
                  break L27;
                }
              }
              L28: {
                if (param0 == 261) {
                  break L28;
                } else {
                  discarded$51 = this.a((byte) 13, false);
                  break L28;
                }
              }
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static void a(byte[] param0, int param1, pi[] param2, ji param3, String[] param4, int param5, int param6, ji param7, String[][] param8, ck[][] param9, boolean param10, int[] param11, ck[][] param12, byte[] param13, String[][] param14, ji param15, int param16, String[] param17, int[] param18, String[] param19) {
        RuntimeException var20 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
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
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
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
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        try {
          L0: {
            bb.a(false, param15, param2, param11, param7);
            la.a(param15, 32373);
            mf.a(8, param19, param0, param15, -8894, param8, param9, 1, param14, param17, param4, param12, 5, param13, param18);
            ua.a(46, param15, true, param3);
            ge.a((byte) 123);
            tj.h((byte) -27);
            f.d(18);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var20 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var20);
            stackOut_2_1 = new StringBuilder().append("hb.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
            if (param4 == null) {
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
          L5: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(3).append(',').append(8).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param7 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param8 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param9 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(true).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param11 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param12 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param13 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param14 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param15 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          L13: {
            stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(5).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param17 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L13;
            }
          }
          L14: {
            stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param18 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L14;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L14;
            }
          }
          L15: {
            stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param19 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L15;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L15;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
    }

    public static void e(int param0) {
        field_Vb = null;
        field_Qb = (String[][]) null;
        field_Ob = null;
        field_Pb = null;
        field_Ub = null;
        field_Tb = null;
    }

    hb(int param0, int param1, int param2, int param3, String param4, w param5, w param6, w param7) {
        super(0L, param5);
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        this.field_Rb = 0;
        try {
          L0: {
            this.field_Nb = new w(0L, param6, param4);
            this.a(this.field_Nb, -16834);
            this.field_Sb = new w(0L, param7);
            this.field_Sb.field_G = 16764006;
            this.a(this.field_Sb, -16834);
            this.field_Sb.field_T = "|";
            this.field_Xb = new StringBuilder(12);
            var9_int = this.field_Nb.a(true);
            this.field_Nb.a(var9_int, 0, 3, kf.field_O, 5);
            this.field_Sb.a(var9_int, 0, kf.field_O + 3, kf.field_O, 5);
            var10 = 10 + var9_int;
            var11 = 3 + (3 - -(2 * kf.field_O));
            var12 = vh.a(param2, -18265, var10, param0);
            var13 = o.a(param3, 0, var11, param1);
            this.a(var10, 0, var13, var11, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var9);
            stackOut_3_1 = new StringBuilder().append("hb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_Pb = "Players";
        field_Tb = "Please try changing the following settings:  ";
        field_Vb = new int[16384];
    }
}
