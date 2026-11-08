/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeHashTable {
    private IntrusiveNode field_f;
    private IntrusiveNode field_i;
    private IntrusiveNode[] field_g;
    static String field_d;
    static sb field_c;
    private int field_e;
    static String field_h;
    private int field_a;
    static String field_b;

    final IntrusiveNode get(int param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param0 != -25484) {
          byte[] var7 = (byte[]) null;
          NodeHashTable.readPackedByteArray((CipherPacketBuffer) null, (byte[]) null, -80, 17);
        }
        IntrusiveNode var4 = this.field_g[(int)(param1 & (long)(this.field_a - 1))];
        this.field_i = var4.field_a;
        while (var4 != this.field_i) {
          if (~this.field_i.field_e == ~param1) {
            var5 = this.field_i;
            this.field_i = this.field_i.field_a;
            return var5;
          }
          this.field_i = this.field_i.field_a;
        }
        this.field_i = null;
        return null;
    }

    final IntrusiveNode first(byte param0) {
        if (param0 > -95) {
          return (IntrusiveNode) null;
        }
        this.field_e = 0;
        return this.next(54);
    }

    final static void buildLobbyWidgetTree(boolean param0, int param1) {
        nd.field_b = param0 ? new wo(UiContainer.field_H, an.field_a) : new wo(PairedTextColumns.field_Gb, vd.field_a);
        ff.field_h = new SceneWidget(0L, (SceneWidget) null);
        if (param1 >= -68) {
          NodeHashTable.releaseStatics(-102);
        }
        ff.field_h.addChild(nd.field_b.field_g, (byte) 26);
        ff.field_h.addChild(ValidatedTextWidget.field_kb, (byte) 26);
        ra.field_e = new SceneWidget(0L, cm.field_o);
        DisplayNameRequestGlobals.field_a = new SceneWidget(0L, (SceneWidget) null);
        ra.field_e.addChild(ih.field_g, (byte) 26);
        ra.field_e.addChild(DisplayNameRequestGlobals.field_a, (byte) 26);
        DisplayNameRequestGlobals.field_a.addChild(StripedProgressBar.field_O, (byte) 26);
        DisplayNameRequestGlobals.field_a.addChild(ContentTransitionDialog.field_eb, (byte) 26);
        DebouncedValidator.a((byte) 32, param0);
    }

    final static byte[] readPackedByteArray(CipherPacketBuffer param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (param3 < 59) {
            var9 = (byte[]) null;
            NodeHashTable.readPackedByteArray((CipherPacketBuffer) null, (byte[]) null, 62, -90);
          }
          var4_int = param0.readBits(param2, (byte) -34);
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new byte[var4_int];
          }
          var5 = param0.readBits(3, (byte) -34);
          var6 = (byte)param0.readBits(8, (byte) -34);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (byte)(param0.readBits(var5, (byte) -34) + var6);
            }
          }
          stackIn_18_0 = (byte[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("nl.E(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void put(long param0, int param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (param1 <= 120) {
            this.next(-40);
          }
          if (param2.previous != null) {
            param2.unlink(2779);
          }
          var5 = this.field_g[(int)(param0 & (long)(-1 + this.field_a))];
          param2.previous = var5.previous;
          param2.field_a = var5;
          param2.previous.field_a = param2;
          param2.field_e = param0;
          param2.field_a.previous = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "nl.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        QueuedInput.a(param1, -17130, false);
        if (param0 != 0) {
          NodeHashTable.a(-72, false);
        }
    }

    final static int getUiLoadPercent(boolean param0) {
        if (hf.field_q < 2) {
          return 0;
        }
        if (wo.field_d == 0) {
          if (!wk.field_j.ensureIndex(-3)) {
            return 20;
          }
          if (!wk.field_j.ensureGroupAvailableByName("commonui", -1)) {
            return 40;
          }
          if (!LoginMethod.field_g.ensureIndex(-3)) {
            return 50;
          }
          if (!LoginMethod.field_g.ensureGroupAvailableByName("commonui", -1)) {
            return 60;
          }
          if (!MatchingTextValidator.field_u.ensureIndex(-3)) {
            return 70;
          }
          if (!MatchingTextValidator.field_u.ensureAllGroupsAvailable((byte) 92)) {
            return 80;
          }
        } else {
          if (null != DebouncedValidator.field_e) {
            if (!DebouncedValidator.field_e.ensureIndex(-3)) {
              return 14;
            }
            if (!DebouncedValidator.field_e.hasGroupName(127, "")) {
              return 29;
            }
            if (!DebouncedValidator.field_e.ensureGroupAvailableByName("", -1)) {
              return 29;
            }
          }
          if (!wk.field_j.ensureIndex(-3)) {
            return 43;
          }
          if (!wk.field_j.ensureGroupAvailableByName("commonui", -1)) {
            return 57;
          }
          if (!LoginMethod.field_g.ensureIndex(-3)) {
            return 71;
          }
          if (!LoginMethod.field_g.ensureGroupAvailableByName("commonui", -1)) {
            return 80;
          }
          if (!MatchingTextValidator.field_u.ensureIndex(-3)) {
            return 82;
          }
          if (!MatchingTextValidator.field_u.ensureAllGroupsAvailable((byte) 92)) {
            return 86;
          }
        }
        if (!param0) {
          return 100;
        }
        return 35;
    }

    NodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_e = 0;
        this.field_g = new IntrusiveNode[param0];
        this.field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_g[var2] = dupTemp$0;
          var3.previous = var3;
          var3.field_a = var3;
        }
    }

    final IntrusiveNode next(int param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2_ref_fa;
        int var2;
        int var3;
        IntrusiveNode var4;
        var3 = Pixelate.field_H ? 1 : 0;
        if (this.field_e > 0 &&
          this.field_g[-1 + this.field_e] != this.field_f) {
          var2_ref_fa = this.field_f;
          this.field_f = var2_ref_fa.field_a;
          return var2_ref_fa;
        }
        do {
          if (this.field_a <= this.field_e) {
            var2 = -114 / ((-79 - param0) / 36);
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var4 = this.field_g[fieldTemp$0].field_a;
          var2_ref_fa = var4;
        } while (var4 == this.field_g[-1 + this.field_e]);
        this.field_f = var2_ref_fa.field_a;
        return var2_ref_fa;
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        field_b = null;
        field_d = null;
        field_c = null;
        int var1 = -16 / ((-56 - param0) / 32);
    }

    static {
        field_h = "Asking to join <%0>'s game...";
        field_d = "Auto-respond to <%0>";
        field_b = "This game option is only available to members.";
    }
}
