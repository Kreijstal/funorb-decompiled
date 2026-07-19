/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends qt {
    static qp[][][] field_d;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (param1 > -11) {
          L0: {
            field_c = 52;
            if (544 != (param0 & 544)) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            stackOut_11_0 = stackIn_11_0;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if ((param0 & 24) == 0) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L1;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L1;
            }
          }
          return (stackIn_14_0 | stackIn_14_1) != 0;
        } else {
          L2: {
            if (544 != (param0 & 544)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if ((param0 & 24) == 0) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L3;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L3;
            }
          }
          return (stackIn_7_0 | stackIn_7_1) != 0;
        }
    }

    public lg() {
    }

    final void a(ha param0, int param1) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ha var5 = null;
        int var6 = 0;
        hr[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              wo.a(up.field_c, 360, -5, -16777216, 3, param0, 650, 50, 1, true);
              hc.field_e.a(vq.field_D, -1, -16777216, 150, 320, 0);
              if (param1 == 22707) {
                break L1;
              } else {
                discarded$2 = lg.a(73, 17, -78);
                break L1;
              }
            }
            var3_int = 70;
            var4 = 0;
            L2: while (true) {
              if (600 <= var3_int) {
                break L0;
              } else {
                var5 = param0;
                var6 = var3_int;
                var7 = up.field_c;
                wo.a(var7, 100, var6, 0, 1, var5, 200, 200, 1, true);
                if (var8 == 0) {
                  L3: {
                    L4: {
                      if (var4 != this.field_a) {
                        break L4;
                      } else {
                        be.field_t.a(lb.field_c[var4], -1, -16777216, 258, -4 + (var3_int - -100), param1 ^ 22707);
                        if (var8 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    hc.field_e.a(lb.field_c[var4], -1, -16777216, 260, 100 + var3_int, 0);
                    break L3;
                  }
                  var3_int += 300;
                  var4++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("lg.I(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 544) {
            field_c = 80;
            field_d = (qp[][][]) null;
            return;
        }
        field_d = (qp[][][]) null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = (-70 + ko.field_p) / 300;
        if (param0 > 0) {
          var3 = (pi.field_e - 200) / 100;
          this.field_a = var2 + var3 * 2;
          if (((-70 + ko.field_p) % 300 ^ -1) >= -201) {
            if (2 > this.field_a) {
              L0: {
                if (hk.field_c != 1) {
                  break L0;
                } else {
                  if (0 != (this.field_a ^ -1)) {
                    if (0 != this.field_a) {
                      this.b((byte) -128);
                      return;
                    } else {
                      ll.c(89);
                      pk.d((byte) -83);
                      this.b((byte) -127);
                      if (!Sumoblitz.field_L) {
                        break L0;
                      } else {
                        this.b((byte) -128);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              L1: {
                this.field_a = -1;
                if (hk.field_c != 1) {
                  break L1;
                } else {
                  if (0 != (this.field_a ^ -1)) {
                    if (0 != this.field_a) {
                      this.b((byte) -128);
                      return;
                    } else {
                      ll.c(89);
                      pk.d((byte) -83);
                      this.b((byte) -127);
                      if (!Sumoblitz.field_L) {
                        break L1;
                      } else {
                        this.b((byte) -128);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          } else {
            this.field_a = -1;
            if (2 > this.field_a) {
              L2: {
                if (hk.field_c != 1) {
                  break L2;
                } else {
                  if (0 != (this.field_a ^ -1)) {
                    if (0 != this.field_a) {
                      this.b((byte) -128);
                      return;
                    } else {
                      ll.c(89);
                      pk.d((byte) -83);
                      this.b((byte) -127);
                      if (!Sumoblitz.field_L) {
                        break L2;
                      } else {
                        this.b((byte) -128);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              L3: {
                this.field_a = -1;
                if (hk.field_c != 1) {
                  break L3;
                } else {
                  if (0 != (this.field_a ^ -1)) {
                    if (0 != this.field_a) {
                      this.b((byte) -128);
                      return;
                    } else {
                      ll.c(89);
                      pk.d((byte) -83);
                      this.b((byte) -127);
                      if (!Sumoblitz.field_L) {
                        break L3;
                      } else {
                        this.b((byte) -128);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        } else {
          field_d = (qp[][][]) null;
          var3 = (pi.field_e - 200) / 100;
          this.field_a = var2 + var3 * 2;
          if (((-70 + ko.field_p) % 300 ^ -1) < -201) {
            this.field_a = -1;
            if (2 <= this.field_a) {
              this.field_a = -1;
              if (hk.field_c == 1) {
                if (0 != (this.field_a ^ -1)) {
                  if (0 == this.field_a) {
                    ll.c(89);
                    pk.d((byte) -83);
                    this.b((byte) -127);
                    if (!Sumoblitz.field_L) {
                      return;
                    } else {
                      this.b((byte) -128);
                      return;
                    }
                  } else {
                    this.b((byte) -128);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (hk.field_c == 1) {
                if (0 != (this.field_a ^ -1)) {
                  if (0 == this.field_a) {
                    ll.c(89);
                    pk.d((byte) -83);
                    this.b((byte) -127);
                    if (Sumoblitz.field_L) {
                      this.b((byte) -128);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.b((byte) -128);
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
            L4: {
              if (2 > this.field_a) {
                break L4;
              } else {
                this.field_a = -1;
                break L4;
              }
            }
            L5: {
              if (hk.field_c != 1) {
                break L5;
              } else {
                if (0 != (this.field_a ^ -1)) {
                  if (0 != this.field_a) {
                    this.b((byte) -128);
                    break L5;
                  } else {
                    ll.c(89);
                    pk.d((byte) -83);
                    this.b((byte) -127);
                    if (!Sumoblitz.field_L) {
                      break L5;
                    } else {
                      this.b((byte) -128);
                      break L5;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        }
    }

    static {
        field_d = new qp[6][3][];
        field_c = 0;
    }
}
