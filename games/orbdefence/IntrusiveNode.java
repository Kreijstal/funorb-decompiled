/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static boolean field_b;
    IntrusiveNode field_c;
    long field_d;
    IntrusiveNode field_e;
    static String field_a;

    final static short[] a(short[] param0, int param1, boolean param2, BitPacketBuffer param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        BitPacketBuffer var9 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          var4_int = param3.readBits(param1, 8);
          if (var4_int == 0) {
            return null;
          }
          if (param0 == null ||
            var4_int != param0.length) {
            param0 = new short[var4_int];
          }
          var5 = param3.readBits(4, 8);
          if (param2) {
            var9 = (BitPacketBuffer) null;
            IntrusiveNode.a((short[]) null, -25, true, (BitPacketBuffer) null);
          }
          var6 = (short)param3.readBits(16, 8);
          if (0 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)(var6 + param3.readBits(var5, 8));
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ca.JB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 40) {
          field_a = (String) null;
        }
        field_a = null;
    }

    final static int a(boolean param0) {
        if (vh.field_n < 2) {
          return 0;
        }
        if (param0) {
          field_b = false;
        }
        if (ArchiveRequest.field_m == 0) {
          if (!og.field_g.ensureIndexLoaded(-1)) {
            return 20;
          }
          if (!og.field_g.tryLoadGroupByName((byte) 112, "commonui")) {
            return 40;
          }
          if (!am.field_b.ensureIndexLoaded(-1)) {
            return 50;
          }
          if (!am.field_b.tryLoadGroupByName((byte) 111, "commonui")) {
            return 60;
          }
          if (!DebouncedFieldValidator.field_b.ensureIndexLoaded(-1)) {
            return 70;
          }
          if (!DebouncedFieldValidator.field_b.tryLoadAllGroups(7715)) {
            return 80;
          }
        } else {
          if (lf.field_a != null) {
            if (!lf.field_a.ensureIndexLoaded(-1)) {
              return 14;
            }
            if (!lf.field_a.hasGroupName((byte) -62, "")) {
              return 29;
            }
            if (!lf.field_a.tryLoadGroupByName((byte) -113, "")) {
              return 29;
            }
          }
          if (!og.field_g.ensureIndexLoaded(-1)) {
            return 43;
          }
          if (!og.field_g.tryLoadGroupByName((byte) 58, "commonui")) {
            return 57;
          }
          if (!am.field_b.ensureIndexLoaded(-1)) {
            return 71;
          }
          if (!am.field_b.tryLoadGroupByName((byte) 94, "commonui")) {
            return 80;
          }
          if (!DebouncedFieldValidator.field_b.ensureIndexLoaded(-1)) {
            return 82;
          }
          if (!DebouncedFieldValidator.field_b.tryLoadAllGroups(7715)) {
            return 86;
          }
        }
        return 100;
    }

    final void unlink(int param0) {
        if (null == this.field_c) {
          return;
        }
        this.field_c.field_e = this.field_e;
        if (param0 != 57) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          IntrusiveNode.a((short[]) null, 120, true, (BitPacketBuffer) null);
        }
        this.field_e.field_c = this.field_c;
        this.field_e = null;
        this.field_c = null;
    }

    final boolean isLinked(boolean param0) {
        if (null == this.field_c) {
          return false;
        }
        if (!param0) {
          IntrusiveNode.clearStaticReferences(-7);
        }
        return true;
    }

    static {
        field_a = "Max Bolts";
    }
}
