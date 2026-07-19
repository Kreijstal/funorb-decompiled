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
        var2 = this.field_j;
        L0: while (true) {
          if (this.field_p < var2) {
            var2 = -48 % ((19 - param0) / 63);
            dj.field_e.b(true);
            return;
          } else {
            var3 = this.field_q;
            L1: while (true) {
              if (var3 > this.field_m) {
                var2++;
                continue L0;
              } else {
                L2: {
                  stackOut_4_0 = this.field_i.field_A;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (this.field_k != 0) {
                    stackOut_6_0 = (on) ((Object) stackIn_6_0);
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L2;
                  } else {
                    stackOut_5_0 = (on) ((Object) stackIn_5_0);
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                }
                ((on) (Object) stackIn_7_0).a(stackIn_7_1 != 0, 14365, var2, true, var3);
                if (-1 == (this.field_k ^ -1)) {
                  this.field_i.field_b[var2][var3] = true;
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
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 == -516) {
                break L1;
              } else {
                this.field_q = 34;
                break L1;
              }
            }
            L2: {
              var3_int = param0.a(24 * this.field_q, (byte) -118);
              var4 = param0.a(24 * this.field_j, 0);
              var5 = 50;
              if (this.field_l != 0) {
                if (2 != this.field_l) {
                  break L2;
                } else {
                  var5 = this.field_o;
                  break L2;
                }
              } else {
                var5 = this.field_h + -this.field_o;
                break L2;
              }
            }
            L3: {
              var6 = 0;
              var7 = 0;
              if (0 != this.field_k) {
                break L3;
              } else {
                var8 = 47;
                var9 = var8 + (50 - var5) * (-var8 + 255) / 50;
                this.field_r.e(var6 + var3_int, var4 - -var7, var9);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("mn.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        if (!(this.field_l == 0)) {
            this.d((byte) -123);
        }
        if (param0 != 76) {
            this.field_i = (ej) null;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        for (var2 = this.field_j; this.field_p >= var2; var2++) {
            for (var3 = this.field_q; this.field_m >= var3; var3++) {
                this.field_i.field_A.a((1 & this.field_i.field_A.field_t[var2][var3]) != 0 ? true : false, 14365, var2, true, var3);
            }
        }
        if (param0 != 0) {
            this.c((byte) 18);
        }
    }

    final boolean b(boolean param0) {
        int var2_int = 0;
        nb var2 = null;
        nb var3 = null;
        int var4 = 0;
        String var5 = null;
        L0: {
          var4 = ZombieDawn.field_J;
          this.field_o = this.field_o - 1;
          if (param0) {
            break L0;
          } else {
            var5 = (String) null;
            mn.a(80, (String) null, true);
            break L0;
          }
        }
        var2_int = this.field_l;
        if (var2_int != 0) {
          L1: {
            if ((var2_int ^ -1) != -2) {
              if ((var2_int ^ -1) != -3) {
                break L1;
              } else {
                L2: {
                  if (null == this.field_r) {
                    break L2;
                  } else {
                    if (-1 == (this.field_k ^ -1)) {
                      this.field_r.f(0, -1, 0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (this.field_n != null) {
                    var3 = this.field_n.c((byte) 34);
                    L4: while (true) {
                      if (var3 == null) {
                        break L3;
                      } else {
                        L5: {
                          var2 = this.field_n.a((byte) 127);
                          ((ek) ((Object) var3)).field_M = 1;
                          if (((ek) ((Object) var3)).field_G) {
                            ((ek) ((Object) var3)).j(-18475);
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
                if (this.field_o <= 0) {
                  this.a(0);
                  this.b(-27598);
                  return true;
                } else {
                  break L1;
                }
              }
            } else {
              if ((this.field_o ^ -1) >= -51) {
                this.field_l = 2;
                break L1;
              } else {
                break L1;
              }
            }
          }
          return false;
        } else {
          L6: {
            if (null != this.field_r) {
              if (0 == this.field_k) {
                this.field_r.f(0, 1, 0);
                break L6;
              } else {
                break L6;
              }
            } else {
              break L6;
            }
          }
          if (this.field_h + -50 >= this.field_o) {
            L7: {
              if (this.field_k == 0) {
                this.d((byte) -116);
                break L7;
              } else {
                break L7;
              }
            }
            this.field_l = 1;
            return true;
          } else {
            return false;
          }
        }
    }

    private final void a(boolean param0, ej param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              this.field_i = param1;
              this.field_p = -1 + (this.field_j + 2 * je.field_a);
              if (this.field_i.field_A.field_r <= this.field_p) {
                this.field_p = -1 + this.field_i.field_A.field_r;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_m = 2 * je.field_a + (this.field_q - 1);
              if (this.field_m >= this.field_i.field_A.field_k) {
                this.field_m = -1 + this.field_i.field_A.field_k;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.field_l = 0;
              this.field_n = new ra();
              if (-2 != (this.field_k ^ -1)) {
                var3_int = 48 * je.field_a;
                var4 = 48 * je.field_a;
                this.field_r = new vn(var3_int, var4);
                var5_int = this.field_j;
                L4: while (true) {
                  if (this.field_p < var5_int) {
                    L5: {
                      ki.a((byte) -120, this.field_r);
                      var5 = new wk(this.field_i.field_u, this.field_i.field_p);
                      var5.field_u = bd.field_d + this.field_q * 24;
                      var5.field_c = this.field_j * 24 - -nh.field_G;
                      this.field_i.a(var5, false);
                      if (0 != this.field_k) {
                        break L5;
                      } else {
                        bi.d();
                        break L5;
                      }
                    }
                    this.field_i.a(var5, 1, true, false);
                    var11 = dj.field_e.field_R;
                    var7 = var11.b((byte) 26);
                    L6: while (true) {
                      if (var7 == null) {
                        this.field_i.a(var5, 2, true, false);
                        pa.a(-21189);
                        var8 = this.field_j;
                        L7: while (true) {
                          if (this.field_p < var8) {
                            break L3;
                          } else {
                            var9 = this.field_q;
                            L8: while (true) {
                              if (this.field_m < var9) {
                                var8++;
                                continue L7;
                              } else {
                                this.field_i.field_b[var8][var9] = true;
                                var9++;
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        L9: {
                          if (!(var7 instanceof id)) {
                            break L9;
                          } else {
                            if (!(var7 instanceof kc)) {
                              ((fb) ((Object) var7)).a((byte) -93, var5);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var7 = var11.a(false);
                        continue L6;
                      }
                    }
                  } else {
                    var6 = this.field_q;
                    L10: while (true) {
                      if (this.field_m < var6) {
                        var5_int++;
                        continue L4;
                      } else {
                        this.field_i.field_b[var5_int][var6] = false;
                        var6++;
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                var3_int = this.field_j;
                L11: while (true) {
                  if (this.field_p < var3_int) {
                    this.d((byte) 108);
                    break L3;
                  } else {
                    var4 = this.field_q;
                    L12: while (true) {
                      if (this.field_m < var4) {
                        var3_int++;
                        continue L11;
                      } else {
                        L13: {
                          L14: {
                            if (0 != (this.field_i.field_A.field_t[var3_int][var4] & 1)) {
                              break L14;
                            } else {
                              if (!this.field_i.field_b[var3_int][var4]) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          var5_int = 0;
                          L15: while (true) {
                            if (2 <= var5_int) {
                              break L13;
                            } else {
                              var6_ref_ek = ip.a(var4 * 24, 24 * var3_int, 100, true);
                              this.field_n.a(var6_ref_ek, (byte) -116);
                              dj.field_e.field_R.a(var6_ref_ek, -122);
                              var5_int++;
                              continue L15;
                            }
                          }
                        }
                        var4++;
                        continue L12;
                      }
                    }
                  }
                }
              }
            }
            L16: {
              if (!param0) {
                break L16;
              } else {
                this.field_p = -128;
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var3);
            stackOut_45_1 = new StringBuilder().append("mn.E(").append(param0).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L17;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L17;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = ZombieDawn.field_J;
        rc.field_u = new int[]{};
        oo.field_U = new int[]{};
        if (param0) {
            return;
        }
        try {
            tl.field_g = new int[]{};
            for (var1_int = 0; bm.field_a.length > var1_int; var1_int++) {
                bm.field_a[var1_int] = 0;
                hg.field_a[var1_int] = 0;
                si.field_Qb[var1_int] = 0;
                hd.field_u[var1_int] = 0;
            }
            rg.field_J.b(97);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "mn.I(" + param0 + ')');
        }
    }

    final static void a(dj param0, boolean param1) {
        vn var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new vn(param0.a("", -116, "final_frame.jpg"), (java.awt.Component) ((Object) cj.field_d));
            if (!param1) {
                dj var5 = (dj) null;
                mn.a((dj) null, false);
            }
            var3 = var2.field_w;
            var4 = var2.field_t;
            hk.i(1584);
            kh.field_a = new vn(var3, 3 * var4 / 4);
            kh.field_a.a();
            var2.e(0, 0);
            bh.field_j = new vn(var3, -kh.field_a.field_t + var4);
            bh.field_j.a();
            var2.e(0, -kh.field_a.field_t);
            bh.field_j.field_x = kh.field_a.field_t;
            pa.a(-21189);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "mn.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, String param1, boolean param2) {
        try {
            sc.field_a = param2;
            if (param0 != -1) {
                dj var4 = (dj) null;
                mn.a((dj) null, true);
            }
            rc.field_p = f.field_k;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "mn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    mn(ej param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        Object stackIn_2_0 = null;
        Object stackIn_2_1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_3_1 = null;
        Object stackIn_4_0 = null;
        Object stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_1_1 = null;
        Object stackOut_3_0 = null;
        Object stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              param1 = param1 / 24;
              this.field_i = param0;
              param2 = param2 / 24;
              this.field_k = param3;
              stackOut_1_0 = this;
              stackOut_1_1 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (this.field_k == 0) {
                stackOut_3_0 = this;
                stackOut_3_1 = this;
                stackOut_3_2 = 2147483647;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = this;
                stackOut_2_2 = 1000;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              ((mn) (this)).field_o = stackIn_4_2;
              ((mn) (this)).field_h = stackIn_4_2;
              this.field_j = param2 + -je.field_a;
              if (this.field_j >= 0) {
                break L2;
              } else {
                this.field_j = 0;
                break L2;
              }
            }
            L3: {
              this.field_q = -je.field_a + param1;
              if (0 <= this.field_q) {
                break L3;
              } else {
                this.field_q = 0;
                break L3;
              }
            }
            L4: {
              if (this.field_i == null) {
                break L4;
              } else {
                this.a(false, this.field_i);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("mn.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
