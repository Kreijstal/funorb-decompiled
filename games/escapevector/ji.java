/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji {
    static cn field_c;
    static String field_a;
    static ca field_b;

    final static mf a(boolean param0, int param1, boolean param2, int param3, boolean param4, byte param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            hk var8 = null;
            mf stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            mf stackOut_16_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (null != ga.field_d.field_b) {
                    uc.field_h = new rg(ga.field_d.field_b, 5200, 0);
                    ga.field_d.field_b = null;
                    var6 = (Object) (Object) new jg(255, uc.field_h, new rg(ga.field_d.field_x, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param5 == 114) {
                    break L2;
                  } else {
                    field_a = null;
                    break L2;
                  }
                }
                L3: {
                  var7 = null;
                  if (uc.field_h != null) {
                    L4: {
                      if (bg.field_e != null) {
                        break L4;
                      } else {
                        bg.field_e = new rg[ga.field_d.field_u.length];
                        break L4;
                      }
                    }
                    L5: {
                      if (bg.field_e[param1] == null) {
                        bg.field_e[param1] = new rg(ga.field_d.field_u[param1], 12000, 0);
                        ga.field_d.field_u[param1] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7 = (Object) (Object) new jg(param1, uc.field_h, bg.field_e[param1], 2097152);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  var8 = af.field_e.a(param2, 255, (jg) var6, param1, (jg) var7);
                  if (param0) {
                    var8.b((byte) -49);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_16_0 = new mf((ob) (Object) var8, param4, param3);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_17_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 2097152) {
            field_a = null;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          L0: {
            field_a = null;
            if (bk.field_r != null) {
              bk.field_r.a((byte) 33);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (bk.field_r != null) {
              bk.field_r.a((byte) 33);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        if (null == bk.field_r) {
          if (!param0) {
            field_a = null;
            return;
          } else {
            return;
          }
        } else {
          bk.field_r.b(-1, param1);
          if (param0) {
            return;
          } else {
            field_a = null;
            return;
          }
        }
    }

    final static int a(int param0, ih param1, String[] param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = EscapeVector.field_A;
        int var7 = param3 + param5;
        for (var8 = param6; param4 > var8; var8++) {
            var9 = param2[var8];
            var10 = ic.a(var9, 16777215, param1);
            var7 = var7 + (var10 - -param0);
        }
        return var7;
    }

    final static int a(int param0, int param1, byte[] param2) {
        if (param0 != 255) {
            return 72;
        }
        return ae.a(param2, (byte) -95, param1, 0);
    }

    static {
    }
}
