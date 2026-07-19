/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class v {
    private int[] field_l;
    private int[] field_n;
    private vb field_d;
    int[] field_h;
    private boolean field_q;
    private int field_i;
    int field_b;
    private int[] field_a;
    private int field_m;
    int[] field_k;
    int[] field_p;
    int[] field_e;
    int[] field_o;
    private int[] field_r;
    static String field_f;
    private int field_g;
    int[] field_c;
    private int field_j;

    private final boolean b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          this.a(-100, this.field_k);
          var3 = this.field_k[0];
          var4 = this.field_k[1];
          var5 = -this.field_p[0] + var3;
          var6 = -this.field_p[1] + var4;
          var7 = 16;
          if ((param1 ^ -1) >= 0) {
            break L0;
          } else {
            var7 = param1;
            break L0;
          }
        }
        var8 = 2;
        this.field_l[0] = this.a(this.field_l[0], 6198, var5, var8, var7);
        this.field_l[1] = this.a(this.field_l[1], 6198, var6, var8, var7);
        if (param0 < -118) {
          this.field_p[1] = this.field_p[1] + this.field_l[1];
          this.field_p[0] = this.field_p[0] + this.field_l[0];
          this.a(-78, this.field_p);
          this.a(false);
          this.h(-1);
          if (0 == this.field_l[0]) {
            if (0 != this.field_l[1]) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.f(-83);
          this.field_p[1] = this.field_p[1] + this.field_l[1];
          this.field_p[0] = this.field_p[0] + this.field_l[0];
          this.a(-78, this.field_p);
          this.a(false);
          this.h(-1);
          if (0 == this.field_l[0]) {
            if (0 != this.field_l[1]) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_89_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = param0;
        if (param2 == 0) {
          return 0;
        } else {
          if (param1 == 6198) {
            if (param0 == param2) {
              return param0;
            } else {
              L0: {
                if ((param2 ^ -1) > -1) {
                  stackOut_10_0 = -1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L0;
                }
              }
              L1: {
                L2: {
                  var8 = stackIn_11_0;
                  param2 = param2 * var8;
                  if (param0 == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (0 > param0) {
                        stackOut_14_0 = -1;
                        stackIn_15_0 = stackOut_14_0;
                        break L3;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        break L3;
                      }
                    }
                    var7 = stackIn_15_0;
                    param0 = var7 * param0;
                    if (var14 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = var8;
                break L1;
              }
              if (param2 < param0) {
                return var8 * param2;
              } else {
                L4: {
                  if (var7 == var8) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L4;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_23_0;
                  if (param4 > param0) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L5;
                  } else {
                    stackOut_24_0 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    break L5;
                  }
                }
                var10 = stackIn_26_0;
                var11 = this.a((byte) -70, param0, param2) ? 1 : 0;
                if (param3 <= param4 - param0) {
                  if (Math.abs(param2) > param3 + param0) {
                    L6: {
                      var12 = 1;
                      if (param4 <= param0) {
                        stackOut_88_0 = 0;
                        stackIn_89_0 = stackOut_88_0;
                        break L6;
                      } else {
                        stackOut_87_0 = 1;
                        stackIn_89_0 = stackOut_87_0;
                        break L6;
                      }
                    }
                    var13 = stackIn_89_0;
                    if (var9 == 0) {
                      L7: {
                        if (var10 != 0) {
                          var6 = param0 * 7 >> -1696609885;
                          if (var14 != 0) {
                            break L7;
                          } else {
                            var6 = var6 * var7;
                            return var6;
                          }
                        } else {
                          if (var11 == 0) {
                            break L7;
                          } else {
                            var6 = param0 * 7 >> -1696609885;
                            if (var14 != 0) {
                              L8: {
                                if (var12 == 0) {
                                  break L8;
                                } else {
                                  var6 = param0 - -param3;
                                  break L8;
                                }
                              }
                              if (var13 == 0) {
                                var6 = var6 * var7;
                                return var6;
                              } else {
                                L9: {
                                  var6 = param0 - -1;
                                  if (var14 == 0) {
                                    break L9;
                                  } else {
                                    var6 = param0 >> -2127732253;
                                    break L9;
                                  }
                                }
                                var6 = var6 * var7;
                                return var6;
                              }
                            } else {
                              var6 = var6 * var7;
                              return var6;
                            }
                          }
                        }
                      }
                      L10: {
                        if (var12 == 0) {
                          break L10;
                        } else {
                          var6 = param0 - -param3;
                          if (var14 != 0) {
                            break L10;
                          } else {
                            var6 = var6 * var7;
                            return var6;
                          }
                        }
                      }
                      if (var13 == 0) {
                        var6 = var6 * var7;
                        return var6;
                      } else {
                        L11: {
                          var6 = param0 - -1;
                          if (var14 == 0) {
                            break L11;
                          } else {
                            var6 = param0 >> -2127732253;
                            break L11;
                          }
                        }
                        var6 = var6 * var7;
                        return var6;
                      }
                    } else {
                      var6 = param0 >> -2127732253;
                      var6 = var6 * var7;
                      return var6;
                    }
                  } else {
                    L12: {
                      var12 = 0;
                      if (param4 <= param0) {
                        stackOut_60_0 = 0;
                        stackIn_61_0 = stackOut_60_0;
                        break L12;
                      } else {
                        stackOut_59_0 = 1;
                        stackIn_61_0 = stackOut_59_0;
                        break L12;
                      }
                    }
                    var13 = stackIn_61_0;
                    if (var9 == 0) {
                      L13: {
                        if (var10 != 0) {
                          var6 = param0 * 7 >> -1696609885;
                          if (var14 != 0) {
                            break L13;
                          } else {
                            var6 = var6 * var7;
                            return var6;
                          }
                        } else {
                          if (var11 == 0) {
                            break L13;
                          } else {
                            var6 = param0 * 7 >> -1696609885;
                            if (var14 != 0) {
                              L14: {
                                if (var12 == 0) {
                                  break L14;
                                } else {
                                  var6 = param0 - -param3;
                                  break L14;
                                }
                              }
                              if (var13 == 0) {
                                var6 = var6 * var7;
                                return var6;
                              } else {
                                L15: {
                                  var6 = param0 - -1;
                                  if (var14 == 0) {
                                    break L15;
                                  } else {
                                    var6 = param0 >> -2127732253;
                                    break L15;
                                  }
                                }
                                var6 = var6 * var7;
                                return var6;
                              }
                            } else {
                              var6 = var6 * var7;
                              return var6;
                            }
                          }
                        }
                      }
                      L16: {
                        if (var12 == 0) {
                          break L16;
                        } else {
                          var6 = param0 - -param3;
                          if (var14 != 0) {
                            break L16;
                          } else {
                            var6 = var6 * var7;
                            return var6;
                          }
                        }
                      }
                      if (var13 != 0) {
                        L17: {
                          var6 = param0 - -1;
                          if (var14 == 0) {
                            break L17;
                          } else {
                            var6 = param0 >> -2127732253;
                            break L17;
                          }
                        }
                        var6 = var6 * var7;
                        return var6;
                      } else {
                        var6 = var6 * var7;
                        return var6;
                      }
                    } else {
                      var6 = param0 >> -2127732253;
                      var6 = var6 * var7;
                      return var6;
                    }
                  }
                } else {
                  L18: {
                    var12 = 0;
                    if (param4 <= param0) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L18;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L18;
                    }
                  }
                  var13 = stackIn_30_0;
                  if (var9 == 0) {
                    L19: {
                      if (var10 != 0) {
                        var6 = param0 * 7 >> -1696609885;
                        if (var14 != 0) {
                          break L19;
                        } else {
                          var6 = var6 * var7;
                          return var6;
                        }
                      } else {
                        if (var11 == 0) {
                          break L19;
                        } else {
                          var6 = param0 * 7 >> -1696609885;
                          if (var14 != 0) {
                            L20: {
                              if (var12 == 0) {
                                break L20;
                              } else {
                                var6 = param0 - -param3;
                                if (var14 != 0) {
                                  break L20;
                                } else {
                                  var6 = var6 * var7;
                                  return var6;
                                }
                              }
                            }
                            if (var13 == 0) {
                              var6 = var6 * var7;
                              return var6;
                            } else {
                              L21: {
                                var6 = param0 - -1;
                                if (var14 == 0) {
                                  break L21;
                                } else {
                                  var6 = param0 >> -2127732253;
                                  break L21;
                                }
                              }
                              var6 = var6 * var7;
                              return var6;
                            }
                          } else {
                            var6 = var6 * var7;
                            return var6;
                          }
                        }
                      }
                    }
                    L22: {
                      if (var12 == 0) {
                        break L22;
                      } else {
                        var6 = param0 - -param3;
                        if (var14 != 0) {
                          break L22;
                        } else {
                          var6 = var6 * var7;
                          return var6;
                        }
                      }
                    }
                    if (var13 == 0) {
                      var6 = var6 * var7;
                      return var6;
                    } else {
                      L23: {
                        var6 = param0 - -1;
                        if (var14 == 0) {
                          break L23;
                        } else {
                          var6 = param0 >> -2127732253;
                          break L23;
                        }
                      }
                      var6 = var6 * var7;
                      return var6;
                    }
                  } else {
                    var6 = param0 >> -2127732253;
                    var6 = var6 * var7;
                    return var6;
                  }
                }
              }
            }
          } else {
            return -40;
          }
        }
    }

    private final boolean a(boolean param0, boolean param1, int param2, int param3) {
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        if (param1) {
          if (param2 >= 0) {
            if (0 <= param3) {
              L0: {
                this.field_p[0] = this.field_p[0] - (param2 + -this.field_a[0]);
                this.field_p[1] = this.field_p[1] - (-this.field_a[1] + param3);
                this.field_a[0] = param2;
                this.field_a[1] = param3;
                this.a(-85, this.field_p);
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param0) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L0;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L0;
                }
              }
              this.a(stackIn_9_1 != 0);
              this.h(-1);
              if (!param0) {
                this.a((byte) 70, 24);
                return true;
              } else {
                return true;
              }
            } else {
              this.field_a[0] = param2;
              this.field_a[1] = param3;
              return false;
            }
          } else {
            this.field_a[0] = param2;
            this.field_a[1] = param3;
            return false;
          }
        } else {
          this.field_a[0] = param2;
          this.field_a[1] = param3;
          return false;
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = param1;
        var5 = 0;
        L0: while (true) {
          if ((var4 ^ -1) >= -1) {
            if (param0 == -70) {
              if ((param2 - var5 ^ -1) >= -1) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            var5 = var5 + var4;
            var4 = 7 * var4 >> 419772515;
            if (var6 == 0) {
              continue L0;
            } else {
              if ((param2 - var5 ^ -1) >= -1) {
                return true;
              } else {
                return false;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        this.field_p[1] = param1;
        this.field_p[0] = param0;
        this.a(-93, this.field_p);
        this.a(false);
        if (param2 <= 54) {
          this.field_m = -31;
          this.h(-1);
          return;
        } else {
          this.h(-1);
          return;
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            var4 = 0;
            if (-1 >= param2) {
              break L1;
            } else {
              if (param2 >= this.field_j) {
                break L1;
              } else {
                if (0 <= (param0 ^ -1)) {
                  break L1;
                } else {
                  if (this.field_j <= param0) {
                    break L1;
                  } else {
                    var4 = var4 + this.field_o[param2 + param0 * this.field_j];
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          var4 += 255;
          break L0;
        }
        L2: {
          L3: {
            L4: {
              if (-1 >= param2 + 1) {
                break L4;
              } else {
                if (this.field_j <= param2 - -1) {
                  break L4;
                } else {
                  if (param0 <= -1) {
                    break L4;
                  } else {
                    if (param0 < this.field_j) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            var4 += 255;
            if (var5 == 0) {
              break L2;
            } else {
              break L3;
            }
          }
          var4 = var4 + this.field_o[this.field_j * param0 + 1 + param2];
          break L2;
        }
        L5: {
          L6: {
            if (param2 - -1 <= -1) {
              break L6;
            } else {
              if (this.field_j <= 1 + param2) {
                break L6;
              } else {
                if (0 <= (param0 - -1 ^ -1)) {
                  break L6;
                } else {
                  if (param0 - -1 >= this.field_j) {
                    break L6;
                  } else {
                    var4 = var4 + this.field_o[(1 + param0) * this.field_j + (param2 - -1)];
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
          }
          var4 += 255;
          break L5;
        }
        L7: {
          if (param1 == -4510) {
            break L7;
          } else {
            v.d((byte) -11);
            break L7;
          }
        }
        L8: {
          if ((param2 ^ -1) >= 0) {
            break L8;
          } else {
            if (param2 >= this.field_j) {
              break L8;
            } else {
              if (-1 >= param0 - -1) {
                break L8;
              } else {
                if (this.field_j <= 1 + param0) {
                  break L8;
                } else {
                  var4 = var4 + this.field_o[this.field_j * (1 + param0) + param2];
                  return var4 >> 1388444194;
                }
              }
            }
          }
        }
        var4 += 255;
        if (var5 != 0) {
          var4 = var4 + this.field_o[this.field_j * (1 + param0) + param2];
          return var4 >> 1388444194;
        } else {
          return var4 >> 1388444194;
        }
    }

    final void c(int param0) {
        this.f(-41);
        this.field_e[0] = -this.field_p[0] + (this.field_k[0] + (so.field_b.field_a >> 1789939649));
        if (param0 != 9470337) {
          this.field_q = false;
          this.field_e[1] = -this.field_p[1] + (this.field_k[1] + (so.field_b.field_g >> 9470337) - 20);
          return;
        } else {
          this.field_e[1] = -this.field_p[1] + (this.field_k[1] + (so.field_b.field_g >> 9470337) - 20);
          return;
        }
    }

    final void j(int param0) {
        if (param0 > -117) {
            return;
        }
        this.a(false);
        this.h(-1);
    }

    private final void c(byte param0) {
        this.f(-115);
        if (param0 != -28) {
          field_f = (String) null;
          this.field_g = this.field_k[0];
          this.field_i = this.field_k[1];
          this.a(false);
          this.h(param0 + 27);
          return;
        } else {
          this.field_g = this.field_k[0];
          this.field_i = this.field_k[1];
          this.a(false);
          this.h(param0 + 27);
          return;
        }
    }

    private final void a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 40 * this.field_j >> -809523839;
              if (param0 < -76) {
                break L1;
              } else {
                this.field_d = (vb) null;
                break L1;
              }
            }
            L2: {
              var4 = param1[0] - (var3_int << 542256097) >> 1113661985;
              var5 = param1[1] - var3_int;
              if (Math.abs(var4) - -Math.abs(var5) <= var3_int) {
                break L2;
              } else {
                L3: {
                  L4: {
                    var6 = -var3_int + (Math.abs(var4) + Math.abs(var5)) >> -467958783;
                    if (0 >= var4) {
                      break L4;
                    } else {
                      param1[0] = param1[0] - (var6 << 754877537);
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  param1[0] = param1[0] + (var6 << -1640928479);
                  break L3;
                }
                L5: {
                  if (-1 > (var5 ^ -1)) {
                    break L5;
                  } else {
                    param1[1] = param1[1] + var6;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                param1[1] = param1[1] - var6;
                break L2;
              }
            }
            L6: {
              L7: {
                var5 = param1[1] + -var3_int;
                var4 = -(var3_int << -1510912799) + param1[0] >> -1055977439;
                var3_int -= 100;
                if (var3_int < var4) {
                  break L7;
                } else {
                  if (var4 >= -var3_int) {
                    break L6;
                  } else {
                    param1[0] = param1[0] - (var3_int + var4 << 162883169);
                    if (var7 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              param1[0] = param1[0] - (-var3_int + var4 << 1873418465);
              break L6;
            }
            L8: {
              if (var5 > var3_int) {
                break L8;
              } else {
                L9: {
                  if (-var3_int <= var5) {
                    break L9;
                  } else {
                    param1[1] = param1[1] - (var3_int + var5);
                    if (var7 == 0) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                break L0;
              }
            }
            param1[1] = param1[1] - (var5 - var3_int);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("v.NA(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
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
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_13_6 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_12_6 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        int stackOut_11_6 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == 1745035905) {
          var3 = this.field_n[0];
          var4 = this.field_n[1];
          var4 -= 3;
          this.field_c[0] = var3;
          this.field_c[1] = var4;
          this.f(param1 ^ -1745035990);
          this.i(0);
          var5 = this.field_e[0] - -40;
          var6 = this.field_e[1] - 20;
          var7 = var5;
          var8 = var6;
          var9 = var3;
          var10 = var4;
          var11 = so.field_b.field_a;
          var12 = so.field_b.field_g;
          qn.f(0, 0, var11, var12);
          var13 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var8 >= 256 + var12 + 40) {
                  break L2;
                } else {
                  L3: while (true) {
                    stackOut_4_0 = 80 + var11;
                    stackIn_24_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var14 != 0) {
                      break L1;
                    } else {
                      L4: {
                        if (stackIn_5_0 <= var7) {
                          break L4;
                        } else {
                          L5: {
                            if ((var9 ^ -1) > 0) {
                              break L5;
                            } else {
                              if (var9 > this.field_j) {
                                break L5;
                              } else {
                                if (var10 < -1) {
                                  break L5;
                                } else {
                                  if (this.field_m < var10) {
                                    break L5;
                                  } else {
                                    L6: {
                                      stackOut_10_0 = var10;
                                      stackOut_10_1 = var9;
                                      stackOut_10_2 = param0;
                                      stackOut_10_3 = var8;
                                      stackOut_10_4 = 99;
                                      stackOut_10_5 = var7;
                                      stackIn_12_0 = stackOut_10_0;
                                      stackIn_12_1 = stackOut_10_1;
                                      stackIn_12_2 = stackOut_10_2;
                                      stackIn_12_3 = stackOut_10_3;
                                      stackIn_12_4 = stackOut_10_4;
                                      stackIn_12_5 = stackOut_10_5;
                                      stackIn_11_0 = stackOut_10_0;
                                      stackIn_11_1 = stackOut_10_1;
                                      stackIn_11_2 = stackOut_10_2;
                                      stackIn_11_3 = stackOut_10_3;
                                      stackIn_11_4 = stackOut_10_4;
                                      stackIn_11_5 = stackOut_10_5;
                                      if (var8 <= var12 + 40) {
                                        stackOut_12_0 = stackIn_12_0;
                                        stackOut_12_1 = stackIn_12_1;
                                        stackOut_12_2 = stackIn_12_2;
                                        stackOut_12_3 = stackIn_12_3;
                                        stackOut_12_4 = stackIn_12_4;
                                        stackOut_12_5 = stackIn_12_5;
                                        stackOut_12_6 = 0;
                                        stackIn_13_0 = stackOut_12_0;
                                        stackIn_13_1 = stackOut_12_1;
                                        stackIn_13_2 = stackOut_12_2;
                                        stackIn_13_3 = stackOut_12_3;
                                        stackIn_13_4 = stackOut_12_4;
                                        stackIn_13_5 = stackOut_12_5;
                                        stackIn_13_6 = stackOut_12_6;
                                        break L6;
                                      } else {
                                        stackOut_11_0 = stackIn_11_0;
                                        stackOut_11_1 = stackIn_11_1;
                                        stackOut_11_2 = stackIn_11_2;
                                        stackOut_11_3 = stackIn_11_3;
                                        stackOut_11_4 = stackIn_11_4;
                                        stackOut_11_5 = stackIn_11_5;
                                        stackOut_11_6 = 1;
                                        stackIn_13_0 = stackOut_11_0;
                                        stackIn_13_1 = stackOut_11_1;
                                        stackIn_13_2 = stackOut_11_2;
                                        stackIn_13_3 = stackOut_11_3;
                                        stackIn_13_4 = stackOut_11_4;
                                        stackIn_13_5 = stackOut_11_5;
                                        stackIn_13_6 = stackOut_11_6;
                                        break L6;
                                      }
                                    }
                                    fg.a(stackIn_13_0, stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_13_4, stackIn_13_5, stackIn_13_6 != 0);
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          var7 += 80;
                          var10++;
                          var9++;
                          if (var14 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L7: {
                        var8 += 20;
                        if (var13 == 0) {
                          break L7;
                        } else {
                          var3--;
                          var7 = -40 + var5;
                          break L7;
                        }
                      }
                      L8: {
                        if (var13 != 0) {
                          break L8;
                        } else {
                          var7 = var5;
                          var4++;
                          break L8;
                        }
                      }
                      L9: {
                        if (var13 != 0) {
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          break L9;
                        } else {
                          stackOut_20_0 = 1;
                          stackIn_22_0 = stackOut_20_0;
                          break L9;
                        }
                      }
                      var13 = stackIn_22_0;
                      var9 = var3;
                      var10 = var4;
                      if (var14 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_23_0 = param0;
              stackIn_24_0 = stackOut_23_0;
              break L1;
            }
            if (stackIn_24_0 == 0) {
              if (gb.field_B) {
                if (!cu.field_a) {
                  return;
                } else {
                  this.a(-12608);
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

    private final void e(int param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 < 88) {
          discarded$1 = this.a(false, true, 4, 95);
          var3 = this.field_e[1];
          var2 = this.field_e[0];
          var3 = var3 - (so.field_b.field_g >> -279644223);
          var2 = var2 - (so.field_b.field_a >> 1693653825);
          var4 = var2 - -this.field_p[0];
          var5 = var3 + this.field_p[1];
          this.field_k[1] = var5;
          this.field_k[0] = var4;
          return;
        } else {
          var3 = this.field_e[1];
          var2 = this.field_e[0];
          var3 = var3 - (so.field_b.field_g >> -279644223);
          var2 = var2 - (so.field_b.field_a >> 1693653825);
          var4 = var2 - -this.field_p[0];
          var5 = var3 + this.field_p[1];
          this.field_k[1] = var5;
          this.field_k[0] = var4;
          return;
        }
    }

    final void b(int param0, int param1, byte param2) {
        int var4 = 0;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_10_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_e[0] = 0;
        this.field_e[1] = 0;
        this.c(false);
        this.field_c[1] = this.field_c[1] - 2;
        var4 = this.field_c[0];
        var5 = this.field_c[1];
        this.f(-63);
        this.i(0);
        this.f(-113);
        this.i(0);
        var6 = this.field_e[0];
        var7 = this.field_e[1];
        var10 = 1 + var4;
        if (param2 == 93) {
          var11 = var5;
          var12 = 0;
          var13 = so.field_b.field_a;
          var14 = so.field_b.field_g;
          var15 = var6;
          L0: while (true) {
            if (var15 <= var13) {
              var8 = var10;
              var9 = var11;
              var16 = var12;
              if (var20 == 0) {
                var17 = var7;
                L1: while (true) {
                  L2: {
                    if (var14 < var17) {
                      stackOut_26_0 = var12;
                      stackIn_27_0 = stackOut_26_0;
                      break L2;
                    } else {
                      stackOut_9_0 = var16;
                      stackIn_27_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var20 != 0) {
                        break L2;
                      } else {
                        L3: {
                          if (stackIn_10_0 == 0) {
                            var8--;
                            if (-1 >= var8) {
                              break L3;
                            } else {
                              if (var8 >= this.field_j + 1) {
                                break L3;
                              } else {
                                if (var9 <= -1) {
                                  break L3;
                                } else {
                                  if (var9 >= 1 + this.field_m) {
                                    break L3;
                                  } else {
                                    L4: {
                                      var18 = (-param1 + var15) * (-param1 + var15) + (var17 - param0) * (-param0 + var17);
                                      var19 = 3 * fe.a(var18 * 4) + -30;
                                      if (var19 >= 0) {
                                        break L4;
                                      } else {
                                        var19 = 0;
                                        break L4;
                                      }
                                    }
                                    L5: {
                                      if ((var19 ^ -1) <= -257) {
                                        break L5;
                                      } else {
                                        pi.field_T.e(-6 + var15, -3 + var17, -var19 + 256);
                                        break L5;
                                      }
                                    }
                                    if (var20 == 0) {
                                      break L3;
                                    } else {
                                      var9++;
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var9++;
                            break L3;
                          }
                        }
                        L6: {
                          if (var16 != 0) {
                            stackOut_24_0 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            break L6;
                          } else {
                            stackOut_23_0 = 1;
                            stackIn_25_0 = stackOut_23_0;
                            break L6;
                          }
                        }
                        var16 = stackIn_25_0;
                        var17 += 20;
                        continue L1;
                      }
                    }
                  }
                  L7: {
                    if (stackIn_27_0 != 0) {
                      var10++;
                      var11++;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var12 != 0) {
                      stackOut_32_0 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      break L8;
                    } else {
                      stackOut_31_0 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      break L8;
                    }
                  }
                  var12 = stackIn_33_0;
                  var15 += 40;
                  if (var20 == 0) {
                    continue L0;
                  } else {
                    return;
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
          return;
        }
    }

    final void b(byte param0) {
        this.field_c[1] = this.field_b / this.field_j;
        this.field_c[0] = -(this.field_c[1] * this.field_j) + this.field_b;
        if (param0 != 36) {
          return;
        } else {
          return;
        }
    }

    private final void h(int param0) {
        this.field_e[1] = 0;
        this.field_e[0] = 0;
        this.c(false);
        if (param0 != -1) {
          this.a((byte) 54, -118);
          this.field_n[0] = this.field_c[0];
          this.field_n[1] = this.field_c[1];
          return;
        } else {
          this.field_n[0] = this.field_c[0];
          this.field_n[1] = this.field_c[1];
          return;
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5, boolean param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        var11 = 255;
        var12 = 255;
        var13 = 255;
        var14 = 255;
        if (param1 > -1) {
          if ((param5 ^ -1) < 0) {
            if (param1 < this.field_j) {
              if (param5 < this.field_m) {
                L0: {
                  L1: {
                    if (param3) {
                      break L1;
                    } else {
                      var11 = this.field_o[param5 * this.field_j + param1];
                      if (var15 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var12 = this.field_o[this.field_j * param5 + param1];
                  break L0;
                }
                L2: {
                  if ((param0 ^ -1) >= 0) {
                    break L2;
                  } else {
                    if ((param2 ^ -1) >= 0) {
                      break L2;
                    } else {
                      if (param0 >= this.field_j) {
                        break L2;
                      } else {
                        if (param2 >= this.field_m) {
                          break L2;
                        } else {
                          L3: {
                            if (param3) {
                              break L3;
                            } else {
                              var14 = this.field_o[param0 + param2 * this.field_j];
                              if (var15 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var13 = this.field_o[this.field_j * param2 + param0];
                          break L2;
                        }
                      }
                    }
                  }
                }
                if (param8 != 1760) {
                  L4: {
                    L5: {
                      this.field_o = (int[]) null;
                      if (!param3) {
                        break L5;
                      } else {
                        var14 = this.b(param2 - 1, -4510, -1 + param0);
                        var11 = this.b(param5, -4510, param1);
                        if (var15 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var13 = this.b(param2, -4510, param0);
                    var12 = this.b(-1 + param5, -4510, param1 - 1);
                    break L4;
                  }
                  this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
                  return;
                } else {
                  L6: {
                    L7: {
                      if (!param3) {
                        break L7;
                      } else {
                        var14 = this.b(param2 - 1, -4510, -1 + param0);
                        var11 = this.b(param5, -4510, param1);
                        if (var15 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var13 = this.b(param2, -4510, param0);
                    var12 = this.b(-1 + param5, -4510, param1 - 1);
                    break L6;
                  }
                  this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
                  return;
                }
              } else {
                L8: {
                  if ((param0 ^ -1) >= 0) {
                    break L8;
                  } else {
                    if ((param2 ^ -1) >= 0) {
                      break L8;
                    } else {
                      if (param0 >= this.field_j) {
                        break L8;
                      } else {
                        if (param2 >= this.field_m) {
                          break L8;
                        } else {
                          L9: {
                            if (param3) {
                              break L9;
                            } else {
                              var14 = this.field_o[param0 + param2 * this.field_j];
                              if (var15 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var13 = this.field_o[this.field_j * param2 + param0];
                          break L8;
                        }
                      }
                    }
                  }
                }
                if (param8 != 1760) {
                  L10: {
                    L11: {
                      this.field_o = (int[]) null;
                      if (!param3) {
                        break L11;
                      } else {
                        var14 = this.b(param2 - 1, -4510, -1 + param0);
                        var11 = this.b(param5, -4510, param1);
                        if (var15 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var13 = this.b(param2, -4510, param0);
                    var12 = this.b(-1 + param5, -4510, param1 - 1);
                    break L10;
                  }
                  this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
                  return;
                } else {
                  L12: {
                    L13: {
                      if (!param3) {
                        break L13;
                      } else {
                        var14 = this.b(param2 - 1, -4510, -1 + param0);
                        var11 = this.b(param5, -4510, param1);
                        if (var15 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var13 = this.b(param2, -4510, param0);
                    var12 = this.b(-1 + param5, -4510, param1 - 1);
                    break L12;
                  }
                  this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
                  return;
                }
              }
            } else {
              L14: {
                if ((param0 ^ -1) >= 0) {
                  break L14;
                } else {
                  if ((param2 ^ -1) >= 0) {
                    break L14;
                  } else {
                    if (param0 >= this.field_j) {
                      break L14;
                    } else {
                      if (param2 >= this.field_m) {
                        break L14;
                      } else {
                        L15: {
                          if (param3) {
                            break L15;
                          } else {
                            var14 = this.field_o[param0 + param2 * this.field_j];
                            if (var15 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var13 = this.field_o[this.field_j * param2 + param0];
                        break L14;
                      }
                    }
                  }
                }
              }
              if (param8 != 1760) {
                L16: {
                  L17: {
                    this.field_o = (int[]) null;
                    if (!param3) {
                      break L17;
                    } else {
                      var14 = this.b(param2 - 1, -4510, -1 + param0);
                      var11 = this.b(param5, -4510, param1);
                      if (var15 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var13 = this.b(param2, -4510, param0);
                  var12 = this.b(-1 + param5, -4510, param1 - 1);
                  break L16;
                }
                this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
                return;
              } else {
                L18: {
                  L19: {
                    if (!param3) {
                      break L19;
                    } else {
                      var14 = this.b(param2 - 1, -4510, -1 + param0);
                      var11 = this.b(param5, -4510, param1);
                      if (var15 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  var13 = this.b(param2, -4510, param0);
                  var12 = this.b(-1 + param5, -4510, param1 - 1);
                  break L18;
                }
                this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
                return;
              }
            }
          } else {
            L20: {
              if ((param0 ^ -1) >= 0) {
                break L20;
              } else {
                if ((param2 ^ -1) >= 0) {
                  break L20;
                } else {
                  if (param0 >= this.field_j) {
                    break L20;
                  } else {
                    if (param2 >= this.field_m) {
                      break L20;
                    } else {
                      L21: {
                        if (param3) {
                          break L21;
                        } else {
                          var14 = this.field_o[param0 + param2 * this.field_j];
                          if (var15 == 0) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var13 = this.field_o[this.field_j * param2 + param0];
                      break L20;
                    }
                  }
                }
              }
            }
            if (param8 != 1760) {
              L22: {
                L23: {
                  this.field_o = (int[]) null;
                  if (!param3) {
                    break L23;
                  } else {
                    var14 = this.b(param2 - 1, -4510, -1 + param0);
                    var11 = this.b(param5, -4510, param1);
                    if (var15 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                var13 = this.b(param2, -4510, param0);
                var12 = this.b(-1 + param5, -4510, param1 - 1);
                break L22;
              }
              this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
              return;
            } else {
              L24: {
                L25: {
                  if (!param3) {
                    break L25;
                  } else {
                    var14 = this.b(param2 - 1, -4510, -1 + param0);
                    var11 = this.b(param5, -4510, param1);
                    if (var15 == 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                var13 = this.b(param2, -4510, param0);
                var12 = this.b(-1 + param5, -4510, param1 - 1);
                break L24;
              }
              this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
              return;
            }
          }
        } else {
          L26: {
            if ((param0 ^ -1) >= 0) {
              break L26;
            } else {
              if ((param2 ^ -1) >= 0) {
                break L26;
              } else {
                if (param0 >= this.field_j) {
                  break L26;
                } else {
                  if (param2 >= this.field_m) {
                    break L26;
                  } else {
                    L27: {
                      if (param3) {
                        break L27;
                      } else {
                        var14 = this.field_o[param0 + param2 * this.field_j];
                        if (var15 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    var13 = this.field_o[this.field_j * param2 + param0];
                    break L26;
                  }
                }
              }
            }
          }
          if (param8 != 1760) {
            L28: {
              L29: {
                this.field_o = (int[]) null;
                if (!param3) {
                  break L29;
                } else {
                  var14 = this.b(param2 - 1, -4510, -1 + param0);
                  var11 = this.b(param5, -4510, param1);
                  if (var15 == 0) {
                    break L28;
                  } else {
                    break L29;
                  }
                }
              }
              var13 = this.b(param2, -4510, param0);
              var12 = this.b(-1 + param5, -4510, param1 - 1);
              break L28;
            }
            this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
            return;
          } else {
            L30: {
              L31: {
                if (!param3) {
                  break L31;
                } else {
                  var14 = this.b(param2 - 1, -4510, -1 + param0);
                  var11 = this.b(param5, -4510, param1);
                  if (var15 == 0) {
                    break L30;
                  } else {
                    break L31;
                  }
                }
              }
              var13 = this.b(param2, -4510, param0);
              var12 = this.b(-1 + param5, -4510, param1 - 1);
              break L30;
            }
            this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
            return;
          }
        }
    }

    private final void a(boolean param0) {
        this.field_e[1] = so.field_b.field_g >> -1572318207;
        this.field_e[0] = so.field_b.field_a >> 792578625;
        this.c(param0);
        this.field_r[1] = this.field_c[1];
        this.field_r[0] = this.field_c[0];
    }

    private final boolean a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var7 = 0;
        if (!param5) {
          if (!param1) {
            L0: {
              L1: {
                if (param4) {
                  break L1;
                } else {
                  if (param3) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              var7 = 1;
              break L0;
            }
            if (param0) {
              L2: {
                L3: {
                  var8 = 16;
                  if (!param5) {
                    break L3;
                  } else {
                    if (this.field_l[1] > -var8) {
                      this.field_l[1] = this.field_l[1] - 1;
                      if (var9 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                if (!param2) {
                  if ((this.field_l[1] ^ -1) > -1) {
                    this.field_l[1] = this.field_l[1] + 1;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L4: {
                L5: {
                  if (param1) {
                    break L5;
                  } else {
                    if (!param2) {
                      if (this.field_l[1] <= 0) {
                        break L4;
                      } else {
                        this.field_l[1] = this.field_l[1] - 1;
                        if (var9 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                if (this.field_l[1] >= var8) {
                  break L4;
                } else {
                  this.field_l[1] = this.field_l[1] + 1;
                  break L4;
                }
              }
              L6: {
                L7: {
                  if (param4) {
                    break L7;
                  } else {
                    if (param2) {
                      break L6;
                    } else {
                      if (-1 < (this.field_l[0] ^ -1)) {
                        this.field_l[0] = this.field_l[0] + 1;
                        if (var9 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (-var8 < this.field_l[0]) {
                  this.field_l[0] = this.field_l[0] - 1;
                  break L6;
                } else {
                  L8: {
                    L9: {
                      if (param3) {
                        break L9;
                      } else {
                        if (!param2) {
                          if (0 < this.field_l[0]) {
                            this.field_l[0] = this.field_l[0] - 1;
                            if (var9 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (this.field_l[0] < var8) {
                      this.field_l[0] = this.field_l[0] + 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L10: {
                    L11: {
                      if (!param2) {
                        break L11;
                      } else {
                        if (var7 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    this.field_p[1] = this.field_p[1] + this.field_l[1];
                    this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                    this.a(-81, this.field_p);
                    this.a(false);
                    this.h(-1);
                    break L10;
                  }
                  return var7 != 0;
                }
              }
              L12: {
                L13: {
                  if (param3) {
                    break L13;
                  } else {
                    if (!param2) {
                      if (0 < this.field_l[0]) {
                        this.field_l[0] = this.field_l[0] - 1;
                        if (var9 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      } else {
                        if (param2) {
                          if (var7 != 0) {
                            this.field_p[1] = this.field_p[1] + this.field_l[1];
                            this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                            this.a(-81, this.field_p);
                            this.a(false);
                            this.h(-1);
                            return var7 != 0;
                          } else {
                            return var7 != 0;
                          }
                        } else {
                          this.field_p[1] = this.field_p[1] + this.field_l[1];
                          this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                          this.a(-81, this.field_p);
                          this.a(false);
                          this.h(-1);
                          return var7 != 0;
                        }
                      }
                    } else {
                      if (var7 != 0) {
                        this.field_p[1] = this.field_p[1] + this.field_l[1];
                        this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                        this.a(-81, this.field_p);
                        this.a(false);
                        this.h(-1);
                        return var7 != 0;
                      } else {
                        return var7 != 0;
                      }
                    }
                  }
                }
                if (this.field_l[0] < var8) {
                  this.field_l[0] = this.field_l[0] + 1;
                  break L12;
                } else {
                  if (param2) {
                    if (var7 == 0) {
                      return var7 != 0;
                    } else {
                      this.field_p[1] = this.field_p[1] + this.field_l[1];
                      this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                      this.a(-81, this.field_p);
                      this.a(false);
                      this.h(-1);
                      return var7 != 0;
                    }
                  } else {
                    this.field_p[1] = this.field_p[1] + this.field_l[1];
                    this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                    this.a(-81, this.field_p);
                    this.a(false);
                    this.h(-1);
                    return var7 != 0;
                  }
                }
              }
              if (param2) {
                if (var7 == 0) {
                  return var7 != 0;
                } else {
                  this.field_p[1] = this.field_p[1] + this.field_l[1];
                  this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                  this.a(-81, this.field_p);
                  this.a(false);
                  this.h(-1);
                  return var7 != 0;
                }
              } else {
                this.field_p[1] = this.field_p[1] + this.field_l[1];
                this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                this.a(-81, this.field_p);
                this.a(false);
                this.h(-1);
                return var7 != 0;
              }
            } else {
              return true;
            }
          } else {
            var7 = 1;
            if (param0) {
              L14: {
                L15: {
                  var8 = 16;
                  if (!param5) {
                    break L15;
                  } else {
                    if (this.field_l[1] > -var8) {
                      this.field_l[1] = this.field_l[1] - 1;
                      if (var9 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                if (!param2) {
                  if ((this.field_l[1] ^ -1) > -1) {
                    this.field_l[1] = this.field_l[1] + 1;
                    break L14;
                  } else {
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
              L16: {
                L17: {
                  if (param1) {
                    break L17;
                  } else {
                    if (!param2) {
                      if (this.field_l[1] <= 0) {
                        break L16;
                      } else {
                        this.field_l[1] = this.field_l[1] - 1;
                        if (var9 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                if (this.field_l[1] >= var8) {
                  break L16;
                } else {
                  this.field_l[1] = this.field_l[1] + 1;
                  break L16;
                }
              }
              L18: {
                L19: {
                  if (param4) {
                    break L19;
                  } else {
                    if (param2) {
                      break L18;
                    } else {
                      if (-1 < (this.field_l[0] ^ -1)) {
                        this.field_l[0] = this.field_l[0] + 1;
                        if (var9 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      } else {
                        break L18;
                      }
                    }
                  }
                }
                if (-var8 < this.field_l[0]) {
                  this.field_l[0] = this.field_l[0] - 1;
                  break L18;
                } else {
                  L20: {
                    L21: {
                      if (param3) {
                        break L21;
                      } else {
                        if (!param2) {
                          if (0 < this.field_l[0]) {
                            this.field_l[0] = this.field_l[0] - 1;
                            if (var9 == 0) {
                              break L20;
                            } else {
                              break L21;
                            }
                          } else {
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                    }
                    if (this.field_l[0] < var8) {
                      this.field_l[0] = this.field_l[0] + 1;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L22: {
                    L23: {
                      if (!param2) {
                        break L23;
                      } else {
                        if (var7 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    this.field_p[1] = this.field_p[1] + this.field_l[1];
                    this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                    this.a(-81, this.field_p);
                    this.a(false);
                    this.h(-1);
                    break L22;
                  }
                  return var7 != 0;
                }
              }
              L24: {
                L25: {
                  if (param3) {
                    break L25;
                  } else {
                    if (!param2) {
                      if (0 < this.field_l[0]) {
                        this.field_l[0] = this.field_l[0] - 1;
                        if (var9 == 0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      } else {
                        L26: {
                          L27: {
                            if (!param2) {
                              break L27;
                            } else {
                              if (var7 == 0) {
                                break L26;
                              } else {
                                break L27;
                              }
                            }
                          }
                          this.field_p[1] = this.field_p[1] + this.field_l[1];
                          this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                          this.a(-81, this.field_p);
                          this.a(false);
                          this.h(-1);
                          break L26;
                        }
                        return var7 != 0;
                      }
                    } else {
                      L28: {
                        if (var7 == 0) {
                          break L28;
                        } else {
                          this.field_p[1] = this.field_p[1] + this.field_l[1];
                          this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                          this.a(-81, this.field_p);
                          this.a(false);
                          this.h(-1);
                          break L28;
                        }
                      }
                      return var7 != 0;
                    }
                  }
                }
                if (this.field_l[0] < var8) {
                  this.field_l[0] = this.field_l[0] + 1;
                  break L24;
                } else {
                  L29: {
                    L30: {
                      if (!param2) {
                        break L30;
                      } else {
                        if (var7 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    this.field_p[1] = this.field_p[1] + this.field_l[1];
                    this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                    this.a(-81, this.field_p);
                    this.a(false);
                    this.h(-1);
                    break L29;
                  }
                  return var7 != 0;
                }
              }
              if (param2) {
                if (var7 != 0) {
                  this.field_p[1] = this.field_p[1] + this.field_l[1];
                  this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                  this.a(-81, this.field_p);
                  this.a(false);
                  this.h(-1);
                  return var7 != 0;
                } else {
                  return var7 != 0;
                }
              } else {
                this.field_p[1] = this.field_p[1] + this.field_l[1];
                this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                this.a(-81, this.field_p);
                this.a(false);
                this.h(-1);
                return var7 != 0;
              }
            } else {
              return true;
            }
          }
        } else {
          var7 = 1;
          if (param0) {
            L31: {
              L32: {
                var8 = 16;
                if (!param5) {
                  break L32;
                } else {
                  if (this.field_l[1] > -var8) {
                    this.field_l[1] = this.field_l[1] - 1;
                    if (var9 == 0) {
                      break L31;
                    } else {
                      break L32;
                    }
                  } else {
                    break L31;
                  }
                }
              }
              if (!param2) {
                if ((this.field_l[1] ^ -1) > -1) {
                  this.field_l[1] = this.field_l[1] + 1;
                  break L31;
                } else {
                  break L31;
                }
              } else {
                break L31;
              }
            }
            L33: {
              L34: {
                if (param1) {
                  break L34;
                } else {
                  if (!param2) {
                    if (this.field_l[1] <= 0) {
                      break L33;
                    } else {
                      this.field_l[1] = this.field_l[1] - 1;
                      if (var9 == 0) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  } else {
                    break L33;
                  }
                }
              }
              if (this.field_l[1] >= var8) {
                break L33;
              } else {
                this.field_l[1] = this.field_l[1] + 1;
                break L33;
              }
            }
            L35: {
              L36: {
                if (param4) {
                  break L36;
                } else {
                  if (param2) {
                    break L35;
                  } else {
                    if (-1 < (this.field_l[0] ^ -1)) {
                      this.field_l[0] = this.field_l[0] + 1;
                      if (var9 == 0) {
                        break L35;
                      } else {
                        break L36;
                      }
                    } else {
                      break L35;
                    }
                  }
                }
              }
              if (-var8 < this.field_l[0]) {
                this.field_l[0] = this.field_l[0] - 1;
                break L35;
              } else {
                L37: {
                  L38: {
                    if (param3) {
                      break L38;
                    } else {
                      if (!param2) {
                        if (0 < this.field_l[0]) {
                          this.field_l[0] = this.field_l[0] - 1;
                          if (var9 == 0) {
                            break L37;
                          } else {
                            break L38;
                          }
                        } else {
                          break L37;
                        }
                      } else {
                        break L37;
                      }
                    }
                  }
                  if (this.field_l[0] < var8) {
                    this.field_l[0] = this.field_l[0] + 1;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L39: {
                  L40: {
                    if (!param2) {
                      break L40;
                    } else {
                      if (var7 == 0) {
                        break L39;
                      } else {
                        break L40;
                      }
                    }
                  }
                  this.field_p[1] = this.field_p[1] + this.field_l[1];
                  this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                  this.a(-81, this.field_p);
                  this.a(false);
                  this.h(-1);
                  break L39;
                }
                return var7 != 0;
              }
            }
            L41: {
              L42: {
                if (param3) {
                  break L42;
                } else {
                  if (!param2) {
                    if (0 < this.field_l[0]) {
                      this.field_l[0] = this.field_l[0] - 1;
                      if (var9 == 0) {
                        break L41;
                      } else {
                        break L42;
                      }
                    } else {
                      L43: {
                        L44: {
                          if (!param2) {
                            break L44;
                          } else {
                            if (var7 == 0) {
                              break L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                        this.field_p[1] = this.field_p[1] + this.field_l[1];
                        this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                        this.a(-81, this.field_p);
                        this.a(false);
                        this.h(-1);
                        break L43;
                      }
                      return var7 != 0;
                    }
                  } else {
                    L45: {
                      if (var7 == 0) {
                        break L45;
                      } else {
                        this.field_p[1] = this.field_p[1] + this.field_l[1];
                        this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                        this.a(-81, this.field_p);
                        this.a(false);
                        this.h(-1);
                        break L45;
                      }
                    }
                    return var7 != 0;
                  }
                }
              }
              if (this.field_l[0] < var8) {
                this.field_l[0] = this.field_l[0] + 1;
                break L41;
              } else {
                L46: {
                  L47: {
                    if (!param2) {
                      break L47;
                    } else {
                      if (var7 == 0) {
                        break L46;
                      } else {
                        break L47;
                      }
                    }
                  }
                  this.field_p[1] = this.field_p[1] + this.field_l[1];
                  this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                  this.a(-81, this.field_p);
                  this.a(false);
                  this.h(-1);
                  break L46;
                }
                return var7 != 0;
              }
            }
            if (param2) {
              if (var7 != 0) {
                this.field_p[1] = this.field_p[1] + this.field_l[1];
                this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
                this.a(-81, this.field_p);
                this.a(false);
                this.h(-1);
                return var7 != 0;
              } else {
                return var7 != 0;
              }
            } else {
              this.field_p[1] = this.field_p[1] + this.field_l[1];
              this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
              this.a(-81, this.field_p);
              this.a(false);
              this.h(-1);
              return var7 != 0;
            }
          } else {
            return true;
          }
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var2 = -40 + this.field_k[0] >> 1477510273;
        var3 = this.field_k[1] - (this.field_m * 40 >> -608768031);
        var5 = var3 + var2;
        var4 = var2 + -var3;
        if (-1 < (var4 ^ -1)) {
          L0: {
            var4 -= 40;
            if (var5 < 0) {
              var5 -= 40;
              break L0;
            } else {
              break L0;
            }
          }
          this.field_c[0] = var4 / 40;
          this.field_c[param0] = var5 / 40;
          return;
        } else {
          L1: {
            if (var5 < 0) {
              var5 -= 40;
              break L1;
            } else {
              break L1;
            }
          }
          this.field_c[0] = var4 / 40;
          this.field_c[param0] = var5 / 40;
          return;
        }
    }

    final void a(int param0, boolean param1) {
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
        this.field_c[1] = param0 / this.field_j;
        this.field_c[0] = param0 + -(this.field_j * this.field_c[1]);
        if (!param1) {
          L0: {
            this.field_l = (int[]) null;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (param1) {
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
          this.b(stackIn_8_1 != 0);
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (param1) {
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
          this.b(stackIn_4_1 != 0);
          return;
        }
    }

    final void c(boolean param0) {
        if (param0) {
          this.a(-4, 46);
          this.e(105);
          this.d(1);
          return;
        } else {
          this.e(105);
          this.d(1);
          return;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          var21 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.field_e[0] = 0;
          this.field_e[1] = 0;
          this.c(false);
          this.field_c[1] = this.field_c[1] - 2;
          var2 = this.field_c[0];
          var3 = this.field_c[1];
          this.f(-47);
          this.i(0);
          this.f(-85);
          this.i(param0 ^ param0);
          var4 = this.field_e[0];
          var5 = this.field_e[1];
          var11 = var2 + -1;
          var12 = var3;
          var13 = var3;
          var10 = var2;
          var14 = 0;
          if (0 != (var3 + var2) % 2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var15 = stackIn_3_0;
        var16 = so.field_b.field_a;
        var17 = so.field_b.field_g;
        var18 = var4;
        L1: while (true) {
          if (var18 <= var16) {
            var8 = var12;
            var6 = var10;
            var7 = var11;
            var9 = var13;
            var19 = var14;
            if (var21 == 0) {
              var20 = var5;
              L2: while (true) {
                L3: {
                  if (var20 > var17) {
                    stackOut_19_0 = var14;
                    stackIn_20_0 = stackOut_19_0;
                    break L3;
                  } else {
                    this.a(var7, var6, var9, var19 != 0, var15 != 0, var8, var14 != 0, var18, 1760, var20);
                    stackOut_10_0 = var19;
                    stackIn_20_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var21 != 0) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_11_0 == 0) {
                            break L5;
                          } else {
                            var7--;
                            var8++;
                            if (var21 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var9++;
                        var6--;
                        break L4;
                      }
                      L6: {
                        if (var19 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L6;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L6;
                        }
                      }
                      var19 = stackIn_18_0;
                      var20 += 20;
                      continue L2;
                    }
                  }
                }
                L7: {
                  L8: {
                    if (stackIn_20_0 != 0) {
                      break L8;
                    } else {
                      var13++;
                      var11++;
                      if (var21 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var10++;
                  var12++;
                  break L7;
                }
                L9: {
                  if (var14 != 0) {
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    break L9;
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    break L9;
                  }
                }
                var14 = stackIn_27_0;
                var18 += 40;
                continue L1;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(byte param0) {
        int var2 = this.field_k[0];
        int var3 = this.field_k[1];
        int var4 = 0;
        int var5 = 0;
        int var6 = so.a(327680, -129);
        var4 = var4 + ev.b(-48, var2 << -551277810, var6);
        var5 = var5 + ev.b(-70, var2 << 812143534, var6);
        var4 = var4 - ev.b(-94, var2 << -510994289, var6);
        var5 = var5 + ev.b(-51, var3 << -6374289, var6);
        this.field_h[0] = var4;
        this.field_h[1] = var5;
        int var7 = -48 % ((19 - param0) / 36);
    }

    final void i(int param0) {
        int var3 = this.field_k[1];
        int var2 = this.field_k[0];
        int var5 = var3 + -this.field_p[1];
        int var4 = var2 - this.field_p[param0];
        var4 = var4 + (so.field_b.field_a >> 194744801);
        var5 = (so.field_b.field_g >> 1745035905) + var5;
        this.field_e[1] = var5;
        this.field_e[0] = var4;
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, boolean param5, int param6, int param7, int param8, boolean param9, int param10, int param11, int param12, int param13) {
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int[] var40 = null;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        L0: {
          var39 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 > param11) {
            break L0;
          } else {
            if (0 > param1) {
              break L0;
            } else {
              if (this.field_m - 1 < param13) {
                break L0;
              } else {
                if (param8 > -1 + this.field_j) {
                  break L0;
                } else {
                  if (0 > param13) {
                    this.a(false, param4, param10, -126, param5, param6, param2, param7, param3, param9, param12);
                    return;
                  } else {
                    if (0 > param8) {
                      this.a(true, param4, param10, param0 ^ 8236, param5, param6, param2, param7, param3, param9, param12);
                      return;
                    } else {
                      if (param0 == -8302) {
                        if (param1 > -1 + this.field_m) {
                          this.a(true, param4, param10, -78, param5, param6, param2, param7, param3, param9, param12);
                          return;
                        } else {
                          if (-1 + this.field_j < param11) {
                            this.a(false, param4, param10, -120, param5, param6, param2, param7, param3, param9, param12);
                            return;
                          } else {
                            L1: {
                              var15 = param2 << 1267885520;
                              var16 = (-var15 + (param12 << -787487536)) / 40;
                              var17 = param7 << 470127472;
                              var18 = ((param4 << -2002597104) + -var17) / 40;
                              var19 = var15;
                              var20 = var17;
                              stackOut_57_0 = 0;
                              stackIn_59_0 = stackOut_57_0;
                              stackIn_58_0 = stackOut_57_0;
                              if (param9 ^ param5) {
                                stackOut_59_0 = stackIn_59_0;
                                stackOut_59_1 = 0;
                                stackIn_60_0 = stackOut_59_0;
                                stackIn_60_1 = stackOut_59_1;
                                break L1;
                              } else {
                                stackOut_58_0 = stackIn_58_0;
                                stackOut_58_1 = 40;
                                stackIn_60_0 = stackOut_58_0;
                                stackIn_60_1 = stackOut_58_1;
                                break L1;
                              }
                            }
                            var21 = stackIn_60_0 - -stackIn_60_1;
                            var22 = so.field_b.field_a;
                            var23 = so.field_b.field_g;
                            var24 = param6;
                            L2: while (true) {
                              if (var24 < param6 + 40) {
                                if (var39 == 0) {
                                  L3: {
                                    stackOut_65_0 = 0;
                                    stackIn_67_0 = stackOut_65_0;
                                    stackIn_66_0 = stackOut_65_0;
                                    if (param3 == param5) {
                                      stackOut_67_0 = stackIn_67_0;
                                      stackOut_67_1 = 0;
                                      stackIn_68_0 = stackOut_67_0;
                                      stackIn_68_1 = stackOut_67_1;
                                      break L3;
                                    } else {
                                      stackOut_66_0 = stackIn_66_0;
                                      stackOut_66_1 = 1;
                                      stackIn_68_0 = stackOut_66_0;
                                      stackIn_68_1 = stackOut_66_1;
                                      break L3;
                                    }
                                  }
                                  L4: {
                                    stackOut_68_0 = stackIn_68_0;
                                    stackIn_70_0 = stackOut_68_0;
                                    stackIn_69_0 = stackOut_68_0;
                                    if (stackIn_68_1 != 0 ^ param9) {
                                      stackOut_70_0 = stackIn_70_0;
                                      stackOut_70_1 = 20;
                                      stackIn_71_0 = stackOut_70_0;
                                      stackIn_71_1 = stackOut_70_1;
                                      break L4;
                                    } else {
                                      stackOut_69_0 = stackIn_69_0;
                                      stackOut_69_1 = 0;
                                      stackIn_71_0 = stackOut_69_0;
                                      stackIn_71_1 = stackOut_69_1;
                                      break L4;
                                    }
                                  }
                                  var25 = stackIn_71_0 - -stackIn_71_1;
                                  var26 = var19;
                                  var27 = (-var19 + var20) / 20;
                                  var28 = param10;
                                  L5: while (true) {
                                    L6: {
                                      L7: {
                                        if (param10 - -20 <= var28) {
                                          break L7;
                                        } else {
                                          stackOut_73_0 = 0;
                                          stackOut_73_1 = var24;
                                          stackIn_86_0 = stackOut_73_0;
                                          stackIn_86_1 = stackOut_73_1;
                                          stackIn_74_0 = stackOut_73_0;
                                          stackIn_74_1 = stackOut_73_1;
                                          if (var39 != 0) {
                                            break L6;
                                          } else {
                                            L8: {
                                              if (stackIn_74_0 > stackIn_74_1) {
                                                break L8;
                                              } else {
                                                if (var24 >= var22) {
                                                  break L8;
                                                } else {
                                                  if ((var28 ^ -1) > -1) {
                                                    break L8;
                                                  } else {
                                                    if (var23 <= var28) {
                                                      break L8;
                                                    } else {
                                                      var29 = var24 + var22 * var28;
                                                      var30 = qn.field_d[var29];
                                                      var31 = dd.field_k.field_B[var21 - -(var25 * 80)];
                                                      if (var30 != 0) {
                                                        L9: {
                                                          var32 = (16745529 & var26) >> 738102959;
                                                          if ((var32 ^ -1) < -256) {
                                                            var32 = 255;
                                                            break L9;
                                                          } else {
                                                            break L9;
                                                          }
                                                        }
                                                        var36 = (16711680 & var31) * (-var32 + 255) >>> 669334472;
                                                        var33 = 255 & var30 >> -1961506128;
                                                        var35 = (var30 & 65280) >> 917162824;
                                                        var34 = var30 & 255;
                                                        var37 = (var31 & 255) * (-var32 + 255);
                                                        var36 = var36 + var32 * 65280;
                                                        var38 = (65280 & var31) * (-var32 + 255);
                                                        var38 = var38 + 65280 * var32;
                                                        var37 = var37 + 255 * var32;
                                                        var37 = var37 >> 8;
                                                        var38 = var38 >> 8;
                                                        var30 = (var33 * var36 & -16777216 | 65280 & var37 * var34 | 16711680 & var38 * var35) >> -1439304056;
                                                        qn.field_d[var29] = var30;
                                                        break L8;
                                                      } else {
                                                        break L8;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var26 = var26 + var27;
                                            var25++;
                                            var28++;
                                            if (var39 == 0) {
                                              continue L5;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                      var20 = var20 + var18;
                                      var21++;
                                      stackOut_85_0 = var19;
                                      stackOut_85_1 = var16;
                                      stackIn_86_0 = stackOut_85_0;
                                      stackIn_86_1 = stackOut_85_1;
                                      break L6;
                                    }
                                    var19 = stackIn_86_0 + stackIn_86_1;
                                    var24++;
                                    if (var39 == 0) {
                                      continue L2;
                                    } else {
                                      return;
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
                      } else {
                        var40 = (int[]) null;
                        this.a(-43, (int[]) null);
                        if (param1 > -1 + this.field_m) {
                          this.a(true, param4, param10, -78, param5, param6, param2, param7, param3, param9, param12);
                          return;
                        } else {
                          if (-1 + this.field_j < param11) {
                            this.a(false, param4, param10, -120, param5, param6, param2, param7, param3, param9, param12);
                            return;
                          } else {
                            L10: {
                              var15 = param2 << 1267885520;
                              var16 = (-var15 + (param12 << -787487536)) / 40;
                              var17 = param7 << 470127472;
                              var18 = ((param4 << -2002597104) + -var17) / 40;
                              var19 = var15;
                              var20 = var17;
                              stackOut_19_0 = 0;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              if (param9 ^ param5) {
                                stackOut_21_0 = stackIn_21_0;
                                stackOut_21_1 = 0;
                                stackIn_22_0 = stackOut_21_0;
                                stackIn_22_1 = stackOut_21_1;
                                break L10;
                              } else {
                                stackOut_20_0 = stackIn_20_0;
                                stackOut_20_1 = 40;
                                stackIn_22_0 = stackOut_20_0;
                                stackIn_22_1 = stackOut_20_1;
                                break L10;
                              }
                            }
                            var21 = stackIn_22_0 - -stackIn_22_1;
                            var22 = so.field_b.field_a;
                            var23 = so.field_b.field_g;
                            var24 = param6;
                            L11: while (true) {
                              if (var24 < param6 + 40) {
                                if (var39 == 0) {
                                  L12: {
                                    stackOut_28_0 = 0;
                                    stackIn_30_0 = stackOut_28_0;
                                    stackIn_29_0 = stackOut_28_0;
                                    if (param3 == param5) {
                                      stackOut_30_0 = stackIn_30_0;
                                      stackOut_30_1 = 0;
                                      stackIn_31_0 = stackOut_30_0;
                                      stackIn_31_1 = stackOut_30_1;
                                      break L12;
                                    } else {
                                      stackOut_29_0 = stackIn_29_0;
                                      stackOut_29_1 = 1;
                                      stackIn_31_0 = stackOut_29_0;
                                      stackIn_31_1 = stackOut_29_1;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    stackOut_31_0 = stackIn_31_0;
                                    stackIn_33_0 = stackOut_31_0;
                                    stackIn_32_0 = stackOut_31_0;
                                    if (stackIn_31_1 != 0 ^ param9) {
                                      stackOut_33_0 = stackIn_33_0;
                                      stackOut_33_1 = 20;
                                      stackIn_34_0 = stackOut_33_0;
                                      stackIn_34_1 = stackOut_33_1;
                                      break L13;
                                    } else {
                                      stackOut_32_0 = stackIn_32_0;
                                      stackOut_32_1 = 0;
                                      stackIn_34_0 = stackOut_32_0;
                                      stackIn_34_1 = stackOut_32_1;
                                      break L13;
                                    }
                                  }
                                  var25 = stackIn_34_0 - -stackIn_34_1;
                                  var26 = var19;
                                  var27 = (-var19 + var20) / 20;
                                  var28 = param10;
                                  L14: while (true) {
                                    L15: {
                                      L16: {
                                        if (param10 - -20 <= var28) {
                                          break L16;
                                        } else {
                                          stackOut_36_0 = 0;
                                          stackOut_36_1 = var24;
                                          stackIn_49_0 = stackOut_36_0;
                                          stackIn_49_1 = stackOut_36_1;
                                          stackIn_37_0 = stackOut_36_0;
                                          stackIn_37_1 = stackOut_36_1;
                                          if (var39 != 0) {
                                            break L15;
                                          } else {
                                            L17: {
                                              if (stackIn_37_0 > stackIn_37_1) {
                                                break L17;
                                              } else {
                                                if (var24 >= var22) {
                                                  break L17;
                                                } else {
                                                  if ((var28 ^ -1) > -1) {
                                                    break L17;
                                                  } else {
                                                    if (var23 <= var28) {
                                                      break L17;
                                                    } else {
                                                      var29 = var24 + var22 * var28;
                                                      var30 = qn.field_d[var29];
                                                      var31 = dd.field_k.field_B[var21 - -(var25 * 80)];
                                                      if (var30 != 0) {
                                                        L18: {
                                                          var32 = (16745529 & var26) >> 738102959;
                                                          if ((var32 ^ -1) < -256) {
                                                            var32 = 255;
                                                            break L18;
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                        var36 = (16711680 & var31) * (-var32 + 255) >>> 669334472;
                                                        var33 = 255 & var30 >> -1961506128;
                                                        var35 = (var30 & 65280) >> 917162824;
                                                        var34 = var30 & 255;
                                                        var37 = (var31 & 255) * (-var32 + 255);
                                                        var36 = var36 + var32 * 65280;
                                                        var38 = (65280 & var31) * (-var32 + 255);
                                                        var38 = var38 + 65280 * var32;
                                                        var37 = var37 + 255 * var32;
                                                        var37 = var37 >> 8;
                                                        var38 = var38 >> 8;
                                                        var30 = (var33 * var36 & -16777216 | 65280 & var37 * var34 | 16711680 & var38 * var35) >> -1439304056;
                                                        qn.field_d[var29] = var30;
                                                        break L17;
                                                      } else {
                                                        break L17;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var26 = var26 + var27;
                                            var25++;
                                            var28++;
                                            if (var39 == 0) {
                                              continue L14;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                      var20 = var20 + var18;
                                      var21++;
                                      stackOut_48_0 = var19;
                                      stackOut_48_1 = var16;
                                      stackIn_49_0 = stackOut_48_0;
                                      stackIn_49_1 = stackOut_48_1;
                                      break L15;
                                    }
                                    var19 = stackIn_49_0 + stackIn_49_1;
                                    var24++;
                                    if (var39 == 0) {
                                      continue L11;
                                    } else {
                                      return;
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
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_11_1 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_12_1 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_13_1 = false;
        int stackIn_13_2 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_14_1 = false;
        int stackIn_14_2 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_15_1 = false;
        int stackIn_15_2 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_16_1 = false;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_17_1 = false;
        int stackIn_18_0 = 0;
        boolean stackIn_18_1 = false;
        int stackIn_19_0 = 0;
        boolean stackIn_19_1 = false;
        int stackIn_19_2 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_53_0 = 0;
        boolean stackIn_53_1 = false;
        int stackIn_54_0 = 0;
        boolean stackIn_54_1 = false;
        int stackIn_55_0 = 0;
        boolean stackIn_55_1 = false;
        int stackIn_55_2 = 0;
        int stackIn_56_0 = 0;
        boolean stackIn_56_1 = false;
        int stackIn_56_2 = 0;
        int stackIn_57_0 = 0;
        boolean stackIn_57_1 = false;
        int stackIn_57_2 = 0;
        int stackIn_58_0 = 0;
        boolean stackIn_58_1 = false;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_59_1 = false;
        int stackIn_60_0 = 0;
        boolean stackIn_60_1 = false;
        int stackIn_61_0 = 0;
        boolean stackIn_61_1 = false;
        int stackIn_61_2 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_52_0 = 0;
        boolean stackOut_52_1 = false;
        int stackOut_54_0 = 0;
        boolean stackOut_54_1 = false;
        int stackOut_54_2 = 0;
        int stackOut_53_0 = 0;
        boolean stackOut_53_1 = false;
        int stackOut_53_2 = 0;
        int stackOut_55_0 = 0;
        boolean stackOut_55_1 = false;
        int stackOut_55_2 = 0;
        int stackOut_57_0 = 0;
        boolean stackOut_57_1 = false;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_56_0 = 0;
        boolean stackOut_56_1 = false;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        int stackOut_58_0 = 0;
        boolean stackOut_58_1 = false;
        int stackOut_60_0 = 0;
        boolean stackOut_60_1 = false;
        int stackOut_60_2 = 0;
        int stackOut_59_0 = 0;
        boolean stackOut_59_1 = false;
        int stackOut_59_2 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_10_1 = false;
        int stackOut_12_0 = 0;
        boolean stackOut_12_1 = false;
        int stackOut_12_2 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_11_1 = false;
        int stackOut_11_2 = 0;
        int stackOut_13_0 = 0;
        boolean stackOut_13_1 = false;
        int stackOut_13_2 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_15_1 = false;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_14_0 = 0;
        boolean stackOut_14_1 = false;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_16_1 = false;
        int stackOut_18_0 = 0;
        boolean stackOut_18_1 = false;
        int stackOut_18_2 = 0;
        int stackOut_17_0 = 0;
        boolean stackOut_17_1 = false;
        int stackOut_17_2 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        L0: {
          var38 = ArmiesOfGielinor.field_M ? 1 : 0;
          var12 = param6 << 1744478096;
          var13 = (-var12 + (param10 << -758926576)) / 40;
          var14 = param7 << -1020479472;
          var15 = (-var14 + (param1 << -347112496)) / 40;
          var16 = var12;
          var17 = var14;
          stackOut_0_0 = 0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param4 ^ param9) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 40;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        var18 = stackIn_3_0 - -stackIn_3_1;
        var19 = so.field_b.field_a;
        var20 = so.field_b.field_g;
        if (param3 < -51) {
          var21 = param5;
          L1: while (true) {
            if (40 + param5 > var21) {
              if (var38 == 0) {
                L2: {
                  stackOut_52_0 = 0;
                  stackOut_52_1 = param9;
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  if (param4) {
                    stackOut_54_0 = stackIn_54_0;
                    stackOut_54_1 = stackIn_54_1;
                    stackOut_54_2 = 0;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    stackIn_55_2 = stackOut_54_2;
                    break L2;
                  } else {
                    stackOut_53_0 = stackIn_53_0;
                    stackOut_53_1 = stackIn_53_1;
                    stackOut_53_2 = 1;
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
                    stackIn_55_2 = stackOut_53_2;
                    break L2;
                  }
                }
                L3: {
                  stackOut_55_0 = stackIn_55_0;
                  stackOut_55_1 = stackIn_55_1;
                  stackOut_55_2 = stackIn_55_2;
                  stackIn_57_0 = stackOut_55_0;
                  stackIn_57_1 = stackOut_55_1;
                  stackIn_57_2 = stackOut_55_2;
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  stackIn_56_2 = stackOut_55_2;
                  if (param8) {
                    stackOut_57_0 = stackIn_57_0;
                    stackOut_57_1 = stackIn_57_1;
                    stackOut_57_2 = stackIn_57_2;
                    stackOut_57_3 = 0;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    stackIn_58_2 = stackOut_57_2;
                    stackIn_58_3 = stackOut_57_3;
                    break L3;
                  } else {
                    stackOut_56_0 = stackIn_56_0;
                    stackOut_56_1 = stackIn_56_1;
                    stackOut_56_2 = stackIn_56_2;
                    stackOut_56_3 = 1;
                    stackIn_58_0 = stackOut_56_0;
                    stackIn_58_1 = stackOut_56_1;
                    stackIn_58_2 = stackOut_56_2;
                    stackIn_58_3 = stackOut_56_3;
                    break L3;
                  }
                }
                L4: {
                  stackOut_58_0 = stackIn_58_0;
                  stackOut_58_1 = stackIn_58_1;
                  stackIn_60_0 = stackOut_58_0;
                  stackIn_60_1 = stackOut_58_1;
                  stackIn_59_0 = stackOut_58_0;
                  stackIn_59_1 = stackOut_58_1;
                  if (stackIn_58_2 == stackIn_58_3) {
                    stackOut_60_0 = stackIn_60_0;
                    stackOut_60_1 = stackIn_60_1;
                    stackOut_60_2 = 0;
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    stackIn_61_2 = stackOut_60_2;
                    break L4;
                  } else {
                    stackOut_59_0 = stackIn_59_0;
                    stackOut_59_1 = stackIn_59_1;
                    stackOut_59_2 = 1;
                    stackIn_61_0 = stackOut_59_0;
                    stackIn_61_1 = stackOut_59_1;
                    stackIn_61_2 = stackOut_59_2;
                    break L4;
                  }
                }
                L5: {
                  stackOut_61_0 = stackIn_61_0;
                  stackIn_63_0 = stackOut_61_0;
                  stackIn_62_0 = stackOut_61_0;
                  if (stackIn_61_1 ^ stackIn_61_2 == 0) {
                    stackOut_63_0 = stackIn_63_0;
                    stackOut_63_1 = 0;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    break L5;
                  } else {
                    stackOut_62_0 = stackIn_62_0;
                    stackOut_62_1 = 20;
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_64_1 = stackOut_62_1;
                    break L5;
                  }
                }
                L6: {
                  var22 = stackIn_64_0 + stackIn_64_1;
                  var23 = var16;
                  if (!param8) {
                    stackOut_66_0 = -param5 + var21 >> 1603853377;
                    stackIn_67_0 = stackOut_66_0;
                    break L6;
                  } else {
                    stackOut_65_0 = -var21 + (param5 - -40) >> -2076091967;
                    stackIn_67_0 = stackOut_65_0;
                    break L6;
                  }
                }
                var24 = stackIn_67_0;
                var25 = 0;
                var26 = (var17 - var16) / 20;
                var27 = param2;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (param2 + 20 <= var27) {
                        break L9;
                      } else {
                        stackOut_69_0 = var25 ^ -1;
                        stackOut_69_1 = var24 ^ -1;
                        stackIn_87_0 = stackOut_69_0;
                        stackIn_87_1 = stackOut_69_1;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        if (var38 != 0) {
                          break L8;
                        } else {
                          L10: {
                            L11: {
                              L12: {
                                if (stackIn_70_0 > stackIn_70_1) {
                                  break L12;
                                } else {
                                  if (!param0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (var25 >= var24) {
                                break L10;
                              } else {
                                if (param0) {
                                  break L11;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (0 > var21) {
                              break L10;
                            } else {
                              if (var19 <= var21) {
                                break L10;
                              } else {
                                if (0 > var27) {
                                  break L10;
                                } else {
                                  if (var20 <= var27) {
                                    break L10;
                                  } else {
                                    var28 = var21 + var19 * var27;
                                    var29 = qn.field_d[var28];
                                    var30 = dd.field_k.field_B[var22 * 80 + var18];
                                    if (var29 == 0) {
                                      break L10;
                                    } else {
                                      L13: {
                                        var31 = (16772243 & var23) >> -1304464561;
                                        if (255 < var31) {
                                          var31 = 255;
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      var32 = (var29 & 16711680) >> -1382720272;
                                      var34 = 255 & var29 >> 1430622952;
                                      var35 = (-var31 + 255) * (16711680 & var30) >>> -1548807032;
                                      var33 = var29 & 255;
                                      var36 = (var30 & 255) * (-var31 + 255);
                                      var35 = var35 + var31 * 65280;
                                      var37 = (-var31 + 255) * (65280 & var30);
                                      var37 = var37 + var31 * 65280;
                                      var36 = var36 + 255 * var31;
                                      var37 = var37 >> 8;
                                      var36 = var36 >> 8;
                                      var29 = (var37 * var34 & 16711680 | (var36 * var33 & 65280 | var32 * var35 & -16777216)) >> 624440520;
                                      qn.field_d[var28] = var29;
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var25++;
                          var23 = var23 + var26;
                          var22++;
                          var27++;
                          if (var38 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var16 = var16 + var13;
                    var18++;
                    stackOut_86_0 = var17;
                    stackOut_86_1 = var15;
                    stackIn_87_0 = stackOut_86_0;
                    stackIn_87_1 = stackOut_86_1;
                    break L8;
                  }
                  var17 = stackIn_87_0 + stackIn_87_1;
                  var21++;
                  if (var38 == 0) {
                    continue L1;
                  } else {
                    return;
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
          this.field_g = -88;
          var21 = param5;
          L14: while (true) {
            if (40 + param5 > var21) {
              if (var38 == 0) {
                L15: {
                  stackOut_10_0 = 0;
                  stackOut_10_1 = param9;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (param4) {
                    stackOut_12_0 = stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L15;
                  } else {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L15;
                  }
                }
                L16: {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  if (param8) {
                    stackOut_15_0 = stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    break L16;
                  } else {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = stackIn_14_2;
                    stackOut_14_3 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    break L16;
                  }
                }
                L17: {
                  stackOut_16_0 = stackIn_16_0;
                  stackOut_16_1 = stackIn_16_1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if (stackIn_16_2 == stackIn_16_3) {
                    stackOut_18_0 = stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L17;
                  } else {
                    stackOut_17_0 = stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L17;
                  }
                }
                L18: {
                  stackOut_19_0 = stackIn_19_0;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (stackIn_19_1 ^ stackIn_19_2 == 0) {
                    stackOut_21_0 = stackIn_21_0;
                    stackOut_21_1 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L18;
                  } else {
                    stackOut_20_0 = stackIn_20_0;
                    stackOut_20_1 = 20;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    break L18;
                  }
                }
                L19: {
                  var22 = stackIn_22_0 + stackIn_22_1;
                  var23 = var16;
                  if (!param8) {
                    stackOut_24_0 = -param5 + var21 >> 1603853377;
                    stackIn_25_0 = stackOut_24_0;
                    break L19;
                  } else {
                    stackOut_23_0 = -var21 + (param5 - -40) >> -2076091967;
                    stackIn_25_0 = stackOut_23_0;
                    break L19;
                  }
                }
                var24 = stackIn_25_0;
                var25 = 0;
                var26 = (var17 - var16) / 20;
                var27 = param2;
                L20: while (true) {
                  L21: {
                    L22: {
                      if (param2 + 20 <= var27) {
                        break L22;
                      } else {
                        stackOut_27_0 = var25 ^ -1;
                        stackOut_27_1 = var24 ^ -1;
                        stackIn_45_0 = stackOut_27_0;
                        stackIn_45_1 = stackOut_27_1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        if (var38 != 0) {
                          break L21;
                        } else {
                          L23: {
                            L24: {
                              L25: {
                                if (stackIn_28_0 > stackIn_28_1) {
                                  break L25;
                                } else {
                                  if (!param0) {
                                    break L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              if (var25 >= var24) {
                                break L23;
                              } else {
                                if (param0) {
                                  break L24;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            if (0 > var21) {
                              break L23;
                            } else {
                              if (var19 <= var21) {
                                break L23;
                              } else {
                                if (0 > var27) {
                                  break L23;
                                } else {
                                  if (var20 <= var27) {
                                    break L23;
                                  } else {
                                    var28 = var21 + var19 * var27;
                                    var29 = qn.field_d[var28];
                                    var30 = dd.field_k.field_B[var22 * 80 + var18];
                                    if (var29 == 0) {
                                      break L23;
                                    } else {
                                      L26: {
                                        var31 = (16772243 & var23) >> -1304464561;
                                        if (255 < var31) {
                                          var31 = 255;
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                      var32 = (var29 & 16711680) >> -1382720272;
                                      var34 = 255 & var29 >> 1430622952;
                                      var35 = (-var31 + 255) * (16711680 & var30) >>> -1548807032;
                                      var33 = var29 & 255;
                                      var36 = (var30 & 255) * (-var31 + 255);
                                      var35 = var35 + var31 * 65280;
                                      var37 = (-var31 + 255) * (65280 & var30);
                                      var37 = var37 + var31 * 65280;
                                      var36 = var36 + 255 * var31;
                                      var37 = var37 >> 8;
                                      var36 = var36 >> 8;
                                      var29 = (var37 * var34 & 16711680 | (var36 * var33 & 65280 | var32 * var35 & -16777216)) >> 624440520;
                                      qn.field_d[var28] = var29;
                                      break L23;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var25++;
                          var23 = var23 + var26;
                          var22++;
                          var27++;
                          if (var38 == 0) {
                            continue L20;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    var16 = var16 + var13;
                    var18++;
                    stackOut_44_0 = var17;
                    stackOut_44_1 = var15;
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    break L21;
                  }
                  var17 = stackIn_45_0 + stackIn_45_1;
                  var21++;
                  if (var38 == 0) {
                    continue L14;
                  } else {
                    return;
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

    public static void d(byte param0) {
        if (param0 != 55) {
            return;
        }
        field_f = null;
    }

    final boolean a(int param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8) {
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var10 = 0;
          if (!this.a(true, param7, param8, param2)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = stackIn_3_0;
          if (var10 == 0) {
            L2: {
              if (!this.a(true, param1, param6, param4, param5, param3)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var10 = stackIn_8_0;
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 < 88) {
          this.e(93);
          return var10 != 0;
        } else {
          return var10 != 0;
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_66_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = this.field_n[0];
        var3 = this.field_n[1];
        this.field_c[0] = var2;
        var3 -= 3;
        this.field_c[1] = var3;
        this.f(param0 + -242);
        this.i(0);
        if (param0 == 200) {
          var4 = 40 + this.field_e[0];
          var5 = -20 + this.field_e[1];
          var6 = var4;
          var7 = var5;
          var8 = var2;
          var9 = var3;
          var10 = so.field_b.field_a;
          var11 = so.field_b.field_g;
          qn.f(0, 0, var10, var11);
          var12 = 0;
          L0: while (true) {
            stackOut_36_0 = var11 - -200 - -256;
            stackOut_36_1 = var7;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            L1: while (true) {
              if (stackIn_37_0 > stackIn_37_1) {
                L2: while (true) {
                  if (var13 == 0) {
                    if (var6 >= var10 - -80) {
                      L3: {
                        var7 += 20;
                        if (var12 == 0) {
                          break L3;
                        } else {
                          var6 = var4 - 40;
                          var2--;
                          break L3;
                        }
                      }
                      L4: {
                        if (var12 == 0) {
                          var6 = var4;
                          var3++;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var9 = var3;
                        var8 = var2;
                        if (var12 != 0) {
                          stackOut_65_0 = 0;
                          stackIn_66_0 = stackOut_65_0;
                          break L5;
                        } else {
                          stackOut_64_0 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          break L5;
                        }
                      }
                      var12 = stackIn_66_0;
                      if (var13 == 0) {
                        continue L0;
                      } else {
                        return;
                      }
                    } else {
                      stackOut_42_0 = -5;
                      stackOut_42_1 = var8;
                      stackIn_37_0 = stackOut_42_0;
                      stackIn_37_1 = stackOut_42_1;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      if (var13 != 0) {
                        continue L1;
                      } else {
                        L6: {
                          if (stackIn_43_0 > stackIn_43_1) {
                            break L6;
                          } else {
                            if (this.field_j < var8) {
                              break L6;
                            } else {
                              if (var9 < -1) {
                                break L6;
                              } else {
                                if (4 + this.field_m < var9) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (40 + var11 >= var7) {
                                      stackOut_49_0 = 0;
                                      stackIn_50_0 = stackOut_49_0;
                                      break L7;
                                    } else {
                                      stackOut_48_0 = 1;
                                      stackIn_50_0 = stackOut_48_0;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    bi.a(stackIn_50_0 != 0, var7, var6, param0 ^ 132, var8, var9);
                                    if (var7 <= var11 - -120) {
                                      stackOut_52_0 = 0;
                                      stackIn_53_0 = stackOut_52_0;
                                      break L8;
                                    } else {
                                      stackOut_51_0 = 1;
                                      stackIn_53_0 = stackOut_51_0;
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    wd.a(stackIn_53_0 != 0, var6, (byte) -128, var9 - 2, -80 + var7, var8 + 2);
                                    if (var7 <= 200 + var11) {
                                      stackOut_55_0 = 0;
                                      stackIn_56_0 = stackOut_55_0;
                                      break L9;
                                    } else {
                                      stackOut_54_0 = 1;
                                      stackIn_56_0 = stackOut_54_0;
                                      break L9;
                                    }
                                  }
                                  mn.a(stackIn_56_0 != 0, 4 + var8, var6, (byte) 120, var9 + -4, var7 - 160);
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        var9++;
                        var8++;
                        var6 += 80;
                        continue L2;
                      }
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
        } else {
          this.field_i = 67;
          var4 = 40 + this.field_e[0];
          var5 = -20 + this.field_e[1];
          var6 = var4;
          var7 = var5;
          var8 = var2;
          var9 = var3;
          var10 = so.field_b.field_a;
          var11 = so.field_b.field_g;
          qn.f(0, 0, var10, var11);
          var12 = 0;
          L10: while (true) {
            stackOut_2_0 = var11 - -200 - -256;
            stackOut_2_1 = var7;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            L11: while (true) {
              if (stackIn_3_0 > stackIn_3_1) {
                L12: while (true) {
                  if (var13 == 0) {
                    L13: {
                      if (var6 >= var10 - -80) {
                        break L13;
                      } else {
                        stackOut_9_0 = -5;
                        stackOut_9_1 = var8;
                        stackIn_3_0 = stackOut_9_0;
                        stackIn_3_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var13 != 0) {
                          continue L11;
                        } else {
                          L14: {
                            if (stackIn_10_0 > stackIn_10_1) {
                              break L14;
                            } else {
                              if (this.field_j < var8) {
                                break L14;
                              } else {
                                if (var9 < -1) {
                                  break L14;
                                } else {
                                  if (4 + this.field_m < var9) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (40 + var11 >= var7) {
                                        stackOut_16_0 = 0;
                                        stackIn_17_0 = stackOut_16_0;
                                        break L15;
                                      } else {
                                        stackOut_15_0 = 1;
                                        stackIn_17_0 = stackOut_15_0;
                                        break L15;
                                      }
                                    }
                                    L16: {
                                      bi.a(stackIn_17_0 != 0, var7, var6, param0 ^ 132, var8, var9);
                                      if (var7 <= var11 - -120) {
                                        stackOut_19_0 = 0;
                                        stackIn_20_0 = stackOut_19_0;
                                        break L16;
                                      } else {
                                        stackOut_18_0 = 1;
                                        stackIn_20_0 = stackOut_18_0;
                                        break L16;
                                      }
                                    }
                                    L17: {
                                      wd.a(stackIn_20_0 != 0, var6, (byte) -128, var9 - 2, -80 + var7, var8 + 2);
                                      if (var7 <= 200 + var11) {
                                        stackOut_22_0 = 0;
                                        stackIn_23_0 = stackOut_22_0;
                                        break L17;
                                      } else {
                                        stackOut_21_0 = 1;
                                        stackIn_23_0 = stackOut_21_0;
                                        break L17;
                                      }
                                    }
                                    mn.a(stackIn_23_0 != 0, 4 + var8, var6, (byte) 120, var9 + -4, var7 - 160);
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                          var9++;
                          var8++;
                          var6 += 80;
                          if (var13 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L18: {
                      var7 += 20;
                      if (var12 == 0) {
                        break L18;
                      } else {
                        var6 = var4 - 40;
                        var2--;
                        break L18;
                      }
                    }
                    L19: {
                      if (var12 == 0) {
                        var6 = var4;
                        var3++;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      var9 = var3;
                      var8 = var2;
                      if (var12 != 0) {
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        break L20;
                      } else {
                        stackOut_31_0 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        break L20;
                      }
                    }
                    var12 = stackIn_33_0;
                    if (var13 == 0) {
                      continue L10;
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
    }

    final boolean a(int param0, byte param1, int param2) {
        this.field_c[1] = param2 / this.field_j;
        if (param1 != 113) {
          this.field_e = (int[]) null;
          this.field_c[0] = -(this.field_c[1] * this.field_j) + param2;
          this.f(-62);
          return this.b((byte) -125, param0);
        } else {
          this.field_c[0] = -(this.field_c[1] * this.field_j) + param2;
          this.f(-62);
          return this.b((byte) -125, param0);
        }
    }

    final void a(byte param0, at param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        vb var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        byte stackOut_19_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_ref = (vb) ((Object) param1.d((byte) -77));
            L1: while (true) {
              L2: {
                L3: {
                  if (var3_ref == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var3_ref.field_x ^ -1;
                    stackIn_20_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 >= 0) {
                        var3_ref = (vb) ((Object) param1.b((byte) 73));
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        L4: {
                          if (var3_ref != this.field_d) {
                            stackOut_7_0 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            break L4;
                          } else {
                            stackOut_6_0 = 1;
                            stackIn_8_0 = stackOut_6_0;
                            break L4;
                          }
                        }
                        L5: {
                          var4 = stackIn_8_0;
                          this.field_d = var3_ref;
                          if (var4 == 0) {
                            this.field_q = true;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            this.field_i = -(so.field_b.field_g >> 1296231521) + var3_ref.field_v + this.field_p[1];
                            this.field_g = this.field_p[0] + var3_ref.field_m - (so.field_b.field_a >> 1432716833);
                            var5 = this.field_p[0] + -this.field_g;
                            var6 = -this.field_i + this.field_p[1];
                            if (-40001 < (var6 * var6 + var5 * var5 ^ -1)) {
                              break L7;
                            } else {
                              this.field_q = true;
                              if (var7 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var4 != 0) {
                            break L6;
                          } else {
                            this.field_q = false;
                            break L6;
                          }
                        }
                        if (this.field_q) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                  }
                }
                this.field_k[0] = this.field_g;
                this.field_k[1] = this.field_i;
                stackOut_19_0 = param0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              }
              L8: {
                if (stackIn_20_0 > 99) {
                  break L8;
                } else {
                  this.b(63, 30, (byte) -17);
                  break L8;
                }
              }
              discarded$1 = this.b((byte) -127, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("v.F(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1) {
        this.field_c[1] = param1 / this.field_j;
        this.field_c[0] = param1 - this.field_j * this.field_c[1];
        this.c((byte) -28);
        int var3 = 121 / ((-71 - param0) / 49);
    }

    final void a(int param0, int param1) {
        this.field_c[param0] = param1 / this.field_j;
        this.field_c[0] = param1 - this.field_j * this.field_c[1];
        this.f(param0 ^ -72);
        this.i(param0 + -1);
    }

    private final void b(int param0) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = -71 % ((4 - param0) / 32);
        var3 = new cn(ns.a(false, 2147483647, li.field_n), 4, this.field_j / 5, this.field_m / 5, 7, 0.5f, true).a(this.field_m, (byte) 93, this.field_j);
        this.field_o = new int[var3.length];
        var4 = 0;
        L0: while (true) {
          if (var3.length > var4) {
            this.field_o[var4] = 256 + -rn.a((int) var3[var4], 255);
            var4++;
            if (var5 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void b(boolean param0) {
        this.f(-112);
        this.field_p[0] = this.field_k[0];
        this.field_p[1] = this.field_k[1];
        this.field_g = this.field_k[0];
        this.field_i = this.field_k[1];
        this.a(param0);
        if (param0) {
          this.a(true);
          this.h(-1);
          return;
        } else {
          this.h(-1);
          return;
        }
    }

    v(int param0, int param1) {
        this.field_i = 0;
        this.field_g = 0;
        this.a(param1, param0, -87);
        ir.field_d = (v) (this);
    }

    private final void a(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        this.field_l = new int[2];
        this.field_n = new int[2];
        this.field_r = new int[2];
        this.field_a = new int[2];
        this.field_p = new int[2];
        this.field_p[0] = 40 + 80 * (this.field_j >> -1320498367) + -80;
        this.field_e = new int[2];
        this.field_p[1] = 20 + 40 * (-1 + (this.field_m >> 1562891137));
        this.field_k = new int[2];
        if (param2 > -53) {
          return;
        } else {
          this.field_h = new int[2];
          this.field_c = new int[2];
          this.field_m = param0;
          this.field_j = param1;
          this.b(63);
          discarded$1 = this.a(101, false, so.field_b.field_g >> 390950721, false, false, false, false, false, so.field_b.field_a >> 769477153);
          this.h(-1);
          return;
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var7 = -20;
        var9 = 20;
        var6 = 40;
        var2 = 40;
        var4 = this.field_c[0];
        var5 = this.field_c[1];
        if (param0 >= -30) {
          this.field_d = (vb) null;
          var8 = 40;
          var3 = this.field_j * 40 >> -2123161439;
          var11 = var5 * var9 + var4 * var7;
          var10 = var6 * var4 - -(var8 * var5);
          var3 = var3 - -var11;
          var2 = var10 + var2;
          this.field_k[0] = var2;
          this.field_k[1] = var3;
          return;
        } else {
          var8 = 40;
          var3 = this.field_j * 40 >> -2123161439;
          var11 = var5 * var9 + var4 * var7;
          var10 = var6 * var4 - -(var8 * var5);
          var3 = var3 - -var11;
          var2 = var10 + var2;
          this.field_k[0] = var2;
          this.field_k[1] = var3;
          return;
        }
    }

    static {
        field_f = "Environmental";
    }
}
