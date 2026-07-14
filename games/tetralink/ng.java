/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends mc {
    static int field_D;
    static int field_t;
    static boolean field_r;
    static int[] field_s;
    static int field_n;
    static String field_E;
    lm[] field_v;
    static byte[][] field_q;
    wf[] field_z;
    static String field_x;
    int field_C;
    byte[] field_p;
    byte[] field_w;
    static int field_u;
    private int[] field_B;
    short[] field_o;
    static String field_y;
    byte[] field_A;

    final static sj a(byte param0, String[] param1) {
        if (param0 != -67) {
            return null;
        }
        sj var2 = new sj(false);
        var2.field_h = param1;
        return var2;
    }

    final boolean a(int[] param0, fa param1, byte param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        wf var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = TetraLink.field_J;
          if (param2 == -114) {
            break L0;
          } else {
            ng.a(-121);
            break L0;
          }
        }
        var5 = 1;
        var6 = 0;
        var7 = null;
        var8 = 0;
        L1: while (true) {
          if (var8 <= -129) {
            return var5 != 0;
          } else {
            L2: {
              if (param3 == null) {
                break L2;
              } else {
                if (-1 != param3[var8]) {
                  break L2;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
            var9 = ((ng) this).field_B[var8];
            if (-1 != (var9 ^ -1)) {
              L3: {
                if (var9 == var6) {
                  break L3;
                } else {
                  L4: {
                    var6 = var9;
                    var9--;
                    if ((var9 & 1) != 0) {
                      var7 = param1.a(param0, var9 >> 1272737410, 95);
                      break L4;
                    } else {
                      var7 = param1.a((byte) 67, var9 >> 1455264514, param0);
                      break L4;
                    }
                  }
                  if (var7 != null) {
                    break L3;
                  } else {
                    var5 = 0;
                    break L3;
                  }
                }
              }
              if (var7 != null) {
                ((ng) this).field_z[var8] = var7;
                ((ng) this).field_B[var8] = 0;
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
    }

    final static void a(String param0, boolean param1) {
        cl.field_b = param0;
        if (!param1) {
            ng.a(-44);
        }
    }

    final static void a(byte param0, int param1, boolean param2, hm param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          ai.field_e[0] = ca.field_i.nextInt();
          ai.field_e[1] = ca.field_i.nextInt();
          tb.field_j.field_t = 0;
          ai.field_e[2] = (int)(ca.field_g >> -242410592);
          ai.field_e[3] = (int)ca.field_g;
          tb.field_j.d(ai.field_e[0], (byte) -124);
          tb.field_j.d(ai.field_e[1], (byte) -124);
          tb.field_j.d(ai.field_e[2], (byte) -124);
          tb.field_j.d(ai.field_e[3], (byte) -124);
          mh.a(-105, tb.field_j);
          tb.field_j.b(param1, false);
          param3.a(-22017, tb.field_j);
          nd.field_Lb.field_t = 0;
          if (param2) {
            nd.field_Lb.a(18, false);
            break L0;
          } else {
            nd.field_Lb.a(16, false);
            break L0;
          }
        }
        if (param0 == -34) {
          L1: {
            nd.field_Lb.field_t = nd.field_Lb.field_t + 2;
            var5 = nd.field_Lb.field_t;
            nd.field_Lb.d(lm.field_g, (byte) -124);
            nd.field_Lb.a(-1, tc.field_s);
            var6 = 0;
            if (pg.field_m) {
              var6 = var6 | 1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (mc.field_k) {
              var6 = var6 | 4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param4) {
              var6 = var6 | 8;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (null == cl.field_b) {
              break L4;
            } else {
              var6 = var6 | 16;
              break L4;
            }
          }
          L5: {
            nd.field_Lb.a(var6, false);
            var7 = dd.a(lk.q(13), (byte) -87);
            if (var7 == null) {
              var7 = "";
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            nd.field_Lb.a(var7, 0);
            if (cl.field_b != null) {
              nd.field_Lb.a(cl.field_b, (byte) 103);
              break L6;
            } else {
              break L6;
            }
          }
          ae.a(ki.field_c, (bh) (Object) nd.field_Lb, tb.field_j, jg.field_c, 97);
          nd.field_Lb.a((byte) 17, nd.field_Lb.field_t - var5);
          ak.a((byte) -82, -1);
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        ((ng) this).field_B = null;
        int var2 = 125 % ((param0 - -39) / 54);
    }

    public static void a(int param0) {
        field_E = null;
        if (param0 < 12) {
            return;
        }
        field_s = null;
        field_q = null;
        field_x = null;
        field_y = null;
    }

    ng(byte[] param0) {
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        lm[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        lm var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        lm var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        bh var38 = null;
        byte[] var39 = null;
        lm var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        lm var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        lm var48 = null;
        lm var49 = null;
        lm var50 = null;
        lm var51 = null;
        lm var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] var59 = null;
        byte[] var60 = null;
        byte[] var61 = null;
        byte[] var62 = null;
        byte[] var63 = null;
        byte[] var64 = null;
        byte[] var65 = null;
        byte[] var66 = null;
        byte[] var67 = null;
        byte[] var68 = null;
        byte[] var69 = null;
        byte[] var70 = null;
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        Object stackOut_37_0 = null;
        byte[] stackOut_36_0 = null;
        byte[] stackOut_40_0 = null;
        Object stackOut_39_0 = null;
        ((ng) this).field_z = new wf[128];
        ((ng) this).field_B = new int[128];
        ((ng) this).field_o = new short[128];
        ((ng) this).field_A = new byte[128];
        ((ng) this).field_p = new byte[128];
        ((ng) this).field_w = new byte[128];
        ((ng) this).field_v = new lm[128];
        var38 = new bh(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_u[var3 + var38.field_t] == 0) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var3++;
                var38.field_t = var38.field_t + 1;
                var5 = var38.field_t;
                var38.field_t = var38.field_t + var3;
                var6 = 0;
                L2: while (true) {
                  if (0 == var38.field_u[var38.field_t - -var6]) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var38.field_t = var38.field_t + 1;
                        var6++;
                        var8 = var38.field_t;
                        var38.field_t = var38.field_t + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (0 == var38.field_u[var9 + var38.field_t]) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var9++;
                                  var38.field_t = var38.field_t + 1;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (var9 > 1) {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.d((byte) -99);
                                          if (var15_int == 0) {
                                            var12++;
                                            var13_int = var12;
                                            break L8;
                                          } else {
                                            L9: {
                                              if (var13_int < var15_int) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          }
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var12 = var9;
                                    break L6;
                                  }
                                }
                                var13 = new lm[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.d((byte) -99);
                                      if ((var14 ^ -1) >= -1) {
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = new byte[var14 * 2];
                                        stackIn_38_0 = stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var46 = stackIn_38_0;
                                      var15_array = var46;
                                      var14 = var38.d((byte) -99);
                                      if ((var14 ^ -1) < -1) {
                                        stackOut_40_0 = new byte[2 * var14];
                                        stackIn_41_0 = stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var70 = stackIn_41_0;
                                    var64 = var70;
                                    var58 = var64;
                                    var47 = var58;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (0 == var38.field_u[var38.field_t + var17]) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_t = var38.field_t + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (128 <= var20) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (-129 >= var23) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (128 <= var25_int) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var26 ^ -1)) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var27) {
                                                                        ((ng) this).field_C = 1 + var38.d((byte) -99);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var12 <= var27) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var46.length <= var27) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.g(-1772093437);
                                                                                    var27 += 2;
                                                                                    continue L24;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L25: {
                                                                              if (var16 == null) {
                                                                                break L25;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L26: while (true) {
                                                                                  if (var27 >= var70.length) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.g(-1772093437);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (var12 <= var27) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var27 >= var12) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.d((byte) -99);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var46.length <= var27) {
                                                                                            var27 = var46[0];
                                                                                            var28 = var46[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var46.length <= var29) {
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((ng) this).field_A[var30] = (byte)(((ng) this).field_A[var30] * var28 - -32 >> 1839677958);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = var28 * (-var27 + var30) - -((var30 - var27) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = sd.c(var32, -var27 + var30, -97);
                                                                                                        ((ng) this).field_A[var33] = (byte)(var34 * ((ng) this).field_A[var33] + 32 >> 1379923430);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((ng) this).field_A[var29] = (byte)(32 + var28 * ((ng) this).field_A[var29] >> 1495696870);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.d((byte) -99) + (var19 - -1);
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 == null) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        var19 = var38.d((byte) -99);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var70.length) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1] << 507058657;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var70.length <= var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (255 & ((ng) this).field_w[var30]);
                                                                                                          if (0 <= var31) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (-129 <= (var31 ^ -1)) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((ng) this).field_w[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var16[var29 - -1] << 193396001;
                                                                                                    var32 = (var30 - var27) * var28 + (var30 + -var27) / 2;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = sd.c(var32, -var27 + var30, -81);
                                                                                                          var35 = var34 + (255 & ((ng) this).field_w[var37]);
                                                                                                          if (var35 >= 0) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if (var35 <= 128) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        ((ng) this).field_w[var37] = (byte)var35;
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28 + (255 & ((ng) this).field_w[var29]);
                                                                                                  if (0 <= var30) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if (128 >= var30) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((ng) this).field_w[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + var19 + var38.d((byte) -99);
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L47: while (true) {
                                                                                      if (var12 <= var27) {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (-1 > (var52.field_c ^ -1)) {
                                                                                                          var52.field_h = var38.d((byte) -99);
                                                                                                          var27++;
                                                                                                          continue L51;
                                                                                                        } else {
                                                                                                          var27++;
                                                                                                          continue L51;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var51 = var13[var27];
                                                                                                    if ((var51.field_k ^ -1) < -1) {
                                                                                                      var51.field_c = var38.d((byte) -99);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_k = var38.d((byte) -99);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_d) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_b = var38.d((byte) -99);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (var50.field_e == null) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_j = var38.d((byte) -99);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (0 < var50.field_a) {
                                                                                              var50.field_i = var38.d((byte) -99);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_a = var38.d((byte) -99);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (null != var49.field_d) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_d.length) {
                                                                                          var19 = var38.d((byte) -99) + (var19 - -1);
                                                                                          var49.field_d[var29] = (byte)var19;
                                                                                          var29 += 2;
                                                                                          continue L54;
                                                                                        } else {
                                                                                          var27++;
                                                                                          continue L28;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      var27++;
                                                                                      continue L28;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var48 = var13[var27];
                                                                                if (var48.field_e != null) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var29 < var48.field_e.length) {
                                                                                      var19 = 1 + (var19 - -var38.d((byte) -99));
                                                                                      var48.field_e[var29] = (byte)var19;
                                                                                      var29 += 2;
                                                                                      continue L55;
                                                                                    } else {
                                                                                      var27++;
                                                                                      continue L27;
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  var27++;
                                                                                  continue L27;
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L56: {
                                                                              var45 = var13[var27];
                                                                              if (var45.field_d == null) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var45.field_d.length <= var29) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_d[var29] = var38.g(-1772093437);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_e) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var45.field_e.length - 2 > var29) {
                                                                                  var45.field_e[var29] = var38.g(-1772093437);
                                                                                  var29 += 2;
                                                                                  continue L58;
                                                                                } else {
                                                                                  var27++;
                                                                                  continue L22;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              var27++;
                                                                              continue L22;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L59: {
                                                                          if (0 != var20) {
                                                                            break L59;
                                                                          } else {
                                                                            L60: {
                                                                              if (var66.length > var21) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (0 >= ((ng) this).field_B[var27]) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = 1 + var38.d((byte) -99);
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((ng) this).field_A[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((ng) this).field_B[var26] != 0) {
                                                                      L61: {
                                                                        if (var20 != 0) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var65[var21]];
                                                                          if (var69.length <= var21) {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          } else {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      ((ng) this).field_v[var26] = var25_ref;
                                                                      var20--;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (((ng) this).field_B[var25_int] != 0) {
                                                                  L62: {
                                                                    if (0 != var20) {
                                                                      break L62;
                                                                    } else {
                                                                      L63: {
                                                                        if (var21 < var68.length) {
                                                                          var21++;
                                                                          var20 = var7[var21];
                                                                          break L63;
                                                                        } else {
                                                                          var20 = -1;
                                                                          break L63;
                                                                        }
                                                                      }
                                                                      var8++;
                                                                      var24 = 16 + var38.field_u[var8] << 1181506754;
                                                                      break L62;
                                                                    }
                                                                  }
                                                                  ((ng) this).field_w[var25_int] = (byte)var24;
                                                                  var20--;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (((ng) this).field_B[var24] != 0) {
                                                              L64: {
                                                                if (var20 != 0) {
                                                                  break L64;
                                                                } else {
                                                                  L65: {
                                                                    if (var67.length > var21) {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L65;
                                                                    } else {
                                                                      var20 = -1;
                                                                      break L65;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = -1 + var38.field_u[var5];
                                                                  break L64;
                                                                }
                                                              }
                                                              var20--;
                                                              ((ng) this).field_p[var24] = (byte)var23;
                                                              var24++;
                                                              continue L18;
                                                            } else {
                                                              var24++;
                                                              continue L18;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        L66: {
                                                          if (-1 != var20) {
                                                            break L66;
                                                          } else {
                                                            L67: {
                                                              if (var66.length > var21) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L67;
                                                              } else {
                                                                var20 = -1;
                                                                break L67;
                                                              }
                                                            }
                                                            var22 = var38.b((byte) 120);
                                                            break L66;
                                                          }
                                                        }
                                                        ((ng) this).field_o[var23] = (short)(((ng) this).field_o[var23] + (pl.a(2, -1 + var22) << 1495549134));
                                                        var20--;
                                                        ((ng) this).field_B[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.d((byte) -99);
                                                    ((ng) this).field_o[var20] = (short)(((ng) this).field_o[var20] + (var19 << -1787546392));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.d((byte) -99);
                                                ((ng) this).field_o[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.g(-1772093437);
                                            var19++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        var17++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    L68: {
                                      var13[var14] = new lm();
                                      var40 = new lm();
                                      var15 = var40;
                                      var16_int = var38.d((byte) -99);
                                      if (var16_int <= 0) {
                                        break L68;
                                      } else {
                                        var15.field_d = new byte[var16_int * 2];
                                        break L68;
                                      }
                                    }
                                    var16_int = var38.d((byte) -99);
                                    if (var16_int > 0) {
                                      var15.field_e = new byte[var16_int * 2 + 2];
                                      var40.field_e[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.g(-1772093437);
                                var11_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        var7[var8] = var38.g(-1772093437);
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var4[var5] = var38.g(-1772093437);
                var5++;
                continue L1;
              }
            }
          } else {
            var3++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Quit";
        field_r = false;
        field_q = new byte[50][];
        field_y = "RuneScape clan";
        field_x = "Loading textures";
    }
}
