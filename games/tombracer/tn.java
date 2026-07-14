/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends vg {
    byte[] field_j;
    byte[] field_l;
    int field_i;
    short[] field_g;
    bq[] field_m;
    static iv field_n;
    u[] field_h;
    private int[] field_k;
    byte[] field_f;

    final void a(boolean param0) {
        ((tn) this).field_k = null;
        if (param0) {
            String discarded$0 = tn.a(-65);
        }
    }

    final boolean a(int param0, byte[] param1, nda param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        u var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          var5 = 1;
          if (param0 == -5853) {
            break L0;
          } else {
            ((tn) this).field_f = null;
            break L0;
          }
        }
        var6 = 0;
        var7 = null;
        var8 = 0;
        L1: while (true) {
          if (128 <= var8) {
            return var5 != 0;
          } else {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (0 != param1[var8]) {
                  break L2;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
            var9 = ((tn) this).field_k[var8];
            if (-1 != (var9 ^ -1)) {
              L3: {
                if (var6 == var9) {
                  break L3;
                } else {
                  L4: {
                    var6 = var9;
                    var9--;
                    if (0 != (var9 & 1)) {
                      var7 = param2.a((byte) -32, param3, var9 >> -197324734);
                      break L4;
                    } else {
                      var7 = param2.a(var9 >> 1581606882, param3, 0);
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
                ((tn) this).field_h[var8] = var7;
                ((tn) this).field_k[var8] = 0;
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

    public static void a(byte param0) {
        field_n = null;
        if (param0 != 94) {
            field_n = null;
        }
    }

    final static String a(int param0) {
        if (param0 != -10918) {
            String discarded$0 = tn.a(120);
        }
        if ((cga.field_f ^ -1) > -3) {
            return ub.field_b;
        }
        if (nja.field_J != null) {
            if (!(nja.field_J.b(-60))) {
                return hra.field_c;
            }
            return voa.field_s;
        }
        if (!(tk.field_b.b(-97))) {
            return cv.field_r;
        }
        if (!tk.field_b.c("commonui", param0 ^ 10971)) {
            return q.field_o + " - " + tk.field_b.a("commonui", true) + "%";
        }
        if (!hm.field_n.b(-99)) {
            return hua.field_a;
        }
        if (!(hm.field_n.c("commonui", -128))) {
            return vja.field_b + " - " + hm.field_n.a("commonui", true) + "%";
        }
        if (!vc.field_p.b(param0 + 10827)) {
            return wt.field_b;
        }
        if (!(vc.field_p.a(0))) {
            return th.field_u + " - " + vc.field_p.a(true) + "%";
        }
        return dt.field_n;
    }

    tn(byte[] param0) {
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
        bq[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        bq var15 = null;
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
        bq var25_ref = null;
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
        uia var38 = null;
        byte[] var39 = null;
        bq var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        bq var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        bq var48 = null;
        bq var49 = null;
        bq var50 = null;
        bq var51 = null;
        bq var52 = null;
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
        ((tn) this).field_l = new byte[128];
        ((tn) this).field_h = new u[128];
        ((tn) this).field_j = new byte[128];
        ((tn) this).field_k = new int[128];
        ((tn) this).field_f = new byte[128];
        ((tn) this).field_m = new bq[128];
        ((tn) this).field_g = new short[128];
        var38 = new uia(param0);
        var3 = 0;
        L0: while (true) {
          if (-1 == (var38.field_g[var3 + var38.field_h] ^ -1)) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var38.field_h = var38.field_h + 1;
                var3++;
                var5 = var38.field_h;
                var38.field_h = var38.field_h + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_g[var38.field_h + var6] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var6++;
                        var38.field_h = var38.field_h + 1;
                        var8 = var38.field_h;
                        var38.field_h = var38.field_h + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (0 == var38.field_g[var9 + var38.field_h]) {
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
                                  var38.field_h = var38.field_h + 1;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (1 >= var9) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.h(255);
                                          if (-1 != (var15_int ^ -1)) {
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
                                var13 = new bq[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.h(255);
                                      if ((var14 ^ -1) >= -1) {
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = new byte[2 * var14];
                                        stackIn_38_0 = stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var46 = stackIn_38_0;
                                      var15_array = var46;
                                      var14 = var38.h(255);
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
                                      if (var38.field_g[var17 + var38.field_h] == 0) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var38.field_h = var38.field_h + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if ((var20 ^ -1) <= -129) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (-129 >= (var20 ^ -1)) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (128 <= var23) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 <= -129) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (-129 >= var25_int) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (128 <= var26) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((tn) this).field_i = 1 + var38.h(255);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var46.length <= var27) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.c((byte) 63);
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
                                                                                    var16[var27] = var38.c((byte) 44);
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
                                                                                        var19 = var38.h(255);
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
                                                                                                  if (var46.length <= var29) {
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((tn) this).field_j[var30] = (byte)(32 + ((tn) this).field_j[var30] * var28 >> 1447188390);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = (var30 + -var27) / 2 + (var30 - var27) * var28;
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = go.e(-1, var32, -var27 + var30);
                                                                                                        ((tn) this).field_j[var33] = (byte)(var34 * ((tn) this).field_j[var33] - -32 >> -555708954);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((tn) this).field_j[var29] = (byte)(32 + ((tn) this).field_j[var29] * var28 >> -516278554);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + var19 - -var38.h(255);
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 != null) {
                                                                                        var19 = var38.h(255);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var70.length) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1] << -221185055;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var70.length <= var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var27 = 0;
                                                                                                        L40: while (true) {
                                                                                                          if (var27 >= var12) {
                                                                                                            break L35;
                                                                                                          } else {
                                                                                                            var13[var27].field_n = var38.h(255);
                                                                                                            var27++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L41: {
                                                                                                          var31 = var28 + (((tn) this).field_l[var30] & 255);
                                                                                                          if (0 <= var31) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        L42: {
                                                                                                          if (128 >= var31) {
                                                                                                            break L42;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L42;
                                                                                                          }
                                                                                                        }
                                                                                                        ((tn) this).field_l[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var16[var29 - -1] << 137960641;
                                                                                                    var32 = var28 * (-var27 + var30) + (-var27 + var30) / 2;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L43: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L44: {
                                                                                                          var34 = go.e(-1, var32, -var27 + var30);
                                                                                                          var35 = var34 + (255 & ((tn) this).field_l[var37]);
                                                                                                          if (var35 <= -1) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        L45: {
                                                                                                          if (-129 >= var35) {
                                                                                                            break L45;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L45;
                                                                                                          }
                                                                                                        }
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        ((tn) this).field_l[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L43;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L46: {
                                                                                                  var30 = (((tn) this).field_l[var29] & 255) - -var28;
                                                                                                  if (var30 <= -1) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                L47: {
                                                                                                  if (-129 >= var30) {
                                                                                                    break L47;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L47;
                                                                                                  }
                                                                                                }
                                                                                                ((tn) this).field_l[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.h(255) + (var19 + 1);
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            break L35;
                                                                                          } else {
                                                                                            var13[var27].field_n = var38.h(255);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L49: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        var27 = 0;
                                                                                        L50: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L51: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                  } else {
                                                                                                    var52 = var13[var27];
                                                                                                    if ((var52.field_l ^ -1) < -1) {
                                                                                                      var52.field_j = var38.h(255);
                                                                                                      var27++;
                                                                                                      continue L52;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L52;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var51 = var13[var27];
                                                                                                if (var51.field_d > 0) {
                                                                                                  var51.field_l = var38.h(255);
                                                                                                  var27++;
                                                                                                  continue L51;
                                                                                                } else {
                                                                                                  var27++;
                                                                                                  continue L51;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_d = var38.h(255);
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L53: {
                                                                                          var50 = var13[var27];
                                                                                          if (var50.field_m == null) {
                                                                                            break L53;
                                                                                          } else {
                                                                                            var50.field_i = var38.h(255);
                                                                                            break L53;
                                                                                          }
                                                                                        }
                                                                                        L54: {
                                                                                          if (null == var50.field_g) {
                                                                                            break L54;
                                                                                          } else {
                                                                                            var50.field_f = var38.h(255);
                                                                                            break L54;
                                                                                          }
                                                                                        }
                                                                                        if (0 < var50.field_n) {
                                                                                          var50.field_c = var38.h(255);
                                                                                          var27++;
                                                                                          continue L49;
                                                                                        } else {
                                                                                          var27++;
                                                                                          continue L49;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (var49.field_m != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L55: while (true) {
                                                                                        if (var49.field_m.length > var29) {
                                                                                          var19 = var38.h(255) + (1 + var19);
                                                                                          var49.field_m[var29] = (byte)var19;
                                                                                          var29 += 2;
                                                                                          continue L55;
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
                                                                                if (null != var48.field_g) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L56: while (true) {
                                                                                    if (var29 < var48.field_g.length) {
                                                                                      var19 = 1 + (var19 + var38.h(255));
                                                                                      var48.field_g[var29] = (byte)var19;
                                                                                      var29 += 2;
                                                                                      continue L56;
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
                                                                            L57: {
                                                                              var45 = var13[var27];
                                                                              if (null == var45.field_m) {
                                                                                break L57;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L58: while (true) {
                                                                                  if (var29 >= var45.field_m.length) {
                                                                                    break L57;
                                                                                  } else {
                                                                                    var45.field_m[var29] = var38.c((byte) 124);
                                                                                    var29 += 2;
                                                                                    continue L58;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_g) {
                                                                              var29 = 3;
                                                                              L59: while (true) {
                                                                                if (-2 + var45.field_g.length > var29) {
                                                                                  var45.field_g[var29] = var38.c((byte) 81);
                                                                                  var29 += 2;
                                                                                  continue L59;
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
                                                                        L60: {
                                                                          if (0 != var20) {
                                                                            break L60;
                                                                          } else {
                                                                            L61: {
                                                                              if (var66.length <= var21) {
                                                                                var20 = -1;
                                                                                break L61;
                                                                              } else {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L61;
                                                                              }
                                                                            }
                                                                            if (-1 <= (((tn) this).field_k[var27] ^ -1)) {
                                                                              break L60;
                                                                            } else {
                                                                              var26 = var38.h(255) - -1;
                                                                              break L60;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((tn) this).field_j[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (0 != ((tn) this).field_k[var26]) {
                                                                      L62: {
                                                                        if (var20 != 0) {
                                                                          break L62;
                                                                        } else {
                                                                          var25_ref = var13[var65[var21]];
                                                                          if (var21 < var69.length) {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L62;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L62;
                                                                          }
                                                                        }
                                                                      }
                                                                      var20--;
                                                                      ((tn) this).field_m[var26] = var25_ref;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (((tn) this).field_k[var25_int] != 0) {
                                                                  L63: {
                                                                    if (-1 != var20) {
                                                                      break L63;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = var38.field_g[var8] + 16 << -679212414;
                                                                      if (var21 >= var68.length) {
                                                                        var20 = -1;
                                                                        break L63;
                                                                      } else {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L63;
                                                                      }
                                                                    }
                                                                  }
                                                                  ((tn) this).field_l[var25_int] = (byte)var24;
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
                                                            if (((tn) this).field_k[var24] != 0) {
                                                              L64: {
                                                                if (-1 != var20) {
                                                                  break L64;
                                                                } else {
                                                                  var5++;
                                                                  var23 = -1 + var38.field_g[var5];
                                                                  if (var21 >= var67.length) {
                                                                    var20 = -1;
                                                                    break L64;
                                                                  } else {
                                                                    var21++;
                                                                    var20 = var4[var21];
                                                                    break L64;
                                                                  }
                                                                }
                                                              }
                                                              var20--;
                                                              ((tn) this).field_f[var24] = (byte)var23;
                                                              var24++;
                                                              continue L18;
                                                            } else {
                                                              var24++;
                                                              continue L18;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        L65: {
                                                          if (-1 != (var20 ^ -1)) {
                                                            break L65;
                                                          } else {
                                                            L66: {
                                                              if (var66.length > var21) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L66;
                                                              } else {
                                                                var20 = -1;
                                                                break L66;
                                                              }
                                                            }
                                                            var22 = var38.b((byte) -123);
                                                            break L65;
                                                          }
                                                        }
                                                        ((tn) this).field_g[var23] = (short)(((tn) this).field_g[var23] + (sea.c(-1 + var22, 2) << 9434510));
                                                        var20--;
                                                        ((tn) this).field_k[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.h(255);
                                                    ((tn) this).field_g[var20] = (short)(((tn) this).field_g[var20] + (var19 << -2073954968));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.h(255);
                                                ((tn) this).field_g[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.c((byte) 86);
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
                                    L67: {
                                      var13[var14] = new bq();
                                      var40 = new bq();
                                      var15 = var40;
                                      var16_int = var38.h(255);
                                      if ((var16_int ^ -1) >= -1) {
                                        break L67;
                                      } else {
                                        var15.field_m = new byte[2 * var16_int];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.h(255);
                                    if (0 < var16_int) {
                                      var15.field_g = new byte[2 + 2 * var16_int];
                                      var40.field_g[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.c((byte) 124);
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
                        var7[var8] = var38.c((byte) 63);
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
                var4[var5] = var38.c((byte) 49);
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
    }
}
