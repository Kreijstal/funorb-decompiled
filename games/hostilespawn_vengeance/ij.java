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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (this.field_H == param3) {
                fa.a(5109);
                break L1;
              } else {
                if (this.field_E == param3) {
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
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("ij.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ')');
        }
    }

    public static void e(byte param0) {
        field_J = null;
        if (param0 != 75) {
            field_J = (vl) null;
        }
    }

    private final boolean l(int param0) {
        if (!this.a((sk) (this.field_G), (byte) -99)) {
          return false;
        } else {
          if (param0 != -6790) {
            this.field_H = (ph) null;
            return true;
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0 ^ 0, param1, param2, param3)) {
              if ((param2 ^ -1) != -99) {
                if (-100 != (param2 ^ -1)) {
                  L1: {
                    if (param0 == 274) {
                      break L1;
                    } else {
                      var6 = (String) null;
                      this.a(true, (String) null);
                      break L1;
                    }
                  }
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.b((byte) 115, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a(param1, (byte) 113);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ij.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
              if (!param4) {
                break L2;
              } else {
                field_J = (vl) null;
                break L2;
              }
            }
            L3: {
              var6 = param0;
              if (si.field_a >= var6 + param2) {
                break L3;
              } else {
                var6 = si.field_a - param2;
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = 152 - -(var7 * 48 / param0);
                var9 = var8 | (var8 << -1825260568 | var8 << 1372072944);
                si.field_i[si.field_e * (param2 - -var7) + param3] = var9;
                si.field_i[param1 + (param3 + si.field_e * (param2 + var7))] = var9;
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var5), "ij.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_E.field_D = this.l(param2 ^ -6790);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ij.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int k(int param0) {
        int var1;
        int var2;
        L0: {
          var1 = w.field_r;
          if (-1 <= (sg.field_i ^ -1)) {
            break L0;
          } else {
            var1 = var1 + w.field_r * 5000 / sg.field_i;
            break L0;
          }
        }
        vj.field_s = var1;
        var2 = fl.d(-64);
        if (n.field_s < var2) {
          if (-1 <= (um.field_e ^ -1)) {
            L1: {
              if (-1 < (eh.field_g ^ -1)) {
                if (var2 < n.field_s) {
                  return 0;
                } else {
                  break L1;
                }
              } else {
                if (-5 != (mc.field_I ^ -1)) {
                  um.field_e = 100;
                  n.field_s = n.field_s + 1;
                  if ((n.field_s ^ -1) != -11) {
                    L2: {
                      if ((n.field_s ^ -1) == -18) {
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
                      if ((n.field_s ^ -1) == -18) {
                        ti.a(251, (byte) -126, 4);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    eh.field_c.a(fg.field_b[18], 100, uh.field_i);
                    if (19 != var2) {
                      if (param0 > -6) {
                        return -74;
                      } else {
                        return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
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
                      if (param0 > -6) {
                        return -74;
                      } else {
                        return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
                      }
                    } else {
                      return 0;
                    }
                  }
                }
              }
            }
            if (19 != var2) {
              if (param0 > -6) {
                return -74;
              } else {
                return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
              }
            } else {
              return 0;
            }
          } else {
            if (var2 < n.field_s) {
              return 0;
            } else {
              if (19 != var2) {
                if (param0 > -6) {
                  return -74;
                } else {
                  return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
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
              if (param0 > -6) {
                return -74;
              } else {
                return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
              }
            } else {
              return 0;
            }
          }
        }
    }

    public final void a(boolean param0, String param1) {
        sf var3 = this.field_G;
        String var4 = param1;
        if (!param0) {
            return;
        }
        try {
            ((ig) ((Object) var3)).a((byte) 91, false, var4);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ij.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(sk param0, byte param1) {
        bg var3 = null;
        RuntimeException var3_ref = null;
        bm var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a((byte) -51);
            if (var3 != null) {
              if (param1 <= -30) {
                L1: {
                  var4 = var3.b(-86);
                  if (nd.field_d != var4) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("ij.R(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    private final int a(String param0, String param1, byte param2, int param3, int param4, ag param5, int param6) {
        RuntimeException var8 = null;
        al var9 = null;
        int var10 = 0;
        nh var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11 = new nh(20, param3, param4 + 120, 25, param5, false, 120, 3, jd.field_s, 16777215, param1);
            this.a(51448, var11);
            var10 = -125 % ((-75 - param2) / 51);
            var9 = new al(((sk) ((Object) param5)).a((byte) -106), param0, 126, param3 + var11.field_x, 25 + param4, param6);
            var9.field_p = (mh) (this);
            this.a(51448, var9);
            stackIn_1_0 = var9.field_x + var11.field_x;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("ij.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(byte param0, ji param1) {
        try {
            db.a(true, 256, param1);
            if (param0 != -17) {
                ij.k(-120);
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ij.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public ij() {
        super(0, 0, 496, 0, (nn) null);
        this.field_G = new sf("", (mh) null, 12);
        cn var1 = new cn(jn.field_G, 0, 0, 0, 0, 16777215, -1, 3, 0, jd.field_s.field_y, -1, 2147483647, true);
        ag var2 = new ag(bl.field_d, var1, (mh) null);
        this.field_E = new ph(fh.field_h, (mh) null);
        this.field_H = new ph(qc.field_C, (mh) null);
        this.field_G.field_i = u.field_g;
        this.field_G.a(new n(this.field_G), (byte) -105);
        this.field_E.field_D = false;
        this.field_E.field_h = (nn) ((Object) new ke());
        this.field_H.field_h = (nn) ((Object) new ti());
        this.field_G.field_h = (nn) ((Object) new sd(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(270, var3, 0, 20, 50);
        this.a(51448, var2);
        var3 += 50;
        var3 = var3 + (this.a(170, this.field_G, vg.field_f, (byte) 31, var3, ua.field_a) + 5);
        this.field_E.a(var5, var3, 0, -var5 + 496 >> 1785530049, 40);
        this.field_H.a(60, var3 + 15, 0, var4 - -3, 40);
        this.field_H.field_p = (mh) (this);
        this.field_E.field_p = (mh) (this);
        this.a(51448, this.field_E);
        this.a(51448, this.field_H);
        this.field_I = new mc((kn) (this));
        this.field_I.a(-60 + (-this.field_G.field_s + (this.field_s + -this.field_G.field_v)), 20, 0, 60 + this.field_G.field_s + this.field_G.field_v, 150);
        this.a(51448, this.field_I);
        this.a(496, 0, 0, 0, var4 + (var3 - -55));
    }

    private final void j(int param0) {
        if (!(this.l(-6790))) {
            return;
        }
        if (param0 != 496) {
            return;
        }
        ha.a((byte) 126, this.field_G.field_n);
    }

    public final void a(boolean param0) {
        if (param0) {
            return;
        }
        ((n) ((Object) this.field_G.a((byte) 124))).f(-2);
    }

    private final int a(int param0, ag param1, String param2, byte param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 31) {
                break L1;
              } else {
                this.field_G = (sf) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param2, param5, (byte) 71, param4, param0, param1, 35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("ij.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_J = new vl();
        og discarded$0 = new og();
    }
}
