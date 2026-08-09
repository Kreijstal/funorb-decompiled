/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq {
    static int[] field_b;
    static String field_a;
    static kb field_c;

    final static void a(tg param0, int param1, java.awt.Frame param2) {
        ql var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("sq.F(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    final static int a(byte param0, int param1, boolean param2, CharSequence param3) {
        int stackIn_39_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
                        stackIn_39_0 = var6;
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
            stackIn_42_0 = (RuntimeException) (var4);

            stackIn_42_1 = new StringBuilder().append("sq.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L11;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
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
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        long var1;
        long var3;
        long var5;
        ff.field_d.c((byte) -83);
        if (!pf.field_f) {
          if (param0) {
            L0: {
              sq.a(15);
              if (!im.field_g) {
                break L0;
              } else {
                L1: {
                  if (d.field_H != rn.field_c) {
                    bq.field_b.field_l.setLength(0);
                    od.a(-9, (long)d.field_H, bq.field_b.field_l);
                    discarded$8 = bq.field_b.field_l.append(" fps");
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
                    discarded$9 = bq.field_b.field_l.append(" fps");
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
            discarded$10 = bj.field_P.field_l.append(" kB / ");
            od.a(-9, var1, bj.field_P.field_l);
            discarded$11 = bj.field_P.field_l.append(" kB");
            mk.field_j = var5;
            lf.field_u = var1;
            ff.field_d.a(bj.field_P, (byte) 3);
            if (param0) {
              L4: {
                sq.a(15);
                if (!im.field_g) {
                  break L4;
                } else {
                  L5: {
                    if (d.field_H != rn.field_c) {
                      bq.field_b.field_l.setLength(0);
                      od.a(-9, (long)d.field_H, bq.field_b.field_l);
                      discarded$12 = bq.field_b.field_l.append(" fps");
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
                      discarded$13 = bq.field_b.field_l.append(" fps");
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
                        discarded$14 = bq.field_b.field_l.append(" fps");
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
                  sq.a(15);
                  if (!im.field_g) {
                    break L10;
                  } else {
                    L11: {
                      if (d.field_H != rn.field_c) {
                        bq.field_b.field_l.setLength(0);
                        od.a(-9, (long)d.field_H, bq.field_b.field_l);
                        discarded$15 = bq.field_b.field_l.append(" fps");
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
              discarded$16 = bj.field_P.field_l.append(" kB / ");
              od.a(-9, var1, bj.field_P.field_l);
              discarded$17 = bj.field_P.field_l.append(" kB");
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
                        discarded$18 = bq.field_b.field_l.append(" fps");
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
                  sq.a(15);
                  if (!im.field_g) {
                    break L14;
                  } else {
                    L15: {
                      if (d.field_H != rn.field_c) {
                        bq.field_b.field_l.setLength(0);
                        od.a(-9, (long)d.field_H, bq.field_b.field_l);
                        discarded$19 = bq.field_b.field_l.append(" fps");
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
