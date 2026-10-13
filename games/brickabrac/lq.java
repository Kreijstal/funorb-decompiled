/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static RgbSprite field_d;
    static String field_c;
    static int[] field_b;
    private DualLinkNode field_g;
    private DualLinkNode field_f;
    static String field_e;
    static String field_a;

    final static void d(int param0) {
        tn.field_m = null;
        int var1 = -1 / ((42 - param0) / 59);
    }

    final void a(DualLinkNode param0, boolean param1) {
        try {
          if (param0.secondaryPrevious != null) {
            param0.unlinkSecondary(3);
          }
          if (param1) {
            ResourceArchive var4 = (ResourceArchive) null;
            lq.loadIndexedSprite(-17, 78, 86, (ResourceArchive) null);
          }
          param0.secondaryNext = this.field_g;
          param0.secondaryPrevious = this.field_g.secondaryPrevious;
          param0.secondaryPrevious.secondaryNext = param0;
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "lq.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != 25609) {
          this.field_g = (DualLinkNode) null;
          var2 = this.field_g.secondaryNext;
          if (this.field_g != var2) {
            var2.unlinkSecondary(param0 ^ 25610);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_g.secondaryNext;
        if (this.field_g != var2Lifetime1) {
          var2Lifetime1.unlinkSecondary(param0 ^ 25610);
          return var2Lifetime1;
        }
        return null;
    }

    final DualLinkNode e(int param0) {
        DualLinkNode var2 = this.field_f;
        if (var2 == this.field_g) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.secondaryNext;
        if (param0 == -8394) {
          return var2;
        }
        DualLinkNode var3 = (DualLinkNode) null;
        this.a((DualLinkNode) null, true);
        return var2;
    }

    final DualLinkNode a(boolean param0) {
        if (!param0) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.field_g.secondaryNext;
        if (this.field_g == var2) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.secondaryNext;
        return var2;
    }

    final int c(int param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        int var2 = 0;
        DualLinkNode var3 = this.field_g.secondaryNext;
        if (param0 != -25906) {
          return 88;
        }
        while (this.field_g != var3) {
          var2++;
          var3 = var3.secondaryNext;
        }
        return var2;
    }

    final static th[] b(int param0) {
        if (param0 == 0) {
          return new th[]{un.field_b, IntrusiveNode.field_c, ro.field_r, an.field_i, o.field_h, c.field_m, wi.field_i, ba.field_B, pa.field_k, hj.field_Sb, sl.field_B, IntrusiveHashTable.field_o, IntNode.field_i, lk.field_o};
        }
        field_e = (String) null;
        return new th[]{un.field_b, IntrusiveNode.field_c, ro.field_r, an.field_i, o.field_h, c.field_m, wi.field_i, ba.field_B, pa.field_k, hj.field_Sb, sl.field_B, IntrusiveHashTable.field_o, IntNode.field_i, lk.field_o};
    }

    public static void b(boolean param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0) {
          field_e = null;
          field_c = null;
          return;
        }
        lq.b(false);
        field_e = null;
        field_c = null;
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, byte param2, ResourceArchive param3, ResourceArchive param4) {
        try {
          kc.field_j = param1;
          ta.field_g = param3;
          ic.field_a = param0;
          ag.field_G = param4;
          GameScreen.field_e = new wp(ag.field_G, ta.field_g);
          if (param2 != -38) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "lq.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static IndexedSprite loadIndexedSprite(int obfuscationGuard, int groupId, int fileId, ResourceArchive archive) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        IndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ln.decodeSpritesFromArchive(-105, fileId, archive, groupId)) {
            stackIn_2_0 = null;
            return (IndexedSprite) (stackIn_2_0);
          }
          if (obfuscationGuard != 0) {
            lq.d(-20);
          }
          stackIn_6_0 = LevelSelectScreen.buildIndexedSprite(false);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("lq.E(").append(obfuscationGuard).append(',').append(groupId).append(',').append(fileId).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public lq() {
        this.field_g = new DualLinkNode();
        this.field_g.secondaryNext = this.field_g;
        this.field_g.secondaryPrevious = this.field_g;
    }

    static {
        field_c = "Go!";
        field_a = "Invite players";
    }
}
