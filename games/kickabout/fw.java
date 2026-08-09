/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fw extends ta {
    private boolean field_I;
    static String field_H;
    static double field_G;
    private boolean field_F;

    final static kg a(sj param0, String param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kg stackIn_2_0 = null;
        kg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2) {
              var4_int = param0.b(param1, -1);
              var5 = param0.a((byte) -70, param3, var4_int);
              stackIn_4_0 = aw.a(var5, var4_int, param0, 2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (kg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("fw.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        jt var6;
        int var7;
        jt stackIn_11_0 = null;
        jt stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        var7 = Kickabout.field_G;
        super.a(0, param1, param2);
        this.field_F = gf.a(nt.field_yb, param0, tk.field_Ib, 3231);
        this.field_I = gf.a(nt.field_yb, 1, tk.field_Ib, 3231);
        cf.field_Gb.field_jb = new tf();
        var4 = 0;
        L0: while (true) {
          if (3 <= var4) {
            cf.field_Gb.field_s = 665;
            cf.field_Gb.b(0, false);
            return;
          } else {
            var5 = 0;
            L1: while (true) {
              if (4 <= var5) {
                var4++;
                continue L0;
              } else {
                L2: {
                  L3: {
                    var6 = new jt(ic.field_h, var4, var5);
                    var6.field_J = var4 * (2 + var6.field_mb);
                    var6.field_s = var5 * (5 + var6.field_q);
                    stackIn_11_0 = (jt) (var6);

                    if ((var4 ^ -1) == -1) {
                      break L3;
                    } else {
                      L4: {
                        stackIn_11_0 = (jt) ((Object) stackIn_11_0);

                        if (1 != var4) {
                          break L4;
                        } else {
                          stackIn_11_0 = (jt) ((Object) stackIn_11_0);

                          if (this.field_F) {
                            break L3;
                          } else {
                            stackIn_11_0 = (jt) ((Object) stackIn_11_0);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        stackIn_11_0 = (jt) ((Object) stackIn_11_0);

                        if (2 != var4) {
                          break L5;
                        } else {
                          stackIn_11_0 = (jt) ((Object) stackIn_11_0);

                          if (!this.field_I) {
                            break L5;
                          } else {
                            stackIn_11_0 = (jt) ((Object) stackIn_11_0);
                            break L3;
                          }
                        }
                      }
                      stackIn_13_0 = (jt) ((Object) stackIn_11_0);
                      stackIn_13_1 = 0;
                      break L2;
                    }
                  }
                  stackIn_13_0 = (jt) ((Object) stackIn_11_0);
                  stackIn_13_1 = 1;
                  break L2;
                }
                stackIn_13_0.field_lb = stackIn_13_1 != 0;
                cf.field_Gb.a((byte) -104, (hd) (var6));
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_H = null;
        int var1 = -127 % ((param0 - 61) / 56);
    }

    final void a(int param0, boolean param1) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        super.a(param0, param1);
        int var3 = this.field_j + 18;
        on.a(this.field_j + 10, 53, 365, 371, 65793, 96);
        on.a(var3, 62, 348, 24, 6, 65793, 96);
        pb.field_C.a(e.field_o, 30 + this.field_j, 80, 16777215, -1);
        on.a(var3, 95, 348, 106, 10, 65793, 96);
        on.a(var3, 207, 348, 102, 10, 65793, 96);
        on.a(var3, 314, 348, 100, 10, 65793, 96);
        for (var4 = 0; var4 < cf.field_Gb.field_jb.f(606511077).length; var4++) {
            ((jt) ((Object) cf.field_Gb.field_jb.f(param0 ^ -606511074)[var4])).j(0);
        }
        cf.field_Gb.a(96, false);
        if (!(this.field_F)) {
            on.a(var3, 207, 348, 102, 10, 65793, 228);
            for (var4 = 0; var4 < 3; var4++) {
                sh.field_g.c(30 + (var3 + -var4), 241 + -(var4 * 2));
            }
            pb.field_C.a(fv.field_c, 70 + var3, 261, 16777215, -1);
            pb.field_C.a(we.field_d, var3, 269, 348, 40, 16777215, -1, 1, 1, 0);
        }
        if (!this.field_I) {
            on.a(var3, 314, 348, 100, 10, 65793, 228);
            for (var4 = 0; (var4 ^ -1) > -4; var4++) {
                sh.field_g.c(-var4 + (30 + var3), -(2 * var4) + 348);
            }
            pb.field_C.a(fv.field_c, var3 + 70, 368, 16777215, -1);
            pb.field_C.a(we.field_d, var3, 376, 348, 40, 16777215, -1, 1, 1, 0);
        }
        un.field_d.a(ca.field_a, this.field_j + 25, 115, 16777215, -1);
        un.field_d.a(lr.field_j, 25 + this.field_j, 223, 16777215, -1);
        un.field_d.a(tu.field_C, 25 + this.field_j, 331, 16777215, -1);
    }

    final void b(int param0) {
        if (param0 != -38) {
            field_G = -0.01516130877366001;
        }
        cf.field_Gb = new hd();
        cf.field_Gb.a(true, 390, 25, 100, 440);
    }

    final void a(boolean param0, int param1) {
        if (param1 <= 99) {
            this.field_I = true;
        }
        ig.b(this.field_j, -12452);
    }

    final void a(byte param0, boolean param1) {
        jt var3_ref_jt;
        int var4;
        int var3;
        var4 = Kickabout.field_G;
        super.a((byte) 101, param1);
        cf.field_Gb.field_s = this.field_j + 25;
        cf.field_Gb.b(0, param1);
        var3_ref_jt = (jt) ((Object) cf.field_Gb.field_jb.g(24009));
        L0: while (true) {
          if (var3_ref_jt == null) {
            tc.a(ic.field_h.field_x, 5464);
            var3 = 4 % ((param0 - 38) / 60);
            return;
          } else {
            L1: {
              L2: {
                var3_ref_jt.c(3784, param1);
                if (var3_ref_jt.field_Ab == null) {
                  break L2;
                } else {
                  if (var3_ref_jt.field_Ab.field_sb != 0) {
                    cb.a(var3_ref_jt, (byte) 125);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3_ref_jt.field_sb == 0) {
                break L1;
              } else {
                if (!var3_ref_jt.i(-29050)) {
                  break L1;
                } else {
                  if (!var3_ref_jt.k(-9)) {
                    rt.b(var3_ref_jt.field_Db, 97, var3_ref_jt.field_zb);
                    break L1;
                  } else {
                    var3_ref_jt = (jt) ((Object) cf.field_Gb.field_jb.c(33));
                    continue L0;
                  }
                }
              }
            }
            var3_ref_jt = (jt) ((Object) cf.field_Gb.field_jb.c(33));
            continue L0;
          }
        }
    }

    final static int h(byte param0) {
        try {
            int stackIn_16_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_37_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            iw var2 = null;
            if ((gt.field_t.field_o ^ -1) > -5) {
              L0: {
                if (param0 == 66) {
                  break L0;
                } else {
                  field_G = 1.4183330929861455;
                  break L0;
                }
              }
              try {
                L1: {
                  L2: {
                    if (ci.field_a == 0) {
                      iv.field_o = hf.field_e.a(true, tk.field_yb, nb.field_b);
                      ci.field_a = ci.field_a + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (-2 != (ci.field_a ^ -1)) {
                      break L3;
                    } else {
                      if (iv.field_o.field_a == 2) {
                        stackIn_16_0 = vk.a(-120, -1);
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        if (1 == iv.field_o.field_a) {
                          ci.field_a = ci.field_a + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (ci.field_a != 2) {
                      break L4;
                    } else {
                      je.field_e = new bh((java.net.Socket) (iv.field_o.field_b), hf.field_e);
                      var2 = new iw(13);
                      dh.a(or.field_c, rc.field_f, var2, -3210, wo.field_k);
                      var2.a(param0 + 52, 15);
                      var2.b(param0 ^ -44, gg.field_Db);
                      je.field_e.a(13, (byte) -127, 0, var2.field_f);
                      ci.field_a = ci.field_a + 1;
                      qq.field_I = 30000L + nj.a(93);
                      break L4;
                    }
                  }
                  L5: {
                    if (ci.field_a == 3) {
                      if (-1 <= (je.field_e.a((byte) 63) ^ -1)) {
                        if ((nj.a(param0 ^ 102) ^ -1L) < (qq.field_I ^ -1L)) {
                          stackIn_32_0 = vk.a(-126, -2);
                          decompiledRegionSelector0 = 2;
                          break L1;
                        } else {
                          break L5;
                        }
                      } else {
                        var1_int = je.field_e.b(1);
                        if (-1 == (var1_int ^ -1)) {
                          ci.field_a = ci.field_a + 1;
                          break L5;
                        } else {
                          stackIn_27_0 = vk.a(param0 + -182, var1_int);
                          decompiledRegionSelector0 = 1;
                          break L1;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  if ((ci.field_a ^ -1) != -5) {
                    stackIn_37_0 = -1;
                    decompiledRegionSelector0 = 4;
                    break L1;
                  } else {
                    gt.field_t.a(je.field_e, 20, ac.field_f);
                    je.field_e = null;
                    ci.field_a = 0;
                    iv.field_o = null;
                    stackIn_35_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return vk.a(-125, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_27_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_32_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_35_0;
                    } else {
                      return stackIn_37_0;
                    }
                  }
                }
              }
            } else {
              if (0 == (gt.field_t.field_l ^ -1)) {
                return 3;
              } else {
                if (gt.field_t.field_l == -2) {
                  return 4;
                } else {
                  return 1;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    fw() {
        this.field_I = false;
        this.field_F = false;
    }

    static {
        field_G = 0.0;
        field_H = "Loading music";
    }
}
