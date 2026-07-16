/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends le {
    private int field_l;
    private int field_k;
    private ej field_i;
    private vn field_r;
    private int field_p;
    private int field_q;
    private ra field_n;
    private int field_o;
    private int field_j;
    private int field_h;
    private int field_m;

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        on stackIn_5_0 = null;
        on stackIn_6_0 = null;
        on stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        on stackOut_4_0 = null;
        on stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        on stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var4 = ZombieDawn.field_J;
        var2 = ((mn) this).field_j;
        L0: while (true) {
          if (((mn) this).field_p < var2) {
            var2 = -48 % ((19 - param0) / 63);
            dj.field_e.b(true);
            return;
          } else {
            var3 = ((mn) this).field_q;
            L1: while (true) {
              if (var3 > ((mn) this).field_m) {
                var2++;
                continue L0;
              } else {
                L2: {
                  stackOut_4_0 = ((mn) this).field_i.field_A;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (((mn) this).field_k != 0) {
                    stackOut_6_0 = (on) (Object) stackIn_6_0;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L2;
                  } else {
                    stackOut_5_0 = (on) (Object) stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                }
                ((on) (Object) stackIn_7_0).a(stackIn_7_1 != 0, 14365, var2, true, var3);
                if (-1 == (((mn) this).field_k ^ -1)) {
                  ((mn) this).field_i.field_b[var2][var3] = true;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(wk param0, int param1) {
        int var8 = 0;
        int var9 = 0;
        if (param1 != -516) {
            ((mn) this).field_q = 34;
        }
        int var3 = param0.a(24 * ((mn) this).field_q, (byte) -118);
        int var4 = param0.a(24 * ((mn) this).field_j, 0);
        int var5 = 50;
        if (((mn) this).field_l == 0) {
            var5 = ((mn) this).field_h + -((mn) this).field_o;
        } else {
            if (2 == ((mn) this).field_l) {
                var5 = ((mn) this).field_o;
            }
        }
        int var6 = 0;
        int var7 = 0;
        if (0 == ((mn) this).field_k) {
            var8 = 47;
            var9 = var8 + (50 - var5) * (-var8 + 255) / 50;
            ((mn) this).field_r.e(var6 + var3, var4 - -var7, var9);
        }
    }

    final void c(byte param0) {
        if (!(((mn) this).field_l == 0)) {
            this.d((byte) -123);
        }
        if (param0 != 76) {
            ((mn) this).field_i = null;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        for (var2 = ((mn) this).field_j; ((mn) this).field_p >= var2; var2++) {
            for (var3 = ((mn) this).field_q; ((mn) this).field_m >= var3; var3++) {
                ((mn) this).field_i.field_A.a((1 & ((mn) this).field_i.field_A.field_t[var2][var3]) != 0 ? true : false, 14365, var2, true, var3);
            }
        }
        if (param0 != 0) {
            ((mn) this).c((byte) 18);
        }
    }

    final boolean b(boolean param0) {
        int var2_int = 0;
        nb var2 = null;
        nb var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = ZombieDawn.field_J;
          ((mn) this).field_o = ((mn) this).field_o - 1;
          if (param0) {
            break L0;
          } else {
            var5 = null;
            mn.a(80, (String) null, true);
            break L0;
          }
        }
        var2_int = ((mn) this).field_l;
        if (var2_int != 0) {
          L1: {
            if ((var2_int ^ -1) != -2) {
              if ((var2_int ^ -1) != -3) {
                break L1;
              } else {
                L2: {
                  if (null == ((mn) this).field_r) {
                    break L2;
                  } else {
                    if (-1 == (((mn) this).field_k ^ -1)) {
                      ((mn) this).field_r.f(0, -1, 0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (((mn) this).field_n != null) {
                    var3 = ((mn) this).field_n.c((byte) 34);
                    L4: while (true) {
                      if (var3 == null) {
                        break L3;
                      } else {
                        L5: {
                          var2 = ((mn) this).field_n.a((byte) 127);
                          ((ek) (Object) var3).field_M = 1;
                          if (((ek) (Object) var3).field_G) {
                            ((ek) (Object) var3).j(-18475);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var3 = var2;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (((mn) this).field_o <= 0) {
                  this.a(0);
                  ((mn) this).b(-27598);
                  return true;
                } else {
                  break L1;
                }
              }
            } else {
              if ((((mn) this).field_o ^ -1) >= -51) {
                ((mn) this).field_l = 2;
                break L1;
              } else {
                break L1;
              }
            }
          }
          return false;
        } else {
          L6: {
            if (null != ((mn) this).field_r) {
              if (0 == ((mn) this).field_k) {
                ((mn) this).field_r.f(0, 1, 0);
                break L6;
              } else {
                break L6;
              }
            } else {
              break L6;
            }
          }
          if ((((mn) this).field_h + -50 ^ -1) <= (((mn) this).field_o ^ -1)) {
            L7: {
              if ((((mn) this).field_k ^ -1) == -1) {
                this.d((byte) -116);
                break L7;
              } else {
                break L7;
              }
            }
            ((mn) this).field_l = 1;
            return true;
          } else {
            return false;
          }
        }
    }

    private final void a(boolean param0, ej param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        wk var5 = null;
        int var6 = 0;
        ek var6_ref_ek = null;
        le var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vo var11 = null;
        L0: {
          var10 = ZombieDawn.field_J;
          ((mn) this).field_i = param1;
          ((mn) this).field_p = -1 + (((mn) this).field_j + 2 * je.field_a);
          if (((mn) this).field_i.field_A.field_r <= ((mn) this).field_p) {
            ((mn) this).field_p = -1 + ((mn) this).field_i.field_A.field_r;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((mn) this).field_m = 2 * je.field_a + (((mn) this).field_q - 1);
          if (((mn) this).field_m >= ((mn) this).field_i.field_A.field_k) {
            ((mn) this).field_m = -1 + ((mn) this).field_i.field_A.field_k;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          ((mn) this).field_l = 0;
          ((mn) this).field_n = new ra();
          if (-2 != (((mn) this).field_k ^ -1)) {
            var3 = 48 * je.field_a;
            var4 = 48 * je.field_a;
            ((mn) this).field_r = new vn(var3, var4);
            var5_int = ((mn) this).field_j;
            L3: while (true) {
              if (((mn) this).field_p < var5_int) {
                L4: {
                  ki.a((byte) -120, ((mn) this).field_r);
                  var5 = new wk(((mn) this).field_i.field_u, ((mn) this).field_i.field_p);
                  var5.field_u = bd.field_d + ((mn) this).field_q * 24;
                  var5.field_c = ((mn) this).field_j * 24 - -nh.field_G;
                  ((mn) this).field_i.a(var5, false);
                  if (0 != ((mn) this).field_k) {
                    break L4;
                  } else {
                    bi.d();
                    break L4;
                  }
                }
                ((mn) this).field_i.a(var5, 1, true, false);
                var11 = dj.field_e.field_R;
                var7 = var11.b((byte) 26);
                L5: while (true) {
                  if (var7 == null) {
                    ((mn) this).field_i.a(var5, 2, true, false);
                    pa.a(-21189);
                    var8 = ((mn) this).field_j;
                    L6: while (true) {
                      if (((mn) this).field_p < var8) {
                        break L2;
                      } else {
                        var9 = ((mn) this).field_q;
                        L7: while (true) {
                          if (((mn) this).field_m < var9) {
                            var8++;
                            continue L6;
                          } else {
                            ((mn) this).field_i.field_b[var8][var9] = true;
                            var9++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    L8: {
                      if (!(var7 instanceof id)) {
                        break L8;
                      } else {
                        if (!(var7 instanceof kc)) {
                          ((fb) (Object) var7).a((byte) -93, var5);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var7 = var11.a(false);
                    continue L5;
                  }
                }
              } else {
                var6 = ((mn) this).field_q;
                L9: while (true) {
                  if (((mn) this).field_m < var6) {
                    var5_int++;
                    continue L3;
                  } else {
                    ((mn) this).field_i.field_b[var5_int][var6] = false;
                    var6++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var3 = ((mn) this).field_j;
            L10: while (true) {
              if (((mn) this).field_p < var3) {
                this.d((byte) 108);
                break L2;
              } else {
                var4 = ((mn) this).field_q;
                L11: while (true) {
                  if (((mn) this).field_m < var4) {
                    var3++;
                    continue L10;
                  } else {
                    L12: {
                      if (0 != (((mn) this).field_i.field_A.field_t[var3][var4] & 1)) {
                        break L12;
                      } else {
                        if (((mn) this).field_i.field_b[var3][var4]) {
                          break L12;
                        } else {
                          var4++;
                          continue L11;
                        }
                      }
                    }
                    var5_int = 0;
                    L13: while (true) {
                      if (2 > var5_int) {
                        var6_ref_ek = ip.a(var4 * 24, 24 * var3, 100, true);
                        ((mn) this).field_n.a((nb) (Object) var6_ref_ek, (byte) -116);
                        dj.field_e.field_R.a((le) (Object) var6_ref_ek, -122);
                        var5_int++;
                        continue L13;
                      } else {
                        var4++;
                        continue L11;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L14: {
          if (!param0) {
            break L14;
          } else {
            ((mn) this).field_p = -128;
            break L14;
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = ZombieDawn.field_J;
        rc.field_u = new int[]{};
        oo.field_U = new int[]{};
        if (param0) {
            return;
        }
        tl.field_g = new int[]{};
        for (var1 = 0; bm.field_a.length > var1; var1++) {
            bm.field_a[var1] = 0;
            hg.field_a[var1] = 0;
            si.field_Qb[var1] = 0;
            hd.field_u[var1] = 0;
        }
        rg.field_J.b(97);
    }

    final static void a(dj param0, boolean param1) {
        vn var2 = new vn(param0.a("", -116, "final_frame.jpg"), (java.awt.Component) (Object) cj.field_d);
        if (!param1) {
            Object var5 = null;
            mn.a((dj) null, false);
        }
        int var3 = var2.field_w;
        int var4 = var2.field_t;
        hk.i(1584);
        kh.field_a = new vn(var3, 3 * var4 / 4);
        kh.field_a.a();
        var2.e(0, 0);
        bh.field_j = new vn(var3, -kh.field_a.field_t + var4);
        bh.field_j.a();
        var2.e(0, -kh.field_a.field_t);
        bh.field_j.field_x = kh.field_a.field_t;
        pa.a(-21189);
    }

    final static void a(int param0, String param1, boolean param2) {
        sc.field_a = param2 ? true : false;
        if (param0 != -1) {
            Object var4 = null;
            mn.a((dj) null, true);
        }
        rc.field_p = f.field_k;
    }

    mn(ej param0, int param1, int param2, int param3) {
        param1 = param1 / 24;
        ((mn) this).field_i = param0;
        param2 = param2 / 24;
        ((mn) this).field_k = param3;
        ((mn) this).field_o = ((mn) this).field_k != 0 ? 1000 : 2147483647;
        ((mn) this).field_h = ((mn) this).field_k != 0 ? 1000 : 2147483647;
        ((mn) this).field_j = param2 + -je.field_a;
        if (((mn) this).field_j < 0) {
            ((mn) this).field_j = 0;
        }
        ((mn) this).field_q = -je.field_a + param1;
        if (0 > ((mn) this).field_q) {
            ((mn) this).field_q = 0;
        }
        if (((mn) this).field_i != null) {
            this.a(false, ((mn) this).field_i);
        }
    }

    static {
    }
}
