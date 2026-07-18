/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;

final class gh extends ea implements Cloneable {
    static boolean field_y;
    static String field_t;
    static int field_C;
    private int field_u;
    static String field_A;
    private boolean field_v;
    private transient boolean field_D;
    static vc field_F;
    int field_x;
    static int field_w;
    int field_G;
    static int[] field_E;
    static int field_B;
    static int[] field_z;

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        sl var7_ref = null;
        f var8 = null;
        int var9 = 0;
        sl var10 = null;
        sl stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        sl stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            var10 = super.a(param0, param1, param2, param3, param4, param5);
            var7_ref = var10;
            var8 = param0[param1 + param3][param4 + param5];
            L1: while (true) {
              L2: {
                if (var8 instanceof ro) {
                  jj.field_c.a(128, (param5 + param4) * 12, (param3 + param1) * 12, 60, (byte) -111);
                  ((ro) (Object) var8).field_p = (gh) this;
                  var10.field_p = false;
                  fn.field_j = fn.field_j - 5;
                  mb.field_g = mb.field_g - 5;
                  break L2;
                } else {
                  if (!(var8 instanceof pn)) {
                    break L2;
                  } else {
                    var8 = ((pn) (Object) var8).field_l;
                    continue L1;
                  }
                }
              }
              var8 = param0[param1][param4];
              L3: while (true) {
                L4: {
                  if (!(var8 instanceof ro)) {
                    if (var8 instanceof pn) {
                      var8 = ((pn) (Object) var8).field_l;
                      continue L3;
                    } else {
                      break L4;
                    }
                  } else {
                    m.field_n.a(256, 12 * param4, 12 * param1, 60, (byte) -111);
                    ((gh) this).field_D = false;
                    ((ro) (Object) var8).field_p = null;
                    fn.field_j = fn.field_j + 1;
                    mb.field_g = mb.field_g + 1;
                    ((ro) (Object) var8).field_o = (gh) this;
                    b.field_a = b.field_a + 20;
                    je.field_j = je.field_j + 20;
                    we.field_h = we.field_h + 40;
                    fp.field_a = fp.field_a + 40;
                    break L4;
                  }
                }
                stackOut_13_0 = (sl) var7_ref;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var7;
            stackOut_15_1 = new StringBuilder().append("gh.R(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_14_0;
    }

    final static rh h() {
        int discarded$0 = -102;
        return new rh(ac.c(61), km.a());
    }

    private final void b(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (!(((gh) this).field_G == 0)) {
            this.a(param1, param3, 23179, param5, param2, -1, 0.0, param0);
            this.a(param1, param3, 23179, param5, param2, 1, 1.5707963267948966, param0);
        }
        if (0 != ((gh) this).field_x) {
            this.a(param1, param2, param3, -1, param0, param5, (byte) -105, 0.0);
            this.a(param1, param2, param3, 1, param0, param5, (byte) -105, 1.5707963267948966);
        }
        int var7 = 100 / ((param4 - -50) / 33);
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        RuntimeException var6 = null;
        f var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_14_0 = null;
        f stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_21_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (null != ab.field_D) {
                break L1;
              } else {
                gl.field_e = gl.field_e - 1;
                if (param2 == null) {
                  break L1;
                } else {
                  var6_int = param2.a(false);
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= 3) {
                      break L1;
                    } else {
                      L3: {
                        if ((1 << var7 & var6_int) != 0) {
                          L4: {
                            q.field_a[var7].a(false, (byte) -128);
                            b.field_a = b.field_a - 1;
                            je.field_j = je.field_j - 1;
                            fp.field_a = fp.field_a - 2;
                            we.field_h = we.field_h - 1;
                            mb.field_g = mb.field_g - 5;
                            fn.field_j = fn.field_j - 5;
                            we.field_h = we.field_h + 6;
                            fp.field_a = fp.field_a + 6;
                            b.field_a = b.field_a + 3;
                            je.field_j = je.field_j + 3;
                            mb.field_g = mb.field_g + wd.field_j;
                            ob.field_l = ob.field_l + 1;
                            if (gl.field_e == 0) {
                              va.field_d = va.field_d | 1 << var7;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          mb.field_g = mb.field_g + 50;
                          fn.field_j = fn.field_j + 75;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
            }
            if (param3 == 11460) {
              ((gh) this).b(param4, param1, -663, param0);
              var6_ref = param0[param1 + ((gh) this).field_s][((gh) this).field_o + param4];
              L5: while (true) {
                L6: {
                  if (!(var6_ref instanceof ro)) {
                    if (var6_ref instanceof pn) {
                      var6_ref = ((pn) (Object) var6_ref).field_l;
                      continue L5;
                    } else {
                      break L6;
                    }
                  } else {
                    ((ro) (Object) var6_ref).field_p = null;
                    we.field_h = we.field_h + 40;
                    fp.field_a = fp.field_a + 40;
                    b.field_a = b.field_a + 20;
                    je.field_j = je.field_j + 20;
                    break L6;
                  }
                }
                stackOut_21_0 = ((gh) this).field_l;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              }
            } else {
              stackOut_13_0 = null;
              stackIn_14_0 = stackOut_13_0;
              return (f) (Object) stackIn_14_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6;
            stackOut_23_1 = new StringBuilder().append("gh.VA(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_22_0;
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        Object var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -35) {
                break L1;
              } else {
                var6 = null;
                nj discarded$2 = ((gh) this).a(49, (nj) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gh.KC(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        f var5_ref = null;
        ro var6_ref_ro = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            ((gh) this).field_v = false;
            var5_ref = ((gh) this).field_l;
            L1: while (true) {
              if (var5_ref instanceof ro) {
                var6_ref_ro = (ro) (Object) var5_ref;
                var7 = 0;
                L2: while (true) {
                  if (4 <= var7) {
                    return;
                  } else {
                    L3: {
                      if (1 == var6_ref_ro.field_m) {
                        var8 = ((gh) this).field_x;
                        var6_ref_ro.field_m = 0;
                        var9 = ((gh) this).field_G;
                        break L3;
                      } else {
                        var6_ref_ro.field_m = 1;
                        var9 = -((gh) this).field_G;
                        var8 = -((gh) this).field_x;
                        break L3;
                      }
                    }
                    ((gh) this).field_G = var8;
                    ((gh) this).field_x = var9;
                    if (!param2[((gh) this).field_x + param1][((gh) this).field_G + param3].a(16736352, param2, true, ((gh) this).field_x, param1, param3, (ea) this, ((gh) this).field_G)) {
                      ((gh) this).a((byte) 73, param2[param1 + ((gh) this).field_x][param3 - -((gh) this).field_G]);
                      ((gh) this).field_x = -((gh) this).field_x;
                      ((gh) this).field_G = -((gh) this).field_G;
                      var7++;
                      continue L2;
                    } else {
                      var6_ref_ro.a((byte) 127, (f) this);
                      ((gh) this).field_v = true;
                      sl discarded$3 = ((gh) this).a(param2, param1, false, ((gh) this).field_x, param3, ((gh) this).field_G);
                      mb.field_g = mb.field_g + ob.field_l;
                      wd.field_j = wd.field_j + 1;
                      return;
                    }
                  }
                }
              } else {
                if (!(var5_ref instanceof pn)) {
                  L4: {
                    var6 = 0;
                    if (param0 == 1) {
                      break L4;
                    } else {
                      var11 = null;
                      nj discarded$4 = ((gh) this).a(-1, (nj) null);
                      break L4;
                    }
                  }
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= 2) {
                      break L0;
                    } else {
                      if (param2[param1 - -((gh) this).field_x][param3 - -((gh) this).field_G].a(16736352, param2, true, ((gh) this).field_x, param1, param3, (ea) this, ((gh) this).field_G)) {
                        L6: {
                          if (var6 != 0) {
                            ga.field_B.a(64, param3 * 12, 12 * param1, 60, (byte) -111);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        mb.field_g = mb.field_g + ob.field_l;
                        wd.field_j = wd.field_j + 1;
                        ((gh) this).field_v = true;
                        sl discarded$5 = ((gh) this).a(param2, param1, false, ((gh) this).field_x, param3, ((gh) this).field_G);
                        return;
                      } else {
                        ((gh) this).a((byte) 62, param2[((gh) this).field_x + param1][((gh) this).field_G + param3]);
                        ((gh) this).field_x = -((gh) this).field_x;
                        var6 = 1;
                        ((gh) this).field_G = -((gh) this).field_G;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  var5_ref = ((pn) (Object) var5_ref).field_l;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var5;
            stackOut_29_1 = new StringBuilder().append("gh.LA(").append(param0).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param3 + ')');
        }
    }

    final static void j(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        Object var2 = null;
        nj var2_ref = null;
        int var3 = 0;
        int var8 = 0;
        nj var9 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            if (ge.field_c != 0) {
              var1_int = mm.a(ge.field_c, (byte) -120);
              if (param0 == -10935) {
                L1: {
                  L2: {
                    if (li.field_a == null) {
                      break L2;
                    } else {
                      if (li.field_a.field_l != null) {
                        L3: {
                          var9 = li.field_a;
                          var2_ref = var9;
                          var1_int++;
                          if (300 > var9.field_f) {
                            var9.field_f = 300;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: while (true) {
                          if (null == var2_ref.field_n) {
                            if (var1_int > 3) {
                              var2_ref = null;
                              break L1;
                            } else {
                              break L1;
                            }
                          } else {
                            var2_ref = var2_ref.field_n;
                            var1_int++;
                            continue L4;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_ref = null;
                  break L1;
                }
                var3 = 0;
                L5: while (true) {
                  if (var3 >= 17) {
                    ge.field_c = 0;
                    break L0;
                  } else {
                    L6: {
                      if ((ge.field_c & 1 << var3) == 0) {
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var3++;
                    continue L5;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "gh.FC(" + param0 + ')');
        }
    }

    gh(f param0, int param1, int param2) {
        super(param0);
        ((gh) this).field_D = true;
        try {
            ((gh) this).field_G = param1;
            ((gh) this).field_x = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 != 0) {
            int discarded$0 = ((gh) this).a(true, 46);
        }
        return 12;
    }

    private final dl e() {
        if (!(((gh) this).field_G >= 0)) {
            return vp.field_d;
        }
        if (-1 > ((gh) this).field_G) {
            return na.field_eb;
        }
        if (-1 > ((gh) this).field_x) {
            return mk.field_a;
        }
        return tl.field_b;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_2_0 = null;
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
              if (param0 == 23525) {
                break L1;
              } else {
                gh.j(58);
                break L1;
              }
            }
            stackOut_2_0 = ng.a(rb.field_e, param1, (f) (Object) new gh((f) (Object) new kp(-1), 0, 0), (byte) -83, fl.field_f);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("gh.V(").append(param0).append(',');
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
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        Object stackIn_2_0 = null;
        f stackIn_4_0 = null;
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
        f stackOut_3_0 = null;
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
            ((gh) this).field_u = (38 + (((gh) this).field_u + 12 * (((gh) this).field_G + ((gh) this).field_x))) % 38;
            ((gh) this).field_D = param0.field_p;
            if (param4 == 17512) {
              stackOut_3_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (f) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("gh.I(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_4_0;
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (null == to.field_f) {
                break L1;
              } else {
                if (!to.field_f.equals((Object) (Object) param0.getParameter("settings"))) {
                  var3 = (Object) (Object) to.field_f;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (hm.field_c == null) {
                break L2;
              } else {
                if (!hm.field_c.equals((Object) (Object) param0.getParameter("session"))) {
                  var4 = (Object) (Object) hm.field_c;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_8_0 = rf.a(-1, (String) var4, true, (String) var3, param1);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("gh.DA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 67 + ')');
        }
        return stackIn_9_0;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        L0: {
          if (param5 == 4261) {
            break L0;
          } else {
            boolean discarded$7 = ((gh) this).g(3);
            break L0;
          }
        }
        L1: {
          if (((gh) this).field_v) {
            this.b(param3, false, param2, param4, -5, param1);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          L3: {
            if (param2 != 24) {
              break L3;
            } else {
              if (param3 == 24) {
                il.field_e.a(param1, param4 - param3);
                if (param0) {
                  int discarded$8 = 79;
                  this.e().a(param1, param4 - param3);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L3;
              }
            }
          }
          il.field_e.b(param1, param4 + -param3, 2 * param2, param3 * 3);
          if (!param0) {
            break L2;
          } else {
            int discarded$9 = 79;
            this.e().b(param1, param4 + -param3, 2 * param2, 3 * param3);
            break L2;
          }
        }
        L4: {
          if (!((gh) this).field_v) {
            break L4;
          } else {
            this.b(param3, true, param2, param4, 2, param1);
            break L4;
          }
        }
    }

    final static void a(String param0, int param1, int param2, int param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            rn.field_q = param0;
            lc.field_d = param3;
            var4 = (Object) (Object) gf.field_c;
            synchronized (var4) {
              L1: {
                fq.field_x.d(62);
                gf.field_c.a();
                break L1;
              }
            }
            L2: {
              om.field_x = null;
              if (param0 != null) {
                fq.field_x.e(-20562, param3 * param2 >> 6);
                om.field_x = param0;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4_ref;
            stackOut_9_1 = new StringBuilder().append("gh.KA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 12 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void k(int param0) {
        field_z = null;
        field_E = null;
        field_F = null;
        field_t = null;
        if (param0 != 0) {
            field_F = null;
        }
        field_A = null;
    }

    final static int a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
            var2_int = 0;
            stackOut_0_0 = an.field_q.a(param0, 148);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("gh.K(");
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
          throw dn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -113 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, double param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        double var12 = 0.0;
        int var14 = 0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          var10 = param4 + param3 << 4;
          var11 = (param1 << 4) + (param7 << 3);
          var12 = 0.16534698176788384 * (double)(((gh) this).field_u + ((gh) this).field_G * ((gh) this).field_m) + param6;
          var14 = param5;
          var15 = Math.cos(var12);
          var17 = (int)(13.856406460551018 * ((double)param4 * Math.sin(var12)));
          var18 = (int)(6.928203230275509 * (var15 * (double)param7));
          stackOut_0_0 = param0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (0.0 >= 4.0 * (double)var14 - var15 * 13.856406460551018) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
            kh.a(var10 - var17, var18 + (var11 + param5 * (int)((double)param7 * 8.0)), param4 << 1, 15, rn.field_j);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var15 * 13.856406460551018 + 4.0 * (double)var14 > 0.0) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          stackOut_9_0 = stackIn_9_0;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (param0) {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        L4: {
          if (stackIn_12_0 == stackIn_12_1) {
            kh.a(var10 + var17, var11 - var18 - -((int)((double)param7 * 8.0) * param5), param4 << 1, 15, rn.field_j);
            break L4;
          } else {
            break L4;
          }
        }
    }

    final void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        int var6_int = 0;
        try {
            if (param3 >= -69) {
                field_F = null;
            }
            var6_int = param1.readUnsignedByte();
            ((gh) this).field_G = mo.field_h[var6_int];
            ((gh) this).field_x = kl.field_S[var6_int];
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "gh.JC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 18 % ((74 - param0) / 41);
        if (((gh) this).field_D) {
            super.b(120, param1, param2, param3, param4, param5);
        }
    }

    final boolean g(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            f discarded$0 = ((gh) this).a((f[][]) null, -81, (f) null, 72, -60);
            return false;
        }
        return false;
    }

    final void c(boolean param0, boolean param1) {
        if (!param0) {
            gh.k(-98);
        }
        if (param1) {
            return;
        }
        gl.field_e = gl.field_e + 1;
    }

    final void b(int param0, int param1, int param2, f[][] param3) {
        f var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            var5 = param3[param1][param0];
            L1: while (true) {
              L2: {
                if (var5 instanceof ro) {
                  ((ro) (Object) var5).field_o = null;
                  ((gh) this).field_D = true;
                  break L2;
                } else {
                  if (!(var5 instanceof pn)) {
                    break L2;
                  } else {
                    var5 = ((pn) (Object) var5).field_l;
                    continue L1;
                  }
                }
              }
              L3: {
                if (param2 == -663) {
                  break L3;
                } else {
                  ((gh) this).f(99, -94, (f[][]) null, -15);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("gh.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        RuntimeException var5_ref = null;
        de var6 = null;
        int var7 = 0;
        f stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_4_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var5 = ((gh) this).field_l;
            L1: while (true) {
              L2: {
                if (!(var5 instanceof de)) {
                  if (var5 instanceof pn) {
                    var5 = ((pn) (Object) var5).field_l;
                    continue L1;
                  } else {
                    break L2;
                  }
                } else {
                  var6 = (de) (Object) var5;
                  if (null != var6.field_j) {
                    break L2;
                  } else {
                    ua.field_a.a(256, param1 * 12, param0 * 12, 0, (byte) -111);
                    var6.field_j = (ea) this;
                    ((gh) this).field_v = false;
                    stackOut_4_0 = ((gh) this).a(param2, param0, (f) this, 11460, param1);
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0;
                  }
                }
              }
              L3: {
                if (param3 >= 120) {
                  break L3;
                } else {
                  ((gh) this).field_v = true;
                  break L3;
                }
              }
              stackOut_11_0 = this;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("gh.OA(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
        return (f) this;
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, byte param6, double param7) {
        int var10 = param1 + param5 << 4;
        int var11 = (param4 << 3) + (param2 << 4);
        double var12 = param7 + 0.16534698176788384 * (double)(((gh) this).field_m * ((gh) this).field_x + ((gh) this).field_u);
        double var14 = Math.sin(var12);
        double var16 = Math.cos(var12);
        int var18 = (int)(11.313708498984761 * (double)param1);
        int var19 = (int)(5.656854249492381 * (var16 * (double)param4) + 11.313708498984761 * ((double)param1 * var14));
        if ((0.0 < -(var16 * 11.313708498984761) + 5.656854249492381 * var14 ? 1 : 0) != (!param0 ? 1 : 0)) {
            kh.a(param3 * var18 + var10, var11 - var19, param1 << 1, 15, rn.field_j);
        }
        if ((5.656854249492381 * var14 - 11.313708498984761 * var16 < 0.0 ? 1 : 0) != (!param0 ? 1 : 0)) {
            kh.a(var10 + param3 * var18, var11 - -var19, param1 << 1, 15, rn.field_j);
        }
    }

    final static void i() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = CrazyCrystals.field_B;
        try {
          L0: {
            sc.field_i[0].a((byte) -123);
            sc.field_i[0] = null;
            sc.field_i[1].a((byte) -65);
            sc.field_i[1] = null;
            ga.field_B.a((byte) -127);
            ga.field_B = null;
            ua.field_a.a((byte) -113);
            ua.field_a = null;
            cb.field_n.a((byte) -84);
            cb.field_n = null;
            tm.field_f.a((byte) -74);
            tm.field_f = null;
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 4) {
                break L0;
              } else {
                il.field_h[var1_int].a((byte) -112);
                il.field_h[var1_int] = null;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "gh.GC(" + 127 + ')');
        }
    }

    final static void f(byte param0) {
        if (null != sp.field_a) {
            sp.field_a.i((byte) -45);
        }
        oh.field_d = new qk();
        jm.field_d.a((qm) (Object) oh.field_d, (byte) -50);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "You have <%0> unread messages!";
        field_E = new int[16384];
    }
}
