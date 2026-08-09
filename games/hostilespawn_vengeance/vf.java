/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends ph {
    static bd field_H;
    static String field_G;
    static String field_I;
    static String field_J;

    final static boolean l(int param0) {
        if (param0 != -1) {
            return true;
        }
        return uh.field_o;
    }

    final static void j(int param0) {
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (m.c(param0 ^ -77)) {
              nb.field_F.a(im.field_f, param0 + 8800, true, ul.field_H);
              nb.field_F.e((byte) 114);
              L1: while (true) {
                if (!jn.e((byte) 125)) {
                  L2: {
                    if (param0 == -1) {
                      break L2;
                    } else {
                      field_H = (bd) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  nb.field_F.a(pj.field_e, aj.field_e, 80);
                  continue L1;
                }
              }
            } else {
              L3: {
                if (null == wa.field_q) {
                  break L3;
                } else {
                  if (wa.field_q.field_g) {
                    tb.f((byte) -119);
                    nb.field_F.c(new jh(nb.field_F, hf.field_g), param0 + 118);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "vf.N(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    vf(String param0, mh param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_A = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private vf(String param0, mh param1) {
        this(param0, gf.field_e.field_e, param1);
        try {
            this.field_h = gf.field_e.field_n;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private vf(String param0, nn param1, mh param2) {
        super(param0, param1, param2);
        try {
            this.field_h = gf.field_e.field_n;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var22 = null;
        var18 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var10 = uj.field_p.field_e;
            var11 = uj.field_p.field_g;
            var12 = -101 % ((-33 - param3) / 43);
            var22 = ln.field_a.field_o;
            var14 = param4;
            L1: while (true) {
              if (param5 < var14) {
                break L0;
              } else {
                var7_int = param0 * var14 + param2;
                var9 = 24 * var14 - var11;
                var15 = param2;
                L2: while (true) {
                  if (var15 > param6) {
                    var14++;
                    continue L1;
                  } else {
                    L3: {
                      L4: {
                        var7_int++;
                        var8 = 24 * var15 + -var10;
                        var16 = var22[var7_int];
                        if ((var16 >> 413495304 ^ -1) != -5) {
                          break L4;
                        } else {
                          if (0 != bm.field_c) {
                            break L4;
                          } else {
                            if (2 != rl.field_c) {
                              break L4;
                            } else {
                              if ((ha.field_t ^ -1) == -15) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      if (var16 >= 0) {
                        L5: {
                          var17 = var16 & 255;
                          if (3 == var17) {
                            si.a(var8, var9, 24, 24, 0, 50);
                            break L5;
                          } else {
                            if ((var17 ^ -1) == -18) {
                              si.a(var8, var9, 24, 24, 0, 50);
                              break L5;
                            } else {
                              if (19 == var17) {
                                si.a(var8, var9, 24, 24, 0, 50);
                                break L5;
                              } else {
                                if (3 == var17) {
                                  si.a(var8, var9, 24, 24, 0, 50);
                                  break L5;
                                } else {
                                  if (-35 == (var17 ^ -1)) {
                                    si.a(var8, var9, 24, 24, 0, 50);
                                    break L5;
                                  } else {
                                    if ((var17 ^ -1) == -36) {
                                      si.a(var8, var9, 24, 24, 0, 50);
                                      break L5;
                                    } else {
                                      if (48 == var17) {
                                        si.a(var8, var9, 24, 24, 0, 50);
                                        break L5;
                                      } else {
                                        if (49 == var17) {
                                          si.a(var8, var9, 24, 24, 0, 50);
                                          break L5;
                                        } else {
                                          if ((var17 ^ -1) == -51) {
                                            si.a(var8, var9, 24, 24, 0, 50);
                                            break L5;
                                          } else {
                                            if (var17 == 56) {
                                              si.a(var8, var9, 24, 24, 0, 50);
                                              break L5;
                                            } else {
                                              if (var17 == 64) {
                                                si.a(var8, var9, 24, 24, 0, 50);
                                                break L5;
                                              } else {
                                                if (-82 == (var17 ^ -1)) {
                                                  si.a(var8, var9, 24, 24, 0, 50);
                                                  break L5;
                                                } else {
                                                  if (128 == var17) {
                                                    si.a(var8, var9, 24, 24, 0, 50);
                                                    break L5;
                                                  } else {
                                                    if ((var17 ^ -1) != -132) {
                                                      break L5;
                                                    } else {
                                                      si.a(var8, var9, 24, 24, 0, 50);
                                                      break L5;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ak.field_b[var16].a(var8, var9);
                        break L3;
                      } else {
                        var15++;
                        continue L2;
                      }
                    }
                    var15++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var7), "vf.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static jj a(String[] args, boolean param1) {
        jj var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        jj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var3 = (String[]) null;
                vf.a((String[]) null, false);
                break L1;
              }
            }
            var2 = new jj(false);
            var2.field_e = args;
            stackIn_3_0 = (jj) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("vf.O(");

            if (args == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        if (-2 >= (r.field_a ^ -1)) {
            var2 = pm.field_d;
        } else {
            var2 = 0;
        }
        if (param0 > -3) {
            return;
        }
        if (ln.field_a.field_r[param1]) {
            if (!(!wb.field_Z)) {
                var2 = 0;
            }
        }
        if (!(ln.field_a.field_u[param1] >= var2)) {
            if ((ln.field_a.field_f[param1] ^ -1) == -3) {
                ln.field_a.field_u[param1] = var2;
            }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_A = !this.field_A ? true : false;
        super.a(param0, param1, param2, param3);
    }

    public static void a(byte param0) {
        int var1 = 82 / ((param0 - 27) / 32);
        field_G = null;
        field_I = null;
        field_H = null;
        field_J = null;
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        int var3 = -87 / ((param0 - 36) / 63);
        if (-1 < (param1 ^ -1) || 65536 <= param1) {
            var2 += 16;
            param1 = param1 >>> 16;
        }
        if (param1 >= 256) {
            var2 += 8;
            param1 = param1 >>> 8;
        }
        if (!((param1 ^ -1) > -17)) {
            param1 = param1 >>> 4;
            var2 += 4;
        }
        if (!((param1 ^ -1) > -5)) {
            param1 = param1 >>> 2;
            var2 += 2;
        }
        if (!(-2 < (param1 ^ -1))) {
            var2++;
            param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    final static void k(int param0) {
        int var2 = 0;
        String[] var3 = null;
        ne var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = (ne) ((Object) ei.field_q.g(param0 + 8183));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  el.field_h[0] = cm.a(128, 5, 0, 1);
                  el.field_h[1] = cm.a(128, 5, 1, 1);
                  nh.field_L = cj.a(6, 5);
                  if (param0 == -8255) {
                    break L2;
                  } else {
                    var3 = (String[]) null;
                    vf.a((String[]) null, false);
                    break L2;
                  }
                }
                break L0;
              } else {
                om.a(var4, 5, param0 + 8140);
                var4 = (ne) ((Object) ei.field_q.a(12684));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "vf.P(" + param0 + ')');
        }
    }

    static {
        field_G = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_I = "The lift won't work until I get the power working again.";
        field_J = "Account created successfully!";
    }
}
