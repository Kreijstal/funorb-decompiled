/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class dk {
    static int field_b;
    static int field_c;
    lk[] field_a;

    final int a(int param0, int param1) {
        int var4 = 0;
        lk var5 = null;
        int var6 = Geoblox.field_C;
        lk[] var7 = ((dk) this).field_a;
        lk[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_c.length > param0) {
                return var5.field_c[param0];
            }
            param0 = param0 - (var5.field_c.length - 1);
        }
        if (param1 <= 109) {
            return 67;
        }
        return 0;
    }

    final int a(int param0) {
        int var2 = 0;
        lk[] var3 = null;
        int var4 = 0;
        lk var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Geoblox.field_C;
        var2 = -1;
        if (param0 >= 60) {
          L0: {
            if (null != ((dk) this).field_a) {
              var3 = ((dk) this).field_a;
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a(0);
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
          return 19;
        }
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = Geoblox.field_C;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 20 / ((-30 - param0) / 56);
            var9 = 0;
            L1: while (true) {
              if (var9 >= var7) {
                if (var5_int <= 0) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_12_0 = (param2 - param1 << 8) / var5_int;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              } else {
                L2: {
                  var10 = param3.charAt(var9);
                  if (var10 != 60) {
                    if (var10 != 62) {
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (32 != var10) {
                          break L2;
                        } else {
                          var5_int++;
                          break L2;
                        }
                      }
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  } else {
                    var6 = 1;
                    break L2;
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("dk.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0;
    }

    final static void a(byte param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = Geoblox.field_C;
            try {
              L0: {
                L1: {
                  if (null == wg.field_i) {
                    break L1;
                  } else {
                    wg.field_i.h(-70);
                    break L1;
                  }
                }
                L2: {
                  if (cl.field_c == null) {
                    break L2;
                  } else {
                    cl.field_c.a((byte) 51);
                    break L2;
                  }
                }
                L3: {
                  if (null == af.field_d) {
                    break L3;
                  } else {
                    {
                      L4: {
                        af.field_d.b(27034);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (null == je.field_h) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (je.field_h.length <= var1_int) {
                        break L6;
                      } else {
                        L8: {
                          if (null == je.field_h[var1_int]) {
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw t.a((Throwable) (Object) var1, "dk.O(" + -121 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -3111) {
            break L0;
          } else {
            field_b = 49;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((dk) this).field_a) {
              break L2;
            } else {
              if (((dk) this).field_a.length > 0) {
                stackOut_6_0 = ((dk) this).field_a[((dk) this).field_a.length - 1].field_a + -((dk) this).field_a[0].field_d;
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

    final int a(byte param0, int param1) {
        int var3 = 0;
        lk var4 = null;
        int var5 = Geoblox.field_C;
        if (param0 != 24) {
            return -10;
        }
        for (var3 = 0; ((dk) this).field_a.length > var3; var3++) {
            var4 = ((dk) this).field_a[var3];
            if (!(var4.field_c.length <= param1)) {
                return var3;
            }
            param1 = param1 - (var4.field_c.length - 1);
        }
        return ((dk) this).field_a.length;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        lk var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Geoblox.field_C;
          if (null == ((dk) this).field_a) {
            break L0;
          } else {
            if (((dk) this).field_a.length == 0) {
              break L0;
            } else {
              if (((dk) this).field_a[0].field_d > param2) {
                break L0;
              } else {
                if (((dk) this).field_a[-1 + ((dk) this).field_a.length].field_a < param2) {
                  return -1;
                } else {
                  if (((dk) this).field_a.length != 1) {
                    var4 = 0;
                    var5 = -2 % ((15 - param1) / 32);
                    var6 = 0;
                    L1: while (true) {
                      if (var6 >= ((dk) this).field_a.length) {
                        return -1;
                      } else {
                        L2: {
                          var7 = ((dk) this).field_a[var6];
                          if (param2 < var7.field_d) {
                            break L2;
                          } else {
                            if (var7.field_a < param2) {
                              break L2;
                            } else {
                              var8 = var7.a(-79, param0);
                              if (-1 != var8) {
                                return var4 + var8;
                              } else {
                                return -1;
                              }
                            }
                          }
                        }
                        var4 = var4 + (var7.field_c.length - 1);
                        var6++;
                        continue L1;
                      }
                    }
                  } else {
                    return ((dk) this).field_a[0].a(71, param0);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
