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
        int var5 = 0;
        tg var6 = null;
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        if (null == this.field_e || -1 == (this.field_e.length ^ -1) || param1 < this.field_e[0].field_m) {
            return -1;
        }
        if (this.field_e[-1 + this.field_e.length].field_c < param1) {
            return -1;
        }
        if (this.field_e.length == 1) {
            return this.field_e[0].a((byte) -117, param0);
        }
        int var4 = 0;
        if (param2 > -111) {
            field_a = (Calendar) null;
        }
        for (var5 = 0; var5 < this.field_e.length; var5++) {
            var6 = this.field_e[var5];
            if (var6.field_m <= param1 && param1 <= var6.field_c) {
                var7 = var6.a((byte) -92, param0);
                if ((var7 ^ -1) == 0) {
                    return -1;
                }
                return var4 + var7;
            }
            var4 = var4 + (-1 + var6.field_k.length);
        }
        return -1;
    }

    final int c(int param0) {
        int var2;
        tg[] var3_ref_tg__;
        int var4;
        tg var5;
        int var7;
        int var3;
        int var6;
        L0: {
          var7 = DungeonAssault.field_K;
          var2 = -1;
          if (this.field_e != null) {
            var3_ref_tg__ = this.field_e;
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
        String var3 = null;
        fa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new fa(param0, param0);
              ud.field_v.a(var2, false);
              wa.field_j.b(param0);
              if (param1 == 0) {
                break L1;
              } else {
                var3 = (String) null;
                l.a((String) null, false, -33L, false, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = (fa) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("l.K(");

            if (param0 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static vk a(byte param0, boolean param1) {
        vk var2 = new vk(true);
        var2.field_f = param1 ? true : false;
        if (param0 != -49) {
            field_f = (String) null;
        }
        return var2;
    }

    final int a(String param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param0.length();
            var8 = param1;
            L1: while (true) {
              if (var8 >= var7) {
                if (-1 <= (var5_int ^ -1)) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_17_0 = (-param2 + param3 << -1792687608) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var9 = param0.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (62 != var9) {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L2;
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
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
          L3: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("l.F(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_19_0;
        }
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        tg var6 = null;
        int var7 = DungeonAssault.field_K;
        tg[] var8 = this.field_e;
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
        for (var3 = param0; var3 < this.field_e.length; var3++) {
            var4 = this.field_e[var3];
            if (!(param1 >= var4.field_k.length)) {
                return var3;
            }
            param1 = param1 - (var4.field_k.length - 1);
        }
        return this.field_e.length;
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
            if (param0) {
                return;
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
        if (param0 != -24) {
            l.d(85);
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (param0 != -1) {
            l.a(116);
        }
        if (-11 == (kh.field_n ^ -1) || !dh.a(false)) {
            tk.a((byte) -86);
            kh.field_n = 11;
        }
        u.field_O = true;
    }

    final static hl a(String param0, boolean param1, long param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        sc stackIn_5_0 = null;
        vl stackIn_7_0 = null;
        ch stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1L) != -1L) {
                break L1;
              } else {
                if (param4 != null) {
                  stackIn_7_0 = new vl(param4, param0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param3) {
              L2: {
                if (!param1) {
                  break L2;
                } else {
                  field_a = (Calendar) null;
                  break L2;
                }
              }
              stackIn_11_0 = new ch(param2, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_5_0 = new sc(param2, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("l.M(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hl) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (hl) ((Object) stackIn_7_0);
          } else {
            return (hl) ((Object) stackIn_11_0);
          }
        }
    }

    final static int d(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 == 4570) {
              var1_int = 0;
              L1: while (true) {
                if (!ha.b((byte) 47)) {
                  L2: {
                    h.field_h.a(-7734, wi.c(hm.field_k, param0 ^ 2118074, lc.field_c), wi.c(eh.field_h, 2113632, hj.field_S));
                    if (!h.field_h.c(param0 + -4689)) {
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
                  stackIn_18_0 = var2;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  h.field_h.d(param0 + -4570);
                  if (h.field_h.c(param0 + -4670)) {
                    var1_int = 1;
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = -92;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "l.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_18_0;
        }
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == 263) {
          L0: {
            L1: {
              if (null == this.field_e) {
                break L1;
              } else {
                if ((this.field_e.length ^ -1) < -1) {
                  stackIn_7_0 = this.field_e[-1 + this.field_e.length].field_c - this.field_e[0].field_m;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 0;
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
            throw vk.a((Throwable) ((Object) runtimeException), "l.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return nl.field_d > 250 ? true : false;
    }

    static {
        field_f = "All of your raiders escaped.";
        field_c = "You must gain the <%0> Achievement to earn the title of <%1>.";
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_d = "MENU";
    }
}
