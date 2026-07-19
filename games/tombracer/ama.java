/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ama extends lba {
    private byte[] field_t;

    final byte[] a(int param0, int param1, int param2, int param3) {
        this.field_t = new byte[2 * (param0 * param1 * param3)];
        if (param2 != 0) {
          this.a(true, (byte) 84, 122);
          this.a(param3, param0, param1, (byte) -90);
          return this.field_t;
        } else {
          this.a(param3, param0, param1, (byte) -90);
          return this.field_t;
        }
    }

    final static int a(il param0, String param1, int param2, int param3, String[] param4) {
        int discarded$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int stackIn_6_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 1) {
                break L1;
              } else {
                var14 = (String[]) null;
                discarded$4 = ama.a((il) null, (String) null, -117, -80, (String[]) null);
                break L1;
              }
            }
            L2: {
              var5_int = param0.b(param1);
              if (var5_int > param2) {
                break L2;
              } else {
                if (param1.indexOf("<br>") != -1) {
                  break L2;
                } else {
                  param4[0] = param1;
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (var5_int + (param2 + -1)) / param2;
            param2 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  L6: {
                    if (var8 <= var9) {
                      break L6;
                    } else {
                      var10 = param1.charAt(var9);
                      var16 = -33;
                      var15 = var10 ^ -1;
                      if (var13 != 0) {
                        if (var15 <= var16) {
                          break L4;
                        } else {
                          break L5;
                        }
                      } else {
                        L7: {
                          L8: {
                            if (var15 == var16) {
                              break L8;
                            } else {
                              if (45 == var10) {
                                break L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var11 = param1.substring(var7, 1 + var9).trim();
                          var12 = param0.b(var11);
                          if (param2 <= var12) {
                            incrementValue$5 = var6;
                            var6++;
                            param4[incrementValue$5] = var11;
                            var7 = 1 + var9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L9: {
                          if (var10 != 62) {
                            break L9;
                          } else {
                            if (param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
                              incrementValue$6 = var6;
                              var6++;
                              param4[incrementValue$6] = param1.substring(var7, -3 + var9).trim();
                              var7 = var9 - -1;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var9++;
                        if (var13 == 0) {
                          continue L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (var7 >= var8) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
                incrementValue$7 = var6;
                var6++;
                param4[incrementValue$7] = param1.substring(var7, var8).trim();
                break L4;
              }
              stackOut_26_0 = var6;
              stackIn_27_0 = stackOut_26_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("ama.K(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param4 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_27_0;
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        int incrementValue$2 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0) {
          return;
        } else {
          var4 = param2 * 2;
          var5 = param1 & 255;
          incrementValue$2 = var4;
          var4++;
          this.field_t[incrementValue$2] = (byte)(var5 * 3 >> -440280539);
          this.field_t[var4] = (byte)(3 * var5 >> 454976933);
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_11_0 = 0;
            int stackIn_13_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_10_0 = 0;
            if (vc.field_q.field_h >= param0) {
              return true;
            } else {
              if (oba.field_e == null) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = oba.field_e.c(param1 ^ -1);
                    if ((var2_int ^ -1) >= -1) {
                      if ((var2_int ^ -1) > param1) {
                        dea.a(60);
                        return false;
                      } else {
                        if (rf.b((byte) -121) <= 30000L) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          dea.a(60);
                          return false;
                        }
                      }
                    } else {
                      L1: {
                        if (var2_int <= -vc.field_q.field_h + param0) {
                          break L1;
                        } else {
                          var2_int = -vc.field_q.field_h + param0;
                          break L1;
                        }
                      }
                      oba.field_e.a(param1 + 1, vc.field_q.field_h, vc.field_q.field_g, var2_int);
                      ue.field_s = bva.b((byte) -107);
                      vc.field_q.field_h = vc.field_q.field_h + var2_int;
                      if (param0 <= vc.field_q.field_h) {
                        vc.field_q.field_h = 0;
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  dea.a(60);
                  return false;
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_11_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_13_0 != 0;
                  } else {
                    return false;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ama() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    static {
    }
}
