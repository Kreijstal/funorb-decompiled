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
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((mc) this).field_f.read(param1, param3, param0);
              if (~var5_int >= param2) {
                break L1;
              } else {
                ((mc) this).field_c = ((mc) this).field_c + (long)var5_int;
                break L1;
              }
            }
            stackOut_2_0 = var5_int;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("mc.G(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
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
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 > 0L) {
          if (param0 < 6582952005840035281L) {
            if (param0 % 37L == 0L) {
              return null;
            } else {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (param0 == 0L) {
                      StringBuilder discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7 = param0;
                        param0 = param0 / 37L;
                        var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                        if (var9 == 95) {
                          var10 = -1 + var6.length();
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          var9 = 160;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append((char) var9);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if (((mc) this).field_d < ((mc) this).field_c + (long)param2) {
            ((mc) this).field_f.seek(((mc) this).field_d);
            ((mc) this).field_f.write(1);
            throw new EOFException();
        }
        ((mc) this).field_f.write(param3, param1, param2);
        if (param0 <= 9) {
            return;
        }
        try {
            ((mc) this).field_c = ((mc) this).field_c + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mc.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
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
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((mc) this).field_f = new RandomAccessFile(param0, param1);
            ((mc) this).field_c = 0L;
            ((mc) this).field_d = param2;
            var5_int = ((mc) this).field_f.read();
            if (-1 != var5_int) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((mc) this).field_f.seek(0L);
                    ((mc) this).field_f.write(var5_int);
                }
            }
            ((mc) this).field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Try changing the following settings:  ";
        field_i = null;
    }
}
