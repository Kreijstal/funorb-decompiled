/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends je {
    long field_Pb;
    String field_Yb;
    int field_Kb;
    static IndexedSprite[] field_Mb;
    je field_dc;
    boolean field_Wb;
    je field_fc;
    boolean field_Zb;
    static String field_bc;
    int field_Qb;
    int field_Xb;
    String field_cc;
    static int field_Ib;
    int field_Sb;
    je field_ac;
    je field_ec;
    long field_Vb;
    int field_Rb;
    static je field_Lb;
    static String field_Jb;
    static int field_Nb;
    je field_Tb;
    int field_Ob;
    boolean field_Ub;

    final boolean k(int param0) {
        if (param0 == 0) {
          return !this.isSecondaryLinked((byte) -70) ? true : false;
        }
        of var3 = (of) null;
        this.a(-15, (of) null);
        return !this.isSecondaryLinked((byte) -70) ? true : false;
    }

    final void a(byte param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
          this.field_Yb = param1;
          this.field_cc = param2;
          var5 = (CharSequence) ((Object) this.field_cc);
          k.a(var5, false);
          if (param0 != 53) {
            of.e((byte) -11);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "of.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    of(String param0, String param1, long param2) {
        super(0L, (je) null);
        CharSequence var6 = null;
        try {
          this.field_Pb = param2;
          this.field_cc = param0;
          this.field_Yb = param1;
          var6 = (CharSequence) ((Object) this.field_cc);
          k.a(var6, false);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, of param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_15_1 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_21_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 9687) {
            var4 = (String) null;
            this.a((byte) 41, (String) null, (String) null);
          }
          stackIn_5_0 = (param1.field_Ub) ? 0 : 1;
          if (this.field_Ub) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            stackIn_11_0 = this.field_Ub;
            return stackIn_11_0;
          }
          stackIn_14_0 = param1.field_Wb;
          if (this.field_Wb) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if ((stackIn_14_0 ? 1 : 0) != stackIn_15_1) {
            stackIn_21_0 = !(this.field_Vb >= param1.field_Vb);
            return stackIn_21_0;
          }
          stackIn_17_0 = this.field_Wb;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("of.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        String var2 = (String) null;
        vi.a(cd.field_e, 640, (String) null);
        if (param0 != -24) {
          of.d((byte) -75);
        }
    }

    public static void e(byte param0) {
        if (param0 != 20) {
          of.e((byte) 74);
          field_Jb = null;
          field_bc = null;
          field_Mb = null;
          field_Lb = null;
          return;
        }
        field_Jb = null;
        field_bc = null;
        field_Mb = null;
        field_Lb = null;
    }

    final static void uploadQuicksave(Battlefield battlefield, int damageTaken, int unitLossCount, byte obfuscationGuard, int missionId, int campaignIndex) {
        CampaignQuicksave quicksave = null;
        int payloadStart = 0;
        if (DamageEvent.g(121)) {
          return;
        }
        try {
          quicksave = new CampaignQuicksave(campaignIndex, missionId, battlefield, damageTaken, unitLossCount > 0 ? true : false);
          bu.storedQuicksave = quicksave;
          vl.outgoingPacket.writeCipheredOpcode(32161, 80);
          vl.outgoingPacket.position = vl.outgoingPacket.position + 2;
          if (obfuscationGuard != -80) {
            Battlefield var8 = (Battlefield) null;
            of.uploadQuicksave((Battlefield) null, -98, 73, (byte) 105, 55, -24);
          }
          payloadStart = vl.outgoingPacket.position;
          quicksave.write(0, vl.outgoingPacket);
          vl.outgoingPacket.f(0, vl.outgoingPacket.position - payloadStart);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "of.E(" + (battlefield != null ? "{...}" : "null") + ',' + damageTaken + ',' + unitLossCount + ',' + obfuscationGuard + ',' + missionId + ',' + campaignIndex + ')');
        }
    }

    static {
        field_Ib = -1;
        field_bc = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
