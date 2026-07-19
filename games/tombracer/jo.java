/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends rva implements tsa {
    int field_C;
    private int field_y;
    static String field_K;
    private boolean field_J;
    int field_O;
    private int field_B;
    private int field_I;
    static String field_E;
    private rj field_D;
    private rj field_F;
    private vp field_N;
    private rj field_z;
    private boolean field_P;
    private boolean field_x;
    private rj field_H;
    private int field_G;
    private rj field_L;
    int field_M;
    private int field_A;

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 > 44) {
                break L1;
              } else {
                this.field_J = true;
                break L1;
              }
            }
            L2: {
              if (param3 != 1) {
                break L2;
              } else {
                if (!this.field_x) {
                  break L2;
                } else {
                  L3: {
                    if (!this.field_P) {
                      break L3;
                    } else {
                      if (param2 != this.field_F) {
                        break L3;
                      } else {
                        this.a(this.field_O - this.field_M, (byte) -91);
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (!this.field_P) {
                        break L5;
                      } else {
                        if (param2 == this.field_H) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (!this.field_J) {
                        break L6;
                      } else {
                        if (this.field_L != param2) {
                          break L6;
                        } else {
                          this.b(13328, -this.field_A + this.field_C);
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (!this.field_J) {
                      break L2;
                    } else {
                      if (this.field_z == param2) {
                        this.b(13328, this.field_A + this.field_C);
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.a(this.field_M + this.field_O, (byte) -94);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6);
            stackOut_22_1 = new StringBuilder().append("jo.M(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (this.field_L == null) {
            this.field_D.field_i = 0;
            break L0;
          } else {
            this.field_L.field_i = 0;
            this.field_L.field_n = this.field_p + -this.field_L.field_p >> -1916107615;
            this.field_D.field_i = this.field_L.field_i + this.field_L.field_m;
            if (var3 == 0) {
              break L0;
            } else {
              this.field_D.field_i = 0;
              break L0;
            }
          }
        }
        if (this.field_z == null) {
          L1: {
            L2: {
              this.field_D.field_m = this.field_m + -this.field_D.field_i;
              this.h((byte) -125);
              if (this.field_F != null) {
                break L2;
              } else {
                this.field_D.field_n = 0;
                if (var3 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            this.field_F.field_i = -this.field_F.field_m + this.field_m >> -1349481183;
            this.field_F.field_n = 0;
            this.field_D.field_n = this.field_F.field_p + this.field_F.field_n;
            break L1;
          }
          if (param0 == 88) {
            L3: {
              L4: {
                if (null != this.field_H) {
                  break L4;
                } else {
                  this.field_D.field_p = this.field_p + -this.field_D.field_n;
                  if (var3 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_H.field_n = -this.field_H.field_p + this.field_p;
              this.field_H.field_i = -this.field_H.field_m + this.field_m >> -1482613119;
              this.field_D.field_p = -this.field_D.field_n + (this.field_p - this.field_H.field_p);
              break L3;
            }
            L5: {
              this.e(param0 + -214);
              if (!this.field_P) {
                this.field_N.field_n = 0;
                this.field_N.field_p = this.field_D.field_p;
                break L5;
              } else {
                break L5;
              }
            }
            if (this.field_J) {
              this.field_N.c((byte) 121);
              return;
            } else {
              this.field_N.field_i = 0;
              this.field_N.field_m = this.field_D.field_m;
              this.field_N.c((byte) 121);
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_z.field_i = this.field_m + -this.field_z.field_m;
          this.field_z.field_n = -this.field_z.field_p + this.field_p >> 1001194177;
          this.field_D.field_m = -this.field_z.field_m + (this.field_m - this.field_D.field_i);
          if (var3 == 0) {
            this.h((byte) -125);
            if (this.field_F != null) {
              this.field_F.field_i = -this.field_F.field_m + this.field_m >> -1349481183;
              this.field_F.field_n = 0;
              this.field_D.field_n = this.field_F.field_p + this.field_F.field_n;
              if (param0 == 88) {
                if (null != this.field_H) {
                  L6: {
                    this.field_H.field_n = -this.field_H.field_p + this.field_p;
                    this.field_H.field_i = -this.field_H.field_m + this.field_m >> -1482613119;
                    this.field_D.field_p = -this.field_D.field_n + (this.field_p - this.field_H.field_p);
                    this.e(param0 + -214);
                    if (!this.field_P) {
                      this.field_N.field_n = 0;
                      this.field_N.field_p = this.field_D.field_p;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (this.field_J) {
                    this.field_N.c((byte) 121);
                    return;
                  } else {
                    this.field_N.field_i = 0;
                    this.field_N.field_m = this.field_D.field_m;
                    this.field_N.c((byte) 121);
                    return;
                  }
                } else {
                  this.field_D.field_p = this.field_p + -this.field_D.field_n;
                  if (var3 == 0) {
                    L7: {
                      this.e(param0 + -214);
                      if (!this.field_P) {
                        this.field_N.field_n = 0;
                        this.field_N.field_p = this.field_D.field_p;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (this.field_J) {
                      this.field_N.c((byte) 121);
                      return;
                    } else {
                      this.field_N.field_i = 0;
                      this.field_N.field_m = this.field_D.field_m;
                      this.field_N.c((byte) 121);
                      return;
                    }
                  } else {
                    L8: {
                      this.field_H.field_n = -this.field_H.field_p + this.field_p;
                      this.field_H.field_i = -this.field_H.field_m + this.field_m >> -1482613119;
                      this.field_D.field_p = -this.field_D.field_n + (this.field_p - this.field_H.field_p);
                      this.e(param0 + -214);
                      if (!this.field_P) {
                        this.field_N.field_n = 0;
                        this.field_N.field_p = this.field_D.field_p;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (this.field_J) {
                      this.field_N.c((byte) 121);
                      return;
                    } else {
                      this.field_N.field_i = 0;
                      this.field_N.field_m = this.field_D.field_m;
                      this.field_N.c((byte) 121);
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              this.field_D.field_n = 0;
              if (var3 == 0) {
                if (param0 == 88) {
                  if (null != this.field_H) {
                    L9: {
                      this.field_H.field_n = -this.field_H.field_p + this.field_p;
                      this.field_H.field_i = -this.field_H.field_m + this.field_m >> -1482613119;
                      this.field_D.field_p = -this.field_D.field_n + (this.field_p - this.field_H.field_p);
                      this.e(param0 + -214);
                      if (!this.field_P) {
                        this.field_N.field_n = 0;
                        this.field_N.field_p = this.field_D.field_p;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (this.field_J) {
                      this.field_N.c((byte) 121);
                      return;
                    } else {
                      this.field_N.field_i = 0;
                      this.field_N.field_m = this.field_D.field_m;
                      this.field_N.c((byte) 121);
                      return;
                    }
                  } else {
                    this.field_D.field_p = this.field_p + -this.field_D.field_n;
                    if (var3 == 0) {
                      L10: {
                        this.e(param0 + -214);
                        if (!this.field_P) {
                          this.field_N.field_n = 0;
                          this.field_N.field_p = this.field_D.field_p;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      if (this.field_J) {
                        this.field_N.c((byte) 121);
                        return;
                      } else {
                        this.field_N.field_i = 0;
                        this.field_N.field_m = this.field_D.field_m;
                        this.field_N.c((byte) 121);
                        return;
                      }
                    } else {
                      L11: {
                        this.field_H.field_n = -this.field_H.field_p + this.field_p;
                        this.field_H.field_i = -this.field_H.field_m + this.field_m >> -1482613119;
                        this.field_D.field_p = -this.field_D.field_n + (this.field_p - this.field_H.field_p);
                        this.e(param0 + -214);
                        if (!this.field_P) {
                          this.field_N.field_n = 0;
                          this.field_N.field_p = this.field_D.field_p;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      if (this.field_J) {
                        this.field_N.c((byte) 121);
                        return;
                      } else {
                        this.field_N.field_i = 0;
                        this.field_N.field_m = this.field_D.field_m;
                        this.field_N.c((byte) 121);
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                this.field_F.field_i = -this.field_F.field_m + this.field_m >> -1349481183;
                this.field_F.field_n = 0;
                this.field_D.field_n = this.field_F.field_p + this.field_F.field_n;
                if (param0 == 88) {
                  if (null == this.field_H) {
                    this.field_D.field_p = this.field_p + -this.field_D.field_n;
                    if (var3 != 0) {
                      L12: {
                        this.field_H.field_n = -this.field_H.field_p + this.field_p;
                        this.field_H.field_i = -this.field_H.field_m + this.field_m >> -1482613119;
                        this.field_D.field_p = -this.field_D.field_n + (this.field_p - this.field_H.field_p);
                        this.e(param0 + -214);
                        if (!this.field_P) {
                          this.field_N.field_n = 0;
                          this.field_N.field_p = this.field_D.field_p;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      if (this.field_J) {
                        this.field_N.c((byte) 121);
                        return;
                      } else {
                        this.field_N.field_i = 0;
                        this.field_N.field_m = this.field_D.field_m;
                        this.field_N.c((byte) 121);
                        return;
                      }
                    } else {
                      L13: {
                        this.e(param0 + -214);
                        if (!this.field_P) {
                          this.field_N.field_n = 0;
                          this.field_N.field_p = this.field_D.field_p;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      if (this.field_J) {
                        this.field_N.c((byte) 121);
                        return;
                      } else {
                        this.field_N.field_i = 0;
                        this.field_N.field_m = this.field_D.field_m;
                        this.field_N.c((byte) 121);
                        return;
                      }
                    }
                  } else {
                    L14: {
                      this.field_H.field_n = -this.field_H.field_p + this.field_p;
                      this.field_H.field_i = -this.field_H.field_m + this.field_m >> -1482613119;
                      this.field_D.field_p = -this.field_D.field_n + (this.field_p - this.field_H.field_p);
                      this.e(param0 + -214);
                      if (!this.field_P) {
                        this.field_N.field_n = 0;
                        this.field_N.field_p = this.field_D.field_p;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    if (this.field_J) {
                      this.field_N.c((byte) 121);
                      return;
                    } else {
                      this.field_N.field_i = 0;
                      this.field_N.field_m = this.field_D.field_m;
                      this.field_N.c((byte) 121);
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L15: {
              this.field_D.field_m = this.field_m + -this.field_D.field_i;
              this.h((byte) -125);
              if (this.field_F != null) {
                break L15;
              } else {
                this.field_D.field_n = 0;
                break L15;
              }
            }
            this.field_F.field_i = -this.field_F.field_m + this.field_m >> -1349481183;
            this.field_F.field_n = 0;
            this.field_D.field_n = this.field_F.field_p + this.field_F.field_n;
            if (param0 == 88) {
              L16: {
                L17: {
                  if (null != this.field_H) {
                    break L17;
                  } else {
                    this.field_D.field_p = this.field_p + -this.field_D.field_n;
                    if (var3 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
                this.field_H.field_n = -this.field_H.field_p + this.field_p;
                this.field_H.field_i = -this.field_H.field_m + this.field_m >> -1482613119;
                this.field_D.field_p = -this.field_D.field_n + (this.field_p - this.field_H.field_p);
                break L16;
              }
              L18: {
                this.e(param0 + -214);
                if (!this.field_P) {
                  this.field_N.field_n = 0;
                  this.field_N.field_p = this.field_D.field_p;
                  break L18;
                } else {
                  break L18;
                }
              }
              if (this.field_J) {
                this.field_N.c((byte) 121);
                return;
              } else {
                this.field_N.field_i = 0;
                this.field_N.field_m = this.field_D.field_m;
                this.field_N.c((byte) 121);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    private final void b(int param0, boolean param1) {
        rj stackIn_1_0 = null;
        rj stackIn_2_0 = null;
        rj stackIn_6_0 = null;
        rj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        rj stackIn_13_0 = null;
        rj stackIn_14_0 = null;
        rj stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        rj stackIn_17_0 = null;
        rj stackIn_18_0 = null;
        rj stackIn_19_0 = null;
        rj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        rj stackIn_23_0 = null;
        rj stackIn_24_0 = null;
        rj stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        rj stackIn_28_0 = null;
        rj stackIn_29_0 = null;
        rj stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        rj stackIn_35_0 = null;
        rj stackIn_36_0 = null;
        rj stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        rj stackIn_40_0 = null;
        rj stackIn_41_0 = null;
        rj stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        rj stackIn_46_0 = null;
        rj stackIn_47_0 = null;
        rj stackIn_51_0 = null;
        rj stackIn_52_0 = null;
        rj stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        rj stackIn_56_0 = null;
        rj stackIn_57_0 = null;
        rj stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        rj stackIn_61_0 = null;
        rj stackIn_62_0 = null;
        rj stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        rj stackIn_66_0 = null;
        rj stackIn_67_0 = null;
        rj stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        rj stackIn_73_0 = null;
        rj stackIn_74_0 = null;
        rj stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        rj stackIn_78_0 = null;
        rj stackIn_79_0 = null;
        rj stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        rj stackIn_83_0 = null;
        rj stackIn_84_0 = null;
        rj stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        rj stackOut_0_0 = null;
        rj stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        rj stackOut_1_0 = null;
        rj stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        rj stackOut_5_0 = null;
        rj stackOut_17_0 = null;
        rj stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        rj stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        rj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        rj stackOut_12_0 = null;
        rj stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        rj stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        rj stackOut_34_0 = null;
        rj stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        rj stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        rj stackOut_22_0 = null;
        rj stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        rj stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        rj stackOut_27_0 = null;
        rj stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        rj stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        rj stackOut_45_0 = null;
        rj stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        rj stackOut_46_0 = null;
        rj stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        rj stackOut_55_0 = null;
        rj stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        rj stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        rj stackOut_60_0 = null;
        rj stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        rj stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        rj stackOut_50_0 = null;
        rj stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        rj stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        rj stackOut_77_0 = null;
        rj stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        rj stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        rj stackOut_82_0 = null;
        rj stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        rj stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        rj stackOut_72_0 = null;
        rj stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        rj stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        L0: {
          stackOut_0_0 = this.field_D;
          stackIn_40_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param1) {
            stackOut_40_0 = (rj) ((Object) stackIn_40_0);
            stackOut_40_1 = 1;
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            break L0;
          } else {
            stackOut_1_0 = (rj) ((Object) stackIn_1_0);
            stackIn_41_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!this.field_P) {
              stackOut_41_0 = (rj) ((Object) stackIn_41_0);
              stackOut_41_1 = 0;
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              break L0;
            } else {
              stackIn_2_0.field_y = true;
              if (param0 < -80) {
                L1: {
                  if (!(this.field_N.field_x instanceof rj)) {
                    break L1;
                  } else {
                    stackOut_5_0 = (rj) ((Object) this.field_N.field_x);
                    stackIn_17_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (!param1) {
                      L2: {
                        stackOut_17_0 = (rj) ((Object) stackIn_17_0);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (!this.field_P) {
                          stackOut_19_0 = (rj) ((Object) stackIn_19_0);
                          stackOut_19_1 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L2;
                        } else {
                          stackOut_18_0 = (rj) ((Object) stackIn_18_0);
                          stackOut_18_1 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L2;
                        }
                      }
                      stackIn_20_0.field_y = stackIn_20_1 != 0;
                      break L1;
                    } else {
                      L3: {
                        stackIn_6_0.field_y = true;
                        if (this.field_L == null) {
                          break L3;
                        } else {
                          stackOut_7_0 = this.field_L;
                          stackOut_7_1 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_9_0.field_y = stackIn_9_1 != 0;
                          break L3;
                        }
                      }
                      L4: {
                        if (this.field_z != null) {
                          L5: {
                            stackOut_12_0 = this.field_z;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (!param1) {
                              stackOut_14_0 = (rj) ((Object) stackIn_14_0);
                              stackOut_14_1 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              break L5;
                            } else {
                              stackOut_13_0 = (rj) ((Object) stackIn_13_0);
                              stackOut_13_1 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              stackIn_15_1 = stackOut_13_1;
                              break L5;
                            }
                          }
                          stackIn_15_0.field_y = stackIn_15_1 != 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      return;
                    }
                  }
                }
                if (this.field_L == null) {
                  L6: {
                    if (this.field_z != null) {
                      L7: {
                        stackOut_34_0 = this.field_z;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        if (!param1) {
                          stackOut_36_0 = (rj) ((Object) stackIn_36_0);
                          stackOut_36_1 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          break L7;
                        } else {
                          stackOut_35_0 = (rj) ((Object) stackIn_35_0);
                          stackOut_35_1 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          break L7;
                        }
                      }
                      stackIn_37_0.field_y = stackIn_37_1 != 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return;
                } else {
                  L8: {
                    stackOut_22_0 = this.field_L;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (!param1) {
                      stackOut_24_0 = (rj) ((Object) stackIn_24_0);
                      stackOut_24_1 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L8;
                    } else {
                      stackOut_23_0 = (rj) ((Object) stackIn_23_0);
                      stackOut_23_1 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      break L8;
                    }
                  }
                  L9: {
                    stackIn_25_0.field_y = stackIn_25_1 != 0;
                    if (this.field_z != null) {
                      L10: {
                        stackOut_27_0 = this.field_z;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if (!param1) {
                          stackOut_29_0 = (rj) ((Object) stackIn_29_0);
                          stackOut_29_1 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          break L10;
                        } else {
                          stackOut_28_0 = (rj) ((Object) stackIn_28_0);
                          stackOut_28_1 = 1;
                          stackIn_30_0 = stackOut_28_0;
                          stackIn_30_1 = stackOut_28_1;
                          break L10;
                        }
                      }
                      stackIn_30_0.field_y = stackIn_30_1 != 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        stackIn_42_0.field_y = stackIn_42_1 != 0;
        if (param0 < -80) {
          L11: {
            if (!(this.field_N.field_x instanceof rj)) {
              break L11;
            } else {
              L12: {
                stackOut_45_0 = (rj) ((Object) this.field_N.field_x);
                stackIn_66_0 = stackOut_45_0;
                stackIn_46_0 = stackOut_45_0;
                if (param1) {
                  stackOut_66_0 = (rj) ((Object) stackIn_66_0);
                  stackOut_66_1 = 1;
                  stackIn_68_0 = stackOut_66_0;
                  stackIn_68_1 = stackOut_66_1;
                  break L12;
                } else {
                  stackOut_46_0 = (rj) ((Object) stackIn_46_0);
                  stackIn_67_0 = stackOut_46_0;
                  stackIn_47_0 = stackOut_46_0;
                  if (!this.field_P) {
                    stackOut_67_0 = (rj) ((Object) stackIn_67_0);
                    stackOut_67_1 = 0;
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    break L12;
                  } else {
                    stackIn_47_0.field_y = true;
                    if (this.field_L != null) {
                      L13: {
                        stackOut_55_0 = this.field_L;
                        stackIn_57_0 = stackOut_55_0;
                        stackIn_56_0 = stackOut_55_0;
                        if (!param1) {
                          stackOut_57_0 = (rj) ((Object) stackIn_57_0);
                          stackOut_57_1 = 0;
                          stackIn_58_0 = stackOut_57_0;
                          stackIn_58_1 = stackOut_57_1;
                          break L13;
                        } else {
                          stackOut_56_0 = (rj) ((Object) stackIn_56_0);
                          stackOut_56_1 = 1;
                          stackIn_58_0 = stackOut_56_0;
                          stackIn_58_1 = stackOut_56_1;
                          break L13;
                        }
                      }
                      L14: {
                        stackIn_58_0.field_y = stackIn_58_1 != 0;
                        if (this.field_z != null) {
                          L15: {
                            stackOut_60_0 = this.field_z;
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_61_0 = stackOut_60_0;
                            if (!param1) {
                              stackOut_62_0 = (rj) ((Object) stackIn_62_0);
                              stackOut_62_1 = 0;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              break L15;
                            } else {
                              stackOut_61_0 = (rj) ((Object) stackIn_61_0);
                              stackOut_61_1 = 1;
                              stackIn_63_0 = stackOut_61_0;
                              stackIn_63_1 = stackOut_61_1;
                              break L15;
                            }
                          }
                          stackIn_63_0.field_y = stackIn_63_1 != 0;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      return;
                    } else {
                      L16: {
                        if (this.field_z != null) {
                          L17: {
                            stackOut_50_0 = this.field_z;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_51_0 = stackOut_50_0;
                            if (!param1) {
                              stackOut_52_0 = (rj) ((Object) stackIn_52_0);
                              stackOut_52_1 = 0;
                              stackIn_53_0 = stackOut_52_0;
                              stackIn_53_1 = stackOut_52_1;
                              break L17;
                            } else {
                              stackOut_51_0 = (rj) ((Object) stackIn_51_0);
                              stackOut_51_1 = 1;
                              stackIn_53_0 = stackOut_51_0;
                              stackIn_53_1 = stackOut_51_1;
                              break L17;
                            }
                          }
                          stackIn_53_0.field_y = stackIn_53_1 != 0;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              stackIn_68_0.field_y = stackIn_68_1 != 0;
              break L11;
            }
          }
          if (this.field_L != null) {
            L18: {
              stackOut_77_0 = this.field_L;
              stackIn_79_0 = stackOut_77_0;
              stackIn_78_0 = stackOut_77_0;
              if (!param1) {
                stackOut_79_0 = (rj) ((Object) stackIn_79_0);
                stackOut_79_1 = 0;
                stackIn_80_0 = stackOut_79_0;
                stackIn_80_1 = stackOut_79_1;
                break L18;
              } else {
                stackOut_78_0 = (rj) ((Object) stackIn_78_0);
                stackOut_78_1 = 1;
                stackIn_80_0 = stackOut_78_0;
                stackIn_80_1 = stackOut_78_1;
                break L18;
              }
            }
            L19: {
              stackIn_80_0.field_y = stackIn_80_1 != 0;
              if (this.field_z != null) {
                L20: {
                  stackOut_82_0 = this.field_z;
                  stackIn_84_0 = stackOut_82_0;
                  stackIn_83_0 = stackOut_82_0;
                  if (!param1) {
                    stackOut_84_0 = (rj) ((Object) stackIn_84_0);
                    stackOut_84_1 = 0;
                    stackIn_85_0 = stackOut_84_0;
                    stackIn_85_1 = stackOut_84_1;
                    break L20;
                  } else {
                    stackOut_83_0 = (rj) ((Object) stackIn_83_0);
                    stackOut_83_1 = 1;
                    stackIn_85_0 = stackOut_83_0;
                    stackIn_85_1 = stackOut_83_1;
                    break L20;
                  }
                }
                stackIn_85_0.field_y = stackIn_85_1 != 0;
                break L19;
              } else {
                break L19;
              }
            }
            return;
          } else {
            L21: {
              if (this.field_z != null) {
                L22: {
                  stackOut_72_0 = this.field_z;
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_73_0 = stackOut_72_0;
                  if (!param1) {
                    stackOut_74_0 = (rj) ((Object) stackIn_74_0);
                    stackOut_74_1 = 0;
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    break L22;
                  } else {
                    stackOut_73_0 = (rj) ((Object) stackIn_73_0);
                    stackOut_73_1 = 1;
                    stackIn_75_0 = stackOut_73_0;
                    stackIn_75_1 = stackOut_73_1;
                    break L22;
                  }
                }
                stackIn_75_0.field_y = stackIn_75_1 != 0;
                break L21;
              } else {
                break L21;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0, int param1) {
        this.a(param0 ^ 22876, param1);
        if (param0 != 13328) {
          return;
        } else {
          L0: {
            if (this.field_h instanceof tua) {
              ((tua) ((Object) this.field_h)).a(9776, (jo) (this), this.field_C, this.field_O);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void g(byte param0) {
        if (param0 >= -86) {
            return;
        }
        field_E = null;
        field_K = null;
    }

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > -30) {
          return;
        } else {
          L0: {
            if (this.field_L != null) {
              stackOut_3_0 = this.field_L.field_m + this.field_L.field_i;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = this.field_D.field_i;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (null == this.field_z) {
              stackOut_6_0 = this.field_D.field_m + (this.field_D.field_i - this.field_N.field_m);
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = -this.field_N.field_m + this.field_z.field_i;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          this.field_N.field_i = var2 + ((var3 - var2) * this.field_C >> 2118902000);
          return;
        }
    }

    private final void a(int param0, byte param1) {
        this.c(16, param0);
        if (param1 < -90) {
          if (this.field_h instanceof tua) {
            ((tua) ((Object) this.field_h)).a(9776, (jo) (this), this.field_O, this.field_O);
            return;
          } else {
            return;
          }
        } else {
          this.field_A = 107;
          if (!(this.field_h instanceof tua)) {
            return;
          } else {
            ((tua) ((Object) this.field_h)).a(9776, (jo) (this), this.field_O, this.field_O);
            return;
          }
        }
    }

    final static void a(jea param0, int param1, jea param2, jea param3, jea param4) {
        RuntimeException var5 = null;
        String var5_ref = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null == oea.field_i) {
              L1: {
                L2: {
                  ni.field_c = false;
                  if (!fua.field_g) {
                    break L2;
                  } else {
                    var5_ref = kia.field_a;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (ok.field_s) {
                    break L3;
                  } else {
                    var5_ref = wn.field_n;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                var5_ref = rsa.field_z;
                break L1;
              }
              var7 = (String) null;
              dqa.a(var5_ref, 0, (String) null, sva.field_d, 127);
              pq.field_g.field_N = sva.field_d - (sva.field_d >> -1435144575 & 8355711) + ((bn.field_t.field_N & 16711422) >> -1980545055);
              pq.field_g.field_ab = (8355711 & bn.field_t.field_ab >> -1789710879) + (-((sva.field_d & 16711423) >> -615129791) + sva.field_d);
              pq.field_g.field_gb = ((16711423 & bn.field_t.field_gb) >> -67066655) + (sva.field_d - (sva.field_d >> 2119614145 & 8355711));
              rma.field_b = mka.field_b;
              oea.field_i = pq.field_g;
              wi.field_s = new jea((long)param1, param4);
              lra.field_e = new jea(0L, param0);
              ep.field_r = new jea(0L, (jea) null);
              dh.field_e = new jea(0L, param3);
              pq.field_g = new jea(0L, param2);
              pq.field_g.field_H = lpa.field_s;
              dh.field_e.b(-123, pq.field_g);
              mka.field_b = new jea(0L, rma.field_b);
              dh.field_e.b(-128, mka.field_b);
              lra.field_d = new jea(0L, bn.field_t, fw.field_a);
              qpa.field_b = new jea(0L, bn.field_t);
              wi.field_s.b(param1 ^ -122, lra.field_e);
              wi.field_s.b(-123, ep.field_r);
              ep.field_r.b(-123, dh.field_e);
              ep.field_r.b(-126, lra.field_d);
              ep.field_r.b(-125, qpa.field_b);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("jo.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
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
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1 ^ 0, param2, param3);
                if (!(this.field_N.field_x instanceof rj)) {
                  break L2;
                } else {
                  if (!((rj) ((Object) this.field_N.field_x)).field_y) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (this.field_N.field_s == 1) {
                L3: {
                  L4: {
                    if (!this.field_J) {
                      break L4;
                    } else {
                      L5: {
                        var5_int = this.field_C;
                        this.d(-66);
                        if (this.field_C == var5_int) {
                          break L5;
                        } else {
                          if (!(this.field_h instanceof tua)) {
                            break L5;
                          } else {
                            ((tua) ((Object) this.field_h)).a(this.field_C, (jo) (this), true, this.field_C);
                            break L5;
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.h((byte) -101);
                  break L3;
                }
                L6: {
                  if (!this.field_P) {
                    break L6;
                  } else {
                    L7: {
                      var5_int = this.field_O;
                      this.f(param1 + -2031616);
                      if (this.field_O == var5_int) {
                        break L7;
                      } else {
                        if (this.field_h instanceof tua) {
                          ((tua) ((Object) this.field_h)).a(this.field_C, (jo) (this), true, this.field_O);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L6;
                    }
                  }
                }
                this.e(-125);
                break L1;
              } else {
                break L1;
              }
            }
            L8: {
              if (!this.field_D.field_y) {
                break L8;
              } else {
                if ((this.field_D.field_x ^ -1) == -2) {
                  L9: {
                    if (this.field_P) {
                      break L9;
                    } else {
                      if (this.field_J) {
                        L10: {
                          if ((this.field_N.field_m >> -999252223) + param0 + this.field_N.field_i < jba.field_j) {
                            break L10;
                          } else {
                            this.b(param1 + -2083824, this.field_C - this.field_y);
                            if (var7 == 0) {
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.b(param1 ^ 2110480, this.field_y + this.field_C);
                        if (var7 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    if (!this.field_J) {
                      break L11;
                    } else {
                      L12: {
                        L13: {
                          var5_int = -(this.field_N.field_m >> -1375942303) - (this.field_N.field_i - -this.field_i - jba.field_j - -param0);
                          var6 = sta.field_B - param3 - this.field_n - ((this.field_N.field_p >> -1545721567) + this.field_N.field_n);
                          if (Math.abs(var6) <= Math.abs(var5_int)) {
                            break L13;
                          } else {
                            L14: {
                              if (0 >= var6) {
                                break L14;
                              } else {
                                this.a(this.field_O - -this.field_B, (byte) -102);
                                if (var7 == 0) {
                                  break L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            this.a(-this.field_B + this.field_O, (byte) -113);
                            if (var7 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L15: {
                          if ((var5_int ^ -1) >= -1) {
                            break L15;
                          } else {
                            this.b(13328, this.field_y + this.field_C);
                            if (var7 == 0) {
                              break L12;
                            } else {
                              break L15;
                            }
                          }
                        }
                        this.b(13328, this.field_C + -this.field_y);
                        break L12;
                      }
                      if (var7 == 0) {
                        break L8;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L16: {
                    if (sta.field_B <= (this.field_N.field_p >> -372084575) + (this.field_N.field_n + param3)) {
                      break L16;
                    } else {
                      this.a(this.field_O + this.field_B, (byte) -109);
                      if (var7 == 0) {
                        break L8;
                      } else {
                        break L16;
                      }
                    }
                  }
                  this.a(this.field_O - this.field_B, (byte) -91);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L17: {
              if (param1 == 2097152) {
                break L17;
              } else {
                this.field_L = (rj) null;
                break L17;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var5);
            stackOut_49_1 = new StringBuilder().append("jo.A(").append(param0).append(',').append(param1).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param2 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L18;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L18;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param3 + ')');
        }
    }

    jo(int param0, int param1, int param2, int param3, isa param4, isa param5, isa param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        vp dupTemp$2 = null;
        rj dupTemp$3 = null;
        RuntimeException var16 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        this.field_O = 32768;
        this.field_y = 8192;
        this.field_I = 0;
        this.field_C = 32768;
        this.field_x = true;
        this.field_B = 8192;
        this.field_M = 1024;
        this.field_G = 0;
        this.field_A = 1024;
        try {
          L0: {
            L1: {
              this.field_w = new ae[6];
              dupTemp$2 = new vp(param0, param1, param7, param8, (isa) null, (qc) null, new rj(0, 0, param7, param8, param6, (qc) null), false, false);
              this.field_N = dupTemp$2;
              this.field_w[0] = (ae) ((Object) dupTemp$2);
              dupTemp$3 = new rj(param0, param1, param7, param8, param5, (qc) null);
              this.field_D = dupTemp$3;
              this.field_w[1] = (ae) ((Object) dupTemp$3);
              this.field_G = param10;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param12) {
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
            L2: {
              ((jo) (this)).field_P = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param11) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((jo) (this)).field_J = stackIn_7_1 != 0;
            this.field_I = param9;
            this.a(27980, param13);
            this.c(16, param14);
            this.a((byte) -31, param2, param3, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var16 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var16);
            stackOut_9_1 = new StringBuilder().append("jo.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
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
            if (param5 == null) {
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
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        if (param0 != 65536) {
          return;
        } else {
          L0: {
            if (null == this.field_F) {
              stackOut_3_0 = this.field_D.field_n;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = this.field_F.field_n + this.field_F.field_p;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (this.field_H == null) {
              stackOut_6_0 = -this.field_N.field_p + this.field_D.field_p + this.field_D.field_n;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = this.field_H.field_n - this.field_N.field_p;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          L2: {
            var3 = stackIn_7_0;
            stackOut_7_0 = this;
            stackOut_7_1 = 16;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (var2 < var3) {
              stackOut_9_0 = this;
              stackOut_9_1 = stackIn_9_1;
              stackOut_9_2 = (-var2 + this.field_N.field_n << -1027416880) / (var3 + -var2);
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = this;
              stackOut_8_1 = stackIn_8_1;
              stackOut_8_2 = 0;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          this.c(stackIn_10_1, stackIn_10_2);
          return;
        }
    }

    private final void a(int param0, int param1) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if ((param1 ^ -1) <= -1) {
          if (-65537 > (param1 ^ -1)) {
            this.field_C = 65536;
            this.h((byte) -110);
            if (param0 != 27980) {
              this.field_D = (rj) null;
              return;
            } else {
              return;
            }
          } else {
            this.field_C = param1;
            if (var4 == 0) {
              this.h((byte) -110);
              if (param0 != 27980) {
                this.field_D = (rj) null;
                return;
              } else {
                return;
              }
            } else {
              this.field_C = 65536;
              this.h((byte) -110);
              if (param0 != 27980) {
                this.field_D = (rj) null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          this.field_C = 0;
          if (var4 != 0) {
            if (-65537 <= (param1 ^ -1)) {
              this.field_C = param1;
              if (var4 == 0) {
                this.h((byte) -110);
                if (param0 != 27980) {
                  this.field_D = (rj) null;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_C = 65536;
                this.h((byte) -110);
                if (param0 != 27980) {
                  this.field_D = (rj) null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.field_C = 65536;
              this.h((byte) -110);
              if (param0 == 27980) {
                return;
              } else {
                this.field_D = (rj) null;
                return;
              }
            }
          } else {
            this.h((byte) -110);
            if (param0 != 27980) {
              this.field_D = (rj) null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_42_0 = 0;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_x) {
                  break L1;
                } else {
                  if (this.field_N.b((byte) -34)) {
                    if (param2 != 98) {
                      if (param2 != 99) {
                        if (param2 == 96) {
                          this.b(13328, this.field_C + -this.field_A);
                          stackOut_40_0 = 1;
                          stackIn_41_0 = stackOut_40_0;
                          decompiledRegionSelector0 = 10;
                          break L0;
                        } else {
                          if (97 == param2) {
                            this.b(13328, this.field_C - -this.field_A);
                            stackOut_38_0 = 1;
                            stackIn_39_0 = stackOut_38_0;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          } else {
                            if (104 == param2) {
                              this.a(this.field_O + -this.c(1553449360), (byte) -99);
                              stackOut_36_0 = 1;
                              stackIn_37_0 = stackOut_36_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if (105 == param2) {
                                this.a(this.field_O + this.c(1553449360), (byte) -127);
                                stackOut_34_0 = 1;
                                stackIn_35_0 = stackOut_34_0;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              } else {
                                if (102 == param2) {
                                  L2: {
                                    if (!this.field_P) {
                                      break L2;
                                    } else {
                                      if (!oj.field_tb[82]) {
                                        break L2;
                                      } else {
                                        this.a(0, (byte) -105);
                                        stackOut_28_0 = 1;
                                        stackIn_29_0 = stackOut_28_0;
                                        decompiledRegionSelector0 = 5;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (this.field_J) {
                                    this.b(13328, 0);
                                    stackOut_32_0 = 1;
                                    stackIn_33_0 = stackOut_32_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (param2 != 103) {
                                    break L1;
                                  } else {
                                    L3: {
                                      if (!this.field_P) {
                                        break L3;
                                      } else {
                                        if (!oj.field_tb[82]) {
                                          break L3;
                                        } else {
                                          this.a(65536, (byte) -123);
                                          stackOut_21_0 = 1;
                                          stackIn_22_0 = stackOut_21_0;
                                          decompiledRegionSelector0 = 3;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!this.field_J) {
                                      break L1;
                                    } else {
                                      this.b(13328, 65536);
                                      stackOut_24_0 = 1;
                                      stackIn_25_0 = stackOut_24_0;
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        this.a(this.field_O - -this.field_M, (byte) -111);
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      this.a(this.field_O + -this.field_M, (byte) -123);
                      stackOut_8_0 = 1;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return false;
                  }
                }
              }
              stackOut_42_0 = 0;
              stackIn_43_0 = stackOut_42_0;
              decompiledRegionSelector0 = 11;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var5);
            stackOut_44_1 = new StringBuilder().append("jo.P(").append(param0).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L4;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_29_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_33_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_35_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_37_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_39_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_41_0 != 0;
                            } else {
                              return stackIn_43_0 != 0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          if (param1 >= param2) {
            break L0;
          } else {
            L1: {
              var4 = param1 * this.field_D.field_m / param2;
              if (var4 < this.field_I) {
                var4 = this.field_I;
                break L1;
              } else {
                break L1;
              }
            }
            this.field_N.a((byte) -31, var4, this.field_N.field_p, this.field_N.field_i, this.field_N.field_n);
            this.b(-122, true);
            if (!TombRacer.field_G) {
              if (param0 < -81) {
                this.h((byte) -110);
                return;
              } else {
                this.field_z = (rj) null;
                this.h((byte) -110);
                return;
              }
            } else {
              break L0;
            }
          }
        }
        this.field_N.a((byte) -31, this.field_D.field_m, this.field_N.field_p, this.field_N.field_i, this.field_N.field_n);
        this.b(-82, false);
        if (param0 < -81) {
          this.h((byte) -110);
          return;
        } else {
          this.field_z = (rj) null;
          this.h((byte) -110);
          return;
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          if (param2 == -1789710879) {
            break L0;
          } else {
            this.c(-65, -82, -68);
            break L0;
          }
        }
        if (param1 < param0) {
          L1: {
            var4 = param1 * this.field_D.field_p / param0;
            if (this.field_G > var4) {
              var4 = this.field_G;
              break L1;
            } else {
              break L1;
            }
          }
          this.field_N.a((byte) -31, this.field_N.field_m, var4, this.field_N.field_i, this.field_N.field_n);
          this.a(1, true);
          this.e(param2 ^ 1789710944);
          return;
        } else {
          L2: {
            this.field_N.a((byte) -31, this.field_N.field_m, this.field_D.field_p, this.field_N.field_i, this.field_N.field_n);
            this.a(1, false);
            if (!TombRacer.field_G) {
              break L2;
            } else {
              L3: {
                var4 = param1 * this.field_D.field_p / param0;
                if (this.field_G > var4) {
                  var4 = this.field_G;
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_N.a((byte) -31, this.field_N.field_m, var4, this.field_N.field_i, this.field_N.field_n);
              this.a(1, true);
              break L2;
            }
          }
          this.e(param2 ^ 1789710944);
          return;
        }
    }

    private final void a(int param0, boolean param1) {
        rj stackIn_2_0 = null;
        rj stackIn_5_0 = null;
        rj stackIn_6_0 = null;
        rj stackIn_7_0 = null;
        rj stackIn_8_0 = null;
        rj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        rj stackIn_13_0 = null;
        rj stackIn_14_0 = null;
        rj stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        rj stackIn_18_0 = null;
        rj stackIn_19_0 = null;
        rj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        rj stackIn_22_0 = null;
        rj stackIn_23_0 = null;
        rj stackIn_24_0 = null;
        rj stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        rj stackIn_28_0 = null;
        rj stackIn_31_0 = null;
        rj stackIn_32_0 = null;
        rj stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        rj stackIn_36_0 = null;
        rj stackIn_37_0 = null;
        rj stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        rj stackIn_40_0 = null;
        rj stackIn_41_0 = null;
        rj stackIn_42_0 = null;
        rj stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        rj stackIn_47_0 = null;
        rj stackIn_48_0 = null;
        rj stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        rj stackIn_53_0 = null;
        rj stackIn_54_0 = null;
        rj stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        rj stackIn_58_0 = null;
        rj stackIn_59_0 = null;
        rj stackIn_62_0 = null;
        rj stackIn_63_0 = null;
        rj stackIn_66_0 = null;
        rj stackIn_67_0 = null;
        rj stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        rj stackIn_71_0 = null;
        rj stackIn_72_0 = null;
        rj stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        rj stackIn_75_0 = null;
        rj stackIn_76_0 = null;
        rj stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        rj stackIn_81_0 = null;
        rj stackIn_82_0 = null;
        rj stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        rj stackIn_87_0 = null;
        rj stackIn_88_0 = null;
        rj stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        rj stackIn_91_0 = null;
        rj stackIn_92_0 = null;
        rj stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        rj stackIn_96_0 = null;
        rj stackIn_97_0 = null;
        rj stackIn_100_0 = null;
        rj stackIn_101_0 = null;
        rj stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        rj stackIn_106_0 = null;
        rj stackIn_107_0 = null;
        rj stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        rj stackIn_110_0 = null;
        rj stackIn_111_0 = null;
        rj stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        rj stackIn_116_0 = null;
        rj stackIn_117_0 = null;
        rj stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        rj stackIn_122_0 = null;
        rj stackIn_123_0 = null;
        rj stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        rj stackOut_57_0 = null;
        rj stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        rj stackOut_58_0 = null;
        rj stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        rj stackOut_61_0 = null;
        rj stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        rj stackOut_62_0 = null;
        rj stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        rj stackOut_65_0 = null;
        rj stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        rj stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        rj stackOut_70_0 = null;
        rj stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        rj stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        rj stackOut_80_0 = null;
        rj stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        rj stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        rj stackOut_86_0 = null;
        rj stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        rj stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        rj stackOut_95_0 = null;
        rj stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        rj stackOut_96_0 = null;
        rj stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        rj stackOut_99_0 = null;
        rj stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        rj stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        rj stackOut_105_0 = null;
        rj stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        rj stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        rj stackOut_115_0 = null;
        rj stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        rj stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        rj stackOut_121_0 = null;
        rj stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        rj stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        rj stackOut_1_0 = null;
        rj stackOut_22_0 = null;
        rj stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        rj stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        rj stackOut_27_0 = null;
        rj stackOut_40_0 = null;
        rj stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        rj stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        rj stackOut_30_0 = null;
        rj stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        rj stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        rj stackOut_35_0 = null;
        rj stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        rj stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        rj stackOut_46_0 = null;
        rj stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        rj stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        rj stackOut_52_0 = null;
        rj stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        rj stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        rj stackOut_4_0 = null;
        rj stackOut_5_0 = null;
        rj stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        rj stackOut_6_0 = null;
        rj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        rj stackOut_12_0 = null;
        rj stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        rj stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        rj stackOut_17_0 = null;
        rj stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        rj stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        if (param0 == 1) {
          L0: {
            stackOut_57_0 = this.field_D;
            stackIn_91_0 = stackOut_57_0;
            stackIn_58_0 = stackOut_57_0;
            if (param1) {
              stackOut_91_0 = (rj) ((Object) stackIn_91_0);
              stackOut_91_1 = 1;
              stackIn_93_0 = stackOut_91_0;
              stackIn_93_1 = stackOut_91_1;
              break L0;
            } else {
              stackOut_58_0 = (rj) ((Object) stackIn_58_0);
              stackIn_92_0 = stackOut_58_0;
              stackIn_59_0 = stackOut_58_0;
              if (!this.field_J) {
                stackOut_92_0 = (rj) ((Object) stackIn_92_0);
                stackOut_92_1 = 0;
                stackIn_93_0 = stackOut_92_0;
                stackIn_93_1 = stackOut_92_1;
                break L0;
              } else {
                L1: {
                  stackIn_59_0.field_y = true;
                  if (this.field_N.field_x instanceof rj) {
                    L2: {
                      stackOut_61_0 = (rj) ((Object) this.field_N.field_x);
                      stackIn_75_0 = stackOut_61_0;
                      stackIn_62_0 = stackOut_61_0;
                      if (param1) {
                        stackOut_75_0 = (rj) ((Object) stackIn_75_0);
                        stackOut_75_1 = 1;
                        stackIn_77_0 = stackOut_75_0;
                        stackIn_77_1 = stackOut_75_1;
                        break L2;
                      } else {
                        stackOut_62_0 = (rj) ((Object) stackIn_62_0);
                        stackIn_76_0 = stackOut_62_0;
                        stackIn_63_0 = stackOut_62_0;
                        if (!this.field_J) {
                          stackOut_76_0 = (rj) ((Object) stackIn_76_0);
                          stackOut_76_1 = 0;
                          stackIn_77_0 = stackOut_76_0;
                          stackIn_77_1 = stackOut_76_1;
                          break L2;
                        } else {
                          L3: {
                            stackIn_63_0.field_y = true;
                            if (null != this.field_F) {
                              L4: {
                                stackOut_65_0 = this.field_F;
                                stackIn_67_0 = stackOut_65_0;
                                stackIn_66_0 = stackOut_65_0;
                                if (!param1) {
                                  stackOut_67_0 = (rj) ((Object) stackIn_67_0);
                                  stackOut_67_1 = 0;
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  break L4;
                                } else {
                                  stackOut_66_0 = (rj) ((Object) stackIn_66_0);
                                  stackOut_66_1 = 1;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_68_1 = stackOut_66_1;
                                  break L4;
                                }
                              }
                              stackIn_68_0.field_y = stackIn_68_1 != 0;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L5: {
                            if (this.field_H == null) {
                              break L5;
                            } else {
                              L6: {
                                stackOut_70_0 = this.field_H;
                                stackIn_72_0 = stackOut_70_0;
                                stackIn_71_0 = stackOut_70_0;
                                if (!param1) {
                                  stackOut_72_0 = (rj) ((Object) stackIn_72_0);
                                  stackOut_72_1 = 0;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  break L6;
                                } else {
                                  stackOut_71_0 = (rj) ((Object) stackIn_71_0);
                                  stackOut_71_1 = 1;
                                  stackIn_73_0 = stackOut_71_0;
                                  stackIn_73_1 = stackOut_71_1;
                                  break L6;
                                }
                              }
                              stackIn_73_0.field_y = stackIn_73_1 != 0;
                              break L5;
                            }
                          }
                          return;
                        }
                      }
                    }
                    stackIn_77_0.field_y = stackIn_77_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L7: {
                  if (null != this.field_F) {
                    L8: {
                      stackOut_80_0 = this.field_F;
                      stackIn_82_0 = stackOut_80_0;
                      stackIn_81_0 = stackOut_80_0;
                      if (!param1) {
                        stackOut_82_0 = (rj) ((Object) stackIn_82_0);
                        stackOut_82_1 = 0;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        break L8;
                      } else {
                        stackOut_81_0 = (rj) ((Object) stackIn_81_0);
                        stackOut_81_1 = 1;
                        stackIn_83_0 = stackOut_81_0;
                        stackIn_83_1 = stackOut_81_1;
                        break L8;
                      }
                    }
                    stackIn_83_0.field_y = stackIn_83_1 != 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (this.field_H != null) {
                  L9: {
                    stackOut_86_0 = this.field_H;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_87_0 = stackOut_86_0;
                    if (!param1) {
                      stackOut_88_0 = (rj) ((Object) stackIn_88_0);
                      stackOut_88_1 = 0;
                      stackIn_89_0 = stackOut_88_0;
                      stackIn_89_1 = stackOut_88_1;
                      break L9;
                    } else {
                      stackOut_87_0 = (rj) ((Object) stackIn_87_0);
                      stackOut_87_1 = 1;
                      stackIn_89_0 = stackOut_87_0;
                      stackIn_89_1 = stackOut_87_1;
                      break L9;
                    }
                  }
                  stackIn_89_0.field_y = stackIn_89_1 != 0;
                  return;
                } else {
                  return;
                }
              }
            }
          }
          L10: {
            stackIn_93_0.field_y = stackIn_93_1 != 0;
            if (this.field_N.field_x instanceof rj) {
              L11: {
                stackOut_95_0 = (rj) ((Object) this.field_N.field_x);
                stackIn_110_0 = stackOut_95_0;
                stackIn_96_0 = stackOut_95_0;
                if (param1) {
                  stackOut_110_0 = (rj) ((Object) stackIn_110_0);
                  stackOut_110_1 = 1;
                  stackIn_112_0 = stackOut_110_0;
                  stackIn_112_1 = stackOut_110_1;
                  break L11;
                } else {
                  stackOut_96_0 = (rj) ((Object) stackIn_96_0);
                  stackIn_111_0 = stackOut_96_0;
                  stackIn_97_0 = stackOut_96_0;
                  if (!this.field_J) {
                    stackOut_111_0 = (rj) ((Object) stackIn_111_0);
                    stackOut_111_1 = 0;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    break L11;
                  } else {
                    L12: {
                      stackIn_97_0.field_y = true;
                      if (null != this.field_F) {
                        L13: {
                          stackOut_99_0 = this.field_F;
                          stackIn_101_0 = stackOut_99_0;
                          stackIn_100_0 = stackOut_99_0;
                          if (!param1) {
                            stackOut_101_0 = (rj) ((Object) stackIn_101_0);
                            stackOut_101_1 = 0;
                            stackIn_102_0 = stackOut_101_0;
                            stackIn_102_1 = stackOut_101_1;
                            break L13;
                          } else {
                            stackOut_100_0 = (rj) ((Object) stackIn_100_0);
                            stackOut_100_1 = 1;
                            stackIn_102_0 = stackOut_100_0;
                            stackIn_102_1 = stackOut_100_1;
                            break L13;
                          }
                        }
                        stackIn_102_0.field_y = stackIn_102_1 != 0;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    if (this.field_H != null) {
                      L14: {
                        stackOut_105_0 = this.field_H;
                        stackIn_107_0 = stackOut_105_0;
                        stackIn_106_0 = stackOut_105_0;
                        if (!param1) {
                          stackOut_107_0 = (rj) ((Object) stackIn_107_0);
                          stackOut_107_1 = 0;
                          stackIn_108_0 = stackOut_107_0;
                          stackIn_108_1 = stackOut_107_1;
                          break L14;
                        } else {
                          stackOut_106_0 = (rj) ((Object) stackIn_106_0);
                          stackOut_106_1 = 1;
                          stackIn_108_0 = stackOut_106_0;
                          stackIn_108_1 = stackOut_106_1;
                          break L14;
                        }
                      }
                      stackIn_108_0.field_y = stackIn_108_1 != 0;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              stackIn_112_0.field_y = stackIn_112_1 != 0;
              break L10;
            } else {
              break L10;
            }
          }
          L15: {
            if (null != this.field_F) {
              L16: {
                stackOut_115_0 = this.field_F;
                stackIn_117_0 = stackOut_115_0;
                stackIn_116_0 = stackOut_115_0;
                if (!param1) {
                  stackOut_117_0 = (rj) ((Object) stackIn_117_0);
                  stackOut_117_1 = 0;
                  stackIn_118_0 = stackOut_117_0;
                  stackIn_118_1 = stackOut_117_1;
                  break L16;
                } else {
                  stackOut_116_0 = (rj) ((Object) stackIn_116_0);
                  stackOut_116_1 = 1;
                  stackIn_118_0 = stackOut_116_0;
                  stackIn_118_1 = stackOut_116_1;
                  break L16;
                }
              }
              stackIn_118_0.field_y = stackIn_118_1 != 0;
              break L15;
            } else {
              break L15;
            }
          }
          if (this.field_H != null) {
            L17: {
              stackOut_121_0 = this.field_H;
              stackIn_123_0 = stackOut_121_0;
              stackIn_122_0 = stackOut_121_0;
              if (!param1) {
                stackOut_123_0 = (rj) ((Object) stackIn_123_0);
                stackOut_123_1 = 0;
                stackIn_124_0 = stackOut_123_0;
                stackIn_124_1 = stackOut_123_1;
                break L17;
              } else {
                stackOut_122_0 = (rj) ((Object) stackIn_122_0);
                stackOut_122_1 = 1;
                stackIn_124_0 = stackOut_122_0;
                stackIn_124_1 = stackOut_122_1;
                break L17;
              }
            }
            stackIn_124_0.field_y = stackIn_124_1 != 0;
            return;
          } else {
            return;
          }
        } else {
          this.d(64);
          stackOut_1_0 = this.field_D;
          stackIn_22_0 = stackOut_1_0;
          stackIn_2_0 = stackOut_1_0;
          if (!param1) {
            L18: {
              stackOut_22_0 = (rj) ((Object) stackIn_22_0);
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (!this.field_J) {
                stackOut_24_0 = (rj) ((Object) stackIn_24_0);
                stackOut_24_1 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L18;
              } else {
                stackOut_23_0 = (rj) ((Object) stackIn_23_0);
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L18;
              }
            }
            L19: {
              stackIn_25_0.field_y = stackIn_25_1 != 0;
              if (this.field_N.field_x instanceof rj) {
                stackOut_27_0 = (rj) ((Object) this.field_N.field_x);
                stackIn_40_0 = stackOut_27_0;
                stackIn_28_0 = stackOut_27_0;
                if (!param1) {
                  L20: {
                    stackOut_40_0 = (rj) ((Object) stackIn_40_0);
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_41_0 = stackOut_40_0;
                    if (!this.field_J) {
                      stackOut_42_0 = (rj) ((Object) stackIn_42_0);
                      stackOut_42_1 = 0;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      break L20;
                    } else {
                      stackOut_41_0 = (rj) ((Object) stackIn_41_0);
                      stackOut_41_1 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      stackIn_43_1 = stackOut_41_1;
                      break L20;
                    }
                  }
                  stackIn_43_0.field_y = stackIn_43_1 != 0;
                  break L19;
                } else {
                  L21: {
                    stackIn_28_0.field_y = true;
                    if (null != this.field_F) {
                      L22: {
                        stackOut_30_0 = this.field_F;
                        stackIn_32_0 = stackOut_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        if (!param1) {
                          stackOut_32_0 = (rj) ((Object) stackIn_32_0);
                          stackOut_32_1 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          break L22;
                        } else {
                          stackOut_31_0 = (rj) ((Object) stackIn_31_0);
                          stackOut_31_1 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          stackIn_33_1 = stackOut_31_1;
                          break L22;
                        }
                      }
                      stackIn_33_0.field_y = stackIn_33_1 != 0;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L23: {
                    if (this.field_H == null) {
                      break L23;
                    } else {
                      L24: {
                        stackOut_35_0 = this.field_H;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_36_0 = stackOut_35_0;
                        if (!param1) {
                          stackOut_37_0 = (rj) ((Object) stackIn_37_0);
                          stackOut_37_1 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          break L24;
                        } else {
                          stackOut_36_0 = (rj) ((Object) stackIn_36_0);
                          stackOut_36_1 = 1;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          break L24;
                        }
                      }
                      stackIn_38_0.field_y = stackIn_38_1 != 0;
                      break L23;
                    }
                  }
                  return;
                }
              } else {
                break L19;
              }
            }
            L25: {
              if (null != this.field_F) {
                L26: {
                  stackOut_46_0 = this.field_F;
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_47_0 = stackOut_46_0;
                  if (!param1) {
                    stackOut_48_0 = (rj) ((Object) stackIn_48_0);
                    stackOut_48_1 = 0;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    break L26;
                  } else {
                    stackOut_47_0 = (rj) ((Object) stackIn_47_0);
                    stackOut_47_1 = 1;
                    stackIn_49_0 = stackOut_47_0;
                    stackIn_49_1 = stackOut_47_1;
                    break L26;
                  }
                }
                stackIn_49_0.field_y = stackIn_49_1 != 0;
                break L25;
              } else {
                break L25;
              }
            }
            if (this.field_H != null) {
              L27: {
                stackOut_52_0 = this.field_H;
                stackIn_54_0 = stackOut_52_0;
                stackIn_53_0 = stackOut_52_0;
                if (!param1) {
                  stackOut_54_0 = (rj) ((Object) stackIn_54_0);
                  stackOut_54_1 = 0;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  break L27;
                } else {
                  stackOut_53_0 = (rj) ((Object) stackIn_53_0);
                  stackOut_53_1 = 1;
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  break L27;
                }
              }
              stackIn_55_0.field_y = stackIn_55_1 != 0;
              return;
            } else {
              return;
            }
          } else {
            L28: {
              stackIn_2_0.field_y = true;
              if (this.field_N.field_x instanceof rj) {
                L29: {
                  L30: {
                    stackOut_4_0 = (rj) ((Object) this.field_N.field_x);
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (param1) {
                      break L30;
                    } else {
                      stackOut_5_0 = (rj) ((Object) stackIn_5_0);
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (!this.field_J) {
                        stackOut_8_0 = (rj) ((Object) stackIn_8_0);
                        stackOut_8_1 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L29;
                      } else {
                        stackOut_6_0 = (rj) ((Object) stackIn_6_0);
                        stackIn_7_0 = stackOut_6_0;
                        break L30;
                      }
                    }
                  }
                  stackOut_7_0 = (rj) ((Object) stackIn_7_0);
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L29;
                }
                stackIn_9_0.field_y = stackIn_9_1 != 0;
                break L28;
              } else {
                break L28;
              }
            }
            L31: {
              if (null != this.field_F) {
                L32: {
                  stackOut_12_0 = this.field_F;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (!param1) {
                    stackOut_14_0 = (rj) ((Object) stackIn_14_0);
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L32;
                  } else {
                    stackOut_13_0 = (rj) ((Object) stackIn_13_0);
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L32;
                  }
                }
                stackIn_15_0.field_y = stackIn_15_1 != 0;
                break L31;
              } else {
                break L31;
              }
            }
            L33: {
              if (this.field_H == null) {
                break L33;
              } else {
                L34: {
                  stackOut_17_0 = this.field_H;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (!param1) {
                    stackOut_19_0 = (rj) ((Object) stackIn_19_0);
                    stackOut_19_1 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L34;
                  } else {
                    stackOut_18_0 = (rj) ((Object) stackIn_18_0);
                    stackOut_18_1 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L34;
                  }
                }
                stackIn_20_0.field_y = stackIn_20_1 != 0;
                break L33;
              }
            }
            return;
          }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (this.field_F == null) {
            stackOut_2_0 = this.field_D.field_n;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_F.field_n + this.field_F.field_p;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 >= -122) {
          L1: {
            this.c(127, -127, -34);
            if (null == this.field_H) {
              stackOut_10_0 = this.field_D.field_p + (this.field_D.field_n + -this.field_N.field_p);
              stackIn_11_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = -this.field_N.field_p + this.field_H.field_n;
              stackIn_11_0 = stackOut_9_0;
              break L1;
            }
          }
          var3 = stackIn_11_0;
          this.field_N.field_n = ((var3 + -var2) * this.field_O >> -649866768) + var2;
          return;
        } else {
          L2: {
            if (null == this.field_H) {
              stackOut_6_0 = this.field_D.field_p + (this.field_D.field_n + -this.field_N.field_p);
              stackIn_7_0 = stackOut_6_0;
              break L2;
            } else {
              stackOut_5_0 = -this.field_N.field_p + this.field_H.field_n;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
          }
          var3 = stackIn_7_0;
          this.field_N.field_n = ((var3 + -var2) * this.field_O >> -649866768) + var2;
          return;
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!(!wqa.r((byte) -98))) {
            param1 = false;
        }
        sa.a(param1, (byte) 88);
        dla.b(23713);
        if (!param0) {
            jo.g((byte) 92);
            return;
        }
    }

    private final int c(int param0) {
        if (param0 != 1553449360) {
            return 79;
        }
        return (this.field_N.field_p << 1553449360) / this.field_D.field_p;
    }

    final boolean a(ae param0, boolean param1) {
        boolean discarded$2 = false;
        vp var3 = null;
        RuntimeException var3_ref = null;
        ae var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var4 = (ae) null;
                discarded$2 = this.a('', (ae) null, -82, true);
                break L1;
              }
            }
            L2: {
              var3 = this.field_N;
              if (var3 == null) {
                break L2;
              } else {
                if (!((ae) ((Object) var3)).a(param0, false)) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("jo.S(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    private final void d(int param0) {
        int var2 = this.field_L != null ? this.field_L.field_m + this.field_L.field_i : this.field_D.field_i;
        int var4 = 26 % ((param0 - 22) / 59);
        int var3 = null != this.field_z ? -this.field_N.field_m + this.field_z.field_i : -this.field_N.field_m + this.field_D.field_i + this.field_D.field_m;
        this.a(27980, var2 < var3 ? (-var2 + this.field_N.field_i << -411069264) / (var3 - var2) : 0);
    }

    final void c(int param0, int param1) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if ((param1 ^ -1) <= -1) {
          if (65536 >= param1) {
            this.field_O = param1;
            if (param0 != 16) {
              return;
            } else {
              this.e(param0 ^ -111);
              return;
            }
          } else {
            this.field_O = 65536;
            if (var4 == 0) {
              if (param0 != 16) {
                return;
              } else {
                this.e(param0 ^ -111);
                return;
              }
            } else {
              this.field_O = param1;
              if (param0 != 16) {
                return;
              } else {
                this.e(param0 ^ -111);
                return;
              }
            }
          }
        } else {
          this.field_O = 0;
          if (var4 != 0) {
            if (65536 < param1) {
              this.field_O = 65536;
              if (var4 == 0) {
                if (param0 != 16) {
                  return;
                } else {
                  this.e(param0 ^ -111);
                  return;
                }
              } else {
                this.field_O = param1;
                if (param0 != 16) {
                  return;
                } else {
                  this.e(param0 ^ -111);
                  return;
                }
              }
            } else {
              this.field_O = param1;
              if (param0 != 16) {
                return;
              } else {
                this.e(param0 ^ -111);
                return;
              }
            }
          } else {
            if (param0 != 16) {
              return;
            } else {
              this.e(param0 ^ -111);
              return;
            }
          }
        }
    }

    final static an a(kh param0, boolean param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        an var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        an stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        an stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.b((byte) 44, 8);
            if (0 < var2_int) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_E = (String) null;
                  break L1;
                }
              }
              L2: {
                var3 = uha.a(5907, param0) ? 1 : 0;
                var4 = uha.a(5907, param0) ? 1 : 0;
                var5 = new an();
                var5.field_I = (short)param0.b((byte) 44, 16);
                var5.field_l = me.a((byte) 76, 16, param0, var5.field_l);
                var5.field_h = me.a((byte) 88, 16, param0, var5.field_h);
                var5.field_t = me.a((byte) 73, 16, param0, var5.field_t);
                var5.field_u = (short)param0.b((byte) 44, 16);
                var5.field_B = me.a((byte) 102, 16, param0, var5.field_B);
                var5.field_w = me.a((byte) 98, 16, param0, var5.field_w);
                var5.field_f = me.a((byte) 94, 16, param0, var5.field_f);
                if (var3 != 0) {
                  var5.field_A = (short)param0.b((byte) 44, 16);
                  var5.field_k = me.a((byte) 96, 16, param0, var5.field_k);
                  var5.field_c = me.a((byte) 89, 16, param0, var5.field_c);
                  var5.field_r = me.a((byte) 91, 16, param0, var5.field_r);
                  var5.field_C = me.a((byte) 73, 16, param0, var5.field_C);
                  var5.field_s = me.a((byte) 111, 16, param0, var5.field_s);
                  var5.field_y = me.a((byte) 101, 16, param0, var5.field_y);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  discarded$1 = param0.b((byte) 44, 16);
                  var5.field_H = me.a((byte) 76, 16, param0, var5.field_H);
                  var5.field_e = me.a((byte) 73, 16, param0, var5.field_e);
                  var5.field_d = me.a((byte) 105, 16, param0, var5.field_d);
                  var5.field_N = me.a((byte) 101, 16, param0, var5.field_N);
                  var5.field_D = me.a((byte) 100, 16, param0, var5.field_D);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (uha.a(5907, param0)) {
                  var5.field_M = me.a((byte) 74, 16, param0, var5.field_M);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!uha.a(5907, param0)) {
                  break L5;
                } else {
                  var5.field_q = goa.a(16, -4854, param0, var5.field_q);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        L9: {
                          if (var7 >= var5.field_q.length) {
                            break L9;
                          } else {
                            var10 = var6;
                            var9 = var5.field_q[var7] & 255;
                            if (var8 != 0) {
                              if (var9 != var10) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              L10: {
                                if (var9 > var10) {
                                  var6 = var5.field_q[var7] & 255;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var7++;
                              if (var8 == 0) {
                                continue L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (var6 != 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                      var5.field_q = null;
                      if (var8 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                    var5.field_K = (byte)(1 + var6);
                    break L5;
                  }
                }
              }
              stackOut_29_0 = (an) (var5);
              stackIn_30_0 = stackOut_29_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var2);
            stackOut_31_1 = new StringBuilder().append("jo.O(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        return stackIn_30_0;
    }

    static {
        field_K = "Account created successfully!";
    }
}
