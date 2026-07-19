/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dja extends nv implements ut {
    static jea field_p;
    private jma field_n;
    static int field_r;
    private boolean field_q;
    private int field_o;
    private int field_t;
    static String[] field_s;

    public static void l(int param0) {
        field_s = null;
        if (param0 != 1) {
            field_r = 91;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final int a(int param0, int param1) {
        int discarded$2 = 0;
        if (param1 >= -48) {
          discarded$2 = this.c(56);
          param0 = fs.a((byte) 122, param0, this.field_t);
          return this.field_n.a(105, param0);
        } else {
          param0 = fs.a((byte) 122, param0, this.field_t);
          return this.field_n.a(105, param0);
        }
    }

    final void k(int param0) {
        int var2 = 0;
        ffa[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        npa var7 = null;
        ffa[] var8 = null;
        npa var9 = null;
        ffa[] var10 = null;
        boolean stackIn_5_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_27_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_21_0 = false;
        int stackOut_26_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (!this.field_n.f((byte) -56)) {
          var2 = 0;
          var7 = this.b(true).field_u;
          var8 = var7.a((byte) -26, this.field_g);
          var5 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var5 >= var8.length) {
                  break L2;
                } else {
                  stackOut_4_0 = this.a(var8[var5], (byte) -103);
                  stackIn_10_0 = stackOut_4_0 ? 1 : 0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_5_0) {
                        var2 = var2 + var8[var5].b(75);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var5++;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_t = var2;
              var5 = 0;
              stackOut_9_0 = param0;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            if (stackIn_10_0 == 5418) {
              if (0 < var2) {
                if (this.field_o <= var2) {
                  var5 = 1;
                  this.field_n.a((byte) -14, var5 != 0);
                  return;
                } else {
                  this.field_n.a((byte) -14, var5 != 0);
                  return;
                }
              } else {
                this.field_n.a((byte) -14, var5 != 0);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.c(false);
          var2 = 0;
          var9 = this.b(true).field_u;
          var10 = var9.a((byte) -26, this.field_g);
          var4 = var10;
          var5 = 0;
          L4: while (true) {
            L5: {
              L6: {
                if (var5 >= var10.length) {
                  break L6;
                } else {
                  stackOut_21_0 = this.a(var10[var5], (byte) -103);
                  stackIn_27_0 = stackOut_21_0 ? 1 : 0;
                  stackIn_22_0 = stackOut_21_0;
                  if (var6 != 0) {
                    break L5;
                  } else {
                    L7: {
                      if (stackIn_22_0) {
                        var2 = var2 + var10[var5].b(75);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var5++;
                    if (var6 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              this.field_t = var2;
              var5 = 0;
              stackOut_26_0 = param0;
              stackIn_27_0 = stackOut_26_0;
              break L5;
            }
            if (stackIn_27_0 == 5418) {
              if (0 < var2) {
                if (this.field_o <= var2) {
                  var5 = 1;
                  this.field_n.a((byte) -14, var5 != 0);
                  return;
                } else {
                  this.field_n.a((byte) -14, var5 != 0);
                  return;
                }
              } else {
                this.field_n.a((byte) -14, var5 != 0);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            this.k(121);
            return 3364198;
        }
        return 3364198;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -127, this.field_o, 8);
            param1.a((byte) -128, !this.field_q ? 0 : 1, 1);
            this.field_n.a(this.h((byte) 117), (byte) 117, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dja.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dja(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_o = param1.b((byte) 44, 8);
            if (param0.field_E <= 10) {
                this.field_o = this.field_o / 5;
            }
            if (9 <= param0.field_E) {
                this.field_q = 1 != param1.b((byte) 44, 1) ? false : true;
            }
            this.field_n = new jma(15, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final int b(int param0) {
        int var2 = 33 % ((param0 - -46) / 45);
        return this.field_o;
    }

    dja(la param0, boolean param1) {
        super(param0, param1);
        try {
            this.field_o = 50;
            this.field_n = new jma(15);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            field_s = (String[]) null;
            return 17;
        }
        return 17;
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            return -69;
        }
        return 8969727;
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            this.field_q = true;
            return this.field_n;
        }
        return this.field_n;
    }

    final void a(int param0, boolean param1) {
        this.field_o = param0;
        if (!param1) {
            dja.l(56);
        }
    }

    private final boolean a(ffa param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (param0.a(124)) {
              L1: {
                if (param1 <= -73) {
                  break L1;
                } else {
                  this.k(15);
                  break L1;
                }
              }
              if (this.field_g == param0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (!this.field_q) {
                    if (io.a(this.field_g.c(-73), param0.e(9648), (byte) -89, this.field_g.a((byte) 55), param0.d(3), this.field_g.e(9648), param0.a((byte) 55), param0.c(-43), this.field_g.d(3))) {
                      break L2;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    if (ck.a(param0.d(3), param0.a((byte) 55), this.field_g.d(3), this.field_g.c(-113), this.field_g.a((byte) 55), param0.e(9648), (byte) 67, this.field_g.e(9648), param0.c(-51))) {
                      break L2;
                    } else {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 4;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("dja.P(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                return stackIn_17_0 != 0;
              }
            }
          }
        }
    }

    final void g(int param0) {
        super.g(param0);
        this.field_n.a((byte) 48, this.h((byte) 125));
    }

    public final int j(byte param0) {
        if (param0 != -108) {
            this.field_q = true;
            return this.field_t;
        }
        return this.field_t;
    }

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        var2 = -39 % ((param0 - -76) / 36);
        if (param1 < 65) {
          if (param1 >= 97) {
            if (param1 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (param1 > 90) {
            if (param1 >= 97) {
              if (param1 > 122) {
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
    }

    final static boolean a(int param0, int param1, byte param2, int param3) {
        if (hka.field_b != null) {
          if (!hka.field_b.a(13)) {
            if (null == fj.field_c) {
              if (param2 == -106) {
                if (bc.a(true)) {
                  return true;
                } else {
                  if (!mda.b(param3, (byte) -44, param1, param0)) {
                    return false;
                  } else {
                    return true;
                  }
                }
              } else {
                field_s = (String[]) null;
                if (bc.a(true)) {
                  return true;
                } else {
                  if (!mda.b(param3, (byte) -44, param1, param0)) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              if (!fj.field_c.b(true)) {
                if (param2 == -106) {
                  if (bc.a(true)) {
                    return true;
                  } else {
                    if (!mda.b(param3, (byte) -44, param1, param0)) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                } else {
                  field_s = (String[]) null;
                  if (bc.a(true)) {
                    return true;
                  } else {
                    if (mda.b(param3, (byte) -44, param1, param0)) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                fj.field_c = null;
                wp.a(-1);
                return true;
              }
            }
          } else {
            wp.a(param2 ^ 105);
            return true;
          }
        } else {
          if (null == fj.field_c) {
            if (param2 == -106) {
              if (bc.a(true)) {
                return true;
              } else {
                if (mda.b(param3, (byte) -44, param1, param0)) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              field_s = (String[]) null;
              if (bc.a(true)) {
                return true;
              } else {
                if (mda.b(param3, (byte) -44, param1, param0)) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (!fj.field_c.b(true)) {
              if (param2 == -106) {
                if (bc.a(true)) {
                  return true;
                } else {
                  if (mda.b(param3, (byte) -44, param1, param0)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                field_s = (String[]) null;
                if (bc.a(true)) {
                  return true;
                } else {
                  if (mda.b(param3, (byte) -44, param1, param0)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              fj.field_c = null;
              wp.a(-1);
              return true;
            }
          }
        }
    }

    static {
        field_r = 7;
    }
}
