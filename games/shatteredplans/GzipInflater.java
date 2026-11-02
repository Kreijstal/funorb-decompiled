/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipInflater {
    static int[] field_f;
    static int field_c;
    private java.util.zip.Inflater field_g;
    static int field_i;
    static int field_e;
    static String field_h;
    static boolean field_d;
    static String field_a;
    static String field_b;

    public GzipInflater() {
        this(-1, 1000000, 1000000);
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_43_0 = false;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_42_0;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ve var6 = null;
        String var7 = null;
        ve var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        ve var6Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = sa.field_a;
          var2 = var1.readUnsignedByte(-64);
          if (var2 == 0) {
            if (CipherPacketBuffer.field_m == null) {
              CipherPacketBuffer.field_m = new SecondaryNodeHashTable(128);
              oi.field_e = 0;
            }
            stackIn_11_0 = (1 != var1.readUnsignedByte(-65)) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.readString(-1);
            if (var3_int != 0) {
              var5 = var1.readString(-1);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = di.a(var4_ref_String, 124);
            var7 = var1.readString(-1);
            var8 = ji.a((CharSequence) ((Object) var4_ref_String), true);
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = di.a(var7, 124);
              if (null != var6) {
                CipherPacketBuffer.field_m.a((long)var8.hashCode(), var6, true);
              }
            }
            if (null == var6) {
              var6 = new ve();
              CipherPacketBuffer.field_m.a((long)var8.hashCode(), var6, param0);
              fieldTemp$0 = oi.field_e;
              oi.field_e = oi.field_e + 1;
              var6.field_zb = fieldTemp$0;
              FrameTimer.field_b.addLast((byte) -113, var6);
            }
            var6.field_Eb = var5;
            var6.field_Ab = var4_ref_String;
            var6.field_Bb = var7;
            return;
          }
          if (1 != var2) {
            if (!param0) {
              field_i = 92;
            }
            if (2 == var2) {
              if (po.field_b == 1) {
                po.field_b = 2;
              }
              return;
            }
            if (3 == var2) {
              if (2 == po.field_b) {
                po.field_b = 1;
              }
              return;
            }
            if (var2 != 4) {
              GameKeyHandler.a(-29901, (Throwable) null, "F1: " + Dialog.a(16738));
              q.g(-101);
              return;
            }
            po.field_b = 1;
            var3 = var1.readString(-1);
            jo.field_d = ((String) (var3)).intern();
            var4 = var1.readUnsignedByte(-71);
            os.a(-82, var4);
            return;
          }
          if (BattleEvent.field_q == null) {
            BattleEvent.field_q = new SecondaryNodeHashTable(128);
            r.field_c = 0;
          }
          var3Lifetime1 = var1.readString(-1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readString(-1);
          var5Lifetime1 = var1.readString(-1);
          var6Lifetime1 = hb.a((byte) -90, var4_ref_StringLifetime1);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = hb.a((byte) -90, var5Lifetime1);
            if (null != var6Lifetime1) {
              BattleEvent.field_q.a((long)ji.a((CharSequence) ((Object) var4_ref_StringLifetime1), param0).hashCode(), var6Lifetime1, true);
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new ve();
            BattleEvent.field_q.a((long)ji.a((CharSequence) ((Object) var4_ref_StringLifetime1), true).hashCode(), var6Lifetime1, true);
            fieldTemp$1 = r.field_c;
            r.field_c = r.field_c + 1;
            var6Lifetime1.field_zb = fieldTemp$1;
            vd.field_j.addLast((byte) -113, var6Lifetime1);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Ab = var4_ref_StringLifetime1;
          var6Lifetime1.field_xb = (String) (var3Lifetime1);
          var6Lifetime1.field_Bb = var5Lifetime1;
          var6Lifetime1.unlink((byte) -125);
          var7_ref = (ve) (vd.field_j.startForward(0));
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7_ref != null) {
              stackOut_42_0 = d.a(var7_ref, var6Lifetime1, (byte) -81);
              stackIn_50_0 = stackOut_42_0 ? 1 : 0;
              stackIn_43_0 = stackOut_42_0;
              decompiledFrameRemainder0 = (var9 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_43_0)) {
                var7_ref = (ve) (vd.field_j.nextForward((byte) -71));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var7_ref == null) {
                break scanLoop1;
              }
              stackIn_50_0 = -126;
            }
            wp.$cfr$intArgs$a$2661ebe01e52(stackIn_50_0, var6Lifetime1, var7_ref);
            if (var9 == 0) {
              return;
            }
            break;
          }
          vd.field_j.addLast((byte) -113, var6Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "s.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        UsernameAvailabilityValidator.a(-1, FullscreenFocusCanvas.field_a, 5);
        if (param0 != 1) {
          return;
        }
        try {
          UsernameAvailabilityValidator.a(param0 ^ -2, bg.field_c, 8);
          if (!AttackTask.d((byte) 104)) {
            UsernameAvailabilityValidator.a(-1, IterableNodeHashTable.field_h, 1);
            UsernameAvailabilityValidator.a(-1, SecondaryNodeDeque.field_b, 2);
            UsernameAvailabilityValidator.a(param0 ^ -2, hr.field_e, 3);
            UsernameAvailabilityValidator.a(param0 ^ -2, lm.field_e, 4);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "s.C(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          field_a = null;
          field_h = null;
          field_b = null;
          field_f = null;
          if (param0 != 114) {
            field_e = 10;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "s.D(" + param0 + ')');
        }
    }

    private GzipInflater(int param0, int param1, int param2) {
    }

    final void a(byte[] param0, PacketBuffer param1, int param2) {
        try {
          Exception exception = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          try {
            if (param1.payload[param1.position] == 31 &&
              param1.payload[1 + param1.position] == -117) {
              if (null == this.field_g) {
                this.field_g = new java.util.zip.Inflater(true);
              }
              try {
                this.field_g.setInput(param1.payload, param1.position + 10, -10 - (param1.position + 8) + param1.payload.length);
                this.field_g.inflate(param0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_g.reset();
                throw new RuntimeException("");
              }
              this.field_g.reset();
              if (param2 != 5591) {
                GzipInflater.a(-110);
              }
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var4;
            stackIn_19_1 = new StringBuilder().append("s.B(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
            if (param1 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = -1;
        field_f = new int[4];
        field_h = "Message lobby";
        field_a = "Security";
        field_b = "<%0> has withdrawn the request to join.";
    }
}
