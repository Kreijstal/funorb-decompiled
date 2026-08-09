/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nm {
    static int field_b;
    static dl field_c;
    static boolean field_a;
    private int[] field_d;

    final static char a(byte param0, int param1) {
        int var2;
        int var3;
        var2 = param0 & 255;
        if (param1 == 29337) {
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (128 <= var2) {
              if (var2 >= 160) {
                return (char)var2;
              } else {
                L0: {
                  var3 = te.field_e[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          }
        } else {
          field_b = 43;
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (128 > var2) {
              return (char)var2;
            } else {
              L1: {
                if (var2 < 160) {
                  L2: {
                    var3 = te.field_e[-128 + var2];
                    if (var3 == 0) {
                      var3 = 63;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var2 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (char)var2;
            }
          }
        }
    }

    final static void a(byte param0, int param1, File param2, byte[] param3) throws IOException {
        DataInputStream var4 = null;
        try {
            var4 = new DataInputStream((InputStream) ((Object) new BufferedInputStream((InputStream) ((Object) new FileInputStream(param2)))));
            if (param0 > -64) {
                nm.a(115);
            }
            try {
                var4.readFully(param3, 0, param1);
            } catch (EOFException eOFException) {
            }
            var4.close();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "nm.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > 39) {
            return;
        }
        nm.a(-14);
    }

    final int a(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        if (!param0) {
          var3 = -1 + (this.field_d.length >> -1954690687);
          var4 = param1 & var3;
          L0: while (true) {
            var5 = this.field_d[var4 + (var4 + 1)];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (this.field_d[var4 + var4] == param1) {
                return var5;
              } else {
                var4 = 1 + var4 & var3;
                continue L0;
              }
            }
          }
        } else {
          field_c = (dl) null;
          var3 = -1 + (this.field_d.length >> -1954690687);
          var4 = param1 & var3;
          L1: while (true) {
            var5 = this.field_d[var4 + (var4 + 1)];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (this.field_d[var4 + var4] == param1) {
                return var5;
              } else {
                var4 = 1 + var4 & var3;
                continue L1;
              }
            }
          }
        }
    }

    nm(int[] param0) {
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
              if (var2_int > (param0.length >> 1673096769) + param0.length) {
                this.field_d = new int[var2_int - -var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int - -var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = -1 + var2_int & param0[var3];
                        L4: while (true) {
                          if ((this.field_d[1 + var4 + var4] ^ -1) == 0) {
                            this.field_d[var4 - -var4] = param0[var3];
                            this.field_d[1 + (var4 - -var4)] = var3;
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
                    this.field_d[var3] = -1;
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

            stackIn_16_1 = new StringBuilder().append("nm.<init>(");

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
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
    }
}
