/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class od {
    static boolean field_k;
    static boolean field_s;
    static String field_d;
    static sb field_j;
    static int field_q;
    static boolean field_n;
    static ed field_b;
    private cn field_o;
    private int field_a;
    private int field_m;
    private ce field_e;
    private int field_g;
    private int field_r;
    private ed field_l;
    private int field_h;
    private oe field_f;
    private Random field_i;
    private int field_c;
    private int field_p;

    private final void a(boolean param0, int param1, int param2) {
        oc var5 = null;
        int var6 = EscapeVector.field_A;
        if (((od) this).field_o.a(-98)) {
            return;
        }
        hg var4 = ((od) this).field_o.a(false);
        while (var4 != null) {
            var5 = (oc) (Object) var4;
            var5.a(99, param2, param1);
            var4 = ((od) this).field_o.b((byte) 70);
        }
    }

    final static void f(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            var1_int = al.field_f[0];
            var3 = 0;
            var2 = 1;
            L1: while (true) {
              if (al.field_f.length <= var2) {
                break L0;
              } else {
                var4 = al.field_f[var2];
                qg.a(bc.field_f, var2 << 4, bc.field_f, var1_int, var4);
                var1_int = var1_int + var4;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "od.B(" + 46 + ')');
        }
    }

    private final void a(byte param0) {
        ((od) this).field_l = new ed(((od) this).field_m, ((od) this).field_m);
        int[] var8 = new int[4];
        int[] var2 = var8;
        em.a(var8);
        ((od) this).field_l.g();
        int var3 = ((od) this).field_m / 2;
        int var4 = ((od) this).field_m / 2;
        int var5 = ((od) this).field_m / 2;
        int var6 = 1;
        em.d(var3, var4, var5, var6);
        if (!(md.field_D == null)) {
            md.field_D.a(125);
        }
        int var7 = -12;
        em.b(var8);
    }

    final static void b(int param0) {
        if (param0 != 2) {
            Object var2 = null;
            od.a((java.awt.Component) null, (byte) -63);
        }
        dj.a(0, -14, 0);
    }

    private final int a(boolean param0, int param1) {
        int var4 = EscapeVector.field_A;
        int var3 = ((od) this).field_f.field_n;
        while (param1 < 0) {
            param1 = param1 + var3;
        }
        while (var3 <= param1) {
            param1 = param1 - var3;
        }
        this.a(-66);
        return param1;
    }

    private final void a(int param0) {
        int var2 = 640;
        int var3 = 480;
        int var4 = (((od) this).field_f.field_H >> 16) + -(var2 / 2);
        int var5 = (((od) this).field_f.field_p >> 16) - var3 / 2;
        int var6 = this.a(var2, 1) + var4;
        var6 = this.a(false, var6);
        int var7 = this.a(var3, 1) + var5;
        if (!(var7 >= 0)) {
            var7 = 0;
        }
        int var8 = ((od) this).field_f.field_Fb;
        if (var7 >= var8) {
            var7 = -((od) this).field_l.field_z + (-1 + var8);
        }
        hh var9 = sf.field_e[0];
        oc var10 = new oc(((od) this).field_l, var6, var7, var9);
        ((od) this).field_o.a(-12328, (hg) (Object) var10);
    }

    final static int a(byte param0, boolean param1, String param2, sn param3, sn param4, int param5, int param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_4_0 = 0;
        n stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        n stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        n stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_11_2 = null;
        n stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        n stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        n stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        n stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        n stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        n stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        n stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        n stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        n stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        int stackOut_31_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var14 = param4.a(-106);
              var8 = param3.a(-78);
              if (null != pg.field_c) {
                break L1;
              } else {
                if (sl.a(false, (byte) 0)) {
                  break L1;
                } else {
                  stackOut_3_0 = -1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                }
              }
            }
            L2: {
              if (al.field_d == sf.field_d) {
                L3: {
                  sc.field_g = null;
                  om.field_c.field_m = 0;
                  if (param2 != null) {
                    L4: {
                      var9 = 0;
                      qj.field_a.field_m = 0;
                      if (!param1) {
                        break L4;
                      } else {
                        var9 = var9 | 1;
                        break L4;
                      }
                    }
                    L5: {
                      qj.field_a.a((byte) 123, gk.field_a.nextInt());
                      qj.field_a.a((byte) 124, gk.field_a.nextInt());
                      qj.field_a.a((byte) 100, var14);
                      qj.field_a.a((byte) 100, var8);
                      var15 = (CharSequence) (Object) param2;
                      qj.field_a.a((byte) 100, mm.a(0, var15));
                      qj.field_a.h(-116, param5);
                      qj.field_a.f(param6, -123);
                      qj.field_a.f(var9, -123);
                      om.field_c.f(18, -123);
                      om.field_c.field_m = om.field_c.field_m + 2;
                      var10 = om.field_c.field_m;
                      var11_ref_String = tf.a(-1, oc.d((byte) -110));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    om.field_c.a(var11_ref_String, 105);
                    bn.a(0, (n) (Object) om.field_c, qj.field_a, q.field_O, cf.field_c);
                    om.field_c.i(om.field_c.field_m + -var10, 32614);
                    break L3;
                  } else {
                    L6: {
                      qj.field_a.field_m = 0;
                      qj.field_a.a((byte) 124, gk.field_a.nextInt());
                      qj.field_a.a((byte) 127, gk.field_a.nextInt());
                      stackOut_8_0 = qj.field_a;
                      stackOut_8_1 = 100;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (!param4.b(114)) {
                        stackOut_10_0 = (n) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = "";
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L6;
                      } else {
                        stackOut_9_0 = (n) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = (String) var14;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L6;
                      }
                    }
                    L7: {
                      ((n) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_11_2);
                      stackOut_11_0 = qj.field_a;
                      stackOut_11_1 = 100;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (param3.b(88)) {
                        stackOut_13_0 = (n) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = (String) var8;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        break L7;
                      } else {
                        stackOut_12_0 = (n) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = "";
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        break L7;
                      }
                    }
                    ((n) (Object) stackIn_14_0).a((byte) stackIn_14_1, stackIn_14_2);
                    om.field_c.f(16, -123);
                    om.field_c.field_m = om.field_c.field_m + 1;
                    var9 = om.field_c.field_m;
                    bn.a(0, (n) (Object) om.field_c, qj.field_a, q.field_O, cf.field_c);
                    om.field_c.e(-38, -var9 + om.field_c.field_m);
                    break L3;
                  }
                }
                rn.a(-1, 30785);
                al.field_d = cn.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (cn.field_a != al.field_d) {
                break L8;
              } else {
                if (!bo.a(30000, 1)) {
                  break L8;
                } else {
                  L9: {
                    var9 = om.field_g.e(0);
                    om.field_g.field_m = 0;
                    if (100 > var9) {
                      break L9;
                    } else {
                      if (var9 > 105) {
                        break L9;
                      } else {
                        jf.field_I = new String[-100 + var9];
                        al.field_d = mf.field_k;
                        break L8;
                      }
                    }
                  }
                  if (var9 == 248) {
                    se.a((byte) 81, oc.d((byte) -108));
                    ca.field_a = w.field_fb;
                    nm.a(16);
                    e.field_c = false;
                    stackOut_31_0 = var9;
                    stackIn_32_0 = stackOut_31_0;
                    return stackIn_32_0;
                  } else {
                    if (var9 == 99) {
                      boolean discarded$1 = bo.a(30000, uc.b(92));
                      sc.field_g = new Boolean(va.a((n) (Object) om.field_g, true));
                      om.field_g.field_m = 0;
                      break L8;
                    } else {
                      hi.field_r = -1;
                      cd.field_v = var9;
                      al.field_d = mh.field_h;
                      break L8;
                    }
                  }
                }
              }
            }
            L10: {
              if (al.field_d != mf.field_k) {
                break L10;
              } else {
                var9 = 2;
                if (bo.a(30000, var9)) {
                  var10 = om.field_g.f(1952);
                  om.field_g.field_m = 0;
                  if (bo.a(30000, var10)) {
                    var11 = jf.field_I.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        nm.a(16);
                        e.field_c = false;
                        stackOut_41_0 = var11 + 100;
                        stackIn_42_0 = stackOut_41_0;
                        return stackIn_42_0;
                      } else {
                        jf.field_I[var12] = om.field_g.f((byte) 125);
                        var12++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (al.field_d != mh.field_h) {
                break L12;
              } else {
                if (!ll.d(10550)) {
                  break L12;
                } else {
                  L13: {
                    if (cd.field_v != 255) {
                      ca.field_a = om.field_g.c(false);
                      break L13;
                    } else {
                      var9_ref_String = om.field_g.d(-15208);
                      if (var9_ref_String != null) {
                        ag.a(var9_ref_String, (byte) 30, oc.d((byte) -83));
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  nm.a(16);
                  e.field_c = false;
                  stackOut_50_0 = cd.field_v;
                  stackIn_51_0 = stackOut_50_0;
                  return stackIn_51_0;
                }
              }
            }
            L14: {
              if (pg.field_c == null) {
                if (!e.field_c) {
                  var9 = ej.field_b;
                  ej.field_b = sj.field_i;
                  sj.field_i = var9;
                  e.field_c = true;
                  break L14;
                } else {
                  L15: {
                    if (30000L < un.e(64655)) {
                      ca.field_a = fl.field_l;
                      break L15;
                    } else {
                      ca.field_a = wk.field_a;
                      break L15;
                    }
                  }
                  e.field_c = false;
                  stackOut_58_0 = 249;
                  stackIn_59_0 = stackOut_58_0;
                  return stackIn_59_0;
                }
              } else {
                break L14;
              }
            }
            stackOut_61_0 = -1;
            stackIn_62_0 = stackOut_61_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var7;
            stackOut_63_1 = new StringBuilder().append("od.N(").append(-32).append(',').append(param1).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param2 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L16;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L16;
            }
          }
          L17: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param3 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L17;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L17;
            }
          }
          L18: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param4 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L18;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L18;
            }
          }
          throw t.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_62_0;
    }

    final void c(int param0) {
        hj var3 = null;
        hh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        this.a(true);
        if (!(((od) this).field_f.field_a)) {
            return;
        }
        int var2 = ((od) this).field_f.field_X;
        if (!(((od) this).field_g < var2)) {
            ((od) this).field_e = wc.field_d;
            ((od) this).field_r = 64;
        }
        if (!(((od) this).field_p >= var2)) {
            return;
        }
        var2 = -var2 + ((od) this).field_p;
        if (param0 == ~(var2 % ((od) this).field_h)) {
            this.a(-110);
        }
        this.e(50);
        var2 = ((od) this).field_f.field_X;
        if (!(((od) this).field_c < var2)) {
            ((od) this).field_a = ((od) this).field_a + 1;
        }
        if (!(((od) this).field_c >= ((od) this).field_a)) {
            ((od) this).field_a = ((od) this).field_c;
        }
        if (1 == ((od) this).field_a) {
            var3 = pl.field_n;
            var4 = vn.field_c;
            var5 = 100;
            var6 = qm.field_c * 6144 / 64;
            var7 = 8192;
            var3.a(var4, var5, var6, var7);
        }
    }

    private final void e(int param0) {
        oc var3_ref = null;
        Object var3 = null;
        int var4 = EscapeVector.field_A;
        if (!(!((od) this).field_o.a(-120))) {
            return;
        }
        hg var2 = ((od) this).field_o.a(false);
        while (var2 != null) {
            var3_ref = (oc) (Object) var2;
            var3_ref.a();
            var2 = ((od) this).field_o.b((byte) 70);
        }
        var2 = ((od) this).field_o.a(false);
        while (var2 != null) {
            var3_ref = (oc) (Object) var2;
            if (!(!var3_ref.field_B)) {
                var3_ref.c((byte) -119);
                break;
            }
            var2 = ((od) this).field_o.b((byte) 70);
        }
    }

    private final int a(int param0, int param1) {
        long var3 = (long)((od) this).field_i.nextInt();
        if (var3 < 0L) {
            var3 = -var3;
        }
        var3 = (long)(param0 - 1) * var3 / 2147483647L;
        return (int)var3;
    }

    final void a(byte param0, int param1, int param2) {
        this.a(true, param2, param1);
        if (param0 != -87) {
            ce discarded$0 = ((od) this).b(true);
        }
        if (((od) this).field_a <= 0) {
            return;
        }
        int var4 = 256;
        int var5 = ((od) this).field_a * var4 / ((od) this).field_c;
        int var6 = 640;
        int var7 = 480;
        int var8 = 16777215;
        em.a(0, 0, var6, var7, var8, var5);
    }

    final ce b(boolean param0) {
        if (!param0) {
            field_d = null;
        }
        return ((od) this).field_e;
    }

    private final void a(boolean param0) {
        int var2 = ((od) this).field_f.field_a ? 1 : 0;
        int var3 = ((od) this).field_f.field_X;
        var2 = (var3 > ((od) this).field_g ? 1 : 0) & var2;
        int var4 = qm.field_c * 6144 / 64;
        int var5 = 8192;
        if (var2 == 0) {
            var4 = 0;
            var5 = 0;
        }
        hl var6 = ((od) this).field_f.field_lc;
        if (!(var6 != null)) {
            return;
        }
        var6.f(var4, var5);
    }

    final int c(boolean param0) {
        if (!param0) {
            ((od) this).field_m = -125;
        }
        return ((od) this).field_r;
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.removeMouseListener((java.awt.event.MouseListener) (Object) om.field_b);
            param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) om.field_b);
            int var2_int = 100 % ((-57 - param1) / 62);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) om.field_b);
            vj.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "od.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_d = null;
        field_j = null;
        field_b = null;
    }

    od(oe param0) {
        int var2_int = 0;
        ((od) this).field_o = new cn();
        ((od) this).field_g = 1500;
        ((od) this).field_r = -1;
        ((od) this).field_m = 32;
        ((od) this).field_p = 500;
        ((od) this).field_h = 50;
        ((od) this).field_e = null;
        ((od) this).field_c = 50;
        try {
            ((od) this).field_f = param0;
            this.a((byte) 110);
            var2_int = (int)td.b(128);
            ((od) this).field_i = new Random((long)var2_int);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "od.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_n = false;
        field_q = -1;
    }
}
