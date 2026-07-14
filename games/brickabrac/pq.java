/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends nm {
    int field_u;
    static qo field_o;
    jm[] field_l;
    static String field_q;
    short[] field_j;
    byte[] field_p;
    static int field_k;
    static String field_m;
    byte[] field_i;
    private int[] field_s;
    oe[] field_t;
    static String field_n;
    byte[] field_r;

    final boolean a(byte[] param0, byte param1, wp param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        oe var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        L0: {
          var10 = BrickABrac.field_J ? 1 : 0;
          var5 = 1;
          if (param1 < -48) {
            break L0;
          } else {
            var11 = null;
            pq.a(121, (String) null, false);
            break L0;
          }
        }
        var6 = 0;
        var7 = null;
        var8 = 0;
        L1: while (true) {
          if ((var8 ^ -1) <= -129) {
            return var5 != 0;
          } else {
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0[var8] != 0) {
                  break L2;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
            var9 = ((pq) this).field_s[var8];
            if (0 != var9) {
              L3: {
                if (var6 != var9) {
                  L4: {
                    var6 = var9;
                    var9--;
                    if ((var9 & 1) != 0) {
                      var7 = param2.a(var9 >> -422217278, param3, 92);
                      break L4;
                    } else {
                      var7 = param2.a(param3, var9 >> 665889794, -127);
                      break L4;
                    }
                  }
                  if (var7 == null) {
                    var5 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (var7 != null) {
                ((pq) this).field_t[var8] = var7;
                ((pq) this).field_s[var8] = 0;
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

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = BrickABrac.field_J ? 1 : 0;
            if (param1) {
              break L1;
            } else {
              if (null != o.field_e) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          hc.field_c = false;
          break L0;
        }
        if (param0 < -111) {
          L2: {
            if (param1) {
              if (ml.field_b > 0) {
                ml.field_b = ml.field_b - 1;
                break L2;
              } else {
                if ((pe.field_j ^ -1) >= -1) {
                  if ((eg.field_m ^ -1) < -1) {
                    eg.field_m = eg.field_m - 1;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  pe.field_j = pe.field_j - 1;
                  break L2;
                }
              }
            } else {
              if (null == o.field_e) {
                if (nl.field_f == null) {
                  hc.field_c = false;
                  if (-1 > pe.field_j) {
                    pe.field_j = pe.field_j - 1;
                    break L2;
                  } else {
                    if (-1 < eg.field_m) {
                      eg.field_m = eg.field_m - 1;
                      break L2;
                    } else {
                      if (ml.field_b < hj.field_Yb) {
                        L3: {
                          if (ml.field_b == 0) {
                            h.g((byte) -24);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        ml.field_b = ml.field_b + 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  if (ml.field_b > 0) {
                    ml.field_b = ml.field_b - 1;
                    break L2;
                  } else {
                    if (0 < eg.field_m) {
                      eg.field_m = eg.field_m - 1;
                      break L2;
                    } else {
                      if (hj.field_Yb <= pe.field_j) {
                        break L2;
                      } else {
                        L4: {
                          if (-1 != (pe.field_j ^ -1)) {
                            break L4;
                          } else {
                            vl.a(true, -122);
                            break L4;
                          }
                        }
                        pe.field_j = pe.field_j + 1;
                        break L2;
                      }
                    }
                  }
                }
              } else {
                if (-1 <= (ml.field_b ^ -1)) {
                  if (0 >= pe.field_j) {
                    if (hj.field_Yb > eg.field_m) {
                      vl.a(false, -64);
                      eg.field_m = eg.field_m + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    pe.field_j = pe.field_j - 1;
                    break L2;
                  }
                } else {
                  ml.field_b = ml.field_b - 1;
                  break L2;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        if (param0 < 80) {
            pq.a((byte) -66);
        }
        field_n = null;
        field_q = null;
        field_m = null;
    }

    final static void a(int param0, String param1, boolean param2) {
        ln.field_l = param2 ? true : false;
        if (param0 != 0) {
            field_k = 121;
        }
        t.field_g = true;
        ej.field_I = new lp(mf.field_f, wm.field_a, param1, cg.field_l, ln.field_l);
        mf.field_f.a(-80, (oc) (Object) ej.field_I);
    }

    final void c(byte param0) {
        ((pq) this).field_s = null;
        if (param0 != 81) {
            Object var3 = null;
            pq.a(116, (String) null, true);
        }
    }

    pq(byte[] param0) {
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
        jm[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        jm var15 = null;
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
        jm var25_ref = null;
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
        wq var38 = null;
        byte[] var39 = null;
        jm var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        jm var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        jm var48 = null;
        jm var49 = null;
        jm var50 = null;
        jm var51 = null;
        jm var52 = null;
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
        Object stackOut_37_0;
        byte[] stackOut_36_0;
        byte[] stackOut_40_0;
        Object stackOut_39_0;
        ((pq) this).field_p = new byte[128];
        ((pq) this).field_j = new short[128];
        ((pq) this).field_s = new int[128];
        ((pq) this).field_t = new oe[128];
        ((pq) this).field_i = new byte[128];
        ((pq) this).field_r = new byte[128];
        ((pq) this).field_l = new jm[128];
        var38 = new wq(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_k[var38.field_l - -var3] == 0) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var38.field_l = var38.field_l + 1;
                var3++;
                var5 = var38.field_l;
                var38.field_l = var38.field_l + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_k[var6 + var38.field_l] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var6++;
                        var38.field_l = var38.field_l + 1;
                        var8 = var38.field_l;
                        var38.field_l = var38.field_l + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_k[var9 + var38.field_l] == 0) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var9++;
                                  var38.field_l = var38.field_l + 1;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if ((var9 ^ -1) >= -2) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var65[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.l(255);
                                          if (0 != var15_int) {
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
                                          } else {
                                            var12++;
                                            var13_int = var12;
                                            break L8;
                                          }
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var13 = new jm[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.l(255);
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
                                      var46 = (byte[]) (Object) stackIn_38_0;
                                      var15_array = var46;
                                      var14 = var38.l(255);
                                      if (var14 > 0) {
                                        stackOut_40_0 = new byte[2 * var14];
                                        stackIn_41_0 = stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var70 = (byte[]) (Object) stackIn_41_0;
                                    var64 = var70;
                                    var58 = var64;
                                    var47 = var58;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (0 == var38.field_k[var17 + var38.field_l]) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_l = var38.field_l + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (128 <= var20) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if ((var23 ^ -1) <= -129) {
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (-129 >= (var24 ^ -1)) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (-129 >= (var25_int ^ -1)) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 <= -129) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= (var27 ^ -1)) {
                                                                        ((pq) this).field_u = 1 + var38.l(255);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var27 >= var46.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.b(true);
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
                                                                                  if (var70.length <= var27) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.b(true);
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
                                                                                  if (var12 <= var27) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.l(255);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var46.length) {
                                                                                            var27 = var46[0];
                                                                                            var28 = var46[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var46.length) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if ((var30 ^ -1) <= -129) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((pq) this).field_p[var30] = (byte)(((pq) this).field_p[var30] * var28 + 32 >> -351679098);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = var28 * (-var27 + var30) - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = df.a(var30 + -var27, (byte) 15, var32);
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        ((pq) this).field_p[var33] = (byte)(((pq) this).field_p[var33] * var34 - -32 >> 1872574246);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((pq) this).field_p[var29] = (byte)(32 + ((pq) this).field_p[var29] * var28 >> 108425318);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + var19 - -var38.l(255);
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
                                                                                        var19 = var38.l(255);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var70.length <= var27) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1] << 5759009;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var70.length <= var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if ((var30 ^ -1) <= -129) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (255 & ((pq) this).field_r[var30]);
                                                                                                          if ((var31 ^ -1) <= -1) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if ((var31 ^ -1) >= -129) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((pq) this).field_r[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var16[1 + var29] << 1110365633;
                                                                                                    var32 = (-var27 + var30) * var28 - -((var30 - var27) / 2);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = df.a(var30 + -var27, (byte) 15, var32);
                                                                                                          var35 = (((pq) this).field_r[var37] & 255) + var34;
                                                                                                          if (-1 >= (var35 ^ -1)) {
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
                                                                                                        ((pq) this).field_r[var37] = (byte)var35;
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28 + (255 & ((pq) this).field_r[var29]);
                                                                                                  if (0 <= var30) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if (var30 <= 128) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((pq) this).field_r[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + (var19 - -var38.l(255));
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L47: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var12 <= var27) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (var52.field_a > 0) {
                                                                                                          var52.field_e = var38.l(255);
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
                                                                                                    if ((var51.field_d ^ -1) < -1) {
                                                                                                      var51.field_a = var38.l(255);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_d = var38.l(255);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_g == null) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_h = var38.l(255);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (var50.field_c == null) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_b = var38.l(255);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (0 < var50.field_j) {
                                                                                              var50.field_k = var38.l(255);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_j = var38.l(255);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (null != var49.field_g) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_g.length) {
                                                                                          var19 = var19 + 1 + var38.l(255);
                                                                                          var49.field_g[var29] = (byte)var19;
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
                                                                                if (var48.field_c != null) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var48.field_c.length > var29) {
                                                                                      var19 = var38.l(255) + 1 + var19;
                                                                                      var48.field_c[var29] = (byte)var19;
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
                                                                              if (null == var45.field_g) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var29 >= var45.field_g.length) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_g[var29] = var38.b(true);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var45.field_c != null) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var29 < var45.field_c.length + -2) {
                                                                                  var45.field_c[var29] = var38.b(true);
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
                                                                          if (var20 != 0) {
                                                                            break L59;
                                                                          } else {
                                                                            L60: {
                                                                              if (var21 >= var66.length) {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              } else {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if ((((pq) this).field_s[var27] ^ -1) >= -1) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = 1 + var38.l(255);
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((pq) this).field_p[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (-1 != ((pq) this).field_s[var26]) {
                                                                      L61: {
                                                                        if (0 != var20) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var65[var21]];
                                                                          if (var21 >= var69.length) {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          } else {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      ((pq) this).field_l[var26] = var25_ref;
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
                                                                if (((pq) this).field_s[var25_int] != 0) {
                                                                  L62: {
                                                                    if (var20 != 0) {
                                                                      break L62;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = 16 + var38.field_k[var8] << 1949611490;
                                                                      if (var21 >= var68.length) {
                                                                        var20 = -1;
                                                                        break L62;
                                                                      } else {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L62;
                                                                      }
                                                                    }
                                                                  }
                                                                  ((pq) this).field_r[var25_int] = (byte)var24;
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
                                                            if (((pq) this).field_s[var24] != 0) {
                                                              L63: {
                                                                if (var20 != 0) {
                                                                  break L63;
                                                                } else {
                                                                  var5++;
                                                                  var23 = -1 + var38.field_k[var5];
                                                                  if (var21 >= var67.length) {
                                                                    var20 = -1;
                                                                    break L63;
                                                                  } else {
                                                                    var21++;
                                                                    var20 = var4[var21];
                                                                    break L63;
                                                                  }
                                                                }
                                                              }
                                                              var20--;
                                                              ((pq) this).field_i[var24] = (byte)var23;
                                                              var24++;
                                                              continue L18;
                                                            } else {
                                                              var24++;
                                                              continue L18;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        L64: {
                                                          if (var20 != 0) {
                                                            break L64;
                                                          } else {
                                                            L65: {
                                                              if (var21 >= var66.length) {
                                                                var20 = -1;
                                                                break L65;
                                                              } else {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L65;
                                                              }
                                                            }
                                                            var22 = var38.c((byte) 112);
                                                            break L64;
                                                          }
                                                        }
                                                        ((pq) this).field_j[var23] = (short)(((pq) this).field_j[var23] + (ik.a(2, -1 + var22) << 853199214));
                                                        var20--;
                                                        ((pq) this).field_s[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.l(255);
                                                    ((pq) this).field_j[var20] = (short)(((pq) this).field_j[var20] + (var19 << -1001815256));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.l(255);
                                                ((pq) this).field_j[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.b(true);
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
                                    L66: {
                                      var13[var14] = new jm();
                                      var40 = new jm();
                                      var15 = var40;
                                      var16_int = var38.l(255);
                                      if (0 >= var16_int) {
                                        break L66;
                                      } else {
                                        var15.field_g = new byte[var16_int * 2];
                                        break L66;
                                      }
                                    }
                                    var16_int = var38.l(255);
                                    if (var16_int > 0) {
                                      var15.field_c = new byte[var16_int * 2 - -2];
                                      var40.field_c[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.b(true);
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
                        var7[var8] = var38.b(true);
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
                var4[var5] = var38.b(true);
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
        field_k = 0;
        field_m = "Accept rematch";
        field_q = "Grow: makes your paddle longer.";
        field_n = "Names cannot contain consecutive spaces";
    }
}
