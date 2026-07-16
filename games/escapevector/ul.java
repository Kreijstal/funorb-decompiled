/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ul extends hc {
    private boolean field_J;
    static ed[] field_E;
    private int field_N;
    private long field_G;
    private boolean field_M;
    static int[] field_I;
    static ce field_O;
    private long field_D;
    private int field_H;
    private int field_P;
    private int field_L;

    final boolean a(hm param0, char param1, int param2, int param3) {
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_98_0 = null;
        Object stackIn_99_0 = null;
        Object stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_104_0 = null;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        Object stackIn_155_0 = null;
        Object stackIn_156_0 = null;
        Object stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        Object stackIn_160_0 = null;
        Object stackIn_161_0 = null;
        Object stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        Object stackOut_159_0 = null;
        Object stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        Object stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        Object stackOut_154_0 = null;
        Object stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        Object stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        Object stackOut_102_0 = null;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        Object stackOut_97_0 = null;
        Object stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        Object stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        ((ul) this).field_G = td.b(128);
        if (param3 >= 0) {
          L0: {
            if (param1 == 60) {
              break L0;
            } else {
              if (62 == param1) {
                break L0;
              } else {
                if (param1 < 32) {
                  L1: {
                    if (-86 == (param2 ^ -1)) {
                      if (((ul) this).field_P != ((ul) this).field_L) {
                        this.k(0);
                        return true;
                      } else {
                        if (-1 <= (((ul) this).field_L ^ -1)) {
                          break L1;
                        } else {
                          ((ul) this).field_P = ((ul) this).field_L + -1;
                          this.k(0);
                          return true;
                        }
                      }
                    } else {
                      if (-102 != (param2 ^ -1)) {
                        if (param2 == 13) {
                          ((ul) this).h((byte) -29);
                          return true;
                        } else {
                          if (-97 == (param2 ^ -1)) {
                            if (-1 <= (((ul) this).field_L ^ -1)) {
                              break L1;
                            } else {
                              L2: {
                                stackOut_159_0 = this;
                                stackIn_161_0 = stackOut_159_0;
                                stackIn_160_0 = stackOut_159_0;
                                if (!ik.field_h[82]) {
                                  stackOut_161_0 = this;
                                  stackOut_161_1 = -1 + ((ul) this).field_L;
                                  stackIn_162_0 = stackOut_161_0;
                                  stackIn_162_1 = stackOut_161_1;
                                  break L2;
                                } else {
                                  stackOut_160_0 = this;
                                  stackOut_160_1 = this.p(-94);
                                  stackIn_162_0 = stackOut_160_0;
                                  stackIn_162_1 = stackOut_160_1;
                                  break L2;
                                }
                              }
                              this.b(stackIn_162_1, 22);
                              return true;
                            }
                          } else {
                            if (97 == param2) {
                              if (((ul) this).field_L < ((ul) this).field_l.length()) {
                                L3: {
                                  stackOut_154_0 = this;
                                  stackIn_156_0 = stackOut_154_0;
                                  stackIn_155_0 = stackOut_154_0;
                                  if (ik.field_h[82]) {
                                    stackOut_156_0 = this;
                                    stackOut_156_1 = this.o(1);
                                    stackIn_157_0 = stackOut_156_0;
                                    stackIn_157_1 = stackOut_156_1;
                                    break L3;
                                  } else {
                                    stackOut_155_0 = this;
                                    stackOut_155_1 = ((ul) this).field_L + 1;
                                    stackIn_157_0 = stackOut_155_0;
                                    stackIn_157_1 = stackOut_155_1;
                                    break L3;
                                  }
                                }
                                this.b(stackIn_157_1, 121);
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              if (102 != param2) {
                                if (param2 == 103) {
                                  this.b(((ul) this).field_l.length(), 115);
                                  return true;
                                } else {
                                  if ((param2 ^ -1) != -85) {
                                    if (!ik.field_h[82]) {
                                      if (!ik.field_h[82]) {
                                        if (ik.field_h[82]) {
                                          if (-68 == (param2 ^ -1)) {
                                            this.q(87);
                                            return true;
                                          } else {
                                            return false;
                                          }
                                        } else {
                                          return false;
                                        }
                                      } else {
                                        if (66 == param2) {
                                          this.e((byte) 104);
                                          return true;
                                        } else {
                                          if (ik.field_h[82]) {
                                            if (-68 != (param2 ^ -1)) {
                                              return false;
                                            } else {
                                              this.q(87);
                                              return true;
                                            }
                                          } else {
                                            return false;
                                          }
                                        }
                                      }
                                    } else {
                                      if (-66 == (param2 ^ -1)) {
                                        this.g((byte) 8);
                                        return true;
                                      } else {
                                        L4: {
                                          if (!ik.field_h[82]) {
                                            break L4;
                                          } else {
                                            if (66 == param2) {
                                              this.e((byte) 104);
                                              return true;
                                            } else {
                                              break L4;
                                            }
                                          }
                                        }
                                        L5: {
                                          if (!ik.field_h[82]) {
                                            break L5;
                                          } else {
                                            if (-68 != (param2 ^ -1)) {
                                              break L5;
                                            } else {
                                              this.q(87);
                                              return true;
                                            }
                                          }
                                        }
                                        return false;
                                      }
                                    }
                                  } else {
                                    this.n(0);
                                    return true;
                                  }
                                }
                              } else {
                                this.b(0, 33);
                                return true;
                              }
                            }
                          }
                        }
                      } else {
                        if (((ul) this).field_P != ((ul) this).field_L) {
                          this.k(0);
                          return true;
                        } else {
                          if ((((ul) this).field_L ^ -1) > (((ul) this).field_l.length() ^ -1)) {
                            ((ul) this).field_P = ((ul) this).field_L + 1;
                            this.k(0);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  if (126 >= param1) {
                    if (((ul) this).field_L == ((ul) this).field_P) {
                      if (0 == (((ul) this).field_H ^ -1)) {
                        if ((((ul) this).field_L ^ -1) <= (((ul) this).field_l.length() ^ -1)) {
                          ((ul) this).field_l = ((ul) this).field_l + param1;
                          int dupTemp$7 = ((ul) this).field_l.length();
                          ((ul) this).field_L = dupTemp$7;
                          ((ul) this).field_P = dupTemp$7;
                          ((ul) this).a(false);
                          return true;
                        } else {
                          ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_L) + param1 + ((ul) this).field_l.substring(((ul) this).field_L, ((ul) this).field_l.length());
                          ((ul) this).field_L = ((ul) this).field_L + 1;
                          ((ul) this).field_P = ((ul) this).field_L;
                          if (EscapeVector.field_A == 0) {
                            ((ul) this).a(false);
                            return true;
                          } else {
                            ((ul) this).field_l = ((ul) this).field_l + param1;
                            int dupTemp$8 = ((ul) this).field_l.length();
                            ((ul) this).field_L = dupTemp$8;
                            ((ul) this).field_P = dupTemp$8;
                            ((ul) this).a(false);
                            return true;
                          }
                        }
                      } else {
                        if (((ul) this).field_l.length() >= ((ul) this).field_H) {
                          return true;
                        } else {
                          if ((((ul) this).field_L ^ -1) <= (((ul) this).field_l.length() ^ -1)) {
                            ((ul) this).field_l = ((ul) this).field_l + param1;
                            int dupTemp$9 = ((ul) this).field_l.length();
                            ((ul) this).field_L = dupTemp$9;
                            ((ul) this).field_P = dupTemp$9;
                            ((ul) this).a(false);
                            return true;
                          } else {
                            ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_L) + param1 + ((ul) this).field_l.substring(((ul) this).field_L, ((ul) this).field_l.length());
                            ((ul) this).field_L = ((ul) this).field_L + 1;
                            ((ul) this).field_P = ((ul) this).field_L;
                            if (EscapeVector.field_A == 0) {
                              ((ul) this).a(false);
                              return true;
                            } else {
                              ((ul) this).field_l = ((ul) this).field_l + param1;
                              int dupTemp$10 = ((ul) this).field_l.length();
                              ((ul) this).field_L = dupTemp$10;
                              ((ul) this).field_P = dupTemp$10;
                              ((ul) this).a(false);
                              return true;
                            }
                          }
                        }
                      }
                    } else {
                      L6: {
                        this.k(0);
                        if (0 == (((ul) this).field_H ^ -1)) {
                          break L6;
                        } else {
                          if (((ul) this).field_l.length() >= ((ul) this).field_H) {
                            return true;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if ((((ul) this).field_L ^ -1) <= (((ul) this).field_l.length() ^ -1)) {
                        ((ul) this).field_l = ((ul) this).field_l + param1;
                        int dupTemp$11 = ((ul) this).field_l.length();
                        ((ul) this).field_L = dupTemp$11;
                        ((ul) this).field_P = dupTemp$11;
                        ((ul) this).a(false);
                        return true;
                      } else {
                        ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_L) + param1 + ((ul) this).field_l.substring(((ul) this).field_L, ((ul) this).field_l.length());
                        ((ul) this).field_L = ((ul) this).field_L + 1;
                        ((ul) this).field_P = ((ul) this).field_L;
                        if (EscapeVector.field_A == 0) {
                          ((ul) this).a(false);
                          return true;
                        } else {
                          ((ul) this).field_l = ((ul) this).field_l + param1;
                          int dupTemp$12 = ((ul) this).field_l.length();
                          ((ul) this).field_L = dupTemp$12;
                          ((ul) this).field_P = dupTemp$12;
                          ((ul) this).a(false);
                          return true;
                        }
                      }
                    }
                  } else {
                    L7: {
                      if (-86 == (param2 ^ -1)) {
                        if (((ul) this).field_P != ((ul) this).field_L) {
                          this.k(0);
                          return true;
                        } else {
                          if (-1 <= (((ul) this).field_L ^ -1)) {
                            break L7;
                          } else {
                            ((ul) this).field_P = ((ul) this).field_L + -1;
                            this.k(0);
                            return true;
                          }
                        }
                      } else {
                        if (-102 != (param2 ^ -1)) {
                          if (param2 == 13) {
                            ((ul) this).h((byte) -29);
                            return true;
                          } else {
                            if (-97 == (param2 ^ -1)) {
                              if (-1 <= (((ul) this).field_L ^ -1)) {
                                break L7;
                              } else {
                                L8: {
                                  stackOut_102_0 = this;
                                  stackIn_104_0 = stackOut_102_0;
                                  stackIn_103_0 = stackOut_102_0;
                                  if (!ik.field_h[82]) {
                                    stackOut_104_0 = this;
                                    stackOut_104_1 = -1 + ((ul) this).field_L;
                                    stackIn_105_0 = stackOut_104_0;
                                    stackIn_105_1 = stackOut_104_1;
                                    break L8;
                                  } else {
                                    stackOut_103_0 = this;
                                    stackOut_103_1 = this.p(-94);
                                    stackIn_105_0 = stackOut_103_0;
                                    stackIn_105_1 = stackOut_103_1;
                                    break L8;
                                  }
                                }
                                this.b(stackIn_105_1, 22);
                                return true;
                              }
                            } else {
                              if (97 == param2) {
                                if (((ul) this).field_L < ((ul) this).field_l.length()) {
                                  L9: {
                                    stackOut_97_0 = this;
                                    stackIn_99_0 = stackOut_97_0;
                                    stackIn_98_0 = stackOut_97_0;
                                    if (ik.field_h[82]) {
                                      stackOut_99_0 = this;
                                      stackOut_99_1 = this.o(1);
                                      stackIn_100_0 = stackOut_99_0;
                                      stackIn_100_1 = stackOut_99_1;
                                      break L9;
                                    } else {
                                      stackOut_98_0 = this;
                                      stackOut_98_1 = ((ul) this).field_L + 1;
                                      stackIn_100_0 = stackOut_98_0;
                                      stackIn_100_1 = stackOut_98_1;
                                      break L9;
                                    }
                                  }
                                  this.b(stackIn_100_1, 121);
                                  return true;
                                } else {
                                  break L7;
                                }
                              } else {
                                if (102 != param2) {
                                  if (param2 == 103) {
                                    this.b(((ul) this).field_l.length(), 115);
                                    return true;
                                  } else {
                                    if ((param2 ^ -1) != -85) {
                                      L10: {
                                        if (!ik.field_h[82]) {
                                          break L10;
                                        } else {
                                          if (-66 == (param2 ^ -1)) {
                                            this.g((byte) 8);
                                            return true;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if (!ik.field_h[82]) {
                                          break L11;
                                        } else {
                                          if (66 == param2) {
                                            this.e((byte) 104);
                                            return true;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      if (!ik.field_h[82]) {
                                        break L7;
                                      } else {
                                        if (-68 != (param2 ^ -1)) {
                                          break L7;
                                        } else {
                                          this.q(87);
                                          return true;
                                        }
                                      }
                                    } else {
                                      this.n(0);
                                      return true;
                                    }
                                  }
                                } else {
                                  this.b(0, 33);
                                  return true;
                                }
                              }
                            }
                          }
                        } else {
                          if (((ul) this).field_P != ((ul) this).field_L) {
                            this.k(0);
                            return true;
                          } else {
                            if ((((ul) this).field_L ^ -1) <= (((ul) this).field_l.length() ^ -1)) {
                              break L7;
                            } else {
                              ((ul) this).field_P = ((ul) this).field_L + 1;
                              this.k(0);
                              return true;
                            }
                          }
                        }
                      }
                    }
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          L12: {
            this.g((byte) 21);
            if (param1 == 60) {
              break L12;
            } else {
              if (62 == param1) {
                break L12;
              } else {
                L13: {
                  if (param1 < 32) {
                    break L13;
                  } else {
                    if (126 >= param1) {
                      L14: {
                        if (((ul) this).field_L == ((ul) this).field_P) {
                          break L14;
                        } else {
                          this.k(0);
                          break L14;
                        }
                      }
                      L15: {
                        L16: {
                          if (0 == (((ul) this).field_H ^ -1)) {
                            break L16;
                          } else {
                            if (((ul) this).field_l.length() >= ((ul) this).field_H) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        L17: {
                          if ((((ul) this).field_L ^ -1) <= (((ul) this).field_l.length() ^ -1)) {
                            break L17;
                          } else {
                            ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_L) + param1 + ((ul) this).field_l.substring(((ul) this).field_L, ((ul) this).field_l.length());
                            ((ul) this).field_L = ((ul) this).field_L + 1;
                            ((ul) this).field_P = ((ul) this).field_L;
                            if (EscapeVector.field_A == 0) {
                              ((ul) this).a(false);
                              break L15;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ((ul) this).field_l = ((ul) this).field_l + param1;
                        int dupTemp$13 = ((ul) this).field_l.length();
                        ((ul) this).field_L = dupTemp$13;
                        ((ul) this).field_P = dupTemp$13;
                        ((ul) this).a(false);
                        break L15;
                      }
                      return true;
                    } else {
                      break L13;
                    }
                  }
                }
                L18: {
                  if (-86 == (param2 ^ -1)) {
                    if (((ul) this).field_P != ((ul) this).field_L) {
                      this.k(0);
                      return true;
                    } else {
                      if (-1 <= (((ul) this).field_L ^ -1)) {
                        break L18;
                      } else {
                        ((ul) this).field_P = ((ul) this).field_L + -1;
                        this.k(0);
                        return true;
                      }
                    }
                  } else {
                    if (-102 != (param2 ^ -1)) {
                      if (param2 == 13) {
                        ((ul) this).h((byte) -29);
                        return true;
                      } else {
                        if (-97 == (param2 ^ -1)) {
                          if (-1 <= (((ul) this).field_L ^ -1)) {
                            break L18;
                          } else {
                            L19: {
                              stackOut_41_0 = this;
                              stackIn_43_0 = stackOut_41_0;
                              stackIn_42_0 = stackOut_41_0;
                              if (!ik.field_h[82]) {
                                stackOut_43_0 = this;
                                stackOut_43_1 = -1 + ((ul) this).field_L;
                                stackIn_44_0 = stackOut_43_0;
                                stackIn_44_1 = stackOut_43_1;
                                break L19;
                              } else {
                                stackOut_42_0 = this;
                                stackOut_42_1 = this.p(-94);
                                stackIn_44_0 = stackOut_42_0;
                                stackIn_44_1 = stackOut_42_1;
                                break L19;
                              }
                            }
                            this.b(stackIn_44_1, 22);
                            return true;
                          }
                        } else {
                          if (97 == param2) {
                            if (((ul) this).field_L < ((ul) this).field_l.length()) {
                              L20: {
                                stackOut_36_0 = this;
                                stackIn_38_0 = stackOut_36_0;
                                stackIn_37_0 = stackOut_36_0;
                                if (ik.field_h[82]) {
                                  stackOut_38_0 = this;
                                  stackOut_38_1 = this.o(1);
                                  stackIn_39_0 = stackOut_38_0;
                                  stackIn_39_1 = stackOut_38_1;
                                  break L20;
                                } else {
                                  stackOut_37_0 = this;
                                  stackOut_37_1 = ((ul) this).field_L + 1;
                                  stackIn_39_0 = stackOut_37_0;
                                  stackIn_39_1 = stackOut_37_1;
                                  break L20;
                                }
                              }
                              this.b(stackIn_39_1, 121);
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            if (102 != param2) {
                              if (param2 == 103) {
                                this.b(((ul) this).field_l.length(), 115);
                                return true;
                              } else {
                                if ((param2 ^ -1) != -85) {
                                  L21: {
                                    if (!ik.field_h[82]) {
                                      break L21;
                                    } else {
                                      if (-66 == (param2 ^ -1)) {
                                        this.g((byte) 8);
                                        return true;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  L22: {
                                    if (!ik.field_h[82]) {
                                      break L22;
                                    } else {
                                      if (66 == param2) {
                                        this.e((byte) 104);
                                        return true;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                  if (!ik.field_h[82]) {
                                    break L18;
                                  } else {
                                    if (-68 != (param2 ^ -1)) {
                                      break L18;
                                    } else {
                                      this.q(87);
                                      return true;
                                    }
                                  }
                                } else {
                                  this.n(0);
                                  return true;
                                }
                              }
                            } else {
                              this.b(0, 33);
                              return true;
                            }
                          }
                        }
                      }
                    } else {
                      if (((ul) this).field_P != ((ul) this).field_L) {
                        this.k(0);
                        return true;
                      } else {
                        if ((((ul) this).field_L ^ -1) <= (((ul) this).field_l.length() ^ -1)) {
                          break L18;
                        } else {
                          ((ul) this).field_P = ((ul) this).field_L + 1;
                          this.k(0);
                          return true;
                        }
                      }
                    }
                  }
                }
                return false;
              }
            }
          }
          return false;
        }
    }

    private final String l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((ul) this).field_P >= ((ul) this).field_L) {
            stackOut_2_0 = ((ul) this).field_L;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((ul) this).field_P;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 != 100) {
          return null;
        } else {
          L1: {
            if (((ul) this).field_L <= ((ul) this).field_P) {
              stackOut_6_0 = ((ul) this).field_P;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = ((ul) this).field_L;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return ((ul) this).field_l.substring(var2, var3);
        }
    }

    void a(boolean param0) {
        if (!(((ul) this).field_q instanceof rj)) {
          if (param0) {
            field_O = null;
            return;
          } else {
            return;
          }
        } else {
          ((rj) (Object) ((ul) this).field_q).a((ul) this, 0);
          if (!param0) {
            return;
          } else {
            field_O = null;
            return;
          }
        }
    }

    private final int o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var4 = EscapeVector.field_A;
        var2 = ((ul) this).field_l.length();
        if (var2 != ((ul) this).field_L) {
          var3 = param0 + ((ul) this).field_L;
          L0: while (true) {
            if (var2 > var3) {
              stackOut_5_0 = ((ul) this).field_l.charAt(var3 + -1) ^ -1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var4 == 0) {
                if (stackIn_7_0 != -33) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return stackIn_6_0;
              }
            } else {
              return var3;
            }
          }
        } else {
          return ((ul) this).field_L;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = param1 & 8191;
        if (param0 <= -124) {
          if (param1 > -4097) {
            L0: {
              if (-2049 <= param1) {
                stackOut_18_0 = -un.field_t[-2048 + param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = un.field_t[-param1 + 2048];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-6145 < (param1 ^ -1)) {
                stackOut_14_0 = -un.field_t[6144 - param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = un.field_t[-6144 + param1];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          int discarded$1 = ul.a(-64, 14);
          if (param1 > -4097) {
            L2: {
              if (-2049 <= param1) {
                stackOut_8_0 = -un.field_t[-2048 + param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = un.field_t[-param1 + 2048];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-6145 < (param1 ^ -1)) {
                stackOut_4_0 = -un.field_t[6144 - param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = un.field_t[-6144 + param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    private final void n(int param0) {
        if (!(((ul) this).field_q instanceof rj)) {
          if (param0 != 0) {
            int discarded$4 = ul.a(-65, 47, 47);
            return;
          } else {
            return;
          }
        } else {
          ((rj) (Object) ((ul) this).field_q).a(true, (ul) this);
          if (param0 == 0) {
            return;
          } else {
            int discarded$5 = ul.a(-65, 47, 47);
            return;
          }
        }
    }

    final void a(String param0, boolean param1, int param2) {
        int var4 = 0;
        L0: {
          if (param2 == -33) {
            break L0;
          } else {
            ((ul) this).h((byte) 111);
            break L0;
          }
        }
        L1: {
          if (param0 == null) {
            param0 = "";
            break L1;
          } else {
            break L1;
          }
        }
        ((ul) this).field_l = param0;
        var4 = param0.length();
        if (0 != (((ul) this).field_H ^ -1)) {
          if (var4 <= ((ul) this).field_H) {
            L2: {
              int dupTemp$3 = ((ul) this).field_l.length();
              ((ul) this).field_P = dupTemp$3;
              ((ul) this).field_L = dupTemp$3;
              if (!param1) {
                ((ul) this).a(false);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_H);
              int dupTemp$4 = ((ul) this).field_l.length();
              ((ul) this).field_P = dupTemp$4;
              ((ul) this).field_L = dupTemp$4;
              if (!param1) {
                ((ul) this).a(false);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          L4: {
            int dupTemp$5 = ((ul) this).field_l.length();
            ((ul) this).field_P = dupTemp$5;
            ((ul) this).field_L = dupTemp$5;
            if (!param1) {
              ((ul) this).a(false);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    private final void a(byte param0, String param1) {
        int var3 = 0;
        L0: {
          if ((((ul) this).field_H ^ -1) != 0) {
            var3 = ((ul) this).field_H - ((ul) this).field_l.length();
            if (0 > var3) {
              param1 = param1.substring(0, var3);
              break L0;
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        if (param0 == -120) {
          if (((ul) this).field_L == ((ul) this).field_l.length()) {
            ((ul) this).field_l = ((ul) this).field_l + param1;
            if (EscapeVector.field_A != 0) {
              ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_L) + param1 + ((ul) this).field_l.substring(((ul) this).field_L, ((ul) this).field_l.length());
              ((ul) this).field_L = ((ul) this).field_L + param1.length();
              ((ul) this).field_P = ((ul) this).field_L;
              ((ul) this).a(false);
              return;
            } else {
              ((ul) this).field_L = ((ul) this).field_L + param1.length();
              ((ul) this).field_P = ((ul) this).field_L;
              ((ul) this).a(false);
              return;
            }
          } else {
            ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_L) + param1 + ((ul) this).field_l.substring(((ul) this).field_L, ((ul) this).field_l.length());
            ((ul) this).field_L = ((ul) this).field_L + param1.length();
            ((ul) this).field_P = ((ul) this).field_L;
            ((ul) this).a(false);
            return;
          }
        } else {
          ((ul) this).field_J = false;
          if (((ul) this).field_L == ((ul) this).field_l.length()) {
            ((ul) this).field_l = ((ul) this).field_l + param1;
            if (EscapeVector.field_A == 0) {
              ((ul) this).field_L = ((ul) this).field_L + param1.length();
              ((ul) this).field_P = ((ul) this).field_L;
              ((ul) this).a(false);
              return;
            } else {
              ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_L) + param1 + ((ul) this).field_l.substring(((ul) this).field_L, ((ul) this).field_l.length());
              ((ul) this).field_L = ((ul) this).field_L + param1.length();
              ((ul) this).field_P = ((ul) this).field_L;
              ((ul) this).a(false);
              return;
            }
          } else {
            ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_L) + param1 + ((ul) this).field_l.substring(((ul) this).field_L, ((ul) this).field_l.length());
            ((ul) this).field_L = ((ul) this).field_L + param1.length();
            ((ul) this).field_P = ((ul) this).field_L;
            ((ul) this).a(false);
            return;
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          if (((ul) this).field_s instanceof ao) {
            L0: {
              var8_int = ((ao) (Object) ((ul) this).field_s).a(param4, param0, bj.field_y, dh.field_d, 118, (hm) this);
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if ((var8_int ^ -1) == 0) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = var8_int;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            L1: {
              this.b(stackIn_7_1, 61);
              var8 = td.b(param2 + 125);
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (-251L >= (-((ul) this).field_D + var8 ^ -1L)) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            ((ul) this).field_M = stackIn_10_1 != 0;
            if (((ul) this).field_M) {
              ((ul) this).field_P = this.p(-121);
              ((ul) this).field_L = this.o(1);
              if (-1 > ((ul) this).field_L) {
                if (-33 != ((ul) this).field_l.charAt(-1 + ((ul) this).field_L)) {
                  ((ul) this).field_N = ((ul) this).field_L;
                  ((ul) this).field_D = var8;
                  return true;
                } else {
                  ((ul) this).field_L = ((ul) this).field_L - 1;
                  ((ul) this).field_N = ((ul) this).field_L;
                  ((ul) this).field_D = var8;
                  return true;
                }
              } else {
                ((ul) this).field_N = ((ul) this).field_L;
                ((ul) this).field_D = var8;
                return true;
              }
            } else {
              ((ul) this).field_D = var8;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static ed a(int param0, int param1, mf param2, byte param3) {
        if (param3 > 3) {
          if (!uc.a(param2, 105, param0, param1)) {
            return null;
          } else {
            return al.a((byte) 108);
          }
        } else {
          ul.f((byte) -115);
          if (!uc.a(param2, 105, param0, param1)) {
            return null;
          } else {
            return al.a((byte) 108);
          }
        }
    }

    private final int p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        char stackIn_7_0 = 0;
        char stackIn_8_0 = 0;
        char stackOut_6_0 = 0;
        var4 = EscapeVector.field_A;
        if (-1 == (((ul) this).field_L ^ -1)) {
          return ((ul) this).field_L;
        } else {
          var3 = -8 % ((param0 - 6) / 38);
          var2 = ((ul) this).field_L - 1;
          L0: while (true) {
            if (-1 > (var2 ^ -1)) {
              stackOut_6_0 = ((ul) this).field_l.charAt(var2 + -1);
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var4 == 0) {
                if (stackIn_8_0 != 32) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return stackIn_7_0;
              }
            } else {
              return var2;
            }
          }
        }
    }

    public static void f(byte param0) {
        field_O = null;
        if (param0 > -52) {
            field_O = null;
            field_E = null;
            field_I = null;
            return;
        }
        field_E = null;
        field_I = null;
    }

    private final void b(int param0, int param1) {
        if (param1 >= 17) {
          ((ul) this).field_L = param0;
          if (!ik.field_h[81]) {
            ((ul) this).field_P = ((ul) this).field_L;
            return;
          } else {
            return;
          }
        } else {
          ul.f((byte) -102);
          ((ul) this).field_L = param0;
          if (ik.field_h[81]) {
            return;
          } else {
            ((ul) this).field_P = ((ul) this).field_L;
            return;
          }
        }
    }

    private final void m(int param0) {
        pg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ao var9 = null;
        var8 = EscapeVector.field_A;
        if (((ul) this).field_J) {
          if (((ul) this).field_s instanceof ao) {
            var9 = (ao) (Object) ((ul) this).field_s;
            var3 = var9.b((hm) this, 90);
            var4 = var3.a((byte) -112);
            var5 = var9.a((hm) this, -25033);
            var6 = var9.a(115) >> -1851814207;
            if (var5 + -var6 > var4) {
              ((ul) this).field_n = 0;
              ((ul) this).field_v = 0;
              return;
            } else {
              if (param0 == -22686) {
                L0: {
                  var7 = ((ul) this).field_n - -var3.a((byte) -79, ((ul) this).field_L);
                  if (var5 + -var6 >= var7) {
                    if (var7 < var6) {
                      ((ul) this).field_n = -var7 - -var6 + ((ul) this).field_n;
                      break L0;
                    } else {
                      if ((((ul) this).field_n ^ -1) >= -1) {
                        if (-var5 - -var6 <= ((ul) this).field_n) {
                          return;
                        } else {
                          ((ul) this).field_n = -var5 - -var6;
                          return;
                        }
                      } else {
                        L1: {
                          ((ul) this).field_n = 0;
                          if (-var5 - -var6 > ((ul) this).field_n) {
                            ((ul) this).field_n = -var5 - -var6;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    ((ul) this).field_n = ((ul) this).field_n - (var7 + (-var5 + var6));
                    if (var8 == 0) {
                      break L0;
                    } else {
                      L2: {
                        if (var7 < var6) {
                          ((ul) this).field_n = -var7 - -var6 + ((ul) this).field_n;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if ((((ul) this).field_n ^ -1) < -1) {
                        L3: {
                          ((ul) this).field_n = 0;
                          if (-var5 - -var6 > ((ul) this).field_n) {
                            ((ul) this).field_n = -var5 - -var6;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        return;
                      } else {
                        L4: {
                          if (-var5 - -var6 > ((ul) this).field_n) {
                            ((ul) this).field_n = -var5 - -var6;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                if ((((ul) this).field_n ^ -1) >= -1) {
                  if (-var5 - -var6 <= ((ul) this).field_n) {
                    return;
                  } else {
                    ((ul) this).field_n = -var5 - -var6;
                    return;
                  }
                } else {
                  ((ul) this).field_n = 0;
                  if (var8 != 0) {
                    L5: {
                      if (-var5 - -var6 > ((ul) this).field_n) {
                        ((ul) this).field_n = -var5 - -var6;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          ((ul) this).field_n = 0;
          ((ul) this).field_v = 0;
          return;
        }
    }

    private final void q(int param0) {
        try {
            Exception exception = null;
            String var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.k(0);
                this.a((byte) -120, var2);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
            if (param0 < 34) {
              ul.f((byte) 49);
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(byte param0) {
        if (param0 != 8) {
          ((ul) this).a(-32, (byte) 101, 85, 10);
          this.e((byte) 90);
          this.k(0);
          return;
        } else {
          this.e((byte) 90);
          this.k(0);
          return;
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (((ul) this).field_L != ((ul) this).field_P) {
            L1: {
              if (((ul) this).field_L <= ((ul) this).field_P) {
                stackOut_4_0 = ((ul) this).field_L;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = ((ul) this).field_P;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_5_0;
              if (((ul) this).field_P >= ((ul) this).field_L) {
                stackOut_7_0 = ((ul) this).field_P;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = ((ul) this).field_L;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var3 = stackIn_8_0;
            ((ul) this).field_L = var2;
            ((ul) this).field_P = var2;
            ((ul) this).field_l = ((ul) this).field_l.substring(0, var2) + ((ul) this).field_l.substring(var3, ((ul) this).field_l.length());
            ((ul) this).a(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          ((ul) this).field_P = 46;
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (0 != param1) {
          if (param1 != 1) {
            if ((param1 ^ -1) == -3) {
              param0 = dc.a(-110, 100, param0) * 100;
              return param0;
            } else {
              if (param2 >= 24) {
                if (3 != param1) {
                  return 0;
                } else {
                  param0 = dc.a(-74, 100, param0) * 100;
                  return param0;
                }
              } else {
                return 31;
              }
            }
          } else {
            return param0 / 2;
          }
        } else {
          return param0;
        }
    }

    ul(String param0, wn param1, int param2) {
        super(param0, param1);
        ((ul) this).field_N = -1;
        ((ul) this).field_M = false;
        ((ul) this).field_D = 0L;
        ((ul) this).field_s = mb.field_g.field_p;
        ((ul) this).field_H = param2;
        ((ul) this).a(param0, true, -33);
        ((ul) this).field_J = true;
        ((ul) this).field_G = td.b(128);
    }

    void a(int param0, int param1, int param2, hm param3) {
        int var6 = 0;
        Object var7 = null;
        ao var7_ref = null;
        var7 = null;
        super.a(param0 + 0, param1, param2, param3);
        if (param0 == -14472) {
          this.m(-22686);
          if (-2 == (((ul) this).field_t ^ -1)) {
            if (((ul) this).field_s instanceof ao) {
              var7_ref = (ao) (Object) ((ul) this).field_s;
              var6 = var7_ref.a(param2, param1, bj.field_y, dh.field_d, param0 + 14560, (hm) this);
              if (var6 != -1) {
                if (((ul) this).field_M) {
                  if (((ul) this).field_N > var6) {
                    if (var6 <= ((ul) this).field_P) {
                      ((ul) this).field_L = var6;
                      ((ul) this).field_G = td.b(128);
                      return;
                    } else {
                      var6 = ((ul) this).field_N;
                      ((ul) this).field_L = var6;
                      ((ul) this).field_G = td.b(128);
                      return;
                    }
                  } else {
                    ((ul) this).field_L = var6;
                    ((ul) this).field_G = td.b(128);
                    return;
                  }
                } else {
                  ((ul) this).field_L = var6;
                  ((ul) this).field_G = td.b(128);
                  return;
                }
              } else {
                ((ul) this).field_G = td.b(128);
                return;
              }
            } else {
              ((ul) this).field_G = td.b(128);
              return;
            }
          } else {
            return;
          }
        } else {
          field_I = null;
          this.m(-22686);
          if (-2 == (((ul) this).field_t ^ -1)) {
            if (((ul) this).field_s instanceof ao) {
              var7_ref = (ao) (Object) ((ul) this).field_s;
              var6 = var7_ref.a(param2, param1, bj.field_y, dh.field_d, param0 + 14560, (hm) this);
              if (var6 != -1) {
                if (((ul) this).field_M) {
                  if (((ul) this).field_N > var6) {
                    if (var6 <= ((ul) this).field_P) {
                      ((ul) this).field_L = var6;
                      ((ul) this).field_G = td.b(128);
                      return;
                    } else {
                      var6 = ((ul) this).field_N;
                      ((ul) this).field_L = var6;
                      ((ul) this).field_G = td.b(128);
                      return;
                    }
                  } else {
                    ((ul) this).field_L = var6;
                    ((ul) this).field_G = td.b(128);
                    return;
                  }
                } else {
                  ((ul) this).field_L = var6;
                  ((ul) this).field_G = td.b(128);
                  return;
                }
              } else {
                ((ul) this).field_G = td.b(128);
                return;
              }
            } else {
              ((ul) this).field_G = td.b(128);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void h(byte param0) {
        Object var3 = null;
        ((ul) this).field_l = "";
        ((ul) this).field_P = 0;
        ((ul) this).field_L = 0;
        if (param0 != -29) {
          var3 = null;
          boolean discarded$2 = ((ul) this).a(-33, 14, (byte) 69, 46, -80, (hm) null, 28);
          ((ul) this).a(false);
          return;
        } else {
          ((ul) this).a(false);
          return;
        }
    }

    private final void e(byte param0) {
        try {
            String var2 = null;
            if (param0 <= 86) {
              L0: {
                ((ul) this).field_L = -80;
                var2 = this.l(100);
                if ((var2.length() ^ -1) < -1) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.l(100)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var2 = this.l(100);
                if ((var2.length() ^ -1) < -1) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.l(100)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        long var6 = 0L;
        ao var8 = null;
        if (param1 > 85) {
          if (((ul) this).field_s != null) {
            if (param2 == 0) {
              ((ul) this).field_s.a(param3, param0, -21, (hm) this, ((ul) this).field_y);
              if (((ul) this).field_s instanceof ao) {
                L0: {
                  var8 = (ao) (Object) ((ul) this).field_s;
                  if (((ul) this).field_P != ((ul) this).field_L) {
                    var8.a(param3, ((ul) this).field_L, (hm) this, ((ul) this).field_P, -613528456, param0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var6 = td.b(128);
                if (500L <= (-((ul) this).field_G + var6) % 1000L) {
                  return;
                } else {
                  var8.a((hm) this, ((ul) this).field_L, param3, param0, true);
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
          ((ul) this).field_H = -76;
          if (((ul) this).field_s != null) {
            if (param2 == 0) {
              ((ul) this).field_s.a(param3, param0, -21, (hm) this, ((ul) this).field_y);
              if (((ul) this).field_s instanceof ao) {
                L1: {
                  var8 = (ao) (Object) ((ul) this).field_s;
                  if (((ul) this).field_P != ((ul) this).field_L) {
                    var8.a(param3, ((ul) this).field_L, (hm) this, ((ul) this).field_P, -613528456, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var6 = td.b(128);
                if (500L <= (-((ul) this).field_G + var6) % 1000L) {
                  return;
                } else {
                  var8.a((hm) this, ((ul) this).field_L, param3, param0, true);
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
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[128];
    }
}
