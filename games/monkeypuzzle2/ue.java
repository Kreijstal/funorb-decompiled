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
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = am.a('_', param1, "", -23026);
          var3 = ki.a((byte) 53, param0);
          var4 = 70 % ((8 - param2) / 53);
          stackIn_5_0 = (-1 != param1.indexOf(param0)) || (param1.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("ue.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return;
        }
        if (this.field_v == null) {
          return;
        }
        if (this.field_F == 0) {
          return;
        }
        if (this.field_F == 256) {
          this.field_v.a(30, param1, param2 + this.field_e, this.field_r + param3);
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
        int var2 = 0;
        vk var3 = null;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        vk var3Lifetime1;
        vk var3Lifetime2;
        vk var3Lifetime3;
        vk var3Lifetime4;
        vk var3Lifetime5;
        vk var3Lifetime1Lifetime1;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime1Lifetime1;
        if (param0 != 122) {
          field_D = 13;
          if (af.field_c <= 0) {
            if (!ok.a(false)) {
              var2 = 1;
              var3 = pl.field_e;
              ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3)).field_j + ((ta) ((Object) var3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) ((Object) var3)).field_j, sb.field_r.field_j, 8, 320, var3);
              return;
            }
            var2 = 0;
            var3 = pl.field_e;
            ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3)).field_j + ((ta) ((Object) var3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) ((Object) var3)).field_j, sb.field_r.field_j, 8, 320, var3);
            return;
          }
          ba.field_f = qg.a(640, 480, 0, rc.field_k, (byte) -73, 0);
          if (null == ba.field_f) {
            var2Lifetime4 = 3;
            var3Lifetime4 = pl.field_e;
            ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3Lifetime4)).field_j + ((ta) ((Object) var3Lifetime4)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2Lifetime4, param1, 240, ((ta) ((Object) var3Lifetime4)).field_j, sb.field_r.field_j, 8, 320, var3Lifetime4);
            return;
          }
          af.a(20, ba.field_f);
          var2Lifetime5 = 2;
          var3Lifetime5 = pl.field_e;
          ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3Lifetime5)).field_j + ((ta) ((Object) var3Lifetime5)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2Lifetime5, param1, 240, ((ta) ((Object) var3Lifetime5)).field_j, sb.field_r.field_j, 8, 320, var3Lifetime5);
          return;
        }
        if (af.field_c <= 0) {
          if (!ok.a(false)) {
            var2Lifetime1 = 1;
            var3Lifetime1 = pl.field_e;
            ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3Lifetime1)).field_j + ((ta) ((Object) var3Lifetime1)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2Lifetime1, param1, 240, ((ta) ((Object) var3Lifetime1)).field_j, sb.field_r.field_j, 8, 320, var3Lifetime1);
            return;
          }
          var2Lifetime1Lifetime1 = 0;
          var3Lifetime1Lifetime1 = pl.field_e;
          ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3Lifetime1Lifetime1)).field_j + ((ta) ((Object) var3Lifetime1Lifetime1)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2Lifetime1Lifetime1, param1, 240, ((ta) ((Object) var3Lifetime1Lifetime1)).field_j, sb.field_r.field_j, 8, 320, var3Lifetime1Lifetime1);
          return;
        }
        ba.field_f = qg.a(640, 480, 0, rc.field_k, (byte) -73, 0);
        if (null == ba.field_f) {
          var2Lifetime2 = 3;
          var3Lifetime2 = pl.field_e;
          ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3Lifetime2)).field_j + ((ta) ((Object) var3Lifetime2)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2Lifetime2, param1, 240, ((ta) ((Object) var3Lifetime2)).field_j, sb.field_r.field_j, 8, 320, var3Lifetime2);
          return;
        }
        af.a(20, ba.field_f);
        var2Lifetime3 = 2;
        var3Lifetime3 = pl.field_e;
        ff.a(sb.field_r, ji.field_b, 480, ((ta) ((Object) var3Lifetime3)).field_j + ((ta) ((Object) var3Lifetime3)).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2Lifetime3, param1, 240, ((ta) ((Object) var3Lifetime3)).field_j, sb.field_r.field_j, 8, 320, var3Lifetime3);
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
