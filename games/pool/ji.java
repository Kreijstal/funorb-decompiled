/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ji {
    private byte field_a;
    static int field_d;
    private dk[] field_l;
    private short[] field_n;
    private byte field_c;
    static boolean field_f;
    private int[] field_k;
    private int field_j;
    static int field_g;
    private boolean field_e;
    private int[] field_i;
    private byte[] field_m;
    static na field_h;
    static int[] field_b;

    final void a(boolean param0, byte param1, int[] param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Pool.field_O;
          if (param1 > 56) {
            break L0;
          } else {
            ((ji) this).a((byte) -68);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (!((ji) this).field_e) {
                if (((ji) this).field_j <= var4) {
                  break L2;
                } else {
                  break L3;
                }
              } else {
                if (var4 >= ((ji) this).field_l.length) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            ((ji) this).field_l[var4].a(262144, param2);
            var4++;
            continue L1;
          }
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_h = null;
        if (param0) {
            di discarded$0 = ji.a(-2, true, (byte) 41, 72, false, false);
        }
    }

    final static di a(int param0, boolean param1, byte param2, int param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            up var8 = null;
            Object stackIn_5_0 = null;
            di stackIn_16_0 = null;
            Throwable decompiledCaughtException = null;
            di stackOut_15_0 = null;
            Object stackOut_4_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (null != fe.field_M.field_x) {
                    ih.field_a = new ir(fe.field_M.field_x, 5200, 0);
                    fe.field_M.field_x = null;
                    var6 = (Object) (Object) new np(255, ih.field_a, new ir(fe.field_M.field_e, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param2 == -56) {
                  L2: {
                    if (ih.field_a != null) {
                      L3: {
                        if (null != ia.field_d) {
                          break L3;
                        } else {
                          ia.field_d = new ir[fe.field_M.field_n.length];
                          break L3;
                        }
                      }
                      L4: {
                        if (null != ia.field_d[param3]) {
                          break L4;
                        } else {
                          ia.field_d[param3] = new ir(fe.field_M.field_n[param3], 12000, 0);
                          fe.field_M.field_n[param3] = null;
                          break L4;
                        }
                      }
                      var7 = (Object) (Object) new np(param3, ih.field_a, ia.field_d[param3], 2097152);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    var8 = nk.field_m.a(param4, (np) var7, param3, (byte) 0, (np) var6);
                    if (!param5) {
                      break L5;
                    } else {
                      var8.b(117);
                      break L5;
                    }
                  }
                  stackOut_15_0 = new di((lh) (Object) var8, param1, param0);
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_4_0 = null;
                  stackIn_5_0 = stackOut_4_0;
                  return (di) (Object) stackIn_5_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_16_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Pool.field_O;
          byte fieldTemp$1 = (byte)(((ji) this).field_a - 1);
          ((ji) this).field_a = (byte)(((ji) this).field_a - 1);
          if (-1 <= (fieldTemp$1 ^ -1)) {
            L1: {
              ((ji) this).field_l[((ji) this).field_j].field_c = false;
              ((ji) this).field_l[((ji) this).field_j].field_e = ((ji) this).field_k[0];
              ((ji) this).field_l[((ji) this).field_j].field_i = ((ji) this).field_i[0];
              ((ji) this).field_l[((ji) this).field_j].field_d = 0;
              ((ji) this).field_l[((ji) this).field_j].field_l = (short) 0;
              ((ji) this).field_m[((ji) this).field_j] = (byte) 0;
              ((ji) this).field_n[((ji) this).field_j] = (short)0;
              ((ji) this).field_j = (((ji) this).field_j + 1) % ((ji) this).field_l.length;
              if (-1 == (((ji) this).field_j ^ -1)) {
                ((ji) this).field_e = true;
                break L1;
              } else {
                break L1;
              }
            }
            ((ji) this).field_a = sl.field_Y[((ji) this).field_c];
            ((ji) this).field_c = (byte)((((ji) this).field_c + 1) % sl.field_Y.length);
            break L0;
          } else {
            break L0;
          }
        }
        var2 = 0;
        L2: while (true) {
          if ((var2 ^ -1) <= (((ji) this).field_l.length ^ -1)) {
            L3: {
              if (param0 == -43) {
                break L3;
              } else {
                ((ji) this).field_j = -58;
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (!((ji) this).field_l[var2].field_c) {
                L5: {
                  var3 = ((ji) this).field_m[var2];
                  if ((var3 ^ -1) == -1) {
                    ((ji) this).field_n[var2] = (short)(((ji) this).field_n[var2] + 17);
                    break L5;
                  } else {
                    if (-2 == (var3 ^ -1)) {
                      ((ji) this).field_n[var2] = (short)(((ji) this).field_n[var2] + 91);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if ((((ji) this).field_n[var2] ^ -1) > -4097) {
                    break L6;
                  } else {
                    ((ji) this).field_n[var2] = (short)0;
                    ((ji) this).field_m[var2] = (byte)(((ji) this).field_m[var2] + 1);
                    break L6;
                  }
                }
                if (((ji) this).field_k.length + -1 > ((ji) this).field_m[var2]) {
                  var3 = ((ji) this).field_n[var2] * ((ji) this).field_n[var2] / 4096;
                  var4 = -var3 + 4096;
                  ((ji) this).field_l[var2].a(var4 * ((ji) this).field_k[((ji) this).field_m[var2]] + ((ji) this).field_k[((ji) this).field_m[var2] - -1] * var3 >> -426719924, (byte) 78, var4 * ((ji) this).field_i[((ji) this).field_m[var2]] + ((ji) this).field_i[1 + ((ji) this).field_m[var2]] * var3 >> 1762250892);
                  break L4;
                } else {
                  ((ji) this).field_l[var2].field_c = true;
                  ((ji) this).field_l[var2].field_b = (short)(((ji) this).field_l[var2].field_b + (ga.a(17, true, ea.field_r) - 8));
                  ((ji) this).field_l[var2].field_k = (short)(((ji) this).field_l[var2].field_k + (-8 + ga.a(17, true, ea.field_r)));
                  break L4;
                }
              } else {
                ((ji) this).field_l[var2].field_l = (short)(((ji) this).field_l[var2].field_l + 1);
                ((ji) this).field_l[var2].field_e = ((ji) this).field_l[var2].field_e + ((ji) this).field_l[var2].field_b;
                ((ji) this).field_l[var2].field_i = ((ji) this).field_l[var2].field_i + ((ji) this).field_l[var2].field_k;
                ((ji) this).field_l[var2].field_d = ((ji) this).field_l[var2].field_d + ((ji) this).field_l[var2].field_l;
                break L4;
              }
            }
            var2++;
            continue L2;
          }
        }
    }

    ji(int[] param0) {
        int var3 = 0;
        ((ji) this).field_e = false;
        ((ji) this).field_c = (byte) 0;
        ((ji) this).field_k = new int[param0.length / 2];
        ((ji) this).field_i = new int[param0.length / 2];
        int var2 = 0;
        for (var3 = 0; ((ji) this).field_k.length > var3; var3++) {
            int incrementValue$0 = var2;
            var2++;
            ((ji) this).field_k[var3] = param0[incrementValue$0];
            int incrementValue$1 = var2;
            var2++;
            ((ji) this).field_i[var3] = param0[incrementValue$1];
        }
        ((ji) this).field_l = new dk[256];
        ((ji) this).field_m = new byte[((ji) this).field_l.length];
        ((ji) this).field_n = new short[((ji) this).field_l.length];
        int var5 = 0;
        var3 = var5;
        while (((ji) this).field_l.length > var5) {
            ((ji) this).field_l[var5] = new dk(((ji) this).field_k[0], ((ji) this).field_i[0]);
            ((ji) this).field_m[var5] = (byte) 0;
            ((ji) this).field_n[var5] = (short)0;
            var5++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 250;
        field_f = false;
        field_h = new na();
        field_b = new int[16];
    }
}
