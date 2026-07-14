/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf extends ea {
    static ko field_w;
    boolean field_u;
    private boolean field_v;
    static String[] field_t;

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        fl.field_a.a(param3, param0);
        if (param1 == -1) {
          if (param2) {
            L0: {
              var4 = hl.field_g % fl.field_a.field_l * 2;
              if (fl.field_a.field_l <= var4) {
                var4 = fl.field_a.field_l - var4 + fl.field_a.field_l;
                break L0;
              } else {
                break L0;
              }
            }
            if (var4 >= 10) {
              if (var4 <= -40 + fl.field_a.field_l) {
                wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
                return;
              } else {
                var4 = fl.field_a.field_l + -40;
                wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
                return;
              }
            } else {
              var4 = 10;
              wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
              return;
            }
          } else {
            return;
          }
        } else {
          field_t = null;
          if (param2) {
            L1: {
              var4 = hl.field_g % fl.field_a.field_l * 2;
              if (fl.field_a.field_l <= var4) {
                var4 = fl.field_a.field_l - var4 + fl.field_a.field_l;
                break L1;
              } else {
                break L1;
              }
            }
            if (var4 >= 10) {
              if (var4 <= -40 + fl.field_a.field_l) {
                wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
                return;
              } else {
                var4 = fl.field_a.field_l + -40;
                wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
                return;
              }
            } else {
              var4 = 10;
              wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
              return;
            }
          } else {
            return;
          }
        }
    }

    boolean c(f[][] param0, int param1, byte param2, int param3) {
        if (param2 >= 0) {
            return true;
        }
        return false;
    }

    final boolean g(int param0) {
        if (param0 != 0) {
            ((qf) this).field_v = false;
            return false;
        }
        return false;
    }

    void f(int param0, int param1, f[][] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        var8 = CrazyCrystals.field_B;
        ((qf) this).field_u = false;
        var5 = param2[param1 - -1][param3].a(true, false);
        if (param0 == 1) {
          if ((var5 & 2) == 0) {
            if (!((qf) this).field_v) {
              L0: {
                ((qf) this).a((byte) 52, param2[1 + param1][param3]);
                ((qf) this).field_l.a((byte) 89, param2[1 + param1][param3]);
                if (-1 == (4 & var5 ^ -1)) {
                  stackOut_38_0 = 0;
                  stackIn_39_0 = stackOut_38_0;
                  break L0;
                } else {
                  stackOut_37_0 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  break L0;
                }
              }
              L1: {
                var6 = stackIn_39_0;
                if ((var5 & 8) == 0) {
                  stackOut_41_0 = 0;
                  stackIn_42_0 = stackOut_41_0;
                  break L1;
                } else {
                  stackOut_40_0 = 1;
                  stackIn_42_0 = stackOut_40_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_42_0;
                if (var6 != 0) {
                  L3: {
                    if (!this.a(param3 - 1, (byte) 94, param2, param1)) {
                      stackOut_46_0 = 0;
                      stackIn_47_0 = stackOut_46_0;
                      break L3;
                    } else {
                      stackOut_45_0 = 1;
                      stackIn_47_0 = stackOut_45_0;
                      break L3;
                    }
                  }
                  var6 = stackIn_47_0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (var7 != 0) {
                  L5: {
                    if (!this.a(param3 + 1, (byte) 94, param2, param1)) {
                      stackOut_52_0 = 0;
                      stackIn_53_0 = stackOut_52_0;
                      break L5;
                    } else {
                      stackOut_51_0 = 1;
                      stackIn_53_0 = stackOut_51_0;
                      break L5;
                    }
                  }
                  var7 = stackIn_53_0;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (var7 == 0) {
                if (var6 == 0) {
                  ((qf) this).field_u = this.a((byte) 68, param1, param3, param2);
                  return;
                } else {
                  sl discarded$5 = ((qf) this).a(param2, param1, false, 0, param3, -1);
                  return;
                }
              } else {
                sl discarded$6 = ((qf) this).a(param2, param1, false, 0, param3, 1);
                return;
              }
            } else {
              L6: {
                ((qf) this).field_v = false;
                if (!((qf) this).c(param2, param1, (byte) -31, param3)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L6;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L6;
                }
              }
              var6 = stackIn_8_0;
              param2[1 + param1][param3] = param2[param1 - -1][param3].a(1 + param1, param3, param2, (f) this, (byte) 12);
              ((qf) this).a((byte) 122, param2[1 + param1][param3]);
              ((qf) this).field_l.a((byte) 121, param2[1 + param1][param3]);
              je.field_j = je.field_j + -1;
              we.field_h = we.field_h + -2;
              fp.field_a = fp.field_a + -2;
              b.field_a = b.field_a + -1;
              mb.field_g = mb.field_g - ob.field_l;
              wd.field_j = wd.field_j - 1;
              if (var6 == 0) {
                L7: {
                  if (-1 == (4 & var5 ^ -1)) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L7;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L7;
                  }
                }
                L8: {
                  var6 = stackIn_13_0;
                  if ((var5 & 8) == 0) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L8;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L8;
                  }
                }
                L9: {
                  var7 = stackIn_16_0;
                  if (var6 != 0) {
                    L10: {
                      if (!this.a(param3 - 1, (byte) 94, param2, param1)) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L10;
                      } else {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        break L10;
                      }
                    }
                    var6 = stackIn_21_0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L11: {
                  if (var7 != 0) {
                    L12: {
                      if (!this.a(param3 + 1, (byte) 94, param2, param1)) {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        break L12;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L12;
                      }
                    }
                    var7 = stackIn_27_0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                if (var7 == 0) {
                  if (var6 == 0) {
                    ((qf) this).field_u = this.a((byte) 68, param1, param3, param2);
                    return;
                  } else {
                    sl discarded$7 = ((qf) this).a(param2, param1, false, 0, param3, -1);
                    return;
                  }
                } else {
                  sl discarded$8 = ((qf) this).a(param2, param1, false, 0, param3, 1);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            sl discarded$9 = ((qf) this).a(param2, param1, false, 1, param3, 0);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + ca.a("\n", 0, param0, "%0a"));
        if (param1 != 1) {
            qf.h(77);
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 == 0) {
          if (((qf) this).field_s != -1) {
            if (-1 >= ((qf) this).field_s) {
              return 0;
            } else {
              return 2;
            }
          } else {
            return 12;
          }
        } else {
          qf.h(24);
          if (((qf) this).field_s != -1) {
            if (-1 >= ((qf) this).field_s) {
              return 0;
            } else {
              return 2;
            }
          } else {
            return 12;
          }
        }
    }

    private final boolean c(int param0, int param1, int param2, f[][] param3) {
        if ((1 & param3[param1][param2].a(true, true)) == 0) {
          return false;
        } else {
          if ((2 & param3[param1 - -1][param2].a(true, true)) != param0) {
            return true;
          } else {
            return false;
          }
        }
    }

    qf(f param0) {
        super(param0);
        ((qf) this).field_v = false;
        ((qf) this).field_p = 4;
    }

    boolean a(int param0, int param1, int param2, f[][] param3, int param4, fq param5, int param6) {
        Object var9 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != 0) {
          return false;
        } else {
          if (param1 != -1) {
            L0: {
              var9 = null;
              qf.a((String) null, 3);
              if ((1 & param3[param2][2 * param4 + param6].a(true, false)) == 0) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              if ((1 & param3[param2][2 * param4 + param6].a(true, false)) == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final static void h(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        var1 = ga.field_J[0];
        if (param0 != -30693) {
          qf.e((byte) 69);
          var2 = 1;
          L0: while (true) {
            if (ga.field_J.length <= var2) {
              return;
            } else {
              var3 = ga.field_J[var2];
              eg.a(gh.field_E, var2 << -912507484, gh.field_E, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 1;
          L1: while (true) {
            if (ga.field_J.length <= var2) {
              return;
            } else {
              var3 = ga.field_J[var2];
              eg.a(gh.field_E, var2 << -912507484, gh.field_E, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L1;
            }
          }
        }
    }

    private final boolean a(byte param0, int param1, int param2, f[][] param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        if (0 == (((qf) this).field_o | ((qf) this).field_s)) {
          if (((qf) this).field_j) {
            return false;
          } else {
            if (param0 == 68) {
              var5 = param3[param1 + 1][param2].a(true, true);
              if (0 == (var5 & 2)) {
                L0: {
                  if (-1 == (4 & var5 ^ -1)) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L0;
                  }
                }
                L1: {
                  var6 = stackIn_12_0;
                  if (0 == (var5 & 8)) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L1;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L1;
                  }
                }
                L2: {
                  var7 = stackIn_15_0;
                  if (var6 != 0) {
                    L3: {
                      if (!this.c(0, param1, -1 + param2, param3)) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L3;
                      } else {
                        stackOut_18_0 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        break L3;
                      }
                    }
                    var6 = stackIn_20_0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (var7 == 0) {
                    break L4;
                  } else {
                    L5: {
                      if (!this.c(0, param1, 1 + param2, param3)) {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        break L5;
                      } else {
                        stackOut_23_0 = 1;
                        stackIn_25_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    var7 = stackIn_25_0;
                    break L4;
                  }
                }
                if (var6 == 0) {
                  if (var7 != 0) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_27_0 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  return stackIn_29_0 != 0;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    public static void e(byte param0) {
        field_t = null;
        if (param0 != -72) {
            field_t = null;
            field_w = null;
            return;
        }
        field_w = null;
    }

    sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        mb.field_g = mb.field_g + ob.field_l;
        wd.field_j = wd.field_j + 1;
        b.field_a = b.field_a + -2;
        je.field_j = je.field_j + -2;
        fp.field_a = fp.field_a + -4;
        we.field_h = we.field_h + -4;
        ((qf) this).field_v = param2 ? true : false;
        ((qf) this).field_u = false;
        return super.a(param0, param1, false, param3, param4, param5);
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 == 17512) {
          if (1 == param5) {
            ((qf) this).field_v = true;
            return super.a(param0, param1, param2, param3, 17512, param5, param6);
          } else {
            return super.a(param0, param1, param2, param3, 17512, param5, param6);
          }
        } else {
          field_w = null;
          if (1 != param5) {
            return super.a(param0, param1, param2, param3, 17512, param5, param6);
          } else {
            ((qf) this).field_v = true;
            return super.a(param0, param1, param2, param3, 17512, param5, param6);
          }
        }
    }

    private final boolean a(int param0, byte param1, f[][] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        f stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        f stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        f stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        f stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        f stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        f stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        if (param1 == 94) {
          L0: {
            if (0 != (param2[param3][param0].a(true, false) & 1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (-1 != (2 & param2[param3 + 1][param0].a(true, false) ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          var6 = stackIn_8_0;
          if (var5 == 0) {
            if (var5 == 0) {
              return true;
            } else {
              ((qf) this).a((byte) 97, param2[param3][param0]);
              ((qf) this).field_l.a((byte) 90, param2[param3][param0]);
              return false;
            }
          } else {
            if (var6 == 0) {
              if (var5 == 0) {
                return true;
              } else {
                ((qf) this).a((byte) 97, param2[param3][param0]);
                ((qf) this).field_l.a((byte) 90, param2[param3][param0]);
                return false;
              }
            } else {
              L2: {
                var7 = param2[param3][param0].a(false) & param2[1 + param3][param0].a(false);
                if (var7 == 0) {
                  break L2;
                } else {
                  L3: {
                    var8 = param2[param3][param0].b(-3445);
                    var9 = param2[1 + param3][param0].b(-3445);
                    stackOut_11_0 = this;
                    stackOut_11_1 = var7;
                    stackOut_11_2 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    if (var8 > var9) {
                      stackOut_13_0 = this;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = stackIn_13_2;
                      stackOut_13_3 = var8;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      break L3;
                    } else {
                      stackOut_12_0 = this;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = stackIn_12_2;
                      stackOut_12_3 = var9;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      break L3;
                    }
                  }
                  L4: {
                    ((qf) this).a(stackIn_14_1, stackIn_14_2 != 0, stackIn_14_3);
                    stackOut_14_0 = ((qf) this).field_l;
                    stackOut_14_1 = var7;
                    stackOut_14_2 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    if (var8 <= var9) {
                      stackOut_16_0 = (f) (Object) stackIn_16_0;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = stackIn_16_2;
                      stackOut_16_3 = var9;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      break L4;
                    } else {
                      stackOut_15_0 = (f) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = stackIn_15_2;
                      stackOut_15_3 = var8;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      break L4;
                    }
                  }
                  ((f) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2 != 0, stackIn_17_3);
                  break L2;
                }
              }
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3, int param4, int param5, ea param6) {
        am stackIn_5_0 = null;
        am stackIn_11_0 = null;
        am stackOut_10_0 = null;
        am stackOut_9_0 = null;
        am stackOut_4_0 = null;
        am stackOut_3_0 = null;
        if (param3 != -31135) {
          L0: {
            qf.e((byte) 15);
            if (0 != (((qf) this).field_o | ((qf) this).field_s)) {
              break L0;
            } else {
              L1: {
                fp.field_a = fp.field_a + 10;
                we.field_h = we.field_h + 10;
                b.field_a = b.field_a + 5;
                je.field_j = je.field_j + 5;
                mb.field_g = mb.field_g + 12;
                fn.field_j = fn.field_j + 12;
                if (!(this instanceof cj)) {
                  stackOut_10_0 = td.field_e;
                  stackIn_11_0 = stackOut_10_0;
                  break L1;
                } else {
                  stackOut_9_0 = dn.field_d;
                  stackIn_11_0 = stackOut_9_0;
                  break L1;
                }
              }
              ((am) (Object) stackIn_11_0).a(128, 12 * param1, param4 * 12, 60, (byte) -111);
              ((qf) this).a((byte) 111, (f) (Object) param6);
              ((qf) this).field_l.a((byte) 83, (f) (Object) param6);
              sl discarded$2 = ((qf) this).a(param2, param4, false, param0, param1, param5);
              break L0;
            }
          }
          return (f) this;
        } else {
          L2: {
            if (0 != (((qf) this).field_o | ((qf) this).field_s)) {
              break L2;
            } else {
              L3: {
                fp.field_a = fp.field_a + 10;
                we.field_h = we.field_h + 10;
                b.field_a = b.field_a + 5;
                je.field_j = je.field_j + 5;
                mb.field_g = mb.field_g + 12;
                fn.field_j = fn.field_j + 12;
                if (!(this instanceof cj)) {
                  stackOut_4_0 = td.field_e;
                  stackIn_5_0 = stackOut_4_0;
                  break L3;
                } else {
                  stackOut_3_0 = dn.field_d;
                  stackIn_5_0 = stackOut_3_0;
                  break L3;
                }
              }
              ((am) (Object) stackIn_5_0).a(128, 12 * param1, param4 * 12, 60, (byte) -111);
              ((qf) this).a((byte) 111, (f) (Object) param6);
              ((qf) this).field_l.a((byte) 83, (f) (Object) param6);
              sl discarded$3 = ((qf) this).a(param2, param4, false, param0, param1, param5);
              break L2;
            }
          }
          return (f) this;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
