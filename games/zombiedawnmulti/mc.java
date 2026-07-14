/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mc {
    static vg field_i;
    private long field_c;
    static pd field_a;
    static ri[] field_h;
    static String field_g;
    static String field_b;
    static int field_e;
    private long field_d;
    private RandomAccessFile field_f;

    final void a(byte param0, long param1) throws IOException {
        ((mc) this).field_f.seek(param1);
        ((mc) this).field_c = param1;
        if (param0 >= -123) {
            ((mc) this).field_c = -76L;
            return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        field_a = null;
        if (param0 <= 81) {
          mc.a((byte) -64);
          field_g = null;
          field_b = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          return;
        }
    }

    final int a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = 0;
        var5 = ((mc) this).field_f.read(param1, param3, param0);
        if ((var5 ^ -1) < param2) {
          ((mc) this).field_c = ((mc) this).field_c + (long)var5;
          return var5;
        } else {
          return var5;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(((mc) this).field_f == null)) {
            System.out.println("");
            ((mc) this).b((byte) 38);
        }
    }

    final static String a(long param0, byte param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        if (-1L > (param0 ^ -1L)) {
          if (-6582952005840035282L < (param0 ^ -1L)) {
            if (-1L != (param0 % 37L ^ -1L)) {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if ((var4 ^ -1L) == -1L) {
                  if (param1 == 26) {
                    var12 = new StringBuilder(var3);
                    L1: while (true) {
                      if (param0 == 0L) {
                        StringBuilder discarded$4 = var12.reverse();
                        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
                        return var12.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                          if (var9 == 95) {
                            var10 = -1 + var12.length();
                            var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
                            var9 = 160;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        StringBuilder discarded$5 = var12.append(var9);
                        continue L1;
                      }
                    }
                  } else {
                    mc.a((byte) 85);
                    var13 = new StringBuilder(var3);
                    var6 = var13;
                    L3: while (true) {
                      if (param0 == 0L) {
                        StringBuilder discarded$6 = var13.reverse();
                        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                        return var13.toString();
                      } else {
                        L4: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                          if (var9 == 95) {
                            var10 = -1 + var13.length();
                            var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                            var9 = 160;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        StringBuilder discarded$7 = var13.append(var9);
                        continue L3;
                      }
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if (((mc) this).field_d >= ((mc) this).field_c + (long)param2) {
          ((mc) this).field_f.write(param3, param1, param2);
          if (param0 <= 9) {
            return;
          } else {
            ((mc) this).field_c = ((mc) this).field_c + (long)param2;
            return;
          }
        } else {
          ((mc) this).field_f.seek(((mc) this).field_d);
          ((mc) this).field_f.write(1);
          throw new EOFException();
        }
    }

    final long a(int param0) throws IOException {
        if (param0 > -97) {
            field_e = 20;
            return ((mc) this).field_f.length();
        }
        return ((mc) this).field_f.length();
    }

    final void b(byte param0) throws IOException {
        if (param0 == 38) {
          if (null != ((mc) this).field_f) {
            ((mc) this).field_f.close();
            ((mc) this).field_f = null;
            return;
          } else {
            return;
          }
        } else {
          field_i = null;
          if (null == ((mc) this).field_f) {
            return;
          } else {
            ((mc) this).field_f.close();
            ((mc) this).field_f = null;
            return;
          }
        }
    }

    mc(File param0, String param1, long param2) throws IOException {
        if (0L == (param2 ^ -1L)) {
            param2 = 9223372036854775807L;
        }
        if (param2 < param0.length()) {
            boolean discarded$0 = param0.delete();
        }
        ((mc) this).field_f = new RandomAccessFile(param0, param1);
        ((mc) this).field_c = 0L;
        ((mc) this).field_d = param2;
        int var5 = ((mc) this).field_f.read();
        if (-1 != var5) {
            // ifne L108
            ((mc) this).field_f.seek(0L);
            ((mc) this).field_f.write(var5);
        } else {
            ((mc) this).field_f.seek(0L);
            ((mc) this).field_f.seek(0L);
        }
        ((mc) this).field_f.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Try changing the following settings:  ";
        field_i = null;
    }
}
