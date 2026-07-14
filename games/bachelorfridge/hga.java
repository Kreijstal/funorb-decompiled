/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hga extends am {
    private boolean field_X;
    private de field_T;
    private String field_V;
    static qm field_U;
    private boolean field_W;
    private String field_S;

    hga(rp param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((hga) this).field_V = param1;
        if (null != ((hga) this).field_V) {
            var3 = qia.field_a.a(((hga) this).field_V, 260, qia.field_a.field_u);
            ((hga) this).b(-93, var3 + 150, 300);
        }
        ((hga) this).field_T = new de(13, 50, 274, 30, 15, 2113632, 4210752);
        ((hga) this).field_X = false;
        ((hga) this).field_T.field_P = true;
        ((hga) this).field_W = false;
        ((hga) this).c((wj) (Object) ((hga) this).field_T, 25);
    }

    public static void o(int param0) {
        if (param0 != 8405024) {
            field_U = null;
            field_U = null;
            return;
        }
        field_U = null;
    }

    final void d(byte param0) {
        ((hga) this).field_T.field_P = false;
        if (param0 != 47) {
            ola discarded$0 = hga.n(-84);
            ((hga) this).field_W = true;
            return;
        }
        ((hga) this).field_W = true;
    }

    final void a(int param0, boolean param1, float param2, String param3) {
        Object var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          if (((hga) this).field_X) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = stackIn_3_0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (param1) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          if (stackIn_6_0 == stackIn_6_1) {
            break L2;
          } else {
            L3: {
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param1) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            ((hga) this).field_X = stackIn_10_1 != 0;
            if (!((hga) this).field_X) {
              ((hga) this).field_T.c(1705304705, 2113632, 4210752);
              if (((hga) this).field_W) {
                ((hga) this).field_T.field_P = false;
                break L2;
              } else {
                ((hga) this).field_T.field_M = (int)(65536.0f * (param2 / 100.0f));
                ((hga) this).field_S = param3;
                if (param0 > 18) {
                  return;
                } else {
                  var6 = null;
                  ((hga) this).a(-90, false, -1.9980103969573975f, (String) null);
                  return;
                }
              }
            } else {
              ((hga) this).field_T.c(1705304705, 8405024, 4210752);
              ((hga) this).field_T.field_P = true;
              ((hga) this).field_T.field_M = (int)(65536.0f * (param2 / 100.0f));
              ((hga) this).field_S = param3;
              if (param0 > 18) {
                return;
              } else {
                var6 = null;
                ((hga) this).a(-90, false, -1.9980103969573975f, (String) null);
                return;
              }
            }
          }
        }
        ((hga) this).field_T.field_M = (int)(65536.0f * (param2 / 100.0f));
        ((hga) this).field_S = param3;
        if (param0 > 18) {
          return;
        } else {
          var6 = null;
          ((hga) this).a(-90, false, -1.9980103969573975f, (String) null);
          return;
        }
    }

    final static void a(boolean param0, byte[] param1) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var22 = BachelorFridge.field_y;
        lka.field_E = qs.a(false, new lu(param1));
        ur.field_e = new oha[lka.field_E.length + -1];
        pe.field_m = 0;
        var2 = 1;
        if (!param0) {
          field_U = null;
          if (lka.field_E.length > var2) {
            L0: {
              L1: {
                L2: {
                  L3: {
                    var3 = -1 + var2;
                    var25 = lka.field_E[var2][1];
                    var4 = var25;
                    var26 = lka.field_E[var2][2];
                    var5 = var26;
                    var6 = bm.a(80, var2);
                    var7 = vc.a(var2, 3, -16306);
                    var8 = dha.a((byte) -38, var2);
                    var9 = jfa.a(false, var2);
                    var10 = vc.a(var2, 15, -16306);
                    if (1 != var6) {
                      if (2 != var6) {
                        if (-5 == var6) {
                          var11 = dna.b(var2, false);
                          var12 = te.a(var2, (byte) 65);
                          var13 = vc.a(var2, 8, -16306);
                          var14 = vc.a(var2, 9, -16306);
                          var15 = vc.a(var2, 10, -16306);
                          var16 = mq.a(13, 207, var2);
                          var8 = dha.a((byte) -113, var2);
                          bea.a(var15, var10, var12, var16, var11, var3, -52, var14, var13, var8, var9, var25, var26);
                          break L0;
                        } else {
                          if (-4 != var6) {
                            break L2;
                          } else {
                            var11 = vc.a(var2, 10, -16306);
                            var12 = te.a(var2, (byte) -53);
                            pm.a(var9, var3, 12635, var7, var8, var11, var25, var26, var12);
                            break L1;
                          }
                        }
                      } else {
                        mw.a((byte) -120, var9, var10, var8, var25, var26, var7, var3);
                        break L3;
                      }
                    } else {
                      L4: {
                        var11 = eka.a((byte) 125, var2);
                        stackOut_22_0 = var2;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_23_0 = stackOut_22_0;
                        if (param0) {
                          stackOut_24_0 = stackIn_24_0;
                          stackOut_24_1 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          break L4;
                        } else {
                          stackOut_23_0 = stackIn_23_0;
                          stackOut_23_1 = 1;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_25_1 = stackOut_23_1;
                          break L4;
                        }
                      }
                      var12 = dna.b(stackIn_25_0, stackIn_25_1 != 0);
                      var13 = te.a(var2, (byte) 64);
                      var14 = vc.a(var2, 8, -16306);
                      var15 = vc.a(var2, 9, -16306);
                      var16 = vc.a(var2, 10, -16306);
                      var17 = vc.a(var2, 11, -16306);
                      var18 = vc.a(var2, 12, -16306);
                      var19 = mq.a(13, 207, var2);
                      var20 = oaa.a(-74, var2);
                      var21 = wg.a(var2, (byte) 83);
                      ag.a(var7, var25, var16, var15, var26, var19, var10, var13, var20, var21, var14, var12, var6, var8, var11, var9, var17, var3, var18, -4313);
                      var2++;
                      break L3;
                    }
                  }
                  var2++;
                  break L2;
                }
                var2++;
                break L1;
              }
              var2++;
              break L0;
            }
            var2++;
            var2++;
            if (lka.field_E.length > var2) {
              L5: {
                L6: {
                  L7: {
                    L8: {
                      var3 = -1 + var2;
                      var27 = lka.field_E[var2][1];
                      var28 = lka.field_E[var2][2];
                      var6 = bm.a(80, var2);
                      var7 = vc.a(var2, 3, -16306);
                      var8 = dha.a((byte) -38, var2);
                      var9 = jfa.a(false, var2);
                      var10 = vc.a(var2, 15, -16306);
                      if (1 != var6) {
                        if (2 != var6) {
                          if (-5 == var6) {
                            var11 = dna.b(var2, false);
                            var12 = te.a(var2, (byte) 65);
                            var13 = vc.a(var2, 8, -16306);
                            var14 = vc.a(var2, 9, -16306);
                            var15 = vc.a(var2, 10, -16306);
                            var16 = mq.a(13, 207, var2);
                            var8 = dha.a((byte) -113, var2);
                            bea.a(var15, var10, var12, var16, var11, var3, -52, var14, var13, var8, var9, var27, var28);
                            break L5;
                          } else {
                            if (-4 != var6) {
                              break L7;
                            } else {
                              var11 = vc.a(var2, 10, -16306);
                              var12 = te.a(var2, (byte) -53);
                              pm.a(var9, var3, 12635, var7, var8, var11, var27, var28, var12);
                              break L6;
                            }
                          }
                        } else {
                          mw.a((byte) -120, var9, var10, var8, var27, var28, var7, var3);
                          break L8;
                        }
                      } else {
                        L9: {
                          var11 = eka.a((byte) 125, var2);
                          stackOut_39_0 = var2;
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_40_0 = stackOut_39_0;
                          if (param0) {
                            stackOut_41_0 = stackIn_41_0;
                            stackOut_41_1 = 0;
                            stackIn_42_0 = stackOut_41_0;
                            stackIn_42_1 = stackOut_41_1;
                            break L9;
                          } else {
                            stackOut_40_0 = stackIn_40_0;
                            stackOut_40_1 = 1;
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_42_1 = stackOut_40_1;
                            break L9;
                          }
                        }
                        var12 = dna.b(stackIn_42_0, stackIn_42_1 != 0);
                        var13 = te.a(var2, (byte) 64);
                        var14 = vc.a(var2, 8, -16306);
                        var15 = vc.a(var2, 9, -16306);
                        var16 = vc.a(var2, 10, -16306);
                        var17 = vc.a(var2, 11, -16306);
                        var18 = vc.a(var2, 12, -16306);
                        var19 = mq.a(13, 207, var2);
                        var20 = oaa.a(-74, var2);
                        var21 = wg.a(var2, (byte) 83);
                        ag.a(var7, var27, var16, var15, var28, var19, var10, var13, var20, var21, var14, var12, var6, var8, var11, var9, var17, var3, var18, -4313);
                        var2++;
                        break L8;
                      }
                    }
                    var2++;
                    break L7;
                  }
                  var2++;
                  break L6;
                }
                var2++;
                break L5;
              }
              var2++;
              var2++;
              L10: while (true) {
                if (lka.field_E.length <= var2) {
                  return;
                } else {
                  var3 = -1 + var2;
                  var29 = lka.field_E[var2][1];
                  var30 = lka.field_E[var2][2];
                  var6 = bm.a(80, var2);
                  var7 = vc.a(var2, 3, -16306);
                  var8 = dha.a((byte) -38, var2);
                  var9 = jfa.a(false, var2);
                  var10 = vc.a(var2, 15, -16306);
                  if (1 != var6) {
                    if (2 != var6) {
                      if (-5 == var6) {
                        var11 = dna.b(var2, false);
                        var12 = te.a(var2, (byte) 65);
                        var13 = vc.a(var2, 8, -16306);
                        var14 = vc.a(var2, 9, -16306);
                        var15 = vc.a(var2, 10, -16306);
                        var16 = mq.a(13, 207, var2);
                        var8 = dha.a((byte) -113, var2);
                        bea.a(var15, var10, var12, var16, var11, var3, -52, var14, var13, var8, var9, var29, var30);
                        var2++;
                        continue L10;
                      } else {
                        if (-4 == var6) {
                          var11 = vc.a(var2, 10, -16306);
                          var12 = te.a(var2, (byte) -53);
                          pm.a(var9, var3, 12635, var7, var8, var11, var29, var30, var12);
                          var2++;
                          continue L10;
                        } else {
                          var2++;
                          continue L10;
                        }
                      }
                    } else {
                      mw.a((byte) -120, var9, var10, var8, var29, var30, var7, var3);
                      var2++;
                      continue L10;
                    }
                  } else {
                    L11: {
                      var11 = eka.a((byte) 125, var2);
                      stackOut_56_0 = var2;
                      stackIn_58_0 = stackOut_56_0;
                      stackIn_57_0 = stackOut_56_0;
                      if (param0) {
                        stackOut_58_0 = stackIn_58_0;
                        stackOut_58_1 = 0;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        break L11;
                      } else {
                        stackOut_57_0 = stackIn_57_0;
                        stackOut_57_1 = 1;
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_59_1 = stackOut_57_1;
                        break L11;
                      }
                    }
                    var12 = dna.b(stackIn_59_0, stackIn_59_1 != 0);
                    var13 = te.a(var2, (byte) 64);
                    var14 = vc.a(var2, 8, -16306);
                    var15 = vc.a(var2, 9, -16306);
                    var16 = vc.a(var2, 10, -16306);
                    var17 = vc.a(var2, 11, -16306);
                    var18 = vc.a(var2, 12, -16306);
                    var19 = mq.a(13, 207, var2);
                    var20 = oaa.a(-74, var2);
                    var21 = wg.a(var2, (byte) 83);
                    ag.a(var7, var29, var16, var15, var30, var19, var10, var13, var20, var21, var14, var12, var6, var8, var11, var9, var17, var3, var18, -4313);
                    var2++;
                    continue L10;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          L12: {
            if (lka.field_E.length <= var2) {
              break L12;
            } else {
              L13: {
                L14: {
                  L15: {
                    L16: {
                      var3 = -1 + var2;
                      var23 = lka.field_E[var2][1];
                      var24 = lka.field_E[var2][2];
                      var6 = bm.a(80, var2);
                      var7 = vc.a(var2, 3, -16306);
                      var8 = dha.a((byte) -38, var2);
                      var9 = jfa.a(false, var2);
                      var10 = vc.a(var2, 15, -16306);
                      if (1 != var6) {
                        if (2 != var6) {
                          if (-5 == var6) {
                            var11 = dna.b(var2, false);
                            var12 = te.a(var2, (byte) 65);
                            var13 = vc.a(var2, 8, -16306);
                            var14 = vc.a(var2, 9, -16306);
                            var15 = vc.a(var2, 10, -16306);
                            var16 = mq.a(13, 207, var2);
                            var8 = dha.a((byte) -113, var2);
                            bea.a(var15, var10, var12, var16, var11, var3, -52, var14, var13, var8, var9, var23, var24);
                            break L13;
                          } else {
                            if (-4 != var6) {
                              break L15;
                            } else {
                              var11 = vc.a(var2, 10, -16306);
                              var12 = te.a(var2, (byte) -53);
                              pm.a(var9, var3, 12635, var7, var8, var11, var23, var24, var12);
                              break L14;
                            }
                          }
                        } else {
                          mw.a((byte) -120, var9, var10, var8, var23, var24, var7, var3);
                          break L16;
                        }
                      } else {
                        L17: {
                          var11 = eka.a((byte) 125, var2);
                          stackOut_3_0 = var2;
                          stackIn_5_0 = stackOut_3_0;
                          stackIn_4_0 = stackOut_3_0;
                          if (param0) {
                            stackOut_5_0 = stackIn_5_0;
                            stackOut_5_1 = 0;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            break L17;
                          } else {
                            stackOut_4_0 = stackIn_4_0;
                            stackOut_4_1 = 1;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            break L17;
                          }
                        }
                        var12 = dna.b(stackIn_6_0, stackIn_6_1 != 0);
                        var13 = te.a(var2, (byte) 64);
                        var14 = vc.a(var2, 8, -16306);
                        var15 = vc.a(var2, 9, -16306);
                        var16 = vc.a(var2, 10, -16306);
                        var17 = vc.a(var2, 11, -16306);
                        var18 = vc.a(var2, 12, -16306);
                        var19 = mq.a(13, 207, var2);
                        var20 = oaa.a(-74, var2);
                        var21 = wg.a(var2, (byte) 83);
                        ag.a(var7, var23, var16, var15, var24, var19, var10, var13, var20, var21, var14, var12, var6, var8, var11, var9, var17, var3, var18, -4313);
                        var2++;
                        break L16;
                      }
                    }
                    var2++;
                    break L15;
                  }
                  var2++;
                  break L14;
                }
                var2++;
                break L13;
              }
              var2++;
              var2++;
              var2++;
              var2++;
              var2++;
              var2++;
              break L12;
            }
          }
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        var4 = 26 % ((param1 - -16) / 56);
        this.a(param0, (byte) -79, param2);
        qia.field_a.a(((hga) this).field_S, param2 + (((hga) this).field_p >> 1588310145), param0 - -103, 16777215, -1);
        if (null == ((hga) this).field_V) {
          return;
        } else {
          dg.e(param2 + 20, param0 - -120 - 7, 260, 8421504);
          int discarded$1 = qia.field_a.a(((hga) this).field_V, param2 - -20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, qia.field_a.field_u);
          return;
        }
    }

    final static ola n(int param0) {
        int var1 = -44 % ((param0 - -54) / 61);
        return new ola();
    }

    static {
    }
}
