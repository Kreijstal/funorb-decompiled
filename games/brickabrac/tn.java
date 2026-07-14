/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends qd {
    private int field_s;
    static int[] field_n;
    private boolean field_E;
    static int field_C;
    private int[] field_q;
    private vm field_o;
    private int field_u;
    private vm field_r;
    private vm field_t;
    private ie field_D;
    private int field_p;
    private ie field_z;
    private int[] field_G;
    private int field_y;
    private ie field_x;
    static String field_B;
    private boolean field_v;
    static gq field_m;
    static volatile boolean field_A;
    static String field_w;

    final qd d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_35_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_65_0 = 0;
        int stackOut_34_0;
        int stackOut_33_0;
        int stackOut_50_0;
        int stackOut_49_0;
        int stackOut_64_0;
        int stackOut_63_0;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (-1 <= (((tn) this).field_p ^ -1)) {
          ((tn) this).a(param2);
          return;
        } else {
          L0: {
            if (!((tn) this).field_v) {
              break L0;
            } else {
              if (((tn) this).field_y > 0) {
                if (!((tn) this).field_D.d(-1)) {
                  ((tn) this).field_r = null;
                  ((tn) this).field_v = false;
                  ((tn) this).field_y = -((tn) this).field_y;
                  break L0;
                } else {
                  if ((((tn) this).field_y ^ -1) <= -1) {
                    break L0;
                  } else {
                    if (((tn) this).field_x.d(-1)) {
                      break L0;
                    } else {
                      ((tn) this).field_y = -((tn) this).field_y;
                      ((tn) this).field_o = null;
                      ((tn) this).field_v = false;
                      break L0;
                    }
                  }
                }
              } else {
                if ((((tn) this).field_y ^ -1) <= -1) {
                  break L0;
                } else {
                  if (((tn) this).field_x.d(-1)) {
                    break L0;
                  } else {
                    ((tn) this).field_y = -((tn) this).field_y;
                    ((tn) this).field_o = null;
                    ((tn) this).field_v = false;
                    break L0;
                  }
                }
              }
            }
          }
          L1: {
            var4 = (((tn) this).field_s >> 1587168844) * ((tn) this).field_p / 256;
            var5 = -var4 + ((tn) this).field_p;
            if (((tn) this).field_y == 0) {
              break L1;
            } else {
              ((tn) this).field_s = ((tn) this).field_s + ((tn) this).field_y * param2;
              if (1048576 > ((tn) this).field_s) {
                if ((((tn) this).field_s ^ -1) >= -1) {
                  ((tn) this).field_s = 0;
                  if (!((tn) this).field_v) {
                    ((tn) this).field_y = 0;
                    if (!((tn) this).field_E) {
                      L2: {
                        if (null == ((tn) this).field_r) {
                          break L2;
                        } else {
                          ((tn) this).field_D.f(-24774);
                          break L2;
                        }
                      }
                      ((tn) this).field_r = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                ((tn) this).field_s = 1048576;
                if (((tn) this).field_v) {
                  break L1;
                } else {
                  ((tn) this).field_y = 0;
                  if (!((tn) this).field_E) {
                    L3: {
                      if (null != ((tn) this).field_o) {
                        ((tn) this).field_x.f(-24774);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((tn) this).field_o = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          L4: {
            if (!tj.field_g) {
              stackOut_34_0 = param2;
              stackIn_35_0 = stackOut_34_0;
              break L4;
            } else {
              stackOut_33_0 = param2 << -1963262239;
              stackIn_35_0 = stackOut_33_0;
              break L4;
            }
          }
          L5: {
            var6 = stackIn_35_0;
            if (-257 < (((tn) this).field_u ^ -1)) {
              L6: {
                if (((tn) this).field_r != null) {
                  break L6;
                } else {
                  if (((tn) this).field_o == null) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (var4 != 256) {
                if (256 == var5) {
                  ((tn) this).field_x.b(param0, param1, param2);
                  break L5;
                } else {
                  L7: {
                    L8: {
                      if (((tn) this).field_q == null) {
                        break L8;
                      } else {
                        if (var6 <= ((tn) this).field_q.length) {
                          pm.a(((tn) this).field_q, 0, var6);
                          pm.a(((tn) this).field_G, 0, var6);
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ((tn) this).field_q = new int[var6];
                    ((tn) this).field_G = new int[var6];
                    break L7;
                  }
                  L9: {
                    ((tn) this).field_D.b(((tn) this).field_q, 0, param2);
                    ((tn) this).field_x.b(((tn) this).field_G, 0, param2);
                    if (!tj.field_g) {
                      stackOut_50_0 = param1;
                      stackIn_51_0 = stackOut_50_0;
                      break L9;
                    } else {
                      param1 = param1 << 1;
                      stackOut_49_0 = param1 << 1;
                      stackIn_51_0 = stackOut_49_0;
                      break L9;
                    }
                  }
                  var7 = stackIn_51_0;
                  var8 = 0;
                  L10: while (true) {
                    if (var8 >= var6) {
                      break L5;
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (var5 * ((tn) this).field_G[var8] + ((tn) this).field_q[var8] * var4 >> 845287688);
                      var8++;
                      continue L10;
                    }
                  }
                }
              } else {
                ((tn) this).field_D.b(param0, param1, param2);
                break L5;
              }
            } else {
              break L5;
            }
          }
          L11: {
            if (null == ((tn) this).field_t) {
              break L11;
            } else {
              if (((tn) this).field_u != 0) {
                L12: {
                  L13: {
                    if (((tn) this).field_q == null) {
                      break L13;
                    } else {
                      if (((tn) this).field_q.length < var6) {
                        break L13;
                      } else {
                        pm.a(((tn) this).field_q, 0, var6);
                        break L12;
                      }
                    }
                  }
                  ((tn) this).field_G = new int[var6];
                  ((tn) this).field_q = new int[var6];
                  break L12;
                }
                L14: {
                  ((tn) this).field_z.b(((tn) this).field_q, 0, param2);
                  if (tj.field_g) {
                    param1 = param1 << 1;
                    stackOut_64_0 = param1 << 1;
                    stackIn_65_0 = stackOut_64_0;
                    break L14;
                  } else {
                    stackOut_63_0 = param1;
                    stackIn_65_0 = stackOut_63_0;
                    break L14;
                  }
                }
                var7 = stackIn_65_0;
                var8 = ((tn) this).field_u * ((tn) this).field_p / 256;
                var9 = -var8 + ((tn) this).field_p;
                var10 = 0;
                L15: while (true) {
                  if (var6 <= var10) {
                    break L11;
                  } else {
                    param0[var10 + var7] = var8 * ((tn) this).field_q[var10] + param0[var7 - -var10] * var9 >> -1943340440;
                    var10++;
                    continue L15;
                  }
                }
              } else {
                break L11;
              }
            }
          }
          return;
        }
    }

    final qd a() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (((tn) this).field_s > 0) {
            if (null != ((tn) this).field_r) {
              ((tn) this).field_D.a(param0);
              if (-1048577 >= (((tn) this).field_s ^ -1)) {
                break L0;
              } else {
                if (null == ((tn) this).field_o) {
                  break L0;
                } else {
                  ((tn) this).field_x.a(param0);
                  break L0;
                }
              }
            } else {
              if (-1048577 <= ((tn) this).field_s) {
                break L0;
              } else {
                if (null == ((tn) this).field_o) {
                  break L0;
                } else {
                  ((tn) this).field_x.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (-1048577 >= ((tn) this).field_s) {
              break L0;
            } else {
              if (null == ((tn) this).field_o) {
                break L0;
              } else {
                ((tn) this).field_x.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (((tn) this).field_u <= 0) {
            break L1;
          } else {
            if (null != ((tn) this).field_t) {
              ((tn) this).field_z.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!((tn) this).field_v) {
            break L2;
          } else {
            L3: {
              if (-1 <= (((tn) this).field_y ^ -1)) {
                break L3;
              } else {
                if (!((tn) this).field_D.d(-1)) {
                  ((tn) this).field_v = false;
                  ((tn) this).field_r = null;
                  ((tn) this).field_y = -((tn) this).field_y;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (0 <= ((tn) this).field_y) {
              break L2;
            } else {
              if (!((tn) this).field_x.d(-1)) {
                ((tn) this).field_v = false;
                ((tn) this).field_y = -((tn) this).field_y;
                ((tn) this).field_o = null;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (((tn) this).field_y == 0) {
            break L4;
          } else {
            ((tn) this).field_s = ((tn) this).field_s + param0 * ((tn) this).field_y;
            if ((((tn) this).field_s ^ -1) > -1048577) {
              if (-1 > (((tn) this).field_s ^ -1)) {
                break L4;
              } else {
                ((tn) this).field_s = 0;
                if (((tn) this).field_v) {
                  break L4;
                } else {
                  ((tn) this).field_y = 0;
                  if (!((tn) this).field_E) {
                    L5: {
                      if (((tn) this).field_r == null) {
                        break L5;
                      } else {
                        ((tn) this).field_D.f(-24774);
                        break L5;
                      }
                    }
                    ((tn) this).field_r = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            } else {
              ((tn) this).field_s = 1048576;
              if (((tn) this).field_v) {
                break L4;
              } else {
                ((tn) this).field_y = 0;
                if (!((tn) this).field_E) {
                  L6: {
                    if (null == ((tn) this).field_o) {
                      break L6;
                    } else {
                      ((tn) this).field_x.f(-24774);
                      break L6;
                    }
                  }
                  ((tn) this).field_o = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, byte param3, int param4, vm param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_30_0 = 0;
        ie stackIn_38_0 = null;
        vm stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        ie stackIn_39_0 = null;
        vm stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        ie stackIn_40_0 = null;
        vm stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        ie stackIn_48_0 = null;
        vm stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        ie stackIn_49_0 = null;
        vm stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        ie stackIn_50_0 = null;
        vm stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        Object stackOut_16_0;
        Object stackOut_18_0;
        int stackOut_18_1;
        Object stackOut_17_0;
        int stackOut_17_1;
        int stackOut_29_0;
        int stackOut_28_0;
        ie stackOut_47_0;
        vm stackOut_47_1;
        int stackOut_47_2;
        ie stackOut_49_0;
        vm stackOut_49_1;
        int stackOut_49_2;
        int stackOut_49_3;
        ie stackOut_48_0;
        vm stackOut_48_1;
        int stackOut_48_2;
        int stackOut_48_3;
        ie stackOut_37_0;
        vm stackOut_37_1;
        int stackOut_37_2;
        ie stackOut_39_0;
        vm stackOut_39_1;
        int stackOut_39_2;
        int stackOut_39_3;
        ie stackOut_38_0;
        vm stackOut_38_1;
        int stackOut_38_2;
        int stackOut_38_3;
        L0: {
          var8 = BrickABrac.field_J ? 1 : 0;
          if (!((tn) this).field_v) {
            break L0;
          } else {
            if (param1) {
              L1: {
                if (0 < ((tn) this).field_y) {
                  L2: {
                    if (null != ((tn) this).field_r) {
                      ((tn) this).field_D.f(-24774);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((tn) this).field_r = param5;
                  if (param5 != null) {
                    ((tn) this).field_D.a(param5, 127, false);
                    this.a(param0, false, ((tn) this).field_D, param4);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L3: {
                    if (((tn) this).field_o == null) {
                      break L3;
                    } else {
                      ((tn) this).field_x.f(-24774);
                      break L3;
                    }
                  }
                  ((tn) this).field_o = param5;
                  if (param5 != null) {
                    ((tn) this).field_x.a(param5, -66, false);
                    this.a(param0, false, ((tn) this).field_x, param4);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        L4: {
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (!param1) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L4;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L4;
          }
        }
        ((tn) this).field_v = stackIn_19_1 != 0;
        if (param5 != ((tn) this).field_r) {
          if (param5 != ((tn) this).field_o) {
            L5: {
              if (param3 == 22) {
                break L5;
              } else {
                int discarded$1 = ((tn) this).b();
                break L5;
              }
            }
            L6: {
              if (((tn) this).field_r == null) {
                var7 = 1;
                break L6;
              } else {
                if (null == ((tn) this).field_o) {
                  var7 = 0;
                  break L6;
                } else {
                  L7: {
                    if (((tn) this).field_s >= 524288) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L7;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L7;
                    }
                  }
                  var7 = stackIn_30_0;
                  break L6;
                }
              }
            }
            L8: {
              if (var7 != 0) {
                L9: {
                  if (null != ((tn) this).field_r) {
                    ((tn) this).field_D.f(-24774);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  ((tn) this).field_r = param5;
                  if (param5 != null) {
                    L11: {
                      stackOut_47_0 = ((tn) this).field_D;
                      stackOut_47_1 = (vm) param5;
                      stackOut_47_2 = 126;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackIn_49_2 = stackOut_47_2;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      stackIn_48_2 = stackOut_47_2;
                      if (param1) {
                        stackOut_49_0 = (ie) (Object) stackIn_49_0;
                        stackOut_49_1 = (vm) (Object) stackIn_49_1;
                        stackOut_49_2 = stackIn_49_2;
                        stackOut_49_3 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        stackIn_50_3 = stackOut_49_3;
                        break L11;
                      } else {
                        stackOut_48_0 = (ie) (Object) stackIn_48_0;
                        stackOut_48_1 = (vm) (Object) stackIn_48_1;
                        stackOut_48_2 = stackIn_48_2;
                        stackOut_48_3 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        stackIn_50_2 = stackOut_48_2;
                        stackIn_50_3 = stackOut_48_3;
                        break L11;
                      }
                    }
                    ((ie) (Object) stackIn_50_0).a((vm) (Object) stackIn_50_1, stackIn_50_2, stackIn_50_3 != 0);
                    this.a(param0, false, ((tn) this).field_D, param4);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((tn) this).field_y = param2;
                break L8;
              } else {
                L12: {
                  if (((tn) this).field_o == null) {
                    break L12;
                  } else {
                    ((tn) this).field_x.f(-24774);
                    break L12;
                  }
                }
                L13: {
                  ((tn) this).field_o = param5;
                  if (param5 == null) {
                    break L13;
                  } else {
                    L14: {
                      stackOut_37_0 = ((tn) this).field_x;
                      stackOut_37_1 = (vm) param5;
                      stackOut_37_2 = 126;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_39_2 = stackOut_37_2;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      if (param1) {
                        stackOut_39_0 = (ie) (Object) stackIn_39_0;
                        stackOut_39_1 = (vm) (Object) stackIn_39_1;
                        stackOut_39_2 = stackIn_39_2;
                        stackOut_39_3 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        stackIn_40_3 = stackOut_39_3;
                        break L14;
                      } else {
                        stackOut_38_0 = (ie) (Object) stackIn_38_0;
                        stackOut_38_1 = (vm) (Object) stackIn_38_1;
                        stackOut_38_2 = stackIn_38_2;
                        stackOut_38_3 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_40_2 = stackOut_38_2;
                        stackIn_40_3 = stackOut_38_3;
                        break L14;
                      }
                    }
                    ((ie) (Object) stackIn_40_0).a((vm) (Object) stackIn_40_1, stackIn_40_2, stackIn_40_3 != 0);
                    this.a(param0, false, ((tn) this).field_x, param4);
                    break L13;
                  }
                }
                ((tn) this).field_y = -param2;
                break L8;
              }
            }
            return;
          } else {
            ((tn) this).field_y = -param2;
            this.a(param0, false, ((tn) this).field_x, param4);
            return;
          }
        } else {
          ((tn) this).field_y = param2;
          this.a(param0, false, ((tn) this).field_D, param4);
          return;
        }
    }

    final synchronized int b() {
        return 2;
    }

    public static void c(int param0) {
        if (param0 > -18) {
            tn.c(-21);
        }
        field_B = null;
        field_m = null;
        field_n = null;
        field_w = null;
    }

    final synchronized void a(boolean param0, int param1) {
        ((tn) this).field_p = param1;
        if (!param0) {
            int discarded$0 = ((tn) this).b();
        }
    }

    private final void a(int param0, boolean param1, ie param2, int param3) {
        param2.e(param0, -1, 16);
        param2.b(param3, -606970073);
        if (param1) {
            ((tn) this).field_E = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        b.field_c = param1;
        if (param2 != 256) {
            return;
        }
        so.field_b = param0;
        ae.field_f = param3;
        pe.field_s = param4;
    }

    private tn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_B = "Highscores";
        field_n = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var6 = (long)(1 + (var0 << 979869185));
            var4 = (long)((var0 << -1076818687) - 1);
            var3 = (int)(-32768L + (var6 * var6 >> 662387538));
            var2 = (int)(-32768L + (var4 * var4 >> 234206930));
            if (!(field_n.length > var3)) {
                var3 = -1 + field_n.length;
            }
            for (var1 = -1 >= (var2 ^ -1) ? var2 : 0; var3 >= var1; var1++) {
                field_n[var1] = var0;
            }
        }
        field_A = false;
        field_w = "Speed up: increases the speed of any ball in play.";
    }
}
