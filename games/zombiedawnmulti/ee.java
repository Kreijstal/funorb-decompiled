/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    static boolean field_b;
    static boolean field_a;

    final static String a(char param0, String param1, String param2, int param3) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param1.length();
              var6 = var4_int;
              var7 = var5 - 1;
              if (-1 == (var7 ^ -1)) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param2.indexOf((int) param0, var8_int);
                  if (-1 < (var8_int ^ -1)) {
                    break L1;
                  } else {
                    var8_int++;
                    var6 = var6 + var7;
                    if (var11 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  var10 = param2.indexOf((int) param0, var9);
                  if (-1 < (var10 ^ -1)) {
                    break L5;
                  } else {
                    discarded$6 = var8.append(param2.substring(var9, var10));
                    discarded$7 = var8.append(param1);
                    var9 = var10 - -1;
                    if (var11 != 0) {
                      break L4;
                    } else {
                      if (var11 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (param3 <= -36) {
                  discarded$8 = var8.append(param2.substring(var9));
                  break L4;
                } else {
                  stackOut_11_0 = (String) null;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              stackOut_14_0 = var8.toString();
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("ee.E(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_15_0;
        }
    }

    final static fc a(byte[] param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        fc stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        fc stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 90000;
            var3 = 10;
            var4 = 0;
            var5 = new byte[param0.length + 12];
            nn.a(-107, 0, var5, ql.a(param1, 0, param0));
            nn.a(-124, 1, var5, var4);
            nn.a(-101, 2, var5, var2_int);
            nn.a(-113, 3, var5, var3);
            var6 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6 >= param0.length / 4) {
                    break L3;
                  } else {
                    stackOut_3_0 = -115;
                    stackIn_7_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      nn.a(stackIn_4_0, 3 + var6, var5, ql.a(true, var6, param0));
                      var6++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_6_0 = -93;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              }
              stackOut_7_0 = nn.a(stackIn_7_0, var5);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("ee.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final static boolean a(boolean param0, boolean param1) {
        try {
            long dupTemp$2 = 0L;
            IOException var2 = null;
            ga var4 = null;
            ga var5 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_9_0 = 0;
            L0: {
              if (wp.field_g == null) {
                wp.field_g = ok.field_m.a(tm.field_c, jo.field_b, (byte) -120);
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 != (wp.field_g.field_f ^ -1)) {
              dupTemp$2 = bl.a((byte) 90);
              cf.field_g = dupTemp$2;
              mo.field_Gb = dupTemp$2;
              if (!param1) {
                if ((wp.field_g.field_f ^ -1) != -2) {
                  vo.field_l = sb.field_i;
                  wp.field_g = null;
                  return true;
                } else {
                  try {
                    L1: {
                      L2: {
                        ki.field_h = new ej((java.net.Socket) (wp.field_g.field_d), ok.field_m);
                        ma.field_a.field_j = 0;
                        var4 = s.field_e;
                        var5 = var4;
                        var5.field_j = 0;
                        if (!param0) {
                          stackOut_10_0 = -1;
                          stackIn_11_0 = stackOut_10_0;
                          break L2;
                        } else {
                          stackOut_9_0 = -2;
                          stackIn_11_0 = stackOut_9_0;
                          break L2;
                        }
                      }
                      k.field_k = stackIn_11_0;
                      jp.field_e = stackIn_11_0;
                      ij.field_d = stackIn_11_0;
                      vo.field_l = ud.field_cb;
                      mo.a(rp.field_q, ma.field_a, lo.field_b, dc.field_Hb, (byte) -124);
                      cb.a(-1, false);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (IOException) (Object) decompiledCaughtException;
                    vo.field_l = sb.field_i;
                    if (ZombieDawnMulti.field_E) {
                      vo.field_l = sb.field_i;
                      wp.field_g = null;
                      return true;
                    } else {
                      wp.field_g = null;
                      return true;
                    }
                  }
                  wp.field_g = null;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static lm a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
          if (19 == param0) {
            return null;
          } else {
            return (lm) ((Object) new od(param2, param1, param0));
          }
        } else {
          field_b = false;
          if (19 == param0) {
            return null;
          } else {
            return (lm) ((Object) new od(param2, param1, param0));
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, boolean param6, int param7, boolean param8, int param9, int param10, boolean param11, int param12, boolean param13) {
        ui.field_j = null;
        no.c((byte) 75);
        param8 = ih.a(param10, 4, param3, param2, param7, param8, param4);
        el.a(param9, param13, param12, 2, param8, param0, param6, param2, param5, param11);
        if (!param1) {
            ee.a(-102, true, -123, -91, -93, false, false, -65, false, 82, -99, true, 54, true);
        } else {
            bg.a(param12, (byte) 101, param6);
            ig.a((byte) -114, param12, param8, param7);
            return;
        }
        bg.a(param12, (byte) 101, param6);
        ig.a((byte) -114, param12, param8, param7);
    }

    static {
        field_b = false;
    }
}
