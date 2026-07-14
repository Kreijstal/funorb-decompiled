/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends ca {
    rc[] field_f;
    byte[] field_k;
    private int[] field_i;
    byte[] field_j;
    int field_l;
    byte[] field_h;
    dl[] field_g;
    short[] field_m;

    final static hf a(bb param0, int param1) {
        if (param1 != -129) {
            ik.a((byte) -6, 55);
        }
        hf var2 = new hf(param0, (ca) (Object) param0);
        ba.field_b.a(-85, (ca) (Object) var2);
        vb.field_f.a((di) (Object) param0);
        return var2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = OrbDefence.field_D ? 1 : 0;
        if (param4 <= -42) {
          param0--;
          L0: while (true) {
            if ((param0 ^ -1) > -1) {
              return;
            } else {
              var17 = param7;
              var10 = var17;
              var11 = param1;
              var12 = param6;
              var13 = param2;
              var14 = param8;
              var15 = var17[var11] >> -1813504223 & 8355711;
              var10[var11] = var15 + (vi.a(33423360, var12) >> 468276225) + ((vi.a(33423821, var13) >> 1959991273) + (vi.a(33541693, var14) >> 36187537));
              param1++;
              param2 = param2 + param3;
              param6 = param6 + param5;
              param8 = param8 + param9;
              param0--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, int param1) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        int var2_int = 56 % ((15 - param0) / 44);
        ef var3 = (ef) (Object) sd.field_a.b((byte) -13);
        while (var3 != null) {
            jk.a(param1, var3, false);
            var3 = (ef) (Object) sd.field_a.d(853);
        }
        ca var2 = e.field_b.b((byte) -101);
        while (var2 != null) {
            lg.a(param1, 78);
            var2 = e.field_b.d(853);
        }
    }

    final static int a(ee param0, ee param1, int param2) {
        if (param2 != 0) {
            ik.a((byte) -2, 76);
        }
        Object var4 = null;
        return jk.a(0, 0, param0, (String) null, param1, false, -23739);
    }

    final void c(boolean param0) {
        ((ik) this).field_i = null;
        if (param0) {
            ((ik) this).field_g = null;
        }
    }

    final boolean a(int param0, vd param1, int[] param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        dl var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        var5 = 1;
        var6 = 0;
        var8 = 62 / ((14 - param0) / 55);
        var7 = null;
        var9 = 0;
        L0: while (true) {
          if (var9 >= 128) {
            return var5 != 0;
          } else {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3[var9] != 0) {
                  break L1;
                } else {
                  var9++;
                  continue L0;
                }
              }
            }
            var10 = ((ik) this).field_i[var9];
            if (0 != var10) {
              L2: {
                if (var10 != var6) {
                  L3: {
                    var6 = var10;
                    var10--;
                    if ((1 & var10) != 0) {
                      var7 = param1.a(var10 >> 370519042, param2, 120);
                      break L3;
                    } else {
                      var7 = param1.a(var10 >> -1639044926, (byte) 92, param2);
                      break L3;
                    }
                  }
                  if (var7 != null) {
                    break L2;
                  } else {
                    var5 = 0;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (var7 != null) {
                ((ik) this).field_g[var9] = var7;
                ((ik) this).field_i[var9] = 0;
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    ik(byte[] param0) {
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
        rc[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        rc var15 = null;
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
        rc var25_ref = null;
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
        mg var38 = null;
        byte[] var39 = null;
        rc var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        rc var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        rc var48 = null;
        rc var49 = null;
        rc var50 = null;
        rc var51 = null;
        rc var52 = null;
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
        byte[] stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        byte[] stackOut_39_0 = null;
        ((ik) this).field_k = new byte[128];
        ((ik) this).field_i = new int[128];
        ((ik) this).field_m = new short[128];
        ((ik) this).field_j = new byte[128];
        ((ik) this).field_g = new dl[128];
        ((ik) this).field_h = new byte[128];
        ((ik) this).field_f = new rc[128];
        var38 = new mg(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var38.field_j[var38.field_i - -var3]) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var3++;
                var38.field_i = var38.field_i + 1;
                var5 = var38.field_i;
                var38.field_i = var38.field_i + var3;
                var6 = 0;
                L2: while (true) {
                  if (0 == var38.field_j[var6 + var38.field_i]) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var6++;
                        var38.field_i = var38.field_i + 1;
                        var8 = var38.field_i;
                        var38.field_i = var38.field_i + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (0 == var38.field_j[var9 + var38.field_i]) {
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
                                  var38.field_i = var38.field_i + 1;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (-2 <= (var9 ^ -1)) {
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
                                          var15_int = var38.b((byte) 90);
                                          if (var15_int != 0) {
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
                                var13 = new rc[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.b((byte) 90);
                                      if ((var14 ^ -1) < -1) {
                                        stackOut_37_0 = new byte[var14 * 2];
                                        stackIn_38_0 = stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var70 = stackIn_38_0;
                                      var64 = var70;
                                      var58 = var64;
                                      var46 = var58;
                                      var15_array = var46;
                                      var14 = var38.b((byte) 90);
                                      if (-1 <= (var14 ^ -1)) {
                                        stackOut_40_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = new byte[2 * var14];
                                        stackIn_41_0 = stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var47 = stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_j[var38.field_i + var17] == 0) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_i = var38.field_i + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (-129 >= (var20 ^ -1)) {
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
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if ((var25_int ^ -1) <= -129) {
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
                                                                        ((ik) this).field_l = 1 + var38.b((byte) 90);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var12 <= var27) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var27 >= var70.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.d(-20398);
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
                                                                                  if (var27 >= var47.length) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.d(-20398);
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
                                                                                        var19 = var38.b((byte) 90);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var70.length) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var70.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((ik) this).field_j[var30] = (byte)(((ik) this).field_j[var30] * var28 - -32 >> -479869146);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = var28 * (-var27 + var30) + (var30 - var27) / 2;
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = dd.a(-1, var32, var30 + -var27);
                                                                                                        ((ik) this).field_j[var33] = (byte)(32 + var34 * ((ik) this).field_j[var33] >> 451542854);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((ik) this).field_j[var29] = (byte)(((ik) this).field_j[var29] * var28 - -32 >> 1618933670);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.b((byte) 90) + (1 + var19);
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
                                                                                        var19 = var38.b((byte) 90);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var47.length) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << -950305055;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var47.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (((ik) this).field_k[var30] & 255);
                                                                                                          if (0 <= var31) {
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
                                                                                                        ((ik) this).field_k[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 - -1] << -227145855;
                                                                                                    var32 = (-var27 + var30) * var28 - -((var30 - var27) / 2);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var37 >= var30) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = dd.a(-1, var32, var30 + -var27);
                                                                                                          var35 = var34 + (255 & ((ik) this).field_k[var37]);
                                                                                                          if (0 <= var35) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if ((var35 ^ -1) >= -129) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((ik) this).field_k[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (((ik) this).field_k[var29] & 255) - -var28;
                                                                                                  if (var30 >= 0) {
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
                                                                                                ((ik) this).field_k[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.b((byte) 90) + (var19 - -1);
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
                                                                                                        if ((var52.field_j ^ -1) < -1) {
                                                                                                          var52.field_b = var38.b((byte) 90);
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
                                                                                                    if (0 < var51.field_h) {
                                                                                                      var51.field_j = var38.b((byte) 90);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_h = var38.b((byte) 90);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_l) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_g = var38.b((byte) 90);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_e) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_f = var38.b((byte) 90);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (var50.field_c > 0) {
                                                                                              var50.field_k = var38.b((byte) 90);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_c = var38.b((byte) 90);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (null != var49.field_l) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_l.length) {
                                                                                          var19 = var19 + 1 + var38.b((byte) 90);
                                                                                          var49.field_l[var29] = (byte)var19;
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
                                                                                      var19 = var38.b((byte) 90) + 1 + var19;
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
                                                                              if (var45.field_l == null) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var29 >= var45.field_l.length) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_l[var29] = var38.d(-20398);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_e) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var29 < var45.field_e.length + -2) {
                                                                                  var45.field_e[var29] = var38.d(-20398);
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
                                                                              if (var21 < var66.length) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (((ik) this).field_i[var27] <= 0) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = var38.b((byte) 90) + 1;
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((ik) this).field_j[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((ik) this).field_i[var26] != 0) {
                                                                      L61: {
                                                                        if (var20 != 0) {
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
                                                                      var20--;
                                                                      ((ik) this).field_f[var26] = var25_ref;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (((ik) this).field_i[var25_int] != 0) {
                                                                  L62: {
                                                                    if (var20 != 0) {
                                                                      break L62;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = var38.field_j[var8] - -16 << -1312191294;
                                                                      if (var21 < var68.length) {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L62;
                                                                      } else {
                                                                        var20 = -1;
                                                                        break L62;
                                                                      }
                                                                    }
                                                                  }
                                                                  var20--;
                                                                  ((ik) this).field_k[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (-1 != (((ik) this).field_i[var24] ^ -1)) {
                                                              L63: {
                                                                if (var20 != 0) {
                                                                  break L63;
                                                                } else {
                                                                  L64: {
                                                                    if (var21 < var67.length) {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L64;
                                                                    } else {
                                                                      var20 = -1;
                                                                      break L64;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = -1 + var38.field_j[var5];
                                                                  break L63;
                                                                }
                                                              }
                                                              ((ik) this).field_h[var24] = (byte)var23;
                                                              var20--;
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
                                                          if (0 != var20) {
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
                                                            var22 = var38.k(0);
                                                            break L65;
                                                          }
                                                        }
                                                        ((ik) this).field_m[var23] = (short)(((ik) this).field_m[var23] + (vi.a(2, var22 - 1) << 1170429390));
                                                        var20--;
                                                        ((ik) this).field_i[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.b((byte) 90);
                                                    ((ik) this).field_m[var20] = (short)(((ik) this).field_m[var20] + (var19 << 1950613992));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.b((byte) 90);
                                                ((ik) this).field_m[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.d(-20398);
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
                                      var13[var14] = new rc();
                                      var40 = new rc();
                                      var15 = var40;
                                      var16_int = var38.b((byte) 90);
                                      if (0 >= var16_int) {
                                        break L67;
                                      } else {
                                        var15.field_l = new byte[2 * var16_int];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.b((byte) 90);
                                    if (0 < var16_int) {
                                      var15.field_e = new byte[2 + 2 * var16_int];
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
                                var10[var11_int] = var38.d(-20398);
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
                        var7[var8] = var38.d(-20398);
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
                var4[var5] = var38.d(-20398);
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
