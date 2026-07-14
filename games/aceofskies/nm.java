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
        int var2 = 0;
        int var3 = 0;
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
        DataInputStream var4 = new DataInputStream((InputStream) (Object) new BufferedInputStream((InputStream) (Object) new FileInputStream(param2)));
        if (param0 > -64) {
            nm.a(115);
        }
        try {
            if (false) throw (EOFException) null;
            var4.readFully(param3, 0, param1);
        } catch (EOFException eOFException) {
        }
        var4.close();
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > 39) {
            return;
        }
        nm.a(-14);
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (!param0) {
          var3 = -1 + (((nm) this).field_d.length >> -1954690687);
          var4 = param1 & var3;
          L0: while (true) {
            var5 = ((nm) this).field_d[var4 + (var4 + 1)];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (((nm) this).field_d[var4 + var4] == param1) {
                return var5;
              } else {
                var4 = 1 + var4 & var3;
                continue L0;
              }
            }
          }
        } else {
          field_c = (dl) null;
          var3 = -1 + (((nm) this).field_d.length >> -1954690687);
          var4 = param1 & var3;
          L1: while (true) {
            var5 = ((nm) this).field_d[var4 + (var4 + 1)];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (((nm) this).field_d[var4 + var4] == param1) {
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 1;
        L0: while (true) {
          if (var2 > (param0.length >> 1673096769) + param0.length) {
            ((nm) this).field_d = new int[var2 - -var2];
            var3 = 0;
            L1: while (true) {
              if (var2 - -var2 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (param0.length > var3) {
                    var4 = -1 + var2 & param0[var3];
                    L3: while (true) {
                      if ((((nm) this).field_d[1 + var4 + var4] ^ -1) == 0) {
                        ((nm) this).field_d[var4 - -var4] = param0[var3];
                        ((nm) this).field_d[1 + (var4 - -var4)] = var3;
                        var3++;
                        continue L2;
                      } else {
                        var4 = -1 + var2 & var4 - -1;
                        continue L3;
                      }
                    }
                  } else {
                  }
                }
              } else {
                ((nm) this).field_d[var3] = -1;
                var3++;
                continue L1;
              }
            }
          } else {
            var2 = var2 << 1;
            continue L0;
          }
        }
    }

    static {
    }
}
