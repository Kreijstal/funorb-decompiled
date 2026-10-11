/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dg extends IOException {
    static boolean field_a;
    static boolean field_b;

    dg(String param0) {
        super(param0);
    }

    final static boolean a(byte param0, int param1) {
        boolean stackIn_25_0 = false;
        boolean stackIn_42_0 = false;
        boolean stackIn_62_0 = false;
        boolean stackIn_146_0 = false;
        boolean stackIn_157_0 = false;
        boolean stackIn_170_0 = false;
        boolean stackIn_181_0 = false;
        int var2;
        var2 = -126 % ((param0 + 41) / 46);
        if (bo.field_p[82]) {
          return false;
        }
        if (bo.field_p[86]) {
          return false;
        }
        if (16 <= param1) {
          if (27 >= param1) {
            return true;
          }
          if (32 > param1) {
            stackIn_42_0 = ((!(param1 < 48) &&
              !(param1 > 58)) ||
              (!(param1 < 64) &&
              !(param1 > 73)) ||
              (param1 == 80 ||
              83 == param1 ||
              param1 == 84 ||
              param1 == 85 ||
              59 == param1 ||
              74 == param1 ||
              28 == param1));
            return stackIn_42_0;
          }
          boolean decompiledFrameRemainder1 = true;
          if (param1 > 43 && ((param1 < 48 ||
            param1 > 58) &&
            (param1 < 64 ||
            param1 > 73)) && (param1 != 80 &&
            83 != param1 &&
            param1 != 84 &&
            param1 != 85 &&
            59 != param1 &&
            74 != param1 &&
            28 != param1)) {
            stackIn_25_0 = false;
            decompiledFrameRemainder1 = false;
          }
          else {
            stackIn_25_0 = true;
          }
          return stackIn_25_0;
        }
        if (32 <= param1) {
          if (param1 <= 43) {
            return true;
          }
          if (param1 >= 48) {
            if (param1 <= 58) {
              return true;
            }
            stackIn_62_0 = ((!(param1 < 64) &&
              !(param1 > 73)) ||
              (param1 == 80 ||
              83 == param1 ||
              param1 == 84 ||
              param1 == 85 ||
              59 == param1 ||
              74 == param1 ||
              28 == param1));
            return stackIn_62_0;
          }
          if (param1 < 64) {
            if (param1 == 80) {
              return true;
            }
            if (83 == param1) {
              return true;
            }
            if (param1 == 84) {
              return true;
            }
            if (param1 == 85) {
              return true;
            }
            if (59 == param1) {
              return true;
            }
            if (74 == param1) {
              return true;
            }
            if (28 == param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 73) {
            return true;
          }
          if (param1 == 80) {
            return true;
          }
          if (83 == param1) {
            return true;
          }
          if (param1 == 84) {
            return true;
          }
          if (param1 == 85) {
            return true;
          }
          if (59 == param1) {
            return true;
          }
          if (74 == param1) {
            return true;
          }
          if (28 != param1) {
            return false;
          }
          return true;
        }
        if (param1 < 48) {
          boolean decompiledFrameRemainder0 = true;
          if (param1 < 64) {
            if (param1 != 80 &&
              83 != param1 &&
              param1 != 84 &&
              param1 != 85 &&
              59 != param1 &&
              74 != param1) {
              if (28 == param1) {
                return true;
              }
              stackIn_181_0 = false;
              decompiledFrameRemainder0 = false;
            }
          } else {
            if (param1 > 73) {
              if (param1 != 80 &&
                83 != param1 &&
                param1 != 84 &&
                param1 != 85 &&
                59 != param1 &&
                74 != param1) {
                if (28 == param1) {
                  return true;
                }
                stackIn_170_0 = false;
              } else {
                stackIn_170_0 = true;
              }
              return stackIn_170_0;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_181_0 = true;
          }
          return stackIn_181_0;
        }
        if (param1 <= 58) {
          return true;
        }
        if (param1 < 64) {
          if (param1 != 80 &&
            83 != param1 &&
            param1 != 84 &&
            param1 != 85 &&
            59 != param1 &&
            74 != param1) {
            if (28 == param1) {
              return true;
            }
            stackIn_157_0 = false;
          } else {
            stackIn_157_0 = true;
          }
          return stackIn_157_0;
        }
        if (param1 <= 73) {
          return true;
        }
        if (param1 != 80 &&
          83 != param1 &&
          param1 != 84 &&
          param1 != 85 &&
          59 != param1 &&
          74 != param1) {
          if (28 == param1) {
            return true;
          }
          stackIn_146_0 = false;
        } else {
          stackIn_146_0 = true;
        }
        return stackIn_146_0;
    }

    final static boolean a(am param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_6_0 = (param0.k(111, 1) == 1);
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("dg.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = ZombieDawn.field_J;
        try {
          if (ld.field_j < 10) {
            var3_int = 0;
            if (nd.field_b) {
              nd.field_b = false;
              var3_int = 1;
            }
            ja.a(jb.a((byte) -58), ud.field_c, var3_int != 0, dp.a(param1 - 103), (byte) -90);
          } else {
            if (!kk.a(param1 ^ -251)) {
              bi.d();
              dp.a(320, -12138, 240);
              uh.a(40, 0, 0, param0);
            } else {
              if (fl.field_a == 0) {
                uo.a(false, -28518, param2);
                uh.a(param1 ^ -120, 0, 0, param0);
              } else {
                am.a(param0, (byte) -94);
              }
            }
          }
          if (param1 != 0) {
            field_b = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("dg.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(byte param0) {
        if (param0 != -120) {
          field_a = false;
          return nl.field_s;
        }
        return nl.field_s;
    }

    static {
        field_a = false;
    }
}
