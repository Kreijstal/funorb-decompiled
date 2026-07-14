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
        ((gd) this).field_H = param3;
        ((gd) this).field_K = param0;
        ((gd) this).field_F = true;
        ((gd) this).field_I = param2;
        ((gd) this).field_z = param1;
        ((gd) this).field_N = param4;
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
              var7 = var6 + -((gd) this).field_C >> -738519646;
              if ((var7 ^ -1) < -65) {
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
                  var7 = -((gd) this).field_m + var9 >> -1930288894;
                  if ((var7 ^ -1) < -65) {
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
                      if ((var11 ^ -1) > -1) {
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
                    if ((var11 ^ -1) > -1) {
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
        Object var3 = null;
        if (param0 != 64) {
          var3 = null;
          o discarded$2 = gd.a(119, (cf) null);
          var2 = cf.a(100, param1.field_e, param1.field_a);
          return new o(var2, param1.field_a);
        } else {
          var2 = cf.a(100, param1.field_e, param1.field_a);
          return new o(var2, param1.field_a);
        }
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
          if (-13 != (dc.field_z ^ -1)) {
            return;
          } else {
            m.a(param1 ^ 115, param3);
            return;
          }
        } else {
          if ((dc.field_z ^ -1) == 0) {
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
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((gd) this).field_z = param1;
          ((gd) this).field_K = param1;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        super.a(stackIn_3_1 != 0, ((gd) this).field_K.field_y, ((gd) this).field_K.field_v);
        if (!param0) {
          ((gd) this).a(127, (byte) 31, -35);
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
            ((gd) this).field_F = true;
            throw new RuntimeException("Unsupported");
        }
        throw new RuntimeException("Unsupported");
    }

    final static int a(Random param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        if (!param1) {
          field_G = null;
          var2 = uj.a(param0, 37, h.field_j);
          var3 = wl.field_e[var2];
          h.field_j = h.field_j - 1;
          wl.field_e[var2] = wl.field_e[h.field_j - 1];
          return var3;
        } else {
          var2 = uj.a(param0, 37, h.field_j);
          var3 = wl.field_e[var2];
          h.field_j = h.field_j - 1;
          wl.field_e[var2] = wl.field_e[h.field_j - 1];
          return var3;
        }
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

    public static void e(int param0) {
        field_A = null;
        field_D = null;
        field_J = null;
        field_E = null;
        if (param0 != 0) {
          gd.a(-53, 48, -37, false);
          field_G = null;
          return;
        } else {
          field_G = null;
          return;
        }
    }

    final void a(cn param0, cn param1, cn param2, cn param3, byte param4, cn param5) {
        this.a(true, param1);
        ((gd) this).field_H = param0;
        ((gd) this).field_z = param3;
        ((gd) this).field_N = param2;
        if (param4 <= 101) {
          return;
        } else {
          ((gd) this).field_I = param5;
          return;
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
