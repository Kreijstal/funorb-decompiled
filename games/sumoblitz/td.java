/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class td extends ms {
    byte[] field_q;
    static String field_l;
    qp[] field_o;
    byte[] field_t;
    mq[] field_n;
    private int[] field_p;
    static boolean field_m;
    static int field_u;
    byte[] field_r;
    short[] field_k;
    int field_s;

    final boolean a(byte[] param0, int[] param1, og param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        qp var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Sumoblitz.field_L ? 1 : 0;
        var5 = 1;
        if (param3 == 1255750754) {
          var6 = 0;
          var7 = null;
          var8 = 0;
          L0: while (true) {
            if (var8 >= 128) {
              return var5 != 0;
            } else {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0[var8] != 0) {
                    break L1;
                  } else {
                    var8++;
                    continue L0;
                  }
                }
              }
              var9 = ((td) this).field_p[var8];
              if (var9 != 0) {
                L2: {
                  if (var6 == var9) {
                    break L2;
                  } else {
                    L3: {
                      var6 = var9;
                      var9--;
                      if ((1 & var9) != 0) {
                        var7 = param2.b(-94, param1, var9 >> 227756258);
                        break L3;
                      } else {
                        var7 = param2.a(var9 >> 1255750754, param1, 10709);
                        break L3;
                      }
                    }
                    if (var7 != null) {
                      break L2;
                    } else {
                      var5 = 0;
                      break L2;
                    }
                  }
                }
                if (var7 != null) {
                  ((td) this).field_o[var8] = var7;
                  ((td) this).field_p[var8] = 0;
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
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 <= 62) {
            String discarded$0 = td.a(86, -115L);
        }
    }

    final static java.net.URL a(byte param0, java.applet.Applet param1, java.net.URL param2) {
        String var3 = null;
        String var4 = null;
        if (bf.field_d != null) {
            if (!(bf.field_d.equals((Object) (Object) param1.getParameter("settings")))) {
                var3 = bf.field_d;
                var4 = var3;
                var4 = var3;
            }
        }
        if (js.field_J != null) {
            if (!(js.field_J.equals((Object) (Object) param1.getParameter("session")))) {
                var4 = js.field_J;
            }
        }
        if (param0 < 120) {
            return null;
        }
        return ej.a(param2, var4, -1, var3, -1);
    }

    final void d(byte param0) {
        ((td) this).field_p = null;
        int var2 = -58 % ((param0 - 73) / 51);
    }

    final static byte[] a(int param0, int param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3_ref_byte__ = null;
        Random var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gg var2_ref = null;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        gg var2 = (gg) (Object) pi.field_a.a((byte) -88, (long)param0);
        if (var2 == null) {
            var11 = new byte[512];
            var10 = var11;
            var3_ref_byte__ = var10;
            var4 = new Random((long)param0);
            for (var5 = 0; -256 < (var5 ^ -1); var5++) {
                var3_ref_byte__[var5] = (byte)var5;
            }
            for (var5 = 0; 255 > var5; var5++) {
                var6 = 255 - var5;
                var7 = fi.a(var6, var4, (byte) -96);
                var8 = var11[var7];
                var3_ref_byte__[var7] = var11[var6];
                var3_ref_byte__[-var5 + 511] = (byte) var8;
                var3_ref_byte__[var6] = (byte) var8;
            }
            var2_ref = new gg(var11);
            pi.field_a.a((long)param0, (pj) (Object) var2_ref, -128);
        }
        int var3 = -104 / ((60 - param1) / 58);
        return var2_ref.field_s;
    }

    final static String a(int param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = Sumoblitz.field_L ? 1 : 0;
        if ((param1 ^ -1L) >= -1L) {
            return null;
        }
        if (6582952005840035281L <= param1) {
            return null;
        }
        if (-1L == (param1 % 37L ^ -1L)) {
            return null;
        }
        if (param0 != -29275) {
            field_u = 98;
        }
        int var3 = 0;
        long var4 = param1;
        while (-1L != (var4 ^ -1L)) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = vm.field_b[(int)(-(37L * param1) + var7)];
            if (!(var9 != 95)) {
                var10 = var6.length() - 1;
                var9 = 160;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static void c(byte param0) {
        int var1 = 0;
        ah var2 = null;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 77) {
            break L0;
          } else {
            field_u = -102;
            break L0;
          }
        }
        L1: {
          if (aa.field_a == null) {
            break L1;
          } else {
            var1 = 0;
            L2: while (true) {
              if (var1 >= db.field_l) {
                break L1;
              } else {
                var2 = aa.field_a[var1];
                if (var2 != null) {
                  var2.d(-76);
                  var1++;
                  continue L2;
                } else {
                  var1++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    td(byte[] param0) {
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
        mq[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        mq var15 = null;
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
        mq var25_ref = null;
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
        fs var38 = null;
        byte[] var39 = null;
        mq var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        mq var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        mq var48 = null;
        mq var49 = null;
        mq var50 = null;
        mq var51 = null;
        mq var52 = null;
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
        ((td) this).field_k = new short[128];
        ((td) this).field_n = new mq[128];
        ((td) this).field_q = new byte[128];
        ((td) this).field_o = new qp[128];
        ((td) this).field_p = new int[128];
        ((td) this).field_t = new byte[128];
        ((td) this).field_r = new byte[128];
        var38 = new fs(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_n[var38.field_p + var3] == 0) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var3++;
                var38.field_p = var38.field_p + 1;
                var5 = var38.field_p;
                var38.field_p = var38.field_p + var3;
                var6 = 0;
                L2: while (true) {
                  if (0 == var38.field_n[var6 + var38.field_p]) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var6++;
                        var38.field_p = var38.field_p + 1;
                        var8 = var38.field_p;
                        var38.field_p = var38.field_p + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_n[var9 + var38.field_p] == 0) {
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
                                  var38.field_p = var38.field_p + 1;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (var9 > 1) {
                                    var65[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.e(-31302);
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
                                var13 = new mq[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.e(-31302);
                                      if (0 < var14) {
                                        stackOut_37_0 = new byte[2 * var14];
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
                                      var14 = var38.e(-31302);
                                      if (0 >= var14) {
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
                                      if (-1 == (var38.field_n[var38.field_p - -var17] ^ -1)) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var38.field_p = var38.field_p + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (-129 >= (var23 ^ -1)) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (-129 >= var24) {
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
                                                                  if ((var26 ^ -1) <= -129) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var27) {
                                                                        ((td) this).field_s = 1 + var38.e(-31302);
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
                                                                                    var15_array[var27] = var38.d(true);
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
                                                                                    var16[var27] = var38.d(true);
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
                                                                                        var19 = var38.e(-31302);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var70.length) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var70.length <= var29) {
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((td) this).field_q[var30] = (byte)(((td) this).field_q[var30] * var28 - -32 >> 26655494);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var15_array[var29 + 1];
                                                                                                    var32 = (-var27 + var30) * var28 - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = dh.b(var32, var30 + -var27, false);
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        ((td) this).field_q[var33] = (byte)(32 + ((td) this).field_q[var33] * var34 >> -1926406522);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((td) this).field_q[var29] = (byte)(32 + ((td) this).field_q[var29] * var28 >> -387598074);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + var19 + var38.e(-31302);
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
                                                                                        var19 = var38.e(-31302);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var47.length) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 1201683361;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var47.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (255 & ((td) this).field_t[var30]);
                                                                                                          if (-1 >= var31) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (-129 >= var31) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((td) this).field_t[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 - -1] << -1374601055;
                                                                                                    var32 = (var30 + -var27) / 2 + (-var27 + var30) * var28;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var37 >= var30) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = dh.b(var32, var30 + -var27, false);
                                                                                                          var35 = (((td) this).field_t[var37] & 255) - -var34;
                                                                                                          if (0 <= var35) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if (128 >= var35) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((td) this).field_t[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (((td) this).field_t[var29] & 255) - -var28;
                                                                                                  if (-1 >= (var30 ^ -1)) {
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
                                                                                                ((td) this).field_t[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + var19 - -var38.e(-31302);
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
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (0 < var52.field_b) {
                                                                                                          var52.field_e = var38.e(-31302);
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
                                                                                                    if (-1 > (var51.field_j ^ -1)) {
                                                                                                      var51.field_b = var38.e(-31302);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_j = var38.e(-31302);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_g) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_f = var38.e(-31302);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_h) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_c = var38.e(-31302);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if ((var50.field_i ^ -1) < -1) {
                                                                                              var50.field_d = var38.e(-31302);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_i = var38.e(-31302);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (var49.field_g != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var49.field_g.length > var29) {
                                                                                          var19 = var38.e(-31302) + (var19 - -1);
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
                                                                                if (var48.field_h != null) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var29 < var48.field_h.length) {
                                                                                      var19 = var38.e(-31302) + (var19 - -1);
                                                                                      var48.field_h[var29] = (byte)var19;
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
                                                                              if (var45.field_g == null) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var45.field_g.length <= var29) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_g[var29] = var38.d(true);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var45.field_h != null) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var29 < -2 + var45.field_h.length) {
                                                                                  var45.field_h[var29] = var38.d(true);
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
                                                                              if (var66.length <= var21) {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              } else {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (-1 <= (((td) this).field_p[var27] ^ -1)) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = var38.e(-31302) + 1;
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((td) this).field_q[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((td) this).field_p[var26] != 0) {
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
                                                                      ((td) this).field_n[var26] = var25_ref;
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
                                                                if (((td) this).field_p[var25_int] != 0) {
                                                                  L62: {
                                                                    if (var20 != 0) {
                                                                      break L62;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = 16 + var38.field_n[var8] << -463370846;
                                                                      if (var68.length > var21) {
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
                                                                  ((td) this).field_t[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (0 != ((td) this).field_p[var24]) {
                                                              L63: {
                                                                if (-1 != var20) {
                                                                  break L63;
                                                                } else {
                                                                  L64: {
                                                                    if (var67.length <= var21) {
                                                                      var20 = -1;
                                                                      break L64;
                                                                    } else {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L64;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = -1 + var38.field_n[var5];
                                                                  break L63;
                                                                }
                                                              }
                                                              ((td) this).field_r[var24] = (byte)var23;
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
                                                              if (var21 >= var66.length) {
                                                                var20 = -1;
                                                                break L66;
                                                              } else {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L66;
                                                              }
                                                            }
                                                            var22 = var38.f((byte) 93);
                                                            break L65;
                                                          }
                                                        }
                                                        ((td) this).field_k[var23] = (short)(((td) this).field_k[var23] + (eb.a(-1 + var22, 2) << -1005802546));
                                                        ((td) this).field_p[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.e(-31302);
                                                    ((td) this).field_k[var20] = (short)(((td) this).field_k[var20] + (var19 << 2092308360));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.e(-31302);
                                                ((td) this).field_k[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.d(true);
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
                                      var13[var14] = new mq();
                                      var40 = new mq();
                                      var15 = var40;
                                      var16_int = var38.e(-31302);
                                      if (-1 <= var16_int) {
                                        break L67;
                                      } else {
                                        var15.field_g = new byte[var16_int * 2];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.e(-31302);
                                    if (-1 < var16_int) {
                                      var15.field_h = new byte[2 + 2 * var16_int];
                                      var40.field_h[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.d(true);
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
                        var7[var8] = var38.d(true);
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
                var4[var5] = var38.d(true);
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
        field_l = "editor";
        field_m = true;
    }
}
