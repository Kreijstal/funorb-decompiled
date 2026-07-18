/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class l {
    static Calendar field_a;
    static String field_f;
    tg[] field_e;
    static String field_c;
    static int field_b;
    static String field_d;

    final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        tg var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          if (null == ((l) this).field_e) {
            break L0;
          } else {
            if (((l) this).field_e.length == 0) {
              break L0;
            } else {
              if (param1 >= ((l) this).field_e[0].field_m) {
                if (((l) this).field_e[-1 + ((l) this).field_e.length].field_c >= param1) {
                  if (((l) this).field_e.length != 1) {
                    L1: {
                      var4 = 0;
                      if (param2 <= -111) {
                        break L1;
                      } else {
                        field_a = null;
                        break L1;
                      }
                    }
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= ((l) this).field_e.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((l) this).field_e[var5];
                          if (var6.field_m > param1) {
                            break L3;
                          } else {
                            if (param1 > var6.field_c) {
                              break L3;
                            } else {
                              var7 = var6.a((byte) -92, param0);
                              if (var7 != -1) {
                                return var4 + var7;
                              } else {
                                return -1;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_k.length);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return ((l) this).field_e[0].a((byte) -117, param0);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final int c(int param0) {
        int var2 = 0;
        tg[] var3_ref_tg__ = null;
        int var3 = 0;
        int var4 = 0;
        tg var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DungeonAssault.field_K;
          var2 = -1;
          if (((l) this).field_e != null) {
            var3_ref_tg__ = ((l) this).field_e;
            var4 = 0;
            L1: while (true) {
              if (var3_ref_tg__.length <= var4) {
                break L0;
              } else {
                var5 = var3_ref_tg__[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) -90);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        var3 = 119 / ((param0 - 43) / 53);
        return var2;
    }

    final static fa a(ni param0, int param1) {
        fa var2 = null;
        RuntimeException var2_ref = null;
        fa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new fa(param0, (ne) (Object) param0);
            ud.field_v.a((ne) (Object) var2, false);
            wa.field_j.b((qb) (Object) param0);
            stackOut_0_0 = (fa) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("l.K(");
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
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 0 + ')');
        }
        return stackIn_1_0;
    }

    final static vk a(byte param0, boolean param1) {
        vk var2 = new vk(true);
        var2.field_f = param1 ? true : false;
        return var2;
    }

    final int a(String param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param0.length();
            var8 = param1;
            L1: while (true) {
              if (var8 >= var7) {
                if (var5_int <= 0) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_12_0 = (-param2 + param3 << 8) / var5_int;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              } else {
                L2: {
                  var9 = param0.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (62 != var9) {
                      L3: {
                        if (var6 != 0) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var8++;
                      continue L1;
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("l.F(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_15_0;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        tg var6 = null;
        int var7 = DungeonAssault.field_K;
        tg[] var8 = ((l) this).field_e;
        tg[] var3 = var8;
        int var5 = 34 % ((-73 - param0) / 53);
        for (var4 = 0; var4 < var8.length; var4++) {
            var6 = var8[var4];
            if (!(var6.field_k.length <= param1)) {
                return var6.field_k[param1];
            }
            param1 = param1 - (var6.field_k.length - 1);
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        tg var4 = null;
        int var5 = DungeonAssault.field_K;
        for (var3 = param0; var3 < ((l) this).field_e.length; var3++) {
            var4 = ((l) this).field_e[var3];
            if (!(param1 >= var4.field_k.length)) {
                return var3;
            }
            param1 = param1 - (var4.field_k.length - 1);
        }
        return ((l) this).field_e.length;
    }

    final static void b(boolean param0) {
        try {
            if (!(bk.field_b == null)) {
                try {
                    bk.field_b.a(0L, -26296);
                    bk.field_b.a(ra.field_c.field_o, -79, 24, ra.field_c.field_m);
                } catch (Exception exception) {
                }
            }
            ra.field_c.field_o = ra.field_c.field_o + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0) {
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            l.a(116);
            break L0;
          }
        }
        L1: {
          L2: {
            if (kh.field_n == 10) {
              break L2;
            } else {
              if (dh.a(false)) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          tk.a((byte) -86);
          kh.field_n = 11;
          break L1;
        }
        u.field_O = true;
    }

    final static hl a(String param0, boolean param1, long param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        sc stackIn_4_0 = null;
        vl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        vl stackOut_5_0 = null;
        sc stackOut_3_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2 != 0L) {
                break L1;
              } else {
                if (param4 != null) {
                  stackOut_5_0 = new vl(param4, param0);
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = new sc(param2, param0);
            stackIn_4_0 = stackOut_3_0;
            return (hl) (Object) stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("l.M(");
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
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(false).append(',').append(param2).append(',').append(false).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return (hl) (Object) stackIn_6_0;
    }

    final static int d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!ha.b((byte) 47)) {
                L2: {
                  h.field_h.a(-7734, wi.c(hm.field_k, 2113632, lc.field_c), wi.c(eh.field_h, 2113632, hj.field_S));
                  if (!h.field_h.c(-119)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (0 <= h.field_h.field_b) {
                      var2 = op.field_c[h.field_h.field_b];
                      if (var2 == 2) {
                        vk.a((byte) -31);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_16_0 = var2;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                h.field_h.d(0);
                if (h.field_h.c(-100)) {
                  var1_int = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "l.I(" + 4570 + ')');
        }
        return stackIn_17_0;
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 263) {
          L0: {
            L1: {
              if (null == ((l) this).field_e) {
                break L1;
              } else {
                if (((l) this).field_e.length > 0) {
                  stackOut_6_0 = ((l) this).field_e[-1 + ((l) this).field_e.length].field_c - ((l) this).field_e[0].field_m;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return -25;
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[][] param9, int param10, boolean param11, int param12) {
        if (param8 != 0) {
            return;
        }
        try {
            gh.field_i[param3] = new ac(param3, param5, param7, param10, param6, param1, param2, param12, param4, param0, param11, param9);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "l.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    final static boolean a(boolean param0) {
        return nl.field_d > 250;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "All of your raiders escaped.";
        field_c = "You must gain the <%0> Achievement to earn the title of <%1>.";
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_d = "MENU";
    }
}
