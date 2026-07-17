/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class un {
    af field_B;
    qe field_t;
    private int field_E;
    boolean field_g;
    int field_v;
    static String field_i;
    private boolean field_p;
    static String field_h;
    int field_u;
    private int field_D;
    private int field_j;
    private int field_r;
    private int field_w;
    boolean field_b;
    private int field_x;
    int field_C;
    int field_d;
    private int field_n;
    boolean field_m;
    boolean field_k;
    int field_a;
    boolean field_c;
    int field_A;
    int field_e;
    private int field_o;
    private int[] field_F;
    private int field_f;
    int field_l;
    private int field_z;
    static int field_q;
    private boolean field_y;
    private int field_s;

    private final void a(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = Chess.field_G;
          if (2 != wh.field_f) {
            ((un) this).field_w = -1;
            ((un) this).field_n = -1;
            break L0;
          } else {
            L1: {
              if (-1 == ((un) this).field_w) {
                break L1;
              } else {
                if (-1 != ((un) this).field_n) {
                  L2: while (true) {
                    if (-hn.field_k + ((un) this).field_w >= -16) {
                      L3: while (true) {
                        if (-hn.field_k + ((un) this).field_w <= 16) {
                          L4: while (true) {
                            if (((un) this).field_n + -rf.field_b >= -16) {
                              L5: while (true) {
                                if (16 >= -rf.field_b + ((un) this).field_n) {
                                  break L0;
                                } else {
                                  ((un) this).field_t.f(-4083);
                                  ((un) this).field_n = ((un) this).field_n - 8;
                                  continue L5;
                                }
                              }
                            } else {
                              ((un) this).field_t.j(117);
                              ((un) this).field_n = ((un) this).field_n + 8;
                              continue L4;
                            }
                          }
                        } else {
                          ((un) this).field_t.l(-28628);
                          ((un) this).field_w = ((un) this).field_w - 8;
                          continue L3;
                        }
                      }
                    } else {
                      ((un) this).field_t.i(40);
                      ((un) this).field_w = ((un) this).field_w + 8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            ((un) this).field_w = hn.field_k;
            ((un) this).field_n = rf.field_b;
            break L0;
          }
        }
    }

    final void c(int param0, boolean param1) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        eb stackIn_7_0 = null;
        eb stackIn_7_1 = null;
        eb stackIn_8_0 = null;
        eb stackIn_8_1 = null;
        eb stackIn_9_0 = null;
        eb stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        eb stackOut_6_0 = null;
        eb stackOut_6_1 = null;
        eb stackOut_8_0 = null;
        eb stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        eb stackOut_7_0 = null;
        eb stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        L0: {
          if (s.field_O > 0) {
            if (20 > r.field_Eb % 40) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_6_0;
          wb.f(0, param0 + uh.field_m.field_wb, 640, 480, 1);
          stackOut_6_0 = qh.field_b;
          stackOut_6_1 = qh.field_b;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          if (var3 == 0) {
            stackOut_8_0 = (eb) (Object) stackIn_8_0;
            stackOut_8_1 = (eb) (Object) stackIn_8_1;
            stackOut_8_2 = -2147483647;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            break L1;
          } else {
            stackOut_7_0 = (eb) (Object) stackIn_7_0;
            stackOut_7_1 = (eb) (Object) stackIn_7_1;
            stackOut_7_2 = -1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            break L1;
          }
        }
        stackIn_9_1.field_N = stackIn_9_2;
        stackIn_9_0.field_H = stackIn_9_2;
        qh.field_b.d((byte) -124);
    }

    private final String e() {
        Object var2 = null;
        boolean[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = Chess.field_G;
            var2 = null;
            if (!((un) this).field_b) {
              break L1;
            } else {
              if (((un) this).field_a == ((un) this).field_B.field_l) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          if (-1 == ((un) this).field_t.b(0)) {
            break L0;
          } else {
            var3 = ((un) this).field_t.field_d;
            var4 = 0;
            var5 = var3.length + -1;
            L2: while (true) {
              L3: {
                if (var5 < 0) {
                  break L3;
                } else {
                  if (var4 != 0) {
                    break L3;
                  } else {
                    var4 = var4 != 0 | var3[var5] ? 1 : 0;
                    var5--;
                    continue L2;
                  }
                }
              }
              if (var4 == 0) {
                var2 = (Object) (Object) ba.field_N;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        return (String) var2;
    }

    private final void a(int param0, int param1, boolean param2) {
        double var4 = 0.0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        String var11 = null;
        String stackIn_5_0 = null;
        String[] stackIn_5_1 = null;
        String[] stackIn_5_2 = null;
        int stackIn_5_3 = 0;
        String stackIn_6_0 = null;
        String[] stackIn_6_1 = null;
        String[] stackIn_6_2 = null;
        int stackIn_6_3 = 0;
        String stackIn_7_0 = null;
        String[] stackIn_7_1 = null;
        String[] stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        String stackIn_7_4 = null;
        c stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        c stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        c stackIn_10_0 = null;
        String stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        c stackIn_11_0 = null;
        String stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        c stackIn_12_0 = null;
        String stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        c stackIn_13_0 = null;
        String stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        String stackOut_4_0 = null;
        String[] stackOut_4_1 = null;
        String[] stackOut_4_2 = null;
        int stackOut_4_3 = 0;
        String stackOut_6_0 = null;
        String[] stackOut_6_1 = null;
        String[] stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        String stackOut_6_4 = null;
        String stackOut_5_0 = null;
        String[] stackOut_5_1 = null;
        String[] stackOut_5_2 = null;
        int stackOut_5_3 = 0;
        String stackOut_5_4 = null;
        c stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        c stackOut_9_0 = null;
        String stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        c stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        c stackOut_10_0 = null;
        String stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        c stackOut_12_0 = null;
        String stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        c stackOut_11_0 = null;
        String stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        L0: {
          var4 = 62.83185307179586 * Math.exp(0.05 * (double)(-param1));
          if (((un) this).field_C != 0) {
            var4 = var4 + 3.141592653589793;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var6 = 0;
          var7 = new int[]{0, 0, -1000, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          var8 = (int)(Math.sin(var4) * 32768.0);
          var9 = (int)(32768.0 * Math.cos(var4));
          nh.a();
          var10 = new int[]{0, 0, 0, var9, 0, var8, 0, 32768, 0, -var8, 0, var9};
          int discarded$1 = -63;
          nh.c(370, 240 - -ec.c());
          jb.field_e.a(var7, var10);
          if (qb.field_a < 200) {
            break L1;
          } else {
            L2: {
              stackOut_4_0 = ke.field_e;
              stackOut_4_1 = new String[1];
              stackOut_4_2 = new String[1];
              stackOut_4_3 = 0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_6_3 = stackOut_4_3;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              if (((un) this).field_C != 0) {
                stackOut_6_0 = (String) (Object) stackIn_6_0;
                stackOut_6_1 = (String[]) (Object) stackIn_6_1;
                stackOut_6_2 = (String[]) (Object) stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = wj.field_e;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                break L2;
              } else {
                stackOut_5_0 = (String) (Object) stackIn_5_0;
                stackOut_5_1 = (String[]) (Object) stackIn_5_1;
                stackOut_5_2 = (String[]) (Object) stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = lg.field_e;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                break L2;
              }
            }
            L3: {
              stackIn_7_2[stackIn_7_3] = stackIn_7_4;
              var11 = oc.a(stackIn_7_0, stackIn_7_1, (byte) -92);
              stackOut_7_0 = v.field_j;
              stackOut_7_1 = (String) var11;
              stackOut_7_2 = 370;
              stackOut_7_3 = 240;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              if (0 != ((un) this).field_C) {
                stackOut_9_0 = (c) (Object) stackIn_9_0;
                stackOut_9_1 = (String) (Object) stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = stackIn_9_3;
                stackOut_9_4 = 1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                stackIn_10_4 = stackOut_9_4;
                break L3;
              } else {
                stackOut_8_0 = (c) (Object) stackIn_8_0;
                stackOut_8_1 = (String) (Object) stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = 16777215;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                stackIn_10_4 = stackOut_8_4;
                break L3;
              }
            }
            L4: {
              stackOut_10_0 = (c) (Object) stackIn_10_0;
              stackOut_10_1 = (String) (Object) stackIn_10_1;
              stackOut_10_2 = stackIn_10_2;
              stackOut_10_3 = stackIn_10_3;
              stackOut_10_4 = stackIn_10_4;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_12_3 = stackOut_10_3;
              stackIn_12_4 = stackOut_10_4;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              stackIn_11_3 = stackOut_10_3;
              stackIn_11_4 = stackOut_10_4;
              if (0 != ((un) this).field_C) {
                stackOut_12_0 = (c) (Object) stackIn_12_0;
                stackOut_12_1 = (String) (Object) stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = stackIn_12_3;
                stackOut_12_4 = stackIn_12_4;
                stackOut_12_5 = 16777215;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                stackIn_13_4 = stackOut_12_4;
                stackIn_13_5 = stackOut_12_5;
                break L4;
              } else {
                stackOut_11_0 = (c) (Object) stackIn_11_0;
                stackOut_11_1 = (String) (Object) stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = stackIn_11_3;
                stackOut_11_4 = stackIn_11_4;
                stackOut_11_5 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                stackIn_13_4 = stackOut_11_4;
                stackIn_13_5 = stackOut_11_5;
                break L4;
              }
            }
            ((c) (Object) stackIn_13_0).b(stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_13_4, stackIn_13_5);
            break L1;
          }
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        Object stackIn_6_0 = null;
        af stackIn_6_1 = null;
        Object stackIn_7_0 = null;
        af stackIn_7_1 = null;
        Object stackIn_8_0 = null;
        af stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_5_0 = null;
        af stackOut_5_1 = null;
        Object stackOut_7_0 = null;
        af stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        Object stackOut_6_0 = null;
        af stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          if (1 == ((un) this).field_f) {
            int discarded$3 = 1;
            int discarded$4 = 1;
            this.b();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!((un) this).field_b) {
            L2: {
              int discarded$5 = 3;
              eb.a(((un) this).field_l, -16773121 & ((un) this).field_t.field_f[param0], ((un) this).field_t.field_f[((un) this).field_t.b(0)] & -16773121);
              ((un) this).field_t.a((byte) 19, ((un) this).field_l, ((un) this).field_t.b(0), param0);
              ((un) this).field_l = 0;
              stackOut_5_0 = this;
              stackOut_5_1 = ((un) this).field_B;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (-1 != ((un) this).field_B.field_l) {
                stackOut_7_0 = this;
                stackOut_7_1 = (af) (Object) stackIn_7_1;
                stackOut_7_2 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                break L2;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = (af) (Object) stackIn_6_1;
                stackOut_6_2 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                break L2;
              }
            }
            L3: {
              stackIn_8_1.field_l = stackIn_8_2;
              ((un) this).field_a = stackIn_8_2;
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (-1 != ((un) this).field_B.field_l) {
                stackOut_10_0 = this;
                stackOut_10_1 = 4096;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L3;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L3;
              }
            }
            ((un) this).field_C = stackIn_11_1;
            ((un) this).b((byte) 26);
            this.a(param0, true, false);
            break L1;
          } else {
            qn.field_U.f(58, -63);
            qn.field_U.c(((un) this).field_B.field_n, (byte) 98);
            qn.field_U.b(((un) this).field_t.b(0), 100);
            qn.field_U.b(param0, 93);
            qn.field_U.c(((un) this).field_l, (byte) 111);
            this.a(param0, true, false);
            ((un) this).field_t.a(-1, false, -1);
            ((un) this).field_l = 0;
            break L1;
          }
        }
        var3 = 81 % ((-44 - param1) / 58);
    }

    private final void b() {
        ((un) this).field_f = ((un) this).field_f + 1;
        ((un) this).field_z = ((un) this).field_z + 1;
    }

    private final void d() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String var16_ref_String = null;
        int var17 = 0;
        String[] var17_ref_String__ = null;
        int var18_int = 0;
        String var18 = null;
        int var19 = 0;
        c var19_ref_c = null;
        int var20 = 0;
        String var20_ref_String = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        km var26 = null;
        km var27 = null;
        km var28 = null;
        km var29 = null;
        String var30 = null;
        int[] var31 = null;
        int[] var33 = null;
        int[] var35 = null;
        int[] var37 = null;
        int[] var38 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        rk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        rk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        rk stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        rk stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        rk stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        rk stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_53_0 = 0;
        String stackIn_74_0 = null;
        int stackIn_83_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        rk stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        rk stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        rk stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        rk stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        rk stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        rk stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        String stackOut_73_0 = null;
        String stackOut_72_0 = null;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        L0: {
          var24 = Chess.field_G;
          var2 = -(ja.field_g.field_j / 2) + (8 - -(ph.field_l.field_j / 2));
          if (this.c(25)) {
            stackOut_2_0 = ((un) this).field_d;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = nc.field_T;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (var3 != 0) {
            cl.field_g.field_w = wb.field_h;
            cl.field_g.field_t = wb.field_c;
            cl.field_g.field_x = wb.field_d;
            um.field_c.e();
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          wb.a(4, 4, 108, 327, 11, 0, 64);
          stackOut_6_0 = 8;
          stackOut_6_1 = 8;
          stackOut_6_2 = 100;
          stackOut_6_3 = 158;
          stackOut_6_4 = 11;
          stackOut_6_5 = 16777215;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_8_2 = stackOut_6_2;
          stackIn_8_3 = stackOut_6_3;
          stackIn_8_4 = stackOut_6_4;
          stackIn_8_5 = stackOut_6_5;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          stackIn_7_2 = stackOut_6_2;
          stackIn_7_3 = stackOut_6_3;
          stackIn_7_4 = stackOut_6_4;
          stackIn_7_5 = stackOut_6_5;
          if (((un) this).field_y | ((un) this).field_g) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = stackIn_8_2;
            stackOut_8_3 = stackIn_8_3;
            stackOut_8_4 = stackIn_8_4;
            stackOut_8_5 = stackIn_8_5;
            stackOut_8_6 = 96;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            stackIn_9_3 = stackOut_8_3;
            stackIn_9_4 = stackOut_8_4;
            stackIn_9_5 = stackOut_8_5;
            stackIn_9_6 = stackOut_8_6;
            break L2;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = stackIn_7_2;
            stackOut_7_3 = stackIn_7_3;
            stackOut_7_4 = stackIn_7_4;
            stackOut_7_5 = stackIn_7_5;
            stackOut_7_6 = 256;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            stackIn_9_3 = stackOut_7_3;
            stackIn_9_4 = stackOut_7_4;
            stackIn_9_5 = stackOut_7_5;
            stackIn_9_6 = stackOut_7_6;
            break L2;
          }
        }
        L3: {
          wb.a(stackIn_9_0, stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6);
          wb.a(8, 169, 100, 158, 11, 0, 96);
          stackOut_9_0 = ja.field_g;
          stackOut_9_1 = var2;
          stackOut_9_2 = 169;
          stackIn_11_0 = stackOut_9_0;
          stackIn_11_1 = stackOut_9_1;
          stackIn_11_2 = stackOut_9_2;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          stackIn_10_2 = stackOut_9_2;
          if (((un) this).field_B.field_l == ((un) this).field_B.field_k) {
            stackOut_11_0 = (rk) (Object) stackIn_11_0;
            stackOut_11_1 = stackIn_11_1;
            stackOut_11_2 = stackIn_11_2;
            stackOut_11_3 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            stackIn_12_3 = stackOut_11_3;
            break L3;
          } else {
            stackOut_10_0 = (rk) (Object) stackIn_10_0;
            stackOut_10_1 = stackIn_10_1;
            stackOut_10_2 = stackIn_10_2;
            stackOut_10_3 = 3;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_12_2 = stackOut_10_2;
            stackIn_12_3 = stackOut_10_3;
            break L3;
          }
        }
        L4: {
          ((rk) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2 + stackIn_12_3);
          wb.c(14, 179, 88, 40, 8750469, 5592405);
          wb.d(13, 178, 90, 42, 1);
          ph.field_l.a(8, 173);
          se.a(16777215, pg.field_v, 20, 186, 3, 60, 0, ((un) this).field_e / 50, 35, da.field_y);
          stackOut_12_0 = ja.field_g;
          stackOut_12_1 = var2;
          stackOut_12_2 = 111;
          stackIn_14_0 = stackOut_12_0;
          stackIn_14_1 = stackOut_12_1;
          stackIn_14_2 = stackOut_12_2;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          stackIn_13_2 = stackOut_12_2;
          if (((un) this).field_B.field_l != ((un) this).field_B.field_k) {
            stackOut_14_0 = (rk) (Object) stackIn_14_0;
            stackOut_14_1 = stackIn_14_1;
            stackOut_14_2 = stackIn_14_2;
            stackOut_14_3 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            stackIn_15_2 = stackOut_14_2;
            stackIn_15_3 = stackOut_14_3;
            break L4;
          } else {
            stackOut_13_0 = (rk) (Object) stackIn_13_0;
            stackOut_13_1 = stackIn_13_1;
            stackOut_13_2 = stackIn_13_2;
            stackOut_13_3 = 3;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_15_2 = stackOut_13_2;
            stackIn_15_3 = stackOut_13_3;
            break L4;
          }
        }
        ((rk) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 - -stackIn_15_3);
        wb.c(14, 121, 88, 40, 8750469, 5592405);
        wb.d(13, 120, 90, 42, 1);
        ph.field_l.a(8, 115);
        se.a(16711680, pg.field_v, 20, 128, 3, 60, 0, ((un) this).field_v / 50, 35, da.field_y);
        var4 = 4;
        var5 = 70;
        var6 = 30;
        var7 = var4;
        var8 = 2;
        var9 = var4;
        var10 = 218;
        var12 = ((un) this).field_t.field_g.length + -1;
        L5: while (true) {
          if (var12 < 0) {
            var12 = -1 + ((un) this).field_t.field_i.length;
            L6: while (true) {
              if (0 > var12) {
                L7: {
                  if (((un) this).field_B.field_k == ((un) this).field_B.field_l) {
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    break L7;
                  } else {
                    stackOut_34_0 = 1;
                    stackIn_36_0 = stackOut_34_0;
                    break L7;
                  }
                }
                L8: {
                  var12 = stackIn_36_0;
                  if (var12 != 0) {
                    stackOut_38_0 = 1;
                    stackIn_39_0 = stackOut_38_0;
                    break L8;
                  } else {
                    stackOut_37_0 = 16777215;
                    stackIn_39_0 = stackOut_37_0;
                    break L8;
                  }
                }
                L9: {
                  var13 = stackIn_39_0;
                  if (var12 != 0) {
                    stackOut_41_0 = 16777215;
                    stackIn_42_0 = stackOut_41_0;
                    break L9;
                  } else {
                    stackOut_40_0 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    break L9;
                  }
                }
                L10: {
                  L11: {
                    var14 = stackIn_42_0;
                    var15 = 127 + (int)(127.0 * Math.sin((double)qb.field_a / 7.9));
                    if (((un) this).field_B.field_f == -2) {
                      break L11;
                    } else {
                      if (this.c(25)) {
                        break L11;
                      } else {
                        ri.field_i = -5000 + qb.field_a;
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (!((un) this).field_g) {
                      break L12;
                    } else {
                      L13: {
                        if (qb.field_a >= 400) {
                          break L13;
                        } else {
                          if (!((un) this).field_b) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      wb.a(548, 3, 89, 117, 11, 0, 64);
                      var16 = -2 + tj.field_n.field_i;
                      var17 = hd.field_g.field_m.field_v + (hd.field_g.field_i + 2);
                      var18_int = tj.field_n.field_k - 2;
                      var19 = 4 + tj.field_n.field_m.field_t + var18_int;
                      wb.a(var16, var18_int, var17 + -var16, -var18_int + var19, 3, 2105376, 128);
                      wb.b(((un) this).field_F);
                      wb.b(0, 0, 640, var18_int);
                      var20 = -2 + rf.field_d.field_i;
                      var22 = -2 + rf.field_d.field_k;
                      var21 = rf.field_d.field_m.field_v - -4;
                      var23 = 4 + (b.field_b.field_k + b.field_b.field_m.field_u);
                      var23 = var23 - (2 + var22);
                      wb.a(var20, var22, var21, var23, 3, 2105376, 128);
                      wb.b(0, var19, 640, 480);
                      wb.a(var20, var22, var21, var23, 3, 2105376, 128);
                      wb.a(((un) this).field_F);
                      tj.field_n.a(true);
                      hd.field_g.a(true);
                      rf.field_d.a(true);
                      b.field_b.a(true);
                      break L12;
                    }
                  }
                  L14: {
                    wc.field_s.d((byte) 66);
                    if (((un) this).field_b) {
                      stackOut_52_0 = 40;
                      stackIn_53_0 = stackOut_52_0;
                      break L14;
                    } else {
                      stackOut_51_0 = 20;
                      stackIn_53_0 = stackOut_51_0;
                      break L14;
                    }
                  }
                  L15: {
                    var16 = stackIn_53_0;
                    var17 = 150 - -var16;
                    if (((un) this).field_t.e(0, 65)) {
                      wb.a(548, var17, 89, 50, 9, 1, 128);
                      wb.a(548, var17, 89, 50, 9, 1);
                      int discarded$7 = v.field_j.a(l.field_k, 548, var17, 89, 50, 16777215, 0, var15, 1, 1, v.field_j.field_C);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (((un) this).field_t.e(4096, 111)) {
                      wb.a(548, var17, 89, 50, 9, 16777215, 128);
                      wb.a(548, var17, 89, 50, 9, 16777215);
                      int discarded$8 = v.field_j.a(sj.field_c, 548, var17, 89, 50, 0, 16777215, var15, 1, 1, v.field_j.field_C);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  if (!((un) this).field_b) {
                    L17: {
                      if (((un) this).field_B.field_l != 0) {
                        var18 = ij.field_f;
                        break L17;
                      } else {
                        var18 = mh.field_e;
                        break L17;
                      }
                    }
                    wb.a(548, -jj.field_b.field_C + 150, 89, var16, 9, var13, 128);
                    wb.a(548, -jj.field_b.field_C + 150, 89, var16, 9, var13);
                    jj.field_b.b(var18, 592, 152, var14, var13, var15);
                    break L10;
                  } else {
                    if (0 <= ((un) this).field_B.field_l) {
                      var19_ref_c = v.field_k;
                      var20_ref_String = ((un) this).field_B.field_i[((un) this).field_B.field_l];
                      var30 = oc.a(rc.field_f, new String[1], (byte) -43);
                      var18 = var30;
                      var18 = var30;
                      wb.a(548, -jj.field_b.field_C + 150, 89, var16, 9, var13, 128);
                      wb.a(548, -jj.field_b.field_C + 150, 89, var16, 9, var13);
                      int discarded$9 = ((lh) (Object) var19_ref_c).a(var30, 549, 150 - ((lh) (Object) var19_ref_c).field_C, 87, var16, var14, -1, var15, 1, 1, ((lh) (Object) var19_ref_c).field_C);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                L18: {
                  if (((un) this).field_B.field_l != ((un) this).field_a) {
                    break L18;
                  } else {
                    L19: {
                      if (((un) this).field_f <= 1) {
                        break L19;
                      } else {
                        int discarded$10 = 1;
                        if (null != this.e()) {
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (((un) this).field_f <= 1) {
                        stackOut_73_0 = vn.field_ub[((un) this).field_f];
                        stackIn_74_0 = stackOut_73_0;
                        break L20;
                      } else {
                        int discarded$11 = 1;
                        stackOut_72_0 = this.e();
                        stackIn_74_0 = stackOut_72_0;
                        break L20;
                      }
                    }
                    var16_ref_String = stackIn_74_0;
                    var17_ref_String__ = new String[50];
                    var37 = new int[50];
                    var35 = var37;
                    var33 = var35;
                    var31 = var33;
                    var25 = var31;
                    var38 = var25;
                    var19 = -1 + var37.length;
                    L21: while (true) {
                      if (var19 <= 0) {
                        var19 = v.field_j.a(var16_ref_String, var38, var17_ref_String__);
                        var20 = -(var19 * v.field_j.field_C) + (-v.field_j.field_t + 474);
                        var21 = (int)(((double)var19 + 0.5) * (double)v.field_j.field_C);
                        var22 = v.field_j.field_C / 2 - 1;
                        wb.a(-var22 + 150, var20, var22 * 2 + 340, var21, var22, var13, 128);
                        wb.a(150 + -var22, var20, 340 - -(2 * var22), var21, var22, var13);
                        int discarded$12 = v.field_j.a(var16_ref_String, 150, var20, 340, var21, var14, var13, var15 / 2 + 128, 1, 1, v.field_j.field_C);
                        break L18;
                      } else {
                        var37[var19] = 340;
                        var19--;
                        continue L21;
                      }
                    }
                  }
                }
                L22: {
                  var16 = ec.field_d.field_k - 72;
                  var17 = var16 + 4;
                  wb.a(548, var16, 89, 50, 8, 65793, 64);
                  wb.a(552, var17, 81, 42, 8, 65793, 128);
                  int discarded$13 = jj.field_b.a(gg.field_k, 552, var17, 81, 42, 16777215, -1, 1, 1, jj.field_b.field_C);
                  if (var3 != 0) {
                    L23: {
                      cl.field_g.e();
                      if (this.c(25)) {
                        stackOut_82_0 = -(255 * ((un) this).field_d / 75) + 255;
                        stackIn_83_0 = stackOut_82_0;
                        break L23;
                      } else {
                        stackOut_81_0 = (var3 * 255 + -4080) / 16;
                        stackIn_83_0 = stackOut_81_0;
                        break L23;
                      }
                    }
                    L24: {
                      var15 = stackIn_83_0;
                      if (this.c(25)) {
                        break L24;
                      } else {
                        if (var3 < 16) {
                          var15 = 255 - 255 * var3 / 16;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    }
                    um.field_c.b(0, 0, var15);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                return;
              } else {
                L25: {
                  if (0 == rn.field_b) {
                    var29 = qc.field_d[1][((un) this).field_t.field_i[var12]];
                    var29.b(var7, var8);
                    var7 = var7 + var29.field_w / 3;
                    if (var7 > var5) {
                      break L25;
                    } else {
                      var12--;
                      continue L6;
                    }
                  } else {
                    var28 = ub.field_d[1][((un) this).field_t.field_i[var12]];
                    var28.a(var7, var8);
                    var7 = var7 + var28.field_w / 12;
                    if (var7 > var5) {
                      break L25;
                    } else {
                      var12--;
                      continue L6;
                    }
                  }
                }
                var7 = var4;
                var8 = var8 + var6;
                var12--;
                continue L6;
              }
            }
          } else {
            if (rn.field_b == 0) {
              var27 = qc.field_d[0][((un) this).field_t.field_g[var12]];
              var27.b(var9, var10);
              var9 = var9 + var27.field_w / 3;
              if (var9 > var5) {
                var9 = var4;
                var10 = var10 + var6;
                var12--;
                continue L5;
              } else {
                var12--;
                continue L5;
              }
            } else {
              var26 = ub.field_d[0][((un) this).field_t.field_g[var12]];
              var26.a(var9, var10);
              var9 = var9 + var26.field_w / 12;
              if (var5 < var9) {
                var10 = var10 + var6;
                var9 = var4;
                var12--;
                continue L5;
              } else {
                var12--;
                continue L5;
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        if (param0 < 28) {
            this.a(-96, false, true);
        }
        if (!((un) this).field_b) {
            if (0 != vk.field_b) {
                var3 = param1 ? 1 : 0;
                uk.a(qk.field_h, var3 != 0, 28333, 6);
            } else {
                var3 = param1 ? 1 : 0;
                uk.a(qk.field_h, var3 != 0, 28333, 0);
            }
        }
    }

    final static String g() {
        int var1 = 91;
        return hc.field_b;
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var5 = Chess.field_G;
          if (!((un) this).field_b) {
            break L0;
          } else {
            if (qb.field_a < 400) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (((un) this).field_C == 0) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            stackOut_5_0 = 4096;
            stackIn_7_0 = stackOut_5_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_7_0;
          if (((un) this).field_B.field_d) {
            break L2;
          } else {
            if (((un) this).field_a != ((un) this).field_B.field_l) {
              break L2;
            } else {
              if (((un) this).field_t.b(0) != -1) {
                L3: {
                  L4: {
                    if (((un) this).field_t.field_j == -1) {
                      break L4;
                    } else {
                      if (((un) this).field_t.field_j == ((un) this).field_t.b(0)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((un) this).field_t.a(-1, true, -1);
                  wf.a(um.field_l[5], -103);
                  break L3;
                }
                if (((un) this).field_t.field_j == -1) {
                  break L2;
                } else {
                  if (-1 != ((un) this).field_t.b(0)) {
                    L5: {
                      var3 = ((un) this).field_t.b(((un) this).field_t.field_j, 9550);
                      var4 = var3 & 16773120;
                      if (var3 == 0) {
                        break L5;
                      } else {
                        if (var2 != var4) {
                          break L5;
                        } else {
                          int discarded$4 = 1;
                          int discarded$5 = 1;
                          this.b();
                          ((un) this).field_t.a(((un) this).field_t.field_j, true, -1);
                          wf.a(um.field_l[4], -122);
                          break L2;
                        }
                      }
                    }
                    if (((un) this).field_t.field_d[((un) this).field_t.field_j]) {
                      if (!((un) this).field_t.a(8)) {
                        ((un) this).a(((un) this).field_t.field_j, 27);
                        break L2;
                      } else {
                        qk.field_h = 9;
                        ((un) this).field_u = ((un) this).field_t.field_j;
                        break L2;
                      }
                    } else {
                      wf.a(um.field_l[6], 22);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              } else {
                if (((un) this).field_t.field_j == -1) {
                  break L2;
                } else {
                  var3 = ((un) this).field_t.b(((un) this).field_t.field_j, 9550);
                  var4 = 16773120 & var3;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    if (var2 != var4) {
                      break L2;
                    } else {
                      int discarded$6 = 1;
                      int discarded$7 = 1;
                      this.b();
                      ((un) this).field_t.a(((un) this).field_t.field_j, true, -1);
                      wf.a(um.field_l[4], -76);
                      break L2;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void b(boolean param0) {
        if (!param0) {
            ((un) this).field_B = null;
        }
        if (!(((un) this).field_b)) {
            throw new IllegalStateException();
        }
        qn.field_U.f(60, -87);
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            un.a((byte) -36);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((un) this).field_b) {
              break L2;
            } else {
              if (0 == ((un) this).field_C) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var3 = Chess.field_G;
          ((un) this).field_o = ((un) this).field_o ^ 1 << ((un) this).field_f;
          ((un) this).field_x = ((un) this).field_x ^ 1 << ((un) this).field_f;
          ((un) this).field_D = ((un) this).field_D - 1;
          if (vg.field_a != 1) {
            break L0;
          } else {
            L1: {
              if (ql.field_c) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            ql.field_c = stackIn_4_0 != 0;
            break L0;
          }
        }
        ((un) this).field_E = ((un) this).field_E - ((un) this).field_r;
        if (vg.field_a == 13) {
          L2: {
            if (((un) this).field_b) {
              if (!((un) this).field_B.field_d) {
                if (!hl.field_h) {
                  qk.field_h = 2;
                  break L2;
                } else {
                  qk.field_h = 11;
                  break L2;
                }
              } else {
                qk.field_h = 3;
                break L2;
              }
            } else {
              if (((un) this).field_B.field_d) {
                qk.field_h = 10;
                break L2;
              } else {
                qk.field_h = 1;
                break L2;
              }
            }
          }
          if (((un) this).field_a < 0) {
            qk.field_h = 11;
            return true;
          } else {
            return true;
          }
        } else {
          var2 = -123 / ((param0 - -68) / 38);
          return false;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        if (param0 < 116) {
            int discarded$0 = 115;
            String discarded$1 = un.g();
        }
    }

    final void i(int param0) {
        if (!vi.a(-3)) {
            this.d(125);
        }
        int var3 = 16 % ((-38 - param0) / 55);
        un var2 = uh.i(23156);
        if (var2 == null) {
            qk.field_h = 10;
        } else {
            if (!var2.field_b) {
                qk.field_h = 10;
            } else {
                qk.field_h = 3;
            }
        }
    }

    final void b(byte param0) {
        if (param0 != 26) {
            return;
        }
        if (((un) this).field_t.e(0, 77)) {
            ri.field_i = qb.field_a;
        } else {
            if (!(!((un) this).field_t.e(4096, 67))) {
                ri.field_i = qb.field_a;
            }
        }
    }

    private final boolean c(int param0) {
        if (param0 != 25) {
            ((un) this).field_e = -42;
        }
        return ((un) this).field_d + -50 < 25 ? true : false;
    }

    private final void d(int param0) {
        if (null == cb.field_e) {
            if (!(((un) this).field_f <= 0)) {
                cb.field_e = new ak(36, 65499, ((un) this).field_o, ((un) this).field_x, ((un) this).field_z, ((un) this).field_s, new int[1]);
                if (!vi.a(-3)) {
                    int discarded$0 = 3;
                    ba.a(cb.field_e, -124);
                }
            }
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var6 = Chess.field_G;
          if (((un) this).field_b) {
            L1: {
              qh.field_b.field_q = ef.field_l;
              if (wn.field_f) {
                break L1;
              } else {
                if (s.field_O <= 1) {
                  if (s.field_O == 1) {
                    qh.field_b.field_q = fm.field_U;
                    break L1;
                  } else {
                    qh.field_b.field_q = be.field_c;
                    break L1;
                  }
                } else {
                  qh.field_b.field_q = oc.a(gd.field_d, new String[1], (byte) -67);
                  break L1;
                }
              }
            }
            L2: {
              qh.field_b.field_q = qh.field_b.field_q.toUpperCase();
              var3 = 10 + jj.field_b.b(qh.field_b.field_q);
              var4 = -qh.field_b.field_c + 108;
              if (var3 < var4) {
                qh.field_b.field_l = var4;
                var3 = var4;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = 0.05000000074505806f * (-0.5f + ((float)var3 - a.field_h));
            a.field_h = a.field_h + var5;
            qh.field_b.field_k = -2 - qh.field_b.field_c + uh.field_m.field_wb;
            qh.field_b.field_i = 5;
            qh.field_b.field_l = qh.field_b.field_c + (int)a.field_h;
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          if (((un) this).field_b) {
            if (param0) {
              qh.field_b.c((byte) -95);
              if (qh.field_b.field_d) {
                L4: {
                  if (wn.field_f) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L4;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L4;
                  }
                }
                wn.field_f = stackIn_21_0 != 0;
                if (wn.field_f) {
                  s.field_O = 0;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            } else {
              ph.field_k = false;
              break L3;
            }
          } else {
            ph.field_k = false;
            break L3;
          }
        }
    }

    private final void c() {
        if (((un) this).field_g) {
            if (ok.field_Jb[96]) {
                ((un) this).field_t.i(48);
            }
            if (!(!ok.field_Jb[97])) {
                ((un) this).field_t.l(-28628);
            }
            if (!(!ok.field_Jb[98])) {
                ((un) this).field_t.j(117);
            }
            if (ok.field_Jb[99]) {
                ((un) this).field_t.f(-4083);
            }
        }
        if (((un) this).field_g) {
            if (tj.field_n.field_d) {
                ((un) this).field_t.i(103);
            }
            if (hd.field_g.field_d) {
                ((un) this).field_t.l(-28628);
            }
            if (!(!rf.field_d.field_d)) {
                ((un) this).field_t.j(91);
            }
            if (!(!b.field_b.field_d)) {
                ((un) this).field_t.f(-4083);
            }
        }
        if (-2 != ((un) this).field_B.field_f) {
        } else {
            if (!wc.field_s.field_d) {
            } else {
                if (((un) this).field_g) {
                    ((un) this).field_t.g(1);
                    wc.field_s.field_q = ik.field_f;
                } else {
                    wc.field_s.field_q = vh.field_f;
                }
                ((un) this).field_g = !((un) this).field_g ? true : false;
                ((un) this).field_y = true;
            }
        }
    }

    final void b(int param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        c var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        String var20 = null;
        int[] var24 = null;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        L0: {
          var19 = Chess.field_G;
          var24 = wb.field_d;
          var4 = wb.field_h;
          var5 = wb.field_c;
          if (!((un) this).field_b) {
            break L0;
          } else {
            L1: {
              if (qb.field_a < 400) {
                break L1;
              } else {
                if (!qb.field_c) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (hl.field_h) {
              break L0;
            } else {
              um.field_c.e();
              break L0;
            }
          }
        }
        L2: {
          if (hl.field_h) {
            ph.field_j.b(48);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            if (-2 == ((un) this).field_B.field_f) {
              break L4;
            } else {
              if (!this.c(25)) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          if (!((un) this).field_y) {
            if (!((un) this).field_g) {
              int discarded$3 = -63;
              int discarded$4 = ((un) this).field_t.a(((un) this).b(param0 ^ 16777215), param1, qb.field_a, ec.c(), (byte) -102, true);
              break L3;
            } else {
              ((un) this).field_t.h(-63);
              break L3;
            }
          } else {
            ((un) this).field_t.h(-66);
            break L3;
          }
        }
        L5: {
          L6: {
            if (((un) this).field_B.field_f == -2) {
              break L6;
            } else {
              if (!this.c(param0 + -16777190)) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          int discarded$5 = -106;
          this.d();
          break L5;
        }
        var6 = jj.field_b.field_C + (2 - -jj.field_b.field_t);
        var7 = var6 / 2;
        var8 = 0;
        L7: while (true) {
          if (var8 >= ((un) this).field_B.field_h) {
            L8: {
              sf.b(param0);
              if (!((un) this).field_b) {
                break L8;
              } else {
                ((un) this).c(1, param1);
                if (!hl.field_h) {
                  if (qb.field_a >= 400) {
                    if (qb.field_c) {
                      qb.field_c = false;
                      wb.b();
                      wb.a(var24, var4, var5);
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    this.a(-104, qb.field_a, false);
                    wb.a(var24, var4, var5);
                    um.field_c.b(0, 0, 64);
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
            }
            L9: {
              wb.a();
              if (((un) this).field_B.field_f != -2) {
                if (((un) this).field_p) {
                  break L9;
                } else {
                  L10: {
                    ((un) this).field_p = true;
                    if (!hj.field_i) {
                      break L10;
                    } else {
                      if (oc.field_p == null) {
                        break L10;
                      } else {
                        if (!oc.field_p.field_b) {
                          break L10;
                        } else {
                          if (oc.field_p.field_a == oc.field_p.field_B.field_f) {
                            wf.a(um.field_l[9], 125);
                            break L9;
                          } else {
                            wf.a(um.field_l[10], 50);
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  wf.a(um.field_l[9], param0 + -16777133);
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L11: {
              if (hl.field_h) {
                break L11;
              } else {
                L12: {
                  ec.field_d.field_i = wc.field_s.field_i - (-wc.field_s.field_l - -ec.field_d.field_l);
                  ec.field_d.field_k = qh.field_b.field_k;
                  if (ec.field_d.field_q == null) {
                    rf.b(-124);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                df.a(ec.field_d, param0 + -16777215);
                ec.field_d.d((byte) 126);
                break L11;
              }
            }
            L13: {
              if (sk.field_t < 2) {
                break L13;
              } else {
                if (ql.field_c) {
                  jj.field_b.a("FPS: " + ie.field_a, 0, jj.field_b.field_q, 1, -1);
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            return;
          } else {
            L14: {
              if (((un) this).field_a == var8) {
                if ((((un) this).field_B.field_e & 1 << var8) == 0) {
                  if (!((un) this).field_B.field_d) {
                    if (0 != (((un) this).field_B.field_m & 1 << var8)) {
                      var9 = ue.field_a;
                      break L14;
                    } else {
                      var8++;
                      continue L7;
                    }
                  } else {
                    var8++;
                    continue L7;
                  }
                } else {
                  var9 = tg.field_i;
                  break L14;
                }
              } else {
                var20 = ((un) this).field_B.field_i[var8];
                var9 = var20;
                var9 = var20;
                var9 = var20;
                if ((1 << var8 & ((un) this).field_A) == 0) {
                  if (0 != (1 << var8 & ((un) this).field_B.field_c)) {
                    if (!((un) this).field_m) {
                      var9 = oc.a(dn.field_d, new String[1], (byte) -93);
                      break L14;
                    } else {
                      var9 = oc.a(sl.field_f, new String[1], (byte) -55);
                      break L14;
                    }
                  } else {
                    if ((((un) this).field_B.field_e & 1 << var8) != 0) {
                      var9 = oc.a(ig.field_a, new String[1], (byte) -71);
                      break L14;
                    } else {
                      if (!((un) this).field_B.field_d) {
                        if ((1 << var8 & ((un) this).field_B.field_m) != 0) {
                          var9 = oc.a(bo.field_a, new String[1], (byte) -68);
                          break L14;
                        } else {
                          var8++;
                          continue L7;
                        }
                      } else {
                        var8++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  if ((1 << var8 & ((un) this).field_B.field_e) == 0) {
                    var9 = oc.a(ej.field_a, new String[1], (byte) -97);
                    break L14;
                  } else {
                    var9 = oc.a(eg.field_d, new String[1], (byte) -118);
                    break L14;
                  }
                }
              }
            }
            L15: {
              var10 = v.field_k;
              var11 = var6;
              var12 = ((lh) (Object) var10).b(var9) - -(2 * var7);
              var13 = -var12 + (ec.field_d.field_i + ec.field_d.field_l);
              var14 = ec.field_d.field_k + -2 + -var6;
              if (((un) this).field_B.field_l != ((un) this).field_B.field_k) {
                stackOut_48_0 = 1;
                stackIn_49_0 = stackOut_48_0;
                break L15;
              } else {
                stackOut_47_0 = 0;
                stackIn_49_0 = stackOut_47_0;
                break L15;
              }
            }
            L16: {
              var15 = stackIn_49_0;
              if (var15 == 0) {
                stackOut_51_0 = 16777215;
                stackIn_52_0 = stackOut_51_0;
                break L16;
              } else {
                stackOut_50_0 = 1;
                stackIn_52_0 = stackOut_50_0;
                break L16;
              }
            }
            L17: {
              var16 = stackIn_52_0;
              if (var15 != 0) {
                stackOut_54_0 = 16777215;
                stackIn_55_0 = stackOut_54_0;
                break L17;
              } else {
                stackOut_53_0 = 1;
                stackIn_55_0 = stackOut_53_0;
                break L17;
              }
            }
            var17 = stackIn_55_0;
            var18 = 127 - -(int)(Math.sin((double)qb.field_a / 7.9) * 127.0);
            wb.a(var13, var14, var12, var11, var11 / 2 + -1, var16, 128);
            wb.a(var13, var14, var12, var11, var11 / 2 + -1, var16);
            ((lh) (Object) var10).a(var9, var13 - -var7, var14 + ((lh) (Object) var10).field_C, var17, var16, var18);
            var8++;
            continue L7;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 >= -1) {
            return;
        }
        if (!((un) this).field_m) {
            return;
        }
        int var4 = 1 << param1;
        if (!((wc.field_w & var4) == 0)) {
            return;
        }
        vk.field_b = vk.field_b | var4;
        wc.field_w = wc.field_w | var4;
        hd.field_l.a((o) (Object) new ef(param1), (byte) 98);
        tg.field_e.a((o) (Object) new ac(param1, param2, ((un) this).field_D, ((un) this).field_E, ((un) this).field_j, ((un) this).field_r), (byte) 98);
    }

    final void h(int param0) {
        if (!(((un) this).field_b)) {
            throw new IllegalStateException();
        }
        qn.field_U.f(59, -54);
        if (param0 < 2) {
            ((un) this).c(-43, false);
        }
    }

    private final void a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        L0: {
          if (param1) {
            break L0;
          } else {
            ((un) this).field_l = 49;
            break L0;
          }
        }
        L1: {
          if (!((un) this).field_b) {
            break L1;
          } else {
            if (((un) this).field_B.field_l == ((un) this).field_a) {
              if (param2) {
                break L1;
              } else {
                if (((un) this).field_t.b(0) == -1) {
                  break L1;
                } else {
                  if (param0 != -1) {
                    L2: {
                      if (5 == ((un) this).field_l) {
                        this.a(-76, 0, 255);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4 = ((un) this).field_t.b(0);
                    if ((-16773121 & ((un) this).field_t.field_f[var4]) != 6) {
                      break L1;
                    } else {
                      L3: {
                        if (Math.abs(var4 - param0) == -3) {
                          break L3;
                        } else {
                          if (-4 == Math.abs(-param0 + var4)) {
                            break L3;
                          } else {
                            break L1;
                          }
                        }
                      }
                      this.a(-96, 1, 254);
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            } else {
              break L1;
            }
          }
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_12_0 = null;
        qe stackIn_12_1 = null;
        double stackIn_12_2 = 0.0;
        int stackIn_12_3 = 0;
        Object stackIn_13_0 = null;
        qe stackIn_13_1 = null;
        double stackIn_13_2 = 0.0;
        int stackIn_13_3 = 0;
        Object stackIn_14_0 = null;
        qe stackIn_14_1 = null;
        double stackIn_14_2 = 0.0;
        int stackIn_14_3 = 0;
        double stackIn_14_4 = 0.0;
        qe stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        qe stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        qe stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        Object stackOut_11_0 = null;
        qe stackOut_11_1 = null;
        double stackOut_11_2 = 0.0;
        int stackOut_11_3 = 0;
        Object stackOut_13_0 = null;
        qe stackOut_13_1 = null;
        double stackOut_13_2 = 0.0;
        int stackOut_13_3 = 0;
        double stackOut_13_4 = 0.0;
        Object stackOut_12_0 = null;
        qe stackOut_12_1 = null;
        double stackOut_12_2 = 0.0;
        int stackOut_12_3 = 0;
        double stackOut_12_4 = 0.0;
        qe stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        qe stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        qe stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        L0: {
          var5 = Chess.field_G;
          qb.field_a = qb.field_a + 1;
          var3 = -ri.field_i + qb.field_a;
          ((un) this).field_r = ((un) this).field_r + 1;
          if (50 > var3) {
            break L0;
          } else {
            if (var3 >= 100) {
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-2 != ((un) this).field_B.field_f) {
            ((un) this).field_d = ((un) this).field_d + 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          ((un) this).field_z = ((un) this).field_z + 1;
          ((un) this).field_s = ((un) this).field_s + 1;
          ((un) this).field_j = ((un) this).field_j + ((un) this).field_D;
          var4 = 121 % ((28 - param0) / 33);
          if (param1) {
            L3: {
              tj.field_n.a(125);
              hd.field_g.a(-108);
              rf.field_d.a(-88);
              b.field_b.a(87);
              wc.field_s.c((byte) -95);
              int discarded$2 = -126;
              this.c();
              this.a(false);
              if (((un) this).field_y) {
                if (((un) this).field_g) {
                  ((un) this).field_y = ((un) this).field_t.b((byte) 15);
                  break L3;
                } else {
                  L4: {
                    stackOut_11_0 = this;
                    stackOut_11_1 = ((un) this).field_t;
                    stackOut_11_2 = -1.4626215563702156;
                    stackOut_11_3 = 42;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    if (((un) this).b(0)) {
                      stackOut_13_0 = this;
                      stackOut_13_1 = (qe) (Object) stackIn_13_1;
                      stackOut_13_2 = stackIn_13_2;
                      stackOut_13_3 = stackIn_13_3;
                      stackOut_13_4 = 0.0;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      break L4;
                    } else {
                      stackOut_12_0 = this;
                      stackOut_12_1 = (qe) (Object) stackIn_12_1;
                      stackOut_12_2 = stackIn_12_2;
                      stackOut_12_3 = stackIn_12_3;
                      stackOut_12_4 = 3.141592653589793;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      break L4;
                    }
                  }
                  ((un) this).field_y = ((qe) (Object) stackIn_14_1).a(stackIn_14_2, (byte) stackIn_14_3, stackIn_14_4);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (!lk.a((byte) 113)) {
              if (th.field_d == 1) {
                ((un) this).field_o = ((un) this).field_o ^ 5 << ((un) this).field_x;
                ((un) this).field_E = ((un) this).field_E - ag.field_f;
                ((un) this).field_j = ((un) this).field_j + ag.field_f;
                ((un) this).field_s = ((un) this).field_s + re.field_m;
                ((un) this).field_x = ((un) this).field_x ^ 5 << ((un) this).field_x;
                ((un) this).field_z = ((un) this).field_z + re.field_m;
                int discarded$3 = -1;
                this.a();
                break L2;
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (((un) this).field_b) {
            if (qb.field_a >= 400) {
              L6: {
                if (((un) this).field_B.field_k != ((un) this).field_B.field_l) {
                  break L6;
                } else {
                  if (1 < ((un) this).field_e) {
                    ((un) this).field_e = ((un) this).field_e - 1;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((un) this).field_B.field_k == ((un) this).field_B.field_l) {
                break L5;
              } else {
                if (1 < ((un) this).field_v) {
                  ((un) this).field_v = ((un) this).field_v - 1;
                  break L5;
                } else {
                  break L5;
                }
              }
            } else {
              break L5;
            }
          } else {
            L7: {
              if (((un) this).field_B.field_l != 0) {
                ((un) this).field_v = ((un) this).field_v - 1;
                break L7;
              } else {
                ((un) this).field_e = ((un) this).field_e - 1;
                break L7;
              }
            }
            if (((un) this).field_e != 0) {
              if (0 == ((un) this).field_v) {
                ((un) this).field_B.field_f = 0;
                break L5;
              } else {
                break L5;
              }
            } else {
              ((un) this).field_B.field_f = 1;
              break L5;
            }
          }
        }
        L8: {
          stackOut_40_0 = ((un) this).field_t;
          stackOut_40_1 = -110;
          stackIn_42_0 = stackOut_40_0;
          stackIn_42_1 = stackOut_40_1;
          stackIn_41_0 = stackOut_40_0;
          stackIn_41_1 = stackOut_40_1;
          if (((un) this).field_B.field_l == ((un) this).field_B.field_k) {
            stackOut_42_0 = (qe) (Object) stackIn_42_0;
            stackOut_42_1 = stackIn_42_1;
            stackOut_42_2 = 0;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            stackIn_43_2 = stackOut_42_2;
            break L8;
          } else {
            stackOut_41_0 = (qe) (Object) stackIn_41_0;
            stackOut_41_1 = stackIn_41_1;
            stackOut_41_2 = 4096;
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_43_2 = stackOut_41_2;
            break L8;
          }
        }
        L9: {
          if (!((qe) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2)) {
            if (((un) this).field_t.a((byte) 61, 0)) {
              ((un) this).field_B.field_f = 1;
              break L9;
            } else {
              if (!((un) this).field_t.a((byte) 61, 4096)) {
                break L9;
              } else {
                ((un) this).field_B.field_f = 0;
                break L9;
              }
            }
          } else {
            ((un) this).field_B.field_f = -3;
            break L9;
          }
        }
        L10: {
          if (((un) this).field_B.field_f == -2) {
            break L10;
          } else {
            if (!this.c(25)) {
              L11: {
                if (((un) this).field_B.field_d) {
                  break L11;
                } else {
                  if (!((un) this).field_b) {
                    qk.field_h = 10;
                    break L11;
                  } else {
                    qk.field_h = 3;
                    break L11;
                  }
                }
              }
              ((un) this).field_B.a((byte) 93, ((un) this).field_B.field_f);
              break L10;
            } else {
              break L10;
            }
          }
        }
        L12: {
          if (2 <= sk.field_t) {
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          L14: {
            this.a(param1, -2);
            if (!((un) this).field_b) {
              break L14;
            } else {
              if (hl.field_h) {
                break L14;
              } else {
                if (qb.field_a < 400) {
                  break L14;
                } else {
                  L15: {
                    if (-1 == jc.field_f) {
                      break L15;
                    } else {
                      if (-1 != qk.field_h) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  ec.field_d.field_C = true;
                  if (!ec.field_d.field_d) {
                    break L13;
                  } else {
                    ((un) this).h(57);
                    break L13;
                  }
                }
              }
            }
          }
          ec.field_d.field_C = false;
          break L13;
        }
        ec.field_d.c((byte) -95);
    }

    un(boolean param0, int param1, String[] param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_16_0 = null;
        qe stackIn_16_1 = null;
        qe stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        qe stackIn_17_1 = null;
        qe stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        qe stackIn_18_1 = null;
        qe stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_15_0 = null;
        qe stackOut_15_1 = null;
        qe stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        qe stackOut_17_1 = null;
        qe stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        qe stackOut_16_1 = null;
        qe stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        ((un) this).field_p = false;
        ((un) this).field_j = 4194336;
        ((un) this).field_E = 16777219;
        ((un) this).field_c = false;
        ((un) this).field_r = -17;
        ((un) this).field_k = false;
        ((un) this).field_g = true;
        ((un) this).field_D = 0;
        ((un) this).field_f = 0;
        ((un) this).field_F = new int[4];
        ((un) this).field_y = false;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((un) this).field_m = stackIn_4_1 != 0;
              if (hl.field_h) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              qb.field_c = stackIn_7_0 != 0;
              ri.field_i = -1000;
              ((un) this).field_d = 0;
              ((un) this).field_n = -1;
              if (hl.field_h) {
                stackOut_9_0 = 400;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              qb.field_a = stackIn_10_0;
              ((un) this).field_w = -1;
              wc.field_s = new eb(552, 10, 81, 24, vh.field_f);
              df.a(wc.field_s, 0);
              tj.field_n = new ta(554, 62, ng.field_b, me.field_d, (km) null, false, true);
              hd.field_g = new ta(606, 62, tb.field_c, vn.field_rb, (km) null, false, true);
              rf.field_d = new ta(580, 37, be.field_d, df.field_e, (km) null, false, true);
              b.field_b = new ta(580, 89, kn.field_G, vn.field_xb, (km) null, false, true);
              nb.field_Fb = new wg(100, 100, 108, bj.field_bb[0], wh.field_c, bj.field_bb[1], dj.field_t, (km) null);
              ((un) this).field_a = param3;
              ((un) this).field_C = param4;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (!param0) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              ((un) this).field_b = stackIn_13_1 != 0;
              nb.field_Fb.field_x = -1;
              if (((un) this).field_b) {
                break L5;
              } else {
                wf.a(um.field_l[11], 94);
                break L5;
              }
            }
            L6: {
              ((un) this).field_o = 322371584;
              ((un) this).field_z = 0;
              ((un) this).field_x = 64206;
              ((un) this).field_B = new af(param1, param2, 0);
              ((un) this).field_B.field_f = -2;
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((un) this).field_C != 0) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            L7: {
              ((un) this).field_t = new qe(stackIn_18_3 != 0);
              if (!((un) this).field_b) {
                ((un) this).field_B.a(0, 255, 0);
                ((un) this).field_v = p.field_j[((un) this).field_B.field_j];
                ((un) this).field_e = p.field_j[((un) this).field_B.field_j];
                break L7;
              } else {
                ((un) this).field_v = -1000;
                ((un) this).field_e = -1000;
                break L7;
              }
            }
            L8: {
              if (!((un) this).field_b) {
                break L8;
              } else {
                if (((un) this).field_C != 1) {
                  break L8;
                } else {
                  ((un) this).field_t.a(-0.7853981633974483, 0.0, true);
                  break L8;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var7;
            stackOut_25_1 = new StringBuilder().append("un.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Remove <%0> from friend list";
        field_i = "Hide game chat";
    }
}
