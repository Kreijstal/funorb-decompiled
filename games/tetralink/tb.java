/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static String field_h;
    static je field_d;
    boolean field_i;
    int field_k;
    private int[][] field_a;
    int field_b;
    int[] field_l;
    static bh field_j;
    int[] field_f;
    static boolean field_e;
    private int[] field_c;
    static char field_m;
    static boolean field_g;

    final static void a(boolean param0, String param1, long param2) {
        ka.field_m = param1;
        sf.field_d = 2;
        CharSequence var5 = (CharSequence) (Object) param1;
        qj.field_a = cc.a(var5, (byte) 114);
        vj.field_o = param2;
        if (param0) {
            field_h = null;
        }
        cl.field_e = true;
    }

    private final void a(boolean param0, bh param1) {
        int var3 = 0;
        int var4 = TetraLink.field_J;
        if (!param0) {
            Object var5 = null;
            this.a(-64, (byte) 59, (bh) null);
        }
        while (true) {
            var3 = param1.d((byte) -99);
            if (0 == var3) {
                break;
            }
            this.a(var3, (byte) -5, param1);
        }
    }

    tb(ah param0, String param1, String param2) {
        this(param0, param0.a(-1, param1), param2);
    }

    final static void a(int param0, int param1) {
        bc var2 = nd.field_Lb;
        var2.f(param0, (byte) -92);
        var2.a(1, false);
        if (param1 != -15289) {
            field_j = null;
        }
        var2.a(1, false);
    }

    private tb(ah param0, int param1, String param2) {
        this(param0, param1, param0.a(param1, false, param2));
    }

    public static void a(byte param0) {
        field_d = null;
        field_j = null;
        field_h = null;
        if (param0 >= -112) {
            field_d = null;
        }
    }

    private final void a(int param0, byte param1, bh param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        if (param1 == -5) {
          L0: {
            L1: {
              if ((param0 ^ -1) == -2) {
                var4 = param2.e(param1 + 132);
                ((tb) this).field_l = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    ((tb) this).field_f = new int[var4];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4) {
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= var4) {
                            break L1;
                          } else {
                            ((tb) this).field_f[var5] = (param2.e(127) << -1383875824) + ((tb) this).field_f[var5];
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        ((tb) this).field_f[var5] = param2.e(127);
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ((tb) this).field_l[var5] = param2.e(127);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (-3 == (param0 ^ -1)) {
                  ((tb) this).field_k = param2.e(127);
                  break L0;
                } else {
                  if ((param0 ^ -1) == -4) {
                    var4 = param2.d((byte) -99);
                    ((tb) this).field_c = new int[var4 + 1];
                    var5 = 0;
                    L5: while (true) {
                      if (var4 <= var5) {
                        ((tb) this).field_c[var4] = 9999999;
                        break L0;
                      } else {
                        ((tb) this).field_c[var5] = param2.d((byte) -99);
                        var5++;
                        continue L5;
                      }
                    }
                  } else {
                    if ((param0 ^ -1) == -6) {
                      int discarded$8 = param2.d((byte) -99);
                      break L0;
                    } else {
                      if ((param0 ^ -1) != -7) {
                        if (param0 != 7) {
                          if (8 != param0) {
                            if ((param0 ^ -1) == -10) {
                              int discarded$9 = param2.d((byte) -99);
                              break L0;
                            } else {
                              if (param0 != 10) {
                                if (-12 != (param0 ^ -1)) {
                                  if (12 != param0) {
                                    if (13 == param0) {
                                      var4 = param2.e(127);
                                      ((tb) this).field_a = new int[var4][];
                                      var5 = 0;
                                      L6: while (true) {
                                        if ((var4 ^ -1) >= (var5 ^ -1)) {
                                          break L1;
                                        } else {
                                          L7: {
                                            var6 = param2.d((byte) -99);
                                            if (var6 > 0) {
                                              ((tb) this).field_a[var5] = new int[var6];
                                              ((tb) this).field_a[var5][0] = param2.d(-1);
                                              var7 = 1;
                                              L8: while (true) {
                                                if ((var6 ^ -1) >= (var7 ^ -1)) {
                                                  break L7;
                                                } else {
                                                  ((tb) this).field_a[var5][var7] = param2.e(127);
                                                  var7++;
                                                  continue L8;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          }
                                          var5++;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      if (param0 == 14) {
                                        break L1;
                                      } else {
                                        if (-16 != (param0 ^ -1)) {
                                          if (16 == param0) {
                                            break L1;
                                          } else {
                                            if ((param0 ^ -1) == -19) {
                                              break L1;
                                            } else {
                                              break L0;
                                            }
                                          }
                                        } else {
                                          break L0;
                                        }
                                      }
                                    }
                                  } else {
                                    var4 = param2.d((byte) -99);
                                    var5 = 0;
                                    L9: while (true) {
                                      if (var5 >= var4) {
                                        var5 = 0;
                                        L10: while (true) {
                                          if (var5 >= var4) {
                                            break L1;
                                          } else {
                                            int discarded$10 = param2.e(param1 ^ -124);
                                            var5++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        int discarded$11 = param2.e(127);
                                        var5++;
                                        continue L9;
                                      }
                                    }
                                  }
                                } else {
                                  int discarded$12 = param2.d((byte) -99);
                                  break L0;
                                }
                              } else {
                                int discarded$13 = param2.d((byte) -99);
                                break L0;
                              }
                            }
                          } else {
                            ((tb) this).field_b = param2.d((byte) -99);
                            ((tb) this).field_i = false;
                            break L0;
                          }
                        } else {
                          int discarded$14 = param2.e(127);
                          break L0;
                        }
                      } else {
                        int discarded$15 = param2.e(127);
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (param0) {
            tb.a(false, (String) null, -3L);
        }
        if (-1L != (param1 % 10L ^ -1L)) {
            uj.a(param1, -568127903);
        } else {
            uj.a(-1L + param1, -568127903);
            uj.a(1L, -568127903);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var7 = -92 / ((-53 - param6) / 49);
            if (param3 < param1) {
              break L1;
            } else {
              if (param3 >= param1 + param4) {
                break L1;
              } else {
                if (param0 < param2) {
                  break L1;
                } else {
                  if (param0 >= param5 + param2) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private tb(ah param0, int param1, int param2) {
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        L0: {
          ((tb) this).field_k = -1;
          ((tb) this).field_b = 0;
          ((tb) this).field_i = true;
          var11 = param0.a(3, param2, param1);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 == null) {
            break L0;
          } else {
            this.a(true, new bh(var11));
            break L0;
          }
        }
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (((tb) this).field_f.length <= var6) {
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (((tb) this).field_l.length <= var7) {
                return;
              } else {
                if (var6 < ((tb) this).field_l[var7]) {
                  var6 = ((tb) this).field_l[var7];
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if (((tb) this).field_f[var6] > var5) {
              var5 = ((tb) this).field_f[var6];
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Email is valid";
        field_d = new je();
        field_j = new bh(256);
        field_e = true;
    }
}
