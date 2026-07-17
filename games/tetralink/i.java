/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    private int field_l;
    private int field_x;
    private int field_i;
    private int field_j;
    static int field_e;
    private int field_p;
    private int field_h;
    private boolean field_v;
    private int field_b;
    private int field_q;
    private int field_o;
    static boolean field_w;
    private int field_d;
    private int field_c;
    private int field_g;
    static int[] field_t;
    private int field_s;
    static int field_n;
    private int field_r;
    static int field_f;
    private int field_m;
    private ne field_u;
    private float field_k;
    static ok field_a;

    final static void a(boolean param0, boolean param1) {
        int discarded$0 = -88;
        dg.a(param1);
        cc.b(true, param1);
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        var2 = ((i) this).field_l;
        var3 = ((i) this).field_s;
        if (!((i) this).d(0)) {
          ((i) this).field_v = false;
          return;
        } else {
          L0: {
            if (((i) this).field_q >= var3) {
              if (var3 >= ((i) this).field_j) {
                break L0;
              } else {
                var3 = ((i) this).field_j;
                break L0;
              }
            } else {
              var3 = ((i) this).field_q;
              break L0;
            }
          }
          L1: {
            if (var2 > ((i) this).field_i) {
              var2 = ((i) this).field_i;
              break L1;
            } else {
              if (var2 >= ((i) this).field_c) {
                break L1;
              } else {
                var2 = ((i) this).field_c;
                break L1;
              }
            }
          }
          L2: {
            if (((i) this).field_k <= 0.0f) {
              break L2;
            } else {
              var4 = (int)(0.5f + ((i) this).field_k * (float)var3);
              if (var4 <= var2) {
                if (var2 <= var4) {
                  break L2;
                } else {
                  var2 = var4;
                  break L2;
                }
              } else {
                var3 = (int)((float)var2 / ((i) this).field_k);
                break L2;
              }
            }
          }
          L3: {
            L4: {
              if (var2 != n.field_M) {
                break L4;
              } else {
                if (var3 != d.field_h) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
            ((i) this).field_u.a(var3, -13325, var2);
            break L3;
          }
          L5: {
            if (((i) this).field_l <= 0) {
              break L5;
            } else {
              sa.field_g = (((i) this).field_l - n.field_M) / 2;
              break L5;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        ((i) this).field_s = param0;
        if (param2 < 16) {
            return;
        }
        ((i) this).field_l = param1;
    }

    final void a(byte param0) {
        if (param0 != 36) {
            return;
        }
        ((i) this).field_u.a(((i) this).field_x, -13325, ((i) this).field_d);
    }

    final static void a(boolean param0, int param1) {
        bc var2 = nd.field_Lb;
        var2.f(11, (byte) -92);
        var2.field_t = var2.field_t + 1;
        int var3 = var2.field_t;
        var2.a(5, false);
        var2.a(qb.field_N.field_rc, false);
        int var4 = qb.field_N.field_ic - -(qb.field_N.field_Zb << 6);
        var2.a(var4, false);
        var2.a(0, 128, qb.field_N.field_sc, qb.field_N.field_sc.length);
        var2.b(-var3 + var2.field_t, -2);
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        oa var4 = null;
        o var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        bc var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var27 = kb.field_q;
              var2 = var27.d((byte) -99);
              if (param0 == 1) {
                break L1;
              } else {
                field_n = 56;
                break L1;
              }
            }
            L2: {
              if (var2 != 0) {
                if (var2 != 1) {
                  fk.a(-104, (Throwable) null, "HS1: " + hc.a(false));
                  int discarded$6 = 0;
                  mk.a();
                  break L2;
                } else {
                  var3 = var27.e(param0 ^ 126);
                  var4_ref = (o) (Object) pb.field_f.c(false);
                  L3: while (true) {
                    L4: {
                      if (var4_ref == null) {
                        break L4;
                      } else {
                        if (var3 == var4_ref.field_q) {
                          break L4;
                        } else {
                          var4_ref = (o) (Object) pb.field_f.a((byte) -70);
                          continue L3;
                        }
                      }
                    }
                    if (var4_ref == null) {
                      int discarded$7 = 0;
                      mk.a();
                      return;
                    } else {
                      var4_ref.b(false);
                      break L2;
                    }
                  }
                }
              } else {
                var3 = var27.e(127);
                var4 = (oa) (Object) wc.field_E.c(false);
                L5: while (true) {
                  L6: {
                    if (var4 == null) {
                      break L6;
                    } else {
                      if (var4.field_C != var3) {
                        var4 = (oa) (Object) wc.field_E.a((byte) -70);
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var4 != null) {
                    var5 = var27.d((byte) -99);
                    if (var5 != 0) {
                      var6 = var4.field_z;
                      lh.field_v[0].field_e = ph.field_w;
                      var7 = var4.field_s;
                      lh.field_v[0].field_a = false;
                      lh.field_v[0].field_g = null;
                      var8_int = 1;
                      L7: while (true) {
                        if (var8_int >= var5) {
                          var8 = new String[3][var6];
                          var9 = new String[3][var6];
                          var34 = new long[3][var6];
                          var35 = new int[3][var6 * var7];
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var27.d((byte) -99);
                          if (var18 > 0) {
                            var19 = 0;
                            L8: while (true) {
                              if (var19 < var18) {
                                L9: {
                                  var20 = var27.d((byte) -99);
                                  var21 = lh.field_v[var20].field_e;
                                  var22 = var27.c(255);
                                  var24 = var27.field_t;
                                  if (var19 < var6) {
                                    var8[0][var12] = var21;
                                    var9[0][var12] = lh.field_v[var20].field_g;
                                    var34[0][var12] = var22;
                                    var25 = 0;
                                    L10: while (true) {
                                      if (var7 <= var25) {
                                        var12++;
                                        break L9;
                                      } else {
                                        int incrementValue$8 = var15;
                                        var15++;
                                        var35[0][incrementValue$8] = var27.f(-116);
                                        var25++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                L11: {
                                  if (var21 == null) {
                                    break L11;
                                  } else {
                                    if (!ej.a(var21, param0 ^ 5)) {
                                      break L11;
                                    } else {
                                      var8[1][var13] = ph.field_w;
                                      var9[1][var13] = null;
                                      var34[1][var13] = var22;
                                      var13++;
                                      var27.field_t = var24;
                                      var25 = 0;
                                      L12: while (true) {
                                        if (var7 <= var25) {
                                          break L11;
                                        } else {
                                          int incrementValue$9 = var16;
                                          var16++;
                                          var35[1][incrementValue$9] = var27.f(param0 + 118);
                                          var25++;
                                          continue L12;
                                        }
                                      }
                                    }
                                  }
                                }
                                L13: {
                                  if (var6 <= var14) {
                                    break L13;
                                  } else {
                                    if (!lh.field_v[var20].field_a) {
                                      lh.field_v[var20].field_a = true;
                                      var8[2][var14] = var21;
                                      var9[2][var14] = lh.field_v[var20].field_g;
                                      var34[2][var14] = var22;
                                      var27.field_t = var24;
                                      var14++;
                                      var25 = 0;
                                      L14: while (true) {
                                        if (var7 <= var25) {
                                          break L13;
                                        } else {
                                          int incrementValue$10 = var17;
                                          var17++;
                                          var35[2][incrementValue$10] = var27.f(-111);
                                          var25++;
                                          continue L14;
                                        }
                                      }
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                var19++;
                                continue L8;
                              } else {
                                var4.b(false);
                                break L2;
                              }
                            }
                          } else {
                            var4.b(false);
                            break L2;
                          }
                        } else {
                          L15: {
                            lh.field_v[var8_int].field_e = var27.g((byte) 81);
                            lh.field_v[var8_int].field_a = false;
                            if (var27.d((byte) -99) != 1) {
                              lh.field_v[var8_int].field_g = null;
                              break L15;
                            } else {
                              lh.field_v[var8_int].field_g = var27.g((byte) 81);
                              break L15;
                            }
                          }
                          var8_int++;
                          continue L7;
                        }
                      }
                    } else {
                      var4.b(false);
                      break L2;
                    }
                  } else {
                    int discarded$11 = 0;
                    mk.a();
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "i.C(" + param0 + 41);
        }
    }

    final static boolean a(boolean param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            if (param2 != null) {
              var3_int = param2.length();
              if (var3_int < 1) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = cc.a(param2, (byte) 111);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (var4.length() < 1) {
                        break L1;
                      } else {
                        L2: {
                          if (tk.a((byte) 81, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!tk.a((byte) 81, var4.charAt(var4.length() - 1))) {
                              field_a = null;
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (~var6 <= ~param2.length()) {
                                  if (0 < var5) {
                                    stackOut_31_0 = 0;
                                    stackIn_32_0 = stackOut_31_0;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param2.charAt(var6);
                                    if (tk.a((byte) 81, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (2 > var5) {
                                      break L5;
                                    } else {
                                      if (param0) {
                                        break L5;
                                      } else {
                                        stackOut_26_0 = 0;
                                        stackIn_27_0 = stackOut_26_0;
                                        return stackIn_27_0 != 0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("i.E(").append(param0).append(44).append(0).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
        return stackIn_32_0 != 0;
    }

    final static String e(int param0) {
        if (!(ll.field_C != ma.field_d)) {
            return pl.field_e;
        }
        if (!(oa.field_y.c(false))) {
            return oa.field_y.a((byte) 72);
        }
        if (!(ll.field_C != pi.field_a)) {
            return oa.field_y.a((byte) 72);
        }
        int var1 = 64 % ((68 - param0) / 43);
        return mk.field_d;
    }

    final static void b(boolean param0, int param1) {
        mf.field_s.a(0, 0, -23452);
        if (param1 < 73) {
            field_f = 106;
        }
    }

    final void b(int param0) {
        if (hd.field_u == null) {
          L0: {
            if (0 >= mb.field_C) {
              ((i) this).field_v = false;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0 == 29768) {
              break L1;
            } else {
              i.c(38);
              break L1;
            }
          }
          if (((i) this).field_v) {
            int fieldTemp$4 = ((i) this).field_p - 1;
            ((i) this).field_p = ((i) this).field_p - 1;
            if (fieldTemp$4 > 0) {
              return;
            } else {
              ((i) this).field_p = ((i) this).field_b;
              if (((i) this).field_h > ja.field_a) {
                ((i) this).field_v = false;
                return;
              } else {
                int discarded$5 = -84;
                this.a();
                return;
              }
            }
          } else {
            L2: {
              if (((i) this).field_l <= n.field_M) {
                if (((i) this).field_l > 0) {
                  sa.field_g = 0;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                sa.field_g = (-n.field_M + ((i) this).field_l) / 2;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((i) this).field_g != n.field_M) {
                  break L4;
                } else {
                  if (((i) this).field_m != d.field_h) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              ((i) this).field_u.a(((i) this).field_m, -13325, ((i) this).field_g);
              break L3;
            }
            return;
          }
        } else {
          return;
        }
    }

    final kl b(boolean param0) {
        ((i) this).field_d = n.field_M;
        ((i) this).field_x = d.field_h;
        ((i) this).field_u.a(((i) this).field_o, -13325, ((i) this).field_r);
        ha.field_h = param0 ? true : false;
        kl var2 = bm.a(((i) this).field_o, 0, 0, ((i) this).field_r, 0, nd.field_Pb);
        if (!(var2 != null)) {
            ((i) this).a((byte) 36);
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_t = null;
    }

    private i() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, eh param1) {
        int var4 = 0;
        bc var5 = nd.field_Lb;
        var5.f(4, (byte) -92);
        try {
            var5.field_t = var5.field_t + 1;
            var4 = var5.field_t;
            var5.a(1, false);
            var5.a(param1.field_r, false);
            var5.a(param1.field_y, false);
            var5.d(param1.field_o, (byte) -124);
            var5.d(param1.field_x, (byte) -124);
            var5.d(param1.field_u, (byte) -124);
            var5.d(param1.field_t, (byte) -124);
            int discarded$0 = var5.c(var4, -71);
            var5.b(var5.field_t - var4, -2);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "i.M(" + 4 + 44 + (param1 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final boolean d(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (ja.field_a < ((i) this).field_h) {
                break L1;
              } else {
                if (mb.field_C <= 0) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 640;
        field_f = 0;
        field_a = new ok();
    }
}
