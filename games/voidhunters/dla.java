/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dla {
    private lta field_b;
    static llb field_e;
    static int field_d;
    private int field_a;
    static int field_c;
    private pe field_f;

    final static int a(int param0) {
        int var1 = -61 % ((47 - param0) / 45);
        return cd.field_c;
    }

    private final void a(boolean param0, Random param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        sg var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = ib.a(-99, 0, za.c((byte) -93), param1);
          if (!param0 && (var5_int == 2 ||
            var5_int == 1)) {
            var5_int = 2 + var5_int;
          }
          var6 = t.a(var5_int, (byte) 94);
          var6.a(new aoa(), 4);
          var6.h(17704, param3);
          if (param2 > -26) {
            return;
          }
          var7 = -this.field_f.g((byte) -122) / 2 + hob.a(param1, this.field_f.g((byte) -122), 119);
          var8 = -this.field_f.m(1) / 2 + hob.a(param1, this.field_f.m(1), 120);
          var6.a(var7, var8, (byte) -72);
          var6.a(hob.a(param1, 8192, 126), -85);
          this.field_f.a(var6, (byte) 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("dla.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String c(int param0) {
        if (null == kca.field_a) {
          return "";
        }
        if (param0 <= 106) {
          field_d = 106;
        }
        return kca.field_a;
    }

    final void a(boolean param0, byte param1) {
        int var9_int = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        nbb[] var7;
        nbb var7_ref;
        int var8;
        String var9;
        int var10;
        nbb var10_ref_nbb;
        int var11;
        ml var11_ref_ml;
        int var12;
        String var12_ref_String;
        int var13;
        int var14;
        int var15;
        int var16;
        nbb[] var17;
        nbb var18;
        int var8Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        nbb var7_refLifetime1;
        nbb var18Lifetime1;
        nbb var7_refLifetime2;
        nbb var18Lifetime2;
        var16 = VoidHunters.field_G;
        var3 = this.field_b.a(true, ip.field_p.width) - this.field_b.a(true, 0);
        var4 = this.field_b.a(0, ip.field_p.height) - this.field_b.a(0, 0);
        if (var3 != this.field_f.g((byte) -122)) {
          this.field_f.a(var3, (byte) 113);
          this.field_f.e(var4, 0);
        } else {
          if (this.field_f.m(1) != var4) {
            this.field_f.a(var3, (byte) 113);
            this.field_f.e(var4, 0);
          }
        }
        this.field_b.field_e = ip.field_p.height / 2;
        this.field_b.field_d = ip.field_p.width / 2;
        this.field_b.a(ip.field_p.height, 0, -72, ip.field_p.width, 0);
        hna.a(this.field_f, this.field_b, false, (byte) -59);
        this.field_f.a(this.field_b, (byte) 85, this.field_a, (sg) null);
        var5 = this.field_b.a(true, pk.field_o);
        var6 = this.field_b.a(0, noa.field_q);
        if (param0 && (pk.field_o != -1 ||
          noa.field_q != -1)) {
          var17 = this.field_f.h((byte) -33);
          var7 = var17;
          var8 = -66 % ((param1 + 62) / 63);
          for (var9_int = 0; var9_int < var17.length; var9_int++) {
            var10_ref_nbb = var17[var9_int];
            var18 = var10_ref_nbb;
            var7_ref = var18;
            var18Lifetime2 = var10_ref_nbb;
            var7_refLifetime2 = var18Lifetime2;
            if (var10_ref_nbb != null) {
              var11_ref_ml = var10_ref_nbb.field_k.a(var6, var5, true);
              if (var11_ref_ml != null) {
                var12_ref_String = me.a(var11_ref_ml, (byte) 72);
                var13 = var11_ref_ml.b(true);
                var14 = var11_ref_ml.a((byte) 111);
                var15 = this.field_b.a(var13, (byte) 115);
                cka.a(1, var12_ref_String, 16777215, this.field_b.b(true, -10000 + var14), -(kga.a(112, var12_ref_String) >> 1) + var15, 4266);
                c.a(this.field_b.b(true, var14), var15, -(kga.a(-77, var12_ref_String) >> 2) + var15, this.field_b.b(true, -10000 + var14), -16777216, 16777215);
                return;
              }
            }
          }
          var18Lifetime1 = this.field_f.a(true, var6, var5, var5, var6);
          var7_refLifetime1 = var18Lifetime1;
          if (var18Lifetime1 != null) {
            var8Lifetime1 = var18Lifetime1.g(-71) << 2;
            var9 = me.a(var18Lifetime1.field_k, (byte) 106);
            var10 = var18Lifetime1.field_k.b(true);
            var11 = -var5 + var10;
            var12 = var18Lifetime1.field_k.a((byte) 104);
            var13Lifetime1 = -var6 + var12;
            var14Lifetime1 = ar.a(var11, (byte) 106, var13Lifetime1);
            if (var14Lifetime1 <= var8Lifetime1) {
              var15Lifetime1 = this.field_b.a(var10, (byte) 116);
              cka.a(1, var9, 16777215, this.field_b.b(true, -10000 + var12), -(kga.a(-51, var9) >> 1) + var15Lifetime1, 4266);
              c.a(this.field_b.b(true, var12), var15Lifetime1, -(kga.a(-100, var9) >> 2) + var15Lifetime1, this.field_b.b(true, -10000 + var12), -16777216, 16777215);
            }
          }
          return;
        }
    }

    final void b(int param0) {
        int stackIn_16_0 = 0;
        lbb var3;
        nwa var4;
        sg[] var5;
        nbb[] var5_array;
        int var6;
        int var7_int;
        Object var7;
        sg[] var8;
        int var9;
        sg var10_ref_sg;
        int var10;
        int var11;
        int var12;
        lta var13;
        sg[] var14;
        nbb[] var15;
        tfa[] var16;
        Random var17;
        Random var18;
        int var6Lifetime1;
        int var7_intLifetime1;
        int var9Lifetime1;
        var12 = VoidHunters.field_G;
        var13 = (lta) null;
        hra.a((lta) null, -8077);
        ka.a(this.field_a, -19266);
        var16 = new tfa[]{};
        var3 = new lbb();
        var4 = new nwa();
        this.field_f.a(1799937864, true, var4, var16, var3, this.field_a, var16);
        this.field_a = this.field_a + 1;
        if (this.field_f.f(0, param0 - 13766) == 0 ||
          this.field_f.f(1, -13766) == 0) {
          var5 = this.field_f.d(1000);
          var6 = 0;
          var7_int = 1;
          var14 = var5;
          var8 = var14;
          var9 = 0;
          L3: while (true) {
            if (var14.length > var9) {
              var10_ref_sg = var14[var9];
              if (var10_ref_sg != null &&
                var10_ref_sg.q((byte) 78) < unb.field_p) {
                var6 = mjb.b(param0 ^ 21957, var10_ref_sg.q((byte) 102));
                if (1 == var10_ref_sg.field_k.k(0)) {
                  var7_int = 0;
                  break L3;
                }
                if (var10_ref_sg.field_k.k(0) == 2) {
                  var7_int = 0;
                  break L3;
                }
                stackIn_16_0 = 1;
                var7_int = stackIn_16_0;
                break L3;
              }
              var9++;
              continue;
            }
            break;
          }
          var17 = new Random();
          this.a(var7_int != 0, var17, param0 - 121, var6);
        }
        nbb[] dupTemp$0 = this.field_f.h((byte) -33);
        var15 = dupTemp$0;
        var5_array = dupTemp$0;
        var6Lifetime1 = param0;
        for (var7_intLifetime1 = 0; var7_intLifetime1 < var15.length; var7_intLifetime1++) {
          if (null != var15[var7_intLifetime1]) {
            var6Lifetime1++;
          }
        }
        if (var6Lifetime1 > 100) {
          var7 = null;
          var18 = new Random();
          var9Lifetime1 = hob.a(var18, var6Lifetime1, 118);
          var10 = 0;
          var11 = 0;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var15.length > var11) {
              if (var15[var11] != null) {
                if (var10 == var9Lifetime1) {
                  var7 = var15[var11];
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var10++;
                }
              }
              if (decompiledFrameRemainder0) {
                var11++;
                continue;
              }
            }
            if (var7 == null) {
              break;
            }
            this.field_f.a(-118, 1, (anb) (var7));
            break;
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(byte param0) {
        if (param0 != 101) {
          return;
        }
        field_e = null;
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        int var6;
        if (param1) {
          if (fmb.field_o[param3] < fmb.field_o[param2]) {
            return true;
          }
          if (fmb.field_o[param3] > fmb.field_o[param2]) {
            return false;
          }
          if (hga.field_o[param2] > hga.field_o[param3]) {
            return true;
          }
          if (hga.field_o[param3] > hga.field_o[param2]) {
            return false;
          }
        } else {
          if (hga.field_o[param3] < hga.field_o[param2]) {
            return true;
          }
          if (hga.field_o[param2] < hga.field_o[param3]) {
            return false;
          }
          if (fmb.field_o[param2] > fmb.field_o[param3]) {
            return true;
          }
          if (fmb.field_o[param3] > fmb.field_o[param2]) {
            return false;
          }
        }
        var4 = -73 / ((param0 - 73) / 52);
        var5 = fv.field_o[param3] + hma.field_d[param3] + emb.field_o[param3];
        var6 = emb.field_o[param2] - (-hma.field_d[param2] - fv.field_o[param2]);
        if (var6 > var5) {
          return true;
        }
        if (var5 > var6) {
          return false;
        }
        return !(param2 <= param3);
    }

    dla() {
        int var4 = 0;
        Exception exception = null;
        int var1 = 0;
        int var2 = 0;
        Random var3 = null;
        sg var5_ref_sg = null;
        int var5 = 0;
        int var6 = 0;
        crb var9 = null;
        int[] var12 = null;
        Throwable decompiledCaughtException = null;
        this.field_f = new pe(0);
        this.field_b = new lta();
        var1 = this.field_b.a(true, ip.field_p.width) - this.field_b.a(true, 0);
        var2 = this.field_b.a(0, ip.field_p.height) - this.field_b.a(0, 0);
        this.field_f.a(var1, (byte) -93);
        this.field_f.e(var2, 0);
        var3 = new Random();
        if (null != es.field_b &&
          null != es.field_b.field_f) {
          try {
            var12 = es.field_b.field_f.field_c;
            var5_ref_sg = ae.a(var12, (byte) 45);
            var5_ref_sg.h(17704, 3);
            var5_ref_sg.a(new aoa(), 4);
            var5_ref_sg.a(hob.a(var3, 8192, 122), -67);
            this.field_f.a(var5_ref_sg, (byte) 107);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
            es.field_b.field_f = null;
            eg.e((byte) -111);
            gna.a((Throwable) ((Object) exception), "player_gamedata version " + es.field_b.field_d + " blueprint is corrupted", 0);
          }
        } else {
          for (var4 = 0; var4 < 2; var4++) {
            var5 = var4 % 2;
            this.a(false, var3, -99, var5);
          }
        }
        var9 = new crb(new ml(49));
        var5 = -this.field_f.g((byte) -122) / 2 + hob.a(var3, this.field_f.g((byte) -122), 120);
        var6 = -this.field_f.m(1) / 2 + hob.a(var3, this.field_f.m(1), 123);
        var9.a(var5, var6, (byte) 43);
        this.field_f.a((byte) 126, var9);
    }

    static {
        field_c = 1024;
        field_d = 4;
    }
}
