/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class l extends de {
    static ea field_r;
    static ak field_s;
    static String field_u;
    static String field_t;
    static gp field_p;
    static ak field_q;
    static String field_o;

    l(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void e(int param0) {
        field_t = null;
        field_r = null;
        if (param0 == 2219) {
          field_u = null;
          field_p = null;
          field_o = null;
          field_s = null;
          field_q = null;
          return;
        }
        l.e(8);
        field_u = null;
        field_p = null;
        field_o = null;
        field_s = null;
        field_q = null;
    }

    final static void b(int param0, boolean param1) {
        if (param0 != 19854) {
          cb var3 = (cb) null;
          l.a(false, -75, -15, true, 99, -28L, (String) null, -112, -64, true, 118, -87, 71, (cb) null);
          if (tm.a((byte) 127)) {
            param1 = false;
          }
          am.a((byte) 29, param1);
          if (dk.field_b) {
            t.a(nd.field_b.field_g.field_D, nd.field_b.field_g.field_S, nd.field_b.field_g.field_K, nd.field_b.field_g.field_nb);
            nd.field_b.field_g.a(param1, 0);
            no.a(param1, (byte) 34);
            return;
          }
          no.a(param1, (byte) 34);
          return;
        }
        if (tm.a((byte) 127)) {
          param1 = false;
        }
        am.a((byte) 29, param1);
        if (!dk.field_b) {
          no.a(param1, (byte) 34);
          return;
        }
        t.a(nd.field_b.field_g.field_D, nd.field_b.field_g.field_S, nd.field_b.field_g.field_K, nd.field_b.field_g.field_nb);
        nd.field_b.field_g.a(param1, 0);
        no.a(param1, (byte) 34);
    }

    final void a(byte param0, boolean param1, int param2) {
        if (param0 >= -116) {
          l.b(116, true);
          if (param2 == 0) {
            this.a(param1, true);
            return;
          }
          return;
        }
        if (param2 != 0) {
          return;
        }
        this.a(param1, true);
    }

    final void c(byte param0) {
        la.a(nc.field_a, nc.field_a, false, -25528);
        if (param0 > -13) {
          l.e(-78);
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, long param5, String param6, int param7, int param8, boolean param9, int param10, int param11, int param12, cb param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          cb var16 = null;
          try {
            vi.field_o = new pc(param8);
            aa.field_f = new pc(param2);
            bj.field_a = param1;
            hf.field_n = param7;
            op.field_p = param13;
            vm.field_d = param9;
            hf.field_t = param5;
            uj.field_Lb = param3;
            cd.field_b = param11;
            pc.field_q = param12;
            ra.field_c = param4;
            ii.field_B = param6;
            gd.field_g = param10;
            if (param0) {
              var16 = (cb) null;
              l.a(false, 22, 99, false, -71, -71L, (String) null, 37, -83, false, -70, -34, 80, (cb) null);
            }
            if (null == op.field_p.field_e) {
              return;
            }
            try {
              vi.field_p = new uo(op.field_p.field_e, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("l.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            if (param13 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        if (qo.field_o != qa.field_f.field_i) {
          wa.field_i = wa.field_i + (qa.field_f.field_i - qo.field_o);
          qo.field_o = qa.field_f.field_i;
          if (!(oh.field_b <= 0)) {
            oh.field_b = oh.field_b - 1;
          }
          if (param0) {
            if (!(oh.field_b <= 0)) {
              r.b(-96);
            }
            return;
          }
          return;
        }
        if (!(oh.field_b <= 0)) {
          oh.field_b = oh.field_b - 1;
        }
        if (param0) {
          if (!(oh.field_b <= 0)) {
            r.b(-96);
          }
          return;
        }
    }

    final void a(int param0) {
        tc var2 = null;
        int var3 = 0;
        tc var2Lifetime1;
        int var3Lifetime1;
        this.d((byte) -65);
        this.b((byte) -71);
        if (param0 == 11) {
          var2 = qj.field_e;
          var3 = 1 + (var2.field_w + var2.field_z);
          var2.a(ie.field_F, 50, 160, 540, 200, 16777215, 0, 1, 1, var3);
          return;
        }
        this.a((byte) 119, false, 7);
        var2Lifetime1 = qj.field_e;
        var3Lifetime1 = 1 + (var2Lifetime1.field_w + var2Lifetime1.field_z);
        var2Lifetime1.a(ie.field_F, 50, 160, 540, 200, 16777215, 0, 1, 1, var3Lifetime1);
    }

    static {
        field_r = new ea(3);
        field_t = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_u = "Waiting for sound effects";
        field_o = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
