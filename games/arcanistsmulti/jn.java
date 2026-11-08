/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static String field_b;
    static int[] field_a;
    static int[] field_c;

    final static void a(byte param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        f var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var4 = (f) (cm.field_l.first(12623));
          while (var4 != null) {
            pb.a(32, param1, var4);
            var4 = (f) (cm.field_l.next(0));
          }
          if (param0 != -64) {
            field_c = (int[]) null;
          }
          var2 = hn.field_q.first(12623);
          while (var2 != null) {
            ik.a(param1, 0);
            var2 = hn.field_q.next(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "jn.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, boolean param1, int param2) {
        u.field_k = true;
        NodeHashTable.field_h = param1 ? true : false;
        vf.field_k = new ed(ClientException.field_b, go.field_k, param0, MusicPatchPcmStream.field_s, NodeHashTable.field_h);
        if (param2 != -1) {
          return;
        }
        try {
          ClientException.field_b.b(vf.field_k, 15637);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, kc param1, int param2, kc param3, byte[] param4, kc param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          qf.field_a = -1L;
          sa.field_Db = param9;
          in.field_Nb = param4;
          vf.field_l = param4.length;
          DirectByteStorage.field_f = null;
          om.field_x = null;
          MidiPcmStream.field_E = new byte[(7 + sa.field_Db) / 8];
          dn.field_Db = false;
          var10_int = 0;
          for (var11 = 0; var11 < in.field_Nb.length; var11++) {
            var10_int = var10_int + (in.field_Nb[var11] & 255);
          }
          var10_int = (var10_int + 7) / 8;
          ng.field_D = new byte[var10_int];
          if (param1.field_G == null) {
            param1.field_G = new IntrusiveDeque();
          }
          gm.field_j = param1.field_G;
          gm.field_j.clear(-124);
          bc.field_c = new IntrusiveNodeHashTable(param7);
          ki.field_q = 0;
          oe.field_b = 0;
          DelegatingCanvas.field_e = -1;
          sk.field_e = -1;
          if (null == param3.field_G) {
            param3.field_G = new IntrusiveDeque();
          }
          vh.field_a = param3.field_G;
          vh.field_a.clear(param2 + 13049);
          nk.field_q = new IntrusiveNodeHashTable(param6);
          if (null == param5.field_G) {
            param5.field_G = new IntrusiveDeque();
          }
          ph.field_a = param5.field_G;
          ph.field_a.clear(-124);
          kn.field_qb = new IntrusiveNodeHashTable(param8);
          PatchEnvelopeSet.field_a = 0L;
          if (param2 != -13173) {
            field_a = (int[]) null;
          }
          vd.field_i = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_17_0 = var10;
          stackIn_17_1 = new StringBuilder().append("jn.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 > -38) {
          jn.a((byte) 117, -75);
        }
        field_b = null;
    }

    static {
        field_b = "Living minions are vulnerable to being captured from death damage.<br>Undead minions absorb death damage, but light damage hurts them more.<br>Arcane minions can neither be healed or zombified.";
        field_a = new int[]{55, 56, 57};
    }
}
