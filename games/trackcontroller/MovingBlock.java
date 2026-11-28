/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MovingBlock extends IntrusiveNode {
    int rowStep;
    static String field_k;
    static String[] field_p;
    int columnStep;
    static int field_q;
    int column;
    private int speed;
    int row;
    static byte[][][] field_i;
    int tileValue;
    int progress;

    final static IndexedSprite[] d(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        IndexedSprite[] var1 = new IndexedSprite[gi.field_o];
        int var2 = 0;
        int var3 = 112 / ((-44 - param0) / 39);
        while (var2 < gi.field_o) {
          var1[var2] = new IndexedSprite(ab.field_a, CrossfadingMidiPcmStream.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], qk.field_M[var2], CrossfadingMidiPcmStream.field_z);
          var2++;
        }
        ff.b(112);
        return var1;
    }

    public static void clearStaticReferences(byte param0) {
        field_i = (byte[][][]) null;
        field_k = null;
        int var1 = 56 % ((-65 - param0) / 40);
        field_p = null;
    }

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (r.field_i != null && (param1 < 0 ||
            jc.field_a == ka.field_b)) {
            if (param0 != -1) {
              return;
            }
            if (LevelView.field_C.position == 0 &&
              qg.correctedCurrentTimeMillis(false) > qh.field_f + 10000L) {
              LevelView.field_C.writeCipheredByte(param1, param0 + 8);
            }
            if (0 < LevelView.field_C.position) {
              try {
                r.field_i.a(param0 - 124, LevelView.field_C.payload, LevelView.field_C.position, 0);
                qh.field_f = qg.correctedCurrentTimeMillis(false);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                GameKeyHandler.a((byte) 118);
              }
              LevelView.field_C.position = 0;
            }
            return;
          }
          LevelView.field_C.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void completeStep(int param0) {
        this.progress = param0;
        this.column = this.column + this.columnStep;
        this.row = this.row + this.rowStep;
    }

    final static void a(dh param0, int param1, int param2) {
        BitPacketBuffer var5 = null;
        int var4 = 0;
        try {
          if (param1 != 0) {
            field_p = (String[]) null;
          }
          var5 = LevelView.field_C;
          var5.writeCipheredByte(param2, 7);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(1, (byte) -59);
          var5.writeByte(param0.field_k, (byte) -61);
          var5.writeSignedSmart(param1 ^ 16, param0.field_q);
          var5.writeInt(false, param0.field_n);
          var5.writeInt(false, param0.field_o);
          var5.writeInt(false, param0.field_j);
          var5.writeInt(false, param0.field_m);
          var5.appendCrc32(var4, false);
          var5.backpatchByteLength(true, -var4 + var5.position);
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "me.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean advance(int param0) {
        int var2 = -3 % ((0 - param0) / 34);
        this.progress = this.progress + this.speed;
        return this.progress < 26 ? true : false;
    }

    final static int a(String param0, boolean param1, int param2, kh param3, int param4, int param5, kh param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        PacketBuffer stackIn_17_0 = null;
        String stackIn_18_1 = null;
        PacketBuffer stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var10_ref_String = null;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          var14 = param3.b(-108);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param6.b(-117);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (null == r.field_i &&
            !WhirlpoolDigest.a(false, (byte) 106)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (jc.field_a == gk.field_a) {
            qi.field_c = null;
            LevelView.field_C.position = 0;
            if (param0 == null) {
              PasswordValidator.field_p.position = 0;
              PasswordValidator.field_p.writeInt(false, ta.field_c.nextInt());
              PasswordValidator.field_p.writeInt(false, ta.field_c.nextInt());
              stackIn_17_0 = PasswordValidator.field_p;
              if (param3.a(-107)) {
                stackIn_18_1 = var14;
              } else {
                stackIn_18_1 = "";
              }
              ((PacketBuffer) (Object) stackIn_17_0).writePrefixedString(stackIn_18_1, 115);
              stackIn_20_0 = PasswordValidator.field_p;
              if (!param6.a(-46)) {
                stackIn_21_1 = "";
              } else {
                stackIn_21_1 = var8;
              }
              ((PacketBuffer) (Object) stackIn_20_0).writePrefixedString(stackIn_21_1, 112);
              LevelView.field_C.writeByte(16, (byte) -87);
              LevelView.field_C.position = LevelView.field_C.position + 1;
              var9 = LevelView.field_C.position;
              NodeHashTableIterator.a(sc.field_d, LevelView.field_C, fj.field_N, 0, PasswordValidator.field_p);
              LevelView.field_C.backpatchByteLength(true, -var9 + LevelView.field_C.position);
            } else {
              var9 = 0;
              PasswordValidator.field_p.position = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              PasswordValidator.field_p.writeInt(false, ta.field_c.nextInt());
              PasswordValidator.field_p.writeInt(false, ta.field_c.nextInt());
              PasswordValidator.field_p.writePrefixedString(var14, 106);
              PasswordValidator.field_p.writePrefixedString(var8, 124);
              var15 = (CharSequence) ((Object) param0);
              PasswordValidator.field_p.writePrefixedString(qk.a(-128, var15), 119);
              PasswordValidator.field_p.writeShort(param4, (byte) -119);
              PasswordValidator.field_p.writeByte(param2, (byte) -98);
              PasswordValidator.field_p.writeByte(var9, (byte) -66);
              LevelView.field_C.writeByte(18, (byte) -92);
              LevelView.field_C.position = LevelView.field_C.position + 2;
              var10 = LevelView.field_C.position;
              var11_ref_StringLifetime4 = bg.a(CachedArchiveSource.b((byte) 77), -22004);
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              LevelView.field_C.writeString((byte) -57, var11_ref_StringLifetime4);
              NodeHashTableIterator.a(sc.field_d, LevelView.field_C, fj.field_N, 0, PasswordValidator.field_p);
              LevelView.field_C.backpatchShortLength(-var10 + LevelView.field_C.position, (byte) -96);
            }
            MovingBlock.a(-1, -1);
            jc.field_a = EmailFormatValidator.field_m;
          }
          if (jc.field_a == EmailFormatValidator.field_m &&
            DiskArchiveStore.a(1, false)) {
            var9Lifetime1 = ne.field_a.readUnsignedByte(16383);
            ne.field_a.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              ca.field_a = new String[var9Lifetime1 - 100];
              jc.field_a = kl.field_a;
            } else {
              if (var9Lifetime1 == 248) {
                ob.a(209, CachedArchiveSource.b((byte) 77));
                TextHotspotBounds.field_t = gh.field_c;
                GameKeyHandler.a((byte) 125);
                kg.field_f = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (var9Lifetime1 == 99) {
                DiskArchiveStore.a(TextLineMetrics.a(93), false);
                qi.field_c = new Boolean(bg.a(ne.field_a, -2));
                ne.field_a.position = 0;
              } else {
                uk.field_c = var9Lifetime1;
                jc.field_a = sf.field_D;
                ConfirmedEmailAvailabilityValidator.field_o = -1;
              }
            }
          }
          if (kl.field_a == jc.field_a) {
            var9Lifetime2 = 2;
            if (DiskArchiveStore.a(var9Lifetime2, false)) {
              var10Lifetime1 = ne.field_a.readUnsignedShort((byte) -94);
              ne.field_a.position = 0;
              if (DiskArchiveStore.a(var10Lifetime1, false)) {
                var11 = ca.field_a.length;
                for (var12 = 0; var11 > var12; var12++) {
                  ca.field_a[var12] = ne.field_a.readPrefixedString(-1);
                }
                GameKeyHandler.a((byte) 121);
                kg.field_f = false;
                stackIn_45_0 = var11 + 100;
                return stackIn_45_0;
              }
            }
          }
          var9Lifetime3 = 77 / ((param5 - 31) / 47);
          if (jc.field_a == sf.field_D &&
            ByteStorage.a(520)) {
            if (255 == uk.field_c) {
              var10_ref_String = ne.field_a.readOptionalString(19016);
              if (var10_ref_String != null) {
                dh.a(-19136, var10_ref_String, CachedArchiveSource.b((byte) 77));
              }
            } else {
              TextHotspotBounds.field_t = ne.field_a.readString(0);
            }
            GameKeyHandler.a((byte) 115);
            kg.field_f = false;
            stackIn_55_0 = uk.field_c;
            return stackIn_55_0;
          }
          if (null == r.field_i) {
            if (kg.field_f) {
              if (bj.b(-21676) <= 30000L) {
                TextHotspotBounds.field_t = cf.field_m;
              } else {
                TextHotspotBounds.field_t = nk.field_j;
              }
              kg.field_f = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var10Lifetime2 = ke.field_c;
            ke.field_c = ma.field_c;
            ma.field_c = var10Lifetime2;
            kg.field_f = true;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("me.E(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    final static byte[] extractBytes(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ByteStorage var4 = null;
        byte[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 22692) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          if (param2 == null) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (!(param2 instanceof byte[])) {
            if (!(param2 instanceof ByteStorage)) {
              throw new IllegalArgumentException();
            }
            var4 = (ByteStorage) (param2);
            stackIn_15_0 = var4.getBytes((byte) -2);
            return stackIn_15_0;
          }
          var3 = (byte[]) (param2);
          if (!param0) {
            stackIn_12_0 = var3;
            return stackIn_12_0;
          }
          stackIn_10_0 = qd.copyBytes(var3, (byte) 102);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("me.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    MovingBlock(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.columnStep = param4;
        this.column = param2;
        this.speed = param5;
        this.tileValue = param0;
        this.row = param1;
        this.rowStep = param3;
    }

    static {
        field_p = new String[]{"<col=6>Track.</col><br>Push these blocks of track to assemble the model railway exhibits.", "<col=6>Immovable obstacle.</col><br>The walls of the exhibition hall. Obviously these can't be moved.", "<col=6>Smooth floor.</col><br>Track pushed onto this will continue to slide.", "<col=6>Conveyor belt.</col><br>This will push track in the direction indicated. You can push track across the belt and walk onto it, but not against it."};
        field_k = "Close";
    }
}
