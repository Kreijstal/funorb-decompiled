/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends cm implements vh {
    static String field_Q;
    static hd field_S;
    private wi field_U;
    static tf field_R;
    static int[] field_T;

    public static void j(byte param0) {
        if (param0 <= 68) {
            return;
        }
        field_Q = null;
        field_T = null;
        field_S = null;
        field_R = null;
    }

    private final void p(int param0) {
        if (!this.field_C) {
            return;
        }
        this.field_C = false;
        if (param0 <= 19) {
            this.p(-32);
        }
    }

    final static int c(boolean param0) {
        if (tj.field_u) {
          return -1;
        } else {
          if (!bo.field_Cb.a(param0, "park")) {
            return bo.field_Cb.a("park", -16248);
          } else {
            tj.field_u = true;
            bn.field_E = ng.a("benches", "park", 2, bo.field_Cb);
            tm.field_w = bg.a("park", bo.field_Cb, (byte) 70, "hotdog");
            pi.field_a = bg.a("park", bo.field_Cb, (byte) 59, "swing");
            ao.field_c = bg.a("park", bo.field_Cb, (byte) 114, "slide");
            ng.field_j = ng.a("trees", "park", 2, bo.field_Cb);
            gw.field_d = ng.a("stains", "park", 2, bo.field_Cb);
            return -1;
          }
        }
    }

    final static void a(qb param0, byte param1) {
        qb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            if (param1 == -119) {
              param0.c((byte) -109);
              var2 = (qb) ((Object) kq.field_yb.g(24009));
              L1: while (true) {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (!var2.a(param1 + 20843, param0)) {
                      break L2;
                    } else {
                      var2 = (qb) ((Object) kq.field_yb.c(33));
                      continue L1;
                    }
                  }
                }
                if (var2 == null) {
                  kq.field_yb.a(param0, 3);
                  return;
                } else {
                  ug.a(var2, 16737894, param0);
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2_ref);
            stackOut_11_1 = new StringBuilder().append("ve.K(");
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    private final wi a(byte param0, jv param1, String param2) {
        wi var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wi stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        wi stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new wi(param2, param1);
              var4.field_r = (gj) ((Object) new op());
              var5 = this.field_i + -6;
              if (param0 == -53) {
                break L1;
              } else {
                field_S = (hd) null;
                break L1;
              }
            }
            this.field_i = this.field_i + 38;
            var4.a(30, param0 ^ -54, 15, -16 + (this.field_n + -14), var5);
            this.a(param0 + -12, var4);
            this.e(-1947);
            stackOut_2_0 = (wi) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("ve.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1, int param2) {
        hn var3 = null;
        var3 = new hn(7, new int[]{param1, param2});
        ii.a(var3, 109);
        if (!param0) {
          field_Q = (String) null;
          return;
        } else {
          return;
        }
    }

    ve(se param0, hh param1) {
        super(param0, 200, 150);
        Object var3 = null;
        fd var4 = null;
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
              if (tr.field_b == param1) {
                var3 = mr.field_bb;
                break L1;
              } else {
                if (param1 == hf.field_a) {
                  this.field_i = this.field_i + 10;
                  var3 = je.field_n;
                  if (!ai.a(99)) {
                    break L1;
                  } else {
                    var3 = lj.field_k;
                    this.field_i = this.field_i + 20;
                    break L1;
                  }
                } else {
                  if (ds.field_d != param1) {
                    break L1;
                  } else {
                    var3 = dr.field_b;
                    this.field_i = this.field_i + 30;
                    break L1;
                  }
                }
              }
            }
            var4 = new fd((String) (var3), (jv) null);
            var4.field_t = 0;
            var4.field_n = this.field_n;
            var4.field_g = 50;
            var4.field_i = 80;
            var4.field_r = (gj) ((Object) new qv(qo.field_k, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(-98, var4);
            this.field_U = this.a((byte) -53, (jv) (this), pg.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("ve.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static void q(int param0) {
        gv discarded$1 = null;
        RuntimeException var1 = null;
        tv var1_ref = null;
        int var2 = 0;
        String[] var3 = null;
        int var4 = 0;
        tv var4_ref_tv = null;
        int var5 = 0;
        int var6 = 0;
        gv var7 = null;
        tv var8 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var8 = h.a(param0 + 45508);
              var1_ref = var8;
              if (var8 == null) {
                break L1;
              } else {
                if (ae.field_D != var8) {
                  var2 = 0;
                  var3 = new String[10];
                  L2: while (true) {
                    L3: {
                      if (10 <= var2) {
                        break L3;
                      } else {
                        if (-1 < (-var2 + -1 + vb.field_j ^ -1)) {
                          break L3;
                        } else {
                          var4_ref_tv = fu.field_b[-var2 + (vb.field_j + -1)];
                          if (var4_ref_tv != ae.field_D) {
                            L4: {
                              if (null != var4_ref_tv.field_s) {
                                var3[var2] = var4_ref_tv.field_s.field_E;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var2++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var4 = 9;
                    L5: while (true) {
                      if (-1 < (var4 ^ -1)) {
                        ae.field_D = var8;
                        break L1;
                      } else {
                        L6: {
                          if (null == var3[var4]) {
                            break L6;
                          } else {
                            if (var3[var4] != "") {
                              discarded$1 = gm.a(var3[var4], false, (byte) -116);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var4--;
                        continue L5;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L7: {
              if ((e.field_j ^ -1) <= -19) {
                break L7;
              } else {
                e.field_j = e.field_j + 1;
                break L7;
              }
            }
            if (param0 == -28033) {
              L8: {
                if (-19 >= (e.field_j ^ -1)) {
                  e.field_j = 18;
                  var7 = (gv) ((Object) js.field_d.b((byte) 126));
                  if (var7 == null) {
                    break L8;
                  } else {
                    ge.a(var7, false);
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              var6 = 0;
              var2 = var6;
              L9: while (true) {
                if (bk.field_c.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L10: {
                    if (null != bk.field_c[var6]) {
                      bk.field_c[var6].a(0);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var6++;
                  continue L9;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "ve.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        wi discarded$2 = null;
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 64) {
                break L1;
              } else {
                var7 = (String) null;
                discarded$2 = this.a((byte) -118, (jv) null, (String) null);
                break L1;
              }
            }
            if (param1 != this.field_U) {
              break L0;
            } else {
              this.p(25);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6);
            stackOut_5_1 = new StringBuilder().append("ve.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_Q = "drew";
        field_R = new tf();
        field_T = new int[]{0, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10, 11, 11, 12, 13, 13, 14, 15, 15, 16, 17, 17, 18, 18, 19, 20, 20, 21, 22, 22, 23, 24, 24, 25, 25, 26, 27, 27, 28, 29, 29, 30, 31, 31, 32, 32, 33, 34, 34, 35, 36, 36, 37, 38, 38, 39, 39, 40, 41, 41, 42, 43, 43, 44, 45, 45, 46, 46, 47, 48, 48, 49, 50, 50, 51, 52, 52, 53, 53, 54, 55, 55, 56, 57, 57, 58, 59, 59, 60, 60, 61, 62, 62, 63, 64, 64, 65, 66, 66, 67, 67, 68, 69, 69, 70, 71, 71, 72, 72, 73, 74, 74, 75, 76, 76, 77, 78, 78, 79, 79, 80, 81, 81, 82, 83, 83, 84, 85, 85, 86, 86, 87, 88, 88, 89, 90, 90, 91, 92, 92, 93, 93, 94, 95, 95, 96, 97, 97, 98, 98, 99, 100, 100, 101, 102, 102, 103, 104, 104, 105, 105, 106, 107, 107, 108, 109, 109, 110, 111, 111, 112, 112, 113, 114, 114, 115, 116, 116, 117, 117, 118, 119, 119, 120, 121, 121, 122, 123, 123, 124, 124, 125, 126, 126, 127, 128, 128, 129, 129, 130, 131, 131, 132, 133, 133, 134, 134, 135, 136, 136, 137, 138, 138, 139, 140, 140, 141, 141, 142, 143, 143, 144, 145, 145, 146, 146, 147, 148, 148, 149, 150, 150, 151, 151, 152, 153, 153, 154, 155, 155, 156, 156, 157, 158, 158, 159, 160, 160, 161, 162, 162, 163, 163, 164, 165, 165, 166, 167, 167, 168, 168, 169, 170, 170, 171, 172, 172, 173, 173, 174, 175, 175, 176, 177, 177, 178, 178, 179, 180, 180, 181, 182, 182, 183, 183, 184, 185, 185, 186, 187, 187, 188, 188, 189, 190, 190, 191, 192, 192, 193, 193, 194, 195, 195, 196, 196, 197, 198, 198, 199, 200, 200, 201, 201, 202, 203, 203, 204, 205, 205, 206, 206, 207, 208, 208, 209, 210, 210, 211, 211, 212, 213, 213, 214, 214, 215, 216, 216, 217, 218, 218, 219, 219, 220, 221, 221, 222, 223, 223, 224, 224, 225, 226, 226, 227, 227, 228, 229, 229, 230, 231, 231, 232, 232, 233, 234, 234, 235, 236, 236, 237, 237, 238, 239, 239, 240, 240, 241, 242, 242, 243, 244, 244, 245, 245, 246, 247, 247, 248, 248, 249, 250, 250, 251, 251, 252, 253, 253, 254, 255, 255, 256, 256, 257, 258, 258, 259, 259, 260, 261, 261, 262, 263, 263, 264, 264, 265, 266, 266, 267, 267, 268, 269, 269, 270, 270, 271, 272, 272, 273, 273, 274, 275, 275, 276, 277, 277, 278, 278, 279, 280, 280, 281, 281, 282, 283, 283, 284, 284, 285, 286, 286, 287, 287, 288, 289, 289, 290, 290, 291, 292, 292, 293, 294, 294, 295, 295, 296, 297, 297, 298, 298, 299, 300, 300, 301, 301, 302, 303, 303, 304, 304, 305, 306, 306, 307, 307, 308, 309, 309, 310, 310, 311, 312, 312, 313, 313, 314, 315, 315, 316, 316, 317, 318, 318, 319, 319, 320, 321, 321, 322, 322, 323, 324, 324, 325, 325, 326, 327, 327, 328, 328, 329, 330, 330, 331, 331, 332, 333, 333, 334, 334, 335, 336, 336, 337, 337, 338, 339, 339, 340, 340, 341, 341, 342, 343, 343, 344, 344, 345, 346, 346, 347, 347, 348, 349, 349, 350, 350, 351, 352, 352, 353, 353, 354, 355, 355, 356, 356, 357, 357, 358, 359, 359, 360, 360, 361, 362, 362, 363, 363, 364, 365, 365, 366, 366, 367, 367, 368, 369, 369, 370, 370, 371, 372, 372, 373, 373, 374, 375, 375, 376, 376, 377, 377, 378, 379, 379, 380, 380, 381, 382, 382, 383, 383, 384, 384, 385, 386, 386, 387, 387, 388, 389, 389, 390, 390, 391, 391, 392, 393, 393, 394, 394, 395, 395, 396, 397, 397, 398, 398, 399, 400, 400, 401, 401, 402, 402, 403, 404, 404, 405, 405, 406, 406, 407, 408, 408, 409, 409, 410, 411, 411, 412, 412, 413, 413, 414, 415, 415, 416, 416, 417, 417, 418, 419, 419, 420, 420, 421, 421, 422, 423, 423, 424, 424, 425, 425, 426, 427, 427, 428, 428, 429, 429, 430, 431, 431, 432, 432, 433, 433, 434, 435, 435, 436, 436, 437, 437, 438, 439, 439, 440, 440, 441, 441, 442, 442, 443, 444, 444, 445, 445, 446, 446, 447, 448, 448, 449, 449, 450, 450, 451, 452, 452, 453, 453, 454, 454, 455, 455, 456, 457, 457, 458, 458, 459, 459, 460, 460, 461, 462, 462, 463, 463, 464, 464, 465, 466, 466, 467, 467, 468, 468, 469, 469, 470, 471, 471, 472, 472, 473, 473, 474, 474, 475, 476, 476, 477, 477, 478, 478, 479, 479, 480, 481, 481, 482, 482, 483, 483, 484, 484, 485, 486, 486, 487, 487, 488, 488, 489, 489, 490, 490, 491, 492, 492, 493, 493, 494, 494, 495, 495, 496, 497, 497, 498, 498, 499, 499, 500, 500, 501, 501, 502, 503, 503, 504, 504, 505, 505, 506, 506, 507, 507, 508, 509, 509, 510, 510, 511, 511, 512, 512, 513, 513, 514, 515, 515, 516, 516, 517, 517, 518, 518, 519, 519, 520, 521, 521, 522, 522, 523, 523, 524, 524, 525, 525, 526, 526, 527, 528, 528, 529, 529, 530, 530, 531, 531, 532, 532, 533, 533, 534, 534, 535, 536, 536, 537, 537, 538, 538, 539, 539, 540, 540, 541, 541, 542, 543, 543, 544, 544, 545, 545, 546, 546, 547, 547, 548, 548, 549, 549, 550, 550, 551, 552, 552, 553, 553, 554, 554, 555, 555, 556, 556, 557, 557, 558, 558, 559, 559, 560, 560, 561, 562, 562, 563, 563, 564, 564, 565, 565, 566, 566, 567, 567, 568, 568, 569, 569, 570, 570, 571, 572, 572, 573, 573, 574, 574, 575, 575, 576, 576, 577, 577, 578, 578, 579, 579, 580, 580, 581, 581, 582, 582, 583, 583, 584, 584, 585, 586, 586, 587, 587, 588, 588, 589, 589, 590, 590, 591, 591, 592, 592, 593, 593, 594, 594, 595, 595, 596, 596, 597, 597, 598, 598, 599, 599, 600, 600, 601, 601, 602, 602, 603, 603, 604, 605, 605, 606, 606, 607, 607, 608, 608, 609, 609, 610, 610, 611, 611, 612, 612, 613, 613, 614, 614, 615, 615, 616, 616, 617, 617, 618, 618, 619, 619, 620, 620, 621, 621, 622, 622, 623, 623, 624, 624, 625, 625, 626, 626, 627, 627, 628, 628, 629, 629, 630, 630, 631, 631, 632, 632, 633, 633, 634, 634, 635, 635, 636, 636, 637, 637, 638, 638, 639, 639, 640, 640, 641, 641, 642, 642, 643, 643, 644, 644, 645, 645, 646, 646, 647, 647, 648, 648, 649, 649, 650, 650, 651, 651, 651, 652, 652, 653, 653, 654, 654, 655, 655, 656, 656, 657, 657, 658, 658, 659, 659, 660, 660, 661, 661, 662, 662, 663, 663, 664, 664, 665, 665, 666, 666, 667, 667, 668, 668, 669, 669, 670, 670, 670, 671, 671, 672, 672, 673, 673, 674, 674, 675, 675, 676, 676, 677, 677, 678, 678, 679, 679, 680, 680, 681, 681, 682, 682, 682, 683, 683, 684, 684, 685, 685, 686, 686, 687, 687, 688, 688, 689, 689, 690, 690, 691, 691, 692, 692, 692, 693, 693, 694, 694, 695, 695, 696, 696, 697, 697, 698, 698, 699, 699, 700, 700, 700, 701, 701, 702, 702, 703, 703, 704, 704, 705, 705, 706, 706, 707, 707, 707, 708, 708, 709, 709, 710, 710, 711, 711, 712, 712, 713, 713, 714, 714, 714, 715, 715, 716, 716, 717, 717, 718, 718, 719, 719, 720, 720, 720, 721, 721, 722, 722, 723, 723, 724, 724, 725, 725, 726, 726, 726, 727, 727, 728, 728, 729, 729, 730, 730, 731, 731, 731, 732, 732, 733, 733, 734, 734, 735, 735, 736, 736, 737, 737, 737, 738, 738, 739, 739, 740, 740, 741, 741, 741, 742, 742, 743, 743, 744, 744, 745, 745, 746, 746, 746, 747, 747, 748, 748, 749, 749, 750, 750, 750, 751, 751, 752, 752, 753, 753, 754, 754, 755, 755, 755, 756, 756, 757, 757, 758, 758, 759, 759, 759, 760, 760, 761, 761, 762, 762, 763, 763, 763, 764, 764, 765, 765, 766, 766, 766, 767, 767, 768, 768, 769, 769, 770, 770, 770, 771, 771, 772, 772, 773, 773, 774, 774, 774, 775, 775, 776, 776, 777, 777, 777, 778, 778, 779, 779, 780, 780, 780, 781, 781, 782, 782, 783, 783, 784, 784, 784, 785, 785, 786, 786, 787, 787, 787, 788, 788, 789, 789, 790, 790, 790, 791, 791, 792, 792, 793, 793, 793, 794, 794, 795, 795, 796, 796, 796, 797, 797, 798, 798, 799, 799, 799, 800, 800, 801, 801, 802, 802, 802, 803, 803, 804, 804, 805, 805, 805, 806, 806, 807, 807, 807, 808, 808, 809, 809, 810, 810, 810, 811, 811, 812, 812, 813, 813, 813, 814, 814, 815, 815, 815, 816, 816, 817, 817, 818, 818, 818, 819, 819, 820, 820, 820, 821, 821, 822, 822, 823, 823, 823, 824, 824, 825, 825, 825, 826, 826, 827, 827, 828, 828, 828, 829, 829, 830, 830, 830, 831, 831, 832, 832, 832, 833, 833, 834, 834, 835, 835, 835, 836, 836, 837, 837, 837, 838, 838, 839, 839, 839, 840, 840, 841, 841, 841, 842, 842, 843, 843, 843, 844, 844, 845, 845, 845, 846, 846, 847, 847, 848, 848, 848, 849, 849, 850, 850, 850, 851, 851, 852, 852, 852, 853, 853, 854, 854, 854, 855, 855, 856, 856, 856, 857, 857, 858, 858, 858, 859, 859, 860, 860, 860, 861, 861, 862, 862, 862, 863, 863, 863, 864, 864, 865, 865, 865, 866, 866, 867, 867, 867, 868, 868, 869, 869, 869, 870, 870, 871, 871, 871, 872, 872, 873, 873, 873, 874, 874, 875, 875, 875, 876, 876, 876, 877, 877, 878, 878, 878, 879, 879, 880, 880, 880, 881, 881, 882, 882, 882, 883, 883, 883, 884, 884, 885, 885, 885, 886, 886, 887, 887, 887, 888, 888, 888, 889, 889, 890, 890, 890, 891, 891, 892, 892, 892, 893, 893, 893, 894, 894, 895, 895, 895, 896, 896, 896, 897, 897, 898, 898, 898, 899, 899, 900, 900, 900, 901, 901, 901, 902, 902, 903, 903, 903, 904, 904, 904, 905, 905, 906, 906, 906, 907, 907, 907, 908, 908, 909, 909, 909, 910, 910, 910, 911, 911, 912, 912, 912, 913, 913, 913, 914, 914, 915, 915, 915, 916, 916, 916, 917, 917, 917, 918, 918, 919, 919, 919, 920, 920, 920, 921, 921, 922, 922, 922, 923, 923, 923, 924, 924, 924, 925, 925, 926, 926, 926, 927, 927, 927, 928, 928, 929, 929, 929, 930, 930, 930, 931, 931, 931, 932, 932, 933, 933, 933, 934, 934, 934, 935, 935, 935, 936, 936, 936, 937, 937, 938, 938, 938, 939, 939, 939, 940, 940, 940, 941, 941, 942, 942, 942, 943, 943, 943, 944, 944, 944, 945, 945, 945, 946, 946, 947, 947, 947, 948, 948, 948, 949, 949, 949, 950, 950, 950, 951, 951, 951, 952, 952, 953, 953, 953, 954, 954, 954, 955, 955, 955, 956, 956, 956, 957, 957, 957, 958, 958, 959, 959, 959, 960, 960, 960, 961, 961, 961, 962, 962, 962, 963, 963, 963, 964, 964, 964, 965, 965, 966, 966, 966, 967, 967, 967, 968, 968, 968, 969, 969, 969, 970, 970, 970, 971, 971, 971, 972, 972, 972, 973, 973, 973, 974, 974, 974, 975, 975, 975, 976, 976, 977, 977, 977, 978, 978, 978, 979, 979, 979, 980, 980, 980, 981, 981, 981, 982, 982, 982, 983, 983, 983, 984, 984, 984, 985, 985, 985, 986, 986, 986, 987, 987, 987, 988, 988, 988, 989, 989, 989, 990, 990, 990, 991, 991, 991, 992, 992, 992, 993, 993, 993, 994, 994, 994, 995, 995, 995, 996, 996, 996, 997, 997, 997, 998, 998, 998, 999, 999, 999, 1000, 1000, 1000, 1001, 1001, 1001, 1002, 1002, 1002, 1003, 1003, 1003, 1004, 1004, 1004, 1005, 1005, 1005, 1006, 1006, 1006, 1007, 1007, 1007, 1008, 1008, 1008, 1009, 1009, 1009, 1010, 1010, 1010, 1010, 1011, 1011, 1011, 1012, 1012, 1012, 1013, 1013, 1013, 1014, 1014, 1014, 1015, 1015, 1015, 1016, 1016, 1016, 1017, 1017, 1017, 1018, 1018, 1018, 1019, 1019, 1019, 1020, 1020, 1020, 1020, 1021, 1021, 1021, 1022, 1022, 1022, 1023, 1023, 1023, 1024, 1024};
    }
}
