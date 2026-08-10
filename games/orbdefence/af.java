/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class af {
    private int[] field_a;

    final static void a(int param0) {
        try {
            int var1_int = 0;
            int var3 = OrbDefence.field_D ? 1 : 0;
            try {
                if (kg.field_h != null) {
                    kg.field_h.c(1);
                }
                if (wj.field_o != null) {
                    wj.field_o.a(-31973);
                }
                if (!(vg.field_q == null)) {
                    try {
                        vg.field_q.a((byte) -120);
                    } catch (IOException iOException) {
                    }
                }
                if (!(ok.field_a == null)) {
                    for (var1_int = 0; ok.field_a.length > var1_int; var1_int++) {
                        if (!(ok.field_a[var1_int] == null)) {
                            try {
                                ok.field_a[var1_int].a((byte) 63);
                            } catch (IOException var2_ref) {
                            }
                        }
                    }
                }
                var1_int = 91 % ((param0 - -74) / 37);
            } catch (RuntimeException runtimeException) {
                throw dd.a((Throwable) ((Object) runtimeException), "af.C(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    af(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > (param0.length >> 938764929) + param0.length) {
                this.field_a = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = var2_int - 1 & param0[var3];
                        L4: while (true) {
                          if ((this.field_a[var4 + var4 + 1] ^ -1) == 0) {
                            this.field_a[var4 + var4] = param0[var3];
                            this.field_a[1 + (var4 + var4)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & var4 - -1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_a[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("af.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static hj a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        hj var6 = new hj(param0, param0);
        hj var3 = var6;
        for (var4 = 0; var4 < var3.field_v.length; var4++) {
            var6.field_v[var4] = param2;
        }
        if (param1 > -21) {
            return (hj) null;
        }
        return var3;
    }

    final static boolean a(mg param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                af.a(true, (CharSequence) null, 82, -108);
                break L1;
              }
            }
            L2: {
              var2_int = param0.b((byte) 90);
              if (-2 != (var2_int ^ -1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("af.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final static int a(boolean param0, CharSequence param1, int param2, int param3) {
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (param3 > 36) {
                  break L1;
                } else {
                  var4_int = 76 % ((param2 - -75) / 35);
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;
                  var8 = param1.length();
                  var9 = 0;
                  L2: while (true) {
                    if (var8 <= var9) {
                      if (var6 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackIn_40_0 = var7;
                        break L0;
                      }
                    } else {
                      L3: {
                        L4: {
                          var10 = param1.charAt(var9);
                          if (var9 == 0) {
                            if (var10 != 45) {
                              if (var10 != 43) {
                                break L4;
                              } else {
                                if (!param0) {
                                  break L4;
                                } else {
                                  var9++;
                                  continue L2;
                                }
                              }
                            } else {
                              var5 = 1;
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (48 > var10) {
                              break L6;
                            } else {
                              if (var10 > 57) {
                                break L6;
                              } else {
                                var10 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var10 < 65) {
                              break L7;
                            } else {
                              if (90 >= var10) {
                                var10 -= 55;
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (97 > var10) {
                              break L8;
                            } else {
                              if (var10 > 122) {
                                break L8;
                              } else {
                                var10 -= 87;
                                break L5;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param3 <= var10) {
                          throw new NumberFormatException();
                        } else {
                          L9: {
                            if (var5 != 0) {
                              var10 = -var10;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var11 = var7 * param3 - -var10;
                          if (var7 == var11 / param3) {
                            var6 = 1;
                            var7 = var11;
                            break L3;
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("af.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L10;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_40_0;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        L0: {
          if (param1 < -56) {
            break L0;
          } else {
            af.a(63, (byte) -86, 25);
            break L0;
          }
        }
        var3 = (this.field_a.length >> -577030175) + -1;
        var4 = var3 & param0;
        L1: while (true) {
          var5 = this.field_a[var4 + var4 + 1];
          if (0 == (var5 ^ -1)) {
            return -1;
          } else {
            if (this.field_a[var4 - -var4] == param0) {
              return var5;
            } else {
              var4 = 1 + var4 & var3;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
