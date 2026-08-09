/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rg {
    static ul field_d;
    static String field_g;
    static boolean field_e;
    static boolean field_h;
    static boolean field_f;
    static String field_c;
    static ak field_b;
    static String field_a;

    final static int a(String param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
            if (param2 <= -62) {
              if (param1) {
                stackIn_7_0 = a.field_a.c(param0);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = re.field_ib.c(param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 94;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("rg.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(boolean param0, wk param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            if (-1 == (3 & (param1.field_D | (param1.field_F | param1.field_A) | param1.field_H) ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_int = param1.field_A - -(param1.field_D & 3);
                var2_int = var2_int - -4 + -(3 & var2_int);
                var3 = (param1.field_H & 3) + param1.field_F;
                var3 = 4 - ((var3 & 3) - var3);
                if (!param0) {
                  break L1;
                } else {
                  var10 = (String) null;
                  rg.a((String) null, false, (byte) -11);
                  break L1;
                }
              }
              var4 = new int[var3 * var2_int];
              var5 = 0;
              var6 = (3 & param1.field_H) * var2_int + (param1.field_D & 3);
              var7 = 0;
              L2: while (true) {
                if (param1.field_F <= var7) {
                  param1.field_E = var4;
                  param1.field_A = var2_int;
                  param1.field_H = param1.field_H & -4;
                  param1.field_F = var3;
                  param1.field_D = param1.field_D & -4;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= param1.field_A) {
                      var6 = var6 + (var2_int - param1.field_A);
                      var7++;
                      continue L2;
                    } else {
                      incrementValue$0 = var6;
                      var6++;
                      incrementValue$1 = var5;
                      var5++;
                      var4[incrementValue$0] = param1.field_E[incrementValue$1];
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("rg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_d = null;
        if (param0 <= 123) {
            field_e = true;
        }
        field_c = null;
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static int d(int param0) {
        if (param0 != -1900) {
            return 43;
        }
        return new Date().getYear() - -1900;
    }

    final static void a(int param0) {
        String stackIn_10_0 = null;
        String stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ak stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        ak var10 = null;
        int var11 = 0;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            var1_int = hb.field_b + -hl.field_q;
            hl.field_q = vg.field_f - (var1_int >> 336398689);
            lk.field_W = qg.field_a + -(gh.field_hb >> 982971489);
            hb.field_b = var1_int + hl.field_q;
            var3 = -104 % ((26 - param0) / 62);
            var2 = lk.field_W;
            var4 = 0;
            L1: while (true) {
              if (var4 >= an.field_g.length) {
                break L0;
              } else {
                L2: {
                  var5 = kk.field_g[var4];
                  if ((var5 ^ -1) <= -1) {
                    if (var5 != se.field_c.field_e) {
                      var6 = bf.field_Fb;
                      break L2;
                    } else {
                      var6 = o.field_b;
                      break L2;
                    }
                  } else {
                    var6 = vg.field_c;
                    break L2;
                  }
                }
                L3: {
                  var7 = an.field_g[var4];
                  stackIn_10_0 = (String) (var7);

                  if (var5 < 0) {
                    stackIn_11_0 = (String) ((Object) stackIn_10_0);
                    stackIn_11_1 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = (String) ((Object) stackIn_10_0);
                    stackIn_11_1 = 1;
                    break L3;
                  }
                }
                L4: {
                  var8 = rg.a(stackIn_11_0, stackIn_11_1 != 0, (byte) -94);
                  var9 = vg.field_f - (var8 >> -1788706655);
                  if ((var5 ^ -1) <= -1) {
                    L5: {
                      var2 = var2 + tf.field_c;
                      if (var5 == se.field_c.field_e) {
                        stackIn_16_0 = (ak) (field_b);
                        break L5;
                      } else {
                        stackIn_16_0 = qh.field_Xb;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = stackIn_16_0;
                      if (var10 != null) {
                        var10.a(var8 + (h.field_U << 1259944801), -15203, var9 + -h.field_U, (id.field_ac << -1226081567) + ig.field_e, var2);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2 = var2 + id.field_ac;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if ((var5 ^ -1) <= -1) {
                    a.field_a.b(var7, var9, var2 - -rm.field_g, var6, -1);
                    var2 = var2 + (ig.field_e + (tf.field_c + id.field_ac));
                    break L7;
                  } else {
                    re.field_ib.b(var7, var9, var2 - -jk.field_d, var6, -1);
                    var2 = var2 + ck.field_e;
                    break L7;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "rg.F(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wk var6 = null;
        wk var7 = null;
        wk var8 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 30) {
                break L1;
              } else {
                field_b = (ak) null;
                break L1;
              }
            }
            pb.h(243, 197, 369, 143, 16777215);
            pb.a(244, 198, 367, 141, 0);
            if (jb.field_S == null) {
              L2: {
                if (null != wn.field_a) {
                  wn.field_a.a(eb.field_q, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                var6 = jb.field_S[lh.field_r];
                var7 = var6;
                var7 = var6;
                if (var6 == null) {
                  if (wn.field_a == null) {
                    break L3;
                  } else {
                    wn.field_a.a(eb.field_q, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L3;
                  }
                } else {
                  var6.a(245, 199);
                  break L3;
                }
              }
              L4: {
                if (ul.field_g < hh.field_i) {
                  var7 = jb.field_S[oe.field_e];
                  if (var7 == null) {
                    break L4;
                  } else {
                    var2_int = (var7.field_z - -60) * ul.field_g / hh.field_i;
                    var3 = var2_int + -30;
                    if (rf.field_b) {
                      nn.a(245, -256 * var3 / 30, (var7.field_z - var3) * 256 / 30, 199, var7, -1);
                      break L4;
                    } else {
                      nn.a(245, (var7.field_z + -var3) * 256 / 30, var3 * -256 / 30, 199, var7, -1);
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if (null != wn.field_a) {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L6: while (true) {
                    if (jb.field_S.length <= var5) {
                      if (var2 == null) {
                        break L5;
                      } else {
                        wn.field_a.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L5;
                      }
                    } else {
                      var8 = jb.field_S[var5];
                      if (var8 != null) {
                        L7: {
                          L8: {
                            if (365 != var8.field_z) {
                              break L8;
                            } else {
                              if (139 != var8.field_B) {
                                break L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var2 == null) {
                            var2 = Integer.toString(var5);
                            break L7;
                          } else {
                            var2 = (String) (var2) + ", " + var5;
                            break L7;
                          }
                        }
                        var5++;
                        continue L6;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "rg.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = new ul();
        field_g = "Play the game without logging in just yet";
        field_f = true;
        field_a = "Connection restored.";
    }
}
