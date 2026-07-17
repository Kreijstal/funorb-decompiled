/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wb extends lw {
    static vr field_l;

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        if (null != ms.field_u) {
            if (ms.field_u.a(true)) {
                di.c(-87);
                return true;
            }
        }
        if (null != wt.field_n) {
            if (wt.field_n.f((byte) -116)) {
                wt.field_n = null;
                di.c(96);
                return true;
            }
        }
        if (lk.d(2)) {
            return true;
        }
        if (tc.a(param1, param0, param3, param2)) {
            return true;
        }
        return false;
    }

    public static void d(int param0) {
        field_l = null;
    }

    wb() {
        super(false, new String[6], jm.field_h);
        ((wb) this).field_c = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
    }

    final void a(int param0, byte param1) {
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          if (param0 != 1) {
            if (param0 != 2) {
              if (param0 != 3) {
                if (param0 == 4) {
                  ((wb) this).field_a = 4;
                  ((wb) this).b(1);
                  ((wb) this).c(94);
                  break L0;
                } else {
                  if (param0 != 5) {
                    if (param0 == 6) {
                      ((wb) this).field_a = 6;
                      ((wb) this).b(param1 + -72);
                      ((wb) this).c(116);
                      break L0;
                    } else {
                      if (34 != param0) {
                        break L0;
                      } else {
                        if (!((wb) this).c((byte) 95)) {
                          break L0;
                        } else {
                          fla.b(23621);
                          break L0;
                        }
                      }
                    }
                  } else {
                    ((wb) this).field_a = 5;
                    ((wb) this).b(1);
                    ((wb) this).c(74);
                    break L0;
                  }
                }
              } else {
                ((wb) this).field_a = 3;
                ((wb) this).b(1);
                ((wb) this).c(param1 + 17);
                break L0;
              }
            } else {
              ((wb) this).field_a = 2;
              ((wb) this).b(1);
              ((wb) this).c(70);
              break L0;
            }
          } else {
            ((wb) this).field_a = 1;
            ((wb) this).b(1);
            ((wb) this).c(param1 ^ 39);
            break L0;
          }
        }
        L1: {
          if (param1 == 73) {
            break L1;
          } else {
            wb.a(false, 111, 23);
            break L1;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        eaa var4 = null;
        int var5 = 0;
        Object var6 = null;
        nea var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var14_ref_String = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ik var17 = null;
        ik var18 = null;
        sga stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        sga stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        sga stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        sna stackIn_19_0 = null;
        sna stackIn_20_0 = null;
        sna stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        sga stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        sga stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        sga stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        sna stackOut_18_0 = null;
        sna stackOut_20_0 = null;
        String stackOut_20_1 = null;
        sna stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var16 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              stackOut_1_0 = nr.field_w.field_xb;
              stackOut_1_1 = 2 + rg.field_h;
              stackOut_1_2 = 2;
              stackOut_1_3 = (6 + 3 * rg.field_h) * param1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (nr.field_w.field_xb != bga.field_m) {
                stackOut_3_0 = (sga) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                break L1;
              } else {
                stackOut_2_0 = (sga) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((sga) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, param0, true) ? 1 : 0;
                var4 = nr.field_w.field_wb.field_z;
                var5 = -98 / ((-4 - param2) / 42);
                if (2 == um.field_c) {
                  break L3;
                } else {
                  if (um.field_c != 1) {
                    nr.field_w.field_u = false;
                    nr.field_w.field_xb.field_wb.field_Z = ema.field_Ab;
                    nn.a((byte) -126, nr.field_w.field_wb);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              nr.field_w.field_u = true;
              nr.field_w.field_xb.field_wb.field_Z = null;
              var6 = null;
              var7 = (nea) (Object) var4.b((byte) 90);
              L4: while (true) {
                if (var7 == null) {
                  L5: {
                    if (nr.field_w.field_Ab.field_R != 0) {
                      wh.field_p = new oa(nr.field_w.field_Ab.field_D, nr.field_w.field_Ab.field_M, nr.field_w.field_Ab.field_sb, nr.field_w.field_Ab.field_p, nh.field_p, kha.field_i, qs.field_m, qs.field_m);
                      vaa.field_f = 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (nr.field_w.field_yb.field_R != 0) {
                    wh.field_p = new oa(nr.field_w.field_yb.field_D, nr.field_w.field_yb.field_M, nr.field_w.field_yb.field_sb, nr.field_w.field_yb.field_p, kma.field_p, kha.field_i, qs.field_m, qs.field_m);
                    vaa.field_f = 3;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  L6: {
                    var8 = 0;
                    if (var7.field_z == null) {
                      var7.field_Db = new sna(0L, gi.field_c);
                      var7.a(-1, var7.field_Db);
                      var7.field_zb = new sna(0L, gi.field_c);
                      var7.a(-1, var7.field_zb);
                      var7.d((byte) 116);
                      var8 = 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var7.field_sb = nr.field_w.field_wb.field_sb;
                    var7.field_Db.a(rg.field_h, 31407, var7.field_sb, 0, 0);
                    var9 = 0;
                    if (var7.field_Ab == null) {
                      break L7;
                    } else {
                      if (!var7.field_Ab.equals((Object) (Object) "")) {
                        var7.field_zb.field_v = ln.field_x;
                        var7.field_zb.field_ab = 16737894;
                        var7.field_zb.a(rg.field_h, 31407, ln.field_x.field_n - -3, 0, 0);
                        var9 = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var10 = 0;
                    var11 = var7.field_sb;
                    if (var9 == 0) {
                      break L8;
                    } else {
                      var10 = 3 + ln.field_x.field_n;
                      var11 = var11 - var10;
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_18_0 = var7.field_Db;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var11 > 0) {
                      stackOut_20_0 = (sna) (Object) stackIn_20_0;
                      stackOut_20_1 = po.a(var7.field_Db.field_jb, var7.field_xb, var11);
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L9;
                    } else {
                      stackOut_19_0 = (sna) (Object) stackIn_19_0;
                      stackOut_19_1 = var7.field_xb;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_21_0.field_Z = stackIn_21_1;
                    if (var7.field_Db.field_Z.equals((Object) (Object) var7.field_xb)) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L10;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L10;
                    }
                  }
                  L11: {
                    var12 = stackIn_24_0;
                    var7.field_Db.a(rg.field_h, 31407, var11, var10, 0);
                    if (var3_int == 0) {
                      var7.field_hb = rg.field_h + -var7.field_p;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var8 != 0) {
                      nr.field_w.field_wb.a(false, (sna) (Object) var7, (sna) var6, 2);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (null == var7.field_zb) {
                        break L14;
                      } else {
                        if (!var7.field_zb.field_T) {
                          break L14;
                        } else {
                          jja.field_m = var7.field_Ab;
                          break L13;
                        }
                      }
                    }
                    if (!var7.field_Db.field_T) {
                      break L13;
                    } else {
                      if (var12 != 0) {
                        jja.field_m = var7.field_xb;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if (var7.field_R == 0) {
                      break L15;
                    } else {
                      mna.a(-1, (int[]) null, 0L, var7.field_xb, var7.field_Cb, -1, -113, nr.field_w.field_xb, (sna) (Object) var7);
                      var17 = ms.field_u;
                      var14_ref_String = mna.field_r;
                      var17.field_a.a(var14_ref_String, true, 7);
                      var18 = ms.field_u;
                      var14 = nfa.field_a;
                      var15 = jc.field_r;
                      var18.field_a.a(0, false, var14, 0, var15);
                      break L15;
                    }
                  }
                  var6 = (Object) (Object) var7;
                  var7 = (nea) (Object) var4.c(0);
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "wb.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static pp a(lu param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        tfa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        tfa stackOut_0_0 = null;
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
            var2_int = 30;
            stackOut_0_0 = new tfa();
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("wb.A(");
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
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -45 + 41);
        }
        return (pp) (Object) stackIn_1_0;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 == 52) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            var3 = (CharSequence) (Object) param1;
            stackOut_2_0 = tca.field_a.equals((Object) (Object) fq.a(param0 ^ 52, var3));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("wb.I(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static k b(lu param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        k var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        k stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        k stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            int discarded$2 = param0.b(16711935);
            var2_int = param0.b(16711935);
            var3 = ffa.a(-16, var2_int);
            var3.field_i = param0.b(16711935);
            var4 = param0.b(16711935);
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                var3.d((byte) -68);
                stackOut_4_0 = (k) var3;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var6 = param0.b(16711935);
                var3.a((byte) -71, param0, var6);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("wb.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 94 + 41);
        }
        return stackIn_5_0;
    }

    final void a(byte param0) {
        int var2 = (int)((-Math.cos((double)(vr.field_b * 4) * 3.141592653589793 / 200.0) + 1.0) * 32.0);
        if (!(0 != (((wb) this).field_e & 2))) {
            wa.field_n.a(520, 12, var2);
        }
        if (!(-1 != (4 & ((wb) this).field_e))) {
            lfa.field_s.a(419, 149, var2);
        }
        if (!(-1 != (((wb) this).field_e & 8))) {
            bn.field_i.a(419, 42, var2);
        }
        if ((((wb) this).field_e & 16) == 0) {
            rj.field_l.a(522, 318, var2);
        }
        if (param0 <= 103) {
            boolean discarded$0 = wb.a(-31, 72, false, 62);
        }
        if ((((wb) this).field_e & 32) == 0) {
            ada.field_m.a(10, 7, var2);
        }
        if ((((wb) this).field_e & 64) == 0) {
            ew.field_q.a(36, 330, var2);
        }
    }

    static {
    }
}
