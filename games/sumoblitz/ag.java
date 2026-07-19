/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ag {
    static byte[][] field_d;
    static float[] field_c;
    tk[] field_a;
    static int field_b;

    final int b(int param0, int param1) {
        int var3 = 0;
        tk var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var3 >= this.field_a.length) {
              break L1;
            } else {
              var4 = this.field_a[var3];
              var7 = var4.field_b.length;
              var6 = param0;
              if (var5 != 0) {
                if (var6 != var7) {
                  ag.c(-10);
                  return this.field_a.length;
                } else {
                  return this.field_a.length;
                }
              } else {
                if (var6 >= var7) {
                  param0 = param0 - (var4.field_b.length + -1);
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return var3;
                }
              }
            }
          }
          if (param1 != -17500) {
            ag.c(-10);
            return this.field_a.length;
          } else {
            return this.field_a.length;
          }
        }
    }

    final int a(int param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param0 == -292767736) {
                break L1;
              } else {
                ag.b(3);
                break L1;
              }
            }
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var8 >= var7) {
                    break L4;
                  } else {
                    var9 = param2.charAt(var8);
                    var12 = 60;
                    var11 = var9;
                    if (var10 != 0) {
                      if (var11 < var12) {
                        break L3;
                      } else {
                        return 0;
                      }
                    } else {
                      L5: {
                        L6: {
                          if (var11 == var12) {
                            break L6;
                          } else {
                            L7: {
                              if (var9 != 62) {
                                break L7;
                              } else {
                                var6 = 0;
                                if (var10 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            if (var6 != 0) {
                              break L5;
                            } else {
                              if (var9 == 32) {
                                var5_int++;
                                if (var10 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var6 = 1;
                        break L5;
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (0 < var5_int) {
                  break L3;
                } else {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              stackOut_20_0 = (-param3 + param1 << -292767736) / var5_int;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("ag.S(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0;
        } else {
          return stackIn_23_0;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        tk var11 = null;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_20_0 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_a != null) {
          if (this.field_a.length != 0) {
            if (param0 < this.field_a[0].field_d) {
              return -1;
            } else {
              if (this.field_a[this.field_a.length + -1].field_a < param0) {
                return -1;
              } else {
                if (this.field_a.length == 1) {
                  return this.field_a[0].a(param1, (byte) 117);
                } else {
                  var4 = 0;
                  if (param2 >= 97) {
                    var5 = 0;
                    L0: while (true) {
                      if (this.field_a.length > var5) {
                        var11 = this.field_a[var5];
                        stackOut_20_0 = var11.field_d;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var8 == 0) {
                          L1: {
                            if (stackIn_22_0 > param0) {
                              break L1;
                            } else {
                              if (param0 > var11.field_a) {
                                break L1;
                              } else {
                                var7 = var11.a(param1, (byte) -126);
                                if ((var7 ^ -1) != 0) {
                                  return var4 - -var7;
                                } else {
                                  return -1;
                                }
                              }
                            }
                          }
                          var4 = var4 + (var11.field_b.length + -1);
                          var5++;
                          continue L0;
                        } else {
                          return stackIn_21_0;
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return -92;
                  }
                }
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final static void a(int param0) {
        String var1 = null;
        if (pg.field_a) {
          if (param0 != 0) {
            L0: {
              field_c = (float[]) null;
              if (hc.field_c != null) {
                hc.field_c.n(-7);
                break L0;
              } else {
                break L0;
              }
            }
            var1 = wh.a((byte) -72);
            no.field_a = new cv(var1, (String) null, true, false, false);
            rf.field_a.a((byte) 114, vi.field_y);
            vi.field_y.b((byte) -118, no.field_a);
            vi.field_y.f((byte) -128);
            return;
          } else {
            L1: {
              if (hc.field_c != null) {
                hc.field_c.n(-7);
                break L1;
              } else {
                break L1;
              }
            }
            var1 = wh.a((byte) -72);
            no.field_a = new cv(var1, (String) null, true, false, false);
            rf.field_a.a((byte) 114, vi.field_y);
            vi.field_y.b((byte) -118, no.field_a);
            vi.field_y.f((byte) -128);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static void a(int param0, int param1) {
        wt.a(param1, (byte) 105);
        if (param0 != 0) {
            ag.c(-74);
        }
    }

    final int a(byte param0, int param1) {
        int discarded$5 = 0;
        tk[] var3 = null;
        int var4 = 0;
        tk var5 = null;
        int var6 = 0;
        String var7 = null;
        tk[] var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var8 = this.field_a;
        var3 = var8;
        if (param0 > 104) {
          var4 = 0;
          L0: while (true) {
            if (var8.length > var4) {
              var5 = var8[var4];
              stackOut_14_0 = var5.field_b.length;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var6 == 0) {
                if (stackIn_16_0 > param1) {
                  return var5.field_b[param1];
                } else {
                  param1 = param1 - (-1 + var5.field_b.length);
                  var4++;
                  continue L0;
                }
              } else {
                return stackIn_15_0;
              }
            } else {
              return 0;
            }
          }
        } else {
          var7 = (String) null;
          discarded$5 = this.a(-96, -70, (String) null, 123);
          var4 = 0;
          L1: while (true) {
            if (var8.length > var4) {
              var5 = var8[var4];
              stackOut_4_0 = var5.field_b.length;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var6 == 0) {
                if (stackIn_6_0 > param1) {
                  return var5.field_b[param1];
                } else {
                  param1 = param1 - (-1 + var5.field_b.length);
                  var4++;
                  continue L1;
                }
              } else {
                return stackIn_5_0;
              }
            } else {
              return 0;
            }
          }
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        L0: {
          if (tt.field_l > 32) {
            L1: {
              var1 = tt.field_l % 32;
              if (-1 != (var1 ^ -1)) {
                break L1;
              } else {
                var1 = 32;
                break L1;
              }
            }
            lf.a(0, tt.field_l - var1);
            break L0;
          } else {
            lf.a(0, 0);
            if (!Sumoblitz.field_L) {
              break L0;
            } else {
              L2: {
                var1 = tt.field_l % 32;
                if (-1 != (var1 ^ -1)) {
                  break L2;
                } else {
                  var1 = 32;
                  break L2;
                }
              }
              lf.a(0, tt.field_l - var1);
              if (param0 == 0) {
                return;
              } else {
                field_b = -64;
                return;
              }
            }
          }
        }
        if (param0 != 0) {
          field_b = -64;
          return;
        } else {
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
          if (this.field_a != null) {
            if (this.field_a.length <= 0) {
              return 0;
            } else {
              return this.field_a[-1 + this.field_a.length].field_a - this.field_a[0].field_d;
            }
          } else {
            return 0;
          }
        } else {
          return 73;
        }
    }

    public static void c(int param0) {
        int var1 = 104 / ((param0 - -8) / 42);
        field_c = null;
        field_d = (byte[][]) null;
    }

    final int a(byte param0) {
        int discarded$1 = 0;
        int var2 = 0;
        tk[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        tk[] var9 = null;
        tk var10 = null;
        tk[] var11 = null;
        tk var12 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (param0 <= -6) {
          var2 = -1;
          if (null != this.field_a) {
            var11 = this.field_a;
            var4 = 0;
            L0: while (true) {
              if (var11.length > var4) {
                L1: {
                  var12 = var11[var4];
                  if (var12 != null) {
                    var6 = var12.a(1);
                    if (var6 > var2) {
                      var2 = var6;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                var4++;
                if (var7 == 0) {
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          } else {
            return var2;
          }
        } else {
          var8 = (String) null;
          discarded$1 = this.a(84, 121, (String) null, -67);
          var2 = -1;
          if (null != this.field_a) {
            var9 = this.field_a;
            var3 = var9;
            var4 = 0;
            L2: while (true) {
              if (var9.length > var4) {
                L3: {
                  var10 = var9[var4];
                  var12 = var10;
                  var12 = var10;
                  if (var10 != null) {
                    var6 = var10.a(1);
                    if (var6 > var2) {
                      var2 = var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var4++;
                if (var7 == 0) {
                  continue L2;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          } else {
            return var2;
          }
        }
    }

    static {
        field_c = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
    }
}
