/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_b;
    static int field_c;
    static int[] field_a;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          field_a = (int[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final synchronized static byte[] b(int param0, int param1) {
        int fieldTemp$22 = 0;
        int fieldTemp$19 = 0;
        int dupTemp$20 = 0;
        byte[][] arrayValue$21 = null;
        int fieldTemp$18 = 0;
        int dupTemp$13 = 0;
        byte[][] arrayValue$14 = null;
        int fieldTemp$17 = 0;
        int dupTemp$15 = 0;
        byte[][] arrayValue$16 = null;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int fieldTemp$10 = 0;
        int dupTemp$11 = 0;
        byte[][] arrayValue$12 = null;
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2;
        int var2_int;
        byte[] var3;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var2_intLifetime4;
        int var2_intLifetime5;
        int var2_intLifetime1Lifetime1;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var3Lifetime4;
        byte[] var3Lifetime5;
        byte[] var3Lifetime1Lifetime1;
        if (param0 == 100) {
          if (mf.field_c > 0) {
            fieldTemp$22 = mf.field_c - 1;
            mf.field_c = mf.field_c - 1;
            var2 = f.field_b[fieldTemp$22];
            f.field_b[mf.field_c] = null;
            return var2;
          }
          if (param0 != 5000) {
            if (param1 == ~param0 &&
              0 < NodeHashTableIterator.field_e) {
              fieldTemp$19 = NodeHashTableIterator.field_e - 1;
              NodeHashTableIterator.field_e = NodeHashTableIterator.field_e - 1;
              var2Lifetime4 = DiskArchiveStore.field_b[fieldTemp$19];
              DiskArchiveStore.field_b[NodeHashTableIterator.field_e] = null;
              return var2Lifetime4;
            }
            if (null == MovingBlock.field_i) {
              return new byte[param0];
            }
            for (var2_int = 0; sa.field_R.length > var2_int; var2_int++) {
              if (param0 == sa.field_R[var2_int] &&
                ai.field_e[var2_int] > 0) {
                dupTemp$20 = ai.field_e[var2_int] - 1;
                arrayValue$21 = MovingBlock.field_i[var2_int];
                ai.field_e[var2_int] = dupTemp$20;
                var3 = arrayValue$21[dupTemp$20];
                MovingBlock.field_i[var2_int][ai.field_e[var2_int]] = null;
                return var3;
              }
            }
            return new byte[param0];
          }
          if (PacketBuffer.field_i > 0) {
            fieldTemp$18 = PacketBuffer.field_i - 1;
            PacketBuffer.field_i = PacketBuffer.field_i - 1;
            var2Lifetime5 = GameShell.field_z[fieldTemp$18];
            GameShell.field_z[PacketBuffer.field_i] = null;
            return var2Lifetime5;
          }
          if (param1 != ~param0) {
            if (null == MovingBlock.field_i) {
              return new byte[param0];
            }
            for (var2_intLifetime4 = 0; sa.field_R.length > var2_intLifetime4; var2_intLifetime4++) {
              if (param0 == sa.field_R[var2_intLifetime4] &&
                ai.field_e[var2_intLifetime4] > 0) {
                dupTemp$13 = ai.field_e[var2_intLifetime4] - 1;
                arrayValue$14 = MovingBlock.field_i[var2_intLifetime4];
                ai.field_e[var2_intLifetime4] = dupTemp$13;
                var3Lifetime4 = arrayValue$14[dupTemp$13];
                MovingBlock.field_i[var2_intLifetime4][ai.field_e[var2_intLifetime4]] = null;
                return var3Lifetime4;
              }
            }
            return new byte[param0];
          }
          if (0 < NodeHashTableIterator.field_e) {
            fieldTemp$17 = NodeHashTableIterator.field_e - 1;
            NodeHashTableIterator.field_e = NodeHashTableIterator.field_e - 1;
            var2Lifetime6 = DiskArchiveStore.field_b[fieldTemp$17];
            DiskArchiveStore.field_b[NodeHashTableIterator.field_e] = null;
            return var2Lifetime6;
          }
          if (null == MovingBlock.field_i) {
            return new byte[param0];
          }
          for (var2_intLifetime5 = 0; sa.field_R.length > var2_intLifetime5; var2_intLifetime5++) {
            if (param0 == sa.field_R[var2_intLifetime5] &&
              ai.field_e[var2_intLifetime5] > 0) {
              dupTemp$15 = ai.field_e[var2_intLifetime5] - 1;
              arrayValue$16 = MovingBlock.field_i[var2_intLifetime5];
              ai.field_e[var2_intLifetime5] = dupTemp$15;
              var3Lifetime5 = arrayValue$16[dupTemp$15];
              MovingBlock.field_i[var2_intLifetime5][ai.field_e[var2_intLifetime5]] = null;
              return var3Lifetime5;
            }
          }
          return new byte[param0];
        }
        if (param0 != 5000) {
          if (param1 != ~param0) {
            if (null == MovingBlock.field_i) {
              return new byte[param0];
            }
            for (var2_intLifetime1 = 0; sa.field_R.length > var2_intLifetime1; var2_intLifetime1++) {
              if (param0 == sa.field_R[var2_intLifetime1] &&
                ai.field_e[var2_intLifetime1] > 0) {
                dupTemp$8 = ai.field_e[var2_intLifetime1] - 1;
                arrayValue$9 = MovingBlock.field_i[var2_intLifetime1];
                ai.field_e[var2_intLifetime1] = dupTemp$8;
                var3Lifetime1 = arrayValue$9[dupTemp$8];
                MovingBlock.field_i[var2_intLifetime1][ai.field_e[var2_intLifetime1]] = null;
                return var3Lifetime1;
              }
            }
            return new byte[param0];
          }
          if (0 < NodeHashTableIterator.field_e) {
            fieldTemp$10 = NodeHashTableIterator.field_e - 1;
            NodeHashTableIterator.field_e = NodeHashTableIterator.field_e - 1;
            var2Lifetime1 = DiskArchiveStore.field_b[fieldTemp$10];
            DiskArchiveStore.field_b[NodeHashTableIterator.field_e] = null;
            return var2Lifetime1;
          }
          if (null == MovingBlock.field_i) {
            return new byte[param0];
          }
          for (var2_intLifetime1Lifetime1 = 0; sa.field_R.length > var2_intLifetime1Lifetime1; var2_intLifetime1Lifetime1++) {
            if (param0 == sa.field_R[var2_intLifetime1Lifetime1] &&
              ai.field_e[var2_intLifetime1Lifetime1] > 0) {
              dupTemp$11 = ai.field_e[var2_intLifetime1Lifetime1] - 1;
              arrayValue$12 = MovingBlock.field_i[var2_intLifetime1Lifetime1];
              ai.field_e[var2_intLifetime1Lifetime1] = dupTemp$11;
              var3Lifetime1Lifetime1 = arrayValue$12[dupTemp$11];
              MovingBlock.field_i[var2_intLifetime1Lifetime1][ai.field_e[var2_intLifetime1Lifetime1]] = null;
              return var3Lifetime1Lifetime1;
            }
          }
          return new byte[param0];
        }
        if (PacketBuffer.field_i > 0) {
          fieldTemp$2 = PacketBuffer.field_i - 1;
          PacketBuffer.field_i = PacketBuffer.field_i - 1;
          var2Lifetime2 = GameShell.field_z[fieldTemp$2];
          GameShell.field_z[PacketBuffer.field_i] = null;
          return var2Lifetime2;
        }
        if (param1 != ~param0) {
          if (null == MovingBlock.field_i) {
            return new byte[param0];
          }
          for (var2_intLifetime2 = 0; sa.field_R.length > var2_intLifetime2; var2_intLifetime2++) {
            if (param0 == sa.field_R[var2_intLifetime2] &&
              ai.field_e[var2_intLifetime2] > 0) {
              dupTemp$3 = ai.field_e[var2_intLifetime2] - 1;
              arrayValue$4 = MovingBlock.field_i[var2_intLifetime2];
              ai.field_e[var2_intLifetime2] = dupTemp$3;
              var3Lifetime2 = arrayValue$4[dupTemp$3];
              MovingBlock.field_i[var2_intLifetime2][ai.field_e[var2_intLifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param0];
        }
        if (0 < NodeHashTableIterator.field_e) {
          fieldTemp$5 = NodeHashTableIterator.field_e - 1;
          NodeHashTableIterator.field_e = NodeHashTableIterator.field_e - 1;
          var2Lifetime3 = DiskArchiveStore.field_b[fieldTemp$5];
          DiskArchiveStore.field_b[NodeHashTableIterator.field_e] = null;
          return var2Lifetime3;
        }
        if (null == MovingBlock.field_i) {
          return new byte[param0];
        }
        for (var2_intLifetime3 = 0; sa.field_R.length > var2_intLifetime3; var2_intLifetime3++) {
          if (param0 == sa.field_R[var2_intLifetime3] &&
            ai.field_e[var2_intLifetime3] > 0) {
            dupTemp$6 = ai.field_e[var2_intLifetime3] - 1;
            arrayValue$7 = MovingBlock.field_i[var2_intLifetime3];
            ai.field_e[var2_intLifetime3] = dupTemp$6;
            var3Lifetime3 = arrayValue$7[dupTemp$6];
            MovingBlock.field_i[var2_intLifetime3][ai.field_e[var2_intLifetime3]] = null;
            return var3Lifetime3;
          }
        }
        return new byte[param0];
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        GameStringTable var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 != -101) {
            ke.a(true);
          }
          var4 = (GameStringTable) (LevelData.field_t.first(2));
          while (var4 != null) {
            ef.a(var4, param1, param0 + 111);
            var4 = (GameStringTable) (LevelData.field_t.next(param0 + 111));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw LevelGrid.toClientException((Throwable) ((Object) var2), "ke.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Use this alternative as your account name";
        field_a = new int[12];
    }
}
