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
            if (-1 == (((l) this).field_e.length ^ -1)) {
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
                              if ((var7 ^ -1) != 0) {
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
        fa var2 = new fa(param0, (ne) (Object) param0);
        ud.field_v.a((ne) (Object) var2, false);
        wa.field_j.b((qb) (Object) param0);
        if (param1 != 0) {
            Object var3 = null;
            hl discarded$0 = l.a((String) null, false, -33L, false, (String) null);
        }
        return var2;
    }

    final static vk a(byte param0, boolean param1) {
        vk var2 = new vk(true);
        var2.field_f = param1 ? true : false;
        if (param0 != -49) {
            field_f = null;
        }
        return var2;
    }

    final int a(String param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        var5 = 0;
        var6 = 0;
        var7 = param0.length();
        var8 = param1;
        L0: while (true) {
          if (var8 >= var7) {
            if (-1 <= (var5 ^ -1)) {
              return 0;
            } else {
              return (-param2 + param3 << -1792687608) / var5;
            }
          } else {
            var9 = param0.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
              var8++;
              continue L0;
            } else {
              if (62 != var9) {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L0;
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              } else {
                var6 = 0;
                var8++;
                continue L0;
              }
            }
          }
        }
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
            int discarded$0 = l.d(85);
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (param0 != -1) {
            l.a(116);
        }
        if (-11 != (kh.field_n ^ -1)) {
            // ifne L46
        }
        tk.a((byte) -86);
        kh.field_n = 11;
        u.field_O = true;
    }

    final static hl a(String param0, boolean param1, long param2, boolean param3, String param4) {
        L0: {
          if ((param2 ^ -1L) != -1L) {
            break L0;
          } else {
            if (param4 != null) {
              return (hl) (Object) new vl(param4, param0);
            } else {
              break L0;
            }
          }
        }
        if (!param3) {
          L1: {
            if (!param1) {
              break L1;
            } else {
              field_a = null;
              break L1;
            }
          }
          return (hl) (Object) new ch(param2, param0);
        } else {
          return (hl) (Object) new sc(param2, param0);
        }
    }

    final static int d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (param0 == 4570) {
          var1 = 0;
          L0: while (true) {
            if (!ha.b((byte) 47)) {
              L1: {
                h.field_h.a(-7734, wi.c(hm.field_k, param0 ^ 2118074, lc.field_c), wi.c(eh.field_h, 2113632, hj.field_S));
                if (!h.field_h.c(param0 + -4689)) {
                  break L1;
                } else {
                  var1 = 1;
                  break L1;
                }
              }
              L2: {
                var2 = 0;
                if (var1 == 0) {
                  break L2;
                } else {
                  if (0 <= h.field_h.field_b) {
                    var2 = op.field_c[h.field_h.field_b];
                    if (var2 == 2) {
                      vk.a((byte) -31);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              return var2;
            } else {
              h.field_h.d(param0 + -4570);
              if (h.field_h.c(param0 + -4670)) {
                var1 = 1;
                continue L0;
              } else {
                continue L0;
              }
            }
          }
        } else {
          return -92;
        }
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
                if ((((l) this).field_e.length ^ -1) < -1) {
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
        gh.field_i[param3] = new ac(param3, param5, param7, param10, param6, param1, param2, param12, param4, param0, param11, param9);
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return nl.field_d > 250 ? true : false;
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
