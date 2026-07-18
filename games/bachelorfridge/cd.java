/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends k {
    static String field_m;
    private int field_q;
    private int field_r;
    static String field_k;
    static sna field_n;
    static String field_p;
    static String field_l;
    static String[] field_o;

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var7 = BachelorFridge.field_y;
        if (param1 == 0) {
          var15 = ((cd) this).field_j.a(param0, -1);
          var11 = var15;
          var3 = var11;
          if (!((cd) this).field_j.field_m) {
            return var3;
          } else {
            var14 = ((cd) this).a(0, param0, (byte) 107);
            var5 = 0;
            L0: while (true) {
              if (hh.field_d <= var5) {
                return var3;
              } else {
                var6 = var14[var5];
                if (var6 >= ((cd) this).field_q) {
                  if (((cd) this).field_r < var6) {
                    var3[var5] = ((cd) this).field_r;
                    var5++;
                    continue L0;
                  } else {
                    var15[var5] = var6;
                    var5++;
                    continue L0;
                  }
                } else {
                  var3[var5] = ((cd) this).field_q;
                  var5++;
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          field_k = null;
          var13 = ((cd) this).field_j.a(param0, -1);
          var9 = var13;
          var3 = var9;
          if (((cd) this).field_j.field_m) {
            var12 = ((cd) this).a(0, param0, (byte) 107);
            var5 = 0;
            if (hh.field_d <= var5) {
              return var3;
            } else {
              L1: {
                var6 = var12[var5];
                if (var6 >= ((cd) this).field_q) {
                  L2: {
                    if (((cd) this).field_r < var6) {
                      var3[var5] = ((cd) this).field_r;
                      break L2;
                    } else {
                      var13[var5] = var6;
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  break L1;
                } else {
                  var3[var5] = ((cd) this).field_q;
                  var5++;
                  break L1;
                }
              }
              var5++;
              var5++;
              var5++;
              var5++;
              return var3;
            }
          } else {
            return var3;
          }
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_p = null;
        field_n = null;
        field_m = null;
        field_k = null;
        if (param0 != 0) {
          field_o = null;
          field_l = null;
          return;
        } else {
          field_l = null;
          return;
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[][] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[][] var42 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[][] var49 = null;
        int[][] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[][] var57 = null;
        int[][] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var15 = BachelorFridge.field_y;
        if (!param0) {
          var58 = ((cd) this).field_h.a(param1, -858);
          var42 = var58;
          var26 = var42;
          var18 = var26;
          var16 = var18;
          var3 = var16;
          if (!((cd) this).field_h.field_b) {
            return var3;
          } else {
            var57 = ((cd) this).a((byte) -104, 0, param1);
            var59 = var57[0];
            var60 = var57[1];
            var61 = var57[2];
            var62 = var58[0];
            var46 = var62;
            var30 = var46;
            var22 = var30;
            var8 = var22;
            var63 = var58[1];
            var47 = var63;
            var31 = var47;
            var23 = var31;
            var9 = var23;
            var64 = var58[2];
            var48 = var64;
            var32 = var48;
            var24 = var32;
            var10 = var24;
            var11 = 0;
            L0: while (true) {
              if (hh.field_d <= var11) {
                return var3;
              } else {
                L1: {
                  var12 = var59[var11];
                  var13 = var60[var11];
                  var14 = var61[var11];
                  if (var12 >= ((cd) this).field_q) {
                    if (var12 <= ((cd) this).field_r) {
                      var62[var11] = var12;
                      break L1;
                    } else {
                      var8[var11] = ((cd) this).field_r;
                      break L1;
                    }
                  } else {
                    var8[var11] = ((cd) this).field_q;
                    break L1;
                  }
                }
                L2: {
                  if (var13 < ((cd) this).field_q) {
                    var9[var11] = ((cd) this).field_q;
                    break L2;
                  } else {
                    if (((cd) this).field_r < var13) {
                      var9[var11] = ((cd) this).field_r;
                      break L2;
                    } else {
                      var63[var11] = var13;
                      break L2;
                    }
                  }
                }
                if (var14 < ((cd) this).field_q) {
                  var10[var11] = ((cd) this).field_q;
                  var11++;
                  continue L0;
                } else {
                  if (((cd) this).field_r >= var14) {
                    var64[var11] = var14;
                    var11++;
                    continue L0;
                  } else {
                    var10[var11] = ((cd) this).field_r;
                    var11++;
                    var11++;
                    continue L0;
                  }
                }
              }
            }
          }
        } else {
          cd.d(91);
          var50 = ((cd) this).field_h.a(param1, -858);
          var34 = var50;
          var26 = var34;
          var18 = var26;
          var16 = var18;
          var3 = var16;
          if (((cd) this).field_h.field_b) {
            var49 = ((cd) this).a((byte) -104, 0, param1);
            var51 = var49[0];
            var35 = var51;
            var27 = var35;
            var52 = var49[1];
            var36 = var52;
            var28 = var36;
            var53 = var49[2];
            var37 = var53;
            var29 = var37;
            var56 = var50[0];
            var40 = var56;
            var30 = var40;
            var22 = var30;
            var8 = var22;
            var54 = var50[1];
            var38 = var54;
            var31 = var38;
            var23 = var31;
            var9 = var23;
            var55 = var50[2];
            var39 = var55;
            var32 = var39;
            var24 = var32;
            var10 = var24;
            var11 = 0;
            if (hh.field_d > var11) {
              var12 = var51[var11];
              var13 = var52[var11];
              var14 = var53[var11];
              if (var12 >= ((cd) this).field_q) {
                if (var12 > ((cd) this).field_r) {
                  L3: {
                    var8[var11] = ((cd) this).field_r;
                    if (var13 < ((cd) this).field_q) {
                      var9[var11] = ((cd) this).field_q;
                      break L3;
                    } else {
                      if (((cd) this).field_r < var13) {
                        var9[var11] = ((cd) this).field_r;
                        break L3;
                      } else {
                        var54[var11] = var13;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var14 < ((cd) this).field_q) {
                        var10[var11] = ((cd) this).field_q;
                        break L5;
                      } else {
                        if (((cd) this).field_r >= var14) {
                          var55[var11] = var14;
                          var11++;
                          break L5;
                        } else {
                          var10[var11] = ((cd) this).field_r;
                          var11++;
                          break L4;
                        }
                      }
                    }
                    var11++;
                    break L4;
                  }
                  var11++;
                  var11++;
                  var11++;
                  var11++;
                  return var3;
                } else {
                  L6: {
                    var56[var11] = var12;
                    if (var13 < ((cd) this).field_q) {
                      var9[var11] = ((cd) this).field_q;
                      break L6;
                    } else {
                      if (((cd) this).field_r < var13) {
                        var9[var11] = ((cd) this).field_r;
                        break L6;
                      } else {
                        var54[var11] = var13;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    L8: {
                      if (var14 < ((cd) this).field_q) {
                        var10[var11] = ((cd) this).field_q;
                        break L8;
                      } else {
                        if (((cd) this).field_r >= var14) {
                          var55[var11] = var14;
                          var11++;
                          break L8;
                        } else {
                          var10[var11] = ((cd) this).field_r;
                          var11++;
                          break L7;
                        }
                      }
                    }
                    var11++;
                    break L7;
                  }
                  var11++;
                  var11++;
                  var11++;
                  var11++;
                  return var3;
                }
              } else {
                L9: {
                  var8[var11] = ((cd) this).field_q;
                  if (var13 < ((cd) this).field_q) {
                    var9[var11] = ((cd) this).field_q;
                    break L9;
                  } else {
                    if (((cd) this).field_r < var13) {
                      var9[var11] = ((cd) this).field_r;
                      break L9;
                    } else {
                      var54[var11] = var13;
                      break L9;
                    }
                  }
                }
                L10: {
                  L11: {
                    if (var14 < ((cd) this).field_q) {
                      var10[var11] = ((cd) this).field_q;
                      break L11;
                    } else {
                      if (((cd) this).field_r >= var14) {
                        var55[var11] = var14;
                        var11++;
                        break L11;
                      } else {
                        var10[var11] = ((cd) this).field_r;
                        var11++;
                        break L10;
                      }
                    }
                  }
                  var11++;
                  break L10;
                }
                var11++;
                var11++;
                var11++;
                var11++;
                return var3;
              }
            } else {
              return var3;
            }
          } else {
            return var3;
          }
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                if (var4_int == 1) {
                  ((cd) this).field_r = param1.e((byte) 93);
                  break L1;
                } else {
                  if (2 == var4_int) {
                    L2: {
                      stackOut_8_0 = this;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (param1.b(16711935) != 1) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L2;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L2;
                      }
                    }
                    ((cd) this).field_f = stackIn_11_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                ((cd) this).field_q = param1.e((byte) 79);
                break L1;
              }
            }
            L3: {
              if (param0 == -71) {
                break L3;
              } else {
                field_k = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("cd.E(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
    }

    public cd() {
        super(1, false);
        ((cd) this).field_r = 4096;
        ((cd) this).field_q = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Remove friend";
        field_k = "Cancel draw";
        field_o = new String[]{"Annihilation", "Take the Grub", "Capture the Fly"};
        field_m = "Invite only";
        field_l = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
