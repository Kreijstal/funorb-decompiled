/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nu extends lk {
    private RgbSprite[] field_v;
    private int field_y;
    private int field_x;
    static int[] field_z;
    private int field_u;
    static String field_w;

    public static void a(int param0) {
        field_z = null;
        if (param0 != -26601) {
          return;
        }
        field_w = null;
    }

    final static cf a(int param0, kl param1, int param2) {
        cf stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        CipherPacketBuffer var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int[] var9 = null;
        cf var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException var13_ref_RuntimeException = null;
        int var14 = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        byte[] var17 = null;
        byte[] var18 = null;
        sd var19 = null;
        sd[] var20 = null;
        sd var21 = null;
        CampaignMission var22 = null;
        byte[] var23 = null;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var23 = param1.a("missions", -91, gk.field_O[param2]);
          var18 = var23;
          var17 = var18;
          var3 = var17;
          var4 = new CipherPacketBuffer(var23);
          var5 = var4.h((byte) 121);
          var6 = var4.k(param0 - 23948);
          var7 = var4.h((byte) 121);
          var8 = var4.h((byte) 121);
          var9 = ev.a(var4, (byte) -98);
          var10 = new cf(var5);
          var10.field_o = var8;
          var10.field_r = param2;
          var10.field_l = var7;
          var10.field_s = var6;
          var10.field_p = var9;
          cd.field_a[param2] = var10;
          var11 = var4.k(param0 - 23948);
          var10.field_q = new sd[var11];
          for (var12 = 0; var11 > var12; var12++) {
            try {
              var19 = ks.a(900, var10, var4);
              var10.field_q[var19.field_m] = var19;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var13_ref_RuntimeException = decompiledCaughtException;
            }
          }
          var12 = var4.k(0);
          for (var13 = 0; var13 < var12; var13++) {
            em.a(var10, (byte) -7, var4);
          }
          var20 = var10.field_q;
          var14 = 0;
          if (param0 != 23948) {
            nu.a(49L, 110);
          }
          while (var14 < var20.length) {
            var21 = var20[var14];
            if (0 == var21.field_o) {
              var21.field_k = null;
            }
            var14++;
          }
          var13 = var4.k(0);
          var10.field_n = new CampaignMission[var13];
          for (var14 = 0; var13 > var14; var14++) {
            try {
              var22 = BattleCharacter.a(var10, var4, param1, (byte) -73);
              var10.field_n[var22.missionId] = var22;
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = decompiledCaughtException;
              System.out.println("Error reading mission: " + var15);
              var15.printStackTrace();
            }
          }
          var4.l(param0 ^ 24048);
          stackIn_24_0 = var10;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var3_ref = decompiledCaughtException;
          stackIn_27_0 = var3_ref;
          stackIn_27_1 = new StringBuilder().append("nu.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    public nu() {
        this(2188450, 2591221, 9543);
    }

    final static void a(long param0, int param1) {
        if (param0 <= (long)param1) {
          return;
        }
        if (param0 % 10L == 0L) {
          ae.a(-1L + param0, 116);
          ae.a(1L, param1 ^ 125);
        } else {
          ae.a(param0, 53);
        }
    }

    final static kl a(int param0, boolean param1) {
        if (!param1) {
          nu.a(-81L, -76);
        }
        return tk.a(param0, true, 1, false, false, 1);
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        kb var9 = null;
        try {
          if (!param0.field_t) {
            stackIn_6_0 = (param0.a(false)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param0 instanceof fw) {
            param3 = param3 & ((fw) (param0)).field_I;
          }
          if (param2 > -79) {
            var9 = (kb) null;
            this.a((kb) null, 31, -37, true, 10);
          }
          if (!param3) {
            stackIn_16_0 = this.field_y;
          } else {
            if (var6_int != 0) {
              stackIn_16_0 = this.field_u;
            } else {
              stackIn_16_0 = this.field_x;
            }
          }
          var7 = stackIn_16_0;
          stackIn_19_0 = (!param3) ? 7105644 : 16777215;
          var8 = stackIn_19_0;
          wn.a(var7, this.field_v, param0.field_l, param1 + param0.field_B, param0.field_p + param4 + (-this.field_v[0].field_x + param0.field_w >> 1), -3225);
          this.field_q.a(param0.field_v, param0.field_B + param1, param4 + param0.field_p - 2, param0.field_l, param0.field_w, var8, -1, 1, 1, this.field_q.field_H);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("nu.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private nu(int param0, int param1, int param2) {
        this.field_x = param0;
        this.field_v = bb.field_b;
        this.field_u = param1;
        this.field_q = CipherPacketBuffer.field_t;
        this.field_y = param2;
    }

    static {
        bm.a((byte) -81, 50);
        field_z = new int[]{20, 10, 5};
        field_w = "Store";
    }
}
