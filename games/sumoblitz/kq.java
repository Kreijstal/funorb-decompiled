/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kq extends hf implements ai {
    static ri[] field_S;
    static String field_Q;
    static String field_R;
    static ri field_T;
    static String field_O;
    private wp field_U;
    private wp field_P;

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        if (param1 == 710) {
          if (param2 != ((kq) this).field_U) {
            if (((kq) this).field_P != param2) {
              return;
            } else {
              this.e(false);
              return;
            }
          } else {
            bf.a(0);
            this.e(false);
            return;
          }
        } else {
          ((kq) this).field_P = null;
          if (param2 != ((kq) this).field_U) {
            if (((kq) this).field_P != param2) {
              return;
            } else {
              this.e(false);
              return;
            }
          } else {
            bf.a(0);
            this.e(false);
            return;
          }
        }
    }

    kq(dg param0) {
        super(param0, 200, 130);
        pk var2 = new pk(ms.field_c, (qm) null);
        var2.field_r = 0;
        var2.field_v = 50;
        var2.field_p = 80;
        var2.field_q = ((kq) this).field_q;
        var2.field_w = (mh) (Object) new gm(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((kq) this).a(var2, 60);
        if (vs.b((byte) 9)) {
            ((kq) this).field_U = this.a(25566, (qm) this, pp.field_f);
        }
        ((kq) this).field_P = this.a(25566, (qm) this, jh.field_I);
    }

    public static void k(int param0) {
        Object var2 = null;
        field_S = null;
        field_Q = null;
        field_R = null;
        if (param0 != 50) {
          var2 = null;
          byte[] discarded$2 = kq.a(85, (File) null, (byte) 19);
          field_T = null;
          field_O = null;
          return;
        } else {
          field_T = null;
          field_O = null;
          return;
        }
    }

    final static byte[] a(int param0, File param1, byte param2) {
        try {
            byte[] var3 = null;
            IOException var3_ref = null;
            byte[] var4 = null;
            byte[] stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_2_0 = null;
            try {
              L0: {
                var4 = new byte[param0];
                var3 = var4;
                nt.a(var4, 7039, param1, param0);
                if (param2 > 41) {
                  break L0;
                } else {
                  field_Q = null;
                  break L0;
                }
              }
              stackOut_2_0 = (byte[]) var4;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    private final void e(boolean param0) {
        if (!((kq) this).field_D) {
            return;
        }
        ((kq) this).field_D = param0 ? true : false;
    }

    private final wp a(int param0, qm param1, String param2) {
        wp var4 = null;
        int var5 = 0;
        var4 = new wp(param2, param1);
        if (param0 != 25566) {
          return null;
        } else {
          var4.field_w = (mh) (Object) new ue();
          var5 = -6 + ((kq) this).field_p;
          ((kq) this).field_p = ((kq) this).field_p + 38;
          var4.a(param0 + -25442, 15, var5, 30, -14 + (((kq) this).field_q + -16));
          ((kq) this).a((pk) (Object) var4, 90);
          ((kq) this).c(false);
          return var4;
        }
    }

    final static void l(int param0) {
        ag.b(param0 ^ param0);
    }

    final static int a(int param0, mi param1) {
        if (param1 != jq.field_a) {
          if (fv.field_y != param1) {
            if (ta.field_a != param1) {
              if (mm.field_h == param1) {
                return 34166;
              } else {
                if (param0 <= 59) {
                  field_S = null;
                  throw new IllegalArgumentException();
                } else {
                  throw new IllegalArgumentException();
                }
              }
            } else {
              return 34168;
            }
          } else {
            return 34167;
          }
        } else {
          return 5890;
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        if ((param3 ^ -1) == -99) {
            if (null == ((kq) this).field_U) {
                boolean discarded$0 = ((kq) this).field_P.a((pk) this, (byte) 61);
                return true;
            }
            boolean discarded$1 = ((kq) this).field_U.a((pk) this, (byte) 61);
            return true;
        }
        if (param2 < 9) {
            return false;
        }
        if (!((param3 ^ -1) != -100)) {
            boolean discarded$2 = ((kq) this).field_P.a((pk) this, (byte) 61);
            return true;
        }
        return super.a(param0, param1, (byte) 69, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "You have 1 unread message!";
        field_R = "Player";
        field_Q = "Try again";
    }
}
