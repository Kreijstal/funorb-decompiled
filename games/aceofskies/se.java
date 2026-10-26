/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String field_a;
    static RendererBitmapFont bigGameFont;
    static int field_b;

    public static void a(byte param0) {
        try {
          int var1_int = -15 / ((param0 - 79) / 44);
          field_a = null;
          bigGameFont = null;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "se.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        int stackIn_67_0 = 0;
        boolean var8 = (AceOfSkies.obfuscationControl);
        try {
          if (param0 > -64) {
            se.a((byte) -70);
          }
          CipherPacketBuffer var1 = IntKeyLookup.incomingPacket;
          int var2 = var1.readUnsignedByte(-58);
          if (var2 == 0) {
            if (gi.field_g == null) {
              gi.field_g = new es(128);
              hl.field_a = 0;
            }
            boolean stackIn_15_0 = !(1 != var1.readUnsignedByte(-60));
            boolean var3_int = stackIn_15_0;
            String var4_ref_String = var1.readNullTerminatedText(-17883);
            if (var3_int) {
              var1.readNullTerminatedText(-17883);
            }
            cl var5 = fg.a(var4_ref_String, 17680);
            String var6 = var1.readNullTerminatedText(-17883);
            String var7 = vu.normalizePlayerName(125, (CharSequence) ((Object) var4_ref_String));
            if (var7 == null) {
              var7 = var4_ref_String;
            }
            if (null == var5) {
              var5 = fg.a(var6, 17680);
              if (null != var5) {
                gi.field_g.a(var5, (long)var7.hashCode(), (byte) 56);
              }
            }
            if (var5 == null) {
              var5 = new cl();
              gi.field_g.a(var5, (long)var7.hashCode(), (byte) 56);
              int fieldTemp$0 = hl.field_a;
              hl.field_a = hl.field_a + 1;
              var5.field_cb = fieldTemp$0;
              nh.field_d.addLast(75, var5);
            }
            var5.field_I = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (2 == var2) {
              if (eo.field_a == 1) {
                eo.field_a = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (2 == eo.field_a) {
                eo.field_a = 1;
              }
              return;
            }
            if (var2 != 4) {
              v.a("F1: " + CipherPacketBuffer.k((byte) 65), (byte) -52, (Throwable) null);
              te.b(true);
              return;
            }
            eo.field_a = 1;
            Object var3 = var1.readNullTerminatedText(-17883);
            ul.field_s = ((String) (var3)).intern();
            int var4 = var1.readUnsignedByte(-46);
            lg.a(var4, 2);
            return;
          }
          if (null == pj.field_a) {
            pj.field_a = new es(128);
            wo.field_o = 0;
          }
          Object var3Lifetime1 = var1.readNullTerminatedText(-17883);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          String var4_ref_StringLifetime1 = var1.readNullTerminatedText(-17883);
          String var5_ref = var1.readNullTerminatedText(-17883);
          cl var6_ref = kg.a(var4_ref_StringLifetime1, (byte) 61);
          if (null == var6_ref) {
            var6_ref = kg.a(var5_ref, (byte) 61);
            if (var6_ref != null) {
              pj.field_a.a(var6_ref, (long)vu.normalizePlayerName(126, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), (byte) 56);
            }
          }
          if (var6_ref == null) {
            var6_ref = new cl();
            pj.field_a.a(var6_ref, (long)vu.normalizePlayerName(126, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), (byte) 56);
            int fieldTemp$1 = wo.field_o;
            wo.field_o = wo.field_o + 1;
            var6_ref.field_cb = fieldTemp$1;
            SoundPlayback.field_f.addLast(71, var6_ref);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.field_bb = (String) (var3Lifetime1);
          var6_ref.field_I = var4_ref_StringLifetime1;
          var6_ref.unlink(-123);
          cl var7_ref = (cl) (SoundPlayback.field_f.first(268435455));
          scanLoop1: while (true) {
            if (var7_ref != null) {
              boolean stackOut_56_0 = cs.a(var7_ref, -115, var6_ref);
              stackIn_67_0 = stackOut_56_0 ? 1 : 0;
              boolean stackIn_57_0 = stackOut_56_0;
              if (var8) {
                break scanLoop1;
              }
              if (stackIn_57_0) {
                var7_ref = (cl) (SoundPlayback.field_f.next((byte) 103));
                continue;
              }
            }
            if (null == var7_ref) {
              SoundPlayback.field_f.addLast(120, var6_ref);
              if (!var8) {
                return;
              }
            }
            stackIn_67_0 = -20;
            break;
          }
          ml.$cfr$intArgs$a$9910ad98b3f5(stackIn_67_0, var7_ref, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1_ref), "se.B(" + param0 + ')');
        }
    }

    static {
    }
}
