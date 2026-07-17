/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class me extends fc {
    int field_j;
    static String field_k;
    static String[] field_p;
    int field_o;
    static int field_q;
    int field_r;
    private int field_n;
    int field_s;
    static byte[][][] field_i;
    int field_m;
    int field_l;

    final static ng[] d() {
        int var4 = TrackController.field_F ? 1 : 0;
        ng[] var1 = new ng[gi.field_o];
        int var2 = 0;
        int var3 = 112;
        while (var2 < gi.field_o) {
            var1[var2] = new ng(ab.field_a, qe.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], qk.field_M[var2], qe.field_z);
            var2++;
        }
        ff.b(112);
        return var1;
    }

    public static void a() {
        field_i = null;
        field_k = null;
        int var1 = 0;
        field_p = null;
    }

    final static void a(int param0, int param1) {
        L0: {
          if (r.field_i == null) {
            break L0;
          } else {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (jc.field_a != ka.field_b) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        }
        ra.field_C.field_k = 0;
    }

    final void f(int param0) {
        ((me) this).field_l = param0;
        ((me) this).field_r = ((me) this).field_r + ((me) this).field_o;
        ((me) this).field_s = ((me) this).field_s + ((me) this).field_j;
    }

    final static void a(dh param0) {
        la var5 = null;
        int var4 = 0;
        try {
            var5 = ra.field_C;
            var5.c(5, 7);
            var5.field_k = var5.field_k + 1;
            var4 = var5.field_k;
            var5.a(1, (byte) -59);
            var5.a(param0.field_k, (byte) -61);
            var5.b(16, param0.field_q);
            var5.b(false, param0.field_n);
            var5.b(false, param0.field_o);
            var5.b(false, param0.field_j);
            var5.b(false, param0.field_m);
            int discarded$0 = var5.a(var4, false);
            var5.a(true, -var4 + var5.field_k);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "me.A(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 44 + 5 + 41);
        }
    }

    final boolean e(int param0) {
        int var2 = -3 % ((0 - param0) / 34);
        ((me) this).field_l = ((me) this).field_l + ((me) this).field_n;
        return ((me) this).field_l < 26 ? true : false;
    }

    final static int a(String param0, boolean param1, int param2, kh param3, int param4, int param5, kh param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var10_ref_String = null;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_5_0 = 0;
        be stackIn_16_0 = null;
        be stackIn_17_0 = null;
        be stackIn_18_0 = null;
        String stackIn_18_1 = null;
        be stackIn_19_0 = null;
        be stackIn_20_0 = null;
        be stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
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
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        be stackOut_15_0 = null;
        be stackOut_17_0 = null;
        String stackOut_17_1 = null;
        be stackOut_16_0 = null;
        String stackOut_16_1 = null;
        be stackOut_18_0 = null;
        be stackOut_20_0 = null;
        String stackOut_20_1 = null;
        be stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_32_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_64_0 = 0;
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
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param3.b(-108);
              var11_ref_String = var14;
              var11_ref_String = var14;
              var8 = param6.b(-117);
              var11_ref_String = var8;
              var11_ref_String = var8;
              if (null != r.field_i) {
                break L1;
              } else {
                if (!bf.a(false, (byte) 106)) {
                  stackOut_4_0 = -1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (jc.field_a == gk.field_a) {
                L3: {
                  qi.field_c = null;
                  ra.field_C.field_k = 0;
                  if (param0 == null) {
                    L4: {
                      ui.field_p.field_k = 0;
                      ui.field_p.b(false, ta.field_c.nextInt());
                      ui.field_p.b(false, ta.field_c.nextInt());
                      stackOut_15_0 = ui.field_p;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (param3.a(-107)) {
                        stackOut_17_0 = (be) (Object) stackIn_17_0;
                        stackOut_17_1 = (String) var14;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        break L4;
                      } else {
                        stackOut_16_0 = (be) (Object) stackIn_16_0;
                        stackOut_16_1 = "";
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        break L4;
                      }
                    }
                    L5: {
                      ((be) (Object) stackIn_18_0).b(stackIn_18_1, 115);
                      stackOut_18_0 = ui.field_p;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (!param6.a(-46)) {
                        stackOut_20_0 = (be) (Object) stackIn_20_0;
                        stackOut_20_1 = "";
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L5;
                      } else {
                        stackOut_19_0 = (be) (Object) stackIn_19_0;
                        stackOut_19_1 = (String) var8;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        break L5;
                      }
                    }
                    ((be) (Object) stackIn_21_0).b(stackIn_21_1, 112);
                    ra.field_C.a(16, (byte) -87);
                    ra.field_C.field_k = ra.field_C.field_k + 1;
                    var9 = ra.field_C.field_k;
                    ee.a(sc.field_d, (be) (Object) ra.field_C, fj.field_N, 0, ui.field_p);
                    ra.field_C.a(true, -var9 + ra.field_C.field_k);
                    break L3;
                  } else {
                    L6: {
                      var9 = 0;
                      ui.field_p.field_k = 0;
                      if (param1) {
                        var9 = var9 | 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      ui.field_p.b(false, ta.field_c.nextInt());
                      ui.field_p.b(false, ta.field_c.nextInt());
                      ui.field_p.b(var14, 106);
                      ui.field_p.b(var8, 124);
                      var15 = (CharSequence) (Object) param0;
                      ui.field_p.b(qk.a(-128, var15), 119);
                      ui.field_p.b(param4, (byte) -119);
                      ui.field_p.a(param2, (byte) -98);
                      ui.field_p.a(var9, (byte) -66);
                      ra.field_C.a(18, (byte) -92);
                      ra.field_C.field_k = ra.field_C.field_k + 2;
                      var10 = ra.field_C.field_k;
                      int discarded$5 = -22004;
                      var11_ref_String = bg.a(gd.b((byte) 77));
                      if (var11_ref_String != null) {
                        break L7;
                      } else {
                        var11_ref_String = "";
                        break L7;
                      }
                    }
                    ra.field_C.a((byte) -57, var11_ref_String);
                    ee.a(sc.field_d, (be) (Object) ra.field_C, fj.field_N, 0, ui.field_p);
                    ra.field_C.c(-var10 + ra.field_C.field_k, (byte) -96);
                    break L3;
                  }
                }
                me.a(-1, -1);
                jc.field_a = l.field_m;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (jc.field_a != l.field_m) {
                break L8;
              } else {
                if (!hf.a(1, false)) {
                  break L8;
                } else {
                  L9: {
                    var9 = ne.field_a.h(16383);
                    ne.field_a.field_k = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        ca.field_a = new String[var9 + -100];
                        jc.field_a = kl.field_a;
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var9 == 248) {
                    ob.a(209, gd.b((byte) 77));
                    fi.field_t = gh.field_c;
                    lj.a((byte) 125);
                    kg.field_f = false;
                    stackOut_32_0 = var9;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  } else {
                    if (var9 == 99) {
                      int discarded$6 = 93;
                      boolean discarded$7 = hf.a(va.a(), false);
                      int discarded$8 = -2;
                      qi.field_c = new Boolean(bg.a((be) (Object) ne.field_a));
                      ne.field_a.field_k = 0;
                      break L8;
                    } else {
                      uk.field_c = var9;
                      jc.field_a = sf.field_D;
                      hd.field_o = -1;
                      break L8;
                    }
                  }
                }
              }
            }
            L10: {
              if (kl.field_a == jc.field_a) {
                var9 = 2;
                if (hf.a(var9, false)) {
                  var10 = ne.field_a.d((byte) -94);
                  ne.field_a.field_k = 0;
                  if (hf.a(var10, false)) {
                    var11 = ca.field_a.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var11 <= var12) {
                        lj.a((byte) 121);
                        kg.field_f = false;
                        stackOut_44_0 = var11 + 100;
                        stackIn_45_0 = stackOut_44_0;
                        return stackIn_45_0;
                      } else {
                        ca.field_a[var12] = ne.field_a.j(-1);
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
              } else {
                break L10;
              }
            }
            L12: {
              var9 = 77 / ((param5 - 31) / 47);
              if (jc.field_a == sf.field_D) {
                int discarded$9 = 520;
                if (!fh.a()) {
                  break L12;
                } else {
                  L13: {
                    if (255 == uk.field_c) {
                      var10_ref_String = ne.field_a.d(19016);
                      if (var10_ref_String != null) {
                        dh.a(-19136, var10_ref_String, gd.b((byte) 77));
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      fi.field_t = ne.field_a.g(0);
                      break L13;
                    }
                  }
                  lj.a((byte) 115);
                  kg.field_f = false;
                  stackOut_54_0 = uk.field_c;
                  stackIn_55_0 = stackOut_54_0;
                  return stackIn_55_0;
                }
              } else {
                break L12;
              }
            }
            L14: {
              if (null != r.field_i) {
                break L14;
              } else {
                if (kg.field_f) {
                  L15: {
                    if (bj.b(-21676) <= 30000L) {
                      fi.field_t = cf.field_m;
                      break L15;
                    } else {
                      fi.field_t = nk.field_j;
                      break L15;
                    }
                  }
                  kg.field_f = false;
                  stackOut_62_0 = 249;
                  stackIn_63_0 = stackOut_62_0;
                  return stackIn_63_0;
                } else {
                  var10 = ke.field_c;
                  ke.field_c = ma.field_c;
                  ma.field_c = var10;
                  kg.field_f = true;
                  break L14;
                }
              }
            }
            stackOut_64_0 = -1;
            stackIn_65_0 = stackOut_64_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("me.E(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L16;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L16;
            }
          }
          L17: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param3 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L17;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L17;
            }
          }
          L18: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param6 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L18;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L18;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 41);
        }
        return stackIn_65_0;
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        fh var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_13_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          if (param2 != null) {
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param0) {
                stackOut_10_0 = (byte[]) var3;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                stackOut_8_0 = qd.a(var3, (byte) 102);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            } else {
              if (!(param2 instanceof fh)) {
                throw new IllegalArgumentException();
              } else {
                var4 = (fh) param2;
                stackOut_13_0 = var4.b((byte) -2);
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              }
            }
          } else {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("me.D(").append(param0).append(44).append(22692).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L0;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L0;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    me(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((me) this).field_o = param4;
        ((me) this).field_r = param2;
        ((me) this).field_n = param5;
        ((me) this).field_m = param0;
        ((me) this).field_s = param1;
        ((me) this).field_j = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[]{"<col=6>Track.</col><br>Push these blocks of track to assemble the model railway exhibits.", "<col=6>Immovable obstacle.</col><br>The walls of the exhibition hall. Obviously these can't be moved.", "<col=6>Smooth floor.</col><br>Track pushed onto this will continue to slide.", "<col=6>Conveyor belt.</col><br>This will push track in the direction indicated. You can push track across the belt and walk onto it, but not against it."};
        field_k = "Close";
    }
}
