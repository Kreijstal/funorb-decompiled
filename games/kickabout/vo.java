/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends mu {
    static String field_db;
    static ut field_cb;
    static int field_bb;
    static int[][] field_eb;

    vo(se param0, fd param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void a(byte param0, fd param1) {
        if (param0 > -117) {
            field_cb = null;
        }
        super.a((byte) -127, param1);
    }

    final static String a(byte param0, String param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Kickabout.field_G;
        var3 = param1.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if (-1 >= (var6_int ^ -1)) {
            var5 = 2 + var6_int;
            L1: while (true) {
              L2: {
                if (var5 >= var3) {
                  break L2;
                } else {
                  if (!gn.a(12105, param1.charAt(var5))) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref_String = param1.substring(var6_int - -2, var5);
              if (gr.a((byte) 15, (CharSequence) (Object) var7_ref_String)) {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (62 == param1.charAt(var5)) {
                    var5++;
                    var8 = rr.a(10, (CharSequence) (Object) var7_ref_String);
                    var4 = var4 + (param2[var8].length() + (var6_int + -var5));
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          } else {
            L3: {
              if (param0 == -18) {
                break L3;
              } else {
                field_bb = 91;
                break L3;
              }
            }
            var6 = new StringBuilder(var4);
            var5 = 0;
            var7 = 0;
            L4: while (true) {
              var8 = param1.indexOf("<%", var5);
              if (0 <= var8) {
                var5 = 2 + var8;
                L5: while (true) {
                  L6: {
                    if (var5 >= var3) {
                      break L6;
                    } else {
                      if (!gn.a(12105, param1.charAt(var5))) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var9 = param1.substring(var8 - -2, var5);
                  if (!gr.a((byte) 15, (CharSequence) (Object) var9)) {
                    continue L4;
                  } else {
                    if (var3 <= var5) {
                      continue L4;
                    } else {
                      if (62 != param1.charAt(var5)) {
                        continue L4;
                      } else {
                        var5++;
                        var10 = rr.a(10, (CharSequence) (Object) var9);
                        StringBuilder discarded$3 = var6.append(param1.substring(var7, var8));
                        StringBuilder discarded$4 = var6.append(param2[var10]);
                        var7 = var5;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param1.substring(var7));
                return var6.toString();
              }
            }
          }
        }
    }

    public static void j(byte param0) {
        field_cb = null;
        field_db = null;
        field_eb = null;
        if (param0 <= 29) {
            vo.j((byte) -47);
        }
    }

    final static void a(byte param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        iw var16 = null;
        iw var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        var15 = Kickabout.field_G;
        var16 = new iw(param1);
        var17 = var16;
        var17.field_n = -2 + param1.length;
        io.field_l = var17.a((byte) 81);
        lo.field_j = new int[io.field_l];
        rm.field_B = new boolean[io.field_l];
        es.field_e = new byte[io.field_l][];
        ku.field_c = new int[io.field_l];
        aq.field_f = new int[io.field_l];
        fc.field_g = new int[io.field_l];
        pq.field_O = new byte[io.field_l][];
        var17.field_n = -(io.field_l * 8) + param1.length - 7;
        kw.field_i = var17.a((byte) 81);
        ai.field_J = var17.a((byte) 81);
        var3 = 1 + (var17.h((byte) -116) & 255);
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= io.field_l) {
              break L1;
            } else {
              aq.field_f[var4] = var16.a((byte) 81);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (io.field_l <= var4) {
                break L3;
              } else {
                fc.field_g[var4] = var16.a((byte) 81);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (var4 >= io.field_l) {
                  break L5;
                } else {
                  ku.field_c[var4] = var16.a((byte) 81);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = 0;
              L6: while (true) {
                L7: {
                  if (var4 >= io.field_l) {
                    break L7;
                  } else {
                    lo.field_j[var4] = var16.a((byte) 81);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_n = -7 + (param1.length + (-(io.field_l * 8) + -(3 * (-1 + var3))));
                lt.field_a = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var4 >= var3) {
                      break L9;
                    } else {
                      L10: {
                        lt.field_a[var4] = var16.i(-123);
                        if (-1 == (lt.field_a[var4] ^ -1)) {
                          lt.field_a[var4] = 1;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var17.field_n = 0;
                  var4 = 0;
                  L11: while (true) {
                    L12: {
                      if (var4 >= io.field_l) {
                        break L12;
                      } else {
                        L13: {
                          L14: {
                            var5 = ku.field_c[var4];
                            var6 = lo.field_j[var4];
                            var7 = var6 * var5;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            pq.field_O[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            es.field_e[var4] = var25;
                            var10 = 0;
                            var11 = var17.h((byte) -127);
                            if (-1 != (var11 & 1 ^ -1)) {
                              break L14;
                            } else {
                              var12 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var12 >= var7) {
                                    break L16;
                                  } else {
                                    var8[var12] = var16.j((byte) -86);
                                    var12++;
                                    if (0 == 0) {
                                      continue L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if ((2 & var11) != 0) {
                                  var12 = 0;
                                  L17: while (true) {
                                    L18: {
                                      if (var7 <= var12) {
                                        break L18;
                                      } else {
                                        L19: {
                                          byte dupTemp$2 = var16.j((byte) -49);
                                          var9[var12] = dupTemp$2;
                                          var13 = dupTemp$2;
                                          stackOut_33_0 = var10;
                                          stackIn_35_0 = stackOut_33_0;
                                          stackIn_34_0 = stackOut_33_0;
                                          if (0 == (var13 ^ -1)) {
                                            stackOut_35_0 = stackIn_35_0;
                                            stackOut_35_1 = 0;
                                            stackIn_36_0 = stackOut_35_0;
                                            stackIn_36_1 = stackOut_35_1;
                                            break L19;
                                          } else {
                                            stackOut_34_0 = stackIn_34_0;
                                            stackOut_34_1 = 1;
                                            stackIn_36_0 = stackOut_34_0;
                                            stackIn_36_1 = stackOut_34_1;
                                            break L19;
                                          }
                                        }
                                        var10 = stackIn_36_0 | stackIn_36_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L20: while (true) {
                            L21: {
                              if (var5 <= var12) {
                                break L21;
                              } else {
                                var13 = 0;
                                L22: while (true) {
                                  L23: {
                                    if (var6 <= var13) {
                                      break L23;
                                    } else {
                                      var8[var5 * var13 + var12] = var16.j((byte) -102);
                                      var13++;
                                      if (0 == 0) {
                                        continue L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (0 == 0) {
                                    continue L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            if ((2 & var11) != 0) {
                              var12 = 0;
                              L24: while (true) {
                                if (var12 >= var5) {
                                  break L13;
                                } else {
                                  var13 = 0;
                                  L25: while (true) {
                                    L26: {
                                      if (var6 <= var13) {
                                        break L26;
                                      } else {
                                        L27: {
                                          byte dupTemp$3 = var16.j((byte) -74);
                                          var9[var12 - -(var13 * var5)] = dupTemp$3;
                                          var14 = dupTemp$3;
                                          stackOut_51_0 = var10;
                                          stackIn_53_0 = stackOut_51_0;
                                          stackIn_52_0 = stackOut_51_0;
                                          if (var14 == -1) {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 0;
                                            stackIn_54_0 = stackOut_53_0;
                                            stackIn_54_1 = stackOut_53_1;
                                            break L27;
                                          } else {
                                            stackOut_52_0 = stackIn_52_0;
                                            stackOut_52_1 = 1;
                                            stackIn_54_0 = stackOut_52_0;
                                            stackIn_54_1 = stackOut_52_1;
                                            break L27;
                                          }
                                        }
                                        var10 = stackIn_54_0 | stackIn_54_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L24;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        rm.field_B[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var5 = 111 % ((param0 - 11) / 61);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = "Message game";
        field_bb = 0;
        field_eb = new int[7][4];
        field_eb[3][3] = 0;
        field_eb[3][1] = 40;
        field_eb[3][0] = 0;
        field_eb[3][2] = 60;
        field_eb[4][2] = 60;
        field_eb[4][0] = 0;
        field_eb[4][1] = 30;
        field_eb[4][3] = 10;
        field_eb[5][2] = 60;
        field_eb[5][1] = 20;
        field_eb[5][0] = 0;
        field_eb[5][3] = 20;
        field_eb[6][3] = 30;
        field_eb[6][1] = 0;
        field_eb[6][0] = 0;
        field_eb[6][2] = 70;
    }
}
