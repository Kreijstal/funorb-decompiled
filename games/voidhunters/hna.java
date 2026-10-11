/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hna extends pca implements ntb {
    int field_q;
    int field_p;
    static int field_s;
    static int field_n;
    tw field_r;
    int field_o;

    public final void b(faa param0, int param1) {
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0, -123);
          if (param1 > -109) {
            this.field_q = 115;
          }
          param0.a(-632, this.field_o, 16);
          param0.a(-632, this.field_p, 32);
          param0.a(-632, this.field_q, 32);
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = -126;
          stackIn_5_2 = (this.field_r != null);
          if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            this.field_r.b(param0, -115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hna.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        hna var3 = null;
        hna var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = (hna) (param1);
          var3 = var4;
          super.b((byte) 88, param1);
          var4.field_p = this.field_p;
          if (param0 < 54) {
            field_n = 80;
          }
          var4.field_o = this.field_o;
          var4.field_q = this.field_q;
          if (null != this.field_r) {
            if (var3.field_r == null) {
              var3.field_r = new tw();
            }
            this.field_r.b((byte) 127, var3.field_r);
          } else {
            var4.field_r = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("hna.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(pe param0, lta param1, boolean param2, byte param3) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lta var13 = null;
        Random var14 = null;
        aja var15 = null;
        lta var16 = null;
        aja var17 = null;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var8Lifetime1Lifetime1;
        var12 = VoidHunters.field_G;
        try {
          var4_int = param0.g((byte) -122) >> 1;
          if (param3 != -59) {
            return;
          }
          var5 = param0.m(1) >> 1;
          if (hbb.field_z > 0) {
            var14 = new Random(234890L);
            for (var7 = 0; var7 < hbb.field_z; var7++) {
              var8 = hob.a(var14, param0.g((byte) -122), 127) - var4_int;
              var9 = -var5 + hob.a(var14, param0.m(1), param3 + 175);
              var10 = hob.a(var14, 800, param3 + 179) + 200;
              var11 = (int)(param1.field_a * (float)(var10 << 8));
              if (var11 > 255) {
                var11 = 255;
              }
              jj.a(8947865, (byte) 7, param1.b(true, var9), (float)(int)((float)var10 * param1.field_a), var11, param1.a(var8, (byte) 121));
            }
          }
          if (li.field_i &&
            via.field_b == 1) {
            var13 = new lta();
            var16 = var13;
            var16.field_d = param1.field_d;
            var16.field_e = param1.field_e;
            if (1 == tkb.field_p ||
              null == psb.field_b) {
              var16.field_b = param1.field_b;
              var16.field_a = param1.field_a / 32.0f + 0.00011081559932790697f;
              var13.field_c = param1.field_c;
              var15 = mmb.field_d[7];
              var8Lifetime1 = 4194304;
              lo.a(0, var8Lifetime1, var15, var16);
            }
            if (jnb.field_o == 1) {
              var16.field_c = param1.field_c;
              var16.field_a = param1.field_a / 64.0f + 0.00005540779966395348f;
              var13.field_b = param1.field_b;
              var17 = mmb.field_d[6];
              var8Lifetime1Lifetime1 = 4194304;
              lo.a(0, var8Lifetime1Lifetime1, var17, var16);
            }
          }
          var6 = param1.a(-var4_int, (byte) 124) - 1;
          var7Lifetime1 = param1.a(var4_int, (byte) 123) + 1;
          var8Lifetime2 = -1 + param1.b(true, -var5);
          var9Lifetime1 = param1.b(true, var5) + 1;
          if (li.field_i) {
            if (ceb.field_p) {
              og.field_r.U(var6, var8Lifetime2, var7Lifetime1 - var6, 16777215, 0);
              og.field_r.U(var6, var9Lifetime1, -var6 + var7Lifetime1, 16777215, 0);
              og.field_r.P(var6, var8Lifetime2, -var8Lifetime2 + var9Lifetime1, 16777215, 0);
              og.field_r.P(var7Lifetime1, var8Lifetime2, -var8Lifetime2 + var9Lifetime1, 16777215, 0);
            }
          } else {
            dma.h(var6, var8Lifetime2, -var6 + var7Lifetime1, 16777215);
            dma.h(var6, var9Lifetime1, -var6 + var7Lifetime1, 16777215);
            dma.d(var6, var8Lifetime2, var9Lifetime1 - var8Lifetime2, 16777215);
            dma.d(var7Lifetime1, var8Lifetime2, var9Lifetime1 - var8Lifetime2, 16777215);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("hna.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        hna var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3 = (hna) (param1);
          var4 = -118 / ((param0 - 22) / 59);
          if (!super.a((byte) 90, param1) &&
            this.field_o == var3.field_o &&
            this.field_p == var3.field_p &&
            var3.field_q == this.field_q) {
            stackIn_7_0 = (var3.field_r != null) ? 0 : 1;
            if (this.field_r != null) {
              stackIn_10_1 = 0;
            } else {
              stackIn_10_1 = 1;
            }
            if ((stackIn_7_0 ^ stackIn_10_1) == 0 && (this.field_r == null ||
              !this.field_r.a((byte) 94, var3.field_r))) {
              stackIn_16_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_16_0 = true;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("hna.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, param1);
          this.field_o = param0.i(0, 16);
          this.field_p = param0.i(0, 32);
          this.field_q = param0.i(0, 32);
          if (kv.a(false, param0)) {
            if (this.field_r == null) {
              this.field_r = new tw();
            }
            this.field_r.a(param0, false);
          } else {
            this.field_r = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hna.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2) {
        this.field_r = new tw();
        if (param2 != -30790) {
          this.field_r = (tw) null;
        }
        this.field_r.field_c = new dv(param1, param0);
    }

    public final void a(tv param0, int param1) {
        int stackIn_15_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        hna var5 = null;
        try {
          super.a(param0, -94);
          var5 = (hna) (param0);
          if (null != this.field_r &&
            null != var5.field_r) {
            this.field_r.a(var5.field_r, -51);
          }
          var4 = 0;
          if (this.field_o != var5.field_o) {
            System.out.println("int triggers has changed. before=" + var5.field_o + ", now=" + this.field_o);
            var4 = 1;
          }
          if (var5.field_p != this.field_p) {
            var4 = 1;
            System.out.println("int mousex has changed. before=" + var5.field_p + ", now=" + this.field_p);
          }
          if (param1 > -19) {
            return;
          }
          if (this.field_q != var5.field_q) {
            System.out.println("int mousey has changed. before=" + var5.field_q + ", now=" + this.field_q);
            var4 = 1;
          }
          stackIn_15_0 = (this.field_r != null) ? 0 : 1;
          if (null != var5.field_r) {
            stackIn_18_1 = 0;
          } else {
            stackIn_18_1 = 1;
          }
          if ((stackIn_15_0 ^ stackIn_18_1) != 0 ||
            null != this.field_r &&
            this.field_r.a((byte) 84, var5.field_r)) {
            System.out.println("SpecialOrderSubmessage special_order_submessage has changed. before=" + var5.field_r + ", now=" + this.field_r);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of PlayerAction has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("hna.F(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(mfa param0, int param1, tja param2) {
        tfa stackIn_26_0 = null;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4 = null;
        tfa var5 = null;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        rsb var9 = null;
        sg var10 = null;
        sg var11 = null;
        var8 = VoidHunters.field_G;
        try {
          if (this.c(-12)) {
            return;
          }
          if (param1 != 0) {
            return;
          }
          var9 = (rsb) (param2);
          if (null != this.field_r &&
            null != this.field_r.field_d) {
            var9.field_f.a(param1 ^ 42, this.field_r.field_d);
            return;
          }
          var5 = var9.a(this.field_k, (byte) 59);
          if (this.field_r != null &&
            this.field_r.field_e != null) {
            if (var5.field_m == this.field_r.field_e.field_a) {
              var9.field_g.g(-1, this.field_k);
              return;
            }
            var5.field_m = this.field_r.field_e.field_a;
            return;
          }
          if (this.field_r != null &&
            this.field_r.field_c != null) {
            if (this.field_r.field_c.field_a) {
              var5.a(this.field_r.field_c.field_e, (byte) -66);
              return;
            }
            var6 = var9.field_e.e(8);
            if (var6 == 1) {
              var5.a(13, this.field_r.field_c.field_e, 30024, 0, sl.field_a);
              return;
            }
            if (2 != var6) {
              return;
            }
            var5.a(30, this.field_r.field_c.field_e, 30024, 14, ena.field_q);
            return;
          }
          if (this.field_r != null &&
            this.field_r.field_a != null) {
            var11 = var9.field_g.d(this.field_k, 80);
            if (var11 != null) {
              var11.a((byte) 34, this.field_r.field_a);
              return;
            }
            if (!cg.a((byte) -128, var9.field_g.d(false))) {
              return;
            }
            var10 = new sg();
            try {
              var10.field_k = qia.a(param1 + 1, this.field_r.field_a.field_c);
              var10.e((byte) 119);
              var10.field_k.a((byte) 0, (anb) (var10));
              var5.field_g = var10;
              var9.field_g.g(param1 - 1, this.field_k);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7 = (Exception) (Object) decompiledCaughtException;
              hh.a((Throwable) ((Object) var7), true, "Invalid blueprint action from player " + this.field_k + " AKA " + param0.a(1, this.field_k));
            }
            return;
          }
          stackIn_26_0 = var5;
          if (this.field_r == null) {
            stackIn_27_1 = -1;
          } else {
            stackIn_27_1 = this.field_r.field_b;
          }
          stackIn_26_0.field_b = stackIn_27_1;
          var5.field_f = this.field_o;
          if (fra.field_a != 0 &&
            this.field_p == -2 &&
            this.field_q == -2) {
            return;
          }
          var5.field_e = this.field_q;
          var5.field_d = this.field_p;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("hna.A(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    public final String toString() {
        return "Tick=" + this.field_e + ", system=" + this.field_d + ", playerid=" + this.field_k + ",triggers=" + this.field_o + ", mousex=" + this.field_p + ", mousey=" + this.field_q + " specialorder=" + this.field_r;
    }

    public hna() {
    }

    static {
        field_s = 1;
        field_n = 88;
        qb discarded$0 = new qb();
    }
}
