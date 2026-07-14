/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gm extends sfa {
    int field_l;
    static boolean field_k;
    static int[] field_j;
    int field_i;

    final void a(int param0, lu param1) {
        int var3 = -113 / ((61 - param0) / 53);
        param1.d(((gm) this).field_i | ((gm) this).field_l << -776462653, 0);
    }

    private final int a(byte param0, op param1) {
        wia var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        aga var10 = null;
        aga var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var10 = ((gm) this).field_h.a(42, param1);
          var11 = var10;
          var4 = param1.field_a[var10.field_x][var10.field_J];
          var5 = var11.a(51, (byte) -87) ? 1 : 0;
          var7 = 62 / ((param0 - -27) / 32);
          if ((var4.field_n ^ -1) != -28) {
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
          var6 = stackIn_3_0;
          if (1 == param1.field_E) {
            if (!var4.field_i) {
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_9_0 = stackOut_6_0;
              break L1;
            }
          } else {
            stackOut_4_0 = 0;
            stackIn_9_0 = stackOut_4_0;
            break L1;
          }
        }
        var8 = stackIn_9_0;
        if (var5 == 0) {
          if (var6 == 0) {
            if (var8 == 0) {
              return ((gm) this).field_l;
            } else {
              L2: {
                var9 = ((gm) this).field_l;
                if (var8 != 0) {
                  var9 = var9 + (-1 + kla.a(3, param1.field_w, -2147483648));
                  if (-2 >= var9) {
                    break L2;
                  } else {
                    var9 = 1;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var6 != 0) {
                  L4: {
                    if (-2 == var4.field_j) {
                      var9--;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var4.field_j != 2) {
                      break L5;
                    } else {
                      var9 -= 2;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (3 == var4.field_j) {
                        break L7;
                      } else {
                        if ((var4.field_j ^ -1) != -5) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var9 -= 3;
                    break L6;
                  }
                  if ((var9 ^ -1) > -2) {
                    var9 = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              return param1.a(var9, var11, ((gm) this).field_i, -1);
            }
          } else {
            L8: {
              var9 = ((gm) this).field_l;
              if (var8 != 0) {
                var9 = var9 + (-1 + kla.a(3, param1.field_w, -2147483648));
                if (-2 >= var9) {
                  break L8;
                } else {
                  var9 = 1;
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L9: {
              if (var6 != 0) {
                L10: {
                  if (-2 == var4.field_j) {
                    var9--;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var4.field_j != 2) {
                    break L11;
                  } else {
                    var9 -= 2;
                    break L11;
                  }
                }
                L12: {
                  L13: {
                    if (3 == var4.field_j) {
                      break L13;
                    } else {
                      if ((var4.field_j ^ -1) != -5) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  var9 -= 3;
                  break L12;
                }
                if ((var9 ^ -1) > -2) {
                  var9 = 1;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            return param1.a(var9, var11, ((gm) this).field_i, -1);
          }
        } else {
          L14: {
            var9 = ((gm) this).field_l;
            if (var8 != 0) {
              var9 = var9 + (-1 + kla.a(3, param1.field_w, -2147483648));
              if (-2 >= var9) {
                break L14;
              } else {
                var9 = 1;
                break L14;
              }
            } else {
              break L14;
            }
          }
          L15: {
            if (var6 != 0) {
              L16: {
                if (-2 == var4.field_j) {
                  var9--;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var4.field_j != 2) {
                  break L17;
                } else {
                  var9 -= 2;
                  break L17;
                }
              }
              L18: {
                L19: {
                  if (3 == var4.field_j) {
                    break L19;
                  } else {
                    if ((var4.field_j ^ -1) != -5) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                var9 -= 3;
                break L18;
              }
              if ((var9 ^ -1) > -2) {
                var9 = 1;
                break L15;
              } else {
                break L15;
              }
            } else {
              break L15;
            }
          }
          return param1.a(var9, var11, ((gm) this).field_i, -1);
        }
    }

    private final df b(int param0, int param1, boolean param2) {
        if (param0 != 25683) {
            return null;
        }
        return new df(((gm) this).field_g, ((gm) this).field_h, ((gm) this).field_i, param1, param2);
    }

    gm(int param0, aga param1) {
        super(2, param0, new nq(param1));
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var13 = BachelorFridge.field_y;
          if (param0 <= param4) {
            break L0;
          } else {
            L1: {
              var5 = (param4 - -param0) / 2;
              var6 = param4;
              var7 = param2[var5];
              param2[var5] = param2[param0];
              param2[param0] = var7;
              var8 = param3[var5];
              param3[var5] = param3[param0];
              param3[param0] = var8;
              if (2147483647 != var7) {
                stackOut_3_0 = 1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var9 = stackIn_4_0;
            var10 = param4;
            L2: while (true) {
              if (param0 <= var10) {
                param2[param0] = param2[var6];
                param2[var6] = var7;
                param3[param0] = param3[var6];
                param3[var6] = var8;
                gm.a(-1 + var6, -30111, param2, param3, param4);
                gm.a(param0, -30111, param2, param3, 1 + var6);
                break L0;
              } else {
                if (param2[var10] > var7 - (var10 & var9)) {
                  var11 = param2[var10];
                  param2[var10] = param2[var6];
                  param2[var6] = var11;
                  var12 = param3[var10];
                  param3[var10] = param3[var6];
                  var6++;
                  param3[var6] = var12;
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          if (param1 == -30111) {
            break L3;
          } else {
            field_k = false;
            break L3;
          }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_j = null;
    }

    final ii a(op param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        wia var6 = null;
        aga var7 = null;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        aga var12 = null;
        aga var13 = null;
        var10 = BachelorFridge.field_y;
        var12 = ((gm) this).field_h.a(32, param0);
        var13 = var12;
        if (8 != var13.field_y) {
          L0: {
            if (var13.field_y != -12) {
              break L0;
            } else {
              if (-51 < kla.a(100, param0.field_w, param1 + 2147483645)) {
                return (ii) (Object) this.b(25683, 0, true);
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (-31 != (param0.field_a[var12.field_x][var12.field_J].field_n ^ -1)) {
              break L1;
            } else {
              if ((var13.field_y ^ -1) != -33) {
                return (ii) (Object) this.b(25683, 0, true);
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (var13.field_y == 51) {
              ((gm) this).field_i = 1 + kla.a(4, param0.field_w, -2147483648);
              break L2;
            } else {
              break L2;
            }
          }
          var13.field_s = ((gm) this).field_i;
          ((gm) this).field_l = this.a((byte) -97, param0);
          if (-1 == (((gm) this).field_l ^ -1)) {
            return (ii) (Object) this.b(25683, 0, true);
          } else {
            L3: {
              var4 = var13.field_x;
              var5 = var13.field_J;
              if (((gm) this).field_i != 2) {
                if (((gm) this).field_i != 1) {
                  if (-5 != (((gm) this).field_i ^ -1)) {
                    if ((((gm) this).field_i ^ -1) != -4) {
                      break L3;
                    } else {
                      var5 = var5 + ((gm) this).field_l;
                      break L3;
                    }
                  } else {
                    var4 = var4 + ((gm) this).field_l;
                    break L3;
                  }
                } else {
                  var5 = var5 - ((gm) this).field_l;
                  break L3;
                }
              } else {
                var4 = var4 - ((gm) this).field_l;
                break L3;
              }
            }
            L4: {
              if (param1 == 3) {
                break L4;
              } else {
                var11 = null;
                ii discarded$1 = ((gm) this).a((op) null, -85);
                break L4;
              }
            }
            L5: {
              L6: {
                if (-23 == (param0.field_a[var4][var5].field_n ^ -1)) {
                  break L6;
                } else {
                  if ((param0.field_a[var4][var5].field_n ^ -1) != -29) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              ((gm) this).field_l = ((gm) this).field_l - 1;
              break L5;
            }
            var6 = param0.field_a[var4][var5];
            var7 = var6.field_l;
            if (var7 != null) {
              L7: {
                var8 = null;
                if (var7.field_k[1] >= var12.field_k[1]) {
                  break L7;
                } else {
                  if (var8 == null) {
                    break L7;
                  } else {
                    L8: {
                      ((df) var8).field_t = true;
                      ((df) var8).field_n = ((df) var8).field_n - 1;
                      param0.field_a[var12.field_x][var12.field_J].field_l = null;
                      if (2 != ((df) var8).field_p) {
                        if (-5 != (((df) var8).field_p ^ -1)) {
                          if (-2 != (((df) var8).field_p ^ -1)) {
                            if (-4 == (((df) var8).field_p ^ -1)) {
                              param0.field_a[var13.field_x][-1 + var13.field_J].field_l = var7;
                              var7.field_J = var7.field_J - 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            param0.field_a[var13.field_x][1 + var13.field_J].field_l = var7;
                            var7.field_J = var7.field_J + 1;
                            break L8;
                          }
                        } else {
                          param0.field_a[-1 + var13.field_x][var13.field_J].field_l = var7;
                          var7.field_x = var7.field_x - 1;
                          break L8;
                        }
                      } else {
                        param0.field_a[1 + var12.field_x][var12.field_J].field_l = var7;
                        var7.field_x = var7.field_x + 1;
                        break L8;
                      }
                    }
                    return (ii) (Object) this.b(25683, ((gm) this).field_l, false);
                  }
                }
              }
              var9 = -1 + ((gm) this).field_l;
              L9: while (true) {
                if (0 < var9) {
                  L10: {
                    if (((gm) this).field_i != 2) {
                      break L10;
                    } else {
                      if (null != param0.field_a[var13.field_x + -var9][var13.field_J].field_l) {
                        break L10;
                      } else {
                        return (ii) (Object) this.b(25683, var9, true);
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (1 != ((gm) this).field_i) {
                        break L12;
                      } else {
                        if (param0.field_a[var13.field_x][var13.field_J - var9].field_l != null) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L13: {
                      if ((((gm) this).field_i ^ -1) != -5) {
                        break L13;
                      } else {
                        if (param0.field_a[var13.field_x + var9][var13.field_J].field_l != null) {
                          break L13;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (-4 == (((gm) this).field_i ^ -1)) {
                      if (param0.field_a[var13.field_x][var9 + var13.field_J].field_l == null) {
                        return (ii) (Object) this.b(25683, var9, true);
                      } else {
                        var9--;
                        continue L9;
                      }
                    } else {
                      var9--;
                      continue L9;
                    }
                  }
                  return (ii) (Object) this.b(25683, var9, true);
                } else {
                  return (ii) (Object) this.b(25683, var9, true);
                }
              }
            } else {
              return (ii) (Object) this.b(25683, ((gm) this).field_l, false);
            }
          }
        } else {
          return (ii) (Object) this.b(25683, 0, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_j = new int[]{2, 20, 21, 6, 5, 10, 11, 13};
    }
}
