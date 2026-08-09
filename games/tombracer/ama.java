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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 1) {
                break L1;
              } else {
                var14 = (String[]) null;
                ama.a((il) null, (String) null, -117, -80, (String[]) null);
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
                  stackIn_6_0 = 1;
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
              if (var8 <= var9) {
                L4: {
                  if (var7 >= var8) {
                    break L4;
                  } else {
                    incrementValue$0 = var6;
                    var6++;
                    param4[incrementValue$0] = param1.substring(var7, var8).trim();
                    break L4;
                  }
                }
                stackIn_26_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param1.charAt(var9);
                    if ((var10 ^ -1) == -33) {
                      break L6;
                    } else {
                      if (45 == var10) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param1.substring(var7, 1 + var9).trim();
                  var12 = param0.b(var11);
                  if (param2 <= var12) {
                    incrementValue$1 = var6;
                    var6++;
                    param4[incrementValue$1] = var11;
                    var7 = 1 + var9;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (var10 != 62) {
                    break L7;
                  } else {
                    if (param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param4[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
                      var7 = var9 - -1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("ama.K(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_26_0;
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        int incrementValue$1 = 0;
        int var4;
        int var5;
        if (param0) {
          return;
        } else {
          var4 = param2 * 2;
          var5 = param1 & 255;
          incrementValue$1 = var4;
          var4++;
          this.field_t[incrementValue$1] = (byte)(var5 * 3 >> -440280539);
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
                        stackIn_13_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        stackIn_11_0 = 0;
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
