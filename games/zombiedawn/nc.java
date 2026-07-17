/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends le {
    private int field_l;
    int field_m;
    static fn field_r;
    static int field_j;
    private int field_i;
    static vn field_k;
    private int field_s;
    private int field_n;
    int field_q;
    private fn field_o;
    static tp field_p;
    private int field_h;

    final boolean c(int param0) {
        if (param0 >= 81) {
          if (((nc) this).field_n >= 750) {
            if (((nc) this).field_l != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a() {
        sl.field_b = new be(so.field_a.nextInt(), 3, 256, 256, 256, 2.0f, true);
        na.field_c = sl.field_b.c(256, 256, -27);
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 != -2135443998) {
            nc.d(30);
            field_r = null;
            field_k = null;
            return;
        }
        field_r = null;
        field_k = null;
    }

    final void a(boolean param0) {
        fb var2 = null;
        ah var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (!((nc) this).c(116)) {
          int fieldTemp$1 = ((nc) this).field_s;
          ((nc) this).field_s = ((nc) this).field_s + 1;
          if (fieldTemp$1 > 10) {
            ((nc) this).field_s = 0;
            var2 = (fb) (Object) dj.field_e.field_R.b((byte) 26);
            L0: while (true) {
              if (var2 != null) {
                L1: {
                  if (var2 instanceof ah) {
                    var3 = (ah) (Object) var2;
                    var3.a((nc) this, -26246);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var2 = (fb) (Object) dj.field_e.field_R.a(false);
                continue L0;
              } else {
                ((nc) this).field_i = ((nc) this).field_i + 7;
                if (!param0) {
                  if (256 >= ((nc) this).field_i) {
                    if (((nc) this).field_n >= 750) {
                      L2: {
                        ((nc) this).field_l = ((nc) this).field_l - ((nc) this).field_h;
                        if (((nc) this).field_l <= 256) {
                          break L2;
                        } else {
                          ((nc) this).field_l = 256;
                          break L2;
                        }
                      }
                      L3: {
                        if (0 <= ((nc) this).field_l) {
                          break L3;
                        } else {
                          ((nc) this).field_l = 0;
                          break L3;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        if (((nc) this).field_l < 256) {
                          ((nc) this).field_l = ((nc) this).field_l + ((nc) this).field_h;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        ((nc) this).field_n = ((nc) this).field_n + 1;
                        if (((nc) this).field_l <= 256) {
                          break L5;
                        } else {
                          ((nc) this).field_l = 256;
                          break L5;
                        }
                      }
                      L6: {
                        if (0 <= ((nc) this).field_l) {
                          break L6;
                        } else {
                          ((nc) this).field_l = 0;
                          break L6;
                        }
                      }
                      return;
                    }
                  } else {
                    L7: {
                      ((nc) this).field_i = 0;
                      if (((nc) this).field_n >= 750) {
                        ((nc) this).field_l = ((nc) this).field_l - ((nc) this).field_h;
                        break L7;
                      } else {
                        L8: {
                          if (((nc) this).field_l < 256) {
                            ((nc) this).field_l = ((nc) this).field_l + ((nc) this).field_h;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        ((nc) this).field_n = ((nc) this).field_n + 1;
                        break L7;
                      }
                    }
                    L9: {
                      if (((nc) this).field_l <= 256) {
                        break L9;
                      } else {
                        ((nc) this).field_l = 256;
                        break L9;
                      }
                    }
                    L10: {
                      if (0 <= ((nc) this).field_l) {
                        break L10;
                      } else {
                        ((nc) this).field_l = 0;
                        break L10;
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
            ((nc) this).field_i = ((nc) this).field_i + 7;
            if (!param0) {
              if (256 >= ((nc) this).field_i) {
                if (((nc) this).field_n >= 750) {
                  ((nc) this).field_l = ((nc) this).field_l - ((nc) this).field_h;
                  if (((nc) this).field_l <= 256) {
                    if (0 <= ((nc) this).field_l) {
                      return;
                    } else {
                      ((nc) this).field_l = 0;
                      return;
                    }
                  } else {
                    ((nc) this).field_l = 256;
                    if (0 > ((nc) this).field_l) {
                      ((nc) this).field_l = 0;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L11: {
                    if (((nc) this).field_l < 256) {
                      ((nc) this).field_l = ((nc) this).field_l + ((nc) this).field_h;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ((nc) this).field_n = ((nc) this).field_n + 1;
                  if (((nc) this).field_l <= 256) {
                    if (0 <= ((nc) this).field_l) {
                      return;
                    } else {
                      ((nc) this).field_l = 0;
                      return;
                    }
                  } else {
                    L12: {
                      ((nc) this).field_l = 256;
                      if (0 <= ((nc) this).field_l) {
                        break L12;
                      } else {
                        ((nc) this).field_l = 0;
                        break L12;
                      }
                    }
                    return;
                  }
                }
              } else {
                L13: {
                  ((nc) this).field_i = 0;
                  if (((nc) this).field_n >= 750) {
                    ((nc) this).field_l = ((nc) this).field_l - ((nc) this).field_h;
                    break L13;
                  } else {
                    L14: {
                      if (((nc) this).field_l < 256) {
                        ((nc) this).field_l = ((nc) this).field_l + ((nc) this).field_h;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    ((nc) this).field_n = ((nc) this).field_n + 1;
                    break L13;
                  }
                }
                if (((nc) this).field_l <= 256) {
                  if (0 <= ((nc) this).field_l) {
                    return;
                  } else {
                    ((nc) this).field_l = 0;
                    return;
                  }
                } else {
                  L15: {
                    ((nc) this).field_l = 256;
                    if (0 <= ((nc) this).field_l) {
                      break L15;
                    } else {
                      ((nc) this).field_l = 0;
                      break L15;
                    }
                  }
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
    }

    final void c(byte param0) {
        ((nc) this).field_n = 750;
        if (param0 != -64) {
            return;
        }
        ((nc) this).field_l = 0;
    }

    final static void d(byte param0) {
        int var1 = 0;
        if (fl.field_a != 10) {
          int discarded$8 = -23022;
          if (nm.c()) {
            ma.field_p = true;
            var1 = 39 / ((46 - param0) / 34);
            return;
          } else {
            int discarded$9 = 41;
            gf.a();
            fl.field_a = 11;
            ma.field_p = true;
            var1 = 39 / ((46 - param0) / 34);
            return;
          }
        } else {
          int discarded$10 = 41;
          gf.a();
          fl.field_a = 11;
          ma.field_p = true;
          var1 = 39 / ((46 - param0) / 34);
          return;
        }
    }

    final void a(wk param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var3_int = param0.a(((nc) this).field_m, (byte) -61);
            var4 = param0.a(((nc) this).field_q, 0);
            ((nc) this).field_o.h(pj.a(var4, 51, var3_int));
            if (param1) {
              L1: {
                if (var3_int < -256) {
                  break L1;
                } else {
                  if (-256 > var4) {
                    break L1;
                  } else {
                    if (var3_int > bd.field_e - -256) {
                      break L1;
                    } else {
                      if (256 + nh.field_P < var4) {
                        break L1;
                      } else {
                        L2: {
                          if (((nc) this).field_l < 256) {
                            stackOut_10_0 = (-((nc) this).field_i + 256) * ((nc) this).field_l >> 10;
                            stackIn_11_0 = stackOut_10_0;
                            break L2;
                          } else {
                            stackOut_9_0 = -((nc) this).field_i + 256 >> 2;
                            stackIn_11_0 = stackOut_9_0;
                            break L2;
                          }
                        }
                        var5 = stackIn_11_0;
                        bi.d(var3_int, var4, ((nc) this).field_i, 0, var5);
                        so.b(wk.field_o, -256 + var3_int, -256 + var4, ((nc) this).field_l);
                        break L0;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("nc.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    nc(int param0, int param1) {
        ((nc) this).field_s = 0;
        ((nc) this).field_o = null;
        ((nc) this).field_i = 0;
        ((nc) this).field_l = 0;
        ((nc) this).field_q = param1;
        ((nc) this).field_n = 0;
        ((nc) this).field_h = 3;
        ((nc) this).field_m = param0;
        ((nc) this).field_o = kh.a(17, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = null;
        field_j = 0;
    }
}
