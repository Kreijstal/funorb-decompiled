/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mc {
    static v field_b;
    static int field_a;
    static String field_e;
    static Random field_c;
    static String field_d;

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        jc var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var10 = new jc(param0);
          if (param1 > 110) {
            break L0;
          } else {
            var9 = null;
            byte[] discarded$6 = mc.a((byte[]) null, 98);
            break L0;
          }
        }
        L1: {
          var3 = var10.g(11132);
          var4 = var10.d((byte) 93);
          if (0 > var4) {
            break L1;
          } else {
            L2: {
              if (on.field_c == 0) {
                break L2;
              } else {
                if (var4 > on.field_c) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (0 != var3) {
              L3: {
                var5 = var10.d((byte) 123);
                if ((var5 ^ -1) > -1) {
                  break L3;
                } else {
                  L4: {
                    if (on.field_c == 0) {
                      break L4;
                    } else {
                      if (on.field_c < var5) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var18 = new byte[var5];
                  var16 = var18;
                  var14 = var16;
                  var12 = var14;
                  var6 = var12;
                  if ((var3 ^ -1) != -2) {
                    var7 = (Object) (Object) te.field_b;
                    synchronized (var7) {
                      L5: {
                        te.field_b.a((byte) 50, var18, var10);
                        break L5;
                      }
                    }
                    return var6;
                  } else {
                    int discarded$7 = bb.a(var18, var5, param0, var4, 9);
                    return var6;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              var17 = new byte[var4];
              var15 = var17;
              var13 = var15;
              var11 = var13;
              var5_ref_byte__ = var11;
              var10.a(0, var4, true, var17);
              return var5_ref_byte__;
            }
          }
        }
        throw new RuntimeException();
    }

    final static boolean a(int param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (param2) {
          L0: {
            field_c = null;
            if (ag.c(-117)) {
              L1: {
                hd.a(param0, (byte) -116, param6, param1);
                if (md.field_e == null) {
                  break L1;
                } else {
                  if (!md.field_e.a(param3, param5, param0, param1, (byte) 95)) {
                    break L1;
                  } else {
                    ch.a(true);
                    param1 = false;
                    break L1;
                  }
                }
              }
              qg.a(7377, param1, param0);
              te.a(param1, -121, param4);
              param1 = false;
              break L0;
            } else {
              break L0;
            }
          }
          return param1;
        } else {
          L2: {
            if (ag.c(-117)) {
              L3: {
                hd.a(param0, (byte) -116, param6, param1);
                if (md.field_e == null) {
                  break L3;
                } else {
                  if (!md.field_e.a(param3, param5, param0, param1, (byte) 95)) {
                    break L3;
                  } else {
                    ch.a(true);
                    param1 = false;
                    break L3;
                  }
                }
              }
              qg.a(7377, param1, param0);
              te.a(param1, -121, param4);
              param1 = false;
              break L2;
            } else {
              break L2;
            }
          }
          return param1;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
          boolean discarded$2 = mc.a(44, true, false, -98, 124, 89, 122);
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_e = "<%0> has lost connection.";
        field_c = new Random();
        field_d = "Rotate camera left";
    }
}
