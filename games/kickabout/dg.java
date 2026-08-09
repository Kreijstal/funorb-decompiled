/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dg {
    static java.util.zip.CRC32 field_b;
    static String field_f;
    static boolean field_a;
    private ut[] field_d;
    static boolean field_e;
    static String field_c;

    void a(int param0, int param1, int param2, int param3, int param4) {
        ea.a(param2, param1, param0, (byte) 22, this.field_d, param3);
        if (param4 != 3) {
            up var7 = (up) null;
            dg.a((byte) -66, -25, -85, (up) null);
        }
    }

    final static void a(byte param0, int param1, int param2, up param3) {
        try {
            np.field_Jb.a(new rt(param2, param1, param3), 3);
            if (param0 != -120) {
                up var5 = (up) null;
                dg.a((byte) 119, -53, 107, (up) null);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(byte param0, int param1, long param2, boolean param3, int param4) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        String var7;
        String var8;
        String var9;
        StringBuilder var10;
        int var11;
        int var12_int;
        StringBuilder var12;
        int var13;
        StringBuilder var14;
        L0: {
          var13 = Kickabout.field_G;
          var14 = new StringBuilder(0);
          if (0L <= param2) {
            break L0;
          } else {
            discarded$0 = var14.append("-");
            param2 = -param2;
            break L0;
          }
        }
        L1: {
          var7 = ".";
          var8 = ",";
          if (-2 == (param4 ^ -1)) {
            var8 = ".";
            var7 = ",";
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (2 != param4) {
            break L2;
          } else {
            var8 = hp.field_a;
            var7 = ",";
            break L2;
          }
        }
        L3: {
          if (3 != param4) {
            break L3;
          } else {
            var8 = ".";
            var7 = var8;
            var9 = var7;
            var7 = var8;
            var7 = ",";
            break L3;
          }
        }
        L4: {
          if (param4 != 4) {
            break L4;
          } else {
            var7 = ",";
            var9 = var7;
            var9 = var7;
            var8 = ".";
            var9 = var8;
            var9 = var8;
            break L4;
          }
        }
        var10 = new StringBuilder(0);
        var11 = 0;
        L5: while (true) {
          if (param1 <= var11) {
            L6: {
              var12_int = 40 / ((param0 - -70) / 34);
              var11 = 0;
              if ((param2 ^ -1L) == -1L) {
                var9 = "0";
                break L6;
              } else {
                var12 = new StringBuilder(0);
                L7: while (true) {
                  if (-1L <= (param2 ^ -1L)) {
                    var9 = var12.toString();
                    break L6;
                  } else {
                    L8: {
                      if (!param3) {
                        break L8;
                      } else {
                        if (0 == var11) {
                          break L8;
                        } else {
                          if (var11 % 3 != 0) {
                            break L8;
                          } else {
                            discarded$1 = var12.append(var8);
                            break L8;
                          }
                        }
                      }
                    }
                    discarded$2 = var12.append(Integer.toString((int)(param2 % 10L)));
                    param2 = param2 / 10L;
                    var11++;
                    continue L7;
                  }
                }
              }
            }
            if (0 < var10.length()) {
              discarded$3 = var10.append(var7);
              return var14.toString() + bo.a(-1, var9) + bo.a(-1, var10.toString());
            } else {
              return var14.toString() + bo.a(-1, var9) + bo.a(-1, var10.toString());
            }
          } else {
            discarded$4 = var10.append(Integer.toString((int)(param2 % 10L)));
            param2 = param2 / 10L;
            var11++;
            continue L5;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 64 % ((-24 - param0) / 57);
        field_f = null;
    }

    static {
        field_f = "Please log in to access this feature.";
        field_e = true;
        field_a = true;
        field_b = new java.util.zip.CRC32();
    }
}
