/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class fh {
    static nj field_c;
    static oi field_e;
    static byte[] field_a;
    static String field_d;
    static ja field_b;

    final static kk a(boolean param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            gd var8 = null;
            int var9 = 0;
            kk stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            kk stackOut_13_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (null != kb.field_d.field_t) {
                    sd.field_c = new il(kb.field_d.field_t, 5200, 0);
                    kb.field_d.field_t = null;
                    var6 = new hf(255, sd.field_c, new il(kb.field_d.field_v, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null != sd.field_c) {
                    L3: {
                      if (null != kh.field_e) {
                        break L3;
                      } else {
                        kh.field_e = new il[kb.field_d.field_q.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (kh.field_e[param1] != null) {
                        break L4;
                      } else {
                        kh.field_e[param1] = new il(kb.field_d.field_q[param1], 12000, 0);
                        kb.field_d.field_q[param1] = null;
                        break L4;
                      }
                    }
                    var7 = new hf(param1, sd.field_c, kh.field_e[param1], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  var8 = ij.field_d.a(103, param1, (hf) (var6), param3, (hf) (var7));
                  var9 = 71 % ((param5 - -49) / 56);
                  if (param2) {
                    var8.b(6054);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_13_0 = new kk(var8, param0, param4);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_14_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract byte[] b(byte param0);

    final static int a(int param0, int param1) {
        param1 = fj.b(param0 ^ -48, param1);
        if (!(-33 != (param1 ^ -1))) {
            return 38;
        }
        if (param0 == param1) {
            return 0;
        }
        if (!(param1 <= 32)) {
            return 64 | param1 + -26;
        }
        return param1 - 1 + 7;
    }

    abstract void a(byte[] param0, int param1);

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 < 122) {
            fh.a((byte) 65);
        }
    }

    final static boolean a(int param0) {
        if (param0 != 520) {
            field_e = (oi) null;
            if (!(-1 != hd.field_o)) {
                if (!(hf.a(1, false))) {
                    return false;
                }
                hd.field_o = ne.field_a.h(16383);
                ne.field_a.field_k = 0;
            }
            if (!(hd.field_o != -2)) {
                if (!(hf.a(2, false))) {
                    return false;
                }
                hd.field_o = ne.field_a.d((byte) -76);
                ne.field_a.field_k = 0;
            }
            return hf.a(hd.field_o, false);
        }
        if (!(-1 != hd.field_o)) {
            if (!(hf.a(1, false))) {
                return false;
            }
            hd.field_o = ne.field_a.h(16383);
            ne.field_a.field_k = 0;
        }
        if (!(hd.field_o != -2)) {
            if (!(hf.a(2, false))) {
                return false;
            }
            hd.field_o = ne.field_a.d((byte) -76);
            ne.field_a.field_k = 0;
        }
        return hf.a(hd.field_o, false);
    }

    static {
        field_a = new byte[520];
        field_e = new oi();
        field_d = "Change display name";
        field_b = new ja();
    }
}
