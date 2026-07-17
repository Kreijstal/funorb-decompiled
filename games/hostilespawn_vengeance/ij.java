/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends vd implements kn, qk {
    private ph field_H;
    static vl field_J;
    private ph field_E;
    private sf field_G;
    static int field_F;
    mc field_I;

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (((ij) this).field_H == param3) {
                fa.a(5109);
                break L1;
              } else {
                if (((ij) this).field_E == param3) {
                  this.j(496);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6_int = -57 % ((-63 - param4) / 52);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("ij.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param4 + 41);
        }
    }

    public static void e(byte param0) {
        field_J = null;
    }

    private final boolean l(int param0) {
        if (!this.a((sk) (Object) ((ij) this).field_G, (byte) -99)) {
          return false;
        } else {
          if (param0 != -6790) {
            ((ij) this).field_H = null;
            return true;
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, param1, param2, param3)) {
              if (param2 != 98) {
                if (param2 != 99) {
                  L1: {
                    if (param0 == 274) {
                      break L1;
                    } else {
                      var6 = null;
                      ((ij) this).a(true, (String) null);
                      break L1;
                    }
                  }
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_7_0 = ((ij) this).b((byte) 115, param1);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ((ij) this).a(param1, (byte) 113);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("ij.F(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              si.a(param3, param2, param1 + 1, 10000536);
              si.a(param3, param2 + param0, param1 + 1, 12105912);
              var5_int = 1;
              if (si.field_j <= param2 + var5_int) {
                break L1;
              } else {
                var5_int = si.field_j - param2;
                break L1;
              }
            }
            L2: {
              var6 = param0;
              if (si.field_a >= var6 + param2) {
                break L2;
              } else {
                var6 = si.field_a - param2;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = 152 - -(var7 * 48 / param0);
                var9 = var8 | (var8 << 8 | var8 << 16);
                si.field_i[si.field_e * (param2 - -var7) + param3] = var9;
                si.field_i[param1 + (param3 + si.field_e * (param2 + var7))] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var5, "ij.S(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + 0 + 41);
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((ij) this).field_E.field_D = this.l(param2 ^ -6790);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ij.W(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static int k(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var1 = w.field_r;
          if (sg.field_i <= 0) {
            break L0;
          } else {
            var1 = var1 + w.field_r * 5000 / sg.field_i;
            break L0;
          }
        }
        vj.field_s = var1;
        var2 = fl.d(-64);
        if (n.field_s < var2) {
          if (um.field_e <= 0) {
            L1: {
              if (eh.field_g < 0) {
                if (var2 < n.field_s) {
                  return 0;
                } else {
                  break L1;
                }
              } else {
                if (mc.field_I != 4) {
                  um.field_e = 100;
                  n.field_s = n.field_s + 1;
                  if (n.field_s != 10) {
                    L2: {
                      if (n.field_s == 17) {
                        ti.a(251, (byte) -126, 4);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    eh.field_c.a(fg.field_b[18], 100, uh.field_i);
                    break L1;
                  } else {
                    L3: {
                      ti.a(252, (byte) -110, 3);
                      if (n.field_s == 17) {
                        ti.a(251, (byte) -126, 4);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    eh.field_c.a(fg.field_b[18], 100, uh.field_i);
                    if (19 != var2) {
                      if (param0 <= -6) {
                        return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
                      } else {
                        return -74;
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  if (var2 < n.field_s) {
                    return 0;
                  } else {
                    if (19 != var2) {
                      if (param0 <= -6) {
                        return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
                      } else {
                        return -74;
                      }
                    } else {
                      return 0;
                    }
                  }
                }
              }
            }
            if (19 != var2) {
              if (param0 <= -6) {
                return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
              } else {
                return -74;
              }
            } else {
              return 0;
            }
          } else {
            if (var2 < n.field_s) {
              return 0;
            } else {
              if (19 != var2) {
                if (param0 <= -6) {
                  return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
                } else {
                  return -74;
                }
              } else {
                return 0;
              }
            }
          }
        } else {
          if (var2 < n.field_s) {
            return 0;
          } else {
            if (19 != var2) {
              if (param0 <= -6) {
                return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
              } else {
                return -74;
              }
            } else {
              return 0;
            }
          }
        }
    }

    public final void a(boolean param0, String param1) {
        sf var3 = ((ij) this).field_G;
        String var4 = param1;
        if (!param0) {
            return;
        }
        try {
            ((ig) (Object) var3).a((byte) 91, false, var4);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ij.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final boolean a(sk param0, byte param1) {
        bg var3 = null;
        RuntimeException var3_ref = null;
        bm var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
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
            var3 = param0.a((byte) -51);
            if (var3 != null) {
              L1: {
                var4 = var3.b(-86);
                if (nd.field_d != var4) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("ij.R(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + -99 + 41);
        }
        return stackIn_7_0 != 0;
    }

    private final int a(String param0, String param1, byte param2, int param3, int param4, ag param5, int param6) {
        RuntimeException var8 = null;
        al var9 = null;
        int var10 = 0;
        nh var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var11 = new nh(20, param3, param4 + 120, 25, param5, false, 120, 3, jd.field_s, 16777215, param1);
            ((ij) this).a(51448, (ag) (Object) var11);
            var10 = -125 % ((-75 - param2) / 51);
            var9 = new al(((sk) (Object) param5).a((byte) -106), param0, 126, param3 + var11.field_x, 25 + param4, 35);
            var9.field_p = (mh) this;
            ((ij) this).a(51448, (ag) (Object) var9);
            stackOut_0_0 = var9.field_x + var11.field_x;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("ij.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 35 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(byte param0, ji param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              db.a(true, 256, param1);
              if (param0 == -17) {
                break L1;
              } else {
                int discarded$2 = ij.k(-120);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ij.G(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public ij() {
        super(0, 0, 496, 0, (nn) null);
        ((ij) this).field_G = new sf("", (mh) null, 12);
        cn var1 = new cn(jn.field_G, 0, 0, 0, 0, 16777215, -1, 3, 0, jd.field_s.field_y, -1, 2147483647, true);
        ag var2 = new ag(bl.field_d, (nn) (Object) var1, (mh) null);
        ((ij) this).field_E = new ph(fh.field_h, (mh) null);
        ((ij) this).field_H = new ph(qc.field_C, (mh) null);
        ((ij) this).field_G.field_i = u.field_g;
        ((ij) this).field_G.a((bg) (Object) new n((ig) (Object) ((ij) this).field_G), (byte) -105);
        ((ij) this).field_E.field_D = false;
        ((ij) this).field_E.field_h = (nn) (Object) new ke();
        ((ij) this).field_H.field_h = (nn) (Object) new ti();
        ((ij) this).field_G.field_h = (nn) (Object) new sd(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(270, var3, 0, 20, 50);
        ((ij) this).a(51448, var2);
        var3 += 50;
        var3 = var3 + (this.a(170, (ag) (Object) ((ij) this).field_G, vg.field_f, (byte) 31, var3, ua.field_a) + 5);
        ((ij) this).field_E.a(var5, var3, 0, -var5 + 496 >> 1, 40);
        ((ij) this).field_H.a(60, var3 + 15, 0, var4 - -3, 40);
        ((ij) this).field_H.field_p = (mh) this;
        ((ij) this).field_E.field_p = (mh) this;
        ((ij) this).a(51448, (ag) (Object) ((ij) this).field_E);
        ((ij) this).a(51448, (ag) (Object) ((ij) this).field_H);
        ((ij) this).field_I = new mc((kn) this);
        ((ij) this).field_I.a(-60 + (-((ij) this).field_G.field_s + (((ij) this).field_s + -((ij) this).field_G.field_v)), 20, 0, 60 + ((ij) this).field_G.field_s + ((ij) this).field_G.field_v, 150);
        ((ij) this).a(51448, (ag) (Object) ((ij) this).field_I);
        ((ij) this).a(496, 0, 0, 0, var4 + (var3 - -55));
    }

    private final void j(int param0) {
        if (!(this.l(-6790))) {
            return;
        }
    }

    public final void a(boolean param0) {
        if (param0) {
            return;
        }
        ((n) (Object) ((ij) this).field_G.a((byte) 124)).f(-2);
    }

    private final int a(int param0, ag param1, String param2, byte param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 31) {
                break L1;
              } else {
                ((ij) this).field_G = null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param2, param5, (byte) 71, param4, param0, param1, 35);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("ij.Q(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new vl();
        og discarded$0 = new og();
    }
}
