/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mb extends ce {
    private int field_n;
    private int field_j;
    static String field_k;
    private int field_h;
    private boolean field_o;
    static int field_p;
    private vm field_q;
    private int field_t;
    private int field_r;
    static he field_s;
    static int field_i;
    static gb field_m;
    private String field_l;

    final void a(int param0, int param1, int param2, int param3, vm param4, String param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        pm var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        pm stackIn_32_0 = null;
        pm stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        pm stackIn_33_0 = null;
        pm stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        pm stackIn_34_0 = null;
        pm stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        pm stackOut_31_0 = null;
        pm stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        pm stackOut_33_0 = null;
        pm stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        pm stackOut_32_0 = null;
        pm stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 != 0) {
                break L1;
              } else {
                param7 = param4.field_u;
                break L1;
              }
            }
            if (param5 != null) {
              L2: {
                if (param4 != ((mb) this).field_q) {
                  break L2;
                } else {
                  if (((mb) this).field_o) {
                    break L2;
                  } else {
                    if (param6 != ((mb) this).field_j) {
                      break L2;
                    } else {
                      if (((mb) this).field_h != param3) {
                        break L2;
                      } else {
                        if (((mb) this).field_r != param7) {
                          break L2;
                        } else {
                          if (param1 != ((mb) this).field_t) {
                            break L2;
                          } else {
                            if (((mb) this).field_n != param2) {
                              break L2;
                            } else {
                              if (((mb) this).field_l == null) {
                                break L2;
                              } else {
                                if (!((mb) this).field_l.equals((Object) (Object) param5)) {
                                  break L2;
                                } else {
                                  return;
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
              L3: {
                ((mb) this).field_t = param1;
                ((mb) this).field_h = param3;
                ((mb) this).field_o = false;
                ((mb) this).field_q = param4;
                ((mb) this).field_r = param7;
                ((mb) this).field_n = param2;
                ((mb) this).field_j = param6;
                ((mb) this).field_l = param5;
                var16 = new String[param4.a(param5, param2) - -1];
                var17 = var16;
                var10 = Math.max(1, param4.a(param5, new int[1], var17));
                if (((mb) this).field_h != 3) {
                  break L3;
                } else {
                  if (var10 != 1) {
                    break L3;
                  } else {
                    ((mb) this).field_h = 1;
                    break L3;
                  }
                }
              }
              L4: {
                ((mb) this).field_d = new pm[var10];
                if (param0 != ((mb) this).field_h) {
                  if (((mb) this).field_h != 1) {
                    if (2 == ((mb) this).field_h) {
                      var11 = -(var10 * ((mb) this).field_r) + (-param4.field_F + ((mb) this).field_t);
                      break L4;
                    } else {
                      L5: {
                        var12 = (-(((mb) this).field_r * var10) + ((mb) this).field_t) / (1 + var10);
                        if (var12 >= 0) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      var11 = param4.field_y - -var12;
                      ((mb) this).field_r = ((mb) this).field_r + var12;
                      break L4;
                    }
                  } else {
                    var11 = (((mb) this).field_t + -(var10 * ((mb) this).field_r) >> 1) + param4.field_y;
                    break L4;
                  }
                } else {
                  var11 = param4.field_y;
                  break L4;
                }
              }
              var12 = 0;
              L6: while (true) {
                if (var10 <= var12) {
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackOut_31_0 = null;
                    stackOut_31_1 = null;
                    stackOut_31_2 = -param4.field_y + var11;
                    stackOut_31_3 = param4.field_F + var11;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    stackIn_33_2 = stackOut_31_2;
                    stackIn_33_3 = stackOut_31_3;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    stackIn_32_3 = stackOut_31_3;
                    if (var13 != null) {
                      stackOut_33_0 = null;
                      stackOut_33_1 = null;
                      stackOut_33_2 = stackIn_33_2;
                      stackOut_33_3 = stackIn_33_3;
                      stackOut_33_4 = var13.length();
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      stackIn_34_2 = stackOut_33_2;
                      stackIn_34_3 = stackOut_33_3;
                      stackIn_34_4 = stackOut_33_4;
                      break L7;
                    } else {
                      stackOut_32_0 = null;
                      stackOut_32_1 = null;
                      stackOut_32_2 = stackIn_32_2;
                      stackOut_32_3 = stackIn_32_3;
                      stackOut_32_4 = 0;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      stackIn_34_2 = stackOut_32_2;
                      stackIn_34_3 = stackOut_32_3;
                      stackIn_34_4 = stackOut_32_4;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new pm(stackIn_34_2, stackIn_34_3, stackIn_34_4);
                    var14.field_b[0] = 0;
                    if (var13 == null) {
                      break L8;
                    } else {
                      L9: {
                        var14.field_b[var13.length()] = param4.a(var13);
                        if (param6 != 3) {
                          stackOut_37_0 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          break L9;
                        } else {
                          stackOut_36_0 = ((mb) this).a(param4.a(var13), param2, 41, var13);
                          stackIn_38_0 = stackOut_36_0;
                          break L9;
                        }
                      }
                      ld.a(stackIn_38_0, (byte) 98, param4, var13, var14);
                      break L8;
                    }
                  }
                  ((mb) this).field_d[var12] = var14;
                  var11 = var11 + param7;
                  var12++;
                  continue L6;
                }
              }
            } else {
              ((mb) this).field_d = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var9;
            stackOut_41_1 = new StringBuilder().append("mb.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param4 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L10;
            }
          }
          L11: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(44);
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param5 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 44 + param6 + 44 + param7 + 41);
        }
    }

    private final pm a(byte param0, String param1, vm param2, int param3) {
        pm var5 = null;
        RuntimeException var5_ref = null;
        pm var6 = null;
        Object stackIn_2_0 = null;
        pm stackIn_4_0 = null;
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
        pm stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 == 53) {
              var6 = new pm(param3 - param2.field_y, param3 - -param2.field_F, param1.length());
              var5 = var6;
              ((mb) this).field_d = new pm[]{var6};
              stackOut_3_0 = (pm) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (pm) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("mb.O(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        de var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ne var5_ref_ne = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        en var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var10 = sc.field_g;
            var2 = var10.l(32270);
            var3 = var10.l(32270);
            if (var2 == 0) {
              var4 = (de) (Object) ke.field_B.g(-76);
              if (var4 != null) {
                L1: {
                  var5 = -var10.field_i + jd.field_q;
                  var14 = var4.field_h;
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var6 = var11;
                  if (var5 <= var14.length << 2) {
                    break L1;
                  } else {
                    var5 = var14.length << 2;
                    break L1;
                  }
                }
                var7 = 0;
                L2: while (true) {
                  if (var5 <= var7) {
                    var4.field_j = true;
                    var4.b(-105);
                    break L0;
                  } else {
                    var6[var7 >> 2] = var6[var7 >> 2] + (var10.l(32270) << (ua.a(var7, 3) << 8));
                    var7++;
                    continue L2;
                  }
                }
              } else {
                le.c((byte) 122);
                return;
              }
            } else {
              if (1 != var2) {
                ic.a((byte) -116, "LR1: " + gf.a((byte) -126), (Throwable) null);
                le.c((byte) 93);
                return;
              } else {
                var4_int = var10.i(64);
                var5_ref_ne = (ne) (Object) n.field_v.g(-106);
                L3: while (true) {
                  L4: {
                    if (var5_ref_ne == null) {
                      break L4;
                    } else {
                      L5: {
                        if (var3 != var5_ref_ne.field_i) {
                          break L5;
                        } else {
                          if (var4_int != var5_ref_ne.field_m) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5_ref_ne = (ne) (Object) n.field_v.a(12684);
                      continue L3;
                    }
                  }
                  if (var5_ref_ne == null) {
                    le.c((byte) 76);
                    return;
                  } else {
                    var5_ref_ne.b(126);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "mb.N(" + 65 + 41);
        }
    }

    final void a(int param0, int param1, String param2, vm param3, byte param4) {
        pm var8 = null;
        pm var9 = null;
        if (!(param2 != null)) {
            ((mb) this).field_d = null;
            return;
        }
        if (((mb) this).field_q == param3) {
            if (((mb) this).field_o) {
                if (0 == ((mb) this).field_j) {
                    if (((mb) this).field_l != null) {
                        if (((mb) this).field_l.equals((Object) (Object) param2)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((mb) this).field_l = param2;
            ((mb) this).field_o = true;
            ((mb) this).field_q = param3;
            ((mb) this).field_j = 0;
            var8 = this.a((byte) 53, param2, param3, param0);
            var9 = var8;
            if (param4 != -2) {
                Object var7 = null;
                ((mb) this).a((vm) null, 45, -44, -47, (String) null);
            }
            var8.field_b[0] = param1;
            var9.field_b[param2.length()] = param3.a(param2) + param1;
            ld.a(0, (byte) -69, param3, param2, var9);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "mb.L(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final void a(vm param0, int param1, int param2, int param3, String param4) {
        pm var8 = null;
        pm var9 = null;
        if (!(param4 != null)) {
            ((mb) this).field_d = null;
            return;
        }
        if (((mb) this).field_q == param0) {
            if (((mb) this).field_o) {
                if (((mb) this).field_j == 2) {
                    if (((mb) this).field_l != null) {
                        if (((mb) this).field_l.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        ((mb) this).field_q = param0;
        ((mb) this).field_o = true;
        ((mb) this).field_j = 2;
        ((mb) this).field_l = param4;
        if (param2 != -1002333144) {
            return;
        }
        try {
            var8 = this.a((byte) 53, param4, param0, param1);
            var9 = var8;
            var9.field_b[0] = -param0.a(param4) + param3;
            var9.field_b[param4.length()] = param3;
            ld.a(0, (byte) 65, param0, param4, var9);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "mb.K(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static void d(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1 == -22370) {
                break L0;
              } else {
                nd discarded$2 = mb.c(-64, 48);
                break L0;
              }
            }
            L1: {
              if (null == ag.field_t) {
                break L1;
              } else {
                L2: {
                  if (0 > param0) {
                    break L2;
                  } else {
                    if (ci.field_d != rc.field_a) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (s.field_b.field_i != 0) {
                    break L3;
                  } else {
                    if (10000L + gf.field_h >= hn.a((byte) 80)) {
                      break L3;
                    } else {
                      s.field_b.i(param1 + 41689, param0);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (s.field_b.field_i > 0) {
                    {
                      L5: {
                        ag.field_t.a(s.field_b.field_i, s.field_b.field_n, (byte) 112, 0);
                        gf.field_h = hn.a((byte) 80);
                        break L5;
                      }
                    }
                    s.field_b.field_i = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            }
            s.field_b.field_i = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static nd c(int param0, int param1) {
        nd[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        nd[] var5 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var5 = gj.a(-17);
        var2 = var5;
        if (param0 == -22094) {
          var3 = 0;
          L0: while (true) {
            if (var5.length > var3) {
              if (param1 != var5[var3].field_c) {
                var3++;
                continue L0;
              } else {
                return var5[var3];
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void c(int param0) {
        if (param0 <= 105) {
          mb.d(78, 82);
          field_m = null;
          field_k = null;
          field_s = null;
          return;
        } else {
          field_m = null;
          field_k = null;
          field_s = null;
          return;
        }
    }

    final void a(int param0, String param1, int param2, int param3, vm param4) {
        pm var8 = null;
        int var7 = 0;
        if (!(param1 != null)) {
            ((mb) this).field_d = null;
            return;
        }
        if (param4 == ((mb) this).field_q) {
            if (((mb) this).field_o) {
                if (((mb) this).field_j == 1) {
                    if (null != ((mb) this).field_l) {
                        if (((mb) this).field_l.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((mb) this).field_o = true;
            if (param3 != 28916) {
                ((mb) this).field_l = null;
            }
            ((mb) this).field_q = param4;
            ((mb) this).field_j = 1;
            var8 = this.a((byte) 53, param1, param4, param0);
            var7 = param4.a(param1);
            var8.field_b[0] = -(var7 >> 1) + param2;
            var8.field_b[param1.length()] = param2 + (var7 >> 1);
            ld.a(0, (byte) -54, param4, param1, var8);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "mb.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    public mb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Weapons";
        field_i = 0;
    }
}
