/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class tc {
    static int[] field_d;
    private int field_c;
    int[] field_e;
    private int field_b;
    private boolean field_a;

    public static void a(boolean param0) {
        field_d = null;
    }

    final int a(byte param0) {
        if (param0 <= 86) {
            this.b(-74, -82);
            return ((tc) this).field_c + 1;
        }
        return ((tc) this).field_c + 1;
    }

    private final void b(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.a(param1, (byte) -41)];
        var3 = var4;
        if (param0 != 28083) {
          ((tc) this).field_b = -28;
          qn.a(((tc) this).field_e, 0, var4, 0, ((tc) this).field_e.length);
          ((tc) this).field_e = var4;
          return;
        } else {
          qn.a(((tc) this).field_e, 0, var4, 0, ((tc) this).field_e.length);
          ((tc) this).field_e = var4;
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 == 10499) {
          L0: {
            if (((tc) this).field_c < param2) {
              ((tc) this).field_c = param2;
              break L0;
            } else {
              break L0;
            }
          }
          if (param2 >= ((tc) this).field_e.length) {
            this.b(28083, param2);
            ((tc) this).field_e[param2] = param1;
            return;
          } else {
            ((tc) this).field_e[param2] = param1;
            return;
          }
        } else {
          L1: {
            this.b(115, -65);
            if (((tc) this).field_c < param2) {
              ((tc) this).field_c = param2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param2 < ((tc) this).field_e.length) {
            ((tc) this).field_e[param2] = param1;
            return;
          } else {
            this.b(28083, param2);
            ((tc) this).field_e[param2] = param1;
            return;
          }
        }
    }

    final void c(int param0, int param1) {
        if (param0 >= 0) {
          if (((tc) this).field_c >= param0) {
            if (param0 == ((tc) this).field_c) {
              if (param1 < 16) {
                int discarded$2 = ((tc) this).a(17, -11);
                ((tc) this).field_c = ((tc) this).field_c - 1;
                return;
              } else {
                ((tc) this).field_c = ((tc) this).field_c - 1;
                return;
              }
            } else {
              qn.a(((tc) this).field_e, param0 - -1, ((tc) this).field_e, param0, -param0 + ((tc) this).field_c);
              if (param1 < 16) {
                int discarded$3 = ((tc) this).a(17, -11);
                ((tc) this).field_c = ((tc) this).field_c - 1;
                return;
              } else {
                ((tc) this).field_c = ((tc) this).field_c - 1;
                return;
              }
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final void a(byte param0, int param1) {
        ((tc) this).a(10499, param1, ((tc) this).field_c - -1);
        if (param0 != -2) {
            field_d = null;
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        var3 = ((tc) this).field_e.length;
        L0: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (((tc) this).field_a) {
              if (var3 != 0) {
                var3 = var3 * ((tc) this).field_b;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            } else {
              var3 = var3 + ((tc) this).field_b;
              continue L0;
            }
          }
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 2229) {
            ((tc) this).field_a = false;
            if (!(param0 <= ((tc) this).field_c)) {
                throw new ArrayIndexOutOfBoundsException(param0);
            }
            return ((tc) this).field_e[param0];
        }
        if (!(param0 <= ((tc) this).field_c)) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return ((tc) this).field_e[param0];
    }

    tc(int param0, boolean param1) {
        ((tc) this).field_c = -1;
        ((tc) this).field_e = new int[]{};
        ((tc) this).field_a = false;
        ((tc) this).field_b = param0;
        ((tc) this).field_a = param1 ? true : false;
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            String var3 = null;
            Exception var3_ref = null;
            le var4 = null;
            DataInputStream var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            sj stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            sj stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            sj stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            String stackIn_15_5 = null;
            Throwable decompiledCaughtException = null;
            sj stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            sj stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            String stackOut_14_5 = null;
            sj stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            String stackOut_13_5 = null;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param0 != null) {
                    var3 = ee.a(5, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 != null) {
                    L3: {
                      if (param0 != null) {
                        var3 = var3 + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3 = var3 + param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ao.a(55, var3);
                var6 = dg.a(14, "%3a", var3, ":");
                var7 = dg.a(124, "%40", var6, "@");
                var8 = dg.a(123, "%26", var7, "&");
                var9 = dg.a(-61, "%23", var8, "#");
                if (null == gj.field_W) {
                  return;
                } else {
                  L4: {
                    stackOut_12_0 = wh.field_c;
                    stackOut_12_1 = null;
                    stackOut_12_2 = null;
                    stackOut_12_3 = gj.field_W.getCodeBase();
                    stackOut_12_4 = new StringBuilder().append("clienterror.ws?c=").append(ok.field_rb).append("&u=");
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    stackIn_14_4 = stackOut_12_4;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    if (ma.field_j == null) {
                      stackOut_14_0 = (sj) (Object) stackIn_14_0;
                      stackOut_14_1 = null;
                      stackOut_14_2 = null;
                      stackOut_14_3 = (java.net.URL) (Object) stackIn_14_3;
                      stackOut_14_4 = (StringBuilder) (Object) stackIn_14_4;
                      stackOut_14_5 = "" + hf.field_e;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      stackIn_15_3 = stackOut_14_3;
                      stackIn_15_4 = stackOut_14_4;
                      stackIn_15_5 = stackOut_14_5;
                      break L4;
                    } else {
                      stackOut_13_0 = (sj) (Object) stackIn_13_0;
                      stackOut_13_1 = null;
                      stackOut_13_2 = null;
                      stackOut_13_3 = (java.net.URL) (Object) stackIn_13_3;
                      stackOut_13_4 = (StringBuilder) (Object) stackIn_13_4;
                      stackOut_13_5 = ma.field_j;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_15_4 = stackOut_13_4;
                      stackIn_15_5 = stackOut_13_5;
                      break L4;
                    }
                  }
                  var4 = ((sj) (Object) stackIn_15_0).a(new java.net.URL(stackIn_15_3, stackIn_15_5 + "&v1=" + sj.field_o + "&v2=" + sj.field_t + "&e=" + var9), 1);
                  L5: while (true) {
                    if (var4.field_f != 0) {
                      L6: {
                        if (param2 == -8555) {
                          break L6;
                        } else {
                          field_d = null;
                          break L6;
                        }
                      }
                      L7: {
                        if (1 != var4.field_f) {
                          break L7;
                        } else {
                          var5 = (DataInputStream) var4.field_e;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L7;
                        }
                      }
                      break L0;
                    } else {
                      cf.a(-100, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                break L8;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
