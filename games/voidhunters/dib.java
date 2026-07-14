/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dib extends ev {
    private int field_i;
    private int field_g;
    private int field_f;
    static String field_j;
    private int field_h;

    final static void a(File param0, int param1, byte[] param2, byte param3) throws IOException {
        EOFException eOFException = null;
        DataInputStream var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = new DataInputStream((InputStream) (Object) new BufferedInputStream((InputStream) (Object) new FileInputStream(param0)));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4.readFully(param2, 0, param1);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    eOFException = (EOFException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (param3 != 119) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4.close();
                    return;
                }
                case 6: {
                    field_j = null;
                    var4.close();
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int var4 = 0;
        if (param0 <= 49) {
            Object var5 = null;
            tsa[] discarded$3 = dib.a((String) null, 68);
            if (param2 >= 256) {
                return param1;
            }
            if (!(-1 > (param2 ^ -1))) {
                return param3;
            }
            var4 = 256 + -param2;
            return (16711935 & var4 * (param3 & 16711935) - -(param2 * (16711935 & param1)) >>> 2083025192) + (-16711936 & ((-16711855 & param1) >>> 37992968) * param2 + ((param3 & -16711919) >>> 25640488) * var4);
        }
        if (param2 >= 256) {
            return param1;
        }
        if (!(-1 > (param2 ^ -1))) {
            return param3;
        }
        var4 = 256 + -param2;
        return (16711935 & var4 * (param3 & 16711935) - -(param2 * (16711935 & param1)) >>> 2083025192) + (-16711936 & ((-16711855 & param1) >>> 37992968) * param2 + ((param3 & -16711919) >>> 25640488) * var4);
    }

    dib(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        ((dib) this).field_g = param0;
        ((dib) this).field_i = param2;
        ((dib) this).field_f = param1;
        ((dib) this).field_h = param3;
    }

    final static tsa[] a(String param0, int param1) {
        ij var2 = null;
        tsa[] var3 = null;
        int var4 = 0;
        tsa var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param0.equals((Object) (Object) tkb.field_o)) {
          return neb.field_q;
        } else {
          var2 = ck.a(-1, param0);
          var3 = new tsa[var2.c(3)];
          var4 = 0;
          var5 = (tsa) (Object) var2.d(0);
          if (param1 >= 32) {
            L0: while (true) {
              if (var5 == null) {
                neb.field_q = var3;
                tkb.field_o = param0;
                return var3;
              } else {
                var4++;
                var3[var4] = var5;
                var5 = (tsa) (Object) var2.a((byte) 82);
                continue L0;
              }
            }
          } else {
            return null;
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param2 * ((dib) this).field_g >> -131278068;
        int var5 = ((dib) this).field_i * param2 >> -1375694164;
        int var6 = ((dib) this).field_f * param1 >> 159812396;
        int var8 = 62 % ((-48 - param0) / 40);
        int var7 = ((dib) this).field_h * param1 >> 535509932;
        pda.a(var7, var4, ((dib) this).field_d, var6, -2, var5, ((dib) this).field_a);
    }

    final void b(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param1 * ((dib) this).field_g >> 864555308;
        var5 = ((dib) this).field_i * param1 >> -456668532;
        if (param0 != -112) {
          int discarded$1 = dib.a((byte) 92, -127, 80, 107);
          var6 = param2 * ((dib) this).field_f >> 783961356;
          var7 = ((dib) this).field_h * param2 >> -1415387124;
          fcb.a(((dib) this).field_e, var7, var6, var4, var5, (byte) -117);
          return;
        } else {
          var6 = param2 * ((dib) this).field_f >> 783961356;
          var7 = ((dib) this).field_h * param2 >> -1415387124;
          fcb.a(((dib) this).field_e, var7, var6, var4, var5, (byte) -117);
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = ((dib) this).field_g * param2 >> -1259938868;
        if (param1 != 110) {
          field_j = null;
          var5 = ((dib) this).field_i * param2 >> 6262668;
          var6 = param0 * ((dib) this).field_f >> 1495800812;
          var7 = ((dib) this).field_h * param0 >> -628585908;
          kpa.a(((dib) this).field_a, var5, ((dib) this).field_e, var6, ((dib) this).field_d, var4, var7, 0);
          return;
        } else {
          var5 = ((dib) this).field_i * param2 >> 6262668;
          var6 = param0 * ((dib) this).field_f >> 1495800812;
          var7 = ((dib) this).field_h * param0 >> -628585908;
          kpa.a(((dib) this).field_a, var5, ((dib) this).field_e, var6, ((dib) this).field_d, var4, var7, 0);
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 93) {
          L0: {
            field_j = null;
            if (2 > param1) {
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
            if (2 > param1) {
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

    public static void a(byte param0) {
        field_j = null;
        if (param0 == 89) {
            return;
        }
        dib.a((byte) 40);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
