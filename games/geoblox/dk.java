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
        lk[] var7 = this.field_a;
        lk[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if ((var5.field_c.length ^ -1) < (param0 ^ -1)) {
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
        int var2;
        lk[] var3;
        int var4;
        lk var5;
        int var7;
        int var6;
        var7 = Geoblox.field_C;
        var2 = -1;
        if (param0 >= 60) {
          L0: {
            if (null != this.field_a) {
              var3 = this.field_a;
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
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_13_0 = param2 - param1 << -125164472;
                  stackIn_13_1 = var5_int;
                  stackIn_14_0 = stackIn_13_0 / stackIn_13_1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var10 = param3.charAt(var9);
                  if ((var10 ^ -1) != -61) {
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
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("dk.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_16_0;
        }
    }

    final static void a(byte param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            IOException var2 = null;
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
                  if (param0 < -65) {
                    break L2;
                  } else {
                    field_b = 18;
                    break L2;
                  }
                }
                L3: {
                  if (cl.field_c == null) {
                    break L3;
                  } else {
                    cl.field_c.a((byte) 51);
                    break L3;
                  }
                }
                L4: {
                  if (null == af.field_d) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        af.field_d.b(27034);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  }
                }
                L7: {
                  if (null == je.field_h) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (je.field_h.length <= var1_int) {
                        break L7;
                      } else {
                        if (null != je.field_h[var1_int]) {
                          try {
                            L9: {
                              je.field_h[var1_int].b(27034);
                              break L9;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L10: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L10;
                            }
                          }
                          var1_int++;
                          continue L8;
                        } else {
                          var1_int++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw t.a((Throwable) ((Object) var1), "dk.O(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
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
            if (null == this.field_a) {
              break L2;
            } else {
              if (-1 > (this.field_a.length ^ -1)) {
                stackIn_7_0 = this.field_a[this.field_a.length - 1].field_a + -this.field_a[0].field_d;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
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
        for (var3 = 0; this.field_a.length > var3; var3++) {
            var4 = this.field_a[var3];
            if (!(var4.field_c.length <= param1)) {
                return var3;
            }
            param1 = param1 - (var4.field_c.length - 1);
        }
        return this.field_a.length;
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        lk var7;
        int var8;
        int var9;
        L0: {
          var9 = Geoblox.field_C;
          if (null == this.field_a) {
            break L0;
          } else {
            if (this.field_a.length == 0) {
              break L0;
            } else {
              if (this.field_a[0].field_d > param2) {
                break L0;
              } else {
                if (this.field_a[-1 + this.field_a.length].field_a < param2) {
                  return -1;
                } else {
                  if (-2 != (this.field_a.length ^ -1)) {
                    var4 = 0;
                    var5 = -2 % ((15 - param1) / 32);
                    var6 = 0;
                    L1: while (true) {
                      if (var6 >= this.field_a.length) {
                        return -1;
                      } else {
                        L2: {
                          var7 = this.field_a[var6];
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
                    return this.field_a[0].a(71, param0);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        field_b = 0;
    }
}
