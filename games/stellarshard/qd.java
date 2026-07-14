/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    private boolean field_g;
    private int field_b;
    int field_f;
    static java.awt.Canvas field_j;
    int field_i;
    private int field_c;
    private int field_a;
    static boolean field_h;
    private int field_d;
    static String field_e;

    final void a(int param0, int param1, int param2) {
        if (((qd) this).field_i > param0) {
          if (((qd) this).field_i > param1) {
            L0: {
              ((qd) this).field_b = 0;
              ((qd) this).field_c = 0;
              if (0 == gh.field_c) {
                break L0;
              } else {
                ((qd) this).field_g = true;
                ((qd) this).field_d = gh.field_c;
                ((qd) this).field_f = param1;
                ((qd) this).field_a = bf.field_b;
                ((qd) this).field_c = gh.field_c;
                break L0;
              }
            }
            L1: {
              if (((qd) this).field_d == 0) {
                if (0 != gh.field_c) {
                  break L1;
                } else {
                  if (fb.field_n != 0) {
                    break L1;
                  } else {
                    ((qd) this).field_d = 0;
                    break L1;
                  }
                }
              } else {
                if (0 != gh.field_c) {
                  break L1;
                } else {
                  if (fb.field_n != 0) {
                    break L1;
                  } else {
                    ((qd) this).field_d = 0;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (((qd) this).field_d != param2) {
                break L2;
              } else {
                L3: {
                  if (((qd) this).field_g) {
                    break L3;
                  } else {
                    if (qc.field_a) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (-1 <= param0) {
                  L4: {
                    if (param0 != ((qd) this).field_f) {
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((qd) this).field_g = true;
                  ((qd) this).field_f = param0;
                  break L2;
                } else {
                  if (!((qd) this).field_g) {
                    break L2;
                  } else {
                    ((qd) this).field_f = -1;
                    break L2;
                  }
                }
              }
            }
            return;
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                param0.getAppletContext().showDocument(lk.a(param0, var2, 114), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (param1 != -30) {
                Object var3 = null;
                qd.a((java.applet.Applet) null, (byte) 50);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_j = null;
        int var1 = 114 / ((param0 - -85) / 39);
    }

    final static pb a(pf param0, String param1, String param2, byte param3) {
        int var4 = param0.b(param2, (byte) -118);
        if (param3 < 41) {
            Object var6 = null;
            qd.a((java.applet.Applet) null, (byte) -109);
        }
        int var5 = param0.a(var4, param1, (byte) -11);
        return vc.a(param0, var5, var4, -2);
    }

    final void a(int param0, int param1, boolean param2, boolean param3) {
        ((qd) this).field_d = 0;
        ((qd) this).field_g = param2 ? true : false;
        if (param3) {
            return;
        }
        if (!((qd) this).field_g) {
            ((qd) this).field_f = param1;
        } else {
            ((qd) this).field_f = param0;
        }
    }

    final void a(int param0) {
        ((qd) this).field_c = 0;
        ((qd) this).field_b = param0;
        if (-1 == (((qd) this).field_d ^ -1)) {
            if (!(gi.field_f != -99)) {
                if (-1 >= ((qd) this).field_f) {
                    ((qd) this).field_f = ((qd) this).field_i;
                }
                ((qd) this).field_f = ((qd) this).field_f - 1;
                ((qd) this).field_g = false;
            }
        }
        if (!(((qd) this).field_d != 0)) {
            ((qd) this).field_b = gi.field_f;
        }
        if (((qd) this).field_d == 0) {
            if (99 == gi.field_f) {
                ((qd) this).field_f = ((qd) this).field_f + 1;
                if (!(((qd) this).field_f < ((qd) this).field_i)) {
                    ((qd) this).field_f = 0;
                }
                ((qd) this).field_g = false;
            }
        }
    }

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -9) {
            break L0;
          } else {
            ((qd) this).field_a = 75;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != ((qd) this).field_c) {
              break L2;
            } else {
              if (84 == ((qd) this).field_b) {
                break L2;
              } else {
                if ((((qd) this).field_b ^ -1) != -84) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static pb[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        pb[] var10 = null;
        pb[] var11_ref_pb__ = null;
        int var11 = 0;
        int var12 = 0;
        pb var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        var15 = stellarshard.field_B;
        var9 = param1 + param5 - -param7;
        var10 = new pb[]{new pb(var9, var9), new pb(param8, var9), new pb(var9, var9), new pb(var9, param8), new pb(64, 64), new pb(var9, param8), new pb(var9, var9), new pb(param8, var9), new pb(var9, var9)};
        var11_ref_pb__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_pb__.length) {
            L1: {
              var11 = 0;
              if (param6 == -1) {
                break L1;
              } else {
                var16 = null;
                pb discarded$1 = qd.a((pf) null, (String) null, (String) null, (byte) 11);
                break L1;
              }
            }
            L2: while (true) {
              if (var11 >= param5) {
                var11 = 0;
                L3: while (true) {
                  if (param5 <= var11) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param8) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param8 >> -688875967) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 < param7) {
                                var10[1].field_z[var11 + (var9 + (-var12 + -1)) * param8] = param3;
                                var10[3].field_z[var11 * var9 + (-var12 + -1) + var9] = param3;
                                var10[7].field_z[var12 * param8 + var11] = param3;
                                var10[5].field_z[var12 + var9 * var11] = param3;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param5 > var12) {
                            var10[7].field_z[(-1 + (-var12 + var9)) * param8 - -var11] = param2;
                            var10[5].field_z[var11 * var9 - -var9 - (1 + var12)] = param2;
                            var10[1].field_z[param8 * var12 - -var11] = param0;
                            var10[3].field_z[var12 + var11 * var9] = param0;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L3;
                      } else {
                        var10[0].field_z[var12 + var11 * var9] = param0;
                        var10[0].field_z[var9 * var12 + var11] = param0;
                        if (-var11 + var9 > var12) {
                          var10[2].field_z[var12 - -(var9 * var11)] = param0;
                          var10[6].field_z[var11 + var9 * var12] = param0;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 > var12) {
                    var10[6].field_z[var12 + var9 * (-1 + -var11 + var9)] = param2;
                    var10[8].field_z[var12 + (-1 + (var9 + -var11)) * var9] = param2;
                    var10[2].field_z[var9 * var12 + var9 - (1 - -var11)] = param2;
                    var10[8].field_z[-1 - -var9 + (-var11 + var12 * var9)] = param2;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_pb__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_z.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_z[var14] = param4;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final void a(int param0, int param1) {
        ((qd) this).field_b = 0;
        if (param1 != 84) {
            field_j = null;
        }
        ((qd) this).field_c = 0;
        if (-1 == ((qd) this).field_d) {
            ((qd) this).field_b = gi.field_f;
        }
        if (0 == ((qd) this).field_d) {
            if (!(96 != gi.field_f)) {
                if (!(-1 < ((qd) this).field_f)) {
                    ((qd) this).field_f = ((qd) this).field_i;
                }
                ((qd) this).field_g = false;
                ((qd) this).field_f = ((qd) this).field_f - 1;
            }
        }
        if (-1 == (((qd) this).field_d ^ -1)) {
            if ((gi.field_f ^ -1) == -98) {
                ((qd) this).field_f = ((qd) this).field_f + 1;
                if (((qd) this).field_i <= ((qd) this).field_f) {
                    ((qd) this).field_f = 0;
                }
                ((qd) this).field_g = false;
            }
        }
        if (((qd) this).field_d == 0) {
            if (gi.field_f != 98) {
                // if_icmpeq L177
            } else {
                ((qd) this).field_g = false;
                if (!(0 <= ((qd) this).field_f)) {
                    ((qd) this).field_f = param0;
                }
            }
        }
    }

    qd(int param0) {
        ((qd) this).field_f = 0;
        ((qd) this).field_g = false;
        ((qd) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading music";
    }
}
