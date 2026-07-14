/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    private qp[] field_c;
    static ho[] field_e;
    private int field_b;
    static il field_g;
    private int field_i;
    static lg[] field_a;
    float field_j;
    String field_h;
    static String field_k;
    static er[] field_f;
    private int field_d;

    final static cr a(boolean param0) {
        if (!param0) {
            th.a((byte) -18);
        }
        return pp.a((byte) 116);
    }

    private final void a(qp param0, int param1, int param2) {
        float var4 = (float)(1 + ((th) this).field_d) + (float)param2 / 100.0f;
        if (param2 == 0) {
            ((th) this).field_h = param0.field_f;
        } else {
            ((th) this).field_h = param0.field_a + " - " + param2 + "%";
        }
        ((th) this).field_j = (float)((th) this).field_i * var4 / (float)(param1 + ((th) this).field_b);
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = -62 / ((-76 - param0) / 32);
        field_f = null;
        field_e = null;
        field_k = null;
        field_a = null;
    }

    final static bn a(boolean param0, int[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
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
        lg var22 = null;
        L0: {
          var21 = Vertigo2.field_L ? 1 : 0;
          if (param2 == -27911) {
            break L0;
          } else {
            cr discarded$3 = th.a(false);
            break L0;
          }
        }
        var22 = new lg(672, 192, 96);
        var4 = 0;
        L1: while (true) {
          L2: {
            if (6 <= var4) {
              break L2;
            } else {
              var5 = 0;
              L3: while (true) {
                L4: {
                  if (var5 >= 4) {
                    break L4;
                  } else {
                    var6 = 0;
                    L5: while (true) {
                      L6: {
                        if (var6 >= 4) {
                          break L6;
                        } else {
                          L7: {
                            L8: {
                              var7 = var5 + 1;
                              var8 = var6 + 1;
                              if (!param0) {
                                break L8;
                              } else {
                                var9 = (int)Math.round(384.0 * Math.tan(-0.7853981633974483 + (double)var6 * 3.141592653589793 / 2.0 / 4.0));
                                var10 = (int)Math.round(Math.tan(-0.7853981633974483 + (double)var8 * 3.141592653589793 / 2.0 / 4.0) * 384.0);
                                var11 = (int)Math.round(384.0 * Math.tan(3.141592653589793 * (double)var5 / 2.0 / 4.0 - 0.7853981633974483));
                                var12 = (int)Math.round(Math.tan(3.141592653589793 * (double)var7 / 2.0 / 4.0 - 0.7853981633974483) * 384.0);
                                if (0 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var9 = var6 * 192 + -384;
                            var11 = var5 * 192 + -384;
                            var10 = -384 + var8 * 192;
                            var12 = var7 * 192 - 384;
                            break L7;
                          }
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        var13 = -384;
                                        var14 = 384;
                                        var15 = -1;
                                        var16 = -1;
                                        var17 = -1;
                                        var18 = -1;
                                        var19 = -1;
                                        var20 = var4;
                                        if (var20 != 0) {
                                          break L15;
                                        } else {
                                          if (0 == 0) {
                                            var15 = var22.a(var9, var12, var13);
                                            var16 = var22.a(var10, var12, var13);
                                            var17 = var22.a(var9, var11, var13);
                                            var18 = var22.a(var10, var11, var13);
                                            var19 = id.a(param1[var4], (short)var18, (short)var17, var22, false, (short)var15);
                                            if (0 == 0) {
                                              break L9;
                                            } else {
                                              break L14;
                                            }
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (var20 != 1) {
                                          break L16;
                                        } else {
                                          if (0 == 0) {
                                            break L14;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      if (var20 == 2) {
                                        break L13;
                                      } else {
                                        L17: {
                                          if (var20 != 3) {
                                            break L17;
                                          } else {
                                            if (0 == 0) {
                                              break L12;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        L18: {
                                          if (4 != var20) {
                                            break L18;
                                          } else {
                                            if (0 == 0) {
                                              break L11;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        if (var20 == 5) {
                                          break L10;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var15 = var22.a(var10, var12, var14);
                                    var16 = var22.a(var9, var12, var14);
                                    var17 = var22.a(var10, var11, var14);
                                    var18 = var22.a(var9, var11, var14);
                                    var19 = id.a(param1[var4], (short)var17, (short)var18, var22, false, (short)var16);
                                    if (0 == 0) {
                                      break L9;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  var15 = var22.a(var9, var14, var12);
                                  var16 = var22.a(var10, var14, var12);
                                  var17 = var22.a(var9, var14, var11);
                                  var18 = var22.a(var10, var14, var11);
                                  var19 = id.a(param1[var4], (short)var18, (short)var17, var22, false, (short)var15);
                                  if (0 == 0) {
                                    break L9;
                                  } else {
                                    break L12;
                                  }
                                }
                                var15 = var22.a(var10, var13, var12);
                                var16 = var22.a(var9, var13, var12);
                                var17 = var22.a(var10, var13, var11);
                                var18 = var22.a(var9, var13, var11);
                                var19 = id.a(param1[var4], (short)var17, (short)var18, var22, false, (short)var16);
                                if (0 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                              var15 = var22.a(var13, var9, var12);
                              var16 = var22.a(var13, var10, var12);
                              var17 = var22.a(var13, var9, var11);
                              var18 = var22.a(var13, var10, var11);
                              var19 = id.a(param1[var4], (short)var18, (short)var17, var22, false, (short)var15);
                              if (0 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                            var15 = var22.a(var14, var10, var12);
                            var16 = var22.a(var14, var9, var12);
                            var17 = var22.a(var14, var10, var11);
                            var18 = var22.a(var14, var9, var11);
                            var19 = id.a(param1[var4], (short)var17, (short)var18, var22, false, (short)var16);
                            break L9;
                          }
                          int discarded$4 = var22.a(var15, var17, var16, (byte) 1, (byte)var19, (short) 128, (short)(4 * (var4 * 4 + var5) - -var6));
                          int discarded$5 = var22.a(var18, var16, var17, (byte) 1, (byte)var19, (short) 128, (short)((var5 + var4 * 4) * 4 + var6));
                          var6++;
                          if (0 == 0) {
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5++;
                      if (0 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var4++;
                if (0 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return var22.a(126, 43690, 1, 0, 0);
        }
    }

    final boolean a(int param0) {
        qp var2 = null;
        int var3 = 0;
        qp var4 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        L0: while (true) {
          if (((th) this).field_d >= ((th) this).field_b) {
            if (param0 != -21493) {
              return false;
            } else {
              return true;
            }
          } else {
            var4 = ((th) this).field_c[((th) this).field_d];
            var2 = var4;
            if (var4.field_i.b(0)) {
              L1: {
                if ((var4.field_b ^ -1) > -1) {
                  break L1;
                } else {
                  if (!var4.field_i.c(11321, var4.field_b)) {
                    this.a(var2, 1, var4.field_i.b(var4.field_b, 100));
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (null == var4.field_e) {
                  break L2;
                } else {
                  if (var4.field_i.c(var4.field_e, param0 ^ -21493)) {
                    break L2;
                  } else {
                    this.a(var2, 1, var4.field_i.a(var4.field_e, param0 + 21493));
                    return false;
                  }
                }
              }
              L3: {
                if ((var4.field_b ^ -1) <= -1) {
                  break L3;
                } else {
                  if (null != var4.field_e) {
                    break L3;
                  } else {
                    if (var4.field_a == null) {
                      break L3;
                    } else {
                      if (!var4.field_i.a((byte) -112)) {
                        this.a(var2, 1, var4.field_i.d(-1));
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((th) this).field_d = ((th) this).field_d + 1;
              continue L0;
            } else {
              this.a(var4, 1, 0);
              return false;
            }
          }
        }
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "2 players can work together to paint all the blocks on the map purple. If either player is killed, both players have to start again. This mode is only available in unrated games.";
        field_f = new er[23];
        field_a = new lg[2];
    }
}
