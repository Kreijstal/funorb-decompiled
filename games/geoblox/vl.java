/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends hf {
    byte[] field_m;
    private int[] field_h;
    byte[] field_o;
    gd[] field_k;
    static boolean field_q;
    static java.math.BigInteger field_l;
    short[] field_j;
    t[] field_f;
    byte[] field_i;
    static int field_p;
    static he field_n;
    int field_g;

    final boolean a(int[] param0, byte[] param1, int param2, ci param3) {
        int var5 = 0;
        int var6 = 0;
        gd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Geoblox.field_C;
        var5 = 1;
        var6 = 0;
        var7 = null;
        var8 = 0;
        L0: while (true) {
          if ((var8 ^ -1) <= -129) {
            L1: {
              if (param2 > 8) {
                break L1;
              } else {
                field_q = true;
                break L1;
              }
            }
            return var5 != 0;
          } else {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1[var8] != -1) {
                  break L2;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
            var9 = ((vl) this).field_h[var8];
            if (-1 != var9) {
              L3: {
                if (var9 != var6) {
                  L4: {
                    var6 = var9;
                    var9--;
                    if (-1 != (var9 & 1 ^ -1)) {
                      var7 = param3.a(var9 >> 2021757378, 1, param0);
                      break L4;
                    } else {
                      var7 = param3.a(var9 >> 583212258, param0, false);
                      break L4;
                    }
                  }
                  if (var7 != null) {
                    break L3;
                  } else {
                    var5 = 0;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (var7 != null) {
                ((vl) this).field_k[var8] = var7;
                ((vl) this).field_h[var8] = 0;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_l = null;
        }
        field_n = null;
        field_l = null;
    }

    final static vl a(int param0, byte param1, rh param2) {
        byte[] var4 = param2.d(28319, param0);
        byte[] var3 = var4;
        if (param1 < 26) {
            field_p = 30;
        }
        if (var4 == null) {
            return null;
        }
        return new vl(var4);
    }

    final void a(byte param0) {
        if (param0 > -94) {
            ((vl) this).field_j = null;
        }
        ((vl) this).field_h = null;
    }

    final static void a(dm[] param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Geoblox.field_C;
        if (param0 != null) {
            if (!(param1 > 0)) {
                return;
            }
            var5 = param0[0].field_s;
            var6 = param0[2].field_s;
            var7 = param0[1].field_s;
            param0[0].b(param3, param2);
            param0[2].b(param3 + param1 + -var6, param2);
            vb.a(da.field_d);
            vb.b(param3 + var5, param2, param3 - -param1 - var6, param2 - -param0[1].field_o);
            var8 = var5 + param3;
            var9 = param1 + (param3 - var6);
            param3 = var8;
            while (param3 < var9) {
                param0[1].b(param3, param2);
                param3 = param3 + var7;
            }
            vb.b(da.field_d);
            if (param4 != 107) {
                field_l = null;
            }
            return;
        }
    }

    private vl(byte[] param0) {
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
        t[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        t var15 = null;
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
        t var25_ref = null;
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
        qc var38 = null;
        byte[] var39 = null;
        t var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        t var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        t var48 = null;
        t var49 = null;
        t var50 = null;
        t var51 = null;
        t var52 = null;
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
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        Object stackOut_37_0 = null;
        byte[] stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        byte[] stackOut_39_0 = null;
        ((vl) this).field_m = new byte[128];
        ((vl) this).field_f = new t[128];
        ((vl) this).field_k = new gd[128];
        ((vl) this).field_h = new int[128];
        ((vl) this).field_j = new short[128];
        ((vl) this).field_i = new byte[128];
        ((vl) this).field_o = new byte[128];
        var38 = new qc(param0);
        var3 = 0;
        L0: while (true) {
          if (-1 == (var38.field_j[var3 + var38.field_f] ^ -1)) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var38.field_f = var38.field_f + 1;
                var3++;
                var5 = var38.field_f;
                var38.field_f = var38.field_f + var3;
                var6 = 0;
                L2: while (true) {
                  if (0 == var38.field_j[var6 + var38.field_f]) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var6++;
                        var38.field_f = var38.field_f + 1;
                        var8 = var38.field_f;
                        var38.field_f = var38.field_f + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_j[var9 + var38.field_f] == 0) {
                            var67 = new byte[var9];
                            var62 = var67;
                            var57 = var62;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var38.field_f = var38.field_f + 1;
                                  var9++;
                                  var63 = new byte[var9];
                                  var58 = var63;
                                  var53 = var58;
                                  var39 = var53;
                                  var11 = var39;
                                  if (var9 > 1) {
                                    var63[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.c((byte) 34);
                                          if (0 == var15_int) {
                                            var12++;
                                            var13_int = var12;
                                            break L8;
                                          } else {
                                            L9: {
                                              if (var15_int > var13_int) {
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
                                var13 = new t[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.c((byte) 34);
                                      if (-1 <= (var14 ^ -1)) {
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
                                      var14 = var38.c((byte) 34);
                                      if (0 >= var14) {
                                        stackOut_40_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = new byte[var14 * 2];
                                        stackIn_41_0 = stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var47 = stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (-1 == (var38.field_j[var17 + var38.field_f] ^ -1)) {
                                        var64 = new byte[var17];
                                        var59 = var64;
                                        var54 = var59;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_f = var38.field_f + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if ((var20 ^ -1) <= -129) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (var23 >= 128) {
                                                        var21 = 0;
                                                        var20 = 0;
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
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((vl) this).field_g = 1 + var38.c((byte) 34);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var12 <= var27) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var27 >= var46.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.f((byte) 96);
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
                                                                                  if (var47.length <= var27) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.f((byte) 75);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (var27 >= var12) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var12 <= var27) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.c((byte) 34);
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
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((vl) this).field_o[var30] = (byte)(32 + ((vl) this).field_o[var30] * var28 >> 494611078);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = var28 * (var30 - var27) - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = pk.a(var30 + -var27, (byte) -6, var32);
                                                                                                        ((vl) this).field_o[var33] = (byte)(32 + ((vl) this).field_o[var33] * var34 >> -1179002010);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((vl) this).field_o[var29] = (byte)(((vl) this).field_o[var29] * var28 + 32 >> -315387354);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.c((byte) 34) + 1 + var19;
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
                                                                                        var19 = var38.c((byte) 34);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var47.length) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 1552264673;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var47.length) {
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 <= -129) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = (((vl) this).field_m[var30] & 255) - -var28;
                                                                                                          if (-1 <= var31) {
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
                                                                                                        ((vl) this).field_m[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 - -1] << 769647041;
                                                                                                    var32 = (var30 - var27) * var28 + (-var27 + var30) / 2;
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
                                                                                                          var34 = pk.a(var30 + -var27, (byte) -6, var32);
                                                                                                          var35 = (((vl) this).field_m[var37] & 255) - -var34;
                                                                                                          if ((var35 ^ -1) <= -1) {
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
                                                                                                        ((vl) this).field_m[var37] = (byte)var35;
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (255 & ((vl) this).field_m[var29]) - -var28;
                                                                                                  if (var30 >= 0) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if ((var30 ^ -1) >= -129) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((vl) this).field_m[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.c((byte) 34) + 1 + var19;
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
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (0 < var52.field_b) {
                                                                                                          var52.field_j = var38.c((byte) 34);
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
                                                                                                    if (var51.field_d > 0) {
                                                                                                      var51.field_b = var38.c((byte) 34);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_d = var38.c((byte) 34);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_f) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_g = var38.c((byte) 34);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (var50.field_e == null) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_a = var38.c((byte) 34);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (-1 > (var50.field_c ^ -1)) {
                                                                                              var50.field_h = var38.c((byte) 34);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_c = var38.c((byte) 34);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (null != var49.field_f) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_f.length) {
                                                                                          var19 = var38.c((byte) 34) + (1 + var19);
                                                                                          var49.field_f[var29] = (byte)var19;
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
                                                                                if (null != var48.field_e) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var29 < var48.field_e.length) {
                                                                                      var19 = var38.c((byte) 34) + (1 + var19);
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
                                                                              if (null == var45.field_f) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var45.field_f.length <= var29) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_f[var29] = var38.f((byte) 76);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var45.field_e != null) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (-2 + var45.field_e.length > var29) {
                                                                                  var45.field_e[var29] = var38.f((byte) 102);
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
                                                                              if (var64.length > var21) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (0 >= ((vl) this).field_h[var27]) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = var38.c((byte) 34) + 1;
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((vl) this).field_o[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (0 != ((vl) this).field_h[var26]) {
                                                                      L61: {
                                                                        if (var20 != 0) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var63[var21]];
                                                                          if (var21 < var67.length) {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      var20--;
                                                                      ((vl) this).field_f[var26] = var25_ref;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (0 != ((vl) this).field_h[var25_int]) {
                                                                  L62: {
                                                                    if (var20 != 0) {
                                                                      break L62;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = 16 + var38.field_j[var8] << 1233128290;
                                                                      if (var66.length > var21) {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L62;
                                                                      } else {
                                                                        var20 = -1;
                                                                        break L62;
                                                                      }
                                                                    }
                                                                  }
                                                                  ((vl) this).field_m[var25_int] = (byte)var24;
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
                                                            if (((vl) this).field_h[var24] != 0) {
                                                              L63: {
                                                                if (-1 != (var20 ^ -1)) {
                                                                  break L63;
                                                                } else {
                                                                  var5++;
                                                                  var23 = -1 + var38.field_j[var5];
                                                                  if (var21 >= var65.length) {
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
                                                              ((vl) this).field_i[var24] = (byte)var23;
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
                                                          if (-1 != (var20 ^ -1)) {
                                                            break L64;
                                                          } else {
                                                            L65: {
                                                              if (var64.length > var21) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L65;
                                                              } else {
                                                                var20 = -1;
                                                                break L65;
                                                              }
                                                            }
                                                            var22 = var38.g((byte) -116);
                                                            break L64;
                                                          }
                                                        }
                                                        ((vl) this).field_j[var23] = (short)(((vl) this).field_j[var23] + cd.a(-1 + var22 << 620173806, 32768));
                                                        ((vl) this).field_h[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.c((byte) 34);
                                                    ((vl) this).field_j[var20] = (short)(((vl) this).field_j[var20] + (var19 << 878219688));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.c((byte) 34);
                                                ((vl) this).field_j[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.f((byte) 127);
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
                                      var13[var14] = new t();
                                      var40 = new t();
                                      var15 = var40;
                                      var16_int = var38.c((byte) 34);
                                      if (0 >= var16_int) {
                                        break L66;
                                      } else {
                                        var15.field_f = new byte[2 * var16_int];
                                        break L66;
                                      }
                                    }
                                    var16_int = var38.c((byte) 34);
                                    if (0 < var16_int) {
                                      var15.field_e = new byte[2 * var16_int + 2];
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
                                var10[var11_int] = var38.f((byte) 125);
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
                        var7[var8] = var38.f((byte) 91);
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
                var4[var5] = var38.f((byte) 81);
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
        field_q = false;
        field_l = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
