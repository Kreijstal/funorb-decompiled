/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq {
    static int[] field_b;
    static String field_a;
    static kb field_c;

    final static void a(tg param0, int param1, java.awt.Frame param2) {
        ql var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(10, param2);
              L2: while (true) {
                if (var3.field_f != 0) {
                  if ((var3.field_f ^ -1) == -2) {
                    param2.setVisible(false);
                    param2.dispose();
                    if (param1 == -20954) {
                      break L0;
                    } else {
                      field_c = (kb) null;
                      return;
                    }
                  } else {
                    wj.a(-128, 100L);
                    continue L1;
                  }
                } else {
                  wj.a(param1 ^ 20898, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("sq.F(");
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static int a(byte param0, int param1, boolean param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) > -3) {
                break L1;
              } else {
                if ((param1 ^ -1) < -37) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    if (param0 == -32) {
                      break L2;
                    } else {
                      field_a = (String) null;
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      if (var5 != 0) {
                        stackOut_38_0 = var6;
                        stackIn_39_0 = stackOut_38_0;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param2) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (57 >= var9) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param1 > var9) {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = var6 * param1 - -var9;
                          if (var6 == var10 / param1) {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          } else {
                            throw new NumberFormatException();
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var4);
            stackOut_40_1 = new StringBuilder().append("sq.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param3 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L11;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L11;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
        return stackIn_39_0;
    }

    final static m a(int param0) {
        if (param0 <= 31) {
          field_c = (kb) null;
          return new m(fc.a(57), ga.c(30794));
        } else {
          return new m(fc.a(57), ga.c(30794));
        }
    }

    public static void a(byte param0) {
        if (param0 != -11) {
          field_b = (int[]) null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        nn var4_ref_nn = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        mp var3 = wn.a(param0, param1, -16);
        if (var3 != null) {
            bm.field_d.a(true, false);
            var4_ref_nn = bm.field_d;
            var5_ref_String = oo.field_y;
            var4_ref_nn.field_d.a(var5_ref_String, 5, (byte) 104);
            var4_ref_nn = bm.field_d;
            var5 = tb.field_fb;
            var6 = qo.field_O;
            var4_ref_nn.field_d.a(var6, -98, 0, 0, var5);
        }
        int var4 = -44 % ((-3 - param2) / 50);
        jm.a(param0, true, param1);
    }

    final static void a(boolean param0) {
        m discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        m discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        m discarded$25 = null;
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        m discarded$30 = null;
        StringBuilder discarded$31 = null;
        long var1 = 0L;
        long var3 = 0L;
        long var5 = 0L;
        ff.field_d.c((byte) -83);
        if (!pf.field_f) {
          if (param0) {
            L0: {
              discarded$16 = sq.a(15);
              if (!im.field_g) {
                break L0;
              } else {
                L1: {
                  if (d.field_H != rn.field_c) {
                    bq.field_b.field_l.setLength(0);
                    od.a(-9, (long)d.field_H, bq.field_b.field_l);
                    discarded$17 = bq.field_b.field_l.append(" fps");
                    rn.field_c = d.field_H;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ff.field_d.a(bq.field_b, (byte) 3);
                break L0;
              }
            }
            return;
          } else {
            L2: {
              if (!im.field_g) {
                break L2;
              } else {
                L3: {
                  if (d.field_H != rn.field_c) {
                    bq.field_b.field_l.setLength(0);
                    od.a(-9, (long)d.field_H, bq.field_b.field_l);
                    discarded$18 = bq.field_b.field_l.append(" fps");
                    rn.field_c = d.field_H;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ff.field_d.a(bq.field_b, (byte) 3);
                break L2;
              }
            }
            return;
          }
        } else {
          var1 = Runtime.getRuntime().totalMemory();
          var3 = Runtime.getRuntime().freeMemory();
          var5 = (-var3 + var1) / 1024L;
          var3 = var3 / 1024L;
          var1 = var1 / 1024L;
          if ((lf.field_u ^ -1L) != (var1 ^ -1L)) {
            bj.field_P.field_l.setLength(0);
            od.a(-9, var5, bj.field_P.field_l);
            discarded$19 = bj.field_P.field_l.append(" kB / ");
            od.a(-9, var1, bj.field_P.field_l);
            discarded$20 = bj.field_P.field_l.append(" kB");
            mk.field_j = var5;
            lf.field_u = var1;
            ff.field_d.a(bj.field_P, (byte) 3);
            if (param0) {
              L4: {
                discarded$21 = sq.a(15);
                if (!im.field_g) {
                  break L4;
                } else {
                  L5: {
                    if (d.field_H != rn.field_c) {
                      bq.field_b.field_l.setLength(0);
                      od.a(-9, (long)d.field_H, bq.field_b.field_l);
                      discarded$22 = bq.field_b.field_l.append(" fps");
                      rn.field_c = d.field_H;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ff.field_d.a(bq.field_b, (byte) 3);
                  break L4;
                }
              }
              return;
            } else {
              L6: {
                if (!im.field_g) {
                  break L6;
                } else {
                  L7: {
                    if (d.field_H != rn.field_c) {
                      bq.field_b.field_l.setLength(0);
                      od.a(-9, (long)d.field_H, bq.field_b.field_l);
                      discarded$23 = bq.field_b.field_l.append(" fps");
                      rn.field_c = d.field_H;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ff.field_d.a(bq.field_b, (byte) 3);
                  break L6;
                }
              }
              return;
            }
          } else {
            if (mk.field_j == var5) {
              ff.field_d.a(bj.field_P, (byte) 3);
              if (!param0) {
                L8: {
                  if (!im.field_g) {
                    break L8;
                  } else {
                    L9: {
                      if (d.field_H != rn.field_c) {
                        bq.field_b.field_l.setLength(0);
                        od.a(-9, (long)d.field_H, bq.field_b.field_l);
                        discarded$24 = bq.field_b.field_l.append(" fps");
                        rn.field_c = d.field_H;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    ff.field_d.a(bq.field_b, (byte) 3);
                    break L8;
                  }
                }
                return;
              } else {
                L10: {
                  discarded$25 = sq.a(15);
                  if (!im.field_g) {
                    break L10;
                  } else {
                    L11: {
                      if (d.field_H != rn.field_c) {
                        bq.field_b.field_l.setLength(0);
                        od.a(-9, (long)d.field_H, bq.field_b.field_l);
                        discarded$26 = bq.field_b.field_l.append(" fps");
                        rn.field_c = d.field_H;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ff.field_d.a(bq.field_b, (byte) 3);
                    break L10;
                  }
                }
                return;
              }
            } else {
              bj.field_P.field_l.setLength(0);
              od.a(-9, var5, bj.field_P.field_l);
              discarded$27 = bj.field_P.field_l.append(" kB / ");
              od.a(-9, var1, bj.field_P.field_l);
              discarded$28 = bj.field_P.field_l.append(" kB");
              mk.field_j = var5;
              lf.field_u = var1;
              ff.field_d.a(bj.field_P, (byte) 3);
              if (!param0) {
                L12: {
                  if (!im.field_g) {
                    break L12;
                  } else {
                    L13: {
                      if (d.field_H != rn.field_c) {
                        bq.field_b.field_l.setLength(0);
                        od.a(-9, (long)d.field_H, bq.field_b.field_l);
                        discarded$29 = bq.field_b.field_l.append(" fps");
                        rn.field_c = d.field_H;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    ff.field_d.a(bq.field_b, (byte) 3);
                    break L12;
                  }
                }
                return;
              } else {
                L14: {
                  discarded$30 = sq.a(15);
                  if (!im.field_g) {
                    break L14;
                  } else {
                    L15: {
                      if (d.field_H != rn.field_c) {
                        bq.field_b.field_l.setLength(0);
                        od.a(-9, (long)d.field_H, bq.field_b.field_l);
                        discarded$31 = bq.field_b.field_l.append(" fps");
                        rn.field_c = d.field_H;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    ff.field_d.a(bq.field_b, (byte) 3);
                    break L14;
                  }
                }
                return;
              }
            }
          }
        }
    }

    static {
        int var0 = 0;
        field_b = new int[256];
        for (var0 = 0; -257 < (var0 ^ -1); var0++) {
            field_b[var0] = 65793 * var0;
        }
        field_a = "Email: ";
    }
}
