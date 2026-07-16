/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bo extends hc {
    static tb field_F;
    static int field_E;
    static String field_D;
    static int[] field_H;
    static byte[] field_G;

    final void a(int param0, int param1, int param2, int param3) {
        Object var6 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((bo) this).field_z) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((bo) this).field_z = stackIn_3_1 != 0;
        if (param0 != -19646) {
          var6 = null;
          bo.a((java.awt.Canvas) null, (byte) 126);
          super.a(param0 ^ 0, param1, param2, param3);
          return;
        } else {
          super.a(param0 ^ 0, param1, param2, param3);
          return;
        }
    }

    private bo(String param0, db param1, wn param2) {
        super(param0, param1, param2);
        ((bo) this).field_s = mb.field_g.field_k;
    }

    public static void a(byte param0) {
        field_H = null;
        field_F = null;
        field_D = null;
        if (param0 <= 17) {
            return;
        }
        field_G = null;
    }

    private bo(String param0, wn param1) {
        this(param0, mb.field_g.field_o, param1);
        ((bo) this).field_s = mb.field_g.field_k;
    }

    final static vj a(String param0, boolean param1, int param2, String param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var4 = 0L;
        if (param2 != 24564) {
          L0: {
            field_F = null;
            var6 = null;
            if (param0.indexOf('@') == -1) {
              var7 = (CharSequence) (Object) param0;
              var4 = vn.a((byte) 88, var7);
              break L0;
            } else {
              var6 = (Object) (Object) param0;
              break L0;
            }
          }
          return ei.a(0, param1, var4, (String) var6, param3);
        } else {
          L1: {
            var6 = null;
            if (param0.indexOf('@') == -1) {
              var8 = (CharSequence) (Object) param0;
              var4 = vn.a((byte) 88, var8);
              break L1;
            } else {
              var6 = (Object) (Object) param0;
              break L1;
            }
          }
          return ei.a(0, param1, var4, (String) var6, param3);
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        int var2 = 0;
        sc.a((byte) -58, (java.awt.Component) (Object) param0);
        var2 = 120 / ((param1 - 54) / 57);
        od.a((java.awt.Component) (Object) param0, (byte) 9);
        if (null != ji.field_b) {
          ji.field_b.a(-5070, (java.awt.Component) (Object) param0);
          return;
        } else {
          return;
        }
    }

    bo(String param0, wn param1, boolean param2) {
        this(param0, param1);
        ((bo) this).field_z = param2 ? true : false;
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_11_0 = 0;
            if (param0 == 30000) {
              if (param1 > om.field_g.field_m) {
                if (null != pg.field_c) {
                  try {
                    L0: {
                      var2_int = pg.field_c.b(-124);
                      if (-1 <= (var2_int ^ -1)) {
                        if (0 > var2_int) {
                          nm.a(16);
                          return false;
                        } else {
                          if (-30001L <= (un.e(param0 + 34655) ^ -1L)) {
                            break L0;
                          } else {
                            nm.a(16);
                            return false;
                          }
                        }
                      } else {
                        L1: {
                          if (var2_int > param1 + -om.field_g.field_m) {
                            var2_int = param1 - om.field_g.field_m;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        pg.field_c.a(om.field_g.field_m, var2_int, om.field_g.field_g, (byte) -49);
                        sl.field_a = td.b(128);
                        om.field_g.field_m = om.field_g.field_m + var2_int;
                        if (param1 <= om.field_g.field_m) {
                          om.field_g.field_m = 0;
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        } else {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        }
                      }
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (IOException) (Object) decompiledCaughtException;
                    nm.a(16);
                    return false;
                  }
                  return false;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = 1;
        field_D = "From Level";
        field_G = new byte[520];
    }
}
