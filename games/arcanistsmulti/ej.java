/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ej extends ag {
    private vl field_K;
    static String field_Q;
    private vn field_O;
    private String[] field_I;
    static am field_R;
    static String field_M;
    static String field_H;
    static String field_N;
    static String field_L;
    static String field_P;

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a((byte) -111, param1, param2, param3);
        if (param2 != 0) {
            return;
        }
        if (param0 >= -52) {
            ej.f(-92);
        }
        ac var9 = (ac) ((Object) this.field_r);
        vl var6 = this.field_K;
        if (var6 == null) {
        } else {
            var7 = var9.a((qm) (this), (byte) -90, param1);
            var8 = var9.a(param3, -13372, (qm) (this));
            do {
                oj.a(-32171, var8 - (-var6.field_m + 2), var7 + (var6.field_o + -2), var6.field_n + 2, var6.field_g - -2);
                var6 = var6.field_h;
            } while (var6 != null);
        }
    }

    boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ej.A(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_I == null) {
                  break L2;
                } else {
                  if (this.field_I.length <= param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[param0 - -1];
                var8 = var7;
                var4 = var8;
                if (this.field_I == null) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_I.length) {
                      break L3;
                    } else {
                      var7[var5] = this.field_I[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              this.field_I = var8;
              break L1;
            }
            if (param1 == 0) {
              this.field_I[param0] = param2;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("ej.P(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.a(((ac) ((Object) this.field_r)).b((qm) (this), 1), param3, param2, param0, -123);
        if (param1 != -4) {
            qm var6 = (qm) null;
            this.a((qm) null, 33, 61, 69);
        }
    }

    public static void f(int param0) {
        field_Q = null;
        field_H = null;
        field_R = null;
        field_P = null;
        if (param0 != 20445) {
            ej.a(31, -44);
        }
        field_N = null;
        field_L = null;
        field_M = null;
    }

    final void g(byte param0) {
        int var2 = 0;
        ac var3 = null;
        kh var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        vd var12 = null;
        int var13 = 0;
        int var14 = 0;
        vl var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var16 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 63) {
            break L0;
          } else {
            ej.a(-9);
            break L0;
          }
        }
        this.field_O = new vn();
        var2 = 0;
        var3 = (ac) ((Object) this.field_r);
        var4 = var3.a((qm) (this), -127);
        L1: while (true) {
          var5 = this.field_g.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = this.field_g.indexOf(">", var5);
            var6 = this.field_g.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_g.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) 104, var5);
            var9 = var4.a((byte) 79, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_f[var11];
                  if (var11 != var8) {
                    stackOut_8_0 = var12.field_f[0];
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var4.a(var5, 0);
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var9 != var11) {
                    if (var12 != null) {
                      stackOut_13_0 = var12.field_f[-1 + var12.field_f.length];
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  } else {
                    stackOut_10_0 = var4.a(var2, param0 + -63);
                    stackIn_14_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new vl(var7, var13, var12.field_g, var14 - var13, Math.max(var3.a(27184), var12.field_e + -var12.field_g));
                  if (var10 == null) {
                    break L5;
                  } else {
                    ((vl) (var10)).field_h = var15;
                    break L5;
                  }
                }
                this.field_O.b(var15, -1);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    private final vl a(int param0, byte param1, int param2) {
        vl var4 = null;
        vl var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == 102) {
          var4 = (vl) ((Object) this.field_O.b(12623));
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (vl) ((Object) this.field_O.a(0));
                  continue L0;
                } else {
                  L2: {
                    if (param0 < var5.field_o) {
                      break L2;
                    } else {
                      if (var5.field_m > param2) {
                        break L2;
                      } else {
                        if (param0 >= var5.field_g + var5.field_o) {
                          break L2;
                        } else {
                          if (var5.field_m - -var5.field_n < param2) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_h;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return (vl) null;
        }
    }

    final static void a(int param0, boolean param1) {
        kc stackIn_5_0 = null;
        kc stackIn_6_0 = null;
        kc stackIn_7_0 = null;
        kc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        kc stackIn_9_0 = null;
        kc stackIn_10_0 = null;
        kc stackIn_11_0 = null;
        kc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        kc stackIn_22_0 = null;
        kc stackIn_23_0 = null;
        kc stackIn_24_0 = null;
        kc stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        kc stackIn_26_0 = null;
        kc stackIn_27_0 = null;
        kc stackIn_28_0 = null;
        kc stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        kc stackOut_4_0 = null;
        kc stackOut_5_0 = null;
        kc stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        kc stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        kc stackOut_8_0 = null;
        kc stackOut_9_0 = null;
        kc stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        kc stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        kc stackOut_21_0 = null;
        kc stackOut_22_0 = null;
        kc stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        kc stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        kc stackOut_25_0 = null;
        kc stackOut_26_0 = null;
        kc stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        kc stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          da.a(640 + de.field_e >> 1174433697, de.field_j, param0 ^ -11846, -640 + de.field_e >> -455916895, 0);
          if ((ce.field_h ^ -1) >= -1) {
            break L0;
          } else {
            L1: {
              if (null != oo.field_t) {
                oo.field_t.h(k.field_d.field_T, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_4_0 = k.field_d;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param1) {
                  break L3;
                } else {
                  stackOut_5_0 = (kc) ((Object) stackIn_5_0);
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (pg.field_d) {
                    break L3;
                  } else {
                    stackOut_6_0 = (kc) ((Object) stackIn_6_0);
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = (kc) ((Object) stackIn_7_0);
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L2;
            }
            L4: {
              L5: {
                ((kc) (Object) stackIn_8_0).a(stackIn_8_1 != 0, true);
                stackOut_8_0 = fn.field_e;
                stackIn_11_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (!param1) {
                  break L5;
                } else {
                  stackOut_9_0 = (kc) ((Object) stackIn_9_0);
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (pg.field_d) {
                    break L5;
                  } else {
                    stackOut_10_0 = (kc) ((Object) stackIn_10_0);
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L4;
                  }
                }
              }
              stackOut_11_0 = (kc) ((Object) stackIn_11_0);
              stackOut_11_1 = 0;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L4;
            }
            ((kc) (Object) stackIn_12_0).a(stackIn_12_1 != 0, true);
            break L0;
          }
        }
        L6: {
          if (param0 == -11837) {
            break L6;
          } else {
            field_Q = (String) null;
            break L6;
          }
        }
        L7: {
          L8: {
            if (sm.field_a > 0) {
              break L8;
            } else {
              if (0 < oo.field_y) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          L9: {
            if (oo.field_t != null) {
              oo.field_t.h(hl.field_m.field_T, 0);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            L11: {
              stackOut_21_0 = hl.field_m;
              stackIn_24_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (!param1) {
                break L11;
              } else {
                stackOut_22_0 = (kc) ((Object) stackIn_22_0);
                stackIn_24_0 = stackOut_22_0;
                stackIn_23_0 = stackOut_22_0;
                if (so.field_j) {
                  break L11;
                } else {
                  stackOut_23_0 = (kc) ((Object) stackIn_23_0);
                  stackOut_23_1 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  break L10;
                }
              }
            }
            stackOut_24_0 = (kc) ((Object) stackIn_24_0);
            stackOut_24_1 = 0;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            break L10;
          }
          L12: {
            L13: {
              ((kc) (Object) stackIn_25_0).a(stackIn_25_1 != 0, true);
              stackOut_25_0 = oh.field_h;
              stackIn_28_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (!param1) {
                break L13;
              } else {
                stackOut_26_0 = (kc) ((Object) stackIn_26_0);
                stackIn_28_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (so.field_j) {
                  break L13;
                } else {
                  stackOut_27_0 = (kc) ((Object) stackIn_27_0);
                  stackOut_27_1 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  break L12;
                }
              }
            }
            stackOut_28_0 = (kc) ((Object) stackIn_28_0);
            stackOut_28_1 = 0;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            break L12;
          }
          ((kc) (Object) stackIn_29_0).a(stackIn_29_1 != 0, true);
          break L7;
        }
        oo.c(-15405);
    }

    final static void a(int param0) {
        String var2 = null;
        if (!(null == va.field_e)) {
            var2 = va.field_e;
            String var1 = var2;
            jl.a(99, tj.a(-118, new String[]{var2}, i.field_b));
            va.field_e = null;
        }
        if (param0 < 94) {
            field_P = (String) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, -111);
        this.g((byte) 63);
        if (param4 >= -49) {
            this.field_K = (vl) null;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = (-640 + fh.field_g) / 2;
        int var3 = ea.field_F * ea.field_F;
        if (param0 != 16) {
            return;
        }
        int var4 = var3 - param1 * param1;
        hl.field_m.a(199, -(var4 * 199 / var3) + var2, 90, -4 + de.field_j - 120 + -90, (byte) -120);
        oh.field_h.a(438, 202 + (var2 - -(438 * var4 / var3)), 0, -4 + de.field_j + -120, (byte) -120);
    }

    String b(boolean param0) {
        if (null == this.field_K) {
            return null;
        }
        if (this.field_I == null) {
            return null;
        }
        if (param0) {
            return (String) null;
        }
        if (this.field_K.field_j >= this.field_I.length) {
            return null;
        }
        return this.field_I[this.field_K.field_j];
    }

    ej(String param0, pf param1) {
        super(param0, (wc) null);
        this.field_K = null;
        try {
            this.field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var12_ref_String = null;
        int var13 = 0;
        String var14 = null;
        int var14_int = 0;
        String var15 = null;
        int var17 = 0;
        String var18 = null;
        ml var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        ml var25 = null;
        ml var26 = null;
        String var27 = null;
        ml var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        lg stackIn_11_0 = null;
        String stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        lg stackIn_12_0 = null;
        String stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        lg stackIn_13_0 = null;
        String stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        StringBuilder stackIn_108_0 = null;
        StringBuilder stackIn_109_0 = null;
        StringBuilder stackIn_110_0 = null;
        String stackIn_110_1 = null;
        StringBuilder stackIn_129_0 = null;
        StringBuilder stackIn_130_0 = null;
        StringBuilder stackIn_131_0 = null;
        String stackIn_131_1 = null;
        StringBuilder stackIn_163_0 = null;
        StringBuilder stackIn_164_0 = null;
        StringBuilder stackIn_165_0 = null;
        String stackIn_165_1 = null;
        StringBuilder stackIn_181_0 = null;
        StringBuilder stackIn_182_0 = null;
        StringBuilder stackIn_183_0 = null;
        String stackIn_183_1 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        lg stackOut_10_0 = null;
        String stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        lg stackOut_12_0 = null;
        String stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        lg stackOut_11_0 = null;
        String stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        StringBuilder stackOut_180_0 = null;
        StringBuilder stackOut_182_0 = null;
        String stackOut_182_1 = null;
        StringBuilder stackOut_181_0 = null;
        String stackOut_181_1 = null;
        StringBuilder stackOut_162_0 = null;
        StringBuilder stackOut_164_0 = null;
        String stackOut_164_1 = null;
        StringBuilder stackOut_163_0 = null;
        String stackOut_163_1 = null;
        StringBuilder stackOut_128_0 = null;
        StringBuilder stackOut_130_0 = null;
        String stackOut_130_1 = null;
        StringBuilder stackOut_129_0 = null;
        String stackOut_129_1 = null;
        StringBuilder stackOut_107_0 = null;
        StringBuilder stackOut_109_0 = null;
        String stackOut_109_1 = null;
        StringBuilder stackOut_108_0 = null;
        String stackOut_108_1 = null;
        var17 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = n.field_g.field_nb;
              var3 = 90;
              var4 = lo.field_q + -30 + var2_int;
              var5 = 13;
              var6 = 18;
              var7 = lo.field_q + var2_int + -100;
              stackOut_1_0 = var6;
              stackOut_1_1 = var7;
              stackOut_1_2 = 9;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (!hc.field_f) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = 8421504;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = 16777215;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                break L1;
              }
            }
            L2: {
              de.i(stackIn_4_0, stackIn_4_1, stackIn_4_2, stackIn_4_3);
              de.c(var6, var7, 9, 0);
              if (-1 >= (bm.field_g.field_I ^ -1)) {
                stackOut_6_0 = bm.field_g.field_I;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 6;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              var9 = nj.field_n[var8];
              stackOut_7_0 = var6;
              stackOut_7_1 = var7;
              stackOut_7_2 = 7;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (hc.field_f) {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = var9;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                break L3;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = var9 >> 952805313 & 8355711;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                break L3;
              }
            }
            L4: {
              de.i(stackIn_10_0, stackIn_10_1, stackIn_10_2, stackIn_10_3);
              de.c(var6, var7, 7, 0);
              stackOut_10_0 = mi.field_B;
              stackOut_10_1 = "?";
              stackOut_10_2 = var6;
              stackOut_10_3 = var7 - (-(mi.field_B.field_C / 2) - -(mi.field_B.field_m / 2));
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_12_3 = stackOut_10_3;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              stackIn_11_3 = stackOut_10_3;
              if (!hc.field_f) {
                stackOut_12_0 = (lg) ((Object) stackIn_12_0);
                stackOut_12_1 = (String) ((Object) stackIn_12_1);
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = stackIn_12_3;
                stackOut_12_4 = 8421504;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                stackIn_13_4 = stackOut_12_4;
                break L4;
              } else {
                stackOut_11_0 = (lg) ((Object) stackIn_11_0);
                stackOut_11_1 = (String) ((Object) stackIn_11_1);
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = stackIn_11_3;
                stackOut_11_4 = 16777215;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                stackIn_13_4 = stackOut_11_4;
                break L4;
              }
            }
            L5: {
              ((lg) (Object) stackIn_13_0).b(stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_13_4, 0);
              var10 = -an.field_g + var6;
              var11 = var7 - me.field_I;
              if (var11 * var11 + var10 * var10 >= 81) {
                break L5;
              } else {
                if (!param1) {
                  break L5;
                } else {
                  mf.field_g = -2;
                  de.c(var6, var7, 9, 16777215, 128);
                  var18 = mk.field_L;
                  mi.field_B.a(var18, 5 + var6, -1 + var7, 0, 0);
                  mi.field_B.a(var18, var6 + 4, var7, 0, 0);
                  mi.field_B.a(var18, 5 + var6 + 1, var7, 0, 0);
                  mi.field_B.a(var18, var6 + 5, 1 + var7, 0, 0);
                  mi.field_B.a(var18, 5 + var6, var7, 16777215, 0);
                  break L5;
                }
              }
            }
            L6: {
              if ((bk.field_J.a(-31497) ^ -1) != -9) {
                break L6;
              } else {
                if (12 >= lm.field_f.length) {
                  break L6;
                } else {
                  var4 -= 6;
                  var3 -= 40;
                  break L6;
                }
              }
            }
            var12 = param0;
            L7: while (true) {
              if (var12 >= lm.field_f.length) {
                L8: {
                  if ((ti.field_N ^ -1) != 0) {
                    var3 = 22;
                    var4 = lo.field_q + 387 + (-480 + var2_int);
                    bb.field_g[dd.field_f[ti.field_N]].c(var3, var4);
                    var3 = 75;
                    var4 = var2_int - 480 - -430;
                    tj.field_t.a(tc.field_w[ti.field_N], var3, var4, 16777215, 0);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (mf.field_g <= -1) {
                    break L9;
                  } else {
                    L10: {
                      var3 = 75;
                      if (hc.field_f) {
                        kl.field_A = 256;
                        mo.field_f = vm.field_d[lm.field_f[mf.field_g]];
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        var4 = -50 + var2_int;
                        if (8 != bk.field_J.a(-31497)) {
                          break L12;
                        } else {
                          if (-13 > (lm.field_f.length ^ -1)) {
                            var4 = -(16 * (1 & mf.field_g)) + 450 + -480 + var2_int;
                            var3 = 50 - -(mf.field_g * 22);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var4 = -480 + var2_int + (450 + -(8 * (mf.field_g & 1)));
                      var3 = 90 + 26 * mf.field_g;
                      break L11;
                    }
                    var5 = 24;
                    de.c(var3 + 2, 2 + var4, var5, 0, 128);
                    de.i(var3, var4, var5, 13680256);
                    de.i(var3, var4, var5 + -3, 16777215);
                    de.c(var3, var4, var5, 0);
                    de.c(var3, var4, var5 - 3, 0);
                    bb.field_g[dd.field_f[lm.field_f[mf.field_g]]].c(-20 + var3, -20 + var4);
                    var24 = tc.field_w[lm.field_f[mf.field_g]];
                    var12_ref_String = var24;
                    mi.field_B.b(var12_ref_String, var3, var4 + (-1 + -var5), 0, 0);
                    mi.field_B.b(var12_ref_String, -1 + var3, var4 + -var5, 0, 0);
                    mi.field_B.b(var24, var3 + 1, var4 - var5, 0, 0);
                    mi.field_B.b(var12_ref_String, var3, var4 + 1 + -var5, 0, 0);
                    mi.field_B.b(var12_ref_String, var3, -var5 + var4, 16777215, 0);
                    var12 = bk.field_J.a(lm.field_f[mf.field_g], bk.field_J.d(false), -770226943);
                    if (bk.field_J.a(lm.field_f[mf.field_g], true, bm.field_g.field_bb)) {
                      if (-1 > (var12 ^ -1)) {
                        L13: {
                          stackOut_180_0 = new StringBuilder().append(var12);
                          stackIn_182_0 = stackOut_180_0;
                          stackIn_181_0 = stackOut_180_0;
                          if (1 >= var12) {
                            stackOut_182_0 = (StringBuilder) ((Object) stackIn_182_0);
                            stackOut_182_1 = tc.field_z;
                            stackIn_183_0 = stackOut_182_0;
                            stackIn_183_1 = stackOut_182_1;
                            break L13;
                          } else {
                            stackOut_181_0 = (StringBuilder) ((Object) stackIn_181_0);
                            stackOut_181_1 = tk.field_s;
                            stackIn_183_0 = stackOut_181_0;
                            stackIn_183_1 = stackOut_181_1;
                            break L13;
                          }
                        }
                        L14: {
                          var14 = stackIn_183_1;
                          if (-1 != hh.field_b[lm.field_f[mf.field_g]]) {
                            break L14;
                          } else {
                            var14 = mj.field_x;
                            break L14;
                          }
                        }
                        mi.field_B.a(var14, var5 + var3, -1 + var4, 0, 0);
                        mi.field_B.a(var14, var3 - (-var5 - -1), var4, 0, 0);
                        mi.field_B.a(var14, var3 - -var5 + 1, var4, 0, 0);
                        mi.field_B.a(var14, var5 + var3, 1 + var4, 0, 0);
                        mi.field_B.a(var14, var5 + var3, var4, 16777215, 0);
                        break L9;
                      } else {
                        break L9;
                      }
                    } else {
                      L15: {
                        de.c(var3, var4, var5, 0, 192);
                        if (11 == lm.field_f[mf.field_g]) {
                          break L15;
                        } else {
                          L16: {
                            if (93 != lm.field_f[mf.field_g]) {
                              break L16;
                            } else {
                              if (bk.field_J.a(bm.field_g.field_bb, true).o(-22625) != 33) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L17: {
                            if (-96 != (lm.field_f[mf.field_g] ^ -1)) {
                              break L17;
                            } else {
                              if (bk.field_J.a(bm.field_g.field_bb, true).o(-22625) != 31) {
                                break L15;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            if (!bk.field_J.field_f) {
                              break L18;
                            } else {
                              if (!bk.field_J.d((byte) 66, lm.field_f[mf.field_g])) {
                                L19: {
                                  var31 = s.field_a;
                                  if ((8 + mi.field_B.b(var31) + var5 + var3 ^ -1) < -641) {
                                    var3 = 640 + (-var5 + -mi.field_B.b(var31) - 8);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                mi.field_B.a(var31, var5 + var3, -1 + var4, 0, 0);
                                mi.field_B.a(var31, var5 + (var3 - 1), var4, 0, 0);
                                mi.field_B.a(var31, 1 + (var5 + var3), var4, 0, 0);
                                mi.field_B.a(var31, var3 + var5, 1 + var4, 0, 0);
                                mi.field_B.a(var31, var3 - -var5, var4, 16777215, 0);
                                break L9;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if ((lm.field_f[mf.field_g] ^ -1) == -151) {
                            L20: {
                              var30 = bj.field_jb;
                              if (-641 <= (var5 + (var3 - (-mi.field_B.b(var30) + -8)) ^ -1)) {
                                break L20;
                              } else {
                                var3 = -8 - (mi.field_B.b(var30) + var5) + 640;
                                break L20;
                              }
                            }
                            mi.field_B.a(var30, var5 + var3, -1 + var4, 0, 0);
                            mi.field_B.a(var30, var3 + var5 - 1, var4, 0, 0);
                            mi.field_B.a(var30, 1 + var3 - -var5, var4, 0, 0);
                            mi.field_B.a(var30, var5 + var3, 1 + var4, 0, 0);
                            mi.field_B.a(var30, var3 - -var5, var4, 16777215, 0);
                            break L9;
                          } else {
                            if (-1 > (var12 ^ -1)) {
                              if (hh.field_b[lm.field_f[mf.field_g]] == 0) {
                                break L9;
                              } else {
                                var14_int = le.field_d[lm.field_f[mf.field_g]] + -(bk.field_J.n((byte) -75) / bk.field_J.s(0));
                                if (-1 > (var14_int ^ -1)) {
                                  L21: {
                                    stackOut_162_0 = new StringBuilder().append(var14_int);
                                    stackIn_164_0 = stackOut_162_0;
                                    stackIn_163_0 = stackOut_162_0;
                                    if (-2 > (var14_int ^ -1)) {
                                      stackOut_164_0 = (StringBuilder) ((Object) stackIn_164_0);
                                      stackOut_164_1 = ki.field_x;
                                      stackIn_165_0 = stackOut_164_0;
                                      stackIn_165_1 = stackOut_164_1;
                                      break L21;
                                    } else {
                                      stackOut_163_0 = (StringBuilder) ((Object) stackIn_163_0);
                                      stackOut_163_1 = tg.field_g;
                                      stackIn_165_0 = stackOut_163_0;
                                      stackIn_165_1 = stackOut_163_1;
                                      break L21;
                                    }
                                  }
                                  L22: {
                                    var29 = stackIn_165_1;
                                    if (640 >= mi.field_B.b(var29) + (var5 + var3 - -8)) {
                                      break L22;
                                    } else {
                                      var3 = -var5 - mi.field_B.b(var29) - 8 + 640;
                                      break L22;
                                    }
                                  }
                                  mi.field_B.a(var29, var3 + var5, -1 + var4, 0, 0);
                                  mi.field_B.a(var29, var5 + (var3 + -1), var4, 0, 0);
                                  mi.field_B.a(var29, var3 + var5 - -1, var4, 0, 0);
                                  mi.field_B.a(var29, var3 + var5, 1 + var4, 0, 0);
                                  mi.field_B.a(var29, var5 + var3, var4, 16777215, 0);
                                  break L9;
                                } else {
                                  L23: {
                                    var15 = qa.field_k;
                                    var28 = bk.field_J.a(bm.field_g.field_bb, true);
                                    if ((var28.o(param0 ^ -22625) ^ -1) == -20) {
                                      var15 = sc.field_T;
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  L24: {
                                    if (-19 == (var28.o(-22625) ^ -1)) {
                                      var15 = bj.field_sb;
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  L25: {
                                    if (16 != var28.o(-22625)) {
                                      break L25;
                                    } else {
                                      var15 = oi.field_a;
                                      break L25;
                                    }
                                  }
                                  L26: {
                                    if (cf.field_f) {
                                      var15 = tk.field_p;
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  L27: {
                                    if ((lm.field_f[mf.field_g] ^ -1) != -88) {
                                      break L27;
                                    } else {
                                      if ((var28.o(-22625) ^ -1) == -20) {
                                        break L27;
                                      } else {
                                        var15 = hc.field_g;
                                        break L27;
                                      }
                                    }
                                  }
                                  L28: {
                                    if (lm.field_f[mf.field_g] != 87) {
                                      break L28;
                                    } else {
                                      if ((var28.o(param0 + -22625) ^ -1) == -20) {
                                        var15 = rc.field_l;
                                        break L28;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  L29: {
                                    if ((lm.field_f[mf.field_g] ^ -1) != -117) {
                                      break L29;
                                    } else {
                                      var15 = hc.field_g;
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (-5 == (lm.field_f[mf.field_g] ^ -1)) {
                                      var15 = "Being entangled blocks this spell.";
                                      break L30;
                                    } else {
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (mi.field_B.b(var15) + var5 + (var3 - -8) <= 640) {
                                      break L31;
                                    } else {
                                      var3 = -8 - mi.field_B.b(var15) - (var5 - 640);
                                      break L31;
                                    }
                                  }
                                  mi.field_B.a(var15, var3 - -var5, var4 - 1, 0, 0);
                                  mi.field_B.a(var15, -1 + var5 + var3, var4, 0, 0);
                                  mi.field_B.a(var15, var3 - (-var5 + -1), var4, 0, 0);
                                  mi.field_B.a(var15, var5 + var3, 1 + var4, 0, 0);
                                  mi.field_B.a(var15, var3 - -var5, var4, 16777215, 0);
                                  break L9;
                                }
                              }
                            } else {
                              if (0 == (hh.field_b[lm.field_f[mf.field_g]] ^ -1)) {
                                var14_int = bk.field_J.b(lm.field_f[mf.field_g], -102, bk.field_J.d(false));
                                if (var14_int > 0) {
                                  L32: {
                                    stackOut_128_0 = new StringBuilder().append(var14_int);
                                    stackIn_130_0 = stackOut_128_0;
                                    stackIn_129_0 = stackOut_128_0;
                                    if (-2 > (var14_int ^ -1)) {
                                      stackOut_130_0 = (StringBuilder) ((Object) stackIn_130_0);
                                      stackOut_130_1 = ki.field_x;
                                      stackIn_131_0 = stackOut_130_0;
                                      stackIn_131_1 = stackOut_130_1;
                                      break L32;
                                    } else {
                                      stackOut_129_0 = (StringBuilder) ((Object) stackIn_129_0);
                                      stackOut_129_1 = tg.field_g;
                                      stackIn_131_0 = stackOut_129_0;
                                      stackIn_131_1 = stackOut_129_1;
                                      break L32;
                                    }
                                  }
                                  L33: {
                                    var27 = stackIn_131_1;
                                    if ((var5 + (var3 - -mi.field_B.b(var27)) + 8 ^ -1) >= -641) {
                                      break L33;
                                    } else {
                                      var3 = -8 - (var5 + (mi.field_B.b(var27) - 640));
                                      break L33;
                                    }
                                  }
                                  mi.field_B.a(var27, var3 + var5, -1 + var4, 0, 0);
                                  mi.field_B.a(var27, var5 + (var3 + -1), var4, 0, 0);
                                  mi.field_B.a(var27, var3 - -var5 - -1, var4, 0, 0);
                                  mi.field_B.a(var27, var3 - -var5, 1 + var4, 0, 0);
                                  mi.field_B.a(var27, var5 + var3, var4, 16777215, 0);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              } else {
                                if (-1 == (hh.field_b[lm.field_f[mf.field_g]] ^ -1)) {
                                  L34: {
                                    var14_int = le.field_d[lm.field_f[mf.field_g]] + -(bk.field_J.n((byte) -75) / bk.field_J.s(0));
                                    stackOut_107_0 = new StringBuilder().append(var14_int);
                                    stackIn_109_0 = stackOut_107_0;
                                    stackIn_108_0 = stackOut_107_0;
                                    if (-2 > (var14_int ^ -1)) {
                                      stackOut_109_0 = (StringBuilder) ((Object) stackIn_109_0);
                                      stackOut_109_1 = ki.field_x;
                                      stackIn_110_0 = stackOut_109_0;
                                      stackIn_110_1 = stackOut_109_1;
                                      break L34;
                                    } else {
                                      stackOut_108_0 = (StringBuilder) ((Object) stackIn_108_0);
                                      stackOut_108_1 = tg.field_g;
                                      stackIn_110_0 = stackOut_108_0;
                                      stackIn_110_1 = stackOut_108_1;
                                      break L34;
                                    }
                                  }
                                  L35: {
                                    var15 = stackIn_110_1;
                                    if (0 <= var14_int) {
                                      break L35;
                                    } else {
                                      var15 = "";
                                      break L35;
                                    }
                                  }
                                  L36: {
                                    if (-105 != (lm.field_f[mf.field_g] ^ -1)) {
                                      break L36;
                                    } else {
                                      var15 = tk.field_p;
                                      break L36;
                                    }
                                  }
                                  L37: {
                                    L38: {
                                      var26 = bk.field_J.a(bm.field_g.field_bb, true);
                                      if (-125 == (lm.field_f[mf.field_g] ^ -1)) {
                                        break L38;
                                      } else {
                                        if ((lm.field_f[mf.field_g] ^ -1) != -131) {
                                          break L37;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    if (!var26.c(false)) {
                                      break L37;
                                    } else {
                                      var15 = qn.field_kb;
                                      break L37;
                                    }
                                  }
                                  L39: {
                                    if (-19 == (var26.o(-22625) ^ -1)) {
                                      var15 = bj.field_sb;
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  L40: {
                                    if (-17 == (var26.o(-22625) ^ -1)) {
                                      var15 = oi.field_a;
                                      break L40;
                                    } else {
                                      break L40;
                                    }
                                  }
                                  mi.field_B.a(var15, var3 + var5, var4 + -1, 0, 0);
                                  mi.field_B.a(var15, -1 + (var5 + var3), var4, 0, 0);
                                  mi.field_B.a(var15, 1 + var3 - -var5, var4, 0, 0);
                                  mi.field_B.a(var15, var5 + var3, 1 + var4, 0, 0);
                                  mi.field_B.a(var15, var3 - -var5, var4, 16777215, 0);
                                  break L9;
                                } else {
                                  if (0 <= var12) {
                                    break L9;
                                  } else {
                                    L41: {
                                      var14 = qa.field_k;
                                      var25 = bk.field_J.a(bm.field_g.field_bb, true);
                                      if (18 == var25.o(-22625)) {
                                        var14 = bj.field_sb;
                                        break L41;
                                      } else {
                                        break L41;
                                      }
                                    }
                                    L42: {
                                      if (16 == var25.o(-22625)) {
                                        var14 = oi.field_a;
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                    mi.field_B.a(var14, var5 + var3, var4 - 1, 0, 0);
                                    mi.field_B.a(var14, var5 + var3 - 1, var4, 0, 0);
                                    mi.field_B.a(var14, var5 + (var3 + 1), var4, 0, 0);
                                    mi.field_B.a(var14, var5 + var3, 1 + var4, 0, 0);
                                    mi.field_B.a(var14, var3 - -var5, var4, 16777215, 0);
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L43: {
                        var32 = "";
                        var14 = var32;
                        var14 = var32;
                        var14 = var32;
                        if ((mi.field_B.b(var32) + var5 + var3 + 8 ^ -1) >= -641) {
                          break L43;
                        } else {
                          var3 = -mi.field_B.b(var32) - (var5 + 8) + 640;
                          break L43;
                        }
                      }
                      mi.field_B.a(var32, var5 + var3, -1 + var4, 0, 0);
                      mi.field_B.a(var14, -1 + (var3 - -var5), var4, 0, 0);
                      mi.field_B.a(var32, 1 + (var3 + var5), var4, 0, 0);
                      mi.field_B.a(var32, var5 + var3, 1 + var4, 0, 0);
                      mi.field_B.a(var14, var5 + var3, var4, 16777215, 0);
                      break L9;
                    }
                  }
                }
                vh.field_n = true;
                break L0;
              } else {
                if ((lm.field_f[var12] ^ -1) < 0) {
                  L44: {
                    L45: {
                      if (-9 != (bk.field_J.a(param0 + -31497) ^ -1)) {
                        break L45;
                      } else {
                        if ((lm.field_f.length ^ -1) < -13) {
                          L46: {
                            if (0 != (var12 & 1)) {
                              var4 -= 16;
                              break L46;
                            } else {
                              var4 += 16;
                              break L46;
                            }
                          }
                          var3 -= 4;
                          break L44;
                        } else {
                          break L45;
                        }
                      }
                    }
                    if ((1 & var12) == 0) {
                      var4 += 8;
                      break L44;
                    } else {
                      var4 -= 8;
                      break L44;
                    }
                  }
                  L47: {
                    de.c(2 + var3, var4 + 2, var5, 0, 128);
                    de.i(var3, var4, var5, 13680256);
                    de.i(var3, var4, -3 + var5, 16777215);
                    de.c(var3, var4, var5, 0);
                    de.c(var3, var4, var5 - 3, 0);
                    bb.field_g[dd.field_f[lm.field_f[var12]]].b(var3 - 9, -9 + var4);
                    if (bk.field_J.a(lm.field_f[var12], true, bm.field_g.field_bb)) {
                      var13 = bk.field_J.a(lm.field_f[var12], bk.field_J.d(false), param0 + -770226943);
                      if (-1 <= (var13 ^ -1)) {
                        break L47;
                      } else {
                        if (0 >= hh.field_b[lm.field_f[var12]]) {
                          break L47;
                        } else {
                          var23 = Integer.toString(var13);
                          mi.field_B.c(var23, var3 + (var5 / 2 + -1), 10 + var4, 0, 0);
                          mi.field_B.c(var23, var3 - -(var5 / 2), -1 + (10 + var4), 0, 0);
                          mi.field_B.c(var23, var5 / 2 + var3, var4 - -10, 16777215, 0);
                          break L47;
                        }
                      }
                    } else {
                      de.c(var3, var4, var5, 0, 192);
                      var13 = bk.field_J.a(lm.field_f[var12], bk.field_J.d(false), -770226943);
                      if (bk.field_J.field_f) {
                        if (-12 == (lm.field_f[var12] ^ -1)) {
                          break L47;
                        } else {
                          bb.field_g[90].b(var3 - 9, var4 + -9);
                          break L47;
                        }
                      } else {
                        L48: {
                          if ((var13 ^ -1) < -1) {
                            break L48;
                          } else {
                            if ((lm.field_f[var12] ^ -1) == -38) {
                              break L48;
                            } else {
                              if (hh.field_b[lm.field_f[var12]] == -1) {
                                var14_int = bk.field_J.b(lm.field_f[var12], param0 + -102, bk.field_J.d(false));
                                if (-1 <= (var14_int ^ -1)) {
                                  break L47;
                                } else {
                                  var21 = Integer.toString(var14_int);
                                  mi.field_B.c(var21, -1 + var3 - -(var5 / 2), 10 + var4, 0, 0);
                                  mi.field_B.c(var21, var5 / 2 + var3, 10 + (var4 - 1), 0, 0);
                                  mi.field_B.c(var21, var5 / 2 + var3, var4 + 10, 16711680, 0);
                                  break L47;
                                }
                              } else {
                                L49: {
                                  if (hh.field_b[lm.field_f[var12]] != 0) {
                                    break L49;
                                  } else {
                                    if (150 == lm.field_f[var12]) {
                                      break L49;
                                    } else {
                                      if (104 == lm.field_f[var12]) {
                                        break L49;
                                      } else {
                                        if (-12 == (lm.field_f[var12] ^ -1)) {
                                          break L49;
                                        } else {
                                          L50: {
                                            L51: {
                                              var14 = "";
                                              var19 = bk.field_J.a(bm.field_g.field_bb, true);
                                              if ((lm.field_f[var12] ^ -1) == -125) {
                                                break L51;
                                              } else {
                                                if (lm.field_f[var12] != 130) {
                                                  break L50;
                                                } else {
                                                  break L51;
                                                }
                                              }
                                            }
                                            if (!var19.c(false)) {
                                              break L50;
                                            } else {
                                              var14 = "X";
                                              break L50;
                                            }
                                          }
                                          mi.field_B.c(var14, var3 - -(var5 / 2) + -1, 10 + var4, 0, 0);
                                          mi.field_B.c(var14, var5 / 2 + var3, 10 + var4 - 1, 0, 0);
                                          mi.field_B.c(var14, var5 / 2 + var3, 10 + var4, 16711680, 0);
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (0 != (var13 ^ -1)) {
                                  break L47;
                                } else {
                                  var20 = "X";
                                  var14 = var20;
                                  mi.field_B.c(var20, var5 / 2 + var3 - 1, var4 + 10, 0, 0);
                                  mi.field_B.c(var20, var5 / 2 + var3, 10 + (var4 + -1), 0, 0);
                                  mi.field_B.c(var14, var3 - -(var5 / 2), var4 + 10, 16711680, 0);
                                  break L47;
                                }
                              }
                            }
                          }
                        }
                        if ((le.field_d[lm.field_f[var12]] + -(bk.field_J.n((byte) -75) / bk.field_J.s(0)) ^ -1) < -1) {
                          var22 = Integer.toString(le.field_d[lm.field_f[var12]] + -(bk.field_J.n((byte) -75) / bk.field_J.s(0)));
                          mi.field_B.c(var22, -1 + var3 + var5 / 2, 10 + var4, 0, 0);
                          mi.field_B.c(var22, var5 / 2 + var3, -1 + var4 + 10, 0, 0);
                          mi.field_B.c(var22, var5 / 2 + var3, 10 + var4, 16711680, 0);
                          break L47;
                        } else {
                          L52: {
                            L53: {
                              var14 = "X";
                              if (-88 == (lm.field_f[var12] ^ -1)) {
                                break L53;
                              } else {
                                if (116 != lm.field_f[var12]) {
                                  break L52;
                                } else {
                                  break L53;
                                }
                              }
                            }
                            var14 = Integer.toString(var13);
                            break L52;
                          }
                          mi.field_B.c(var14, -1 + var3 - -(var5 / 2), 10 + var4, 0, 0);
                          mi.field_B.c(var14, var3 - -(var5 / 2), -1 + var4 + 10, 0, 0);
                          mi.field_B.c(var14, var3 + var5 / 2, 10 + var4, 16711680, 0);
                          break L47;
                        }
                      }
                    }
                  }
                  L54: {
                    if (!param1) {
                      break L54;
                    } else {
                      if (an.field_g < var3 + -12) {
                        break L54;
                      } else {
                        if (var4 + -12 > me.field_I) {
                          break L54;
                        } else {
                          if (an.field_g >= var3 - -14) {
                            break L54;
                          } else {
                            if (var4 + 14 <= me.field_I) {
                              break L54;
                            } else {
                              mf.field_g = var12;
                              break L54;
                            }
                          }
                        }
                      }
                    }
                  }
                  var3 += 26;
                  var12++;
                  continue L7;
                } else {
                  var12++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ej.L(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 > -99) {
            return;
        }
        super.a(-114, param1, param2, param3);
        int var5 = -this.field_n + param1;
        int var6 = -this.field_j + param3;
        vl var7 = this.a(var5, (byte) 102, var6);
        if (var7 != null) {
            if (!(this.field_o == null)) {
                ((pj) ((Object) this.field_o)).a(param2, (ej) (this), -1607, var7.field_j);
            }
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
              super.a(param0, param1, param2 ^ 0, param3);
              this.field_K = null;
              if (!this.field_w) {
                break L1;
              } else {
                var5_int = -param1 + (an.field_g + -this.field_n);
                var6 = -this.field_j + me.field_I - param3;
                this.field_K = this.a(var5_int, (byte) 102, var6);
                break L1;
              }
            }
            L2: {
              if (param2 == 170) {
                break L2;
              } else {
                field_Q = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("ej.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_Q = "Now the Fire Ball spell is selected, you will see an aiming arc in front of your Arcanist. This arc will fill up as you hold down the mouse button, which sets the spell's initial velocity. Try shooting the target in front of you.";
        field_R = new am();
        field_N = "MOST MINIONS - ";
        field_H = "Played";
        field_M = "Book of Overlight";
        field_L = "Kick";
        field_P = "Click to buy this spell for 3 wands.";
    }
}
