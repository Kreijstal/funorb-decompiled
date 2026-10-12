/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchConditionEntry extends IntrusiveNode {
    MatchCondition condition;
    static pf field_l;
    static int[][] field_o;
    static CombatViewTransition field_p;
    static IndexedSprite field_n;
    static int field_k;

    final static int a(int param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 94) {
            MatchConditionEntry.a((byte) -104);
          }
          stackIn_4_0 = param0 + (so.field_b.field_g - se.field_a >> 1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2), "u.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_56_0 = false;
        int stackIn_63_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_55_0;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        hl var6 = null;
        hl var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        hl var6Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var1 = ByteStorage.field_e;
          var2 = var1.readUnsignedByte(0);
          if (var2 == 0) {
            if (null == bk.field_a) {
              bk.field_a = new tp(128);
              vg.field_p = 0;
            }
            stackIn_12_0 = (1 != var1.readUnsignedByte(0)) ? 0 : 1;
            var3_int = stackIn_12_0;
            var4_ref_String = var1.g(1);
            if (var3_int == 0) {
              var5 = var4_ref_String;
            }
            if (var3_int != 0 ||
              var9 != 0) {
              var5 = var1.g(1);
            }
            var6 = db.a(var4_ref_String, -124);
            var7_ref = var1.g(1);
            var8 = k.a((CharSequence) ((Object) var4_ref_String), false);
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = db.a(var7_ref, param0 - 47);
              if (null != var6) {
                bk.field_a.a(-1, (long)var8.hashCode(), var6);
              }
            }
            if (null == var6) {
              var6 = new hl();
              bk.field_a.a(-1, (long)var8.hashCode(), var6);
              fieldTemp$1 = vg.field_p;
              vg.field_p = vg.field_p + 1;
              var6.field_Ob = fieldTemp$1;
              ot.field_E.addLast((byte) -119, (IntrusiveNode) (var6));
            }
            var6.field_Nb = var7_ref;
            var6.field_Pb = var5;
            var6.field_Mb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (th.field_a == 1) {
                th.field_a = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (th.field_a == 2) {
                th.field_a = 1;
              }
              return;
            }
            if (param0 != 1) {
              MatchConditionEntry.a((byte) -118);
            }
            if (var2 != 4) {
              af.a((Throwable) null, -66, "F1: " + CampaignProgress.b(false));
              dj.a((byte) -125);
              return;
            }
            th.field_a = 1;
            var3 = var1.g(1);
            vl.field_p = ((String) (var3)).intern();
            var4 = var1.readUnsignedByte(0);
            im.b(var4, param0 - 27499);
            return;
          }
          if (DiskCacheRequest.field_K == null) {
            DiskCacheRequest.field_K = new tp(128);
            dj.field_a = 0;
          }
          var3Lifetime1 = var1.g(1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.g(1);
          var5Lifetime1 = var1.g(1);
          var6Lifetime1 = lg.a(var4_ref_StringLifetime1, (byte) -34);
          if (null == var6Lifetime1) {
            var6Lifetime1 = lg.a(var5Lifetime1, (byte) -34);
            if (null != var6Lifetime1) {
              DiskCacheRequest.field_K.a(-1, (long)k.a((CharSequence) ((Object) var4_ref_StringLifetime1), false).hashCode(), var6Lifetime1);
            }
          }
          if (var6Lifetime1 == null) {
            var6Lifetime1 = new hl();
            DiskCacheRequest.field_K.a(-1, (long)k.a((CharSequence) ((Object) var4_ref_StringLifetime1), false).hashCode(), var6Lifetime1);
            fieldTemp$0 = dj.field_a;
            dj.field_a = dj.field_a + 1;
            var6Lifetime1.field_Ob = fieldTemp$0;
            wh.field_c.addLast((byte) -119, (IntrusiveNode) (var6Lifetime1));
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Ib = (String) (var3Lifetime1);
          var6Lifetime1.field_Nb = var5Lifetime1;
          var6Lifetime1.field_Mb = var4_ref_StringLifetime1;
          var6Lifetime1.unlink(-124);
          var7 = (hl) (wh.field_c.first((byte) 111));
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != var7) {
              stackOut_55_0 = wd.a(false, var6Lifetime1, var7);
              stackIn_63_0 = stackOut_55_0 ? 1 : 0;
              stackIn_56_0 = stackOut_55_0;
              decompiledFrameRemainder0 = (var9 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_56_0)) {
                var7 = (hl) (wh.field_c.next((byte) 123));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null == var7) {
                break scanLoop1;
              }
              stackIn_63_0 = -123;
            }
            fj.$cfr$intArgs$a$f94c566f195c(stackIn_63_0, var6Lifetime1, var7);
            if (var9 == 0) {
              return;
            }
            break;
          }
          wh.field_c.addLast((byte) -119, (IntrusiveNode) (var6Lifetime1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var1_ref), "u.B(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 >= -102) {
            MatchConditionEntry.a(62, (byte) -42);
          }
          field_n = null;
          field_p = null;
          field_l = null;
          field_o = (int[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var1), "u.A(" + param0 + ')');
        }
    }

    MatchConditionEntry(MatchCondition condition) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.condition = condition;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("u.<init>(");
          if (condition == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_l = new pf("");
        field_o = new int[][]{new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 180}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}};
    }
}
