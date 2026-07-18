/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gd extends rj {
    cn field_K;
    nn field_M;
    cn field_H;
    int field_C;
    static String field_D;
    static String field_J;
    static qk field_G;
    static cn field_A;
    cn field_z;
    cn field_I;
    int field_L;
    boolean field_F;
    static cn field_E;
    boolean field_B;
    cn field_N;

    private gd(cn param0, cn param1, cn param2, cn param3, cn param4, int param5, int param6, int param7) {
        super(param5, param6, param0.field_y, param0.field_v, param7);
        try {
            ((gd) this).field_H = param3;
            ((gd) this).field_K = param0;
            ((gd) this).field_F = true;
            ((gd) this).field_I = param2;
            ((gd) this).field_z = param1;
            ((gd) this).field_N = param4;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "gd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int stackIn_6_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        var12 = DungeonAssault.field_K;
        if (((gd) this).field_F) {
          var4 = param0 + ((gd) this).field_t;
          var5 = ((gd) this).field_i - -param2;
          if (!((gd) this).field_w) {
            ((gd) this).field_K.h(var4, var5);
            if (param1 != 8187) {
              var13 = null;
              o discarded$6 = gd.a(31, (cf) null);
              return;
            } else {
              return;
            }
          } else {
            L0: {
              if (((gd) this).field_B) {
                stackOut_5_0 = mo.field_a;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = ((gd) this).field_L;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            L1: {
              var6 = stackIn_6_0;
              var7 = var6 + -((gd) this).field_C >> 2;
              if (var7 > 64) {
                var7 = 64;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = var7 - mo.field_a + ((gd) this).field_L;
            if (!((gd) this).field_B) {
              if (0 >= var8) {
                L2: {
                  if (this != (Object) (Object) wi.field_ob) {
                    stackOut_31_0 = ((gd) this).field_p;
                    stackIn_32_0 = stackOut_31_0;
                    break L2;
                  } else {
                    stackOut_30_0 = mo.field_a;
                    stackIn_32_0 = stackOut_30_0;
                    break L2;
                  }
                }
                L3: {
                  var9 = stackIn_32_0;
                  var7 = -((gd) this).field_m + var9 >> 2;
                  if (var7 > 64) {
                    var7 = 64;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var8 = var7 + (-mo.field_a - -((gd) this).field_p);
                if (this != (Object) (Object) wi.field_ob) {
                  if (0 >= var8) {
                    ((gd) this).field_K.h(var4, var5);
                    if (param1 != 8187) {
                      var13 = null;
                      o discarded$7 = gd.a(31, (cf) null);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L4: {
                      if (this != (Object) (Object) wi.field_ob) {
                        ((gd) this).field_K.h(var4, param2 + ((gd) this).field_i);
                        var10 = var8;
                        ((gd) this).field_z.d(var4, var5, 4 * var10);
                        break L4;
                      } else {
                        ((gd) this).field_z.h(var4, var5);
                        var10 = var7;
                        break L4;
                      }
                    }
                    L5: {
                      var11 = (int)((double)var10 * (te.c(mo.field_a, 1, 0.125) + 2.0));
                      if (var11 < 0) {
                        var11 = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((gd) this).field_I.b(var4, var5, var11);
                    if (param1 != 8187) {
                      var13 = null;
                      o discarded$8 = gd.a(31, (cf) null);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: {
                    if (this != (Object) (Object) wi.field_ob) {
                      ((gd) this).field_K.h(var4, param2 + ((gd) this).field_i);
                      var10 = var8;
                      ((gd) this).field_z.d(var4, var5, 4 * var10);
                      break L6;
                    } else {
                      ((gd) this).field_z.h(var4, var5);
                      var10 = var7;
                      break L6;
                    }
                  }
                  L7: {
                    var11 = (int)((double)var10 * (te.c(mo.field_a, 1, 0.125) + 2.0));
                    if (var11 < 0) {
                      var11 = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((gd) this).field_I.b(var4, var5, var11);
                  if (param1 != 8187) {
                    var13 = null;
                    o discarded$9 = gd.a(31, (cf) null);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L8: {
                  ((gd) this).field_H.h(var4, var5);
                  if (((gd) this).field_B) {
                    var9 = var7;
                    break L8;
                  } else {
                    ((gd) this).field_K.h(var4, param2 + ((gd) this).field_i);
                    var9 = var8;
                    ((gd) this).field_H.d(var4, var5, 4 * var9);
                    break L8;
                  }
                }
                L9: {
                  var10 = (int)((double)var9 * (2.0 + te.c(mo.field_a, 1, 0.125)));
                  if (var10 >= 0) {
                    break L9;
                  } else {
                    var10 = 0;
                    break L9;
                  }
                }
                ((gd) this).field_N.b(var4, var5, var10);
                if (param1 != 8187) {
                  var13 = null;
                  o discarded$10 = gd.a(31, (cf) null);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L10: {
                ((gd) this).field_H.h(var4, var5);
                if (((gd) this).field_B) {
                  var9 = var7;
                  break L10;
                } else {
                  ((gd) this).field_K.h(var4, param2 + ((gd) this).field_i);
                  var9 = var8;
                  ((gd) this).field_H.d(var4, var5, 4 * var9);
                  break L10;
                }
              }
              L11: {
                var10 = (int)((double)var9 * (2.0 + te.c(mo.field_a, 1, 0.125)));
                if (var10 >= 0) {
                  break L11;
                } else {
                  var10 = 0;
                  break L11;
                }
              }
              ((gd) this).field_N.b(var4, var5, var10);
              if (param1 != 8187) {
                var13 = null;
                o discarded$11 = gd.a(31, (cf) null);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static o a(int param0, cf param1) {
        fa var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        o stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        o stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 64) {
                break L1;
              } else {
                var3 = null;
                o discarded$2 = gd.a(119, (cf) null);
                break L1;
              }
            }
            var2 = cf.a(100, param1.field_e, param1.field_a);
            stackOut_2_0 = new o(var2, param1.field_a);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("gd.L(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        L0: {
          g.field_Hb = param0;
          if (fc.a(mn.field_b, (byte) -123)) {
            bf.field_f[mn.field_b].c();
            break L0;
          } else {
            break L0;
          }
        }
        o discarded$2 = gd.a(64, mh.field_f);
        te.b();
        co.field_G = new vj(0, param1, 640, 480, 64);
        mn.field_b = param2;
        dc.field_z = param2;
        bd.field_f = 0;
        if (fc.a(dc.field_z, (byte) -123)) {
          System.gc();
          System.gc();
          System.gc();
          bf.field_f[dc.field_z].b(param3);
          if (dc.field_z != 12) {
            return;
          } else {
            m.a(param1 ^ 115, param3);
            return;
          }
        } else {
          if (dc.field_z == -1) {
            if (null != ik.field_e) {
              ik.field_e.f((byte) -127);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(boolean param0, cn param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          ((gd) this).field_z = param1;
          ((gd) this).field_K = param1;
          super.a(false, ((gd) this).field_K.field_y, ((gd) this).field_K.field_v);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("gd.J(").append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
            ((gd) this).field_F = true;
            throw new RuntimeException("Unsupported");
        }
        throw new RuntimeException("Unsupported");
    }

    final static int a(Random param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
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
            var2_int = uj.a(param0, 37, h.field_j);
            var3 = wl.field_e[var2_int];
            int fieldTemp$2 = h.field_j - 1;
            h.field_j = h.field_j - 1;
            wl.field_e[var2_int] = wl.field_e[fieldTemp$2];
            stackOut_0_0 = var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("gd.P(");
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
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + true + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, byte param1, int param2) {
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (param1 < -59) {
          super.a(param0, (byte) -113, param2);
          if (!((gd) this).field_B) {
            if (null != ((gd) this).field_M) {
              ((gd) this).field_M.a((gd) this, -256);
              return;
            } else {
              ((gd) this).field_C = mo.field_a;
              ((gd) this).field_B = true;
              return;
            }
          } else {
            if (((gd) this).field_M != null) {
              ((gd) this).field_M.a((byte) -86, (gd) this);
              return;
            } else {
              ((gd) this).field_L = mo.field_a;
              ((gd) this).field_B = false;
              return;
            }
          }
        } else {
          ((gd) this).field_K = null;
          super.a(param0, (byte) -113, param2);
          if (!((gd) this).field_B) {
            if (null != ((gd) this).field_M) {
              ((gd) this).field_M.a((gd) this, -256);
              return;
            } else {
              ((gd) this).field_C = mo.field_a;
              ((gd) this).field_B = true;
              return;
            }
          } else {
            if (((gd) this).field_M != null) {
              ((gd) this).field_M.a((byte) -86, (gd) this);
              return;
            } else {
              ((gd) this).field_L = mo.field_a;
              ((gd) this).field_B = false;
              return;
            }
          }
        }
    }

    gd(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, param4);
        ((gd) this).field_F = true;
    }

    gd(cn param0, cn param1, cn param2, cn param3, cn param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 0);
    }

    public static void e() {
        field_A = null;
        field_D = null;
        field_J = null;
        field_E = null;
        field_G = null;
    }

    final void a(cn param0, cn param1, cn param2, cn param3, byte param4, cn param5) {
        this.a(true, param1);
        ((gd) this).field_H = param0;
        ((gd) this).field_z = param3;
        ((gd) this).field_N = param2;
        if (param4 <= 101) {
            return;
        }
        try {
            ((gd) this).field_I = param5;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "gd.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Connection restored.";
        field_D = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
