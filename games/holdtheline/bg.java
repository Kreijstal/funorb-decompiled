/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bg {
    private long field_b;
    private RandomAccessFile field_a;
    static int field_f;
    static int field_g;
    static int field_c;
    private long field_e;
    static nd field_d;

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 5) {
          L0: {
            field_c = -41;
            if ((-param1 & param1) != param1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((-param1 & param1) != param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (((long)param0 + ((bg) this).field_b ^ -1L) < (((bg) this).field_e ^ -1L)) {
          ((bg) this).field_a.seek(((bg) this).field_e);
          ((bg) this).field_a.write(1);
          throw new EOFException();
        } else {
          ((bg) this).field_a.write(param1, param2, param0);
          if (param3 != -17174) {
            ((bg) this).field_a = null;
            ((bg) this).field_b = ((bg) this).field_b + (long)param0;
            return;
          } else {
            ((bg) this).field_b = ((bg) this).field_b + (long)param0;
            return;
          }
        }
    }

    final void a(byte param0, long param1) throws IOException {
        ((bg) this).field_a.seek(param1);
        if (param0 <= 29) {
            field_f = 20;
            ((bg) this).field_b = param1;
            return;
        }
        ((bg) this).field_b = param1;
    }

    final void a(byte param0) throws IOException {
        L0: {
          if (((bg) this).field_a != null) {
            ((bg) this).field_a.close();
            ((bg) this).field_a = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 20) {
          boolean discarded$2 = bg.a(105, 68);
          return;
        } else {
          return;
        }
    }

    final static hb a(int param0, String[] param1) {
        hb var2 = null;
        int var3 = 0;
        hb var4 = null;
        hb var5 = null;
        L0: {
          var3 = HoldTheLine.field_D;
          var4 = new hb();
          var5 = var4;
          var2 = var5;
          if (!param1[param0].equalsIgnoreCase("return")) {
            break L0;
          } else {
            if (-2 != (param1.length ^ -1)) {
              throw new IllegalArgumentException();
            } else {
              var4.field_d = 0;
              break L0;
            }
          }
        }
        if (!param1[0].equalsIgnoreCase("activate")) {
          if (!param1[0].equalsIgnoreCase("powerups")) {
            if (!param1[0].equalsIgnoreCase("superpowertype")) {
              if (!param1[0].equalsIgnoreCase("laps")) {
                if (param1[0].equalsIgnoreCase("pos")) {
                  if ((param1.length ^ -1) != -5) {
                    throw new IllegalArgumentException();
                  } else {
                    var2.field_d = 9;
                    var2.field_c = mo.a((CharSequence) (Object) param1[1], (byte) -116);
                    var2.field_b = ka.a(5, param1[2]);
                    var2.field_e = mo.a((CharSequence) (Object) param1[3], (byte) -116);
                    return var2;
                  }
                } else {
                  if (param1[0].equalsIgnoreCase("playerzone")) {
                    if ((param1.length ^ -1) != -4) {
                      throw new IllegalArgumentException();
                    } else {
                      var2.field_d = 2;
                      var2.field_c = ka.a(5, param1[1]);
                      var2.field_b = mo.a((CharSequence) (Object) param1[2], (byte) -116);
                      return var2;
                    }
                  } else {
                    if (!param1[0].equalsIgnoreCase("missilehit")) {
                      if (!param1[0].equalsIgnoreCase("missilemiss")) {
                        if (param1[0].equalsIgnoreCase("racecomplete")) {
                          if (-2 != (param1.length ^ -1)) {
                            throw new IllegalArgumentException();
                          } else {
                            var2.field_d = 8;
                            return var2;
                          }
                        } else {
                          return var2;
                        }
                      } else {
                        if (1 != param1.length) {
                          throw new IllegalArgumentException();
                        } else {
                          var2.field_d = 7;
                          return var2;
                        }
                      }
                    } else {
                      if (-2 != (param1.length ^ -1)) {
                        throw new IllegalArgumentException();
                      } else {
                        var2.field_d = 6;
                        return var2;
                      }
                    }
                  }
                }
              } else {
                if (4 != param1.length) {
                  throw new IllegalArgumentException();
                } else {
                  var2.field_d = 5;
                  var2.field_c = mo.a((CharSequence) (Object) param1[1], (byte) -116);
                  var2.field_b = ka.a(param0 ^ 5, param1[2]);
                  var2.field_e = mo.a((CharSequence) (Object) param1[3], (byte) -116);
                  return var2;
                }
              }
            } else {
              if ((param1.length ^ -1) == -4) {
                var4.field_d = 4;
                var4.field_c = mo.a((CharSequence) (Object) param1[1], (byte) -116);
                if (param1[2].equalsIgnoreCase("none")) {
                  var5.field_b = -1;
                  return var2;
                } else {
                  var2.field_b = vh.a(114, param1[2]);
                  return var2;
                }
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            if ((param1.length ^ -1) != -5) {
              throw new IllegalArgumentException();
            } else {
              var4.field_d = 3;
              var4.field_c = vh.a(122, param1[1]);
              var4.field_b = ka.a(param0 ^ 5, param1[2]);
              var4.field_e = mo.a((CharSequence) (Object) param1[3], (byte) -116);
              return var2;
            }
          }
        } else {
          if (-2 != (param1.length ^ -1)) {
            throw new IllegalArgumentException();
          } else {
            var5.field_d = 1;
            return var2;
          }
        }
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
            return 66L;
        }
        return ((bg) this).field_a.length();
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_c = -44;
            field_d = null;
            return;
        }
        field_d = null;
    }

    protected final void finalize() throws Throwable {
        if (null != ((bg) this).field_a) {
            System.out.println("");
            ((bg) this).a((byte) 20);
        }
    }

    final int b(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = 0;
        if (param3 != 11812) {
          return -58;
        } else {
          L0: {
            var5 = ((bg) this).field_a.read(param1, param0, param2);
            if ((var5 ^ -1) < -1) {
              ((bg) this).field_b = ((bg) this).field_b + (long)var5;
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        }
    }

    bg(File param0, String param1, long param2) throws IOException {
        if ((param2 ^ -1L) == 0L) {
            param2 = 9223372036854775807L;
        }
        if (param2 < param0.length()) {
            boolean discarded$0 = param0.delete();
        }
        ((bg) this).field_a = new RandomAccessFile(param0, param1);
        ((bg) this).field_e = param2;
        ((bg) this).field_b = 0L;
        int var5 = ((bg) this).field_a.read();
        if (0 != (var5 ^ -1)) {
            // ifne L110
            ((bg) this).field_a.seek(0L);
            ((bg) this).field_a.write(var5);
        } else {
            ((bg) this).field_a.seek(0L);
            ((bg) this).field_a.seek(0L);
        }
        ((bg) this).field_a.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        td.a(50, 14195);
    }
}
