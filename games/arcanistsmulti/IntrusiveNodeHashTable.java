/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveNodeHashTable {
    static String field_l;
    static kc field_o;
    private int bucketCount;
    private DualLinkNode[] buckets;
    static int field_p;
    static String field_d;
    static Sprite[] field_a;
    static int field_h;
    private int traversalIndex;
    static String field_g;
    static String field_f;
    private DualLinkNode field_k;
    private DualLinkNode field_c;
    static Sprite[] field_b;
    private long field_m;
    static String field_j;

    final DualLinkNode a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var9;
        DualLinkNode var12;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= ~this.traversalIndex) {
          do {
            if (this.traversalIndex >= this.bucketCount) {
              return null;
            }
            fieldTemp$1 = this.traversalIndex;
            this.traversalIndex = this.traversalIndex + 1;
            var4 = this.buckets[fieldTemp$1].secondaryNext;
            var5 = var4;
          } while (var4 == this.buckets[-1 + this.traversalIndex]);
          this.field_k = var5.secondaryNext;
          return var5;
        }
        if (this.field_k != this.buckets[this.traversalIndex - 1]) {
          var12 = this.field_k;
          this.field_k = var12.secondaryNext;
          return var12;
        }
        do {
          if (this.traversalIndex >= this.bucketCount) {
            return null;
          }
          fieldTemp$0 = this.traversalIndex;
          this.traversalIndex = this.traversalIndex + 1;
          var4 = this.buckets[fieldTemp$0].secondaryNext;
          var9 = var4;
        } while (var4 == this.buckets[-1 + this.traversalIndex]);
        this.field_k = var9.secondaryNext;
        return var9;
    }

    final DualLinkNode f(int param0) {
        this.traversalIndex = 0;
        int var2 = -85 / ((param0 - 26) / 58);
        return this.a(-1);
    }

    final static MusicPatch a(byte param0, ResourceArchive param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        MusicPatch stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -127) {
            field_j = (String) null;
          }
          var4 = param1.d(param2, 31662);
          var3 = var4;
          if (var4 != null) {
            stackIn_6_0 = new MusicPatch(var4);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (MusicPatch) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("mo.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final DualLinkNode getNextWithSameKey(int obfuscationGuard) {
        DualLinkNode var3 = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == this.field_c) {
          return null;
        }
        DualLinkNode var2 = this.buckets[(int)((long)(-1 + this.bucketCount) & this.field_m)];
        while (this.field_c != var2) {
          if (this.field_c.secondaryKey == this.field_m) {
            var3 = this.field_c;
            this.field_c = this.field_c.secondaryNext;
            return var3;
          }
          this.field_c = this.field_c.secondaryNext;
        }
        if (obfuscationGuard >= -12) {
          return (DualLinkNode) null;
        }
        this.field_c = null;
        return null;
    }

    final static void g(int param0) {
        if (param0 != -1) {
          field_b = (Sprite[]) null;
          ff.a(true, kf.field_a, (byte) -97, on.field_d);
          NodeHashTable.field_h = true;
          return;
        }
        ff.a(true, kf.field_a, (byte) -97, on.field_d);
        NodeHashTable.field_h = true;
    }

    final static int b(int param0) {
        if (param0 != 25117) {
          return -35;
        }
        return ih.field_b;
    }

    final static void a(int param0, boolean param1, int param2) {
        wa var3 = null;
        ne var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        wa var3Lifetime1;
        ne var4Lifetime1;
        String var5_ref_StringLifetime1;
        ne var4Lifetime2;
        ne var4Lifetime1Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param0 != 1) {
          field_j = (String) null;
          var3 = bj.a(param1, -3, param2);
          if (var3 != null) {
            eo.field_c.a((byte) 72, false);
            var4 = eo.field_c;
            var5_ref_String = Js5NetworkRequest.field_z;
            var4.field_l.a(5, var5_ref_String, (byte) -26);
            var4Lifetime2 = eo.field_c;
            var5 = pb.field_h;
            var6 = ja.field_s;
            var4Lifetime2.field_l.a(0, 0, param0 - 29467, var6, var5);
          }
          FrameClock.a(param2, param1, false);
          return;
        }
        var3Lifetime1 = bj.a(param1, -3, param2);
        if (var3Lifetime1 != null) {
          eo.field_c.a((byte) 72, false);
          var4Lifetime1 = eo.field_c;
          var5_ref_StringLifetime1 = Js5NetworkRequest.field_z;
          var4Lifetime1.field_l.a(5, var5_ref_StringLifetime1, (byte) -26);
          var4Lifetime1Lifetime1 = eo.field_c;
          var5Lifetime1 = pb.field_h;
          var6Lifetime1 = ja.field_s;
          var4Lifetime1Lifetime1.field_l.a(0, 0, param0 - 29467, var6Lifetime1, var5Lifetime1);
        }
        FrameClock.a(param2, param1, false);
    }

    final static ri a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        ri stackIn_3_0 = null;
        ri stackIn_7_0 = null;
        ri stackIn_11_0 = null;
        ri stackIn_21_0 = null;
        ri stackIn_25_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param0.length();
          if (param1 != 45) {
            stackIn_3_0 = (ri) null;
            return stackIn_3_0;
          }
          if (var2_int == 0) {
            stackIn_7_0 = uh.field_i;
            return stackIn_7_0;
          }
          if (var2_int > 63) {
            stackIn_11_0 = b.field_e;
            return stackIn_11_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (0 == var3 ||
                var3 == var2_int - 1) {
                stackIn_21_0 = IntKeyLookup.field_b;
                return stackIn_21_0;
              }
            } else {
              if (-1 == AudioService.field_e.indexOf(var4)) {
                stackIn_25_0 = IntKeyLookup.field_b;
                return stackIn_25_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("mo.K(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_l = null;
        if (param0 != 0) {
          IntrusiveNodeHashTable.b(31);
          field_d = null;
          field_j = null;
          field_a = null;
          field_f = null;
          field_b = null;
          field_g = null;
          field_o = null;
          return;
        }
        field_d = null;
        field_j = null;
        field_a = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_o = null;
    }

    final void put(DualLinkNode node, long key, byte obfuscationGuard) {
        DualLinkNode var5 = null;
        try {
          if (null != node.secondaryPrevious) {
            node.unlinkSecondary((byte) 88);
          }
          var5 = this.buckets[(int)((long)(this.bucketCount - 1) & key)];
          node.secondaryPrevious = var5.secondaryPrevious;
          node.secondaryNext = var5;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
          if (obfuscationGuard <= 106) {
            IntrusiveNodeHashTable.a(109, true, 64);
          }
          node.secondaryKey = key;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "mo.I(" + (node != null ? "{...}" : "null") + ',' + key + ',' + obfuscationGuard + ')');
        }
    }

    final DualLinkNode get(long key, byte obfuscationGuard) {
        DualLinkNode var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_m = key;
        DualLinkNode var4 = this.buckets[(int)(key & (long)(this.bucketCount - 1))];
        this.field_c = var4.secondaryNext;
        while (var4 != this.field_c) {
          if (key == this.field_c.secondaryKey) {
            var5 = this.field_c;
            this.field_c = this.field_c.secondaryNext;
            return var5;
          }
          this.field_c = this.field_c.secondaryNext;
        }
        if (obfuscationGuard > -61) {
          return (DualLinkNode) null;
        }
        this.field_c = null;
        return null;
    }

    IntrusiveNodeHashTable(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.traversalIndex = 0;
        this.bucketCount = param0;
        this.buckets = new DualLinkNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.secondaryNext = var3;
          var3.secondaryPrevious = var3;
        }
    }

    final static void e(int param0) {
        fk var1 = null;
        int var2 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        fk var1Lifetime1;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          oh.field_k.serviceOutput();
          lf.field_a.serviceOutput();
          if (param0 != 200) {
            field_a = (Sprite[]) null;
          }
          ja.field_u = ja.field_u - 1;
          if (ja.field_u == 0) {
            ja.field_u = 200;
            var1 = (fk) (qn.field_mb.first(12623));
            while (var1 != null) {
              if (!var1.field_n.isLinked((byte) -93)) {
                var1.unlink(true);
              }
              var1 = (fk) (qn.field_mb.next(0));
            }
            if (he.field_f != null) {
              var1Lifetime1 = (fk) (he.field_f.first(12623));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_n.isLinked((byte) -44)) {
                  var1Lifetime1.unlink(true);
                }
                var1Lifetime1 = (fk) (he.field_f.next(0));
              }
            }
          }
          if (null != GrowableIntList.field_h) {
            stackIn_19_0 = GrowableIntList.field_h.e((byte) -8);
            if (!stackIn_19_0) {
              f.field_g = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1_ref), "mo.J(" + param0 + ')');
        }
    }

    static {
        field_l = "You have fallen into the water! Falling into the water will cause you to cast an emergency Arcane Gate spell, even if it is not in your spellbook. If that is the case, you will lose half of your current health, so try to avoid it. You will not lose health if the Arcane Gate spell is ready to cast in your spellbook.";
        field_d = "Sandbox";
        field_p = -1;
        field_g = "Accept rematch";
        field_j = "Quick Chat Help";
    }
}
