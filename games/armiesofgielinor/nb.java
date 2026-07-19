/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    private int field_d;
    private int field_e;
    private int field_n;
    private wk[] field_k;
    private int field_l;
    private int field_o;
    private int field_q;
    private int field_c;
    private boolean field_s;
    private boolean field_p;
    static wm field_i;
    private int field_f;
    private int field_b;
    private boolean field_g;
    private boolean field_r;
    static String[] field_h;
    private int[] field_m;
    private boolean field_a;
    private int field_j;

    final static void a(int param0, int param1, byte param2, jd param3) {
        if (param2 != -97) {
            return;
        }
        try {
            param0 -= 16;
            ns.field_E.h(param0 + 48, 12 + param1);
            km.field_h[0].h(46 + param0, param1 - -10);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "nb.S(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        this.field_a = false;
        this.field_g = false;
        if (!this.field_r) {
          return;
        } else {
          if (!this.field_s) {
            return;
          } else {
            this.field_a = this.a(0, param0, param1, param2);
            this.field_g = this.a(1, param0, param1, 0);
            return;
          }
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var2 = 0;
            var3 = 0;
            if (-1 != (this.field_l ^ -1)) {
              break L1;
            } else {
              var2 = this.field_q;
              var3 = this.field_k[0].field_x;
              if (!ArmiesOfGielinor.field_M) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (this.field_l != 1) {
            break L0;
          } else {
            var3 = this.field_q;
            var2 = this.field_k[0].field_A;
            break L0;
          }
        }
        qn.b(this.field_c, this.field_d, var2, var3, this.field_m[0]);
        if (param0 != 1043) {
          this.g(61);
          return;
        } else {
          return;
        }
    }

    final static int c(byte param0) {
        if (param0 < 93) {
            jd var2 = (jd) null;
            nb.a(-81, 18, (byte) -44, (jd) null);
            return ku.field_K;
        }
        return ku.field_K;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -2) {
          L0: {
            if (this.field_l != 0) {
              break L0;
            } else {
              var4 = this.field_q;
              var5 = this.field_j;
              if (var6 != 0) {
                break L0;
              } else {
                return mo.a(param2, this.field_c, this.field_d, param0, var4, (byte) -107, var5);
              }
            }
          }
          if (-2 == (this.field_l ^ -1)) {
            var4 = this.field_j;
            var5 = this.field_q;
            if (var6 != 0) {
              return false;
            } else {
              return mo.a(param2, this.field_c, this.field_d, param0, var4, (byte) -107, var5);
            }
          } else {
            return false;
          }
        } else {
          this.b(-86, 56, -106);
          if (this.field_l == 0) {
            var4 = this.field_q;
            var5 = this.field_j;
            if (var6 != 0) {
              if (-2 == (this.field_l ^ -1)) {
                var4 = this.field_j;
                var5 = this.field_q;
                if (var6 == 0) {
                  return mo.a(param2, this.field_c, this.field_d, param0, var4, (byte) -107, var5);
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return mo.a(param2, this.field_c, this.field_d, param0, var4, (byte) -107, var5);
            }
          } else {
            if (-2 == (this.field_l ^ -1)) {
              var4 = this.field_j;
              var5 = this.field_q;
              if (var6 != 0) {
                return false;
              } else {
                return mo.a(param2, this.field_c, this.field_d, param0, var4, (byte) -107, var5);
              }
            } else {
              return false;
            }
          }
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = this.b(param3 ^ 0, param0);
        int var7 = this.a(param3, param0);
        int var8 = this.field_k[0].field_A;
        int var9 = this.field_k[0].field_x;
        var5 = mo.a(param1, var6, var7, param2, var8, (byte) -110, var9) ? 1 : 0;
        return var5 != 0;
    }

    public static void d(byte param0) {
        field_h = null;
        int var1 = -89 / ((param0 - -18) / 38);
        field_i = null;
    }

    private final boolean a(boolean param0, byte param1) {
        if (param1 == 10) {
          if (this.field_e <= 0) {
            if (!param0) {
              if (-1 > (this.field_e ^ -1)) {
                this.field_e = 0;
                return false;
              } else {
                this.field_e = 0;
                return false;
              }
            } else {
              this.field_e = 5;
              return true;
            }
          } else {
            if (-1 > (this.field_e ^ -1)) {
              if (!param0) {
                this.field_e = 0;
                return false;
              } else {
                this.field_e = this.field_e - 1;
                return false;
              }
            } else {
              this.field_e = 0;
              return false;
            }
          }
        } else {
          this.field_e = -1;
          if (this.field_e <= 0) {
            if (!param0) {
              if (-1 > (this.field_e ^ -1)) {
                this.field_e = 0;
                return false;
              } else {
                this.field_e = 0;
                return false;
              }
            } else {
              this.field_e = 5;
              return true;
            }
          } else {
            if (-1 > (this.field_e ^ -1)) {
              if (!param0) {
                this.field_e = 0;
                return false;
              } else {
                this.field_e = this.field_e - 1;
                return false;
              }
            } else {
              this.field_e = 0;
              return false;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != 47) {
          this.b(43);
          this.field_b = param0;
          this.field_f = param2;
          this.field_o = param3;
          this.field_n = param4;
          return;
        } else {
          this.field_b = param0;
          this.field_f = param2;
          this.field_o = param3;
          this.field_n = param4;
          return;
        }
    }

    private final void b(int param0) {
        if (param0 != 0) {
            return;
        }
        this.field_s = true;
    }

    private final void a(int param0) {
        if (param0 != 27150) {
            return;
        }
        this.field_j = this.field_k[0].field_A;
    }

    final void f(int param0) {
        this.g(param0 ^ 1043);
        this.a((byte) -91, param0);
        this.a((byte) -121, 1);
        this.e(-1342059263);
    }

    final boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return this.field_p;
    }

    final int c(int param0) {
        boolean discarded$0 = false;
        if (param0 != 26787) {
            discarded$0 = this.c(true);
            return this.field_j;
        }
        return this.field_j;
    }

    private final int c(int param0, int param1) {
        int var3 = 0;
        var3 = 0;
        if (param1 == 1) {
          L0: {
            if (param0 != 0) {
              break L0;
            } else {
              if (this.field_a) {
                var3 = 1;
                if (ArmiesOfGielinor.field_M) {
                  break L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
          if (param0 == 1) {
            if (!this.field_g) {
              return var3;
            } else {
              var3 = 1;
              return var3;
            }
          } else {
            return var3;
          }
        } else {
          this.field_m = (int[]) null;
          if (param0 == 0) {
            if (this.field_a) {
              var3 = 1;
              if (ArmiesOfGielinor.field_M) {
                if (param0 == 1) {
                  if (!this.field_g) {
                    return var3;
                  } else {
                    var3 = 1;
                    return var3;
                  }
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          } else {
            if (param0 == 1) {
              if (!this.field_g) {
                return var3;
              } else {
                var3 = 1;
                return var3;
              }
            } else {
              return var3;
            }
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -78;
        }
        return this.field_b;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = param0;
        if (param1 == 0) {
          L0: {
            if (this.field_l != 0) {
              break L0;
            } else {
              var3 = this.field_d;
              if (var5 != 0) {
                break L0;
              } else {
                return var3;
              }
            }
          }
          if (1 != this.field_l) {
            return var3;
          } else {
            var4 = this.field_k[0].field_x;
            var3 = this.field_d - (-this.field_q - -var4);
            return var3;
          }
        } else {
          if ((param1 ^ -1) == -2) {
            if (0 == this.field_l) {
              var3 = this.field_d;
              if (var5 != 0) {
                if ((this.field_l ^ -1) == -2) {
                  var3 = this.field_d;
                  if (var5 != 0) {
                    L1: {
                      if (this.field_l != 0) {
                        break L1;
                      } else {
                        var3 = this.field_d;
                        break L1;
                      }
                    }
                    if (1 != this.field_l) {
                      return var3;
                    } else {
                      var4 = this.field_k[0].field_x;
                      var3 = this.field_d - (-this.field_q - -var4);
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            } else {
              if ((this.field_l ^ -1) == -2) {
                var3 = this.field_d;
                if (var5 != 0) {
                  L2: {
                    if (this.field_l != 0) {
                      break L2;
                    } else {
                      var3 = this.field_d;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        return var3;
                      }
                    }
                  }
                  if (1 != this.field_l) {
                    return var3;
                  } else {
                    var4 = this.field_k[0].field_x;
                    var3 = this.field_d - (-this.field_q - -var4);
                    return var3;
                  }
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_q = param3;
        this.field_c = param2;
        this.field_d = param0;
        if (param1 >= -119) {
            return;
        }
    }

    final void b(byte param0) {
        if (param0 != -65) {
            this.field_b = 67;
            this.field_r = false;
            return;
        }
        this.field_r = false;
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        wk var9 = null;
        wk var13 = null;
        wk var14 = null;
        wk var15 = null;
        wk var16 = null;
        wk var17 = null;
        wk var18 = null;
        wk var19 = null;
        wk var20 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = this.b(0, param1);
        var4 = this.a(0, param1);
        var6 = -12 / ((-44 - param0) / 33);
        var5 = this.c(param1, 1);
        if (param1 != 0) {
          if (1 == param1) {
            if (0 == this.field_l) {
              var9 = this.field_k[var5];
              var19 = var9;
              var19 = var9;
              var9.d(var3, var4);
              if (var8 != 0) {
                if (this.field_l != 1) {
                  return;
                } else {
                  L0: {
                    var16 = this.field_k[var5];
                    var19 = var16;
                    var19 = var16;
                    var16.c(var3, var4);
                    if (var8 == 0) {
                      break L0;
                    } else {
                      L1: {
                        if (-1 == (this.field_l ^ -1)) {
                          break L1;
                        } else {
                          if (1 != this.field_l) {
                            break L0;
                          } else {
                            var17 = this.field_k[var5];
                            var19 = var17;
                            var19 = var17;
                            var17.g(var3, var4);
                            break L1;
                          }
                        }
                      }
                      var18 = this.field_k[var5];
                      var20 = var18;
                      var20 = var18;
                      var18.g(var3, var4);
                      break L0;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              if (this.field_l != 1) {
                return;
              } else {
                L2: {
                  var13 = this.field_k[var5];
                  var9 = var13;
                  var19 = var9;
                  var9 = var13;
                  var13.c(var3, var4);
                  if (var8 == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (-1 == (this.field_l ^ -1)) {
                        break L3;
                      } else {
                        if (1 != this.field_l) {
                          break L2;
                        } else {
                          var14 = this.field_k[var5];
                          var9 = var14;
                          var19 = var9;
                          var9 = var14;
                          var14.g(var3, var4);
                          break L3;
                        }
                      }
                    }
                    var15 = this.field_k[var5];
                    var19 = var15;
                    var19 = var15;
                    var15.g(var3, var4);
                    break L2;
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        } else {
          L4: {
            L5: {
              if (-1 == (this.field_l ^ -1)) {
                break L5;
              } else {
                if (1 != this.field_l) {
                  break L4;
                } else {
                  var19 = this.field_k[var5];
                  var19.g(var3, var4);
                  if (var8 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            var20 = this.field_k[var5];
            var20.g(var3, var4);
            break L4;
          }
          return;
        }
    }

    final int a(byte param0) {
        if (param0 < 62) {
            this.f(-97);
            return this.field_f;
        }
        return this.field_f;
    }

    final void a(boolean param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        Object stackIn_119_0 = null;
        Object stackIn_120_0 = null;
        Object stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        Object stackIn_122_0 = null;
        Object stackIn_123_0 = null;
        Object stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        Object stackOut_118_0 = null;
        Object stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        Object stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        Object stackOut_121_0 = null;
        Object stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        Object stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        Object stackOut_77_0 = null;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_80_0 = null;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        this.field_p = false;
        if (!this.field_r) {
          return;
        } else {
          if (this.field_s) {
            if (!this.a(param3, (byte) 10)) {
              if (!param0) {
                if (param1 != 0) {
                  L0: {
                    if (this.field_l != 1) {
                      break L0;
                    } else {
                      if (this.field_a) {
                        break L0;
                      } else {
                        if (!this.field_g) {
                          L1: {
                            stackOut_118_0 = this;
                            stackIn_120_0 = stackOut_118_0;
                            stackIn_119_0 = stackOut_118_0;
                            if (0 >= param1) {
                              stackOut_120_0 = this;
                              stackOut_120_1 = 0;
                              stackIn_121_0 = stackOut_120_0;
                              stackIn_121_1 = stackOut_120_1;
                              break L1;
                            } else {
                              stackOut_119_0 = this;
                              stackOut_119_1 = 1;
                              stackIn_121_0 = stackOut_119_0;
                              stackIn_121_1 = stackOut_119_1;
                              break L1;
                            }
                          }
                          L2: {
                            ((nb) (this)).field_a = stackIn_121_1 != 0;
                            stackOut_121_0 = this;
                            stackIn_123_0 = stackOut_121_0;
                            stackIn_122_0 = stackOut_121_0;
                            if (-1 >= (param1 ^ -1)) {
                              stackOut_123_0 = this;
                              stackOut_123_1 = 0;
                              stackIn_124_0 = stackOut_123_0;
                              stackIn_124_1 = stackOut_123_1;
                              break L2;
                            } else {
                              stackOut_122_0 = this;
                              stackOut_122_1 = 1;
                              stackIn_124_0 = stackOut_122_0;
                              stackIn_124_1 = stackOut_122_1;
                              break L2;
                            }
                          }
                          ((nb) (this)).field_g = stackIn_124_1 != 0;
                          break L0;
                        } else {
                          L3: {
                            L4: {
                              if (!this.field_a) {
                                break L4;
                              } else {
                                var5 = 1;
                                if (!ArmiesOfGielinor.field_M) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            if (this.field_g) {
                              var5 = -1;
                              break L3;
                            } else {
                              return;
                            }
                          }
                          this.field_b = this.field_b + var5 * this.field_n;
                          if (param2 == -2) {
                            if (-1 >= (this.field_b ^ -1)) {
                              var6 = this.field_f + this.field_b;
                              this.field_p = true;
                              if (var6 > this.field_o) {
                                this.field_b = this.field_o + -this.field_f;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              L5: {
                                this.field_b = 0;
                                var6 = this.field_f + this.field_b;
                                this.field_p = true;
                                if (var6 <= this.field_o) {
                                  break L5;
                                } else {
                                  this.field_b = this.field_o + -this.field_f;
                                  break L5;
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
                  }
                  L6: {
                    L7: {
                      if (!this.field_a) {
                        break L7;
                      } else {
                        var5 = 1;
                        if (!ArmiesOfGielinor.field_M) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (this.field_g) {
                      var5 = -1;
                      break L6;
                    } else {
                      return;
                    }
                  }
                  this.field_b = this.field_b + var5 * this.field_n;
                  if (param2 == -2) {
                    if (-1 >= (this.field_b ^ -1)) {
                      var6 = this.field_f + this.field_b;
                      this.field_p = true;
                      if (var6 > this.field_o) {
                        this.field_b = this.field_o + -this.field_f;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_b = 0;
                      var6 = this.field_f + this.field_b;
                      this.field_p = true;
                      if (var6 > this.field_o) {
                        this.field_b = this.field_o + -this.field_f;
                        return;
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
              } else {
                if (this.field_l == 1) {
                  if (!this.field_a) {
                    if (!this.field_g) {
                      L8: {
                        stackOut_77_0 = this;
                        stackIn_79_0 = stackOut_77_0;
                        stackIn_78_0 = stackOut_77_0;
                        if (0 >= param1) {
                          stackOut_79_0 = this;
                          stackOut_79_1 = 0;
                          stackIn_80_0 = stackOut_79_0;
                          stackIn_80_1 = stackOut_79_1;
                          break L8;
                        } else {
                          stackOut_78_0 = this;
                          stackOut_78_1 = 1;
                          stackIn_80_0 = stackOut_78_0;
                          stackIn_80_1 = stackOut_78_1;
                          break L8;
                        }
                      }
                      L9: {
                        ((nb) (this)).field_a = stackIn_80_1 != 0;
                        stackOut_80_0 = this;
                        stackIn_82_0 = stackOut_80_0;
                        stackIn_81_0 = stackOut_80_0;
                        if (-1 >= (param1 ^ -1)) {
                          stackOut_82_0 = this;
                          stackOut_82_1 = 0;
                          stackIn_83_0 = stackOut_82_0;
                          stackIn_83_1 = stackOut_82_1;
                          break L9;
                        } else {
                          stackOut_81_0 = this;
                          stackOut_81_1 = 1;
                          stackIn_83_0 = stackOut_81_0;
                          stackIn_83_1 = stackOut_81_1;
                          break L9;
                        }
                      }
                      L10: {
                        L11: {
                          ((nb) (this)).field_g = stackIn_83_1 != 0;
                          if (!this.field_a) {
                            break L11;
                          } else {
                            var5 = 1;
                            if (!ArmiesOfGielinor.field_M) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (this.field_g) {
                          var5 = -1;
                          break L10;
                        } else {
                          return;
                        }
                      }
                      this.field_b = this.field_b + var5 * this.field_n;
                      if (param2 == -2) {
                        if (-1 >= (this.field_b ^ -1)) {
                          var6 = this.field_f + this.field_b;
                          this.field_p = true;
                          if (var6 > this.field_o) {
                            this.field_b = this.field_o + -this.field_f;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L12: {
                            this.field_b = 0;
                            var6 = this.field_f + this.field_b;
                            this.field_p = true;
                            if (var6 <= this.field_o) {
                              break L12;
                            } else {
                              this.field_b = this.field_o + -this.field_f;
                              break L12;
                            }
                          }
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L13: {
                        L14: {
                          if (!this.field_a) {
                            break L14;
                          } else {
                            var5 = 1;
                            if (!ArmiesOfGielinor.field_M) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (this.field_g) {
                          var5 = -1;
                          break L13;
                        } else {
                          return;
                        }
                      }
                      this.field_b = this.field_b + var5 * this.field_n;
                      if (param2 != -2) {
                        return;
                      } else {
                        L15: {
                          if (-1 >= (this.field_b ^ -1)) {
                            break L15;
                          } else {
                            this.field_b = 0;
                            break L15;
                          }
                        }
                        L16: {
                          var6 = this.field_f + this.field_b;
                          this.field_p = true;
                          if (var6 <= this.field_o) {
                            break L16;
                          } else {
                            this.field_b = this.field_o + -this.field_f;
                            break L16;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    L17: {
                      L18: {
                        if (!this.field_a) {
                          break L18;
                        } else {
                          var5 = 1;
                          if (!ArmiesOfGielinor.field_M) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      if (this.field_g) {
                        var5 = -1;
                        break L17;
                      } else {
                        return;
                      }
                    }
                    this.field_b = this.field_b + var5 * this.field_n;
                    if (param2 == -2) {
                      if (-1 >= (this.field_b ^ -1)) {
                        var6 = this.field_f + this.field_b;
                        this.field_p = true;
                        if (var6 > this.field_o) {
                          this.field_b = this.field_o + -this.field_f;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L19: {
                          this.field_b = 0;
                          var6 = this.field_f + this.field_b;
                          this.field_p = true;
                          if (var6 <= this.field_o) {
                            break L19;
                          } else {
                            this.field_b = this.field_o + -this.field_f;
                            break L19;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L20: {
                    L21: {
                      if (!this.field_a) {
                        break L21;
                      } else {
                        var5 = 1;
                        if (!ArmiesOfGielinor.field_M) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    if (this.field_g) {
                      var5 = -1;
                      break L20;
                    } else {
                      return;
                    }
                  }
                  this.field_b = this.field_b + var5 * this.field_n;
                  if (param2 == -2) {
                    if (-1 >= (this.field_b ^ -1)) {
                      var6 = this.field_f + this.field_b;
                      this.field_p = true;
                      if (var6 > this.field_o) {
                        this.field_b = this.field_o + -this.field_f;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L22: {
                        this.field_b = 0;
                        var6 = this.field_f + this.field_b;
                        this.field_p = true;
                        if (var6 <= this.field_o) {
                          break L22;
                        } else {
                          this.field_b = this.field_o + -this.field_f;
                          break L22;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              L23: {
                if (this.field_l != 1) {
                  break L23;
                } else {
                  if (this.field_a) {
                    break L23;
                  } else {
                    if (!this.field_g) {
                      L24: {
                        stackOut_10_0 = this;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (0 >= param1) {
                          stackOut_12_0 = this;
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L24;
                        } else {
                          stackOut_11_0 = this;
                          stackOut_11_1 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L24;
                        }
                      }
                      L25: {
                        ((nb) (this)).field_a = stackIn_13_1 != 0;
                        stackOut_13_0 = this;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (-1 >= (param1 ^ -1)) {
                          stackOut_15_0 = this;
                          stackOut_15_1 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          break L25;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          break L25;
                        }
                      }
                      ((nb) (this)).field_g = stackIn_16_1 != 0;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
              }
              L26: {
                L27: {
                  if (!this.field_a) {
                    break L27;
                  } else {
                    var5 = 1;
                    if (!ArmiesOfGielinor.field_M) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                if (this.field_g) {
                  var5 = -1;
                  break L26;
                } else {
                  return;
                }
              }
              this.field_b = this.field_b + var5 * this.field_n;
              if (param2 != -2) {
                return;
              } else {
                L28: {
                  if (-1 >= (this.field_b ^ -1)) {
                    break L28;
                  } else {
                    this.field_b = 0;
                    break L28;
                  }
                }
                L29: {
                  var6 = this.field_f + this.field_b;
                  this.field_p = true;
                  if (var6 <= this.field_o) {
                    break L29;
                  } else {
                    this.field_b = this.field_o + -this.field_f;
                    break L29;
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final boolean c(boolean param0) {
        if (param0) {
            return false;
        }
        return this.field_r;
    }

    final void d(int param0) {
        this.field_r = true;
        if (param0 > -60) {
            this.f(-13);
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            var3 = param0;
            if (-1 == (param1 ^ -1)) {
              break L1;
            } else {
              if ((param1 ^ -1) != -2) {
                break L0;
              } else {
                L2: {
                  if (this.field_l == 0) {
                    break L2;
                  } else {
                    if (this.field_l != 1) {
                      break L0;
                    } else {
                      var3 = this.field_c;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var3 = this.field_c;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L3: {
            if (0 != this.field_l) {
              break L3;
            } else {
              var4 = this.field_k[0].field_A;
              var3 = this.field_c - (-this.field_q - -var4);
              if (var5 == 0) {
                break L0;
              } else {
                break L3;
              }
            }
          }
          if (this.field_l != 1) {
            break L0;
          } else {
            var3 = this.field_c;
            break L0;
          }
        }
        return var3;
    }

    private final void e(int param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var2 = 0;
          var3 = 0;
          if (param0 == -1342059263) {
            break L0;
          } else {
            discarded$1 = this.a(false, (byte) 16);
            break L0;
          }
        }
        L1: {
          var4 = 0;
          var5 = 0;
          var6 = this.field_o;
          if (0 >= var6) {
            var6 = 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (this.field_l != 0) {
            break L2;
          } else {
            L3: {
              var7 = this.field_k[0].field_A;
              var2 = var7 + (this.b(0, 1) - -((-(var7 << 67443009) + this.field_q) * this.field_b / var6));
              var3 = this.field_d;
              var4 = this.field_f * (this.field_q + -(var7 << -1342059263)) / var6;
              if (this.field_f + this.field_b == this.field_o) {
                var4 = this.b(0, 0) + -var2;
                break L3;
              } else {
                break L3;
              }
            }
            var5 = this.field_j;
            break L2;
          }
        }
        if ((this.field_l ^ -1) != -2) {
          qn.f(var2, var3, var4, var5, this.field_m[1]);
          qn.b(var2, var3, var4, var5, this.field_m[0]);
          return;
        } else {
          L4: {
            var2 = this.field_c;
            var7 = this.field_k[0].field_x;
            var3 = var7 + this.a(0, 1) + (-(var7 << -57258559) + this.field_q) * this.field_b / var6;
            var4 = this.field_j;
            var5 = this.field_f * (-(var7 << 545167009) + this.field_q) / var6;
            if (this.field_b - -this.field_f == this.field_o) {
              var5 = this.a(0, 0) + -var3;
              break L4;
            } else {
              break L4;
            }
          }
          qn.f(var2, var3, var4, var5, this.field_m[1]);
          qn.b(var2, var3, var4, var5, this.field_m[0]);
          return;
        }
    }

    nb(wk[] param0, int[] param1, int param2) {
        RuntimeException var4 = null;
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
        try {
          L0: {
            this.field_l = param2;
            this.field_k = param0;
            this.field_m = param1;
            this.a(27150);
            this.b(0);
            this.b((byte) -65);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var4);
            stackOut_3_1 = new StringBuilder().append("nb.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    static {
        field_i = new wm();
    }
}
