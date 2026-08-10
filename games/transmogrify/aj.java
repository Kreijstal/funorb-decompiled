/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class aj extends qg implements pb {
    qj field_u;
    static String field_v;
    static java.awt.Frame field_t;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 9 / ((-29 - param0) / 53);
        super.a(-93, param1, param2, param3, param4);
        this.j(-110);
    }

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        tl var7 = null;
        qg var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var7 = new tl(this.field_u);
            if (param3 == -1) {
              var8 = (qg) ((Object) var7.c(param3 + -90));
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.b(8)) {
                      break L2;
                    } else {
                      var8.a(this.field_n + param0, param1, param2, -1, param4, this.field_p + param5);
                      var8 = (qg) ((Object) var7.a(405142401));
                      continue L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("aj.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException runtimeException = null;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new tl(this.field_u);
            var6 = (qg) ((Object) var5.c(-95));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(8)) {
                    break L2;
                  } else {
                    var6.a(param0 + this.field_n, (byte) -12, param2, param3 - -this.field_p);
                    var6 = (qg) ((Object) var5.a(param1 ^ -405142411));
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("aj.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        tl var8 = null;
        RuntimeException var8_ref = null;
        qg var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new tl(this.field_u);
              if (param4 == -30386) {
                break L1;
              } else {
                this.f(-5);
                break L1;
              }
            }
            var9 = (qg) ((Object) var8.c(-108));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(8)) {
                    break L3;
                  } else {
                    if (!var9.b(param0, param1, param2, param3 - -this.field_p, -30386, param5, this.field_n + param6)) {
                      var9 = (qg) ((Object) var8.a(405142401));
                      continue L2;
                    } else {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8_ref);

            stackIn_14_1 = new StringBuilder().append("aj.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean a(qg param0, int param1) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        qg var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3 = new tl(this.field_u);
            if (param1 <= -11) {
              var4 = (qg) ((Object) var3.c(-117));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4.a(param0, -87)) {
                    stackIn_9_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4 = (qg) ((Object) var3.a(405142401));
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("aj.M(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final boolean b(byte param0) {
        int var2 = -52 % ((param0 - -57) / 46);
        return null != this.i(-124) ? true : false;
    }

    qg i(int param0) {
        tl var2;
        qg var3;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = new tl(this.field_u);
        var3 = (qg) ((Object) var2.c(-123));
        if (param0 < -112) {
          L0: while (true) {
            if (var3 != null) {
              if (!var3.b((byte) 78)) {
                var3 = (qg) ((Object) var2.a(405142401));
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return (qg) null;
        }
    }

    final StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        qg var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a((byte) -70, param3, param2, param0)) {
                this.a(param2, 68, param0, param3);
                this.a(-12060, param3, param2, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 <= -20) {
                break L2;
              } else {
                var6 = (qg) null;
                this.a((qg) null, (byte) -109);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("aj.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final int g(int param0) {
        int var5 = 0;
        int var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 >= -41) {
            return -79;
        }
        int var2 = 0;
        tl var3 = new tl(this.field_u);
        qg var4 = (qg) ((Object) var3.c(-127));
        while (var4 != null) {
            var5 = var4.g(-68);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (qg) ((Object) var3.a(405142401));
        }
        return var2;
    }

    final void a(qg param0, byte param1) {
        try {
            this.field_u.a(param0, -111);
            if (param1 >= -77) {
                field_t = (java.awt.Frame) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "aj.IB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void k(int param0) {
        oh.field_h.field_p = param0;
        oh.field_h.field_k = 0;
    }

    final static void a(java.awt.Component param0, int param1, int param2, lc param3, boolean param4, int param5, fe param6, int param7) {
        try {
            qh.a(param5, param4, 10);
            re.field_h = qh.a(param6, param0, 0, param1);
            u.field_a = qh.a(param6, param0, 1, param7);
            of.field_a = new jc();
            pc.field_b = param7 * 1000 / param5;
            u.field_a.b(of.field_a);
            jk.field_D = param3;
            jk.field_D.a((byte) 107, lb.field_a);
            re.field_h.b(jk.field_D);
            if (param2 != 22290) {
                ci var9 = (ci) null;
                aj.a((ci) null, (ci) null, (ci) null, -25);
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "aj.JB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final String f(int param0) {
        tl var2;
        qg var3;
        String var4;
        int var5;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param0 == 4) {
            break L0;
          } else {
            aj.a(false, true, true, true);
            break L0;
          }
        }
        var2 = new tl(this.field_u);
        var3 = (qg) ((Object) var2.c(-95));
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.f(4);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (qg) ((Object) var2.a(param0 + 405142397));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    public static void h(int param0) {
        field_v = null;
        field_t = null;
        if (param0 != 32) {
            aj.k(-45);
        }
    }

    final static void a(ci param0, ci param1, ci param2, int param3) {
        ti var17 = null;
        ii[] var5 = null;
        ii[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        ii[] var14 = null;
        int var11_int = 0;
        ti var15 = null;
        ti var18 = null;
        ti var11 = null;
        ti var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Transmogrify.field_A ? 1 : 0;
        try {
            ua.field_f = kl.a(param2, (byte) 127, "commonui", "frame_top");
            rh.field_l = kl.a(param2, (byte) 125, "commonui", "frame_bottom");
            vf.field_a = pc.a("commonui", "jagex_logo_grey", param2, 113);
            mc.field_b = kl.a(param2, (byte) 125, "commonui", "button");
            ai.field_b = ik.a("commonui", param2, (byte) -46, "validation");
            al.field_i = (kg) ((Object) ua.a(param2, "commonui", 32, param1, "arezzo12"));
            vd.field_h = (kg) ((Object) ua.a(param2, "commonui", 32, param1, "arezzo14"));
            rh.field_q = (kg) ((Object) ua.a(param2, "commonui", param3 + -2394310, param1, "arezzo14bold"));
            var17 = new ti(param0.a("", (byte) 100, "button.gif"), (java.awt.Component) ((Object) gd.field_k));
            gk.a("commonui", param3 ^ -2392393, param2, "dropdown");
            var5 = ej.a((byte) -43, param2, "screen_options", "commonui");
            kf.field_h = new ii[4];
            fj.field_a = new ii[4];
            eh.field_b = new ii[4];
            var6 = new ii[][]{fj.field_a, kf.field_h, eh.field_b};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_j;
            for (var8 = 1; var19.length > var8; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_i[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = param3;
            var19[3][var8] = 4767999;
            for (var9 = 0; var9 < 3; var9++) {
                var14 = var6[var9];
                ii[] var10 = var14;
                for (var11_int = 0; var11_int < var14.length; var11_int++) {
                    var14[var11_int] = qf.a(var5[var9], var19[var11_int], -2);
                }
            }
            var9 = var17.field_m;
            og.a((byte) 108);
            var17.e();
            sb.b(0, 0, sb.field_c, sb.field_g);
            var15 = new ti(var9, var9);
            var18 = var15;
            var18.e();
            var17.f(0, 0);
            var11 = new ti(var9, var9);
            var11.e();
            var17.f(-var17.field_n + var9, 0);
            var12 = new ti(-(2 * var9) + var17.field_n, var9);
            var12.e();
            var17.f(-var9, 0);
            fi.c(true);
            mc.field_b = new ti[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "aj.QB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (param3) {
            var4 += 2;
        }
        if (!(!param2)) {
            var4++;
        }
        if (!param0) {
            return (String) null;
        }
        return rf.field_cb[var4];
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qg var9 = null;
        tl var10 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var6 = 26 % ((65 - param2) / 55);
            var10 = new tl(this.field_u);
            var9 = (qg) ((Object) var10.c(-117));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(8)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.b((byte) -103)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, (byte) 125, param3)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (qg) ((Object) var10.a(405142401));
                    continue L1;
                  }
                }
              }
              var7 = param0;
              if (80 != var7) {
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L4: {
                  if (ve.field_B[81]) {
                    stackIn_13_0 = this.a(2, param1);
                    break L4;
                  } else {
                    stackIn_13_0 = this.b(param1, 56);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("aj.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    private final void j(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(this.field_u);
        if (param0 > -72) {
            return;
        }
        qg var3 = (qg) ((Object) var2.c(-125));
        while (var3 != null) {
            var3.c((byte) 38);
            var3 = (qg) ((Object) var2.a(405142401));
        }
    }

    final boolean b(qg param0, int param1) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        qg var4 = null;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.field_u.d(-1)) {
              var3 = new tl(this.field_u);
              if (param1 > 44) {
                var4 = (qg) ((Object) var3.c(-117));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.b((byte) -118)) {
                        break L2;
                      } else {
                        var5 = new tl(this.field_u);
                        var5.a(var4, 95);
                        var6 = (qg) ((Object) var5.a(405142401));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param0, -30)) {
                              stackIn_15_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var6 = (qg) ((Object) var5.a(405142401));
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (qg) ((Object) var3.a(405142401));
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("aj.MB(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    private final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = new tl(this.field_u);
              if (param0 == -12060) {
                break L1;
              } else {
                this.field_u = (qj) null;
                break L1;
              }
            }
            var6 = (qg) ((Object) var5.c(param0 + 11962));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param2.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param3) {
                    var6.a(1 + param3, -43, param2, param1);
                    var6 = (qg) ((Object) var5.a(405142401));
                    continue L2;
                  } else {
                    discarded$4 = param2.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("aj.HB(").append(param0).append(',');

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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = Transmogrify.field_A ? 1 : 0;
        int var6 = -80 % ((77 - param3) / 34);
        if (-1 == (param2 ^ -1)) {
            if (!(this.field_q == null)) {
                this.field_q.a(param0, param1, true, (byte) 103, (qg) (this));
            }
        }
        tl var5 = new tl(this.field_u);
        qg var7 = (qg) ((Object) var5.a((byte) 62));
        while (var7 != null) {
            var7.a(param0 - -this.field_p, param1 + this.field_n, param2, (byte) 9);
            var7 = (qg) ((Object) var5.b(-29339));
        }
    }

    final boolean a(int param0, qg param1) {
        RuntimeException var3 = null;
        qg var4 = null;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        tl var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.field_u.d(-1)) {
              L1: {
                var8 = new tl(this.field_u);
                if (param0 == 2) {
                  break L1;
                } else {
                  this.a(-95, (qg) null, (byte) -47, '￈');
                  break L1;
                }
              }
              var4 = (qg) ((Object) var8.a((byte) 62));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.b((byte) -112)) {
                      break L3;
                    } else {
                      var5 = new tl(this.field_u);
                      var5.a(var4, true);
                      var6 = (qg) ((Object) var5.b(-29339));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(param1, -69)) {
                            var6 = (qg) ((Object) var5.b(-29339));
                            continue L4;
                          } else {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (qg) ((Object) var8.b(-29339));
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("aj.NB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    aj(int param0, int param1, int param2, int param3, ui param4) {
        super(param0, param1, param2, param3, param4, (ma) null);
        this.field_u = new qj();
    }

    final boolean a(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        tl var8 = null;
        RuntimeException var8_ref = null;
        qg var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var8 = new tl(this.field_u);
            var9 = (qg) ((Object) var8.c(param5 ^ 114));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(8)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.b((byte) -119)) {
                        break L3;
                      } else {
                        if (var9.a(param0, param1, param2, param3, param4, -17, param6)) {
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = (qg) ((Object) var8.a(405142401));
                    continue L1;
                  }
                }
              }
              if (param5 == -17) {
                stackIn_14_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("aj.R(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final void e(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(this.field_u);
        qg var3 = (qg) ((Object) var2.c(-114));
        if (param0 != -29113) {
            this.field_u = (qj) null;
        }
        while (var3 != null) {
            var3.e(-29113);
            var3 = (qg) ((Object) var2.a(param0 ^ -405113402));
        }
    }

    static {
        field_v = "Mouse over an icon for details";
    }
}
