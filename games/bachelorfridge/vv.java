/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vv {
    static mfa field_e;
    static String field_b;
    static int field_d;
    mla[] field_a;
    static kv[] field_c;

    final int b(byte param0) {
        int var2 = 0;
        mla[] var3 = null;
        int var4 = 0;
        mla var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          if (param0 > 122) {
            break L0;
          } else {
            int discarded$2 = ((vv) this).a(23, -13, 83);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (((vv) this).field_a != null) {
            var3 = ((vv) this).field_a;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(0);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final static int[] a(byte param0) {
        if (param0 <= 101) {
            field_c = null;
        }
        return new int[8];
    }

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 != 0) {
            vv.b(-114);
        }
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        mla var5 = null;
        int var6 = BachelorFridge.field_y;
        if (param1 != -99) {
            field_d = -66;
        }
        mla[] var7 = ((vv) this).field_a;
        mla[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(param0 >= var5.field_a.length)) {
                return var5.field_a[param0];
            }
            param0 = param0 - (var5.field_a.length - 1);
        }
        return 0;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                if (~var5_int < param0) {
                  stackOut_13_0 = (-param2 + param3 << 8) / var5_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  return 0;
                }
              } else {
                L2: {
                  var9 = param1.charAt(var8);
                  if (var9 != 60) {
                    if (var9 == 62) {
                      var6 = 0;
                      break L2;
                    } else {
                      L3: {
                        if (var6 != 0) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var8++;
                      continue L1;
                    }
                  } else {
                    var6 = 1;
                    break L2;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("vv.L(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_14_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        mla var4 = null;
        int var5 = BachelorFridge.field_y;
        if (param0 <= 53) {
            return 116;
        }
        for (var3 = 0; var3 < ((vv) this).field_a.length; var3++) {
            var4 = ((vv) this).field_a[var3];
            if (param1 < var4.field_a.length) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_a.length);
        }
        return ((vv) this).field_a.length;
    }

    final int a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            int discarded$2 = ((vv) this).a(42, (byte) 79);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((vv) this).field_a) {
              break L2;
            } else {
              if (((vv) this).field_a.length > 0) {
                stackOut_6_0 = -((vv) this).field_a[0].field_c + ((vv) this).field_a[-1 + ((vv) this).field_a.length].field_d;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        mla var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          if (param0 == -14017) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          if (null == ((vv) this).field_a) {
            break L1;
          } else {
            if (((vv) this).field_a.length == 0) {
              break L1;
            } else {
              if (((vv) this).field_a[0].field_c <= param1) {
                if (((vv) this).field_a[-1 + ((vv) this).field_a.length].field_d < param1) {
                  return -1;
                } else {
                  if (((vv) this).field_a.length != 1) {
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (((vv) this).field_a.length <= var5) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((vv) this).field_a[var5];
                          if (param1 < var6.field_c) {
                            break L3;
                          } else {
                            if (var6.field_d >= param1) {
                              var7 = var6.a(param2, 0);
                              if (-1 == var7) {
                                return -1;
                              } else {
                                return var7 + var4;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (var6.field_a.length + -1);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return ((vv) this).field_a[0].a(param2, 0);
                  }
                }
              } else {
                break L1;
              }
            }
          }
        }
        return -1;
    }

    final static sna a(int param0) {
        return qca.e(-117485887);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new mfa();
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
