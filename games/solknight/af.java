/*
 * Decompiled by CFR-JS 0.4.0.
 */
class af implements j, eg {
    int field_j;
    int field_n;
    int field_f;
    int field_g;
    int field_b;
    private boolean field_i;
    int field_o;
    int field_e;
    int field_m;
    int field_a;
    mg field_l;
    private int field_k;
    static int[] field_h;
    int field_d;
    static da field_c;

    private final int c(int param0, rc param1) {
        if (param0 != 3) {
            ((af) this).field_b = 126;
        }
        return -((af) this).field_j + -((af) this).field_d + param1.field_x;
    }

    public final int a(boolean param0, rc param1) {
        if (!param0) {
            return -119;
        }
        jf discarded$0 = ((af) this).a(-21480, param1);
        return param1.field_h.b(62) + (((af) this).field_a + ((af) this).field_n);
    }

    private final void a(rc param0, int param1, int param2, int param3) {
        this.a(param1, param2, -3, 0, ((af) this).field_o, ((af) this).field_k, param0, 0);
        int var5 = -24 % ((param3 - -6) / 63);
    }

    public final void a(int param0, int param1, int param2, rc param3, int param4) {
        jf var13 = null;
        jf var14 = null;
        int var7 = 0;
        le var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param2 != 1) {
            return;
        }
        if (param3.b(true)) {
            var13 = ((af) this).a(-21480, param3);
            var14 = var13;
            var7 = var14.a((byte) -94, param0);
            var8 = var13.field_c[var7];
            var9 = var14.a(0, param0);
            var10 = this.a(param3, param4, var9, (byte) 78);
            var11 = ((af) this).a(param3, false, param1) + Math.max(0, var8.field_g);
            var12 = ((af) this).a(param3, false, param1) - -Math.min(this.c(param2 ^ 2, param3), Math.min(var8.field_e, var14.field_c.length <= 1 + var7 ? var8.field_e : var13.field_c[var7 + 1].field_g));
            kf.a((byte) 97, param4 + param3.field_m, param3.field_j + param1, param3.field_t + param3.field_m + param4, param3.field_x + param1 - -param3.field_j);
            ph.field_f.a((byte) -67, var11, var12, var10, ((af) this).field_m, var10);
            mf.e(param2 + 4095);
        }
    }

    private final int a(int param0, int param1, int param2, rc param3) {
        if (param1 != -5) {
            return -87;
        }
        return param0 + (param3.field_q + (param3.field_j + param2) - -((af) this).field_d);
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -3) {
          L0: {
            L1: {
              if (vg.field_J == null) {
                break L1;
              } else {
                if (vg.field_J.d((byte) 125) == null) {
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

    af(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, rc param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        L0: {
          var13 = SolKnight.field_L ? 1 : 0;
          kf.a((byte) 97, param6.field_m + param0, param1 + param6.field_j, param6.field_m + (param0 + param6.field_t), param6.field_j + param1 + param6.field_x);
          var9 = ((af) this).b(param2 ^ -268, param6);
          if (param2 == -3) {
            break L0;
          } else {
            var14 = null;
            int discarded$2 = this.c(124, (rc) null);
            break L0;
          }
        }
        L1: {
          var10 = this.c(param2 + 6, param6);
          if (!((af) this).field_i) {
            L2: {
              var12 = ((af) this).field_b;
              if (-1 == (var12 ^ -1)) {
                var11 = ((af) this).field_l.field_F;
                break L2;
              } else {
                if ((var12 ^ -1) != -3) {
                  L3: {
                    if (var12 == 3) {
                      break L3;
                    } else {
                      if (1 != var12) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var11 = (-((af) this).field_l.field_F + var10 - ((af) this).field_l.field_s >> 1126916097) + ((af) this).field_l.field_F;
                  break L2;
                } else {
                  var11 = -((af) this).field_l.field_s + var10;
                  break L2;
                }
              }
            }
            L4: {
              var12 = ((af) this).field_g;
              if (var12 != 0) {
                if (var12 == 3) {
                  break L4;
                } else {
                  if (1 == var12) {
                    ((af) this).field_l.a(((af) this).b(param6, 0), (var9 >> -2083757599) + this.a(param6, param0, param3, (byte) 78), this.a(param7, param2 + -2, param1, param6) - -var11, param4, param5);
                    break L1;
                  } else {
                    if ((var12 ^ -1) != -3) {
                      break L1;
                    } else {
                      ((af) this).field_l.b(((af) this).b(param6, 0), var9 + this.a(param6, param0, param3, (byte) 78), this.a(param7, -5, param1, param6) - -var11, param4, param5);
                      break L1;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            ((af) this).field_l.c(((af) this).b(param6, param2 + 3), this.a(param6, param0, param3, (byte) 78), var11 + this.a(param7, -5, param1, param6), param4, param5);
            break L1;
          } else {
            int discarded$3 = ((af) this).field_l.a(((af) this).b(param6, 0), this.a(param6, param0, param3, (byte) 78), this.a(param7, -5, param1, param6), var9, var10, param4, param5, ((af) this).field_g, ((af) this).field_b, ((af) this).field_f);
            break L1;
          }
        }
        mf.e(4096);
    }

    public final void a(int param0, rc param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jf var17 = null;
        jf var18 = null;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        var16 = SolKnight.field_L ? 1 : 0;
        if (param0 != param2) {
          L0: {
            if (param1.b(true)) {
              L1: {
                var17 = ((af) this).a(-21480, param1);
                var18 = var17;
                if (param0 < param2) {
                  var9 = param2;
                  var8 = param0;
                  break L1;
                } else {
                  var9 = param0;
                  var8 = param2;
                  break L1;
                }
              }
              var10 = var18.a((byte) -106, var8);
              var11 = var18.a((byte) -121, var9);
              kf.a((byte) 97, param5 - -param1.field_m, param4 + param1.field_j, param1.field_m + param5 + param1.field_t, param1.field_x + (param1.field_j + param4));
              var12 = var10;
              L2: while (true) {
                if (var12 > var11) {
                  mf.e(4096);
                  break L0;
                } else {
                  L3: {
                    var13 = var17.field_c[var12];
                    if (var12 == var10) {
                      stackOut_11_0 = var18.a(0, var8);
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = var13.field_c[0];
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_12_0;
                    if (var11 != var12) {
                      if (var13 == null) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = var13.field_c[var13.field_c.length - 1];
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    } else {
                      stackOut_13_0 = var18.a(0, var9);
                      stackIn_17_0 = stackOut_13_0;
                      break L4;
                    }
                  }
                  var15 = stackIn_17_0;
                  ph.field_f.a(var13.field_g + (((af) this).field_d + param1.field_j + (param4 - -param1.field_q)), ((af) this).field_e >>> -574782696, var15 - var14, ((af) this).field_e, 1, var13.field_e, this.a(param1, param5, var14, (byte) 78));
                  var12++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
          var7 = -39 % ((param3 - 34) / 46);
          return;
        } else {
          return;
        }
    }

    public final int a(rc param0, boolean param1, int param2) {
        if (param1) {
            ((af) this).field_n = 98;
        }
        return this.a(0, -5, param2, param0);
    }

    public final int a(int param0, rc param1, int param2) {
        if (param2 != 0) {
            ((af) this).field_f = 89;
        }
        return this.a(param1, param0, 0, (byte) 78);
    }

    public final int b(int param0, rc param1) {
        if (param0 != 265) {
            ((af) this).field_j = 108;
        }
        return param1.field_t - (((af) this).field_a - -((af) this).field_n);
    }

    public void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        if (!(null != ((af) this).field_l)) {
            return;
        }
        this.a(param4, param3, param1, -117);
        if (param0 < 113) {
            Object var7 = null;
            ((af) this).a((af) null, 127);
        }
    }

    public final int a(rc param0, int param1, int param2, int param3, int param4, int param5) {
        if (param1 != 0) {
            return -113;
        }
        jf discarded$0 = ((af) this).a(param1 ^ -21480, param0);
        return param0.field_h.a(-2592, param3 + -((af) this).a(param0, false, param4), param2 + -((af) this).a(param5, param0, param1 + 0));
    }

    public final jf a(int param0, rc param1) {
        if (param1.field_h == null) {
            param1.field_h = (jf) (Object) new vk();
        }
        if (param0 != -21480) {
            Object var4 = null;
            jf discarded$0 = ((af) this).a(-117, (rc) null);
        }
        if (!((af) this).field_i) {
            this.a(param1, (byte) 93);
        } else {
            ((vk) (Object) param1.field_h).a(((af) this).b(param1, 0), ((af) this).field_f, ((af) this).field_g, 127, ((af) this).field_l, ((af) this).b(265, param1), this.c(3, param1), ((af) this).field_b);
        }
        return param1.field_h;
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_c = null;
        field_h = null;
    }

    final void a(af param0, int param1) {
        param0.field_n = ((af) this).field_n;
        param0.field_b = ((af) this).field_b;
        param0.field_g = ((af) this).field_g;
        param0.field_f = ((af) this).field_f;
        param0.field_o = ((af) this).field_o;
        param0.field_l = ((af) this).field_l;
        param0.field_a = ((af) this).field_a;
        if (param1 != 6935) {
            ((af) this).field_j = 86;
        }
        param0.field_d = ((af) this).field_d;
        param0.field_m = ((af) this).field_m;
        param0.field_e = ((af) this).field_e;
        param0.field_j = ((af) this).field_j;
        param0.field_k = ((af) this).field_k;
        param0.field_i = ((af) this).field_i;
    }

    private final void a(rc param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          if (null != param0.field_h) {
            break L0;
          } else {
            param0.field_h = (jf) (Object) new vk();
            break L0;
          }
        }
        var3 = ((af) this).b(265, param0);
        if (param1 > 81) {
          L1: {
            var4 = this.c(3, param0);
            var6 = ((af) this).field_b;
            if (var6 == 0) {
              var5 = ((af) this).field_l.field_F;
              break L1;
            } else {
              if (var6 != 2) {
                L2: {
                  if (var6 != 3) {
                    if (1 == var6) {
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var5 = ((af) this).field_l.field_F + (-((af) this).field_l.field_s + -((af) this).field_l.field_F + var4 >> 649083393);
                break L1;
              } else {
                var5 = -((af) this).field_l.field_s + var4;
                break L1;
              }
            }
          }
          L3: {
            L4: {
              var6 = ((af) this).field_g;
              if ((var6 ^ -1) != -1) {
                if ((var6 ^ -1) == -4) {
                  break L4;
                } else {
                  if (-2 == (var6 ^ -1)) {
                    if (param0.field_h instanceof vk) {
                      ((vk) (Object) param0.field_h).a(var3 >> 521286561, 0, var5, ((af) this).field_l, ((af) this).b(param0, 0));
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    if ((var6 ^ -1) != -3) {
                      break L3;
                    } else {
                      if (param0.field_h instanceof vk) {
                        ((vk) (Object) param0.field_h).a(-13323, ((af) this).field_l, var5, ((af) this).b(param0, 0), var3);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            if (!(param0.field_h instanceof vk)) {
              break L3;
            } else {
              ((vk) (Object) param0.field_h).a(((af) this).field_l, (byte) -111, 0, var5, ((af) this).b(param0, 0));
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    public final int a(rc param0, int param1) {
        int var3 = 28 % ((-60 - param1) / 61);
        jf discarded$0 = ((af) this).a(-21480, param0);
        return param0.field_h.a((byte) 121) + (((af) this).field_d + ((af) this).field_j);
    }

    private final int a(rc param0, int param1, int param2, byte param3) {
        if (param3 != 78) {
            ((af) this).field_n = -51;
        }
        return param2 + (param0.field_k + (((af) this).field_a + param1 - -param0.field_m));
    }

    public final int a(int param0) {
        if (param0 != 3) {
            return -52;
        }
        return ((af) this).field_l.field_s + ((af) this).field_l.field_F;
    }

    String b(rc param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            ((af) this).a((byte) -115, 127, false, 29, (rc) null);
        }
        return param0.field_i;
    }

    final static void a(dl param0, gb param1, byte param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            di var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            var14 = SolKnight.field_L ? 1 : 0;
            var18 = new di();
            var18.field_h = param1.j(255);
            var18.field_o = param1.e(true);
            var18.field_k = new nj[var18.field_h];
            var18.field_s = new nj[var18.field_h];
            var18.field_m = new int[var18.field_h];
            var18.field_q = new byte[var18.field_h][][];
            var18.field_p = new int[var18.field_h];
            var18.field_r = new int[var18.field_h];
            var5 = 0;
            L0: while (true) {
              if (var18.field_h <= var5) {
                L1: {
                  if (param2 < -94) {
                    break L1;
                  } else {
                    field_h = null;
                    break L1;
                  }
                }
                ga.field_E.a((gg) (Object) var18, -7044);
                return;
              } else {
                try {
                  L2: {
                    L3: {
                      L4: {
                        var6_int = param1.j(255);
                        if (var6_int == 0) {
                          break L4;
                        } else {
                          if ((var6_int ^ -1) == -2) {
                            break L4;
                          } else {
                            if ((var6_int ^ -1) != -3) {
                              L5: {
                                if (var6_int == 3) {
                                  break L5;
                                } else {
                                  if ((var6_int ^ -1) == -5) {
                                    break L5;
                                  } else {
                                    var5++;
                                    break L3;
                                  }
                                }
                              }
                              var20 = param1.h(123);
                              var8 = param1.h(11);
                              var9 = param1.j(255);
                              var10 = new String[var9];
                              var11_int = 0;
                              L6: while (true) {
                                if (var11_int >= var9) {
                                  L7: {
                                    var23 = new byte[var9][];
                                    var22 = var23;
                                    var21 = var22;
                                    var19 = var21;
                                    var11 = var19;
                                    if (var6_int != 3) {
                                      break L7;
                                    } else {
                                      var12_int = 0;
                                      L8: while (true) {
                                        if (var9 <= var12_int) {
                                          break L7;
                                        } else {
                                          var13 = param1.e(true);
                                          var11[var12_int] = new byte[var13];
                                          param1.a(var13, 0, -113, var23[var12_int]);
                                          var12_int++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                  var18.field_r[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L9: while (true) {
                                    if (var9 <= var17) {
                                      var18.field_s[var5] = param0.a((byte) 113, var8, var12, k.a(var20, (byte) -101));
                                      var18.field_q[var5] = var23;
                                      var5++;
                                      break L3;
                                    } else {
                                      var12[var17] = k.a(var10[var17], (byte) -106);
                                      var17++;
                                      continue L9;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param1.h(19);
                                  var11_int++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L10: {
                        var15 = param1.h(94);
                        var7 = var15;
                        var16 = param1.h(36);
                        var8 = var16;
                        var9 = 0;
                        if (-2 == (var6_int ^ -1)) {
                          var9 = param1.e(true);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var18.field_r[var5] = var6_int;
                      var18.field_m[var5] = var9;
                      var18.field_k[var5] = param0.a(0, k.a(var15, (byte) -115), var16);
                      var5++;
                      break L3;
                    }
                    break L2;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L11: {
                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                    var18.field_p[var5] = -1;
                    var5++;
                    break L11;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_p[var5] = -4;
                    var5++;
                    break L14;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L15: {
                    var6_ref4 = decompiledCaughtException;
                    var18.field_p[var5] = -5;
                    var5++;
                    break L15;
                  }
                }
                continue L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected af() {
    }

    af(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((af) this).field_j = param4;
        ((af) this).field_g = param7;
        ((af) this).field_i = param12 ? true : false;
        ((af) this).field_m = param10;
        ((af) this).field_n = param2;
        ((af) this).field_e = param11;
        ((af) this).field_l = param0;
        ((af) this).field_f = param9;
        ((af) this).field_o = param5;
        ((af) this).field_d = param3;
        ((af) this).field_k = param6;
        ((af) this).field_b = param8;
        ((af) this).field_a = param1;
    }

    static {
    }
}
