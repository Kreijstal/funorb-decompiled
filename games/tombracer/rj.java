/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rj extends ae {
    int field_x;
    private boolean field_u;
    private boolean field_v;
    boolean field_y;
    boolean field_w;

    boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
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
            L1: {
              if (!this.b((byte) -34)) {
                break L1;
              } else {
                L2: {
                  if ((param2 ^ -1) == -85) {
                    break L2;
                  } else {
                    if ((param2 ^ -1) == -84) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                this.b(-1, 1, -1, -81);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L3: {
              if (param3) {
                break L3;
              } else {
                this.f((byte) -61);
                break L3;
              }
            }
            stackIn_9_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("rj.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    rj(String param0, isa param1, qc param2) {
        super(param0, param1, param2);
        this.field_u = false;
        this.field_x = 0;
        this.field_v = true;
        this.field_y = true;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        ae var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a((byte) -122, param0, param1, param2)) {
                break L1;
              } else {
                L2: {
                  this.a(1, param2, param1, param0);
                  if (!this.field_w) {
                    break L2;
                  } else {
                    discarded$2 = param2.append(" active");
                    break L2;
                  }
                }
                if (this.field_y) {
                  break L1;
                } else {
                  discarded$3 = param2.append(" disabled");
                  break L1;
                }
              }
            }
            L3: {
              if (param3 == 0) {
                break L3;
              } else {
                var6 = (ae) null;
                this.a((ae) null, true);
                break L3;
              }
            }
            stackIn_8_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("rj.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    rj(String param0, qc param1) {
        this(param0, afa.field_c.field_u, param1);
    }

    void a(int param0, int param1, ae param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_x = 0;
            if (this.field_s != 0) {
                if (this.field_s == ksa.field_p) {
                    return;
                }
                if (this.a(jba.field_j, param0, param1 ^ -2097252, sta.field_B, param3)) {
                    if (!(-1 != (ksa.field_p ^ -1))) {
                        this.b(sta.field_B - param3, this.field_s, -param0 + jba.field_j, -86);
                    }
                }
                this.a((byte) 59, param2, sta.field_B, param0, param3, jba.field_j);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rj.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
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
            L1: {
              if (!this.field_y) {
                break L1;
              } else {
                if (!this.field_v) {
                  break L1;
                } else {
                  L2: {
                    param0.f((byte) -127);
                    this.field_u = true;
                    if (!param1) {
                      break L2;
                    } else {
                      this.field_v = true;
                      break L2;
                    }
                  }
                  L3: {
                    if (null == this.field_h) {
                      break L3;
                    } else {
                      if (this.field_h instanceof vfa) {
                        ((vfa) ((Object) this.field_h)).a((ae) (this), (byte) 90, this.field_u);
                        break L3;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("rj.S(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void f(byte param0) {
        int var2;
        if (this.field_u) {
          this.field_u = false;
          if (this.field_h != null) {
            if (!(this.field_h instanceof vfa)) {
              var2 = 101 / ((param0 - -38) / 60);
              return;
            } else {
              ((vfa) ((Object) this.field_h)).a((ae) (this), (byte) -74, this.field_u);
              var2 = 101 / ((param0 - -38) / 60);
              return;
            }
          } else {
            var2 = 101 / ((param0 - -38) / 60);
            return;
          }
        } else {
          var2 = 101 / ((param0 - -38) / 60);
          return;
        }
    }

    rj(int param0, int param1, int param2, int param3, isa param4, qc param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_u = false;
        this.field_x = 0;
        this.field_v = true;
        this.field_y = true;
    }

    final static void a(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sda var4_ref_sda = null;
        Object var5 = null;
        int var6 = 0;
        cn var7 = null;
        mm var10 = null;
        kh var11 = null;
        byte[] var15 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 4) {
                break L1;
              } else {
                var7 = (cn) null;
                rj.a((cn) null, 5, -25, (byte) 14);
                break L1;
              }
            }
            var11 = vc.field_q;
            var2 = var11.h(255);
            if (-1 == (var2 ^ -1)) {
              var10 = (mm) ((Object) wma.field_n.f(-80));
              if (var10 == null) {
                dea.a(60);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var4 = var11.h(param0 ^ 251);
                  if (var4 == 0) {
                    var5 = null;
                    break L2;
                  } else {
                    var15 = new byte[var4];
                    var11.a(var15, 0, -115, var4);
                    break L2;
                  }
                }
                var11.field_h = var11.field_h + 4;
                if (var11.a((byte) 114)) {
                  var10.p(95);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  dea.a(60);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              if (var2 != 1) {
                ssa.a("A1: " + kk.a(32), (byte) 117, (Throwable) null);
                dea.a(60);
                return;
              } else {
                var3 = var11.e(-34);
                var4_ref_sda = (sda) ((Object) qd.field_a.f(param0 + -84));
                L3: while (true) {
                  L4: {
                    if (var4_ref_sda == null) {
                      break L4;
                    } else {
                      if (var4_ref_sda.field_l != var3) {
                        var4_ref_sda = (sda) ((Object) qd.field_a.e(117));
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4_ref_sda != null) {
                    var4_ref_sda.p(24);
                    return;
                  } else {
                    dea.a(60);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "rj.TA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public rj() {
        this.field_u = false;
        this.field_x = 0;
        this.field_v = true;
        this.field_y = true;
        this.field_r = afa.field_c.field_v;
    }

    final static iu[] a(cn param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        iu[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (jna.a(false, param1, param2, param0)) {
              L1: {
                if (param3 == -82) {
                  break L1;
                } else {
                  rj.a(23);
                  break L1;
                }
              }
              stackIn_6_0 = fj.c(1500);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("rj.UA(");

            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_y) {
                break L1;
              } else {
                if (!this.a(param6, param1, 125, param3, param2)) {
                  break L1;
                } else {
                  L2: {
                    this.a(param5, false);
                    this.field_s = param4;
                    if (null == this.field_h) {
                      break L2;
                    } else {
                      if (!(this.field_h instanceof om)) {
                        break L2;
                      } else {
                        ((om) ((Object) this.field_h)).a(param3, param6, (rj) (this), 453, param2, param4, param1);
                        break L2;
                      }
                    }
                  }
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param0 > 70) {
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_y = true;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("rj.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final boolean b(byte param0) {
        if (param0 != -34) {
            this.field_u = false;
            return this.field_u;
        }
        return this.field_u;
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        try {
            if (this.field_h != null && this.field_h instanceof om) {
                ((om) ((Object) this.field_h)).a(param4, param3, 12728, param2, (rj) (this), param5);
            }
            if (param0 != 59) {
                ae var8 = (ae) null;
                this.a((ae) null, true);
            }
            this.field_s = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rj.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        this.field_x = param1;
        if (null != this.field_h) {
          if (this.field_h instanceof tsa) {
            ((tsa) ((Object) this.field_h)).a(param0, param2, (rj) (this), param1, (byte) 115);
            if (param3 > -40) {
              rj.a(14);
              return;
            } else {
              return;
            }
          } else {
            if (param3 > -40) {
              rj.a(14);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 > -40) {
            rj.a(14);
            return;
          } else {
            return;
          }
        }
    }

    static {
    }
}
