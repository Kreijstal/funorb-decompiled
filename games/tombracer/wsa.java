/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wsa extends ci {
    private int field_n;
    private int field_u;
    private int field_m;
    private int field_t;
    private int field_o;
    private int field_r;
    static su field_v;
    private int field_s;
    private int field_p;
    private int field_q;

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var15 = null;
        int[][] var20 = null;
        int[][] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          var20 = this.field_h.a(param0, (byte) 109);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (this.field_h.field_f) {
            var28 = this.a(param0, 0, -1);
            var30 = var28[0];
            var31 = var28[1];
            var29 = var28[2];
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            var11 = 0;
            L0: while (true) {
              if (var11 < ns.field_g) {
                this.b(2, var29[var11], var30[var11], var31[var11]);
                this.field_m = this.field_m + this.field_o;
                this.field_n = this.field_n + this.field_s;
                this.field_p = this.field_p + this.field_u;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (-1 >= (this.field_m ^ -1)) {
                        break L3;
                      } else {
                        this.field_m = this.field_m + 4096;
                        if (var12 != 0) {
                          this.field_n = 0;
                          break L2;
                        } else {
                          if (var12 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (this.field_n < 0) {
                      this.field_n = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (this.field_m <= 4096) {
                          break L6;
                        } else {
                          this.field_m = this.field_m - 4096;
                          if (var12 != 0) {
                            this.field_p = 0;
                            break L5;
                          } else {
                            if (var12 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (-1 < (this.field_p ^ -1)) {
                        this.field_p = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      if (this.field_n > 4096) {
                        this.field_n = 4096;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (-4097 <= (this.field_p ^ -1)) {
                        break L8;
                      } else {
                        this.field_p = 4096;
                        break L8;
                      }
                    }
                    this.a(this.field_n, 27261, this.field_m, this.field_p);
                    var8[var11] = this.field_t;
                    var9[var11] = this.field_r;
                    var10[var11] = this.field_q;
                    var11++;
                    if (var12 == 0) {
                      continue L0;
                    } else {
                      return var13;
                    }
                  }
                }
              } else {
                return var13;
              }
            }
          } else {
            return var13;
          }
        } else {
          return (int[][]) null;
        }
    }

    public wsa() {
        super(1, false);
        this.field_u = 0;
        this.field_o = 0;
        this.field_s = 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          if (param1 == 27261) {
            break L0;
          } else {
            wsa.c(81);
            break L0;
          }
        }
        L1: {
          if ((param3 ^ -1) >= -2049) {
            stackOut_4_0 = (param0 + 4096) * param3 >> -1518231540;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = param0 + (param3 + -(param0 * param3 >> -434583892));
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_5_0;
          if (0 < var5) {
            break L2;
          } else {
            this.field_q = param3;
            this.field_r = param3;
            this.field_t = param3;
            if (var14 != 0) {
              break L2;
            } else {
              return;
            }
          }
        }
        L3: {
          param2 = param2 * 6;
          var6 = param3 + (param3 - var5);
          var7 = (var5 + -var6 << 936974060) / var5;
          var8 = param2 >> -2008380468;
          var9 = -(var8 << 2060287660) + param2;
          var10 = var5;
          var10 = var7 * var10 >> -1868965940;
          var10 = var9 * var10 >> 140021196;
          var11 = var6 + var10;
          var12 = var5 + -var10;
          var13 = var8;
          if (0 != var13) {
            break L3;
          } else {
            if (var14 != 0) {
              break L3;
            } else {
              L4: {
                this.field_r = var11;
                this.field_q = var6;
                this.field_t = var5;
                if (var14 == 0) {
                  break L4;
                } else {
                  this.field_q = var6;
                  this.field_t = var12;
                  this.field_r = var5;
                  this.field_r = var5;
                  this.field_t = var6;
                  this.field_q = var11;
                  this.field_q = var5;
                  this.field_r = var12;
                  this.field_t = var6;
                  this.field_r = var6;
                  this.field_t = var11;
                  this.field_q = var5;
                  this.field_r = var6;
                  this.field_q = var12;
                  this.field_t = var5;
                  break L4;
                }
              }
              return;
            }
          }
        }
        if (-2 != (var13 ^ -1)) {
          L5: {
            L6: {
              L7: {
                L8: {
                  L9: {
                    if (var13 != 2) {
                      break L9;
                    } else {
                      if (var14 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if ((var13 ^ -1) == -4) {
                    break L7;
                  } else {
                    if (4 == var13) {
                      break L6;
                    } else {
                      if (-6 != (var13 ^ -1)) {
                        break L5;
                      } else {
                        if (var14 == 0) {
                          this.field_r = var6;
                          this.field_q = var12;
                          this.field_t = var5;
                          break L5;
                        } else {
                          this.field_r = var11;
                          this.field_q = var6;
                          this.field_t = var5;
                          this.field_q = var6;
                          this.field_t = var12;
                          this.field_r = var5;
                          break L8;
                        }
                      }
                    }
                  }
                }
                this.field_r = var5;
                this.field_t = var6;
                this.field_q = var11;
                if (var14 == 0) {
                  break L5;
                } else {
                  break L7;
                }
              }
              this.field_q = var5;
              this.field_r = var12;
              this.field_t = var6;
              if (var14 == 0) {
                break L5;
              } else {
                break L6;
              }
            }
            this.field_r = var6;
            this.field_t = var11;
            this.field_q = var5;
            if (var14 == 0) {
              break L5;
            } else {
              this.field_r = var6;
              this.field_q = var12;
              this.field_t = var5;
              break L5;
            }
          }
          return;
        } else {
          L10: {
            L11: {
              L12: {
                L13: {
                  if (var14 == 0) {
                    break L13;
                  } else {
                    L14: {
                      if (var13 != 2) {
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    if ((var13 ^ -1) == -4) {
                      break L12;
                    } else {
                      if (4 == var13) {
                        break L11;
                      } else {
                        if (-6 != (var13 ^ -1)) {
                          break L10;
                        } else {
                          if (var14 == 0) {
                            this.field_r = var6;
                            this.field_q = var12;
                            this.field_t = var5;
                            break L10;
                          } else {
                            this.field_r = var11;
                            this.field_q = var6;
                            this.field_t = var5;
                            break L13;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_q = var6;
                this.field_t = var12;
                this.field_r = var5;
                if (var14 == 0) {
                  break L10;
                } else {
                  this.field_r = var5;
                  this.field_t = var6;
                  this.field_q = var11;
                  if (var14 == 0) {
                    break L10;
                  } else {
                    break L12;
                  }
                }
              }
              this.field_q = var5;
              this.field_r = var12;
              this.field_t = var6;
              if (var14 == 0) {
                break L10;
              } else {
                break L11;
              }
            }
            this.field_r = var6;
            this.field_t = var11;
            this.field_q = var5;
            if (var14 == 0) {
              break L10;
            } else {
              this.field_r = var6;
              this.field_q = var12;
              this.field_t = var5;
              break L10;
            }
          }
          return;
        }
    }

    public static void c(int param0) {
        if (param0 >= -27) {
            field_v = (su) null;
            field_v = null;
            return;
        }
        field_v = null;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        Object stackIn_72_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_84_0 = null;
        Object stackIn_85_0 = null;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        Object stackIn_92_0 = null;
        Object stackIn_93_0 = null;
        Object stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_43_0 = null;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_83_0 = null;
        Object stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        Object stackOut_87_0 = null;
        Object stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        Object stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        Object stackOut_91_0 = null;
        Object stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        Object stackOut_63_0 = null;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_67_0 = null;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (param3 >= param2) {
            stackOut_2_0 = param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param3 <= param2) {
            stackOut_5_0 = param3;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 > var5) {
            stackOut_8_0 = param1;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_9_0;
          if (var6 > param1) {
            stackOut_11_0 = param1;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = var6;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var6 = stackIn_12_0;
        this.field_p = (var6 + var5) / param0;
        var7 = var5 + -var6;
        if ((this.field_p ^ -1) >= -1) {
          this.field_n = 0;
          if (var7 > 0) {
            L4: {
              L5: {
                var8 = (-param2 + var5 << 1407528556) / var7;
                var9 = (-param3 + var5 << 664757452) / var7;
                var10 = (-param1 + var5 << 1419796652) / var7;
                if (var5 == param2) {
                  break L5;
                } else {
                  L6: {
                    if (param3 == var5) {
                      break L6;
                    } else {
                      L7: {
                        stackOut_23_0 = this;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (param2 == var6) {
                          stackOut_25_0 = this;
                          stackOut_25_1 = 12288 + var9;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          break L7;
                        } else {
                          stackOut_24_0 = this;
                          stackOut_24_1 = 20480 + -var8;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          break L7;
                        }
                      }
                      ((wsa) (this)).field_m = stackIn_26_1;
                      if (var11 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L8: {
                    stackOut_27_0 = this;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (param1 == var6) {
                      stackOut_29_0 = this;
                      stackOut_29_1 = var8 + 4096;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      break L8;
                    } else {
                      stackOut_28_0 = this;
                      stackOut_28_1 = -var10 + 12288;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      break L8;
                    }
                  }
                  ((wsa) (this)).field_m = stackIn_30_1;
                  if (var11 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L9: {
                stackOut_31_0 = this;
                stackIn_33_0 = stackOut_31_0;
                stackIn_32_0 = stackOut_31_0;
                if (var6 == param3) {
                  stackOut_33_0 = this;
                  stackOut_33_1 = 20480 - -var10;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  break L9;
                } else {
                  stackOut_32_0 = this;
                  stackOut_32_1 = -var9 + 4096;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  break L9;
                }
              }
              ((wsa) (this)).field_m = stackIn_34_1;
              break L4;
            }
            this.field_m = this.field_m / 6;
            if (var11 == 0) {
              return;
            } else {
              this.field_m = 0;
              return;
            }
          } else {
            this.field_m = 0;
            return;
          }
        } else {
          if (-4097 >= (this.field_p ^ -1)) {
            this.field_n = 0;
            if (var7 > 0) {
              L10: {
                L11: {
                  var8 = (-param2 + var5 << 1407528556) / var7;
                  var9 = (-param3 + var5 << 664757452) / var7;
                  var10 = (-param1 + var5 << 1419796652) / var7;
                  if (var5 == param2) {
                    break L11;
                  } else {
                    L12: {
                      if (param3 == var5) {
                        break L12;
                      } else {
                        L13: {
                          stackOut_43_0 = this;
                          stackIn_45_0 = stackOut_43_0;
                          stackIn_44_0 = stackOut_43_0;
                          if (param2 == var6) {
                            stackOut_45_0 = this;
                            stackOut_45_1 = 12288 + var9;
                            stackIn_46_0 = stackOut_45_0;
                            stackIn_46_1 = stackOut_45_1;
                            break L13;
                          } else {
                            stackOut_44_0 = this;
                            stackOut_44_1 = 20480 + -var8;
                            stackIn_46_0 = stackOut_44_0;
                            stackIn_46_1 = stackOut_44_1;
                            break L13;
                          }
                        }
                        ((wsa) (this)).field_m = stackIn_46_1;
                        if (var11 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      stackOut_47_0 = this;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_48_0 = stackOut_47_0;
                      if (param1 == var6) {
                        stackOut_49_0 = this;
                        stackOut_49_1 = var8 + 4096;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        break L14;
                      } else {
                        stackOut_48_0 = this;
                        stackOut_48_1 = -var10 + 12288;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        break L14;
                      }
                    }
                    ((wsa) (this)).field_m = stackIn_50_1;
                    if (var11 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                L15: {
                  stackOut_51_0 = this;
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_52_0 = stackOut_51_0;
                  if (var6 == param3) {
                    stackOut_53_0 = this;
                    stackOut_53_1 = 20480 - -var10;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    break L15;
                  } else {
                    stackOut_52_0 = this;
                    stackOut_52_1 = -var9 + 4096;
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_54_1 = stackOut_52_1;
                    break L15;
                  }
                }
                ((wsa) (this)).field_m = stackIn_54_1;
                break L10;
              }
              this.field_m = this.field_m / 6;
              if (var11 != 0) {
                this.field_m = 0;
                return;
              } else {
                return;
              }
            } else {
              this.field_m = 0;
              return;
            }
          } else {
            L16: {
              stackOut_14_0 = this;
              stackOut_14_1 = var7 << 438361676;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              if (-2049 > (this.field_p ^ -1)) {
                stackOut_16_0 = this;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = 8192 + -(this.field_p * 2);
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L16;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = 2 * this.field_p;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                break L16;
              }
            }
            ((wsa) (this)).field_n = stackIn_17_1 / stackIn_17_2;
            if (var11 == 0) {
              if (var7 > 0) {
                L17: {
                  L18: {
                    var8 = (-param2 + var5 << 1407528556) / var7;
                    var9 = (-param3 + var5 << 664757452) / var7;
                    var10 = (-param1 + var5 << 1419796652) / var7;
                    if (var5 == param2) {
                      break L18;
                    } else {
                      L19: {
                        if (param3 == var5) {
                          break L19;
                        } else {
                          L20: {
                            stackOut_83_0 = this;
                            stackIn_85_0 = stackOut_83_0;
                            stackIn_84_0 = stackOut_83_0;
                            if (param2 == var6) {
                              stackOut_85_0 = this;
                              stackOut_85_1 = 12288 + var9;
                              stackIn_86_0 = stackOut_85_0;
                              stackIn_86_1 = stackOut_85_1;
                              break L20;
                            } else {
                              stackOut_84_0 = this;
                              stackOut_84_1 = 20480 + -var8;
                              stackIn_86_0 = stackOut_84_0;
                              stackIn_86_1 = stackOut_84_1;
                              break L20;
                            }
                          }
                          ((wsa) (this)).field_m = stackIn_86_1;
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L19;
                          }
                        }
                      }
                      L21: {
                        stackOut_87_0 = this;
                        stackIn_89_0 = stackOut_87_0;
                        stackIn_88_0 = stackOut_87_0;
                        if (param1 == var6) {
                          stackOut_89_0 = this;
                          stackOut_89_1 = var8 + 4096;
                          stackIn_90_0 = stackOut_89_0;
                          stackIn_90_1 = stackOut_89_1;
                          break L21;
                        } else {
                          stackOut_88_0 = this;
                          stackOut_88_1 = -var10 + 12288;
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_90_1 = stackOut_88_1;
                          break L21;
                        }
                      }
                      ((wsa) (this)).field_m = stackIn_90_1;
                      if (var11 == 0) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  L22: {
                    stackOut_91_0 = this;
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_92_0 = stackOut_91_0;
                    if (var6 == param3) {
                      stackOut_93_0 = this;
                      stackOut_93_1 = 20480 - -var10;
                      stackIn_94_0 = stackOut_93_0;
                      stackIn_94_1 = stackOut_93_1;
                      break L22;
                    } else {
                      stackOut_92_0 = this;
                      stackOut_92_1 = -var9 + 4096;
                      stackIn_94_0 = stackOut_92_0;
                      stackIn_94_1 = stackOut_92_1;
                      break L22;
                    }
                  }
                  ((wsa) (this)).field_m = stackIn_94_1;
                  break L17;
                }
                this.field_m = this.field_m / 6;
                if (var11 != 0) {
                  this.field_m = 0;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_m = 0;
                return;
              }
            } else {
              this.field_n = 0;
              if (var7 > 0) {
                L23: {
                  L24: {
                    var8 = (-param2 + var5 << 1407528556) / var7;
                    var9 = (-param3 + var5 << 664757452) / var7;
                    var10 = (-param1 + var5 << 1419796652) / var7;
                    if (var5 == param2) {
                      break L24;
                    } else {
                      L25: {
                        if (param3 == var5) {
                          break L25;
                        } else {
                          L26: {
                            stackOut_63_0 = this;
                            stackIn_65_0 = stackOut_63_0;
                            stackIn_64_0 = stackOut_63_0;
                            if (param2 == var6) {
                              stackOut_65_0 = this;
                              stackOut_65_1 = 12288 + var9;
                              stackIn_66_0 = stackOut_65_0;
                              stackIn_66_1 = stackOut_65_1;
                              break L26;
                            } else {
                              stackOut_64_0 = this;
                              stackOut_64_1 = 20480 + -var8;
                              stackIn_66_0 = stackOut_64_0;
                              stackIn_66_1 = stackOut_64_1;
                              break L26;
                            }
                          }
                          ((wsa) (this)).field_m = stackIn_66_1;
                          if (var11 == 0) {
                            break L23;
                          } else {
                            break L25;
                          }
                        }
                      }
                      L27: {
                        stackOut_67_0 = this;
                        stackIn_69_0 = stackOut_67_0;
                        stackIn_68_0 = stackOut_67_0;
                        if (param1 == var6) {
                          stackOut_69_0 = this;
                          stackOut_69_1 = var8 + 4096;
                          stackIn_70_0 = stackOut_69_0;
                          stackIn_70_1 = stackOut_69_1;
                          break L27;
                        } else {
                          stackOut_68_0 = this;
                          stackOut_68_1 = -var10 + 12288;
                          stackIn_70_0 = stackOut_68_0;
                          stackIn_70_1 = stackOut_68_1;
                          break L27;
                        }
                      }
                      ((wsa) (this)).field_m = stackIn_70_1;
                      if (var11 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L28: {
                    stackOut_71_0 = this;
                    stackIn_73_0 = stackOut_71_0;
                    stackIn_72_0 = stackOut_71_0;
                    if (var6 == param3) {
                      stackOut_73_0 = this;
                      stackOut_73_1 = 20480 - -var10;
                      stackIn_74_0 = stackOut_73_0;
                      stackIn_74_1 = stackOut_73_1;
                      break L28;
                    } else {
                      stackOut_72_0 = this;
                      stackOut_72_1 = -var9 + 4096;
                      stackIn_74_0 = stackOut_72_0;
                      stackIn_74_1 = stackOut_72_1;
                      break L28;
                    }
                  }
                  ((wsa) (this)).field_m = stackIn_74_1;
                  break L23;
                }
                this.field_m = this.field_m / 6;
                if (var11 != 0) {
                  this.field_m = 0;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_m = 0;
                return;
              }
            }
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      var4_int = param2;
                      if (-1 == (var4_int ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          if (-2 != (var4_int ^ -1)) {
                            break L5;
                          } else {
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (var4_int != 2) {
                          break L1;
                        } else {
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    this.field_o = param1.b(false);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                  this.field_s = (param1.c((byte) 36) << -1344103348) / 100;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                this.field_u = (param1.c((byte) 44) << -148049876) / 100;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("wsa.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        L0: {
          var5 = 15 & param3;
          if (-9 < (var5 ^ -1)) {
            stackOut_2_0 = param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (var5 >= 4) {
            if (12 == var5) {
              stackOut_17_0 = param1;
              stackIn_19_0 = stackOut_17_0;
              break L1;
            } else {
              if (-15 != (var5 ^ -1)) {
                stackOut_18_0 = param4;
                stackIn_19_0 = stackOut_18_0;
                break L1;
              } else {
                var7 = param1;
                if (param2 != 0) {
                  return -13;
                } else {
                  L2: {
                    if (-1 != (1 & var5 ^ -1)) {
                      stackOut_10_0 = -var6;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = var6;
                      stackIn_11_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  L3: {
                    stackOut_11_0 = stackIn_11_0;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if ((var5 & 2) == 0) {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = var7;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L3;
                    } else {
                      stackOut_12_0 = stackIn_12_0;
                      stackOut_12_1 = -var7;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L3;
                    }
                  }
                  return stackIn_14_0 - -stackIn_14_1;
                }
              }
            }
          } else {
            stackOut_4_0 = param0;
            stackIn_19_0 = stackOut_4_0;
            break L1;
          }
        }
        var7 = stackIn_19_0;
        if (param2 != 0) {
          return -13;
        } else {
          L4: {
            if (-1 != (1 & var5 ^ -1)) {
              stackOut_22_0 = -var6;
              stackIn_23_0 = stackOut_22_0;
              break L4;
            } else {
              stackOut_21_0 = var6;
              stackIn_23_0 = stackOut_21_0;
              break L4;
            }
          }
          L5: {
            stackOut_23_0 = stackIn_23_0;
            stackIn_25_0 = stackOut_23_0;
            stackIn_24_0 = stackOut_23_0;
            if ((var5 & 2) == 0) {
              stackOut_25_0 = stackIn_25_0;
              stackOut_25_1 = var7;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              break L5;
            } else {
              stackOut_24_0 = stackIn_24_0;
              stackOut_24_1 = -var7;
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              break L5;
            }
          }
          return stackIn_26_0 - -stackIn_26_1;
        }
    }

    static {
        field_v = new su(11, 0, 1, 2);
    }
}
