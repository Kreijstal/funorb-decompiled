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
            throw ig.a((Throwable) (Object) runtimeException, "nb.S(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        ((nb) this).field_a = false;
        ((nb) this).field_g = false;
        if (!((nb) this).field_r) {
          return;
        } else {
          if (!((nb) this).field_s) {
            return;
          } else {
            ((nb) this).field_a = this.a(0, param0, param1, param2);
            ((nb) this).field_g = this.a(1, param0, param1, 0);
            return;
          }
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = 0;
        var3 = 0;
        if (((nb) this).field_l != 0) {
          L0: {
            if (((nb) this).field_l != 1) {
              break L0;
            } else {
              var3 = ((nb) this).field_q;
              var2 = ((nb) this).field_k[0].field_A;
              break L0;
            }
          }
          qn.b(((nb) this).field_c, ((nb) this).field_d, var2, var3, ((nb) this).field_m[0]);
          if (param0 != 1043) {
            this.g(61);
            return;
          } else {
            return;
          }
        } else {
          var2 = ((nb) this).field_q;
          var3 = ((nb) this).field_k[0].field_x;
          qn.b(((nb) this).field_c, ((nb) this).field_d, var2, var3, ((nb) this).field_m[0]);
          if (param0 == 1043) {
            return;
          } else {
            this.g(61);
            return;
          }
        }
    }

    final static int c(byte param0) {
        return ku.field_K;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -2) {
          if (((nb) this).field_l != 0) {
            if (((nb) this).field_l == 1) {
              var4 = ((nb) this).field_j;
              var5 = ((nb) this).field_q;
              return mo.a(param2, ((nb) this).field_c, ((nb) this).field_d, param0, var4, (byte) -107, var5);
            } else {
              return false;
            }
          } else {
            var4 = ((nb) this).field_q;
            var5 = ((nb) this).field_j;
            return mo.a(param2, ((nb) this).field_c, ((nb) this).field_d, param0, var4, (byte) -107, var5);
          }
        } else {
          ((nb) this).b(-86, 56, -106);
          if (((nb) this).field_l != 0) {
            if (((nb) this).field_l == 1) {
              var4 = ((nb) this).field_j;
              var5 = ((nb) this).field_q;
              return mo.a(param2, ((nb) this).field_c, ((nb) this).field_d, param0, var4, (byte) -107, var5);
            } else {
              return false;
            }
          } else {
            var4 = ((nb) this).field_q;
            var5 = ((nb) this).field_j;
            return mo.a(param2, ((nb) this).field_c, ((nb) this).field_d, param0, var4, (byte) -107, var5);
          }
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = this.b(param3, param0);
        int var7 = this.a(param3, param0);
        int var8 = ((nb) this).field_k[0].field_A;
        int var9 = ((nb) this).field_k[0].field_x;
        var5 = mo.a(param1, var6, var7, param2, var8, (byte) -110, var9) ? 1 : 0;
        return var5 != 0;
    }

    public static void d(byte param0) {
        field_h = null;
        int var1 = -44;
        field_i = null;
    }

    private final boolean a(boolean param0, byte param1) {
        if (param1 == 10) {
          if (((nb) this).field_e <= 0) {
            if (!param0) {
              if (((nb) this).field_e > 0) {
                ((nb) this).field_e = 0;
                return false;
              } else {
                ((nb) this).field_e = 0;
                return false;
              }
            } else {
              ((nb) this).field_e = 5;
              return true;
            }
          } else {
            if (((nb) this).field_e > 0) {
              if (!param0) {
                ((nb) this).field_e = 0;
                return false;
              } else {
                ((nb) this).field_e = ((nb) this).field_e - 1;
                return false;
              }
            } else {
              ((nb) this).field_e = 0;
              return false;
            }
          }
        } else {
          ((nb) this).field_e = -1;
          if (((nb) this).field_e <= 0) {
            if (!param0) {
              if (((nb) this).field_e > 0) {
                ((nb) this).field_e = 0;
                return false;
              } else {
                ((nb) this).field_e = 0;
                return false;
              }
            } else {
              ((nb) this).field_e = 5;
              return true;
            }
          } else {
            if (((nb) this).field_e > 0) {
              if (!param0) {
                ((nb) this).field_e = 0;
                return false;
              } else {
                ((nb) this).field_e = ((nb) this).field_e - 1;
                return false;
              }
            } else {
              ((nb) this).field_e = 0;
              return false;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != 47) {
          this.b(43);
          ((nb) this).field_b = param0;
          ((nb) this).field_f = param2;
          ((nb) this).field_o = param3;
          ((nb) this).field_n = param4;
          return;
        } else {
          ((nb) this).field_b = param0;
          ((nb) this).field_f = param2;
          ((nb) this).field_o = param3;
          ((nb) this).field_n = param4;
          return;
        }
    }

    private final void b(int param0) {
        if (param0 != 0) {
            return;
        }
        ((nb) this).field_s = true;
    }

    private final void a(int param0) {
        ((nb) this).field_j = ((nb) this).field_k[0].field_A;
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
        return ((nb) this).field_p;
    }

    final int c(int param0) {
        if (param0 != 26787) {
            boolean discarded$0 = ((nb) this).c(true);
            return ((nb) this).field_j;
        }
        return ((nb) this).field_j;
    }

    private final int c(int param0, int param1) {
        int var3 = 0;
        var3 = 0;
        if (param0 != 0) {
          if (param0 == 1) {
            if (!((nb) this).field_g) {
              return var3;
            } else {
              var3 = 1;
              return var3;
            }
          } else {
            return var3;
          }
        } else {
          if (!((nb) this).field_a) {
            return var3;
          } else {
            var3 = 1;
            return var3;
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -78;
        }
        return ((nb) this).field_b;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = param0;
        if (param1 == 0) {
          if (((nb) this).field_l != 0) {
            if (1 != ((nb) this).field_l) {
              return var3;
            } else {
              var4 = ((nb) this).field_k[0].field_x;
              var3 = ((nb) this).field_d - (-((nb) this).field_q - -var4);
              return var3;
            }
          } else {
            var3 = ((nb) this).field_d;
            return var3;
          }
        } else {
          if (param1 == 1) {
            if (0 != ((nb) this).field_l) {
              if (((nb) this).field_l == 1) {
                var3 = ((nb) this).field_d;
                return var3;
              } else {
                return var3;
              }
            } else {
              var3 = ((nb) this).field_d;
              return var3;
            }
          } else {
            return var3;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((nb) this).field_q = param3;
        ((nb) this).field_c = param2;
        ((nb) this).field_d = param0;
        if (param1 >= -119) {
            return;
        }
    }

    final void b(byte param0) {
        if (param0 != -65) {
            ((nb) this).field_b = 67;
            ((nb) this).field_r = false;
            return;
        }
        ((nb) this).field_r = false;
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        wk var9 = null;
        wk var10 = null;
        wk var11 = null;
        wk var12 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = this.b(0, param1);
        var4 = this.a(0, param1);
        var6 = -12 / ((-44 - param0) / 33);
        var5 = this.c(param1, 1);
        if (param1 == 0) {
          if (((nb) this).field_l != 0) {
            if (1 != ((nb) this).field_l) {
              return;
            } else {
              var11 = ((nb) this).field_k[var5];
              var11.g(var3, var4);
              return;
            }
          } else {
            var12 = ((nb) this).field_k[var5];
            var12.g(var3, var4);
            return;
          }
        } else {
          if (1 == param1) {
            if (0 != ((nb) this).field_l) {
              if (((nb) this).field_l != 1) {
                return;
              } else {
                var10 = ((nb) this).field_k[var5];
                var12 = var10;
                var12 = var10;
                var10.c(var3, var4);
                return;
              }
            } else {
              var9 = ((nb) this).field_k[var5];
              var10 = var9;
              var12 = var10;
              var10 = var9;
              var9.d(var3, var4);
              return;
            }
          } else {
            return;
          }
        }
    }

    final int a(byte param0) {
        if (param0 < 62) {
            ((nb) this).f(-97);
            return ((nb) this).field_f;
        }
        return ((nb) this).field_f;
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
        ((nb) this).field_p = false;
        if (!((nb) this).field_r) {
          return;
        } else {
          if (((nb) this).field_s) {
            if (!this.a(param3, (byte) 10)) {
              if (!param0) {
                if (param1 != 0) {
                  L0: {
                    if (((nb) this).field_l != 1) {
                      break L0;
                    } else {
                      if (((nb) this).field_a) {
                        break L0;
                      } else {
                        if (!((nb) this).field_g) {
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
                            ((nb) this).field_a = stackIn_121_1 != 0;
                            stackOut_121_0 = this;
                            stackIn_123_0 = stackOut_121_0;
                            stackIn_122_0 = stackOut_121_0;
                            if (param1 >= 0) {
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
                          ((nb) this).field_g = stackIn_124_1 != 0;
                          break L0;
                        } else {
                          L3: {
                            if (!((nb) this).field_a) {
                              if (((nb) this).field_g) {
                                var5 = -1;
                                break L3;
                              } else {
                                return;
                              }
                            } else {
                              var5 = 1;
                              break L3;
                            }
                          }
                          ((nb) this).field_b = ((nb) this).field_b + var5 * ((nb) this).field_n;
                          if (param2 == -2) {
                            if (((nb) this).field_b >= 0) {
                              var6 = ((nb) this).field_f + ((nb) this).field_b;
                              ((nb) this).field_p = true;
                              if (var6 > ((nb) this).field_o) {
                                ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              L4: {
                                ((nb) this).field_b = 0;
                                var6 = ((nb) this).field_f + ((nb) this).field_b;
                                ((nb) this).field_p = true;
                                if (var6 <= ((nb) this).field_o) {
                                  break L4;
                                } else {
                                  ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                                  break L4;
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
                  L5: {
                    if (!((nb) this).field_a) {
                      if (((nb) this).field_g) {
                        var5 = -1;
                        break L5;
                      } else {
                        return;
                      }
                    } else {
                      var5 = 1;
                      break L5;
                    }
                  }
                  ((nb) this).field_b = ((nb) this).field_b + var5 * ((nb) this).field_n;
                  if (param2 == -2) {
                    if (((nb) this).field_b >= 0) {
                      var6 = ((nb) this).field_f + ((nb) this).field_b;
                      ((nb) this).field_p = true;
                      if (var6 > ((nb) this).field_o) {
                        ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((nb) this).field_b = 0;
                      var6 = ((nb) this).field_f + ((nb) this).field_b;
                      ((nb) this).field_p = true;
                      if (var6 > ((nb) this).field_o) {
                        ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
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
                if (((nb) this).field_l == 1) {
                  if (!((nb) this).field_a) {
                    if (!((nb) this).field_g) {
                      L6: {
                        stackOut_77_0 = this;
                        stackIn_79_0 = stackOut_77_0;
                        stackIn_78_0 = stackOut_77_0;
                        if (0 >= param1) {
                          stackOut_79_0 = this;
                          stackOut_79_1 = 0;
                          stackIn_80_0 = stackOut_79_0;
                          stackIn_80_1 = stackOut_79_1;
                          break L6;
                        } else {
                          stackOut_78_0 = this;
                          stackOut_78_1 = 1;
                          stackIn_80_0 = stackOut_78_0;
                          stackIn_80_1 = stackOut_78_1;
                          break L6;
                        }
                      }
                      L7: {
                        ((nb) this).field_a = stackIn_80_1 != 0;
                        stackOut_80_0 = this;
                        stackIn_82_0 = stackOut_80_0;
                        stackIn_81_0 = stackOut_80_0;
                        if (param1 >= 0) {
                          stackOut_82_0 = this;
                          stackOut_82_1 = 0;
                          stackIn_83_0 = stackOut_82_0;
                          stackIn_83_1 = stackOut_82_1;
                          break L7;
                        } else {
                          stackOut_81_0 = this;
                          stackOut_81_1 = 1;
                          stackIn_83_0 = stackOut_81_0;
                          stackIn_83_1 = stackOut_81_1;
                          break L7;
                        }
                      }
                      L8: {
                        ((nb) this).field_g = stackIn_83_1 != 0;
                        if (!((nb) this).field_a) {
                          if (((nb) this).field_g) {
                            var5 = -1;
                            break L8;
                          } else {
                            return;
                          }
                        } else {
                          var5 = 1;
                          break L8;
                        }
                      }
                      ((nb) this).field_b = ((nb) this).field_b + var5 * ((nb) this).field_n;
                      if (param2 == -2) {
                        if (((nb) this).field_b >= 0) {
                          var6 = ((nb) this).field_f + ((nb) this).field_b;
                          ((nb) this).field_p = true;
                          if (var6 > ((nb) this).field_o) {
                            ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L9: {
                            ((nb) this).field_b = 0;
                            var6 = ((nb) this).field_f + ((nb) this).field_b;
                            ((nb) this).field_p = true;
                            if (var6 <= ((nb) this).field_o) {
                              break L9;
                            } else {
                              ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                              break L9;
                            }
                          }
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L10: {
                        if (!((nb) this).field_a) {
                          if (((nb) this).field_g) {
                            var5 = -1;
                            break L10;
                          } else {
                            return;
                          }
                        } else {
                          var5 = 1;
                          break L10;
                        }
                      }
                      ((nb) this).field_b = ((nb) this).field_b + var5 * ((nb) this).field_n;
                      if (param2 != -2) {
                        return;
                      } else {
                        L11: {
                          if (((nb) this).field_b >= 0) {
                            break L11;
                          } else {
                            ((nb) this).field_b = 0;
                            break L11;
                          }
                        }
                        L12: {
                          var6 = ((nb) this).field_f + ((nb) this).field_b;
                          ((nb) this).field_p = true;
                          if (var6 <= ((nb) this).field_o) {
                            break L12;
                          } else {
                            ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                            break L12;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    L13: {
                      if (!((nb) this).field_a) {
                        if (((nb) this).field_g) {
                          var5 = -1;
                          break L13;
                        } else {
                          return;
                        }
                      } else {
                        var5 = 1;
                        break L13;
                      }
                    }
                    ((nb) this).field_b = ((nb) this).field_b + var5 * ((nb) this).field_n;
                    if (param2 == -2) {
                      if (((nb) this).field_b >= 0) {
                        var6 = ((nb) this).field_f + ((nb) this).field_b;
                        ((nb) this).field_p = true;
                        if (var6 > ((nb) this).field_o) {
                          ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L14: {
                          ((nb) this).field_b = 0;
                          var6 = ((nb) this).field_f + ((nb) this).field_b;
                          ((nb) this).field_p = true;
                          if (var6 <= ((nb) this).field_o) {
                            break L14;
                          } else {
                            ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                            break L14;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L15: {
                    if (!((nb) this).field_a) {
                      if (((nb) this).field_g) {
                        var5 = -1;
                        break L15;
                      } else {
                        return;
                      }
                    } else {
                      var5 = 1;
                      break L15;
                    }
                  }
                  ((nb) this).field_b = ((nb) this).field_b + var5 * ((nb) this).field_n;
                  if (param2 == -2) {
                    if (((nb) this).field_b >= 0) {
                      var6 = ((nb) this).field_f + ((nb) this).field_b;
                      ((nb) this).field_p = true;
                      if (var6 > ((nb) this).field_o) {
                        ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L16: {
                        ((nb) this).field_b = 0;
                        var6 = ((nb) this).field_f + ((nb) this).field_b;
                        ((nb) this).field_p = true;
                        if (var6 <= ((nb) this).field_o) {
                          break L16;
                        } else {
                          ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                          break L16;
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
              L17: {
                if (((nb) this).field_l != 1) {
                  break L17;
                } else {
                  if (((nb) this).field_a) {
                    break L17;
                  } else {
                    if (!((nb) this).field_g) {
                      L18: {
                        stackOut_10_0 = this;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (0 >= param1) {
                          stackOut_12_0 = this;
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L18;
                        } else {
                          stackOut_11_0 = this;
                          stackOut_11_1 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L18;
                        }
                      }
                      L19: {
                        ((nb) this).field_a = stackIn_13_1 != 0;
                        stackOut_13_0 = this;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (param1 >= 0) {
                          stackOut_15_0 = this;
                          stackOut_15_1 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          break L19;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          break L19;
                        }
                      }
                      ((nb) this).field_g = stackIn_16_1 != 0;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              L20: {
                if (!((nb) this).field_a) {
                  if (((nb) this).field_g) {
                    var5 = -1;
                    break L20;
                  } else {
                    return;
                  }
                } else {
                  var5 = 1;
                  break L20;
                }
              }
              ((nb) this).field_b = ((nb) this).field_b + var5 * ((nb) this).field_n;
              if (param2 != -2) {
                return;
              } else {
                L21: {
                  if (((nb) this).field_b >= 0) {
                    break L21;
                  } else {
                    ((nb) this).field_b = 0;
                    break L21;
                  }
                }
                L22: {
                  var6 = ((nb) this).field_f + ((nb) this).field_b;
                  ((nb) this).field_p = true;
                  if (var6 <= ((nb) this).field_o) {
                    break L22;
                  } else {
                    ((nb) this).field_b = ((nb) this).field_o + -((nb) this).field_f;
                    break L22;
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
        return ((nb) this).field_r;
    }

    final void d(int param0) {
        ((nb) this).field_r = true;
        if (param0 > -60) {
            ((nb) this).f(-13);
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = param0;
        if (param1 == 0) {
          if (0 == ((nb) this).field_l) {
            var4 = ((nb) this).field_k[0].field_A;
            var3 = ((nb) this).field_c - (-((nb) this).field_q - -var4);
            return var3;
          } else {
            L0: {
              if (((nb) this).field_l != 1) {
                break L0;
              } else {
                var3 = ((nb) this).field_c;
                break L0;
              }
            }
            return var3;
          }
        } else {
          if (param1 == 1) {
            if (((nb) this).field_l != 0) {
              if (((nb) this).field_l != 1) {
                return var3;
              } else {
                var3 = ((nb) this).field_c;
                return var3;
              }
            } else {
              var3 = ((nb) this).field_c;
              return var3;
            }
          } else {
            return var3;
          }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          var5 = 0;
          var6 = ((nb) this).field_o;
          if (0 >= var6) {
            var6 = 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((nb) this).field_l != 0) {
            break L1;
          } else {
            L2: {
              var7 = ((nb) this).field_k[0].field_A;
              var2 = var7 + (this.b(0, 1) - -((-(var7 << 1) + ((nb) this).field_q) * ((nb) this).field_b / var6));
              var3 = ((nb) this).field_d;
              var4 = ((nb) this).field_f * (((nb) this).field_q + -(var7 << 1)) / var6;
              if (((nb) this).field_f + ((nb) this).field_b == ((nb) this).field_o) {
                var4 = this.b(0, 0) + -var2;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = ((nb) this).field_j;
            break L1;
          }
        }
        if (((nb) this).field_l == 1) {
          var2 = ((nb) this).field_c;
          var7 = ((nb) this).field_k[0].field_x;
          var3 = var7 + this.a(0, 1) + (-(var7 << 1) + ((nb) this).field_q) * ((nb) this).field_b / var6;
          var4 = ((nb) this).field_j;
          var5 = ((nb) this).field_f * (-(var7 << 1) + ((nb) this).field_q) / var6;
          if (((nb) this).field_b - -((nb) this).field_f != ((nb) this).field_o) {
            qn.f(var2, var3, var4, var5, ((nb) this).field_m[1]);
            qn.b(var2, var3, var4, var5, ((nb) this).field_m[0]);
            return;
          } else {
            var5 = this.a(0, 0) + -var3;
            qn.f(var2, var3, var4, var5, ((nb) this).field_m[1]);
            qn.b(var2, var3, var4, var5, ((nb) this).field_m[0]);
            return;
          }
        } else {
          qn.f(var2, var3, var4, var5, ((nb) this).field_m[1]);
          qn.b(var2, var3, var4, var5, ((nb) this).field_m[0]);
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
            ((nb) this).field_l = param2;
            ((nb) this).field_k = param0;
            ((nb) this).field_m = param1;
            this.a(27150);
            this.b(0);
            ((nb) this).b((byte) -65);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4;
            stackOut_3_1 = new StringBuilder().append("nb.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new wm();
    }
}
