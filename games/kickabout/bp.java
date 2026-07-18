/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bp extends hd {
    int field_Db;
    static int field_Gb;
    sr[] field_zb;
    static String field_yb;
    private im[] field_Fb;
    private int field_Eb;
    private hd field_Ab;
    private tk field_Cb;
    private hd[] field_Bb;

    final void a(boolean param0, boolean param1) {
        int var3_int = 0;
        im[] var3 = null;
        int var4 = 0;
        im var5 = null;
        int var6 = 0;
        im[] var7 = null;
        var6 = Kickabout.field_G;
        ((bp) this).field_Cb.a(32 * id.field_v, param1, (byte) -108, 32);
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= ((bp) this).field_Bb.length) {
            var7 = ((bp) this).field_Fb;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                return;
              } else {
                var5 = var7[var4];
                var5.c(0, param0);
                var4++;
                continue L1;
              }
            }
          } else {
            if (((bp) this).field_Bb[var3_int].field_sb == 1) {
              wh discarded$1 = sp.c(45, 81);
              ((bp) this).b(var3_int, 99);
              var3_int++;
              continue L0;
            } else {
              var3_int++;
              continue L0;
            }
          }
        }
    }

    final static byte[] a(int param0, ml param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var4_int = param1.l(16, 59);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (param2.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param2 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param1.l(3, 59);
                var6 = (byte)param1.l(8, 59);
                if (var5 > 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param2[var7] = (byte)(var6 + param1.l(var5, 59));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param2[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (byte[]) param2;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("bp.F(").append(2280703).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 16 + ')');
        }
        return stackIn_16_0;
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
            return;
        }
        ((bp) this).field_Ab.field_J = param1;
    }

    final void a(im[] param0, int param1) {
        try {
            ((bp) this).a(param1, (byte) -47, param0, param0.length);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "bp.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, im[] param2, int param3) {
        RuntimeException var5 = null;
        im[] var5_array = null;
        int var5_int = 0;
        int var6 = 0;
        im[] var6_ref_im__ = null;
        int var7_int = 0;
        im var7 = null;
        im[] var7_array = null;
        im var8_ref_im = null;
        int var8 = 0;
        im var9 = null;
        int var10 = 0;
        im[] var11 = null;
        im[] var12 = null;
        int var13 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            ((bp) this).field_Fb = param2;
            ((bp) this).field_Ab.field_jb = new tf();
            ((bp) this).field_Ab.field_J = 0;
            var11 = ((bp) this).field_Fb;
            var5_array = var11;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var11.length) {
                var5_int = 5 + param0 * (5 + ((bp) this).field_Eb);
                var6_ref_im__ = ((bp) this).field_Fb;
                var7_int = 0;
                L2: while (true) {
                  if (var7_int >= var6_ref_im__.length) {
                    var6 = 0;
                    var13 = 0;
                    var7_int = var13;
                    L3: while (true) {
                      if (((bp) this).field_Bb.length <= var13) {
                        L4: {
                          if (param1 == -47) {
                            break L4;
                          } else {
                            int discarded$1 = ((bp) this).j((byte) -4);
                            break L4;
                          }
                        }
                        var12 = ((bp) this).field_Fb;
                        var7_array = ((bp) this).field_Fb;
                        var8 = 0;
                        L5: while (true) {
                          if (var8 >= var12.length) {
                            L6: {
                              if (((bp) this).field_Fb.length == 0) {
                                ((bp) this).field_Ab.field_mb = 0;
                                break L6;
                              } else {
                                ((bp) this).field_Ab.field_mb = param3 * (((bp) this).field_Eb + 5) + 5;
                                break L6;
                              }
                            }
                            ((bp) this).a(((bp) this).field_mb, (byte) -126, ((bp) this).field_J, ((bp) this).field_s);
                            break L0;
                          } else {
                            var9 = var12[var8];
                            ((hd) (Object) var9).field_q = var6;
                            var8++;
                            continue L5;
                          }
                        }
                      } else {
                        var6 = var6 + ((bp) this).field_Bb[var13].field_q;
                        var13++;
                        continue L3;
                      }
                    }
                  } else {
                    var8_ref_im = var6_ref_im__[var7_int];
                    ((hd) (Object) var8_ref_im).field_J = var5_int;
                    var5_int = var5_int + (5 + ((bp) this).field_Eb);
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var7 = var11[var6];
                ((bp) this).field_Ab.a((byte) -124, (hd) (Object) var7);
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("bp.H(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ')');
        }
    }

    public static void c(boolean param0) {
        field_yb = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ((bp) this).a(true, ((bp) this).field_q, param3, param2, param0);
        if (param1 > -108) {
            ((bp) this).field_Fb = null;
        }
        ((bp) this).field_Ab.a(true, ((bp) this).field_q - 25, 0, 0, ((bp) this).field_Ab.field_mb);
        ((bp) this).field_Cb.a(15, 5, 0, (byte) -103, -20 + param0, 15 + ((bp) this).field_Ab.field_q, 20);
        ((bp) this).field_Cb.field_Eb.a(true, 15, -15 + ((bp) this).field_Cb.field_q, 5, ((bp) this).field_Cb.field_mb - 10);
        ((bp) this).field_Cb.field_Eb.b(-((bp) this).field_Cb.field_Db.field_J, ((bp) this).field_Cb.field_Db.field_mb, 100, ((bp) this).field_Cb.field_Gb.field_mb);
    }

    final int h(byte param0) {
        int var2 = -111 / ((70 - param0) / 52);
        return ((bp) this).field_Ab.field_J;
    }

    final int b(int param0) {
        if (param0 < 30) {
            field_yb = null;
        }
        return ((bp) this).field_Db;
    }

    final void a(sr param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        im[] var4_ref_im__ = null;
        int var4 = 0;
        int var5 = 0;
        im var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            ql.a((Object[]) (Object) ((bp) this).field_Fb, param0, (byte) 124);
            var3_int = 5;
            var4_ref_im__ = ((bp) this).field_Fb;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4_ref_im__.length) {
                L2: {
                  if (param1 > 30) {
                    break L2;
                  } else {
                    ((bp) this).field_Fb = null;
                    break L2;
                  }
                }
                ((bp) this).field_Db = -1;
                var4 = 0;
                L3: while (true) {
                  if (((bp) this).field_zb.length <= var4) {
                    break L0;
                  } else {
                    L4: {
                      if (((bp) this).field_zb[var4] != param0) {
                        break L4;
                      } else {
                        ((bp) this).field_Db = var4;
                        break L4;
                      }
                    }
                    var4++;
                    continue L3;
                  }
                }
              } else {
                var6 = var4_ref_im__[var5];
                ((hd) (Object) var6).field_J = var3_int;
                var3_int = var3_int + (5 + ((bp) this).field_Eb);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("bp.L(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
    }

    void b(int param0, int param1) {
        if (param1 < 97) {
            return;
        }
        sr var3 = ((bp) this).field_zb[param0];
        if (!(var3 == null)) {
            var3.a(param0 == ((bp) this).field_Db ? true : false, 93);
            ((bp) this).a(var3, 57);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        ji var2_ref_ji = null;
        int var4 = 0;
        im var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        sr var10 = null;
        ut var11 = null;
        int var12 = 0;
        hd var13 = null;
        im[] var14 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var12 = Kickabout.field_G;
          on.a(((bp) this).field_F, ((bp) this).field_T + 20, ((bp) this).field_q, ((bp) this).field_mb + -20, 16777215, 60);
          if (!((bp) this).field_Cb.field_Eb.e((byte) -113)) {
            break L0;
          } else {
            var2_ref_ji = ((bp) this).field_Cb.field_Eb;
            on.g(3 + ((hd) (Object) var2_ref_ji).field_F, ((hd) (Object) var2_ref_ji).field_T, ((hd) (Object) var2_ref_ji).field_q - 6, ((hd) (Object) var2_ref_ji).field_mb);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= ((bp) this).field_Bb.length) {
            pt.a(((bp) this).field_Cb.field_q + ((bp) this).field_Cb.field_F, -22914, ((bp) this).field_Cb.field_F, ((bp) this).field_Cb.field_mb + ((bp) this).field_Cb.field_T, ((bp) this).field_Cb.field_T);
            var2 = 103 % ((param0 - 33) / 56);
            var14 = ((bp) this).field_Fb;
            var4 = 0;
            L2: while (true) {
              if (var14.length <= var4) {
                ta.e(127);
                return;
              } else {
                L3: {
                  var5 = var14[var4];
                  var6 = -1;
                  if (var5.b(15377)) {
                    break L3;
                  } else {
                    L4: {
                      var7 = var5.field_F;
                      if (!var5.field_gb) {
                        var8 = 0;
                        L5: while (true) {
                          if (var8 >= ((bp) this).field_Bb.length) {
                            break L4;
                          } else {
                            L6: {
                              if (!((bp) this).field_Bb[var8].field_gb) {
                                on.g(var7, var5.field_T, ((bp) this).field_Bb[var8].field_q, var5.field_mb);
                                break L6;
                              } else {
                                L7: {
                                  on.a(var7, var5.field_T, ((bp) this).field_Bb[var8].field_q, var5.field_mb, 2280703, 90);
                                  if (var8 == ((bp) this).field_Bb.length - 1) {
                                    stackOut_34_0 = 0;
                                    stackIn_35_0 = stackOut_34_0;
                                    break L7;
                                  } else {
                                    stackOut_33_0 = 1;
                                    stackIn_35_0 = stackOut_33_0;
                                    break L7;
                                  }
                                }
                                var9 = stackIn_35_0;
                                on.e(var7, var5.field_T, var9 + ((bp) this).field_Bb[var8].field_q, var5.field_mb, 65793);
                                break L6;
                              }
                            }
                            var7 = var7 + ((bp) this).field_Bb[var8].field_q;
                            var8++;
                            continue L5;
                          }
                        }
                      } else {
                        on.a(var5.field_F, var5.field_T, var5.field_q, var5.field_mb, 2280703, 90);
                        break L4;
                      }
                    }
                    on.e(var5.field_F, var5.field_T, var5.field_q, var5.field_mb, 65793);
                    var8 = 0;
                    L8: while (true) {
                      if (var8 >= 4) {
                        var8 = 0;
                        L9: while (true) {
                          if (var8 >= ((bp) this).field_Bb.length) {
                            break L3;
                          } else {
                            if (((bp) this).field_Bb[var8].field_gb) {
                              var6 = var8;
                              var8++;
                              continue L9;
                            } else {
                              var8++;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        on.h(-var8 + (var5.field_F - -3), -var8 + 3 + var5.field_T, var8 + -6 + (var5.field_q - -var8), var5.field_mb + (-6 - -var8 + var8), 65793, var8 << 4);
                        var8++;
                        continue L8;
                      }
                    }
                  }
                }
                var5.b(0, var6);
                var4++;
                continue L2;
              }
            }
          } else {
            L10: {
              var13 = ((bp) this).field_Bb[var2];
              if (!var13.field_gb) {
                if (var13.field_qb != 0) {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L10;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_10_0 = stackOut_7_0;
                  break L10;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_10_0 = stackOut_5_0;
                break L10;
              }
            }
            L11: {
              var4 = stackIn_10_0;
              pt.a(var13.field_F + var13.field_q, -22914, var13.field_F, var13.field_T - (-var13.field_mb - -1), var13.field_T);
              if (var4 != 0) {
                stackOut_12_0 = 65793;
                stackIn_13_0 = stackOut_12_0;
                break L11;
              } else {
                stackOut_11_0 = 5592405;
                stackIn_13_0 = stackOut_11_0;
                break L11;
              }
            }
            L12: {
              var5_int = stackIn_13_0;
              on.a(1 + var13.field_F, var13.field_T, -1 + var13.field_q, 40, 10, 16777215, 60);
              if (var4 == 0) {
                break L12;
              } else {
                on.a(var13.field_F + 1, var13.field_T, -1 + var13.field_q, 40, 10, 2280703, 90);
                break L12;
              }
            }
            L13: {
              ta.e(118);
              var6 = (var13.field_q >> 1) + var13.field_F;
              var7 = -5 + (20 + var13.field_T);
              if (((bp) this).field_Db != var2) {
                break L13;
              } else {
                var6 -= 4;
                var8 = (q.field_d.a(var13.field_E) >> 1) + (4 + var6);
                var9 = -10 + var7;
                var10 = ((bp) this).field_zb[((bp) this).field_Db];
                if (var10.a(-113) == 2) {
                  if (1 == var10.field_i) {
                    eo.field_b.c(var8, var9 + -1);
                    break L13;
                  } else {
                    eo.field_b.b(var8, var9);
                    break L13;
                  }
                } else {
                  var11 = eo.field_l[var10.field_i % 3];
                  if (var10.field_i >= 3) {
                    var11.b(var8, -1 + var9);
                    break L13;
                  } else {
                    var11.c(var8, var9);
                    break L13;
                  }
                }
              }
            }
            q.field_d.d(var13.field_E, var6, var7, 16777215, var5_int);
            var2++;
            continue L1;
          }
        }
    }

    final int j(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 34) {
            break L0;
          } else {
            ((bp) this).field_Eb = 0;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((bp) this).field_Db == -1) {
              break L2;
            } else {
              if (null == ((bp) this).field_zb[((bp) this).field_Db]) {
                break L2;
              } else {
                stackOut_4_0 = ((bp) this).field_zb[((bp) this).field_Db].field_i;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int i(byte param0) {
        if (param0 != -124) {
            ((bp) this).field_Ab = null;
        }
        return Math.abs(((bp) this).field_Ab.field_J / (5 + ((bp) this).field_Eb));
    }

    bp(int[] param0, String[] param1, sr[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        hd[] var6 = null;
        int var7 = 0;
        hd var8 = null;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
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
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((bp) this).field_Db = -1;
        try {
          L0: {
            ((bp) this).field_Eb = param3;
            ((bp) this).field_zb = param2;
            ((bp) this).field_Bb = new hd[param0.length];
            var5_int = 5;
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= ((bp) this).field_Bb.length) {
                var6 = ((bp) this).field_Bb;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6.length) {
                    ((bp) this).field_Ab = new hd();
                    ((bp) this).field_Cb = new tk(0L, ((bp) this).field_Ab, new hd(), rr.field_b);
                    ((bp) this).a((byte) -110, (hd) (Object) ((bp) this).field_Cb);
                    ((bp) this).field_q = 15 + (var5_int + 10);
                    break L0;
                  } else {
                    var8 = var6[var7];
                    ((bp) this).a((byte) -106, var8);
                    var7++;
                    continue L2;
                  }
                }
              } else {
                ((bp) this).field_Bb[var6_int] = new hd();
                ((bp) this).field_Bb[var6_int].a(true, param0[var6_int], var5_int, 0, 20);
                ((bp) this).field_Bb[var6_int].field_E = param1[var6_int];
                var5_int = var5_int + param0[var6_int];
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("bp.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = 2;
        field_yb = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
