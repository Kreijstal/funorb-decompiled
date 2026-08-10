/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends jk {
    int field_F;
    static int field_G;
    static String field_E;
    static int field_D;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                param1 = am.a('_', param1, "", -23026);
                var3 = ki.a((byte) 53, param0);
                var4 = 70 % ((8 - param2) / 53);
                if (-1 != param1.indexOf(param0)) {
                  break L2;
                } else {
                  if (0 == (param1.indexOf(var3) ^ -1)) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("ue.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        if (!(this.field_v != null)) {
            return;
        }
        if (-1 == (this.field_F ^ -1)) {
            return;
        }
        if (!(this.field_F != 256)) {
            this.field_v.a(30, param1, param2 - -this.field_e, this.field_r + param3);
            return;
        }
        le var6 = new le(this.field_v.field_l, this.field_v.field_p);
        mc.a(-8497, var6);
        this.field_v.a(param0, param1, 0, 0);
        tj.b(param0 ^ 659);
        var6.b(param3 + this.field_r, param2 + this.field_e, this.field_F);
    }

    ue(we param0) {
        super(param0.field_r, param0.field_e, param0.field_l, param0.field_p, (ml) null, (of) null);
        try {
            param0.a(this.field_p, 13361, 0, this.field_l, 0);
            this.field_F = 256;
            this.field_v = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public ue() {
        super(0, 0, 0, 0, (ml) null, (of) null);
        this.field_F = 256;
    }

    final static void a(byte param0, boolean param1) {
        int var2;
        vk var3;
        int var4;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == 122) {
          if ((af.field_c ^ -1) < -1) {
            ba.field_f = qg.a(640, 480, 0, rc.field_k, (byte) -73, 0);
            if (null != ba.field_f) {
              af.a(20, ba.field_f);
              var2 = 2;
              var3 = pl.field_e;
              ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3)).field_j + ((ta) ((Object) var3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) ((Object) var3)).field_j, sb.field_r.field_j, 8, 320, var3);
              return;
            } else {
              var2 = 3;
              var3 = pl.field_e;
              ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3)).field_j + ((ta) ((Object) var3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) ((Object) var3)).field_j, sb.field_r.field_j, 8, 320, var3);
              return;
            }
          } else {
            if (ok.a(false)) {
              var2 = 0;
              var3 = pl.field_e;
              ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3)).field_j + ((ta) ((Object) var3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) ((Object) var3)).field_j, sb.field_r.field_j, 8, 320, var3);
              return;
            } else {
              var2 = 1;
              var3 = pl.field_e;
              ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3)).field_j + ((ta) ((Object) var3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) ((Object) var3)).field_j, sb.field_r.field_j, 8, 320, var3);
              return;
            }
          }
        } else {
          field_D = 13;
          if ((af.field_c ^ -1) < -1) {
            ba.field_f = qg.a(640, 480, 0, rc.field_k, (byte) -73, 0);
            if (null != ba.field_f) {
              af.a(20, ba.field_f);
              var2 = 2;
              var3 = pl.field_e;
              ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3)).field_j + ((ta) ((Object) var3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) ((Object) var3)).field_j, sb.field_r.field_j, 8, 320, var3);
              return;
            } else {
              var2 = 3;
              var3 = pl.field_e;
              ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3)).field_j + ((ta) ((Object) var3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) ((Object) var3)).field_j, sb.field_r.field_j, 8, 320, var3);
              return;
            }
          } else {
            if (ok.a(false)) {
              var2 = 0;
              var3 = pl.field_e;
              ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3)).field_j + ((ta) ((Object) var3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) ((Object) var3)).field_j, sb.field_r.field_j, 8, 320, var3);
              return;
            } else {
              var2 = 1;
              var3 = pl.field_e;
              ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3)).field_j + ((ta) ((Object) var3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) ((Object) var3)).field_j, sb.field_r.field_j, 8, 320, var3);
              return;
            }
          }
        }
    }

    public static void j(int param0) {
        if (param0 != 8443) {
            return;
        }
        field_E = null;
    }

    static {
        field_E = "Email is valid";
        field_D = 0;
    }
}
