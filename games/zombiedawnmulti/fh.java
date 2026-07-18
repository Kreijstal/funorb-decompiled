/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    int[][] field_p;
    static String field_f;
    fc field_i;
    static ja[] field_h;
    int field_r;
    private int[][] field_a;
    int field_c;
    static String field_e;
    boolean[][] field_k;
    private int field_o;
    private qk[] field_q;
    private int[][] field_l;
    static int field_n;
    static cj field_m;
    static String field_d;
    private int field_b;
    static int field_j;
    static String field_g;

    private final qk[] a(boolean param0, qk param1, qk[] param2) {
        qk[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        qk[] var7 = null;
        qk[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        qk[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7 = new qk[param2.length + 1];
            var4 = var7;
            var5 = 0;
            L1: while (true) {
              if (var5 >= param2.length) {
                var4[param2.length] = (qk) (Object) param2;
                stackOut_6_0 = (qk[]) var4;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var7[var5] = param2[var5];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("fh.B(").append(false).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        var4 = param2 / 24;
        var5 = param1 / 24;
        var6 = -2 / ((-9 - param0) / 59);
        var7 = 4;
        if (!this.a(var4, (byte) 16, var5)) {
          return false;
        } else {
          L0: {
            var8 = param2 % 24;
            var9 = param1 % 24;
            if (var4 != 0) {
              stackOut_5_0 = this.a(var4 + -1, (byte) 125, var5);
              stackIn_6_0 = stackOut_5_0 ? 1 : 0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          L1: {
            var10 = stackIn_6_0;
            if (((fh) this).field_i.field_d + -1 == var4) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              stackOut_7_0 = this.a(var4 + 1, (byte) 1, var5);
              stackIn_9_0 = stackOut_7_0 ? 1 : 0;
              break L1;
            }
          }
          L2: {
            var11 = stackIn_9_0;
            if (var5 != ((fh) this).field_i.field_e + -1) {
              stackOut_11_0 = this.a(var4, (byte) 119, 1 + var5);
              stackIn_12_0 = stackOut_11_0 ? 1 : 0;
              break L2;
            } else {
              stackOut_10_0 = 0;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            }
          }
          L3: {
            var12 = stackIn_12_0;
            if (var11 == 0) {
              break L3;
            } else {
              L4: {
                L5: {
                  stackOut_13_0 = var11;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (var9 < var7) {
                    break L5;
                  } else {
                    stackOut_14_0 = stackIn_14_0;
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (!this.a(1 + var4, (byte) 126, 1 + var5)) {
                      stackOut_17_0 = stackIn_17_0;
                      stackOut_17_1 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      break L4;
                    } else {
                      stackOut_15_0 = stackIn_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                }
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L4;
              }
              var11 = stackIn_18_0 & stackIn_18_1;
              break L3;
            }
          }
          L6: {
            if (var10 == 0) {
              break L6;
            } else {
              L7: {
                L8: {
                  stackOut_20_0 = var10;
                  stackIn_23_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (var9 < var7) {
                    break L8;
                  } else {
                    stackOut_21_0 = stackIn_21_0;
                    stackIn_24_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (!this.a(var4 + -1, (byte) -125, 1 + var5)) {
                      stackOut_24_0 = stackIn_24_0;
                      stackOut_24_1 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L7;
                    } else {
                      stackOut_22_0 = stackIn_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      break L8;
                    }
                  }
                }
                stackOut_23_0 = stackIn_23_0;
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L7;
              }
              var10 = stackIn_25_0 & stackIn_25_1;
              break L6;
            }
          }
          L9: {
            if (var10 != 0) {
              break L9;
            } else {
              if (6 > var8) {
                return false;
              } else {
                break L9;
              }
            }
          }
          L10: {
            if (var11 != 0) {
              break L10;
            } else {
              if (var8 > 8) {
                return false;
              } else {
                break L10;
              }
            }
          }
          L11: {
            if (var12 != 0) {
              break L11;
            } else {
              if (var9 <= var7) {
                break L11;
              } else {
                return false;
              }
            }
          }
          return true;
        }
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var5 = param0 / 24;
          var6 = param3 / 24;
          if (var5 < 0) {
            break L0;
          } else {
            if (var6 < 0) {
              break L0;
            } else {
              if (((fh) this).field_i.field_e <= var6) {
                break L0;
              } else {
                if (var5 < ((fh) this).field_i.field_d) {
                  L1: {
                    if (param1) {
                      break L1;
                    } else {
                      var10 = null;
                      ((fh) this).a(110, false, (nm) null, -115);
                      break L1;
                    }
                  }
                  L2: {
                    var7 = param0 % 24;
                    var8 = 1;
                    if (!param2) {
                      break L2;
                    } else {
                      L3: {
                        if (8 < var7) {
                          var8 = (byte)(var8 | 4);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (16 > var7) {
                        var8 = (byte)(var8 | 2);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    var9 = (byte)(((fh) this).field_i.field_k[var6][var5] & 7);
                    if (var8 != (var8 & var9)) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    }
                  }
                  return stackIn_18_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    final int a(int param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((fh) this).a(param1, true, param5, param0)) {
          var8 = 12.0f;
          var9 = -param3 + param1;
          var10 = -param4 + param0;
          var11 = g.b(var10 * var10 + var9 * var9);
          if (var11 == 0) {
            return 0;
          } else {
            L0: {
              var12 = var8 / (float)var11;
              var13 = var12 * (float)var9;
              if (param2 == -17201) {
                break L0;
              } else {
                boolean discarded$1 = ((fh) this).a(54, true, false, 113);
                break L0;
              }
            }
            var14 = (float)var10 * var12;
            var15 = (float)param3;
            var16 = (float)param4;
            var17 = 1;
            var18 = 1;
            var19 = var11;
            L1: while (true) {
              if ((float)var19 <= var8) {
                return var11;
              } else {
                L2: {
                  var16 = var16 + var14;
                  var15 = var15 + var13;
                  if (var18 != 0) {
                    if (((fh) this).a((int)var15, true, param5, (int)var16)) {
                      stackOut_13_0 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_15_0 = stackOut_12_0;
                      break L2;
                    }
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_15_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var18 = stackIn_15_0;
                  if (!param6) {
                    if (var18 != 0) {
                      break L3;
                    } else {
                      return -1;
                    }
                  } else {
                    L4: {
                      if (var17 != 0) {
                        if (((fh) this).a((int)var15, true, param5, -48 + (int)var16)) {
                          stackOut_20_0 = 1;
                          stackIn_22_0 = stackOut_20_0;
                          break L4;
                        } else {
                          stackOut_19_0 = 0;
                          stackIn_22_0 = stackOut_19_0;
                          break L4;
                        }
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_22_0 = stackOut_17_0;
                        break L4;
                      }
                    }
                    var17 = stackIn_22_0;
                    if (var17 != 0) {
                      break L3;
                    } else {
                      if (var18 == 0) {
                        return -1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var19 = (int)((float)var19 - var8);
                continue L1;
              }
            }
          }
        } else {
          return -1;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 48) {
            break L0;
          } else {
            int discarded$2 = 1;
            fh.a();
            break L0;
          }
        }
        ((fh) this).field_q = new qk[]{};
        var2 = 0;
        L1: while (true) {
          if (var2 >= ((fh) this).field_i.field_e) {
            ((fh) this).field_a = new int[((fh) this).field_q.length][((fh) this).field_q.length];
            var2 = 0;
            L2: while (true) {
              if (var2 >= ((fh) this).field_q.length) {
                return;
              } else {
                var9 = 0;
                var3 = var9;
                L3: while (true) {
                  if (var9 >= ((fh) this).field_q.length) {
                    var2++;
                    continue L2;
                  } else {
                    int discarded$3 = -71;
                    ((fh) this).field_a[var2][var9] = this.a(((fh) this).field_q[var2], ((fh) this).field_q[var9]);
                    var9++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            var3 = 0;
            L4: while (true) {
              if (((fh) this).field_i.field_d <= var3) {
                var2++;
                continue L1;
              } else {
                if (this.a(var3, (byte) 5, var2)) {
                  if (this.a(1 + var3, (byte) 19, var2)) {
                    L5: {
                      var4 = this.a(var3, (byte) -30, var2 + 1) ? 1 : 0;
                      var5 = this.a(var3 + 1, (byte) 127, var2 + 1) ? 1 : 0;
                      var6 = this.a(var3, (byte) 114, var2 - 1) ? 1 : 0;
                      var7 = this.a(1 + var3, (byte) 36, -1 + var2) ? 1 : 0;
                      if (var4 == 0) {
                        if (var4 != 0) {
                          break L5;
                        } else {
                          if (var5 == 0) {
                            break L5;
                          } else {
                            ((fh) this).field_q = this.a(false, new qk(-1 + (24 * var3 + 48), 24 * var2 + 12), ((fh) this).field_q);
                            break L5;
                          }
                        }
                      } else {
                        if (var4 != 0) {
                          break L5;
                        } else {
                          if (var5 == 0) {
                            break L5;
                          } else {
                            ((fh) this).field_q = this.a(false, new qk(-1 + (24 * var3 + 48), 24 * var2 + 12), ((fh) this).field_q);
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (var6 == 0) {
                        break L6;
                      } else {
                        if (var7 == 0) {
                          ((fh) this).field_q = this.a(false, new qk(1 + 24 * var3, 24 * (var2 - -1) + -12), ((fh) this).field_q);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var6 == 0) {
                      if (var7 != 0) {
                        ((fh) this).field_q = this.a(false, new qk(47 + var3 * 24, (var2 - -1) * 24 + -12), ((fh) this).field_q);
                        var3++;
                        continue L4;
                      } else {
                        var3++;
                        continue L4;
                      }
                    } else {
                      var3++;
                      continue L4;
                    }
                  } else {
                    var3++;
                    continue L4;
                  }
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ga var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ra var11 = null;
        ab var12 = null;
        ga var13 = null;
        ra var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var13 = s.field_e;
            var2 = var13.g(31365);
            L1: {
              if (0 != var2) {
                if (1 == var2) {
                  var12 = (ab) (Object) ig.field_a.c(72);
                  if (var12 == null) {
                    ak.a((byte) -117);
                    return;
                  } else {
                    var12.a(true);
                    break L1;
                  }
                } else {
                  if (var2 != 2) {
                    int discarded$1 = 0;
                    bd.a("A1: " + ci.a(0), (Throwable) null);
                    ak.a((byte) -118);
                    break L1;
                  } else {
                    var14 = (ra) (Object) so.field_j.c(77);
                    if (var14 == null) {
                      ak.a((byte) -128);
                      return;
                    } else {
                      var14.field_h = da.a(8);
                      var14.field_k = true;
                      var14.a(true);
                      break L1;
                    }
                  }
                }
              } else {
                var10 = da.a(8);
                var3 = var10;
                var9 = var10;
                var4 = var9;
                var5 = var13;
                var6 = ((k) (Object) var5).g(31365);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var11 = (ra) (Object) so.field_j.c(61);
                    if (var11 == null) {
                      ak.a((byte) -111);
                      return;
                    } else {
                      var11.field_h = var3;
                      var11.field_k = true;
                      var11.a(true);
                      break L1;
                    }
                  } else {
                    var9[var7] = ((k) (Object) var5).i(-1478490344);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "fh.P(" + 1 + ')');
        }
    }

    final void a(byte param0, nm param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int var22 = 0;
        int var23 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = (int)(320.0f * param1.field_d - (float)param1.field_k);
              var4 = (int)(param1.field_d * 240.0f - (float)param1.field_g);
              var5 = 0;
              var7 = 44 / ((param0 - 63) / 34);
              if (var3_int >= -24) {
                break L1;
              } else {
                var5 = -(var3_int / 24);
                var3_int = var3_int % 24;
                break L1;
              }
            }
            L2: {
              var6 = 0;
              if (var4 >= -24) {
                break L2;
              } else {
                var6 = -(var4 / 24);
                var4 = var4 % 24;
                break L2;
              }
            }
            var8 = var5 - -55;
            var9 = 41 + var6;
            var10 = var3_int;
            var11 = var5;
            var12 = 0;
            var14 = 0;
            L3: while (true) {
              if (var14 >= 41) {
                var13 = 0;
                ((fh) this).field_o = var5;
                ((fh) this).field_b = var6;
                L4: while (true) {
                  if (var6 >= var9) {
                    L5: {
                      if (!qq.field_h) {
                        break L5;
                      } else {
                        var14 = param1.a(bd.field_g, 2);
                        var15 = param1.a(true, bo.field_d);
                        var16 = 0;
                        L6: while (true) {
                          if (var16 >= ((fh) this).field_q.length) {
                            var23 = 0;
                            var16 = var23;
                            L7: while (true) {
                              if (var23 >= ((fh) this).field_q.length) {
                                break L5;
                              } else {
                                var17 = 320 + ((fh) this).field_q[var23].field_g + -param1.field_k;
                                var18 = -param1.field_g + (((fh) this).field_q[var23].field_h + 240);
                                oo.d(var17, var18, 2, 16711680, 256);
                                qp.field_w.b(Integer.toString(var23), var17, var18, 16777215, 0, 64);
                                var23++;
                                continue L7;
                              }
                            }
                          } else {
                            var17 = param1.c(((fh) this).field_q[var16].field_g, -20126);
                            var18 = param1.d(((fh) this).field_q[var16].field_h, 119);
                            var19 = 0;
                            L8: while (true) {
                              if (var19 >= ((fh) this).field_q.length) {
                                L9: {
                                  if (-1 != ((fh) this).a(var15, 113, var14, ((fh) this).field_q[var16].field_h, ((fh) this).field_q[var16].field_g)) {
                                    var19 = param1.c(var14, -20126);
                                    var20 = param1.d(var15, 122);
                                    oo.g(var17, var18, var19, var20, 16711680);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var16++;
                                continue L6;
                              } else {
                                L10: {
                                  var20 = param1.c(((fh) this).field_q[var19].field_g, -20126);
                                  var21 = param1.d(((fh) this).field_q[var19].field_h, 107);
                                  if (((fh) this).field_a[var16][var19] <= 0) {
                                    break L10;
                                  } else {
                                    oo.g(var17, var18, var20, var21, 65280, 48);
                                    break L10;
                                  }
                                }
                                var19++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    L11: while (true) {
                      if (var5 >= var8) {
                        var13++;
                        var4 += 24;
                        var3_int = var10;
                        var12 = 0;
                        var5 = var11;
                        var6++;
                        continue L4;
                      } else {
                        L12: {
                          L13: {
                            if (var5 >= ((fh) this).field_i.field_d) {
                              break L13;
                            } else {
                              if (((fh) this).field_i.field_e > var6) {
                                L14: {
                                  L15: {
                                    var14 = ((fh) this).a(var5, var6, (byte) 126);
                                    var15 = var14 & 127;
                                    if (var15 < 0) {
                                      break L15;
                                    } else {
                                      if (rn.field_a.length <= var15) {
                                        break L15;
                                      } else {
                                        rn.field_a[var15].c(var3_int, var4);
                                        break L14;
                                      }
                                    }
                                  }
                                  oo.e(var3_int, var4, 24, 24, 7631988);
                                  break L14;
                                }
                                L16: {
                                  if (!qq.field_h) {
                                    break L16;
                                  } else {
                                    qp.field_w.c(Integer.toString(((fh) this).field_i.field_k[var6][var5]), 12 + var3_int, 12 + var4, 16777215, 1);
                                    break L16;
                                  }
                                }
                                var3_int += 24;
                                ((fh) this).field_l[var13][var12] = var14;
                                var12++;
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          oo.e(var3_int, var4, 24, 24, 1);
                          var12++;
                          var3_int += 24;
                          break L12;
                        }
                        var5++;
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                var15 = 0;
                L17: while (true) {
                  if (55 <= var15) {
                    var14++;
                    continue L3;
                  } else {
                    ((fh) this).field_l[var14][var15] = 0;
                    var15++;
                    continue L17;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var3;
            stackOut_43_1 = new StringBuilder().append("fh.M(").append(param0).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L18;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L18;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ')');
        }
    }

    private final int a(qk param0, qk param1) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            stackOut_2_0 = ((fh) this).a(param0.field_h, -47, param0.field_g, param1.field_h, param1.field_g);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("fh.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + -71 + ')');
        }
        return stackIn_3_0;
    }

    private final void b() {
        ((fh) this).field_r = 24 * ((fh) this).field_i.field_d;
        ((fh) this).field_c = ((fh) this).field_i.field_e * 24;
    }

    final int a(int param0, int param1, byte param2) {
        if (!(param0 >= 0)) {
            return 0;
        }
        if (!(param1 >= 0)) {
            return 0;
        }
        if (param1 >= ((fh) this).field_i.field_e) {
            return 0;
        }
        if (((fh) this).field_i.field_d <= param0) {
            return 0;
        }
        int var4 = 26 / ((param2 - -45) / 48);
        return ((fh) this).field_i.field_f[param1][param0];
    }

    fh(fc param0) {
        int[][] var10 = null;
        int[][] var9 = null;
        int[][] var8 = null;
        int[][] var7 = null;
        int[][] var6 = null;
        int var3 = 0;
        int var4 = 0;
        ((fh) this).field_l = new int[41][55];
        try {
            ((fh) this).field_i = param0;
            ((fh) this).a(48);
            int discarded$0 = 1;
            this.b();
            var10 = ((fh) this).field_i.field_k;
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var6 = var7;
            int[][] var2 = var6;
            ((fh) this).field_p = new int[var10.length][var10[0].length];
            for (var3 = 0; var10.length > var3; var3++) {
                for (var4 = 0; var4 < var10[0].length; var4++) {
                    ((fh) this).field_p[var3][var4] = tq.b(1, var10[var3][var4]) == 0 ? 33554432 : 0;
                }
            }
            ((fh) this).field_k = new boolean[((fh) this).field_i.field_e][((fh) this).field_i.field_d];
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "fh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final th b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        qk var8 = null;
        qk var9 = null;
        th var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        L0: {
          var19 = ZombieDawnMulti.field_E ? 1 : 0;
          var6 = param3 / 24;
          var7 = param1 / 24;
          if (!this.a(var6, (byte) 118, var7)) {
            if (!this.a(var6, (byte) -25, var7 + -1)) {
              if (!this.a(var6, (byte) 32, 1 + var7)) {
                if (this.a(var6, (byte) 125, var7 + 2)) {
                  param1 += 48;
                  break L0;
                } else {
                  if (this.a(var6 - -1, (byte) 21, var7)) {
                    param3 += 24;
                    break L0;
                  } else {
                    if (!this.a(var6 - 1, (byte) 116, var7)) {
                      break L0;
                    } else {
                      param3 -= 24;
                      break L0;
                    }
                  }
                }
              } else {
                param1 += 24;
                break L0;
              }
            } else {
              param1 -= 24;
              break L0;
            }
          } else {
            break L0;
          }
        }
        var7 = param1 / 24;
        var6 = param3 / 24;
        if (this.a(var6, (byte) 22, var7)) {
          L1: {
            if (((fh) this).a(param3, true, true, param1)) {
              break L1;
            } else {
              if (!this.a(var6 - 1, (byte) 122, var7)) {
                param3 = 24 + 24 * var6 + -1;
                break L1;
              } else {
                if (!this.a(1 + var6, (byte) 119, var7)) {
                  param3 = 24 * var6;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          L2: {
            var8 = new qk(param0, param2);
            if (param4 == 8760) {
              break L2;
            } else {
              var20 = null;
              ((fh) this).a(-105, true, (nm) null, 61);
              break L2;
            }
          }
          var9 = new qk(param3, param1);
          var10 = new th();
          var10.a((br) (Object) var9, false);
          int discarded$3 = -71;
          var11 = this.a(var9, var8);
          if (var11 >= 0) {
            return var10;
          } else {
            var27 = new int[((fh) this).field_q.length];
            var25 = var27;
            var23 = var25;
            var21 = var23;
            var12 = var21;
            var28 = new int[((fh) this).field_q.length];
            var26 = var28;
            var24 = var26;
            var22 = var24;
            var13 = var22;
            var14 = 0;
            L3: while (true) {
              if (~var27.length >= ~var14) {
                var14 = 1;
                L4: while (true) {
                  if (var14 == 0) {
                    var15 = -1;
                    var16 = -1;
                    var17 = 0;
                    L5: while (true) {
                      if (var27.length <= var17) {
                        if (-1 != var16) {
                          L6: while (true) {
                            if (var15 == -1) {
                              return var10;
                            } else {
                              if (var15 != var28[var15]) {
                                var10.a(-25612, (br) (Object) ((fh) this).field_q[var15].a(30544));
                                var15 = var28[var15];
                                continue L6;
                              } else {
                                return null;
                              }
                            }
                          }
                        } else {
                          return null;
                        }
                      } else {
                        L7: {
                          int discarded$4 = -71;
                          var18 = this.a(var9, ((fh) this).field_q[var17]);
                          if (var18 < 0) {
                            break L7;
                          } else {
                            if (var27[var17] == -1) {
                              break L7;
                            } else {
                              L8: {
                                if (var16 == -1) {
                                  break L8;
                                } else {
                                  if (~var16 < ~(var18 - -var27[var17])) {
                                    break L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var15 = var17;
                              var16 = var27[var17] + var18;
                              break L7;
                            }
                          }
                        }
                        var17++;
                        continue L5;
                      }
                    }
                  } else {
                    var14 = 0;
                    var15 = 0;
                    L9: while (true) {
                      if (~var27.length >= ~var15) {
                        continue L4;
                      } else {
                        L10: {
                          if (var27[var15] < 0) {
                            break L10;
                          } else {
                            var16 = 0;
                            L11: while (true) {
                              if (~var27.length >= ~var16) {
                                break L10;
                              } else {
                                L12: {
                                  if (-1 == ((fh) this).field_a[var15][var16]) {
                                    break L12;
                                  } else {
                                    L13: {
                                      if (-1 == var27[var16]) {
                                        break L13;
                                      } else {
                                        if (var27[var15] + ((fh) this).field_a[var15][var16] >= var27[var16]) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    var28 = var26;
                                    var14 = 1;
                                    var12[var16] = ((fh) this).field_a[var15][var16] + var27[var15];
                                    var28[var16] = var15;
                                    break L12;
                                  }
                                }
                                var16++;
                                continue L11;
                              }
                            }
                          }
                        }
                        var15++;
                        continue L9;
                      }
                    }
                  }
                }
              } else {
                L14: {
                  int discarded$5 = -71;
                  var15 = this.a(var8, ((fh) this).field_q[var14]);
                  var27[var14] = var15;
                  stackOut_27_0 = (int[]) var13;
                  stackOut_27_1 = var14;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  if (var15 >= 0) {
                    stackOut_29_0 = (int[]) (Object) stackIn_29_0;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = -1;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    break L14;
                  } else {
                    stackOut_28_0 = (int[]) (Object) stackIn_28_0;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = -2;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_30_2 = stackOut_28_2;
                    break L14;
                  }
                }
                stackIn_30_0[stackIn_30_1] = stackIn_30_2;
                var14++;
                continue L3;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        ee.field_b = false;
        if (null != mj.field_Ib) {
            mj.field_Ib.c((byte) 123);
        }
        if (!(0 == va.field_a)) {
            pf.a(89);
        }
        ti.field_Y = 0;
        if (param0 != 31706) {
            fh.b(-67);
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        if (!(param0 >= 0)) {
            return false;
        }
        if (0 > param2) {
            return false;
        }
        if (!(param2 < ((fh) this).field_i.field_e)) {
            return false;
        }
        int var4 = -18 / ((74 - param1) / 37);
        if (!(param0 < ((fh) this).field_i.field_d)) {
            return false;
        }
        return 0 != (1 & ((fh) this).field_i.field_k[param2][param0]) ? true : false;
    }

    final int[][] d(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= 21) {
            ((fh) this).field_o = -62;
        }
        int[][] var6 = new int[((fh) this).field_i.field_e][((fh) this).field_i.field_d];
        int[][] var2 = var6;
        for (var3 = 0; var3 < ((fh) this).field_i.field_e; var3++) {
            for (var4 = 0; var4 < ((fh) this).field_i.field_d; var4++) {
                var6[var3][var4] = !this.a(var4, (byte) -71, var3) ? -1 : 0;
            }
        }
        return var2;
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 85 % ((33 - param1) / 62);
        return ((fh) this).a(param0, param2, -17201, param4, param3, true, false);
    }

    final void a(int param0, boolean param1, nm param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ja var15 = null;
        ja var16 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = (int)((float)(-param2.field_k) + 320.0f * param2.field_d);
              if (var5_int < -24) {
                var5_int = var5_int % 24;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = (int)((float)(-param2.field_g) + param2.field_d * 240.0f);
              if (var6 >= -24) {
                break L2;
              } else {
                var6 = var6 % 24;
                break L2;
              }
            }
            var7 = var5_int;
            var8 = 0;
            L3: while (true) {
              if (var8 >= 41) {
                L4: {
                  if (param3 == -1) {
                    break L4;
                  } else {
                    boolean discarded$1 = ((fh) this).a(-106, false, true, 19);
                    break L4;
                  }
                }
                break L0;
              } else {
                var9 = 0;
                L5: while (true) {
                  if (var9 >= 55) {
                    var5_int = var7;
                    var6 += 24;
                    var8++;
                    continue L3;
                  } else {
                    L6: {
                      if (~(var9 + ((fh) this).field_o) <= ~((fh) this).field_k[0].length) {
                        break L6;
                      } else {
                        if (~((fh) this).field_k.length < ~(var8 + ((fh) this).field_b)) {
                          L7: {
                            var10 = ((fh) this).field_l[var8][var9];
                            if (param0 != 1) {
                              if (param0 == 2) {
                                if (((fh) this).field_k[var8 - -((fh) this).field_b][((fh) this).field_o + var9]) {
                                  var5_int += 24;
                                  break L6;
                                } else {
                                  var11 = -1 + ((var10 & 33488896) >> 16);
                                  if (var11 < 0) {
                                    break L7;
                                  } else {
                                    if (var11 < od.field_Ab.length) {
                                      var16 = od.field_Ab[var11];
                                      if ((268435456 & var10) > 0) {
                                        var16.b(var5_int, var6);
                                        break L7;
                                      } else {
                                        if ((var10 & 134217728) > 0) {
                                          var16.a(var5_int, var6);
                                          break L7;
                                        } else {
                                          var16.g(var5_int, var6);
                                          break L7;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              } else {
                                if (param0 == 3) {
                                  L8: {
                                    if ((-2147483648 & var10) != 0) {
                                      if (param1) {
                                        if ((67108864 & var10) == 0) {
                                          oo.f(var5_int, var6, 24, 24, 16711935, 128);
                                          break L8;
                                        } else {
                                          oo.f(var5_int, var6, 24, 24, 65280, 128);
                                          break L8;
                                        }
                                      } else {
                                        if ((var10 & 67108864) != 0) {
                                          L9: {
                                            var11 = -1;
                                            var12 = 511 & var10 >> 7;
                                            var13 = var10 >> 16 & 511;
                                            if (var13 < 9) {
                                              break L9;
                                            } else {
                                              if (var13 > 32) {
                                                break L9;
                                              } else {
                                                var11 = -9 + var13;
                                                break L9;
                                              }
                                            }
                                          }
                                          L10: {
                                            if (var12 < 9) {
                                              break L10;
                                            } else {
                                              if (var12 > 32) {
                                                break L10;
                                              } else {
                                                var11 = var12 - 9;
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (var13 != 29) {
                                              break L11;
                                            } else {
                                              var11 = 9;
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (0 > var11) {
                                              break L12;
                                            } else {
                                              if (var11 >= ne.field_Ab.length) {
                                                break L12;
                                              } else {
                                                ne.field_Ab[var11].c(var5_int, var6, 128);
                                                break L8;
                                              }
                                            }
                                          }
                                          oo.f(var5_int, var6, 24, 24, 0, 128);
                                          ne.field_Ab[21].c(var5_int, var6 - -24, 128);
                                          break L8;
                                        } else {
                                          oo.f(var5_int, var6, 24, 24, 0, 128);
                                          break L8;
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                  if (!wh.field_c) {
                                    break L7;
                                  } else {
                                    oo.a(var5_int, var6, 25, 25, 7864183);
                                    break L7;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                            } else {
                              if (!((fh) this).field_k[var8 + ((fh) this).field_b][var9 - -((fh) this).field_o]) {
                                L13: {
                                  var11 = ((var10 & 65408) >> 7) + -1;
                                  if (var11 < 0) {
                                    break L13;
                                  } else {
                                    if (~var11 > ~od.field_Ab.length) {
                                      L14: {
                                        if (param1) {
                                          oo.e(var5_int, var6, 24, 24, 16711935);
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        var15 = od.field_Ab[var11];
                                        var16 = var15;
                                        var16 = var15;
                                        if (!((fh) this).field_k[var8 + ((fh) this).field_b][((fh) this).field_o + var9]) {
                                          L16: {
                                            if (0 >= (1073741824 & var10)) {
                                              break L16;
                                            } else {
                                              if (0 < (536870912 & var10)) {
                                                var15.d(var5_int, var6);
                                                break L15;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          if (0 >= (var10 & 1073741824)) {
                                            if ((var10 & 536870912) > 0) {
                                              var15.a(var5_int, var6);
                                              break L15;
                                            } else {
                                              var15.g(var5_int, var6);
                                              break L15;
                                            }
                                          } else {
                                            var15.b(var5_int, var6);
                                            break L15;
                                          }
                                        } else {
                                          var15.c(var5_int, var6, 128);
                                          break L15;
                                        }
                                      }
                                      if (!po.field_p) {
                                        break L13;
                                      } else {
                                        if ((var10 & 33554432) == 0) {
                                          break L13;
                                        } else {
                                          oo.f(var5_int, var6, 24, 24, 8425216, 96);
                                          break L7;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                break L7;
                              } else {
                                var5_int += 24;
                                break L6;
                              }
                            }
                          }
                          var5_int += 24;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var9++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) var5;
            stackOut_79_1 = new StringBuilder().append("fh.E(").append(param0).append(',').append(param1).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param2 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L17;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L17;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + ',' + param3 + ')');
        }
    }

    public static void a() {
        field_d = null;
        field_e = null;
        field_g = null;
        field_h = null;
        field_f = null;
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0> has left the lobby.";
        field_j = 0;
        field_e = "Use this on a zombie or area to disrupt an ongoing effect. Thwart your enemies' evil plans!";
        field_g = "";
        field_d = "<%0>/<%1>";
    }
}
