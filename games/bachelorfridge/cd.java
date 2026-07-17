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
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] stackIn_8_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_22_0 = null;
        int[] stackIn_31_0 = null;
        int[] stackOut_21_0 = null;
        int[] stackOut_30_0 = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_16_0 = null;
        var7 = BachelorFridge.field_y;
        if (param1 == 0) {
          var12 = ((cd) this).field_j.a(param0, -1);
          var10 = var12;
          var8 = var10;
          var3 = var8;
          if (!((cd) this).field_j.field_m) {
            return var8;
          } else {
            var4 = ((cd) this).a(0, param0, (byte) 107);
            var5 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (hh.field_d <= var5) {
                    break L2;
                  } else {
                    stackOut_21_0 = (int[]) var4;
                    stackIn_31_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var7 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          var6 = stackIn_22_0[var5];
                          if (var6 >= ((cd) this).field_q) {
                            break L4;
                          } else {
                            var8[var5] = ((cd) this).field_q;
                            if (var7 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (((cd) this).field_r < var6) {
                            break L5;
                          } else {
                            var12[var5] = var6;
                            if (var7 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var8[var5] = ((cd) this).field_r;
                        break L3;
                      }
                      var5++;
                      if (var7 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_30_0 = (int[]) var8;
                stackIn_31_0 = stackOut_30_0;
                break L1;
              }
              return stackIn_31_0;
            }
          }
        } else {
          L6: {
            L7: {
              field_k = null;
              var11 = ((cd) this).field_j.a(param0, -1);
              var9 = var11;
              var8 = var9;
              var3 = var8;
              if (((cd) this).field_j.field_m) {
                var4 = ((cd) this).a(0, param0, (byte) 107);
                var5 = 0;
                L8: while (true) {
                  if (hh.field_d > var5) {
                    stackOut_7_0 = (int[]) var4;
                    stackIn_17_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var7 != 0) {
                      break L6;
                    } else {
                      L9: {
                        L10: {
                          var6 = stackIn_8_0[var5];
                          if (var6 >= ((cd) this).field_q) {
                            break L10;
                          } else {
                            var8[var5] = ((cd) this).field_q;
                            if (var7 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (((cd) this).field_r < var6) {
                            break L11;
                          } else {
                            var11[var5] = var6;
                            if (var7 == 0) {
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var8[var5] = ((cd) this).field_r;
                        break L9;
                      }
                      var5++;
                      if (var7 == 0) {
                        continue L8;
                      } else {
                        break L7;
                      }
                    }
                  } else {
                    return var8;
                  }
                }
              } else {
                break L7;
              }
            }
            stackOut_16_0 = (int[]) var8;
            stackIn_17_0 = stackOut_16_0;
            break L6;
          }
          return stackIn_17_0;
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_p = null;
        field_n = null;
        field_m = null;
        field_k = null;
        field_o = null;
        field_l = null;
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
            return var16;
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
              L1: {
                if (hh.field_d <= var11) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      var12 = var59[var11];
                      var13 = var60[var11];
                      var14 = var61[var11];
                      if (var12 >= ((cd) this).field_q) {
                        break L3;
                      } else {
                        var8[var11] = ((cd) this).field_q;
                        if (var15 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var12 <= ((cd) this).field_r) {
                        break L4;
                      } else {
                        var8[var11] = ((cd) this).field_r;
                        if (var15 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var62[var11] = var12;
                    break L2;
                  }
                  L5: {
                    L6: {
                      if (var13 < ((cd) this).field_q) {
                        break L6;
                      } else {
                        L7: {
                          if (((cd) this).field_r < var13) {
                            break L7;
                          } else {
                            var63[var11] = var13;
                            if (var15 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var9[var11] = ((cd) this).field_r;
                        if (var15 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var9[var11] = ((cd) this).field_q;
                    break L5;
                  }
                  L8: {
                    L9: {
                      if (var14 < ((cd) this).field_q) {
                        break L9;
                      } else {
                        L10: {
                          if (((cd) this).field_r >= var14) {
                            break L10;
                          } else {
                            var10[var11] = ((cd) this).field_r;
                            if (var15 == 0) {
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var64[var11] = var14;
                        if (var15 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var10[var11] = ((cd) this).field_q;
                    break L8;
                  }
                  var11++;
                  if (var15 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var16;
            }
          }
        } else {
          L11: {
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
              var54 = var50[0];
              var38 = var54;
              var30 = var38;
              var22 = var30;
              var8 = var22;
              var55 = var50[1];
              var39 = var55;
              var31 = var39;
              var23 = var31;
              var9 = var23;
              var56 = var50[2];
              var40 = var56;
              var32 = var40;
              var24 = var32;
              var10 = var24;
              var11 = 0;
              L12: while (true) {
                if (hh.field_d > var11) {
                  L13: {
                    L14: {
                      var12 = var51[var11];
                      var13 = var52[var11];
                      var14 = var53[var11];
                      if (var12 >= ((cd) this).field_q) {
                        break L14;
                      } else {
                        var8[var11] = ((cd) this).field_q;
                        if (var15 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (var12 <= ((cd) this).field_r) {
                        break L15;
                      } else {
                        var8[var11] = ((cd) this).field_r;
                        if (var15 == 0) {
                          break L13;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var54[var11] = var12;
                    break L13;
                  }
                  L16: {
                    L17: {
                      if (var13 < ((cd) this).field_q) {
                        break L17;
                      } else {
                        L18: {
                          if (((cd) this).field_r < var13) {
                            break L18;
                          } else {
                            var55[var11] = var13;
                            if (var15 == 0) {
                              break L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                        var9[var11] = ((cd) this).field_r;
                        if (var15 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var9[var11] = ((cd) this).field_q;
                    break L16;
                  }
                  L19: {
                    L20: {
                      if (var14 < ((cd) this).field_q) {
                        break L20;
                      } else {
                        L21: {
                          if (((cd) this).field_r >= var14) {
                            break L21;
                          } else {
                            var10[var11] = ((cd) this).field_r;
                            if (var15 == 0) {
                              break L19;
                            } else {
                              break L21;
                            }
                          }
                        }
                        var56[var11] = var14;
                        if (var15 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var10[var11] = ((cd) this).field_q;
                    break L19;
                  }
                  var11++;
                  if (var15 == 0) {
                    continue L12;
                  } else {
                    break L11;
                  }
                } else {
                  return var16;
                }
              }
            } else {
              break L11;
            }
          }
          return var16;
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    var4_int = param2;
                    if (0 != var4_int) {
                      break L4;
                    } else {
                      if (var5 == 0) {
                        ((cd) this).field_q = param1.e((byte) 79);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4_int == 1) {
                    break L3;
                  } else {
                    if (2 == var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                ((cd) this).field_r = param1.e((byte) 93);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              L5: {
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (param1.b(16711935) != 1) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L5;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L5;
                }
              }
              ((cd) this).field_f = stackIn_13_1 != 0;
              break L1;
            }
            L6: {
              if (param0 == -71) {
                break L6;
              } else {
                field_k = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("cd.E(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
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
