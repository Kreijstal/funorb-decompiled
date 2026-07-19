/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static String field_b;
    static int field_d;
    static qm field_e;
    static long field_g;
    static ud field_i;
    static String field_a;
    static String field_h;
    static int field_f;
    static int[] field_c;

    final static void a(byte param0) {
        String[][] dupTemp$3 = null;
        int[][] dupTemp$4 = null;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        cl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        uf var13 = null;
        uf var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        boolean stackIn_32_0 = false;
        int stackIn_37_0 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_46_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_36_0 = 0;
        boolean stackOut_31_0 = false;
        boolean stackOut_39_0 = false;
        byte stackOut_45_0 = 0;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            var13 = de.field_V;
            var14 = var13;
            var2 = var14.d((byte) -110);
            var3 = (cl) ((Object) oe.field_I.c((byte) -54));
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != var3.field_q) {
                          break L4;
                        } else {
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3 = (cl) ((Object) oe.field_I.d(true));
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var3 == null) {
                  stackOut_10_0 = 122;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  L5: {
                    L6: {
                      var4 = var14.d((byte) -125);
                      if (-1 == (var4 ^ -1)) {
                        break L6;
                      } else {
                        var5 = var3.field_z;
                        t.field_cb[0] = oa.field_f;
                        var6_int = 1;
                        L7: while (true) {
                          L8: {
                            if (var4 <= var6_int) {
                              ba.a(2147483647, var4, var5);
                              break L8;
                            } else {
                              t.field_cb[var6_int] = var13.c((byte) -38);
                              var6_int++;
                              if (var12 != 0) {
                                break L8;
                              } else {
                                continue L7;
                              }
                            }
                          }
                          var6_int = 0;
                          L9: while (true) {
                            L10: {
                              if (var6_int >= var4) {
                                stackOut_28_0 = var5;
                                stackOut_28_1 = 6;
                                stackIn_29_0 = stackOut_28_0;
                                stackIn_29_1 = stackOut_28_1;
                                break L10;
                              } else {
                                pn.a(63, var14);
                                stackOut_22_0 = -1;
                                stackOut_22_1 = var6_int ^ -1;
                                stackIn_29_0 = stackOut_22_0;
                                stackIn_29_1 = stackOut_22_1;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                if (var12 != 0) {
                                  break L10;
                                } else {
                                  L11: {
                                    L12: {
                                      if (stackIn_23_0 == stackIn_23_1) {
                                        break L12;
                                      } else {
                                        ri.a(var6_int, dj.field_Y, -1, vm.field_s, tj.field_Pb, oc.field_c);
                                        if (var12 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    var3.field_p = oc.field_c;
                                    var3.field_o = dj.field_Y;
                                    var3.field_w = tj.field_Pb;
                                    var3.field_t = vm.field_s;
                                    ri.a(var6_int, dj.field_Y, -1, vm.field_s, tj.field_Pb, oc.field_c);
                                    break L11;
                                  }
                                  var6_int++;
                                  continue L9;
                                }
                              }
                            }
                            pd.a(stackIn_29_0, (byte) stackIn_29_1);
                            dupTemp$3 = new String[2][var5];
                            var3.field_x = dupTemp$3;
                            var6 = dupTemp$3;
                            dupTemp$4 = new int[2][var5 * 4];
                            var3.field_u = dupTemp$4;
                            var7 = dupTemp$4;
                            var8 = og.field_eb;
                            var9 = 0;
                            var10 = 0;
                            L13: while (true) {
                              L14: {
                                if (var8 <= var9) {
                                  var9 = 0;
                                  stackOut_36_0 = 0;
                                  stackIn_37_0 = stackOut_36_0;
                                  break L14;
                                } else {
                                  var11 = ch.field_a[var9];
                                  var6[0][var10] = t.field_cb[var11];
                                  var7[0][var10 * 4] = ad.field_i[var11];
                                  var7[0][1 + var10 * 4] = oa.field_e[var11];
                                  var7[0][2 + 4 * var10] = ln.field_a[var11];
                                  var7[0][3 + var10 * 4] = mk.field_b[var11];
                                  stackOut_31_0 = k.a(t.field_cb[var11], true);
                                  stackIn_37_0 = stackOut_31_0 ? 1 : 0;
                                  stackIn_32_0 = stackOut_31_0;
                                  if (var12 != 0) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (!stackIn_32_0) {
                                        break L15;
                                      } else {
                                        if (-1 != (oa.field_e[var11] + (ln.field_a[var11] - -mk.field_b[var11]) ^ -1)) {
                                          break L15;
                                        } else {
                                          var6[0][var10] = null;
                                          var10--;
                                          break L15;
                                        }
                                      }
                                    }
                                    var9++;
                                    var10++;
                                    continue L13;
                                  }
                                }
                              }
                              var10 = stackIn_37_0;
                              L16: while (true) {
                                if (var8 <= var9) {
                                  break L6;
                                } else {
                                  var11 = ch.field_a[var9 + var5];
                                  var6[1][var10] = t.field_cb[var11];
                                  var7[1][var10 * 4] = ad.field_i[var11];
                                  var7[1][1 + 4 * var10] = oa.field_e[var11];
                                  var7[1][4 * var10 + 2] = ln.field_a[var11];
                                  var7[1][4 * var10 + 3] = mk.field_b[var11];
                                  stackOut_39_0 = k.a(t.field_cb[var11], true);
                                  stackIn_46_0 = stackOut_39_0 ? 1 : 0;
                                  stackIn_40_0 = stackOut_39_0;
                                  if (var12 != 0) {
                                    break L5;
                                  } else {
                                    L17: {
                                      if (stackIn_40_0) {
                                        if (-1 != (ln.field_a[var11] + oa.field_e[var11] + mk.field_b[var11] ^ -1)) {
                                          break L17;
                                        } else {
                                          var6[1][var10] = null;
                                          var10--;
                                          break L17;
                                        }
                                      } else {
                                        break L17;
                                      }
                                    }
                                    var10++;
                                    var9++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_45_0 = param0;
                    stackIn_46_0 = stackOut_45_0;
                    break L5;
                  }
                  L18: {
                    if (stackIn_46_0 > 107) {
                      break L18;
                    } else {
                      discarded$5 = ul.a(-19, 9, -103);
                      break L18;
                    }
                  }
                  var3.field_A = true;
                  var3.b((byte) 104);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              si.a(stackIn_11_0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "ul.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_b = null;
        field_a = null;
        if (param0 != -75) {
          field_d = -77;
          field_e = null;
          field_c = null;
          field_i = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_i = null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == -28705) {
          if (-3 < (param1 ^ -1)) {
            if (5 > param0) {
              return 0;
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        } else {
          ul.a(55, 34);
          if (-3 < (param1 ^ -1)) {
            if (5 > param0) {
              return 0;
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        }
    }

    final static void a(int param0, int param1) {
        uf var2 = null;
        if (param1 != 4) {
          field_e = (qm) null;
          var2 = we.field_b;
          var2.f(param0, -4);
          var2.a(true, 1);
          var2.a(true, 1);
          return;
        } else {
          var2 = we.field_b;
          var2.f(param0, -4);
          var2.a(true, 1);
          var2.a(true, 1);
          return;
        }
    }

    static {
        field_b = "Challenge Highscores";
        field_e = new qm(6, 0, 4, 2);
        field_g = 20000000L;
        field_a = "Respect";
        field_h = "Clan";
        field_c = new int[5];
        field_f = 3;
    }
}
