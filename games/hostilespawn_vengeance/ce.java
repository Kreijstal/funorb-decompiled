/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ce {
    static u[] field_f;
    static int field_e;
    pm[] field_d;
    static int[] field_b;
    static String field_g;
    static bd field_a;
    static int field_c;

    final int b(int param0, int param1) {
        int var4 = 0;
        pm var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        pm[] var7 = ((ce) this).field_d;
        pm[] var3 = var7;
        for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5.field_b.length > param0) {
                return var5.field_b[param0];
            }
            param0 = param0 - (var5.field_b.length + -1);
        }
        return 0;
    }

    final int a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (((ce) this).field_d == null) {
                break L1;
              } else {
                if (0 < ((ce) this).field_d.length) {
                  stackOut_6_0 = ((ce) this).field_d[((ce) this).field_d.length - 1].field_f - ((ce) this).field_d[0].field_i;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 24;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        pm var4 = null;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        for (var3 = param1; ((ce) this).field_d.length > var3; var3++) {
            var4 = ((ce) this).field_d[var3];
            if (var4.field_b.length > param0) {
                return var3;
            }
            param0 = param0 - (var4.field_b.length + -1);
        }
        return ((ce) this).field_d.length;
    }

    final static void a(ln param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ln var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_s) {
              L1: {
                L2: {
                  if (param0.field_i != 0) {
                    break L2;
                  } else {
                    if (param0.field_e != 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= qb.field_i) {
                    break L1;
                  } else {
                    L4: {
                      var3 = rj.field_J[var2_int];
                      if (2 != var3.field_f) {
                        break L4;
                      } else {
                        if (param0.field_i != var3.field_i) {
                          break L4;
                        } else {
                          if (param0.field_e == var3.field_e) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null == param0.field_o) {
                  break L5;
                } else {
                  break L5;
                }
              }
              ed.a(param0, false);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("ce.F(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 1 + 41);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        pm var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          if (null == ((ce) this).field_d) {
            break L0;
          } else {
            if (((ce) this).field_d.length == 0) {
              break L0;
            } else {
              if (((ce) this).field_d[0].field_i > param1) {
                break L0;
              } else {
                if (param1 > ((ce) this).field_d[-1 + ((ce) this).field_d.length].field_f) {
                  return -1;
                } else {
                  if (((ce) this).field_d.length != 1) {
                    var4 = 0;
                    if (param0 > 82) {
                      var5 = 0;
                      L1: while (true) {
                        if (((ce) this).field_d.length <= var5) {
                          return -1;
                        } else {
                          L2: {
                            var6 = ((ce) this).field_d[var5];
                            if (var6.field_i > param1) {
                              break L2;
                            } else {
                              if (var6.field_f >= param1) {
                                var7 = var6.a(param2, (byte) -125);
                                if (-1 != var7) {
                                  return var4 - -var7;
                                } else {
                                  return -1;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          var4 = var4 + (var6.field_b.length + -1);
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      return -76;
                    }
                  } else {
                    return ((ce) this).field_d[0].a(param2, (byte) -111);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param2 >= 1) {
              var5_int = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L1: while (true) {
                if (var7 <= var8) {
                  if (0 >= var5_int) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    stackOut_15_0 = (param1 + -param0 << 8) / var5_int;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                } else {
                  L2: {
                    var9 = param3.charAt(var8);
                    if (var9 == 60) {
                      var6 = 1;
                      break L2;
                    } else {
                      if (var9 != 62) {
                        L3: {
                          if (var6 != 0) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L1;
                      } else {
                        var6 = 0;
                        break L2;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -59;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("ce.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    final int a(int param0) {
        int var2 = 0;
        pm[] var3 = null;
        int var4 = 0;
        pm var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var2 = -1;
        if (param0 == 3915) {
          L0: {
            if (null != ((ce) this).field_d) {
              var3 = ((ce) this).field_d;
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a((byte) 127);
                    if (var6 > var2) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return -107;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        if (param0 != 6937) {
            ce.b(85);
        }
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = new int[]{100, 235, 340, 550};
    }
}
