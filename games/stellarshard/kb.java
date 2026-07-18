/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb {
    static String field_e;
    private RandomAccessFile field_d;
    private long field_a;
    private long field_b;
    static String[] field_f;
    static String field_c;

    final void a(long param0, int param1) throws IOException {
        ((kb) this).field_d.seek(param0);
        if (param1 != 2205) {
            ((kb) this).field_a = -119L;
        }
        ((kb) this).field_a = param0;
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = stellarshard.field_B;
        try {
          L0: {
            de.a(0, 1, ta.field_q, fh.field_b, param0, true, oe.field_c);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= fh.field_b) {
                L2: {
                  de.a(param0, 1, af.field_k, fh.field_b + param0, param0 + param0, false, ce.field_b);
                  if (param0 < fh.field_b) {
                    fh.field_b = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                fj.field_b[param0 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "kb.H(" + param0 + ',' + 47 + ')');
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((kb) this).field_d.read(param2, param1, param0);
              if (var5_int <= 0) {
                break L1;
              } else {
                ((kb) this).field_a = ((kb) this).field_a + (long)var5_int;
                break L1;
              }
            }
            L2: {
              if (param3 == 1) {
                break L2;
              } else {
                kb.a(-29, -80);
                break L2;
              }
            }
            stackOut_4_0 = var5_int;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("kb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((kb) this).field_d)) {
            System.out.println("");
            ((kb) this).a(118);
        }
    }

    final void a(int param0) throws IOException {
        int var2 = -70 % ((49 - param0) / 40);
        if (((kb) this).field_d != null) {
            ((kb) this).field_d.close();
            ((kb) this).field_d = null;
        }
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        try {
            if (!(((kb) this).field_b >= ((kb) this).field_a + (long)param3)) {
                ((kb) this).field_d.seek(((kb) this).field_b);
                ((kb) this).field_d.write(1);
                throw new EOFException();
            }
            ((kb) this).field_d.write(param0, param2, param3);
            if (param1) {
                int discarded$0 = kb.b((byte) -71);
            }
            ((kb) this).field_a = ((kb) this).field_a + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "kb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int b(byte param0) {
        int var1 = -119 % ((11 - param0) / 34);
        return fl.field_a;
    }

    public static void a() {
        field_c = null;
        field_e = null;
        field_f = null;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = stellarshard.field_B;
          var2 = 0;
          var3 = ni.field_d;
          if (var3 >= 5) {
            if (var3 >= 105) {
              if (var3 < 120) {
                var3 = 120 - var3;
                var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
                break L0;
              } else {
                break L0;
              }
            } else {
              var2 = (-40960 + 16384 * var3) / 220;
              break L0;
            }
          } else {
            var2 = var3 * var3 * 8192 / 1100;
            break L0;
          }
        }
        L1: {
          var5 = 106 / ((param1 - -55) / 41);
          var4 = 1;
          var6 = 0;
          if (param0 != 3) {
            break L1;
          } else {
            var4 = -1;
            break L1;
          }
        }
        L2: {
          if (param0 == 1) {
            var6 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (4 == param0) {
            var6 = 1;
            var4 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 5) {
            var6 = 1;
            var4 = -1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (6 == param0) {
            var6 = -1;
            var4 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (7 == param0) {
              break L7;
            } else {
              if (param0 != 8) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          var6 = -1;
          var4 = -1;
          break L6;
        }
        L8: {
          if (11 != param0) {
            break L8;
          } else {
            var4 = -1;
            break L8;
          }
        }
        L9: {
          if (param0 == 12) {
            var6 = -1;
            var4 = -1;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (param0 == 13) {
            var6 = -1;
            var4 = 1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (param0 != 14) {
            break L11;
          } else {
            var6 = 1;
            var4 = -1;
            break L11;
          }
        }
        L12: {
          if (15 != param0) {
            break L12;
          } else {
            var4 = 1;
            var6 = 1;
            break L12;
          }
        }
        pd.field_u = nl.a(-119, var4 * var2, var6 * var2);
    }

    final long b(int param0) throws IOException {
        if (param0 != -106) {
            kb.a(50, 0);
        }
        return ((kb) this).field_d.length();
    }

    kb(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param0.length() < ~param2) {
                boolean discarded$0 = param0.delete();
            }
            ((kb) this).field_d = new RandomAccessFile(param0, param1);
            ((kb) this).field_a = 0L;
            ((kb) this).field_b = param2;
            var5_int = ((kb) this).field_d.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((kb) this).field_d.seek(0L);
                    ((kb) this).field_d.write(var5_int);
                }
            }
            ((kb) this).field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "kb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Connection restored.";
        field_f = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
