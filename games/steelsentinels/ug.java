/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ug extends lh implements lm {
    static int field_Q;
    static String field_K;
    lh field_J;
    static int[] field_H;
    static String field_N;
    static pn field_M;
    static java.applet.Applet field_O;
    static wk field_P;
    static String field_L;
    static int field_I;

    final static void a(int param0, boolean param1, int param2, int param3) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        gh var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        na var9 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (an.field_h <= wa.field_p) {
                break L1;
              } else {
                wa.field_p = wa.field_p + 1;
                break L1;
              }
            }
            L2: {
              if (sb.field_bb.field_i != jn.field_c) {
                va.field_b = va.field_b + (-jn.field_c + sb.field_bb.field_i);
                jn.field_c = sb.field_bb.field_i;
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 <= (wa.field_p ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                nn.a(false);
                qc.field_V.a((byte) 115, param1);
                if (null == ve.field_b) {
                  break L3;
                } else {
                  if (fj.field_e) {
                    ve.field_b.a((byte) 108, param1, qc.field_V.field_cb, qc.field_V.field_Rb);
                    break L3;
                  } else {
                    ve.field_b = null;
                    break L3;
                  }
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (5 <= var4_int) {
                  L5: {
                    if (fm.field_b.field_Eb == 0) {
                      break L5;
                    } else {
                      n.field_x = new td(fm.field_b.field_Rb, fm.field_b.field_cb, fm.field_b.field_zb, fm.field_b.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K, (String) null, 0L);
                      break L5;
                    }
                  }
                  L6: {
                    var9 = ea.a(param3, da.field_g, 85, db.field_b);
                    if (var9 == null) {
                      break L6;
                    } else {
                      ph.a(var9, -1);
                      break L6;
                    }
                  }
                  var8 = lj.a(param0 ^ -2);
                  if (var8 != null) {
                    ll.field_i = var8;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  L7: {
                    var5 = ah.field_Yb[var4_int];
                    if (var5 != null) {
                      L8: {
                        if (-1 == (var5.field_Eb ^ -1)) {
                          break L8;
                        } else {
                          bl.a(12, var4_int, var5);
                          break L8;
                        }
                      }
                      var6 = ei.a(var4_int, 1);
                      jk.field_a[var4_int].field_Pb = dh.field_y[var6];
                      gb.field_f[var4_int].field_S = ec.field_e[var6];
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var4_int++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ug.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -77, param2, param3, param4);
        this.f(-127);
        if (param1 < -71) {
            return;
        }
        field_L = (String) null;
    }

    private final boolean c(int param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                L2: {
                  if (null == this.field_J) {
                    break L2;
                  } else {
                    if (this.field_J.d(0)) {
                      break L2;
                    } else {
                      if (!this.field_J.a(1, param1)) {
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        break L1;
                      }
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ug.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public static void g(int param0) {
        field_O = null;
        field_N = null;
        field_L = null;
        field_K = null;
        field_M = null;
        field_H = null;
        field_P = null;
        if (param0 == 475) {
          return;
        } else {
          field_K = (String) null;
          return;
        }
    }

    final void d(byte param0) {
        if (param0 != -45) {
          L0: {
            field_Q = 16;
            if (null != this.field_J) {
              this.field_J.d((byte) -45);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != this.field_J) {
              this.field_J.d((byte) -45);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -34) {
              L1: {
                L2: {
                  if (this.field_J == null) {
                    break L2;
                  } else {
                    if (!this.field_J.d(0)) {
                      break L2;
                    } else {
                      if (!this.field_J.a((byte) -106, param1, param2, param3, param4, param5, param6)) {
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        break L1;
                      }
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("ug.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    private final boolean b(int param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 4) {
                break L1;
              } else {
                field_P = (wk) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_J) {
                  break L3;
                } else {
                  if (this.field_J.d(param0 + -4)) {
                    break L3;
                  } else {
                    if (!this.field_J.a(1, param1)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ug.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void f(int param0) {
        if (param0 >= -120) {
            return;
        }
        if (!(null == this.field_J)) {
            this.field_J.e((byte) 60);
        }
    }

    final int b(boolean param0) {
        boolean discarded$4 = false;
        lh var3;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (!param0) {
          L0: {
            var3 = (lh) null;
            discarded$4 = this.c(-20, (lh) null);
            if (this.field_J != null) {
              stackIn_8_0 = this.field_J.b(true);
              break L0;
            } else {
              stackIn_8_0 = 0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_J != null) {
              stackIn_4_0 = this.field_J.b(true);
              break L1;
            } else {
              stackIn_4_0 = 0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final boolean a(int param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_O = (java.applet.Applet) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_J == null) {
                  break L3;
                } else {
                  if (!this.field_J.a(param0 + 0, param1)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ug.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5) {
              L1: {
                L2: {
                  if (this.field_J == null) {
                    break L2;
                  } else {
                    if (!this.field_J.a(param0, param1, this.field_o + param2, param3, param4 - -this.field_z, true, param6)) {
                      break L2;
                    } else {
                      stackIn_7_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_7_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("ug.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    ug(int param0, int param1, int param2, int param3, qk param4, tn param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        try {
            if (this.field_J != null) {
                this.field_J.a((byte) -58, param1, this.field_z + param2, param3 + this.field_o, param4, param5);
            }
            int var7_int = -82 / ((param0 - 36) / 32);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ug.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, 122, param2, param3);
              if (this.field_J != null) {
                this.field_J.a(param0 + this.field_o, 58, param2, this.field_z + param3);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 >= 56) {
              break L0;
            } else {
              this.field_J = (lh) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ug.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    String e(int param0) {
        String var2;
        String var3;
        var2 = super.e(param0);
        if (null != this.field_J) {
          var3 = this.field_J.e(param0 ^ 0);
          if (var3 == null) {
            return var2;
          } else {
            return var3;
          }
        } else {
          return var2;
        }
    }

    final boolean d(int param0) {
        StringBuilder var3;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 0) {
          L0: {
            var3 = (StringBuilder) null;
            this.a((Hashtable) null, (StringBuilder) null, (byte) -32, 125);
            if (this.a((byte) -2) == null) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.a((byte) -2) == null) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            discarded$3 = param3.append('\n');
            var5_int = 0;
            if (param1 > 53) {
              L1: while (true) {
                if (param2 < var5_int) {
                  if (this.field_J != null) {
                    this.field_J.a(param0, param3, (byte) -119, 1 + param2);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    discarded$4 = param3.append("null");
                    return;
                  }
                } else {
                  discarded$5 = param3.append(' ');
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ug.M(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        StringBuilder var6;
        if (0 == param3) {
          if (null != this.field_p) {
            this.field_p.a(param2, (lh) (this), (byte) -30, true, param0);
            if (param1 < -99) {
              if (null == this.field_J) {
                return;
              } else {
                this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
                return;
              }
            } else {
              var6 = (StringBuilder) null;
              this.a((Hashtable) null, (byte) 1, 11, (StringBuilder) null);
              if (null == this.field_J) {
                return;
              } else {
                this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
                return;
              }
            }
          } else {
            if (param1 < -99) {
              if (null == this.field_J) {
                return;
              } else {
                this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
                return;
              }
            } else {
              var6 = (StringBuilder) null;
              this.a((Hashtable) null, (byte) 1, 11, (StringBuilder) null);
              if (null == this.field_J) {
                return;
              } else {
                this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
                return;
              }
            }
          }
        } else {
          if (param1 < -99) {
            if (null == this.field_J) {
              return;
            } else {
              this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
              return;
            }
          } else {
            var6 = (StringBuilder) null;
            this.a((Hashtable) null, (byte) 1, 11, (StringBuilder) null);
            if (null == this.field_J) {
              return;
            } else {
              this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
              return;
            }
          }
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_J == null) {
                break L1;
              } else {
                if (!this.field_J.d(0)) {
                  break L1;
                } else {
                  if (this.field_J.a(param0 + 0, param1, param2, param3)) {
                    stackIn_5_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var5_int = param1;
            if (-81 != (var5_int ^ -1)) {
              if (param0 == 30373) {
                stackIn_14_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                field_O = (java.applet.Applet) null;
                return false;
              }
            } else {
              L2: {
                if (fc.field_e[81]) {
                  stackIn_10_0 = this.b(4, param3);
                  break L2;
                } else {
                  stackIn_10_0 = this.c(-1, param3);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("ug.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    lh a(byte param0) {
        lh var2;
        if (param0 == -2) {
          var2 = this.field_J;
          if (var2 != null) {
            if (!var2.d(param0 ^ -2)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        } else {
          field_M = (pn) null;
          var2 = this.field_J;
          if (var2 != null) {
            if (!var2.d(param0 ^ -2)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 <= -104) {
              L1: {
                if (!this.a(param1, (byte) -91, param3, param0)) {
                  break L1;
                } else {
                  this.a(param3, param0, false, param1);
                  this.a(param0, (byte) 98, param3, param1);
                  break L1;
                }
              }
              stackIn_6_0 = (StringBuilder) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ug.D(");

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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_H = new int[]{4, -1, -1, 8};
        field_K = "Updates will sent to the email address you've given";
        field_N = "Unable to delete friend - system busy";
        field_L = "Send private message";
    }
}
