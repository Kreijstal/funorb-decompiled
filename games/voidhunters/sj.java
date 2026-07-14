/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sj extends rqa {
    static int[] field_p;
    static int field_o;

    final static int a(int param0, int param1, Random param2, boolean param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        if (param4 == null) {
          return hob.a(param2, param1, 123);
        } else {
          if (param0 < -36) {
            L0: {
              var5 = 0;
              var6 = 2147483647;
              if (!param3) {
                break L0;
              } else {
                var6 = -2147483648;
                break L0;
              }
            }
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (var8 >= param1) {
                L2: {
                  if (1 < var7) {
                    var8 = hob.a(param2, var7, 123);
                    var9 = 0;
                    var10 = 0;
                    L3: while (true) {
                      if (param1 <= var10) {
                        break L2;
                      } else {
                        if (param4[var10] == var6) {
                          if (var9 != var8) {
                            var9++;
                            var10++;
                            continue L3;
                          } else {
                            return var10;
                          }
                        } else {
                          var10++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                return var5;
              } else {
                L4: {
                  L5: {
                    if (param3) {
                      break L5;
                    } else {
                      if (param4[var8] < var6) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (!param3) {
                      break L6;
                    } else {
                      if (var6 < param4[var8]) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var6 == param4[var8]) {
                    var7++;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                }
                var6 = param4[var8];
                var5 = var8;
                var7 = 1;
                var8++;
                continue L1;
              }
            }
          } else {
            return -67;
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        if (lob.field_a != null) {
            ukb.a(lob.field_a, (byte) 17);
        }
        if (cka.field_o != null) {
            cka.field_o.a(1, param0);
        }
        dba.a(79, param0);
        int var2 = 103 / ((16 - param1) / 32);
        if (null != crb.field_v) {
            crb.field_v.b(param0, -117);
        }
        ocb.a(param0, 124);
    }

    final nc a(nc[] param0, int param1) {
        si.a(29, 62, param0[0].a(88));
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    sj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_p = null;
    }

    static {
    }
}
