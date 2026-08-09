/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends gd {
    static boolean field_o;
    static int field_j;
    static String[] field_m;
    static int field_l;
    static String[] field_k;
    static int[][] field_i;
    private static int[][] field_n;

    final static void a(int param0, boolean param1) {
        if (param1) {
          if (kf.field_U == null) {
            if (of.a(-969)) {
              if (hf.a(wi.field_b, 0)) {
                kf.field_U = oc.a(0, 0, 480, -123, wi.field_b, 640);
                if (null == kf.field_U) {
                  if (param0 == -29486) {
                    return;
                  } else {
                    em.b(true);
                    return;
                  }
                } else {
                  am.a(kf.field_U, 114);
                  if (param0 == -29486) {
                    return;
                  } else {
                    em.b(true);
                    return;
                  }
                }
              } else {
                L0: {
                  if (param1) {
                    break L0;
                  } else {
                    if (kf.field_U != null) {
                      om.a(-46342, kf.field_U);
                      kd.field_b.requestFocus();
                      kf.field_U.a(wi.field_b, param0 ^ -29472);
                      kf.field_U = null;
                      break L0;
                    } else {
                      if (param0 != -29486) {
                        em.b(true);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (param0 != -29486) {
                  em.b(true);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  if (kf.field_U != null) {
                    om.a(-46342, kf.field_U);
                    kd.field_b.requestFocus();
                    kf.field_U.a(wi.field_b, param0 ^ -29472);
                    kf.field_U = null;
                    break L1;
                  } else {
                    if (param0 != -29486) {
                      em.b(true);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param0 != -29486) {
                em.b(true);
                return;
              } else {
                return;
              }
            }
          } else {
            L2: {
              if (param1) {
                break L2;
              } else {
                if (kf.field_U != null) {
                  om.a(-46342, kf.field_U);
                  kd.field_b.requestFocus();
                  kf.field_U.a(wi.field_b, param0 ^ -29472);
                  kf.field_U = null;
                  break L2;
                } else {
                  if (param0 != -29486) {
                    em.b(true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 != -29486) {
              em.b(true);
              return;
            } else {
              return;
            }
          }
        } else {
          if (kf.field_U != null) {
            om.a(-46342, kf.field_U);
            kd.field_b.requestFocus();
            kf.field_U.a(wi.field_b, param0 ^ -29472);
            kf.field_U = null;
            if (param0 != -29486) {
              em.b(true);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != -29486) {
              em.b(true);
              return;
            } else {
              return;
            }
          }
        }
    }

    final fd a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        fd stackIn_3_0 = null;
        fd stackIn_10_0 = null;
        fd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            if (!ik.a(var5, true)) {
              stackIn_3_0 = g.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var3_int = mo.a(var6, (byte) -116);
                if (param1 > 52) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a((String) null, (byte) 76);
                  break L1;
                }
              }
              L2: {
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) >= -131) {
                    stackIn_12_0 = tg.field_d;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_10_0 = g.field_k;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("em.N(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static String b(boolean param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var12;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        var5 = HoldTheLine.field_D;
        if (!param0) {
          var18 = "(" + ab.field_pb + " " + hc.field_e + " " + rd.field_l + ") " + vn.field_c;
          var1 = var18;
          if (-1 > (ad.field_c ^ -1)) {
            var1 = var18 + ":";
            var2 = 0;
            L0: while (true) {
              if (ad.field_c > var2) {
                L1: {
                  var19 = var1 + ' ';
                  var3 = rd.field_e.field_i[var2] & 255;
                  var4 = var3 >> -1583350908;
                  if (10 <= var4) {
                    var4 += 55;
                    break L1;
                  } else {
                    var4 += 48;
                    break L1;
                  }
                }
                L2: {
                  var3 = var3 & 15;
                  var20 = var19 + (char)var4;
                  if (var3 < 10) {
                    var3 += 48;
                    break L2;
                  } else {
                    var3 += 55;
                    break L2;
                  }
                }
                var1 = var20 + (char)var3;
                var2++;
                continue L0;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        } else {
          field_o = true;
          var12 = "(" + ab.field_pb + " " + hc.field_e + " " + rd.field_l + ") " + vn.field_c;
          var1 = var12;
          if (-1 > (ad.field_c ^ -1)) {
            var1 = var12 + ":";
            var2 = 0;
            L3: while (true) {
              if (ad.field_c > var2) {
                L4: {
                  var16 = var1 + ' ';
                  var3 = rd.field_e.field_i[var2] & 255;
                  var4 = var3 >> -1583350908;
                  if (10 <= var4) {
                    var4 += 55;
                    break L4;
                  } else {
                    var4 += 48;
                    break L4;
                  }
                }
                L5: {
                  var3 = var3 & 15;
                  var17 = var16 + (char)var4;
                  if (var3 < 10) {
                    var3 += 48;
                    break L5;
                  } else {
                    var3 += 55;
                    break L5;
                  }
                }
                var1 = var17 + (char)var3;
                var2++;
                continue L3;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        }
    }

    public static void g(int param0) {
        field_n = (int[][]) null;
        field_k = null;
        field_m = null;
        int var1 = -100 % ((param0 - -65) / 53);
        field_i = (int[][]) null;
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = HoldTheLine.field_D;
        try {
          L0: {
            ka.field_b.a(go.field_e, lh.field_b, param0, false);
            ka.field_b.g((byte) -59);
            L1: while (true) {
              if (!qh.c(-99)) {
                if (-1 != v.field_B) {
                  var1_int = v.field_B;
                  go.a(0, -1);
                  stackIn_7_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (aa.field_k) {
                    stackIn_11_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (ak.field_b == sf.field_n) {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (!fj.field_o.a(250)) {
                        stackIn_19_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (bb.field_a == sf.field_n) {
                          stackIn_23_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          return -1;
                        }
                      }
                    }
                  }
                }
              } else {
                ka.field_b.a(aa.field_n, pk.field_M, (byte) 108);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "em.V(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return stackIn_23_0;
              }
            }
          }
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param0, (byte) 89) != g.field_k) {
              if (!param1) {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = vd.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("em.L(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    em(nk param0) {
        super(param0);
    }

    static {
        field_n = new int[14][];
        field_i = field_n;
        field_n[7] = new int[]{4};
        field_n[5] = new int[]{25};
        field_n[9] = new int[]{9, 11};
        field_n[12] = new int[]{};
        field_n[10] = new int[]{8};
        field_n[13] = new int[]{22, 23};
        field_n[3] = new int[]{4};
        field_n[1] = new int[]{2, 18, 19, 16, 7};
        field_n[11] = new int[]{};
        field_n[8] = new int[]{4};
        field_n[6] = new int[]{10};
        field_n[2] = new int[]{10};
        field_n[4] = new int[]{25, 26};
        field_n[0] = new int[]{12, 15, 18, 19, 17, 13, 14, 1};
        field_l = -1;
    }
}
