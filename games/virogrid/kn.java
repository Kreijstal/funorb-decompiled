/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends ec {
    static String field_F;
    static int field_B;
    static int field_I;
    static byte[] field_E;
    static int[] field_K;
    static String field_L;
    static String field_G;
    int field_H;
    static String field_J;

    final static void g(int param0) {
        la.field_g = 0;
        if (param0 != 20128) {
          kn.f(-95);
        }
    }

    public static void h(int param0) {
        field_E = null;
        field_F = null;
        field_J = null;
        if (param0 != 0) {
          kn.a('ﾬ', (byte) 74);
        }
        field_L = null;
        field_G = null;
        field_K = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param3 != 0) {
          return;
        }
        if (this.field_x == null) {
          return;
        }
        if (this.field_H == 0) {
          return;
        }
        if (256 == this.field_H) {
          this.field_x.a((byte) 37, param1 + this.field_l, this.field_u + param2, param3);
          return;
        }
        mg var5 = new mg(this.field_x.field_g, this.field_x.field_m);
        kb.a(var5, 16865);
        this.field_x.a(param0, 0, 0, param3);
        ai.a(true);
        var5.a(param1 + this.field_l, this.field_u + param2, this.field_H);
    }

    public kn() {
        super(0, 0, 0, 0, (ol) null, (cd) null);
        this.field_H = 256;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, he param7) {
        hk[][] stackIn_4_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        hk[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hk var13_ref_hk = null;
        int var14 = 0;
        int var15 = 0;
        hk[] var16 = null;
        hk[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int var10_intLifetime1;
        int var13Lifetime1;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (param6 >= param3) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (var9 >= nb.field_q.length) {
                if (var8_int == 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                ud.field_b = true;
                decompiledFrameCompleted0 = false;
                break;
              }
              var19 = nb.field_q[var9];
              var18 = var19;
              var10 = var18;
              var11 = 0;
              var12 = 0;
              L3: while (true) {
                if (var12 >= var19.length) {
                  if (var11 == 0 &&
                    vb.field_h != param6) {
                    break L3;
                  }
                  var8_int = 0;
                  for (var12 = 0; var19.length > var12; var12 += 2) {
                    var13 = var19[var12];
                    if (var13 != -1) {
                      if (param6 > var13) {
                        hk.field_Lb[var13] = true;
                      }
                    } else {
                      vi.field_l = true;
                    }
                  }
                  break L3;
                }
                var13Lifetime1 = var19[var12];
                var14 = var10[var12 + 1];
                if (var13Lifetime1 == -1) {
                  if (var14 != vj.field_b[param2]) {
                    break L3;
                  }
                } else {
                  if (param6 == var13Lifetime1 &&
                    param1 == var14) {
                    var11 = 1;
                  } else {
                    if (var13Lifetime1 >= param6) {
                      break L3;
                    }
                    if (var14 != (ub.field_D[var13Lifetime1] & 255)) {
                      break L3;
                    }
                  }
                }
                var12 += 2;
                continue;

              }
              var9++;
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_4_0 = oe.field_b;
            if (param6 != -1) {
              stackIn_5_1 = param6 + 4;
            } else {
              stackIn_5_1 = 1;
            }
            var16 = stackIn_4_0[stackIn_5_1];
            var17 = var16;
            var8 = var17;
            var9 = 1;
            if (param0) {
              if (-1 != param6) {
                for (var10_int = 0; var10_int < var16.length - 1; var10_int++) {
                  if ((pm.field_p[(var10_int + param4) / 8] & 1 << (param4 + var10_int & 7)) == 0) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param4 = param4 + (lk.field_Pb[param6] & 255);
              } else {
                var10_int = 0;
                while (!(vj.field_b.length <= var10_int)) {
                  if ((field_E[var10_int / 8] & 1 << (7 & var10_int)) == 0) {
                    var10_int++;
                    continue;
                  }
                  var9 = 0;
                  break;
                }
              }
            }
            var10_intLifetime1 = 0;
            var11 = 0;
            while (true) {
              if (-1 != param6) {
                stackIn_22_0 = var17.length - 1;
              } else {
                stackIn_22_0 = vj.field_b.length;
              }
              if (stackIn_22_0 <= var11) {
                if (var10_intLifetime1 != 0) {
                  break;
                }
                for (var11 = 0; -1 + var17.length > var11; var11++) {
                  if (param6 != -1) {
                    ub.field_D[param6] = (byte)var11;
                  } else {
                    param2 = var11;
                  }
                  kn.a(param0, param1, param2, param3, param4, 8, param6 + 1, param7);
                  if (ud.field_b) {
                    return;
                  }
                }
                break;
              }
              if (param6 != -1) {
                ub.field_D[param6] = (byte)var11;
              } else {
                param2 = var11;
              }
              if (param6 == -1 &&
                vj.field_b.length == 1) {
                var12 = 1;
              } else {
                var13_ref_hk = var8[var11 + 1];
                if (!param0) {
                  if (param6 == -1) {
                    stackIn_46_0 = (wl.field_d.field_vc != vj.field_b[var11]) ? 0 : 1;
                  } else {
                    stackIn_46_0 = ((255 & wl.field_d.field_Pb[param6]) != var11) ? 0 : 1;
                  }
                  var12 = stackIn_46_0;
                } else {
                  if (!var13_ref_hk.field_xb) {
                    if (var9 != 0) {
                      stackIn_38_0 = (var13_ref_hk.field_Y) ? 1 : 0;
                    } else {
                      stackIn_38_0 = 0;
                    }
                  } else {
                    stackIn_38_0 = 1;
                  }
                  var12 = stackIn_38_0;
                }
              }
              if (var12 != 0) {
                kn.a(param0, param1, param2, param3, param4, param5 + 0, 1 + param6, param7);
                var10_intLifetime1 = 1;
              }
              if (ud.field_b) {
                return;
              }
              var11++;
            }
          }
          if (param5 != 8) {
            kn.a('\007', (byte) -102);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_97_0 = var8_ref;
          stackIn_97_1 = new StringBuilder().append("kn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(')').toString());
        }
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        int var5 = Virogrid.field_F ? 1 : 0;
        if (param1 != -33) {
          return (String) null;
        }
        int var4 = param0.indexOf(param3);
        while (var4 != -1) {
          param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param3.length());
          var4 = param0.indexOf(param3, param2.length() + var4);
        }
        return param0;
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_13_0 = false;
        if (param1 != -69) {
          field_I = 27;
        }
        stackIn_13_0 = ((!(param0 < 48) &&
          !(param0 > 57)) ||
          (!(param0 < 65) &&
          !(param0 > 90)) ||
          (!(param0 < 97) &&
          !(param0 > 122)));
        return stackIn_13_0;
    }

    final static u f(int param0) {
        int var1_int = 0;
        u var2 = null;
        u stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        try {
          var1_int = 0;
          if (param0 != 256) {
            field_L = (String) null;
          }
          while (true) {
            var2 = dm.field_v.a(var1_int, (byte) 35);
            if (var2.field_o) {
              stackIn_5_0 = var2;
              return stackIn_5_0;
            }
            var1_int++;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    kn(fi param0) {
        super(param0.field_l, param0.field_u, param0.field_g, param0.field_m, (ol) null, (cd) null);
        try {
          param0.a(this.field_m, true, 0, 0, this.field_g);
          this.field_H = 256;
          this.field_x = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = "Breaking real-world laws";
        field_B = -1;
        field_K = new int[4];
        field_L = "Mouse over an icon for details";
        field_G = "This password is part of your Player Name, and would be easy to guess";
    }
}
