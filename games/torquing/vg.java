/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends eh {
    static fj field_k;
    static int field_j;
    private boolean field_m;
    static int field_o;
    private double[] field_n;
    static volatile int field_l;

    final static byte[] a(CharSequence param0, byte param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        var2 = param0.length();
        var4 = -97 % ((-62 - param1) / 48);
        var3 = new byte[var2];
        var5 = 0;
        L0: while (true) {
          if (var5 >= var2) {
            return var3;
          } else {
            L1: {
              L2: {
                L3: {
                  var6 = param0.charAt(var5);
                  if (var6 <= 0) {
                    break L3;
                  } else {
                    if (var6 < 128) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 < 160) {
                    break L4;
                  } else {
                    if (255 < var6) {
                      break L4;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var6 == 8364) {
                  var3[var5] = (byte)-128;
                  break L1;
                } else {
                  if (var6 != 8218) {
                    if (var6 == 402) {
                      var3[var5] = (byte)-125;
                      break L1;
                    } else {
                      if (var6 != 8222) {
                        if (8230 != var6) {
                          if (var6 != 8224) {
                            if (var6 == 8225) {
                              var3[var5] = (byte)-121;
                              break L1;
                            } else {
                              if (var6 != 710) {
                                if (var6 != 8240) {
                                  if (var6 == 352) {
                                    var3[var5] = (byte)-118;
                                    break L1;
                                  } else {
                                    if (8249 != var6) {
                                      if (338 == var6) {
                                        var3[var5] = (byte)-116;
                                        break L1;
                                      } else {
                                        if (var6 != 381) {
                                          if (var6 != 8216) {
                                            if (8217 == var6) {
                                              var3[var5] = (byte)-110;
                                              break L1;
                                            } else {
                                              if (var6 != 8220) {
                                                if (var6 != 8221) {
                                                  if (var6 == 8226) {
                                                    var3[var5] = (byte)-107;
                                                    break L1;
                                                  } else {
                                                    if (var6 == 8211) {
                                                      var3[var5] = (byte)-106;
                                                      break L1;
                                                    } else {
                                                      if (8212 != var6) {
                                                        if (var6 != 732) {
                                                          if (8482 != var6) {
                                                            if (var6 != 353) {
                                                              if (var6 == 8250) {
                                                                var3[var5] = (byte)-101;
                                                                break L1;
                                                              } else {
                                                                if (var6 == 339) {
                                                                  var3[var5] = (byte)-100;
                                                                  break L1;
                                                                } else {
                                                                  if (var6 == 382) {
                                                                    var3[var5] = (byte)-98;
                                                                    break L1;
                                                                  } else {
                                                                    if (var6 == 376) {
                                                                      var3[var5] = (byte)-97;
                                                                      break L1;
                                                                    } else {
                                                                      var3[var5] = (byte)63;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var3[var5] = (byte)-102;
                                                              break L1;
                                                            }
                                                          } else {
                                                            var3[var5] = (byte)-103;
                                                            break L1;
                                                          }
                                                        } else {
                                                          var3[var5] = (byte)-104;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var3[var5] = (byte)-105;
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var3[var5] = (byte)-108;
                                                  break L1;
                                                }
                                              } else {
                                                var3[var5] = (byte)-109;
                                                break L1;
                                              }
                                            }
                                          } else {
                                            var3[var5] = (byte)-111;
                                            break L1;
                                          }
                                        } else {
                                          var3[var5] = (byte)-114;
                                          break L1;
                                        }
                                      }
                                    } else {
                                      var3[var5] = (byte)-117;
                                      break L1;
                                    }
                                  }
                                } else {
                                  var3[var5] = (byte)-119;
                                  break L1;
                                }
                              } else {
                                var3[var5] = (byte)-120;
                                break L1;
                              }
                            }
                          } else {
                            var3[var5] = (byte)-122;
                            break L1;
                          }
                        } else {
                          var3[var5] = (byte)-123;
                          break L1;
                        }
                      } else {
                        var3[var5] = (byte)-124;
                        break L1;
                      }
                    }
                  } else {
                    var3[var5] = (byte)-126;
                    break L1;
                  }
                }
              }
              var3[var5] = (byte)var6;
              break L1;
            }
            var5++;
            continue L0;
          }
        }
    }

    final void e(int param0) {
        ((vg) this).field_m = true;
        ((vg) this).b(0, ((vg) this).field_h.field_g[((vg) this).field_c]);
        if (param0 <= 43) {
            ((vg) this).field_n = null;
        }
    }

    final static sm a(sm[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sm[] var6 = null;
        int var7_int = 0;
        sm[] var7 = null;
        int var8 = 0;
        sm var8_ref_sm = null;
        sm var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        sm[] var17 = null;
        sm var18 = null;
        sm var19 = null;
        var16 = Torquing.field_u;
        var2 = 2147483647;
        var3 = -2147483648;
        var4 = 2147483647;
        var5 = -2147483648;
        if (param1 >= 11) {
          var17 = param0;
          var6 = var17;
          var7_int = 0;
          L0: while (true) {
            if (var17.length <= var7_int) {
              var18 = new sm(var3 - var2, -var4 + var5, 0);
              var19 = var18;
              var18.field_k = param0[0].field_k;
              var19.field_g = var4;
              var19.field_a = var2;
              var7 = param0;
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7.length) {
                  return var19;
                } else {
                  L2: {
                    var9 = var7[var8];
                    var10 = 0;
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 640;
                    var12 = var12 - var19.field_a;
                    var15 = 480;
                    var13 = var13 - var19.field_g;
                    var11 = var11 - var9.field_g;
                    var10 = var10 - var9.field_a;
                    if (var11 < 0) {
                      var15 = var15 + var11;
                      var13 = var13 - var11;
                      var11 = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if ((var10 ^ -1) > -1) {
                      var12 = var12 - var10;
                      var14 = var14 + var10;
                      var10 = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var13 > -1) {
                      var11 = var11 - var13;
                      var15 = var15 + var13;
                      var13 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (-1 <= var12) {
                      break L5;
                    } else {
                      var14 = var14 + var12;
                      var10 = var10 - var12;
                      var12 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (-var10 + var9.field_c < var14) {
                      var14 = -var10 + var9.field_c;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var15 > -var11 + var9.field_d) {
                      var15 = var9.field_d - var11;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var14 > var19.field_c - var12) {
                      var14 = -var12 + var19.field_c;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (-var13 + var19.field_d < var15) {
                      var15 = -var13 + var19.field_d;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  if ((var14 ^ -1) < -1) {
                    if (var15 > 0) {
                      oc.a((byte) 0, 0, var12 + var19.field_c * var13, var19.field_l, var15, -var14 + var9.field_c, -var14 + var19.field_c, var14, var11 * var9.field_c - -var10, var9.field_l);
                      var8++;
                      continue L1;
                    } else {
                      var8++;
                      continue L1;
                    }
                  } else {
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              L10: {
                var8_ref_sm = var17[var7_int];
                if (var8_ref_sm.field_g + var8_ref_sm.field_d <= var5) {
                  break L10;
                } else {
                  var5 = var8_ref_sm.field_g - -var8_ref_sm.field_d;
                  break L10;
                }
              }
              L11: {
                if (var3 < var8_ref_sm.field_a - -var8_ref_sm.field_c) {
                  var3 = var8_ref_sm.field_a - -var8_ref_sm.field_c;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 > var8_ref_sm.field_g) {
                  var4 = var8_ref_sm.field_g;
                  break L12;
                } else {
                  break L12;
                }
              }
              if (var8_ref_sm.field_a < var2) {
                var2 = var8_ref_sm.field_a;
                var7_int++;
                continue L0;
              } else {
                var7_int++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(double param0, double param1, int param2, double param3) {
        double var8 = -param3 + ((vg) this).field_g[0];
        double var10 = -param0 + ((vg) this).field_g[param2];
        double var12 = ((vg) this).field_g[2] - param1;
        double var14 = 5120.0 / Math.sqrt(var12 * var12 + (var8 * var8 + var10 * var10));
        ((vg) this).field_n[1] = ((vg) this).field_n[1] + var10 * var14;
        ((vg) this).field_n[0] = ((vg) this).field_n[0] + var14 * var8;
        ((vg) this).field_n[2] = ((vg) this).field_n[2] + var14 * var12;
    }

    final sg a(int param0, hc param1) {
        int var4_int = 0;
        kh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tl[] var8 = null;
        tl[] var9 = null;
        int stackIn_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var7 = Torquing.field_u;
        var8 = param1.field_q;
        var9 = var8;
        param1.d(-18916);
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= var8.length) {
            L1: {
              var4 = param1.a(-100, true);
              ((vg) this).field_h = new sg(3 + var9.length);
              ((vg) this).field_h.a(0, var4);
              ((vg) this).field_h.a(1, tp.field_a);
              if (param0 < -52) {
                break L1;
              } else {
                ((vg) this).e(19);
                break L1;
              }
            }
            ((vg) this).field_c = 1;
            ((vg) this).field_h.a(var9.length - -2, param1.c(-20561));
            var5 = 0;
            L2: while (true) {
              if (var5 >= var9.length) {
                L3: {
                  if (param1.field_k == null) {
                    break L3;
                  } else {
                    ((vg) this).field_h.a(0, param1.field_k);
                    break L3;
                  }
                }
                L4: {
                  if (0 < var9.length) {
                    if (null == var9[0].field_d) {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_16_0 = stackOut_11_0;
                    break L4;
                  }
                }
                var5 = stackIn_16_0;
                ((vg) this).field_a = param1;
                var6 = 0;
                L5: while (true) {
                  if (var9.length <= var6) {
                    L6: {
                      this.a(param1.f(50), 18910);
                      ((vg) this).b(1);
                      if (var5 != 0) {
                        param1.field_k = ((vg) this).field_h.a(0);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    return ((vg) this).field_h;
                  } else {
                    var9[var6].field_a = param1;
                    var9[var6].field_h = ((vg) this).field_h;
                    var9[var6].e((byte) -91);
                    var6++;
                    continue L5;
                  }
                }
              } else {
                ((vg) this).field_h.a(2 - -var5, var9[var5].d(-2));
                var9[var5].field_c = var5 + 2;
                var5++;
                continue L2;
              }
            }
          } else {
            var8[var4_int].d(-2).field_q.field_r = 0;
            var4_int++;
            continue L0;
          }
        }
    }

    final static boolean d(int param0) {
        if (param0 != 0) {
            field_l = 85;
        }
        return ff.field_a;
    }

    final void a(boolean param0, int[] param1) {
        param1[2] = ((vg) this).field_f[2];
        param1[0] = ((vg) this).field_f[0];
        if (!param0) {
            field_l = -37;
        }
        param1[1] = ((vg) this).field_f[1];
    }

    final void b(int param0, kh param1) {
        if (param0 != 0) {
            field_k = null;
        }
        if (!(!((vg) this).field_m)) {
            param1 = this.a(-1, param1);
        }
        ((vg) this).field_h.a(((vg) this).field_c, param1);
    }

    final double a(double[] param0, boolean param1, double param2, boolean param3, int param4, boolean param5) {
        ((vg) this).field_g = hl.a(param2, param0, param3, -6076, param1, param5, 30.0, !((vg) this).field_m ? 0.0 : 1.0, ((vg) this).field_a, ((vg) this).field_g, ((vg) this).field_n);
        ((vg) this).field_n[param4] = 0.0;
        ((vg) this).field_n[1] = 0.0;
        ((vg) this).field_n[2] = 0.0;
        ((vg) this).c(param4 ^ 0);
        ((vg) this).field_h.a(((vg) this).field_h.field_g[((vg) this).field_c], ((vg) this).field_f);
        return ap.a(((vg) this).field_g, 0, re.field_d, 0);
    }

    private final kh a(int param0, kh param1) {
        if (param0 != -1) {
            return null;
        }
        kh var3 = new kh(new rm(new rm[2], 2));
        return var3;
    }

    public static void d(byte param0) {
        if (param0 >= -75) {
            return;
        }
        field_k = null;
    }

    final static la a(int param0, int param1) {
        if (param0 != -27646) {
            return null;
        }
        return hc.a(false, true, param1, 8505, false, 1);
    }

    private final void a(double[] param0, int param1) {
        ((vg) this).field_m = false;
        dk.a(param0, 0, ((vg) this).field_g, 0, ((vg) this).field_g.length);
        double[] var5 = ((vg) this).field_n;
        double[] var3 = var5;
        double[] var4 = ((vg) this).field_n;
        ((vg) this).field_n[2] = 0.0;
        var4[1] = 0.0;
        var5[0] = 0.0;
        boolean discarded$0 = he.a(((vg) this).field_a, 0.08, ((vg) this).field_g, 16777215, 30.0);
        ((vg) this).c(param1 ^ param1);
        ((vg) this).field_h.a(tp.field_a, ((vg) this).field_f);
    }

    final lm a(byte param0) {
        if (param0 > -24) {
            vg.d((byte) -59);
        }
        return (lm) (Object) new ej(((vg) this).field_g[0], ((vg) this).field_g[1], ((vg) this).field_g[2], 30.0);
    }

    vg() {
        ((vg) this).field_n = new double[3];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
    }
}
