/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends tc {
    eo field_u;
    int field_v;
    boolean field_z;
    private ha field_k;
    int field_m;
    int field_x;
    private int field_p;
    private boolean field_s;
    boolean field_w;
    boolean field_n;
    static at field_q;
    private ic field_y;
    pa field_B;
    oj field_r;
    static String field_l;
    static boolean[] field_o;
    static wk field_t;

    final boolean e(int param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3_int = 0;
        kn var3 = null;
        int var4 = 0;
        int var5 = 0;
        nn stackIn_16_0 = null;
        nn stackIn_17_0 = null;
        nn stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_135_0 = 0;
        nn stackOut_15_0 = null;
        nn stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        nn stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            var2 = 0;
            if (0 != this.field_r.field_m) {
              break L1;
            } else {
              var3_int = ((kr) ((Object) this.field_r)).field_H;
              var4 = ((kr) ((Object) this.field_r)).field_I;
              if (var3_int >= 0) {
                if (this.field_k.field_v > var3_int) {
                  if (0 <= var4) {
                    if (var4 < this.field_k.field_db) {
                      if (this.field_k.field_Eb[((kr) ((Object) this.field_r)).field_H - -(((kr) ((Object) this.field_r)).field_I * this.field_k.field_v)].field_c == null) {
                        return false;
                      } else {
                        L2: {
                          if (null != this.field_y.field_T) {
                            L3: {
                              stackOut_15_0 = this.field_y.field_vb;
                              stackIn_17_0 = stackOut_15_0;
                              stackIn_16_0 = stackOut_15_0;
                              if (null != this.field_y.field_oc) {
                                stackOut_17_0 = (nn) ((Object) stackIn_17_0);
                                stackOut_17_1 = 0;
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                break L3;
                              } else {
                                stackOut_16_0 = (nn) ((Object) stackIn_16_0);
                                stackOut_16_1 = 1;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                break L3;
                              }
                            }
                            ((nn) (Object) stackIn_18_0).a(stackIn_18_1 != 0, param0 + 19769, this.field_y.field_q, this.field_y.field_T, this.field_y.field_vb.field_y, this.field_y.field_vb.field_p);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        L4: {
                          this.field_B = (pa) ((Object) new qv(this.field_k, this.field_y.field_M, (vb) (this)));
                          if (!this.field_B.a(this.field_r, (byte) 57)) {
                            stackOut_21_0 = 0;
                            stackIn_22_0 = stackOut_21_0;
                            break L4;
                          } else {
                            stackOut_20_0 = 1;
                            stackIn_22_0 = stackOut_20_0;
                            break L4;
                          }
                        }
                        var2 = stackIn_22_0;
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          }
          L5: {
            if (-2 == (this.field_r.field_m ^ -1)) {
              break L5;
            } else {
              L6: {
                if ((this.field_r.field_m ^ -1) == -7) {
                  break L6;
                } else {
                  L7: {
                    if (this.field_r.field_m != 21) {
                      break L7;
                    } else {
                      L8: {
                        this.field_z = false;
                        this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                        if (!this.field_B.a(this.field_r, (byte) 57)) {
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          break L8;
                        } else {
                          stackOut_27_0 = 1;
                          stackIn_29_0 = stackOut_27_0;
                          break L8;
                        }
                      }
                      var2 = stackIn_29_0;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (-27 != (this.field_r.field_m ^ -1)) {
                      break L9;
                    } else {
                      L10: {
                        this.field_n = true;
                        this.field_z = false;
                        this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, (vb) (this)));
                        if (!this.field_B.a(this.field_r, (byte) 57)) {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          break L10;
                        } else {
                          stackOut_32_0 = 1;
                          stackIn_34_0 = stackOut_32_0;
                          break L10;
                        }
                      }
                      var2 = stackIn_34_0;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    if (-6 == (this.field_r.field_m ^ -1)) {
                      break L11;
                    } else {
                      L12: {
                        if (this.field_r.field_m == 7) {
                          break L12;
                        } else {
                          L13: {
                            if (10 == this.field_r.field_m) {
                              break L13;
                            } else {
                              L14: {
                                if ((this.field_r.field_m ^ -1) == -12) {
                                  break L14;
                                } else {
                                  L15: {
                                    if (this.field_r.field_m != 15) {
                                      break L15;
                                    } else {
                                      L16: {
                                        this.field_z = false;
                                        this.field_r.a(this.field_k, -26661);
                                        this.field_n = true;
                                        this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, (vb) (this)));
                                        if (!this.field_B.a(this.field_r, (byte) 57)) {
                                          stackOut_42_0 = 0;
                                          stackIn_43_0 = stackOut_42_0;
                                          break L16;
                                        } else {
                                          stackOut_41_0 = 1;
                                          stackIn_43_0 = stackOut_41_0;
                                          break L16;
                                        }
                                      }
                                      var2 = stackIn_43_0;
                                      if (var5 == 0) {
                                        break L0;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  L17: {
                                    if ((this.field_r.field_m ^ -1) != -15) {
                                      break L17;
                                    } else {
                                      L18: {
                                        this.field_z = false;
                                        this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                                        if (!this.field_B.a(this.field_r, (byte) 57)) {
                                          stackOut_47_0 = 0;
                                          stackIn_48_0 = stackOut_47_0;
                                          break L18;
                                        } else {
                                          stackOut_46_0 = 1;
                                          stackIn_48_0 = stackOut_46_0;
                                          break L18;
                                        }
                                      }
                                      var2 = stackIn_48_0;
                                      if (var5 == 0) {
                                        break L0;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (12 != this.field_r.field_m) {
                                      break L19;
                                    } else {
                                      L20: {
                                        this.field_z = false;
                                        this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                                        if (!this.field_B.a(this.field_r, (byte) 57)) {
                                          stackOut_52_0 = 0;
                                          stackIn_53_0 = stackOut_52_0;
                                          break L20;
                                        } else {
                                          stackOut_51_0 = 1;
                                          stackIn_53_0 = stackOut_51_0;
                                          break L20;
                                        }
                                      }
                                      var2 = stackIn_53_0;
                                      if (var5 == 0) {
                                        break L0;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L21: {
                                    if (-17 != (this.field_r.field_m ^ -1)) {
                                      break L21;
                                    } else {
                                      L22: {
                                        this.field_z = false;
                                        this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                                        if (!this.field_B.a(this.field_r, (byte) 57)) {
                                          stackOut_57_0 = 0;
                                          stackIn_58_0 = stackOut_57_0;
                                          break L22;
                                        } else {
                                          stackOut_56_0 = 1;
                                          stackIn_58_0 = stackOut_56_0;
                                          break L22;
                                        }
                                      }
                                      var2 = stackIn_58_0;
                                      if (var5 == 0) {
                                        break L0;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  L23: {
                                    if (this.field_r.field_m == 17) {
                                      break L23;
                                    } else {
                                      L24: {
                                        if (-4 != (this.field_r.field_m ^ -1)) {
                                          break L24;
                                        } else {
                                          L25: {
                                            this.field_z = false;
                                            this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                                            if (!this.field_B.a(this.field_r, (byte) 57)) {
                                              stackOut_63_0 = 0;
                                              stackIn_64_0 = stackOut_63_0;
                                              break L25;
                                            } else {
                                              stackOut_62_0 = 1;
                                              stackIn_64_0 = stackOut_62_0;
                                              break L25;
                                            }
                                          }
                                          var2 = stackIn_64_0;
                                          if (var5 == 0) {
                                            break L0;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      L26: {
                                        if (18 == this.field_r.field_m) {
                                          break L26;
                                        } else {
                                          L27: {
                                            if (-21 != (this.field_r.field_m ^ -1)) {
                                              break L27;
                                            } else {
                                              L28: {
                                                this.field_n = true;
                                                this.field_z = false;
                                                this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, (vb) (this)));
                                                if (!this.field_B.a(this.field_r, (byte) 57)) {
                                                  stackOut_69_0 = 0;
                                                  stackIn_70_0 = stackOut_69_0;
                                                  break L28;
                                                } else {
                                                  stackOut_68_0 = 1;
                                                  stackIn_70_0 = stackOut_68_0;
                                                  break L28;
                                                }
                                              }
                                              var2 = stackIn_70_0;
                                              if (var5 == 0) {
                                                break L0;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                          L29: {
                                            if (-20 != (this.field_r.field_m ^ -1)) {
                                              break L29;
                                            } else {
                                              L30: {
                                                this.field_n = true;
                                                this.field_z = false;
                                                this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, (vb) (this)));
                                                if (!this.field_B.a(this.field_r, (byte) 57)) {
                                                  stackOut_74_0 = 0;
                                                  stackIn_75_0 = stackOut_74_0;
                                                  break L30;
                                                } else {
                                                  stackOut_73_0 = 1;
                                                  stackIn_75_0 = stackOut_73_0;
                                                  break L30;
                                                }
                                              }
                                              var2 = stackIn_75_0;
                                              if (var5 == 0) {
                                                break L0;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                          L31: {
                                            if (-3 != (this.field_r.field_m ^ -1)) {
                                              break L31;
                                            } else {
                                              L32: {
                                                this.field_n = true;
                                                this.field_z = false;
                                                this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, (vb) (this)));
                                                if (!this.field_B.a(this.field_r, (byte) 57)) {
                                                  stackOut_79_0 = 0;
                                                  stackIn_80_0 = stackOut_79_0;
                                                  break L32;
                                                } else {
                                                  stackOut_78_0 = 1;
                                                  stackIn_80_0 = stackOut_78_0;
                                                  break L32;
                                                }
                                              }
                                              var2 = stackIn_80_0;
                                              if (var5 == 0) {
                                                break L0;
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                          L33: {
                                            if (this.field_r.field_m == 25) {
                                              break L33;
                                            } else {
                                              L34: {
                                                if (-24 != (this.field_r.field_m ^ -1)) {
                                                  break L34;
                                                } else {
                                                  L35: {
                                                    this.field_n = true;
                                                    this.field_z = false;
                                                    this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, (vb) (this)));
                                                    if (!this.field_B.a(this.field_r, (byte) 57)) {
                                                      stackOut_85_0 = 0;
                                                      stackIn_86_0 = stackOut_85_0;
                                                      break L35;
                                                    } else {
                                                      stackOut_84_0 = 1;
                                                      stackIn_86_0 = stackOut_84_0;
                                                      break L35;
                                                    }
                                                  }
                                                  var2 = stackIn_86_0;
                                                  if (var5 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                              }
                                              L36: {
                                                if (this.field_r.field_m != 24) {
                                                  break L36;
                                                } else {
                                                  L37: {
                                                    this.field_z = true;
                                                    this.field_n = false;
                                                    this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, (vb) (this)));
                                                    if (this.field_B.a(this.field_r, (byte) 57)) {
                                                      if (-1 < this.field_y.field_q) {
                                                        stackOut_92_0 = 1;
                                                        stackIn_94_0 = stackOut_92_0;
                                                        break L37;
                                                      } else {
                                                        stackOut_91_0 = 0;
                                                        stackIn_94_0 = stackOut_91_0;
                                                        break L37;
                                                      }
                                                    } else {
                                                      stackOut_89_0 = 0;
                                                      stackIn_94_0 = stackOut_89_0;
                                                      break L37;
                                                    }
                                                  }
                                                  var2 = stackIn_94_0;
                                                  if (var5 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                              if ((this.field_r.field_m ^ -1) != -28) {
                                                break L0;
                                              } else {
                                                this.field_z = false;
                                                this.field_n = false;
                                                var2 = 1;
                                                if (var5 == 0) {
                                                  break L0;
                                                } else {
                                                  break L33;
                                                }
                                              }
                                            }
                                          }
                                          L38: {
                                            this.field_z = false;
                                            this.field_n = true;
                                            this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, (vb) (this)));
                                            if (!this.field_B.a(this.field_r, (byte) 57)) {
                                              stackOut_99_0 = 0;
                                              stackIn_100_0 = stackOut_99_0;
                                              break L38;
                                            } else {
                                              stackOut_98_0 = 1;
                                              stackIn_100_0 = stackOut_98_0;
                                              break L38;
                                            }
                                          }
                                          var2 = stackIn_100_0;
                                          if (var5 == 0) {
                                            break L0;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      L39: {
                                        this.field_z = false;
                                        this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                                        if (!this.field_B.a(this.field_r, (byte) 57)) {
                                          stackOut_103_0 = 0;
                                          stackIn_104_0 = stackOut_103_0;
                                          break L39;
                                        } else {
                                          stackOut_102_0 = 1;
                                          stackIn_104_0 = stackOut_102_0;
                                          break L39;
                                        }
                                      }
                                      var2 = stackIn_104_0;
                                      if (var5 == 0) {
                                        break L0;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  L40: {
                                    this.field_z = false;
                                    this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                                    if (!this.field_B.a(this.field_r, (byte) 57)) {
                                      stackOut_107_0 = 0;
                                      stackIn_108_0 = stackOut_107_0;
                                      break L40;
                                    } else {
                                      stackOut_106_0 = 1;
                                      stackIn_108_0 = stackOut_106_0;
                                      break L40;
                                    }
                                  }
                                  var2 = stackIn_108_0;
                                  if (var5 == 0) {
                                    break L0;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              L41: {
                                this.field_z = false;
                                this.field_r.a(this.field_k, -26661);
                                this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                                if (!this.field_B.a(this.field_r, (byte) 57)) {
                                  stackOut_111_0 = 0;
                                  stackIn_112_0 = stackOut_111_0;
                                  break L41;
                                } else {
                                  stackOut_110_0 = 1;
                                  stackIn_112_0 = stackOut_110_0;
                                  break L41;
                                }
                              }
                              var2 = stackIn_112_0;
                              if (var5 == 0) {
                                break L0;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L42: {
                            this.field_z = false;
                            this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                            if (!this.field_B.a(this.field_r, (byte) 57)) {
                              stackOut_115_0 = 0;
                              stackIn_116_0 = stackOut_115_0;
                              break L42;
                            } else {
                              stackOut_114_0 = 1;
                              stackIn_116_0 = stackOut_114_0;
                              break L42;
                            }
                          }
                          var2 = stackIn_116_0;
                          if (var5 == 0) {
                            break L0;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L43: {
                        this.field_z = false;
                        this.field_B = (pa) ((Object) new qv(this.field_k, this.field_y.field_M, (vb) (this)));
                        if (!this.field_B.a(this.field_r, (byte) 57)) {
                          stackOut_119_0 = 0;
                          stackIn_120_0 = stackOut_119_0;
                          break L43;
                        } else {
                          stackOut_118_0 = 1;
                          stackIn_120_0 = stackOut_118_0;
                          break L43;
                        }
                      }
                      var2 = stackIn_120_0;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L44: {
                    var3 = (kn) ((Object) this.field_r);
                    if (var3.b(this.field_k, -75)) {
                      discarded$1 = new hp(this.field_k.c(var3.field_w.field_w, true, var3.field_w.field_J), true).a(this.field_y.field_pc, (byte) -86, this.field_y);
                      break L44;
                    } else {
                      break L44;
                    }
                  }
                  L45: {
                    this.field_z = false;
                    this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                    if (!this.field_B.a(this.field_r, (byte) 57)) {
                      stackOut_126_0 = 0;
                      stackIn_127_0 = stackOut_126_0;
                      break L45;
                    } else {
                      stackOut_125_0 = 1;
                      stackIn_127_0 = stackOut_125_0;
                      break L45;
                    }
                  }
                  var2 = stackIn_127_0;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L6;
                  }
                }
              }
              L46: {
                this.field_z = false;
                this.field_B = (pa) ((Object) new tb(this.field_k, this.field_y.field_M, (vb) (this)));
                if (!this.field_B.a(this.field_r, (byte) 57)) {
                  stackOut_130_0 = 0;
                  stackIn_131_0 = stackOut_130_0;
                  break L46;
                } else {
                  stackOut_129_0 = 1;
                  stackIn_131_0 = stackOut_129_0;
                  break L46;
                }
              }
              var2 = stackIn_131_0;
              if (var5 == 0) {
                break L0;
              } else {
                break L5;
              }
            }
          }
          L47: {
            this.field_z = true;
            this.field_B = (pa) ((Object) new sk(this.field_k, this.field_y.field_M, (vb) (this)));
            if (!this.field_B.a(this.field_r, (byte) 57)) {
              stackOut_134_0 = 0;
              stackIn_135_0 = stackOut_134_0;
              break L47;
            } else {
              stackOut_133_0 = 1;
              stackIn_135_0 = stackOut_133_0;
              break L47;
            }
          }
          var2 = stackIn_135_0;
          break L0;
        }
        L48: {
          if (var2 == 0) {
            this.field_r.c((byte) -71);
            this.field_s = true;
            break L48;
          } else {
            break L48;
          }
        }
        L49: {
          this.field_p = 0;
          if (param0 == -19702) {
            break L49;
          } else {
            this.field_z = true;
            break L49;
          }
        }
        return var2 != 0;
    }

    public static void f(int param0) {
        field_q = null;
        field_t = null;
        field_o = null;
        int var1 = -72 % ((param0 - 30) / 51);
        field_l = null;
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        wk stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int[][] stackIn_14_3 = null;
        wk stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int[][] stackIn_15_3 = null;
        wk stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int[][] stackIn_16_3 = null;
        int stackIn_16_4 = 0;
        wk stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int[][] stackOut_13_3 = null;
        wk stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int[][] stackOut_15_3 = null;
        int stackOut_15_4 = 0;
        wk stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int[][] stackOut_14_3 = null;
        int stackOut_14_4 = 0;
        L0: {
          if (!this.field_n) {
            break L0;
          } else {
            if (null != this.field_B) {
              L1: {
                L2: {
                  if (param2) {
                    break L2;
                  } else {
                    this.field_B.c((byte) -122);
                    if (!ArmiesOfGielinor.field_M) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_B.a((byte) -52);
                break L1;
              }
              return;
            } else {
              break L0;
            }
          }
        }
        if (!param2) {
          if (null != this.field_r.field_w) {
            if (this.field_r.field_w.field_x == null) {
              return;
            } else {
              L3: {
                var4 = -40 + this.field_r.field_w.field_x.field_e[0];
                var5 = -20 + this.field_r.field_w.field_x.field_e[1];
                stackOut_13_0 = go.field_g;
                stackOut_13_1 = 10 + var4;
                stackOut_13_2 = var5 + 5;
                stackOut_13_3 = op.field_c;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_15_2 = stackOut_13_2;
                stackIn_15_3 = stackOut_13_3;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                stackIn_14_3 = stackOut_13_3;
                if (this.field_k.field_wb) {
                  stackOut_15_0 = (wk) ((Object) stackIn_15_0);
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = stackIn_15_2;
                  stackOut_15_3 = (int[][]) ((Object) stackIn_15_3);
                  stackOut_15_4 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  stackIn_16_3 = stackOut_15_3;
                  stackIn_16_4 = stackOut_15_4;
                  break L3;
                } else {
                  stackOut_14_0 = (wk) ((Object) stackIn_14_0);
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = (int[][]) ((Object) stackIn_14_3);
                  stackOut_14_4 = 0;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  stackIn_16_3 = stackOut_14_3;
                  stackIn_16_4 = stackOut_14_4;
                  break L3;
                }
              }
              L4: {
                ((wk) (Object) stackIn_16_0).b(stackIn_16_1, stackIn_16_2, stackIn_16_3[stackIn_16_4][this.field_r.field_w.field_O]);
                if (param1 == 31785) {
                  break L4;
                } else {
                  this.field_s = false;
                  break L4;
                }
              }
              L5: {
                L6: {
                  if (this.field_y.field_T == this.field_r.field_w) {
                    break L6;
                  } else {
                    if (this.field_y.field_oc == this.field_r.field_w) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                go.field_g.f(var4 + 10, 5 + var5, 128 - -(int)(64.0 * Math.sin((double)param0 / 3.141592653589793)));
                break L5;
              }
              this.field_r.field_w.field_x.a((byte) -72, false);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0, int param1, boolean param2) {
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            var4 = 0;
            if (24 == this.field_r.field_m) {
              break L1;
            } else {
              L2: {
                this.field_n = true;
                this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, (vb) (this)));
                if (!((ql) ((Object) this.field_B)).a(-98, param1, param0, this.field_r)) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  break L2;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  break L2;
                }
              }
              var4 = stackIn_4_0;
              if (!ArmiesOfGielinor.field_M) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            this.field_z = false;
            this.field_n = true;
            this.field_B = (pa) ((Object) new ql(this.field_k, this.field_y.field_M, (vb) (this)));
            if (!((ql) ((Object) this.field_B)).a(-95, param1, param0, this.field_r)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L3;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L3;
            }
          }
          var4 = stackIn_8_0;
          break L0;
        }
        L4: {
          if (var4 == 0) {
            this.field_r.c((byte) -107);
            this.field_s = true;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param2) {
            break L5;
          } else {
            this.a(17, 99, true);
            break L5;
          }
        }
        this.field_p = 0;
        return var4 != 0;
    }

    final boolean a(byte param0) {
        int var2 = -110 / ((27 - param0) / 35);
        if (!(this.field_B != null)) {
            return false;
        }
        return this.field_B.b((byte) -91);
    }

    final void a(int param0) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (this.field_r.field_m == param0) {
              break L1;
            } else {
              if (null == this.field_B) {
                break L1;
              } else {
                L2: {
                  if (!this.field_B.b(8865)) {
                    break L2;
                  } else {
                    if (this.field_s) {
                      break L2;
                    } else {
                      this.field_r.c((byte) -118);
                      this.field_s = true;
                      this.field_B = null;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_B.b(this.field_r, (byte) 23);
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (this.field_s) {
            break L0;
          } else {
            this.field_s = true;
            this.field_r.c((byte) -64);
            break L0;
          }
        }
        L3: {
          this.field_p = this.field_p + 1;
          if (this.field_p < 1000) {
            break L3;
          } else {
            this.field_s = true;
            this.field_B = null;
            this.field_r.f(param0 + 7);
            oo.e(-387);
            break L3;
          }
        }
    }

    vb(ic param0, ha param1, eo param2, oj param3, boolean param4) {
        j discarded$0 = null;
        this.field_z = false;
        this.field_x = -1;
        try {
            this.field_k = param1;
            this.field_r = param3;
            this.field_u = param2;
            this.field_y = param0;
            discarded$0 = new j(240, param0.field_M);
            this.field_r.a(-97);
            this.field_p = 0;
            this.field_n = false;
            this.field_w = param4 ? true : false;
            this.field_s = false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    vb(ic param0, ha param1, eo param2, oj param3, int param4, int param5, boolean param6) {
        j discarded$0 = null;
        this.field_z = false;
        this.field_x = -1;
        try {
            this.field_r = param3;
            this.field_k = param1;
            this.field_u = param2;
            this.field_y = param0;
            discarded$0 = new j(240, param0.field_M);
            this.field_r.a(-97);
            this.field_n = false;
            this.field_w = param6 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_l = "You have not yet unlocked this option for use.";
        field_q = new at();
    }
}
