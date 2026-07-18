/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends da {
    byte[] field_n;
    static String field_i;
    fe[] field_k;
    ab[] field_o;
    int field_p;
    private int[] field_m;
    byte[] field_l;
    byte[] field_q;
    short[] field_j;

    public static void a(int param0) {
        if (param0 != 1012) {
            field_i = null;
        }
        field_i = null;
    }

    final boolean a(u param0, int[] param1, byte param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 1;
              if (param2 >= 8) {
                break L1;
              } else {
                fb.a(-110);
                break L1;
              }
            }
            var6 = 0;
            var7 = null;
            var8 = 0;
            L2: while (true) {
              if (128 <= var8) {
                stackOut_19_0 = var5_int;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    if (param3 == null) {
                      break L4;
                    } else {
                      if (param3[var8] == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var9 = ((fb) this).field_m[var8];
                  if (var9 == 0) {
                    break L3;
                  } else {
                    L5: {
                      if (var6 != var9) {
                        L6: {
                          var6 = var9;
                          var9--;
                          if ((1 & var9) != 0) {
                            var7 = (Object) (Object) param0.a(107, var9 >> 2, param1);
                            break L6;
                          } else {
                            var7 = (Object) (Object) param0.a(-1, param1, var9 >> 2);
                            break L6;
                          }
                        }
                        if (var7 != null) {
                          break L5;
                        } else {
                          var5_int = 0;
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    if (var7 == null) {
                      break L3;
                    } else {
                      ((fb) this).field_k[var8] = (fe) var7;
                      ((fb) this).field_m[var8] = 0;
                      break L3;
                    }
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("fb.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final void b(byte param0) {
        ((fb) this).field_m = null;
        if (param0 > -125) {
            ((fb) this).field_n = null;
        }
    }

    fb(byte[] param0) {
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
        ab[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        ab var15 = null;
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
        uf var38 = null;
        byte[] var39 = null;
        ab var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        ab var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        ab var48 = null;
        ab var49 = null;
        ab var50 = null;
        ab var51 = null;
        ab var52 = null;
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
        ((fb) this).field_l = new byte[128];
        ((fb) this).field_m = new int[128];
        ((fb) this).field_n = new byte[128];
        ((fb) this).field_o = new ab[128];
        ((fb) this).field_j = new short[128];
        ((fb) this).field_k = new fe[128];
        ((fb) this).field_q = new byte[128];
        var38 = new uf(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_m[var38.field_q - -var3] == 0) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var38.field_q = var38.field_q + 1;
                var3++;
                var5 = var38.field_q;
                var38.field_q = var38.field_q + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_m[var6 + var38.field_q] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var6++;
                        var38.field_q = var38.field_q + 1;
                        var8 = var38.field_q;
                        var38.field_q = var38.field_q + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_m[var38.field_q + var9] == 0) {
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
                                  var38.field_q = var38.field_q + 1;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (1 < var9) {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.j(-122);
                                          if (0 != var15_int) {
                                            L9: {
                                              if (~var13_int > ~var15_int) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          } else {
                                            int incrementValue$9 = var12;
                                            var12++;
                                            var13_int = incrementValue$9;
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
                                var13 = new ab[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.j(-112);
                                      if (var14 <= 0) {
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
                                      var14 = var38.j(-122);
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
                                    var70 = stackIn_41_0;
                                    var64 = var70;
                                    var58 = var64;
                                    var47 = var58;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_m[var38.field_q + var17] == 0) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_q = var38.field_q + 1;
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
                                                      if (var23 >= 128) {
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
                                                              if (128 <= var25_int) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (128 <= var26) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((fb) this).field_p = var38.j(-95) - -1;
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
                                                                                    var15_array[var27] = var38.d((byte) 91);
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
                                                                                  if (~var27 <= ~var70.length) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.d((byte) 115);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (~var12 >= ~var27) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (~var12 >= ~var27) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.j(-108);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (~var27 <= ~var46.length) {
                                                                                            var27 = var46[0];
                                                                                            var28 = var46[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (~var27 >= ~var29) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (~var46.length >= ~var29) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((fb) this).field_l[var30] = (byte)(var28 * ((fb) this).field_l[var30] + 32 >> 6);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[var29 + 1];
                                                                                                    var32 = (-var27 + var30) * var28 - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = c.a(var30 - var27, 1067751487, var32);
                                                                                                        ((fb) this).field_l[var33] = (byte)(((fb) this).field_l[var33] * var34 - -32 >> 6);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((fb) this).field_l[var29] = (byte)(((fb) this).field_l[var29] * var28 - -32 >> 6);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + var19 - -var38.j(-123);
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
                                                                                        var19 = var38.j(-95);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var70.length) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1] << 1;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (~var29 <= ~var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (~var29 <= ~var70.length) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (((fb) this).field_n[var30] & 255);
                                                                                                          if (var31 >= 0) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (var31 <= 128) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((fb) this).field_n[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var16[var29 - -1] << 1;
                                                                                                    var32 = (-var27 + var30) / 2 + (-var27 + var30) * var28;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (~var30 >= ~var37) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = c.a(-var27 + var30, 1067751487, var32);
                                                                                                          var35 = var34 + (255 & ((fb) this).field_n[var37]);
                                                                                                          if (var35 >= 0) {
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
                                                                                                        ((fb) this).field_n[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (((fb) this).field_n[var29] & 255) + var28;
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
                                                                                                ((fb) this).field_n[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + var19 + var38.j(-123);
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
                                                                                              if (~var27 <= ~var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (~var12 >= ~var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                        return;
                                                                                                      } else {
                                                                                                        L52: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (var52.field_a <= 0) {
                                                                                                            break L52;
                                                                                                          } else {
                                                                                                            var52.field_l = var38.j(-86);
                                                                                                            break L52;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L53: {
                                                                                                      var51 = var13[var27];
                                                                                                      if (0 >= var51.field_j) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var51.field_a = var38.j(-128);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_j = var38.j(-107);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L54: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_k) {
                                                                                                break L54;
                                                                                              } else {
                                                                                                var50.field_c = var38.j(-122);
                                                                                                break L54;
                                                                                              }
                                                                                            }
                                                                                            L55: {
                                                                                              if (var50.field_b == null) {
                                                                                                break L55;
                                                                                              } else {
                                                                                                var50.field_f = var38.j(-113);
                                                                                                break L55;
                                                                                              }
                                                                                            }
                                                                                            L56: {
                                                                                              if (var50.field_i <= 0) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_h = var38.j(-110);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_i = var38.j(-98);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L57: {
                                                                                      var49 = var13[var27];
                                                                                      if (var49.field_k == null) {
                                                                                        break L57;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L58: while (true) {
                                                                                          if (~var29 <= ~var49.field_k.length) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var19 = 1 + var19 - -var38.j(-106);
                                                                                            var49.field_k[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L58;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L59: {
                                                                                  var48 = var13[var27];
                                                                                  if (var48.field_b == null) {
                                                                                    break L59;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L60: while (true) {
                                                                                      if (~var29 <= ~var48.field_b.length) {
                                                                                        break L59;
                                                                                      } else {
                                                                                        var19 = var38.j(-118) + var19 - -1;
                                                                                        var48.field_b[var29] = (byte)var19;
                                                                                        var29 += 2;
                                                                                        continue L60;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L27;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L61: {
                                                                              var45 = var13[var27];
                                                                              if (var45.field_k == null) {
                                                                                break L61;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L62: while (true) {
                                                                                  if (var29 >= var45.field_k.length) {
                                                                                    break L61;
                                                                                  } else {
                                                                                    var45.field_k[var29] = var38.d((byte) 89);
                                                                                    var29 += 2;
                                                                                    continue L62;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L63: {
                                                                              if (null == var45.field_b) {
                                                                                break L63;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L64: while (true) {
                                                                                  if (var45.field_b.length - 2 <= var29) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var45.field_b[var29] = var38.d((byte) 117);
                                                                                    var29 += 2;
                                                                                    continue L64;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L65: {
                                                                          if (var20 != 0) {
                                                                            break L65;
                                                                          } else {
                                                                            L66: {
                                                                              if (~var66.length >= ~var21) {
                                                                                var20 = -1;
                                                                                break L66;
                                                                              } else {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L66;
                                                                              }
                                                                            }
                                                                            if (((fb) this).field_m[var27] <= 0) {
                                                                              break L65;
                                                                            } else {
                                                                              var26 = var38.j(-102) - -1;
                                                                              break L65;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((fb) this).field_l[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L67: {
                                                                      if (((fb) this).field_m[var26] == 0) {
                                                                        break L67;
                                                                      } else {
                                                                        L68: {
                                                                          if (var20 != 0) {
                                                                            break L68;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var65[var21]];
                                                                            if (var69.length <= var21) {
                                                                              var20 = -1;
                                                                              break L68;
                                                                            } else {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L68;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((fb) this).field_o[var26] = (ab) var25;
                                                                        var20--;
                                                                        break L67;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L69: {
                                                                  if (0 == ((fb) this).field_m[var25_int]) {
                                                                    break L69;
                                                                  } else {
                                                                    L70: {
                                                                      if (0 != var20) {
                                                                        break L70;
                                                                      } else {
                                                                        int incrementValue$12 = var8;
                                                                        var8++;
                                                                        var24 = var38.field_m[incrementValue$12] + 16 << 2;
                                                                        if (var21 < var68.length) {
                                                                          int incrementValue$13 = var21;
                                                                          var21++;
                                                                          var20 = var7[incrementValue$13];
                                                                          break L70;
                                                                        } else {
                                                                          var20 = -1;
                                                                          break L70;
                                                                        }
                                                                      }
                                                                    }
                                                                    ((fb) this).field_n[var25_int] = (byte)var24;
                                                                    var20--;
                                                                    break L69;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L71: {
                                                              if (0 == ((fb) this).field_m[var24]) {
                                                                break L71;
                                                              } else {
                                                                L72: {
                                                                  if (0 != var20) {
                                                                    break L72;
                                                                  } else {
                                                                    int incrementValue$14 = var5;
                                                                    var5++;
                                                                    var23 = var38.field_m[incrementValue$14] + -1;
                                                                    if (var21 >= var67.length) {
                                                                      var20 = -1;
                                                                      break L72;
                                                                    } else {
                                                                      int incrementValue$15 = var21;
                                                                      var21++;
                                                                      var20 = var4[incrementValue$15];
                                                                      break L72;
                                                                    }
                                                                  }
                                                                }
                                                                var20--;
                                                                ((fb) this).field_q[var24] = (byte)var23;
                                                                break L71;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L73: {
                                                          if (var20 != 0) {
                                                            break L73;
                                                          } else {
                                                            L74: {
                                                              if (var66.length > var21) {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L74;
                                                              } else {
                                                                var20 = -1;
                                                                break L74;
                                                              }
                                                            }
                                                            var22 = var38.f(-98);
                                                            break L73;
                                                          }
                                                        }
                                                        ((fb) this).field_j[var23] = (short)(((fb) this).field_j[var23] + jh.a(32768, var22 - 1 << 14));
                                                        ((fb) this).field_m[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.j(-111);
                                                    ((fb) this).field_j[var20] = (short)(((fb) this).field_j[var20] + (var19 << 8));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.j(-125);
                                                ((fb) this).field_j[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.d((byte) 86);
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
                                    L75: {
                                      ab dupTemp$17 = new ab();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.j(-107);
                                      if (0 >= var16_int) {
                                        break L75;
                                      } else {
                                        var15.field_k = new byte[var16_int * 2];
                                        break L75;
                                      }
                                    }
                                    L76: {
                                      var16_int = var38.j(-109);
                                      if (0 >= var16_int) {
                                        break L76;
                                      } else {
                                        var15.field_b = new byte[var16_int * 2 + 2];
                                        var40.field_b[1] = (byte) 64;
                                        break L76;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.d((byte) 120);
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
                        var7[var8] = var38.d((byte) 111);
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
                var4[var5] = var38.d((byte) 123);
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
        field_i = "to keep fullscreen or";
    }
}
