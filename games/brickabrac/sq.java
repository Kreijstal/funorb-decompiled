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
        var4 = BrickABrac.field_J ? 1 : 0;
        L0: while (true) {
          var3 = param0.a(10, param2);
          L1: while (true) {
            if ((var3.field_f ^ -1) != -1) {
              if ((var3.field_f ^ -1) == -2) {
                param2.setVisible(false);
                param2.dispose();
                if (param1 == -20954) {
                  return;
                } else {
                  field_c = null;
                  return;
                }
              } else {
                wj.a(-128, 100L);
                continue L0;
              }
            } else {
              wj.a(param1 ^ 20898, 10L);
              continue L1;
            }
          }
        }
    }

    final static int a(byte param0, int param1, boolean param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        if ((param1 ^ -1) <= -3) {
          if ((param1 ^ -1) >= -37) {
            var4 = 0;
            if (param0 == -32) {
              var5 = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L0: while (true) {
                if (var7 <= var8) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L1: {
                    L2: {
                      var9 = param3.charAt(var8);
                      if ((var8 ^ -1) != -1) {
                        break L2;
                      } else {
                        if (var9 != 45) {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param2) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          var4 = 1;
                          break L1;
                        }
                      }
                    }
                    L3: {
                      L4: {
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (57 >= var9) {
                            var9 -= 48;
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 65) {
                          break L5;
                        } else {
                          if (var9 > 90) {
                            break L5;
                          } else {
                            var9 -= 55;
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 97) {
                          break L6;
                        } else {
                          if (var9 > 122) {
                            break L6;
                          } else {
                            var9 -= 87;
                            break L3;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if ((param1 ^ -1) < (var9 ^ -1)) {
                      L7: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10 = var6 * param1 - -var9;
                      if ((var6 ^ -1) == (var10 / param1 ^ -1)) {
                        var5 = 1;
                        var6 = var10;
                        break L1;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                  var8++;
                  continue L0;
                }
              }
            } else {
              field_a = null;
              var5 = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L8: while (true) {
                if (var7 <= var8) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L9: {
                    L10: {
                      var9 = param3.charAt(var8);
                      if ((var8 ^ -1) != -1) {
                        break L10;
                      } else {
                        if (var9 != 45) {
                          if (var9 != 43) {
                            break L10;
                          } else {
                            if (!param2) {
                              break L10;
                            } else {
                              break L9;
                            }
                          }
                        } else {
                          var4 = 1;
                          break L9;
                        }
                      }
                    }
                    L11: {
                      L12: {
                        if (var9 < 48) {
                          break L12;
                        } else {
                          if (57 >= var9) {
                            var9 -= 48;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if (var9 < 65) {
                          break L13;
                        } else {
                          if (var9 > 90) {
                            break L13;
                          } else {
                            var9 -= 55;
                            break L11;
                          }
                        }
                      }
                      L14: {
                        if (var9 < 97) {
                          break L14;
                        } else {
                          if (var9 > 122) {
                            break L14;
                          } else {
                            var9 -= 87;
                            break L11;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if ((param1 ^ -1) < (var9 ^ -1)) {
                      L15: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var10 = var6 * param1 - -var9;
                      if ((var6 ^ -1) == (var10 / param1 ^ -1)) {
                        var5 = 1;
                        var6 = var10;
                        break L9;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                  var8++;
                  continue L8;
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param1);
          }
        } else {
          throw new IllegalArgumentException("" + param1);
        }
    }

    final static m a(int param0) {
        if (param0 <= 31) {
            field_c = null;
            return new m(fc.a(57), ga.c(30794));
        }
        return new m(fc.a(57), ga.c(30794));
    }

    public static void a(byte param0) {
        if (param0 != -11) {
            field_b = null;
            field_a = null;
            field_c = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        nn var4_ref = null;
        String var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        mp var3 = wn.a(param0, param1, -16);
        if (var3 != null) {
            bm.field_d.a(true, false);
            var4_ref = bm.field_d;
            var5_ref = oo.field_y;
            var4_ref.field_d.a(var5_ref, 5, (byte) 104);
            var4_ref = bm.field_d;
            var5 = tb.field_fb;
            var6 = qo.field_O;
            var4_ref.field_d.a(var6, -98, 0, 0, var5);
        }
        int var4 = -44 % ((-3 - param2) / 50);
        jm.a(param0, true, param1);
    }

    final static void a(boolean param0) {
        long var1 = 0L;
        long var3 = 0L;
        long var5 = 0L;
        ff.field_d.c((byte) -83);
        if (!pf.field_f) {
          if (!param0) {
            L0: {
              if (!im.field_g) {
                break L0;
              } else {
                L1: {
                  if (d.field_H != rn.field_c) {
                    bq.field_b.field_l.setLength(0);
                    od.a(-9, (long)d.field_H, bq.field_b.field_l);
                    StringBuilder discarded$16 = bq.field_b.field_l.append(" fps");
                    rn.field_c = d.field_H;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ff.field_d.a((nm) (Object) bq.field_b, (byte) 3);
                break L0;
              }
            }
            return;
          } else {
            L2: {
              m discarded$17 = sq.a(15);
              if (!im.field_g) {
                break L2;
              } else {
                L3: {
                  if (d.field_H != rn.field_c) {
                    bq.field_b.field_l.setLength(0);
                    od.a(-9, (long)d.field_H, bq.field_b.field_l);
                    StringBuilder discarded$18 = bq.field_b.field_l.append(" fps");
                    rn.field_c = d.field_H;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ff.field_d.a((nm) (Object) bq.field_b, (byte) 3);
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
            StringBuilder discarded$19 = bj.field_P.field_l.append(" kB / ");
            od.a(-9, var1, bj.field_P.field_l);
            StringBuilder discarded$20 = bj.field_P.field_l.append(" kB");
            mk.field_j = var5;
            lf.field_u = var1;
            ff.field_d.a((nm) (Object) bj.field_P, (byte) 3);
            if (!param0) {
              L4: {
                if (!im.field_g) {
                  break L4;
                } else {
                  L5: {
                    if (d.field_H != rn.field_c) {
                      bq.field_b.field_l.setLength(0);
                      od.a(-9, (long)d.field_H, bq.field_b.field_l);
                      StringBuilder discarded$21 = bq.field_b.field_l.append(" fps");
                      rn.field_c = d.field_H;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ff.field_d.a((nm) (Object) bq.field_b, (byte) 3);
                  break L4;
                }
              }
              return;
            } else {
              L6: {
                m discarded$22 = sq.a(15);
                if (!im.field_g) {
                  break L6;
                } else {
                  L7: {
                    if (d.field_H != rn.field_c) {
                      bq.field_b.field_l.setLength(0);
                      od.a(-9, (long)d.field_H, bq.field_b.field_l);
                      StringBuilder discarded$23 = bq.field_b.field_l.append(" fps");
                      rn.field_c = d.field_H;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ff.field_d.a((nm) (Object) bq.field_b, (byte) 3);
                  break L6;
                }
              }
              return;
            }
          } else {
            if (mk.field_j == var5) {
              ff.field_d.a((nm) (Object) bj.field_P, (byte) 3);
              if (param0) {
                L8: {
                  m discarded$24 = sq.a(15);
                  if (!im.field_g) {
                    break L8;
                  } else {
                    L9: {
                      if (d.field_H != rn.field_c) {
                        bq.field_b.field_l.setLength(0);
                        od.a(-9, (long)d.field_H, bq.field_b.field_l);
                        StringBuilder discarded$25 = bq.field_b.field_l.append(" fps");
                        rn.field_c = d.field_H;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    ff.field_d.a((nm) (Object) bq.field_b, (byte) 3);
                    break L8;
                  }
                }
                return;
              } else {
                L10: {
                  if (!im.field_g) {
                    break L10;
                  } else {
                    L11: {
                      if (d.field_H != rn.field_c) {
                        bq.field_b.field_l.setLength(0);
                        od.a(-9, (long)d.field_H, bq.field_b.field_l);
                        StringBuilder discarded$26 = bq.field_b.field_l.append(" fps");
                        rn.field_c = d.field_H;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ff.field_d.a((nm) (Object) bq.field_b, (byte) 3);
                    break L10;
                  }
                }
                return;
              }
            } else {
              bj.field_P.field_l.setLength(0);
              od.a(-9, var5, bj.field_P.field_l);
              StringBuilder discarded$27 = bj.field_P.field_l.append(" kB / ");
              od.a(-9, var1, bj.field_P.field_l);
              StringBuilder discarded$28 = bj.field_P.field_l.append(" kB");
              mk.field_j = var5;
              lf.field_u = var1;
              ff.field_d.a((nm) (Object) bj.field_P, (byte) 3);
              if (param0) {
                L12: {
                  m discarded$29 = sq.a(15);
                  if (!im.field_g) {
                    break L12;
                  } else {
                    L13: {
                      if (d.field_H != rn.field_c) {
                        bq.field_b.field_l.setLength(0);
                        od.a(-9, (long)d.field_H, bq.field_b.field_l);
                        StringBuilder discarded$30 = bq.field_b.field_l.append(" fps");
                        rn.field_c = d.field_H;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    ff.field_d.a((nm) (Object) bq.field_b, (byte) 3);
                    break L12;
                  }
                }
                return;
              } else {
                L14: {
                  if (!im.field_g) {
                    break L14;
                  } else {
                    L15: {
                      if (d.field_H != rn.field_c) {
                        bq.field_b.field_l.setLength(0);
                        od.a(-9, (long)d.field_H, bq.field_b.field_l);
                        StringBuilder discarded$31 = bq.field_b.field_l.append(" fps");
                        rn.field_c = d.field_H;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    ff.field_d.a((nm) (Object) bq.field_b, (byte) 3);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_b = new int[256];
        for (var0 = 0; -257 < (var0 ^ -1); var0++) {
            field_b[var0] = 65793 * var0;
        }
        field_a = "Email: ";
    }
}
