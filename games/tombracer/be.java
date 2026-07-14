/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class be {
    static int field_c;
    String field_a;
    int field_b;

    abstract java.net.Socket a(int param0) throws IOException;

    final java.net.Socket a(byte param0) throws IOException {
        int var2 = -71 % ((param0 - 64) / 36);
        return new java.net.Socket(((be) this).field_a, ((be) this).field_b);
    }

    final static int a(String param0, int param1, da param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10, int param11) {
        if (param10 != 60) {
          field_c = 5;
          return param2.a((aa) null, param11, param4, 0, param7, fm.a(false, param9), (int[]) null, param6, fm.a(false, param3), param0, (byte) 88, param5, 0, (nh[]) null, param8, param1);
        } else {
          return param2.a((aa) null, param11, param4, 0, param7, fm.a(false, param9), (int[]) null, param6, fm.a(false, param3), param0, (byte) 88, param5, 0, (nh[]) null, param8, param1);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        if (param3 == param4) {
          iqa.a(30237, param5, param1, param0, param4);
          return;
        } else {
          if (-param4 + param0 < pka.field_b) {
            za.a(param0, param3, param4, param1, (byte) 115, param5);
            if (param2 == 71) {
              return;
            } else {
              be.a(59, -46, (byte) 78, 62, -53, 58);
              return;
            }
          } else {
            if (param0 + param4 > ss.field_c) {
              za.a(param0, param3, param4, param1, (byte) 115, param5);
              if (param2 != 71) {
                be.a(59, -46, (byte) 78, 62, -53, 58);
                return;
              } else {
                return;
              }
            } else {
              if (param5 + -param3 < gca.field_d) {
                za.a(param0, param3, param4, param1, (byte) 115, param5);
                if (param2 != 71) {
                  be.a(59, -46, (byte) 78, 62, -53, 58);
                  return;
                } else {
                  return;
                }
              } else {
                if (param3 + param5 > hc.field_h) {
                  za.a(param0, param3, param4, param1, (byte) 115, param5);
                  if (param2 != 71) {
                    be.a(59, -46, (byte) 78, 62, -53, 58);
                    return;
                  } else {
                    return;
                  }
                } else {
                  iea.a(param0, param4, param1, param5, 110, param3);
                  if (param2 == 71) {
                    return;
                  } else {
                    be.a(59, -46, (byte) 78, 62, -53, 58);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
